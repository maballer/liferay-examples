package ec.com.smx.portal.rrhh.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import ec.com.smx.portal.rrhh.services.model.Rol;
import ec.com.smx.portal.rrhh.services.service.RolLocalServiceUtil;

/**
 * @author maballe
 * @generated
 */
public abstract class RolActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RolActionableDynamicQuery() throws SystemException {
        setBaseLocalService(RolLocalServiceUtil.getService());
        setClass(Rol.class);

        setClassLoader(ec.com.smx.portal.rrhh.services.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("rolId");
    }
}
