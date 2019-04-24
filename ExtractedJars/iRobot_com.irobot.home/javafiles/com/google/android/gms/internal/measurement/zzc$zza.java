// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzuo, zzvx, zzc, zzwf, 
//			zzd, zzur, zze, zzf, 
//			zzus, zzut

public static final class zzc$zza extends zzuo
	implements zzvx
{
	public static final class zza extends zzuo.zza
		implements zzvx
	{

		private zza()
		{
			super(((zzuo) (zzc.zza.zzb())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #18  <Method zzc$zza zzc$zza.zzb()>
		//    2    4:invokespecial   #21  <Method void zzuo$zza(zzuo)>
		//    3    7:return          
		}

		zza(zzd zzd1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void zzc$zza$zza()>
		//    2    4:return          
		}
	}

	public static final class zzb extends Enum
		implements zzur
	{

		public static zzb[] values()
		{
			return (zzb[])((zzb []) (zzob)).clone();
		//    0    0:getstatic       #44  <Field zzc$zza$zzb[] zzob>
		//    1    3:invokevirtual   #65  <Method Object _5B_Lcom.google.android.gms.internal.measurement.zzc$zza$zzb_3B_.clone()>
		//    2    6:checkcast       #61  <Class zzc$zza$zzb[]>
		//    3    9:areturn         
		}

		public static zzb zza(int i)
		{
			switch(i)
		//*   0    0:iload_0         
			{
		//*   1    1:tableswitch     1 3: default 28
		//		               1 38
		//		               2 34
		//		               3 30
			default:
				return null;
		//    2   28:aconst_null     
		//    3   29:areturn         

			case 3: // '\003'
				return zznz;
		//    4   30:getstatic       #42  <Field zzc$zza$zzb zznz>
		//    5   33:areturn         

			case 2: // '\002'
				return zzny;
		//    6   34:getstatic       #38  <Field zzc$zza$zzb zzny>
		//    7   37:areturn         

			case 1: // '\001'
				return zznx;
		//    8   38:getstatic       #34  <Field zzc$zza$zzb zznx>
		//    9   41:areturn         
			}
		}

		public static zzut zzd()
		{
			return zzf.zzoc;
		//    0    0:getstatic       #74  <Field zzut zzf.zzoc>
		//    1    3:areturn         
		}

		public final int zzc()
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field int value>
		//    2    4:ireturn         
		}

		private static final zzb zznx;
		private static final zzb zzny;
		private static final zzb zznz;
		private static final zzus zzoa = new zze();
		private static final zzb zzob[];
		private final int value;

		static 
		{
			zznx = new zzb("NO_CACHE", 0, 1);
		//    0    0:new             #2   <Class zzc$zza$zzb>
		//    1    3:dup             
		//    2    4:ldc1            #28  <String "NO_CACHE">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:invokespecial   #32  <Method void zzc$zza$zzb(String, int, int)>
		//    6   11:putstatic       #34  <Field zzc$zza$zzb zznx>
			zzny = new zzb("PRIVATE", 1, 2);
		//    7   14:new             #2   <Class zzc$zza$zzb>
		//    8   17:dup             
		//    9   18:ldc1            #36  <String "PRIVATE">
		//   10   20:iconst_1        
		//   11   21:iconst_2        
		//   12   22:invokespecial   #32  <Method void zzc$zza$zzb(String, int, int)>
		//   13   25:putstatic       #38  <Field zzc$zza$zzb zzny>
			zznz = new zzb("PUBLIC", 2, 3);
		//   14   28:new             #2   <Class zzc$zza$zzb>
		//   15   31:dup             
		//   16   32:ldc1            #40  <String "PUBLIC">
		//   17   34:iconst_2        
		//   18   35:iconst_3        
		//   19   36:invokespecial   #32  <Method void zzc$zza$zzb(String, int, int)>
		//   20   39:putstatic       #42  <Field zzc$zza$zzb zznz>
			zzob = (new zzb[] {
				zznx, zzny, zznz
			});
		//   21   42:iconst_3        
		//   22   43:anewarray       zzb[]
		//   23   46:dup             
		//   24   47:iconst_0        
		//   25   48:getstatic       #34  <Field zzc$zza$zzb zznx>
		//   26   51:aastore         
		//   27   52:dup             
		//   28   53:iconst_1        
		//   29   54:getstatic       #38  <Field zzc$zza$zzb zzny>
		//   30   57:aastore         
		//   31   58:dup             
		//   32   59:iconst_2        
		//   33   60:getstatic       #42  <Field zzc$zza$zzb zznz>
		//   34   63:aastore         
		//   35   64:putstatic       #44  <Field zzc$zza$zzb[] zzob>
		//   36   67:new             #46  <Class zze>
		//   37   70:dup             
		//   38   71:invokespecial   #48  <Method void zze()>
		//   39   74:putstatic       #50  <Field zzus zzoa>
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


	public static zzwf zza()
	{
		return (zzwf)((zzuo) (zznv)).zza(.zzbys, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #32  <Field zzc$zza zznv>
	//    1    3:getstatic       #45  <Field int zzuo$zze.zzbys>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #48  <Method Object zzuo.zza(int, Object, Object)>
	//    5   11:checkcast       #50  <Class zzwf>
	//    6   14:areturn         
	}

	static zzc$zza zzb()
	{
		return zznv;
	//    0    0:getstatic       #32  <Field zzc$zza zznv>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzd.zznq[i - 1];
	//    0    0:getstatic       #59  <Field int[] zzd.zznq>
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
	//    6   48:new             #61  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #62  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #68  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zznw));
	//   15   63:getstatic       #70  <Field zzwf zznw>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/measurement/zzc$zza;
	//   19   71:ldc1            #2   <Class zzc$zza>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zznw));
	//   21   74:getstatic       #70  <Field zzwf zznw>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new (((zzuo) (zznv)))));
	//   27   84:new             #72  <Class zzuo$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #32  <Field zzc$zza zznv>
	//   30   91:invokespecial   #75  <Method void zzuo$zzb(zzuo)>
	//   31   94:astore_2        
		zznw = ((zzwf) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #70  <Field zzwf zznw>
_L12:
		com/google/android/gms/internal/measurement/zzc$zza;
	//   34   99:ldc1            #2   <Class zzc$zza>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/measurement/zzc$zza;
	//   39  105:ldc1            #2   <Class zzc$zza>
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
		return ((Object) (zznv));
	//   45  112:getstatic       #32  <Field zzc$zza zznv>
	//   46  115:areturn         
_L4:
		obj = ((Object) (zzb.zzd()));
	//   47  116:invokestatic    #79  <Method zzut zzc$zza$zzb.zzd()>
	//   48  119:astore_2        
		return zza(((zzvv) (zznv)), "\001\003\000\001\001\003\003\000\000\000\001\f\000\002\004\001\003\004\002", new Object[] {
			"zznr", "zzns", obj, "zznt", "zznu"
		});
	//   49  120:getstatic       #32  <Field zzc$zza zznv>
	//   50  123:ldc1            #81  <String "\001\003\000\001\001\003\003\000\000\000\001\f\000\002\004\001\003\004\002">
	//   51  125:iconst_5        
	//   52  126:anewarray       Object[]
	//   53  129:dup             
	//   54  130:iconst_0        
	//   55  131:ldc1            #84  <String "zznr">
	//   56  133:aastore         
	//   57  134:dup             
	//   58  135:iconst_1        
	//   59  136:ldc1            #85  <String "zzns">
	//   60  138:aastore         
	//   61  139:dup             
	//   62  140:iconst_2        
	//   63  141:aload_2         
	//   64  142:aastore         
	//   65  143:dup             
	//   66  144:iconst_3        
	//   67  145:ldc1            #86  <String "zznt">
	//   68  147:aastore         
	//   69  148:dup             
	//   70  149:iconst_4        
	//   71  150:ldc1            #87  <String "zznu">
	//   72  152:aastore         
	//   73  153:invokestatic    #90  <Method Object zza(zzvv, String, Object[])>
	//   74  156:areturn         
_L3:
		return ((Object) (new zza(((zzd) (null)))));
	//   75  157:new             #12  <Class zzc$zza$zza>
	//   76  160:dup             
	//   77  161:aconst_null     
	//   78  162:invokespecial   #93  <Method void zzc$zza$zza(zzd)>
	//   79  165:areturn         
_L2:
		return ((Object) (new zzc$zza()));
	//   80  166:new             #2   <Class zzc$zza>
	//   81  169:dup             
	//   82  170:invokespecial   #30  <Method void zzc$zza()>
	//   83  173:areturn         
	}

	private static final zzc$zza zznv;
	private static volatile zzwf zznw;
	private int zznr;
	private int zzns;
	private int zznt;
	private int zznu;

	static 
	{
		zznv = new zzc$zza();
	//    0    0:new             #2   <Class zzc$zza>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void zzc$zza()>
	//    3    7:putstatic       #32  <Field zzc$zza zznv>
		zzuo.zza(com/google/android/gms/internal/measurement/zzc$zza, ((zzuo) (zznv)));
	//    4   10:ldc1            #2   <Class zzc$zza>
	//    5   12:getstatic       #32  <Field zzc$zza zznv>
	//    6   15:invokestatic    #35  <Method void zzuo.zza(Class, zzuo)>
	//*   7   18:return          
	}

	private zzc$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void zzuo()>
		zzns = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #39  <Field int zzns>
	//    5    9:return          
	}
}
