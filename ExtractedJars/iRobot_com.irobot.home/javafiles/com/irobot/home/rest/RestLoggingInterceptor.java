// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.rest;

import com.irobot.home.util.o;
import java.net.URI;
import org.c.c.a.f;
import org.c.c.a.h;
import org.c.c.a.i;

public class RestLoggingInterceptor
	implements h
{

	public RestLoggingInterceptor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	private void logRequest(org.c.c.h h1)
	{
		if(h1 != null && h1.getURI() != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          54
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #24  <Method URI org.c.c.h.getURI()>
	//*   4   10:ifnull          54
		{
			String s = TAG;
	//    5   13:getstatic       #26  <Field String TAG>
	//    6   16:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    7   17:new             #28  <Class StringBuilder>
	//    8   20:dup             
	//    9   21:invokespecial   #29  <Method void StringBuilder()>
	//   10   24:astore_3        
			stringbuilder.append("Rest URI: ");
	//   11   25:aload_3         
	//   12   26:ldc1            #31  <String "Rest URI: ">
	//   13   28:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:pop             
			stringbuilder.append(h1.getURI().toString());
	//   15   32:aload_3         
	//   16   33:aload_1         
	//   17   34:invokeinterface #24  <Method URI org.c.c.h.getURI()>
	//   18   39:invokevirtual   #41  <Method String URI.toString()>
	//   19   42:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   20   45:pop             
			o.b(s, stringbuilder.toString());
	//   21   46:aload_2         
	//   22   47:aload_3         
	//   23   48:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   24   51:invokestatic    #48  <Method void o.b(String, String)>
		}
	//   25   54:return          
	}

	public i intercept(org.c.c.h h1, byte abyte0[], f f1)
	{
		logRequest(h1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #52  <Method void logRequest(org.c.c.h)>
		return f1.a(h1, abyte0);
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokeinterface #58  <Method i f.a(org.c.c.h, byte[])>
	//    7   13:areturn         
	}

	private static final String TAG = "RestLoggingInterceptor";

	static 
	{
	//    0    0:return          
	}
}
