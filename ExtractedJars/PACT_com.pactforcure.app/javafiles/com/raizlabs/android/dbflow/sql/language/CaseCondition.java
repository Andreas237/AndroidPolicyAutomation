// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.sql.Query;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			Case, BaseCondition, SQLCondition

public class CaseCondition
	implements Query
{

	CaseCondition(Case case1, SQLCondition sqlcondition)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		caze = case1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field Case caze>
		sqlCondition = sqlcondition;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field SQLCondition sqlCondition>
	//    8   14:return          
	}

	CaseCondition(Case case1, IProperty iproperty)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		caze = case1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field Case caze>
		property = iproperty;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #38  <Field IProperty property>
	//    8   14:return          
	}

	CaseCondition(Case case1, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		caze = case1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field Case caze>
		whenValue = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #42  <Field Object whenValue>
	//    8   14:return          
	}

	public String getQuery()
	{
		QueryBuilder querybuilder = new QueryBuilder(" WHEN ");
	//    0    0:new             #47  <Class QueryBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #49  <String " WHEN ">
	//    3    6:invokespecial   #52  <Method void QueryBuilder(Object)>
	//    4    9:astore_2        
		Object obj;
		if(caze.isEfficientCase())
	//*   5   10:aload_0         
	//*   6   11:getfield        #29  <Field Case caze>
	//*   7   14:invokevirtual   #58  <Method boolean Case.isEfficientCase()>
	//*   8   17:ifeq            84
		{
			QueryBuilder querybuilder1;
			if(property != null)
	//*   9   20:aload_0         
	//*  10   21:getfield        #38  <Field IProperty property>
	//*  11   24:ifnull          76
				obj = ((Object) (property));
	//   12   27:aload_0         
	//   13   28:getfield        #38  <Field IProperty property>
	//   14   31:astore_1        
			else
	//*  15   32:aload_2         
	//*  16   33:aload_1         
	//*  17   34:iconst_0        
	//*  18   35:invokestatic    #64  <Method String BaseCondition.convertValueToString(Object, boolean)>
	//*  19   38:invokevirtual   #68  <Method QueryBuilder QueryBuilder.append(Object)>
	//*  20   41:pop             
	//*  21   42:aload_2         
	//*  22   43:ldc1            #70  <String " THEN ">
	//*  23   45:invokevirtual   #68  <Method QueryBuilder QueryBuilder.append(Object)>
	//*  24   48:astore_3        
	//*  25   49:aload_0         
	//*  26   50:getfield        #72  <Field boolean isThenPropertySet>
	//*  27   53:ifeq            97
	//*  28   56:aload_0         
	//*  29   57:getfield        #74  <Field IProperty thenProperty>
	//*  30   60:astore_1        
	//*  31   61:aload_3         
	//*  32   62:aload_1         
	//*  33   63:iconst_0        
	//*  34   64:invokestatic    #64  <Method String BaseCondition.convertValueToString(Object, boolean)>
	//*  35   67:invokevirtual   #68  <Method QueryBuilder QueryBuilder.append(Object)>
	//*  36   70:pop             
	//*  37   71:aload_2         
	//*  38   72:invokevirtual   #76  <Method String QueryBuilder.getQuery()>
	//*  39   75:areturn         
				obj = whenValue;
	//   40   76:aload_0         
	//   41   77:getfield        #42  <Field Object whenValue>
	//   42   80:astore_1        
			querybuilder.append(((Object) (BaseCondition.convertValueToString(obj, false))));
		} else
	//*  43   81:goto            32
		{
			sqlCondition.appendConditionToQuery(querybuilder);
	//   44   84:aload_0         
	//   45   85:getfield        #31  <Field SQLCondition sqlCondition>
	//   46   88:aload_2         
	//   47   89:invokeinterface #82  <Method void SQLCondition.appendConditionToQuery(QueryBuilder)>
		}
		querybuilder1 = querybuilder.append(" THEN ");
		if(isThenPropertySet)
			obj = ((Object) (thenProperty));
		else
	//*  48   94:goto            42
			obj = thenValue;
	//   49   97:aload_0         
	//   50   98:getfield        #84  <Field Object thenValue>
	//   51  101:astore_1        
		querybuilder1.append(((Object) (BaseCondition.convertValueToString(obj, false))));
		return querybuilder.getQuery();
	//*  52  102:goto            61
	}

	public Case then(IProperty iproperty)
	{
		thenProperty = iproperty;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #74  <Field IProperty thenProperty>
		isThenPropertySet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #72  <Field boolean isThenPropertySet>
		return caze;
	//    6   10:aload_0         
	//    7   11:getfield        #29  <Field Case caze>
	//    8   14:areturn         
	}

	public Case then(Object obj)
	{
		thenValue = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field Object thenValue>
		return caze;
	//    3    5:aload_0         
	//    4    6:getfield        #29  <Field Case caze>
	//    5    9:areturn         
	}

	public String toString()
	{
		return getQuery();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #91  <Method String getQuery()>
	//    2    4:areturn         
	}

	private final Case caze;
	private boolean isThenPropertySet;
	private IProperty property;
	private SQLCondition sqlCondition;
	private IProperty thenProperty;
	private Object thenValue;
	private Object whenValue;
}
