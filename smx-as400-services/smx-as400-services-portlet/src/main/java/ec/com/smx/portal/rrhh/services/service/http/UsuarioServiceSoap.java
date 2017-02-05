package ec.com.smx.portal.rrhh.services.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import ec.com.smx.portal.rrhh.services.service.UsuarioServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link ec.com.smx.portal.rrhh.services.service.UsuarioServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link ec.com.smx.portal.rrhh.services.model.UsuarioSoap}.
 * If the method in the service utility returns a
 * {@link ec.com.smx.portal.rrhh.services.model.Usuario}, that is translated to a
 * {@link ec.com.smx.portal.rrhh.services.model.UsuarioSoap}. Methods that SOAP cannot
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
 * @see UsuarioServiceHttp
 * @see ec.com.smx.portal.rrhh.services.model.UsuarioSoap
 * @see ec.com.smx.portal.rrhh.services.service.UsuarioServiceUtil
 * @generated
 */
public class UsuarioServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(UsuarioServiceSoap.class);

    /**
    * Returns all the usuarios.
    *
    * @return the usuarios
    * @throws SystemException
    if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.UsuarioSoap[] search()
        throws RemoteException {
        try {
            java.util.List<ec.com.smx.portal.rrhh.services.model.Usuario> returnValue =
                UsuarioServiceUtil.search();

            return ec.com.smx.portal.rrhh.services.model.UsuarioSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns the usuario with the primary key or throws a
    * {@link ec.com.smx.portal.rrhh.services.NoSuchUsuarioException} if it
    * could not be found.
    *
    * @param usuarioId
    the primary key of the usuario
    * @return the usuario
    * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioException
    if a usuario with the primary key could not be found
    * @throws SystemException
    if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.UsuarioSoap getUsuario(
        long usuarioId) throws RemoteException {
        try {
            ec.com.smx.portal.rrhh.services.model.Usuario returnValue = UsuarioServiceUtil.getUsuario(usuarioId);

            return ec.com.smx.portal.rrhh.services.model.UsuarioSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Returns the number of usuarios.
    *
    * @return the number of usuarios
    * @throws SystemException
    if a system exception occurred
    */
    public static int count() throws RemoteException {
        try {
            int returnValue = UsuarioServiceUtil.count();

            return returnValue;
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static java.lang.String getHola(java.lang.String text)
        throws RemoteException {
        try {
            java.lang.String returnValue = UsuarioServiceUtil.getHola(text);

            return returnValue;
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}
