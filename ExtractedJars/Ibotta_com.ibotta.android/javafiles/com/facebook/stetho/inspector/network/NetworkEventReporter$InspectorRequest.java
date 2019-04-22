// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import java.io.IOException;

// Referenced classes of package com.facebook.stetho.inspector.network:
//			NetworkEventReporter

public static interface NetworkEventReporter$InspectorRequest
	extends NetworkEventReporter$InspectorHeaders
{

	public abstract byte[] body()
		throws IOException;

	public abstract String friendlyName();

	public abstract Integer friendlyNameExtra();

	public abstract String id();

	public abstract String method();

	public abstract String url();
}
