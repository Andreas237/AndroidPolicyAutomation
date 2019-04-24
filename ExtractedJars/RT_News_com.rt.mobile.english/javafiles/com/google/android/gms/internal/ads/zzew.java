// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.database.ContentObserver;
import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzet

final class zzew extends ContentObserver
{

	public zzew(zzet zzet1, Handler handler)
	{
		zzafk = zzet1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field zzet zzafk>
		super(handler);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void ContentObserver(Handler)>
	//    6   10:return          
	}

	public final void onChange(boolean flag)
	{
		super.onChange(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #18  <Method void ContentObserver.onChange(boolean)>
		zzafk.zzgb();
	//    3    5:aload_0         
	//    4    6:getfield        #10  <Field zzet zzafk>
	//    5    9:invokevirtual   #24  <Method void zzet.zzgb()>
	//    6   12:return          
	}

	private final zzet zzafk;
}
