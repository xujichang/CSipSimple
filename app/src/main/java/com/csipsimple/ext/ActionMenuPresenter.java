package com.csipsimple.ext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Parcelable;
import android.support.v7.view.menu.BaseMenuPresenter;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuView;

/**
 * Des:CSipSimple - com.csipsimple.ext
 *
 * @author xujichang
 * @date 2019/3/14
 * <p>
 * modify:
 */
public class ActionMenuPresenter extends BaseMenuPresenter {
    @SuppressLint("RestrictedApi")
    public ActionMenuPresenter(Context context, int menuLayoutRes, int itemLayoutRes) {
        super(context, menuLayoutRes, itemLayoutRes);
    }

    public ActionMenuPresenter(Context context) {
        this(context, 0, 0);
    }

    @Override
    public void bindItemView(MenuItemImpl menuItem, MenuView.ItemView itemView) {

    }

    @Override
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override
    public void onRestoreInstanceState(Parcelable parcelable) {

    }

    public void setReserveOverflow(boolean b) {

    }

    public void setWidthLimit(int w, boolean b) {

    }

    public void setItemLimit(int i) {

    }
}
