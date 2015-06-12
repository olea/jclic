/*
 * File    : BasicEvaluatorPanel.java
 * Created : 25-jun-2003 12:12
 * By      : fbusquets
 *
 * JClic - Authoring and playing system for educational activities
 *
 * Copyright (C) 2000 - 2005 Francesc Busquets & Departament
 * d'Educacio de la Generalitat de Catalunya
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details (see the LICENSE file).
 */

package edu.xtec.jclic.activities.text;

import edu.xtec.util.Options;

/**
 *
 * @author Francesc Busquets (fbusquets@xtec.cat)
 * @version 1.0
 */
public class BasicEvaluatorPanel extends javax.swing.JPanel {
    
    Options options;
    
    /** Creates new form BasicEvaluatorPanel */
    public BasicEvaluatorPanel(Options options) {
        this.options=options;
        initComponents();
    }
    
    public void setEvaluator(BasicEvaluator ev){
        caseChk.setSelected(ev.checkCase);
        accentsChk.setSelected(ev.checkAccents);
        punctChk.setSelected(ev.checkPunctuation);
        doubleSpcChk.setSelected(ev.checkDoubleSpaces);
    }
    
    public void collectData(BasicEvaluator ev){
        ev.checkCase=caseChk.isSelected();
        ev.checkAccents=accentsChk.isSelected();
        ev.checkPunctuation=punctChk.isSelected();
        ev.checkDoubleSpaces=doubleSpcChk.isSelected();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        caseChk = new javax.swing.JCheckBox();
        accentsChk = new javax.swing.JCheckBox();
        punctChk = new javax.swing.JCheckBox();
        doubleSpcChk = new javax.swing.JCheckBox();

        setLayout(new java.awt.GridBagLayout());

        setBorder(new javax.swing.border.TitledBorder(options.getMsg("edit_text_act_checkOptions")));
        caseChk.setText(options.getMsg("edit_text_act_checkCase"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        add(caseChk, gridBagConstraints);

        accentsChk.setText(options.getMsg("edit_text_act_checkAccents"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(accentsChk, gridBagConstraints);

        punctChk.setText(options.getMsg("edit_text_act_checkPunct"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(punctChk, gridBagConstraints);

        doubleSpcChk.setText(options.getMsg("edit_text_act_checkDoubleSpc"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(doubleSpcChk, gridBagConstraints);

    }//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox punctChk;
    private javax.swing.JCheckBox caseChk;
    private javax.swing.JCheckBox doubleSpcChk;
    private javax.swing.JCheckBox accentsChk;
    // End of variables declaration//GEN-END:variables
    
}