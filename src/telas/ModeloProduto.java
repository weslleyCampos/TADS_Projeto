/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

/**
 *
 * @author rafael Mello
 */

public class ModeloProduto implements Serializable {

    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    
    
    private Integer idModelo;
    
    private String moldeo;

    public ModeloProduto() {
    }

    public ModeloProduto(Integer idModelo) {
        this.idModelo = idModelo;
    }

    public ModeloProduto(Integer idModelo, String moldeo) {
        this.idModelo = idModelo;
        this.moldeo = moldeo;
    }

    public Integer getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(Integer idModelo) {
        Integer oldIdModelo = this.idModelo;
        this.idModelo = idModelo;
        changeSupport.firePropertyChange("idModelo", oldIdModelo, idModelo);
    }

    public String getMoldeo() {
        return moldeo;
    }

    public void setMoldeo(String moldeo) {
        String oldMoldeo = this.moldeo;
        this.moldeo = moldeo;
        changeSupport.firePropertyChange("moldeo", oldMoldeo, moldeo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idModelo != null ? idModelo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModeloProduto)) {
            return false;
        }
        ModeloProduto other = (ModeloProduto) object;
        if ((this.idModelo == null && other.idModelo != null) || (this.idModelo != null && !this.idModelo.equals(other.idModelo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telas.ModeloProduto[ idModelo=" + idModelo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
