// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbo, zzbcw, zzaxq, zzbdf

public final class zzaxp extends zzbbo
	implements zzbcw
{
	public static final class zza extends zzbbo.zza
		implements zzbcw
	{

		public final zza zzao(boolean flag)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzaxp.zza((zzaxp)zzdtx, true);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzaxp>
		//    5   11:iconst_1        
		//    6   12:invokestatic    #35  <Method void zzaxp.zza(zzaxp, boolean)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public final zza zzaz(int i)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzaxp.zza((zzaxp)zzdtx, 0);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzaxp>
		//    5   11:iconst_0        
		//    6   12:invokestatic    #40  <Method void zzaxp.zza(zzaxp, int)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public final zza zzee(String s)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzaxp.zza((zzaxp)zzdtx, s);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzaxp>
		//    5   11:aload_1         
		//    6   12:invokestatic    #45  <Method void zzaxp.zza(zzaxp, String)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public final zza zzef(String s)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzaxp.zzb((zzaxp)zzdtx, s);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzaxp>
		//    5   11:aload_1         
		//    6   12:invokestatic    #49  <Method void zzaxp.zzb(zzaxp, String)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public final zza zzeg(String s)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzaxp.zzc((zzaxp)zzdtx, s);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzaxp>
		//    5   11:aload_1         
		//    6   12:invokestatic    #53  <Method void zzaxp.zzc(zzaxp, String)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		private zza()
		{
			super(((zzbbo) (zzaxp.zzzj())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #16  <Method zzaxp zzaxp.zzzj()>
		//    2    4:invokespecial   #19  <Method void zzbbo$zza(zzbbo)>
		//    3    7:return          
		}

		zza(zzaxq zzaxq1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void zzaxp$zza()>
		//    2    4:return          
		}
	}


	private zzaxp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void zzbbo()>
		zzdll = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #37  <String "">
	//    4    7:putfield        #39  <Field String zzdll>
		zzdks = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #37  <String "">
	//    7   13:putfield        #41  <Field String zzdks>
		zzdlo = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #37  <String "">
	//   10   19:putfield        #43  <Field String zzdlo>
	//   11   22:return          
	}

	static void zza(zzaxp zzaxp1, int i)
	{
		zzaxp1.zzay(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #48  <Method void zzay(int)>
	//    3    5:return          
	}

	static void zza(zzaxp zzaxp1, String s)
	{
		zzaxp1.zzec(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #53  <Method void zzec(String)>
	//    3    5:return          
	}

	static void zza(zzaxp zzaxp1, boolean flag)
	{
		zzaxp1.zzan(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #58  <Method void zzan(boolean)>
	//    3    5:return          
	}

	private final void zzan(boolean flag)
	{
		zzdln = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #60  <Field boolean zzdln>
	//    3    5:return          
	}

	private final void zzay(int i)
	{
		zzdlm = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #62  <Field int zzdlm>
	//    3    5:return          
	}

	static void zzb(zzaxp zzaxp1, String s)
	{
		zzaxp1.zzea(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #66  <Method void zzea(String)>
	//    3    5:return          
	}

	static void zzc(zzaxp zzaxp1, String s)
	{
		zzaxp1.zzed(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #70  <Method void zzed(String)>
	//    3    5:return          
	}

	private final void zzea(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #72  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #73  <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			zzdks = s;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #41  <Field String zzdks>
			return;
	//    9   17:return          
		}
	}

	private final void zzec(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #72  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #73  <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			zzdll = s;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #39  <Field String zzdll>
			return;
	//    9   17:return          
		}
	}

	private final void zzed(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #72  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #73  <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			zzdlo = s;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #43  <Field String zzdlo>
			return;
	//    9   17:return          
		}
	}

	public static zza zzzi()
	{
		return (zza)(zzbbo.zza)((zzbbo) (zzdlp)).zza(zzbbo.zze.zzdue, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #30  <Field zzaxp zzdlp>
	//    1    3:getstatic       #80  <Field int zzbbo$zze.zzdue>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #83  <Method Object zzbbo.zza(int, Object, Object)>
	//    5   11:checkcast       #85  <Class zzbbo$zza>
	//    6   14:checkcast       #9   <Class zzaxp$zza>
	//    7   17:areturn         
	}

	static zzaxp zzzj()
	{
		return zzdlp;
	//    0    0:getstatic       #30  <Field zzaxp zzdlp>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzaxq.zzakf[i - 1];
	//    0    0:getstatic       #93  <Field int[] zzaxq.zzakf>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 163
	//	               2 154
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 163
	//	               2 154
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #95  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #96  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #102 <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzakh));
	//   15   63:getstatic       #104 <Field zzbdf zzakh>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/zzaxp;
	//   19   71:ldc1            #2   <Class zzaxp>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzakh));
	//   21   74:getstatic       #104 <Field zzbdf zzakh>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzbbo.zzb(((zzbbo) (zzdlp)))));
	//   27   84:new             #106 <Class zzbbo$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #30  <Field zzaxp zzdlp>
	//   30   91:invokespecial   #109 <Method void zzbbo$zzb(zzbbo)>
	//   31   94:astore_2        
		zzakh = ((zzbdf) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #104 <Field zzbdf zzakh>
_L12:
		com/google/android/gms/internal/ads/zzaxp;
	//   34   99:ldc1            #2   <Class zzaxp>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/zzaxp;
	//   39  105:ldc1            #2   <Class zzaxp>
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
		return ((Object) (zzdlp));
	//   45  112:getstatic       #30  <Field zzaxp zzdlp>
	//   46  115:areturn         
_L4:
		return zza(((zzbcu) (zzdlp)), "\000\005\000\000\001\005\005\006\000\000\000\001\u0208\002\u0208\003\013\004\007\005\u0208", new Object[] {
			"zzdll", "zzdks", "zzdlm", "zzdln", "zzdlo"
		});
	//   47  116:getstatic       #30  <Field zzaxp zzdlp>
	//   48  119:ldc1            #111 <String "\000\005\000\000\001\005\005\006\000\000\000\001\u0208\002\u0208\003\013\004\007\005\u0208">
	//   49  121:iconst_5        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #114 <String "zzdll">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #115 <String "zzdks">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #116 <String "zzdlm">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #117 <String "zzdln">
	//   66  144:aastore         
	//   67  145:dup             
	//   68  146:iconst_4        
	//   69  147:ldc1            #118 <String "zzdlo">
	//   70  149:aastore         
	//   71  150:invokestatic    #121 <Method Object zza(zzbcu, String, Object[])>
	//   72  153:areturn         
_L3:
		return ((Object) (new zza(((zzaxq) (null)))));
	//   73  154:new             #9   <Class zzaxp$zza>
	//   74  157:dup             
	//   75  158:aconst_null     
	//   76  159:invokespecial   #124 <Method void zzaxp$zza(zzaxq)>
	//   77  162:areturn         
_L2:
		return ((Object) (new zzaxp()));
	//   78  163:new             #2   <Class zzaxp>
	//   79  166:dup             
	//   80  167:invokespecial   #28  <Method void zzaxp()>
	//   81  170:areturn         
	}

	public final String zzyw()
	{
		return zzdks;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String zzdks>
	//    2    4:areturn         
	}

	public final String zzze()
	{
		return zzdll;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String zzdll>
	//    2    4:areturn         
	}

	public final int zzzf()
	{
		return zzdlm;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int zzdlm>
	//    2    4:ireturn         
	}

	public final boolean zzzg()
	{
		return zzdln;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field boolean zzdln>
	//    2    4:ireturn         
	}

	public final String zzzh()
	{
		return zzdlo;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String zzdlo>
	//    2    4:areturn         
	}

	private static volatile zzbdf zzakh;
	private static final zzaxp zzdlp;
	private String zzdks;
	private String zzdll;
	private int zzdlm;
	private boolean zzdln;
	private String zzdlo;

	static 
	{
		zzdlp = new zzaxp();
	//    0    0:new             #2   <Class zzaxp>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void zzaxp()>
	//    3    7:putstatic       #30  <Field zzaxp zzdlp>
		zzbbo.zza(com/google/android/gms/internal/ads/zzaxp, ((zzbbo) (zzdlp)));
	//    4   10:ldc1            #2   <Class zzaxp>
	//    5   12:getstatic       #30  <Field zzaxp zzdlp>
	//    6   15:invokestatic    #33  <Method void zzbbo.zza(Class, zzbbo)>
	//*   7   18:return          
	}
}
