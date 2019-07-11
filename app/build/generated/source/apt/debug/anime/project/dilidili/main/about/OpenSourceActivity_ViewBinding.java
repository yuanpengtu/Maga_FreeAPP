// Generated code from Butter Knife. Do not modify!
package anime.project.dilidili.main.about;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import anime.project.dilidili.R;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class OpenSourceActivity_ViewBinding implements Unbinder {
  private OpenSourceActivity target;

  @UiThread
  public OpenSourceActivity_ViewBinding(OpenSourceActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public OpenSourceActivity_ViewBinding(OpenSourceActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.mSwipe = Utils.findRequiredViewAsType(source, R.id.mSwipe, "field 'mSwipe'", SwipeRefreshLayout.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.rv_list, "field 'recyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    OpenSourceActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.mSwipe = null;
    target.recyclerView = null;
  }
}
