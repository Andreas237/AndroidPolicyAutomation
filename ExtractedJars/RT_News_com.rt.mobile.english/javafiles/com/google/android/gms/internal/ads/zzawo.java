// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbo, zzbcw, zzbbu, zzawp, 
//			zzawq, zzbdf, zzbah

public final class zzawo extends zzbbo
	implements zzbcw
{
	public static final class zza extends zzbbo.zza
		implements zzbcw
	{

		private zza()
		{
			super(((zzbbo) (zzawo.zzxt())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #16  <Method zzawo zzawo.zzxt()>
		//    2    4:invokespecial   #19  <Method void zzbbo$zza(zzbbo)>
		//    3    7:return          
		}

		zza(zzawp zzawp1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void zzawo$zza()>
		//    2    4:return          
		}
	}


	private zzawo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void zzbbo()>
	//    2    4:return          
	}

	public static zzawo zzw(zzbah zzbah)
		throws zzbbu
	{
		return (zzawo)zzbbo.zza(((zzbbo) (zzdjk)), zzbah);
	//    0    0:getstatic       #24  <Field zzawo zzdjk>
	//    1    3:aload_0         
	//    2    4:invokestatic    #36  <Method zzbbo zzbbo.zza(zzbbo, zzbah)>
	//    3    7:checkcast       #2   <Class zzawo>
	//    4   10:areturn         
	}

	static zzawo zzxt()
	{
		return zzdjk;
	//    0    0:getstatic       #24  <Field zzawo zzdjk>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzawp.zzakf[i - 1];
	//    0    0:getstatic       #46  <Field int[] zzawp.zzakf>
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
	//    6   48:new             #48  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #49  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #55  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzakh));
	//   15   63:getstatic       #57  <Field zzbdf zzakh>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/zzawo;
	//   19   71:ldc1            #2   <Class zzawo>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzakh));
	//   21   74:getstatic       #57  <Field zzbdf zzakh>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzbbo.zzb(((zzbbo) (zzdjk)))));
	//   27   84:new             #59  <Class zzbbo$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #24  <Field zzawo zzdjk>
	//   30   91:invokespecial   #62  <Method void zzbbo$zzb(zzbbo)>
	//   31   94:astore_2        
		zzakh = ((zzbdf) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #57  <Field zzbdf zzakh>
_L12:
		com/google/android/gms/internal/ads/zzawo;
	//   34   99:ldc1            #2   <Class zzawo>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/zzawo;
	//   39  105:ldc1            #2   <Class zzawo>
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
		return ((Object) (zzdjk));
	//   45  112:getstatic       #24  <Field zzawo zzdjk>
	//   46  115:areturn         
_L4:
		return zza(((zzbcu) (zzdjk)), "\000\001\000\000\001\001\001\002\000\000\000\001\t", new Object[] {
			"zzdjj"
		});
	//   47  116:getstatic       #24  <Field zzawo zzdjk>
	//   48  119:ldc1            #64  <String "\000\001\000\000\001\001\001\002\000\000\000\001\t">
	//   49  121:iconst_1        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #67  <String "zzdjj">
	//   54  129:aastore         
	//   55  130:invokestatic    #70  <Method Object zza(zzbcu, String, Object[])>
	//   56  133:areturn         
_L3:
		return ((Object) (new zza(((zzawp) (null)))));
	//   57  134:new             #9   <Class zzawo$zza>
	//   58  137:dup             
	//   59  138:aconst_null     
	//   60  139:invokespecial   #73  <Method void zzawo$zza(zzawp)>
	//   61  142:areturn         
_L2:
		return ((Object) (new zzawo()));
	//   62  143:new             #2   <Class zzawo>
	//   63  146:dup             
	//   64  147:invokespecial   #22  <Method void zzawo()>
	//   65  150:areturn         
	}

	public final zzawq zzxs()
	{
		if(zzdjj == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field zzawq zzdjj>
	//*   2    4:ifnonnull       11
			return zzawq.zzxx();
	//    3    7:invokestatic    #82  <Method zzawq zzawq.zzxx()>
	//    4   10:areturn         
		else
			return zzdjj;
	//    5   11:aload_0         
	//    6   12:getfield        #77  <Field zzawq zzdjj>
	//    7   15:areturn         
	}

	private static volatile zzbdf zzakh;
	private static final zzawo zzdjk;
	private zzawq zzdjj;

	static 
	{
		zzdjk = new zzawo();
	//    0    0:new             #2   <Class zzawo>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void zzawo()>
	//    3    7:putstatic       #24  <Field zzawo zzdjk>
		zzbbo.zza(com/google/android/gms/internal/ads/zzawo, ((zzbbo) (zzdjk)));
	//    4   10:ldc1            #2   <Class zzawo>
	//    5   12:getstatic       #24  <Field zzawo zzdjk>
	//    6   15:invokestatic    #27  <Method void zzbbo.zza(Class, zzbbo)>
	//*   7   18:return          
	}
}
