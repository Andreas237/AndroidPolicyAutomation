// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import android.database.Cursor;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.Query;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.IndexProperty;
import com.raizlabs.android.dbflow.sql.queriable.ModelQueriable;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.util.*;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			BaseModelQueriable, WhereBase, Transformable, NameAlias, 
//			Where, Update, Select, Join, 
//			IndexedBy, SQLCondition, OrderBy

public class From extends BaseModelQueriable
	implements WhereBase, ModelQueriable, Transformable
{

	public From(Query query1, Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #23  <Method void BaseModelQueriable(Class)>
		joins = ((List) (new ArrayList()));
	//    3    5:aload_0         
	//    4    6:new             #25  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #28  <Method void ArrayList()>
	//    7   13:putfield        #30  <Field List joins>
		queryBase = query1;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #32  <Field Query queryBase>
		tableAlias = (new NameAlias.Builder(FlowManager.getTableName(class1))).build();
	//   11   21:aload_0         
	//   12   22:new             #34  <Class NameAlias$Builder>
	//   13   25:dup             
	//   14   26:aload_2         
	//   15   27:invokestatic    #40  <Method String FlowManager.getTableName(Class)>
	//   16   30:invokespecial   #43  <Method void NameAlias$Builder(String)>
	//   17   33:invokevirtual   #47  <Method NameAlias NameAlias$Builder.build()>
	//   18   36:putfield        #49  <Field NameAlias tableAlias>
	//   19   39:return          
	}

	public From as(String s)
	{
		tableAlias = tableAlias.newBuilder().as(s).build();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #49  <Field NameAlias tableAlias>
	//    3    5:invokevirtual   #60  <Method NameAlias$Builder NameAlias.newBuilder()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #63  <Method NameAlias$Builder NameAlias$Builder.as(String)>
	//    6   12:invokevirtual   #47  <Method NameAlias NameAlias$Builder.build()>
	//    7   15:putfield        #49  <Field NameAlias tableAlias>
		return this;
	//    8   18:aload_0         
	//    9   19:areturn         
	}

	public long count()
	{
		return where().count();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Where where()>
	//    2    4:invokevirtual   #74  <Method long Where.count()>
	//    3    7:lreturn         
	}

	public long count(DatabaseWrapper databasewrapper)
	{
		return where().count(databasewrapper);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Where where()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #77  <Method long Where.count(DatabaseWrapper)>
	//    4    8:lreturn         
	}

	public Join crossJoin(ModelQueriable modelqueriable)
	{
		return join(modelqueriable, Join.JoinType.CROSS);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #85  <Field Join$JoinType Join$JoinType.CROSS>
	//    3    5:invokevirtual   #89  <Method Join join(ModelQueriable, Join$JoinType)>
	//    4    8:areturn         
	}

	public Join crossJoin(Class class1)
	{
		return join(class1, Join.JoinType.CROSS);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #85  <Field Join$JoinType Join$JoinType.CROSS>
	//    3    5:invokevirtual   #94  <Method Join join(Class, Join$JoinType)>
	//    4    8:areturn         
	}

	public long executeUpdateDelete(DatabaseWrapper databasewrapper)
	{
		return where().executeUpdateDelete(databasewrapper);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Where where()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #98  <Method long Where.executeUpdateDelete(DatabaseWrapper)>
	//    4    8:lreturn         
	}

	public String getQuery()
	{
		QueryBuilder querybuilder = (new QueryBuilder()).append(((Object) (queryBase.getQuery())));
	//    0    0:new             #102 <Class QueryBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #103 <Method void QueryBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field Query queryBase>
	//    5   11:invokeinterface #107 <Method String Query.getQuery()>
	//    6   16:invokevirtual   #111 <Method QueryBuilder QueryBuilder.append(Object)>
	//    7   19:astore_1        
		if(!(queryBase instanceof Update))
	//*   8   20:aload_0         
	//*   9   21:getfield        #32  <Field Query queryBase>
	//*  10   24:instanceof      #113 <Class Update>
	//*  11   27:ifne            37
			querybuilder.append("FROM ");
	//   12   30:aload_1         
	//   13   31:ldc1            #115 <String "FROM ">
	//   14   33:invokevirtual   #111 <Method QueryBuilder QueryBuilder.append(Object)>
	//   15   36:pop             
		querybuilder.append(((Object) (tableAlias)));
	//   16   37:aload_1         
	//   17   38:aload_0         
	//   18   39:getfield        #49  <Field NameAlias tableAlias>
	//   19   42:invokevirtual   #111 <Method QueryBuilder QueryBuilder.append(Object)>
	//   20   45:pop             
		if(queryBase instanceof Select)
	//*  21   46:aload_0         
	//*  22   47:getfield        #32  <Field Query queryBase>
	//*  23   50:instanceof      #117 <Class Select>
	//*  24   53:ifeq            102
		{
			Join join1;
			for(Iterator iterator = joins.iterator(); iterator.hasNext(); querybuilder.append(((Object) (join1.getQuery()))))
	//*  25   56:aload_0         
	//*  26   57:getfield        #30  <Field List joins>
	//*  27   60:invokeinterface #123 <Method Iterator List.iterator()>
	//*  28   65:astore_2        
	//*  29   66:aload_2         
	//*  30   67:invokeinterface #129 <Method boolean Iterator.hasNext()>
	//*  31   72:ifeq            107
			{
				join1 = (Join)iterator.next();
	//   32   75:aload_2         
	//   33   76:invokeinterface #133 <Method Object Iterator.next()>
	//   34   81:checkcast       #135 <Class Join>
	//   35   84:astore_3        
				querybuilder.appendSpace();
	//   36   85:aload_1         
	//   37   86:invokevirtual   #139 <Method QueryBuilder QueryBuilder.appendSpace()>
	//   38   89:pop             
			}

	//   39   90:aload_1         
	//   40   91:aload_3         
	//   41   92:invokevirtual   #140 <Method String Join.getQuery()>
	//   42   95:invokevirtual   #111 <Method QueryBuilder QueryBuilder.append(Object)>
	//   43   98:pop             
		} else
	//*  44   99:goto            66
		{
			querybuilder.appendSpace();
	//   45  102:aload_1         
	//   46  103:invokevirtual   #139 <Method QueryBuilder QueryBuilder.appendSpace()>
	//   47  106:pop             
		}
		return querybuilder.getQuery();
	//   48  107:aload_1         
	//   49  108:invokevirtual   #141 <Method String QueryBuilder.getQuery()>
	//   50  111:areturn         
	}

	public Query getQueryBuilderBase()
	{
		return queryBase;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Query queryBase>
	//    2    4:areturn         
	}

	public transient Where groupBy(NameAlias anamealias[])
	{
		return where().groupBy(anamealias);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Where where()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #147 <Method Where Where.groupBy(NameAlias[])>
	//    4    8:areturn         
	}

	public transient Where groupBy(IProperty aiproperty[])
	{
		return where().groupBy(aiproperty);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Where where()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #151 <Method Where Where.groupBy(IProperty[])>
	//    4    8:areturn         
	}

	public transient Where having(SQLCondition asqlcondition[])
	{
		return where().having(asqlcondition);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Where where()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #156 <Method Where Where.having(SQLCondition[])>
	//    4    8:areturn         
	}

	public IndexedBy indexedBy(IndexProperty indexproperty)
	{
		return new IndexedBy(indexproperty, ((WhereBase) (this)));
	//    0    0:new             #161 <Class IndexedBy>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokespecial   #164 <Method void IndexedBy(IndexProperty, WhereBase)>
	//    5    9:areturn         
	}

	public Join innerJoin(ModelQueriable modelqueriable)
	{
		return join(modelqueriable, Join.JoinType.INNER);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #169 <Field Join$JoinType Join$JoinType.INNER>
	//    3    5:invokevirtual   #89  <Method Join join(ModelQueriable, Join$JoinType)>
	//    4    8:areturn         
	}

	public Join innerJoin(Class class1)
	{
		return join(class1, Join.JoinType.INNER);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #169 <Field Join$JoinType Join$JoinType.INNER>
	//    3    5:invokevirtual   #94  <Method Join join(Class, Join$JoinType)>
	//    4    8:areturn         
	}

	public Join join(ModelQueriable modelqueriable, Join.JoinType jointype)
	{
		modelqueriable = ((ModelQueriable) (new Join(this, jointype, modelqueriable)));
	//    0    0:new             #135 <Class Join>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokespecial   #173 <Method void Join(From, Join$JoinType, ModelQueriable)>
	//    6   10:astore_1        
		joins.add(((Object) (modelqueriable)));
	//    7   11:aload_0         
	//    8   12:getfield        #30  <Field List joins>
	//    9   15:aload_1         
	//   10   16:invokeinterface #177 <Method boolean List.add(Object)>
	//   11   21:pop             
		return ((Join) (modelqueriable));
	//   12   22:aload_1         
	//   13   23:areturn         
	}

	public Join join(Class class1, Join.JoinType jointype)
	{
		class1 = ((Class) (new Join(this, class1, jointype)));
	//    0    0:new             #135 <Class Join>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #182 <Method void Join(From, Class, Join$JoinType)>
	//    6   10:astore_1        
		joins.add(((Object) (class1)));
	//    7   11:aload_0         
	//    8   12:getfield        #30  <Field List joins>
	//    9   15:aload_1         
	//   10   16:invokeinterface #177 <Method boolean List.add(Object)>
	//   11   21:pop             
		return ((Join) (class1));
	//   12   22:aload_1         
	//   13   23:areturn         
	}

	public Join leftOuterJoin(ModelQueriable modelqueriable)
	{
		return join(modelqueriable, Join.JoinType.LEFT_OUTER);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #187 <Field Join$JoinType Join$JoinType.LEFT_OUTER>
	//    3    5:invokevirtual   #89  <Method Join join(ModelQueriable, Join$JoinType)>
	//    4    8:areturn         
	}

	public Join leftOuterJoin(Class class1)
	{
		return join(class1, Join.JoinType.LEFT_OUTER);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #187 <Field Join$JoinType Join$JoinType.LEFT_OUTER>
	//    3    5:invokevirtual   #94  <Method Join join(Class, Join$JoinType)>
	//    4    8:areturn         
	}

	public Where limit(int i)
	{
		return where().limit(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Where where()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #191 <Method Where Where.limit(int)>
	//    4    8:areturn         
	}

	public Where offset(int i)
	{
		return where().offset(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Where where()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #195 <Method Where Where.offset(int)>
	//    4    8:areturn         
	}

	public Where orderBy(NameAlias namealias, boolean flag)
	{
		return where().orderBy(namealias, flag);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Where where()>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #199 <Method Where Where.orderBy(NameAlias, boolean)>
	//    5    9:areturn         
	}

	public Where orderBy(OrderBy orderby)
	{
		return where().orderBy(orderby);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Where where()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #203 <Method Where Where.orderBy(OrderBy)>
	//    4    8:areturn         
	}

	public Where orderBy(IProperty iproperty, boolean flag)
	{
		return where().orderBy(iproperty, flag);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Where where()>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #207 <Method Where Where.orderBy(IProperty, boolean)>
	//    5    9:areturn         
	}

	public Cursor query()
	{
		return where().query();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Where where()>
	//    2    4:invokevirtual   #212 <Method Cursor Where.query()>
	//    3    7:areturn         
	}

	public Cursor query(DatabaseWrapper databasewrapper)
	{
		return where().query(databasewrapper);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Where where()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #215 <Method Cursor Where.query(DatabaseWrapper)>
	//    4    8:areturn         
	}

	public Where where()
	{
		return new Where(((WhereBase) (this)), new SQLCondition[0]);
	//    0    0:new             #72  <Class Where>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:anewarray       SQLCondition[]
	//    5    9:invokespecial   #220 <Method void Where(WhereBase, SQLCondition[])>
	//    6   12:areturn         
	}

	public transient Where where(SQLCondition asqlcondition[])
	{
		return where().andAll(asqlcondition);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Where where()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #224 <Method Where Where.andAll(SQLCondition[])>
	//    4    8:areturn         
	}

	private List joins;
	private Query queryBase;
	private NameAlias tableAlias;
}
