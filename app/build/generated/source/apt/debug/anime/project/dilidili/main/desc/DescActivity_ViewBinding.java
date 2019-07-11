// Generated code from Butter Knife. Do not modify!
package anime.project.dilidili.main.desc;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import anime.project.dilidili.R;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DescActivity_ViewBinding implements Unbinder {
  private DescActivity target;

  @UiThread
  public DescActivity_ViewBinding(DescActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DescActivity_ViewBinding(DescActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.rv_list, "field 'mRecyclerView'", RecyclerView.class);
    target.animeImg = Utils.findRequiredViewAsType(source, R.id.anime_img, "field 'animeImg'", ImageView.class);
    target.region = Utils.findRequiredViewAsType(source, R.id.region, "field 'region'", AppCompatTextView.class);
    target.year = Utils.findRequiredViewAsType(source, R.id.year, "field 'year'", AppCompatTextView.class);
    target.tag = Utils.findRequiredViewAsType(source, R.id.tag, "field 'tag'", AppCompatTextView.class);
    target.show = Utils.findRequiredViewAsType(source, R.id.show, "field 'show'", AppCompatTextView.class);
    target.state = Utils.findRequiredViewAsType(source, R.id.state, "field 'state'", AppCompatTextView.class);
    target.mSwipe = Utils.findRequiredViewAsType(source, R.id.mSwipe, "field 'mSwipe'", SwipeRefreshLayout.class);
    target.imageView = Utils.findRequiredViewAsType(source, R.id.title_img, "field 'imageView'", ImageView.class);
    target.favorite = Utils.findRequiredViewAsType(source, R.id.favorite, "field 'favorite'", FloatingActionButton.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DescActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.mRecyclerView = null;
    target.animeImg = null;
    target.region = null;
    target.year = null;
    target.tag = null;
    target.show = null;
    target.state = null;
    target.mSwipe = null;
    target.imageView = null;
    target.favorite = null;
  }
}
