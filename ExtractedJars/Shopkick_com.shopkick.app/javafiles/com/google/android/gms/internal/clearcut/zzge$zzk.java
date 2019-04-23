// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcg, zzdq, zzge, zzbb, 
//			zzgf, zzdz, zzcn

public static final class zzge$zzk extends zzcg
	implements zzdq
{
	public static final class zza extends zzcg.zza
		implements zzdq
	{

		private zza()
		{
			super(((zzcg) (zzge.zzk.zzfd())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #19  <Method zzge$zzk zzge$zzk.zzfd()>
		//    2    4:invokespecial   #22  <Method void zzcg$zza(zzcg)>
		//    3    7:return          
		}

		zza(zzgf zzgf1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void zzge$zzk$zza()>
		//    2    4:return          
		}
	}


	static zzge$zzk zzfd()
	{
		return zzws;
	//    0    0:getstatic       #36  <Field zzge$zzk zzws>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzgf.zzba[i - 1];
	//    0    0:getstatic       #66  <Field int[] zzgf.zzba>
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
	//    6   48:new             #68  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #69  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #75  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #77  <Field zzdz zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/zzge$zzk;
	//   19   71:ldc1            #2   <Class zzge$zzk>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #77  <Field zzdz zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzcg$zzb(((zzcg) (zzws)))));
	//   27   84:new             #79  <Class zzcg$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #36  <Field zzge$zzk zzws>
	//   30   91:invokespecial   #82  <Method void zzcg$zzb(zzcg)>
	//   31   94:astore_2        
		zzbg = ((zzdz) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #77  <Field zzdz zzbg>
_L12:
		com/google/android/gms/internal/clearcut/zzge$zzk;
	//   34   99:ldc1            #2   <Class zzge$zzk>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/zzge$zzk;
	//   39  105:ldc1            #2   <Class zzge$zzk>
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
		return ((Object) (zzws));
	//   45  112:getstatic       #36  <Field zzge$zzk zzws>
	//   46  115:areturn         
_L4:
		return zza(((zzdo) (zzws)), "\001\004\000\001\001\004\004\005\000\001\000\001\n\000\002\034\003\007\002\004\b\001", new Object[] {
			"zzbb", "zzwo", "zzwq", "zzwr", "zzwp"
		});
	//   47  116:getstatic       #36  <Field zzge$zzk zzws>
	//   48  119:ldc1            #84  <String "\001\004\000\001\001\004\004\005\000\001\000\001\n\000\002\034\003\007\002\004\b\001">
	//   49  121:iconst_5        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #87  <String "zzbb">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #88  <String "zzwo">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #89  <String "zzwq">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #90  <String "zzwr">
	//   66  144:aastore         
	//   67  145:dup             
	//   68  146:iconst_4        
	//   69  147:ldc1            #91  <String "zzwp">
	//   70  149:aastore         
	//   71  150:invokestatic    #94  <Method Object zza(zzdo, String, Object[])>
	//   72  153:areturn         
_L3:
		return ((Object) (new zza(((zzgf) (null)))));
	//   73  154:new             #12  <Class zzge$zzk$zza>
	//   74  157:dup             
	//   75  158:aconst_null     
	//   76  159:invokespecial   #97  <Method void zzge$zzk$zza(zzgf)>
	//   77  162:areturn         
_L2:
		return ((Object) (new zzge$zzk()));
	//   78  163:new             #2   <Class zzge$zzk>
	//   79  166:dup             
	//   80  167:invokespecial   #34  <Method void zzge$zzk()>
	//   81  170:areturn         
	}

	private static volatile zzdz zzbg;
	private static final zzge$zzk zzws;
	private int zzbb;
	private zzbb zzwo;
	private String zzwp;
	private zzcn zzwq;
	private boolean zzwr;

	static 
	{
		zzws = new zzge$zzk();
	//    0    0:new             #2   <Class zzge$zzk>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void zzge$zzk()>
	//    3    7:putstatic       #36  <Field zzge$zzk zzws>
		zzcg.zza(com/google/android/gms/internal/clearcut/zzge$zzk, ((zzcg) (zzws)));
	//    4   10:ldc1            #2   <Class zzge$zzk>
	//    5   12:getstatic       #36  <Field zzge$zzk zzws>
	//    6   15:invokestatic    #39  <Method void zzcg.zza(Class, zzcg)>
	//*   7   18:return          
	}

	private zzge$zzk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void zzcg()>
		zzwo = zzbb.zzfi;
	//    2    4:aload_0         
	//    3    5:getstatic       #46  <Field zzbb zzbb.zzfi>
	//    4    8:putfield        #48  <Field zzbb zzwo>
		zzwp = "";
	//    5   11:aload_0         
	//    6   12:ldc1            #50  <String "">
	//    7   14:putfield        #52  <Field String zzwp>
		zzwq = zzbb();
	//    8   17:aload_0         
	//    9   18:invokestatic    #55  <Method zzcn zzbb()>
	//   10   21:putfield        #57  <Field zzcn zzwq>
	//   11   24:return          
	}
}
