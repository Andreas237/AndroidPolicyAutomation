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
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(obj != null)
		//*   5    7:aload_1         
		//*   6    8:ifnull          64
			{
				if(((Object)this).getClass() != obj.getClass())
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
				return a == ((b) (obj)).a && b.getName().equals(((Object) (((b) (obj)).b.getName())));
		//   17   29:aload_0         
		//   18   30:getfield        #17  <Field int a>
		//   19   33:aload_1         
		//   20   34:getfield        #17  <Field int a>
		//   21   37:icmpne          62
		//   22   40:aload_0         
		//   23   41:getfield        #19  <Field Method b>
		//   24   44:invokevirtual   #36  <Method String Method.getName()>
		//   25   47:aload_1         
		//   26   48:getfield        #19  <Field Method b>
		//   27   51:invokevirtual   #36  <Method String Method.getName()>
		//   28   54:invokevirtual   #40  <Method boolean String.equals(Object)>
		//   29   57:ifeq            62
		//   30   60:iconst_1        
		//   31   61:ireturn         
		//   32   62:iconst_0        
		//   33   63:ireturn         
			} else
			{
				return false;
		//   34   64:iconst_0        
		//   35   65:ireturn         
			}
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
	//	               0 78
	//	               1 57
	//	               2 32;
	//    2    4:tableswitch     0 2: default 120
	//	               0 78
	//	               1 57
	//	               2 32
		   goto _L1 _L2 _L3 _L4
_L4:
		b1.b.invoke(b, new Object[] {
			c1, a1
		});
	//    3   32:aload_1         
	//    4   33:getfield        #72  <Field Method ReflectiveGenericLifecycleObserver$b.b>
	//    5   36:aload_0         
	//    6   37:getfield        #31  <Field Object b>
	//    7   40:iconst_2        
	//    8   41:anewarray       Object[]
	//    9   44:dup             
	//   10   45:iconst_0        
	//   11   46:aload_2         
	//   12   47:aastore         
	//   13   48:dup             
	//   14   49:iconst_1        
	//   15   50:aload_3         
	//   16   51:aastore         
	//   17   52:invokevirtual   #78  <Method Object Method.invoke(Object, Object[])>
	//   18   55:pop             
		return;
	//   19   56:return          
_L3:
		try
		{
			b1.b.invoke(b, new Object[] {
				c1
			});
	//   20   57:aload_1         
	//   21   58:getfield        #72  <Field Method ReflectiveGenericLifecycleObserver$b.b>
	//   22   61:aload_0         
	//   23   62:getfield        #31  <Field Object b>
	//   24   65:iconst_1        
	//   25   66:anewarray       Object[]
	//   26   69:dup             
	//   27   70:iconst_0        
	//   28   71:aload_2         
	//   29   72:aastore         
	//   30   73:invokevirtual   #78  <Method Object Method.invoke(Object, Object[])>
	//   31   76:pop             
			return;
	//   32   77:return          
		}
	//*  33   78:aload_1         
	//*  34   79:getfield        #72  <Field Method ReflectiveGenericLifecycleObserver$b.b>
	//*  35   82:aload_0         
	//*  36   83:getfield        #31  <Field Object b>
	//*  37   86:iconst_0        
	//*  38   87:anewarray       Object[]
	//*  39   90:invokevirtual   #78  <Method Object Method.invoke(Object, Object[])>
	//*  40   93:pop             
	//*  41   94:return          
	//*  42   95:astore_1        
	//*  43   96:new             #80  <Class RuntimeException>
	//*  44   99:dup             
	//*  45  100:aload_1         
	//*  46  101:invokespecial   #83  <Method void RuntimeException(Throwable)>
	//*  47  104:athrow          
		// Misplaced declaration of an exception variable
		catch(b b1)
	//*  48  105:astore_1        
		{
			throw new RuntimeException("Failed to call observer method", ((InvocationTargetException) (b1)).getCause());
	//   49  106:new             #80  <Class RuntimeException>
	//   50  109:dup             
	//   51  110:ldc1            #85  <String "Failed to call observer method">
	//   52  112:aload_1         
	//   53  113:invokevirtual   #89  <Method Throwable InvocationTargetException.getCause()>
	//   54  116:invokespecial   #92  <Method void RuntimeException(String, Throwable)>
	//   55  119:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(b b1)
		{
			throw new RuntimeException(((Throwable) (b1)));
		}
_L2:
		b1.b.invoke(b, new Object[0]);
		return;
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
	//*   6   14:ifnull          114
	//*   7   17:aload_2         
	//*   8   18:aload           4
	//*   9   20:if_acmpeq       114
		{
			map = ((Map) (b1.b));
	//   10   23:aload_1         
	//   11   24:getfield        #72  <Field Method ReflectiveGenericLifecycleObserver$b.b>
	//   12   27:astore_0        
			b1 = ((b) (new StringBuilder()));
	//   13   28:new             #106 <Class StringBuilder>
	//   14   31:dup             
	//   15   32:invokespecial   #107 <Method void StringBuilder()>
	//   16   35:astore_1        
			((StringBuilder) (b1)).append("Method ");
	//   17   36:aload_1         
	//   18   37:ldc1            #109 <String "Method ">
	//   19   39:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   20   42:pop             
			((StringBuilder) (b1)).append(((Method) (map)).getName());
	//   21   43:aload_1         
	//   22   44:aload_0         
	//   23   45:invokevirtual   #117 <Method String Method.getName()>
	//   24   48:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
			((StringBuilder) (b1)).append(" in ");
	//   26   52:aload_1         
	//   27   53:ldc1            #119 <String " in ">
	//   28   55:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
			((StringBuilder) (b1)).append(class1.getName());
	//   30   59:aload_1         
	//   31   60:aload_3         
	//   32   61:invokevirtual   #122 <Method String Class.getName()>
	//   33   64:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   34   67:pop             
			((StringBuilder) (b1)).append(" already declared with different @OnLifecycleEvent value: previous");
	//   35   68:aload_1         
	//   36   69:ldc1            #124 <String " already declared with different @OnLifecycleEvent value: previous">
	//   37   71:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   38   74:pop             
			((StringBuilder) (b1)).append(" value ");
	//   39   75:aload_1         
	//   40   76:ldc1            #126 <String " value ">
	//   41   78:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   42   81:pop             
			((StringBuilder) (b1)).append(((Object) (a2)));
	//   43   82:aload_1         
	//   44   83:aload           4
	//   45   85:invokevirtual   #129 <Method StringBuilder StringBuilder.append(Object)>
	//   46   88:pop             
			((StringBuilder) (b1)).append(", new value ");
	//   47   89:aload_1         
	//   48   90:ldc1            #131 <String ", new value ">
	//   49   92:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   50   95:pop             
			((StringBuilder) (b1)).append(((Object) (a1)));
	//   51   96:aload_1         
	//   52   97:aload_2         
	//   53   98:invokevirtual   #129 <Method StringBuilder StringBuilder.append(Object)>
	//   54  101:pop             
			throw new IllegalArgumentException(((StringBuilder) (b1)).toString());
	//   55  102:new             #133 <Class IllegalArgumentException>
	//   56  105:dup             
	//   57  106:aload_1         
	//   58  107:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   59  110:invokespecial   #139 <Method void IllegalArgumentException(String)>
	//   60  113:athrow          
		}
		if(a2 == null)
	//*  61  114:aload           4
	//*  62  116:ifnonnull       128
			map.put(((Object) (b1)), ((Object) (a1)));
	//   63  119:aload_0         
	//   64  120:aload_1         
	//   65  121:aload_2         
	//   66  122:invokeinterface #143 <Method Object Map.put(Object, Object)>
	//   67  127:pop             
	//   68  128:return          
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
		int l = amethod.length;
	//   62  147:aload           5
	//   63  149:arraylength     
	//   64  150:istore_3        
		for(int k = 0; k < l; k++)
	//*  65  151:iconst_0        
	//*  66  152:istore_2        
	//*  67  153:iload_2         
	//*  68  154:iload_3         
	//*  69  155:icmpge          326
		{
			Method method = amethod[k];
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
			if(obj2 == null)
	//*  79  176:aload           8
	//*  80  178:ifnonnull       184
				continue;
	//   81  181:goto            319
			Class aclass1[] = method.getParameterTypes();
	//   82  184:aload           6
	//   83  186:invokevirtual   #200 <Method Class[] Method.getParameterTypes()>
	//   84  189:astore          7
			byte byte0;
			if(aclass1.length > 0)
	//*  85  191:aload           7
	//*  86  193:arraylength     
	//*  87  194:ifle            224
			{
				if(!aclass1[0].isAssignableFrom(android/arch/lifecycle/c))
	//*  88  197:aload           7
	//*  89  199:iconst_0        
	//*  90  200:aaload          
	//*  91  201:ldc1            #202 <Class c>
	//*  92  203:invokevirtual   #206 <Method boolean Class.isAssignableFrom(Class)>
	//*  93  206:ifne            219
					throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
	//   94  209:new             #133 <Class IllegalArgumentException>
	//   95  212:dup             
	//   96  213:ldc1            #208 <String "invalid parameter type. Must be one and instanceof LifecycleOwner">
	//   97  215:invokespecial   #139 <Method void IllegalArgumentException(String)>
	//   98  218:athrow          
				byte0 = 1;
	//   99  219:iconst_1        
	//  100  220:istore_1        
			} else
	//* 101  221:goto            226
			{
				byte0 = 0;
	//  102  224:iconst_0        
	//  103  225:istore_1        
			}
			obj2 = ((Object) (((f) (obj2)).a()));
	//  104  226:aload           8
	//  105  228:invokeinterface #211 <Method b$a f.a()>
	//  106  233:astore          8
			if(aclass1.length > 1)
	//* 107  235:aload           7
	//* 108  237:arraylength     
	//* 109  238:iconst_1        
	//* 110  239:icmple          284
			{
				if(!aclass1[1].isAssignableFrom(android/arch/lifecycle/b$a))
	//* 111  242:aload           7
	//* 112  244:iconst_1        
	//* 113  245:aaload          
	//* 114  246:ldc1            #57  <Class b$a>
	//* 115  248:invokevirtual   #206 <Method boolean Class.isAssignableFrom(Class)>
	//* 116  251:ifne            264
					throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
	//  117  254:new             #133 <Class IllegalArgumentException>
	//  118  257:dup             
	//  119  258:ldc1            #213 <String "invalid parameter type. second arg must be an event">
	//  120  260:invokespecial   #139 <Method void IllegalArgumentException(String)>
	//  121  263:athrow          
				if(obj2 != b.a.ON_ANY)
	//* 122  264:aload           8
	//* 123  266:getstatic       #61  <Field b$a b$a.ON_ANY>
	//* 124  269:if_acmpeq       282
					throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
	//  125  272:new             #133 <Class IllegalArgumentException>
	//  126  275:dup             
	//  127  276:ldc1            #215 <String "Second arg is supported only for ON_ANY value">
	//  128  278:invokespecial   #139 <Method void IllegalArgumentException(String)>
	//  129  281:athrow          
				byte0 = 2;
	//  130  282:iconst_2        
	//  131  283:istore_1        
			}
			if(aclass1.length > 2)
	//* 132  284:aload           7
	//* 133  286:arraylength     
	//* 134  287:iconst_2        
	//* 135  288:icmple          301
				throw new IllegalArgumentException("cannot have more than 2 params");
	//  136  291:new             #133 <Class IllegalArgumentException>
	//  137  294:dup             
	//  138  295:ldc1            #217 <String "cannot have more than 2 params">
	//  139  297:invokespecial   #139 <Method void IllegalArgumentException(String)>
	//  140  300:athrow          
			a(((Map) (obj)), new b(((int) (byte0)), method), ((b.a) (obj2)), class1);
	//  141  301:aload           4
	//  142  303:new             #11  <Class ReflectiveGenericLifecycleObserver$b>
	//  143  306:dup             
	//  144  307:iload_1         
	//  145  308:aload           6
	//  146  310:invokespecial   #220 <Method void ReflectiveGenericLifecycleObserver$b(int, Method)>
	//  147  313:aload           8
	//  148  315:aload_0         
	//  149  316:invokestatic    #191 <Method void a(Map, ReflectiveGenericLifecycleObserver$b, b$a, Class)>
		}

	//  150  319:iload_2         
	//  151  320:iconst_1        
	//  152  321:iadd            
	//  153  322:istore_2        
	//* 154  323:goto            153
		obj = ((Object) (new a(((Map) (obj)))));
	//  155  326:new             #8   <Class ReflectiveGenericLifecycleObserver$a>
	//  156  329:dup             
	//  157  330:aload           4
	//  158  332:invokespecial   #222 <Method void ReflectiveGenericLifecycleObserver$a(Map)>
	//  159  335:astore          4
		a.put(((Object) (class1)), obj);
	//  160  337:getstatic       #26  <Field Map a>
	//  161  340:aload_0         
	//  162  341:aload           4
	//  163  343:invokeinterface #143 <Method Object Map.put(Object, Object)>
	//  164  348:pop             
		return ((a) (obj));
	//  165  349:aload           4
	//  166  351:areturn         
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
