// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			CompactStringObjectMap

public class EnumResolver
	implements Serializable
{

	protected EnumResolver(Class class1, Enum aenum[], HashMap hashmap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		_enumClass = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field Class _enumClass>
		_enums = aenum;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field Enum[] _enums>
		_enumsById = hashmap;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #30  <Field HashMap _enumsById>
	//   11   19:return          
	}

	public static EnumResolver constructFor(Class class1, AnnotationIntrospector annotationintrospector)
	{
		Enum aenum[] = (Enum[])class1.getEnumConstants();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method Object[] Class.getEnumConstants()>
	//    2    4:checkcast       #42  <Class Enum[]>
	//    3    7:astore          5
		if(aenum == null)
	//*   4    9:aload           5
	//*   5   11:ifnonnull       44
			throw new IllegalArgumentException((new StringBuilder()).append("No enum constants for class ").append(class1.getName()).toString());
	//    6   14:new             #44  <Class IllegalArgumentException>
	//    7   17:dup             
	//    8   18:new             #46  <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #47  <Method void StringBuilder()>
	//   11   25:ldc1            #49  <String "No enum constants for class ">
	//   12   27:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:aload_0         
	//   14   31:invokevirtual   #57  <Method String Class.getName()>
	//   15   34:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   16   37:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   17   40:invokespecial   #63  <Method void IllegalArgumentException(String)>
	//   18   43:athrow          
		String as[] = annotationintrospector.findEnumValues(class1, aenum, new String[aenum.length]);
	//   19   44:aload_1         
	//   20   45:aload_0         
	//   21   46:aload           5
	//   22   48:aload           5
	//   23   50:arraylength     
	//   24   51:anewarray       String[]
	//   25   54:invokevirtual   #71  <Method String[] AnnotationIntrospector.findEnumValues(Class, Enum[], String[])>
	//   26   57:astore          6
		HashMap hashmap = new HashMap();
	//   27   59:new             #73  <Class HashMap>
	//   28   62:dup             
	//   29   63:invokespecial   #74  <Method void HashMap()>
	//   30   66:astore          7
		int i = 0;
	//   31   68:iconst_0        
	//   32   69:istore_2        
		for(int j = aenum.length; i < j; i++)
	//*  33   70:aload           5
	//*  34   72:arraylength     
	//*  35   73:istore_3        
	//*  36   74:iload_2         
	//*  37   75:iload_3         
	//*  38   76:icmpge          119
		{
			String s = as[i];
	//   39   79:aload           6
	//   40   81:iload_2         
	//   41   82:aaload          
	//   42   83:astore          4
			annotationintrospector = ((AnnotationIntrospector) (s));
	//   43   85:aload           4
	//   44   87:astore_1        
			if(s == null)
	//*  45   88:aload           4
	//*  46   90:ifnonnull       101
				annotationintrospector = ((AnnotationIntrospector) (aenum[i].name()));
	//   47   93:aload           5
	//   48   95:iload_2         
	//   49   96:aaload          
	//   50   97:invokevirtual   #79  <Method String Enum.name()>
	//   51  100:astore_1        
			hashmap.put(((Object) (annotationintrospector)), ((Object) (aenum[i])));
	//   52  101:aload           7
	//   53  103:aload_1         
	//   54  104:aload           5
	//   55  106:iload_2         
	//   56  107:aaload          
	//   57  108:invokevirtual   #83  <Method Object HashMap.put(Object, Object)>
	//   58  111:pop             
		}

	//   59  112:iload_2         
	//   60  113:iconst_1        
	//   61  114:iadd            
	//   62  115:istore_2        
	//*  63  116:goto            74
		return new EnumResolver(class1, aenum, hashmap);
	//   64  119:new             #2   <Class EnumResolver>
	//   65  122:dup             
	//   66  123:aload_0         
	//   67  124:aload           5
	//   68  126:aload           7
	//   69  128:invokespecial   #85  <Method void EnumResolver(Class, Enum[], HashMap)>
	//   70  131:areturn         
	}

	public static EnumResolver constructUnsafe(Class class1, AnnotationIntrospector annotationintrospector)
	{
		return constructFor(class1, annotationintrospector);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #89  <Method EnumResolver constructFor(Class, AnnotationIntrospector)>
	//    3    5:areturn         
	}

	public static EnumResolver constructUnsafeUsingMethod(Class class1, Method method)
	{
		return constructUsingMethod(class1, method);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #95  <Method EnumResolver constructUsingMethod(Class, Method)>
	//    3    5:areturn         
	}

	public static EnumResolver constructUnsafeUsingToString(Class class1)
	{
		return constructUsingToString(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #101 <Method EnumResolver constructUsingToString(Class)>
	//    2    4:areturn         
	}

	public static EnumResolver constructUsingMethod(Class class1, Method method)
	{
		int i;
		Enum aenum[];
		HashMap hashmap;
		aenum = (Enum[])class1.getEnumConstants();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method Object[] Class.getEnumConstants()>
	//    2    4:checkcast       #42  <Class Enum[]>
	//    3    7:astore          5
		hashmap = new HashMap();
	//    4    9:new             #73  <Class HashMap>
	//    5   12:dup             
	//    6   13:invokespecial   #74  <Method void HashMap()>
	//    7   16:astore          6
		i = aenum.length;
	//    8   18:aload           5
	//    9   20:arraylength     
	//   10   21:istore_2        
_L2:
		int j = i - 1;
	//   11   22:iload_2         
	//   12   23:iconst_1        
	//   13   24:isub            
	//   14   25:istore_3        
		if(j < 0)
			break; /* Loop/switch isn't completed */
	//   15   26:iload_3         
	//   16   27:iflt            114
		Enum enum = aenum[j];
	//   17   30:aload           5
	//   18   32:iload_3         
	//   19   33:aaload          
	//   20   34:astore          4
		Object obj;
		try
		{
			obj = method.invoke(((Object) (enum)), new Object[0]);
	//   21   36:aload_1         
	//   22   37:aload           4
	//   23   39:iconst_0        
	//   24   40:anewarray       Object[]
	//   25   43:invokevirtual   #110 <Method Object Method.invoke(Object, Object[])>
	//   26   46:astore          7
		}
	//*  27   48:iload_3         
	//*  28   49:istore_2        
	//*  29   50:aload           7
	//*  30   52:ifnull          22
	//*  31   55:aload           6
	//*  32   57:aload           7
	//*  33   59:invokevirtual   #111 <Method String Object.toString()>
	//*  34   62:aload           4
	//*  35   64:invokevirtual   #83  <Method Object HashMap.put(Object, Object)>
	//*  36   67:pop             
	//*  37   68:iload_3         
	//*  38   69:istore_2        
	//*  39   70:goto            22
		// Misplaced declaration of an exception variable
		catch(Class class1)
	//*  40   73:astore_0        
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Failed to access @JsonValue of Enum value ").append(((Object) (enum))).append(": ").append(((Exception) (class1)).getMessage()).toString());
	//   41   74:new             #44  <Class IllegalArgumentException>
	//   42   77:dup             
	//   43   78:new             #46  <Class StringBuilder>
	//   44   81:dup             
	//   45   82:invokespecial   #47  <Method void StringBuilder()>
	//   46   85:ldc1            #113 <String "Failed to access @JsonValue of Enum value ">
	//   47   87:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   48   90:aload           4
	//   49   92:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
	//   50   95:ldc1            #118 <String ": ">
	//   51   97:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   52  100:aload_0         
	//   53  101:invokevirtual   #121 <Method String Exception.getMessage()>
	//   54  104:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   55  107:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   56  110:invokespecial   #63  <Method void IllegalArgumentException(String)>
	//   57  113:athrow          
		}
		i = j;
		if(obj == null)
			continue; /* Loop/switch isn't completed */
		hashmap.put(((Object) (obj.toString())), ((Object) (enum)));
		i = j;
		if(true) goto _L2; else goto _L1
_L1:
		return new EnumResolver(class1, aenum, hashmap);
	//   58  114:new             #2   <Class EnumResolver>
	//   59  117:dup             
	//   60  118:aload_0         
	//   61  119:aload           5
	//   62  121:aload           6
	//   63  123:invokespecial   #85  <Method void EnumResolver(Class, Enum[], HashMap)>
	//   64  126:areturn         
	}

	public static EnumResolver constructUsingToString(Class class1)
	{
		Enum aenum[] = (Enum[])class1.getEnumConstants();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method Object[] Class.getEnumConstants()>
	//    2    4:checkcast       #42  <Class Enum[]>
	//    3    7:astore_2        
		HashMap hashmap = new HashMap();
	//    4    8:new             #73  <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #74  <Method void HashMap()>
	//    7   15:astore_3        
		int i = aenum.length;
	//    8   16:aload_2         
	//    9   17:arraylength     
	//   10   18:istore_1        
		do
		{
			i--;
	//   11   19:iload_1         
	//   12   20:iconst_1        
	//   13   21:isub            
	//   14   22:istore_1        
			if(i >= 0)
	//*  15   23:iload_1         
	//*  16   24:iflt            47
			{
				Enum enum = aenum[i];
	//   17   27:aload_2         
	//   18   28:iload_1         
	//   19   29:aaload          
	//   20   30:astore          4
				hashmap.put(((Object) (enum.toString())), ((Object) (enum)));
	//   21   32:aload_3         
	//   22   33:aload           4
	//   23   35:invokevirtual   #123 <Method String Enum.toString()>
	//   24   38:aload           4
	//   25   40:invokevirtual   #83  <Method Object HashMap.put(Object, Object)>
	//   26   43:pop             
			} else
	//*  27   44:goto            19
			{
				return new EnumResolver(class1, aenum, hashmap);
	//   28   47:new             #2   <Class EnumResolver>
	//   29   50:dup             
	//   30   51:aload_0         
	//   31   52:aload_2         
	//   32   53:aload_3         
	//   33   54:invokespecial   #85  <Method void EnumResolver(Class, Enum[], HashMap)>
	//   34   57:areturn         
			}
		} while(true);
	}

	public CompactStringObjectMap constructLookup()
	{
		return CompactStringObjectMap.construct(((java.util.Map) (_enumsById)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field HashMap _enumsById>
	//    2    4:invokestatic    #132 <Method CompactStringObjectMap CompactStringObjectMap.construct(java.util.Map)>
	//    3    7:areturn         
	}

	public Enum findEnum(String s)
	{
		return (Enum)_enumsById.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field HashMap _enumsById>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #138 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #76  <Class Enum>
	//    5   11:areturn         
	}

	public Enum getEnum(int i)
	{
		if(i < 0 || i >= _enums.length)
	//*   0    0:iload_1         
	//*   1    1:iflt            13
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #28  <Field Enum[] _enums>
	//*   5    9:arraylength     
	//*   6   10:icmplt          15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		else
			return _enums[i];
	//    9   15:aload_0         
	//   10   16:getfield        #28  <Field Enum[] _enums>
	//   11   19:iload_1         
	//   12   20:aaload          
	//   13   21:areturn         
	}

	public Class getEnumClass()
	{
		return _enumClass;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Class _enumClass>
	//    2    4:areturn         
	}

	public List getEnums()
	{
		ArrayList arraylist = new ArrayList(_enums.length);
	//    0    0:new             #149 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field Enum[] _enums>
	//    4    8:arraylength     
	//    5    9:invokespecial   #152 <Method void ArrayList(int)>
	//    6   12:astore_3        
		Enum aenum[] = _enums;
	//    7   13:aload_0         
	//    8   14:getfield        #28  <Field Enum[] _enums>
	//    9   17:astore          4
		int j = aenum.length;
	//   10   19:aload           4
	//   11   21:arraylength     
	//   12   22:istore_2        
		for(int i = 0; i < j; i++)
	//*  13   23:iconst_0        
	//*  14   24:istore_1        
	//*  15   25:iload_1         
	//*  16   26:iload_2         
	//*  17   27:icmpge          46
			arraylist.add(((Object) (aenum[i])));
	//   18   30:aload_3         
	//   19   31:aload           4
	//   20   33:iload_1         
	//   21   34:aaload          
	//   22   35:invokevirtual   #156 <Method boolean ArrayList.add(Object)>
	//   23   38:pop             

	//   24   39:iload_1         
	//   25   40:iconst_1        
	//   26   41:iadd            
	//   27   42:istore_1        
	//*  28   43:goto            25
		return ((List) (arraylist));
	//   29   46:aload_3         
	//   30   47:areturn         
	}

	public Enum[] getRawEnums()
	{
		return _enums;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Enum[] _enums>
	//    2    4:areturn         
	}

	public int lastValidIndex()
	{
		return _enums.length - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Enum[] _enums>
	//    2    4:arraylength     
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:ireturn         
	}

	private static final long serialVersionUID = 1L;
	protected final Class _enumClass;
	protected final Enum _enums[];
	protected final HashMap _enumsById;
}
