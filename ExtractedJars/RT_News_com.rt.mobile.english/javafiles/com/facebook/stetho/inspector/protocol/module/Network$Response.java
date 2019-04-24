// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import org.json.JSONObject;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			Network

public static class Network$Response
{

	public int connectionId;
	public boolean connectionReused;
	public Boolean fromDiskCache;
	public JSONObject headers;
	public String headersText;
	public String mimeType;
	public JSONObject requestHeaders;
	public String requestHeadersTest;
	public int status;
	public String statusText;
	public iming timing;
	public String url;

	public Network$Response()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}
}
