// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbo, zzbcw, zzbbu, zzaya, 
//			zzayb, zzbdf, zzbah

public final class zzaxz extends zzbbo
	implements zzbcw
{
	public static final class zza extends zzbbo.zza
		implements zzbcw
	{

		public final zza zzb(zzayb zzayb1)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzaxz.zza((zzaxz)zzdtx, zzayb1);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzaxz>
		//    5   11:aload_1         
		//    6   12:invokestatic    #35  <Method void zzaxz.zza(zzaxz, zzayb)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public final zza zzbf(int i)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzaxz.zza((zzaxz)zzdtx, 0);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzaxz>
		//    5   11:iconst_0        
		//    6   12:invokestatic    #40  <Method void zzaxz.zza(zzaxz, int)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		private zza()
		{
			super(((zzbbo) (zzaxz.zzaag())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #16  <Method zzaxz zzaxz.zzaag()>
		//    2    4:invokespecial   #19  <Method void zzbbo$zza(zzbbo)>
		//    3    7:return          
		}

		zza(zzaya zzaya1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void zzaxz$zza()>
		//    2    4:return          
		}
	}


	private zzaxz()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void zzbbo()>
	//    2    4:return          
	}

	private final void setVersion(int i)
	{
		zzdih = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #35  <Field int zzdih>
	//    3    5:return          
	}

	static void zza(zzaxz zzaxz1, int i)
	{
		zzaxz1.setVersion(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #38  <Method void setVersion(int)>
	//    3    5:return          
	}

	static void zza(zzaxz zzaxz1, zzayb zzayb1)
	{
		zzaxz1.zza(zzayb1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method void zza(zzayb)>
	//    3    5:return          
	}

	private final void zza(zzayb zzayb1)
	{
		if(zzayb1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #44  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #45  <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			zzdmf = zzayb1;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #47  <Field zzayb zzdmf>
			return;
	//    9   17:return          
		}
	}

	public static zza zzaaf()
	{
		return (zza)(zzbbo.zza)((zzbbo) (zzdmg)).zza(zzbbo.zze.zzdue, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #26  <Field zzaxz zzdmg>
	//    1    3:getstatic       #54  <Field int zzbbo$zze.zzdue>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #57  <Method Object zzbbo.zza(int, Object, Object)>
	//    5   11:checkcast       #59  <Class zzbbo$zza>
	//    6   14:checkcast       #9   <Class zzaxz$zza>
	//    7   17:areturn         
	}

	static zzaxz zzaag()
	{
		return zzdmg;
	//    0    0:getstatic       #26  <Field zzaxz zzdmg>
	//    1    3:areturn         
	}

	public static zzaxz zzal(zzbah zzbah)
		throws zzbbu
	{
		return (zzaxz)zzbbo.zza(((zzbbo) (zzdmg)), zzbah);
	//    0    0:getstatic       #26  <Field zzaxz zzdmg>
	//    1    3:aload_0         
	//    2    4:invokestatic    #68  <Method zzbbo zzbbo.zza(zzbbo, zzbah)>
	//    3    7:checkcast       #2   <Class zzaxz>
	//    4   10:areturn         
	}

	public final int getVersion()
	{
		return zzdih;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int zzdih>
	//    2    4:ireturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzaya.zzakf[i - 1];
	//    0    0:getstatic       #77  <Field int[] zzaya.zzakf>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 148
	//	               2 139
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 148
	//	               2 139
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #79  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #80  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #86  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzakh));
	//   15   63:getstatic       #88  <Field zzbdf zzakh>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/zzaxz;
	//   19   71:ldc1            #2   <Class zzaxz>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzakh));
	//   21   74:getstatic       #88  <Field zzbdf zzakh>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzbbo.zzb(((zzbbo) (zzdmg)))));
	//   27   84:new             #90  <Class zzbbo$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #26  <Field zzaxz zzdmg>
	//   30   91:invokespecial   #93  <Method void zzbbo$zzb(zzbbo)>
	//   31   94:astore_2        
		zzakh = ((zzbdf) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #88  <Field zzbdf zzakh>
_L12:
		com/google/android/gms/internal/ads/zzaxz;
	//   34   99:ldc1            #2   <Class zzaxz>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/zzaxz;
	//   39  105:ldc1            #2   <Class zzaxz>
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
		return ((Object) (zzdmg));
	//   45  112:getstatic       #26  <Field zzaxz zzdmg>
	//   46  115:areturn         
_L4:
		return zza(((zzbcu) (zzdmg)), "\000\002\000\000\001\002\002\003\000\000\000\001\013\002\t", new Object[] {
			"zzdih", "zzdmf"
		});
	//   47  116:getstatic       #26  <Field zzaxz zzdmg>
	//   48  119:ldc1            #95  <String "\000\002\000\000\001\002\002\003\000\000\000\001\013\002\t">
	//   49  121:iconst_2        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #98  <String "zzdih">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #99  <String "zzdmf">
	//   58  134:aastore         
	//   59  135:invokestatic    #102 <Method Object zza(zzbcu, String, Object[])>
	//   60  138:areturn         
_L3:
		return ((Object) (new zza(((zzaya) (null)))));
	//   61  139:new             #9   <Class zzaxz$zza>
	//   62  142:dup             
	//   63  143:aconst_null     
	//   64  144:invokespecial   #105 <Method void zzaxz$zza(zzaya)>
	//   65  147:areturn         
_L2:
		return ((Object) (new zzaxz()));
	//   66  148:new             #2   <Class zzaxz>
	//   67  151:dup             
	//   68  152:invokespecial   #24  <Method void zzaxz()>
	//   69  155:areturn         
	}

	public final zzayb zzaae()
	{
		if(zzdmf == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field zzayb zzdmf>
	//*   2    4:ifnonnull       11
			return zzayb.zzaaj();
	//    3    7:invokestatic    #112 <Method zzayb zzayb.zzaaj()>
	//    4   10:areturn         
		else
			return zzdmf;
	//    5   11:aload_0         
	//    6   12:getfield        #47  <Field zzayb zzdmf>
	//    7   15:areturn         
	}

	private static volatile zzbdf zzakh;
	private static final zzaxz zzdmg;
	private int zzdih;
	private zzayb zzdmf;

	static 
	{
		zzdmg = new zzaxz();
	//    0    0:new             #2   <Class zzaxz>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void zzaxz()>
	//    3    7:putstatic       #26  <Field zzaxz zzdmg>
		zzbbo.zza(com/google/android/gms/internal/ads/zzaxz, ((zzbbo) (zzdmg)));
	//    4   10:ldc1            #2   <Class zzaxz>
	//    5   12:getstatic       #26  <Field zzaxz zzdmg>
	//    6   15:invokestatic    #29  <Method void zzbbo.zza(Class, zzbbo)>
	//*   7   18:return          
	}
}
