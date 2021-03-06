package ec.com.smx.portal.rrhh.services.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UsuarioLocalService}.
 *
 * @author maballe
 * @see UsuarioLocalService
 * @generated
 */
public class UsuarioLocalServiceWrapper implements UsuarioLocalService,
    ServiceWrapper<UsuarioLocalService> {
    private UsuarioLocalService _usuarioLocalService;

    public UsuarioLocalServiceWrapper(UsuarioLocalService usuarioLocalService) {
        _usuarioLocalService = usuarioLocalService;
    }

    /**
    * Adds the usuario to the database. Also notifies the appropriate model listeners.
    *
    * @param usuario the usuario
    * @return the usuario that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ec.com.smx.portal.rrhh.services.model.Usuario addUsuario(
        ec.com.smx.portal.rrhh.services.model.Usuario usuario)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioLocalService.addUsuario(usuario);
    }

    /**
    * Creates a new usuario with the primary key. Does not add the usuario to the database.
    *
    * @param usuarioId the primary key for the new usuario
    * @return the new usuario
    */
    @Override
    public ec.com.smx.portal.rrhh.services.model.Usuario createUsuario(
        long usuarioId) {
        return _usuarioLocalService.createUsuario(usuarioId);
    }

    /**
    * Deletes the usuario with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param usuarioId the primary key of the usuario
    * @return the usuario that was removed
    * @throws PortalException if a usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ec.com.smx.portal.rrhh.services.model.Usuario deleteUsuario(
        long usuarioId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _usuarioLocalService.deleteUsuario(usuarioId);
    }

    /**
    * Deletes the usuario from the database. Also notifies the appropriate model listeners.
    *
    * @param usuario the usuario
    * @return the usuario that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ec.com.smx.portal.rrhh.services.model.Usuario deleteUsuario(
        ec.com.smx.portal.rrhh.services.model.Usuario usuario)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioLocalService.deleteUsuario(usuario);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _usuarioLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public ec.com.smx.portal.rrhh.services.model.Usuario fetchUsuario(
        long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioLocalService.fetchUsuario(usuarioId);
    }

    /**
    * Returns the usuario with the primary key.
    *
    * @param usuarioId the primary key of the usuario
    * @return the usuario
    * @throws PortalException if a usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ec.com.smx.portal.rrhh.services.model.Usuario getUsuario(
        long usuarioId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _usuarioLocalService.getUsuario(usuarioId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _usuarioLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the usuarios.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of usuarios
    * @param end the upper bound of the range of usuarios (not inclusive)
    * @return the range of usuarios
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<ec.com.smx.portal.rrhh.services.model.Usuario> getUsuarios(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioLocalService.getUsuarios(start, end);
    }

    /**
    * Returns the number of usuarios.
    *
    * @return the number of usuarios
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getUsuariosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioLocalService.getUsuariosCount();
    }

    /**
    * Updates the usuario in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param usuario the usuario
    * @return the usuario that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ec.com.smx.portal.rrhh.services.model.Usuario updateUsuario(
        ec.com.smx.portal.rrhh.services.model.Usuario usuario)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioLocalService.updateUsuario(usuario);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _usuarioLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _usuarioLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _usuarioLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
    * Returns all the usuarios.
    *
    * @return the usuarios
    * @throws SystemException
    if a system exception occurred
    */
    @Override
    public java.util.List<ec.com.smx.portal.rrhh.services.model.Usuario> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioLocalService.findAll();
    }

    /**
    * Creates a new usuario with the primary key. Does not add the usuario to
    * the database.
    *
    * @param usuarioId
    the primary key for the new usuario
    * @return the new usuario
    * @throws SystemException
    */
    @Override
    public ec.com.smx.portal.rrhh.services.model.Usuario create()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioLocalService.create();
    }

    /**
    * Removes the usuario with the primary key from the database. Also notifies
    * the appropriate model listeners.
    *
    * @param usuarioId
    the primary key of the usuario
    * @return the usuario that was removed
    * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioException
    if a usuario with the primary key could not be found
    * @throws SystemException
    if a system exception occurred
    */
    @Override
    public ec.com.smx.portal.rrhh.services.model.Usuario delete(long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioException {
        return _usuarioLocalService.delete(usuarioId);
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
    public ec.com.smx.portal.rrhh.services.model.Usuario findByPrimaryKey(
        long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioException {
        return _usuarioLocalService.findByPrimaryKey(usuarioId);
    }

    /**
    * Returns a range of all the usuarios.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of
    * <code>end - start</code> instances. <code>start</code> and
    * <code>end</code> are not primary keys, they are indexes in the result
    * set. Thus, <code>0</code> refers to the first result in the set. Setting
    * both <code>start</code> and <code>end</code> to
    * {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
    * the full result set. If <code>orderByComparator</code> is specified, then
    * the query will include the given ORDER BY logic. If
    * <code>orderByComparator</code> is absent and pagination is required (
    * <code>start</code> and <code>end</code> are not
    * {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the
    * query will include the default ORDER BY logic from
    * {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioModelImpl}. If
    * both <code>orderByComparator</code> and pagination are absent, for
    * performance reasons, the query will not have an ORDER BY clause and the
    * returned result set will be sorted on by the primary key in an ascending
    * order.
    * </p>
    *
    * @param start
    the lower bound of the range of usuarios
    * @param end
    the upper bound of the range of usuarios (not inclusive)
    * @return the range of usuarios
    * @throws SystemException
    if a system exception occurred
    */
    @Override
    public java.util.List<ec.com.smx.portal.rrhh.services.model.Usuario> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioLocalService.findAll(start, end);
    }

    /**
    * Returns an ordered range of all the usuarios.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of
    * <code>end - start</code> instances. <code>start</code> and
    * <code>end</code> are not primary keys, they are indexes in the result
    * set. Thus, <code>0</code> refers to the first result in the set. Setting
    * both <code>start</code> and <code>end</code> to
    * {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return
    * the full result set. If <code>orderByComparator</code> is specified, then
    * the query will include the given ORDER BY logic. If
    * <code>orderByComparator</code> is absent and pagination is required (
    * <code>start</code> and <code>end</code> are not
    * {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the
    * query will include the default ORDER BY logic from
    * {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioModelImpl}. If
    * both <code>orderByComparator</code> and pagination are absent, for
    * performance reasons, the query will not have an ORDER BY clause and the
    * returned result set will be sorted on by the primary key in an ascending
    * order.
    * </p>
    *
    * @param start
    the lower bound of the range of usuarios
    * @param end
    the upper bound of the range of usuarios (not inclusive)
    * @param orderByComparator
    the comparator to order the results by (optionally
    <code>null</code>)
    * @return the ordered range of usuarios
    * @throws SystemException
    if a system exception occurred
    */
    @Override
    public java.util.List<ec.com.smx.portal.rrhh.services.model.Usuario> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioLocalService.findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the usuarios from the database.
    *
    * @throws SystemException
    if a system exception occurred
    */
    @Override
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        _usuarioLocalService.removeAll();
    }

    /**
    * Returns the number of usuarios.
    *
    * @return the number of usuarios
    * @throws SystemException
    if a system exception occurred
    */
    @Override
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuarioLocalService.countAll();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public UsuarioLocalService getWrappedUsuarioLocalService() {
        return _usuarioLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedUsuarioLocalService(
        UsuarioLocalService usuarioLocalService) {
        _usuarioLocalService = usuarioLocalService;
    }

    @Override
    public UsuarioLocalService getWrappedService() {
        return _usuarioLocalService;
    }

    @Override
    public void setWrappedService(UsuarioLocalService usuarioLocalService) {
        _usuarioLocalService = usuarioLocalService;
    }
}
