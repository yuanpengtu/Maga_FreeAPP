// Generated code from Butter Knife. Do not modify!
package anime.project.dilidili.main.webview;

import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import anime.project.dilidili.R;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DefaultWebActivity_ViewBinding implements Unbinder {
  private DefaultWebActivity target;

  @UiThread
  public DefaultWebActivity_ViewBinding(DefaultWebActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DefaultWebActivity_ViewBinding(DefaultWebActivity target, View source) {
    this.target = target;

    target.mX5WebView = Utils.findRequiredViewAsType(source, R.id.x5_webview, "field 'mX5WebView'", X5WebView.class);
    target.pg = Utils.findRequiredViewAsType(source, R.id.progressBar, "field 'pg'", ProgressBar.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DefaultWebActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mX5WebView = null;
    target.pg = null;
    target.toolbar = null;
  }
}
