// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbo, zzbcw, zzbah, zzbbu, 
//			zzaxd, zzaxg, zzbdf

public final class zzaxc extends zzbbo
	implements zzbcw
{
	public static final class zza extends zzbbo.zza
		implements zzbcw
	{

		public final zza zzaf(zzbah zzbah1)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzaxc.zza((zzaxc)zzdtx, zzbah1);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzaxc>
		//    5   11:aload_1         
		//    6   12:invokestatic    #35  <Method void zzaxc.zza(zzaxc, zzbah)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public final zza zzav(int i)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzaxc.zza((zzaxc)zzdtx, 0);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzaxc>
		//    5   11:iconst_0        
		//    6   12:invokestatic    #40  <Method void zzaxc.zza(zzaxc, int)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public final zza zzc(zzaxg zzaxg1)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzaxc.zza((zzaxc)zzdtx, zzaxg1);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzaxc>
		//    5   11:aload_1         
		//    6   12:invokestatic    #45  <Method void zzaxc.zza(zzaxc, zzaxg)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		private zza()
		{
			super(((zzbbo) (zzaxc.zzyp())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #16  <Method zzaxc zzaxc.zzyp()>
		//    2    4:invokespecial   #19  <Method void zzbbo$zza(zzbbo)>
		//    3    7:return          
		}

		zza(zzaxd zzaxd1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void zzaxc$zza()>
		//    2    4:return          
		}
	}


	private zzaxc()
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

	static void zza(zzaxc zzaxc1, int i)
	{
		zzaxc1.setVersion(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #47  <Method void setVersion(int)>
	//    3    5:return          
	}

	static void zza(zzaxc zzaxc1, zzaxg zzaxg1)
	{
		zzaxc1.zzb(zzaxg1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #52  <Method void zzb(zzaxg)>
	//    3    5:return          
	}

	static void zza(zzaxc zzaxc1, zzbah zzbah1)
	{
		zzaxc1.zzk(zzbah1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #57  <Method void zzk(zzbah)>
	//    3    5:return          
	}

	public static zzaxc zzae(zzbah zzbah1)
		throws zzbbu
	{
		return (zzaxc)zzbbo.zza(((zzbbo) (zzdkn)), zzbah1);
	//    0    0:getstatic       #28  <Field zzaxc zzdkn>
	//    1    3:aload_0         
	//    2    4:invokestatic    #64  <Method zzbbo zzbbo.zza(zzbbo, zzbah)>
	//    3    7:checkcast       #2   <Class zzaxc>
	//    4   10:areturn         
	}

	private final void zzb(zzaxg zzaxg1)
	{
		if(zzaxg1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #67  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #68  <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			zzdkm = zzaxg1;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #70  <Field zzaxg zzdkm>
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
	//    2    4:new             #67  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #68  <Method void NullPointerException()>
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

	public static zza zzyn()
	{
		return (zza)(zzbbo.zza)((zzbbo) (zzdkn)).zza(zzbbo.zze.zzdue, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #28  <Field zzaxc zzdkn>
	//    1    3:getstatic       #77  <Field int zzbbo$zze.zzdue>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #80  <Method Object zzbbo.zza(int, Object, Object)>
	//    5   11:checkcast       #82  <Class zzbbo$zza>
	//    6   14:checkcast       #9   <Class zzaxc$zza>
	//    7   17:areturn         
	}

	public static zzaxc zzyo()
	{
		return zzdkn;
	//    0    0:getstatic       #28  <Field zzaxc zzdkn>
	//    1    3:areturn         
	}

	static zzaxc zzyp()
	{
		return zzdkn;
	//    0    0:getstatic       #28  <Field zzaxc zzdkn>
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
		zzaxd.zzakf[i - 1];
	//    0    0:getstatic       #93  <Field int[] zzaxd.zzakf>
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
		com/google/android/gms/internal/ads/zzaxc;
	//   19   71:ldc1            #2   <Class zzaxc>
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
		obj = ((Object) (new zzbbo.zzb(((zzbbo) (zzdkn)))));
	//   27   84:new             #106 <Class zzbbo$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #28  <Field zzaxc zzdkn>
	//   30   91:invokespecial   #109 <Method void zzbbo$zzb(zzbbo)>
	//   31   94:astore_2        
		zzakh = ((zzbdf) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #104 <Field zzbdf zzakh>
_L12:
		com/google/android/gms/internal/ads/zzaxc;
	//   34   99:ldc1            #2   <Class zzaxc>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/zzaxc;
	//   39  105:ldc1            #2   <Class zzaxc>
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
		return ((Object) (zzdkn));
	//   45  112:getstatic       #28  <Field zzaxc zzdkn>
	//   46  115:areturn         
_L4:
		return zza(((zzbcu) (zzdkn)), "\000\003\000\000\001\003\003\004\000\000\000\001\013\002\t\003\n", new Object[] {
			"zzdih", "zzdkm", "zzdip"
		});
	//   47  116:getstatic       #28  <Field zzaxc zzdkn>
	//   48  119:ldc1            #111 <String "\000\003\000\000\001\003\003\004\000\000\000\001\013\002\t\003\n">
	//   49  121:iconst_3        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #114 <String "zzdih">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #115 <String "zzdkm">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #116 <String "zzdip">
	//   62  139:aastore         
	//   63  140:invokestatic    #119 <Method Object zza(zzbcu, String, Object[])>
	//   64  143:areturn         
_L3:
		return ((Object) (new zza(((zzaxd) (null)))));
	//   65  144:new             #9   <Class zzaxc$zza>
	//   66  147:dup             
	//   67  148:aconst_null     
	//   68  149:invokespecial   #122 <Method void zzaxc$zza(zzaxd)>
	//   69  152:areturn         
_L2:
		return ((Object) (new zzaxc()));
	//   70  153:new             #2   <Class zzaxc>
	//   71  156:dup             
	//   72  157:invokespecial   #26  <Method void zzaxc()>
	//   73  160:areturn         
	}

	public final zzbah zzwv()
	{
		return zzdip;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field zzbah zzdip>
	//    2    4:areturn         
	}

	public final zzaxg zzym()
	{
		if(zzdkm == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field zzaxg zzdkm>
	//*   2    4:ifnonnull       11
			return zzaxg.zzyu();
	//    3    7:invokestatic    #131 <Method zzaxg zzaxg.zzyu()>
	//    4   10:areturn         
		else
			return zzdkm;
	//    5   11:aload_0         
	//    6   12:getfield        #70  <Field zzaxg zzdkm>
	//    7   15:areturn         
	}

	private static volatile zzbdf zzakh;
	private static final zzaxc zzdkn;
	private int zzdih;
	private zzbah zzdip;
	private zzaxg zzdkm;

	static 
	{
		zzdkn = new zzaxc();
	//    0    0:new             #2   <Class zzaxc>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void zzaxc()>
	//    3    7:putstatic       #28  <Field zzaxc zzdkn>
		zzbbo.zza(com/google/android/gms/internal/ads/zzaxc, ((zzbbo) (zzdkn)));
	//    4   10:ldc1            #2   <Class zzaxc>
	//    5   12:getstatic       #28  <Field zzaxc zzdkn>
	//    6   15:invokestatic    #31  <Method void zzbbo.zza(Class, zzbbo)>
	//*   7   18:return          
	}
}
