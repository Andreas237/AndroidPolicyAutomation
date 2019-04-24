// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Field;
import java.util.EnumMap;
import java.util.EnumSet;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			ClassUtil

private static class ClassUtil$EnumTypeLocator
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

	static final ClassUtil$EnumTypeLocator instance = new ClassUtil$EnumTypeLocator();
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

	private ClassUtil$EnumTypeLocator()
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
