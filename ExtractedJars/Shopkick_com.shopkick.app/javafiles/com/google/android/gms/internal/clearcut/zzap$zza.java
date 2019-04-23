// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcg, zzdq, zzap, zzaq, 
//			zzdz, zzcj, zzar, zzck

public static final class zzap$zza extends zzcg
	implements zzdq
{
	public static final class zza extends zzcg.zza
		implements zzdq
	{

		private zza()
		{
			super(((zzcg) (zzap.zza.zzq())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #18  <Method zzap$zza zzap$zza.zzq()>
		//    2    4:invokespecial   #21  <Method void zzcg$zza(zzcg)>
		//    3    7:return          
		}

		zza(zzaq zzaq1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void zzap$zza$zza()>
		//    2    4:return          
		}
	}

	public static final class zzb extends Enum
		implements zzcj
	{

		public static zzb[] values()
		{
			return (zzb[])((zzb []) (zzew)).clone();
		//    0    0:getstatic       #44  <Field zzap$zza$zzb[] zzew>
		//    1    3:invokevirtual   #65  <Method Object _5B_Lcom.google.android.gms.internal.clearcut.zzap$zza$zzb_3B_.clone()>
		//    2    6:checkcast       #61  <Class zzap$zza$zzb[]>
		//    3    9:areturn         
		}

		public static zzck zzd()
		{
			return zzbq;
		//    0    0:getstatic       #50  <Field zzck zzbq>
		//    1    3:areturn         
		}

		public static zzb zze(int i)
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
				return zzev;
		//    4   30:getstatic       #42  <Field zzap$zza$zzb zzev>
		//    5   33:areturn         

			case 1: // '\001'
				return zzeu;
		//    6   34:getstatic       #38  <Field zzap$zza$zzb zzeu>
		//    7   37:areturn         

			case 0: // '\0'
				return zzet;
		//    8   38:getstatic       #34  <Field zzap$zza$zzb zzet>
		//    9   41:areturn         
			}
		}

		public final int zzc()
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field int value>
		//    2    4:ireturn         
		}

		private static final zzck zzbq = new zzar();
		private static final zzb zzet;
		private static final zzb zzeu;
		private static final zzb zzev;
		private static final zzb zzew[];
		private final int value;

		static 
		{
			zzet = new zzb("UNKNOWN", 0, 0);
		//    0    0:new             #2   <Class zzap$zza$zzb>
		//    1    3:dup             
		//    2    4:ldc1            #28  <String "UNKNOWN">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #32  <Method void zzap$zza$zzb(String, int, int)>
		//    6   11:putstatic       #34  <Field zzap$zza$zzb zzet>
			zzeu = new zzb("ON", 1, 1);
		//    7   14:new             #2   <Class zzap$zza$zzb>
		//    8   17:dup             
		//    9   18:ldc1            #36  <String "ON">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #32  <Method void zzap$zza$zzb(String, int, int)>
		//   13   25:putstatic       #38  <Field zzap$zza$zzb zzeu>
			zzev = new zzb("OFF", 2, 2);
		//   14   28:new             #2   <Class zzap$zza$zzb>
		//   15   31:dup             
		//   16   32:ldc1            #40  <String "OFF">
		//   17   34:iconst_2        
		//   18   35:iconst_2        
		//   19   36:invokespecial   #32  <Method void zzap$zza$zzb(String, int, int)>
		//   20   39:putstatic       #42  <Field zzap$zza$zzb zzev>
			zzew = (new zzb[] {
				zzet, zzeu, zzev
			});
		//   21   42:iconst_3        
		//   22   43:anewarray       zzb[]
		//   23   46:dup             
		//   24   47:iconst_0        
		//   25   48:getstatic       #34  <Field zzap$zza$zzb zzet>
		//   26   51:aastore         
		//   27   52:dup             
		//   28   53:iconst_1        
		//   29   54:getstatic       #38  <Field zzap$zza$zzb zzeu>
		//   30   57:aastore         
		//   31   58:dup             
		//   32   59:iconst_2        
		//   33   60:getstatic       #42  <Field zzap$zza$zzb zzev>
		//   34   63:aastore         
		//   35   64:putstatic       #44  <Field zzap$zza$zzb[] zzew>
		//   36   67:new             #46  <Class zzar>
		//   37   70:dup             
		//   38   71:invokespecial   #48  <Method void zzar()>
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


	static zzap$zza zzq()
	{
		return zzes;
	//    0    0:getstatic       #36  <Field zzap$zza zzes>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzaq.zzba[i - 1];
	//    0    0:getstatic       #50  <Field int[] zzaq.zzba>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 254
	//	               2 245
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 254
	//	               2 245
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
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #61  <Field zzdz zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/zzap$zza;
	//   19   71:ldc1            #2   <Class zzap$zza>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #61  <Field zzdz zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzcg$zzb(((zzcg) (zzes)))));
	//   27   84:new             #63  <Class zzcg$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #36  <Field zzap$zza zzes>
	//   30   91:invokespecial   #66  <Method void zzcg$zzb(zzcg)>
	//   31   94:astore_2        
		zzbg = ((zzdz) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #61  <Field zzdz zzbg>
_L12:
		com/google/android/gms/internal/clearcut/zzap$zza;
	//   34   99:ldc1            #2   <Class zzap$zza>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/zzap$zza;
	//   39  105:ldc1            #2   <Class zzap$zza>
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
		return ((Object) (zzes));
	//   45  112:getstatic       #36  <Field zzap$zza zzes>
	//   46  115:areturn         
_L4:
		obj = ((Object) (zzb.zzd()));
	//   47  116:invokestatic    #70  <Method zzck zzap$zza$zzb.zzd()>
	//   48  119:astore_2        
		obj1 = ((Object) (zzb.zzd()));
	//   49  120:invokestatic    #70  <Method zzck zzap$zza$zzb.zzd()>
	//   50  123:astore_3        
		zzck zzck = zzb.zzd();
	//   51  124:invokestatic    #70  <Method zzck zzap$zza$zzb.zzd()>
	//   52  127:astore          4
		zzck zzck1 = zzb.zzd();
	//   53  129:invokestatic    #70  <Method zzck zzap$zza$zzb.zzd()>
	//   54  132:astore          5
		zzck zzck2 = zzb.zzd();
	//   55  134:invokestatic    #70  <Method zzck zzap$zza$zzb.zzd()>
	//   56  137:astore          6
		zzck zzck3 = zzb.zzd();
	//   57  139:invokestatic    #70  <Method zzck zzap$zza$zzb.zzd()>
	//   58  142:astore          7
		zzck zzck4 = zzb.zzd();
	//   59  144:invokestatic    #70  <Method zzck zzap$zza$zzb.zzd()>
	//   60  147:astore          8
		return zza(((zzdo) (zzes)), "\001\007\000\001\001\007\007\b\000\000\000\001\f\000\002\f\001\003\f\002\004\f\003\005\f\004\006\f\005\007\f\006", new Object[] {
			"zzbb", "zzel", obj, "zzem", obj1, "zzen", zzck, "zzeo", zzck1, "zzep", 
			zzck2, "zzeq", zzck3, "zzer", zzck4
		});
	//   61  149:getstatic       #36  <Field zzap$zza zzes>
	//   62  152:ldc1            #72  <String "\001\007\000\001\001\007\007\b\000\000\000\001\f\000\002\f\001\003\f\002\004\f\003\005\f\004\006\f\005\007\f\006">
	//   63  154:bipush          15
	//   64  156:anewarray       Object[]
	//   65  159:dup             
	//   66  160:iconst_0        
	//   67  161:ldc1            #75  <String "zzbb">
	//   68  163:aastore         
	//   69  164:dup             
	//   70  165:iconst_1        
	//   71  166:ldc1            #76  <String "zzel">
	//   72  168:aastore         
	//   73  169:dup             
	//   74  170:iconst_2        
	//   75  171:aload_2         
	//   76  172:aastore         
	//   77  173:dup             
	//   78  174:iconst_3        
	//   79  175:ldc1            #77  <String "zzem">
	//   80  177:aastore         
	//   81  178:dup             
	//   82  179:iconst_4        
	//   83  180:aload_3         
	//   84  181:aastore         
	//   85  182:dup             
	//   86  183:iconst_5        
	//   87  184:ldc1            #78  <String "zzen">
	//   88  186:aastore         
	//   89  187:dup             
	//   90  188:bipush          6
	//   91  190:aload           4
	//   92  192:aastore         
	//   93  193:dup             
	//   94  194:bipush          7
	//   95  196:ldc1            #79  <String "zzeo">
	//   96  198:aastore         
	//   97  199:dup             
	//   98  200:bipush          8
	//   99  202:aload           5
	//  100  204:aastore         
	//  101  205:dup             
	//  102  206:bipush          9
	//  103  208:ldc1            #80  <String "zzep">
	//  104  210:aastore         
	//  105  211:dup             
	//  106  212:bipush          10
	//  107  214:aload           6
	//  108  216:aastore         
	//  109  217:dup             
	//  110  218:bipush          11
	//  111  220:ldc1            #81  <String "zzeq">
	//  112  222:aastore         
	//  113  223:dup             
	//  114  224:bipush          12
	//  115  226:aload           7
	//  116  228:aastore         
	//  117  229:dup             
	//  118  230:bipush          13
	//  119  232:ldc1            #82  <String "zzer">
	//  120  234:aastore         
	//  121  235:dup             
	//  122  236:bipush          14
	//  123  238:aload           8
	//  124  240:aastore         
	//  125  241:invokestatic    #85  <Method Object zza(zzdo, String, Object[])>
	//  126  244:areturn         
_L3:
		return ((Object) (new zza(((zzaq) (null)))));
	//  127  245:new             #12  <Class zzap$zza$zza>
	//  128  248:dup             
	//  129  249:aconst_null     
	//  130  250:invokespecial   #88  <Method void zzap$zza$zza(zzaq)>
	//  131  253:areturn         
_L2:
		return ((Object) (new zzap$zza()));
	//  132  254:new             #2   <Class zzap$zza>
	//  133  257:dup             
	//  134  258:invokespecial   #34  <Method void zzap$zza()>
	//  135  261:areturn         
	}

	private static volatile zzdz zzbg;
	private static final zzap$zza zzes;
	private int zzbb;
	private int zzel;
	private int zzem;
	private int zzen;
	private int zzeo;
	private int zzep;
	private int zzeq;
	private int zzer;

	static 
	{
		zzes = new zzap$zza();
	//    0    0:new             #2   <Class zzap$zza>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void zzap$zza()>
	//    3    7:putstatic       #36  <Field zzap$zza zzes>
		zzcg.zza(com/google/android/gms/internal/clearcut/zzap$zza, ((zzcg) (zzes)));
	//    4   10:ldc1            #2   <Class zzap$zza>
	//    5   12:getstatic       #36  <Field zzap$zza zzes>
	//    6   15:invokestatic    #39  <Method void zzcg.zza(Class, zzcg)>
	//*   7   18:return          
	}

	private zzap$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void zzcg()>
	//    2    4:return          
	}
}
