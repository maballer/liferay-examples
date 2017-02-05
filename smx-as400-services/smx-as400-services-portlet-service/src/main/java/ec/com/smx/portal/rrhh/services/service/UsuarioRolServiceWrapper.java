package ec.com.smx.portal.rrhh.services.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UsuarioRolService}.
 *
 * @author maballe
 * @see UsuarioRolService
 * @generated
 */
public class UsuarioRolServiceWrapper implements UsuarioRolService,
    ServiceWrapper<UsuarioRolService> {
    private UsuarioRolService _usuarioRolService;

    public UsuarioRolServiceWrapper(UsuarioRolService usuarioRolService) {
        _usuarioRolService = usuarioRolService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _usuarioRolService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _usuarioRolService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _usuarioRolService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public UsuarioRolService getWrappedUsuarioRolService() {
        return _usuarioRolService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedUsuarioRolService(UsuarioRolService usuarioRolService) {
        _usuarioRolService = usuarioRolService;
    }

    @Override
    public UsuarioRolService getWrappedService() {
        return _usuarioRolService;
    }

    @Override
    public void setWrappedService(UsuarioRolService usuarioRolService) {
        _usuarioRolService = usuarioRolService;
    }
}
