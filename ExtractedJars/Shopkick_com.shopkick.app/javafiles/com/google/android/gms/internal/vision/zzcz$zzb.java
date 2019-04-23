// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;


// Referenced classes of package com.google.android.gms.internal.vision:
//			zzfy, zzhh, zzcz, zzda, 
//			zzhq, zzge

public static final class zzcz$zzb extends zzfy
	implements zzhh
{
	public static final class zza extends zzfy.zza
		implements zzhh
	{

		private zza()
		{
			super(((zzfy) (zzcz.zzb.zzbs())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #19  <Method zzcz$zzb zzcz$zzb.zzbs()>
		//    2    4:invokespecial   #22  <Method void zzfy$zza(zzfy)>
		//    3    7:return          
		}

		zza(zzda zzda1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void zzcz$zzb$zza()>
		//    2    4:return          
		}
	}


	static zzcz$zzb zzbs()
	{
		return zzmc;
	//    0    0:getstatic       #28  <Field zzcz$zzb zzmc>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzda.zzbc[i - 1];
	//    0    0:getstatic       #48  <Field int[] zzda.zzbc>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 148
	//	               2 139
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 148
	//	               2 139
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #50  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #51  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #57  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbf));
	//   15   63:getstatic       #59  <Field zzhq zzbf>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/vision/zzcz$zzb;
	//   19   71:ldc1            #2   <Class zzcz$zzb>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbf));
	//   21   74:getstatic       #59  <Field zzhq zzbf>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzfy$zzb(((zzfy) (zzmc)))));
	//   27   84:new             #61  <Class zzfy$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #28  <Field zzcz$zzb zzmc>
	//   30   91:invokespecial   #64  <Method void zzfy$zzb(zzfy)>
	//   31   94:astore_2        
		zzbf = ((zzhq) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #59  <Field zzhq zzbf>
_L12:
		com/google/android/gms/internal/vision/zzcz$zzb;
	//   34   99:ldc1            #2   <Class zzcz$zzb>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/vision/zzcz$zzb;
	//   39  105:ldc1            #2   <Class zzcz$zzb>
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
		return ((Object) (zzmc));
	//   45  112:getstatic       #28  <Field zzcz$zzb zzmc>
	//   46  115:areturn         
_L4:
		return zza(((zzhf) (zzmc)), "\001\001\000\000\001\001\001\000\001\000\001\033", new Object[] {
			"zzmb", com/google/android/gms/internal/vision/zzcz$zzh
		});
	//   47  116:getstatic       #28  <Field zzcz$zzb zzmc>
	//   48  119:ldc1            #66  <String "\001\001\000\000\001\001\001\000\001\000\001\033">
	//   49  121:iconst_2        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #69  <String "zzmb">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #71  <Class zzcz$zzh>
	//   58  134:aastore         
	//   59  135:invokestatic    #74  <Method Object zza(zzhf, String, Object[])>
	//   60  138:areturn         
_L3:
		return ((Object) (new zza(((zzda) (null)))));
	//   61  139:new             #12  <Class zzcz$zzb$zza>
	//   62  142:dup             
	//   63  143:aconst_null     
	//   64  144:invokespecial   #77  <Method void zzcz$zzb$zza(zzda)>
	//   65  147:areturn         
_L2:
		return ((Object) (new zzcz$zzb()));
	//   66  148:new             #2   <Class zzcz$zzb>
	//   67  151:dup             
	//   68  152:invokespecial   #26  <Method void zzcz$zzb()>
	//   69  155:areturn         
	}

	private static volatile zzhq zzbf;
	private static final zzcz$zzb zzmc;
	private zzge zzmb;

	static 
	{
		zzmc = new zzcz$zzb();
	//    0    0:new             #2   <Class zzcz$zzb>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void zzcz$zzb()>
	//    3    7:putstatic       #28  <Field zzcz$zzb zzmc>
		zzfy.zza(com/google/android/gms/internal/vision/zzcz$zzb, ((zzfy) (zzmc)));
	//    4   10:ldc1            #2   <Class zzcz$zzb>
	//    5   12:getstatic       #28  <Field zzcz$zzb zzmc>
	//    6   15:invokestatic    #31  <Method void zzfy.zza(Class, zzfy)>
	//*   7   18:return          
	}

	private zzcz$zzb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void zzfy()>
		zzmb = zzey();
	//    2    4:aload_0         
	//    3    5:invokestatic    #37  <Method zzge zzey()>
	//    4    8:putfield        #39  <Field zzge zzmb>
	//    5   11:return          
	}
}
