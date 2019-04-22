// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
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
	//    1    1:invokespecial   #23  <Method void Object()>
		_enumClass = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field Class _enumClass>
		_values = (Enum[])class1.getEnumConstants();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #31  <Method Object[] Class.getEnumConstants()>
	//    8   14:checkcast       #32  <Class Enum[]>
	//    9   17:putfield        #34  <Field Enum[] _values>
		_textual = aserializablestring;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #36  <Field SerializableString[] _textual>
	//   13   25:return          
	}

	public static EnumValues constructFromName(MapperConfig mapperconfig, Class class1)
	{
		Class class2 = ClassUtil.findEnumType(class1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #47  <Method Class ClassUtil.findEnumType(Class)>
	//    2    4:astore          4
		Enum aenum[] = (Enum[])class2.getEnumConstants();
	//    3    6:aload           4
	//    4    8:invokevirtual   #31  <Method Object[] Class.getEnumConstants()>
	//    5   11:checkcast       #32  <Class Enum[]>
	//    6   14:astore          6
		if(aenum != null)
	//*   7   16:aload           6
	//*   8   18:ifnull          119
		{
			String as[] = mapperconfig.getAnnotationIntrospector().findEnumValues(class2, aenum, new String[aenum.length]);
	//    9   21:aload_0         
	//   10   22:invokevirtual   #53  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//   11   25:aload           4
	//   12   27:aload           6
	//   13   29:aload           6
	//   14   31:arraylength     
	//   15   32:anewarray       String[]
	//   16   35:invokevirtual   #61  <Method String[] AnnotationIntrospector.findEnumValues(Class, Enum[], String[])>
	//   17   38:astore          7
			SerializableString aserializablestring[] = new SerializableString[aenum.length];
	//   18   40:aload           6
	//   19   42:arraylength     
	//   20   43:anewarray       SerializableString[]
	//   21   46:astore          8
			int i = 0;
	//   22   48:iconst_0        
	//   23   49:istore_2        
			for(int j = aenum.length; i < j; i++)
	//*  24   50:aload           6
	//*  25   52:arraylength     
	//*  26   53:istore_3        
	//*  27   54:iload_2         
	//*  28   55:iload_3         
	//*  29   56:icmpge          108
			{
				Enum enum = aenum[i];
	//   30   59:aload           6
	//   31   61:iload_2         
	//   32   62:aaload          
	//   33   63:astore          9
				String s1 = as[i];
	//   34   65:aload           7
	//   35   67:iload_2         
	//   36   68:aaload          
	//   37   69:astore          5
				String s = s1;
	//   38   71:aload           5
	//   39   73:astore          4
				if(s1 == null)
	//*  40   75:aload           5
	//*  41   77:ifnonnull       87
					s = enum.name();
	//   42   80:aload           9
	//   43   82:invokevirtual   #69  <Method String Enum.name()>
	//   44   85:astore          4
				aserializablestring[enum.ordinal()] = mapperconfig.compileString(s);
	//   45   87:aload           8
	//   46   89:aload           9
	//   47   91:invokevirtual   #73  <Method int Enum.ordinal()>
	//   48   94:aload_0         
	//   49   95:aload           4
	//   50   97:invokevirtual   #77  <Method SerializableString MapperConfig.compileString(String)>
	//   51  100:aastore         
			}

	//   52  101:iload_2         
	//   53  102:iconst_1        
	//   54  103:iadd            
	//   55  104:istore_2        
	//*  56  105:goto            54
			return new EnumValues(class1, aserializablestring);
	//   57  108:new             #2   <Class EnumValues>
	//   58  111:dup             
	//   59  112:aload_1         
	//   60  113:aload           8
	//   61  115:invokespecial   #79  <Method void EnumValues(Class, SerializableString[])>
	//   62  118:areturn         
		} else
		{
			mapperconfig = ((MapperConfig) (new StringBuilder()));
	//   63  119:new             #81  <Class StringBuilder>
	//   64  122:dup             
	//   65  123:invokespecial   #82  <Method void StringBuilder()>
	//   66  126:astore_0        
			((StringBuilder) (mapperconfig)).append("Cannot determine enum constants for Class ");
	//   67  127:aload_0         
	//   68  128:ldc1            #84  <String "Cannot determine enum constants for Class ">
	//   69  130:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   70  133:pop             
			((StringBuilder) (mapperconfig)).append(class1.getName());
	//   71  134:aload_0         
	//   72  135:aload_1         
	//   73  136:invokevirtual   #91  <Method String Class.getName()>
	//   74  139:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   75  142:pop             
			throw new IllegalArgumentException(((StringBuilder) (mapperconfig)).toString());
	//   76  143:new             #93  <Class IllegalArgumentException>
	//   77  146:dup             
	//   78  147:aload_0         
	//   79  148:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   80  151:invokespecial   #99  <Method void IllegalArgumentException(String)>
	//   81  154:athrow          
		}
	}

	public List enums()
	{
		return Arrays.asList(((Object []) (_values)));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Enum[] _values>
	//    2    4:invokestatic    #108 <Method List Arrays.asList(Object[])>
	//    3    7:areturn         
	}

	public Class getEnumClass()
	{
		return _enumClass;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Class _enumClass>
	//    2    4:areturn         
	}

	public SerializableString serializedValueFor(Enum enum)
	{
		return _textual[enum.ordinal()];
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field SerializableString[] _textual>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #73  <Method int Enum.ordinal()>
	//    4    8:aaload          
	//    5    9:areturn         
	}

	public Collection values()
	{
		return ((Collection) (Arrays.asList(((Object []) (_textual)))));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field SerializableString[] _textual>
	//    2    4:invokestatic    #108 <Method List Arrays.asList(Object[])>
	//    3    7:areturn         
	}

	private static final long serialVersionUID = 1L;
	private final Class _enumClass;
	private final SerializableString _textual[];
	private final Enum _values[];
}
