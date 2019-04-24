// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbo, zzbcw, zzbbu, zzavp, 
//			zzavs, zzaxc, zzbdf, zzbah

public final class zzavo extends zzbbo
	implements zzbcw
{
	public static final class zza extends zzbbo.zza
		implements zzbcw
	{

		public final zza zzal(int i)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzavo.zza((zzavo)zzdtx, i);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzavo>
		//    5   11:iload_1         
		//    6   12:invokestatic    #35  <Method void zzavo.zza(zzavo, int)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public final zza zzb(zzavs zzavs1)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzavo.zza((zzavo)zzdtx, zzavs1);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzavo>
		//    5   11:aload_1         
		//    6   12:invokestatic    #40  <Method void zzavo.zza(zzavo, zzavs)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public final zza zzb(zzaxc zzaxc1)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzavo.zza((zzavo)zzdtx, zzaxc1);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzavo>
		//    5   11:aload_1         
		//    6   12:invokestatic    #44  <Method void zzavo.zza(zzavo, zzaxc)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		private zza()
		{
			super(((zzbbo) (zzavo.zzwq())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #16  <Method zzavo zzavo.zzwq()>
		//    2    4:invokespecial   #19  <Method void zzbbo$zza(zzbbo)>
		//    3    7:return          
		}

		zza(zzavp zzavp1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void zzavo$zza()>
		//    2    4:return          
		}
	}


	private zzavo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void zzbbo()>
	//    2    4:return          
	}

	private final void setVersion(int i)
	{
		zzdih = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #37  <Field int zzdih>
	//    3    5:return          
	}

	static void zza(zzavo zzavo1, int i)
	{
		zzavo1.setVersion(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #40  <Method void setVersion(int)>
	//    3    5:return          
	}

	static void zza(zzavo zzavo1, zzavs zzavs1)
	{
		zzavo1.zza(zzavs1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #44  <Method void zza(zzavs)>
	//    3    5:return          
	}

	static void zza(zzavo zzavo1, zzaxc zzaxc1)
	{
		zzavo1.zza(zzaxc1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method void zza(zzaxc)>
	//    3    5:return          
	}

	private final void zza(zzavs zzavs1)
	{
		if(zzavs1 == null)
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
			zzdii = zzavs1;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #53  <Field zzavs zzdii>
			return;
	//    9   17:return          
		}
	}

	private final void zza(zzaxc zzaxc1)
	{
		if(zzaxc1 == null)
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
			zzdij = zzaxc1;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #55  <Field zzaxc zzdij>
			return;
	//    9   17:return          
		}
	}

	public static zzavo zzi(zzbah zzbah)
		throws zzbbu
	{
		return (zzavo)zzbbo.zza(((zzbbo) (zzdik)), zzbah);
	//    0    0:getstatic       #28  <Field zzavo zzdik>
	//    1    3:aload_0         
	//    2    4:invokestatic    #62  <Method zzbbo zzbbo.zza(zzbbo, zzbah)>
	//    3    7:checkcast       #2   <Class zzavo>
	//    4   10:areturn         
	}

	public static zza zzwp()
	{
		return (zza)(zzbbo.zza)((zzbbo) (zzdik)).zza(zzbbo.zze.zzdue, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #28  <Field zzavo zzdik>
	//    1    3:getstatic       #70  <Field int zzbbo$zze.zzdue>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #73  <Method Object zzbbo.zza(int, Object, Object)>
	//    5   11:checkcast       #75  <Class zzbbo$zza>
	//    6   14:checkcast       #9   <Class zzavo$zza>
	//    7   17:areturn         
	}

	static zzavo zzwq()
	{
		return zzdik;
	//    0    0:getstatic       #28  <Field zzavo zzdik>
	//    1    3:areturn         
	}

	public final int getVersion()
	{
		return zzdih;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int zzdih>
	//    2    4:ireturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzavp.zzakf[i - 1];
	//    0    0:getstatic       #85  <Field int[] zzavp.zzakf>
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
	//    6   48:new             #87  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #88  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #94  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzakh));
	//   15   63:getstatic       #96  <Field zzbdf zzakh>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/zzavo;
	//   19   71:ldc1            #2   <Class zzavo>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzakh));
	//   21   74:getstatic       #96  <Field zzbdf zzakh>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzbbo.zzb(((zzbbo) (zzdik)))));
	//   27   84:new             #98  <Class zzbbo$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #28  <Field zzavo zzdik>
	//   30   91:invokespecial   #101 <Method void zzbbo$zzb(zzbbo)>
	//   31   94:astore_2        
		zzakh = ((zzbdf) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #96  <Field zzbdf zzakh>
_L12:
		com/google/android/gms/internal/ads/zzavo;
	//   34   99:ldc1            #2   <Class zzavo>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/zzavo;
	//   39  105:ldc1            #2   <Class zzavo>
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
		return ((Object) (zzdik));
	//   45  112:getstatic       #28  <Field zzavo zzdik>
	//   46  115:areturn         
_L4:
		return zza(((zzbcu) (zzdik)), "\000\003\000\000\001\003\003\004\000\000\000\001\013\002\t\003\t", new Object[] {
			"zzdih", "zzdii", "zzdij"
		});
	//   47  116:getstatic       #28  <Field zzavo zzdik>
	//   48  119:ldc1            #103 <String "\000\003\000\000\001\003\003\004\000\000\000\001\013\002\t\003\t">
	//   49  121:iconst_3        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #106 <String "zzdih">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #107 <String "zzdii">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #108 <String "zzdij">
	//   62  139:aastore         
	//   63  140:invokestatic    #111 <Method Object zza(zzbcu, String, Object[])>
	//   64  143:areturn         
_L3:
		return ((Object) (new zza(((zzavp) (null)))));
	//   65  144:new             #9   <Class zzavo$zza>
	//   66  147:dup             
	//   67  148:aconst_null     
	//   68  149:invokespecial   #114 <Method void zzavo$zza(zzavp)>
	//   69  152:areturn         
_L2:
		return ((Object) (new zzavo()));
	//   70  153:new             #2   <Class zzavo>
	//   71  156:dup             
	//   72  157:invokespecial   #26  <Method void zzavo()>
	//   73  160:areturn         
	}

	public final zzavs zzwn()
	{
		if(zzdii == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field zzavs zzdii>
	//*   2    4:ifnonnull       11
			return zzavs.zzwx();
	//    3    7:invokestatic    #121 <Method zzavs zzavs.zzwx()>
	//    4   10:areturn         
		else
			return zzdii;
	//    5   11:aload_0         
	//    6   12:getfield        #53  <Field zzavs zzdii>
	//    7   15:areturn         
	}

	public final zzaxc zzwo()
	{
		if(zzdij == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field zzaxc zzdij>
	//*   2    4:ifnonnull       11
			return zzaxc.zzyo();
	//    3    7:invokestatic    #128 <Method zzaxc zzaxc.zzyo()>
	//    4   10:areturn         
		else
			return zzdij;
	//    5   11:aload_0         
	//    6   12:getfield        #55  <Field zzaxc zzdij>
	//    7   15:areturn         
	}

	private static volatile zzbdf zzakh;
	private static final zzavo zzdik;
	private int zzdih;
	private zzavs zzdii;
	private zzaxc zzdij;

	static 
	{
		zzdik = new zzavo();
	//    0    0:new             #2   <Class zzavo>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void zzavo()>
	//    3    7:putstatic       #28  <Field zzavo zzdik>
		zzbbo.zza(com/google/android/gms/internal/ads/zzavo, ((zzbbo) (zzdik)));
	//    4   10:ldc1            #2   <Class zzavo>
	//    5   12:getstatic       #28  <Field zzavo zzdik>
	//    6   15:invokestatic    #31  <Method void zzbbo.zza(Class, zzbbo)>
	//*   7   18:return          
	}
}
