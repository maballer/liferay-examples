package ec.com.smx.portal.rrhh.services.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import ec.com.smx.portal.rrhh.services.model.Usuario;
import ec.com.smx.portal.rrhh.services.model.UsuarioModel;
import ec.com.smx.portal.rrhh.services.model.UsuarioSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Usuario service. Represents a row in the &quot;usuario&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link ec.com.smx.portal.rrhh.services.model.UsuarioModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UsuarioImpl}.
 * </p>
 *
 * @author maballe
 * @see UsuarioImpl
 * @see ec.com.smx.portal.rrhh.services.model.Usuario
 * @see ec.com.smx.portal.rrhh.services.model.UsuarioModel
 * @generated
 */
@JSON(strict = true)
public class UsuarioModelImpl extends BaseModelImpl<Usuario>
    implements UsuarioModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a usuario model instance should use the {@link ec.com.smx.portal.rrhh.services.model.Usuario} interface instead.
     */
    public static final String TABLE_NAME = "usuario";
    public static final Object[][] TABLE_COLUMNS = {
            { "usuarioid", Types.BIGINT },
            { "nombre", Types.VARCHAR },
            { "roleid", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table usuario (usuarioid LONG not null primary key,nombre VARCHAR(75) null,roleid LONG)";
    public static final String TABLE_SQL_DROP = "drop table usuario";
    public static final String ORDER_BY_JPQL = " ORDER BY usuario.usuarioId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY usuario.usuarioid ASC";
    public static final String DATA_SOURCE = "anotherDataSource";
    public static final String SESSION_FACTORY = "anotherSessionFactory";
    public static final String TX_MANAGER = "anotherTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.ec.com.smx.portal.rrhh.services.model.Usuario"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.ec.com.smx.portal.rrhh.services.model.Usuario"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.ec.com.smx.portal.rrhh.services.model.Usuario"),
            true);
    public static long NOMBRE_COLUMN_BITMASK = 1L;
    public static long USUARIOID_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.ec.com.smx.portal.rrhh.services.model.Usuario"));
    private static ClassLoader _classLoader = Usuario.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Usuario.class
        };
    private long _usuarioId;
    private String _nombre;
    private String _originalNombre;
    private long _roleId;
    private long _columnBitmask;
    private Usuario _escapedModel;

    public UsuarioModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Usuario toModel(UsuarioSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Usuario model = new UsuarioImpl();

        model.setUsuarioId(soapModel.getUsuarioId());
        model.setNombre(soapModel.getNombre());
        model.setRoleId(soapModel.getRoleId());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Usuario> toModels(UsuarioSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Usuario> models = new ArrayList<Usuario>(soapModels.length);

        for (UsuarioSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _usuarioId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setUsuarioId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _usuarioId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return Usuario.class;
    }

    @Override
    public String getModelClassName() {
        return Usuario.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("usuarioId", getUsuarioId());
        attributes.put("nombre", getNombre());
        attributes.put("roleId", getRoleId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long usuarioId = (Long) attributes.get("usuarioId");

        if (usuarioId != null) {
            setUsuarioId(usuarioId);
        }

        String nombre = (String) attributes.get("nombre");

        if (nombre != null) {
            setNombre(nombre);
        }

        Long roleId = (Long) attributes.get("roleId");

        if (roleId != null) {
            setRoleId(roleId);
        }
    }

    @JSON
    @Override
    public long getUsuarioId() {
        return _usuarioId;
    }

    @Override
    public void setUsuarioId(long usuarioId) {
        _usuarioId = usuarioId;
    }

    @JSON
    @Override
    public String getNombre() {
        if (_nombre == null) {
            return StringPool.BLANK;
        } else {
            return _nombre;
        }
    }

    @Override
    public void setNombre(String nombre) {
        _columnBitmask |= NOMBRE_COLUMN_BITMASK;

        if (_originalNombre == null) {
            _originalNombre = _nombre;
        }

        _nombre = nombre;
    }

    public String getOriginalNombre() {
        return GetterUtil.getString(_originalNombre);
    }

    @JSON
    @Override
    public long getRoleId() {
        return _roleId;
    }

    @Override
    public void setRoleId(long roleId) {
        _roleId = roleId;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Usuario.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Usuario toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Usuario) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        UsuarioImpl usuarioImpl = new UsuarioImpl();

        usuarioImpl.setUsuarioId(getUsuarioId());
        usuarioImpl.setNombre(getNombre());
        usuarioImpl.setRoleId(getRoleId());

        usuarioImpl.resetOriginalValues();

        return usuarioImpl;
    }

    @Override
    public int compareTo(Usuario usuario) {
        long primaryKey = usuario.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Usuario)) {
            return false;
        }

        Usuario usuario = (Usuario) obj;

        long primaryKey = usuario.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        UsuarioModelImpl usuarioModelImpl = this;

        usuarioModelImpl._originalNombre = usuarioModelImpl._nombre;

        usuarioModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<Usuario> toCacheModel() {
        UsuarioCacheModel usuarioCacheModel = new UsuarioCacheModel();

        usuarioCacheModel.usuarioId = getUsuarioId();

        usuarioCacheModel.nombre = getNombre();

        String nombre = usuarioCacheModel.nombre;

        if ((nombre != null) && (nombre.length() == 0)) {
            usuarioCacheModel.nombre = null;
        }

        usuarioCacheModel.roleId = getRoleId();

        return usuarioCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{usuarioId=");
        sb.append(getUsuarioId());
        sb.append(", nombre=");
        sb.append(getNombre());
        sb.append(", roleId=");
        sb.append(getRoleId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("ec.com.smx.portal.rrhh.services.model.Usuario");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>usuarioId</column-name><column-value><![CDATA[");
        sb.append(getUsuarioId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nombre</column-name><column-value><![CDATA[");
        sb.append(getNombre());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>roleId</column-name><column-value><![CDATA[");
        sb.append(getRoleId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
