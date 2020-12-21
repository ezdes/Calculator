import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Model {

    private final Viewer viewer;
    private String str = "";

    public Model(Viewer viewer) {
        this.viewer = viewer;
    }

    public void show(String text) {

        if (text.equals("Clear")) {
            str = "";
            text = "";
        }
        str += text;

        viewer.getTextField().setText(str);
    }

    public void result() throws ScriptException {

        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        String res = String.valueOf(engine.eval(str));
        double result = Double.parseDouble(res);

        viewer.getTextField().setText(String.format("%.1f", result));
        str = res;
    }


    public void enable() {
        viewer.getButtonMinus().setEnabled(true);
        viewer.getButtonPlus().setEnabled(true);
        viewer.getButtonDivide().setEnabled(true);
        viewer.getButtonMultiply().setEnabled(true);
        viewer.getButtonResult().setEnabled(true);
    }

    public void disable() {
        viewer.getButtonPlus().setEnabled(false);
        viewer.getButtonDivide().setEnabled(false);
        viewer.getButtonMultiply().setEnabled(false);
        viewer.getButtonResult().setEnabled(false);
    }
}
