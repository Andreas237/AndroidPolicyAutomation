// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			TypeBindings, TypeFactory

public abstract class TypeBase extends JavaType
	implements JsonSerializable
{

	protected TypeBase(TypeBase typebase)
	{
		super(((JavaType) (typebase)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #38  <Method void JavaType(JavaType)>
		_superClass = typebase._superClass;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #40  <Field JavaType _superClass>
	//    6   10:putfield        #40  <Field JavaType _superClass>
		_superInterfaces = typebase._superInterfaces;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #42  <Field JavaType[] _superInterfaces>
	//   10   18:putfield        #42  <Field JavaType[] _superInterfaces>
		_bindings = typebase._bindings;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:getfield        #44  <Field TypeBindings _bindings>
	//   14   26:putfield        #44  <Field TypeBindings _bindings>
	//   15   29:return          
	}

	protected TypeBase(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[], int i, Object obj, Object obj1, 
			boolean flag)
	{
		super(class1, i, obj, obj1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload           5
	//    3    4:aload           6
	//    4    6:aload           7
	//    5    8:iload           8
	//    6   10:invokespecial   #48  <Method void JavaType(Class, int, Object, Object, boolean)>
		class1 = ((Class) (typebindings));
	//    7   13:aload_2         
	//    8   14:astore_1        
		if(typebindings == null)
	//*   9   15:aload_2         
	//*  10   16:ifnonnull       23
			class1 = ((Class) (NO_BINDINGS));
	//   11   19:getstatic       #30  <Field TypeBindings NO_BINDINGS>
	//   12   22:astore_1        
		_bindings = ((TypeBindings) (class1));
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:putfield        #44  <Field TypeBindings _bindings>
		_superClass = javatype;
	//   16   28:aload_0         
	//   17   29:aload_3         
	//   18   30:putfield        #40  <Field JavaType _superClass>
		_superInterfaces = ajavatype;
	//   19   33:aload_0         
	//   20   34:aload           4
	//   21   36:putfield        #42  <Field JavaType[] _superInterfaces>
	//   22   39:return          
	}

	protected static JavaType _bogusSuperClass(Class class1)
	{
		if(class1.getSuperclass() == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #58  <Method Class Class.getSuperclass()>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return TypeFactory.unknownType();
	//    5    9:invokestatic    #64  <Method JavaType TypeFactory.unknownType()>
	//    6   12:areturn         
	}

	protected static StringBuilder _classSignature(Class class1, StringBuilder stringbuilder, boolean flag)
	{
		if(!class1.isPrimitive()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method boolean Class.isPrimitive()>
	//    2    4:ifeq            181
_L1:
		if(class1 != Boolean.TYPE) goto _L4; else goto _L3
	//    3    7:aload_0         
	//    4    8:getstatic       #77  <Field Class Boolean.TYPE>
	//    5   11:if_acmpne       23
_L3:
		stringbuilder.append('Z');
	//    6   14:aload_1         
	//    7   15:bipush          90
	//    8   17:invokevirtual   #83  <Method StringBuilder StringBuilder.append(char)>
	//    9   20:pop             
_L6:
		return stringbuilder;
	//   10   21:aload_1         
	//   11   22:areturn         
_L4:
		if(class1 == Byte.TYPE)
	//*  12   23:aload_0         
	//*  13   24:getstatic       #86  <Field Class Byte.TYPE>
	//*  14   27:if_acmpne       39
		{
			stringbuilder.append('B');
	//   15   30:aload_1         
	//   16   31:bipush          66
	//   17   33:invokevirtual   #83  <Method StringBuilder StringBuilder.append(char)>
	//   18   36:pop             
			return stringbuilder;
	//   19   37:aload_1         
	//   20   38:areturn         
		}
		if(class1 == Short.TYPE)
	//*  21   39:aload_0         
	//*  22   40:getstatic       #89  <Field Class Short.TYPE>
	//*  23   43:if_acmpne       55
		{
			stringbuilder.append('S');
	//   24   46:aload_1         
	//   25   47:bipush          83
	//   26   49:invokevirtual   #83  <Method StringBuilder StringBuilder.append(char)>
	//   27   52:pop             
			return stringbuilder;
	//   28   53:aload_1         
	//   29   54:areturn         
		}
		if(class1 == Character.TYPE)
	//*  30   55:aload_0         
	//*  31   56:getstatic       #92  <Field Class Character.TYPE>
	//*  32   59:if_acmpne       71
		{
			stringbuilder.append('C');
	//   33   62:aload_1         
	//   34   63:bipush          67
	//   35   65:invokevirtual   #83  <Method StringBuilder StringBuilder.append(char)>
	//   36   68:pop             
			return stringbuilder;
	//   37   69:aload_1         
	//   38   70:areturn         
		}
		if(class1 == Integer.TYPE)
	//*  39   71:aload_0         
	//*  40   72:getstatic       #95  <Field Class Integer.TYPE>
	//*  41   75:if_acmpne       87
		{
			stringbuilder.append('I');
	//   42   78:aload_1         
	//   43   79:bipush          73
	//   44   81:invokevirtual   #83  <Method StringBuilder StringBuilder.append(char)>
	//   45   84:pop             
			return stringbuilder;
	//   46   85:aload_1         
	//   47   86:areturn         
		}
		if(class1 == Long.TYPE)
	//*  48   87:aload_0         
	//*  49   88:getstatic       #98  <Field Class Long.TYPE>
	//*  50   91:if_acmpne       103
		{
			stringbuilder.append('J');
	//   51   94:aload_1         
	//   52   95:bipush          74
	//   53   97:invokevirtual   #83  <Method StringBuilder StringBuilder.append(char)>
	//   54  100:pop             
			return stringbuilder;
	//   55  101:aload_1         
	//   56  102:areturn         
		}
		if(class1 == Float.TYPE)
	//*  57  103:aload_0         
	//*  58  104:getstatic       #101 <Field Class Float.TYPE>
	//*  59  107:if_acmpne       119
		{
			stringbuilder.append('F');
	//   60  110:aload_1         
	//   61  111:bipush          70
	//   62  113:invokevirtual   #83  <Method StringBuilder StringBuilder.append(char)>
	//   63  116:pop             
			return stringbuilder;
	//   64  117:aload_1         
	//   65  118:areturn         
		}
		if(class1 == Double.TYPE)
	//*  66  119:aload_0         
	//*  67  120:getstatic       #104 <Field Class Double.TYPE>
	//*  68  123:if_acmpne       135
		{
			stringbuilder.append('D');
	//   69  126:aload_1         
	//   70  127:bipush          68
	//   71  129:invokevirtual   #83  <Method StringBuilder StringBuilder.append(char)>
	//   72  132:pop             
			return stringbuilder;
	//   73  133:aload_1         
	//   74  134:areturn         
		}
		if(class1 == Void.TYPE)
	//*  75  135:aload_0         
	//*  76  136:getstatic       #107 <Field Class Void.TYPE>
	//*  77  139:if_acmpne       151
		{
			stringbuilder.append('V');
	//   78  142:aload_1         
	//   79  143:bipush          86
	//   80  145:invokevirtual   #83  <Method StringBuilder StringBuilder.append(char)>
	//   81  148:pop             
			return stringbuilder;
	//   82  149:aload_1         
	//   83  150:areturn         
		} else
		{
			throw new IllegalStateException((new StringBuilder()).append("Unrecognized primitive type: ").append(class1.getName()).toString());
	//   84  151:new             #109 <Class IllegalStateException>
	//   85  154:dup             
	//   86  155:new             #79  <Class StringBuilder>
	//   87  158:dup             
	//   88  159:invokespecial   #111 <Method void StringBuilder()>
	//   89  162:ldc1            #113 <String "Unrecognized primitive type: ">
	//   90  164:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   91  167:aload_0         
	//   92  168:invokevirtual   #120 <Method String Class.getName()>
	//   93  171:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   94  174:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   95  177:invokespecial   #126 <Method void IllegalStateException(String)>
	//   96  180:athrow          
		}
_L2:
		stringbuilder.append('L');
	//   97  181:aload_1         
	//   98  182:bipush          76
	//   99  184:invokevirtual   #83  <Method StringBuilder StringBuilder.append(char)>
	//  100  187:pop             
		class1 = ((Class) (class1.getName()));
	//  101  188:aload_0         
	//  102  189:invokevirtual   #120 <Method String Class.getName()>
	//  103  192:astore_0        
		int i = 0;
	//  104  193:iconst_0        
	//  105  194:istore          5
		for(int j = ((String) (class1)).length(); i < j; i++)
	//* 106  196:aload_0         
	//* 107  197:invokevirtual   #132 <Method int String.length()>
	//* 108  200:istore          6
	//* 109  202:iload           5
	//* 110  204:iload           6
	//* 111  206:icmpge          245
		{
			char c1 = ((String) (class1)).charAt(i);
	//  112  209:aload_0         
	//  113  210:iload           5
	//  114  212:invokevirtual   #136 <Method char String.charAt(int)>
	//  115  215:istore          4
			char c = c1;
	//  116  217:iload           4
	//  117  219:istore_3        
			if(c1 == '.')
	//* 118  220:iload           4
	//* 119  222:bipush          46
	//* 120  224:icmpne          230
				c = '/';
	//  121  227:bipush          47
	//  122  229:istore_3        
			stringbuilder.append(c);
	//  123  230:aload_1         
	//  124  231:iload_3         
	//  125  232:invokevirtual   #83  <Method StringBuilder StringBuilder.append(char)>
	//  126  235:pop             
		}

	//  127  236:iload           5
	//  128  238:iconst_1        
	//  129  239:iadd            
	//  130  240:istore          5
	//* 131  242:goto            202
		if(flag)
	//* 132  245:iload_2         
	//* 133  246:ifeq            21
		{
			stringbuilder.append(';');
	//  134  249:aload_1         
	//  135  250:bipush          59
	//  136  252:invokevirtual   #83  <Method StringBuilder StringBuilder.append(char)>
	//  137  255:pop             
			return stringbuilder;
	//  138  256:aload_1         
	//  139  257:areturn         
		}
		if(true) goto _L6; else goto _L5
_L5:
	}

	protected String buildCanonicalName()
	{
		return _class.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field Class _class>
	//    2    4:invokevirtual   #120 <Method String Class.getName()>
	//    3    7:areturn         
	}

	public volatile ResolvedType containedType(int i)
	{
		return ((ResolvedType) (containedType(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #146 <Method JavaType containedType(int)>
	//    3    5:areturn         
	}

	public JavaType containedType(int i)
	{
		return _bindings.getBoundType(i);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field TypeBindings _bindings>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #149 <Method JavaType TypeBindings.getBoundType(int)>
	//    4    8:areturn         
	}

	public int containedTypeCount()
	{
		return _bindings.size();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field TypeBindings _bindings>
	//    2    4:invokevirtual   #153 <Method int TypeBindings.size()>
	//    3    7:ireturn         
	}

	public String containedTypeName(int i)
	{
		return _bindings.getBoundName(i);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field TypeBindings _bindings>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #159 <Method String TypeBindings.getBoundName(int)>
	//    4    8:areturn         
	}

	public final JavaType findSuperType(Class class1)
	{
		if(class1 != _class) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #141 <Field Class _class>
	//    3    5:if_acmpne       14
_L1:
		Object obj = ((Object) (this));
	//    4    8:aload_0         
	//    5    9:astore          4
_L4:
		return ((JavaType) (obj));
	//    6   11:aload           4
	//    7   13:areturn         
_L2:
		int i;
		int j;
		if(!class1.isInterface() || _superInterfaces == null)
			break MISSING_BLOCK_LABEL_69;
	//    8   14:aload_1         
	//    9   15:invokevirtual   #164 <Method boolean Class.isInterface()>
	//   10   18:ifeq            69
	//   11   21:aload_0         
	//   12   22:getfield        #42  <Field JavaType[] _superInterfaces>
	//   13   25:ifnull          69
		i = 0;
	//   14   28:iconst_0        
	//   15   29:istore_2        
		j = _superInterfaces.length;
	//   16   30:aload_0         
	//   17   31:getfield        #42  <Field JavaType[] _superInterfaces>
	//   18   34:arraylength     
	//   19   35:istore_3        
_L5:
		JavaType javatype;
		if(i >= j)
			break MISSING_BLOCK_LABEL_69;
	//   20   36:iload_2         
	//   21   37:iload_3         
	//   22   38:icmpge          69
		javatype = _superInterfaces[i].findSuperType(class1);
	//   23   41:aload_0         
	//   24   42:getfield        #42  <Field JavaType[] _superInterfaces>
	//   25   45:iload_2         
	//   26   46:aaload          
	//   27   47:aload_1         
	//   28   48:invokevirtual   #166 <Method JavaType JavaType.findSuperType(Class)>
	//   29   51:astore          5
		obj = ((Object) (javatype));
	//   30   53:aload           5
	//   31   55:astore          4
		if(javatype != null) goto _L4; else goto _L3
	//   32   57:aload           5
	//   33   59:ifnonnull       11
_L3:
		i++;
	//   34   62:iload_2         
	//   35   63:iconst_1        
	//   36   64:iadd            
	//   37   65:istore_2        
		  goto _L5
	//*  38   66:goto            36
		if(_superClass == null)
			break; /* Loop/switch isn't completed */
	//   39   69:aload_0         
	//   40   70:getfield        #40  <Field JavaType _superClass>
	//   41   73:ifnull          92
		class1 = ((Class) (_superClass.findSuperType(class1)));
	//   42   76:aload_0         
	//   43   77:getfield        #40  <Field JavaType _superClass>
	//   44   80:aload_1         
	//   45   81:invokevirtual   #166 <Method JavaType JavaType.findSuperType(Class)>
	//   46   84:astore_1        
		obj = ((Object) (class1));
	//   47   85:aload_1         
	//   48   86:astore          4
		if(class1 != null) goto _L4; else goto _L6
	//   49   88:aload_1         
	//   50   89:ifnonnull       11
_L6:
		return null;
	//   51   92:aconst_null     
	//   52   93:areturn         
	}

	public JavaType[] findTypeParameters(Class class1)
	{
		class1 = ((Class) (findSuperType(class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #169 <Method JavaType findSuperType(Class)>
	//    3    5:astore_1        
		if(class1 == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       14
			return NO_TYPES;
	//    6   10:getstatic       #32  <Field JavaType[] NO_TYPES>
	//    7   13:areturn         
		else
			return ((JavaType) (class1)).getBindings().typeParameterArray();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #172 <Method TypeBindings JavaType.getBindings()>
	//   10   18:invokevirtual   #176 <Method JavaType[] TypeBindings.typeParameterArray()>
	//   11   21:areturn         
	}

	public TypeBindings getBindings()
	{
		return _bindings;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field TypeBindings _bindings>
	//    2    4:areturn         
	}

	public abstract StringBuilder getErasedSignature(StringBuilder stringbuilder);

	public abstract StringBuilder getGenericSignature(StringBuilder stringbuilder);

	public List getInterfaces()
	{
		if(_superInterfaces == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field JavaType[] _superInterfaces>
	//*   2    4:ifnonnull       11
			return Collections.emptyList();
	//    3    7:invokestatic    #187 <Method List Collections.emptyList()>
	//    4   10:areturn         
		switch(_superInterfaces.length)
	//*   5   11:aload_0         
	//*   6   12:getfield        #42  <Field JavaType[] _superInterfaces>
	//*   7   15:arraylength     
		{
	//*   8   16:tableswitch     0 1: default 40
	//	               0 48
	//	               1 52
		default:
			return Arrays.asList(((Object []) (_superInterfaces)));
	//    9   40:aload_0         
	//   10   41:getfield        #42  <Field JavaType[] _superInterfaces>
	//   11   44:invokestatic    #193 <Method List Arrays.asList(Object[])>
	//   12   47:areturn         

		case 0: // '\0'
			return Collections.emptyList();
	//   13   48:invokestatic    #187 <Method List Collections.emptyList()>
	//   14   51:areturn         

		case 1: // '\001'
			return Collections.singletonList(((Object) (_superInterfaces[0])));
	//   15   52:aload_0         
	//   16   53:getfield        #42  <Field JavaType[] _superInterfaces>
	//   17   56:iconst_0        
	//   18   57:aaload          
	//   19   58:invokestatic    #197 <Method List Collections.singletonList(Object)>
	//   20   61:areturn         
		}
	}

	public JavaType getSuperClass()
	{
		return _superClass;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field JavaType _superClass>
	//    2    4:areturn         
	}

	public Object getTypeHandler()
	{
		return _typeHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #205 <Field Object _typeHandler>
	//    2    4:areturn         
	}

	public Object getValueHandler()
	{
		return _valueHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #210 <Field Object _valueHandler>
	//    2    4:areturn         
	}

	public void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonProcessingException
	{
		jsongenerator.writeString(toCanonical());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #219 <Method String toCanonical()>
	//    3    5:invokevirtual   #224 <Method void JsonGenerator.writeString(String)>
	//    4    8:return          
	}

	public void serializeWithType(JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException, JsonProcessingException
	{
		typeserializer.writeTypePrefixForScalar(((Object) (this)), jsongenerator);
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #233 <Method void TypeSerializer.writeTypePrefixForScalar(Object, JsonGenerator)>
		serialize(jsongenerator, serializerprovider);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokevirtual   #235 <Method void serialize(JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffixForScalar(((Object) (this)), jsongenerator);
	//    8   12:aload_3         
	//    9   13:aload_0         
	//   10   14:aload_1         
	//   11   15:invokevirtual   #238 <Method void TypeSerializer.writeTypeSuffixForScalar(Object, JsonGenerator)>
	//   12   18:return          
	}

	public String toCanonical()
	{
		String s1 = _canonicalName;
	//    0    0:aload_0         
	//    1    1:getfield        #240 <Field String _canonicalName>
	//    2    4:astore_2        
		String s = s1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(s1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       16
			s = buildCanonicalName();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #242 <Method String buildCanonicalName()>
	//    9   15:astore_1        
		return s;
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	private static final TypeBindings NO_BINDINGS = TypeBindings.emptyBindings();
	private static final JavaType NO_TYPES[] = new JavaType[0];
	private static final long serialVersionUID = 1L;
	protected final TypeBindings _bindings;
	volatile transient String _canonicalName;
	protected final JavaType _superClass;
	protected final JavaType _superInterfaces[];

	static 
	{
	//    0    0:invokestatic    #28  <Method TypeBindings TypeBindings.emptyBindings()>
	//    1    3:putstatic       #30  <Field TypeBindings NO_BINDINGS>
	//    2    6:iconst_0        
	//    3    7:anewarray       JavaType[]
	//    4   10:putstatic       #32  <Field JavaType[] NO_TYPES>
	//*   5   13:return          
	}
}
