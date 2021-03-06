// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			AssetEvent, WifiSecurityType, AssetId, Event, 
//			EventType

public abstract class AssetNetworkSettingsEvent extends AssetEvent
{
	private static final class CppProxy extends AssetNetworkSettingsEvent
	{

		private native void nativeDestroy(long l);

		private native AssetId native_assetId(long l);

		private native ArrayList native_bssid(long l);

		private native long native_dns1(long l);

		private native long native_dns2(long l);

		private native boolean native_equals(long l, Event event);

		private native EventType native_eventType(long l);

		private native boolean native_forcedPublish(long l);

		private native long native_gateway(long l);

		private native boolean native_isDhcpEnabled(long l);

		private native String native_key(long l);

		private native WifiSecurityType native_securityType(long l);

		private native long native_subnetMask(long l);

		private native Date native_timestamp(long l);

		public AssetId assetId()
		{
			return native_assetId(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #62  <Method AssetId native_assetId(long)>
		//    4    8:areturn         
		}

		public ArrayList bssid()
		{
			return native_bssid(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #66  <Method ArrayList native_bssid(long)>
		//    4    8:areturn         
		}

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #73  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #75  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		public long dns1()
		{
			return native_dns1(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #79  <Method long native_dns1(long)>
		//    4    8:lreturn         
		}

		public long dns2()
		{
			return native_dns2(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #82  <Method long native_dns2(long)>
		//    4    8:lreturn         
		}

		public boolean equals(Event event)
		{
			return native_equals(nativeRef, event);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #86  <Method boolean native_equals(long, Event)>
		//    5    9:ireturn         
		}

		public EventType eventType()
		{
			return native_eventType(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #90  <Method EventType native_eventType(long)>
		//    4    8:areturn         
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #93  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #97  <Method void Object.finalize()>
		//    4    8:return          
		}

		public boolean forcedPublish()
		{
			return native_forcedPublish(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #101 <Method boolean native_forcedPublish(long)>
		//    4    8:ireturn         
		}

		public long gateway()
		{
			return native_gateway(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #104 <Method long native_gateway(long)>
		//    4    8:lreturn         
		}

		public boolean isDhcpEnabled()
		{
			return native_isDhcpEnabled(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #107 <Method boolean native_isDhcpEnabled(long)>
		//    4    8:ireturn         
		}

		public String key()
		{
			return native_key(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #111 <Method String native_key(long)>
		//    4    8:areturn         
		}

		public WifiSecurityType securityType()
		{
			return native_securityType(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #115 <Method WifiSecurityType native_securityType(long)>
		//    4    8:areturn         
		}

		public long subnetMask()
		{
			return native_subnetMask(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #118 <Method long native_subnetMask(long)>
		//    4    8:lreturn         
		}

		public Date timestamp()
		{
			return native_timestamp(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #122 <Method Date native_timestamp(long)>
		//    4    8:areturn         
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
		//    1    1:invokespecial   #19  <Method void AssetNetworkSettingsEvent()>
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


	public AssetNetworkSettingsEvent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AssetEvent()>
	//    2    4:return          
	}

	public abstract ArrayList bssid();

	public abstract long dns1();

	public abstract long dns2();

	public abstract long gateway();

	public abstract boolean isDhcpEnabled();

	public abstract WifiSecurityType securityType();

	public abstract long subnetMask();
}
