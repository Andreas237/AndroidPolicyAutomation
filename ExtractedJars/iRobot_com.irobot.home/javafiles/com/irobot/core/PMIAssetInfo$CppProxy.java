// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			PMIAssetInfo

private static final class PMIAssetInfo$CppProxy extends PMIAssetInfo
{

	private native void nativeDestroy(long l);

	private native String native_asJson(long l);

	private native boolean native_equals(long l, PMIAssetInfo pmiassetinfo);

	private native String native_getAssetId(long l);

	private native String native_getCapabilityJson(long l);

	private native String native_getName(long l);

	private native String native_getProtocolType(long l);

	private native String native_getSku(long l);

	private native String native_getSoftwareVersion(long l);

	private native void native_setName(long l, String s);

	private native void native_setSku(long l, String s);

	private native void native_setSoftwareVersion(long l, String s);

	public String asJson()
	{
		return native_asJson(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #54  <Method String native_asJson(long)>
	//    4    8:areturn         
	}

	public void destroy()
	{
		if(!destroyed.getAndSet(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #59  <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifne            19
			nativeDestroy(nativeRef);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field long nativeRef>
	//    8   16:invokespecial   #61  <Method void nativeDestroy(long)>
	//    9   19:return          
	}

	public boolean equals(PMIAssetInfo pmiassetinfo)
	{
		return native_equals(nativeRef, pmiassetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #65  <Method boolean native_equals(long, PMIAssetInfo)>
	//    5    9:ireturn         
	}

	protected void finalize()
	{
		destroy();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method void destroy()>
		((Object)this).finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #72  <Method void Object.finalize()>
	//    4    8:return          
	}

	public String getAssetId()
	{
		return native_getAssetId(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #75  <Method String native_getAssetId(long)>
	//    4    8:areturn         
	}

	public String getCapabilityJson()
	{
		return native_getCapabilityJson(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #78  <Method String native_getCapabilityJson(long)>
	//    4    8:areturn         
	}

	public String getName()
	{
		return native_getName(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #81  <Method String native_getName(long)>
	//    4    8:areturn         
	}

	public String getProtocolType()
	{
		return native_getProtocolType(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #84  <Method String native_getProtocolType(long)>
	//    4    8:areturn         
	}

	public String getSku()
	{
		return native_getSku(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #87  <Method String native_getSku(long)>
	//    4    8:areturn         
	}

	public String getSoftwareVersion()
	{
		return native_getSoftwareVersion(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #90  <Method String native_getSoftwareVersion(long)>
	//    4    8:areturn         
	}

	public void setName(String s)
	{
		native_setName(nativeRef, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #93  <Method void native_setName(long, String)>
	//    5    9:return          
	}

	public void setSku(String s)
	{
		native_setSku(nativeRef, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #96  <Method void native_setSku(long, String)>
	//    5    9:return          
	}

	public void setSoftwareVersion(String s)
	{
		native_setSoftwareVersion(nativeRef, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #99  <Method void native_setSoftwareVersion(long, String)>
	//    5    9:return          
	}

	static final boolean $assertionsDisabled = false;
	private final AtomicBoolean destroyed = new AtomicBoolean(false);
	private final long nativeRef;

	static 
	{
	//    0    0:return          
	}

	private PMIAssetInfo$CppProxy(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void PMIAssetInfo()>
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
