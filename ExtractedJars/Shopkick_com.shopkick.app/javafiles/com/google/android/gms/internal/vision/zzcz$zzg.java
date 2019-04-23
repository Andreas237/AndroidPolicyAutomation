// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;


// Referenced classes of package com.google.android.gms.internal.vision:
//			zzfy, zzhh, zzcz, zzhq, 
//			zzda

public static final class zzcz$zzg extends zzfy
	implements zzhh
{
	public static final class zza extends zzfy.zza
		implements zzhh
	{

		private zza()
		{
			super(((zzfy) (zzcz.zzg.zzby())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #19  <Method zzcz$zzg zzcz$zzg.zzby()>
		//    2    4:invokespecial   #22  <Method void zzfy$zza(zzfy)>
		//    3    7:return          
		}

		zza(zzda zzda1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void zzcz$zzg$zza()>
		//    2    4:return          
		}
	}


	public static zzhq zzbx()
	{
		return (zzhq)((zzfy) (zznu)).zza(zzfy$zzg.zzxd, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #30  <Field zzcz$zzg zznu>
	//    1    3:getstatic       #42  <Field int zzfy$zzg.zzxd>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #45  <Method Object zzfy.zza(int, Object, Object)>
	//    5   11:checkcast       #47  <Class zzhq>
	//    6   14:areturn         
	}

	static zzcz$zzg zzby()
	{
		return zznu;
	//    0    0:getstatic       #30  <Field zzcz$zzg zznu>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzda.zzbc[i - 1];
	//    0    0:getstatic       #57  <Field int[] zzda.zzbc>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 153
	//	               2 144
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 153
	//	               2 144
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #59  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #60  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #66  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbf));
	//   15   63:getstatic       #68  <Field zzhq zzbf>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/vision/zzcz$zzg;
	//   19   71:ldc1            #2   <Class zzcz$zzg>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbf));
	//   21   74:getstatic       #68  <Field zzhq zzbf>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzfy$zzb(((zzfy) (zznu)))));
	//   27   84:new             #70  <Class zzfy$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #30  <Field zzcz$zzg zznu>
	//   30   91:invokespecial   #73  <Method void zzfy$zzb(zzfy)>
	//   31   94:astore_2        
		zzbf = ((zzhq) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #68  <Field zzhq zzbf>
_L12:
		com/google/android/gms/internal/vision/zzcz$zzg;
	//   34   99:ldc1            #2   <Class zzcz$zzg>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/vision/zzcz$zzg;
	//   39  105:ldc1            #2   <Class zzcz$zzg>
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
		return ((Object) (zznu));
	//   45  112:getstatic       #30  <Field zzcz$zzg zznu>
	//   46  115:areturn         
_L4:
		return zza(((zzhf) (zznu)), "\001\002\000\001\001\002\002\000\000\000\001\002\000\002\002\001", new Object[] {
			"zzbg", "zzmv", "zzmw"
		});
	//   47  116:getstatic       #30  <Field zzcz$zzg zznu>
	//   48  119:ldc1            #75  <String "\001\002\000\001\001\002\002\000\000\000\001\002\000\002\002\001">
	//   49  121:iconst_3        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #78  <String "zzbg">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #79  <String "zzmv">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #80  <String "zzmw">
	//   62  139:aastore         
	//   63  140:invokestatic    #83  <Method Object zza(zzhf, String, Object[])>
	//   64  143:areturn         
_L3:
		return ((Object) (new zza(((zzda) (null)))));
	//   65  144:new             #12  <Class zzcz$zzg$zza>
	//   66  147:dup             
	//   67  148:aconst_null     
	//   68  149:invokespecial   #86  <Method void zzcz$zzg$zza(zzda)>
	//   69  152:areturn         
_L2:
		return ((Object) (new zzcz$zzg()));
	//   70  153:new             #2   <Class zzcz$zzg>
	//   71  156:dup             
	//   72  157:invokespecial   #28  <Method void zzcz$zzg()>
	//   73  160:areturn         
	}

	private static volatile zzhq zzbf;
	private static final zzcz$zzg zznu;
	private int zzbg;
	private long zzmv;
	private long zzmw;

	static 
	{
		zznu = new zzcz$zzg();
	//    0    0:new             #2   <Class zzcz$zzg>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void zzcz$zzg()>
	//    3    7:putstatic       #30  <Field zzcz$zzg zznu>
		zzfy.zza(com/google/android/gms/internal/vision/zzcz$zzg, ((zzfy) (zznu)));
	//    4   10:ldc1            #2   <Class zzcz$zzg>
	//    5   12:getstatic       #30  <Field zzcz$zzg zznu>
	//    6   15:invokestatic    #33  <Method void zzfy.zza(Class, zzfy)>
	//*   7   18:return          
	}

	private zzcz$zzg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void zzfy()>
	//    2    4:return          
	}
}
