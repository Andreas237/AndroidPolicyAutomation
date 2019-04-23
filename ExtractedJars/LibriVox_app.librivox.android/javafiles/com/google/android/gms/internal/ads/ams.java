// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, amv, amu, 
//			asj, amt, aug, aqq

public final class ams extends ash
	implements atx
{

	private ams()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void ash()>
	//    2    4:return          
	}

	public static ams a(aqq aqq)
	{
		return (ams)ash.a(((ash) (zzfgg)), aqq);
	//    0    0:getstatic       #21  <Field ams zzfgg>
	//    1    3:aload_0         
	//    2    4:invokestatic    #31  <Method ash ash.a(ash, aqq)>
	//    3    7:checkcast       #2   <Class ams>
	//    4   10:areturn         
	}

	public static ams c()
	{
		return zzfgg;
	//    0    0:getstatic       #21  <Field ams zzfgg>
	//    1    3:areturn         
	}

	static ams d()
	{
		return zzfgg;
	//    0    0:getstatic       #21  <Field ams zzfgg>
	//    1    3:areturn         
	}

	public final amv a()
	{
		amv amv2 = zzfge;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field amv zzfge>
	//    2    4:astore_2        
		amv amv1 = amv2;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(amv2 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       15
			amv1 = amv.c();
	//    7   11:invokestatic    #41  <Method amv amv.c()>
	//    8   14:astore_1        
		return amv1;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		amu.a[i - 1];
	//    0    0:getstatic       #47  <Field int[] amu.a>
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
	//    6   48:new             #49  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #50  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #56  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #58  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/ams;
	//   19   71:ldc1            #2   <Class ams>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #58  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzfgg)))));
	//   27   84:new             #60  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #21  <Field ams zzfgg>
	//   30   91:invokespecial   #63  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #58  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/ams;
	//   34   99:ldc1            #2   <Class ams>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/ams;
	//   39  105:ldc1            #2   <Class ams>
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
		return ((Object) (zzfgg));
	//   45  112:getstatic       #21  <Field ams zzfgg>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzfgg)), "\000\002\000\000\001\002\002\000\000\000\001\t\002\013", new Object[] {
			"zzfge", "zzfek"
		});
	//   47  116:getstatic       #21  <Field ams zzfgg>
	//   48  119:ldc1            #65  <String "\000\002\000\000\001\002\002\000\000\000\001\t\002\013">
	//   49  121:iconst_2        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #68  <String "zzfge">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #69  <String "zzfek">
	//   58  134:aastore         
	//   59  135:invokestatic    #72  <Method Object a(atv, String, Object[])>
	//   60  138:areturn         
_L3:
		return ((Object) (new amt(((amu) (null)))));
	//   61  139:new             #74  <Class amt>
	//   62  142:dup             
	//   63  143:aconst_null     
	//   64  144:invokespecial   #77  <Method void amt(amu)>
	//   65  147:areturn         
_L2:
		return ((Object) (new ams()));
	//   66  148:new             #2   <Class ams>
	//   67  151:dup             
	//   68  152:invokespecial   #19  <Method void ams()>
	//   69  155:areturn         
	}

	public final int b()
	{
		return zzfek;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field int zzfek>
	//    2    4:ireturn         
	}

	private static volatile aug zzcas;
	private static final ams zzfgg;
	private int zzfek;
	private amv zzfge;

	static 
	{
		zzfgg = new ams();
	//    0    0:new             #2   <Class ams>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void ams()>
	//    3    7:putstatic       #21  <Field ams zzfgg>
		ash.a(com/google/android/gms/internal/ads/ams, ((ash) (zzfgg)));
	//    4   10:ldc1            #2   <Class ams>
	//    5   12:getstatic       #21  <Field ams zzfgg>
	//    6   15:invokestatic    #25  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
