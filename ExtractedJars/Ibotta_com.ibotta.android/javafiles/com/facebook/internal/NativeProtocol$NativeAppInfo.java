// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import java.util.TreeSet;

// Referenced classes of package com.facebook.internal:
//			NativeProtocol

private static abstract class NativeProtocol$NativeAppInfo
{

	private void fetchAvailableVersions(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(flag)
			break MISSING_BLOCK_LABEL_13;
	//    2    2:iload_1         
	//    3    3:ifne            13
		if(availableVersions != null)
			break MISSING_BLOCK_LABEL_21;
	//    4    6:aload_0         
	//    5    7:getfield        #25  <Field TreeSet availableVersions>
	//    6   10:ifnonnull       21
		availableVersions = NativeProtocol.access$000(this);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:invokestatic    #29  <Method TreeSet NativeProtocol.access$000(NativeProtocol$NativeAppInfo)>
	//   10   18:putfield        #25  <Field TreeSet availableVersions>
		this;
	//   11   21:aload_0         
		JVM INSTR monitorexit ;
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		Exception exception;
		exception;
	//   14   24:astore_2        
	//*  15   25:aload_0         
		throw exception;
	//   16   26:monitorexit     
	//   17   27:aload_2         
	//   18   28:athrow          
	}

	public TreeSet getAvailableVersions()
	{
		if(availableVersions == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field TreeSet availableVersions>
	//*   2    4:ifnonnull       12
			fetchAvailableVersions(false);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokespecial   #23  <Method void fetchAvailableVersions(boolean)>
		return availableVersions;
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field TreeSet availableVersions>
	//    8   16:areturn         
	}

	protected abstract String getLoginActivity();

	protected abstract String getPackage();

	private TreeSet availableVersions;


/*
	static void access$1000(NativeProtocol$NativeAppInfo nativeprotocol$nativeappinfo, boolean flag)
	{
		nativeprotocol$nativeappinfo.fetchAvailableVersions(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #23  <Method void fetchAvailableVersions(boolean)>
		return;
	//    3    5:return          
	}

*/

	private NativeProtocol$NativeAppInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	NativeProtocol$NativeAppInfo(NativeProtocol._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void NativeProtocol$NativeAppInfo()>
	//    2    4:return          
	}
}
