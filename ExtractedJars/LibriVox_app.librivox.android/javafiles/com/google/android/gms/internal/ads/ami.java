// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, aqq, aml, 
//			amk, asj, amj, amn, 
//			aug

public final class ami extends ash
	implements atx
{

	private ami()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void ash()>
		zzffq = aqq.a;
	//    2    4:aload_0         
	//    3    5:getstatic       #32  <Field aqq aqq.a>
	//    4    8:putfield        #34  <Field aqq zzffq>
	//    5   11:return          
	}

	public static ami d()
	{
		return zzffr;
	//    0    0:getstatic       #22  <Field ami zzffr>
	//    1    3:areturn         
	}

	static ami e()
	{
		return zzffr;
	//    0    0:getstatic       #22  <Field ami zzffr>
	//    1    3:areturn         
	}

	public final aml a()
	{
		aml aml2 = aml.a(zzffo);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int zzffo>
	//    2    4:invokestatic    #45  <Method aml aml.a(int)>
	//    3    7:astore_2        
		aml aml1 = aml2;
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(aml2 == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       18
			aml1 = aml.d;
	//    8   14:getstatic       #48  <Field aml aml.d>
	//    9   17:astore_1        
		return aml1;
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		amk.a[i - 1];
	//    0    0:getstatic       #54  <Field int[] amk.a>
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
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #65  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/ami;
	//   19   71:ldc1            #2   <Class ami>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #65  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzffr)))));
	//   27   84:new             #67  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #22  <Field ami zzffr>
	//   30   91:invokespecial   #70  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #65  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/ami;
	//   34   99:ldc1            #2   <Class ami>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/ami;
	//   39  105:ldc1            #2   <Class ami>
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
		return ((Object) (zzffr));
	//   45  112:getstatic       #22  <Field ami zzffr>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzffr)), "\000\003\000\000\001\013\003\000\000\000\001\f\002\f\013\n", new Object[] {
			"zzffo", "zzffp", "zzffq"
		});
	//   47  116:getstatic       #22  <Field ami zzffr>
	//   48  119:ldc1            #72  <String "\000\003\000\000\001\013\003\000\000\000\001\f\002\f\013\n">
	//   49  121:iconst_3        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #75  <String "zzffo">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #76  <String "zzffp">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #77  <String "zzffq">
	//   62  139:aastore         
	//   63  140:invokestatic    #80  <Method Object a(atv, String, Object[])>
	//   64  143:areturn         
_L3:
		return ((Object) (new amj(((amk) (null)))));
	//   65  144:new             #82  <Class amj>
	//   66  147:dup             
	//   67  148:aconst_null     
	//   68  149:invokespecial   #85  <Method void amj(amk)>
	//   69  152:areturn         
_L2:
		return ((Object) (new ami()));
	//   70  153:new             #2   <Class ami>
	//   71  156:dup             
	//   72  157:invokespecial   #20  <Method void ami()>
	//   73  160:areturn         
	}

	public final amn b()
	{
		amn amn2 = amn.a(zzffp);
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int zzffp>
	//    2    4:invokestatic    #94  <Method amn amn.a(int)>
	//    3    7:astore_2        
		amn amn1 = amn2;
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(amn2 == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       18
			amn1 = amn.d;
	//    8   14:getstatic       #97  <Field amn amn.d>
	//    9   17:astore_1        
		return amn1;
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	public final aqq c()
	{
		return zzffq;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field aqq zzffq>
	//    2    4:areturn         
	}

	private static volatile aug zzcas;
	private static final ami zzffr;
	private int zzffo;
	private int zzffp;
	private aqq zzffq;

	static 
	{
		zzffr = new ami();
	//    0    0:new             #2   <Class ami>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void ami()>
	//    3    7:putstatic       #22  <Field ami zzffr>
		ash.a(com/google/android/gms/internal/ads/ami, ((ash) (zzffr)));
	//    4   10:ldc1            #2   <Class ami>
	//    5   12:getstatic       #22  <Field ami zzffr>
	//    6   15:invokestatic    #26  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
