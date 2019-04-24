// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.util;

import ch.qos.logback.core.spi.ContextAware;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public class StringToObjectConverter
{

	public StringToObjectConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	public static boolean canBeBuiltFromSimpleString(Class class1)
	{
		Package package1 = class1.getPackage();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method Package Class.getPackage()>
	//    2    4:astore_1        
		if(class1.isPrimitive())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #29  <Method boolean Class.isPrimitive()>
	//*   5    9:ifeq            14
			return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
		if(package1 != null && "java.lang".equals(((Object) (package1.getName()))))
	//*   8   14:aload_1         
	//*   9   15:ifnull          32
	//*  10   18:ldc1            #31  <String "java.lang">
	//*  11   20:aload_1         
	//*  12   21:invokevirtual   #37  <Method String Package.getName()>
	//*  13   24:invokevirtual   #41  <Method boolean String.equals(Object)>
	//*  14   27:ifeq            32
			return true;
	//   15   30:iconst_1        
	//   16   31:ireturn         
		if(followsTheValueOfConvention(class1))
	//*  17   32:aload_0         
	//*  18   33:invokestatic    #44  <Method boolean followsTheValueOfConvention(Class)>
	//*  19   36:ifeq            41
			return true;
	//   20   39:iconst_1        
	//   21   40:ireturn         
		if(class1.isEnum())
	//*  22   41:aload_0         
	//*  23   42:invokevirtual   #47  <Method boolean Class.isEnum()>
	//*  24   45:ifeq            50
			return true;
	//   25   48:iconst_1        
	//   26   49:ireturn         
		return isOfTypeCharset(class1);
	//   27   50:aload_0         
	//   28   51:invokestatic    #50  <Method boolean isOfTypeCharset(Class)>
	//   29   54:ifeq            59
	//   30   57:iconst_1        
	//   31   58:ireturn         
	//   32   59:iconst_0        
	//   33   60:ireturn         
	}

	public static Object convertArg(ContextAware contextaware, String s, Class class1)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		String s1 = s.trim();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #57  <Method String String.trim()>
	//    6   10:astore_3        
		if(((Class) (java/lang/String)).isAssignableFrom(class1))
	//*   7   11:ldc1            #13  <Class String>
	//*   8   13:aload_2         
	//*   9   14:invokevirtual   #60  <Method boolean Class.isAssignableFrom(Class)>
	//*  10   17:ifeq            22
			return ((Object) (s1));
	//   11   20:aload_3         
	//   12   21:areturn         
		if(Integer.TYPE.isAssignableFrom(class1))
	//*  13   22:getstatic       #66  <Field Class Integer.TYPE>
	//*  14   25:aload_2         
	//*  15   26:invokevirtual   #60  <Method boolean Class.isAssignableFrom(Class)>
	//*  16   29:ifeq            41
			return ((Object) (new Integer(s1)));
	//   17   32:new             #62  <Class Integer>
	//   18   35:dup             
	//   19   36:aload_3         
	//   20   37:invokespecial   #69  <Method void Integer(String)>
	//   21   40:areturn         
		if(Long.TYPE.isAssignableFrom(class1))
	//*  22   41:getstatic       #72  <Field Class Long.TYPE>
	//*  23   44:aload_2         
	//*  24   45:invokevirtual   #60  <Method boolean Class.isAssignableFrom(Class)>
	//*  25   48:ifeq            60
			return ((Object) (new Long(s1)));
	//   26   51:new             #71  <Class Long>
	//   27   54:dup             
	//   28   55:aload_3         
	//   29   56:invokespecial   #73  <Method void Long(String)>
	//   30   59:areturn         
		if(Float.TYPE.isAssignableFrom(class1))
	//*  31   60:getstatic       #76  <Field Class Float.TYPE>
	//*  32   63:aload_2         
	//*  33   64:invokevirtual   #60  <Method boolean Class.isAssignableFrom(Class)>
	//*  34   67:ifeq            79
			return ((Object) (new Float(s1)));
	//   35   70:new             #75  <Class Float>
	//   36   73:dup             
	//   37   74:aload_3         
	//   38   75:invokespecial   #77  <Method void Float(String)>
	//   39   78:areturn         
		if(Double.TYPE.isAssignableFrom(class1))
	//*  40   79:getstatic       #80  <Field Class Double.TYPE>
	//*  41   82:aload_2         
	//*  42   83:invokevirtual   #60  <Method boolean Class.isAssignableFrom(Class)>
	//*  43   86:ifeq            98
			return ((Object) (new Double(s1)));
	//   44   89:new             #79  <Class Double>
	//   45   92:dup             
	//   46   93:aload_3         
	//   47   94:invokespecial   #81  <Method void Double(String)>
	//   48   97:areturn         
		if(Boolean.TYPE.isAssignableFrom(class1))
	//*  49   98:getstatic       #84  <Field Class Boolean.TYPE>
	//*  50  101:aload_2         
	//*  51  102:invokevirtual   #60  <Method boolean Class.isAssignableFrom(Class)>
	//*  52  105:ifeq            134
		{
			if("true".equalsIgnoreCase(s1))
	//*  53  108:ldc1            #86  <String "true">
	//*  54  110:aload_3         
	//*  55  111:invokevirtual   #90  <Method boolean String.equalsIgnoreCase(String)>
	//*  56  114:ifeq            121
				return ((Object) (Boolean.TRUE));
	//   57  117:getstatic       #94  <Field Boolean Boolean.TRUE>
	//   58  120:areturn         
			if("false".equalsIgnoreCase(s1))
	//*  59  121:ldc1            #96  <String "false">
	//*  60  123:aload_3         
	//*  61  124:invokevirtual   #90  <Method boolean String.equalsIgnoreCase(String)>
	//*  62  127:ifeq            175
				return ((Object) (Boolean.FALSE));
	//   63  130:getstatic       #99  <Field Boolean Boolean.FALSE>
	//   64  133:areturn         
		} else
		{
			if(class1.isEnum())
	//*  65  134:aload_2         
	//*  66  135:invokevirtual   #47  <Method boolean Class.isEnum()>
	//*  67  138:ifeq            148
				return convertToEnum(contextaware, s1, class1);
	//   68  141:aload_0         
	//   69  142:aload_3         
	//   70  143:aload_2         
	//   71  144:invokestatic    #102 <Method Object convertToEnum(ContextAware, String, Class)>
	//   72  147:areturn         
			if(followsTheValueOfConvention(class1))
	//*  73  148:aload_2         
	//*  74  149:invokestatic    #44  <Method boolean followsTheValueOfConvention(Class)>
	//*  75  152:ifeq            162
				return convertByValueOfMethod(contextaware, class1, s1);
	//   76  155:aload_0         
	//   77  156:aload_2         
	//   78  157:aload_3         
	//   79  158:invokestatic    #106 <Method Object convertByValueOfMethod(ContextAware, Class, String)>
	//   80  161:areturn         
			if(isOfTypeCharset(class1))
	//*  81  162:aload_2         
	//*  82  163:invokestatic    #50  <Method boolean isOfTypeCharset(Class)>
	//*  83  166:ifeq            175
				return ((Object) (convertToCharset(contextaware, s)));
	//   84  169:aload_0         
	//   85  170:aload_1         
	//   86  171:invokestatic    #110 <Method Charset convertToCharset(ContextAware, String)>
	//   87  174:areturn         
		}
		return ((Object) (null));
	//   88  175:aconst_null     
	//   89  176:areturn         
	}

	private static Object convertByValueOfMethod(ContextAware contextaware, Class class1, String s)
	{
		Exception exception;
		Object obj;
		try
		{
			obj = class1.getMethod("valueOf", STING_CLASS_PARAMETER).invoke(((Object) (null)), new Object[] {
				s
			});
	//    0    0:aload_1         
	//    1    1:ldc1            #115 <String "valueOf">
	//    2    3:getstatic       #15  <Field Class[] STING_CLASS_PARAMETER>
	//    3    6:invokevirtual   #119 <Method Method Class.getMethod(String, Class[])>
	//    4    9:aconst_null     
	//    5   10:iconst_1        
	//    6   11:anewarray       Object[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_2         
	//   10   17:aastore         
	//   11   18:invokevirtual   #125 <Method Object Method.invoke(Object, Object[])>
	//   12   21:astore_3        
		}
	//*  13   22:aload_3         
	//*  14   23:areturn         
	//*  15   24:new             #127 <Class StringBuilder>
	//*  16   27:dup             
	//*  17   28:invokespecial   #128 <Method void StringBuilder()>
	//*  18   31:astore_3        
	//*  19   32:aload_3         
	//*  20   33:ldc1            #130 <String "Failed to invoke valueOf{} method in class [">
	//*  21   35:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//*  22   38:pop             
	//*  23   39:aload_3         
	//*  24   40:aload_1         
	//*  25   41:invokevirtual   #135 <Method String Class.getName()>
	//*  26   44:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//*  27   47:pop             
	//*  28   48:aload_3         
	//*  29   49:ldc1            #137 <String "] with value [">
	//*  30   51:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//*  31   54:pop             
	//*  32   55:aload_3         
	//*  33   56:aload_2         
	//*  34   57:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//*  35   60:pop             
	//*  36   61:aload_3         
	//*  37   62:ldc1            #139 <String "]">
	//*  38   64:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//*  39   67:pop             
	//*  40   68:aload_0         
	//*  41   69:aload_3         
	//*  42   70:invokevirtual   #142 <Method String StringBuilder.toString()>
	//*  43   73:invokeinterface #147 <Method void ContextAware.addError(String)>
	//*  44   78:aconst_null     
	//*  45   79:areturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("Failed to invoke valueOf{} method in class [");
			((StringBuilder) (obj)).append(class1.getName());
			((StringBuilder) (obj)).append("] with value [");
			((StringBuilder) (obj)).append(s);
			((StringBuilder) (obj)).append("]");
			contextaware.addError(((StringBuilder) (obj)).toString());
			return ((Object) (null));
		}
		return obj;
	//*  46   80:astore_3        
	//*  47   81:goto            24
	}

	private static Charset convertToCharset(ContextAware contextaware, String s)
	{
		Charset charset;
		try
		{
			charset = Charset.forName(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #156 <Method Charset Charset.forName(String)>
	//    2    4:astore_2        
		}
	//*   3    5:aload_2         
	//*   4    6:areturn         
		catch(UnsupportedCharsetException unsupportedcharsetexception)
	//*   5    7:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6    8:new             #127 <Class StringBuilder>
	//    7   11:dup             
	//    8   12:invokespecial   #128 <Method void StringBuilder()>
	//    9   15:astore_3        
			stringbuilder.append("Failed to get charset [");
	//   10   16:aload_3         
	//   11   17:ldc1            #158 <String "Failed to get charset [">
	//   12   19:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   13   22:pop             
			stringbuilder.append(s);
	//   14   23:aload_3         
	//   15   24:aload_1         
	//   16   25:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   17   28:pop             
			stringbuilder.append("]");
	//   18   29:aload_3         
	//   19   30:ldc1            #139 <String "]">
	//   20   32:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   21   35:pop             
			contextaware.addError(stringbuilder.toString(), ((Throwable) (unsupportedcharsetexception)));
	//   22   36:aload_0         
	//   23   37:aload_3         
	//   24   38:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   25   41:aload_2         
	//   26   42:invokeinterface #161 <Method void ContextAware.addError(String, Throwable)>
			return null;
	//   27   47:aconst_null     
	//   28   48:areturn         
		}
		return charset;
	}

	private static Object convertToEnum(ContextAware contextaware, String s, Class class1)
	{
		return ((Object) (Enum.valueOf(class1, s)));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokestatic    #166 <Method Enum Enum.valueOf(Class, String)>
	//    3    5:areturn         
	}

	private static boolean followsTheValueOfConvention(Class class1)
	{
		boolean flag = Modifier.isStatic(class1.getMethod("valueOf", STING_CLASS_PARAMETER).getModifiers());
	//    0    0:aload_0         
	//    1    1:ldc1            #115 <String "valueOf">
	//    2    3:getstatic       #15  <Field Class[] STING_CLASS_PARAMETER>
	//    3    6:invokevirtual   #119 <Method Method Class.getMethod(String, Class[])>
	//    4    9:invokevirtual   #175 <Method int Method.getModifiers()>
	//    5   12:invokestatic    #181 <Method boolean Modifier.isStatic(int)>
	//    6   15:istore_1        
		if(flag)
	//*   7   16:iload_1         
	//*   8   17:ifeq            22
			return true;
	//    9   20:iconst_1        
	//   10   21:ireturn         
_L2:
		return false;
	//   11   22:iconst_0        
	//   12   23:ireturn         
		class1;
	//   13   24:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  14   25:goto            22
	}

	private static boolean isOfTypeCharset(Class class1)
	{
		return ((Class) (java/nio/charset/Charset)).isAssignableFrom(class1);
	//    0    0:ldc1            #152 <Class Charset>
	//    1    2:aload_0         
	//    2    3:invokevirtual   #60  <Method boolean Class.isAssignableFrom(Class)>
	//    3    6:ireturn         
	}

	boolean isBuildableFromSimpleString()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private static final Class STING_CLASS_PARAMETER[] = {
		java/lang/String
	};

	static 
	{
	//    0    0:iconst_1        
	//    1    1:anewarray       Class[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #13  <Class String>
	//    5    8:aastore         
	//    6    9:putstatic       #15  <Field Class[] STING_CLASS_PARAMETER>
	//*   7   12:return          
	}
}
