// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.stmt.query;

import co.touchlab.squeaky.dao.SqueakyContext;
import co.touchlab.squeaky.field.FieldType;
import co.touchlab.squeaky.stmt.JoinAlias;
import java.sql.SQLException;
import java.util.List;

// Referenced classes of package co.touchlab.squeaky.stmt.query:
//			BaseComparison

public class SimpleComparison extends BaseComparison
{

	public SimpleComparison(FieldType fieldtype, Object obj, String s, JoinAlias joinalias)
		throws SQLException
	{
		super(fieldtype, obj, true, joinalias);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:aload           4
	//    5    6:invokespecial   #34  <Method void BaseComparison(FieldType, Object, boolean, JoinAlias)>
		operation = s;
	//    6    9:aload_0         
	//    7   10:aload_3         
	//    8   11:putfield        #36  <Field String operation>
	//    9   14:return          
	}

	public volatile void appendSql(SqueakyContext squeakycontext, StringBuilder stringbuilder, boolean flag)
		throws SQLException
	{
		super.appendSql(squeakycontext, stringbuilder, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #42  <Method void BaseComparison.appendSql(SqueakyContext, StringBuilder, boolean)>
	//    5    7:return          
	}

	public volatile void appendValue(SqueakyContext squeakycontext, List list)
		throws SQLException
	{
		super.appendValue(squeakycontext, list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #46  <Method void BaseComparison.appendValue(SqueakyContext, List)>
	//    4    6:return          
	}

	public String getOperation()
	{
		return (new StringBuilder()).append(operation).append(" ?").toString();
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field String operation>
	//    5   11:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:ldc1            #59  <String " ?">
	//    7   16:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #62  <Method String StringBuilder.toString()>
	//    9   22:areturn         
	}

	public volatile String toString()
	{
		return super.toString();
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method String BaseComparison.toString()>
	//    2    4:areturn         
	}

	public static final String EQUAL_TO_OPERATION = "=";
	public static final String GREATER_THAN_EQUAL_TO_OPERATION = ">=";
	public static final String GREATER_THAN_OPERATION = ">";
	public static final String LESS_THAN_EQUAL_TO_OPERATION = "<=";
	public static final String LESS_THAN_OPERATION = "<";
	public static final String LIKE_OPERATION = "LIKE";
	public static final String NOT_EQUAL_TO_OPERATION = "<>";
	private final String operation;
}
