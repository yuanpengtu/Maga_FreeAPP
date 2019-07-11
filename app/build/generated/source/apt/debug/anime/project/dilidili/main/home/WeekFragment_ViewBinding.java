// Generated code from Butter Knife. Do not modify!
package anime.project.dilidili.main.home;

import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import anime.project.dilidili.R;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WeekFragment_ViewBinding implements Unbinder {
  private WeekFragment target;

  @UiThread
  public WeekFragment_ViewBinding(WeekFragment target, View source) {
    this.target = target;

    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.rv_list, "field 'recyclerView'", RecyclerView.class);
    target.loading = Utils.findRequiredViewAsType(source, R.id.loading, "field 'loading'", ProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WeekFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;
    target.loading = null;
  }
}
