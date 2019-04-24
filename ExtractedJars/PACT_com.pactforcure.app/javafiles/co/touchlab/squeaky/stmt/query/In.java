// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.stmt.query;

import co.touchlab.squeaky.dao.SqueakyContext;
import co.touchlab.squeaky.field.FieldType;
import co.touchlab.squeaky.sql.SqlHelper;
import co.touchlab.squeaky.stmt.JoinAlias;
import java.sql.SQLException;
import java.util.*;

// Referenced classes of package co.touchlab.squeaky.stmt.query:
//			BaseComparison

public class In extends BaseComparison
{

	public In(FieldType fieldtype, Collection collection, boolean flag, JoinAlias joinalias)
		throws SQLException
	{
		super(fieldtype, ((Object) (null)), true, joinalias);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_1        
	//    4    4:aload           4
	//    5    6:invokespecial   #16  <Method void BaseComparison(FieldType, Object, boolean, JoinAlias)>
		objects = collection;
	//    6    9:aload_0         
	//    7   10:aload_2         
	//    8   11:putfield        #18  <Field Collection objects>
		in = flag;
	//    9   14:aload_0         
	//   10   15:iload_3         
	//   11   16:putfield        #20  <Field boolean in>
	//   12   19:return          
	}

	public In(FieldType fieldtype, Object aobj[], boolean flag, JoinAlias joinalias)
		throws SQLException
	{
		super(fieldtype, ((Object) (null)), true, joinalias);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_1        
	//    4    4:aload           4
	//    5    6:invokespecial   #16  <Method void BaseComparison(FieldType, Object, boolean, JoinAlias)>
		objects = ((Collection) (Arrays.asList(aobj)));
	//    6    9:aload_0         
	//    7   10:aload_2         
	//    8   11:invokestatic    #31  <Method List Arrays.asList(Object[])>
	//    9   14:putfield        #18  <Field Collection objects>
		in = flag;
	//   10   17:aload_0         
	//   11   18:iload_3         
	//   12   19:putfield        #20  <Field boolean in>
	//   13   22:return          
	}

	public volatile void appendSql(SqueakyContext squeakycontext, StringBuilder stringbuilder, boolean flag)
		throws SQLException
	{
		super.appendSql(squeakycontext, stringbuilder, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #35  <Method void BaseComparison.appendSql(SqueakyContext, StringBuilder, boolean)>
	//    5    7:return          
	}

	public void appendValue(SqueakyContext squeakycontext, List list)
		throws SQLException
	{
		Object obj;
		for(Iterator iterator = objects.iterator(); iterator.hasNext(); SqlHelper.appendArgOrValue(squeakycontext, fieldType, list, obj))
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Collection objects>
	//*   2    4:invokeinterface #43  <Method Iterator Collection.iterator()>
	//*   3    9:astore_3        
	//*   4   10:aload_3         
	//*   5   11:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            84
		{
			obj = iterator.next();
	//    7   19:aload_3         
	//    8   20:invokeinterface #53  <Method Object Iterator.next()>
	//    9   25:astore          4
			if(obj == null)
	//*  10   27:aload           4
	//*  11   29:ifnonnull       70
				throw new IllegalArgumentException((new StringBuilder()).append("one of the IN values for '").append(fieldType.getColumnName()).append("' is null").toString());
	//   12   32:new             #55  <Class IllegalArgumentException>
	//   13   35:dup             
	//   14   36:new             #57  <Class StringBuilder>
	//   15   39:dup             
	//   16   40:invokespecial   #60  <Method void StringBuilder()>
	//   17   43:ldc1            #62  <String "one of the IN values for '">
	//   18   45:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   19   48:aload_0         
	//   20   49:getfield        #70  <Field FieldType fieldType>
	//   21   52:invokevirtual   #76  <Method String FieldType.getColumnName()>
	//   22   55:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   23   58:ldc1            #78  <String "' is null">
	//   24   60:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   25   63:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   26   66:invokespecial   #84  <Method void IllegalArgumentException(String)>
	//   27   69:athrow          
		}

	//   28   70:aload_1         
	//   29   71:aload_0         
	//   30   72:getfield        #70  <Field FieldType fieldType>
	//   31   75:aload_2         
	//   32   76:aload           4
	//   33   78:invokestatic    #90  <Method void SqlHelper.appendArgOrValue(SqueakyContext, FieldType, List, Object)>
	//*  34   81:goto            10
	//   35   84:return          
	}

	public String getOperation()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #57  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void StringBuilder()>
	//    3    7:astore_2        
		int i;
		if(in)
	//*   4    8:aload_0         
	//*   5    9:getfield        #20  <Field boolean in>
	//*   6   12:ifeq            62
			stringbuilder.append("IN (");
	//    7   15:aload_2         
	//    8   16:ldc1            #94  <String "IN (">
	//    9   18:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
		else
	//*  11   22:iconst_0        
	//*  12   23:istore_1        
	//*  13   24:iload_1         
	//*  14   25:aload_0         
	//*  15   26:getfield        #18  <Field Collection objects>
	//*  16   29:invokeinterface #98  <Method int Collection.size()>
	//*  17   34:icmpge          72
	//*  18   37:iload_1         
	//*  19   38:ifle            48
	//*  20   41:aload_2         
	//*  21   42:bipush          44
	//*  22   44:invokevirtual   #101 <Method StringBuilder StringBuilder.append(char)>
	//*  23   47:pop             
	//*  24   48:aload_2         
	//*  25   49:bipush          63
	//*  26   51:invokevirtual   #101 <Method StringBuilder StringBuilder.append(char)>
	//*  27   54:pop             
	//*  28   55:iload_1         
	//*  29   56:iconst_1        
	//*  30   57:iadd            
	//*  31   58:istore_1        
	//*  32   59:goto            24
			stringbuilder.append("NOT IN (");
	//   33   62:aload_2         
	//   34   63:ldc1            #103 <String "NOT IN (">
	//   35   65:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   36   68:pop             
		for(i = 0; i < objects.size(); i++)
		{
			if(i > 0)
				stringbuilder.append(',');
			stringbuilder.append('?');
		}

	//*  37   69:goto            22
		stringbuilder.append(')');
	//   38   72:aload_2         
	//   39   73:bipush          41
	//   40   75:invokevirtual   #101 <Method StringBuilder StringBuilder.append(char)>
	//   41   78:pop             
		return stringbuilder.toString();
	//   42   79:aload_2         
	//   43   80:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   44   83:areturn         
	}

	public volatile String toString()
	{
		return super.toString();
	//    0    0:aload_0         
	//    1    1:invokespecial   #104 <Method String BaseComparison.toString()>
	//    2    4:areturn         
	}

	private final boolean in;
	private Collection objects;
}
