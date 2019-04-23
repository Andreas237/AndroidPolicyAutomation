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
			break MISSING_BLOCK_LABEL_23;
	//    2    2:iload_1         
	//    3    3:ifne            23
		if(availableVersions != null && !availableVersions.isEmpty())
			break MISSING_BLOCK_LABEL_31;
	//    4    6:aload_0         
	//    5    7:getfield        #25  <Field TreeSet availableVersions>
	//    6   10:ifnull          23
	//    7   13:aload_0         
	//    8   14:getfield        #25  <Field TreeSet availableVersions>
	//    9   17:invokevirtual   #31  <Method boolean TreeSet.isEmpty()>
	//   10   20:ifeq            31
		availableVersions = NativeProtocol.access$000(this);
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:invokestatic    #35  <Method TreeSet NativeProtocol.access$000(NativeProtocol$NativeAppInfo)>
	//   14   28:putfield        #25  <Field TreeSet availableVersions>
		this;
	//   15   31:aload_0         
		JVM INSTR monitorexit ;
	//   16   32:monitorexit     
		return;
	//   17   33:return          
		Exception exception;
		exception;
	//   18   34:astore_2        
	//*  19   35:aload_0         
		throw exception;
	//   20   36:monitorexit     
	//   21   37:aload_2         
	//   22   38:athrow          
	}

	public TreeSet getAvailableVersions()
	{
		TreeSet treeset = availableVersions;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field TreeSet availableVersions>
	//    2    4:astore_1        
		if(treeset == null || treeset.isEmpty())
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #31  <Method boolean TreeSet.isEmpty()>
	//*   7   13:ifeq            21
			fetchAvailableVersions(false);
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:invokespecial   #23  <Method void fetchAvailableVersions(boolean)>
		return availableVersions;
	//   11   21:aload_0         
	//   12   22:getfield        #25  <Field TreeSet availableVersions>
	//   13   25:areturn         
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
