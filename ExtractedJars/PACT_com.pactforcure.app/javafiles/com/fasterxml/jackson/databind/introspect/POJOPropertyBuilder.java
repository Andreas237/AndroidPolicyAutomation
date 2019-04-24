// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
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
			if(next == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field POJOPropertyBuilder$Linked next>
		//*   2    4:ifnonnull       13
				return withNext(linked);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
		//    6   12:areturn         
			else
				return withNext(next.append(linked));
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

		public Linked trimByVisibility()
		{
			Linked linked;
			if(next == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field POJOPropertyBuilder$Linked next>
		//*   2    4:ifnonnull       11
			{
				linked = this;
		//    3    7:aload_0         
		//    4    8:astore_1        
			} else
		//*   5    9:aload_1         
		//*   6   10:areturn         
			{
				Linked linked1 = next.trimByVisibility();
		//    7   11:aload_0         
		//    8   12:getfield        #29  <Field POJOPropertyBuilder$Linked next>
		//    9   15:invokevirtual   #93  <Method POJOPropertyBuilder$Linked trimByVisibility()>
		//   10   18:astore_2        
				if(name != null)
		//*  11   19:aload_0         
		//*  12   20:getfield        #37  <Field PropertyName name>
		//*  13   23:ifnull          45
					if(linked1.name == null)
		//*  14   26:aload_2         
		//*  15   27:getfield        #37  <Field PropertyName name>
		//*  16   30:ifnonnull       39
						return withNext(((Linked) (null)));
		//   17   33:aload_0         
		//   18   34:aconst_null     
		//   19   35:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
		//   20   38:areturn         
					else
						return withNext(linked1);
		//   21   39:aload_0         
		//   22   40:aload_2         
		//   23   41:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
		//   24   44:areturn         
				linked = linked1;
		//   25   45:aload_2         
		//   26   46:astore_1        
				if(linked1.name == null)
		//*  27   47:aload_2         
		//*  28   48:getfield        #37  <Field PropertyName name>
		//*  29   51:ifnonnull       9
				{
					if(isVisible == linked1.isVisible)
		//*  30   54:aload_0         
		//*  31   55:getfield        #51  <Field boolean isVisible>
		//*  32   58:aload_2         
		//*  33   59:getfield        #51  <Field boolean isVisible>
		//*  34   62:icmpne          71
						return withNext(linked1);
		//   35   65:aload_0         
		//   36   66:aload_2         
		//   37   67:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
		//   38   70:areturn         
					linked = linked1;
		//   39   71:aload_2         
		//   40   72:astore_1        
					if(isVisible)
		//*  41   73:aload_0         
		//*  42   74:getfield        #51  <Field boolean isVisible>
		//*  43   77:ifeq            9
						return withNext(((Linked) (null)));
		//   44   80:aload_0         
		//   45   81:aconst_null     
		//   46   82:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
		//   47   85:areturn         
				}
			}
			return linked;
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
		//   19   35:invokespecial   #96  <Method void POJOPropertyBuilder$Linked(Object, POJOPropertyBuilder$Linked, PropertyName, boolean, boolean, boolean)>
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
		//   19   35:invokespecial   #96  <Method void POJOPropertyBuilder$Linked(Object, POJOPropertyBuilder$Linked, PropertyName, boolean, boolean, boolean)>
		//   20   38:areturn         
		}

		public Linked withoutIgnored()
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
				Linked linked = next.withoutIgnored();
		//   15   31:aload_0         
		//   16   32:getfield        #29  <Field POJOPropertyBuilder$Linked next>
		//   17   35:invokevirtual   #102 <Method POJOPropertyBuilder$Linked withoutIgnored()>
		//   18   38:astore_1        
				if(linked != next)
		//*  19   39:aload_1         
		//*  20   40:aload_0         
		//*  21   41:getfield        #29  <Field POJOPropertyBuilder$Linked next>
		//*  22   44:if_acmpeq       53
					return withNext(linked);
		//   23   47:aload_0         
		//   24   48:aload_1         
		//   25   49:invokevirtual   #61  <Method POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)>
		//   26   52:areturn         
			}
			return this;
		//   27   53:aload_0         
		//   28   54:areturn         
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
		//   18   34:invokespecial   #96  <Method void POJOPropertyBuilder$Linked(Object, POJOPropertyBuilder$Linked, PropertyName, boolean, boolean, boolean)>
		//   19   37:areturn         
		}

		public Linked withoutNonVisible()
		{
			Linked linked;
			Linked linked1;
			if(next == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field POJOPropertyBuilder$Linked next>
		//*   2    4:ifnonnull       26
				linked = null;
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
				linked = next.withoutNonVisible();
		//   16   26:aload_0         
		//   17   27:getfield        #29  <Field POJOPropertyBuilder$Linked next>
		//   18   30:invokevirtual   #106 <Method POJOPropertyBuilder$Linked withoutNonVisible()>
		//   19   33:astore_1        
			linked1 = linked;
			if(isVisible)
				linked1 = withNext(linked);
			return linked1;
		//*  20   34:goto            9
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
			if(next == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field POJOPropertyBuilder$Linked next>
		//*   2    4:ifnonnull       15
			{
				throw new NoSuchElementException();
		//    3    7:new             #28  <Class NoSuchElementException>
		//    4   10:dup             
		//    5   11:invokespecial   #29  <Method void NoSuchElementException()>
		//    6   14:athrow          
			} else
			{
				AnnotatedMember annotatedmember = (AnnotatedMember)next.value;
		//    7   15:aload_0         
		//    8   16:getfield        #20  <Field POJOPropertyBuilder$Linked next>
		//    9   19:getfield        #35  <Field Object POJOPropertyBuilder$Linked.value>
		//   10   22:checkcast       #37  <Class AnnotatedMember>
		//   11   25:astore_1        
				next = next.next;
		//   12   26:aload_0         
		//   13   27:aload_0         
		//   14   28:getfield        #20  <Field POJOPropertyBuilder$Linked next>
		//   15   31:getfield        #38  <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
		//   16   34:putfield        #20  <Field POJOPropertyBuilder$Linked next>
				return annotatedmember;
		//   17   37:aload_1         
		//   18   38:areturn         
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
	//    6    8:invokespecial   #59  <Method void POJOPropertyBuilder(MapperConfig, AnnotationIntrospector, boolean, PropertyName, PropertyName)>
	//    7   11:return          
	}

	protected POJOPropertyBuilder(MapperConfig mapperconfig, AnnotationIntrospector annotationintrospector, boolean flag, PropertyName propertyname, PropertyName propertyname1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void BeanPropertyDefinition()>
		_config = mapperconfig;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #67  <Field MapperConfig _config>
		_annotationIntrospector = annotationintrospector;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #69  <Field AnnotationIntrospector _annotationIntrospector>
		_internalName = propertyname;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #71  <Field PropertyName _internalName>
		_name = propertyname1;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #73  <Field PropertyName _name>
		_forSerialization = flag;
	//   14   26:aload_0         
	//   15   27:iload_3         
	//   16   28:putfield        #75  <Field boolean _forSerialization>
	//   17   31:return          
	}

	public POJOPropertyBuilder(POJOPropertyBuilder pojopropertybuilder, PropertyName propertyname)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void BeanPropertyDefinition()>
		_config = pojopropertybuilder._config;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #67  <Field MapperConfig _config>
	//    5    9:putfield        #67  <Field MapperConfig _config>
		_annotationIntrospector = pojopropertybuilder._annotationIntrospector;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #69  <Field AnnotationIntrospector _annotationIntrospector>
	//    9   17:putfield        #69  <Field AnnotationIntrospector _annotationIntrospector>
		_internalName = pojopropertybuilder._internalName;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #71  <Field PropertyName _internalName>
	//   13   25:putfield        #71  <Field PropertyName _internalName>
		_name = propertyname;
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:putfield        #73  <Field PropertyName _name>
		_fields = pojopropertybuilder._fields;
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//   20   38:putfield        #79  <Field POJOPropertyBuilder$Linked _fields>
		_ctorParameters = pojopropertybuilder._ctorParameters;
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   24   46:putfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
		_getters = pojopropertybuilder._getters;
	//   25   49:aload_0         
	//   26   50:aload_1         
	//   27   51:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//   28   54:putfield        #83  <Field POJOPropertyBuilder$Linked _getters>
		_setters = pojopropertybuilder._setters;
	//   29   57:aload_0         
	//   30   58:aload_1         
	//   31   59:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//   32   62:putfield        #85  <Field POJOPropertyBuilder$Linked _setters>
		_forSerialization = pojopropertybuilder._forSerialization;
	//   33   65:aload_0         
	//   34   66:aload_1         
	//   35   67:getfield        #75  <Field boolean _forSerialization>
	//   36   70:putfield        #75  <Field boolean _forSerialization>
	//   37   73:return          
	}

	private boolean _anyExplicitNames(Linked linked)
	{
		for(; linked != null; linked = linked.next)
	//*   0    0:aload_1         
	//*   1    1:ifnull          28
			if(linked.name != null && linked.isNameExplicit)
	//*   2    4:aload_1         
	//*   3    5:getfield        #90  <Field PropertyName POJOPropertyBuilder$Linked.name>
	//*   4    8:ifnull          20
	//*   5   11:aload_1         
	//*   6   12:getfield        #93  <Field boolean POJOPropertyBuilder$Linked.isNameExplicit>
	//*   7   15:ifeq            20
				return true;
	//    8   18:iconst_1        
	//    9   19:ireturn         

	//   10   20:aload_1         
	//   11   21:getfield        #96  <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
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
	//*   3    5:getfield        #90  <Field PropertyName POJOPropertyBuilder$Linked.name>
	//*   4    8:ifnull          23
	//*   5   11:aload_1         
	//*   6   12:getfield        #90  <Field PropertyName POJOPropertyBuilder$Linked.name>
	//*   7   15:invokevirtual   #104 <Method boolean PropertyName.hasSimpleName()>
	//*   8   18:ifeq            23
				return true;
	//    9   21:iconst_1        
	//   10   22:ireturn         

	//   11   23:aload_1         
	//   12   24:getfield        #96  <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
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
	//*   3    5:getfield        #108 <Field boolean POJOPropertyBuilder$Linked.isMarkedIgnored>
	//*   4    8:ifeq            13
				return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         

	//    7   13:aload_1         
	//    8   14:getfield        #96  <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
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
	//*   3    5:getfield        #112 <Field boolean POJOPropertyBuilder$Linked.isVisible>
	//*   4    8:ifeq            13
				return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         

	//    7   13:aload_1         
	//    8   14:getfield        #96  <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
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
	//    1    1:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//    2    4:checkcast       #120 <Class AnnotatedMember>
	//    3    7:aload_2         
	//    4    8:invokevirtual   #124 <Method Annotated AnnotatedMember.withAnnotations(AnnotationMap)>
	//    5   11:checkcast       #120 <Class AnnotatedMember>
	//    6   14:astore          4
		Linked linked1 = linked;
	//    7   16:aload_1         
	//    8   17:astore_3        
		if(linked.next != null)
	//*   9   18:aload_1         
	//*  10   19:getfield        #96  <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//*  11   22:ifnull          39
			linked1 = linked.withNext(_applyAnnotations(linked.next, annotationmap));
	//   12   25:aload_1         
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:getfield        #96  <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//   16   31:aload_2         
	//   17   32:invokespecial   #126 <Method POJOPropertyBuilder$Linked _applyAnnotations(POJOPropertyBuilder$Linked, AnnotationMap)>
	//   18   35:invokevirtual   #130 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.withNext(POJOPropertyBuilder$Linked)>
	//   19   38:astore_3        
		return linked1.withValue(((Object) (annotatedmember)));
	//   20   39:aload_3         
	//   21   40:aload           4
	//   22   42:invokevirtual   #134 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.withValue(Object)>
	//   23   45:areturn         
	}

	private void _explode(Collection collection, Map map, Linked linked)
	{
		Linked linked1 = linked;
	//    0    0:aload_3         
	//    1    1:astore          4
_L2:
		PropertyName propertyname;
		if(linked1 == null)
			break MISSING_BLOCK_LABEL_286;
	//    2    3:aload           4
	//    3    5:ifnull          286
		propertyname = linked1.name;
	//    4    8:aload           4
	//    5   10:getfield        #90  <Field PropertyName POJOPropertyBuilder$Linked.name>
	//    6   13:astore          7
		if(linked1.isNameExplicit && propertyname != null)
			break MISSING_BLOCK_LABEL_95;
	//    7   15:aload           4
	//    8   17:getfield        #93  <Field boolean POJOPropertyBuilder$Linked.isNameExplicit>
	//    9   20:ifeq            28
	//   10   23:aload           7
	//   11   25:ifnonnull       95
		if(linked1.isVisible)
			break; /* Loop/switch isn't completed */
	//   12   28:aload           4
	//   13   30:getfield        #112 <Field boolean POJOPropertyBuilder$Linked.isVisible>
	//   14   33:ifne            46
_L3:
		linked1 = linked1.next;
	//   15   36:aload           4
	//   16   38:getfield        #96  <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//   17   41:astore          4
		if(true) goto _L2; else goto _L1
	//   18   43:goto            3
_L1:
		throw new IllegalStateException((new StringBuilder()).append("Conflicting/ambiguous property name definitions (implicit name '").append(((Object) (_name))).append("'): found multiple explicit names: ").append(((Object) (collection))).append(", but also implicit accessor: ").append(((Object) (linked1))).toString());
	//   19   46:new             #139 <Class IllegalStateException>
	//   20   49:dup             
	//   21   50:new             #141 <Class StringBuilder>
	//   22   53:dup             
	//   23   54:invokespecial   #142 <Method void StringBuilder()>
	//   24   57:ldc1            #144 <String "Conflicting/ambiguous property name definitions (implicit name '">
	//   25   59:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   26   62:aload_0         
	//   27   63:getfield        #73  <Field PropertyName _name>
	//   28   66:invokevirtual   #151 <Method StringBuilder StringBuilder.append(Object)>
	//   29   69:ldc1            #153 <String "'): found multiple explicit names: ">
	//   30   71:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   31   74:aload_1         
	//   32   75:invokevirtual   #151 <Method StringBuilder StringBuilder.append(Object)>
	//   33   78:ldc1            #155 <String ", but also implicit accessor: ">
	//   34   80:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   35   83:aload           4
	//   36   85:invokevirtual   #151 <Method StringBuilder StringBuilder.append(Object)>
	//   37   88:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   38   91:invokespecial   #162 <Method void IllegalStateException(String)>
	//   39   94:athrow          
		POJOPropertyBuilder pojopropertybuilder1 = (POJOPropertyBuilder)map.get(((Object) (propertyname)));
	//   40   95:aload_2         
	//   41   96:aload           7
	//   42   98:invokeinterface #168 <Method Object Map.get(Object)>
	//   43  103:checkcast       #2   <Class POJOPropertyBuilder>
	//   44  106:astore          6
		POJOPropertyBuilder pojopropertybuilder = pojopropertybuilder1;
	//   45  108:aload           6
	//   46  110:astore          5
		if(pojopropertybuilder1 == null)
	//*  47  112:aload           6
	//*  48  114:ifnonnull       155
		{
			pojopropertybuilder = new POJOPropertyBuilder(_config, _annotationIntrospector, _forSerialization, _internalName, propertyname);
	//   49  117:new             #2   <Class POJOPropertyBuilder>
	//   50  120:dup             
	//   51  121:aload_0         
	//   52  122:getfield        #67  <Field MapperConfig _config>
	//   53  125:aload_0         
	//   54  126:getfield        #69  <Field AnnotationIntrospector _annotationIntrospector>
	//   55  129:aload_0         
	//   56  130:getfield        #75  <Field boolean _forSerialization>
	//   57  133:aload_0         
	//   58  134:getfield        #71  <Field PropertyName _internalName>
	//   59  137:aload           7
	//   60  139:invokespecial   #59  <Method void POJOPropertyBuilder(MapperConfig, AnnotationIntrospector, boolean, PropertyName, PropertyName)>
	//   61  142:astore          5
			map.put(((Object) (propertyname)), ((Object) (pojopropertybuilder)));
	//   62  144:aload_2         
	//   63  145:aload           7
	//   64  147:aload           5
	//   65  149:invokeinterface #172 <Method Object Map.put(Object, Object)>
	//   66  154:pop             
		}
		if(linked == _fields)
	//*  67  155:aload_3         
	//*  68  156:aload_0         
	//*  69  157:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//*  70  160:if_acmpne       181
			pojopropertybuilder._fields = linked1.withNext(pojopropertybuilder._fields);
	//   71  163:aload           5
	//   72  165:aload           4
	//   73  167:aload           5
	//   74  169:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//   75  172:invokevirtual   #130 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.withNext(POJOPropertyBuilder$Linked)>
	//   76  175:putfield        #79  <Field POJOPropertyBuilder$Linked _fields>
		else
	//*  77  178:goto            36
		if(linked == _getters)
	//*  78  181:aload_3         
	//*  79  182:aload_0         
	//*  80  183:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//*  81  186:if_acmpne       207
			pojopropertybuilder._getters = linked1.withNext(pojopropertybuilder._getters);
	//   82  189:aload           5
	//   83  191:aload           4
	//   84  193:aload           5
	//   85  195:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//   86  198:invokevirtual   #130 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.withNext(POJOPropertyBuilder$Linked)>
	//   87  201:putfield        #83  <Field POJOPropertyBuilder$Linked _getters>
		else
	//*  88  204:goto            36
		if(linked == _setters)
	//*  89  207:aload_3         
	//*  90  208:aload_0         
	//*  91  209:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//*  92  212:if_acmpne       233
			pojopropertybuilder._setters = linked1.withNext(pojopropertybuilder._setters);
	//   93  215:aload           5
	//   94  217:aload           4
	//   95  219:aload           5
	//   96  221:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//   97  224:invokevirtual   #130 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.withNext(POJOPropertyBuilder$Linked)>
	//   98  227:putfield        #85  <Field POJOPropertyBuilder$Linked _setters>
		else
	//*  99  230:goto            36
		if(linked == _ctorParameters)
	//* 100  233:aload_3         
	//* 101  234:aload_0         
	//* 102  235:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//* 103  238:if_acmpne       259
			pojopropertybuilder._ctorParameters = linked1.withNext(pojopropertybuilder._ctorParameters);
	//  104  241:aload           5
	//  105  243:aload           4
	//  106  245:aload           5
	//  107  247:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//  108  250:invokevirtual   #130 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.withNext(POJOPropertyBuilder$Linked)>
	//  109  253:putfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
		else
	//* 110  256:goto            36
			throw new IllegalStateException((new StringBuilder()).append("Internal error: mismatched accessors, property: ").append(((Object) (this))).toString());
	//  111  259:new             #139 <Class IllegalStateException>
	//  112  262:dup             
	//  113  263:new             #141 <Class StringBuilder>
	//  114  266:dup             
	//  115  267:invokespecial   #142 <Method void StringBuilder()>
	//  116  270:ldc1            #174 <String "Internal error: mismatched accessors, property: ">
	//  117  272:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//  118  275:aload_0         
	//  119  276:invokevirtual   #151 <Method StringBuilder StringBuilder.append(Object)>
	//  120  279:invokevirtual   #159 <Method String StringBuilder.toString()>
	//  121  282:invokespecial   #162 <Method void IllegalStateException(String)>
	//  122  285:athrow          
		  goto _L3
	//  123  286:return          
	}

	private Set _findExplicitNames(Linked linked, Set set)
	{
		Linked linked1 = linked;
	//    0    0:aload_1         
	//    1    1:astore_3        
		while(linked1 != null) 
	//*   2    2:aload_3         
	//*   3    3:ifnull          62
		{
			linked = ((Linked) (set));
	//    4    6:aload_2         
	//    5    7:astore_1        
			if(linked1.isNameExplicit)
	//*   6    8:aload_3         
	//*   7    9:getfield        #93  <Field boolean POJOPropertyBuilder$Linked.isNameExplicit>
	//*   8   12:ifeq            24
				if(linked1.name == null)
	//*   9   15:aload_3         
	//*  10   16:getfield        #90  <Field PropertyName POJOPropertyBuilder$Linked.name>
	//*  11   19:ifnonnull       34
				{
					linked = ((Linked) (set));
	//   12   22:aload_2         
	//   13   23:astore_1        
				} else
	//*  14   24:aload_3         
	//*  15   25:getfield        #96  <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//*  16   28:astore_3        
	//*  17   29:aload_1         
	//*  18   30:astore_2        
	//*  19   31:goto            2
				{
					linked = ((Linked) (set));
	//   20   34:aload_2         
	//   21   35:astore_1        
					if(set == null)
	//*  22   36:aload_2         
	//*  23   37:ifnonnull       48
						linked = ((Linked) (new HashSet()));
	//   24   40:new             #179 <Class HashSet>
	//   25   43:dup             
	//   26   44:invokespecial   #180 <Method void HashSet()>
	//   27   47:astore_1        
					((Set) (linked)).add(((Object) (linked1.name)));
	//   28   48:aload_1         
	//   29   49:aload_3         
	//   30   50:getfield        #90  <Field PropertyName POJOPropertyBuilder$Linked.name>
	//   31   53:invokeinterface #186 <Method boolean Set.add(Object)>
	//   32   58:pop             
				}
			linked1 = linked1.next;
			set = ((Set) (linked));
		}
	//*  33   59:goto            24
		return set;
	//   34   62:aload_2         
	//   35   63:areturn         
	}

	private AnnotationMap _getAllAnnotations(Linked linked)
	{
		AnnotationMap annotationmap1 = ((AnnotatedMember)linked.value).getAllAnnotations();
	//    0    0:aload_1         
	//    1    1:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//    2    4:checkcast       #120 <Class AnnotatedMember>
	//    3    7:invokevirtual   #193 <Method AnnotationMap AnnotatedMember.getAllAnnotations()>
	//    4   10:astore_3        
		AnnotationMap annotationmap = annotationmap1;
	//    5   11:aload_3         
	//    6   12:astore_2        
		if(linked.next != null)
	//*   7   13:aload_1         
	//*   8   14:getfield        #96  <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//*   9   17:ifnull          33
			annotationmap = AnnotationMap.merge(annotationmap1, _getAllAnnotations(linked.next));
	//   10   20:aload_3         
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:getfield        #96  <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//   14   26:invokespecial   #195 <Method AnnotationMap _getAllAnnotations(POJOPropertyBuilder$Linked)>
	//   15   29:invokestatic    #201 <Method AnnotationMap AnnotationMap.merge(AnnotationMap, AnnotationMap)>
	//   16   32:astore_2        
		return annotationmap;
	//   17   33:aload_2         
	//   18   34:areturn         
	}

	private transient AnnotationMap _mergeAnnotations(int i, Linked alinked[])
	{
		AnnotationMap annotationmap1 = _getAllAnnotations(alinked[i]);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:iload_1         
	//    3    3:aaload          
	//    4    4:invokespecial   #195 <Method AnnotationMap _getAllAnnotations(POJOPropertyBuilder$Linked)>
	//    5    7:astore          5
		AnnotationMap annotationmap;
		do
		{
			int j = i + 1;
	//    6    9:iload_1         
	//    7   10:iconst_1        
	//    8   11:iadd            
	//    9   12:istore_3        
			annotationmap = annotationmap1;
	//   10   13:aload           5
	//   11   15:astore          4
			if(j >= alinked.length)
				break;
	//   12   17:iload_3         
	//   13   18:aload_2         
	//   14   19:arraylength     
	//   15   20:icmpge          44
			i = j;
	//   16   23:iload_3         
	//   17   24:istore_1        
			if(alinked[j] == null)
				continue;
	//   18   25:aload_2         
	//   19   26:iload_3         
	//   20   27:aaload          
	//   21   28:ifnull          9
			annotationmap = AnnotationMap.merge(annotationmap1, _mergeAnnotations(j, alinked));
	//   22   31:aload           5
	//   23   33:aload_0         
	//   24   34:iload_3         
	//   25   35:aload_2         
	//   26   36:invokespecial   #206 <Method AnnotationMap _mergeAnnotations(int, POJOPropertyBuilder$Linked[])>
	//   27   39:invokestatic    #201 <Method AnnotationMap AnnotationMap.merge(AnnotationMap, AnnotationMap)>
	//   28   42:astore          4
			break;
		} while(true);
		return annotationmap;
	//   29   44:aload           4
	//   30   46:areturn         
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
	//    5    7:invokevirtual   #212 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.withoutIgnored()>
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
	//    5    7:invokevirtual   #217 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.withoutNonVisible()>
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
	//    5    7:invokevirtual   #221 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.trimByVisibility()>
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
	//   10   14:invokevirtual   #224 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.append(POJOPropertyBuilder$Linked)>
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
	//    4    6:invokespecial   #229 <Method void POJOPropertyBuilder$7(POJOPropertyBuilder)>
	//    5    9:invokevirtual   #233 <Method Object fromMemberAnnotations(POJOPropertyBuilder$WithMember)>
	//    6   12:checkcast       #235 <Class String>
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
	//    4    6:invokespecial   #237 <Method void POJOPropertyBuilder$5(POJOPropertyBuilder)>
	//    5    9:invokevirtual   #233 <Method Object fromMemberAnnotations(POJOPropertyBuilder$WithMember)>
	//    6   12:checkcast       #235 <Class String>
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
	//    4    6:invokespecial   #240 <Method void POJOPropertyBuilder$6(POJOPropertyBuilder)>
	//    5    9:invokevirtual   #233 <Method Object fromMemberAnnotations(POJOPropertyBuilder$WithMember)>
	//    6   12:checkcast       #242 <Class Integer>
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
	//    4    6:invokespecial   #245 <Method void POJOPropertyBuilder$4(POJOPropertyBuilder)>
	//    5    9:invokevirtual   #233 <Method Object fromMemberAnnotations(POJOPropertyBuilder$WithMember)>
	//    6   12:checkcast       #247 <Class Boolean>
	//    7   15:areturn         
	}

	protected int _getterPriority(AnnotatedMethod annotatedmethod)
	{
		byte byte0 = 2;
	//    0    0:iconst_2        
	//    1    1:istore_2        
		annotatedmethod = ((AnnotatedMethod) (annotatedmethod.getName()));
	//    2    2:aload_1         
	//    3    3:invokevirtual   #254 <Method String AnnotatedMethod.getName()>
	//    4    6:astore_1        
		if(((String) (annotatedmethod)).startsWith("get") && ((String) (annotatedmethod)).length() > 3)
	//*   5    7:aload_1         
	//*   6    8:ldc1            #255 <String "get">
	//*   7   10:invokevirtual   #259 <Method boolean String.startsWith(String)>
	//*   8   13:ifeq            28
	//*   9   16:aload_1         
	//*  10   17:invokevirtual   #263 <Method int String.length()>
	//*  11   20:iconst_3        
	//*  12   21:icmple          28
			byte0 = 1;
	//   13   24:iconst_1        
	//   14   25:istore_2        
		else
	//*  15   26:iload_2         
	//*  16   27:ireturn         
		if(!((String) (annotatedmethod)).startsWith("is") || ((String) (annotatedmethod)).length() <= 2)
	//*  17   28:aload_1         
	//*  18   29:ldc2            #265 <String "is">
	//*  19   32:invokevirtual   #259 <Method boolean String.startsWith(String)>
	//*  20   35:ifeq            46
	//*  21   38:aload_1         
	//*  22   39:invokevirtual   #263 <Method int String.length()>
	//*  23   42:iconst_2        
	//*  24   43:icmpgt          26
			return 3;
	//   25   46:iconst_3        
	//   26   47:ireturn         
		return ((int) (byte0));
	}

	protected int _setterPriority(AnnotatedMethod annotatedmethod)
	{
		annotatedmethod = ((AnnotatedMethod) (annotatedmethod.getName()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #254 <Method String AnnotatedMethod.getName()>
	//    2    4:astore_1        
		return !((String) (annotatedmethod)).startsWith("set") || ((String) (annotatedmethod)).length() <= 3 ? 2 : 1;
	//    3    5:aload_1         
	//    4    6:ldc2            #268 <String "set">
	//    5    9:invokevirtual   #259 <Method boolean String.startsWith(String)>
	//    6   12:ifeq            25
	//    7   15:aload_1         
	//    8   16:invokevirtual   #263 <Method int String.length()>
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
	//    2    2:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//    3    5:aload_1         
	//    4    6:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//    5    9:invokestatic    #271 <Method POJOPropertyBuilder$Linked merge(POJOPropertyBuilder$Linked, POJOPropertyBuilder$Linked)>
	//    6   12:putfield        #79  <Field POJOPropertyBuilder$Linked _fields>
		_ctorParameters = merge(_ctorParameters, pojopropertybuilder._ctorParameters);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   10   20:aload_1         
	//   11   21:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   12   24:invokestatic    #271 <Method POJOPropertyBuilder$Linked merge(POJOPropertyBuilder$Linked, POJOPropertyBuilder$Linked)>
	//   13   27:putfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
		_getters = merge(_getters, pojopropertybuilder._getters);
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//   17   35:aload_1         
	//   18   36:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//   19   39:invokestatic    #271 <Method POJOPropertyBuilder$Linked merge(POJOPropertyBuilder$Linked, POJOPropertyBuilder$Linked)>
	//   20   42:putfield        #83  <Field POJOPropertyBuilder$Linked _getters>
		_setters = merge(_setters, pojopropertybuilder._setters);
	//   21   45:aload_0         
	//   22   46:aload_0         
	//   23   47:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//   24   50:aload_1         
	//   25   51:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//   26   54:invokestatic    #271 <Method POJOPropertyBuilder$Linked merge(POJOPropertyBuilder$Linked, POJOPropertyBuilder$Linked)>
	//   27   57:putfield        #85  <Field POJOPropertyBuilder$Linked _setters>
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
	//    5    7:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//    6   10:aload_2         
	//    7   11:iload_3         
	//    8   12:iload           4
	//    9   14:iload           5
	//   10   16:invokespecial   #276 <Method void POJOPropertyBuilder$Linked(Object, POJOPropertyBuilder$Linked, PropertyName, boolean, boolean, boolean)>
	//   11   19:putfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
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
	//    5    7:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//    6   10:aload_2         
	//    7   11:iload_3         
	//    8   12:iload           4
	//    9   14:iload           5
	//   10   16:invokespecial   #276 <Method void POJOPropertyBuilder$Linked(Object, POJOPropertyBuilder$Linked, PropertyName, boolean, boolean, boolean)>
	//   11   19:putfield        #79  <Field POJOPropertyBuilder$Linked _fields>
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
	//    5    7:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//    6   10:aload_2         
	//    7   11:iload_3         
	//    8   12:iload           4
	//    9   14:iload           5
	//   10   16:invokespecial   #276 <Method void POJOPropertyBuilder$Linked(Object, POJOPropertyBuilder$Linked, PropertyName, boolean, boolean, boolean)>
	//   11   19:putfield        #83  <Field POJOPropertyBuilder$Linked _getters>
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
	//    5    7:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//    6   10:aload_2         
	//    7   11:iload_3         
	//    8   12:iload           4
	//    9   14:iload           5
	//   10   16:invokespecial   #276 <Method void POJOPropertyBuilder$Linked(Object, POJOPropertyBuilder$Linked, PropertyName, boolean, boolean, boolean)>
	//   11   19:putfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//   12   22:return          
	}

	public boolean anyIgnorals()
	{
		return _anyIgnorals(_fields) || _anyIgnorals(_getters) || _anyIgnorals(_setters) || _anyIgnorals(_ctorParameters);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//    3    5:invokespecial   #284 <Method boolean _anyIgnorals(POJOPropertyBuilder$Linked)>
	//    4    8:ifne            44
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//    8   16:invokespecial   #284 <Method boolean _anyIgnorals(POJOPropertyBuilder$Linked)>
	//    9   19:ifne            44
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//   13   27:invokespecial   #284 <Method boolean _anyIgnorals(POJOPropertyBuilder$Linked)>
	//   14   30:ifne            44
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   18   38:invokespecial   #284 <Method boolean _anyIgnorals(POJOPropertyBuilder$Linked)>
	//   19   41:ifeq            46
	//   20   44:iconst_1        
	//   21   45:ireturn         
	//   22   46:iconst_0        
	//   23   47:ireturn         
	}

	public boolean anyVisible()
	{
		return _anyVisible(_fields) || _anyVisible(_getters) || _anyVisible(_setters) || _anyVisible(_ctorParameters);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//    3    5:invokespecial   #287 <Method boolean _anyVisible(POJOPropertyBuilder$Linked)>
	//    4    8:ifne            44
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//    8   16:invokespecial   #287 <Method boolean _anyVisible(POJOPropertyBuilder$Linked)>
	//    9   19:ifne            44
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//   13   27:invokespecial   #287 <Method boolean _anyVisible(POJOPropertyBuilder$Linked)>
	//   14   30:ifne            44
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   18   38:invokespecial   #287 <Method boolean _anyVisible(POJOPropertyBuilder$Linked)>
	//   19   41:ifeq            46
	//   20   44:iconst_1        
	//   21   45:ireturn         
	//   22   46:iconst_0        
	//   23   47:ireturn         
	}

	public int compareTo(POJOPropertyBuilder pojopropertybuilder)
	{
		if(_ctorParameters != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//*   2    4:ifnull          16
		{
			if(pojopropertybuilder._ctorParameters == null)
	//*   3    7:aload_1         
	//*   4    8:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//*   5   11:ifnonnull       25
				return -1;
	//    6   14:iconst_m1       
	//    7   15:ireturn         
		} else
		if(pojopropertybuilder._ctorParameters != null)
	//*   8   16:aload_1         
	//*   9   17:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//*  10   20:ifnull          25
			return 1;
	//   11   23:iconst_1        
	//   12   24:ireturn         
		return getName().compareTo(pojopropertybuilder.getName());
	//   13   25:aload_0         
	//   14   26:invokevirtual   #290 <Method String getName()>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #290 <Method String getName()>
	//   17   33:invokevirtual   #293 <Method int String.compareTo(String)>
	//   18   36:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((POJOPropertyBuilder)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class POJOPropertyBuilder>
	//    3    5:invokevirtual   #296 <Method int compareTo(POJOPropertyBuilder)>
	//    4    8:ireturn         
	}

	public boolean couldDeserialize()
	{
		return _ctorParameters != null || _setters != null || _fields != null;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//    2    4:ifnonnull       21
	//    3    7:aload_0         
	//    4    8:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//    5   11:ifnonnull       21
	//    6   14:aload_0         
	//    7   15:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//    8   18:ifnull          23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public boolean couldSerialize()
	{
		return _getters != null || _fields != null;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//    2    4:ifnonnull       14
	//    3    7:aload_0         
	//    4    8:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//    5   11:ifnull          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public Collection explode(Collection collection)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #302 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #303 <Method void HashMap()>
	//    3    7:astore_2        
		_explode(collection, ((Map) (hashmap)), _fields);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_0         
	//    8   12:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//    9   15:invokespecial   #305 <Method void _explode(Collection, Map, POJOPropertyBuilder$Linked)>
		_explode(collection, ((Map) (hashmap)), _getters);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aload_0         
	//   14   22:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//   15   25:invokespecial   #305 <Method void _explode(Collection, Map, POJOPropertyBuilder$Linked)>
		_explode(collection, ((Map) (hashmap)), _setters);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:aload_2         
	//   19   31:aload_0         
	//   20   32:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//   21   35:invokespecial   #305 <Method void _explode(Collection, Map, POJOPropertyBuilder$Linked)>
		_explode(collection, ((Map) (hashmap)), _ctorParameters);
	//   22   38:aload_0         
	//   23   39:aload_1         
	//   24   40:aload_2         
	//   25   41:aload_0         
	//   26   42:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   27   45:invokespecial   #305 <Method void _explode(Collection, Map, POJOPropertyBuilder$Linked)>
		return hashmap.values();
	//   28   48:aload_2         
	//   29   49:invokevirtual   #309 <Method Collection HashMap.values()>
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
	//    4    6:invokespecial   #313 <Method void POJOPropertyBuilder$9(POJOPropertyBuilder)>
	//    5    9:getstatic       #319 <Field com.fasterxml.jackson.annotation.JsonProperty$Access com.fasterxml.jackson.annotation.JsonProperty$Access.AUTO>
	//    6   12:invokevirtual   #323 <Method Object fromMemberAnnotationsExcept(POJOPropertyBuilder$WithMember, Object)>
	//    7   15:checkcast       #315 <Class com.fasterxml.jackson.annotation.JsonProperty$Access>
	//    8   18:areturn         
	}

	public Set findExplicitNames()
	{
		Set set = _findExplicitNames(_fields, ((Set) (null)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//    3    5:aconst_null     
	//    4    6:invokespecial   #327 <Method Set _findExplicitNames(POJOPropertyBuilder$Linked, Set)>
	//    5    9:astore_1        
		set = _findExplicitNames(_getters, set);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//    9   15:aload_1         
	//   10   16:invokespecial   #327 <Method Set _findExplicitNames(POJOPropertyBuilder$Linked, Set)>
	//   11   19:astore_1        
		set = _findExplicitNames(_setters, set);
	//   12   20:aload_0         
	//   13   21:aload_0         
	//   14   22:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//   15   25:aload_1         
	//   16   26:invokespecial   #327 <Method Set _findExplicitNames(POJOPropertyBuilder$Linked, Set)>
	//   17   29:astore_1        
		Set set1 = _findExplicitNames(_ctorParameters, set);
	//   18   30:aload_0         
	//   19   31:aload_0         
	//   20   32:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   21   35:aload_1         
	//   22   36:invokespecial   #327 <Method Set _findExplicitNames(POJOPropertyBuilder$Linked, Set)>
	//   23   39:astore_2        
		set = set1;
	//   24   40:aload_2         
	//   25   41:astore_1        
		if(set1 == null)
	//*  26   42:aload_2         
	//*  27   43:ifnonnull       50
			set = Collections.emptySet();
	//   28   46:invokestatic    #332 <Method Set Collections.emptySet()>
	//   29   49:astore_1        
		return set;
	//   30   50:aload_1         
	//   31   51:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Value findInclusion()
	{
		if(_annotationIntrospector != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field AnnotationIntrospector _annotationIntrospector>
	//*   2    4:ifnull          27
		{
			Object obj = ((Object) (getAccessor()));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #339 <Method AnnotatedMember getAccessor()>
	//    5   11:astore_1        
			obj = ((Object) (_annotationIntrospector.findPropertyInclusion(((Annotated) (obj)))));
	//    6   12:aload_0         
	//    7   13:getfield        #69  <Field AnnotationIntrospector _annotationIntrospector>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #345 <Method com.fasterxml.jackson.annotation.JsonInclude$Value AnnotationIntrospector.findPropertyInclusion(Annotated)>
	//   10   20:astore_1        
			if(obj != null)
	//*  11   21:aload_1         
	//*  12   22:ifnull          27
				return ((com.fasterxml.jackson.annotation.JsonInclude.Value) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		}
		return com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
	//   15   27:invokestatic    #350 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.empty()>
	//   16   30:areturn         
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
	//    4    6:invokespecial   #353 <Method void POJOPropertyBuilder$8(POJOPropertyBuilder)>
	//    5    9:invokevirtual   #233 <Method Object fromMemberAnnotations(POJOPropertyBuilder$WithMember)>
	//    6   12:checkcast       #355 <Class ObjectIdInfo>
	//    7   15:areturn         
	}

	public com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty findReferenceType()
	{
		return (com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty)fromMemberAnnotations(new WithMember() {

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
	//    0    0:aload_0         
	//    1    1:new             #13  <Class POJOPropertyBuilder$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #358 <Method void POJOPropertyBuilder$2(POJOPropertyBuilder)>
	//    5    9:invokevirtual   #233 <Method Object fromMemberAnnotations(POJOPropertyBuilder$WithMember)>
	//    6   12:checkcast       #360 <Class com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty>
	//    7   15:areturn         
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
	//    4    6:invokespecial   #363 <Method void POJOPropertyBuilder$1(POJOPropertyBuilder)>
	//    5    9:invokevirtual   #233 <Method Object fromMemberAnnotations(POJOPropertyBuilder$WithMember)>
	//    6   12:checkcast       #365 <Class Class[]>
	//    7   15:areturn         
	}

	protected Object fromMemberAnnotations(WithMember withmember)
	{
		Object obj;
		Object obj1;
		Object obj3;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		obj3 = null;
	//    2    2:aconst_null     
	//    3    3:astore          4
		obj = null;
	//    4    5:aconst_null     
	//    5    6:astore_2        
		if(_annotationIntrospector == null) goto _L2; else goto _L1
	//    6    7:aload_0         
	//    7    8:getfield        #69  <Field AnnotationIntrospector _annotationIntrospector>
	//    8   11:ifnull          77
_L1:
		if(!_forSerialization) goto _L4; else goto _L3
	//    9   14:aload_0         
	//   10   15:getfield        #75  <Field boolean _forSerialization>
	//   11   18:ifeq            79
_L3:
		if(_getters != null)
	//*  12   21:aload_0         
	//*  13   22:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//*  14   25:ifnull          45
			obj = withmember.withMember((AnnotatedMember)_getters.value);
	//   15   28:aload_1         
	//   16   29:aload_0         
	//   17   30:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//   18   33:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   19   36:checkcast       #120 <Class AnnotatedMember>
	//   20   39:invokeinterface #370 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//   21   44:astore_2        
_L6:
		obj1 = obj;
	//   22   45:aload_2         
	//   23   46:astore_3        
		if(obj == null)
	//*  24   47:aload_2         
	//*  25   48:ifnonnull       77
		{
			obj1 = obj;
	//   26   51:aload_2         
	//   27   52:astore_3        
			if(_fields != null)
	//*  28   53:aload_0         
	//*  29   54:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//*  30   57:ifnull          77
				obj1 = withmember.withMember((AnnotatedMember)_fields.value);
	//   31   60:aload_1         
	//   32   61:aload_0         
	//   33   62:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//   34   65:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   35   68:checkcast       #120 <Class AnnotatedMember>
	//   36   71:invokeinterface #370 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//   37   76:astore_3        
		}
_L2:
		return obj1;
	//   38   77:aload_3         
	//   39   78:areturn         
_L4:
		Object obj2 = ((Object) (obj3));
	//   40   79:aload           4
	//   41   81:astore_3        
		if(_ctorParameters != null)
	//*  42   82:aload_0         
	//*  43   83:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//*  44   86:ifnull          106
			obj2 = withmember.withMember((AnnotatedMember)_ctorParameters.value);
	//   45   89:aload_1         
	//   46   90:aload_0         
	//   47   91:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   48   94:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   49   97:checkcast       #120 <Class AnnotatedMember>
	//   50  100:invokeinterface #370 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//   51  105:astore_3        
		obj = obj2;
	//   52  106:aload_3         
	//   53  107:astore_2        
		if(obj2 == null)
	//*  54  108:aload_3         
	//*  55  109:ifnonnull       45
		{
			obj = obj2;
	//   56  112:aload_3         
	//   57  113:astore_2        
			if(_setters != null)
	//*  58  114:aload_0         
	//*  59  115:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//*  60  118:ifnull          45
				obj = withmember.withMember((AnnotatedMember)_setters.value);
	//   61  121:aload_1         
	//   62  122:aload_0         
	//   63  123:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//   64  126:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   65  129:checkcast       #120 <Class AnnotatedMember>
	//   66  132:invokeinterface #370 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//   67  137:astore_2        
		}
		if(true) goto _L6; else goto _L5
	//   68  138:goto            45
_L5:
	}

	protected Object fromMemberAnnotationsExcept(WithMember withmember, Object obj)
	{
		if(_annotationIntrospector != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:ifnonnull       11
_L1:
		Object obj1 = null;
	//    3    7:aconst_null     
	//    4    8:astore_3        
_L4:
		return obj1;
	//    5    9:aload_3         
	//    6   10:areturn         
_L2:
		Object obj2;
		if(!_forSerialization)
			break MISSING_BLOCK_LABEL_172;
	//    7   11:aload_0         
	//    8   12:getfield        #75  <Field boolean _forSerialization>
	//    9   15:ifeq            172
		if(_getters == null)
			break; /* Loop/switch isn't completed */
	//   10   18:aload_0         
	//   11   19:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//   12   22:ifnull          57
		obj2 = withmember.withMember((AnnotatedMember)_getters.value);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//   16   30:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   17   33:checkcast       #120 <Class AnnotatedMember>
	//   18   36:invokeinterface #370 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//   19   41:astore          4
		if(obj2 == null)
			break; /* Loop/switch isn't completed */
	//   20   43:aload           4
	//   21   45:ifnull          57
		obj1 = obj2;
	//   22   48:aload           4
	//   23   50:astore_3        
		if(obj2 != obj) goto _L4; else goto _L3
	//   24   51:aload           4
	//   25   53:aload_2         
	//   26   54:if_acmpne       9
_L3:
		if(_fields == null)
			break; /* Loop/switch isn't completed */
	//   27   57:aload_0         
	//   28   58:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//   29   61:ifnull          96
		obj2 = withmember.withMember((AnnotatedMember)_fields.value);
	//   30   64:aload_1         
	//   31   65:aload_0         
	//   32   66:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//   33   69:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   34   72:checkcast       #120 <Class AnnotatedMember>
	//   35   75:invokeinterface #370 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//   36   80:astore          4
		if(obj2 == null)
			break; /* Loop/switch isn't completed */
	//   37   82:aload           4
	//   38   84:ifnull          96
		obj1 = obj2;
	//   39   87:aload           4
	//   40   89:astore_3        
		if(obj2 != obj) goto _L4; else goto _L5
	//   41   90:aload           4
	//   42   92:aload_2         
	//   43   93:if_acmpne       9
_L5:
		if(_ctorParameters == null)
			break; /* Loop/switch isn't completed */
	//   44   96:aload_0         
	//   45   97:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   46  100:ifnull          135
		obj2 = withmember.withMember((AnnotatedMember)_ctorParameters.value);
	//   47  103:aload_1         
	//   48  104:aload_0         
	//   49  105:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   50  108:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   51  111:checkcast       #120 <Class AnnotatedMember>
	//   52  114:invokeinterface #370 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//   53  119:astore          4
		if(obj2 == null)
			break; /* Loop/switch isn't completed */
	//   54  121:aload           4
	//   55  123:ifnull          135
		obj1 = obj2;
	//   56  126:aload           4
	//   57  128:astore_3        
		if(obj2 != obj) goto _L4; else goto _L6
	//   58  129:aload           4
	//   59  131:aload_2         
	//   60  132:if_acmpne       9
_L6:
		if(_setters == null)
			break; /* Loop/switch isn't completed */
	//   61  135:aload_0         
	//   62  136:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//   63  139:ifnull          170
		withmember = ((WithMember) (withmember.withMember((AnnotatedMember)_setters.value)));
	//   64  142:aload_1         
	//   65  143:aload_0         
	//   66  144:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//   67  147:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   68  150:checkcast       #120 <Class AnnotatedMember>
	//   69  153:invokeinterface #370 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//   70  158:astore_1        
		if(withmember == null)
			break; /* Loop/switch isn't completed */
	//   71  159:aload_1         
	//   72  160:ifnull          170
		obj1 = ((Object) (withmember));
	//   73  163:aload_1         
	//   74  164:astore_3        
		if(withmember != obj) goto _L4; else goto _L7
	//   75  165:aload_1         
	//   76  166:aload_2         
	//   77  167:if_acmpne       9
_L7:
		return ((Object) (null));
	//   78  170:aconst_null     
	//   79  171:areturn         
		if(_ctorParameters == null)
			break; /* Loop/switch isn't completed */
	//   80  172:aload_0         
	//   81  173:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   82  176:ifnull          211
		obj2 = withmember.withMember((AnnotatedMember)_ctorParameters.value);
	//   83  179:aload_1         
	//   84  180:aload_0         
	//   85  181:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   86  184:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   87  187:checkcast       #120 <Class AnnotatedMember>
	//   88  190:invokeinterface #370 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//   89  195:astore          4
		if(obj2 == null)
			break; /* Loop/switch isn't completed */
	//   90  197:aload           4
	//   91  199:ifnull          211
		obj1 = obj2;
	//   92  202:aload           4
	//   93  204:astore_3        
		if(obj2 != obj) goto _L4; else goto _L8
	//   94  205:aload           4
	//   95  207:aload_2         
	//   96  208:if_acmpne       9
_L8:
		if(_setters == null)
			break; /* Loop/switch isn't completed */
	//   97  211:aload_0         
	//   98  212:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//   99  215:ifnull          250
		obj2 = withmember.withMember((AnnotatedMember)_setters.value);
	//  100  218:aload_1         
	//  101  219:aload_0         
	//  102  220:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//  103  223:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//  104  226:checkcast       #120 <Class AnnotatedMember>
	//  105  229:invokeinterface #370 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//  106  234:astore          4
		if(obj2 == null)
			break; /* Loop/switch isn't completed */
	//  107  236:aload           4
	//  108  238:ifnull          250
		obj1 = obj2;
	//  109  241:aload           4
	//  110  243:astore_3        
		if(obj2 != obj) goto _L4; else goto _L9
	//  111  244:aload           4
	//  112  246:aload_2         
	//  113  247:if_acmpne       9
_L9:
		if(_fields == null)
			break; /* Loop/switch isn't completed */
	//  114  250:aload_0         
	//  115  251:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//  116  254:ifnull          289
		obj2 = withmember.withMember((AnnotatedMember)_fields.value);
	//  117  257:aload_1         
	//  118  258:aload_0         
	//  119  259:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//  120  262:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//  121  265:checkcast       #120 <Class AnnotatedMember>
	//  122  268:invokeinterface #370 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//  123  273:astore          4
		if(obj2 == null)
			break; /* Loop/switch isn't completed */
	//  124  275:aload           4
	//  125  277:ifnull          289
		obj1 = obj2;
	//  126  280:aload           4
	//  127  282:astore_3        
		if(obj2 != obj) goto _L4; else goto _L10
	//  128  283:aload           4
	//  129  285:aload_2         
	//  130  286:if_acmpne       9
_L10:
		if(_getters == null)
			break; /* Loop/switch isn't completed */
	//  131  289:aload_0         
	//  132  290:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//  133  293:ifnull          324
		withmember = ((WithMember) (withmember.withMember((AnnotatedMember)_getters.value)));
	//  134  296:aload_1         
	//  135  297:aload_0         
	//  136  298:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//  137  301:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//  138  304:checkcast       #120 <Class AnnotatedMember>
	//  139  307:invokeinterface #370 <Method Object POJOPropertyBuilder$WithMember.withMember(AnnotatedMember)>
	//  140  312:astore_1        
		if(withmember == null)
			break; /* Loop/switch isn't completed */
	//  141  313:aload_1         
	//  142  314:ifnull          324
		obj1 = ((Object) (withmember));
	//  143  317:aload_1         
	//  144  318:astore_3        
		if(withmember != obj) goto _L4; else goto _L11
	//  145  319:aload_1         
	//  146  320:aload_2         
	//  147  321:if_acmpne       9
_L11:
		return ((Object) (null));
	//  148  324:aconst_null     
	//  149  325:areturn         
	}

	public AnnotatedMember getAccessor()
	{
		AnnotatedMethod annotatedmethod = getGetter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #376 <Method AnnotatedMethod getGetter()>
	//    2    4:astore_2        
		Object obj = ((Object) (annotatedmethod));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(annotatedmethod == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       16
			obj = ((Object) (getField()));
	//    7   11:aload_0         
	//    8   12:invokevirtual   #380 <Method AnnotatedField getField()>
	//    9   15:astore_1        
		return ((AnnotatedMember) (obj));
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	public AnnotatedParameter getConstructorParameter()
	{
		if(_ctorParameters == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		Linked linked = _ctorParameters;
	//    5    9:aload_0         
	//    6   10:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//    7   13:astore_1        
		Linked linked1;
		do
		{
			if(((AnnotatedParameter)linked.value).getOwner() instanceof AnnotatedConstructor)
	//*   8   14:aload_1         
	//*   9   15:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//*  10   18:checkcast       #384 <Class AnnotatedParameter>
	//*  11   21:invokevirtual   #388 <Method AnnotatedWithParams AnnotatedParameter.getOwner()>
	//*  12   24:instanceof      #390 <Class AnnotatedConstructor>
	//*  13   27:ifeq            38
				return (AnnotatedParameter)linked.value;
	//   14   30:aload_1         
	//   15   31:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   16   34:checkcast       #384 <Class AnnotatedParameter>
	//   17   37:areturn         
			linked1 = linked.next;
	//   18   38:aload_1         
	//   19   39:getfield        #96  <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//   20   42:astore_2        
			linked = linked1;
	//   21   43:aload_2         
	//   22   44:astore_1        
		} while(linked1 != null);
	//   23   45:aload_2         
	//   24   46:ifnonnull       14
		return (AnnotatedParameter)_ctorParameters.value;
	//   25   49:aload_0         
	//   26   50:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   27   53:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   28   56:checkcast       #384 <Class AnnotatedParameter>
	//   29   59:areturn         
	}

	public Iterator getConstructorParameters()
	{
		if(_ctorParameters == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//*   2    4:ifnonnull       11
			return ClassUtil.emptyIterator();
	//    3    7:invokestatic    #397 <Method Iterator ClassUtil.emptyIterator()>
	//    4   10:areturn         
		else
			return ((Iterator) (new MemberIterator(_ctorParameters)));
	//    5   11:new             #32  <Class POJOPropertyBuilder$MemberIterator>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//    9   19:invokespecial   #400 <Method void POJOPropertyBuilder$MemberIterator(POJOPropertyBuilder$Linked)>
	//   10   22:areturn         
	}

	public AnnotatedField getField()
	{
		if(_fields != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//    2    4:ifnonnull       11
_L1:
		AnnotatedField annotatedfield1 = null;
	//    3    7:aconst_null     
	//    4    8:astore_3        
_L4:
		return annotatedfield1;
	//    5    9:aload_3         
	//    6   10:areturn         
_L2:
		AnnotatedField annotatedfield;
		Linked linked;
		annotatedfield = (AnnotatedField)_fields.value;
	//    7   11:aload_0         
	//    8   12:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//    9   15:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   10   18:checkcast       #403 <Class AnnotatedField>
	//   11   21:astore_1        
		linked = _fields.next;
	//   12   22:aload_0         
	//   13   23:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//   14   26:getfield        #96  <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//   15   29:astore_2        
_L9:
		annotatedfield1 = annotatedfield;
	//   16   30:aload_1         
	//   17   31:astore_3        
		if(linked == null) goto _L4; else goto _L3
	//   18   32:aload_2         
	//   19   33:ifnull          9
_L3:
		AnnotatedField annotatedfield2;
		Class class1;
		Class class2;
		annotatedfield2 = (AnnotatedField)linked.value;
	//   20   36:aload_2         
	//   21   37:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   22   40:checkcast       #403 <Class AnnotatedField>
	//   23   43:astore          4
		class1 = annotatedfield.getDeclaringClass();
	//   24   45:aload_1         
	//   25   46:invokevirtual   #407 <Method Class AnnotatedField.getDeclaringClass()>
	//   26   49:astore          5
		class2 = annotatedfield2.getDeclaringClass();
	//   27   51:aload           4
	//   28   53:invokevirtual   #407 <Method Class AnnotatedField.getDeclaringClass()>
	//   29   56:astore          6
		if(class1 == class2) goto _L6; else goto _L5
	//   30   58:aload           5
	//   31   60:aload           6
	//   32   62:if_acmpeq       100
_L5:
		if(!class1.isAssignableFrom(class2)) goto _L8; else goto _L7
	//   33   65:aload           5
	//   34   67:aload           6
	//   35   69:invokevirtual   #413 <Method boolean Class.isAssignableFrom(Class)>
	//   36   72:ifeq            88
_L7:
		annotatedfield1 = annotatedfield2;
	//   37   75:aload           4
	//   38   77:astore_3        
_L10:
		linked = linked.next;
	//   39   78:aload_2         
	//   40   79:getfield        #96  <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//   41   82:astore_2        
		annotatedfield = annotatedfield1;
	//   42   83:aload_3         
	//   43   84:astore_1        
		  goto _L9
	//*  44   85:goto            30
_L8:
		annotatedfield1 = annotatedfield;
	//   45   88:aload_1         
	//   46   89:astore_3        
		if(class2.isAssignableFrom(class1)) goto _L10; else goto _L6
	//   47   90:aload           6
	//   48   92:aload           5
	//   49   94:invokevirtual   #413 <Method boolean Class.isAssignableFrom(Class)>
	//   50   97:ifne            78
_L6:
		throw new IllegalArgumentException((new StringBuilder()).append("Multiple fields representing property \"").append(getName()).append("\": ").append(annotatedfield.getFullName()).append(" vs ").append(annotatedfield2.getFullName()).toString());
	//   51  100:new             #415 <Class IllegalArgumentException>
	//   52  103:dup             
	//   53  104:new             #141 <Class StringBuilder>
	//   54  107:dup             
	//   55  108:invokespecial   #142 <Method void StringBuilder()>
	//   56  111:ldc2            #417 <String "Multiple fields representing property \"">
	//   57  114:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   58  117:aload_0         
	//   59  118:invokevirtual   #290 <Method String getName()>
	//   60  121:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   61  124:ldc2            #419 <String "\": ">
	//   62  127:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   63  130:aload_1         
	//   64  131:invokevirtual   #422 <Method String AnnotatedField.getFullName()>
	//   65  134:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   66  137:ldc2            #424 <String " vs ">
	//   67  140:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   68  143:aload           4
	//   69  145:invokevirtual   #422 <Method String AnnotatedField.getFullName()>
	//   70  148:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   71  151:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   72  154:invokespecial   #425 <Method void IllegalArgumentException(String)>
	//   73  157:athrow          
	}

	public PropertyName getFullName()
	{
		return _name;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field PropertyName _name>
	//    2    4:areturn         
	}

	public AnnotatedMethod getGetter()
	{
		Linked linked;
		Linked linked3;
		Linked linked1 = _getters;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//    2    4:astore          4
		if(linked1 == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		Linked linked4 = linked1.next;
	//    7   13:aload           4
	//    8   15:getfield        #96  <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//    9   18:astore          6
		linked3 = linked1;
	//   10   20:aload           4
	//   11   22:astore          5
		linked = linked4;
	//   12   24:aload           6
	//   13   26:astore_3        
		if(linked4 == null)
	//*  14   27:aload           6
	//*  15   29:ifnonnull       41
			return (AnnotatedMethod)linked1.value;
	//   16   32:aload           4
	//   17   34:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   18   37:checkcast       #251 <Class AnnotatedMethod>
	//   19   40:areturn         
_L5:
		Class class1;
		Class class2;
		if(linked == null)
			break MISSING_BLOCK_LABEL_231;
	//   20   41:aload_3         
	//   21   42:ifnull          231
		class1 = ((AnnotatedMethod)linked3.value).getDeclaringClass();
	//   22   45:aload           5
	//   23   47:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   24   50:checkcast       #251 <Class AnnotatedMethod>
	//   25   53:invokevirtual   #427 <Method Class AnnotatedMethod.getDeclaringClass()>
	//   26   56:astore          6
		class2 = ((AnnotatedMethod)linked.value).getDeclaringClass();
	//   27   58:aload_3         
	//   28   59:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   29   62:checkcast       #251 <Class AnnotatedMethod>
	//   30   65:invokevirtual   #427 <Method Class AnnotatedMethod.getDeclaringClass()>
	//   31   68:astore          7
		if(class1 == class2) goto _L2; else goto _L1
	//   32   70:aload           6
	//   33   72:aload           7
	//   34   74:if_acmpeq       116
_L1:
		if(!class1.isAssignableFrom(class2)) goto _L4; else goto _L3
	//   35   77:aload           6
	//   36   79:aload           7
	//   37   81:invokevirtual   #413 <Method boolean Class.isAssignableFrom(Class)>
	//   38   84:ifeq            102
_L3:
		Linked linked2 = linked;
	//   39   87:aload_3         
	//   40   88:astore          4
_L6:
		linked = linked.next;
	//   41   90:aload_3         
	//   42   91:getfield        #96  <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//   43   94:astore_3        
		linked3 = linked2;
	//   44   95:aload           4
	//   45   97:astore          5
		  goto _L5
	//*  46   99:goto            41
_L4:
		linked2 = linked3;
	//   47  102:aload           5
	//   48  104:astore          4
		if(class2.isAssignableFrom(class1)) goto _L6; else goto _L2
	//   49  106:aload           7
	//   50  108:aload           6
	//   51  110:invokevirtual   #413 <Method boolean Class.isAssignableFrom(Class)>
	//   52  113:ifne            90
_L2:
		int i = _getterPriority((AnnotatedMethod)linked.value);
	//   53  116:aload_0         
	//   54  117:aload_3         
	//   55  118:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   56  121:checkcast       #251 <Class AnnotatedMethod>
	//   57  124:invokevirtual   #429 <Method int _getterPriority(AnnotatedMethod)>
	//   58  127:istore_1        
		int j = _getterPriority((AnnotatedMethod)linked3.value);
	//   59  128:aload_0         
	//   60  129:aload           5
	//   61  131:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   62  134:checkcast       #251 <Class AnnotatedMethod>
	//   63  137:invokevirtual   #429 <Method int _getterPriority(AnnotatedMethod)>
	//   64  140:istore_2        
		if(i != j)
	//*  65  141:iload_1         
	//*  66  142:iload_2         
	//*  67  143:icmpeq          161
		{
			linked2 = linked3;
	//   68  146:aload           5
	//   69  148:astore          4
			if(i < j)
	//*  70  150:iload_1         
	//*  71  151:iload_2         
	//*  72  152:icmpge          90
				linked2 = linked;
	//   73  155:aload_3         
	//   74  156:astore          4
		} else
	//*  75  158:goto            90
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Conflicting getter definitions for property \"").append(getName()).append("\": ").append(((AnnotatedMethod)linked3.value).getFullName()).append(" vs ").append(((AnnotatedMethod)linked.value).getFullName()).toString());
	//   76  161:new             #415 <Class IllegalArgumentException>
	//   77  164:dup             
	//   78  165:new             #141 <Class StringBuilder>
	//   79  168:dup             
	//   80  169:invokespecial   #142 <Method void StringBuilder()>
	//   81  172:ldc2            #431 <String "Conflicting getter definitions for property \"">
	//   82  175:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   83  178:aload_0         
	//   84  179:invokevirtual   #290 <Method String getName()>
	//   85  182:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   86  185:ldc2            #419 <String "\": ">
	//   87  188:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   88  191:aload           5
	//   89  193:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   90  196:checkcast       #251 <Class AnnotatedMethod>
	//   91  199:invokevirtual   #432 <Method String AnnotatedMethod.getFullName()>
	//   92  202:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   93  205:ldc2            #424 <String " vs ">
	//   94  208:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   95  211:aload_3         
	//   96  212:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   97  215:checkcast       #251 <Class AnnotatedMethod>
	//   98  218:invokevirtual   #432 <Method String AnnotatedMethod.getFullName()>
	//   99  221:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//  100  224:invokevirtual   #159 <Method String StringBuilder.toString()>
	//  101  227:invokespecial   #425 <Method void IllegalArgumentException(String)>
	//  102  230:athrow          
		}
		  goto _L6
		_getters = linked3.withoutNext();
	//  103  231:aload_0         
	//  104  232:aload           5
	//  105  234:invokevirtual   #435 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.withoutNext()>
	//  106  237:putfield        #83  <Field POJOPropertyBuilder$Linked _getters>
		return (AnnotatedMethod)linked3.value;
	//  107  240:aload           5
	//  108  242:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//  109  245:checkcast       #251 <Class AnnotatedMethod>
	//  110  248:areturn         
	}

	public String getInternalName()
	{
		return _internalName.getSimpleName();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field PropertyName _internalName>
	//    2    4:invokevirtual   #439 <Method String PropertyName.getSimpleName()>
	//    3    7:areturn         
	}

	public PropertyMetadata getMetadata()
	{
		Boolean boolean1 = _findRequired();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #443 <Method Boolean _findRequired()>
	//    2    4:astore_1        
		String s = _findDescription();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #445 <Method String _findDescription()>
	//    5    9:astore_2        
		Integer integer = _findIndex();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #447 <Method Integer _findIndex()>
	//    8   14:astore_3        
		String s1 = _findDefaultValue();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #449 <Method String _findDefaultValue()>
	//   11   19:astore          4
		if(boolean1 == null && integer == null && s1 == null)
	//*  12   21:aload_1         
	//*  13   22:ifnonnull       50
	//*  14   25:aload_3         
	//*  15   26:ifnonnull       50
	//*  16   29:aload           4
	//*  17   31:ifnonnull       50
		{
			if(s == null)
	//*  18   34:aload_2         
	//*  19   35:ifnonnull       42
				return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
	//   20   38:getstatic       #455 <Field PropertyMetadata PropertyMetadata.STD_REQUIRED_OR_OPTIONAL>
	//   21   41:areturn         
			else
				return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL.withDescription(s);
	//   22   42:getstatic       #455 <Field PropertyMetadata PropertyMetadata.STD_REQUIRED_OR_OPTIONAL>
	//   23   45:aload_2         
	//   24   46:invokevirtual   #459 <Method PropertyMetadata PropertyMetadata.withDescription(String)>
	//   25   49:areturn         
		} else
		{
			return PropertyMetadata.construct(boolean1.booleanValue(), s, integer, s1);
	//   26   50:aload_1         
	//   27   51:invokevirtual   #462 <Method boolean Boolean.booleanValue()>
	//   28   54:aload_2         
	//   29   55:aload_3         
	//   30   56:aload           4
	//   31   58:invokestatic    #466 <Method PropertyMetadata PropertyMetadata.construct(boolean, String, Integer, String)>
	//   32   61:areturn         
		}
	}

	public AnnotatedMember getMutator()
	{
		AnnotatedParameter annotatedparameter = getConstructorParameter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #469 <Method AnnotatedParameter getConstructorParameter()>
	//    2    4:astore_2        
		Object obj = ((Object) (annotatedparameter));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(annotatedparameter == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       27
		{
			AnnotatedMethod annotatedmethod = getSetter();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #472 <Method AnnotatedMethod getSetter()>
	//    9   15:astore_2        
			obj = ((Object) (annotatedmethod));
	//   10   16:aload_2         
	//   11   17:astore_1        
			if(annotatedmethod == null)
	//*  12   18:aload_2         
	//*  13   19:ifnonnull       27
				obj = ((Object) (getField()));
	//   14   22:aload_0         
	//   15   23:invokevirtual   #380 <Method AnnotatedField getField()>
	//   16   26:astore_1        
		}
		return ((AnnotatedMember) (obj));
	//   17   27:aload_1         
	//   18   28:areturn         
	}

	public String getName()
	{
		if(_name == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field PropertyName _name>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _name.getSimpleName();
	//    5    9:aload_0         
	//    6   10:getfield        #73  <Field PropertyName _name>
	//    7   13:invokevirtual   #439 <Method String PropertyName.getSimpleName()>
	//    8   16:areturn         
	}

	public AnnotatedMember getNonConstructorMutator()
	{
		AnnotatedMethod annotatedmethod = getSetter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #472 <Method AnnotatedMethod getSetter()>
	//    2    4:astore_2        
		Object obj = ((Object) (annotatedmethod));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(annotatedmethod == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       16
			obj = ((Object) (getField()));
	//    7   11:aload_0         
	//    8   12:invokevirtual   #380 <Method AnnotatedField getField()>
	//    9   15:astore_1        
		return ((AnnotatedMember) (obj));
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	public AnnotatedMember getPrimaryMember()
	{
		if(_forSerialization)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field boolean _forSerialization>
	//*   2    4:ifeq            12
			return getAccessor();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #339 <Method AnnotatedMember getAccessor()>
	//    5   11:areturn         
		else
			return getMutator();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #476 <Method AnnotatedMember getMutator()>
	//    8   16:areturn         
	}

	public AnnotatedMethod getSetter()
	{
		Linked linked;
		Linked linked3;
		Linked linked1 = _setters;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//    2    4:astore          4
		if(linked1 == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		Linked linked4 = linked1.next;
	//    7   13:aload           4
	//    8   15:getfield        #96  <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//    9   18:astore          6
		linked3 = linked1;
	//   10   20:aload           4
	//   11   22:astore          5
		linked = linked4;
	//   12   24:aload           6
	//   13   26:astore_3        
		if(linked4 == null)
	//*  14   27:aload           6
	//*  15   29:ifnonnull       41
			return (AnnotatedMethod)linked1.value;
	//   16   32:aload           4
	//   17   34:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   18   37:checkcast       #251 <Class AnnotatedMethod>
	//   19   40:areturn         
_L5:
		Class class1;
		Class class2;
		if(linked == null)
			break MISSING_BLOCK_LABEL_287;
	//   20   41:aload_3         
	//   21   42:ifnull          287
		class1 = ((AnnotatedMethod)linked3.value).getDeclaringClass();
	//   22   45:aload           5
	//   23   47:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   24   50:checkcast       #251 <Class AnnotatedMethod>
	//   25   53:invokevirtual   #427 <Method Class AnnotatedMethod.getDeclaringClass()>
	//   26   56:astore          6
		class2 = ((AnnotatedMethod)linked.value).getDeclaringClass();
	//   27   58:aload_3         
	//   28   59:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   29   62:checkcast       #251 <Class AnnotatedMethod>
	//   30   65:invokevirtual   #427 <Method Class AnnotatedMethod.getDeclaringClass()>
	//   31   68:astore          7
		if(class1 == class2) goto _L2; else goto _L1
	//   32   70:aload           6
	//   33   72:aload           7
	//   34   74:if_acmpeq       116
_L1:
		if(!class1.isAssignableFrom(class2)) goto _L4; else goto _L3
	//   35   77:aload           6
	//   36   79:aload           7
	//   37   81:invokevirtual   #413 <Method boolean Class.isAssignableFrom(Class)>
	//   38   84:ifeq            102
_L3:
		Linked linked2 = linked;
	//   39   87:aload_3         
	//   40   88:astore          4
_L6:
		linked = linked.next;
	//   41   90:aload_3         
	//   42   91:getfield        #96  <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//   43   94:astore_3        
		linked3 = linked2;
	//   44   95:aload           4
	//   45   97:astore          5
		  goto _L5
	//*  46   99:goto            41
_L4:
		linked2 = linked3;
	//   47  102:aload           5
	//   48  104:astore          4
		if(class2.isAssignableFrom(class1)) goto _L6; else goto _L2
	//   49  106:aload           7
	//   50  108:aload           6
	//   51  110:invokevirtual   #413 <Method boolean Class.isAssignableFrom(Class)>
	//   52  113:ifne            90
_L2:
		AnnotatedMethod annotatedmethod = (AnnotatedMethod)linked.value;
	//   53  116:aload_3         
	//   54  117:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   55  120:checkcast       #251 <Class AnnotatedMethod>
	//   56  123:astore          6
		AnnotatedMethod annotatedmethod1 = (AnnotatedMethod)linked3.value;
	//   57  125:aload           5
	//   58  127:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//   59  130:checkcast       #251 <Class AnnotatedMethod>
	//   60  133:astore          7
		int i = _setterPriority(annotatedmethod);
	//   61  135:aload_0         
	//   62  136:aload           6
	//   63  138:invokevirtual   #478 <Method int _setterPriority(AnnotatedMethod)>
	//   64  141:istore_1        
		int j = _setterPriority(annotatedmethod1);
	//   65  142:aload_0         
	//   66  143:aload           7
	//   67  145:invokevirtual   #478 <Method int _setterPriority(AnnotatedMethod)>
	//   68  148:istore_2        
		if(i != j)
	//*  69  149:iload_1         
	//*  70  150:iload_2         
	//*  71  151:icmpeq          169
		{
			linked2 = linked3;
	//   72  154:aload           5
	//   73  156:astore          4
			if(i < j)
	//*  74  158:iload_1         
	//*  75  159:iload_2         
	//*  76  160:icmpge          90
				linked2 = linked;
	//   77  163:aload_3         
	//   78  164:astore          4
		} else
	//*  79  166:goto            90
		{
label0:
			{
				if(_annotationIntrospector == null)
					break label0;
	//   80  169:aload_0         
	//   81  170:getfield        #69  <Field AnnotationIntrospector _annotationIntrospector>
	//   82  173:ifnull          217
				AnnotatedMethod annotatedmethod2 = _annotationIntrospector.resolveSetterConflict(_config, annotatedmethod1, annotatedmethod);
	//   83  176:aload_0         
	//   84  177:getfield        #69  <Field AnnotationIntrospector _annotationIntrospector>
	//   85  180:aload_0         
	//   86  181:getfield        #67  <Field MapperConfig _config>
	//   87  184:aload           7
	//   88  186:aload           6
	//   89  188:invokevirtual   #482 <Method AnnotatedMethod AnnotationIntrospector.resolveSetterConflict(MapperConfig, AnnotatedMethod, AnnotatedMethod)>
	//   90  191:astore          8
				linked2 = linked3;
	//   91  193:aload           5
	//   92  195:astore          4
				if(annotatedmethod2 != annotatedmethod1)
	//*  93  197:aload           8
	//*  94  199:aload           7
	//*  95  201:if_acmpeq       90
				{
					if(annotatedmethod2 != annotatedmethod)
						break label0;
	//   96  204:aload           8
	//   97  206:aload           6
	//   98  208:if_acmpne       217
					linked2 = linked;
	//   99  211:aload_3         
	//  100  212:astore          4
				}
			}
		}
		  goto _L6
	//* 101  214:goto            90
		throw new IllegalArgumentException((new StringBuilder()).append("Conflicting setter definitions for property \"").append(getName()).append("\": ").append(((AnnotatedMethod)linked3.value).getFullName()).append(" vs ").append(((AnnotatedMethod)linked.value).getFullName()).toString());
	//  102  217:new             #415 <Class IllegalArgumentException>
	//  103  220:dup             
	//  104  221:new             #141 <Class StringBuilder>
	//  105  224:dup             
	//  106  225:invokespecial   #142 <Method void StringBuilder()>
	//  107  228:ldc2            #484 <String "Conflicting setter definitions for property \"">
	//  108  231:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//  109  234:aload_0         
	//  110  235:invokevirtual   #290 <Method String getName()>
	//  111  238:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//  112  241:ldc2            #419 <String "\": ">
	//  113  244:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//  114  247:aload           5
	//  115  249:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//  116  252:checkcast       #251 <Class AnnotatedMethod>
	//  117  255:invokevirtual   #432 <Method String AnnotatedMethod.getFullName()>
	//  118  258:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//  119  261:ldc2            #424 <String " vs ">
	//  120  264:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//  121  267:aload_3         
	//  122  268:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//  123  271:checkcast       #251 <Class AnnotatedMethod>
	//  124  274:invokevirtual   #432 <Method String AnnotatedMethod.getFullName()>
	//  125  277:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//  126  280:invokevirtual   #159 <Method String StringBuilder.toString()>
	//  127  283:invokespecial   #425 <Method void IllegalArgumentException(String)>
	//  128  286:athrow          
		_setters = linked3.withoutNext();
	//  129  287:aload_0         
	//  130  288:aload           5
	//  131  290:invokevirtual   #435 <Method POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.withoutNext()>
	//  132  293:putfield        #85  <Field POJOPropertyBuilder$Linked _setters>
		return (AnnotatedMethod)linked3.value;
	//  133  296:aload           5
	//  134  298:getfield        #118 <Field Object POJOPropertyBuilder$Linked.value>
	//  135  301:checkcast       #251 <Class AnnotatedMethod>
	//  136  304:areturn         
	}

	public PropertyName getWrapperName()
	{
		AnnotatedMember annotatedmember = getPrimaryMember();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #487 <Method AnnotatedMember getPrimaryMember()>
	//    2    4:astore_1        
		if(annotatedmember == null || _annotationIntrospector == null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
	//*   5    9:aload_0         
	//*   6   10:getfield        #69  <Field AnnotationIntrospector _annotationIntrospector>
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		else
			return _annotationIntrospector.findWrapperName(((Annotated) (annotatedmember)));
	//   10   18:aload_0         
	//   11   19:getfield        #69  <Field AnnotationIntrospector _annotationIntrospector>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #491 <Method PropertyName AnnotationIntrospector.findWrapperName(Annotated)>
	//   14   26:areturn         
	}

	public boolean hasConstructorParameter()
	{
		return _ctorParameters != null;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
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
	//    1    1:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
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
	//    1    1:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
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
	//    1    1:getfield        #73  <Field PropertyName _name>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #499 <Method boolean PropertyName.equals(Object)>
	//    4    8:ireturn         
	}

	public boolean hasSetter()
	{
		return _setters != null;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isExplicitlyIncluded()
	{
		return _anyExplicits(_fields) || _anyExplicits(_getters) || _anyExplicits(_setters) || _anyExplicits(_ctorParameters);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//    3    5:invokespecial   #503 <Method boolean _anyExplicits(POJOPropertyBuilder$Linked)>
	//    4    8:ifne            44
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//    8   16:invokespecial   #503 <Method boolean _anyExplicits(POJOPropertyBuilder$Linked)>
	//    9   19:ifne            44
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//   13   27:invokespecial   #503 <Method boolean _anyExplicits(POJOPropertyBuilder$Linked)>
	//   14   30:ifne            44
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   18   38:invokespecial   #503 <Method boolean _anyExplicits(POJOPropertyBuilder$Linked)>
	//   19   41:ifeq            46
	//   20   44:iconst_1        
	//   21   45:ireturn         
	//   22   46:iconst_0        
	//   23   47:ireturn         
	}

	public boolean isExplicitlyNamed()
	{
		return _anyExplicitNames(_fields) || _anyExplicitNames(_getters) || _anyExplicitNames(_setters) || _anyExplicitNames(_ctorParameters);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//    3    5:invokespecial   #506 <Method boolean _anyExplicitNames(POJOPropertyBuilder$Linked)>
	//    4    8:ifne            44
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//    8   16:invokespecial   #506 <Method boolean _anyExplicitNames(POJOPropertyBuilder$Linked)>
	//    9   19:ifne            44
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//   13   27:invokespecial   #506 <Method boolean _anyExplicitNames(POJOPropertyBuilder$Linked)>
	//   14   30:ifne            44
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   18   38:invokespecial   #506 <Method boolean _anyExplicitNames(POJOPropertyBuilder$Linked)>
	//   19   41:ifeq            46
	//   20   44:iconst_1        
	//   21   45:ireturn         
	//   22   46:iconst_0        
	//   23   47:ireturn         
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
	//    4    6:invokespecial   #508 <Method void POJOPropertyBuilder$3(POJOPropertyBuilder)>
	//    5    9:invokevirtual   #233 <Method Object fromMemberAnnotations(POJOPropertyBuilder$WithMember)>
	//    6   12:checkcast       #247 <Class Boolean>
	//    7   15:astore_1        
		return boolean1 != null && boolean1.booleanValue();
	//    8   16:aload_1         
	//    9   17:ifnull          29
	//   10   20:aload_1         
	//   11   21:invokevirtual   #462 <Method boolean Boolean.booleanValue()>
	//   12   24:ifeq            29
	//   13   27:iconst_1        
	//   14   28:ireturn         
	//   15   29:iconst_0        
	//   16   30:ireturn         
	}

	public void mergeAnnotations(boolean flag)
	{
		if(!flag) goto _L2; else goto _L1
	//    0    0:iload_1         
	//    1    1:ifeq            115
_L1:
		if(_getters == null) goto _L4; else goto _L3
	//    2    4:aload_0         
	//    3    5:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//    4    8:ifnull          63
_L3:
		AnnotationMap annotationmap = _mergeAnnotations(0, new Linked[] {
			_getters, _fields, _ctorParameters, _setters
		});
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:iconst_4        
	//    8   14:anewarray       Linked[]
	//    9   17:dup             
	//   10   18:iconst_0        
	//   11   19:aload_0         
	//   12   20:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_1        
	//   16   26:aload_0         
	//   17   27:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//   18   30:aastore         
	//   19   31:dup             
	//   20   32:iconst_2        
	//   21   33:aload_0         
	//   22   34:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   23   37:aastore         
	//   24   38:dup             
	//   25   39:iconst_3        
	//   26   40:aload_0         
	//   27   41:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//   28   44:aastore         
	//   29   45:invokespecial   #206 <Method AnnotationMap _mergeAnnotations(int, POJOPropertyBuilder$Linked[])>
	//   30   48:astore_2        
		_getters = _applyAnnotations(_getters, annotationmap);
	//   31   49:aload_0         
	//   32   50:aload_0         
	//   33   51:aload_0         
	//   34   52:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//   35   55:aload_2         
	//   36   56:invokespecial   #126 <Method POJOPropertyBuilder$Linked _applyAnnotations(POJOPropertyBuilder$Linked, AnnotationMap)>
	//   37   59:putfield        #83  <Field POJOPropertyBuilder$Linked _getters>
_L6:
		return;
	//   38   62:return          
_L4:
		if(_fields != null)
	//*  39   63:aload_0         
	//*  40   64:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//*  41   67:ifnull          62
		{
			AnnotationMap annotationmap1 = _mergeAnnotations(0, new Linked[] {
				_fields, _ctorParameters, _setters
			});
	//   42   70:aload_0         
	//   43   71:iconst_0        
	//   44   72:iconst_3        
	//   45   73:anewarray       Linked[]
	//   46   76:dup             
	//   47   77:iconst_0        
	//   48   78:aload_0         
	//   49   79:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//   50   82:aastore         
	//   51   83:dup             
	//   52   84:iconst_1        
	//   53   85:aload_0         
	//   54   86:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   55   89:aastore         
	//   56   90:dup             
	//   57   91:iconst_2        
	//   58   92:aload_0         
	//   59   93:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//   60   96:aastore         
	//   61   97:invokespecial   #206 <Method AnnotationMap _mergeAnnotations(int, POJOPropertyBuilder$Linked[])>
	//   62  100:astore_2        
			_fields = _applyAnnotations(_fields, annotationmap1);
	//   63  101:aload_0         
	//   64  102:aload_0         
	//   65  103:aload_0         
	//   66  104:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//   67  107:aload_2         
	//   68  108:invokespecial   #126 <Method POJOPropertyBuilder$Linked _applyAnnotations(POJOPropertyBuilder$Linked, AnnotationMap)>
	//   69  111:putfield        #79  <Field POJOPropertyBuilder$Linked _fields>
			return;
	//   70  114:return          
		}
		continue; /* Loop/switch isn't completed */
_L2:
		if(_ctorParameters != null)
	//*  71  115:aload_0         
	//*  72  116:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//*  73  119:ifnull          174
		{
			AnnotationMap annotationmap2 = _mergeAnnotations(0, new Linked[] {
				_ctorParameters, _setters, _fields, _getters
			});
	//   74  122:aload_0         
	//   75  123:iconst_0        
	//   76  124:iconst_4        
	//   77  125:anewarray       Linked[]
	//   78  128:dup             
	//   79  129:iconst_0        
	//   80  130:aload_0         
	//   81  131:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   82  134:aastore         
	//   83  135:dup             
	//   84  136:iconst_1        
	//   85  137:aload_0         
	//   86  138:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//   87  141:aastore         
	//   88  142:dup             
	//   89  143:iconst_2        
	//   90  144:aload_0         
	//   91  145:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//   92  148:aastore         
	//   93  149:dup             
	//   94  150:iconst_3        
	//   95  151:aload_0         
	//   96  152:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//   97  155:aastore         
	//   98  156:invokespecial   #206 <Method AnnotationMap _mergeAnnotations(int, POJOPropertyBuilder$Linked[])>
	//   99  159:astore_2        
			_ctorParameters = _applyAnnotations(_ctorParameters, annotationmap2);
	//  100  160:aload_0         
	//  101  161:aload_0         
	//  102  162:aload_0         
	//  103  163:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//  104  166:aload_2         
	//  105  167:invokespecial   #126 <Method POJOPropertyBuilder$Linked _applyAnnotations(POJOPropertyBuilder$Linked, AnnotationMap)>
	//  106  170:putfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
			return;
	//  107  173:return          
		}
		if(_setters != null)
	//* 108  174:aload_0         
	//* 109  175:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//* 110  178:ifnull          226
		{
			AnnotationMap annotationmap3 = _mergeAnnotations(0, new Linked[] {
				_setters, _fields, _getters
			});
	//  111  181:aload_0         
	//  112  182:iconst_0        
	//  113  183:iconst_3        
	//  114  184:anewarray       Linked[]
	//  115  187:dup             
	//  116  188:iconst_0        
	//  117  189:aload_0         
	//  118  190:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//  119  193:aastore         
	//  120  194:dup             
	//  121  195:iconst_1        
	//  122  196:aload_0         
	//  123  197:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//  124  200:aastore         
	//  125  201:dup             
	//  126  202:iconst_2        
	//  127  203:aload_0         
	//  128  204:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//  129  207:aastore         
	//  130  208:invokespecial   #206 <Method AnnotationMap _mergeAnnotations(int, POJOPropertyBuilder$Linked[])>
	//  131  211:astore_2        
			_setters = _applyAnnotations(_setters, annotationmap3);
	//  132  212:aload_0         
	//  133  213:aload_0         
	//  134  214:aload_0         
	//  135  215:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//  136  218:aload_2         
	//  137  219:invokespecial   #126 <Method POJOPropertyBuilder$Linked _applyAnnotations(POJOPropertyBuilder$Linked, AnnotationMap)>
	//  138  222:putfield        #85  <Field POJOPropertyBuilder$Linked _setters>
			return;
	//  139  225:return          
		}
		if(_fields != null)
	//* 140  226:aload_0         
	//* 141  227:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//* 142  230:ifnull          62
		{
			AnnotationMap annotationmap4 = _mergeAnnotations(0, new Linked[] {
				_fields, _getters
			});
	//  143  233:aload_0         
	//  144  234:iconst_0        
	//  145  235:iconst_2        
	//  146  236:anewarray       Linked[]
	//  147  239:dup             
	//  148  240:iconst_0        
	//  149  241:aload_0         
	//  150  242:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//  151  245:aastore         
	//  152  246:dup             
	//  153  247:iconst_1        
	//  154  248:aload_0         
	//  155  249:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//  156  252:aastore         
	//  157  253:invokespecial   #206 <Method AnnotationMap _mergeAnnotations(int, POJOPropertyBuilder$Linked[])>
	//  158  256:astore_2        
			_fields = _applyAnnotations(_fields, annotationmap4);
	//  159  257:aload_0         
	//  160  258:aload_0         
	//  161  259:aload_0         
	//  162  260:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//  163  263:aload_2         
	//  164  264:invokespecial   #126 <Method POJOPropertyBuilder$Linked _applyAnnotations(POJOPropertyBuilder$Linked, AnnotationMap)>
	//  165  267:putfield        #79  <Field POJOPropertyBuilder$Linked _fields>
			return;
	//  166  270:return          
		}
		if(true) goto _L6; else goto _L5
_L5:
	}

	public void removeConstructors()
	{
		_ctorParameters = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//    3    5:return          
	}

	public void removeIgnored()
	{
		_fields = _removeIgnored(_fields);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//    4    6:invokespecial   #514 <Method POJOPropertyBuilder$Linked _removeIgnored(POJOPropertyBuilder$Linked)>
	//    5    9:putfield        #79  <Field POJOPropertyBuilder$Linked _fields>
		_getters = _removeIgnored(_getters);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//   10   18:invokespecial   #514 <Method POJOPropertyBuilder$Linked _removeIgnored(POJOPropertyBuilder$Linked)>
	//   11   21:putfield        #83  <Field POJOPropertyBuilder$Linked _getters>
		_setters = _removeIgnored(_setters);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//   16   30:invokespecial   #514 <Method POJOPropertyBuilder$Linked _removeIgnored(POJOPropertyBuilder$Linked)>
	//   17   33:putfield        #85  <Field POJOPropertyBuilder$Linked _setters>
		_ctorParameters = _removeIgnored(_ctorParameters);
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   22   42:invokespecial   #514 <Method POJOPropertyBuilder$Linked _removeIgnored(POJOPropertyBuilder$Linked)>
	//   23   45:putfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   24   48:return          
	}

	public void removeNonVisible(boolean flag)
	{
		com.fasterxml.jackson.annotation.JsonProperty.Access access;
		com.fasterxml.jackson.annotation.JsonProperty.Access access1 = findAccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #517 <Method com.fasterxml.jackson.annotation.JsonProperty$Access findAccess()>
	//    2    4:astore_3        
		access = access1;
	//    3    5:aload_3         
	//    4    6:astore_2        
		if(access1 == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       15
			access = com.fasterxml.jackson.annotation.JsonProperty.Access.AUTO;
	//    7   11:getstatic       #319 <Field com.fasterxml.jackson.annotation.JsonProperty$Access com.fasterxml.jackson.annotation.JsonProperty$Access.AUTO>
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
			//*  25   54:astore_0        
			//*  26   55:return          
			//*  27   56:astore_0        
			//*  28   57:goto            42
			//*  29   60:astore_0        
			//*  30   61:goto            31
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   64:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access[com.fasterxml.jackson.annotation.JsonProperty.Access.READ_WRITE.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access[com.fasterxml.jackson.annotation.JsonProperty.Access.WRITE_ONLY.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access[com.fasterxml.jackson.annotation.JsonProperty.Access.AUTO.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  32   65:goto            20
			}
		}

		_cls10..SwitchMap.com.fasterxml.jackson.annotation.JsonProperty.Access[access.ordinal()];
	//    9   15:getstatic       #521 <Field int[] POJOPropertyBuilder$10.$SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access>
	//   10   18:aload_2         
	//   11   19:invokevirtual   #524 <Method int com.fasterxml.jackson.annotation.JsonProperty$Access.ordinal()>
	//   12   22:iaload          
		JVM INSTR tableswitch 1 3: default 48
	//	               1 108
	//	               2 107
	//	               3 131;
	//   13   23:tableswitch     1 3: default 48
	//	               1 108
	//	               2 107
	//	               3 131
		   goto _L1 _L2 _L3 _L4
_L3:
		break; /* Loop/switch isn't completed */
_L1:
		_getters = _removeNonVisible(_getters);
	//   14   48:aload_0         
	//   15   49:aload_0         
	//   16   50:aload_0         
	//   17   51:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//   18   54:invokespecial   #526 <Method POJOPropertyBuilder$Linked _removeNonVisible(POJOPropertyBuilder$Linked)>
	//   19   57:putfield        #83  <Field POJOPropertyBuilder$Linked _getters>
		_ctorParameters = _removeNonVisible(_ctorParameters);
	//   20   60:aload_0         
	//   21   61:aload_0         
	//   22   62:aload_0         
	//   23   63:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   24   66:invokespecial   #526 <Method POJOPropertyBuilder$Linked _removeNonVisible(POJOPropertyBuilder$Linked)>
	//   25   69:putfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
		if(!flag || _getters == null)
	//*  26   72:iload_1         
	//*  27   73:ifeq            83
	//*  28   76:aload_0         
	//*  29   77:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//*  30   80:ifnonnull       107
		{
			_fields = _removeNonVisible(_fields);
	//   31   83:aload_0         
	//   32   84:aload_0         
	//   33   85:aload_0         
	//   34   86:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//   35   89:invokespecial   #526 <Method POJOPropertyBuilder$Linked _removeNonVisible(POJOPropertyBuilder$Linked)>
	//   36   92:putfield        #79  <Field POJOPropertyBuilder$Linked _fields>
			_setters = _removeNonVisible(_setters);
	//   37   95:aload_0         
	//   38   96:aload_0         
	//   39   97:aload_0         
	//   40   98:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//   41  101:invokespecial   #526 <Method POJOPropertyBuilder$Linked _removeNonVisible(POJOPropertyBuilder$Linked)>
	//   42  104:putfield        #85  <Field POJOPropertyBuilder$Linked _setters>
		}
_L6:
		return;
	//   43  107:return          
_L2:
		_setters = null;
	//   44  108:aload_0         
	//   45  109:aconst_null     
	//   46  110:putfield        #85  <Field POJOPropertyBuilder$Linked _setters>
		_ctorParameters = null;
	//   47  113:aload_0         
	//   48  114:aconst_null     
	//   49  115:putfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
		if(!_forSerialization)
	//*  50  118:aload_0         
	//*  51  119:getfield        #75  <Field boolean _forSerialization>
	//*  52  122:ifne            107
		{
			_fields = null;
	//   53  125:aload_0         
	//   54  126:aconst_null     
	//   55  127:putfield        #79  <Field POJOPropertyBuilder$Linked _fields>
			return;
	//   56  130:return          
		}
		continue; /* Loop/switch isn't completed */
_L4:
		_getters = null;
	//   57  131:aload_0         
	//   58  132:aconst_null     
	//   59  133:putfield        #83  <Field POJOPropertyBuilder$Linked _getters>
		if(_forSerialization)
	//*  60  136:aload_0         
	//*  61  137:getfield        #75  <Field boolean _forSerialization>
	//*  62  140:ifeq            107
		{
			_fields = null;
	//   63  143:aload_0         
	//   64  144:aconst_null     
	//   65  145:putfield        #79  <Field POJOPropertyBuilder$Linked _fields>
			return;
	//   66  148:return          
		}
		if(true) goto _L6; else goto _L5
_L5:
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #141 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #142 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[Property '").append(((Object) (_name))).append("'; ctors: ").append(((Object) (_ctorParameters))).append(", field(s): ").append(((Object) (_fields))).append(", getter(s): ").append(((Object) (_getters))).append(", setter(s): ").append(((Object) (_setters)));
	//    4    8:aload_1         
	//    5    9:ldc2            #528 <String "[Property '">
	//    6   12:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:aload_0         
	//    8   16:getfield        #73  <Field PropertyName _name>
	//    9   19:invokevirtual   #151 <Method StringBuilder StringBuilder.append(Object)>
	//   10   22:ldc2            #530 <String "'; ctors: ">
	//   11   25:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:aload_0         
	//   13   29:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   14   32:invokevirtual   #151 <Method StringBuilder StringBuilder.append(Object)>
	//   15   35:ldc2            #532 <String ", field(s): ">
	//   16   38:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   17   41:aload_0         
	//   18   42:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//   19   45:invokevirtual   #151 <Method StringBuilder StringBuilder.append(Object)>
	//   20   48:ldc2            #534 <String ", getter(s): ">
	//   21   51:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   22   54:aload_0         
	//   23   55:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//   24   58:invokevirtual   #151 <Method StringBuilder StringBuilder.append(Object)>
	//   25   61:ldc2            #536 <String ", setter(s): ">
	//   26   64:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   27   67:aload_0         
	//   28   68:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//   29   71:invokevirtual   #151 <Method StringBuilder StringBuilder.append(Object)>
	//   30   74:pop             
		stringbuilder.append("]");
	//   31   75:aload_1         
	//   32   76:ldc2            #538 <String "]">
	//   33   79:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   34   82:pop             
		return stringbuilder.toString();
	//   35   83:aload_1         
	//   36   84:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   37   87:areturn         
	}

	public void trimByVisibility()
	{
		_fields = _trimByVisibility(_fields);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #79  <Field POJOPropertyBuilder$Linked _fields>
	//    4    6:invokespecial   #540 <Method POJOPropertyBuilder$Linked _trimByVisibility(POJOPropertyBuilder$Linked)>
	//    5    9:putfield        #79  <Field POJOPropertyBuilder$Linked _fields>
		_getters = _trimByVisibility(_getters);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #83  <Field POJOPropertyBuilder$Linked _getters>
	//   10   18:invokespecial   #540 <Method POJOPropertyBuilder$Linked _trimByVisibility(POJOPropertyBuilder$Linked)>
	//   11   21:putfield        #83  <Field POJOPropertyBuilder$Linked _getters>
		_setters = _trimByVisibility(_setters);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #85  <Field POJOPropertyBuilder$Linked _setters>
	//   16   30:invokespecial   #540 <Method POJOPropertyBuilder$Linked _trimByVisibility(POJOPropertyBuilder$Linked)>
	//   17   33:putfield        #85  <Field POJOPropertyBuilder$Linked _setters>
		_ctorParameters = _trimByVisibility(_ctorParameters);
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   22   42:invokespecial   #540 <Method POJOPropertyBuilder$Linked _trimByVisibility(POJOPropertyBuilder$Linked)>
	//   23   45:putfield        #81  <Field POJOPropertyBuilder$Linked _ctorParameters>
	//   24   48:return          
	}

	public volatile BeanPropertyDefinition withName(PropertyName propertyname)
	{
		return ((BeanPropertyDefinition) (withName(propertyname)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #545 <Method POJOPropertyBuilder withName(PropertyName)>
	//    3    5:areturn         
	}

	public POJOPropertyBuilder withName(PropertyName propertyname)
	{
		return new POJOPropertyBuilder(this, propertyname);
	//    0    0:new             #2   <Class POJOPropertyBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #547 <Method void POJOPropertyBuilder(POJOPropertyBuilder, PropertyName)>
	//    5    9:areturn         
	}

	public volatile BeanPropertyDefinition withSimpleName(String s)
	{
		return ((BeanPropertyDefinition) (withSimpleName(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #552 <Method POJOPropertyBuilder withSimpleName(String)>
	//    3    5:areturn         
	}

	public POJOPropertyBuilder withSimpleName(String s)
	{
		s = ((String) (_name.withSimpleName(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field PropertyName _name>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #555 <Method PropertyName PropertyName.withSimpleName(String)>
	//    4    8:astore_1        
		if(s == _name)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #73  <Field PropertyName _name>
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
	//   15   25:invokespecial   #547 <Method void POJOPropertyBuilder(POJOPropertyBuilder, PropertyName)>
	//   16   28:areturn         
	}

	protected final AnnotationIntrospector _annotationIntrospector;
	protected final MapperConfig _config;
	protected Linked _ctorParameters;
	protected Linked _fields;
	protected final boolean _forSerialization;
	protected Linked _getters;
	protected final PropertyName _internalName;
	protected final PropertyName _name;
	protected Linked _setters;
}
