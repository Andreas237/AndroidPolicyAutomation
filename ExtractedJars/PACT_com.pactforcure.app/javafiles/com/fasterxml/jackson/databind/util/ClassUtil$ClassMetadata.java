// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			ClassUtil

private static final class ClassUtil$ClassMetadata
{

	private boolean isObjectOrPrimitive()
	{
		return _forClass == ClassUtil.access$100() || _forClass.isPrimitive();
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

	public ClassUtil.Ctor[] getConstructors()
	{
		ClassUtil.Ctor actor[];
		ClassUtil.Ctor actor1[];
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
		java.lang.reflect.Constructor aconstructor[] = _forClass.getDeclaredConstructors();
	//   21   42:aload_0         
	//   22   43:getfield        #46  <Field Class _forClass>
	//   23   46:invokevirtual   #72  <Method java.lang.reflect.Constructor[] Class.getDeclaredConstructors()>
	//   24   49:astore          5
		int j = aconstructor.length;
	//   25   51:aload           5
	//   26   53:arraylength     
	//   27   54:istore_2        
		ClassUtil.Ctor actor2[] = new ClassUtil.Ctor[j];
	//   28   55:iload_2         
	//   29   56:anewarray       ClassUtil.Ctor[]
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
			actor2[i] = new ClassUtil.Ctor(aconstructor[i]);
	//   38   71:aload           4
	//   39   73:iload_1         
	//   40   74:new             #37  <Class ClassUtil$Ctor>
	//   41   77:dup             
	//   42   78:aload           5
	//   43   80:iload_1         
	//   44   81:aaload          
	//   45   82:invokespecial   #75  <Method void ClassUtil$Ctor(java.lang.reflect.Constructor)>
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
	private static final ClassUtil.Ctor NO_CTORS[] = new ClassUtil.Ctor[0];
	private Annotation _annotations[];
	private ClassUtil.Ctor _constructors[];
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
	//    4    8:anewarray       ClassUtil.Ctor[]
	//    5   11:putstatic       #39  <Field ClassUtil$Ctor[] NO_CTORS>
	//*   6   14:return          
	}

	public ClassUtil$ClassMetadata(Class class1)
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
