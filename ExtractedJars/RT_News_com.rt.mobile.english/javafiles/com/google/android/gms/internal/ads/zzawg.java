// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbo, zzbcw, zzbbu, zzawh, 
//			zzbdf, zzbah

public final class zzawg extends zzbbo
	implements zzbcw
{
	public static final class zza extends zzbbo.zza
		implements zzbcw
	{

		private zza()
		{
			super(((zzbbo) (zzawg.zzxm())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #16  <Method zzawg zzawg.zzxm()>
		//    2    4:invokespecial   #19  <Method void zzbbo$zza(zzbbo)>
		//    3    7:return          
		}

		zza(zzawh zzawh1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void zzawg$zza()>
		//    2    4:return          
		}
	}


	private zzawg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void zzbbo()>
	//    2    4:return          
	}

	public static zzawg zzt(zzbah zzbah)
		throws zzbbu
	{
		return (zzawg)zzbbo.zza(((zzbbo) (zzdja)), zzbah);
	//    0    0:getstatic       #24  <Field zzawg zzdja>
	//    1    3:aload_0         
	//    2    4:invokestatic    #36  <Method zzbbo zzbbo.zza(zzbbo, zzbah)>
	//    3    7:checkcast       #2   <Class zzawg>
	//    4   10:areturn         
	}

	static zzawg zzxm()
	{
		return zzdja;
	//    0    0:getstatic       #24  <Field zzawg zzdja>
	//    1    3:areturn         
	}

	public final int getKeySize()
	{
		return zzdir;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int zzdir>
	//    2    4:ireturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzawh.zzakf[i - 1];
	//    0    0:getstatic       #50  <Field int[] zzawh.zzakf>
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
	//    6   48:new             #52  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #53  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #59  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzakh));
	//   15   63:getstatic       #61  <Field zzbdf zzakh>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/zzawg;
	//   19   71:ldc1            #2   <Class zzawg>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzakh));
	//   21   74:getstatic       #61  <Field zzbdf zzakh>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzbbo.zzb(((zzbbo) (zzdja)))));
	//   27   84:new             #63  <Class zzbbo$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #24  <Field zzawg zzdja>
	//   30   91:invokespecial   #66  <Method void zzbbo$zzb(zzbbo)>
	//   31   94:astore_2        
		zzakh = ((zzbdf) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #61  <Field zzbdf zzakh>
_L12:
		com/google/android/gms/internal/ads/zzawg;
	//   34   99:ldc1            #2   <Class zzawg>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/zzawg;
	//   39  105:ldc1            #2   <Class zzawg>
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
		return ((Object) (zzdja));
	//   45  112:getstatic       #24  <Field zzawg zzdja>
	//   46  115:areturn         
_L4:
		return zza(((zzbcu) (zzdja)), "\000\001\000\000\002\002\001\003\000\000\000\002\013", new Object[] {
			"zzdir"
		});
	//   47  116:getstatic       #24  <Field zzawg zzdja>
	//   48  119:ldc1            #68  <String "\000\001\000\000\002\002\001\003\000\000\000\002\013">
	//   49  121:iconst_1        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #71  <String "zzdir">
	//   54  129:aastore         
	//   55  130:invokestatic    #74  <Method Object zza(zzbcu, String, Object[])>
	//   56  133:areturn         
_L3:
		return ((Object) (new zza(((zzawh) (null)))));
	//   57  134:new             #9   <Class zzawg$zza>
	//   58  137:dup             
	//   59  138:aconst_null     
	//   60  139:invokespecial   #77  <Method void zzawg$zza(zzawh)>
	//   61  142:areturn         
_L2:
		return ((Object) (new zzawg()));
	//   62  143:new             #2   <Class zzawg>
	//   63  146:dup             
	//   64  147:invokespecial   #22  <Method void zzawg()>
	//   65  150:areturn         
	}

	private static volatile zzbdf zzakh;
	private static final zzawg zzdja;
	private int zzdir;

	static 
	{
		zzdja = new zzawg();
	//    0    0:new             #2   <Class zzawg>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void zzawg()>
	//    3    7:putstatic       #24  <Field zzawg zzdja>
		zzbbo.zza(com/google/android/gms/internal/ads/zzawg, ((zzbbo) (zzdja)));
	//    4   10:ldc1            #2   <Class zzawg>
	//    5   12:getstatic       #24  <Field zzawg zzdja>
	//    6   15:invokestatic    #27  <Method void zzbbo.zza(Class, zzbbo)>
	//*   7   18:return          
	}
}
