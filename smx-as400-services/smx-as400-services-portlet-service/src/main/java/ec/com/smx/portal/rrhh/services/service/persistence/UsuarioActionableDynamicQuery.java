package ec.com.smx.portal.rrhh.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import ec.com.smx.portal.rrhh.services.model.Usuario;
import ec.com.smx.portal.rrhh.services.service.UsuarioLocalServiceUtil;

/**
 * @author maballe
 * @generated
 */
public abstract class UsuarioActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UsuarioActionableDynamicQuery() throws SystemException {
        setBaseLocalService(UsuarioLocalServiceUtil.getService());
        setClass(Usuario.class);

        setClassLoader(ec.com.smx.portal.rrhh.services.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("usuarioId");
    }
}
