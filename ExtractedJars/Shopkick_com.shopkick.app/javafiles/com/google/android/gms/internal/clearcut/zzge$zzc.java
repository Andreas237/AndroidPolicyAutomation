// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcg, zzdq, zzge, zzgf, 
//			zzdz

public static final class zzge$zzc extends zzcg
	implements zzdq
{
	public static final class zza extends zzcg.zza
		implements zzdq
	{

		private zza()
		{
			super(((zzcg) (zzge.zzc.zzev())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #19  <Method zzge$zzc zzge$zzc.zzev()>
		//    2    4:invokespecial   #22  <Method void zzcg$zza(zzcg)>
		//    3    7:return          
		}

		zza(zzgf zzgf1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void zzge$zzc$zza()>
		//    2    4:return          
		}
	}


	static zzge$zzc zzev()
	{
		return zztt;
	//    0    0:getstatic       #30  <Field zzge$zzc zztt>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzgf.zzba[i - 1];
	//    0    0:getstatic       #44  <Field int[] zzgf.zzba>
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
	//    6   48:new             #46  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #47  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #53  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #55  <Field zzdz zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/zzge$zzc;
	//   19   71:ldc1            #2   <Class zzge$zzc>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #55  <Field zzdz zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzcg$zzb(((zzcg) (zztt)))));
	//   27   84:new             #57  <Class zzcg$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #30  <Field zzge$zzc zztt>
	//   30   91:invokespecial   #60  <Method void zzcg$zzb(zzcg)>
	//   31   94:astore_2        
		zzbg = ((zzdz) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #55  <Field zzdz zzbg>
_L12:
		com/google/android/gms/internal/clearcut/zzge$zzc;
	//   34   99:ldc1            #2   <Class zzge$zzc>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/zzge$zzc;
	//   39  105:ldc1            #2   <Class zzge$zzc>
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
		return ((Object) (zztt));
	//   45  112:getstatic       #30  <Field zzge$zzc zztt>
	//   46  115:areturn         
_L4:
		return zza(((zzdo) (zztt)), "\001\002\000\001\001\002\002\003\000\000\000\001\007\000\002\007\001", new Object[] {
			"zzbb", "zztr", "zzts"
		});
	//   47  116:getstatic       #30  <Field zzge$zzc zztt>
	//   48  119:ldc1            #62  <String "\001\002\000\001\001\002\002\003\000\000\000\001\007\000\002\007\001">
	//   49  121:iconst_3        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #65  <String "zzbb">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #66  <String "zztr">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #67  <String "zzts">
	//   62  139:aastore         
	//   63  140:invokestatic    #70  <Method Object zza(zzdo, String, Object[])>
	//   64  143:areturn         
_L3:
		return ((Object) (new zza(((zzgf) (null)))));
	//   65  144:new             #12  <Class zzge$zzc$zza>
	//   66  147:dup             
	//   67  148:aconst_null     
	//   68  149:invokespecial   #73  <Method void zzge$zzc$zza(zzgf)>
	//   69  152:areturn         
_L2:
		return ((Object) (new zzge$zzc()));
	//   70  153:new             #2   <Class zzge$zzc>
	//   71  156:dup             
	//   72  157:invokespecial   #28  <Method void zzge$zzc()>
	//   73  160:areturn         
	}

	private static volatile zzdz zzbg;
	private static final zzge$zzc zztt;
	private int zzbb;
	private boolean zztr;
	private boolean zzts;

	static 
	{
		zztt = new zzge$zzc();
	//    0    0:new             #2   <Class zzge$zzc>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void zzge$zzc()>
	//    3    7:putstatic       #30  <Field zzge$zzc zztt>
		zzcg.zza(com/google/android/gms/internal/clearcut/zzge$zzc, ((zzcg) (zztt)));
	//    4   10:ldc1            #2   <Class zzge$zzc>
	//    5   12:getstatic       #30  <Field zzge$zzc zztt>
	//    6   15:invokestatic    #33  <Method void zzcg.zza(Class, zzcg)>
	//*   7   18:return          
	}

	private zzge$zzc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void zzcg()>
	//    2    4:return          
	}
}
