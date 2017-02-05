package ec.com.smx.portal.rrhh.services.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Rol}.
 * </p>
 *
 * @author maballe
 * @see Rol
 * @generated
 */
public class RolWrapper implements Rol, ModelWrapper<Rol> {
    private Rol _rol;

    public RolWrapper(Rol rol) {
        _rol = rol;
    }

    @Override
    public Class<?> getModelClass() {
        return Rol.class;
    }

    @Override
    public String getModelClassName() {
        return Rol.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("rolId", getRolId());
        attributes.put("nombre", getNombre());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long rolId = (Long) attributes.get("rolId");

        if (rolId != null) {
            setRolId(rolId);
        }

        String nombre = (String) attributes.get("nombre");

        if (nombre != null) {
            setNombre(nombre);
        }
    }

    /**
    * Returns the primary key of this rol.
    *
    * @return the primary key of this rol
    */
    @Override
    public long getPrimaryKey() {
        return _rol.getPrimaryKey();
    }

    /**
    * Sets the primary key of this rol.
    *
    * @param primaryKey the primary key of this rol
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _rol.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the rol ID of this rol.
    *
    * @return the rol ID of this rol
    */
    @Override
    public long getRolId() {
        return _rol.getRolId();
    }

    /**
    * Sets the rol ID of this rol.
    *
    * @param rolId the rol ID of this rol
    */
    @Override
    public void setRolId(long rolId) {
        _rol.setRolId(rolId);
    }

    /**
    * Returns the nombre of this rol.
    *
    * @return the nombre of this rol
    */
    @Override
    public java.lang.String getNombre() {
        return _rol.getNombre();
    }

    /**
    * Sets the nombre of this rol.
    *
    * @param nombre the nombre of this rol
    */
    @Override
    public void setNombre(java.lang.String nombre) {
        _rol.setNombre(nombre);
    }

    @Override
    public boolean isNew() {
        return _rol.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _rol.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _rol.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _rol.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _rol.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _rol.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _rol.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _rol.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _rol.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _rol.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _rol.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new RolWrapper((Rol) _rol.clone());
    }

    @Override
    public int compareTo(ec.com.smx.portal.rrhh.services.model.Rol rol) {
        return _rol.compareTo(rol);
    }

    @Override
    public int hashCode() {
        return _rol.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<ec.com.smx.portal.rrhh.services.model.Rol> toCacheModel() {
        return _rol.toCacheModel();
    }

    @Override
    public ec.com.smx.portal.rrhh.services.model.Rol toEscapedModel() {
        return new RolWrapper(_rol.toEscapedModel());
    }

    @Override
    public ec.com.smx.portal.rrhh.services.model.Rol toUnescapedModel() {
        return new RolWrapper(_rol.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _rol.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _rol.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _rol.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RolWrapper)) {
            return false;
        }

        RolWrapper rolWrapper = (RolWrapper) obj;

        if (Validator.equals(_rol, rolWrapper._rol)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Rol getWrappedRol() {
        return _rol;
    }

    @Override
    public Rol getWrappedModel() {
        return _rol;
    }

    @Override
    public void resetOriginalValues() {
        _rol.resetOriginalValues();
    }
}
