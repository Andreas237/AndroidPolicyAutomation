// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbo, zzbcw, zzbah, zzaxo, 
//			zzbdf

public final class zzaxn extends zzbbo
	implements zzbcw
{
	public static final class zza extends zzbbo.zza
		implements zzbcw
	{

		private zza()
		{
			super(((zzbbo) (zzaxn.zzzd())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #16  <Method zzaxn zzaxn.zzzd()>
		//    2    4:invokespecial   #19  <Method void zzbbo$zza(zzbbo)>
		//    3    7:return          
		}

		zza(zzaxo zzaxo1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void zzaxn$zza()>
		//    2    4:return          
		}
	}


	private zzaxn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void zzbbo()>
		zzdks = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #35  <String "">
	//    4    7:putfield        #37  <Field String zzdks>
		zzdkt = zzbah.zzdpq;
	//    5   10:aload_0         
	//    6   11:getstatic       #42  <Field zzbah zzbah.zzdpq>
	//    7   14:putfield        #44  <Field zzbah zzdkt>
	//    8   17:return          
	}

	public static zzaxn zzzc()
	{
		return zzdlk;
	//    0    0:getstatic       #28  <Field zzaxn zzdlk>
	//    1    3:areturn         
	}

	static zzaxn zzzd()
	{
		return zzdlk;
	//    0    0:getstatic       #28  <Field zzaxn zzdlk>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzaxo.zzakf[i - 1];
	//    0    0:getstatic       #54  <Field int[] zzaxo.zzakf>
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
	//    6   48:new             #56  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #57  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #63  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzakh));
	//   15   63:getstatic       #65  <Field zzbdf zzakh>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/zzaxn;
	//   19   71:ldc1            #2   <Class zzaxn>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzakh));
	//   21   74:getstatic       #65  <Field zzbdf zzakh>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzbbo.zzb(((zzbbo) (zzdlk)))));
	//   27   84:new             #67  <Class zzbbo$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #28  <Field zzaxn zzdlk>
	//   30   91:invokespecial   #70  <Method void zzbbo$zzb(zzbbo)>
	//   31   94:astore_2        
		zzakh = ((zzbdf) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #65  <Field zzbdf zzakh>
_L12:
		com/google/android/gms/internal/ads/zzaxn;
	//   34   99:ldc1            #2   <Class zzaxn>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/zzaxn;
	//   39  105:ldc1            #2   <Class zzaxn>
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
		return ((Object) (zzdlk));
	//   45  112:getstatic       #28  <Field zzaxn zzdlk>
	//   46  115:areturn         
_L4:
		return zza(((zzbcu) (zzdlk)), "\000\003\000\000\001\003\003\004\000\000\000\001\u0208\002\n\003\f", new Object[] {
			"zzdks", "zzdkt", "zzdlj"
		});
	//   47  116:getstatic       #28  <Field zzaxn zzdlk>
	//   48  119:ldc1            #72  <String "\000\003\000\000\001\003\003\004\000\000\000\001\u0208\002\n\003\f">
	//   49  121:iconst_3        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #75  <String "zzdks">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #76  <String "zzdkt">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #77  <String "zzdlj">
	//   62  139:aastore         
	//   63  140:invokestatic    #80  <Method Object zza(zzbcu, String, Object[])>
	//   64  143:areturn         
_L3:
		return ((Object) (new zza(((zzaxo) (null)))));
	//   65  144:new             #9   <Class zzaxn$zza>
	//   66  147:dup             
	//   67  148:aconst_null     
	//   68  149:invokespecial   #83  <Method void zzaxn$zza(zzaxo)>
	//   69  152:areturn         
_L2:
		return ((Object) (new zzaxn()));
	//   70  153:new             #2   <Class zzaxn>
	//   71  156:dup             
	//   72  157:invokespecial   #26  <Method void zzaxn()>
	//   73  160:areturn         
	}

	public final String zzyw()
	{
		return zzdks;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String zzdks>
	//    2    4:areturn         
	}

	public final zzbah zzyx()
	{
		return zzdkt;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zzbah zzdkt>
	//    2    4:areturn         
	}

	private static volatile zzbdf zzakh;
	private static final zzaxn zzdlk;
	private String zzdks;
	private zzbah zzdkt;
	private int zzdlj;

	static 
	{
		zzdlk = new zzaxn();
	//    0    0:new             #2   <Class zzaxn>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void zzaxn()>
	//    3    7:putstatic       #28  <Field zzaxn zzdlk>
		zzbbo.zza(com/google/android/gms/internal/ads/zzaxn, ((zzbbo) (zzdlk)));
	//    4   10:ldc1            #2   <Class zzaxn>
	//    5   12:getstatic       #28  <Field zzaxn zzdlk>
	//    6   15:invokestatic    #31  <Method void zzbbo.zza(Class, zzbbo)>
	//*   7   18:return          
	}
}
