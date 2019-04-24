// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.persistentQueue.sqlite;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.birbit.android.jobqueue.log.JqLog;

// Referenced classes of package com.birbit.android.jobqueue.persistentQueue.sqlite:
//			DbOpenHelper

public class SqlHelper
{
	public static class ForeignKey
	{

		final String targetFieldName;
		final String targetTable;

		public ForeignKey(String s, String s1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			targetTable = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field String targetTable>
			targetFieldName = s1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #19  <Field String targetFieldName>
		//    8   14:return          
		}
	}

	public static class Order
	{

		final Property property;
		final Type type;

		public Order(Property property1, Type type1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			property = property1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field SqlHelper$Property property>
			type = type1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field SqlHelper$Order$Type type>
		//    8   14:return          
		}
	}

	public static final class Order.Type extends Enum
	{

		public static Order.Type valueOf(String s)
		{
			return (Order.Type)Enum.valueOf(com/birbit/android/jobqueue/persistentQueue/sqlite/SqlHelper$Order$Type, s);
		//    0    0:ldc1            #2   <Class SqlHelper$Order$Type>
		//    1    2:aload_0         
		//    2    3:invokestatic    #38  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class SqlHelper$Order$Type>
		//    4    9:areturn         
		}

		public static Order.Type[] values()
		{
			return (Order.Type[])((Order.Type []) ($VALUES)).clone();
		//    0    0:getstatic       #30  <Field SqlHelper$Order$Type[] $VALUES>
		//    1    3:invokevirtual   #45  <Method Object _5B_Lcom.birbit.android.jobqueue.persistentQueue.sqlite.SqlHelper$Order$Type_3B_.clone()>
		//    2    6:checkcast       #41  <Class SqlHelper$Order$Type[]>
		//    3    9:areturn         
		}

		private static final Order.Type $VALUES[];
		public static final Order.Type ASC;
		public static final Order.Type DESC;

		static 
		{
			ASC = new Order.Type("ASC", 0);
		//    0    0:new             #2   <Class SqlHelper$Order$Type>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "ASC">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void SqlHelper$Order$Type(String, int)>
		//    5   10:putstatic       #25  <Field SqlHelper$Order$Type ASC>
			DESC = new Order.Type("DESC", 1);
		//    6   13:new             #2   <Class SqlHelper$Order$Type>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "DESC">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void SqlHelper$Order$Type(String, int)>
		//   11   23:putstatic       #28  <Field SqlHelper$Order$Type DESC>
			$VALUES = (new Order.Type[] {
				ASC, DESC
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       Order.Type[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #25  <Field SqlHelper$Order$Type ASC>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #28  <Field SqlHelper$Order$Type DESC>
		//   21   41:aastore         
		//   22   42:putstatic       #30  <Field SqlHelper$Order$Type[] $VALUES>
		//*  23   45:return          
		}

		private Order.Type(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #32  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static class Property
	{

		public final int columnIndex;
		final String columnName;
		public final ForeignKey foreignKey;
		final String type;
		public final boolean unique;

		public Property(String s, String s1, int i)
		{
			this(s, s1, i, ((ForeignKey) (null)), false);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iload_3         
		//    4    4:aconst_null     
		//    5    5:iconst_0        
		//    6    6:invokespecial   #21  <Method void SqlHelper$Property(String, String, int, SqlHelper$ForeignKey, boolean)>
		//    7    9:return          
		}

		public Property(String s, String s1, int i, ForeignKey foreignkey)
		{
			this(s, s1, i, foreignkey, false);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iload_3         
		//    4    4:aload           4
		//    5    6:iconst_0        
		//    6    7:invokespecial   #21  <Method void SqlHelper$Property(String, String, int, SqlHelper$ForeignKey, boolean)>
		//    7   10:return          
		}

		public Property(String s, String s1, int i, ForeignKey foreignkey, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			columnName = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #28  <Field String columnName>
			type = s1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #30  <Field String type>
			columnIndex = i;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #32  <Field int columnIndex>
			foreignKey = foreignkey;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #34  <Field SqlHelper$ForeignKey foreignKey>
			unique = flag;
		//   14   25:aload_0         
		//   15   26:iload           5
		//   16   28:putfield        #36  <Field boolean unique>
		//   17   31:return          
		}
	}


	public SqlHelper(SQLiteDatabase sqlitedatabase, String s, String s1, int i, String s2, int j, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #50  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #51  <Method void StringBuilder()>
	//    6   12:putfield        #53  <Field StringBuilder reusedStringBuilder>
		db = sqlitedatabase;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #55  <Field SQLiteDatabase db>
		tableName = s;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #57  <Field String tableName>
		columnCount = i;
	//   13   25:aload_0         
	//   14   26:iload           4
	//   15   28:putfield        #59  <Field int columnCount>
		primaryKeyColumnName = s1;
	//   16   31:aload_0         
	//   17   32:aload_3         
	//   18   33:putfield        #61  <Field String primaryKeyColumnName>
		sessionId = l;
	//   19   36:aload_0         
	//   20   37:lload           7
	//   21   39:putfield        #63  <Field long sessionId>
		tagsColumnCount = j;
	//   22   42:aload_0         
	//   23   43:iload           6
	//   24   45:putfield        #65  <Field int tagsColumnCount>
		tagsTableName = s2;
	//   25   48:aload_0         
	//   26   49:aload           5
	//   27   51:putfield        #67  <Field String tagsTableName>
		FIND_BY_ID_QUERY = (new StringBuilder()).append("SELECT * FROM ").append(s).append(" WHERE ").append(DbOpenHelper.ID_COLUMN.columnName).append(" = ?").toString();
	//   28   54:aload_0         
	//   29   55:new             #50  <Class StringBuilder>
	//   30   58:dup             
	//   31   59:invokespecial   #51  <Method void StringBuilder()>
	//   32   62:ldc1            #69  <String "SELECT * FROM ">
	//   33   64:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   34   67:aload_2         
	//   35   68:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   36   71:ldc1            #75  <String " WHERE ">
	//   37   73:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   38   76:getstatic       #81  <Field SqlHelper$Property DbOpenHelper.ID_COLUMN>
	//   39   79:getfield        #84  <Field String SqlHelper$Property.columnName>
	//   40   82:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   41   85:ldc1            #86  <String " = ?">
	//   42   87:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   43   90:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   44   93:putfield        #92  <Field String FIND_BY_ID_QUERY>
		FIND_BY_TAG_QUERY = (new StringBuilder()).append("SELECT * FROM ").append(s).append(" WHERE ").append(DbOpenHelper.ID_COLUMN.columnName).append(" IN ( SELECT ").append(DbOpenHelper.TAGS_JOB_ID_COLUMN.columnName).append(" FROM ").append(s2).append(" WHERE ").append(DbOpenHelper.TAGS_NAME_COLUMN.columnName).append(" = ?)").toString();
	//   45   96:aload_0         
	//   46   97:new             #50  <Class StringBuilder>
	//   47  100:dup             
	//   48  101:invokespecial   #51  <Method void StringBuilder()>
	//   49  104:ldc1            #69  <String "SELECT * FROM ">
	//   50  106:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   51  109:aload_2         
	//   52  110:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   53  113:ldc1            #75  <String " WHERE ">
	//   54  115:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   55  118:getstatic       #81  <Field SqlHelper$Property DbOpenHelper.ID_COLUMN>
	//   56  121:getfield        #84  <Field String SqlHelper$Property.columnName>
	//   57  124:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   58  127:ldc1            #94  <String " IN ( SELECT ">
	//   59  129:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   60  132:getstatic       #97  <Field SqlHelper$Property DbOpenHelper.TAGS_JOB_ID_COLUMN>
	//   61  135:getfield        #84  <Field String SqlHelper$Property.columnName>
	//   62  138:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   63  141:ldc1            #99  <String " FROM ">
	//   64  143:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   65  146:aload           5
	//   66  148:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   67  151:ldc1            #75  <String " WHERE ">
	//   68  153:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   69  156:getstatic       #102 <Field SqlHelper$Property DbOpenHelper.TAGS_NAME_COLUMN>
	//   70  159:getfield        #84  <Field String SqlHelper$Property.columnName>
	//   71  162:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   72  165:ldc1            #104 <String " = ?)">
	//   73  167:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   74  170:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   75  173:putfield        #106 <Field String FIND_BY_TAG_QUERY>
		LOAD_ALL_IDS_QUERY = (new StringBuilder()).append("SELECT ").append(DbOpenHelper.ID_COLUMN.columnName).append(" FROM ").append(s).toString();
	//   76  176:aload_0         
	//   77  177:new             #50  <Class StringBuilder>
	//   78  180:dup             
	//   79  181:invokespecial   #51  <Method void StringBuilder()>
	//   80  184:ldc1            #108 <String "SELECT ">
	//   81  186:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   82  189:getstatic       #81  <Field SqlHelper$Property DbOpenHelper.ID_COLUMN>
	//   83  192:getfield        #84  <Field String SqlHelper$Property.columnName>
	//   84  195:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   85  198:ldc1            #99  <String " FROM ">
	//   86  200:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   87  203:aload_2         
	//   88  204:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   89  207:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   90  210:putfield        #110 <Field String LOAD_ALL_IDS_QUERY>
		LOAD_TAGS_QUERY = (new StringBuilder()).append("SELECT ").append(DbOpenHelper.TAGS_NAME_COLUMN.columnName).append(" FROM ").append("job_holder_tags").append(" WHERE ").append(DbOpenHelper.TAGS_JOB_ID_COLUMN.columnName).append(" = ?").toString();
	//   91  213:aload_0         
	//   92  214:new             #50  <Class StringBuilder>
	//   93  217:dup             
	//   94  218:invokespecial   #51  <Method void StringBuilder()>
	//   95  221:ldc1            #108 <String "SELECT ">
	//   96  223:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   97  226:getstatic       #102 <Field SqlHelper$Property DbOpenHelper.TAGS_NAME_COLUMN>
	//   98  229:getfield        #84  <Field String SqlHelper$Property.columnName>
	//   99  232:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//  100  235:ldc1            #99  <String " FROM ">
	//  101  237:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//  102  240:ldc1            #112 <String "job_holder_tags">
	//  103  242:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//  104  245:ldc1            #75  <String " WHERE ">
	//  105  247:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//  106  250:getstatic       #97  <Field SqlHelper$Property DbOpenHelper.TAGS_JOB_ID_COLUMN>
	//  107  253:getfield        #84  <Field String SqlHelper$Property.columnName>
	//  108  256:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//  109  259:ldc1            #86  <String " = ?">
	//  110  261:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//  111  264:invokevirtual   #90  <Method String StringBuilder.toString()>
	//  112  267:putfield        #114 <Field String LOAD_TAGS_QUERY>
		RE_ENABLE_PENDING_CANCELLATIONS_QUERY = (new StringBuilder()).append("UPDATE ").append(s).append(" SET ").append(DbOpenHelper.CANCELLED_COLUMN.columnName).append(" = 0").toString();
	//  113  270:aload_0         
	//  114  271:new             #50  <Class StringBuilder>
	//  115  274:dup             
	//  116  275:invokespecial   #51  <Method void StringBuilder()>
	//  117  278:ldc1            #116 <String "UPDATE ">
	//  118  280:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//  119  283:aload_2         
	//  120  284:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//  121  287:ldc1            #118 <String " SET ">
	//  122  289:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//  123  292:getstatic       #121 <Field SqlHelper$Property DbOpenHelper.CANCELLED_COLUMN>
	//  124  295:getfield        #84  <Field String SqlHelper$Property.columnName>
	//  125  298:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//  126  301:ldc1            #123 <String " = 0">
	//  127  303:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//  128  306:invokevirtual   #90  <Method String StringBuilder.toString()>
	//  129  309:putfield        #125 <Field String RE_ENABLE_PENDING_CANCELLATIONS_QUERY>
	//  130  312:return          
	}

	static void addPlaceholdersInto(StringBuilder stringbuilder, int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            14
			throw new IllegalArgumentException("cannot create placeholders for 0 items");
	//    2    4:new             #130 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #132 <String "cannot create placeholders for 0 items">
	//    5   10:invokespecial   #135 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		stringbuilder.append("?");
	//    7   14:aload_0         
	//    8   15:ldc1            #137 <String "?">
	//    9   17:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		for(int j = 1; j < i; j++)
	//*  11   21:iconst_1        
	//*  12   22:istore_2        
	//*  13   23:iload_2         
	//*  14   24:iload_1         
	//*  15   25:icmpge          42
			stringbuilder.append(",?");
	//   16   28:aload_0         
	//   17   29:ldc1            #139 <String ",?">
	//   18   31:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             

	//   20   35:iload_2         
	//   21   36:iconst_1        
	//   22   37:iadd            
	//   23   38:istore_2        
	//*  24   39:goto            23
	//   25   42:return          
	}

	public static transient String create(String s, Property property, Property aproperty[])
	{
		StringBuilder stringbuilder = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #143 <String "CREATE TABLE IF NOT EXISTS ">
	//    3    6:invokespecial   #144 <Method void StringBuilder(String)>
	//    4    9:astore          5
		stringbuilder.append(s).append(" (");
	//    5   11:aload           5
	//    6   13:aload_0         
	//    7   14:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:ldc1            #146 <String " (">
	//    9   19:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
		stringbuilder.append(property.columnName).append(" ");
	//   11   23:aload           5
	//   12   25:aload_1         
	//   13   26:getfield        #84  <Field String SqlHelper$Property.columnName>
	//   14   29:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:ldc1            #148 <String " ">
	//   16   34:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
		stringbuilder.append(property.type);
	//   18   38:aload           5
	//   19   40:aload_1         
	//   20   41:getfield        #151 <Field String SqlHelper$Property.type>
	//   21   44:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   22   47:pop             
		stringbuilder.append("  primary key ");
	//   23   48:aload           5
	//   24   50:ldc1            #153 <String "  primary key ">
	//   25   52:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   26   55:pop             
		int k = aproperty.length;
	//   27   56:aload_2         
	//   28   57:arraylength     
	//   29   58:istore          4
		for(int i = 0; i < k; i++)
	//*  30   60:iconst_0        
	//*  31   61:istore_3        
	//*  32   62:iload_3         
	//*  33   63:iload           4
	//*  34   65:icmpge          121
		{
			s = ((String) (aproperty[i]));
	//   35   68:aload_2         
	//   36   69:iload_3         
	//   37   70:aaload          
	//   38   71:astore_0        
			stringbuilder.append(", `").append(((Property) (s)).columnName).append("` ").append(((Property) (s)).type);
	//   39   72:aload           5
	//   40   74:ldc1            #155 <String ", `">
	//   41   76:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   42   79:aload_0         
	//   43   80:getfield        #84  <Field String SqlHelper$Property.columnName>
	//   44   83:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   45   86:ldc1            #157 <String "` ">
	//   46   88:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   47   91:aload_0         
	//   48   92:getfield        #151 <Field String SqlHelper$Property.type>
	//   49   95:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   50   98:pop             
			if(((Property) (s)).unique)
	//*  51   99:aload_0         
	//*  52  100:getfield        #161 <Field boolean SqlHelper$Property.unique>
	//*  53  103:ifeq            114
				stringbuilder.append(" UNIQUE");
	//   54  106:aload           5
	//   55  108:ldc1            #163 <String " UNIQUE">
	//   56  110:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   57  113:pop             
		}

	//   58  114:iload_3         
	//   59  115:iconst_1        
	//   60  116:iadd            
	//   61  117:istore_3        
	//*  62  118:goto            62
		k = aproperty.length;
	//   63  121:aload_2         
	//   64  122:arraylength     
	//   65  123:istore          4
		for(int j = 0; j < k; j++)
	//*  66  125:iconst_0        
	//*  67  126:istore_3        
	//*  68  127:iload_3         
	//*  69  128:iload           4
	//*  70  130:icmpge          200
		{
			s = ((String) (aproperty[j]));
	//   71  133:aload_2         
	//   72  134:iload_3         
	//   73  135:aaload          
	//   74  136:astore_0        
			if(((Property) (s)).foreignKey != null)
	//*  75  137:aload_0         
	//*  76  138:getfield        #167 <Field SqlHelper$ForeignKey SqlHelper$Property.foreignKey>
	//*  77  141:ifnull          193
			{
				property = ((Property) (((Property) (s)).foreignKey));
	//   78  144:aload_0         
	//   79  145:getfield        #167 <Field SqlHelper$ForeignKey SqlHelper$Property.foreignKey>
	//   80  148:astore_1        
				stringbuilder.append(", FOREIGN KEY(`").append(((Property) (s)).columnName).append("`) REFERENCES ").append(((ForeignKey) (property)).targetTable).append("(`").append(((ForeignKey) (property)).targetFieldName).append("`) ON DELETE CASCADE");
	//   81  149:aload           5
	//   82  151:ldc1            #169 <String ", FOREIGN KEY(`">
	//   83  153:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   84  156:aload_0         
	//   85  157:getfield        #84  <Field String SqlHelper$Property.columnName>
	//   86  160:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   87  163:ldc1            #171 <String "`) REFERENCES ">
	//   88  165:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   89  168:aload_1         
	//   90  169:getfield        #174 <Field String SqlHelper$ForeignKey.targetTable>
	//   91  172:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   92  175:ldc1            #176 <String "(`">
	//   93  177:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   94  180:aload_1         
	//   95  181:getfield        #179 <Field String SqlHelper$ForeignKey.targetFieldName>
	//   96  184:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   97  187:ldc1            #181 <String "`) ON DELETE CASCADE">
	//   98  189:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   99  192:pop             
			}
		}

	//  100  193:iload_3         
	//  101  194:iconst_1        
	//  102  195:iadd            
	//  103  196:istore_3        
	//* 104  197:goto            127
		stringbuilder.append(" );");
	//  105  200:aload           5
	//  106  202:ldc1            #183 <String " );">
	//  107  204:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//  108  207:pop             
		JqLog.d(stringbuilder.toString(), new Object[0]);
	//  109  208:aload           5
	//  110  210:invokevirtual   #90  <Method String StringBuilder.toString()>
	//  111  213:iconst_0        
	//  112  214:anewarray       Object[]
	//  113  217:invokestatic    #189 <Method void JqLog.d(String, Object[])>
		return stringbuilder.toString();
	//  114  220:aload           5
	//  115  222:invokevirtual   #90  <Method String StringBuilder.toString()>
	//  116  225:areturn         
	}

	public static String drop(String s)
	{
		return (new StringBuilder()).append("DROP TABLE IF EXISTS ").append(s).toString();
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void StringBuilder()>
	//    3    7:ldc1            #193 <String "DROP TABLE IF EXISTS ">
	//    4    9:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:invokevirtual   #90  <Method String StringBuilder.toString()>
	//    8   19:areturn         
	}

	public transient String createSelect(String s, Integer integer, Order aorder[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		reusedStringBuilder.setLength(0);
	//    2    3:aload_0         
	//    3    4:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//    4    7:iconst_0        
	//    5    8:invokevirtual   #199 <Method void StringBuilder.setLength(int)>
		reusedStringBuilder.append("SELECT * FROM ");
	//    6   11:aload_0         
	//    7   12:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//    8   15:ldc1            #69  <String "SELECT * FROM ">
	//    9   17:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		reusedStringBuilder.append(tableName);
	//   11   21:aload_0         
	//   12   22:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   13   25:aload_0         
	//   14   26:getfield        #57  <Field String tableName>
	//   15   29:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		if(s != null)
	//*  17   33:aload_1         
	//*  18   34:ifnull          51
			reusedStringBuilder.append(" WHERE ").append(s);
	//   19   37:aload_0         
	//   20   38:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   21   41:ldc1            #75  <String " WHERE ">
	//   22   43:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:aload_1         
	//   24   47:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
		boolean flag = true;
	//   26   51:iconst_1        
	//   27   52:istore          5
		int j = aorder.length;
	//   28   54:aload_3         
	//   29   55:arraylength     
	//   30   56:istore          6
		while(i < j) 
	//*  31   58:iload           4
	//*  32   60:iload           6
	//*  33   62:icmpge          137
		{
			s = ((String) (aorder[i]));
	//   34   65:aload_3         
	//   35   66:iload           4
	//   36   68:aaload          
	//   37   69:astore_1        
			if(flag)
	//*  38   70:iload           5
	//*  39   72:ifeq            124
				reusedStringBuilder.append(" ORDER BY ");
	//   40   75:aload_0         
	//   41   76:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   42   79:ldc1            #201 <String " ORDER BY ">
	//   43   81:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   44   84:pop             
			else
	//*  45   85:iconst_0        
	//*  46   86:istore          5
	//*  47   88:aload_0         
	//*  48   89:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//*  49   92:aload_1         
	//*  50   93:getfield        #204 <Field SqlHelper$Property SqlHelper$Order.property>
	//*  51   96:getfield        #84  <Field String SqlHelper$Property.columnName>
	//*  52   99:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//*  53  102:ldc1            #148 <String " ">
	//*  54  104:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//*  55  107:aload_1         
	//*  56  108:getfield        #207 <Field SqlHelper$Order$Type SqlHelper$Order.type>
	//*  57  111:invokevirtual   #210 <Method StringBuilder StringBuilder.append(Object)>
	//*  58  114:pop             
	//*  59  115:iload           4
	//*  60  117:iconst_1        
	//*  61  118:iadd            
	//*  62  119:istore          4
	//*  63  121:goto            58
				reusedStringBuilder.append(",");
	//   64  124:aload_0         
	//   65  125:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   66  128:ldc1            #212 <String ",">
	//   67  130:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   68  133:pop             
			flag = false;
			reusedStringBuilder.append(((Order) (s)).property.columnName).append(" ").append(((Object) (((Order) (s)).type)));
			i++;
		}
	//*  69  134:goto            85
		if(integer != null)
	//*  70  137:aload_2         
	//*  71  138:ifnull          155
			reusedStringBuilder.append(" LIMIT ").append(((Object) (integer)));
	//   72  141:aload_0         
	//   73  142:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   74  145:ldc1            #214 <String " LIMIT ">
	//   75  147:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   76  150:aload_2         
	//   77  151:invokevirtual   #210 <Method StringBuilder StringBuilder.append(Object)>
	//   78  154:pop             
		return reusedStringBuilder.toString();
	//   79  155:aload_0         
	//   80  156:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   81  159:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   82  162:areturn         
	}

	public transient String createSelectOneField(String s, String s1, Integer integer, Order aorder[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		reusedStringBuilder.setLength(0);
	//    2    3:aload_0         
	//    3    4:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//    4    7:iconst_0        
	//    5    8:invokevirtual   #199 <Method void StringBuilder.setLength(int)>
		reusedStringBuilder.append("SELECT ").append(s).append(" FROM ").append(tableName);
	//    6   11:aload_0         
	//    7   12:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//    8   15:ldc1            #108 <String "SELECT ">
	//    9   17:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:ldc1            #99  <String " FROM ">
	//   13   26:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:aload_0         
	//   15   30:getfield        #57  <Field String tableName>
	//   16   33:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   17   36:pop             
		if(s1 != null)
	//*  18   37:aload_2         
	//*  19   38:ifnull          55
			reusedStringBuilder.append(" WHERE ").append(s1);
	//   20   41:aload_0         
	//   21   42:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   22   45:ldc1            #75  <String " WHERE ">
	//   23   47:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   24   50:aload_2         
	//   25   51:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
		boolean flag = true;
	//   27   55:iconst_1        
	//   28   56:istore          6
		int j = aorder.length;
	//   29   58:aload           4
	//   30   60:arraylength     
	//   31   61:istore          7
		while(i < j) 
	//*  32   63:iload           5
	//*  33   65:iload           7
	//*  34   67:icmpge          143
		{
			s = ((String) (aorder[i]));
	//   35   70:aload           4
	//   36   72:iload           5
	//   37   74:aaload          
	//   38   75:astore_1        
			if(flag)
	//*  39   76:iload           6
	//*  40   78:ifeq            130
				reusedStringBuilder.append(" ORDER BY ");
	//   41   81:aload_0         
	//   42   82:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   43   85:ldc1            #201 <String " ORDER BY ">
	//   44   87:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   45   90:pop             
			else
	//*  46   91:iconst_0        
	//*  47   92:istore          6
	//*  48   94:aload_0         
	//*  49   95:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//*  50   98:aload_1         
	//*  51   99:getfield        #204 <Field SqlHelper$Property SqlHelper$Order.property>
	//*  52  102:getfield        #84  <Field String SqlHelper$Property.columnName>
	//*  53  105:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//*  54  108:ldc1            #148 <String " ">
	//*  55  110:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//*  56  113:aload_1         
	//*  57  114:getfield        #207 <Field SqlHelper$Order$Type SqlHelper$Order.type>
	//*  58  117:invokevirtual   #210 <Method StringBuilder StringBuilder.append(Object)>
	//*  59  120:pop             
	//*  60  121:iload           5
	//*  61  123:iconst_1        
	//*  62  124:iadd            
	//*  63  125:istore          5
	//*  64  127:goto            63
				reusedStringBuilder.append(",");
	//   65  130:aload_0         
	//   66  131:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   67  134:ldc1            #212 <String ",">
	//   68  136:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   69  139:pop             
			flag = false;
			reusedStringBuilder.append(((Order) (s)).property.columnName).append(" ").append(((Object) (((Order) (s)).type)));
			i++;
		}
	//*  70  140:goto            91
		if(integer != null)
	//*  71  143:aload_3         
	//*  72  144:ifnull          161
			reusedStringBuilder.append(" LIMIT ").append(((Object) (integer)));
	//   73  147:aload_0         
	//   74  148:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   75  151:ldc1            #214 <String " LIMIT ">
	//   76  153:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   77  156:aload_3         
	//   78  157:invokevirtual   #210 <Method StringBuilder StringBuilder.append(Object)>
	//   79  160:pop             
		return reusedStringBuilder.toString();
	//   80  161:aload_0         
	//   81  162:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   82  165:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   83  168:areturn         
	}

	public SQLiteStatement getCountStatement()
	{
		if(countStatement == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #220 <Field SQLiteStatement countStatement>
	//*   2    4:ifnonnull       59
			countStatement = db.compileStatement((new StringBuilder()).append("SELECT COUNT(*) FROM ").append(tableName).append(" WHERE ").append(DbOpenHelper.RUNNING_SESSION_ID_COLUMN.columnName).append(" != ?").toString());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #55  <Field SQLiteDatabase db>
	//    6   12:new             #50  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #51  <Method void StringBuilder()>
	//    9   19:ldc1            #222 <String "SELECT COUNT(*) FROM ">
	//   10   21:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:aload_0         
	//   12   25:getfield        #57  <Field String tableName>
	//   13   28:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:ldc1            #75  <String " WHERE ">
	//   15   33:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   16   36:getstatic       #225 <Field SqlHelper$Property DbOpenHelper.RUNNING_SESSION_ID_COLUMN>
	//   17   39:getfield        #84  <Field String SqlHelper$Property.columnName>
	//   18   42:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   19   45:ldc1            #227 <String " != ?">
	//   20   47:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   21   50:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   22   53:invokevirtual   #233 <Method SQLiteStatement SQLiteDatabase.compileStatement(String)>
	//   23   56:putfield        #220 <Field SQLiteStatement countStatement>
		return countStatement;
	//   24   59:aload_0         
	//   25   60:getfield        #220 <Field SQLiteStatement countStatement>
	//   26   63:areturn         
	}

	public SQLiteStatement getDeleteJobTagsStatement()
	{
		if(deleteJobTagsStatement == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #236 <Field SQLiteStatement deleteJobTagsStatement>
	//*   2    4:ifnonnull       59
			deleteJobTagsStatement = db.compileStatement((new StringBuilder()).append("DELETE FROM ").append(tagsTableName).append(" WHERE ").append(DbOpenHelper.TAGS_JOB_ID_COLUMN.columnName).append("= ?").toString());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #55  <Field SQLiteDatabase db>
	//    6   12:new             #50  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #51  <Method void StringBuilder()>
	//    9   19:ldc1            #238 <String "DELETE FROM ">
	//   10   21:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:aload_0         
	//   12   25:getfield        #67  <Field String tagsTableName>
	//   13   28:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:ldc1            #75  <String " WHERE ">
	//   15   33:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   16   36:getstatic       #97  <Field SqlHelper$Property DbOpenHelper.TAGS_JOB_ID_COLUMN>
	//   17   39:getfield        #84  <Field String SqlHelper$Property.columnName>
	//   18   42:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   19   45:ldc1            #240 <String "= ?">
	//   20   47:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   21   50:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   22   53:invokevirtual   #233 <Method SQLiteStatement SQLiteDatabase.compileStatement(String)>
	//   23   56:putfield        #236 <Field SQLiteStatement deleteJobTagsStatement>
		return deleteJobTagsStatement;
	//   24   59:aload_0         
	//   25   60:getfield        #236 <Field SQLiteStatement deleteJobTagsStatement>
	//   26   63:areturn         
	}

	public SQLiteStatement getDeleteStatement()
	{
		if(deleteStatement == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #243 <Field SQLiteStatement deleteStatement>
	//*   2    4:ifnonnull       57
			deleteStatement = db.compileStatement((new StringBuilder()).append("DELETE FROM ").append(tableName).append(" WHERE ").append(primaryKeyColumnName).append(" = ?").toString());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #55  <Field SQLiteDatabase db>
	//    6   12:new             #50  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #51  <Method void StringBuilder()>
	//    9   19:ldc1            #238 <String "DELETE FROM ">
	//   10   21:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:aload_0         
	//   12   25:getfield        #57  <Field String tableName>
	//   13   28:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:ldc1            #75  <String " WHERE ">
	//   15   33:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   16   36:aload_0         
	//   17   37:getfield        #61  <Field String primaryKeyColumnName>
	//   18   40:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   19   43:ldc1            #86  <String " = ?">
	//   20   45:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   21   48:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   22   51:invokevirtual   #233 <Method SQLiteStatement SQLiteDatabase.compileStatement(String)>
	//   23   54:putfield        #243 <Field SQLiteStatement deleteStatement>
		return deleteStatement;
	//   24   57:aload_0         
	//   25   58:getfield        #243 <Field SQLiteStatement deleteStatement>
	//   26   61:areturn         
	}

	public SQLiteStatement getInsertOrReplaceStatement()
	{
		if(insertOrReplaceStatement == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #246 <Field SQLiteStatement insertOrReplaceStatement>
	//*   2    4:ifnonnull       111
		{
			reusedStringBuilder.setLength(0);
	//    3    7:aload_0         
	//    4    8:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #199 <Method void StringBuilder.setLength(int)>
			reusedStringBuilder.append("INSERT OR REPLACE INTO ").append(tableName);
	//    7   15:aload_0         
	//    8   16:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//    9   19:ldc1            #248 <String "INSERT OR REPLACE INTO ">
	//   10   21:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:aload_0         
	//   12   25:getfield        #57  <Field String tableName>
	//   13   28:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:pop             
			reusedStringBuilder.append(" VALUES (");
	//   15   32:aload_0         
	//   16   33:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   17   36:ldc1            #250 <String " VALUES (">
	//   18   38:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   19   41:pop             
			for(int i = 0; i < columnCount; i++)
	//*  20   42:iconst_0        
	//*  21   43:istore_1        
	//*  22   44:iload_1         
	//*  23   45:aload_0         
	//*  24   46:getfield        #59  <Field int columnCount>
	//*  25   49:icmpge          83
			{
				if(i != 0)
	//*  26   52:iload_1         
	//*  27   53:ifeq            66
					reusedStringBuilder.append(",");
	//   28   56:aload_0         
	//   29   57:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   30   60:ldc1            #212 <String ",">
	//   31   62:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   32   65:pop             
				reusedStringBuilder.append("?");
	//   33   66:aload_0         
	//   34   67:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   35   70:ldc1            #137 <String "?">
	//   36   72:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   37   75:pop             
			}

	//   38   76:iload_1         
	//   39   77:iconst_1        
	//   40   78:iadd            
	//   41   79:istore_1        
	//*  42   80:goto            44
			reusedStringBuilder.append(")");
	//   43   83:aload_0         
	//   44   84:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   45   87:ldc1            #252 <String ")">
	//   46   89:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   47   92:pop             
			insertOrReplaceStatement = db.compileStatement(reusedStringBuilder.toString());
	//   48   93:aload_0         
	//   49   94:aload_0         
	//   50   95:getfield        #55  <Field SQLiteDatabase db>
	//   51   98:aload_0         
	//   52   99:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   53  102:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   54  105:invokevirtual   #233 <Method SQLiteStatement SQLiteDatabase.compileStatement(String)>
	//   55  108:putfield        #246 <Field SQLiteStatement insertOrReplaceStatement>
		}
		return insertOrReplaceStatement;
	//   56  111:aload_0         
	//   57  112:getfield        #246 <Field SQLiteStatement insertOrReplaceStatement>
	//   58  115:areturn         
	}

	public SQLiteStatement getInsertStatement()
	{
		if(insertStatement == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #255 <Field SQLiteStatement insertStatement>
	//*   2    4:ifnonnull       112
		{
			reusedStringBuilder.setLength(0);
	//    3    7:aload_0         
	//    4    8:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #199 <Method void StringBuilder.setLength(int)>
			reusedStringBuilder.append("INSERT INTO ").append(tableName);
	//    7   15:aload_0         
	//    8   16:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//    9   19:ldc2            #257 <String "INSERT INTO ">
	//   10   22:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_0         
	//   12   26:getfield        #57  <Field String tableName>
	//   13   29:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   14   32:pop             
			reusedStringBuilder.append(" VALUES (");
	//   15   33:aload_0         
	//   16   34:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   17   37:ldc1            #250 <String " VALUES (">
	//   18   39:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   19   42:pop             
			for(int i = 0; i < columnCount; i++)
	//*  20   43:iconst_0        
	//*  21   44:istore_1        
	//*  22   45:iload_1         
	//*  23   46:aload_0         
	//*  24   47:getfield        #59  <Field int columnCount>
	//*  25   50:icmpge          84
			{
				if(i != 0)
	//*  26   53:iload_1         
	//*  27   54:ifeq            67
					reusedStringBuilder.append(",");
	//   28   57:aload_0         
	//   29   58:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   30   61:ldc1            #212 <String ",">
	//   31   63:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   32   66:pop             
				reusedStringBuilder.append("?");
	//   33   67:aload_0         
	//   34   68:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   35   71:ldc1            #137 <String "?">
	//   36   73:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   37   76:pop             
			}

	//   38   77:iload_1         
	//   39   78:iconst_1        
	//   40   79:iadd            
	//   41   80:istore_1        
	//*  42   81:goto            45
			reusedStringBuilder.append(")");
	//   43   84:aload_0         
	//   44   85:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   45   88:ldc1            #252 <String ")">
	//   46   90:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   47   93:pop             
			insertStatement = db.compileStatement(reusedStringBuilder.toString());
	//   48   94:aload_0         
	//   49   95:aload_0         
	//   50   96:getfield        #55  <Field SQLiteDatabase db>
	//   51   99:aload_0         
	//   52  100:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   53  103:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   54  106:invokevirtual   #233 <Method SQLiteStatement SQLiteDatabase.compileStatement(String)>
	//   55  109:putfield        #255 <Field SQLiteStatement insertStatement>
		}
		return insertStatement;
	//   56  112:aload_0         
	//   57  113:getfield        #255 <Field SQLiteStatement insertStatement>
	//   58  116:areturn         
	}

	public SQLiteStatement getInsertTagsStatement()
	{
		if(insertTagsStatement == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #260 <Field SQLiteStatement insertTagsStatement>
	//*   2    4:ifnonnull       110
		{
			reusedStringBuilder.setLength(0);
	//    3    7:aload_0         
	//    4    8:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #199 <Method void StringBuilder.setLength(int)>
			reusedStringBuilder.append("INSERT INTO ").append("job_holder_tags");
	//    7   15:aload_0         
	//    8   16:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//    9   19:ldc2            #257 <String "INSERT INTO ">
	//   10   22:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:ldc1            #112 <String "job_holder_tags">
	//   12   27:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:pop             
			reusedStringBuilder.append(" VALUES (");
	//   14   31:aload_0         
	//   15   32:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   16   35:ldc1            #250 <String " VALUES (">
	//   17   37:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   18   40:pop             
			for(int i = 0; i < tagsColumnCount; i++)
	//*  19   41:iconst_0        
	//*  20   42:istore_1        
	//*  21   43:iload_1         
	//*  22   44:aload_0         
	//*  23   45:getfield        #65  <Field int tagsColumnCount>
	//*  24   48:icmpge          82
			{
				if(i != 0)
	//*  25   51:iload_1         
	//*  26   52:ifeq            65
					reusedStringBuilder.append(",");
	//   27   55:aload_0         
	//   28   56:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   29   59:ldc1            #212 <String ",">
	//   30   61:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   31   64:pop             
				reusedStringBuilder.append("?");
	//   32   65:aload_0         
	//   33   66:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   34   69:ldc1            #137 <String "?">
	//   35   71:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   36   74:pop             
			}

	//   37   75:iload_1         
	//   38   76:iconst_1        
	//   39   77:iadd            
	//   40   78:istore_1        
	//*  41   79:goto            43
			reusedStringBuilder.append(")");
	//   42   82:aload_0         
	//   43   83:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   44   86:ldc1            #252 <String ")">
	//   45   88:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   46   91:pop             
			insertTagsStatement = db.compileStatement(reusedStringBuilder.toString());
	//   47   92:aload_0         
	//   48   93:aload_0         
	//   49   94:getfield        #55  <Field SQLiteDatabase db>
	//   50   97:aload_0         
	//   51   98:getfield        #53  <Field StringBuilder reusedStringBuilder>
	//   52  101:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   53  104:invokevirtual   #233 <Method SQLiteStatement SQLiteDatabase.compileStatement(String)>
	//   54  107:putfield        #260 <Field SQLiteStatement insertTagsStatement>
		}
		return insertTagsStatement;
	//   55  110:aload_0         
	//   56  111:getfield        #260 <Field SQLiteStatement insertTagsStatement>
	//   57  114:areturn         
	}

	public SQLiteStatement getMarkAsCancelledStatement()
	{
		if(markAsCancelledStatement == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #263 <Field SQLiteStatement markAsCancelledStatement>
	//*   2    4:ifnonnull       80
		{
			String s = (new StringBuilder()).append("UPDATE ").append(tableName).append(" SET ").append(DbOpenHelper.CANCELLED_COLUMN.columnName).append(" = 1 ").append(" WHERE ").append(primaryKeyColumnName).append(" = ? ").toString();
	//    3    7:new             #50  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #51  <Method void StringBuilder()>
	//    6   14:ldc1            #116 <String "UPDATE ">
	//    7   16:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:aload_0         
	//    9   20:getfield        #57  <Field String tableName>
	//   10   23:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:ldc1            #118 <String " SET ">
	//   12   28:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:getstatic       #121 <Field SqlHelper$Property DbOpenHelper.CANCELLED_COLUMN>
	//   14   34:getfield        #84  <Field String SqlHelper$Property.columnName>
	//   15   37:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   16   40:ldc2            #265 <String " = 1 ">
	//   17   43:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   18   46:ldc1            #75  <String " WHERE ">
	//   19   48:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   20   51:aload_0         
	//   21   52:getfield        #61  <Field String primaryKeyColumnName>
	//   22   55:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   23   58:ldc2            #267 <String " = ? ">
	//   24   61:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   25   64:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   26   67:astore_1        
			markAsCancelledStatement = db.compileStatement(s);
	//   27   68:aload_0         
	//   28   69:aload_0         
	//   29   70:getfield        #55  <Field SQLiteDatabase db>
	//   30   73:aload_1         
	//   31   74:invokevirtual   #233 <Method SQLiteStatement SQLiteDatabase.compileStatement(String)>
	//   32   77:putfield        #263 <Field SQLiteStatement markAsCancelledStatement>
		}
		return markAsCancelledStatement;
	//   33   80:aload_0         
	//   34   81:getfield        #263 <Field SQLiteStatement markAsCancelledStatement>
	//   35   84:areturn         
	}

	public SQLiteStatement getOnJobFetchedForRunningStatement()
	{
		if(onJobFetchedForRunningStatement == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #270 <Field SQLiteStatement onJobFetchedForRunningStatement>
	//*   2    4:ifnonnull       95
		{
			String s = (new StringBuilder()).append("UPDATE ").append(tableName).append(" SET ").append(DbOpenHelper.RUN_COUNT_COLUMN.columnName).append(" = ? , ").append(DbOpenHelper.RUNNING_SESSION_ID_COLUMN.columnName).append(" = ? ").append(" WHERE ").append(primaryKeyColumnName).append(" = ? ").toString();
	//    3    7:new             #50  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #51  <Method void StringBuilder()>
	//    6   14:ldc1            #116 <String "UPDATE ">
	//    7   16:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:aload_0         
	//    9   20:getfield        #57  <Field String tableName>
	//   10   23:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:ldc1            #118 <String " SET ">
	//   12   28:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:getstatic       #273 <Field SqlHelper$Property DbOpenHelper.RUN_COUNT_COLUMN>
	//   14   34:getfield        #84  <Field String SqlHelper$Property.columnName>
	//   15   37:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   16   40:ldc2            #275 <String " = ? , ">
	//   17   43:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   18   46:getstatic       #225 <Field SqlHelper$Property DbOpenHelper.RUNNING_SESSION_ID_COLUMN>
	//   19   49:getfield        #84  <Field String SqlHelper$Property.columnName>
	//   20   52:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   21   55:ldc2            #267 <String " = ? ">
	//   22   58:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   23   61:ldc1            #75  <String " WHERE ">
	//   24   63:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   25   66:aload_0         
	//   26   67:getfield        #61  <Field String primaryKeyColumnName>
	//   27   70:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   28   73:ldc2            #267 <String " = ? ">
	//   29   76:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   30   79:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   31   82:astore_1        
			onJobFetchedForRunningStatement = db.compileStatement(s);
	//   32   83:aload_0         
	//   33   84:aload_0         
	//   34   85:getfield        #55  <Field SQLiteDatabase db>
	//   35   88:aload_1         
	//   36   89:invokevirtual   #233 <Method SQLiteStatement SQLiteDatabase.compileStatement(String)>
	//   37   92:putfield        #270 <Field SQLiteStatement onJobFetchedForRunningStatement>
		}
		return onJobFetchedForRunningStatement;
	//   38   95:aload_0         
	//   39   96:getfield        #270 <Field SQLiteStatement onJobFetchedForRunningStatement>
	//   40   99:areturn         
	}

	public void resetDelayTimesTo(long l)
	{
		db.execSQL((new StringBuilder()).append("UPDATE job_holder SET ").append(DbOpenHelper.DELAY_UNTIL_NS_COLUMN.columnName).append("=?").toString(), new Object[] {
			Long.valueOf(l)
		});
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field SQLiteDatabase db>
	//    2    4:new             #50  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #51  <Method void StringBuilder()>
	//    5   11:ldc2            #279 <String "UPDATE job_holder SET ">
	//    6   14:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:getstatic       #282 <Field SqlHelper$Property DbOpenHelper.DELAY_UNTIL_NS_COLUMN>
	//    8   20:getfield        #84  <Field String SqlHelper$Property.columnName>
	//    9   23:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   10   26:ldc2            #284 <String "=?">
	//   11   29:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   12   32:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   13   35:iconst_1        
	//   14   36:anewarray       Object[]
	//   15   39:dup             
	//   16   40:iconst_0        
	//   17   41:lload_1         
	//   18   42:invokestatic    #290 <Method Long Long.valueOf(long)>
	//   19   45:aastore         
	//   20   46:invokevirtual   #293 <Method void SQLiteDatabase.execSQL(String, Object[])>
	//   21   49:return          
	}

	public void truncate()
	{
		db.execSQL("DELETE FROM job_holder");
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field SQLiteDatabase db>
	//    2    4:ldc2            #296 <String "DELETE FROM job_holder">
	//    3    7:invokevirtual   #298 <Method void SQLiteDatabase.execSQL(String)>
		db.execSQL("DELETE FROM job_holder_tags");
	//    4   10:aload_0         
	//    5   11:getfield        #55  <Field SQLiteDatabase db>
	//    6   14:ldc2            #300 <String "DELETE FROM job_holder_tags">
	//    7   17:invokevirtual   #298 <Method void SQLiteDatabase.execSQL(String)>
		vacuum();
	//    8   20:aload_0         
	//    9   21:invokevirtual   #303 <Method void vacuum()>
	//   10   24:return          
	}

	public void vacuum()
	{
		db.execSQL("VACUUM");
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field SQLiteDatabase db>
	//    2    4:ldc2            #305 <String "VACUUM">
	//    3    7:invokevirtual   #298 <Method void SQLiteDatabase.execSQL(String)>
	//    4   10:return          
	}

	String FIND_BY_ID_QUERY;
	String FIND_BY_TAG_QUERY;
	String LOAD_ALL_IDS_QUERY;
	String LOAD_TAGS_QUERY;
	String RE_ENABLE_PENDING_CANCELLATIONS_QUERY;
	final int columnCount;
	private SQLiteStatement countStatement;
	final SQLiteDatabase db;
	private SQLiteStatement deleteJobTagsStatement;
	private SQLiteStatement deleteStatement;
	private SQLiteStatement insertOrReplaceStatement;
	private SQLiteStatement insertStatement;
	private SQLiteStatement insertTagsStatement;
	private SQLiteStatement markAsCancelledStatement;
	private SQLiteStatement onJobFetchedForRunningStatement;
	final String primaryKeyColumnName;
	final StringBuilder reusedStringBuilder = new StringBuilder();
	final long sessionId;
	final String tableName;
	final int tagsColumnCount;
	final String tagsTableName;
}
