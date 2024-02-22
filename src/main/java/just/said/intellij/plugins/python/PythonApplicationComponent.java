package just.said.intellij.plugins.Python;

import com.intellij.ide.ui.LafManager;
import com.intellij.ide.ui.LafManagerListener;
import com.intellij.openapi.application.ApplicationActivationListener;
import com.intellij.openapi.wm.IdeFrame;
import org.jetbrains.annotations.NotNull;

import javax.swing.UIManager;

public class PythonApplicationComponent implements LafManagerListener, ApplicationActivationListener {
    public PythonApplicationComponent() {
    }

    @Override
    public void lookAndFeelChanged(@NotNull LafManager lafManager) {
        // see https://plugins.jetbrains.com/docs/intellij/plugin-listeners.html
        updateProgressBarUi();
    }

    @Override
    public void applicationActivated(@NotNull IdeFrame ideFrame) {
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", PythonProgressBarUi.class.getName());
        UIManager.getDefaults().put(PythonProgressBarUi.class.getName(), PythonProgressBarUi.class);
    }
}
