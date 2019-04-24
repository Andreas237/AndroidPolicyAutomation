// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.facebook.stetho.inspector.network:
//			ResponseHandler

public interface NetworkEventReporter
{
	public static interface InspectorHeaders
	{

		public abstract String firstHeaderValue(String s);

		public abstract int headerCount();

		public abstract String headerName(int i);

		public abstract String headerValue(int i);
	}

	public static interface InspectorRequest
		extends InspectorHeaders
	{

		public abstract byte[] body()
			throws IOException;

		public abstract String friendlyName();

		public abstract Integer friendlyNameExtra();

		public abstract String id();

		public abstract String method();

		public abstract String url();
	}

	public static interface InspectorResponse
		extends InspectorHeaders
	{

		public abstract int connectionId();

		public abstract boolean connectionReused();

		public abstract boolean fromDiskCache();

		public abstract String reasonPhrase();

		public abstract String requestId();

		public abstract int statusCode();

		public abstract String url();
	}


	public abstract void dataReceived(String s, int i, int j);

	public abstract void dataSent(String s, int i, int j);

	public abstract void httpExchangeFailed(String s, String s1);

	public abstract InputStream interpretResponseStream(String s, String s1, String s2, InputStream inputstream, ResponseHandler responsehandler);

	public abstract boolean isEnabled();

	public abstract void requestWillBeSent(InspectorRequest inspectorrequest);

	public abstract void responseHeadersReceived(InspectorResponse inspectorresponse);

	public abstract void responseReadFailed(String s, String s1);

	public abstract void responseReadFinished(String s);
}
