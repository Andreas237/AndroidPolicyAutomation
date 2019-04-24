// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.HashMap;

// Referenced classes of package com.irobot.core:
//			HttpResponse

public abstract class HttpsRequestor
{

	public HttpsRequestor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract HttpResponse performRequest(String s, HashMap hashmap);
}
