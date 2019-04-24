// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language.property;

import com.raizlabs.android.dbflow.sql.language.Condition;
import com.raizlabs.android.dbflow.sql.language.NameAlias;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language.property:
//			BaseProperty, IProperty

public class FloatProperty extends BaseProperty
{

	public FloatProperty(Class class1, NameAlias namealias)
	{
		super(class1, namealias);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #9   <Method void BaseProperty(Class, NameAlias)>
	//    4    6:return          
	}

	public FloatProperty(Class class1, String s)
	{
		this(class1, (new com.raizlabs.android.dbflow.sql.language.NameAlias.Builder(s)).build());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #15  <Class com.raizlabs.android.dbflow.sql.language.NameAlias$Builder>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void com.raizlabs.android.dbflow.sql.language.NameAlias$Builder(String)>
	//    6   10:invokevirtual   #22  <Method NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//    7   13:invokespecial   #23  <Method void FloatProperty(Class, NameAlias)>
	//    8   16:return          
	}

	public FloatProperty(Class class1, String s, String s1)
	{
		this(class1, (new com.raizlabs.android.dbflow.sql.language.NameAlias.Builder(s)).as(s1).build());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #15  <Class com.raizlabs.android.dbflow.sql.language.NameAlias$Builder>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void com.raizlabs.android.dbflow.sql.language.NameAlias$Builder(String)>
	//    6   10:aload_3         
	//    7   11:invokevirtual   #29  <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.as(String)>
	//    8   14:invokevirtual   #22  <Method NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//    9   17:invokespecial   #23  <Method void FloatProperty(Class, NameAlias)>
	//   10   20:return          
	}

	public FloatProperty as(String s)
	{
		return new FloatProperty(table, nameAlias.newBuilder().as(s).build());
	//    0    0:new             #2   <Class FloatProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field Class table>
	//    4    8:aload_0         
	//    5    9:getfield        #39  <Field NameAlias nameAlias>
	//    6   12:invokevirtual   #45  <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder NameAlias.newBuilder()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #29  <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.as(String)>
	//    9   19:invokevirtual   #22  <Method NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//   10   22:invokespecial   #23  <Method void FloatProperty(Class, NameAlias)>
	//   11   25:areturn         
	}

	public volatile IProperty as(String s)
	{
		return ((IProperty) (as(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #48  <Method FloatProperty as(String)>
	//    3    5:areturn         
	}

	public com.raizlabs.android.dbflow.sql.language.Condition.Between between(float f)
	{
		return Condition.column(nameAlias).between(((Object) (Float.valueOf(f))));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:fload_1         
	//    4    8:invokestatic    #62  <Method Float Float.valueOf(float)>
	//    5   11:invokevirtual   #65  <Method com.raizlabs.android.dbflow.sql.language.Condition$Between Condition.between(Object)>
	//    6   14:areturn         
	}

	public Condition concatenate(float f)
	{
		return Condition.column(nameAlias).concatenate(((Object) (Float.valueOf(f))));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:fload_1         
	//    4    8:invokestatic    #62  <Method Float Float.valueOf(float)>
	//    5   11:invokevirtual   #70  <Method Condition Condition.concatenate(Object)>
	//    6   14:areturn         
	}

	public FloatProperty concatenate(IProperty iproperty)
	{
		return new FloatProperty(table, NameAlias.joinNames("||", new String[] {
			nameAlias.fullName(), ((Object) (iproperty)).toString()
		}));
	//    0    0:new             #2   <Class FloatProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field Class table>
	//    4    8:ldc1            #73  <String "||">
	//    5   10:iconst_2        
	//    6   11:anewarray       String[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_0         
	//   10   17:getfield        #39  <Field NameAlias nameAlias>
	//   11   20:invokevirtual   #79  <Method String NameAlias.fullName()>
	//   12   23:aastore         
	//   13   24:dup             
	//   14   25:iconst_1        
	//   15   26:aload_1         
	//   16   27:invokevirtual   #84  <Method String Object.toString()>
	//   17   30:aastore         
	//   18   31:invokestatic    #88  <Method NameAlias NameAlias.joinNames(String, String[])>
	//   19   34:invokespecial   #23  <Method void FloatProperty(Class, NameAlias)>
	//   20   37:areturn         
	}

	public volatile IProperty concatenate(IProperty iproperty)
	{
		return ((IProperty) (concatenate(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #91  <Method FloatProperty concatenate(IProperty)>
	//    3    5:areturn         
	}

	public FloatProperty distinct()
	{
		return new FloatProperty(table, getDistinctAliasName());
	//    0    0:new             #2   <Class FloatProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field Class table>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #96  <Method NameAlias getDistinctAliasName()>
	//    6   12:invokespecial   #23  <Method void FloatProperty(Class, NameAlias)>
	//    7   15:areturn         
	}

	public volatile IProperty distinct()
	{
		return ((IProperty) (distinct()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #99  <Method FloatProperty distinct()>
	//    2    4:areturn         
	}

	public FloatProperty dividedBy(IProperty iproperty)
	{
		return new FloatProperty(table, NameAlias.joinNames("/", new String[] {
			nameAlias.fullName(), ((Object) (iproperty)).toString()
		}));
	//    0    0:new             #2   <Class FloatProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field Class table>
	//    4    8:ldc1            #102 <String "/">
	//    5   10:iconst_2        
	//    6   11:anewarray       String[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_0         
	//   10   17:getfield        #39  <Field NameAlias nameAlias>
	//   11   20:invokevirtual   #79  <Method String NameAlias.fullName()>
	//   12   23:aastore         
	//   13   24:dup             
	//   14   25:iconst_1        
	//   15   26:aload_1         
	//   16   27:invokevirtual   #84  <Method String Object.toString()>
	//   17   30:aastore         
	//   18   31:invokestatic    #88  <Method NameAlias NameAlias.joinNames(String, String[])>
	//   19   34:invokespecial   #23  <Method void FloatProperty(Class, NameAlias)>
	//   20   37:areturn         
	}

	public volatile IProperty dividedBy(IProperty iproperty)
	{
		return ((IProperty) (dividedBy(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #104 <Method FloatProperty dividedBy(IProperty)>
	//    3    5:areturn         
	}

	public Condition eq(float f)
	{
		return Condition.column(nameAlias).eq(((Object) (Float.valueOf(f))));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:fload_1         
	//    4    8:invokestatic    #62  <Method Float Float.valueOf(float)>
	//    5   11:invokevirtual   #107 <Method Condition Condition.eq(Object)>
	//    6   14:areturn         
	}

	public Condition eq(FloatProperty floatproperty)
	{
		return is(floatproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #111 <Method Condition is(FloatProperty)>
	//    3    5:areturn         
	}

	public Condition glob(float f)
	{
		return Condition.column(nameAlias).glob(String.valueOf(f));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:fload_1         
	//    4    8:invokestatic    #115 <Method String String.valueOf(float)>
	//    5   11:invokevirtual   #118 <Method Condition Condition.glob(String)>
	//    6   14:areturn         
	}

	public Condition greaterThan(float f)
	{
		return Condition.column(nameAlias).greaterThan(((Object) (Float.valueOf(f))));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:fload_1         
	//    4    8:invokestatic    #62  <Method Float Float.valueOf(float)>
	//    5   11:invokevirtual   #121 <Method Condition Condition.greaterThan(Object)>
	//    6   14:areturn         
	}

	public Condition greaterThan(FloatProperty floatproperty)
	{
		return Condition.column(nameAlias).greaterThan(((com.raizlabs.android.dbflow.sql.language.IConditional) (floatproperty)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #124 <Method Condition Condition.greaterThan(com.raizlabs.android.dbflow.sql.language.IConditional)>
	//    5   11:areturn         
	}

	public Condition greaterThanOrEq(float f)
	{
		return Condition.column(nameAlias).greaterThanOrEq(((Object) (Float.valueOf(f))));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:fload_1         
	//    4    8:invokestatic    #62  <Method Float Float.valueOf(float)>
	//    5   11:invokevirtual   #127 <Method Condition Condition.greaterThanOrEq(Object)>
	//    6   14:areturn         
	}

	public Condition greaterThanOrEq(FloatProperty floatproperty)
	{
		return Condition.column(nameAlias).greaterThanOrEq(((com.raizlabs.android.dbflow.sql.language.IConditional) (floatproperty)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #129 <Method Condition Condition.greaterThanOrEq(com.raizlabs.android.dbflow.sql.language.IConditional)>
	//    5   11:areturn         
	}

	public transient com.raizlabs.android.dbflow.sql.language.Condition.In in(float f, float af[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		com.raizlabs.android.dbflow.sql.language.Condition.In in1 = Condition.column(nameAlias).in(((Object) (Float.valueOf(f))), new Object[0]);
	//    2    2:aload_0         
	//    3    3:getfield        #39  <Field NameAlias nameAlias>
	//    4    6:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    5    9:fload_1         
	//    6   10:invokestatic    #62  <Method Float Float.valueOf(float)>
	//    7   13:iconst_0        
	//    8   14:anewarray       Object[]
	//    9   17:invokevirtual   #134 <Method com.raizlabs.android.dbflow.sql.language.Condition$In Condition.in(Object, Object[])>
	//   10   20:astore          5
		for(int j = af.length; i < j; i++)
	//*  11   22:aload_2         
	//*  12   23:arraylength     
	//*  13   24:istore          4
	//*  14   26:iload_3         
	//*  15   27:iload           4
	//*  16   29:icmpge          51
			in1.and(((Object) (Float.valueOf(af[i]))));
	//   17   32:aload           5
	//   18   34:aload_2         
	//   19   35:iload_3         
	//   20   36:faload          
	//   21   37:invokestatic    #62  <Method Float Float.valueOf(float)>
	//   22   40:invokevirtual   #140 <Method com.raizlabs.android.dbflow.sql.language.Condition$In com.raizlabs.android.dbflow.sql.language.Condition$In.and(Object)>
	//   23   43:pop             

	//   24   44:iload_3         
	//   25   45:iconst_1        
	//   26   46:iadd            
	//   27   47:istore_3        
	//*  28   48:goto            26
		return in1;
	//   29   51:aload           5
	//   30   53:areturn         
	}

	public Condition is(float f)
	{
		return Condition.column(nameAlias).is(((Object) (Float.valueOf(f))));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:fload_1         
	//    4    8:invokestatic    #62  <Method Float Float.valueOf(float)>
	//    5   11:invokevirtual   #142 <Method Condition Condition.is(Object)>
	//    6   14:areturn         
	}

	public Condition is(FloatProperty floatproperty)
	{
		return Condition.column(nameAlias).is(((com.raizlabs.android.dbflow.sql.language.IConditional) (floatproperty)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #144 <Method Condition Condition.is(com.raizlabs.android.dbflow.sql.language.IConditional)>
	//    5   11:areturn         
	}

	public Condition isNot(float f)
	{
		return Condition.column(nameAlias).isNot(((Object) (Float.valueOf(f))));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:fload_1         
	//    4    8:invokestatic    #62  <Method Float Float.valueOf(float)>
	//    5   11:invokevirtual   #147 <Method Condition Condition.isNot(Object)>
	//    6   14:areturn         
	}

	public Condition isNot(FloatProperty floatproperty)
	{
		return Condition.column(nameAlias).isNot(((com.raizlabs.android.dbflow.sql.language.IConditional) (floatproperty)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #149 <Method Condition Condition.isNot(com.raizlabs.android.dbflow.sql.language.IConditional)>
	//    5   11:areturn         
	}

	public Condition lessThan(float f)
	{
		return Condition.column(nameAlias).lessThan(((Object) (Float.valueOf(f))));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:fload_1         
	//    4    8:invokestatic    #62  <Method Float Float.valueOf(float)>
	//    5   11:invokevirtual   #152 <Method Condition Condition.lessThan(Object)>
	//    6   14:areturn         
	}

	public Condition lessThan(FloatProperty floatproperty)
	{
		return Condition.column(nameAlias).lessThan(((com.raizlabs.android.dbflow.sql.language.IConditional) (floatproperty)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #154 <Method Condition Condition.lessThan(com.raizlabs.android.dbflow.sql.language.IConditional)>
	//    5   11:areturn         
	}

	public Condition lessThanOrEq(float f)
	{
		return Condition.column(nameAlias).lessThanOrEq(((Object) (Float.valueOf(f))));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:fload_1         
	//    4    8:invokestatic    #62  <Method Float Float.valueOf(float)>
	//    5   11:invokevirtual   #157 <Method Condition Condition.lessThanOrEq(Object)>
	//    6   14:areturn         
	}

	public Condition lessThanOrEq(FloatProperty floatproperty)
	{
		return Condition.column(nameAlias).lessThanOrEq(((com.raizlabs.android.dbflow.sql.language.IConditional) (floatproperty)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #159 <Method Condition Condition.lessThanOrEq(com.raizlabs.android.dbflow.sql.language.IConditional)>
	//    5   11:areturn         
	}

	public Condition like(float f)
	{
		return Condition.column(nameAlias).like(String.valueOf(f));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:fload_1         
	//    4    8:invokestatic    #115 <Method String String.valueOf(float)>
	//    5   11:invokevirtual   #162 <Method Condition Condition.like(String)>
	//    6   14:areturn         
	}

	public FloatProperty minus(IProperty iproperty)
	{
		return new FloatProperty(table, NameAlias.joinNames("-", new String[] {
			nameAlias.fullName(), ((Object) (iproperty)).toString()
		}));
	//    0    0:new             #2   <Class FloatProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field Class table>
	//    4    8:ldc1            #165 <String "-">
	//    5   10:iconst_2        
	//    6   11:anewarray       String[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_0         
	//   10   17:getfield        #39  <Field NameAlias nameAlias>
	//   11   20:invokevirtual   #79  <Method String NameAlias.fullName()>
	//   12   23:aastore         
	//   13   24:dup             
	//   14   25:iconst_1        
	//   15   26:aload_1         
	//   16   27:invokevirtual   #84  <Method String Object.toString()>
	//   17   30:aastore         
	//   18   31:invokestatic    #88  <Method NameAlias NameAlias.joinNames(String, String[])>
	//   19   34:invokespecial   #23  <Method void FloatProperty(Class, NameAlias)>
	//   20   37:areturn         
	}

	public volatile IProperty minus(IProperty iproperty)
	{
		return ((IProperty) (minus(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #167 <Method FloatProperty minus(IProperty)>
	//    3    5:areturn         
	}

	public FloatProperty mod(IProperty iproperty)
	{
		return new FloatProperty(table, NameAlias.joinNames("%", new String[] {
			nameAlias.fullName(), ((Object) (iproperty)).toString()
		}));
	//    0    0:new             #2   <Class FloatProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field Class table>
	//    4    8:ldc1            #170 <String "%">
	//    5   10:iconst_2        
	//    6   11:anewarray       String[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_0         
	//   10   17:getfield        #39  <Field NameAlias nameAlias>
	//   11   20:invokevirtual   #79  <Method String NameAlias.fullName()>
	//   12   23:aastore         
	//   13   24:dup             
	//   14   25:iconst_1        
	//   15   26:aload_1         
	//   16   27:invokevirtual   #84  <Method String Object.toString()>
	//   17   30:aastore         
	//   18   31:invokestatic    #88  <Method NameAlias NameAlias.joinNames(String, String[])>
	//   19   34:invokespecial   #23  <Method void FloatProperty(Class, NameAlias)>
	//   20   37:areturn         
	}

	public volatile IProperty mod(IProperty iproperty)
	{
		return ((IProperty) (mod(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #172 <Method FloatProperty mod(IProperty)>
	//    3    5:areturn         
	}

	public FloatProperty multipliedBy(IProperty iproperty)
	{
		return new FloatProperty(table, NameAlias.joinNames("*", new String[] {
			nameAlias.fullName(), ((Object) (iproperty)).toString()
		}));
	//    0    0:new             #2   <Class FloatProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field Class table>
	//    4    8:ldc1            #175 <String "*">
	//    5   10:iconst_2        
	//    6   11:anewarray       String[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_0         
	//   10   17:getfield        #39  <Field NameAlias nameAlias>
	//   11   20:invokevirtual   #79  <Method String NameAlias.fullName()>
	//   12   23:aastore         
	//   13   24:dup             
	//   14   25:iconst_1        
	//   15   26:aload_1         
	//   16   27:invokevirtual   #84  <Method String Object.toString()>
	//   17   30:aastore         
	//   18   31:invokestatic    #88  <Method NameAlias NameAlias.joinNames(String, String[])>
	//   19   34:invokespecial   #23  <Method void FloatProperty(Class, NameAlias)>
	//   20   37:areturn         
	}

	public volatile IProperty multipliedBy(IProperty iproperty)
	{
		return ((IProperty) (multipliedBy(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #177 <Method FloatProperty multipliedBy(IProperty)>
	//    3    5:areturn         
	}

	public Condition notEq(float f)
	{
		return Condition.column(nameAlias).notEq(((Object) (Float.valueOf(f))));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:fload_1         
	//    4    8:invokestatic    #62  <Method Float Float.valueOf(float)>
	//    5   11:invokevirtual   #180 <Method Condition Condition.notEq(Object)>
	//    6   14:areturn         
	}

	public Condition notEq(FloatProperty floatproperty)
	{
		return isNot(floatproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #182 <Method Condition isNot(FloatProperty)>
	//    3    5:areturn         
	}

	public transient com.raizlabs.android.dbflow.sql.language.Condition.In notIn(float f, float af[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		com.raizlabs.android.dbflow.sql.language.Condition.In in1 = Condition.column(nameAlias).notIn(((Object) (Float.valueOf(f))), new Object[0]);
	//    2    2:aload_0         
	//    3    3:getfield        #39  <Field NameAlias nameAlias>
	//    4    6:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    5    9:fload_1         
	//    6   10:invokestatic    #62  <Method Float Float.valueOf(float)>
	//    7   13:iconst_0        
	//    8   14:anewarray       Object[]
	//    9   17:invokevirtual   #185 <Method com.raizlabs.android.dbflow.sql.language.Condition$In Condition.notIn(Object, Object[])>
	//   10   20:astore          5
		for(int j = af.length; i < j; i++)
	//*  11   22:aload_2         
	//*  12   23:arraylength     
	//*  13   24:istore          4
	//*  14   26:iload_3         
	//*  15   27:iload           4
	//*  16   29:icmpge          51
			in1.and(((Object) (Float.valueOf(af[i]))));
	//   17   32:aload           5
	//   18   34:aload_2         
	//   19   35:iload_3         
	//   20   36:faload          
	//   21   37:invokestatic    #62  <Method Float Float.valueOf(float)>
	//   22   40:invokevirtual   #140 <Method com.raizlabs.android.dbflow.sql.language.Condition$In com.raizlabs.android.dbflow.sql.language.Condition$In.and(Object)>
	//   23   43:pop             

	//   24   44:iload_3         
	//   25   45:iconst_1        
	//   26   46:iadd            
	//   27   47:istore_3        
	//*  28   48:goto            26
		return in1;
	//   29   51:aload           5
	//   30   53:areturn         
	}

	public Condition notLike(float f)
	{
		return Condition.column(nameAlias).notLike(String.valueOf(f));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:fload_1         
	//    4    8:invokestatic    #115 <Method String String.valueOf(float)>
	//    5   11:invokevirtual   #188 <Method Condition Condition.notLike(String)>
	//    6   14:areturn         
	}

	public FloatProperty plus(IProperty iproperty)
	{
		return new FloatProperty(table, NameAlias.joinNames("+", new String[] {
			nameAlias.fullName(), ((Object) (iproperty)).toString()
		}));
	//    0    0:new             #2   <Class FloatProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field Class table>
	//    4    8:ldc1            #191 <String "+">
	//    5   10:iconst_2        
	//    6   11:anewarray       String[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_0         
	//   10   17:getfield        #39  <Field NameAlias nameAlias>
	//   11   20:invokevirtual   #79  <Method String NameAlias.fullName()>
	//   12   23:aastore         
	//   13   24:dup             
	//   14   25:iconst_1        
	//   15   26:aload_1         
	//   16   27:invokevirtual   #84  <Method String Object.toString()>
	//   17   30:aastore         
	//   18   31:invokestatic    #88  <Method NameAlias NameAlias.joinNames(String, String[])>
	//   19   34:invokespecial   #23  <Method void FloatProperty(Class, NameAlias)>
	//   20   37:areturn         
	}

	public volatile IProperty plus(IProperty iproperty)
	{
		return ((IProperty) (plus(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #193 <Method FloatProperty plus(IProperty)>
	//    3    5:areturn         
	}

	public FloatProperty withTable(NameAlias namealias)
	{
		return new FloatProperty(table, nameAlias.newBuilder().withTable(namealias.getQuery()).build());
	//    0    0:new             #2   <Class FloatProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field Class table>
	//    4    8:aload_0         
	//    5    9:getfield        #39  <Field NameAlias nameAlias>
	//    6   12:invokevirtual   #45  <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder NameAlias.newBuilder()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #198 <Method String NameAlias.getQuery()>
	//    9   19:invokevirtual   #200 <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.withTable(String)>
	//   10   22:invokevirtual   #22  <Method NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//   11   25:invokespecial   #23  <Method void FloatProperty(Class, NameAlias)>
	//   12   28:areturn         
	}

	public volatile IProperty withTable(NameAlias namealias)
	{
		return ((IProperty) (withTable(namealias)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #203 <Method FloatProperty withTable(NameAlias)>
	//    3    5:areturn         
	}
}
