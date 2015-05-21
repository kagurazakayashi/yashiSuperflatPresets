
package yashisuperflatpresets;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author yashi
 */


public class MainWindow extends javax.swing.JFrame {

    private ArrayList<String> demoPresetArr_data = new ArrayList<String>();
    private ArrayList<String> blockArr_id = new ArrayList<String>();
    private ArrayList<String> blockArr_data = new ArrayList<String>();
    private ArrayList<String> demoPresetArr_name = new ArrayList<String>();
    private ArrayList<String> biomeArr_name = new ArrayList<String>();
    private ArrayList<String> blockColorArr_name = new ArrayList<String>();
    private ArrayList<String> blockArr_name = new ArrayList<String>();
    public DefaultComboBoxModel<String> demoPresetList = new DefaultComboBoxModel<String>();
    public DefaultComboBoxModel<String> biomeList = new DefaultComboBoxModel<String>();
    public DefaultComboBoxModel<String> blockColorList = new DefaultComboBoxModel<String>();
    public DefaultComboBoxModel<String> blockList = new DefaultComboBoxModel<String>();
    private ArrayList<String> tempBlockData = new ArrayList<String>();
    private ArrayList<String> tempBlockID = new ArrayList<String>();
    private ArrayList<String> tempBlockNumber = new ArrayList<String>();
    public DefaultListModel blockSettingList = new DefaultListModel();
    
    private void initData() {
        Datas datainit = new Datas();
        
        demoPresetArr_data = datainit.demoPreset(1);
        demoPresetArr_name = datainit.demoPreset(3);
        biomeArr_name = datainit.biome(2);
        blockColorArr_name = datainit.blockColor(2);
        blockArr_id = datainit.block(0);
        blockArr_data = datainit.block(1);
        blockArr_name = datainit.block(2);
        
        for (String name : demoPresetArr_name) {
            demoPresetList.addElement(name);
        }
        demoPresetSelect.setModel(demoPresetList);
        for (String name : biomeArr_name) {
            biomeList.addElement(name);
        }
        biomeSelect.setModel(biomeList);
        biomeSelect.setSelectedIndex(1);
        for (String name : blockColorArr_name) {
            blockColorList.addElement(name);
        }
        blockColorSelect.setModel(blockColorList);
        for (int i = 0; i < blockArr_name.size(); i++) {
            String nowblockArr_id = blockArr_id.get(i);
            blockList.addElement(nowblockArr_id + " / " + blockArr_name.get(i));
        }
        blockSelect.setModel(blockList);
        blockSelect.setSelectedIndex(8);
        
        blockSettingList.addElement("草方块x1"); tempBlockID.add("2"); tempBlockData.add("minecraft:grass"); tempBlockNumber.add("1");
        blockSettingList.addElement("泥土x2"); tempBlockID.add("3"); tempBlockData.add("minecraft:dirt"); tempBlockNumber.add("2");
        blockSettingList.addElement("基岩x1"); tempBlockID.add("7"); tempBlockData.add("minecraft:bedrock"); tempBlockNumber.add("1");
        blockSetting.setModel(blockSettingList);
        blockSetting.setSelectedIndex(2);
    }
    
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        initData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        demoPresetSelect = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        blockSetting = new javax.swing.JList();
        blockSelect = new javax.swing.JComboBox();
        btn_insD = new javax.swing.JButton();
        btn_insU = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jCheckBox4 = new javax.swing.JCheckBox();
        jTextField8 = new javax.swing.JTextField();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        biomeSelect = new javax.swing.JComboBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        blockColorSelect = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_block_number = new javax.swing.JTextField();
        jCheckBox11 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("雅诗MC超平坦世界个性化预设生成器");
        setMaximumSize(null);
        setMinimumSize(null);
        setSize(new java.awt.Dimension(800, 498));

        jLabel2.setText("将下面的预设方案输入到MC预设框或分享：");

        jTextField1.setText("3;minecraft:bedrock,2*minecraft:dirt,minecraft:grass;1;village");

        jButton1.setText("↓ 载入方案 ↓");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("↑ 生成方案 ↑");

        demoPresetSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "经典平坦" }));
        demoPresetSelect.setToolTipText("");

        jButton3.setText("← 应用预设");

        jLabel1.setText("方块设置");

        blockSetting.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "草方块x1" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(blockSetting);

        blockSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "空气" }));
        blockSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockSelectActionPerformed(evt);
            }
        });

        btn_insD.setText("在当前选择下方插入");
        btn_insD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insDActionPerformed(evt);
            }
        });

        btn_insU.setText("在当前选择上方插入");
        btn_insU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insUActionPerformed(evt);
            }
        });

        btn_del.setText("删除当前选择");
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });

        jLabel4.setText("生成设置");

        jCheckBox1.setText("生成村庄");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel5.setText("村庄大小（0为普通模式默认，1为超平坦默认，2以上成比例增加）：");

        jTextField2.setText("1");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel6.setText("村庄之间相隔区块数量（最小9，默认32）：");

        jTextField3.setText("32");

        jCheckBox2.setText("生成废弃矿井");

        jLabel7.setText("稀有度百分比（0-100。默认1%，注意100%通常会导致多个矿道同时生成）：");

        jTextField4.setText("1");

        jCheckBox3.setText("生成要塞");

        jLabel8.setText("当前世界中生成数量（默认3）：");

        jTextField5.setText("3");

        jLabel9.setText("离出生点和其它要塞的区块数量（最小1，默认32）：");

        jTextField6.setText("32");

        jLabel10.setText("要塞距离其生成点的集中度（最小1，默认3）：");

        jTextField7.setText("3");

        jCheckBox4.setText("生成生物群系特有建筑（神殿神庙等）  距离（最小9，默认32）：");

        jTextField8.setText("32");

        jCheckBox5.setText("生成地牢");

        jCheckBox6.setText("生成花草树木");

        jCheckBox7.setText("生成湖泊");

        jCheckBox8.setText("生成岩浆");

        jCheckBox9.setText("生成海底遗迹");

        jLabel11.setText("兼容MC版本：");

        jTextField9.setText("3");

        jLabel12.setText("生物群系：");

        biomeSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "草原" }));

        jCheckBox10.setText("全选/反选");

        jButton7.setText("粘贴");

        jButton8.setText("复制");

        blockColorSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "普通（白色）" }));

        jLabel3.setText("颜色：");

        jLabel13.setText("层数：");

        txt_block_number.setText("1");

        jCheckBox11.setSelected(true);
        jCheckBox11.setText("使用名称代替ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 418, Short.MAX_VALUE)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(blockSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel13))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(blockColorSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_block_number, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btn_insD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_insU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(btn_del, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(demoPresetSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(biomeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jCheckBox2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jCheckBox3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel8)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel9)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel10)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel7)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(307, 307, 307)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox11)
                                        .addGap(47, 47, 47)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addComponent(jCheckBox10)))
                                .addGap(14, 14, 14)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(demoPresetSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jCheckBox10)
                    .addComponent(jCheckBox11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(biomeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jLabel5)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox3)
                            .addComponent(jLabel8)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox4)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox7)
                            .addComponent(jCheckBox8)
                            .addComponent(jCheckBox9))
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(blockSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(blockColorSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txt_block_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(btn_insU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_insD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_del)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void blockSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blockSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blockSelectActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btn_insUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insUActionPerformed
        //在当前选择上方插入
        if (blockSetting.getSelectedIndex() >= 0) {
            int nowSelectBox = blockSetting.getSelectedIndex();
            int nowSelectBlock = blockSelect.getSelectedIndex();
//            if (nowSelectBox < 0) {
//                nowSelectBox = 1;
//            }
            String nowid = blockArr_id.get(nowSelectBlock);
            String nowdata = blockArr_data.get(nowSelectBlock);
            tempBlockID.add(nowSelectBox,insColor(nowid, 1));
            tempBlockData.add(nowSelectBox,insColor(nowdata, 2));
            tempBlockNumber.add(nowSelectBox,txt_block_number.getText());
            blockSettingList.add(nowSelectBox, insblock());
            blockSetting.setSelectedIndex(nowSelectBox);
            btn_delEnable();
        }
    }//GEN-LAST:event_btn_insUActionPerformed

    private void btn_insDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insDActionPerformed
        //在当前选择下方插入
        if (blockSetting.getSelectedIndex() >= 0) {
            int nowSelectBox = blockSetting.getSelectedIndex();
            int nowSelectBlock = blockSelect.getSelectedIndex();
//            if (nowSelectBox < 0) {
//                nowSelectBox = 0;
//            } else {
//                nowSelectBox++;
//            }
            String nowid = blockArr_id.get(nowSelectBlock);
            String nowdata = blockArr_data.get(nowSelectBlock);
            tempBlockID.add(nowSelectBox,insColor(nowid, 1));
            tempBlockData.add(nowSelectBox,insColor(nowdata, 2));
            tempBlockNumber.add(nowSelectBox,txt_block_number.getText());
            blockSettingList.add(nowSelectBox, insblock());
            blockSetting.setSelectedIndex(nowSelectBox);
            btn_delEnable();
        }
    }//GEN-LAST:event_btn_insDActionPerformed

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        //删除当前选择
        if (blockSetting.getSelectedIndex() >= 0 && tempBlockID.size() > 1) {
            int nowselect = blockSetting.getSelectedIndex();
            tempBlockID.remove(nowselect);
            tempBlockData.remove(nowselect);
            tempBlockNumber.remove(nowselect);
            blockSettingList.remove(nowselect);
            btn_delEnable();
        }
    }//GEN-LAST:event_btn_delActionPerformed

    private void btn_delEnable() {
        if (tempBlockID.size() > 1) {
            
            btn_del.setEnabled(true);
        } else {
            btn_del.setEnabled(false);
        }
    }
    
    private void clearSelectBox() {
        //清空
        blockSetting.setSelectedIndex(-1);
        blockSettingList.removeAllElements();
        tempBlockData = null; tempBlockID = null; tempBlockNumber = null;
        ArrayList<String> tempBlockData = new ArrayList<String>();
        ArrayList<String> tempBlockID = new ArrayList<String>();
        ArrayList<String> tempBlockNumber = new ArrayList<String>();
    }
    
    private String insblock() {
//        System.out.println(tempBlockID); 
        int nowSelect = blockSelect.getSelectedIndex();
        String nowid = blockArr_id.get(nowSelect);
//        String nowdata = blockArr_data.get(nowSelect);
//        tempBlockID.add(insColor(nowid, 1));
//        tempBlockData.add(insColor(nowdata, 2));
//        tempBlockNumber.add(txt_block_number.getText());
        return insColor(nowid, 3) + blockArr_name.get(nowSelect) + "x" + txt_block_number.getText();
    }
    
    private String insColor(String nowid, int mode) {
        //mode 1:nowid 2:nowdata 3:colorname
        if (nowid.contains(":")) {
            String [] stringArr = nowid.split(":");
            String iscolor = stringArr[stringArr.length - 1];
            if (!"<color>".equals(iscolor)) {
                if (mode == 3) {
                    return "";
                }
                return nowid;
            }
            if (mode == 2) {
                return stringArr[0] + ":" + stringArr[1] + ":" + blockColorSelect.getSelectedIndex();
            } else if (mode == 1) {
                return stringArr[0] + ":" + blockColorSelect.getSelectedIndex();
            } else if (mode == 3) {
                return blockColorArr_name.get(blockColorSelect.getSelectedIndex());
            }
        }
        if (mode == 3) {
            return "";
        }
        return nowid;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    
    private void exit() {
        dispose();
        System.exit(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox biomeSelect;
    private javax.swing.JComboBox blockColorSelect;
    private javax.swing.JComboBox blockSelect;
    private javax.swing.JList blockSetting;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_insD;
    private javax.swing.JButton btn_insU;
    private javax.swing.JComboBox demoPresetSelect;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txt_block_number;
    // End of variables declaration//GEN-END:variables
}