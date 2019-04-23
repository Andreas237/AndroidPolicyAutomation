// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;


// Referenced classes of package com.google.android.gms.internal.vision:
//			zzfy, zzhh, zzcz, zzda, 
//			zzhq, zzgb, zzdf, zzdg, 
//			zzgc, zzgd

public static final class zzcz$zzf extends zzfy
	implements zzhh
{
	public static final class zza extends zzfy.zza
		implements zzhh
	{

		private zza()
		{
			super(((zzfy) (zzcz.zzf.zzbw())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #19  <Method zzcz$zzf zzcz$zzf.zzbw()>
		//    2    4:invokespecial   #22  <Method void zzfy$zza(zzfy)>
		//    3    7:return          
		}

		zza(zzda zzda1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void zzcz$zzf$zza()>
		//    2    4:return          
		}
	}

	public static final class zzb extends Enum
		implements zzgb
	{

		public static zzb[] values()
		{
			return (zzb[])((zzb []) (zznt)).clone();
		//    0    0:getstatic       #49  <Field zzcz$zzf$zzb[] zznt>
		//    1    3:invokevirtual   #70  <Method Object _5B_Lcom.google.android.gms.internal.vision.zzcz$zzf$zzb_3B_.clone()>
		//    2    6:checkcast       #66  <Class zzcz$zzf$zzb[]>
		//    3    9:areturn         
		}

		public static zzgd zzah()
		{
			return zzdg.zzhl;
		//    0    0:getstatic       #78  <Field zzgd zzdg.zzhl>
		//    1    3:areturn         
		}

		public static zzb zzu(int i)
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
				return zzns;
		//    4   34:getstatic       #47  <Field zzcz$zzf$zzb zzns>
		//    5   37:areturn         

			case 2: // '\002'
				return zznr;
		//    6   38:getstatic       #43  <Field zzcz$zzf$zzb zznr>
		//    7   41:areturn         

			case 1: // '\001'
				return zznq;
		//    8   42:getstatic       #39  <Field zzcz$zzf$zzb zznq>
		//    9   45:areturn         

			case 0: // '\0'
				return zznp;
		//   10   46:getstatic       #35  <Field zzcz$zzf$zzb zznp>
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

		private static final zzgc zzdv = new zzdf();
		private static final zzb zznp;
		private static final zzb zznq;
		private static final zzb zznr;
		private static final zzb zzns;
		private static final zzb zznt[];
		private final int value;

		static 
		{
			zznp = new zzb("FORMAT_UNKNOWN", 0, 0);
		//    0    0:new             #2   <Class zzcz$zzf$zzb>
		//    1    3:dup             
		//    2    4:ldc1            #29  <String "FORMAT_UNKNOWN">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #33  <Method void zzcz$zzf$zzb(String, int, int)>
		//    6   11:putstatic       #35  <Field zzcz$zzf$zzb zznp>
			zznq = new zzb("FORMAT_LUMINANCE", 1, 1);
		//    7   14:new             #2   <Class zzcz$zzf$zzb>
		//    8   17:dup             
		//    9   18:ldc1            #37  <String "FORMAT_LUMINANCE">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #33  <Method void zzcz$zzf$zzb(String, int, int)>
		//   13   25:putstatic       #39  <Field zzcz$zzf$zzb zznq>
			zznr = new zzb("FORMAT_RGB8", 2, 2);
		//   14   28:new             #2   <Class zzcz$zzf$zzb>
		//   15   31:dup             
		//   16   32:ldc1            #41  <String "FORMAT_RGB8">
		//   17   34:iconst_2        
		//   18   35:iconst_2        
		//   19   36:invokespecial   #33  <Method void zzcz$zzf$zzb(String, int, int)>
		//   20   39:putstatic       #43  <Field zzcz$zzf$zzb zznr>
			zzns = new zzb("FORMAT_MONOCHROME", 3, 3);
		//   21   42:new             #2   <Class zzcz$zzf$zzb>
		//   22   45:dup             
		//   23   46:ldc1            #45  <String "FORMAT_MONOCHROME">
		//   24   48:iconst_3        
		//   25   49:iconst_3        
		//   26   50:invokespecial   #33  <Method void zzcz$zzf$zzb(String, int, int)>
		//   27   53:putstatic       #47  <Field zzcz$zzf$zzb zzns>
			zznt = (new zzb[] {
				zznp, zznq, zznr, zzns
			});
		//   28   56:iconst_4        
		//   29   57:anewarray       zzb[]
		//   30   60:dup             
		//   31   61:iconst_0        
		//   32   62:getstatic       #35  <Field zzcz$zzf$zzb zznp>
		//   33   65:aastore         
		//   34   66:dup             
		//   35   67:iconst_1        
		//   36   68:getstatic       #39  <Field zzcz$zzf$zzb zznq>
		//   37   71:aastore         
		//   38   72:dup             
		//   39   73:iconst_2        
		//   40   74:getstatic       #43  <Field zzcz$zzf$zzb zznr>
		//   41   77:aastore         
		//   42   78:dup             
		//   43   79:iconst_3        
		//   44   80:getstatic       #47  <Field zzcz$zzf$zzb zzns>
		//   45   83:aastore         
		//   46   84:putstatic       #49  <Field zzcz$zzf$zzb[] zznt>
		//   47   87:new             #51  <Class zzdf>
		//   48   90:dup             
		//   49   91:invokespecial   #53  <Method void zzdf()>
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


	static zzcz$zzf zzbw()
	{
		return zzno;
	//    0    0:getstatic       #36  <Field zzcz$zzf zzno>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzda.zzbc[i - 1];
	//    0    0:getstatic       #50  <Field int[] zzda.zzbc>
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
		obj = ((Object) (zzbf));
	//   15   63:getstatic       #61  <Field zzhq zzbf>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/vision/zzcz$zzf;
	//   19   71:ldc1            #2   <Class zzcz$zzf>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbf));
	//   21   74:getstatic       #61  <Field zzhq zzbf>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzfy$zzb(((zzfy) (zzno)))));
	//   27   84:new             #63  <Class zzfy$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #36  <Field zzcz$zzf zzno>
	//   30   91:invokespecial   #66  <Method void zzfy$zzb(zzfy)>
	//   31   94:astore_2        
		zzbf = ((zzhq) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #61  <Field zzhq zzbf>
_L12:
		com/google/android/gms/internal/vision/zzcz$zzf;
	//   34   99:ldc1            #2   <Class zzcz$zzf>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/vision/zzcz$zzf;
	//   39  105:ldc1            #2   <Class zzcz$zzf>
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
		return ((Object) (zzno));
	//   45  112:getstatic       #36  <Field zzcz$zzf zzno>
	//   46  115:areturn         
_L4:
		obj = ((Object) (zzb.zzah()));
	//   47  116:invokestatic    #70  <Method zzgd zzcz$zzf$zzb.zzah()>
	//   48  119:astore_2        
		return zza(((zzhf) (zzno)), "\001\005\000\001\001\005\005\000\000\000\001\f\000\002\002\001\003\002\002\004\002\004\005\002\003", new Object[] {
			"zzbg", "zzlx", obj, "zznl", "zznm", "zzhr", "zznn"
		});
	//   49  120:getstatic       #36  <Field zzcz$zzf zzno>
	//   50  123:ldc1            #72  <String "\001\005\000\001\001\005\005\000\000\000\001\f\000\002\002\001\003\002\002\004\002\004\005\002\003">
	//   51  125:bipush          7
	//   52  127:anewarray       Object[]
	//   53  130:dup             
	//   54  131:iconst_0        
	//   55  132:ldc1            #75  <String "zzbg">
	//   56  134:aastore         
	//   57  135:dup             
	//   58  136:iconst_1        
	//   59  137:ldc1            #76  <String "zzlx">
	//   60  139:aastore         
	//   61  140:dup             
	//   62  141:iconst_2        
	//   63  142:aload_2         
	//   64  143:aastore         
	//   65  144:dup             
	//   66  145:iconst_3        
	//   67  146:ldc1            #77  <String "zznl">
	//   68  148:aastore         
	//   69  149:dup             
	//   70  150:iconst_4        
	//   71  151:ldc1            #78  <String "zznm">
	//   72  153:aastore         
	//   73  154:dup             
	//   74  155:iconst_5        
	//   75  156:ldc1            #79  <String "zzhr">
	//   76  158:aastore         
	//   77  159:dup             
	//   78  160:bipush          6
	//   79  162:ldc1            #80  <String "zznn">
	//   80  164:aastore         
	//   81  165:invokestatic    #83  <Method Object zza(zzhf, String, Object[])>
	//   82  168:areturn         
_L3:
		return ((Object) (new zza(((zzda) (null)))));
	//   83  169:new             #12  <Class zzcz$zzf$zza>
	//   84  172:dup             
	//   85  173:aconst_null     
	//   86  174:invokespecial   #86  <Method void zzcz$zzf$zza(zzda)>
	//   87  177:areturn         
_L2:
		return ((Object) (new zzcz$zzf()));
	//   88  178:new             #2   <Class zzcz$zzf>
	//   89  181:dup             
	//   90  182:invokespecial   #34  <Method void zzcz$zzf()>
	//   91  185:areturn         
	}

	private static volatile zzhq zzbf;
	private static final zzcz$zzf zzno;
	private int zzbg;
	private long zzhr;
	private int zzlx;
	private long zznl;
	private long zznm;
	private long zznn;

	static 
	{
		zzno = new zzcz$zzf();
	//    0    0:new             #2   <Class zzcz$zzf>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void zzcz$zzf()>
	//    3    7:putstatic       #36  <Field zzcz$zzf zzno>
		zzfy.zza(com/google/android/gms/internal/vision/zzcz$zzf, ((zzfy) (zzno)));
	//    4   10:ldc1            #2   <Class zzcz$zzf>
	//    5   12:getstatic       #36  <Field zzcz$zzf zzno>
	//    6   15:invokestatic    #39  <Method void zzfy.zza(Class, zzfy)>
	//*   7   18:return          
	}

	private zzcz$zzf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void zzfy()>
	//    2    4:return          
	}
}
