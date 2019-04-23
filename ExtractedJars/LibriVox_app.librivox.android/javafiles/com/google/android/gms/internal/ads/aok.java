// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, ast, asm, 
//			asi, aol, aom, asj, 
//			anj, aug

public final class aok extends ash
	implements atx
{

	private aok()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void ash()>
		zzfii = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #31  <String "">
	//    4    7:putfield        #33  <Field String zzfii>
		zzfij = n();
	//    5   10:aload_0         
	//    6   11:invokestatic    #37  <Method ast n()>
	//    7   14:putfield        #39  <Field ast zzfij>
	//    8   17:return          
	}

	private final void a(anj anj1)
	{
		if(anj1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          65
		{
			if(!zzfij.a())
	//*   2    4:aload_0         
	//*   3    5:getfield        #39  <Field ast zzfij>
	//*   4    8:invokeinterface #45  <Method boolean ast.a()>
	//*   5   13:ifne            53
			{
				ast ast1 = zzfij;
	//    6   16:aload_0         
	//    7   17:getfield        #39  <Field ast zzfij>
	//    8   20:astore_3        
				int i = ast1.size();
	//    9   21:aload_3         
	//   10   22:invokeinterface #49  <Method int ast.size()>
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
				zzfij = ast1.a(i);
	//   21   42:aload_0         
	//   22   43:aload_3         
	//   23   44:iload_2         
	//   24   45:invokeinterface #52  <Method ast ast.a(int)>
	//   25   50:putfield        #39  <Field ast zzfij>
			}
			zzfij.add(((Object) (anj1)));
	//   26   53:aload_0         
	//   27   54:getfield        #39  <Field ast zzfij>
	//   28   57:aload_1         
	//   29   58:invokeinterface #56  <Method boolean ast.add(Object)>
	//   30   63:pop             
			return;
	//   31   64:return          
		} else
		{
			throw new NullPointerException();
	//   32   65:new             #58  <Class NullPointerException>
	//   33   68:dup             
	//   34   69:invokespecial   #59  <Method void NullPointerException()>
	//   35   72:athrow          
		}
	}

	static void a(aok aok1, anj anj1)
	{
		aok1.a(anj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #62  <Method void a(anj)>
	//    3    5:return          
	}

	static void a(aok aok1, String s)
	{
		aok1.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #66  <Method void a(String)>
	//    3    5:return          
	}

	private final void a(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
		{
			zzfii = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field String zzfii>
			return;
	//    5    9:return          
		} else
		{
			throw new NullPointerException();
	//    6   10:new             #58  <Class NullPointerException>
	//    7   13:dup             
	//    8   14:invokespecial   #59  <Method void NullPointerException()>
	//    9   17:athrow          
		}
	}

	public static aol b()
	{
		return (aol)(asi)((ash) (zzfik)).a(asm.e, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #23  <Field aok zzfik>
	//    1    3:getstatic       #73  <Field int asm.e>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #76  <Method Object ash.a(int, Object, Object)>
	//    5   11:checkcast       #78  <Class asi>
	//    6   14:checkcast       #80  <Class aol>
	//    7   17:areturn         
	}

	static aok c()
	{
		return zzfik;
	//    0    0:getstatic       #23  <Field aok zzfik>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		aom.a[i - 1];
	//    0    0:getstatic       #87  <Field int[] aom.a>
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
	//    6   48:new             #89  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #90  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #96  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #98  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/aok;
	//   19   71:ldc1            #2   <Class aok>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #98  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzfik)))));
	//   27   84:new             #100 <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #23  <Field aok zzfik>
	//   30   91:invokespecial   #103 <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #98  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/aok;
	//   34   99:ldc1            #2   <Class aok>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/aok;
	//   39  105:ldc1            #2   <Class aok>
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
		return ((Object) (zzfik));
	//   45  112:getstatic       #23  <Field aok zzfik>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzfik)), "\000\002\000\001\001\002\002\000\001\000\001\u0208\002\033", new Object[] {
			"zzccg", "zzfii", "zzfij", com/google/android/gms/internal/ads/anj
		});
	//   47  116:getstatic       #23  <Field aok zzfik>
	//   48  119:ldc1            #105 <String "\000\002\000\001\001\002\002\000\001\000\001\u0208\002\033">
	//   49  121:iconst_4        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #108 <String "zzccg">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #109 <String "zzfii">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #110 <String "zzfij">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #112 <Class anj>
	//   66  144:aastore         
	//   67  145:invokestatic    #115 <Method Object a(atv, String, Object[])>
	//   68  148:areturn         
_L3:
		return ((Object) (new aol(((aom) (null)))));
	//   69  149:new             #80  <Class aol>
	//   70  152:dup             
	//   71  153:aconst_null     
	//   72  154:invokespecial   #118 <Method void aol(aom)>
	//   73  157:areturn         
_L2:
		return ((Object) (new aok()));
	//   74  158:new             #2   <Class aok>
	//   75  161:dup             
	//   76  162:invokespecial   #21  <Method void aok()>
	//   77  165:areturn         
	}

	public final List a()
	{
		return ((List) (zzfij));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ast zzfij>
	//    2    4:areturn         
	}

	private static volatile aug zzcas;
	private static final aok zzfik;
	private int zzccg;
	private String zzfii;
	private ast zzfij;

	static 
	{
		zzfik = new aok();
	//    0    0:new             #2   <Class aok>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void aok()>
	//    3    7:putstatic       #23  <Field aok zzfik>
		ash.a(com/google/android/gms/internal/ads/aok, ((ash) (zzfik)));
	//    4   10:ldc1            #2   <Class aok>
	//    5   12:getstatic       #23  <Field aok zzfik>
	//    6   15:invokestatic    #27  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
