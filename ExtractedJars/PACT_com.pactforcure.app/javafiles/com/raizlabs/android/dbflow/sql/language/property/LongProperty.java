// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language.property;

import com.raizlabs.android.dbflow.sql.language.Condition;
import com.raizlabs.android.dbflow.sql.language.NameAlias;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language.property:
//			BaseProperty, IProperty

public class LongProperty extends BaseProperty
{

	public LongProperty(Class class1, NameAlias namealias)
	{
		super(class1, namealias);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #9   <Method void BaseProperty(Class, NameAlias)>
	//    4    6:return          
	}

	public LongProperty(Class class1, String s)
	{
		this(class1, (new com.raizlabs.android.dbflow.sql.language.NameAlias.Builder(s)).build());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #15  <Class com.raizlabs.android.dbflow.sql.language.NameAlias$Builder>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void com.raizlabs.android.dbflow.sql.language.NameAlias$Builder(String)>
	//    6   10:invokevirtual   #22  <Method NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//    7   13:invokespecial   #23  <Method void LongProperty(Class, NameAlias)>
	//    8   16:return          
	}

	public LongProperty(Class class1, String s, String s1)
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
	//    9   17:invokespecial   #23  <Method void LongProperty(Class, NameAlias)>
	//   10   20:return          
	}

	public volatile IProperty as(String s)
	{
		return ((IProperty) (as(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #34  <Method LongProperty as(String)>
	//    3    5:areturn         
	}

	public LongProperty as(String s)
	{
		return new LongProperty(table, nameAlias.newBuilder().as(s).build());
	//    0    0:new             #2   <Class LongProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field Class table>
	//    4    8:aload_0         
	//    5    9:getfield        #42  <Field NameAlias nameAlias>
	//    6   12:invokevirtual   #48  <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder NameAlias.newBuilder()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #29  <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.as(String)>
	//    9   19:invokevirtual   #22  <Method NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//   10   22:invokespecial   #23  <Method void LongProperty(Class, NameAlias)>
	//   11   25:areturn         
	}

	public com.raizlabs.android.dbflow.sql.language.Condition.Between between(long l)
	{
		return Condition.column(nameAlias).between(((Object) (Long.valueOf(l))));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:lload_1         
	//    4    8:invokestatic    #62  <Method Long Long.valueOf(long)>
	//    5   11:invokevirtual   #65  <Method com.raizlabs.android.dbflow.sql.language.Condition$Between Condition.between(Object)>
	//    6   14:areturn         
	}

	public Condition concatenate(long l)
	{
		return Condition.column(nameAlias).concatenate(((Object) (Long.valueOf(l))));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:lload_1         
	//    4    8:invokestatic    #62  <Method Long Long.valueOf(long)>
	//    5   11:invokevirtual   #70  <Method Condition Condition.concatenate(Object)>
	//    6   14:areturn         
	}

	public volatile IProperty concatenate(IProperty iproperty)
	{
		return ((IProperty) (concatenate(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #74  <Method LongProperty concatenate(IProperty)>
	//    3    5:areturn         
	}

	public LongProperty concatenate(IProperty iproperty)
	{
		return new LongProperty(table, NameAlias.joinNames("||", new String[] {
			nameAlias.fullName(), ((Object) (iproperty)).toString()
		}));
	//    0    0:new             #2   <Class LongProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field Class table>
	//    4    8:ldc1            #76  <String "||">
	//    5   10:iconst_2        
	//    6   11:anewarray       String[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_0         
	//   10   17:getfield        #42  <Field NameAlias nameAlias>
	//   11   20:invokevirtual   #82  <Method String NameAlias.fullName()>
	//   12   23:aastore         
	//   13   24:dup             
	//   14   25:iconst_1        
	//   15   26:aload_1         
	//   16   27:invokevirtual   #87  <Method String Object.toString()>
	//   17   30:aastore         
	//   18   31:invokestatic    #91  <Method NameAlias NameAlias.joinNames(String, String[])>
	//   19   34:invokespecial   #23  <Method void LongProperty(Class, NameAlias)>
	//   20   37:areturn         
	}

	public volatile IProperty distinct()
	{
		return ((IProperty) (distinct()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #96  <Method LongProperty distinct()>
	//    2    4:areturn         
	}

	public LongProperty distinct()
	{
		return new LongProperty(table, getDistinctAliasName());
	//    0    0:new             #2   <Class LongProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field Class table>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #99  <Method NameAlias getDistinctAliasName()>
	//    6   12:invokespecial   #23  <Method void LongProperty(Class, NameAlias)>
	//    7   15:areturn         
	}

	public volatile IProperty dividedBy(IProperty iproperty)
	{
		return ((IProperty) (dividedBy(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #102 <Method LongProperty dividedBy(IProperty)>
	//    3    5:areturn         
	}

	public LongProperty dividedBy(IProperty iproperty)
	{
		return new LongProperty(table, NameAlias.joinNames("/", new String[] {
			nameAlias.fullName(), ((Object) (iproperty)).toString()
		}));
	//    0    0:new             #2   <Class LongProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field Class table>
	//    4    8:ldc1            #104 <String "/">
	//    5   10:iconst_2        
	//    6   11:anewarray       String[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_0         
	//   10   17:getfield        #42  <Field NameAlias nameAlias>
	//   11   20:invokevirtual   #82  <Method String NameAlias.fullName()>
	//   12   23:aastore         
	//   13   24:dup             
	//   14   25:iconst_1        
	//   15   26:aload_1         
	//   16   27:invokevirtual   #87  <Method String Object.toString()>
	//   17   30:aastore         
	//   18   31:invokestatic    #91  <Method NameAlias NameAlias.joinNames(String, String[])>
	//   19   34:invokespecial   #23  <Method void LongProperty(Class, NameAlias)>
	//   20   37:areturn         
	}

	public Condition eq(long l)
	{
		return Condition.column(nameAlias).eq(((Object) (Long.valueOf(l))));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:lload_1         
	//    4    8:invokestatic    #62  <Method Long Long.valueOf(long)>
	//    5   11:invokevirtual   #107 <Method Condition Condition.eq(Object)>
	//    6   14:areturn         
	}

	public Condition eq(LongProperty longproperty)
	{
		return is(longproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #111 <Method Condition is(LongProperty)>
	//    3    5:areturn         
	}

	public Condition glob(long l)
	{
		return Condition.column(nameAlias).glob(String.valueOf(l));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:lload_1         
	//    4    8:invokestatic    #115 <Method String String.valueOf(long)>
	//    5   11:invokevirtual   #118 <Method Condition Condition.glob(String)>
	//    6   14:areturn         
	}

	public Condition greaterThan(long l)
	{
		return Condition.column(nameAlias).greaterThan(((Object) (Long.valueOf(l))));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:lload_1         
	//    4    8:invokestatic    #62  <Method Long Long.valueOf(long)>
	//    5   11:invokevirtual   #121 <Method Condition Condition.greaterThan(Object)>
	//    6   14:areturn         
	}

	public Condition greaterThan(LongProperty longproperty)
	{
		return Condition.column(nameAlias).greaterThan(((com.raizlabs.android.dbflow.sql.language.IConditional) (longproperty)));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #124 <Method Condition Condition.greaterThan(com.raizlabs.android.dbflow.sql.language.IConditional)>
	//    5   11:areturn         
	}

	public Condition greaterThanOrEq(long l)
	{
		return Condition.column(nameAlias).greaterThanOrEq(((Object) (Long.valueOf(l))));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:lload_1         
	//    4    8:invokestatic    #62  <Method Long Long.valueOf(long)>
	//    5   11:invokevirtual   #127 <Method Condition Condition.greaterThanOrEq(Object)>
	//    6   14:areturn         
	}

	public Condition greaterThanOrEq(LongProperty longproperty)
	{
		return Condition.column(nameAlias).greaterThanOrEq(((com.raizlabs.android.dbflow.sql.language.IConditional) (longproperty)));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #129 <Method Condition Condition.greaterThanOrEq(com.raizlabs.android.dbflow.sql.language.IConditional)>
	//    5   11:areturn         
	}

	public transient com.raizlabs.android.dbflow.sql.language.Condition.In in(long l, long al[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		com.raizlabs.android.dbflow.sql.language.Condition.In in1 = Condition.column(nameAlias).in(((Object) (Long.valueOf(l))), new Object[0]);
	//    2    3:aload_0         
	//    3    4:getfield        #42  <Field NameAlias nameAlias>
	//    4    7:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    5   10:lload_1         
	//    6   11:invokestatic    #62  <Method Long Long.valueOf(long)>
	//    7   14:iconst_0        
	//    8   15:anewarray       Object[]
	//    9   18:invokevirtual   #134 <Method com.raizlabs.android.dbflow.sql.language.Condition$In Condition.in(Object, Object[])>
	//   10   21:astore          6
		for(int j = al.length; i < j; i++)
	//*  11   23:aload_3         
	//*  12   24:arraylength     
	//*  13   25:istore          5
	//*  14   27:iload           4
	//*  15   29:iload           5
	//*  16   31:icmpge          56
			in1.and(((Object) (Long.valueOf(al[i]))));
	//   17   34:aload           6
	//   18   36:aload_3         
	//   19   37:iload           4
	//   20   39:laload          
	//   21   40:invokestatic    #62  <Method Long Long.valueOf(long)>
	//   22   43:invokevirtual   #140 <Method com.raizlabs.android.dbflow.sql.language.Condition$In com.raizlabs.android.dbflow.sql.language.Condition$In.and(Object)>
	//   23   46:pop             

	//   24   47:iload           4
	//   25   49:iconst_1        
	//   26   50:iadd            
	//   27   51:istore          4
	//*  28   53:goto            27
		return in1;
	//   29   56:aload           6
	//   30   58:areturn         
	}

	public Condition is(long l)
	{
		return Condition.column(nameAlias).is(((Object) (Long.valueOf(l))));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:lload_1         
	//    4    8:invokestatic    #62  <Method Long Long.valueOf(long)>
	//    5   11:invokevirtual   #142 <Method Condition Condition.is(Object)>
	//    6   14:areturn         
	}

	public Condition is(LongProperty longproperty)
	{
		return Condition.column(nameAlias).is(((com.raizlabs.android.dbflow.sql.language.IConditional) (longproperty)));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #144 <Method Condition Condition.is(com.raizlabs.android.dbflow.sql.language.IConditional)>
	//    5   11:areturn         
	}

	public Condition isNot(long l)
	{
		return Condition.column(nameAlias).isNot(((Object) (Long.valueOf(l))));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:lload_1         
	//    4    8:invokestatic    #62  <Method Long Long.valueOf(long)>
	//    5   11:invokevirtual   #147 <Method Condition Condition.isNot(Object)>
	//    6   14:areturn         
	}

	public Condition isNot(LongProperty longproperty)
	{
		return Condition.column(nameAlias).isNot(((com.raizlabs.android.dbflow.sql.language.IConditional) (longproperty)));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #149 <Method Condition Condition.isNot(com.raizlabs.android.dbflow.sql.language.IConditional)>
	//    5   11:areturn         
	}

	public Condition lessThan(long l)
	{
		return Condition.column(nameAlias).lessThan(((Object) (Long.valueOf(l))));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:lload_1         
	//    4    8:invokestatic    #62  <Method Long Long.valueOf(long)>
	//    5   11:invokevirtual   #152 <Method Condition Condition.lessThan(Object)>
	//    6   14:areturn         
	}

	public Condition lessThan(LongProperty longproperty)
	{
		return Condition.column(nameAlias).lessThan(((com.raizlabs.android.dbflow.sql.language.IConditional) (longproperty)));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #154 <Method Condition Condition.lessThan(com.raizlabs.android.dbflow.sql.language.IConditional)>
	//    5   11:areturn         
	}

	public Condition lessThanOrEq(long l)
	{
		return Condition.column(nameAlias).lessThanOrEq(((Object) (Long.valueOf(l))));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:lload_1         
	//    4    8:invokestatic    #62  <Method Long Long.valueOf(long)>
	//    5   11:invokevirtual   #157 <Method Condition Condition.lessThanOrEq(Object)>
	//    6   14:areturn         
	}

	public Condition lessThanOrEq(LongProperty longproperty)
	{
		return Condition.column(nameAlias).lessThanOrEq(((com.raizlabs.android.dbflow.sql.language.IConditional) (longproperty)));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #159 <Method Condition Condition.lessThanOrEq(com.raizlabs.android.dbflow.sql.language.IConditional)>
	//    5   11:areturn         
	}

	public Condition like(long l)
	{
		return Condition.column(nameAlias).like(String.valueOf(l));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:lload_1         
	//    4    8:invokestatic    #115 <Method String String.valueOf(long)>
	//    5   11:invokevirtual   #162 <Method Condition Condition.like(String)>
	//    6   14:areturn         
	}

	public volatile IProperty minus(IProperty iproperty)
	{
		return ((IProperty) (minus(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #165 <Method LongProperty minus(IProperty)>
	//    3    5:areturn         
	}

	public LongProperty minus(IProperty iproperty)
	{
		return new LongProperty(table, NameAlias.joinNames("-", new String[] {
			nameAlias.fullName(), ((Object) (iproperty)).toString()
		}));
	//    0    0:new             #2   <Class LongProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field Class table>
	//    4    8:ldc1            #167 <String "-">
	//    5   10:iconst_2        
	//    6   11:anewarray       String[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_0         
	//   10   17:getfield        #42  <Field NameAlias nameAlias>
	//   11   20:invokevirtual   #82  <Method String NameAlias.fullName()>
	//   12   23:aastore         
	//   13   24:dup             
	//   14   25:iconst_1        
	//   15   26:aload_1         
	//   16   27:invokevirtual   #87  <Method String Object.toString()>
	//   17   30:aastore         
	//   18   31:invokestatic    #91  <Method NameAlias NameAlias.joinNames(String, String[])>
	//   19   34:invokespecial   #23  <Method void LongProperty(Class, NameAlias)>
	//   20   37:areturn         
	}

	public volatile IProperty mod(IProperty iproperty)
	{
		return ((IProperty) (mod(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #170 <Method LongProperty mod(IProperty)>
	//    3    5:areturn         
	}

	public LongProperty mod(IProperty iproperty)
	{
		return new LongProperty(table, NameAlias.joinNames("%", new String[] {
			nameAlias.fullName(), ((Object) (iproperty)).toString()
		}));
	//    0    0:new             #2   <Class LongProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field Class table>
	//    4    8:ldc1            #172 <String "%">
	//    5   10:iconst_2        
	//    6   11:anewarray       String[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_0         
	//   10   17:getfield        #42  <Field NameAlias nameAlias>
	//   11   20:invokevirtual   #82  <Method String NameAlias.fullName()>
	//   12   23:aastore         
	//   13   24:dup             
	//   14   25:iconst_1        
	//   15   26:aload_1         
	//   16   27:invokevirtual   #87  <Method String Object.toString()>
	//   17   30:aastore         
	//   18   31:invokestatic    #91  <Method NameAlias NameAlias.joinNames(String, String[])>
	//   19   34:invokespecial   #23  <Method void LongProperty(Class, NameAlias)>
	//   20   37:areturn         
	}

	public volatile IProperty multipliedBy(IProperty iproperty)
	{
		return ((IProperty) (multipliedBy(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #175 <Method LongProperty multipliedBy(IProperty)>
	//    3    5:areturn         
	}

	public LongProperty multipliedBy(IProperty iproperty)
	{
		return new LongProperty(table, NameAlias.joinNames("/", new String[] {
			nameAlias.fullName(), ((Object) (iproperty)).toString()
		}));
	//    0    0:new             #2   <Class LongProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field Class table>
	//    4    8:ldc1            #104 <String "/">
	//    5   10:iconst_2        
	//    6   11:anewarray       String[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_0         
	//   10   17:getfield        #42  <Field NameAlias nameAlias>
	//   11   20:invokevirtual   #82  <Method String NameAlias.fullName()>
	//   12   23:aastore         
	//   13   24:dup             
	//   14   25:iconst_1        
	//   15   26:aload_1         
	//   16   27:invokevirtual   #87  <Method String Object.toString()>
	//   17   30:aastore         
	//   18   31:invokestatic    #91  <Method NameAlias NameAlias.joinNames(String, String[])>
	//   19   34:invokespecial   #23  <Method void LongProperty(Class, NameAlias)>
	//   20   37:areturn         
	}

	public Condition notEq(long l)
	{
		return Condition.column(nameAlias).notEq(((Object) (Long.valueOf(l))));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:lload_1         
	//    4    8:invokestatic    #62  <Method Long Long.valueOf(long)>
	//    5   11:invokevirtual   #178 <Method Condition Condition.notEq(Object)>
	//    6   14:areturn         
	}

	public Condition notEq(LongProperty longproperty)
	{
		return isNot(longproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #180 <Method Condition isNot(LongProperty)>
	//    3    5:areturn         
	}

	public transient com.raizlabs.android.dbflow.sql.language.Condition.In notIn(long l, long al[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		com.raizlabs.android.dbflow.sql.language.Condition.In in1 = Condition.column(nameAlias).notIn(((Object) (Long.valueOf(l))), new Object[0]);
	//    2    3:aload_0         
	//    3    4:getfield        #42  <Field NameAlias nameAlias>
	//    4    7:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    5   10:lload_1         
	//    6   11:invokestatic    #62  <Method Long Long.valueOf(long)>
	//    7   14:iconst_0        
	//    8   15:anewarray       Object[]
	//    9   18:invokevirtual   #183 <Method com.raizlabs.android.dbflow.sql.language.Condition$In Condition.notIn(Object, Object[])>
	//   10   21:astore          6
		for(int j = al.length; i < j; i++)
	//*  11   23:aload_3         
	//*  12   24:arraylength     
	//*  13   25:istore          5
	//*  14   27:iload           4
	//*  15   29:iload           5
	//*  16   31:icmpge          56
			in1.and(((Object) (Long.valueOf(al[i]))));
	//   17   34:aload           6
	//   18   36:aload_3         
	//   19   37:iload           4
	//   20   39:laload          
	//   21   40:invokestatic    #62  <Method Long Long.valueOf(long)>
	//   22   43:invokevirtual   #140 <Method com.raizlabs.android.dbflow.sql.language.Condition$In com.raizlabs.android.dbflow.sql.language.Condition$In.and(Object)>
	//   23   46:pop             

	//   24   47:iload           4
	//   25   49:iconst_1        
	//   26   50:iadd            
	//   27   51:istore          4
	//*  28   53:goto            27
		return in1;
	//   29   56:aload           6
	//   30   58:areturn         
	}

	public Condition notLike(long l)
	{
		return Condition.column(nameAlias).notLike(String.valueOf(l));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field NameAlias nameAlias>
	//    2    4:invokestatic    #56  <Method Condition Condition.column(NameAlias)>
	//    3    7:lload_1         
	//    4    8:invokestatic    #115 <Method String String.valueOf(long)>
	//    5   11:invokevirtual   #186 <Method Condition Condition.notLike(String)>
	//    6   14:areturn         
	}

	public volatile IProperty plus(IProperty iproperty)
	{
		return ((IProperty) (plus(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #189 <Method LongProperty plus(IProperty)>
	//    3    5:areturn         
	}

	public LongProperty plus(IProperty iproperty)
	{
		return new LongProperty(table, NameAlias.joinNames("+", new String[] {
			nameAlias.fullName(), ((Object) (iproperty)).toString()
		}));
	//    0    0:new             #2   <Class LongProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field Class table>
	//    4    8:ldc1            #191 <String "+">
	//    5   10:iconst_2        
	//    6   11:anewarray       String[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_0         
	//   10   17:getfield        #42  <Field NameAlias nameAlias>
	//   11   20:invokevirtual   #82  <Method String NameAlias.fullName()>
	//   12   23:aastore         
	//   13   24:dup             
	//   14   25:iconst_1        
	//   15   26:aload_1         
	//   16   27:invokevirtual   #87  <Method String Object.toString()>
	//   17   30:aastore         
	//   18   31:invokestatic    #91  <Method NameAlias NameAlias.joinNames(String, String[])>
	//   19   34:invokespecial   #23  <Method void LongProperty(Class, NameAlias)>
	//   20   37:areturn         
	}

	public volatile IProperty withTable(NameAlias namealias)
	{
		return ((IProperty) (withTable(namealias)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #196 <Method LongProperty withTable(NameAlias)>
	//    3    5:areturn         
	}

	public LongProperty withTable(NameAlias namealias)
	{
		return new LongProperty(table, nameAlias.newBuilder().withTable(namealias.getQuery()).build());
	//    0    0:new             #2   <Class LongProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field Class table>
	//    4    8:aload_0         
	//    5    9:getfield        #42  <Field NameAlias nameAlias>
	//    6   12:invokevirtual   #48  <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder NameAlias.newBuilder()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #199 <Method String NameAlias.getQuery()>
	//    9   19:invokevirtual   #201 <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.withTable(String)>
	//   10   22:invokevirtual   #22  <Method NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//   11   25:invokespecial   #23  <Method void LongProperty(Class, NameAlias)>
	//   12   28:areturn         
	}
}
