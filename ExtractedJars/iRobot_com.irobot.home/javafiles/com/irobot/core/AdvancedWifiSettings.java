// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class AdvancedWifiSettings
{
	private static final class CppProxy extends AdvancedWifiSettings
	{

		private native void nativeDestroy(long l);

		private native String native_address(long l);

		private native boolean native_dhcp(long l);

		private native String native_dns1(long l);

		private native String native_dns2(long l);

		private native String native_gateway(long l);

		private native boolean native_macAddressFilter(long l);

		private native String native_mask(long l);

		public String address()
		{
			return native_address(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #49  <Method String native_address(long)>
		//    4    8:areturn         
		}

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #54  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #56  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		public boolean dhcp()
		{
			return native_dhcp(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #60  <Method boolean native_dhcp(long)>
		//    4    8:ireturn         
		}

		public String dns1()
		{
			return native_dns1(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #63  <Method String native_dns1(long)>
		//    4    8:areturn         
		}

		public String dns2()
		{
			return native_dns2(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #66  <Method String native_dns2(long)>
		//    4    8:areturn         
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #69  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #73  <Method void Object.finalize()>
		//    4    8:return          
		}

		public String gateway()
		{
			return native_gateway(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #76  <Method String native_gateway(long)>
		//    4    8:areturn         
		}

		public boolean macAddressFilter()
		{
			return native_macAddressFilter(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #79  <Method boolean native_macAddressFilter(long)>
		//    4    8:ireturn         
		}

		public String mask()
		{
			return native_mask(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #82  <Method String native_mask(long)>
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
		//    1    1:invokespecial   #19  <Method void AdvancedWifiSettings()>
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


	public AdvancedWifiSettings()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static native AdvancedWifiSettings create(boolean flag, boolean flag1, String s, String s1, String s2, String s3, String s4);

	public abstract String address();

	public abstract boolean dhcp();

	public abstract String dns1();

	public abstract String dns2();

	public abstract String gateway();

	public abstract boolean macAddressFilter();

	public abstract String mask();
}
