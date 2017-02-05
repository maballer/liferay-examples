package ec.com.smx.portal.rrhh.services.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UsuarioService}.
 *
 * @author maballe
 * @see UsuarioService
 * @generated
 */
public class UsuarioServiceWrapper implements UsuarioService,
    ServiceWrapper<UsuarioService> {
    private UsuarioService _usuarioService;

    public UsuarioServiceWrapper(UsuarioService usuarioService) {
        _usuarioService = usuarioService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _usuarioService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _usuarioService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _usuarioService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
    * Returns all the usuarios.
    *
    * @return the usuarios
    * @throws SystemException
    if a system exception occurred
    */
    @Override
    public java.util.List<ec.com.smx.portal.rrhh.services.model.Usuario> search()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioService.search();
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
    @Override
    public ec.com.smx.portal.rrhh.services.model.Usuario getUsuario(
        long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioException {
        return _usuarioService.getUsuario(usuarioId);
    }

    /**
    * Returns the number of usuarios.
    *
    * @return the number of usuarios
    * @throws SystemException
    if a system exception occurred
    */
    @Override
    public int count()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioService.count();
    }

    @Override
    public java.lang.String getHola(java.lang.String text) {
        return _usuarioService.getHola(text);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public UsuarioService getWrappedUsuarioService() {
        return _usuarioService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedUsuarioService(UsuarioService usuarioService) {
        _usuarioService = usuarioService;
    }

    @Override
    public UsuarioService getWrappedService() {
        return _usuarioService;
    }

    @Override
    public void setWrappedService(UsuarioService usuarioService) {
        _usuarioService = usuarioService;
    }
}
