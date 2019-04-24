// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbdn, zzbck, zzbcl, zzbct, 
//			zzbbn, zzbbq, zzbcs, zzbdo, 
//			zzbbo, zzbbf, zzbda, zzbde, 
//			zzbce, zzbcr, zzbcy, zzbdm

final class zzbcj
	implements zzbdn
{

	public zzbcj()
	{
		this(((zzbct) (new zzbcl(new zzbct[] {
			zzbbn.zzadc(), zzaea()
		}))));
	//    0    0:aload_0         
	//    1    1:new             #21  <Class zzbcl>
	//    2    4:dup             
	//    3    5:iconst_2        
	//    4    6:anewarray       zzbct[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:invokestatic    #29  <Method zzbbn zzbbn.zzadc()>
	//    8   14:aastore         
	//    9   15:dup             
	//   10   16:iconst_1        
	//   11   17:invokestatic    #33  <Method zzbct zzaea()>
	//   12   20:aastore         
	//   13   21:invokespecial   #36  <Method void zzbcl(zzbct[])>
	//   14   24:invokespecial   #39  <Method void zzbcj(zzbct)>
	//   15   27:return          
	}

	private zzbcj(zzbct zzbct1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		zzdvv = (zzbct)zzbbq.zza(((Object) (zzbct1)), "messageInfoFactory");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #42  <String "messageInfoFactory">
	//    5    8:invokestatic    #48  <Method Object zzbbq.zza(Object, String)>
	//    6   11:checkcast       #23  <Class zzbct>
	//    7   14:putfield        #50  <Field zzbct zzdvv>
	//    8   17:return          
	}

	private static boolean zza(zzbcs zzbcs1)
	{
		return zzbcs1.zzaeh() == zzbbo.zze.zzdui;
	//    0    0:aload_0         
	//    1    1:invokeinterface #57  <Method int zzbcs.zzaeh()>
	//    2    6:getstatic       #63  <Field int zzbbo$zze.zzdui>
	//    3    9:icmpne          14
	//    4   12:iconst_1        
	//    5   13:ireturn         
	//    6   14:iconst_0        
	//    7   15:ireturn         
	}

	private static zzbct zzaea()
	{
		Exception exception;
		zzbct zzbct1;
		try
		{
			zzbct1 = (zzbct)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(((Object) (null)), new Object[0]);
	//    0    0:ldc1            #67  <String "com.google.protobuf.DescriptorMessageInfoFactory">
	//    1    2:invokestatic    #73  <Method Class Class.forName(String)>
	//    2    5:ldc1            #75  <String "getInstance">
	//    3    7:iconst_0        
	//    4    8:anewarray       Class[]
	//    5   11:invokevirtual   #79  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    6   14:aconst_null     
	//    7   15:iconst_0        
	//    8   16:anewarray       Object[]
	//    9   19:invokevirtual   #85  <Method Object Method.invoke(Object, Object[])>
	//   10   22:checkcast       #23  <Class zzbct>
	//   11   25:astore_0        
		}
	//*  12   26:aload_0         
	//*  13   27:areturn         
	//*  14   28:getstatic       #18  <Field zzbct zzdvw>
	//*  15   31:areturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			return zzdvw;
		}
		return zzbct1;
	//*  16   32:astore_0        
	//*  17   33:goto            28
	}

	public final zzbdm zzd(Class class1)
	{
		zzbdo.zzf(class1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #93  <Method void zzbdo.zzf(Class)>
		zzbcs zzbcs1 = zzdvv.zzb(class1);
	//    2    4:aload_0         
	//    3    5:getfield        #50  <Field zzbct zzdvv>
	//    4    8:aload_1         
	//    5    9:invokeinterface #97  <Method zzbcs zzbct.zzb(Class)>
	//    6   14:astore_2        
		if(zzbcs1.zzaei())
	//*   7   15:aload_2         
	//*   8   16:invokeinterface #101 <Method boolean zzbcs.zzaei()>
	//*   9   21:ifeq            65
			if(((Class) (com/google/android/gms/internal/ads/zzbbo)).isAssignableFrom(class1))
	//*  10   24:ldc1            #103 <Class zzbbo>
	//*  11   26:aload_1         
	//*  12   27:invokevirtual   #107 <Method boolean Class.isAssignableFrom(Class)>
	//*  13   30:ifeq            49
				return ((zzbdm) (zzbda.zza(zzbdo.zzafp(), zzbbf.zzact(), zzbcs1.zzaej())));
	//   14   33:invokestatic    #111 <Method zzbee zzbdo.zzafp()>
	//   15   36:invokestatic    #117 <Method zzbbd zzbbf.zzact()>
	//   16   39:aload_2         
	//   17   40:invokeinterface #121 <Method zzbcu zzbcs.zzaej()>
	//   18   45:invokestatic    #126 <Method zzbda zzbda.zza(zzbee, zzbbd, zzbcu)>
	//   19   48:areturn         
			else
				return ((zzbdm) (zzbda.zza(zzbdo.zzafn(), zzbbf.zzacu(), zzbcs1.zzaej())));
	//   20   49:invokestatic    #129 <Method zzbee zzbdo.zzafn()>
	//   21   52:invokestatic    #132 <Method zzbbd zzbbf.zzacu()>
	//   22   55:aload_2         
	//   23   56:invokeinterface #121 <Method zzbcu zzbcs.zzaej()>
	//   24   61:invokestatic    #126 <Method zzbda zzbda.zza(zzbee, zzbbd, zzbcu)>
	//   25   64:areturn         
		if(((Class) (com/google/android/gms/internal/ads/zzbbo)).isAssignableFrom(class1))
	//*  26   65:ldc1            #103 <Class zzbbo>
	//*  27   67:aload_1         
	//*  28   68:invokevirtual   #107 <Method boolean Class.isAssignableFrom(Class)>
	//*  29   71:ifeq            121
			if(zza(zzbcs1))
	//*  30   74:aload_2         
	//*  31   75:invokestatic    #134 <Method boolean zza(zzbcs)>
	//*  32   78:ifeq            102
				return ((zzbdm) (zzbcy.zza(class1, zzbcs1, zzbde.zzaem(), zzbce.zzadz(), zzbdo.zzafp(), zzbbf.zzact(), zzbcr.zzaef())));
	//   33   81:aload_1         
	//   34   82:aload_2         
	//   35   83:invokestatic    #140 <Method zzbdc zzbde.zzaem()>
	//   36   86:invokestatic    #146 <Method zzbce zzbce.zzadz()>
	//   37   89:invokestatic    #111 <Method zzbee zzbdo.zzafp()>
	//   38   92:invokestatic    #117 <Method zzbbd zzbbf.zzact()>
	//   39   95:invokestatic    #152 <Method zzbcp zzbcr.zzaef()>
	//   40   98:invokestatic    #157 <Method zzbcy zzbcy.zza(Class, zzbcs, zzbdc, zzbce, zzbee, zzbbd, zzbcp)>
	//   41  101:areturn         
			else
				return ((zzbdm) (zzbcy.zza(class1, zzbcs1, zzbde.zzaem(), zzbce.zzadz(), zzbdo.zzafp(), ((zzbbd) (null)), zzbcr.zzaef())));
	//   42  102:aload_1         
	//   43  103:aload_2         
	//   44  104:invokestatic    #140 <Method zzbdc zzbde.zzaem()>
	//   45  107:invokestatic    #146 <Method zzbce zzbce.zzadz()>
	//   46  110:invokestatic    #111 <Method zzbee zzbdo.zzafp()>
	//   47  113:aconst_null     
	//   48  114:invokestatic    #152 <Method zzbcp zzbcr.zzaef()>
	//   49  117:invokestatic    #157 <Method zzbcy zzbcy.zza(Class, zzbcs, zzbdc, zzbce, zzbee, zzbbd, zzbcp)>
	//   50  120:areturn         
		if(zza(zzbcs1))
	//*  51  121:aload_2         
	//*  52  122:invokestatic    #134 <Method boolean zza(zzbcs)>
	//*  53  125:ifeq            149
			return ((zzbdm) (zzbcy.zza(class1, zzbcs1, zzbde.zzael(), zzbce.zzady(), zzbdo.zzafn(), zzbbf.zzacu(), zzbcr.zzaee())));
	//   54  128:aload_1         
	//   55  129:aload_2         
	//   56  130:invokestatic    #160 <Method zzbdc zzbde.zzael()>
	//   57  133:invokestatic    #163 <Method zzbce zzbce.zzady()>
	//   58  136:invokestatic    #129 <Method zzbee zzbdo.zzafn()>
	//   59  139:invokestatic    #132 <Method zzbbd zzbbf.zzacu()>
	//   60  142:invokestatic    #166 <Method zzbcp zzbcr.zzaee()>
	//   61  145:invokestatic    #157 <Method zzbcy zzbcy.zza(Class, zzbcs, zzbdc, zzbce, zzbee, zzbbd, zzbcp)>
	//   62  148:areturn         
		else
			return ((zzbdm) (zzbcy.zza(class1, zzbcs1, zzbde.zzael(), zzbce.zzady(), zzbdo.zzafo(), ((zzbbd) (null)), zzbcr.zzaee())));
	//   63  149:aload_1         
	//   64  150:aload_2         
	//   65  151:invokestatic    #160 <Method zzbdc zzbde.zzael()>
	//   66  154:invokestatic    #163 <Method zzbce zzbce.zzady()>
	//   67  157:invokestatic    #169 <Method zzbee zzbdo.zzafo()>
	//   68  160:aconst_null     
	//   69  161:invokestatic    #166 <Method zzbcp zzbcr.zzaee()>
	//   70  164:invokestatic    #157 <Method zzbcy zzbcy.zza(Class, zzbcs, zzbdc, zzbce, zzbee, zzbbd, zzbcp)>
	//   71  167:areturn         
	}

	private static final zzbct zzdvw = new zzbck();
	private final zzbct zzdvv;

	static 
	{
	//    0    0:new             #13  <Class zzbck>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void zzbck()>
	//    3    7:putstatic       #18  <Field zzbct zzdvw>
	//*   4   10:return          
	}
}
