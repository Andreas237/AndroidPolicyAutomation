// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, aks, ako, 
//			asj, akn, ams, aug, 
//			aqq

public final class akm extends ash
	implements atx
{

	private akm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void ash()>
	//    2    4:return          
	}

	public static akm a(aqq aqq)
	{
		return (akm)ash.a(((ash) (zzfeg)), aqq);
	//    0    0:getstatic       #21  <Field akm zzfeg>
	//    1    3:aload_0         
	//    2    4:invokestatic    #31  <Method ash ash.a(ash, aqq)>
	//    3    7:checkcast       #2   <Class akm>
	//    4   10:areturn         
	}

	static akm c()
	{
		return zzfeg;
	//    0    0:getstatic       #21  <Field akm zzfeg>
	//    1    3:areturn         
	}

	public final aks a()
	{
		aks aks2 = zzfee;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field aks zzfee>
	//    2    4:astore_2        
		aks aks1 = aks2;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(aks2 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       15
			aks1 = aks.c();
	//    7   11:invokestatic    #40  <Method aks aks.c()>
	//    8   14:astore_1        
		return aks1;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		ako.a[i - 1];
	//    0    0:getstatic       #46  <Field int[] ako.a>
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
	//    6   48:new             #48  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #49  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #55  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #57  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/akm;
	//   19   71:ldc1            #2   <Class akm>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #57  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzfeg)))));
	//   27   84:new             #59  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #21  <Field akm zzfeg>
	//   30   91:invokespecial   #62  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #57  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/akm;
	//   34   99:ldc1            #2   <Class akm>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/akm;
	//   39  105:ldc1            #2   <Class akm>
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
		return ((Object) (zzfeg));
	//   45  112:getstatic       #21  <Field akm zzfeg>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzfeg)), "\000\002\000\000\001\002\002\000\000\000\001\t\002\t", new Object[] {
			"zzfee", "zzfef"
		});
	//   47  116:getstatic       #21  <Field akm zzfeg>
	//   48  119:ldc1            #64  <String "\000\002\000\000\001\002\002\000\000\000\001\t\002\t">
	//   49  121:iconst_2        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #67  <String "zzfee">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #68  <String "zzfef">
	//   58  134:aastore         
	//   59  135:invokestatic    #71  <Method Object a(atv, String, Object[])>
	//   60  138:areturn         
_L3:
		return ((Object) (new akn(((ako) (null)))));
	//   61  139:new             #73  <Class akn>
	//   62  142:dup             
	//   63  143:aconst_null     
	//   64  144:invokespecial   #76  <Method void akn(ako)>
	//   65  147:areturn         
_L2:
		return ((Object) (new akm()));
	//   66  148:new             #2   <Class akm>
	//   67  151:dup             
	//   68  152:invokespecial   #19  <Method void akm()>
	//   69  155:areturn         
	}

	public final ams b()
	{
		ams ams2 = zzfef;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field ams zzfef>
	//    2    4:astore_2        
		ams ams1 = ams2;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(ams2 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       15
			ams1 = ams.c();
	//    7   11:invokestatic    #84  <Method ams ams.c()>
	//    8   14:astore_1        
		return ams1;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	private static volatile aug zzcas;
	private static final akm zzfeg;
	private aks zzfee;
	private ams zzfef;

	static 
	{
		zzfeg = new akm();
	//    0    0:new             #2   <Class akm>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void akm()>
	//    3    7:putstatic       #21  <Field akm zzfeg>
		ash.a(com/google/android/gms/internal/ads/akm, ((ash) (zzfeg)));
	//    4   10:ldc1            #2   <Class akm>
	//    5   12:getstatic       #21  <Field akm zzfeg>
	//    6   15:invokestatic    #25  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
