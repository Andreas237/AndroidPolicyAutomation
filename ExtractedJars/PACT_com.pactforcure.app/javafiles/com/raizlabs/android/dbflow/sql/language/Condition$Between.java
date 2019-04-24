// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.sql.QueryBuilder;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			BaseCondition, Condition

public static class Condition$Between extends BaseCondition
{

	public Condition$Between and(Object obj)
	{
		secondValue = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field Object secondValue>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void appendConditionToQuery(QueryBuilder querybuilder)
	{
		querybuilder.append(((Object) (columnName()))).append(((Object) (operation()))).append(((Object) (convertObjectToString(value(), true)))).appendSpaceSeparated("AND").append(((Object) (convertObjectToString(secondValue(), true)))).appendSpace().appendOptional(((Object) (postArgument())));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #61  <Method String columnName()>
	//    3    5:invokevirtual   #67  <Method QueryBuilder QueryBuilder.append(Object)>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #69  <Method String operation()>
	//    6   12:invokevirtual   #67  <Method QueryBuilder QueryBuilder.append(Object)>
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #72  <Method Object value()>
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #76  <Method String convertObjectToString(Object, boolean)>
	//   12   24:invokevirtual   #67  <Method QueryBuilder QueryBuilder.append(Object)>
	//   13   27:ldc1            #78  <String "AND">
	//   14   29:invokevirtual   #81  <Method QueryBuilder QueryBuilder.appendSpaceSeparated(Object)>
	//   15   32:aload_0         
	//   16   33:aload_0         
	//   17   34:invokevirtual   #83  <Method Object secondValue()>
	//   18   37:iconst_1        
	//   19   38:invokevirtual   #76  <Method String convertObjectToString(Object, boolean)>
	//   20   41:invokevirtual   #67  <Method QueryBuilder QueryBuilder.append(Object)>
	//   21   44:invokevirtual   #87  <Method QueryBuilder QueryBuilder.appendSpace()>
	//   22   47:aload_0         
	//   23   48:invokevirtual   #88  <Method String postArgument()>
	//   24   51:invokevirtual   #91  <Method QueryBuilder QueryBuilder.appendOptional(Object)>
	//   25   54:pop             
	//   26   55:return          
	}

	public Object secondValue()
	{
		return secondValue;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Object secondValue>
	//    2    4:areturn         
	}

	private Object secondValue;

	private Condition$Between(Condition condition, Object obj)
	{
		super(condition.nameAlias);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #15  <Field NameAlias Condition.nameAlias>
	//    3    5:invokespecial   #18  <Method void BaseCondition(NameAlias)>
		operation = String.format(" %1s ", new Object[] {
			"BETWEEN"
		});
	//    4    8:aload_0         
	//    5    9:ldc1            #20  <String " %1s ">
	//    6   11:iconst_1        
	//    7   12:anewarray       Object[]
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:ldc1            #24  <String "BETWEEN">
	//   11   19:aastore         
	//   12   20:invokestatic    #30  <Method String String.format(String, Object[])>
	//   13   23:putfield        #34  <Field String operation>
		value = obj;
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:putfield        #37  <Field Object value>
		isValueSet = true;
	//   17   31:aload_0         
	//   18   32:iconst_1        
	//   19   33:putfield        #41  <Field boolean isValueSet>
		postArg = condition.postArgument();
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokevirtual   #45  <Method String Condition.postArgument()>
	//   23   41:putfield        #48  <Field String postArg>
	//   24   44:return          
	}

	Condition$Between(Condition condition, Object obj, Condition._cls1 _pcls1)
	{
		this(condition, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #52  <Method void Condition$Between(Condition, Object)>
	//    4    6:return          
	}
}
