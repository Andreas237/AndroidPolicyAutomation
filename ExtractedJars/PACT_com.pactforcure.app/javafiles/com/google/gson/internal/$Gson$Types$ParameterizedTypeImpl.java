// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.*;
import java.util.Arrays;

private static final class $Gson$Types$ParameterizedTypeImpl
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
		return Arrays.hashCode(((Object []) (typeArguments))) ^ ((Object) (rawType)).hashCode() ^ .Gson.Types.access$100(((Object) (ownerType)));
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

	public transient $Gson$Types$ParameterizedTypeImpl(Type type, Type type1, Type atype[])
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
			.Gson.Types.access$000(typeArguments[i]);
			typeArguments[i] = .Gson.Types.canonicalize(typeArguments[i]);
		}

	//*  81  160:goto            65
	//   82  163:return          
	}
}
