// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			PMIProvisioningServiceDelegate, PMIWifiStatusHandler, PMIProvisioningData

public abstract class PMIProvisioningService
{
	private static final class CppProxy extends PMIProvisioningService
	{

		private native void nativeDestroy(long l);

		private native void native_discover(long l, String s);

		private native void native_setDelegate(long l, PMIProvisioningServiceDelegate pmiprovisioningservicedelegate);

		private native void native_setWifiStatusHandler(long l, PMIWifiStatusHandler pmiwifistatushandler);

		private native void native_start(long l, String s, PMIProvisioningData pmiprovisioningdata);

		private native void native_startWifiFallback(long l, PMIProvisioningData pmiprovisioningdata);

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #51  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #53  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		public void discover(String s)
		{
			native_discover(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #56  <Method void native_discover(long, String)>
		//    5    9:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #59  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #63  <Method void Object.finalize()>
		//    4    8:return          
		}

		public void setDelegate(PMIProvisioningServiceDelegate pmiprovisioningservicedelegate)
		{
			native_setDelegate(nativeRef, pmiprovisioningservicedelegate);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #67  <Method void native_setDelegate(long, PMIProvisioningServiceDelegate)>
		//    5    9:return          
		}

		public void setWifiStatusHandler(PMIWifiStatusHandler pmiwifistatushandler)
		{
			native_setWifiStatusHandler(nativeRef, pmiwifistatushandler);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #71  <Method void native_setWifiStatusHandler(long, PMIWifiStatusHandler)>
		//    5    9:return          
		}

		public void start(String s, PMIProvisioningData pmiprovisioningdata)
		{
			native_start(nativeRef, s, pmiprovisioningdata);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #75  <Method void native_start(long, String, PMIProvisioningData)>
		//    6   10:return          
		}

		public void startWifiFallback(PMIProvisioningData pmiprovisioningdata)
		{
			native_startWifiFallback(nativeRef, pmiprovisioningdata);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #79  <Method void native_startWifiFallback(long, PMIProvisioningData)>
		//    5    9:return          
		}

		static final boolean $assertionsDisabled = false;
		private final AtomicBoolean destroyed = new AtomicBoolean(false);
		private final long nativeRef;

		static 
		{
		//    0    0:return          
		}

		private CppProxy(long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void PMIProvisioningService()>
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


	public PMIProvisioningService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public abstract void discover(String s);

	public abstract void setDelegate(PMIProvisioningServiceDelegate pmiprovisioningservicedelegate);

	public abstract void setWifiStatusHandler(PMIWifiStatusHandler pmiwifistatushandler);

	public abstract void start(String s, PMIProvisioningData pmiprovisioningdata);

	public abstract void startWifiFallback(PMIProvisioningData pmiprovisioningdata);
}
