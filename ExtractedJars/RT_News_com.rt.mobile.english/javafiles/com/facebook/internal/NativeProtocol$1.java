// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook.internal:
//			NativeProtocol

static final class NativeProtocol$1
	implements Runnable
{

	public void run()
	{
		for(Iterator iterator = NativeProtocol.access$500().iterator(); iterator.hasNext(); tiveAppInfo.access._mth600((tiveAppInfo)iterator.next(), true));
	//    0    0:invokestatic    #20  <Method List NativeProtocol.access$500()>
	//    1    3:invokeinterface #26  <Method Iterator List.iterator()>
	//    2    8:astore_1        
	//    3    9:aload_1         
	//    4   10:invokeinterface #32  <Method boolean Iterator.hasNext()>
	//    5   15:ifeq            34
	//    6   18:aload_1         
	//    7   19:invokeinterface #36  <Method Object Iterator.next()>
	//    8   24:checkcast       #38  <Class NativeProtocol$NativeAppInfo>
	//    9   27:iconst_1        
	//   10   28:invokestatic    #42  <Method void NativeProtocol$NativeAppInfo.access$600(NativeProtocol$NativeAppInfo, boolean)>
	//*  11   31:goto            9
		NativeProtocol.access$700().set(false);
	//   12   34:invokestatic    #46  <Method AtomicBoolean NativeProtocol.access$700()>
	//   13   37:iconst_0        
	//   14   38:invokevirtual   #52  <Method void AtomicBoolean.set(boolean)>
		return;
	//   15   41:return          
		Exception exception;
		exception;
	//   16   42:astore_1        
		NativeProtocol.access$700().set(false);
	//   17   43:invokestatic    #46  <Method AtomicBoolean NativeProtocol.access$700()>
	//   18   46:iconst_0        
	//   19   47:invokevirtual   #52  <Method void AtomicBoolean.set(boolean)>
		throw exception;
	//   20   50:aload_1         
	//   21   51:athrow          
	}

	NativeProtocol$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
