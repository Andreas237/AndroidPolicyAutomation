// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbo, zzbcw, zzbbu, zzayc, 
//			zzaxn, zzbdf, zzbah

public final class zzayb extends zzbbo
	implements zzbcw
{
	public static final class zza extends zzbbo.zza
		implements zzbcw
	{

		private zza()
		{
			super(((zzbbo) (zzayb.zzaak())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #16  <Method zzayb zzayb.zzaak()>
		//    2    4:invokespecial   #19  <Method void zzbbo$zza(zzbbo)>
		//    3    7:return          
		}

		zza(zzayc zzayc1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void zzayb$zza()>
		//    2    4:return          
		}
	}


	private zzayb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void zzbbo()>
		zzdmh = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #33  <String "">
	//    4    7:putfield        #35  <Field String zzdmh>
	//    5   10:return          
	}

	public static zzayb zzaaj()
	{
		return zzdmj;
	//    0    0:getstatic       #26  <Field zzayb zzdmj>
	//    1    3:areturn         
	}

	static zzayb zzaak()
	{
		return zzdmj;
	//    0    0:getstatic       #26  <Field zzayb zzdmj>
	//    1    3:areturn         
	}

	public static zzayb zzam(zzbah zzbah)
		throws zzbbu
	{
		return (zzayb)zzbbo.zza(((zzbbo) (zzdmj)), zzbah);
	//    0    0:getstatic       #26  <Field zzayb zzdmj>
	//    1    3:aload_0         
	//    2    4:invokestatic    #45  <Method zzbbo zzbbo.zza(zzbbo, zzbah)>
	//    3    7:checkcast       #2   <Class zzayb>
	//    4   10:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzayc.zzakf[i - 1];
	//    0    0:getstatic       #53  <Field int[] zzayc.zzakf>
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
	//    6   48:new             #55  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #56  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #62  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzakh));
	//   15   63:getstatic       #64  <Field zzbdf zzakh>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/zzayb;
	//   19   71:ldc1            #2   <Class zzayb>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzakh));
	//   21   74:getstatic       #64  <Field zzbdf zzakh>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzbbo.zzb(((zzbbo) (zzdmj)))));
	//   27   84:new             #66  <Class zzbbo$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #26  <Field zzayb zzdmj>
	//   30   91:invokespecial   #69  <Method void zzbbo$zzb(zzbbo)>
	//   31   94:astore_2        
		zzakh = ((zzbdf) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #64  <Field zzbdf zzakh>
_L12:
		com/google/android/gms/internal/ads/zzayb;
	//   34   99:ldc1            #2   <Class zzayb>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/zzayb;
	//   39  105:ldc1            #2   <Class zzayb>
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
		return ((Object) (zzdmj));
	//   45  112:getstatic       #26  <Field zzayb zzdmj>
	//   46  115:areturn         
_L4:
		return zza(((zzbcu) (zzdmj)), "\000\002\000\000\001\002\002\003\000\000\000\001\u0208\002\t", new Object[] {
			"zzdmh", "zzdmi"
		});
	//   47  116:getstatic       #26  <Field zzayb zzdmj>
	//   48  119:ldc1            #71  <String "\000\002\000\000\001\002\002\003\000\000\000\001\u0208\002\t">
	//   49  121:iconst_2        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #74  <String "zzdmh">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #75  <String "zzdmi">
	//   58  134:aastore         
	//   59  135:invokestatic    #78  <Method Object zza(zzbcu, String, Object[])>
	//   60  138:areturn         
_L3:
		return ((Object) (new zza(((zzayc) (null)))));
	//   61  139:new             #9   <Class zzayb$zza>
	//   62  142:dup             
	//   63  143:aconst_null     
	//   64  144:invokespecial   #81  <Method void zzayb$zza(zzayc)>
	//   65  147:areturn         
_L2:
		return ((Object) (new zzayb()));
	//   66  148:new             #2   <Class zzayb>
	//   67  151:dup             
	//   68  152:invokespecial   #24  <Method void zzayb()>
	//   69  155:areturn         
	}

	public final String zzaah()
	{
		return zzdmh;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String zzdmh>
	//    2    4:areturn         
	}

	public final zzaxn zzaai()
	{
		if(zzdmi == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field zzaxn zzdmi>
	//*   2    4:ifnonnull       11
			return zzaxn.zzzc();
	//    3    7:invokestatic    #92  <Method zzaxn zzaxn.zzzc()>
	//    4   10:areturn         
		else
			return zzdmi;
	//    5   11:aload_0         
	//    6   12:getfield        #87  <Field zzaxn zzdmi>
	//    7   15:areturn         
	}

	private static volatile zzbdf zzakh;
	private static final zzayb zzdmj;
	private String zzdmh;
	private zzaxn zzdmi;

	static 
	{
		zzdmj = new zzayb();
	//    0    0:new             #2   <Class zzayb>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void zzayb()>
	//    3    7:putstatic       #26  <Field zzayb zzdmj>
		zzbbo.zza(com/google/android/gms/internal/ads/zzayb, ((zzbbo) (zzdmj)));
	//    4   10:ldc1            #2   <Class zzayb>
	//    5   12:getstatic       #26  <Field zzayb zzdmj>
	//    6   15:invokestatic    #29  <Method void zzbbo.zza(Class, zzbbo)>
	//*   7   18:return          
	}
}
