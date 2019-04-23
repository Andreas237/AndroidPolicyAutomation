// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import java.lang.reflect.Array;
import java.util.*;

// Referenced classes of package androidx.work:
//			InputMerger, Data

public final class ArrayCreatingInputMerger extends InputMerger
{

	public ArrayCreatingInputMerger()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void InputMerger()>
	//    2    4:return          
	}

	private Object concatenateArrayAndNonArray(Object obj, Object obj1)
	{
		int i = Array.getLength(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #17  <Method int Array.getLength(Object)>
	//    2    4:istore_3        
		Object obj2 = Array.newInstance(obj1.getClass(), i + 1);
	//    3    5:aload_2         
	//    4    6:invokevirtual   #23  <Method Class Object.getClass()>
	//    5    9:iload_3         
	//    6   10:iconst_1        
	//    7   11:iadd            
	//    8   12:invokestatic    #27  <Method Object Array.newInstance(Class, int)>
	//    9   15:astore          4
		System.arraycopy(obj, 0, obj2, 0, i);
	//   10   17:aload_1         
	//   11   18:iconst_0        
	//   12   19:aload           4
	//   13   21:iconst_0        
	//   14   22:iload_3         
	//   15   23:invokestatic    #33  <Method void System.arraycopy(Object, int, Object, int, int)>
		Array.set(obj2, i, obj1);
	//   16   26:aload           4
	//   17   28:iload_3         
	//   18   29:aload_2         
	//   19   30:invokestatic    #37  <Method void Array.set(Object, int, Object)>
		return obj2;
	//   20   33:aload           4
	//   21   35:areturn         
	}

	private Object concatenateArrays(Object obj, Object obj1)
	{
		int i = Array.getLength(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #17  <Method int Array.getLength(Object)>
	//    2    4:istore_3        
		int j = Array.getLength(obj1);
	//    3    5:aload_2         
	//    4    6:invokestatic    #17  <Method int Array.getLength(Object)>
	//    5    9:istore          4
		Object obj2 = Array.newInstance(obj.getClass().getComponentType(), i + j);
	//    6   11:aload_1         
	//    7   12:invokevirtual   #23  <Method Class Object.getClass()>
	//    8   15:invokevirtual   #43  <Method Class Class.getComponentType()>
	//    9   18:iload_3         
	//   10   19:iload           4
	//   11   21:iadd            
	//   12   22:invokestatic    #27  <Method Object Array.newInstance(Class, int)>
	//   13   25:astore          5
		System.arraycopy(obj, 0, obj2, 0, i);
	//   14   27:aload_1         
	//   15   28:iconst_0        
	//   16   29:aload           5
	//   17   31:iconst_0        
	//   18   32:iload_3         
	//   19   33:invokestatic    #33  <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(obj1, 0, obj2, i, j);
	//   20   36:aload_2         
	//   21   37:iconst_0        
	//   22   38:aload           5
	//   23   40:iload_3         
	//   24   41:iload           4
	//   25   43:invokestatic    #33  <Method void System.arraycopy(Object, int, Object, int, int)>
		return obj2;
	//   26   46:aload           5
	//   27   48:areturn         
	}

	private Object concatenateNonArrays(Object obj, Object obj1)
	{
		Object obj2 = Array.newInstance(obj.getClass(), 2);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #23  <Method Class Object.getClass()>
	//    2    4:iconst_2        
	//    3    5:invokestatic    #27  <Method Object Array.newInstance(Class, int)>
	//    4    8:astore_3        
		Array.set(obj2, 0, obj);
	//    5    9:aload_3         
	//    6   10:iconst_0        
	//    7   11:aload_1         
	//    8   12:invokestatic    #37  <Method void Array.set(Object, int, Object)>
		Array.set(obj2, 1, obj1);
	//    9   15:aload_3         
	//   10   16:iconst_1        
	//   11   17:aload_2         
	//   12   18:invokestatic    #37  <Method void Array.set(Object, int, Object)>
		return obj2;
	//   13   21:aload_3         
	//   14   22:areturn         
	}

	private Object createArrayFor(Object obj)
	{
		Object obj1 = Array.newInstance(obj.getClass(), 1);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #23  <Method Class Object.getClass()>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #27  <Method Object Array.newInstance(Class, int)>
	//    4    8:astore_2        
		Array.set(obj1, 0, obj);
	//    5    9:aload_2         
	//    6   10:iconst_0        
	//    7   11:aload_1         
	//    8   12:invokestatic    #37  <Method void Array.set(Object, int, Object)>
		return obj1;
	//    9   15:aload_2         
	//   10   16:areturn         
	}

	public Data merge(List list)
	{
		Data.Builder builder;
		HashMap hashmap;
		builder = new Data.Builder();
	//    0    0:new             #51  <Class Data$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #52  <Method void Data$Builder()>
	//    3    7:astore_2        
		hashmap = new HashMap();
	//    4    8:new             #54  <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #55  <Method void HashMap()>
	//    7   15:astore_3        
		Iterator iterator = list.iterator();
	//    8   16:aload_1         
	//    9   17:invokeinterface #61  <Method Iterator List.iterator()>
	//   10   22:astore          4
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_268;
	//   11   24:aload           4
	//   12   26:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   13   31:ifeq            268
			Iterator iterator1 = ((Data)iterator.next()).getKeyValueMap().entrySet().iterator();
	//   14   34:aload           4
	//   15   36:invokeinterface #71  <Method Object Iterator.next()>
	//   16   41:checkcast       #73  <Class Data>
	//   17   44:invokevirtual   #77  <Method Map Data.getKeyValueMap()>
	//   18   47:invokeinterface #83  <Method Set Map.entrySet()>
	//   19   52:invokeinterface #86  <Method Iterator Set.iterator()>
	//   20   57:astore          5
			while(iterator1.hasNext()) 
	//*  21   59:aload           5
	//*  22   61:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//*  23   66:ifeq            24
			{
label0:
				{
					list = ((List) ((java.util.Map.Entry)iterator1.next()));
	//   24   69:aload           5
	//   25   71:invokeinterface #71  <Method Object Iterator.next()>
	//   26   76:checkcast       #88  <Class java.util.Map$Entry>
	//   27   79:astore_1        
					String s = (String)((java.util.Map.Entry) (list)).getKey();
	//   28   80:aload_1         
	//   29   81:invokeinterface #91  <Method Object java.util.Map$Entry.getKey()>
	//   30   86:checkcast       #93  <Class String>
	//   31   89:astore          6
					list = ((List) (((java.util.Map.Entry) (list)).getValue()));
	//   32   91:aload_1         
	//   33   92:invokeinterface #96  <Method Object java.util.Map$Entry.getValue()>
	//   34   97:astore_1        
					Class class1 = ((Object) (list)).getClass();
	//   35   98:aload_1         
	//   36   99:invokevirtual   #23  <Method Class Object.getClass()>
	//   37  102:astore          7
					Object obj = ((Map) (hashmap)).get(((Object) (s)));
	//   38  104:aload_3         
	//   39  105:aload           6
	//   40  107:invokeinterface #99  <Method Object Map.get(Object)>
	//   41  112:astore          8
					if(obj == null)
	//*  42  114:aload           8
	//*  43  116:ifnonnull       139
					{
						if(!class1.isArray())
	//*  44  119:aload           7
	//*  45  121:invokevirtual   #102 <Method boolean Class.isArray()>
	//*  46  124:ifeq            130
	//*  47  127:goto            247
							list = ((List) (createArrayFor(((Object) (list)))));
	//   48  130:aload_0         
	//   49  131:aload_1         
	//   50  132:invokespecial   #104 <Method Object createArrayFor(Object)>
	//   51  135:astore_1        
					} else
	//*  52  136:goto            247
					{
						Class class2 = obj.getClass();
	//   53  139:aload           8
	//   54  141:invokevirtual   #23  <Method Class Object.getClass()>
	//   55  144:astore          9
						if(((Object) (class2)).equals(((Object) (class1))))
	//*  56  146:aload           9
	//*  57  148:aload           7
	//*  58  150:invokevirtual   #108 <Method boolean Object.equals(Object)>
	//*  59  153:ifeq            186
						{
							if(class2.isArray())
	//*  60  156:aload           9
	//*  61  158:invokevirtual   #102 <Method boolean Class.isArray()>
	//*  62  161:ifeq            175
								list = ((List) (concatenateArrays(obj, ((Object) (list)))));
	//   63  164:aload_0         
	//   64  165:aload           8
	//   65  167:aload_1         
	//   66  168:invokespecial   #110 <Method Object concatenateArrays(Object, Object)>
	//   67  171:astore_1        
							else
	//*  68  172:goto            247
								list = ((List) (concatenateNonArrays(obj, ((Object) (list)))));
	//   69  175:aload_0         
	//   70  176:aload           8
	//   71  178:aload_1         
	//   72  179:invokespecial   #112 <Method Object concatenateNonArrays(Object, Object)>
	//   73  182:astore_1        
						} else
	//*  74  183:goto            247
						if(class2.isArray() && ((Object) (class2.getComponentType())).equals(((Object) (class1))))
	//*  75  186:aload           9
	//*  76  188:invokevirtual   #102 <Method boolean Class.isArray()>
	//*  77  191:ifeq            218
	//*  78  194:aload           9
	//*  79  196:invokevirtual   #43  <Method Class Class.getComponentType()>
	//*  80  199:aload           7
	//*  81  201:invokevirtual   #108 <Method boolean Object.equals(Object)>
	//*  82  204:ifeq            218
						{
							list = ((List) (concatenateArrayAndNonArray(obj, ((Object) (list)))));
	//   83  207:aload_0         
	//   84  208:aload           8
	//   85  210:aload_1         
	//   86  211:invokespecial   #114 <Method Object concatenateArrayAndNonArray(Object, Object)>
	//   87  214:astore_1        
						} else
	//*  88  215:goto            247
						{
							if(!class1.isArray() || !((Object) (class1.getComponentType())).equals(((Object) (class2))))
								break label0;
	//   89  218:aload           7
	//   90  220:invokevirtual   #102 <Method boolean Class.isArray()>
	//   91  223:ifeq            260
	//   92  226:aload           7
	//   93  228:invokevirtual   #43  <Method Class Class.getComponentType()>
	//   94  231:aload           9
	//   95  233:invokevirtual   #108 <Method boolean Object.equals(Object)>
	//   96  236:ifeq            260
							list = ((List) (concatenateArrayAndNonArray(((Object) (list)), obj)));
	//   97  239:aload_0         
	//   98  240:aload_1         
	//   99  241:aload           8
	//  100  243:invokespecial   #114 <Method Object concatenateArrayAndNonArray(Object, Object)>
	//  101  246:astore_1        
						}
					}
					((Map) (hashmap)).put(((Object) (s)), ((Object) (list)));
	//  102  247:aload_3         
	//  103  248:aload           6
	//  104  250:aload_1         
	//  105  251:invokeinterface #117 <Method Object Map.put(Object, Object)>
	//  106  256:pop             
				}
			}
		} while(true);
	//  107  257:goto            59
		throw new IllegalArgumentException();
	//  108  260:new             #119 <Class IllegalArgumentException>
	//  109  263:dup             
	//  110  264:invokespecial   #120 <Method void IllegalArgumentException()>
	//  111  267:athrow          
		builder.putAll(((Map) (hashmap)));
	//  112  268:aload_2         
	//  113  269:aload_3         
	//  114  270:invokevirtual   #124 <Method Data$Builder Data$Builder.putAll(Map)>
	//  115  273:pop             
		return builder.build();
	//  116  274:aload_2         
	//  117  275:invokevirtual   #128 <Method Data Data$Builder.build()>
	//  118  278:areturn         
	}
}
