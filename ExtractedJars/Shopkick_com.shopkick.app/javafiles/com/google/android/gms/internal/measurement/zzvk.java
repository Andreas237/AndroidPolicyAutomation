// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzwm, zzvl, zzvm, zzvu, 
//			zzun, zzuq, zzvt, zzwn, 
//			zzuo, zzue, zzwa, zzwe, 
//			zzvf, zzvs, zzvz, zzwl

final class zzvk
	implements zzwm
{

	public zzvk()
	{
		this(((zzvu) (new zzvm(new zzvu[] {
			zzun.zzwe(), zzxf()
		}))));
	//    0    0:aload_0         
	//    1    1:new             #21  <Class zzvm>
	//    2    4:dup             
	//    3    5:iconst_2        
	//    4    6:anewarray       zzvu[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:invokestatic    #29  <Method zzun zzun.zzwe()>
	//    8   14:aastore         
	//    9   15:dup             
	//   10   16:iconst_1        
	//   11   17:invokestatic    #33  <Method zzvu zzxf()>
	//   12   20:aastore         
	//   13   21:invokespecial   #36  <Method void zzvm(zzvu[])>
	//   14   24:invokespecial   #39  <Method void zzvk(zzvu)>
	//   15   27:return          
	}

	private zzvk(zzvu zzvu1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		zzcaf = (zzvu)zzuq.zza(((Object) (zzvu1)), "messageInfoFactory");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #42  <String "messageInfoFactory">
	//    5    8:invokestatic    #48  <Method Object zzuq.zza(Object, String)>
	//    6   11:checkcast       #23  <Class zzvu>
	//    7   14:putfield        #50  <Field zzvu zzcaf>
	//    8   17:return          
	}

	private static boolean zza(zzvt zzvt1)
	{
		return zzvt1.zzxm() == zzuo.zze.zzbys;
	//    0    0:aload_0         
	//    1    1:invokeinterface #57  <Method int zzvt.zzxm()>
	//    2    6:getstatic       #63  <Field int zzuo$zze.zzbys>
	//    3    9:icmpne          14
	//    4   12:iconst_1        
	//    5   13:ireturn         
	//    6   14:iconst_0        
	//    7   15:ireturn         
	}

	private static zzvu zzxf()
	{
		Exception exception;
		zzvu zzvu1;
		try
		{
			zzvu1 = (zzvu)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(((Object) (null)), new Object[0]);
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
	//   10   22:checkcast       #23  <Class zzvu>
	//   11   25:astore_0        
		}
	//*  12   26:aload_0         
	//*  13   27:areturn         
	//*  14   28:getstatic       #18  <Field zzvu zzcag>
	//*  15   31:areturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			return zzcag;
		}
		return zzvu1;
	//*  16   32:astore_0        
	//*  17   33:goto            28
	}

	public final zzwl zzh(Class class1)
	{
		zzwn.zzj(class1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #93  <Method void zzwn.zzj(Class)>
		zzvt zzvt1 = zzcaf.zzf(class1);
	//    2    4:aload_0         
	//    3    5:getfield        #50  <Field zzvu zzcaf>
	//    4    8:aload_1         
	//    5    9:invokeinterface #97  <Method zzvt zzvu.zzf(Class)>
	//    6   14:astore_2        
		if(zzvt1.zzxn())
	//*   7   15:aload_2         
	//*   8   16:invokeinterface #101 <Method boolean zzvt.zzxn()>
	//*   9   21:ifeq            65
			if(((Class) (com/google/android/gms/internal/measurement/zzuo)).isAssignableFrom(class1))
	//*  10   24:ldc1            #103 <Class zzuo>
	//*  11   26:aload_1         
	//*  12   27:invokevirtual   #107 <Method boolean Class.isAssignableFrom(Class)>
	//*  13   30:ifeq            49
				return ((zzwl) (zzwa.zza(zzwn.zzxz(), zzue.zzvu(), zzvt1.zzxo())));
	//   14   33:invokestatic    #111 <Method zzxd zzwn.zzxz()>
	//   15   36:invokestatic    #117 <Method zzuc zzue.zzvu()>
	//   16   39:aload_2         
	//   17   40:invokeinterface #121 <Method zzvv zzvt.zzxo()>
	//   18   45:invokestatic    #126 <Method zzwa zzwa.zza(zzxd, zzuc, zzvv)>
	//   19   48:areturn         
			else
				return ((zzwl) (zzwa.zza(zzwn.zzxx(), zzue.zzvv(), zzvt1.zzxo())));
	//   20   49:invokestatic    #129 <Method zzxd zzwn.zzxx()>
	//   21   52:invokestatic    #132 <Method zzuc zzue.zzvv()>
	//   22   55:aload_2         
	//   23   56:invokeinterface #121 <Method zzvv zzvt.zzxo()>
	//   24   61:invokestatic    #126 <Method zzwa zzwa.zza(zzxd, zzuc, zzvv)>
	//   25   64:areturn         
		if(((Class) (com/google/android/gms/internal/measurement/zzuo)).isAssignableFrom(class1))
	//*  26   65:ldc1            #103 <Class zzuo>
	//*  27   67:aload_1         
	//*  28   68:invokevirtual   #107 <Method boolean Class.isAssignableFrom(Class)>
	//*  29   71:ifeq            121
			if(zza(zzvt1))
	//*  30   74:aload_2         
	//*  31   75:invokestatic    #134 <Method boolean zza(zzvt)>
	//*  32   78:ifeq            102
				return ((zzwl) (zzvz.zza(class1, zzvt1, zzwe.zzxr(), zzvf.zzxe(), zzwn.zzxz(), zzue.zzvu(), zzvs.zzxk())));
	//   33   81:aload_1         
	//   34   82:aload_2         
	//   35   83:invokestatic    #140 <Method zzwc zzwe.zzxr()>
	//   36   86:invokestatic    #146 <Method zzvf zzvf.zzxe()>
	//   37   89:invokestatic    #111 <Method zzxd zzwn.zzxz()>
	//   38   92:invokestatic    #117 <Method zzuc zzue.zzvu()>
	//   39   95:invokestatic    #152 <Method zzvq zzvs.zzxk()>
	//   40   98:invokestatic    #157 <Method zzvz zzvz.zza(Class, zzvt, zzwc, zzvf, zzxd, zzuc, zzvq)>
	//   41  101:areturn         
			else
				return ((zzwl) (zzvz.zza(class1, zzvt1, zzwe.zzxr(), zzvf.zzxe(), zzwn.zzxz(), ((zzuc) (null)), zzvs.zzxk())));
	//   42  102:aload_1         
	//   43  103:aload_2         
	//   44  104:invokestatic    #140 <Method zzwc zzwe.zzxr()>
	//   45  107:invokestatic    #146 <Method zzvf zzvf.zzxe()>
	//   46  110:invokestatic    #111 <Method zzxd zzwn.zzxz()>
	//   47  113:aconst_null     
	//   48  114:invokestatic    #152 <Method zzvq zzvs.zzxk()>
	//   49  117:invokestatic    #157 <Method zzvz zzvz.zza(Class, zzvt, zzwc, zzvf, zzxd, zzuc, zzvq)>
	//   50  120:areturn         
		if(zza(zzvt1))
	//*  51  121:aload_2         
	//*  52  122:invokestatic    #134 <Method boolean zza(zzvt)>
	//*  53  125:ifeq            149
			return ((zzwl) (zzvz.zza(class1, zzvt1, zzwe.zzxq(), zzvf.zzxd(), zzwn.zzxx(), zzue.zzvv(), zzvs.zzxj())));
	//   54  128:aload_1         
	//   55  129:aload_2         
	//   56  130:invokestatic    #160 <Method zzwc zzwe.zzxq()>
	//   57  133:invokestatic    #163 <Method zzvf zzvf.zzxd()>
	//   58  136:invokestatic    #129 <Method zzxd zzwn.zzxx()>
	//   59  139:invokestatic    #132 <Method zzuc zzue.zzvv()>
	//   60  142:invokestatic    #166 <Method zzvq zzvs.zzxj()>
	//   61  145:invokestatic    #157 <Method zzvz zzvz.zza(Class, zzvt, zzwc, zzvf, zzxd, zzuc, zzvq)>
	//   62  148:areturn         
		else
			return ((zzwl) (zzvz.zza(class1, zzvt1, zzwe.zzxq(), zzvf.zzxd(), zzwn.zzxy(), ((zzuc) (null)), zzvs.zzxj())));
	//   63  149:aload_1         
	//   64  150:aload_2         
	//   65  151:invokestatic    #160 <Method zzwc zzwe.zzxq()>
	//   66  154:invokestatic    #163 <Method zzvf zzvf.zzxd()>
	//   67  157:invokestatic    #169 <Method zzxd zzwn.zzxy()>
	//   68  160:aconst_null     
	//   69  161:invokestatic    #166 <Method zzvq zzvs.zzxj()>
	//   70  164:invokestatic    #157 <Method zzvz zzvz.zza(Class, zzvt, zzwc, zzvf, zzxd, zzuc, zzvq)>
	//   71  167:areturn         
	}

	private static final zzvu zzcag = new zzvl();
	private final zzvu zzcaf;

	static 
	{
	//    0    0:new             #13  <Class zzvl>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void zzvl()>
	//    3    7:putstatic       #18  <Field zzvu zzcag>
	//*   4   10:return          
	}
}
