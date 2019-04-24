// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzac;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzcw, zzac, zzaz, zzx

static final class zzcw$zzi extends zzcw$zzb
{

	public void zza(zzaz zzaz1)
	{
		zzx zzx1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(zzaz1.zzbUv != null)
	//*   2    2:aload_1         
	//*   3    3:getfield        #36  <Field android.os.ParcelFileDescriptor zzaz.zzbUv>
	//*   4    6:ifnull          39
		{
			zzx1 = new zzx(((java.io.OutputStream) (new android.os.eDescriptor.AutoCloseOutputStream(zzaz1.zzbUv))));
	//    5    9:new             #38  <Class zzx>
	//    6   12:dup             
	//    7   13:new             #40  <Class android.os.ParcelFileDescriptor$AutoCloseOutputStream>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:getfield        #36  <Field android.os.ParcelFileDescriptor zzaz.zzbUv>
	//   11   21:invokespecial   #43  <Method void android.os.ParcelFileDescriptor$AutoCloseOutputStream(android.os.ParcelFileDescriptor)>
	//   12   24:invokespecial   #46  <Method void zzx(java.io.OutputStream)>
	//   13   27:astore_2        
			zzbUS.zza(zzx1.zzUu());
	//   14   28:aload_0         
	//   15   29:getfield        #25  <Field com.google.android.gms.wearable.internal.zzac zzbUS>
	//   16   32:aload_2         
	//   17   33:invokevirtual   #50  <Method zzad zzx.zzUu()>
	//   18   36:invokevirtual   #53  <Method void zzac.zza(zzad)>
		}
		zzaa(((Object) (new zzu.zzb(new Status(zzaz1.statusCode), ((java.io.OutputStream) (zzx1))))));
	//   19   39:aload_0         
	//   20   40:new             #55  <Class zzu$zzb>
	//   21   43:dup             
	//   22   44:new             #57  <Class Status>
	//   23   47:dup             
	//   24   48:aload_1         
	//   25   49:getfield        #61  <Field int zzaz.statusCode>
	//   26   52:invokespecial   #64  <Method void Status(int)>
	//   27   55:aload_2         
	//   28   56:invokespecial   #67  <Method void zzu$zzb(Status, java.io.OutputStream)>
	//   29   59:invokevirtual   #71  <Method void zzaa(Object)>
	//   30   62:return          
	}

	private final com.google.android.gms.wearable.internal.zzac zzbUS;

	public zzcw$zzi(com.google.android.gms.internal. , com.google.android.gms.wearable.internal.zzac zzac1)
	{
		super();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
		zzbUS = (com.google.android.gms.wearable.internal.zzac)zzac.zzw(((Object) (zzac1)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokestatic    #21  <Method Object zzac.zzw(Object)>
	//    6   10:checkcast       #23  <Class com.google.android.gms.wearable.internal.zzac>
	//    7   13:putfield        #25  <Field com.google.android.gms.wearable.internal.zzac zzbUS>
	//    8   16:return          
	}
}
