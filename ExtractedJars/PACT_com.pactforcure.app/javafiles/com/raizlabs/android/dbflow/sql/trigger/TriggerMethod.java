// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.trigger;

import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.Query;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.SQLCondition;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;

// Referenced classes of package com.raizlabs.android.dbflow.sql.trigger:
//			CompletedTrigger, Trigger

public class TriggerMethod
	implements Query
{

	transient TriggerMethod(Trigger trigger1, String s, Class class1, IProperty aiproperty[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		forEachRow = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #33  <Field boolean forEachRow>
		trigger = trigger1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #35  <Field Trigger trigger>
		methodName = s;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #37  <Field String methodName>
		onTable = class1;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #39  <Field Class onTable>
		if(aiproperty != null && aiproperty.length > 0 && aiproperty[0] != null)
	//*  14   24:aload           4
	//*  15   26:ifnull          67
	//*  16   29:aload           4
	//*  17   31:arraylength     
	//*  18   32:ifle            67
	//*  19   35:aload           4
	//*  20   37:iconst_0        
	//*  21   38:aaload          
	//*  22   39:ifnull          67
		{
			if(!s.equals("UPDATE"))
	//*  23   42:aload_2         
	//*  24   43:ldc1            #14  <String "UPDATE">
	//*  25   45:invokevirtual   #45  <Method boolean String.equals(Object)>
	//*  26   48:ifne            61
				throw new IllegalArgumentException("An Trigger OF can only be used with an UPDATE method");
	//   27   51:new             #47  <Class IllegalArgumentException>
	//   28   54:dup             
	//   29   55:ldc1            #49  <String "An Trigger OF can only be used with an UPDATE method">
	//   30   57:invokespecial   #52  <Method void IllegalArgumentException(String)>
	//   31   60:athrow          
			properties = aiproperty;
	//   32   61:aload_0         
	//   33   62:aload           4
	//   34   64:putfield        #54  <Field IProperty[] properties>
		}
	//   35   67:return          
	}

	public CompletedTrigger begin(Query query)
	{
		return new CompletedTrigger(this, query);
	//    0    0:new             #61  <Class CompletedTrigger>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #64  <Method void CompletedTrigger(TriggerMethod, Query)>
	//    5    9:areturn         
	}

	public TriggerMethod forEachRow()
	{
		forEachRow = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #33  <Field boolean forEachRow>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public String getQuery()
	{
		QueryBuilder querybuilder = (new QueryBuilder(((Object) (trigger.getQuery())))).append(((Object) (methodName)));
	//    0    0:new             #71  <Class QueryBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field Trigger trigger>
	//    4    8:invokevirtual   #75  <Method String Trigger.getQuery()>
	//    5   11:invokespecial   #78  <Method void QueryBuilder(Object)>
	//    6   14:aload_0         
	//    7   15:getfield        #37  <Field String methodName>
	//    8   18:invokevirtual   #82  <Method QueryBuilder QueryBuilder.append(Object)>
	//    9   21:astore_1        
		if(properties != null && properties.length > 0)
	//*  10   22:aload_0         
	//*  11   23:getfield        #54  <Field IProperty[] properties>
	//*  12   26:ifnull          54
	//*  13   29:aload_0         
	//*  14   30:getfield        #54  <Field IProperty[] properties>
	//*  15   33:arraylength     
	//*  16   34:ifle            54
			querybuilder.appendSpaceSeparated("OF").appendArray((Object[])properties);
	//   17   37:aload_1         
	//   18   38:ldc1            #84  <String "OF">
	//   19   40:invokevirtual   #87  <Method QueryBuilder QueryBuilder.appendSpaceSeparated(Object)>
	//   20   43:aload_0         
	//   21   44:getfield        #54  <Field IProperty[] properties>
	//   22   47:checkcast       #89  <Class Object[]>
	//   23   50:invokevirtual   #93  <Method QueryBuilder QueryBuilder.appendArray(Object[])>
	//   24   53:pop             
		querybuilder.appendSpaceSeparated("ON").append(((Object) (FlowManager.getTableName(onTable))));
	//   25   54:aload_1         
	//   26   55:ldc1            #95  <String "ON">
	//   27   57:invokevirtual   #87  <Method QueryBuilder QueryBuilder.appendSpaceSeparated(Object)>
	//   28   60:aload_0         
	//   29   61:getfield        #39  <Field Class onTable>
	//   30   64:invokestatic    #101 <Method String FlowManager.getTableName(Class)>
	//   31   67:invokevirtual   #82  <Method QueryBuilder QueryBuilder.append(Object)>
	//   32   70:pop             
		if(forEachRow)
	//*  33   71:aload_0         
	//*  34   72:getfield        #33  <Field boolean forEachRow>
	//*  35   75:ifeq            85
			querybuilder.appendSpaceSeparated("FOR EACH ROW");
	//   36   78:aload_1         
	//   37   79:ldc1            #103 <String "FOR EACH ROW">
	//   38   81:invokevirtual   #87  <Method QueryBuilder QueryBuilder.appendSpaceSeparated(Object)>
	//   39   84:pop             
		if(whenCondition != null)
	//*  40   85:aload_0         
	//*  41   86:getfield        #105 <Field SQLCondition whenCondition>
	//*  42   89:ifnull          114
		{
			querybuilder.append(" WHEN ");
	//   43   92:aload_1         
	//   44   93:ldc1            #107 <String " WHEN ">
	//   45   95:invokevirtual   #82  <Method QueryBuilder QueryBuilder.append(Object)>
	//   46   98:pop             
			whenCondition.appendConditionToQuery(querybuilder);
	//   47   99:aload_0         
	//   48  100:getfield        #105 <Field SQLCondition whenCondition>
	//   49  103:aload_1         
	//   50  104:invokeinterface #113 <Method void SQLCondition.appendConditionToQuery(QueryBuilder)>
			querybuilder.appendSpace();
	//   51  109:aload_1         
	//   52  110:invokevirtual   #117 <Method QueryBuilder QueryBuilder.appendSpace()>
	//   53  113:pop             
		}
		querybuilder.appendSpace();
	//   54  114:aload_1         
	//   55  115:invokevirtual   #117 <Method QueryBuilder QueryBuilder.appendSpace()>
	//   56  118:pop             
		return querybuilder.getQuery();
	//   57  119:aload_1         
	//   58  120:invokevirtual   #118 <Method String QueryBuilder.getQuery()>
	//   59  123:areturn         
	}

	public TriggerMethod when(SQLCondition sqlcondition)
	{
		whenCondition = sqlcondition;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #105 <Field SQLCondition whenCondition>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public static final String DELETE = "DELETE";
	public static final String INSERT = "INSERT";
	public static final String UPDATE = "UPDATE";
	boolean forEachRow;
	private final String methodName;
	Class onTable;
	private IProperty properties[];
	final Trigger trigger;
	private SQLCondition whenCondition;
}
