// Generated code from Butter Knife. Do not modify!
package anime.project.dilidili.main.setting.user;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import anime.project.dilidili.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ApiActivity_ViewBinding implements Unbinder {
  private ApiActivity target;

  private View view7f090027;

  @UiThread
  public ApiActivity_ViewBinding(ApiActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ApiActivity_ViewBinding(final ApiActivity target, View source) {
    this.target = target;

    View view;
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.rv_list, "field 'mRecyclerView'", RecyclerView.class);
    target.mSwipe = Utils.findRequiredViewAsType(source, R.id.mSwipe, "field 'mSwipe'", SwipeRefreshLayout.class);
    view = Utils.findRequiredView(source, R.id.add, "method 'addApi'");
    view7f090027 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.addApi();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ApiActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.mRecyclerView = null;
    target.mSwipe = null;

    view7f090027.setOnClickListener(null);
    view7f090027 = null;
  }
}
