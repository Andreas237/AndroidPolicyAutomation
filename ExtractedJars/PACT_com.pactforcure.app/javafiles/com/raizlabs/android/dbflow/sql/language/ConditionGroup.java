// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.sql.Query;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import java.util.*;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			BaseCondition, SQLCondition, NameAlias

public class ConditionGroup extends BaseCondition
	implements Query, Iterable
{

	protected ConditionGroup()
	{
		this(((NameAlias) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #23  <Method void ConditionGroup(NameAlias)>
	//    3    5:return          
	}

	protected ConditionGroup(NameAlias namealias)
	{
		super(namealias);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void BaseCondition(NameAlias)>
		conditionsList = ((List) (new ArrayList()));
	//    3    5:aload_0         
	//    4    6:new             #27  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #29  <Method void ArrayList()>
	//    7   13:putfield        #31  <Field List conditionsList>
		useParenthesis = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #33  <Field boolean useParenthesis>
		separator = "AND";
	//   11   21:aload_0         
	//   12   22:ldc1            #35  <String "AND">
	//   13   24:putfield        #39  <Field String separator>
	//   14   27:return          
	}

	public static ConditionGroup clause()
	{
		return new ConditionGroup();
	//    0    0:new             #2   <Class ConditionGroup>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void ConditionGroup()>
	//    3    7:areturn         
	}

	public static ConditionGroup clause(SQLCondition sqlcondition)
	{
		return (new ConditionGroup()).and(sqlcondition);
	//    0    0:new             #2   <Class ConditionGroup>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void ConditionGroup()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #46  <Method ConditionGroup and(SQLCondition)>
	//    5   11:areturn         
	}

	private QueryBuilder getQuerySafe()
	{
		QueryBuilder querybuilder = new QueryBuilder();
	//    0    0:new             #50  <Class QueryBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void QueryBuilder()>
	//    3    7:astore          5
		int j = 0;
	//    4    9:iconst_0        
	//    5   10:istore_2        
		int k = conditionsList.size();
	//    6   11:aload_0         
	//    7   12:getfield        #31  <Field List conditionsList>
	//    8   15:invokeinterface #57  <Method int List.size()>
	//    9   20:istore_3        
		int i = 0;
	//   10   21:iconst_0        
	//   11   22:istore_1        
		while(i < k) 
	//*  12   23:iload_1         
	//*  13   24:iload_3         
	//*  14   25:icmpge          142
		{
			Object obj = ((Object) ((SQLCondition)conditionsList.get(i)));
	//   15   28:aload_0         
	//   16   29:getfield        #31  <Field List conditionsList>
	//   17   32:iload_1         
	//   18   33:invokeinterface #61  <Method Object List.get(int)>
	//   19   38:checkcast       #63  <Class SQLCondition>
	//   20   41:astore          4
			if(obj != null)
	//*  21   43:aload           4
	//*  22   45:ifnull          111
			{
				((SQLCondition) (obj)).appendConditionToQuery(querybuilder);
	//   23   48:aload           4
	//   24   50:aload           5
	//   25   52:invokeinterface #67  <Method void SQLCondition.appendConditionToQuery(QueryBuilder)>
				if(j < k - 1)
	//*  26   57:iload_2         
	//*  27   58:iload_3         
	//*  28   59:iconst_1        
	//*  29   60:isub            
	//*  30   61:icmpge          111
				{
					if(!allCommaSeparated)
	//*  31   64:aload_0         
	//*  32   65:getfield        #69  <Field boolean allCommaSeparated>
	//*  33   68:ifne            131
					{
						QueryBuilder querybuilder1 = querybuilder.appendSpace();
	//   34   71:aload           5
	//   35   73:invokevirtual   #72  <Method QueryBuilder QueryBuilder.appendSpace()>
	//   36   76:astore          6
						if(((SQLCondition) (obj)).hasSeparator())
	//*  37   78:aload           4
	//*  38   80:invokeinterface #76  <Method boolean SQLCondition.hasSeparator()>
	//*  39   85:ifeq            122
							obj = ((Object) (((SQLCondition) (obj)).separator()));
	//   40   88:aload           4
	//   41   90:invokeinterface #79  <Method String SQLCondition.separator()>
	//   42   95:astore          4
						else
	//*  43   97:aload           6
	//*  44   99:aload           4
	//*  45  101:invokevirtual   #83  <Method QueryBuilder QueryBuilder.append(Object)>
	//*  46  104:pop             
	//*  47  105:aload           5
	//*  48  107:invokevirtual   #72  <Method QueryBuilder QueryBuilder.appendSpace()>
	//*  49  110:pop             
	//*  50  111:iload_2         
	//*  51  112:iconst_1        
	//*  52  113:iadd            
	//*  53  114:istore_2        
	//*  54  115:iload_1         
	//*  55  116:iconst_1        
	//*  56  117:iadd            
	//*  57  118:istore_1        
	//*  58  119:goto            23
							obj = ((Object) (separator));
	//   59  122:aload_0         
	//   60  123:getfield        #39  <Field String separator>
	//   61  126:astore          4
						querybuilder1.append(obj);
					} else
	//*  62  128:goto            97
					{
						querybuilder.append(",");
	//   63  131:aload           5
	//   64  133:ldc1            #85  <String ",">
	//   65  135:invokevirtual   #83  <Method QueryBuilder QueryBuilder.append(Object)>
	//   66  138:pop             
					}
					querybuilder.appendSpace();
				}
			}
			j++;
			i++;
		}
	//*  67  139:goto            105
		return querybuilder;
	//   68  142:aload           5
	//   69  144:areturn         
	}

	public static ConditionGroup nonGroupingClause()
	{
		return (new ConditionGroup()).setUseParenthesis(false);
	//    0    0:new             #2   <Class ConditionGroup>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void ConditionGroup()>
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #90  <Method ConditionGroup setUseParenthesis(boolean)>
	//    5   11:areturn         
	}

	private ConditionGroup operator(String s, SQLCondition sqlcondition)
	{
		setPreviousSeparator(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #96  <Method void setPreviousSeparator(String)>
		conditionsList.add(((Object) (sqlcondition)));
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field List conditionsList>
	//    5    9:aload_2         
	//    6   10:invokeinterface #100 <Method boolean List.add(Object)>
	//    7   15:pop             
		isChanged = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #102 <Field boolean isChanged>
		return this;
	//   11   21:aload_0         
	//   12   22:areturn         
	}

	private void setPreviousSeparator(String s)
	{
		if(conditionsList.size() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field List conditionsList>
	//*   2    4:invokeinterface #57  <Method int List.size()>
	//*   3    9:ifle            42
			((SQLCondition)conditionsList.get(conditionsList.size() - 1)).separator(s);
	//    4   12:aload_0         
	//    5   13:getfield        #31  <Field List conditionsList>
	//    6   16:aload_0         
	//    7   17:getfield        #31  <Field List conditionsList>
	//    8   20:invokeinterface #57  <Method int List.size()>
	//    9   25:iconst_1        
	//   10   26:isub            
	//   11   27:invokeinterface #61  <Method Object List.get(int)>
	//   12   32:checkcast       #63  <Class SQLCondition>
	//   13   35:aload_1         
	//   14   36:invokeinterface #105 <Method SQLCondition SQLCondition.separator(String)>
	//   15   41:pop             
	//   16   42:return          
	}

	public ConditionGroup and(SQLCondition sqlcondition)
	{
		return operator("AND", sqlcondition);
	//    0    0:aload_0         
	//    1    1:ldc1            #35  <String "AND">
	//    2    3:aload_1         
	//    3    4:invokespecial   #107 <Method ConditionGroup operator(String, SQLCondition)>
	//    4    7:areturn         
	}

	public ConditionGroup andAll(List list)
	{
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); and((SQLCondition)((Iterator) (list)).next()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #113 <Method Iterator List.iterator()>
	//    2    6:astore_1        
	//    3    7:aload_1         
	//    4    8:invokeinterface #118 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            33
	//    6   16:aload_0         
	//    7   17:aload_1         
	//    8   18:invokeinterface #122 <Method Object Iterator.next()>
	//    9   23:checkcast       #63  <Class SQLCondition>
	//   10   26:invokevirtual   #46  <Method ConditionGroup and(SQLCondition)>
	//   11   29:pop             
	//*  12   30:goto            7
		return this;
	//   13   33:aload_0         
	//   14   34:areturn         
	}

	public transient ConditionGroup andAll(SQLCondition asqlcondition[])
	{
		int j = asqlcondition.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          25
			and(asqlcondition[i]);
	//    8   10:aload_0         
	//    9   11:aload_1         
	//   10   12:iload_2         
	//   11   13:aaload          
	//   12   14:invokevirtual   #46  <Method ConditionGroup and(SQLCondition)>
	//   13   17:pop             

	//   14   18:iload_2         
	//   15   19:iconst_1        
	//   16   20:iadd            
	//   17   21:istore_2        
	//*  18   22:goto            5
		return this;
	//   19   25:aload_0         
	//   20   26:areturn         
	}

	public void appendConditionToQuery(QueryBuilder querybuilder)
	{
		int j = conditionsList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field List conditionsList>
	//    2    4:invokeinterface #57  <Method int List.size()>
	//    3    9:istore_3        
		if(useParenthesis && j > 0)
	//*   4   10:aload_0         
	//*   5   11:getfield        #33  <Field boolean useParenthesis>
	//*   6   14:ifeq            28
	//*   7   17:iload_3         
	//*   8   18:ifle            28
			querybuilder.append("(");
	//    9   21:aload_1         
	//   10   22:ldc1            #127 <String "(">
	//   11   24:invokevirtual   #83  <Method QueryBuilder QueryBuilder.append(Object)>
	//   12   27:pop             
		for(int i = 0; i < j; i++)
	//*  13   28:iconst_0        
	//*  14   29:istore_2        
	//*  15   30:iload_2         
	//*  16   31:iload_3         
	//*  17   32:icmpge          94
		{
			SQLCondition sqlcondition = (SQLCondition)conditionsList.get(i);
	//   18   35:aload_0         
	//   19   36:getfield        #31  <Field List conditionsList>
	//   20   39:iload_2         
	//   21   40:invokeinterface #61  <Method Object List.get(int)>
	//   22   45:checkcast       #63  <Class SQLCondition>
	//   23   48:astore          4
			sqlcondition.appendConditionToQuery(querybuilder);
	//   24   50:aload           4
	//   25   52:aload_1         
	//   26   53:invokeinterface #67  <Method void SQLCondition.appendConditionToQuery(QueryBuilder)>
			if(sqlcondition.hasSeparator() && i < j - 1)
	//*  27   58:aload           4
	//*  28   60:invokeinterface #76  <Method boolean SQLCondition.hasSeparator()>
	//*  29   65:ifeq            87
	//*  30   68:iload_2         
	//*  31   69:iload_3         
	//*  32   70:iconst_1        
	//*  33   71:isub            
	//*  34   72:icmpge          87
				querybuilder.appendSpaceSeparated(((Object) (sqlcondition.separator())));
	//   35   75:aload_1         
	//   36   76:aload           4
	//   37   78:invokeinterface #79  <Method String SQLCondition.separator()>
	//   38   83:invokevirtual   #130 <Method QueryBuilder QueryBuilder.appendSpaceSeparated(Object)>
	//   39   86:pop             
		}

	//   40   87:iload_2         
	//   41   88:iconst_1        
	//   42   89:iadd            
	//   43   90:istore_2        
	//*  44   91:goto            30
		if(useParenthesis && j > 0)
	//*  45   94:aload_0         
	//*  46   95:getfield        #33  <Field boolean useParenthesis>
	//*  47   98:ifeq            112
	//*  48  101:iload_3         
	//*  49  102:ifle            112
			querybuilder.append(")");
	//   50  105:aload_1         
	//   51  106:ldc1            #132 <String ")">
	//   52  108:invokevirtual   #83  <Method QueryBuilder QueryBuilder.append(Object)>
	//   53  111:pop             
	//   54  112:return          
	}

	public List getConditions()
	{
		return conditionsList;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field List conditionsList>
	//    2    4:areturn         
	}

	public String getQuery()
	{
		if(isChanged)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field boolean isChanged>
	//*   2    4:ifeq            15
			query = getQuerySafe();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #138 <Method QueryBuilder getQuerySafe()>
	//    6   12:putfield        #140 <Field QueryBuilder query>
		if(query == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #140 <Field QueryBuilder query>
	//*   9   19:ifnonnull       25
			return "";
	//   10   22:ldc1            #142 <String "">
	//   11   24:areturn         
		else
			return query.toString();
	//   12   25:aload_0         
	//   13   26:getfield        #140 <Field QueryBuilder query>
	//   14   29:invokevirtual   #145 <Method String QueryBuilder.toString()>
	//   15   32:areturn         
	}

	public Iterator iterator()
	{
		return conditionsList.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field List conditionsList>
	//    2    4:invokeinterface #113 <Method Iterator List.iterator()>
	//    3    9:areturn         
	}

	public ConditionGroup or(SQLCondition sqlcondition)
	{
		return operator("OR", sqlcondition);
	//    0    0:aload_0         
	//    1    1:ldc1            #149 <String "OR">
	//    2    3:aload_1         
	//    3    4:invokespecial   #107 <Method ConditionGroup operator(String, SQLCondition)>
	//    4    7:areturn         
	}

	public ConditionGroup orAll(List list)
	{
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); or((SQLCondition)((Iterator) (list)).next()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #113 <Method Iterator List.iterator()>
	//    2    6:astore_1        
	//    3    7:aload_1         
	//    4    8:invokeinterface #118 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            33
	//    6   16:aload_0         
	//    7   17:aload_1         
	//    8   18:invokeinterface #122 <Method Object Iterator.next()>
	//    9   23:checkcast       #63  <Class SQLCondition>
	//   10   26:invokevirtual   #152 <Method ConditionGroup or(SQLCondition)>
	//   11   29:pop             
	//*  12   30:goto            7
		return this;
	//   13   33:aload_0         
	//   14   34:areturn         
	}

	public transient ConditionGroup orAll(SQLCondition asqlcondition[])
	{
		int j = asqlcondition.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          25
			or(asqlcondition[i]);
	//    8   10:aload_0         
	//    9   11:aload_1         
	//   10   12:iload_2         
	//   11   13:aaload          
	//   12   14:invokevirtual   #152 <Method ConditionGroup or(SQLCondition)>
	//   13   17:pop             

	//   14   18:iload_2         
	//   15   19:iconst_1        
	//   16   20:iadd            
	//   17   21:istore_2        
	//*  18   22:goto            5
		return this;
	//   19   25:aload_0         
	//   20   26:areturn         
	}

	public ConditionGroup setAllCommaSeparated(boolean flag)
	{
		allCommaSeparated = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #69  <Field boolean allCommaSeparated>
		isChanged = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #102 <Field boolean isChanged>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public ConditionGroup setUseParenthesis(boolean flag)
	{
		useParenthesis = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #33  <Field boolean useParenthesis>
		isChanged = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #102 <Field boolean isChanged>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public int size()
	{
		return conditionsList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field List conditionsList>
	//    2    4:invokeinterface #57  <Method int List.size()>
	//    3    9:ireturn         
	}

	public String toString()
	{
		return getQuerySafe().toString();
	//    0    0:aload_0         
	//    1    1:invokespecial   #138 <Method QueryBuilder getQuerySafe()>
	//    2    4:invokevirtual   #145 <Method String QueryBuilder.toString()>
	//    3    7:areturn         
	}

	private boolean allCommaSeparated;
	private final List conditionsList;
	private boolean isChanged;
	private QueryBuilder query;
	private boolean useParenthesis;
}
