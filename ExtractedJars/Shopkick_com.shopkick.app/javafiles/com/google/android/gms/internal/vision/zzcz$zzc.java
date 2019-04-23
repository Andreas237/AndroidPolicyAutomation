// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;


// Referenced classes of package com.google.android.gms.internal.vision:
//			zzfy, zzhh, zzcz, zzda, 
//			zzhq, zzgb, zzdb, zzdc, 
//			zzgc, zzgd

public static final class zzcz$zzc extends zzfy
	implements zzhh
{
	public static final class zza extends zzfy.zza
		implements zzhh
	{

		private zza()
		{
			super(((zzfy) (zzcz.zzc.zzbt())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #19  <Method zzcz$zzc zzcz$zzc.zzbt()>
		//    2    4:invokespecial   #22  <Method void zzfy$zza(zzfy)>
		//    3    7:return          
		}

		zza(zzda zzda1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void zzcz$zzc$zza()>
		//    2    4:return          
		}
	}

	public static final class zzb extends Enum
		implements zzgb
	{

		public static zzb[] values()
		{
			return (zzb[])((zzb []) (zzmp)).clone();
		//    0    0:getstatic       #49  <Field zzcz$zzc$zzb[] zzmp>
		//    1    3:invokevirtual   #70  <Method Object _5B_Lcom.google.android.gms.internal.vision.zzcz$zzc$zzb_3B_.clone()>
		//    2    6:checkcast       #66  <Class zzcz$zzc$zzb[]>
		//    3    9:areturn         
		}

		public static zzgd zzah()
		{
			return zzdc.zzhl;
		//    0    0:getstatic       #78  <Field zzgd zzdc.zzhl>
		//    1    3:areturn         
		}

		public static zzb zzs(int i)
		{
			switch(i)
		//*   0    0:iload_0         
			{
		//*   1    1:tableswitch     0 3: default 32
		//		               0 46
		//		               1 42
		//		               2 38
		//		               3 34
			default:
				return null;
		//    2   32:aconst_null     
		//    3   33:areturn         

			case 3: // '\003'
				return zzmo;
		//    4   34:getstatic       #47  <Field zzcz$zzc$zzb zzmo>
		//    5   37:areturn         

			case 2: // '\002'
				return zzmn;
		//    6   38:getstatic       #43  <Field zzcz$zzc$zzb zzmn>
		//    7   41:areturn         

			case 1: // '\001'
				return zzmm;
		//    8   42:getstatic       #39  <Field zzcz$zzc$zzb zzmm>
		//    9   45:areturn         

			case 0: // '\0'
				return zzml;
		//   10   46:getstatic       #35  <Field zzcz$zzc$zzb zzml>
		//   11   49:areturn         
			}
		}

		public final int zzr()
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #61  <Field int value>
		//    2    4:ireturn         
		}

		private static final zzgc zzdv = new zzdb();
		private static final zzb zzml;
		private static final zzb zzmm;
		private static final zzb zzmn;
		private static final zzb zzmo;
		private static final zzb zzmp[];
		private final int value;

		static 
		{
			zzml = new zzb("REASON_UNKNOWN", 0, 0);
		//    0    0:new             #2   <Class zzcz$zzc$zzb>
		//    1    3:dup             
		//    2    4:ldc1            #29  <String "REASON_UNKNOWN">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #33  <Method void zzcz$zzc$zzb(String, int, int)>
		//    6   11:putstatic       #35  <Field zzcz$zzc$zzb zzml>
			zzmm = new zzb("REASON_MISSING", 1, 1);
		//    7   14:new             #2   <Class zzcz$zzc$zzb>
		//    8   17:dup             
		//    9   18:ldc1            #37  <String "REASON_MISSING">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #33  <Method void zzcz$zzc$zzb(String, int, int)>
		//   13   25:putstatic       #39  <Field zzcz$zzc$zzb zzmm>
			zzmn = new zzb("REASON_UPGRADE", 2, 2);
		//   14   28:new             #2   <Class zzcz$zzc$zzb>
		//   15   31:dup             
		//   16   32:ldc1            #41  <String "REASON_UPGRADE">
		//   17   34:iconst_2        
		//   18   35:iconst_2        
		//   19   36:invokespecial   #33  <Method void zzcz$zzc$zzb(String, int, int)>
		//   20   39:putstatic       #43  <Field zzcz$zzc$zzb zzmn>
			zzmo = new zzb("REASON_INVALID", 3, 3);
		//   21   42:new             #2   <Class zzcz$zzc$zzb>
		//   22   45:dup             
		//   23   46:ldc1            #45  <String "REASON_INVALID">
		//   24   48:iconst_3        
		//   25   49:iconst_3        
		//   26   50:invokespecial   #33  <Method void zzcz$zzc$zzb(String, int, int)>
		//   27   53:putstatic       #47  <Field zzcz$zzc$zzb zzmo>
			zzmp = (new zzb[] {
				zzml, zzmm, zzmn, zzmo
			});
		//   28   56:iconst_4        
		//   29   57:anewarray       zzb[]
		//   30   60:dup             
		//   31   61:iconst_0        
		//   32   62:getstatic       #35  <Field zzcz$zzc$zzb zzml>
		//   33   65:aastore         
		//   34   66:dup             
		//   35   67:iconst_1        
		//   36   68:getstatic       #39  <Field zzcz$zzc$zzb zzmm>
		//   37   71:aastore         
		//   38   72:dup             
		//   39   73:iconst_2        
		//   40   74:getstatic       #43  <Field zzcz$zzc$zzb zzmn>
		//   41   77:aastore         
		//   42   78:dup             
		//   43   79:iconst_3        
		//   44   80:getstatic       #47  <Field zzcz$zzc$zzb zzmo>
		//   45   83:aastore         
		//   46   84:putstatic       #49  <Field zzcz$zzc$zzb[] zzmp>
		//   47   87:new             #51  <Class zzdb>
		//   48   90:dup             
		//   49   91:invokespecial   #53  <Method void zzdb()>
		//   50   94:putstatic       #55  <Field zzgc zzdv>
		//*  51   97:return          
		}

		private zzb(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #59  <Method void Enum(String, int)>
			value = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #61  <Field int value>
		//    7   11:return          
		}
	}


	static zzcz$zzc zzbt()
	{
		return zzmk;
	//    0    0:getstatic       #40  <Field zzcz$zzc zzmk>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzda.zzbc[i - 1];
	//    0    0:getstatic       #60  <Field int[] zzda.zzbc>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 190
	//	               2 181
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 190
	//	               2 181
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
		obj = ((Object) (zzbf));
	//   15   63:getstatic       #71  <Field zzhq zzbf>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/vision/zzcz$zzc;
	//   19   71:ldc1            #2   <Class zzcz$zzc>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbf));
	//   21   74:getstatic       #71  <Field zzhq zzbf>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzfy$zzb(((zzfy) (zzmk)))));
	//   27   84:new             #73  <Class zzfy$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #40  <Field zzcz$zzc zzmk>
	//   30   91:invokespecial   #76  <Method void zzfy$zzb(zzfy)>
	//   31   94:astore_2        
		zzbf = ((zzhq) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #71  <Field zzhq zzbf>
_L12:
		com/google/android/gms/internal/vision/zzcz$zzc;
	//   34   99:ldc1            #2   <Class zzcz$zzc>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/vision/zzcz$zzc;
	//   39  105:ldc1            #2   <Class zzcz$zzc>
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
		return ((Object) (zzmk));
	//   45  112:getstatic       #40  <Field zzcz$zzc zzmk>
	//   46  115:areturn         
_L4:
		obj = ((Object) (zzb.zzah()));
	//   47  116:invokestatic    #80  <Method zzgd zzcz$zzc$zzb.zzah()>
	//   48  119:astore_2        
		return zza(((zzhf) (zzmk)), "\001\007\000\001\001\007\007\000\000\000\001\b\000\002\007\001\003\f\002\004\002\003\005\002\004\006\002\005\007\b\006", new Object[] {
			"zzbg", "zzmd", "zzme", "zzmf", obj, "zzmg", "zzmh", "zzmi", "zzmj"
		});
	//   49  120:getstatic       #40  <Field zzcz$zzc zzmk>
	//   50  123:ldc1            #82  <String "\001\007\000\001\001\007\007\000\000\000\001\b\000\002\007\001\003\f\002\004\002\003\005\002\004\006\002\005\007\b\006">
	//   51  125:bipush          9
	//   52  127:anewarray       Object[]
	//   53  130:dup             
	//   54  131:iconst_0        
	//   55  132:ldc1            #85  <String "zzbg">
	//   56  134:aastore         
	//   57  135:dup             
	//   58  136:iconst_1        
	//   59  137:ldc1            #86  <String "zzmd">
	//   60  139:aastore         
	//   61  140:dup             
	//   62  141:iconst_2        
	//   63  142:ldc1            #87  <String "zzme">
	//   64  144:aastore         
	//   65  145:dup             
	//   66  146:iconst_3        
	//   67  147:ldc1            #88  <String "zzmf">
	//   68  149:aastore         
	//   69  150:dup             
	//   70  151:iconst_4        
	//   71  152:aload_2         
	//   72  153:aastore         
	//   73  154:dup             
	//   74  155:iconst_5        
	//   75  156:ldc1            #89  <String "zzmg">
	//   76  158:aastore         
	//   77  159:dup             
	//   78  160:bipush          6
	//   79  162:ldc1            #90  <String "zzmh">
	//   80  164:aastore         
	//   81  165:dup             
	//   82  166:bipush          7
	//   83  168:ldc1            #91  <String "zzmi">
	//   84  170:aastore         
	//   85  171:dup             
	//   86  172:bipush          8
	//   87  174:ldc1            #92  <String "zzmj">
	//   88  176:aastore         
	//   89  177:invokestatic    #95  <Method Object zza(zzhf, String, Object[])>
	//   90  180:areturn         
_L3:
		return ((Object) (new zza(((zzda) (null)))));
	//   91  181:new             #12  <Class zzcz$zzc$zza>
	//   92  184:dup             
	//   93  185:aconst_null     
	//   94  186:invokespecial   #98  <Method void zzcz$zzc$zza(zzda)>
	//   95  189:areturn         
_L2:
		return ((Object) (new zzcz$zzc()));
	//   96  190:new             #2   <Class zzcz$zzc>
	//   97  193:dup             
	//   98  194:invokespecial   #38  <Method void zzcz$zzc()>
	//   99  197:areturn         
	}

	private static volatile zzhq zzbf;
	private static final zzcz$zzc zzmk;
	private int zzbg;
	private String zzmd;
	private boolean zzme;
	private int zzmf;
	private long zzmg;
	private long zzmh;
	private long zzmi;
	private String zzmj;

	static 
	{
		zzmk = new zzcz$zzc();
	//    0    0:new             #2   <Class zzcz$zzc>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void zzcz$zzc()>
	//    3    7:putstatic       #40  <Field zzcz$zzc zzmk>
		zzfy.zza(com/google/android/gms/internal/vision/zzcz$zzc, ((zzfy) (zzmk)));
	//    4   10:ldc1            #2   <Class zzcz$zzc>
	//    5   12:getstatic       #40  <Field zzcz$zzc zzmk>
	//    6   15:invokestatic    #43  <Method void zzfy.zza(Class, zzfy)>
	//*   7   18:return          
	}

	private zzcz$zzc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void zzfy()>
		zzmd = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #47  <String "">
	//    4    7:putfield        #49  <Field String zzmd>
		zzmj = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #47  <String "">
	//    7   13:putfield        #51  <Field String zzmj>
	//    8   16:return          
	}
}
