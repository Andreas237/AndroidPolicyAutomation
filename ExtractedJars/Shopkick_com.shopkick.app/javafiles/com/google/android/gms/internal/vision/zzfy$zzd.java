// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzfy, zzhh, zzfp, zzjd, 
//			zzji, zzfi

public static abstract class zzfy$zzd extends zzfy
	implements zzhh
{

	public final Object zzc(zzfi zzfi)
	{
		zzfi = ((zzfi) (zzfy.zzb(zzfi)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #30  <Method zzfy$zzf zzfy.zzb(zzfi)>
	//    2    4:astore_1        
		if(((zzfy$zzf) (zzfi)).zzwu == (zzfy)((zzfy)this).zzfb())
	//*   3    5:aload_1         
	//*   4    6:getfield        #36  <Field zzhf zzfy$zzf.zzwu>
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #40  <Method zzhf zzfy.zzfb()>
	//*   7   13:checkcast       #5   <Class zzfy>
	//*   8   16:if_acmpne       123
		{
			Object obj = zzwp.zza(((zzfr) (((zzfy$zzf) (zzfi)).zzww)));
	//    9   19:aload_0         
	//   10   20:getfield        #23  <Field zzfp zzwp>
	//   11   23:aload_1         
	//   12   24:getfield        #44  <Field zzfy$zze zzfy$zzf.zzww>
	//   13   27:invokevirtual   #48  <Method Object zzfp.zza(zzfr)>
	//   14   30:astore_3        
			if(obj == null)
	//*  15   31:aload_3         
	//*  16   32:ifnonnull       40
				return ((zzfy$zzf) (zzfi)).zzgq;
	//   17   35:aload_1         
	//   18   36:getfield        #52  <Field Object zzfy$zzf.zzgq>
	//   19   39:areturn         
			if(((zzfy$zzf) (zzfi)).zzww.zzws)
	//*  20   40:aload_1         
	//*  21   41:getfield        #44  <Field zzfy$zze zzfy$zzf.zzww>
	//*  22   44:getfield        #58  <Field boolean zzfy$zze.zzws>
	//*  23   47:ifeq            117
			{
				if(((zzfy$zzf) (zzfi)).zzww.zzwr.zzho() == zzji.zzacw)
	//*  24   50:aload_1         
	//*  25   51:getfield        #44  <Field zzfy$zze zzfy$zzf.zzww>
	//*  26   54:getfield        #62  <Field zzjd zzfy$zze.zzwr>
	//*  27   57:invokevirtual   #68  <Method zzji zzjd.zzho()>
	//*  28   60:getstatic       #74  <Field zzji zzji.zzacw>
	//*  29   63:if_acmpne       115
				{
					ArrayList arraylist = new ArrayList();
	//   30   66:new             #76  <Class ArrayList>
	//   31   69:dup             
	//   32   70:invokespecial   #77  <Method void ArrayList()>
	//   33   73:astore_2        
					for(obj = ((Object) (((List)obj).iterator())); ((Iterator) (obj)).hasNext(); ((List) (arraylist)).add(((zzfy$zzf) (zzfi)).zzg(((Iterator) (obj)).next())));
	//   34   74:aload_3         
	//   35   75:checkcast       #79  <Class List>
	//   36   78:invokeinterface #83  <Method Iterator List.iterator()>
	//   37   83:astore_3        
	//   38   84:aload_3         
	//   39   85:invokeinterface #89  <Method boolean Iterator.hasNext()>
	//   40   90:ifeq            113
	//   41   93:aload_2         
	//   42   94:aload_1         
	//   43   95:aload_3         
	//   44   96:invokeinterface #93  <Method Object Iterator.next()>
	//   45  101:invokevirtual   #97  <Method Object zzfy$zzf.zzg(Object)>
	//   46  104:invokeinterface #101 <Method boolean List.add(Object)>
	//   47  109:pop             
	//*  48  110:goto            84
					return ((Object) (arraylist));
	//   49  113:aload_2         
	//   50  114:areturn         
				} else
				{
					return obj;
	//   51  115:aload_3         
	//   52  116:areturn         
				}
			} else
			{
				return ((zzfy$zzf) (zzfi)).zzg(obj);
	//   53  117:aload_1         
	//   54  118:aload_3         
	//   55  119:invokevirtual   #97  <Method Object zzfy$zzf.zzg(Object)>
	//   56  122:areturn         
			}
		} else
		{
			throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
	//   57  123:new             #103 <Class IllegalArgumentException>
	//   58  126:dup             
	//   59  127:ldc1            #105 <String "This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.">
	//   60  129:invokespecial   #108 <Method void IllegalArgumentException(String)>
	//   61  132:athrow          
		}
	}

	protected zzfp zzwp;

	public zzfy$zzd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzfy()>
		zzwp = zzfp.zzep();
	//    2    4:aload_0         
	//    3    5:invokestatic    #21  <Method zzfp zzfp.zzep()>
	//    4    8:putfield        #23  <Field zzfp zzwp>
	//    5   11:return          
	}
}
