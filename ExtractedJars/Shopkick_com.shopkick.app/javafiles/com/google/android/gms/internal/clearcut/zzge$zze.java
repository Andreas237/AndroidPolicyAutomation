// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcg, zzdq, zzge, zzgf, 
//			zzdz, zzcj, zzgg, zzck

public static final class zzge$zze extends zzcg
	implements zzdq
{
	public static final class zza extends zzcg.zza
		implements zzdq
	{

		private zza()
		{
			super(((zzcg) (zzge.zze.zzex())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #19  <Method zzge$zze zzge$zze.zzex()>
		//    2    4:invokespecial   #22  <Method void zzcg$zza(zzcg)>
		//    3    7:return          
		}

		zza(zzgf zzgf1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void zzge$zze$zza()>
		//    2    4:return          
		}
	}

	public static final class zzb extends Enum
		implements zzcj
	{

		public static zzb[] values()
		{
			return (zzb[])((zzb []) (zzuh)).clone();
		//    0    0:getstatic       #54  <Field zzge$zze$zzb[] zzuh>
		//    1    3:invokevirtual   #75  <Method Object _5B_Lcom.google.android.gms.internal.clearcut.zzge$zze$zzb_3B_.clone()>
		//    2    6:checkcast       #71  <Class zzge$zze$zzb[]>
		//    3    9:areturn         
		}

		public static zzb zzar(int i)
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
				return zzug;
		//    4   38:getstatic       #52  <Field zzge$zze$zzb zzug>
		//    5   41:areturn         

			case 3: // '\003'
				return zzuf;
		//    6   42:getstatic       #48  <Field zzge$zze$zzb zzuf>
		//    7   45:areturn         

			case 2: // '\002'
				return zzue;
		//    8   46:getstatic       #44  <Field zzge$zze$zzb zzue>
		//    9   49:areturn         

			case 1: // '\001'
				return zzud;
		//   10   50:getstatic       #40  <Field zzge$zze$zzb zzud>
		//   11   53:areturn         

			case 0: // '\0'
				return zzuc;
		//   12   54:getstatic       #36  <Field zzge$zze$zzb zzuc>
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

		private static final zzck zzbq = new zzgg();
		private static final zzb zzuc;
		private static final zzb zzud;
		private static final zzb zzue;
		private static final zzb zzuf;
		private static final zzb zzug;
		private static final zzb zzuh[];
		private final int value;

		static 
		{
			zzuc = new zzb("CLIENT_UNKNOWN", 0, 0);
		//    0    0:new             #2   <Class zzge$zze$zzb>
		//    1    3:dup             
		//    2    4:ldc1            #30  <String "CLIENT_UNKNOWN">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #34  <Method void zzge$zze$zzb(String, int, int)>
		//    6   11:putstatic       #36  <Field zzge$zze$zzb zzuc>
			zzud = new zzb("CHIRP", 1, 1);
		//    7   14:new             #2   <Class zzge$zze$zzb>
		//    8   17:dup             
		//    9   18:ldc1            #38  <String "CHIRP">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #34  <Method void zzge$zze$zzb(String, int, int)>
		//   13   25:putstatic       #40  <Field zzge$zze$zzb zzud>
			zzue = new zzb("WAYMO", 2, 2);
		//   14   28:new             #2   <Class zzge$zze$zzb>
		//   15   31:dup             
		//   16   32:ldc1            #42  <String "WAYMO">
		//   17   34:iconst_2        
		//   18   35:iconst_2        
		//   19   36:invokespecial   #34  <Method void zzge$zze$zzb(String, int, int)>
		//   20   39:putstatic       #44  <Field zzge$zze$zzb zzue>
			zzuf = new zzb("GV_ANDROID", 3, 3);
		//   21   42:new             #2   <Class zzge$zze$zzb>
		//   22   45:dup             
		//   23   46:ldc1            #46  <String "GV_ANDROID">
		//   24   48:iconst_3        
		//   25   49:iconst_3        
		//   26   50:invokespecial   #34  <Method void zzge$zze$zzb(String, int, int)>
		//   27   53:putstatic       #48  <Field zzge$zze$zzb zzuf>
			zzug = new zzb("GV_IOS", 4, 4);
		//   28   56:new             #2   <Class zzge$zze$zzb>
		//   29   59:dup             
		//   30   60:ldc1            #50  <String "GV_IOS">
		//   31   62:iconst_4        
		//   32   63:iconst_4        
		//   33   64:invokespecial   #34  <Method void zzge$zze$zzb(String, int, int)>
		//   34   67:putstatic       #52  <Field zzge$zze$zzb zzug>
			zzuh = (new zzb[] {
				zzuc, zzud, zzue, zzuf, zzug
			});
		//   35   70:iconst_5        
		//   36   71:anewarray       zzb[]
		//   37   74:dup             
		//   38   75:iconst_0        
		//   39   76:getstatic       #36  <Field zzge$zze$zzb zzuc>
		//   40   79:aastore         
		//   41   80:dup             
		//   42   81:iconst_1        
		//   43   82:getstatic       #40  <Field zzge$zze$zzb zzud>
		//   44   85:aastore         
		//   45   86:dup             
		//   46   87:iconst_2        
		//   47   88:getstatic       #44  <Field zzge$zze$zzb zzue>
		//   48   91:aastore         
		//   49   92:dup             
		//   50   93:iconst_3        
		//   51   94:getstatic       #48  <Field zzge$zze$zzb zzuf>
		//   52   97:aastore         
		//   53   98:dup             
		//   54   99:iconst_4        
		//   55  100:getstatic       #52  <Field zzge$zze$zzb zzug>
		//   56  103:aastore         
		//   57  104:putstatic       #54  <Field zzge$zze$zzb[] zzuh>
		//   58  107:new             #56  <Class zzgg>
		//   59  110:dup             
		//   60  111:invokespecial   #58  <Method void zzgg()>
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


	static zzge$zze zzex()
	{
		return zzub;
	//    0    0:getstatic       #34  <Field zzge$zze zzub>
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
		com/google/android/gms/internal/clearcut/zzge$zze;
	//   19   71:ldc1            #2   <Class zzge$zze>
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
		obj = ((Object) (new zzcg$zzb(((zzcg) (zzub)))));
	//   27   84:new             #67  <Class zzcg$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #34  <Field zzge$zze zzub>
	//   30   91:invokespecial   #70  <Method void zzcg$zzb(zzcg)>
	//   31   94:astore_2        
		zzbg = ((zzdz) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #65  <Field zzdz zzbg>
_L12:
		com/google/android/gms/internal/clearcut/zzge$zze;
	//   34   99:ldc1            #2   <Class zzge$zze>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/zzge$zze;
	//   39  105:ldc1            #2   <Class zzge$zze>
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
		return ((Object) (zzub));
	//   45  112:getstatic       #34  <Field zzge$zze zzub>
	//   46  115:areturn         
_L4:
		obj = ((Object) (zzb.zzd()));
	//   47  116:invokestatic    #74  <Method zzck zzge$zze$zzb.zzd()>
	//   48  119:astore_2        
		return zza(((zzdo) (zzub)), "\001\003\000\001\001\003\003\004\000\000\000\001\f\000\002\b\001\003\b\002", new Object[] {
			"zzbb", "zzty", obj, "zztz", "zzua"
		});
	//   49  120:getstatic       #34  <Field zzge$zze zzub>
	//   50  123:ldc1            #76  <String "\001\003\000\001\001\003\003\004\000\000\000\001\f\000\002\b\001\003\b\002">
	//   51  125:iconst_5        
	//   52  126:anewarray       Object[]
	//   53  129:dup             
	//   54  130:iconst_0        
	//   55  131:ldc1            #79  <String "zzbb">
	//   56  133:aastore         
	//   57  134:dup             
	//   58  135:iconst_1        
	//   59  136:ldc1            #80  <String "zzty">
	//   60  138:aastore         
	//   61  139:dup             
	//   62  140:iconst_2        
	//   63  141:aload_2         
	//   64  142:aastore         
	//   65  143:dup             
	//   66  144:iconst_3        
	//   67  145:ldc1            #81  <String "zztz">
	//   68  147:aastore         
	//   69  148:dup             
	//   70  149:iconst_4        
	//   71  150:ldc1            #82  <String "zzua">
	//   72  152:aastore         
	//   73  153:invokestatic    #85  <Method Object zza(zzdo, String, Object[])>
	//   74  156:areturn         
_L3:
		return ((Object) (new zza(((zzgf) (null)))));
	//   75  157:new             #12  <Class zzge$zze$zza>
	//   76  160:dup             
	//   77  161:aconst_null     
	//   78  162:invokespecial   #88  <Method void zzge$zze$zza(zzgf)>
	//   79  165:areturn         
_L2:
		return ((Object) (new zzge$zze()));
	//   80  166:new             #2   <Class zzge$zze>
	//   81  169:dup             
	//   82  170:invokespecial   #32  <Method void zzge$zze()>
	//   83  173:areturn         
	}

	private static volatile zzdz zzbg;
	private static final zzge$zze zzub;
	private int zzbb;
	private int zzty;
	private String zztz;
	private String zzua;

	static 
	{
		zzub = new zzge$zze();
	//    0    0:new             #2   <Class zzge$zze>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void zzge$zze()>
	//    3    7:putstatic       #34  <Field zzge$zze zzub>
		zzcg.zza(com/google/android/gms/internal/clearcut/zzge$zze, ((zzcg) (zzub)));
	//    4   10:ldc1            #2   <Class zzge$zze>
	//    5   12:getstatic       #34  <Field zzge$zze zzub>
	//    6   15:invokestatic    #37  <Method void zzcg.zza(Class, zzcg)>
	//*   7   18:return          
	}

	private zzge$zze()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void zzcg()>
		zztz = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #41  <String "">
	//    4    7:putfield        #43  <Field String zztz>
		zzua = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #41  <String "">
	//    7   13:putfield        #45  <Field String zzua>
	//    8   16:return          
	}
}
