// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.facebook.stetho.server:
//			ProtocolDetectingSocketHandler

public static class ProtocolDetectingSocketHandler$AlwaysMatchMatcher
	implements ProtocolDetectingSocketHandler.MagicMatcher
{

	public boolean matches(InputStream inputstream)
		throws IOException
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public ProtocolDetectingSocketHandler$AlwaysMatchMatcher()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
