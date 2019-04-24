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
		implements Serializable, GenericArrayType
	{

		public boolean equals(Object obj)
		{
			return (obj instanceof GenericArrayType) && .Gson.Types.equals(((Type) (this)), ((Type) ((GenericArrayType)obj)));
		//    0    0:aload_1         
		//    1    1:instanceof      #8   <Class GenericArrayType>
		//    2    4:ifeq            20
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #8   <Class GenericArrayType>
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
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #44  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #45  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append(.Gson.Types.typeToString(componentType));
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #28  <Field Type componentType>
		//    7   13:invokestatic    #49  <Method String $Gson$Types.typeToString(Type)>
		//    8   16:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//    9   19:pop             
			stringbuilder.append("[]");
		//   10   20:aload_1         
		//   11   21:ldc1            #55  <String "[]">
		//   12   23:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			return stringbuilder.toString();
		//   14   27:aload_1         
		//   15   28:invokevirtual   #57  <Method String StringBuilder.toString()>
		//   16   31:areturn         
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
		implements Serializable, ParameterizedType
	{

		public boolean equals(Object obj)
		{
			return (obj instanceof ParameterizedType) && .Gson.Types.equals(((Type) (this)), ((Type) ((ParameterizedType)obj)));
		//    0    0:aload_1         
		//    1    1:instanceof      #8   <Class ParameterizedType>
		//    2    4:ifeq            20
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #8   <Class ParameterizedType>
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
		//    1    1:getfield        #53  <Field Type ownerType>
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
		//    8   16:getfield        #53  <Field Type ownerType>
		//    9   19:invokestatic    #93  <Method int $Gson$Types.access$100(Object)>
		//   10   22:ixor            
		//   11   23:ireturn         
		}

		public String toString()
		{
			int j = typeArguments.length;
		//    0    0:aload_0         
		//    1    1:getfield        #62  <Field Type[] typeArguments>
		//    2    4:arraylength     
		//    3    5:istore_2        
			int i = 1;
		//    4    6:iconst_1        
		//    5    7:istore_1        
			StringBuilder stringbuilder = new StringBuilder((j + 1) * 30);
		//    6    8:new             #97  <Class StringBuilder>
		//    7   11:dup             
		//    8   12:iload_2         
		//    9   13:iconst_1        
		//   10   14:iadd            
		//   11   15:bipush          30
		//   12   17:imul            
		//   13   18:invokespecial   #100 <Method void StringBuilder(int)>
		//   14   21:astore_3        
			stringbuilder.append(.Gson.Types.typeToString(rawType));
		//   15   22:aload_3         
		//   16   23:aload_0         
		//   17   24:getfield        #55  <Field Type rawType>
		//   18   27:invokestatic    #104 <Method String $Gson$Types.typeToString(Type)>
		//   19   30:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//   20   33:pop             
			if(typeArguments.length == 0)
		//*  21   34:aload_0         
		//*  22   35:getfield        #62  <Field Type[] typeArguments>
		//*  23   38:arraylength     
		//*  24   39:ifne            47
				return stringbuilder.toString();
		//   25   42:aload_3         
		//   26   43:invokevirtual   #110 <Method String StringBuilder.toString()>
		//   27   46:areturn         
			stringbuilder.append("<");
		//   28   47:aload_3         
		//   29   48:ldc1            #112 <String "<">
		//   30   50:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//   31   53:pop             
			stringbuilder.append(.Gson.Types.typeToString(typeArguments[0]));
		//   32   54:aload_3         
		//   33   55:aload_0         
		//   34   56:getfield        #62  <Field Type[] typeArguments>
		//   35   59:iconst_0        
		//   36   60:aaload          
		//   37   61:invokestatic    #104 <Method String $Gson$Types.typeToString(Type)>
		//   38   64:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//   39   67:pop             
			for(; i < typeArguments.length; i++)
		//*  40   68:iload_1         
		//*  41   69:aload_0         
		//*  42   70:getfield        #62  <Field Type[] typeArguments>
		//*  43   73:arraylength     
		//*  44   74:icmpge          105
			{
				stringbuilder.append(", ");
		//   45   77:aload_3         
		//   46   78:ldc1            #114 <String ", ">
		//   47   80:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//   48   83:pop             
				stringbuilder.append(.Gson.Types.typeToString(typeArguments[i]));
		//   49   84:aload_3         
		//   50   85:aload_0         
		//   51   86:getfield        #62  <Field Type[] typeArguments>
		//   52   89:iload_1         
		//   53   90:aaload          
		//   54   91:invokestatic    #104 <Method String $Gson$Types.typeToString(Type)>
		//   55   94:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//   56   97:pop             
			}

		//   57   98:iload_1         
		//   58   99:iconst_1        
		//   59  100:iadd            
		//   60  101:istore_1        
		//*  61  102:goto            68
			stringbuilder.append(">");
		//   62  105:aload_3         
		//   63  106:ldc1            #116 <String ">">
		//   64  108:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//   65  111:pop             
			return stringbuilder.toString();
		//   66  112:aload_3         
		//   67  113:invokevirtual   #110 <Method String StringBuilder.toString()>
		//   68  116:areturn         
		}

		private static final long serialVersionUID = 0L;
		private final Type ownerType;
		private final Type rawType;
		private final Type typeArguments[];

		public transient ParameterizedTypeImpl(Type type, Type type1, Type atype[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			boolean flag2 = type1 instanceof Class;
		//    2    4:aload_2         
		//    3    5:instanceof      #27  <Class Class>
		//    4    8:istore          6
			boolean flag1 = false;
		//    5   10:iconst_0        
		//    6   11:istore          5
			if(flag2)
		//*   7   13:iload           6
		//*   8   15:ifeq            90
			{
				Class class1 = (Class)type1;
		//    9   18:aload_2         
		//   10   19:checkcast       #27  <Class Class>
		//   11   22:astore          8
				boolean flag3 = Modifier.isStatic(class1.getModifiers());
		//   12   24:aload           8
		//   13   26:invokevirtual   #31  <Method int Class.getModifiers()>
		//   14   29:invokestatic    #37  <Method boolean Modifier.isStatic(int)>
		//   15   32:istore          6
				boolean flag4 = true;
		//   16   34:iconst_1        
		//   17   35:istore          7
				boolean flag;
				if(!flag3 && class1.getEnclosingClass() != null)
		//*  18   37:iload           6
		//*  19   39:ifne            59
		//*  20   42:aload           8
		//*  21   44:invokevirtual   #41  <Method Class Class.getEnclosingClass()>
		//*  22   47:ifnonnull       53
		//*  23   50:goto            59
					flag = false;
		//   24   53:iconst_0        
		//   25   54:istore          4
				else
		//*  26   56:goto            62
					flag = true;
		//   27   59:iconst_1        
		//   28   60:istore          4
				flag3 = flag4;
		//   29   62:iload           7
		//   30   64:istore          6
				if(type == null)
		//*  31   66:aload_1         
		//*  32   67:ifnonnull       85
					if(flag)
		//*  33   70:iload           4
		//*  34   72:ifeq            82
						flag3 = flag4;
		//   35   75:iload           7
		//   36   77:istore          6
					else
		//*  37   79:goto            85
						flag3 = false;
		//   38   82:iconst_0        
		//   39   83:istore          6
				.Gson.Preconditions.checkArgument(flag3);
		//   40   85:iload           6
		//   41   87:invokestatic    #47  <Method void $Gson$Preconditions.checkArgument(boolean)>
			}
			if(type == null)
		//*  42   90:aload_1         
		//*  43   91:ifnonnull       99
				type = null;
		//   44   94:aconst_null     
		//   45   95:astore_1        
			else
		//*  46   96:goto            104
				type = .Gson.Types.canonicalize(type);
		//   47   99:aload_1         
		//   48  100:invokestatic    #51  <Method Type $Gson$Types.canonicalize(Type)>
		//   49  103:astore_1        
			ownerType = type;
		//   50  104:aload_0         
		//   51  105:aload_1         
		//   52  106:putfield        #53  <Field Type ownerType>
			rawType = .Gson.Types.canonicalize(type1);
		//   53  109:aload_0         
		//   54  110:aload_2         
		//   55  111:invokestatic    #51  <Method Type $Gson$Types.canonicalize(Type)>
		//   56  114:putfield        #55  <Field Type rawType>
			typeArguments = (Type[])((Type []) (atype)).clone();
		//   57  117:aload_0         
		//   58  118:aload_3         
		//   59  119:invokevirtual   #60  <Method Object _5B_Ljava.lang.reflect.Type_3B_.clone()>
		//   60  122:checkcast       #56  <Class Type[]>
		//   61  125:putfield        #62  <Field Type[] typeArguments>
			for(int i = ((int) (flag1)); i < typeArguments.length; i++)
		//*  62  128:iload           5
		//*  63  130:istore          4
		//*  64  132:iload           4
		//*  65  134:aload_0         
		//*  66  135:getfield        #62  <Field Type[] typeArguments>
		//*  67  138:arraylength     
		//*  68  139:icmpge          189
			{
				.Gson.Preconditions.checkNotNull(((Object) (typeArguments[i])));
		//   69  142:aload_0         
		//   70  143:getfield        #62  <Field Type[] typeArguments>
		//   71  146:iload           4
		//   72  148:aaload          
		//   73  149:invokestatic    #66  <Method Object $Gson$Preconditions.checkNotNull(Object)>
		//   74  152:pop             
				.Gson.Types.checkNotPrimitive(typeArguments[i]);
		//   75  153:aload_0         
		//   76  154:getfield        #62  <Field Type[] typeArguments>
		//   77  157:iload           4
		//   78  159:aaload          
		//   79  160:invokestatic    #70  <Method void $Gson$Types.access$000(Type)>
				typeArguments[i] = .Gson.Types.canonicalize(typeArguments[i]);
		//   80  163:aload_0         
		//   81  164:getfield        #62  <Field Type[] typeArguments>
		//   82  167:iload           4
		//   83  169:aload_0         
		//   84  170:getfield        #62  <Field Type[] typeArguments>
		//   85  173:iload           4
		//   86  175:aaload          
		//   87  176:invokestatic    #51  <Method Type $Gson$Types.canonicalize(Type)>
		//   88  179:aastore         
			}

		//   89  180:iload           4
		//   90  182:iconst_1        
		//   91  183:iadd            
		//   92  184:istore          4
		//*  93  186:goto            132
		//   94  189:return          
		}
	}

	private static final class WildcardTypeImpl
		implements Serializable, WildcardType
	{

		public boolean equals(Object obj)
		{
			return (obj instanceof WildcardType) && .Gson.Types.equals(((Type) (this)), ((Type) ((WildcardType)obj)));
		//    0    0:aload_1         
		//    1    1:instanceof      #8   <Class WildcardType>
		//    2    4:ifeq            20
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #8   <Class WildcardType>
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
		//*   2    4:ifnull          21
				i = ((Object) (lowerBound)).hashCode() + 31;
		//    3    7:aload_0         
		//    4    8:getfield        #43  <Field Type lowerBound>
		//    5   11:invokevirtual   #64  <Method int Object.hashCode()>
		//    6   14:bipush          31
		//    7   16:iadd            
		//    8   17:istore_1        
			else
		//*   9   18:goto            23
				i = 1;
		//   10   21:iconst_1        
		//   11   22:istore_1        
			return i ^ ((Object) (upperBound)).hashCode() + 31;
		//   12   23:iload_1         
		//   13   24:aload_0         
		//   14   25:getfield        #45  <Field Type upperBound>
		//   15   28:invokevirtual   #64  <Method int Object.hashCode()>
		//   16   31:bipush          31
		//   17   33:iadd            
		//   18   34:ixor            
		//   19   35:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder;
			Type type;
			if(lowerBound != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #43  <Field Type lowerBound>
		//*   2    4:ifnull          41
			{
				stringbuilder = new StringBuilder();
		//    3    7:new             #68  <Class StringBuilder>
		//    4   10:dup             
		//    5   11:invokespecial   #69  <Method void StringBuilder()>
		//    6   14:astore_1        
				stringbuilder.append("? super ");
		//    7   15:aload_1         
		//    8   16:ldc1            #71  <String "? super ">
		//    9   18:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   10   21:pop             
				type = lowerBound;
		//   11   22:aload_0         
		//   12   23:getfield        #43  <Field Type lowerBound>
		//   13   26:astore_2        
			} else
		//*  14   27:aload_1         
		//*  15   28:aload_2         
		//*  16   29:invokestatic    #79  <Method String $Gson$Types.typeToString(Type)>
		//*  17   32:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//*  18   35:pop             
		//*  19   36:aload_1         
		//*  20   37:invokevirtual   #81  <Method String StringBuilder.toString()>
		//*  21   40:areturn         
			{
				if(upperBound == java/lang/Object)
		//*  22   41:aload_0         
		//*  23   42:getfield        #45  <Field Type upperBound>
		//*  24   45:ldc1            #4   <Class Object>
		//*  25   47:if_acmpne       53
					return "?";
		//   26   50:ldc1            #83  <String "?">
		//   27   52:areturn         
				stringbuilder = new StringBuilder();
		//   28   53:new             #68  <Class StringBuilder>
		//   29   56:dup             
		//   30   57:invokespecial   #69  <Method void StringBuilder()>
		//   31   60:astore_1        
				stringbuilder.append("? extends ");
		//   32   61:aload_1         
		//   33   62:ldc1            #85  <String "? extends ">
		//   34   64:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   35   67:pop             
				type = upperBound;
		//   36   68:aload_0         
		//   37   69:getfield        #45  <Field Type upperBound>
		//   38   72:astore_2        
			}
			stringbuilder.append(.Gson.Types.typeToString(type));
			return stringbuilder.toString();
		//*  39   73:goto            27
		}

		private static final long serialVersionUID = 0L;
		private final Type lowerBound;
		private final Type upperBound;

		public WildcardTypeImpl(Type atype[], Type atype1[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			int i = atype1.length;
		//    2    4:aload_2         
		//    3    5:arraylength     
		//    4    6:istore_3        
			boolean flag2 = true;
		//    5    7:iconst_1        
		//    6    8:istore          5
			boolean flag;
			if(i <= 1)
		//*   7   10:iload_3         
		//*   8   11:iconst_1        
		//*   9   12:icmpgt          21
				flag = true;
		//   10   15:iconst_1        
		//   11   16:istore          4
			else
		//*  12   18:goto            24
				flag = false;
		//   13   21:iconst_0        
		//   14   22:istore          4
			.Gson.Preconditions.checkArgument(flag);
		//   15   24:iload           4
		//   16   26:invokestatic    #29  <Method void $Gson$Preconditions.checkArgument(boolean)>
			if(atype.length == 1)
		//*  17   29:aload_1         
		//*  18   30:arraylength     
		//*  19   31:iconst_1        
		//*  20   32:icmpne          41
				flag = true;
		//   21   35:iconst_1        
		//   22   36:istore          4
			else
		//*  23   38:goto            44
				flag = false;
		//   24   41:iconst_0        
		//   25   42:istore          4
			.Gson.Preconditions.checkArgument(flag);
		//   26   44:iload           4
		//   27   46:invokestatic    #29  <Method void $Gson$Preconditions.checkArgument(boolean)>
			if(atype1.length == 1)
		//*  28   49:aload_2         
		//*  29   50:arraylength     
		//*  30   51:iconst_1        
		//*  31   52:icmpne          107
			{
				.Gson.Preconditions.checkNotNull(((Object) (atype1[0])));
		//   32   55:aload_2         
		//   33   56:iconst_0        
		//   34   57:aaload          
		//   35   58:invokestatic    #33  <Method Object $Gson$Preconditions.checkNotNull(Object)>
		//   36   61:pop             
				.Gson.Types.checkNotPrimitive(atype1[0]);
		//   37   62:aload_2         
		//   38   63:iconst_0        
		//   39   64:aaload          
		//   40   65:invokestatic    #37  <Method void $Gson$Types.access$000(Type)>
				boolean flag1;
				if(atype[0] == java/lang/Object)
		//*  41   68:aload_1         
		//*  42   69:iconst_0        
		//*  43   70:aaload          
		//*  44   71:ldc1            #4   <Class Object>
		//*  45   73:if_acmpne       83
					flag1 = flag2;
		//   46   76:iload           5
		//   47   78:istore          4
				else
		//*  48   80:goto            86
					flag1 = false;
		//   49   83:iconst_0        
		//   50   84:istore          4
				.Gson.Preconditions.checkArgument(flag1);
		//   51   86:iload           4
		//   52   88:invokestatic    #29  <Method void $Gson$Preconditions.checkArgument(boolean)>
				lowerBound = .Gson.Types.canonicalize(atype1[0]);
		//   53   91:aload_0         
		//   54   92:aload_2         
		//   55   93:iconst_0        
		//   56   94:aaload          
		//   57   95:invokestatic    #41  <Method Type $Gson$Types.canonicalize(Type)>
		//   58   98:putfield        #43  <Field Type lowerBound>
				atype = java/lang/Object;
		//   59  101:ldc1            #4   <Class Object>
		//   60  103:astore_1        
			} else
		//*  61  104:goto            132
			{
				.Gson.Preconditions.checkNotNull(((Object) (atype[0])));
		//   62  107:aload_1         
		//   63  108:iconst_0        
		//   64  109:aaload          
		//   65  110:invokestatic    #33  <Method Object $Gson$Preconditions.checkNotNull(Object)>
		//   66  113:pop             
				.Gson.Types.checkNotPrimitive(atype[0]);
		//   67  114:aload_1         
		//   68  115:iconst_0        
		//   69  116:aaload          
		//   70  117:invokestatic    #37  <Method void $Gson$Types.access$000(Type)>
				lowerBound = null;
		//   71  120:aload_0         
		//   72  121:aconst_null     
		//   73  122:putfield        #43  <Field Type lowerBound>
				atype = ((Type []) (.Gson.Types.canonicalize(atype[0])));
		//   74  125:aload_1         
		//   75  126:iconst_0        
		//   76  127:aaload          
		//   77  128:invokestatic    #41  <Method Type $Gson$Types.canonicalize(Type)>
		//   78  131:astore_1        
			}
			upperBound = ((Type) (atype));
		//   79  132:aload_0         
		//   80  133:aload_1         
		//   81  134:putfield        #45  <Field Type upperBound>
		//   82  137:return          
		}
	}


	public static GenericArrayType arrayOf(Type type)
	{
		return ((GenericArrayType) (new GenericArrayTypeImpl(type)));
	//    0    0:new             #6   <Class $Gson$Types$GenericArrayTypeImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #39  <Method void $Gson$Types$GenericArrayTypeImpl(Type)>
	//    4    8:areturn         
	}

	public static Type canonicalize(Type type)
	{
		if(type instanceof Class)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #43  <Class Class>
	//*   2    4:ifeq            41
		{
			Class class1 = (Class)type;
	//    3    7:aload_0         
	//    4    8:checkcast       #43  <Class Class>
	//    5   11:astore_1        
			type = ((Type) (class1));
	//    6   12:aload_1         
	//    7   13:astore_0        
			if(class1.isArray())
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #47  <Method boolean Class.isArray()>
	//*  10   18:ifeq            36
				type = ((Type) (new GenericArrayTypeImpl(canonicalize(((Type) (class1.getComponentType()))))));
	//   11   21:new             #6   <Class $Gson$Types$GenericArrayTypeImpl>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokevirtual   #51  <Method Class Class.getComponentType()>
	//   15   29:invokestatic    #53  <Method Type canonicalize(Type)>
	//   16   32:invokespecial   #39  <Method void $Gson$Types$GenericArrayTypeImpl(Type)>
	//   17   35:astore_0        
			return (Type)type;
	//   18   36:aload_0         
	//   19   37:checkcast       #19  <Class Type>
	//   20   40:areturn         
		}
		if(type instanceof ParameterizedType)
	//*  21   41:aload_0         
	//*  22   42:instanceof      #55  <Class ParameterizedType>
	//*  23   45:ifeq            79
		{
			type = ((Type) ((ParameterizedType)type));
	//   24   48:aload_0         
	//   25   49:checkcast       #55  <Class ParameterizedType>
	//   26   52:astore_0        
			return ((Type) (new ParameterizedTypeImpl(((ParameterizedType) (type)).getOwnerType(), ((ParameterizedType) (type)).getRawType(), ((ParameterizedType) (type)).getActualTypeArguments())));
	//   27   53:new             #9   <Class $Gson$Types$ParameterizedTypeImpl>
	//   28   56:dup             
	//   29   57:aload_0         
	//   30   58:invokeinterface #59  <Method Type ParameterizedType.getOwnerType()>
	//   31   63:aload_0         
	//   32   64:invokeinterface #62  <Method Type ParameterizedType.getRawType()>
	//   33   69:aload_0         
	//   34   70:invokeinterface #66  <Method Type[] ParameterizedType.getActualTypeArguments()>
	//   35   75:invokespecial   #69  <Method void $Gson$Types$ParameterizedTypeImpl(Type, Type, Type[])>
	//   36   78:areturn         
		}
		if(type instanceof GenericArrayType)
	//*  37   79:aload_0         
	//*  38   80:instanceof      #71  <Class GenericArrayType>
	//*  39   83:ifeq            103
			return ((Type) (new GenericArrayTypeImpl(((GenericArrayType)type).getGenericComponentType())));
	//   40   86:new             #6   <Class $Gson$Types$GenericArrayTypeImpl>
	//   41   89:dup             
	//   42   90:aload_0         
	//   43   91:checkcast       #71  <Class GenericArrayType>
	//   44   94:invokeinterface #74  <Method Type GenericArrayType.getGenericComponentType()>
	//   45   99:invokespecial   #39  <Method void $Gson$Types$GenericArrayTypeImpl(Type)>
	//   46  102:areturn         
		if(type instanceof WildcardType)
	//*  47  103:aload_0         
	//*  48  104:instanceof      #76  <Class WildcardType>
	//*  49  107:ifeq            135
		{
			type = ((Type) ((WildcardType)type));
	//   50  110:aload_0         
	//   51  111:checkcast       #76  <Class WildcardType>
	//   52  114:astore_0        
			return ((Type) (new WildcardTypeImpl(((WildcardType) (type)).getUpperBounds(), ((WildcardType) (type)).getLowerBounds())));
	//   53  115:new             #12  <Class $Gson$Types$WildcardTypeImpl>
	//   54  118:dup             
	//   55  119:aload_0         
	//   56  120:invokeinterface #79  <Method Type[] WildcardType.getUpperBounds()>
	//   57  125:aload_0         
	//   58  126:invokeinterface #82  <Method Type[] WildcardType.getLowerBounds()>
	//   59  131:invokespecial   #85  <Method void $Gson$Types$WildcardTypeImpl(Type[], Type[])>
	//   60  134:areturn         
		} else
		{
			return type;
	//   61  135:aload_0         
	//   62  136:areturn         
		}
	}

	private static void checkNotPrimitive(Type type)
	{
		boolean flag;
		if((type instanceof Class) && ((Class)type).isPrimitive())
	//*   0    0:aload_0         
	//*   1    1:instanceof      #43  <Class Class>
	//*   2    4:ifeq            25
	//*   3    7:aload_0         
	//*   4    8:checkcast       #43  <Class Class>
	//*   5   11:invokevirtual   #88  <Method boolean Class.isPrimitive()>
	//*   6   14:ifne            20
	//*   7   17:goto            25
			flag = false;
	//    8   20:iconst_0        
	//    9   21:istore_1        
		else
	//*  10   22:goto            27
			flag = true;
	//   11   25:iconst_1        
	//   12   26:istore_1        
		ditions.checkArgument(flag);
	//   13   27:iload_1         
	//   14   28:invokestatic    #94  <Method void $Gson$Preconditions.checkArgument(boolean)>
	//   15   31:return          
	}

	private static Class declaringClassOf(TypeVariable typevariable)
	{
		typevariable = ((TypeVariable) (typevariable.getGenericDeclaration()));
	//    0    0:aload_0         
	//    1    1:invokeinterface #102 <Method java.lang.reflect.GenericDeclaration TypeVariable.getGenericDeclaration()>
	//    2    6:astore_0        
		if(typevariable instanceof Class)
	//*   3    7:aload_0         
	//*   4    8:instanceof      #43  <Class Class>
	//*   5   11:ifeq            19
			return (Class)typevariable;
	//    6   14:aload_0         
	//    7   15:checkcast       #43  <Class Class>
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
	//    2    2:if_acmpeq       22
	//    3    5:aload_0         
	//    4    6:ifnull          20
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #110 <Method boolean Object.equals(Object)>
	//    8   14:ifeq            20
	//    9   17:goto            22
	//   10   20:iconst_0        
	//   11   21:ireturn         
	//   12   22:iconst_1        
	//   13   23:ireturn         
	}

	public static boolean equals(Type type, Type type1)
	{
		if(type == type1)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(type instanceof Class)
	//*   5    7:aload_0         
	//*   6    8:instanceof      #43  <Class Class>
	//*   7   11:ifeq            20
			return ((Object) (type)).equals(((Object) (type1)));
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #110 <Method boolean Object.equals(Object)>
	//   11   19:ireturn         
		if(type instanceof ParameterizedType)
	//*  12   20:aload_0         
	//*  13   21:instanceof      #55  <Class ParameterizedType>
	//*  14   24:ifeq            104
		{
			if(!(type1 instanceof ParameterizedType))
	//*  15   27:aload_1         
	//*  16   28:instanceof      #55  <Class ParameterizedType>
	//*  17   31:ifne            36
				return false;
	//   18   34:iconst_0        
	//   19   35:ireturn         
			type = ((Type) ((ParameterizedType)type));
	//   20   36:aload_0         
	//   21   37:checkcast       #55  <Class ParameterizedType>
	//   22   40:astore_0        
			type1 = ((Type) ((ParameterizedType)type1));
	//   23   41:aload_1         
	//   24   42:checkcast       #55  <Class ParameterizedType>
	//   25   45:astore_1        
			return equal(((Object) (((ParameterizedType) (type)).getOwnerType())), ((Object) (((ParameterizedType) (type1)).getOwnerType()))) && ((Object) (((ParameterizedType) (type)).getRawType())).equals(((Object) (((ParameterizedType) (type1)).getRawType()))) && Arrays.equals(((Object []) (((ParameterizedType) (type)).getActualTypeArguments())), ((Object []) (((ParameterizedType) (type1)).getActualTypeArguments())));
	//   26   46:aload_0         
	//   27   47:invokeinterface #59  <Method Type ParameterizedType.getOwnerType()>
	//   28   52:aload_1         
	//   29   53:invokeinterface #59  <Method Type ParameterizedType.getOwnerType()>
	//   30   58:invokestatic    #113 <Method boolean equal(Object, Object)>
	//   31   61:ifeq            102
	//   32   64:aload_0         
	//   33   65:invokeinterface #62  <Method Type ParameterizedType.getRawType()>
	//   34   70:aload_1         
	//   35   71:invokeinterface #62  <Method Type ParameterizedType.getRawType()>
	//   36   76:invokevirtual   #110 <Method boolean Object.equals(Object)>
	//   37   79:ifeq            102
	//   38   82:aload_0         
	//   39   83:invokeinterface #66  <Method Type[] ParameterizedType.getActualTypeArguments()>
	//   40   88:aload_1         
	//   41   89:invokeinterface #66  <Method Type[] ParameterizedType.getActualTypeArguments()>
	//   42   94:invokestatic    #118 <Method boolean Arrays.equals(Object[], Object[])>
	//   43   97:ifeq            102
	//   44  100:iconst_1        
	//   45  101:ireturn         
	//   46  102:iconst_0        
	//   47  103:ireturn         
		}
		if(type instanceof GenericArrayType)
	//*  48  104:aload_0         
	//*  49  105:instanceof      #71  <Class GenericArrayType>
	//*  50  108:ifeq            146
			if(!(type1 instanceof GenericArrayType))
	//*  51  111:aload_1         
	//*  52  112:instanceof      #71  <Class GenericArrayType>
	//*  53  115:ifne            120
			{
				return false;
	//   54  118:iconst_0        
	//   55  119:ireturn         
			} else
			{
				type = ((Type) ((GenericArrayType)type));
	//   56  120:aload_0         
	//   57  121:checkcast       #71  <Class GenericArrayType>
	//   58  124:astore_0        
				type1 = ((Type) ((GenericArrayType)type1));
	//   59  125:aload_1         
	//   60  126:checkcast       #71  <Class GenericArrayType>
	//   61  129:astore_1        
				return equals(((GenericArrayType) (type)).getGenericComponentType(), ((GenericArrayType) (type1)).getGenericComponentType());
	//   62  130:aload_0         
	//   63  131:invokeinterface #74  <Method Type GenericArrayType.getGenericComponentType()>
	//   64  136:aload_1         
	//   65  137:invokeinterface #74  <Method Type GenericArrayType.getGenericComponentType()>
	//   66  142:invokestatic    #120 <Method boolean equals(Type, Type)>
	//   67  145:ireturn         
			}
		if(type instanceof WildcardType)
	//*  68  146:aload_0         
	//*  69  147:instanceof      #76  <Class WildcardType>
	//*  70  150:ifeq            212
		{
			if(!(type1 instanceof WildcardType))
	//*  71  153:aload_1         
	//*  72  154:instanceof      #76  <Class WildcardType>
	//*  73  157:ifne            162
				return false;
	//   74  160:iconst_0        
	//   75  161:ireturn         
			type = ((Type) ((WildcardType)type));
	//   76  162:aload_0         
	//   77  163:checkcast       #76  <Class WildcardType>
	//   78  166:astore_0        
			type1 = ((Type) ((WildcardType)type1));
	//   79  167:aload_1         
	//   80  168:checkcast       #76  <Class WildcardType>
	//   81  171:astore_1        
			return Arrays.equals(((Object []) (((WildcardType) (type)).getUpperBounds())), ((Object []) (((WildcardType) (type1)).getUpperBounds()))) && Arrays.equals(((Object []) (((WildcardType) (type)).getLowerBounds())), ((Object []) (((WildcardType) (type1)).getLowerBounds())));
	//   82  172:aload_0         
	//   83  173:invokeinterface #79  <Method Type[] WildcardType.getUpperBounds()>
	//   84  178:aload_1         
	//   85  179:invokeinterface #79  <Method Type[] WildcardType.getUpperBounds()>
	//   86  184:invokestatic    #118 <Method boolean Arrays.equals(Object[], Object[])>
	//   87  187:ifeq            210
	//   88  190:aload_0         
	//   89  191:invokeinterface #82  <Method Type[] WildcardType.getLowerBounds()>
	//   90  196:aload_1         
	//   91  197:invokeinterface #82  <Method Type[] WildcardType.getLowerBounds()>
	//   92  202:invokestatic    #118 <Method boolean Arrays.equals(Object[], Object[])>
	//   93  205:ifeq            210
	//   94  208:iconst_1        
	//   95  209:ireturn         
	//   96  210:iconst_0        
	//   97  211:ireturn         
		}
		if(type instanceof TypeVariable)
	//*  98  212:aload_0         
	//*  99  213:instanceof      #98  <Class TypeVariable>
	//* 100  216:ifeq            275
		{
			if(!(type1 instanceof TypeVariable))
	//* 101  219:aload_1         
	//* 102  220:instanceof      #98  <Class TypeVariable>
	//* 103  223:ifne            228
				return false;
	//  104  226:iconst_0        
	//  105  227:ireturn         
			type = ((Type) ((TypeVariable)type));
	//  106  228:aload_0         
	//  107  229:checkcast       #98  <Class TypeVariable>
	//  108  232:astore_0        
			type1 = ((Type) ((TypeVariable)type1));
	//  109  233:aload_1         
	//  110  234:checkcast       #98  <Class TypeVariable>
	//  111  237:astore_1        
			return ((TypeVariable) (type)).getGenericDeclaration() == ((TypeVariable) (type1)).getGenericDeclaration() && ((TypeVariable) (type)).getName().equals(((Object) (((TypeVariable) (type1)).getName())));
	//  112  238:aload_0         
	//  113  239:invokeinterface #102 <Method java.lang.reflect.GenericDeclaration TypeVariable.getGenericDeclaration()>
	//  114  244:aload_1         
	//  115  245:invokeinterface #102 <Method java.lang.reflect.GenericDeclaration TypeVariable.getGenericDeclaration()>
	//  116  250:if_acmpne       273
	//  117  253:aload_0         
	//  118  254:invokeinterface #124 <Method String TypeVariable.getName()>
	//  119  259:aload_1         
	//  120  260:invokeinterface #124 <Method String TypeVariable.getName()>
	//  121  265:invokevirtual   #127 <Method boolean String.equals(Object)>
	//  122  268:ifeq            273
	//  123  271:iconst_1        
	//  124  272:ireturn         
	//  125  273:iconst_0        
	//  126  274:ireturn         
		} else
		{
			return false;
	//  127  275:iconst_0        
	//  128  276:ireturn         
		}
	}

	public static Type getArrayComponentType(Type type)
	{
		if(type instanceof GenericArrayType)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #71  <Class GenericArrayType>
	//*   2    4:ifeq            17
			return ((GenericArrayType)type).getGenericComponentType();
	//    3    7:aload_0         
	//    4    8:checkcast       #71  <Class GenericArrayType>
	//    5   11:invokeinterface #74  <Method Type GenericArrayType.getGenericComponentType()>
	//    6   16:areturn         
		else
			return ((Type) (((Class)type).getComponentType()));
	//    7   17:aload_0         
	//    8   18:checkcast       #43  <Class Class>
	//    9   21:invokevirtual   #51  <Method Class Class.getComponentType()>
	//   10   24:areturn         
	}

	public static Type getCollectionElementType(Type type, Class class1)
	{
		class1 = ((Class) (getSupertype(type, class1, java/util/Collection)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #132 <Class Collection>
	//    3    4:invokestatic    #136 <Method Type getSupertype(Type, Class, Class)>
	//    4    7:astore_1        
		type = ((Type) (class1));
	//    5    8:aload_1         
	//    6    9:astore_0        
		if(class1 instanceof WildcardType)
	//*   7   10:aload_1         
	//*   8   11:instanceof      #76  <Class WildcardType>
	//*   9   14:ifeq            29
			type = ((WildcardType)class1).getUpperBounds()[0];
	//   10   17:aload_1         
	//   11   18:checkcast       #76  <Class WildcardType>
	//   12   21:invokeinterface #79  <Method Type[] WildcardType.getUpperBounds()>
	//   13   26:iconst_0        
	//   14   27:aaload          
	//   15   28:astore_0        
		if(type instanceof ParameterizedType)
	//*  16   29:aload_0         
	//*  17   30:instanceof      #55  <Class ParameterizedType>
	//*  18   33:ifeq            48
			return ((ParameterizedType)type).getActualTypeArguments()[0];
	//   19   36:aload_0         
	//   20   37:checkcast       #55  <Class ParameterizedType>
	//   21   40:invokeinterface #66  <Method Type[] ParameterizedType.getActualTypeArguments()>
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
	//*   6    8:invokevirtual   #141 <Method boolean Class.isInterface()>
	//*   7   11:ifeq            76
		{
			type = ((Type) (class1.getInterfaces()));
	//    8   14:aload_1         
	//    9   15:invokevirtual   #145 <Method Class[] Class.getInterfaces()>
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
	//   25   39:invokevirtual   #148 <Method Type[] Class.getGenericInterfaces()>
	//   26   42:iload_3         
	//   27   43:aaload          
	//   28   44:areturn         
				if(class2.isAssignableFrom(((Class) (type[i]))))
	//*  29   45:aload_2         
	//*  30   46:aload_0         
	//*  31   47:iload_3         
	//*  32   48:aaload          
	//*  33   49:invokevirtual   #152 <Method boolean Class.isAssignableFrom(Class)>
	//*  34   52:ifeq            69
					return getGenericSupertype(class1.getGenericInterfaces()[i], ((Class) (type[i])), class2);
	//   35   55:aload_1         
	//   36   56:invokevirtual   #148 <Method Type[] Class.getGenericInterfaces()>
	//   37   59:iload_3         
	//   38   60:aaload          
	//   39   61:aload_0         
	//   40   62:iload_3         
	//   41   63:aaload          
	//   42   64:aload_2         
	//   43   65:invokestatic    #154 <Method Type getGenericSupertype(Type, Class, Class)>
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
	//*  51   77:invokevirtual   #141 <Method boolean Class.isInterface()>
	//*  52   80:ifne            127
			for(; class1 != java/lang/Object; class1 = ((Class) (type)))
	//*  53   83:aload_1         
	//*  54   84:ldc1            #4   <Class Object>
	//*  55   86:if_acmpeq       127
			{
				type = ((Type) (class1.getSuperclass()));
	//   56   89:aload_1         
	//   57   90:invokevirtual   #157 <Method Class Class.getSuperclass()>
	//   58   93:astore_0        
				if(type == class2)
	//*  59   94:aload_0         
	//*  60   95:aload_2         
	//*  61   96:if_acmpne       104
					return class1.getGenericSuperclass();
	//   62   99:aload_1         
	//   63  100:invokevirtual   #160 <Method Type Class.getGenericSuperclass()>
	//   64  103:areturn         
				if(class2.isAssignableFrom(((Class) (type))))
	//*  65  104:aload_2         
	//*  66  105:aload_0         
	//*  67  106:invokevirtual   #152 <Method boolean Class.isAssignableFrom(Class)>
	//*  68  109:ifeq            122
					return getGenericSupertype(class1.getGenericSuperclass(), ((Class) (type)), class2);
	//   69  112:aload_1         
	//   70  113:invokevirtual   #160 <Method Type Class.getGenericSuperclass()>
	//   71  116:aload_0         
	//   72  117:aload_2         
	//   73  118:invokestatic    #154 <Method Type getGenericSupertype(Type, Class, Class)>
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
	//*   1    1:ldc1            #165 <Class Properties>
	//*   2    3:if_acmpne       21
			return (new Type[] {
				java/lang/String, java/lang/String
			});
	//    3    6:iconst_2        
	//    4    7:anewarray       Type[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:ldc1            #126 <Class String>
	//    8   14:aastore         
	//    9   15:dup             
	//   10   16:iconst_1        
	//   11   17:ldc1            #126 <Class String>
	//   12   19:aastore         
	//   13   20:areturn         
		type = getSupertype(type, class1, java/util/Map);
	//   14   21:aload_0         
	//   15   22:aload_1         
	//   16   23:ldc1            #167 <Class Map>
	//   17   25:invokestatic    #136 <Method Type getSupertype(Type, Class, Class)>
	//   18   28:astore_0        
		if(type instanceof ParameterizedType)
	//*  19   29:aload_0         
	//*  20   30:instanceof      #55  <Class ParameterizedType>
	//*  21   33:ifeq            46
			return ((ParameterizedType)type).getActualTypeArguments();
	//   22   36:aload_0         
	//   23   37:checkcast       #55  <Class ParameterizedType>
	//   24   40:invokeinterface #66  <Method Type[] ParameterizedType.getActualTypeArguments()>
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
	//*   1    1:instanceof      #43  <Class Class>
	//*   2    4:ifeq            12
			return (Class)type;
	//    3    7:aload_0         
	//    4    8:checkcast       #43  <Class Class>
	//    5   11:areturn         
		if(type instanceof ParameterizedType)
	//*   6   12:aload_0         
	//*   7   13:instanceof      #55  <Class ParameterizedType>
	//*   8   16:ifeq            41
		{
			type = ((ParameterizedType)type).getRawType();
	//    9   19:aload_0         
	//   10   20:checkcast       #55  <Class ParameterizedType>
	//   11   23:invokeinterface #62  <Method Type ParameterizedType.getRawType()>
	//   12   28:astore_0        
			ditions.checkArgument(type instanceof Class);
	//   13   29:aload_0         
	//   14   30:instanceof      #43  <Class Class>
	//   15   33:invokestatic    #94  <Method void $Gson$Preconditions.checkArgument(boolean)>
			return (Class)type;
	//   16   36:aload_0         
	//   17   37:checkcast       #43  <Class Class>
	//   18   40:areturn         
		}
		if(type instanceof GenericArrayType)
	//*  19   41:aload_0         
	//*  20   42:instanceof      #71  <Class GenericArrayType>
	//*  21   45:ifeq            68
			return Array.newInstance(getRawType(((GenericArrayType)type).getGenericComponentType()), 0).getClass();
	//   22   48:aload_0         
	//   23   49:checkcast       #71  <Class GenericArrayType>
	//   24   52:invokeinterface #74  <Method Type GenericArrayType.getGenericComponentType()>
	//   25   57:invokestatic    #171 <Method Class getRawType(Type)>
	//   26   60:iconst_0        
	//   27   61:invokestatic    #177 <Method Object Array.newInstance(Class, int)>
	//   28   64:invokevirtual   #180 <Method Class Object.getClass()>
	//   29   67:areturn         
		if(type instanceof TypeVariable)
	//*  30   68:aload_0         
	//*  31   69:instanceof      #98  <Class TypeVariable>
	//*  32   72:ifeq            78
			return java/lang/Object;
	//   33   75:ldc1            #4   <Class Object>
	//   34   77:areturn         
		if(type instanceof WildcardType)
	//*  35   78:aload_0         
	//*  36   79:instanceof      #76  <Class WildcardType>
	//*  37   82:ifeq            100
			return getRawType(((WildcardType)type).getUpperBounds()[0]);
	//   38   85:aload_0         
	//   39   86:checkcast       #76  <Class WildcardType>
	//   40   89:invokeinterface #79  <Method Type[] WildcardType.getUpperBounds()>
	//   41   94:iconst_0        
	//   42   95:aaload          
	//   43   96:invokestatic    #171 <Method Class getRawType(Type)>
	//   44   99:areturn         
		String s;
		if(type == null)
	//*  45  100:aload_0         
	//*  46  101:ifnonnull       110
			s = "null";
	//   47  104:ldc1            #182 <String "null">
	//   48  106:astore_1        
		else
	//*  49  107:goto            118
			s = ((Object) (type)).getClass().getName();
	//   50  110:aload_0         
	//   51  111:invokevirtual   #180 <Method Class Object.getClass()>
	//   52  114:invokevirtual   #183 <Method String Class.getName()>
	//   53  117:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   54  118:new             #185 <Class StringBuilder>
	//   55  121:dup             
	//   56  122:invokespecial   #186 <Method void StringBuilder()>
	//   57  125:astore_2        
		stringbuilder.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
	//   58  126:aload_2         
	//   59  127:ldc1            #188 <String "Expected a Class, ParameterizedType, or GenericArrayType, but <">
	//   60  129:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   61  132:pop             
		stringbuilder.append(((Object) (type)));
	//   62  133:aload_2         
	//   63  134:aload_0         
	//   64  135:invokevirtual   #195 <Method StringBuilder StringBuilder.append(Object)>
	//   65  138:pop             
		stringbuilder.append("> is of type ");
	//   66  139:aload_2         
	//   67  140:ldc1            #197 <String "> is of type ">
	//   68  142:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   69  145:pop             
		stringbuilder.append(s);
	//   70  146:aload_2         
	//   71  147:aload_1         
	//   72  148:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   73  151:pop             
		throw new IllegalArgumentException(stringbuilder.toString());
	//   74  152:new             #199 <Class IllegalArgumentException>
	//   75  155:dup             
	//   76  156:aload_2         
	//   77  157:invokevirtual   #202 <Method String StringBuilder.toString()>
	//   78  160:invokespecial   #205 <Method void IllegalArgumentException(String)>
	//   79  163:athrow          
	}

	static Type getSupertype(Type type, Class class1, Class class2)
	{
		ditions.checkArgument(class2.isAssignableFrom(class1));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #152 <Method boolean Class.isAssignableFrom(Class)>
	//    3    5:invokestatic    #94  <Method void $Gson$Preconditions.checkArgument(boolean)>
		return resolve(type, class1, getGenericSupertype(type, class1, class2));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:invokestatic    #154 <Method Type getGenericSupertype(Type, Class, Class)>
	//   10   16:invokestatic    #210 <Method Type resolve(Type, Class, Type)>
	//   11   19:areturn         
	}

	private static int hashCodeOrZero(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          9
			return obj.hashCode();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #214 <Method int Object.hashCode()>
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
	//*  10   12:invokevirtual   #110 <Method boolean Object.equals(Object)>
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
	//   19   27:new             #218 <Class NoSuchElementException>
	//   20   30:dup             
	//   21   31:invokespecial   #219 <Method void NoSuchElementException()>
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
	//    5    7:invokespecial   #69  <Method void $Gson$Types$ParameterizedTypeImpl(Type, Type, Type[])>
	//    6   10:areturn         
	}

	public static Type resolve(Type type, Class class1, Type type1)
	{
		while(type1 instanceof TypeVariable) 
	//*   0    0:aload_2         
	//*   1    1:instanceof      #98  <Class TypeVariable>
	//*   2    4:ifeq            32
		{
			TypeVariable typevariable = (TypeVariable)type1;
	//    3    7:aload_2         
	//    4    8:checkcast       #98  <Class TypeVariable>
	//    5   11:astore          8
			type1 = resolveTypeVariable(type, class1, typevariable);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:aload           8
	//    9   17:invokestatic    #225 <Method Type resolveTypeVariable(Type, Class, TypeVariable)>
	//   10   20:astore_2        
			if(type1 == typevariable)
	//*  11   21:aload_2         
	//*  12   22:aload           8
	//*  13   24:if_acmpne       29
				return type1;
	//   14   27:aload_2         
	//   15   28:areturn         
		}
	//*  16   29:goto            0
		if(type1 instanceof Class)
	//*  17   32:aload_2         
	//*  18   33:instanceof      #43  <Class Class>
	//*  19   36:ifeq            79
		{
			Class class2 = (Class)type1;
	//   20   39:aload_2         
	//   21   40:checkcast       #43  <Class Class>
	//   22   43:astore          8
			if(class2.isArray())
	//*  23   45:aload           8
	//*  24   47:invokevirtual   #47  <Method boolean Class.isArray()>
	//*  25   50:ifeq            79
			{
				type1 = ((Type) (class2.getComponentType()));
	//   26   53:aload           8
	//   27   55:invokevirtual   #51  <Method Class Class.getComponentType()>
	//   28   58:astore_2        
				type = resolve(type, class1, type1);
	//   29   59:aload_0         
	//   30   60:aload_1         
	//   31   61:aload_2         
	//   32   62:invokestatic    #210 <Method Type resolve(Type, Class, Type)>
	//   33   65:astore_0        
				if(type1 == type)
	//*  34   66:aload_2         
	//*  35   67:aload_0         
	//*  36   68:if_acmpne       74
					return ((Type) (class2));
	//   37   71:aload           8
	//   38   73:areturn         
				else
					return ((Type) (arrayOf(type)));
	//   39   74:aload_0         
	//   40   75:invokestatic    #227 <Method GenericArrayType arrayOf(Type)>
	//   41   78:areturn         
			}
		}
		if(type1 instanceof GenericArrayType)
	//*  42   79:aload_2         
	//*  43   80:instanceof      #71  <Class GenericArrayType>
	//*  44   83:ifeq            120
		{
			type1 = ((Type) ((GenericArrayType)type1));
	//   45   86:aload_2         
	//   46   87:checkcast       #71  <Class GenericArrayType>
	//   47   90:astore_2        
			Type type2 = ((GenericArrayType) (type1)).getGenericComponentType();
	//   48   91:aload_2         
	//   49   92:invokeinterface #74  <Method Type GenericArrayType.getGenericComponentType()>
	//   50   97:astore          8
			type = resolve(type, class1, type2);
	//   51   99:aload_0         
	//   52  100:aload_1         
	//   53  101:aload           8
	//   54  103:invokestatic    #210 <Method Type resolve(Type, Class, Type)>
	//   55  106:astore_0        
			if(type2 == type)
	//*  56  107:aload           8
	//*  57  109:aload_0         
	//*  58  110:if_acmpne       115
				return type1;
	//   59  113:aload_2         
	//   60  114:areturn         
			else
				return ((Type) (arrayOf(type)));
	//   61  115:aload_0         
	//   62  116:invokestatic    #227 <Method GenericArrayType arrayOf(Type)>
	//   63  119:areturn         
		}
		boolean flag2 = type1 instanceof ParameterizedType;
	//   64  120:aload_2         
	//   65  121:instanceof      #55  <Class ParameterizedType>
	//   66  124:istore          7
		int i = 0;
	//   67  126:iconst_0        
	//   68  127:istore          5
		if(flag2)
	//*  69  129:iload           7
	//*  70  131:ifeq            281
		{
			ParameterizedType parameterizedtype = (ParameterizedType)type1;
	//   71  134:aload_2         
	//   72  135:checkcast       #55  <Class ParameterizedType>
	//   73  138:astore          9
			type1 = parameterizedtype.getOwnerType();
	//   74  140:aload           9
	//   75  142:invokeinterface #59  <Method Type ParameterizedType.getOwnerType()>
	//   76  147:astore_2        
			Type type4 = resolve(type, class1, type1);
	//   77  148:aload_0         
	//   78  149:aload_1         
	//   79  150:aload_2         
	//   80  151:invokestatic    #210 <Method Type resolve(Type, Class, Type)>
	//   81  154:astore          10
			boolean flag;
			if(type4 != type1)
	//*  82  156:aload           10
	//*  83  158:aload_2         
	//*  84  159:if_acmpeq       167
				flag = true;
	//   85  162:iconst_1        
	//   86  163:istore_3        
			else
	//*  87  164:goto            169
				flag = false;
	//   88  167:iconst_0        
	//   89  168:istore_3        
			type1 = ((Type) (parameterizedtype.getActualTypeArguments()));
	//   90  169:aload           9
	//   91  171:invokeinterface #66  <Method Type[] ParameterizedType.getActualTypeArguments()>
	//   92  176:astore_2        
			for(int j = type1.length; i < j;)
	//*  93  177:aload_2         
	//*  94  178:arraylength     
	//*  95  179:istore          6
	//*  96  181:iload           5
	//*  97  183:iload           6
	//*  98  185:icmpge          258
			{
				Type type5 = resolve(type, class1, ((Type) (type1[i])));
	//   99  188:aload_0         
	//  100  189:aload_1         
	//  101  190:aload_2         
	//  102  191:iload           5
	//  103  193:aaload          
	//  104  194:invokestatic    #210 <Method Type resolve(Type, Class, Type)>
	//  105  197:astore          11
				boolean flag1 = flag;
	//  106  199:iload_3         
	//  107  200:istore          4
				Object obj = ((Object) (type1));
	//  108  202:aload_2         
	//  109  203:astore          8
				if(type5 != type1[i])
	//* 110  205:aload           11
	//* 111  207:aload_2         
	//* 112  208:iload           5
	//* 113  210:aaload          
	//* 114  211:if_acmpeq       243
				{
					flag1 = flag;
	//  115  214:iload_3         
	//  116  215:istore          4
					obj = ((Object) (type1));
	//  117  217:aload_2         
	//  118  218:astore          8
					if(!flag)
	//* 119  220:iload_3         
	//* 120  221:ifne            236
					{
						obj = ((Object) ((Type[])((Type []) (type1)).clone()));
	//  121  224:aload_2         
	//  122  225:invokevirtual   #232 <Method Object _5B_Ljava.lang.reflect.Type_3B_.clone()>
	//  123  228:checkcast       #228 <Class Type[]>
	//  124  231:astore          8
						flag1 = true;
	//  125  233:iconst_1        
	//  126  234:istore          4
					}
					obj[i] = ((/*<invalid signature>*/java.lang.Object) (type5));
	//  127  236:aload           8
	//  128  238:iload           5
	//  129  240:aload           11
	//  130  242:aastore         
				}
				i++;
	//  131  243:iload           5
	//  132  245:iconst_1        
	//  133  246:iadd            
	//  134  247:istore          5
				flag = flag1;
	//  135  249:iload           4
	//  136  251:istore_3        
				type1 = ((Type) (obj));
	//  137  252:aload           8
	//  138  254:astore_2        
			}

	//* 139  255:goto            181
			type = ((Type) (parameterizedtype));
	//  140  258:aload           9
	//  141  260:astore_0        
			if(flag)
	//* 142  261:iload_3         
	//* 143  262:ifeq            279
				type = ((Type) (newParameterizedTypeWithOwner(type4, parameterizedtype.getRawType(), ((Type []) (type1)))));
	//  144  265:aload           10
	//  145  267:aload           9
	//  146  269:invokeinterface #62  <Method Type ParameterizedType.getRawType()>
	//  147  274:aload_2         
	//  148  275:invokestatic    #234 <Method ParameterizedType newParameterizedTypeWithOwner(Type, Type, Type[])>
	//  149  278:astore_0        
			return type;
	//  150  279:aload_0         
	//  151  280:areturn         
		}
		Type type3 = type1;
	//  152  281:aload_2         
	//  153  282:astore          8
		if(type1 instanceof WildcardType)
	//* 154  284:aload_2         
	//* 155  285:instanceof      #76  <Class WildcardType>
	//* 156  288:ifeq            381
		{
			type1 = ((Type) ((WildcardType)type1));
	//  157  291:aload_2         
	//  158  292:checkcast       #76  <Class WildcardType>
	//  159  295:astore_2        
			Type atype[] = ((WildcardType) (type1)).getLowerBounds();
	//  160  296:aload_2         
	//  161  297:invokeinterface #82  <Method Type[] WildcardType.getLowerBounds()>
	//  162  302:astore          9
			Type atype1[] = ((WildcardType) (type1)).getUpperBounds();
	//  163  304:aload_2         
	//  164  305:invokeinterface #79  <Method Type[] WildcardType.getUpperBounds()>
	//  165  310:astore          10
			if(atype.length == 1)
	//* 166  312:aload           9
	//* 167  314:arraylength     
	//* 168  315:iconst_1        
	//* 169  316:icmpne          345
			{
				type = resolve(type, class1, atype[0]);
	//  170  319:aload_0         
	//  171  320:aload_1         
	//  172  321:aload           9
	//  173  323:iconst_0        
	//  174  324:aaload          
	//  175  325:invokestatic    #210 <Method Type resolve(Type, Class, Type)>
	//  176  328:astore_0        
				type3 = type1;
	//  177  329:aload_2         
	//  178  330:astore          8
				if(type != atype[0])
	//* 179  332:aload_0         
	//* 180  333:aload           9
	//* 181  335:iconst_0        
	//* 182  336:aaload          
	//* 183  337:if_acmpeq       381
					return ((Type) (supertypeOf(type)));
	//  184  340:aload_0         
	//  185  341:invokestatic    #238 <Method WildcardType supertypeOf(Type)>
	//  186  344:areturn         
			} else
			{
				type3 = type1;
	//  187  345:aload_2         
	//  188  346:astore          8
				if(atype1.length == 1)
	//* 189  348:aload           10
	//* 190  350:arraylength     
	//* 191  351:iconst_1        
	//* 192  352:icmpne          381
				{
					type = resolve(type, class1, atype1[0]);
	//  193  355:aload_0         
	//  194  356:aload_1         
	//  195  357:aload           10
	//  196  359:iconst_0        
	//  197  360:aaload          
	//  198  361:invokestatic    #210 <Method Type resolve(Type, Class, Type)>
	//  199  364:astore_0        
					type3 = type1;
	//  200  365:aload_2         
	//  201  366:astore          8
					if(type != atype1[0])
	//* 202  368:aload_0         
	//* 203  369:aload           10
	//* 204  371:iconst_0        
	//* 205  372:aaload          
	//* 206  373:if_acmpeq       381
						return ((Type) (subtypeOf(type)));
	//  207  376:aload_0         
	//  208  377:invokestatic    #241 <Method WildcardType subtypeOf(Type)>
	//  209  380:areturn         
				}
			}
		}
		return type3;
	//  210  381:aload           8
	//  211  383:areturn         
	}

	static Type resolveTypeVariable(Type type, Class class1, TypeVariable typevariable)
	{
		Class class2 = declaringClassOf(typevariable);
	//    0    0:aload_2         
	//    1    1:invokestatic    #244 <Method Class declaringClassOf(TypeVariable)>
	//    2    4:astore          4
		if(class2 == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       13
			return ((Type) (typevariable));
	//    5   11:aload_2         
	//    6   12:areturn         
		type = getGenericSupertype(type, class1, class2);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload           4
	//   10   17:invokestatic    #154 <Method Type getGenericSupertype(Type, Class, Class)>
	//   11   20:astore_0        
		if(type instanceof ParameterizedType)
	//*  12   21:aload_0         
	//*  13   22:instanceof      #55  <Class ParameterizedType>
	//*  14   25:ifeq            50
		{
			int i = indexOf(((Object []) (class2.getTypeParameters())), ((Object) (typevariable)));
	//   15   28:aload           4
	//   16   30:invokevirtual   #248 <Method TypeVariable[] Class.getTypeParameters()>
	//   17   33:aload_2         
	//   18   34:invokestatic    #250 <Method int indexOf(Object[], Object)>
	//   19   37:istore_3        
			return ((ParameterizedType)type).getActualTypeArguments()[i];
	//   20   38:aload_0         
	//   21   39:checkcast       #55  <Class ParameterizedType>
	//   22   42:invokeinterface #66  <Method Type[] ParameterizedType.getActualTypeArguments()>
	//   23   47:iload_3         
	//   24   48:aaload          
	//   25   49:areturn         
		} else
		{
			return ((Type) (typevariable));
	//   26   50:aload_2         
	//   27   51:areturn         
		}
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
	//   11   17:invokespecial   #85  <Method void $Gson$Types$WildcardTypeImpl(Type[], Type[])>
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
	//   14   21:invokespecial   #85  <Method void $Gson$Types$WildcardTypeImpl(Type[], Type[])>
	//   15   24:areturn         
	}

	public static String typeToString(Type type)
	{
		if(type instanceof Class)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #43  <Class Class>
	//*   2    4:ifeq            15
			return ((Class)type).getName();
	//    3    7:aload_0         
	//    4    8:checkcast       #43  <Class Class>
	//    5   11:invokevirtual   #183 <Method String Class.getName()>
	//    6   14:areturn         
		else
			return ((Object) (type)).toString();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #254 <Method String Object.toString()>
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
	//    1    1:invokestatic    #30  <Method void checkNotPrimitive(Type)>
		return;
	//    2    4:return          
	}

*/


/*
	static int access$100(Object obj)
	{
		return hashCodeOrZero(obj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #35  <Method int hashCodeOrZero(Object)>
	//    2    4:ireturn         
	}

*/

	private $Gson$Types()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}
}
