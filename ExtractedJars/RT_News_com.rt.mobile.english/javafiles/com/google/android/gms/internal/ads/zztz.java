// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.*;
import com.google.android.gms.common.util.Clock;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzty, zzss, zzst, zzsu, 
//			zztc, zzte, zztg, zzti, 
//			zztw, zzjj

final class zztz
{

	zztz(zzty zzty1, zzss zzss1)
	{
		zzbow = zzty1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field zzty zzbow>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #25  <Method void Object()>
		zzbor = zzss1.zzaw(com.google.android.gms.internal.ads.zzty.zza(zzty1));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokestatic    #31  <Method String com.google.android.gms.internal.ads.zzty.zza(zzty)>
	//    9   15:invokevirtual   #37  <Method zzal zzss.zzaw(String)>
	//   10   18:putfield        #39  <Field zzal zzbor>
		zzbot = new zzst();
	//   11   21:aload_0         
	//   12   22:new             #41  <Class zzst>
	//   13   25:dup             
	//   14   26:invokespecial   #42  <Method void zzst()>
	//   15   29:putfield        #44  <Field zzst zzbot>
		zzty1 = ((zzty) (zzbot));
	//   16   32:aload_0         
	//   17   33:getfield        #44  <Field zzst zzbot>
	//   18   36:astore_1        
		zzss1 = ((zzss) (zzbor));
	//   19   37:aload_0         
	//   20   38:getfield        #39  <Field zzal zzbor>
	//   21   41:astore_2        
		((zza) (zzss1)).zza(((zzkh) (new zzsu(((zzst) (zzty1))))));
	//   22   42:aload_2         
	//   23   43:new             #46  <Class zzsu>
	//   24   46:dup             
	//   25   47:aload_1         
	//   26   48:invokespecial   #49  <Method void zzsu(zzst)>
	//   27   51:invokevirtual   #54  <Method void zza.zza(zzkh)>
		((zza) (zzss1)).zza(((zzla) (new zztc(((zzst) (zzty1))))));
	//   28   54:aload_2         
	//   29   55:new             #56  <Class zztc>
	//   30   58:dup             
	//   31   59:aload_1         
	//   32   60:invokespecial   #57  <Method void zztc(zzst)>
	//   33   63:invokevirtual   #60  <Method void zza.zza(zzla)>
		((zza) (zzss1)).zza(((zzod) (new zzte(((zzst) (zzty1))))));
	//   34   66:aload_2         
	//   35   67:new             #62  <Class zzte>
	//   36   70:dup             
	//   37   71:aload_1         
	//   38   72:invokespecial   #63  <Method void zzte(zzst)>
	//   39   75:invokevirtual   #66  <Method void zza.zza(zzod)>
		((zza) (zzss1)).zza(((zzke) (new zztg(((zzst) (zzty1))))));
	//   40   78:aload_2         
	//   41   79:new             #68  <Class zztg>
	//   42   82:dup             
	//   43   83:aload_1         
	//   44   84:invokespecial   #69  <Method void zztg(zzst)>
	//   45   87:invokevirtual   #72  <Method void zza.zza(zzke)>
		((zza) (zzss1)).zza(((zzahe) (new zzti(((zzst) (zzty1))))));
	//   46   90:aload_2         
	//   47   91:new             #74  <Class zzti>
	//   48   94:dup             
	//   49   95:aload_1         
	//   50   96:invokespecial   #75  <Method void zzti(zzst)>
	//   51   99:invokevirtual   #78  <Method void zza.zza(zzahe)>
	//   52  102:return          
	}

	zztz(zzty zzty1, zzss zzss1, zzjj zzjj)
	{
		this(zzty1, zzss1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #82  <Method void zztz(zzty, zzss)>
		zzbos = zzjj;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #84  <Field zzjj zzbos>
	//    7   11:return          
	}

	final boolean load()
	{
		if(zzwa)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field boolean zzwa>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		zzjj zzjj;
		if(zzbos != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #84  <Field zzjj zzbos>
	//*   7   13:ifnull          24
			zzjj = zzbos;
	//    8   16:aload_0         
	//    9   17:getfield        #84  <Field zzjj zzbos>
	//   10   20:astore_1        
		else
	//*  11   21:goto            32
			zzjj = zzty.zzb(zzbow);
	//   12   24:aload_0         
	//   13   25:getfield        #22  <Field zzty zzbow>
	//   14   28:invokestatic    #92  <Method zzjj zzty.zzb(zzty)>
	//   15   31:astore_1        
		zzjj = zztw.zzi(zzjj);
	//   16   32:aload_1         
	//   17   33:invokestatic    #98  <Method zzjj zztw.zzi(zzjj)>
	//   18   36:astore_1        
		zzbov = ((zza) (zzbor)).zzb(zzjj);
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #39  <Field zzal zzbor>
	//   22   42:aload_1         
	//   23   43:invokevirtual   #101 <Method boolean zza.zzb(zzjj)>
	//   24   46:putfield        #103 <Field boolean zzbov>
		zzwa = true;
	//   25   49:aload_0         
	//   26   50:iconst_1        
	//   27   51:putfield        #88  <Field boolean zzwa>
		zzbou = zzbv.zzer().currentTimeMillis();
	//   28   54:aload_0         
	//   29   55:invokestatic    #109 <Method Clock zzbv.zzer()>
	//   30   58:invokeinterface #115 <Method long Clock.currentTimeMillis()>
	//   31   63:putfield        #117 <Field long zzbou>
		return true;
	//   32   66:iconst_1        
	//   33   67:ireturn         
	}

	zzal zzbor;
	zzjj zzbos;
	zzst zzbot;
	long zzbou;
	boolean zzbov;
	private final zzty zzbow;
	boolean zzwa;
}
