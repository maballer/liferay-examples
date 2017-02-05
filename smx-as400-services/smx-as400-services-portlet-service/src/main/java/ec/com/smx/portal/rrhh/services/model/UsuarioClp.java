package ec.com.smx.portal.rrhh.services.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import ec.com.smx.portal.rrhh.services.service.ClpSerializer;
import ec.com.smx.portal.rrhh.services.service.UsuarioLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class UsuarioClp extends BaseModelImpl<Usuario> implements Usuario {
    private long _usuarioId;
    private String _nombre;
    private long _roleId;
    private BaseModel<?> _usuarioRemoteModel;
    private Class<?> _clpSerializerClass = ec.com.smx.portal.rrhh.services.service.ClpSerializer.class;

    public UsuarioClp() {
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

    @Override
    public long getUsuarioId() {
        return _usuarioId;
    }

    @Override
    public void setUsuarioId(long usuarioId) {
        _usuarioId = usuarioId;

        if (_usuarioRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRemoteModel.getClass();

                Method method = clazz.getMethod("setUsuarioId", long.class);

                method.invoke(_usuarioRemoteModel, usuarioId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNombre() {
        return _nombre;
    }

    @Override
    public void setNombre(String nombre) {
        _nombre = nombre;

        if (_usuarioRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRemoteModel.getClass();

                Method method = clazz.getMethod("setNombre", String.class);

                method.invoke(_usuarioRemoteModel, nombre);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getRoleId() {
        return _roleId;
    }

    @Override
    public void setRoleId(long roleId) {
        _roleId = roleId;

        if (_usuarioRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRemoteModel.getClass();

                Method method = clazz.getMethod("setRoleId", long.class);

                method.invoke(_usuarioRemoteModel, roleId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getUsuarioRemoteModel() {
        return _usuarioRemoteModel;
    }

    public void setUsuarioRemoteModel(BaseModel<?> usuarioRemoteModel) {
        _usuarioRemoteModel = usuarioRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _usuarioRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_usuarioRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            UsuarioLocalServiceUtil.addUsuario(this);
        } else {
            UsuarioLocalServiceUtil.updateUsuario(this);
        }
    }

    @Override
    public Usuario toEscapedModel() {
        return (Usuario) ProxyUtil.newProxyInstance(Usuario.class.getClassLoader(),
            new Class[] { Usuario.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        UsuarioClp clone = new UsuarioClp();

        clone.setUsuarioId(getUsuarioId());
        clone.setNombre(getNombre());
        clone.setRoleId(getRoleId());

        return clone;
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

        if (!(obj instanceof UsuarioClp)) {
            return false;
        }

        UsuarioClp usuario = (UsuarioClp) obj;

        long primaryKey = usuario.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
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
