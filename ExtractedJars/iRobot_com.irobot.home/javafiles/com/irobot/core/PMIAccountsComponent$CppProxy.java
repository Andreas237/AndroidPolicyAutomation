// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			PMIAccountsComponent, PMIAccountInfo, PMIAccountsDelegate

private static final class PMIAccountsComponent$CppProxy extends PMIAccountsComponent
{

	private native void nativeDestroy(long l);

	private native PMIAccountInfo native_getCurrentAccountInfo(long l);

	private native boolean native_isLoggedIn(long l);

	private native void native_login(long l);

	private native void native_logout(long l);

	private native void native_refreshAccountInfo(long l);

	private native void native_setCountryCode(long l, String s);

	private native void native_setDelegate(long l, PMIAccountsDelegate pmiaccountsdelegate);

	private native void native_setLocale(long l, String s);

	public void destroy()
	{
		if(!destroyed.getAndSet(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #53  <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifne            19
			nativeDestroy(nativeRef);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field long nativeRef>
	//    8   16:invokespecial   #55  <Method void nativeDestroy(long)>
	//    9   19:return          
	}

	protected void finalize()
	{
		destroy();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #58  <Method void destroy()>
		((Object)this).finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #62  <Method void Object.finalize()>
	//    4    8:return          
	}

	public PMIAccountInfo getCurrentAccountInfo()
	{
		return native_getCurrentAccountInfo(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #66  <Method PMIAccountInfo native_getCurrentAccountInfo(long)>
	//    4    8:areturn         
	}

	public boolean isLoggedIn()
	{
		return native_isLoggedIn(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #70  <Method boolean native_isLoggedIn(long)>
	//    4    8:ireturn         
	}

	public void login()
	{
		native_login(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #73  <Method void native_login(long)>
	//    4    8:return          
	}

	public void logout()
	{
		native_logout(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #76  <Method void native_logout(long)>
	//    4    8:return          
	}

	public void refreshAccountInfo()
	{
		native_refreshAccountInfo(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #79  <Method void native_refreshAccountInfo(long)>
	//    4    8:return          
	}

	public void setCountryCode(String s)
	{
		native_setCountryCode(nativeRef, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #82  <Method void native_setCountryCode(long, String)>
	//    5    9:return          
	}

	public void setDelegate(PMIAccountsDelegate pmiaccountsdelegate)
	{
		native_setDelegate(nativeRef, pmiaccountsdelegate);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #86  <Method void native_setDelegate(long, PMIAccountsDelegate)>
	//    5    9:return          
	}

	public void setLocale(String s)
	{
		native_setLocale(nativeRef, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #89  <Method void native_setLocale(long, String)>
	//    5    9:return          
	}

	static final boolean $assertionsDisabled = false;
	private final AtomicBoolean destroyed = new AtomicBoolean(false);
	private final long nativeRef;

	static 
	{
	//    0    0:return          
	}

	private PMIAccountsComponent$CppProxy(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void PMIAccountsComponent()>
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