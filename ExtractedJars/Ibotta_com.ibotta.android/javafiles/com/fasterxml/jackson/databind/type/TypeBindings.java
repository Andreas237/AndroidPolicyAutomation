// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			ResolvedRecursiveType

public class TypeBindings
	implements Serializable
{
	static final class AsKey
	{

		public boolean equals(Object obj)
		{
			if(obj == this)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(obj == null)
		//*   5    7:aload_1         
		//*   6    8:ifnonnull       13
				return false;
		//    7   11:iconst_0        
		//    8   12:ireturn         
			if(obj.getClass() != ((Object)this).getClass())
		//*   9   13:aload_1         
		//*  10   14:invokevirtual   #34  <Method Class Object.getClass()>
		//*  11   17:aload_0         
		//*  12   18:invokevirtual   #34  <Method Class Object.getClass()>
		//*  13   21:if_acmpeq       26
				return false;
		//   14   24:iconst_0        
		//   15   25:ireturn         
			obj = ((Object) ((AsKey)obj));
		//   16   26:aload_1         
		//   17   27:checkcast       #2   <Class TypeBindings$AsKey>
		//   18   30:astore_1        
			if(_hash == ((AsKey) (obj))._hash && _raw == ((AsKey) (obj))._raw)
		//*  19   31:aload_0         
		//*  20   32:getfield        #25  <Field int _hash>
		//*  21   35:aload_1         
		//*  22   36:getfield        #25  <Field int _hash>
		//*  23   39:icmpne          103
		//*  24   42:aload_0         
		//*  25   43:getfield        #21  <Field Class _raw>
		//*  26   46:aload_1         
		//*  27   47:getfield        #21  <Field Class _raw>
		//*  28   50:if_acmpne       103
			{
				obj = ((Object) (((AsKey) (obj))._params));
		//   29   53:aload_1         
		//   30   54:getfield        #23  <Field JavaType[] _params>
		//   31   57:astore_1        
				int j = _params.length;
		//   32   58:aload_0         
		//   33   59:getfield        #23  <Field JavaType[] _params>
		//   34   62:arraylength     
		//   35   63:istore_3        
				if(j == obj.length)
		//*  36   64:iload_3         
		//*  37   65:aload_1         
		//*  38   66:arraylength     
		//*  39   67:icmpne          103
				{
					for(int i = 0; i < j; i++)
		//*  40   70:iconst_0        
		//*  41   71:istore_2        
		//*  42   72:iload_2         
		//*  43   73:iload_3         
		//*  44   74:icmpge          101
						if(!_params[i].equals(((Object) (obj[i]))))
		//*  45   77:aload_0         
		//*  46   78:getfield        #23  <Field JavaType[] _params>
		//*  47   81:iload_2         
		//*  48   82:aaload          
		//*  49   83:aload_1         
		//*  50   84:iload_2         
		//*  51   85:aaload          
		//*  52   86:invokevirtual   #38  <Method boolean JavaType.equals(Object)>
		//*  53   89:ifne            94
							return false;
		//   54   92:iconst_0        
		//   55   93:ireturn         

		//   56   94:iload_2         
		//   57   95:iconst_1        
		//   58   96:iadd            
		//   59   97:istore_2        
		//*  60   98:goto            72
					return true;
		//   61  101:iconst_1        
		//   62  102:ireturn         
				}
			}
			return false;
		//   63  103:iconst_0        
		//   64  104:ireturn         
		}

		public int hashCode()
		{
			return _hash;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field int _hash>
		//    2    4:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #44  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #45  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append(_raw.getName());
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #21  <Field Class _raw>
		//    7   13:invokevirtual   #50  <Method String Class.getName()>
		//    8   16:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//    9   19:pop             
			stringbuilder.append("<>");
		//   10   20:aload_1         
		//   11   21:ldc1            #56  <String "<>">
		//   12   23:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			return stringbuilder.toString();
		//   14   27:aload_1         
		//   15   28:invokevirtual   #58  <Method String StringBuilder.toString()>
		//   16   31:areturn         
		}

		private final int _hash;
		private final JavaType _params[];
		private final Class _raw;

		public AsKey(Class class1, JavaType ajavatype[], int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			_raw = class1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field Class _raw>
			_params = ajavatype;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field JavaType[] _params>
			_hash = i;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #25  <Field int _hash>
		//   11   19:return          
		}
	}

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
	}


	private TypeBindings(String as[], JavaType ajavatype[], String as1[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		String as2[] = as;
	//    2    4:aload_1         
	//    3    5:astore          7
		if(as == null)
	//*   4    7:aload_1         
	//*   5    8:ifnonnull       16
			as2 = NO_STRINGS;
	//    6   11:getstatic       #33  <Field String[] NO_STRINGS>
	//    7   14:astore          7
		_names = as2;
	//    8   16:aload_0         
	//    9   17:aload           7
	//   10   19:putfield        #48  <Field String[] _names>
		as = ((String []) (ajavatype));
	//   11   22:aload_2         
	//   12   23:astore_1        
		if(ajavatype == null)
	//*  13   24:aload_2         
	//*  14   25:ifnonnull       32
			as = ((String []) (NO_TYPES));
	//   15   28:getstatic       #37  <Field JavaType[] NO_TYPES>
	//   16   31:astore_1        
		_types = ((JavaType []) (as));
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:putfield        #50  <Field JavaType[] _types>
		int i = _names.length;
	//   20   37:aload_0         
	//   21   38:getfield        #48  <Field String[] _names>
	//   22   41:arraylength     
	//   23   42:istore          4
		as = ((String []) (_types));
	//   24   44:aload_0         
	//   25   45:getfield        #50  <Field JavaType[] _types>
	//   26   48:astore_1        
		if(i == as.length)
	//*  27   49:iload           4
	//*  28   51:aload_1         
	//*  29   52:arraylength     
	//*  30   53:icmpne          109
		{
			int j = 0;
	//   31   56:iconst_0        
	//   32   57:istore          4
			int l = as.length;
	//   33   59:aload_1         
	//   34   60:arraylength     
	//   35   61:istore          6
			int k = 1;
	//   36   63:iconst_1        
	//   37   64:istore          5
			for(; j < l; j++)
	//*  38   66:iload           4
	//*  39   68:iload           6
	//*  40   70:icmpge          97
				k += _types[j].hashCode();
	//   41   73:iload           5
	//   42   75:aload_0         
	//   43   76:getfield        #50  <Field JavaType[] _types>
	//   44   79:iload           4
	//   45   81:aaload          
	//   46   82:invokevirtual   #54  <Method int JavaType.hashCode()>
	//   47   85:iadd            
	//   48   86:istore          5

	//   49   88:iload           4
	//   50   90:iconst_1        
	//   51   91:iadd            
	//   52   92:istore          4
	//*  53   94:goto            66
			_unboundVariables = as1;
	//   54   97:aload_0         
	//   55   98:aload_3         
	//   56   99:putfield        #56  <Field String[] _unboundVariables>
			_hashCode = k;
	//   57  102:aload_0         
	//   58  103:iload           5
	//   59  105:putfield        #58  <Field int _hashCode>
			return;
	//   60  108:return          
		} else
		{
			as = ((String []) (new StringBuilder()));
	//   61  109:new             #60  <Class StringBuilder>
	//   62  112:dup             
	//   63  113:invokespecial   #61  <Method void StringBuilder()>
	//   64  116:astore_1        
			((StringBuilder) (as)).append("Mismatching names (");
	//   65  117:aload_1         
	//   66  118:ldc1            #63  <String "Mismatching names (">
	//   67  120:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   68  123:pop             
			((StringBuilder) (as)).append(_names.length);
	//   69  124:aload_1         
	//   70  125:aload_0         
	//   71  126:getfield        #48  <Field String[] _names>
	//   72  129:arraylength     
	//   73  130:invokevirtual   #70  <Method StringBuilder StringBuilder.append(int)>
	//   74  133:pop             
			((StringBuilder) (as)).append("), types (");
	//   75  134:aload_1         
	//   76  135:ldc1            #72  <String "), types (">
	//   77  137:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   78  140:pop             
			((StringBuilder) (as)).append(_types.length);
	//   79  141:aload_1         
	//   80  142:aload_0         
	//   81  143:getfield        #50  <Field JavaType[] _types>
	//   82  146:arraylength     
	//   83  147:invokevirtual   #70  <Method StringBuilder StringBuilder.append(int)>
	//   84  150:pop             
			((StringBuilder) (as)).append(")");
	//   85  151:aload_1         
	//   86  152:ldc1            #74  <String ")">
	//   87  154:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   88  157:pop             
			throw new IllegalArgumentException(((StringBuilder) (as)).toString());
	//   89  158:new             #76  <Class IllegalArgumentException>
	//   90  161:dup             
	//   91  162:aload_1         
	//   92  163:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   93  166:invokespecial   #83  <Method void IllegalArgumentException(String)>
	//   94  169:athrow          
		}
	}

	public static TypeBindings create(Class class1, JavaType javatype)
	{
		TypeVariable atypevariable[] = TypeParamStash.paramsFor1(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #89  <Method TypeVariable[] TypeBindings$TypeParamStash.paramsFor1(Class)>
	//    2    4:astore_3        
		int i;
		if(atypevariable == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       14
			i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		else
	//*   7   11:goto            17
			i = atypevariable.length;
	//    8   14:aload_3         
	//    9   15:arraylength     
	//   10   16:istore_2        
		if(i == 1)
	//*  11   17:iload_2         
	//*  12   18:iconst_1        
	//*  13   19:icmpne          54
		{
			return new TypeBindings(new String[] {
				atypevariable[0].getName()
			}, new JavaType[] {
				javatype
			}, ((String []) (null)));
	//   14   22:new             #2   <Class TypeBindings>
	//   15   25:dup             
	//   16   26:iconst_1        
	//   17   27:anewarray       String[]
	//   18   30:dup             
	//   19   31:iconst_0        
	//   20   32:aload_3         
	//   21   33:iconst_0        
	//   22   34:aaload          
	//   23   35:invokeinterface #94  <Method String TypeVariable.getName()>
	//   24   40:aastore         
	//   25   41:iconst_1        
	//   26   42:anewarray       JavaType[]
	//   27   45:dup             
	//   28   46:iconst_0        
	//   29   47:aload_1         
	//   30   48:aastore         
	//   31   49:aconst_null     
	//   32   50:invokespecial   #41  <Method void TypeBindings(String[], JavaType[], String[])>
	//   33   53:areturn         
		} else
		{
			javatype = ((JavaType) (new StringBuilder()));
	//   34   54:new             #60  <Class StringBuilder>
	//   35   57:dup             
	//   36   58:invokespecial   #61  <Method void StringBuilder()>
	//   37   61:astore_1        
			((StringBuilder) (javatype)).append("Cannot create TypeBindings for class ");
	//   38   62:aload_1         
	//   39   63:ldc1            #96  <String "Cannot create TypeBindings for class ">
	//   40   65:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   41   68:pop             
			((StringBuilder) (javatype)).append(class1.getName());
	//   42   69:aload_1         
	//   43   70:aload_0         
	//   44   71:invokevirtual   #99  <Method String Class.getName()>
	//   45   74:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   46   77:pop             
			((StringBuilder) (javatype)).append(" with 1 type parameter: class expects ");
	//   47   78:aload_1         
	//   48   79:ldc1            #101 <String " with 1 type parameter: class expects ">
	//   49   81:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   50   84:pop             
			((StringBuilder) (javatype)).append(i);
	//   51   85:aload_1         
	//   52   86:iload_2         
	//   53   87:invokevirtual   #70  <Method StringBuilder StringBuilder.append(int)>
	//   54   90:pop             
			throw new IllegalArgumentException(((StringBuilder) (javatype)).toString());
	//   55   91:new             #76  <Class IllegalArgumentException>
	//   56   94:dup             
	//   57   95:aload_1         
	//   58   96:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   59   99:invokespecial   #83  <Method void IllegalArgumentException(String)>
	//   60  102:athrow          
		}
	}

	public static TypeBindings create(Class class1, JavaType javatype, JavaType javatype1)
	{
		TypeVariable atypevariable[] = TypeParamStash.paramsFor2(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #107 <Method TypeVariable[] TypeBindings$TypeParamStash.paramsFor2(Class)>
	//    2    4:astore          4
		int i;
		if(atypevariable == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       16
			i = 0;
	//    5   11:iconst_0        
	//    6   12:istore_3        
		else
	//*   7   13:goto            20
			i = atypevariable.length;
	//    8   16:aload           4
	//    9   18:arraylength     
	//   10   19:istore_3        
		if(i == 2)
	//*  11   20:iload_3         
	//*  12   21:iconst_2        
	//*  13   22:icmpne          74
		{
			return new TypeBindings(new String[] {
				atypevariable[0].getName(), atypevariable[1].getName()
			}, new JavaType[] {
				javatype, javatype1
			}, ((String []) (null)));
	//   14   25:new             #2   <Class TypeBindings>
	//   15   28:dup             
	//   16   29:iconst_2        
	//   17   30:anewarray       String[]
	//   18   33:dup             
	//   19   34:iconst_0        
	//   20   35:aload           4
	//   21   37:iconst_0        
	//   22   38:aaload          
	//   23   39:invokeinterface #94  <Method String TypeVariable.getName()>
	//   24   44:aastore         
	//   25   45:dup             
	//   26   46:iconst_1        
	//   27   47:aload           4
	//   28   49:iconst_1        
	//   29   50:aaload          
	//   30   51:invokeinterface #94  <Method String TypeVariable.getName()>
	//   31   56:aastore         
	//   32   57:iconst_2        
	//   33   58:anewarray       JavaType[]
	//   34   61:dup             
	//   35   62:iconst_0        
	//   36   63:aload_1         
	//   37   64:aastore         
	//   38   65:dup             
	//   39   66:iconst_1        
	//   40   67:aload_2         
	//   41   68:aastore         
	//   42   69:aconst_null     
	//   43   70:invokespecial   #41  <Method void TypeBindings(String[], JavaType[], String[])>
	//   44   73:areturn         
		} else
		{
			javatype = ((JavaType) (new StringBuilder()));
	//   45   74:new             #60  <Class StringBuilder>
	//   46   77:dup             
	//   47   78:invokespecial   #61  <Method void StringBuilder()>
	//   48   81:astore_1        
			((StringBuilder) (javatype)).append("Cannot create TypeBindings for class ");
	//   49   82:aload_1         
	//   50   83:ldc1            #96  <String "Cannot create TypeBindings for class ">
	//   51   85:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   52   88:pop             
			((StringBuilder) (javatype)).append(class1.getName());
	//   53   89:aload_1         
	//   54   90:aload_0         
	//   55   91:invokevirtual   #99  <Method String Class.getName()>
	//   56   94:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   57   97:pop             
			((StringBuilder) (javatype)).append(" with 2 type parameters: class expects ");
	//   58   98:aload_1         
	//   59   99:ldc1            #109 <String " with 2 type parameters: class expects ">
	//   60  101:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   61  104:pop             
			((StringBuilder) (javatype)).append(i);
	//   62  105:aload_1         
	//   63  106:iload_3         
	//   64  107:invokevirtual   #70  <Method StringBuilder StringBuilder.append(int)>
	//   65  110:pop             
			throw new IllegalArgumentException(((StringBuilder) (javatype)).toString());
	//   66  111:new             #76  <Class IllegalArgumentException>
	//   67  114:dup             
	//   68  115:aload_1         
	//   69  116:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   70  119:invokespecial   #83  <Method void IllegalArgumentException(String)>
	//   71  122:athrow          
		}
	}

	public static TypeBindings create(Class class1, List list)
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          38
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #117 <Method boolean List.isEmpty()>
	//*   4   10:ifeq            16
	//*   5   13:goto            38
			list = ((List) ((JavaType[])list.toArray(((Object []) (new JavaType[list.size()])))));
	//    6   16:aload_1         
	//    7   17:aload_1         
	//    8   18:invokeinterface #120 <Method int List.size()>
	//    9   23:anewarray       JavaType[]
	//   10   26:invokeinterface #124 <Method Object[] List.toArray(Object[])>
	//   11   31:checkcast       #125 <Class JavaType[]>
	//   12   34:astore_1        
		else
	//*  13   35:goto            42
			list = ((List) (NO_TYPES));
	//   14   38:getstatic       #37  <Field JavaType[] NO_TYPES>
	//   15   41:astore_1        
		return create(class1, ((JavaType []) (list)));
	//   16   42:aload_0         
	//   17   43:aload_1         
	//   18   44:invokestatic    #128 <Method TypeBindings create(Class, JavaType[])>
	//   19   47:areturn         
	}

	public static TypeBindings create(Class class1, JavaType ajavatype[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		JavaType ajavatype1[];
		if(ajavatype == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       14
			ajavatype1 = NO_TYPES;
	//    4    6:getstatic       #37  <Field JavaType[] NO_TYPES>
	//    5    9:astore          4
		else
	//*   6   11:goto            65
			switch(ajavatype.length)
	//*   7   14:aload_1         
	//*   8   15:arraylength     
			{
	//*   9   16:tableswitch     1 2: default 40
	//	               1 57
	//	               2 46
			default:
				ajavatype1 = ajavatype;
	//   10   40:aload_1         
	//   11   41:astore          4
				break;

	//*  12   43:goto            65
			case 2: // '\002'
				return create(class1, ajavatype[0], ajavatype[1]);
	//   13   46:aload_0         
	//   14   47:aload_1         
	//   15   48:iconst_0        
	//   16   49:aaload          
	//   17   50:aload_1         
	//   18   51:iconst_1        
	//   19   52:aaload          
	//   20   53:invokestatic    #131 <Method TypeBindings create(Class, JavaType, JavaType)>
	//   21   56:areturn         

			case 1: // '\001'
				return create(class1, ajavatype[0]);
	//   22   57:aload_0         
	//   23   58:aload_1         
	//   24   59:iconst_0        
	//   25   60:aaload          
	//   26   61:invokestatic    #133 <Method TypeBindings create(Class, JavaType)>
	//   27   64:areturn         
			}
		TypeVariable atypevariable[] = class1.getTypeParameters();
	//   28   65:aload_0         
	//   29   66:invokevirtual   #137 <Method TypeVariable[] Class.getTypeParameters()>
	//   30   69:astore          6
		if(atypevariable != null && atypevariable.length != 0)
	//*  31   71:aload           6
	//*  32   73:ifnull          123
	//*  33   76:aload           6
	//*  34   78:arraylength     
	//*  35   79:ifne            85
	//*  36   82:goto            123
		{
			int j = atypevariable.length;
	//   37   85:aload           6
	//   38   87:arraylength     
	//   39   88:istore_3        
			String as[] = new String[j];
	//   40   89:iload_3         
	//   41   90:anewarray       String[]
	//   42   93:astore          5
			do
			{
				ajavatype = ((JavaType []) (as));
	//   43   95:aload           5
	//   44   97:astore_1        
				if(i >= j)
					break;
	//   45   98:iload_2         
	//   46   99:iload_3         
	//   47  100:icmpge          127
				as[i] = atypevariable[i].getName();
	//   48  103:aload           5
	//   49  105:iload_2         
	//   50  106:aload           6
	//   51  108:iload_2         
	//   52  109:aaload          
	//   53  110:invokeinterface #94  <Method String TypeVariable.getName()>
	//   54  115:aastore         
				i++;
	//   55  116:iload_2         
	//   56  117:iconst_1        
	//   57  118:iadd            
	//   58  119:istore_2        
			} while(true);
	//   59  120:goto            95
		} else
		{
			ajavatype = ((JavaType []) (NO_STRINGS));
	//   60  123:getstatic       #33  <Field String[] NO_STRINGS>
	//   61  126:astore_1        
		}
		if(ajavatype.length != ajavatype1.length)
	//*  62  127:aload_1         
	//*  63  128:arraylength     
	//*  64  129:aload           4
	//*  65  131:arraylength     
	//*  66  132:icmpeq          239
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   67  135:new             #60  <Class StringBuilder>
	//   68  138:dup             
	//   69  139:invokespecial   #61  <Method void StringBuilder()>
	//   70  142:astore          5
			stringbuilder.append("Cannot create TypeBindings for class ");
	//   71  144:aload           5
	//   72  146:ldc1            #96  <String "Cannot create TypeBindings for class ">
	//   73  148:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   74  151:pop             
			stringbuilder.append(class1.getName());
	//   75  152:aload           5
	//   76  154:aload_0         
	//   77  155:invokevirtual   #99  <Method String Class.getName()>
	//   78  158:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   79  161:pop             
			stringbuilder.append(" with ");
	//   80  162:aload           5
	//   81  164:ldc1            #139 <String " with ">
	//   82  166:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   83  169:pop             
			stringbuilder.append(ajavatype1.length);
	//   84  170:aload           5
	//   85  172:aload           4
	//   86  174:arraylength     
	//   87  175:invokevirtual   #70  <Method StringBuilder StringBuilder.append(int)>
	//   88  178:pop             
			stringbuilder.append(" type parameter");
	//   89  179:aload           5
	//   90  181:ldc1            #141 <String " type parameter">
	//   91  183:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   92  186:pop             
			if(ajavatype1.length == 1)
	//*  93  187:aload           4
	//*  94  189:arraylength     
	//*  95  190:iconst_1        
	//*  96  191:icmpne          200
				class1 = "";
	//   97  194:ldc1            #143 <String "">
	//   98  196:astore_0        
			else
	//*  99  197:goto            203
				class1 = "s";
	//  100  200:ldc1            #145 <String "s">
	//  101  202:astore_0        
			stringbuilder.append(((String) (class1)));
	//  102  203:aload           5
	//  103  205:aload_0         
	//  104  206:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//  105  209:pop             
			stringbuilder.append(": class expects ");
	//  106  210:aload           5
	//  107  212:ldc1            #147 <String ": class expects ">
	//  108  214:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//  109  217:pop             
			stringbuilder.append(ajavatype.length);
	//  110  218:aload           5
	//  111  220:aload_1         
	//  112  221:arraylength     
	//  113  222:invokevirtual   #70  <Method StringBuilder StringBuilder.append(int)>
	//  114  225:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//  115  226:new             #76  <Class IllegalArgumentException>
	//  116  229:dup             
	//  117  230:aload           5
	//  118  232:invokevirtual   #80  <Method String StringBuilder.toString()>
	//  119  235:invokespecial   #83  <Method void IllegalArgumentException(String)>
	//  120  238:athrow          
		} else
		{
			return new TypeBindings(((String []) (ajavatype)), ajavatype1, ((String []) (null)));
	//  121  239:new             #2   <Class TypeBindings>
	//  122  242:dup             
	//  123  243:aload_1         
	//  124  244:aload           4
	//  125  246:aconst_null     
	//  126  247:invokespecial   #41  <Method void TypeBindings(String[], JavaType[], String[])>
	//  127  250:areturn         
		}
	}

	public static TypeBindings createIfNeeded(Class class1, JavaType javatype)
	{
		TypeVariable atypevariable[] = class1.getTypeParameters();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #137 <Method TypeVariable[] Class.getTypeParameters()>
	//    2    4:astore_3        
		int i;
		if(atypevariable == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       14
			i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		else
	//*   7   11:goto            17
			i = atypevariable.length;
	//    8   14:aload_3         
	//    9   15:arraylength     
	//   10   16:istore_2        
		if(i == 0)
	//*  11   17:iload_2         
	//*  12   18:ifne            25
			return EMPTY;
	//   13   21:getstatic       #43  <Field TypeBindings EMPTY>
	//   14   24:areturn         
		if(i == 1)
	//*  15   25:iload_2         
	//*  16   26:iconst_1        
	//*  17   27:icmpne          62
		{
			return new TypeBindings(new String[] {
				atypevariable[0].getName()
			}, new JavaType[] {
				javatype
			}, ((String []) (null)));
	//   18   30:new             #2   <Class TypeBindings>
	//   19   33:dup             
	//   20   34:iconst_1        
	//   21   35:anewarray       String[]
	//   22   38:dup             
	//   23   39:iconst_0        
	//   24   40:aload_3         
	//   25   41:iconst_0        
	//   26   42:aaload          
	//   27   43:invokeinterface #94  <Method String TypeVariable.getName()>
	//   28   48:aastore         
	//   29   49:iconst_1        
	//   30   50:anewarray       JavaType[]
	//   31   53:dup             
	//   32   54:iconst_0        
	//   33   55:aload_1         
	//   34   56:aastore         
	//   35   57:aconst_null     
	//   36   58:invokespecial   #41  <Method void TypeBindings(String[], JavaType[], String[])>
	//   37   61:areturn         
		} else
		{
			javatype = ((JavaType) (new StringBuilder()));
	//   38   62:new             #60  <Class StringBuilder>
	//   39   65:dup             
	//   40   66:invokespecial   #61  <Method void StringBuilder()>
	//   41   69:astore_1        
			((StringBuilder) (javatype)).append("Cannot create TypeBindings for class ");
	//   42   70:aload_1         
	//   43   71:ldc1            #96  <String "Cannot create TypeBindings for class ">
	//   44   73:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   45   76:pop             
			((StringBuilder) (javatype)).append(class1.getName());
	//   46   77:aload_1         
	//   47   78:aload_0         
	//   48   79:invokevirtual   #99  <Method String Class.getName()>
	//   49   82:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   50   85:pop             
			((StringBuilder) (javatype)).append(" with 1 type parameter: class expects ");
	//   51   86:aload_1         
	//   52   87:ldc1            #101 <String " with 1 type parameter: class expects ">
	//   53   89:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   54   92:pop             
			((StringBuilder) (javatype)).append(i);
	//   55   93:aload_1         
	//   56   94:iload_2         
	//   57   95:invokevirtual   #70  <Method StringBuilder StringBuilder.append(int)>
	//   58   98:pop             
			throw new IllegalArgumentException(((StringBuilder) (javatype)).toString());
	//   59   99:new             #76  <Class IllegalArgumentException>
	//   60  102:dup             
	//   61  103:aload_1         
	//   62  104:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   63  107:invokespecial   #83  <Method void IllegalArgumentException(String)>
	//   64  110:athrow          
		}
	}

	public static TypeBindings createIfNeeded(Class class1, JavaType ajavatype[])
	{
		TypeVariable atypevariable[] = class1.getTypeParameters();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #137 <Method TypeVariable[] Class.getTypeParameters()>
	//    2    4:astore          5
		if(atypevariable != null && atypevariable.length != 0)
	//*   3    6:aload           5
	//*   4    8:ifnull          191
	//*   5   11:aload           5
	//*   6   13:arraylength     
	//*   7   14:ifne            20
	//*   8   17:goto            191
		{
			JavaType ajavatype1[] = ajavatype;
	//    9   20:aload_1         
	//   10   21:astore          4
			if(ajavatype == null)
	//*  11   23:aload_1         
	//*  12   24:ifnonnull       32
				ajavatype1 = NO_TYPES;
	//   13   27:getstatic       #37  <Field JavaType[] NO_TYPES>
	//   14   30:astore          4
			int j = atypevariable.length;
	//   15   32:aload           5
	//   16   34:arraylength     
	//   17   35:istore_3        
			ajavatype = ((JavaType []) (new String[j]));
	//   18   36:iload_3         
	//   19   37:anewarray       String[]
	//   20   40:astore_1        
			for(int i = 0; i < j; i++)
	//*  21   41:iconst_0        
	//*  22   42:istore_2        
	//*  23   43:iload_2         
	//*  24   44:iload_3         
	//*  25   45:icmpge          67
				ajavatype[i] = ((JavaType) (atypevariable[i].getName()));
	//   26   48:aload_1         
	//   27   49:iload_2         
	//   28   50:aload           5
	//   29   52:iload_2         
	//   30   53:aaload          
	//   31   54:invokeinterface #94  <Method String TypeVariable.getName()>
	//   32   59:aastore         

	//   33   60:iload_2         
	//   34   61:iconst_1        
	//   35   62:iadd            
	//   36   63:istore_2        
	//*  37   64:goto            43
			if(ajavatype.length != ajavatype1.length)
	//*  38   67:aload_1         
	//*  39   68:arraylength     
	//*  40   69:aload           4
	//*  41   71:arraylength     
	//*  42   72:icmpeq          179
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   43   75:new             #60  <Class StringBuilder>
	//   44   78:dup             
	//   45   79:invokespecial   #61  <Method void StringBuilder()>
	//   46   82:astore          5
				stringbuilder.append("Cannot create TypeBindings for class ");
	//   47   84:aload           5
	//   48   86:ldc1            #96  <String "Cannot create TypeBindings for class ">
	//   49   88:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   50   91:pop             
				stringbuilder.append(class1.getName());
	//   51   92:aload           5
	//   52   94:aload_0         
	//   53   95:invokevirtual   #99  <Method String Class.getName()>
	//   54   98:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   55  101:pop             
				stringbuilder.append(" with ");
	//   56  102:aload           5
	//   57  104:ldc1            #139 <String " with ">
	//   58  106:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   59  109:pop             
				stringbuilder.append(ajavatype1.length);
	//   60  110:aload           5
	//   61  112:aload           4
	//   62  114:arraylength     
	//   63  115:invokevirtual   #70  <Method StringBuilder StringBuilder.append(int)>
	//   64  118:pop             
				stringbuilder.append(" type parameter");
	//   65  119:aload           5
	//   66  121:ldc1            #141 <String " type parameter">
	//   67  123:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   68  126:pop             
				if(ajavatype1.length == 1)
	//*  69  127:aload           4
	//*  70  129:arraylength     
	//*  71  130:iconst_1        
	//*  72  131:icmpne          140
					class1 = "";
	//   73  134:ldc1            #143 <String "">
	//   74  136:astore_0        
				else
	//*  75  137:goto            143
					class1 = "s";
	//   76  140:ldc1            #145 <String "s">
	//   77  142:astore_0        
				stringbuilder.append(((String) (class1)));
	//   78  143:aload           5
	//   79  145:aload_0         
	//   80  146:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   81  149:pop             
				stringbuilder.append(": class expects ");
	//   82  150:aload           5
	//   83  152:ldc1            #147 <String ": class expects ">
	//   84  154:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   85  157:pop             
				stringbuilder.append(ajavatype.length);
	//   86  158:aload           5
	//   87  160:aload_1         
	//   88  161:arraylength     
	//   89  162:invokevirtual   #70  <Method StringBuilder StringBuilder.append(int)>
	//   90  165:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   91  166:new             #76  <Class IllegalArgumentException>
	//   92  169:dup             
	//   93  170:aload           5
	//   94  172:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   95  175:invokespecial   #83  <Method void IllegalArgumentException(String)>
	//   96  178:athrow          
			} else
			{
				return new TypeBindings(((String []) (ajavatype)), ajavatype1, ((String []) (null)));
	//   97  179:new             #2   <Class TypeBindings>
	//   98  182:dup             
	//   99  183:aload_1         
	//  100  184:aload           4
	//  101  186:aconst_null     
	//  102  187:invokespecial   #41  <Method void TypeBindings(String[], JavaType[], String[])>
	//  103  190:areturn         
			}
		} else
		{
			return EMPTY;
	//  104  191:getstatic       #43  <Field TypeBindings EMPTY>
	//  105  194:areturn         
		}
	}

	public static TypeBindings emptyBindings()
	{
		return EMPTY;
	//    0    0:getstatic       #43  <Field TypeBindings EMPTY>
	//    1    3:areturn         
	}

	public Object asKey(Class class1)
	{
		return ((Object) (new AsKey(class1, _types, _hashCode)));
	//    0    0:new             #8   <Class TypeBindings$AsKey>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #50  <Field JavaType[] _types>
	//    5    9:aload_0         
	//    6   10:getfield        #58  <Field int _hashCode>
	//    7   13:invokespecial   #156 <Method void TypeBindings$AsKey(Class, JavaType[], int)>
	//    8   16:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!ClassUtil.hasClass(obj, ((Object)this).getClass()))
	//*   5    7:aload_1         
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #163 <Method Class Object.getClass()>
	//*   8   12:invokestatic    #169 <Method boolean ClassUtil.hasClass(Object, Class)>
	//*   9   15:ifne            20
			return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
		obj = ((Object) ((TypeBindings)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class TypeBindings>
	//   14   24:astore_1        
		int j = _types.length;
	//   15   25:aload_0         
	//   16   26:getfield        #50  <Field JavaType[] _types>
	//   17   29:arraylength     
	//   18   30:istore_3        
		if(j != ((TypeBindings) (obj)).size())
	//*  19   31:iload_3         
	//*  20   32:aload_1         
	//*  21   33:invokevirtual   #170 <Method int size()>
	//*  22   36:icmpeq          41
			return false;
	//   23   39:iconst_0        
	//   24   40:ireturn         
		obj = ((Object) (((TypeBindings) (obj))._types));
	//   25   41:aload_1         
	//   26   42:getfield        #50  <Field JavaType[] _types>
	//   27   45:astore_1        
		for(int i = 0; i < j; i++)
	//*  28   46:iconst_0        
	//*  29   47:istore_2        
	//*  30   48:iload_2         
	//*  31   49:iload_3         
	//*  32   50:icmpge          77
			if(!((JavaType) (obj[i])).equals(((Object) (_types[i]))))
	//*  33   53:aload_1         
	//*  34   54:iload_2         
	//*  35   55:aaload          
	//*  36   56:aload_0         
	//*  37   57:getfield        #50  <Field JavaType[] _types>
	//*  38   60:iload_2         
	//*  39   61:aaload          
	//*  40   62:invokevirtual   #172 <Method boolean JavaType.equals(Object)>
	//*  41   65:ifne            70
				return false;
	//   42   68:iconst_0        
	//   43   69:ireturn         

	//   44   70:iload_2         
	//   45   71:iconst_1        
	//   46   72:iadd            
	//   47   73:istore_2        
	//*  48   74:goto            48
		return true;
	//   49   77:iconst_1        
	//   50   78:ireturn         
	}

	public JavaType findBoundType(String s)
	{
		int j = _names.length;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String[] _names>
	//    2    4:arraylength     
	//    3    5:istore_3        
		for(int i = 0; i < j; i++)
	//*   4    6:iconst_0        
	//*   5    7:istore_2        
	//*   6    8:iload_2         
	//*   7    9:iload_3         
	//*   8   10:icmpge          75
			if(s.equals(((Object) (_names[i]))))
	//*   9   13:aload_1         
	//*  10   14:aload_0         
	//*  11   15:getfield        #48  <Field String[] _names>
	//*  12   18:iload_2         
	//*  13   19:aaload          
	//*  14   20:invokevirtual   #175 <Method boolean String.equals(Object)>
	//*  15   23:ifeq            68
			{
				JavaType javatype = _types[i];
	//   16   26:aload_0         
	//   17   27:getfield        #50  <Field JavaType[] _types>
	//   18   30:iload_2         
	//   19   31:aaload          
	//   20   32:astore          4
				s = ((String) (javatype));
	//   21   34:aload           4
	//   22   36:astore_1        
				if(javatype instanceof ResolvedRecursiveType)
	//*  23   37:aload           4
	//*  24   39:instanceof      #177 <Class ResolvedRecursiveType>
	//*  25   42:ifeq            66
				{
					JavaType javatype1 = ((ResolvedRecursiveType)javatype).getSelfReferencedType();
	//   26   45:aload           4
	//   27   47:checkcast       #177 <Class ResolvedRecursiveType>
	//   28   50:invokevirtual   #181 <Method JavaType ResolvedRecursiveType.getSelfReferencedType()>
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

	public JavaType getBoundType(int i)
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            22
		{
			JavaType ajavatype[] = _types;
	//    2    4:aload_0         
	//    3    5:getfield        #50  <Field JavaType[] _types>
	//    4    8:astore_2        
			if(i < ajavatype.length)
	//*   5    9:iload_1         
	//*   6   10:aload_2         
	//*   7   11:arraylength     
	//*   8   12:icmplt          18
	//*   9   15:goto            22
				return ajavatype[i];
	//   10   18:aload_2         
	//   11   19:iload_1         
	//   12   20:aaload          
	//   13   21:areturn         
		}
		return null;
	//   14   22:aconst_null     
	//   15   23:areturn         
	}

	public List getTypeParameters()
	{
		JavaType ajavatype[] = _types;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field JavaType[] _types>
	//    2    4:astore_1        
		if(ajavatype.length == 0)
	//*   3    5:aload_1         
	//*   4    6:arraylength     
	//*   5    7:ifne            14
			return Collections.emptyList();
	//    6   10:invokestatic    #189 <Method List Collections.emptyList()>
	//    7   13:areturn         
		else
			return Arrays.asList(((Object []) (ajavatype)));
	//    8   14:aload_1         
	//    9   15:invokestatic    #195 <Method List Arrays.asList(Object[])>
	//   10   18:areturn         
	}

	public boolean hasUnbound(String s)
	{
label0:
		{
			String as[] = _unboundVariables;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field String[] _unboundVariables>
	//    2    4:astore          4
			if(as == null)
				break label0;
	//    3    6:aload           4
	//    4    8:ifnull          40
			int i = as.length;
	//    5   11:aload           4
	//    6   13:arraylength     
	//    7   14:istore_2        
			int j;
			do
			{
				j = i - 1;
	//    8   15:iload_2         
	//    9   16:iconst_1        
	//   10   17:isub            
	//   11   18:istore_3        
				if(j < 0)
					break label0;
	//   12   19:iload_3         
	//   13   20:iflt            40
				i = j;
	//   14   23:iload_3         
	//   15   24:istore_2        
			} while(!s.equals(((Object) (_unboundVariables[j]))));
	//   16   25:aload_1         
	//   17   26:aload_0         
	//   18   27:getfield        #56  <Field String[] _unboundVariables>
	//   19   30:iload_3         
	//   20   31:aaload          
	//   21   32:invokevirtual   #175 <Method boolean String.equals(Object)>
	//   22   35:ifeq            15
			return true;
	//   23   38:iconst_1        
	//   24   39:ireturn         
		}
		return false;
	//   25   40:iconst_0        
	//   26   41:ireturn         
	}

	public int hashCode()
	{
		return _hashCode;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int _hashCode>
	//    2    4:ireturn         
	}

	public boolean isEmpty()
	{
		return _types.length == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field JavaType[] _types>
	//    2    4:arraylength     
	//    3    5:ifne            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	protected Object readResolve()
	{
		String as[] = _names;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String[] _names>
	//    2    4:astore_1        
		if(as != null && as.length != 0)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
	//*   5    9:aload_1         
	//*   6   10:arraylength     
	//*   7   11:ifne            17
	//*   8   14:goto            19
			return ((Object) (this));
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return ((Object) (EMPTY));
	//   11   19:getstatic       #43  <Field TypeBindings EMPTY>
	//   12   22:areturn         
	}

	public int size()
	{
		return _types.length;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field JavaType[] _types>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public String toString()
	{
		if(_types.length == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field JavaType[] _types>
	//*   2    4:arraylength     
	//*   3    5:ifne            11
			return "<>";
	//    4    8:ldc1            #202 <String "<>">
	//    5   10:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//    6   11:new             #60  <Class StringBuilder>
	//    7   14:dup             
	//    8   15:invokespecial   #61  <Method void StringBuilder()>
	//    9   18:astore_3        
		stringbuilder.append('<');
	//   10   19:aload_3         
	//   11   20:bipush          60
	//   12   22:invokevirtual   #205 <Method StringBuilder StringBuilder.append(char)>
	//   13   25:pop             
		int i = 0;
	//   14   26:iconst_0        
	//   15   27:istore_1        
		for(int j = _types.length; i < j; i++)
	//*  16   28:aload_0         
	//*  17   29:getfield        #50  <Field JavaType[] _types>
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
	//   27   46:invokevirtual   #205 <Method StringBuilder StringBuilder.append(char)>
	//   28   49:pop             
			stringbuilder.append(_types[i].getGenericSignature());
	//   29   50:aload_3         
	//   30   51:aload_0         
	//   31   52:getfield        #50  <Field JavaType[] _types>
	//   32   55:iload_1         
	//   33   56:aaload          
	//   34   57:invokevirtual   #208 <Method String JavaType.getGenericSignature()>
	//   35   60:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
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
	//   44   74:invokevirtual   #205 <Method StringBuilder StringBuilder.append(char)>
	//   45   77:pop             
		return stringbuilder.toString();
	//   46   78:aload_3         
	//   47   79:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   48   82:areturn         
	}

	protected JavaType[] typeParameterArray()
	{
		return _types;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field JavaType[] _types>
	//    2    4:areturn         
	}

	public TypeBindings withUnboundVariable(String s)
	{
		String as[] = _unboundVariables;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field String[] _unboundVariables>
	//    2    4:astore_3        
		int i;
		if(as == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       14
			i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		else
	//*   7   11:goto            17
			i = as.length;
	//    8   14:aload_3         
	//    9   15:arraylength     
	//   10   16:istore_2        
		if(i == 0)
	//*  11   17:iload_2         
	//*  12   18:ifne            29
			as = new String[1];
	//   13   21:iconst_1        
	//   14   22:anewarray       String[]
	//   15   25:astore_3        
		else
	//*  16   26:goto            43
			as = (String[])Arrays.copyOf(((Object []) (_unboundVariables)), i + 1);
	//   17   29:aload_0         
	//   18   30:getfield        #56  <Field String[] _unboundVariables>
	//   19   33:iload_2         
	//   20   34:iconst_1        
	//   21   35:iadd            
	//   22   36:invokestatic    #216 <Method Object[] Arrays.copyOf(Object[], int)>
	//   23   39:checkcast       #217 <Class String[]>
	//   24   42:astore_3        
		as[i] = s;
	//   25   43:aload_3         
	//   26   44:iload_2         
	//   27   45:aload_1         
	//   28   46:aastore         
		return new TypeBindings(_names, _types, as);
	//   29   47:new             #2   <Class TypeBindings>
	//   30   50:dup             
	//   31   51:aload_0         
	//   32   52:getfield        #48  <Field String[] _names>
	//   33   55:aload_0         
	//   34   56:getfield        #50  <Field JavaType[] _types>
	//   35   59:aload_3         
	//   36   60:invokespecial   #41  <Method void TypeBindings(String[], JavaType[], String[])>
	//   37   63:areturn         
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
	//    2    4:putstatic       #33  <Field String[] NO_STRINGS>
		NO_TYPES = new JavaType[0];
	//    3    7:iconst_0        
	//    4    8:anewarray       JavaType[]
	//    5   11:putstatic       #37  <Field JavaType[] NO_TYPES>
		EMPTY = new TypeBindings(NO_STRINGS, NO_TYPES, ((String []) (null)));
	//    6   14:new             #2   <Class TypeBindings>
	//    7   17:dup             
	//    8   18:getstatic       #33  <Field String[] NO_STRINGS>
	//    9   21:getstatic       #37  <Field JavaType[] NO_TYPES>
	//   10   24:aconst_null     
	//   11   25:invokespecial   #41  <Method void TypeBindings(String[], JavaType[], String[])>
	//   12   28:putstatic       #43  <Field TypeBindings EMPTY>
	//*  13   31:return          
	}
}
