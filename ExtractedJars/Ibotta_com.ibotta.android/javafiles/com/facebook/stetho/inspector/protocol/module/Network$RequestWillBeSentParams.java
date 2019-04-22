// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;


// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			Network

public static class Network$RequestWillBeSentParams
{

	public String documentURL;
	public String frameId;
	public Network.Initiator initiator;
	public String loaderId;
	public Network.Response redirectResponse;
	public Network.Request request;
	public String requestId;
	public double timestamp;
	public Page.ResourceType type;

	public Network$RequestWillBeSentParams()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:return          
	}
}
