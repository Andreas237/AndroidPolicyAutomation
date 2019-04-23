// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;


// Referenced classes of package com.google.android.gms.internal.vision:
//			zzfy, zzhh, zzcz, zzda, 
//			zzdv, zzdy, zzhq

public static final class zzcz$zza extends zzfy
	implements zzhh
{
	public static final class zza extends zzfy.zza
		implements zzhh
	{

		private zza()
		{
			super(((zzfy) (zzcz.zza.zzbr())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #18  <Method zzcz$zza zzcz$zza.zzbr()>
		//    2    4:invokespecial   #21  <Method void zzfy$zza(zzfy)>
		//    3    7:return          
		}

		zza(zzda zzda1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void zzcz$zza$zza()>
		//    2    4:return          
		}
	}


	static zzcz$zza zzbr()
	{
		return zzma;
	//    0    0:getstatic       #30  <Field zzcz$zza zzma>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzda.zzbc[i - 1];
	//    0    0:getstatic       #52  <Field int[] zzda.zzbc>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 175
	//	               2 166
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 175
	//	               2 166
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #54  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #55  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #61  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbf));
	//   15   63:getstatic       #63  <Field zzhq zzbf>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/vision/zzcz$zza;
	//   19   71:ldc1            #2   <Class zzcz$zza>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbf));
	//   21   74:getstatic       #63  <Field zzhq zzbf>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzfy$zzb(((zzfy) (zzma)))));
	//   27   84:new             #65  <Class zzfy$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #30  <Field zzcz$zza zzma>
	//   30   91:invokespecial   #68  <Method void zzfy$zzb(zzfy)>
	//   31   94:astore_2        
		zzbf = ((zzhq) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #63  <Field zzhq zzbf>
_L12:
		com/google/android/gms/internal/vision/zzcz$zza;
	//   34   99:ldc1            #2   <Class zzcz$zza>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/vision/zzcz$zza;
	//   39  105:ldc1            #2   <Class zzcz$zza>
		JVM INSTR monitorexit ;
	//   40  107:monitorexit     
		throw obj;
	//   41  108:aload_2         
	//   42  109:athrow          
_L10:
		return obj;
	//   43  110:aload_2         
	//   44  111:areturn         
_L5:
		return ((Object) (zzma));
	//   45  112:getstatic       #30  <Field zzcz$zza zzma>
	//   46  115:areturn         
_L4:
		obj = ((Object) (zzdv.zzah()));
	//   47  116:invokestatic    #74  <Method zzgd zzdv.zzah()>
	//   48  119:astore_2        
		obj1 = ((Object) (zzdy.zzah()));
	//   49  120:invokestatic    #77  <Method zzgd zzdy.zzah()>
	//   50  123:astore_3        
		return zza(((zzhf) (zzma)), "\001\003\000\001\001\003\003\000\000\000\001\f\000\002\f\001\003\b\002", new Object[] {
			"zzbg", "zzlx", obj, "zzly", obj1, "zzlz"
		});
	//   51  124:getstatic       #30  <Field zzcz$zza zzma>
	//   52  127:ldc1            #79  <String "\001\003\000\001\001\003\003\000\000\000\001\f\000\002\f\001\003\b\002">
	//   53  129:bipush          6
	//   54  131:anewarray       Object[]
	//   55  134:dup             
	//   56  135:iconst_0        
	//   57  136:ldc1            #82  <String "zzbg">
	//   58  138:aastore         
	//   59  139:dup             
	//   60  140:iconst_1        
	//   61  141:ldc1            #83  <String "zzlx">
	//   62  143:aastore         
	//   63  144:dup             
	//   64  145:iconst_2        
	//   65  146:aload_2         
	//   66  147:aastore         
	//   67  148:dup             
	//   68  149:iconst_3        
	//   69  150:ldc1            #84  <String "zzly">
	//   70  152:aastore         
	//   71  153:dup             
	//   72  154:iconst_4        
	//   73  155:aload_3         
	//   74  156:aastore         
	//   75  157:dup             
	//   76  158:iconst_5        
	//   77  159:ldc1            #85  <String "zzlz">
	//   78  161:aastore         
	//   79  162:invokestatic    #88  <Method Object zza(zzhf, String, Object[])>
	//   80  165:areturn         
_L3:
		return ((Object) (new zza(((zzda) (null)))));
	//   81  166:new             #12  <Class zzcz$zza$zza>
	//   82  169:dup             
	//   83  170:aconst_null     
	//   84  171:invokespecial   #91  <Method void zzcz$zza$zza(zzda)>
	//   85  174:areturn         
_L2:
		return ((Object) (new zzcz$zza()));
	//   86  175:new             #2   <Class zzcz$zza>
	//   87  178:dup             
	//   88  179:invokespecial   #28  <Method void zzcz$zza()>
	//   89  182:areturn         
	}

	private static volatile zzhq zzbf;
	private static final zzcz$zza zzma;
	private int zzbg;
	private int zzlx;
	private int zzly;
	private String zzlz;

	static 
	{
		zzma = new zzcz$zza();
	//    0    0:new             #2   <Class zzcz$zza>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void zzcz$zza()>
	//    3    7:putstatic       #30  <Field zzcz$zza zzma>
		zzfy.zza(com/google/android/gms/internal/vision/zzcz$zza, ((zzfy) (zzma)));
	//    4   10:ldc1            #2   <Class zzcz$zza>
	//    5   12:getstatic       #30  <Field zzcz$zza zzma>
	//    6   15:invokestatic    #33  <Method void zzfy.zza(Class, zzfy)>
	//*   7   18:return          
	}

	private zzcz$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void zzfy()>
		zzlx = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #37  <Field int zzlx>
		zzly = 1;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #39  <Field int zzly>
		zzlz = "";
	//    8   14:aload_0         
	//    9   15:ldc1            #41  <String "">
	//   10   17:putfield        #43  <Field String zzlz>
	//   11   20:return          
	}
}
