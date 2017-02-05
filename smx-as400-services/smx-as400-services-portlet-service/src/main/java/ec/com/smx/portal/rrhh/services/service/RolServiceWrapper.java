package ec.com.smx.portal.rrhh.services.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RolService}.
 *
 * @author maballe
 * @see RolService
 * @generated
 */
public class RolServiceWrapper implements RolService,
    ServiceWrapper<RolService> {
    private RolService _rolService;

    public RolServiceWrapper(RolService rolService) {
        _rolService = rolService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _rolService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _rolService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _rolService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
    * Returns all the rols.
    *
    * @return the rols
    * @throws SystemException
    if a system exception occurred
    */
    @Override
    public java.util.List<ec.com.smx.portal.rrhh.services.model.Rol> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rolService.findAll();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RolService getWrappedRolService() {
        return _rolService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRolService(RolService rolService) {
        _rolService = rolService;
    }

    @Override
    public RolService getWrappedService() {
        return _rolService;
    }

    @Override
    public void setWrappedService(RolService rolService) {
        _rolService = rolService;
    }
}
