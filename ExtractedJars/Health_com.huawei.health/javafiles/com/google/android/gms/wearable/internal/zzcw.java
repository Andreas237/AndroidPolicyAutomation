// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.wearable.DataItemBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzo, zze, zzcr, zza, 
//			zzae, zzar, zzat, zzav, 
//			zzac, zzax, zzw, zzaz, 
//			zzx, zzbl, zzbn, zzbp, 
//			zzbr, zzce, zzci, zzaa, 
//			zzcm, zzco, zzy

final class zzcw
{
	static final class zza extends zzb
	{

		public void zza(com.google.android.gms.wearable.internal.zze zze1)
		{
			zzaa(((Object) (new zzn.zza(zzcr.zzik(zze1.statusCode)))));
		//    0    0:aload_0         
		//    1    1:new             #18  <Class zzn$zza>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:getfield        #24  <Field int zze.statusCode>
		//    5    9:invokestatic    #30  <Method Status zzcr.zzik(int)>
		//    6   12:invokespecial   #33  <Method void zzn$zza(Status)>
		//    7   15:invokevirtual   #37  <Method void zzaa(Object)>
		//    8   18:return          
		}

		public zza(com.google.android.gms.internal.zzaad.zzb zzb1)
		{
			super(zzb1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
		//    3    5:return          
		}
	}

	static abstract class zzb extends com.google.android.gms.wearable.internal.zza
	{

		public void zzaa(Object obj)
		{
			com.google.android.gms.internal.zzaad.zzb zzb1 = zzahW;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field com.google.android.gms.internal.zzaad$zzb zzahW>
		//    2    4:astore_2        
			if(zzb1 != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          21
			{
				zzb1.setResult(obj);
		//    5    9:aload_2         
		//    6   10:aload_1         
		//    7   11:invokeinterface #28  <Method void com.google.android.gms.internal.zzaad$zzb.setResult(Object)>
				zzahW = null;
		//    8   16:aload_0         
		//    9   17:aconst_null     
		//   10   18:putfield        #18  <Field com.google.android.gms.internal.zzaad$zzb zzahW>
			}
		//   11   21:return          
		}

		private com.google.android.gms.internal.zzaad.zzb zzahW;

		public zzb(com.google.android.gms.internal.zzaad.zzb zzb1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void zza()>
			zzahW = zzb1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field com.google.android.gms.internal.zzaad$zzb zzahW>
		//    5    9:return          
		}
	}

	static final class zzc extends zzb
	{

		public void zza(zzae zzae1)
		{
			zzaa(((Object) (new Status(zzae1.statusCode))));
		//    0    0:aload_0         
		//    1    1:new             #19  <Class Status>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:getfield        #25  <Field int zzae.statusCode>
		//    5    9:invokespecial   #28  <Method void Status(int)>
		//    6   12:invokevirtual   #32  <Method void zzaa(Object)>
		//    7   15:return          
		}

		public zzc(com.google.android.gms.internal.zzaad.zzb zzb1)
		{
			super(zzb1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
		//    3    5:return          
		}
	}

	static final class zzd extends zzb
	{

		public void zzb(zzae zzae1)
		{
			zzaa(((Object) (new Status(zzae1.statusCode))));
		//    0    0:aload_0         
		//    1    1:new             #19  <Class Status>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:getfield        #25  <Field int zzae.statusCode>
		//    5    9:invokespecial   #28  <Method void Status(int)>
		//    6   12:invokevirtual   #32  <Method void zzaa(Object)>
		//    7   15:return          
		}

		public zzd(com.google.android.gms.internal.zzaad.zzb zzb1)
		{
			super(zzb1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
		//    3    5:return          
		}
	}

	static final class zze extends zzb
	{

		public void zza(zzar zzar1)
		{
			zzaa(((Object) (new zzah.zzb(zzcr.zzik(zzar1.statusCode), zzar1.zzbUs))));
		//    0    0:aload_0         
		//    1    1:new             #19  <Class zzah$zzb>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:getfield        #25  <Field int zzar.statusCode>
		//    5    9:invokestatic    #31  <Method Status zzcr.zzik(int)>
		//    6   12:aload_1         
		//    7   13:getfield        #34  <Field int zzar.zzbUs>
		//    8   16:invokespecial   #37  <Method void zzah$zzb(Status, int)>
		//    9   19:invokevirtual   #41  <Method void zzaa(Object)>
		//   10   22:return          
		}

		public zze(com.google.android.gms.internal.zzaad.zzb zzb1)
		{
			super(zzb1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
		//    3    5:return          
		}
	}

	static final class zzf extends zzb
	{

		public void zza(zzat zzat1)
		{
			zzaa(((Object) (new zzn.zzd(zzcr.zzik(zzat1.statusCode), zzcw.zzT(zzat1.zzbUt)))));
		//    0    0:aload_0         
		//    1    1:new             #19  <Class zzn$zzd>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:getfield        #25  <Field int zzat.statusCode>
		//    5    9:invokestatic    #31  <Method Status zzcr.zzik(int)>
		//    6   12:aload_1         
		//    7   13:getfield        #35  <Field List zzat.zzbUt>
		//    8   16:invokestatic    #39  <Method Map zzcw.zzT(List)>
		//    9   19:invokespecial   #42  <Method void zzn$zzd(Status, Map)>
		//   10   22:invokevirtual   #46  <Method void zzaa(Object)>
		//   11   25:return          
		}

		public zzf(com.google.android.gms.internal.zzaad.zzb zzb1)
		{
			super(zzb1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
		//    3    5:return          
		}
	}

	static final class zzg extends zzb
	{

		public void zza(zzav zzav1)
		{
			zzaa(((Object) (new zzn.zze(zzcr.zzik(zzav1.statusCode), ((com.google.android.gms.wearable.CapabilityInfo) (new zzn.zzc(((com.google.android.gms.wearable.CapabilityInfo) (zzav1.zzbUu)))))))));
		//    0    0:aload_0         
		//    1    1:new             #19  <Class zzn$zze>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:getfield        #25  <Field int zzav.statusCode>
		//    5    9:invokestatic    #31  <Method Status zzcr.zzik(int)>
		//    6   12:new             #33  <Class zzn$zzc>
		//    7   15:dup             
		//    8   16:aload_1         
		//    9   17:getfield        #37  <Field zzo zzav.zzbUu>
		//   10   20:invokespecial   #40  <Method void zzn$zzc(com.google.android.gms.wearable.CapabilityInfo)>
		//   11   23:invokespecial   #43  <Method void zzn$zze(Status, com.google.android.gms.wearable.CapabilityInfo)>
		//   12   26:invokevirtual   #47  <Method void zzaa(Object)>
		//   13   29:return          
		}

		public zzg(com.google.android.gms.internal.zzaad.zzb zzb1)
		{
			super(zzb1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
		//    3    5:return          
		}
	}

	static final class zzh extends zzb
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
				zzw1 = new zzw(((java.io.InputStream) (new android.os.ParcelFileDescriptor.AutoCloseInputStream(zzax1.zzbUv))));
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

		public zzh(com.google.android.gms.internal.zzaad.zzb zzb1, com.google.android.gms.wearable.internal.zzac zzac1)
		{
			super(zzb1);
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

	static final class zzi extends zzb
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
				zzx1 = new zzx(((java.io.OutputStream) (new android.os.ParcelFileDescriptor.AutoCloseOutputStream(zzaz1.zzbUv))));
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

		public zzi(com.google.android.gms.internal.zzaad.zzb zzb1, com.google.android.gms.wearable.internal.zzac zzac1)
		{
			super(zzb1);
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

	static final class zzj extends zzb
	{

		public void zza(zzbl zzbl1)
		{
			ArrayList arraylist = new ArrayList();
		//    0    0:new             #19  <Class ArrayList>
		//    1    3:dup             
		//    2    4:invokespecial   #22  <Method void ArrayList()>
		//    3    7:astore_2        
			((List) (arraylist)).addAll(((java.util.Collection) (zzbl1.zzbUB)));
		//    4    8:aload_2         
		//    5    9:aload_1         
		//    6   10:getfield        #28  <Field List zzbl.zzbUB>
		//    7   13:invokeinterface #34  <Method boolean List.addAll(java.util.Collection)>
		//    8   18:pop             
			zzaa(((Object) (new zzcb.zza(zzcr.zzik(zzbl1.statusCode), ((List) (arraylist))))));
		//    9   19:aload_0         
		//   10   20:new             #36  <Class zzcb$zza>
		//   11   23:dup             
		//   12   24:aload_1         
		//   13   25:getfield        #40  <Field int zzbl.statusCode>
		//   14   28:invokestatic    #46  <Method Status zzcr.zzik(int)>
		//   15   31:aload_2         
		//   16   32:invokespecial   #49  <Method void zzcb$zza(Status, List)>
		//   17   35:invokevirtual   #53  <Method void zzaa(Object)>
		//   18   38:return          
		}

		public zzj(com.google.android.gms.internal.zzaad.zzb zzb1)
		{
			super(zzb1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
		//    3    5:return          
		}
	}

	static final class zzk extends zzb
	{

		public void zza(zzbn zzbn1)
		{
			zzaa(((Object) (new zzah.zza(zzcr.zzik(zzbn1.statusCode), ((com.google.android.gms.wearable.DataItem) (zzbn1.zzbUC))))));
		//    0    0:aload_0         
		//    1    1:new             #19  <Class zzah$zza>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:getfield        #25  <Field int zzbn.statusCode>
		//    5    9:invokestatic    #31  <Method Status zzcr.zzik(int)>
		//    6   12:aload_1         
		//    7   13:getfield        #35  <Field zzao zzbn.zzbUC>
		//    8   16:invokespecial   #38  <Method void zzah$zza(Status, com.google.android.gms.wearable.DataItem)>
		//    9   19:invokevirtual   #42  <Method void zzaa(Object)>
		//   10   22:return          
		}

		public zzk(com.google.android.gms.internal.zzaad.zzb zzb1)
		{
			super(zzb1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
		//    3    5:return          
		}
	}

	static final class zzl extends zzb
	{

		public void zzar(DataHolder dataholder)
		{
			zzaa(((Object) (new DataItemBuffer(dataholder))));
		//    0    0:aload_0         
		//    1    1:new             #19  <Class DataItemBuffer>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:invokespecial   #21  <Method void DataItemBuffer(DataHolder)>
		//    5    9:invokevirtual   #25  <Method void zzaa(Object)>
		//    6   12:return          
		}

		public zzl(com.google.android.gms.internal.zzaad.zzb zzb1)
		{
			super(zzb1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
		//    3    5:return          
		}
	}

	static final class zzm extends zzb
	{

		public void zza(zzbp zzbp1)
		{
			zzaa(((Object) (new zzah.zzc(zzcr.zzik(zzbp1.statusCode), zzbp1.zzbyd))));
		//    0    0:aload_0         
		//    1    1:new             #19  <Class zzah$zzc>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:getfield        #25  <Field int zzbp.statusCode>
		//    5    9:invokestatic    #31  <Method Status zzcr.zzik(int)>
		//    6   12:aload_1         
		//    7   13:getfield        #35  <Field android.os.ParcelFileDescriptor zzbp.zzbyd>
		//    8   16:invokespecial   #38  <Method void zzah$zzc(Status, android.os.ParcelFileDescriptor)>
		//    9   19:invokevirtual   #42  <Method void zzaa(Object)>
		//   10   22:return          
		}

		public zzm(com.google.android.gms.internal.zzaad.zzb zzb1)
		{
			super(zzb1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
		//    3    5:return          
		}
	}

	static final class zzn extends zzb
	{

		public void zza(zzbr zzbr1)
		{
			zzaa(((Object) (new zzcb.zzb(zzcr.zzik(zzbr1.statusCode), ((com.google.android.gms.wearable.Node) (zzbr1.zzbUD))))));
		//    0    0:aload_0         
		//    1    1:new             #19  <Class zzcb$zzb>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:getfield        #25  <Field int zzbr.statusCode>
		//    5    9:invokestatic    #31  <Method Status zzcr.zzik(int)>
		//    6   12:aload_1         
		//    7   13:getfield        #35  <Field zzcc zzbr.zzbUD>
		//    8   16:invokespecial   #38  <Method void zzcb$zzb(Status, com.google.android.gms.wearable.Node)>
		//    9   19:invokevirtual   #42  <Method void zzaa(Object)>
		//   10   22:return          
		}

		public zzn(com.google.android.gms.internal.zzaad.zzb zzb1)
		{
			super(zzb1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
		//    3    5:return          
		}
	}

	static final class zzo extends com.google.android.gms.wearable.internal.zza
	{

		public void zza(Status status)
		{
		//    0    0:return          
		}

		zzo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void zza()>
		//    2    4:return          
		}
	}

	static final class zzp extends zzb
	{

		public void zza(zzce zzce1)
		{
			zzaa(((Object) (new zzq.zza(zzcr.zzik(zzce1.statusCode), ((com.google.android.gms.wearable.Channel) (zzce1.zzbTW))))));
		//    0    0:aload_0         
		//    1    1:new             #19  <Class zzq$zza>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:getfield        #25  <Field int zzce.statusCode>
		//    5    9:invokestatic    #31  <Method Status zzcr.zzik(int)>
		//    6   12:aload_1         
		//    7   13:getfield        #35  <Field zzu zzce.zzbTW>
		//    8   16:invokespecial   #38  <Method void zzq$zza(Status, com.google.android.gms.wearable.Channel)>
		//    9   19:invokevirtual   #42  <Method void zzaa(Object)>
		//   10   22:return          
		}

		public zzp(com.google.android.gms.internal.zzaad.zzb zzb1)
		{
			super(zzb1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
		//    3    5:return          
		}
	}

	static final class zzq extends zzb
	{

		public void zza(zzci zzci1)
		{
			zzaa(((Object) (new zzah.zza(zzcr.zzik(zzci1.statusCode), ((com.google.android.gms.wearable.DataItem) (zzci1.zzbUC))))));
		//    0    0:aload_0         
		//    1    1:new             #25  <Class zzah$zza>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:getfield        #31  <Field int zzci.statusCode>
		//    5    9:invokestatic    #37  <Method Status zzcr.zzik(int)>
		//    6   12:aload_1         
		//    7   13:getfield        #41  <Field zzao zzci.zzbUC>
		//    8   16:invokespecial   #44  <Method void zzah$zza(Status, com.google.android.gms.wearable.DataItem)>
		//    9   19:invokevirtual   #48  <Method void zzaa(Object)>
			if(zzci1.statusCode != 0)
		//*  10   22:aload_1         
		//*  11   23:getfield        #31  <Field int zzci.statusCode>
		//*  12   26:ifeq            65
				for(zzci1 = ((zzci) (zzIz.iterator())); ((Iterator) (zzci1)).hasNext(); ((FutureTask)((Iterator) (zzci1)).next()).cancel(true));
		//   13   29:aload_0         
		//   14   30:getfield        #18  <Field List zzIz>
		//   15   33:invokeinterface #54  <Method Iterator List.iterator()>
		//   16   38:astore_1        
		//   17   39:aload_1         
		//   18   40:invokeinterface #60  <Method boolean Iterator.hasNext()>
		//   19   45:ifeq            65
		//   20   48:aload_1         
		//   21   49:invokeinterface #64  <Method Object Iterator.next()>
		//   22   54:checkcast       #66  <Class FutureTask>
		//   23   57:iconst_1        
		//   24   58:invokevirtual   #70  <Method boolean FutureTask.cancel(boolean)>
		//   25   61:pop             
		//*  26   62:goto            39
		//   27   65:return          
		}

		private final List zzIz;

		zzq(com.google.android.gms.internal.zzaad.zzb zzb1, List list)
		{
			super(zzb1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #16  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
			zzIz = list;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #18  <Field List zzIz>
		//    6   10:return          
		}
	}

	static final class zzr extends zzb
	{

		public void zza(zzaa zzaa1)
		{
			zzaa(((Object) (new Status(zzaa1.statusCode))));
		//    0    0:aload_0         
		//    1    1:new             #19  <Class Status>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:getfield        #25  <Field int zzaa.statusCode>
		//    5    9:invokespecial   #28  <Method void Status(int)>
		//    6   12:invokevirtual   #32  <Method void zzaa(Object)>
		//    7   15:return          
		}

		public zzr(com.google.android.gms.internal.zzaad.zzb zzb1)
		{
			super(zzb1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
		//    3    5:return          
		}
	}

	static final class zzs extends zzb
	{

		public void zza(zzcm zzcm1)
		{
			zzaa(((Object) (new zzn.zza(zzcr.zzik(zzcm1.statusCode)))));
		//    0    0:aload_0         
		//    1    1:new             #19  <Class zzn$zza>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:getfield        #25  <Field int zzcm.statusCode>
		//    5    9:invokestatic    #31  <Method Status zzcr.zzik(int)>
		//    6   12:invokespecial   #34  <Method void zzn$zza(Status)>
		//    7   15:invokevirtual   #38  <Method void zzaa(Object)>
		//    8   18:return          
		}

		public zzs(com.google.android.gms.internal.zzaad.zzb zzb1)
		{
			super(zzb1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
		//    3    5:return          
		}
	}

	static final class zzt extends zzb
	{

		public void zza(zzco zzco1)
		{
			zzaa(((Object) (new zzby.zzb(zzcr.zzik(zzco1.statusCode), zzco1.zzbhU))));
		//    0    0:aload_0         
		//    1    1:new             #19  <Class zzby$zzb>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:getfield        #25  <Field int zzco.statusCode>
		//    5    9:invokestatic    #31  <Method Status zzcr.zzik(int)>
		//    6   12:aload_1         
		//    7   13:getfield        #34  <Field int zzco.zzbhU>
		//    8   16:invokespecial   #37  <Method void zzby$zzb(Status, int)>
		//    9   19:invokevirtual   #41  <Method void zzaa(Object)>
		//   10   22:return          
		}

		public zzt(com.google.android.gms.internal.zzaad.zzb zzb1)
		{
			super(zzb1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
		//    3    5:return          
		}
	}

	static final class zzu extends zzb
	{

		public void zza(zzy zzy1)
		{
			zzaa(((Object) (new Status(zzy1.statusCode))));
		//    0    0:aload_0         
		//    1    1:new             #19  <Class Status>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:getfield        #25  <Field int zzy.statusCode>
		//    5    9:invokespecial   #28  <Method void Status(int)>
		//    6   12:invokevirtual   #32  <Method void zzaa(Object)>
		//    7   15:return          
		}

		public zzu(com.google.android.gms.internal.zzaad.zzb zzb1)
		{
			super(zzb1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
		//    3    5:return          
		}
	}


	private static Map zzS(List list)
	{
		HashMap hashmap = new HashMap(list.size() * 2);
	//    0    0:new             #71  <Class HashMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #77  <Method int List.size()>
	//    4   10:iconst_2        
	//    5   11:imul            
	//    6   12:invokespecial   #81  <Method void HashMap(int)>
	//    7   15:astore_1        
		com.google.android.gms.wearable.internal.zzo zzo1;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); hashmap.put(((Object) (zzo1.getName())), ((Object) (new zzn.zzc(((com.google.android.gms.wearable.CapabilityInfo) (zzo1)))))))
	//*   8   16:aload_0         
	//*   9   17:invokeinterface #85  <Method Iterator List.iterator()>
	//*  10   22:astore_0        
	//*  11   23:aload_0         
	//*  12   24:invokeinterface #91  <Method boolean Iterator.hasNext()>
	//*  13   29:ifeq            62
			zzo1 = (com.google.android.gms.wearable.internal.zzo)((Iterator) (list)).next();
	//   14   32:aload_0         
	//   15   33:invokeinterface #95  <Method Object Iterator.next()>
	//   16   38:checkcast       #97  <Class zzo>
	//   17   41:astore_2        

	//   18   42:aload_1         
	//   19   43:aload_2         
	//   20   44:invokevirtual   #101 <Method String zzo.getName()>
	//   21   47:new             #103 <Class zzn$zzc>
	//   22   50:dup             
	//   23   51:aload_2         
	//   24   52:invokespecial   #106 <Method void zzn$zzc(com.google.android.gms.wearable.CapabilityInfo)>
	//   25   55:invokevirtual   #110 <Method Object HashMap.put(Object, Object)>
	//   26   58:pop             
	//*  27   59:goto            23
		return ((Map) (hashmap));
	//   28   62:aload_1         
	//   29   63:areturn         
	}

	static Map zzT(List list)
	{
		return zzS(list);
	//    0    0:aload_0         
	//    1    1:invokestatic    #116 <Method Map zzS(List)>
	//    2    4:areturn         
	}
}
