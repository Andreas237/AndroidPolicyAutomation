// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.migration;

import android.database.Cursor;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.SQLiteType;
import com.raizlabs.android.dbflow.sql.language.*;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.util.*;

// Referenced classes of package com.raizlabs.android.dbflow.sql.migration:
//			BaseMigration

public class AlterTableMigration extends BaseMigration
{

	public AlterTableMigration(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void BaseMigration()>
		table = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field Class table>
	//    5    9:return          
	}

	public AlterTableMigration addColumn(SQLiteType sqlitetype, String s)
	{
		if(columnDefinitions == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field List columnDefinitions>
	//*   2    4:ifnonnull       29
		{
			columnDefinitions = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #35  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #36  <Method void ArrayList()>
	//    7   15:putfield        #33  <Field List columnDefinitions>
			columnNames = ((List) (new ArrayList()));
	//    8   18:aload_0         
	//    9   19:new             #35  <Class ArrayList>
	//   10   22:dup             
	//   11   23:invokespecial   #36  <Method void ArrayList()>
	//   12   26:putfield        #38  <Field List columnNames>
		}
		sqlitetype = ((SQLiteType) ((new QueryBuilder()).append(((Object) (QueryBuilder.quoteIfNeeded(s)))).appendSpace().appendSQLiteType(sqlitetype)));
	//   13   29:new             #40  <Class QueryBuilder>
	//   14   32:dup             
	//   15   33:invokespecial   #41  <Method void QueryBuilder()>
	//   16   36:aload_2         
	//   17   37:invokestatic    #45  <Method String QueryBuilder.quoteIfNeeded(String)>
	//   18   40:invokevirtual   #49  <Method QueryBuilder QueryBuilder.append(Object)>
	//   19   43:invokevirtual   #53  <Method QueryBuilder QueryBuilder.appendSpace()>
	//   20   46:aload_1         
	//   21   47:invokevirtual   #57  <Method QueryBuilder QueryBuilder.appendSQLiteType(SQLiteType)>
	//   22   50:astore_1        
		columnDefinitions.add(((Object) (sqlitetype)));
	//   23   51:aload_0         
	//   24   52:getfield        #33  <Field List columnDefinitions>
	//   25   55:aload_1         
	//   26   56:invokeinterface #63  <Method boolean List.add(Object)>
	//   27   61:pop             
		columnNames.add(((Object) (s)));
	//   28   62:aload_0         
	//   29   63:getfield        #38  <Field List columnNames>
	//   30   66:aload_2         
	//   31   67:invokeinterface #63  <Method boolean List.add(Object)>
	//   32   72:pop             
		return this;
	//   33   73:aload_0         
	//   34   74:areturn         
	}

	public AlterTableMigration addForeignKeyColumn(SQLiteType sqlitetype, String s, String s1)
	{
		if(columnDefinitions == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field List columnDefinitions>
	//*   2    4:ifnonnull       29
		{
			columnDefinitions = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #35  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #36  <Method void ArrayList()>
	//    7   15:putfield        #33  <Field List columnDefinitions>
			columnNames = ((List) (new ArrayList()));
	//    8   18:aload_0         
	//    9   19:new             #35  <Class ArrayList>
	//   10   22:dup             
	//   11   23:invokespecial   #36  <Method void ArrayList()>
	//   12   26:putfield        #38  <Field List columnNames>
		}
		sqlitetype = ((SQLiteType) ((new QueryBuilder()).append(((Object) (QueryBuilder.quoteIfNeeded(s)))).appendSpace().appendSQLiteType(sqlitetype).appendSpace().append("REFERENCES ").append(((Object) (s1)))));
	//   13   29:new             #40  <Class QueryBuilder>
	//   14   32:dup             
	//   15   33:invokespecial   #41  <Method void QueryBuilder()>
	//   16   36:aload_2         
	//   17   37:invokestatic    #45  <Method String QueryBuilder.quoteIfNeeded(String)>
	//   18   40:invokevirtual   #49  <Method QueryBuilder QueryBuilder.append(Object)>
	//   19   43:invokevirtual   #53  <Method QueryBuilder QueryBuilder.appendSpace()>
	//   20   46:aload_1         
	//   21   47:invokevirtual   #57  <Method QueryBuilder QueryBuilder.appendSQLiteType(SQLiteType)>
	//   22   50:invokevirtual   #53  <Method QueryBuilder QueryBuilder.appendSpace()>
	//   23   53:ldc1            #69  <String "REFERENCES ">
	//   24   55:invokevirtual   #49  <Method QueryBuilder QueryBuilder.append(Object)>
	//   25   58:aload_3         
	//   26   59:invokevirtual   #49  <Method QueryBuilder QueryBuilder.append(Object)>
	//   27   62:astore_1        
		columnDefinitions.add(((Object) (sqlitetype)));
	//   28   63:aload_0         
	//   29   64:getfield        #33  <Field List columnDefinitions>
	//   30   67:aload_1         
	//   31   68:invokeinterface #63  <Method boolean List.add(Object)>
	//   32   73:pop             
		columnNames.add(((Object) (s)));
	//   33   74:aload_0         
	//   34   75:getfield        #38  <Field List columnNames>
	//   35   78:aload_2         
	//   36   79:invokeinterface #63  <Method boolean List.add(Object)>
	//   37   84:pop             
		return this;
	//   38   85:aload_0         
	//   39   86:areturn         
	}

	public QueryBuilder getAlterTableQueryBuilder()
	{
		if(query == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field QueryBuilder query>
	//*   2    4:ifnonnull       28
			query = (new QueryBuilder()).append("ALTER").appendSpaceSeparated("TABLE");
	//    3    7:aload_0         
	//    4    8:new             #40  <Class QueryBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #41  <Method void QueryBuilder()>
	//    7   15:ldc1            #75  <String "ALTER">
	//    8   17:invokevirtual   #49  <Method QueryBuilder QueryBuilder.append(Object)>
	//    9   20:ldc1            #77  <String "TABLE">
	//   10   22:invokevirtual   #80  <Method QueryBuilder QueryBuilder.appendSpaceSeparated(Object)>
	//   11   25:putfield        #73  <Field QueryBuilder query>
		return query;
	//   12   28:aload_0         
	//   13   29:getfield        #73  <Field QueryBuilder query>
	//   14   32:areturn         
	}

	public List getColumnDefinitions()
	{
		String s = (new QueryBuilder(((Object) (getAlterTableQueryBuilder())))).append(((Object) (FlowManager.getTableName(table)))).toString();
	//    0    0:new             #40  <Class QueryBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #84  <Method QueryBuilder getAlterTableQueryBuilder()>
	//    4    8:invokespecial   #87  <Method void QueryBuilder(Object)>
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field Class table>
	//    7   15:invokestatic    #93  <Method String FlowManager.getTableName(Class)>
	//    8   18:invokevirtual   #49  <Method QueryBuilder QueryBuilder.append(Object)>
	//    9   21:invokevirtual   #97  <Method String QueryBuilder.toString()>
	//   10   24:astore_1        
		ArrayList arraylist = new ArrayList();
	//   11   25:new             #35  <Class ArrayList>
	//   12   28:dup             
	//   13   29:invokespecial   #36  <Method void ArrayList()>
	//   14   32:astore_2        
		if(columnDefinitions != null)
	//*  15   33:aload_0         
	//*  16   34:getfield        #33  <Field List columnDefinitions>
	//*  17   37:ifnull          104
		{
			QueryBuilder querybuilder;
			for(Iterator iterator = columnDefinitions.iterator(); iterator.hasNext(); ((List) (arraylist)).add(((Object) ((new QueryBuilder(((Object) (s)))).appendSpaceSeparated("ADD COLUMN").append(((Object) (querybuilder.getQuery()))).getQuery()))))
	//*  18   40:aload_0         
	//*  19   41:getfield        #33  <Field List columnDefinitions>
	//*  20   44:invokeinterface #101 <Method Iterator List.iterator()>
	//*  21   49:astore_3        
	//*  22   50:aload_3         
	//*  23   51:invokeinterface #107 <Method boolean Iterator.hasNext()>
	//*  24   56:ifeq            104
				querybuilder = (QueryBuilder)iterator.next();
	//   25   59:aload_3         
	//   26   60:invokeinterface #111 <Method Object Iterator.next()>
	//   27   65:checkcast       #40  <Class QueryBuilder>
	//   28   68:astore          4

	//   29   70:aload_2         
	//   30   71:new             #40  <Class QueryBuilder>
	//   31   74:dup             
	//   32   75:aload_1         
	//   33   76:invokespecial   #87  <Method void QueryBuilder(Object)>
	//   34   79:ldc1            #113 <String "ADD COLUMN">
	//   35   81:invokevirtual   #80  <Method QueryBuilder QueryBuilder.appendSpaceSeparated(Object)>
	//   36   84:aload           4
	//   37   86:invokevirtual   #116 <Method String QueryBuilder.getQuery()>
	//   38   89:invokevirtual   #49  <Method QueryBuilder QueryBuilder.append(Object)>
	//   39   92:invokevirtual   #116 <Method String QueryBuilder.getQuery()>
	//   40   95:invokeinterface #63  <Method boolean List.add(Object)>
	//   41  100:pop             
		}
	//*  42  101:goto            50
		return ((List) (arraylist));
	//   43  104:aload_2         
	//   44  105:areturn         
	}

	public String getRenameQuery()
	{
		return (new QueryBuilder(((Object) (getAlterTableQueryBuilder().getQuery())))).appendQuotedIfNeeded(oldTableName).append(((Object) (renameQuery))).append(((Object) (FlowManager.getTableName(table)))).getQuery();
	//    0    0:new             #40  <Class QueryBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #84  <Method QueryBuilder getAlterTableQueryBuilder()>
	//    4    8:invokevirtual   #116 <Method String QueryBuilder.getQuery()>
	//    5   11:invokespecial   #87  <Method void QueryBuilder(Object)>
	//    6   14:aload_0         
	//    7   15:getfield        #120 <Field String oldTableName>
	//    8   18:invokevirtual   #124 <Method QueryBuilder QueryBuilder.appendQuotedIfNeeded(String)>
	//    9   21:aload_0         
	//   10   22:getfield        #126 <Field QueryBuilder renameQuery>
	//   11   25:invokevirtual   #49  <Method QueryBuilder QueryBuilder.append(Object)>
	//   12   28:aload_0         
	//   13   29:getfield        #25  <Field Class table>
	//   14   32:invokestatic    #93  <Method String FlowManager.getTableName(Class)>
	//   15   35:invokevirtual   #49  <Method QueryBuilder QueryBuilder.append(Object)>
	//   16   38:invokevirtual   #116 <Method String QueryBuilder.getQuery()>
	//   17   41:areturn         
	}

	public final void migrate(DatabaseWrapper databasewrapper)
	{
		Cursor cursor;
		String s;
		String s1;
		s = getAlterTableQueryBuilder().getQuery();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #84  <Method QueryBuilder getAlterTableQueryBuilder()>
	//    2    4:invokevirtual   #116 <Method String QueryBuilder.getQuery()>
	//    3    7:astore          4
		s1 = FlowManager.getTableName(table);
	//    4    9:aload_0         
	//    5   10:getfield        #25  <Field Class table>
	//    6   13:invokestatic    #93  <Method String FlowManager.getTableName(Class)>
	//    7   16:astore          5
		if(renameQuery != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #126 <Field QueryBuilder renameQuery>
	//*  10   22:ifnull          65
			databasewrapper.execSQL((new QueryBuilder(((Object) (s)))).appendQuotedIfNeeded(oldTableName).append(((Object) (renameQuery.getQuery()))).append(((Object) (s1))).toString());
	//   11   25:aload_1         
	//   12   26:new             #40  <Class QueryBuilder>
	//   13   29:dup             
	//   14   30:aload           4
	//   15   32:invokespecial   #87  <Method void QueryBuilder(Object)>
	//   16   35:aload_0         
	//   17   36:getfield        #120 <Field String oldTableName>
	//   18   39:invokevirtual   #124 <Method QueryBuilder QueryBuilder.appendQuotedIfNeeded(String)>
	//   19   42:aload_0         
	//   20   43:getfield        #126 <Field QueryBuilder renameQuery>
	//   21   46:invokevirtual   #116 <Method String QueryBuilder.getQuery()>
	//   22   49:invokevirtual   #49  <Method QueryBuilder QueryBuilder.append(Object)>
	//   23   52:aload           5
	//   24   54:invokevirtual   #49  <Method QueryBuilder QueryBuilder.append(Object)>
	//   25   57:invokevirtual   #97  <Method String QueryBuilder.toString()>
	//   26   60:invokeinterface #134 <Method void DatabaseWrapper.execSQL(String)>
		if(columnDefinitions == null)
			break MISSING_BLOCK_LABEL_221;
	//   27   65:aload_0         
	//   28   66:getfield        #33  <Field List columnDefinitions>
	//   29   69:ifnull          221
		cursor = SQLite.select(new IProperty[0]).from(table).limit(0).query(databasewrapper);
	//   30   72:iconst_0        
	//   31   73:anewarray       IProperty[]
	//   32   76:invokestatic    #142 <Method Select SQLite.select(IProperty[])>
	//   33   79:aload_0         
	//   34   80:getfield        #25  <Field Class table>
	//   35   83:invokevirtual   #148 <Method From Select.from(Class)>
	//   36   86:iconst_0        
	//   37   87:invokevirtual   #154 <Method Where From.limit(int)>
	//   38   90:aload_1         
	//   39   91:invokevirtual   #159 <Method Cursor Where.query(DatabaseWrapper)>
	//   40   94:astore_3        
		if(cursor == null)
			break MISSING_BLOCK_LABEL_221;
	//   41   95:aload_3         
	//   42   96:ifnull          221
		s = (new QueryBuilder(((Object) (s)))).append(((Object) (s1))).toString();
	//   43   99:new             #40  <Class QueryBuilder>
	//   44  102:dup             
	//   45  103:aload           4
	//   46  105:invokespecial   #87  <Method void QueryBuilder(Object)>
	//   47  108:aload           5
	//   48  110:invokevirtual   #49  <Method QueryBuilder QueryBuilder.append(Object)>
	//   49  113:invokevirtual   #97  <Method String QueryBuilder.toString()>
	//   50  116:astore          4
		int i = 0;
	//   51  118:iconst_0        
	//   52  119:istore_2        
_L2:
		if(i >= columnDefinitions.size())
			break; /* Loop/switch isn't completed */
	//   53  120:iload_2         
	//   54  121:aload_0         
	//   55  122:getfield        #33  <Field List columnDefinitions>
	//   56  125:invokeinterface #163 <Method int List.size()>
	//   57  130:icmpge          215
		QueryBuilder querybuilder = (QueryBuilder)columnDefinitions.get(i);
	//   58  133:aload_0         
	//   59  134:getfield        #33  <Field List columnDefinitions>
	//   60  137:iload_2         
	//   61  138:invokeinterface #167 <Method Object List.get(int)>
	//   62  143:checkcast       #40  <Class QueryBuilder>
	//   63  146:astore          5
		if(cursor.getColumnIndex(QueryBuilder.stripQuotes((String)columnNames.get(i))) == -1)
	//*  64  148:aload_3         
	//*  65  149:aload_0         
	//*  66  150:getfield        #38  <Field List columnNames>
	//*  67  153:iload_2         
	//*  68  154:invokeinterface #167 <Method Object List.get(int)>
	//*  69  159:checkcast       #169 <Class String>
	//*  70  162:invokestatic    #172 <Method String QueryBuilder.stripQuotes(String)>
	//*  71  165:invokeinterface #178 <Method int Cursor.getColumnIndex(String)>
	//*  72  170:iconst_m1       
	//*  73  171:icmpne          208
			databasewrapper.execSQL((new StringBuilder()).append(s).append(" ADD COLUMN ").append(querybuilder.getQuery()).toString());
	//   74  174:aload_1         
	//   75  175:new             #180 <Class StringBuilder>
	//   76  178:dup             
	//   77  179:invokespecial   #181 <Method void StringBuilder()>
	//   78  182:aload           4
	//   79  184:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   80  187:ldc1            #186 <String " ADD COLUMN ">
	//   81  189:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   82  192:aload           5
	//   83  194:invokevirtual   #116 <Method String QueryBuilder.getQuery()>
	//   84  197:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   85  200:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   86  203:invokeinterface #134 <Method void DatabaseWrapper.execSQL(String)>
		i++;
	//   87  208:iload_2         
	//   88  209:iconst_1        
	//   89  210:iadd            
	//   90  211:istore_2        
		if(true) goto _L2; else goto _L1
	//   91  212:goto            120
_L1:
		cursor.close();
	//   92  215:aload_3         
	//   93  216:invokeinterface #190 <Method void Cursor.close()>
		return;
	//   94  221:return          
		databasewrapper;
	//   95  222:astore_1        
		cursor.close();
	//   96  223:aload_3         
	//   97  224:invokeinterface #190 <Method void Cursor.close()>
		throw databasewrapper;
	//   98  229:aload_1         
	//   99  230:athrow          
	}

	public void onPostMigrate()
	{
		query = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #73  <Field QueryBuilder query>
		renameQuery = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #126 <Field QueryBuilder renameQuery>
		columnDefinitions = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #33  <Field List columnDefinitions>
		columnNames = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #38  <Field List columnNames>
	//   12   20:return          
	}

	public AlterTableMigration renameFrom(String s)
	{
		oldTableName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #120 <Field String oldTableName>
		renameQuery = (new QueryBuilder()).append(" RENAME").appendSpaceSeparated("TO");
	//    3    5:aload_0         
	//    4    6:new             #40  <Class QueryBuilder>
	//    5    9:dup             
	//    6   10:invokespecial   #41  <Method void QueryBuilder()>
	//    7   13:ldc1            #197 <String " RENAME">
	//    8   15:invokevirtual   #49  <Method QueryBuilder QueryBuilder.append(Object)>
	//    9   18:ldc1            #199 <String "TO">
	//   10   20:invokevirtual   #80  <Method QueryBuilder QueryBuilder.appendSpaceSeparated(Object)>
	//   11   23:putfield        #126 <Field QueryBuilder renameQuery>
		return this;
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	private List columnDefinitions;
	private List columnNames;
	private String oldTableName;
	private QueryBuilder query;
	private QueryBuilder renameQuery;
	private final Class table;
}
