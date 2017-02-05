package ec.com.smx.portal.rrhh.services.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link ec.com.smx.portal.rrhh.services.service.http.UsuarioServiceSoap}.
 *
 * @author maballe
 * @see ec.com.smx.portal.rrhh.services.service.http.UsuarioServiceSoap
 * @generated
 */
public class UsuarioSoap implements Serializable {
    private long _usuarioId;
    private String _nombre;
    private long _roleId;

    public UsuarioSoap() {
    }

    public static UsuarioSoap toSoapModel(Usuario model) {
        UsuarioSoap soapModel = new UsuarioSoap();

        soapModel.setUsuarioId(model.getUsuarioId());
        soapModel.setNombre(model.getNombre());
        soapModel.setRoleId(model.getRoleId());

        return soapModel;
    }

    public static UsuarioSoap[] toSoapModels(Usuario[] models) {
        UsuarioSoap[] soapModels = new UsuarioSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static UsuarioSoap[][] toSoapModels(Usuario[][] models) {
        UsuarioSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new UsuarioSoap[models.length][models[0].length];
        } else {
            soapModels = new UsuarioSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static UsuarioSoap[] toSoapModels(List<Usuario> models) {
        List<UsuarioSoap> soapModels = new ArrayList<UsuarioSoap>(models.size());

        for (Usuario model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new UsuarioSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _usuarioId;
    }

    public void setPrimaryKey(long pk) {
        setUsuarioId(pk);
    }

    public long getUsuarioId() {
        return _usuarioId;
    }

    public void setUsuarioId(long usuarioId) {
        _usuarioId = usuarioId;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String nombre) {
        _nombre = nombre;
    }

    public long getRoleId() {
        return _roleId;
    }

    public void setRoleId(long roleId) {
        _roleId = roleId;
    }
}
