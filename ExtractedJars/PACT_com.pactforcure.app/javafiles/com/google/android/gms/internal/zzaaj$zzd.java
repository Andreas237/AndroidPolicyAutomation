// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//			zzaxr, zzaaj, zzaan, zzayb, 
//			zzaam

private static class zzaaj$zzd extends zzaxr
{

	public void zzb(zzayb zzayb)
	{
		zzaaj zzaaj1 = (zzaaj)zzaAb.get();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field WeakReference zzaAb>
	//    2    4:invokevirtual   #32  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class zzaaj>
	//    4   10:astore_2        
		if(zzaaj1 == null)
	//*   5   11:aload_2         
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			zzaaj.zzd(zzaaj1).zza(((zzaan$zza) (new zzaan.zza(((zzaam) (zzaaj1)), zzaaj1, zzayb) {

				public void zzvA()
				{
					zzaaj.zza(zzaAh, zzaAi);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field zzaaj zzaAh>
				//    2    4:aload_0         
				//    3    5:getfield        #22  <Field zzayb zzaAi>
				//    4    8:invokestatic    #32  <Method void zzaaj.zza(zzaaj, zzayb)>
				//    5   11:return          
				}

				final zzaaj zzaAh;
				final zzayb zzaAi;

			
			{
				zzaAh = zzaaj1;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #20  <Field zzaaj zzaAh>
				zzaAi = zzayb;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #22  <Field zzayb zzaAi>
				super(zzaam);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:invokespecial   #25  <Method void zzaan$zza(zzaam)>
			//    9   16:return          
			}
			}
)));
	//    8   16:aload_2         
	//    9   17:invokestatic    #35  <Method zzaan zzaaj.zzd(zzaaj)>
	//   10   20:new             #9   <Class zzaaj$zzd$1>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:aload_2         
	//   15   27:aload_1         
	//   16   28:invokespecial   #38  <Method void zzaaj$zzd$1(zzaaj$zzd, zzaam, zzaaj, zzayb)>
	//   17   31:invokevirtual   #44  <Method void zzaan.zza(zzaan$zza)>
			return;
	//   18   34:return          
		}
	}

	private final WeakReference zzaAb;

	zzaaj$zzd(zzaaj zzaaj1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void zzaxr()>
		zzaAb = new WeakReference(((Object) (zzaaj1)));
	//    2    4:aload_0         
	//    3    5:new             #19  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #22  <Method void WeakReference(Object)>
	//    7   13:putfield        #24  <Field WeakReference zzaAb>
	//    8   16:return          
	}
}
