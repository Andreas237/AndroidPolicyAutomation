// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;
import android.view.WindowInsets;

// Referenced classes of package android.support.v4.view:
//			ViewCompat, WindowInsetsCompat, OnApplyWindowInsetsListener

class ViewCompat$ViewCompatApi21Impl$1
	implements android.view.View$OnApplyWindowInsetsListener
{

	public WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
	{
		windowinsets = ((WindowInsets) (WindowInsetsCompat.wrap(((Object) (windowinsets)))));
	//    0    0:aload_2         
	//    1    1:invokestatic    #36  <Method WindowInsetsCompat WindowInsetsCompat.wrap(Object)>
	//    2    4:astore_2        
		return (WindowInsets)WindowInsetsCompat.unwrap(val$listener.onApplyWindowInsets(view, ((WindowInsetsCompat) (windowinsets))));
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field OnApplyWindowInsetsListener val$listener>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #41  <Method WindowInsetsCompat OnApplyWindowInsetsListener.onApplyWindowInsets(View, WindowInsetsCompat)>
	//    8   16:invokestatic    #45  <Method Object WindowInsetsCompat.unwrap(WindowInsetsCompat)>
	//    9   19:checkcast       #47  <Class WindowInsets>
	//   10   22:areturn         
	}

	final ViewCompat.ViewCompatApi21Impl this$0;
	final OnApplyWindowInsetsListener val$listener;

	ViewCompat$ViewCompatApi21Impl$1()
	{
		this$0 = final_viewcompatapi21impl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field ViewCompat$ViewCompatApi21Impl this$0>
		val$listener = OnApplyWindowInsetsListener.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field OnApplyWindowInsetsListener val$listener>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
