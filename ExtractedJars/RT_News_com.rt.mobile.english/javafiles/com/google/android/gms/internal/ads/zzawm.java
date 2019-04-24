// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbo, zzbcw, zzawn, zzaxn, 
//			zzbdf

public final class zzawm extends zzbbo
	implements zzbcw
{
	public static final class zza extends zzbbo.zza
		implements zzbcw
	{

		private zza()
		{
			super(((zzbbo) (zzawm.zzxr())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #16  <Method zzawm zzawm.zzxr()>
		//    2    4:invokespecial   #19  <Method void zzbbo$zza(zzbbo)>
		//    3    7:return          
		}

		zza(zzawn zzawn1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void zzawm$zza()>
		//    2    4:return          
		}
	}


	private zzawm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void zzbbo()>
	//    2    4:return          
	}

	public static zzawm zzxq()
	{
		return zzdji;
	//    0    0:getstatic       #24  <Field zzawm zzdji>
	//    1    3:areturn         
	}

	static zzawm zzxr()
	{
		return zzdji;
	//    0    0:getstatic       #24  <Field zzawm zzdji>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzawn.zzakf[i - 1];
	//    0    0:getstatic       #39  <Field int[] zzawn.zzakf>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 143
	//	               2 134
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 143
	//	               2 134
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #41  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #42  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #48  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzakh));
	//   15   63:getstatic       #50  <Field zzbdf zzakh>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/zzawm;
	//   19   71:ldc1            #2   <Class zzawm>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzakh));
	//   21   74:getstatic       #50  <Field zzbdf zzakh>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzbbo.zzb(((zzbbo) (zzdji)))));
	//   27   84:new             #52  <Class zzbbo$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #24  <Field zzawm zzdji>
	//   30   91:invokespecial   #55  <Method void zzbbo$zzb(zzbbo)>
	//   31   94:astore_2        
		zzakh = ((zzbdf) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #50  <Field zzbdf zzakh>
_L12:
		com/google/android/gms/internal/ads/zzawm;
	//   34   99:ldc1            #2   <Class zzawm>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/zzawm;
	//   39  105:ldc1            #2   <Class zzawm>
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
		return ((Object) (zzdji));
	//   45  112:getstatic       #24  <Field zzawm zzdji>
	//   46  115:areturn         
_L4:
		return zza(((zzbcu) (zzdji)), "\000\001\000\000\002\002\001\003\000\000\000\002\t", new Object[] {
			"zzdjh"
		});
	//   47  116:getstatic       #24  <Field zzawm zzdji>
	//   48  119:ldc1            #57  <String "\000\001\000\000\002\002\001\003\000\000\000\002\t">
	//   49  121:iconst_1        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #60  <String "zzdjh">
	//   54  129:aastore         
	//   55  130:invokestatic    #63  <Method Object zza(zzbcu, String, Object[])>
	//   56  133:areturn         
_L3:
		return ((Object) (new zza(((zzawn) (null)))));
	//   57  134:new             #9   <Class zzawm$zza>
	//   58  137:dup             
	//   59  138:aconst_null     
	//   60  139:invokespecial   #66  <Method void zzawm$zza(zzawn)>
	//   61  142:areturn         
_L2:
		return ((Object) (new zzawm()));
	//   62  143:new             #2   <Class zzawm>
	//   63  146:dup             
	//   64  147:invokespecial   #22  <Method void zzawm()>
	//   65  150:areturn         
	}

	public final zzaxn zzxp()
	{
		if(zzdjh == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field zzaxn zzdjh>
	//*   2    4:ifnonnull       11
			return zzaxn.zzzc();
	//    3    7:invokestatic    #75  <Method zzaxn zzaxn.zzzc()>
	//    4   10:areturn         
		else
			return zzdjh;
	//    5   11:aload_0         
	//    6   12:getfield        #70  <Field zzaxn zzdjh>
	//    7   15:areturn         
	}

	private static volatile zzbdf zzakh;
	private static final zzawm zzdji;
	private zzaxn zzdjh;

	static 
	{
		zzdji = new zzawm();
	//    0    0:new             #2   <Class zzawm>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void zzawm()>
	//    3    7:putstatic       #24  <Field zzawm zzdji>
		zzbbo.zza(com/google/android/gms/internal/ads/zzawm, ((zzbbo) (zzdji)));
	//    4   10:ldc1            #2   <Class zzawm>
	//    5   12:getstatic       #24  <Field zzawm zzdji>
	//    6   15:invokestatic    #27  <Method void zzbbo.zza(Class, zzbbo)>
	//*   7   18:return          
	}
}
