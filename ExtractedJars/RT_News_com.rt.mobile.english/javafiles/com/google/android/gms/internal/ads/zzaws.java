// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbo, zzbcw, zzbah, zzbbu, 
//			zzawt, zzawu, zzbdf

public final class zzaws extends zzbbo
	implements zzbcw
{
	public static final class zza extends zzbbo.zza
		implements zzbcw
	{

		public final zza zzar(int i)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzaws.zza((zzaws)zzdtx, 0);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzaws>
		//    5   11:iconst_0        
		//    6   12:invokestatic    #35  <Method void zzaws.zza(zzaws, int)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public final zza zzb(zzawu zzawu1)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzaws.zza((zzaws)zzdtx, zzawu1);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzaws>
		//    5   11:aload_1         
		//    6   12:invokestatic    #40  <Method void zzaws.zza(zzaws, zzawu)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public final zza zzy(zzbah zzbah1)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzaws.zza((zzaws)zzdtx, zzbah1);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzaws>
		//    5   11:aload_1         
		//    6   12:invokestatic    #45  <Method void zzaws.zza(zzaws, zzbah)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		private zza()
		{
			super(((zzbbo) (zzaws.zzyb())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #16  <Method zzaws zzaws.zzyb()>
		//    2    4:invokespecial   #19  <Method void zzbbo$zza(zzbbo)>
		//    3    7:return          
		}

		zza(zzawt zzawt1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void zzaws$zza()>
		//    2    4:return          
		}
	}


	private zzaws()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void zzbbo()>
		zzdip = zzbah.zzdpq;
	//    2    4:aload_0         
	//    3    5:getstatic       #38  <Field zzbah zzbah.zzdpq>
	//    4    8:putfield        #40  <Field zzbah zzdip>
	//    5   11:return          
	}

	private final void setVersion(int i)
	{
		zzdih = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #44  <Field int zzdih>
	//    3    5:return          
	}

	static void zza(zzaws zzaws1, int i)
	{
		zzaws1.setVersion(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #47  <Method void setVersion(int)>
	//    3    5:return          
	}

	static void zza(zzaws zzaws1, zzawu zzawu1)
	{
		zzaws1.zza(zzawu1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #51  <Method void zza(zzawu)>
	//    3    5:return          
	}

	static void zza(zzaws zzaws1, zzbah zzbah1)
	{
		zzaws1.zzk(zzbah1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #56  <Method void zzk(zzbah)>
	//    3    5:return          
	}

	private final void zza(zzawu zzawu1)
	{
		if(zzawu1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #58  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #59  <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			zzdjp = zzawu1;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #61  <Field zzawu zzdjp>
			return;
	//    9   17:return          
		}
	}

	private final void zzk(zzbah zzbah1)
	{
		if(zzbah1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #58  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #59  <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			zzdip = zzbah1;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #40  <Field zzbah zzdip>
			return;
	//    9   17:return          
		}
	}

	public static zzaws zzx(zzbah zzbah1)
		throws zzbbu
	{
		return (zzaws)zzbbo.zza(((zzbbo) (zzdjq)), zzbah1);
	//    0    0:getstatic       #28  <Field zzaws zzdjq>
	//    1    3:aload_0         
	//    2    4:invokestatic    #68  <Method zzbbo zzbbo.zza(zzbbo, zzbah)>
	//    3    7:checkcast       #2   <Class zzaws>
	//    4   10:areturn         
	}

	public static zza zzya()
	{
		return (zza)(zzbbo.zza)((zzbbo) (zzdjq)).zza(zzbbo.zze.zzdue, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #28  <Field zzaws zzdjq>
	//    1    3:getstatic       #76  <Field int zzbbo$zze.zzdue>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #79  <Method Object zzbbo.zza(int, Object, Object)>
	//    5   11:checkcast       #81  <Class zzbbo$zza>
	//    6   14:checkcast       #9   <Class zzaws$zza>
	//    7   17:areturn         
	}

	static zzaws zzyb()
	{
		return zzdjq;
	//    0    0:getstatic       #28  <Field zzaws zzdjq>
	//    1    3:areturn         
	}

	public final int getVersion()
	{
		return zzdih;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int zzdih>
	//    2    4:ireturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzawt.zzakf[i - 1];
	//    0    0:getstatic       #91  <Field int[] zzawt.zzakf>
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
		com/google/android/gms/internal/ads/zzaws;
	//   19   71:ldc1            #2   <Class zzaws>
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
		obj = ((Object) (new zzbbo.zzb(((zzbbo) (zzdjq)))));
	//   27   84:new             #104 <Class zzbbo$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #28  <Field zzaws zzdjq>
	//   30   91:invokespecial   #107 <Method void zzbbo$zzb(zzbbo)>
	//   31   94:astore_2        
		zzakh = ((zzbdf) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #102 <Field zzbdf zzakh>
_L12:
		com/google/android/gms/internal/ads/zzaws;
	//   34   99:ldc1            #2   <Class zzaws>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/zzaws;
	//   39  105:ldc1            #2   <Class zzaws>
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
		return ((Object) (zzdjq));
	//   45  112:getstatic       #28  <Field zzaws zzdjq>
	//   46  115:areturn         
_L4:
		return zza(((zzbcu) (zzdjq)), "\000\003\000\000\001\003\003\004\000\000\000\001\013\002\t\003\n", new Object[] {
			"zzdih", "zzdjp", "zzdip"
		});
	//   47  116:getstatic       #28  <Field zzaws zzdjq>
	//   48  119:ldc1            #109 <String "\000\003\000\000\001\003\003\004\000\000\000\001\013\002\t\003\n">
	//   49  121:iconst_3        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #112 <String "zzdih">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #113 <String "zzdjp">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #114 <String "zzdip">
	//   62  139:aastore         
	//   63  140:invokestatic    #117 <Method Object zza(zzbcu, String, Object[])>
	//   64  143:areturn         
_L3:
		return ((Object) (new zza(((zzawt) (null)))));
	//   65  144:new             #9   <Class zzaws$zza>
	//   66  147:dup             
	//   67  148:aconst_null     
	//   68  149:invokespecial   #120 <Method void zzaws$zza(zzawt)>
	//   69  152:areturn         
_L2:
		return ((Object) (new zzaws()));
	//   70  153:new             #2   <Class zzaws>
	//   71  156:dup             
	//   72  157:invokespecial   #26  <Method void zzaws()>
	//   73  160:areturn         
	}

	public final zzbah zzwv()
	{
		return zzdip;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field zzbah zzdip>
	//    2    4:areturn         
	}

	public final zzawu zzxz()
	{
		if(zzdjp == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field zzawu zzdjp>
	//*   2    4:ifnonnull       11
			return zzawu.zzyf();
	//    3    7:invokestatic    #129 <Method zzawu zzawu.zzyf()>
	//    4   10:areturn         
		else
			return zzdjp;
	//    5   11:aload_0         
	//    6   12:getfield        #61  <Field zzawu zzdjp>
	//    7   15:areturn         
	}

	private static volatile zzbdf zzakh;
	private static final zzaws zzdjq;
	private int zzdih;
	private zzbah zzdip;
	private zzawu zzdjp;

	static 
	{
		zzdjq = new zzaws();
	//    0    0:new             #2   <Class zzaws>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void zzaws()>
	//    3    7:putstatic       #28  <Field zzaws zzdjq>
		zzbbo.zza(com/google/android/gms/internal/ads/zzaws, ((zzbbo) (zzdjq)));
	//    4   10:ldc1            #2   <Class zzaws>
	//    5   12:getstatic       #28  <Field zzaws zzdjq>
	//    6   15:invokestatic    #31  <Method void zzbbo.zza(Class, zzbbo)>
	//*   7   18:return          
	}
}
