// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcg, zzdq, zzgt, zzgu, 
//			zzdz, zzcj, zzgv, zzck

public static final class zzgt$zza extends zzcg
	implements zzdq
{
	public static final class zza extends zzcg.zza
		implements zzdq
	{

		private zza()
		{
			super(((zzcg) (zzgt.zza.zzfr())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #18  <Method zzgt$zza zzgt$zza.zzfr()>
		//    2    4:invokespecial   #21  <Method void zzcg$zza(zzcg)>
		//    3    7:return          
		}

		zza(zzgu zzgu1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void zzgt$zza$zza()>
		//    2    4:return          
		}
	}

	public static final class zzb extends Enum
		implements zzcj
	{

		public static zzb[] values()
		{
			return (zzb[])((zzb []) (zzbip)).clone();
		//    0    0:getstatic       #44  <Field zzgt$zza$zzb[] zzbip>
		//    1    3:invokevirtual   #65  <Method Object _5B_Lcom.google.android.gms.internal.clearcut.zzgt$zza$zzb_3B_.clone()>
		//    2    6:checkcast       #61  <Class zzgt$zza$zzb[]>
		//    3    9:areturn         
		}

		public static zzb zzbe(int i)
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
				return zzbio;
		//    4   30:getstatic       #42  <Field zzgt$zza$zzb zzbio>
		//    5   33:areturn         

			case 1: // '\001'
				return zzbin;
		//    6   34:getstatic       #38  <Field zzgt$zza$zzb zzbin>
		//    7   37:areturn         

			case 0: // '\0'
				return zzbim;
		//    8   38:getstatic       #34  <Field zzgt$zza$zzb zzbim>
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

		private static final zzb zzbim;
		private static final zzb zzbin;
		private static final zzb zzbio;
		private static final zzb zzbip[];
		private static final zzck zzbq = new zzgv();
		private final int value;

		static 
		{
			zzbim = new zzb("NO_RESTRICTION", 0, 0);
		//    0    0:new             #2   <Class zzgt$zza$zzb>
		//    1    3:dup             
		//    2    4:ldc1            #28  <String "NO_RESTRICTION">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #32  <Method void zzgt$zza$zzb(String, int, int)>
		//    6   11:putstatic       #34  <Field zzgt$zza$zzb zzbim>
			zzbin = new zzb("SIDEWINDER_DEVICE", 1, 1);
		//    7   14:new             #2   <Class zzgt$zza$zzb>
		//    8   17:dup             
		//    9   18:ldc1            #36  <String "SIDEWINDER_DEVICE">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #32  <Method void zzgt$zza$zzb(String, int, int)>
		//   13   25:putstatic       #38  <Field zzgt$zza$zzb zzbin>
			zzbio = new zzb("LATCHSKY_DEVICE", 2, 2);
		//   14   28:new             #2   <Class zzgt$zza$zzb>
		//   15   31:dup             
		//   16   32:ldc1            #40  <String "LATCHSKY_DEVICE">
		//   17   34:iconst_2        
		//   18   35:iconst_2        
		//   19   36:invokespecial   #32  <Method void zzgt$zza$zzb(String, int, int)>
		//   20   39:putstatic       #42  <Field zzgt$zza$zzb zzbio>
			zzbip = (new zzb[] {
				zzbim, zzbin, zzbio
			});
		//   21   42:iconst_3        
		//   22   43:anewarray       zzb[]
		//   23   46:dup             
		//   24   47:iconst_0        
		//   25   48:getstatic       #34  <Field zzgt$zza$zzb zzbim>
		//   26   51:aastore         
		//   27   52:dup             
		//   28   53:iconst_1        
		//   29   54:getstatic       #38  <Field zzgt$zza$zzb zzbin>
		//   30   57:aastore         
		//   31   58:dup             
		//   32   59:iconst_2        
		//   33   60:getstatic       #42  <Field zzgt$zza$zzb zzbio>
		//   34   63:aastore         
		//   35   64:putstatic       #44  <Field zzgt$zza$zzb[] zzbip>
		//   36   67:new             #46  <Class zzgv>
		//   37   70:dup             
		//   38   71:invokespecial   #48  <Method void zzgv()>
		//   39   74:putstatic       #50  <Field zzck zzbq>
		//*  40   77:return          
		}

		private zzb(String s, int i, int j)
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


	static zzgt$zza zzfr()
	{
		return zzbil;
	//    0    0:getstatic       #27  <Field zzgt$zza zzbil>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzgu.zzba[i - 1];
	//    0    0:getstatic       #41  <Field int[] zzgu.zzba>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 135
	//	               2 126
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 135
	//	               2 126
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #43  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #44  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #50  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #52  <Field zzdz zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/zzgt$zza;
	//   19   71:ldc1            #2   <Class zzgt$zza>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #52  <Field zzdz zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzcg$zzb(((zzcg) (zzbil)))));
	//   27   84:new             #54  <Class zzcg$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #27  <Field zzgt$zza zzbil>
	//   30   91:invokespecial   #57  <Method void zzcg$zzb(zzcg)>
	//   31   94:astore_2        
		zzbg = ((zzdz) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #52  <Field zzdz zzbg>
_L12:
		com/google/android/gms/internal/clearcut/zzgt$zza;
	//   34   99:ldc1            #2   <Class zzgt$zza>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/zzgt$zza;
	//   39  105:ldc1            #2   <Class zzgt$zza>
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
		return ((Object) (zzbil));
	//   45  112:getstatic       #27  <Field zzgt$zza zzbil>
	//   46  115:areturn         
_L4:
		return zza(((zzdo) (zzbil)), "\001\0", ((Object []) (null)));
	//   47  116:getstatic       #27  <Field zzgt$zza zzbil>
	//   48  119:ldc1            #59  <String "\001\0">
	//   49  121:aconst_null     
	//   50  122:invokestatic    #62  <Method Object zza(zzdo, String, Object[])>
	//   51  125:areturn         
_L3:
		return ((Object) (new zza(((zzgu) (null)))));
	//   52  126:new             #12  <Class zzgt$zza$zza>
	//   53  129:dup             
	//   54  130:aconst_null     
	//   55  131:invokespecial   #65  <Method void zzgt$zza$zza(zzgu)>
	//   56  134:areturn         
_L2:
		return ((Object) (new zzgt$zza()));
	//   57  135:new             #2   <Class zzgt$zza>
	//   58  138:dup             
	//   59  139:invokespecial   #25  <Method void zzgt$zza()>
	//   60  142:areturn         
	}

	private static volatile zzdz zzbg;
	private static final zzgt$zza zzbil;

	static 
	{
		zzbil = new zzgt$zza();
	//    0    0:new             #2   <Class zzgt$zza>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void zzgt$zza()>
	//    3    7:putstatic       #27  <Field zzgt$zza zzbil>
		zzcg.zza(com/google/android/gms/internal/clearcut/zzgt$zza, ((zzcg) (zzbil)));
	//    4   10:ldc1            #2   <Class zzgt$zza>
	//    5   12:getstatic       #27  <Field zzgt$zza zzbil>
	//    6   15:invokestatic    #30  <Method void zzcg.zza(Class, zzcg)>
	//*   7   18:return          
	}

	private zzgt$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void zzcg()>
	//    2    4:return          
	}
}
