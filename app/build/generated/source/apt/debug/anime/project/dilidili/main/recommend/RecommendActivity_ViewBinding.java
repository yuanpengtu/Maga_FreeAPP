// Generated code from Butter Knife. Do not modify!
package anime.project.dilidili.main.recommend;

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

public class RecommendActivity_ViewBinding implements Unbinder {
  private RecommendActivity target;

  @UiThread
  public RecommendActivity_ViewBinding(RecommendActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RecommendActivity_ViewBinding(RecommendActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.rv_list, "field 'mRecyclerView'", RecyclerView.class);
    target.mSwipe = Utils.findRequiredViewAsType(source, R.id.mSwipe, "field 'mSwipe'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RecommendActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.mRecyclerView = null;
    target.mSwipe = null;
  }
}
