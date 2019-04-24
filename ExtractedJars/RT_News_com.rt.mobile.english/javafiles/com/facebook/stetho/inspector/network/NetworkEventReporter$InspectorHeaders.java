// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;


// Referenced classes of package com.facebook.stetho.inspector.network:
//			NetworkEventReporter

public static interface NetworkEventReporter$InspectorHeaders
{

	public abstract String firstHeaderValue(String s);

	public abstract int headerCount();

	public abstract String headerName(int i);

	public abstract String headerValue(int i);
}
