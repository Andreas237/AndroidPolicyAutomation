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
