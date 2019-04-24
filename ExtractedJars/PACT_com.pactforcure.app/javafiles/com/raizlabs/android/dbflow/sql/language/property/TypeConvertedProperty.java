// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language.property;

import com.raizlabs.android.dbflow.converter.TypeConverter;
import com.raizlabs.android.dbflow.sql.language.Condition;
import com.raizlabs.android.dbflow.sql.language.NameAlias;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language.property:
//			Property

public class TypeConvertedProperty extends Property
{
	public static interface TypeConverterGetter
	{

		public abstract TypeConverter getTypeConverter(Class class1);
	}


	public TypeConvertedProperty(Class class1, NameAlias namealias, boolean flag, TypeConverterGetter typeconvertergetter)
	{
		super(class1, namealias);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #22  <Method void Property(Class, NameAlias)>
		convertToDB = flag;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #24  <Field boolean convertToDB>
		getter = typeconvertergetter;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #26  <Field TypeConvertedProperty$TypeConverterGetter getter>
	//   10   17:return          
	}

	public TypeConvertedProperty(Class class1, String s, boolean flag, TypeConverterGetter typeconvertergetter)
	{
		super(class1, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #33  <Method void Property(Class, String)>
		convertToDB = flag;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #24  <Field boolean convertToDB>
		getter = typeconvertergetter;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #26  <Field TypeConvertedProperty$TypeConverterGetter getter>
	//   10   17:return          
	}

	protected Condition getCondition()
	{
		return Condition.column(getNameAlias(), getter.getTypeConverter(table), convertToDB);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method NameAlias getNameAlias()>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field TypeConvertedProperty$TypeConverterGetter getter>
	//    4    8:aload_0         
	//    5    9:getfield        #46  <Field Class table>
	//    6   12:invokeinterface #50  <Method TypeConverter TypeConvertedProperty$TypeConverterGetter.getTypeConverter(Class)>
	//    7   17:aload_0         
	//    8   18:getfield        #24  <Field boolean convertToDB>
	//    9   21:invokestatic    #56  <Method Condition Condition.column(NameAlias, TypeConverter, boolean)>
	//   10   24:areturn         
	}

	public Property invertProperty()
	{
		if(databaseProperty == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field TypeConvertedProperty databaseProperty>
	//*   2    4:ifnonnull       48
		{
			Class class1 = table;
	//    3    7:aload_0         
	//    4    8:getfield        #46  <Field Class table>
	//    5   11:astore_2        
			NameAlias namealias = nameAlias;
	//    6   12:aload_0         
	//    7   13:getfield        #64  <Field NameAlias nameAlias>
	//    8   16:astore_3        
			boolean flag;
			if(!convertToDB)
	//*   9   17:aload_0         
	//*  10   18:getfield        #24  <Field boolean convertToDB>
	//*  11   21:ifne            53
				flag = true;
	//   12   24:iconst_1        
	//   13   25:istore_1        
			else
	//*  14   26:aload_0         
	//*  15   27:new             #2   <Class TypeConvertedProperty>
	//*  16   30:dup             
	//*  17   31:aload_2         
	//*  18   32:aload_3         
	//*  19   33:iload_1         
	//*  20   34:new             #7   <Class TypeConvertedProperty$1>
	//*  21   37:dup             
	//*  22   38:aload_0         
	//*  23   39:invokespecial   #67  <Method void TypeConvertedProperty$1(TypeConvertedProperty)>
	//*  24   42:invokespecial   #69  <Method void TypeConvertedProperty(Class, NameAlias, boolean, TypeConvertedProperty$TypeConverterGetter)>
	//*  25   45:putfield        #60  <Field TypeConvertedProperty databaseProperty>
	//*  26   48:aload_0         
	//*  27   49:getfield        #60  <Field TypeConvertedProperty databaseProperty>
	//*  28   52:areturn         
				flag = false;
	//   29   53:iconst_0        
	//   30   54:istore_1        
			databaseProperty = new TypeConvertedProperty(class1, namealias, flag, new TypeConverterGetter() {

				public TypeConverter getTypeConverter(Class class2)
				{
					return getter.getTypeConverter(class2);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field TypeConvertedProperty this$0>
				//    2    4:invokestatic    #27  <Method TypeConvertedProperty$TypeConverterGetter TypeConvertedProperty.access$000(TypeConvertedProperty)>
				//    3    7:aload_1         
				//    4    8:invokeinterface #29  <Method TypeConverter TypeConvertedProperty$TypeConverterGetter.getTypeConverter(Class)>
				//    5   13:areturn         
				}

				final TypeConvertedProperty this$0;

			
			{
				this$0 = TypeConvertedProperty.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TypeConvertedProperty this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
		}
		return ((Property) (databaseProperty));
	//*  31   55:goto            26
	}

	private boolean convertToDB;
	private TypeConvertedProperty databaseProperty;
	private final TypeConverterGetter getter;


/*
	static TypeConverterGetter access$000(TypeConvertedProperty typeconvertedproperty)
	{
		return typeconvertedproperty.getter;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field TypeConvertedProperty$TypeConverterGetter getter>
	//    2    4:areturn         
	}

*/
}
