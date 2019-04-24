// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

// Referenced classes of package com.irobot.home:
//			RobotSettingsActivity

class RobotSettingsActivity$b$1
	implements android.content.tener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		b.a.f.requestFocus();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RobotSettingsActivity$b b>
	//    2    4:getfield        #32  <Field RobotSettingsActivity RobotSettingsActivity$b.a>
	//    3    7:getfield        #36  <Field EditText RobotSettingsActivity.f>
	//    4   10:invokevirtual   #42  <Method boolean EditText.requestFocus()>
	//    5   13:pop             
		a.showSoftInput(((android.view.View) (b.a.f)), 1);
	//    6   14:aload_0         
	//    7   15:getfield        #23  <Field InputMethodManager a>
	//    8   18:aload_0         
	//    9   19:getfield        #21  <Field RobotSettingsActivity$b b>
	//   10   22:getfield        #32  <Field RobotSettingsActivity RobotSettingsActivity$b.a>
	//   11   25:getfield        #36  <Field EditText RobotSettingsActivity.f>
	//   12   28:iconst_1        
	//   13   29:invokevirtual   #48  <Method boolean InputMethodManager.showSoftInput(android.view.View, int)>
	//   14   32:pop             
	//   15   33:return          
	}

	final InputMethodManager a;
	final RobotSettingsActivity.b b;

	RobotSettingsActivity$b$1(RobotSettingsActivity.b b1, InputMethodManager inputmethodmanager)
	{
		b = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field RobotSettingsActivity$b b>
		a = inputmethodmanager;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field InputMethodManager a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
	//    8   14:return          
	}
}
