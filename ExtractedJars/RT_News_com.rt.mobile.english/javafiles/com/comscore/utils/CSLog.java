// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.utils;

import android.util.Log;
import com.google.devtools.build.android.desugar.runtime.ThrowableExtension;

// Referenced classes of package com.comscore.utils:
//			Constants

public class CSLog
{

	public CSLog()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void d(Class class1, String s)
	{
		if(Constants.DEBUG)
	//*   0    0:getstatic       #17  <Field boolean Constants.DEBUG>
	//*   1    3:ifeq            15
			Log.d(class1.getSimpleName(), s);
	//    2    6:aload_0         
	//    3    7:invokevirtual   #23  <Method String Class.getSimpleName()>
	//    4   10:aload_1         
	//    5   11:invokestatic    #28  <Method int Log.d(String, String)>
	//    6   14:pop             
	//    7   15:return          
	}

	public static void d(Object obj, String s)
	{
		if(Constants.DEBUG)
	//*   0    0:getstatic       #17  <Field boolean Constants.DEBUG>
	//*   1    3:ifeq            14
			d(obj.getClass(), s);
	//    2    6:aload_0         
	//    3    7:invokevirtual   #35  <Method Class Object.getClass()>
	//    4   10:aload_1         
	//    5   11:invokestatic    #37  <Method void d(Class, String)>
	//    6   14:return          
	}

	public static void e(Class class1, String s)
	{
		if(Constants.DEBUG)
	//*   0    0:getstatic       #17  <Field boolean Constants.DEBUG>
	//*   1    3:ifeq            15
			Log.e(class1.getSimpleName(), s);
	//    2    6:aload_0         
	//    3    7:invokevirtual   #23  <Method String Class.getSimpleName()>
	//    4   10:aload_1         
	//    5   11:invokestatic    #40  <Method int Log.e(String, String)>
	//    6   14:pop             
	//    7   15:return          
	}

	public static void e(Object obj, String s)
	{
		if(Constants.DEBUG)
	//*   0    0:getstatic       #17  <Field boolean Constants.DEBUG>
	//*   1    3:ifeq            14
			e(obj.getClass(), s);
	//    2    6:aload_0         
	//    3    7:invokevirtual   #35  <Method Class Object.getClass()>
	//    4   10:aload_1         
	//    5   11:invokestatic    #42  <Method void e(Class, String)>
	//    6   14:return          
	}

	public static void printStackTrace(Exception exception)
	{
		if(Constants.DEBUG)
	//*   0    0:getstatic       #17  <Field boolean Constants.DEBUG>
	//*   1    3:ifeq            10
			ThrowableExtension.printStackTrace(((Throwable) (exception)));
	//    2    6:aload_0         
	//    3    7:invokestatic    #49  <Method void ThrowableExtension.printStackTrace(Throwable)>
	//    4   10:return          
	}

	public static void v(Class class1, String s)
	{
		if(Constants.DEBUG)
	//*   0    0:getstatic       #17  <Field boolean Constants.DEBUG>
	//*   1    3:ifeq            15
			Log.v(class1.getSimpleName(), s);
	//    2    6:aload_0         
	//    3    7:invokevirtual   #23  <Method String Class.getSimpleName()>
	//    4   10:aload_1         
	//    5   11:invokestatic    #52  <Method int Log.v(String, String)>
	//    6   14:pop             
	//    7   15:return          
	}

	public static void v(Object obj, String s)
	{
		if(Constants.DEBUG)
	//*   0    0:getstatic       #17  <Field boolean Constants.DEBUG>
	//*   1    3:ifeq            14
			v(obj.getClass(), s);
	//    2    6:aload_0         
	//    3    7:invokevirtual   #35  <Method Class Object.getClass()>
	//    4   10:aload_1         
	//    5   11:invokestatic    #54  <Method void v(Class, String)>
	//    6   14:return          
	}
}
