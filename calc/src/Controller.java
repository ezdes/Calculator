import javax.script.ScriptException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private final Model model;
    private final Viewer viewer;

    public Controller(Viewer viewer) {
        model = new Model(viewer);
        this.viewer = viewer;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewer.getButton1()) {
            model.show(viewer.getButton1().getText());
            model.enable();
        } else if (e.getSource() == viewer.getButton2()) {
            model.show(viewer.getButton2().getText());
            model.enable();
        } else if (e.getSource() == viewer.getButton3()) {
            model.show(viewer.getButton3().getText());
            model.enable();
        } else if (e.getSource() == viewer.getButton4()) {
            model.show(viewer.getButton4().getText());
            model.enable();
        } else if (e.getSource() == viewer.getButton5()) {
            model.show(viewer.getButton5().getText());
            model.enable();
        } else if (e.getSource() == viewer.getButton6()) {
            model.show(viewer.getButton6().getText());
            model.enable();
        } else if (e.getSource() == viewer.getButton7()) {
            model.show(viewer.getButton7().getText());
            model.enable();
        } else if (e.getSource() == viewer.getButton8()) {
            model.show(viewer.getButton8().getText());
            model.enable();
        } else if (e.getSource() == viewer.getButton9()) {
            model.show(viewer.getButton9().getText());
            model.enable();
        } else if (e.getSource() == viewer.getButton0()) {
            model.show(viewer.getButton0().getText());
            model.enable();
        } else if (e.getSource() == viewer.getButtonC()) {
            viewer.getTextField().setText("");
            model.show("Clear");
        }


        if (!viewer.getTextField().getText().equals("")) {

            if (e.getSource() == viewer.getButtonPlus()) {
                model.show(viewer.getButtonPlus().getText());
                model.disable();
            } else if (e.getSource() == viewer.getButtonDivide()) {
                model.show(viewer.getButtonDivide().getText());
                model.disable();
            } else if (e.getSource() == viewer.getButtonMultiply()) {
                model.show(viewer.getButtonMultiply().getText());
                model.disable();
            } else if (e.getSource() == viewer.getButtonResult()) {
                try {
                    model.result();

                } catch (ScriptException scriptException) {
                    scriptException.printStackTrace();
                }
            }
        }

        if (e.getSource() == viewer.getButtonMinus()) {
            model.show(viewer.getButtonMinus().getText());
            model.disable();
        }
    }
}
