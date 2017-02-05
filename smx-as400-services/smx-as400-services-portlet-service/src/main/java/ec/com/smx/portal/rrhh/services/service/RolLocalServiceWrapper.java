package ec.com.smx.portal.rrhh.services.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RolLocalService}.
 *
 * @author maballe
 * @see RolLocalService
 * @generated
 */
public class RolLocalServiceWrapper implements RolLocalService,
    ServiceWrapper<RolLocalService> {
    private RolLocalService _rolLocalService;

    public RolLocalServiceWrapper(RolLocalService rolLocalService) {
        _rolLocalService = rolLocalService;
    }

    /**
    * Adds the rol to the database. Also notifies the appropriate model listeners.
    *
    * @param rol the rol
    * @return the rol that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ec.com.smx.portal.rrhh.services.model.Rol addRol(
        ec.com.smx.portal.rrhh.services.model.Rol rol)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rolLocalService.addRol(rol);
    }

    /**
    * Creates a new rol with the primary key. Does not add the rol to the database.
    *
    * @param rolId the primary key for the new rol
    * @return the new rol
    */
    @Override
    public ec.com.smx.portal.rrhh.services.model.Rol createRol(long rolId) {
        return _rolLocalService.createRol(rolId);
    }

    /**
    * Deletes the rol with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param rolId the primary key of the rol
    * @return the rol that was removed
    * @throws PortalException if a rol with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ec.com.smx.portal.rrhh.services.model.Rol deleteRol(long rolId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _rolLocalService.deleteRol(rolId);
    }

    /**
    * Deletes the rol from the database. Also notifies the appropriate model listeners.
    *
    * @param rol the rol
    * @return the rol that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ec.com.smx.portal.rrhh.services.model.Rol deleteRol(
        ec.com.smx.portal.rrhh.services.model.Rol rol)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rolLocalService.deleteRol(rol);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _rolLocalService.dynamicQuery();
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
        return _rolLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.RolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _rolLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.RolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _rolLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _rolLocalService.dynamicQueryCount(dynamicQuery);
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
        return _rolLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public ec.com.smx.portal.rrhh.services.model.Rol fetchRol(long rolId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rolLocalService.fetchRol(rolId);
    }

    /**
    * Returns the rol with the primary key.
    *
    * @param rolId the primary key of the rol
    * @return the rol
    * @throws PortalException if a rol with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ec.com.smx.portal.rrhh.services.model.Rol getRol(long rolId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _rolLocalService.getRol(rolId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _rolLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the rols.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.RolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of rols
    * @param end the upper bound of the range of rols (not inclusive)
    * @return the range of rols
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<ec.com.smx.portal.rrhh.services.model.Rol> getRols(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rolLocalService.getRols(start, end);
    }

    /**
    * Returns the number of rols.
    *
    * @return the number of rols
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getRolsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rolLocalService.getRolsCount();
    }

    /**
    * Updates the rol in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param rol the rol
    * @return the rol that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ec.com.smx.portal.rrhh.services.model.Rol updateRol(
        ec.com.smx.portal.rrhh.services.model.Rol rol)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rolLocalService.updateRol(rol);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _rolLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _rolLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _rolLocalService.invokeMethod(name, parameterTypes, arguments);
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
        return _rolLocalService.findAll();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RolLocalService getWrappedRolLocalService() {
        return _rolLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRolLocalService(RolLocalService rolLocalService) {
        _rolLocalService = rolLocalService;
    }

    @Override
    public RolLocalService getWrappedService() {
        return _rolLocalService;
    }

    @Override
    public void setWrappedService(RolLocalService rolLocalService) {
        _rolLocalService = rolLocalService;
    }
}
