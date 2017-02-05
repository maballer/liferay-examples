package ec.com.smx.portal.rrhh.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Rol service. Represents a row in the &quot;rolid&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link ec.com.smx.portal.rrhh.services.model.impl.RolModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ec.com.smx.portal.rrhh.services.model.impl.RolImpl}.
 * </p>
 *
 * @author maballe
 * @see Rol
 * @see ec.com.smx.portal.rrhh.services.model.impl.RolImpl
 * @see ec.com.smx.portal.rrhh.services.model.impl.RolModelImpl
 * @generated
 */
public interface RolModel extends BaseModel<Rol> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a rol model instance should use the {@link Rol} interface instead.
     */

    /**
     * Returns the primary key of this rol.
     *
     * @return the primary key of this rol
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this rol.
     *
     * @param primaryKey the primary key of this rol
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the rol ID of this rol.
     *
     * @return the rol ID of this rol
     */
    public long getRolId();

    /**
     * Sets the rol ID of this rol.
     *
     * @param rolId the rol ID of this rol
     */
    public void setRolId(long rolId);

    /**
     * Returns the nombre of this rol.
     *
     * @return the nombre of this rol
     */
    @AutoEscape
    public String getNombre();

    /**
     * Sets the nombre of this rol.
     *
     * @param nombre the nombre of this rol
     */
    public void setNombre(String nombre);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(ec.com.smx.portal.rrhh.services.model.Rol rol);

    @Override
    public int hashCode();

    @Override
    public CacheModel<ec.com.smx.portal.rrhh.services.model.Rol> toCacheModel();

    @Override
    public ec.com.smx.portal.rrhh.services.model.Rol toEscapedModel();

    @Override
    public ec.com.smx.portal.rrhh.services.model.Rol toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}