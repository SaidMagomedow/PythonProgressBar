package just.said.python;

import com.intellij.ide.ui.LafManager;
import com.intellij.ide.ui.LafManagerListener;
import com.intellij.ide.plugins.DynamicPluginListener;
import com.intellij.openapi.application.ApplicationActivationListener;
import org.jetbrains.annotations.NotNull;

import javax.swing.UIManager;

public class PythonApplicationComponent implements LafManagerListener, DynamicPluginListener, ApplicationActivationListener {
    public void lookAndFeelChanged(@NotNull LafManager source) {
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", PythonProgressBarUi.class.getName());
        UIManager.getDefaults().put(PythonProgressBarUi.class.getName(), PythonProgressBarUi.class);
    }
}
