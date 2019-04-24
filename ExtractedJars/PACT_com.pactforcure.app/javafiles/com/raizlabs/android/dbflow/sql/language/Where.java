// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import android.database.Cursor;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.Query;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.queriable.ModelQueriable;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.util.*;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			BaseModelQueriable, Transformable, WhereBase, ConditionGroup, 
//			Select, ExistenceCondition, OrderBy, SQLCondition, 
//			NameAlias

public class Where extends BaseModelQueriable
	implements Query, ModelQueriable, Transformable
{

	transient Where(WhereBase wherebase, SQLCondition asqlcondition[])
	{
		super(wherebase.getTable());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #35  <Method Class WhereBase.getTable()>
	//    3    7:invokespecial   #38  <Method void BaseModelQueriable(Class)>
	//    4   10:aload_0         
	//    5   11:new             #40  <Class ArrayList>
	//    6   14:dup             
	//    7   15:invokespecial   #43  <Method void ArrayList()>
	//    8   18:putfield        #45  <Field List groupByList>
	//    9   21:aload_0         
	//   10   22:new             #40  <Class ArrayList>
	//   11   25:dup             
	//   12   26:invokespecial   #43  <Method void ArrayList()>
	//   13   29:putfield        #47  <Field List orderByList>
		limit = -1;
	//   14   32:aload_0         
	//   15   33:iconst_m1       
	//   16   34:putfield        #49  <Field int limit>
		offset = -1;
	//   17   37:aload_0         
	//   18   38:iconst_m1       
	//   19   39:putfield        #51  <Field int offset>
		whereBase = wherebase;
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:putfield        #53  <Field WhereBase whereBase>
		conditionGroup = new ConditionGroup();
	//   23   47:aload_0         
	//   24   48:new             #55  <Class ConditionGroup>
	//   25   51:dup             
	//   26   52:invokespecial   #56  <Method void ConditionGroup()>
	//   27   55:putfield        #58  <Field ConditionGroup conditionGroup>
		havingGroup = new ConditionGroup();
	//   28   58:aload_0         
	//   29   59:new             #55  <Class ConditionGroup>
	//   30   62:dup             
	//   31   63:invokespecial   #56  <Method void ConditionGroup()>
	//   32   66:putfield        #60  <Field ConditionGroup havingGroup>
		conditionGroup.andAll(asqlcondition);
	//   33   69:aload_0         
	//   34   70:getfield        #58  <Field ConditionGroup conditionGroup>
	//   35   73:aload_2         
	//   36   74:invokevirtual   #64  <Method ConditionGroup ConditionGroup.andAll(SQLCondition[])>
	//   37   77:pop             
	//   38   78:return          
	}

	public Where and(SQLCondition sqlcondition)
	{
		conditionGroup.and(sqlcondition);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field ConditionGroup conditionGroup>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #72  <Method ConditionGroup ConditionGroup.and(SQLCondition)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Where andAll(List list)
	{
		conditionGroup.andAll(list);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field ConditionGroup conditionGroup>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #77  <Method ConditionGroup ConditionGroup.andAll(List)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public transient Where andAll(SQLCondition asqlcondition[])
	{
		conditionGroup.andAll(asqlcondition);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field ConditionGroup conditionGroup>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #64  <Method ConditionGroup ConditionGroup.andAll(SQLCondition[])>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	protected void checkSelect(String s)
	{
		if(!(whereBase.getQueryBuilderBase() instanceof Select))
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field WhereBase whereBase>
	//*   2    4:invokeinterface #86  <Method Query WhereBase.getQueryBuilderBase()>
	//*   3    9:instanceof      #88  <Class Select>
	//*   4   12:ifne            47
			throw new IllegalArgumentException((new StringBuilder()).append("Please use ").append(s).append("(). The beginning is not a Select").toString());
	//    5   15:new             #90  <Class IllegalArgumentException>
	//    6   18:dup             
	//    7   19:new             #92  <Class StringBuilder>
	//    8   22:dup             
	//    9   23:invokespecial   #93  <Method void StringBuilder()>
	//   10   26:ldc1            #95  <String "Please use ">
	//   11   28:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   12   31:aload_1         
	//   13   32:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   14   35:ldc1            #101 <String "(). The beginning is not a Select">
	//   15   37:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   16   40:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   17   43:invokespecial   #107 <Method void IllegalArgumentException(String)>
	//   18   46:athrow          
		else
			return;
	//   19   47:return          
	}

	public Where exists(Where where)
	{
		conditionGroup.and(((SQLCondition) ((new ExistenceCondition()).where(where))));
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field ConditionGroup conditionGroup>
	//    2    4:new             #112 <Class ExistenceCondition>
	//    3    7:dup             
	//    4    8:invokespecial   #113 <Method void ExistenceCondition()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #117 <Method ExistenceCondition ExistenceCondition.where(Where)>
	//    7   15:invokevirtual   #72  <Method ConditionGroup ConditionGroup.and(SQLCondition)>
	//    8   18:pop             
		return this;
	//    9   19:aload_0         
	//   10   20:areturn         
	}

	public String getQuery()
	{
		Object obj = ((Object) (whereBase.getQuery().trim()));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field WhereBase whereBase>
	//    2    4:invokeinterface #122 <Method String WhereBase.getQuery()>
	//    3    9:invokevirtual   #127 <Method String String.trim()>
	//    4   12:astore_1        
		obj = ((Object) ((new QueryBuilder()).append(obj).appendSpace().appendQualifier("WHERE", conditionGroup.getQuery()).appendQualifier("GROUP BY", QueryBuilder.join(",", ((Iterable) (groupByList)))).appendQualifier("HAVING", havingGroup.getQuery()).appendQualifier("ORDER BY", QueryBuilder.join(",", ((Iterable) (orderByList))))));
	//    5   13:new             #129 <Class QueryBuilder>
	//    6   16:dup             
	//    7   17:invokespecial   #130 <Method void QueryBuilder()>
	//    8   20:aload_1         
	//    9   21:invokevirtual   #133 <Method QueryBuilder QueryBuilder.append(Object)>
	//   10   24:invokevirtual   #137 <Method QueryBuilder QueryBuilder.appendSpace()>
	//   11   27:ldc1            #139 <String "WHERE">
	//   12   29:aload_0         
	//   13   30:getfield        #58  <Field ConditionGroup conditionGroup>
	//   14   33:invokevirtual   #140 <Method String ConditionGroup.getQuery()>
	//   15   36:invokevirtual   #144 <Method QueryBuilder QueryBuilder.appendQualifier(String, String)>
	//   16   39:ldc1            #146 <String "GROUP BY">
	//   17   41:ldc1            #148 <String ",">
	//   18   43:aload_0         
	//   19   44:getfield        #45  <Field List groupByList>
	//   20   47:invokestatic    #152 <Method String QueryBuilder.join(CharSequence, Iterable)>
	//   21   50:invokevirtual   #144 <Method QueryBuilder QueryBuilder.appendQualifier(String, String)>
	//   22   53:ldc1            #154 <String "HAVING">
	//   23   55:aload_0         
	//   24   56:getfield        #60  <Field ConditionGroup havingGroup>
	//   25   59:invokevirtual   #140 <Method String ConditionGroup.getQuery()>
	//   26   62:invokevirtual   #144 <Method QueryBuilder QueryBuilder.appendQualifier(String, String)>
	//   27   65:ldc1            #156 <String "ORDER BY">
	//   28   67:ldc1            #148 <String ",">
	//   29   69:aload_0         
	//   30   70:getfield        #47  <Field List orderByList>
	//   31   73:invokestatic    #152 <Method String QueryBuilder.join(CharSequence, Iterable)>
	//   32   76:invokevirtual   #144 <Method QueryBuilder QueryBuilder.appendQualifier(String, String)>
	//   33   79:astore_1        
		if(limit > -1)
	//*  34   80:aload_0         
	//*  35   81:getfield        #49  <Field int limit>
	//*  36   84:iconst_m1       
	//*  37   85:icmple          102
			((QueryBuilder) (obj)).appendQualifier("LIMIT", String.valueOf(limit));
	//   38   88:aload_1         
	//   39   89:ldc1            #158 <String "LIMIT">
	//   40   91:aload_0         
	//   41   92:getfield        #49  <Field int limit>
	//   42   95:invokestatic    #162 <Method String String.valueOf(int)>
	//   43   98:invokevirtual   #144 <Method QueryBuilder QueryBuilder.appendQualifier(String, String)>
	//   44  101:pop             
		if(offset > -1)
	//*  45  102:aload_0         
	//*  46  103:getfield        #51  <Field int offset>
	//*  47  106:iconst_m1       
	//*  48  107:icmple          124
			((QueryBuilder) (obj)).appendQualifier("OFFSET", String.valueOf(offset));
	//   49  110:aload_1         
	//   50  111:ldc1            #164 <String "OFFSET">
	//   51  113:aload_0         
	//   52  114:getfield        #51  <Field int offset>
	//   53  117:invokestatic    #162 <Method String String.valueOf(int)>
	//   54  120:invokevirtual   #144 <Method QueryBuilder QueryBuilder.appendQualifier(String, String)>
	//   55  123:pop             
		return ((QueryBuilder) (obj)).getQuery();
	//   56  124:aload_1         
	//   57  125:invokevirtual   #165 <Method String QueryBuilder.getQuery()>
	//   58  128:areturn         
	}

	public transient Where groupBy(NameAlias anamealias[])
	{
		Collections.addAll(((java.util.Collection) (groupByList)), ((Object []) (anamealias)));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field List groupByList>
	//    2    4:aload_1         
	//    3    5:invokestatic    #173 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public transient Where groupBy(IProperty aiproperty[])
	{
		int j = aiproperty.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          39
		{
			IProperty iproperty = aiproperty[i];
	//    8   10:aload_1         
	//    9   11:iload_2         
	//   10   12:aaload          
	//   11   13:astore          4
			groupByList.add(((Object) (iproperty.getNameAlias())));
	//   12   15:aload_0         
	//   13   16:getfield        #45  <Field List groupByList>
	//   14   19:aload           4
	//   15   21:invokeinterface #181 <Method NameAlias IProperty.getNameAlias()>
	//   16   26:invokeinterface #187 <Method boolean List.add(Object)>
	//   17   31:pop             
		}

	//   18   32:iload_2         
	//   19   33:iconst_1        
	//   20   34:iadd            
	//   21   35:istore_2        
	//*  22   36:goto            5
		return this;
	//   23   39:aload_0         
	//   24   40:areturn         
	}

	public transient Where having(SQLCondition asqlcondition[])
	{
		havingGroup.andAll(asqlcondition);
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field ConditionGroup havingGroup>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #64  <Method ConditionGroup ConditionGroup.andAll(SQLCondition[])>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Where limit(int i)
	{
		limit = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #49  <Field int limit>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Where offset(int i)
	{
		offset = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #51  <Field int offset>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Where or(SQLCondition sqlcondition)
	{
		conditionGroup.or(sqlcondition);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field ConditionGroup conditionGroup>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #194 <Method ConditionGroup ConditionGroup.or(SQLCondition)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Where orderBy(NameAlias namealias, boolean flag)
	{
		orderByList.add(((Object) (new OrderBy(namealias, flag))));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List orderByList>
	//    2    4:new             #198 <Class OrderBy>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #201 <Method void OrderBy(NameAlias, boolean)>
	//    7   13:invokeinterface #187 <Method boolean List.add(Object)>
	//    8   18:pop             
		return this;
	//    9   19:aload_0         
	//   10   20:areturn         
	}

	public Where orderBy(OrderBy orderby)
	{
		orderByList.add(((Object) (orderby)));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List orderByList>
	//    2    4:aload_1         
	//    3    5:invokeinterface #187 <Method boolean List.add(Object)>
	//    4   10:pop             
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public Where orderBy(IProperty iproperty, boolean flag)
	{
		orderByList.add(((Object) (new OrderBy(iproperty.getNameAlias(), flag))));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List orderByList>
	//    2    4:new             #198 <Class OrderBy>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokeinterface #181 <Method NameAlias IProperty.getNameAlias()>
	//    6   14:iload_2         
	//    7   15:invokespecial   #201 <Method void OrderBy(NameAlias, boolean)>
	//    8   18:invokeinterface #187 <Method boolean List.add(Object)>
	//    9   23:pop             
		return this;
	//   10   24:aload_0         
	//   11   25:areturn         
	}

	public Where orderByAll(List list)
	{
		if(list != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
			orderByList.addAll(((java.util.Collection) (list)));
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field List orderByList>
	//    4    8:aload_1         
	//    5    9:invokeinterface #210 <Method boolean List.addAll(java.util.Collection)>
	//    6   14:pop             
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public Cursor query()
	{
		return query(FlowManager.getDatabaseForTable(getTable()).getWritableDatabase());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #214 <Method Class getTable()>
	//    3    5:invokestatic    #220 <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//    4    8:invokevirtual   #226 <Method DatabaseWrapper DatabaseDefinition.getWritableDatabase()>
	//    5   11:invokevirtual   #229 <Method Cursor query(DatabaseWrapper)>
	//    6   14:areturn         
	}

	public Cursor query(DatabaseWrapper databasewrapper)
	{
		String s = getQuery();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #230 <Method String getQuery()>
	//    2    4:astore_2        
		if(whereBase.getQueryBuilderBase() instanceof Select)
	//*   3    5:aload_0         
	//*   4    6:getfield        #53  <Field WhereBase whereBase>
	//*   5    9:invokeinterface #86  <Method Query WhereBase.getQueryBuilderBase()>
	//*   6   14:instanceof      #88  <Class Select>
	//*   7   17:ifeq            29
		{
			return databasewrapper.rawQuery(s, ((String []) (null)));
	//    8   20:aload_1         
	//    9   21:aload_2         
	//   10   22:aconst_null     
	//   11   23:invokeinterface #236 <Method Cursor DatabaseWrapper.rawQuery(String, String[])>
	//   12   28:areturn         
		} else
		{
			databasewrapper.execSQL(s);
	//   13   29:aload_1         
	//   14   30:aload_2         
	//   15   31:invokeinterface #239 <Method void DatabaseWrapper.execSQL(String)>
			return null;
	//   16   36:aconst_null     
	//   17   37:areturn         
		}
	}

	public List queryList()
	{
		checkSelect("query");
	//    0    0:aload_0         
	//    1    1:ldc1            #242 <String "query">
	//    2    3:invokevirtual   #244 <Method void checkSelect(String)>
		return super.queryList();
	//    3    6:aload_0         
	//    4    7:invokespecial   #246 <Method List BaseModelQueriable.queryList()>
	//    5   10:areturn         
	}

	public Object querySingle()
	{
		checkSelect("query");
	//    0    0:aload_0         
	//    1    1:ldc1            #242 <String "query">
	//    2    3:invokevirtual   #244 <Method void checkSelect(String)>
		limit(1);
	//    3    6:aload_0         
	//    4    7:iconst_1        
	//    5    8:invokevirtual   #251 <Method Where limit(int)>
	//    6   11:pop             
		return super.querySingle();
	//    7   12:aload_0         
	//    8   13:invokespecial   #253 <Method Object BaseModelQueriable.querySingle()>
	//    9   16:areturn         
	}

	private static final int VALUE_UNSET = -1;
	private ConditionGroup conditionGroup;
	private final List groupByList = new ArrayList();
	private ConditionGroup havingGroup;
	private int limit;
	private int offset;
	private final List orderByList = new ArrayList();
	private final WhereBase whereBase;
}
