// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.*;
import java.util.Arrays;

private static final class $Gson$Types$ParameterizedTypeImpl
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
		return Arrays.hashCode(((Object []) (typeArguments))) ^ ((Object) (rawType)).hashCode() ^ .Gson.Types.access$100(((Object) (ownerType)));
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

	public transient $Gson$Types$ParameterizedTypeImpl(Type type, Type type1, Type atype[])
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
			.Gson.Types.access$000(typeArguments[i]);
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
