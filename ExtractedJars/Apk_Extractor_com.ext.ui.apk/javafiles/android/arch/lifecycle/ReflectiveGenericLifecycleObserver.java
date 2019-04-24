// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

// Referenced classes of package android.arch.lifecycle:
//			a, f, c

class ReflectiveGenericLifecycleObserver
	implements android.arch.lifecycle.a
{
	static class a
	{

		final Map a = new HashMap();
		final Map b;

		a(Map map)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			b = map;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field Map b>
		//    5    9:aload_0         
		//    6   10:new             #20  <Class HashMap>
		//    7   13:dup             
		//    8   14:invokespecial   #21  <Method void HashMap()>
		//    9   17:putfield        #23  <Field Map a>
			java.util.Map.Entry entry;
			for(Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); ((List) (map)).add(entry.getKey()))
		//*  10   20:aload_1         
		//*  11   21:invokeinterface #29  <Method Set Map.entrySet()>
		//*  12   26:invokeinterface #35  <Method Iterator Set.iterator()>
		//*  13   31:astore_3        
		//*  14   32:aload_3         
		//*  15   33:invokeinterface #41  <Method boolean Iterator.hasNext()>
		//*  16   38:ifeq            123
			{
				entry = (java.util.Map.Entry)iterator.next();
		//   17   41:aload_3         
		//   18   42:invokeinterface #45  <Method Object Iterator.next()>
		//   19   47:checkcast       #47  <Class java.util.Map$Entry>
		//   20   50:astore          4
				b.a a1 = (b.a)entry.getValue();
		//   21   52:aload           4
		//   22   54:invokeinterface #50  <Method Object java.util.Map$Entry.getValue()>
		//   23   59:checkcast       #52  <Class b$a>
		//   24   62:astore          5
				List list = (List)a.get(((Object) (a1)));
		//   25   64:aload_0         
		//   26   65:getfield        #23  <Field Map a>
		//   27   68:aload           5
		//   28   70:invokeinterface #56  <Method Object Map.get(Object)>
		//   29   75:checkcast       #58  <Class List>
		//   30   78:astore_2        
				map = ((Map) (list));
		//   31   79:aload_2         
		//   32   80:astore_1        
				if(list == null)
		//*  33   81:aload_2         
		//*  34   82:ifnonnull       106
				{
					map = ((Map) (new ArrayList()));
		//   35   85:new             #60  <Class ArrayList>
		//   36   88:dup             
		//   37   89:invokespecial   #61  <Method void ArrayList()>
		//   38   92:astore_1        
					a.put(((Object) (a1)), ((Object) (map)));
		//   39   93:aload_0         
		//   40   94:getfield        #23  <Field Map a>
		//   41   97:aload           5
		//   42   99:aload_1         
		//   43  100:invokeinterface #65  <Method Object Map.put(Object, Object)>
		//   44  105:pop             
				}
			}

		//   45  106:aload_1         
		//   46  107:aload           4
		//   47  109:invokeinterface #68  <Method Object java.util.Map$Entry.getKey()>
		//   48  114:invokeinterface #72  <Method boolean List.add(Object)>
		//   49  119:pop             
		//*  50  120:goto            32
		//   51  123:return          
		}
	}

	static class b
	{

		public boolean equals(Object obj)
		{
			if(this != obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
		//*   3    5:iconst_1        
		//*   4    6:ireturn         
			{
				if(obj == null || ((Object)this).getClass() != obj.getClass())
		//*   5    7:aload_1         
		//*   6    8:ifnull          22
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #32  <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #32  <Method Class Object.getClass()>
		//*  11   19:if_acmpeq       24
					return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
				obj = ((Object) ((b)obj));
		//   14   24:aload_1         
		//   15   25:checkcast       #2   <Class ReflectiveGenericLifecycleObserver$b>
		//   16   28:astore_1        
				if(a != ((b) (obj)).a || !b.getName().equals(((Object) (((b) (obj)).b.getName()))))
		//*  17   29:aload_0         
		//*  18   30:getfield        #17  <Field int a>
		//*  19   33:aload_1         
		//*  20   34:getfield        #17  <Field int a>
		//*  21   37:icmpne          60
		//*  22   40:aload_0         
		//*  23   41:getfield        #19  <Field Method b>
		//*  24   44:invokevirtual   #36  <Method String Method.getName()>
		//*  25   47:aload_1         
		//*  26   48:getfield        #19  <Field Method b>
		//*  27   51:invokevirtual   #36  <Method String Method.getName()>
		//*  28   54:invokevirtual   #40  <Method boolean String.equals(Object)>
		//*  29   57:ifne            5
					return false;
		//   30   60:iconst_0        
		//   31   61:ireturn         
			}
			return true;
		}

		public int hashCode()
		{
			return a * 31 + b.getName().hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field int a>
		//    2    4:bipush          31
		//    3    6:imul            
		//    4    7:aload_0         
		//    5    8:getfield        #19  <Field Method b>
		//    6   11:invokevirtual   #36  <Method String Method.getName()>
		//    7   14:invokevirtual   #44  <Method int String.hashCode()>
		//    8   17:iadd            
		//    9   18:ireturn         
		}

		final int a;
		final Method b;

		b(int i, Method method)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			a = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #17  <Field int a>
			b = method;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #19  <Field Method b>
			b.setAccessible(true);
		//    8   14:aload_0         
		//    9   15:getfield        #19  <Field Method b>
		//   10   18:iconst_1        
		//   11   19:invokevirtual   #25  <Method void Method.setAccessible(boolean)>
		//   12   22:return          
		}
	}


	ReflectiveGenericLifecycleObserver(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		b = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field Object b>
		c = a(b.getClass());
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #31  <Field Object b>
	//    8   14:invokevirtual   #35  <Method Class Object.getClass()>
	//    9   17:invokestatic    #38  <Method ReflectiveGenericLifecycleObserver$a a(Class)>
	//   10   20:putfield        #40  <Field ReflectiveGenericLifecycleObserver$a c>
	//   11   23:return          
	}

	private static a a(Class class1)
	{
		a a1 = (a)a.get(((Object) (class1)));
	//    0    0:getstatic       #26  <Field Map a>
	//    1    3:aload_0         
	//    2    4:invokeinterface #46  <Method Object Map.get(Object)>
	//    3    9:checkcast       #8   <Class ReflectiveGenericLifecycleObserver$a>
	//    4   12:astore_1        
		if(a1 != null)
	//*   5   13:aload_1         
	//*   6   14:ifnull          19
			return a1;
	//    7   17:aload_1         
	//    8   18:areturn         
		else
			return b(class1);
	//    9   19:aload_0         
	//   10   20:invokestatic    #48  <Method ReflectiveGenericLifecycleObserver$a b(Class)>
	//   11   23:areturn         
	}

	private void a(a a1, c c1, b.a a2)
	{
		a((List)a1.a.get(((Object) (a2))), c1, a2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #50  <Field Map ReflectiveGenericLifecycleObserver$a.a>
	//    3    5:aload_3         
	//    4    6:invokeinterface #46  <Method Object Map.get(Object)>
	//    5   11:checkcast       #52  <Class List>
	//    6   14:aload_2         
	//    7   15:aload_3         
	//    8   16:invokespecial   #55  <Method void a(List, c, b$a)>
		a((List)a1.a.get(((Object) (b.a.ON_ANY))), c1, a2);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:getfield        #50  <Field Map ReflectiveGenericLifecycleObserver$a.a>
	//   12   24:getstatic       #61  <Field b$a b$a.ON_ANY>
	//   13   27:invokeinterface #46  <Method Object Map.get(Object)>
	//   14   32:checkcast       #52  <Class List>
	//   15   35:aload_2         
	//   16   36:aload_3         
	//   17   37:invokespecial   #55  <Method void a(List, c, b$a)>
	//   18   40:return          
	}

	private void a(b b1, c c1, b.a a1)
	{
		b1.a;
	//    0    0:aload_1         
	//    1    1:getfield        #69  <Field int ReflectiveGenericLifecycleObserver$b.a>
		JVM INSTR tableswitch 0 2: default 120
	//	               0 32
	//	               1 64
	//	               2 95;
	//    2    4:tableswitch     0 2: default 120
	//	               0 32
	//	               1 64
	//	               2 95
		   goto _L1 _L2 _L3 _L4
_L2:
		b1.b.invoke(b, new Object[0]);
	//    3   32:aload_1         
	//    4   33:getfield        #72  <Field Method ReflectiveGenericLifecycleObserver$b.b>
	//    5   36:aload_0         
	//    6   37:getfield        #31  <Field Object b>
	//    7   40:iconst_0        
	//    8   41:anewarray       Object[]
	//    9   44:invokevirtual   #78  <Method Object Method.invoke(Object, Object[])>
	//   10   47:pop             
		return;
	//   11   48:return          
	//*  12   49:astore_1        
	//*  13   50:new             #80  <Class RuntimeException>
	//*  14   53:dup             
	//*  15   54:ldc1            #82  <String "Failed to call observer method">
	//*  16   56:aload_1         
	//*  17   57:invokevirtual   #86  <Method Throwable InvocationTargetException.getCause()>
	//*  18   60:invokespecial   #89  <Method void RuntimeException(String, Throwable)>
	//*  19   63:athrow          
_L3:
		try
		{
			b1.b.invoke(b, new Object[] {
				c1
			});
	//   20   64:aload_1         
	//   21   65:getfield        #72  <Field Method ReflectiveGenericLifecycleObserver$b.b>
	//   22   68:aload_0         
	//   23   69:getfield        #31  <Field Object b>
	//   24   72:iconst_1        
	//   25   73:anewarray       Object[]
	//   26   76:dup             
	//   27   77:iconst_0        
	//   28   78:aload_2         
	//   29   79:aastore         
	//   30   80:invokevirtual   #78  <Method Object Method.invoke(Object, Object[])>
	//   31   83:pop             
			return;
	//   32   84:return          
		}
		// Misplaced declaration of an exception variable
		catch(b b1)
		{
			throw new RuntimeException("Failed to call observer method", ((InvocationTargetException) (b1)).getCause());
		}
		// Misplaced declaration of an exception variable
		catch(b b1)
	//*  33   85:astore_1        
		{
			throw new RuntimeException(((Throwable) (b1)));
	//   34   86:new             #80  <Class RuntimeException>
	//   35   89:dup             
	//   36   90:aload_1         
	//   37   91:invokespecial   #92  <Method void RuntimeException(Throwable)>
	//   38   94:athrow          
		}
_L4:
		b1.b.invoke(b, new Object[] {
			c1, a1
		});
	//   39   95:aload_1         
	//   40   96:getfield        #72  <Field Method ReflectiveGenericLifecycleObserver$b.b>
	//   41   99:aload_0         
	//   42  100:getfield        #31  <Field Object b>
	//   43  103:iconst_2        
	//   44  104:anewarray       Object[]
	//   45  107:dup             
	//   46  108:iconst_0        
	//   47  109:aload_2         
	//   48  110:aastore         
	//   49  111:dup             
	//   50  112:iconst_1        
	//   51  113:aload_3         
	//   52  114:aastore         
	//   53  115:invokevirtual   #78  <Method Object Method.invoke(Object, Object[])>
	//   54  118:pop             
		return;
	//   55  119:return          
_L1:
	//   56  120:return          
	}

	private void a(List list, c c1, b.a a1)
	{
		if(list != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          45
		{
			for(int i = list.size() - 1; i >= 0; i--)
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #96  <Method int List.size()>
	//*   4   10:iconst_1        
	//*   5   11:isub            
	//*   6   12:istore          4
	//*   7   14:iload           4
	//*   8   16:iflt            45
				a((b)list.get(i), c1, a1);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:iload           4
	//   12   23:invokeinterface #99  <Method Object List.get(int)>
	//   13   28:checkcast       #11  <Class ReflectiveGenericLifecycleObserver$b>
	//   14   31:aload_2         
	//   15   32:aload_3         
	//   16   33:invokespecial   #101 <Method void a(ReflectiveGenericLifecycleObserver$b, c, b$a)>

	//   17   36:iload           4
	//   18   38:iconst_1        
	//   19   39:isub            
	//   20   40:istore          4
		}
	//*  21   42:goto            14
	//   22   45:return          
	}

	private static void a(Map map, b b1, b.a a1, Class class1)
	{
		b.a a2 = (b.a)map.get(((Object) (b1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #46  <Method Object Map.get(Object)>
	//    3    7:checkcast       #57  <Class b$a>
	//    4   10:astore          4
		if(a2 != null && a1 != a2)
	//*   5   12:aload           4
	//*   6   14:ifnull          94
	//*   7   17:aload_2         
	//*   8   18:aload           4
	//*   9   20:if_acmpeq       94
		{
			map = ((Map) (b1.b));
	//   10   23:aload_1         
	//   11   24:getfield        #72  <Field Method ReflectiveGenericLifecycleObserver$b.b>
	//   12   27:astore_0        
			throw new IllegalArgumentException((new StringBuilder()).append("Method ").append(((Method) (map)).getName()).append(" in ").append(class1.getName()).append(" already declared with different @OnLifecycleEvent value: previous").append(" value ").append(((Object) (a2))).append(", new value ").append(((Object) (a1))).toString());
	//   13   28:new             #106 <Class IllegalArgumentException>
	//   14   31:dup             
	//   15   32:new             #108 <Class StringBuilder>
	//   16   35:dup             
	//   17   36:invokespecial   #109 <Method void StringBuilder()>
	//   18   39:ldc1            #111 <String "Method ">
	//   19   41:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   20   44:aload_0         
	//   21   45:invokevirtual   #119 <Method String Method.getName()>
	//   22   48:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   23   51:ldc1            #121 <String " in ">
	//   24   53:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   25   56:aload_3         
	//   26   57:invokevirtual   #124 <Method String Class.getName()>
	//   27   60:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   28   63:ldc1            #126 <String " already declared with different @OnLifecycleEvent value: previous">
	//   29   65:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   30   68:ldc1            #128 <String " value ">
	//   31   70:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   32   73:aload           4
	//   33   75:invokevirtual   #131 <Method StringBuilder StringBuilder.append(Object)>
	//   34   78:ldc1            #133 <String ", new value ">
	//   35   80:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   36   83:aload_2         
	//   37   84:invokevirtual   #131 <Method StringBuilder StringBuilder.append(Object)>
	//   38   87:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   39   90:invokespecial   #139 <Method void IllegalArgumentException(String)>
	//   40   93:athrow          
		}
		if(a2 == null)
	//*  41   94:aload           4
	//*  42   96:ifnonnull       108
			map.put(((Object) (b1)), ((Object) (a1)));
	//   43   99:aload_0         
	//   44  100:aload_1         
	//   45  101:aload_2         
	//   46  102:invokeinterface #143 <Method Object Map.put(Object, Object)>
	//   47  107:pop             
	//   48  108:return          
	}

	private static a b(Class class1)
	{
		Object obj1 = ((Object) (class1.getSuperclass()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #147 <Method Class Class.getSuperclass()>
	//    2    4:astore          5
		Object obj = ((Object) (new HashMap()));
	//    3    6:new             #21  <Class HashMap>
	//    4    9:dup             
	//    5   10:invokespecial   #24  <Method void HashMap()>
	//    6   13:astore          4
		if(obj1 != null)
	//*   7   15:aload           5
	//*   8   17:ifnull          44
		{
			obj1 = ((Object) (a(((Class) (obj1)))));
	//    9   20:aload           5
	//   10   22:invokestatic    #38  <Method ReflectiveGenericLifecycleObserver$a a(Class)>
	//   11   25:astore          5
			if(obj1 != null)
	//*  12   27:aload           5
	//*  13   29:ifnull          44
				((Map) (obj)).putAll(((a) (obj1)).b);
	//   14   32:aload           4
	//   15   34:aload           5
	//   16   36:getfield        #149 <Field Map ReflectiveGenericLifecycleObserver$a.b>
	//   17   39:invokeinterface #153 <Method void Map.putAll(Map)>
		}
		Method amethod[] = class1.getDeclaredMethods();
	//   18   44:aload_0         
	//   19   45:invokevirtual   #157 <Method Method[] Class.getDeclaredMethods()>
	//   20   48:astore          5
		Class aclass[] = class1.getInterfaces();
	//   21   50:aload_0         
	//   22   51:invokevirtual   #161 <Method Class[] Class.getInterfaces()>
	//   23   54:astore          6
		int j = aclass.length;
	//   24   56:aload           6
	//   25   58:arraylength     
	//   26   59:istore_2        
		for(int i = 0; i < j; i++)
	//*  27   60:iconst_0        
	//*  28   61:istore_1        
	//*  29   62:iload_1         
	//*  30   63:iload_2         
	//*  31   64:icmpge          147
		{
			java.util.Map.Entry entry;
			for(Iterator iterator = a(aclass[i]).b.entrySet().iterator(); iterator.hasNext(); a(((Map) (obj)), (b)entry.getKey(), (b.a)entry.getValue(), class1))
	//*  32   67:aload           6
	//*  33   69:iload_1         
	//*  34   70:aaload          
	//*  35   71:invokestatic    #38  <Method ReflectiveGenericLifecycleObserver$a a(Class)>
	//*  36   74:getfield        #149 <Field Map ReflectiveGenericLifecycleObserver$a.b>
	//*  37   77:invokeinterface #165 <Method Set Map.entrySet()>
	//*  38   82:invokeinterface #171 <Method Iterator Set.iterator()>
	//*  39   87:astore          7
	//*  40   89:aload           7
	//*  41   91:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//*  42   96:ifeq            140
				entry = (java.util.Map.Entry)iterator.next();
	//   43   99:aload           7
	//   44  101:invokeinterface #181 <Method Object Iterator.next()>
	//   45  106:checkcast       #183 <Class java.util.Map$Entry>
	//   46  109:astore          8

	//   47  111:aload           4
	//   48  113:aload           8
	//   49  115:invokeinterface #186 <Method Object java.util.Map$Entry.getKey()>
	//   50  120:checkcast       #11  <Class ReflectiveGenericLifecycleObserver$b>
	//   51  123:aload           8
	//   52  125:invokeinterface #189 <Method Object java.util.Map$Entry.getValue()>
	//   53  130:checkcast       #57  <Class b$a>
	//   54  133:aload_0         
	//   55  134:invokestatic    #191 <Method void a(Map, ReflectiveGenericLifecycleObserver$b, b$a, Class)>
		}

	//   56  137:goto            89
	//   57  140:iload_1         
	//   58  141:iconst_1        
	//   59  142:iadd            
	//   60  143:istore_1        
	//*  61  144:goto            62
		int k = amethod.length;
	//   62  147:aload           5
	//   63  149:arraylength     
	//   64  150:istore_3        
		j = 0;
	//   65  151:iconst_0        
	//   66  152:istore_2        
		while(j < k) 
	//*  67  153:iload_2         
	//*  68  154:iload_3         
	//*  69  155:icmpge          321
		{
			Method method = amethod[j];
	//   70  158:aload           5
	//   71  160:iload_2         
	//   72  161:aaload          
	//   73  162:astore          6
			Object obj2 = ((Object) ((f)method.getAnnotation(android/arch/lifecycle/f)));
	//   74  164:aload           6
	//   75  166:ldc1            #193 <Class f>
	//   76  168:invokevirtual   #197 <Method java.lang.annotation.Annotation Method.getAnnotation(Class)>
	//   77  171:checkcast       #193 <Class f>
	//   78  174:astore          8
			if(obj2 != null)
	//*  79  176:aload           8
	//*  80  178:ifnonnull       188
	//*  81  181:iload_2         
	//*  82  182:iconst_1        
	//*  83  183:iadd            
	//*  84  184:istore_2        
	//*  85  185:goto            153
			{
				Class aclass1[] = method.getParameterTypes();
	//   86  188:aload           6
	//   87  190:invokevirtual   #200 <Method Class[] Method.getParameterTypes()>
	//   88  193:astore          7
				byte byte0;
				if(aclass1.length > 0)
	//*  89  195:aload           7
	//*  90  197:arraylength     
	//*  91  198:ifle            347
				{
					if(!aclass1[0].isAssignableFrom(android/arch/lifecycle/c))
	//*  92  201:aload           7
	//*  93  203:iconst_0        
	//*  94  204:aaload          
	//*  95  205:ldc1            #202 <Class c>
	//*  96  207:invokevirtual   #206 <Method boolean Class.isAssignableFrom(Class)>
	//*  97  210:ifne            223
						throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
	//   98  213:new             #106 <Class IllegalArgumentException>
	//   99  216:dup             
	//  100  217:ldc1            #208 <String "invalid parameter type. Must be one and instanceof LifecycleOwner">
	//  101  219:invokespecial   #139 <Method void IllegalArgumentException(String)>
	//  102  222:athrow          
					byte0 = 1;
	//  103  223:iconst_1        
	//  104  224:istore_1        
				} else
	//* 105  225:aload           8
	//* 106  227:invokeinterface #211 <Method b$a f.a()>
	//* 107  232:astore          8
	//* 108  234:aload           7
	//* 109  236:arraylength     
	//* 110  237:iconst_1        
	//* 111  238:icmple          283
	//* 112  241:aload           7
	//* 113  243:iconst_1        
	//* 114  244:aaload          
	//* 115  245:ldc1            #57  <Class b$a>
	//* 116  247:invokevirtual   #206 <Method boolean Class.isAssignableFrom(Class)>
	//* 117  250:ifne            263
	//* 118  253:new             #106 <Class IllegalArgumentException>
	//* 119  256:dup             
	//* 120  257:ldc1            #213 <String "invalid parameter type. second arg must be an event">
	//* 121  259:invokespecial   #139 <Method void IllegalArgumentException(String)>
	//* 122  262:athrow          
	//* 123  263:aload           8
	//* 124  265:getstatic       #61  <Field b$a b$a.ON_ANY>
	//* 125  268:if_acmpeq       281
	//* 126  271:new             #106 <Class IllegalArgumentException>
	//* 127  274:dup             
	//* 128  275:ldc1            #215 <String "Second arg is supported only for ON_ANY value">
	//* 129  277:invokespecial   #139 <Method void IllegalArgumentException(String)>
	//* 130  280:athrow          
	//* 131  281:iconst_2        
	//* 132  282:istore_1        
	//* 133  283:aload           7
	//* 134  285:arraylength     
	//* 135  286:iconst_2        
	//* 136  287:icmple          300
	//* 137  290:new             #106 <Class IllegalArgumentException>
	//* 138  293:dup             
	//* 139  294:ldc1            #217 <String "cannot have more than 2 params">
	//* 140  296:invokespecial   #139 <Method void IllegalArgumentException(String)>
	//* 141  299:athrow          
	//* 142  300:aload           4
	//* 143  302:new             #11  <Class ReflectiveGenericLifecycleObserver$b>
	//* 144  305:dup             
	//* 145  306:iload_1         
	//* 146  307:aload           6
	//* 147  309:invokespecial   #220 <Method void ReflectiveGenericLifecycleObserver$b(int, Method)>
	//* 148  312:aload           8
	//* 149  314:aload_0         
	//* 150  315:invokestatic    #191 <Method void a(Map, ReflectiveGenericLifecycleObserver$b, b$a, Class)>
	//* 151  318:goto            181
	//* 152  321:new             #8   <Class ReflectiveGenericLifecycleObserver$a>
	//* 153  324:dup             
	//* 154  325:aload           4
	//* 155  327:invokespecial   #222 <Method void ReflectiveGenericLifecycleObserver$a(Map)>
	//* 156  330:astore          4
	//* 157  332:getstatic       #26  <Field Map a>
	//* 158  335:aload_0         
	//* 159  336:aload           4
	//* 160  338:invokeinterface #143 <Method Object Map.put(Object, Object)>
	//* 161  343:pop             
	//* 162  344:aload           4
	//* 163  346:areturn         
				{
					byte0 = 0;
	//  164  347:iconst_0        
	//  165  348:istore_1        
				}
				obj2 = ((Object) (((f) (obj2)).a()));
				if(aclass1.length > 1)
				{
					if(!aclass1[1].isAssignableFrom(android/arch/lifecycle/b$a))
						throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
					if(obj2 != b.a.ON_ANY)
						throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
					byte0 = 2;
				}
				if(aclass1.length > 2)
					throw new IllegalArgumentException("cannot have more than 2 params");
				a(((Map) (obj)), new b(((int) (byte0)), method), ((b.a) (obj2)), class1);
			}
			j++;
		}
		obj = ((Object) (new a(((Map) (obj)))));
		a.put(((Object) (class1)), obj);
		return ((a) (obj));
	//* 166  349:goto            225
	}

	public void a(c c1, b.a a1)
	{
		a(c, c1, a1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field ReflectiveGenericLifecycleObserver$a c>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #225 <Method void a(ReflectiveGenericLifecycleObserver$a, c, b$a)>
	//    6   10:return          
	}

	static final Map a = new HashMap();
	private final Object b;
	private final a c;

	static 
	{
	//    0    0:new             #21  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void HashMap()>
	//    3    7:putstatic       #26  <Field Map a>
	//*   4   10:return          
	}
}
