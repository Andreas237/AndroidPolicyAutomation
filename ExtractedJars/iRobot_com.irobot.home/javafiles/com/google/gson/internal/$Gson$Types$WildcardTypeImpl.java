// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

private static final class $Gson$Types$WildcardTypeImpl
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

	public $Gson$Types$WildcardTypeImpl(Type atype[], Type atype1[])
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
			.Gson.Types.access$000(atype1[0]);
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
			.Gson.Types.access$000(atype[0]);
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
