// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;


// Referenced classes of package com.facebook.stetho.inspector.network:
//			NetworkEventReporter

public static interface NetworkEventReporter$InspectorResponse
	extends NetworkEventReporter.InspectorHeaders
{

	public abstract int connectionId();

	public abstract boolean connectionReused();

	public abstract boolean fromDiskCache();

	public abstract String reasonPhrase();

	public abstract String requestId();

	public abstract int statusCode();

	public abstract String url();
}
