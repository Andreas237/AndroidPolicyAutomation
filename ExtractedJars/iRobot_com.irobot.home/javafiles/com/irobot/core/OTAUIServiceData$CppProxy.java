// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			OTAUIServiceData, ExpeditedOtaStatus, LocalOtaError, LocalOtaStatus, 
//			OnDemandOTAError, OtaUpdateStatus, SoftwareUpdateStatus, OnDemandOTAPathType

private static final class OTAUIServiceData$CppProxy extends OTAUIServiceData
{

	private native void nativeDestroy(long l);

	private native ArrayList native_getDataStates(long l);

	private native ExpeditedOtaStatus native_getExpeditedOtaStatus(long l);

	private native boolean native_getIsOnDemandOTACommError(long l);

	private native boolean native_getIsOnDemandOTACompleted(long l);

	private native LocalOtaError native_getLocalOTAError(long l);

	private native LocalOtaStatus native_getLocalOTAStatus(long l);

	private native OnDemandOTAError native_getOnDemandOTAError(long l);

	private native OtaUpdateStatus native_getOnDemandOTAStatus(long l);

	private native SoftwareUpdateStatus native_getSoftwareUpdateStatus(long l);

	private native void native_setOnDemandOTAPathType(long l, OnDemandOTAPathType ondemandotapathtype);

	public void destroy()
	{
		if(!destroyed.getAndSet(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #60  <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifne            19
			nativeDestroy(nativeRef);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field long nativeRef>
	//    8   16:invokespecial   #62  <Method void nativeDestroy(long)>
	//    9   19:return          
	}

	protected void finalize()
	{
		destroy();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method void destroy()>
		((Object)this).finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #69  <Method void Object.finalize()>
	//    4    8:return          
	}

	public ArrayList getDataStates()
	{
		return native_getDataStates(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #73  <Method ArrayList native_getDataStates(long)>
	//    4    8:areturn         
	}

	public ExpeditedOtaStatus getExpeditedOtaStatus()
	{
		return native_getExpeditedOtaStatus(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #79  <Method ExpeditedOtaStatus native_getExpeditedOtaStatus(long)>
	//    4    8:areturn         
	}

	public boolean getIsOnDemandOTACommError()
	{
		return native_getIsOnDemandOTACommError(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #83  <Method boolean native_getIsOnDemandOTACommError(long)>
	//    4    8:ireturn         
	}

	public boolean getIsOnDemandOTACompleted()
	{
		return native_getIsOnDemandOTACompleted(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #86  <Method boolean native_getIsOnDemandOTACompleted(long)>
	//    4    8:ireturn         
	}

	public LocalOtaError getLocalOTAError()
	{
		return native_getLocalOTAError(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #90  <Method LocalOtaError native_getLocalOTAError(long)>
	//    4    8:areturn         
	}

	public LocalOtaStatus getLocalOTAStatus()
	{
		return native_getLocalOTAStatus(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #94  <Method LocalOtaStatus native_getLocalOTAStatus(long)>
	//    4    8:areturn         
	}

	public OnDemandOTAError getOnDemandOTAError()
	{
		return native_getOnDemandOTAError(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #98  <Method OnDemandOTAError native_getOnDemandOTAError(long)>
	//    4    8:areturn         
	}

	public OtaUpdateStatus getOnDemandOTAStatus()
	{
		return native_getOnDemandOTAStatus(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #102 <Method OtaUpdateStatus native_getOnDemandOTAStatus(long)>
	//    4    8:areturn         
	}

	public SoftwareUpdateStatus getSoftwareUpdateStatus()
	{
		return native_getSoftwareUpdateStatus(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #106 <Method SoftwareUpdateStatus native_getSoftwareUpdateStatus(long)>
	//    4    8:areturn         
	}

	public void setOnDemandOTAPathType(OnDemandOTAPathType ondemandotapathtype)
	{
		native_setOnDemandOTAPathType(nativeRef, ondemandotapathtype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #110 <Method void native_setOnDemandOTAPathType(long, OnDemandOTAPathType)>
	//    5    9:return          
	}

	static final boolean $assertionsDisabled = false;
	private final AtomicBoolean destroyed = new AtomicBoolean(false);
	private final long nativeRef;

	static 
	{
	//    0    0:return          
	}

	private OTAUIServiceData$CppProxy(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void OTAUIServiceData()>
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
