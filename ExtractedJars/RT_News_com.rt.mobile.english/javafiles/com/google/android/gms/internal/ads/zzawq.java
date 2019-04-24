// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbo, zzbcw, zzawr, zzaww, 
//			zzawm, zzawk, zzbdf

public final class zzawq extends zzbbo
	implements zzbcw
{
	public static final class zza extends zzbbo.zza
		implements zzbcw
	{

		private zza()
		{
			super(((zzbbo) (zzawq.zzxy())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #16  <Method zzawq zzawq.zzxy()>
		//    2    4:invokespecial   #19  <Method void zzbbo$zza(zzbbo)>
		//    3    7:return          
		}

		zza(zzawr zzawr1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void zzawq$zza()>
		//    2    4:return          
		}
	}


	private zzawq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void zzbbo()>
	//    2    4:return          
	}

	public static zzawq zzxx()
	{
		return zzdjo;
	//    0    0:getstatic       #28  <Field zzawq zzdjo>
	//    1    3:areturn         
	}

	static zzawq zzxy()
	{
		return zzdjo;
	//    0    0:getstatic       #28  <Field zzawq zzdjo>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzawr.zzakf[i - 1];
	//    0    0:getstatic       #43  <Field int[] zzawr.zzakf>
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
	//    6   48:new             #45  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #46  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #52  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzakh));
	//   15   63:getstatic       #54  <Field zzbdf zzakh>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/zzawq;
	//   19   71:ldc1            #2   <Class zzawq>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzakh));
	//   21   74:getstatic       #54  <Field zzbdf zzakh>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzbbo.zzb(((zzbbo) (zzdjo)))));
	//   27   84:new             #56  <Class zzbbo$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #28  <Field zzawq zzdjo>
	//   30   91:invokespecial   #59  <Method void zzbbo$zzb(zzbbo)>
	//   31   94:astore_2        
		zzakh = ((zzbdf) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #54  <Field zzbdf zzakh>
_L12:
		com/google/android/gms/internal/ads/zzawq;
	//   34   99:ldc1            #2   <Class zzawq>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/zzawq;
	//   39  105:ldc1            #2   <Class zzawq>
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
		return ((Object) (zzdjo));
	//   45  112:getstatic       #28  <Field zzawq zzdjo>
	//   46  115:areturn         
_L4:
		return zza(((zzbcu) (zzdjo)), "\000\003\000\000\001\003\003\004\000\000\000\001\t\002\t\003\f", new Object[] {
			"zzdjl", "zzdjm", "zzdjn"
		});
	//   47  116:getstatic       #28  <Field zzawq zzdjo>
	//   48  119:ldc1            #61  <String "\000\003\000\000\001\003\003\004\000\000\000\001\t\002\t\003\f">
	//   49  121:iconst_3        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #64  <String "zzdjl">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #65  <String "zzdjm">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #66  <String "zzdjn">
	//   62  139:aastore         
	//   63  140:invokestatic    #69  <Method Object zza(zzbcu, String, Object[])>
	//   64  143:areturn         
_L3:
		return ((Object) (new zza(((zzawr) (null)))));
	//   65  144:new             #9   <Class zzawq$zza>
	//   66  147:dup             
	//   67  148:aconst_null     
	//   68  149:invokespecial   #72  <Method void zzawq$zza(zzawr)>
	//   69  152:areturn         
_L2:
		return ((Object) (new zzawq()));
	//   70  153:new             #2   <Class zzawq>
	//   71  156:dup             
	//   72  157:invokespecial   #26  <Method void zzawq()>
	//   73  160:areturn         
	}

	public final zzaww zzxu()
	{
		if(zzdjl == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field zzaww zzdjl>
	//*   2    4:ifnonnull       11
			return zzaww.zzyk();
	//    3    7:invokestatic    #81  <Method zzaww zzaww.zzyk()>
	//    4   10:areturn         
		else
			return zzdjl;
	//    5   11:aload_0         
	//    6   12:getfield        #76  <Field zzaww zzdjl>
	//    7   15:areturn         
	}

	public final zzawm zzxv()
	{
		if(zzdjm == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field zzawm zzdjm>
	//*   2    4:ifnonnull       11
			return zzawm.zzxq();
	//    3    7:invokestatic    #90  <Method zzawm zzawm.zzxq()>
	//    4   10:areturn         
		else
			return zzdjm;
	//    5   11:aload_0         
	//    6   12:getfield        #85  <Field zzawm zzdjm>
	//    7   15:areturn         
	}

	public final zzawk zzxw()
	{
		zzawk zzawk2 = zzawk.zzaq(zzdjn);
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field int zzdjn>
	//    2    4:invokestatic    #100 <Method zzawk zzawk.zzaq(int)>
	//    3    7:astore_2        
		zzawk zzawk1 = zzawk2;
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(zzawk2 == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       18
			zzawk1 = zzawk.zzdjf;
	//    8   14:getstatic       #104 <Field zzawk zzawk.zzdjf>
	//    9   17:astore_1        
		return zzawk1;
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	private static volatile zzbdf zzakh;
	private static final zzawq zzdjo;
	private zzaww zzdjl;
	private zzawm zzdjm;
	private int zzdjn;

	static 
	{
		zzdjo = new zzawq();
	//    0    0:new             #2   <Class zzawq>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void zzawq()>
	//    3    7:putstatic       #28  <Field zzawq zzdjo>
		zzbbo.zza(com/google/android/gms/internal/ads/zzawq, ((zzbbo) (zzdjo)));
	//    4   10:ldc1            #2   <Class zzawq>
	//    5   12:getstatic       #28  <Field zzawq zzdjo>
	//    6   15:invokestatic    #31  <Method void zzbbo.zza(Class, zzbbo)>
	//*   7   18:return          
	}
}
