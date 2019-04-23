// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcg, zzdq, zzgw, zzgx, 
//			zzdz

public static final class zzgw$zza$zzb extends zzcg
	implements zzdq
{
	public static final class zza extends zzcg.zza
		implements zzdq
	{

		public final zza zzn(String s)
		{
			((zzcg.zza)this).zzbf();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #33  <Method void zzcg$zza.zzbf()>
			zzgw.zza.zzb.zza((zzgw.zza.zzb)zzjt, s);
		//    2    4:aload_0         
		//    3    5:getfield        #37  <Field zzcg zzjt>
		//    4    8:checkcast       #14  <Class zzgw$zza$zzb>
		//    5   11:aload_1         
		//    6   12:invokestatic    #40  <Method void zzgw$zza$zzb.zza(zzgw$zza$zzb, String)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public final zza zzr(long l)
		{
			((zzcg.zza)this).zzbf();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #33  <Method void zzcg$zza.zzbf()>
			zzgw.zza.zzb.zza((zzgw.zza.zzb)zzjt, l);
		//    2    4:aload_0         
		//    3    5:getfield        #37  <Field zzcg zzjt>
		//    4    8:checkcast       #14  <Class zzgw$zza$zzb>
		//    5   11:lload_1         
		//    6   12:invokestatic    #45  <Method void zzgw$zza$zzb.zza(zzgw$zza$zzb, long)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public final zza zzs(long l)
		{
			((zzcg.zza)this).zzbf();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #33  <Method void zzcg$zza.zzbf()>
			zzgw.zza.zzb.zzb((zzgw.zza.zzb)zzjt, l);
		//    2    4:aload_0         
		//    3    5:getfield        #37  <Field zzcg zzjt>
		//    4    8:checkcast       #14  <Class zzgw$zza$zzb>
		//    5   11:lload_1         
		//    6   12:invokestatic    #48  <Method void zzgw$zza$zzb.zzb(zzgw$zza$zzb, long)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		private zza()
		{
			super(((zzcg) (zzgw.zza.zzb.zzga())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #21  <Method zzgw$zza$zzb zzgw$zza$zzb.zzga()>
		//    2    4:invokespecial   #24  <Method void zzcg$zza(zzcg)>
		//    3    7:return          
		}

		zza(zzgx zzgx1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void zzgw$zza$zzb$zza()>
		//    2    4:return          
		}
	}


	static void zza(zzgw$zza$zzb zzgw$zza$zzb1, long l)
	{
		zzgw$zza$zzb1.zzp(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #49  <Method void zzp(long)>
	//    3    5:return          
	}

	static void zza(zzgw$zza$zzb zzgw$zza$zzb1, String s)
	{
		zzgw$zza$zzb1.zzm(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #54  <Method void zzm(String)>
	//    3    5:return          
	}

	static void zzb(zzgw$zza$zzb zzgw$zza$zzb1, long l)
	{
		zzgw$zza$zzb1.zzq(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #57  <Method void zzq(long)>
	//    3    5:return          
	}

	public static zza zzfz()
	{
		return (zza)(zzcg.zza)((zzcg) (zzbiv)).zza(zzcg.zzg.zzkh, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #35  <Field zzgw$zza$zzb zzbiv>
	//    1    3:getstatic       #64  <Field int zzcg$zzg.zzkh>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #67  <Method Object zzcg.zza(int, Object, Object)>
	//    5   11:checkcast       #69  <Class zzcg$zza>
	//    6   14:checkcast       #15  <Class zzgw$zza$zzb$zza>
	//    7   17:areturn         
	}

	static zzgw$zza$zzb zzga()
	{
		return zzbiv;
	//    0    0:getstatic       #35  <Field zzgw$zza$zzb zzbiv>
	//    1    3:areturn         
	}

	private final void zzm(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
		{
			zzbb = zzbb | 2;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #73  <Field int zzbb>
	//    5    9:iconst_2        
	//    6   10:ior             
	//    7   11:putfield        #73  <Field int zzbb>
			zzbis = s;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #44  <Field String zzbis>
			return;
	//   11   19:return          
		} else
		{
			throw new NullPointerException();
	//   12   20:new             #75  <Class NullPointerException>
	//   13   23:dup             
	//   14   24:invokespecial   #76  <Method void NullPointerException()>
	//   15   27:athrow          
		}
	}

	private final void zzp(long l)
	{
		zzbb = zzbb | 4;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #73  <Field int zzbb>
	//    3    5:iconst_4        
	//    4    6:ior             
	//    5    7:putfield        #73  <Field int zzbb>
		zzbit = l;
	//    6   10:aload_0         
	//    7   11:lload_1         
	//    8   12:putfield        #78  <Field long zzbit>
	//    9   15:return          
	}

	private final void zzq(long l)
	{
		zzbb = zzbb | 8;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #73  <Field int zzbb>
	//    3    5:bipush          8
	//    4    7:ior             
	//    5    8:putfield        #73  <Field int zzbb>
		zzbiu = l;
	//    6   11:aload_0         
	//    7   12:lload_1         
	//    8   13:putfield        #80  <Field long zzbiu>
	//    9   16:return          
	}

	public final int getEventCode()
	{
		return zzya;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int zzya>
	//    2    4:ireturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzgx.zzba[i - 1];
	//    0    0:getstatic       #90  <Field int[] zzgx.zzba>
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
	//    6   48:new             #92  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #93  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #99  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #101 <Field zzdz zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/zzgw$zza$zzb;
	//   19   71:ldc1            #2   <Class zzgw$zza$zzb>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #101 <Field zzdz zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzcg.zzb(((zzcg) (zzbiv)))));
	//   27   84:new             #103 <Class zzcg$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #35  <Field zzgw$zza$zzb zzbiv>
	//   30   91:invokespecial   #106 <Method void zzcg$zzb(zzcg)>
	//   31   94:astore_2        
		zzbg = ((zzdz) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #101 <Field zzdz zzbg>
_L12:
		com/google/android/gms/internal/clearcut/zzgw$zza$zzb;
	//   34   99:ldc1            #2   <Class zzgw$zza$zzb>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/zzgw$zza$zzb;
	//   39  105:ldc1            #2   <Class zzgw$zza$zzb>
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
		return ((Object) (zzbiv));
	//   45  112:getstatic       #35  <Field zzgw$zza$zzb zzbiv>
	//   46  115:areturn         
_L4:
		return zza(((zzdo) (zzbiv)), "\001\004\000\001\001\004\004\005\000\000\000\001\004\000\002\b\001\003\002\002\004\002\003", new Object[] {
			"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"
		});
	//   47  116:getstatic       #35  <Field zzgw$zza$zzb zzbiv>
	//   48  119:ldc1            #108 <String "\001\004\000\001\001\004\004\005\000\000\000\001\004\000\002\b\001\003\002\002\004\002\003">
	//   49  121:iconst_5        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #111 <String "zzbb">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #112 <String "zzya">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #113 <String "zzbis">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #114 <String "zzbit">
	//   66  144:aastore         
	//   67  145:dup             
	//   68  146:iconst_4        
	//   69  147:ldc1            #115 <String "zzbiu">
	//   70  149:aastore         
	//   71  150:invokestatic    #118 <Method Object zza(zzdo, String, Object[])>
	//   72  153:areturn         
_L3:
		return ((Object) (new zza(((zzgx) (null)))));
	//   73  154:new             #15  <Class zzgw$zza$zzb$zza>
	//   74  157:dup             
	//   75  158:aconst_null     
	//   76  159:invokespecial   #121 <Method void zzgw$zza$zzb$zza(zzgx)>
	//   77  162:areturn         
_L2:
		return ((Object) (new zzgw$zza$zzb()));
	//   78  163:new             #2   <Class zzgw$zza$zzb>
	//   79  166:dup             
	//   80  167:invokespecial   #33  <Method void zzgw$zza$zzb()>
	//   81  170:areturn         
	}

	public final boolean zzfv()
	{
		return (zzbb & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field int zzbb>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public final String zzfw()
	{
		return zzbis;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String zzbis>
	//    2    4:areturn         
	}

	public final long zzfx()
	{
		return zzbit;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field long zzbit>
	//    2    4:lreturn         
	}

	public final long zzfy()
	{
		return zzbiu;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field long zzbiu>
	//    2    4:lreturn         
	}

	private static volatile zzdz zzbg;
	private static final zzgw$zza$zzb zzbiv;
	private int zzbb;
	private String zzbis;
	private long zzbit;
	private long zzbiu;
	private int zzya;

	static 
	{
		zzbiv = new zzgw$zza$zzb();
	//    0    0:new             #2   <Class zzgw$zza$zzb>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void zzgw$zza$zzb()>
	//    3    7:putstatic       #35  <Field zzgw$zza$zzb zzbiv>
		zzcg.zza(com/google/android/gms/internal/clearcut/zzgw$zza$zzb, ((zzcg) (zzbiv)));
	//    4   10:ldc1            #2   <Class zzgw$zza$zzb>
	//    5   12:getstatic       #35  <Field zzgw$zza$zzb zzbiv>
	//    6   15:invokestatic    #38  <Method void zzcg.zza(Class, zzcg)>
	//*   7   18:return          
	}

	private zzgw$zza$zzb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void zzcg()>
		zzbis = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #42  <String "">
	//    4    7:putfield        #44  <Field String zzbis>
	//    5   10:return          
	}
}
