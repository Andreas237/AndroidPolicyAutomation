// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

// Referenced classes of package com.irobot.home:
//			BraavaPrefsTableActivity

class BraavaPrefsTableActivity$3
	implements android.content.ener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		b.d.requestFocus();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field BraavaPrefsTableActivity b>
	//    2    4:getfield        #30  <Field EditText BraavaPrefsTableActivity.d>
	//    3    7:invokevirtual   #36  <Method boolean EditText.requestFocus()>
	//    4   10:pop             
		a.showSoftInput(((android.view.View) (b.d)), 1);
	//    5   11:aload_0         
	//    6   12:getfield        #20  <Field InputMethodManager a>
	//    7   15:aload_0         
	//    8   16:getfield        #18  <Field BraavaPrefsTableActivity b>
	//    9   19:getfield        #30  <Field EditText BraavaPrefsTableActivity.d>
	//   10   22:iconst_1        
	//   11   23:invokevirtual   #42  <Method boolean InputMethodManager.showSoftInput(android.view.View, int)>
	//   12   26:pop             
	//   13   27:return          
	}

	final InputMethodManager a;
	final BraavaPrefsTableActivity b;

	BraavaPrefsTableActivity$3(BraavaPrefsTableActivity braavaprefstableactivity, InputMethodManager inputmethodmanager)
	{
		b = braavaprefstableactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field BraavaPrefsTableActivity b>
		a = inputmethodmanager;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field InputMethodManager a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
