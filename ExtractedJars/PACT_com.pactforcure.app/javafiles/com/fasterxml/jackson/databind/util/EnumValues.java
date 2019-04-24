// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			ClassUtil

public final class EnumValues
	implements Serializable
{

	private EnumValues(Class class1, SerializableString aserializablestring[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		_enumClass = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field Class _enumClass>
		_values = (Enum[])class1.getEnumConstants();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #34  <Method Object[] Class.getEnumConstants()>
	//    8   14:checkcast       #35  <Class Enum[]>
	//    9   17:putfield        #37  <Field Enum[] _values>
		_textual = aserializablestring;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #39  <Field SerializableString[] _textual>
	//   13   25:return          
	}

	public static EnumValues construct(SerializationConfig serializationconfig, Class class1)
	{
		if(serializationconfig.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #50  <Field SerializationFeature SerializationFeature.WRITE_ENUMS_USING_TO_STRING>
	//*   2    4:invokevirtual   #56  <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//*   3    7:ifeq            16
			return constructFromToString(((MapperConfig) (serializationconfig)), class1);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokestatic    #60  <Method EnumValues constructFromToString(MapperConfig, Class)>
	//    7   15:areturn         
		else
			return constructFromName(((MapperConfig) (serializationconfig)), class1);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokestatic    #63  <Method EnumValues constructFromName(MapperConfig, Class)>
	//   11   21:areturn         
	}

	public static EnumValues constructFromName(MapperConfig mapperconfig, Class class1)
	{
		Class class2 = ClassUtil.findEnumType(class1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #70  <Method Class ClassUtil.findEnumType(Class)>
	//    2    4:astore          4
		Enum aenum[] = (Enum[])class2.getEnumConstants();
	//    3    6:aload           4
	//    4    8:invokevirtual   #34  <Method Object[] Class.getEnumConstants()>
	//    5   11:checkcast       #35  <Class Enum[]>
	//    6   14:astore          6
		if(aenum == null)
	//*   7   16:aload           6
	//*   8   18:ifnonnull       51
			throw new IllegalArgumentException((new StringBuilder()).append("Can not determine enum constants for Class ").append(class1.getName()).toString());
	//    9   21:new             #72  <Class IllegalArgumentException>
	//   10   24:dup             
	//   11   25:new             #74  <Class StringBuilder>
	//   12   28:dup             
	//   13   29:invokespecial   #75  <Method void StringBuilder()>
	//   14   32:ldc1            #77  <String "Can not determine enum constants for Class ">
	//   15   34:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   16   37:aload_1         
	//   17   38:invokevirtual   #85  <Method String Class.getName()>
	//   18   41:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   19   44:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   20   47:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//   21   50:athrow          
		String as[] = mapperconfig.getAnnotationIntrospector().findEnumValues(class2, aenum, new String[aenum.length]);
	//   22   51:aload_0         
	//   23   52:invokevirtual   #97  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//   24   55:aload           4
	//   25   57:aload           6
	//   26   59:aload           6
	//   27   61:arraylength     
	//   28   62:anewarray       String[]
	//   29   65:invokevirtual   #105 <Method String[] AnnotationIntrospector.findEnumValues(Class, Enum[], String[])>
	//   30   68:astore          7
		SerializableString aserializablestring[] = new SerializableString[aenum.length];
	//   31   70:aload           6
	//   32   72:arraylength     
	//   33   73:anewarray       SerializableString[]
	//   34   76:astore          8
		int i = 0;
	//   35   78:iconst_0        
	//   36   79:istore_2        
		for(int j = aenum.length; i < j; i++)
	//*  37   80:aload           6
	//*  38   82:arraylength     
	//*  39   83:istore_3        
	//*  40   84:iload_2         
	//*  41   85:iload_3         
	//*  42   86:icmpge          138
		{
			Enum enum = aenum[i];
	//   43   89:aload           6
	//   44   91:iload_2         
	//   45   92:aaload          
	//   46   93:astore          9
			String s1 = as[i];
	//   47   95:aload           7
	//   48   97:iload_2         
	//   49   98:aaload          
	//   50   99:astore          5
			String s = s1;
	//   51  101:aload           5
	//   52  103:astore          4
			if(s1 == null)
	//*  53  105:aload           5
	//*  54  107:ifnonnull       117
				s = enum.name();
	//   55  110:aload           9
	//   56  112:invokevirtual   #112 <Method String Enum.name()>
	//   57  115:astore          4
			aserializablestring[enum.ordinal()] = mapperconfig.compileString(s);
	//   58  117:aload           8
	//   59  119:aload           9
	//   60  121:invokevirtual   #116 <Method int Enum.ordinal()>
	//   61  124:aload_0         
	//   62  125:aload           4
	//   63  127:invokevirtual   #120 <Method SerializableString MapperConfig.compileString(String)>
	//   64  130:aastore         
		}

	//   65  131:iload_2         
	//   66  132:iconst_1        
	//   67  133:iadd            
	//   68  134:istore_2        
	//*  69  135:goto            84
		return new EnumValues(class1, aserializablestring);
	//   70  138:new             #2   <Class EnumValues>
	//   71  141:dup             
	//   72  142:aload_1         
	//   73  143:aload           8
	//   74  145:invokespecial   #122 <Method void EnumValues(Class, SerializableString[])>
	//   75  148:areturn         
	}

	public static EnumValues constructFromToString(MapperConfig mapperconfig, Class class1)
	{
		Enum aenum[] = (Enum[])ClassUtil.findEnumType(class1).getEnumConstants();
	//    0    0:aload_1         
	//    1    1:invokestatic    #70  <Method Class ClassUtil.findEnumType(Class)>
	//    2    4:invokevirtual   #34  <Method Object[] Class.getEnumConstants()>
	//    3    7:checkcast       #35  <Class Enum[]>
	//    4   10:astore          4
		if(aenum != null)
	//*   5   12:aload           4
	//*   6   14:ifnull          77
		{
			SerializableString aserializablestring[] = new SerializableString[aenum.length];
	//    7   17:aload           4
	//    8   19:arraylength     
	//    9   20:anewarray       SerializableString[]
	//   10   23:astore          5
			int j = aenum.length;
	//   11   25:aload           4
	//   12   27:arraylength     
	//   13   28:istore_3        
			for(int i = 0; i < j; i++)
	//*  14   29:iconst_0        
	//*  15   30:istore_2        
	//*  16   31:iload_2         
	//*  17   32:iload_3         
	//*  18   33:icmpge          66
			{
				Enum enum = aenum[i];
	//   19   36:aload           4
	//   20   38:iload_2         
	//   21   39:aaload          
	//   22   40:astore          6
				aserializablestring[enum.ordinal()] = mapperconfig.compileString(enum.toString());
	//   23   42:aload           5
	//   24   44:aload           6
	//   25   46:invokevirtual   #116 <Method int Enum.ordinal()>
	//   26   49:aload_0         
	//   27   50:aload           6
	//   28   52:invokevirtual   #124 <Method String Enum.toString()>
	//   29   55:invokevirtual   #120 <Method SerializableString MapperConfig.compileString(String)>
	//   30   58:aastore         
			}

	//   31   59:iload_2         
	//   32   60:iconst_1        
	//   33   61:iadd            
	//   34   62:istore_2        
	//*  35   63:goto            31
			return new EnumValues(class1, aserializablestring);
	//   36   66:new             #2   <Class EnumValues>
	//   37   69:dup             
	//   38   70:aload_1         
	//   39   71:aload           5
	//   40   73:invokespecial   #122 <Method void EnumValues(Class, SerializableString[])>
	//   41   76:areturn         
		} else
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Can not determine enum constants for Class ").append(class1.getName()).toString());
	//   42   77:new             #72  <Class IllegalArgumentException>
	//   43   80:dup             
	//   44   81:new             #74  <Class StringBuilder>
	//   45   84:dup             
	//   46   85:invokespecial   #75  <Method void StringBuilder()>
	//   47   88:ldc1            #77  <String "Can not determine enum constants for Class ">
	//   48   90:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   49   93:aload_1         
	//   50   94:invokevirtual   #85  <Method String Class.getName()>
	//   51   97:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   52  100:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   53  103:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//   54  106:athrow          
		}
	}

	public List enums()
	{
		return Arrays.asList(((Object []) (_values)));
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Enum[] _values>
	//    2    4:invokestatic    #132 <Method List Arrays.asList(Object[])>
	//    3    7:areturn         
	}

	public Class getEnumClass()
	{
		return _enumClass;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Class _enumClass>
	//    2    4:areturn         
	}

	public EnumMap internalMap()
	{
		EnumMap enummap = _asMap;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field EnumMap _asMap>
	//    2    4:astore          4
		Object obj = ((Object) (enummap));
	//    3    6:aload           4
	//    4    8:astore_3        
		if(enummap == null)
	//*   5    9:aload           4
	//*   6   11:ifnonnull       80
		{
			obj = ((Object) (new LinkedHashMap()));
	//    7   14:new             #142 <Class LinkedHashMap>
	//    8   17:dup             
	//    9   18:invokespecial   #143 <Method void LinkedHashMap()>
	//   10   21:astore_3        
			Enum aenum[] = _values;
	//   11   22:aload_0         
	//   12   23:getfield        #37  <Field Enum[] _values>
	//   13   26:astore          4
			int j = aenum.length;
	//   14   28:aload           4
	//   15   30:arraylength     
	//   16   31:istore_2        
			for(int i = 0; i < j; i++)
	//*  17   32:iconst_0        
	//*  18   33:istore_1        
	//*  19   34:iload_1         
	//*  20   35:iload_2         
	//*  21   36:icmpge          71
			{
				Enum enum = aenum[i];
	//   22   39:aload           4
	//   23   41:iload_1         
	//   24   42:aaload          
	//   25   43:astore          5
				((Map) (obj)).put(((Object) (enum)), ((Object) (_textual[enum.ordinal()])));
	//   26   45:aload_3         
	//   27   46:aload           5
	//   28   48:aload_0         
	//   29   49:getfield        #39  <Field SerializableString[] _textual>
	//   30   52:aload           5
	//   31   54:invokevirtual   #116 <Method int Enum.ordinal()>
	//   32   57:aaload          
	//   33   58:invokeinterface #149 <Method Object Map.put(Object, Object)>
	//   34   63:pop             
			}

	//   35   64:iload_1         
	//   36   65:iconst_1        
	//   37   66:iadd            
	//   38   67:istore_1        
	//*  39   68:goto            34
			obj = ((Object) (new EnumMap(((Map) (obj)))));
	//   40   71:new             #151 <Class EnumMap>
	//   41   74:dup             
	//   42   75:aload_3         
	//   43   76:invokespecial   #154 <Method void EnumMap(Map)>
	//   44   79:astore_3        
		}
		return ((EnumMap) (obj));
	//   45   80:aload_3         
	//   46   81:areturn         
	}

	public SerializableString serializedValueFor(Enum enum)
	{
		return _textual[enum.ordinal()];
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field SerializableString[] _textual>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #116 <Method int Enum.ordinal()>
	//    4    8:aaload          
	//    5    9:areturn         
	}

	public Collection values()
	{
		return ((Collection) (Arrays.asList(((Object []) (_textual)))));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field SerializableString[] _textual>
	//    2    4:invokestatic    #132 <Method List Arrays.asList(Object[])>
	//    3    7:areturn         
	}

	private static final long serialVersionUID = 1L;
	private transient EnumMap _asMap;
	private final Class _enumClass;
	private final SerializableString _textual[];
	private final Enum _values[];
}
