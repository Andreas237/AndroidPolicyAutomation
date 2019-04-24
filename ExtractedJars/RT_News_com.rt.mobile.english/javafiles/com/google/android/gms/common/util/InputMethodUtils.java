// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class InputMethodUtils
{

	private InputMethodUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static boolean hideSoftInput(Context context, View view)
	{
		context = ((Context) (zzf(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #15  <Method InputMethodManager zzf(Context)>
	//    2    4:astore_0        
		if(context != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          21
		{
			((InputMethodManager) (context)).hideSoftInputFromWindow(view.getWindowToken(), 0);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #21  <Method android.os.IBinder View.getWindowToken()>
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #27  <Method boolean InputMethodManager.hideSoftInputFromWindow(android.os.IBinder, int)>
	//   10   18:pop             
			return true;
	//   11   19:iconst_1        
	//   12   20:ireturn         
		} else
		{
			return false;
	//   13   21:iconst_0        
	//   14   22:ireturn         
		}
	}

	public static boolean isAcceptingText(Context context)
	{
		context = ((Context) (zzf(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #15  <Method InputMethodManager zzf(Context)>
	//    2    4:astore_0        
		if(context != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          14
			return ((InputMethodManager) (context)).isAcceptingText();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #32  <Method boolean InputMethodManager.isAcceptingText()>
	//    7   13:ireturn         
		else
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public static void restart(Context context, View view)
	{
		context = ((Context) (zzf(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #15  <Method InputMethodManager zzf(Context)>
	//    2    4:astore_0        
		if(context != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          14
			((InputMethodManager) (context)).restartInput(view);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #38  <Method void InputMethodManager.restartInput(View)>
	//    8   14:return          
	}

	public static boolean showSoftInput(Context context, View view)
	{
		context = ((Context) (zzf(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #15  <Method InputMethodManager zzf(Context)>
	//    2    4:astore_0        
		if(context != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          18
		{
			((InputMethodManager) (context)).showSoftInput(view, 0);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #42  <Method boolean InputMethodManager.showSoftInput(View, int)>
	//    9   15:pop             
			return true;
	//   10   16:iconst_1        
	//   11   17:ireturn         
		} else
		{
			return false;
	//   12   18:iconst_0        
	//   13   19:ireturn         
		}
	}

	private static InputMethodManager zzf(Context context)
	{
		return (InputMethodManager)context.getSystemService("input_method");
	//    0    0:aload_0         
	//    1    1:ldc1            #44  <String "input_method">
	//    2    3:invokevirtual   #50  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #23  <Class InputMethodManager>
	//    4    9:areturn         
	}
}
