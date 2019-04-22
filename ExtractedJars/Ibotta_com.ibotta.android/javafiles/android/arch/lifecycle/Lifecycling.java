// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

// Referenced classes of package android.arch.lifecycle:
//			GeneratedAdapter, FullLifecycleObserver, FullLifecycleObserverAdapter, GenericLifecycleObserver, 
//			SingleGeneratedAdapterObserver, CompositeGeneratedAdaptersObserver, ReflectiveGenericLifecycleObserver, LifecycleObserver, 
//			ClassesInfoCache

public class Lifecycling
{

	private static GeneratedAdapter createGeneratedAdapter(Constructor constructor, Object obj)
	{
		try
		{
			constructor = ((Constructor) ((GeneratedAdapter)constructor.newInstance(new Object[] {
				obj
			})));
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:anewarray       Object[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:aastore         
	//    7    9:invokevirtual   #39  <Method Object Constructor.newInstance(Object[])>
	//    8   12:checkcast       #41  <Class GeneratedAdapter>
	//    9   15:astore_0        
		}
	//*  10   16:aload_0         
	//*  11   17:areturn         
	//*  12   18:astore_0        
	//*  13   19:new             #43  <Class RuntimeException>
	//*  14   22:dup             
	//*  15   23:aload_0         
	//*  16   24:invokespecial   #46  <Method void RuntimeException(Throwable)>
	//*  17   27:athrow          
	//*  18   28:astore_0        
	//*  19   29:new             #43  <Class RuntimeException>
	//*  20   32:dup             
	//*  21   33:aload_0         
	//*  22   34:invokespecial   #46  <Method void RuntimeException(Throwable)>
	//*  23   37:athrow          
		// Misplaced declaration of an exception variable
		catch(Constructor constructor)
	//*  24   38:astore_0        
		{
			throw new RuntimeException(((Throwable) (constructor)));
	//   25   39:new             #43  <Class RuntimeException>
	//   26   42:dup             
	//   27   43:aload_0         
	//   28   44:invokespecial   #46  <Method void RuntimeException(Throwable)>
	//   29   47:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Constructor constructor)
		{
			throw new RuntimeException(((Throwable) (constructor)));
		}
		// Misplaced declaration of an exception variable
		catch(Constructor constructor)
		{
			throw new RuntimeException(((Throwable) (constructor)));
		}
		return ((GeneratedAdapter) (constructor));
	}

	private static Constructor generatedConstructor(Class class1)
	{
		Object obj;
		String s;
		try
		{
			obj = ((Object) (class1.getPackage()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #61  <Method Package Class.getPackage()>
	//    2    4:astore_1        
			s = class1.getCanonicalName();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #65  <Method String Class.getCanonicalName()>
	//    5    9:astore_2        
		}
	//*   6   10:aload_1         
	//*   7   11:ifnull          138
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #70  <Method String Package.getName()>
	//*  10   18:astore_1        
	//*  11   19:goto            22
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #76  <Method boolean String.isEmpty()>
	//*  14   26:ifeq            32
	//*  15   29:goto            43
	//*  16   32:aload_2         
	//*  17   33:aload_1         
	//*  18   34:invokevirtual   #80  <Method int String.length()>
	//*  19   37:iconst_1        
	//*  20   38:iadd            
	//*  21   39:invokevirtual   #84  <Method String String.substring(int)>
	//*  22   42:astore_2        
	//*  23   43:aload_2         
	//*  24   44:invokestatic    #88  <Method String getAdapterName(String)>
	//*  25   47:astore_2        
	//*  26   48:aload_1         
	//*  27   49:invokevirtual   #76  <Method boolean String.isEmpty()>
	//*  28   52:ifeq            60
	//*  29   55:aload_2         
	//*  30   56:astore_1        
	//*  31   57:goto            92
	//*  32   60:new             #90  <Class StringBuilder>
	//*  33   63:dup             
	//*  34   64:invokespecial   #91  <Method void StringBuilder()>
	//*  35   67:astore_3        
	//*  36   68:aload_3         
	//*  37   69:aload_1         
	//*  38   70:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//*  39   73:pop             
	//*  40   74:aload_3         
	//*  41   75:ldc1            #97  <String ".">
	//*  42   77:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//*  43   80:pop             
	//*  44   81:aload_3         
	//*  45   82:aload_2         
	//*  46   83:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//*  47   86:pop             
	//*  48   87:aload_3         
	//*  49   88:invokevirtual   #100 <Method String StringBuilder.toString()>
	//*  50   91:astore_1        
	//*  51   92:aload_1         
	//*  52   93:invokestatic    #104 <Method Class Class.forName(String)>
	//*  53   96:iconst_1        
	//*  54   97:anewarray       Class[]
	//*  55  100:dup             
	//*  56  101:iconst_0        
	//*  57  102:aload_0         
	//*  58  103:aastore         
	//*  59  104:invokevirtual   #108 <Method Constructor Class.getDeclaredConstructor(Class[])>
	//*  60  107:astore_0        
	//*  61  108:aload_0         
	//*  62  109:invokevirtual   #111 <Method boolean Constructor.isAccessible()>
	//*  63  112:ifne            120
	//*  64  115:aload_0         
	//*  65  116:iconst_1        
	//*  66  117:invokevirtual   #115 <Method void Constructor.setAccessible(boolean)>
	//*  67  120:aload_0         
	//*  68  121:areturn         
	//*  69  122:astore_0        
	//*  70  123:new             #43  <Class RuntimeException>
	//*  71  126:dup             
	//*  72  127:aload_0         
	//*  73  128:invokespecial   #46  <Method void RuntimeException(Throwable)>
	//*  74  131:athrow          
	//*  75  132:aconst_null     
	//*  76  133:areturn         
		// Misplaced declaration of an exception variable
		catch(Class class1)
		{
			return null;
		}
		// Misplaced declaration of an exception variable
		catch(Class class1)
		{
			throw new RuntimeException(((Throwable) (class1)));
		}
		if(obj == null) goto _L2; else goto _L1
_L1:
		obj = ((Object) (((Package) (obj)).getName()));
_L4:
		if(((String) (obj)).isEmpty())
			break MISSING_BLOCK_LABEL_43;
		s = s.substring(((String) (obj)).length() + 1);
		s = getAdapterName(s);
		if(((String) (obj)).isEmpty())
		{
			obj = ((Object) (s));
			break MISSING_BLOCK_LABEL_92;
		}
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append(((String) (obj)));
		stringbuilder.append(".");
		stringbuilder.append(s);
		obj = ((Object) (stringbuilder.toString()));
		class1 = ((Class) (Class.forName(((String) (obj))).getDeclaredConstructor(new Class[] {
			class1
		})));
		if(!((Constructor) (class1)).isAccessible())
			((Constructor) (class1)).setAccessible(true);
		return ((Constructor) (class1));
	//*  77  134:astore_0        
	//*  78  135:goto            132
_L2:
		obj = "";
	//   79  138:ldc1            #117 <String "">
	//   80  140:astore_1        
		if(true) goto _L4; else goto _L3
	//   81  141:goto            22
_L3:
	}

	public static String getAdapterName(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(s.replace(".", "_"));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:ldc1            #97  <String ".">
	//    7   12:ldc1            #121 <String "_">
	//    8   14:invokevirtual   #125 <Method String String.replace(CharSequence, CharSequence)>
	//    9   17:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		stringbuilder.append("_LifecycleAdapter");
	//   11   21:aload_1         
	//   12   22:ldc1            #127 <String "_LifecycleAdapter">
	//   13   24:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		return stringbuilder.toString();
	//   15   28:aload_1         
	//   16   29:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   17   32:areturn         
	}

	static GenericLifecycleObserver getCallback(Object obj)
	{
		if(obj instanceof FullLifecycleObserver)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #132 <Class FullLifecycleObserver>
	//*   2    4:ifeq            19
			return ((GenericLifecycleObserver) (new FullLifecycleObserverAdapter((FullLifecycleObserver)obj)));
	//    3    7:new             #134 <Class FullLifecycleObserverAdapter>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:checkcast       #132 <Class FullLifecycleObserver>
	//    7   15:invokespecial   #137 <Method void FullLifecycleObserverAdapter(FullLifecycleObserver)>
	//    8   18:areturn         
		if(obj instanceof GenericLifecycleObserver)
	//*   9   19:aload_0         
	//*  10   20:instanceof      #139 <Class GenericLifecycleObserver>
	//*  11   23:ifeq            31
			return (GenericLifecycleObserver)obj;
	//   12   26:aload_0         
	//   13   27:checkcast       #139 <Class GenericLifecycleObserver>
	//   14   30:areturn         
		Object obj1 = ((Object) (obj.getClass()));
	//   15   31:aload_0         
	//   16   32:invokevirtual   #143 <Method Class Object.getClass()>
	//   17   35:astore_3        
		if(getObserverConstructorType(((Class) (obj1))) == 2)
	//*  18   36:aload_3         
	//*  19   37:invokestatic    #147 <Method int getObserverConstructorType(Class)>
	//*  20   40:iconst_2        
	//*  21   41:icmpne          149
		{
			obj1 = ((Object) ((List)sClassToAdapters.get(obj1)));
	//   22   44:getstatic       #24  <Field Map sClassToAdapters>
	//   23   47:aload_3         
	//   24   48:invokeinterface #153 <Method Object Map.get(Object)>
	//   25   53:checkcast       #155 <Class List>
	//   26   56:astore_3        
			int j = ((List) (obj1)).size();
	//   27   57:aload_3         
	//   28   58:invokeinterface #158 <Method int List.size()>
	//   29   63:istore_2        
			int i = 0;
	//   30   64:iconst_0        
	//   31   65:istore_1        
			if(j == 1)
	//*  32   66:iload_2         
	//*  33   67:iconst_1        
	//*  34   68:icmpne          93
				return ((GenericLifecycleObserver) (new SingleGeneratedAdapterObserver(createGeneratedAdapter((Constructor)((List) (obj1)).get(0), obj))));
	//   35   71:new             #160 <Class SingleGeneratedAdapterObserver>
	//   36   74:dup             
	//   37   75:aload_3         
	//   38   76:iconst_0        
	//   39   77:invokeinterface #163 <Method Object List.get(int)>
	//   40   82:checkcast       #35  <Class Constructor>
	//   41   85:aload_0         
	//   42   86:invokestatic    #165 <Method GeneratedAdapter createGeneratedAdapter(Constructor, Object)>
	//   43   89:invokespecial   #168 <Method void SingleGeneratedAdapterObserver(GeneratedAdapter)>
	//   44   92:areturn         
			GeneratedAdapter ageneratedadapter[] = new GeneratedAdapter[((List) (obj1)).size()];
	//   45   93:aload_3         
	//   46   94:invokeinterface #158 <Method int List.size()>
	//   47   99:anewarray       GeneratedAdapter[]
	//   48  102:astore          4
			for(; i < ((List) (obj1)).size(); i++)
	//*  49  104:iload_1         
	//*  50  105:aload_3         
	//*  51  106:invokeinterface #158 <Method int List.size()>
	//*  52  111:icmpge          139
				ageneratedadapter[i] = createGeneratedAdapter((Constructor)((List) (obj1)).get(i), obj);
	//   53  114:aload           4
	//   54  116:iload_1         
	//   55  117:aload_3         
	//   56  118:iload_1         
	//   57  119:invokeinterface #163 <Method Object List.get(int)>
	//   58  124:checkcast       #35  <Class Constructor>
	//   59  127:aload_0         
	//   60  128:invokestatic    #165 <Method GeneratedAdapter createGeneratedAdapter(Constructor, Object)>
	//   61  131:aastore         

	//   62  132:iload_1         
	//   63  133:iconst_1        
	//   64  134:iadd            
	//   65  135:istore_1        
	//*  66  136:goto            104
			return ((GenericLifecycleObserver) (new CompositeGeneratedAdaptersObserver(ageneratedadapter)));
	//   67  139:new             #170 <Class CompositeGeneratedAdaptersObserver>
	//   68  142:dup             
	//   69  143:aload           4
	//   70  145:invokespecial   #173 <Method void CompositeGeneratedAdaptersObserver(GeneratedAdapter[])>
	//   71  148:areturn         
		} else
		{
			return ((GenericLifecycleObserver) (new ReflectiveGenericLifecycleObserver(obj)));
	//   72  149:new             #175 <Class ReflectiveGenericLifecycleObserver>
	//   73  152:dup             
	//   74  153:aload_0         
	//   75  154:invokespecial   #178 <Method void ReflectiveGenericLifecycleObserver(Object)>
	//   76  157:areturn         
		}
	}

	private static int getObserverConstructorType(Class class1)
	{
		if(sCallbackCache.containsKey(((Object) (class1))))
	//*   0    0:getstatic       #22  <Field Map sCallbackCache>
	//*   1    3:aload_0         
	//*   2    4:invokeinterface #182 <Method boolean Map.containsKey(Object)>
	//*   3    9:ifeq            28
		{
			return ((Integer)sCallbackCache.get(((Object) (class1)))).intValue();
	//    4   12:getstatic       #22  <Field Map sCallbackCache>
	//    5   15:aload_0         
	//    6   16:invokeinterface #153 <Method Object Map.get(Object)>
	//    7   21:checkcast       #184 <Class Integer>
	//    8   24:invokevirtual   #187 <Method int Integer.intValue()>
	//    9   27:ireturn         
		} else
		{
			int i = resolveObserverCallbackType(class1);
	//   10   28:aload_0         
	//   11   29:invokestatic    #190 <Method int resolveObserverCallbackType(Class)>
	//   12   32:istore_1        
			sCallbackCache.put(((Object) (class1)), ((Object) (Integer.valueOf(i))));
	//   13   33:getstatic       #22  <Field Map sCallbackCache>
	//   14   36:aload_0         
	//   15   37:iload_1         
	//   16   38:invokestatic    #194 <Method Integer Integer.valueOf(int)>
	//   17   41:invokeinterface #198 <Method Object Map.put(Object, Object)>
	//   18   46:pop             
			return i;
	//   19   47:iload_1         
	//   20   48:ireturn         
		}
	}

	private static boolean isLifecycleParent(Class class1)
	{
		return class1 != null && ((Class) (android/arch/lifecycle/LifecycleObserver)).isAssignableFrom(class1);
	//    0    0:aload_0         
	//    1    1:ifnull          15
	//    2    4:ldc1            #203 <Class LifecycleObserver>
	//    3    6:aload_0         
	//    4    7:invokevirtual   #206 <Method boolean Class.isAssignableFrom(Class)>
	//    5   10:ifeq            15
	//    6   13:iconst_1        
	//    7   14:ireturn         
	//    8   15:iconst_0        
	//    9   16:ireturn         
	}

	private static int resolveObserverCallbackType(Class class1)
	{
		if(class1.getCanonicalName() == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #65  <Method String Class.getCanonicalName()>
	//*   2    4:ifnonnull       9
			return 1;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		Object obj = ((Object) (generatedConstructor(class1)));
	//    5    9:aload_0         
	//    6   10:invokestatic    #209 <Method Constructor generatedConstructor(Class)>
	//    7   13:astore_3        
		if(obj != null)
	//*   8   14:aload_3         
	//*   9   15:ifnull          34
		{
			sClassToAdapters.put(((Object) (class1)), ((Object) (Collections.singletonList(obj))));
	//   10   18:getstatic       #24  <Field Map sClassToAdapters>
	//   11   21:aload_0         
	//   12   22:aload_3         
	//   13   23:invokestatic    #215 <Method List Collections.singletonList(Object)>
	//   14   26:invokeinterface #198 <Method Object Map.put(Object, Object)>
	//   15   31:pop             
			return 2;
	//   16   32:iconst_2        
	//   17   33:ireturn         
		}
		if(ClassesInfoCache.sInstance.hasLifecycleMethods(class1))
	//*  18   34:getstatic       #221 <Field ClassesInfoCache ClassesInfoCache.sInstance>
	//*  19   37:aload_0         
	//*  20   38:invokevirtual   #224 <Method boolean ClassesInfoCache.hasLifecycleMethods(Class)>
	//*  21   41:ifeq            46
			return 1;
	//   22   44:iconst_1        
	//   23   45:ireturn         
		Class class2 = class1.getSuperclass();
	//   24   46:aload_0         
	//   25   47:invokevirtual   #227 <Method Class Class.getSuperclass()>
	//   26   50:astore          4
		obj = null;
	//   27   52:aconst_null     
	//   28   53:astore_3        
		if(isLifecycleParent(class2))
	//*  29   54:aload           4
	//*  30   56:invokestatic    #229 <Method boolean isLifecycleParent(Class)>
	//*  31   59:ifeq            94
		{
			if(getObserverConstructorType(class2) == 1)
	//*  32   62:aload           4
	//*  33   64:invokestatic    #147 <Method int getObserverConstructorType(Class)>
	//*  34   67:iconst_1        
	//*  35   68:icmpne          73
				return 1;
	//   36   71:iconst_1        
	//   37   72:ireturn         
			obj = ((Object) (new ArrayList((Collection)sClassToAdapters.get(((Object) (class2))))));
	//   38   73:new             #231 <Class ArrayList>
	//   39   76:dup             
	//   40   77:getstatic       #24  <Field Map sClassToAdapters>
	//   41   80:aload           4
	//   42   82:invokeinterface #153 <Method Object Map.get(Object)>
	//   43   87:checkcast       #233 <Class Collection>
	//   44   90:invokespecial   #236 <Method void ArrayList(Collection)>
	//   45   93:astore_3        
		}
		Class aclass[] = class1.getInterfaces();
	//   46   94:aload_0         
	//   47   95:invokevirtual   #240 <Method Class[] Class.getInterfaces()>
	//   48   98:astore          5
		int j = aclass.length;
	//   49  100:aload           5
	//   50  102:arraylength     
	//   51  103:istore_2        
		for(int i = 0; i < j; i++)
	//*  52  104:iconst_0        
	//*  53  105:istore_1        
	//*  54  106:iload_1         
	//*  55  107:iload_2         
	//*  56  108:icmpge          186
		{
			Class class3 = aclass[i];
	//   57  111:aload           5
	//   58  113:iload_1         
	//   59  114:aaload          
	//   60  115:astore          6
			if(!isLifecycleParent(class3))
	//*  61  117:aload           6
	//*  62  119:invokestatic    #229 <Method boolean isLifecycleParent(Class)>
	//*  63  122:ifne            128
				continue;
	//   64  125:goto            179
			if(getObserverConstructorType(class3) == 1)
	//*  65  128:aload           6
	//*  66  130:invokestatic    #147 <Method int getObserverConstructorType(Class)>
	//*  67  133:iconst_1        
	//*  68  134:icmpne          139
				return 1;
	//   69  137:iconst_1        
	//   70  138:ireturn         
			ArrayList arraylist = ((ArrayList) (obj));
	//   71  139:aload_3         
	//   72  140:astore          4
			if(obj == null)
	//*  73  142:aload_3         
	//*  74  143:ifnonnull       155
				arraylist = new ArrayList();
	//   75  146:new             #231 <Class ArrayList>
	//   76  149:dup             
	//   77  150:invokespecial   #241 <Method void ArrayList()>
	//   78  153:astore          4
			((List) (arraylist)).addAll((Collection)sClassToAdapters.get(((Object) (class3))));
	//   79  155:aload           4
	//   80  157:getstatic       #24  <Field Map sClassToAdapters>
	//   81  160:aload           6
	//   82  162:invokeinterface #153 <Method Object Map.get(Object)>
	//   83  167:checkcast       #233 <Class Collection>
	//   84  170:invokeinterface #245 <Method boolean List.addAll(Collection)>
	//   85  175:pop             
			obj = ((Object) (arraylist));
	//   86  176:aload           4
	//   87  178:astore_3        
		}

	//   88  179:iload_1         
	//   89  180:iconst_1        
	//   90  181:iadd            
	//   91  182:istore_1        
	//*  92  183:goto            106
		if(obj != null)
	//*  93  186:aload_3         
	//*  94  187:ifnull          203
		{
			sClassToAdapters.put(((Object) (class1)), obj);
	//   95  190:getstatic       #24  <Field Map sClassToAdapters>
	//   96  193:aload_0         
	//   97  194:aload_3         
	//   98  195:invokeinterface #198 <Method Object Map.put(Object, Object)>
	//   99  200:pop             
			return 2;
	//  100  201:iconst_2        
	//  101  202:ireturn         
		} else
		{
			return 1;
	//  102  203:iconst_1        
	//  103  204:ireturn         
		}
	}

	private static Map sCallbackCache = new HashMap();
	private static Map sClassToAdapters = new HashMap();

	static 
	{
	//    0    0:new             #17  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void HashMap()>
	//    3    7:putstatic       #22  <Field Map sCallbackCache>
	//    4   10:new             #17  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #20  <Method void HashMap()>
	//    7   17:putstatic       #24  <Field Map sClassToAdapters>
	//*   8   20:return          
	}
}
