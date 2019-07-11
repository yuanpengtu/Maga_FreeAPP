// Generated code from Butter Knife. Do not modify!
package anime.project.dilidili.main.setting;

import android.view.View;
import android.widget.RelativeLayout;
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

public class SettingActivity_ViewBinding implements Unbinder {
  private SettingActivity target;

  private View view7f09012f;

  private View view7f090130;

  private View view7f09012e;

  private View view7f090131;

  @UiThread
  public SettingActivity_ViewBinding(SettingActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SettingActivity_ViewBinding(final SettingActivity target, View source) {
    this.target = target;

    View view;
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.domain_default = Utils.findRequiredViewAsType(source, R.id.domain_default, "field 'domain_default'", TextView.class);
    target.search_default = Utils.findRequiredViewAsType(source, R.id.search_default, "field 'search_default'", TextView.class);
    target.player_default = Utils.findRequiredViewAsType(source, R.id.player_default, "field 'player_default'", TextView.class);
    target.api = Utils.findRequiredViewAsType(source, R.id.api, "field 'api'", TextView.class);
    view = Utils.findRequiredView(source, R.id.set_domain, "method 'onClick'");
    view7f09012f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(Utils.castParam(p0, "doClick", 0, "onClick", 0, RelativeLayout.class));
      }
    });
    view = Utils.findRequiredView(source, R.id.set_player, "method 'onClick'");
    view7f090130 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(Utils.castParam(p0, "doClick", 0, "onClick", 0, RelativeLayout.class));
      }
    });
    view = Utils.findRequiredView(source, R.id.set_api_source, "method 'onClick'");
    view7f09012e = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(Utils.castParam(p0, "doClick", 0, "onClick", 0, RelativeLayout.class));
      }
    });
    view = Utils.findRequiredView(source, R.id.set_search, "method 'onClick'");
    view7f090131 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(Utils.castParam(p0, "doClick", 0, "onClick", 0, RelativeLayout.class));
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    SettingActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.domain_default = null;
    target.search_default = null;
    target.player_default = null;
    target.api = null;

    view7f09012f.setOnClickListener(null);
    view7f09012f = null;
    view7f090130.setOnClickListener(null);
    view7f090130 = null;
    view7f09012e.setOnClickListener(null);
    view7f09012e = null;
    view7f090131.setOnClickListener(null);
    view7f090131 = null;
  }
}
