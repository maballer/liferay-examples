package ec.com.smx.portal.rrhh.services.service.impl;

import java.util.List;

import com.liferay.counter.service.CounterLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;


import ec.com.smx.portal.rrhh.services.NoSuchUsuarioException;
import ec.com.smx.portal.rrhh.services.model.Usuario;
import ec.com.smx.portal.rrhh.services.model.impl.UsuarioImpl;
import ec.com.smx.portal.rrhh.services.service.base.UsuarioLocalServiceBaseImpl;

/**
 * The implementation of the usuario local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link ec.com.smx.portal.rrhh.services.service.UsuarioLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author maballe
 * @see ec.com.smx.portal.rrhh.services.service.base.UsuarioLocalServiceBaseImpl
 * @see ec.com.smx.portal.rrhh.services.service.UsuarioLocalServiceUtil
 */
public class UsuarioLocalServiceImpl extends UsuarioLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * ec.com.smx.portal.rrhh.services.service.UsuarioLocalServiceUtil} to
	 * access the usuario local service.
	 */
	/**
	 * Returns all the usuarios.
	 *
	 * @return the usuarios
	 * @throws SystemException
	 *             if a system exception occurred
	 */

	public List<Usuario> findAll() throws SystemException {
		return usuarioPersistence.findAll();
	}

	/**
	 * Creates a new usuario with the primary key. Does not add the usuario to
	 * the database.
	 *
	 * @param usuarioId
	 *            the primary key for the new usuario
	 * @return the new usuario
	 * @throws SystemException
	 */

	public Usuario create() throws SystemException {
		Usuario usuario = new UsuarioImpl();

		usuario.setNew(true);
		usuario.setPrimaryKey(CounterLocalServiceUtil.increment(Usuario.class
				.getName()));

		return usuario;
	}

	/**
	 * Removes the usuario with the primary key from the database. Also notifies
	 * the appropriate model listeners.
	 *
	 * @param usuarioId
	 *            the primary key of the usuario
	 * @return the usuario that was removed
	 * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioException
	 *             if a usuario with the primary key could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */

	public Usuario delete(long usuarioId) throws NoSuchUsuarioException,
			SystemException {
		return usuarioPersistence.remove(usuarioId);
	}

	/**
	 * Returns the usuario with the primary key or throws a
	 * {@link ec.com.smx.portal.rrhh.services.NoSuchUsuarioException} if it
	 * could not be found.
	 *
	 * @param usuarioId
	 *            the primary key of the usuario
	 * @return the usuario
	 * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioException
	 *             if a usuario with the primary key could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */

	public Usuario findByPrimaryKey(long usuarioId)
			throws NoSuchUsuarioException, SystemException {
		return usuarioPersistence.findByPrimaryKey(usuarioId);
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
	 *            the lower bound of the range of usuarios
	 * @param end
	 *            the upper bound of the range of usuarios (not inclusive)
	 * @return the range of usuarios
	 * @throws SystemException
	 *             if a system exception occurred
	 */

	public List<Usuario> findAll(int start, int end) throws SystemException {
		return usuarioPersistence.findAll(start, end);
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
	 *            the lower bound of the range of usuarios
	 * @param end
	 *            the upper bound of the range of usuarios (not inclusive)
	 * @param orderByComparator
	 *            the comparator to order the results by (optionally
	 *            <code>null</code>)
	 * @return the ordered range of usuarios
	 * @throws SystemException
	 *             if a system exception occurred
	 */

	public List<Usuario> findAll(int start, int end,
			OrderByComparator orderByComparator) throws SystemException {
		return usuarioPersistence.findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the usuarios from the database.
	 *
	 * @throws SystemException
	 *             if a system exception occurred
	 */

	public void removeAll() throws SystemException {
		usuarioPersistence.removeAll();
	}

	/**
	 * Returns the number of usuarios.
	 *
	 * @return the number of usuarios
	 * @throws SystemException
	 *             if a system exception occurred
	 */

	public int countAll() throws SystemException {
		return usuarioPersistence.countAll();
	}

	/**
	 * Returns all the usuarios where nombre LIKE &#63;.
	 *
	 * @param nombre
	 *            the nombre
	 * @return the matching usuarios
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	/**
	 * Returns all the usuarios where nombre LIKE &#63;.
	 *
	 * @param nombre
	 *            the nombre
	 * @return the matching usuarios
	 * @throws SystemException
	 *             if a system exception occurred
	 */

//	public List<Usuario> findByfindNombreByKeyWord(String nombre)
//        throws SystemException {
//		return usuarioPersistence.findByfindNombreByKeyWord(nombre);
//    }
}