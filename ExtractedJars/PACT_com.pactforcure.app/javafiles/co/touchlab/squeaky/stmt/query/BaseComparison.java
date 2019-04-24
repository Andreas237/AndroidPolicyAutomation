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
//			Comparison

abstract class BaseComparison
	implements Comparison
{

	protected BaseComparison(FieldType fieldtype, Object obj, boolean flag, JoinAlias joinalias)
		throws SQLException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		joinAlias = joinalias;
	//    2    4:aload_0         
	//    3    5:aload           4
	//    4    7:putfield        #25  <Field JoinAlias joinAlias>
		if(flag && fieldtype != null && !fieldtype.isComparable())
	//*   5   10:iload_3         
	//*   6   11:ifeq            72
	//*   7   14:aload_1         
	//*   8   15:ifnull          72
	//*   9   18:aload_1         
	//*  10   19:invokevirtual   #31  <Method boolean FieldType.isComparable()>
	//*  11   22:ifne            72
		{
			throw new SQLException((new StringBuilder()).append("Field '").append(fieldtype.getColumnName()).append("' is of data type ").append(((Object) (fieldtype.getDataPersister()))).append(" which can not be compared").toString());
	//   12   25:new             #20  <Class SQLException>
	//   13   28:dup             
	//   14   29:new             #33  <Class StringBuilder>
	//   15   32:dup             
	//   16   33:invokespecial   #34  <Method void StringBuilder()>
	//   17   36:ldc1            #36  <String "Field '">
	//   18   38:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   19   41:aload_1         
	//   20   42:invokevirtual   #44  <Method String FieldType.getColumnName()>
	//   21   45:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   22   48:ldc1            #46  <String "' is of data type ">
	//   23   50:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   24   53:aload_1         
	//   25   54:invokevirtual   #50  <Method co.touchlab.squeaky.field.DataPersister FieldType.getDataPersister()>
	//   26   57:invokevirtual   #53  <Method StringBuilder StringBuilder.append(Object)>
	//   27   60:ldc1            #55  <String " which can not be compared">
	//   28   62:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   29   65:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   30   68:invokespecial   #61  <Method void SQLException(String)>
	//   31   71:athrow          
		} else
		{
			fieldType = fieldtype;
	//   32   72:aload_0         
	//   33   73:aload_1         
	//   34   74:putfield        #63  <Field FieldType fieldType>
			value = obj;
	//   35   77:aload_0         
	//   36   78:aload_2         
	//   37   79:putfield        #65  <Field Object value>
			return;
	//   38   82:return          
		}
	}

	public void appendSql(SqueakyContext squeakycontext, StringBuilder stringbuilder, boolean flag)
		throws SQLException
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            26
			squeakycontext = ((SqueakyContext) (joinAlias.tablePrefix));
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field JoinAlias joinAlias>
	//    4    8:getfield        #74  <Field String JoinAlias.tablePrefix>
	//    5   11:astore_1        
		else
	//*   6   12:aload_2         
	//*   7   13:aload_1         
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #77  <Method String getOperation()>
	//*  10   18:aload_0         
	//*  11   19:getfield        #63  <Field FieldType fieldType>
	//*  12   22:invokestatic    #83  <Method void SqlHelper.appendWhereClauseBody(StringBuilder, String, String, FieldType)>
	//*  13   25:return          
			squeakycontext = null;
	//   14   26:aconst_null     
	//   15   27:astore_1        
		SqlHelper.appendWhereClauseBody(stringbuilder, ((String) (squeakycontext)), getOperation(), fieldType);
	//*  16   28:goto            12
	}

	public void appendValue(SqueakyContext squeakycontext, List list)
		throws SQLException
	{
		SqlHelper.appendArgOrValue(squeakycontext, fieldType, list, value);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #63  <Field FieldType fieldType>
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:getfield        #65  <Field Object value>
	//    6   10:invokestatic    #89  <Method void SqlHelper.appendArgOrValue(SqueakyContext, FieldType, List, Object)>
	//    7   13:return          
	}

	public abstract String getOperation();

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #33  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(fieldType.getColumnName()).append(' ');
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #63  <Field FieldType fieldType>
	//    7   13:invokevirtual   #44  <Method String FieldType.getColumnName()>
	//    8   16:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:bipush          32
	//   10   21:invokevirtual   #94  <Method StringBuilder StringBuilder.append(char)>
	//   11   24:pop             
		stringbuilder.append(getOperation());
	//   12   25:aload_1         
	//   13   26:aload_0         
	//   14   27:invokevirtual   #77  <Method String getOperation()>
	//   15   30:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
		stringbuilder.append(' ');
	//   17   34:aload_1         
	//   18   35:bipush          32
	//   19   37:invokevirtual   #94  <Method StringBuilder StringBuilder.append(char)>
	//   20   40:pop             
		stringbuilder.append(value);
	//   21   41:aload_1         
	//   22   42:aload_0         
	//   23   43:getfield        #65  <Field Object value>
	//   24   46:invokevirtual   #53  <Method StringBuilder StringBuilder.append(Object)>
	//   25   49:pop             
		return stringbuilder.toString();
	//   26   50:aload_1         
	//   27   51:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   28   54:areturn         
	}

	private static final String NUMBER_CHARACTERS = "0123456789.-+";
	protected final FieldType fieldType;
	private final JoinAlias joinAlias;
	private final Object value;
}
