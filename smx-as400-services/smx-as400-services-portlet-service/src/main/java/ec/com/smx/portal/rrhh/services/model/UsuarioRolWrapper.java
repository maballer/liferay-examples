package ec.com.smx.portal.rrhh.services.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UsuarioRol}.
 * </p>
 *
 * @author maballe
 * @see UsuarioRol
 * @generated
 */
public class UsuarioRolWrapper implements UsuarioRol, ModelWrapper<UsuarioRol> {
    private UsuarioRol _usuarioRol;

    public UsuarioRolWrapper(UsuarioRol usuarioRol) {
        _usuarioRol = usuarioRol;
    }

    @Override
    public Class<?> getModelClass() {
        return UsuarioRol.class;
    }

    @Override
    public String getModelClassName() {
        return UsuarioRol.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("UsuarioRolId", getUsuarioRolId());
        attributes.put("usuarioId", getUsuarioId());
        attributes.put("rolId", getRolId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long UsuarioRolId = (Long) attributes.get("UsuarioRolId");

        if (UsuarioRolId != null) {
            setUsuarioRolId(UsuarioRolId);
        }

        Long usuarioId = (Long) attributes.get("usuarioId");

        if (usuarioId != null) {
            setUsuarioId(usuarioId);
        }

        Long rolId = (Long) attributes.get("rolId");

        if (rolId != null) {
            setRolId(rolId);
        }
    }

    /**
    * Returns the primary key of this usuario rol.
    *
    * @return the primary key of this usuario rol
    */
    @Override
    public long getPrimaryKey() {
        return _usuarioRol.getPrimaryKey();
    }

    /**
    * Sets the primary key of this usuario rol.
    *
    * @param primaryKey the primary key of this usuario rol
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _usuarioRol.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the usuario rol ID of this usuario rol.
    *
    * @return the usuario rol ID of this usuario rol
    */
    @Override
    public long getUsuarioRolId() {
        return _usuarioRol.getUsuarioRolId();
    }

    /**
    * Sets the usuario rol ID of this usuario rol.
    *
    * @param UsuarioRolId the usuario rol ID of this usuario rol
    */
    @Override
    public void setUsuarioRolId(long UsuarioRolId) {
        _usuarioRol.setUsuarioRolId(UsuarioRolId);
    }

    /**
    * Returns the usuario ID of this usuario rol.
    *
    * @return the usuario ID of this usuario rol
    */
    @Override
    public long getUsuarioId() {
        return _usuarioRol.getUsuarioId();
    }

    /**
    * Sets the usuario ID of this usuario rol.
    *
    * @param usuarioId the usuario ID of this usuario rol
    */
    @Override
    public void setUsuarioId(long usuarioId) {
        _usuarioRol.setUsuarioId(usuarioId);
    }

    /**
    * Returns the rol ID of this usuario rol.
    *
    * @return the rol ID of this usuario rol
    */
    @Override
    public long getRolId() {
        return _usuarioRol.getRolId();
    }

    /**
    * Sets the rol ID of this usuario rol.
    *
    * @param rolId the rol ID of this usuario rol
    */
    @Override
    public void setRolId(long rolId) {
        _usuarioRol.setRolId(rolId);
    }

    @Override
    public boolean isNew() {
        return _usuarioRol.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _usuarioRol.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _usuarioRol.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _usuarioRol.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _usuarioRol.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _usuarioRol.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _usuarioRol.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _usuarioRol.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _usuarioRol.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _usuarioRol.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _usuarioRol.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new UsuarioRolWrapper((UsuarioRol) _usuarioRol.clone());
    }

    @Override
    public int compareTo(
        ec.com.smx.portal.rrhh.services.model.UsuarioRol usuarioRol) {
        return _usuarioRol.compareTo(usuarioRol);
    }

    @Override
    public int hashCode() {
        return _usuarioRol.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<ec.com.smx.portal.rrhh.services.model.UsuarioRol> toCacheModel() {
        return _usuarioRol.toCacheModel();
    }

    @Override
    public ec.com.smx.portal.rrhh.services.model.UsuarioRol toEscapedModel() {
        return new UsuarioRolWrapper(_usuarioRol.toEscapedModel());
    }

    @Override
    public ec.com.smx.portal.rrhh.services.model.UsuarioRol toUnescapedModel() {
        return new UsuarioRolWrapper(_usuarioRol.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _usuarioRol.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _usuarioRol.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _usuarioRol.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof UsuarioRolWrapper)) {
            return false;
        }

        UsuarioRolWrapper usuarioRolWrapper = (UsuarioRolWrapper) obj;

        if (Validator.equals(_usuarioRol, usuarioRolWrapper._usuarioRol)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public UsuarioRol getWrappedUsuarioRol() {
        return _usuarioRol;
    }

    @Override
    public UsuarioRol getWrappedModel() {
        return _usuarioRol;
    }

    @Override
    public void resetOriginalValues() {
        _usuarioRol.resetOriginalValues();
    }
}
