// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzsi, zzse

final class zzsg extends ContentObserver
{

	zzsg(zzse zzse, Handler handler)
	{
		super(((Handler) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #9   <Method void ContentObserver(Handler)>
	//    3    5:return          
	}

	public final void onChange(boolean flag)
	{
		zzsi.zztq();
	//    0    0:invokestatic    #18  <Method void zzsi.zztq()>
	//    1    3:return          
	}
}
