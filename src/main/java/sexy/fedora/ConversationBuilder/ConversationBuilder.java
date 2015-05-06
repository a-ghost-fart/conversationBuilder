package sexy.fedora.ConversationBuilder;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.*;

public class ConversationBuilder extends JDialog {
    private JPanel contentPane;
    private JButton buttonExport;
    private JButton buttonAddTree;
    private JTree conversationTree;

    public ConversationBuilder() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonExport);

        buttonExport.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onExport();
            }
        });

        buttonAddTree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onAddTree();
            }
        });

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onExport() {
        System.out.println("Do some kind of export, lol.");
    }

    private void onAddTree() {
        ConversationTree tree = new ConversationTree();
        System.out.println(tree.toString());
    }

    public static void main(String[] args) {
        ConversationBuilder dialog = new ConversationBuilder();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
