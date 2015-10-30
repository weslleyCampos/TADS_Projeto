/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 *
 * @author rafael Mello
 */

public class Produto implements Serializable {
    
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    
    private Integer idProduto;
    
    private String descricaoProduto;
    
    private int idModelo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    
    
    private BigDecimal precoUnitario;
    
    private Integer qtdEstoque;
    
    private int qtdMinimo;
    
    private int qtdMaximo;

    public Produto() {
    }

    public Produto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Produto(Integer idProduto, String descricaoProduto, int idModelo, BigDecimal precoUnitario, int qtdMinimo, int qtdMaximo) {
        this.idProduto = idProduto;
        this.descricaoProduto = descricaoProduto;
        this.idModelo = idModelo;
        this.precoUnitario = precoUnitario;
        this.qtdMinimo = qtdMinimo;
        this.qtdMaximo = qtdMaximo;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        Integer oldIdProduto = this.idProduto;
        this.idProduto = idProduto;
        changeSupport.firePropertyChange("idProduto", oldIdProduto, idProduto);
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        String oldDescricaoProduto = this.descricaoProduto;
        this.descricaoProduto = descricaoProduto;
        changeSupport.firePropertyChange("descricaoProduto", oldDescricaoProduto, descricaoProduto);
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        int oldIdModelo = this.idModelo;
        this.idModelo = idModelo;
        changeSupport.firePropertyChange("idModelo", oldIdModelo, idModelo);
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        BigDecimal oldPrecoUnitario = this.precoUnitario;
        this.precoUnitario = precoUnitario;
        changeSupport.firePropertyChange("precoUnitario", oldPrecoUnitario, precoUnitario);
    }

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        Integer oldQtdEstoque = this.qtdEstoque;
        this.qtdEstoque = qtdEstoque;
        changeSupport.firePropertyChange("qtdEstoque", oldQtdEstoque, qtdEstoque);
    }

    public int getQtdMinimo() {
        return qtdMinimo;
    }

    public void setQtdMinimo(int qtdMinimo) {
        int oldQtdMinimo = this.qtdMinimo;
        this.qtdMinimo = qtdMinimo;
        changeSupport.firePropertyChange("qtdMinimo", oldQtdMinimo, qtdMinimo);
    }

    public int getQtdMaximo() {
        return qtdMaximo;
    }

    public void setQtdMaximo(int qtdMaximo) {
        int oldQtdMaximo = this.qtdMaximo;
        this.qtdMaximo = qtdMaximo;
        changeSupport.firePropertyChange("qtdMaximo", oldQtdMaximo, qtdMaximo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduto != null ? idProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.idProduto == null && other.idProduto != null) || (this.idProduto != null && !this.idProduto.equals(other.idProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telas.Produto[ idProduto=" + idProduto + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
