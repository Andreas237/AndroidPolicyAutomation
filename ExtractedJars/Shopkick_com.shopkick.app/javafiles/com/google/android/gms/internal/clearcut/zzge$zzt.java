// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcg, zzdq, zzge, zzgf, 
//			zzdz, zzcj, zzgq, zzck

public static final class zzge$zzt extends zzcg
	implements zzdq
{
	public static final class zza extends zzcg.zza
		implements zzdq
	{

		private zza()
		{
			super(((zzcg) (zzge.zzt.zzfm())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #19  <Method zzge$zzt zzge$zzt.zzfm()>
		//    2    4:invokespecial   #22  <Method void zzcg$zza(zzcg)>
		//    3    7:return          
		}

		zza(zzgf zzgf1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void zzge$zzt$zza()>
		//    2    4:return          
		}
	}

	public static final class zzb extends Enum
		implements zzcj
	{

		public static zzb[] values()
		{
			return (zzb[])((zzb []) (zzbhf)).clone();
		//    0    0:getstatic       #64  <Field zzge$zzt$zzb[] zzbhf>
		//    1    3:invokevirtual   #85  <Method Object _5B_Lcom.google.android.gms.internal.clearcut.zzge$zzt$zzb_3B_.clone()>
		//    2    6:checkcast       #81  <Class zzge$zzt$zzb[]>
		//    3    9:areturn         
		}

		public static zzb zzbb(int i)
		{
			switch(i)
		//*   0    0:iload_0         
			{
		//*   1    1:tableswitch     0 6: default 44
		//		               0 70
		//		               1 66
		//		               2 62
		//		               3 58
		//		               4 54
		//		               5 50
		//		               6 46
			default:
				return null;
		//    2   44:aconst_null     
		//    3   45:areturn         

			case 6: // '\006'
				return zzbhe;
		//    4   46:getstatic       #62  <Field zzge$zzt$zzb zzbhe>
		//    5   49:areturn         

			case 5: // '\005'
				return zzbhd;
		//    6   50:getstatic       #58  <Field zzge$zzt$zzb zzbhd>
		//    7   53:areturn         

			case 4: // '\004'
				return zzbhc;
		//    8   54:getstatic       #54  <Field zzge$zzt$zzb zzbhc>
		//    9   57:areturn         

			case 3: // '\003'
				return zzbhb;
		//   10   58:getstatic       #50  <Field zzge$zzt$zzb zzbhb>
		//   11   61:areturn         

			case 2: // '\002'
				return zzbha;
		//   12   62:getstatic       #46  <Field zzge$zzt$zzb zzbha>
		//   13   65:areturn         

			case 1: // '\001'
				return zzbgz;
		//   14   66:getstatic       #42  <Field zzge$zzt$zzb zzbgz>
		//   15   69:areturn         

			case 0: // '\0'
				return zzbgy;
		//   16   70:getstatic       #38  <Field zzge$zzt$zzb zzbgy>
		//   17   73:areturn         
			}
		}

		public static zzck zzd()
		{
			return zzbq;
		//    0    0:getstatic       #70  <Field zzck zzbq>
		//    1    3:areturn         
		}

		public final int zzc()
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #76  <Field int value>
		//    2    4:ireturn         
		}

		private static final zzb zzbgy;
		private static final zzb zzbgz;
		private static final zzb zzbha;
		private static final zzb zzbhb;
		private static final zzb zzbhc;
		private static final zzb zzbhd;
		private static final zzb zzbhe;
		private static final zzb zzbhf[];
		private static final zzck zzbq = new zzgq();
		private final int value;

		static 
		{
			zzbgy = new zzb("OS_TYPE_UNKNOWN", 0, 0);
		//    0    0:new             #2   <Class zzge$zzt$zzb>
		//    1    3:dup             
		//    2    4:ldc1            #32  <String "OS_TYPE_UNKNOWN">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #36  <Method void zzge$zzt$zzb(String, int, int)>
		//    6   11:putstatic       #38  <Field zzge$zzt$zzb zzbgy>
			zzbgz = new zzb("OS_TYPE_MAC", 1, 1);
		//    7   14:new             #2   <Class zzge$zzt$zzb>
		//    8   17:dup             
		//    9   18:ldc1            #40  <String "OS_TYPE_MAC">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #36  <Method void zzge$zzt$zzb(String, int, int)>
		//   13   25:putstatic       #42  <Field zzge$zzt$zzb zzbgz>
			zzbha = new zzb("OS_TYPE_WINDOWS", 2, 2);
		//   14   28:new             #2   <Class zzge$zzt$zzb>
		//   15   31:dup             
		//   16   32:ldc1            #44  <String "OS_TYPE_WINDOWS">
		//   17   34:iconst_2        
		//   18   35:iconst_2        
		//   19   36:invokespecial   #36  <Method void zzge$zzt$zzb(String, int, int)>
		//   20   39:putstatic       #46  <Field zzge$zzt$zzb zzbha>
			zzbhb = new zzb("OS_TYPE_ANDROID", 3, 3);
		//   21   42:new             #2   <Class zzge$zzt$zzb>
		//   22   45:dup             
		//   23   46:ldc1            #48  <String "OS_TYPE_ANDROID">
		//   24   48:iconst_3        
		//   25   49:iconst_3        
		//   26   50:invokespecial   #36  <Method void zzge$zzt$zzb(String, int, int)>
		//   27   53:putstatic       #50  <Field zzge$zzt$zzb zzbhb>
			zzbhc = new zzb("OS_TYPE_CROS", 4, 4);
		//   28   56:new             #2   <Class zzge$zzt$zzb>
		//   29   59:dup             
		//   30   60:ldc1            #52  <String "OS_TYPE_CROS">
		//   31   62:iconst_4        
		//   32   63:iconst_4        
		//   33   64:invokespecial   #36  <Method void zzge$zzt$zzb(String, int, int)>
		//   34   67:putstatic       #54  <Field zzge$zzt$zzb zzbhc>
			zzbhd = new zzb("OS_TYPE_LINUX", 5, 5);
		//   35   70:new             #2   <Class zzge$zzt$zzb>
		//   36   73:dup             
		//   37   74:ldc1            #56  <String "OS_TYPE_LINUX">
		//   38   76:iconst_5        
		//   39   77:iconst_5        
		//   40   78:invokespecial   #36  <Method void zzge$zzt$zzb(String, int, int)>
		//   41   81:putstatic       #58  <Field zzge$zzt$zzb zzbhd>
			zzbhe = new zzb("OS_TYPE_OPENBSD", 6, 6);
		//   42   84:new             #2   <Class zzge$zzt$zzb>
		//   43   87:dup             
		//   44   88:ldc1            #60  <String "OS_TYPE_OPENBSD">
		//   45   90:bipush          6
		//   46   92:bipush          6
		//   47   94:invokespecial   #36  <Method void zzge$zzt$zzb(String, int, int)>
		//   48   97:putstatic       #62  <Field zzge$zzt$zzb zzbhe>
			zzbhf = (new zzb[] {
				zzbgy, zzbgz, zzbha, zzbhb, zzbhc, zzbhd, zzbhe
			});
		//   49  100:bipush          7
		//   50  102:anewarray       zzb[]
		//   51  105:dup             
		//   52  106:iconst_0        
		//   53  107:getstatic       #38  <Field zzge$zzt$zzb zzbgy>
		//   54  110:aastore         
		//   55  111:dup             
		//   56  112:iconst_1        
		//   57  113:getstatic       #42  <Field zzge$zzt$zzb zzbgz>
		//   58  116:aastore         
		//   59  117:dup             
		//   60  118:iconst_2        
		//   61  119:getstatic       #46  <Field zzge$zzt$zzb zzbha>
		//   62  122:aastore         
		//   63  123:dup             
		//   64  124:iconst_3        
		//   65  125:getstatic       #50  <Field zzge$zzt$zzb zzbhb>
		//   66  128:aastore         
		//   67  129:dup             
		//   68  130:iconst_4        
		//   69  131:getstatic       #54  <Field zzge$zzt$zzb zzbhc>
		//   70  134:aastore         
		//   71  135:dup             
		//   72  136:iconst_5        
		//   73  137:getstatic       #58  <Field zzge$zzt$zzb zzbhd>
		//   74  140:aastore         
		//   75  141:dup             
		//   76  142:bipush          6
		//   77  144:getstatic       #62  <Field zzge$zzt$zzb zzbhe>
		//   78  147:aastore         
		//   79  148:putstatic       #64  <Field zzge$zzt$zzb[] zzbhf>
		//   80  151:new             #66  <Class zzgq>
		//   81  154:dup             
		//   82  155:invokespecial   #68  <Method void zzgq()>
		//   83  158:putstatic       #70  <Field zzck zzbq>
		//*  84  161:return          
		}

		private zzb(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #74  <Method void Enum(String, int)>
			value = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #76  <Field int value>
		//    7   11:return          
		}
	}


	static zzge$zzt zzfm()
	{
		return zzbgx;
	//    0    0:getstatic       #36  <Field zzge$zzt zzbgx>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzgf.zzba[i - 1];
	//    0    0:getstatic       #60  <Field int[] zzgf.zzba>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 178
	//	               2 169
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 178
	//	               2 169
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #62  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #63  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #69  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #71  <Field zzdz zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/zzge$zzt;
	//   19   71:ldc1            #2   <Class zzge$zzt>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #71  <Field zzdz zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzcg$zzb(((zzcg) (zzbgx)))));
	//   27   84:new             #73  <Class zzcg$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #36  <Field zzge$zzt zzbgx>
	//   30   91:invokespecial   #76  <Method void zzcg$zzb(zzcg)>
	//   31   94:astore_2        
		zzbg = ((zzdz) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #71  <Field zzdz zzbg>
_L12:
		com/google/android/gms/internal/clearcut/zzge$zzt;
	//   34   99:ldc1            #2   <Class zzge$zzt>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/zzge$zzt;
	//   39  105:ldc1            #2   <Class zzge$zzt>
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
		return ((Object) (zzbgx));
	//   45  112:getstatic       #36  <Field zzge$zzt zzbgx>
	//   46  115:areturn         
_L4:
		obj = ((Object) (zzb.zzd()));
	//   47  116:invokestatic    #80  <Method zzck zzge$zzt$zzb.zzd()>
	//   48  119:astore_2        
		return zza(((zzdo) (zzbgx)), "\001\005\000\001\001\005\005\006\000\000\000\001\b\000\002\f\001\003\b\002\004\b\003\005\b\004", new Object[] {
			"zzbb", "zzbgt", "zzbgu", obj, "zzbgv", "zzbgw", "zzsx"
		});
	//   49  120:getstatic       #36  <Field zzge$zzt zzbgx>
	//   50  123:ldc1            #82  <String "\001\005\000\001\001\005\005\006\000\000\000\001\b\000\002\f\001\003\b\002\004\b\003\005\b\004">
	//   51  125:bipush          7
	//   52  127:anewarray       Object[]
	//   53  130:dup             
	//   54  131:iconst_0        
	//   55  132:ldc1            #85  <String "zzbb">
	//   56  134:aastore         
	//   57  135:dup             
	//   58  136:iconst_1        
	//   59  137:ldc1            #86  <String "zzbgt">
	//   60  139:aastore         
	//   61  140:dup             
	//   62  141:iconst_2        
	//   63  142:ldc1            #87  <String "zzbgu">
	//   64  144:aastore         
	//   65  145:dup             
	//   66  146:iconst_3        
	//   67  147:aload_2         
	//   68  148:aastore         
	//   69  149:dup             
	//   70  150:iconst_4        
	//   71  151:ldc1            #88  <String "zzbgv">
	//   72  153:aastore         
	//   73  154:dup             
	//   74  155:iconst_5        
	//   75  156:ldc1            #89  <String "zzbgw">
	//   76  158:aastore         
	//   77  159:dup             
	//   78  160:bipush          6
	//   79  162:ldc1            #90  <String "zzsx">
	//   80  164:aastore         
	//   81  165:invokestatic    #93  <Method Object zza(zzdo, String, Object[])>
	//   82  168:areturn         
_L3:
		return ((Object) (new zza(((zzgf) (null)))));
	//   83  169:new             #12  <Class zzge$zzt$zza>
	//   84  172:dup             
	//   85  173:aconst_null     
	//   86  174:invokespecial   #96  <Method void zzge$zzt$zza(zzgf)>
	//   87  177:areturn         
_L2:
		return ((Object) (new zzge$zzt()));
	//   88  178:new             #2   <Class zzge$zzt>
	//   89  181:dup             
	//   90  182:invokespecial   #34  <Method void zzge$zzt()>
	//   91  185:areturn         
	}

	private static volatile zzdz zzbg;
	private static final zzge$zzt zzbgx;
	private int zzbb;
	private String zzbgt;
	private int zzbgu;
	private String zzbgv;
	private String zzbgw;
	private String zzsx;

	static 
	{
		zzbgx = new zzge$zzt();
	//    0    0:new             #2   <Class zzge$zzt>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void zzge$zzt()>
	//    3    7:putstatic       #36  <Field zzge$zzt zzbgx>
		zzcg.zza(com/google/android/gms/internal/clearcut/zzge$zzt, ((zzcg) (zzbgx)));
	//    4   10:ldc1            #2   <Class zzge$zzt>
	//    5   12:getstatic       #36  <Field zzge$zzt zzbgx>
	//    6   15:invokestatic    #39  <Method void zzcg.zza(Class, zzcg)>
	//*   7   18:return          
	}

	private zzge$zzt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void zzcg()>
		zzbgt = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #43  <String "">
	//    4    7:putfield        #45  <Field String zzbgt>
		zzbgv = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #43  <String "">
	//    7   13:putfield        #47  <Field String zzbgv>
		zzbgw = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #43  <String "">
	//   10   19:putfield        #49  <Field String zzbgw>
		zzsx = "";
	//   11   22:aload_0         
	//   12   23:ldc1            #43  <String "">
	//   13   25:putfield        #51  <Field String zzsx>
	//   14   28:return          
	}
}
