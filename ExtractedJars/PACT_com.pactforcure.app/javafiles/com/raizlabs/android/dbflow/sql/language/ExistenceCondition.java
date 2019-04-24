// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.sql.QueryBuilder;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			SQLCondition, Where

public class ExistenceCondition
	implements SQLCondition
{

	public ExistenceCondition()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public void appendConditionToQuery(QueryBuilder querybuilder)
	{
		querybuilder.appendQualifier("EXISTS", (new StringBuilder()).append("(").append(innerWhere.getQuery()).append(")").toString());
	//    0    0:aload_1         
	//    1    1:ldc1            #17  <String "EXISTS">
	//    2    3:new             #19  <Class StringBuilder>
	//    3    6:dup             
	//    4    7:invokespecial   #20  <Method void StringBuilder()>
	//    5   10:ldc1            #22  <String "(">
	//    6   12:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:aload_0         
	//    8   16:getfield        #28  <Field Where innerWhere>
	//    9   19:invokevirtual   #34  <Method String Where.getQuery()>
	//   10   22:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:ldc1            #36  <String ")">
	//   12   27:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:invokevirtual   #39  <Method String StringBuilder.toString()>
	//   14   33:invokevirtual   #45  <Method QueryBuilder QueryBuilder.appendQualifier(String, String)>
	//   15   36:pop             
	//   16   37:return          
	}

	public String columnName()
	{
		throw new RuntimeException("Method not valid for ExistenceCondition");
	//    0    0:new             #48  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #50  <String "Method not valid for ExistenceCondition">
	//    3    6:invokespecial   #53  <Method void RuntimeException(String)>
	//    4    9:athrow          
	}

	public boolean hasSeparator()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String operation()
	{
		return "";
	//    0    0:ldc1            #58  <String "">
	//    1    2:areturn         
	}

	public SQLCondition separator(String s)
	{
		throw new RuntimeException("Method not valid for ExistenceCondition");
	//    0    0:new             #48  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #50  <String "Method not valid for ExistenceCondition">
	//    3    6:invokespecial   #53  <Method void RuntimeException(String)>
	//    4    9:athrow          
	}

	public String separator()
	{
		throw new RuntimeException("Method not valid for ExistenceCondition");
	//    0    0:new             #48  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #50  <String "Method not valid for ExistenceCondition">
	//    3    6:invokespecial   #53  <Method void RuntimeException(String)>
	//    4    9:athrow          
	}

	public Object value()
	{
		return ((Object) (innerWhere));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Where innerWhere>
	//    2    4:areturn         
	}

	public ExistenceCondition where(Where where1)
	{
		innerWhere = where1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field Where innerWhere>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private Where innerWhere;
}
