// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class NetworkErrorCode
{
	private static final class CppProxy extends NetworkErrorCode
	{

		private native void nativeDestroy(long l);

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #37  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #30  <Field long nativeRef>
		//    8   16:invokespecial   #39  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #42  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #46  <Method void Object.finalize()>
		//    4    8:return          
		}

		private final AtomicBoolean destroyed = new AtomicBoolean(false);
		private final long nativeRef;

		private CppProxy(long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void NetworkErrorCode()>
		//    2    4:aload_0         
		//    3    5:new             #16  <Class AtomicBoolean>
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:invokespecial   #19  <Method void AtomicBoolean(boolean)>
		//    7   13:putfield        #21  <Field AtomicBoolean destroyed>
			if(l == 0L)
		//*   8   16:lload_1         
		//*   9   17:lconst_0        
		//*  10   18:lcmp            
		//*  11   19:ifne            32
			{
				throw new RuntimeException("nativeRef is zero");
		//   12   22:new             #23  <Class RuntimeException>
		//   13   25:dup             
		//   14   26:ldc1            #25  <String "nativeRef is zero">
		//   15   28:invokespecial   #28  <Method void RuntimeException(String)>
		//   16   31:athrow          
			} else
			{
				nativeRef = l;
		//   17   32:aload_0         
		//   18   33:lload_1         
		//   19   34:putfield        #30  <Field long nativeRef>
				return;
		//   20   37:return          
			}
		}
	}


	public NetworkErrorCode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
	//    2    4:return          
	}

	public static final int AUTHENTICATION_ERROR_ASSET_NOT_FOUND = 13;
	public static final int AUTHENTICATION_ERROR_NEW_PASSWORD = 11;
	public static final int AUTHENTICATION_ERROR_NO_MATCH = 12;
	public static final int AUTHENTICATION_ERROR_OLD_PASSWORD = 10;
	public static final int CONNECTION_REFUSED_ERROR = 15;
	public static final int CURRENT_ASSOCIATION_INVALID = 14;
	public static final int HTTPS_UNAVAILABLE_ERROR = 4;
	public static final int NETWORK_ERROR = 0;
	public static final int PASSWORD_ERROR = 3;
	public static final int PASSWORD_EXCHANGE_ERROR_INTERNAL_ERROR = 8;
	public static final int PASSWORD_EXCHANGE_ERROR_INVALID_PASSWORD = 7;
	public static final int PASSWORD_EXCHANGE_ERROR_PERMISSION_DENIED = 9;
	public static final int SESSION_UNAVAILABLE_ERROR = 6;
	public static final int SSL_ERROR = 1;
	public static final int SSL_PEER_UNVERIFIED_ERROR = 2;
	public static final int TIMEOUT_ERROR = 16;
	public static final int UNKNOWN = -1;
	public static final int VALIDATION_PROBLEM = 5;
}
