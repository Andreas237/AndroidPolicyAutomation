// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, bup, asj, 
//			btt, aug

public final class bts extends ash
	implements atx
{

	private bts()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void ash()>
	//    2    4:return          
	}

	static bts a()
	{
		return zzcfk;
	//    0    0:getstatic       #21  <Field bts zzcfk>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		bup.a[i - 1];
	//    0    0:getstatic       #34  <Field int[] bup.a>
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
	//    6   48:new             #36  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #37  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #43  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #45  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/bts;
	//   19   71:ldc1            #2   <Class bts>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #45  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzcfk)))));
	//   27   84:new             #47  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #21  <Field bts zzcfk>
	//   30   91:invokespecial   #50  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #45  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/bts;
	//   34   99:ldc1            #2   <Class bts>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/bts;
	//   39  105:ldc1            #2   <Class bts>
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
		return ((Object) (zzcfk));
	//   45  112:getstatic       #21  <Field bts zzcfk>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzcfk)), "\001\002\000\001\001\002\002\000\000\000\001\004\000\002\004\001", new Object[] {
			"zzccg", "zzcfi", "zzcfj"
		});
	//   47  116:getstatic       #21  <Field bts zzcfk>
	//   48  119:ldc1            #52  <String "\001\002\000\001\001\002\002\000\000\000\001\004\000\002\004\001">
	//   49  121:iconst_3        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #55  <String "zzccg">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #56  <String "zzcfi">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #57  <String "zzcfj">
	//   62  139:aastore         
	//   63  140:invokestatic    #60  <Method Object a(atv, String, Object[])>
	//   64  143:areturn         
_L3:
		return ((Object) (new btt(((bup) (null)))));
	//   65  144:new             #62  <Class btt>
	//   66  147:dup             
	//   67  148:aconst_null     
	//   68  149:invokespecial   #65  <Method void btt(bup)>
	//   69  152:areturn         
_L2:
		return ((Object) (new bts()));
	//   70  153:new             #2   <Class bts>
	//   71  156:dup             
	//   72  157:invokespecial   #19  <Method void bts()>
	//   73  160:areturn         
	}

	private static volatile aug zzcas;
	private static final bts zzcfk;
	private int zzccg;
	private int zzcfi;
	private int zzcfj;

	static 
	{
		zzcfk = new bts();
	//    0    0:new             #2   <Class bts>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void bts()>
	//    3    7:putstatic       #21  <Field bts zzcfk>
		ash.a(com/google/android/gms/internal/ads/bts, ((ash) (zzcfk)));
	//    4   10:ldc1            #2   <Class bts>
	//    5   12:getstatic       #21  <Field bts zzcfk>
	//    6   15:invokestatic    #25  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
