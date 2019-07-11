// Generated code from Butter Knife. Do not modify!
package anime.project.dilidili.main.webview;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import anime.project.dilidili.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WebActivity_ViewBinding implements Unbinder {
  private WebActivity target;

  private View view7f090078;

  @UiThread
  public WebActivity_ViewBinding(WebActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WebActivity_ViewBinding(final WebActivity target, View source) {
    this.target = target;

    View view;
    target.mX5WebView = Utils.findRequiredViewAsType(source, R.id.x5_webview, "field 'mX5WebView'", X5WebView.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    view = Utils.findRequiredView(source, R.id.drama, "method 'dramaClick'");
    view7f090078 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.dramaClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    WebActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mX5WebView = null;
    target.toolbar = null;

    view7f090078.setOnClickListener(null);
    view7f090078 = null;
  }
}
