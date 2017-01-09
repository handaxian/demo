// Generated code from Butter Knife. Do not modify!
package com.demo;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding<T extends MainActivity> implements Unbinder {
  protected T target;

  private View view2131427425;

  private View view2131427426;

  private View view2131427427;

  private View view2131427428;

  private View view2131427429;

  private View view2131427430;

  private View view2131427431;

  private View view2131427432;

  private View view2131427433;

  private View view2131427434;

  @UiThread
  public MainActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn1, "field 'btn1' and method 'onClick'");
    target.btn1 = Utils.castView(view, R.id.btn1, "field 'btn1'", Button.class);
    view2131427425 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn2, "field 'btn2' and method 'onClick'");
    target.btn2 = Utils.castView(view, R.id.btn2, "field 'btn2'", Button.class);
    view2131427426 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn3, "field 'btn3' and method 'onClick'");
    target.btn3 = Utils.castView(view, R.id.btn3, "field 'btn3'", Button.class);
    view2131427427 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn4, "field 'btn4' and method 'onClick'");
    target.btn4 = Utils.castView(view, R.id.btn4, "field 'btn4'", Button.class);
    view2131427428 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn5, "field 'btn5' and method 'onClick'");
    target.btn5 = Utils.castView(view, R.id.btn5, "field 'btn5'", Button.class);
    view2131427429 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn6, "field 'btn6' and method 'onClick'");
    target.btn6 = Utils.castView(view, R.id.btn6, "field 'btn6'", Button.class);
    view2131427430 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn7, "field 'btn7' and method 'onClick'");
    target.btn7 = Utils.castView(view, R.id.btn7, "field 'btn7'", Button.class);
    view2131427431 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn8, "field 'btn8' and method 'onClick'");
    target.btn8 = Utils.castView(view, R.id.btn8, "field 'btn8'", Button.class);
    view2131427432 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn9, "field 'btn9' and method 'onClick'");
    target.btn9 = Utils.castView(view, R.id.btn9, "field 'btn9'", Button.class);
    view2131427433 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn10, "field 'btn10' and method 'onClick'");
    target.btn10 = Utils.castView(view, R.id.btn10, "field 'btn10'", Button.class);
    view2131427434 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.btn1 = null;
    target.btn2 = null;
    target.btn3 = null;
    target.btn4 = null;
    target.btn5 = null;
    target.btn6 = null;
    target.btn7 = null;
    target.btn8 = null;
    target.btn9 = null;
    target.btn10 = null;

    view2131427425.setOnClickListener(null);
    view2131427425 = null;
    view2131427426.setOnClickListener(null);
    view2131427426 = null;
    view2131427427.setOnClickListener(null);
    view2131427427 = null;
    view2131427428.setOnClickListener(null);
    view2131427428 = null;
    view2131427429.setOnClickListener(null);
    view2131427429 = null;
    view2131427430.setOnClickListener(null);
    view2131427430 = null;
    view2131427431.setOnClickListener(null);
    view2131427431 = null;
    view2131427432.setOnClickListener(null);
    view2131427432 = null;
    view2131427433.setOnClickListener(null);
    view2131427433 = null;
    view2131427434.setOnClickListener(null);
    view2131427434 = null;

    this.target = null;
  }
}
