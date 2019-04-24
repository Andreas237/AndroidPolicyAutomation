// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbo, zzbcw, zzaxh, zzaxa, 
//			zzbdf

public final class zzaxg extends zzbbo
	implements zzbcw
{
	public static final class zza extends zzbbo.zza
		implements zzbcw
	{

		private zza()
		{
			super(((zzbbo) (zzaxg.zzyv())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #16  <Method zzaxg zzaxg.zzyv()>
		//    2    4:invokespecial   #19  <Method void zzbbo$zza(zzbbo)>
		//    3    7:return          
		}

		zza(zzaxh zzaxh1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void zzaxg$zza()>
		//    2    4:return          
		}
	}


	private zzaxg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void zzbbo()>
	//    2    4:return          
	}

	public static zzaxg zzyu()
	{
		return zzdkr;
	//    0    0:getstatic       #25  <Field zzaxg zzdkr>
	//    1    3:areturn         
	}

	static zzaxg zzyv()
	{
		return zzdkr;
	//    0    0:getstatic       #25  <Field zzaxg zzdkr>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzaxh.zzakf[i - 1];
	//    0    0:getstatic       #40  <Field int[] zzaxh.zzakf>
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
	//    6   48:new             #42  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #43  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #49  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzakh));
	//   15   63:getstatic       #51  <Field zzbdf zzakh>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/zzaxg;
	//   19   71:ldc1            #2   <Class zzaxg>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzakh));
	//   21   74:getstatic       #51  <Field zzbdf zzakh>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzbbo.zzb(((zzbbo) (zzdkr)))));
	//   27   84:new             #53  <Class zzbbo$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #25  <Field zzaxg zzdkr>
	//   30   91:invokespecial   #56  <Method void zzbbo$zzb(zzbbo)>
	//   31   94:astore_2        
		zzakh = ((zzbdf) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #51  <Field zzbdf zzakh>
_L12:
		com/google/android/gms/internal/ads/zzaxg;
	//   34   99:ldc1            #2   <Class zzaxg>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/zzaxg;
	//   39  105:ldc1            #2   <Class zzaxg>
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
		return ((Object) (zzdkr));
	//   45  112:getstatic       #25  <Field zzaxg zzdkr>
	//   46  115:areturn         
_L4:
		return zza(((zzbcu) (zzdkr)), "\000\002\000\000\001\002\002\003\000\000\000\001\f\002\013", new Object[] {
			"zzdkp", "zzdkq"
		});
	//   47  116:getstatic       #25  <Field zzaxg zzdkr>
	//   48  119:ldc1            #58  <String "\000\002\000\000\001\002\002\003\000\000\000\001\f\002\013">
	//   49  121:iconst_2        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #61  <String "zzdkp">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #62  <String "zzdkq">
	//   58  134:aastore         
	//   59  135:invokestatic    #65  <Method Object zza(zzbcu, String, Object[])>
	//   60  138:areturn         
_L3:
		return ((Object) (new zza(((zzaxh) (null)))));
	//   61  139:new             #9   <Class zzaxg$zza>
	//   62  142:dup             
	//   63  143:aconst_null     
	//   64  144:invokespecial   #68  <Method void zzaxg$zza(zzaxh)>
	//   65  147:areturn         
_L2:
		return ((Object) (new zzaxg()));
	//   66  148:new             #2   <Class zzaxg>
	//   67  151:dup             
	//   68  152:invokespecial   #23  <Method void zzaxg()>
	//   69  155:areturn         
	}

	public final zzaxa zzys()
	{
		zzaxa zzaxa2 = zzaxa.zzau(zzdkp);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int zzdkp>
	//    2    4:invokestatic    #78  <Method zzaxa zzaxa.zzau(int)>
	//    3    7:astore_2        
		zzaxa zzaxa1 = zzaxa2;
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(zzaxa2 == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       18
			zzaxa1 = zzaxa.zzdkk;
	//    8   14:getstatic       #82  <Field zzaxa zzaxa.zzdkk>
	//    9   17:astore_1        
		return zzaxa1;
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	public final int zzyt()
	{
		return zzdkq;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field int zzdkq>
	//    2    4:ireturn         
	}

	private static volatile zzbdf zzakh;
	private static final zzaxg zzdkr;
	private int zzdkp;
	private int zzdkq;

	static 
	{
		zzdkr = new zzaxg();
	//    0    0:new             #2   <Class zzaxg>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void zzaxg()>
	//    3    7:putstatic       #25  <Field zzaxg zzdkr>
		zzbbo.zza(com/google/android/gms/internal/ads/zzaxg, ((zzbbo) (zzdkr)));
	//    4   10:ldc1            #2   <Class zzaxg>
	//    5   12:getstatic       #25  <Field zzaxg zzdkr>
	//    6   15:invokestatic    #28  <Method void zzbbo.zza(Class, zzbbo)>
	//*   7   18:return          
	}
}
