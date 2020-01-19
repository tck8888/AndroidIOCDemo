package com.tck.mybutterknife;

import android.view.View;

public abstract class DebouncingOnClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {

        doClick(v);
    }

    abstract void doClick(View view);
}
