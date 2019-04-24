// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.rest;

import com.irobot.home.util.o;
import org.androidannotations.a.a.a.b;

public class RegistrationRestErrorHandler
	implements b
{

	public RegistrationRestErrorHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public void onRestClientExceptionThrown(org.c.b.b b1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #19  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Exception:");
	//    4    8:aload_2         
	//    5    9:ldc1            #22  <String "Exception:">
	//    6   11:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(b1.getMessage());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #32  <Method String org.c.b.b.getMessage()>
	//   11   20:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		o.e("RegRestError", stringbuilder.toString());
	//   13   24:ldc1            #10  <String "RegRestError">
	//   14   26:aload_2         
	//   15   27:invokevirtual   #35  <Method String StringBuilder.toString()>
	//   16   30:invokestatic    #41  <Method void o.e(String, String)>
	//   17   33:return          
	}

	private static final String TAG = "RegRestError";
}
