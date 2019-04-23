// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcg, zzdq, zzge, zzgf, 
//			zzdz, zzcj, zzgi, zzck

public static final class zzge$zzj extends zzcg
	implements zzdq
{
	public static final class zza extends Enum
		implements zzcj
	{

		public static zza[] values()
		{
			return (zza[])((zza []) (zzwn)).clone();
		//    0    0:getstatic       #44  <Field zzge$zzj$zza[] zzwn>
		//    1    3:invokevirtual   #65  <Method Object _5B_Lcom.google.android.gms.internal.clearcut.zzge$zzj$zza_3B_.clone()>
		//    2    6:checkcast       #61  <Class zzge$zzj$zza[]>
		//    3    9:areturn         
		}

		public static zza zzat(int i)
		{
			switch(i)
		//*   0    0:iload_0         
			{
		//*   1    1:tableswitch     0 2: default 28
		//		               0 38
		//		               1 34
		//		               2 30
			default:
				return null;
		//    2   28:aconst_null     
		//    3   29:areturn         

			case 2: // '\002'
				return zzwm;
		//    4   30:getstatic       #42  <Field zzge$zzj$zza zzwm>
		//    5   33:areturn         

			case 1: // '\001'
				return zzwl;
		//    6   34:getstatic       #38  <Field zzge$zzj$zza zzwl>
		//    7   37:areturn         

			case 0: // '\0'
				return zzwk;
		//    8   38:getstatic       #34  <Field zzge$zzj$zza zzwk>
		//    9   41:areturn         
			}
		}

		public static zzck zzd()
		{
			return zzbq;
		//    0    0:getstatic       #50  <Field zzck zzbq>
		//    1    3:areturn         
		}

		public final int zzc()
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field int value>
		//    2    4:ireturn         
		}

		private static final zzck zzbq = new zzgi();
		private static final zza zzwk;
		private static final zza zzwl;
		private static final zza zzwm;
		private static final zza zzwn[];
		private final int value;

		static 
		{
			zzwk = new zza("UNKNOWN", 0, 0);
		//    0    0:new             #2   <Class zzge$zzj$zza>
		//    1    3:dup             
		//    2    4:ldc1            #28  <String "UNKNOWN">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #32  <Method void zzge$zzj$zza(String, int, int)>
		//    6   11:putstatic       #34  <Field zzge$zzj$zza zzwk>
			zzwl = new zza("AUTO_TIME_OFF", 1, 1);
		//    7   14:new             #2   <Class zzge$zzj$zza>
		//    8   17:dup             
		//    9   18:ldc1            #36  <String "AUTO_TIME_OFF">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #32  <Method void zzge$zzj$zza(String, int, int)>
		//   13   25:putstatic       #38  <Field zzge$zzj$zza zzwl>
			zzwm = new zza("AUTO_TIME_ON", 2, 2);
		//   14   28:new             #2   <Class zzge$zzj$zza>
		//   15   31:dup             
		//   16   32:ldc1            #40  <String "AUTO_TIME_ON">
		//   17   34:iconst_2        
		//   18   35:iconst_2        
		//   19   36:invokespecial   #32  <Method void zzge$zzj$zza(String, int, int)>
		//   20   39:putstatic       #42  <Field zzge$zzj$zza zzwm>
			zzwn = (new zza[] {
				zzwk, zzwl, zzwm
			});
		//   21   42:iconst_3        
		//   22   43:anewarray       zza[]
		//   23   46:dup             
		//   24   47:iconst_0        
		//   25   48:getstatic       #34  <Field zzge$zzj$zza zzwk>
		//   26   51:aastore         
		//   27   52:dup             
		//   28   53:iconst_1        
		//   29   54:getstatic       #38  <Field zzge$zzj$zza zzwl>
		//   30   57:aastore         
		//   31   58:dup             
		//   32   59:iconst_2        
		//   33   60:getstatic       #42  <Field zzge$zzj$zza zzwm>
		//   34   63:aastore         
		//   35   64:putstatic       #44  <Field zzge$zzj$zza[] zzwn>
		//   36   67:new             #46  <Class zzgi>
		//   37   70:dup             
		//   38   71:invokespecial   #48  <Method void zzgi()>
		//   39   74:putstatic       #50  <Field zzck zzbq>
		//*  40   77:return          
		}

		private zza(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #54  <Method void Enum(String, int)>
			value = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #56  <Field int value>
		//    7   11:return          
		}
	}

	public static final class zzb extends zzcg.zza
		implements zzdq
	{

		private zzb()
		{
			super(((zzcg) (zzge.zzj.zzfc())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #19  <Method zzge$zzj zzge$zzj.zzfc()>
		//    2    4:invokespecial   #22  <Method void zzcg$zza(zzcg)>
		//    3    7:return          
		}

		zzb(zzgf zzgf1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void zzge$zzj$zzb()>
		//    2    4:return          
		}
	}


	static zzge$zzj zzfc()
	{
		return zzwj;
	//    0    0:getstatic       #35  <Field zzge$zzj zzwj>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzgf.zzba[i - 1];
	//    0    0:getstatic       #49  <Field int[] zzgf.zzba>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 172
	//	               2 163
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 172
	//	               2 163
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #51  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #52  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #58  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #60  <Field zzdz zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/zzge$zzj;
	//   19   71:ldc1            #2   <Class zzge$zzj>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #60  <Field zzdz zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzcg$zzb(((zzcg) (zzwj)))));
	//   27   84:new             #62  <Class zzcg$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #35  <Field zzge$zzj zzwj>
	//   30   91:invokespecial   #65  <Method void zzcg$zzb(zzcg)>
	//   31   94:astore_2        
		zzbg = ((zzdz) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #60  <Field zzdz zzbg>
_L12:
		com/google/android/gms/internal/clearcut/zzge$zzj;
	//   34   99:ldc1            #2   <Class zzge$zzj>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/zzge$zzj;
	//   39  105:ldc1            #2   <Class zzge$zzj>
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
		return ((Object) (zzwj));
	//   45  112:getstatic       #35  <Field zzge$zzj zzwj>
	//   46  115:areturn         
_L4:
		obj = ((Object) (zza.zzd()));
	//   47  116:invokestatic    #69  <Method zzck zzge$zzj$zza.zzd()>
	//   48  119:astore_2        
		return zza(((zzdo) (zzwj)), "\001\004\000\001\001\004\004\005\000\000\000\001\007\000\002\007\001\003\f\002\004\007\003", new Object[] {
			"zzbb", "zzwf", "zzwg", "zzwh", obj, "zzwi"
		});
	//   49  120:getstatic       #35  <Field zzge$zzj zzwj>
	//   50  123:ldc1            #71  <String "\001\004\000\001\001\004\004\005\000\000\000\001\007\000\002\007\001\003\f\002\004\007\003">
	//   51  125:bipush          6
	//   52  127:anewarray       Object[]
	//   53  130:dup             
	//   54  131:iconst_0        
	//   55  132:ldc1            #74  <String "zzbb">
	//   56  134:aastore         
	//   57  135:dup             
	//   58  136:iconst_1        
	//   59  137:ldc1            #75  <String "zzwf">
	//   60  139:aastore         
	//   61  140:dup             
	//   62  141:iconst_2        
	//   63  142:ldc1            #76  <String "zzwg">
	//   64  144:aastore         
	//   65  145:dup             
	//   66  146:iconst_3        
	//   67  147:ldc1            #77  <String "zzwh">
	//   68  149:aastore         
	//   69  150:dup             
	//   70  151:iconst_4        
	//   71  152:aload_2         
	//   72  153:aastore         
	//   73  154:dup             
	//   74  155:iconst_5        
	//   75  156:ldc1            #78  <String "zzwi">
	//   76  158:aastore         
	//   77  159:invokestatic    #81  <Method Object zza(zzdo, String, Object[])>
	//   78  162:areturn         
_L3:
		return ((Object) (new zzb(((zzgf) (null)))));
	//   79  163:new             #15  <Class zzge$zzj$zzb>
	//   80  166:dup             
	//   81  167:aconst_null     
	//   82  168:invokespecial   #84  <Method void zzge$zzj$zzb(zzgf)>
	//   83  171:areturn         
_L2:
		return ((Object) (new zzge$zzj()));
	//   84  172:new             #2   <Class zzge$zzj>
	//   85  175:dup             
	//   86  176:invokespecial   #33  <Method void zzge$zzj()>
	//   87  179:areturn         
	}

	private static volatile zzdz zzbg;
	private static final zzge$zzj zzwj;
	private int zzbb;
	private boolean zzwf;
	private boolean zzwg;
	private int zzwh;
	private boolean zzwi;

	static 
	{
		zzwj = new zzge$zzj();
	//    0    0:new             #2   <Class zzge$zzj>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void zzge$zzj()>
	//    3    7:putstatic       #35  <Field zzge$zzj zzwj>
		zzcg.zza(com/google/android/gms/internal/clearcut/zzge$zzj, ((zzcg) (zzwj)));
	//    4   10:ldc1            #2   <Class zzge$zzj>
	//    5   12:getstatic       #35  <Field zzge$zzj zzwj>
	//    6   15:invokestatic    #38  <Method void zzcg.zza(Class, zzcg)>
	//*   7   18:return          
	}

	private zzge$zzj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void zzcg()>
	//    2    4:return          
	}
}
