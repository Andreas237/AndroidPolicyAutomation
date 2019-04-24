// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.inputmethod.InputMethodManager;

// Referenced classes of package com.irobot.home:
//			BraavaPrefsTableActivity

class BraavaPrefsTableActivity$1
	implements Runnable
{

	public void run()
	{
		a.showSoftInput(((android.view.View) (b.d)), 1);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field InputMethodManager a>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field BraavaPrefsTableActivity b>
	//    4    8:getfield        #29  <Field android.widget.EditText BraavaPrefsTableActivity.d>
	//    5   11:iconst_1        
	//    6   12:invokevirtual   #35  <Method boolean InputMethodManager.showSoftInput(android.view.View, int)>
	//    7   15:pop             
	//    8   16:return          
	}

	final InputMethodManager a;
	final BraavaPrefsTableActivity b;

	BraavaPrefsTableActivity$1(BraavaPrefsTableActivity braavaprefstableactivity, InputMethodManager inputmethodmanager)
	{
		b = braavaprefstableactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BraavaPrefsTableActivity b>
		a = inputmethodmanager;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field InputMethodManager a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
