// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.ConfigOverride;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			BeanPropertyDefinition, AnnotatedMember, AnnotationMap, AnnotatedMethod, 
//			ObjectIdInfo, AnnotatedParameter, AnnotatedConstructor, AnnotatedField

public class POJOPropertyBuilder extends BeanPropertyDefinition
	implements Comparable
{
	protected static final class Linked
	{

		protected Linked append(Linked linked)
		{
			Linked linked1 = next;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field POJOPropertyBuilder$Linked next>
		//    2    4:astore_2        
			if(linked1 == null)
		//*   3    5:aload_2         
		//*   4    6:ifnonnull       15
				return withNext(linked);
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
		//    8   14:areturn         
			else
				return withNext(linked1.append(linked));
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

		public Linked trimByVisibility()
		{
			Linked linked = next;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field POJOPropertyBuilder$Linked next>
		//    2    4:astore_2        
			if(linked == null)
		//*   3    5:aload_2         
		//*   4    6:ifnonnull       11
				return this;
		//    5    9:aload_0         
		//    6   10:areturn         
			linked = linked.trimByVisibility();
		//    7   11:aload_2         
		//    8   12:invokevirtual   #96  <Method POJOPropertyBuilder$Linked trimByVisibility()>
		//    9   15:astore_2        
			if(name != null)
		//*  10   16:aload_0         
		//*  11   17:getfield        #37  <Field PropertyName name>
		//*  12   20:ifnull          42
				if(linked.name == null)
		//*  13   23:aload_2         
		//*  14   24:getfield        #37  <Field PropertyName name>
		//*  15   27:ifnonnull       36
					return withNext(((Linked) (null)));
		//   16   30:aload_0         
		//   17   31:aconst_null     
		//   18   32:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
		//   19   35:areturn         
				else
					return withNext(linked);
		//   20   36:aload_0         
		//   21   37:aload_2         
		//   22   38:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
		//   23   41:areturn         
			if(linked.name != null)
		//*  24   42:aload_2         
		//*  25   43:getfield        #37  <Field PropertyName name>
		//*  26   46:ifnull          51
				return linked;
		//   27   49:aload_2         
		//   28   50:areturn         
			boolean flag = isVisible;
		//   29   51:aload_0         
		//   30   52:getfield        #51  <Field boolean isVisible>
		//   31   55:istore_1        
			if(flag == linked.isVisible)
		//*  32   56:iload_1         
		//*  33   57:aload_2         
		//*  34   58:getfield        #51  <Field boolean isVisible>
		//*  35   61:icmpne          70
				return withNext(linked);
		//   36   64:aload_0         
		//   37   65:aload_2         
		//   38   66:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
		//   39   69:areturn         
			if(flag)
		//*  40   70:iload_1         
		//*  41   71:ifeq            80
				linked = withNext(((Linked) (null)));
		//   42   74:aload_0         
		//   43   75:aconst_null     
		//   44   76:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
		//   45   79:astore_2        
			return linked;
		//   46   80:aload_2         
		//   47   81:areturn         
		}

		public Linked withNext(Linked linked)
		{
			if(linked == next)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #29  <Field POJOPropertyBuilder$Linked next>
		//*   3    5:if_acmpne       10
				return this;
		//    4    8:aload_0         
		//    5    9:areturn         
			else
				return new Linked(value, linked, name, isNameExplicit, isVisible, isMarkedIgnored);
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

		public Linked withValue(Object obj)
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
				return new Linked(obj, next, name, isNameExplicit, isVisible, isMarkedIgnored);
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

		public Linked withoutIgnored()
		{
			if(isMarkedIgnored)
		//*   0    0:aload_0         
		//*   1    1:getfield        #53  <Field boolean isMarkedIgnored>
		//*   2    4:ifeq            23
			{
				Linked linked = next;
		//    3    7:aload_0         
		//    4    8:getfield        #29  <Field POJOPropertyBuilder$Linked next>
		//    5   11:astore_1        
				if(linked == null)
		//*   6   12:aload_1         
		//*   7   13:ifnonnull       18
					return null;
		//    8   16:aconst_null     
		//    9   17:areturn         
				else
					return linked.withoutIgnored();
		//   10   18:aload_1         
		//   11   19:invokevirtual   #105 <Method POJOPropertyBuilder$Linked withoutIgnored()>
		//   12   22:areturn         
			}
			Linked linked1 = next;
		//   13   23:aload_0         
		//   14   24:getfield        #29  <Field POJOPropertyBuilder$Linked next>
		//   15   27:astore_1        
			if(linked1 != null)
		//*  16   28:aload_1         
		//*  17   29:ifnull          51
			{
				linked1 = linked1.withoutIgnored();
		//   18   32:aload_1         
		//   19   33:invokevirtual   #105 <Method POJOPropertyBuilder$Linked withoutIgnored()>
		//   20   36:astore_1        
				if(linked1 != next)
		//*  21   37:aload_1         
		//*  22   38:aload_0         
		//*  23   39:getfield        #29  <Field POJOPropertyBuilder$Linked next>
		//*  24   42:if_acmpeq       51
					return withNext(linked1);
		//   25   45:aload_0         
		//   26   46:aload_1         
		//   27   47:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
		//   28   50:areturn         
			}
			return this;
		//   29   51:aload_0         
		//   30   52:areturn         
		}

		public Linked withoutNext()
		{
			if(next == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field POJOPropertyBuilder$Linked next>
		//*   2    4:ifnonnull       9
				return this;
		//    3    7:aload_0         
		//    4    8:areturn         
			else
				return new Linked(value, ((Linked) (null)), name, isNameExplicit, isVisible, isMarkedIgnored);
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

		public Linked withoutNonVisible()
		{
			Linked linked = next;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field POJOPropertyBuilder$Linked next>
		//    2    4:astore_1        
			if(linked == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       14
				linked = null;
		//    5    9:aconst_null     
		//    6   10:astore_1        
			else
		//*   7   11:goto            19
				linked = linked.withoutNonVisible();
		//    8   14:aload_1         
		//    9   15:invokevirtual   #109 <Method POJOPropertyBuilder$Linked withoutNonVisible()>
		//   10   18:astore_1        
			Linked linked1 = linked;
		//   11   19:aload_1         
		//   12   20:astore_2        
			if(isVisible)
		//*  13   21:aload_0         
		//*  14   22:getfield        #51  <Field boolean isVisible>
		//*  15   25:ifeq            34
				linked1 = withNext(linked);
		//   16   28:aload_0         
		//   17   29:aload_1         
		//   18   30:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
		//   19   33:astore_2        
			return linked1;
		//   20   34:aload_2         
		//   21   35:areturn         
		}

		public final boolean isMarkedIgnored;
		public final boolean isNameExplicit;
		public final boolean isVisible;
		public final PropertyName name;
		public final Linked next;
		public final Object value;

		public Linked(Object obj, Linked linked, PropertyName propertyname, boolean flag, boolean flag1, boolean flag2)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			value = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #27  <Field Object value>
			next = linked;
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

	protected static class MemberIterator
		implements Iterator
	{

		public boolean hasNext()
		{
			return next != null;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field POJOPropertyBuilder$Linked next>
		//    2    4:ifnull          9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		public AnnotatedMember next()
		{
			Object obj = ((Object) (next));
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field POJOPropertyBuilder$Linked next>
		//    2    4:astore_1        
			if(obj != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          30
			{
				obj = ((Object) ((AnnotatedMember)((Linked) (obj)).value));
		//    5    9:aload_1         
		//    6   10:getfield        #32  <Field Object POJOPropertyBuilder$Linked.value>
		//    7   13:checkcast       #34  <Class AnnotatedMember>
		//    8   16:astore_1        
				next = next.next;
		//    9   17:aload_0         
		//   10   18:aload_0         
		//   11   19:getfield        #20  <Field POJOPropertyBuilder$Linked next>
		//   12   22:getfield        #35  <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
		//   13   25:putfield        #20  <Field POJOPropertyBuilder$Linked next>
				return ((AnnotatedMember) (obj));
		//   14   28:aload_1         
		//   15   29:areturn         
			} else
			{
				throw new NoSuchElementException();
		//   16   30:new             #37  <Class NoSuchElementException>
		//   17   33:dup             
		//   18   34:invokespecial   #38  <Method void NoSuchElementException()>
		//   19   37:athrow          
			}
		}

		public volatile Object next()
		{
			return ((Object) (next()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #42  <Method AnnotatedMember next()>
		//    2    4:areturn         
		}

		public void remove()
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #45  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #46  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		private Linked next;

		public MemberIterator(Linked linked)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			next = linked;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field POJOPropertyBuilder$Linked next>
		//    5    9:return          
		}
	}

	private static interface WithMember
	{

		public abstract Object withMember(AnnotatedMember annotatedmember);
	}


	public POJOPropertyBuilder(MapperConfig mapperconfig, AnnotationIntrospector annotationintrospector, boolean flag, PropertyName propertyname)
	{
		this(mapperconfig, annotationintrospector, flag, propertyname, propertyname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:aload           4
	//    6    8:invokespecial   #77  <Method void POJOPropertyBuilder(MapperConfig, AnnotationIntrospector, boolean, PropertyName, PropertyName)>
	//    7   11:return          
	}

	protected POJOPropertyBuilder(MapperConfig mapperconfig, AnnotationIntrospector annotationintrospector, boolean flag, PropertyName propertyname, PropertyName propertyname1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void BeanPropertyDefinition()>
		_config = mapperconfig;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #83  <Field MapperConfig _config>
		_annotationIntrospector = annotationintrospector;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #85  <Field AnnotationIntrospector _annotationIntrospector>
		_internalName = propertyname;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #87  <Field PropertyName _internalName>
		_name = propertyname1;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #89  <Field PropertyName _name>
		_forSerialization = flag;
	//   14   26:aload_0         
	//   15   27:iload_3         
	//   16   28:putfield        #91  <Field boolean _forSerialization>
	//   17   31:return          
	}

	protected POJOPropertyBuilder(POJOPropertyBuilder pojopropertybuilder, PropertyName propertyname)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void BeanPropertyDefinition()>
		_config = pojopropertybuilder._config;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #83  <Field MapperConfig _config>
	//    5    9:putfield        #83  <Field MapperConfig _config>
		_annotationIntrospector = pojopropertybuilder._annotationIntrospector;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #85  <Field AnnotationIntrospector _annotationIntrospector>
	//    9   17:putfield        #85  <Field AnnotationIntrospector _annotationIntrospector>
		_internalName = pojopropertybuilder._internalName;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #87  <Field PropertyName _internalName>
	//   13   25:putfield        #87  <Field PropertyName _internalName>
		_name = propertyname;
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:putfield        #89  <Field PropertyName _name>
		_fields = pojopropertybuilder._fields;
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//   20   38:putfield        #95  <Field POJOPropertyBuilder$Linked _fields>
		_ctorParameters = pojopropertybuilder._ctorParameters;
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   24   46:putfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
		_getters = pojopropertybuilder._getters;
	//   25   49:aload_0         
	//   26   50:aload_1         
	//   27   51:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//   28   54:putfield        #99  <Field POJOPropertyBuilder$Linked _getters>
		_setters = pojopropertybuilder._setters;
	//   29   57:aload_0         
	//   30   58:aload_1         
	//   31   59:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//   32   62:putfield        #101 <Field POJOPropertyBuilder$Linked _setters>
		_forSerialization = pojopropertybuilder._forSerialization;
	//   33   65:aload_0         
	//   34   66:aload_1         
	//   35   67:getfield        #91  <Field boolean _forSerialization>
	//   36   70:putfield        #91  <Field boolean _forSerialization>
	//   37   73:return          
	}

	private boolean _anyExplicitNames(Linked linked)
	{
		for(; linked != null; linked = linked.next)
	//*   0    0:aload_1         
	//*   1    1:ifnull          28
			if(linked.name != null && linked.isNameExplicit)
	//*   2    4:aload_1         
	//*   3    5:getfield        #106 <Field PropertyName POJOPropertyBuilder$Linked.name>
	//*   4    8:ifnull          20
	//*   5   11:aload_1         
	//*   6   12:getfield        #109 <Field boolean POJOPropertyBuilder$Linked.isNameExplicit>
	//*   7   15:ifeq            20
				return true;
	//    8   18:iconst_1        
	//    9   19:ireturn         

	//   10   20:aload_1         
	//   11   21:getfield        #112 <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//   12   24:astore_1        
	//*  13   25:goto            0
		return false;
	//   14   28:iconst_0        
	//   15   29:ireturn         
	}

	private boolean _anyExplicits(Linked linked)
	{
		for(; linked != null; linked = linked.next)
	//*   0    0:aload_1         
	//*   1    1:ifnull          31
			if(linked.name != null && linked.name.hasSimpleName())
	//*   2    4:aload_1         
	//*   3    5:getfield        #106 <Field PropertyName POJOPropertyBuilder$Linked.name>
	//*   4    8:ifnull          23
	//*   5   11:aload_1         
	//*   6   12:getfield        #106 <Field PropertyName POJOPropertyBuilder$Linked.name>
	//*   7   15:invokevirtual   #120 <Method boolean PropertyName.hasSimpleName()>
	//*   8   18:ifeq            23
				return true;
	//    9   21:iconst_1        
	//   10   22:ireturn         

	//   11   23:aload_1         
	//   12   24:getfield        #112 <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//   13   27:astore_1        
	//*  14   28:goto            0
		return false;
	//   15   31:iconst_0        
	//   16   32:ireturn         
	}

	private boolean _anyIgnorals(Linked linked)
	{
		for(; linked != null; linked = linked.next)
	//*   0    0:aload_1         
	//*   1    1:ifnull          21
			if(linked.isMarkedIgnored)
	//*   2    4:aload_1         
	//*   3    5:getfield        #124 <Field boolean POJOPropertyBuilder$Linked.isMarkedIgnored>
	//*   4    8:ifeq            13
				return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         

	//    7   13:aload_1         
	//    8   14:getfield        #112 <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//    9   17:astore_1        
	//*  10   18:goto            0
		return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	private boolean _anyVisible(Linked linked)
	{
		for(; linked != null; linked = linked.next)
	//*   0    0:aload_1         
	//*   1    1:ifnull          21
			if(linked.isVisible)
	//*   2    4:aload_1         
	//*   3    5:getfield        #128 <Field boolean POJOPropertyBuilder$Linked.isVisible>
	//*   4    8:ifeq            13
				return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         

	//    7   13:aload_1         
	//    8   14:getfield        #112 <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//    9   17:astore_1        
	//*  10   18:goto            0
		return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	private Linked _applyAnnotations(Linked linked, AnnotationMap annotationmap)
	{
		AnnotatedMember annotatedmember = (AnnotatedMember)((AnnotatedMember)linked.value).withAnnotations(annotationmap);
	//    0    0:aload_1         
	//    1    1:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//    2    4:checkcast       #136 <Class AnnotatedMember>
	//    3    7:aload_2         
	//    4    8:invokevirtual   #140 <Method Annotated AnnotatedMember.withAnnotations(AnnotationMap)>
	//    5   11:checkcast       #136 <Class AnnotatedMember>
	//    6   14:astore          4
		Linked linked1 = linked;
	//    7   16:aload_1         
	//    8   17:astore_3        
		if(linked.next != null)
	//*   9   18:aload_1         
	//*  10   19:getfield        #112 <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//*  11   22:ifnull          39
			linked1 = linked.withNext(_applyAnnotations(linked.next, annotationmap));
	//   12   25:aload_1         
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:getfield        #112 <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//   16   31:aload_2         
	//   17   32:invokespecial   #142 <Method POJOPropertyBuilder$Linked _applyAnnotations(POJOPropertyBuilder$Linked, AnnotationMap)>
	//   18   35:invokevirtual   #146 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.withNext(POJOPropertyBuilder$Linked)>
	//   19   38:astore_3        
		return linked1.withValue(((Object) (annotatedmember)));
	//   20   39:aload_3         
	//   21   40:aload           4
	//   22   42:invokevirtual   #150 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.withValue(Object)>
	//   23   45:areturn         
	}

	private void _explode(Collection collection, Map map, Linked linked)
	{
label0:
		{
			Linked linked1 = linked;
	//    0    0:aload_3         
	//    1    1:astore          5
			do
			{
				if(linked1 == null)
					break label0;
	//    2    3:aload           5
	//    3    5:ifnull          330
				PropertyName propertyname = linked1.name;
	//    4    8:aload           5
	//    5   10:getfield        #106 <Field PropertyName POJOPropertyBuilder$Linked.name>
	//    6   13:astore          8
				if(linked1.isNameExplicit && propertyname != null)
	//*   7   15:aload           5
	//*   8   17:getfield        #109 <Field boolean POJOPropertyBuilder$Linked.isNameExplicit>
	//*   9   20:ifeq            249
	//*  10   23:aload           8
	//*  11   25:ifnonnull       31
	//*  12   28:goto            249
				{
					POJOPropertyBuilder pojopropertybuilder1 = (POJOPropertyBuilder)map.get(((Object) (propertyname)));
	//   13   31:aload_2         
	//   14   32:aload           8
	//   15   34:invokeinterface #159 <Method Object Map.get(Object)>
	//   16   39:checkcast       #2   <Class POJOPropertyBuilder>
	//   17   42:astore          7
					POJOPropertyBuilder pojopropertybuilder = pojopropertybuilder1;
	//   18   44:aload           7
	//   19   46:astore          6
					if(pojopropertybuilder1 == null)
	//*  20   48:aload           7
	//*  21   50:ifnonnull       112
					{
						POJOPropertyBuilder pojopropertybuilder2 = JVM INSTR new #2   <Class POJOPropertyBuilder>;
	//   22   53:new             #2   <Class POJOPropertyBuilder>
	//   23   56:astore          7
						MapperConfig mapperconfig = _config;
	//   24   58:aload_0         
	//   25   59:getfield        #83  <Field MapperConfig _config>
	//   26   62:astore          9
						AnnotationIntrospector annotationintrospector = _annotationIntrospector;
	//   27   64:aload_0         
	//   28   65:getfield        #85  <Field AnnotationIntrospector _annotationIntrospector>
	//   29   68:astore          10
						boolean flag = _forSerialization;
	//   30   70:aload_0         
	//   31   71:getfield        #91  <Field boolean _forSerialization>
	//   32   74:istore          4
						PropertyName propertyname1 = _internalName;
	//   33   76:aload_0         
	//   34   77:getfield        #87  <Field PropertyName _internalName>
	//   35   80:astore          11
						pojopropertybuilder = pojopropertybuilder2;
	//   36   82:aload           7
	//   37   84:astore          6
						pojopropertybuilder.POJOPropertyBuilder(mapperconfig, annotationintrospector, flag, propertyname1, propertyname);
	//   38   86:aload           6
	//   39   88:aload           9
	//   40   90:aload           10
	//   41   92:iload           4
	//   42   94:aload           11
	//   43   96:aload           8
	//   44   98:invokespecial   #77  <Method void POJOPropertyBuilder(MapperConfig, AnnotationIntrospector, boolean, PropertyName, PropertyName)>
						map.put(((Object) (propertyname)), ((Object) (pojopropertybuilder2)));
	//   45  101:aload_2         
	//   46  102:aload           8
	//   47  104:aload           7
	//   48  106:invokeinterface #163 <Method Object Map.put(Object, Object)>
	//   49  111:pop             
					}
					if(linked == _fields)
	//*  50  112:aload_3         
	//*  51  113:aload_0         
	//*  52  114:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//*  53  117:if_acmpne       138
						pojopropertybuilder._fields = linked1.withNext(pojopropertybuilder._fields);
	//   54  120:aload           6
	//   55  122:aload           5
	//   56  124:aload           6
	//   57  126:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//   58  129:invokevirtual   #146 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.withNext(POJOPropertyBuilder$Linked)>
	//   59  132:putfield        #95  <Field POJOPropertyBuilder$Linked _fields>
					else
	//*  60  135:goto            257
					if(linked == _getters)
	//*  61  138:aload_3         
	//*  62  139:aload_0         
	//*  63  140:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//*  64  143:if_acmpne       164
						pojopropertybuilder._getters = linked1.withNext(pojopropertybuilder._getters);
	//   65  146:aload           6
	//   66  148:aload           5
	//   67  150:aload           6
	//   68  152:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//   69  155:invokevirtual   #146 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.withNext(POJOPropertyBuilder$Linked)>
	//   70  158:putfield        #99  <Field POJOPropertyBuilder$Linked _getters>
					else
	//*  71  161:goto            257
					if(linked == _setters)
	//*  72  164:aload_3         
	//*  73  165:aload_0         
	//*  74  166:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//*  75  169:if_acmpne       190
						pojopropertybuilder._setters = linked1.withNext(pojopropertybuilder._setters);
	//   76  172:aload           6
	//   77  174:aload           5
	//   78  176:aload           6
	//   79  178:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//   80  181:invokevirtual   #146 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.withNext(POJOPropertyBuilder$Linked)>
	//   81  184:putfield        #101 <Field POJOPropertyBuilder$Linked _setters>
					else
	//*  82  187:goto            257
					if(linked == _ctorParameters)
	//*  83  190:aload_3         
	//*  84  191:aload_0         
	//*  85  192:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//*  86  195:if_acmpne       216
					{
						pojopropertybuilder._ctorParameters = linked1.withNext(pojopropertybuilder._ctorParameters);
	//   87  198:aload           6
	//   88  200:aload           5
	//   89  202:aload           6
	//   90  204:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   91  207:invokevirtual   #146 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.withNext(POJOPropertyBuilder$Linked)>
	//   92  210:putfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
					} else
	//*  93  213:goto            257
					{
						collection = ((Collection) (new StringBuilder()));
	//   94  216:new             #165 <Class StringBuilder>
	//   95  219:dup             
	//   96  220:invokespecial   #166 <Method void StringBuilder()>
	//   97  223:astore_1        
						((StringBuilder) (collection)).append("Internal error: mismatched accessors, property: ");
	//   98  224:aload_1         
	//   99  225:ldc1            #168 <String "Internal error: mismatched accessors, property: ">
	//  100  227:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//  101  230:pop             
						((StringBuilder) (collection)).append(((Object) (this)));
	//  102  231:aload_1         
	//  103  232:aload_0         
	//  104  233:invokevirtual   #175 <Method StringBuilder StringBuilder.append(Object)>
	//  105  236:pop             
						throw new IllegalStateException(((StringBuilder) (collection)).toString());
	//  106  237:new             #177 <Class IllegalStateException>
	//  107  240:dup             
	//  108  241:aload_1         
	//  109  242:invokevirtual   #181 <Method String StringBuilder.toString()>
	//  110  245:invokespecial   #184 <Method void IllegalStateException(String)>
	//  111  248:athrow          
					}
				} else
				if(linked1.isVisible)
					break;
	//  112  249:aload           5
	//  113  251:getfield        #128 <Field boolean POJOPropertyBuilder$Linked.isVisible>
	//  114  254:ifne            267
				linked1 = linked1.next;
	//  115  257:aload           5
	//  116  259:getfield        #112 <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//  117  262:astore          5
			} while(true);
	//  118  264:goto            3
			map = ((Map) (new StringBuilder()));
	//  119  267:new             #165 <Class StringBuilder>
	//  120  270:dup             
	//  121  271:invokespecial   #166 <Method void StringBuilder()>
	//  122  274:astore_2        
			((StringBuilder) (map)).append("Conflicting/ambiguous property name definitions (implicit name '");
	//  123  275:aload_2         
	//  124  276:ldc1            #186 <String "Conflicting/ambiguous property name definitions (implicit name '">
	//  125  278:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//  126  281:pop             
			((StringBuilder) (map)).append(((Object) (_name)));
	//  127  282:aload_2         
	//  128  283:aload_0         
	//  129  284:getfield        #89  <Field PropertyName _name>
	//  130  287:invokevirtual   #175 <Method StringBuilder StringBuilder.append(Object)>
	//  131  290:pop             
			((StringBuilder) (map)).append("'): found multiple explicit names: ");
	//  132  291:aload_2         
	//  133  292:ldc1            #188 <String "'): found multiple explicit names: ">
	//  134  294:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//  135  297:pop             
			((StringBuilder) (map)).append(((Object) (collection)));
	//  136  298:aload_2         
	//  137  299:aload_1         
	//  138  300:invokevirtual   #175 <Method StringBuilder StringBuilder.append(Object)>
	//  139  303:pop             
			((StringBuilder) (map)).append(", but also implicit accessor: ");
	//  140  304:aload_2         
	//  141  305:ldc1            #190 <String ", but also implicit accessor: ">
	//  142  307:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//  143  310:pop             
			((StringBuilder) (map)).append(((Object) (linked1)));
	//  144  311:aload_2         
	//  145  312:aload           5
	//  146  314:invokevirtual   #175 <Method StringBuilder StringBuilder.append(Object)>
	//  147  317:pop             
			throw new IllegalStateException(((StringBuilder) (map)).toString());
	//  148  318:new             #177 <Class IllegalStateException>
	//  149  321:dup             
	//  150  322:aload_2         
	//  151  323:invokevirtual   #181 <Method String StringBuilder.toString()>
	//  152  326:invokespecial   #184 <Method void IllegalStateException(String)>
	//  153  329:athrow          
		}
	//  154  330:return          
	}

	private Set _findExplicitNames(Linked linked, Set set)
	{
		for(Linked linked1 = linked; linked1 != null;)
	//*   0    0:aload_1         
	//*   1    1:astore_3        
	//*   2    2:aload_3         
	//*   3    3:ifnull          62
		{
			linked = ((Linked) (set));
	//    4    6:aload_2         
	//    5    7:astore_1        
			if(linked1.isNameExplicit)
	//*   6    8:aload_3         
	//*   7    9:getfield        #109 <Field boolean POJOPropertyBuilder$Linked.isNameExplicit>
	//*   8   12:ifeq            52
				if(linked1.name == null)
	//*   9   15:aload_3         
	//*  10   16:getfield        #106 <Field PropertyName POJOPropertyBuilder$Linked.name>
	//*  11   19:ifnonnull       27
				{
					linked = ((Linked) (set));
	//   12   22:aload_2         
	//   13   23:astore_1        
				} else
	//*  14   24:goto            52
				{
					linked = ((Linked) (set));
	//   15   27:aload_2         
	//   16   28:astore_1        
					if(set == null)
	//*  17   29:aload_2         
	//*  18   30:ifnonnull       41
						linked = ((Linked) (new HashSet()));
	//   19   33:new             #195 <Class HashSet>
	//   20   36:dup             
	//   21   37:invokespecial   #196 <Method void HashSet()>
	//   22   40:astore_1        
					((Set) (linked)).add(((Object) (linked1.name)));
	//   23   41:aload_1         
	//   24   42:aload_3         
	//   25   43:getfield        #106 <Field PropertyName POJOPropertyBuilder$Linked.name>
	//   26   46:invokeinterface #202 <Method boolean Set.add(Object)>
	//   27   51:pop             
				}
			linked1 = linked1.next;
	//   28   52:aload_3         
	//   29   53:getfield        #112 <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//   30   56:astore_3        
			set = ((Set) (linked));
	//   31   57:aload_1         
	//   32   58:astore_2        
		}

	//*  33   59:goto            2
		return set;
	//   34   62:aload_2         
	//   35   63:areturn         
	}

	private AnnotationMap _getAllAnnotations(Linked linked)
	{
		AnnotationMap annotationmap1 = ((AnnotatedMember)linked.value).getAllAnnotations();
	//    0    0:aload_1         
	//    1    1:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//    2    4:checkcast       #136 <Class AnnotatedMember>
	//    3    7:invokevirtual   #209 <Method AnnotationMap AnnotatedMember.getAllAnnotations()>
	//    4   10:astore_3        
		AnnotationMap annotationmap = annotationmap1;
	//    5   11:aload_3         
	//    6   12:astore_2        
		if(linked.next != null)
	//*   7   13:aload_1         
	//*   8   14:getfield        #112 <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//*   9   17:ifnull          33
			annotationmap = AnnotationMap.merge(annotationmap1, _getAllAnnotations(linked.next));
	//   10   20:aload_3         
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:getfield        #112 <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//   14   26:invokespecial   #211 <Method AnnotationMap _getAllAnnotations(POJOPropertyBuilder$Linked)>
	//   15   29:invokestatic    #217 <Method AnnotationMap AnnotationMap.merge(AnnotationMap, AnnotationMap)>
	//   16   32:astore_2        
		return annotationmap;
	//   17   33:aload_2         
	//   18   34:areturn         
	}

	private transient AnnotationMap _mergeAnnotations(int i, Linked alinked[])
	{
		AnnotationMap annotationmap = _getAllAnnotations(alinked[i]);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:iload_1         
	//    3    3:aaload          
	//    4    4:invokespecial   #211 <Method AnnotationMap _getAllAnnotations(POJOPropertyBuilder$Linked)>
	//    5    7:astore          4
		do
		{
			int j = i + 1;
	//    6    9:iload_1         
	//    7   10:iconst_1        
	//    8   11:iadd            
	//    9   12:istore_3        
			if(j < alinked.length)
	//*  10   13:iload_3         
	//*  11   14:aload_2         
	//*  12   15:arraylength     
	//*  13   16:icmpge          39
			{
				i = j;
	//   14   19:iload_3         
	//   15   20:istore_1        
				if(alinked[j] != null)
	//*  16   21:aload_2         
	//*  17   22:iload_3         
	//*  18   23:aaload          
	//*  19   24:ifnull          9
					return AnnotationMap.merge(annotationmap, _mergeAnnotations(j, alinked));
	//   20   27:aload           4
	//   21   29:aload_0         
	//   22   30:iload_3         
	//   23   31:aload_2         
	//   24   32:invokespecial   #222 <Method AnnotationMap _mergeAnnotations(int, POJOPropertyBuilder$Linked[])>
	//   25   35:invokestatic    #217 <Method AnnotationMap AnnotationMap.merge(AnnotationMap, AnnotationMap)>
	//   26   38:areturn         
			} else
			{
				return annotationmap;
	//   27   39:aload           4
	//   28   41:areturn         
			}
		} while(true);
	}

	private Linked _removeIgnored(Linked linked)
	{
		if(linked == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return linked;
	//    2    4:aload_1         
	//    3    5:areturn         
		else
			return linked.withoutIgnored();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #228 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.withoutIgnored()>
	//    6   10:areturn         
	}

	private Linked _removeNonVisible(Linked linked)
	{
		if(linked == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return linked;
	//    2    4:aload_1         
	//    3    5:areturn         
		else
			return linked.withoutNonVisible();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #233 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.withoutNonVisible()>
	//    6   10:areturn         
	}

	private Linked _trimByVisibility(Linked linked)
	{
		if(linked == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return linked;
	//    2    4:aload_1         
	//    3    5:areturn         
		else
			return linked.trimByVisibility();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #237 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.trimByVisibility()>
	//    6   10:areturn         
	}

	private static Linked merge(Linked linked, Linked linked1)
	{
		if(linked == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return linked1;
	//    2    4:aload_1         
	//    3    5:areturn         
		if(linked1 == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
			return linked;
	//    6   10:aload_0         
	//    7   11:areturn         
		else
			return linked.append(linked1);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokevirtual   #240 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.append(POJOPropertyBuilder$Linked)>
	//   11   17:areturn         
	}

	protected String _findDefaultValue()
	{
		return (String)fromMemberAnnotations(new WithMember() {

			public volatile Object withMember(AnnotatedMember annotatedmember)
			{
				return ((Object) (withMember(annotatedmember)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #27  <Method String withMember(AnnotatedMember)>
			//    3    5:areturn         
			}

			public String withMember(AnnotatedMember annotatedmember)
			{
				return _annotationIntrospector.findPropertyDefaultValue(((Annotated) (annotatedmember)));
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field POJOPropertyBuilder this$0>
			//    2    4:getfield        #31  <Field AnnotationIntrospector POJOPropertyBuilder._annotationIntrospector>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #37  <Method String AnnotationIntrospector.findPropertyDefaultValue(Annotated)>
			//    5   11:areturn         
			}

			final POJOPropertyBuilder this$0;

			
			{
				this$0 = POJOPropertyBuilder.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field POJOPropertyBuilder this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #23  <Class POJOPropertyBuilder$7>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #245 <Method void POJOPropertyBuilder$7(POJOPropertyBuilder)>
	//    5    9:invokevirtual   #249 <Method Object fromMemberAnnotations(POJOPropertyBuilder$WithMember)>
	//    6   12:checkcast       #251 <Class String>
	//    7   15:areturn         
	}

	protected String _findDescription()
	{
		return (String)fromMemberAnnotations(new WithMember() {

			public volatile Object withMember(AnnotatedMember annotatedmember)
			{
				return ((Object) (withMember(annotatedmember)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #27  <Method String withMember(AnnotatedMember)>
			//    3    5:areturn         
			}

			public String withMember(AnnotatedMember annotatedmember)
			{
				return _annotationIntrospector.findPropertyDescription(((Annotated) (annotatedmember)));
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field POJOPropertyBuilder this$0>
			//    2    4:getfield        #31  <Field AnnotationIntrospector POJOPropertyBuilder._annotationIntrospector>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #37  <Method String AnnotationIntrospector.findPropertyDescription(Annotated)>
			//    5   11:areturn         
			}

			final POJOPropertyBuilder this$0;

			
			{
				this$0 = POJOPropertyBuilder.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field POJOPropertyBuilder this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #19  <Class POJOPropertyBuilder$5>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #253 <Method void POJOPropertyBuilder$5(POJOPropertyBuilder)>
	//    5    9:invokevirtual   #249 <Method Object fromMemberAnnotations(POJOPropertyBuilder$WithMember)>
	//    6   12:checkcast       #251 <Class String>
	//    7   15:areturn         
	}

	protected Integer _findIndex()
	{
		return (Integer)fromMemberAnnotations(new WithMember() {

			public Integer withMember(AnnotatedMember annotatedmember)
			{
				return _annotationIntrospector.findPropertyIndex(((Annotated) (annotatedmember)));
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field POJOPropertyBuilder this$0>
			//    2    4:getfield        #28  <Field AnnotationIntrospector POJOPropertyBuilder._annotationIntrospector>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #34  <Method Integer AnnotationIntrospector.findPropertyIndex(Annotated)>
			//    5   11:areturn         
			}

			public volatile Object withMember(AnnotatedMember annotatedmember)
			{
				return ((Object) (withMember(annotatedmember)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #37  <Method Integer withMember(AnnotatedMember)>
			//    3    5:areturn         
			}

			final POJOPropertyBuilder this$0;

			
			{
				this$0 = POJOPropertyBuilder.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field POJOPropertyBuilder this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #21  <Class POJOPropertyBuilder$6>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #256 <Method void POJOPropertyBuilder$6(POJOPropertyBuilder)>
	//    5    9:invokevirtual   #249 <Method Object fromMemberAnnotations(POJOPropertyBuilder$WithMember)>
	//    6   12:checkcast       #258 <Class Integer>
	//    7   15:areturn         
	}

	protected Boolean _findRequired()
	{
		return (Boolean)fromMemberAnnotations(new WithMember() {

			public Boolean withMember(AnnotatedMember annotatedmember)
			{
				return _annotationIntrospector.hasRequiredMarker(annotatedmember);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field POJOPropertyBuilder this$0>
			//    2    4:getfield        #28  <Field AnnotationIntrospector POJOPropertyBuilder._annotationIntrospector>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #33  <Method Boolean AnnotationIntrospector.hasRequiredMarker(AnnotatedMember)>
			//    5   11:areturn         
			}

			public volatile Object withMember(AnnotatedMember annotatedmember)
			{
				return ((Object) (withMember(annotatedmember)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #36  <Method Boolean withMember(AnnotatedMember)>
			//    3    5:areturn         
			}

			final POJOPropertyBuilder this$0;

			
			{
				this$0 = POJOPropertyBuilder.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field POJOPropertyBuilder this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #17  <Class POJOPropertyBuilder$4>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #261 <Method void POJOPropertyBuilder$4(POJOPropertyBuilder)>
	//    5    9:invokevirtual   #249 <Method Object fromMemberAnnotations(POJOPropertyBuilder$WithMember)>
	//    6   12:checkcast       #263 <Class Boolean>
	//    7   15:areturn         
	}

	protected PropertyMetadata _getSetterInfo(PropertyMetadata propertymetadata)
	{
		boolean flag;
		Object obj;
		PropertyMetadata propertymetadata1;
		AnnotatedMember annotatedmember;
label0:
		{
			Object obj1 = ((Object) (getPrimaryMember()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #269 <Method AnnotatedMember getPrimaryMember()>
	//    2    4:astore          6
			annotatedmember = getAccessor();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #272 <Method AnnotatedMember getAccessor()>
	//    5   10:astore          12
			obj = null;
	//    6   12:aconst_null     
	//    7   13:astore          5
			com.fasterxml.jackson.annotation.Nulls nulls = null;
	//    8   15:aconst_null     
	//    9   16:astore          7
			flag = true;
	//   10   18:iconst_1        
	//   11   19:istore_2        
			boolean flag2 = true;
	//   12   20:iconst_1        
	//   13   21:istore          4
			boolean flag1 = true;
	//   14   23:iconst_1        
	//   15   24:istore_3        
			if(obj1 != null)
	//*  16   25:aload           6
	//*  17   27:ifnull          352
			{
				obj = ((Object) (_annotationIntrospector));
	//   18   30:aload_0         
	//   19   31:getfield        #85  <Field AnnotationIntrospector _annotationIntrospector>
	//   20   34:astore          5
				PropertyMetadata propertymetadata2;
				if(obj != null)
	//*  21   36:aload           5
	//*  22   38:ifnull          138
				{
					flag = flag1;
	//   23   41:iload_3         
	//   24   42:istore_2        
					propertymetadata2 = propertymetadata;
	//   25   43:aload_1         
	//   26   44:astore          9
					if(annotatedmember != null)
	//*  27   46:aload           12
	//*  28   48:ifnull          99
					{
						obj = ((Object) (((AnnotationIntrospector) (obj)).findMergeInfo(((Annotated) (obj1)))));
	//   29   51:aload           5
	//   30   53:aload           6
	//   31   55:invokevirtual   #278 <Method Boolean AnnotationIntrospector.findMergeInfo(Annotated)>
	//   32   58:astore          5
						flag = flag1;
	//   33   60:iload_3         
	//   34   61:istore_2        
						propertymetadata2 = propertymetadata;
	//   35   62:aload_1         
	//   36   63:astore          9
						if(obj != null)
	//*  37   65:aload           5
	//*  38   67:ifnull          99
							if(((Boolean) (obj)).booleanValue())
	//*  39   70:aload           5
	//*  40   72:invokevirtual   #281 <Method boolean Boolean.booleanValue()>
	//*  41   75:ifeq            94
							{
								propertymetadata2 = propertymetadata.withMergeInfo(com.fasterxml.jackson.databind.PropertyMetadata.MergeInfo.createForPropertyOverride(annotatedmember));
	//   42   78:aload_1         
	//   43   79:aload           12
	//   44   81:invokestatic    #287 <Method com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo.createForPropertyOverride(AnnotatedMember)>
	//   45   84:invokevirtual   #293 <Method PropertyMetadata PropertyMetadata.withMergeInfo(com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo)>
	//   46   87:astore          9
								flag = false;
	//   47   89:iconst_0        
	//   48   90:istore_2        
							} else
	//*  49   91:goto            99
							{
								flag = false;
	//   50   94:iconst_0        
	//   51   95:istore_2        
								propertymetadata2 = propertymetadata;
	//   52   96:aload_1         
	//   53   97:astore          9
							}
					}
					propertymetadata = ((PropertyMetadata) (_annotationIntrospector.findSetterInfo(((Annotated) (obj1)))));
	//   54   99:aload_0         
	//   55  100:getfield        #85  <Field AnnotationIntrospector _annotationIntrospector>
	//   56  103:aload           6
	//   57  105:invokevirtual   #297 <Method com.fasterxml.jackson.annotation.JsonSetter$Value AnnotationIntrospector.findSetterInfo(Annotated)>
	//   58  108:astore_1        
					if(propertymetadata != null)
	//*  59  109:aload_1         
	//*  60  110:ifnull          130
					{
						nulls = ((com.fasterxml.jackson.annotation.JsonSetter.Value) (propertymetadata)).nonDefaultValueNulls();
	//   61  113:aload_1         
	//   62  114:invokevirtual   #303 <Method com.fasterxml.jackson.annotation.Nulls com.fasterxml.jackson.annotation.JsonSetter$Value.nonDefaultValueNulls()>
	//   63  117:astore          7
						obj1 = ((Object) (((com.fasterxml.jackson.annotation.JsonSetter.Value) (propertymetadata)).nonDefaultContentNulls()));
	//   64  119:aload_1         
	//   65  120:invokevirtual   #306 <Method com.fasterxml.jackson.annotation.Nulls com.fasterxml.jackson.annotation.JsonSetter$Value.nonDefaultContentNulls()>
	//   66  123:astore          6
						flag1 = flag;
	//   67  125:iload_2         
	//   68  126:istore_3        
					} else
	//*  69  127:goto            146
					{
						obj1 = null;
	//   70  130:aconst_null     
	//   71  131:astore          6
						flag1 = flag;
	//   72  133:iload_2         
	//   73  134:istore_3        
					}
				} else
	//*  74  135:goto            146
				{
					obj1 = null;
	//   75  138:aconst_null     
	//   76  139:astore          6
					propertymetadata2 = propertymetadata;
	//   77  141:aload_1         
	//   78  142:astore          9
					flag1 = flag;
	//   79  144:iload_2         
	//   80  145:istore_3        
				}
				if(!flag1 && nulls != null)
	//*  81  146:iload_3         
	//*  82  147:ifne            173
	//*  83  150:aload           7
	//*  84  152:ifnull          173
				{
					propertymetadata = ((PropertyMetadata) (obj1));
	//   85  155:aload           6
	//   86  157:astore_1        
					obj = ((Object) (nulls));
	//   87  158:aload           7
	//   88  160:astore          5
					flag = flag1;
	//   89  162:iload_3         
	//   90  163:istore_2        
					propertymetadata1 = propertymetadata2;
	//   91  164:aload           9
	//   92  166:astore          8
					if(obj1 != null)
						break label0;
	//   93  168:aload           6
	//   94  170:ifnonnull       364
				}
				propertymetadata = ((PropertyMetadata) (getRawPrimaryType()));
	//   95  173:aload_0         
	//   96  174:invokevirtual   #310 <Method Class getRawPrimaryType()>
	//   97  177:astore_1        
				ConfigOverride configoverride = _config.getConfigOverride(((Class) (propertymetadata)));
	//   98  178:aload_0         
	//   99  179:getfield        #83  <Field MapperConfig _config>
	//  100  182:aload_1         
	//  101  183:invokevirtual   #316 <Method ConfigOverride MapperConfig.getConfigOverride(Class)>
	//  102  186:astore          13
				obj = ((Object) (configoverride.getSetterInfo()));
	//  103  188:aload           13
	//  104  190:invokevirtual   #322 <Method com.fasterxml.jackson.annotation.JsonSetter$Value ConfigOverride.getSetterInfo()>
	//  105  193:astore          5
				com.fasterxml.jackson.annotation.Nulls nulls1 = ((com.fasterxml.jackson.annotation.Nulls) (obj1));
	//  106  195:aload           6
	//  107  197:astore          11
				Object obj6 = ((Object) (nulls));
	//  108  199:aload           7
	//  109  201:astore          10
				if(obj != null)
	//* 110  203:aload           5
	//* 111  205:ifnull          244
				{
					propertymetadata = ((PropertyMetadata) (nulls));
	//  112  208:aload           7
	//  113  210:astore_1        
					if(nulls == null)
	//* 114  211:aload           7
	//* 115  213:ifnonnull       222
						propertymetadata = ((PropertyMetadata) (((com.fasterxml.jackson.annotation.JsonSetter.Value) (obj)).nonDefaultValueNulls()));
	//  116  216:aload           5
	//  117  218:invokevirtual   #303 <Method com.fasterxml.jackson.annotation.Nulls com.fasterxml.jackson.annotation.JsonSetter$Value.nonDefaultValueNulls()>
	//  118  221:astore_1        
					nulls1 = ((com.fasterxml.jackson.annotation.Nulls) (obj1));
	//  119  222:aload           6
	//  120  224:astore          11
					obj6 = ((Object) (propertymetadata));
	//  121  226:aload_1         
	//  122  227:astore          10
					if(obj1 == null)
	//* 123  229:aload           6
	//* 124  231:ifnonnull       244
					{
						nulls1 = ((com.fasterxml.jackson.annotation.JsonSetter.Value) (obj)).nonDefaultContentNulls();
	//  125  234:aload           5
	//  126  236:invokevirtual   #306 <Method com.fasterxml.jackson.annotation.Nulls com.fasterxml.jackson.annotation.JsonSetter$Value.nonDefaultContentNulls()>
	//  127  239:astore          11
						obj6 = ((Object) (propertymetadata));
	//  128  241:aload_1         
	//  129  242:astore          10
					}
				}
				propertymetadata = ((PropertyMetadata) (nulls1));
	//  130  244:aload           11
	//  131  246:astore_1        
				obj = obj6;
	//  132  247:aload           10
	//  133  249:astore          5
				flag = flag1;
	//  134  251:iload_3         
	//  135  252:istore_2        
				propertymetadata1 = propertymetadata2;
	//  136  253:aload           9
	//  137  255:astore          8
				if(flag1)
	//* 138  257:iload_3         
	//* 139  258:ifeq            364
				{
					propertymetadata = ((PropertyMetadata) (nulls1));
	//  140  261:aload           11
	//  141  263:astore_1        
					obj = obj6;
	//  142  264:aload           10
	//  143  266:astore          5
					flag = flag1;
	//  144  268:iload_3         
	//  145  269:istore_2        
					propertymetadata1 = propertymetadata2;
	//  146  270:aload           9
	//  147  272:astore          8
					if(annotatedmember != null)
	//* 148  274:aload           12
	//* 149  276:ifnull          364
					{
						Boolean boolean1 = configoverride.getMergeable();
	//  150  279:aload           13
	//  151  281:invokevirtual   #325 <Method Boolean ConfigOverride.getMergeable()>
	//  152  284:astore          6
						propertymetadata = ((PropertyMetadata) (nulls1));
	//  153  286:aload           11
	//  154  288:astore_1        
						obj = obj6;
	//  155  289:aload           10
	//  156  291:astore          5
						flag = flag1;
	//  157  293:iload_3         
	//  158  294:istore_2        
						propertymetadata1 = propertymetadata2;
	//  159  295:aload           9
	//  160  297:astore          8
						if(boolean1 != null)
	//* 161  299:aload           6
	//* 162  301:ifnull          364
							if(boolean1.booleanValue())
	//* 163  304:aload           6
	//* 164  306:invokevirtual   #281 <Method boolean Boolean.booleanValue()>
	//* 165  309:ifeq            336
							{
								propertymetadata1 = propertymetadata2.withMergeInfo(com.fasterxml.jackson.databind.PropertyMetadata.MergeInfo.createForTypeOverride(annotatedmember));
	//  166  312:aload           9
	//  167  314:aload           12
	//  168  316:invokestatic    #328 <Method com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo.createForTypeOverride(AnnotatedMember)>
	//  169  319:invokevirtual   #293 <Method PropertyMetadata PropertyMetadata.withMergeInfo(com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo)>
	//  170  322:astore          8
								flag = false;
	//  171  324:iconst_0        
	//  172  325:istore_2        
								propertymetadata = ((PropertyMetadata) (nulls1));
	//  173  326:aload           11
	//  174  328:astore_1        
								obj = obj6;
	//  175  329:aload           10
	//  176  331:astore          5
							} else
	//* 177  333:goto            364
							{
								flag = false;
	//  178  336:iconst_0        
	//  179  337:istore_2        
								propertymetadata = ((PropertyMetadata) (nulls1));
	//  180  338:aload           11
	//  181  340:astore_1        
								obj = obj6;
	//  182  341:aload           10
	//  183  343:astore          5
								propertymetadata1 = propertymetadata2;
	//  184  345:aload           9
	//  185  347:astore          8
							}
					}
				}
			} else
	//* 186  349:goto            364
			{
				Object obj2 = null;
	//  187  352:aconst_null     
	//  188  353:astore          6
				propertymetadata1 = propertymetadata;
	//  189  355:aload_1         
	//  190  356:astore          8
				flag = flag2;
	//  191  358:iload           4
	//  192  360:istore_2        
				propertymetadata = ((PropertyMetadata) (obj2));
	//  193  361:aload           6
	//  194  363:astore_1        
			}
		}
		Object obj4;
		Object obj5;
		Object obj7;
label1:
		{
			if(!flag && obj != null)
	//* 195  364:iload_2         
	//* 196  365:ifne            388
	//* 197  368:aload           5
	//* 198  370:ifnull          388
			{
				obj5 = ((Object) (propertymetadata));
	//  199  373:aload_1         
	//  200  374:astore          9
				obj7 = obj;
	//  201  376:aload           5
	//  202  378:astore          10
				obj4 = ((Object) (propertymetadata1));
	//  203  380:aload           8
	//  204  382:astore          7
				if(propertymetadata != null)
					break label1;
	//  205  384:aload_1         
	//  206  385:ifnonnull       510
			}
			obj4 = ((Object) (_config.getDefaultSetterInfo()));
	//  207  388:aload_0         
	//  208  389:getfield        #83  <Field MapperConfig _config>
	//  209  392:invokevirtual   #331 <Method com.fasterxml.jackson.annotation.JsonSetter$Value MapperConfig.getDefaultSetterInfo()>
	//  210  395:astore          7
			Object obj3 = obj;
	//  211  397:aload           5
	//  212  399:astore          6
			if(obj == null)
	//* 213  401:aload           5
	//* 214  403:ifnonnull       413
				obj3 = ((Object) (((com.fasterxml.jackson.annotation.JsonSetter.Value) (obj4)).nonDefaultValueNulls()));
	//  215  406:aload           7
	//  216  408:invokevirtual   #303 <Method com.fasterxml.jackson.annotation.Nulls com.fasterxml.jackson.annotation.JsonSetter$Value.nonDefaultValueNulls()>
	//  217  411:astore          6
			obj = ((Object) (propertymetadata));
	//  218  413:aload_1         
	//  219  414:astore          5
			if(propertymetadata == null)
	//* 220  416:aload_1         
	//* 221  417:ifnonnull       427
				obj = ((Object) (((com.fasterxml.jackson.annotation.JsonSetter.Value) (obj4)).nonDefaultContentNulls()));
	//  222  420:aload           7
	//  223  422:invokevirtual   #306 <Method com.fasterxml.jackson.annotation.Nulls com.fasterxml.jackson.annotation.JsonSetter$Value.nonDefaultContentNulls()>
	//  224  425:astore          5
			obj5 = obj;
	//  225  427:aload           5
	//  226  429:astore          9
			obj7 = obj3;
	//  227  431:aload           6
	//  228  433:astore          10
			obj4 = ((Object) (propertymetadata1));
	//  229  435:aload           8
	//  230  437:astore          7
			if(flag)
	//* 231  439:iload_2         
	//* 232  440:ifeq            510
			{
				propertymetadata = ((PropertyMetadata) (_config.getDefaultMergeable()));
	//  233  443:aload_0         
	//  234  444:getfield        #83  <Field MapperConfig _config>
	//  235  447:invokevirtual   #334 <Method Boolean MapperConfig.getDefaultMergeable()>
	//  236  450:astore_1        
				obj5 = obj;
	//  237  451:aload           5
	//  238  453:astore          9
				obj7 = obj3;
	//  239  455:aload           6
	//  240  457:astore          10
				obj4 = ((Object) (propertymetadata1));
	//  241  459:aload           8
	//  242  461:astore          7
				if(Boolean.TRUE.equals(((Object) (propertymetadata))))
	//* 243  463:getstatic       #338 <Field Boolean Boolean.TRUE>
	//* 244  466:aload_1         
	//* 245  467:invokevirtual   #341 <Method boolean Boolean.equals(Object)>
	//* 246  470:ifeq            510
				{
					obj5 = obj;
	//  247  473:aload           5
	//  248  475:astore          9
					obj7 = obj3;
	//  249  477:aload           6
	//  250  479:astore          10
					obj4 = ((Object) (propertymetadata1));
	//  251  481:aload           8
	//  252  483:astore          7
					if(annotatedmember != null)
	//* 253  485:aload           12
	//* 254  487:ifnull          510
					{
						obj4 = ((Object) (propertymetadata1.withMergeInfo(com.fasterxml.jackson.databind.PropertyMetadata.MergeInfo.createForDefaults(annotatedmember))));
	//  255  490:aload           8
	//  256  492:aload           12
	//  257  494:invokestatic    #344 <Method com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo.createForDefaults(AnnotatedMember)>
	//  258  497:invokevirtual   #293 <Method PropertyMetadata PropertyMetadata.withMergeInfo(com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo)>
	//  259  500:astore          7
						obj7 = obj3;
	//  260  502:aload           6
	//  261  504:astore          10
						obj5 = obj;
	//  262  506:aload           5
	//  263  508:astore          9
					}
				}
			}
		}
label2:
		{
			if(obj7 == null)
	//* 264  510:aload           10
	//* 265  512:ifnonnull       523
			{
				propertymetadata = ((PropertyMetadata) (obj4));
	//  266  515:aload           7
	//  267  517:astore_1        
				if(obj5 == null)
					break label2;
	//  268  518:aload           9
	//  269  520:ifnull          533
			}
			propertymetadata = ((PropertyMetadata) (obj4)).withNulls(((com.fasterxml.jackson.annotation.Nulls) (obj7)), ((com.fasterxml.jackson.annotation.Nulls) (obj5)));
	//  270  523:aload           7
	//  271  525:aload           10
	//  272  527:aload           9
	//  273  529:invokevirtual   #348 <Method PropertyMetadata PropertyMetadata.withNulls(com.fasterxml.jackson.annotation.Nulls, com.fasterxml.jackson.annotation.Nulls)>
	//  274  532:astore_1        
		}
		return propertymetadata;
	//  275  533:aload_1         
	//  276  534:areturn         
	}

	protected int _getterPriority(AnnotatedMethod annotatedmethod)
	{
		annotatedmethod = ((AnnotatedMethod) (annotatedmethod.getName()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #355 <Method String AnnotatedMethod.getName()>
	//    2    4:astore_1        
		if(((String) (annotatedmethod)).startsWith("get") && ((String) (annotatedmethod)).length() > 3)
	//*   3    5:aload_1         
	//*   4    6:ldc2            #356 <String "get">
	//*   5    9:invokevirtual   #360 <Method boolean String.startsWith(String)>
	//*   6   12:ifeq            25
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #364 <Method int String.length()>
	//*   9   19:iconst_3        
	//*  10   20:icmple          25
			return 1;
	//   11   23:iconst_1        
	//   12   24:ireturn         
		return !((String) (annotatedmethod)).startsWith("is") || ((String) (annotatedmethod)).length() <= 2 ? 3 : 2;
	//   13   25:aload_1         
	//   14   26:ldc2            #366 <String "is">
	//   15   29:invokevirtual   #360 <Method boolean String.startsWith(String)>
	//   16   32:ifeq            45
	//   17   35:aload_1         
	//   18   36:invokevirtual   #364 <Method int String.length()>
	//   19   39:iconst_2        
	//   20   40:icmple          45
	//   21   43:iconst_2        
	//   22   44:ireturn         
	//   23   45:iconst_3        
	//   24   46:ireturn         
	}

	protected int _setterPriority(AnnotatedMethod annotatedmethod)
	{
		annotatedmethod = ((AnnotatedMethod) (annotatedmethod.getName()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #355 <Method String AnnotatedMethod.getName()>
	//    2    4:astore_1        
		return !((String) (annotatedmethod)).startsWith("set") || ((String) (annotatedmethod)).length() <= 3 ? 2 : 1;
	//    3    5:aload_1         
	//    4    6:ldc2            #369 <String "set">
	//    5    9:invokevirtual   #360 <Method boolean String.startsWith(String)>
	//    6   12:ifeq            25
	//    7   15:aload_1         
	//    8   16:invokevirtual   #364 <Method int String.length()>
	//    9   19:iconst_3        
	//   10   20:icmple          25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_2        
	//   14   26:ireturn         
	}

	public void addAll(POJOPropertyBuilder pojopropertybuilder)
	{
		_fields = merge(_fields, pojopropertybuilder._fields);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//    3    5:aload_1         
	//    4    6:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//    5    9:invokestatic    #372 <Method POJOPropertyBuilder$Linked merge(POJOPropertyBuilder$Linked, POJOPropertyBuilder$Linked)>
	//    6   12:putfield        #95  <Field POJOPropertyBuilder$Linked _fields>
		_ctorParameters = merge(_ctorParameters, pojopropertybuilder._ctorParameters);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   10   20:aload_1         
	//   11   21:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   12   24:invokestatic    #372 <Method POJOPropertyBuilder$Linked merge(POJOPropertyBuilder$Linked, POJOPropertyBuilder$Linked)>
	//   13   27:putfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
		_getters = merge(_getters, pojopropertybuilder._getters);
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//   17   35:aload_1         
	//   18   36:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//   19   39:invokestatic    #372 <Method POJOPropertyBuilder$Linked merge(POJOPropertyBuilder$Linked, POJOPropertyBuilder$Linked)>
	//   20   42:putfield        #99  <Field POJOPropertyBuilder$Linked _getters>
		_setters = merge(_setters, pojopropertybuilder._setters);
	//   21   45:aload_0         
	//   22   46:aload_0         
	//   23   47:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//   24   50:aload_1         
	//   25   51:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//   26   54:invokestatic    #372 <Method POJOPropertyBuilder$Linked merge(POJOPropertyBuilder$Linked, POJOPropertyBuilder$Linked)>
	//   27   57:putfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//   28   60:return          
	}

	public void addCtor(AnnotatedParameter annotatedparameter, PropertyName propertyname, boolean flag, boolean flag1, boolean flag2)
	{
		_ctorParameters = new Linked(((Object) (annotatedparameter)), _ctorParameters, propertyname, flag, flag1, flag2);
	//    0    0:aload_0         
	//    1    1:new             #29  <Class POJOPropertyBuilder$Linked>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//    6   10:aload_2         
	//    7   11:iload_3         
	//    8   12:iload           4
	//    9   14:iload           5
	//   10   16:invokespecial   #377 <Method void POJOPropertyBuilder$Linked(Object, POJOPropertyBuilder$Linked, PropertyName, boolean, boolean, boolean)>
	//   11   19:putfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   12   22:return          
	}

	public void addField(AnnotatedField annotatedfield, PropertyName propertyname, boolean flag, boolean flag1, boolean flag2)
	{
		_fields = new Linked(((Object) (annotatedfield)), _fields, propertyname, flag, flag1, flag2);
	//    0    0:aload_0         
	//    1    1:new             #29  <Class POJOPropertyBuilder$Linked>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//    6   10:aload_2         
	//    7   11:iload_3         
	//    8   12:iload           4
	//    9   14:iload           5
	//   10   16:invokespecial   #377 <Method void POJOPropertyBuilder$Linked(Object, POJOPropertyBuilder$Linked, PropertyName, boolean, boolean, boolean)>
	//   11   19:putfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//   12   22:return          
	}

	public void addGetter(AnnotatedMethod annotatedmethod, PropertyName propertyname, boolean flag, boolean flag1, boolean flag2)
	{
		_getters = new Linked(((Object) (annotatedmethod)), _getters, propertyname, flag, flag1, flag2);
	//    0    0:aload_0         
	//    1    1:new             #29  <Class POJOPropertyBuilder$Linked>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//    6   10:aload_2         
	//    7   11:iload_3         
	//    8   12:iload           4
	//    9   14:iload           5
	//   10   16:invokespecial   #377 <Method void POJOPropertyBuilder$Linked(Object, POJOPropertyBuilder$Linked, PropertyName, boolean, boolean, boolean)>
	//   11   19:putfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//   12   22:return          
	}

	public void addSetter(AnnotatedMethod annotatedmethod, PropertyName propertyname, boolean flag, boolean flag1, boolean flag2)
	{
		_setters = new Linked(((Object) (annotatedmethod)), _setters, propertyname, flag, flag1, flag2);
	//    0    0:aload_0         
	//    1    1:new             #29  <Class POJOPropertyBuilder$Linked>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//    6   10:aload_2         
	//    7   11:iload_3         
	//    8   12:iload           4
	//    9   14:iload           5
	//   10   16:invokespecial   #377 <Method void POJOPropertyBuilder$Linked(Object, POJOPropertyBuilder$Linked, PropertyName, boolean, boolean, boolean)>
	//   11   19:putfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//   12   22:return          
	}

	public boolean anyIgnorals()
	{
		return _anyIgnorals(_fields) || _anyIgnorals(_getters) || _anyIgnorals(_setters) || _anyIgnorals(_ctorParameters);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//    3    5:invokespecial   #385 <Method boolean _anyIgnorals(POJOPropertyBuilder$Linked)>
	//    4    8:ifne            49
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//    8   16:invokespecial   #385 <Method boolean _anyIgnorals(POJOPropertyBuilder$Linked)>
	//    9   19:ifne            49
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//   13   27:invokespecial   #385 <Method boolean _anyIgnorals(POJOPropertyBuilder$Linked)>
	//   14   30:ifne            49
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   18   38:invokespecial   #385 <Method boolean _anyIgnorals(POJOPropertyBuilder$Linked)>
	//   19   41:ifeq            47
	//   20   44:goto            49
	//   21   47:iconst_0        
	//   22   48:ireturn         
	//   23   49:iconst_1        
	//   24   50:ireturn         
	}

	public boolean anyVisible()
	{
		return _anyVisible(_fields) || _anyVisible(_getters) || _anyVisible(_setters) || _anyVisible(_ctorParameters);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//    3    5:invokespecial   #388 <Method boolean _anyVisible(POJOPropertyBuilder$Linked)>
	//    4    8:ifne            49
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//    8   16:invokespecial   #388 <Method boolean _anyVisible(POJOPropertyBuilder$Linked)>
	//    9   19:ifne            49
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//   13   27:invokespecial   #388 <Method boolean _anyVisible(POJOPropertyBuilder$Linked)>
	//   14   30:ifne            49
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   18   38:invokespecial   #388 <Method boolean _anyVisible(POJOPropertyBuilder$Linked)>
	//   19   41:ifeq            47
	//   20   44:goto            49
	//   21   47:iconst_0        
	//   22   48:ireturn         
	//   23   49:iconst_1        
	//   24   50:ireturn         
	}

	public int compareTo(POJOPropertyBuilder pojopropertybuilder)
	{
		if(_ctorParameters != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//*   2    4:ifnull          16
		{
			if(pojopropertybuilder._ctorParameters == null)
	//*   3    7:aload_1         
	//*   4    8:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//*   5   11:ifnonnull       25
				return -1;
	//    6   14:iconst_m1       
	//    7   15:ireturn         
		} else
		if(pojopropertybuilder._ctorParameters != null)
	//*   8   16:aload_1         
	//*   9   17:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//*  10   20:ifnull          25
			return 1;
	//   11   23:iconst_1        
	//   12   24:ireturn         
		return getName().compareTo(pojopropertybuilder.getName());
	//   13   25:aload_0         
	//   14   26:invokevirtual   #391 <Method String getName()>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #391 <Method String getName()>
	//   17   33:invokevirtual   #394 <Method int String.compareTo(String)>
	//   18   36:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((POJOPropertyBuilder)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class POJOPropertyBuilder>
	//    3    5:invokevirtual   #397 <Method int compareTo(POJOPropertyBuilder)>
	//    4    8:ireturn         
	}

	public boolean couldDeserialize()
	{
		return _ctorParameters != null || _setters != null || _fields != null;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//    2    4:ifnonnull       26
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//    5   11:ifnonnull       26
	//    6   14:aload_0         
	//    7   15:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//    8   18:ifnull          24
	//    9   21:goto            26
	//   10   24:iconst_0        
	//   11   25:ireturn         
	//   12   26:iconst_1        
	//   13   27:ireturn         
	}

	public boolean couldSerialize()
	{
		return _getters != null || _fields != null;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//    2    4:ifnonnull       19
	//    3    7:aload_0         
	//    4    8:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//    5   11:ifnull          17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public Collection explode(Collection collection)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #403 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #404 <Method void HashMap()>
	//    3    7:astore_2        
		_explode(collection, ((Map) (hashmap)), _fields);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_0         
	//    8   12:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//    9   15:invokespecial   #406 <Method void _explode(Collection, Map, POJOPropertyBuilder$Linked)>
		_explode(collection, ((Map) (hashmap)), _getters);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aload_0         
	//   14   22:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//   15   25:invokespecial   #406 <Method void _explode(Collection, Map, POJOPropertyBuilder$Linked)>
		_explode(collection, ((Map) (hashmap)), _setters);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:aload_2         
	//   19   31:aload_0         
	//   20   32:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//   21   35:invokespecial   #406 <Method void _explode(Collection, Map, POJOPropertyBuilder$Linked)>
		_explode(collection, ((Map) (hashmap)), _ctorParameters);
	//   22   38:aload_0         
	//   23   39:aload_1         
	//   24   40:aload_2         
	//   25   41:aload_0         
	//   26   42:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   27   45:invokespecial   #406 <Method void _explode(Collection, Map, POJOPropertyBuilder$Linked)>
		return hashmap.values();
	//   28   48:aload_2         
	//   29   49:invokevirtual   #410 <Method Collection HashMap.values()>
	//   30   52:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonProperty.Access findAccess()
	{
		return (com.fasterxml.jackson.annotation.JsonProperty.Access)fromMemberAnnotationsExcept(new WithMember() {

			public com.fasterxml.jackson.annotation.JsonProperty.Access withMember(AnnotatedMember annotatedmember)
			{
				return _annotationIntrospector.findPropertyAccess(((Annotated) (annotatedmember)));
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field POJOPropertyBuilder this$0>
			//    2    4:getfield        #28  <Field AnnotationIntrospector POJOPropertyBuilder._annotationIntrospector>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #34  <Method com.fasterxml.jackson.annotation.JsonProperty$Access AnnotationIntrospector.findPropertyAccess(Annotated)>
			//    5   11:areturn         
			}

			public volatile Object withMember(AnnotatedMember annotatedmember)
			{
				return ((Object) (withMember(annotatedmember)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #37  <Method com.fasterxml.jackson.annotation.JsonProperty$Access withMember(AnnotatedMember)>
			//    3    5:areturn         
			}

			final POJOPropertyBuilder this$0;

			
			{
				this$0 = POJOPropertyBuilder.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field POJOPropertyBuilder this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
, ((Object) (com.fasterxml.jackson.annotation.JsonProperty.Access.AUTO)));
	//    0    0:aload_0         
	//    1    1:new             #27  <Class POJOPropertyBuilder$9>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #414 <Method void POJOPropertyBuilder$9(POJOPropertyBuilder)>
	//    5    9:getstatic       #420 <Field com.fasterxml.jackson.annotation.JsonProperty$Access com.fasterxml.jackson.annotation.JsonProperty$Access.AUTO>
	//    6   12:invokevirtual   #424 <Method Object fromMemberAnnotationsExcept(POJOPropertyBuilder$WithMember, Object)>
	//    7   15:checkcast       #416 <Class com.fasterxml.jackson.annotation.JsonProperty$Access>
	//    8   18:areturn         
	}

	public Set findExplicitNames()
	{
		Set set = _findExplicitNames(_fields, ((Set) (null)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//    3    5:aconst_null     
	//    4    6:invokespecial   #428 <Method Set _findExplicitNames(POJOPropertyBuilder$Linked, Set)>
	//    5    9:astore_1        
		set = _findExplicitNames(_getters, set);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//    9   15:aload_1         
	//   10   16:invokespecial   #428 <Method Set _findExplicitNames(POJOPropertyBuilder$Linked, Set)>
	//   11   19:astore_1        
		set = _findExplicitNames(_setters, set);
	//   12   20:aload_0         
	//   13   21:aload_0         
	//   14   22:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//   15   25:aload_1         
	//   16   26:invokespecial   #428 <Method Set _findExplicitNames(POJOPropertyBuilder$Linked, Set)>
	//   17   29:astore_1        
		set = _findExplicitNames(_ctorParameters, set);
	//   18   30:aload_0         
	//   19   31:aload_0         
	//   20   32:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   21   35:aload_1         
	//   22   36:invokespecial   #428 <Method Set _findExplicitNames(POJOPropertyBuilder$Linked, Set)>
	//   23   39:astore_1        
		if(set == null)
	//*  24   40:aload_1         
	//*  25   41:ifnonnull       48
			return Collections.emptySet();
	//   26   44:invokestatic    #433 <Method Set Collections.emptySet()>
	//   27   47:areturn         
		else
			return set;
	//   28   48:aload_1         
	//   29   49:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Value findInclusion()
	{
		Object obj = ((Object) (getAccessor()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #272 <Method AnnotatedMember getAccessor()>
	//    2    4:astore_1        
		Object obj1 = ((Object) (_annotationIntrospector));
	//    3    5:aload_0         
	//    4    6:getfield        #85  <Field AnnotationIntrospector _annotationIntrospector>
	//    5    9:astore_2        
		if(obj1 == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       19
			obj = null;
	//    8   14:aconst_null     
	//    9   15:astore_1        
		else
	//*  10   16:goto            25
			obj = ((Object) (((AnnotationIntrospector) (obj1)).findPropertyInclusion(((Annotated) (obj)))));
	//   11   19:aload_2         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #440 <Method com.fasterxml.jackson.annotation.JsonInclude$Value AnnotationIntrospector.findPropertyInclusion(Annotated)>
	//   14   24:astore_1        
		obj1 = obj;
	//   15   25:aload_1         
	//   16   26:astore_2        
		if(obj == null)
	//*  17   27:aload_1         
	//*  18   28:ifnonnull       35
			obj1 = ((Object) (com.fasterxml.jackson.annotation.JsonInclude.Value.empty()));
	//   19   31:invokestatic    #445 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.empty()>
	//   20   34:astore_2        
		return ((com.fasterxml.jackson.annotation.JsonInclude.Value) (obj1));
	//   21   35:aload_2         
	//   22   36:areturn         
	}

	public ObjectIdInfo findObjectIdInfo()
	{
		return (ObjectIdInfo)fromMemberAnnotations(new WithMember() {

			public ObjectIdInfo withMember(AnnotatedMember annotatedmember)
			{
				ObjectIdInfo objectidinfo1 = _annotationIntrospector.findObjectIdInfo(((Annotated) (annotatedmember)));
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field POJOPropertyBuilder this$0>
			//    2    4:getfield        #28  <Field AnnotationIntrospector POJOPropertyBuilder._annotationIntrospector>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #33  <Method ObjectIdInfo AnnotationIntrospector.findObjectIdInfo(Annotated)>
			//    5   11:astore_3        
				ObjectIdInfo objectidinfo = objectidinfo1;
			//    6   12:aload_3         
			//    7   13:astore_2        
				if(objectidinfo1 != null)
			//*   8   14:aload_3         
			//*   9   15:ifnull          31
					objectidinfo = _annotationIntrospector.findObjectReferenceInfo(((Annotated) (annotatedmember)), objectidinfo1);
			//   10   18:aload_0         
			//   11   19:getfield        #18  <Field POJOPropertyBuilder this$0>
			//   12   22:getfield        #28  <Field AnnotationIntrospector POJOPropertyBuilder._annotationIntrospector>
			//   13   25:aload_1         
			//   14   26:aload_3         
			//   15   27:invokevirtual   #37  <Method ObjectIdInfo AnnotationIntrospector.findObjectReferenceInfo(Annotated, ObjectIdInfo)>
			//   16   30:astore_2        
				return objectidinfo;
			//   17   31:aload_2         
			//   18   32:areturn         
			}

			public volatile Object withMember(AnnotatedMember annotatedmember)
			{
				return ((Object) (withMember(annotatedmember)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #40  <Method ObjectIdInfo withMember(AnnotatedMember)>
			//    3    5:areturn         
			}

			final POJOPropertyBuilder this$0;

			
			{
				this$0 = POJOPropertyBuilder.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field POJOPropertyBuilder this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #25  <Class POJOPropertyBuilder$8>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #448 <Method void POJOPropertyBuilder$8(POJOPropertyBuilder)>
	//    5    9:invokevirtual   #249 <Method Object fromMemberAnnotations(POJOPropertyBuilder$WithMember)>
	//    6   12:checkcast       #450 <Class ObjectIdInfo>
	//    7   15:areturn         
	}

	public com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty findReferenceType()
	{
		com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceproperty = _referenceInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #454 <Field com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty _referenceInfo>
	//    2    4:astore_1        
		if(referenceproperty != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
			if(referenceproperty == NOT_REFEFERENCE_PROP)
	//*   5    9:aload_1         
	//*   6   10:getstatic       #71  <Field com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty NOT_REFEFERENCE_PROP>
	//*   7   13:if_acmpne       18
				return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
			else
				return referenceproperty;
	//   10   18:aload_1         
	//   11   19:areturn         
		com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceproperty1 = (com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty)fromMemberAnnotations(new WithMember() {

			public com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty withMember(AnnotatedMember annotatedmember)
			{
				return _annotationIntrospector.findReferenceType(annotatedmember);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field POJOPropertyBuilder this$0>
			//    2    4:getfield        #28  <Field AnnotationIntrospector POJOPropertyBuilder._annotationIntrospector>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #32  <Method com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty AnnotationIntrospector.findReferenceType(AnnotatedMember)>
			//    5   11:areturn         
			}

			public volatile Object withMember(AnnotatedMember annotatedmember)
			{
				return ((Object) (withMember(annotatedmember)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #35  <Method com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty withMember(AnnotatedMember)>
			//    3    5:areturn         
			}

			final POJOPropertyBuilder this$0;

			
			{
				this$0 = POJOPropertyBuilder.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field POJOPropertyBuilder this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   12   20:aload_0         
	//   13   21:new             #13  <Class POJOPropertyBuilder$2>
	//   14   24:dup             
	//   15   25:aload_0         
	//   16   26:invokespecial   #455 <Method void POJOPropertyBuilder$2(POJOPropertyBuilder)>
	//   17   29:invokevirtual   #249 <Method Object fromMemberAnnotations(POJOPropertyBuilder$WithMember)>
	//   18   32:checkcast       #65  <Class com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty>
	//   19   35:astore_2        
		if(referenceproperty1 == null)
	//*  20   36:aload_2         
	//*  21   37:ifnonnull       47
			referenceproperty = NOT_REFEFERENCE_PROP;
	//   22   40:getstatic       #71  <Field com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty NOT_REFEFERENCE_PROP>
	//   23   43:astore_1        
		else
	//*  24   44:goto            49
			referenceproperty = referenceproperty1;
	//   25   47:aload_2         
	//   26   48:astore_1        
		_referenceInfo = referenceproperty;
	//   27   49:aload_0         
	//   28   50:aload_1         
	//   29   51:putfield        #454 <Field com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty _referenceInfo>
		return referenceproperty1;
	//   30   54:aload_2         
	//   31   55:areturn         
	}

	public Class[] findViews()
	{
		return (Class[])fromMemberAnnotations(new WithMember() {

			public volatile Object withMember(AnnotatedMember annotatedmember)
			{
				return ((Object) (withMember(annotatedmember)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #27  <Method Class[] withMember(AnnotatedMember)>
			//    3    5:areturn         
			}

			public Class[] withMember(AnnotatedMember annotatedmember)
			{
				return _annotationIntrospector.findViews(((Annotated) (annotatedmember)));
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field POJOPropertyBuilder this$0>
			//    2    4:getfield        #31  <Field AnnotationIntrospector POJOPropertyBuilder._annotationIntrospector>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #36  <Method Class[] AnnotationIntrospector.findViews(Annotated)>
			//    5   11:areturn         
			}

			final POJOPropertyBuilder this$0;

			
			{
				this$0 = POJOPropertyBuilder.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field POJOPropertyBuilder this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #9   <Class POJOPropertyBuilder$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #458 <Method void POJOPropertyBuilder$1(POJOPropertyBuilder)>
	//    5    9:invokevirtual   #249 <Method Object fromMemberAnnotations(POJOPropertyBuilder$WithMember)>
	//    6   12:checkcast       #460 <Class Class[]>
	//    7   15:areturn         
	}

	protected Object fromMemberAnnotations(WithMember withmember)
	{
		AnnotationIntrospector annotationintrospector = _annotationIntrospector;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:astore          5
		Object obj2 = null;
	//    3    6:aconst_null     
	//    4    7:astore          4
		Object obj1 = null;
	//    5    9:aconst_null     
	//    6   10:astore_3        
		Object obj = null;
	//    7   11:aconst_null     
	//    8   12:astore_2        
		if(annotationintrospector != null)
	//*   9   13:aload           5
	//*  10   15:ifnull          150
		{
			if(_forSerialization)
	//*  11   18:aload_0         
	//*  12   19:getfield        #91  <Field boolean _forSerialization>
	//*  13   22:ifeq            54
			{
				obj1 = ((Object) (_getters));
	//   14   25:aload_0         
	//   15   26:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//   16   29:astore_3        
				obj = ((Object) (obj2));
	//   17   30:aload           4
	//   18   32:astore_2        
				if(obj1 != null)
	//*  19   33:aload_3         
	//*  20   34:ifnull          116
					obj = withmember.withMember((AnnotatedMember)((Linked) (obj1)).value);
	//   21   37:aload_1         
	//   22   38:aload_3         
	//   23   39:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//   24   42:checkcast       #136 <Class AnnotatedMember>
	//   25   45:invokeinterface #465 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//   26   50:astore_2        
			} else
	//*  27   51:goto            116
			{
				Linked linked = _ctorParameters;
	//   28   54:aload_0         
	//   29   55:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   30   58:astore          4
				obj1 = obj;
	//   31   60:aload_2         
	//   32   61:astore_3        
				if(linked != null)
	//*  33   62:aload           4
	//*  34   64:ifnull          82
					obj1 = withmember.withMember((AnnotatedMember)linked.value);
	//   35   67:aload_1         
	//   36   68:aload           4
	//   37   70:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//   38   73:checkcast       #136 <Class AnnotatedMember>
	//   39   76:invokeinterface #465 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//   40   81:astore_3        
				obj = obj1;
	//   41   82:aload_3         
	//   42   83:astore_2        
				if(obj1 == null)
	//*  43   84:aload_3         
	//*  44   85:ifnonnull       116
				{
					Linked linked1 = _setters;
	//   45   88:aload_0         
	//   46   89:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//   47   92:astore          4
					obj = obj1;
	//   48   94:aload_3         
	//   49   95:astore_2        
					if(linked1 != null)
	//*  50   96:aload           4
	//*  51   98:ifnull          116
						obj = withmember.withMember((AnnotatedMember)linked1.value);
	//   52  101:aload_1         
	//   53  102:aload           4
	//   54  104:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//   55  107:checkcast       #136 <Class AnnotatedMember>
	//   56  110:invokeinterface #465 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//   57  115:astore_2        
				}
			}
			obj1 = obj;
	//   58  116:aload_2         
	//   59  117:astore_3        
			if(obj == null)
	//*  60  118:aload_2         
	//*  61  119:ifnonnull       150
			{
				Linked linked2 = _fields;
	//   62  122:aload_0         
	//   63  123:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//   64  126:astore          4
				obj1 = obj;
	//   65  128:aload_2         
	//   66  129:astore_3        
				if(linked2 != null)
	//*  67  130:aload           4
	//*  68  132:ifnull          150
					obj1 = withmember.withMember((AnnotatedMember)linked2.value);
	//   69  135:aload_1         
	//   70  136:aload           4
	//   71  138:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//   72  141:checkcast       #136 <Class AnnotatedMember>
	//   73  144:invokeinterface #465 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//   74  149:astore_3        
			}
		}
		return obj1;
	//   75  150:aload_3         
	//   76  151:areturn         
	}

	protected Object fromMemberAnnotationsExcept(WithMember withmember, Object obj)
	{
		if(_annotationIntrospector == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field AnnotationIntrospector _annotationIntrospector>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(_forSerialization)
	//*   5    9:aload_0         
	//*   6   10:getfield        #91  <Field boolean _forSerialization>
	//*   7   13:ifeq            154
		{
			Object obj1 = ((Object) (_getters));
	//    8   16:aload_0         
	//    9   17:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//   10   20:astore_3        
			if(obj1 != null)
	//*  11   21:aload_3         
	//*  12   22:ifnull          50
			{
				obj1 = withmember.withMember((AnnotatedMember)((Linked) (obj1)).value);
	//   13   25:aload_1         
	//   14   26:aload_3         
	//   15   27:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//   16   30:checkcast       #136 <Class AnnotatedMember>
	//   17   33:invokeinterface #465 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//   18   38:astore_3        
				if(obj1 != null && obj1 != obj)
	//*  19   39:aload_3         
	//*  20   40:ifnull          50
	//*  21   43:aload_3         
	//*  22   44:aload_2         
	//*  23   45:if_acmpeq       50
					return obj1;
	//   24   48:aload_3         
	//   25   49:areturn         
			}
			obj1 = ((Object) (_fields));
	//   26   50:aload_0         
	//   27   51:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//   28   54:astore_3        
			if(obj1 != null)
	//*  29   55:aload_3         
	//*  30   56:ifnull          84
			{
				obj1 = withmember.withMember((AnnotatedMember)((Linked) (obj1)).value);
	//   31   59:aload_1         
	//   32   60:aload_3         
	//   33   61:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//   34   64:checkcast       #136 <Class AnnotatedMember>
	//   35   67:invokeinterface #465 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//   36   72:astore_3        
				if(obj1 != null && obj1 != obj)
	//*  37   73:aload_3         
	//*  38   74:ifnull          84
	//*  39   77:aload_3         
	//*  40   78:aload_2         
	//*  41   79:if_acmpeq       84
					return obj1;
	//   42   82:aload_3         
	//   43   83:areturn         
			}
			obj1 = ((Object) (_ctorParameters));
	//   44   84:aload_0         
	//   45   85:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   46   88:astore_3        
			if(obj1 != null)
	//*  47   89:aload_3         
	//*  48   90:ifnull          118
			{
				obj1 = withmember.withMember((AnnotatedMember)((Linked) (obj1)).value);
	//   49   93:aload_1         
	//   50   94:aload_3         
	//   51   95:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//   52   98:checkcast       #136 <Class AnnotatedMember>
	//   53  101:invokeinterface #465 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//   54  106:astore_3        
				if(obj1 != null && obj1 != obj)
	//*  55  107:aload_3         
	//*  56  108:ifnull          118
	//*  57  111:aload_3         
	//*  58  112:aload_2         
	//*  59  113:if_acmpeq       118
					return obj1;
	//   60  116:aload_3         
	//   61  117:areturn         
			}
			obj1 = ((Object) (_setters));
	//   62  118:aload_0         
	//   63  119:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//   64  122:astore_3        
			if(obj1 != null)
	//*  65  123:aload_3         
	//*  66  124:ifnull          152
			{
				withmember = ((WithMember) (withmember.withMember((AnnotatedMember)((Linked) (obj1)).value)));
	//   67  127:aload_1         
	//   68  128:aload_3         
	//   69  129:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//   70  132:checkcast       #136 <Class AnnotatedMember>
	//   71  135:invokeinterface #465 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//   72  140:astore_1        
				if(withmember != null && withmember != obj)
	//*  73  141:aload_1         
	//*  74  142:ifnull          152
	//*  75  145:aload_1         
	//*  76  146:aload_2         
	//*  77  147:if_acmpeq       152
					return ((Object) (withmember));
	//   78  150:aload_1         
	//   79  151:areturn         
			}
			return ((Object) (null));
	//   80  152:aconst_null     
	//   81  153:areturn         
		}
		Object obj2 = ((Object) (_ctorParameters));
	//   82  154:aload_0         
	//   83  155:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   84  158:astore_3        
		if(obj2 != null)
	//*  85  159:aload_3         
	//*  86  160:ifnull          188
		{
			obj2 = withmember.withMember((AnnotatedMember)((Linked) (obj2)).value);
	//   87  163:aload_1         
	//   88  164:aload_3         
	//   89  165:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//   90  168:checkcast       #136 <Class AnnotatedMember>
	//   91  171:invokeinterface #465 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//   92  176:astore_3        
			if(obj2 != null && obj2 != obj)
	//*  93  177:aload_3         
	//*  94  178:ifnull          188
	//*  95  181:aload_3         
	//*  96  182:aload_2         
	//*  97  183:if_acmpeq       188
				return obj2;
	//   98  186:aload_3         
	//   99  187:areturn         
		}
		obj2 = ((Object) (_setters));
	//  100  188:aload_0         
	//  101  189:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//  102  192:astore_3        
		if(obj2 != null)
	//* 103  193:aload_3         
	//* 104  194:ifnull          222
		{
			obj2 = withmember.withMember((AnnotatedMember)((Linked) (obj2)).value);
	//  105  197:aload_1         
	//  106  198:aload_3         
	//  107  199:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//  108  202:checkcast       #136 <Class AnnotatedMember>
	//  109  205:invokeinterface #465 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//  110  210:astore_3        
			if(obj2 != null && obj2 != obj)
	//* 111  211:aload_3         
	//* 112  212:ifnull          222
	//* 113  215:aload_3         
	//* 114  216:aload_2         
	//* 115  217:if_acmpeq       222
				return obj2;
	//  116  220:aload_3         
	//  117  221:areturn         
		}
		obj2 = ((Object) (_fields));
	//  118  222:aload_0         
	//  119  223:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//  120  226:astore_3        
		if(obj2 != null)
	//* 121  227:aload_3         
	//* 122  228:ifnull          256
		{
			obj2 = withmember.withMember((AnnotatedMember)((Linked) (obj2)).value);
	//  123  231:aload_1         
	//  124  232:aload_3         
	//  125  233:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//  126  236:checkcast       #136 <Class AnnotatedMember>
	//  127  239:invokeinterface #465 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//  128  244:astore_3        
			if(obj2 != null && obj2 != obj)
	//* 129  245:aload_3         
	//* 130  246:ifnull          256
	//* 131  249:aload_3         
	//* 132  250:aload_2         
	//* 133  251:if_acmpeq       256
				return obj2;
	//  134  254:aload_3         
	//  135  255:areturn         
		}
		obj2 = ((Object) (_getters));
	//  136  256:aload_0         
	//  137  257:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//  138  260:astore_3        
		if(obj2 != null)
	//* 139  261:aload_3         
	//* 140  262:ifnull          290
		{
			withmember = ((WithMember) (withmember.withMember((AnnotatedMember)((Linked) (obj2)).value)));
	//  141  265:aload_1         
	//  142  266:aload_3         
	//  143  267:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//  144  270:checkcast       #136 <Class AnnotatedMember>
	//  145  273:invokeinterface #465 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//  146  278:astore_1        
			if(withmember != null && withmember != obj)
	//* 147  279:aload_1         
	//* 148  280:ifnull          290
	//* 149  283:aload_1         
	//* 150  284:aload_2         
	//* 151  285:if_acmpeq       290
				return ((Object) (withmember));
	//  152  288:aload_1         
	//  153  289:areturn         
		}
		return ((Object) (null));
	//  154  290:aconst_null     
	//  155  291:areturn         
	}

	public AnnotatedParameter getConstructorParameter()
	{
		Linked linked1 = _ctorParameters;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//    2    4:astore_2        
		Linked linked = linked1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(linked1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       13
			return null;
	//    7   11:aconst_null     
	//    8   12:areturn         
		do
		{
			if(((AnnotatedParameter)linked.value).getOwner() instanceof AnnotatedConstructor)
	//*   9   13:aload_1         
	//*  10   14:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//*  11   17:checkcast       #471 <Class AnnotatedParameter>
	//*  12   20:invokevirtual   #475 <Method AnnotatedWithParams AnnotatedParameter.getOwner()>
	//*  13   23:instanceof      #477 <Class AnnotatedConstructor>
	//*  14   26:ifeq            37
				return (AnnotatedParameter)linked.value;
	//   15   29:aload_1         
	//   16   30:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//   17   33:checkcast       #471 <Class AnnotatedParameter>
	//   18   36:areturn         
			linked1 = linked.next;
	//   19   37:aload_1         
	//   20   38:getfield        #112 <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//   21   41:astore_2        
			linked = linked1;
	//   22   42:aload_2         
	//   23   43:astore_1        
		} while(linked1 != null);
	//   24   44:aload_2         
	//   25   45:ifnonnull       13
		return (AnnotatedParameter)_ctorParameters.value;
	//   26   48:aload_0         
	//   27   49:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   28   52:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//   29   55:checkcast       #471 <Class AnnotatedParameter>
	//   30   58:areturn         
	}

	public Iterator getConstructorParameters()
	{
		Linked linked = _ctorParameters;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//    2    4:astore_1        
		if(linked == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       13
			return ClassUtil.emptyIterator();
	//    5    9:invokestatic    #484 <Method Iterator ClassUtil.emptyIterator()>
	//    6   12:areturn         
		else
			return ((Iterator) (new MemberIterator(linked)));
	//    7   13:new             #32  <Class POJOPropertyBuilder$MemberIterator>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #487 <Method void POJOPropertyBuilder$MemberIterator(POJOPropertyBuilder$Linked)>
	//   11   21:areturn         
	}

	public AnnotatedField getField()
	{
		AnnotatedField annotatedfield;
label0:
		{
			Object obj = ((Object) (_fields));
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//    2    4:astore_1        
			if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
				return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
			annotatedfield = (AnnotatedField)((Linked) (obj)).value;
	//    7   11:aload_1         
	//    8   12:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//    9   15:checkcast       #492 <Class AnnotatedField>
	//   10   18:astore_2        
			obj = ((Object) (_fields.next));
	//   11   19:aload_0         
	//   12   20:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//   13   23:getfield        #112 <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//   14   26:astore_1        
			AnnotatedField annotatedfield1;
			do
			{
				if(obj == null)
					break label0;
	//   15   27:aload_1         
	//   16   28:ifnull          162
				annotatedfield1 = (AnnotatedField)((Linked) (obj)).value;
	//   17   31:aload_1         
	//   18   32:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//   19   35:checkcast       #492 <Class AnnotatedField>
	//   20   38:astore_3        
				Class class1 = annotatedfield.getDeclaringClass();
	//   21   39:aload_2         
	//   22   40:invokevirtual   #495 <Method Class AnnotatedField.getDeclaringClass()>
	//   23   43:astore          4
				Class class2 = annotatedfield1.getDeclaringClass();
	//   24   45:aload_3         
	//   25   46:invokevirtual   #495 <Method Class AnnotatedField.getDeclaringClass()>
	//   26   49:astore          5
				if(class1 == class2)
					break;
	//   27   51:aload           4
	//   28   53:aload           5
	//   29   55:if_acmpeq       91
				if(class1.isAssignableFrom(class2))
	//*  30   58:aload           4
	//*  31   60:aload           5
	//*  32   62:invokevirtual   #501 <Method boolean Class.isAssignableFrom(Class)>
	//*  33   65:ifeq            73
					annotatedfield = annotatedfield1;
	//   34   68:aload_3         
	//   35   69:astore_2        
				else
	//*  36   70:goto            83
				if(!class2.isAssignableFrom(class1))
					break;
	//   37   73:aload           5
	//   38   75:aload           4
	//   39   77:invokevirtual   #501 <Method boolean Class.isAssignableFrom(Class)>
	//   40   80:ifeq            91
				obj = ((Object) (((Linked) (obj)).next));
	//   41   83:aload_1         
	//   42   84:getfield        #112 <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//   43   87:astore_1        
			} while(true);
	//   44   88:goto            27
			obj = ((Object) (new StringBuilder()));
	//   45   91:new             #165 <Class StringBuilder>
	//   46   94:dup             
	//   47   95:invokespecial   #166 <Method void StringBuilder()>
	//   48   98:astore_1        
			((StringBuilder) (obj)).append("Multiple fields representing property \"");
	//   49   99:aload_1         
	//   50  100:ldc2            #503 <String "Multiple fields representing property \"">
	//   51  103:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   52  106:pop             
			((StringBuilder) (obj)).append(getName());
	//   53  107:aload_1         
	//   54  108:aload_0         
	//   55  109:invokevirtual   #391 <Method String getName()>
	//   56  112:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   57  115:pop             
			((StringBuilder) (obj)).append("\": ");
	//   58  116:aload_1         
	//   59  117:ldc2            #505 <String "\": ">
	//   60  120:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   61  123:pop             
			((StringBuilder) (obj)).append(annotatedfield.getFullName());
	//   62  124:aload_1         
	//   63  125:aload_2         
	//   64  126:invokevirtual   #508 <Method String AnnotatedField.getFullName()>
	//   65  129:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   66  132:pop             
			((StringBuilder) (obj)).append(" vs ");
	//   67  133:aload_1         
	//   68  134:ldc2            #510 <String " vs ">
	//   69  137:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   70  140:pop             
			((StringBuilder) (obj)).append(annotatedfield1.getFullName());
	//   71  141:aload_1         
	//   72  142:aload_3         
	//   73  143:invokevirtual   #508 <Method String AnnotatedField.getFullName()>
	//   74  146:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   75  149:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   76  150:new             #512 <Class IllegalArgumentException>
	//   77  153:dup             
	//   78  154:aload_1         
	//   79  155:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   80  158:invokespecial   #513 <Method void IllegalArgumentException(String)>
	//   81  161:athrow          
		}
		return annotatedfield;
	//   82  162:aload_2         
	//   83  163:areturn         
	}

	public PropertyName getFullName()
	{
		return _name;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field PropertyName _name>
	//    2    4:areturn         
	}

	public AnnotatedMethod getGetter()
	{
		Linked linked1;
label0:
		{
			Object obj = ((Object) (_getters));
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//    2    4:astore          5
			if(obj == null)
	//*   3    6:aload           5
	//*   4    8:ifnonnull       13
				return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
			Linked linked2 = ((Linked) (obj)).next;
	//    7   13:aload           5
	//    8   15:getfield        #112 <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//    9   18:astore          6
			linked1 = ((Linked) (obj));
	//   10   20:aload           5
	//   11   22:astore          4
			Linked linked = linked2;
	//   12   24:aload           6
	//   13   26:astore_3        
			if(linked2 == null)
	//*  14   27:aload           6
	//*  15   29:ifnonnull       41
				return (AnnotatedMethod)((Linked) (obj)).value;
	//   16   32:aload           5
	//   17   34:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//   18   37:checkcast       #352 <Class AnnotatedMethod>
	//   19   40:areturn         
label1:
			do
			{
label2:
				{
label3:
					{
						if(linked == null)
							break label0;
	//   20   41:aload_3         
	//   21   42:ifnull          241
						obj = ((Object) (((AnnotatedMethod)linked1.value).getDeclaringClass()));
	//   22   45:aload           4
	//   23   47:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//   24   50:checkcast       #352 <Class AnnotatedMethod>
	//   25   53:invokevirtual   #517 <Method Class AnnotatedMethod.getDeclaringClass()>
	//   26   56:astore          5
						Class class1 = ((AnnotatedMethod)linked.value).getDeclaringClass();
	//   27   58:aload_3         
	//   28   59:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//   29   62:checkcast       #352 <Class AnnotatedMethod>
	//   30   65:invokevirtual   #517 <Method Class AnnotatedMethod.getDeclaringClass()>
	//   31   68:astore          6
						if(obj != class1)
	//*  32   70:aload           5
	//*  33   72:aload           6
	//*  34   74:if_acmpeq       103
						{
							if(((Class) (obj)).isAssignableFrom(class1))
	//*  35   77:aload           5
	//*  36   79:aload           6
	//*  37   81:invokevirtual   #501 <Method boolean Class.isAssignableFrom(Class)>
	//*  38   84:ifeq            90
								break label3;
	//   39   87:goto            138
							if(class1.isAssignableFrom(((Class) (obj))))
	//*  40   90:aload           6
	//*  41   92:aload           5
	//*  42   94:invokevirtual   #501 <Method boolean Class.isAssignableFrom(Class)>
	//*  43   97:ifeq            103
								break label2;
	//   44  100:goto            141
						}
						int i = _getterPriority((AnnotatedMethod)linked.value);
	//   45  103:aload_0         
	//   46  104:aload_3         
	//   47  105:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//   48  108:checkcast       #352 <Class AnnotatedMethod>
	//   49  111:invokevirtual   #519 <Method int _getterPriority(AnnotatedMethod)>
	//   50  114:istore_1        
						int j = _getterPriority((AnnotatedMethod)linked1.value);
	//   51  115:aload_0         
	//   52  116:aload           4
	//   53  118:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//   54  121:checkcast       #352 <Class AnnotatedMethod>
	//   55  124:invokevirtual   #519 <Method int _getterPriority(AnnotatedMethod)>
	//   56  127:istore_2        
						if(i == j)
							break label1;
	//   57  128:iload_1         
	//   58  129:iload_2         
	//   59  130:icmpeq          149
						if(i >= j)
							break label2;
	//   60  133:iload_1         
	//   61  134:iload_2         
	//   62  135:icmpge          141
					}
					linked1 = linked;
	//   63  138:aload_3         
	//   64  139:astore          4
				}
				linked = linked.next;
	//   65  141:aload_3         
	//   66  142:getfield        #112 <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//   67  145:astore_3        
			} while(true);
	//   68  146:goto            41
			obj = ((Object) (new StringBuilder()));
	//   69  149:new             #165 <Class StringBuilder>
	//   70  152:dup             
	//   71  153:invokespecial   #166 <Method void StringBuilder()>
	//   72  156:astore          5
			((StringBuilder) (obj)).append("Conflicting getter definitions for property \"");
	//   73  158:aload           5
	//   74  160:ldc2            #521 <String "Conflicting getter definitions for property \"">
	//   75  163:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   76  166:pop             
			((StringBuilder) (obj)).append(getName());
	//   77  167:aload           5
	//   78  169:aload_0         
	//   79  170:invokevirtual   #391 <Method String getName()>
	//   80  173:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   81  176:pop             
			((StringBuilder) (obj)).append("\": ");
	//   82  177:aload           5
	//   83  179:ldc2            #505 <String "\": ">
	//   84  182:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   85  185:pop             
			((StringBuilder) (obj)).append(((AnnotatedMethod)linked1.value).getFullName());
	//   86  186:aload           5
	//   87  188:aload           4
	//   88  190:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//   89  193:checkcast       #352 <Class AnnotatedMethod>
	//   90  196:invokevirtual   #522 <Method String AnnotatedMethod.getFullName()>
	//   91  199:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   92  202:pop             
			((StringBuilder) (obj)).append(" vs ");
	//   93  203:aload           5
	//   94  205:ldc2            #510 <String " vs ">
	//   95  208:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   96  211:pop             
			((StringBuilder) (obj)).append(((AnnotatedMethod)linked.value).getFullName());
	//   97  212:aload           5
	//   98  214:aload_3         
	//   99  215:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//  100  218:checkcast       #352 <Class AnnotatedMethod>
	//  101  221:invokevirtual   #522 <Method String AnnotatedMethod.getFullName()>
	//  102  224:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//  103  227:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  104  228:new             #512 <Class IllegalArgumentException>
	//  105  231:dup             
	//  106  232:aload           5
	//  107  234:invokevirtual   #181 <Method String StringBuilder.toString()>
	//  108  237:invokespecial   #513 <Method void IllegalArgumentException(String)>
	//  109  240:athrow          
		}
		_getters = linked1.withoutNext();
	//  110  241:aload_0         
	//  111  242:aload           4
	//  112  244:invokevirtual   #525 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.withoutNext()>
	//  113  247:putfield        #99  <Field POJOPropertyBuilder$Linked _getters>
		return (AnnotatedMethod)linked1.value;
	//  114  250:aload           4
	//  115  252:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//  116  255:checkcast       #352 <Class AnnotatedMethod>
	//  117  258:areturn         
	}

	public String getInternalName()
	{
		return _internalName.getSimpleName();
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field PropertyName _internalName>
	//    2    4:invokevirtual   #529 <Method String PropertyName.getSimpleName()>
	//    3    7:areturn         
	}

	public PropertyMetadata getMetadata()
	{
		if(_metadata == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #533 <Field PropertyMetadata _metadata>
	//*   2    4:ifnonnull       99
		{
			Object obj = ((Object) (_findRequired()));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #535 <Method Boolean _findRequired()>
	//    5   11:astore_1        
			String s = _findDescription();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #537 <Method String _findDescription()>
	//    8   16:astore_2        
			Integer integer = _findIndex();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #539 <Method Integer _findIndex()>
	//   11   21:astore_3        
			String s1 = _findDefaultValue();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #541 <Method String _findDefaultValue()>
	//   14   26:astore          4
			if(obj == null && integer == null && s1 == null)
	//*  15   28:aload_1         
	//*  16   29:ifnonnull       68
	//*  17   32:aload_3         
	//*  18   33:ifnonnull       68
	//*  19   36:aload           4
	//*  20   38:ifnonnull       68
			{
				if(s == null)
	//*  21   41:aload_2         
	//*  22   42:ifnonnull       52
					obj = ((Object) (PropertyMetadata.STD_REQUIRED_OR_OPTIONAL));
	//   23   45:getstatic       #544 <Field PropertyMetadata PropertyMetadata.STD_REQUIRED_OR_OPTIONAL>
	//   24   48:astore_1        
				else
	//*  25   49:goto            60
					obj = ((Object) (PropertyMetadata.STD_REQUIRED_OR_OPTIONAL.withDescription(s)));
	//   26   52:getstatic       #544 <Field PropertyMetadata PropertyMetadata.STD_REQUIRED_OR_OPTIONAL>
	//   27   55:aload_2         
	//   28   56:invokevirtual   #548 <Method PropertyMetadata PropertyMetadata.withDescription(String)>
	//   29   59:astore_1        
				_metadata = ((PropertyMetadata) (obj));
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:putfield        #533 <Field PropertyMetadata _metadata>
			} else
	//*  33   65:goto            80
			{
				_metadata = PropertyMetadata.construct(((Boolean) (obj)), s, integer, s1);
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:aload_2         
	//   37   71:aload_3         
	//   38   72:aload           4
	//   39   74:invokestatic    #552 <Method PropertyMetadata PropertyMetadata.construct(Boolean, String, Integer, String)>
	//   40   77:putfield        #533 <Field PropertyMetadata _metadata>
			}
			if(!_forSerialization)
	//*  41   80:aload_0         
	//*  42   81:getfield        #91  <Field boolean _forSerialization>
	//*  43   84:ifne            99
				_metadata = _getSetterInfo(_metadata);
	//   44   87:aload_0         
	//   45   88:aload_0         
	//   46   89:aload_0         
	//   47   90:getfield        #533 <Field PropertyMetadata _metadata>
	//   48   93:invokevirtual   #554 <Method PropertyMetadata _getSetterInfo(PropertyMetadata)>
	//   49   96:putfield        #533 <Field PropertyMetadata _metadata>
		}
		return _metadata;
	//   50   99:aload_0         
	//   51  100:getfield        #533 <Field PropertyMetadata _metadata>
	//   52  103:areturn         
	}

	public String getName()
	{
		PropertyName propertyname = _name;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field PropertyName _name>
	//    2    4:astore_1        
		if(propertyname == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return propertyname.getSimpleName();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #529 <Method String PropertyName.getSimpleName()>
	//    9   15:areturn         
	}

	public AnnotatedMember getPrimaryMember()
	{
		if(_forSerialization)
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field boolean _forSerialization>
	//*   2    4:ifeq            12
			return getAccessor();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #272 <Method AnnotatedMember getAccessor()>
	//    5   11:areturn         
		AnnotatedMember annotatedmember1 = getMutator();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #557 <Method AnnotatedMember getMutator()>
	//    8   16:astore_2        
		AnnotatedMember annotatedmember = annotatedmember1;
	//    9   17:aload_2         
	//   10   18:astore_1        
		if(annotatedmember1 == null)
	//*  11   19:aload_2         
	//*  12   20:ifnonnull       28
			annotatedmember = getAccessor();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #272 <Method AnnotatedMember getAccessor()>
	//   15   27:astore_1        
		return annotatedmember;
	//   16   28:aload_1         
	//   17   29:areturn         
	}

	public JavaType getPrimaryType()
	{
		if(_forSerialization)
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field boolean _forSerialization>
	//*   2    4:ifeq            39
		{
			Object obj = ((Object) (getGetter()));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #561 <Method AnnotatedMethod getGetter()>
	//    5   11:astore_1        
			if(obj == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       34
			{
				obj = ((Object) (getField()));
	//    8   16:aload_0         
	//    9   17:invokevirtual   #563 <Method AnnotatedField getField()>
	//   10   20:astore_1        
				if(obj == null)
	//*  11   21:aload_1         
	//*  12   22:ifnonnull       29
					return TypeFactory.unknownType();
	//   13   25:invokestatic    #568 <Method JavaType TypeFactory.unknownType()>
	//   14   28:areturn         
				else
					return ((AnnotatedMember) (obj)).getType();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #571 <Method JavaType AnnotatedMember.getType()>
	//   17   33:areturn         
			} else
			{
				return ((AnnotatedMember) (obj)).getType();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #571 <Method JavaType AnnotatedMember.getType()>
	//   20   38:areturn         
			}
		}
		Object obj2 = ((Object) (getConstructorParameter()));
	//   21   39:aload_0         
	//   22   40:invokevirtual   #573 <Method AnnotatedParameter getConstructorParameter()>
	//   23   43:astore_2        
		Object obj1 = obj2;
	//   24   44:aload_2         
	//   25   45:astore_1        
		if(obj2 == null)
	//*  26   46:aload_2         
	//*  27   47:ifnonnull       73
		{
			obj1 = ((Object) (getSetter()));
	//   28   50:aload_0         
	//   29   51:invokevirtual   #576 <Method AnnotatedMethod getSetter()>
	//   30   54:astore_1        
			if(obj1 != null)
	//*  31   55:aload_1         
	//*  32   56:ifnull          68
				return ((AnnotatedMethod)obj1).getParameterType(0);
	//   33   59:aload_1         
	//   34   60:checkcast       #352 <Class AnnotatedMethod>
	//   35   63:iconst_0        
	//   36   64:invokevirtual   #580 <Method JavaType AnnotatedMethod.getParameterType(int)>
	//   37   67:areturn         
			obj1 = ((Object) (getField()));
	//   38   68:aload_0         
	//   39   69:invokevirtual   #563 <Method AnnotatedField getField()>
	//   40   72:astore_1        
		}
		obj2 = obj1;
	//   41   73:aload_1         
	//   42   74:astore_2        
		if(obj1 == null)
	//*  43   75:aload_1         
	//*  44   76:ifnonnull       94
		{
			AnnotatedMethod annotatedmethod = getGetter();
	//   45   79:aload_0         
	//   46   80:invokevirtual   #561 <Method AnnotatedMethod getGetter()>
	//   47   83:astore_1        
			obj2 = ((Object) (annotatedmethod));
	//   48   84:aload_1         
	//   49   85:astore_2        
			if(annotatedmethod == null)
	//*  50   86:aload_1         
	//*  51   87:ifnonnull       94
				return TypeFactory.unknownType();
	//   52   90:invokestatic    #568 <Method JavaType TypeFactory.unknownType()>
	//   53   93:areturn         
		}
		return ((AnnotatedMember) (obj2)).getType();
	//   54   94:aload_2         
	//   55   95:invokevirtual   #571 <Method JavaType AnnotatedMember.getType()>
	//   56   98:areturn         
	}

	public Class getRawPrimaryType()
	{
		return getPrimaryType().getRawClass();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #582 <Method JavaType getPrimaryType()>
	//    2    4:invokevirtual   #587 <Method Class JavaType.getRawClass()>
	//    3    7:areturn         
	}

	public AnnotatedMethod getSetter()
	{
		Linked linked1;
label0:
		{
			Linked linked2 = _setters;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//    2    4:astore          5
			if(linked2 == null)
	//*   3    6:aload           5
	//*   4    8:ifnonnull       13
				return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
			Linked linked3 = linked2.next;
	//    7   13:aload           5
	//    8   15:getfield        #112 <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//    9   18:astore          6
			linked1 = linked2;
	//   10   20:aload           5
	//   11   22:astore          4
			Linked linked = linked3;
	//   12   24:aload           6
	//   13   26:astore_3        
			if(linked3 == null)
	//*  14   27:aload           6
	//*  15   29:ifnonnull       41
				return (AnnotatedMethod)linked2.value;
	//   16   32:aload           5
	//   17   34:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//   18   37:checkcast       #352 <Class AnnotatedMethod>
	//   19   40:areturn         
label1:
			do
			{
label2:
				{
label3:
					{
						if(linked == null)
							break label0;
	//   20   41:aload_3         
	//   21   42:ifnull          255
						Object obj = ((Object) (((AnnotatedMethod)linked1.value).getDeclaringClass()));
	//   22   45:aload           4
	//   23   47:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//   24   50:checkcast       #352 <Class AnnotatedMethod>
	//   25   53:invokevirtual   #517 <Method Class AnnotatedMethod.getDeclaringClass()>
	//   26   56:astore          5
						Object obj1 = ((Object) (((AnnotatedMethod)linked.value).getDeclaringClass()));
	//   27   58:aload_3         
	//   28   59:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//   29   62:checkcast       #352 <Class AnnotatedMethod>
	//   30   65:invokevirtual   #517 <Method Class AnnotatedMethod.getDeclaringClass()>
	//   31   68:astore          6
						if(obj != obj1)
	//*  32   70:aload           5
	//*  33   72:aload           6
	//*  34   74:if_acmpeq       103
						{
							if(((Class) (obj)).isAssignableFrom(((Class) (obj1))))
	//*  35   77:aload           5
	//*  36   79:aload           6
	//*  37   81:invokevirtual   #501 <Method boolean Class.isAssignableFrom(Class)>
	//*  38   84:ifeq            90
								break label3;
	//   39   87:goto            192
							if(((Class) (obj1)).isAssignableFrom(((Class) (obj))))
	//*  40   90:aload           6
	//*  41   92:aload           5
	//*  42   94:invokevirtual   #501 <Method boolean Class.isAssignableFrom(Class)>
	//*  43   97:ifeq            103
								break label2;
	//   44  100:goto            195
						}
						obj = ((Object) ((AnnotatedMethod)linked.value));
	//   45  103:aload_3         
	//   46  104:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//   47  107:checkcast       #352 <Class AnnotatedMethod>
	//   48  110:astore          5
						obj1 = ((Object) ((AnnotatedMethod)linked1.value));
	//   49  112:aload           4
	//   50  114:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//   51  117:checkcast       #352 <Class AnnotatedMethod>
	//   52  120:astore          6
						int i = _setterPriority(((AnnotatedMethod) (obj)));
	//   53  122:aload_0         
	//   54  123:aload           5
	//   55  125:invokevirtual   #590 <Method int _setterPriority(AnnotatedMethod)>
	//   56  128:istore_1        
						int j = _setterPriority(((AnnotatedMethod) (obj1)));
	//   57  129:aload_0         
	//   58  130:aload           6
	//   59  132:invokevirtual   #590 <Method int _setterPriority(AnnotatedMethod)>
	//   60  135:istore_2        
						if(i != j)
	//*  61  136:iload_1         
	//*  62  137:iload_2         
	//*  63  138:icmpeq          149
						{
							if(i >= j)
	//*  64  141:iload_1         
	//*  65  142:iload_2         
	//*  66  143:icmpge          195
								break label2;
	//   67  146:goto            192
						} else
						{
							Object obj2 = ((Object) (_annotationIntrospector));
	//   68  149:aload_0         
	//   69  150:getfield        #85  <Field AnnotationIntrospector _annotationIntrospector>
	//   70  153:astore          7
							if(obj2 == null)
								break label1;
	//   71  155:aload           7
	//   72  157:ifnull          203
							obj2 = ((Object) (((AnnotationIntrospector) (obj2)).resolveSetterConflict(_config, ((AnnotatedMethod) (obj1)), ((AnnotatedMethod) (obj)))));
	//   73  160:aload           7
	//   74  162:aload_0         
	//   75  163:getfield        #83  <Field MapperConfig _config>
	//   76  166:aload           6
	//   77  168:aload           5
	//   78  170:invokevirtual   #594 <Method AnnotatedMethod AnnotationIntrospector.resolveSetterConflict(MapperConfig, AnnotatedMethod, AnnotatedMethod)>
	//   79  173:astore          7
							if(obj2 == obj1)
	//*  80  175:aload           7
	//*  81  177:aload           6
	//*  82  179:if_acmpne       185
								break label2;
	//   83  182:goto            195
							if(obj2 != obj)
								break label1;
	//   84  185:aload           7
	//   85  187:aload           5
	//   86  189:if_acmpne       203
						}
					}
					linked1 = linked;
	//   87  192:aload_3         
	//   88  193:astore          4
				}
				linked = linked.next;
	//   89  195:aload_3         
	//   90  196:getfield        #112 <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//   91  199:astore_3        
			} while(true);
	//   92  200:goto            41
			throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s vs %s", new Object[] {
				getName(), ((AnnotatedMethod)linked1.value).getFullName(), ((AnnotatedMethod)linked.value).getFullName()
			}));
	//   93  203:new             #512 <Class IllegalArgumentException>
	//   94  206:dup             
	//   95  207:ldc2            #596 <String "Conflicting setter definitions for property \"%s\": %s vs %s">
	//   96  210:iconst_3        
	//   97  211:anewarray       Object[]
	//   98  214:dup             
	//   99  215:iconst_0        
	//  100  216:aload_0         
	//  101  217:invokevirtual   #391 <Method String getName()>
	//  102  220:aastore         
	//  103  221:dup             
	//  104  222:iconst_1        
	//  105  223:aload           4
	//  106  225:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//  107  228:checkcast       #352 <Class AnnotatedMethod>
	//  108  231:invokevirtual   #522 <Method String AnnotatedMethod.getFullName()>
	//  109  234:aastore         
	//  110  235:dup             
	//  111  236:iconst_2        
	//  112  237:aload_3         
	//  113  238:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//  114  241:checkcast       #352 <Class AnnotatedMethod>
	//  115  244:invokevirtual   #522 <Method String AnnotatedMethod.getFullName()>
	//  116  247:aastore         
	//  117  248:invokestatic    #602 <Method String String.format(String, Object[])>
	//  118  251:invokespecial   #513 <Method void IllegalArgumentException(String)>
	//  119  254:athrow          
		}
		_setters = linked1.withoutNext();
	//  120  255:aload_0         
	//  121  256:aload           4
	//  122  258:invokevirtual   #525 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.withoutNext()>
	//  123  261:putfield        #101 <Field POJOPropertyBuilder$Linked _setters>
		return (AnnotatedMethod)linked1.value;
	//  124  264:aload           4
	//  125  266:getfield        #134 <Field Object POJOPropertyBuilder$Linked.value>
	//  126  269:checkcast       #352 <Class AnnotatedMethod>
	//  127  272:areturn         
	}

	public PropertyName getWrapperName()
	{
		AnnotatedMember annotatedmember = getPrimaryMember();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #269 <Method AnnotatedMember getPrimaryMember()>
	//    2    4:astore_1        
		if(annotatedmember != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          27
		{
			AnnotationIntrospector annotationintrospector = _annotationIntrospector;
	//    5    9:aload_0         
	//    6   10:getfield        #85  <Field AnnotationIntrospector _annotationIntrospector>
	//    7   13:astore_2        
			if(annotationintrospector != null)
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       21
	//*  10   18:goto            27
				return annotationintrospector.findWrapperName(((Annotated) (annotatedmember)));
	//   11   21:aload_2         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #607 <Method PropertyName AnnotationIntrospector.findWrapperName(Annotated)>
	//   14   26:areturn         
		}
		return null;
	//   15   27:aconst_null     
	//   16   28:areturn         
	}

	public boolean hasConstructorParameter()
	{
		return _ctorParameters != null;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean hasField()
	{
		return _fields != null;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean hasGetter()
	{
		return _getters != null;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean hasName(PropertyName propertyname)
	{
		return _name.equals(((Object) (propertyname)));
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field PropertyName _name>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #613 <Method boolean PropertyName.equals(Object)>
	//    4    8:ireturn         
	}

	public boolean hasSetter()
	{
		return _setters != null;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isExplicitlyIncluded()
	{
		return _anyExplicits(_fields) || _anyExplicits(_getters) || _anyExplicits(_setters) || _anyExplicitNames(_ctorParameters);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//    3    5:invokespecial   #617 <Method boolean _anyExplicits(POJOPropertyBuilder$Linked)>
	//    4    8:ifne            49
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//    8   16:invokespecial   #617 <Method boolean _anyExplicits(POJOPropertyBuilder$Linked)>
	//    9   19:ifne            49
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//   13   27:invokespecial   #617 <Method boolean _anyExplicits(POJOPropertyBuilder$Linked)>
	//   14   30:ifne            49
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   18   38:invokespecial   #619 <Method boolean _anyExplicitNames(POJOPropertyBuilder$Linked)>
	//   19   41:ifeq            47
	//   20   44:goto            49
	//   21   47:iconst_0        
	//   22   48:ireturn         
	//   23   49:iconst_1        
	//   24   50:ireturn         
	}

	public boolean isExplicitlyNamed()
	{
		return _anyExplicitNames(_fields) || _anyExplicitNames(_getters) || _anyExplicitNames(_setters) || _anyExplicitNames(_ctorParameters);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//    3    5:invokespecial   #619 <Method boolean _anyExplicitNames(POJOPropertyBuilder$Linked)>
	//    4    8:ifne            49
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//    8   16:invokespecial   #619 <Method boolean _anyExplicitNames(POJOPropertyBuilder$Linked)>
	//    9   19:ifne            49
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//   13   27:invokespecial   #619 <Method boolean _anyExplicitNames(POJOPropertyBuilder$Linked)>
	//   14   30:ifne            49
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   18   38:invokespecial   #619 <Method boolean _anyExplicitNames(POJOPropertyBuilder$Linked)>
	//   19   41:ifeq            47
	//   20   44:goto            49
	//   21   47:iconst_0        
	//   22   48:ireturn         
	//   23   49:iconst_1        
	//   24   50:ireturn         
	}

	public boolean isTypeId()
	{
		Boolean boolean1 = (Boolean)fromMemberAnnotations(new WithMember() {

			public Boolean withMember(AnnotatedMember annotatedmember)
			{
				return _annotationIntrospector.isTypeId(annotatedmember);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field POJOPropertyBuilder this$0>
			//    2    4:getfield        #28  <Field AnnotationIntrospector POJOPropertyBuilder._annotationIntrospector>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #32  <Method Boolean AnnotationIntrospector.isTypeId(AnnotatedMember)>
			//    5   11:areturn         
			}

			public volatile Object withMember(AnnotatedMember annotatedmember)
			{
				return ((Object) (withMember(annotatedmember)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #35  <Method Boolean withMember(AnnotatedMember)>
			//    3    5:areturn         
			}

			final POJOPropertyBuilder this$0;

			
			{
				this$0 = POJOPropertyBuilder.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field POJOPropertyBuilder this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #15  <Class POJOPropertyBuilder$3>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #622 <Method void POJOPropertyBuilder$3(POJOPropertyBuilder)>
	//    5    9:invokevirtual   #249 <Method Object fromMemberAnnotations(POJOPropertyBuilder$WithMember)>
	//    6   12:checkcast       #263 <Class Boolean>
	//    7   15:astore_1        
		return boolean1 != null && boolean1.booleanValue();
	//    8   16:aload_1         
	//    9   17:ifnull          29
	//   10   20:aload_1         
	//   11   21:invokevirtual   #281 <Method boolean Boolean.booleanValue()>
	//   12   24:ifeq            29
	//   13   27:iconst_1        
	//   14   28:ireturn         
	//   15   29:iconst_0        
	//   16   30:ireturn         
	}

	public void mergeAnnotations(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            113
		{
			Object obj = ((Object) (_getters));
	//    2    4:aload_0         
	//    3    5:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//    4    8:astore_2        
			if(obj != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          62
			{
				obj = ((Object) (_mergeAnnotations(0, new Linked[] {
					obj, _fields, _ctorParameters, _setters
				})));
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:iconst_4        
	//   10   16:anewarray       Linked[]
	//   11   19:dup             
	//   12   20:iconst_0        
	//   13   21:aload_2         
	//   14   22:aastore         
	//   15   23:dup             
	//   16   24:iconst_1        
	//   17   25:aload_0         
	//   18   26:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//   19   29:aastore         
	//   20   30:dup             
	//   21   31:iconst_2        
	//   22   32:aload_0         
	//   23   33:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   24   36:aastore         
	//   25   37:dup             
	//   26   38:iconst_3        
	//   27   39:aload_0         
	//   28   40:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//   29   43:aastore         
	//   30   44:invokespecial   #222 <Method AnnotationMap _mergeAnnotations(int, POJOPropertyBuilder$Linked[])>
	//   31   47:astore_2        
				_getters = _applyAnnotations(_getters, ((AnnotationMap) (obj)));
	//   32   48:aload_0         
	//   33   49:aload_0         
	//   34   50:aload_0         
	//   35   51:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//   36   54:aload_2         
	//   37   55:invokespecial   #142 <Method POJOPropertyBuilder$Linked _applyAnnotations(POJOPropertyBuilder$Linked, AnnotationMap)>
	//   38   58:putfield        #99  <Field POJOPropertyBuilder$Linked _getters>
				return;
	//   39   61:return          
			}
			obj = ((Object) (_fields));
	//   40   62:aload_0         
	//   41   63:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//   42   66:astore_2        
			if(obj != null)
	//*  43   67:aload_2         
	//*  44   68:ifnull          265
			{
				obj = ((Object) (_mergeAnnotations(0, new Linked[] {
					obj, _ctorParameters, _setters
				})));
	//   45   71:aload_0         
	//   46   72:iconst_0        
	//   47   73:iconst_3        
	//   48   74:anewarray       Linked[]
	//   49   77:dup             
	//   50   78:iconst_0        
	//   51   79:aload_2         
	//   52   80:aastore         
	//   53   81:dup             
	//   54   82:iconst_1        
	//   55   83:aload_0         
	//   56   84:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   57   87:aastore         
	//   58   88:dup             
	//   59   89:iconst_2        
	//   60   90:aload_0         
	//   61   91:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//   62   94:aastore         
	//   63   95:invokespecial   #222 <Method AnnotationMap _mergeAnnotations(int, POJOPropertyBuilder$Linked[])>
	//   64   98:astore_2        
				_fields = _applyAnnotations(_fields, ((AnnotationMap) (obj)));
	//   65   99:aload_0         
	//   66  100:aload_0         
	//   67  101:aload_0         
	//   68  102:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//   69  105:aload_2         
	//   70  106:invokespecial   #142 <Method POJOPropertyBuilder$Linked _applyAnnotations(POJOPropertyBuilder$Linked, AnnotationMap)>
	//   71  109:putfield        #95  <Field POJOPropertyBuilder$Linked _fields>
				return;
	//   72  112:return          
			}
		} else
		{
			Object obj1 = ((Object) (_ctorParameters));
	//   73  113:aload_0         
	//   74  114:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   75  117:astore_2        
			if(obj1 != null)
	//*  76  118:aload_2         
	//*  77  119:ifnull          171
			{
				obj1 = ((Object) (_mergeAnnotations(0, new Linked[] {
					obj1, _setters, _fields, _getters
				})));
	//   78  122:aload_0         
	//   79  123:iconst_0        
	//   80  124:iconst_4        
	//   81  125:anewarray       Linked[]
	//   82  128:dup             
	//   83  129:iconst_0        
	//   84  130:aload_2         
	//   85  131:aastore         
	//   86  132:dup             
	//   87  133:iconst_1        
	//   88  134:aload_0         
	//   89  135:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//   90  138:aastore         
	//   91  139:dup             
	//   92  140:iconst_2        
	//   93  141:aload_0         
	//   94  142:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//   95  145:aastore         
	//   96  146:dup             
	//   97  147:iconst_3        
	//   98  148:aload_0         
	//   99  149:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//  100  152:aastore         
	//  101  153:invokespecial   #222 <Method AnnotationMap _mergeAnnotations(int, POJOPropertyBuilder$Linked[])>
	//  102  156:astore_2        
				_ctorParameters = _applyAnnotations(_ctorParameters, ((AnnotationMap) (obj1)));
	//  103  157:aload_0         
	//  104  158:aload_0         
	//  105  159:aload_0         
	//  106  160:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//  107  163:aload_2         
	//  108  164:invokespecial   #142 <Method POJOPropertyBuilder$Linked _applyAnnotations(POJOPropertyBuilder$Linked, AnnotationMap)>
	//  109  167:putfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
				return;
	//  110  170:return          
			}
			obj1 = ((Object) (_setters));
	//  111  171:aload_0         
	//  112  172:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//  113  175:astore_2        
			if(obj1 != null)
	//* 114  176:aload_2         
	//* 115  177:ifnull          222
			{
				obj1 = ((Object) (_mergeAnnotations(0, new Linked[] {
					obj1, _fields, _getters
				})));
	//  116  180:aload_0         
	//  117  181:iconst_0        
	//  118  182:iconst_3        
	//  119  183:anewarray       Linked[]
	//  120  186:dup             
	//  121  187:iconst_0        
	//  122  188:aload_2         
	//  123  189:aastore         
	//  124  190:dup             
	//  125  191:iconst_1        
	//  126  192:aload_0         
	//  127  193:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//  128  196:aastore         
	//  129  197:dup             
	//  130  198:iconst_2        
	//  131  199:aload_0         
	//  132  200:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//  133  203:aastore         
	//  134  204:invokespecial   #222 <Method AnnotationMap _mergeAnnotations(int, POJOPropertyBuilder$Linked[])>
	//  135  207:astore_2        
				_setters = _applyAnnotations(_setters, ((AnnotationMap) (obj1)));
	//  136  208:aload_0         
	//  137  209:aload_0         
	//  138  210:aload_0         
	//  139  211:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//  140  214:aload_2         
	//  141  215:invokespecial   #142 <Method POJOPropertyBuilder$Linked _applyAnnotations(POJOPropertyBuilder$Linked, AnnotationMap)>
	//  142  218:putfield        #101 <Field POJOPropertyBuilder$Linked _setters>
				return;
	//  143  221:return          
			}
			obj1 = ((Object) (_fields));
	//  144  222:aload_0         
	//  145  223:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//  146  226:astore_2        
			if(obj1 != null)
	//* 147  227:aload_2         
	//* 148  228:ifnull          265
			{
				obj1 = ((Object) (_mergeAnnotations(0, new Linked[] {
					obj1, _getters
				})));
	//  149  231:aload_0         
	//  150  232:iconst_0        
	//  151  233:iconst_2        
	//  152  234:anewarray       Linked[]
	//  153  237:dup             
	//  154  238:iconst_0        
	//  155  239:aload_2         
	//  156  240:aastore         
	//  157  241:dup             
	//  158  242:iconst_1        
	//  159  243:aload_0         
	//  160  244:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//  161  247:aastore         
	//  162  248:invokespecial   #222 <Method AnnotationMap _mergeAnnotations(int, POJOPropertyBuilder$Linked[])>
	//  163  251:astore_2        
				_fields = _applyAnnotations(_fields, ((AnnotationMap) (obj1)));
	//  164  252:aload_0         
	//  165  253:aload_0         
	//  166  254:aload_0         
	//  167  255:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//  168  258:aload_2         
	//  169  259:invokespecial   #142 <Method POJOPropertyBuilder$Linked _applyAnnotations(POJOPropertyBuilder$Linked, AnnotationMap)>
	//  170  262:putfield        #95  <Field POJOPropertyBuilder$Linked _fields>
			}
		}
	//  171  265:return          
	}

	public void removeConstructors()
	{
		_ctorParameters = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//    3    5:return          
	}

	public void removeIgnored()
	{
		_fields = _removeIgnored(_fields);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//    4    6:invokespecial   #628 <Method POJOPropertyBuilder$Linked _removeIgnored(POJOPropertyBuilder$Linked)>
	//    5    9:putfield        #95  <Field POJOPropertyBuilder$Linked _fields>
		_getters = _removeIgnored(_getters);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//   10   18:invokespecial   #628 <Method POJOPropertyBuilder$Linked _removeIgnored(POJOPropertyBuilder$Linked)>
	//   11   21:putfield        #99  <Field POJOPropertyBuilder$Linked _getters>
		_setters = _removeIgnored(_setters);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//   16   30:invokespecial   #628 <Method POJOPropertyBuilder$Linked _removeIgnored(POJOPropertyBuilder$Linked)>
	//   17   33:putfield        #101 <Field POJOPropertyBuilder$Linked _setters>
		_ctorParameters = _removeIgnored(_ctorParameters);
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   22   42:invokespecial   #628 <Method POJOPropertyBuilder$Linked _removeIgnored(POJOPropertyBuilder$Linked)>
	//   23   45:putfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   24   48:return          
	}

	public com.fasterxml.jackson.annotation.JsonProperty.Access removeNonVisible(boolean flag)
	{
		com.fasterxml.jackson.annotation.JsonProperty.Access access1 = findAccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #632 <Method com.fasterxml.jackson.annotation.JsonProperty$Access findAccess()>
	//    2    4:astore_3        
		com.fasterxml.jackson.annotation.JsonProperty.Access access = access1;
	//    3    5:aload_3         
	//    4    6:astore_2        
		if(access1 == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       15
			access = com.fasterxml.jackson.annotation.JsonProperty.Access.AUTO;
	//    7   11:getstatic       #420 <Field com.fasterxml.jackson.annotation.JsonProperty$Access com.fasterxml.jackson.annotation.JsonProperty$Access.AUTO>
	//    8   14:astore_2        
		static class _cls10
		{

			static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access[];

			static 
			{
				$SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access = new int[com.fasterxml.jackson.annotation.JsonProperty.Access.values().length];
			//    0    0:invokestatic    #18  <Method com.fasterxml.jackson.annotation.JsonProperty$Access[] com.fasterxml.jackson.annotation.JsonProperty$Access.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access>
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access[com.fasterxml.jackson.annotation.JsonProperty.Access.READ_ONLY.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access>
			//    5   12:getstatic       #24  <Field com.fasterxml.jackson.annotation.JsonProperty$Access com.fasterxml.jackson.annotation.JsonProperty$Access.READ_ONLY>
			//    6   15:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonProperty$Access.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access>
			//*  10   23:getstatic       #31  <Field com.fasterxml.jackson.annotation.JsonProperty$Access com.fasterxml.jackson.annotation.JsonProperty$Access.READ_WRITE>
			//*  11   26:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonProperty$Access.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access>
			//*  15   34:getstatic       #34  <Field com.fasterxml.jackson.annotation.JsonProperty$Access com.fasterxml.jackson.annotation.JsonProperty$Access.WRITE_ONLY>
			//*  16   37:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonProperty$Access.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access>
			//*  20   45:getstatic       #37  <Field com.fasterxml.jackson.annotation.JsonProperty$Access com.fasterxml.jackson.annotation.JsonProperty$Access.AUTO>
			//*  21   48:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonProperty$Access.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   25   54:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access[com.fasterxml.jackson.annotation.JsonProperty.Access.READ_WRITE.ordinal()] = 2;
				}
			//*  26   55:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   27   58:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access[com.fasterxml.jackson.annotation.JsonProperty.Access.WRITE_ONLY.ordinal()] = 3;
				}
			//*  28   59:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   29   62:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access[com.fasterxml.jackson.annotation.JsonProperty.Access.AUTO.ordinal()] = 4;
				}
			//*  30   63:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   66:astore_0        
			//*  32   67:return          
			}
		}

		switch(_cls10..SwitchMap.com.fasterxml.jackson.annotation.JsonProperty.Access[access.ordinal()])
	//*   9   15:getstatic       #636 <Field int[] POJOPropertyBuilder$10.$SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access>
	//*  10   18:aload_2         
	//*  11   19:invokevirtual   #639 <Method int com.fasterxml.jackson.annotation.JsonProperty$Access.ordinal()>
	//*  12   22:iaload          
		{
	//*  13   23:tableswitch     1 3: default 48
	//	               1 105
	//	               2 153
	//	               3 86
		default:
			_getters = _removeNonVisible(_getters);
	//   14   48:aload_0         
	//   15   49:aload_0         
	//   16   50:aload_0         
	//   17   51:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//   18   54:invokespecial   #641 <Method POJOPropertyBuilder$Linked _removeNonVisible(POJOPropertyBuilder$Linked)>
	//   19   57:putfield        #99  <Field POJOPropertyBuilder$Linked _getters>
			_ctorParameters = _removeNonVisible(_ctorParameters);
	//   20   60:aload_0         
	//   21   61:aload_0         
	//   22   62:aload_0         
	//   23   63:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   24   66:invokespecial   #641 <Method POJOPropertyBuilder$Linked _removeNonVisible(POJOPropertyBuilder$Linked)>
	//   25   69:putfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
			if(!flag || _getters == null)
	//*  26   72:iload_1         
	//*  27   73:ifeq            129
	//*  28   76:aload_0         
	//*  29   77:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//*  30   80:ifnonnull       153
	//*  31   83:goto            129
	//*  32   86:aload_0         
	//*  33   87:aconst_null     
	//*  34   88:putfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//*  35   91:aload_0         
	//*  36   92:getfield        #91  <Field boolean _forSerialization>
	//*  37   95:ifeq            153
	//*  38   98:aload_0         
	//*  39   99:aconst_null     
	//*  40  100:putfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//*  41  103:aload_2         
	//*  42  104:areturn         
	//*  43  105:aload_0         
	//*  44  106:aconst_null     
	//*  45  107:putfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//*  46  110:aload_0         
	//*  47  111:aconst_null     
	//*  48  112:putfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//*  49  115:aload_0         
	//*  50  116:getfield        #91  <Field boolean _forSerialization>
	//*  51  119:ifne            153
	//*  52  122:aload_0         
	//*  53  123:aconst_null     
	//*  54  124:putfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//*  55  127:aload_2         
	//*  56  128:areturn         
			{
				_fields = _removeNonVisible(_fields);
	//   57  129:aload_0         
	//   58  130:aload_0         
	//   59  131:aload_0         
	//   60  132:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//   61  135:invokespecial   #641 <Method POJOPropertyBuilder$Linked _removeNonVisible(POJOPropertyBuilder$Linked)>
	//   62  138:putfield        #95  <Field POJOPropertyBuilder$Linked _fields>
				_setters = _removeNonVisible(_setters);
	//   63  141:aload_0         
	//   64  142:aload_0         
	//   65  143:aload_0         
	//   66  144:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//   67  147:invokespecial   #641 <Method POJOPropertyBuilder$Linked _removeNonVisible(POJOPropertyBuilder$Linked)>
	//   68  150:putfield        #101 <Field POJOPropertyBuilder$Linked _setters>
			}
			break;

		case 2: // '\002'
			break;

		case 3: // '\003'
			_getters = null;
			if(_forSerialization)
			{
				_fields = null;
				return access;
			}
			break;

		case 1: // '\001'
			_setters = null;
			_ctorParameters = null;
			if(!_forSerialization)
			{
				_fields = null;
				return access;
			}
			break;
		}
		return access;
	//   69  153:aload_2         
	//   70  154:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #165 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #166 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[Property '");
	//    4    8:aload_1         
	//    5    9:ldc2            #643 <String "[Property '">
	//    6   12:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(((Object) (_name)));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #89  <Field PropertyName _name>
	//   11   21:invokevirtual   #175 <Method StringBuilder StringBuilder.append(Object)>
	//   12   24:pop             
		stringbuilder.append("'; ctors: ");
	//   13   25:aload_1         
	//   14   26:ldc2            #645 <String "'; ctors: ">
	//   15   29:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(((Object) (_ctorParameters)));
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   20   38:invokevirtual   #175 <Method StringBuilder StringBuilder.append(Object)>
	//   21   41:pop             
		stringbuilder.append(", field(s): ");
	//   22   42:aload_1         
	//   23   43:ldc2            #647 <String ", field(s): ">
	//   24   46:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
		stringbuilder.append(((Object) (_fields)));
	//   26   50:aload_1         
	//   27   51:aload_0         
	//   28   52:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//   29   55:invokevirtual   #175 <Method StringBuilder StringBuilder.append(Object)>
	//   30   58:pop             
		stringbuilder.append(", getter(s): ");
	//   31   59:aload_1         
	//   32   60:ldc2            #649 <String ", getter(s): ">
	//   33   63:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   34   66:pop             
		stringbuilder.append(((Object) (_getters)));
	//   35   67:aload_1         
	//   36   68:aload_0         
	//   37   69:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//   38   72:invokevirtual   #175 <Method StringBuilder StringBuilder.append(Object)>
	//   39   75:pop             
		stringbuilder.append(", setter(s): ");
	//   40   76:aload_1         
	//   41   77:ldc2            #651 <String ", setter(s): ">
	//   42   80:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   43   83:pop             
		stringbuilder.append(((Object) (_setters)));
	//   44   84:aload_1         
	//   45   85:aload_0         
	//   46   86:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//   47   89:invokevirtual   #175 <Method StringBuilder StringBuilder.append(Object)>
	//   48   92:pop             
		stringbuilder.append("]");
	//   49   93:aload_1         
	//   50   94:ldc2            #653 <String "]">
	//   51   97:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   52  100:pop             
		return stringbuilder.toString();
	//   53  101:aload_1         
	//   54  102:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   55  105:areturn         
	}

	public void trimByVisibility()
	{
		_fields = _trimByVisibility(_fields);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #95  <Field POJOPropertyBuilder$Linked _fields>
	//    4    6:invokespecial   #655 <Method POJOPropertyBuilder$Linked _trimByVisibility(POJOPropertyBuilder$Linked)>
	//    5    9:putfield        #95  <Field POJOPropertyBuilder$Linked _fields>
		_getters = _trimByVisibility(_getters);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #99  <Field POJOPropertyBuilder$Linked _getters>
	//   10   18:invokespecial   #655 <Method POJOPropertyBuilder$Linked _trimByVisibility(POJOPropertyBuilder$Linked)>
	//   11   21:putfield        #99  <Field POJOPropertyBuilder$Linked _getters>
		_setters = _trimByVisibility(_setters);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #101 <Field POJOPropertyBuilder$Linked _setters>
	//   16   30:invokespecial   #655 <Method POJOPropertyBuilder$Linked _trimByVisibility(POJOPropertyBuilder$Linked)>
	//   17   33:putfield        #101 <Field POJOPropertyBuilder$Linked _setters>
		_ctorParameters = _trimByVisibility(_ctorParameters);
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   22   42:invokespecial   #655 <Method POJOPropertyBuilder$Linked _trimByVisibility(POJOPropertyBuilder$Linked)>
	//   23   45:putfield        #97  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   24   48:return          
	}

	public POJOPropertyBuilder withName(PropertyName propertyname)
	{
		return new POJOPropertyBuilder(this, propertyname);
	//    0    0:new             #2   <Class POJOPropertyBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #659 <Method void POJOPropertyBuilder(POJOPropertyBuilder, PropertyName)>
	//    5    9:areturn         
	}

	public POJOPropertyBuilder withSimpleName(String s)
	{
		s = ((String) (_name.withSimpleName(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field PropertyName _name>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #664 <Method PropertyName PropertyName.withSimpleName(String)>
	//    4    8:astore_1        
		if(s == _name)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #89  <Field PropertyName _name>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return new POJOPropertyBuilder(this, ((PropertyName) (s)));
	//   11   19:new             #2   <Class POJOPropertyBuilder>
	//   12   22:dup             
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokespecial   #659 <Method void POJOPropertyBuilder(POJOPropertyBuilder, PropertyName)>
	//   16   28:areturn         
	}

	private static final com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty NOT_REFEFERENCE_PROP = com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty.managed("");
	protected final AnnotationIntrospector _annotationIntrospector;
	protected final MapperConfig _config;
	protected Linked _ctorParameters;
	protected Linked _fields;
	protected final boolean _forSerialization;
	protected Linked _getters;
	protected final PropertyName _internalName;
	protected transient PropertyMetadata _metadata;
	protected final PropertyName _name;
	protected transient com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty _referenceInfo;
	protected Linked _setters;

	static 
	{
	//    0    0:ldc1            #63  <String "">
	//    1    2:invokestatic    #69  <Method com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty.managed(String)>
	//    2    5:putstatic       #71  <Field com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty NOT_REFEFERENCE_PROP>
	//*   3    8:return          
	}
}
