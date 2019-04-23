// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcg, zzdq, zzge, zzgf, 
//			zzdz, zzcj, zzgr, zzck

public static final class zzge$zzv extends zzcg
	implements zzdq
{
	public static final class zza extends zzcg.zza
		implements zzdq
	{

		private zza()
		{
			super(((zzcg) (zzge.zzv.zzfo())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #19  <Method zzge$zzv zzge$zzv.zzfo()>
		//    2    4:invokespecial   #22  <Method void zzcg$zza(zzcg)>
		//    3    7:return          
		}

		zza(zzgf zzgf1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void zzge$zzv$zza()>
		//    2    4:return          
		}
	}

	public static final class zzb extends Enum
		implements zzcj
	{

		public static zzb[] values()
		{
			return (zzb[])((zzb []) (zzbhp)).clone();
		//    0    0:getstatic       #54  <Field zzge$zzv$zzb[] zzbhp>
		//    1    3:invokevirtual   #75  <Method Object _5B_Lcom.google.android.gms.internal.clearcut.zzge$zzv$zzb_3B_.clone()>
		//    2    6:checkcast       #71  <Class zzge$zzv$zzb[]>
		//    3    9:areturn         
		}

		public static zzb zzbc(int i)
		{
			switch(i)
		//*   0    0:iload_0         
			{
		//*   1    1:tableswitch     0 4: default 36
		//		               0 54
		//		               1 50
		//		               2 46
		//		               3 42
		//		               4 38
			default:
				return null;
		//    2   36:aconst_null     
		//    3   37:areturn         

			case 4: // '\004'
				return zzbho;
		//    4   38:getstatic       #52  <Field zzge$zzv$zzb zzbho>
		//    5   41:areturn         

			case 3: // '\003'
				return zzbhn;
		//    6   42:getstatic       #48  <Field zzge$zzv$zzb zzbhn>
		//    7   45:areturn         

			case 2: // '\002'
				return zzbhm;
		//    8   46:getstatic       #44  <Field zzge$zzv$zzb zzbhm>
		//    9   49:areturn         

			case 1: // '\001'
				return zzbhl;
		//   10   50:getstatic       #40  <Field zzge$zzv$zzb zzbhl>
		//   11   53:areturn         

			case 0: // '\0'
				return zzbhk;
		//   12   54:getstatic       #36  <Field zzge$zzv$zzb zzbhk>
		//   13   57:areturn         
			}
		}

		public static zzck zzd()
		{
			return zzbq;
		//    0    0:getstatic       #60  <Field zzck zzbq>
		//    1    3:areturn         
		}

		public final int zzc()
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #66  <Field int value>
		//    2    4:ireturn         
		}

		public static final zzb zzbhk;
		private static final zzb zzbhl;
		private static final zzb zzbhm;
		private static final zzb zzbhn;
		private static final zzb zzbho;
		private static final zzb zzbhp[];
		private static final zzck zzbq = new zzgr();
		private final int value;

		static 
		{
			zzbhk = new zzb("DEFAULT", 0, 0);
		//    0    0:new             #2   <Class zzge$zzv$zzb>
		//    1    3:dup             
		//    2    4:ldc1            #30  <String "DEFAULT">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #34  <Method void zzge$zzv$zzb(String, int, int)>
		//    6   11:putstatic       #36  <Field zzge$zzv$zzb zzbhk>
			zzbhl = new zzb("UNMETERED_ONLY", 1, 1);
		//    7   14:new             #2   <Class zzge$zzv$zzb>
		//    8   17:dup             
		//    9   18:ldc1            #38  <String "UNMETERED_ONLY">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #34  <Method void zzge$zzv$zzb(String, int, int)>
		//   13   25:putstatic       #40  <Field zzge$zzv$zzb zzbhl>
			zzbhm = new zzb("UNMETERED_OR_DAILY", 2, 2);
		//   14   28:new             #2   <Class zzge$zzv$zzb>
		//   15   31:dup             
		//   16   32:ldc1            #42  <String "UNMETERED_OR_DAILY">
		//   17   34:iconst_2        
		//   18   35:iconst_2        
		//   19   36:invokespecial   #34  <Method void zzge$zzv$zzb(String, int, int)>
		//   20   39:putstatic       #44  <Field zzge$zzv$zzb zzbhm>
			zzbhn = new zzb("FAST_IF_RADIO_AWAKE", 3, 3);
		//   21   42:new             #2   <Class zzge$zzv$zzb>
		//   22   45:dup             
		//   23   46:ldc1            #46  <String "FAST_IF_RADIO_AWAKE">
		//   24   48:iconst_3        
		//   25   49:iconst_3        
		//   26   50:invokespecial   #34  <Method void zzge$zzv$zzb(String, int, int)>
		//   27   53:putstatic       #48  <Field zzge$zzv$zzb zzbhn>
			zzbho = new zzb("NEVER", 4, 4);
		//   28   56:new             #2   <Class zzge$zzv$zzb>
		//   29   59:dup             
		//   30   60:ldc1            #50  <String "NEVER">
		//   31   62:iconst_4        
		//   32   63:iconst_4        
		//   33   64:invokespecial   #34  <Method void zzge$zzv$zzb(String, int, int)>
		//   34   67:putstatic       #52  <Field zzge$zzv$zzb zzbho>
			zzbhp = (new zzb[] {
				zzbhk, zzbhl, zzbhm, zzbhn, zzbho
			});
		//   35   70:iconst_5        
		//   36   71:anewarray       zzb[]
		//   37   74:dup             
		//   38   75:iconst_0        
		//   39   76:getstatic       #36  <Field zzge$zzv$zzb zzbhk>
		//   40   79:aastore         
		//   41   80:dup             
		//   42   81:iconst_1        
		//   43   82:getstatic       #40  <Field zzge$zzv$zzb zzbhl>
		//   44   85:aastore         
		//   45   86:dup             
		//   46   87:iconst_2        
		//   47   88:getstatic       #44  <Field zzge$zzv$zzb zzbhm>
		//   48   91:aastore         
		//   49   92:dup             
		//   50   93:iconst_3        
		//   51   94:getstatic       #48  <Field zzge$zzv$zzb zzbhn>
		//   52   97:aastore         
		//   53   98:dup             
		//   54   99:iconst_4        
		//   55  100:getstatic       #52  <Field zzge$zzv$zzb zzbho>
		//   56  103:aastore         
		//   57  104:putstatic       #54  <Field zzge$zzv$zzb[] zzbhp>
		//   58  107:new             #56  <Class zzgr>
		//   59  110:dup             
		//   60  111:invokespecial   #58  <Method void zzgr()>
		//   61  114:putstatic       #60  <Field zzck zzbq>
		//*  62  117:return          
		}

		private zzb(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #64  <Method void Enum(String, int)>
			value = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #66  <Field int value>
		//    7   11:return          
		}
	}


	static zzge$zzv zzfo()
	{
		return zzbhj;
	//    0    0:getstatic       #34  <Field zzge$zzv zzbhj>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzgf.zzba[i - 1];
	//    0    0:getstatic       #54  <Field int[] zzgf.zzba>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 175
	//	               2 166
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 175
	//	               2 166
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #56  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #57  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #63  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #65  <Field zzdz zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/zzge$zzv;
	//   19   71:ldc1            #2   <Class zzge$zzv>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #65  <Field zzdz zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzcg$zzb(((zzcg) (zzbhj)))));
	//   27   84:new             #67  <Class zzcg$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #34  <Field zzge$zzv zzbhj>
	//   30   91:invokespecial   #70  <Method void zzcg$zzb(zzcg)>
	//   31   94:astore_2        
		zzbg = ((zzdz) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #65  <Field zzdz zzbg>
_L12:
		com/google/android/gms/internal/clearcut/zzge$zzv;
	//   34   99:ldc1            #2   <Class zzge$zzv>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/zzge$zzv;
	//   39  105:ldc1            #2   <Class zzge$zzv>
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
		return ((Object) (zzbhj));
	//   45  112:getstatic       #34  <Field zzge$zzv zzbhj>
	//   46  115:areturn         
_L4:
		obj = ((Object) (zzb.zzd()));
	//   47  116:invokestatic    #74  <Method zzck zzge$zzv$zzb.zzd()>
	//   48  119:astore_2        
		obj1 = ((Object) (com.google.android.gms.internal.clearcut.zzb.zzd()));
	//   49  120:invokestatic    #77  <Method zzck zzge$zzq$zzb.zzd()>
	//   50  123:astore_3        
		return zza(((zzdo) (zzbhj)), "\001\003\000\001\001\003\003\004\000\000\000\001\b\000\002\f\001\003\f\002", new Object[] {
			"zzbb", "zzzh", "zzzm", obj, "zzzg", obj1
		});
	//   51  124:getstatic       #34  <Field zzge$zzv zzbhj>
	//   52  127:ldc1            #79  <String "\001\003\000\001\001\003\003\004\000\000\000\001\b\000\002\f\001\003\f\002">
	//   53  129:bipush          6
	//   54  131:anewarray       Object[]
	//   55  134:dup             
	//   56  135:iconst_0        
	//   57  136:ldc1            #82  <String "zzbb">
	//   58  138:aastore         
	//   59  139:dup             
	//   60  140:iconst_1        
	//   61  141:ldc1            #83  <String "zzzh">
	//   62  143:aastore         
	//   63  144:dup             
	//   64  145:iconst_2        
	//   65  146:ldc1            #84  <String "zzzm">
	//   66  148:aastore         
	//   67  149:dup             
	//   68  150:iconst_3        
	//   69  151:aload_2         
	//   70  152:aastore         
	//   71  153:dup             
	//   72  154:iconst_4        
	//   73  155:ldc1            #85  <String "zzzg">
	//   74  157:aastore         
	//   75  158:dup             
	//   76  159:iconst_5        
	//   77  160:aload_3         
	//   78  161:aastore         
	//   79  162:invokestatic    #88  <Method Object zza(zzdo, String, Object[])>
	//   80  165:areturn         
_L3:
		return ((Object) (new zza(((zzgf) (null)))));
	//   81  166:new             #12  <Class zzge$zzv$zza>
	//   82  169:dup             
	//   83  170:aconst_null     
	//   84  171:invokespecial   #91  <Method void zzge$zzv$zza(zzgf)>
	//   85  174:areturn         
_L2:
		return ((Object) (new zzge$zzv()));
	//   86  175:new             #2   <Class zzge$zzv>
	//   87  178:dup             
	//   88  179:invokespecial   #32  <Method void zzge$zzv()>
	//   89  182:areturn         
	}

	private static volatile zzdz zzbg;
	private static final zzge$zzv zzbhj;
	private int zzbb;
	private int zzzg;
	private String zzzh;
	private int zzzm;

	static 
	{
		zzbhj = new zzge$zzv();
	//    0    0:new             #2   <Class zzge$zzv>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void zzge$zzv()>
	//    3    7:putstatic       #34  <Field zzge$zzv zzbhj>
		zzcg.zza(com/google/android/gms/internal/clearcut/zzge$zzv, ((zzcg) (zzbhj)));
	//    4   10:ldc1            #2   <Class zzge$zzv>
	//    5   12:getstatic       #34  <Field zzge$zzv zzbhj>
	//    6   15:invokestatic    #37  <Method void zzcg.zza(Class, zzcg)>
	//*   7   18:return          
	}

	private zzge$zzv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void zzcg()>
		zzzh = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #41  <String "">
	//    4    7:putfield        #43  <Field String zzzh>
		zzzg = -1;
	//    5   10:aload_0         
	//    6   11:iconst_m1       
	//    7   12:putfield        #45  <Field int zzzg>
	//    8   15:return          
	}
}
