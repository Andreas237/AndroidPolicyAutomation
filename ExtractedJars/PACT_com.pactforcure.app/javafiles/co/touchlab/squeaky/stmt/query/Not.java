// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.stmt.query;

import co.touchlab.squeaky.dao.SqueakyContext;
import co.touchlab.squeaky.stmt.JoinAlias;
import java.sql.SQLException;
import java.util.List;

// Referenced classes of package co.touchlab.squeaky.stmt.query:
//			Clause, Queryable, ManyClause, QueryFactory

public class Not
	implements Clause, Queryable
{

	public Not(Queryable queryable, QueryFactory queryfactory, JoinAlias joinalias)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		comparison = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #25  <Field Clause comparison>
		queryFactory = queryfactory;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field QueryFactory queryFactory>
		parent = queryable;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #29  <Field Queryable parent>
		joinAlias = joinalias;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #31  <Field JoinAlias joinAlias>
	//   14   24:return          
	}

	private void checkClause()
		throws SQLException
	{
		if(comparison != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field Clause comparison>
	//*   2    4:ifnull          17
			throw new SQLException("Clause already defined. Must use and/or for multiple conditions");
	//    3    7:new             #37  <Class SQLException>
	//    4   10:dup             
	//    5   11:ldc1            #39  <String "Clause already defined. Must use and/or for multiple conditions">
	//    6   13:invokespecial   #42  <Method void SQLException(String)>
	//    7   16:athrow          
		else
			return;
	//    8   17:return          
	}

	public Queryable and()
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		ManyClause manyclause = new ManyClause(parent, queryFactory, "AND", joinAlias);
	//    2    4:new             #49  <Class ManyClause>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field Queryable parent>
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field QueryFactory queryFactory>
	//    8   16:ldc1            #51  <String "AND">
	//    9   18:aload_0         
	//   10   19:getfield        #31  <Field JoinAlias joinAlias>
	//   11   22:invokespecial   #54  <Method void ManyClause(Queryable, QueryFactory, String, JoinAlias)>
	//   12   25:astore_1        
		comparison = ((Clause) (manyclause));
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:putfield        #25  <Field Clause comparison>
		return ((Queryable) (manyclause));
	//   16   31:aload_1         
	//   17   32:areturn         
	}

	public void appendSql(SqueakyContext squeakycontext, StringBuilder stringbuilder, boolean flag)
		throws SQLException
	{
		if(comparison == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field Clause comparison>
	//*   2    4:ifnonnull       17
		{
			throw new IllegalStateException("Clause has not been set in NOT operation");
	//    3    7:new             #59  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #61  <String "Clause has not been set in NOT operation">
	//    6   13:invokespecial   #62  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		} else
		{
			stringbuilder.append("(NOT ");
	//    8   17:aload_2         
	//    9   18:ldc1            #64  <String "(NOT ">
	//   10   20:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			comparison.appendSql(squeakycontext, stringbuilder, flag);
	//   12   24:aload_0         
	//   13   25:getfield        #25  <Field Clause comparison>
	//   14   28:aload_1         
	//   15   29:aload_2         
	//   16   30:iload_3         
	//   17   31:invokeinterface #72  <Method void Clause.appendSql(SqueakyContext, StringBuilder, boolean)>
			stringbuilder.append(") ");
	//   18   36:aload_2         
	//   19   37:ldc1            #74  <String ") ">
	//   20   39:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
			return;
	//   22   43:return          
		}
	}

	public void appendValue(SqueakyContext squeakycontext, List list)
		throws SQLException
	{
		comparison.appendValue(squeakycontext, list);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Clause comparison>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #78  <Method void Clause.appendValue(SqueakyContext, List)>
	//    5   11:return          
	}

	public Queryable between(JoinAlias joinalias, String s, Object obj, Object obj1)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.between(joinalias, s, obj, obj1);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:aload           4
	//    9   14:invokevirtual   #86  <Method Clause QueryFactory.between(JoinAlias, String, Object, Object)>
	//   10   17:putfield        #25  <Field Clause comparison>
		return parent;
	//   11   20:aload_0         
	//   12   21:getfield        #29  <Field Queryable parent>
	//   13   24:areturn         
	}

	public Queryable between(String s, Object obj, Object obj1)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.between(joinAlias, s, obj, obj1);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field JoinAlias joinAlias>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #86  <Method Clause QueryFactory.between(JoinAlias, String, Object, Object)>
	//   11   19:putfield        #25  <Field Clause comparison>
		return parent;
	//   12   22:aload_0         
	//   13   23:getfield        #29  <Field Queryable parent>
	//   14   26:areturn         
	}

	public Queryable end()
		throws SQLException
	{
		throw new SQLException("Can't end a single entity");
	//    0    0:new             #37  <Class SQLException>
	//    1    3:dup             
	//    2    4:ldc1            #92  <String "Can't end a single entity">
	//    3    6:invokespecial   #42  <Method void SQLException(String)>
	//    4    9:athrow          
	}

	public Queryable eq(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.eq(joinalias, s, obj);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokevirtual   #97  <Method Clause QueryFactory.eq(JoinAlias, String, Object)>
	//    9   15:putfield        #25  <Field Clause comparison>
		return parent;
	//   10   18:aload_0         
	//   11   19:getfield        #29  <Field Queryable parent>
	//   12   22:areturn         
	}

	public Queryable eq(String s, Object obj)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.eq(joinAlias, s, obj);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field JoinAlias joinAlias>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #97  <Method Clause QueryFactory.eq(JoinAlias, String, Object)>
	//   10   18:putfield        #25  <Field Clause comparison>
		return parent;
	//   11   21:aload_0         
	//   12   22:getfield        #29  <Field Queryable parent>
	//   13   25:areturn         
	}

	public Queryable ge(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.ge(joinalias, s, obj);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokevirtual   #103 <Method Clause QueryFactory.ge(JoinAlias, String, Object)>
	//    9   15:putfield        #25  <Field Clause comparison>
		return parent;
	//   10   18:aload_0         
	//   11   19:getfield        #29  <Field Queryable parent>
	//   12   22:areturn         
	}

	public Queryable ge(String s, Object obj)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.ge(joinAlias, s, obj);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field JoinAlias joinAlias>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #103 <Method Clause QueryFactory.ge(JoinAlias, String, Object)>
	//   10   18:putfield        #25  <Field Clause comparison>
		return parent;
	//   11   21:aload_0         
	//   12   22:getfield        #29  <Field Queryable parent>
	//   13   25:areturn         
	}

	public String getWhereStatement(boolean flag)
		throws SQLException
	{
		throw new SQLException("Must complete NOT statement");
	//    0    0:new             #37  <Class SQLException>
	//    1    3:dup             
	//    2    4:ldc1            #107 <String "Must complete NOT statement">
	//    3    6:invokespecial   #42  <Method void SQLException(String)>
	//    4    9:athrow          
	}

	public Queryable gt(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.gt(joinalias, s, obj);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokevirtual   #110 <Method Clause QueryFactory.gt(JoinAlias, String, Object)>
	//    9   15:putfield        #25  <Field Clause comparison>
		return parent;
	//   10   18:aload_0         
	//   11   19:getfield        #29  <Field Queryable parent>
	//   12   22:areturn         
	}

	public Queryable gt(String s, Object obj)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.gt(joinAlias, s, obj);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field JoinAlias joinAlias>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #110 <Method Clause QueryFactory.gt(JoinAlias, String, Object)>
	//   10   18:putfield        #25  <Field Clause comparison>
		return parent;
	//   11   21:aload_0         
	//   12   22:getfield        #29  <Field Queryable parent>
	//   13   25:areturn         
	}

	public Queryable in(JoinAlias joinalias, String s, Iterable iterable)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.in(joinalias, s, new Object[] {
			iterable
		});
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:iconst_1        
	//    8   12:anewarray       Object[]
	//    9   15:dup             
	//   10   16:iconst_0        
	//   11   17:aload_3         
	//   12   18:aastore         
	//   13   19:invokevirtual   #115 <Method Clause QueryFactory.in(JoinAlias, String, Object[])>
	//   14   22:putfield        #25  <Field Clause comparison>
		return parent;
	//   15   25:aload_0         
	//   16   26:getfield        #29  <Field Queryable parent>
	//   17   29:areturn         
	}

	public transient Queryable in(JoinAlias joinalias, String s, Object aobj[])
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.in(joinalias, s, aobj);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokevirtual   #115 <Method Clause QueryFactory.in(JoinAlias, String, Object[])>
	//    9   15:putfield        #25  <Field Clause comparison>
		return parent;
	//   10   18:aload_0         
	//   11   19:getfield        #29  <Field Queryable parent>
	//   12   22:areturn         
	}

	public Queryable in(String s, Iterable iterable)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.in(joinAlias, s, new Object[] {
			iterable
		});
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field JoinAlias joinAlias>
	//    7   13:aload_1         
	//    8   14:iconst_1        
	//    9   15:anewarray       Object[]
	//   10   18:dup             
	//   11   19:iconst_0        
	//   12   20:aload_2         
	//   13   21:aastore         
	//   14   22:invokevirtual   #115 <Method Clause QueryFactory.in(JoinAlias, String, Object[])>
	//   15   25:putfield        #25  <Field Clause comparison>
		return parent;
	//   16   28:aload_0         
	//   17   29:getfield        #29  <Field Queryable parent>
	//   18   32:areturn         
	}

	public transient Queryable in(String s, Object aobj[])
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.in(joinAlias, s, aobj);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field JoinAlias joinAlias>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #115 <Method Clause QueryFactory.in(JoinAlias, String, Object[])>
	//   10   18:putfield        #25  <Field Clause comparison>
		return parent;
	//   11   21:aload_0         
	//   12   22:getfield        #29  <Field Queryable parent>
	//   13   25:areturn         
	}

	public Queryable isNotNull(JoinAlias joinalias, String s)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.isNotNull(joinalias, s);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #127 <Method Clause QueryFactory.isNotNull(JoinAlias, String)>
	//    8   14:putfield        #25  <Field Clause comparison>
		return parent;
	//    9   17:aload_0         
	//   10   18:getfield        #29  <Field Queryable parent>
	//   11   21:areturn         
	}

	public Queryable isNotNull(String s)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.isNotNull(joinAlias, s);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field JoinAlias joinAlias>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #127 <Method Clause QueryFactory.isNotNull(JoinAlias, String)>
	//    9   17:putfield        #25  <Field Clause comparison>
		return parent;
	//   10   20:aload_0         
	//   11   21:getfield        #29  <Field Queryable parent>
	//   12   24:areturn         
	}

	public Queryable isNull(JoinAlias joinalias, String s)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.isNull(joinalias, s);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #133 <Method Clause QueryFactory.isNull(JoinAlias, String)>
	//    8   14:putfield        #25  <Field Clause comparison>
		return parent;
	//    9   17:aload_0         
	//   10   18:getfield        #29  <Field Queryable parent>
	//   11   21:areturn         
	}

	public Queryable isNull(String s)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.isNull(joinAlias, s);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field JoinAlias joinAlias>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #133 <Method Clause QueryFactory.isNull(JoinAlias, String)>
	//    9   17:putfield        #25  <Field Clause comparison>
		return parent;
	//   10   20:aload_0         
	//   11   21:getfield        #29  <Field Queryable parent>
	//   12   24:areturn         
	}

	public Queryable le(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.le(joinalias, s, obj);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokevirtual   #136 <Method Clause QueryFactory.le(JoinAlias, String, Object)>
	//    9   15:putfield        #25  <Field Clause comparison>
		return parent;
	//   10   18:aload_0         
	//   11   19:getfield        #29  <Field Queryable parent>
	//   12   22:areturn         
	}

	public Queryable le(String s, Object obj)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.le(joinAlias, s, obj);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field JoinAlias joinAlias>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #136 <Method Clause QueryFactory.le(JoinAlias, String, Object)>
	//   10   18:putfield        #25  <Field Clause comparison>
		return parent;
	//   11   21:aload_0         
	//   12   22:getfield        #29  <Field Queryable parent>
	//   13   25:areturn         
	}

	public Queryable like(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.like(joinalias, s, obj);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokevirtual   #139 <Method Clause QueryFactory.like(JoinAlias, String, Object)>
	//    9   15:putfield        #25  <Field Clause comparison>
		return parent;
	//   10   18:aload_0         
	//   11   19:getfield        #29  <Field Queryable parent>
	//   12   22:areturn         
	}

	public Queryable like(String s, Object obj)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.like(joinAlias, s, obj);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field JoinAlias joinAlias>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #139 <Method Clause QueryFactory.like(JoinAlias, String, Object)>
	//   10   18:putfield        #25  <Field Clause comparison>
		return parent;
	//   11   21:aload_0         
	//   12   22:getfield        #29  <Field Queryable parent>
	//   13   25:areturn         
	}

	public Queryable lt(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.lt(joinalias, s, obj);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokevirtual   #142 <Method Clause QueryFactory.lt(JoinAlias, String, Object)>
	//    9   15:putfield        #25  <Field Clause comparison>
		return parent;
	//   10   18:aload_0         
	//   11   19:getfield        #29  <Field Queryable parent>
	//   12   22:areturn         
	}

	public Queryable lt(String s, Object obj)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.lt(joinAlias, s, obj);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field JoinAlias joinAlias>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #142 <Method Clause QueryFactory.lt(JoinAlias, String, Object)>
	//   10   18:putfield        #25  <Field Clause comparison>
		return parent;
	//   11   21:aload_0         
	//   12   22:getfield        #29  <Field Queryable parent>
	//   13   25:areturn         
	}

	public Queryable ne(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.ne(joinalias, s, obj);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokevirtual   #145 <Method Clause QueryFactory.ne(JoinAlias, String, Object)>
	//    9   15:putfield        #25  <Field Clause comparison>
		return parent;
	//   10   18:aload_0         
	//   11   19:getfield        #29  <Field Queryable parent>
	//   12   22:areturn         
	}

	public Queryable ne(String s, Object obj)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.ne(joinAlias, s, obj);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field JoinAlias joinAlias>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #145 <Method Clause QueryFactory.ne(JoinAlias, String, Object)>
	//   10   18:putfield        #25  <Field Clause comparison>
		return parent;
	//   11   21:aload_0         
	//   12   22:getfield        #29  <Field Queryable parent>
	//   13   25:areturn         
	}

	public Queryable not()
		throws SQLException
	{
		throw new SQLException("Double negative? Calling not on not");
	//    0    0:new             #37  <Class SQLException>
	//    1    3:dup             
	//    2    4:ldc1            #148 <String "Double negative? Calling not on not">
	//    3    6:invokespecial   #42  <Method void SQLException(String)>
	//    4    9:athrow          
	}

	public Queryable notIn(JoinAlias joinalias, String s, Iterable iterable)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.notIn(joinalias, s, new Object[] {
			iterable
		});
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:iconst_1        
	//    8   12:anewarray       Object[]
	//    9   15:dup             
	//   10   16:iconst_0        
	//   11   17:aload_3         
	//   12   18:aastore         
	//   13   19:invokevirtual   #151 <Method Clause QueryFactory.notIn(JoinAlias, String, Object[])>
	//   14   22:putfield        #25  <Field Clause comparison>
		return parent;
	//   15   25:aload_0         
	//   16   26:getfield        #29  <Field Queryable parent>
	//   17   29:areturn         
	}

	public transient Queryable notIn(JoinAlias joinalias, String s, Object aobj[])
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.notIn(joinalias, s, aobj);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokevirtual   #151 <Method Clause QueryFactory.notIn(JoinAlias, String, Object[])>
	//    9   15:putfield        #25  <Field Clause comparison>
		return parent;
	//   10   18:aload_0         
	//   11   19:getfield        #29  <Field Queryable parent>
	//   12   22:areturn         
	}

	public Queryable notIn(String s, Iterable iterable)
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.notIn(joinAlias, s, new Object[] {
			iterable
		});
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field JoinAlias joinAlias>
	//    7   13:aload_1         
	//    8   14:iconst_1        
	//    9   15:anewarray       Object[]
	//   10   18:dup             
	//   11   19:iconst_0        
	//   12   20:aload_2         
	//   13   21:aastore         
	//   14   22:invokevirtual   #151 <Method Clause QueryFactory.notIn(JoinAlias, String, Object[])>
	//   15   25:putfield        #25  <Field Clause comparison>
		return parent;
	//   16   28:aload_0         
	//   17   29:getfield        #29  <Field Queryable parent>
	//   18   32:areturn         
	}

	public transient Queryable notIn(String s, Object aobj[])
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		comparison = queryFactory.notIn(joinAlias, s, aobj);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field QueryFactory queryFactory>
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field JoinAlias joinAlias>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #151 <Method Clause QueryFactory.notIn(JoinAlias, String, Object[])>
	//   10   18:putfield        #25  <Field Clause comparison>
		return parent;
	//   11   21:aload_0         
	//   12   22:getfield        #29  <Field Queryable parent>
	//   13   25:areturn         
	}

	public Queryable or()
		throws SQLException
	{
		checkClause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void checkClause()>
		ManyClause manyclause = new ManyClause(parent, queryFactory, "OR", joinAlias);
	//    2    4:new             #49  <Class ManyClause>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field Queryable parent>
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field QueryFactory queryFactory>
	//    8   16:ldc1            #154 <String "OR">
	//    9   18:aload_0         
	//   10   19:getfield        #31  <Field JoinAlias joinAlias>
	//   11   22:invokespecial   #54  <Method void ManyClause(Queryable, QueryFactory, String, JoinAlias)>
	//   12   25:astore_1        
		comparison = ((Clause) (manyclause));
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:putfield        #25  <Field Clause comparison>
		return ((Queryable) (manyclause));
	//   16   31:aload_1         
	//   17   32:areturn         
	}

	public co.touchlab.squeaky.dao.Dao.QueryModifiers query()
		throws SQLException
	{
		throw new SQLException("Must complete NOT statement");
	//    0    0:new             #37  <Class SQLException>
	//    1    3:dup             
	//    2    4:ldc1            #107 <String "Must complete NOT statement">
	//    3    6:invokespecial   #42  <Method void SQLException(String)>
	//    4    9:athrow          
	}

	public Queryable reset()
	{
		return parent.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Queryable parent>
	//    2    4:invokeinterface #160 <Method Queryable Queryable.reset()>
	//    3    9:areturn         
	}

	public String toString()
	{
		if(comparison == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field Clause comparison>
	//*   2    4:ifnonnull       10
			return "NOT without comparison";
	//    3    7:ldc1            #164 <String "NOT without comparison">
	//    4    9:areturn         
		else
			return (new StringBuilder()).append("NOT comparison ").append(((Object) (comparison))).toString();
	//    5   10:new             #66  <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #165 <Method void StringBuilder()>
	//    8   17:ldc1            #167 <String "NOT comparison ">
	//    9   19:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   10   22:aload_0         
	//   11   23:getfield        #25  <Field Clause comparison>
	//   12   26:invokevirtual   #170 <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:invokevirtual   #172 <Method String StringBuilder.toString()>
	//   14   32:areturn         
	}

	private Clause comparison;
	private final JoinAlias joinAlias;
	private final Queryable parent;
	private final QueryFactory queryFactory;
}
