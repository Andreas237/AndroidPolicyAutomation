// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbo, zzbcw, zzbah, zzaxj, 
//			zzbdf, zzbbr, zzaxk, zzbbs

public final class zzaxi extends zzbbo
	implements zzbcw
{
	public static final class zza extends zzbbo.zza
		implements zzbcw
	{

		public final zza zzai(zzbah zzbah1)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzaxi.zza((zzaxi)zzdtx, zzbah1);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzaxi>
		//    5   11:aload_1         
		//    6   12:invokestatic    #35  <Method void zzaxi.zza(zzaxi, zzbah)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public final zza zzb(zzb zzb1)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzaxi.zza((zzaxi)zzdtx, zzb1);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzaxi>
		//    5   11:aload_1         
		//    6   12:invokestatic    #40  <Method void zzaxi.zza(zzaxi, zzaxi$zzb)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public final zza zzeb(String s)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzaxi.zza((zzaxi)zzdtx, s);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzaxi>
		//    5   11:aload_1         
		//    6   12:invokestatic    #45  <Method void zzaxi.zza(zzaxi, String)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		private zza()
		{
			super(((zzbbo) (zzaxi.zzzb())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #16  <Method zzaxi zzaxi.zzzb()>
		//    2    4:invokespecial   #19  <Method void zzbbo$zza(zzbbo)>
		//    3    7:return          
		}

		zza(zzaxj zzaxj1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void zzaxi$zza()>
		//    2    4:return          
		}
	}

	public static final class zzb extends Enum
		implements zzbbr
	{

		public static zzb[] values()
		{
			return (zzb[])((zzb []) (zzdlc)).clone();
		//    0    0:getstatic       #56  <Field zzaxi$zzb[] zzdlc>
		//    1    3:invokevirtual   #77  <Method Object _5B_Lcom.google.android.gms.internal.ads.zzaxi$zzb_3B_.clone()>
		//    2    6:checkcast       #73  <Class zzaxi$zzb[]>
		//    3    9:areturn         
		}

		public static zzb zzaw(int i)
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
				return zzdla;
		//    4   38:getstatic       #50  <Field zzaxi$zzb zzdla>
		//    5   41:areturn         

			case 3: // '\003'
				return zzdkz;
		//    6   42:getstatic       #46  <Field zzaxi$zzb zzdkz>
		//    7   45:areturn         

			case 2: // '\002'
				return zzdky;
		//    8   46:getstatic       #42  <Field zzaxi$zzb zzdky>
		//    9   49:areturn         

			case 1: // '\001'
				return zzdkx;
		//   10   50:getstatic       #38  <Field zzaxi$zzb zzdkx>
		//   11   53:areturn         

			case 0: // '\0'
				return zzdkw;
		//   12   54:getstatic       #34  <Field zzaxi$zzb zzdkw>
		//   13   57:areturn         
			}
		}

		public final int zzhq()
		{
			if(this == zzdlb)
		//*   0    0:aload_0         
		//*   1    1:getstatic       #54  <Field zzaxi$zzb zzdlb>
		//*   2    4:if_acmpne       17
				throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
		//    3    7:new             #83  <Class IllegalArgumentException>
		//    4   10:dup             
		//    5   11:ldc1            #85  <String "Can't get the number of an unknown enum value.">
		//    6   13:invokespecial   #88  <Method void IllegalArgumentException(String)>
		//    7   16:athrow          
			else
				return value;
		//    8   17:aload_0         
		//    9   18:getfield        #68  <Field int value>
		//   10   21:ireturn         
		}

		private static final zzbbs zzall = new zzaxk();
		public static final zzb zzdkw;
		public static final zzb zzdkx;
		public static final zzb zzdky;
		public static final zzb zzdkz;
		public static final zzb zzdla;
		public static final zzb zzdlb;
		private static final zzb zzdlc[];
		private final int value;

		static 
		{
			zzdkw = new zzb("UNKNOWN_KEYMATERIAL", 0, 0);
		//    0    0:new             #2   <Class zzaxi$zzb>
		//    1    3:dup             
		//    2    4:ldc1            #28  <String "UNKNOWN_KEYMATERIAL">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #32  <Method void zzaxi$zzb(String, int, int)>
		//    6   11:putstatic       #34  <Field zzaxi$zzb zzdkw>
			zzdkx = new zzb("SYMMETRIC", 1, 1);
		//    7   14:new             #2   <Class zzaxi$zzb>
		//    8   17:dup             
		//    9   18:ldc1            #36  <String "SYMMETRIC">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #32  <Method void zzaxi$zzb(String, int, int)>
		//   13   25:putstatic       #38  <Field zzaxi$zzb zzdkx>
			zzdky = new zzb("ASYMMETRIC_PRIVATE", 2, 2);
		//   14   28:new             #2   <Class zzaxi$zzb>
		//   15   31:dup             
		//   16   32:ldc1            #40  <String "ASYMMETRIC_PRIVATE">
		//   17   34:iconst_2        
		//   18   35:iconst_2        
		//   19   36:invokespecial   #32  <Method void zzaxi$zzb(String, int, int)>
		//   20   39:putstatic       #42  <Field zzaxi$zzb zzdky>
			zzdkz = new zzb("ASYMMETRIC_PUBLIC", 3, 3);
		//   21   42:new             #2   <Class zzaxi$zzb>
		//   22   45:dup             
		//   23   46:ldc1            #44  <String "ASYMMETRIC_PUBLIC">
		//   24   48:iconst_3        
		//   25   49:iconst_3        
		//   26   50:invokespecial   #32  <Method void zzaxi$zzb(String, int, int)>
		//   27   53:putstatic       #46  <Field zzaxi$zzb zzdkz>
			zzdla = new zzb("REMOTE", 4, 4);
		//   28   56:new             #2   <Class zzaxi$zzb>
		//   29   59:dup             
		//   30   60:ldc1            #48  <String "REMOTE">
		//   31   62:iconst_4        
		//   32   63:iconst_4        
		//   33   64:invokespecial   #32  <Method void zzaxi$zzb(String, int, int)>
		//   34   67:putstatic       #50  <Field zzaxi$zzb zzdla>
			zzdlb = new zzb("UNRECOGNIZED", 5, -1);
		//   35   70:new             #2   <Class zzaxi$zzb>
		//   36   73:dup             
		//   37   74:ldc1            #52  <String "UNRECOGNIZED">
		//   38   76:iconst_5        
		//   39   77:iconst_m1       
		//   40   78:invokespecial   #32  <Method void zzaxi$zzb(String, int, int)>
		//   41   81:putstatic       #54  <Field zzaxi$zzb zzdlb>
			zzdlc = (new zzb[] {
				zzdkw, zzdkx, zzdky, zzdkz, zzdla, zzdlb
			});
		//   42   84:bipush          6
		//   43   86:anewarray       zzb[]
		//   44   89:dup             
		//   45   90:iconst_0        
		//   46   91:getstatic       #34  <Field zzaxi$zzb zzdkw>
		//   47   94:aastore         
		//   48   95:dup             
		//   49   96:iconst_1        
		//   50   97:getstatic       #38  <Field zzaxi$zzb zzdkx>
		//   51  100:aastore         
		//   52  101:dup             
		//   53  102:iconst_2        
		//   54  103:getstatic       #42  <Field zzaxi$zzb zzdky>
		//   55  106:aastore         
		//   56  107:dup             
		//   57  108:iconst_3        
		//   58  109:getstatic       #46  <Field zzaxi$zzb zzdkz>
		//   59  112:aastore         
		//   60  113:dup             
		//   61  114:iconst_4        
		//   62  115:getstatic       #50  <Field zzaxi$zzb zzdla>
		//   63  118:aastore         
		//   64  119:dup             
		//   65  120:iconst_5        
		//   66  121:getstatic       #54  <Field zzaxi$zzb zzdlb>
		//   67  124:aastore         
		//   68  125:putstatic       #56  <Field zzaxi$zzb[] zzdlc>
		//   69  128:new             #58  <Class zzaxk>
		//   70  131:dup             
		//   71  132:invokespecial   #60  <Method void zzaxk()>
		//   72  135:putstatic       #62  <Field zzbbs zzall>
		//*  73  138:return          
		}

		private zzb(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #66  <Method void Enum(String, int)>
			value = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #68  <Field int value>
		//    7   11:return          
		}
	}


	private zzaxi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void zzbbo()>
		zzdks = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #38  <String "">
	//    4    7:putfield        #40  <Field String zzdks>
		zzdkt = zzbah.zzdpq;
	//    5   10:aload_0         
	//    6   11:getstatic       #45  <Field zzbah zzbah.zzdpq>
	//    7   14:putfield        #47  <Field zzbah zzdkt>
	//    8   17:return          
	}

	private final void zza(zzb zzb1)
	{
		if(zzb1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #50  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #51  <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			zzdku = zzb1.zzhq();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #55  <Method int zzaxi$zzb.zzhq()>
	//    9   17:putfield        #57  <Field int zzdku>
			return;
	//   10   20:return          
		}
	}

	static void zza(zzaxi zzaxi1, zzb zzb1)
	{
		zzaxi1.zza(zzb1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #60  <Method void zza(zzaxi$zzb)>
	//    3    5:return          
	}

	static void zza(zzaxi zzaxi1, zzbah zzbah1)
	{
		zzaxi1.zzah(zzbah1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #65  <Method void zzah(zzbah)>
	//    3    5:return          
	}

	static void zza(zzaxi zzaxi1, String s)
	{
		zzaxi1.zzea(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #70  <Method void zzea(String)>
	//    3    5:return          
	}

	private final void zzah(zzbah zzbah1)
	{
		if(zzbah1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #50  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #51  <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			zzdkt = zzbah1;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #47  <Field zzbah zzdkt>
			return;
	//    9   17:return          
		}
	}

	private final void zzea(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #50  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #51  <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			zzdks = s;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #40  <Field String zzdks>
			return;
	//    9   17:return          
		}
	}

	public static zza zzyz()
	{
		return (zza)(zzbbo.zza)((zzbbo) (zzdkv)).zza(zzbbo.zze.zzdue, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #31  <Field zzaxi zzdkv>
	//    1    3:getstatic       #77  <Field int zzbbo$zze.zzdue>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #80  <Method Object zzbbo.zza(int, Object, Object)>
	//    5   11:checkcast       #82  <Class zzbbo$zza>
	//    6   14:checkcast       #9   <Class zzaxi$zza>
	//    7   17:areturn         
	}

	public static zzaxi zzza()
	{
		return zzdkv;
	//    0    0:getstatic       #31  <Field zzaxi zzdkv>
	//    1    3:areturn         
	}

	static zzaxi zzzb()
	{
		return zzdkv;
	//    0    0:getstatic       #31  <Field zzaxi zzdkv>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzaxj.zzakf[i - 1];
	//    0    0:getstatic       #91  <Field int[] zzaxj.zzakf>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 153
	//	               2 144
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 153
	//	               2 144
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #93  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #94  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #100 <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzakh));
	//   15   63:getstatic       #102 <Field zzbdf zzakh>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/zzaxi;
	//   19   71:ldc1            #2   <Class zzaxi>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzakh));
	//   21   74:getstatic       #102 <Field zzbdf zzakh>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzbbo.zzb(((zzbbo) (zzdkv)))));
	//   27   84:new             #104 <Class zzbbo$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #31  <Field zzaxi zzdkv>
	//   30   91:invokespecial   #107 <Method void zzbbo$zzb(zzbbo)>
	//   31   94:astore_2        
		zzakh = ((zzbdf) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #102 <Field zzbdf zzakh>
_L12:
		com/google/android/gms/internal/ads/zzaxi;
	//   34   99:ldc1            #2   <Class zzaxi>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/zzaxi;
	//   39  105:ldc1            #2   <Class zzaxi>
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
		return ((Object) (zzdkv));
	//   45  112:getstatic       #31  <Field zzaxi zzdkv>
	//   46  115:areturn         
_L4:
		return zza(((zzbcu) (zzdkv)), "\000\003\000\000\001\003\003\004\000\000\000\001\u0208\002\n\003\f", new Object[] {
			"zzdks", "zzdkt", "zzdku"
		});
	//   47  116:getstatic       #31  <Field zzaxi zzdkv>
	//   48  119:ldc1            #109 <String "\000\003\000\000\001\003\003\004\000\000\000\001\u0208\002\n\003\f">
	//   49  121:iconst_3        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #112 <String "zzdks">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #113 <String "zzdkt">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #114 <String "zzdku">
	//   62  139:aastore         
	//   63  140:invokestatic    #117 <Method Object zza(zzbcu, String, Object[])>
	//   64  143:areturn         
_L3:
		return ((Object) (new zza(((zzaxj) (null)))));
	//   65  144:new             #9   <Class zzaxi$zza>
	//   66  147:dup             
	//   67  148:aconst_null     
	//   68  149:invokespecial   #120 <Method void zzaxi$zza(zzaxj)>
	//   69  152:areturn         
_L2:
		return ((Object) (new zzaxi()));
	//   70  153:new             #2   <Class zzaxi>
	//   71  156:dup             
	//   72  157:invokespecial   #29  <Method void zzaxi()>
	//   73  160:areturn         
	}

	public final String zzyw()
	{
		return zzdks;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String zzdks>
	//    2    4:areturn         
	}

	public final zzbah zzyx()
	{
		return zzdkt;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field zzbah zzdkt>
	//    2    4:areturn         
	}

	public final zzb zzyy()
	{
		zzb zzb2 = zzb.zzaw(zzdku);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int zzdku>
	//    2    4:invokestatic    #130 <Method zzaxi$zzb zzaxi$zzb.zzaw(int)>
	//    3    7:astore_2        
		zzb zzb1 = zzb2;
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(zzb2 == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       18
			zzb1 = zzb.zzdlb;
	//    8   14:getstatic       #134 <Field zzaxi$zzb zzaxi$zzb.zzdlb>
	//    9   17:astore_1        
		return zzb1;
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	private static volatile zzbdf zzakh;
	private static final zzaxi zzdkv;
	private String zzdks;
	private zzbah zzdkt;
	private int zzdku;

	static 
	{
		zzdkv = new zzaxi();
	//    0    0:new             #2   <Class zzaxi>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void zzaxi()>
	//    3    7:putstatic       #31  <Field zzaxi zzdkv>
		zzbbo.zza(com/google/android/gms/internal/ads/zzaxi, ((zzbbo) (zzdkv)));
	//    4   10:ldc1            #2   <Class zzaxi>
	//    5   12:getstatic       #31  <Field zzaxi zzdkv>
	//    6   15:invokestatic    #34  <Method void zzbbo.zza(Class, zzbbo)>
	//*   7   18:return          
	}
}
