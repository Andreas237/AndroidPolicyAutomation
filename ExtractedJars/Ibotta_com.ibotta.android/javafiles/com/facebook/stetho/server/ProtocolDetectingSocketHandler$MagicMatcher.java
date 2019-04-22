// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.facebook.stetho.server:
//			ProtocolDetectingSocketHandler

public static interface ProtocolDetectingSocketHandler$MagicMatcher
{

	public abstract boolean matches(InputStream inputstream)
		throws IOException;
}
