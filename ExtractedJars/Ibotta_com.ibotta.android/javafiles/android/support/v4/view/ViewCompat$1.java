// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;
import android.view.WindowInsets;

// Referenced classes of package android.support.v4.view:
//			ViewCompat, WindowInsetsCompat, OnApplyWindowInsetsListener

static final class ViewCompat$1
	implements android.view.indowInsetsListener
{

	public WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
	{
		windowinsets = ((WindowInsets) (WindowInsetsCompat.wrap(((Object) (windowinsets)))));
	//    0    0:aload_2         
	//    1    1:invokestatic    #29  <Method WindowInsetsCompat WindowInsetsCompat.wrap(Object)>
	//    2    4:astore_2        
		return (WindowInsets)WindowInsetsCompat.unwrap(val$listener.onApplyWindowInsets(view, ((WindowInsetsCompat) (windowinsets))));
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field OnApplyWindowInsetsListener val$listener>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #34  <Method WindowInsetsCompat OnApplyWindowInsetsListener.onApplyWindowInsets(View, WindowInsetsCompat)>
	//    8   16:invokestatic    #38  <Method Object WindowInsetsCompat.unwrap(WindowInsetsCompat)>
	//    9   19:checkcast       #40  <Class WindowInsets>
	//   10   22:areturn         
	}

	final OnApplyWindowInsetsListener val$listener;

	ViewCompat$1(OnApplyWindowInsetsListener onapplywindowinsetslistener)
	{
		val$listener = onapplywindowinsetslistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field OnApplyWindowInsetsListener val$listener>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
