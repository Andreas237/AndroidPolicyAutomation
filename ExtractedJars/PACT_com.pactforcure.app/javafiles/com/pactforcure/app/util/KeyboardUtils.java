// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.util;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;

public class KeyboardUtils
{

	public KeyboardUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void dismissKeyboard(Activity activity)
	{
		View view = activity.getWindow().getCurrentFocus();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method Window Activity.getWindow()>
	//    2    4:invokevirtual   #23  <Method View Window.getCurrentFocus()>
	//    3    7:astore_1        
		if(view != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          30
			((InputMethodManager)activity.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
	//    6   12:aload_0         
	//    7   13:ldc1            #25  <String "input_method">
	//    8   15:invokevirtual   #29  <Method Object Activity.getSystemService(String)>
	//    9   18:checkcast       #31  <Class InputMethodManager>
	//   10   21:aload_1         
	//   11   22:invokevirtual   #37  <Method android.os.IBinder View.getWindowToken()>
	//   12   25:iconst_0        
	//   13   26:invokevirtual   #41  <Method boolean InputMethodManager.hideSoftInputFromWindow(android.os.IBinder, int)>
	//   14   29:pop             
	//   15   30:return          
	}
}
