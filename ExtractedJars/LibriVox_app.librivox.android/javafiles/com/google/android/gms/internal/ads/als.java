// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, ang, alv, 
//			asj, alt, aug

public final class als extends ash
	implements atx
{

	private als()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void ash()>
	//    2    4:return          
	}

	public static als b()
	{
		return zzffc;
	//    0    0:getstatic       #19  <Field als zzffc>
	//    1    3:areturn         
	}

	static als c()
	{
		return zzffc;
	//    0    0:getstatic       #19  <Field als zzffc>
	//    1    3:areturn         
	}

	public final ang a()
	{
		ang ang2 = zzffb;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ang zzffb>
	//    2    4:astore_2        
		ang ang1 = ang2;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(ang2 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       15
			ang1 = ang.c();
	//    7   11:invokestatic    #35  <Method ang ang.c()>
	//    8   14:astore_1        
		return ang1;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		alv.a[i - 1];
	//    0    0:getstatic       #41  <Field int[] alv.a>
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
	//    6   48:new             #43  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #44  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #50  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #52  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/als;
	//   19   71:ldc1            #2   <Class als>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #52  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzffc)))));
	//   27   84:new             #54  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #19  <Field als zzffc>
	//   30   91:invokespecial   #57  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #52  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/als;
	//   34   99:ldc1            #2   <Class als>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/als;
	//   39  105:ldc1            #2   <Class als>
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
		return ((Object) (zzffc));
	//   45  112:getstatic       #19  <Field als zzffc>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzffc)), "\000\001\000\000\002\002\001\000\000\000\002\t", new Object[] {
			"zzffb"
		});
	//   47  116:getstatic       #19  <Field als zzffc>
	//   48  119:ldc1            #59  <String "\000\001\000\000\002\002\001\000\000\000\002\t">
	//   49  121:iconst_1        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #62  <String "zzffb">
	//   54  129:aastore         
	//   55  130:invokestatic    #65  <Method Object a(atv, String, Object[])>
	//   56  133:areturn         
_L3:
		return ((Object) (new alt(((alv) (null)))));
	//   57  134:new             #67  <Class alt>
	//   58  137:dup             
	//   59  138:aconst_null     
	//   60  139:invokespecial   #70  <Method void alt(alv)>
	//   61  142:areturn         
_L2:
		return ((Object) (new als()));
	//   62  143:new             #2   <Class als>
	//   63  146:dup             
	//   64  147:invokespecial   #17  <Method void als()>
	//   65  150:areturn         
	}

	private static volatile aug zzcas;
	private static final als zzffc;
	private ang zzffb;

	static 
	{
		zzffc = new als();
	//    0    0:new             #2   <Class als>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void als()>
	//    3    7:putstatic       #19  <Field als zzffc>
		ash.a(com/google/android/gms/internal/ads/als, ((ash) (zzffc)));
	//    4   10:ldc1            #2   <Class als>
	//    5   12:getstatic       #19  <Field als zzffc>
	//    6   15:invokestatic    #23  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
