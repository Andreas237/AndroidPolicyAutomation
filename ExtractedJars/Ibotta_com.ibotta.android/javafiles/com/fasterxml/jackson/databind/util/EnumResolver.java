// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			CompactStringObjectMap

public class EnumResolver
	implements Serializable
{

	protected EnumResolver(Class class1, Enum aenum[], HashMap hashmap, Enum enum)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		_enumClass = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field Class _enumClass>
		_enums = aenum;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field Enum[] _enums>
		_enumsById = hashmap;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #33  <Field HashMap _enumsById>
		_defaultValue = enum;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #35  <Field Enum _defaultValue>
	//   14   25:return          
	}

	public static EnumResolver constructFor(Class class1, AnnotationIntrospector annotationintrospector)
	{
		Enum aenum[] = (Enum[])class1.getEnumConstants();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #46  <Method Object[] Class.getEnumConstants()>
	//    2    4:checkcast       #47  <Class Enum[]>
	//    3    7:astore          6
		if(aenum != null)
	//*   4    9:aload           6
	//*   5   11:ifnull          110
		{
			String as[] = annotationintrospector.findEnumValues(class1, aenum, new String[aenum.length]);
	//    6   14:aload_1         
	//    7   15:aload_0         
	//    8   16:aload           6
	//    9   18:aload           6
	//   10   20:arraylength     
	//   11   21:anewarray       String[]
	//   12   24:invokevirtual   #55  <Method String[] AnnotationIntrospector.findEnumValues(Class, Enum[], String[])>
	//   13   27:astore          7
			HashMap hashmap = new HashMap();
	//   14   29:new             #57  <Class HashMap>
	//   15   32:dup             
	//   16   33:invokespecial   #58  <Method void HashMap()>
	//   17   36:astore          8
			int i = 0;
	//   18   38:iconst_0        
	//   19   39:istore_2        
			for(int j = aenum.length; i < j; i++)
	//*  20   40:aload           6
	//*  21   42:arraylength     
	//*  22   43:istore_3        
	//*  23   44:iload_2         
	//*  24   45:iload_3         
	//*  25   46:icmpge          92
			{
				String s1 = as[i];
	//   26   49:aload           7
	//   27   51:iload_2         
	//   28   52:aaload          
	//   29   53:astore          5
				String s = s1;
	//   30   55:aload           5
	//   31   57:astore          4
				if(s1 == null)
	//*  32   59:aload           5
	//*  33   61:ifnonnull       73
					s = aenum[i].name();
	//   34   64:aload           6
	//   35   66:iload_2         
	//   36   67:aaload          
	//   37   68:invokevirtual   #64  <Method String Enum.name()>
	//   38   71:astore          4
				hashmap.put(((Object) (s)), ((Object) (aenum[i])));
	//   39   73:aload           8
	//   40   75:aload           4
	//   41   77:aload           6
	//   42   79:iload_2         
	//   43   80:aaload          
	//   44   81:invokevirtual   #68  <Method Object HashMap.put(Object, Object)>
	//   45   84:pop             
			}

	//   46   85:iload_2         
	//   47   86:iconst_1        
	//   48   87:iadd            
	//   49   88:istore_2        
	//*  50   89:goto            44
			return new EnumResolver(class1, aenum, hashmap, annotationintrospector.findDefaultEnumValue(class1));
	//   51   92:new             #2   <Class EnumResolver>
	//   52   95:dup             
	//   53   96:aload_0         
	//   54   97:aload           6
	//   55   99:aload           8
	//   56  101:aload_1         
	//   57  102:aload_0         
	//   58  103:invokevirtual   #72  <Method Enum AnnotationIntrospector.findDefaultEnumValue(Class)>
	//   59  106:invokespecial   #74  <Method void EnumResolver(Class, Enum[], HashMap, Enum)>
	//   60  109:areturn         
		} else
		{
			annotationintrospector = ((AnnotationIntrospector) (new StringBuilder()));
	//   61  110:new             #76  <Class StringBuilder>
	//   62  113:dup             
	//   63  114:invokespecial   #77  <Method void StringBuilder()>
	//   64  117:astore_1        
			((StringBuilder) (annotationintrospector)).append("No enum constants for class ");
	//   65  118:aload_1         
	//   66  119:ldc1            #79  <String "No enum constants for class ">
	//   67  121:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   68  124:pop             
			((StringBuilder) (annotationintrospector)).append(class1.getName());
	//   69  125:aload_1         
	//   70  126:aload_0         
	//   71  127:invokevirtual   #86  <Method String Class.getName()>
	//   72  130:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   73  133:pop             
			throw new IllegalArgumentException(((StringBuilder) (annotationintrospector)).toString());
	//   74  134:new             #88  <Class IllegalArgumentException>
	//   75  137:dup             
	//   76  138:aload_1         
	//   77  139:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   78  142:invokespecial   #94  <Method void IllegalArgumentException(String)>
	//   79  145:athrow          
		}
	}

	public static EnumResolver constructUnsafe(Class class1, AnnotationIntrospector annotationintrospector)
	{
		return constructFor(class1, annotationintrospector);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #98  <Method EnumResolver constructFor(Class, AnnotationIntrospector)>
	//    3    5:areturn         
	}

	public static EnumResolver constructUnsafeUsingMethod(Class class1, AnnotatedMember annotatedmember, AnnotationIntrospector annotationintrospector)
	{
		return constructUsingMethod(class1, annotatedmember, annotationintrospector);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #104 <Method EnumResolver constructUsingMethod(Class, AnnotatedMember, AnnotationIntrospector)>
	//    4    6:areturn         
	}

	public static EnumResolver constructUnsafeUsingToString(Class class1, AnnotationIntrospector annotationintrospector)
	{
		return constructUsingToString(class1, annotationintrospector);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #109 <Method EnumResolver constructUsingToString(Class, AnnotationIntrospector)>
	//    3    5:areturn         
	}

	public static EnumResolver constructUsingMethod(Class class1, AnnotatedMember annotatedmember, AnnotationIntrospector annotationintrospector)
	{
		int i;
		Enum aenum[];
		HashMap hashmap;
		aenum = (Enum[])class1.getEnumConstants();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #46  <Method Object[] Class.getEnumConstants()>
	//    2    4:checkcast       #47  <Class Enum[]>
	//    3    7:astore          5
		hashmap = new HashMap();
	//    4    9:new             #57  <Class HashMap>
	//    5   12:dup             
	//    6   13:invokespecial   #58  <Method void HashMap()>
	//    7   16:astore          6
		i = aenum.length;
	//    8   18:aload           5
	//    9   20:arraylength     
	//   10   21:istore_3        
_L2:
		int j = i - 1;
	//   11   22:iload_3         
	//   12   23:iconst_1        
	//   13   24:isub            
	//   14   25:istore          4
		if(j < 0)
			break; /* Loop/switch isn't completed */
	//   15   27:iload           4
	//   16   29:iflt            125
		Enum enum = aenum[j];
	//   17   32:aload           5
	//   18   34:iload           4
	//   19   36:aaload          
	//   20   37:astore          7
		Object obj;
		try
		{
			obj = annotatedmember.getValue(((Object) (enum)));
	//   21   39:aload_1         
	//   22   40:aload           7
	//   23   42:invokevirtual   #117 <Method Object AnnotatedMember.getValue(Object)>
	//   24   45:astore          8
		}
	//*  25   47:iload           4
	//*  26   49:istore_3        
	//*  27   50:aload           8
	//*  28   52:ifnull          22
	//*  29   55:aload           6
	//*  30   57:aload           8
	//*  31   59:invokevirtual   #118 <Method String Object.toString()>
	//*  32   62:aload           7
	//*  33   64:invokevirtual   #68  <Method Object HashMap.put(Object, Object)>
	//*  34   67:pop             
	//*  35   68:iload           4
	//*  36   70:istore_3        
	//*  37   71:goto            22
		// Misplaced declaration of an exception variable
		catch(Class class1)
	//*  38   74:astore_0        
		{
			annotatedmember = ((AnnotatedMember) (new StringBuilder()));
	//   39   75:new             #76  <Class StringBuilder>
	//   40   78:dup             
	//   41   79:invokespecial   #77  <Method void StringBuilder()>
	//   42   82:astore_1        
			((StringBuilder) (annotatedmember)).append("Failed to access @JsonValue of Enum value ");
	//   43   83:aload_1         
	//   44   84:ldc1            #120 <String "Failed to access @JsonValue of Enum value ">
	//   45   86:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   46   89:pop             
			((StringBuilder) (annotatedmember)).append(((Object) (enum)));
	//   47   90:aload_1         
	//   48   91:aload           7
	//   49   93:invokevirtual   #123 <Method StringBuilder StringBuilder.append(Object)>
	//   50   96:pop             
			((StringBuilder) (annotatedmember)).append(": ");
	//   51   97:aload_1         
	//   52   98:ldc1            #125 <String ": ">
	//   53  100:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   54  103:pop             
			((StringBuilder) (annotatedmember)).append(((Exception) (class1)).getMessage());
	//   55  104:aload_1         
	//   56  105:aload_0         
	//   57  106:invokevirtual   #128 <Method String Exception.getMessage()>
	//   58  109:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   59  112:pop             
			throw new IllegalArgumentException(((StringBuilder) (annotatedmember)).toString());
	//   60  113:new             #88  <Class IllegalArgumentException>
	//   61  116:dup             
	//   62  117:aload_1         
	//   63  118:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   64  121:invokespecial   #94  <Method void IllegalArgumentException(String)>
	//   65  124:athrow          
		}
		i = j;
		if(obj == null)
			continue; /* Loop/switch isn't completed */
		hashmap.put(((Object) (obj.toString())), ((Object) (enum)));
		i = j;
		if(true) goto _L2; else goto _L1
_L1:
		if(annotationintrospector != null)
	//*  66  125:aload_2         
	//*  67  126:ifnull          138
			annotatedmember = ((AnnotatedMember) (annotationintrospector.findDefaultEnumValue(class1)));
	//   68  129:aload_2         
	//   69  130:aload_0         
	//   70  131:invokevirtual   #72  <Method Enum AnnotationIntrospector.findDefaultEnumValue(Class)>
	//   71  134:astore_1        
		else
	//*  72  135:goto            140
			annotatedmember = null;
	//   73  138:aconst_null     
	//   74  139:astore_1        
		return new EnumResolver(class1, aenum, hashmap, ((Enum) (annotatedmember)));
	//   75  140:new             #2   <Class EnumResolver>
	//   76  143:dup             
	//   77  144:aload_0         
	//   78  145:aload           5
	//   79  147:aload           6
	//   80  149:aload_1         
	//   81  150:invokespecial   #74  <Method void EnumResolver(Class, Enum[], HashMap, Enum)>
	//   82  153:areturn         
	}

	public static EnumResolver constructUsingToString(Class class1, AnnotationIntrospector annotationintrospector)
	{
		Enum aenum[] = (Enum[])class1.getEnumConstants();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #46  <Method Object[] Class.getEnumConstants()>
	//    2    4:checkcast       #47  <Class Enum[]>
	//    3    7:astore_3        
		HashMap hashmap = new HashMap();
	//    4    8:new             #57  <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #58  <Method void HashMap()>
	//    7   15:astore          4
		int i = aenum.length;
	//    8   17:aload_3         
	//    9   18:arraylength     
	//   10   19:istore_2        
		do
		{
			i--;
	//   11   20:iload_2         
	//   12   21:iconst_1        
	//   13   22:isub            
	//   14   23:istore_2        
			if(i < 0)
				break;
	//   15   24:iload_2         
	//   16   25:iflt            49
			Enum enum = aenum[i];
	//   17   28:aload_3         
	//   18   29:iload_2         
	//   19   30:aaload          
	//   20   31:astore          5
			hashmap.put(((Object) (enum.toString())), ((Object) (enum)));
	//   21   33:aload           4
	//   22   35:aload           5
	//   23   37:invokevirtual   #130 <Method String Enum.toString()>
	//   24   40:aload           5
	//   25   42:invokevirtual   #68  <Method Object HashMap.put(Object, Object)>
	//   26   45:pop             
		} while(true);
	//   27   46:goto            20
		if(annotationintrospector == null)
	//*  28   49:aload_1         
	//*  29   50:ifnonnull       58
			annotationintrospector = null;
	//   30   53:aconst_null     
	//   31   54:astore_1        
		else
	//*  32   55:goto            64
			annotationintrospector = ((AnnotationIntrospector) (annotationintrospector.findDefaultEnumValue(class1)));
	//   33   58:aload_1         
	//   34   59:aload_0         
	//   35   60:invokevirtual   #72  <Method Enum AnnotationIntrospector.findDefaultEnumValue(Class)>
	//   36   63:astore_1        
		return new EnumResolver(class1, aenum, hashmap, ((Enum) (annotationintrospector)));
	//   37   64:new             #2   <Class EnumResolver>
	//   38   67:dup             
	//   39   68:aload_0         
	//   40   69:aload_3         
	//   41   70:aload           4
	//   42   72:aload_1         
	//   43   73:invokespecial   #74  <Method void EnumResolver(Class, Enum[], HashMap, Enum)>
	//   44   76:areturn         
	}

	public CompactStringObjectMap constructLookup()
	{
		return CompactStringObjectMap.construct(((java.util.Map) (_enumsById)));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field HashMap _enumsById>
	//    2    4:invokestatic    #138 <Method CompactStringObjectMap CompactStringObjectMap.construct(java.util.Map)>
	//    3    7:areturn         
	}

	public Enum findEnum(String s)
	{
		return (Enum)_enumsById.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field HashMap _enumsById>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #143 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #60  <Class Enum>
	//    5   11:areturn         
	}

	public Enum getDefaultValue()
	{
		return _defaultValue;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Enum _defaultValue>
	//    2    4:areturn         
	}

	public Class getEnumClass()
	{
		return _enumClass;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Class _enumClass>
	//    2    4:areturn         
	}

	public Collection getEnumIds()
	{
		return ((Collection) (_enumsById.keySet()));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field HashMap _enumsById>
	//    2    4:invokevirtual   #156 <Method java.util.Set HashMap.keySet()>
	//    3    7:areturn         
	}

	public Enum[] getRawEnums()
	{
		return _enums;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Enum[] _enums>
	//    2    4:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final Enum _defaultValue;
	protected final Class _enumClass;
	protected final Enum _enums[];
	protected final HashMap _enumsById;
}
