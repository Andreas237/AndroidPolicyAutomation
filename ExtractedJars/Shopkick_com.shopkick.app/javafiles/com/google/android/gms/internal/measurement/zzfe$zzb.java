// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzuo, zzvx, zzfe, zzwf, 
//			zzuu, zzff, zzur, zzfg, 
//			zzfh, zzus, zzut

public static final class zzfe$zzb extends zzuo
	implements zzvx
{
	public static final class zza extends zzuo.zza
		implements zzvx
	{

		public final zza zzb(zzfe.zza zza1)
		{
			((zzuo.zza)this).zzwk();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #30  <Method void zzuo$zza.zzwk()>
			zzfe.zzb.zza((zzfe.zzb)zzbyh, zza1);
		//    2    4:aload_0         
		//    3    5:getfield        #34  <Field zzuo zzbyh>
		//    4    8:checkcast       #9   <Class zzfe$zzb>
		//    5   11:aload_1         
		//    6   12:invokestatic    #37  <Method void zzfe$zzb.zza(zzfe$zzb, zzfe$zza)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		private zza()
		{
			super(((zzuo) (zzfe.zzb.zzmq())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #19  <Method zzfe$zzb zzfe$zzb.zzmq()>
		//    2    4:invokespecial   #22  <Method void zzuo$zza(zzuo)>
		//    3    7:return          
		}

		zza(zzff zzff1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void zzfe$zzb$zza()>
		//    2    4:return          
		}
	}

	public static final class zzb extends Enum
		implements zzur
	{

		public static zzb[] values()
		{
			return (zzb[])((zzb []) (zzavc)).clone();
		//    0    0:getstatic       #38  <Field zzfe$zzb$zzb[] zzavc>
		//    1    3:invokevirtual   #59  <Method Object _5B_Lcom.google.android.gms.internal.measurement.zzfe$zzb$zzb_3B_.clone()>
		//    2    6:checkcast       #55  <Class zzfe$zzb$zzb[]>
		//    3    9:areturn         
		}

		public static zzut zzd()
		{
			return zzfh.zzoc;
		//    0    0:getstatic       #67  <Field zzut zzfh.zzoc>
		//    1    3:areturn         
		}

		public static zzb zzt(int i)
		{
			switch(i)
		//*   0    0:iload_0         
			{
		//*   1    1:tableswitch     1 2: default 24
		//		               1 30
		//		               2 26
			default:
				return null;
		//    2   24:aconst_null     
		//    3   25:areturn         

			case 2: // '\002'
				return zzavb;
		//    4   26:getstatic       #36  <Field zzfe$zzb$zzb zzavb>
		//    5   29:areturn         

			case 1: // '\001'
				return zzava;
		//    6   30:getstatic       #32  <Field zzfe$zzb$zzb zzava>
		//    7   33:areturn         
			}
		}

		public final int zzc()
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field int value>
		//    2    4:ireturn         
		}

		private static final zzb zzava;
		private static final zzb zzavb;
		private static final zzb zzavc[];
		private static final zzus zzoa = new zzfg();
		private final int value;

		static 
		{
			zzava = new zzb("RADS", 0, 1);
		//    0    0:new             #2   <Class zzfe$zzb$zzb>
		//    1    3:dup             
		//    2    4:ldc1            #26  <String "RADS">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:invokespecial   #30  <Method void zzfe$zzb$zzb(String, int, int)>
		//    6   11:putstatic       #32  <Field zzfe$zzb$zzb zzava>
			zzavb = new zzb("PROVISIONING", 1, 2);
		//    7   14:new             #2   <Class zzfe$zzb$zzb>
		//    8   17:dup             
		//    9   18:ldc1            #34  <String "PROVISIONING">
		//   10   20:iconst_1        
		//   11   21:iconst_2        
		//   12   22:invokespecial   #30  <Method void zzfe$zzb$zzb(String, int, int)>
		//   13   25:putstatic       #36  <Field zzfe$zzb$zzb zzavb>
			zzavc = (new zzb[] {
				zzava, zzavb
			});
		//   14   28:iconst_2        
		//   15   29:anewarray       zzb[]
		//   16   32:dup             
		//   17   33:iconst_0        
		//   18   34:getstatic       #32  <Field zzfe$zzb$zzb zzava>
		//   19   37:aastore         
		//   20   38:dup             
		//   21   39:iconst_1        
		//   22   40:getstatic       #36  <Field zzfe$zzb$zzb zzavb>
		//   23   43:aastore         
		//   24   44:putstatic       #38  <Field zzfe$zzb$zzb[] zzavc>
		//   25   47:new             #40  <Class zzfg>
		//   26   50:dup             
		//   27   51:invokespecial   #42  <Method void zzfg()>
		//   28   54:putstatic       #44  <Field zzus zzoa>
		//*  29   57:return          
		}

		private zzb(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #48  <Method void Enum(String, int)>
			value = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #50  <Field int value>
		//    7   11:return          
		}
	}


	public static zzwf zza()
	{
		return (zzwf)((zzuo) (zzauz)).zza(zzuo$zze.zzbyq, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #33  <Field zzfe$zzb zzauz>
	//    1    3:getstatic       #52  <Field int zzuo$zze.zzbyq>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #55  <Method Object zzuo.zza(int, Object, Object)>
	//    5   11:checkcast       #57  <Class zzwf>
	//    6   14:areturn         
	}

	private final void zza(zzfe$zza zzfe$zza1)
	{
		if(zzfe$zza1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          65
		{
			if(!zzauy.zztz())
	//*   2    4:aload_0         
	//*   3    5:getfield        #46  <Field zzuu zzauy>
	//*   4    8:invokeinterface #66  <Method boolean zzuu.zztz()>
	//*   5   13:ifne            53
			{
				zzuu zzuu1 = zzauy;
	//    6   16:aload_0         
	//    7   17:getfield        #46  <Field zzuu zzauy>
	//    8   20:astore_3        
				int i = zzuu1.size();
	//    9   21:aload_3         
	//   10   22:invokeinterface #70  <Method int zzuu.size()>
	//   11   27:istore_2        
				if(i == 0)
	//*  12   28:iload_2         
	//*  13   29:ifne            38
					i = 10;
	//   14   32:bipush          10
	//   15   34:istore_2        
				else
	//*  16   35:goto            42
					i <<= 1;
	//   17   38:iload_2         
	//   18   39:iconst_1        
	//   19   40:ishl            
	//   20   41:istore_2        
				zzauy = zzuu1.zzal(i);
	//   21   42:aload_0         
	//   22   43:aload_3         
	//   23   44:iload_2         
	//   24   45:invokeinterface #74  <Method zzuu zzuu.zzal(int)>
	//   25   50:putfield        #46  <Field zzuu zzauy>
			}
			zzauy.add(((Object) (zzfe$zza1)));
	//   26   53:aload_0         
	//   27   54:getfield        #46  <Field zzuu zzauy>
	//   28   57:aload_1         
	//   29   58:invokeinterface #78  <Method boolean zzuu.add(Object)>
	//   30   63:pop             
			return;
	//   31   64:return          
		} else
		{
			throw new NullPointerException();
	//   32   65:new             #80  <Class NullPointerException>
	//   33   68:dup             
	//   34   69:invokespecial   #81  <Method void NullPointerException()>
	//   35   72:athrow          
		}
	}

	static void zza(zzfe$zzb zzfe$zzb1, zzfe$zza zzfe$zza1)
	{
		zzfe$zzb1.zza(zzfe$zza1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #84  <Method void zza(zzfe$zza)>
	//    3    5:return          
	}

	public static zza zzmp()
	{
		return (zza)(zzuo$zza)((zzuo) (zzauz)).zza(zzuo$zze.zzbyo, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #33  <Field zzfe$zzb zzauz>
	//    1    3:getstatic       #89  <Field int zzuo$zze.zzbyo>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #55  <Method Object zzuo.zza(int, Object, Object)>
	//    5   11:checkcast       #91  <Class zzuo$zza>
	//    6   14:checkcast       #12  <Class zzfe$zzb$zza>
	//    7   17:areturn         
	}

	static zzfe$zzb zzmq()
	{
		return zzauz;
	//    0    0:getstatic       #33  <Field zzfe$zzb zzauz>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzff.zznq[i - 1];
	//    0    0:getstatic       #99  <Field int[] zzff.zznq>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 166
	//	               2 157
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 166
	//	               2 157
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #101 <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #102 <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #108 <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zznw));
	//   15   63:getstatic       #110 <Field zzwf zznw>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/measurement/zzfe$zzb;
	//   19   71:ldc1            #2   <Class zzfe$zzb>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zznw));
	//   21   74:getstatic       #110 <Field zzwf zznw>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzuo$zzb(((zzuo) (zzauz)))));
	//   27   84:new             #112 <Class zzuo$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #33  <Field zzfe$zzb zzauz>
	//   30   91:invokespecial   #115 <Method void zzuo$zzb(zzuo)>
	//   31   94:astore_2        
		zznw = ((zzwf) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #110 <Field zzwf zznw>
_L12:
		com/google/android/gms/internal/measurement/zzfe$zzb;
	//   34   99:ldc1            #2   <Class zzfe$zzb>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/measurement/zzfe$zzb;
	//   39  105:ldc1            #2   <Class zzfe$zzb>
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
		return ((Object) (zzauz));
	//   45  112:getstatic       #33  <Field zzfe$zzb zzauz>
	//   46  115:areturn         
_L4:
		obj = ((Object) (zzb.zzd()));
	//   47  116:invokestatic    #119 <Method zzut zzfe$zzb$zzb.zzd()>
	//   48  119:astore_2        
		return zza(((zzvv) (zzauz)), "\001\002\000\001\001\002\002\000\001\000\001\f\000\002\033", new Object[] {
			"zznr", "zzaux", obj, "zzauy", com/google/android/gms/internal/measurement/zzfe$zza
		});
	//   49  120:getstatic       #33  <Field zzfe$zzb zzauz>
	//   50  123:ldc1            #121 <String "\001\002\000\001\001\002\002\000\001\000\001\f\000\002\033">
	//   51  125:iconst_5        
	//   52  126:anewarray       Object[]
	//   53  129:dup             
	//   54  130:iconst_0        
	//   55  131:ldc1            #124 <String "zznr">
	//   56  133:aastore         
	//   57  134:dup             
	//   58  135:iconst_1        
	//   59  136:ldc1            #125 <String "zzaux">
	//   60  138:aastore         
	//   61  139:dup             
	//   62  140:iconst_2        
	//   63  141:aload_2         
	//   64  142:aastore         
	//   65  143:dup             
	//   66  144:iconst_3        
	//   67  145:ldc1            #126 <String "zzauy">
	//   68  147:aastore         
	//   69  148:dup             
	//   70  149:iconst_4        
	//   71  150:ldc1            #128 <Class zzfe$zza>
	//   72  152:aastore         
	//   73  153:invokestatic    #131 <Method Object zza(zzvv, String, Object[])>
	//   74  156:areturn         
_L3:
		return ((Object) (new zza(((zzff) (null)))));
	//   75  157:new             #12  <Class zzfe$zzb$zza>
	//   76  160:dup             
	//   77  161:aconst_null     
	//   78  162:invokespecial   #134 <Method void zzfe$zzb$zza(zzff)>
	//   79  165:areturn         
_L2:
		return ((Object) (new zzfe$zzb()));
	//   80  166:new             #2   <Class zzfe$zzb>
	//   81  169:dup             
	//   82  170:invokespecial   #31  <Method void zzfe$zzb()>
	//   83  173:areturn         
	}

	private static final zzfe$zzb zzauz;
	private static volatile zzwf zznw;
	private int zzaux;
	private zzuu zzauy;
	private int zznr;

	static 
	{
		zzauz = new zzfe$zzb();
	//    0    0:new             #2   <Class zzfe$zzb>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void zzfe$zzb()>
	//    3    7:putstatic       #33  <Field zzfe$zzb zzauz>
		zzuo.zza(com/google/android/gms/internal/measurement/zzfe$zzb, ((zzuo) (zzauz)));
	//    4   10:ldc1            #2   <Class zzfe$zzb>
	//    5   12:getstatic       #33  <Field zzfe$zzb zzauz>
	//    6   15:invokestatic    #36  <Method void zzuo.zza(Class, zzuo)>
	//*   7   18:return          
	}

	private zzfe$zzb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void zzuo()>
		zzaux = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #40  <Field int zzaux>
		zzauy = zzwg();
	//    5    9:aload_0         
	//    6   10:invokestatic    #44  <Method zzuu zzwg()>
	//    7   13:putfield        #46  <Field zzuu zzauy>
	//    8   16:return          
	}
}
