// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.stmt.query;

import co.touchlab.squeaky.dao.SqueakyContext;
import co.touchlab.squeaky.field.FieldType;
import co.touchlab.squeaky.sql.SqlHelper;
import co.touchlab.squeaky.stmt.JoinAlias;
import java.sql.SQLException;
import java.util.List;

// Referenced classes of package co.touchlab.squeaky.stmt.query:
//			BaseComparison

public class Between extends BaseComparison
{

	public Between(FieldType fieldtype, Object obj, Object obj1, JoinAlias joinalias)
		throws SQLException
	{
		super(fieldtype, ((Object) (null)), true, joinalias);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_1        
	//    4    4:aload           4
	//    5    6:invokespecial   #14  <Method void BaseComparison(FieldType, Object, boolean, JoinAlias)>
		low = obj;
	//    6    9:aload_0         
	//    7   10:aload_2         
	//    8   11:putfield        #16  <Field Object low>
		high = obj1;
	//    9   14:aload_0         
	//   10   15:aload_3         
	//   11   16:putfield        #18  <Field Object high>
	//   12   19:return          
	}

	public volatile void appendSql(SqueakyContext squeakycontext, StringBuilder stringbuilder, boolean flag)
		throws SQLException
	{
		super.appendSql(squeakycontext, stringbuilder, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #24  <Method void BaseComparison.appendSql(SqueakyContext, StringBuilder, boolean)>
	//    5    7:return          
	}

	public void appendValue(SqueakyContext squeakycontext, List list)
		throws SQLException
	{
		if(low == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field Object low>
	//*   2    4:ifnonnull       45
			throw new IllegalArgumentException((new StringBuilder()).append("BETWEEN low value for '").append(fieldType.getColumnName()).append("' is null").toString());
	//    3    7:new             #28  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:new             #30  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #33  <Method void StringBuilder()>
	//    8   18:ldc1            #35  <String "BETWEEN low value for '">
	//    9   20:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:aload_0         
	//   11   24:getfield        #43  <Field FieldType fieldType>
	//   12   27:invokevirtual   #49  <Method String FieldType.getColumnName()>
	//   13   30:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   14   33:ldc1            #51  <String "' is null">
	//   15   35:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   16   38:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   17   41:invokespecial   #57  <Method void IllegalArgumentException(String)>
	//   18   44:athrow          
		if(high == null)
	//*  19   45:aload_0         
	//*  20   46:getfield        #18  <Field Object high>
	//*  21   49:ifnonnull       90
		{
			throw new IllegalArgumentException((new StringBuilder()).append("BETWEEN high value for '").append(fieldType.getColumnName()).append("' is null").toString());
	//   22   52:new             #28  <Class IllegalArgumentException>
	//   23   55:dup             
	//   24   56:new             #30  <Class StringBuilder>
	//   25   59:dup             
	//   26   60:invokespecial   #33  <Method void StringBuilder()>
	//   27   63:ldc1            #59  <String "BETWEEN high value for '">
	//   28   65:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   29   68:aload_0         
	//   30   69:getfield        #43  <Field FieldType fieldType>
	//   31   72:invokevirtual   #49  <Method String FieldType.getColumnName()>
	//   32   75:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   33   78:ldc1            #51  <String "' is null">
	//   34   80:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   35   83:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   36   86:invokespecial   #57  <Method void IllegalArgumentException(String)>
	//   37   89:athrow          
		} else
		{
			SqlHelper.appendArgOrValue(squeakycontext, fieldType, list, low);
	//   38   90:aload_1         
	//   39   91:aload_0         
	//   40   92:getfield        #43  <Field FieldType fieldType>
	//   41   95:aload_2         
	//   42   96:aload_0         
	//   43   97:getfield        #16  <Field Object low>
	//   44  100:invokestatic    #65  <Method void SqlHelper.appendArgOrValue(SqueakyContext, FieldType, List, Object)>
			SqlHelper.appendArgOrValue(squeakycontext, fieldType, list, high);
	//   45  103:aload_1         
	//   46  104:aload_0         
	//   47  105:getfield        #43  <Field FieldType fieldType>
	//   48  108:aload_2         
	//   49  109:aload_0         
	//   50  110:getfield        #18  <Field Object high>
	//   51  113:invokestatic    #65  <Method void SqlHelper.appendArgOrValue(SqueakyContext, FieldType, List, Object)>
			return;
	//   52  116:return          
		}
	}

	public String getOperation()
	{
		return "BETWEEN ? AND ?";
	//    0    0:ldc1            #70  <String "BETWEEN ? AND ?">
	//    1    2:areturn         
	}

	public volatile String toString()
	{
		return super.toString();
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method String BaseComparison.toString()>
	//    2    4:areturn         
	}

	private Object high;
	private Object low;
}
