// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.jsonrpc;


// Referenced classes of package com.facebook.stetho.inspector.jsonrpc:
//			PendingRequestCallback

public class PendingRequest
{

	public PendingRequest(long l, PendingRequestCallback pendingrequestcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		requestId = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #16  <Field long requestId>
		callback = pendingrequestcallback;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #18  <Field PendingRequestCallback callback>
	//    8   14:return          
	}

	public final PendingRequestCallback callback;
	public final long requestId;
}
