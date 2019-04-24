// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			ClassUtil

public class BeanUtil
{

	public BeanUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	protected static boolean isCglibGetCallbacks(AnnotatedMethod annotatedmethod)
	{
		annotatedmethod = ((AnnotatedMethod) (annotatedmethod.getRawType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method Class AnnotatedMethod.getRawType()>
	//    2    4:astore_0        
		if(annotatedmethod != null && ((Class) (annotatedmethod)).isArray())
	//*   3    5:aload_0         
	//*   4    6:ifnull          16
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #23  <Method boolean Class.isArray()>
	//*   7   13:ifne            18
	//*   8   16:iconst_0        
	//*   9   17:ireturn         
	//*  10   18:aload_0         
	//*  11   19:invokevirtual   #26  <Method Class Class.getComponentType()>
	//*  12   22:invokestatic    #32  <Method String ClassUtil.getPackageName(Class)>
	//*  13   25:astore_0        
			if((annotatedmethod = ((AnnotatedMethod) (ClassUtil.getPackageName(((Class) (annotatedmethod)).getComponentType())))) != null && ((String) (annotatedmethod)).contains(".cglib") && (((String) (annotatedmethod)).startsWith("net.sf.cglib") || ((String) (annotatedmethod)).startsWith("org.hibernate.repackage.cglib") || ((String) (annotatedmethod)).startsWith("org.springframework.cglib")))
	//*  14   26:aload_0         
	//*  15   27:ifnull          16
	//*  16   30:aload_0         
	//*  17   31:ldc1            #34  <String ".cglib">
	//*  18   33:invokevirtual   #40  <Method boolean String.contains(CharSequence)>
	//*  19   36:ifeq            16
	//*  20   39:aload_0         
	//*  21   40:ldc1            #42  <String "net.sf.cglib">
	//*  22   42:invokevirtual   #46  <Method boolean String.startsWith(String)>
	//*  23   45:ifne            66
	//*  24   48:aload_0         
	//*  25   49:ldc1            #48  <String "org.hibernate.repackage.cglib">
	//*  26   51:invokevirtual   #46  <Method boolean String.startsWith(String)>
	//*  27   54:ifne            66
	//*  28   57:aload_0         
	//*  29   58:ldc1            #50  <String "org.springframework.cglib">
	//*  30   60:invokevirtual   #46  <Method boolean String.startsWith(String)>
	//*  31   63:ifeq            16
				return true;
	//   32   66:iconst_1        
	//   33   67:ireturn         
		return false;
	}

	protected static boolean isGroovyMetaClassGetter(AnnotatedMethod annotatedmethod)
	{
		annotatedmethod = ((AnnotatedMethod) (annotatedmethod.getRawType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method Class AnnotatedMethod.getRawType()>
	//    2    4:astore_0        
		if(annotatedmethod != null && !((Class) (annotatedmethod)).isArray())
	//*   3    5:aload_0         
	//*   4    6:ifnull          16
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #23  <Method boolean Class.isArray()>
	//*   7   13:ifeq            18
	//*   8   16:iconst_0        
	//*   9   17:ireturn         
	//*  10   18:aload_0         
	//*  11   19:invokestatic    #32  <Method String ClassUtil.getPackageName(Class)>
	//*  12   22:astore_0        
			if((annotatedmethod = ((AnnotatedMethod) (ClassUtil.getPackageName(((Class) (annotatedmethod)))))) != null && ((String) (annotatedmethod)).startsWith("groovy.lang"))
	//*  13   23:aload_0         
	//*  14   24:ifnull          16
	//*  15   27:aload_0         
	//*  16   28:ldc1            #53  <String "groovy.lang">
	//*  17   30:invokevirtual   #46  <Method boolean String.startsWith(String)>
	//*  18   33:ifeq            16
				return true;
	//   19   36:iconst_1        
	//   20   37:ireturn         
		return false;
	}

	protected static boolean isGroovyMetaClassSetter(AnnotatedMethod annotatedmethod)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		annotatedmethod = ((AnnotatedMethod) (ClassUtil.getPackageName(annotatedmethod.getRawParameterType(0))));
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #58  <Method Class AnnotatedMethod.getRawParameterType(int)>
	//    5    7:invokestatic    #32  <Method String ClassUtil.getPackageName(Class)>
	//    6   10:astore_0        
		boolean flag = flag1;
	//    7   11:iload_2         
	//    8   12:istore_1        
		if(annotatedmethod != null)
	//*   9   13:aload_0         
	//*  10   14:ifnull          30
		{
			flag = flag1;
	//   11   17:iload_2         
	//   12   18:istore_1        
			if(((String) (annotatedmethod)).startsWith("groovy.lang"))
	//*  13   19:aload_0         
	//*  14   20:ldc1            #53  <String "groovy.lang">
	//*  15   22:invokevirtual   #46  <Method boolean String.startsWith(String)>
	//*  16   25:ifeq            30
				flag = true;
	//   17   28:iconst_1        
	//   18   29:istore_1        
		}
		return flag;
	//   19   30:iload_1         
	//   20   31:ireturn         
	}

	protected static String legacyManglePropertyName(String s, int i)
	{
		int j = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method int String.length()>
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
	//   10   16:invokevirtual   #68  <Method char String.charAt(int)>
	//   11   19:istore_2        
		char c2 = Character.toLowerCase(c);
	//   12   20:iload_2         
	//   13   21:invokestatic    #74  <Method char Character.toLowerCase(char)>
	//   14   24:istore_3        
		if(c == c2)
	//*  15   25:iload_2         
	//*  16   26:iload_3         
	//*  17   27:icmpne          36
			return s.substring(i);
	//   18   30:aload_0         
	//   19   31:iload_1         
	//   20   32:invokevirtual   #78  <Method String String.substring(int)>
	//   21   35:areturn         
		StringBuilder stringbuilder = new StringBuilder(j - i);
	//   22   36:new             #80  <Class StringBuilder>
	//   23   39:dup             
	//   24   40:iload           4
	//   25   42:iload_1         
	//   26   43:isub            
	//   27   44:invokespecial   #83  <Method void StringBuilder(int)>
	//   28   47:astore          5
		stringbuilder.append(c2);
	//   29   49:aload           5
	//   30   51:iload_3         
	//   31   52:invokevirtual   #87  <Method StringBuilder StringBuilder.append(char)>
	//   32   55:pop             
		i++;
	//   33   56:iload_1         
	//   34   57:iconst_1        
	//   35   58:iadd            
	//   36   59:istore_1        
		do
		{
			char c3;
label0:
			{
				if(i < j)
	//*  37   60:iload_1         
	//*  38   61:iload           4
	//*  39   63:icmpge          92
				{
					char c1 = s.charAt(i);
	//   40   66:aload_0         
	//   41   67:iload_1         
	//   42   68:invokevirtual   #68  <Method char String.charAt(int)>
	//   43   71:istore_2        
					c3 = Character.toLowerCase(c1);
	//   44   72:iload_2         
	//   45   73:invokestatic    #74  <Method char Character.toLowerCase(char)>
	//   46   76:istore_3        
					if(c1 != c3)
						break label0;
	//   47   77:iload_2         
	//   48   78:iload_3         
	//   49   79:icmpne          98
					stringbuilder.append(((CharSequence) (s)), i, j);
	//   50   82:aload           5
	//   51   84:aload_0         
	//   52   85:iload_1         
	//   53   86:iload           4
	//   54   88:invokevirtual   #90  <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   55   91:pop             
				}
				return stringbuilder.toString();
	//   56   92:aload           5
	//   57   94:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   58   97:areturn         
			}
			stringbuilder.append(c3);
	//   59   98:aload           5
	//   60  100:iload_3         
	//   61  101:invokevirtual   #87  <Method StringBuilder StringBuilder.append(char)>
	//   62  104:pop             
			i++;
	//   63  105:iload_1         
	//   64  106:iconst_1        
	//   65  107:iadd            
	//   66  108:istore_1        
		} while(true);
	//   67  109:goto            60
	}

	public static String okNameForGetter(AnnotatedMethod annotatedmethod)
	{
		return okNameForGetter(annotatedmethod, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #100 <Method String okNameForGetter(AnnotatedMethod, boolean)>
	//    3    5:areturn         
	}

	public static String okNameForGetter(AnnotatedMethod annotatedmethod, boolean flag)
	{
		String s2 = annotatedmethod.getName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #104 <Method String AnnotatedMethod.getName()>
	//    2    4:astore          4
		String s1 = okNameForIsGetter(annotatedmethod, s2, flag);
	//    3    6:aload_0         
	//    4    7:aload           4
	//    5    9:iload_1         
	//    6   10:invokestatic    #108 <Method String okNameForIsGetter(AnnotatedMethod, String, boolean)>
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
	//   15   24:invokestatic    #111 <Method String okNameForRegularGetter(AnnotatedMethod, String, boolean)>
	//   16   27:astore_2        
		return s;
	//   17   28:aload_2         
	//   18   29:areturn         
	}

	public static String okNameForIsGetter(AnnotatedMethod annotatedmethod, String s)
	{
		return okNameForIsGetter(annotatedmethod, s, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #108 <Method String okNameForIsGetter(AnnotatedMethod, String, boolean)>
	//    4    6:areturn         
	}

	public static String okNameForIsGetter(AnnotatedMethod annotatedmethod, String s, boolean flag)
	{
		if(s.startsWith("is"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #114 <String "is">
	//*   2    3:invokevirtual   #46  <Method boolean String.startsWith(String)>
	//*   3    6:ifeq            43
		{
			annotatedmethod = ((AnnotatedMethod) (annotatedmethod.getRawType()));
	//    4    9:aload_0         
	//    5   10:invokevirtual   #17  <Method Class AnnotatedMethod.getRawType()>
	//    6   13:astore_0        
			if(annotatedmethod == java/lang/Boolean || annotatedmethod == Boolean.TYPE)
	//*   7   14:aload_0         
	//*   8   15:ldc1            #116 <Class Boolean>
	//*   9   17:if_acmpeq       27
	//*  10   20:aload_0         
	//*  11   21:getstatic       #120 <Field Class Boolean.TYPE>
	//*  12   24:if_acmpne       43
				if(flag)
	//*  13   27:iload_2         
	//*  14   28:ifeq            37
					return stdManglePropertyName(s, 2);
	//   15   31:aload_1         
	//   16   32:iconst_2        
	//   17   33:invokestatic    #123 <Method String stdManglePropertyName(String, int)>
	//   18   36:areturn         
				else
					return legacyManglePropertyName(s, 2);
	//   19   37:aload_1         
	//   20   38:iconst_2        
	//   21   39:invokestatic    #125 <Method String legacyManglePropertyName(String, int)>
	//   22   42:areturn         
		}
		return null;
	//   23   43:aconst_null     
	//   24   44:areturn         
	}

	public static String okNameForMutator(AnnotatedMethod annotatedmethod, String s)
	{
		return okNameForMutator(annotatedmethod, s, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #128 <Method String okNameForMutator(AnnotatedMethod, String, boolean)>
	//    4    6:areturn         
	}

	public static String okNameForMutator(AnnotatedMethod annotatedmethod, String s, boolean flag)
	{
		annotatedmethod = ((AnnotatedMethod) (annotatedmethod.getName()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #104 <Method String AnnotatedMethod.getName()>
	//    2    4:astore_0        
		if(((String) (annotatedmethod)).startsWith(s))
	//*   3    5:aload_0         
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #46  <Method boolean String.startsWith(String)>
	//*   6   10:ifeq            35
		{
			if(flag)
	//*   7   13:iload_2         
	//*   8   14:ifeq            26
				return stdManglePropertyName(((String) (annotatedmethod)), s.length());
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #64  <Method int String.length()>
	//   12   22:invokestatic    #123 <Method String stdManglePropertyName(String, int)>
	//   13   25:areturn         
			else
				return legacyManglePropertyName(((String) (annotatedmethod)), s.length());
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #64  <Method int String.length()>
	//   17   31:invokestatic    #125 <Method String legacyManglePropertyName(String, int)>
	//   18   34:areturn         
		} else
		{
			return null;
	//   19   35:aconst_null     
	//   20   36:areturn         
		}
	}

	public static String okNameForRegularGetter(AnnotatedMethod annotatedmethod, String s)
	{
		return okNameForRegularGetter(annotatedmethod, s, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #111 <Method String okNameForRegularGetter(AnnotatedMethod, String, boolean)>
	//    4    6:areturn         
	}

	public static String okNameForRegularGetter(AnnotatedMethod annotatedmethod, String s, boolean flag)
	{
		if(!s.startsWith("get") || ("getCallbacks".equals(((Object) (s))) ? isCglibGetCallbacks(annotatedmethod) : "getMetaClass".equals(((Object) (s))) && isGroovyMetaClassGetter(annotatedmethod)))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #130 <String "get">
	//*   2    3:invokevirtual   #46  <Method boolean String.startsWith(String)>
	//*   3    6:ifeq            25
	//*   4    9:ldc1            #132 <String "getCallbacks">
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #136 <Method boolean String.equals(Object)>
	//*   7   15:ifeq            27
	//*   8   18:aload_0         
	//*   9   19:invokestatic    #138 <Method boolean isCglibGetCallbacks(AnnotatedMethod)>
	//*  10   22:ifeq            43
			return null;
	//   11   25:aconst_null     
	//   12   26:areturn         
	//   13   27:ldc1            #140 <String "getMetaClass">
	//   14   29:aload_1         
	//   15   30:invokevirtual   #136 <Method boolean String.equals(Object)>
	//   16   33:ifeq            43
	//   17   36:aload_0         
	//   18   37:invokestatic    #142 <Method boolean isGroovyMetaClassGetter(AnnotatedMethod)>
	//   19   40:ifne            25
		if(flag)
	//*  20   43:iload_2         
	//*  21   44:ifeq            53
			return stdManglePropertyName(s, 3);
	//   22   47:aload_1         
	//   23   48:iconst_3        
	//   24   49:invokestatic    #123 <Method String stdManglePropertyName(String, int)>
	//   25   52:areturn         
		else
			return legacyManglePropertyName(s, 3);
	//   26   53:aload_1         
	//   27   54:iconst_3        
	//   28   55:invokestatic    #125 <Method String legacyManglePropertyName(String, int)>
	//   29   58:areturn         
	}

	public static String okNameForSetter(AnnotatedMethod annotatedmethod)
	{
		return okNameForSetter(annotatedmethod, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #145 <Method String okNameForSetter(AnnotatedMethod, boolean)>
	//    3    5:areturn         
	}

	public static String okNameForSetter(AnnotatedMethod annotatedmethod, boolean flag)
	{
		String s = okNameForMutator(annotatedmethod, "set", flag);
	//    0    0:aload_0         
	//    1    1:ldc1            #147 <String "set">
	//    2    3:iload_1         
	//    3    4:invokestatic    #128 <Method String okNameForMutator(AnnotatedMethod, String, boolean)>
	//    4    7:astore_2        
		if(s != null && (!"metaClass".equals(((Object) (s))) || !isGroovyMetaClassSetter(annotatedmethod)))
	//*   5    8:aload_2         
	//*   6    9:ifnull          30
	//*   7   12:ldc1            #149 <String "metaClass">
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #136 <Method boolean String.equals(Object)>
	//*  10   18:ifeq            28
	//*  11   21:aload_0         
	//*  12   22:invokestatic    #151 <Method boolean isGroovyMetaClassSetter(AnnotatedMethod)>
	//*  13   25:ifne            30
			return s;
	//   14   28:aload_2         
	//   15   29:areturn         
		else
			return null;
	//   16   30:aconst_null     
	//   17   31:areturn         
	}

	protected static String stdManglePropertyName(String s, int i)
	{
		int j = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method int String.length()>
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
	//   10   16:invokevirtual   #68  <Method char String.charAt(int)>
	//   11   19:istore_2        
		char c1 = Character.toLowerCase(c);
	//   12   20:iload_2         
	//   13   21:invokestatic    #74  <Method char Character.toLowerCase(char)>
	//   14   24:istore_3        
		if(c == c1)
	//*  15   25:iload_2         
	//*  16   26:iload_3         
	//*  17   27:icmpne          36
			return s.substring(i);
	//   18   30:aload_0         
	//   19   31:iload_1         
	//   20   32:invokevirtual   #78  <Method String String.substring(int)>
	//   21   35:areturn         
		if(i + 1 < j && Character.isUpperCase(s.charAt(i + 1)))
	//*  22   36:iload_1         
	//*  23   37:iconst_1        
	//*  24   38:iadd            
	//*  25   39:iload           4
	//*  26   41:icmpge          63
	//*  27   44:aload_0         
	//*  28   45:iload_1         
	//*  29   46:iconst_1        
	//*  30   47:iadd            
	//*  31   48:invokevirtual   #68  <Method char String.charAt(int)>
	//*  32   51:invokestatic    #155 <Method boolean Character.isUpperCase(char)>
	//*  33   54:ifeq            63
		{
			return s.substring(i);
	//   34   57:aload_0         
	//   35   58:iload_1         
	//   36   59:invokevirtual   #78  <Method String String.substring(int)>
	//   37   62:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(j - i);
	//   38   63:new             #80  <Class StringBuilder>
	//   39   66:dup             
	//   40   67:iload           4
	//   41   69:iload_1         
	//   42   70:isub            
	//   43   71:invokespecial   #83  <Method void StringBuilder(int)>
	//   44   74:astore          5
			stringbuilder.append(c1);
	//   45   76:aload           5
	//   46   78:iload_3         
	//   47   79:invokevirtual   #87  <Method StringBuilder StringBuilder.append(char)>
	//   48   82:pop             
			stringbuilder.append(((CharSequence) (s)), i + 1, j);
	//   49   83:aload           5
	//   50   85:aload_0         
	//   51   86:iload_1         
	//   52   87:iconst_1        
	//   53   88:iadd            
	//   54   89:iload           4
	//   55   91:invokevirtual   #90  <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   56   94:pop             
			return stringbuilder.toString();
	//   57   95:aload           5
	//   58   97:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   59  100:areturn         
		}
	}
}
