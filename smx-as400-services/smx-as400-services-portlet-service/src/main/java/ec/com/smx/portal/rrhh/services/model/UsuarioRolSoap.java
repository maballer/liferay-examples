package ec.com.smx.portal.rrhh.services.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link ec.com.smx.portal.rrhh.services.service.http.UsuarioRolServiceSoap}.
 *
 * @author maballe
 * @see ec.com.smx.portal.rrhh.services.service.http.UsuarioRolServiceSoap
 * @generated
 */
public class UsuarioRolSoap implements Serializable {
    private long _UsuarioRolId;
    private long _usuarioId;
    private long _rolId;

    public UsuarioRolSoap() {
    }

    public static UsuarioRolSoap toSoapModel(UsuarioRol model) {
        UsuarioRolSoap soapModel = new UsuarioRolSoap();

        soapModel.setUsuarioRolId(model.getUsuarioRolId());
        soapModel.setUsuarioId(model.getUsuarioId());
        soapModel.setRolId(model.getRolId());

        return soapModel;
    }

    public static UsuarioRolSoap[] toSoapModels(UsuarioRol[] models) {
        UsuarioRolSoap[] soapModels = new UsuarioRolSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static UsuarioRolSoap[][] toSoapModels(UsuarioRol[][] models) {
        UsuarioRolSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new UsuarioRolSoap[models.length][models[0].length];
        } else {
            soapModels = new UsuarioRolSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static UsuarioRolSoap[] toSoapModels(List<UsuarioRol> models) {
        List<UsuarioRolSoap> soapModels = new ArrayList<UsuarioRolSoap>(models.size());

        for (UsuarioRol model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new UsuarioRolSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _UsuarioRolId;
    }

    public void setPrimaryKey(long pk) {
        setUsuarioRolId(pk);
    }

    public long getUsuarioRolId() {
        return _UsuarioRolId;
    }

    public void setUsuarioRolId(long UsuarioRolId) {
        _UsuarioRolId = UsuarioRolId;
    }

    public long getUsuarioId() {
        return _usuarioId;
    }

    public void setUsuarioId(long usuarioId) {
        _usuarioId = usuarioId;
    }

    public long getRolId() {
        return _rolId;
    }

    public void setRolId(long rolId) {
        _rolId = rolId;
    }
}
