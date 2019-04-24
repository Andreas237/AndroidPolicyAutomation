// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbo, zzbcw, zzbah, zzawx, 
//			zzawy, zzaxa, zzbdf

public final class zzaww extends zzbbo
	implements zzbcw
{
	public static final class zza extends zzbbo.zza
		implements zzbcw
	{

		private zza()
		{
			super(((zzbbo) (zzaww.zzyl())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #16  <Method zzaww zzaww.zzyl()>
		//    2    4:invokespecial   #19  <Method void zzbbo$zza(zzbbo)>
		//    3    7:return          
		}

		zza(zzawx zzawx1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void zzaww$zza()>
		//    2    4:return          
		}
	}


	private zzaww()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void zzbbo()>
		zzdjw = zzbah.zzdpq;
	//    2    4:aload_0         
	//    3    5:getstatic       #37  <Field zzbah zzbah.zzdpq>
	//    4    8:putfield        #39  <Field zzbah zzdjw>
	//    5   11:return          
	}

	public static zzaww zzyk()
	{
		return zzdjx;
	//    0    0:getstatic       #27  <Field zzaww zzdjx>
	//    1    3:areturn         
	}

	static zzaww zzyl()
	{
		return zzdjx;
	//    0    0:getstatic       #27  <Field zzaww zzdjx>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzawx.zzakf[i - 1];
	//    0    0:getstatic       #49  <Field int[] zzawx.zzakf>
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
	//    6   48:new             #51  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #52  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #58  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzakh));
	//   15   63:getstatic       #60  <Field zzbdf zzakh>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/zzaww;
	//   19   71:ldc1            #2   <Class zzaww>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzakh));
	//   21   74:getstatic       #60  <Field zzbdf zzakh>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzbbo.zzb(((zzbbo) (zzdjx)))));
	//   27   84:new             #62  <Class zzbbo$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #27  <Field zzaww zzdjx>
	//   30   91:invokespecial   #65  <Method void zzbbo$zzb(zzbbo)>
	//   31   94:astore_2        
		zzakh = ((zzbdf) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #60  <Field zzbdf zzakh>
_L12:
		com/google/android/gms/internal/ads/zzaww;
	//   34   99:ldc1            #2   <Class zzaww>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/zzaww;
	//   39  105:ldc1            #2   <Class zzaww>
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
		return ((Object) (zzdjx));
	//   45  112:getstatic       #27  <Field zzaww zzdjx>
	//   46  115:areturn         
_L4:
		return zza(((zzbcu) (zzdjx)), "\000\003\000\000\001\013\013\f\000\000\000\001\f\002\f\013\n", new Object[] {
			"zzdju", "zzdjv", "zzdjw"
		});
	//   47  116:getstatic       #27  <Field zzaww zzdjx>
	//   48  119:ldc1            #67  <String "\000\003\000\000\001\013\013\f\000\000\000\001\f\002\f\013\n">
	//   49  121:iconst_3        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #70  <String "zzdju">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #71  <String "zzdjv">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #72  <String "zzdjw">
	//   62  139:aastore         
	//   63  140:invokestatic    #75  <Method Object zza(zzbcu, String, Object[])>
	//   64  143:areturn         
_L3:
		return ((Object) (new zza(((zzawx) (null)))));
	//   65  144:new             #9   <Class zzaww$zza>
	//   66  147:dup             
	//   67  148:aconst_null     
	//   68  149:invokespecial   #78  <Method void zzaww$zza(zzawx)>
	//   69  152:areturn         
_L2:
		return ((Object) (new zzaww()));
	//   70  153:new             #2   <Class zzaww>
	//   71  156:dup             
	//   72  157:invokespecial   #25  <Method void zzaww()>
	//   73  160:areturn         
	}

	public final zzawy zzyh()
	{
		zzawy zzawy2 = zzawy.zzat(zzdju);
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field int zzdju>
	//    2    4:invokestatic    #88  <Method zzawy zzawy.zzat(int)>
	//    3    7:astore_2        
		zzawy zzawy1 = zzawy2;
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(zzawy2 == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       18
			zzawy1 = zzawy.zzdkd;
	//    8   14:getstatic       #92  <Field zzawy zzawy.zzdkd>
	//    9   17:astore_1        
		return zzawy1;
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	public final zzaxa zzyi()
	{
		zzaxa zzaxa2 = zzaxa.zzau(zzdjv);
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field int zzdjv>
	//    2    4:invokestatic    #102 <Method zzaxa zzaxa.zzau(int)>
	//    3    7:astore_2        
		zzaxa zzaxa1 = zzaxa2;
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(zzaxa2 == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       18
			zzaxa1 = zzaxa.zzdkk;
	//    8   14:getstatic       #106 <Field zzaxa zzaxa.zzdkk>
	//    9   17:astore_1        
		return zzaxa1;
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	public final zzbah zzyj()
	{
		return zzdjw;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field zzbah zzdjw>
	//    2    4:areturn         
	}

	private static volatile zzbdf zzakh;
	private static final zzaww zzdjx;
	private int zzdju;
	private int zzdjv;
	private zzbah zzdjw;

	static 
	{
		zzdjx = new zzaww();
	//    0    0:new             #2   <Class zzaww>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void zzaww()>
	//    3    7:putstatic       #27  <Field zzaww zzdjx>
		zzbbo.zza(com/google/android/gms/internal/ads/zzaww, ((zzbbo) (zzdjx)));
	//    4   10:ldc1            #2   <Class zzaww>
	//    5   12:getstatic       #27  <Field zzaww zzdjx>
	//    6   15:invokestatic    #30  <Method void zzbbo.zza(Class, zzbbo)>
	//*   7   18:return          
	}
}
