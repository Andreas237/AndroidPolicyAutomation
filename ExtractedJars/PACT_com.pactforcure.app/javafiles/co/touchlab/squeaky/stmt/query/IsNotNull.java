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

public class IsNotNull extends BaseComparison
{

	public IsNotNull(FieldType fieldtype, JoinAlias joinalias)
		throws SQLException
	{
		super(fieldtype, ((Object) (null)), false, joinalias);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:aload_2         
	//    5    5:invokespecial   #11  <Method void BaseComparison(FieldType, Object, boolean, JoinAlias)>
	//    6    8:return          
	}

	public volatile void appendSql(SqueakyContext squeakycontext, StringBuilder stringbuilder, boolean flag)
		throws SQLException
	{
		super.appendSql(squeakycontext, stringbuilder, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #17  <Method void BaseComparison.appendSql(SqueakyContext, StringBuilder, boolean)>
	//    5    7:return          
	}

	public void appendValue(SqueakyContext squeakycontext, List list)
	{
	//    0    0:return          
	}

	public String getOperation()
	{
		return "IS NOT NULL";
	//    0    0:ldc1            #25  <String "IS NOT NULL">
	//    1    2:areturn         
	}

	public volatile String toString()
	{
		return super.toString();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method String BaseComparison.toString()>
	//    2    4:areturn         
	}
}
