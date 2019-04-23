// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzru

final class zzrv extends ContentObserver
{

	zzrv(Handler handler)
	{
		super(((Handler) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #8   <Method void ContentObserver(Handler)>
	//    3    5:return          
	}

	public final void onChange(boolean flag)
	{
		zzru.zzti().set(true);
	//    0    0:invokestatic    #17  <Method AtomicBoolean zzru.zzti()>
	//    1    3:iconst_1        
	//    2    4:invokevirtual   #22  <Method void AtomicBoolean.set(boolean)>
	//    3    7:return          
	}
}
