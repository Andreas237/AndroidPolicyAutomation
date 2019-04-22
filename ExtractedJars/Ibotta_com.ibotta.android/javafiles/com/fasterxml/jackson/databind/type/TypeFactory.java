// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.*;
import java.io.Serializable;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			TypeBindings, SimpleType, TypeParser, PlaceholderForType, 
//			CollectionType, MapType, ReferenceType, TypeModifier, 
//			ArrayType, ClassStack, ResolvedRecursiveType

public final class TypeFactory
	implements Serializable
{

	private TypeFactory()
	{
		this(((LRUMap) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #123 <Method void TypeFactory(LRUMap)>
	//    3    5:return          
	}

	protected TypeFactory(LRUMap lrumap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #124 <Method void Object()>
		LRUMap lrumap1 = lrumap;
	//    2    4:aload_1         
	//    3    5:astore_2        
		if(lrumap == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       23
			lrumap1 = new LRUMap(16, 200);
	//    6   10:new             #126 <Class LRUMap>
	//    7   13:dup             
	//    8   14:bipush          16
	//    9   16:sipush          200
	//   10   19:invokespecial   #129 <Method void LRUMap(int, int)>
	//   11   22:astore_2        
		_typeCache = lrumap1;
	//   12   23:aload_0         
	//   13   24:aload_2         
	//   14   25:putfield        #131 <Field LRUMap _typeCache>
		_parser = new TypeParser(this);
	//   15   28:aload_0         
	//   16   29:new             #133 <Class TypeParser>
	//   17   32:dup             
	//   18   33:aload_0         
	//   19   34:invokespecial   #136 <Method void TypeParser(TypeFactory)>
	//   20   37:putfield        #138 <Field TypeParser _parser>
		_modifiers = null;
	//   21   40:aload_0         
	//   22   41:aconst_null     
	//   23   42:putfield        #140 <Field TypeModifier[] _modifiers>
		_classLoader = null;
	//   24   45:aload_0         
	//   25   46:aconst_null     
	//   26   47:putfield        #142 <Field ClassLoader _classLoader>
	//   27   50:return          
	}

	protected TypeFactory(LRUMap lrumap, TypeParser typeparser, TypeModifier atypemodifier[], ClassLoader classloader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #124 <Method void Object()>
		LRUMap lrumap1 = lrumap;
	//    2    4:aload_1         
	//    3    5:astore          5
		if(lrumap == null)
	//*   4    7:aload_1         
	//*   5    8:ifnonnull       25
			lrumap1 = new LRUMap(16, 200);
	//    6   11:new             #126 <Class LRUMap>
	//    7   14:dup             
	//    8   15:bipush          16
	//    9   17:sipush          200
	//   10   20:invokespecial   #129 <Method void LRUMap(int, int)>
	//   11   23:astore          5
		_typeCache = lrumap1;
	//   12   25:aload_0         
	//   13   26:aload           5
	//   14   28:putfield        #131 <Field LRUMap _typeCache>
		_parser = typeparser.withFactory(this);
	//   15   31:aload_0         
	//   16   32:aload_2         
	//   17   33:aload_0         
	//   18   34:invokevirtual   #149 <Method TypeParser TypeParser.withFactory(TypeFactory)>
	//   19   37:putfield        #138 <Field TypeParser _parser>
		_modifiers = atypemodifier;
	//   20   40:aload_0         
	//   21   41:aload_3         
	//   22   42:putfield        #140 <Field TypeModifier[] _modifiers>
		_classLoader = classloader;
	//   23   45:aload_0         
	//   24   46:aload           4
	//   25   48:putfield        #142 <Field ClassLoader _classLoader>
	//   26   51:return          
	}

	private TypeBindings _bindingsForSubtype(JavaType javatype, int i, Class class1)
	{
		PlaceholderForType aplaceholderfortype[] = new PlaceholderForType[i];
	//    0    0:iload_2         
	//    1    1:anewarray       PlaceholderForType[]
	//    2    4:astore          7
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
		for(int j = 0; j < i; j++)
	//*   5    9:iconst_0        
	//*   6   10:istore          4
	//*   7   12:iload           4
	//*   8   14:iload_2         
	//*   9   15:icmpge          41
			aplaceholderfortype[j] = new PlaceholderForType(j);
	//   10   18:aload           7
	//   11   20:iload           4
	//   12   22:new             #154 <Class PlaceholderForType>
	//   13   25:dup             
	//   14   26:iload           4
	//   15   28:invokespecial   #157 <Method void PlaceholderForType(int)>
	//   16   31:aastore         

	//   17   32:iload           4
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:istore          4
	//*  21   38:goto            12
		Object obj = ((Object) (_fromClass(((ClassStack) (null)), class1, TypeBindings.create(class1, ((JavaType []) (aplaceholderfortype)))).findSuperType(javatype.getRawClass())));
	//   22   41:aload_0         
	//   23   42:aconst_null     
	//   24   43:aload_3         
	//   25   44:aload_3         
	//   26   45:aload           7
	//   27   47:invokestatic    #161 <Method TypeBindings TypeBindings.create(Class, JavaType[])>
	//   28   50:invokevirtual   #165 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//   29   53:aload_1         
	//   30   54:invokevirtual   #169 <Method Class JavaType.getRawClass()>
	//   31   57:invokevirtual   #173 <Method JavaType JavaType.findSuperType(Class)>
	//   32   60:astore          6
		if(obj != null)
	//*  33   62:aload           6
	//*  34   64:ifnull          215
		{
			obj = ((Object) (_resolveTypePlaceholders(javatype, ((JavaType) (obj)))));
	//   35   67:aload_0         
	//   36   68:aload_1         
	//   37   69:aload           6
	//   38   71:invokespecial   #177 <Method String _resolveTypePlaceholders(JavaType, JavaType)>
	//   39   74:astore          6
			if(obj == null)
	//*  40   76:aload           6
	//*  41   78:ifnonnull       141
			{
				JavaType ajavatype[] = new JavaType[i];
	//   42   81:iload_2         
	//   43   82:anewarray       JavaType[]
	//   44   85:astore          8
				for(int k = ((int) (flag)); k < i; k++)
	//*  45   87:iload           5
	//*  46   89:istore          4
	//*  47   91:iload           4
	//*  48   93:iload_2         
	//*  49   94:icmpge          134
				{
					obj = ((Object) (aplaceholderfortype[k].actualType()));
	//   50   97:aload           7
	//   51   99:iload           4
	//   52  101:aaload          
	//   53  102:invokevirtual   #181 <Method JavaType PlaceholderForType.actualType()>
	//   54  105:astore          6
					javatype = ((JavaType) (obj));
	//   55  107:aload           6
	//   56  109:astore_1        
					if(obj == null)
	//*  57  110:aload           6
	//*  58  112:ifnonnull       119
						javatype = unknownType();
	//   59  115:invokestatic    #184 <Method JavaType unknownType()>
	//   60  118:astore_1        
					ajavatype[k] = javatype;
	//   61  119:aload           8
	//   62  121:iload           4
	//   63  123:aload_1         
	//   64  124:aastore         
				}

	//   65  125:iload           4
	//   66  127:iconst_1        
	//   67  128:iadd            
	//   68  129:istore          4
	//*  69  131:goto            91
				return TypeBindings.create(class1, ajavatype);
	//   70  134:aload_3         
	//   71  135:aload           8
	//   72  137:invokestatic    #161 <Method TypeBindings TypeBindings.create(Class, JavaType[])>
	//   73  140:areturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   74  141:new             #186 <Class StringBuilder>
	//   75  144:dup             
	//   76  145:invokespecial   #187 <Method void StringBuilder()>
	//   77  148:astore          7
				stringbuilder.append("Failed to specialize base type ");
	//   78  150:aload           7
	//   79  152:ldc1            #189 <String "Failed to specialize base type ">
	//   80  154:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   81  157:pop             
				stringbuilder.append(javatype.toCanonical());
	//   82  158:aload           7
	//   83  160:aload_1         
	//   84  161:invokevirtual   #197 <Method String JavaType.toCanonical()>
	//   85  164:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   86  167:pop             
				stringbuilder.append(" as ");
	//   87  168:aload           7
	//   88  170:ldc1            #199 <String " as ">
	//   89  172:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   90  175:pop             
				stringbuilder.append(class1.getName());
	//   91  176:aload           7
	//   92  178:aload_3         
	//   93  179:invokevirtual   #202 <Method String Class.getName()>
	//   94  182:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   95  185:pop             
				stringbuilder.append(", problem: ");
	//   96  186:aload           7
	//   97  188:ldc1            #204 <String ", problem: ">
	//   98  190:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   99  193:pop             
				stringbuilder.append(((String) (obj)));
	//  100  194:aload           7
	//  101  196:aload           6
	//  102  198:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//  103  201:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//  104  202:new             #206 <Class IllegalArgumentException>
	//  105  205:dup             
	//  106  206:aload           7
	//  107  208:invokevirtual   #209 <Method String StringBuilder.toString()>
	//  108  211:invokespecial   #212 <Method void IllegalArgumentException(String)>
	//  109  214:athrow          
			}
		} else
		{
			throw new IllegalArgumentException(String.format("Internal error: unable to locate supertype (%s) from resolved subtype %s", new Object[] {
				javatype.getRawClass().getName(), class1.getName()
			}));
	//  110  215:new             #206 <Class IllegalArgumentException>
	//  111  218:dup             
	//  112  219:ldc1            #214 <String "Internal error: unable to locate supertype (%s) from resolved subtype %s">
	//  113  221:iconst_2        
	//  114  222:anewarray       Object[]
	//  115  225:dup             
	//  116  226:iconst_0        
	//  117  227:aload_1         
	//  118  228:invokevirtual   #169 <Method Class JavaType.getRawClass()>
	//  119  231:invokevirtual   #202 <Method String Class.getName()>
	//  120  234:aastore         
	//  121  235:dup             
	//  122  236:iconst_1        
	//  123  237:aload_3         
	//  124  238:invokevirtual   #202 <Method String Class.getName()>
	//  125  241:aastore         
	//  126  242:invokestatic    #218 <Method String String.format(String, Object[])>
	//  127  245:invokespecial   #212 <Method void IllegalArgumentException(String)>
	//  128  248:athrow          
		}
	}

	private JavaType _collectionType(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
label0:
		{
			Object obj = ((Object) (typebindings.getTypeParameters()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #225 <Method List TypeBindings.getTypeParameters()>
	//    2    4:astore          5
			if(((List) (obj)).isEmpty())
	//*   3    6:aload           5
	//*   4    8:invokeinterface #231 <Method boolean List.isEmpty()>
	//*   5   13:ifeq            25
			{
				obj = ((Object) (_unknownType()));
	//    6   16:aload_0         
	//    7   17:invokevirtual   #234 <Method JavaType _unknownType()>
	//    8   20:astore          5
			} else
	//*   9   22:goto            49
			{
				if(((List) (obj)).size() != 1)
					break label0;
	//   10   25:aload           5
	//   11   27:invokeinterface #238 <Method int List.size()>
	//   12   32:iconst_1        
	//   13   33:icmpne          60
				obj = ((Object) ((JavaType)((List) (obj)).get(0)));
	//   14   36:aload           5
	//   15   38:iconst_0        
	//   16   39:invokeinterface #242 <Method Object List.get(int)>
	//   17   44:checkcast       #48  <Class JavaType>
	//   18   47:astore          5
			}
			return ((JavaType) (CollectionType.construct(class1, typebindings, javatype, ajavatype, ((JavaType) (obj)))));
	//   19   49:aload_1         
	//   20   50:aload_2         
	//   21   51:aload_3         
	//   22   52:aload           4
	//   23   54:aload           5
	//   24   56:invokestatic    #248 <Method CollectionType CollectionType.construct(Class, TypeBindings, JavaType, JavaType[], JavaType)>
	//   25   59:areturn         
		}
		typebindings = ((TypeBindings) (new StringBuilder()));
	//   26   60:new             #186 <Class StringBuilder>
	//   27   63:dup             
	//   28   64:invokespecial   #187 <Method void StringBuilder()>
	//   29   67:astore_2        
		((StringBuilder) (typebindings)).append("Strange Collection type ");
	//   30   68:aload_2         
	//   31   69:ldc1            #250 <String "Strange Collection type ">
	//   32   71:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   33   74:pop             
		((StringBuilder) (typebindings)).append(class1.getName());
	//   34   75:aload_2         
	//   35   76:aload_1         
	//   36   77:invokevirtual   #202 <Method String Class.getName()>
	//   37   80:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   38   83:pop             
		((StringBuilder) (typebindings)).append(": cannot determine type parameters");
	//   39   84:aload_2         
	//   40   85:ldc1            #252 <String ": cannot determine type parameters">
	//   41   87:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   42   90:pop             
		throw new IllegalArgumentException(((StringBuilder) (typebindings)).toString());
	//   43   91:new             #206 <Class IllegalArgumentException>
	//   44   94:dup             
	//   45   95:aload_2         
	//   46   96:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   47   99:invokespecial   #212 <Method void IllegalArgumentException(String)>
	//   48  102:athrow          
	}

	private JavaType _mapType(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
		Object obj;
		Object obj1;
		if(class1 == java/util/Properties)
	//*   0    0:aload_1         
	//*   1    1:ldc2            #256 <Class Properties>
	//*   2    4:if_acmpne       19
		{
			obj = ((Object) (CORE_TYPE_STRING));
	//    3    7:getstatic       #111 <Field SimpleType CORE_TYPE_STRING>
	//    4   10:astore          6
			obj1 = obj;
	//    5   12:aload           6
	//    6   14:astore          7
		} else
	//*   7   16:goto            128
		{
			obj1 = ((Object) (typebindings.getTypeParameters()));
	//    8   19:aload_2         
	//    9   20:invokevirtual   #225 <Method List TypeBindings.getTypeParameters()>
	//   10   23:astore          7
			int i = ((List) (obj1)).size();
	//   11   25:aload           7
	//   12   27:invokeinterface #238 <Method int List.size()>
	//   13   32:istore          5
			if(i != 0)
	//*  14   34:iload           5
	//*  15   36:ifeq            118
			{
				if(i == 2)
	//*  16   39:iload           5
	//*  17   41:iconst_2        
	//*  18   42:icmpne          74
				{
					obj = ((Object) ((JavaType)((List) (obj1)).get(0)));
	//   19   45:aload           7
	//   20   47:iconst_0        
	//   21   48:invokeinterface #242 <Method Object List.get(int)>
	//   22   53:checkcast       #48  <Class JavaType>
	//   23   56:astore          6
					obj1 = ((Object) ((JavaType)((List) (obj1)).get(1)));
	//   24   58:aload           7
	//   25   60:iconst_1        
	//   26   61:invokeinterface #242 <Method Object List.get(int)>
	//   27   66:checkcast       #48  <Class JavaType>
	//   28   69:astore          7
				} else
	//*  29   71:goto            128
				{
					typebindings = ((TypeBindings) (new StringBuilder()));
	//   30   74:new             #186 <Class StringBuilder>
	//   31   77:dup             
	//   32   78:invokespecial   #187 <Method void StringBuilder()>
	//   33   81:astore_2        
					((StringBuilder) (typebindings)).append("Strange Map type ");
	//   34   82:aload_2         
	//   35   83:ldc2            #258 <String "Strange Map type ">
	//   36   86:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   37   89:pop             
					((StringBuilder) (typebindings)).append(class1.getName());
	//   38   90:aload_2         
	//   39   91:aload_1         
	//   40   92:invokevirtual   #202 <Method String Class.getName()>
	//   41   95:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   42   98:pop             
					((StringBuilder) (typebindings)).append(": cannot determine type parameters");
	//   43   99:aload_2         
	//   44  100:ldc1            #252 <String ": cannot determine type parameters">
	//   45  102:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   46  105:pop             
					throw new IllegalArgumentException(((StringBuilder) (typebindings)).toString());
	//   47  106:new             #206 <Class IllegalArgumentException>
	//   48  109:dup             
	//   49  110:aload_2         
	//   50  111:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   51  114:invokespecial   #212 <Method void IllegalArgumentException(String)>
	//   52  117:athrow          
				}
			} else
			{
				obj = ((Object) (_unknownType()));
	//   53  118:aload_0         
	//   54  119:invokevirtual   #234 <Method JavaType _unknownType()>
	//   55  122:astore          6
				obj1 = obj;
	//   56  124:aload           6
	//   57  126:astore          7
			}
		}
		return ((JavaType) (MapType.construct(class1, typebindings, javatype, ajavatype, ((JavaType) (obj)), ((JavaType) (obj1)))));
	//   58  128:aload_1         
	//   59  129:aload_2         
	//   60  130:aload_3         
	//   61  131:aload           4
	//   62  133:aload           6
	//   63  135:aload           7
	//   64  137:invokestatic    #263 <Method MapType MapType.construct(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType)>
	//   65  140:areturn         
	}

	private JavaType _referenceType(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
label0:
		{
			Object obj = ((Object) (typebindings.getTypeParameters()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #225 <Method List TypeBindings.getTypeParameters()>
	//    2    4:astore          5
			if(((List) (obj)).isEmpty())
	//*   3    6:aload           5
	//*   4    8:invokeinterface #231 <Method boolean List.isEmpty()>
	//*   5   13:ifeq            25
			{
				obj = ((Object) (_unknownType()));
	//    6   16:aload_0         
	//    7   17:invokevirtual   #234 <Method JavaType _unknownType()>
	//    8   20:astore          5
			} else
	//*   9   22:goto            49
			{
				if(((List) (obj)).size() != 1)
					break label0;
	//   10   25:aload           5
	//   11   27:invokeinterface #238 <Method int List.size()>
	//   12   32:iconst_1        
	//   13   33:icmpne          60
				obj = ((Object) ((JavaType)((List) (obj)).get(0)));
	//   14   36:aload           5
	//   15   38:iconst_0        
	//   16   39:invokeinterface #242 <Method Object List.get(int)>
	//   17   44:checkcast       #48  <Class JavaType>
	//   18   47:astore          5
			}
			return ((JavaType) (ReferenceType.construct(class1, typebindings, javatype, ajavatype, ((JavaType) (obj)))));
	//   19   49:aload_1         
	//   20   50:aload_2         
	//   21   51:aload_3         
	//   22   52:aload           4
	//   23   54:aload           5
	//   24   56:invokestatic    #269 <Method ReferenceType ReferenceType.construct(Class, TypeBindings, JavaType, JavaType[], JavaType)>
	//   25   59:areturn         
		}
		typebindings = ((TypeBindings) (new StringBuilder()));
	//   26   60:new             #186 <Class StringBuilder>
	//   27   63:dup             
	//   28   64:invokespecial   #187 <Method void StringBuilder()>
	//   29   67:astore_2        
		((StringBuilder) (typebindings)).append("Strange Reference type ");
	//   30   68:aload_2         
	//   31   69:ldc2            #271 <String "Strange Reference type ">
	//   32   72:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   33   75:pop             
		((StringBuilder) (typebindings)).append(class1.getName());
	//   34   76:aload_2         
	//   35   77:aload_1         
	//   36   78:invokevirtual   #202 <Method String Class.getName()>
	//   37   81:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   38   84:pop             
		((StringBuilder) (typebindings)).append(": cannot determine type parameters");
	//   39   85:aload_2         
	//   40   86:ldc1            #252 <String ": cannot determine type parameters">
	//   41   88:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   42   91:pop             
		throw new IllegalArgumentException(((StringBuilder) (typebindings)).toString());
	//   43   92:new             #206 <Class IllegalArgumentException>
	//   44   95:dup             
	//   45   96:aload_2         
	//   46   97:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   47  100:invokespecial   #212 <Method void IllegalArgumentException(String)>
	//   48  103:athrow          
	}

	private String _resolveTypePlaceholders(JavaType javatype, JavaType javatype1)
		throws IllegalArgumentException
	{
		javatype = ((JavaType) (javatype.getBindings().getTypeParameters()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #274 <Method TypeBindings JavaType.getBindings()>
	//    2    4:invokevirtual   #225 <Method List TypeBindings.getTypeParameters()>
	//    3    7:astore_1        
		javatype1 = ((JavaType) (javatype1.getBindings().getTypeParameters()));
	//    4    8:aload_2         
	//    5    9:invokevirtual   #274 <Method TypeBindings JavaType.getBindings()>
	//    6   12:invokevirtual   #225 <Method List TypeBindings.getTypeParameters()>
	//    7   15:astore_2        
		int j = ((List) (javatype)).size();
	//    8   16:aload_1         
	//    9   17:invokeinterface #238 <Method int List.size()>
	//   10   22:istore          4
		for(int i = 0; i < j; i++)
	//*  11   24:iconst_0        
	//*  12   25:istore_3        
	//*  13   26:iload_3         
	//*  14   27:iload           4
	//*  15   29:icmpge          118
		{
			JavaType javatype2 = (JavaType)((List) (javatype)).get(i);
	//   16   32:aload_1         
	//   17   33:iload_3         
	//   18   34:invokeinterface #242 <Method Object List.get(int)>
	//   19   39:checkcast       #48  <Class JavaType>
	//   20   42:astore          5
			JavaType javatype3 = (JavaType)((List) (javatype1)).get(i);
	//   21   44:aload_2         
	//   22   45:iload_3         
	//   23   46:invokeinterface #242 <Method Object List.get(int)>
	//   24   51:checkcast       #48  <Class JavaType>
	//   25   54:astore          6
			if(!_verifyAndResolvePlaceholders(javatype2, javatype3))
	//*  26   56:aload_0         
	//*  27   57:aload           5
	//*  28   59:aload           6
	//*  29   61:invokespecial   #278 <Method boolean _verifyAndResolvePlaceholders(JavaType, JavaType)>
	//*  30   64:ifne            111
				return String.format("Type parameter #%d/%d differs; can not specialize %s with %s", new Object[] {
					Integer.valueOf(i + 1), Integer.valueOf(j), javatype2.toCanonical(), javatype3.toCanonical()
				});
	//   31   67:ldc2            #280 <String "Type parameter #%d/%d differs; can not specialize %s with %s">
	//   32   70:iconst_4        
	//   33   71:anewarray       Object[]
	//   34   74:dup             
	//   35   75:iconst_0        
	//   36   76:iload_3         
	//   37   77:iconst_1        
	//   38   78:iadd            
	//   39   79:invokestatic    #284 <Method Integer Integer.valueOf(int)>
	//   40   82:aastore         
	//   41   83:dup             
	//   42   84:iconst_1        
	//   43   85:iload           4
	//   44   87:invokestatic    #284 <Method Integer Integer.valueOf(int)>
	//   45   90:aastore         
	//   46   91:dup             
	//   47   92:iconst_2        
	//   48   93:aload           5
	//   49   95:invokevirtual   #197 <Method String JavaType.toCanonical()>
	//   50   98:aastore         
	//   51   99:dup             
	//   52  100:iconst_3        
	//   53  101:aload           6
	//   54  103:invokevirtual   #197 <Method String JavaType.toCanonical()>
	//   55  106:aastore         
	//   56  107:invokestatic    #218 <Method String String.format(String, Object[])>
	//   57  110:areturn         
		}

	//   58  111:iload_3         
	//   59  112:iconst_1        
	//   60  113:iadd            
	//   61  114:istore_3        
	//*  62  115:goto            26
		return null;
	//   63  118:aconst_null     
	//   64  119:areturn         
	}

	private boolean _verifyAndResolvePlaceholders(JavaType javatype, JavaType javatype1)
	{
		if(javatype1 instanceof PlaceholderForType)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #154 <Class PlaceholderForType>
	//*   2    4:ifeq            17
		{
			((PlaceholderForType)javatype1).actualType(javatype);
	//    3    7:aload_2         
	//    4    8:checkcast       #154 <Class PlaceholderForType>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #288 <Method void PlaceholderForType.actualType(JavaType)>
			return true;
	//    7   15:iconst_1        
	//    8   16:ireturn         
		}
		if(javatype.getRawClass() != javatype1.getRawClass())
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #169 <Method Class JavaType.getRawClass()>
	//*  11   21:aload_2         
	//*  12   22:invokevirtual   #169 <Method Class JavaType.getRawClass()>
	//*  13   25:if_acmpeq       30
			return false;
	//   14   28:iconst_0        
	//   15   29:ireturn         
		javatype = ((JavaType) (javatype.getBindings().getTypeParameters()));
	//   16   30:aload_1         
	//   17   31:invokevirtual   #274 <Method TypeBindings JavaType.getBindings()>
	//   18   34:invokevirtual   #225 <Method List TypeBindings.getTypeParameters()>
	//   19   37:astore_1        
		javatype1 = ((JavaType) (javatype1.getBindings().getTypeParameters()));
	//   20   38:aload_2         
	//   21   39:invokevirtual   #274 <Method TypeBindings JavaType.getBindings()>
	//   22   42:invokevirtual   #225 <Method List TypeBindings.getTypeParameters()>
	//   23   45:astore_2        
		int j = ((List) (javatype)).size();
	//   24   46:aload_1         
	//   25   47:invokeinterface #238 <Method int List.size()>
	//   26   52:istore          4
		for(int i = 0; i < j; i++)
	//*  27   54:iconst_0        
	//*  28   55:istore_3        
	//*  29   56:iload_3         
	//*  30   57:iload           4
	//*  31   59:icmpge          98
			if(!_verifyAndResolvePlaceholders((JavaType)((List) (javatype)).get(i), (JavaType)((List) (javatype1)).get(i)))
	//*  32   62:aload_0         
	//*  33   63:aload_1         
	//*  34   64:iload_3         
	//*  35   65:invokeinterface #242 <Method Object List.get(int)>
	//*  36   70:checkcast       #48  <Class JavaType>
	//*  37   73:aload_2         
	//*  38   74:iload_3         
	//*  39   75:invokeinterface #242 <Method Object List.get(int)>
	//*  40   80:checkcast       #48  <Class JavaType>
	//*  41   83:invokespecial   #278 <Method boolean _verifyAndResolvePlaceholders(JavaType, JavaType)>
	//*  42   86:ifne            91
				return false;
	//   43   89:iconst_0        
	//   44   90:ireturn         

	//   45   91:iload_3         
	//   46   92:iconst_1        
	//   47   93:iadd            
	//   48   94:istore_3        
	//*  49   95:goto            56
		return true;
	//   50   98:iconst_1        
	//   51   99:ireturn         
	}

	public static TypeFactory defaultInstance()
	{
		return instance;
	//    0    0:getstatic       #55  <Field TypeFactory instance>
	//    1    3:areturn         
	}

	public static JavaType unknownType()
	{
		return defaultInstance()._unknownType();
	//    0    0:invokestatic    #292 <Method TypeFactory defaultInstance()>
	//    1    3:invokevirtual   #234 <Method JavaType _unknownType()>
	//    2    6:areturn         
	}

	protected JavaType _constructSimple(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
		if(typebindings.isEmpty())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #294 <Method boolean TypeBindings.isEmpty()>
	//*   2    4:ifeq            22
		{
			JavaType javatype1 = _findWellKnownSimple(class1);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #297 <Method JavaType _findWellKnownSimple(Class)>
	//    6   12:astore          5
			if(javatype1 != null)
	//*   7   14:aload           5
	//*   8   16:ifnull          22
				return javatype1;
	//    9   19:aload           5
	//   10   21:areturn         
		}
		return _newSimpleType(class1, typebindings, javatype, ajavatype);
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:aload           4
	//   16   28:invokevirtual   #300 <Method JavaType _newSimpleType(Class, TypeBindings, JavaType, JavaType[])>
	//   17   31:areturn         
	}

	protected Class _findPrimitive(String s)
	{
		if("int".equals(((Object) (s))))
	//*   0    0:ldc2            #304 <String "int">
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #308 <Method boolean String.equals(Object)>
	//*   3    7:ifeq            14
			return Integer.TYPE;
	//    4   10:getstatic       #91  <Field Class Integer.TYPE>
	//    5   13:areturn         
		if("long".equals(((Object) (s))))
	//*   6   14:ldc2            #310 <String "long">
	//*   7   17:aload_1         
	//*   8   18:invokevirtual   #308 <Method boolean String.equals(Object)>
	//*   9   21:ifeq            28
			return Long.TYPE;
	//   10   24:getstatic       #96  <Field Class Long.TYPE>
	//   11   27:areturn         
		if("float".equals(((Object) (s))))
	//*  12   28:ldc2            #312 <String "float">
	//*  13   31:aload_1         
	//*  14   32:invokevirtual   #308 <Method boolean String.equals(Object)>
	//*  15   35:ifeq            42
			return Float.TYPE;
	//   16   38:getstatic       #315 <Field Class Float.TYPE>
	//   17   41:areturn         
		if("double".equals(((Object) (s))))
	//*  18   42:ldc2            #317 <String "double">
	//*  19   45:aload_1         
	//*  20   46:invokevirtual   #308 <Method boolean String.equals(Object)>
	//*  21   49:ifeq            56
			return Double.TYPE;
	//   22   52:getstatic       #320 <Field Class Double.TYPE>
	//   23   55:areturn         
		if("boolean".equals(((Object) (s))))
	//*  24   56:ldc2            #322 <String "boolean">
	//*  25   59:aload_1         
	//*  26   60:invokevirtual   #308 <Method boolean String.equals(Object)>
	//*  27   63:ifeq            70
			return Boolean.TYPE;
	//   28   66:getstatic       #86  <Field Class Boolean.TYPE>
	//   29   69:areturn         
		if("byte".equals(((Object) (s))))
	//*  30   70:ldc2            #324 <String "byte">
	//*  31   73:aload_1         
	//*  32   74:invokevirtual   #308 <Method boolean String.equals(Object)>
	//*  33   77:ifeq            84
			return Byte.TYPE;
	//   34   80:getstatic       #327 <Field Class Byte.TYPE>
	//   35   83:areturn         
		if("char".equals(((Object) (s))))
	//*  36   84:ldc2            #329 <String "char">
	//*  37   87:aload_1         
	//*  38   88:invokevirtual   #308 <Method boolean String.equals(Object)>
	//*  39   91:ifeq            98
			return Character.TYPE;
	//   40   94:getstatic       #332 <Field Class Character.TYPE>
	//   41   97:areturn         
		if("short".equals(((Object) (s))))
	//*  42   98:ldc2            #334 <String "short">
	//*  43  101:aload_1         
	//*  44  102:invokevirtual   #308 <Method boolean String.equals(Object)>
	//*  45  105:ifeq            112
			return Short.TYPE;
	//   46  108:getstatic       #337 <Field Class Short.TYPE>
	//   47  111:areturn         
		if("void".equals(((Object) (s))))
	//*  48  112:ldc2            #339 <String "void">
	//*  49  115:aload_1         
	//*  50  116:invokevirtual   #308 <Method boolean String.equals(Object)>
	//*  51  119:ifeq            126
			return Void.TYPE;
	//   52  122:getstatic       #342 <Field Class Void.TYPE>
	//   53  125:areturn         
		else
			return null;
	//   54  126:aconst_null     
	//   55  127:areturn         
	}

	protected JavaType _findWellKnownSimple(Class class1)
	{
		if(class1.isPrimitive())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #346 <Method boolean Class.isPrimitive()>
	//*   2    4:ifeq            40
		{
			if(class1 == CLS_BOOL)
	//*   3    7:aload_1         
	//*   4    8:getstatic       #88  <Field Class CLS_BOOL>
	//*   5   11:if_acmpne       18
				return ((JavaType) (CORE_TYPE_BOOL));
	//    6   14:getstatic       #105 <Field SimpleType CORE_TYPE_BOOL>
	//    7   17:areturn         
			if(class1 == CLS_INT)
	//*   8   18:aload_1         
	//*   9   19:getstatic       #93  <Field Class CLS_INT>
	//*  10   22:if_acmpne       29
				return ((JavaType) (CORE_TYPE_INT));
	//   11   25:getstatic       #107 <Field SimpleType CORE_TYPE_INT>
	//   12   28:areturn         
			if(class1 == CLS_LONG)
	//*  13   29:aload_1         
	//*  14   30:getstatic       #98  <Field Class CLS_LONG>
	//*  15   33:if_acmpne       62
				return ((JavaType) (CORE_TYPE_LONG));
	//   16   36:getstatic       #109 <Field SimpleType CORE_TYPE_LONG>
	//   17   39:areturn         
		} else
		{
			if(class1 == CLS_STRING)
	//*  18   40:aload_1         
	//*  19   41:getstatic       #67  <Field Class CLS_STRING>
	//*  20   44:if_acmpne       51
				return ((JavaType) (CORE_TYPE_STRING));
	//   21   47:getstatic       #111 <Field SimpleType CORE_TYPE_STRING>
	//   22   50:areturn         
			if(class1 == CLS_OBJECT)
	//*  23   51:aload_1         
	//*  24   52:getstatic       #69  <Field Class CLS_OBJECT>
	//*  25   55:if_acmpne       62
				return ((JavaType) (CORE_TYPE_OBJECT));
	//   26   58:getstatic       #113 <Field SimpleType CORE_TYPE_OBJECT>
	//   27   61:areturn         
		}
		return null;
	//   28   62:aconst_null     
	//   29   63:areturn         
	}

	protected JavaType _fromAny(ClassStack classstack, Type type, TypeBindings typebindings)
	{
label0:
		{
			if(type instanceof Class)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #75  <Class Class>
	//*   2    4:ifeq            23
				classstack = ((ClassStack) (_fromClass(classstack, (Class)type, EMPTY_BINDINGS)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:checkcast       #75  <Class Class>
	//    7   13:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//    8   16:invokevirtual   #165 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//    9   19:astore_1        
			else
	//*  10   20:goto            116
			if(type instanceof ParameterizedType)
	//*  11   23:aload_2         
	//*  12   24:instanceof      #351 <Class ParameterizedType>
	//*  13   27:ifeq            44
			{
				classstack = ((ClassStack) (_fromParamType(classstack, (ParameterizedType)type, typebindings)));
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:aload_2         
	//   17   33:checkcast       #351 <Class ParameterizedType>
	//   18   36:aload_3         
	//   19   37:invokevirtual   #355 <Method JavaType _fromParamType(ClassStack, ParameterizedType, TypeBindings)>
	//   20   40:astore_1        
			} else
	//*  21   41:goto            116
			{
				if(type instanceof JavaType)
	//*  22   44:aload_2         
	//*  23   45:instanceof      #48  <Class JavaType>
	//*  24   48:ifeq            56
					return (JavaType)type;
	//   25   51:aload_2         
	//   26   52:checkcast       #48  <Class JavaType>
	//   27   55:areturn         
				if(type instanceof GenericArrayType)
	//*  28   56:aload_2         
	//*  29   57:instanceof      #357 <Class GenericArrayType>
	//*  30   60:ifeq            77
					classstack = ((ClassStack) (_fromArrayType(classstack, (GenericArrayType)type, typebindings)));
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:aload_2         
	//   34   66:checkcast       #357 <Class GenericArrayType>
	//   35   69:aload_3         
	//   36   70:invokevirtual   #361 <Method JavaType _fromArrayType(ClassStack, GenericArrayType, TypeBindings)>
	//   37   73:astore_1        
				else
	//*  38   74:goto            116
				if(type instanceof TypeVariable)
	//*  39   77:aload_2         
	//*  40   78:instanceof      #363 <Class TypeVariable>
	//*  41   81:ifeq            98
				{
					classstack = ((ClassStack) (_fromVariable(classstack, (TypeVariable)type, typebindings)));
	//   42   84:aload_0         
	//   43   85:aload_1         
	//   44   86:aload_2         
	//   45   87:checkcast       #363 <Class TypeVariable>
	//   46   90:aload_3         
	//   47   91:invokevirtual   #367 <Method JavaType _fromVariable(ClassStack, TypeVariable, TypeBindings)>
	//   48   94:astore_1        
				} else
	//*  49   95:goto            116
				{
					if(!(type instanceof WildcardType))
						break label0;
	//   50   98:aload_2         
	//   51   99:instanceof      #369 <Class WildcardType>
	//   52  102:ifeq            241
					classstack = ((ClassStack) (_fromWildcard(classstack, (WildcardType)type, typebindings)));
	//   53  105:aload_0         
	//   54  106:aload_1         
	//   55  107:aload_2         
	//   56  108:checkcast       #369 <Class WildcardType>
	//   57  111:aload_3         
	//   58  112:invokevirtual   #373 <Method JavaType _fromWildcard(ClassStack, WildcardType, TypeBindings)>
	//   59  115:astore_1        
				}
			}
			typebindings = ((TypeBindings) (classstack));
	//   60  116:aload_1         
	//   61  117:astore_3        
			if(_modifiers != null)
	//*  62  118:aload_0         
	//*  63  119:getfield        #140 <Field TypeModifier[] _modifiers>
	//*  64  122:ifnull          239
			{
				TypeBindings typebindings1 = ((JavaType) (classstack)).getBindings();
	//   65  125:aload_1         
	//   66  126:invokevirtual   #274 <Method TypeBindings JavaType.getBindings()>
	//   67  129:astore          6
				typebindings = typebindings1;
	//   68  131:aload           6
	//   69  133:astore_3        
				if(typebindings1 == null)
	//*  70  134:aload           6
	//*  71  136:ifnonnull       143
					typebindings = EMPTY_BINDINGS;
	//   72  139:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//   73  142:astore_3        
				TypeModifier atypemodifier[] = _modifiers;
	//   74  143:aload_0         
	//   75  144:getfield        #140 <Field TypeModifier[] _modifiers>
	//   76  147:astore          7
				int j = atypemodifier.length;
	//   77  149:aload           7
	//   78  151:arraylength     
	//   79  152:istore          5
				for(int i = 0; i < j;)
	//*  80  154:iconst_0        
	//*  81  155:istore          4
	//*  82  157:iload           4
	//*  83  159:iload           5
	//*  84  161:icmpge          237
				{
					TypeModifier typemodifier = atypemodifier[i];
	//   85  164:aload           7
	//   86  166:iload           4
	//   87  168:aaload          
	//   88  169:astore          8
					JavaType javatype = typemodifier.modifyType(((JavaType) (classstack)), type, typebindings, this);
	//   89  171:aload           8
	//   90  173:aload_1         
	//   91  174:aload_2         
	//   92  175:aload_3         
	//   93  176:aload_0         
	//   94  177:invokevirtual   #379 <Method JavaType TypeModifier.modifyType(JavaType, Type, TypeBindings, TypeFactory)>
	//   95  180:astore          6
					if(javatype != null)
	//*  96  182:aload           6
	//*  97  184:ifnull          199
					{
						i++;
	//   98  187:iload           4
	//   99  189:iconst_1        
	//  100  190:iadd            
	//  101  191:istore          4
						classstack = ((ClassStack) (javatype));
	//  102  193:aload           6
	//  103  195:astore_1        
					} else
	//* 104  196:goto            157
					{
						throw new IllegalStateException(String.format("TypeModifier %s (of type %s) return null for type %s", new Object[] {
							typemodifier, ((Object) (typemodifier)).getClass().getName(), classstack
						}));
	//  105  199:new             #381 <Class IllegalStateException>
	//  106  202:dup             
	//  107  203:ldc2            #383 <String "TypeModifier %s (of type %s) return null for type %s">
	//  108  206:iconst_3        
	//  109  207:anewarray       Object[]
	//  110  210:dup             
	//  111  211:iconst_0        
	//  112  212:aload           8
	//  113  214:aastore         
	//  114  215:dup             
	//  115  216:iconst_1        
	//  116  217:aload           8
	//  117  219:invokevirtual   #386 <Method Class Object.getClass()>
	//  118  222:invokevirtual   #202 <Method String Class.getName()>
	//  119  225:aastore         
	//  120  226:dup             
	//  121  227:iconst_2        
	//  122  228:aload_1         
	//  123  229:aastore         
	//  124  230:invokestatic    #218 <Method String String.format(String, Object[])>
	//  125  233:invokespecial   #387 <Method void IllegalStateException(String)>
	//  126  236:athrow          
					}
				}

				typebindings = ((TypeBindings) (classstack));
	//  127  237:aload_1         
	//  128  238:astore_3        
			}
			return ((JavaType) (typebindings));
	//  129  239:aload_3         
	//  130  240:areturn         
		}
		typebindings = ((TypeBindings) (new StringBuilder()));
	//  131  241:new             #186 <Class StringBuilder>
	//  132  244:dup             
	//  133  245:invokespecial   #187 <Method void StringBuilder()>
	//  134  248:astore_3        
		((StringBuilder) (typebindings)).append("Unrecognized Type: ");
	//  135  249:aload_3         
	//  136  250:ldc2            #389 <String "Unrecognized Type: ">
	//  137  253:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//  138  256:pop             
		if(type == null)
	//* 139  257:aload_2         
	//* 140  258:ifnonnull       268
			classstack = "[null]";
	//  141  261:ldc2            #391 <String "[null]">
	//  142  264:astore_1        
		else
	//* 143  265:goto            273
			classstack = ((ClassStack) (((Object) (type)).toString()));
	//  144  268:aload_2         
	//  145  269:invokevirtual   #392 <Method String Object.toString()>
	//  146  272:astore_1        
		((StringBuilder) (typebindings)).append(((String) (classstack)));
	//  147  273:aload_3         
	//  148  274:aload_1         
	//  149  275:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//  150  278:pop             
		throw new IllegalArgumentException(((StringBuilder) (typebindings)).toString());
	//  151  279:new             #206 <Class IllegalArgumentException>
	//  152  282:dup             
	//  153  283:aload_3         
	//  154  284:invokevirtual   #209 <Method String StringBuilder.toString()>
	//  155  287:invokespecial   #212 <Method void IllegalArgumentException(String)>
	//  156  290:athrow          
	}

	protected JavaType _fromArrayType(ClassStack classstack, GenericArrayType genericarraytype, TypeBindings typebindings)
	{
		return ((JavaType) (ArrayType.construct(_fromAny(classstack, genericarraytype.getGenericComponentType(), typebindings), typebindings)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokeinterface #396 <Method Type GenericArrayType.getGenericComponentType()>
	//    4    8:aload_3         
	//    5    9:invokevirtual   #398 <Method JavaType _fromAny(ClassStack, Type, TypeBindings)>
	//    6   12:aload_3         
	//    7   13:invokestatic    #403 <Method ArrayType ArrayType.construct(JavaType, TypeBindings)>
	//    8   16:areturn         
	}

	protected JavaType _fromClass(ClassStack classstack, Class class1, TypeBindings typebindings)
	{
		Object obj = ((Object) (_findWellKnownSimple(class1)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #297 <Method JavaType _findWellKnownSimple(Class)>
	//    3    5:astore          4
		if(obj != null)
	//*   4    7:aload           4
	//*   5    9:ifnull          15
			return ((JavaType) (obj));
	//    6   12:aload           4
	//    7   14:areturn         
		Object obj1;
		if(typebindings != null && !typebindings.isEmpty())
	//*   8   15:aload_3         
	//*   9   16:ifnull          39
	//*  10   19:aload_3         
	//*  11   20:invokevirtual   #294 <Method boolean TypeBindings.isEmpty()>
	//*  12   23:ifeq            29
	//*  13   26:goto            39
			obj1 = typebindings.asKey(class1);
	//   14   29:aload_3         
	//   15   30:aload_2         
	//   16   31:invokevirtual   #407 <Method Object TypeBindings.asKey(Class)>
	//   17   34:astore          5
		else
	//*  18   36:goto            42
			obj1 = ((Object) (class1));
	//   19   39:aload_2         
	//   20   40:astore          5
		obj = ((Object) ((JavaType)_typeCache.get(obj1)));
	//   21   42:aload_0         
	//   22   43:getfield        #131 <Field LRUMap _typeCache>
	//   23   46:aload           5
	//   24   48:invokevirtual   #410 <Method Object LRUMap.get(Object)>
	//   25   51:checkcast       #48  <Class JavaType>
	//   26   54:astore          4
		if(obj != null)
	//*  27   56:aload           4
	//*  28   58:ifnull          64
			return ((JavaType) (obj));
	//   29   61:aload           4
	//   30   63:areturn         
		ClassStack classstack1;
		if(classstack == null)
	//*  31   64:aload_1         
	//*  32   65:ifnonnull       81
		{
			classstack1 = new ClassStack(class1);
	//   33   68:new             #412 <Class ClassStack>
	//   34   71:dup             
	//   35   72:aload_2         
	//   36   73:invokespecial   #413 <Method void ClassStack(Class)>
	//   37   76:astore          6
		} else
	//*  38   78:goto            120
		{
			classstack1 = classstack.find(class1);
	//   39   81:aload_1         
	//   40   82:aload_2         
	//   41   83:invokevirtual   #417 <Method ClassStack ClassStack.find(Class)>
	//   42   86:astore          6
			if(classstack1 != null)
	//*  43   88:aload           6
	//*  44   90:ifnull          113
			{
				classstack = ((ClassStack) (new ResolvedRecursiveType(class1, EMPTY_BINDINGS)));
	//   45   93:new             #419 <Class ResolvedRecursiveType>
	//   46   96:dup             
	//   47   97:aload_2         
	//   48   98:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//   49  101:invokespecial   #422 <Method void ResolvedRecursiveType(Class, TypeBindings)>
	//   50  104:astore_1        
				classstack1.addSelfReference(((ResolvedRecursiveType) (classstack)));
	//   51  105:aload           6
	//   52  107:aload_1         
	//   53  108:invokevirtual   #426 <Method void ClassStack.addSelfReference(ResolvedRecursiveType)>
				return ((JavaType) (classstack));
	//   54  111:aload_1         
	//   55  112:areturn         
			}
			classstack1 = classstack.child(class1);
	//   56  113:aload_1         
	//   57  114:aload_2         
	//   58  115:invokevirtual   #429 <Method ClassStack ClassStack.child(Class)>
	//   59  118:astore          6
		}
		if(class1.isArray())
	//*  60  120:aload_2         
	//*  61  121:invokevirtual   #432 <Method boolean Class.isArray()>
	//*  62  124:ifeq            146
		{
			classstack = ((ClassStack) (ArrayType.construct(_fromAny(classstack1, ((Type) (class1.getComponentType())), typebindings), typebindings)));
	//   63  127:aload_0         
	//   64  128:aload           6
	//   65  130:aload_2         
	//   66  131:invokevirtual   #435 <Method Class Class.getComponentType()>
	//   67  134:aload_3         
	//   68  135:invokevirtual   #398 <Method JavaType _fromAny(ClassStack, Type, TypeBindings)>
	//   69  138:aload_3         
	//   70  139:invokestatic    #403 <Method ArrayType ArrayType.construct(JavaType, TypeBindings)>
	//   71  142:astore_1        
		} else
	//*  72  143:goto            297
		{
			JavaType javatype2;
			JavaType ajavatype[];
			if(class1.isInterface())
	//*  73  146:aload_2         
	//*  74  147:invokevirtual   #438 <Method boolean Class.isInterface()>
	//*  75  150:ifeq            169
			{
				ajavatype = _resolveSuperInterfaces(classstack1, class1, typebindings);
	//   76  153:aload_0         
	//   77  154:aload           6
	//   78  156:aload_2         
	//   79  157:aload_3         
	//   80  158:invokevirtual   #442 <Method JavaType[] _resolveSuperInterfaces(ClassStack, Class, TypeBindings)>
	//   81  161:astore          8
				javatype2 = null;
	//   82  163:aconst_null     
	//   83  164:astore          7
			} else
	//*  84  166:goto            189
			{
				javatype2 = _resolveSuperClass(classstack1, class1, typebindings);
	//   85  169:aload_0         
	//   86  170:aload           6
	//   87  172:aload_2         
	//   88  173:aload_3         
	//   89  174:invokevirtual   #445 <Method JavaType _resolveSuperClass(ClassStack, Class, TypeBindings)>
	//   90  177:astore          7
				ajavatype = _resolveSuperInterfaces(classstack1, class1, typebindings);
	//   91  179:aload_0         
	//   92  180:aload           6
	//   93  182:aload_2         
	//   94  183:aload_3         
	//   95  184:invokevirtual   #442 <Method JavaType[] _resolveSuperInterfaces(ClassStack, Class, TypeBindings)>
	//   96  187:astore          8
			}
			if(class1 == java/util/Properties)
	//*  97  189:aload_2         
	//*  98  190:ldc2            #256 <Class Properties>
	//*  99  193:if_acmpne       216
			{
				classstack = ((ClassStack) (CORE_TYPE_STRING));
	//  100  196:getstatic       #111 <Field SimpleType CORE_TYPE_STRING>
	//  101  199:astore_1        
				obj = ((Object) (MapType.construct(class1, typebindings, javatype2, ajavatype, ((JavaType) (classstack)), ((JavaType) (classstack)))));
	//  102  200:aload_2         
	//  103  201:aload_3         
	//  104  202:aload           7
	//  105  204:aload           8
	//  106  206:aload_1         
	//  107  207:aload_1         
	//  108  208:invokestatic    #263 <Method MapType MapType.construct(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType)>
	//  109  211:astore          4
			} else
	//* 110  213:goto            234
			if(javatype2 != null)
	//* 111  216:aload           7
	//* 112  218:ifnull          234
				obj = ((Object) (javatype2.refine(class1, typebindings, javatype2, ajavatype)));
	//  113  221:aload           7
	//  114  223:aload_2         
	//  115  224:aload_3         
	//  116  225:aload           7
	//  117  227:aload           8
	//  118  229:invokevirtual   #448 <Method JavaType JavaType.refine(Class, TypeBindings, JavaType, JavaType[])>
	//  119  232:astore          4
			classstack = ((ClassStack) (obj));
	//  120  234:aload           4
	//  121  236:astore_1        
			if(obj == null)
	//* 122  237:aload           4
	//* 123  239:ifnonnull       297
			{
				JavaType javatype = _fromWellKnownClass(classstack1, class1, typebindings, javatype2, ajavatype);
	//  124  242:aload_0         
	//  125  243:aload           6
	//  126  245:aload_2         
	//  127  246:aload_3         
	//  128  247:aload           7
	//  129  249:aload           8
	//  130  251:invokevirtual   #452 <Method JavaType _fromWellKnownClass(ClassStack, Class, TypeBindings, JavaType, JavaType[])>
	//  131  254:astore          4
				classstack = ((ClassStack) (javatype));
	//  132  256:aload           4
	//  133  258:astore_1        
				if(javatype == null)
	//* 134  259:aload           4
	//* 135  261:ifnonnull       297
				{
					JavaType javatype1 = _fromWellKnownInterface(classstack1, class1, typebindings, javatype2, ajavatype);
	//  136  264:aload_0         
	//  137  265:aload           6
	//  138  267:aload_2         
	//  139  268:aload_3         
	//  140  269:aload           7
	//  141  271:aload           8
	//  142  273:invokevirtual   #455 <Method JavaType _fromWellKnownInterface(ClassStack, Class, TypeBindings, JavaType, JavaType[])>
	//  143  276:astore          4
					classstack = ((ClassStack) (javatype1));
	//  144  278:aload           4
	//  145  280:astore_1        
					if(javatype1 == null)
	//* 146  281:aload           4
	//* 147  283:ifnonnull       297
						classstack = ((ClassStack) (_newSimpleType(class1, typebindings, javatype2, ajavatype)));
	//  148  286:aload_0         
	//  149  287:aload_2         
	//  150  288:aload_3         
	//  151  289:aload           7
	//  152  291:aload           8
	//  153  293:invokevirtual   #300 <Method JavaType _newSimpleType(Class, TypeBindings, JavaType, JavaType[])>
	//  154  296:astore_1        
				}
			}
		}
		classstack1.resolveSelfReferences(((JavaType) (classstack)));
	//  155  297:aload           6
	//  156  299:aload_1         
	//  157  300:invokevirtual   #458 <Method void ClassStack.resolveSelfReferences(JavaType)>
		if(!((JavaType) (classstack)).hasHandlers())
	//* 158  303:aload_1         
	//* 159  304:invokevirtual   #461 <Method boolean JavaType.hasHandlers()>
	//* 160  307:ifne            321
			_typeCache.putIfAbsent(obj1, ((Object) (classstack)));
	//  161  310:aload_0         
	//  162  311:getfield        #131 <Field LRUMap _typeCache>
	//  163  314:aload           5
	//  164  316:aload_1         
	//  165  317:invokevirtual   #465 <Method Object LRUMap.putIfAbsent(Object, Object)>
	//  166  320:pop             
		return ((JavaType) (classstack));
	//  167  321:aload_1         
	//  168  322:areturn         
	}

	protected JavaType _fromParamType(ClassStack classstack, ParameterizedType parameterizedtype, TypeBindings typebindings)
	{
		Class class1 = (Class)parameterizedtype.getRawType();
	//    0    0:aload_2         
	//    1    1:invokeinterface #469 <Method Type ParameterizedType.getRawType()>
	//    2    6:checkcast       #75  <Class Class>
	//    3    9:astore          6
		if(class1 == CLS_ENUM)
	//*   4   11:aload           6
	//*   5   13:getstatic       #81  <Field Class CLS_ENUM>
	//*   6   16:if_acmpne       23
			return ((JavaType) (CORE_TYPE_ENUM));
	//    7   19:getstatic       #117 <Field SimpleType CORE_TYPE_ENUM>
	//    8   22:areturn         
		if(class1 == CLS_COMPARABLE)
	//*   9   23:aload           6
	//*  10   25:getstatic       #73  <Field Class CLS_COMPARABLE>
	//*  11   28:if_acmpne       35
			return ((JavaType) (CORE_TYPE_COMPARABLE));
	//   12   31:getstatic       #115 <Field SimpleType CORE_TYPE_COMPARABLE>
	//   13   34:areturn         
		if(class1 == CLS_CLASS)
	//*  14   35:aload           6
	//*  15   37:getstatic       #77  <Field Class CLS_CLASS>
	//*  16   40:if_acmpne       47
			return ((JavaType) (CORE_TYPE_CLASS));
	//   17   43:getstatic       #119 <Field SimpleType CORE_TYPE_CLASS>
	//   18   46:areturn         
		parameterizedtype = ((ParameterizedType) (parameterizedtype.getActualTypeArguments()));
	//   19   47:aload_2         
	//   20   48:invokeinterface #473 <Method Type[] ParameterizedType.getActualTypeArguments()>
	//   21   53:astore_2        
		int j = 0;
	//   22   54:iconst_0        
	//   23   55:istore          5
		int i;
		if(parameterizedtype == null)
	//*  24   57:aload_2         
	//*  25   58:ifnonnull       67
			i = 0;
	//   26   61:iconst_0        
	//   27   62:istore          4
		else
	//*  28   64:goto            71
			i = parameterizedtype.length;
	//   29   67:aload_2         
	//   30   68:arraylength     
	//   31   69:istore          4
		if(i == 0)
	//*  32   71:iload           4
	//*  33   73:ifne            83
		{
			parameterizedtype = ((ParameterizedType) (EMPTY_BINDINGS));
	//   34   76:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//   35   79:astore_2        
		} else
	//*  36   80:goto            129
		{
			JavaType ajavatype[] = new JavaType[i];
	//   37   83:iload           4
	//   38   85:anewarray       JavaType[]
	//   39   88:astore          7
			for(; j < i; j++)
	//*  40   90:iload           5
	//*  41   92:iload           4
	//*  42   94:icmpge          121
				ajavatype[j] = _fromAny(classstack, ((Type) (parameterizedtype[j])), typebindings);
	//   43   97:aload           7
	//   44   99:iload           5
	//   45  101:aload_0         
	//   46  102:aload_1         
	//   47  103:aload_2         
	//   48  104:iload           5
	//   49  106:aaload          
	//   50  107:aload_3         
	//   51  108:invokevirtual   #398 <Method JavaType _fromAny(ClassStack, Type, TypeBindings)>
	//   52  111:aastore         

	//   53  112:iload           5
	//   54  114:iconst_1        
	//   55  115:iadd            
	//   56  116:istore          5
	//*  57  118:goto            90
			parameterizedtype = ((ParameterizedType) (TypeBindings.create(class1, ajavatype)));
	//   58  121:aload           6
	//   59  123:aload           7
	//   60  125:invokestatic    #161 <Method TypeBindings TypeBindings.create(Class, JavaType[])>
	//   61  128:astore_2        
		}
		return _fromClass(classstack, class1, ((TypeBindings) (parameterizedtype)));
	//   62  129:aload_0         
	//   63  130:aload_1         
	//   64  131:aload           6
	//   65  133:aload_2         
	//   66  134:invokevirtual   #165 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//   67  137:areturn         
	}

	protected JavaType _fromVariable(ClassStack classstack, TypeVariable typevariable, TypeBindings typebindings)
	{
		String s = typevariable.getName();
	//    0    0:aload_2         
	//    1    1:invokeinterface #474 <Method String TypeVariable.getName()>
	//    2    6:astore          4
		if(typebindings != null)
	//*   3    8:aload_3         
	//*   4    9:ifnull          63
		{
			JavaType javatype = typebindings.findBoundType(s);
	//    5   12:aload_3         
	//    6   13:aload           4
	//    7   15:invokevirtual   #478 <Method JavaType TypeBindings.findBoundType(String)>
	//    8   18:astore          5
			if(javatype != null)
	//*   9   20:aload           5
	//*  10   22:ifnull          28
				return javatype;
	//   11   25:aload           5
	//   12   27:areturn         
			if(typebindings.hasUnbound(s))
	//*  13   28:aload_3         
	//*  14   29:aload           4
	//*  15   31:invokevirtual   #482 <Method boolean TypeBindings.hasUnbound(String)>
	//*  16   34:ifeq            41
			{
				return ((JavaType) (CORE_TYPE_OBJECT));
	//   17   37:getstatic       #113 <Field SimpleType CORE_TYPE_OBJECT>
	//   18   40:areturn         
			} else
			{
				typebindings = typebindings.withUnboundVariable(s);
	//   19   41:aload_3         
	//   20   42:aload           4
	//   21   44:invokevirtual   #486 <Method TypeBindings TypeBindings.withUnboundVariable(String)>
	//   22   47:astore_3        
				return _fromAny(classstack, typevariable.getBounds()[0], typebindings);
	//   23   48:aload_0         
	//   24   49:aload_1         
	//   25   50:aload_2         
	//   26   51:invokeinterface #489 <Method Type[] TypeVariable.getBounds()>
	//   27   56:iconst_0        
	//   28   57:aaload          
	//   29   58:aload_3         
	//   30   59:invokevirtual   #398 <Method JavaType _fromAny(ClassStack, Type, TypeBindings)>
	//   31   62:areturn         
			}
		} else
		{
			throw new Error("No Bindings!");
	//   32   63:new             #491 <Class Error>
	//   33   66:dup             
	//   34   67:ldc2            #493 <String "No Bindings!">
	//   35   70:invokespecial   #494 <Method void Error(String)>
	//   36   73:athrow          
		}
	}

	protected JavaType _fromWellKnownClass(ClassStack classstack, Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
		classstack = ((ClassStack) (typebindings));
	//    0    0:aload_3         
	//    1    1:astore_1        
		if(typebindings == null)
	//*   2    2:aload_3         
	//*   3    3:ifnonnull       10
			classstack = ((ClassStack) (EMPTY_BINDINGS));
	//    4    6:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//    5    9:astore_1        
		if(class1 == java/util/Map)
	//*   6   10:aload_2         
	//*   7   11:ldc2            #497 <Class Map>
	//*   8   14:if_acmpne       28
			return _mapType(class1, ((TypeBindings) (classstack)), javatype, ajavatype);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:aload           4
	//   13   22:aload           5
	//   14   24:invokespecial   #499 <Method JavaType _mapType(Class, TypeBindings, JavaType, JavaType[])>
	//   15   27:areturn         
		if(class1 == java/util/Collection)
	//*  16   28:aload_2         
	//*  17   29:ldc2            #501 <Class Collection>
	//*  18   32:if_acmpne       46
			return _collectionType(class1, ((TypeBindings) (classstack)), javatype, ajavatype);
	//   19   35:aload_0         
	//   20   36:aload_2         
	//   21   37:aload_1         
	//   22   38:aload           4
	//   23   40:aload           5
	//   24   42:invokespecial   #503 <Method JavaType _collectionType(Class, TypeBindings, JavaType, JavaType[])>
	//   25   45:areturn         
		if(class1 == java/util/concurrent/atomic/AtomicReference)
	//*  26   46:aload_2         
	//*  27   47:ldc2            #505 <Class AtomicReference>
	//*  28   50:if_acmpne       64
			return _referenceType(class1, ((TypeBindings) (classstack)), javatype, ajavatype);
	//   29   53:aload_0         
	//   30   54:aload_2         
	//   31   55:aload_1         
	//   32   56:aload           4
	//   33   58:aload           5
	//   34   60:invokespecial   #507 <Method JavaType _referenceType(Class, TypeBindings, JavaType, JavaType[])>
	//   35   63:areturn         
		else
			return null;
	//   36   64:aconst_null     
	//   37   65:areturn         
	}

	protected JavaType _fromWellKnownInterface(ClassStack classstack, Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
		int j = ajavatype.length;
	//    0    0:aload           5
	//    1    2:arraylength     
	//    2    3:istore          7
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore          6
	//*   5    8:iload           6
	//*   6   10:iload           7
	//*   7   12:icmpge          45
		{
			classstack = ((ClassStack) (ajavatype[i].refine(class1, typebindings, javatype, ajavatype)));
	//    8   15:aload           5
	//    9   17:iload           6
	//   10   19:aaload          
	//   11   20:aload_2         
	//   12   21:aload_3         
	//   13   22:aload           4
	//   14   24:aload           5
	//   15   26:invokevirtual   #448 <Method JavaType JavaType.refine(Class, TypeBindings, JavaType, JavaType[])>
	//   16   29:astore_1        
			if(classstack != null)
	//*  17   30:aload_1         
	//*  18   31:ifnull          36
				return ((JavaType) (classstack));
	//   19   34:aload_1         
	//   20   35:areturn         
		}

	//   21   36:iload           6
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:istore          6
	//*  25   42:goto            8
		return null;
	//   26   45:aconst_null     
	//   27   46:areturn         
	}

	protected JavaType _fromWildcard(ClassStack classstack, WildcardType wildcardtype, TypeBindings typebindings)
	{
		return _fromAny(classstack, wildcardtype.getUpperBounds()[0], typebindings);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokeinterface #511 <Method Type[] WildcardType.getUpperBounds()>
	//    4    8:iconst_0        
	//    5    9:aaload          
	//    6   10:aload_3         
	//    7   11:invokevirtual   #398 <Method JavaType _fromAny(ClassStack, Type, TypeBindings)>
	//    8   14:areturn         
	}

	protected JavaType _newSimpleType(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
		return ((JavaType) (new SimpleType(class1, typebindings, javatype, ajavatype)));
	//    0    0:new             #100 <Class SimpleType>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #514 <Method void SimpleType(Class, TypeBindings, JavaType, JavaType[])>
	//    7   12:areturn         
	}

	protected JavaType _resolveSuperClass(ClassStack classstack, Class class1, TypeBindings typebindings)
	{
		class1 = ((Class) (ClassUtil.getGenericSuperclass(class1)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #520 <Method Type ClassUtil.getGenericSuperclass(Class)>
	//    2    4:astore_2        
		if(class1 == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return _fromAny(classstack, ((Type) (class1)), typebindings);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:aload_3         
	//   11   15:invokevirtual   #398 <Method JavaType _fromAny(ClassStack, Type, TypeBindings)>
	//   12   18:areturn         
	}

	protected JavaType[] _resolveSuperInterfaces(ClassStack classstack, Class class1, TypeBindings typebindings)
	{
		class1 = ((Class) (ClassUtil.getGenericInterfaces(class1)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #524 <Method Type[] ClassUtil.getGenericInterfaces(Class)>
	//    2    4:astore_2        
		if(class1 != null && class1.length != 0)
	//*   3    5:aload_2         
	//*   4    6:ifnull          65
	//*   5    9:aload_2         
	//*   6   10:arraylength     
	//*   7   11:ifne            17
	//*   8   14:goto            65
		{
			int j = class1.length;
	//    9   17:aload_2         
	//   10   18:arraylength     
	//   11   19:istore          5
			JavaType ajavatype[] = new JavaType[j];
	//   12   21:iload           5
	//   13   23:anewarray       JavaType[]
	//   14   26:astore          6
			for(int i = 0; i < j; i++)
	//*  15   28:iconst_0        
	//*  16   29:istore          4
	//*  17   31:iload           4
	//*  18   33:iload           5
	//*  19   35:icmpge          62
				ajavatype[i] = _fromAny(classstack, ((Type) (class1[i])), typebindings);
	//   20   38:aload           6
	//   21   40:iload           4
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:aload_2         
	//   25   45:iload           4
	//   26   47:aaload          
	//   27   48:aload_3         
	//   28   49:invokevirtual   #398 <Method JavaType _fromAny(ClassStack, Type, TypeBindings)>
	//   29   52:aastore         

	//   30   53:iload           4
	//   31   55:iconst_1        
	//   32   56:iadd            
	//   33   57:istore          4
	//*  34   59:goto            31
			return ajavatype;
	//   35   62:aload           6
	//   36   64:areturn         
		} else
		{
			return NO_TYPES;
	//   37   65:getstatic       #50  <Field JavaType[] NO_TYPES>
	//   38   68:areturn         
		}
	}

	protected JavaType _unknownType()
	{
		return ((JavaType) (CORE_TYPE_OBJECT));
	//    0    0:getstatic       #113 <Field SimpleType CORE_TYPE_OBJECT>
	//    1    3:areturn         
	}

	protected Class classForName(String s)
		throws ClassNotFoundException
	{
		return Class.forName(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #531 <Method Class Class.forName(String)>
	//    2    4:areturn         
	}

	protected Class classForName(String s, boolean flag, ClassLoader classloader)
		throws ClassNotFoundException
	{
		return Class.forName(s, true, classloader);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:aload_3         
	//    3    3:invokestatic    #534 <Method Class Class.forName(String, boolean, ClassLoader)>
	//    4    6:areturn         
	}

	public CollectionType constructCollectionType(Class class1, JavaType javatype)
	{
		TypeBindings typebindings = TypeBindings.createIfNeeded(class1, javatype);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #541 <Method TypeBindings TypeBindings.createIfNeeded(Class, JavaType)>
	//    3    5:astore          4
		CollectionType collectiontype = (CollectionType)_fromClass(((ClassStack) (null)), class1, typebindings);
	//    4    7:aload_0         
	//    5    8:aconst_null     
	//    6    9:aload_1         
	//    7   10:aload           4
	//    8   12:invokevirtual   #165 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//    9   15:checkcast       #244 <Class CollectionType>
	//   10   18:astore_3        
		if(typebindings.isEmpty() && javatype != null)
	//*  11   19:aload           4
	//*  12   21:invokevirtual   #294 <Method boolean TypeBindings.isEmpty()>
	//*  13   24:ifeq            88
	//*  14   27:aload_2         
	//*  15   28:ifnull          88
		{
			JavaType javatype1 = collectiontype.findSuperType(java/util/Collection).getContentType();
	//   16   31:aload_3         
	//   17   32:ldc2            #501 <Class Collection>
	//   18   35:invokevirtual   #542 <Method JavaType CollectionType.findSuperType(Class)>
	//   19   38:invokevirtual   #545 <Method JavaType JavaType.getContentType()>
	//   20   41:astore          4
			if(javatype1.equals(((Object) (javatype))))
	//*  21   43:aload           4
	//*  22   45:aload_2         
	//*  23   46:invokevirtual   #546 <Method boolean JavaType.equals(Object)>
	//*  24   49:ifeq            54
				return collectiontype;
	//   25   52:aload_3         
	//   26   53:areturn         
			else
				throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", new Object[] {
					ClassUtil.nameOf(class1), javatype, javatype1
				}));
	//   27   54:new             #206 <Class IllegalArgumentException>
	//   28   57:dup             
	//   29   58:ldc2            #548 <String "Non-generic Collection class %s did not resolve to something with element type %s but %s ">
	//   30   61:iconst_3        
	//   31   62:anewarray       Object[]
	//   32   65:dup             
	//   33   66:iconst_0        
	//   34   67:aload_1         
	//   35   68:invokestatic    #552 <Method String ClassUtil.nameOf(Class)>
	//   36   71:aastore         
	//   37   72:dup             
	//   38   73:iconst_1        
	//   39   74:aload_2         
	//   40   75:aastore         
	//   41   76:dup             
	//   42   77:iconst_2        
	//   43   78:aload           4
	//   44   80:aastore         
	//   45   81:invokestatic    #218 <Method String String.format(String, Object[])>
	//   46   84:invokespecial   #212 <Method void IllegalArgumentException(String)>
	//   47   87:athrow          
		} else
		{
			return collectiontype;
	//   48   88:aload_3         
	//   49   89:areturn         
		}
	}

	public CollectionType constructCollectionType(Class class1, Class class2)
	{
		return constructCollectionType(class1, _fromClass(((ClassStack) (null)), class2, EMPTY_BINDINGS));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aconst_null     
	//    4    4:aload_2         
	//    5    5:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//    6    8:invokevirtual   #165 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//    7   11:invokevirtual   #556 <Method CollectionType constructCollectionType(Class, JavaType)>
	//    8   14:areturn         
	}

	public JavaType constructFromCanonical(String s)
		throws IllegalArgumentException
	{
		return _parser.parse(s);
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field TypeParser _parser>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #561 <Method JavaType TypeParser.parse(String)>
	//    4    8:areturn         
	}

	public JavaType constructGeneralizedType(JavaType javatype, Class class1)
	{
		Class class2 = javatype.getRawClass();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #169 <Method Class JavaType.getRawClass()>
	//    2    4:astore_3        
		if(class2 == class1)
	//*   3    5:aload_3         
	//*   4    6:aload_2         
	//*   5    7:if_acmpne       12
			return javatype;
	//    6   10:aload_1         
	//    7   11:areturn         
		JavaType javatype1 = javatype.findSuperType(class1);
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #173 <Method JavaType JavaType.findSuperType(Class)>
	//   11   17:astore          4
		if(javatype1 == null)
	//*  12   19:aload           4
	//*  13   21:ifnonnull       90
		{
			if(!class1.isAssignableFrom(class2))
	//*  14   24:aload_2         
	//*  15   25:aload_3         
	//*  16   26:invokevirtual   #567 <Method boolean Class.isAssignableFrom(Class)>
	//*  17   29:ifne            61
				throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", new Object[] {
					class1.getName(), javatype
				}));
	//   18   32:new             #206 <Class IllegalArgumentException>
	//   19   35:dup             
	//   20   36:ldc2            #569 <String "Class %s not a super-type of %s">
	//   21   39:iconst_2        
	//   22   40:anewarray       Object[]
	//   23   43:dup             
	//   24   44:iconst_0        
	//   25   45:aload_2         
	//   26   46:invokevirtual   #202 <Method String Class.getName()>
	//   27   49:aastore         
	//   28   50:dup             
	//   29   51:iconst_1        
	//   30   52:aload_1         
	//   31   53:aastore         
	//   32   54:invokestatic    #218 <Method String String.format(String, Object[])>
	//   33   57:invokespecial   #212 <Method void IllegalArgumentException(String)>
	//   34   60:athrow          
			else
				throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", new Object[] {
					class1.getName(), javatype
				}));
	//   35   61:new             #206 <Class IllegalArgumentException>
	//   36   64:dup             
	//   37   65:ldc2            #571 <String "Internal error: class %s not included as super-type for %s">
	//   38   68:iconst_2        
	//   39   69:anewarray       Object[]
	//   40   72:dup             
	//   41   73:iconst_0        
	//   42   74:aload_2         
	//   43   75:invokevirtual   #202 <Method String Class.getName()>
	//   44   78:aastore         
	//   45   79:dup             
	//   46   80:iconst_1        
	//   47   81:aload_1         
	//   48   82:aastore         
	//   49   83:invokestatic    #218 <Method String String.format(String, Object[])>
	//   50   86:invokespecial   #212 <Method void IllegalArgumentException(String)>
	//   51   89:athrow          
		} else
		{
			return javatype1;
	//   52   90:aload           4
	//   53   92:areturn         
		}
	}

	public MapType constructMapType(Class class1, JavaType javatype, JavaType javatype1)
	{
		TypeBindings typebindings = TypeBindings.createIfNeeded(class1, new JavaType[] {
			javatype, javatype1
		});
	//    0    0:aload_1         
	//    1    1:iconst_2        
	//    2    2:anewarray       JavaType[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:aload_2         
	//    6    8:aastore         
	//    7    9:dup             
	//    8   10:iconst_1        
	//    9   11:aload_3         
	//   10   12:aastore         
	//   11   13:invokestatic    #576 <Method TypeBindings TypeBindings.createIfNeeded(Class, JavaType[])>
	//   12   16:astore          5
		MapType maptype = (MapType)_fromClass(((ClassStack) (null)), class1, typebindings);
	//   13   18:aload_0         
	//   14   19:aconst_null     
	//   15   20:aload_1         
	//   16   21:aload           5
	//   17   23:invokevirtual   #165 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//   18   26:checkcast       #260 <Class MapType>
	//   19   29:astore          4
		if(typebindings.isEmpty())
	//*  20   31:aload           5
	//*  21   33:invokevirtual   #294 <Method boolean TypeBindings.isEmpty()>
	//*  22   36:ifeq            149
		{
			JavaType javatype2 = maptype.findSuperType(java/util/Map);
	//   23   39:aload           4
	//   24   41:ldc2            #497 <Class Map>
	//   25   44:invokevirtual   #577 <Method JavaType MapType.findSuperType(Class)>
	//   26   47:astore          5
			JavaType javatype3 = javatype2.getKeyType();
	//   27   49:aload           5
	//   28   51:invokevirtual   #580 <Method JavaType JavaType.getKeyType()>
	//   29   54:astore          6
			if(javatype3.equals(((Object) (javatype))))
	//*  30   56:aload           6
	//*  31   58:aload_2         
	//*  32   59:invokevirtual   #546 <Method boolean JavaType.equals(Object)>
	//*  33   62:ifeq            115
			{
				javatype = javatype2.getContentType();
	//   34   65:aload           5
	//   35   67:invokevirtual   #545 <Method JavaType JavaType.getContentType()>
	//   36   70:astore_2        
				if(javatype.equals(((Object) (javatype1))))
	//*  37   71:aload_2         
	//*  38   72:aload_3         
	//*  39   73:invokevirtual   #546 <Method boolean JavaType.equals(Object)>
	//*  40   76:ifeq            82
					return maptype;
	//   41   79:aload           4
	//   42   81:areturn         
				else
					throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", new Object[] {
						ClassUtil.nameOf(class1), javatype1, javatype
					}));
	//   43   82:new             #206 <Class IllegalArgumentException>
	//   44   85:dup             
	//   45   86:ldc2            #582 <String "Non-generic Map class %s did not resolve to something with value type %s but %s ">
	//   46   89:iconst_3        
	//   47   90:anewarray       Object[]
	//   48   93:dup             
	//   49   94:iconst_0        
	//   50   95:aload_1         
	//   51   96:invokestatic    #552 <Method String ClassUtil.nameOf(Class)>
	//   52   99:aastore         
	//   53  100:dup             
	//   54  101:iconst_1        
	//   55  102:aload_3         
	//   56  103:aastore         
	//   57  104:dup             
	//   58  105:iconst_2        
	//   59  106:aload_2         
	//   60  107:aastore         
	//   61  108:invokestatic    #218 <Method String String.format(String, Object[])>
	//   62  111:invokespecial   #212 <Method void IllegalArgumentException(String)>
	//   63  114:athrow          
			} else
			{
				throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", new Object[] {
					ClassUtil.nameOf(class1), javatype, javatype3
				}));
	//   64  115:new             #206 <Class IllegalArgumentException>
	//   65  118:dup             
	//   66  119:ldc2            #584 <String "Non-generic Map class %s did not resolve to something with key type %s but %s ">
	//   67  122:iconst_3        
	//   68  123:anewarray       Object[]
	//   69  126:dup             
	//   70  127:iconst_0        
	//   71  128:aload_1         
	//   72  129:invokestatic    #552 <Method String ClassUtil.nameOf(Class)>
	//   73  132:aastore         
	//   74  133:dup             
	//   75  134:iconst_1        
	//   76  135:aload_2         
	//   77  136:aastore         
	//   78  137:dup             
	//   79  138:iconst_2        
	//   80  139:aload           6
	//   81  141:aastore         
	//   82  142:invokestatic    #218 <Method String String.format(String, Object[])>
	//   83  145:invokespecial   #212 <Method void IllegalArgumentException(String)>
	//   84  148:athrow          
			}
		} else
		{
			return maptype;
	//   85  149:aload           4
	//   86  151:areturn         
		}
	}

	public MapType constructMapType(Class class1, Class class2, Class class3)
	{
		if(class1 == java/util/Properties)
	//*   0    0:aload_1         
	//*   1    1:ldc2            #256 <Class Properties>
	//*   2    4:if_acmpne       16
		{
			class3 = ((Class) (CORE_TYPE_STRING));
	//    3    7:getstatic       #111 <Field SimpleType CORE_TYPE_STRING>
	//    4   10:astore_3        
			class2 = class3;
	//    5   11:aload_3         
	//    6   12:astore_2        
		} else
	//*   7   13:goto            40
		{
			JavaType javatype = _fromClass(((ClassStack) (null)), class2, EMPTY_BINDINGS);
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:aload_2         
	//   11   19:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//   12   22:invokevirtual   #165 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//   13   25:astore          4
			class2 = ((Class) (_fromClass(((ClassStack) (null)), class3, EMPTY_BINDINGS)));
	//   14   27:aload_0         
	//   15   28:aconst_null     
	//   16   29:aload_3         
	//   17   30:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//   18   33:invokevirtual   #165 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//   19   36:astore_2        
			class3 = ((Class) (javatype));
	//   20   37:aload           4
	//   21   39:astore_3        
		}
		return constructMapType(class1, ((JavaType) (class3)), ((JavaType) (class2)));
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:aload_3         
	//   25   43:aload_2         
	//   26   44:invokevirtual   #588 <Method MapType constructMapType(Class, JavaType, JavaType)>
	//   27   47:areturn         
	}

	public JavaType constructSpecializedType(JavaType javatype, Class class1)
	{
label0:
		{
label1:
			{
				Class class2 = javatype.getRawClass();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #169 <Method Class JavaType.getRawClass()>
	//    2    4:astore          4
				if(class2 == class1)
	//*   3    6:aload           4
	//*   4    8:aload_2         
	//*   5    9:if_acmpne       14
					return javatype;
	//    6   12:aload_1         
	//    7   13:areturn         
				if(class2 == java/lang/Object)
	//*   8   14:aload           4
	//*   9   16:ldc1            #4   <Class Object>
	//*  10   18:if_acmpne       34
				{
					class1 = ((Class) (_fromClass(((ClassStack) (null)), class1, EMPTY_BINDINGS)));
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:aload_2         
	//   14   24:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//   15   27:invokevirtual   #165 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//   16   30:astore_2        
					break label1;
	//   17   31:goto            233
				}
				if(!class2.isAssignableFrom(class1))
					break label0;
	//   18   34:aload           4
	//   19   36:aload_2         
	//   20   37:invokevirtual   #567 <Method boolean Class.isAssignableFrom(Class)>
	//   21   40:ifeq            239
				if(javatype.getBindings().isEmpty())
	//*  22   43:aload_1         
	//*  23   44:invokevirtual   #274 <Method TypeBindings JavaType.getBindings()>
	//*  24   47:invokevirtual   #294 <Method boolean TypeBindings.isEmpty()>
	//*  25   50:ifeq            66
				{
					class1 = ((Class) (_fromClass(((ClassStack) (null)), class1, EMPTY_BINDINGS)));
	//   26   53:aload_0         
	//   27   54:aconst_null     
	//   28   55:aload_2         
	//   29   56:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//   30   59:invokevirtual   #165 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//   31   62:astore_2        
					break label1;
	//   32   63:goto            233
				}
				if(javatype.isContainerType())
	//*  33   66:aload_1         
	//*  34   67:invokevirtual   #593 <Method boolean JavaType.isContainerType()>
	//*  35   70:ifeq            196
					if(javatype.isMapLikeType())
	//*  36   73:aload_1         
	//*  37   74:invokevirtual   #596 <Method boolean JavaType.isMapLikeType()>
	//*  38   77:ifeq            130
					{
						if(class1 == java/util/HashMap || class1 == java/util/LinkedHashMap || class1 == java/util/EnumMap || class1 == java/util/TreeMap)
	//*  39   80:aload_2         
	//*  40   81:ldc2            #598 <Class HashMap>
	//*  41   84:if_acmpeq       108
	//*  42   87:aload_2         
	//*  43   88:ldc2            #600 <Class LinkedHashMap>
	//*  44   91:if_acmpeq       108
	//*  45   94:aload_2         
	//*  46   95:ldc2            #602 <Class EnumMap>
	//*  47   98:if_acmpeq       108
	//*  48  101:aload_2         
	//*  49  102:ldc2            #604 <Class TreeMap>
	//*  50  105:if_acmpne       196
						{
							class1 = ((Class) (_fromClass(((ClassStack) (null)), class1, TypeBindings.create(class1, javatype.getKeyType(), javatype.getContentType()))));
	//   51  108:aload_0         
	//   52  109:aconst_null     
	//   53  110:aload_2         
	//   54  111:aload_2         
	//   55  112:aload_1         
	//   56  113:invokevirtual   #580 <Method JavaType JavaType.getKeyType()>
	//   57  116:aload_1         
	//   58  117:invokevirtual   #545 <Method JavaType JavaType.getContentType()>
	//   59  120:invokestatic    #607 <Method TypeBindings TypeBindings.create(Class, JavaType, JavaType)>
	//   60  123:invokevirtual   #165 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//   61  126:astore_2        
							break label1;
	//   62  127:goto            233
						}
					} else
					if(javatype.isCollectionLikeType())
	//*  63  130:aload_1         
	//*  64  131:invokevirtual   #610 <Method boolean JavaType.isCollectionLikeType()>
	//*  65  134:ifeq            196
						if(class1 != java/util/ArrayList && class1 != java/util/LinkedList && class1 != java/util/HashSet && class1 != java/util/TreeSet)
	//*  66  137:aload_2         
	//*  67  138:ldc2            #612 <Class ArrayList>
	//*  68  141:if_acmpeq       178
	//*  69  144:aload_2         
	//*  70  145:ldc2            #614 <Class LinkedList>
	//*  71  148:if_acmpeq       178
	//*  72  151:aload_2         
	//*  73  152:ldc2            #616 <Class HashSet>
	//*  74  155:if_acmpeq       178
	//*  75  158:aload_2         
	//*  76  159:ldc2            #618 <Class TreeSet>
	//*  77  162:if_acmpne       168
	//*  78  165:goto            178
						{
							if(class2 == java/util/EnumSet)
	//*  79  168:aload           4
	//*  80  170:ldc2            #620 <Class EnumSet>
	//*  81  173:if_acmpne       196
								return javatype;
	//   82  176:aload_1         
	//   83  177:areturn         
						} else
						{
							class1 = ((Class) (_fromClass(((ClassStack) (null)), class1, TypeBindings.create(class1, javatype.getContentType()))));
	//   84  178:aload_0         
	//   85  179:aconst_null     
	//   86  180:aload_2         
	//   87  181:aload_2         
	//   88  182:aload_1         
	//   89  183:invokevirtual   #545 <Method JavaType JavaType.getContentType()>
	//   90  186:invokestatic    #622 <Method TypeBindings TypeBindings.create(Class, JavaType)>
	//   91  189:invokevirtual   #165 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//   92  192:astore_2        
							break label1;
	//   93  193:goto            233
						}
				int i = class1.getTypeParameters().length;
	//   94  196:aload_2         
	//   95  197:invokevirtual   #625 <Method TypeVariable[] Class.getTypeParameters()>
	//   96  200:arraylength     
	//   97  201:istore_3        
				if(i == 0)
	//*  98  202:iload_3         
	//*  99  203:ifne            219
					class1 = ((Class) (_fromClass(((ClassStack) (null)), class1, EMPTY_BINDINGS)));
	//  100  206:aload_0         
	//  101  207:aconst_null     
	//  102  208:aload_2         
	//  103  209:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//  104  212:invokevirtual   #165 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//  105  215:astore_2        
				else
	//* 106  216:goto            233
					class1 = ((Class) (_fromClass(((ClassStack) (null)), class1, _bindingsForSubtype(javatype, i, class1))));
	//  107  219:aload_0         
	//  108  220:aconst_null     
	//  109  221:aload_2         
	//  110  222:aload_0         
	//  111  223:aload_1         
	//  112  224:iload_3         
	//  113  225:aload_2         
	//  114  226:invokespecial   #627 <Method TypeBindings _bindingsForSubtype(JavaType, int, Class)>
	//  115  229:invokevirtual   #165 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//  116  232:astore_2        
			}
			return ((JavaType) (class1)).withHandlersFrom(javatype);
	//  117  233:aload_2         
	//  118  234:aload_1         
	//  119  235:invokevirtual   #631 <Method JavaType JavaType.withHandlersFrom(JavaType)>
	//  120  238:areturn         
		}
		throw new IllegalArgumentException(String.format("Class %s not subtype of %s", new Object[] {
			class1.getName(), javatype
		}));
	//  121  239:new             #206 <Class IllegalArgumentException>
	//  122  242:dup             
	//  123  243:ldc2            #633 <String "Class %s not subtype of %s">
	//  124  246:iconst_2        
	//  125  247:anewarray       Object[]
	//  126  250:dup             
	//  127  251:iconst_0        
	//  128  252:aload_2         
	//  129  253:invokevirtual   #202 <Method String Class.getName()>
	//  130  256:aastore         
	//  131  257:dup             
	//  132  258:iconst_1        
	//  133  259:aload_1         
	//  134  260:aastore         
	//  135  261:invokestatic    #218 <Method String String.format(String, Object[])>
	//  136  264:invokespecial   #212 <Method void IllegalArgumentException(String)>
	//  137  267:athrow          
	}

	public JavaType constructType(TypeReference typereference)
	{
		return _fromAny(((ClassStack) (null)), typereference.getType(), EMPTY_BINDINGS);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokevirtual   #640 <Method Type TypeReference.getType()>
	//    4    6:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//    5    9:invokevirtual   #398 <Method JavaType _fromAny(ClassStack, Type, TypeBindings)>
	//    6   12:areturn         
	}

	public JavaType constructType(Type type)
	{
		return _fromAny(((ClassStack) (null)), type, EMPTY_BINDINGS);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//    4    6:invokevirtual   #398 <Method JavaType _fromAny(ClassStack, Type, TypeBindings)>
	//    5    9:areturn         
	}

	public JavaType constructType(Type type, TypeBindings typebindings)
	{
		return _fromAny(((ClassStack) (null)), type, typebindings);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokevirtual   #398 <Method JavaType _fromAny(ClassStack, Type, TypeBindings)>
	//    5    7:areturn         
	}

	public Class findClass(String s)
		throws ClassNotFoundException
	{
		Object obj;
		ClassLoader classloader;
		if(s.indexOf('.') < 0)
	//*   0    0:aload_1         
	//*   1    1:bipush          46
	//*   2    3:invokevirtual   #650 <Method int String.indexOf(int)>
	//*   3    6:ifge            21
		{
			Class class1 = _findPrimitive(s);
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokevirtual   #652 <Method Class _findPrimitive(String)>
	//    7   14:astore_2        
			if(class1 != null)
	//*   8   15:aload_2         
	//*   9   16:ifnull          21
				return class1;
	//   10   19:aload_2         
	//   11   20:areturn         
		}
		obj = null;
	//   12   21:aconst_null     
	//   13   22:astore_2        
		ClassLoader classloader1 = getClassLoader();
	//   14   23:aload_0         
	//   15   24:invokevirtual   #656 <Method ClassLoader getClassLoader()>
	//   16   27:astore          4
		classloader = classloader1;
	//   17   29:aload           4
	//   18   31:astore_3        
		if(classloader1 == null)
	//*  19   32:aload           4
	//*  20   34:ifnonnull       44
			classloader = Thread.currentThread().getContextClassLoader();
	//   21   37:invokestatic    #662 <Method Thread Thread.currentThread()>
	//   22   40:invokevirtual   #665 <Method ClassLoader Thread.getContextClassLoader()>
	//   23   43:astore_3        
		if(classloader == null)
			break MISSING_BLOCK_LABEL_64;
	//   24   44:aload_3         
	//   25   45:ifnull          64
		obj = ((Object) (classForName(s, true, classloader)));
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:iconst_1        
	//   29   51:aload_3         
	//   30   52:invokevirtual   #667 <Method Class classForName(String, boolean, ClassLoader)>
	//   31   55:astore_2        
		return ((Class) (obj));
	//   32   56:aload_2         
	//   33   57:areturn         
		obj;
	//   34   58:astore_2        
		obj = ((Object) (ClassUtil.getRootCause(((Throwable) (obj)))));
	//   35   59:aload_2         
	//   36   60:invokestatic    #671 <Method Throwable ClassUtil.getRootCause(Throwable)>
	//   37   63:astore_2        
		try
		{
			s = ((String) (classForName(s)));
	//   38   64:aload_0         
	//   39   65:aload_1         
	//   40   66:invokevirtual   #673 <Method Class classForName(String)>
	//   41   69:astore_1        
		}
	//*  42   70:aload_1         
	//*  43   71:areturn         
		catch(Exception exception)
	//*  44   72:astore_3        
		{
			s = ((String) (obj));
	//   45   73:aload_2         
	//   46   74:astore_1        
			if(obj == null)
	//*  47   75:aload_2         
	//*  48   76:ifnonnull       84
				s = ((String) (ClassUtil.getRootCause(((Throwable) (exception)))));
	//   49   79:aload_3         
	//   50   80:invokestatic    #671 <Method Throwable ClassUtil.getRootCause(Throwable)>
	//   51   83:astore_1        
			ClassUtil.throwIfRTE(((Throwable) (s)));
	//   52   84:aload_1         
	//   53   85:invokestatic    #676 <Method Throwable ClassUtil.throwIfRTE(Throwable)>
	//   54   88:pop             
			throw new ClassNotFoundException(((Throwable) (s)).getMessage(), ((Throwable) (s)));
	//   55   89:new             #528 <Class ClassNotFoundException>
	//   56   92:dup             
	//   57   93:aload_1         
	//   58   94:invokevirtual   #681 <Method String Throwable.getMessage()>
	//   59   97:aload_1         
	//   60   98:invokespecial   #684 <Method void ClassNotFoundException(String, Throwable)>
	//   61  101:athrow          
		}
		return ((Class) (s));
	}

	public JavaType[] findTypeParameters(JavaType javatype, Class class1)
	{
		javatype = javatype.findSuperType(class1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #173 <Method JavaType JavaType.findSuperType(Class)>
	//    3    5:astore_1        
		if(javatype == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       14
			return NO_TYPES;
	//    6   10:getstatic       #50  <Field JavaType[] NO_TYPES>
	//    7   13:areturn         
		else
			return javatype.getBindings().typeParameterArray();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #274 <Method TypeBindings JavaType.getBindings()>
	//   10   18:invokevirtual   #690 <Method JavaType[] TypeBindings.typeParameterArray()>
	//   11   21:areturn         
	}

	public ClassLoader getClassLoader()
	{
		return _classLoader;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field ClassLoader _classLoader>
	//    2    4:areturn         
	}

	public JavaType uncheckedSimpleType(Class class1)
	{
		return _constructSimple(class1, EMPTY_BINDINGS, ((JavaType) (null)), ((JavaType []) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #695 <Method JavaType _constructSimple(Class, TypeBindings, JavaType, JavaType[])>
	//    6   10:areturn         
	}

	public TypeFactory withModifier(TypeModifier typemodifier)
	{
		LRUMap lrumap = _typeCache;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field LRUMap _typeCache>
	//    2    4:astore_2        
		Object obj = null;
	//    3    5:aconst_null     
	//    4    6:astore_3        
		if(typemodifier == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       18
		{
			lrumap = null;
	//    7   11:aconst_null     
	//    8   12:astore_2        
			typemodifier = ((TypeModifier) (obj));
	//    9   13:aload_3         
	//   10   14:astore_1        
		} else
	//*  11   15:goto            50
		{
			TypeModifier atypemodifier[] = _modifiers;
	//   12   18:aload_0         
	//   13   19:getfield        #140 <Field TypeModifier[] _modifiers>
	//   14   22:astore_3        
			if(atypemodifier == null)
	//*  15   23:aload_3         
	//*  16   24:ifnonnull       41
			{
				atypemodifier = new TypeModifier[1];
	//   17   27:iconst_1        
	//   18   28:anewarray       TypeModifier[]
	//   19   31:astore_3        
				atypemodifier[0] = typemodifier;
	//   20   32:aload_3         
	//   21   33:iconst_0        
	//   22   34:aload_1         
	//   23   35:aastore         
				typemodifier = ((TypeModifier) (atypemodifier));
	//   24   36:aload_3         
	//   25   37:astore_1        
			} else
	//*  26   38:goto            50
			{
				typemodifier = ((TypeModifier) ((TypeModifier[])ArrayBuilders.insertInListNoDup(((Object []) (atypemodifier)), ((Object) (typemodifier)))));
	//   27   41:aload_3         
	//   28   42:aload_1         
	//   29   43:invokestatic    #704 <Method Object[] ArrayBuilders.insertInListNoDup(Object[], Object)>
	//   30   46:checkcast       #705 <Class TypeModifier[]>
	//   31   49:astore_1        
			}
		}
		return new TypeFactory(lrumap, _parser, ((TypeModifier []) (typemodifier)), _classLoader);
	//   32   50:new             #2   <Class TypeFactory>
	//   33   53:dup             
	//   34   54:aload_2         
	//   35   55:aload_0         
	//   36   56:getfield        #138 <Field TypeParser _parser>
	//   37   59:aload_1         
	//   38   60:aload_0         
	//   39   61:getfield        #142 <Field ClassLoader _classLoader>
	//   40   64:invokespecial   #707 <Method void TypeFactory(LRUMap, TypeParser, TypeModifier[], ClassLoader)>
	//   41   67:areturn         
	}

	private static final Class CLS_BOOL;
	private static final Class CLS_CLASS;
	private static final Class CLS_COMPARABLE;
	private static final Class CLS_ENUM;
	private static final Class CLS_INT;
	private static final Class CLS_LONG;
	private static final Class CLS_OBJECT;
	private static final Class CLS_STRING;
	protected static final SimpleType CORE_TYPE_BOOL;
	protected static final SimpleType CORE_TYPE_CLASS;
	protected static final SimpleType CORE_TYPE_COMPARABLE;
	protected static final SimpleType CORE_TYPE_ENUM;
	protected static final SimpleType CORE_TYPE_INT;
	protected static final SimpleType CORE_TYPE_LONG;
	protected static final SimpleType CORE_TYPE_OBJECT;
	protected static final SimpleType CORE_TYPE_STRING;
	protected static final TypeBindings EMPTY_BINDINGS = TypeBindings.emptyBindings();
	private static final JavaType NO_TYPES[] = new JavaType[0];
	protected static final TypeFactory instance = new TypeFactory();
	private static final long serialVersionUID = 1L;
	protected final ClassLoader _classLoader;
	protected final TypeModifier _modifiers[];
	protected final TypeParser _parser;
	protected final LRUMap _typeCache;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       JavaType[]
	//    2    4:putstatic       #50  <Field JavaType[] NO_TYPES>
	//    3    7:new             #2   <Class TypeFactory>
	//    4   10:dup             
	//    5   11:invokespecial   #53  <Method void TypeFactory()>
	//    6   14:putstatic       #55  <Field TypeFactory instance>
	//    7   17:invokestatic    #61  <Method TypeBindings TypeBindings.emptyBindings()>
	//    8   20:putstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
		CLS_STRING = java/lang/String;
	//    9   23:ldc1            #65  <Class String>
	//   10   25:putstatic       #67  <Field Class CLS_STRING>
		CLS_OBJECT = java/lang/Object;
	//   11   28:ldc1            #4   <Class Object>
	//   12   30:putstatic       #69  <Field Class CLS_OBJECT>
		CLS_COMPARABLE = java/lang/Comparable;
	//   13   33:ldc1            #71  <Class Comparable>
	//   14   35:putstatic       #73  <Field Class CLS_COMPARABLE>
		CLS_CLASS = java/lang/Class;
	//   15   38:ldc1            #75  <Class Class>
	//   16   40:putstatic       #77  <Field Class CLS_CLASS>
		CLS_ENUM = java/lang/Enum;
	//   17   43:ldc1            #79  <Class Enum>
	//   18   45:putstatic       #81  <Field Class CLS_ENUM>
		CLS_BOOL = Boolean.TYPE;
	//   19   48:getstatic       #86  <Field Class Boolean.TYPE>
	//   20   51:putstatic       #88  <Field Class CLS_BOOL>
		CLS_INT = Integer.TYPE;
	//   21   54:getstatic       #91  <Field Class Integer.TYPE>
	//   22   57:putstatic       #93  <Field Class CLS_INT>
		CLS_LONG = Long.TYPE;
	//   23   60:getstatic       #96  <Field Class Long.TYPE>
	//   24   63:putstatic       #98  <Field Class CLS_LONG>
		CORE_TYPE_BOOL = new SimpleType(CLS_BOOL);
	//   25   66:new             #100 <Class SimpleType>
	//   26   69:dup             
	//   27   70:getstatic       #88  <Field Class CLS_BOOL>
	//   28   73:invokespecial   #103 <Method void SimpleType(Class)>
	//   29   76:putstatic       #105 <Field SimpleType CORE_TYPE_BOOL>
		CORE_TYPE_INT = new SimpleType(CLS_INT);
	//   30   79:new             #100 <Class SimpleType>
	//   31   82:dup             
	//   32   83:getstatic       #93  <Field Class CLS_INT>
	//   33   86:invokespecial   #103 <Method void SimpleType(Class)>
	//   34   89:putstatic       #107 <Field SimpleType CORE_TYPE_INT>
		CORE_TYPE_LONG = new SimpleType(CLS_LONG);
	//   35   92:new             #100 <Class SimpleType>
	//   36   95:dup             
	//   37   96:getstatic       #98  <Field Class CLS_LONG>
	//   38   99:invokespecial   #103 <Method void SimpleType(Class)>
	//   39  102:putstatic       #109 <Field SimpleType CORE_TYPE_LONG>
		CORE_TYPE_STRING = new SimpleType(CLS_STRING);
	//   40  105:new             #100 <Class SimpleType>
	//   41  108:dup             
	//   42  109:getstatic       #67  <Field Class CLS_STRING>
	//   43  112:invokespecial   #103 <Method void SimpleType(Class)>
	//   44  115:putstatic       #111 <Field SimpleType CORE_TYPE_STRING>
		CORE_TYPE_OBJECT = new SimpleType(CLS_OBJECT);
	//   45  118:new             #100 <Class SimpleType>
	//   46  121:dup             
	//   47  122:getstatic       #69  <Field Class CLS_OBJECT>
	//   48  125:invokespecial   #103 <Method void SimpleType(Class)>
	//   49  128:putstatic       #113 <Field SimpleType CORE_TYPE_OBJECT>
		CORE_TYPE_COMPARABLE = new SimpleType(CLS_COMPARABLE);
	//   50  131:new             #100 <Class SimpleType>
	//   51  134:dup             
	//   52  135:getstatic       #73  <Field Class CLS_COMPARABLE>
	//   53  138:invokespecial   #103 <Method void SimpleType(Class)>
	//   54  141:putstatic       #115 <Field SimpleType CORE_TYPE_COMPARABLE>
		CORE_TYPE_ENUM = new SimpleType(CLS_ENUM);
	//   55  144:new             #100 <Class SimpleType>
	//   56  147:dup             
	//   57  148:getstatic       #81  <Field Class CLS_ENUM>
	//   58  151:invokespecial   #103 <Method void SimpleType(Class)>
	//   59  154:putstatic       #117 <Field SimpleType CORE_TYPE_ENUM>
		CORE_TYPE_CLASS = new SimpleType(CLS_CLASS);
	//   60  157:new             #100 <Class SimpleType>
	//   61  160:dup             
	//   62  161:getstatic       #77  <Field Class CLS_CLASS>
	//   63  164:invokespecial   #103 <Method void SimpleType(Class)>
	//   64  167:putstatic       #119 <Field SimpleType CORE_TYPE_CLASS>
	//*  65  170:return          
	}
}
