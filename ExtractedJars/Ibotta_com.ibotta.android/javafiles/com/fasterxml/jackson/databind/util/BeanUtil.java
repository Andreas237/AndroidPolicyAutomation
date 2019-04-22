// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			ClassUtil

public class BeanUtil
{

	public static Object getDefaultValue(JavaType javatype)
	{
		Class class1 = javatype.getRawClass();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #12  <Method Class JavaType.getRawClass()>
	//    2    4:astore_1        
		Class class2 = ClassUtil.primitiveType(class1);
	//    3    5:aload_1         
	//    4    6:invokestatic    #18  <Method Class ClassUtil.primitiveType(Class)>
	//    5    9:astore_2        
		if(class2 != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			return ClassUtil.defaultValue(class2);
	//    8   14:aload_2         
	//    9   15:invokestatic    #22  <Method Object ClassUtil.defaultValue(Class)>
	//   10   18:areturn         
		if(!javatype.isContainerType() && !javatype.isReferenceType())
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #26  <Method boolean JavaType.isContainerType()>
	//*  13   23:ifne            89
	//*  14   26:aload_0         
	//*  15   27:invokevirtual   #29  <Method boolean JavaType.isReferenceType()>
	//*  16   30:ifeq            36
	//*  17   33:goto            89
		{
			if(class1 == java/lang/String)
	//*  18   36:aload_1         
	//*  19   37:ldc1            #31  <Class String>
	//*  20   39:if_acmpne       45
				return ((Object) (""));
	//   21   42:ldc1            #33  <String "">
	//   22   44:areturn         
			if(javatype.isTypeOrSubTypeOf(java/util/Date))
	//*  23   45:aload_0         
	//*  24   46:ldc1            #35  <Class Date>
	//*  25   48:invokevirtual   #39  <Method boolean JavaType.isTypeOrSubTypeOf(Class)>
	//*  26   51:ifeq            63
				return ((Object) (new Date(0L)));
	//   27   54:new             #35  <Class Date>
	//   28   57:dup             
	//   29   58:lconst_0        
	//   30   59:invokespecial   #43  <Method void Date(long)>
	//   31   62:areturn         
			if(javatype.isTypeOrSubTypeOf(java/util/Calendar))
	//*  32   63:aload_0         
	//*  33   64:ldc1            #45  <Class Calendar>
	//*  34   66:invokevirtual   #39  <Method boolean JavaType.isTypeOrSubTypeOf(Class)>
	//*  35   69:ifeq            87
			{
				javatype = ((JavaType) (new GregorianCalendar()));
	//   36   72:new             #47  <Class GregorianCalendar>
	//   37   75:dup             
	//   38   76:invokespecial   #50  <Method void GregorianCalendar()>
	//   39   79:astore_0        
				((Calendar) (javatype)).setTimeInMillis(0L);
	//   40   80:aload_0         
	//   41   81:lconst_0        
	//   42   82:invokevirtual   #53  <Method void Calendar.setTimeInMillis(long)>
				return ((Object) (javatype));
	//   43   85:aload_0         
	//   44   86:areturn         
			} else
			{
				return ((Object) (null));
	//   45   87:aconst_null     
	//   46   88:areturn         
			}
		} else
		{
			return ((Object) (com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY));
	//   47   89:getstatic       #59  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_EMPTY>
	//   48   92:areturn         
		}
	}

	protected static boolean isCglibGetCallbacks(AnnotatedMethod annotatedmethod)
	{
		annotatedmethod = ((AnnotatedMethod) (annotatedmethod.getRawType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method Class AnnotatedMethod.getRawType()>
	//    2    4:astore_0        
		boolean flag1 = ((Class) (annotatedmethod)).isArray();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #72  <Method boolean Class.isArray()>
	//    5    9:istore_2        
		boolean flag = false;
	//    6   10:iconst_0        
	//    7   11:istore_1        
		if(flag1)
	//*   8   12:iload_2         
	//*   9   13:ifeq            68
		{
			annotatedmethod = ((AnnotatedMethod) (ClassUtil.getPackageName(((Class) (annotatedmethod)).getComponentType())));
	//   10   16:aload_0         
	//   11   17:invokevirtual   #75  <Method Class Class.getComponentType()>
	//   12   20:invokestatic    #79  <Method String ClassUtil.getPackageName(Class)>
	//   13   23:astore_0        
			if(annotatedmethod != null && ((String) (annotatedmethod)).contains(".cglib"))
	//*  14   24:aload_0         
	//*  15   25:ifnull          68
	//*  16   28:aload_0         
	//*  17   29:ldc1            #81  <String ".cglib">
	//*  18   31:invokevirtual   #85  <Method boolean String.contains(CharSequence)>
	//*  19   34:ifeq            68
			{
				if(((String) (annotatedmethod)).startsWith("net.sf.cglib") || ((String) (annotatedmethod)).startsWith("org.hibernate.repackage.cglib") || ((String) (annotatedmethod)).startsWith("org.springframework.cglib"))
	//*  20   37:aload_0         
	//*  21   38:ldc1            #87  <String "net.sf.cglib">
	//*  22   40:invokevirtual   #91  <Method boolean String.startsWith(String)>
	//*  23   43:ifne            64
	//*  24   46:aload_0         
	//*  25   47:ldc1            #93  <String "org.hibernate.repackage.cglib">
	//*  26   49:invokevirtual   #91  <Method boolean String.startsWith(String)>
	//*  27   52:ifne            64
	//*  28   55:aload_0         
	//*  29   56:ldc1            #95  <String "org.springframework.cglib">
	//*  30   58:invokevirtual   #91  <Method boolean String.startsWith(String)>
	//*  31   61:ifeq            66
					flag = true;
	//   32   64:iconst_1        
	//   33   65:istore_1        
				return flag;
	//   34   66:iload_1         
	//   35   67:ireturn         
			}
		}
		return false;
	//   36   68:iconst_0        
	//   37   69:ireturn         
	}

	protected static boolean isGroovyMetaClassGetter(AnnotatedMethod annotatedmethod)
	{
		annotatedmethod = ((AnnotatedMethod) (ClassUtil.getPackageName(annotatedmethod.getRawType())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method Class AnnotatedMethod.getRawType()>
	//    2    4:invokestatic    #79  <Method String ClassUtil.getPackageName(Class)>
	//    3    7:astore_0        
		return annotatedmethod != null && ((String) (annotatedmethod)).startsWith("groovy.lang");
	//    4    8:aload_0         
	//    5    9:ifnull          23
	//    6   12:aload_0         
	//    7   13:ldc1            #98  <String "groovy.lang">
	//    8   15:invokevirtual   #91  <Method boolean String.startsWith(String)>
	//    9   18:ifeq            23
	//   10   21:iconst_1        
	//   11   22:ireturn         
	//   12   23:iconst_0        
	//   13   24:ireturn         
	}

	protected static String legacyManglePropertyName(String s, int i)
	{
		int j = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #104 <Method int String.length()>
	//    2    4:istore          4
		if(j == i)
	//*   3    6:iload           4
	//*   4    8:iload_1         
	//*   5    9:icmpne          14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		char c = s.charAt(i);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #108 <Method char String.charAt(int)>
	//   11   19:istore_2        
		char c2 = Character.toLowerCase(c);
	//   12   20:iload_2         
	//   13   21:invokestatic    #114 <Method char Character.toLowerCase(char)>
	//   14   24:istore_3        
		if(c == c2)
	//*  15   25:iload_2         
	//*  16   26:iload_3         
	//*  17   27:icmpne          36
			return s.substring(i);
	//   18   30:aload_0         
	//   19   31:iload_1         
	//   20   32:invokevirtual   #118 <Method String String.substring(int)>
	//   21   35:areturn         
		StringBuilder stringbuilder = new StringBuilder(j - i);
	//   22   36:new             #120 <Class StringBuilder>
	//   23   39:dup             
	//   24   40:iload           4
	//   25   42:iload_1         
	//   26   43:isub            
	//   27   44:invokespecial   #123 <Method void StringBuilder(int)>
	//   28   47:astore          5
		stringbuilder.append(c2);
	//   29   49:aload           5
	//   30   51:iload_3         
	//   31   52:invokevirtual   #127 <Method StringBuilder StringBuilder.append(char)>
	//   32   55:pop             
		i++;
	//   33   56:iload_1         
	//   34   57:iconst_1        
	//   35   58:iadd            
	//   36   59:istore_1        
		do
		{
			if(i >= j)
				break;
	//   37   60:iload_1         
	//   38   61:iload           4
	//   39   63:icmpge          109
			char c1 = s.charAt(i);
	//   40   66:aload_0         
	//   41   67:iload_1         
	//   42   68:invokevirtual   #108 <Method char String.charAt(int)>
	//   43   71:istore_2        
			char c3 = Character.toLowerCase(c1);
	//   44   72:iload_2         
	//   45   73:invokestatic    #114 <Method char Character.toLowerCase(char)>
	//   46   76:istore_3        
			if(c1 == c3)
	//*  47   77:iload_2         
	//*  48   78:iload_3         
	//*  49   79:icmpne          95
			{
				stringbuilder.append(((CharSequence) (s)), i, j);
	//   50   82:aload           5
	//   51   84:aload_0         
	//   52   85:iload_1         
	//   53   86:iload           4
	//   54   88:invokevirtual   #130 <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   55   91:pop             
				break;
	//   56   92:goto            109
			}
			stringbuilder.append(c3);
	//   57   95:aload           5
	//   58   97:iload_3         
	//   59   98:invokevirtual   #127 <Method StringBuilder StringBuilder.append(char)>
	//   60  101:pop             
			i++;
	//   61  102:iload_1         
	//   62  103:iconst_1        
	//   63  104:iadd            
	//   64  105:istore_1        
		} while(true);
	//   65  106:goto            60
		return stringbuilder.toString();
	//   66  109:aload           5
	//   67  111:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   68  114:areturn         
	}

	public static String okNameForGetter(AnnotatedMethod annotatedmethod, boolean flag)
	{
		String s2 = annotatedmethod.getName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #139 <Method String AnnotatedMethod.getName()>
	//    2    4:astore          4
		String s1 = okNameForIsGetter(annotatedmethod, s2, flag);
	//    3    6:aload_0         
	//    4    7:aload           4
	//    5    9:iload_1         
	//    6   10:invokestatic    #143 <Method String okNameForIsGetter(AnnotatedMethod, String, boolean)>
	//    7   13:astore_3        
		String s = s1;
	//    8   14:aload_3         
	//    9   15:astore_2        
		if(s1 == null)
	//*  10   16:aload_3         
	//*  11   17:ifnonnull       28
			s = okNameForRegularGetter(annotatedmethod, s2, flag);
	//   12   20:aload_0         
	//   13   21:aload           4
	//   14   23:iload_1         
	//   15   24:invokestatic    #146 <Method String okNameForRegularGetter(AnnotatedMethod, String, boolean)>
	//   16   27:astore_2        
		return s;
	//   17   28:aload_2         
	//   18   29:areturn         
	}

	public static String okNameForIsGetter(AnnotatedMethod annotatedmethod, String s, boolean flag)
	{
		if(s.startsWith("is"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #148 <String "is">
	//*   2    3:invokevirtual   #91  <Method boolean String.startsWith(String)>
	//*   3    6:ifeq            43
		{
			annotatedmethod = ((AnnotatedMethod) (annotatedmethod.getRawType()));
	//    4    9:aload_0         
	//    5   10:invokevirtual   #67  <Method Class AnnotatedMethod.getRawType()>
	//    6   13:astore_0        
			if(annotatedmethod == java/lang/Boolean || annotatedmethod == Boolean.TYPE)
	//*   7   14:aload_0         
	//*   8   15:ldc1            #150 <Class Boolean>
	//*   9   17:if_acmpeq       27
	//*  10   20:aload_0         
	//*  11   21:getstatic       #154 <Field Class Boolean.TYPE>
	//*  12   24:if_acmpne       43
				if(flag)
	//*  13   27:iload_2         
	//*  14   28:ifeq            37
					return stdManglePropertyName(s, 2);
	//   15   31:aload_1         
	//   16   32:iconst_2        
	//   17   33:invokestatic    #157 <Method String stdManglePropertyName(String, int)>
	//   18   36:areturn         
				else
					return legacyManglePropertyName(s, 2);
	//   19   37:aload_1         
	//   20   38:iconst_2        
	//   21   39:invokestatic    #159 <Method String legacyManglePropertyName(String, int)>
	//   22   42:areturn         
		}
		return null;
	//   23   43:aconst_null     
	//   24   44:areturn         
	}

	public static String okNameForMutator(AnnotatedMethod annotatedmethod, String s, boolean flag)
	{
		annotatedmethod = ((AnnotatedMethod) (annotatedmethod.getName()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #139 <Method String AnnotatedMethod.getName()>
	//    2    4:astore_0        
		if(((String) (annotatedmethod)).startsWith(s))
	//*   3    5:aload_0         
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #91  <Method boolean String.startsWith(String)>
	//*   6   10:ifeq            35
		{
			if(flag)
	//*   7   13:iload_2         
	//*   8   14:ifeq            26
				return stdManglePropertyName(((String) (annotatedmethod)), s.length());
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #104 <Method int String.length()>
	//   12   22:invokestatic    #157 <Method String stdManglePropertyName(String, int)>
	//   13   25:areturn         
			else
				return legacyManglePropertyName(((String) (annotatedmethod)), s.length());
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #104 <Method int String.length()>
	//   17   31:invokestatic    #159 <Method String legacyManglePropertyName(String, int)>
	//   18   34:areturn         
		} else
		{
			return null;
	//   19   35:aconst_null     
	//   20   36:areturn         
		}
	}

	public static String okNameForRegularGetter(AnnotatedMethod annotatedmethod, String s, boolean flag)
	{
		if(s.startsWith("get"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #162 <String "get">
	//*   2    3:invokevirtual   #91  <Method boolean String.startsWith(String)>
	//*   3    6:ifeq            61
		{
			if("getCallbacks".equals(((Object) (s))))
	//*   4    9:ldc1            #164 <String "getCallbacks">
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #168 <Method boolean String.equals(Object)>
	//*   7   15:ifeq            27
			{
				if(isCglibGetCallbacks(annotatedmethod))
	//*   8   18:aload_0         
	//*   9   19:invokestatic    #170 <Method boolean isCglibGetCallbacks(AnnotatedMethod)>
	//*  10   22:ifeq            45
					return null;
	//   11   25:aconst_null     
	//   12   26:areturn         
			} else
			if("getMetaClass".equals(((Object) (s))) && isGroovyMetaClassGetter(annotatedmethod))
	//*  13   27:ldc1            #172 <String "getMetaClass">
	//*  14   29:aload_1         
	//*  15   30:invokevirtual   #168 <Method boolean String.equals(Object)>
	//*  16   33:ifeq            45
	//*  17   36:aload_0         
	//*  18   37:invokestatic    #174 <Method boolean isGroovyMetaClassGetter(AnnotatedMethod)>
	//*  19   40:ifeq            45
				return null;
	//   20   43:aconst_null     
	//   21   44:areturn         
			if(flag)
	//*  22   45:iload_2         
	//*  23   46:ifeq            55
				return stdManglePropertyName(s, 3);
	//   24   49:aload_1         
	//   25   50:iconst_3        
	//   26   51:invokestatic    #157 <Method String stdManglePropertyName(String, int)>
	//   27   54:areturn         
			else
				return legacyManglePropertyName(s, 3);
	//   28   55:aload_1         
	//   29   56:iconst_3        
	//   30   57:invokestatic    #159 <Method String legacyManglePropertyName(String, int)>
	//   31   60:areturn         
		} else
		{
			return null;
	//   32   61:aconst_null     
	//   33   62:areturn         
		}
	}

	protected static String stdManglePropertyName(String s, int i)
	{
		int j = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #104 <Method int String.length()>
	//    2    4:istore          4
		if(j == i)
	//*   3    6:iload           4
	//*   4    8:iload_1         
	//*   5    9:icmpne          14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		char c = s.charAt(i);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #108 <Method char String.charAt(int)>
	//   11   19:istore_2        
		char c1 = Character.toLowerCase(c);
	//   12   20:iload_2         
	//   13   21:invokestatic    #114 <Method char Character.toLowerCase(char)>
	//   14   24:istore_3        
		if(c == c1)
	//*  15   25:iload_2         
	//*  16   26:iload_3         
	//*  17   27:icmpne          36
			return s.substring(i);
	//   18   30:aload_0         
	//   19   31:iload_1         
	//   20   32:invokevirtual   #118 <Method String String.substring(int)>
	//   21   35:areturn         
		int k = i + 1;
	//   22   36:iload_1         
	//   23   37:iconst_1        
	//   24   38:iadd            
	//   25   39:istore          5
		if(k < j && Character.isUpperCase(s.charAt(k)))
	//*  26   41:iload           5
	//*  27   43:iload           4
	//*  28   45:icmpge          66
	//*  29   48:aload_0         
	//*  30   49:iload           5
	//*  31   51:invokevirtual   #108 <Method char String.charAt(int)>
	//*  32   54:invokestatic    #178 <Method boolean Character.isUpperCase(char)>
	//*  33   57:ifeq            66
		{
			return s.substring(i);
	//   34   60:aload_0         
	//   35   61:iload_1         
	//   36   62:invokevirtual   #118 <Method String String.substring(int)>
	//   37   65:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(j - i);
	//   38   66:new             #120 <Class StringBuilder>
	//   39   69:dup             
	//   40   70:iload           4
	//   41   72:iload_1         
	//   42   73:isub            
	//   43   74:invokespecial   #123 <Method void StringBuilder(int)>
	//   44   77:astore          6
			stringbuilder.append(c1);
	//   45   79:aload           6
	//   46   81:iload_3         
	//   47   82:invokevirtual   #127 <Method StringBuilder StringBuilder.append(char)>
	//   48   85:pop             
			stringbuilder.append(((CharSequence) (s)), k, j);
	//   49   86:aload           6
	//   50   88:aload_0         
	//   51   89:iload           5
	//   52   91:iload           4
	//   53   93:invokevirtual   #130 <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   54   96:pop             
			return stringbuilder.toString();
	//   55   97:aload           6
	//   56   99:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   57  102:areturn         
		}
	}
}
