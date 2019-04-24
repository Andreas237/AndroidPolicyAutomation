// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.*;
import java.util.*;

public final class $Gson$Types
{
	private static final class GenericArrayTypeImpl
		implements GenericArrayType, Serializable
	{

		public boolean equals(Object obj)
		{
			return (obj instanceof GenericArrayType) && .Gson.Types.equals(((Type) (this)), ((Type) ((GenericArrayType)obj)));
		//    0    0:aload_1         
		//    1    1:instanceof      #6   <Class GenericArrayType>
		//    2    4:ifeq            20
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #6   <Class GenericArrayType>
		//    6   12:invokestatic    #34  <Method boolean $Gson$Types.equals(Type, Type)>
		//    7   15:ifeq            20
		//    8   18:iconst_1        
		//    9   19:ireturn         
		//   10   20:iconst_0        
		//   11   21:ireturn         
		}

		public Type getGenericComponentType()
		{
			return componentType;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Type componentType>
		//    2    4:areturn         
		}

		public int hashCode()
		{
			return ((Object) (componentType)).hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Type componentType>
		//    2    4:invokevirtual   #40  <Method int Object.hashCode()>
		//    3    7:ireturn         
		}

		public String toString()
		{
			return (new StringBuilder()).append(.Gson.Types.typeToString(componentType)).append("[]").toString();
		//    0    0:new             #44  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #45  <Method void StringBuilder()>
		//    3    7:aload_0         
		//    4    8:getfield        #28  <Field Type componentType>
		//    5   11:invokestatic    #49  <Method String $Gson$Types.typeToString(Type)>
		//    6   14:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//    7   17:ldc1            #55  <String "[]">
		//    8   19:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//    9   22:invokevirtual   #57  <Method String StringBuilder.toString()>
		//   10   25:areturn         
		}

		private static final long serialVersionUID = 0L;
		private final Type componentType;

		public GenericArrayTypeImpl(Type type)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			componentType = .Gson.Types.canonicalize(type);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #26  <Method Type $Gson$Types.canonicalize(Type)>
		//    5    9:putfield        #28  <Field Type componentType>
		//    6   12:return          
		}
	}

	private static final class ParameterizedTypeImpl
		implements ParameterizedType, Serializable
	{

		public boolean equals(Object obj)
		{
			return (obj instanceof ParameterizedType) && .Gson.Types.equals(((Type) (this)), ((Type) ((ParameterizedType)obj)));
		//    0    0:aload_1         
		//    1    1:instanceof      #6   <Class ParameterizedType>
		//    2    4:ifeq            20
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #6   <Class ParameterizedType>
		//    6   12:invokestatic    #76  <Method boolean $Gson$Types.equals(Type, Type)>
		//    7   15:ifeq            20
		//    8   18:iconst_1        
		//    9   19:ireturn         
		//   10   20:iconst_0        
		//   11   21:ireturn         
		}

		public Type[] getActualTypeArguments()
		{
			return (Type[])((Type []) (typeArguments)).clone();
		//    0    0:aload_0         
		//    1    1:getfield        #62  <Field Type[] typeArguments>
		//    2    4:invokevirtual   #60  <Method Object _5B_Ljava.lang.reflect.Type_3B_.clone()>
		//    3    7:checkcast       #56  <Class Type[]>
		//    4   10:areturn         
		}

		public Type getOwnerType()
		{
			return ownerType;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field Type ownerType>
		//    2    4:areturn         
		}

		public Type getRawType()
		{
			return rawType;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field Type rawType>
		//    2    4:areturn         
		}

		public int hashCode()
		{
			return Arrays.hashCode(((Object []) (typeArguments))) ^ ((Object) (rawType)).hashCode() ^ .Gson.Types.hashCodeOrZero(((Object) (ownerType)));
		//    0    0:aload_0         
		//    1    1:getfield        #62  <Field Type[] typeArguments>
		//    2    4:invokestatic    #87  <Method int Arrays.hashCode(Object[])>
		//    3    7:aload_0         
		//    4    8:getfield        #55  <Field Type rawType>
		//    5   11:invokevirtual   #89  <Method int Object.hashCode()>
		//    6   14:ixor            
		//    7   15:aload_0         
		//    8   16:getfield        #49  <Field Type ownerType>
		//    9   19:invokestatic    #93  <Method int $Gson$Types.access$100(Object)>
		//   10   22:ixor            
		//   11   23:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder((typeArguments.length + 1) * 30);
		//    0    0:new             #97  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #62  <Field Type[] typeArguments>
		//    4    8:arraylength     
		//    5    9:iconst_1        
		//    6   10:iadd            
		//    7   11:bipush          30
		//    8   13:imul            
		//    9   14:invokespecial   #100 <Method void StringBuilder(int)>
		//   10   17:astore_2        
			stringbuilder.append(.Gson.Types.typeToString(rawType));
		//   11   18:aload_2         
		//   12   19:aload_0         
		//   13   20:getfield        #55  <Field Type rawType>
		//   14   23:invokestatic    #104 <Method String $Gson$Types.typeToString(Type)>
		//   15   26:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//   16   29:pop             
			if(typeArguments.length == 0)
		//*  17   30:aload_0         
		//*  18   31:getfield        #62  <Field Type[] typeArguments>
		//*  19   34:arraylength     
		//*  20   35:ifne            43
				return stringbuilder.toString();
		//   21   38:aload_2         
		//   22   39:invokevirtual   #110 <Method String StringBuilder.toString()>
		//   23   42:areturn         
			stringbuilder.append("<").append(.Gson.Types.typeToString(typeArguments[0]));
		//   24   43:aload_2         
		//   25   44:ldc1            #112 <String "<">
		//   26   46:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//   27   49:aload_0         
		//   28   50:getfield        #62  <Field Type[] typeArguments>
		//   29   53:iconst_0        
		//   30   54:aaload          
		//   31   55:invokestatic    #104 <Method String $Gson$Types.typeToString(Type)>
		//   32   58:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//   33   61:pop             
			for(int i = 1; i < typeArguments.length; i++)
		//*  34   62:iconst_1        
		//*  35   63:istore_1        
		//*  36   64:iload_1         
		//*  37   65:aload_0         
		//*  38   66:getfield        #62  <Field Type[] typeArguments>
		//*  39   69:arraylength     
		//*  40   70:icmpge          99
				stringbuilder.append(", ").append(.Gson.Types.typeToString(typeArguments[i]));
		//   41   73:aload_2         
		//   42   74:ldc1            #114 <String ", ">
		//   43   76:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//   44   79:aload_0         
		//   45   80:getfield        #62  <Field Type[] typeArguments>
		//   46   83:iload_1         
		//   47   84:aaload          
		//   48   85:invokestatic    #104 <Method String $Gson$Types.typeToString(Type)>
		//   49   88:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//   50   91:pop             

		//   51   92:iload_1         
		//   52   93:iconst_1        
		//   53   94:iadd            
		//   54   95:istore_1        
		//*  55   96:goto            64
			return stringbuilder.append(">").toString();
		//   56   99:aload_2         
		//   57  100:ldc1            #116 <String ">">
		//   58  102:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//   59  105:invokevirtual   #110 <Method String StringBuilder.toString()>
		//   60  108:areturn         
		}

		private static final long serialVersionUID = 0L;
		private final Type ownerType;
		private final Type rawType;
		private final Type typeArguments[];

		public transient ParameterizedTypeImpl(Type type, Type type1, Type atype[])
		{
			boolean flag = false;
		//    0    0:iconst_0        
		//    1    1:istore          5
			super();
		//    2    3:aload_0         
		//    3    4:invokespecial   #25  <Method void Object()>
			if(type1 instanceof Class)
		//*   4    7:aload_2         
		//*   5    8:instanceof      #27  <Class Class>
		//*   6   11:ifeq            59
			{
				Class class1 = (Class)type1;
		//    7   14:aload_2         
		//    8   15:checkcast       #27  <Class Class>
		//    9   18:astore          6
				int i;
				if(Modifier.isStatic(class1.getModifiers()) || class1.getEnclosingClass() == null)
		//*  10   20:aload           6
		//*  11   22:invokevirtual   #31  <Method int Class.getModifiers()>
		//*  12   25:invokestatic    #37  <Method boolean Modifier.isStatic(int)>
		//*  13   28:ifne            39
		//*  14   31:aload           6
		//*  15   33:invokevirtual   #41  <Method Class Class.getEnclosingClass()>
		//*  16   36:ifnonnull       149
					i = 1;
		//   17   39:iconst_1        
		//   18   40:istore          4
				else
		//*  19   42:aload_1         
		//*  20   43:ifnonnull       51
		//*  21   46:iload           4
		//*  22   48:ifeq            54
		//*  23   51:iconst_1        
		//*  24   52:istore          5
		//*  25   54:iload           5
		//*  26   56:invokestatic    #47  <Method void $Gson$Preconditions.checkArgument(boolean)>
		//*  27   59:aload_1         
		//*  28   60:ifnonnull       155
		//*  29   63:aconst_null     
		//*  30   64:astore_1        
		//*  31   65:aload_0         
		//*  32   66:aload_1         
		//*  33   67:putfield        #49  <Field Type ownerType>
		//*  34   70:aload_0         
		//*  35   71:aload_2         
		//*  36   72:invokestatic    #53  <Method Type $Gson$Types.canonicalize(Type)>
		//*  37   75:putfield        #55  <Field Type rawType>
		//*  38   78:aload_0         
		//*  39   79:aload_3         
		//*  40   80:invokevirtual   #60  <Method Object _5B_Ljava.lang.reflect.Type_3B_.clone()>
		//*  41   83:checkcast       #56  <Class Type[]>
		//*  42   86:putfield        #62  <Field Type[] typeArguments>
		//*  43   89:iconst_0        
		//*  44   90:istore          4
		//*  45   92:iload           4
		//*  46   94:aload_0         
		//*  47   95:getfield        #62  <Field Type[] typeArguments>
		//*  48   98:arraylength     
		//*  49   99:icmpge          163
		//*  50  102:aload_0         
		//*  51  103:getfield        #62  <Field Type[] typeArguments>
		//*  52  106:iload           4
		//*  53  108:aaload          
		//*  54  109:invokestatic    #66  <Method Object $Gson$Preconditions.checkNotNull(Object)>
		//*  55  112:pop             
		//*  56  113:aload_0         
		//*  57  114:getfield        #62  <Field Type[] typeArguments>
		//*  58  117:iload           4
		//*  59  119:aaload          
		//*  60  120:invokestatic    #70  <Method void $Gson$Types.access$000(Type)>
		//*  61  123:aload_0         
		//*  62  124:getfield        #62  <Field Type[] typeArguments>
		//*  63  127:iload           4
		//*  64  129:aload_0         
		//*  65  130:getfield        #62  <Field Type[] typeArguments>
		//*  66  133:iload           4
		//*  67  135:aaload          
		//*  68  136:invokestatic    #53  <Method Type $Gson$Types.canonicalize(Type)>
		//*  69  139:aastore         
		//*  70  140:iload           4
		//*  71  142:iconst_1        
		//*  72  143:iadd            
		//*  73  144:istore          4
		//*  74  146:goto            92
					i = 0;
		//   75  149:iconst_0        
		//   76  150:istore          4
				if(type != null || i != 0)
					flag = true;
				.Gson.Preconditions.checkArgument(flag);
			}
			if(type == null)
				type = null;
			else
		//*  77  152:goto            42
				type = .Gson.Types.canonicalize(type);
		//   78  155:aload_1         
		//   79  156:invokestatic    #53  <Method Type $Gson$Types.canonicalize(Type)>
		//   80  159:astore_1        
			ownerType = type;
			rawType = .Gson.Types.canonicalize(type1);
			typeArguments = (Type[])((Type []) (atype)).clone();
			for(i = 0; i < typeArguments.length; i++)
			{
				.Gson.Preconditions.checkNotNull(((Object) (typeArguments[i])));
				.Gson.Types.checkNotPrimitive(typeArguments[i]);
				typeArguments[i] = .Gson.Types.canonicalize(typeArguments[i]);
			}

		//*  81  160:goto            65
		//   82  163:return          
		}
	}

	private static final class WildcardTypeImpl
		implements WildcardType, Serializable
	{

		public boolean equals(Object obj)
		{
			return (obj instanceof WildcardType) && .Gson.Types.equals(((Type) (this)), ((Type) ((WildcardType)obj)));
		//    0    0:aload_1         
		//    1    1:instanceof      #6   <Class WildcardType>
		//    2    4:ifeq            20
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #6   <Class WildcardType>
		//    6   12:invokestatic    #51  <Method boolean $Gson$Types.equals(Type, Type)>
		//    7   15:ifeq            20
		//    8   18:iconst_1        
		//    9   19:ireturn         
		//   10   20:iconst_0        
		//   11   21:ireturn         
		}

		public Type[] getLowerBounds()
		{
			if(lowerBound != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #43  <Field Type lowerBound>
		//*   2    4:ifnull          19
				return (new Type[] {
					lowerBound
				});
		//    3    7:iconst_1        
		//    4    8:anewarray       Type[]
		//    5   11:dup             
		//    6   12:iconst_0        
		//    7   13:aload_0         
		//    8   14:getfield        #43  <Field Type lowerBound>
		//    9   17:aastore         
		//   10   18:areturn         
			else
				return .Gson.Types.EMPTY_TYPE_ARRAY;
		//   11   19:getstatic       #59  <Field Type[] $Gson$Types.EMPTY_TYPE_ARRAY>
		//   12   22:areturn         
		}

		public Type[] getUpperBounds()
		{
			return (new Type[] {
				upperBound
			});
		//    0    0:iconst_1        
		//    1    1:anewarray       Type[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:aload_0         
		//    5    7:getfield        #45  <Field Type upperBound>
		//    6   10:aastore         
		//    7   11:areturn         
		}

		public int hashCode()
		{
			int i;
			if(lowerBound != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #43  <Field Type lowerBound>
		//*   2    4:ifnull          31
				i = ((Object) (lowerBound)).hashCode() + 31;
		//    3    7:aload_0         
		//    4    8:getfield        #43  <Field Type lowerBound>
		//    5   11:invokevirtual   #64  <Method int Object.hashCode()>
		//    6   14:bipush          31
		//    7   16:iadd            
		//    8   17:istore_1        
			else
		//*   9   18:iload_1         
		//*  10   19:aload_0         
		//*  11   20:getfield        #45  <Field Type upperBound>
		//*  12   23:invokevirtual   #64  <Method int Object.hashCode()>
		//*  13   26:bipush          31
		//*  14   28:iadd            
		//*  15   29:ixor            
		//*  16   30:ireturn         
				i = 1;
		//   17   31:iconst_1        
		//   18   32:istore_1        
			return i ^ ((Object) (upperBound)).hashCode() + 31;
		//*  19   33:goto            18
		}

		public String toString()
		{
			if(lowerBound != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #43  <Field Type lowerBound>
		//*   2    4:ifnull          33
				return (new StringBuilder()).append("? super ").append(.Gson.Types.typeToString(lowerBound)).toString();
		//    3    7:new             #68  <Class StringBuilder>
		//    4   10:dup             
		//    5   11:invokespecial   #69  <Method void StringBuilder()>
		//    6   14:ldc1            #71  <String "? super ">
		//    7   16:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//    8   19:aload_0         
		//    9   20:getfield        #43  <Field Type lowerBound>
		//   10   23:invokestatic    #79  <Method String $Gson$Types.typeToString(Type)>
		//   11   26:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   12   29:invokevirtual   #81  <Method String StringBuilder.toString()>
		//   13   32:areturn         
			if(upperBound == java/lang/Object)
		//*  14   33:aload_0         
		//*  15   34:getfield        #45  <Field Type upperBound>
		//*  16   37:ldc1            #4   <Class Object>
		//*  17   39:if_acmpne       45
				return "?";
		//   18   42:ldc1            #83  <String "?">
		//   19   44:areturn         
			else
				return (new StringBuilder()).append("? extends ").append(.Gson.Types.typeToString(upperBound)).toString();
		//   20   45:new             #68  <Class StringBuilder>
		//   21   48:dup             
		//   22   49:invokespecial   #69  <Method void StringBuilder()>
		//   23   52:ldc1            #85  <String "? extends ">
		//   24   54:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   25   57:aload_0         
		//   26   58:getfield        #45  <Field Type upperBound>
		//   27   61:invokestatic    #79  <Method String $Gson$Types.typeToString(Type)>
		//   28   64:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   29   67:invokevirtual   #81  <Method String StringBuilder.toString()>
		//   30   70:areturn         
		}

		private static final long serialVersionUID = 0L;
		private final Type lowerBound;
		private final Type upperBound;

		public WildcardTypeImpl(Type atype[], Type atype1[])
		{
			boolean flag1 = true;
		//    0    0:iconst_1        
		//    1    1:istore          4
			super();
		//    2    3:aload_0         
		//    3    4:invokespecial   #23  <Method void Object()>
			boolean flag;
			if(atype1.length <= 1)
		//*   4    7:aload_2         
		//*   5    8:arraylength     
		//*   6    9:iconst_1        
		//*   7   10:icmpgt          82
				flag = true;
		//    8   13:iconst_1        
		//    9   14:istore_3        
			else
		//*  10   15:iload_3         
		//*  11   16:invokestatic    #29  <Method void $Gson$Preconditions.checkArgument(boolean)>
		//*  12   19:aload_1         
		//*  13   20:arraylength     
		//*  14   21:iconst_1        
		//*  15   22:icmpne          87
		//*  16   25:iconst_1        
		//*  17   26:istore_3        
		//*  18   27:iload_3         
		//*  19   28:invokestatic    #29  <Method void $Gson$Preconditions.checkArgument(boolean)>
		//*  20   31:aload_2         
		//*  21   32:arraylength     
		//*  22   33:iconst_1        
		//*  23   34:icmpne          97
		//*  24   37:aload_2         
		//*  25   38:iconst_0        
		//*  26   39:aaload          
		//*  27   40:invokestatic    #33  <Method Object $Gson$Preconditions.checkNotNull(Object)>
		//*  28   43:pop             
		//*  29   44:aload_2         
		//*  30   45:iconst_0        
		//*  31   46:aaload          
		//*  32   47:invokestatic    #37  <Method void $Gson$Types.access$000(Type)>
		//*  33   50:aload_1         
		//*  34   51:iconst_0        
		//*  35   52:aaload          
		//*  36   53:ldc1            #4   <Class Object>
		//*  37   55:if_acmpne       92
		//*  38   58:iload           4
		//*  39   60:istore_3        
		//*  40   61:iload_3         
		//*  41   62:invokestatic    #29  <Method void $Gson$Preconditions.checkArgument(boolean)>
		//*  42   65:aload_0         
		//*  43   66:aload_2         
		//*  44   67:iconst_0        
		//*  45   68:aaload          
		//*  46   69:invokestatic    #41  <Method Type $Gson$Types.canonicalize(Type)>
		//*  47   72:putfield        #43  <Field Type lowerBound>
		//*  48   75:aload_0         
		//*  49   76:ldc1            #4   <Class Object>
		//*  50   78:putfield        #45  <Field Type upperBound>
		//*  51   81:return          
				flag = false;
		//   52   82:iconst_0        
		//   53   83:istore_3        
			.Gson.Preconditions.checkArgument(flag);
			if(atype.length == 1)
				flag = true;
			else
		//*  54   84:goto            15
				flag = false;
		//   55   87:iconst_0        
		//   56   88:istore_3        
			.Gson.Preconditions.checkArgument(flag);
			if(atype1.length == 1)
			{
				.Gson.Preconditions.checkNotNull(((Object) (atype1[0])));
				.Gson.Types.checkNotPrimitive(atype1[0]);
				if(atype[0] == java/lang/Object)
					flag = flag1;
				else
		//*  57   89:goto            27
					flag = false;
		//   58   92:iconst_0        
		//   59   93:istore_3        
				.Gson.Preconditions.checkArgument(flag);
				lowerBound = .Gson.Types.canonicalize(atype1[0]);
				upperBound = java/lang/Object;
				return;
			} else
		//*  60   94:goto            61
			{
				.Gson.Preconditions.checkNotNull(((Object) (atype[0])));
		//   61   97:aload_1         
		//   62   98:iconst_0        
		//   63   99:aaload          
		//   64  100:invokestatic    #33  <Method Object $Gson$Preconditions.checkNotNull(Object)>
		//   65  103:pop             
				.Gson.Types.checkNotPrimitive(atype[0]);
		//   66  104:aload_1         
		//   67  105:iconst_0        
		//   68  106:aaload          
		//   69  107:invokestatic    #37  <Method void $Gson$Types.access$000(Type)>
				lowerBound = null;
		//   70  110:aload_0         
		//   71  111:aconst_null     
		//   72  112:putfield        #43  <Field Type lowerBound>
				upperBound = .Gson.Types.canonicalize(atype[0]);
		//   73  115:aload_0         
		//   74  116:aload_1         
		//   75  117:iconst_0        
		//   76  118:aaload          
		//   77  119:invokestatic    #41  <Method Type $Gson$Types.canonicalize(Type)>
		//   78  122:putfield        #45  <Field Type upperBound>
				return;
		//   79  125:return          
			}
		}
	}


	public static GenericArrayType arrayOf(Type type)
	{
		return ((GenericArrayType) (new GenericArrayTypeImpl(type)));
	//    0    0:new             #6   <Class $Gson$Types$GenericArrayTypeImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #42  <Method void $Gson$Types$GenericArrayTypeImpl(Type)>
	//    4    8:areturn         
	}

	public static Type canonicalize(Type type)
	{
		if(type instanceof Class)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #46  <Class Class>
	//*   2    4:ifeq            42
		{
			type = ((Type) ((Class)type));
	//    3    7:aload_0         
	//    4    8:checkcast       #46  <Class Class>
	//    5   11:astore_0        
			if(((Class) (type)).isArray())
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #50  <Method boolean Class.isArray()>
	//*   8   16:ifeq            39
				type = ((Type) (new GenericArrayTypeImpl(canonicalize(((Type) (((Class) (type)).getComponentType()))))));
	//    9   19:new             #6   <Class $Gson$Types$GenericArrayTypeImpl>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokevirtual   #54  <Method Class Class.getComponentType()>
	//   13   27:invokestatic    #56  <Method Type canonicalize(Type)>
	//   14   30:invokespecial   #42  <Method void $Gson$Types$GenericArrayTypeImpl(Type)>
	//   15   33:astore_0        
			return (Type)type;
	//   16   34:aload_0         
	//   17   35:checkcast       #19  <Class Type>
	//   18   38:areturn         
		}
	//*  19   39:goto            34
		if(type instanceof ParameterizedType)
	//*  20   42:aload_0         
	//*  21   43:instanceof      #58  <Class ParameterizedType>
	//*  22   46:ifeq            80
		{
			type = ((Type) ((ParameterizedType)type));
	//   23   49:aload_0         
	//   24   50:checkcast       #58  <Class ParameterizedType>
	//   25   53:astore_0        
			return ((Type) (new ParameterizedTypeImpl(((ParameterizedType) (type)).getOwnerType(), ((ParameterizedType) (type)).getRawType(), ((ParameterizedType) (type)).getActualTypeArguments())));
	//   26   54:new             #9   <Class $Gson$Types$ParameterizedTypeImpl>
	//   27   57:dup             
	//   28   58:aload_0         
	//   29   59:invokeinterface #62  <Method Type ParameterizedType.getOwnerType()>
	//   30   64:aload_0         
	//   31   65:invokeinterface #65  <Method Type ParameterizedType.getRawType()>
	//   32   70:aload_0         
	//   33   71:invokeinterface #69  <Method Type[] ParameterizedType.getActualTypeArguments()>
	//   34   76:invokespecial   #72  <Method void $Gson$Types$ParameterizedTypeImpl(Type, Type, Type[])>
	//   35   79:areturn         
		}
		if(type instanceof GenericArrayType)
	//*  36   80:aload_0         
	//*  37   81:instanceof      #74  <Class GenericArrayType>
	//*  38   84:ifeq            104
			return ((Type) (new GenericArrayTypeImpl(((GenericArrayType)type).getGenericComponentType())));
	//   39   87:new             #6   <Class $Gson$Types$GenericArrayTypeImpl>
	//   40   90:dup             
	//   41   91:aload_0         
	//   42   92:checkcast       #74  <Class GenericArrayType>
	//   43   95:invokeinterface #77  <Method Type GenericArrayType.getGenericComponentType()>
	//   44  100:invokespecial   #42  <Method void $Gson$Types$GenericArrayTypeImpl(Type)>
	//   45  103:areturn         
		if(type instanceof WildcardType)
	//*  46  104:aload_0         
	//*  47  105:instanceof      #79  <Class WildcardType>
	//*  48  108:ifeq            136
		{
			type = ((Type) ((WildcardType)type));
	//   49  111:aload_0         
	//   50  112:checkcast       #79  <Class WildcardType>
	//   51  115:astore_0        
			return ((Type) (new WildcardTypeImpl(((WildcardType) (type)).getUpperBounds(), ((WildcardType) (type)).getLowerBounds())));
	//   52  116:new             #12  <Class $Gson$Types$WildcardTypeImpl>
	//   53  119:dup             
	//   54  120:aload_0         
	//   55  121:invokeinterface #82  <Method Type[] WildcardType.getUpperBounds()>
	//   56  126:aload_0         
	//   57  127:invokeinterface #85  <Method Type[] WildcardType.getLowerBounds()>
	//   58  132:invokespecial   #88  <Method void $Gson$Types$WildcardTypeImpl(Type[], Type[])>
	//   59  135:areturn         
		} else
		{
			return type;
	//   60  136:aload_0         
	//   61  137:areturn         
		}
	}

	private static void checkNotPrimitive(Type type)
	{
		boolean flag;
		if(!(type instanceof Class) || !((Class)type).isPrimitive())
	//*   0    0:aload_0         
	//*   1    1:instanceof      #46  <Class Class>
	//*   2    4:ifeq            17
	//*   3    7:aload_0         
	//*   4    8:checkcast       #46  <Class Class>
	//*   5   11:invokevirtual   #91  <Method boolean Class.isPrimitive()>
	//*   6   14:ifne            24
			flag = true;
	//    7   17:iconst_1        
	//    8   18:istore_1        
		else
	//*   9   19:iload_1         
	//*  10   20:invokestatic    #97  <Method void $Gson$Preconditions.checkArgument(boolean)>
	//*  11   23:return          
			flag = false;
	//   12   24:iconst_0        
	//   13   25:istore_1        
		ditions.checkArgument(flag);
	//*  14   26:goto            19
	}

	private static Class declaringClassOf(TypeVariable typevariable)
	{
		typevariable = ((TypeVariable) (typevariable.getGenericDeclaration()));
	//    0    0:aload_0         
	//    1    1:invokeinterface #105 <Method java.lang.reflect.GenericDeclaration TypeVariable.getGenericDeclaration()>
	//    2    6:astore_0        
		if(typevariable instanceof Class)
	//*   3    7:aload_0         
	//*   4    8:instanceof      #46  <Class Class>
	//*   5   11:ifeq            19
			return (Class)typevariable;
	//    6   14:aload_0         
	//    7   15:checkcast       #46  <Class Class>
	//    8   18:areturn         
		else
			return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
	}

	static boolean equal(Object obj, Object obj1)
	{
		return obj == obj1 || obj != null && obj.equals(obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       17
	//    3    5:aload_0         
	//    4    6:ifnull          19
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #113 <Method boolean Object.equals(Object)>
	//    8   14:ifeq            19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	public static boolean equals(Type type, Type type1)
	{
		boolean flag2;
		boolean flag3;
		boolean flag4;
		boolean flag5;
		flag4 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		flag5 = true;
	//    2    3:iconst_1        
	//    3    4:istore          6
		flag2 = true;
	//    4    6:iconst_1        
	//    5    7:istore_3        
		flag3 = false;
	//    6    8:iconst_0        
	//    7    9:istore          4
		if(type != type1) goto _L2; else goto _L1
	//    8   11:aload_0         
	//    9   12:aload_1         
	//   10   13:if_acmpne       20
_L1:
		boolean flag = true;
	//   11   16:iconst_1        
	//   12   17:istore_2        
_L4:
		return flag;
	//   13   18:iload_2         
	//   14   19:ireturn         
_L2:
		if(type instanceof Class)
	//*  15   20:aload_0         
	//*  16   21:instanceof      #46  <Class Class>
	//*  17   24:ifeq            33
			return ((Object) (type)).equals(((Object) (type1)));
	//   18   27:aload_0         
	//   19   28:aload_1         
	//   20   29:invokevirtual   #113 <Method boolean Object.equals(Object)>
	//   21   32:ireturn         
		if(!(type instanceof ParameterizedType))
			break; /* Loop/switch isn't completed */
	//   22   33:aload_0         
	//   23   34:instanceof      #58  <Class ParameterizedType>
	//   24   37:ifeq            123
		flag = flag3;
	//   25   40:iload           4
	//   26   42:istore_2        
		if(type1 instanceof ParameterizedType)
	//*  27   43:aload_1         
	//*  28   44:instanceof      #58  <Class ParameterizedType>
	//*  29   47:ifeq            18
		{
			type = ((Type) ((ParameterizedType)type));
	//   30   50:aload_0         
	//   31   51:checkcast       #58  <Class ParameterizedType>
	//   32   54:astore_0        
			type1 = ((Type) ((ParameterizedType)type1));
	//   33   55:aload_1         
	//   34   56:checkcast       #58  <Class ParameterizedType>
	//   35   59:astore_1        
			if(equal(((Object) (((ParameterizedType) (type)).getOwnerType())), ((Object) (((ParameterizedType) (type1)).getOwnerType()))) && ((Object) (((ParameterizedType) (type)).getRawType())).equals(((Object) (((ParameterizedType) (type1)).getRawType()))) && Arrays.equals(((Object []) (((ParameterizedType) (type)).getActualTypeArguments())), ((Object []) (((ParameterizedType) (type1)).getActualTypeArguments()))))
	//*  36   60:aload_0         
	//*  37   61:invokeinterface #62  <Method Type ParameterizedType.getOwnerType()>
	//*  38   66:aload_1         
	//*  39   67:invokeinterface #62  <Method Type ParameterizedType.getOwnerType()>
	//*  40   72:invokestatic    #116 <Method boolean equal(Object, Object)>
	//*  41   75:ifeq            118
	//*  42   78:aload_0         
	//*  43   79:invokeinterface #65  <Method Type ParameterizedType.getRawType()>
	//*  44   84:aload_1         
	//*  45   85:invokeinterface #65  <Method Type ParameterizedType.getRawType()>
	//*  46   90:invokevirtual   #113 <Method boolean Object.equals(Object)>
	//*  47   93:ifeq            118
	//*  48   96:aload_0         
	//*  49   97:invokeinterface #69  <Method Type[] ParameterizedType.getActualTypeArguments()>
	//*  50  102:aload_1         
	//*  51  103:invokeinterface #69  <Method Type[] ParameterizedType.getActualTypeArguments()>
	//*  52  108:invokestatic    #121 <Method boolean Arrays.equals(Object[], Object[])>
	//*  53  111:ifeq            118
				flag = flag2;
	//   54  114:iload_3         
	//   55  115:istore_2        
			else
	//*  56  116:iload_2         
	//*  57  117:ireturn         
				flag = false;
	//   58  118:iconst_0        
	//   59  119:istore_2        
			return flag;
		}
		if(true) goto _L4; else goto _L3
	//   60  120:goto            116
_L3:
		if(!(type instanceof GenericArrayType))
			break; /* Loop/switch isn't completed */
	//   61  123:aload_0         
	//   62  124:instanceof      #74  <Class GenericArrayType>
	//   63  127:ifeq            166
		flag = flag3;
	//   64  130:iload           4
	//   65  132:istore_2        
		if(type1 instanceof GenericArrayType)
	//*  66  133:aload_1         
	//*  67  134:instanceof      #74  <Class GenericArrayType>
	//*  68  137:ifeq            18
		{
			type = ((Type) ((GenericArrayType)type));
	//   69  140:aload_0         
	//   70  141:checkcast       #74  <Class GenericArrayType>
	//   71  144:astore_0        
			type1 = ((Type) ((GenericArrayType)type1));
	//   72  145:aload_1         
	//   73  146:checkcast       #74  <Class GenericArrayType>
	//   74  149:astore_1        
			return equals(((GenericArrayType) (type)).getGenericComponentType(), ((GenericArrayType) (type1)).getGenericComponentType());
	//   75  150:aload_0         
	//   76  151:invokeinterface #77  <Method Type GenericArrayType.getGenericComponentType()>
	//   77  156:aload_1         
	//   78  157:invokeinterface #77  <Method Type GenericArrayType.getGenericComponentType()>
	//   79  162:invokestatic    #123 <Method boolean equals(Type, Type)>
	//   80  165:ireturn         
		}
		if(true) goto _L4; else goto _L5
_L5:
		if(!(type instanceof WildcardType))
			break; /* Loop/switch isn't completed */
	//   81  166:aload_0         
	//   82  167:instanceof      #79  <Class WildcardType>
	//   83  170:ifeq            239
		flag = flag3;
	//   84  173:iload           4
	//   85  175:istore_2        
		if(type1 instanceof WildcardType)
	//*  86  176:aload_1         
	//*  87  177:instanceof      #79  <Class WildcardType>
	//*  88  180:ifeq            18
		{
			type = ((Type) ((WildcardType)type));
	//   89  183:aload_0         
	//   90  184:checkcast       #79  <Class WildcardType>
	//   91  187:astore_0        
			type1 = ((Type) ((WildcardType)type1));
	//   92  188:aload_1         
	//   93  189:checkcast       #79  <Class WildcardType>
	//   94  192:astore_1        
			if(Arrays.equals(((Object []) (((WildcardType) (type)).getUpperBounds())), ((Object []) (((WildcardType) (type1)).getUpperBounds()))) && Arrays.equals(((Object []) (((WildcardType) (type)).getLowerBounds())), ((Object []) (((WildcardType) (type1)).getLowerBounds()))))
	//*  95  193:aload_0         
	//*  96  194:invokeinterface #82  <Method Type[] WildcardType.getUpperBounds()>
	//*  97  199:aload_1         
	//*  98  200:invokeinterface #82  <Method Type[] WildcardType.getUpperBounds()>
	//*  99  205:invokestatic    #121 <Method boolean Arrays.equals(Object[], Object[])>
	//* 100  208:ifeq            234
	//* 101  211:aload_0         
	//* 102  212:invokeinterface #85  <Method Type[] WildcardType.getLowerBounds()>
	//* 103  217:aload_1         
	//* 104  218:invokeinterface #85  <Method Type[] WildcardType.getLowerBounds()>
	//* 105  223:invokestatic    #121 <Method boolean Arrays.equals(Object[], Object[])>
	//* 106  226:ifeq            234
				flag = flag4;
	//  107  229:iload           5
	//  108  231:istore_2        
			else
	//* 109  232:iload_2         
	//* 110  233:ireturn         
				flag = false;
	//  111  234:iconst_0        
	//  112  235:istore_2        
			return flag;
		}
		if(true) goto _L4; else goto _L6
	//  113  236:goto            232
_L6:
		flag = flag3;
	//  114  239:iload           4
	//  115  241:istore_2        
		if(type instanceof TypeVariable)
	//* 116  242:aload_0         
	//* 117  243:instanceof      #101 <Class TypeVariable>
	//* 118  246:ifeq            18
		{
			flag = flag3;
	//  119  249:iload           4
	//  120  251:istore_2        
			if(type1 instanceof TypeVariable)
	//* 121  252:aload_1         
	//* 122  253:instanceof      #101 <Class TypeVariable>
	//* 123  256:ifeq            18
			{
				type = ((Type) ((TypeVariable)type));
	//  124  259:aload_0         
	//  125  260:checkcast       #101 <Class TypeVariable>
	//  126  263:astore_0        
				type1 = ((Type) ((TypeVariable)type1));
	//  127  264:aload_1         
	//  128  265:checkcast       #101 <Class TypeVariable>
	//  129  268:astore_1        
				boolean flag1;
				if(((TypeVariable) (type)).getGenericDeclaration() == ((TypeVariable) (type1)).getGenericDeclaration() && ((TypeVariable) (type)).getName().equals(((Object) (((TypeVariable) (type1)).getName()))))
	//* 130  269:aload_0         
	//* 131  270:invokeinterface #105 <Method java.lang.reflect.GenericDeclaration TypeVariable.getGenericDeclaration()>
	//* 132  275:aload_1         
	//* 133  276:invokeinterface #105 <Method java.lang.reflect.GenericDeclaration TypeVariable.getGenericDeclaration()>
	//* 134  281:if_acmpne       307
	//* 135  284:aload_0         
	//* 136  285:invokeinterface #127 <Method String TypeVariable.getName()>
	//* 137  290:aload_1         
	//* 138  291:invokeinterface #127 <Method String TypeVariable.getName()>
	//* 139  296:invokevirtual   #130 <Method boolean String.equals(Object)>
	//* 140  299:ifeq            307
					flag1 = flag5;
	//  141  302:iload           6
	//  142  304:istore_2        
				else
	//* 143  305:iload_2         
	//* 144  306:ireturn         
					flag1 = false;
	//  145  307:iconst_0        
	//  146  308:istore_2        
				return flag1;
			}
		}
		if(true) goto _L4; else goto _L7
	//  147  309:goto            305
_L7:
	}

	public static Type getArrayComponentType(Type type)
	{
		if(type instanceof GenericArrayType)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #74  <Class GenericArrayType>
	//*   2    4:ifeq            17
			return ((GenericArrayType)type).getGenericComponentType();
	//    3    7:aload_0         
	//    4    8:checkcast       #74  <Class GenericArrayType>
	//    5   11:invokeinterface #77  <Method Type GenericArrayType.getGenericComponentType()>
	//    6   16:areturn         
		else
			return ((Type) (((Class)type).getComponentType()));
	//    7   17:aload_0         
	//    8   18:checkcast       #46  <Class Class>
	//    9   21:invokevirtual   #54  <Method Class Class.getComponentType()>
	//   10   24:areturn         
	}

	public static Type getCollectionElementType(Type type, Class class1)
	{
		class1 = ((Class) (getSupertype(type, class1, java/util/Collection)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #135 <Class Collection>
	//    3    4:invokestatic    #139 <Method Type getSupertype(Type, Class, Class)>
	//    4    7:astore_1        
		type = ((Type) (class1));
	//    5    8:aload_1         
	//    6    9:astore_0        
		if(class1 instanceof WildcardType)
	//*   7   10:aload_1         
	//*   8   11:instanceof      #79  <Class WildcardType>
	//*   9   14:ifeq            29
			type = ((WildcardType)class1).getUpperBounds()[0];
	//   10   17:aload_1         
	//   11   18:checkcast       #79  <Class WildcardType>
	//   12   21:invokeinterface #82  <Method Type[] WildcardType.getUpperBounds()>
	//   13   26:iconst_0        
	//   14   27:aaload          
	//   15   28:astore_0        
		if(type instanceof ParameterizedType)
	//*  16   29:aload_0         
	//*  17   30:instanceof      #58  <Class ParameterizedType>
	//*  18   33:ifeq            48
			return ((ParameterizedType)type).getActualTypeArguments()[0];
	//   19   36:aload_0         
	//   20   37:checkcast       #58  <Class ParameterizedType>
	//   21   40:invokeinterface #69  <Method Type[] ParameterizedType.getActualTypeArguments()>
	//   22   45:iconst_0        
	//   23   46:aaload          
	//   24   47:areturn         
		else
			return java/lang/Object;
	//   25   48:ldc1            #4   <Class Object>
	//   26   50:areturn         
	}

	static Type getGenericSupertype(Type type, Class class1, Class class2)
	{
		if(class2 == class1)
	//*   0    0:aload_2         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return type;
	//    3    5:aload_0         
	//    4    6:areturn         
		if(class2.isInterface())
	//*   5    7:aload_2         
	//*   6    8:invokevirtual   #144 <Method boolean Class.isInterface()>
	//*   7   11:ifeq            76
		{
			type = ((Type) (class1.getInterfaces()));
	//    8   14:aload_1         
	//    9   15:invokevirtual   #148 <Method Class[] Class.getInterfaces()>
	//   10   18:astore_0        
			int i = 0;
	//   11   19:iconst_0        
	//   12   20:istore_3        
			for(int j = type.length; i < j; i++)
	//*  13   21:aload_0         
	//*  14   22:arraylength     
	//*  15   23:istore          4
	//*  16   25:iload_3         
	//*  17   26:iload           4
	//*  18   28:icmpge          76
			{
				if(type[i] == class2)
	//*  19   31:aload_0         
	//*  20   32:iload_3         
	//*  21   33:aaload          
	//*  22   34:aload_2         
	//*  23   35:if_acmpne       45
					return class1.getGenericInterfaces()[i];
	//   24   38:aload_1         
	//   25   39:invokevirtual   #151 <Method Type[] Class.getGenericInterfaces()>
	//   26   42:iload_3         
	//   27   43:aaload          
	//   28   44:areturn         
				if(class2.isAssignableFrom(((Class) (type[i]))))
	//*  29   45:aload_2         
	//*  30   46:aload_0         
	//*  31   47:iload_3         
	//*  32   48:aaload          
	//*  33   49:invokevirtual   #155 <Method boolean Class.isAssignableFrom(Class)>
	//*  34   52:ifeq            69
					return getGenericSupertype(class1.getGenericInterfaces()[i], ((Class) (type[i])), class2);
	//   35   55:aload_1         
	//   36   56:invokevirtual   #151 <Method Type[] Class.getGenericInterfaces()>
	//   37   59:iload_3         
	//   38   60:aaload          
	//   39   61:aload_0         
	//   40   62:iload_3         
	//   41   63:aaload          
	//   42   64:aload_2         
	//   43   65:invokestatic    #157 <Method Type getGenericSupertype(Type, Class, Class)>
	//   44   68:areturn         
			}

	//   45   69:iload_3         
	//   46   70:iconst_1        
	//   47   71:iadd            
	//   48   72:istore_3        
		}
	//*  49   73:goto            25
		if(!class1.isInterface())
	//*  50   76:aload_1         
	//*  51   77:invokevirtual   #144 <Method boolean Class.isInterface()>
	//*  52   80:ifne            127
			for(; class1 != java/lang/Object; class1 = ((Class) (type)))
	//*  53   83:aload_1         
	//*  54   84:ldc1            #4   <Class Object>
	//*  55   86:if_acmpeq       127
			{
				type = ((Type) (class1.getSuperclass()));
	//   56   89:aload_1         
	//   57   90:invokevirtual   #160 <Method Class Class.getSuperclass()>
	//   58   93:astore_0        
				if(type == class2)
	//*  59   94:aload_0         
	//*  60   95:aload_2         
	//*  61   96:if_acmpne       104
					return class1.getGenericSuperclass();
	//   62   99:aload_1         
	//   63  100:invokevirtual   #163 <Method Type Class.getGenericSuperclass()>
	//   64  103:areturn         
				if(class2.isAssignableFrom(((Class) (type))))
	//*  65  104:aload_2         
	//*  66  105:aload_0         
	//*  67  106:invokevirtual   #155 <Method boolean Class.isAssignableFrom(Class)>
	//*  68  109:ifeq            122
					return getGenericSupertype(class1.getGenericSuperclass(), ((Class) (type)), class2);
	//   69  112:aload_1         
	//   70  113:invokevirtual   #163 <Method Type Class.getGenericSuperclass()>
	//   71  116:aload_0         
	//   72  117:aload_2         
	//   73  118:invokestatic    #157 <Method Type getGenericSupertype(Type, Class, Class)>
	//   74  121:areturn         
			}

	//   75  122:aload_0         
	//   76  123:astore_1        
	//*  77  124:goto            83
		return ((Type) (class2));
	//   78  127:aload_2         
	//   79  128:areturn         
	}

	public static Type[] getMapKeyAndValueTypes(Type type, Class class1)
	{
		if(type == java/util/Properties)
	//*   0    0:aload_0         
	//*   1    1:ldc1            #168 <Class Properties>
	//*   2    3:if_acmpne       21
			return (new Type[] {
				java/lang/String, java/lang/String
			});
	//    3    6:iconst_2        
	//    4    7:anewarray       Type[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:ldc1            #129 <Class String>
	//    8   14:aastore         
	//    9   15:dup             
	//   10   16:iconst_1        
	//   11   17:ldc1            #129 <Class String>
	//   12   19:aastore         
	//   13   20:areturn         
		type = getSupertype(type, class1, java/util/Map);
	//   14   21:aload_0         
	//   15   22:aload_1         
	//   16   23:ldc1            #170 <Class Map>
	//   17   25:invokestatic    #139 <Method Type getSupertype(Type, Class, Class)>
	//   18   28:astore_0        
		if(type instanceof ParameterizedType)
	//*  19   29:aload_0         
	//*  20   30:instanceof      #58  <Class ParameterizedType>
	//*  21   33:ifeq            46
			return ((ParameterizedType)type).getActualTypeArguments();
	//   22   36:aload_0         
	//   23   37:checkcast       #58  <Class ParameterizedType>
	//   24   40:invokeinterface #69  <Method Type[] ParameterizedType.getActualTypeArguments()>
	//   25   45:areturn         
		else
			return (new Type[] {
				java/lang/Object, java/lang/Object
			});
	//   26   46:iconst_2        
	//   27   47:anewarray       Type[]
	//   28   50:dup             
	//   29   51:iconst_0        
	//   30   52:ldc1            #4   <Class Object>
	//   31   54:aastore         
	//   32   55:dup             
	//   33   56:iconst_1        
	//   34   57:ldc1            #4   <Class Object>
	//   35   59:aastore         
	//   36   60:areturn         
	}

	public static Class getRawType(Type type)
	{
		if(type instanceof Class)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #46  <Class Class>
	//*   2    4:ifeq            12
			return (Class)type;
	//    3    7:aload_0         
	//    4    8:checkcast       #46  <Class Class>
	//    5   11:areturn         
		if(type instanceof ParameterizedType)
	//*   6   12:aload_0         
	//*   7   13:instanceof      #58  <Class ParameterizedType>
	//*   8   16:ifeq            41
		{
			type = ((ParameterizedType)type).getRawType();
	//    9   19:aload_0         
	//   10   20:checkcast       #58  <Class ParameterizedType>
	//   11   23:invokeinterface #65  <Method Type ParameterizedType.getRawType()>
	//   12   28:astore_0        
			ditions.checkArgument(type instanceof Class);
	//   13   29:aload_0         
	//   14   30:instanceof      #46  <Class Class>
	//   15   33:invokestatic    #97  <Method void $Gson$Preconditions.checkArgument(boolean)>
			return (Class)type;
	//   16   36:aload_0         
	//   17   37:checkcast       #46  <Class Class>
	//   18   40:areturn         
		}
		if(type instanceof GenericArrayType)
	//*  19   41:aload_0         
	//*  20   42:instanceof      #74  <Class GenericArrayType>
	//*  21   45:ifeq            68
			return Array.newInstance(getRawType(((GenericArrayType)type).getGenericComponentType()), 0).getClass();
	//   22   48:aload_0         
	//   23   49:checkcast       #74  <Class GenericArrayType>
	//   24   52:invokeinterface #77  <Method Type GenericArrayType.getGenericComponentType()>
	//   25   57:invokestatic    #174 <Method Class getRawType(Type)>
	//   26   60:iconst_0        
	//   27   61:invokestatic    #180 <Method Object Array.newInstance(Class, int)>
	//   28   64:invokevirtual   #183 <Method Class Object.getClass()>
	//   29   67:areturn         
		if(type instanceof TypeVariable)
	//*  30   68:aload_0         
	//*  31   69:instanceof      #101 <Class TypeVariable>
	//*  32   72:ifeq            78
			return java/lang/Object;
	//   33   75:ldc1            #4   <Class Object>
	//   34   77:areturn         
		if(type instanceof WildcardType)
	//*  35   78:aload_0         
	//*  36   79:instanceof      #79  <Class WildcardType>
	//*  37   82:ifeq            100
			return getRawType(((WildcardType)type).getUpperBounds()[0]);
	//   38   85:aload_0         
	//   39   86:checkcast       #79  <Class WildcardType>
	//   40   89:invokeinterface #82  <Method Type[] WildcardType.getUpperBounds()>
	//   41   94:iconst_0        
	//   42   95:aaload          
	//   43   96:invokestatic    #174 <Method Class getRawType(Type)>
	//   44   99:areturn         
		String s;
		if(type == null)
	//*  45  100:aload_0         
	//*  46  101:ifnonnull       143
			s = "null";
	//   47  104:ldc1            #185 <String "null">
	//   48  106:astore_1        
		else
	//*  49  107:new             #187 <Class IllegalArgumentException>
	//*  50  110:dup             
	//*  51  111:new             #189 <Class StringBuilder>
	//*  52  114:dup             
	//*  53  115:invokespecial   #190 <Method void StringBuilder()>
	//*  54  118:ldc1            #192 <String "Expected a Class, ParameterizedType, or GenericArrayType, but <">
	//*  55  120:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//*  56  123:aload_0         
	//*  57  124:invokevirtual   #199 <Method StringBuilder StringBuilder.append(Object)>
	//*  58  127:ldc1            #201 <String "> is of type ">
	//*  59  129:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//*  60  132:aload_1         
	//*  61  133:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//*  62  136:invokevirtual   #204 <Method String StringBuilder.toString()>
	//*  63  139:invokespecial   #207 <Method void IllegalArgumentException(String)>
	//*  64  142:athrow          
			s = ((Object) (type)).getClass().getName();
	//   65  143:aload_0         
	//   66  144:invokevirtual   #183 <Method Class Object.getClass()>
	//   67  147:invokevirtual   #208 <Method String Class.getName()>
	//   68  150:astore_1        
		throw new IllegalArgumentException((new StringBuilder()).append("Expected a Class, ParameterizedType, or GenericArrayType, but <").append(((Object) (type))).append("> is of type ").append(s).toString());
	//*  69  151:goto            107
	}

	static Type getSupertype(Type type, Class class1, Class class2)
	{
		ditions.checkArgument(class2.isAssignableFrom(class1));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #155 <Method boolean Class.isAssignableFrom(Class)>
	//    3    5:invokestatic    #97  <Method void $Gson$Preconditions.checkArgument(boolean)>
		return resolve(type, class1, getGenericSupertype(type, class1, class2));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:invokestatic    #157 <Method Type getGenericSupertype(Type, Class, Class)>
	//   10   16:invokestatic    #213 <Method Type resolve(Type, Class, Type)>
	//   11   19:areturn         
	}

	private static int hashCodeOrZero(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          9
			return obj.hashCode();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #217 <Method int Object.hashCode()>
	//    4    8:ireturn         
		else
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	private static int indexOf(Object aobj[], Object obj)
	{
		for(int i = 0; i < aobj.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:arraylength     
	//*   5    5:icmpge          27
			if(obj.equals(aobj[i]))
	//*   6    8:aload_1         
	//*   7    9:aload_0         
	//*   8   10:iload_2         
	//*   9   11:aaload          
	//*  10   12:invokevirtual   #113 <Method boolean Object.equals(Object)>
	//*  11   15:ifeq            20
				return i;
	//   12   18:iload_2         
	//   13   19:ireturn         

	//   14   20:iload_2         
	//   15   21:iconst_1        
	//   16   22:iadd            
	//   17   23:istore_2        
	//*  18   24:goto            2
		throw new NoSuchElementException();
	//   19   27:new             #221 <Class NoSuchElementException>
	//   20   30:dup             
	//   21   31:invokespecial   #222 <Method void NoSuchElementException()>
	//   22   34:athrow          
	}

	public static transient ParameterizedType newParameterizedTypeWithOwner(Type type, Type type1, Type atype[])
	{
		return ((ParameterizedType) (new ParameterizedTypeImpl(type, type1, atype)));
	//    0    0:new             #9   <Class $Gson$Types$ParameterizedTypeImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #72  <Method void $Gson$Types$ParameterizedTypeImpl(Type, Type, Type[])>
	//    6   10:areturn         
	}

	public static Type resolve(Type type, Class class1, Type type1)
	{
_L4:
		if(!(type1 instanceof TypeVariable)) goto _L2; else goto _L1
	//    0    0:aload_2         
	//    1    1:instanceof      #101 <Class TypeVariable>
	//    2    4:ifeq            37
_L1:
		Type type2;
		TypeVariable typevariable;
		typevariable = (TypeVariable)type1;
	//    3    7:aload_2         
	//    4    8:checkcast       #101 <Class TypeVariable>
	//    5   11:astore          8
		type2 = resolveTypeVariable(type, class1, typevariable);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:aload           8
	//    9   17:invokestatic    #228 <Method Type resolveTypeVariable(Type, Class, TypeVariable)>
	//   10   20:astore          7
		type1 = type2;
	//   11   22:aload           7
	//   12   24:astore_2        
		if(type2 != typevariable) goto _L4; else goto _L3
	//   13   25:aload           7
	//   14   27:aload           8
	//   15   29:if_acmpne       0
_L3:
		type1 = type2;
	//   16   32:aload           7
	//   17   34:astore_2        
_L6:
		return type1;
	//   18   35:aload_2         
	//   19   36:areturn         
_L2:
		if((type1 instanceof Class) && ((Class)type1).isArray())
	//*  20   37:aload_2         
	//*  21   38:instanceof      #46  <Class Class>
	//*  22   41:ifeq            91
	//*  23   44:aload_2         
	//*  24   45:checkcast       #46  <Class Class>
	//*  25   48:invokevirtual   #50  <Method boolean Class.isArray()>
	//*  26   51:ifeq            91
		{
			type1 = ((Type) ((Class)type1));
	//   27   54:aload_2         
	//   28   55:checkcast       #46  <Class Class>
	//   29   58:astore_2        
			Class class2 = ((Class) (type1)).getComponentType();
	//   30   59:aload_2         
	//   31   60:invokevirtual   #54  <Method Class Class.getComponentType()>
	//   32   63:astore          7
			type = resolve(type, class1, ((Type) (class2)));
	//   33   65:aload_0         
	//   34   66:aload_1         
	//   35   67:aload           7
	//   36   69:invokestatic    #213 <Method Type resolve(Type, Class, Type)>
	//   37   72:astore_0        
			if(class2 == type)
	//*  38   73:aload           7
	//*  39   75:aload_0         
	//*  40   76:if_acmpne       83
				type = type1;
	//   41   79:aload_2         
	//   42   80:astore_0        
			else
	//*  43   81:aload_0         
	//*  44   82:areturn         
				type = ((Type) (arrayOf(type)));
	//   45   83:aload_0         
	//   46   84:invokestatic    #230 <Method GenericArrayType arrayOf(Type)>
	//   47   87:astore_0        
			return type;
		}
	//*  48   88:goto            81
		if(!(type1 instanceof GenericArrayType))
			break; /* Loop/switch isn't completed */
	//   49   91:aload_2         
	//   50   92:instanceof      #74  <Class GenericArrayType>
	//   51   95:ifeq            130
		type1 = ((Type) ((GenericArrayType)type1));
	//   52   98:aload_2         
	//   53   99:checkcast       #74  <Class GenericArrayType>
	//   54  102:astore_2        
		Type type3 = ((GenericArrayType) (type1)).getGenericComponentType();
	//   55  103:aload_2         
	//   56  104:invokeinterface #77  <Method Type GenericArrayType.getGenericComponentType()>
	//   57  109:astore          7
		type = resolve(type, class1, type3);
	//   58  111:aload_0         
	//   59  112:aload_1         
	//   60  113:aload           7
	//   61  115:invokestatic    #213 <Method Type resolve(Type, Class, Type)>
	//   62  118:astore_0        
		if(type3 != type)
	//*  63  119:aload           7
	//*  64  121:aload_0         
	//*  65  122:if_acmpeq       35
			return ((Type) (arrayOf(type)));
	//   66  125:aload_0         
	//   67  126:invokestatic    #230 <Method GenericArrayType arrayOf(Type)>
	//   68  129:areturn         
		if(true) goto _L6; else goto _L5
_L5:
		if(!(type1 instanceof ParameterizedType))
			break; /* Loop/switch isn't completed */
	//   69  130:aload_2         
	//   70  131:instanceof      #58  <Class ParameterizedType>
	//   71  134:ifeq            289
		ParameterizedType parameterizedtype = (ParameterizedType)type1;
	//   72  137:aload_2         
	//   73  138:checkcast       #58  <Class ParameterizedType>
	//   74  141:astore          8
		type1 = parameterizedtype.getOwnerType();
	//   75  143:aload           8
	//   76  145:invokeinterface #62  <Method Type ParameterizedType.getOwnerType()>
	//   77  150:astore_2        
		Type type4 = resolve(type, class1, type1);
	//   78  151:aload_0         
	//   79  152:aload_1         
	//   80  153:aload_2         
	//   81  154:invokestatic    #213 <Method Type resolve(Type, Class, Type)>
	//   82  157:astore          9
		boolean flag;
		int i;
		Type atype[];
		if(type4 != type1)
	//*  83  159:aload           9
	//*  84  161:aload_2         
	//*  85  162:if_acmpeq       262
			flag = true;
	//   86  165:iconst_1        
	//   87  166:istore_3        
		else
	//*  88  167:aload           8
	//*  89  169:invokeinterface #69  <Method Type[] ParameterizedType.getActualTypeArguments()>
	//*  90  174:astore          7
	//*  91  176:iconst_0        
	//*  92  177:istore          5
	//*  93  179:aload           7
	//*  94  181:arraylength     
	//*  95  182:istore          6
	//*  96  184:iload           5
	//*  97  186:iload           6
	//*  98  188:icmpge          267
	//*  99  191:aload_0         
	//* 100  192:aload_1         
	//* 101  193:aload           7
	//* 102  195:iload           5
	//* 103  197:aaload          
	//* 104  198:invokestatic    #213 <Method Type resolve(Type, Class, Type)>
	//* 105  201:astore          10
	//* 106  203:aload           7
	//* 107  205:astore_2        
	//* 108  206:iload_3         
	//* 109  207:istore          4
	//* 110  209:aload           10
	//* 111  211:aload           7
	//* 112  213:iload           5
	//* 113  215:aaload          
	//* 114  216:if_acmpeq       247
	//* 115  219:aload           7
	//* 116  221:astore_2        
	//* 117  222:iload_3         
	//* 118  223:istore          4
	//* 119  225:iload_3         
	//* 120  226:ifne            241
	//* 121  229:aload           7
	//* 122  231:invokevirtual   #235 <Method Object _5B_Ljava.lang.reflect.Type_3B_.clone()>
	//* 123  234:checkcast       #231 <Class Type[]>
	//* 124  237:astore_2        
	//* 125  238:iconst_1        
	//* 126  239:istore          4
	//* 127  241:aload_2         
	//* 128  242:iload           5
	//* 129  244:aload           10
	//* 130  246:aastore         
	//* 131  247:iload           5
	//* 132  249:iconst_1        
	//* 133  250:iadd            
	//* 134  251:istore          5
	//* 135  253:aload_2         
	//* 136  254:astore          7
	//* 137  256:iload           4
	//* 138  258:istore_3        
	//* 139  259:goto            184
			flag = false;
	//  140  262:iconst_0        
	//  141  263:istore_3        
		atype = parameterizedtype.getActualTypeArguments();
		i = 0;
		for(int j = atype.length; i < j;)
		{
			Type type5 = resolve(type, class1, atype[i]);
			type1 = ((Type) (atype));
			boolean flag1 = flag;
			if(type5 != atype[i])
			{
				type1 = ((Type) (atype));
				flag1 = flag;
				if(!flag)
				{
					type1 = ((Type) ((Type[])((Type []) (atype)).clone()));
					flag1 = true;
				}
				type1[i] = ((/*<invalid signature>*/java.lang.Object) (type5));
			}
			i++;
			atype = ((Type []) (type1));
			flag = flag1;
		}

	//* 142  264:goto            167
		type1 = ((Type) (parameterizedtype));
	//  143  267:aload           8
	//  144  269:astore_2        
		if(flag)
	//* 145  270:iload_3         
	//* 146  271:ifeq            35
			return ((Type) (newParameterizedTypeWithOwner(type4, parameterizedtype.getRawType(), atype)));
	//  147  274:aload           9
	//  148  276:aload           8
	//  149  278:invokeinterface #65  <Method Type ParameterizedType.getRawType()>
	//  150  283:aload           7
	//  151  285:invokestatic    #237 <Method ParameterizedType newParameterizedTypeWithOwner(Type, Type, Type[])>
	//  152  288:areturn         
		if(true) goto _L6; else goto _L7
_L7:
		if(type1 instanceof WildcardType)
	//* 153  289:aload_2         
	//* 154  290:instanceof      #79  <Class WildcardType>
	//* 155  293:ifeq            389
		{
			WildcardType wildcardtype = (WildcardType)type1;
	//  156  296:aload_2         
	//  157  297:checkcast       #79  <Class WildcardType>
	//  158  300:astore          7
			Type atype1[] = wildcardtype.getLowerBounds();
	//  159  302:aload           7
	//  160  304:invokeinterface #85  <Method Type[] WildcardType.getLowerBounds()>
	//  161  309:astore          8
			Type atype2[] = wildcardtype.getUpperBounds();
	//  162  311:aload           7
	//  163  313:invokeinterface #82  <Method Type[] WildcardType.getUpperBounds()>
	//  164  318:astore          9
			if(atype1.length == 1)
	//* 165  320:aload           8
	//* 166  322:arraylength     
	//* 167  323:iconst_1        
	//* 168  324:icmpne          353
			{
				type = resolve(type, class1, atype1[0]);
	//  169  327:aload_0         
	//  170  328:aload_1         
	//  171  329:aload           8
	//  172  331:iconst_0        
	//  173  332:aaload          
	//  174  333:invokestatic    #213 <Method Type resolve(Type, Class, Type)>
	//  175  336:astore_0        
				type1 = ((Type) (wildcardtype));
	//  176  337:aload           7
	//  177  339:astore_2        
				if(type != atype1[0])
	//* 178  340:aload_0         
	//* 179  341:aload           8
	//* 180  343:iconst_0        
	//* 181  344:aaload          
	//* 182  345:if_acmpeq       35
					return ((Type) (supertypeOf(type)));
	//  183  348:aload_0         
	//  184  349:invokestatic    #241 <Method WildcardType supertypeOf(Type)>
	//  185  352:areturn         
			} else
			{
				type1 = ((Type) (wildcardtype));
	//  186  353:aload           7
	//  187  355:astore_2        
				if(atype2.length == 1)
	//* 188  356:aload           9
	//* 189  358:arraylength     
	//* 190  359:iconst_1        
	//* 191  360:icmpne          35
				{
					type = resolve(type, class1, atype2[0]);
	//  192  363:aload_0         
	//  193  364:aload_1         
	//  194  365:aload           9
	//  195  367:iconst_0        
	//  196  368:aaload          
	//  197  369:invokestatic    #213 <Method Type resolve(Type, Class, Type)>
	//  198  372:astore_0        
					type1 = ((Type) (wildcardtype));
	//  199  373:aload           7
	//  200  375:astore_2        
					if(type != atype2[0])
	//* 201  376:aload_0         
	//* 202  377:aload           9
	//* 203  379:iconst_0        
	//* 204  380:aaload          
	//* 205  381:if_acmpeq       35
						return ((Type) (subtypeOf(type)));
	//  206  384:aload_0         
	//  207  385:invokestatic    #244 <Method WildcardType subtypeOf(Type)>
	//  208  388:areturn         
				}
			}
		} else
		{
			return type1;
	//  209  389:aload_2         
	//  210  390:areturn         
		}
		if(true) goto _L6; else goto _L8
_L8:
	}

	static Type resolveTypeVariable(Type type, Class class1, TypeVariable typevariable)
	{
		Class class2 = declaringClassOf(typevariable);
	//    0    0:aload_2         
	//    1    1:invokestatic    #247 <Method Class declaringClassOf(TypeVariable)>
	//    2    4:astore          4
		if(class2 != null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       13
	//*   5   11:aload_2         
	//*   6   12:areturn         
	//*   7   13:aload_0         
	//*   8   14:aload_1         
	//*   9   15:aload           4
	//*  10   17:invokestatic    #157 <Method Type getGenericSupertype(Type, Class, Class)>
	//*  11   20:astore_0        
			if((type = getGenericSupertype(type, class1, class2)) instanceof ParameterizedType)
	//*  12   21:aload_0         
	//*  13   22:instanceof      #58  <Class ParameterizedType>
	//*  14   25:ifeq            11
			{
				int i = indexOf(((Object []) (class2.getTypeParameters())), ((Object) (typevariable)));
	//   15   28:aload           4
	//   16   30:invokevirtual   #251 <Method TypeVariable[] Class.getTypeParameters()>
	//   17   33:aload_2         
	//   18   34:invokestatic    #253 <Method int indexOf(Object[], Object)>
	//   19   37:istore_3        
				return ((ParameterizedType)type).getActualTypeArguments()[i];
	//   20   38:aload_0         
	//   21   39:checkcast       #58  <Class ParameterizedType>
	//   22   42:invokeinterface #69  <Method Type[] ParameterizedType.getActualTypeArguments()>
	//   23   47:iload_3         
	//   24   48:aaload          
	//   25   49:areturn         
			}
		return ((Type) (typevariable));
	}

	public static WildcardType subtypeOf(Type type)
	{
		Type atype[] = EMPTY_TYPE_ARRAY;
	//    0    0:getstatic       #21  <Field Type[] EMPTY_TYPE_ARRAY>
	//    1    3:astore_1        
		return ((WildcardType) (new WildcardTypeImpl(new Type[] {
			type
		}, atype)));
	//    2    4:new             #12  <Class $Gson$Types$WildcardTypeImpl>
	//    3    7:dup             
	//    4    8:iconst_1        
	//    5    9:anewarray       Type[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_0         
	//    9   15:aastore         
	//   10   16:aload_1         
	//   11   17:invokespecial   #88  <Method void $Gson$Types$WildcardTypeImpl(Type[], Type[])>
	//   12   20:areturn         
	}

	public static WildcardType supertypeOf(Type type)
	{
		return ((WildcardType) (new WildcardTypeImpl(new Type[] {
			java/lang/Object
		}, new Type[] {
			type
		})));
	//    0    0:new             #12  <Class $Gson$Types$WildcardTypeImpl>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:anewarray       Type[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #4   <Class Object>
	//    7   12:aastore         
	//    8   13:iconst_1        
	//    9   14:anewarray       Type[]
	//   10   17:dup             
	//   11   18:iconst_0        
	//   12   19:aload_0         
	//   13   20:aastore         
	//   14   21:invokespecial   #88  <Method void $Gson$Types$WildcardTypeImpl(Type[], Type[])>
	//   15   24:areturn         
	}

	public static String typeToString(Type type)
	{
		if(type instanceof Class)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #46  <Class Class>
	//*   2    4:ifeq            15
			return ((Class)type).getName();
	//    3    7:aload_0         
	//    4    8:checkcast       #46  <Class Class>
	//    5   11:invokevirtual   #208 <Method String Class.getName()>
	//    6   14:areturn         
		else
			return ((Object) (type)).toString();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #257 <Method String Object.toString()>
	//    9   19:areturn         
	}

	static final Type EMPTY_TYPE_ARRAY[] = new Type[0];

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       Type[]
	//    2    4:putstatic       #21  <Field Type[] EMPTY_TYPE_ARRAY>
	//*   3    7:return          
	}


/*
	static void access$000(Type type)
	{
		checkNotPrimitive(type);
	//    0    0:aload_0         
	//    1    1:invokestatic    #33  <Method void checkNotPrimitive(Type)>
		return;
	//    2    4:return          
	}

*/


/*
	static int access$100(Object obj)
	{
		return hashCodeOrZero(obj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #38  <Method int hashCodeOrZero(Object)>
	//    2    4:ireturn         
	}

*/

	private $Gson$Types()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		throw new UnsupportedOperationException();
	//    2    4:new             #27  <Class UnsupportedOperationException>
	//    3    7:dup             
	//    4    8:invokespecial   #28  <Method void UnsupportedOperationException()>
	//    5   11:athrow          
	}
}
