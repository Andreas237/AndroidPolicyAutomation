// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import java.lang.reflect.Array;
import java.util.*;

// Referenced classes of package android.support.v7:
//			ae, bp

public final class aa
{

	public static final Object[] a(Collection collection)
	{
		int i;
		ae.b(((Object) (collection)), "collection");
	//    0    0:aload_0         
	//    1    1:ldc1            #15  <String "collection">
	//    2    3:invokestatic    #21  <Method void ae.b(Object, String)>
		i = collection.size();
	//    3    6:aload_0         
	//    4    7:invokeinterface #27  <Method int Collection.size()>
	//    5   12:istore_1        
		if(i != 0) goto _L2; else goto _L1
	//    6   13:iload_1         
	//    7   14:ifne            25
_L1:
		Object obj = ((Object) (a));
	//    8   17:getstatic       #10  <Field Object[] a>
	//    9   20:astore          4
_L4:
		return ((Object []) (obj));
	//   10   22:aload           4
	//   11   24:areturn         
_L2:
		Iterator iterator;
		iterator = collection.iterator();
	//   12   25:aload_0         
	//   13   26:invokeinterface #31  <Method Iterator Collection.iterator()>
	//   14   31:astore          5
		if(!iterator.hasNext())
	//*  15   33:aload           5
	//*  16   35:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//*  17   40:ifne            47
			return a;
	//   18   43:getstatic       #10  <Field Object[] a>
	//   19   46:areturn         
		collection = ((Collection) (new Object[i]));
	//   20   47:iload_1         
	//   21   48:anewarray       Object[]
	//   22   51:astore_0        
		i = 0;
	//   23   52:iconst_0        
	//   24   53:istore_1        
_L5:
		int j;
		j = i + 1;
	//   25   54:iload_1         
	//   26   55:iconst_1        
	//   27   56:iadd            
	//   28   57:istore_2        
		collection[i] = ((/*<invalid signature>*/java.lang.Object) (iterator.next()));
	//   29   58:aload_0         
	//   30   59:iload_1         
	//   31   60:aload           5
	//   32   62:invokeinterface #41  <Method Object Iterator.next()>
	//   33   67:aastore         
		if(j < collection.length)
			break MISSING_BLOCK_LABEL_139;
	//   34   68:iload_2         
	//   35   69:aload_0         
	//   36   70:arraylength     
	//   37   71:icmplt          139
		obj = ((Object) (collection));
	//   38   74:aload_0         
	//   39   75:astore          4
		if(!iterator.hasNext()) goto _L4; else goto _L3
	//   40   77:aload           5
	//   41   79:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//   42   84:ifeq            22
_L3:
		int k = j * 3 + 1 >>> 1;
	//   43   87:iload_2         
	//   44   88:iconst_3        
	//   45   89:imul            
	//   46   90:iconst_1        
	//   47   91:iadd            
	//   48   92:iconst_1        
	//   49   93:iushr           
	//   50   94:istore_3        
		i = k;
	//   51   95:iload_3         
	//   52   96:istore_1        
		if(k <= j)
	//*  53   97:iload_3         
	//*  54   98:iload_2         
	//*  55   99:icmpgt          122
		{
			if(j >= 0x7ffffffd)
	//*  56  102:iload_2         
	//*  57  103:ldc1            #42  <Int 0x7ffffffd>
	//*  58  105:icmplt          119
				throw (Throwable)new OutOfMemoryError();
	//   59  108:new             #44  <Class OutOfMemoryError>
	//   60  111:dup             
	//   61  112:invokespecial   #47  <Method void OutOfMemoryError()>
	//   62  115:checkcast       #49  <Class Throwable>
	//   63  118:athrow          
			i = 0x7ffffffd;
	//   64  119:ldc1            #42  <Int 0x7ffffffd>
	//   65  121:istore_1        
		}
		collection = ((Collection) (Arrays.copyOf(((Object []) (collection)), i)));
	//   66  122:aload_0         
	//   67  123:iload_1         
	//   68  124:invokestatic    #55  <Method Object[] Arrays.copyOf(Object[], int)>
	//   69  127:astore_0        
		ae.a(((Object) (collection)), "Arrays.copyOf(result, newSize)");
	//   70  128:aload_0         
	//   71  129:ldc1            #57  <String "Arrays.copyOf(result, newSize)">
	//   72  131:invokestatic    #59  <Method void ae.a(Object, String)>
_L6:
		i = j;
	//   73  134:iload_2         
	//   74  135:istore_1        
		  goto _L5
	//*  75  136:goto            54
		if(!iterator.hasNext())
	//*  76  139:aload           5
	//*  77  141:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//*  78  146:ifne            163
		{
			collection = ((Collection) (Arrays.copyOf(((Object []) (collection)), j)));
	//   79  149:aload_0         
	//   80  150:iload_2         
	//   81  151:invokestatic    #55  <Method Object[] Arrays.copyOf(Object[], int)>
	//   82  154:astore_0        
			ae.a(((Object) (collection)), "Arrays.copyOf(result, size)");
	//   83  155:aload_0         
	//   84  156:ldc1            #61  <String "Arrays.copyOf(result, size)">
	//   85  158:invokestatic    #59  <Method void ae.a(Object, String)>
			return ((Object []) (collection));
	//   86  161:aload_0         
	//   87  162:areturn         
		}
		  goto _L6
	//*  88  163:goto            134
	}

	public static final Object[] a(Collection collection, Object aobj[])
	{
		int i;
		int j;
		i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		ae.b(((Object) (collection)), "collection");
	//    2    2:aload_0         
	//    3    3:ldc1            #15  <String "collection">
	//    4    5:invokestatic    #21  <Method void ae.b(Object, String)>
		if(aobj == null)
	//*   5    8:aload_1         
	//*   6    9:ifnonnull       23
			throw (Throwable)new NullPointerException();
	//    7   12:new             #69  <Class NullPointerException>
	//    8   15:dup             
	//    9   16:invokespecial   #70  <Method void NullPointerException()>
	//   10   19:checkcast       #49  <Class Throwable>
	//   11   22:athrow          
		j = collection.size();
	//   12   23:aload_0         
	//   13   24:invokeinterface #27  <Method int Collection.size()>
	//   14   29:istore_3        
		if(j != 0) goto _L2; else goto _L1
	//   15   30:iload_3         
	//   16   31:ifne            45
_L1:
		if(aobj.length > 0)
	//*  17   34:aload_1         
	//*  18   35:arraylength     
	//*  19   36:ifle            43
			aobj[0] = null;
	//   20   39:aload_1         
	//   21   40:iconst_0        
	//   22   41:aconst_null     
	//   23   42:aastore         
_L4:
		return aobj;
	//   24   43:aload_1         
	//   25   44:areturn         
_L2:
		Iterator iterator;
		iterator = collection.iterator();
	//   26   45:aload_0         
	//   27   46:invokeinterface #31  <Method Iterator Collection.iterator()>
	//   28   51:astore          6
		if(iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//   29   53:aload           6
	//   30   55:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//   31   60:ifne            74
		if(aobj.length > 0)
	//*  32   63:aload_1         
	//*  33   64:arraylength     
	//*  34   65:ifle            43
		{
			aobj[0] = null;
	//   35   68:aload_1         
	//   36   69:iconst_0        
	//   37   70:aconst_null     
	//   38   71:aastore         
			return aobj;
	//   39   72:aload_1         
	//   40   73:areturn         
		}
		if(true) goto _L4; else goto _L3
_L3:
		if(j <= aobj.length)
	//*  41   74:iload_3         
	//*  42   75:aload_1         
	//*  43   76:arraylength     
	//*  44   77:icmpgt          114
		{
			collection = ((Collection) (aobj));
	//   45   80:aload_1         
	//   46   81:astore_0        
		} else
	//*  47   82:iload_2         
	//*  48   83:iconst_1        
	//*  49   84:iadd            
	//*  50   85:istore_3        
	//*  51   86:aload_0         
	//*  52   87:iload_2         
	//*  53   88:aload           6
	//*  54   90:invokeinterface #41  <Method Object Iterator.next()>
	//*  55   95:aastore         
	//*  56   96:iload_3         
	//*  57   97:aload_0         
	//*  58   98:arraylength     
	//*  59   99:icmplt          208
	//*  60  102:aload           6
	//*  61  104:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//*  62  109:ifne            148
	//*  63  112:aload_0         
	//*  64  113:areturn         
		{
			collection = ((Collection) (Array.newInstance(((Object) (aobj)).getClass().getComponentType(), j)));
	//   65  114:aload_1         
	//   66  115:invokevirtual   #74  <Method Class Object.getClass()>
	//   67  118:invokevirtual   #79  <Method Class Class.getComponentType()>
	//   68  121:iload_3         
	//   69  122:invokestatic    #85  <Method Object Array.newInstance(Class, int)>
	//   70  125:astore_0        
			if(collection == null)
	//*  71  126:aload_0         
	//*  72  127:ifnonnull       140
				throw new bp("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
	//   73  130:new             #87  <Class bp>
	//   74  133:dup             
	//   75  134:ldc1            #89  <String "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>">
	//   76  136:invokespecial   #92  <Method void bp(String)>
	//   77  139:athrow          
			collection = ((Collection) ((Object[])collection));
	//   78  140:aload_0         
	//   79  141:checkcast       #93  <Class Object[]>
	//   80  144:astore_0        
		}
_L6:
		Object obj;
		j = i + 1;
		collection[i] = ((/*<invalid signature>*/java.lang.Object) (iterator.next()));
		if(j < collection.length)
			break; /* Loop/switch isn't completed */
		if(!iterator.hasNext())
			return ((Object []) (collection));
	//*  81  145:goto            82
		int k = j * 3 + 1 >>> 1;
	//   82  148:iload_3         
	//   83  149:iconst_3        
	//   84  150:imul            
	//   85  151:iconst_1        
	//   86  152:iadd            
	//   87  153:iconst_1        
	//   88  154:iushr           
	//   89  155:istore          4
		i = k;
	//   90  157:iload           4
	//   91  159:istore_2        
		if(k <= j)
	//*  92  160:iload           4
	//*  93  162:iload_3         
	//*  94  163:icmpgt          186
		{
			if(j >= 0x7ffffffd)
	//*  95  166:iload_3         
	//*  96  167:ldc1            #42  <Int 0x7ffffffd>
	//*  97  169:icmplt          183
				throw (Throwable)new OutOfMemoryError();
	//   98  172:new             #44  <Class OutOfMemoryError>
	//   99  175:dup             
	//  100  176:invokespecial   #47  <Method void OutOfMemoryError()>
	//  101  179:checkcast       #49  <Class Throwable>
	//  102  182:athrow          
			i = 0x7ffffffd;
	//  103  183:ldc1            #42  <Int 0x7ffffffd>
	//  104  185:istore_2        
		}
		obj = ((Object) (Arrays.copyOf(((Object []) (collection)), i)));
	//  105  186:aload_0         
	//  106  187:iload_2         
	//  107  188:invokestatic    #55  <Method Object[] Arrays.copyOf(Object[], int)>
	//  108  191:astore          5
		ae.a(obj, "Arrays.copyOf(result, newSize)");
	//  109  193:aload           5
	//  110  195:ldc1            #57  <String "Arrays.copyOf(result, newSize)">
	//  111  197:invokestatic    #59  <Method void ae.a(Object, String)>
_L7:
		i = j;
	//  112  200:iload_3         
	//  113  201:istore_2        
		collection = ((Collection) (obj));
	//  114  202:aload           5
	//  115  204:astore_0        
		if(true) goto _L6; else goto _L5
	//  116  205:goto            82
_L5:
		obj = ((Object) (collection));
	//  117  208:aload_0         
	//  118  209:astore          5
		if(!iterator.hasNext())
	//* 119  211:aload           6
	//* 120  213:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//* 121  218:ifne            200
			if(collection == aobj)
	//* 122  221:aload_0         
	//* 123  222:aload_1         
	//* 124  223:if_acmpne       232
			{
				aobj[j] = null;
	//  125  226:aload_1         
	//  126  227:iload_3         
	//  127  228:aconst_null     
	//  128  229:aastore         
				return aobj;
	//  129  230:aload_1         
	//  130  231:areturn         
			} else
			{
				collection = ((Collection) (Arrays.copyOf(((Object []) (collection)), j)));
	//  131  232:aload_0         
	//  132  233:iload_3         
	//  133  234:invokestatic    #55  <Method Object[] Arrays.copyOf(Object[], int)>
	//  134  237:astore_0        
				ae.a(((Object) (collection)), "Arrays.copyOf(result, size)");
	//  135  238:aload_0         
	//  136  239:ldc1            #61  <String "Arrays.copyOf(result, size)">
	//  137  241:invokestatic    #59  <Method void ae.a(Object, String)>
				return ((Object []) (collection));
	//  138  244:aload_0         
	//  139  245:areturn         
			}
		  goto _L7
		if(true) goto _L6; else goto _L8
_L8:
	}

	private static final Object a[] = new Object[0];

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       Object[]
	//    2    4:putstatic       #10  <Field Object[] a>
	//*   3    7:return          
	}
}
