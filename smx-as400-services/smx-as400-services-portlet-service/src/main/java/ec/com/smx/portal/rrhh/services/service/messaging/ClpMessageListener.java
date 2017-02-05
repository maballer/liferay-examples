package ec.com.smx.portal.rrhh.services.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import ec.com.smx.portal.rrhh.services.service.ClpSerializer;
import ec.com.smx.portal.rrhh.services.service.RolLocalServiceUtil;
import ec.com.smx.portal.rrhh.services.service.RolServiceUtil;
import ec.com.smx.portal.rrhh.services.service.UsuarioLocalServiceUtil;
import ec.com.smx.portal.rrhh.services.service.UsuarioRolLocalServiceUtil;
import ec.com.smx.portal.rrhh.services.service.UsuarioRolServiceUtil;
import ec.com.smx.portal.rrhh.services.service.UsuarioServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            RolLocalServiceUtil.clearService();

            RolServiceUtil.clearService();
            UsuarioLocalServiceUtil.clearService();

            UsuarioServiceUtil.clearService();
            UsuarioRolLocalServiceUtil.clearService();

            UsuarioRolServiceUtil.clearService();
        }
    }
}
