package ec.com.smx.portal.rrhh.services.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import ec.com.smx.portal.rrhh.services.model.Rol;

/**
 * The persistence interface for the rol service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author maballe
 * @see RolPersistenceImpl
 * @see RolUtil
 * @generated
 */
public interface RolPersistence extends BasePersistence<Rol> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RolUtil} to access the rol persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the rol in the entity cache if it is enabled.
    *
    * @param rol the rol
    */
    public void cacheResult(ec.com.smx.portal.rrhh.services.model.Rol rol);

    /**
    * Caches the rols in the entity cache if it is enabled.
    *
    * @param rols the rols
    */
    public void cacheResult(
        java.util.List<ec.com.smx.portal.rrhh.services.model.Rol> rols);

    /**
    * Creates a new rol with the primary key. Does not add the rol to the database.
    *
    * @param rolId the primary key for the new rol
    * @return the new rol
    */
    public ec.com.smx.portal.rrhh.services.model.Rol create(long rolId);

    /**
    * Removes the rol with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param rolId the primary key of the rol
    * @return the rol that was removed
    * @throws ec.com.smx.portal.rrhh.services.NoSuchRolException if a rol with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.Rol remove(long rolId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchRolException;

    public ec.com.smx.portal.rrhh.services.model.Rol updateImpl(
        ec.com.smx.portal.rrhh.services.model.Rol rol)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rol with the primary key or throws a {@link ec.com.smx.portal.rrhh.services.NoSuchRolException} if it could not be found.
    *
    * @param rolId the primary key of the rol
    * @return the rol
    * @throws ec.com.smx.portal.rrhh.services.NoSuchRolException if a rol with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.Rol findByPrimaryKey(
        long rolId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchRolException;

    /**
    * Returns the rol with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param rolId the primary key of the rol
    * @return the rol, or <code>null</code> if a rol with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.Rol fetchByPrimaryKey(
        long rolId) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the rols.
    *
    * @return the rols
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ec.com.smx.portal.rrhh.services.model.Rol> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ec.com.smx.portal.rrhh.services.model.Rol> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the rols.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.RolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of rols
    * @param end the upper bound of the range of rols (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of rols
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ec.com.smx.portal.rrhh.services.model.Rol> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the rols from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rols.
    *
    * @return the number of rols
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
