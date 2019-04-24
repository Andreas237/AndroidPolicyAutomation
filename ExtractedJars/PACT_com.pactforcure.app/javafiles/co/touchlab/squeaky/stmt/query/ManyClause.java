// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.stmt.query;

import co.touchlab.squeaky.dao.SqueakyContext;
import co.touchlab.squeaky.stmt.JoinAlias;
import java.sql.SQLException;
import java.util.*;

// Referenced classes of package co.touchlab.squeaky.stmt.query:
//			Clause, Queryable, QueryFactory, Not

public class ManyClause
	implements Clause, Queryable
{

	public ManyClause(Queryable queryable, QueryFactory queryfactory, String s, JoinAlias joinalias)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		parent = queryable;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field Queryable parent>
		joinAlias = joinalias;
	//    5    9:aload_0         
	//    6   10:aload           4
	//    7   12:putfield        #36  <Field JoinAlias joinAlias>
	//    8   15:aload_0         
	//    9   16:new             #38  <Class ArrayList>
	//   10   19:dup             
	//   11   20:iconst_2        
	//   12   21:invokespecial   #41  <Method void ArrayList(int)>
	//   13   24:putfield        #43  <Field List clauses>
		operation = s;
	//   14   27:aload_0         
	//   15   28:aload_3         
	//   16   29:putfield        #45  <Field String operation>
		queryFactory = queryfactory;
	//   17   32:aload_0         
	//   18   33:aload_2         
	//   19   34:putfield        #47  <Field QueryFactory queryFactory>
	//   20   37:return          
	}

	public ManyClause and()
	{
		ManyClause manyclause = new ManyClause(((Queryable) (this)), queryFactory, "AND", joinAlias);
	//    0    0:new             #2   <Class ManyClause>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field QueryFactory queryFactory>
	//    5    9:ldc1            #13  <String "AND">
	//    6   11:aload_0         
	//    7   12:getfield        #36  <Field JoinAlias joinAlias>
	//    8   15:invokespecial   #54  <Method void ManyClause(Queryable, QueryFactory, String, JoinAlias)>
	//    9   18:astore_1        
		clauses.add(((Object) (manyclause)));
	//   10   19:aload_0         
	//   11   20:getfield        #43  <Field List clauses>
	//   12   23:aload_1         
	//   13   24:invokeinterface #60  <Method boolean List.add(Object)>
	//   14   29:pop             
		return manyclause;
	//   15   30:aload_1         
	//   16   31:areturn         
	}

	public volatile Queryable and()
		throws SQLException
	{
		return ((Queryable) (and()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method ManyClause and()>
	//    2    4:areturn         
	}

	public void appendSql(SqueakyContext squeakycontext, StringBuilder stringbuilder, boolean flag)
		throws SQLException
	{
		if(clauses.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field List clauses>
	//*   2    4:invokeinterface #73  <Method int List.size()>
	//*   3    9:ifne            42
			throw new SQLException((new StringBuilder()).append("Clause list can't be empty for ").append(operation).toString());
	//    4   12:new             #64  <Class SQLException>
	//    5   15:dup             
	//    6   16:new             #75  <Class StringBuilder>
	//    7   19:dup             
	//    8   20:invokespecial   #76  <Method void StringBuilder()>
	//    9   23:ldc1            #78  <String "Clause list can't be empty for ">
	//   10   25:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   11   28:aload_0         
	//   12   29:getfield        #45  <Field String operation>
	//   13   32:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   14   35:invokevirtual   #86  <Method String StringBuilder.toString()>
	//   15   38:invokespecial   #89  <Method void SQLException(String)>
	//   16   41:athrow          
		boolean flag1 = true;
	//   17   42:iconst_1        
	//   18   43:istore          4
		Iterator iterator = clauses.iterator();
	//   19   45:aload_0         
	//   20   46:getfield        #43  <Field List clauses>
	//   21   49:invokeinterface #93  <Method Iterator List.iterator()>
	//   22   54:astore          5
		while(iterator.hasNext()) 
	//*  23   56:aload           5
	//*  24   58:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//*  25   63:ifeq            132
		{
			Clause clause = (Clause)iterator.next();
	//   26   66:aload           5
	//   27   68:invokeinterface #103 <Method Object Iterator.next()>
	//   28   73:checkcast       #7   <Class Clause>
	//   29   76:astore          6
			if(flag1)
	//*  30   78:iload           4
	//*  31   80:ifeq            106
			{
				flag1 = false;
	//   32   83:iconst_0        
	//   33   84:istore          4
				stringbuilder.append("(");
	//   34   86:aload_2         
	//   35   87:ldc1            #105 <String "(">
	//   36   89:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   37   92:pop             
			} else
	//*  38   93:aload           6
	//*  39   95:aload_1         
	//*  40   96:aload_2         
	//*  41   97:iload_3         
	//*  42   98:invokeinterface #107 <Method void Clause.appendSql(SqueakyContext, StringBuilder, boolean)>
	//*  43  103:goto            56
			{
				stringbuilder.append(' ');
	//   44  106:aload_2         
	//   45  107:bipush          32
	//   46  109:invokevirtual   #110 <Method StringBuilder StringBuilder.append(char)>
	//   47  112:pop             
				stringbuilder.append(operation);
	//   48  113:aload_2         
	//   49  114:aload_0         
	//   50  115:getfield        #45  <Field String operation>
	//   51  118:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   52  121:pop             
				stringbuilder.append(' ');
	//   53  122:aload_2         
	//   54  123:bipush          32
	//   55  125:invokevirtual   #110 <Method StringBuilder StringBuilder.append(char)>
	//   56  128:pop             
			}
			clause.appendSql(squeakycontext, stringbuilder, flag);
		}
	//*  57  129:goto            93
		stringbuilder.append(") ");
	//   58  132:aload_2         
	//   59  133:ldc1            #112 <String ") ">
	//   60  135:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   61  138:pop             
	//   62  139:return          
	}

	public void appendValue(SqueakyContext squeakycontext, List list)
		throws SQLException
	{
		for(Iterator iterator = clauses.iterator(); iterator.hasNext(); ((Clause)iterator.next()).appendValue(squeakycontext, list));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:invokeinterface #93  <Method Iterator List.iterator()>
	//    3    9:astore_3        
	//    4   10:aload_3         
	//    5   11:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            38
	//    7   19:aload_3         
	//    8   20:invokeinterface #103 <Method Object Iterator.next()>
	//    9   25:checkcast       #7   <Class Clause>
	//   10   28:aload_1         
	//   11   29:aload_2         
	//   12   30:invokeinterface #116 <Method void Clause.appendValue(SqueakyContext, List)>
	//*  13   35:goto            10
	//   14   38:return          
	}

	public ManyClause between(JoinAlias joinalias, String s, Object obj, Object obj1)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.between(joinalias, s, obj, obj1))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:invokevirtual   #124 <Method Clause QueryFactory.between(JoinAlias, String, Object, Object)>
	//    9   16:invokeinterface #60  <Method boolean List.add(Object)>
	//   10   21:pop             
		return this;
	//   11   22:aload_0         
	//   12   23:areturn         
	}

	public ManyClause between(String s, Object obj, Object obj1)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.between(joinAlias, s, obj, obj1))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field JoinAlias joinAlias>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:invokevirtual   #124 <Method Clause QueryFactory.between(JoinAlias, String, Object, Object)>
	//   10   18:invokeinterface #60  <Method boolean List.add(Object)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public volatile Queryable between(JoinAlias joinalias, String s, Object obj, Object obj1)
		throws SQLException
	{
		return ((Queryable) (between(joinalias, s, obj, obj1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #130 <Method ManyClause between(JoinAlias, String, Object, Object)>
	//    6    9:areturn         
	}

	public volatile Queryable between(String s, Object obj, Object obj1)
		throws SQLException
	{
		return ((Queryable) (between(s, obj, obj1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #133 <Method ManyClause between(String, Object, Object)>
	//    5    7:areturn         
	}

	public Queryable end()
		throws SQLException
	{
		return parent;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Queryable parent>
	//    2    4:areturn         
	}

	public ManyClause eq(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.eq(joinalias, s, obj))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #140 <Method Clause QueryFactory.eq(JoinAlias, String, Object)>
	//    8   14:invokeinterface #60  <Method boolean List.add(Object)>
	//    9   19:pop             
		return this;
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	public ManyClause eq(String s, Object obj)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.eq(joinAlias, s, obj))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field JoinAlias joinAlias>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #140 <Method Clause QueryFactory.eq(JoinAlias, String, Object)>
	//    9   17:invokeinterface #60  <Method boolean List.add(Object)>
	//   10   22:pop             
		return this;
	//   11   23:aload_0         
	//   12   24:areturn         
	}

	public volatile Queryable eq(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		return ((Queryable) (eq(joinalias, s, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #146 <Method ManyClause eq(JoinAlias, String, Object)>
	//    5    7:areturn         
	}

	public volatile Queryable eq(String s, Object obj)
		throws SQLException
	{
		return ((Queryable) (eq(s, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #149 <Method ManyClause eq(String, Object)>
	//    4    6:areturn         
	}

	public ManyClause ge(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.ge(joinalias, s, obj))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #152 <Method Clause QueryFactory.ge(JoinAlias, String, Object)>
	//    8   14:invokeinterface #60  <Method boolean List.add(Object)>
	//    9   19:pop             
		return this;
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	public ManyClause ge(String s, Object obj)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.ge(joinAlias, s, obj))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field JoinAlias joinAlias>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #152 <Method Clause QueryFactory.ge(JoinAlias, String, Object)>
	//    9   17:invokeinterface #60  <Method boolean List.add(Object)>
	//   10   22:pop             
		return this;
	//   11   23:aload_0         
	//   12   24:areturn         
	}

	public volatile Queryable ge(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		return ((Queryable) (ge(joinalias, s, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #154 <Method ManyClause ge(JoinAlias, String, Object)>
	//    5    7:areturn         
	}

	public volatile Queryable ge(String s, Object obj)
		throws SQLException
	{
		return ((Queryable) (ge(s, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #156 <Method ManyClause ge(String, Object)>
	//    4    6:areturn         
	}

	public String getWhereStatement(boolean flag)
		throws SQLException
	{
		return parent.getWhereStatement(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Queryable parent>
	//    2    4:iload_1         
	//    3    5:invokeinterface #160 <Method String Queryable.getWhereStatement(boolean)>
	//    4   10:areturn         
	}

	public ManyClause gt(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.gt(joinalias, s, obj))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #163 <Method Clause QueryFactory.gt(JoinAlias, String, Object)>
	//    8   14:invokeinterface #60  <Method boolean List.add(Object)>
	//    9   19:pop             
		return this;
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	public ManyClause gt(String s, Object obj)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.gt(joinAlias, s, obj))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field JoinAlias joinAlias>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #163 <Method Clause QueryFactory.gt(JoinAlias, String, Object)>
	//    9   17:invokeinterface #60  <Method boolean List.add(Object)>
	//   10   22:pop             
		return this;
	//   11   23:aload_0         
	//   12   24:areturn         
	}

	public volatile Queryable gt(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		return ((Queryable) (gt(joinalias, s, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #165 <Method ManyClause gt(JoinAlias, String, Object)>
	//    5    7:areturn         
	}

	public volatile Queryable gt(String s, Object obj)
		throws SQLException
	{
		return ((Queryable) (gt(s, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #167 <Method ManyClause gt(String, Object)>
	//    4    6:areturn         
	}

	public ManyClause in(JoinAlias joinalias, String s, Iterable iterable)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.in(joinalias, s, new Object[] {
			iterable
		}))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:iconst_1        
	//    7   11:anewarray       Object[]
	//    8   14:dup             
	//    9   15:iconst_0        
	//   10   16:aload_3         
	//   11   17:aastore         
	//   12   18:invokevirtual   #172 <Method Clause QueryFactory.in(JoinAlias, String, Object[])>
	//   13   21:invokeinterface #60  <Method boolean List.add(Object)>
	//   14   26:pop             
		return this;
	//   15   27:aload_0         
	//   16   28:areturn         
	}

	public transient ManyClause in(JoinAlias joinalias, String s, Object aobj[])
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.in(joinalias, s, aobj))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #172 <Method Clause QueryFactory.in(JoinAlias, String, Object[])>
	//    8   14:invokeinterface #60  <Method boolean List.add(Object)>
	//    9   19:pop             
		return this;
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	public ManyClause in(String s, Iterable iterable)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.in(joinAlias, s, new Object[] {
			iterable
		}))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field JoinAlias joinAlias>
	//    6   12:aload_1         
	//    7   13:iconst_1        
	//    8   14:anewarray       Object[]
	//    9   17:dup             
	//   10   18:iconst_0        
	//   11   19:aload_2         
	//   12   20:aastore         
	//   13   21:invokevirtual   #172 <Method Clause QueryFactory.in(JoinAlias, String, Object[])>
	//   14   24:invokeinterface #60  <Method boolean List.add(Object)>
	//   15   29:pop             
		return this;
	//   16   30:aload_0         
	//   17   31:areturn         
	}

	public transient ManyClause in(String s, Object aobj[])
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.in(joinAlias, s, aobj))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field JoinAlias joinAlias>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #172 <Method Clause QueryFactory.in(JoinAlias, String, Object[])>
	//    9   17:invokeinterface #60  <Method boolean List.add(Object)>
	//   10   22:pop             
		return this;
	//   11   23:aload_0         
	//   12   24:areturn         
	}

	public volatile Queryable in(JoinAlias joinalias, String s, Iterable iterable)
		throws SQLException
	{
		return ((Queryable) (in(joinalias, s, iterable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #182 <Method ManyClause in(JoinAlias, String, Iterable)>
	//    5    7:areturn         
	}

	public volatile Queryable in(JoinAlias joinalias, String s, Object aobj[])
		throws SQLException
	{
		return ((Queryable) (in(joinalias, s, aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #185 <Method ManyClause in(JoinAlias, String, Object[])>
	//    5    7:areturn         
	}

	public volatile Queryable in(String s, Iterable iterable)
		throws SQLException
	{
		return ((Queryable) (in(s, iterable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #188 <Method ManyClause in(String, Iterable)>
	//    4    6:areturn         
	}

	public volatile Queryable in(String s, Object aobj[])
		throws SQLException
	{
		return ((Queryable) (in(s, aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #191 <Method ManyClause in(String, Object[])>
	//    4    6:areturn         
	}

	public ManyClause isNotNull(JoinAlias joinalias, String s)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.isNotNull(joinalias, s))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #196 <Method Clause QueryFactory.isNotNull(JoinAlias, String)>
	//    7   13:invokeinterface #60  <Method boolean List.add(Object)>
	//    8   18:pop             
		return this;
	//    9   19:aload_0         
	//   10   20:areturn         
	}

	public ManyClause isNotNull(String s)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.isNotNull(joinAlias, s))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field JoinAlias joinAlias>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #196 <Method Clause QueryFactory.isNotNull(JoinAlias, String)>
	//    8   16:invokeinterface #60  <Method boolean List.add(Object)>
	//    9   21:pop             
		return this;
	//   10   22:aload_0         
	//   11   23:areturn         
	}

	public volatile Queryable isNotNull(JoinAlias joinalias, String s)
		throws SQLException
	{
		return ((Queryable) (isNotNull(joinalias, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #202 <Method ManyClause isNotNull(JoinAlias, String)>
	//    4    6:areturn         
	}

	public volatile Queryable isNotNull(String s)
		throws SQLException
	{
		return ((Queryable) (isNotNull(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #205 <Method ManyClause isNotNull(String)>
	//    3    5:areturn         
	}

	public ManyClause isNull(JoinAlias joinalias, String s)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.isNull(joinalias, s))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #208 <Method Clause QueryFactory.isNull(JoinAlias, String)>
	//    7   13:invokeinterface #60  <Method boolean List.add(Object)>
	//    8   18:pop             
		return this;
	//    9   19:aload_0         
	//   10   20:areturn         
	}

	public ManyClause isNull(String s)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.isNull(joinAlias, s))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field JoinAlias joinAlias>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #208 <Method Clause QueryFactory.isNull(JoinAlias, String)>
	//    8   16:invokeinterface #60  <Method boolean List.add(Object)>
	//    9   21:pop             
		return this;
	//   10   22:aload_0         
	//   11   23:areturn         
	}

	public volatile Queryable isNull(JoinAlias joinalias, String s)
		throws SQLException
	{
		return ((Queryable) (isNull(joinalias, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #210 <Method ManyClause isNull(JoinAlias, String)>
	//    4    6:areturn         
	}

	public volatile Queryable isNull(String s)
		throws SQLException
	{
		return ((Queryable) (isNull(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #212 <Method ManyClause isNull(String)>
	//    3    5:areturn         
	}

	public ManyClause le(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.le(joinalias, s, obj))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #215 <Method Clause QueryFactory.le(JoinAlias, String, Object)>
	//    8   14:invokeinterface #60  <Method boolean List.add(Object)>
	//    9   19:pop             
		return this;
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	public ManyClause le(String s, Object obj)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.le(joinAlias, s, obj))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field JoinAlias joinAlias>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #215 <Method Clause QueryFactory.le(JoinAlias, String, Object)>
	//    9   17:invokeinterface #60  <Method boolean List.add(Object)>
	//   10   22:pop             
		return this;
	//   11   23:aload_0         
	//   12   24:areturn         
	}

	public volatile Queryable le(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		return ((Queryable) (le(joinalias, s, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #217 <Method ManyClause le(JoinAlias, String, Object)>
	//    5    7:areturn         
	}

	public volatile Queryable le(String s, Object obj)
		throws SQLException
	{
		return ((Queryable) (le(s, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #219 <Method ManyClause le(String, Object)>
	//    4    6:areturn         
	}

	public ManyClause like(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.like(joinalias, s, obj))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #222 <Method Clause QueryFactory.like(JoinAlias, String, Object)>
	//    8   14:invokeinterface #60  <Method boolean List.add(Object)>
	//    9   19:pop             
		return this;
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	public ManyClause like(String s, Object obj)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.like(joinAlias, s, obj))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field JoinAlias joinAlias>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #222 <Method Clause QueryFactory.like(JoinAlias, String, Object)>
	//    9   17:invokeinterface #60  <Method boolean List.add(Object)>
	//   10   22:pop             
		return this;
	//   11   23:aload_0         
	//   12   24:areturn         
	}

	public volatile Queryable like(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		return ((Queryable) (like(joinalias, s, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #224 <Method ManyClause like(JoinAlias, String, Object)>
	//    5    7:areturn         
	}

	public volatile Queryable like(String s, Object obj)
		throws SQLException
	{
		return ((Queryable) (like(s, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #226 <Method ManyClause like(String, Object)>
	//    4    6:areturn         
	}

	public ManyClause lt(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.lt(joinalias, s, obj))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #229 <Method Clause QueryFactory.lt(JoinAlias, String, Object)>
	//    8   14:invokeinterface #60  <Method boolean List.add(Object)>
	//    9   19:pop             
		return this;
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	public ManyClause lt(String s, Object obj)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.lt(joinAlias, s, obj))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field JoinAlias joinAlias>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #229 <Method Clause QueryFactory.lt(JoinAlias, String, Object)>
	//    9   17:invokeinterface #60  <Method boolean List.add(Object)>
	//   10   22:pop             
		return this;
	//   11   23:aload_0         
	//   12   24:areturn         
	}

	public volatile Queryable lt(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		return ((Queryable) (lt(joinalias, s, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #231 <Method ManyClause lt(JoinAlias, String, Object)>
	//    5    7:areturn         
	}

	public volatile Queryable lt(String s, Object obj)
		throws SQLException
	{
		return ((Queryable) (lt(s, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #233 <Method ManyClause lt(String, Object)>
	//    4    6:areturn         
	}

	public ManyClause ne(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.ne(joinalias, s, obj))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #236 <Method Clause QueryFactory.ne(JoinAlias, String, Object)>
	//    8   14:invokeinterface #60  <Method boolean List.add(Object)>
	//    9   19:pop             
		return this;
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	public ManyClause ne(String s, Object obj)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.ne(joinAlias, s, obj))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field JoinAlias joinAlias>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #236 <Method Clause QueryFactory.ne(JoinAlias, String, Object)>
	//    9   17:invokeinterface #60  <Method boolean List.add(Object)>
	//   10   22:pop             
		return this;
	//   11   23:aload_0         
	//   12   24:areturn         
	}

	public volatile Queryable ne(JoinAlias joinalias, String s, Object obj)
		throws SQLException
	{
		return ((Queryable) (ne(joinalias, s, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #238 <Method ManyClause ne(JoinAlias, String, Object)>
	//    5    7:areturn         
	}

	public volatile Queryable ne(String s, Object obj)
		throws SQLException
	{
		return ((Queryable) (ne(s, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #240 <Method ManyClause ne(String, Object)>
	//    4    6:areturn         
	}

	public Not not()
		throws SQLException
	{
		Not not1 = new Not(((Queryable) (this)), queryFactory, joinAlias);
	//    0    0:new             #244 <Class Not>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field QueryFactory queryFactory>
	//    5    9:aload_0         
	//    6   10:getfield        #36  <Field JoinAlias joinAlias>
	//    7   13:invokespecial   #247 <Method void Not(Queryable, QueryFactory, JoinAlias)>
	//    8   16:astore_1        
		clauses.add(((Object) (not1)));
	//    9   17:aload_0         
	//   10   18:getfield        #43  <Field List clauses>
	//   11   21:aload_1         
	//   12   22:invokeinterface #60  <Method boolean List.add(Object)>
	//   13   27:pop             
		return not1;
	//   14   28:aload_1         
	//   15   29:areturn         
	}

	public volatile Queryable not()
		throws SQLException
	{
		return ((Queryable) (not()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #249 <Method Not not()>
	//    2    4:areturn         
	}

	public ManyClause notIn(JoinAlias joinalias, String s, Iterable iterable)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.notIn(joinalias, s, new Object[] {
			iterable
		}))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:iconst_1        
	//    7   11:anewarray       Object[]
	//    8   14:dup             
	//    9   15:iconst_0        
	//   10   16:aload_3         
	//   11   17:aastore         
	//   12   18:invokevirtual   #252 <Method Clause QueryFactory.notIn(JoinAlias, String, Object[])>
	//   13   21:invokeinterface #60  <Method boolean List.add(Object)>
	//   14   26:pop             
		return this;
	//   15   27:aload_0         
	//   16   28:areturn         
	}

	public transient ManyClause notIn(JoinAlias joinalias, String s, Object aobj[])
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.notIn(joinalias, s, aobj))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #252 <Method Clause QueryFactory.notIn(JoinAlias, String, Object[])>
	//    8   14:invokeinterface #60  <Method boolean List.add(Object)>
	//    9   19:pop             
		return this;
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	public ManyClause notIn(String s, Iterable iterable)
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.notIn(joinAlias, s, new Object[] {
			iterable
		}))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field JoinAlias joinAlias>
	//    6   12:aload_1         
	//    7   13:iconst_1        
	//    8   14:anewarray       Object[]
	//    9   17:dup             
	//   10   18:iconst_0        
	//   11   19:aload_2         
	//   12   20:aastore         
	//   13   21:invokevirtual   #252 <Method Clause QueryFactory.notIn(JoinAlias, String, Object[])>
	//   14   24:invokeinterface #60  <Method boolean List.add(Object)>
	//   15   29:pop             
		return this;
	//   16   30:aload_0         
	//   17   31:areturn         
	}

	public transient ManyClause notIn(String s, Object aobj[])
		throws SQLException
	{
		clauses.add(((Object) (queryFactory.notIn(joinAlias, s, aobj))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List clauses>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field QueryFactory queryFactory>
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field JoinAlias joinAlias>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #252 <Method Clause QueryFactory.notIn(JoinAlias, String, Object[])>
	//    9   17:invokeinterface #60  <Method boolean List.add(Object)>
	//   10   22:pop             
		return this;
	//   11   23:aload_0         
	//   12   24:areturn         
	}

	public volatile Queryable notIn(JoinAlias joinalias, String s, Iterable iterable)
		throws SQLException
	{
		return ((Queryable) (notIn(joinalias, s, iterable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #254 <Method ManyClause notIn(JoinAlias, String, Iterable)>
	//    5    7:areturn         
	}

	public volatile Queryable notIn(JoinAlias joinalias, String s, Object aobj[])
		throws SQLException
	{
		return ((Queryable) (notIn(joinalias, s, aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #256 <Method ManyClause notIn(JoinAlias, String, Object[])>
	//    5    7:areturn         
	}

	public volatile Queryable notIn(String s, Iterable iterable)
		throws SQLException
	{
		return ((Queryable) (notIn(s, iterable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #258 <Method ManyClause notIn(String, Iterable)>
	//    4    6:areturn         
	}

	public volatile Queryable notIn(String s, Object aobj[])
		throws SQLException
	{
		return ((Queryable) (notIn(s, aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #260 <Method ManyClause notIn(String, Object[])>
	//    4    6:areturn         
	}

	public ManyClause or()
	{
		ManyClause manyclause = new ManyClause(((Queryable) (this)), queryFactory, "OR", joinAlias);
	//    0    0:new             #2   <Class ManyClause>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field QueryFactory queryFactory>
	//    5    9:ldc1            #16  <String "OR">
	//    6   11:aload_0         
	//    7   12:getfield        #36  <Field JoinAlias joinAlias>
	//    8   15:invokespecial   #54  <Method void ManyClause(Queryable, QueryFactory, String, JoinAlias)>
	//    9   18:astore_1        
		clauses.add(((Object) (manyclause)));
	//   10   19:aload_0         
	//   11   20:getfield        #43  <Field List clauses>
	//   12   23:aload_1         
	//   13   24:invokeinterface #60  <Method boolean List.add(Object)>
	//   14   29:pop             
		return manyclause;
	//   15   30:aload_1         
	//   16   31:areturn         
	}

	public volatile Queryable or()
		throws SQLException
	{
		return ((Queryable) (or()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #263 <Method ManyClause or()>
	//    2    4:areturn         
	}

	public co.touchlab.squeaky.dao.Dao.QueryModifiers query()
		throws SQLException
	{
		return parent.query();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Queryable parent>
	//    2    4:invokeinterface #267 <Method co.touchlab.squeaky.dao.Dao$QueryModifiers Queryable.query()>
	//    3    9:areturn         
	}

	public Queryable reset()
	{
		return parent.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Queryable parent>
	//    2    4:invokeinterface #271 <Method Queryable Queryable.reset()>
	//    3    9:areturn         
	}

	public static final String AND_OPERATION = "AND";
	public static final String OR_OPERATION = "OR";
	private final List clauses = new ArrayList(2);
	private final JoinAlias joinAlias;
	private final String operation;
	private final Queryable parent;
	private final QueryFactory queryFactory;
}
