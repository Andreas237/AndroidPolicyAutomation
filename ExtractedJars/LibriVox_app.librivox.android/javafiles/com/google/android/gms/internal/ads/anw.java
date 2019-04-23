// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, asm, asi, 
//			anx, any, asj, anz, 
//			aug, aqq

public final class anw extends ash
	implements atx
{

	private anw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void ash()>
	//    2    4:return          
	}

	public static anw a(aqq aqq)
	{
		return (anw)ash.a(((ash) (zzfht)), aqq);
	//    0    0:getstatic       #21  <Field anw zzfht>
	//    1    3:aload_0         
	//    2    4:invokestatic    #31  <Method ash ash.a(ash, aqq)>
	//    3    7:checkcast       #2   <Class anw>
	//    4   10:areturn         
	}

	static void a(anw anw1, int i)
	{
		anw1.b(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #36  <Method void b(int)>
	//    3    5:return          
	}

	static void a(anw anw1, anz anz1)
	{
		anw1.a(anz1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #40  <Method void a(anz)>
	//    3    5:return          
	}

	private final void a(anz anz1)
	{
		if(anz1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
		{
			zzfhs = anz1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #42  <Field anz zzfhs>
			return;
	//    5    9:return          
		} else
		{
			throw new NullPointerException();
	//    6   10:new             #44  <Class NullPointerException>
	//    7   13:dup             
	//    8   14:invokespecial   #45  <Method void NullPointerException()>
	//    9   17:athrow          
		}
	}

	private final void b(int i)
	{
		zzfea = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #47  <Field int zzfea>
	//    3    5:return          
	}

	public static anx c()
	{
		return (anx)(asi)((ash) (zzfht)).a(asm.e, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #21  <Field anw zzfht>
	//    1    3:getstatic       #54  <Field int asm.e>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #57  <Method Object ash.a(int, Object, Object)>
	//    5   11:checkcast       #59  <Class asi>
	//    6   14:checkcast       #61  <Class anx>
	//    7   17:areturn         
	}

	static anw d()
	{
		return zzfht;
	//    0    0:getstatic       #21  <Field anw zzfht>
	//    1    3:areturn         
	}

	public final int a()
	{
		return zzfea;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int zzfea>
	//    2    4:ireturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		any.a[i - 1];
	//    0    0:getstatic       #69  <Field int[] any.a>
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
	//    6   48:new             #71  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #72  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #78  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #80  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/anw;
	//   19   71:ldc1            #2   <Class anw>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #80  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzfht)))));
	//   27   84:new             #82  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #21  <Field anw zzfht>
	//   30   91:invokespecial   #85  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #80  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/anw;
	//   34   99:ldc1            #2   <Class anw>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/anw;
	//   39  105:ldc1            #2   <Class anw>
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
		return ((Object) (zzfht));
	//   45  112:getstatic       #21  <Field anw zzfht>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzfht)), "\000\002\000\000\001\002\002\000\000\000\001\013\002\t", new Object[] {
			"zzfea", "zzfhs"
		});
	//   47  116:getstatic       #21  <Field anw zzfht>
	//   48  119:ldc1            #87  <String "\000\002\000\000\001\002\002\000\000\000\001\013\002\t">
	//   49  121:iconst_2        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #90  <String "zzfea">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #91  <String "zzfhs">
	//   58  134:aastore         
	//   59  135:invokestatic    #94  <Method Object a(atv, String, Object[])>
	//   60  138:areturn         
_L3:
		return ((Object) (new anx(((any) (null)))));
	//   61  139:new             #61  <Class anx>
	//   62  142:dup             
	//   63  143:aconst_null     
	//   64  144:invokespecial   #97  <Method void anx(any)>
	//   65  147:areturn         
_L2:
		return ((Object) (new anw()));
	//   66  148:new             #2   <Class anw>
	//   67  151:dup             
	//   68  152:invokespecial   #19  <Method void anw()>
	//   69  155:areturn         
	}

	public final anz b()
	{
		anz anz2 = zzfhs;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field anz zzfhs>
	//    2    4:astore_2        
		anz anz1 = anz2;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(anz2 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       15
			anz1 = anz.b();
	//    7   11:invokestatic    #102 <Method anz anz.b()>
	//    8   14:astore_1        
		return anz1;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	private static volatile aug zzcas;
	private static final anw zzfht;
	private int zzfea;
	private anz zzfhs;

	static 
	{
		zzfht = new anw();
	//    0    0:new             #2   <Class anw>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void anw()>
	//    3    7:putstatic       #21  <Field anw zzfht>
		ash.a(com/google/android/gms/internal/ads/anw, ((ash) (zzfht)));
	//    4   10:ldc1            #2   <Class anw>
	//    5   12:getstatic       #21  <Field anw zzfht>
	//    6   15:invokestatic    #25  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
