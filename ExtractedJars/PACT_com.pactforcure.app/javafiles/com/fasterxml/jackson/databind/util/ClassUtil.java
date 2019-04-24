// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.annotation.NoClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			LRUMap

public final class ClassUtil
{
	private static final class ClassMetadata
	{

		private boolean isObjectOrPrimitive()
		{
			return _forClass == ClassUtil.CLS_OBJECT || _forClass.isPrimitive();
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field Class _forClass>
		//    2    4:invokestatic    #54  <Method Class ClassUtil.access$100()>
		//    3    7:if_acmpeq       20
		//    4   10:aload_0         
		//    5   11:getfield        #46  <Field Class _forClass>
		//    6   14:invokevirtual   #59  <Method boolean Class.isPrimitive()>
		//    7   17:ifeq            22
		//    8   20:iconst_1        
		//    9   21:ireturn         
		//   10   22:iconst_0        
		//   11   23:ireturn         
		}

		public Ctor[] getConstructors()
		{
			Ctor actor[];
			Ctor actor1[];
			actor1 = _constructors;
		//    0    0:aload_0         
		//    1    1:getfield        #63  <Field ClassUtil$Ctor[] _constructors>
		//    2    4:astore          4
			actor = actor1;
		//    3    6:aload           4
		//    4    8:astore_3        
			if(actor1 != null) goto _L2; else goto _L1
		//    5    9:aload           4
		//    6   11:ifnonnull       40
_L1:
			if(!_forClass.isInterface() && !isObjectOrPrimitive()) goto _L4; else goto _L3
		//    7   14:aload_0         
		//    8   15:getfield        #46  <Field Class _forClass>
		//    9   18:invokevirtual   #66  <Method boolean Class.isInterface()>
		//   10   21:ifne            31
		//   11   24:aload_0         
		//   12   25:invokespecial   #68  <Method boolean isObjectOrPrimitive()>
		//   13   28:ifeq            42
_L3:
			actor = NO_CTORS;
		//   14   31:getstatic       #39  <Field ClassUtil$Ctor[] NO_CTORS>
		//   15   34:astore_3        
_L6:
			_constructors = actor;
		//   16   35:aload_0         
		//   17   36:aload_3         
		//   18   37:putfield        #63  <Field ClassUtil$Ctor[] _constructors>
_L2:
			return actor;
		//   19   40:aload_3         
		//   20   41:areturn         
_L4:
			Constructor aconstructor[] = _forClass.getDeclaredConstructors();
		//   21   42:aload_0         
		//   22   43:getfield        #46  <Field Class _forClass>
		//   23   46:invokevirtual   #72  <Method Constructor[] Class.getDeclaredConstructors()>
		//   24   49:astore          5
			int j = aconstructor.length;
		//   25   51:aload           5
		//   26   53:arraylength     
		//   27   54:istore_2        
			Ctor actor2[] = new Ctor[j];
		//   28   55:iload_2         
		//   29   56:anewarray       Ctor[]
		//   30   59:astore          4
			int i = 0;
		//   31   61:iconst_0        
		//   32   62:istore_1        
			do
			{
				actor = actor2;
		//   33   63:aload           4
		//   34   65:astore_3        
				if(i >= j)
					continue;
		//   35   66:iload_1         
		//   36   67:iload_2         
		//   37   68:icmpge          35
				actor2[i] = new Ctor(aconstructor[i]);
		//   38   71:aload           4
		//   39   73:iload_1         
		//   40   74:new             #37  <Class ClassUtil$Ctor>
		//   41   77:dup             
		//   42   78:aload           5
		//   43   80:iload_1         
		//   44   81:aaload          
		//   45   82:invokespecial   #75  <Method void ClassUtil$Ctor(Constructor)>
		//   46   85:aastore         
				i++;
		//   47   86:iload_1         
		//   48   87:iconst_1        
		//   49   88:iadd            
		//   50   89:istore_1        
			} while(true);
		//   51   90:goto            63
			if(true) goto _L6; else goto _L5
_L5:
		}

		public Annotation[] getDeclaredAnnotations()
		{
			Annotation aannotation1[] = _annotations;
		//    0    0:aload_0         
		//    1    1:getfield        #79  <Field Annotation[] _annotations>
		//    2    4:astore_2        
			Annotation aannotation[] = aannotation1;
		//    3    5:aload_2         
		//    4    6:astore_1        
			if(aannotation1 == null)
		//*   5    7:aload_2         
		//*   6    8:ifnonnull       27
			{
				if(isObjectOrPrimitive())
		//*   7   11:aload_0         
		//*   8   12:invokespecial   #68  <Method boolean isObjectOrPrimitive()>
		//*   9   15:ifeq            29
					aannotation = NO_ANNOTATIONS;
		//   10   18:getstatic       #35  <Field Annotation[] NO_ANNOTATIONS>
		//   11   21:astore_1        
				else
		//*  12   22:aload_0         
		//*  13   23:aload_1         
		//*  14   24:putfield        #79  <Field Annotation[] _annotations>
		//*  15   27:aload_1         
		//*  16   28:areturn         
					aannotation = _forClass.getDeclaredAnnotations();
		//   17   29:aload_0         
		//   18   30:getfield        #46  <Field Class _forClass>
		//   19   33:invokevirtual   #81  <Method Annotation[] Class.getDeclaredAnnotations()>
		//   20   36:astore_1        
				_annotations = aannotation;
			}
			return aannotation;
		//*  21   37:goto            22
		}

		public Field[] getDeclaredFields()
		{
			Field afield1[] = _fields;
		//    0    0:aload_0         
		//    1    1:getfield        #85  <Field Field[] _fields>
		//    2    4:astore_2        
			Field afield[] = afield1;
		//    3    5:aload_2         
		//    4    6:astore_1        
			if(afield1 == null)
		//*   5    7:aload_2         
		//*   6    8:ifnonnull       24
			{
				afield = _forClass.getDeclaredFields();
		//    7   11:aload_0         
		//    8   12:getfield        #46  <Field Class _forClass>
		//    9   15:invokevirtual   #87  <Method Field[] Class.getDeclaredFields()>
		//   10   18:astore_1        
				_fields = afield;
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:putfield        #85  <Field Field[] _fields>
			}
			return afield;
		//   14   24:aload_1         
		//   15   25:areturn         
		}

		public Method[] getDeclaredMethods()
		{
			Method amethod1[] = _methods;
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field Method[] _methods>
		//    2    4:astore_2        
			Method amethod[] = amethod1;
		//    3    5:aload_2         
		//    4    6:astore_1        
			if(amethod1 == null)
		//*   5    7:aload_2         
		//*   6    8:ifnonnull       24
			{
				amethod = _forClass.getDeclaredMethods();
		//    7   11:aload_0         
		//    8   12:getfield        #46  <Field Class _forClass>
		//    9   15:invokevirtual   #93  <Method Method[] Class.getDeclaredMethods()>
		//   10   18:astore_1        
				_methods = amethod;
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:putfield        #91  <Field Method[] _methods>
			}
			return amethod;
		//   14   24:aload_1         
		//   15   25:areturn         
		}

		public Type[] getGenericInterfaces()
		{
			Type atype1[] = _genericInterfaces;
		//    0    0:aload_0         
		//    1    1:getfield        #97  <Field Type[] _genericInterfaces>
		//    2    4:astore_2        
			Type atype[] = atype1;
		//    3    5:aload_2         
		//    4    6:astore_1        
			if(atype1 == null)
		//*   5    7:aload_2         
		//*   6    8:ifnonnull       24
			{
				atype = _forClass.getGenericInterfaces();
		//    7   11:aload_0         
		//    8   12:getfield        #46  <Field Class _forClass>
		//    9   15:invokevirtual   #99  <Method Type[] Class.getGenericInterfaces()>
		//   10   18:astore_1        
				_genericInterfaces = atype;
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:putfield        #97  <Field Type[] _genericInterfaces>
			}
			return atype;
		//   14   24:aload_1         
		//   15   25:areturn         
		}

		public Class[] getInterfaces()
		{
			Class aclass1[] = _interfaces;
		//    0    0:aload_0         
		//    1    1:getfield        #103 <Field Class[] _interfaces>
		//    2    4:astore_2        
			Class aclass[] = aclass1;
		//    3    5:aload_2         
		//    4    6:astore_1        
			if(aclass1 == null)
		//*   5    7:aload_2         
		//*   6    8:ifnonnull       24
			{
				aclass = _forClass.getInterfaces();
		//    7   11:aload_0         
		//    8   12:getfield        #46  <Field Class _forClass>
		//    9   15:invokevirtual   #105 <Method Class[] Class.getInterfaces()>
		//   10   18:astore_1        
				_interfaces = aclass;
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:putfield        #103 <Field Class[] _interfaces>
			}
			return aclass;
		//   14   24:aload_1         
		//   15   25:areturn         
		}

		public String getPackageName()
		{
			String s = _packageName;
		//    0    0:aload_0         
		//    1    1:getfield        #110 <Field String _packageName>
		//    2    4:astore_2        
			Object obj = ((Object) (s));
		//    3    5:aload_2         
		//    4    6:astore_1        
			if(s == null)
		//*   5    7:aload_2         
		//*   6    8:ifnonnull       41
			{
				obj = ((Object) (_forClass.getPackage()));
		//    7   11:aload_0         
		//    8   12:getfield        #46  <Field Class _forClass>
		//    9   15:invokevirtual   #114 <Method Package Class.getPackage()>
		//   10   18:astore_1        
				Object obj1;
				if(obj == null)
		//*  11   19:aload_1         
		//*  12   20:ifnonnull       53
					obj = null;
		//   13   23:aconst_null     
		//   14   24:astore_1        
				else
		//*  15   25:aload_1         
		//*  16   26:astore_2        
		//*  17   27:aload_1         
		//*  18   28:ifnonnull       34
		//*  19   31:ldc1            #116 <String "">
		//*  20   33:astore_2        
		//*  21   34:aload_0         
		//*  22   35:aload_2         
		//*  23   36:putfield        #110 <Field String _packageName>
		//*  24   39:aload_2         
		//*  25   40:astore_1        
		//*  26   41:aload_1         
		//*  27   42:astore_2        
		//*  28   43:aload_1         
		//*  29   44:ldc1            #116 <String "">
		//*  30   46:if_acmpne       51
		//*  31   49:aconst_null     
		//*  32   50:astore_2        
		//*  33   51:aload_2         
		//*  34   52:areturn         
					obj = ((Object) (((Package) (obj)).getName()));
		//   35   53:aload_1         
		//   36   54:invokevirtual   #121 <Method String Package.getName()>
		//   37   57:astore_1        
				obj1 = obj;
				if(obj == null)
					obj1 = "";
				_packageName = ((String) (obj1));
				obj = obj1;
			}
			obj1 = obj;
			if(obj == "")
				obj1 = null;
			return ((String) (obj1));
		//*  38   58:goto            25
		}

		public boolean hasEnclosingMethod()
		{
			Boolean boolean2 = _hasEnclosingMethod;
		//    0    0:aload_0         
		//    1    1:getfield        #124 <Field Boolean _hasEnclosingMethod>
		//    2    4:astore_3        
			Boolean boolean1 = boolean2;
		//    3    5:aload_3         
		//    4    6:astore_2        
			if(boolean2 == null)
		//*   5    7:aload_3         
		//*   6    8:ifnonnull       27
			{
				if(isObjectOrPrimitive())
		//*   7   11:aload_0         
		//*   8   12:invokespecial   #68  <Method boolean isObjectOrPrimitive()>
		//*   9   15:ifeq            32
				{
					boolean1 = Boolean.FALSE;
		//   10   18:getstatic       #129 <Field Boolean Boolean.FALSE>
		//   11   21:astore_2        
				} else
		//*  12   22:aload_0         
		//*  13   23:aload_2         
		//*  14   24:putfield        #124 <Field Boolean _hasEnclosingMethod>
		//*  15   27:aload_2         
		//*  16   28:invokevirtual   #132 <Method boolean Boolean.booleanValue()>
		//*  17   31:ireturn         
				{
					boolean flag;
					if(_forClass.getEnclosingMethod() != null)
		//*  18   32:aload_0         
		//*  19   33:getfield        #46  <Field Class _forClass>
		//*  20   36:invokevirtual   #136 <Method Method Class.getEnclosingMethod()>
		//*  21   39:ifnull          52
						flag = true;
		//   22   42:iconst_1        
		//   23   43:istore_1        
					else
		//*  24   44:iload_1         
		//*  25   45:invokestatic    #140 <Method Boolean Boolean.valueOf(boolean)>
		//*  26   48:astore_2        
		//*  27   49:goto            22
						flag = false;
		//   28   52:iconst_0        
		//   29   53:istore_1        
					boolean1 = Boolean.valueOf(flag);
				}
				_hasEnclosingMethod = boolean1;
			}
			return boolean1.booleanValue();
		//*  30   54:goto            44
		}

		private static final Annotation NO_ANNOTATIONS[] = new Annotation[0];
		private static final Ctor NO_CTORS[] = new Ctor[0];
		private Annotation _annotations[];
		private Ctor _constructors[];
		private Field _fields[];
		private final Class _forClass;
		private Type _genericInterfaces[];
		private Boolean _hasEnclosingMethod;
		private Class _interfaces[];
		private Method _methods[];
		private String _packageName;

		static 
		{
		//    0    0:iconst_0        
		//    1    1:anewarray       Annotation[]
		//    2    4:putstatic       #35  <Field Annotation[] NO_ANNOTATIONS>
		//    3    7:iconst_0        
		//    4    8:anewarray       Ctor[]
		//    5   11:putstatic       #39  <Field ClassUtil$Ctor[] NO_CTORS>
		//*   6   14:return          
		}

		public ClassMetadata(Class class1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #44  <Method void Object()>
			_forClass = class1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #46  <Field Class _forClass>
		//    5    9:return          
		}
	}

	public static final class Ctor
	{

		public Constructor getConstructor()
		{
			return _ctor;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Constructor _ctor>
		//    2    4:areturn         
		}

		public Annotation[] getDeclaredAnnotations()
		{
			Annotation aannotation1[] = _annotations;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Annotation[] _annotations>
		//    2    4:astore_2        
			Annotation aannotation[] = aannotation1;
		//    3    5:aload_2         
		//    4    6:astore_1        
			if(aannotation1 == null)
		//*   5    7:aload_2         
		//*   6    8:ifnonnull       24
			{
				aannotation = _ctor.getDeclaredAnnotations();
		//    7   11:aload_0         
		//    8   12:getfield        #25  <Field Constructor _ctor>
		//    9   15:invokevirtual   #39  <Method Annotation[] Constructor.getDeclaredAnnotations()>
		//   10   18:astore_1        
				_annotations = aannotation;
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:putfield        #35  <Field Annotation[] _annotations>
			}
			return aannotation;
		//   14   24:aload_1         
		//   15   25:areturn         
		}

		public Class getDeclaringClass()
		{
			return _ctor.getDeclaringClass();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Constructor _ctor>
		//    2    4:invokevirtual   #43  <Method Class Constructor.getDeclaringClass()>
		//    3    7:areturn         
		}

		public int getParamCount()
		{
			int j = _paramCount;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field int _paramCount>
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
		//    8   12:getfield        #25  <Field Constructor _ctor>
		//    9   15:invokevirtual   #50  <Method Class[] Constructor.getParameterTypes()>
		//   10   18:arraylength     
		//   11   19:istore_1        
				_paramCount = i;
		//   12   20:aload_0         
		//   13   21:iload_1         
		//   14   22:putfield        #23  <Field int _paramCount>
			}
			return i;
		//   15   25:iload_1         
		//   16   26:ireturn         
		}

		public Annotation[][] getParameterAnnotations()
		{
			Annotation aannotation1[][] = _paramAnnotations;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field Annotation[][] _paramAnnotations>
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
		//    8   12:getfield        #25  <Field Constructor _ctor>
		//    9   15:invokevirtual   #56  <Method Annotation[][] Constructor.getParameterAnnotations()>
		//   10   18:astore_1        
				_paramAnnotations = aannotation;
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:putfield        #54  <Field Annotation[][] _paramAnnotations>
			}
			return aannotation;
		//   14   24:aload_1         
		//   15   25:areturn         
		}

		private Annotation _annotations[];
		public final Constructor _ctor;
		private Annotation _paramAnnotations[][];
		private int _paramCount;

		public Ctor(Constructor constructor)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			_paramCount = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #23  <Field int _paramCount>
			_ctor = constructor;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #25  <Field Constructor _ctor>
		//    8   14:return          
		}
	}

	private static final class EmptyIterator
		implements Iterator
	{

		public boolean hasNext()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public Object next()
		{
			throw new NoSuchElementException();
		//    0    0:new             #23  <Class NoSuchElementException>
		//    1    3:dup             
		//    2    4:invokespecial   #24  <Method void NoSuchElementException()>
		//    3    7:athrow          
		}

		public void remove()
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #29  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #30  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		private EmptyIterator()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
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
			int i;
			int j;
			Object obj;
			Field afield[];
			obj = null;
		//    0    0:aconst_null     
		//    1    1:astore          5
			afield = ClassUtil.getDeclaredFields(class1);
		//    2    3:aload_0         
		//    3    4:invokestatic    #57  <Method Field[] ClassUtil.getDeclaredFields(Class)>
		//    4    7:astore          6
			j = afield.length;
		//    5    9:aload           6
		//    6   11:arraylength     
		//    7   12:istore          4
			i = 0;
		//    8   14:iconst_0        
		//    9   15:istore_3        
_L2:
			class1 = ((Class) (obj));
		//   10   16:aload           5
		//   11   18:astore_0        
			if(i < j)
		//*  12   19:iload_3         
		//*  13   20:iload           4
		//*  14   22:icmpge          49
			{
				class1 = ((Class) (afield[i]));
		//   15   25:aload           6
		//   16   27:iload_3         
		//   17   28:aaload          
		//   18   29:astore_0        
				if(!s.equals(((Object) (((Field) (class1)).getName()))) || ((Field) (class1)).getType() != class2)
					break MISSING_BLOCK_LABEL_93;
		//   19   30:aload_1         
		//   20   31:aload_0         
		//   21   32:invokevirtual   #61  <Method String Field.getName()>
		//   22   35:invokevirtual   #67  <Method boolean String.equals(Object)>
		//   23   38:ifeq            93
		//   24   41:aload_0         
		//   25   42:invokevirtual   #71  <Method Class Field.getType()>
		//   26   45:aload_2         
		//   27   46:if_acmpne       93
			}
label0:
			{
				s = ((String) (class1));
		//   28   49:aload_0         
		//   29   50:astore_1        
				if(class1 == null)
		//*  30   51:aload_0         
		//*  31   52:ifnonnull       112
				{
					j = afield.length;
		//   32   55:aload           6
		//   33   57:arraylength     
		//   34   58:istore          4
					i = 0;
		//   35   60:iconst_0        
		//   36   61:istore_3        
					break label0;
				}
			}
			break MISSING_BLOCK_LABEL_112;
		//*  37   62:aload_0         
		//*  38   63:astore_1        
		//*  39   64:iload_3         
		//*  40   65:iload           4
		//*  41   67:icmpge          112
		//*  42   70:aload           6
		//*  43   72:iload_3         
		//*  44   73:aaload          
		//*  45   74:astore          5
		//*  46   76:aload_0         
		//*  47   77:astore_1        
		//*  48   78:aload           5
		//*  49   80:invokevirtual   #71  <Method Class Field.getType()>
		//*  50   83:aload_2         
		//*  51   84:if_acmpne       103
		//*  52   87:aload_0         
		//*  53   88:ifnull          100
		//*  54   91:aconst_null     
		//*  55   92:areturn         
			i++;
		//   56   93:iload_3         
		//   57   94:iconst_1        
		//   58   95:iadd            
		//   59   96:istore_3        
			continue; /* Loop/switch isn't completed */
		//   60   97:goto            16
			while(true) 
			{
				s = ((String) (class1));
				if(i >= j)
					break;
				Field field = afield[i];
				s = ((String) (class1));
				if(field.getType() == class2)
				{
					if(class1 != null)
						return null;
					s = ((String) (field));
		//   61  100:aload           5
		//   62  102:astore_1        
				}
				i++;
		//   63  103:iload_3         
		//   64  104:iconst_1        
		//   65  105:iadd            
		//   66  106:istore_3        
				class1 = ((Class) (s));
		//   67  107:aload_1         
		//   68  108:astore_0        
			}
		//   69  109:goto            62
			if(s != null)
		//*  70  112:aload_1         
		//*  71  113:ifnull          121
				try
				{
					((Field) (s)).setAccessible(true);
		//   72  116:aload_1         
		//   73  117:iconst_1        
		//   74  118:invokevirtual   #75  <Method void Field.setAccessible(boolean)>
				}
		//*  75  121:aload_1         
		//*  76  122:areturn         
				// Misplaced declaration of an exception variable
				catch(Class class1) { }
		//   77  123:astore_0        
			return ((Field) (s));
			if(true) goto _L2; else goto _L1
		//   78  124:goto            121
_L1:
		}

		public Class enumTypeFor(EnumMap enummap)
		{
			if(enumMapTypeField != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #37  <Field Field enumMapTypeField>
		//*   2    4:ifnull          20
				return (Class)get(((Object) (enummap)), enumMapTypeField);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #37  <Field Field enumMapTypeField>
		//    7   13:invokespecial   #81  <Method Object get(Object, Field)>
		//    8   16:checkcast       #27  <Class Class>
		//    9   19:areturn         
			else
				throw new IllegalStateException("Can not figure out type for EnumMap (odd JDK platform?)");
		//   10   20:new             #83  <Class IllegalStateException>
		//   11   23:dup             
		//   12   24:ldc1            #85  <String "Can not figure out type for EnumMap (odd JDK platform?)">
		//   13   26:invokespecial   #88  <Method void IllegalStateException(String)>
		//   14   29:athrow          
		}

		public Class enumTypeFor(EnumSet enumset)
		{
			if(enumSetTypeField != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #33  <Field Field enumSetTypeField>
		//*   2    4:ifnull          20
				return (Class)get(((Object) (enumset)), enumSetTypeField);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #33  <Field Field enumSetTypeField>
		//    7   13:invokespecial   #81  <Method Object get(Object, Field)>
		//    8   16:checkcast       #27  <Class Class>
		//    9   19:areturn         
			else
				throw new IllegalStateException("Can not figure out type for EnumSet (odd JDK platform?)");
		//   10   20:new             #83  <Class IllegalStateException>
		//   11   23:dup             
		//   12   24:ldc1            #92  <String "Can not figure out type for EnumSet (odd JDK platform?)">
		//   13   26:invokespecial   #88  <Method void IllegalStateException(String)>
		//   14   29:athrow          
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


	public ClassUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
	//    2    4:return          
	}

	private static void _addRawSuperTypes(Class class1, Class class2, Collection collection, boolean flag)
	{
		if(class1 != class2 && class1 != null && class1 != java/lang/Object) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       15
	//    3    5:aload_0         
	//    4    6:ifnull          15
	//    5    9:aload_0         
	//    6   10:ldc1            #4   <Class Object>
	//    7   12:if_acmpne       16
_L1:
		return;
	//    8   15:return          
_L2:
		if(!flag)
			break; /* Loop/switch isn't completed */
	//    9   16:iload_3         
	//   10   17:ifeq            38
		if(collection.contains(((Object) (class1))))
			continue; /* Loop/switch isn't completed */
	//   11   20:aload_2         
	//   12   21:aload_0         
	//   13   22:invokeinterface #55  <Method boolean Collection.contains(Object)>
	//   14   27:ifne            15
		collection.add(((Object) (class1)));
	//   15   30:aload_2         
	//   16   31:aload_0         
	//   17   32:invokeinterface #58  <Method boolean Collection.add(Object)>
	//   18   37:pop             
		break; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L3
_L3:
		Class aclass[] = _interfaces(class1);
	//   19   38:aload_0         
	//   20   39:invokestatic    #62  <Method Class[] _interfaces(Class)>
	//   21   42:astore          6
		int j = aclass.length;
	//   22   44:aload           6
	//   23   46:arraylength     
	//   24   47:istore          5
		for(int i = 0; i < j; i++)
	//*  25   49:iconst_0        
	//*  26   50:istore          4
	//*  27   52:iload           4
	//*  28   54:iload           5
	//*  29   56:icmpge          79
			_addRawSuperTypes(aclass[i], class2, collection, true);
	//   30   59:aload           6
	//   31   61:iload           4
	//   32   63:aaload          
	//   33   64:aload_1         
	//   34   65:aload_2         
	//   35   66:iconst_1        
	//   36   67:invokestatic    #64  <Method void _addRawSuperTypes(Class, Class, Collection, boolean)>

	//   37   70:iload           4
	//   38   72:iconst_1        
	//   39   73:iadd            
	//   40   74:istore          4
	//*  41   76:goto            52
		_addRawSuperTypes(class1.getSuperclass(), class2, collection, true);
	//   42   79:aload_0         
	//   43   80:invokevirtual   #70  <Method Class Class.getSuperclass()>
	//   44   83:aload_1         
	//   45   84:aload_2         
	//   46   85:iconst_1        
	//   47   86:invokestatic    #64  <Method void _addRawSuperTypes(Class, Class, Collection, boolean)>
		return;
	//   48   89:return          
	}

	private static void _addSuperTypes(JavaType javatype, Class class1, Collection collection, boolean flag)
	{
		if(javatype != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       5
_L1:
		Class class2;
		return;
	//    2    4:return          
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #79  <Method Class JavaType.getRawClass()>
	//*   5    9:astore          4
_L2:
		if((class2 = javatype.getRawClass()) == class1 || class2 == java/lang/Object)
			continue; /* Loop/switch isn't completed */
	//    6   11:aload           4
	//    7   13:aload_1         
	//    8   14:if_acmpeq       4
	//    9   17:aload           4
	//   10   19:ldc1            #4   <Class Object>
	//   11   21:if_acmpeq       4
		if(!flag)
			break; /* Loop/switch isn't completed */
	//   12   24:iload_3         
	//   13   25:ifeq            46
		if(collection.contains(((Object) (javatype))))
			continue; /* Loop/switch isn't completed */
	//   14   28:aload_2         
	//   15   29:aload_0         
	//   16   30:invokeinterface #55  <Method boolean Collection.contains(Object)>
	//   17   35:ifne            4
		collection.add(((Object) (javatype)));
	//   18   38:aload_2         
	//   19   39:aload_0         
	//   20   40:invokeinterface #58  <Method boolean Collection.add(Object)>
	//   21   45:pop             
		break; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L3
_L3:
		for(Iterator iterator = javatype.getInterfaces().iterator(); iterator.hasNext(); _addSuperTypes((JavaType)iterator.next(), class1, collection, true));
	//   22   46:aload_0         
	//   23   47:invokevirtual   #83  <Method List JavaType.getInterfaces()>
	//   24   50:invokeinterface #89  <Method Iterator List.iterator()>
	//   25   55:astore          4
	//   26   57:aload           4
	//   27   59:invokeinterface #95  <Method boolean Iterator.hasNext()>
	//   28   64:ifeq            86
	//   29   67:aload           4
	//   30   69:invokeinterface #99  <Method Object Iterator.next()>
	//   31   74:checkcast       #76  <Class JavaType>
	//   32   77:aload_1         
	//   33   78:aload_2         
	//   34   79:iconst_1        
	//   35   80:invokestatic    #101 <Method void _addSuperTypes(JavaType, Class, Collection, boolean)>
	//*  36   83:goto            57
		_addSuperTypes(javatype.getSuperClass(), class1, collection, true);
	//   37   86:aload_0         
	//   38   87:invokevirtual   #105 <Method JavaType JavaType.getSuperClass()>
	//   39   90:aload_1         
	//   40   91:aload_2         
	//   41   92:iconst_1        
	//   42   93:invokestatic    #101 <Method void _addSuperTypes(JavaType, Class, Collection, boolean)>
		return;
	//   43   96:return          
	}

	private static ClassMetadata _getMetadata(Class class1)
	{
		ClassMetadata classmetadata = (ClassMetadata)sCached.get(((Object) (class1)));
	//    0    0:getstatic       #44  <Field LRUMap sCached>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #112 <Method Object LRUMap.get(Object)>
	//    3    7:checkcast       #8   <Class ClassUtil$ClassMetadata>
	//    4   10:astore_2        
		Object obj = ((Object) (classmetadata));
	//    5   11:aload_2         
	//    6   12:astore_1        
		if(classmetadata == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       44
		{
			obj = ((Object) (new ClassMetadata(class1)));
	//    9   17:new             #8   <Class ClassUtil$ClassMetadata>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #115 <Method void ClassUtil$ClassMetadata(Class)>
	//   13   25:astore_1        
			class1 = ((Class) ((ClassMetadata)sCached.putIfAbsent(((Object) (class1)), obj)));
	//   14   26:getstatic       #44  <Field LRUMap sCached>
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #119 <Method Object LRUMap.putIfAbsent(Object, Object)>
	//   18   34:checkcast       #8   <Class ClassUtil$ClassMetadata>
	//   19   37:astore_0        
			if(class1 != null)
	//*  20   38:aload_0         
	//*  21   39:ifnull          44
				obj = ((Object) (class1));
	//   22   42:aload_0         
	//   23   43:astore_1        
		}
		return ((ClassMetadata) (obj));
	//   24   44:aload_1         
	//   25   45:areturn         
	}

	private static Class[] _interfaces(Class class1)
	{
		return _getMetadata(class1).getInterfaces();
	//    0    0:aload_0         
	//    1    1:invokestatic    #122 <Method ClassUtil$ClassMetadata _getMetadata(Class)>
	//    2    4:invokevirtual   #125 <Method Class[] ClassUtil$ClassMetadata.getInterfaces()>
	//    3    7:areturn         
	}

	public static String canBeABeanType(Class class1)
	{
		if(class1.isAnnotation())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #132 <Method boolean Class.isAnnotation()>
	//*   2    4:ifeq            10
			return "annotation";
	//    3    7:ldc1            #134 <String "annotation">
	//    4    9:areturn         
		if(class1.isArray())
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #137 <Method boolean Class.isArray()>
	//*   7   14:ifeq            20
			return "array";
	//    8   17:ldc1            #139 <String "array">
	//    9   19:areturn         
		if(class1.isEnum())
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #142 <Method boolean Class.isEnum()>
	//*  12   24:ifeq            30
			return "enum";
	//   13   27:ldc1            #144 <String "enum">
	//   14   29:areturn         
		if(class1.isPrimitive())
	//*  15   30:aload_0         
	//*  16   31:invokevirtual   #147 <Method boolean Class.isPrimitive()>
	//*  17   34:ifeq            40
			return "primitive";
	//   18   37:ldc1            #149 <String "primitive">
	//   19   39:areturn         
		else
			return null;
	//   20   40:aconst_null     
	//   21   41:areturn         
	}

	public static void checkAndFixAccess(Member member)
	{
		checkAndFixAccess(member, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #156 <Method void checkAndFixAccess(Member, boolean)>
	//    3    5:return          
	}

	public static void checkAndFixAccess(Member member, boolean flag)
	{
		AccessibleObject accessibleobject;
		accessibleobject = (AccessibleObject)member;
	//    0    0:aload_0         
	//    1    1:checkcast       #161 <Class AccessibleObject>
	//    2    4:astore_3        
		if(flag)
			break MISSING_BLOCK_LABEL_36;
	//    3    5:iload_1         
	//    4    6:ifne            36
		if(Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers()))
			break MISSING_BLOCK_LABEL_41;
	//    5    9:aload_0         
	//    6   10:invokeinterface #167 <Method int Member.getModifiers()>
	//    7   15:invokestatic    #173 <Method boolean Modifier.isPublic(int)>
	//    8   18:ifeq            36
	//    9   21:aload_0         
	//   10   22:invokeinterface #176 <Method Class Member.getDeclaringClass()>
	//   11   27:invokevirtual   #177 <Method int Class.getModifiers()>
	//   12   30:invokestatic    #173 <Method boolean Modifier.isPublic(int)>
	//   13   33:ifne            41
		accessibleobject.setAccessible(true);
	//   14   36:aload_3         
	//   15   37:iconst_1        
	//   16   38:invokevirtual   #181 <Method void AccessibleObject.setAccessible(boolean)>
_L1:
		return;
	//   17   41:return          
		SecurityException securityexception;
		securityexception;
	//   18   42:astore_2        
		if(!accessibleobject.isAccessible())
	//*  19   43:aload_3         
	//*  20   44:invokevirtual   #184 <Method boolean AccessibleObject.isAccessible()>
	//*  21   47:ifne            41
		{
			Class class1 = member.getDeclaringClass();
	//   22   50:aload_0         
	//   23   51:invokeinterface #176 <Method Class Member.getDeclaringClass()>
	//   24   56:astore_3        
			throw new IllegalArgumentException((new StringBuilder()).append("Can not access ").append(((Object) (member))).append(" (from class ").append(class1.getName()).append("; failed to set access: ").append(securityexception.getMessage()).toString());
	//   25   57:new             #186 <Class IllegalArgumentException>
	//   26   60:dup             
	//   27   61:new             #188 <Class StringBuilder>
	//   28   64:dup             
	//   29   65:invokespecial   #189 <Method void StringBuilder()>
	//   30   68:ldc1            #191 <String "Can not access ">
	//   31   70:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   32   73:aload_0         
	//   33   74:invokevirtual   #198 <Method StringBuilder StringBuilder.append(Object)>
	//   34   77:ldc1            #200 <String " (from class ">
	//   35   79:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   36   82:aload_3         
	//   37   83:invokevirtual   #204 <Method String Class.getName()>
	//   38   86:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   39   89:ldc1            #206 <String "; failed to set access: ">
	//   40   91:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   41   94:aload_2         
	//   42   95:invokevirtual   #209 <Method String SecurityException.getMessage()>
	//   43   98:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   44  101:invokevirtual   #212 <Method String StringBuilder.toString()>
	//   45  104:invokespecial   #215 <Method void IllegalArgumentException(String)>
	//   46  107:athrow          
		}
		  goto _L1
	}

	public static Object createInstance(Class class1, boolean flag)
		throws IllegalArgumentException
	{
		Object obj = ((Object) (findConstructor(class1, flag)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #223 <Method Constructor findConstructor(Class, boolean)>
	//    3    5:astore_2        
		if(obj == null)
	//*   4    6:aload_2         
	//*   5    7:ifnonnull       45
			throw new IllegalArgumentException((new StringBuilder()).append("Class ").append(class1.getName()).append(" has no default (no arg) constructor").toString());
	//    6   10:new             #186 <Class IllegalArgumentException>
	//    7   13:dup             
	//    8   14:new             #188 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #189 <Method void StringBuilder()>
	//   11   21:ldc1            #225 <String "Class ">
	//   12   23:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:aload_0         
	//   14   27:invokevirtual   #204 <Method String Class.getName()>
	//   15   30:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   16   33:ldc1            #227 <String " has no default (no arg) constructor">
	//   17   35:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:invokevirtual   #212 <Method String StringBuilder.toString()>
	//   19   41:invokespecial   #215 <Method void IllegalArgumentException(String)>
	//   20   44:athrow          
		try
		{
			obj = ((Constructor) (obj)).newInstance(new Object[0]);
	//   21   45:aload_2         
	//   22   46:iconst_0        
	//   23   47:anewarray       Object[]
	//   24   50:invokevirtual   #233 <Method Object Constructor.newInstance(Object[])>
	//   25   53:astore_2        
		}
	//*  26   54:aload_2         
	//*  27   55:areturn         
		catch(Exception exception)
	//*  28   56:astore_2        
		{
			unwrapAndThrowAsIAE(((Throwable) (exception)), (new StringBuilder()).append("Failed to instantiate class ").append(class1.getName()).append(", problem: ").append(exception.getMessage()).toString());
	//   29   57:aload_2         
	//   30   58:new             #188 <Class StringBuilder>
	//   31   61:dup             
	//   32   62:invokespecial   #189 <Method void StringBuilder()>
	//   33   65:ldc1            #235 <String "Failed to instantiate class ">
	//   34   67:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   35   70:aload_0         
	//   36   71:invokevirtual   #204 <Method String Class.getName()>
	//   37   74:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   38   77:ldc1            #237 <String ", problem: ">
	//   39   79:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   40   82:aload_2         
	//   41   83:invokevirtual   #238 <Method String Exception.getMessage()>
	//   42   86:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   43   89:invokevirtual   #212 <Method String StringBuilder.toString()>
	//   44   92:invokestatic    #242 <Method void unwrapAndThrowAsIAE(Throwable, String)>
			return ((Object) (null));
	//   45   95:aconst_null     
	//   46   96:areturn         
		}
		return obj;
	}

	public static Object defaultValue(Class class1)
	{
		if(class1 == Integer.TYPE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #251 <Field Class Integer.TYPE>
	//*   2    4:if_acmpne       12
			return ((Object) (Integer.valueOf(0)));
	//    3    7:iconst_0        
	//    4    8:invokestatic    #255 <Method Integer Integer.valueOf(int)>
	//    5   11:areturn         
		if(class1 == Long.TYPE)
	//*   6   12:aload_0         
	//*   7   13:getstatic       #258 <Field Class Long.TYPE>
	//*   8   16:if_acmpne       24
			return ((Object) (Long.valueOf(0L)));
	//    9   19:lconst_0        
	//   10   20:invokestatic    #261 <Method Long Long.valueOf(long)>
	//   11   23:areturn         
		if(class1 == Boolean.TYPE)
	//*  12   24:aload_0         
	//*  13   25:getstatic       #264 <Field Class Boolean.TYPE>
	//*  14   28:if_acmpne       35
			return ((Object) (Boolean.FALSE));
	//   15   31:getstatic       #268 <Field Boolean Boolean.FALSE>
	//   16   34:areturn         
		if(class1 == Double.TYPE)
	//*  17   35:aload_0         
	//*  18   36:getstatic       #271 <Field Class Double.TYPE>
	//*  19   39:if_acmpne       47
			return ((Object) (Double.valueOf(0.0D)));
	//   20   42:dconst_0        
	//   21   43:invokestatic    #274 <Method Double Double.valueOf(double)>
	//   22   46:areturn         
		if(class1 == Float.TYPE)
	//*  23   47:aload_0         
	//*  24   48:getstatic       #277 <Field Class Float.TYPE>
	//*  25   51:if_acmpne       59
			return ((Object) (Float.valueOf(0.0F)));
	//   26   54:fconst_0        
	//   27   55:invokestatic    #280 <Method Float Float.valueOf(float)>
	//   28   58:areturn         
		if(class1 == Byte.TYPE)
	//*  29   59:aload_0         
	//*  30   60:getstatic       #283 <Field Class Byte.TYPE>
	//*  31   63:if_acmpne       71
			return ((Object) (Byte.valueOf((byte)0)));
	//   32   66:iconst_0        
	//   33   67:invokestatic    #286 <Method Byte Byte.valueOf(byte)>
	//   34   70:areturn         
		if(class1 == Short.TYPE)
	//*  35   71:aload_0         
	//*  36   72:getstatic       #289 <Field Class Short.TYPE>
	//*  37   75:if_acmpne       83
			return ((Object) (Short.valueOf((short)0)));
	//   38   78:iconst_0        
	//   39   79:invokestatic    #292 <Method Short Short.valueOf(short)>
	//   40   82:areturn         
		if(class1 == Character.TYPE)
	//*  41   83:aload_0         
	//*  42   84:getstatic       #295 <Field Class Character.TYPE>
	//*  43   87:if_acmpne       95
			return ((Object) (Character.valueOf('\0')));
	//   44   90:iconst_0        
	//   45   91:invokestatic    #298 <Method Character Character.valueOf(char)>
	//   46   94:areturn         
		else
			throw new IllegalArgumentException((new StringBuilder()).append("Class ").append(class1.getName()).append(" is not a primitive type").toString());
	//   47   95:new             #186 <Class IllegalArgumentException>
	//   48   98:dup             
	//   49   99:new             #188 <Class StringBuilder>
	//   50  102:dup             
	//   51  103:invokespecial   #189 <Method void StringBuilder()>
	//   52  106:ldc1            #225 <String "Class ">
	//   53  108:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   54  111:aload_0         
	//   55  112:invokevirtual   #204 <Method String Class.getName()>
	//   56  115:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   57  118:ldc2            #300 <String " is not a primitive type">
	//   58  121:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   59  124:invokevirtual   #212 <Method String StringBuilder.toString()>
	//   60  127:invokespecial   #215 <Method void IllegalArgumentException(String)>
	//   61  130:athrow          
	}

	public static Iterator emptyIterator()
	{
		return ((Iterator) (EMPTY_ITERATOR));
	//    0    0:getstatic       #37  <Field ClassUtil$EmptyIterator EMPTY_ITERATOR>
	//    1    3:areturn         
	}

	public static Class findClass(String s)
		throws ClassNotFoundException
	{
		Object obj;
		ClassLoader classloader;
		if(s.indexOf('.') < 0)
	//*   0    0:aload_0         
	//*   1    1:bipush          46
	//*   2    3:invokevirtual   #313 <Method int String.indexOf(int)>
	//*   3    6:ifge            135
		{
			if("int".equals(((Object) (s))))
	//*   4    9:ldc2            #315 <String "int">
	//*   5   12:aload_0         
	//*   6   13:invokevirtual   #318 <Method boolean String.equals(Object)>
	//*   7   16:ifeq            23
				return Integer.TYPE;
	//    8   19:getstatic       #251 <Field Class Integer.TYPE>
	//    9   22:areturn         
			if("long".equals(((Object) (s))))
	//*  10   23:ldc2            #320 <String "long">
	//*  11   26:aload_0         
	//*  12   27:invokevirtual   #318 <Method boolean String.equals(Object)>
	//*  13   30:ifeq            37
				return Long.TYPE;
	//   14   33:getstatic       #258 <Field Class Long.TYPE>
	//   15   36:areturn         
			if("float".equals(((Object) (s))))
	//*  16   37:ldc2            #322 <String "float">
	//*  17   40:aload_0         
	//*  18   41:invokevirtual   #318 <Method boolean String.equals(Object)>
	//*  19   44:ifeq            51
				return Float.TYPE;
	//   20   47:getstatic       #277 <Field Class Float.TYPE>
	//   21   50:areturn         
			if("double".equals(((Object) (s))))
	//*  22   51:ldc2            #324 <String "double">
	//*  23   54:aload_0         
	//*  24   55:invokevirtual   #318 <Method boolean String.equals(Object)>
	//*  25   58:ifeq            65
				return Double.TYPE;
	//   26   61:getstatic       #271 <Field Class Double.TYPE>
	//   27   64:areturn         
			if("boolean".equals(((Object) (s))))
	//*  28   65:ldc2            #326 <String "boolean">
	//*  29   68:aload_0         
	//*  30   69:invokevirtual   #318 <Method boolean String.equals(Object)>
	//*  31   72:ifeq            79
				return Boolean.TYPE;
	//   32   75:getstatic       #264 <Field Class Boolean.TYPE>
	//   33   78:areturn         
			if("byte".equals(((Object) (s))))
	//*  34   79:ldc2            #328 <String "byte">
	//*  35   82:aload_0         
	//*  36   83:invokevirtual   #318 <Method boolean String.equals(Object)>
	//*  37   86:ifeq            93
				return Byte.TYPE;
	//   38   89:getstatic       #283 <Field Class Byte.TYPE>
	//   39   92:areturn         
			if("char".equals(((Object) (s))))
	//*  40   93:ldc2            #330 <String "char">
	//*  41   96:aload_0         
	//*  42   97:invokevirtual   #318 <Method boolean String.equals(Object)>
	//*  43  100:ifeq            107
				return Character.TYPE;
	//   44  103:getstatic       #295 <Field Class Character.TYPE>
	//   45  106:areturn         
			if("short".equals(((Object) (s))))
	//*  46  107:ldc2            #332 <String "short">
	//*  47  110:aload_0         
	//*  48  111:invokevirtual   #318 <Method boolean String.equals(Object)>
	//*  49  114:ifeq            121
				return Short.TYPE;
	//   50  117:getstatic       #289 <Field Class Short.TYPE>
	//   51  120:areturn         
			if("void".equals(((Object) (s))))
	//*  52  121:ldc2            #334 <String "void">
	//*  53  124:aload_0         
	//*  54  125:invokevirtual   #318 <Method boolean String.equals(Object)>
	//*  55  128:ifeq            135
				return Void.TYPE;
	//   56  131:getstatic       #337 <Field Class Void.TYPE>
	//   57  134:areturn         
		}
		obj = null;
	//   58  135:aconst_null     
	//   59  136:astore_1        
		classloader = Thread.currentThread().getContextClassLoader();
	//   60  137:invokestatic    #343 <Method Thread Thread.currentThread()>
	//   61  140:invokevirtual   #347 <Method ClassLoader Thread.getContextClassLoader()>
	//   62  143:astore_2        
		if(classloader == null)
			break MISSING_BLOCK_LABEL_163;
	//   63  144:aload_2         
	//   64  145:ifnull          163
		obj = ((Object) (Class.forName(s, true, classloader)));
	//   65  148:aload_0         
	//   66  149:iconst_1        
	//   67  150:aload_2         
	//   68  151:invokestatic    #351 <Method Class Class.forName(String, boolean, ClassLoader)>
	//   69  154:astore_1        
		return ((Class) (obj));
	//   70  155:aload_1         
	//   71  156:areturn         
		obj;
	//   72  157:astore_1        
		obj = ((Object) (getRootCause(((Throwable) (obj)))));
	//   73  158:aload_1         
	//   74  159:invokestatic    #355 <Method Throwable getRootCause(Throwable)>
	//   75  162:astore_1        
		try
		{
			s = ((String) (Class.forName(s)));
	//   76  163:aload_0         
	//   77  164:invokestatic    #357 <Method Class Class.forName(String)>
	//   78  167:astore_0        
		}
	//*  79  168:aload_0         
	//*  80  169:areturn         
		catch(Exception exception)
	//*  81  170:astore_2        
		{
			s = ((String) (obj));
	//   82  171:aload_1         
	//   83  172:astore_0        
			if(obj == null)
	//*  84  173:aload_1         
	//*  85  174:ifnonnull       182
				s = ((String) (getRootCause(((Throwable) (exception)))));
	//   86  177:aload_2         
	//   87  178:invokestatic    #355 <Method Throwable getRootCause(Throwable)>
	//   88  181:astore_0        
			if(s instanceof RuntimeException)
	//*  89  182:aload_0         
	//*  90  183:instanceof      #359 <Class RuntimeException>
	//*  91  186:ifeq            194
				throw (RuntimeException)s;
	//   92  189:aload_0         
	//   93  190:checkcast       #359 <Class RuntimeException>
	//   94  193:athrow          
			else
				throw new ClassNotFoundException(((Throwable) (s)).getMessage(), ((Throwable) (s)));
	//   95  194:new             #307 <Class ClassNotFoundException>
	//   96  197:dup             
	//   97  198:aload_0         
	//   98  199:invokevirtual   #362 <Method String Throwable.getMessage()>
	//   99  202:aload_0         
	//  100  203:invokespecial   #365 <Method void ClassNotFoundException(String, Throwable)>
	//  101  206:athrow          
		}
		return ((Class) (s));
	}

	public static Annotation[] findClassAnnotations(Class class1)
	{
		return _getMetadata(class1).getDeclaredAnnotations();
	//    0    0:aload_0         
	//    1    1:invokestatic    #122 <Method ClassUtil$ClassMetadata _getMetadata(Class)>
	//    2    4:invokevirtual   #372 <Method Annotation[] ClassUtil$ClassMetadata.getDeclaredAnnotations()>
	//    3    7:areturn         
	}

	public static Constructor findConstructor(Class class1, boolean flag)
		throws IllegalArgumentException
	{
		Object obj = ((Object) (class1.getDeclaredConstructor(new Class[0])));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       Class[]
	//    3    5:invokevirtual   #379 <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    4    8:astore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_19;
	//    5    9:iload_1         
	//    6   10:ifeq            19
		checkAndFixAccess(((Member) (obj)));
	//    7   13:aload_2         
	//    8   14:invokestatic    #381 <Method void checkAndFixAccess(Member)>
		return ((Constructor) (obj));
	//    9   17:aload_2         
	//   10   18:areturn         
		if(!Modifier.isPublic(((Constructor) (obj)).getModifiers()))
	//*  11   19:aload_2         
	//*  12   20:invokevirtual   #382 <Method int Constructor.getModifiers()>
	//*  13   23:invokestatic    #173 <Method boolean Modifier.isPublic(int)>
	//*  14   26:ifne            112
			throw new IllegalArgumentException((new StringBuilder()).append("Default constructor for ").append(class1.getName()).append(" is not accessible (non-public?): not allowed to try modify access via Reflection: can not instantiate type").toString());
	//   15   29:new             #186 <Class IllegalArgumentException>
	//   16   32:dup             
	//   17   33:new             #188 <Class StringBuilder>
	//   18   36:dup             
	//   19   37:invokespecial   #189 <Method void StringBuilder()>
	//   20   40:ldc2            #384 <String "Default constructor for ">
	//   21   43:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   22   46:aload_0         
	//   23   47:invokevirtual   #204 <Method String Class.getName()>
	//   24   50:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   25   53:ldc2            #386 <String " is not accessible (non-public?): not allowed to try modify access via Reflection: can not instantiate type">
	//   26   56:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   27   59:invokevirtual   #212 <Method String StringBuilder.toString()>
	//   28   62:invokespecial   #215 <Method void IllegalArgumentException(String)>
	//   29   65:athrow          
		  goto _L1
		class1;
	//   30   66:astore_0        
_L2:
		return null;
	//   31   67:aconst_null     
	//   32   68:areturn         
		obj;
	//   33   69:astore_2        
		unwrapAndThrowAsIAE(((Throwable) (obj)), (new StringBuilder()).append("Failed to find default constructor of class ").append(class1.getName()).append(", problem: ").append(((Exception) (obj)).getMessage()).toString());
	//   34   70:aload_2         
	//   35   71:new             #188 <Class StringBuilder>
	//   36   74:dup             
	//   37   75:invokespecial   #189 <Method void StringBuilder()>
	//   38   78:ldc2            #388 <String "Failed to find default constructor of class ">
	//   39   81:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   40   84:aload_0         
	//   41   85:invokevirtual   #204 <Method String Class.getName()>
	//   42   88:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   43   91:ldc1            #237 <String ", problem: ">
	//   44   93:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   45   96:aload_2         
	//   46   97:invokevirtual   #238 <Method String Exception.getMessage()>
	//   47  100:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   48  103:invokevirtual   #212 <Method String StringBuilder.toString()>
	//   49  106:invokestatic    #242 <Method void unwrapAndThrowAsIAE(Throwable, String)>
		if(true) goto _L2; else goto _L1
	//   50  109:goto            67
_L1:
		return ((Constructor) (obj));
	//   51  112:aload_2         
	//   52  113:areturn         
	}

	public static Class findEnumType(Class class1)
	{
		Class class2 = class1;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(class1.getSuperclass() != java/lang/Enum)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #70  <Method Class Class.getSuperclass()>
	//*   4    6:ldc2            #393 <Class Enum>
	//*   5    9:if_acmpeq       17
			class2 = class1.getSuperclass();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #70  <Method Class Class.getSuperclass()>
	//    8   16:astore_1        
		return class2;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public static Class findEnumType(Enum enum)
	{
		Class class1 = ((Object) (enum)).getClass();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #398 <Method Class Object.getClass()>
	//    2    4:astore_1        
		enum = ((Enum) (class1));
	//    3    5:aload_1         
	//    4    6:astore_0        
		if(class1.getSuperclass() != java/lang/Enum)
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #70  <Method Class Class.getSuperclass()>
	//*   7   11:ldc2            #393 <Class Enum>
	//*   8   14:if_acmpeq       22
			enum = ((Enum) (class1.getSuperclass()));
	//    9   17:aload_1         
	//   10   18:invokevirtual   #70  <Method Class Class.getSuperclass()>
	//   11   21:astore_0        
		return ((Class) (enum));
	//   12   22:aload_0         
	//   13   23:areturn         
	}

	public static Class findEnumType(EnumMap enummap)
	{
		if(!enummap.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #405 <Method boolean EnumMap.isEmpty()>
	//*   2    4:ifne            28
			return findEnumType((Enum)enummap.keySet().iterator().next());
	//    3    7:aload_0         
	//    4    8:invokevirtual   #409 <Method Set EnumMap.keySet()>
	//    5   11:invokeinterface #412 <Method Iterator Set.iterator()>
	//    6   16:invokeinterface #99  <Method Object Iterator.next()>
	//    7   21:checkcast       #393 <Class Enum>
	//    8   24:invokestatic    #414 <Method Class findEnumType(Enum)>
	//    9   27:areturn         
		else
			return EnumTypeLocator.instance.enumTypeFor(enummap);
	//   10   28:getstatic       #418 <Field ClassUtil$EnumTypeLocator ClassUtil$EnumTypeLocator.instance>
	//   11   31:aload_0         
	//   12   32:invokevirtual   #421 <Method Class ClassUtil$EnumTypeLocator.enumTypeFor(EnumMap)>
	//   13   35:areturn         
	}

	public static Class findEnumType(EnumSet enumset)
	{
		if(!enumset.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #426 <Method boolean EnumSet.isEmpty()>
	//*   2    4:ifne            23
			return findEnumType((Enum)enumset.iterator().next());
	//    3    7:aload_0         
	//    4    8:invokevirtual   #427 <Method Iterator EnumSet.iterator()>
	//    5   11:invokeinterface #99  <Method Object Iterator.next()>
	//    6   16:checkcast       #393 <Class Enum>
	//    7   19:invokestatic    #414 <Method Class findEnumType(Enum)>
	//    8   22:areturn         
		else
			return EnumTypeLocator.instance.enumTypeFor(enumset);
	//    9   23:getstatic       #418 <Field ClassUtil$EnumTypeLocator ClassUtil$EnumTypeLocator.instance>
	//   10   26:aload_0         
	//   11   27:invokevirtual   #429 <Method Class ClassUtil$EnumTypeLocator.enumTypeFor(EnumSet)>
	//   12   30:areturn         
	}

	public static List findRawSuperTypes(Class class1, Class class2, boolean flag)
	{
		if(class1 == null || class1 == class2 || class1 == java/lang/Object)
	//*   0    0:aload_0         
	//*   1    1:ifnull          15
	//*   2    4:aload_0         
	//*   3    5:aload_1         
	//*   4    6:if_acmpeq       15
	//*   5    9:aload_0         
	//*   6   10:ldc1            #4   <Class Object>
	//*   7   12:if_acmpne       19
		{
			return Collections.emptyList();
	//    8   15:invokestatic    #437 <Method List Collections.emptyList()>
	//    9   18:areturn         
		} else
		{
			ArrayList arraylist = new ArrayList(8);
	//   10   19:new             #439 <Class ArrayList>
	//   11   22:dup             
	//   12   23:bipush          8
	//   13   25:invokespecial   #442 <Method void ArrayList(int)>
	//   14   28:astore_3        
			_addRawSuperTypes(class1, class2, ((Collection) (arraylist)), flag);
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:aload_3         
	//   18   32:iload_2         
	//   19   33:invokestatic    #64  <Method void _addRawSuperTypes(Class, Class, Collection, boolean)>
			return ((List) (arraylist));
	//   20   36:aload_3         
	//   21   37:areturn         
		}
	}

	public static List findSuperClasses(Class class1, Class class2, boolean flag)
	{
		LinkedList linkedlist = new LinkedList();
	//    0    0:new             #446 <Class LinkedList>
	//    1    3:dup             
	//    2    4:invokespecial   #447 <Method void LinkedList()>
	//    3    7:astore          4
		if(class1 == null || class1 == class2) goto _L2; else goto _L1
	//    4    9:aload_0         
	//    5   10:ifnull          49
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:if_acmpeq       49
_L1:
		Class class3;
		class3 = class1;
	//    9   18:aload_0         
	//   10   19:astore_3        
		if(flag)
	//*  11   20:iload_2         
	//*  12   21:ifeq            35
		{
			((List) (linkedlist)).add(((Object) (class1)));
	//   13   24:aload           4
	//   14   26:aload_0         
	//   15   27:invokeinterface #448 <Method boolean List.add(Object)>
	//   16   32:pop             
			class3 = class1;
	//   17   33:aload_0         
	//   18   34:astore_3        
		}
_L5:
		class3 = class3.getSuperclass();
	//   19   35:aload_3         
	//   20   36:invokevirtual   #70  <Method Class Class.getSuperclass()>
	//   21   39:astore_3        
		if(class3 != null && class3 != class2) goto _L3; else goto _L2
	//   22   40:aload_3         
	//   23   41:ifnull          49
	//   24   44:aload_3         
	//   25   45:aload_1         
	//   26   46:if_acmpne       52
_L2:
		return ((List) (linkedlist));
	//   27   49:aload           4
	//   28   51:areturn         
_L3:
		((List) (linkedlist)).add(((Object) (class3)));
	//   29   52:aload           4
	//   30   54:aload_3         
	//   31   55:invokeinterface #448 <Method boolean List.add(Object)>
	//   32   60:pop             
		if(true) goto _L5; else goto _L4
	//   33   61:goto            35
_L4:
	}

	public static List findSuperTypes(JavaType javatype, Class class1, boolean flag)
	{
		if(javatype == null || javatype.hasRawClass(class1) || javatype.hasRawClass(java/lang/Object))
	//*   0    0:aload_0         
	//*   1    1:ifnull          21
	//*   2    4:aload_0         
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #454 <Method boolean JavaType.hasRawClass(Class)>
	//*   5    9:ifne            21
	//*   6   12:aload_0         
	//*   7   13:ldc1            #4   <Class Object>
	//*   8   15:invokevirtual   #454 <Method boolean JavaType.hasRawClass(Class)>
	//*   9   18:ifeq            25
		{
			return Collections.emptyList();
	//   10   21:invokestatic    #437 <Method List Collections.emptyList()>
	//   11   24:areturn         
		} else
		{
			ArrayList arraylist = new ArrayList(8);
	//   12   25:new             #439 <Class ArrayList>
	//   13   28:dup             
	//   14   29:bipush          8
	//   15   31:invokespecial   #442 <Method void ArrayList(int)>
	//   16   34:astore_3        
			_addSuperTypes(javatype, class1, ((Collection) (arraylist)), flag);
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:aload_3         
	//   20   38:iload_2         
	//   21   39:invokestatic    #101 <Method void _addSuperTypes(JavaType, Class, Collection, boolean)>
			return ((List) (arraylist));
	//   22   42:aload_3         
	//   23   43:areturn         
		}
	}

	public static List findSuperTypes(Class class1, Class class2)
	{
		return findSuperTypes(class1, class2, ((List) (new ArrayList(8))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #439 <Class ArrayList>
	//    3    5:dup             
	//    4    6:bipush          8
	//    5    8:invokespecial   #442 <Method void ArrayList(int)>
	//    6   11:invokestatic    #459 <Method List findSuperTypes(Class, Class, List)>
	//    7   14:areturn         
	}

	public static List findSuperTypes(Class class1, Class class2, List list)
	{
		_addRawSuperTypes(class1, class2, ((Collection) (list)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #64  <Method void _addRawSuperTypes(Class, Class, Collection, boolean)>
		return list;
	//    5    7:aload_2         
	//    6    8:areturn         
	}

	public static String getClassDescription(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return "unknown";
	//    2    4:ldc2            #465 <String "unknown">
	//    3    7:areturn         
		if(obj instanceof Class)
	//*   4    8:aload_0         
	//*   5    9:instanceof      #66  <Class Class>
	//*   6   12:ifeq            25
			obj = ((Object) ((Class)obj));
	//    7   15:aload_0         
	//    8   16:checkcast       #66  <Class Class>
	//    9   19:astore_0        
		else
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #204 <Method String Class.getName()>
	//*  12   24:areturn         
			obj = ((Object) (obj.getClass()));
	//   13   25:aload_0         
	//   14   26:invokevirtual   #398 <Method Class Object.getClass()>
	//   15   29:astore_0        
		return ((Class) (obj)).getName();
	//*  16   30:goto            20
	}

	public static Ctor[] getConstructors(Class class1)
	{
		return _getMetadata(class1).getConstructors();
	//    0    0:aload_0         
	//    1    1:invokestatic    #122 <Method ClassUtil$ClassMetadata _getMetadata(Class)>
	//    2    4:invokevirtual   #470 <Method ClassUtil$Ctor[] ClassUtil$ClassMetadata.getConstructors()>
	//    3    7:areturn         
	}

	public static Field[] getDeclaredFields(Class class1)
	{
		return _getMetadata(class1).getDeclaredFields();
	//    0    0:aload_0         
	//    1    1:invokestatic    #122 <Method ClassUtil$ClassMetadata _getMetadata(Class)>
	//    2    4:invokevirtual   #476 <Method Field[] ClassUtil$ClassMetadata.getDeclaredFields()>
	//    3    7:areturn         
	}

	public static Method[] getDeclaredMethods(Class class1)
	{
		return _getMetadata(class1).getDeclaredMethods();
	//    0    0:aload_0         
	//    1    1:invokestatic    #122 <Method ClassUtil$ClassMetadata _getMetadata(Class)>
	//    2    4:invokevirtual   #482 <Method Method[] ClassUtil$ClassMetadata.getDeclaredMethods()>
	//    3    7:areturn         
	}

	public static Class getDeclaringClass(Class class1)
	{
		if(isObjectOrPrimitive(class1))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #486 <Method boolean isObjectOrPrimitive(Class)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return class1.getDeclaringClass();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #487 <Method Class Class.getDeclaringClass()>
	//    7   13:areturn         
	}

	public static Class getEnclosingClass(Class class1)
	{
		if(isObjectOrPrimitive(class1))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #486 <Method boolean isObjectOrPrimitive(Class)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return class1.getEnclosingClass();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #491 <Method Class Class.getEnclosingClass()>
	//    7   13:areturn         
	}

	public static Type[] getGenericInterfaces(Class class1)
	{
		return _getMetadata(class1).getGenericInterfaces();
	//    0    0:aload_0         
	//    1    1:invokestatic    #122 <Method ClassUtil$ClassMetadata _getMetadata(Class)>
	//    2    4:invokevirtual   #496 <Method Type[] ClassUtil$ClassMetadata.getGenericInterfaces()>
	//    3    7:areturn         
	}

	public static Type getGenericSuperclass(Class class1)
	{
		return class1.getGenericSuperclass();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #502 <Method Type Class.getGenericSuperclass()>
	//    2    4:areturn         
	}

	public static Class getOuterClass(Class class1)
	{
		if(hasEnclosingMethod(class1))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #507 <Method boolean hasEnclosingMethod(Class)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(Modifier.isStatic(class1.getModifiers()))
			break MISSING_BLOCK_LABEL_27;
	//    5    9:aload_0         
	//    6   10:invokevirtual   #177 <Method int Class.getModifiers()>
	//    7   13:invokestatic    #510 <Method boolean Modifier.isStatic(int)>
	//    8   16:ifne            27
		class1 = getEnclosingClass(class1);
	//    9   19:aload_0         
	//   10   20:invokestatic    #512 <Method Class getEnclosingClass(Class)>
	//   11   23:astore_0        
		return class1;
	//   12   24:aload_0         
	//   13   25:areturn         
		class1;
	//   14   26:astore_0        
		return null;
	//   15   27:aconst_null     
	//   16   28:areturn         
	}

	public static String getPackageName(Class class1)
	{
		return _getMetadata(class1).getPackageName();
	//    0    0:aload_0         
	//    1    1:invokestatic    #122 <Method ClassUtil$ClassMetadata _getMetadata(Class)>
	//    2    4:invokevirtual   #515 <Method String ClassUtil$ClassMetadata.getPackageName()>
	//    3    7:areturn         
	}

	public static Throwable getRootCause(Throwable throwable)
	{
		for(; throwable.getCause() != null; throwable = throwable.getCause());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #519 <Method Throwable Throwable.getCause()>
	//    2    4:ifnull          15
	//    3    7:aload_0         
	//    4    8:invokevirtual   #519 <Method Throwable Throwable.getCause()>
	//    5   11:astore_0        
	//*   6   12:goto            0
		return throwable;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public static boolean hasEnclosingMethod(Class class1)
	{
		return _getMetadata(class1).hasEnclosingMethod();
	//    0    0:aload_0         
	//    1    1:invokestatic    #122 <Method ClassUtil$ClassMetadata _getMetadata(Class)>
	//    2    4:invokevirtual   #521 <Method boolean ClassUtil$ClassMetadata.hasEnclosingMethod()>
	//    3    7:ireturn         
	}

	public static boolean hasGetterSignature(Method method)
	{
		Class aclass[];
		if(!Modifier.isStatic(method.getModifiers()))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #527 <Method int Method.getModifiers()>
	//*   2    4:invokestatic    #510 <Method boolean Modifier.isStatic(int)>
	//*   3    7:ifeq            12
	//*   4   10:iconst_0        
	//*   5   11:ireturn         
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #530 <Method Class[] Method.getParameterTypes()>
	//*   8   16:astore_1        
			if(((aclass = method.getParameterTypes()) == null || aclass.length == 0) && Void.TYPE != method.getReturnType())
	//*   9   17:aload_1         
	//*  10   18:ifnull          26
	//*  11   21:aload_1         
	//*  12   22:arraylength     
	//*  13   23:ifne            10
	//*  14   26:getstatic       #337 <Field Class Void.TYPE>
	//*  15   29:aload_0         
	//*  16   30:invokevirtual   #533 <Method Class Method.getReturnType()>
	//*  17   33:if_acmpeq       10
				return true;
	//   18   36:iconst_1        
	//   19   37:ireturn         
		return false;
	}

	public static boolean isBogusClass(Class class1)
	{
		return class1 == java/lang/Void || class1 == Void.TYPE || class1 == com/fasterxml/jackson/databind/annotation/NoClass;
	//    0    0:aload_0         
	//    1    1:ldc2            #336 <Class Void>
	//    2    4:if_acmpeq       21
	//    3    7:aload_0         
	//    4    8:getstatic       #337 <Field Class Void.TYPE>
	//    5   11:if_acmpeq       21
	//    6   14:aload_0         
	//    7   15:ldc2            #536 <Class NoClass>
	//    8   18:if_acmpne       23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public static boolean isCollectionMapOrArray(Class class1)
	{
		while(class1.isArray() || ((Class) (java/util/Collection)).isAssignableFrom(class1) || ((Class) (java/util/Map)).isAssignableFrom(class1)) 
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #137 <Method boolean Class.isArray()>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:ldc1            #51  <Class Collection>
	//    6   11:aload_0         
	//    7   12:invokevirtual   #540 <Method boolean Class.isAssignableFrom(Class)>
	//    8   15:ifne            7
	//    9   18:ldc2            #542 <Class Map>
	//   10   21:aload_0         
	//   11   22:invokevirtual   #540 <Method boolean Class.isAssignableFrom(Class)>
	//   12   25:ifne            7
		return false;
	//   13   28:iconst_0        
	//   14   29:ireturn         
	}

	public static boolean isConcrete(Class class1)
	{
		return (class1.getModifiers() & 0x600) == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #177 <Method int Class.getModifiers()>
	//    2    4:sipush          1536
	//    3    7:iand            
	//    4    8:ifne            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public static boolean isConcrete(Member member)
	{
		return (member.getModifiers() & 0x600) == 0;
	//    0    0:aload_0         
	//    1    1:invokeinterface #167 <Method int Member.getModifiers()>
	//    2    6:sipush          1536
	//    3    9:iand            
	//    4   10:ifne            15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public static boolean isJacksonStdImpl(Class class1)
	{
		return class1.getAnnotation(com/fasterxml/jackson/databind/annotation/JacksonStdImpl) != null;
	//    0    0:aload_0         
	//    1    1:ldc2            #547 <Class JacksonStdImpl>
	//    2    4:invokevirtual   #551 <Method Annotation Class.getAnnotation(Class)>
	//    3    7:ifnull          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public static boolean isJacksonStdImpl(Object obj)
	{
		return obj != null && isJacksonStdImpl(obj.getClass());
	//    0    0:aload_0         
	//    1    1:ifnull          16
	//    2    4:aload_0         
	//    3    5:invokevirtual   #398 <Method Class Object.getClass()>
	//    4    8:invokestatic    #553 <Method boolean isJacksonStdImpl(Class)>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public static String isLocalType(Class class1, boolean flag)
	{
		if(hasEnclosingMethod(class1))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #507 <Method boolean hasEnclosingMethod(Class)>
	//*   2    4:ifeq            11
			return "local/anonymous";
	//    3    7:ldc2            #559 <String "local/anonymous">
	//    4   10:areturn         
		if(flag)
			break MISSING_BLOCK_LABEL_37;
	//    5   11:iload_1         
	//    6   12:ifne            37
		if(!Modifier.isStatic(class1.getModifiers()) && getEnclosingClass(class1) != null)
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #177 <Method int Class.getModifiers()>
	//*   9   19:invokestatic    #510 <Method boolean Modifier.isStatic(int)>
	//*  10   22:ifne            37
	//*  11   25:aload_0         
	//*  12   26:invokestatic    #512 <Method Class getEnclosingClass(Class)>
	//*  13   29:ifnull          37
			return "non-static member class";
	//   14   32:ldc2            #561 <String "non-static member class">
	//   15   35:areturn         
		break MISSING_BLOCK_LABEL_37;
		class1;
	//   16   36:astore_0        
_L2:
		return null;
	//   17   37:aconst_null     
	//   18   38:areturn         
		class1;
	//   19   39:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  20   40:goto            37
	}

	public static boolean isNonStaticInnerClass(Class class1)
	{
		return !Modifier.isStatic(class1.getModifiers()) && getEnclosingClass(class1) != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #177 <Method int Class.getModifiers()>
	//    2    4:invokestatic    #510 <Method boolean Modifier.isStatic(int)>
	//    3    7:ifne            19
	//    4   10:aload_0         
	//    5   11:invokestatic    #512 <Method Class getEnclosingClass(Class)>
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
	//    1    1:getstatic       #31  <Field Class CLS_OBJECT>
	//    2    4:if_acmpeq       14
	//    3    7:aload_0         
	//    4    8:invokevirtual   #147 <Method boolean Class.isPrimitive()>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public static boolean isProxyType(Class class1)
	{
		class1 = ((Class) (class1.getName()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #204 <Method String Class.getName()>
	//    2    4:astore_0        
		return ((String) (class1)).startsWith("net.sf.cglib.proxy.") || ((String) (class1)).startsWith("org.hibernate.proxy.");
	//    3    5:aload_0         
	//    4    6:ldc2            #566 <String "net.sf.cglib.proxy.">
	//    5    9:invokevirtual   #570 <Method boolean String.startsWith(String)>
	//    6   12:ifne            25
	//    7   15:aload_0         
	//    8   16:ldc2            #572 <String "org.hibernate.proxy.">
	//    9   19:invokevirtual   #570 <Method boolean String.startsWith(String)>
	//   10   22:ifeq            27
	//   11   25:iconst_1        
	//   12   26:ireturn         
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	public static Class primitiveType(Class class1)
	{
		if(class1.isPrimitive())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #147 <Method boolean Class.isPrimitive()>
	//*   2    4:ifeq            9
			return class1;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(class1 == java/lang/Integer)
	//*   5    9:aload_0         
	//*   6   10:ldc1            #248 <Class Integer>
	//*   7   12:if_acmpne       19
			return Integer.TYPE;
	//    8   15:getstatic       #251 <Field Class Integer.TYPE>
	//    9   18:areturn         
		if(class1 == java/lang/Long)
	//*  10   19:aload_0         
	//*  11   20:ldc2            #257 <Class Long>
	//*  12   23:if_acmpne       30
			return Long.TYPE;
	//   13   26:getstatic       #258 <Field Class Long.TYPE>
	//   14   29:areturn         
		if(class1 == java/lang/Boolean)
	//*  15   30:aload_0         
	//*  16   31:ldc2            #263 <Class Boolean>
	//*  17   34:if_acmpne       41
			return Boolean.TYPE;
	//   18   37:getstatic       #264 <Field Class Boolean.TYPE>
	//   19   40:areturn         
		if(class1 == java/lang/Double)
	//*  20   41:aload_0         
	//*  21   42:ldc2            #270 <Class Double>
	//*  22   45:if_acmpne       52
			return Double.TYPE;
	//   23   48:getstatic       #271 <Field Class Double.TYPE>
	//   24   51:areturn         
		if(class1 == java/lang/Float)
	//*  25   52:aload_0         
	//*  26   53:ldc2            #276 <Class Float>
	//*  27   56:if_acmpne       63
			return Float.TYPE;
	//   28   59:getstatic       #277 <Field Class Float.TYPE>
	//   29   62:areturn         
		if(class1 == java/lang/Byte)
	//*  30   63:aload_0         
	//*  31   64:ldc2            #282 <Class Byte>
	//*  32   67:if_acmpne       74
			return Byte.TYPE;
	//   33   70:getstatic       #283 <Field Class Byte.TYPE>
	//   34   73:areturn         
		if(class1 == java/lang/Short)
	//*  35   74:aload_0         
	//*  36   75:ldc2            #288 <Class Short>
	//*  37   78:if_acmpne       85
			return Short.TYPE;
	//   38   81:getstatic       #289 <Field Class Short.TYPE>
	//   39   84:areturn         
		if(class1 == java/lang/Character)
	//*  40   85:aload_0         
	//*  41   86:ldc2            #294 <Class Character>
	//*  42   89:if_acmpne       96
			return Character.TYPE;
	//   43   92:getstatic       #295 <Field Class Character.TYPE>
	//   44   95:areturn         
		else
			return null;
	//   45   96:aconst_null     
	//   46   97:areturn         
	}

	public static void throwAsIAE(Throwable throwable)
	{
		throwAsIAE(throwable, throwable.getMessage());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #362 <Method String Throwable.getMessage()>
	//    3    5:invokestatic    #577 <Method void throwAsIAE(Throwable, String)>
	//    4    8:return          
	}

	public static void throwAsIAE(Throwable throwable, String s)
	{
		if(throwable instanceof RuntimeException)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #359 <Class RuntimeException>
	//*   2    4:ifeq            12
			throw (RuntimeException)throwable;
	//    3    7:aload_0         
	//    4    8:checkcast       #359 <Class RuntimeException>
	//    5   11:athrow          
		if(throwable instanceof Error)
	//*   6   12:aload_0         
	//*   7   13:instanceof      #579 <Class Error>
	//*   8   16:ifeq            24
			throw (Error)throwable;
	//    9   19:aload_0         
	//   10   20:checkcast       #579 <Class Error>
	//   11   23:athrow          
		else
			throw new IllegalArgumentException(s, throwable);
	//   12   24:new             #186 <Class IllegalArgumentException>
	//   13   27:dup             
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:invokespecial   #580 <Method void IllegalArgumentException(String, Throwable)>
	//   17   33:athrow          
	}

	public static void throwRootCause(Throwable throwable)
		throws Exception
	{
		throwable = getRootCause(throwable);
	//    0    0:aload_0         
	//    1    1:invokestatic    #355 <Method Throwable getRootCause(Throwable)>
	//    2    4:astore_0        
		if(throwable instanceof Exception)
	//*   3    5:aload_0         
	//*   4    6:instanceof      #219 <Class Exception>
	//*   5    9:ifeq            17
			throw (Exception)throwable;
	//    6   12:aload_0         
	//    7   13:checkcast       #219 <Class Exception>
	//    8   16:athrow          
		else
			throw (Error)throwable;
	//    9   17:aload_0         
	//   10   18:checkcast       #579 <Class Error>
	//   11   21:athrow          
	}

	public static void unwrapAndThrowAsIAE(Throwable throwable)
	{
		throwAsIAE(getRootCause(throwable));
	//    0    0:aload_0         
	//    1    1:invokestatic    #355 <Method Throwable getRootCause(Throwable)>
	//    2    4:invokestatic    #583 <Method void throwAsIAE(Throwable)>
	//    3    7:return          
	}

	public static void unwrapAndThrowAsIAE(Throwable throwable, String s)
	{
		throwAsIAE(getRootCause(throwable), s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #355 <Method Throwable getRootCause(Throwable)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #577 <Method void throwAsIAE(Throwable, String)>
	//    4    8:return          
	}

	public static Class wrapperType(Class class1)
	{
		if(class1 == Integer.TYPE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #251 <Field Class Integer.TYPE>
	//*   2    4:if_acmpne       10
			return java/lang/Integer;
	//    3    7:ldc1            #248 <Class Integer>
	//    4    9:areturn         
		if(class1 == Long.TYPE)
	//*   5   10:aload_0         
	//*   6   11:getstatic       #258 <Field Class Long.TYPE>
	//*   7   14:if_acmpne       21
			return java/lang/Long;
	//    8   17:ldc2            #257 <Class Long>
	//    9   20:areturn         
		if(class1 == Boolean.TYPE)
	//*  10   21:aload_0         
	//*  11   22:getstatic       #264 <Field Class Boolean.TYPE>
	//*  12   25:if_acmpne       32
			return java/lang/Boolean;
	//   13   28:ldc2            #263 <Class Boolean>
	//   14   31:areturn         
		if(class1 == Double.TYPE)
	//*  15   32:aload_0         
	//*  16   33:getstatic       #271 <Field Class Double.TYPE>
	//*  17   36:if_acmpne       43
			return java/lang/Double;
	//   18   39:ldc2            #270 <Class Double>
	//   19   42:areturn         
		if(class1 == Float.TYPE)
	//*  20   43:aload_0         
	//*  21   44:getstatic       #277 <Field Class Float.TYPE>
	//*  22   47:if_acmpne       54
			return java/lang/Float;
	//   23   50:ldc2            #276 <Class Float>
	//   24   53:areturn         
		if(class1 == Byte.TYPE)
	//*  25   54:aload_0         
	//*  26   55:getstatic       #283 <Field Class Byte.TYPE>
	//*  27   58:if_acmpne       65
			return java/lang/Byte;
	//   28   61:ldc2            #282 <Class Byte>
	//   29   64:areturn         
		if(class1 == Short.TYPE)
	//*  30   65:aload_0         
	//*  31   66:getstatic       #289 <Field Class Short.TYPE>
	//*  32   69:if_acmpne       76
			return java/lang/Short;
	//   33   72:ldc2            #288 <Class Short>
	//   34   75:areturn         
		if(class1 == Character.TYPE)
	//*  35   76:aload_0         
	//*  36   77:getstatic       #295 <Field Class Character.TYPE>
	//*  37   80:if_acmpne       87
			return java/lang/Character;
	//   38   83:ldc2            #294 <Class Character>
	//   39   86:areturn         
		else
			throw new IllegalArgumentException((new StringBuilder()).append("Class ").append(class1.getName()).append(" is not a primitive type").toString());
	//   40   87:new             #186 <Class IllegalArgumentException>
	//   41   90:dup             
	//   42   91:new             #188 <Class StringBuilder>
	//   43   94:dup             
	//   44   95:invokespecial   #189 <Method void StringBuilder()>
	//   45   98:ldc1            #225 <String "Class ">
	//   46  100:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   47  103:aload_0         
	//   48  104:invokevirtual   #204 <Method String Class.getName()>
	//   49  107:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   50  110:ldc2            #300 <String " is not a primitive type">
	//   51  113:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   52  116:invokevirtual   #212 <Method String StringBuilder.toString()>
	//   53  119:invokespecial   #215 <Method void IllegalArgumentException(String)>
	//   54  122:athrow          
	}

	private static final Class CLS_OBJECT = java/lang/Object;
	private static final EmptyIterator EMPTY_ITERATOR = new EmptyIterator();
	private static final LRUMap sCached = new LRUMap(48, 48);

	static 
	{
	//    0    0:ldc1            #4   <Class Object>
	//    1    2:putstatic       #31  <Field Class CLS_OBJECT>
	//    2    5:new             #14  <Class ClassUtil$EmptyIterator>
	//    3    8:dup             
	//    4    9:aconst_null     
	//    5   10:invokespecial   #35  <Method void ClassUtil$EmptyIterator(ClassUtil$1)>
	//    6   13:putstatic       #37  <Field ClassUtil$EmptyIterator EMPTY_ITERATOR>
	//    7   16:new             #39  <Class LRUMap>
	//    8   19:dup             
	//    9   20:bipush          48
	//   10   22:bipush          48
	//   11   24:invokespecial   #42  <Method void LRUMap(int, int)>
	//   12   27:putstatic       #44  <Field LRUMap sCached>
	//*  13   30:return          
	}


/*
	static Class access$100()
	{
		return CLS_OBJECT;
	//    0    0:getstatic       #31  <Field Class CLS_OBJECT>
	//    1    3:areturn         
	}

*/
}
