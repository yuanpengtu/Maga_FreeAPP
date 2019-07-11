// Generated code from Butter Knife. Do not modify!
package anime.project.dilidili.main.about;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import anime.project.dilidili.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AboutActivity_ViewBinding implements Unbinder {
  private AboutActivity target;

  private View view7f09006d;

  @UiThread
  public AboutActivity_ViewBinding(AboutActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AboutActivity_ViewBinding(final AboutActivity target, View source) {
    this.target = target;

    View view;
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.cache = Utils.findRequiredViewAsType(source, R.id.cache, "field 'cache'", TextView.class);
    target.open_source = Utils.findRequiredViewAsType(source, R.id.open_source, "field 'open_source'", TextView.class);
    target.version = Utils.findRequiredViewAsType(source, R.id.version, "field 'version'", TextView.class);
    view = Utils.findRequiredView(source, R.id.dilidili, "method 'openDilidili'");
    view7f09006d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openDilidili();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    AboutActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.cache = null;
    target.open_source = null;
    target.version = null;

    view7f09006d.setOnClickListener(null);
    view7f09006d = null;
  }
}
