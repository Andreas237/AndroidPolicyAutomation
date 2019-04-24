// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			AssetNetworkUIServiceData, AssetNetworkUIServiceDataCallback, AssetNetworkUIServiceCommand

public abstract class AssetNetworkUIService
{
	private static final class CppProxy extends AssetNetworkUIService
	{

		private native void nativeDestroy(long l);

		private native AssetNetworkUIServiceData native_getServiceData(long l);

		private native boolean native_registerSubscriber(long l, AssetNetworkUIServiceDataCallback assetnetworkuiservicedatacallback);

		private native boolean native_registerUISubscriber(long l, AssetNetworkUIServiceDataCallback assetnetworkuiservicedatacallback);

		private native void native_sendCommand(long l, AssetNetworkUIServiceCommand assetnetworkuiservicecommand, AssetNetworkUIServiceData assetnetworkuiservicedata);

		private native boolean native_unregisterSubscriber(long l, AssetNetworkUIServiceDataCallback assetnetworkuiservicedatacallback);

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #49  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #51  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #54  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #58  <Method void Object.finalize()>
		//    4    8:return          
		}

		public AssetNetworkUIServiceData getServiceData()
		{
			return native_getServiceData(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #62  <Method AssetNetworkUIServiceData native_getServiceData(long)>
		//    4    8:areturn         
		}

		public boolean registerSubscriber(AssetNetworkUIServiceDataCallback assetnetworkuiservicedatacallback)
		{
			return native_registerSubscriber(nativeRef, assetnetworkuiservicedatacallback);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #66  <Method boolean native_registerSubscriber(long, AssetNetworkUIServiceDataCallback)>
		//    5    9:ireturn         
		}

		public boolean registerUISubscriber(AssetNetworkUIServiceDataCallback assetnetworkuiservicedatacallback)
		{
			return native_registerUISubscriber(nativeRef, assetnetworkuiservicedatacallback);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #69  <Method boolean native_registerUISubscriber(long, AssetNetworkUIServiceDataCallback)>
		//    5    9:ireturn         
		}

		public void sendCommand(AssetNetworkUIServiceCommand assetnetworkuiservicecommand, AssetNetworkUIServiceData assetnetworkuiservicedata)
		{
			native_sendCommand(nativeRef, assetnetworkuiservicecommand, assetnetworkuiservicedata);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #73  <Method void native_sendCommand(long, AssetNetworkUIServiceCommand, AssetNetworkUIServiceData)>
		//    6   10:return          
		}

		public boolean unregisterSubscriber(AssetNetworkUIServiceDataCallback assetnetworkuiservicedatacallback)
		{
			return native_unregisterSubscriber(nativeRef, assetnetworkuiservicedatacallback);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #76  <Method boolean native_unregisterSubscriber(long, AssetNetworkUIServiceDataCallback)>
		//    5    9:ireturn         
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
		//    1    1:invokespecial   #19  <Method void AssetNetworkUIService()>
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


	public AssetNetworkUIService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public abstract AssetNetworkUIServiceData getServiceData();

	public abstract boolean registerSubscriber(AssetNetworkUIServiceDataCallback assetnetworkuiservicedatacallback);

	public abstract boolean registerUISubscriber(AssetNetworkUIServiceDataCallback assetnetworkuiservicedatacallback);

	public abstract void sendCommand(AssetNetworkUIServiceCommand assetnetworkuiservicecommand, AssetNetworkUIServiceData assetnetworkuiservicedata);

	public abstract boolean unregisterSubscriber(AssetNetworkUIServiceDataCallback assetnetworkuiservicedatacallback);
}
