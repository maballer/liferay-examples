package ec.com.smx.portal.rrhh.services.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Rol. This utility wraps
 * {@link ec.com.smx.portal.rrhh.services.service.impl.RolServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author maballe
 * @see RolService
 * @see ec.com.smx.portal.rrhh.services.service.base.RolServiceBaseImpl
 * @see ec.com.smx.portal.rrhh.services.service.impl.RolServiceImpl
 * @generated
 */
public class RolServiceUtil {
    private static RolService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link ec.com.smx.portal.rrhh.services.service.impl.RolServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
    * Returns all the rols.
    *
    * @return the rols
    * @throws SystemException
    if a system exception occurred
    */
    public static java.util.List<ec.com.smx.portal.rrhh.services.model.Rol> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findAll();
    }

    public static void clearService() {
        _service = null;
    }

    public static RolService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    RolService.class.getName());

            if (invokableService instanceof RolService) {
                _service = (RolService) invokableService;
            } else {
                _service = new RolServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(RolServiceUtil.class, "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(RolService service) {
    }
}
