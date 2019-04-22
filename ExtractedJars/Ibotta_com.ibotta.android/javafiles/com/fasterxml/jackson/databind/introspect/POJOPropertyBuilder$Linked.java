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
		POJOPropertyBuilder$Linked pojopropertybuilder$linked1 = next;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//    2    4:astore_2        
		if(pojopropertybuilder$linked1 == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       15
			return withNext(pojopropertybuilder$linked);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
	//    8   14:areturn         
		else
			return withNext(pojopropertybuilder$linked1.append(pojopropertybuilder$linked));
	//    9   15:aload_0         
	//   10   16:aload_2         
	//   11   17:aload_1         
	//   12   18:invokevirtual   #63  <Method POJOPropertyBuilder$Linked append(POJOPropertyBuilder$Linked)>
	//   13   21:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
	//   14   24:areturn         
	}

	public String toString()
	{
		String s = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", new Object[] {
			value.toString(), Boolean.valueOf(isVisible), Boolean.valueOf(isMarkedIgnored), Boolean.valueOf(isNameExplicit)
		});
	//    0    0:ldc1            #68  <String "%s[visible=%b,ignore=%b,explicitName=%b]">
	//    1    2:iconst_4        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #27  <Field Object value>
	//    7   12:invokevirtual   #70  <Method String Object.toString()>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_0         
	//   12   19:getfield        #51  <Field boolean isVisible>
	//   13   22:invokestatic    #76  <Method Boolean Boolean.valueOf(boolean)>
	//   14   25:aastore         
	//   15   26:dup             
	//   16   27:iconst_2        
	//   17   28:aload_0         
	//   18   29:getfield        #53  <Field boolean isMarkedIgnored>
	//   19   32:invokestatic    #76  <Method Boolean Boolean.valueOf(boolean)>
	//   20   35:aastore         
	//   21   36:dup             
	//   22   37:iconst_3        
	//   23   38:aload_0         
	//   24   39:getfield        #49  <Field boolean isNameExplicit>
	//   25   42:invokestatic    #76  <Method Boolean Boolean.valueOf(boolean)>
	//   26   45:aastore         
	//   27   46:invokestatic    #82  <Method String String.format(String, Object[])>
	//   28   49:astore_2        
		Object obj = ((Object) (s));
	//   29   50:aload_2         
	//   30   51:astore_1        
		if(next != null)
	//*  31   52:aload_0         
	//*  32   53:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//*  33   56:ifnull          97
		{
			obj = ((Object) (new StringBuilder()));
	//   34   59:new             #84  <Class StringBuilder>
	//   35   62:dup             
	//   36   63:invokespecial   #85  <Method void StringBuilder()>
	//   37   66:astore_1        
			((StringBuilder) (obj)).append(s);
	//   38   67:aload_1         
	//   39   68:aload_2         
	//   40   69:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   41   72:pop             
			((StringBuilder) (obj)).append(", ");
	//   42   73:aload_1         
	//   43   74:ldc1            #90  <String ", ">
	//   44   76:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   45   79:pop             
			((StringBuilder) (obj)).append(next.toString());
	//   46   80:aload_1         
	//   47   81:aload_0         
	//   48   82:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//   49   85:invokevirtual   #91  <Method String toString()>
	//   50   88:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   51   91:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   52   92:aload_1         
	//   53   93:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   54   96:astore_1        
		}
		return ((String) (obj));
	//   55   97:aload_1         
	//   56   98:areturn         
	}

	public POJOPropertyBuilder$Linked trimByVisibility()
	{
		POJOPropertyBuilder$Linked pojopropertybuilder$linked = next;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//    2    4:astore_2        
		if(pojopropertybuilder$linked == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return this;
	//    5    9:aload_0         
	//    6   10:areturn         
		pojopropertybuilder$linked = pojopropertybuilder$linked.trimByVisibility();
	//    7   11:aload_2         
	//    8   12:invokevirtual   #96  <Method POJOPropertyBuilder$Linked trimByVisibility()>
	//    9   15:astore_2        
		if(name != null)
	//*  10   16:aload_0         
	//*  11   17:getfield        #37  <Field PropertyName name>
	//*  12   20:ifnull          42
			if(pojopropertybuilder$linked.name == null)
	//*  13   23:aload_2         
	//*  14   24:getfield        #37  <Field PropertyName name>
	//*  15   27:ifnonnull       36
				return withNext(((POJOPropertyBuilder$Linked) (null)));
	//   16   30:aload_0         
	//   17   31:aconst_null     
	//   18   32:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
	//   19   35:areturn         
			else
				return withNext(pojopropertybuilder$linked);
	//   20   36:aload_0         
	//   21   37:aload_2         
	//   22   38:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
	//   23   41:areturn         
		if(pojopropertybuilder$linked.name != null)
	//*  24   42:aload_2         
	//*  25   43:getfield        #37  <Field PropertyName name>
	//*  26   46:ifnull          51
			return pojopropertybuilder$linked;
	//   27   49:aload_2         
	//   28   50:areturn         
		boolean flag = isVisible;
	//   29   51:aload_0         
	//   30   52:getfield        #51  <Field boolean isVisible>
	//   31   55:istore_1        
		if(flag == pojopropertybuilder$linked.isVisible)
	//*  32   56:iload_1         
	//*  33   57:aload_2         
	//*  34   58:getfield        #51  <Field boolean isVisible>
	//*  35   61:icmpne          70
			return withNext(pojopropertybuilder$linked);
	//   36   64:aload_0         
	//   37   65:aload_2         
	//   38   66:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
	//   39   69:areturn         
		if(flag)
	//*  40   70:iload_1         
	//*  41   71:ifeq            80
			pojopropertybuilder$linked = withNext(((POJOPropertyBuilder$Linked) (null)));
	//   42   74:aload_0         
	//   43   75:aconst_null     
	//   44   76:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
	//   45   79:astore_2        
		return pojopropertybuilder$linked;
	//   46   80:aload_2         
	//   47   81:areturn         
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
	//   19   35:invokespecial   #99  <Method void POJOPropertyBuilder$Linked(Object, POJOPropertyBuilder$Linked, PropertyName, boolean, boolean, boolean)>
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
	//   19   35:invokespecial   #99  <Method void POJOPropertyBuilder$Linked(Object, POJOPropertyBuilder$Linked, PropertyName, boolean, boolean, boolean)>
	//   20   38:areturn         
	}

	public POJOPropertyBuilder$Linked withoutIgnored()
	{
		if(isMarkedIgnored)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field boolean isMarkedIgnored>
	//*   2    4:ifeq            23
		{
			POJOPropertyBuilder$Linked pojopropertybuilder$linked = next;
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//    5   11:astore_1        
			if(pojopropertybuilder$linked == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
				return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
			else
				return pojopropertybuilder$linked.withoutIgnored();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #105 <Method POJOPropertyBuilder$Linked withoutIgnored()>
	//   12   22:areturn         
		}
		POJOPropertyBuilder$Linked pojopropertybuilder$linked1 = next;
	//   13   23:aload_0         
	//   14   24:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//   15   27:astore_1        
		if(pojopropertybuilder$linked1 != null)
	//*  16   28:aload_1         
	//*  17   29:ifnull          51
		{
			pojopropertybuilder$linked1 = pojopropertybuilder$linked1.withoutIgnored();
	//   18   32:aload_1         
	//   19   33:invokevirtual   #105 <Method POJOPropertyBuilder$Linked withoutIgnored()>
	//   20   36:astore_1        
			if(pojopropertybuilder$linked1 != next)
	//*  21   37:aload_1         
	//*  22   38:aload_0         
	//*  23   39:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//*  24   42:if_acmpeq       51
				return withNext(pojopropertybuilder$linked1);
	//   25   45:aload_0         
	//   26   46:aload_1         
	//   27   47:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
	//   28   50:areturn         
		}
		return this;
	//   29   51:aload_0         
	//   30   52:areturn         
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
	//   18   34:invokespecial   #99  <Method void POJOPropertyBuilder$Linked(Object, POJOPropertyBuilder$Linked, PropertyName, boolean, boolean, boolean)>
	//   19   37:areturn         
	}

	public POJOPropertyBuilder$Linked withoutNonVisible()
	{
		POJOPropertyBuilder$Linked pojopropertybuilder$linked = next;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field POJOPropertyBuilder$Linked next>
	//    2    4:astore_1        
		if(pojopropertybuilder$linked == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
			pojopropertybuilder$linked = null;
	//    5    9:aconst_null     
	//    6   10:astore_1        
		else
	//*   7   11:goto            19
			pojopropertybuilder$linked = pojopropertybuilder$linked.withoutNonVisible();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #109 <Method POJOPropertyBuilder$Linked withoutNonVisible()>
	//   10   18:astore_1        
		POJOPropertyBuilder$Linked pojopropertybuilder$linked1 = pojopropertybuilder$linked;
	//   11   19:aload_1         
	//   12   20:astore_2        
		if(isVisible)
	//*  13   21:aload_0         
	//*  14   22:getfield        #51  <Field boolean isVisible>
	//*  15   25:ifeq            34
			pojopropertybuilder$linked1 = withNext(pojopropertybuilder$linked);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
	//   19   33:astore_2        
		return pojopropertybuilder$linked1;
	//   20   34:aload_2         
	//   21   35:areturn         
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
		if(propertyname != null && !propertyname.isEmpty())
	//*   8   14:aload_3         
	//*   9   15:ifnull          33
	//*  10   18:aload_3         
	//*  11   19:invokevirtual   #35  <Method boolean PropertyName.isEmpty()>
	//*  12   22:ifeq            28
	//*  13   25:goto            33
			obj = ((Object) (propertyname));
	//   14   28:aload_3         
	//   15   29:astore_1        
		else
	//*  16   30:goto            35
			obj = null;
	//   17   33:aconst_null     
	//   18   34:astore_1        
		name = ((PropertyName) (obj));
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:putfield        #37  <Field PropertyName name>
		boolean flag3 = flag;
	//   22   40:iload           4
	//   23   42:istore          7
		if(flag)
	//*  24   44:iload           4
	//*  25   46:ifeq            83
			if(name != null)
	//*  26   49:aload_0         
	//*  27   50:getfield        #37  <Field PropertyName name>
	//*  28   53:ifnull          73
			{
				flag3 = flag;
	//   29   56:iload           4
	//   30   58:istore          7
				if(!propertyname.hasSimpleName())
	//*  31   60:aload_3         
	//*  32   61:invokevirtual   #40  <Method boolean PropertyName.hasSimpleName()>
	//*  33   64:ifne            83
					flag3 = false;
	//   34   67:iconst_0        
	//   35   68:istore          7
			} else
	//*  36   70:goto            83
			{
				throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
	//   37   73:new             #42  <Class IllegalArgumentException>
	//   38   76:dup             
	//   39   77:ldc1            #44  <String "Cannot pass true for 'explName' if name is null/empty">
	//   40   79:invokespecial   #47  <Method void IllegalArgumentException(String)>
	//   41   82:athrow          
			}
		isNameExplicit = flag3;
	//   42   83:aload_0         
	//   43   84:iload           7
	//   44   86:putfield        #49  <Field boolean isNameExplicit>
		isVisible = flag1;
	//   45   89:aload_0         
	//   46   90:iload           5
	//   47   92:putfield        #51  <Field boolean isVisible>
		isMarkedIgnored = flag2;
	//   48   95:aload_0         
	//   49   96:iload           6
	//   50   98:putfield        #53  <Field boolean isMarkedIgnored>
	//   51  101:return          
	}
}
