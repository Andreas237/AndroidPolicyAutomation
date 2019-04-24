// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.rest;

import java.net.URI;
import org.c.c.a.e;
import org.c.c.a.p;
import org.c.c.f;

public class CustomRequestFactory extends p
{

	public CustomRequestFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void p()>
	//    2    4:return          
	}

	public e createRequest(URI uri, f f)
	{
		char c;
		if(uri.getPath().contains("supportedcountries"))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #26  <Method String URI.getPath()>
	//*   2    4:ldc1            #11  <String "supportedcountries">
	//*   3    6:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//*   4    9:ifeq            29
			c = '\u1388';
	//    5   12:sipush          5000
	//    6   15:istore_3        
		else
	//*   7   16:aload_0         
	//*   8   17:iload_3         
	//*   9   18:invokevirtual   #36  <Method void setConnectTimeout(int)>
	//*  10   21:aload_0         
	//*  11   22:iload_3         
	//*  12   23:invokevirtual   #39  <Method void setReadTimeout(int)>
	//*  13   26:goto            36
			c = '\u7530';
	//   14   29:sipush          30000
	//   15   32:istore_3        
		setConnectTimeout(((int) (c)));
		setReadTimeout(((int) (c)));
	//*  16   33:goto            16
		return super.createRequest(uri, f);
	//   17   36:aload_0         
	//   18   37:aload_1         
	//   19   38:aload_2         
	//   20   39:invokespecial   #41  <Method e p.createRequest(URI, f)>
	//   21   42:areturn         
	}

	private static final int DEFAULT_TIMEOUT_MS = 30000;
	private static final String SUPPORTED_COUNTRIES = "supportedcountries";
	private static final int SUPPORTED_COUNTRIES_TIMEOUT_MS = 5000;
}
