// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.*;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			NameAlias

public class Index
	implements Query
{

	public Index(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		isUnique = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #25  <Field boolean isUnique>
		indexName = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #27  <Field String indexName>
		columns = ((List) (new ArrayList()));
	//    8   14:aload_0         
	//    9   15:new             #29  <Class ArrayList>
	//   10   18:dup             
	//   11   19:invokespecial   #30  <Method void ArrayList()>
	//   12   22:putfield        #32  <Field List columns>
	//   13   25:return          
	}

	public Index and(NameAlias namealias)
	{
		if(!columns.contains(((Object) (namealias))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field List columns>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #42  <Method boolean List.contains(Object)>
	//*   4   10:ifne            24
			columns.add(((Object) (namealias)));
	//    5   13:aload_0         
	//    6   14:getfield        #32  <Field List columns>
	//    7   17:aload_1         
	//    8   18:invokeinterface #45  <Method boolean List.add(Object)>
	//    9   23:pop             
		return this;
	//   10   24:aload_0         
	//   11   25:areturn         
	}

	public Index and(IProperty iproperty)
	{
		if(!columns.contains(((Object) (iproperty.getNameAlias()))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field List columns>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #54  <Method NameAlias IProperty.getNameAlias()>
	//*   4   10:invokeinterface #42  <Method boolean List.contains(Object)>
	//*   5   15:ifne            34
			columns.add(((Object) (iproperty.getNameAlias())));
	//    6   18:aload_0         
	//    7   19:getfield        #32  <Field List columns>
	//    8   22:aload_1         
	//    9   23:invokeinterface #54  <Method NameAlias IProperty.getNameAlias()>
	//   10   28:invokeinterface #45  <Method boolean List.add(Object)>
	//   11   33:pop             
		return this;
	//   12   34:aload_0         
	//   13   35:areturn         
	}

	public void disable()
	{
		SqlUtils.dropIndex(FlowManager.getDatabaseForTable(table).getWritableDatabase(), indexName);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Class table>
	//    2    4:invokestatic    #64  <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//    3    7:invokevirtual   #70  <Method DatabaseWrapper DatabaseDefinition.getWritableDatabase()>
	//    4   10:aload_0         
	//    5   11:getfield        #27  <Field String indexName>
	//    6   14:invokestatic    #76  <Method void SqlUtils.dropIndex(DatabaseWrapper, String)>
	//    7   17:return          
	}

	public void disable(DatabaseWrapper databasewrapper)
	{
		SqlUtils.dropIndex(databasewrapper, indexName);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field String indexName>
	//    3    5:invokestatic    #76  <Method void SqlUtils.dropIndex(DatabaseWrapper, String)>
	//    4    8:return          
	}

	public void enable()
	{
		enable(FlowManager.getDatabaseForTable(table).getWritableDatabase());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #58  <Field Class table>
	//    3    5:invokestatic    #64  <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//    4    8:invokevirtual   #70  <Method DatabaseWrapper DatabaseDefinition.getWritableDatabase()>
	//    5   11:invokevirtual   #80  <Method void enable(DatabaseWrapper)>
	//    6   14:return          
	}

	public void enable(DatabaseWrapper databasewrapper)
	{
		if(table == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field Class table>
	//*   2    4:ifnonnull       17
			throw new IllegalStateException("Please call on() to set a table to use this index on.");
	//    3    7:new             #82  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #84  <String "Please call on() to set a table to use this index on.">
	//    6   13:invokespecial   #86  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		if(columns == null || columns.isEmpty())
	//*   8   17:aload_0         
	//*   9   18:getfield        #32  <Field List columns>
	//*  10   21:ifnull          36
	//*  11   24:aload_0         
	//*  12   25:getfield        #32  <Field List columns>
	//*  13   28:invokeinterface #90  <Method boolean List.isEmpty()>
	//*  14   33:ifeq            46
		{
			throw new IllegalStateException("There should be at least one column in this index");
	//   15   36:new             #82  <Class IllegalStateException>
	//   16   39:dup             
	//   17   40:ldc1            #92  <String "There should be at least one column in this index">
	//   18   42:invokespecial   #86  <Method void IllegalStateException(String)>
	//   19   45:athrow          
		} else
		{
			databasewrapper.execSQL(getQuery());
	//   20   46:aload_1         
	//   21   47:aload_0         
	//   22   48:invokevirtual   #96  <Method String getQuery()>
	//   23   51:invokeinterface #101 <Method void DatabaseWrapper.execSQL(String)>
			return;
	//   24   56:return          
		}
	}

	public String getIndexName()
	{
		return indexName;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String indexName>
	//    2    4:areturn         
	}

	public String getQuery()
	{
		QueryBuilder querybuilder = new QueryBuilder("CREATE ");
	//    0    0:new             #104 <Class QueryBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #106 <String "CREATE ">
	//    3    6:invokespecial   #109 <Method void QueryBuilder(Object)>
	//    4    9:astore_2        
		String s;
		if(isUnique)
	//*   5   10:aload_0         
	//*   6   11:getfield        #25  <Field boolean isUnique>
	//*   7   14:ifeq            73
			s = "UNIQUE ";
	//    8   17:ldc1            #111 <String "UNIQUE ">
	//    9   19:astore_1        
		else
	//*  10   20:aload_2         
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #115 <Method QueryBuilder QueryBuilder.append(Object)>
	//*  13   25:ldc1            #117 <String "INDEX IF NOT EXISTS ">
	//*  14   27:invokevirtual   #115 <Method QueryBuilder QueryBuilder.append(Object)>
	//*  15   30:aload_0         
	//*  16   31:getfield        #27  <Field String indexName>
	//*  17   34:invokevirtual   #121 <Method QueryBuilder QueryBuilder.appendQuotedIfNeeded(String)>
	//*  18   37:ldc1            #123 <String " ON ">
	//*  19   39:invokevirtual   #115 <Method QueryBuilder QueryBuilder.append(Object)>
	//*  20   42:aload_0         
	//*  21   43:getfield        #58  <Field Class table>
	//*  22   46:invokestatic    #127 <Method String FlowManager.getTableName(Class)>
	//*  23   49:invokevirtual   #115 <Method QueryBuilder QueryBuilder.append(Object)>
	//*  24   52:ldc1            #129 <String "(">
	//*  25   54:invokevirtual   #115 <Method QueryBuilder QueryBuilder.append(Object)>
	//*  26   57:aload_0         
	//*  27   58:getfield        #32  <Field List columns>
	//*  28   61:invokevirtual   #133 <Method QueryBuilder QueryBuilder.appendList(List)>
	//*  29   64:ldc1            #135 <String ")">
	//*  30   66:invokevirtual   #115 <Method QueryBuilder QueryBuilder.append(Object)>
	//*  31   69:invokevirtual   #136 <Method String QueryBuilder.getQuery()>
	//*  32   72:areturn         
			s = "";
	//   33   73:ldc1            #138 <String "">
	//   34   75:astore_1        
		return querybuilder.append(((Object) (s))).append("INDEX IF NOT EXISTS ").appendQuotedIfNeeded(indexName).append(" ON ").append(((Object) (FlowManager.getTableName(table)))).append("(").appendList(columns).append(")").getQuery();
	//*  35   76:goto            20
	}

	public Class getTable()
	{
		return table;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Class table>
	//    2    4:areturn         
	}

	public boolean isUnique()
	{
		return isUnique;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field boolean isUnique>
	//    2    4:ireturn         
	}

	public transient Index on(Class class1, NameAlias namealias, NameAlias anamealias[])
	{
		table = class1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field Class table>
		and(namealias);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #145 <Method Index and(NameAlias)>
	//    6   10:pop             
		int j = anamealias.length;
	//    7   11:aload_3         
	//    8   12:arraylength     
	//    9   13:istore          5
		for(int i = 0; i < j; i++)
	//*  10   15:iconst_0        
	//*  11   16:istore          4
	//*  12   18:iload           4
	//*  13   20:iload           5
	//*  14   22:icmpge          43
			and(anamealias[i]);
	//   15   25:aload_0         
	//   16   26:aload_3         
	//   17   27:iload           4
	//   18   29:aaload          
	//   19   30:invokevirtual   #145 <Method Index and(NameAlias)>
	//   20   33:pop             

	//   21   34:iload           4
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:istore          4
	//*  25   40:goto            18
		return this;
	//   26   43:aload_0         
	//   27   44:areturn         
	}

	public transient Index on(Class class1, IProperty aiproperty[])
	{
		table = class1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field Class table>
		int j = aiproperty.length;
	//    3    5:aload_2         
	//    4    6:arraylength     
	//    5    7:istore          4
		for(int i = 0; i < j; i++)
	//*   6    9:iconst_0        
	//*   7   10:istore_3        
	//*   8   11:iload_3         
	//*   9   12:iload           4
	//*  10   14:icmpge          32
			and(aiproperty[i]);
	//   11   17:aload_0         
	//   12   18:aload_2         
	//   13   19:iload_3         
	//   14   20:aaload          
	//   15   21:invokevirtual   #149 <Method Index and(IProperty)>
	//   16   24:pop             

	//   17   25:iload_3         
	//   18   26:iconst_1        
	//   19   27:iadd            
	//   20   28:istore_3        
	//*  21   29:goto            11
		return this;
	//   22   32:aload_0         
	//   23   33:areturn         
	}

	public Index unique(boolean flag)
	{
		isUnique = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #25  <Field boolean isUnique>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private List columns;
	private final String indexName;
	private boolean isUnique;
	private Class table;
}
