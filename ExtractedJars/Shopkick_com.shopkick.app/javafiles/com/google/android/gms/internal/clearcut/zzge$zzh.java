// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcg, zzdq, zzge, zzgf, 
//			zzdz

public static final class zzge$zzh extends zzcg
	implements zzdq
{
	public static final class zza extends zzcg.zza
		implements zzdq
	{

		private zza()
		{
			super(((zzcg) (zzge.zzh.zzfa())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #19  <Method zzge$zzh zzge$zzh.zzfa()>
		//    2    4:invokespecial   #22  <Method void zzcg$zza(zzcg)>
		//    3    7:return          
		}

		zza(zzgf zzgf1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void zzge$zzh$zza()>
		//    2    4:return          
		}
	}


	static zzge$zzh zzfa()
	{
		return zzvx;
	//    0    0:getstatic       #32  <Field zzge$zzh zzvx>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzgf.zzba[i - 1];
	//    0    0:getstatic       #46  <Field int[] zzgf.zzba>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 158
	//	               2 149
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 158
	//	               2 149
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
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #57  <Field zzdz zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/zzge$zzh;
	//   19   71:ldc1            #2   <Class zzge$zzh>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #57  <Field zzdz zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzcg$zzb(((zzcg) (zzvx)))));
	//   27   84:new             #59  <Class zzcg$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #32  <Field zzge$zzh zzvx>
	//   30   91:invokespecial   #62  <Method void zzcg$zzb(zzcg)>
	//   31   94:astore_2        
		zzbg = ((zzdz) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #57  <Field zzdz zzbg>
_L12:
		com/google/android/gms/internal/clearcut/zzge$zzh;
	//   34   99:ldc1            #2   <Class zzge$zzh>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/zzge$zzh;
	//   39  105:ldc1            #2   <Class zzge$zzh>
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
		return ((Object) (zzvx));
	//   45  112:getstatic       #32  <Field zzge$zzh zzvx>
	//   46  115:areturn         
_L4:
		return zza(((zzdo) (zzvx)), "\001\003\000\001\001\003\003\004\000\000\000\001\002\001\002\007\002\003\002\0", new Object[] {
			"zzbb", "zzvv", "zzvw", "zzvu"
		});
	//   47  116:getstatic       #32  <Field zzge$zzh zzvx>
	//   48  119:ldc1            #64  <String "\001\003\000\001\001\003\003\004\000\000\000\001\002\001\002\007\002\003\002\0">
	//   49  121:iconst_4        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #67  <String "zzbb">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #68  <String "zzvv">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #69  <String "zzvw">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #70  <String "zzvu">
	//   66  144:aastore         
	//   67  145:invokestatic    #73  <Method Object zza(zzdo, String, Object[])>
	//   68  148:areturn         
_L3:
		return ((Object) (new zza(((zzgf) (null)))));
	//   69  149:new             #12  <Class zzge$zzh$zza>
	//   70  152:dup             
	//   71  153:aconst_null     
	//   72  154:invokespecial   #76  <Method void zzge$zzh$zza(zzgf)>
	//   73  157:areturn         
_L2:
		return ((Object) (new zzge$zzh()));
	//   74  158:new             #2   <Class zzge$zzh>
	//   75  161:dup             
	//   76  162:invokespecial   #30  <Method void zzge$zzh()>
	//   77  165:areturn         
	}

	private static volatile zzdz zzbg;
	private static final zzge$zzh zzvx;
	private int zzbb;
	private long zzvu;
	private long zzvv;
	private boolean zzvw;

	static 
	{
		zzvx = new zzge$zzh();
	//    0    0:new             #2   <Class zzge$zzh>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void zzge$zzh()>
	//    3    7:putstatic       #32  <Field zzge$zzh zzvx>
		zzcg.zza(com/google/android/gms/internal/clearcut/zzge$zzh, ((zzcg) (zzvx)));
	//    4   10:ldc1            #2   <Class zzge$zzh>
	//    5   12:getstatic       #32  <Field zzge$zzh zzvx>
	//    6   15:invokestatic    #35  <Method void zzcg.zza(Class, zzcg)>
	//*   7   18:return          
	}

	private zzge$zzh()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void zzcg()>
	//    2    4:return          
	}
}
