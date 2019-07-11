// Generated code from Butter Knife. Do not modify!
package anime.project.dilidili.main.player;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import anime.project.dilidili.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PlayerActivity_ViewBinding implements Unbinder {
  private PlayerActivity target;

  private View view7f0900fc;

  private View view7f09012c;

  private View view7f0900f0;

  @UiThread
  public PlayerActivity_ViewBinding(PlayerActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PlayerActivity_ViewBinding(final PlayerActivity target, View source) {
    this.target = target;

    View view;
    target.player = Utils.findRequiredViewAsType(source, R.id.player, "field 'player'", JZPlayer.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.rv_list, "field 'recyclerView'", RecyclerView.class);
    target.linearLayout = Utils.findRequiredViewAsType(source, R.id.nav_view, "field 'linearLayout'", LinearLayout.class);
    target.drawerLayout = Utils.findRequiredViewAsType(source, R.id.drawer_layout, "field 'drawerLayout'", DrawerLayout.class);
    target.titleView = Utils.findRequiredViewAsType(source, R.id.anime_title, "field 'titleView'", TextView.class);
    view = Utils.findRequiredView(source, R.id.pic, "field 'pic' and method 'startPic'");
    target.pic = Utils.castView(view, R.id.pic, "field 'pic'", ImageView.class);
    view7f0900fc = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.startPic();
      }
    });
    view = Utils.findRequiredView(source, R.id.select_player, "method 'onClick'");
    view7f09012c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(Utils.castParam(p0, "doClick", 0, "onClick", 0, TextView.class));
      }
    });
    view = Utils.findRequiredView(source, R.id.open_in_browser, "method 'onClick'");
    view7f0900f0 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(Utils.castParam(p0, "doClick", 0, "onClick", 0, TextView.class));
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    PlayerActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.player = null;
    target.recyclerView = null;
    target.linearLayout = null;
    target.drawerLayout = null;
    target.titleView = null;
    target.pic = null;

    view7f0900fc.setOnClickListener(null);
    view7f0900fc = null;
    view7f09012c.setOnClickListener(null);
    view7f09012c = null;
    view7f0900f0.setOnClickListener(null);
    view7f0900f0 = null;
  }
}
