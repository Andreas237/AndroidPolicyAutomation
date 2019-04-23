// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;


// Referenced classes of package com.google.android.gms.internal.vision:
//			zzfy, zzhh, zzcz, zzda, 
//			zzhq

public static final class zzcz$zzi extends zzfy
	implements zzhh
{
	public static final class zza extends zzfy.zza
		implements zzhh
	{

		private zza()
		{
			super(((zzfy) (zzcz.zzi.zzca())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #19  <Method zzcz$zzi zzcz$zzi.zzca()>
		//    2    4:invokespecial   #22  <Method void zzfy$zza(zzfy)>
		//    3    7:return          
		}

		zza(zzda zzda1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void zzcz$zzi$zza()>
		//    2    4:return          
		}
	}


	static zzcz$zzi zzca()
	{
		return zzoc;
	//    0    0:getstatic       #34  <Field zzcz$zzi zzoc>
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
	//	               1 163
	//	               2 154
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 163
	//	               2 154
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
		com/google/android/gms/internal/vision/zzcz$zzi;
	//   19   71:ldc1            #2   <Class zzcz$zzi>
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
		obj = ((Object) (new zzfy$zzb(((zzfy) (zzoc)))));
	//   27   84:new             #61  <Class zzfy$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #34  <Field zzcz$zzi zzoc>
	//   30   91:invokespecial   #64  <Method void zzfy$zzb(zzfy)>
	//   31   94:astore_2        
		zzbf = ((zzhq) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #59  <Field zzhq zzbf>
_L12:
		com/google/android/gms/internal/vision/zzcz$zzi;
	//   34   99:ldc1            #2   <Class zzcz$zzi>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/vision/zzcz$zzi;
	//   39  105:ldc1            #2   <Class zzcz$zzi>
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
		return ((Object) (zzoc));
	//   45  112:getstatic       #34  <Field zzcz$zzi zzoc>
	//   46  115:areturn         
_L4:
		return zza(((zzhf) (zzoc)), "\001\004\000\001\001\021\004\000\000\000\001\t\000\002\004\001\020\t\002\021\t\003", new Object[] {
			"zzbg", "zzny", "zznz", "zzoa", "zzob"
		});
	//   47  116:getstatic       #34  <Field zzcz$zzi zzoc>
	//   48  119:ldc1            #66  <String "\001\004\000\001\001\021\004\000\000\000\001\t\000\002\004\001\020\t\002\021\t\003">
	//   49  121:iconst_5        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #69  <String "zzbg">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #70  <String "zzny">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #71  <String "zznz">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #72  <String "zzoa">
	//   66  144:aastore         
	//   67  145:dup             
	//   68  146:iconst_4        
	//   69  147:ldc1            #73  <String "zzob">
	//   70  149:aastore         
	//   71  150:invokestatic    #76  <Method Object zza(zzhf, String, Object[])>
	//   72  153:areturn         
_L3:
		return ((Object) (new zza(((zzda) (null)))));
	//   73  154:new             #12  <Class zzcz$zzi$zza>
	//   74  157:dup             
	//   75  158:aconst_null     
	//   76  159:invokespecial   #79  <Method void zzcz$zzi$zza(zzda)>
	//   77  162:areturn         
_L2:
		return ((Object) (new zzcz$zzi()));
	//   78  163:new             #2   <Class zzcz$zzi>
	//   79  166:dup             
	//   80  167:invokespecial   #32  <Method void zzcz$zzi()>
	//   81  170:areturn         
	}

	private static volatile zzhq zzbf;
	private static final zzcz$zzi zzoc;
	private int zzbg;
	private zzcz$zzb zzny;
	private int zznz;
	private zzcz$zze zzoa;
	private zzcz$zza zzob;

	static 
	{
		zzoc = new zzcz$zzi();
	//    0    0:new             #2   <Class zzcz$zzi>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void zzcz$zzi()>
	//    3    7:putstatic       #34  <Field zzcz$zzi zzoc>
		zzfy.zza(com/google/android/gms/internal/vision/zzcz$zzi, ((zzfy) (zzoc)));
	//    4   10:ldc1            #2   <Class zzcz$zzi>
	//    5   12:getstatic       #34  <Field zzcz$zzi zzoc>
	//    6   15:invokestatic    #37  <Method void zzfy.zza(Class, zzfy)>
	//*   7   18:return          
	}

	private zzcz$zzi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void zzfy()>
	//    2    4:return          
	}
}
