// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzhx, zzgv, zzgw, zzhe, 
//			zzfx, zzga, zzhd, zzhy, 
//			zzfy, zzfo, zzhl, zzhp, 
//			zzgp, zzhc, zzhj, zzhw

final class zzgu
	implements zzhx
{

	public zzgu()
	{
		this(((zzhe) (new zzgw(new zzhe[] {
			com.google.android.gms.internal.vision.zzfx.zzex(), zzfx()
		}))));
	//    0    0:aload_0         
	//    1    1:new             #21  <Class zzgw>
	//    2    4:dup             
	//    3    5:iconst_2        
	//    4    6:anewarray       zzhe[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:invokestatic    #29  <Method zzfx zzfx.zzex()>
	//    8   14:aastore         
	//    9   15:dup             
	//   10   16:iconst_1        
	//   11   17:invokestatic    #33  <Method zzhe zzfx()>
	//   12   20:aastore         
	//   13   21:invokespecial   #36  <Method void zzgw(zzhe[])>
	//   14   24:invokespecial   #39  <Method void zzgu(zzhe)>
	//   15   27:return          
	}

	private zzgu(zzhe zzhe1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		zzys = (zzhe)zzga.zza(((Object) (zzhe1)), "messageInfoFactory");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #42  <String "messageInfoFactory">
	//    5    8:invokestatic    #48  <Method Object zzga.zza(Object, String)>
	//    6   11:checkcast       #23  <Class zzhe>
	//    7   14:putfield        #50  <Field zzhe zzys>
	//    8   17:return          
	}

	private static boolean zza(zzhd zzhd1)
	{
		return zzhd1.zzge() == zzfy.zzg.zzxf;
	//    0    0:aload_0         
	//    1    1:invokeinterface #57  <Method int zzhd.zzge()>
	//    2    6:getstatic       #63  <Field int zzfy$zzg.zzxf>
	//    3    9:icmpne          14
	//    4   12:iconst_1        
	//    5   13:ireturn         
	//    6   14:iconst_0        
	//    7   15:ireturn         
	}

	private static zzhe zzfx()
	{
		Exception exception;
		zzhe zzhe1;
		try
		{
			zzhe1 = (zzhe)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(((Object) (null)), new Object[0]);
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
	//   10   22:checkcast       #23  <Class zzhe>
	//   11   25:astore_0        
		}
	//*  12   26:aload_0         
	//*  13   27:areturn         
	//*  14   28:getstatic       #18  <Field zzhe zzyt>
	//*  15   31:areturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			return zzyt;
		}
		return zzhe1;
	//*  16   32:astore_0        
	//*  17   33:goto            28
	}

	public final zzhw zze(Class class1)
	{
		zzhy.zzg(class1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #93  <Method void zzhy.zzg(Class)>
		zzhd zzhd1 = zzys.zzc(class1);
	//    2    4:aload_0         
	//    3    5:getfield        #50  <Field zzhe zzys>
	//    4    8:aload_1         
	//    5    9:invokeinterface #97  <Method zzhd zzhe.zzc(Class)>
	//    6   14:astore_2        
		if(zzhd1.zzgf())
	//*   7   15:aload_2         
	//*   8   16:invokeinterface #101 <Method boolean zzhd.zzgf()>
	//*   9   21:ifeq            65
			if(((Class) (com/google/android/gms/internal/vision/zzfy)).isAssignableFrom(class1))
	//*  10   24:ldc1            #103 <Class zzfy>
	//*  11   26:aload_1         
	//*  12   27:invokevirtual   #107 <Method boolean Class.isAssignableFrom(Class)>
	//*  13   30:ifeq            49
				return ((zzhw) (zzhl.zza(zzhy.zzgr(), zzfo.zzen(), zzhd1.zzgg())));
	//   14   33:invokestatic    #111 <Method zzio zzhy.zzgr()>
	//   15   36:invokestatic    #117 <Method zzfl zzfo.zzen()>
	//   16   39:aload_2         
	//   17   40:invokeinterface #121 <Method zzhf zzhd.zzgg()>
	//   18   45:invokestatic    #126 <Method zzhl zzhl.zza(zzio, zzfl, zzhf)>
	//   19   48:areturn         
			else
				return ((zzhw) (zzhl.zza(zzhy.zzgp(), zzfo.zzeo(), zzhd1.zzgg())));
	//   20   49:invokestatic    #129 <Method zzio zzhy.zzgp()>
	//   21   52:invokestatic    #132 <Method zzfl zzfo.zzeo()>
	//   22   55:aload_2         
	//   23   56:invokeinterface #121 <Method zzhf zzhd.zzgg()>
	//   24   61:invokestatic    #126 <Method zzhl zzhl.zza(zzio, zzfl, zzhf)>
	//   25   64:areturn         
		if(((Class) (com/google/android/gms/internal/vision/zzfy)).isAssignableFrom(class1))
	//*  26   65:ldc1            #103 <Class zzfy>
	//*  27   67:aload_1         
	//*  28   68:invokevirtual   #107 <Method boolean Class.isAssignableFrom(Class)>
	//*  29   71:ifeq            121
			if(zza(zzhd1))
	//*  30   74:aload_2         
	//*  31   75:invokestatic    #134 <Method boolean zza(zzhd)>
	//*  32   78:ifeq            102
				return ((zzhw) (zzhj.zza(class1, zzhd1, zzhp.zzgj(), zzgp.zzfw(), zzhy.zzgr(), zzfo.zzen(), zzhc.zzgc())));
	//   33   81:aload_1         
	//   34   82:aload_2         
	//   35   83:invokestatic    #140 <Method zzhn zzhp.zzgj()>
	//   36   86:invokestatic    #146 <Method zzgp zzgp.zzfw()>
	//   37   89:invokestatic    #111 <Method zzio zzhy.zzgr()>
	//   38   92:invokestatic    #117 <Method zzfl zzfo.zzen()>
	//   39   95:invokestatic    #152 <Method zzha zzhc.zzgc()>
	//   40   98:invokestatic    #157 <Method zzhj zzhj.zza(Class, zzhd, zzhn, zzgp, zzio, zzfl, zzha)>
	//   41  101:areturn         
			else
				return ((zzhw) (zzhj.zza(class1, zzhd1, zzhp.zzgj(), zzgp.zzfw(), zzhy.zzgr(), ((zzfl) (null)), zzhc.zzgc())));
	//   42  102:aload_1         
	//   43  103:aload_2         
	//   44  104:invokestatic    #140 <Method zzhn zzhp.zzgj()>
	//   45  107:invokestatic    #146 <Method zzgp zzgp.zzfw()>
	//   46  110:invokestatic    #111 <Method zzio zzhy.zzgr()>
	//   47  113:aconst_null     
	//   48  114:invokestatic    #152 <Method zzha zzhc.zzgc()>
	//   49  117:invokestatic    #157 <Method zzhj zzhj.zza(Class, zzhd, zzhn, zzgp, zzio, zzfl, zzha)>
	//   50  120:areturn         
		if(zza(zzhd1))
	//*  51  121:aload_2         
	//*  52  122:invokestatic    #134 <Method boolean zza(zzhd)>
	//*  53  125:ifeq            149
			return ((zzhw) (zzhj.zza(class1, zzhd1, zzhp.zzgi(), zzgp.zzfv(), zzhy.zzgp(), zzfo.zzeo(), zzhc.zzgb())));
	//   54  128:aload_1         
	//   55  129:aload_2         
	//   56  130:invokestatic    #160 <Method zzhn zzhp.zzgi()>
	//   57  133:invokestatic    #163 <Method zzgp zzgp.zzfv()>
	//   58  136:invokestatic    #129 <Method zzio zzhy.zzgp()>
	//   59  139:invokestatic    #132 <Method zzfl zzfo.zzeo()>
	//   60  142:invokestatic    #166 <Method zzha zzhc.zzgb()>
	//   61  145:invokestatic    #157 <Method zzhj zzhj.zza(Class, zzhd, zzhn, zzgp, zzio, zzfl, zzha)>
	//   62  148:areturn         
		else
			return ((zzhw) (zzhj.zza(class1, zzhd1, zzhp.zzgi(), zzgp.zzfv(), zzhy.zzgq(), ((zzfl) (null)), zzhc.zzgb())));
	//   63  149:aload_1         
	//   64  150:aload_2         
	//   65  151:invokestatic    #160 <Method zzhn zzhp.zzgi()>
	//   66  154:invokestatic    #163 <Method zzgp zzgp.zzfv()>
	//   67  157:invokestatic    #169 <Method zzio zzhy.zzgq()>
	//   68  160:aconst_null     
	//   69  161:invokestatic    #166 <Method zzha zzhc.zzgb()>
	//   70  164:invokestatic    #157 <Method zzhj zzhj.zza(Class, zzhd, zzhn, zzgp, zzio, zzfl, zzha)>
	//   71  167:areturn         
	}

	private static final zzhe zzyt = new zzgv();
	private final zzhe zzys;

	static 
	{
	//    0    0:new             #13  <Class zzgv>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void zzgv()>
	//    3    7:putstatic       #18  <Field zzhe zzyt>
	//*   4   10:return          
	}
}
