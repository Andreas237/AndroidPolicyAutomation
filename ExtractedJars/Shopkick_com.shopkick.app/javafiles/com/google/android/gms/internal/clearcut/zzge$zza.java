// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcg, zzdq, zzge, zzgf, 
//			zzdz, zzcn, zzcl, zzcm

public static final class zzge$zza extends zzcg
	implements zzdq
{
	public static final class zza extends zzcg.zza
		implements zzdq
	{

		private zza()
		{
			super(((zzcg) (zzge.zza.zzet())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #18  <Method zzge$zza zzge$zza.zzet()>
		//    2    4:invokespecial   #21  <Method void zzcg$zza(zzcg)>
		//    3    7:return          
		}

		zza(zzgf zzgf1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void zzge$zza$zza()>
		//    2    4:return          
		}
	}


	static zzge$zza zzet()
	{
		return zzsm;
	//    0    0:getstatic       #33  <Field zzge$zza zzsm>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzgf.zzba[i - 1];
	//    0    0:getstatic       #68  <Field int[] zzgf.zzba>
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
	//    6   48:new             #70  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #71  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #77  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #79  <Field zzdz zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/zzge$zza;
	//   19   71:ldc1            #2   <Class zzge$zza>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #79  <Field zzdz zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzcg$zzb(((zzcg) (zzsm)))));
	//   27   84:new             #81  <Class zzcg$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #33  <Field zzge$zza zzsm>
	//   30   91:invokespecial   #84  <Method void zzcg$zzb(zzcg)>
	//   31   94:astore_2        
		zzbg = ((zzdz) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #79  <Field zzdz zzbg>
_L12:
		com/google/android/gms/internal/clearcut/zzge$zza;
	//   34   99:ldc1            #2   <Class zzge$zza>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/zzge$zza;
	//   39  105:ldc1            #2   <Class zzge$zza>
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
		return ((Object) (zzsm));
	//   45  112:getstatic       #33  <Field zzge$zza zzsm>
	//   46  115:areturn         
_L4:
		return zza(((zzdo) (zzsm)), "\001\005\000\000\001\005\005\006\000\005\000\001\032\002\032\003\026\004\024\005\024", new Object[] {
			"zzsh", "zzsi", "zzsj", "zzsk", "zzsl"
		});
	//   47  116:getstatic       #33  <Field zzge$zza zzsm>
	//   48  119:ldc1            #86  <String "\001\005\000\000\001\005\005\006\000\005\000\001\032\002\032\003\026\004\024\005\024">
	//   49  121:iconst_5        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #89  <String "zzsh">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #90  <String "zzsi">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #91  <String "zzsj">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #92  <String "zzsk">
	//   66  144:aastore         
	//   67  145:dup             
	//   68  146:iconst_4        
	//   69  147:ldc1            #93  <String "zzsl">
	//   70  149:aastore         
	//   71  150:invokestatic    #96  <Method Object zza(zzdo, String, Object[])>
	//   72  153:areturn         
_L3:
		return ((Object) (new zza(((zzgf) (null)))));
	//   73  154:new             #12  <Class zzge$zza$zza>
	//   74  157:dup             
	//   75  158:aconst_null     
	//   76  159:invokespecial   #99  <Method void zzge$zza$zza(zzgf)>
	//   77  162:areturn         
_L2:
		return ((Object) (new zzge$zza()));
	//   78  163:new             #2   <Class zzge$zza>
	//   79  166:dup             
	//   80  167:invokespecial   #31  <Method void zzge$zza()>
	//   81  170:areturn         
	}

	private static volatile zzdz zzbg;
	private static final zzge$zza zzsm;
	private zzcn zzsh;
	private zzcn zzsi;
	private zzcl zzsj;
	private zzcm zzsk;
	private zzcm zzsl;

	static 
	{
		zzsm = new zzge$zza();
	//    0    0:new             #2   <Class zzge$zza>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void zzge$zza()>
	//    3    7:putstatic       #33  <Field zzge$zza zzsm>
		zzcg.zza(com/google/android/gms/internal/clearcut/zzge$zza, ((zzcg) (zzsm)));
	//    4   10:ldc1            #2   <Class zzge$zza>
	//    5   12:getstatic       #33  <Field zzge$zza zzsm>
	//    6   15:invokestatic    #36  <Method void zzcg.zza(Class, zzcg)>
	//*   7   18:return          
	}

	private zzge$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void zzcg()>
		zzsh = zzcg.zzbb();
	//    2    4:aload_0         
	//    3    5:invokestatic    #42  <Method zzcn zzcg.zzbb()>
	//    4    8:putfield        #44  <Field zzcn zzsh>
		zzsi = zzcg.zzbb();
	//    5   11:aload_0         
	//    6   12:invokestatic    #42  <Method zzcn zzcg.zzbb()>
	//    7   15:putfield        #46  <Field zzcn zzsi>
		zzsj = zzaz();
	//    8   18:aload_0         
	//    9   19:invokestatic    #50  <Method zzcl zzaz()>
	//   10   22:putfield        #52  <Field zzcl zzsj>
		zzsk = zzba();
	//   11   25:aload_0         
	//   12   26:invokestatic    #56  <Method zzcm zzba()>
	//   13   29:putfield        #58  <Field zzcm zzsk>
		zzsl = zzba();
	//   14   32:aload_0         
	//   15   33:invokestatic    #56  <Method zzcm zzba()>
	//   16   36:putfield        #60  <Field zzcm zzsl>
	//   17   39:return          
	}
}
