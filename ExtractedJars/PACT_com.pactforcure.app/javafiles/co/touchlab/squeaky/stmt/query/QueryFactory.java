// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.stmt.query;

import co.touchlab.squeaky.dao.SqueakyContext;
import co.touchlab.squeaky.stmt.JoinAlias;
import java.sql.SQLException;
import java.util.Collection;

// Referenced classes of package co.touchlab.squeaky.stmt.query:
//			SimpleComparison, Between, In, IsNotNull, 
//			IsNull, Clause

public class QueryFactory
{

	public QueryFactory(SqueakyContext squeakycontext, Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		squeakyContext = squeakycontext;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field SqueakyContext squeakyContext>
	//    5    9:return          
	}

	private Clause initOp(JoinAlias joinalias, String s, Object obj, String s1)
		throws SQLException
	{
		return ((Clause) (new SimpleComparison(squeakyContext.findFieldType(joinalias.tableType, s), obj, s1, joinalias)));
	//    0    0:new             #20  <Class SimpleComparison>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field SqueakyContext squeakyContext>
	//    4    8:aload_1         
	//    5    9:getfield        #26  <Field Class JoinAlias.tableType>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #32  <Method co.touchlab.squeaky.field.FieldType SqueakyContext.findFieldType(Class, String)>
	//    8   16:aload_3         
	//    9   17:aload           4
	//   10   19:aload_1         
	//   11   20:invokespecial   #35  <Method void SimpleComparison(co.touchlab.squeaky.field.FieldType, Object, String, JoinAlias)>
	//   12   23:areturn         
	}

	public Clause between(JoinAlias joinalias, String s, Object obj, Object obj1)
		throws SQLException
	{
		return ((Clause) (new Between(squeakyContext.findFieldType(joinalias.tableType, s), obj, obj1, joinalias)));
	//    0    0:new             #40  <Class Between>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field SqueakyContext squeakyContext>
	//    4    8:aload_1         
	//    5    9:getfield        #26  <Field Class JoinAlias.tableType>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #32  <Method co.touchlab.squeaky.field.FieldType SqueakyContext.findFieldType(Class, String)>
	//    8   16:aload_3         
	//    9   17:aload           4
	//   10   19:aload_1         
	//   11   20:invokespecial   #43  <Method void Between(co.touchlab.squeaky.field.FieldType, Object, Object, JoinAlias)>
	//   12   23:areturn         
	}

	public Clause eq(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		return initOp(joinalias, s, obj, "=");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:ldc1            #47  <String "=">
	//    5    6:invokespecial   #49  <Method Clause initOp(JoinAlias, String, Object, String)>
	//    6    9:areturn         
	}

	public Clause ge(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		return initOp(joinalias, s, obj, ">=");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:ldc1            #52  <String ">=">
	//    5    6:invokespecial   #49  <Method Clause initOp(JoinAlias, String, Object, String)>
	//    6    9:areturn         
	}

	public Clause gt(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		return initOp(joinalias, s, obj, ">");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:ldc1            #55  <String ">">
	//    5    6:invokespecial   #49  <Method Clause initOp(JoinAlias, String, Object, String)>
	//    6    9:areturn         
	}

	public Clause in(JoinAlias joinalias, String s, Collection collection)
		throws SQLException
	{
		return ((Clause) (new In(squeakyContext.findFieldType(joinalias.tableType, s), collection, true, joinalias)));
	//    0    0:new             #59  <Class In>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field SqueakyContext squeakyContext>
	//    4    8:aload_1         
	//    5    9:getfield        #26  <Field Class JoinAlias.tableType>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #32  <Method co.touchlab.squeaky.field.FieldType SqueakyContext.findFieldType(Class, String)>
	//    8   16:aload_3         
	//    9   17:iconst_1        
	//   10   18:aload_1         
	//   11   19:invokespecial   #62  <Method void In(co.touchlab.squeaky.field.FieldType, Collection, boolean, JoinAlias)>
	//   12   22:areturn         
	}

	public transient Clause in(JoinAlias joinalias, String s, Object aobj[])
		throws SQLException
	{
		return ((Clause) (new In(squeakyContext.findFieldType(joinalias.tableType, s), aobj, true, joinalias)));
	//    0    0:new             #59  <Class In>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field SqueakyContext squeakyContext>
	//    4    8:aload_1         
	//    5    9:getfield        #26  <Field Class JoinAlias.tableType>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #32  <Method co.touchlab.squeaky.field.FieldType SqueakyContext.findFieldType(Class, String)>
	//    8   16:aload_3         
	//    9   17:iconst_1        
	//   10   18:aload_1         
	//   11   19:invokespecial   #68  <Method void In(co.touchlab.squeaky.field.FieldType, Object[], boolean, JoinAlias)>
	//   12   22:areturn         
	}

	public Clause isNotNull(JoinAlias joinalias, String s)
		throws SQLException
	{
		return ((Clause) (new IsNotNull(squeakyContext.findFieldType(joinalias.tableType, s), joinalias)));
	//    0    0:new             #72  <Class IsNotNull>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field SqueakyContext squeakyContext>
	//    4    8:aload_1         
	//    5    9:getfield        #26  <Field Class JoinAlias.tableType>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #32  <Method co.touchlab.squeaky.field.FieldType SqueakyContext.findFieldType(Class, String)>
	//    8   16:aload_1         
	//    9   17:invokespecial   #75  <Method void IsNotNull(co.touchlab.squeaky.field.FieldType, JoinAlias)>
	//   10   20:areturn         
	}

	public Clause isNull(JoinAlias joinalias, String s)
		throws SQLException
	{
		return ((Clause) (new IsNull(squeakyContext.findFieldType(joinalias.tableType, s), joinalias)));
	//    0    0:new             #78  <Class IsNull>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field SqueakyContext squeakyContext>
	//    4    8:aload_1         
	//    5    9:getfield        #26  <Field Class JoinAlias.tableType>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #32  <Method co.touchlab.squeaky.field.FieldType SqueakyContext.findFieldType(Class, String)>
	//    8   16:aload_1         
	//    9   17:invokespecial   #79  <Method void IsNull(co.touchlab.squeaky.field.FieldType, JoinAlias)>
	//   10   20:areturn         
	}

	public Clause le(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		return initOp(joinalias, s, obj, "<=");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:ldc1            #82  <String "<=">
	//    5    6:invokespecial   #49  <Method Clause initOp(JoinAlias, String, Object, String)>
	//    6    9:areturn         
	}

	public Clause like(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		return initOp(joinalias, s, obj, "LIKE");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:ldc1            #85  <String "LIKE">
	//    5    6:invokespecial   #49  <Method Clause initOp(JoinAlias, String, Object, String)>
	//    6    9:areturn         
	}

	public Clause lt(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		return initOp(joinalias, s, obj, "<");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:ldc1            #88  <String "<">
	//    5    6:invokespecial   #49  <Method Clause initOp(JoinAlias, String, Object, String)>
	//    6    9:areturn         
	}

	public Clause ne(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		return initOp(joinalias, s, obj, "<>");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:ldc1            #91  <String "<>">
	//    5    6:invokespecial   #49  <Method Clause initOp(JoinAlias, String, Object, String)>
	//    6    9:areturn         
	}

	public Clause notIn(JoinAlias joinalias, String s, Collection collection)
		throws SQLException
	{
		return ((Clause) (new In(squeakyContext.findFieldType(joinalias.tableType, s), collection, false, joinalias)));
	//    0    0:new             #59  <Class In>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field SqueakyContext squeakyContext>
	//    4    8:aload_1         
	//    5    9:getfield        #26  <Field Class JoinAlias.tableType>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #32  <Method co.touchlab.squeaky.field.FieldType SqueakyContext.findFieldType(Class, String)>
	//    8   16:aload_3         
	//    9   17:iconst_0        
	//   10   18:aload_1         
	//   11   19:invokespecial   #62  <Method void In(co.touchlab.squeaky.field.FieldType, Collection, boolean, JoinAlias)>
	//   12   22:areturn         
	}

	public transient Clause notIn(JoinAlias joinalias, String s, Object aobj[])
		throws SQLException
	{
		return ((Clause) (new In(squeakyContext.findFieldType(joinalias.tableType, s), aobj, false, joinalias)));
	//    0    0:new             #59  <Class In>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field SqueakyContext squeakyContext>
	//    4    8:aload_1         
	//    5    9:getfield        #26  <Field Class JoinAlias.tableType>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #32  <Method co.touchlab.squeaky.field.FieldType SqueakyContext.findFieldType(Class, String)>
	//    8   16:aload_3         
	//    9   17:iconst_0        
	//   10   18:aload_1         
	//   11   19:invokespecial   #68  <Method void In(co.touchlab.squeaky.field.FieldType, Object[], boolean, JoinAlias)>
	//   12   22:areturn         
	}

	private final SqueakyContext squeakyContext;
}
