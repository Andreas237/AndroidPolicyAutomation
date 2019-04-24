// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.stmt.query;

import co.touchlab.squeaky.dao.SqueakyContext;
import java.sql.SQLException;
import java.util.List;

// Referenced classes of package co.touchlab.squeaky.stmt.query:
//			Clause

public class Raw
	implements Clause
{

	public Raw(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		statement = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field String statement>
	//    5    9:return          
	}

	public void appendSql(SqueakyContext squeakycontext, StringBuilder stringbuilder, boolean flag)
	{
		stringbuilder.append(statement);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field String statement>
	//    3    5:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void appendValue(SqueakyContext squeakycontext, List list)
		throws SQLException
	{
	//    0    0:return          
	}

	private final String statement;
}
