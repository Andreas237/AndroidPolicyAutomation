// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.c.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			tv, aag, zv, bzh, 
//			ua, bxh, ts, zzavh

public final class bzg extends tv
{

	public bzg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void tv()>
	//    2    4:return          
	}

	static ua a(bzg bzg1)
	{
		return bzg1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ua a>
	//    2    4:areturn         
	}

	public final void a()
	{
	//    0    0:return          
	}

	public final void a(a a1)
	{
	//    0    0:return          
	}

	public final void a(bxh bxh)
	{
	//    0    0:return          
	}

	public final void a(ts ts)
	{
	//    0    0:return          
	}

	public final void a(ua ua)
	{
		a = ua;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ua a>
	//    3    5:return          
	}

	public final void a(zzavh zzavh)
	{
		aag.c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
	//    0    0:ldc1            #21  <String "This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.">
	//    1    2:invokestatic    #27  <Method void aag.c(String)>
		com.google.android.gms.internal.ads.zv.a.post(((Runnable) (new bzh(this))));
	//    2    5:getstatic       #32  <Field Handler com.google.android.gms.internal.ads.zv.a>
	//    3    8:new             #34  <Class bzh>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:invokespecial   #37  <Method void bzh(bzg)>
	//    7   16:invokevirtual   #43  <Method boolean Handler.post(Runnable)>
	//    8   19:pop             
	//    9   20:return          
	}

	public final void a(String s)
	{
	//    0    0:return          
	}

	public final void a(boolean flag)
	{
	//    0    0:return          
	}

	public final Bundle b()
	{
		return new Bundle();
	//    0    0:new             #48  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void Bundle()>
	//    3    7:areturn         
	}

	public final void b(a a1)
	{
	//    0    0:return          
	}

	public final void b(String s)
	{
	//    0    0:return          
	}

	public final void c(a a1)
	{
	//    0    0:return          
	}

	public final void c(String s)
	{
	//    0    0:return          
	}

	public final boolean c()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final void d()
	{
	//    0    0:return          
	}

	public final void d(a a1)
	{
	//    0    0:return          
	}

	public final void e()
	{
	//    0    0:return          
	}

	public final void f()
	{
	//    0    0:return          
	}

	public final String g()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	private ua a;
}
