// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import java.lang.reflect.TypeVariable;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			TypeBindings

static class TypeBindings$TypeParamStash
{

	public static TypeVariable[] paramsFor1(Class class1)
	{
		if(class1 == java/util/Collection)
	//*   0    0:aload_0         
	//*   1    1:ldc1            #31  <Class Collection>
	//*   2    3:if_acmpne       10
			return VARS_COLLECTION;
	//    3    6:getstatic       #33  <Field TypeVariable[] VARS_COLLECTION>
	//    4    9:areturn         
		if(class1 == java/util/List)
	//*   5   10:aload_0         
	//*   6   11:ldc1            #39  <Class List>
	//*   7   13:if_acmpne       20
			return VARS_LIST;
	//    8   16:getstatic       #41  <Field TypeVariable[] VARS_LIST>
	//    9   19:areturn         
		if(class1 == java/util/ArrayList)
	//*  10   20:aload_0         
	//*  11   21:ldc1            #43  <Class ArrayList>
	//*  12   23:if_acmpne       30
			return VARS_ARRAY_LIST;
	//   13   26:getstatic       #45  <Field TypeVariable[] VARS_ARRAY_LIST>
	//   14   29:areturn         
		if(class1 == java/util/AbstractList)
	//*  15   30:aload_0         
	//*  16   31:ldc1            #21  <Class AbstractList>
	//*  17   33:if_acmpne       40
			return VARS_ABSTRACT_LIST;
	//   18   36:getstatic       #29  <Field TypeVariable[] VARS_ABSTRACT_LIST>
	//   19   39:areturn         
		if(class1 == java/lang/Iterable)
	//*  20   40:aload_0         
	//*  21   41:ldc1            #35  <Class Iterable>
	//*  22   43:if_acmpne       50
			return VARS_ITERABLE;
	//   23   46:getstatic       #37  <Field TypeVariable[] VARS_ITERABLE>
	//   24   49:areturn         
		else
			return class1.getTypeParameters();
	//   25   50:aload_0         
	//   26   51:invokevirtual   #27  <Method TypeVariable[] Class.getTypeParameters()>
	//   27   54:areturn         
	}

	public static TypeVariable[] paramsFor2(Class class1)
	{
		if(class1 == java/util/Map)
	//*   0    0:aload_0         
	//*   1    1:ldc1            #47  <Class Map>
	//*   2    3:if_acmpne       10
			return VARS_MAP;
	//    3    6:getstatic       #49  <Field TypeVariable[] VARS_MAP>
	//    4    9:areturn         
		if(class1 == java/util/HashMap)
	//*   5   10:aload_0         
	//*   6   11:ldc1            #51  <Class HashMap>
	//*   7   13:if_acmpne       20
			return VARS_HASH_MAP;
	//    8   16:getstatic       #53  <Field TypeVariable[] VARS_HASH_MAP>
	//    9   19:areturn         
		if(class1 == java/util/LinkedHashMap)
	//*  10   20:aload_0         
	//*  11   21:ldc1            #55  <Class LinkedHashMap>
	//*  12   23:if_acmpne       30
			return VARS_LINKED_HASH_MAP;
	//   13   26:getstatic       #57  <Field TypeVariable[] VARS_LINKED_HASH_MAP>
	//   14   29:areturn         
		else
			return class1.getTypeParameters();
	//   15   30:aload_0         
	//   16   31:invokevirtual   #27  <Method TypeVariable[] Class.getTypeParameters()>
	//   17   34:areturn         
	}

	private static final TypeVariable VARS_ABSTRACT_LIST[] = ((Class) (java/util/AbstractList)).getTypeParameters();
	private static final TypeVariable VARS_ARRAY_LIST[] = ((Class) (java/util/ArrayList)).getTypeParameters();
	private static final TypeVariable VARS_COLLECTION[] = ((Class) (java/util/Collection)).getTypeParameters();
	private static final TypeVariable VARS_HASH_MAP[] = ((Class) (java/util/HashMap)).getTypeParameters();
	private static final TypeVariable VARS_ITERABLE[] = ((Class) (java/lang/Iterable)).getTypeParameters();
	private static final TypeVariable VARS_LINKED_HASH_MAP[] = ((Class) (java/util/LinkedHashMap)).getTypeParameters();
	private static final TypeVariable VARS_LIST[] = ((Class) (java/util/List)).getTypeParameters();
	private static final TypeVariable VARS_MAP[] = ((Class) (java/util/Map)).getTypeParameters();

	static 
	{
	//    0    0:ldc1            #21  <Class AbstractList>
	//    1    2:invokevirtual   #27  <Method TypeVariable[] Class.getTypeParameters()>
	//    2    5:putstatic       #29  <Field TypeVariable[] VARS_ABSTRACT_LIST>
	//    3    8:ldc1            #31  <Class Collection>
	//    4   10:invokevirtual   #27  <Method TypeVariable[] Class.getTypeParameters()>
	//    5   13:putstatic       #33  <Field TypeVariable[] VARS_COLLECTION>
	//    6   16:ldc1            #35  <Class Iterable>
	//    7   18:invokevirtual   #27  <Method TypeVariable[] Class.getTypeParameters()>
	//    8   21:putstatic       #37  <Field TypeVariable[] VARS_ITERABLE>
	//    9   24:ldc1            #39  <Class List>
	//   10   26:invokevirtual   #27  <Method TypeVariable[] Class.getTypeParameters()>
	//   11   29:putstatic       #41  <Field TypeVariable[] VARS_LIST>
	//   12   32:ldc1            #43  <Class ArrayList>
	//   13   34:invokevirtual   #27  <Method TypeVariable[] Class.getTypeParameters()>
	//   14   37:putstatic       #45  <Field TypeVariable[] VARS_ARRAY_LIST>
	//   15   40:ldc1            #47  <Class Map>
	//   16   42:invokevirtual   #27  <Method TypeVariable[] Class.getTypeParameters()>
	//   17   45:putstatic       #49  <Field TypeVariable[] VARS_MAP>
	//   18   48:ldc1            #51  <Class HashMap>
	//   19   50:invokevirtual   #27  <Method TypeVariable[] Class.getTypeParameters()>
	//   20   53:putstatic       #53  <Field TypeVariable[] VARS_HASH_MAP>
	//   21   56:ldc1            #55  <Class LinkedHashMap>
	//   22   58:invokevirtual   #27  <Method TypeVariable[] Class.getTypeParameters()>
	//   23   61:putstatic       #57  <Field TypeVariable[] VARS_LINKED_HASH_MAP>
	//*  24   64:return          
	}

	TypeBindings$TypeParamStash()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void Object()>
	//    2    4:return          
	}
}
