// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			ResolvedRecursiveType

public class TypeBindings
	implements Serializable
{
	static class TypeParamStash
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

		TypeParamStash()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #61  <Method void Object()>
		//    2    4:return          
		}
	}


	private TypeBindings(String as[], JavaType ajavatype[], String as1[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		String as2[] = as;
	//    2    4:aload_1         
	//    3    5:astore          7
		if(as == null)
	//*   4    7:aload_1         
	//*   5    8:ifnonnull       16
			as2 = NO_STRINGS;
	//    6   11:getstatic       #30  <Field String[] NO_STRINGS>
	//    7   14:astore          7
		_names = as2;
	//    8   16:aload_0         
	//    9   17:aload           7
	//   10   19:putfield        #45  <Field String[] _names>
		as = ((String []) (ajavatype));
	//   11   22:aload_2         
	//   12   23:astore_1        
		if(ajavatype == null)
	//*  13   24:aload_2         
	//*  14   25:ifnonnull       32
			as = ((String []) (NO_TYPES));
	//   15   28:getstatic       #34  <Field JavaType[] NO_TYPES>
	//   16   31:astore_1        
		_types = ((JavaType []) (as));
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:putfield        #47  <Field JavaType[] _types>
		if(_names.length != _types.length)
	//*  20   37:aload_0         
	//*  21   38:getfield        #45  <Field String[] _names>
	//*  22   41:arraylength     
	//*  23   42:aload_0         
	//*  24   43:getfield        #47  <Field JavaType[] _types>
	//*  25   46:arraylength     
	//*  26   47:icmpeq          99
			throw new IllegalArgumentException((new StringBuilder()).append("Mismatching names (").append(_names.length).append("), types (").append(_types.length).append(")").toString());
	//   27   50:new             #49  <Class IllegalArgumentException>
	//   28   53:dup             
	//   29   54:new             #51  <Class StringBuilder>
	//   30   57:dup             
	//   31   58:invokespecial   #52  <Method void StringBuilder()>
	//   32   61:ldc1            #54  <String "Mismatching names (">
	//   33   63:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   34   66:aload_0         
	//   35   67:getfield        #45  <Field String[] _names>
	//   36   70:arraylength     
	//   37   71:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//   38   74:ldc1            #63  <String "), types (">
	//   39   76:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   40   79:aload_0         
	//   41   80:getfield        #47  <Field JavaType[] _types>
	//   42   83:arraylength     
	//   43   84:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//   44   87:ldc1            #65  <String ")">
	//   45   89:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   46   92:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   47   95:invokespecial   #72  <Method void IllegalArgumentException(String)>
	//   48   98:athrow          
		int j = 1;
	//   49   99:iconst_1        
	//   50  100:istore          5
		int i = 0;
	//   51  102:iconst_0        
	//   52  103:istore          4
		for(int k = _types.length; i < k; i++)
	//*  53  105:aload_0         
	//*  54  106:getfield        #47  <Field JavaType[] _types>
	//*  55  109:arraylength     
	//*  56  110:istore          6
	//*  57  112:iload           4
	//*  58  114:iload           6
	//*  59  116:icmpge          143
			j += _types[i].hashCode();
	//   60  119:iload           5
	//   61  121:aload_0         
	//   62  122:getfield        #47  <Field JavaType[] _types>
	//   63  125:iload           4
	//   64  127:aaload          
	//   65  128:invokevirtual   #76  <Method int JavaType.hashCode()>
	//   66  131:iadd            
	//   67  132:istore          5

	//   68  134:iload           4
	//   69  136:iconst_1        
	//   70  137:iadd            
	//   71  138:istore          4
	//*  72  140:goto            112
		_unboundVariables = as1;
	//   73  143:aload_0         
	//   74  144:aload_3         
	//   75  145:putfield        #78  <Field String[] _unboundVariables>
		_hashCode = j;
	//   76  148:aload_0         
	//   77  149:iload           5
	//   78  151:putfield        #80  <Field int _hashCode>
	//   79  154:return          
	}

	public static TypeBindings create(Class class1, JavaType javatype)
	{
		TypeVariable atypevariable[] = TypeParamStash.paramsFor1(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #86  <Method TypeVariable[] TypeBindings$TypeParamStash.paramsFor1(Class)>
	//    2    4:astore_3        
		int i;
		if(atypevariable == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       55
			i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		else
	//*   7   11:iload_2         
	//*   8   12:iconst_1        
	//*   9   13:icmpeq          61
	//*  10   16:new             #49  <Class IllegalArgumentException>
	//*  11   19:dup             
	//*  12   20:new             #51  <Class StringBuilder>
	//*  13   23:dup             
	//*  14   24:invokespecial   #52  <Method void StringBuilder()>
	//*  15   27:ldc1            #88  <String "Can not create TypeBindings for class ">
	//*  16   29:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  17   32:aload_0         
	//*  18   33:invokevirtual   #93  <Method String Class.getName()>
	//*  19   36:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  20   39:ldc1            #95  <String " with 1 type parameter: class expects ">
	//*  21   41:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  22   44:iload_2         
	//*  23   45:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//*  24   48:invokevirtual   #69  <Method String StringBuilder.toString()>
	//*  25   51:invokespecial   #72  <Method void IllegalArgumentException(String)>
	//*  26   54:athrow          
			i = atypevariable.length;
	//   27   55:aload_3         
	//   28   56:arraylength     
	//   29   57:istore_2        
		if(i != 1)
			throw new IllegalArgumentException((new StringBuilder()).append("Can not create TypeBindings for class ").append(class1.getName()).append(" with 1 type parameter: class expects ").append(i).toString());
		else
	//*  30   58:goto            11
			return new TypeBindings(new String[] {
				atypevariable[0].getName()
			}, new JavaType[] {
				javatype
			}, ((String []) (null)));
	//   31   61:new             #2   <Class TypeBindings>
	//   32   64:dup             
	//   33   65:iconst_1        
	//   34   66:anewarray       String[]
	//   35   69:dup             
	//   36   70:iconst_0        
	//   37   71:aload_3         
	//   38   72:iconst_0        
	//   39   73:aaload          
	//   40   74:invokeinterface #98  <Method String TypeVariable.getName()>
	//   41   79:aastore         
	//   42   80:iconst_1        
	//   43   81:anewarray       JavaType[]
	//   44   84:dup             
	//   45   85:iconst_0        
	//   46   86:aload_1         
	//   47   87:aastore         
	//   48   88:aconst_null     
	//   49   89:invokespecial   #38  <Method void TypeBindings(String[], JavaType[], String[])>
	//   50   92:areturn         
	}

	public static TypeBindings create(Class class1, JavaType javatype, JavaType javatype1)
	{
		TypeVariable atypevariable[] = TypeParamStash.paramsFor2(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #104 <Method TypeVariable[] TypeBindings$TypeParamStash.paramsFor2(Class)>
	//    2    4:astore          4
		int i;
		if(atypevariable == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       57
			i = 0;
	//    5   11:iconst_0        
	//    6   12:istore_3        
		else
	//*   7   13:iload_3         
	//*   8   14:iconst_2        
	//*   9   15:icmpeq          64
	//*  10   18:new             #49  <Class IllegalArgumentException>
	//*  11   21:dup             
	//*  12   22:new             #51  <Class StringBuilder>
	//*  13   25:dup             
	//*  14   26:invokespecial   #52  <Method void StringBuilder()>
	//*  15   29:ldc1            #88  <String "Can not create TypeBindings for class ">
	//*  16   31:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  17   34:aload_0         
	//*  18   35:invokevirtual   #93  <Method String Class.getName()>
	//*  19   38:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  20   41:ldc1            #106 <String " with 2 type parameters: class expects ">
	//*  21   43:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  22   46:iload_3         
	//*  23   47:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//*  24   50:invokevirtual   #69  <Method String StringBuilder.toString()>
	//*  25   53:invokespecial   #72  <Method void IllegalArgumentException(String)>
	//*  26   56:athrow          
			i = atypevariable.length;
	//   27   57:aload           4
	//   28   59:arraylength     
	//   29   60:istore_3        
		if(i != 2)
			throw new IllegalArgumentException((new StringBuilder()).append("Can not create TypeBindings for class ").append(class1.getName()).append(" with 2 type parameters: class expects ").append(i).toString());
		else
	//*  30   61:goto            13
			return new TypeBindings(new String[] {
				atypevariable[0].getName(), atypevariable[1].getName()
			}, new JavaType[] {
				javatype, javatype1
			}, ((String []) (null)));
	//   31   64:new             #2   <Class TypeBindings>
	//   32   67:dup             
	//   33   68:iconst_2        
	//   34   69:anewarray       String[]
	//   35   72:dup             
	//   36   73:iconst_0        
	//   37   74:aload           4
	//   38   76:iconst_0        
	//   39   77:aaload          
	//   40   78:invokeinterface #98  <Method String TypeVariable.getName()>
	//   41   83:aastore         
	//   42   84:dup             
	//   43   85:iconst_1        
	//   44   86:aload           4
	//   45   88:iconst_1        
	//   46   89:aaload          
	//   47   90:invokeinterface #98  <Method String TypeVariable.getName()>
	//   48   95:aastore         
	//   49   96:iconst_2        
	//   50   97:anewarray       JavaType[]
	//   51  100:dup             
	//   52  101:iconst_0        
	//   53  102:aload_1         
	//   54  103:aastore         
	//   55  104:dup             
	//   56  105:iconst_1        
	//   57  106:aload_2         
	//   58  107:aastore         
	//   59  108:aconst_null     
	//   60  109:invokespecial   #38  <Method void TypeBindings(String[], JavaType[], String[])>
	//   61  112:areturn         
	}

	public static TypeBindings create(Class class1, List list)
	{
		if(list == null || list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #114 <Method boolean List.isEmpty()>
	//*   4   10:ifeq            23
			list = ((List) (NO_TYPES));
	//    5   13:getstatic       #34  <Field JavaType[] NO_TYPES>
	//    6   16:astore_1        
		else
	//*   7   17:aload_0         
	//*   8   18:aload_1         
	//*   9   19:invokestatic    #117 <Method TypeBindings create(Class, JavaType[])>
	//*  10   22:areturn         
			list = ((List) ((JavaType[])list.toArray(((Object []) (new JavaType[list.size()])))));
	//   11   23:aload_1         
	//   12   24:aload_1         
	//   13   25:invokeinterface #120 <Method int List.size()>
	//   14   30:anewarray       JavaType[]
	//   15   33:invokeinterface #124 <Method Object[] List.toArray(Object[])>
	//   16   38:checkcast       #125 <Class JavaType[]>
	//   17   41:astore_1        
		return create(class1, ((JavaType []) (list)));
	//*  18   42:goto            17
	}

	public static TypeBindings create(Class class1, JavaType ajavatype[])
	{
		JavaType ajavatype1[];
		TypeVariable atypevariable[];
		StringBuilder stringbuilder;
		if(ajavatype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       112
			ajavatype1 = NO_TYPES;
	//    2    4:getstatic       #34  <Field JavaType[] NO_TYPES>
	//    3    7:astore          4
		else
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #130 <Method TypeVariable[] Class.getTypeParameters()>
	//*   6   13:astore          6
	//*   7   15:aload           6
	//*   8   17:ifnull          26
	//*   9   20:aload           6
	//*  10   22:arraylength     
	//*  11   23:ifne            161
	//*  12   26:getstatic       #30  <Field String[] NO_STRINGS>
	//*  13   29:astore_1        
	//*  14   30:aload_1         
	//*  15   31:arraylength     
	//*  16   32:aload           4
	//*  17   34:arraylength     
	//*  18   35:icmpeq          207
	//*  19   38:new             #51  <Class StringBuilder>
	//*  20   41:dup             
	//*  21   42:invokespecial   #52  <Method void StringBuilder()>
	//*  22   45:ldc1            #88  <String "Can not create TypeBindings for class ">
	//*  23   47:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  24   50:aload_0         
	//*  25   51:invokevirtual   #93  <Method String Class.getName()>
	//*  26   54:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  27   57:ldc1            #132 <String " with ">
	//*  28   59:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  29   62:aload           4
	//*  30   64:arraylength     
	//*  31   65:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//*  32   68:ldc1            #134 <String " type parameter">
	//*  33   70:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  34   73:astore          5
	//*  35   75:aload           4
	//*  36   77:arraylength     
	//*  37   78:iconst_1        
	//*  38   79:icmpne          201
	//*  39   82:ldc1            #136 <String "">
	//*  40   84:astore_0        
	//*  41   85:new             #49  <Class IllegalArgumentException>
	//*  42   88:dup             
	//*  43   89:aload           5
	//*  44   91:aload_0         
	//*  45   92:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  46   95:ldc1            #138 <String ": class expects ">
	//*  47   97:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  48  100:aload_1         
	//*  49  101:arraylength     
	//*  50  102:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//*  51  105:invokevirtual   #69  <Method String StringBuilder.toString()>
	//*  52  108:invokespecial   #72  <Method void IllegalArgumentException(String)>
	//*  53  111:athrow          
			switch(ajavatype.length)
	//*  54  112:aload_1         
	//*  55  113:arraylength     
			{
	//*  56  114:tableswitch     1 2: default 136
	//	               1 142
	//	               2 150
			default:
				ajavatype1 = ajavatype;
	//   57  136:aload_1         
	//   58  137:astore          4
				break;

	//*  59  139:goto            9
			case 1: // '\001'
				return create(class1, ajavatype[0]);
	//   60  142:aload_0         
	//   61  143:aload_1         
	//   62  144:iconst_0        
	//   63  145:aaload          
	//   64  146:invokestatic    #140 <Method TypeBindings create(Class, JavaType)>
	//   65  149:areturn         

			case 2: // '\002'
				return create(class1, ajavatype[0], ajavatype[1]);
	//   66  150:aload_0         
	//   67  151:aload_1         
	//   68  152:iconst_0        
	//   69  153:aaload          
	//   70  154:aload_1         
	//   71  155:iconst_1        
	//   72  156:aaload          
	//   73  157:invokestatic    #142 <Method TypeBindings create(Class, JavaType, JavaType)>
	//   74  160:areturn         
			}
		atypevariable = class1.getTypeParameters();
		if(atypevariable != null && atypevariable.length != 0) goto _L2; else goto _L1
_L1:
		ajavatype = ((JavaType []) (NO_STRINGS));
_L4:
		if(ajavatype.length != ajavatype1.length)
		{
			stringbuilder = (new StringBuilder()).append("Can not create TypeBindings for class ").append(class1.getName()).append(" with ").append(ajavatype1.length).append(" type parameter");
			int i;
			int j;
			String as[];
			if(ajavatype1.length == 1)
				class1 = "";
			else
	//*  75  161:aload           6
	//*  76  163:arraylength     
	//*  77  164:istore_3        
	//*  78  165:iload_3         
	//*  79  166:anewarray       String[]
	//*  80  169:astore          5
	//*  81  171:iconst_0        
	//*  82  172:istore_2        
	//*  83  173:aload           5
	//*  84  175:astore_1        
	//*  85  176:iload_2         
	//*  86  177:iload_3         
	//*  87  178:icmpge          30
	//*  88  181:aload           5
	//*  89  183:iload_2         
	//*  90  184:aload           6
	//*  91  186:iload_2         
	//*  92  187:aaload          
	//*  93  188:invokeinterface #98  <Method String TypeVariable.getName()>
	//*  94  193:aastore         
	//*  95  194:iload_2         
	//*  96  195:iconst_1        
	//*  97  196:iadd            
	//*  98  197:istore_2        
	//*  99  198:goto            173
				class1 = "s";
	//  100  201:ldc1            #144 <String "s">
	//  101  203:astore_0        
			throw new IllegalArgumentException(stringbuilder.append(((String) (class1))).append(": class expects ").append(ajavatype.length).toString());
		} else
	//* 102  204:goto            85
		{
			return new TypeBindings(((String []) (ajavatype)), ajavatype1, ((String []) (null)));
	//  103  207:new             #2   <Class TypeBindings>
	//  104  210:dup             
	//  105  211:aload_1         
	//  106  212:aload           4
	//  107  214:aconst_null     
	//  108  215:invokespecial   #38  <Method void TypeBindings(String[], JavaType[], String[])>
	//  109  218:areturn         
		}
_L2:
		j = atypevariable.length;
		as = new String[j];
		i = 0;
_L5:
		ajavatype = ((JavaType []) (as));
		if(i >= j) goto _L4; else goto _L3
_L3:
		as[i] = atypevariable[i].getName();
		i++;
		  goto _L5
	}

	public static TypeBindings createIfNeeded(Class class1, JavaType javatype)
	{
		TypeVariable atypevariable[] = class1.getTypeParameters();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #130 <Method TypeVariable[] Class.getTypeParameters()>
	//    2    4:astore_3        
		int i;
		if(atypevariable == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       19
			i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		else
	//*   7   11:iload_2         
	//*   8   12:ifne            25
	//*   9   15:getstatic       #40  <Field TypeBindings EMPTY>
	//*  10   18:areturn         
			i = atypevariable.length;
	//   11   19:aload_3         
	//   12   20:arraylength     
	//   13   21:istore_2        
		if(i == 0)
			return EMPTY;
	//*  14   22:goto            11
		if(i != 1)
	//*  15   25:iload_2         
	//*  16   26:iconst_1        
	//*  17   27:icmpeq          69
			throw new IllegalArgumentException((new StringBuilder()).append("Can not create TypeBindings for class ").append(class1.getName()).append(" with 1 type parameter: class expects ").append(i).toString());
	//   18   30:new             #49  <Class IllegalArgumentException>
	//   19   33:dup             
	//   20   34:new             #51  <Class StringBuilder>
	//   21   37:dup             
	//   22   38:invokespecial   #52  <Method void StringBuilder()>
	//   23   41:ldc1            #88  <String "Can not create TypeBindings for class ">
	//   24   43:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:aload_0         
	//   26   47:invokevirtual   #93  <Method String Class.getName()>
	//   27   50:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   28   53:ldc1            #95  <String " with 1 type parameter: class expects ">
	//   29   55:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   30   58:iload_2         
	//   31   59:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//   32   62:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   33   65:invokespecial   #72  <Method void IllegalArgumentException(String)>
	//   34   68:athrow          
		else
			return new TypeBindings(new String[] {
				atypevariable[0].getName()
			}, new JavaType[] {
				javatype
			}, ((String []) (null)));
	//   35   69:new             #2   <Class TypeBindings>
	//   36   72:dup             
	//   37   73:iconst_1        
	//   38   74:anewarray       String[]
	//   39   77:dup             
	//   40   78:iconst_0        
	//   41   79:aload_3         
	//   42   80:iconst_0        
	//   43   81:aaload          
	//   44   82:invokeinterface #98  <Method String TypeVariable.getName()>
	//   45   87:aastore         
	//   46   88:iconst_1        
	//   47   89:anewarray       JavaType[]
	//   48   92:dup             
	//   49   93:iconst_0        
	//   50   94:aload_1         
	//   51   95:aastore         
	//   52   96:aconst_null     
	//   53   97:invokespecial   #38  <Method void TypeBindings(String[], JavaType[], String[])>
	//   54  100:areturn         
	}

	public static TypeBindings createIfNeeded(Class class1, JavaType ajavatype[])
	{
		TypeVariable atypevariable[] = class1.getTypeParameters();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #130 <Method TypeVariable[] Class.getTypeParameters()>
	//    2    4:astore          5
		if(atypevariable == null || atypevariable.length == 0)
	//*   3    6:aload           5
	//*   4    8:ifnull          17
	//*   5   11:aload           5
	//*   6   13:arraylength     
	//*   7   14:ifne            21
			return EMPTY;
	//    8   17:getstatic       #40  <Field TypeBindings EMPTY>
	//    9   20:areturn         
		JavaType ajavatype1[] = ajavatype;
	//   10   21:aload_1         
	//   11   22:astore          4
		if(ajavatype == null)
	//*  12   24:aload_1         
	//*  13   25:ifnonnull       33
			ajavatype1 = NO_TYPES;
	//   14   28:getstatic       #34  <Field JavaType[] NO_TYPES>
	//   15   31:astore          4
		int j = atypevariable.length;
	//   16   33:aload           5
	//   17   35:arraylength     
	//   18   36:istore_3        
		ajavatype = ((JavaType []) (new String[j]));
	//   19   37:iload_3         
	//   20   38:anewarray       String[]
	//   21   41:astore_1        
		for(int i = 0; i < j; i++)
	//*  22   42:iconst_0        
	//*  23   43:istore_2        
	//*  24   44:iload_2         
	//*  25   45:iload_3         
	//*  26   46:icmpge          68
			ajavatype[i] = ((JavaType) (atypevariable[i].getName()));
	//   27   49:aload_1         
	//   28   50:iload_2         
	//   29   51:aload           5
	//   30   53:iload_2         
	//   31   54:aaload          
	//   32   55:invokeinterface #98  <Method String TypeVariable.getName()>
	//   33   60:aastore         

	//   34   61:iload_2         
	//   35   62:iconst_1        
	//   36   63:iadd            
	//   37   64:istore_2        
	//*  38   65:goto            44
		if(ajavatype.length != ajavatype1.length)
	//*  39   68:aload_1         
	//*  40   69:arraylength     
	//*  41   70:aload           4
	//*  42   72:arraylength     
	//*  43   73:icmpeq          156
		{
			StringBuilder stringbuilder = (new StringBuilder()).append("Can not create TypeBindings for class ").append(class1.getName()).append(" with ").append(ajavatype1.length).append(" type parameter");
	//   44   76:new             #51  <Class StringBuilder>
	//   45   79:dup             
	//   46   80:invokespecial   #52  <Method void StringBuilder()>
	//   47   83:ldc1            #88  <String "Can not create TypeBindings for class ">
	//   48   85:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   49   88:aload_0         
	//   50   89:invokevirtual   #93  <Method String Class.getName()>
	//   51   92:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   52   95:ldc1            #132 <String " with ">
	//   53   97:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   54  100:aload           4
	//   55  102:arraylength     
	//   56  103:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//   57  106:ldc1            #134 <String " type parameter">
	//   58  108:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   59  111:astore          5
			if(ajavatype1.length == 1)
	//*  60  113:aload           4
	//*  61  115:arraylength     
	//*  62  116:iconst_1        
	//*  63  117:icmpne          150
				class1 = "";
	//   64  120:ldc1            #136 <String "">
	//   65  122:astore_0        
			else
	//*  66  123:new             #49  <Class IllegalArgumentException>
	//*  67  126:dup             
	//*  68  127:aload           5
	//*  69  129:aload_0         
	//*  70  130:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  71  133:ldc1            #138 <String ": class expects ">
	//*  72  135:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  73  138:aload_1         
	//*  74  139:arraylength     
	//*  75  140:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//*  76  143:invokevirtual   #69  <Method String StringBuilder.toString()>
	//*  77  146:invokespecial   #72  <Method void IllegalArgumentException(String)>
	//*  78  149:athrow          
				class1 = "s";
	//   79  150:ldc1            #144 <String "s">
	//   80  152:astore_0        
			throw new IllegalArgumentException(stringbuilder.append(((String) (class1))).append(": class expects ").append(ajavatype.length).toString());
		} else
	//*  81  153:goto            123
		{
			return new TypeBindings(((String []) (ajavatype)), ajavatype1, ((String []) (null)));
	//   82  156:new             #2   <Class TypeBindings>
	//   83  159:dup             
	//   84  160:aload_1         
	//   85  161:aload           4
	//   86  163:aconst_null     
	//   87  164:invokespecial   #38  <Method void TypeBindings(String[], JavaType[], String[])>
	//   88  167:areturn         
		}
	}

	public static TypeBindings emptyBindings()
	{
		return EMPTY;
	//    0    0:getstatic       #40  <Field TypeBindings EMPTY>
	//    1    3:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(obj == null || obj.getClass() != ((Object)this).getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          22
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #154 <Method Class Object.getClass()>
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #154 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((TypeBindings)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class TypeBindings>
	//   16   28:astore_1        
			int j = _types.length;
	//   17   29:aload_0         
	//   18   30:getfield        #47  <Field JavaType[] _types>
	//   19   33:arraylength     
	//   20   34:istore_3        
			if(j != ((TypeBindings) (obj)).size())
	//*  21   35:iload_3         
	//*  22   36:aload_1         
	//*  23   37:invokevirtual   #155 <Method int size()>
	//*  24   40:icmpeq          45
				return false;
	//   25   43:iconst_0        
	//   26   44:ireturn         
			obj = ((Object) (((TypeBindings) (obj))._types));
	//   27   45:aload_1         
	//   28   46:getfield        #47  <Field JavaType[] _types>
	//   29   49:astore_1        
			int i = 0;
	//   30   50:iconst_0        
	//   31   51:istore_2        
			while(i < j) 
	//*  32   52:iload_2         
	//*  33   53:iload_3         
	//*  34   54:icmpge          5
			{
				if(!((JavaType) (obj[i])).equals(((Object) (_types[i]))))
	//*  35   57:aload_1         
	//*  36   58:iload_2         
	//*  37   59:aaload          
	//*  38   60:aload_0         
	//*  39   61:getfield        #47  <Field JavaType[] _types>
	//*  40   64:iload_2         
	//*  41   65:aaload          
	//*  42   66:invokevirtual   #157 <Method boolean JavaType.equals(Object)>
	//*  43   69:ifne            74
					return false;
	//   44   72:iconst_0        
	//   45   73:ireturn         
				i++;
	//   46   74:iload_2         
	//   47   75:iconst_1        
	//   48   76:iadd            
	//   49   77:istore_2        
			}
		}
		return true;
	//*  50   78:goto            52
	}

	public JavaType findBoundType(String s)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int j = _names.length; i < j; i++)
	//*   2    2:aload_0         
	//*   3    3:getfield        #45  <Field String[] _names>
	//*   4    6:arraylength     
	//*   5    7:istore_3        
	//*   6    8:iload_2         
	//*   7    9:iload_3         
	//*   8   10:icmpge          75
			if(s.equals(((Object) (_names[i]))))
	//*   9   13:aload_1         
	//*  10   14:aload_0         
	//*  11   15:getfield        #45  <Field String[] _names>
	//*  12   18:iload_2         
	//*  13   19:aaload          
	//*  14   20:invokevirtual   #160 <Method boolean String.equals(Object)>
	//*  15   23:ifeq            68
			{
				JavaType javatype = _types[i];
	//   16   26:aload_0         
	//   17   27:getfield        #47  <Field JavaType[] _types>
	//   18   30:iload_2         
	//   19   31:aaload          
	//   20   32:astore          4
				s = ((String) (javatype));
	//   21   34:aload           4
	//   22   36:astore_1        
				if(javatype instanceof ResolvedRecursiveType)
	//*  23   37:aload           4
	//*  24   39:instanceof      #162 <Class ResolvedRecursiveType>
	//*  25   42:ifeq            66
				{
					JavaType javatype1 = ((ResolvedRecursiveType)javatype).getSelfReferencedType();
	//   26   45:aload           4
	//   27   47:checkcast       #162 <Class ResolvedRecursiveType>
	//   28   50:invokevirtual   #166 <Method JavaType ResolvedRecursiveType.getSelfReferencedType()>
	//   29   53:astore          5
					s = ((String) (javatype));
	//   30   55:aload           4
	//   31   57:astore_1        
					if(javatype1 != null)
	//*  32   58:aload           5
	//*  33   60:ifnull          66
						s = ((String) (javatype1));
	//   34   63:aload           5
	//   35   65:astore_1        
				}
				return ((JavaType) (s));
	//   36   66:aload_1         
	//   37   67:areturn         
			}

	//   38   68:iload_2         
	//   39   69:iconst_1        
	//   40   70:iadd            
	//   41   71:istore_2        
	//*  42   72:goto            8
		return null;
	//   43   75:aconst_null     
	//   44   76:areturn         
	}

	public String getBoundName(int i)
	{
		if(i < 0 || i >= _names.length)
	//*   0    0:iload_1         
	//*   1    1:iflt            13
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #45  <Field String[] _names>
	//*   5    9:arraylength     
	//*   6   10:icmplt          15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		else
			return _names[i];
	//    9   15:aload_0         
	//   10   16:getfield        #45  <Field String[] _names>
	//   11   19:iload_1         
	//   12   20:aaload          
	//   13   21:areturn         
	}

	public JavaType getBoundType(int i)
	{
		if(i < 0 || i >= _types.length)
	//*   0    0:iload_1         
	//*   1    1:iflt            13
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #47  <Field JavaType[] _types>
	//*   5    9:arraylength     
	//*   6   10:icmplt          15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		else
			return _types[i];
	//    9   15:aload_0         
	//   10   16:getfield        #47  <Field JavaType[] _types>
	//   11   19:iload_1         
	//   12   20:aaload          
	//   13   21:areturn         
	}

	public List getTypeParameters()
	{
		if(_types.length == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field JavaType[] _types>
	//*   2    4:arraylength     
	//*   3    5:ifne            12
			return Collections.emptyList();
	//    4    8:invokestatic    #176 <Method List Collections.emptyList()>
	//    5   11:areturn         
		else
			return Arrays.asList(((Object []) (_types)));
	//    6   12:aload_0         
	//    7   13:getfield        #47  <Field JavaType[] _types>
	//    8   16:invokestatic    #182 <Method List Arrays.asList(Object[])>
	//    9   19:areturn         
	}

	public boolean hasUnbound(String s)
	{
label0:
		{
			if(_unboundVariables == null)
				break label0;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field String[] _unboundVariables>
	//    2    4:ifnull          38
			int i = _unboundVariables.length;
	//    3    7:aload_0         
	//    4    8:getfield        #78  <Field String[] _unboundVariables>
	//    5   11:arraylength     
	//    6   12:istore_2        
			int j;
			do
			{
				j = i - 1;
	//    7   13:iload_2         
	//    8   14:iconst_1        
	//    9   15:isub            
	//   10   16:istore_3        
				if(j < 0)
					break label0;
	//   11   17:iload_3         
	//   12   18:iflt            38
				i = j;
	//   13   21:iload_3         
	//   14   22:istore_2        
			} while(!s.equals(((Object) (_unboundVariables[j]))));
	//   15   23:aload_1         
	//   16   24:aload_0         
	//   17   25:getfield        #78  <Field String[] _unboundVariables>
	//   18   28:iload_3         
	//   19   29:aaload          
	//   20   30:invokevirtual   #160 <Method boolean String.equals(Object)>
	//   21   33:ifeq            13
			return true;
	//   22   36:iconst_1        
	//   23   37:ireturn         
		}
		return false;
	//   24   38:iconst_0        
	//   25   39:ireturn         
	}

	public int hashCode()
	{
		return _hashCode;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field int _hashCode>
	//    2    4:ireturn         
	}

	public boolean isEmpty()
	{
		return _types.length == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field JavaType[] _types>
	//    2    4:arraylength     
	//    3    5:ifne            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	protected Object readResolve()
	{
		TypeBindings typebindings;
label0:
		{
			if(_names != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field String[] _names>
	//*   2    4:ifnull          17
			{
				typebindings = this;
	//    3    7:aload_0         
	//    4    8:astore_1        
				if(_names.length != 0)
					break label0;
	//    5    9:aload_0         
	//    6   10:getfield        #45  <Field String[] _names>
	//    7   13:arraylength     
	//    8   14:ifne            21
			}
			typebindings = EMPTY;
	//    9   17:getstatic       #40  <Field TypeBindings EMPTY>
	//   10   20:astore_1        
		}
		return ((Object) (typebindings));
	//   11   21:aload_1         
	//   12   22:areturn         
	}

	public int size()
	{
		return _types.length;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field JavaType[] _types>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public String toString()
	{
		if(_types.length == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field JavaType[] _types>
	//*   2    4:arraylength     
	//*   3    5:ifne            11
			return "";
	//    4    8:ldc1            #136 <String "">
	//    5   10:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//    6   11:new             #51  <Class StringBuilder>
	//    7   14:dup             
	//    8   15:invokespecial   #52  <Method void StringBuilder()>
	//    9   18:astore_3        
		stringbuilder.append('<');
	//   10   19:aload_3         
	//   11   20:bipush          60
	//   12   22:invokevirtual   #190 <Method StringBuilder StringBuilder.append(char)>
	//   13   25:pop             
		int i = 0;
	//   14   26:iconst_0        
	//   15   27:istore_1        
		for(int j = _types.length; i < j; i++)
	//*  16   28:aload_0         
	//*  17   29:getfield        #47  <Field JavaType[] _types>
	//*  18   32:arraylength     
	//*  19   33:istore_2        
	//*  20   34:iload_1         
	//*  21   35:iload_2         
	//*  22   36:icmpge          71
		{
			if(i > 0)
	//*  23   39:iload_1         
	//*  24   40:ifle            50
				stringbuilder.append(',');
	//   25   43:aload_3         
	//   26   44:bipush          44
	//   27   46:invokevirtual   #190 <Method StringBuilder StringBuilder.append(char)>
	//   28   49:pop             
			stringbuilder.append(_types[i].getGenericSignature());
	//   29   50:aload_3         
	//   30   51:aload_0         
	//   31   52:getfield        #47  <Field JavaType[] _types>
	//   32   55:iload_1         
	//   33   56:aaload          
	//   34   57:invokevirtual   #193 <Method String JavaType.getGenericSignature()>
	//   35   60:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   36   63:pop             
		}

	//   37   64:iload_1         
	//   38   65:iconst_1        
	//   39   66:iadd            
	//   40   67:istore_1        
	//*  41   68:goto            34
		stringbuilder.append('>');
	//   42   71:aload_3         
	//   43   72:bipush          62
	//   44   74:invokevirtual   #190 <Method StringBuilder StringBuilder.append(char)>
	//   45   77:pop             
		return stringbuilder.toString();
	//   46   78:aload_3         
	//   47   79:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   48   82:areturn         
	}

	protected JavaType[] typeParameterArray()
	{
		return _types;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field JavaType[] _types>
	//    2    4:areturn         
	}

	public TypeBindings withUnboundVariable(String s)
	{
		int i;
		String as[];
		if(_unboundVariables == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field String[] _unboundVariables>
	//*   2    4:ifnonnull       39
			i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_2        
		else
	//*   5    9:iload_2         
	//*   6   10:ifne            48
	//*   7   13:iconst_1        
	//*   8   14:anewarray       String[]
	//*   9   17:astore_3        
	//*  10   18:aload_3         
	//*  11   19:iload_2         
	//*  12   20:aload_1         
	//*  13   21:aastore         
	//*  14   22:new             #2   <Class TypeBindings>
	//*  15   25:dup             
	//*  16   26:aload_0         
	//*  17   27:getfield        #45  <Field String[] _names>
	//*  18   30:aload_0         
	//*  19   31:getfield        #47  <Field JavaType[] _types>
	//*  20   34:aload_3         
	//*  21   35:invokespecial   #38  <Method void TypeBindings(String[], JavaType[], String[])>
	//*  22   38:areturn         
			i = _unboundVariables.length;
	//   23   39:aload_0         
	//   24   40:getfield        #78  <Field String[] _unboundVariables>
	//   25   43:arraylength     
	//   26   44:istore_2        
		if(i == 0)
			as = new String[1];
		else
	//*  27   45:goto            9
			as = (String[])Arrays.copyOf(((Object []) (_unboundVariables)), i + 1);
	//   28   48:aload_0         
	//   29   49:getfield        #78  <Field String[] _unboundVariables>
	//   30   52:iload_2         
	//   31   53:iconst_1        
	//   32   54:iadd            
	//   33   55:invokestatic    #201 <Method Object[] Arrays.copyOf(Object[], int)>
	//   34   58:checkcast       #202 <Class String[]>
	//   35   61:astore_3        
		as[i] = s;
		return new TypeBindings(_names, _types, as);
	//*  36   62:goto            18
	}

	private static final TypeBindings EMPTY;
	private static final String NO_STRINGS[];
	private static final JavaType NO_TYPES[];
	private static final long serialVersionUID = 1L;
	private final int _hashCode;
	private final String _names[];
	private final JavaType _types[];
	private final String _unboundVariables[];

	static 
	{
		NO_STRINGS = new String[0];
	//    0    0:iconst_0        
	//    1    1:anewarray       String[]
	//    2    4:putstatic       #30  <Field String[] NO_STRINGS>
		NO_TYPES = new JavaType[0];
	//    3    7:iconst_0        
	//    4    8:anewarray       JavaType[]
	//    5   11:putstatic       #34  <Field JavaType[] NO_TYPES>
		EMPTY = new TypeBindings(NO_STRINGS, NO_TYPES, ((String []) (null)));
	//    6   14:new             #2   <Class TypeBindings>
	//    7   17:dup             
	//    8   18:getstatic       #30  <Field String[] NO_STRINGS>
	//    9   21:getstatic       #34  <Field JavaType[] NO_TYPES>
	//   10   24:aconst_null     
	//   11   25:invokespecial   #38  <Method void TypeBindings(String[], JavaType[], String[])>
	//   12   28:putstatic       #40  <Field TypeBindings EMPTY>
	//*  13   31:return          
	}
}
