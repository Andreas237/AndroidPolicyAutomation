// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.annotation.NoClass;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			Named

public final class ClassUtil
{
	public static final class Ctor
	{

		public Constructor getConstructor()
		{
			return _ctor;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field Constructor _ctor>
		//    2    4:areturn         
		}

		public Class getDeclaringClass()
		{
			return _ctor.getDeclaringClass();
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field Constructor _ctor>
		//    2    4:invokevirtual   #35  <Method Class Constructor.getDeclaringClass()>
		//    3    7:areturn         
		}

		public int getParamCount()
		{
			int j = _paramCount;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field int _paramCount>
		//    2    4:istore_2        
			int i = j;
		//    3    5:iload_2         
		//    4    6:istore_1        
			if(j < 0)
		//*   5    7:iload_2         
		//*   6    8:ifge            25
			{
				i = _ctor.getParameterTypes().length;
		//    7   11:aload_0         
		//    8   12:getfield        #23  <Field Constructor _ctor>
		//    9   15:invokevirtual   #42  <Method Class[] Constructor.getParameterTypes()>
		//   10   18:arraylength     
		//   11   19:istore_1        
				_paramCount = i;
		//   12   20:aload_0         
		//   13   21:iload_1         
		//   14   22:putfield        #21  <Field int _paramCount>
			}
			return i;
		//   15   25:iload_1         
		//   16   26:ireturn         
		}

		public Annotation[][] getParameterAnnotations()
		{
			Annotation aannotation1[][] = _paramAnnotations;
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field Annotation[][] _paramAnnotations>
		//    2    4:astore_2        
			Annotation aannotation[][] = aannotation1;
		//    3    5:aload_2         
		//    4    6:astore_1        
			if(aannotation1 == null)
		//*   5    7:aload_2         
		//*   6    8:ifnonnull       24
			{
				aannotation = _ctor.getParameterAnnotations();
		//    7   11:aload_0         
		//    8   12:getfield        #23  <Field Constructor _ctor>
		//    9   15:invokevirtual   #48  <Method Annotation[][] Constructor.getParameterAnnotations()>
		//   10   18:astore_1        
				_paramAnnotations = aannotation;
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:putfield        #46  <Field Annotation[][] _paramAnnotations>
			}
			return aannotation;
		//   14   24:aload_1         
		//   15   25:areturn         
		}

		public final Constructor _ctor;
		private Annotation _paramAnnotations[][];
		private int _paramCount;

		public Ctor(Constructor constructor)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			_paramCount = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #21  <Field int _paramCount>
			_ctor = constructor;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #23  <Field Constructor _ctor>
		//    8   14:return          
		}
	}

	private static class EnumTypeLocator
	{

		private Object get(Object obj, Field field)
		{
			try
			{
				obj = field.get(obj);
		//    0    0:aload_2         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #46  <Method Object Field.get(Object)>
		//    3    5:astore_1        
			}
		//*   4    6:aload_1         
		//*   5    7:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
		//*   6    8:astore_1        
			{
				throw new IllegalArgumentException(((Throwable) (obj)));
		//    7    9:new             #48  <Class IllegalArgumentException>
		//    8   12:dup             
		//    9   13:aload_1         
		//   10   14:invokespecial   #51  <Method void IllegalArgumentException(Throwable)>
		//   11   17:athrow          
			}
			return obj;
		}

		private static Field locateField(Class class1, String s, Class class2)
		{
			boolean flag;
			Field afield[];
label0:
			{
				afield = ClassUtil.getDeclaredFields(class1);
		//    0    0:aload_0         
		//    1    1:invokestatic    #57  <Method Field[] ClassUtil.getDeclaredFields(Class)>
		//    2    4:astore          7
				int k = afield.length;
		//    3    6:aload           7
		//    4    8:arraylength     
		//    5    9:istore          5
				flag = false;
		//    6   11:iconst_0        
		//    7   12:istore          4
				for(int i = 0; i < k; i++)
		//*   8   14:iconst_0        
		//*   9   15:istore_3        
		//*  10   16:iload_3         
		//*  11   17:iload           5
		//*  12   19:icmpge          56
				{
					class1 = ((Class) (afield[i]));
		//   13   22:aload           7
		//   14   24:iload_3         
		//   15   25:aaload          
		//   16   26:astore_0        
					if(s.equals(((Object) (((Field) (class1)).getName()))) && ((Field) (class1)).getType() == class2)
		//*  17   27:aload_1         
		//*  18   28:aload_0         
		//*  19   29:invokevirtual   #61  <Method String Field.getName()>
		//*  20   32:invokevirtual   #67  <Method boolean String.equals(Object)>
		//*  21   35:ifeq            49
		//*  22   38:aload_0         
		//*  23   39:invokevirtual   #71  <Method Class Field.getType()>
		//*  24   42:aload_2         
		//*  25   43:if_acmpne       49
						break label0;
		//   26   46:goto            58
				}

		//   27   49:iload_3         
		//   28   50:iconst_1        
		//   29   51:iadd            
		//   30   52:istore_3        
		//*  31   53:goto            16
				class1 = null;
		//   32   56:aconst_null     
		//   33   57:astore_0        
			}
			s = ((String) (class1));
		//   34   58:aload_0         
		//   35   59:astore_1        
			if(class1 == null)
		//*  36   60:aload_0         
		//*  37   61:ifnonnull       115
			{
				int l = afield.length;
		//   38   64:aload           7
		//   39   66:arraylength     
		//   40   67:istore          5
				int j = ((int) (flag));
		//   41   69:iload           4
		//   42   71:istore_3        
				do
				{
					s = ((String) (class1));
		//   43   72:aload_0         
		//   44   73:astore_1        
					if(j >= l)
						break;
		//   45   74:iload_3         
		//   46   75:iload           5
		//   47   77:icmpge          115
					Field field = afield[j];
		//   48   80:aload           7
		//   49   82:iload_3         
		//   50   83:aaload          
		//   51   84:astore          6
					s = ((String) (class1));
		//   52   86:aload_0         
		//   53   87:astore_1        
					if(field.getType() == class2)
		//*  54   88:aload           6
		//*  55   90:invokevirtual   #71  <Method Class Field.getType()>
		//*  56   93:aload_2         
		//*  57   94:if_acmpne       106
					{
						if(class1 != null)
		//*  58   97:aload_0         
		//*  59   98:ifnull          103
							return null;
		//   60  101:aconst_null     
		//   61  102:areturn         
						s = ((String) (field));
		//   62  103:aload           6
		//   63  105:astore_1        
					}
					j++;
		//   64  106:iload_3         
		//   65  107:iconst_1        
		//   66  108:iadd            
		//   67  109:istore_3        
					class1 = ((Class) (s));
		//   68  110:aload_1         
		//   69  111:astore_0        
				} while(true);
		//   70  112:goto            72
			}
			if(s != null)
		//*  71  115:aload_1         
		//*  72  116:ifnull          124
				try
				{
					((Field) (s)).setAccessible(true);
		//   73  119:aload_1         
		//   74  120:iconst_1        
		//   75  121:invokevirtual   #75  <Method void Field.setAccessible(boolean)>
				}
		//*  76  124:aload_1         
		//*  77  125:areturn         
				// Misplaced declaration of an exception variable
				catch(Class class1)
		//*  78  126:astore_0        
				{
					return ((Field) (s));
		//   79  127:aload_1         
		//   80  128:areturn         
				}
			return ((Field) (s));
		}

		public Class enumTypeFor(EnumMap enummap)
		{
			Field field = enumMapTypeField;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field Field enumMapTypeField>
		//    2    4:astore_2        
			if(field != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          19
				return (Class)get(((Object) (enummap)), field);
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:aload_2         
		//    8   12:invokespecial   #81  <Method Object get(Object, Field)>
		//    9   15:checkcast       #27  <Class Class>
		//   10   18:areturn         
			else
				throw new IllegalStateException("Cannot figure out type for EnumMap (odd JDK platform?)");
		//   11   19:new             #83  <Class IllegalStateException>
		//   12   22:dup             
		//   13   23:ldc1            #85  <String "Cannot figure out type for EnumMap (odd JDK platform?)">
		//   14   25:invokespecial   #88  <Method void IllegalStateException(String)>
		//   15   28:athrow          
		}

		public Class enumTypeFor(EnumSet enumset)
		{
			Field field = enumSetTypeField;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field Field enumSetTypeField>
		//    2    4:astore_2        
			if(field != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          19
				return (Class)get(((Object) (enumset)), field);
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:aload_2         
		//    8   12:invokespecial   #81  <Method Object get(Object, Field)>
		//    9   15:checkcast       #27  <Class Class>
		//   10   18:areturn         
			else
				throw new IllegalStateException("Cannot figure out type for EnumSet (odd JDK platform?)");
		//   11   19:new             #83  <Class IllegalStateException>
		//   12   22:dup             
		//   13   23:ldc1            #92  <String "Cannot figure out type for EnumSet (odd JDK platform?)">
		//   14   25:invokespecial   #88  <Method void IllegalStateException(String)>
		//   15   28:athrow          
		}

		static final EnumTypeLocator instance = new EnumTypeLocator();
		private final Field enumMapTypeField = locateField(java/util/EnumMap, "elementType", java/lang/Class);
		private final Field enumSetTypeField = locateField(java/util/EnumSet, "elementType", java/lang/Class);

		static 
		{
		//    0    0:new             #2   <Class ClassUtil$EnumTypeLocator>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void ClassUtil$EnumTypeLocator()>
		//    3    7:putstatic       #19  <Field ClassUtil$EnumTypeLocator instance>
		//*   4   10:return          
		}

		private EnumTypeLocator()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:ldc1            #23  <Class EnumSet>
		//    4    7:ldc1            #25  <String "elementType">
		//    5    9:ldc1            #27  <Class Class>
		//    6   11:invokestatic    #31  <Method Field locateField(Class, String, Class)>
		//    7   14:putfield        #33  <Field Field enumSetTypeField>
		//    8   17:aload_0         
		//    9   18:ldc1            #35  <Class EnumMap>
		//   10   20:ldc1            #25  <String "elementType">
		//   11   22:ldc1            #27  <Class Class>
		//   12   24:invokestatic    #31  <Method Field locateField(Class, String, Class)>
		//   13   27:putfield        #37  <Field Field enumMapTypeField>
		//   14   30:return          
		}
	}


	private static void _addRawSuperTypes(Class class1, Class class2, Collection collection, boolean flag)
	{
		if(class1 != class2 && class1 != null)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpeq       91
	//*   3    5:aload_0         
	//*   4    6:ifnull          91
		{
			if(class1 == java/lang/Object)
	//*   5    9:aload_0         
	//*   6   10:ldc1            #4   <Class Object>
	//*   7   12:if_acmpne       16
				return;
	//    8   15:return          
			if(flag)
	//*   9   16:iload_3         
	//*  10   17:ifeq            39
			{
				if(collection.contains(((Object) (class1))))
	//*  11   20:aload_2         
	//*  12   21:aload_0         
	//*  13   22:invokeinterface #47  <Method boolean Collection.contains(Object)>
	//*  14   27:ifeq            31
					return;
	//   15   30:return          
				collection.add(((Object) (class1)));
	//   16   31:aload_2         
	//   17   32:aload_0         
	//   18   33:invokeinterface #50  <Method boolean Collection.add(Object)>
	//   19   38:pop             
			}
			Class aclass[] = _interfaces(class1);
	//   20   39:aload_0         
	//   21   40:invokestatic    #54  <Method Class[] _interfaces(Class)>
	//   22   43:astore          6
			int j = aclass.length;
	//   23   45:aload           6
	//   24   47:arraylength     
	//   25   48:istore          5
			for(int i = 0; i < j; i++)
	//*  26   50:iconst_0        
	//*  27   51:istore          4
	//*  28   53:iload           4
	//*  29   55:iload           5
	//*  30   57:icmpge          80
				_addRawSuperTypes(aclass[i], class2, collection, true);
	//   31   60:aload           6
	//   32   62:iload           4
	//   33   64:aaload          
	//   34   65:aload_1         
	//   35   66:aload_2         
	//   36   67:iconst_1        
	//   37   68:invokestatic    #56  <Method void _addRawSuperTypes(Class, Class, Collection, boolean)>

	//   38   71:iload           4
	//   39   73:iconst_1        
	//   40   74:iadd            
	//   41   75:istore          4
	//*  42   77:goto            53
			_addRawSuperTypes(class1.getSuperclass(), class2, collection, true);
	//   43   80:aload_0         
	//   44   81:invokevirtual   #62  <Method Class Class.getSuperclass()>
	//   45   84:aload_1         
	//   46   85:aload_2         
	//   47   86:iconst_1        
	//   48   87:invokestatic    #56  <Method void _addRawSuperTypes(Class, Class, Collection, boolean)>
			return;
	//   49   90:return          
		} else
		{
			return;
	//   50   91:return          
		}
	}

	private static void _addSuperTypes(JavaType javatype, Class class1, Collection collection, boolean flag)
	{
		if(javatype == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		Class class2 = javatype.getRawClass();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #71  <Method Class JavaType.getRawClass()>
	//    5    9:astore          4
		if(class2 != class1)
	//*   6   11:aload           4
	//*   7   13:aload_1         
	//*   8   14:if_acmpeq       99
		{
			if(class2 == java/lang/Object)
	//*   9   17:aload           4
	//*  10   19:ldc1            #4   <Class Object>
	//*  11   21:if_acmpne       25
				return;
	//   12   24:return          
			if(flag)
	//*  13   25:iload_3         
	//*  14   26:ifeq            48
			{
				if(collection.contains(((Object) (javatype))))
	//*  15   29:aload_2         
	//*  16   30:aload_0         
	//*  17   31:invokeinterface #47  <Method boolean Collection.contains(Object)>
	//*  18   36:ifeq            40
					return;
	//   19   39:return          
				collection.add(((Object) (javatype)));
	//   20   40:aload_2         
	//   21   41:aload_0         
	//   22   42:invokeinterface #50  <Method boolean Collection.add(Object)>
	//   23   47:pop             
			}
			for(Iterator iterator = javatype.getInterfaces().iterator(); iterator.hasNext(); _addSuperTypes((JavaType)iterator.next(), class1, collection, true));
	//   24   48:aload_0         
	//   25   49:invokevirtual   #75  <Method List JavaType.getInterfaces()>
	//   26   52:invokeinterface #80  <Method Iterator List.iterator()>
	//   27   57:astore          4
	//   28   59:aload           4
	//   29   61:invokeinterface #86  <Method boolean Iterator.hasNext()>
	//   30   66:ifeq            88
	//   31   69:aload           4
	//   32   71:invokeinterface #90  <Method Object Iterator.next()>
	//   33   76:checkcast       #68  <Class JavaType>
	//   34   79:aload_1         
	//   35   80:aload_2         
	//   36   81:iconst_1        
	//   37   82:invokestatic    #92  <Method void _addSuperTypes(JavaType, Class, Collection, boolean)>
	//*  38   85:goto            59
			_addSuperTypes(javatype.getSuperClass(), class1, collection, true);
	//   39   88:aload_0         
	//   40   89:invokevirtual   #96  <Method JavaType JavaType.getSuperClass()>
	//   41   92:aload_1         
	//   42   93:aload_2         
	//   43   94:iconst_1        
	//   44   95:invokestatic    #92  <Method void _addSuperTypes(JavaType, Class, Collection, boolean)>
			return;
	//   45   98:return          
		} else
		{
			return;
	//   46   99:return          
		}
	}

	private static Class[] _interfaces(Class class1)
	{
		return class1.getInterfaces();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method Class[] Class.getInterfaces()>
	//    2    4:areturn         
	}

	public static String backticked(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
		{
			return "[null]";
	//    2    4:ldc1            #105 <String "[null]">
	//    3    6:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(s.length() + 2);
	//    4    7:new             #107 <Class StringBuilder>
	//    5   10:dup             
	//    6   11:aload_0         
	//    7   12:invokevirtual   #113 <Method int String.length()>
	//    8   15:iconst_2        
	//    9   16:iadd            
	//   10   17:invokespecial   #117 <Method void StringBuilder(int)>
	//   11   20:astore_1        
			stringbuilder.append('`');
	//   12   21:aload_1         
	//   13   22:bipush          96
	//   14   24:invokevirtual   #121 <Method StringBuilder StringBuilder.append(char)>
	//   15   27:pop             
			stringbuilder.append(s);
	//   16   28:aload_1         
	//   17   29:aload_0         
	//   18   30:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   19   33:pop             
			stringbuilder.append('`');
	//   20   34:aload_1         
	//   21   35:bipush          96
	//   22   37:invokevirtual   #121 <Method StringBuilder StringBuilder.append(char)>
	//   23   40:pop             
			return stringbuilder.toString();
	//   24   41:aload_1         
	//   25   42:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   26   45:areturn         
		}
	}

	public static String canBeABeanType(Class class1)
	{
		if(class1.isAnnotation())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #133 <Method boolean Class.isAnnotation()>
	//*   2    4:ifeq            10
			return "annotation";
	//    3    7:ldc1            #135 <String "annotation">
	//    4    9:areturn         
		if(class1.isArray())
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #138 <Method boolean Class.isArray()>
	//*   7   14:ifeq            20
			return "array";
	//    8   17:ldc1            #140 <String "array">
	//    9   19:areturn         
		if(class1.isEnum())
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #143 <Method boolean Class.isEnum()>
	//*  12   24:ifeq            30
			return "enum";
	//   13   27:ldc1            #145 <String "enum">
	//   14   29:areturn         
		if(class1.isPrimitive())
	//*  15   30:aload_0         
	//*  16   31:invokevirtual   #148 <Method boolean Class.isPrimitive()>
	//*  17   34:ifeq            40
			return "primitive";
	//   18   37:ldc1            #150 <String "primitive">
	//   19   39:areturn         
		else
			return null;
	//   20   40:aconst_null     
	//   21   41:areturn         
	}

	public static void checkAndFixAccess(Member member, boolean flag)
	{
		AccessibleObject accessibleobject;
		accessibleobject = (AccessibleObject)member;
	//    0    0:aload_0         
	//    1    1:checkcast       #157 <Class AccessibleObject>
	//    2    4:astore_3        
		if(flag)
			break MISSING_BLOCK_LABEL_36;
	//    3    5:iload_1         
	//    4    6:ifne            36
		if(Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers()))
			break MISSING_BLOCK_LABEL_50;
	//    5    9:aload_0         
	//    6   10:invokeinterface #162 <Method int Member.getModifiers()>
	//    7   15:invokestatic    #168 <Method boolean Modifier.isPublic(int)>
	//    8   18:ifeq            36
	//    9   21:aload_0         
	//   10   22:invokeinterface #171 <Method Class Member.getDeclaringClass()>
	//   11   27:invokevirtual   #172 <Method int Class.getModifiers()>
	//   12   30:invokestatic    #168 <Method boolean Modifier.isPublic(int)>
	//   13   33:ifne            50
		accessibleobject.setAccessible(true);
	//   14   36:aload_3         
	//   15   37:iconst_1        
	//   16   38:invokevirtual   #176 <Method void AccessibleObject.setAccessible(boolean)>
		return;
	//   17   41:return          
		SecurityException securityexception;
		securityexception;
	//   18   42:astore_2        
		if(!accessibleobject.isAccessible())
			break MISSING_BLOCK_LABEL_51;
	//   19   43:aload_3         
	//   20   44:invokevirtual   #179 <Method boolean AccessibleObject.isAccessible()>
	//   21   47:ifeq            51
		return;
	//   22   50:return          
		Class class1 = member.getDeclaringClass();
	//   23   51:aload_0         
	//   24   52:invokeinterface #171 <Method Class Member.getDeclaringClass()>
	//   25   57:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   26   58:new             #107 <Class StringBuilder>
	//   27   61:dup             
	//   28   62:invokespecial   #181 <Method void StringBuilder()>
	//   29   65:astore          4
		stringbuilder.append("Cannot access ");
	//   30   67:aload           4
	//   31   69:ldc1            #183 <String "Cannot access ">
	//   32   71:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   33   74:pop             
		stringbuilder.append(((Object) (member)));
	//   34   75:aload           4
	//   35   77:aload_0         
	//   36   78:invokevirtual   #186 <Method StringBuilder StringBuilder.append(Object)>
	//   37   81:pop             
		stringbuilder.append(" (from class ");
	//   38   82:aload           4
	//   39   84:ldc1            #188 <String " (from class ">
	//   40   86:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   41   89:pop             
		stringbuilder.append(class1.getName());
	//   42   90:aload           4
	//   43   92:aload_3         
	//   44   93:invokevirtual   #191 <Method String Class.getName()>
	//   45   96:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   46   99:pop             
		stringbuilder.append("; failed to set access: ");
	//   47  100:aload           4
	//   48  102:ldc1            #193 <String "; failed to set access: ">
	//   49  104:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   50  107:pop             
		stringbuilder.append(securityexception.getMessage());
	//   51  108:aload           4
	//   52  110:aload_2         
	//   53  111:invokevirtual   #196 <Method String SecurityException.getMessage()>
	//   54  114:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   55  117:pop             
		throw new IllegalArgumentException(stringbuilder.toString());
	//   56  118:new             #198 <Class IllegalArgumentException>
	//   57  121:dup             
	//   58  122:aload           4
	//   59  124:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   60  127:invokespecial   #201 <Method void IllegalArgumentException(String)>
	//   61  130:athrow          
	}

	public static String classNameOf(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "[null]";
	//    2    4:ldc1            #105 <String "[null]">
	//    3    6:areturn         
		else
			return nameOf(obj.getClass());
	//    4    7:aload_0         
	//    5    8:invokevirtual   #206 <Method Class Object.getClass()>
	//    6   11:invokestatic    #209 <Method String nameOf(Class)>
	//    7   14:areturn         
	}

	public static Class classOf(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return obj.getClass();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #206 <Method Class Object.getClass()>
	//    6   10:areturn         
	}

	public static void closeOnFailAndThrowAsIOE(JsonGenerator jsongenerator, Closeable closeable, Exception exception)
		throws IOException
	{
		if(jsongenerator != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          25
		{
			jsongenerator.disable(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
	//    2    4:aload_0         
	//    3    5:getstatic       #224 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_JSON_CONTENT>
	//    4    8:invokevirtual   #230 <Method JsonGenerator JsonGenerator.disable(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//    5   11:pop             
			try
			{
				jsongenerator.close();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #233 <Method void JsonGenerator.close()>
			}
	//*   8   16:goto            25
			// Misplaced declaration of an exception variable
			catch(JsonGenerator jsongenerator)
	//*   9   19:astore_0        
			{
				exception.addSuppressed(((Throwable) (jsongenerator)));
	//   10   20:aload_2         
	//   11   21:aload_0         
	//   12   22:invokevirtual   #237 <Method void Exception.addSuppressed(Throwable)>
			}
		}
		if(closeable != null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          44
			try
			{
				closeable.close();
	//   15   29:aload_1         
	//   16   30:invokeinterface #240 <Method void Closeable.close()>
			}
	//*  17   35:goto            44
			// Misplaced declaration of an exception variable
			catch(JsonGenerator jsongenerator)
	//*  18   38:astore_0        
			{
				exception.addSuppressed(((Throwable) (jsongenerator)));
	//   19   39:aload_2         
	//   20   40:aload_0         
	//   21   41:invokevirtual   #237 <Method void Exception.addSuppressed(Throwable)>
			}
		throwIfIOE(((Throwable) (exception)));
	//   22   44:aload_2         
	//   23   45:invokestatic    #244 <Method Throwable throwIfIOE(Throwable)>
	//   24   48:pop             
		throwIfRTE(((Throwable) (exception)));
	//   25   49:aload_2         
	//   26   50:invokestatic    #247 <Method Throwable throwIfRTE(Throwable)>
	//   27   53:pop             
		throw new RuntimeException(((Throwable) (exception)));
	//   28   54:new             #249 <Class RuntimeException>
	//   29   57:dup             
	//   30   58:aload_2         
	//   31   59:invokespecial   #251 <Method void RuntimeException(Throwable)>
	//   32   62:athrow          
	}

	public static void closeOnFailAndThrowAsIOE(JsonGenerator jsongenerator, Exception exception)
		throws IOException
	{
		jsongenerator.disable(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
	//    0    0:aload_0         
	//    1    1:getstatic       #224 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_JSON_CONTENT>
	//    2    4:invokevirtual   #230 <Method JsonGenerator JsonGenerator.disable(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//    3    7:pop             
		try
		{
			jsongenerator.close();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #233 <Method void JsonGenerator.close()>
		}
	//*   6   12:goto            21
		// Misplaced declaration of an exception variable
		catch(JsonGenerator jsongenerator)
	//*   7   15:astore_0        
		{
			exception.addSuppressed(((Throwable) (jsongenerator)));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #237 <Method void Exception.addSuppressed(Throwable)>
		}
		throwIfIOE(((Throwable) (exception)));
	//   11   21:aload_1         
	//   12   22:invokestatic    #244 <Method Throwable throwIfIOE(Throwable)>
	//   13   25:pop             
		throwIfRTE(((Throwable) (exception)));
	//   14   26:aload_1         
	//   15   27:invokestatic    #247 <Method Throwable throwIfRTE(Throwable)>
	//   16   30:pop             
		throw new RuntimeException(((Throwable) (exception)));
	//   17   31:new             #249 <Class RuntimeException>
	//   18   34:dup             
	//   19   35:aload_1         
	//   20   36:invokespecial   #251 <Method void RuntimeException(Throwable)>
	//   21   39:athrow          
	}

	public static Object createInstance(Class class1, boolean flag)
		throws IllegalArgumentException
	{
		Object obj = ((Object) (findConstructor(class1, flag)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #259 <Method Constructor findConstructor(Class, boolean)>
	//    3    5:astore_2        
		if(obj != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          74
		{
			try
			{
				obj = ((Constructor) (obj)).newInstance(new Object[0]);
	//    6   10:aload_2         
	//    7   11:iconst_0        
	//    8   12:anewarray       Object[]
	//    9   15:invokevirtual   #265 <Method Object Constructor.newInstance(Object[])>
	//   10   18:astore_2        
			}
	//*  11   19:aload_2         
	//*  12   20:areturn         
			catch(Exception exception)
	//*  13   21:astore_2        
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   14   22:new             #107 <Class StringBuilder>
	//   15   25:dup             
	//   16   26:invokespecial   #181 <Method void StringBuilder()>
	//   17   29:astore_3        
				stringbuilder1.append("Failed to instantiate class ");
	//   18   30:aload_3         
	//   19   31:ldc2            #267 <String "Failed to instantiate class ">
	//   20   34:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   21   37:pop             
				stringbuilder1.append(class1.getName());
	//   22   38:aload_3         
	//   23   39:aload_0         
	//   24   40:invokevirtual   #191 <Method String Class.getName()>
	//   25   43:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   26   46:pop             
				stringbuilder1.append(", problem: ");
	//   27   47:aload_3         
	//   28   48:ldc2            #269 <String ", problem: ">
	//   29   51:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   30   54:pop             
				stringbuilder1.append(exception.getMessage());
	//   31   55:aload_3         
	//   32   56:aload_2         
	//   33   57:invokevirtual   #270 <Method String Exception.getMessage()>
	//   34   60:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   35   63:pop             
				unwrapAndThrowAsIAE(((Throwable) (exception)), stringbuilder1.toString());
	//   36   64:aload_2         
	//   37   65:aload_3         
	//   38   66:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   39   69:invokestatic    #274 <Method void unwrapAndThrowAsIAE(Throwable, String)>
				return ((Object) (null));
	//   40   72:aconst_null     
	//   41   73:areturn         
			}
			return obj;
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   42   74:new             #107 <Class StringBuilder>
	//   43   77:dup             
	//   44   78:invokespecial   #181 <Method void StringBuilder()>
	//   45   81:astore_2        
			stringbuilder.append("Class ");
	//   46   82:aload_2         
	//   47   83:ldc2            #276 <String "Class ">
	//   48   86:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   49   89:pop             
			stringbuilder.append(class1.getName());
	//   50   90:aload_2         
	//   51   91:aload_0         
	//   52   92:invokevirtual   #191 <Method String Class.getName()>
	//   53   95:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   54   98:pop             
			stringbuilder.append(" has no default (no arg) constructor");
	//   55   99:aload_2         
	//   56  100:ldc2            #278 <String " has no default (no arg) constructor">
	//   57  103:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   58  106:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   59  107:new             #198 <Class IllegalArgumentException>
	//   60  110:dup             
	//   61  111:aload_2         
	//   62  112:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   63  115:invokespecial   #201 <Method void IllegalArgumentException(String)>
	//   64  118:athrow          
		}
	}

	public static Object defaultValue(Class class1)
	{
		if(class1 == Integer.TYPE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #286 <Field Class Integer.TYPE>
	//*   2    4:if_acmpne       12
			return ((Object) (Integer.valueOf(0)));
	//    3    7:iconst_0        
	//    4    8:invokestatic    #290 <Method Integer Integer.valueOf(int)>
	//    5   11:areturn         
		if(class1 == Long.TYPE)
	//*   6   12:aload_0         
	//*   7   13:getstatic       #293 <Field Class Long.TYPE>
	//*   8   16:if_acmpne       24
			return ((Object) (Long.valueOf(0L)));
	//    9   19:lconst_0        
	//   10   20:invokestatic    #296 <Method Long Long.valueOf(long)>
	//   11   23:areturn         
		if(class1 == Boolean.TYPE)
	//*  12   24:aload_0         
	//*  13   25:getstatic       #299 <Field Class Boolean.TYPE>
	//*  14   28:if_acmpne       35
			return ((Object) (Boolean.FALSE));
	//   15   31:getstatic       #303 <Field Boolean Boolean.FALSE>
	//   16   34:areturn         
		if(class1 == Double.TYPE)
	//*  17   35:aload_0         
	//*  18   36:getstatic       #306 <Field Class Double.TYPE>
	//*  19   39:if_acmpne       47
			return ((Object) (Double.valueOf(0.0D)));
	//   20   42:dconst_0        
	//   21   43:invokestatic    #309 <Method Double Double.valueOf(double)>
	//   22   46:areturn         
		if(class1 == Float.TYPE)
	//*  23   47:aload_0         
	//*  24   48:getstatic       #312 <Field Class Float.TYPE>
	//*  25   51:if_acmpne       59
			return ((Object) (Float.valueOf(0.0F)));
	//   26   54:fconst_0        
	//   27   55:invokestatic    #315 <Method Float Float.valueOf(float)>
	//   28   58:areturn         
		if(class1 == Byte.TYPE)
	//*  29   59:aload_0         
	//*  30   60:getstatic       #318 <Field Class Byte.TYPE>
	//*  31   63:if_acmpne       71
			return ((Object) (Byte.valueOf((byte)0)));
	//   32   66:iconst_0        
	//   33   67:invokestatic    #321 <Method Byte Byte.valueOf(byte)>
	//   34   70:areturn         
		if(class1 == Short.TYPE)
	//*  35   71:aload_0         
	//*  36   72:getstatic       #324 <Field Class Short.TYPE>
	//*  37   75:if_acmpne       83
			return ((Object) (Short.valueOf((short)0)));
	//   38   78:iconst_0        
	//   39   79:invokestatic    #327 <Method Short Short.valueOf(short)>
	//   40   82:areturn         
		if(class1 == Character.TYPE)
	//*  41   83:aload_0         
	//*  42   84:getstatic       #330 <Field Class Character.TYPE>
	//*  43   87:if_acmpne       95
		{
			return ((Object) (Character.valueOf('\0')));
	//   44   90:iconst_0        
	//   45   91:invokestatic    #333 <Method Character Character.valueOf(char)>
	//   46   94:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   47   95:new             #107 <Class StringBuilder>
	//   48   98:dup             
	//   49   99:invokespecial   #181 <Method void StringBuilder()>
	//   50  102:astore_1        
			stringbuilder.append("Class ");
	//   51  103:aload_1         
	//   52  104:ldc2            #276 <String "Class ">
	//   53  107:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   54  110:pop             
			stringbuilder.append(class1.getName());
	//   55  111:aload_1         
	//   56  112:aload_0         
	//   57  113:invokevirtual   #191 <Method String Class.getName()>
	//   58  116:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   59  119:pop             
			stringbuilder.append(" is not a primitive type");
	//   60  120:aload_1         
	//   61  121:ldc2            #335 <String " is not a primitive type">
	//   62  124:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   63  127:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   64  128:new             #198 <Class IllegalArgumentException>
	//   65  131:dup             
	//   66  132:aload_1         
	//   67  133:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   68  136:invokespecial   #201 <Method void IllegalArgumentException(String)>
	//   69  139:athrow          
		}
	}

	public static Iterator emptyIterator()
	{
		return EMPTY_ITERATOR;
	//    0    0:getstatic       #38  <Field Iterator EMPTY_ITERATOR>
	//    1    3:areturn         
	}

	public static Annotation[] findClassAnnotations(Class class1)
	{
		if(isObjectOrPrimitive(class1))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #343 <Method boolean isObjectOrPrimitive(Class)>
	//*   2    4:ifeq            11
			return NO_ANNOTATIONS;
	//    3    7:getstatic       #28  <Field Annotation[] NO_ANNOTATIONS>
	//    4   10:areturn         
		else
			return class1.getDeclaredAnnotations();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #347 <Method Annotation[] Class.getDeclaredAnnotations()>
	//    7   15:areturn         
	}

	public static Constructor findConstructor(Class class1, boolean flag)
		throws IllegalArgumentException
	{
		Constructor constructor = class1.getDeclaredConstructor(new Class[0]);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       Class[]
	//    3    5:invokevirtual   #354 <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    4    8:astore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_20;
	//    5    9:iload_1         
	//    6   10:ifeq            20
		checkAndFixAccess(((Member) (constructor)), flag);
	//    7   13:aload_2         
	//    8   14:iload_1         
	//    9   15:invokestatic    #356 <Method void checkAndFixAccess(Member, boolean)>
		return constructor;
	//   10   18:aload_2         
	//   11   19:areturn         
		if(Modifier.isPublic(constructor.getModifiers()))
	//*  12   20:aload_2         
	//*  13   21:invokevirtual   #357 <Method int Constructor.getModifiers()>
	//*  14   24:invokestatic    #168 <Method boolean Modifier.isPublic(int)>
	//*  15   27:ifeq            32
			return constructor;
	//   16   30:aload_2         
	//   17   31:areturn         
		try
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   18   32:new             #107 <Class StringBuilder>
	//   19   35:dup             
	//   20   36:invokespecial   #181 <Method void StringBuilder()>
	//   21   39:astore_2        
			stringbuilder.append("Default constructor for ");
	//   22   40:aload_2         
	//   23   41:ldc2            #359 <String "Default constructor for ">
	//   24   44:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
			stringbuilder.append(class1.getName());
	//   26   48:aload_2         
	//   27   49:aload_0         
	//   28   50:invokevirtual   #191 <Method String Class.getName()>
	//   29   53:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   30   56:pop             
			stringbuilder.append(" is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
	//   31   57:aload_2         
	//   32   58:ldc2            #361 <String " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type">
	//   33   61:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   34   64:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   35   65:new             #198 <Class IllegalArgumentException>
	//   36   68:dup             
	//   37   69:aload_2         
	//   38   70:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   39   73:invokespecial   #201 <Method void IllegalArgumentException(String)>
	//   40   76:athrow          
		}
	//*  41   77:astore_2        
	//*  42   78:new             #107 <Class StringBuilder>
	//*  43   81:dup             
	//*  44   82:invokespecial   #181 <Method void StringBuilder()>
	//*  45   85:astore_3        
	//*  46   86:aload_3         
	//*  47   87:ldc2            #363 <String "Failed to find default constructor of class ">
	//*  48   90:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//*  49   93:pop             
	//*  50   94:aload_3         
	//*  51   95:aload_0         
	//*  52   96:invokevirtual   #191 <Method String Class.getName()>
	//*  53   99:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//*  54  102:pop             
	//*  55  103:aload_3         
	//*  56  104:ldc2            #269 <String ", problem: ">
	//*  57  107:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//*  58  110:pop             
	//*  59  111:aload_3         
	//*  60  112:aload_2         
	//*  61  113:invokevirtual   #270 <Method String Exception.getMessage()>
	//*  62  116:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//*  63  119:pop             
	//*  64  120:aload_2         
	//*  65  121:aload_3         
	//*  66  122:invokevirtual   #128 <Method String StringBuilder.toString()>
	//*  67  125:invokestatic    #274 <Method void unwrapAndThrowAsIAE(Throwable, String)>
	//*  68  128:aconst_null     
	//*  69  129:areturn         
		// Misplaced declaration of an exception variable
		catch(Class class1) { }
	//   70  130:astore_0        
		catch(Exception exception)
		{
			StringBuilder stringbuilder1 = new StringBuilder();
			stringbuilder1.append("Failed to find default constructor of class ");
			stringbuilder1.append(class1.getName());
			stringbuilder1.append(", problem: ");
			stringbuilder1.append(exception.getMessage());
			unwrapAndThrowAsIAE(((Throwable) (exception)), stringbuilder1.toString());
		}
		return null;
	//*  71  131:goto            128
	}

	public static Class findEnumType(Class class1)
	{
		Class class2 = class1;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(class1.getSuperclass() != java/lang/Enum)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #62  <Method Class Class.getSuperclass()>
	//*   4    6:ldc2            #368 <Class Enum>
	//*   5    9:if_acmpeq       17
			class2 = class1.getSuperclass();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #62  <Method Class Class.getSuperclass()>
	//    8   16:astore_1        
		return class2;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public static Class findEnumType(Enum enum)
	{
		Class class1 = ((Object) (enum)).getClass();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #206 <Method Class Object.getClass()>
	//    2    4:astore_1        
		enum = ((Enum) (class1));
	//    3    5:aload_1         
	//    4    6:astore_0        
		if(class1.getSuperclass() != java/lang/Enum)
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #62  <Method Class Class.getSuperclass()>
	//*   7   11:ldc2            #368 <Class Enum>
	//*   8   14:if_acmpeq       22
			enum = ((Enum) (class1.getSuperclass()));
	//    9   17:aload_1         
	//   10   18:invokevirtual   #62  <Method Class Class.getSuperclass()>
	//   11   21:astore_0        
		return ((Class) (enum));
	//   12   22:aload_0         
	//   13   23:areturn         
	}

	public static Class findEnumType(EnumMap enummap)
	{
		if(!enummap.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #377 <Method boolean EnumMap.isEmpty()>
	//*   2    4:ifne            28
			return findEnumType((Enum)enummap.keySet().iterator().next());
	//    3    7:aload_0         
	//    4    8:invokevirtual   #381 <Method Set EnumMap.keySet()>
	//    5   11:invokeinterface #384 <Method Iterator Set.iterator()>
	//    6   16:invokeinterface #90  <Method Object Iterator.next()>
	//    7   21:checkcast       #368 <Class Enum>
	//    8   24:invokestatic    #386 <Method Class findEnumType(Enum)>
	//    9   27:areturn         
		else
			return EnumTypeLocator.instance.enumTypeFor(enummap);
	//   10   28:getstatic       #390 <Field ClassUtil$EnumTypeLocator ClassUtil$EnumTypeLocator.instance>
	//   11   31:aload_0         
	//   12   32:invokevirtual   #393 <Method Class ClassUtil$EnumTypeLocator.enumTypeFor(EnumMap)>
	//   13   35:areturn         
	}

	public static Class findEnumType(EnumSet enumset)
	{
		if(!enumset.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #398 <Method boolean EnumSet.isEmpty()>
	//*   2    4:ifne            23
			return findEnumType((Enum)enumset.iterator().next());
	//    3    7:aload_0         
	//    4    8:invokevirtual   #399 <Method Iterator EnumSet.iterator()>
	//    5   11:invokeinterface #90  <Method Object Iterator.next()>
	//    6   16:checkcast       #368 <Class Enum>
	//    7   19:invokestatic    #386 <Method Class findEnumType(Enum)>
	//    8   22:areturn         
		else
			return EnumTypeLocator.instance.enumTypeFor(enumset);
	//    9   23:getstatic       #390 <Field ClassUtil$EnumTypeLocator ClassUtil$EnumTypeLocator.instance>
	//   10   26:aload_0         
	//   11   27:invokevirtual   #401 <Method Class ClassUtil$EnumTypeLocator.enumTypeFor(EnumSet)>
	//   12   30:areturn         
	}

	public static Enum findFirstAnnotatedEnumValue(Class class1, Class class2)
	{
		Field afield[] = getDeclaredFields(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #408 <Method Field[] getDeclaredFields(Class)>
	//    2    4:astore          6
		int k = afield.length;
	//    3    6:aload           6
	//    4    8:arraylength     
	//    5    9:istore          4
label0:
		for(int i = 0; i < k; i++)
	//*   6   11:iconst_0        
	//*   7   12:istore_2        
	//*   8   13:iload_2         
	//*   9   14:iload           4
	//*  10   16:icmpge          107
		{
			Object obj = ((Object) (afield[i]));
	//   11   19:aload           6
	//   12   21:iload_2         
	//   13   22:aaload          
	//   14   23:astore          7
			if(!((Field) (obj)).isEnumConstant() || ((Field) (obj)).getAnnotation(class2) == null)
				continue;
	//   15   25:aload           7
	//   16   27:invokevirtual   #413 <Method boolean Field.isEnumConstant()>
	//   17   30:ifeq            100
	//   18   33:aload           7
	//   19   35:aload_1         
	//   20   36:invokevirtual   #417 <Method Annotation Field.getAnnotation(Class)>
	//   21   39:ifnull          100
			obj = ((Object) (((Field) (obj)).getName()));
	//   22   42:aload           7
	//   23   44:invokevirtual   #418 <Method String Field.getName()>
	//   24   47:astore          7
			Enum aenum[] = (Enum[])class1.getEnumConstants();
	//   25   49:aload_0         
	//   26   50:invokevirtual   #422 <Method Object[] Class.getEnumConstants()>
	//   27   53:checkcast       #424 <Class Enum[]>
	//   28   56:astore          8
			int l = aenum.length;
	//   29   58:aload           8
	//   30   60:arraylength     
	//   31   61:istore          5
			int j = 0;
	//   32   63:iconst_0        
	//   33   64:istore_3        
			do
			{
				if(j >= l)
					continue label0;
	//   34   65:iload_3         
	//   35   66:iload           5
	//   36   68:icmpge          100
				Enum enum = aenum[j];
	//   37   71:aload           8
	//   38   73:iload_3         
	//   39   74:aaload          
	//   40   75:astore          9
				if(((String) (obj)).equals(((Object) (enum.name()))))
	//*  41   77:aload           7
	//*  42   79:aload           9
	//*  43   81:invokevirtual   #427 <Method String Enum.name()>
	//*  44   84:invokevirtual   #430 <Method boolean String.equals(Object)>
	//*  45   87:ifeq            93
					return enum;
	//   46   90:aload           9
	//   47   92:areturn         
				j++;
	//   48   93:iload_3         
	//   49   94:iconst_1        
	//   50   95:iadd            
	//   51   96:istore_3        
			} while(true);
	//   52   97:goto            65
		}

	//   53  100:iload_2         
	//   54  101:iconst_1        
	//   55  102:iadd            
	//   56  103:istore_2        
	//*  57  104:goto            13
		return null;
	//   58  107:aconst_null     
	//   59  108:areturn         
	}

	public static List findRawSuperTypes(Class class1, Class class2, boolean flag)
	{
		if(class1 != null && class1 != class2 && class1 != java/lang/Object)
	//*   0    0:aload_0         
	//*   1    1:ifnull          37
	//*   2    4:aload_0         
	//*   3    5:aload_1         
	//*   4    6:if_acmpeq       37
	//*   5    9:aload_0         
	//*   6   10:ldc1            #4   <Class Object>
	//*   7   12:if_acmpne       18
	//*   8   15:goto            37
		{
			ArrayList arraylist = new ArrayList(8);
	//    9   18:new             #435 <Class ArrayList>
	//   10   21:dup             
	//   11   22:bipush          8
	//   12   24:invokespecial   #436 <Method void ArrayList(int)>
	//   13   27:astore_3        
			_addRawSuperTypes(class1, class2, ((Collection) (arraylist)), flag);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:aload_3         
	//   17   31:iload_2         
	//   18   32:invokestatic    #56  <Method void _addRawSuperTypes(Class, Class, Collection, boolean)>
			return ((List) (arraylist));
	//   19   35:aload_3         
	//   20   36:areturn         
		} else
		{
			return Collections.emptyList();
	//   21   37:invokestatic    #439 <Method List Collections.emptyList()>
	//   22   40:areturn         
		}
	}

	public static List findSuperClasses(Class class1, Class class2, boolean flag)
	{
		LinkedList linkedlist = new LinkedList();
	//    0    0:new             #443 <Class LinkedList>
	//    1    3:dup             
	//    2    4:invokespecial   #444 <Method void LinkedList()>
	//    3    7:astore          4
		if(class1 != null && class1 != class2)
	//*   4    9:aload_0         
	//*   5   10:ifnull          64
	//*   6   13:aload_0         
	//*   7   14:aload_1         
	//*   8   15:if_acmpeq       64
		{
			Class class3 = class1;
	//    9   18:aload_0         
	//   10   19:astore_3        
			if(flag)
	//*  11   20:iload_2         
	//*  12   21:ifeq            35
			{
				((List) (linkedlist)).add(((Object) (class1)));
	//   13   24:aload           4
	//   14   26:aload_0         
	//   15   27:invokeinterface #445 <Method boolean List.add(Object)>
	//   16   32:pop             
				class3 = class1;
	//   17   33:aload_0         
	//   18   34:astore_3        
			}
			do
			{
				class3 = class3.getSuperclass();
	//   19   35:aload_3         
	//   20   36:invokevirtual   #62  <Method Class Class.getSuperclass()>
	//   21   39:astore_3        
				if(class3 == null)
					break;
	//   22   40:aload_3         
	//   23   41:ifnull          64
				if(class3 == class2)
	//*  24   44:aload_3         
	//*  25   45:aload_1         
	//*  26   46:if_acmpne       52
					return ((List) (linkedlist));
	//   27   49:aload           4
	//   28   51:areturn         
				((List) (linkedlist)).add(((Object) (class3)));
	//   29   52:aload           4
	//   30   54:aload_3         
	//   31   55:invokeinterface #445 <Method boolean List.add(Object)>
	//   32   60:pop             
			} while(true);
	//   33   61:goto            35
		}
		return ((List) (linkedlist));
	//   34   64:aload           4
	//   35   66:areturn         
	}

	public static List findSuperTypes(JavaType javatype, Class class1, boolean flag)
	{
		if(javatype != null && !javatype.hasRawClass(class1) && !javatype.hasRawClass(java/lang/Object))
	//*   0    0:aload_0         
	//*   1    1:ifnull          43
	//*   2    4:aload_0         
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #450 <Method boolean JavaType.hasRawClass(Class)>
	//*   5    9:ifne            43
	//*   6   12:aload_0         
	//*   7   13:ldc1            #4   <Class Object>
	//*   8   15:invokevirtual   #450 <Method boolean JavaType.hasRawClass(Class)>
	//*   9   18:ifeq            24
	//*  10   21:goto            43
		{
			ArrayList arraylist = new ArrayList(8);
	//   11   24:new             #435 <Class ArrayList>
	//   12   27:dup             
	//   13   28:bipush          8
	//   14   30:invokespecial   #436 <Method void ArrayList(int)>
	//   15   33:astore_3        
			_addSuperTypes(javatype, class1, ((Collection) (arraylist)), flag);
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:aload_3         
	//   19   37:iload_2         
	//   20   38:invokestatic    #92  <Method void _addSuperTypes(JavaType, Class, Collection, boolean)>
			return ((List) (arraylist));
	//   21   41:aload_3         
	//   22   42:areturn         
		} else
		{
			return Collections.emptyList();
	//   23   43:invokestatic    #439 <Method List Collections.emptyList()>
	//   24   46:areturn         
		}
	}

	public static Method[] getClassMethods(Class class1)
	{
		Method amethod[];
		try
		{
			amethod = getDeclaredMethods(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #460 <Method Method[] getDeclaredMethods(Class)>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
		catch(NoClassDefFoundError noclassdeffounderror)
	//*   5    7:astore_1        
		{
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
	//    6    8:invokestatic    #466 <Method Thread Thread.currentThread()>
	//    7   11:invokevirtual   #470 <Method ClassLoader Thread.getContextClassLoader()>
	//    8   14:astore_2        
			if(classloader != null)
	//*   9   15:aload_2         
	//*  10   16:ifnull          41
			{
				try
				{
					class1 = classloader.loadClass(class1.getName());
	//   11   19:aload_2         
	//   12   20:aload_0         
	//   13   21:invokevirtual   #191 <Method String Class.getName()>
	//   14   24:invokevirtual   #476 <Method Class ClassLoader.loadClass(String)>
	//   15   27:astore_0        
				}
	//*  16   28:aload_0         
	//*  17   29:invokevirtual   #479 <Method Method[] Class.getDeclaredMethods()>
	//*  18   32:areturn         
				// Misplaced declaration of an exception variable
				catch(Class class1)
	//*  19   33:astore_0        
				{
					noclassdeffounderror.addSuppressed(((Throwable) (class1)));
	//   20   34:aload_1         
	//   21   35:aload_0         
	//   22   36:invokevirtual   #480 <Method void NoClassDefFoundError.addSuppressed(Throwable)>
					throw noclassdeffounderror;
	//   23   39:aload_1         
	//   24   40:athrow          
				}
				return class1.getDeclaredMethods();
			} else
			{
				throw noclassdeffounderror;
	//   25   41:aload_1         
	//   26   42:athrow          
			}
		}
		return amethod;
	}

	public static Ctor[] getConstructors(Class class1)
	{
		if(!class1.isInterface() && !isObjectOrPrimitive(class1))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #486 <Method boolean Class.isInterface()>
	//*   2    4:ifne            59
	//*   3    7:aload_0         
	//*   4    8:invokestatic    #343 <Method boolean isObjectOrPrimitive(Class)>
	//*   5   11:ifeq            17
	//*   6   14:goto            59
		{
			class1 = ((Class) (class1.getDeclaredConstructors()));
	//    7   17:aload_0         
	//    8   18:invokevirtual   #490 <Method Constructor[] Class.getDeclaredConstructors()>
	//    9   21:astore_0        
			int j = class1.length;
	//   10   22:aload_0         
	//   11   23:arraylength     
	//   12   24:istore_2        
			Ctor actor[] = new Ctor[j];
	//   13   25:iload_2         
	//   14   26:anewarray       Ctor[]
	//   15   29:astore_3        
			for(int i = 0; i < j; i++)
	//*  16   30:iconst_0        
	//*  17   31:istore_1        
	//*  18   32:iload_1         
	//*  19   33:iload_2         
	//*  20   34:icmpge          57
				actor[i] = new Ctor(((Constructor) (class1[i])));
	//   21   37:aload_3         
	//   22   38:iload_1         
	//   23   39:new             #6   <Class ClassUtil$Ctor>
	//   24   42:dup             
	//   25   43:aload_0         
	//   26   44:iload_1         
	//   27   45:aaload          
	//   28   46:invokespecial   #493 <Method void ClassUtil$Ctor(Constructor)>
	//   29   49:aastore         

	//   30   50:iload_1         
	//   31   51:iconst_1        
	//   32   52:iadd            
	//   33   53:istore_1        
	//*  34   54:goto            32
			return actor;
	//   35   57:aload_3         
	//   36   58:areturn         
		} else
		{
			return NO_CTORS;
	//   37   59:getstatic       #30  <Field ClassUtil$Ctor[] NO_CTORS>
	//   38   62:areturn         
		}
	}

	public static Field[] getDeclaredFields(Class class1)
	{
		return class1.getDeclaredFields();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #497 <Method Field[] Class.getDeclaredFields()>
	//    2    4:areturn         
	}

	public static Method[] getDeclaredMethods(Class class1)
	{
		return class1.getDeclaredMethods();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #479 <Method Method[] Class.getDeclaredMethods()>
	//    2    4:areturn         
	}

	public static Class getEnclosingClass(Class class1)
	{
		if(isObjectOrPrimitive(class1))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #343 <Method boolean isObjectOrPrimitive(Class)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return class1.getEnclosingClass();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #501 <Method Class Class.getEnclosingClass()>
	//    7   13:areturn         
	}

	public static Type[] getGenericInterfaces(Class class1)
	{
		return class1.getGenericInterfaces();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #507 <Method Type[] Class.getGenericInterfaces()>
	//    2    4:areturn         
	}

	public static Type getGenericSuperclass(Class class1)
	{
		return class1.getGenericSuperclass();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #513 <Method Type Class.getGenericSuperclass()>
	//    2    4:areturn         
	}

	public static Class getOuterClass(Class class1)
	{
label0:
		{
			if(hasEnclosingMethod(class1))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #518 <Method boolean hasEnclosingMethod(Class)>
	//*   2    4:ifeq            9
				return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
			try
			{
				if(Modifier.isStatic(class1.getModifiers()))
					break label0;
	//    5    9:aload_0         
	//    6   10:invokevirtual   #172 <Method int Class.getModifiers()>
	//    7   13:invokestatic    #521 <Method boolean Modifier.isStatic(int)>
	//    8   16:ifne            26
				class1 = getEnclosingClass(class1);
	//    9   19:aload_0         
	//   10   20:invokestatic    #523 <Method Class getEnclosingClass(Class)>
	//   11   23:astore_0        
			}
	//*  12   24:aload_0         
	//*  13   25:areturn         
	//*  14   26:aconst_null     
	//*  15   27:areturn         
			// Misplaced declaration of an exception variable
			catch(Class class1)
	//*  16   28:astore_0        
			{
				return null;
	//   17   29:aconst_null     
	//   18   30:areturn         
			}
			return class1;
		}
		return null;
	}

	public static String getPackageName(Class class1)
	{
		class1 = ((Class) (class1.getPackage()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #528 <Method Package Class.getPackage()>
	//    2    4:astore_0        
		if(class1 == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return ((Package) (class1)).getName();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #531 <Method String Package.getName()>
	//    9   15:areturn         
	}

	public static Throwable getRootCause(Throwable throwable)
	{
		for(; throwable.getCause() != null; throwable = throwable.getCause());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #538 <Method Throwable Throwable.getCause()>
	//    2    4:ifnull          15
	//    3    7:aload_0         
	//    4    8:invokevirtual   #538 <Method Throwable Throwable.getCause()>
	//    5   11:astore_0        
	//*   6   12:goto            0
		return throwable;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public static boolean hasClass(Object obj, Class class1)
	{
		return obj != null && obj.getClass() == class1;
	//    0    0:aload_0         
	//    1    1:ifnull          14
	//    2    4:aload_0         
	//    3    5:invokevirtual   #206 <Method Class Object.getClass()>
	//    4    8:aload_1         
	//    5    9:if_acmpne       14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public static boolean hasEnclosingMethod(Class class1)
	{
		return !isObjectOrPrimitive(class1) && class1.getEnclosingMethod() != null;
	//    0    0:aload_0         
	//    1    1:invokestatic    #343 <Method boolean isObjectOrPrimitive(Class)>
	//    2    4:ifne            16
	//    3    7:aload_0         
	//    4    8:invokevirtual   #545 <Method Method Class.getEnclosingMethod()>
	//    5   11:ifnull          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public static boolean isBogusClass(Class class1)
	{
		return class1 == java/lang/Void || class1 == Void.TYPE || class1 == com/fasterxml/jackson/databind/annotation/NoClass;
	//    0    0:aload_0         
	//    1    1:ldc2            #549 <Class Void>
	//    2    4:if_acmpeq       26
	//    3    7:aload_0         
	//    4    8:getstatic       #550 <Field Class Void.TYPE>
	//    5   11:if_acmpeq       26
	//    6   14:aload_0         
	//    7   15:ldc2            #552 <Class NoClass>
	//    8   18:if_acmpne       24
	//    9   21:goto            26
	//   10   24:iconst_0        
	//   11   25:ireturn         
	//   12   26:iconst_1        
	//   13   27:ireturn         
	}

	public static boolean isConcrete(Class class1)
	{
		return (class1.getModifiers() & 0x600) == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #172 <Method int Class.getModifiers()>
	//    2    4:sipush          1536
	//    3    7:iand            
	//    4    8:ifne            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public static boolean isJacksonStdImpl(Class class1)
	{
		return class1.getAnnotation(com/fasterxml/jackson/databind/annotation/JacksonStdImpl) != null;
	//    0    0:aload_0         
	//    1    1:ldc2            #556 <Class JacksonStdImpl>
	//    2    4:invokevirtual   #557 <Method Annotation Class.getAnnotation(Class)>
	//    3    7:ifnull          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public static boolean isJacksonStdImpl(Object obj)
	{
		return obj == null || isJacksonStdImpl(obj.getClass());
	//    0    0:aload_0         
	//    1    1:ifnull          19
	//    2    4:aload_0         
	//    3    5:invokevirtual   #206 <Method Class Object.getClass()>
	//    4    8:invokestatic    #559 <Method boolean isJacksonStdImpl(Class)>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public static String isLocalType(Class class1, boolean flag)
	{
		if(hasEnclosingMethod(class1))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #518 <Method boolean hasEnclosingMethod(Class)>
	//*   2    4:ifeq            11
			return "local/anonymous";
	//    3    7:ldc2            #565 <String "local/anonymous">
	//    4   10:areturn         
		if(flag)
			break MISSING_BLOCK_LABEL_36;
	//    5   11:iload_1         
	//    6   12:ifne            36
		if(!Modifier.isStatic(class1.getModifiers()) && getEnclosingClass(class1) != null)
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #172 <Method int Class.getModifiers()>
	//*   9   19:invokestatic    #521 <Method boolean Modifier.isStatic(int)>
	//*  10   22:ifne            36
	//*  11   25:aload_0         
	//*  12   26:invokestatic    #523 <Method Class getEnclosingClass(Class)>
	//*  13   29:ifnull          36
			return "non-static member class";
	//   14   32:ldc2            #567 <String "non-static member class">
	//   15   35:areturn         
_L2:
		return null;
	//   16   36:aconst_null     
	//   17   37:areturn         
		class1;
	//   18   38:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  19   39:goto            36
	}

	public static boolean isNonStaticInnerClass(Class class1)
	{
		return !Modifier.isStatic(class1.getModifiers()) && getEnclosingClass(class1) != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #172 <Method int Class.getModifiers()>
	//    2    4:invokestatic    #521 <Method boolean Modifier.isStatic(int)>
	//    3    7:ifne            19
	//    4   10:aload_0         
	//    5   11:invokestatic    #523 <Method Class getEnclosingClass(Class)>
	//    6   14:ifnull          19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public static boolean isObjectOrPrimitive(Class class1)
	{
		return class1 == CLS_OBJECT || class1.isPrimitive();
	//    0    0:aload_0         
	//    1    1:getstatic       #24  <Field Class CLS_OBJECT>
	//    2    4:if_acmpeq       19
	//    3    7:aload_0         
	//    4    8:invokevirtual   #148 <Method boolean Class.isPrimitive()>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public static boolean isProxyType(Class class1)
	{
		class1 = ((Class) (class1.getName()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #191 <Method String Class.getName()>
	//    2    4:astore_0        
		return ((String) (class1)).startsWith("net.sf.cglib.proxy.") || ((String) (class1)).startsWith("org.hibernate.proxy.");
	//    3    5:aload_0         
	//    4    6:ldc2            #572 <String "net.sf.cglib.proxy.">
	//    5    9:invokevirtual   #576 <Method boolean String.startsWith(String)>
	//    6   12:ifne            30
	//    7   15:aload_0         
	//    8   16:ldc2            #578 <String "org.hibernate.proxy.">
	//    9   19:invokevirtual   #576 <Method boolean String.startsWith(String)>
	//   10   22:ifeq            28
	//   11   25:goto            30
	//   12   28:iconst_0        
	//   13   29:ireturn         
	//   14   30:iconst_1        
	//   15   31:ireturn         
	}

	public static String nameOf(Named named)
	{
		if(named == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "[null]";
	//    2    4:ldc1            #105 <String "[null]">
	//    3    6:areturn         
		else
			return backticked(named.getName());
	//    4    7:aload_0         
	//    5    8:invokeinterface #582 <Method String Named.getName()>
	//    6   13:invokestatic    #584 <Method String backticked(String)>
	//    7   16:areturn         
	}

	public static String nameOf(Class class1)
	{
		if(class1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "[null]";
	//    2    4:ldc1            #105 <String "[null]">
	//    3    6:areturn         
		int i = 0;
	//    4    7:iconst_0        
	//    5    8:istore_1        
		for(; class1.isArray(); class1 = class1.getComponentType())
	//*   6    9:aload_0         
	//*   7   10:invokevirtual   #138 <Method boolean Class.isArray()>
	//*   8   13:ifeq            28
			i++;
	//    9   16:iload_1         
	//   10   17:iconst_1        
	//   11   18:iadd            
	//   12   19:istore_1        

	//   13   20:aload_0         
	//   14   21:invokevirtual   #587 <Method Class Class.getComponentType()>
	//   15   24:astore_0        
	//*  16   25:goto            9
		if(class1.isPrimitive())
	//*  17   28:aload_0         
	//*  18   29:invokevirtual   #148 <Method boolean Class.isPrimitive()>
	//*  19   32:ifeq            43
			class1 = ((Class) (class1.getSimpleName()));
	//   20   35:aload_0         
	//   21   36:invokevirtual   #590 <Method String Class.getSimpleName()>
	//   22   39:astore_0        
		else
	//*  23   40:goto            48
			class1 = ((Class) (class1.getName()));
	//   24   43:aload_0         
	//   25   44:invokevirtual   #191 <Method String Class.getName()>
	//   26   47:astore_0        
		Object obj = ((Object) (class1));
	//   27   48:aload_0         
	//   28   49:astore_3        
		if(i > 0)
	//*  29   50:iload_1         
	//*  30   51:ifle            86
		{
			class1 = ((Class) (new StringBuilder(((String) (class1)))));
	//   31   54:new             #107 <Class StringBuilder>
	//   32   57:dup             
	//   33   58:aload_0         
	//   34   59:invokespecial   #591 <Method void StringBuilder(String)>
	//   35   62:astore_0        
			int j;
			do
			{
				((StringBuilder) (class1)).append("[]");
	//   36   63:aload_0         
	//   37   64:ldc2            #593 <String "[]">
	//   38   67:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   39   70:pop             
				j = i - 1;
	//   40   71:iload_1         
	//   41   72:iconst_1        
	//   42   73:isub            
	//   43   74:istore_2        
				i = j;
	//   44   75:iload_2         
	//   45   76:istore_1        
			} while(j > 0);
	//   46   77:iload_2         
	//   47   78:ifgt            63
			obj = ((Object) (((StringBuilder) (class1)).toString()));
	//   48   81:aload_0         
	//   49   82:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   50   85:astore_3        
		}
		return backticked(((String) (obj)));
	//   51   86:aload_3         
	//   52   87:invokestatic    #584 <Method String backticked(String)>
	//   53   90:areturn         
	}

	public static Object nonNull(Object obj, Object obj1)
	{
		Object obj2 = obj;
	//    0    0:aload_0         
	//    1    1:astore_2        
		if(obj == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       8
			obj2 = obj1;
	//    4    6:aload_1         
	//    5    7:astore_2        
		return obj2;
	//    6    8:aload_2         
	//    7    9:areturn         
	}

	public static String nonNullString(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return "";
	//    2    4:ldc2            #599 <String "">
	//    3    7:areturn         
		else
			return s;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public static String nullOrToString(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return obj.toString();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #601 <Method String Object.toString()>
	//    6   10:areturn         
	}

	public static Class primitiveType(Class class1)
	{
		if(class1.isPrimitive())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #148 <Method boolean Class.isPrimitive()>
	//*   2    4:ifeq            9
			return class1;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(class1 == java/lang/Integer)
	//*   5    9:aload_0         
	//*   6   10:ldc2            #283 <Class Integer>
	//*   7   13:if_acmpne       20
			return Integer.TYPE;
	//    8   16:getstatic       #286 <Field Class Integer.TYPE>
	//    9   19:areturn         
		if(class1 == java/lang/Long)
	//*  10   20:aload_0         
	//*  11   21:ldc2            #292 <Class Long>
	//*  12   24:if_acmpne       31
			return Long.TYPE;
	//   13   27:getstatic       #293 <Field Class Long.TYPE>
	//   14   30:areturn         
		if(class1 == java/lang/Boolean)
	//*  15   31:aload_0         
	//*  16   32:ldc2            #298 <Class Boolean>
	//*  17   35:if_acmpne       42
			return Boolean.TYPE;
	//   18   38:getstatic       #299 <Field Class Boolean.TYPE>
	//   19   41:areturn         
		if(class1 == java/lang/Double)
	//*  20   42:aload_0         
	//*  21   43:ldc2            #305 <Class Double>
	//*  22   46:if_acmpne       53
			return Double.TYPE;
	//   23   49:getstatic       #306 <Field Class Double.TYPE>
	//   24   52:areturn         
		if(class1 == java/lang/Float)
	//*  25   53:aload_0         
	//*  26   54:ldc2            #311 <Class Float>
	//*  27   57:if_acmpne       64
			return Float.TYPE;
	//   28   60:getstatic       #312 <Field Class Float.TYPE>
	//   29   63:areturn         
		if(class1 == java/lang/Byte)
	//*  30   64:aload_0         
	//*  31   65:ldc2            #317 <Class Byte>
	//*  32   68:if_acmpne       75
			return Byte.TYPE;
	//   33   71:getstatic       #318 <Field Class Byte.TYPE>
	//   34   74:areturn         
		if(class1 == java/lang/Short)
	//*  35   75:aload_0         
	//*  36   76:ldc2            #323 <Class Short>
	//*  37   79:if_acmpne       86
			return Short.TYPE;
	//   38   82:getstatic       #324 <Field Class Short.TYPE>
	//   39   85:areturn         
		if(class1 == java/lang/Character)
	//*  40   86:aload_0         
	//*  41   87:ldc2            #329 <Class Character>
	//*  42   90:if_acmpne       97
			return Character.TYPE;
	//   43   93:getstatic       #330 <Field Class Character.TYPE>
	//   44   96:areturn         
		else
			return null;
	//   45   97:aconst_null     
	//   46   98:areturn         
	}

	public static String quotedOr(Object obj, String s)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return s;
	//    2    4:aload_1         
	//    3    5:areturn         
		else
			return String.format("\"%s\"", new Object[] {
				obj
			});
	//    4    6:ldc2            #606 <String "\"%s\"">
	//    5    9:iconst_1        
	//    6   10:anewarray       Object[]
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:aload_0         
	//   10   16:aastore         
	//   11   17:invokestatic    #610 <Method String String.format(String, Object[])>
	//   12   20:areturn         
	}

	public static Class rawClass(JavaType javatype)
	{
		if(javatype == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return javatype.getRawClass();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #71  <Method Class JavaType.getRawClass()>
	//    6   10:areturn         
	}

	public static void throwAsIAE(Throwable throwable)
	{
		throwAsIAE(throwable, throwable.getMessage());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #615 <Method String Throwable.getMessage()>
	//    3    5:invokestatic    #617 <Method void throwAsIAE(Throwable, String)>
	//    4    8:return          
	}

	public static void throwAsIAE(Throwable throwable, String s)
	{
		throwIfRTE(throwable);
	//    0    0:aload_0         
	//    1    1:invokestatic    #247 <Method Throwable throwIfRTE(Throwable)>
	//    2    4:pop             
		throwIfError(throwable);
	//    3    5:aload_0         
	//    4    6:invokestatic    #620 <Method Throwable throwIfError(Throwable)>
	//    5    9:pop             
		throw new IllegalArgumentException(s, throwable);
	//    6   10:new             #198 <Class IllegalArgumentException>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:invokespecial   #623 <Method void IllegalArgumentException(String, Throwable)>
	//   11   19:athrow          
	}

	public static Object throwAsMappingException(DeserializationContext deserializationcontext, IOException ioexception)
		throws JsonMappingException
	{
		if(ioexception instanceof JsonMappingException)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #627 <Class JsonMappingException>
	//*   2    4:ifeq            12
		{
			throw (JsonMappingException)ioexception;
	//    3    7:aload_1         
	//    4    8:checkcast       #627 <Class JsonMappingException>
	//    5   11:athrow          
		} else
		{
			deserializationcontext = ((DeserializationContext) (JsonMappingException.from(deserializationcontext, ioexception.getMessage())));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #628 <Method String IOException.getMessage()>
	//    9   17:invokestatic    #632 <Method JsonMappingException JsonMappingException.from(DeserializationContext, String)>
	//   10   20:astore_0        
			((JsonMappingException) (deserializationcontext)).initCause(((Throwable) (ioexception)));
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #635 <Method Throwable JsonMappingException.initCause(Throwable)>
	//   14   26:pop             
			throw deserializationcontext;
	//   15   27:aload_0         
	//   16   28:athrow          
		}
	}

	public static Throwable throwIfError(Throwable throwable)
	{
		if(!(throwable instanceof Error))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #638 <Class Error>
	//*   2    4:ifne            9
			return throwable;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			throw (Error)throwable;
	//    5    9:aload_0         
	//    6   10:checkcast       #638 <Class Error>
	//    7   13:athrow          
	}

	public static Throwable throwIfIOE(Throwable throwable)
		throws IOException
	{
		if(!(throwable instanceof IOException))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #216 <Class IOException>
	//*   2    4:ifne            9
			return throwable;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			throw (IOException)throwable;
	//    5    9:aload_0         
	//    6   10:checkcast       #216 <Class IOException>
	//    7   13:athrow          
	}

	public static Throwable throwIfRTE(Throwable throwable)
	{
		if(!(throwable instanceof RuntimeException))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #249 <Class RuntimeException>
	//*   2    4:ifne            9
			return throwable;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			throw (RuntimeException)throwable;
	//    5    9:aload_0         
	//    6   10:checkcast       #249 <Class RuntimeException>
	//    7   13:athrow          
	}

	public static Throwable throwRootCauseIfIOE(Throwable throwable)
		throws IOException
	{
		return throwIfIOE(getRootCause(throwable));
	//    0    0:aload_0         
	//    1    1:invokestatic    #641 <Method Throwable getRootCause(Throwable)>
	//    2    4:invokestatic    #244 <Method Throwable throwIfIOE(Throwable)>
	//    3    7:areturn         
	}

	public static void unwrapAndThrowAsIAE(Throwable throwable)
	{
		throwAsIAE(getRootCause(throwable));
	//    0    0:aload_0         
	//    1    1:invokestatic    #641 <Method Throwable getRootCause(Throwable)>
	//    2    4:invokestatic    #643 <Method void throwAsIAE(Throwable)>
	//    3    7:return          
	}

	public static void unwrapAndThrowAsIAE(Throwable throwable, String s)
	{
		throwAsIAE(getRootCause(throwable), s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #641 <Method Throwable getRootCause(Throwable)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #617 <Method void throwAsIAE(Throwable, String)>
	//    4    8:return          
	}

	public static void verifyMustOverride(Class class1, Object obj, String s)
	{
		if(obj.getClass() == class1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #206 <Method Class Object.getClass()>
	//*   2    4:aload_0         
	//*   3    5:if_acmpne       9
			return;
	//    4    8:return          
		else
			throw new IllegalStateException(String.format("Sub-class %s (of class %s) must override method '%s'", new Object[] {
				obj.getClass().getName(), class1.getName(), s
			}));
	//    5    9:new             #647 <Class IllegalStateException>
	//    6   12:dup             
	//    7   13:ldc2            #649 <String "Sub-class %s (of class %s) must override method '%s'">
	//    8   16:iconst_3        
	//    9   17:anewarray       Object[]
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:aload_1         
	//   13   23:invokevirtual   #206 <Method Class Object.getClass()>
	//   14   26:invokevirtual   #191 <Method String Class.getName()>
	//   15   29:aastore         
	//   16   30:dup             
	//   17   31:iconst_1        
	//   18   32:aload_0         
	//   19   33:invokevirtual   #191 <Method String Class.getName()>
	//   20   36:aastore         
	//   21   37:dup             
	//   22   38:iconst_2        
	//   23   39:aload_2         
	//   24   40:aastore         
	//   25   41:invokestatic    #610 <Method String String.format(String, Object[])>
	//   26   44:invokespecial   #650 <Method void IllegalStateException(String)>
	//   27   47:athrow          
	}

	public static Class wrapperType(Class class1)
	{
		if(class1 == Integer.TYPE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #286 <Field Class Integer.TYPE>
	//*   2    4:if_acmpne       11
			return java/lang/Integer;
	//    3    7:ldc2            #283 <Class Integer>
	//    4   10:areturn         
		if(class1 == Long.TYPE)
	//*   5   11:aload_0         
	//*   6   12:getstatic       #293 <Field Class Long.TYPE>
	//*   7   15:if_acmpne       22
			return java/lang/Long;
	//    8   18:ldc2            #292 <Class Long>
	//    9   21:areturn         
		if(class1 == Boolean.TYPE)
	//*  10   22:aload_0         
	//*  11   23:getstatic       #299 <Field Class Boolean.TYPE>
	//*  12   26:if_acmpne       33
			return java/lang/Boolean;
	//   13   29:ldc2            #298 <Class Boolean>
	//   14   32:areturn         
		if(class1 == Double.TYPE)
	//*  15   33:aload_0         
	//*  16   34:getstatic       #306 <Field Class Double.TYPE>
	//*  17   37:if_acmpne       44
			return java/lang/Double;
	//   18   40:ldc2            #305 <Class Double>
	//   19   43:areturn         
		if(class1 == Float.TYPE)
	//*  20   44:aload_0         
	//*  21   45:getstatic       #312 <Field Class Float.TYPE>
	//*  22   48:if_acmpne       55
			return java/lang/Float;
	//   23   51:ldc2            #311 <Class Float>
	//   24   54:areturn         
		if(class1 == Byte.TYPE)
	//*  25   55:aload_0         
	//*  26   56:getstatic       #318 <Field Class Byte.TYPE>
	//*  27   59:if_acmpne       66
			return java/lang/Byte;
	//   28   62:ldc2            #317 <Class Byte>
	//   29   65:areturn         
		if(class1 == Short.TYPE)
	//*  30   66:aload_0         
	//*  31   67:getstatic       #324 <Field Class Short.TYPE>
	//*  32   70:if_acmpne       77
			return java/lang/Short;
	//   33   73:ldc2            #323 <Class Short>
	//   34   76:areturn         
		if(class1 == Character.TYPE)
	//*  35   77:aload_0         
	//*  36   78:getstatic       #330 <Field Class Character.TYPE>
	//*  37   81:if_acmpne       88
		{
			return java/lang/Character;
	//   38   84:ldc2            #329 <Class Character>
	//   39   87:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   40   88:new             #107 <Class StringBuilder>
	//   41   91:dup             
	//   42   92:invokespecial   #181 <Method void StringBuilder()>
	//   43   95:astore_1        
			stringbuilder.append("Class ");
	//   44   96:aload_1         
	//   45   97:ldc2            #276 <String "Class ">
	//   46  100:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   47  103:pop             
			stringbuilder.append(class1.getName());
	//   48  104:aload_1         
	//   49  105:aload_0         
	//   50  106:invokevirtual   #191 <Method String Class.getName()>
	//   51  109:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   52  112:pop             
			stringbuilder.append(" is not a primitive type");
	//   53  113:aload_1         
	//   54  114:ldc2            #335 <String " is not a primitive type">
	//   55  117:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   56  120:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   57  121:new             #198 <Class IllegalArgumentException>
	//   58  124:dup             
	//   59  125:aload_1         
	//   60  126:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   61  129:invokespecial   #201 <Method void IllegalArgumentException(String)>
	//   62  132:athrow          
		}
	}

	private static final Class CLS_OBJECT = java/lang/Object;
	private static final Iterator EMPTY_ITERATOR = Collections.emptyIterator();
	private static final Annotation NO_ANNOTATIONS[] = new Annotation[0];
	private static final Ctor NO_CTORS[] = new Ctor[0];

	static 
	{
	//    0    0:ldc1            #4   <Class Object>
	//    1    2:putstatic       #24  <Field Class CLS_OBJECT>
	//    2    5:iconst_0        
	//    3    6:anewarray       Annotation[]
	//    4    9:putstatic       #28  <Field Annotation[] NO_ANNOTATIONS>
	//    5   12:iconst_0        
	//    6   13:anewarray       Ctor[]
	//    7   16:putstatic       #30  <Field ClassUtil$Ctor[] NO_CTORS>
	//    8   19:invokestatic    #36  <Method Iterator Collections.emptyIterator()>
	//    9   22:putstatic       #38  <Field Iterator EMPTY_ITERATOR>
	//*  10   25:return          
	}
}
