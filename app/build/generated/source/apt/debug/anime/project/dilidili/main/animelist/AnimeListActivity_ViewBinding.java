// Generated code from Butter Knife. Do not modify!
package anime.project.dilidili.main.animelist;

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
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AnimeListActivity_ViewBinding implements Unbinder {
  private AnimeListActivity target;

  private View view7f090106;

  @UiThread
  public AnimeListActivity_ViewBinding(AnimeListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AnimeListActivity_ViewBinding(final AnimeListActivity target, View source) {
    this.target = target;

    View view;
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.rv_list, "field 'mRecyclerView'", RecyclerView.class);
    target.mSwipe = Utils.findRequiredViewAsType(source, R.id.mSwipe, "field 'mSwipe'", SwipeRefreshLayout.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    view = Utils.findRequiredView(source, R.id.query, "field 'query' and method 'query'");
    target.query = Utils.castView(view, R.id.query, "field 'query'", FloatingActionButton.class);
    view7f090106 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.query();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    AnimeListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
    target.mSwipe = null;
    target.toolbar = null;
    target.query = null;

    view7f090106.setOnClickListener(null);
    view7f090106 = null;
  }
}
