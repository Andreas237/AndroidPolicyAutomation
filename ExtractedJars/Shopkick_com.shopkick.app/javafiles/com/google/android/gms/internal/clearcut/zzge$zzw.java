// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcg, zzdq, zzge, zzgf, 
//			zzdz, zzcj, zzgs, zzck

public static final class zzge$zzw extends zzcg
	implements zzdq
{
	public static final class zza extends zzcg.zza
		implements zzdq
	{

		private zza()
		{
			super(((zzcg) (zzge.zzw.zzfp())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #19  <Method zzge$zzw zzge$zzw.zzfp()>
		//    2    4:invokespecial   #22  <Method void zzcg$zza(zzcg)>
		//    3    7:return          
		}

		zza(zzgf zzgf1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void zzge$zzw$zza()>
		//    2    4:return          
		}
	}

	public static final class zzb extends Enum
		implements zzcj
	{

		public static zzb[] values()
		{
			return (zzb[])((zzb []) (zzbid)).clone();
		//    0    0:getstatic       #59  <Field zzge$zzw$zzb[] zzbid>
		//    1    3:invokevirtual   #80  <Method Object _5B_Lcom.google.android.gms.internal.clearcut.zzge$zzw$zzb_3B_.clone()>
		//    2    6:checkcast       #76  <Class zzge$zzw$zzb[]>
		//    3    9:areturn         
		}

		public static zzb zzbd(int i)
		{
			switch(i)
		//*   0    0:iload_0         
			{
		//*   1    1:tableswitch     0 5: default 40
		//		               0 62
		//		               1 58
		//		               2 54
		//		               3 50
		//		               4 46
		//		               5 42
			default:
				return null;
		//    2   40:aconst_null     
		//    3   41:areturn         

			case 5: // '\005'
				return zzbic;
		//    4   42:getstatic       #57  <Field zzge$zzw$zzb zzbic>
		//    5   45:areturn         

			case 4: // '\004'
				return zzbib;
		//    6   46:getstatic       #53  <Field zzge$zzw$zzb zzbib>
		//    7   49:areturn         

			case 3: // '\003'
				return zzbia;
		//    8   50:getstatic       #49  <Field zzge$zzw$zzb zzbia>
		//    9   53:areturn         

			case 2: // '\002'
				return zzbhz;
		//   10   54:getstatic       #45  <Field zzge$zzw$zzb zzbhz>
		//   11   57:areturn         

			case 1: // '\001'
				return zzbhy;
		//   12   58:getstatic       #41  <Field zzge$zzw$zzb zzbhy>
		//   13   61:areturn         

			case 0: // '\0'
				return zzbhx;
		//   14   62:getstatic       #37  <Field zzge$zzw$zzb zzbhx>
		//   15   65:areturn         
			}
		}

		public static zzck zzd()
		{
			return zzbq;
		//    0    0:getstatic       #65  <Field zzck zzbq>
		//    1    3:areturn         
		}

		public final int zzc()
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #71  <Field int value>
		//    2    4:ireturn         
		}

		private static final zzb zzbhx;
		private static final zzb zzbhy;
		private static final zzb zzbhz;
		private static final zzb zzbia;
		private static final zzb zzbib;
		private static final zzb zzbic;
		private static final zzb zzbid[];
		private static final zzck zzbq = new zzgs();
		private final int value;

		static 
		{
			zzbhx = new zzb("UNKNOWN", 0, 0);
		//    0    0:new             #2   <Class zzge$zzw$zzb>
		//    1    3:dup             
		//    2    4:ldc1            #31  <String "UNKNOWN">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #35  <Method void zzge$zzw$zzb(String, int, int)>
		//    6   11:putstatic       #37  <Field zzge$zzw$zzb zzbhx>
			zzbhy = new zzb("ANDROID_CARDBOARD_SDK", 1, 1);
		//    7   14:new             #2   <Class zzge$zzw$zzb>
		//    8   17:dup             
		//    9   18:ldc1            #39  <String "ANDROID_CARDBOARD_SDK">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #35  <Method void zzge$zzw$zzb(String, int, int)>
		//   13   25:putstatic       #41  <Field zzge$zzw$zzb zzbhy>
			zzbhz = new zzb("IOS_CARDBOARD_SDK", 2, 2);
		//   14   28:new             #2   <Class zzge$zzw$zzb>
		//   15   31:dup             
		//   16   32:ldc1            #43  <String "IOS_CARDBOARD_SDK">
		//   17   34:iconst_2        
		//   18   35:iconst_2        
		//   19   36:invokespecial   #35  <Method void zzge$zzw$zzb(String, int, int)>
		//   20   39:putstatic       #45  <Field zzge$zzw$zzb zzbhz>
			zzbia = new zzb("ANDROID_UNITY_SDK", 3, 3);
		//   21   42:new             #2   <Class zzge$zzw$zzb>
		//   22   45:dup             
		//   23   46:ldc1            #47  <String "ANDROID_UNITY_SDK">
		//   24   48:iconst_3        
		//   25   49:iconst_3        
		//   26   50:invokespecial   #35  <Method void zzge$zzw$zzb(String, int, int)>
		//   27   53:putstatic       #49  <Field zzge$zzw$zzb zzbia>
			zzbib = new zzb("IOS_UNITY_SDK", 4, 4);
		//   28   56:new             #2   <Class zzge$zzw$zzb>
		//   29   59:dup             
		//   30   60:ldc1            #51  <String "IOS_UNITY_SDK">
		//   31   62:iconst_4        
		//   32   63:iconst_4        
		//   33   64:invokespecial   #35  <Method void zzge$zzw$zzb(String, int, int)>
		//   34   67:putstatic       #53  <Field zzge$zzw$zzb zzbib>
			zzbic = new zzb("WINDOWS", 5, 5);
		//   35   70:new             #2   <Class zzge$zzw$zzb>
		//   36   73:dup             
		//   37   74:ldc1            #55  <String "WINDOWS">
		//   38   76:iconst_5        
		//   39   77:iconst_5        
		//   40   78:invokespecial   #35  <Method void zzge$zzw$zzb(String, int, int)>
		//   41   81:putstatic       #57  <Field zzge$zzw$zzb zzbic>
			zzbid = (new zzb[] {
				zzbhx, zzbhy, zzbhz, zzbia, zzbib, zzbic
			});
		//   42   84:bipush          6
		//   43   86:anewarray       zzb[]
		//   44   89:dup             
		//   45   90:iconst_0        
		//   46   91:getstatic       #37  <Field zzge$zzw$zzb zzbhx>
		//   47   94:aastore         
		//   48   95:dup             
		//   49   96:iconst_1        
		//   50   97:getstatic       #41  <Field zzge$zzw$zzb zzbhy>
		//   51  100:aastore         
		//   52  101:dup             
		//   53  102:iconst_2        
		//   54  103:getstatic       #45  <Field zzge$zzw$zzb zzbhz>
		//   55  106:aastore         
		//   56  107:dup             
		//   57  108:iconst_3        
		//   58  109:getstatic       #49  <Field zzge$zzw$zzb zzbia>
		//   59  112:aastore         
		//   60  113:dup             
		//   61  114:iconst_4        
		//   62  115:getstatic       #53  <Field zzge$zzw$zzb zzbib>
		//   63  118:aastore         
		//   64  119:dup             
		//   65  120:iconst_5        
		//   66  121:getstatic       #57  <Field zzge$zzw$zzb zzbic>
		//   67  124:aastore         
		//   68  125:putstatic       #59  <Field zzge$zzw$zzb[] zzbid>
		//   69  128:new             #61  <Class zzgs>
		//   70  131:dup             
		//   71  132:invokespecial   #63  <Method void zzgs()>
		//   72  135:putstatic       #65  <Field zzck zzbq>
		//*  73  138:return          
		}

		private zzb(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #69  <Method void Enum(String, int)>
			value = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #71  <Field int value>
		//    7   11:return          
		}
	}


	static zzge$zzw zzfp()
	{
		return zzbhw;
	//    0    0:getstatic       #41  <Field zzge$zzw zzbhw>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzgf.zzba[i - 1];
	//    0    0:getstatic       #75  <Field int[] zzgf.zzba>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 208
	//	               2 199
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 208
	//	               2 199
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #77  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #78  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #84  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #86  <Field zzdz zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/zzge$zzw;
	//   19   71:ldc1            #2   <Class zzge$zzw>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #86  <Field zzdz zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzcg$zzb(((zzcg) (zzbhw)))));
	//   27   84:new             #88  <Class zzcg$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #41  <Field zzge$zzw zzbhw>
	//   30   91:invokespecial   #91  <Method void zzcg$zzb(zzcg)>
	//   31   94:astore_2        
		zzbg = ((zzdz) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #86  <Field zzdz zzbg>
_L12:
		com/google/android/gms/internal/clearcut/zzge$zzw;
	//   34   99:ldc1            #2   <Class zzge$zzw>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/zzge$zzw;
	//   39  105:ldc1            #2   <Class zzge$zzw>
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
		return ((Object) (zzbhw));
	//   45  112:getstatic       #41  <Field zzge$zzw zzbhw>
	//   46  115:areturn         
_L4:
		obj = ((Object) (zzb.zzd()));
	//   47  116:invokestatic    #95  <Method zzck zzge$zzw$zzb.zzd()>
	//   48  119:astore_2        
		return zza(((zzdo) (zzbhw)), "\001\n\000\001\001\n\n\013\000\000\000\001\f\000\002\b\001\003\b\002\004\b\003\005\b\004\006\b\005\007\b\006\b\b\007\t\b\b\n\b\t", new Object[] {
			"zzbb", "zzbhq", obj, "zzbhr", "zzte", "zzbhs", "zzta", "zzsr", "zzbht", "zzsz", 
			"zzbhu", "zzbhv"
		});
	//   49  120:getstatic       #41  <Field zzge$zzw zzbhw>
	//   50  123:ldc1            #97  <String "\001\n\000\001\001\n\n\013\000\000\000\001\f\000\002\b\001\003\b\002\004\b\003\005\b\004\006\b\005\007\b\006\b\b\007\t\b\b\n\b\t">
	//   51  125:bipush          12
	//   52  127:anewarray       Object[]
	//   53  130:dup             
	//   54  131:iconst_0        
	//   55  132:ldc1            #100 <String "zzbb">
	//   56  134:aastore         
	//   57  135:dup             
	//   58  136:iconst_1        
	//   59  137:ldc1            #101 <String "zzbhq">
	//   60  139:aastore         
	//   61  140:dup             
	//   62  141:iconst_2        
	//   63  142:aload_2         
	//   64  143:aastore         
	//   65  144:dup             
	//   66  145:iconst_3        
	//   67  146:ldc1            #102 <String "zzbhr">
	//   68  148:aastore         
	//   69  149:dup             
	//   70  150:iconst_4        
	//   71  151:ldc1            #103 <String "zzte">
	//   72  153:aastore         
	//   73  154:dup             
	//   74  155:iconst_5        
	//   75  156:ldc1            #104 <String "zzbhs">
	//   76  158:aastore         
	//   77  159:dup             
	//   78  160:bipush          6
	//   79  162:ldc1            #105 <String "zzta">
	//   80  164:aastore         
	//   81  165:dup             
	//   82  166:bipush          7
	//   83  168:ldc1            #106 <String "zzsr">
	//   84  170:aastore         
	//   85  171:dup             
	//   86  172:bipush          8
	//   87  174:ldc1            #107 <String "zzbht">
	//   88  176:aastore         
	//   89  177:dup             
	//   90  178:bipush          9
	//   91  180:ldc1            #108 <String "zzsz">
	//   92  182:aastore         
	//   93  183:dup             
	//   94  184:bipush          10
	//   95  186:ldc1            #109 <String "zzbhu">
	//   96  188:aastore         
	//   97  189:dup             
	//   98  190:bipush          11
	//   99  192:ldc1            #110 <String "zzbhv">
	//  100  194:aastore         
	//  101  195:invokestatic    #113 <Method Object zza(zzdo, String, Object[])>
	//  102  198:areturn         
_L3:
		return ((Object) (new zza(((zzgf) (null)))));
	//  103  199:new             #12  <Class zzge$zzw$zza>
	//  104  202:dup             
	//  105  203:aconst_null     
	//  106  204:invokespecial   #116 <Method void zzge$zzw$zza(zzgf)>
	//  107  207:areturn         
_L2:
		return ((Object) (new zzge$zzw()));
	//  108  208:new             #2   <Class zzge$zzw>
	//  109  211:dup             
	//  110  212:invokespecial   #39  <Method void zzge$zzw()>
	//  111  215:areturn         
	}

	private static volatile zzdz zzbg;
	private static final zzge$zzw zzbhw;
	private int zzbb;
	private int zzbhq;
	private String zzbhr;
	private String zzbhs;
	private String zzbht;
	private String zzbhu;
	private String zzbhv;
	private String zzsr;
	private String zzsz;
	private String zzta;
	private String zzte;

	static 
	{
		zzbhw = new zzge$zzw();
	//    0    0:new             #2   <Class zzge$zzw>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void zzge$zzw()>
	//    3    7:putstatic       #41  <Field zzge$zzw zzbhw>
		zzcg.zza(com/google/android/gms/internal/clearcut/zzge$zzw, ((zzcg) (zzbhw)));
	//    4   10:ldc1            #2   <Class zzge$zzw>
	//    5   12:getstatic       #41  <Field zzge$zzw zzbhw>
	//    6   15:invokestatic    #44  <Method void zzcg.zza(Class, zzcg)>
	//*   7   18:return          
	}

	private zzge$zzw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void zzcg()>
		zzbhr = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #48  <String "">
	//    4    7:putfield        #50  <Field String zzbhr>
		zzte = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #48  <String "">
	//    7   13:putfield        #52  <Field String zzte>
		zzbhs = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #48  <String "">
	//   10   19:putfield        #54  <Field String zzbhs>
		zzta = "";
	//   11   22:aload_0         
	//   12   23:ldc1            #48  <String "">
	//   13   25:putfield        #56  <Field String zzta>
		zzsr = "";
	//   14   28:aload_0         
	//   15   29:ldc1            #48  <String "">
	//   16   31:putfield        #58  <Field String zzsr>
		zzbht = "";
	//   17   34:aload_0         
	//   18   35:ldc1            #48  <String "">
	//   19   37:putfield        #60  <Field String zzbht>
		zzsz = "";
	//   20   40:aload_0         
	//   21   41:ldc1            #48  <String "">
	//   22   43:putfield        #62  <Field String zzsz>
		zzbhu = "";
	//   23   46:aload_0         
	//   24   47:ldc1            #48  <String "">
	//   25   49:putfield        #64  <Field String zzbhu>
		zzbhv = "";
	//   26   52:aload_0         
	//   27   53:ldc1            #48  <String "">
	//   28   55:putfield        #66  <Field String zzbhv>
	//   29   58:return          
	}
}
