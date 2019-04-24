// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

private static final class $Gson$Types$WildcardTypeImpl
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

	public $Gson$Types$WildcardTypeImpl(Type atype[], Type atype1[])
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
			.Gson.Types.access$000(atype1[0]);
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
			.Gson.Types.access$000(atype[0]);
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
