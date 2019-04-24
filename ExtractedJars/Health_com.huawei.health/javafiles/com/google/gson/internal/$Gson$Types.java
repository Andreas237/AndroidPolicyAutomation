// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.*;
import java.util.*;

public final class $Gson$Types
{
	static final class GenericArrayTypeImpl
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

	static final class ParameterizedTypeImpl
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
		//    9   19:invokestatic    #93  <Method int $Gson$Types.hashCodeOrZero(Object)>
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
			if(j == 0)
		//*   4    6:iload_2         
		//*   5    7:ifne            18
				return .Gson.Types.typeToString(rawType);
		//    6   10:aload_0         
		//    7   11:getfield        #55  <Field Type rawType>
		//    8   14:invokestatic    #99  <Method String $Gson$Types.typeToString(Type)>
		//    9   17:areturn         
			StringBuilder stringbuilder = new StringBuilder((j + 1) * 30);
		//   10   18:new             #101 <Class StringBuilder>
		//   11   21:dup             
		//   12   22:iload_2         
		//   13   23:iconst_1        
		//   14   24:iadd            
		//   15   25:bipush          30
		//   16   27:imul            
		//   17   28:invokespecial   #104 <Method void StringBuilder(int)>
		//   18   31:astore_3        
			stringbuilder.append(.Gson.Types.typeToString(rawType)).append("<").append(.Gson.Types.typeToString(typeArguments[0]));
		//   19   32:aload_3         
		//   20   33:aload_0         
		//   21   34:getfield        #55  <Field Type rawType>
		//   22   37:invokestatic    #99  <Method String $Gson$Types.typeToString(Type)>
		//   23   40:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//   24   43:ldc1            #110 <String "<">
		//   25   45:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//   26   48:aload_0         
		//   27   49:getfield        #62  <Field Type[] typeArguments>
		//   28   52:iconst_0        
		//   29   53:aaload          
		//   30   54:invokestatic    #99  <Method String $Gson$Types.typeToString(Type)>
		//   31   57:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//   32   60:pop             
			for(int i = 1; i < j; i++)
		//*  33   61:iconst_1        
		//*  34   62:istore_1        
		//*  35   63:iload_1         
		//*  36   64:iload_2         
		//*  37   65:icmpge          94
				stringbuilder.append(", ").append(.Gson.Types.typeToString(typeArguments[i]));
		//   38   68:aload_3         
		//   39   69:ldc1            #112 <String ", ">
		//   40   71:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//   41   74:aload_0         
		//   42   75:getfield        #62  <Field Type[] typeArguments>
		//   43   78:iload_1         
		//   44   79:aaload          
		//   45   80:invokestatic    #99  <Method String $Gson$Types.typeToString(Type)>
		//   46   83:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//   47   86:pop             

		//   48   87:iload_1         
		//   49   88:iconst_1        
		//   50   89:iadd            
		//   51   90:istore_1        
		//*  52   91:goto            63
			return stringbuilder.append(">").toString();
		//   53   94:aload_3         
		//   54   95:ldc1            #114 <String ">">
		//   55   97:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//   56  100:invokevirtual   #116 <Method String StringBuilder.toString()>
		//   57  103:areturn         
		}

		private static final long serialVersionUID = 0L;
		private final Type ownerType;
		private final Type rawType;
		private final Type typeArguments[];

		public transient ParameterizedTypeImpl(Type type, Type type1, Type atype[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			if(type1 instanceof Class)
		//*   2    4:aload_2         
		//*   3    5:instanceof      #27  <Class Class>
		//*   4    8:ifeq            68
			{
				Class class1 = (Class)type1;
		//    5   11:aload_2         
		//    6   12:checkcast       #27  <Class Class>
		//    7   15:astore          7
				boolean flag;
				if(Modifier.isStatic(class1.getModifiers()) || class1.getEnclosingClass() == null)
		//*   8   17:aload           7
		//*   9   19:invokevirtual   #31  <Method int Class.getModifiers()>
		//*  10   22:invokestatic    #37  <Method boolean Modifier.isStatic(int)>
		//*  11   25:ifne            36
		//*  12   28:aload           7
		//*  13   30:invokevirtual   #41  <Method Class Class.getEnclosingClass()>
		//*  14   33:ifnonnull       42
					flag = true;
		//   15   36:iconst_1        
		//   16   37:istore          4
				else
		//*  17   39:goto            45
					flag = false;
		//   18   42:iconst_0        
		//   19   43:istore          4
				boolean flag1;
				if(type != null || flag)
		//*  20   45:aload_1         
		//*  21   46:ifnonnull       54
		//*  22   49:iload           4
		//*  23   51:ifeq            60
					flag1 = true;
		//   24   54:iconst_1        
		//   25   55:istore          6
				else
		//*  26   57:goto            63
					flag1 = false;
		//   27   60:iconst_0        
		//   28   61:istore          6
				.Gson.Preconditions.checkArgument(flag1);
		//   29   63:iload           6
		//   30   65:invokestatic    #47  <Method void $Gson$Preconditions.checkArgument(boolean)>
			}
			if(type == null)
		//*  31   68:aload_1         
		//*  32   69:ifnonnull       77
				type = null;
		//   33   72:aconst_null     
		//   34   73:astore_1        
			else
		//*  35   74:goto            82
				type = .Gson.Types.canonicalize(type);
		//   36   77:aload_1         
		//   37   78:invokestatic    #51  <Method Type $Gson$Types.canonicalize(Type)>
		//   38   81:astore_1        
			ownerType = type;
		//   39   82:aload_0         
		//   40   83:aload_1         
		//   41   84:putfield        #53  <Field Type ownerType>
			rawType = .Gson.Types.canonicalize(type1);
		//   42   87:aload_0         
		//   43   88:aload_2         
		//   44   89:invokestatic    #51  <Method Type $Gson$Types.canonicalize(Type)>
		//   45   92:putfield        #55  <Field Type rawType>
			typeArguments = (Type[])((Type []) (atype)).clone();
		//   46   95:aload_0         
		//   47   96:aload_3         
		//   48   97:invokevirtual   #60  <Method Object _5B_Ljava.lang.reflect.Type_3B_.clone()>
		//   49  100:checkcast       #56  <Class Type[]>
		//   50  103:putfield        #62  <Field Type[] typeArguments>
			int i = 0;
		//   51  106:iconst_0        
		//   52  107:istore          4
			for(int j = typeArguments.length; i < j; i++)
		//*  53  109:aload_0         
		//*  54  110:getfield        #62  <Field Type[] typeArguments>
		//*  55  113:arraylength     
		//*  56  114:istore          5
		//*  57  116:iload           4
		//*  58  118:iload           5
		//*  59  120:icmpge          170
			{
				.Gson.Preconditions.checkNotNull(((Object) (typeArguments[i])));
		//   60  123:aload_0         
		//   61  124:getfield        #62  <Field Type[] typeArguments>
		//   62  127:iload           4
		//   63  129:aaload          
		//   64  130:invokestatic    #66  <Method Object $Gson$Preconditions.checkNotNull(Object)>
		//   65  133:pop             
				.Gson.Types.checkNotPrimitive(typeArguments[i]);
		//   66  134:aload_0         
		//   67  135:getfield        #62  <Field Type[] typeArguments>
		//   68  138:iload           4
		//   69  140:aaload          
		//   70  141:invokestatic    #70  <Method void $Gson$Types.checkNotPrimitive(Type)>
				typeArguments[i] = .Gson.Types.canonicalize(typeArguments[i]);
		//   71  144:aload_0         
		//   72  145:getfield        #62  <Field Type[] typeArguments>
		//   73  148:iload           4
		//   74  150:aload_0         
		//   75  151:getfield        #62  <Field Type[] typeArguments>
		//   76  154:iload           4
		//   77  156:aaload          
		//   78  157:invokestatic    #51  <Method Type $Gson$Types.canonicalize(Type)>
		//   79  160:aastore         
			}

		//   80  161:iload           4
		//   81  163:iconst_1        
		//   82  164:iadd            
		//   83  165:istore          4
		//*  84  167:goto            116
		//   85  170:return          
		}
	}

	static final class WildcardTypeImpl
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
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			boolean flag;
			if(atype1.length <= 1)
		//*   2    4:aload_2         
		//*   3    5:arraylength     
		//*   4    6:iconst_1        
		//*   5    7:icmpgt          15
				flag = true;
		//    6   10:iconst_1        
		//    7   11:istore_3        
			else
		//*   8   12:goto            17
				flag = false;
		//    9   15:iconst_0        
		//   10   16:istore_3        
			.Gson.Preconditions.checkArgument(flag);
		//   11   17:iload_3         
		//   12   18:invokestatic    #29  <Method void $Gson$Preconditions.checkArgument(boolean)>
			if(atype.length == 1)
		//*  13   21:aload_1         
		//*  14   22:arraylength     
		//*  15   23:iconst_1        
		//*  16   24:icmpne          32
				flag = true;
		//   17   27:iconst_1        
		//   18   28:istore_3        
			else
		//*  19   29:goto            34
				flag = false;
		//   20   32:iconst_0        
		//   21   33:istore_3        
			.Gson.Preconditions.checkArgument(flag);
		//   22   34:iload_3         
		//   23   35:invokestatic    #29  <Method void $Gson$Preconditions.checkArgument(boolean)>
			if(atype1.length == 1)
		//*  24   38:aload_2         
		//*  25   39:arraylength     
		//*  26   40:iconst_1        
		//*  27   41:icmpne          93
			{
				.Gson.Preconditions.checkNotNull(((Object) (atype1[0])));
		//   28   44:aload_2         
		//   29   45:iconst_0        
		//   30   46:aaload          
		//   31   47:invokestatic    #33  <Method Object $Gson$Preconditions.checkNotNull(Object)>
		//   32   50:pop             
				.Gson.Types.checkNotPrimitive(atype1[0]);
		//   33   51:aload_2         
		//   34   52:iconst_0        
		//   35   53:aaload          
		//   36   54:invokestatic    #37  <Method void $Gson$Types.checkNotPrimitive(Type)>
				boolean flag1;
				if(atype[0] == java/lang/Object)
		//*  37   57:aload_1         
		//*  38   58:iconst_0        
		//*  39   59:aaload          
		//*  40   60:ldc1            #4   <Class Object>
		//*  41   62:if_acmpne       70
					flag1 = true;
		//   42   65:iconst_1        
		//   43   66:istore_3        
				else
		//*  44   67:goto            72
					flag1 = false;
		//   45   70:iconst_0        
		//   46   71:istore_3        
				.Gson.Preconditions.checkArgument(flag1);
		//   47   72:iload_3         
		//   48   73:invokestatic    #29  <Method void $Gson$Preconditions.checkArgument(boolean)>
				lowerBound = .Gson.Types.canonicalize(atype1[0]);
		//   49   76:aload_0         
		//   50   77:aload_2         
		//   51   78:iconst_0        
		//   52   79:aaload          
		//   53   80:invokestatic    #41  <Method Type $Gson$Types.canonicalize(Type)>
		//   54   83:putfield        #43  <Field Type lowerBound>
				upperBound = java/lang/Object;
		//   55   86:aload_0         
		//   56   87:ldc1            #4   <Class Object>
		//   57   89:putfield        #45  <Field Type upperBound>
				return;
		//   58   92:return          
			} else
			{
				.Gson.Preconditions.checkNotNull(((Object) (atype[0])));
		//   59   93:aload_1         
		//   60   94:iconst_0        
		//   61   95:aaload          
		//   62   96:invokestatic    #33  <Method Object $Gson$Preconditions.checkNotNull(Object)>
		//   63   99:pop             
				.Gson.Types.checkNotPrimitive(atype[0]);
		//   64  100:aload_1         
		//   65  101:iconst_0        
		//   66  102:aaload          
		//   67  103:invokestatic    #37  <Method void $Gson$Types.checkNotPrimitive(Type)>
				lowerBound = null;
		//   68  106:aload_0         
		//   69  107:aconst_null     
		//   70  108:putfield        #43  <Field Type lowerBound>
				upperBound = .Gson.Types.canonicalize(atype[0]);
		//   71  111:aload_0         
		//   72  112:aload_1         
		//   73  113:iconst_0        
		//   74  114:aaload          
		//   75  115:invokestatic    #41  <Method Type $Gson$Types.canonicalize(Type)>
		//   76  118:putfield        #45  <Field Type upperBound>
				return;
		//   77  121:return          
			}
		}
	}


	public static GenericArrayType arrayOf(Type type)
	{
		return ((GenericArrayType) (new GenericArrayTypeImpl(type)));
	//    0    0:new             #6   <Class $Gson$Types$GenericArrayTypeImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void $Gson$Types$GenericArrayTypeImpl(Type)>
	//    4    8:areturn         
	}

	public static Type canonicalize(Type type)
	{
		if(type instanceof Class)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #37  <Class Class>
	//*   2    4:ifeq            42
		{
			type = ((Type) ((Class)type));
	//    3    7:aload_0         
	//    4    8:checkcast       #37  <Class Class>
	//    5   11:astore_0        
			if(((Class) (type)).isArray())
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #41  <Method boolean Class.isArray()>
	//*   8   16:ifeq            37
				type = ((Type) (new GenericArrayTypeImpl(canonicalize(((Type) (((Class) (type)).getComponentType()))))));
	//    9   19:new             #6   <Class $Gson$Types$GenericArrayTypeImpl>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokevirtual   #45  <Method Class Class.getComponentType()>
	//   13   27:invokestatic    #47  <Method Type canonicalize(Type)>
	//   14   30:invokespecial   #33  <Method void $Gson$Types$GenericArrayTypeImpl(Type)>
	//   15   33:astore_0        
	//*  16   34:goto            37
			return (Type)type;
	//   17   37:aload_0         
	//   18   38:checkcast       #19  <Class Type>
	//   19   41:areturn         
		}
		if(type instanceof ParameterizedType)
	//*  20   42:aload_0         
	//*  21   43:instanceof      #49  <Class ParameterizedType>
	//*  22   46:ifeq            80
		{
			type = ((Type) ((ParameterizedType)type));
	//   23   49:aload_0         
	//   24   50:checkcast       #49  <Class ParameterizedType>
	//   25   53:astore_0        
			return ((Type) (new ParameterizedTypeImpl(((ParameterizedType) (type)).getOwnerType(), ((ParameterizedType) (type)).getRawType(), ((ParameterizedType) (type)).getActualTypeArguments())));
	//   26   54:new             #9   <Class $Gson$Types$ParameterizedTypeImpl>
	//   27   57:dup             
	//   28   58:aload_0         
	//   29   59:invokeinterface #53  <Method Type ParameterizedType.getOwnerType()>
	//   30   64:aload_0         
	//   31   65:invokeinterface #56  <Method Type ParameterizedType.getRawType()>
	//   32   70:aload_0         
	//   33   71:invokeinterface #60  <Method Type[] ParameterizedType.getActualTypeArguments()>
	//   34   76:invokespecial   #63  <Method void $Gson$Types$ParameterizedTypeImpl(Type, Type, Type[])>
	//   35   79:areturn         
		}
		if(type instanceof GenericArrayType)
	//*  36   80:aload_0         
	//*  37   81:instanceof      #65  <Class GenericArrayType>
	//*  38   84:ifeq            104
			return ((Type) (new GenericArrayTypeImpl(((GenericArrayType)type).getGenericComponentType())));
	//   39   87:new             #6   <Class $Gson$Types$GenericArrayTypeImpl>
	//   40   90:dup             
	//   41   91:aload_0         
	//   42   92:checkcast       #65  <Class GenericArrayType>
	//   43   95:invokeinterface #68  <Method Type GenericArrayType.getGenericComponentType()>
	//   44  100:invokespecial   #33  <Method void $Gson$Types$GenericArrayTypeImpl(Type)>
	//   45  103:areturn         
		if(type instanceof WildcardType)
	//*  46  104:aload_0         
	//*  47  105:instanceof      #70  <Class WildcardType>
	//*  48  108:ifeq            136
		{
			type = ((Type) ((WildcardType)type));
	//   49  111:aload_0         
	//   50  112:checkcast       #70  <Class WildcardType>
	//   51  115:astore_0        
			return ((Type) (new WildcardTypeImpl(((WildcardType) (type)).getUpperBounds(), ((WildcardType) (type)).getLowerBounds())));
	//   52  116:new             #12  <Class $Gson$Types$WildcardTypeImpl>
	//   53  119:dup             
	//   54  120:aload_0         
	//   55  121:invokeinterface #73  <Method Type[] WildcardType.getUpperBounds()>
	//   56  126:aload_0         
	//   57  127:invokeinterface #76  <Method Type[] WildcardType.getLowerBounds()>
	//   58  132:invokespecial   #79  <Method void $Gson$Types$WildcardTypeImpl(Type[], Type[])>
	//   59  135:areturn         
		} else
		{
			return type;
	//   60  136:aload_0         
	//   61  137:areturn         
		}
	}

	static void checkNotPrimitive(Type type)
	{
		boolean flag;
		if(!(type instanceof Class) || !((Class)type).isPrimitive())
	//*   0    0:aload_0         
	//*   1    1:instanceof      #37  <Class Class>
	//*   2    4:ifeq            17
	//*   3    7:aload_0         
	//*   4    8:checkcast       #37  <Class Class>
	//*   5   11:invokevirtual   #83  <Method boolean Class.isPrimitive()>
	//*   6   14:ifne            22
			flag = true;
	//    7   17:iconst_1        
	//    8   18:istore_1        
		else
	//*   9   19:goto            24
			flag = false;
	//   10   22:iconst_0        
	//   11   23:istore_1        
		ditions.checkArgument(flag);
	//   12   24:iload_1         
	//   13   25:invokestatic    #89  <Method void $Gson$Preconditions.checkArgument(boolean)>
	//   14   28:return          
	}

	private static Class declaringClassOf(TypeVariable typevariable)
	{
		typevariable = ((TypeVariable) (typevariable.getGenericDeclaration()));
	//    0    0:aload_0         
	//    1    1:invokeinterface #97  <Method java.lang.reflect.GenericDeclaration TypeVariable.getGenericDeclaration()>
	//    2    6:astore_0        
		if(typevariable instanceof Class)
	//*   3    7:aload_0         
	//*   4    8:instanceof      #37  <Class Class>
	//*   5   11:ifeq            19
			return (Class)typevariable;
	//    6   14:aload_0         
	//    7   15:checkcast       #37  <Class Class>
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
	//    7   11:invokevirtual   #105 <Method boolean Object.equals(Object)>
	//    8   14:ifeq            19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
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
	//*   6    8:instanceof      #37  <Class Class>
	//*   7   11:ifeq            20
			return ((Object) (type)).equals(((Object) (type1)));
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #105 <Method boolean Object.equals(Object)>
	//   11   19:ireturn         
		if(type instanceof ParameterizedType)
	//*  12   20:aload_0         
	//*  13   21:instanceof      #49  <Class ParameterizedType>
	//*  14   24:ifeq            104
		{
			if(!(type1 instanceof ParameterizedType))
	//*  15   27:aload_1         
	//*  16   28:instanceof      #49  <Class ParameterizedType>
	//*  17   31:ifne            36
				return false;
	//   18   34:iconst_0        
	//   19   35:ireturn         
			type = ((Type) ((ParameterizedType)type));
	//   20   36:aload_0         
	//   21   37:checkcast       #49  <Class ParameterizedType>
	//   22   40:astore_0        
			type1 = ((Type) ((ParameterizedType)type1));
	//   23   41:aload_1         
	//   24   42:checkcast       #49  <Class ParameterizedType>
	//   25   45:astore_1        
			return equal(((Object) (((ParameterizedType) (type)).getOwnerType())), ((Object) (((ParameterizedType) (type1)).getOwnerType()))) && ((Object) (((ParameterizedType) (type)).getRawType())).equals(((Object) (((ParameterizedType) (type1)).getRawType()))) && Arrays.equals(((Object []) (((ParameterizedType) (type)).getActualTypeArguments())), ((Object []) (((ParameterizedType) (type1)).getActualTypeArguments())));
	//   26   46:aload_0         
	//   27   47:invokeinterface #53  <Method Type ParameterizedType.getOwnerType()>
	//   28   52:aload_1         
	//   29   53:invokeinterface #53  <Method Type ParameterizedType.getOwnerType()>
	//   30   58:invokestatic    #108 <Method boolean equal(Object, Object)>
	//   31   61:ifeq            102
	//   32   64:aload_0         
	//   33   65:invokeinterface #56  <Method Type ParameterizedType.getRawType()>
	//   34   70:aload_1         
	//   35   71:invokeinterface #56  <Method Type ParameterizedType.getRawType()>
	//   36   76:invokevirtual   #105 <Method boolean Object.equals(Object)>
	//   37   79:ifeq            102
	//   38   82:aload_0         
	//   39   83:invokeinterface #60  <Method Type[] ParameterizedType.getActualTypeArguments()>
	//   40   88:aload_1         
	//   41   89:invokeinterface #60  <Method Type[] ParameterizedType.getActualTypeArguments()>
	//   42   94:invokestatic    #113 <Method boolean Arrays.equals(Object[], Object[])>
	//   43   97:ifeq            102
	//   44  100:iconst_1        
	//   45  101:ireturn         
	//   46  102:iconst_0        
	//   47  103:ireturn         
		}
		if(type instanceof GenericArrayType)
	//*  48  104:aload_0         
	//*  49  105:instanceof      #65  <Class GenericArrayType>
	//*  50  108:ifeq            146
			if(!(type1 instanceof GenericArrayType))
	//*  51  111:aload_1         
	//*  52  112:instanceof      #65  <Class GenericArrayType>
	//*  53  115:ifne            120
			{
				return false;
	//   54  118:iconst_0        
	//   55  119:ireturn         
			} else
			{
				type = ((Type) ((GenericArrayType)type));
	//   56  120:aload_0         
	//   57  121:checkcast       #65  <Class GenericArrayType>
	//   58  124:astore_0        
				type1 = ((Type) ((GenericArrayType)type1));
	//   59  125:aload_1         
	//   60  126:checkcast       #65  <Class GenericArrayType>
	//   61  129:astore_1        
				return equals(((GenericArrayType) (type)).getGenericComponentType(), ((GenericArrayType) (type1)).getGenericComponentType());
	//   62  130:aload_0         
	//   63  131:invokeinterface #68  <Method Type GenericArrayType.getGenericComponentType()>
	//   64  136:aload_1         
	//   65  137:invokeinterface #68  <Method Type GenericArrayType.getGenericComponentType()>
	//   66  142:invokestatic    #115 <Method boolean equals(Type, Type)>
	//   67  145:ireturn         
			}
		if(type instanceof WildcardType)
	//*  68  146:aload_0         
	//*  69  147:instanceof      #70  <Class WildcardType>
	//*  70  150:ifeq            212
		{
			if(!(type1 instanceof WildcardType))
	//*  71  153:aload_1         
	//*  72  154:instanceof      #70  <Class WildcardType>
	//*  73  157:ifne            162
				return false;
	//   74  160:iconst_0        
	//   75  161:ireturn         
			type = ((Type) ((WildcardType)type));
	//   76  162:aload_0         
	//   77  163:checkcast       #70  <Class WildcardType>
	//   78  166:astore_0        
			type1 = ((Type) ((WildcardType)type1));
	//   79  167:aload_1         
	//   80  168:checkcast       #70  <Class WildcardType>
	//   81  171:astore_1        
			return Arrays.equals(((Object []) (((WildcardType) (type)).getUpperBounds())), ((Object []) (((WildcardType) (type1)).getUpperBounds()))) && Arrays.equals(((Object []) (((WildcardType) (type)).getLowerBounds())), ((Object []) (((WildcardType) (type1)).getLowerBounds())));
	//   82  172:aload_0         
	//   83  173:invokeinterface #73  <Method Type[] WildcardType.getUpperBounds()>
	//   84  178:aload_1         
	//   85  179:invokeinterface #73  <Method Type[] WildcardType.getUpperBounds()>
	//   86  184:invokestatic    #113 <Method boolean Arrays.equals(Object[], Object[])>
	//   87  187:ifeq            210
	//   88  190:aload_0         
	//   89  191:invokeinterface #76  <Method Type[] WildcardType.getLowerBounds()>
	//   90  196:aload_1         
	//   91  197:invokeinterface #76  <Method Type[] WildcardType.getLowerBounds()>
	//   92  202:invokestatic    #113 <Method boolean Arrays.equals(Object[], Object[])>
	//   93  205:ifeq            210
	//   94  208:iconst_1        
	//   95  209:ireturn         
	//   96  210:iconst_0        
	//   97  211:ireturn         
		}
		if(type instanceof TypeVariable)
	//*  98  212:aload_0         
	//*  99  213:instanceof      #93  <Class TypeVariable>
	//* 100  216:ifeq            275
		{
			if(!(type1 instanceof TypeVariable))
	//* 101  219:aload_1         
	//* 102  220:instanceof      #93  <Class TypeVariable>
	//* 103  223:ifne            228
				return false;
	//  104  226:iconst_0        
	//  105  227:ireturn         
			type = ((Type) ((TypeVariable)type));
	//  106  228:aload_0         
	//  107  229:checkcast       #93  <Class TypeVariable>
	//  108  232:astore_0        
			type1 = ((Type) ((TypeVariable)type1));
	//  109  233:aload_1         
	//  110  234:checkcast       #93  <Class TypeVariable>
	//  111  237:astore_1        
			return ((TypeVariable) (type)).getGenericDeclaration() == ((TypeVariable) (type1)).getGenericDeclaration() && ((TypeVariable) (type)).getName().equals(((Object) (((TypeVariable) (type1)).getName())));
	//  112  238:aload_0         
	//  113  239:invokeinterface #97  <Method java.lang.reflect.GenericDeclaration TypeVariable.getGenericDeclaration()>
	//  114  244:aload_1         
	//  115  245:invokeinterface #97  <Method java.lang.reflect.GenericDeclaration TypeVariable.getGenericDeclaration()>
	//  116  250:if_acmpne       273
	//  117  253:aload_0         
	//  118  254:invokeinterface #119 <Method String TypeVariable.getName()>
	//  119  259:aload_1         
	//  120  260:invokeinterface #119 <Method String TypeVariable.getName()>
	//  121  265:invokevirtual   #122 <Method boolean String.equals(Object)>
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
	//*   1    1:instanceof      #65  <Class GenericArrayType>
	//*   2    4:ifeq            17
			return ((GenericArrayType)type).getGenericComponentType();
	//    3    7:aload_0         
	//    4    8:checkcast       #65  <Class GenericArrayType>
	//    5   11:invokeinterface #68  <Method Type GenericArrayType.getGenericComponentType()>
	//    6   16:areturn         
		else
			return ((Type) (((Class)type).getComponentType()));
	//    7   17:aload_0         
	//    8   18:checkcast       #37  <Class Class>
	//    9   21:invokevirtual   #45  <Method Class Class.getComponentType()>
	//   10   24:areturn         
	}

	public static Type getCollectionElementType(Type type, Class class1)
	{
		class1 = ((Class) (getSupertype(type, class1, java/util/Collection)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #127 <Class Collection>
	//    3    4:invokestatic    #131 <Method Type getSupertype(Type, Class, Class)>
	//    4    7:astore_1        
		type = ((Type) (class1));
	//    5    8:aload_1         
	//    6    9:astore_0        
		if(class1 instanceof WildcardType)
	//*   7   10:aload_1         
	//*   8   11:instanceof      #70  <Class WildcardType>
	//*   9   14:ifeq            29
			type = ((WildcardType)class1).getUpperBounds()[0];
	//   10   17:aload_1         
	//   11   18:checkcast       #70  <Class WildcardType>
	//   12   21:invokeinterface #73  <Method Type[] WildcardType.getUpperBounds()>
	//   13   26:iconst_0        
	//   14   27:aaload          
	//   15   28:astore_0        
		if(type instanceof ParameterizedType)
	//*  16   29:aload_0         
	//*  17   30:instanceof      #49  <Class ParameterizedType>
	//*  18   33:ifeq            48
			return ((ParameterizedType)type).getActualTypeArguments()[0];
	//   19   36:aload_0         
	//   20   37:checkcast       #49  <Class ParameterizedType>
	//   21   40:invokeinterface #60  <Method Type[] ParameterizedType.getActualTypeArguments()>
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
	//*   6    8:invokevirtual   #136 <Method boolean Class.isInterface()>
	//*   7   11:ifeq            76
		{
			type = ((Type) (class1.getInterfaces()));
	//    8   14:aload_1         
	//    9   15:invokevirtual   #140 <Method Class[] Class.getInterfaces()>
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
	//   25   39:invokevirtual   #143 <Method Type[] Class.getGenericInterfaces()>
	//   26   42:iload_3         
	//   27   43:aaload          
	//   28   44:areturn         
				if(class2.isAssignableFrom(((Class) (type[i]))))
	//*  29   45:aload_2         
	//*  30   46:aload_0         
	//*  31   47:iload_3         
	//*  32   48:aaload          
	//*  33   49:invokevirtual   #147 <Method boolean Class.isAssignableFrom(Class)>
	//*  34   52:ifeq            69
					return getGenericSupertype(class1.getGenericInterfaces()[i], ((Class) (type[i])), class2);
	//   35   55:aload_1         
	//   36   56:invokevirtual   #143 <Method Type[] Class.getGenericInterfaces()>
	//   37   59:iload_3         
	//   38   60:aaload          
	//   39   61:aload_0         
	//   40   62:iload_3         
	//   41   63:aaload          
	//   42   64:aload_2         
	//   43   65:invokestatic    #149 <Method Type getGenericSupertype(Type, Class, Class)>
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
	//*  51   77:invokevirtual   #136 <Method boolean Class.isInterface()>
	//*  52   80:ifne            127
			for(; class1 != java/lang/Object; class1 = ((Class) (type)))
	//*  53   83:aload_1         
	//*  54   84:ldc1            #4   <Class Object>
	//*  55   86:if_acmpeq       127
			{
				type = ((Type) (class1.getSuperclass()));
	//   56   89:aload_1         
	//   57   90:invokevirtual   #152 <Method Class Class.getSuperclass()>
	//   58   93:astore_0        
				if(type == class2)
	//*  59   94:aload_0         
	//*  60   95:aload_2         
	//*  61   96:if_acmpne       104
					return class1.getGenericSuperclass();
	//   62   99:aload_1         
	//   63  100:invokevirtual   #155 <Method Type Class.getGenericSuperclass()>
	//   64  103:areturn         
				if(class2.isAssignableFrom(((Class) (type))))
	//*  65  104:aload_2         
	//*  66  105:aload_0         
	//*  67  106:invokevirtual   #147 <Method boolean Class.isAssignableFrom(Class)>
	//*  68  109:ifeq            122
					return getGenericSupertype(class1.getGenericSuperclass(), ((Class) (type)), class2);
	//   69  112:aload_1         
	//   70  113:invokevirtual   #155 <Method Type Class.getGenericSuperclass()>
	//   71  116:aload_0         
	//   72  117:aload_2         
	//   73  118:invokestatic    #149 <Method Type getGenericSupertype(Type, Class, Class)>
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
	//*   1    1:ldc1            #160 <Class Properties>
	//*   2    3:if_acmpne       21
			return (new Type[] {
				java/lang/String, java/lang/String
			});
	//    3    6:iconst_2        
	//    4    7:anewarray       Type[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:ldc1            #121 <Class String>
	//    8   14:aastore         
	//    9   15:dup             
	//   10   16:iconst_1        
	//   11   17:ldc1            #121 <Class String>
	//   12   19:aastore         
	//   13   20:areturn         
		type = getSupertype(type, class1, java/util/Map);
	//   14   21:aload_0         
	//   15   22:aload_1         
	//   16   23:ldc1            #162 <Class Map>
	//   17   25:invokestatic    #131 <Method Type getSupertype(Type, Class, Class)>
	//   18   28:astore_0        
		if(type instanceof ParameterizedType)
	//*  19   29:aload_0         
	//*  20   30:instanceof      #49  <Class ParameterizedType>
	//*  21   33:ifeq            46
			return ((ParameterizedType)type).getActualTypeArguments();
	//   22   36:aload_0         
	//   23   37:checkcast       #49  <Class ParameterizedType>
	//   24   40:invokeinterface #60  <Method Type[] ParameterizedType.getActualTypeArguments()>
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
	//*   1    1:instanceof      #37  <Class Class>
	//*   2    4:ifeq            12
			return (Class)type;
	//    3    7:aload_0         
	//    4    8:checkcast       #37  <Class Class>
	//    5   11:areturn         
		if(type instanceof ParameterizedType)
	//*   6   12:aload_0         
	//*   7   13:instanceof      #49  <Class ParameterizedType>
	//*   8   16:ifeq            41
		{
			type = ((ParameterizedType)type).getRawType();
	//    9   19:aload_0         
	//   10   20:checkcast       #49  <Class ParameterizedType>
	//   11   23:invokeinterface #56  <Method Type ParameterizedType.getRawType()>
	//   12   28:astore_0        
			ditions.checkArgument(type instanceof Class);
	//   13   29:aload_0         
	//   14   30:instanceof      #37  <Class Class>
	//   15   33:invokestatic    #89  <Method void $Gson$Preconditions.checkArgument(boolean)>
			return (Class)type;
	//   16   36:aload_0         
	//   17   37:checkcast       #37  <Class Class>
	//   18   40:areturn         
		}
		if(type instanceof GenericArrayType)
	//*  19   41:aload_0         
	//*  20   42:instanceof      #65  <Class GenericArrayType>
	//*  21   45:ifeq            68
			return Array.newInstance(getRawType(((GenericArrayType)type).getGenericComponentType()), 0).getClass();
	//   22   48:aload_0         
	//   23   49:checkcast       #65  <Class GenericArrayType>
	//   24   52:invokeinterface #68  <Method Type GenericArrayType.getGenericComponentType()>
	//   25   57:invokestatic    #166 <Method Class getRawType(Type)>
	//   26   60:iconst_0        
	//   27   61:invokestatic    #172 <Method Object Array.newInstance(Class, int)>
	//   28   64:invokevirtual   #175 <Method Class Object.getClass()>
	//   29   67:areturn         
		if(type instanceof TypeVariable)
	//*  30   68:aload_0         
	//*  31   69:instanceof      #93  <Class TypeVariable>
	//*  32   72:ifeq            78
			return java/lang/Object;
	//   33   75:ldc1            #4   <Class Object>
	//   34   77:areturn         
		if(type instanceof WildcardType)
	//*  35   78:aload_0         
	//*  36   79:instanceof      #70  <Class WildcardType>
	//*  37   82:ifeq            100
			return getRawType(((WildcardType)type).getUpperBounds()[0]);
	//   38   85:aload_0         
	//   39   86:checkcast       #70  <Class WildcardType>
	//   40   89:invokeinterface #73  <Method Type[] WildcardType.getUpperBounds()>
	//   41   94:iconst_0        
	//   42   95:aaload          
	//   43   96:invokestatic    #166 <Method Class getRawType(Type)>
	//   44   99:areturn         
		String s;
		if(type == null)
	//*  45  100:aload_0         
	//*  46  101:ifnonnull       110
			s = "null";
	//   47  104:ldc1            #177 <String "null">
	//   48  106:astore_1        
		else
	//*  49  107:goto            118
			s = ((Object) (type)).getClass().getName();
	//   50  110:aload_0         
	//   51  111:invokevirtual   #175 <Method Class Object.getClass()>
	//   52  114:invokevirtual   #178 <Method String Class.getName()>
	//   53  117:astore_1        
		throw new IllegalArgumentException((new StringBuilder()).append("Expected a Class, ParameterizedType, or GenericArrayType, but <").append(((Object) (type))).append("> is of type ").append(s).toString());
	//   54  118:new             #180 <Class IllegalArgumentException>
	//   55  121:dup             
	//   56  122:new             #182 <Class StringBuilder>
	//   57  125:dup             
	//   58  126:invokespecial   #183 <Method void StringBuilder()>
	//   59  129:ldc1            #185 <String "Expected a Class, ParameterizedType, or GenericArrayType, but <">
	//   60  131:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   61  134:aload_0         
	//   62  135:invokevirtual   #192 <Method StringBuilder StringBuilder.append(Object)>
	//   63  138:ldc1            #194 <String "> is of type ">
	//   64  140:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   65  143:aload_1         
	//   66  144:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   67  147:invokevirtual   #197 <Method String StringBuilder.toString()>
	//   68  150:invokespecial   #200 <Method void IllegalArgumentException(String)>
	//   69  153:athrow          
	}

	static Type getSupertype(Type type, Class class1, Class class2)
	{
		ditions.checkArgument(class2.isAssignableFrom(class1));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #147 <Method boolean Class.isAssignableFrom(Class)>
	//    3    5:invokestatic    #89  <Method void $Gson$Preconditions.checkArgument(boolean)>
		return resolve(type, class1, getGenericSupertype(type, class1, class2));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:invokestatic    #149 <Method Type getGenericSupertype(Type, Class, Class)>
	//   10   16:invokestatic    #205 <Method Type resolve(Type, Class, Type)>
	//   11   19:areturn         
	}

	static int hashCodeOrZero(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          9
			return obj.hashCode();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #211 <Method int Object.hashCode()>
	//    4    8:ireturn         
		else
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	private static int indexOf(Object aobj[], Object obj)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int j = aobj.length; i < j; i++)
	//*   2    2:aload_0         
	//*   3    3:arraylength     
	//*   4    4:istore_3        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          29
			if(obj.equals(aobj[i]))
	//*   8   10:aload_1         
	//*   9   11:aload_0         
	//*  10   12:iload_2         
	//*  11   13:aaload          
	//*  12   14:invokevirtual   #105 <Method boolean Object.equals(Object)>
	//*  13   17:ifeq            22
				return i;
	//   14   20:iload_2         
	//   15   21:ireturn         

	//   16   22:iload_2         
	//   17   23:iconst_1        
	//   18   24:iadd            
	//   19   25:istore_2        
	//*  20   26:goto            5
		throw new NoSuchElementException();
	//   21   29:new             #215 <Class NoSuchElementException>
	//   22   32:dup             
	//   23   33:invokespecial   #216 <Method void NoSuchElementException()>
	//   24   36:athrow          
	}

	public static transient ParameterizedType newParameterizedTypeWithOwner(Type type, Type type1, Type atype[])
	{
		return ((ParameterizedType) (new ParameterizedTypeImpl(type, type1, atype)));
	//    0    0:new             #9   <Class $Gson$Types$ParameterizedTypeImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #63  <Method void $Gson$Types$ParameterizedTypeImpl(Type, Type, Type[])>
	//    6   10:areturn         
	}

	public static Type resolve(Type type, Class class1, Type type1)
	{
		return resolve(type, class1, type1, ((Collection) (new HashSet())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #220 <Class HashSet>
	//    4    6:dup             
	//    5    7:invokespecial   #221 <Method void HashSet()>
	//    6   10:invokestatic    #224 <Method Type resolve(Type, Class, Type, Collection)>
	//    7   13:areturn         
	}

	private static Type resolve(Type type, Class class1, Type type1, Collection collection)
	{
		while(type1 instanceof TypeVariable) 
	//*   0    0:aload_2         
	//*   1    1:instanceof      #93  <Class TypeVariable>
	//*   2    4:ifeq            54
		{
			TypeVariable typevariable = (TypeVariable)type1;
	//    3    7:aload_2         
	//    4    8:checkcast       #93  <Class TypeVariable>
	//    5   11:astore          8
			if(collection.contains(((Object) (typevariable))))
	//*   6   13:aload_3         
	//*   7   14:aload           8
	//*   8   16:invokeinterface #228 <Method boolean Collection.contains(Object)>
	//*   9   21:ifeq            26
				return type1;
	//   10   24:aload_2         
	//   11   25:areturn         
			collection.add(((Object) (typevariable)));
	//   12   26:aload_3         
	//   13   27:aload           8
	//   14   29:invokeinterface #231 <Method boolean Collection.add(Object)>
	//   15   34:pop             
			type1 = resolveTypeVariable(type, class1, typevariable);
	//   16   35:aload_0         
	//   17   36:aload_1         
	//   18   37:aload           8
	//   19   39:invokestatic    #235 <Method Type resolveTypeVariable(Type, Class, TypeVariable)>
	//   20   42:astore_2        
			if(type1 == typevariable)
	//*  21   43:aload_2         
	//*  22   44:aload           8
	//*  23   46:if_acmpne       51
				return type1;
	//   24   49:aload_2         
	//   25   50:areturn         
		}
	//*  26   51:goto            0
		if((type1 instanceof Class) && ((Class)type1).isArray())
	//*  27   54:aload_2         
	//*  28   55:instanceof      #37  <Class Class>
	//*  29   58:ifeq            104
	//*  30   61:aload_2         
	//*  31   62:checkcast       #37  <Class Class>
	//*  32   65:invokevirtual   #41  <Method boolean Class.isArray()>
	//*  33   68:ifeq            104
		{
			type1 = ((Type) ((Class)type1));
	//   34   71:aload_2         
	//   35   72:checkcast       #37  <Class Class>
	//   36   75:astore_2        
			Class class2 = ((Class) (type1)).getComponentType();
	//   37   76:aload_2         
	//   38   77:invokevirtual   #45  <Method Class Class.getComponentType()>
	//   39   80:astore          8
			type = resolve(type, class1, ((Type) (class2)), collection);
	//   40   82:aload_0         
	//   41   83:aload_1         
	//   42   84:aload           8
	//   43   86:aload_3         
	//   44   87:invokestatic    #224 <Method Type resolve(Type, Class, Type, Collection)>
	//   45   90:astore_0        
			if(class2 == type)
	//*  46   91:aload           8
	//*  47   93:aload_0         
	//*  48   94:if_acmpne       99
				return type1;
	//   49   97:aload_2         
	//   50   98:areturn         
			else
				return ((Type) (arrayOf(type)));
	//   51   99:aload_0         
	//   52  100:invokestatic    #237 <Method GenericArrayType arrayOf(Type)>
	//   53  103:areturn         
		}
		if(type1 instanceof GenericArrayType)
	//*  54  104:aload_2         
	//*  55  105:instanceof      #65  <Class GenericArrayType>
	//*  56  108:ifeq            146
		{
			type1 = ((Type) ((GenericArrayType)type1));
	//   57  111:aload_2         
	//   58  112:checkcast       #65  <Class GenericArrayType>
	//   59  115:astore_2        
			Type type2 = ((GenericArrayType) (type1)).getGenericComponentType();
	//   60  116:aload_2         
	//   61  117:invokeinterface #68  <Method Type GenericArrayType.getGenericComponentType()>
	//   62  122:astore          8
			type = resolve(type, class1, type2, collection);
	//   63  124:aload_0         
	//   64  125:aload_1         
	//   65  126:aload           8
	//   66  128:aload_3         
	//   67  129:invokestatic    #224 <Method Type resolve(Type, Class, Type, Collection)>
	//   68  132:astore_0        
			if(type2 == type)
	//*  69  133:aload           8
	//*  70  135:aload_0         
	//*  71  136:if_acmpne       141
				return type1;
	//   72  139:aload_2         
	//   73  140:areturn         
			else
				return ((Type) (arrayOf(type)));
	//   74  141:aload_0         
	//   75  142:invokestatic    #237 <Method GenericArrayType arrayOf(Type)>
	//   76  145:areturn         
		}
		if(type1 instanceof ParameterizedType)
	//*  77  146:aload_2         
	//*  78  147:instanceof      #49  <Class ParameterizedType>
	//*  79  150:ifeq            310
		{
			ParameterizedType parameterizedtype = (ParameterizedType)type1;
	//   80  153:aload_2         
	//   81  154:checkcast       #49  <Class ParameterizedType>
	//   82  157:astore          9
			type1 = parameterizedtype.getOwnerType();
	//   83  159:aload           9
	//   84  161:invokeinterface #53  <Method Type ParameterizedType.getOwnerType()>
	//   85  166:astore_2        
			Type type3 = resolve(type, class1, type1, collection);
	//   86  167:aload_0         
	//   87  168:aload_1         
	//   88  169:aload_2         
	//   89  170:aload_3         
	//   90  171:invokestatic    #224 <Method Type resolve(Type, Class, Type, Collection)>
	//   91  174:astore          10
			boolean flag;
			if(type3 != type1)
	//*  92  176:aload           10
	//*  93  178:aload_2         
	//*  94  179:if_acmpeq       188
				flag = true;
	//   95  182:iconst_1        
	//   96  183:istore          4
			else
	//*  97  185:goto            191
				flag = false;
	//   98  188:iconst_0        
	//   99  189:istore          4
			type1 = ((Type) (parameterizedtype.getActualTypeArguments()));
	//  100  191:aload           9
	//  101  193:invokeinterface #60  <Method Type[] ParameterizedType.getActualTypeArguments()>
	//  102  198:astore_2        
			int i = 0;
	//  103  199:iconst_0        
	//  104  200:istore          6
			for(int j = type1.length; i < j;)
	//* 105  202:aload_2         
	//* 106  203:arraylength     
	//* 107  204:istore          7
	//* 108  206:iload           6
	//* 109  208:iload           7
	//* 110  210:icmpge          288
			{
				Type type4 = resolve(type, class1, ((Type) (type1[i])), collection);
	//  111  213:aload_0         
	//  112  214:aload_1         
	//  113  215:aload_2         
	//  114  216:iload           6
	//  115  218:aaload          
	//  116  219:aload_3         
	//  117  220:invokestatic    #224 <Method Type resolve(Type, Class, Type, Collection)>
	//  118  223:astore          11
				boolean flag1 = flag;
	//  119  225:iload           4
	//  120  227:istore          5
				Object obj = ((Object) (type1));
	//  121  229:aload_2         
	//  122  230:astore          8
				if(type4 != type1[i])
	//* 123  232:aload           11
	//* 124  234:aload_2         
	//* 125  235:iload           6
	//* 126  237:aaload          
	//* 127  238:if_acmpeq       272
				{
					flag1 = flag;
	//  128  241:iload           4
	//  129  243:istore          5
					obj = ((Object) (type1));
	//  130  245:aload_2         
	//  131  246:astore          8
					if(!flag)
	//* 132  248:iload           4
	//* 133  250:ifne            265
					{
						obj = ((Object) ((Type[])((Type []) (type1)).clone()));
	//  134  253:aload_2         
	//  135  254:invokevirtual   #242 <Method Object _5B_Ljava.lang.reflect.Type_3B_.clone()>
	//  136  257:checkcast       #238 <Class Type[]>
	//  137  260:astore          8
						flag1 = true;
	//  138  262:iconst_1        
	//  139  263:istore          5
					}
					obj[i] = ((/*<invalid signature>*/java.lang.Object) (type4));
	//  140  265:aload           8
	//  141  267:iload           6
	//  142  269:aload           11
	//  143  271:aastore         
				}
				i++;
	//  144  272:iload           6
	//  145  274:iconst_1        
	//  146  275:iadd            
	//  147  276:istore          6
				flag = flag1;
	//  148  278:iload           5
	//  149  280:istore          4
				type1 = ((Type) (obj));
	//  150  282:aload           8
	//  151  284:astore_2        
			}

	//* 152  285:goto            206
			if(flag)
	//* 153  288:iload           4
	//* 154  290:ifeq            307
				return ((Type) (newParameterizedTypeWithOwner(type3, parameterizedtype.getRawType(), ((Type []) (type1)))));
	//  155  293:aload           10
	//  156  295:aload           9
	//  157  297:invokeinterface #56  <Method Type ParameterizedType.getRawType()>
	//  158  302:aload_2         
	//  159  303:invokestatic    #244 <Method ParameterizedType newParameterizedTypeWithOwner(Type, Type, Type[])>
	//  160  306:areturn         
			else
				return ((Type) (parameterizedtype));
	//  161  307:aload           9
	//  162  309:areturn         
		}
		if(type1 instanceof WildcardType)
	//* 163  310:aload_2         
	//* 164  311:instanceof      #70  <Class WildcardType>
	//* 165  314:ifeq            404
		{
			type1 = ((Type) ((WildcardType)type1));
	//  166  317:aload_2         
	//  167  318:checkcast       #70  <Class WildcardType>
	//  168  321:astore_2        
			Type atype[] = ((WildcardType) (type1)).getLowerBounds();
	//  169  322:aload_2         
	//  170  323:invokeinterface #76  <Method Type[] WildcardType.getLowerBounds()>
	//  171  328:astore          8
			Type atype1[] = ((WildcardType) (type1)).getUpperBounds();
	//  172  330:aload_2         
	//  173  331:invokeinterface #73  <Method Type[] WildcardType.getUpperBounds()>
	//  174  336:astore          9
			if(atype.length == 1)
	//* 175  338:aload           8
	//* 176  340:arraylength     
	//* 177  341:iconst_1        
	//* 178  342:icmpne          371
			{
				type = resolve(type, class1, atype[0], collection);
	//  179  345:aload_0         
	//  180  346:aload_1         
	//  181  347:aload           8
	//  182  349:iconst_0        
	//  183  350:aaload          
	//  184  351:aload_3         
	//  185  352:invokestatic    #224 <Method Type resolve(Type, Class, Type, Collection)>
	//  186  355:astore_0        
				if(type != atype[0])
	//* 187  356:aload_0         
	//* 188  357:aload           8
	//* 189  359:iconst_0        
	//* 190  360:aaload          
	//* 191  361:if_acmpeq       369
					return ((Type) (supertypeOf(type)));
	//  192  364:aload_0         
	//  193  365:invokestatic    #248 <Method WildcardType supertypeOf(Type)>
	//  194  368:areturn         
				else
					return type1;
	//  195  369:aload_2         
	//  196  370:areturn         
			}
			if(atype1.length == 1)
	//* 197  371:aload           9
	//* 198  373:arraylength     
	//* 199  374:iconst_1        
	//* 200  375:icmpne          402
			{
				type = resolve(type, class1, atype1[0], collection);
	//  201  378:aload_0         
	//  202  379:aload_1         
	//  203  380:aload           9
	//  204  382:iconst_0        
	//  205  383:aaload          
	//  206  384:aload_3         
	//  207  385:invokestatic    #224 <Method Type resolve(Type, Class, Type, Collection)>
	//  208  388:astore_0        
				if(type != atype1[0])
	//* 209  389:aload_0         
	//* 210  390:aload           9
	//* 211  392:iconst_0        
	//* 212  393:aaload          
	//* 213  394:if_acmpeq       402
					return ((Type) (subtypeOf(type)));
	//  214  397:aload_0         
	//  215  398:invokestatic    #251 <Method WildcardType subtypeOf(Type)>
	//  216  401:areturn         
			}
			return type1;
	//  217  402:aload_2         
	//  218  403:areturn         
		} else
		{
			return type1;
	//  219  404:aload_2         
	//  220  405:areturn         
		}
	}

	static Type resolveTypeVariable(Type type, Class class1, TypeVariable typevariable)
	{
		Class class2 = declaringClassOf(typevariable);
	//    0    0:aload_2         
	//    1    1:invokestatic    #254 <Method Class declaringClassOf(TypeVariable)>
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
	//   10   17:invokestatic    #149 <Method Type getGenericSupertype(Type, Class, Class)>
	//   11   20:astore_0        
		if(type instanceof ParameterizedType)
	//*  12   21:aload_0         
	//*  13   22:instanceof      #49  <Class ParameterizedType>
	//*  14   25:ifeq            50
		{
			int i = indexOf(((Object []) (class2.getTypeParameters())), ((Object) (typevariable)));
	//   15   28:aload           4
	//   16   30:invokevirtual   #258 <Method TypeVariable[] Class.getTypeParameters()>
	//   17   33:aload_2         
	//   18   34:invokestatic    #260 <Method int indexOf(Object[], Object)>
	//   19   37:istore_3        
			return ((ParameterizedType)type).getActualTypeArguments()[i];
	//   20   38:aload_0         
	//   21   39:checkcast       #49  <Class ParameterizedType>
	//   22   42:invokeinterface #60  <Method Type[] ParameterizedType.getActualTypeArguments()>
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
		if(type instanceof WildcardType)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #70  <Class WildcardType>
	//*   2    4:ifeq            20
		{
			type = ((Type) (((WildcardType)type).getUpperBounds()));
	//    3    7:aload_0         
	//    4    8:checkcast       #70  <Class WildcardType>
	//    5   11:invokeinterface #73  <Method Type[] WildcardType.getUpperBounds()>
	//    6   16:astore_0        
		} else
	//*   7   17:goto            31
		{
			Type atype[] = new Type[1];
	//    8   20:iconst_1        
	//    9   21:anewarray       Type[]
	//   10   24:astore_1        
			atype[0] = type;
	//   11   25:aload_1         
	//   12   26:iconst_0        
	//   13   27:aload_0         
	//   14   28:aastore         
			type = ((Type) (atype));
	//   15   29:aload_1         
	//   16   30:astore_0        
		}
		return ((WildcardType) (new WildcardTypeImpl(((Type []) (type)), EMPTY_TYPE_ARRAY)));
	//   17   31:new             #12  <Class $Gson$Types$WildcardTypeImpl>
	//   18   34:dup             
	//   19   35:aload_0         
	//   20   36:getstatic       #21  <Field Type[] EMPTY_TYPE_ARRAY>
	//   21   39:invokespecial   #79  <Method void $Gson$Types$WildcardTypeImpl(Type[], Type[])>
	//   22   42:areturn         
	}

	public static WildcardType supertypeOf(Type type)
	{
		if(type instanceof WildcardType)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #70  <Class WildcardType>
	//*   2    4:ifeq            20
		{
			type = ((Type) (((WildcardType)type).getLowerBounds()));
	//    3    7:aload_0         
	//    4    8:checkcast       #70  <Class WildcardType>
	//    5   11:invokeinterface #76  <Method Type[] WildcardType.getLowerBounds()>
	//    6   16:astore_0        
		} else
	//*   7   17:goto            31
		{
			Type atype[] = new Type[1];
	//    8   20:iconst_1        
	//    9   21:anewarray       Type[]
	//   10   24:astore_1        
			atype[0] = type;
	//   11   25:aload_1         
	//   12   26:iconst_0        
	//   13   27:aload_0         
	//   14   28:aastore         
			type = ((Type) (atype));
	//   15   29:aload_1         
	//   16   30:astore_0        
		}
		return ((WildcardType) (new WildcardTypeImpl(new Type[] {
			java/lang/Object
		}, ((Type []) (type)))));
	//   17   31:new             #12  <Class $Gson$Types$WildcardTypeImpl>
	//   18   34:dup             
	//   19   35:iconst_1        
	//   20   36:anewarray       Type[]
	//   21   39:dup             
	//   22   40:iconst_0        
	//   23   41:ldc1            #4   <Class Object>
	//   24   43:aastore         
	//   25   44:aload_0         
	//   26   45:invokespecial   #79  <Method void $Gson$Types$WildcardTypeImpl(Type[], Type[])>
	//   27   48:areturn         
	}

	public static String typeToString(Type type)
	{
		if(type instanceof Class)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #37  <Class Class>
	//*   2    4:ifeq            15
			return ((Class)type).getName();
	//    3    7:aload_0         
	//    4    8:checkcast       #37  <Class Class>
	//    5   11:invokevirtual   #178 <Method String Class.getName()>
	//    6   14:areturn         
		else
			return ((Object) (type)).toString();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #264 <Method String Object.toString()>
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
