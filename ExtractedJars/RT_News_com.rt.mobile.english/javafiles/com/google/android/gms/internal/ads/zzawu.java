// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbo, zzbcw, zzbah, zzbbu, 
//			zzawv, zzawq, zzbdf

public final class zzawu extends zzbbo
	implements zzbcw
{
	public static final class zza extends zzbbo.zza
		implements zzbcw
	{

		public final zza zzac(zzbah zzbah1)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzawu.zza((zzawu)zzdtx, zzbah1);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzawu>
		//    5   11:aload_1         
		//    6   12:invokestatic    #35  <Method void zzawu.zza(zzawu, zzbah)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public final zza zzad(zzbah zzbah1)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzawu.zzb((zzawu)zzdtx, zzbah1);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzawu>
		//    5   11:aload_1         
		//    6   12:invokestatic    #39  <Method void zzawu.zzb(zzawu, zzbah)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public final zza zzas(int i)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzawu.zza((zzawu)zzdtx, 0);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzawu>
		//    5   11:iconst_0        
		//    6   12:invokestatic    #44  <Method void zzawu.zza(zzawu, int)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public final zza zzc(zzawq zzawq1)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzawu.zza((zzawu)zzdtx, zzawq1);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzawu>
		//    5   11:aload_1         
		//    6   12:invokestatic    #49  <Method void zzawu.zza(zzawu, zzawq)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		private zza()
		{
			super(((zzbbo) (zzawu.zzyg())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #16  <Method zzawu zzawu.zzyg()>
		//    2    4:invokespecial   #19  <Method void zzbbo$zza(zzbbo)>
		//    3    7:return          
		}

		zza(zzawv zzawv1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void zzawu$zza()>
		//    2    4:return          
		}
	}


	private zzawu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void zzbbo()>
		zzdjr = zzbah.zzdpq;
	//    2    4:aload_0         
	//    3    5:getstatic       #39  <Field zzbah zzbah.zzdpq>
	//    4    8:putfield        #41  <Field zzbah zzdjr>
		zzdjs = zzbah.zzdpq;
	//    5   11:aload_0         
	//    6   12:getstatic       #39  <Field zzbah zzbah.zzdpq>
	//    7   15:putfield        #43  <Field zzbah zzdjs>
	//    8   18:return          
	}

	private final void setVersion(int i)
	{
		zzdih = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #47  <Field int zzdih>
	//    3    5:return          
	}

	static void zza(zzawu zzawu1, int i)
	{
		zzawu1.setVersion(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #50  <Method void setVersion(int)>
	//    3    5:return          
	}

	static void zza(zzawu zzawu1, zzawq zzawq1)
	{
		zzawu1.zzb(zzawq1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #55  <Method void zzb(zzawq)>
	//    3    5:return          
	}

	static void zza(zzawu zzawu1, zzbah zzbah1)
	{
		zzawu1.zzz(zzbah1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #60  <Method void zzz(zzbah)>
	//    3    5:return          
	}

	private final void zzaa(zzbah zzbah1)
	{
		if(zzbah1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #63  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #64  <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			zzdjs = zzbah1;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #43  <Field zzbah zzdjs>
			return;
	//    9   17:return          
		}
	}

	public static zzawu zzab(zzbah zzbah1)
		throws zzbbu
	{
		return (zzawu)zzbbo.zza(((zzbbo) (zzdjt)), zzbah1);
	//    0    0:getstatic       #29  <Field zzawu zzdjt>
	//    1    3:aload_0         
	//    2    4:invokestatic    #71  <Method zzbbo zzbbo.zza(zzbbo, zzbah)>
	//    3    7:checkcast       #2   <Class zzawu>
	//    4   10:areturn         
	}

	private final void zzb(zzawq zzawq1)
	{
		if(zzawq1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #63  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #64  <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			zzdjj = zzawq1;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #74  <Field zzawq zzdjj>
			return;
	//    9   17:return          
		}
	}

	static void zzb(zzawu zzawu1, zzbah zzbah1)
	{
		zzawu1.zzaa(zzbah1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #76  <Method void zzaa(zzbah)>
	//    3    5:return          
	}

	public static zza zzye()
	{
		return (zza)(zzbbo.zza)((zzbbo) (zzdjt)).zza(zzbbo.zze.zzdue, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #29  <Field zzawu zzdjt>
	//    1    3:getstatic       #83  <Field int zzbbo$zze.zzdue>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #86  <Method Object zzbbo.zza(int, Object, Object)>
	//    5   11:checkcast       #88  <Class zzbbo$zza>
	//    6   14:checkcast       #9   <Class zzawu$zza>
	//    7   17:areturn         
	}

	public static zzawu zzyf()
	{
		return zzdjt;
	//    0    0:getstatic       #29  <Field zzawu zzdjt>
	//    1    3:areturn         
	}

	static zzawu zzyg()
	{
		return zzdjt;
	//    0    0:getstatic       #29  <Field zzawu zzdjt>
	//    1    3:areturn         
	}

	private final void zzz(zzbah zzbah1)
	{
		if(zzbah1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #63  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #64  <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			zzdjr = zzbah1;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #41  <Field zzbah zzdjr>
			return;
	//    9   17:return          
		}
	}

	public final int getVersion()
	{
		return zzdih;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int zzdih>
	//    2    4:ireturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzawv.zzakf[i - 1];
	//    0    0:getstatic       #99  <Field int[] zzawv.zzakf>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 158
	//	               2 149
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 158
	//	               2 149
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
		obj = ((Object) (zzakh));
	//   15   63:getstatic       #110 <Field zzbdf zzakh>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/zzawu;
	//   19   71:ldc1            #2   <Class zzawu>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzakh));
	//   21   74:getstatic       #110 <Field zzbdf zzakh>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzbbo.zzb(((zzbbo) (zzdjt)))));
	//   27   84:new             #112 <Class zzbbo$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #29  <Field zzawu zzdjt>
	//   30   91:invokespecial   #115 <Method void zzbbo$zzb(zzbbo)>
	//   31   94:astore_2        
		zzakh = ((zzbdf) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #110 <Field zzbdf zzakh>
_L12:
		com/google/android/gms/internal/ads/zzawu;
	//   34   99:ldc1            #2   <Class zzawu>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/zzawu;
	//   39  105:ldc1            #2   <Class zzawu>
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
		return ((Object) (zzdjt));
	//   45  112:getstatic       #29  <Field zzawu zzdjt>
	//   46  115:areturn         
_L4:
		return zza(((zzbcu) (zzdjt)), "\000\004\000\000\001\004\004\005\000\000\000\001\013\002\t\003\n\004\n", new Object[] {
			"zzdih", "zzdjj", "zzdjr", "zzdjs"
		});
	//   47  116:getstatic       #29  <Field zzawu zzdjt>
	//   48  119:ldc1            #117 <String "\000\004\000\000\001\004\004\005\000\000\000\001\013\002\t\003\n\004\n">
	//   49  121:iconst_4        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #120 <String "zzdih">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #121 <String "zzdjj">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #122 <String "zzdjr">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #123 <String "zzdjs">
	//   66  144:aastore         
	//   67  145:invokestatic    #126 <Method Object zza(zzbcu, String, Object[])>
	//   68  148:areturn         
_L3:
		return ((Object) (new zza(((zzawv) (null)))));
	//   69  149:new             #9   <Class zzawu$zza>
	//   70  152:dup             
	//   71  153:aconst_null     
	//   72  154:invokespecial   #129 <Method void zzawu$zza(zzawv)>
	//   73  157:areturn         
_L2:
		return ((Object) (new zzawu()));
	//   74  158:new             #2   <Class zzawu>
	//   75  161:dup             
	//   76  162:invokespecial   #27  <Method void zzawu()>
	//   77  165:areturn         
	}

	public final zzawq zzxs()
	{
		if(zzdjj == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field zzawq zzdjj>
	//*   2    4:ifnonnull       11
			return zzawq.zzxx();
	//    3    7:invokestatic    #136 <Method zzawq zzawq.zzxx()>
	//    4   10:areturn         
		else
			return zzdjj;
	//    5   11:aload_0         
	//    6   12:getfield        #74  <Field zzawq zzdjj>
	//    7   15:areturn         
	}

	public final zzbah zzyc()
	{
		return zzdjr;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field zzbah zzdjr>
	//    2    4:areturn         
	}

	public final zzbah zzyd()
	{
		return zzdjs;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field zzbah zzdjs>
	//    2    4:areturn         
	}

	private static volatile zzbdf zzakh;
	private static final zzawu zzdjt;
	private int zzdih;
	private zzawq zzdjj;
	private zzbah zzdjr;
	private zzbah zzdjs;

	static 
	{
		zzdjt = new zzawu();
	//    0    0:new             #2   <Class zzawu>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void zzawu()>
	//    3    7:putstatic       #29  <Field zzawu zzdjt>
		zzbbo.zza(com/google/android/gms/internal/ads/zzawu, ((zzbbo) (zzdjt)));
	//    4   10:ldc1            #2   <Class zzawu>
	//    5   12:getstatic       #29  <Field zzawu zzdjt>
	//    6   15:invokestatic    #32  <Method void zzbbo.zza(Class, zzbbo)>
	//*   7   18:return          
	}
}
