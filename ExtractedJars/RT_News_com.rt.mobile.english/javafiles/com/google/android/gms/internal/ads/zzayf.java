// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbo, zzbcw, zzbbt, zzayg, 
//			zzaxp, zzbdf

public final class zzayf extends zzbbo
	implements zzbcw
{
	public static final class zza extends zzbbo.zza
		implements zzbcw
	{

		public final zza zzb(zzaxp zzaxp1)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzayf.zza((zzayf)zzdtx, zzaxp1);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzayf>
		//    5   11:aload_1         
		//    6   12:invokestatic    #35  <Method void zzayf.zza(zzayf, zzaxp)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public final zza zzej(String s)
		{
			((zzbbo.zza)this).zzadh();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method void zzbbo$zza.zzadh()>
			zzayf.zza((zzayf)zzdtx, s);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field zzbbo zzdtx>
		//    4    8:checkcast       #9   <Class zzayf>
		//    5   11:aload_1         
		//    6   12:invokestatic    #40  <Method void zzayf.zza(zzayf, String)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		private zza()
		{
			super(((zzbbo) (zzayf.zzaan())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #16  <Method zzayf zzayf.zzaan()>
		//    2    4:invokespecial   #19  <Method void zzbbo$zza(zzbbo)>
		//    3    7:return          
		}

		zza(zzayg zzayg1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void zzayf$zza()>
		//    2    4:return          
		}
	}


	private zzayf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void zzbbo()>
		zzdmr = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #36  <String "">
	//    4    7:putfield        #38  <Field String zzdmr>
		zzdms = zzadd();
	//    5   10:aload_0         
	//    6   11:invokestatic    #42  <Method zzbbt zzadd()>
	//    7   14:putfield        #44  <Field zzbbt zzdms>
	//    8   17:return          
	}

	private final void zza(zzaxp zzaxp1)
	{
		if(zzaxp1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
			throw new NullPointerException();
	//    2    4:new             #47  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #48  <Method void NullPointerException()>
	//    5   11:athrow          
		if(!zzdms.zzaay())
	//*   6   12:aload_0         
	//*   7   13:getfield        #44  <Field zzbbt zzdms>
	//*   8   16:invokeinterface #54  <Method boolean zzbbt.zzaay()>
	//*   9   21:ifne            61
		{
			zzbbt zzbbt1 = zzdms;
	//   10   24:aload_0         
	//   11   25:getfield        #44  <Field zzbbt zzdms>
	//   12   28:astore_3        
			int i = zzbbt1.size();
	//   13   29:aload_3         
	//   14   30:invokeinterface #58  <Method int zzbbt.size()>
	//   15   35:istore_2        
			if(i == 0)
	//*  16   36:iload_2         
	//*  17   37:ifne            46
				i = 10;
	//   18   40:bipush          10
	//   19   42:istore_2        
			else
	//*  20   43:goto            50
				i <<= 1;
	//   21   46:iload_2         
	//   22   47:iconst_1        
	//   23   48:ishl            
	//   24   49:istore_2        
			zzdms = zzbbt1.zzbm(i);
	//   25   50:aload_0         
	//   26   51:aload_3         
	//   27   52:iload_2         
	//   28   53:invokeinterface #62  <Method zzbbt zzbbt.zzbm(int)>
	//   29   58:putfield        #44  <Field zzbbt zzdms>
		}
		zzdms.add(((Object) (zzaxp1)));
	//   30   61:aload_0         
	//   31   62:getfield        #44  <Field zzbbt zzdms>
	//   32   65:aload_1         
	//   33   66:invokeinterface #66  <Method boolean zzbbt.add(Object)>
	//   34   71:pop             
	//   35   72:return          
	}

	static void zza(zzayf zzayf1, zzaxp zzaxp1)
	{
		zzayf1.zza(zzaxp1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #69  <Method void zza(zzaxp)>
	//    3    5:return          
	}

	static void zza(zzayf zzayf1, String s)
	{
		zzayf1.zzei(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #74  <Method void zzei(String)>
	//    3    5:return          
	}

	public static zza zzaam()
	{
		return (zza)(zzbbo.zza)((zzbbo) (zzdmt)).zza(zzbbo.zze.zzdue, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #29  <Field zzayf zzdmt>
	//    1    3:getstatic       #81  <Field int zzbbo$zze.zzdue>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #84  <Method Object zzbbo.zza(int, Object, Object)>
	//    5   11:checkcast       #86  <Class zzbbo$zza>
	//    6   14:checkcast       #9   <Class zzayf$zza>
	//    7   17:areturn         
	}

	static zzayf zzaan()
	{
		return zzdmt;
	//    0    0:getstatic       #29  <Field zzayf zzdmt>
	//    1    3:areturn         
	}

	private final void zzei(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #47  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #48  <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			zzdmr = s;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #38  <Field String zzdmr>
			return;
	//    9   17:return          
		}
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzayg.zzakf[i - 1];
	//    0    0:getstatic       #94  <Field int[] zzayg.zzakf>
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
	//    6   48:new             #96  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #97  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #103 <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzakh));
	//   15   63:getstatic       #105 <Field zzbdf zzakh>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/zzayf;
	//   19   71:ldc1            #2   <Class zzayf>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzakh));
	//   21   74:getstatic       #105 <Field zzbdf zzakh>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzbbo.zzb(((zzbbo) (zzdmt)))));
	//   27   84:new             #107 <Class zzbbo$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #29  <Field zzayf zzdmt>
	//   30   91:invokespecial   #110 <Method void zzbbo$zzb(zzbbo)>
	//   31   94:astore_2        
		zzakh = ((zzbdf) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #105 <Field zzbdf zzakh>
_L12:
		com/google/android/gms/internal/ads/zzayf;
	//   34   99:ldc1            #2   <Class zzayf>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/zzayf;
	//   39  105:ldc1            #2   <Class zzayf>
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
		return ((Object) (zzdmt));
	//   45  112:getstatic       #29  <Field zzayf zzdmt>
	//   46  115:areturn         
_L4:
		return zza(((zzbcu) (zzdmt)), "\000\002\000\001\001\002\002\003\000\001\000\001\u0208\002\033", new Object[] {
			"zzdlq", "zzdmr", "zzdms", com/google/android/gms/internal/ads/zzaxp
		});
	//   47  116:getstatic       #29  <Field zzayf zzdmt>
	//   48  119:ldc1            #112 <String "\000\002\000\001\001\002\002\003\000\001\000\001\u0208\002\033">
	//   49  121:iconst_4        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #115 <String "zzdlq">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #116 <String "zzdmr">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #117 <String "zzdms">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #119 <Class zzaxp>
	//   66  144:aastore         
	//   67  145:invokestatic    #122 <Method Object zza(zzbcu, String, Object[])>
	//   68  148:areturn         
_L3:
		return ((Object) (new zza(((zzayg) (null)))));
	//   69  149:new             #9   <Class zzayf$zza>
	//   70  152:dup             
	//   71  153:aconst_null     
	//   72  154:invokespecial   #125 <Method void zzayf$zza(zzayg)>
	//   73  157:areturn         
_L2:
		return ((Object) (new zzayf()));
	//   74  158:new             #2   <Class zzayf>
	//   75  161:dup             
	//   76  162:invokespecial   #27  <Method void zzayf()>
	//   77  165:areturn         
	}

	public final List zzaal()
	{
		return ((List) (zzdms));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zzbbt zzdms>
	//    2    4:areturn         
	}

	private static volatile zzbdf zzakh;
	private static final zzayf zzdmt;
	private int zzdlq;
	private String zzdmr;
	private zzbbt zzdms;

	static 
	{
		zzdmt = new zzayf();
	//    0    0:new             #2   <Class zzayf>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void zzayf()>
	//    3    7:putstatic       #29  <Field zzayf zzdmt>
		zzbbo.zza(com/google/android/gms/internal/ads/zzayf, ((zzbbo) (zzdmt)));
	//    4   10:ldc1            #2   <Class zzayf>
	//    5   12:getstatic       #29  <Field zzayf zzdmt>
	//    6   15:invokestatic    #32  <Method void zzbbo.zza(Class, zzbbo)>
	//*   7   18:return          
	}
}
