// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class NetworkAddress
{
	private static final class CppProxy extends NetworkAddress
	{

		private native void nativeDestroy(long l);

		private native boolean native_equals(long l, NetworkAddress networkaddress);

		private native String native_host(long l);

		private native String native_path(long l);

		private native int native_port(long l);

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #48  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #50  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		public boolean equals(NetworkAddress networkaddress)
		{
			return native_equals(nativeRef, networkaddress);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #54  <Method boolean native_equals(long, NetworkAddress)>
		//    5    9:ireturn         
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #57  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #61  <Method void Object.finalize()>
		//    4    8:return          
		}

		public String host()
		{
			return native_host(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #65  <Method String native_host(long)>
		//    4    8:areturn         
		}

		public String path()
		{
			return native_path(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #68  <Method String native_path(long)>
		//    4    8:areturn         
		}

		public int port()
		{
			return native_port(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #72  <Method int native_port(long)>
		//    4    8:ireturn         
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
		//    1    1:invokespecial   #19  <Method void NetworkAddress()>
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


	public NetworkAddress()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static native long IPv4DottedDecimalToNumeric(String s);

	public static native String IPv4NumericToDottedDecimal(long l);

	public static native long computeNetworkPrefixLength(long l);

	public static native NetworkAddress httpsNetworkAddressForDefaultGateway();

	public static native NetworkAddress httpsNetworkAddressForHost(String s);

	public static native NetworkAddress httpsNetworkAddressForHostWithPath(String s, String s1);

	public static native NetworkAddress httpsNetworkAddressForIPv4Address(long l);

	public static native NetworkAddress networkAddressForBaseUrlWithPath(String s, String s1);

	public static native NetworkAddress networkAddressForDefaultGateway(int i);

	public static native NetworkAddress networkAddressForHostWithPort(String s, int i);

	public static native NetworkAddress networkAddressForHostWithPortAndPath(String s, int i, String s1);

	public static native NetworkAddress networkAddressForIPv4Address(long l, int i);

	public static native NetworkAddress networkAddressForUrlString(String s);

	public abstract boolean equals(NetworkAddress networkaddress);

	public abstract String host();

	public abstract String path();

	public abstract int port();
}
