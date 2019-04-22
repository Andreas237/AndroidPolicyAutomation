// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			TypeBindings

public abstract class TypeBase extends JavaType
	implements JsonSerializable
{

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
	//    6   10:invokespecial   #38  <Method void JavaType(Class, int, Object, Object, boolean)>
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
	//   15   25:putfield        #40  <Field TypeBindings _bindings>
		_superClass = javatype;
	//   16   28:aload_0         
	//   17   29:aload_3         
	//   18   30:putfield        #42  <Field JavaType _superClass>
		_superInterfaces = ajavatype;
	//   19   33:aload_0         
	//   20   34:aload           4
	//   21   36:putfield        #44  <Field JavaType[] _superInterfaces>
	//   22   39:return          
	}

	protected static StringBuilder _classSignature(Class class1, StringBuilder stringbuilder, boolean flag)
	{
		if(class1.isPrimitive())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #54  <Method boolean Class.isPrimitive()>
	//*   2    4:ifeq            187
		{
			if(class1 == Boolean.TYPE)
	//*   3    7:aload_0         
	//*   4    8:getstatic       #60  <Field Class Boolean.TYPE>
	//*   5   11:if_acmpne       23
			{
				stringbuilder.append('Z');
	//    6   14:aload_1         
	//    7   15:bipush          90
	//    8   17:invokevirtual   #66  <Method StringBuilder StringBuilder.append(char)>
	//    9   20:pop             
				return stringbuilder;
	//   10   21:aload_1         
	//   11   22:areturn         
			}
			if(class1 == Byte.TYPE)
	//*  12   23:aload_0         
	//*  13   24:getstatic       #69  <Field Class Byte.TYPE>
	//*  14   27:if_acmpne       39
			{
				stringbuilder.append('B');
	//   15   30:aload_1         
	//   16   31:bipush          66
	//   17   33:invokevirtual   #66  <Method StringBuilder StringBuilder.append(char)>
	//   18   36:pop             
				return stringbuilder;
	//   19   37:aload_1         
	//   20   38:areturn         
			}
			if(class1 == Short.TYPE)
	//*  21   39:aload_0         
	//*  22   40:getstatic       #72  <Field Class Short.TYPE>
	//*  23   43:if_acmpne       55
			{
				stringbuilder.append('S');
	//   24   46:aload_1         
	//   25   47:bipush          83
	//   26   49:invokevirtual   #66  <Method StringBuilder StringBuilder.append(char)>
	//   27   52:pop             
				return stringbuilder;
	//   28   53:aload_1         
	//   29   54:areturn         
			}
			if(class1 == Character.TYPE)
	//*  30   55:aload_0         
	//*  31   56:getstatic       #75  <Field Class Character.TYPE>
	//*  32   59:if_acmpne       71
			{
				stringbuilder.append('C');
	//   33   62:aload_1         
	//   34   63:bipush          67
	//   35   65:invokevirtual   #66  <Method StringBuilder StringBuilder.append(char)>
	//   36   68:pop             
				return stringbuilder;
	//   37   69:aload_1         
	//   38   70:areturn         
			}
			if(class1 == Integer.TYPE)
	//*  39   71:aload_0         
	//*  40   72:getstatic       #78  <Field Class Integer.TYPE>
	//*  41   75:if_acmpne       87
			{
				stringbuilder.append('I');
	//   42   78:aload_1         
	//   43   79:bipush          73
	//   44   81:invokevirtual   #66  <Method StringBuilder StringBuilder.append(char)>
	//   45   84:pop             
				return stringbuilder;
	//   46   85:aload_1         
	//   47   86:areturn         
			}
			if(class1 == Long.TYPE)
	//*  48   87:aload_0         
	//*  49   88:getstatic       #81  <Field Class Long.TYPE>
	//*  50   91:if_acmpne       103
			{
				stringbuilder.append('J');
	//   51   94:aload_1         
	//   52   95:bipush          74
	//   53   97:invokevirtual   #66  <Method StringBuilder StringBuilder.append(char)>
	//   54  100:pop             
				return stringbuilder;
	//   55  101:aload_1         
	//   56  102:areturn         
			}
			if(class1 == Float.TYPE)
	//*  57  103:aload_0         
	//*  58  104:getstatic       #84  <Field Class Float.TYPE>
	//*  59  107:if_acmpne       119
			{
				stringbuilder.append('F');
	//   60  110:aload_1         
	//   61  111:bipush          70
	//   62  113:invokevirtual   #66  <Method StringBuilder StringBuilder.append(char)>
	//   63  116:pop             
				return stringbuilder;
	//   64  117:aload_1         
	//   65  118:areturn         
			}
			if(class1 == Double.TYPE)
	//*  66  119:aload_0         
	//*  67  120:getstatic       #87  <Field Class Double.TYPE>
	//*  68  123:if_acmpne       135
			{
				stringbuilder.append('D');
	//   69  126:aload_1         
	//   70  127:bipush          68
	//   71  129:invokevirtual   #66  <Method StringBuilder StringBuilder.append(char)>
	//   72  132:pop             
				return stringbuilder;
	//   73  133:aload_1         
	//   74  134:areturn         
			}
			if(class1 == Void.TYPE)
	//*  75  135:aload_0         
	//*  76  136:getstatic       #90  <Field Class Void.TYPE>
	//*  77  139:if_acmpne       151
			{
				stringbuilder.append('V');
	//   78  142:aload_1         
	//   79  143:bipush          86
	//   80  145:invokevirtual   #66  <Method StringBuilder StringBuilder.append(char)>
	//   81  148:pop             
				return stringbuilder;
	//   82  149:aload_1         
	//   83  150:areturn         
			} else
			{
				stringbuilder = new StringBuilder();
	//   84  151:new             #62  <Class StringBuilder>
	//   85  154:dup             
	//   86  155:invokespecial   #92  <Method void StringBuilder()>
	//   87  158:astore_1        
				stringbuilder.append("Unrecognized primitive type: ");
	//   88  159:aload_1         
	//   89  160:ldc1            #94  <String "Unrecognized primitive type: ">
	//   90  162:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   91  165:pop             
				stringbuilder.append(class1.getName());
	//   92  166:aload_1         
	//   93  167:aload_0         
	//   94  168:invokevirtual   #101 <Method String Class.getName()>
	//   95  171:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   96  174:pop             
				throw new IllegalStateException(stringbuilder.toString());
	//   97  175:new             #103 <Class IllegalStateException>
	//   98  178:dup             
	//   99  179:aload_1         
	//  100  180:invokevirtual   #106 <Method String StringBuilder.toString()>
	//  101  183:invokespecial   #109 <Method void IllegalStateException(String)>
	//  102  186:athrow          
			}
		}
		stringbuilder.append('L');
	//  103  187:aload_1         
	//  104  188:bipush          76
	//  105  190:invokevirtual   #66  <Method StringBuilder StringBuilder.append(char)>
	//  106  193:pop             
		class1 = ((Class) (class1.getName()));
	//  107  194:aload_0         
	//  108  195:invokevirtual   #101 <Method String Class.getName()>
	//  109  198:astore_0        
		int i = 0;
	//  110  199:iconst_0        
	//  111  200:istore          5
		for(int j = ((String) (class1)).length(); i < j; i++)
	//* 112  202:aload_0         
	//* 113  203:invokevirtual   #115 <Method int String.length()>
	//* 114  206:istore          6
	//* 115  208:iload           5
	//* 116  210:iload           6
	//* 117  212:icmpge          251
		{
			char c1 = ((String) (class1)).charAt(i);
	//  118  215:aload_0         
	//  119  216:iload           5
	//  120  218:invokevirtual   #119 <Method char String.charAt(int)>
	//  121  221:istore          4
			char c = c1;
	//  122  223:iload           4
	//  123  225:istore_3        
			if(c1 == '.')
	//* 124  226:iload           4
	//* 125  228:bipush          46
	//* 126  230:icmpne          236
				c = '/';
	//  127  233:bipush          47
	//  128  235:istore_3        
			stringbuilder.append(c);
	//  129  236:aload_1         
	//  130  237:iload_3         
	//  131  238:invokevirtual   #66  <Method StringBuilder StringBuilder.append(char)>
	//  132  241:pop             
		}

	//  133  242:iload           5
	//  134  244:iconst_1        
	//  135  245:iadd            
	//  136  246:istore          5
	//* 137  248:goto            208
		if(flag)
	//* 138  251:iload_2         
	//* 139  252:ifeq            262
			stringbuilder.append(';');
	//  140  255:aload_1         
	//  141  256:bipush          59
	//  142  258:invokevirtual   #66  <Method StringBuilder StringBuilder.append(char)>
	//  143  261:pop             
		return stringbuilder;
	//  144  262:aload_1         
	//  145  263:areturn         
	}

	protected String buildCanonicalName()
	{
		return _class.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field Class _class>
	//    2    4:invokevirtual   #101 <Method String Class.getName()>
	//    3    7:areturn         
	}

	public JavaType containedType(int i)
	{
		return _bindings.getBoundType(i);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field TypeBindings _bindings>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #129 <Method JavaType TypeBindings.getBoundType(int)>
	//    4    8:areturn         
	}

	public int containedTypeCount()
	{
		return _bindings.size();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field TypeBindings _bindings>
	//    2    4:invokevirtual   #133 <Method int TypeBindings.size()>
	//    3    7:ireturn         
	}

	public final JavaType findSuperType(Class class1)
	{
		if(class1 == _class)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #124 <Field Class _class>
	//*   3    5:if_acmpne       10
			return ((JavaType) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		if(class1.isInterface())
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #138 <Method boolean Class.isInterface()>
	//*   8   14:ifeq            66
		{
			JavaType ajavatype[] = _superInterfaces;
	//    9   17:aload_0         
	//   10   18:getfield        #44  <Field JavaType[] _superInterfaces>
	//   11   21:astore          4
			if(ajavatype != null)
	//*  12   23:aload           4
	//*  13   25:ifnull          66
			{
				int i = 0;
	//   14   28:iconst_0        
	//   15   29:istore_2        
				for(int j = ajavatype.length; i < j; i++)
	//*  16   30:aload           4
	//*  17   32:arraylength     
	//*  18   33:istore_3        
	//*  19   34:iload_2         
	//*  20   35:iload_3         
	//*  21   36:icmpge          66
				{
					JavaType javatype = _superInterfaces[i].findSuperType(class1);
	//   22   39:aload_0         
	//   23   40:getfield        #44  <Field JavaType[] _superInterfaces>
	//   24   43:iload_2         
	//   25   44:aaload          
	//   26   45:aload_1         
	//   27   46:invokevirtual   #140 <Method JavaType JavaType.findSuperType(Class)>
	//   28   49:astore          4
					if(javatype != null)
	//*  29   51:aload           4
	//*  30   53:ifnull          59
						return javatype;
	//   31   56:aload           4
	//   32   58:areturn         
				}

	//   33   59:iload_2         
	//   34   60:iconst_1        
	//   35   61:iadd            
	//   36   62:istore_2        
			}
		}
	//*  37   63:goto            34
		JavaType javatype1 = _superClass;
	//   38   66:aload_0         
	//   39   67:getfield        #42  <Field JavaType _superClass>
	//   40   70:astore          4
		if(javatype1 != null)
	//*  41   72:aload           4
	//*  42   74:ifnull          90
		{
			class1 = ((Class) (javatype1.findSuperType(class1)));
	//   43   77:aload           4
	//   44   79:aload_1         
	//   45   80:invokevirtual   #140 <Method JavaType JavaType.findSuperType(Class)>
	//   46   83:astore_1        
			if(class1 != null)
	//*  47   84:aload_1         
	//*  48   85:ifnull          90
				return ((JavaType) (class1));
	//   49   88:aload_1         
	//   50   89:areturn         
		}
		return null;
	//   51   90:aconst_null     
	//   52   91:areturn         
	}

	public TypeBindings getBindings()
	{
		return _bindings;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field TypeBindings _bindings>
	//    2    4:areturn         
	}

	public List getInterfaces()
	{
		JavaType ajavatype[] = _superInterfaces;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field JavaType[] _superInterfaces>
	//    2    4:astore_1        
		if(ajavatype == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       13
			return Collections.emptyList();
	//    5    9:invokestatic    #149 <Method List Collections.emptyList()>
	//    6   12:areturn         
		switch(ajavatype.length)
	//*   7   13:aload_1         
	//*   8   14:arraylength     
		{
	//*   9   15:tableswitch     0 1: default 36
	//	               0 48
	//	               1 41
		default:
			return Arrays.asList(((Object []) (ajavatype)));
	//   10   36:aload_1         
	//   11   37:invokestatic    #155 <Method List Arrays.asList(Object[])>
	//   12   40:areturn         

		case 1: // '\001'
			return Collections.singletonList(((Object) (ajavatype[0])));
	//   13   41:aload_1         
	//   14   42:iconst_0        
	//   15   43:aaload          
	//   16   44:invokestatic    #159 <Method List Collections.singletonList(Object)>
	//   17   47:areturn         

		case 0: // '\0'
			return Collections.emptyList();
	//   18   48:invokestatic    #149 <Method List Collections.emptyList()>
	//   19   51:areturn         
		}
	}

	public JavaType getSuperClass()
	{
		return _superClass;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field JavaType _superClass>
	//    2    4:areturn         
	}

	public void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonProcessingException
	{
		jsongenerator.writeString(toCanonical());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #171 <Method String toCanonical()>
	//    3    5:invokevirtual   #176 <Method void JsonGenerator.writeString(String)>
	//    4    8:return          
	}

	public void serializeWithType(JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		WritableTypeId writabletypeid = new WritableTypeId(((Object) (this)), JsonToken.VALUE_STRING);
	//    0    0:new             #181 <Class WritableTypeId>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #187 <Field JsonToken JsonToken.VALUE_STRING>
	//    4    8:invokespecial   #190 <Method void WritableTypeId(Object, JsonToken)>
	//    5   11:astore          4
		typeserializer.writeTypePrefix(jsongenerator, writabletypeid);
	//    6   13:aload_3         
	//    7   14:aload_1         
	//    8   15:aload           4
	//    9   17:invokevirtual   #196 <Method WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, WritableTypeId)>
	//   10   20:pop             
		serialize(jsongenerator, serializerprovider);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #198 <Method void serialize(JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffix(jsongenerator, writabletypeid);
	//   15   27:aload_3         
	//   16   28:aload_1         
	//   17   29:aload           4
	//   18   31:invokevirtual   #201 <Method WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, WritableTypeId)>
	//   19   34:pop             
	//   20   35:return          
	}

	public String toCanonical()
	{
		String s1 = _canonicalName;
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field String _canonicalName>
	//    2    4:astore_2        
		String s = s1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(s1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       16
			s = buildCanonicalName();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #205 <Method String buildCanonicalName()>
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
