// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//			NativeProtocol

public static class NativeProtocol$ProtocolVersionQueryResult
{

	public static NativeProtocol$ProtocolVersionQueryResult create(NativeProtocol.NativeAppInfo nativeappinfo, int i)
	{
		NativeProtocol$ProtocolVersionQueryResult nativeprotocol$protocolversionqueryresult = new NativeProtocol$ProtocolVersionQueryResult();
	//    0    0:new             #2   <Class NativeProtocol$ProtocolVersionQueryResult>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void NativeProtocol$ProtocolVersionQueryResult()>
	//    3    7:astore_2        
		nativeprotocol$protocolversionqueryresult.nativeAppInfo = nativeappinfo;
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:putfield        #20  <Field NativeProtocol$NativeAppInfo nativeAppInfo>
		nativeprotocol$protocolversionqueryresult.protocolVersion = i;
	//    7   13:aload_2         
	//    8   14:iload_1         
	//    9   15:putfield        #24  <Field int protocolVersion>
		return nativeprotocol$protocolversionqueryresult;
	//   10   18:aload_2         
	//   11   19:areturn         
	}

	public static NativeProtocol$ProtocolVersionQueryResult createEmpty()
	{
		NativeProtocol$ProtocolVersionQueryResult nativeprotocol$protocolversionqueryresult = new NativeProtocol$ProtocolVersionQueryResult();
	//    0    0:new             #2   <Class NativeProtocol$ProtocolVersionQueryResult>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void NativeProtocol$ProtocolVersionQueryResult()>
	//    3    7:astore_0        
		nativeprotocol$protocolversionqueryresult.protocolVersion = -1;
	//    4    8:aload_0         
	//    5    9:iconst_m1       
	//    6   10:putfield        #24  <Field int protocolVersion>
		return nativeprotocol$protocolversionqueryresult;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public NativeProtocol.NativeAppInfo getAppInfo()
	{
		return nativeAppInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field NativeProtocol$NativeAppInfo nativeAppInfo>
	//    2    4:areturn         
	}

	public int getProtocolVersion()
	{
		return protocolVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int protocolVersion>
	//    2    4:ireturn         
	}

	private NativeProtocol.NativeAppInfo nativeAppInfo;
	private int protocolVersion;


/*
	static NativeProtocol.NativeAppInfo access$700(NativeProtocol$ProtocolVersionQueryResult nativeprotocol$protocolversionqueryresult)
	{
		return nativeprotocol$protocolversionqueryresult.nativeAppInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field NativeProtocol$NativeAppInfo nativeAppInfo>
	//    2    4:areturn         
	}

*/


/*
	static int access$800(NativeProtocol$ProtocolVersionQueryResult nativeprotocol$protocolversionqueryresult)
	{
		return nativeprotocol$protocolversionqueryresult.protocolVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int protocolVersion>
	//    2    4:ireturn         
	}

*/

	private NativeProtocol$ProtocolVersionQueryResult()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
