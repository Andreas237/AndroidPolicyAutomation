// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			NetworkAddressRequestAttribute, NetworkAddress

private static final class NetworkAddressRequestAttribute$CppProxy extends NetworkAddressRequestAttribute
{

	private native void nativeDestroy(long l);

	private native NetworkAddress native_address(long l);

	public NetworkAddress address()
	{
		return native_address(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #42  <Method NetworkAddress native_address(long)>
	//    4    8:areturn         
	}

	public void destroy()
	{
		if(!destroyed.getAndSet(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #47  <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifne            19
			nativeDestroy(nativeRef);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field long nativeRef>
	//    8   16:invokespecial   #49  <Method void nativeDestroy(long)>
	//    9   19:return          
	}

	protected void finalize()
	{
		destroy();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method void destroy()>
		((Object)this).finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #56  <Method void Object.finalize()>
	//    4    8:return          
	}

	static final boolean $assertionsDisabled = false;
	private final AtomicBoolean destroyed = new AtomicBoolean(false);
	private final long nativeRef;

	static 
	{
	//    0    0:return          
	}

	private NetworkAddressRequestAttribute$CppProxy(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void NetworkAddressRequestAttribute()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class AtomicBoolean>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #24  <Method void AtomicBoolean(boolean)>
	//    7   13:putfield        #26  <Field AtomicBoolean destroyed>
		if(l == 0L)
	//*   8   16:lload_1         
	//*   9   17:lconst_0        
	//*  10   18:lcmp            
	//*  11   19:ifne            32
		{
			throw new RuntimeException("nativeRef is zero");
	//   12   22:new             #28  <Class RuntimeException>
	//   13   25:dup             
	//   14   26:ldc1            #30  <String "nativeRef is zero">
	//   15   28:invokespecial   #33  <Method void RuntimeException(String)>
	//   16   31:athrow          
		} else
		{
			nativeRef = l;
	//   17   32:aload_0         
	//   18   33:lload_1         
	//   19   34:putfield        #35  <Field long nativeRef>
			return;
	//   20   37:return          
		}
	}
}
