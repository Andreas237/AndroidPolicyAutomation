// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.util;

import ch.qos.logback.core.joran.spi.DefaultClass;
import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.AggregationType;
import ch.qos.logback.core.util.PropertySetterException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

// Referenced classes of package ch.qos.logback.core.joran.util:
//			StringToObjectConverter, Introspector, PropertyDescriptor, MethodDescriptor, 
//			IntrospectionException

public class PropertySetter extends ContextAwareBase
{

	public PropertySetter(Object obj1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void ContextAwareBase()>
		obj = obj1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Object obj>
		objClass = obj1.getClass();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #28  <Method Class Object.getClass()>
	//    8   14:putfield        #30  <Field Class objClass>
	//    9   17:return          
	}

	private String capitalizeFirstLetter(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #35  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(s.substring(0, 1).toUpperCase());
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:iconst_1        
	//    8   12:invokevirtual   #42  <Method String String.substring(int, int)>
	//    9   15:invokevirtual   #46  <Method String String.toUpperCase()>
	//   10   18:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(s.substring(1));
	//   12   22:aload_2         
	//   13   23:aload_1         
	//   14   24:iconst_1        
	//   15   25:invokevirtual   #53  <Method String String.substring(int)>
	//   16   28:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   17   31:pop             
		return stringbuilder.toString();
	//   18   32:aload_2         
	//   19   33:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   20   36:areturn         
	}

	private AggregationType computeRawAggregationType(Method method)
	{
		method = ((Method) (getParameterClassForMethod(method)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #62  <Method Class getParameterClassForMethod(Method)>
	//    3    5:astore_1        
		if(method == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       14
			return AggregationType.NOT_FOUND;
	//    6   10:getstatic       #68  <Field AggregationType AggregationType.NOT_FOUND>
	//    7   13:areturn         
		if(StringToObjectConverter.canBeBuiltFromSimpleString(((Class) (method))))
	//*   8   14:aload_1         
	//*   9   15:invokestatic    #74  <Method boolean StringToObjectConverter.canBeBuiltFromSimpleString(Class)>
	//*  10   18:ifeq            25
			return AggregationType.AS_BASIC_PROPERTY;
	//   11   21:getstatic       #77  <Field AggregationType AggregationType.AS_BASIC_PROPERTY>
	//   12   24:areturn         
		else
			return AggregationType.AS_COMPLEX_PROPERTY;
	//   13   25:getstatic       #80  <Field AggregationType AggregationType.AS_COMPLEX_PROPERTY>
	//   14   28:areturn         
	}

	private Method findAdderMethod(String s)
	{
		s = capitalizeFirstLetter(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #84  <Method String capitalizeFirstLetter(String)>
	//    3    5:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    4    6:new             #35  <Class StringBuilder>
	//    5    9:dup             
	//    6   10:invokespecial   #36  <Method void StringBuilder()>
	//    7   13:astore_2        
		stringbuilder.append("add");
	//    8   14:aload_2         
	//    9   15:ldc1            #86  <String "add">
	//   10   17:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append(s);
	//   12   21:aload_2         
	//   13   22:aload_1         
	//   14   23:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   15   26:pop             
		return getMethod(stringbuilder.toString());
	//   16   27:aload_0         
	//   17   28:aload_2         
	//   18   29:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   19   32:invokevirtual   #89  <Method Method getMethod(String)>
	//   20   35:areturn         
	}

	private Method findSetterMethod(String s)
	{
		s = ((String) (getPropertyDescriptor(Introspector.decapitalize(s))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #95  <Method String Introspector.decapitalize(String)>
	//    3    5:invokevirtual   #99  <Method PropertyDescriptor getPropertyDescriptor(String)>
	//    4    8:astore_1        
		if(s != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          18
			return ((PropertyDescriptor) (s)).getWriteMethod();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #105 <Method Method PropertyDescriptor.getWriteMethod()>
	//    9   17:areturn         
		else
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
	}

	private Class getParameterClassForMethod(Method method)
	{
		if(method == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		method = ((Method) (method.getParameterTypes()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #111 <Method Class[] Method.getParameterTypes()>
	//    6   10:astore_1        
		if(method.length != 1)
	//*   7   11:aload_1         
	//*   8   12:arraylength     
	//*   9   13:iconst_1        
	//*  10   14:icmpeq          19
			return null;
	//   11   17:aconst_null     
	//   12   18:areturn         
		else
			return ((Class) (method[0]));
	//   13   19:aload_1         
	//   14   20:iconst_0        
	//   15   21:aaload          
	//   16   22:areturn         
	}

	private boolean isSanityCheckSuccessful(String s, Method method, Class aclass[], Object obj1)
	{
		method = ((Method) (obj1.getClass()));
	//    0    0:aload           4
	//    1    2:invokevirtual   #28  <Method Class Object.getClass()>
	//    2    5:astore_2        
		if(aclass.length != 1)
	//*   3    6:aload_3         
	//*   4    7:arraylength     
	//*   5    8:iconst_1        
	//*   6    9:icmpeq          67
		{
			method = ((Method) (new StringBuilder()));
	//    7   12:new             #35  <Class StringBuilder>
	//    8   15:dup             
	//    9   16:invokespecial   #36  <Method void StringBuilder()>
	//   10   19:astore_2        
			((StringBuilder) (method)).append("Wrong number of parameters in setter method for property [");
	//   11   20:aload_2         
	//   12   21:ldc1            #117 <String "Wrong number of parameters in setter method for property [">
	//   13   23:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   14   26:pop             
			((StringBuilder) (method)).append(s);
	//   15   27:aload_2         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   18   32:pop             
			((StringBuilder) (method)).append("] in ");
	//   19   33:aload_2         
	//   20   34:ldc1            #119 <String "] in ">
	//   21   36:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   22   39:pop             
			((StringBuilder) (method)).append(obj.getClass().getName());
	//   23   40:aload_2         
	//   24   41:aload_0         
	//   25   42:getfield        #22  <Field Object obj>
	//   26   45:invokevirtual   #28  <Method Class Object.getClass()>
	//   27   48:invokevirtual   #124 <Method String Class.getName()>
	//   28   51:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   29   54:pop             
			s = ((StringBuilder) (method)).toString();
	//   30   55:aload_2         
	//   31   56:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   32   59:astore_1        
		} else
	//*  33   60:aload_0         
	//*  34   61:aload_1         
	//*  35   62:invokevirtual   #128 <Method void addError(String)>
	//*  36   65:iconst_0        
	//*  37   66:ireturn         
		if(!aclass[0].isAssignableFrom(obj1.getClass()))
	//*  38   67:aload_3         
	//*  39   68:iconst_0        
	//*  40   69:aaload          
	//*  41   70:aload           4
	//*  42   72:invokevirtual   #28  <Method Class Object.getClass()>
	//*  43   75:invokevirtual   #131 <Method boolean Class.isAssignableFrom(Class)>
	//*  44   78:ifne            275
		{
			s = ((String) (new StringBuilder()));
	//   45   81:new             #35  <Class StringBuilder>
	//   46   84:dup             
	//   47   85:invokespecial   #36  <Method void StringBuilder()>
	//   48   88:astore_1        
			((StringBuilder) (s)).append("A \"");
	//   49   89:aload_1         
	//   50   90:ldc1            #133 <String "A \"">
	//   51   92:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   52   95:pop             
			((StringBuilder) (s)).append(((Class) (method)).getName());
	//   53   96:aload_1         
	//   54   97:aload_2         
	//   55   98:invokevirtual   #124 <Method String Class.getName()>
	//   56  101:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   57  104:pop             
			((StringBuilder) (s)).append("\" object is not assignable to a \"");
	//   58  105:aload_1         
	//   59  106:ldc1            #135 <String "\" object is not assignable to a \"">
	//   60  108:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   61  111:pop             
			((StringBuilder) (s)).append(aclass[0].getName());
	//   62  112:aload_1         
	//   63  113:aload_3         
	//   64  114:iconst_0        
	//   65  115:aaload          
	//   66  116:invokevirtual   #124 <Method String Class.getName()>
	//   67  119:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   68  122:pop             
			((StringBuilder) (s)).append("\" variable.");
	//   69  123:aload_1         
	//   70  124:ldc1            #137 <String "\" variable.">
	//   71  126:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   72  129:pop             
			addError(((StringBuilder) (s)).toString());
	//   73  130:aload_0         
	//   74  131:aload_1         
	//   75  132:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   76  135:invokevirtual   #128 <Method void addError(String)>
			s = ((String) (new StringBuilder()));
	//   77  138:new             #35  <Class StringBuilder>
	//   78  141:dup             
	//   79  142:invokespecial   #36  <Method void StringBuilder()>
	//   80  145:astore_1        
			((StringBuilder) (s)).append("The class \"");
	//   81  146:aload_1         
	//   82  147:ldc1            #139 <String "The class \"">
	//   83  149:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   84  152:pop             
			((StringBuilder) (s)).append(aclass[0].getName());
	//   85  153:aload_1         
	//   86  154:aload_3         
	//   87  155:iconst_0        
	//   88  156:aaload          
	//   89  157:invokevirtual   #124 <Method String Class.getName()>
	//   90  160:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   91  163:pop             
			((StringBuilder) (s)).append("\" was loaded by ");
	//   92  164:aload_1         
	//   93  165:ldc1            #141 <String "\" was loaded by ">
	//   94  167:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   95  170:pop             
			addError(((StringBuilder) (s)).toString());
	//   96  171:aload_0         
	//   97  172:aload_1         
	//   98  173:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   99  176:invokevirtual   #128 <Method void addError(String)>
			s = ((String) (new StringBuilder()));
	//  100  179:new             #35  <Class StringBuilder>
	//  101  182:dup             
	//  102  183:invokespecial   #36  <Method void StringBuilder()>
	//  103  186:astore_1        
			((StringBuilder) (s)).append("[");
	//  104  187:aload_1         
	//  105  188:ldc1            #143 <String "[">
	//  106  190:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//  107  193:pop             
			((StringBuilder) (s)).append(((Object) (aclass[0].getClassLoader())));
	//  108  194:aload_1         
	//  109  195:aload_3         
	//  110  196:iconst_0        
	//  111  197:aaload          
	//  112  198:invokevirtual   #147 <Method ClassLoader Class.getClassLoader()>
	//  113  201:invokevirtual   #150 <Method StringBuilder StringBuilder.append(Object)>
	//  114  204:pop             
			((StringBuilder) (s)).append("] whereas object of type ");
	//  115  205:aload_1         
	//  116  206:ldc1            #152 <String "] whereas object of type ">
	//  117  208:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//  118  211:pop             
			addError(((StringBuilder) (s)).toString());
	//  119  212:aload_0         
	//  120  213:aload_1         
	//  121  214:invokevirtual   #56  <Method String StringBuilder.toString()>
	//  122  217:invokevirtual   #128 <Method void addError(String)>
			s = ((String) (new StringBuilder()));
	//  123  220:new             #35  <Class StringBuilder>
	//  124  223:dup             
	//  125  224:invokespecial   #36  <Method void StringBuilder()>
	//  126  227:astore_1        
			((StringBuilder) (s)).append("\"");
	//  127  228:aload_1         
	//  128  229:ldc1            #154 <String "\"">
	//  129  231:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//  130  234:pop             
			((StringBuilder) (s)).append(((Class) (method)).getName());
	//  131  235:aload_1         
	//  132  236:aload_2         
	//  133  237:invokevirtual   #124 <Method String Class.getName()>
	//  134  240:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//  135  243:pop             
			((StringBuilder) (s)).append("\" was loaded by [");
	//  136  244:aload_1         
	//  137  245:ldc1            #156 <String "\" was loaded by [">
	//  138  247:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//  139  250:pop             
			((StringBuilder) (s)).append(((Object) (((Class) (method)).getClassLoader())));
	//  140  251:aload_1         
	//  141  252:aload_2         
	//  142  253:invokevirtual   #147 <Method ClassLoader Class.getClassLoader()>
	//  143  256:invokevirtual   #150 <Method StringBuilder StringBuilder.append(Object)>
	//  144  259:pop             
			((StringBuilder) (s)).append("].");
	//  145  260:aload_1         
	//  146  261:ldc1            #158 <String "].">
	//  147  263:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//  148  266:pop             
			s = ((StringBuilder) (s)).toString();
	//  149  267:aload_1         
	//  150  268:invokevirtual   #56  <Method String StringBuilder.toString()>
	//  151  271:astore_1        
		} else
	//* 152  272:goto            60
		{
			return true;
	//  153  275:iconst_1        
	//  154  276:ireturn         
		}
		addError(s);
		return false;
	}

	private boolean isUnequivocallyInstantiable(Class class1)
	{
		if(class1.isInterface())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #168 <Method boolean Class.isInterface()>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		try
		{
			class1 = ((Class) (class1.newInstance()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #172 <Method Object Class.newInstance()>
	//    7   13:astore_1        
		}
	//*   8   14:aload_1         
	//*   9   15:ifnull          20
	//*  10   18:iconst_1        
	//*  11   19:ireturn         
	//*  12   20:iconst_0        
	//*  13   21:ireturn         
		// Misplaced declaration of an exception variable
		catch(Class class1)
	//*  14   22:astore_1        
		{
			return false;
	//   15   23:iconst_0        
	//   16   24:ireturn         
		}
		return class1 != null;
	}

	public void addBasicProperty(String s, String s1)
	{
		if(s1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		Object obj1 = ((Object) (capitalizeFirstLetter(s)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #84  <Method String capitalizeFirstLetter(String)>
	//    6   10:astore_3        
		Method method = findAdderMethod(((String) (obj1)));
	//    7   11:aload_0         
	//    8   12:aload_3         
	//    9   13:invokespecial   #179 <Method Method findAdderMethod(String)>
	//   10   16:astore          4
		if(method == null)
	//*  11   18:aload           4
	//*  12   20:ifnonnull       60
		{
			s = ((String) (new StringBuilder()));
	//   13   23:new             #35  <Class StringBuilder>
	//   14   26:dup             
	//   15   27:invokespecial   #36  <Method void StringBuilder()>
	//   16   30:astore_1        
			((StringBuilder) (s)).append("No adder for property [");
	//   17   31:aload_1         
	//   18   32:ldc1            #181 <String "No adder for property [">
	//   19   34:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
			((StringBuilder) (s)).append(((String) (obj1)));
	//   21   38:aload_1         
	//   22   39:aload_3         
	//   23   40:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   24   43:pop             
			((StringBuilder) (s)).append("].");
	//   25   44:aload_1         
	//   26   45:ldc1            #158 <String "].">
	//   27   47:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   28   50:pop             
			addError(((StringBuilder) (s)).toString());
	//   29   51:aload_0         
	//   30   52:aload_1         
	//   31   53:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   32   56:invokevirtual   #128 <Method void addError(String)>
			return;
	//   33   59:return          
		}
		s = ((String) (method.getParameterTypes()));
	//   34   60:aload           4
	//   35   62:invokevirtual   #111 <Method Class[] Method.getParameterTypes()>
	//   36   65:astore_1        
		isSanityCheckSuccessful(((String) (obj1)), method, ((Class []) (s)), ((Object) (s1)));
	//   37   66:aload_0         
	//   38   67:aload_3         
	//   39   68:aload           4
	//   40   70:aload_1         
	//   41   71:aload_2         
	//   42   72:invokespecial   #183 <Method boolean isSanityCheckSuccessful(String, Method, Class[], Object)>
	//   43   75:pop             
		try
		{
			obj1 = StringToObjectConverter.convertArg(((ch.qos.logback.core.spi.ContextAware) (this)), s1, ((Class) (s[0])));
	//   44   76:aload_0         
	//   45   77:aload_2         
	//   46   78:aload_1         
	//   47   79:iconst_0        
	//   48   80:aaload          
	//   49   81:invokestatic    #187 <Method Object StringToObjectConverter.convertArg(ch.qos.logback.core.spi.ContextAware, String, Class)>
	//   50   84:astore_3        
		}
	//*  51   85:aload_3         
	//*  52   86:ifnull          96
	//*  53   89:aload_0         
	//*  54   90:aload           4
	//*  55   92:aload_2         
	//*  56   93:invokevirtual   #191 <Method void invokeMethodWithSingleParameterOnThisObject(Method, Object)>
	//*  57   96:return          
		// Misplaced declaration of an exception variable
		catch(String s1)
	//*  58   97:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   59   98:new             #35  <Class StringBuilder>
	//   60  101:dup             
	//   61  102:invokespecial   #36  <Method void StringBuilder()>
	//   62  105:astore_3        
			stringbuilder.append("Conversion to type [");
	//   63  106:aload_3         
	//   64  107:ldc1            #193 <String "Conversion to type [">
	//   65  109:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   66  112:pop             
			stringbuilder.append(((Object) (s[0])));
	//   67  113:aload_3         
	//   68  114:aload_1         
	//   69  115:iconst_0        
	//   70  116:aaload          
	//   71  117:invokevirtual   #150 <Method StringBuilder StringBuilder.append(Object)>
	//   72  120:pop             
			stringbuilder.append("] failed. ");
	//   73  121:aload_3         
	//   74  122:ldc1            #195 <String "] failed. ">
	//   75  124:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   76  127:pop             
			addError(stringbuilder.toString(), ((Throwable) (s1)));
	//   77  128:aload_0         
	//   78  129:aload_3         
	//   79  130:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   80  133:aload_2         
	//   81  134:invokevirtual   #198 <Method void addError(String, Throwable)>
			return;
	//   82  137:return          
		}
		if(obj1 != null)
			invokeMethodWithSingleParameterOnThisObject(method, ((Object) (s1)));
	}

	public void addComplexProperty(String s, Object obj1)
	{
		Method method = findAdderMethod(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #179 <Method Method findAdderMethod(String)>
	//    3    5:astore_3        
		if(method != null)
	//*   4    6:aload_3         
	//*   5    7:ifnull          32
		{
			if(!isSanityCheckSuccessful(s, method, method.getParameterTypes(), obj1))
	//*   6   10:aload_0         
	//*   7   11:aload_1         
	//*   8   12:aload_3         
	//*   9   13:aload_3         
	//*  10   14:invokevirtual   #111 <Method Class[] Method.getParameterTypes()>
	//*  11   17:aload_2         
	//*  12   18:invokespecial   #183 <Method boolean isSanityCheckSuccessful(String, Method, Class[], Object)>
	//*  13   21:ifne            25
			{
				return;
	//   14   24:return          
			} else
			{
				invokeMethodWithSingleParameterOnThisObject(method, obj1);
	//   15   25:aload_0         
	//   16   26:aload_3         
	//   17   27:aload_2         
	//   18   28:invokevirtual   #191 <Method void invokeMethodWithSingleParameterOnThisObject(Method, Object)>
				return;
	//   19   31:return          
			}
		} else
		{
			obj1 = ((Object) (new StringBuilder()));
	//   20   32:new             #35  <Class StringBuilder>
	//   21   35:dup             
	//   22   36:invokespecial   #36  <Method void StringBuilder()>
	//   23   39:astore_2        
			((StringBuilder) (obj1)).append("Could not find method [add");
	//   24   40:aload_2         
	//   25   41:ldc1            #202 <String "Could not find method [add">
	//   26   43:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   27   46:pop             
			((StringBuilder) (obj1)).append(s);
	//   28   47:aload_2         
	//   29   48:aload_1         
	//   30   49:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   31   52:pop             
			((StringBuilder) (obj1)).append("] in class [");
	//   32   53:aload_2         
	//   33   54:ldc1            #204 <String "] in class [">
	//   34   56:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   35   59:pop             
			((StringBuilder) (obj1)).append(objClass.getName());
	//   36   60:aload_2         
	//   37   61:aload_0         
	//   38   62:getfield        #30  <Field Class objClass>
	//   39   65:invokevirtual   #124 <Method String Class.getName()>
	//   40   68:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   41   71:pop             
			((StringBuilder) (obj1)).append("].");
	//   42   72:aload_2         
	//   43   73:ldc1            #158 <String "].">
	//   44   75:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   45   78:pop             
			addError(((StringBuilder) (obj1)).toString());
	//   46   79:aload_0         
	//   47   80:aload_2         
	//   48   81:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   49   84:invokevirtual   #128 <Method void addError(String)>
			return;
	//   50   87:return          
		}
	}

	public AggregationType computeAggregationType(String s)
	{
		Object obj1 = ((Object) (findAdderMethod(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #179 <Method Method findAdderMethod(String)>
	//    3    5:astore_2        
		if(obj1 != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          67
		{
			obj1 = ((Object) (computeRawAggregationType(((Method) (obj1)))));
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #208 <Method AggregationType computeRawAggregationType(Method)>
	//    9   15:astore_2        
			static class _cls1
			{

				static final int $SwitchMap$ch$qos$logback$core$util$AggregationType[];

				static 
				{
					$SwitchMap$ch$qos$logback$core$util$AggregationType = new int[AggregationType.values().length];
				//    0    0:invokestatic    #18  <Method AggregationType[] AggregationType.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$util$AggregationType>
					try
					{
						$SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.NOT_FOUND.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$util$AggregationType>
				//    5   12:getstatic       #24  <Field AggregationType AggregationType.NOT_FOUND>
				//    6   15:invokevirtual   #28  <Method int AggregationType.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$util$AggregationType>
				//*  10   23:getstatic       #31  <Field AggregationType AggregationType.AS_BASIC_PROPERTY>
				//*  11   26:invokevirtual   #28  <Method int AggregationType.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$util$AggregationType>
				//*  15   34:getstatic       #34  <Field AggregationType AggregationType.AS_COMPLEX_PROPERTY>
				//*  16   37:invokevirtual   #28  <Method int AggregationType.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:return          
					catch(NoSuchFieldError nosuchfielderror) { }
				//   20   43:astore_0        
					try
					{
						$SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_BASIC_PROPERTY.ordinal()] = 2;
					}
				//*  21   44:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   22   47:astore_0        
					try
					{
						$SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_COMPLEX_PROPERTY.ordinal()] = 3;
					}
				//*  23   48:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   24   51:astore_0        
				//*  25   52:return          
				}
			}

			switch(_cls1..SwitchMap.ch.qos.logback.core.util.AggregationType[((AggregationType) (obj1)).ordinal()])
	//*  10   16:getstatic       #212 <Field int[] PropertySetter$1.$SwitchMap$ch$qos$logback$core$util$AggregationType>
	//*  11   19:aload_2         
	//*  12   20:invokevirtual   #216 <Method int AggregationType.ordinal()>
	//*  13   23:iaload          
			{
	//*  14   24:tableswitch     1 3: default 52
	//	               1 63
	//	               2 59
	//	               3 55
	//*  15   52:goto            67
			case 3: // '\003'
				return AggregationType.AS_COMPLEX_PROPERTY_COLLECTION;
	//   16   55:getstatic       #219 <Field AggregationType AggregationType.AS_COMPLEX_PROPERTY_COLLECTION>
	//   17   58:areturn         

			case 2: // '\002'
				return AggregationType.AS_BASIC_PROPERTY_COLLECTION;
	//   18   59:getstatic       #222 <Field AggregationType AggregationType.AS_BASIC_PROPERTY_COLLECTION>
	//   19   62:areturn         

			case 1: // '\001'
				return AggregationType.NOT_FOUND;
	//   20   63:getstatic       #68  <Field AggregationType AggregationType.NOT_FOUND>
	//   21   66:areturn         
			}
		}
		s = ((String) (findSetterMethod(s)));
	//   22   67:aload_0         
	//   23   68:aload_1         
	//   24   69:invokespecial   #224 <Method Method findSetterMethod(String)>
	//   25   72:astore_1        
		if(s != null)
	//*  26   73:aload_1         
	//*  27   74:ifnull          83
			return computeRawAggregationType(((Method) (s)));
	//   28   77:aload_0         
	//   29   78:aload_1         
	//   30   79:invokespecial   #208 <Method AggregationType computeRawAggregationType(Method)>
	//   31   82:areturn         
		else
			return AggregationType.NOT_FOUND;
	//   32   83:getstatic       #68  <Field AggregationType AggregationType.NOT_FOUND>
	//   33   86:areturn         
	}

	Annotation getAnnotation(String s, Class class1, Method method)
	{
		if(method != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          10
			return method.getAnnotation(class1);
	//    2    4:aload_3         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #229 <Method Annotation Method.getAnnotation(Class)>
	//    5    9:areturn         
		else
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
	}

	Class getByConcreteType(String s, Method method)
	{
		s = ((String) (getParameterClassForMethod(method)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #62  <Method Class getParameterClassForMethod(Method)>
	//    3    5:astore_1        
		if(s == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		if(isUnequivocallyInstantiable(((Class) (s))))
	//*   8   12:aload_0         
	//*   9   13:aload_1         
	//*  10   14:invokespecial   #234 <Method boolean isUnequivocallyInstantiable(Class)>
	//*  11   17:ifeq            22
			return ((Class) (s));
	//   12   20:aload_1         
	//   13   21:areturn         
		else
			return null;
	//   14   22:aconst_null     
	//   15   23:areturn         
	}

	public Class getClassNameViaImplicitRules(String s, AggregationType aggregationtype, DefaultNestedComponentRegistry defaultnestedcomponentregistry)
	{
		defaultnestedcomponentregistry = ((DefaultNestedComponentRegistry) (defaultnestedcomponentregistry.findDefaultComponentType(obj.getClass(), s)));
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field Object obj>
	//    3    5:invokevirtual   #28  <Method Class Object.getClass()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #243 <Method Class DefaultNestedComponentRegistry.findDefaultComponentType(Class, String)>
	//    6   12:astore_3        
		if(defaultnestedcomponentregistry != null)
	//*   7   13:aload_3         
	//*   8   14:ifnull          19
			return ((Class) (defaultnestedcomponentregistry));
	//    9   17:aload_3         
	//   10   18:areturn         
		aggregationtype = ((AggregationType) (getRelevantMethod(s, aggregationtype)));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:invokevirtual   #247 <Method Method getRelevantMethod(String, AggregationType)>
	//   15   25:astore_2        
		if(aggregationtype == null)
	//*  16   26:aload_2         
	//*  17   27:ifnonnull       32
			return null;
	//   18   30:aconst_null     
	//   19   31:areturn         
		defaultnestedcomponentregistry = ((DefaultNestedComponentRegistry) (getDefaultClassNameByAnnonation(s, ((Method) (aggregationtype)))));
	//   20   32:aload_0         
	//   21   33:aload_1         
	//   22   34:aload_2         
	//   23   35:invokevirtual   #250 <Method Class getDefaultClassNameByAnnonation(String, Method)>
	//   24   38:astore_3        
		if(defaultnestedcomponentregistry != null)
	//*  25   39:aload_3         
	//*  26   40:ifnull          45
			return ((Class) (defaultnestedcomponentregistry));
	//   27   43:aload_3         
	//   28   44:areturn         
		else
			return getByConcreteType(s, ((Method) (aggregationtype)));
	//   29   45:aload_0         
	//   30   46:aload_1         
	//   31   47:aload_2         
	//   32   48:invokevirtual   #252 <Method Class getByConcreteType(String, Method)>
	//   33   51:areturn         
	}

	Class getDefaultClassNameByAnnonation(String s, Method method)
	{
		s = ((String) ((DefaultClass)getAnnotation(s, ch/qos/logback/core/joran/spi/DefaultClass, method)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #255 <Class DefaultClass>
	//    3    4:aload_2         
	//    4    5:invokevirtual   #257 <Method Annotation getAnnotation(String, Class, Method)>
	//    5    8:checkcast       #255 <Class DefaultClass>
	//    6   11:astore_1        
		if(s != null)
	//*   7   12:aload_1         
	//*   8   13:ifnull          23
			return ((DefaultClass) (s)).value();
	//    9   16:aload_1         
	//   10   17:invokeinterface #260 <Method Class DefaultClass.value()>
	//   11   22:areturn         
		else
			return null;
	//   12   23:aconst_null     
	//   13   24:areturn         
	}

	protected Method getMethod(String s)
	{
		if(methodDescriptors == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #262 <Field MethodDescriptor[] methodDescriptors>
	//*   2    4:ifnonnull       11
			introspect();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #265 <Method void introspect()>
		for(int i = 0; i < methodDescriptors.length; i++)
	//*   5   11:iconst_0        
	//*   6   12:istore_2        
	//*   7   13:iload_2         
	//*   8   14:aload_0         
	//*   9   15:getfield        #262 <Field MethodDescriptor[] methodDescriptors>
	//*  10   18:arraylength     
	//*  11   19:icmpge          55
			if(s.equals(((Object) (methodDescriptors[i].getName()))))
	//*  12   22:aload_1         
	//*  13   23:aload_0         
	//*  14   24:getfield        #262 <Field MethodDescriptor[] methodDescriptors>
	//*  15   27:iload_2         
	//*  16   28:aaload          
	//*  17   29:invokevirtual   #268 <Method String MethodDescriptor.getName()>
	//*  18   32:invokevirtual   #272 <Method boolean String.equals(Object)>
	//*  19   35:ifeq            48
				return methodDescriptors[i].getMethod();
	//   20   38:aload_0         
	//   21   39:getfield        #262 <Field MethodDescriptor[] methodDescriptors>
	//   22   42:iload_2         
	//   23   43:aaload          
	//   24   44:invokevirtual   #274 <Method Method MethodDescriptor.getMethod()>
	//   25   47:areturn         

	//   26   48:iload_2         
	//   27   49:iconst_1        
	//   28   50:iadd            
	//   29   51:istore_2        
	//*  30   52:goto            13
		return null;
	//   31   55:aconst_null     
	//   32   56:areturn         
	}

	public Object getObj()
	{
		return obj;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object obj>
	//    2    4:areturn         
	}

	public Class getObjClass()
	{
		return objClass;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Class objClass>
	//    2    4:areturn         
	}

	protected PropertyDescriptor getPropertyDescriptor(String s)
	{
		if(propertyDescriptors == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #279 <Field PropertyDescriptor[] propertyDescriptors>
	//*   2    4:ifnonnull       11
			introspect();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #265 <Method void introspect()>
		for(int i = 0; i < propertyDescriptors.length; i++)
	//*   5   11:iconst_0        
	//*   6   12:istore_2        
	//*   7   13:iload_2         
	//*   8   14:aload_0         
	//*   9   15:getfield        #279 <Field PropertyDescriptor[] propertyDescriptors>
	//*  10   18:arraylength     
	//*  11   19:icmpge          52
			if(s.equals(((Object) (propertyDescriptors[i].getName()))))
	//*  12   22:aload_1         
	//*  13   23:aload_0         
	//*  14   24:getfield        #279 <Field PropertyDescriptor[] propertyDescriptors>
	//*  15   27:iload_2         
	//*  16   28:aaload          
	//*  17   29:invokevirtual   #280 <Method String PropertyDescriptor.getName()>
	//*  18   32:invokevirtual   #272 <Method boolean String.equals(Object)>
	//*  19   35:ifeq            45
				return propertyDescriptors[i];
	//   20   38:aload_0         
	//   21   39:getfield        #279 <Field PropertyDescriptor[] propertyDescriptors>
	//   22   42:iload_2         
	//   23   43:aaload          
	//   24   44:areturn         

	//   25   45:iload_2         
	//   26   46:iconst_1        
	//   27   47:iadd            
	//   28   48:istore_2        
	//*  29   49:goto            13
		return null;
	//   30   52:aconst_null     
	//   31   53:areturn         
	}

	Method getRelevantMethod(String s, AggregationType aggregationtype)
	{
		s = capitalizeFirstLetter(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #84  <Method String capitalizeFirstLetter(String)>
	//    3    5:astore_1        
		if(aggregationtype == AggregationType.AS_COMPLEX_PROPERTY_COLLECTION)
	//*   4    6:aload_2         
	//*   5    7:getstatic       #219 <Field AggregationType AggregationType.AS_COMPLEX_PROPERTY_COLLECTION>
	//*   6   10:if_acmpne       19
			return findAdderMethod(s);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #179 <Method Method findAdderMethod(String)>
	//   10   18:areturn         
		if(aggregationtype == AggregationType.AS_COMPLEX_PROPERTY)
	//*  11   19:aload_2         
	//*  12   20:getstatic       #80  <Field AggregationType AggregationType.AS_COMPLEX_PROPERTY>
	//*  13   23:if_acmpne       32
		{
			return findSetterMethod(s);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokespecial   #224 <Method Method findSetterMethod(String)>
	//   17   31:areturn         
		} else
		{
			s = ((String) (new StringBuilder()));
	//   18   32:new             #35  <Class StringBuilder>
	//   19   35:dup             
	//   20   36:invokespecial   #36  <Method void StringBuilder()>
	//   21   39:astore_1        
			((StringBuilder) (s)).append(((Object) (aggregationtype)));
	//   22   40:aload_1         
	//   23   41:aload_2         
	//   24   42:invokevirtual   #150 <Method StringBuilder StringBuilder.append(Object)>
	//   25   45:pop             
			((StringBuilder) (s)).append(" not allowed here");
	//   26   46:aload_1         
	//   27   47:ldc2            #282 <String " not allowed here">
	//   28   50:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
			throw new IllegalStateException(((StringBuilder) (s)).toString());
	//   30   54:new             #284 <Class IllegalStateException>
	//   31   57:dup             
	//   32   58:aload_1         
	//   33   59:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   34   62:invokespecial   #286 <Method void IllegalStateException(String)>
	//   35   65:athrow          
		}
	}

	protected void introspect()
	{
		try
		{
			propertyDescriptors = Introspector.getPropertyDescriptors(objClass);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #30  <Field Class objClass>
	//    3    5:invokestatic    #292 <Method PropertyDescriptor[] Introspector.getPropertyDescriptors(Class)>
	//    4    8:putfield        #279 <Field PropertyDescriptor[] propertyDescriptors>
			methodDescriptors = Introspector.getMethodDescriptors(objClass);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field Class objClass>
	//    8   16:invokestatic    #296 <Method MethodDescriptor[] Introspector.getMethodDescriptors(Class)>
	//    9   19:putfield        #262 <Field MethodDescriptor[] methodDescriptors>
			return;
	//   10   22:return          
		}
		catch(IntrospectionException introspectionexception)
	//*  11   23:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   12   24:new             #35  <Class StringBuilder>
	//   13   27:dup             
	//   14   28:invokespecial   #36  <Method void StringBuilder()>
	//   15   31:astore_2        
			stringbuilder.append("Failed to introspect ");
	//   16   32:aload_2         
	//   17   33:ldc2            #298 <String "Failed to introspect ">
	//   18   36:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
			stringbuilder.append(obj);
	//   20   40:aload_2         
	//   21   41:aload_0         
	//   22   42:getfield        #22  <Field Object obj>
	//   23   45:invokevirtual   #150 <Method StringBuilder StringBuilder.append(Object)>
	//   24   48:pop             
			stringbuilder.append(": ");
	//   25   49:aload_2         
	//   26   50:ldc2            #300 <String ": ">
	//   27   53:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
			stringbuilder.append(introspectionexception.getMessage());
	//   29   57:aload_2         
	//   30   58:aload_1         
	//   31   59:invokevirtual   #303 <Method String IntrospectionException.getMessage()>
	//   32   62:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   33   65:pop             
			addError(stringbuilder.toString());
	//   34   66:aload_0         
	//   35   67:aload_2         
	//   36   68:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   37   71:invokevirtual   #128 <Method void addError(String)>
			propertyDescriptors = new PropertyDescriptor[0];
	//   38   74:aload_0         
	//   39   75:iconst_0        
	//   40   76:anewarray       PropertyDescriptor[]
	//   41   79:putfield        #279 <Field PropertyDescriptor[] propertyDescriptors>
			methodDescriptors = new MethodDescriptor[0];
	//   42   82:aload_0         
	//   43   83:iconst_0        
	//   44   84:anewarray       MethodDescriptor[]
	//   45   87:putfield        #262 <Field MethodDescriptor[] methodDescriptors>
			return;
	//   46   90:return          
		}
	}

	void invokeMethodWithSingleParameterOnThisObject(Method method, Object obj1)
	{
		Class class1 = obj1.getClass();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #28  <Method Class Object.getClass()>
	//    2    4:astore_3        
		try
		{
			method.invoke(obj, new Object[] {
				obj1
			});
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #22  <Field Object obj>
	//    6   10:iconst_1        
	//    7   11:anewarray       Object[]
	//    8   14:dup             
	//    9   15:iconst_0        
	//   10   16:aload_2         
	//   11   17:aastore         
	//   12   18:invokevirtual   #309 <Method Object Method.invoke(Object, Object[])>
	//   13   21:pop             
			return;
	//   14   22:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj1)
	//*  15   23:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   16   24:new             #35  <Class StringBuilder>
	//   17   27:dup             
	//   18   28:invokespecial   #36  <Method void StringBuilder()>
	//   19   31:astore          4
			stringbuilder.append("Could not invoke method ");
	//   20   33:aload           4
	//   21   35:ldc2            #311 <String "Could not invoke method ">
	//   22   38:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   23   41:pop             
			stringbuilder.append(method.getName());
	//   24   42:aload           4
	//   25   44:aload_1         
	//   26   45:invokevirtual   #312 <Method String Method.getName()>
	//   27   48:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   28   51:pop             
			stringbuilder.append(" in class ");
	//   29   52:aload           4
	//   30   54:ldc2            #314 <String " in class ">
	//   31   57:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   32   60:pop             
			stringbuilder.append(obj.getClass().getName());
	//   33   61:aload           4
	//   34   63:aload_0         
	//   35   64:getfield        #22  <Field Object obj>
	//   36   67:invokevirtual   #28  <Method Class Object.getClass()>
	//   37   70:invokevirtual   #124 <Method String Class.getName()>
	//   38   73:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   39   76:pop             
			stringbuilder.append(" with parameter of type ");
	//   40   77:aload           4
	//   41   79:ldc2            #316 <String " with parameter of type ">
	//   42   82:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   43   85:pop             
			stringbuilder.append(class1.getName());
	//   44   86:aload           4
	//   45   88:aload_3         
	//   46   89:invokevirtual   #124 <Method String Class.getName()>
	//   47   92:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   48   95:pop             
			addError(stringbuilder.toString(), ((Throwable) (obj1)));
	//   49   96:aload_0         
	//   50   97:aload           4
	//   51   99:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   52  102:aload_2         
	//   53  103:invokevirtual   #198 <Method void addError(String, Throwable)>
			return;
	//   54  106:return          
		}
	}

	public void setComplexProperty(String s, Object obj1)
	{
		Object obj2 = ((Object) (getPropertyDescriptor(Introspector.decapitalize(s))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #95  <Method String Introspector.decapitalize(String)>
	//    3    5:invokevirtual   #99  <Method PropertyDescriptor getPropertyDescriptor(String)>
	//    4    8:astore_3        
		if(obj2 != null) goto _L2; else goto _L1
	//    5    9:aload_3         
	//    6   10:ifnonnull       65
_L1:
		obj1 = ((Object) (new StringBuilder()));
	//    7   13:new             #35  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #36  <Method void StringBuilder()>
	//   10   20:astore_2        
		((StringBuilder) (obj1)).append("Could not find PropertyDescriptor for [");
	//   11   21:aload_2         
	//   12   22:ldc2            #319 <String "Could not find PropertyDescriptor for [">
	//   13   25:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
		((StringBuilder) (obj1)).append(s);
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		((StringBuilder) (obj1)).append("] in ");
	//   19   35:aload_2         
	//   20   36:ldc1            #119 <String "] in ">
	//   21   38:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
		s = ((String) (objClass));
	//   23   42:aload_0         
	//   24   43:getfield        #30  <Field Class objClass>
	//   25   46:astore_1        
_L4:
		((StringBuilder) (obj1)).append(((Class) (s)).getName());
	//   26   47:aload_2         
	//   27   48:aload_1         
	//   28   49:invokevirtual   #124 <Method String Class.getName()>
	//   29   52:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		addWarn(((StringBuilder) (obj1)).toString());
	//   31   56:aload_0         
	//   32   57:aload_2         
	//   33   58:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   34   61:invokevirtual   #322 <Method void addWarn(String)>
		return;
	//   35   64:return          
_L2:
		obj2 = ((Object) (((PropertyDescriptor) (obj2)).getWriteMethod()));
	//   36   65:aload_3         
	//   37   66:invokevirtual   #105 <Method Method PropertyDescriptor.getWriteMethod()>
	//   38   69:astore_3        
		if(obj2 != null)
			break; /* Loop/switch isn't completed */
	//   39   70:aload_3         
	//   40   71:ifnonnull       114
		obj1 = ((Object) (new StringBuilder()));
	//   41   74:new             #35  <Class StringBuilder>
	//   42   77:dup             
	//   43   78:invokespecial   #36  <Method void StringBuilder()>
	//   44   81:astore_2        
		((StringBuilder) (obj1)).append("Not setter method for property [");
	//   45   82:aload_2         
	//   46   83:ldc2            #324 <String "Not setter method for property [">
	//   47   86:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   48   89:pop             
		((StringBuilder) (obj1)).append(s);
	//   49   90:aload_2         
	//   50   91:aload_1         
	//   51   92:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   52   95:pop             
		((StringBuilder) (obj1)).append("] in ");
	//   53   96:aload_2         
	//   54   97:ldc1            #119 <String "] in ">
	//   55   99:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   56  102:pop             
		s = ((String) (obj.getClass()));
	//   57  103:aload_0         
	//   58  104:getfield        #22  <Field Object obj>
	//   59  107:invokevirtual   #28  <Method Class Object.getClass()>
	//   60  110:astore_1        
		if(true) goto _L4; else goto _L3
	//   61  111:goto            47
_L3:
		if(!isSanityCheckSuccessful(s, ((Method) (obj2)), ((Method) (obj2)).getParameterTypes(), obj1))
	//*  62  114:aload_0         
	//*  63  115:aload_1         
	//*  64  116:aload_3         
	//*  65  117:aload_3         
	//*  66  118:invokevirtual   #111 <Method Class[] Method.getParameterTypes()>
	//*  67  121:aload_2         
	//*  68  122:invokespecial   #183 <Method boolean isSanityCheckSuccessful(String, Method, Class[], Object)>
	//*  69  125:ifne            129
			return;
	//   70  128:return          
		try
		{
			invokeMethodWithSingleParameterOnThisObject(((Method) (obj2)), obj1);
	//   71  129:aload_0         
	//   72  130:aload_3         
	//   73  131:aload_2         
	//   74  132:invokevirtual   #191 <Method void invokeMethodWithSingleParameterOnThisObject(Method, Object)>
			return;
	//   75  135:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  76  136:astore_1        
		{
			obj1 = ((Object) (new StringBuilder()));
	//   77  137:new             #35  <Class StringBuilder>
	//   78  140:dup             
	//   79  141:invokespecial   #36  <Method void StringBuilder()>
	//   80  144:astore_2        
		}
		((StringBuilder) (obj1)).append("Could not set component ");
	//   81  145:aload_2         
	//   82  146:ldc2            #326 <String "Could not set component ">
	//   83  149:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   84  152:pop             
		((StringBuilder) (obj1)).append(obj);
	//   85  153:aload_2         
	//   86  154:aload_0         
	//   87  155:getfield        #22  <Field Object obj>
	//   88  158:invokevirtual   #150 <Method StringBuilder StringBuilder.append(Object)>
	//   89  161:pop             
		((StringBuilder) (obj1)).append(" for parent component ");
	//   90  162:aload_2         
	//   91  163:ldc2            #328 <String " for parent component ">
	//   92  166:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   93  169:pop             
		((StringBuilder) (obj1)).append(obj);
	//   94  170:aload_2         
	//   95  171:aload_0         
	//   96  172:getfield        #22  <Field Object obj>
	//   97  175:invokevirtual   #150 <Method StringBuilder StringBuilder.append(Object)>
	//   98  178:pop             
		addError(((StringBuilder) (obj1)).toString(), ((Throwable) (s)));
	//   99  179:aload_0         
	//  100  180:aload_2         
	//  101  181:invokevirtual   #56  <Method String StringBuilder.toString()>
	//  102  184:aload_1         
	//  103  185:invokevirtual   #198 <Method void addError(String, Throwable)>
		return;
	//  104  188:return          
	}

	public void setProperty(PropertyDescriptor propertydescriptor, String s, String s1)
	{
		Method method = propertydescriptor.getWriteMethod();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #105 <Method Method PropertyDescriptor.getWriteMethod()>
	//    2    4:astore          4
		if(method == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       52
		{
			propertydescriptor = ((PropertyDescriptor) (new StringBuilder()));
	//    5   11:new             #35  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #36  <Method void StringBuilder()>
	//    8   18:astore_1        
			((StringBuilder) (propertydescriptor)).append("No setter for property [");
	//    9   19:aload_1         
	//   10   20:ldc2            #332 <String "No setter for property [">
	//   11   23:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
			((StringBuilder) (propertydescriptor)).append(s);
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			((StringBuilder) (propertydescriptor)).append("].");
	//   17   33:aload_1         
	//   18   34:ldc1            #158 <String "].">
	//   19   36:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			throw new PropertySetterException(((StringBuilder) (propertydescriptor)).toString());
	//   21   40:new             #334 <Class PropertySetterException>
	//   22   43:dup             
	//   23   44:aload_1         
	//   24   45:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   25   48:invokespecial   #335 <Method void PropertySetterException(String)>
	//   26   51:athrow          
		}
		propertydescriptor = ((PropertyDescriptor) (method.getParameterTypes()));
	//   27   52:aload           4
	//   28   54:invokevirtual   #111 <Method Class[] Method.getParameterTypes()>
	//   29   57:astore_1        
		if(propertydescriptor.length != 1)
	//*  30   58:aload_1         
	//*  31   59:arraylength     
	//*  32   60:iconst_1        
	//*  33   61:icmpeq          75
			throw new PropertySetterException("#params for setter != 1");
	//   34   64:new             #334 <Class PropertySetterException>
	//   35   67:dup             
	//   36   68:ldc2            #337 <String "#params for setter != 1">
	//   37   71:invokespecial   #335 <Method void PropertySetterException(String)>
	//   38   74:athrow          
		try
		{
			s = ((String) (StringToObjectConverter.convertArg(((ch.qos.logback.core.spi.ContextAware) (this)), s1, ((Class) (propertydescriptor[0])))));
	//   39   75:aload_0         
	//   40   76:aload_3         
	//   41   77:aload_1         
	//   42   78:iconst_0        
	//   43   79:aaload          
	//   44   80:invokestatic    #187 <Method Object StringToObjectConverter.convertArg(ch.qos.logback.core.spi.ContextAware, String, Class)>
	//   45   83:astore_2        
		}
	//*  46   84:aload_2         
	//*  47   85:ifnonnull       131
	//*  48   88:new             #35  <Class StringBuilder>
	//*  49   91:dup             
	//*  50   92:invokespecial   #36  <Method void StringBuilder()>
	//*  51   95:astore_2        
	//*  52   96:aload_2         
	//*  53   97:ldc1            #193 <String "Conversion to type [">
	//*  54   99:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//*  55  102:pop             
	//*  56  103:aload_2         
	//*  57  104:aload_1         
	//*  58  105:iconst_0        
	//*  59  106:aaload          
	//*  60  107:invokevirtual   #150 <Method StringBuilder StringBuilder.append(Object)>
	//*  61  110:pop             
	//*  62  111:aload_2         
	//*  63  112:ldc2            #339 <String "] failed.">
	//*  64  115:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//*  65  118:pop             
	//*  66  119:new             #334 <Class PropertySetterException>
	//*  67  122:dup             
	//*  68  123:aload_2         
	//*  69  124:invokevirtual   #56  <Method String StringBuilder.toString()>
	//*  70  127:invokespecial   #335 <Method void PropertySetterException(String)>
	//*  71  130:athrow          
	//*  72  131:aload           4
	//*  73  133:aload_0         
	//*  74  134:getfield        #22  <Field Object obj>
	//*  75  137:iconst_1        
	//*  76  138:anewarray       Object[]
	//*  77  141:dup             
	//*  78  142:iconst_0        
	//*  79  143:aload_2         
	//*  80  144:aastore         
	//*  81  145:invokevirtual   #309 <Method Object Method.invoke(Object, Object[])>
	//*  82  148:pop             
	//*  83  149:return          
	//*  84  150:astore_1        
	//*  85  151:new             #334 <Class PropertySetterException>
	//*  86  154:dup             
	//*  87  155:aload_1         
	//*  88  156:invokespecial   #342 <Method void PropertySetterException(Throwable)>
	//*  89  159:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  90  160:astore_2        
		{
			s1 = ((String) (new StringBuilder()));
	//   91  161:new             #35  <Class StringBuilder>
	//   92  164:dup             
	//   93  165:invokespecial   #36  <Method void StringBuilder()>
	//   94  168:astore_3        
			((StringBuilder) (s1)).append("Conversion to type [");
	//   95  169:aload_3         
	//   96  170:ldc1            #193 <String "Conversion to type [">
	//   97  172:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   98  175:pop             
			((StringBuilder) (s1)).append(((Object) (propertydescriptor[0])));
	//   99  176:aload_3         
	//  100  177:aload_1         
	//  101  178:iconst_0        
	//  102  179:aaload          
	//  103  180:invokevirtual   #150 <Method StringBuilder StringBuilder.append(Object)>
	//  104  183:pop             
			((StringBuilder) (s1)).append("] failed. ");
	//  105  184:aload_3         
	//  106  185:ldc1            #195 <String "] failed. ">
	//  107  187:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//  108  190:pop             
			throw new PropertySetterException(((StringBuilder) (s1)).toString(), ((Throwable) (s)));
	//  109  191:new             #334 <Class PropertySetterException>
	//  110  194:dup             
	//  111  195:aload_3         
	//  112  196:invokevirtual   #56  <Method String StringBuilder.toString()>
	//  113  199:aload_2         
	//  114  200:invokespecial   #344 <Method void PropertySetterException(String, Throwable)>
	//  115  203:athrow          
		}
		if(s == null)
		{
			s = ((String) (new StringBuilder()));
			((StringBuilder) (s)).append("Conversion to type [");
			((StringBuilder) (s)).append(((Object) (propertydescriptor[0])));
			((StringBuilder) (s)).append("] failed.");
			throw new PropertySetterException(((StringBuilder) (s)).toString());
		}
		try
		{
			method.invoke(obj, new Object[] {
				s
			});
			return;
		}
		// Misplaced declaration of an exception variable
		catch(PropertyDescriptor propertydescriptor)
		{
			throw new PropertySetterException(((Throwable) (propertydescriptor)));
		}
	}

	public void setProperty(String s, String s1)
	{
		if(s1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		s = Introspector.decapitalize(s);
	//    3    5:aload_1         
	//    4    6:invokestatic    #95  <Method String Introspector.decapitalize(String)>
	//    5    9:astore_1        
		PropertyDescriptor propertydescriptor = getPropertyDescriptor(s);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #99  <Method PropertyDescriptor getPropertyDescriptor(String)>
	//    9   15:astore_3        
		if(propertydescriptor == null)
	//*  10   16:aload_3         
	//*  11   17:ifnonnull       78
		{
			s1 = ((String) (new StringBuilder()));
	//   12   20:new             #35  <Class StringBuilder>
	//   13   23:dup             
	//   14   24:invokespecial   #36  <Method void StringBuilder()>
	//   15   27:astore_2        
			((StringBuilder) (s1)).append("No such property [");
	//   16   28:aload_2         
	//   17   29:ldc2            #346 <String "No such property [">
	//   18   32:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
			((StringBuilder) (s1)).append(s);
	//   20   36:aload_2         
	//   21   37:aload_1         
	//   22   38:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   23   41:pop             
			((StringBuilder) (s1)).append("] in ");
	//   24   42:aload_2         
	//   25   43:ldc1            #119 <String "] in ">
	//   26   45:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   27   48:pop             
			((StringBuilder) (s1)).append(objClass.getName());
	//   28   49:aload_2         
	//   29   50:aload_0         
	//   30   51:getfield        #30  <Field Class objClass>
	//   31   54:invokevirtual   #124 <Method String Class.getName()>
	//   32   57:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   33   60:pop             
			((StringBuilder) (s1)).append(".");
	//   34   61:aload_2         
	//   35   62:ldc2            #348 <String ".">
	//   36   65:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   37   68:pop             
			addWarn(((StringBuilder) (s1)).toString());
	//   38   69:aload_0         
	//   39   70:aload_2         
	//   40   71:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   41   74:invokevirtual   #322 <Method void addWarn(String)>
			return;
	//   42   77:return          
		}
		try
		{
			setProperty(propertydescriptor, s, s1);
	//   43   78:aload_0         
	//   44   79:aload_3         
	//   45   80:aload_1         
	//   46   81:aload_2         
	//   47   82:invokevirtual   #350 <Method void setProperty(PropertyDescriptor, String, String)>
			return;
	//   48   85:return          
		}
		catch(PropertySetterException propertysetterexception)
	//*  49   86:astore_3        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   50   87:new             #35  <Class StringBuilder>
	//   51   90:dup             
	//   52   91:invokespecial   #36  <Method void StringBuilder()>
	//   53   94:astore          4
			stringbuilder.append("Failed to set property [");
	//   54   96:aload           4
	//   55   98:ldc2            #352 <String "Failed to set property [">
	//   56  101:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   57  104:pop             
			stringbuilder.append(s);
	//   58  105:aload           4
	//   59  107:aload_1         
	//   60  108:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   61  111:pop             
			stringbuilder.append("] to value \"");
	//   62  112:aload           4
	//   63  114:ldc2            #354 <String "] to value \"">
	//   64  117:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   65  120:pop             
			stringbuilder.append(s1);
	//   66  121:aload           4
	//   67  123:aload_2         
	//   68  124:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   69  127:pop             
			stringbuilder.append("\". ");
	//   70  128:aload           4
	//   71  130:ldc2            #356 <String "\". ">
	//   72  133:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   73  136:pop             
			addWarn(stringbuilder.toString(), ((Throwable) (propertysetterexception)));
	//   74  137:aload_0         
	//   75  138:aload           4
	//   76  140:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   77  143:aload_3         
	//   78  144:invokevirtual   #358 <Method void addWarn(String, Throwable)>
			return;
	//   79  147:return          
		}
	}

	protected MethodDescriptor methodDescriptors[];
	protected Object obj;
	protected Class objClass;
	protected PropertyDescriptor propertyDescriptors[];
}
