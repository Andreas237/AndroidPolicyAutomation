// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.persistentQueue.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

// Referenced classes of package com.birbit.android.jobqueue.persistentQueue.sqlite:
//			SqlHelper

public class DbOpenHelper extends SQLiteOpenHelper
{

	public DbOpenHelper(Context context, String s)
	{
		super(context, s, ((android.database.sqlite.SQLiteDatabase.CursorFactory) (null)), 12);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:bipush          12
	//    5    6:invokespecial   #127 <Method void SQLiteOpenHelper(Context, String, android.database.sqlite.SQLiteDatabase$CursorFactory, int)>
	//    6    9:return          
	}

	private void addCancelColumn(SQLiteDatabase sqlitedatabase)
	{
		sqlitedatabase.execSQL((new StringBuilder()).append("ALTER TABLE job_holder ADD COLUMN ").append(CANCELLED_COLUMN.columnName).append(" ").append(CANCELLED_COLUMN.type).toString());
	//    0    0:aload_1         
	//    1    1:new             #131 <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #133 <Method void StringBuilder()>
	//    4    8:ldc1            #135 <String "ALTER TABLE job_holder ADD COLUMN ">
	//    5   10:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//    6   13:getstatic       #101 <Field SqlHelper$Property CANCELLED_COLUMN>
	//    7   16:getfield        #110 <Field String SqlHelper$Property.columnName>
	//    8   19:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #141 <String " ">
	//   10   24:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   11   27:getstatic       #101 <Field SqlHelper$Property CANCELLED_COLUMN>
	//   12   30:getfield        #144 <Field String SqlHelper$Property.type>
	//   13   33:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   14   36:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   15   39:invokevirtual   #154 <Method void SQLiteDatabase.execSQL(String)>
	//   16   42:return          
	}

	public void onCreate(SQLiteDatabase sqlitedatabase)
	{
		sqlitedatabase.execSQL(SqlHelper.create("job_holder", INSERTION_ORDER_COLUMN, new SqlHelper.Property[] {
			ID_COLUMN, PRIORITY_COLUMN, GROUP_ID_COLUMN, RUN_COUNT_COLUMN, CREATED_NS_COLUMN, DELAY_UNTIL_NS_COLUMN, RUNNING_SESSION_ID_COLUMN, REQUIRED_NETWORK_TYPE_COLUMN, DEADLINE_COLUMN, CANCEL_ON_DEADLINE_COLUMN, 
			CANCELLED_COLUMN
		}));
	//    0    0:aload_1         
	//    1    1:ldc1            #21  <String "job_holder">
	//    2    3:getstatic       #50  <Field SqlHelper$Property INSERTION_ORDER_COLUMN>
	//    3    6:bipush          11
	//    4    8:anewarray       SqlHelper.Property[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:getstatic       #59  <Field SqlHelper$Property ID_COLUMN>
	//    8   16:aastore         
	//    9   17:dup             
	//   10   18:iconst_1        
	//   11   19:getstatic       #63  <Field SqlHelper$Property PRIORITY_COLUMN>
	//   12   22:aastore         
	//   13   23:dup             
	//   14   24:iconst_2        
	//   15   25:getstatic       #67  <Field SqlHelper$Property GROUP_ID_COLUMN>
	//   16   28:aastore         
	//   17   29:dup             
	//   18   30:iconst_3        
	//   19   31:getstatic       #71  <Field SqlHelper$Property RUN_COUNT_COLUMN>
	//   20   34:aastore         
	//   21   35:dup             
	//   22   36:iconst_4        
	//   23   37:getstatic       #77  <Field SqlHelper$Property CREATED_NS_COLUMN>
	//   24   40:aastore         
	//   25   41:dup             
	//   26   42:iconst_5        
	//   27   43:getstatic       #81  <Field SqlHelper$Property DELAY_UNTIL_NS_COLUMN>
	//   28   46:aastore         
	//   29   47:dup             
	//   30   48:bipush          6
	//   31   50:getstatic       #85  <Field SqlHelper$Property RUNNING_SESSION_ID_COLUMN>
	//   32   53:aastore         
	//   33   54:dup             
	//   34   55:bipush          7
	//   35   57:getstatic       #89  <Field SqlHelper$Property REQUIRED_NETWORK_TYPE_COLUMN>
	//   36   60:aastore         
	//   37   61:dup             
	//   38   62:bipush          8
	//   39   64:getstatic       #93  <Field SqlHelper$Property DEADLINE_COLUMN>
	//   40   67:aastore         
	//   41   68:dup             
	//   42   69:bipush          9
	//   43   71:getstatic       #97  <Field SqlHelper$Property CANCEL_ON_DEADLINE_COLUMN>
	//   44   74:aastore         
	//   45   75:dup             
	//   46   76:bipush          10
	//   47   78:getstatic       #101 <Field SqlHelper$Property CANCELLED_COLUMN>
	//   48   81:aastore         
	//   49   82:invokestatic    #161 <Method String SqlHelper.create(String, SqlHelper$Property, SqlHelper$Property[])>
	//   50   85:invokevirtual   #154 <Method void SQLiteDatabase.execSQL(String)>
		sqlitedatabase.execSQL(SqlHelper.create("job_holder_tags", TAGS_ID_COLUMN, new SqlHelper.Property[] {
			TAGS_JOB_ID_COLUMN, TAGS_NAME_COLUMN
		}));
	//   51   88:aload_1         
	//   52   89:ldc1            #24  <String "job_holder_tags">
	//   53   91:getstatic       #103 <Field SqlHelper$Property TAGS_ID_COLUMN>
	//   54   94:iconst_2        
	//   55   95:anewarray       SqlHelper.Property[]
	//   56   98:dup             
	//   57   99:iconst_0        
	//   58  100:getstatic       #118 <Field SqlHelper$Property TAGS_JOB_ID_COLUMN>
	//   59  103:aastore         
	//   60  104:dup             
	//   61  105:iconst_1        
	//   62  106:getstatic       #122 <Field SqlHelper$Property TAGS_NAME_COLUMN>
	//   63  109:aastore         
	//   64  110:invokestatic    #161 <Method String SqlHelper.create(String, SqlHelper$Property, SqlHelper$Property[])>
	//   65  113:invokevirtual   #154 <Method void SQLiteDatabase.execSQL(String)>
		sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX IF NOT EXISTS TAG_NAME_INDEX ON job_holder_tags(").append(TAGS_NAME_COLUMN.columnName).append(")").toString());
	//   66  116:aload_1         
	//   67  117:new             #131 <Class StringBuilder>
	//   68  120:dup             
	//   69  121:invokespecial   #133 <Method void StringBuilder()>
	//   70  124:ldc1            #163 <String "CREATE INDEX IF NOT EXISTS TAG_NAME_INDEX ON job_holder_tags(">
	//   71  126:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   72  129:getstatic       #122 <Field SqlHelper$Property TAGS_NAME_COLUMN>
	//   73  132:getfield        #110 <Field String SqlHelper$Property.columnName>
	//   74  135:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   75  138:ldc1            #165 <String ")">
	//   76  140:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   77  143:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   78  146:invokevirtual   #154 <Method void SQLiteDatabase.execSQL(String)>
	//   79  149:return          
	}

	public void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
	{
		onUpgrade(sqlitedatabase, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #170 <Method void onUpgrade(SQLiteDatabase, int, int)>
	//    5    7:return          
	}

	public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
	{
		if(i == 11)
	//*   0    0:iload_2         
	//*   1    1:bipush          11
	//*   2    3:icmpne          12
		{
			addCancelColumn(sqlitedatabase);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #172 <Method void addCancelColumn(SQLiteDatabase)>
			return;
	//    6   11:return          
		} else
		{
			sqlitedatabase.execSQL(SqlHelper.drop("job_holder"));
	//    7   12:aload_1         
	//    8   13:ldc1            #21  <String "job_holder">
	//    9   15:invokestatic    #176 <Method String SqlHelper.drop(String)>
	//   10   18:invokevirtual   #154 <Method void SQLiteDatabase.execSQL(String)>
			sqlitedatabase.execSQL(SqlHelper.drop("job_holder_tags"));
	//   11   21:aload_1         
	//   12   22:ldc1            #24  <String "job_holder_tags">
	//   13   24:invokestatic    #176 <Method String SqlHelper.drop(String)>
	//   14   27:invokevirtual   #154 <Method void SQLiteDatabase.execSQL(String)>
			sqlitedatabase.execSQL("DROP INDEX IF EXISTS TAG_NAME_INDEX");
	//   15   30:aload_1         
	//   16   31:ldc1            #178 <String "DROP INDEX IF EXISTS TAG_NAME_INDEX">
	//   17   33:invokevirtual   #154 <Method void SQLiteDatabase.execSQL(String)>
			onCreate(sqlitedatabase);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #180 <Method void onCreate(SQLiteDatabase)>
			return;
	//   21   41:return          
		}
	}

	static final SqlHelper.Property CANCELLED_COLUMN = new SqlHelper.Property("cancelled", "integer", 11);
	static final SqlHelper.Property CANCEL_ON_DEADLINE_COLUMN = new SqlHelper.Property("cancel_on_deadline", "integer", 10);
	static final int COLUMN_COUNT = 12;
	static final SqlHelper.Property CREATED_NS_COLUMN = new SqlHelper.Property("created_ns", "long", 5);
	private static final int DB_VERSION = 12;
	static final SqlHelper.Property DEADLINE_COLUMN = new SqlHelper.Property("deadline", "integer", 9);
	static final SqlHelper.Property DELAY_UNTIL_NS_COLUMN = new SqlHelper.Property("delay_until_ns", "long", 6);
	static final SqlHelper.Property GROUP_ID_COLUMN = new SqlHelper.Property("group_id", "text", 3);
	static final SqlHelper.Property ID_COLUMN;
	static final SqlHelper.Property INSERTION_ORDER_COLUMN = new SqlHelper.Property("insertionOrder", "integer", 0);
	static final String JOB_HOLDER_TABLE_NAME = "job_holder";
	static final String JOB_TAGS_TABLE_NAME = "job_holder_tags";
	static final SqlHelper.Property PRIORITY_COLUMN = new SqlHelper.Property("priority", "integer", 2);
	static final SqlHelper.Property REQUIRED_NETWORK_TYPE_COLUMN = new SqlHelper.Property("network_type", "integer", 8);
	static final SqlHelper.Property RUNNING_SESSION_ID_COLUMN = new SqlHelper.Property("running_session_id", "long", 7);
	static final SqlHelper.Property RUN_COUNT_COLUMN = new SqlHelper.Property("run_count", "integer", 4);
	static final int TAGS_COLUMN_COUNT = 3;
	static final SqlHelper.Property TAGS_ID_COLUMN = new SqlHelper.Property("_id", "integer", 0);
	static final SqlHelper.Property TAGS_JOB_ID_COLUMN;
	static final SqlHelper.Property TAGS_NAME_COLUMN = new SqlHelper.Property("tag_name", "text", 2);
	static final String TAG_INDEX_NAME = "TAG_NAME_INDEX";

	static 
	{
	//    0    0:new             #40  <Class SqlHelper$Property>
	//    1    3:dup             
	//    2    4:ldc1            #42  <String "insertionOrder">
	//    3    6:ldc1            #44  <String "integer">
	//    4    8:iconst_0        
	//    5    9:invokespecial   #48  <Method void SqlHelper$Property(String, String, int)>
	//    6   12:putstatic       #50  <Field SqlHelper$Property INSERTION_ORDER_COLUMN>
		ID_COLUMN = new SqlHelper.Property("_id", "text", 1, ((SqlHelper.ForeignKey) (null)), true);
	//    7   15:new             #40  <Class SqlHelper$Property>
	//    8   18:dup             
	//    9   19:ldc1            #52  <String "_id">
	//   10   21:ldc1            #54  <String "text">
	//   11   23:iconst_1        
	//   12   24:aconst_null     
	//   13   25:iconst_1        
	//   14   26:invokespecial   #57  <Method void SqlHelper$Property(String, String, int, SqlHelper$ForeignKey, boolean)>
	//   15   29:putstatic       #59  <Field SqlHelper$Property ID_COLUMN>
	//   16   32:new             #40  <Class SqlHelper$Property>
	//   17   35:dup             
	//   18   36:ldc1            #61  <String "priority">
	//   19   38:ldc1            #44  <String "integer">
	//   20   40:iconst_2        
	//   21   41:invokespecial   #48  <Method void SqlHelper$Property(String, String, int)>
	//   22   44:putstatic       #63  <Field SqlHelper$Property PRIORITY_COLUMN>
	//   23   47:new             #40  <Class SqlHelper$Property>
	//   24   50:dup             
	//   25   51:ldc1            #65  <String "group_id">
	//   26   53:ldc1            #54  <String "text">
	//   27   55:iconst_3        
	//   28   56:invokespecial   #48  <Method void SqlHelper$Property(String, String, int)>
	//   29   59:putstatic       #67  <Field SqlHelper$Property GROUP_ID_COLUMN>
	//   30   62:new             #40  <Class SqlHelper$Property>
	//   31   65:dup             
	//   32   66:ldc1            #69  <String "run_count">
	//   33   68:ldc1            #44  <String "integer">
	//   34   70:iconst_4        
	//   35   71:invokespecial   #48  <Method void SqlHelper$Property(String, String, int)>
	//   36   74:putstatic       #71  <Field SqlHelper$Property RUN_COUNT_COLUMN>
	//   37   77:new             #40  <Class SqlHelper$Property>
	//   38   80:dup             
	//   39   81:ldc1            #73  <String "created_ns">
	//   40   83:ldc1            #75  <String "long">
	//   41   85:iconst_5        
	//   42   86:invokespecial   #48  <Method void SqlHelper$Property(String, String, int)>
	//   43   89:putstatic       #77  <Field SqlHelper$Property CREATED_NS_COLUMN>
	//   44   92:new             #40  <Class SqlHelper$Property>
	//   45   95:dup             
	//   46   96:ldc1            #79  <String "delay_until_ns">
	//   47   98:ldc1            #75  <String "long">
	//   48  100:bipush          6
	//   49  102:invokespecial   #48  <Method void SqlHelper$Property(String, String, int)>
	//   50  105:putstatic       #81  <Field SqlHelper$Property DELAY_UNTIL_NS_COLUMN>
	//   51  108:new             #40  <Class SqlHelper$Property>
	//   52  111:dup             
	//   53  112:ldc1            #83  <String "running_session_id">
	//   54  114:ldc1            #75  <String "long">
	//   55  116:bipush          7
	//   56  118:invokespecial   #48  <Method void SqlHelper$Property(String, String, int)>
	//   57  121:putstatic       #85  <Field SqlHelper$Property RUNNING_SESSION_ID_COLUMN>
	//   58  124:new             #40  <Class SqlHelper$Property>
	//   59  127:dup             
	//   60  128:ldc1            #87  <String "network_type">
	//   61  130:ldc1            #44  <String "integer">
	//   62  132:bipush          8
	//   63  134:invokespecial   #48  <Method void SqlHelper$Property(String, String, int)>
	//   64  137:putstatic       #89  <Field SqlHelper$Property REQUIRED_NETWORK_TYPE_COLUMN>
	//   65  140:new             #40  <Class SqlHelper$Property>
	//   66  143:dup             
	//   67  144:ldc1            #91  <String "deadline">
	//   68  146:ldc1            #44  <String "integer">
	//   69  148:bipush          9
	//   70  150:invokespecial   #48  <Method void SqlHelper$Property(String, String, int)>
	//   71  153:putstatic       #93  <Field SqlHelper$Property DEADLINE_COLUMN>
	//   72  156:new             #40  <Class SqlHelper$Property>
	//   73  159:dup             
	//   74  160:ldc1            #95  <String "cancel_on_deadline">
	//   75  162:ldc1            #44  <String "integer">
	//   76  164:bipush          10
	//   77  166:invokespecial   #48  <Method void SqlHelper$Property(String, String, int)>
	//   78  169:putstatic       #97  <Field SqlHelper$Property CANCEL_ON_DEADLINE_COLUMN>
	//   79  172:new             #40  <Class SqlHelper$Property>
	//   80  175:dup             
	//   81  176:ldc1            #99  <String "cancelled">
	//   82  178:ldc1            #44  <String "integer">
	//   83  180:bipush          11
	//   84  182:invokespecial   #48  <Method void SqlHelper$Property(String, String, int)>
	//   85  185:putstatic       #101 <Field SqlHelper$Property CANCELLED_COLUMN>
	//   86  188:new             #40  <Class SqlHelper$Property>
	//   87  191:dup             
	//   88  192:ldc1            #52  <String "_id">
	//   89  194:ldc1            #44  <String "integer">
	//   90  196:iconst_0        
	//   91  197:invokespecial   #48  <Method void SqlHelper$Property(String, String, int)>
	//   92  200:putstatic       #103 <Field SqlHelper$Property TAGS_ID_COLUMN>
		TAGS_JOB_ID_COLUMN = new SqlHelper.Property("job_id", "text", 1, new SqlHelper.ForeignKey("job_holder", ID_COLUMN.columnName));
	//   93  203:new             #40  <Class SqlHelper$Property>
	//   94  206:dup             
	//   95  207:ldc1            #105 <String "job_id">
	//   96  209:ldc1            #54  <String "text">
	//   97  211:iconst_1        
	//   98  212:new             #107 <Class SqlHelper$ForeignKey>
	//   99  215:dup             
	//  100  216:ldc1            #21  <String "job_holder">
	//  101  218:getstatic       #59  <Field SqlHelper$Property ID_COLUMN>
	//  102  221:getfield        #110 <Field String SqlHelper$Property.columnName>
	//  103  224:invokespecial   #113 <Method void SqlHelper$ForeignKey(String, String)>
	//  104  227:invokespecial   #116 <Method void SqlHelper$Property(String, String, int, SqlHelper$ForeignKey)>
	//  105  230:putstatic       #118 <Field SqlHelper$Property TAGS_JOB_ID_COLUMN>
	//  106  233:new             #40  <Class SqlHelper$Property>
	//  107  236:dup             
	//  108  237:ldc1            #120 <String "tag_name">
	//  109  239:ldc1            #54  <String "text">
	//  110  241:iconst_2        
	//  111  242:invokespecial   #48  <Method void SqlHelper$Property(String, String, int)>
	//  112  245:putstatic       #122 <Field SqlHelper$Property TAGS_NAME_COLUMN>
	//* 113  248:return          
	}
}
