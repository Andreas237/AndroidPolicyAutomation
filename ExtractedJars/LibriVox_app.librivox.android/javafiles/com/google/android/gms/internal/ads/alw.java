// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, alz, aly, 
//			asj, alx, aug, aqq

public final class alw extends ash
	implements atx
{

	private alw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void ash()>
	//    2    4:return          
	}

	public static alw a(aqq aqq)
	{
		return (alw)ash.a(((ash) (zzffe)), aqq);
	//    0    0:getstatic       #19  <Field alw zzffe>
	//    1    3:aload_0         
	//    2    4:invokestatic    #29  <Method ash ash.a(ash, aqq)>
	//    3    7:checkcast       #2   <Class alw>
	//    4   10:areturn         
	}

	static alw b()
	{
		return zzffe;
	//    0    0:getstatic       #19  <Field alw zzffe>
	//    1    3:areturn         
	}

	public final alz a()
	{
		alz alz2 = zzffd;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field alz zzffd>
	//    2    4:astore_2        
		alz alz1 = alz2;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(alz2 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       15
			alz1 = alz.d();
	//    7   11:invokestatic    #39  <Method alz alz.d()>
	//    8   14:astore_1        
		return alz1;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		aly.a[i - 1];
	//    0    0:getstatic       #45  <Field int[] aly.a>
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
	//    6   48:new             #47  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #48  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #54  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #56  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/alw;
	//   19   71:ldc1            #2   <Class alw>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #56  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzffe)))));
	//   27   84:new             #58  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #19  <Field alw zzffe>
	//   30   91:invokespecial   #61  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #56  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/alw;
	//   34   99:ldc1            #2   <Class alw>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/alw;
	//   39  105:ldc1            #2   <Class alw>
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
		return ((Object) (zzffe));
	//   45  112:getstatic       #19  <Field alw zzffe>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzffe)), "\000\001\000\000\001\001\001\000\000\000\001\t", new Object[] {
			"zzffd"
		});
	//   47  116:getstatic       #19  <Field alw zzffe>
	//   48  119:ldc1            #63  <String "\000\001\000\000\001\001\001\000\000\000\001\t">
	//   49  121:iconst_1        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #66  <String "zzffd">
	//   54  129:aastore         
	//   55  130:invokestatic    #69  <Method Object a(atv, String, Object[])>
	//   56  133:areturn         
_L3:
		return ((Object) (new alx(((aly) (null)))));
	//   57  134:new             #71  <Class alx>
	//   58  137:dup             
	//   59  138:aconst_null     
	//   60  139:invokespecial   #74  <Method void alx(aly)>
	//   61  142:areturn         
_L2:
		return ((Object) (new alw()));
	//   62  143:new             #2   <Class alw>
	//   63  146:dup             
	//   64  147:invokespecial   #17  <Method void alw()>
	//   65  150:areturn         
	}

	private static volatile aug zzcas;
	private static final alw zzffe;
	private alz zzffd;

	static 
	{
		zzffe = new alw();
	//    0    0:new             #2   <Class alw>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void alw()>
	//    3    7:putstatic       #19  <Field alw zzffe>
		ash.a(com/google/android/gms/internal/ads/alw, ((ash) (zzffe)));
	//    4   10:ldc1            #2   <Class alw>
	//    5   12:getstatic       #19  <Field alw zzffe>
	//    6   15:invokestatic    #23  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
