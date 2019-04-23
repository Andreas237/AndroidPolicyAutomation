// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, asm, asi, 
//			ans, ast, anv, asj, 
//			ant, aug

public final class anr extends ash
	implements atx
{

	private anr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void ash()>
		zzfhp = n();
	//    2    4:aload_0         
	//    3    5:invokestatic    #32  <Method ast n()>
	//    4    8:putfield        #34  <Field ast zzfhp>
	//    5   11:return          
	}

	public static ans a()
	{
		return (ans)(asi)((ash) (zzfhq)).a(asm.e, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #22  <Field anr zzfhq>
	//    1    3:getstatic       #40  <Field int asm.e>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #43  <Method Object ash.a(int, Object, Object)>
	//    5   11:checkcast       #45  <Class asi>
	//    6   14:checkcast       #47  <Class ans>
	//    7   17:areturn         
	}

	static void a(anr anr1, int i)
	{
		anr1.b(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #52  <Method void b(int)>
	//    3    5:return          
	}

	static void a(anr anr1, ant ant1)
	{
		anr1.a(ant1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #56  <Method void a(ant)>
	//    3    5:return          
	}

	private final void a(ant ant1)
	{
		if(ant1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          65
		{
			if(!zzfhp.a())
	//*   2    4:aload_0         
	//*   3    5:getfield        #34  <Field ast zzfhp>
	//*   4    8:invokeinterface #61  <Method boolean ast.a()>
	//*   5   13:ifne            53
			{
				ast ast1 = zzfhp;
	//    6   16:aload_0         
	//    7   17:getfield        #34  <Field ast zzfhp>
	//    8   20:astore_3        
				int i = ast1.size();
	//    9   21:aload_3         
	//   10   22:invokeinterface #65  <Method int ast.size()>
	//   11   27:istore_2        
				if(i == 0)
	//*  12   28:iload_2         
	//*  13   29:ifne            38
					i = 10;
	//   14   32:bipush          10
	//   15   34:istore_2        
				else
	//*  16   35:goto            42
					i <<= 1;
	//   17   38:iload_2         
	//   18   39:iconst_1        
	//   19   40:ishl            
	//   20   41:istore_2        
				zzfhp = ast1.a(i);
	//   21   42:aload_0         
	//   22   43:aload_3         
	//   23   44:iload_2         
	//   24   45:invokeinterface #68  <Method ast ast.a(int)>
	//   25   50:putfield        #34  <Field ast zzfhp>
			}
			zzfhp.add(((Object) (ant1)));
	//   26   53:aload_0         
	//   27   54:getfield        #34  <Field ast zzfhp>
	//   28   57:aload_1         
	//   29   58:invokeinterface #72  <Method boolean ast.add(Object)>
	//   30   63:pop             
			return;
	//   31   64:return          
		} else
		{
			throw new NullPointerException();
	//   32   65:new             #74  <Class NullPointerException>
	//   33   68:dup             
	//   34   69:invokespecial   #75  <Method void NullPointerException()>
	//   35   72:athrow          
		}
	}

	static anr b()
	{
		return zzfhq;
	//    0    0:getstatic       #22  <Field anr zzfhq>
	//    1    3:areturn         
	}

	private final void b(int i)
	{
		zzfhi = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #78  <Field int zzfhi>
	//    3    5:return          
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		anv.a[i - 1];
	//    0    0:getstatic       #83  <Field int[] anv.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 158
	//	               2 149
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 158
	//	               2 149
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #85  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #86  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #92  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #94  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/anr;
	//   19   71:ldc1            #2   <Class anr>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #94  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzfhq)))));
	//   27   84:new             #96  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #22  <Field anr zzfhq>
	//   30   91:invokespecial   #99  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #94  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/anr;
	//   34   99:ldc1            #2   <Class anr>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/anr;
	//   39  105:ldc1            #2   <Class anr>
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
		return ((Object) (zzfhq));
	//   45  112:getstatic       #22  <Field anr zzfhq>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzfhq)), "\000\002\000\001\001\002\002\000\001\000\001\013\002\033", new Object[] {
			"zzccg", "zzfhi", "zzfhp", com/google/android/gms/internal/ads/ant
		});
	//   47  116:getstatic       #22  <Field anr zzfhq>
	//   48  119:ldc1            #101 <String "\000\002\000\001\001\002\002\000\001\000\001\013\002\033">
	//   49  121:iconst_4        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #104 <String "zzccg">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #105 <String "zzfhi">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #106 <String "zzfhp">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #108 <Class ant>
	//   66  144:aastore         
	//   67  145:invokestatic    #111 <Method Object a(atv, String, Object[])>
	//   68  148:areturn         
_L3:
		return ((Object) (new ans(((anv) (null)))));
	//   69  149:new             #47  <Class ans>
	//   70  152:dup             
	//   71  153:aconst_null     
	//   72  154:invokespecial   #114 <Method void ans(anv)>
	//   73  157:areturn         
_L2:
		return ((Object) (new anr()));
	//   74  158:new             #2   <Class anr>
	//   75  161:dup             
	//   76  162:invokespecial   #20  <Method void anr()>
	//   77  165:areturn         
	}

	private static volatile aug zzcas;
	private static final anr zzfhq;
	private int zzccg;
	private int zzfhi;
	private ast zzfhp;

	static 
	{
		zzfhq = new anr();
	//    0    0:new             #2   <Class anr>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void anr()>
	//    3    7:putstatic       #22  <Field anr zzfhq>
		ash.a(com/google/android/gms/internal/ads/anr, ((ash) (zzfhq)));
	//    4   10:ldc1            #2   <Class anr>
	//    5   12:getstatic       #22  <Field anr zzfhq>
	//    6   15:invokestatic    #26  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
