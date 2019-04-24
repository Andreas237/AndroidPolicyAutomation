// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.*;
import java.util.Arrays;

static final class $Gson$Types$ParameterizedTypeImpl
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

	public transient $Gson$Types$ParameterizedTypeImpl(Type type, Type type1, Type atype[])
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
