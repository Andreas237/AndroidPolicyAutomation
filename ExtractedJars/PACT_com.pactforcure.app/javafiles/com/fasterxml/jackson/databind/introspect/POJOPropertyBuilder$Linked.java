// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.PropertyName;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			POJOPropertyBuilder

protected static final class POJOPropertyBuilder$Linked
{

	protected POJOPropertyBuilder$Linked append(POJOPropertyBuilder$Linked pojopropertybuilder$linked)
	{
		if(next == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//*   2    4:ifnonnull       13
			return withNext(pojopropertybuilder$linked);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
	//    6   12:areturn         
		else
			return withNext(next.append(pojopropertybuilder$linked));
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #63  <Method POJOPropertyBuilder$Linked append(POJOPropertyBuilder$Linked)>
	//   12   22:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
	//   13   25:areturn         
	}

	public String toString()
	{
		String s1 = (new StringBuilder()).append(value.toString()).append("[visible=").append(isVisible).append(",ignore=").append(isMarkedIgnored).append(",explicitName=").append(isNameExplicit).append("]").toString();
	//    0    0:new             #68  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field Object value>
	//    5   11:invokevirtual   #71  <Method String Object.toString()>
	//    6   14:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc1            #76  <String "[visible=">
	//    8   19:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:aload_0         
	//   10   23:getfield        #51  <Field boolean isVisible>
	//   11   26:invokevirtual   #79  <Method StringBuilder StringBuilder.append(boolean)>
	//   12   29:ldc1            #81  <String ",ignore=">
	//   13   31:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   14   34:aload_0         
	//   15   35:getfield        #53  <Field boolean isMarkedIgnored>
	//   16   38:invokevirtual   #79  <Method StringBuilder StringBuilder.append(boolean)>
	//   17   41:ldc1            #83  <String ",explicitName=">
	//   18   43:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   19   46:aload_0         
	//   20   47:getfield        #49  <Field boolean isNameExplicit>
	//   21   50:invokevirtual   #79  <Method StringBuilder StringBuilder.append(boolean)>
	//   22   53:ldc1            #85  <String "]">
	//   23   55:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   24   58:invokevirtual   #86  <Method String StringBuilder.toString()>
	//   25   61:astore_2        
		String s = s1;
	//   26   62:aload_2         
	//   27   63:astore_1        
		if(next != null)
	//*  28   64:aload_0         
	//*  29   65:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//*  30   68:ifnull          101
			s = (new StringBuilder()).append(s1).append(", ").append(next.toString()).toString();
	//   31   71:new             #68  <Class StringBuilder>
	//   32   74:dup             
	//   33   75:invokespecial   #69  <Method void StringBuilder()>
	//   34   78:aload_2         
	//   35   79:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   36   82:ldc1            #88  <String ", ">
	//   37   84:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   38   87:aload_0         
	//   39   88:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//   40   91:invokevirtual   #89  <Method String toString()>
	//   41   94:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   42   97:invokevirtual   #86  <Method String StringBuilder.toString()>
	//   43  100:astore_1        
		return s;
	//   44  101:aload_1         
	//   45  102:areturn         
	}

	public POJOPropertyBuilder$Linked trimByVisibility()
	{
		POJOPropertyBuilder$Linked pojopropertybuilder$linked;
		if(next == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//*   2    4:ifnonnull       11
		{
			pojopropertybuilder$linked = this;
	//    3    7:aload_0         
	//    4    8:astore_1        
		} else
	//*   5    9:aload_1         
	//*   6   10:areturn         
		{
			POJOPropertyBuilder$Linked pojopropertybuilder$linked1 = next.trimByVisibility();
	//    7   11:aload_0         
	//    8   12:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//    9   15:invokevirtual   #93  <Method POJOPropertyBuilder$Linked trimByVisibility()>
	//   10   18:astore_2        
			if(name != null)
	//*  11   19:aload_0         
	//*  12   20:getfield        #37  <Field PropertyName name>
	//*  13   23:ifnull          45
				if(pojopropertybuilder$linked1.name == null)
	//*  14   26:aload_2         
	//*  15   27:getfield        #37  <Field PropertyName name>
	//*  16   30:ifnonnull       39
					return withNext(((POJOPropertyBuilder$Linked) (null)));
	//   17   33:aload_0         
	//   18   34:aconst_null     
	//   19   35:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
	//   20   38:areturn         
				else
					return withNext(pojopropertybuilder$linked1);
	//   21   39:aload_0         
	//   22   40:aload_2         
	//   23   41:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
	//   24   44:areturn         
			pojopropertybuilder$linked = pojopropertybuilder$linked1;
	//   25   45:aload_2         
	//   26   46:astore_1        
			if(pojopropertybuilder$linked1.name == null)
	//*  27   47:aload_2         
	//*  28   48:getfield        #37  <Field PropertyName name>
	//*  29   51:ifnonnull       9
			{
				if(isVisible == pojopropertybuilder$linked1.isVisible)
	//*  30   54:aload_0         
	//*  31   55:getfield        #51  <Field boolean isVisible>
	//*  32   58:aload_2         
	//*  33   59:getfield        #51  <Field boolean isVisible>
	//*  34   62:icmpne          71
					return withNext(pojopropertybuilder$linked1);
	//   35   65:aload_0         
	//   36   66:aload_2         
	//   37   67:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
	//   38   70:areturn         
				pojopropertybuilder$linked = pojopropertybuilder$linked1;
	//   39   71:aload_2         
	//   40   72:astore_1        
				if(isVisible)
	//*  41   73:aload_0         
	//*  42   74:getfield        #51  <Field boolean isVisible>
	//*  43   77:ifeq            9
					return withNext(((POJOPropertyBuilder$Linked) (null)));
	//   44   80:aload_0         
	//   45   81:aconst_null     
	//   46   82:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
	//   47   85:areturn         
			}
		}
		return pojopropertybuilder$linked;
	}

	public POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked pojopropertybuilder$linked)
	{
		if(pojopropertybuilder$linked == next)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new POJOPropertyBuilder$Linked(value, pojopropertybuilder$linked, name, isNameExplicit, isVisible, isMarkedIgnored);
	//    6   10:new             #2   <Class POJOPropertyBuilder$Linked>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #27  <Field Object value>
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #37  <Field PropertyName name>
	//   13   23:aload_0         
	//   14   24:getfield        #49  <Field boolean isNameExplicit>
	//   15   27:aload_0         
	//   16   28:getfield        #51  <Field boolean isVisible>
	//   17   31:aload_0         
	//   18   32:getfield        #53  <Field boolean isMarkedIgnored>
	//   19   35:invokespecial   #96  <Method void POJOPropertyBuilder$Linked(Object, POJOPropertyBuilder$Linked, PropertyName, boolean, boolean, boolean)>
	//   20   38:areturn         
	}

	public POJOPropertyBuilder$Linked withValue(Object obj)
	{
		if(obj == value)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #27  <Field Object value>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new POJOPropertyBuilder$Linked(obj, next, name, isNameExplicit, isVisible, isMarkedIgnored);
	//    6   10:new             #2   <Class POJOPropertyBuilder$Linked>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//   11   19:aload_0         
	//   12   20:getfield        #37  <Field PropertyName name>
	//   13   23:aload_0         
	//   14   24:getfield        #49  <Field boolean isNameExplicit>
	//   15   27:aload_0         
	//   16   28:getfield        #51  <Field boolean isVisible>
	//   17   31:aload_0         
	//   18   32:getfield        #53  <Field boolean isMarkedIgnored>
	//   19   35:invokespecial   #96  <Method void POJOPropertyBuilder$Linked(Object, POJOPropertyBuilder$Linked, PropertyName, boolean, boolean, boolean)>
	//   20   38:areturn         
	}

	public POJOPropertyBuilder$Linked withoutIgnored()
	{
		if(isMarkedIgnored)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field boolean isMarkedIgnored>
	//*   2    4:ifeq            24
			if(next == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//*   5   11:ifnonnull       16
				return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
			else
				return next.withoutIgnored();
	//    8   16:aload_0         
	//    9   17:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//   10   20:invokevirtual   #102 <Method POJOPropertyBuilder$Linked withoutIgnored()>
	//   11   23:areturn         
		if(next != null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//*  14   28:ifnull          53
		{
			POJOPropertyBuilder$Linked pojopropertybuilder$linked = next.withoutIgnored();
	//   15   31:aload_0         
	//   16   32:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//   17   35:invokevirtual   #102 <Method POJOPropertyBuilder$Linked withoutIgnored()>
	//   18   38:astore_1        
			if(pojopropertybuilder$linked != next)
	//*  19   39:aload_1         
	//*  20   40:aload_0         
	//*  21   41:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//*  22   44:if_acmpeq       53
				return withNext(pojopropertybuilder$linked);
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
	//   26   52:areturn         
		}
		return this;
	//   27   53:aload_0         
	//   28   54:areturn         
	}

	public POJOPropertyBuilder$Linked withoutNext()
	{
		if(next == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//*   2    4:ifnonnull       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			return new POJOPropertyBuilder$Linked(value, ((POJOPropertyBuilder$Linked) (null)), name, isNameExplicit, isVisible, isMarkedIgnored);
	//    5    9:new             #2   <Class POJOPropertyBuilder$Linked>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #27  <Field Object value>
	//    9   17:aconst_null     
	//   10   18:aload_0         
	//   11   19:getfield        #37  <Field PropertyName name>
	//   12   22:aload_0         
	//   13   23:getfield        #49  <Field boolean isNameExplicit>
	//   14   26:aload_0         
	//   15   27:getfield        #51  <Field boolean isVisible>
	//   16   30:aload_0         
	//   17   31:getfield        #53  <Field boolean isMarkedIgnored>
	//   18   34:invokespecial   #96  <Method void POJOPropertyBuilder$Linked(Object, POJOPropertyBuilder$Linked, PropertyName, boolean, boolean, boolean)>
	//   19   37:areturn         
	}

	public POJOPropertyBuilder$Linked withoutNonVisible()
	{
		POJOPropertyBuilder$Linked pojopropertybuilder$linked;
		POJOPropertyBuilder$Linked pojopropertybuilder$linked1;
		if(next == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//*   2    4:ifnonnull       26
			pojopropertybuilder$linked = null;
	//    3    7:aconst_null     
	//    4    8:astore_1        
		else
	//*   5    9:aload_1         
	//*   6   10:astore_2        
	//*   7   11:aload_0         
	//*   8   12:getfield        #51  <Field boolean isVisible>
	//*   9   15:ifeq            24
	//*  10   18:aload_0         
	//*  11   19:aload_1         
	//*  12   20:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
	//*  13   23:astore_2        
	//*  14   24:aload_2         
	//*  15   25:areturn         
			pojopropertybuilder$linked = next.withoutNonVisible();
	//   16   26:aload_0         
	//   17   27:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//   18   30:invokevirtual   #106 <Method POJOPropertyBuilder$Linked withoutNonVisible()>
	//   19   33:astore_1        
		pojopropertybuilder$linked1 = pojopropertybuilder$linked;
		if(isVisible)
			pojopropertybuilder$linked1 = withNext(pojopropertybuilder$linked);
		return pojopropertybuilder$linked1;
	//*  20   34:goto            9
	}

	public final boolean isMarkedIgnored;
	public final boolean isNameExplicit;
	public final boolean isVisible;
	public final PropertyName name;
	public final POJOPropertyBuilder$Linked next;
	public final Object value;

	public POJOPropertyBuilder$Linked(Object obj, POJOPropertyBuilder$Linked pojopropertybuilder$linked, PropertyName propertyname, boolean flag, boolean flag1, boolean flag2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		value = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field Object value>
		next = pojopropertybuilder$linked;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field POJOPropertyBuilder$Linked next>
		boolean flag3;
		if(propertyname == null || propertyname.isEmpty())
	//*   8   14:aload_3         
	//*   9   15:ifnull          25
	//*  10   18:aload_3         
	//*  11   19:invokevirtual   #35  <Method boolean PropertyName.isEmpty()>
	//*  12   22:ifeq            58
			obj = null;
	//   13   25:aconst_null     
	//   14   26:astore_1        
		else
	//*  15   27:aload_0         
	//*  16   28:aload_1         
	//*  17   29:putfield        #37  <Field PropertyName name>
	//*  18   32:iload           4
	//*  19   34:istore          7
	//*  20   36:iload           4
	//*  21   38:ifeq            77
	//*  22   41:aload_0         
	//*  23   42:getfield        #37  <Field PropertyName name>
	//*  24   45:ifnonnull       63
	//*  25   48:new             #39  <Class IllegalArgumentException>
	//*  26   51:dup             
	//*  27   52:ldc1            #41  <String "Can not pass true for 'explName' if name is null/empty">
	//*  28   54:invokespecial   #44  <Method void IllegalArgumentException(String)>
	//*  29   57:athrow          
			obj = ((Object) (propertyname));
	//   30   58:aload_3         
	//   31   59:astore_1        
		name = ((PropertyName) (obj));
		flag3 = flag;
		if(flag)
		{
			if(name == null)
				throw new IllegalArgumentException("Can not pass true for 'explName' if name is null/empty");
	//*  32   60:goto            27
			flag3 = flag;
	//   33   63:iload           4
	//   34   65:istore          7
			if(!propertyname.hasSimpleName())
	//*  35   67:aload_3         
	//*  36   68:invokevirtual   #47  <Method boolean PropertyName.hasSimpleName()>
	//*  37   71:ifne            77
				flag3 = false;
	//   38   74:iconst_0        
	//   39   75:istore          7
		}
		isNameExplicit = flag3;
	//   40   77:aload_0         
	//   41   78:iload           7
	//   42   80:putfield        #49  <Field boolean isNameExplicit>
		isVisible = flag1;
	//   43   83:aload_0         
	//   44   84:iload           5
	//   45   86:putfield        #51  <Field boolean isVisible>
		isMarkedIgnored = flag2;
	//   46   89:aload_0         
	//   47   90:iload           6
	//   48   92:putfield        #53  <Field boolean isMarkedIgnored>
	//   49   95:return          
	}
}
