package ec.com.smx.portal.rrhh.services.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import ec.com.smx.portal.rrhh.services.model.Usuario;

/**
 * The persistence interface for the usuario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author maballe
 * @see UsuarioPersistenceImpl
 * @see UsuarioUtil
 * @generated
 */
public interface UsuarioPersistence extends BasePersistence<Usuario> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link UsuarioUtil} to access the usuario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the usuarios where nombre LIKE &#63;.
    *
    * @param nombre the nombre
    * @return the matching usuarios
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ec.com.smx.portal.rrhh.services.model.Usuario> findByNombreKeyWord(
        java.lang.String nombre)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the usuarios where nombre LIKE &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param nombre the nombre
    * @param start the lower bound of the range of usuarios
    * @param end the upper bound of the range of usuarios (not inclusive)
    * @return the range of matching usuarios
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ec.com.smx.portal.rrhh.services.model.Usuario> findByNombreKeyWord(
        java.lang.String nombre, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the usuarios where nombre LIKE &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param nombre the nombre
    * @param start the lower bound of the range of usuarios
    * @param end the upper bound of the range of usuarios (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching usuarios
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ec.com.smx.portal.rrhh.services.model.Usuario> findByNombreKeyWord(
        java.lang.String nombre, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first usuario in the ordered set where nombre LIKE &#63;.
    *
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching usuario
    * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioException if a matching usuario could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.Usuario findByNombreKeyWord_First(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioException;

    /**
    * Returns the first usuario in the ordered set where nombre LIKE &#63;.
    *
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching usuario, or <code>null</code> if a matching usuario could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.Usuario fetchByNombreKeyWord_First(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last usuario in the ordered set where nombre LIKE &#63;.
    *
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching usuario
    * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioException if a matching usuario could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.Usuario findByNombreKeyWord_Last(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioException;

    /**
    * Returns the last usuario in the ordered set where nombre LIKE &#63;.
    *
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching usuario, or <code>null</code> if a matching usuario could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.Usuario fetchByNombreKeyWord_Last(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the usuarios before and after the current usuario in the ordered set where nombre LIKE &#63;.
    *
    * @param usuarioId the primary key of the current usuario
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next usuario
    * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioException if a usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.Usuario[] findByNombreKeyWord_PrevAndNext(
        long usuarioId, java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioException;

    /**
    * Removes all the usuarios where nombre LIKE &#63; from the database.
    *
    * @param nombre the nombre
    * @throws SystemException if a system exception occurred
    */
    public void removeByNombreKeyWord(java.lang.String nombre)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of usuarios where nombre LIKE &#63;.
    *
    * @param nombre the nombre
    * @return the number of matching usuarios
    * @throws SystemException if a system exception occurred
    */
    public int countByNombreKeyWord(java.lang.String nombre)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the usuario in the entity cache if it is enabled.
    *
    * @param usuario the usuario
    */
    public void cacheResult(
        ec.com.smx.portal.rrhh.services.model.Usuario usuario);

    /**
    * Caches the usuarios in the entity cache if it is enabled.
    *
    * @param usuarios the usuarios
    */
    public void cacheResult(
        java.util.List<ec.com.smx.portal.rrhh.services.model.Usuario> usuarios);

    /**
    * Creates a new usuario with the primary key. Does not add the usuario to the database.
    *
    * @param usuarioId the primary key for the new usuario
    * @return the new usuario
    */
    public ec.com.smx.portal.rrhh.services.model.Usuario create(long usuarioId);

    /**
    * Removes the usuario with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param usuarioId the primary key of the usuario
    * @return the usuario that was removed
    * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioException if a usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.Usuario remove(long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioException;

    public ec.com.smx.portal.rrhh.services.model.Usuario updateImpl(
        ec.com.smx.portal.rrhh.services.model.Usuario usuario)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the usuario with the primary key or throws a {@link ec.com.smx.portal.rrhh.services.NoSuchUsuarioException} if it could not be found.
    *
    * @param usuarioId the primary key of the usuario
    * @return the usuario
    * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioException if a usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.Usuario findByPrimaryKey(
        long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioException;

    /**
    * Returns the usuario with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param usuarioId the primary key of the usuario
    * @return the usuario, or <code>null</code> if a usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ec.com.smx.portal.rrhh.services.model.Usuario fetchByPrimaryKey(
        long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the usuarios.
    *
    * @return the usuarios
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ec.com.smx.portal.rrhh.services.model.Usuario> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ec.com.smx.portal.rrhh.services.model.Usuario> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the usuarios.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of usuarios
    * @param end the upper bound of the range of usuarios (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of usuarios
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ec.com.smx.portal.rrhh.services.model.Usuario> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the usuarios from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of usuarios.
    *
    * @return the number of usuarios
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
