// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			OnDemandOTAPathType, WebServicesHandler, OnDemandOTAHandler, OTAUIServiceDataCallback, 
//			OTAUIServiceCommand, OTAUIServiceData

public abstract class UpdateUIService
{
	private static final class CppProxy extends UpdateUIService
	{

		private native void nativeDestroy(long l);

		private native void native_expeditedOtaViewed(long l);

		private native OnDemandOTAPathType native_getOnDemandOTAFlagState(long l);

		private native boolean native_isUploadInProgress(long l);

		private native void native_onOnDemandOTATerminated(long l);

		private native void native_queryExpeditedOtaStatus(long l);

		private native void native_queryForSoftwareUpdate(long l);

		private native void native_queryLocalOtaStatus(long l);

		private native void native_queryOnDemandOTAAvailability(long l);

		private native void native_queryOnDemandOTAStatus(long l, OnDemandOTAHandler ondemandotahandler);

		private native void native_queryOtaUpdateStatus(long l);

		private native void native_querySoftwareVersion(long l);

		private native boolean native_registerSubscriber(long l, OTAUIServiceDataCallback otauiservicedatacallback);

		private native boolean native_registerUISubscriber(long l, OTAUIServiceDataCallback otauiservicedatacallback);

		private native boolean native_requestExpeditedOta(long l);

		private native void native_requestLocalOta(long l);

		private native String native_requestOnDemandOTA(long l, OnDemandOTAPathType ondemandotapathtype);

		private native void native_sendCommand(long l, OTAUIServiceCommand otauiservicecommand, OTAUIServiceData otauiservicedata);

		private native boolean native_unregisterSubscriber(long l, OTAUIServiceDataCallback otauiservicedatacallback);

		private native void native_uploadPackage(long l, String s);

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #67  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #69  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		public void expeditedOtaViewed()
		{
			native_expeditedOtaViewed(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #72  <Method void native_expeditedOtaViewed(long)>
		//    4    8:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #75  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #79  <Method void Object.finalize()>
		//    4    8:return          
		}

		public OnDemandOTAPathType getOnDemandOTAFlagState()
		{
			return native_getOnDemandOTAFlagState(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #83  <Method OnDemandOTAPathType native_getOnDemandOTAFlagState(long)>
		//    4    8:areturn         
		}

		public boolean isUploadInProgress()
		{
			return native_isUploadInProgress(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #87  <Method boolean native_isUploadInProgress(long)>
		//    4    8:ireturn         
		}

		public void onOnDemandOTATerminated()
		{
			native_onOnDemandOTATerminated(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #90  <Method void native_onOnDemandOTATerminated(long)>
		//    4    8:return          
		}

		public void queryExpeditedOtaStatus()
		{
			native_queryExpeditedOtaStatus(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #93  <Method void native_queryExpeditedOtaStatus(long)>
		//    4    8:return          
		}

		public void queryForSoftwareUpdate()
		{
			native_queryForSoftwareUpdate(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #96  <Method void native_queryForSoftwareUpdate(long)>
		//    4    8:return          
		}

		public void queryLocalOtaStatus()
		{
			native_queryLocalOtaStatus(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #99  <Method void native_queryLocalOtaStatus(long)>
		//    4    8:return          
		}

		public void queryOnDemandOTAAvailability()
		{
			native_queryOnDemandOTAAvailability(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #102 <Method void native_queryOnDemandOTAAvailability(long)>
		//    4    8:return          
		}

		public void queryOnDemandOTAStatus(OnDemandOTAHandler ondemandotahandler)
		{
			native_queryOnDemandOTAStatus(nativeRef, ondemandotahandler);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #106 <Method void native_queryOnDemandOTAStatus(long, OnDemandOTAHandler)>
		//    5    9:return          
		}

		public void queryOtaUpdateStatus()
		{
			native_queryOtaUpdateStatus(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #109 <Method void native_queryOtaUpdateStatus(long)>
		//    4    8:return          
		}

		public void querySoftwareVersion()
		{
			native_querySoftwareVersion(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #112 <Method void native_querySoftwareVersion(long)>
		//    4    8:return          
		}

		public boolean registerSubscriber(OTAUIServiceDataCallback otauiservicedatacallback)
		{
			return native_registerSubscriber(nativeRef, otauiservicedatacallback);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #116 <Method boolean native_registerSubscriber(long, OTAUIServiceDataCallback)>
		//    5    9:ireturn         
		}

		public boolean registerUISubscriber(OTAUIServiceDataCallback otauiservicedatacallback)
		{
			return native_registerUISubscriber(nativeRef, otauiservicedatacallback);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #119 <Method boolean native_registerUISubscriber(long, OTAUIServiceDataCallback)>
		//    5    9:ireturn         
		}

		public boolean requestExpeditedOta()
		{
			return native_requestExpeditedOta(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #122 <Method boolean native_requestExpeditedOta(long)>
		//    4    8:ireturn         
		}

		public void requestLocalOta()
		{
			native_requestLocalOta(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #125 <Method void native_requestLocalOta(long)>
		//    4    8:return          
		}

		public String requestOnDemandOTA(OnDemandOTAPathType ondemandotapathtype)
		{
			return native_requestOnDemandOTA(nativeRef, ondemandotapathtype);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #129 <Method String native_requestOnDemandOTA(long, OnDemandOTAPathType)>
		//    5    9:areturn         
		}

		public void sendCommand(OTAUIServiceCommand otauiservicecommand, OTAUIServiceData otauiservicedata)
		{
			native_sendCommand(nativeRef, otauiservicecommand, otauiservicedata);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #133 <Method void native_sendCommand(long, OTAUIServiceCommand, OTAUIServiceData)>
		//    6   10:return          
		}

		public boolean unregisterSubscriber(OTAUIServiceDataCallback otauiservicedatacallback)
		{
			return native_unregisterSubscriber(nativeRef, otauiservicedatacallback);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #136 <Method boolean native_unregisterSubscriber(long, OTAUIServiceDataCallback)>
		//    5    9:ireturn         
		}

		public void uploadPackage(String s)
		{
			native_uploadPackage(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #139 <Method void native_uploadPackage(long, String)>
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
		//    1    1:invokespecial   #19  <Method void UpdateUIService()>
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


	public UpdateUIService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static native OnDemandOTAPathType getOnDemandOTAFlagStateStatic();

	public static native void setWebServicesHandler(WebServicesHandler webserviceshandler);

	public abstract void expeditedOtaViewed();

	public abstract OnDemandOTAPathType getOnDemandOTAFlagState();

	public abstract boolean isUploadInProgress();

	public abstract void onOnDemandOTATerminated();

	public abstract void queryExpeditedOtaStatus();

	public abstract void queryForSoftwareUpdate();

	public abstract void queryLocalOtaStatus();

	public abstract void queryOnDemandOTAAvailability();

	public abstract void queryOnDemandOTAStatus(OnDemandOTAHandler ondemandotahandler);

	public abstract void queryOtaUpdateStatus();

	public abstract void querySoftwareVersion();

	public abstract boolean registerSubscriber(OTAUIServiceDataCallback otauiservicedatacallback);

	public abstract boolean registerUISubscriber(OTAUIServiceDataCallback otauiservicedatacallback);

	public abstract boolean requestExpeditedOta();

	public abstract void requestLocalOta();

	public abstract String requestOnDemandOTA(OnDemandOTAPathType ondemandotapathtype);

	public abstract void sendCommand(OTAUIServiceCommand otauiservicecommand, OTAUIServiceData otauiservicedata);

	public abstract boolean unregisterSubscriber(OTAUIServiceDataCallback otauiservicedatacallback);

	public abstract void uploadPackage(String s);

	public static final String O_T_A_REMOTE_CONNECTION_TIMEOUT_TAG = "OnDemandOTARemoteConnectionTimeoutTag";
}
