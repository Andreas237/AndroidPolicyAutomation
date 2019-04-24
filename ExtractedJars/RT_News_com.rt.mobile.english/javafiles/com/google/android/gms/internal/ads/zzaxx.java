// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbo, zzbcw, zzbbu, zzaxy, 
//			zzbdf, zzbah

public final class zzaxx extends zzbbo
	implements zzbcw
{
	public static final class zza extends zzbbo.zza
		implements zzbcw
	{

		private zza()
		{
			super(((zzbbo) (zzaxx.zzaad())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #16  <Method zzaxx zzaxx.zzaad()>
		//    2    4:invokespecial   #19  <Method void zzbbo$zza(zzbbo)>
		//    3    7:return          
		}

		zza(zzaxy zzaxy1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void zzaxx$zza()>
		//    2    4:return          
		}
	}


	private zzaxx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void zzbbo()>
		zzdmd = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #31  <String "">
	//    4    7:putfield        #33  <Field String zzdmd>
	//    5   10:return          
	}

	public static zzaxx zzaac()
	{
		return zzdme;
	//    0    0:getstatic       #24  <Field zzaxx zzdme>
	//    1    3:areturn         
	}

	static zzaxx zzaad()
	{
		return zzdme;
	//    0    0:getstatic       #24  <Field zzaxx zzdme>
	//    1    3:areturn         
	}

	public static zzaxx zzak(zzbah zzbah)
		throws zzbbu
	{
		return (zzaxx)zzbbo.zza(((zzbbo) (zzdme)), zzbah);
	//    0    0:getstatic       #24  <Field zzaxx zzdme>
	//    1    3:aload_0         
	//    2    4:invokestatic    #43  <Method zzbbo zzbbo.zza(zzbbo, zzbah)>
	//    3    7:checkcast       #2   <Class zzaxx>
	//    4   10:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzaxy.zzakf[i - 1];
	//    0    0:getstatic       #51  <Field int[] zzaxy.zzakf>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 143
	//	               2 134
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 143
	//	               2 134
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #53  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #54  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #60  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzakh));
	//   15   63:getstatic       #62  <Field zzbdf zzakh>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/zzaxx;
	//   19   71:ldc1            #2   <Class zzaxx>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzakh));
	//   21   74:getstatic       #62  <Field zzbdf zzakh>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzbbo.zzb(((zzbbo) (zzdme)))));
	//   27   84:new             #64  <Class zzbbo$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #24  <Field zzaxx zzdme>
	//   30   91:invokespecial   #67  <Method void zzbbo$zzb(zzbbo)>
	//   31   94:astore_2        
		zzakh = ((zzbdf) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #62  <Field zzbdf zzakh>
_L12:
		com/google/android/gms/internal/ads/zzaxx;
	//   34   99:ldc1            #2   <Class zzaxx>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/zzaxx;
	//   39  105:ldc1            #2   <Class zzaxx>
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
		return ((Object) (zzdme));
	//   45  112:getstatic       #24  <Field zzaxx zzdme>
	//   46  115:areturn         
_L4:
		return zza(((zzbcu) (zzdme)), "\000\001\000\000\001\001\001\002\000\000\000\001\u0208", new Object[] {
			"zzdmd"
		});
	//   47  116:getstatic       #24  <Field zzaxx zzdme>
	//   48  119:ldc1            #69  <String "\000\001\000\000\001\001\001\002\000\000\000\001\u0208">
	//   49  121:iconst_1        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #72  <String "zzdmd">
	//   54  129:aastore         
	//   55  130:invokestatic    #75  <Method Object zza(zzbcu, String, Object[])>
	//   56  133:areturn         
_L3:
		return ((Object) (new zza(((zzaxy) (null)))));
	//   57  134:new             #9   <Class zzaxx$zza>
	//   58  137:dup             
	//   59  138:aconst_null     
	//   60  139:invokespecial   #78  <Method void zzaxx$zza(zzaxy)>
	//   61  142:areturn         
_L2:
		return ((Object) (new zzaxx()));
	//   62  143:new             #2   <Class zzaxx>
	//   63  146:dup             
	//   64  147:invokespecial   #22  <Method void zzaxx()>
	//   65  150:areturn         
	}

	public final String zzaab()
	{
		return zzdmd;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String zzdmd>
	//    2    4:areturn         
	}

	private static volatile zzbdf zzakh;
	private static final zzaxx zzdme;
	private String zzdmd;

	static 
	{
		zzdme = new zzaxx();
	//    0    0:new             #2   <Class zzaxx>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void zzaxx()>
	//    3    7:putstatic       #24  <Field zzaxx zzdme>
		zzbbo.zza(com/google/android/gms/internal/ads/zzaxx, ((zzbbo) (zzdme)));
	//    4   10:ldc1            #2   <Class zzaxx>
	//    5   12:getstatic       #24  <Field zzaxx zzdme>
	//    6   15:invokestatic    #27  <Method void zzbbo.zza(Class, zzbbo)>
	//*   7   18:return          
	}
}
