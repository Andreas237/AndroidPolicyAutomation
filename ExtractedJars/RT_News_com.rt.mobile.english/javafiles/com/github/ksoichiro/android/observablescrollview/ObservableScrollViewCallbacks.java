// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.ksoichiro.android.observablescrollview;


// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//			ScrollState

public interface ObservableScrollViewCallbacks
{

	public abstract void onDownMotionEvent();

	public abstract void onScrollChanged(int i, boolean flag, boolean flag1);

	public abstract void onUpOrCancelMotionEvent(ScrollState scrollstate);
}
