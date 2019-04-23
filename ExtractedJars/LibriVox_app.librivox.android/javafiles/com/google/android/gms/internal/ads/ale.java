// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, alg, asj, 
//			alf, aug

public final class ale extends ash
	implements atx
{

	private ale()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void ash()>
	//    2    4:return          
	}

	public static ale b()
	{
		return zzfer;
	//    0    0:getstatic       #19  <Field ale zzfer>
	//    1    3:areturn         
	}

	static ale c()
	{
		return zzfer;
	//    0    0:getstatic       #19  <Field ale zzfer>
	//    1    3:areturn         
	}

	public final int a()
	{
		return zzfem;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int zzfem>
	//    2    4:ireturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		alg.a[i - 1];
	//    0    0:getstatic       #37  <Field int[] alg.a>
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
	//    6   48:new             #39  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #40  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #46  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #48  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/ale;
	//   19   71:ldc1            #2   <Class ale>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #48  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzfer)))));
	//   27   84:new             #50  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #19  <Field ale zzfer>
	//   30   91:invokespecial   #53  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #48  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/ale;
	//   34   99:ldc1            #2   <Class ale>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/ale;
	//   39  105:ldc1            #2   <Class ale>
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
		return ((Object) (zzfer));
	//   45  112:getstatic       #19  <Field ale zzfer>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzfer)), "\000\001\000\000\001\001\001\000\000\000\001\013", new Object[] {
			"zzfem"
		});
	//   47  116:getstatic       #19  <Field ale zzfer>
	//   48  119:ldc1            #55  <String "\000\001\000\000\001\001\001\000\000\000\001\013">
	//   49  121:iconst_1        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #58  <String "zzfem">
	//   54  129:aastore         
	//   55  130:invokestatic    #61  <Method Object a(atv, String, Object[])>
	//   56  133:areturn         
_L3:
		return ((Object) (new alf(((alg) (null)))));
	//   57  134:new             #63  <Class alf>
	//   58  137:dup             
	//   59  138:aconst_null     
	//   60  139:invokespecial   #66  <Method void alf(alg)>
	//   61  142:areturn         
_L2:
		return ((Object) (new ale()));
	//   62  143:new             #2   <Class ale>
	//   63  146:dup             
	//   64  147:invokespecial   #17  <Method void ale()>
	//   65  150:areturn         
	}

	private static volatile aug zzcas;
	private static final ale zzfer;
	private int zzfem;

	static 
	{
		zzfer = new ale();
	//    0    0:new             #2   <Class ale>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void ale()>
	//    3    7:putstatic       #19  <Field ale zzfer>
		ash.a(com/google/android/gms/internal/ads/ale, ((ash) (zzfer)));
	//    4   10:ldc1            #2   <Class ale>
	//    5   12:getstatic       #19  <Field ale zzfer>
	//    6   15:invokestatic    #23  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
