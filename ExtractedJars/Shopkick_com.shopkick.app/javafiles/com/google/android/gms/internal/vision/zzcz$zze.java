// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;


// Referenced classes of package com.google.android.gms.internal.vision:
//			zzfy, zzhh, zzcz, zzda, 
//			zzhq

public static final class zzcz$zze extends zzfy
	implements zzhh
{
	public static final class zza extends zzfy.zza
		implements zzhh
	{

		private zza()
		{
			super(((zzfy) (zzcz.zze.zzbv())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #19  <Method zzcz$zze zzcz$zze.zzbv()>
		//    2    4:invokespecial   #22  <Method void zzfy$zza(zzfy)>
		//    3    7:return          
		}

		zza(zzda zzda1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void zzcz$zze$zza()>
		//    2    4:return          
		}
	}


	static zzcz$zze zzbv()
	{
		return zznk;
	//    0    0:getstatic       #34  <Field zzcz$zze zznk>
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
		com/google/android/gms/internal/vision/zzcz$zze;
	//   19   71:ldc1            #2   <Class zzcz$zze>
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
		obj = ((Object) (new zzfy$zzb(((zzfy) (zznk)))));
	//   27   84:new             #61  <Class zzfy$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #34  <Field zzcz$zze zznk>
	//   30   91:invokespecial   #64  <Method void zzfy$zzb(zzfy)>
	//   31   94:astore_2        
		zzbf = ((zzhq) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #59  <Field zzhq zzbf>
_L12:
		com/google/android/gms/internal/vision/zzcz$zze;
	//   34   99:ldc1            #2   <Class zzcz$zze>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/vision/zzcz$zze;
	//   39  105:ldc1            #2   <Class zzcz$zze>
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
		return ((Object) (zznk));
	//   45  112:getstatic       #34  <Field zzcz$zze zznk>
	//   46  115:areturn         
_L4:
		return zza(((zzhf) (zznk)), "\001\006\000\001\001\006\006\000\000\000\001\001\000\002\001\001\003\001\002\004\001\003\005\001\004\006\001\005", new Object[] {
			"zzbg", "zzne", "zznf", "zzng", "zznh", "zzni", "zznj"
		});
	//   47  116:getstatic       #34  <Field zzcz$zze zznk>
	//   48  119:ldc1            #66  <String "\001\006\000\001\001\006\006\000\000\000\001\001\000\002\001\001\003\001\002\004\001\003\005\001\004\006\001\005">
	//   49  121:bipush          7
	//   50  123:anewarray       Object[]
	//   51  126:dup             
	//   52  127:iconst_0        
	//   53  128:ldc1            #69  <String "zzbg">
	//   54  130:aastore         
	//   55  131:dup             
	//   56  132:iconst_1        
	//   57  133:ldc1            #70  <String "zzne">
	//   58  135:aastore         
	//   59  136:dup             
	//   60  137:iconst_2        
	//   61  138:ldc1            #71  <String "zznf">
	//   62  140:aastore         
	//   63  141:dup             
	//   64  142:iconst_3        
	//   65  143:ldc1            #72  <String "zzng">
	//   66  145:aastore         
	//   67  146:dup             
	//   68  147:iconst_4        
	//   69  148:ldc1            #73  <String "zznh">
	//   70  150:aastore         
	//   71  151:dup             
	//   72  152:iconst_5        
	//   73  153:ldc1            #74  <String "zzni">
	//   74  155:aastore         
	//   75  156:dup             
	//   76  157:bipush          6
	//   77  159:ldc1            #75  <String "zznj">
	//   78  161:aastore         
	//   79  162:invokestatic    #78  <Method Object zza(zzhf, String, Object[])>
	//   80  165:areturn         
_L3:
		return ((Object) (new zza(((zzda) (null)))));
	//   81  166:new             #12  <Class zzcz$zze$zza>
	//   82  169:dup             
	//   83  170:aconst_null     
	//   84  171:invokespecial   #81  <Method void zzcz$zze$zza(zzda)>
	//   85  174:areturn         
_L2:
		return ((Object) (new zzcz$zze()));
	//   86  175:new             #2   <Class zzcz$zze>
	//   87  178:dup             
	//   88  179:invokespecial   #32  <Method void zzcz$zze()>
	//   89  182:areturn         
	}

	private static volatile zzhq zzbf;
	private static final zzcz$zze zznk;
	private int zzbg;
	private float zzne;
	private float zznf;
	private float zzng;
	private float zznh;
	private float zzni;
	private float zznj;

	static 
	{
		zznk = new zzcz$zze();
	//    0    0:new             #2   <Class zzcz$zze>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void zzcz$zze()>
	//    3    7:putstatic       #34  <Field zzcz$zze zznk>
		zzfy.zza(com/google/android/gms/internal/vision/zzcz$zze, ((zzfy) (zznk)));
	//    4   10:ldc1            #2   <Class zzcz$zze>
	//    5   12:getstatic       #34  <Field zzcz$zze zznk>
	//    6   15:invokestatic    #37  <Method void zzfy.zza(Class, zzfy)>
	//*   7   18:return          
	}

	private zzcz$zze()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void zzfy()>
	//    2    4:return          
	}
}
