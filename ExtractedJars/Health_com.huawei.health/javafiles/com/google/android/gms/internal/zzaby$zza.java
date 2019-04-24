// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.IBinder;
import com.google.android.gms.common.api.zzf;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//			zzaby, zzaaf

static class zzaby$zza
	implements android.os.athRecipient, zzaby$zzb
{

	private void zzxe()
	{
		Object obj = ((Object) ((zzaaf)zzaDz.get()));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field WeakReference zzaDz>
	//    2    4:invokevirtual   #45  <Method Object WeakReference.get()>
	//    3    7:checkcast       #47  <Class zzaaf>
	//    4   10:astore_1        
		zzf zzf1 = (zzf)zzaDA.get();
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field WeakReference zzaDA>
	//    7   15:invokevirtual   #45  <Method Object WeakReference.get()>
	//    8   18:checkcast       #49  <Class zzf>
	//    9   21:astore_2        
		if(zzf1 != null && obj != null)
	//*  10   22:aload_2         
	//*  11   23:ifnull          41
	//*  12   26:aload_1         
	//*  13   27:ifnull          41
			zzf1.remove(((zzaaf) (obj)).zzvr().intValue());
	//   14   30:aload_2         
	//   15   31:aload_1         
	//   16   32:invokevirtual   #53  <Method Integer zzaaf.zzvr()>
	//   17   35:invokevirtual   #59  <Method int Integer.intValue()>
	//   18   38:invokevirtual   #63  <Method void zzf.remove(int)>
		obj = ((Object) ((IBinder)zzaDB.get()));
	//   19   41:aload_0         
	//   20   42:getfield        #34  <Field WeakReference zzaDB>
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
		zzxe();
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void zzxe()>
	//    2    4:return          
	}

	public void zzc(zzaaf zzaaf1)
	{
		zzxe();
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void zzxe()>
	//    2    4:return          
	}

	private final WeakReference zzaDA;
	private final WeakReference zzaDB;
	private final WeakReference zzaDz;

	private zzaby$zza(zzaaf zzaaf1, zzf zzf1, IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		zzaDA = new WeakReference(((Object) (zzf1)));
	//    2    4:aload_0         
	//    3    5:new             #25  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokespecial   #28  <Method void WeakReference(Object)>
	//    7   13:putfield        #30  <Field WeakReference zzaDA>
		zzaDz = new WeakReference(((Object) (zzaaf1)));
	//    8   16:aload_0         
	//    9   17:new             #25  <Class WeakReference>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #28  <Method void WeakReference(Object)>
	//   13   25:putfield        #32  <Field WeakReference zzaDz>
		zzaDB = new WeakReference(((Object) (ibinder)));
	//   14   28:aload_0         
	//   15   29:new             #25  <Class WeakReference>
	//   16   32:dup             
	//   17   33:aload_3         
	//   18   34:invokespecial   #28  <Method void WeakReference(Object)>
	//   19   37:putfield        #34  <Field WeakReference zzaDB>
	//   20   40:return          
	}

	zzaby$zza(zzaaf zzaaf1, zzf zzf1, IBinder ibinder, zzaby._cls1 _pcls1)
	{
		this(zzaaf1, zzf1, ibinder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #40  <Method void zzaby$zza(zzaaf, zzf, IBinder)>
	//    5    7:return          
	}
}
