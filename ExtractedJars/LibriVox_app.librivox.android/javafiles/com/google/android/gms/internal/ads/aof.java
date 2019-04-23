// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, aoh, asj, 
//			aog, ang, aug, aqq

public final class aof extends ash
	implements atx
{

	private aof()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void ash()>
		zzfhy = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #29  <String "">
	//    4    7:putfield        #31  <Field String zzfhy>
	//    5   10:return          
	}

	public static aof a(aqq aqq)
	{
		return (aof)ash.a(((ash) (zzfia)), aqq);
	//    0    0:getstatic       #21  <Field aof zzfia>
	//    1    3:aload_0         
	//    2    4:invokestatic    #35  <Method ash ash.a(ash, aqq)>
	//    3    7:checkcast       #2   <Class aof>
	//    4   10:areturn         
	}

	public static aof c()
	{
		return zzfia;
	//    0    0:getstatic       #21  <Field aof zzfia>
	//    1    3:areturn         
	}

	static aof d()
	{
		return zzfia;
	//    0    0:getstatic       #21  <Field aof zzfia>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		aoh.a[i - 1];
	//    0    0:getstatic       #44  <Field int[] aoh.a>
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
	//    6   48:new             #46  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #47  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #53  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #55  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/aof;
	//   19   71:ldc1            #2   <Class aof>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #55  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzfia)))));
	//   27   84:new             #57  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #21  <Field aof zzfia>
	//   30   91:invokespecial   #60  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #55  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/aof;
	//   34   99:ldc1            #2   <Class aof>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/aof;
	//   39  105:ldc1            #2   <Class aof>
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
		return ((Object) (zzfia));
	//   45  112:getstatic       #21  <Field aof zzfia>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzfia)), "\000\002\000\000\001\002\002\000\000\000\001\u0208\002\t", new Object[] {
			"zzfhy", "zzfhz"
		});
	//   47  116:getstatic       #21  <Field aof zzfia>
	//   48  119:ldc1            #62  <String "\000\002\000\000\001\002\002\000\000\000\001\u0208\002\t">
	//   49  121:iconst_2        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #65  <String "zzfhy">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #66  <String "zzfhz">
	//   58  134:aastore         
	//   59  135:invokestatic    #69  <Method Object a(atv, String, Object[])>
	//   60  138:areturn         
_L3:
		return ((Object) (new aog(((aoh) (null)))));
	//   61  139:new             #71  <Class aog>
	//   62  142:dup             
	//   63  143:aconst_null     
	//   64  144:invokespecial   #74  <Method void aog(aoh)>
	//   65  147:areturn         
_L2:
		return ((Object) (new aof()));
	//   66  148:new             #2   <Class aof>
	//   67  151:dup             
	//   68  152:invokespecial   #19  <Method void aof()>
	//   69  155:areturn         
	}

	public final String a()
	{
		return zzfhy;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String zzfhy>
	//    2    4:areturn         
	}

	public final ang b()
	{
		ang ang2 = zzfhz;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field ang zzfhz>
	//    2    4:astore_2        
		ang ang1 = ang2;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(ang2 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       15
			ang1 = ang.c();
	//    7   11:invokestatic    #83  <Method ang ang.c()>
	//    8   14:astore_1        
		return ang1;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	private static volatile aug zzcas;
	private static final aof zzfia;
	private String zzfhy;
	private ang zzfhz;

	static 
	{
		zzfia = new aof();
	//    0    0:new             #2   <Class aof>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void aof()>
	//    3    7:putstatic       #21  <Field aof zzfia>
		ash.a(com/google/android/gms/internal/ads/aof, ((ash) (zzfia)));
	//    4   10:ldc1            #2   <Class aof>
	//    5   12:getstatic       #21  <Field aof zzfia>
	//    6   15:invokestatic    #25  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
