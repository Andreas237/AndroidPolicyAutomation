// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.IBinder;
import com.google.android.gms.common.api.zzf;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//			zzabq, zzzx

private static class zzabq$zza
	implements android.os.athRecipient, zzabq$zzb
{

	private void zzwx()
	{
		Object obj = ((Object) ((zzzx)zzaCa.get()));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field WeakReference zzaCa>
	//    2    4:invokevirtual   #45  <Method Object WeakReference.get()>
	//    3    7:checkcast       #47  <Class zzzx>
	//    4   10:astore_1        
		zzf zzf1 = (zzf)zzaCb.get();
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field WeakReference zzaCb>
	//    7   15:invokevirtual   #45  <Method Object WeakReference.get()>
	//    8   18:checkcast       #49  <Class zzf>
	//    9   21:astore_2        
		if(zzf1 != null && obj != null)
	//*  10   22:aload_2         
	//*  11   23:ifnull          41
	//*  12   26:aload_1         
	//*  13   27:ifnull          41
			zzf1.remove(((zzzx) (obj)).zzuR().intValue());
	//   14   30:aload_2         
	//   15   31:aload_1         
	//   16   32:invokevirtual   #53  <Method Integer zzzx.zzuR()>
	//   17   35:invokevirtual   #59  <Method int Integer.intValue()>
	//   18   38:invokevirtual   #63  <Method void zzf.remove(int)>
		obj = ((Object) ((IBinder)zzaCc.get()));
	//   19   41:aload_0         
	//   20   42:getfield        #34  <Field WeakReference zzaCc>
	//   21   45:invokevirtual   #45  <Method Object WeakReference.get()>
	//   22   48:checkcast       #65  <Class IBinder>
	//   23   51:astore_1        
		if(obj != null)
	//*  24   52:aload_1         
	//*  25   53:ifnull          65
			((IBinder) (obj)).unlinkToDeath(((android.os.athRecipient) (this)), 0);
	//   26   56:aload_1         
	//   27   57:aload_0         
	//   28   58:iconst_0        
	//   29   59:invokeinterface #69  <Method boolean IBinder.unlinkToDeath(android.os.IBinder$DeathRecipient, int)>
	//   30   64:pop             
	//   31   65:return          
	}

	public void binderDied()
	{
		zzwx();
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void zzwx()>
	//    2    4:return          
	}

	public void zzc(zzzx zzzx1)
	{
		zzwx();
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void zzwx()>
	//    2    4:return          
	}

	private final WeakReference zzaCa;
	private final WeakReference zzaCb;
	private final WeakReference zzaCc;

	private zzabq$zza(zzzx zzzx1, zzf zzf1, IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		zzaCb = new WeakReference(((Object) (zzf1)));
	//    2    4:aload_0         
	//    3    5:new             #25  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokespecial   #28  <Method void WeakReference(Object)>
	//    7   13:putfield        #30  <Field WeakReference zzaCb>
		zzaCa = new WeakReference(((Object) (zzzx1)));
	//    8   16:aload_0         
	//    9   17:new             #25  <Class WeakReference>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #28  <Method void WeakReference(Object)>
	//   13   25:putfield        #32  <Field WeakReference zzaCa>
		zzaCc = new WeakReference(((Object) (ibinder)));
	//   14   28:aload_0         
	//   15   29:new             #25  <Class WeakReference>
	//   16   32:dup             
	//   17   33:aload_3         
	//   18   34:invokespecial   #28  <Method void WeakReference(Object)>
	//   19   37:putfield        #34  <Field WeakReference zzaCc>
	//   20   40:return          
	}

	zzabq$zza(zzzx zzzx1, zzf zzf1, IBinder ibinder, zzabq._cls1 _pcls1)
	{
		this(zzzx1, zzf1, ibinder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #40  <Method void zzabq$zza(zzzx, zzf, IBinder)>
	//    5    7:return          
	}
}
