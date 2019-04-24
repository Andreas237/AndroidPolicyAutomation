// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//			zzbam, zzaar, zzaav, zzbaw, 
//			zzaau

static class zzaar$zzd extends zzbam
{

	public void zzb(zzbaw zzbaw)
	{
		zzaar zzaar1 = (zzaar)zzaBB.get();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field WeakReference zzaBB>
	//    2    4:invokevirtual   #32  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class zzaar>
	//    4   10:astore_2        
		if(zzaar1 == null)
	//*   5   11:aload_2         
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			zzaar.zzd(zzaar1).zza(((zzaav$zza) (new zzaav.zza(((zzaau) (zzaar1)), zzaar1, zzbaw) {

				public void zzwe()
				{
					zzaar.zza(zzaBH, zzaBI);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field zzaar zzaBH>
				//    2    4:aload_0         
				//    3    5:getfield        #22  <Field zzbaw zzaBI>
				//    4    8:invokestatic    #32  <Method void zzaar.zza(zzaar, zzbaw)>
				//    5   11:return          
				}

				final zzaar zzaBH;
				final zzbaw zzaBI;

			
			{
				zzaBH = zzaar1;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #20  <Field zzaar zzaBH>
				zzaBI = zzbaw;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #22  <Field zzbaw zzaBI>
				super(zzaau);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:invokespecial   #25  <Method void zzaav$zza(zzaau)>
			//    9   16:return          
			}
			}
)));
	//    8   16:aload_2         
	//    9   17:invokestatic    #35  <Method zzaav zzaar.zzd(zzaar)>
	//   10   20:new             #9   <Class zzaar$zzd$1>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:aload_2         
	//   15   27:aload_1         
	//   16   28:invokespecial   #38  <Method void zzaar$zzd$1(zzaar$zzd, zzaau, zzaar, zzbaw)>
	//   17   31:invokevirtual   #44  <Method void zzaav.zza(zzaav$zza)>
			return;
	//   18   34:return          
		}
	}

	private final WeakReference zzaBB;

	zzaar$zzd(zzaar zzaar1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void zzbam()>
		zzaBB = new WeakReference(((Object) (zzaar1)));
	//    2    4:aload_0         
	//    3    5:new             #19  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #22  <Method void WeakReference(Object)>
	//    7   13:putfield        #24  <Field WeakReference zzaBB>
	//    8   16:return          
	}
}
