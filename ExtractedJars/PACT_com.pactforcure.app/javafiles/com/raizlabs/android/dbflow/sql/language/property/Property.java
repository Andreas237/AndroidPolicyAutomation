// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language.property;

import com.raizlabs.android.dbflow.sql.language.*;
import java.util.Collection;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language.property:
//			BaseProperty, IProperty

public class Property extends BaseProperty
	implements ITypeConditional
{

	public Property(Class class1, NameAlias namealias)
	{
		super(class1, namealias);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #26  <Method void BaseProperty(Class, NameAlias)>
	//    4    6:return          
	}

	public Property(Class class1, String s)
	{
		super(class1, ((NameAlias) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #26  <Method void BaseProperty(Class, NameAlias)>
		if(s != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          25
			nameAlias = (new com.raizlabs.android.dbflow.sql.language.NameAlias.Builder(s)).build();
	//    6   10:aload_0         
	//    7   11:new             #30  <Class com.raizlabs.android.dbflow.sql.language.NameAlias$Builder>
	//    8   14:dup             
	//    9   15:aload_2         
	//   10   16:invokespecial   #33  <Method void com.raizlabs.android.dbflow.sql.language.NameAlias$Builder(String)>
	//   11   19:invokevirtual   #37  <Method NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//   12   22:putfield        #41  <Field NameAlias nameAlias>
	//   13   25:return          
	}

	public volatile IProperty as(String s)
	{
		return ((IProperty) (as(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #47  <Method Property as(String)>
	//    3    5:areturn         
	}

	public Property as(String s)
	{
		return new Property(table, getNameAlias().newBuilder().as(s).build());
	//    0    0:new             #2   <Class Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field Class table>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #54  <Method NameAlias getNameAlias()>
	//    6   12:invokevirtual   #60  <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder NameAlias.newBuilder()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #63  <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.as(String)>
	//    9   19:invokevirtual   #37  <Method NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//   10   22:invokespecial   #64  <Method void Property(Class, NameAlias)>
	//   11   25:areturn         
	}

	public com.raizlabs.android.dbflow.sql.language.Condition.Between between(Object obj)
	{
		return getCondition().between(obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #75  <Method com.raizlabs.android.dbflow.sql.language.Condition$Between Condition.between(Object)>
	//    4    8:areturn         
	}

	public Condition concatenate(Object obj)
	{
		return getCondition().concatenate(obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #80  <Method Condition Condition.concatenate(Object)>
	//    4    8:areturn         
	}

	public volatile IProperty concatenate(IProperty iproperty)
	{
		return ((IProperty) (concatenate(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #85  <Method Property concatenate(IProperty)>
	//    3    5:areturn         
	}

	public Property concatenate(IProperty iproperty)
	{
		return new Property(table, NameAlias.joinNames("||", new String[] {
			nameAlias.fullName(), ((Object) (iproperty)).toString()
		}));
	//    0    0:new             #2   <Class Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field Class table>
	//    4    8:ldc1            #87  <String "||">
	//    5   10:iconst_2        
	//    6   11:anewarray       String[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_0         
	//   10   17:getfield        #41  <Field NameAlias nameAlias>
	//   11   20:invokevirtual   #93  <Method String NameAlias.fullName()>
	//   12   23:aastore         
	//   13   24:dup             
	//   14   25:iconst_1        
	//   15   26:aload_1         
	//   16   27:invokevirtual   #98  <Method String Object.toString()>
	//   17   30:aastore         
	//   18   31:invokestatic    #102 <Method NameAlias NameAlias.joinNames(String, String[])>
	//   19   34:invokespecial   #64  <Method void Property(Class, NameAlias)>
	//   20   37:areturn         
	}

	public volatile IProperty distinct()
	{
		return ((IProperty) (distinct()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #108 <Method Property distinct()>
	//    2    4:areturn         
	}

	public Property distinct()
	{
		return new Property(table, getDistinctAliasName());
	//    0    0:new             #2   <Class Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field Class table>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #111 <Method NameAlias getDistinctAliasName()>
	//    6   12:invokespecial   #64  <Method void Property(Class, NameAlias)>
	//    7   15:areturn         
	}

	public volatile IProperty dividedBy(IProperty iproperty)
	{
		return ((IProperty) (dividedBy(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #115 <Method Property dividedBy(IProperty)>
	//    3    5:areturn         
	}

	public Property dividedBy(IProperty iproperty)
	{
		return new Property(table, NameAlias.joinNames("/", new String[] {
			nameAlias.fullName(), ((Object) (iproperty)).toString()
		}));
	//    0    0:new             #2   <Class Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field Class table>
	//    4    8:ldc1            #117 <String "/">
	//    5   10:iconst_2        
	//    6   11:anewarray       String[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_0         
	//   10   17:getfield        #41  <Field NameAlias nameAlias>
	//   11   20:invokevirtual   #93  <Method String NameAlias.fullName()>
	//   12   23:aastore         
	//   13   24:dup             
	//   14   25:iconst_1        
	//   15   26:aload_1         
	//   16   27:invokevirtual   #98  <Method String Object.toString()>
	//   17   30:aastore         
	//   18   31:invokestatic    #102 <Method NameAlias NameAlias.joinNames(String, String[])>
	//   19   34:invokespecial   #64  <Method void Property(Class, NameAlias)>
	//   20   37:areturn         
	}

	public Condition eq(Object obj)
	{
		return getCondition().eq(obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #120 <Method Condition Condition.eq(Object)>
	//    4    8:areturn         
	}

	public Condition glob(String s)
	{
		return getCondition().glob(s);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #124 <Method Condition Condition.glob(String)>
	//    4    8:areturn         
	}

	public Condition greaterThan(Object obj)
	{
		return getCondition().greaterThan(obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #127 <Method Condition Condition.greaterThan(Object)>
	//    4    8:areturn         
	}

	public Condition greaterThanOrEq(Object obj)
	{
		return getCondition().greaterThanOrEq(obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #130 <Method Condition Condition.greaterThanOrEq(Object)>
	//    4    8:areturn         
	}

	public transient com.raizlabs.android.dbflow.sql.language.Condition.In in(Object obj, Object aobj[])
	{
		return getCondition().in(obj, aobj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #134 <Method com.raizlabs.android.dbflow.sql.language.Condition$In Condition.in(Object, Object[])>
	//    5    9:areturn         
	}

	public com.raizlabs.android.dbflow.sql.language.Condition.In in(Collection collection)
	{
		return getCondition().in(collection);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #138 <Method com.raizlabs.android.dbflow.sql.language.Condition$In Condition.in(Collection)>
	//    4    8:areturn         
	}

	public Condition is(Object obj)
	{
		return getCondition().is(obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #142 <Method Condition Condition.is(Object)>
	//    4    8:areturn         
	}

	public Condition isNot(Object obj)
	{
		return getCondition().isNot(obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #145 <Method Condition Condition.isNot(Object)>
	//    4    8:areturn         
	}

	public Condition lessThan(Object obj)
	{
		return getCondition().lessThan(obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #148 <Method Condition Condition.lessThan(Object)>
	//    4    8:areturn         
	}

	public Condition lessThanOrEq(Object obj)
	{
		return getCondition().lessThanOrEq(obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #151 <Method Condition Condition.lessThanOrEq(Object)>
	//    4    8:areturn         
	}

	public Condition like(String s)
	{
		return getCondition().like(s);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #154 <Method Condition Condition.like(String)>
	//    4    8:areturn         
	}

	public volatile IProperty minus(IProperty iproperty)
	{
		return ((IProperty) (minus(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #157 <Method Property minus(IProperty)>
	//    3    5:areturn         
	}

	public Property minus(IProperty iproperty)
	{
		return new Property(table, NameAlias.joinNames("-", new String[] {
			nameAlias.fullName(), ((Object) (iproperty)).toString()
		}));
	//    0    0:new             #2   <Class Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field Class table>
	//    4    8:ldc1            #159 <String "-">
	//    5   10:iconst_2        
	//    6   11:anewarray       String[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_0         
	//   10   17:getfield        #41  <Field NameAlias nameAlias>
	//   11   20:invokevirtual   #93  <Method String NameAlias.fullName()>
	//   12   23:aastore         
	//   13   24:dup             
	//   14   25:iconst_1        
	//   15   26:aload_1         
	//   16   27:invokevirtual   #98  <Method String Object.toString()>
	//   17   30:aastore         
	//   18   31:invokestatic    #102 <Method NameAlias NameAlias.joinNames(String, String[])>
	//   19   34:invokespecial   #64  <Method void Property(Class, NameAlias)>
	//   20   37:areturn         
	}

	public volatile IProperty mod(IProperty iproperty)
	{
		return ((IProperty) (mod(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #162 <Method Property mod(IProperty)>
	//    3    5:areturn         
	}

	public Property mod(IProperty iproperty)
	{
		return new Property(table, NameAlias.joinNames("%", new String[] {
			nameAlias.fullName(), ((Object) (iproperty)).toString()
		}));
	//    0    0:new             #2   <Class Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field Class table>
	//    4    8:ldc1            #164 <String "%">
	//    5   10:iconst_2        
	//    6   11:anewarray       String[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_0         
	//   10   17:getfield        #41  <Field NameAlias nameAlias>
	//   11   20:invokevirtual   #93  <Method String NameAlias.fullName()>
	//   12   23:aastore         
	//   13   24:dup             
	//   14   25:iconst_1        
	//   15   26:aload_1         
	//   16   27:invokevirtual   #98  <Method String Object.toString()>
	//   17   30:aastore         
	//   18   31:invokestatic    #102 <Method NameAlias NameAlias.joinNames(String, String[])>
	//   19   34:invokespecial   #64  <Method void Property(Class, NameAlias)>
	//   20   37:areturn         
	}

	public volatile IProperty multipliedBy(IProperty iproperty)
	{
		return ((IProperty) (multipliedBy(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #167 <Method Property multipliedBy(IProperty)>
	//    3    5:areturn         
	}

	public Property multipliedBy(IProperty iproperty)
	{
		return new Property(table, NameAlias.joinNames("*", new String[] {
			nameAlias.fullName(), ((Object) (iproperty)).toString()
		}));
	//    0    0:new             #2   <Class Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field Class table>
	//    4    8:ldc1            #16  <String "*">
	//    5   10:iconst_2        
	//    6   11:anewarray       String[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_0         
	//   10   17:getfield        #41  <Field NameAlias nameAlias>
	//   11   20:invokevirtual   #93  <Method String NameAlias.fullName()>
	//   12   23:aastore         
	//   13   24:dup             
	//   14   25:iconst_1        
	//   15   26:aload_1         
	//   16   27:invokevirtual   #98  <Method String Object.toString()>
	//   17   30:aastore         
	//   18   31:invokestatic    #102 <Method NameAlias NameAlias.joinNames(String, String[])>
	//   19   34:invokespecial   #64  <Method void Property(Class, NameAlias)>
	//   20   37:areturn         
	}

	public Condition notEq(Object obj)
	{
		return getCondition().notEq(obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #170 <Method Condition Condition.notEq(Object)>
	//    4    8:areturn         
	}

	public transient com.raizlabs.android.dbflow.sql.language.Condition.In notIn(Object obj, Object aobj[])
	{
		return getCondition().notIn(obj, aobj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #173 <Method com.raizlabs.android.dbflow.sql.language.Condition$In Condition.notIn(Object, Object[])>
	//    5    9:areturn         
	}

	public com.raizlabs.android.dbflow.sql.language.Condition.In notIn(Collection collection)
	{
		return getCondition().notIn(collection);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #175 <Method com.raizlabs.android.dbflow.sql.language.Condition$In Condition.notIn(Collection)>
	//    4    8:areturn         
	}

	public Condition notLike(String s)
	{
		return getCondition().notLike(s);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Condition getCondition()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #178 <Method Condition Condition.notLike(String)>
	//    4    8:areturn         
	}

	public volatile IProperty plus(IProperty iproperty)
	{
		return ((IProperty) (plus(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #181 <Method Property plus(IProperty)>
	//    3    5:areturn         
	}

	public Property plus(IProperty iproperty)
	{
		return new Property(table, NameAlias.joinNames("+", new String[] {
			nameAlias.fullName(), ((Object) (iproperty)).toString()
		}));
	//    0    0:new             #2   <Class Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field Class table>
	//    4    8:ldc1            #183 <String "+">
	//    5   10:iconst_2        
	//    6   11:anewarray       String[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_0         
	//   10   17:getfield        #41  <Field NameAlias nameAlias>
	//   11   20:invokevirtual   #93  <Method String NameAlias.fullName()>
	//   12   23:aastore         
	//   13   24:dup             
	//   14   25:iconst_1        
	//   15   26:aload_1         
	//   16   27:invokevirtual   #98  <Method String Object.toString()>
	//   17   30:aastore         
	//   18   31:invokestatic    #102 <Method NameAlias NameAlias.joinNames(String, String[])>
	//   19   34:invokespecial   #64  <Method void Property(Class, NameAlias)>
	//   20   37:areturn         
	}

	public volatile IProperty withTable(NameAlias namealias)
	{
		return ((IProperty) (withTable(namealias)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #188 <Method Property withTable(NameAlias)>
	//    3    5:areturn         
	}

	public Property withTable(NameAlias namealias)
	{
		return new Property(table, getNameAlias().newBuilder().withTable(namealias.getQuery()).build());
	//    0    0:new             #2   <Class Property>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field Class table>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #54  <Method NameAlias getNameAlias()>
	//    6   12:invokevirtual   #60  <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder NameAlias.newBuilder()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #191 <Method String NameAlias.getQuery()>
	//    9   19:invokevirtual   #193 <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.withTable(String)>
	//   10   22:invokevirtual   #37  <Method NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//   11   25:invokespecial   #64  <Method void Property(Class, NameAlias)>
	//   12   28:areturn         
	}

	public static final Property ALL_PROPERTY = new Property(((Class) (null)), "*") {

		public volatile IProperty as(String s)
		{
			return ((IProperty) (as(s)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #15  <Method Property Property.as(String)>
		//    3    5:areturn         
		}

		public volatile IProperty concatenate(IProperty iproperty)
		{
			return ((IProperty) (concatenate(iproperty)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #20  <Method Property Property.concatenate(IProperty)>
		//    3    5:areturn         
		}

		public volatile IProperty distinct()
		{
			return ((IProperty) (distinct()));
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method Property Property.distinct()>
		//    2    4:areturn         
		}

		public volatile IProperty dividedBy(IProperty iproperty)
		{
			return ((IProperty) (dividedBy(iproperty)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #28  <Method Property Property.dividedBy(IProperty)>
		//    3    5:areturn         
		}

		public volatile IProperty minus(IProperty iproperty)
		{
			return ((IProperty) (minus(iproperty)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #31  <Method Property Property.minus(IProperty)>
		//    3    5:areturn         
		}

		public volatile IProperty mod(IProperty iproperty)
		{
			return ((IProperty) (mod(iproperty)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #34  <Method Property Property.mod(IProperty)>
		//    3    5:areturn         
		}

		public volatile IProperty multipliedBy(IProperty iproperty)
		{
			return ((IProperty) (multipliedBy(iproperty)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #37  <Method Property Property.multipliedBy(IProperty)>
		//    3    5:areturn         
		}

		public volatile IProperty plus(IProperty iproperty)
		{
			return ((IProperty) (plus(iproperty)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #40  <Method Property Property.plus(IProperty)>
		//    3    5:areturn         
		}

		public String toString()
		{
			return nameAlias.nameRaw();
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field NameAlias nameAlias>
		//    2    4:invokevirtual   #51  <Method String NameAlias.nameRaw()>
		//    3    7:areturn         
		}

		public volatile IProperty withTable(NameAlias namealias)
		{
			return ((IProperty) (withTable(namealias)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #56  <Method Property Property.withTable(NameAlias)>
		//    3    5:areturn         
		}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #9   <Method void Property(Class, String)>
			//    4    6:return          
			}
	}
;

	static 
	{
	//    0    0:new             #9   <Class Property$1>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:ldc1            #16  <String "*">
	//    4    7:invokespecial   #20  <Method void Property$1(Class, String)>
	//    5   10:putstatic       #22  <Field Property ALL_PROPERTY>
	//*   6   13:return          
	}
}
