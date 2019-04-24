// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.ksoichiro.android.observablescrollview;

import android.view.ViewGroup;

// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//			ObservableScrollViewCallbacks

public interface Scrollable
{

	public abstract int getCurrentScrollY();

	public abstract void scrollVerticallyTo(int i);

	public abstract void setScrollViewCallbacks(ObservableScrollViewCallbacks observablescrollviewcallbacks);

	public abstract void setTouchInterceptionViewGroup(ViewGroup viewgroup);
}
