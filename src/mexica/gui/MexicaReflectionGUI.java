package mexica.gui;

import javax.swing.JOptionPane;
import mexica.reflection.Guideline;
import mexica.reflection.ImpasseAnalyzer;
import mexica.reflection.TensionGraph;
import mexica.story.ActionInstantiated;
import mexica.story.ConditionInstantiated;
import mexica.story.IStoryContextListener;
import mexica.story.Story;
import mexica.story.guidelines.StoryTension;
import mexica.story.guidelines.TensionCurveAnalyzer;
import org.jfree.chart.ChartPanel;

/**
 *
 * @author ivang_000
 */
public class MexicaReflectionGUI extends javax.swing.JDialog {
    private java.awt.Frame parent;
    private Story story;

    /**
     * Creates new form MexicaReflectionGUI
     */
    public MexicaReflectionGUI(java.awt.Frame parent, boolean modal, Story story) {
        super(parent, modal);
        this.parent = parent;
        this.story = story;
        initComponents();
        setListeners();
        getContentPane().setBackground(getBackground());
    }

    private void setListeners() {
        story.addStoryContextListener(listPendingConditions, IStoryContextListener.ListType.Conditions);
    }

    public void setTensionGraphs() {
        ChartPanel chart = TensionGraph.getChart(story);
        panelStoryTensions.removeAll();
        panelStoryTensions.add(chart);

        TensionCurveAnalyzer analyzer = new TensionCurveAnalyzer();
        StoryTension prevStory = analyzer.analyzeGuidelines(story);
        ChartPanel chart2 = TensionGraph.getChart(prevStory);
        panelPrevStoryTensions.removeAll();
        panelPrevStoryTensions.add(chart2);

        rbTensionUp.setSelected(story.getGuidelines().containsGuideline(Guideline.tendencyUp));
        rbTensionDown.setSelected(story.getGuidelines().containsGuideline(Guideline.tendencyDown));
        rbTensionNeutral.setSelected(story.getGuidelines().containsGuideline(Guideline.tendencyNeutral));

        panelStoryTensions.validate();
        panelPrevStoryTensions.validate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupTensions = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPendingConditions = new mexica.gui.JListUpdateable(story);
        bttnSelectAction = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        rbTensionUp = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rbTensionDown = new javax.swing.JRadioButton();
        rbTensionNeutral = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        panelStoryTensions = new javax.swing.JPanel();
        panelPrevStoryTensions = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bttnUpdateGuidelines = new javax.swing.JButton();
        bttnFindPrevStory = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        bttnImpasse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reflection Mode");

        jLabel1.setText("Missing conditions:");

        jScrollPane1.setViewportView(listPendingConditions);

        bttnSelectAction.setText("Pick an action");
        bttnSelectAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnSelectActionActionPerformed(evt);
            }
        });

        jLabel2.setText("Constraint summary:");

        groupTensions.add(rbTensionUp);
        rbTensionUp.setText("Increase");

        jLabel3.setText("Tensions");

        groupTensions.add(rbTensionDown);
        rbTensionDown.setText("Decrease");

        groupTensions.add(rbTensionNeutral);
        rbTensionNeutral.setText("Neutral");

        jLabel4.setText("Tension vectors:");

        panelStoryTensions.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelStoryTensions.setLayout(new java.awt.GridLayout(1, 1));

        panelPrevStoryTensions.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelPrevStoryTensions.setLayout(new java.awt.GridLayout(1, 1));

        jLabel5.setText("Previous story guideline:");

        jLabel6.setText("Current story:");

        bttnUpdateGuidelines.setText("Update guideline");
        bttnUpdateGuidelines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnUpdateGuidelinesActionPerformed(evt);
            }
        });

        bttnFindPrevStory.setText("Find match");
        bttnFindPrevStory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnFindPrevStoryActionPerformed(evt);
            }
        });

        jLabel7.setText("Impasses:");

        bttnImpasse.setText("Break impasse");
        bttnImpasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnImpasseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbTensionUp)
                                    .addComponent(rbTensionDown)
                                    .addComponent(rbTensionNeutral)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bttnUpdateGuidelines))))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bttnImpasse, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(bttnSelectAction)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelStoryTensions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPrevStoryTensions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                        .addComponent(bttnFindPrevStory)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttnSelectAction))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(bttnUpdateGuidelines)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelStoryTensions, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTensionUp)
                    .addComponent(jLabel5)
                    .addComponent(bttnFindPrevStory))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbTensionDown)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbTensionNeutral)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(bttnImpasse))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelPrevStoryTensions, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnSelectActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnSelectActionActionPerformed
        ConditionInstantiated cond = (ConditionInstantiated)listPendingConditions.getSelectedValue();
        if (cond != null) {
            ActionInstantiated action = cond.getAction();
            int currentYear = story.getCurrentYear();
            story.notifyPreviousAction(action);
            MexicaActionInstantiator actionInstantiator = new MexicaActionInstantiator(parent, true, action, cond, story);
            actionInstantiator.setLocationByPlatform(true);
            actionInstantiator.setVisible(true);
            setTensionGraphs();
            this.validate();
            story.setCurrentYear(currentYear);
        }
        else {
            JOptionPane.showMessageDialog(this, "Please select a condition to fulfill first", "Select a Missing Condition", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bttnSelectActionActionPerformed

    private void bttnFindPrevStoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnFindPrevStoryActionPerformed
        setTensionGraphs();
    }//GEN-LAST:event_bttnFindPrevStoryActionPerformed

    private void bttnUpdateGuidelinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnUpdateGuidelinesActionPerformed
        story.getGuidelines().removeTensionGuidelines();
        if (rbTensionDown.isSelected())
            story.getGuidelines().addGuideline(Guideline.tendencyDown);
        else if (rbTensionUp.isSelected())
            story.getGuidelines().addGuideline(Guideline.tendencyUp);
        else if (rbTensionNeutral.isSelected())
            story.getGuidelines().addGuideline(Guideline.tendencyNeutral);
        
        JOptionPane.showMessageDialog(this, "The story guidelines have been updated", "Guidelines updated", JOptionPane.INFORMATION_MESSAGE);
                
    }//GEN-LAST:event_bttnUpdateGuidelinesActionPerformed

    private void bttnImpasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnImpasseActionPerformed
        ImpasseAnalyzer analyzer = new ImpasseAnalyzer();
        if (story.getImpasseDetected()) {
            if (analyzer.analyzeStory(story))
                JOptionPane.showMessageDialog(this, "Impasse successfully broken", "Impasse analysis", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(this, "Impasse could not be broken. End of story suggested.", "Impasse analysis", JOptionPane.ERROR_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(this, "The story has no impasse to break.", "Impasse analysis", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bttnImpasseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnFindPrevStory;
    private javax.swing.JButton bttnImpasse;
    private javax.swing.JButton bttnSelectAction;
    private javax.swing.JButton bttnUpdateGuidelines;
    private javax.swing.ButtonGroup groupTensions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private mexica.gui.JListUpdateable listPendingConditions;
    private javax.swing.JPanel panelPrevStoryTensions;
    private javax.swing.JPanel panelStoryTensions;
    private javax.swing.JRadioButton rbTensionDown;
    private javax.swing.JRadioButton rbTensionNeutral;
    private javax.swing.JRadioButton rbTensionUp;
    // End of variables declaration//GEN-END:variables
}
