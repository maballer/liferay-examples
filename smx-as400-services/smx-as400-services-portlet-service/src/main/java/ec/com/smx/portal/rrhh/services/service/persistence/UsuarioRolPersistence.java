package ec.com.smx.portal.rrhh.services.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import ec.com.smx.portal.rrhh.services.model.UsuarioRol;

/**
 * The persistence interface for the usuario rol service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author maballe
 * @see UsuarioRolPersistenceImpl
 * @see UsuarioRolUtil
 * @generated
 */
public interface UsuarioRolPersistence extends BasePersistence<UsuarioRol> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link UsuarioRolUtil} to access the usuario rol persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the usuario rols where usuarioId = &#63;.
    *
    * @param usuarioId the usuario ID
    * @return the matching usuario rols
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ec.com.smx.portal.rrhh.services.model.UsuarioRol> findByUsuarioId(
        long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the usuario rols where usuarioId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioRolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param usuarioId the usuario ID
    * @param start the lower bound of the range of usuario rols
    * @param end the upper bound of the range of usuario rols (not inclusive)
    * @return the range of matching usuario rols
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ec.com.smx.portal.rrhh.services.model.UsuarioRol> findByUsuarioId(
        long usuarioId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the usuario rols where usuarioId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioRolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param usuarioId the usuario ID
    * @param start the lower bound of the range of usuario rols
    * @param end the upper bound of the range of usuario rols (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching usuario rols
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ec.com.smx.portal.rrhh.services.model.UsuarioRol> findByUsuarioId(
        long usuarioId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first usuario rol in the ordered set where usuarioId = &#63;.
    *
    * @param usuarioId the usuario ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching usuario rol
    * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException if a matching usuario rol could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.UsuarioRol findByUsuarioId_First(
        long usuarioId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException;

    /**
    * Returns the first usuario rol in the ordered set where usuarioId = &#63;.
    *
    * @param usuarioId the usuario ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching usuario rol, or <code>null</code> if a matching usuario rol could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.UsuarioRol fetchByUsuarioId_First(
        long usuarioId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last usuario rol in the ordered set where usuarioId = &#63;.
    *
    * @param usuarioId the usuario ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching usuario rol
    * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException if a matching usuario rol could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.UsuarioRol findByUsuarioId_Last(
        long usuarioId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException;

    /**
    * Returns the last usuario rol in the ordered set where usuarioId = &#63;.
    *
    * @param usuarioId the usuario ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching usuario rol, or <code>null</code> if a matching usuario rol could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.UsuarioRol fetchByUsuarioId_Last(
        long usuarioId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the usuario rols before and after the current usuario rol in the ordered set where usuarioId = &#63;.
    *
    * @param UsuarioRolId the primary key of the current usuario rol
    * @param usuarioId the usuario ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next usuario rol
    * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException if a usuario rol with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.UsuarioRol[] findByUsuarioId_PrevAndNext(
        long UsuarioRolId, long usuarioId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException;

    /**
    * Removes all the usuario rols where usuarioId = &#63; from the database.
    *
    * @param usuarioId the usuario ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUsuarioId(long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of usuario rols where usuarioId = &#63;.
    *
    * @param usuarioId the usuario ID
    * @return the number of matching usuario rols
    * @throws SystemException if a system exception occurred
    */
    public int countByUsuarioId(long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the usuario rols where rolId = &#63;.
    *
    * @param rolId the rol ID
    * @return the matching usuario rols
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ec.com.smx.portal.rrhh.services.model.UsuarioRol> findByRolId(
        long rolId) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the usuario rols where rolId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioRolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param rolId the rol ID
    * @param start the lower bound of the range of usuario rols
    * @param end the upper bound of the range of usuario rols (not inclusive)
    * @return the range of matching usuario rols
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ec.com.smx.portal.rrhh.services.model.UsuarioRol> findByRolId(
        long rolId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the usuario rols where rolId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioRolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param rolId the rol ID
    * @param start the lower bound of the range of usuario rols
    * @param end the upper bound of the range of usuario rols (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching usuario rols
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ec.com.smx.portal.rrhh.services.model.UsuarioRol> findByRolId(
        long rolId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first usuario rol in the ordered set where rolId = &#63;.
    *
    * @param rolId the rol ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching usuario rol
    * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException if a matching usuario rol could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.UsuarioRol findByRolId_First(
        long rolId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException;

    /**
    * Returns the first usuario rol in the ordered set where rolId = &#63;.
    *
    * @param rolId the rol ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching usuario rol, or <code>null</code> if a matching usuario rol could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.UsuarioRol fetchByRolId_First(
        long rolId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last usuario rol in the ordered set where rolId = &#63;.
    *
    * @param rolId the rol ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching usuario rol
    * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException if a matching usuario rol could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.UsuarioRol findByRolId_Last(
        long rolId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException;

    /**
    * Returns the last usuario rol in the ordered set where rolId = &#63;.
    *
    * @param rolId the rol ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching usuario rol, or <code>null</code> if a matching usuario rol could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.UsuarioRol fetchByRolId_Last(
        long rolId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the usuario rols before and after the current usuario rol in the ordered set where rolId = &#63;.
    *
    * @param UsuarioRolId the primary key of the current usuario rol
    * @param rolId the rol ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next usuario rol
    * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException if a usuario rol with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.UsuarioRol[] findByRolId_PrevAndNext(
        long UsuarioRolId, long rolId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException;

    /**
    * Removes all the usuario rols where rolId = &#63; from the database.
    *
    * @param rolId the rol ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByRolId(long rolId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of usuario rols where rolId = &#63;.
    *
    * @param rolId the rol ID
    * @return the number of matching usuario rols
    * @throws SystemException if a system exception occurred
    */
    public int countByRolId(long rolId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the usuario rol in the entity cache if it is enabled.
    *
    * @param usuarioRol the usuario rol
    */
    public void cacheResult(
        ec.com.smx.portal.rrhh.services.model.UsuarioRol usuarioRol);

    /**
    * Caches the usuario rols in the entity cache if it is enabled.
    *
    * @param usuarioRols the usuario rols
    */
    public void cacheResult(
        java.util.List<ec.com.smx.portal.rrhh.services.model.UsuarioRol> usuarioRols);

    /**
    * Creates a new usuario rol with the primary key. Does not add the usuario rol to the database.
    *
    * @param UsuarioRolId the primary key for the new usuario rol
    * @return the new usuario rol
    */
    public ec.com.smx.portal.rrhh.services.model.UsuarioRol create(
        long UsuarioRolId);

    /**
    * Removes the usuario rol with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param UsuarioRolId the primary key of the usuario rol
    * @return the usuario rol that was removed
    * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException if a usuario rol with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.UsuarioRol remove(
        long UsuarioRolId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException;

    public ec.com.smx.portal.rrhh.services.model.UsuarioRol updateImpl(
        ec.com.smx.portal.rrhh.services.model.UsuarioRol usuarioRol)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the usuario rol with the primary key or throws a {@link ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException} if it could not be found.
    *
    * @param UsuarioRolId the primary key of the usuario rol
    * @return the usuario rol
    * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException if a usuario rol with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.UsuarioRol findByPrimaryKey(
        long UsuarioRolId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException;

    /**
    * Returns the usuario rol with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param UsuarioRolId the primary key of the usuario rol
    * @return the usuario rol, or <code>null</code> if a usuario rol with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.UsuarioRol fetchByPrimaryKey(
        long UsuarioRolId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the usuario rols.
    *
    * @return the usuario rols
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ec.com.smx.portal.rrhh.services.model.UsuarioRol> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the usuario rols.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioRolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of usuario rols
    * @param end the upper bound of the range of usuario rols (not inclusive)
    * @return the range of usuario rols
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ec.com.smx.portal.rrhh.services.model.UsuarioRol> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the usuario rols.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioRolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of usuario rols
    * @param end the upper bound of the range of usuario rols (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of usuario rols
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ec.com.smx.portal.rrhh.services.model.UsuarioRol> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the usuario rols from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of usuario rols.
    *
    * @return the number of usuario rols
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
