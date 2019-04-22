// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server;


// Referenced classes of package com.facebook.stetho.server:
//			ProtocolDetectingSocketHandler, SocketLikeHandler

private static class ProtocolDetectingSocketHandler$HandlerInfo
{

	public final SocketLikeHandler handler;
	public final  magicMatcher;

	private ProtocolDetectingSocketHandler$HandlerInfo( , SocketLikeHandler socketlikehandler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		magicMatcher = ;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field ProtocolDetectingSocketHandler$MagicMatcher magicMatcher>
		handler = socketlikehandler;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field SocketLikeHandler handler>
	//    8   14:return          
	}

	ProtocolDetectingSocketHandler$HandlerInfo( , SocketLikeHandler socketlikehandler, ProtocolDetectingSocketHandler._cls1 _pcls1)
	{
		this(, socketlikehandler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #24  <Method void ProtocolDetectingSocketHandler$HandlerInfo(ProtocolDetectingSocketHandler$MagicMatcher, SocketLikeHandler)>
	//    4    6:return          
	}
}
