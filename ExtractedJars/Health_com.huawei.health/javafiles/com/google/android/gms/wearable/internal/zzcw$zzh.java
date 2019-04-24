// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzac;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzcw, zzac, zzax, zzw

static final class zzcw$zzh extends zzcw$zzb
{

	public void zza(zzax zzax1)
	{
		zzw zzw1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(zzax1.zzbUv != null)
	//*   2    2:aload_1         
	//*   3    3:getfield        #36  <Field android.os.ParcelFileDescriptor zzax.zzbUv>
	//*   4    6:ifnull          39
		{
			zzw1 = new zzw(((java.io.InputStream) (new android.os.eDescriptor.AutoCloseInputStream(zzax1.zzbUv))));
	//    5    9:new             #38  <Class zzw>
	//    6   12:dup             
	//    7   13:new             #40  <Class android.os.ParcelFileDescriptor$AutoCloseInputStream>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:getfield        #36  <Field android.os.ParcelFileDescriptor zzax.zzbUv>
	//   11   21:invokespecial   #43  <Method void android.os.ParcelFileDescriptor$AutoCloseInputStream(android.os.ParcelFileDescriptor)>
	//   12   24:invokespecial   #46  <Method void zzw(java.io.InputStream)>
	//   13   27:astore_2        
			zzbUS.zza(zzw1.zzUu());
	//   14   28:aload_0         
	//   15   29:getfield        #25  <Field com.google.android.gms.wearable.internal.zzac zzbUS>
	//   16   32:aload_2         
	//   17   33:invokevirtual   #50  <Method zzad zzw.zzUu()>
	//   18   36:invokevirtual   #53  <Method void zzac.zza(zzad)>
		}
		zzaa(((Object) (new zzu.zza(new Status(zzax1.statusCode), ((java.io.InputStream) (zzw1))))));
	//   19   39:aload_0         
	//   20   40:new             #55  <Class zzu$zza>
	//   21   43:dup             
	//   22   44:new             #57  <Class Status>
	//   23   47:dup             
	//   24   48:aload_1         
	//   25   49:getfield        #61  <Field int zzax.statusCode>
	//   26   52:invokespecial   #64  <Method void Status(int)>
	//   27   55:aload_2         
	//   28   56:invokespecial   #67  <Method void zzu$zza(Status, java.io.InputStream)>
	//   29   59:invokevirtual   #71  <Method void zzaa(Object)>
	//   30   62:return          
	}

	private final com.google.android.gms.wearable.internal.zzac zzbUS;

	public zzcw$zzh(com.google.android.gms.internal. , com.google.android.gms.wearable.internal.zzac zzac1)
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
