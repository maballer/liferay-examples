package ec.com.smx.portal.rrhh.services.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import ec.com.smx.portal.rrhh.services.service.RolServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link ec.com.smx.portal.rrhh.services.service.RolServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link ec.com.smx.portal.rrhh.services.model.RolSoap}.
 * If the method in the service utility returns a
 * {@link ec.com.smx.portal.rrhh.services.model.Rol}, that is translated to a
 * {@link ec.com.smx.portal.rrhh.services.model.RolSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author maballe
 * @see RolServiceHttp
 * @see ec.com.smx.portal.rrhh.services.model.RolSoap
 * @see ec.com.smx.portal.rrhh.services.service.RolServiceUtil
 * @generated
 */
public class RolServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(RolServiceSoap.class);

    /**
    * Returns all the rols.
    *
    * @return the rols
    * @throws SystemException
    if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.RolSoap[] findAll()
        throws RemoteException {
        try {
            java.util.List<ec.com.smx.portal.rrhh.services.model.Rol> returnValue =
                RolServiceUtil.findAll();

            return ec.com.smx.portal.rrhh.services.model.RolSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}
