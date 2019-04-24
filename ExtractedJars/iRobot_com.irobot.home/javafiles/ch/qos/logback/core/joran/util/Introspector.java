// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.util;

import java.lang.reflect.Method;
import java.util.*;

// Referenced classes of package ch.qos.logback.core.joran.util:
//			MethodDescriptor, PropertyDescriptor

public class Introspector
{

	public Introspector()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String decapitalize(String s)
	{
		if(s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          64
		{
			if(s.length() == 0)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #17  <Method int String.length()>
	//*   4    8:ifne            13
				return s;
	//    5   11:aload_0         
	//    6   12:areturn         
			String s1 = s.substring(0, 1).toLowerCase();
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:iconst_1        
	//   10   16:invokevirtual   #21  <Method String String.substring(int, int)>
	//   11   19:invokevirtual   #25  <Method String String.toLowerCase()>
	//   12   22:astore_2        
			Object obj = ((Object) (s1));
	//   13   23:aload_2         
	//   14   24:astore_1        
			if(s.length() > 1)
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #17  <Method int String.length()>
	//*  17   29:iconst_1        
	//*  18   30:icmple          62
			{
				obj = ((Object) (new StringBuilder()));
	//   19   33:new             #27  <Class StringBuilder>
	//   20   36:dup             
	//   21   37:invokespecial   #28  <Method void StringBuilder()>
	//   22   40:astore_1        
				((StringBuilder) (obj)).append(s1);
	//   23   41:aload_1         
	//   24   42:aload_2         
	//   25   43:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   26   46:pop             
				((StringBuilder) (obj)).append(s.substring(1));
	//   27   47:aload_1         
	//   28   48:aload_0         
	//   29   49:iconst_1        
	//   30   50:invokevirtual   #35  <Method String String.substring(int)>
	//   31   53:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   32   56:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   33   57:aload_1         
	//   34   58:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   35   61:astore_1        
			}
			return ((String) (obj));
	//   36   62:aload_1         
	//   37   63:areturn         
		} else
		{
			return s;
	//   38   64:aload_0         
	//   39   65:areturn         
		}
	}

	public static MethodDescriptor[] getMethodDescriptors(Class class1)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #42  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void ArrayList()>
	//    3    7:astore_3        
		class1 = ((Class) (class1.getMethods()));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #49  <Method Method[] Class.getMethods()>
	//    6   12:astore_0        
		int j = class1.length;
	//    7   13:aload_0         
	//    8   14:arraylength     
	//    9   15:istore_2        
		for(int i = 0; i < j; i++)
	//*  10   16:iconst_0        
	//*  11   17:istore_1        
	//*  12   18:iload_1         
	//*  13   19:iload_2         
	//*  14   20:icmpge          54
		{
			Method method = ((Method) (class1[i]));
	//   15   23:aload_0         
	//   16   24:iload_1         
	//   17   25:aaload          
	//   18   26:astore          4
			arraylist.add(((Object) (new MethodDescriptor(method.getName(), method))));
	//   19   28:aload_3         
	//   20   29:new             #51  <Class MethodDescriptor>
	//   21   32:dup             
	//   22   33:aload           4
	//   23   35:invokevirtual   #56  <Method String Method.getName()>
	//   24   38:aload           4
	//   25   40:invokespecial   #59  <Method void MethodDescriptor(String, Method)>
	//   26   43:invokevirtual   #63  <Method boolean ArrayList.add(Object)>
	//   27   46:pop             
		}

	//   28   47:iload_1         
	//   29   48:iconst_1        
	//   30   49:iadd            
	//   31   50:istore_1        
	//*  32   51:goto            18
		return (MethodDescriptor[])arraylist.toArray(((Object []) (new MethodDescriptor[0])));
	//   33   54:aload_3         
	//   34   55:iconst_0        
	//   35   56:anewarray       MethodDescriptor[]
	//   36   59:invokevirtual   #67  <Method Object[] ArrayList.toArray(Object[])>
	//   37   62:checkcast       #69  <Class MethodDescriptor[]>
	//   38   65:areturn         
	}

	public static PropertyDescriptor[] getPropertyDescriptors(Class class1)
	{
		int j = "set".length();
	//    0    0:ldc1            #75  <String "set">
	//    1    2:invokevirtual   #17  <Method int String.length()>
	//    2    5:istore          4
		HashMap hashmap = new HashMap();
	//    3    7:new             #77  <Class HashMap>
	//    4   10:dup             
	//    5   11:invokespecial   #78  <Method void HashMap()>
	//    6   14:astore          7
		Method amethod[] = class1.getMethods();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #49  <Method Method[] Class.getMethods()>
	//    9   20:astore          8
		int k = amethod.length;
	//   10   22:aload           8
	//   11   24:arraylength     
	//   12   25:istore          5
		for(int i = 0; i < k; i++)
	//*  13   27:iconst_0        
	//*  14   28:istore_1        
	//*  15   29:iload_1         
	//*  16   30:iload           5
	//*  17   32:icmpge          238
		{
			Method method = amethod[i];
	//   18   35:aload           8
	//   19   37:iload_1         
	//   20   38:aaload          
	//   21   39:astore          9
			class1 = ((Class) (method.getName()));
	//   22   41:aload           9
	//   23   43:invokevirtual   #56  <Method String Method.getName()>
	//   24   46:astore_0        
			boolean flag;
			if(((String) (class1)).startsWith("get") && ((String) (class1)).length() > j)
	//*  25   47:aload_0         
	//*  26   48:ldc1            #80  <String "get">
	//*  27   50:invokevirtual   #84  <Method boolean String.startsWith(String)>
	//*  28   53:ifeq            70
	//*  29   56:aload_0         
	//*  30   57:invokevirtual   #17  <Method int String.length()>
	//*  31   60:iload           4
	//*  32   62:icmple          70
				flag = true;
	//   33   65:iconst_1        
	//   34   66:istore_2        
			else
	//*  35   67:goto            72
				flag = false;
	//   36   70:iconst_0        
	//   37   71:istore_2        
			boolean flag1;
			if(((String) (class1)).startsWith("set") && ((String) (class1)).length() > j)
	//*  38   72:aload_0         
	//*  39   73:ldc1            #75  <String "set">
	//*  40   75:invokevirtual   #84  <Method boolean String.startsWith(String)>
	//*  41   78:ifeq            95
	//*  42   81:aload_0         
	//*  43   82:invokevirtual   #17  <Method int String.length()>
	//*  44   85:iload           4
	//*  45   87:icmple          95
				flag1 = true;
	//   46   90:iconst_1        
	//   47   91:istore_3        
			else
	//*  48   92:goto            97
				flag1 = false;
	//   49   95:iconst_0        
	//   50   96:istore_3        
			if(!flag && !flag1)
				continue;
	//   51   97:iload_2         
	//   52   98:ifne            105
	//   53  101:iload_3         
	//   54  102:ifeq            231
			String s = decapitalize(((String) (class1)).substring(j));
	//   55  105:aload_0         
	//   56  106:iload           4
	//   57  108:invokevirtual   #35  <Method String String.substring(int)>
	//   58  111:invokestatic    #86  <Method String decapitalize(String)>
	//   59  114:astore          10
			Object obj = ((Object) ((PropertyDescriptor)((Map) (hashmap)).get(((Object) (s)))));
	//   60  116:aload           7
	//   61  118:aload           10
	//   62  120:invokeinterface #91  <Method Object Map.get(Object)>
	//   63  125:checkcast       #93  <Class PropertyDescriptor>
	//   64  128:astore          6
			class1 = ((Class) (obj));
	//   65  130:aload           6
	//   66  132:astore_0        
			if(obj == null)
	//*  67  133:aload           6
	//*  68  135:ifnonnull       159
			{
				class1 = ((Class) (new PropertyDescriptor(s)));
	//   69  138:new             #93  <Class PropertyDescriptor>
	//   70  141:dup             
	//   71  142:aload           10
	//   72  144:invokespecial   #96  <Method void PropertyDescriptor(String)>
	//   73  147:astore_0        
				((Map) (hashmap)).put(((Object) (s)), ((Object) (class1)));
	//   74  148:aload           7
	//   75  150:aload           10
	//   76  152:aload_0         
	//   77  153:invokeinterface #100 <Method Object Map.put(Object, Object)>
	//   78  158:pop             
			}
			obj = ((Object) (method.getParameterTypes()));
	//   79  159:aload           9
	//   80  161:invokevirtual   #104 <Method Class[] Method.getParameterTypes()>
	//   81  164:astore          6
			if(flag1)
	//*  82  166:iload_3         
	//*  83  167:ifeq            198
			{
				if(obj.length != 1)
					continue;
	//   84  170:aload           6
	//   85  172:arraylength     
	//   86  173:iconst_1        
	//   87  174:icmpne          231
				((PropertyDescriptor) (class1)).setWriteMethod(method);
	//   88  177:aload_0         
	//   89  178:aload           9
	//   90  180:invokevirtual   #108 <Method void PropertyDescriptor.setWriteMethod(Method)>
				obj = ((Object) (obj[0]));
	//   91  183:aload           6
	//   92  185:iconst_0        
	//   93  186:aaload          
	//   94  187:astore          6
			} else
	//*  95  189:aload_0         
	//*  96  190:aload           6
	//*  97  192:invokevirtual   #112 <Method void PropertyDescriptor.setPropertyType(Class)>
	//*  98  195:goto            231
			{
				if(!flag || obj.length != 0)
					continue;
	//   99  198:iload_2         
	//  100  199:ifeq            231
	//  101  202:aload           6
	//  102  204:arraylength     
	//  103  205:ifne            231
				((PropertyDescriptor) (class1)).setReadMethod(method);
	//  104  208:aload_0         
	//  105  209:aload           9
	//  106  211:invokevirtual   #115 <Method void PropertyDescriptor.setReadMethod(Method)>
				if(((PropertyDescriptor) (class1)).getPropertyType() != null)
					continue;
	//  107  214:aload_0         
	//  108  215:invokevirtual   #119 <Method Class PropertyDescriptor.getPropertyType()>
	//  109  218:ifnonnull       231
				obj = ((Object) (method.getReturnType()));
	//  110  221:aload           9
	//  111  223:invokevirtual   #122 <Method Class Method.getReturnType()>
	//  112  226:astore          6
			}
			((PropertyDescriptor) (class1)).setPropertyType(((Class) (obj)));
		}

	//  113  228:goto            189
	//  114  231:iload_1         
	//  115  232:iconst_1        
	//  116  233:iadd            
	//  117  234:istore_1        
	//* 118  235:goto            29
		return (PropertyDescriptor[])((Map) (hashmap)).values().toArray(((Object []) (new PropertyDescriptor[0])));
	//  119  238:aload           7
	//  120  240:invokeinterface #126 <Method Collection Map.values()>
	//  121  245:iconst_0        
	//  122  246:anewarray       PropertyDescriptor[]
	//  123  249:invokeinterface #129 <Method Object[] Collection.toArray(Object[])>
	//  124  254:checkcast       #131 <Class PropertyDescriptor[]>
	//  125  257:areturn         
	}
}
