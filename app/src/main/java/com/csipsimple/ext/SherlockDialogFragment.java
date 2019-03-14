package com.csipsimple.ext;

import android.app.Activity;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;


public class SherlockDialogFragment extends DialogFragment implements Watson.OnCreateOptionsMenuListener, Watson.OnPrepareOptionsMenuListener, Watson.OnOptionsItemSelectedListener {
    private AppCompatActivity mActivity;

    public AppCompatActivity getSherlockActivity() {
        return mActivity;
    }

    @Override
    public void onAttach(Activity activity) {
        if (!(activity instanceof AppCompatActivity)) {
            throw new IllegalStateException(getClass().getSimpleName() + " must be attached to a SherlockFragmentActivity.");
        }
        mActivity = (AppCompatActivity)activity;

        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        mActivity = null;
        super.onDetach();
    }
//
//    @Override
//    public  void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
//        onCreateOptionsMenu(new MenuWrapper(menu), mActivity.getMenuInflater());
//    }

//    @Override
//    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
//        //Nothing to see here.
//    }
//
//    @Override
//    public final void onPrepareOptionsMenu(android.view.Menu menu) {
//        onPrepareOptionsMenu(new MenuWrapper(menu));
//    }
//
//    @Override
//    public void onPrepareOptionsMenu(Menu menu) {
//        //Nothing to see here.
//    }

//    @Override
//    public final boolean onOptionsItemSelected(android.view.MenuItem item) {
//        return onOptionsItemSelected(new MenuItemWrapper(item));
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        //Nothing to see here.
//        return false;
//    }
}
