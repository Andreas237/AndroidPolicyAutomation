// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bwv, aag, zv, bzb, 
//			byy, byz, zzwb

final class bza extends bwv
{

	private bza(byy byy)
	{
		a = byy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field byy a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void bwv()>
	//    5    9:return          
	}

	bza(byy byy, byz byz)
	{
		this(byy);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void bza(byy)>
	//    3    5:return          
	}

	public final String a()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final void a(zzwb zzwb)
	{
		a(zzwb, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #22  <Method void a(zzwb, int)>
	//    4    6:return          
	}

	public final void a(zzwb zzwb, int i)
	{
		aag.c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
	//    0    0:ldc1            #24  <String "This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.">
	//    1    2:invokestatic    #30  <Method void aag.c(String)>
		zv.a.post(((Runnable) (new bzb(this))));
	//    2    5:getstatic       #35  <Field Handler zv.a>
	//    3    8:new             #37  <Class bzb>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:invokespecial   #40  <Method void bzb(bza)>
	//    7   16:invokevirtual   #46  <Method boolean Handler.post(Runnable)>
	//    8   19:pop             
	//    9   20:return          
	}

	public final String b()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final boolean c()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	final byy a;
}
