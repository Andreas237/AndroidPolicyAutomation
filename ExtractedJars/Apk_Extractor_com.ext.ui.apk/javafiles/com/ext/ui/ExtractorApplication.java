// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.app.Application;
import android.content.Context;
import android.support.v7.ci;

public class ExtractorApplication extends Application
{

	public ExtractorApplication()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Application()>
		b = (new StringBuilder()).append("").append(((Class) (com/ext/ui/ExtractorApplication)).getSimpleName()).toString();
	//    2    4:aload_0         
	//    3    5:new             #14  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void StringBuilder()>
	//    6   12:ldc1            #17  <String "">
	//    7   14:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:ldc1            #2   <Class ExtractorApplication>
	//    9   19:invokevirtual   #27  <Method String Class.getSimpleName()>
	//   10   22:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:invokevirtual   #30  <Method String StringBuilder.toString()>
	//   12   28:putfield        #32  <Field String b>
	//   13   31:return          
	}

	public Context getApplicationContext()
	{
		return ((Context) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Application.onCreate()>
		a = getApplicationContext();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #40  <Method Context getApplicationContext()>
	//    4    8:putstatic       #42  <Field Context a>
		ci.a(b, "----Application started");
	//    5   11:aload_0         
	//    6   12:getfield        #32  <Field String b>
	//    7   15:ldc1            #44  <String "----Application started">
	//    8   17:invokestatic    #49  <Method void ci.a(String, String)>
	//    9   20:return          
	}

	public static Context a;
	private String b;
}
