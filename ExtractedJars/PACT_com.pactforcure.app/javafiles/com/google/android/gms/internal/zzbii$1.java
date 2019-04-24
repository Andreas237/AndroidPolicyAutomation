// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.internal:
//			zzbii

final class zzbii$1 extends ContentObserver
{

	public void onChange(boolean flag)
	{
		zzbii.zzTf().set(true);
	//    0    0:invokestatic    #20  <Method AtomicBoolean zzbii.zzTf()>
	//    1    3:iconst_1        
	//    2    4:invokevirtual   #25  <Method void AtomicBoolean.set(boolean)>
	//    3    7:return          
	}

	zzbii$1(Handler handler)
	{
		super(handler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void ContentObserver(Handler)>
	//    3    5:return          
	}
}
