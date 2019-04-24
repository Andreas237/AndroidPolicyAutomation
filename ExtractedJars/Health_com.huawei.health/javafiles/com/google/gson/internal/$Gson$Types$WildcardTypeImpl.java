// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

static final class $Gson$Types$WildcardTypeImpl
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

	public $Gson$Types$WildcardTypeImpl(Type atype[], Type atype1[])
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
