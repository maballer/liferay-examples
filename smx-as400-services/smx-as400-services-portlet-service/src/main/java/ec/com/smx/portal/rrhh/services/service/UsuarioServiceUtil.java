package ec.com.smx.portal.rrhh.services.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Usuario. This utility wraps
 * {@link ec.com.smx.portal.rrhh.services.service.impl.UsuarioServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author maballe
 * @see UsuarioService
 * @see ec.com.smx.portal.rrhh.services.service.base.UsuarioServiceBaseImpl
 * @see ec.com.smx.portal.rrhh.services.service.impl.UsuarioServiceImpl
 * @generated
 */
public class UsuarioServiceUtil {
    private static UsuarioService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link ec.com.smx.portal.rrhh.services.service.impl.UsuarioServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    /**
    * Returns all the usuarios.
    *
    * @return the usuarios
    * @throws SystemException
    if a system exception occurred
    */
    public static java.util.List<ec.com.smx.portal.rrhh.services.model.Usuario> search()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().search();
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
    public static ec.com.smx.portal.rrhh.services.model.Usuario getUsuario(
        long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioException {
        return getService().getUsuario(usuarioId);
    }

    /**
    * Returns the number of usuarios.
    *
    * @return the number of usuarios
    * @throws SystemException
    if a system exception occurred
    */
    public static int count()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().count();
    }

    public static java.lang.String getHola(java.lang.String text) {
        return getService().getHola(text);
    }

    public static void clearService() {
        _service = null;
    }

    public static UsuarioService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    UsuarioService.class.getName());

            if (invokableService instanceof UsuarioService) {
                _service = (UsuarioService) invokableService;
            } else {
                _service = new UsuarioServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(UsuarioServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(UsuarioService service) {
    }
}
