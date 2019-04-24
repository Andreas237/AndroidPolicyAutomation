// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import android.content.ContentValues;
import android.database.Cursor;
import com.raizlabs.android.dbflow.config.*;
import com.raizlabs.android.dbflow.converter.DateConverter;
import com.raizlabs.android.dbflow.converter.TypeConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.*;
import com.raizlabs.android.dbflow.sql.language.property.*;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.util.Date;

// Referenced classes of package com.pactforcure.app.survey:
//			Answer

public final class Answer_Table extends ModelAdapter
{

	public Answer_Table(DatabaseHolder databaseholder, DatabaseDefinition databasedefinition)
	{
		super(databasedefinition);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #95  <Method void ModelAdapter(DatabaseDefinition)>
		global_typeConverterDateConverter = (DateConverter)databaseholder.getTypeConverterForClass(java/util/Date);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #97  <Class Date>
	//    6    9:invokevirtual   #103 <Method TypeConverter DatabaseHolder.getTypeConverterForClass(Class)>
	//    7   12:checkcast       #105 <Class DateConverter>
	//    8   15:putfield        #107 <Field DateConverter global_typeConverterDateConverter>
	//    9   18:return          
	}

	public final void bindToContentValues(ContentValues contentvalues, Answer answer)
	{
		contentvalues.put("`id`", Long.valueOf(answer.id));
	//    0    0:aload_1         
	//    1    1:ldc1            #113 <String "`id`">
	//    2    3:aload_2         
	//    3    4:getfield        #116 <Field long Answer.id>
	//    4    7:invokestatic    #122 <Method Long Long.valueOf(long)>
	//    5   10:invokevirtual   #128 <Method void ContentValues.put(String, Long)>
		bindToInsertValues(contentvalues, answer);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:aload_2         
	//    9   16:invokevirtual   #131 <Method void bindToInsertValues(ContentValues, Answer)>
	//   10   19:return          
	}

	public volatile void bindToContentValues(ContentValues contentvalues, Object obj)
	{
		bindToContentValues(contentvalues, (Answer)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #35  <Class Answer>
	//    4    6:invokevirtual   #134 <Method void bindToContentValues(ContentValues, Answer)>
	//    5    9:return          
	}

	public final void bindToInsertStatement(DatabaseStatement databasestatement, Answer answer, int i)
	{
		long l;
		Long long1;
		if(answer.studyId != null)
	//*   0    0:aload_2         
	//*   1    1:getfield        #139 <Field String Answer.studyId>
	//*   2    4:ifnull          163
			databasestatement.bindString(i + 1, answer.studyId);
	//    3    7:aload_1         
	//    4    8:iload_3         
	//    5    9:iconst_1        
	//    6   10:iadd            
	//    7   11:aload_2         
	//    8   12:getfield        #139 <Field String Answer.studyId>
	//    9   15:invokeinterface #145 <Method void DatabaseStatement.bindString(int, String)>
		else
	//*  10   20:aload_2         
	//*  11   21:getfield        #147 <Field String Answer.surveyCode>
	//*  12   24:ifnull          175
	//*  13   27:aload_1         
	//*  14   28:iload_3         
	//*  15   29:iconst_2        
	//*  16   30:iadd            
	//*  17   31:aload_2         
	//*  18   32:getfield        #147 <Field String Answer.surveyCode>
	//*  19   35:invokeinterface #145 <Method void DatabaseStatement.bindString(int, String)>
	//*  20   40:aload_2         
	//*  21   41:getfield        #149 <Field String Answer.questionCode>
	//*  22   44:ifnull          187
	//*  23   47:aload_1         
	//*  24   48:iload_3         
	//*  25   49:iconst_3        
	//*  26   50:iadd            
	//*  27   51:aload_2         
	//*  28   52:getfield        #149 <Field String Answer.questionCode>
	//*  29   55:invokeinterface #145 <Method void DatabaseStatement.bindString(int, String)>
	//*  30   60:aload_2         
	//*  31   61:getfield        #151 <Field String Answer.value>
	//*  32   64:ifnull          199
	//*  33   67:aload_1         
	//*  34   68:iload_3         
	//*  35   69:iconst_4        
	//*  36   70:iadd            
	//*  37   71:aload_2         
	//*  38   72:getfield        #151 <Field String Answer.value>
	//*  39   75:invokeinterface #145 <Method void DatabaseStatement.bindString(int, String)>
	//*  40   80:aload_2         
	//*  41   81:getfield        #153 <Field String Answer.formattedValue>
	//*  42   84:ifnull          211
	//*  43   87:aload_1         
	//*  44   88:iload_3         
	//*  45   89:iconst_5        
	//*  46   90:iadd            
	//*  47   91:aload_2         
	//*  48   92:getfield        #153 <Field String Answer.formattedValue>
	//*  49   95:invokeinterface #145 <Method void DatabaseStatement.bindString(int, String)>
	//*  50  100:aload_2         
	//*  51  101:getfield        #156 <Field Date Answer.dateAdded>
	//*  52  104:ifnull          223
	//*  53  107:aload_0         
	//*  54  108:getfield        #107 <Field DateConverter global_typeConverterDateConverter>
	//*  55  111:aload_2         
	//*  56  112:getfield        #156 <Field Date Answer.dateAdded>
	//*  57  115:invokevirtual   #160 <Method Long DateConverter.getDBValue(Date)>
	//*  58  118:astore          6
	//*  59  120:aload           6
	//*  60  122:ifnull          229
	//*  61  125:aload_1         
	//*  62  126:iload_3         
	//*  63  127:bipush          6
	//*  64  129:iadd            
	//*  65  130:aload           6
	//*  66  132:invokevirtual   #164 <Method long Long.longValue()>
	//*  67  135:invokeinterface #168 <Method void DatabaseStatement.bindLong(int, long)>
	//*  68  140:aload_2         
	//*  69  141:getfield        #171 <Field boolean Answer.isUploaded>
	//*  70  144:ifeq            242
	//*  71  147:lconst_1        
	//*  72  148:lstore          4
	//*  73  150:aload_1         
	//*  74  151:iload_3         
	//*  75  152:bipush          7
	//*  76  154:iadd            
	//*  77  155:lload           4
	//*  78  157:invokeinterface #168 <Method void DatabaseStatement.bindLong(int, long)>
	//*  79  162:return          
			databasestatement.bindNull(i + 1);
	//   80  163:aload_1         
	//   81  164:iload_3         
	//   82  165:iconst_1        
	//   83  166:iadd            
	//   84  167:invokeinterface #175 <Method void DatabaseStatement.bindNull(int)>
		if(answer.surveyCode != null)
			databasestatement.bindString(i + 2, answer.surveyCode);
		else
	//*  85  172:goto            20
			databasestatement.bindNull(i + 2);
	//   86  175:aload_1         
	//   87  176:iload_3         
	//   88  177:iconst_2        
	//   89  178:iadd            
	//   90  179:invokeinterface #175 <Method void DatabaseStatement.bindNull(int)>
		if(answer.questionCode != null)
			databasestatement.bindString(i + 3, answer.questionCode);
		else
	//*  91  184:goto            40
			databasestatement.bindNull(i + 3);
	//   92  187:aload_1         
	//   93  188:iload_3         
	//   94  189:iconst_3        
	//   95  190:iadd            
	//   96  191:invokeinterface #175 <Method void DatabaseStatement.bindNull(int)>
		if(answer.value != null)
			databasestatement.bindString(i + 4, answer.value);
		else
	//*  97  196:goto            60
			databasestatement.bindNull(i + 4);
	//   98  199:aload_1         
	//   99  200:iload_3         
	//  100  201:iconst_4        
	//  101  202:iadd            
	//  102  203:invokeinterface #175 <Method void DatabaseStatement.bindNull(int)>
		if(answer.formattedValue != null)
			databasestatement.bindString(i + 5, answer.formattedValue);
		else
	//* 103  208:goto            80
			databasestatement.bindNull(i + 5);
	//  104  211:aload_1         
	//  105  212:iload_3         
	//  106  213:iconst_5        
	//  107  214:iadd            
	//  108  215:invokeinterface #175 <Method void DatabaseStatement.bindNull(int)>
		if(answer.dateAdded != null)
			long1 = global_typeConverterDateConverter.getDBValue(answer.dateAdded);
		else
	//* 109  220:goto            100
			long1 = null;
	//  110  223:aconst_null     
	//  111  224:astore          6
		if(long1 != null)
			databasestatement.bindLong(i + 6, long1.longValue());
		else
	//* 112  226:goto            120
			databasestatement.bindNull(i + 6);
	//  113  229:aload_1         
	//  114  230:iload_3         
	//  115  231:bipush          6
	//  116  233:iadd            
	//  117  234:invokeinterface #175 <Method void DatabaseStatement.bindNull(int)>
		if(answer.isUploaded)
			l = 1L;
		else
	//* 118  239:goto            140
			l = 0L;
	//  119  242:lconst_0        
	//  120  243:lstore          4
		databasestatement.bindLong(i + 7, l);
	//* 121  245:goto            150
	}

	public volatile void bindToInsertStatement(DatabaseStatement databasestatement, Object obj, int i)
	{
		bindToInsertStatement(databasestatement, (Answer)obj, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #35  <Class Answer>
	//    4    6:iload_3         
	//    5    7:invokevirtual   #178 <Method void bindToInsertStatement(DatabaseStatement, Answer, int)>
	//    6   10:return          
	}

	public final void bindToInsertValues(ContentValues contentvalues, Answer answer)
	{
		int i;
		Object obj;
		if(answer.studyId != null)
	//*   0    0:aload_2         
	//*   1    1:getfield        #139 <Field String Answer.studyId>
	//*   2    4:ifnull          158
			obj = ((Object) (answer.studyId));
	//    3    7:aload_2         
	//    4    8:getfield        #139 <Field String Answer.studyId>
	//    5   11:astore          4
		else
	//*   6   13:aload_1         
	//*   7   14:ldc1            #180 <String "`studyId`">
	//*   8   16:aload           4
	//*   9   18:invokevirtual   #183 <Method void ContentValues.put(String, String)>
	//*  10   21:aload_2         
	//*  11   22:getfield        #147 <Field String Answer.surveyCode>
	//*  12   25:ifnull          164
	//*  13   28:aload_2         
	//*  14   29:getfield        #147 <Field String Answer.surveyCode>
	//*  15   32:astore          4
	//*  16   34:aload_1         
	//*  17   35:ldc1            #185 <String "`surveyCode`">
	//*  18   37:aload           4
	//*  19   39:invokevirtual   #183 <Method void ContentValues.put(String, String)>
	//*  20   42:aload_2         
	//*  21   43:getfield        #149 <Field String Answer.questionCode>
	//*  22   46:ifnull          170
	//*  23   49:aload_2         
	//*  24   50:getfield        #149 <Field String Answer.questionCode>
	//*  25   53:astore          4
	//*  26   55:aload_1         
	//*  27   56:ldc1            #187 <String "`questionCode`">
	//*  28   58:aload           4
	//*  29   60:invokevirtual   #183 <Method void ContentValues.put(String, String)>
	//*  30   63:aload_2         
	//*  31   64:getfield        #151 <Field String Answer.value>
	//*  32   67:ifnull          176
	//*  33   70:aload_2         
	//*  34   71:getfield        #151 <Field String Answer.value>
	//*  35   74:astore          4
	//*  36   76:aload_1         
	//*  37   77:ldc1            #189 <String "`value`">
	//*  38   79:aload           4
	//*  39   81:invokevirtual   #183 <Method void ContentValues.put(String, String)>
	//*  40   84:aload_2         
	//*  41   85:getfield        #153 <Field String Answer.formattedValue>
	//*  42   88:ifnull          182
	//*  43   91:aload_2         
	//*  44   92:getfield        #153 <Field String Answer.formattedValue>
	//*  45   95:astore          4
	//*  46   97:aload_1         
	//*  47   98:ldc1            #191 <String "`formattedValue`">
	//*  48  100:aload           4
	//*  49  102:invokevirtual   #183 <Method void ContentValues.put(String, String)>
	//*  50  105:aload_2         
	//*  51  106:getfield        #156 <Field Date Answer.dateAdded>
	//*  52  109:ifnull          188
	//*  53  112:aload_0         
	//*  54  113:getfield        #107 <Field DateConverter global_typeConverterDateConverter>
	//*  55  116:aload_2         
	//*  56  117:getfield        #156 <Field Date Answer.dateAdded>
	//*  57  120:invokevirtual   #160 <Method Long DateConverter.getDBValue(Date)>
	//*  58  123:astore          4
	//*  59  125:aload           4
	//*  60  127:ifnull          194
	//*  61  130:aload_1         
	//*  62  131:ldc1            #193 <String "`dateAdded`">
	//*  63  133:aload           4
	//*  64  135:invokevirtual   #128 <Method void ContentValues.put(String, Long)>
	//*  65  138:aload_2         
	//*  66  139:getfield        #171 <Field boolean Answer.isUploaded>
	//*  67  142:ifeq            200
	//*  68  145:iconst_1        
	//*  69  146:istore_3        
	//*  70  147:aload_1         
	//*  71  148:ldc1            #195 <String "`isUploaded`">
	//*  72  150:iload_3         
	//*  73  151:invokestatic    #200 <Method Integer Integer.valueOf(int)>
	//*  74  154:invokevirtual   #203 <Method void ContentValues.put(String, Integer)>
	//*  75  157:return          
			obj = null;
	//   76  158:aconst_null     
	//   77  159:astore          4
		contentvalues.put("`studyId`", ((String) (obj)));
		if(answer.surveyCode != null)
			obj = ((Object) (answer.surveyCode));
		else
	//*  78  161:goto            13
			obj = null;
	//   79  164:aconst_null     
	//   80  165:astore          4
		contentvalues.put("`surveyCode`", ((String) (obj)));
		if(answer.questionCode != null)
			obj = ((Object) (answer.questionCode));
		else
	//*  81  167:goto            34
			obj = null;
	//   82  170:aconst_null     
	//   83  171:astore          4
		contentvalues.put("`questionCode`", ((String) (obj)));
		if(answer.value != null)
			obj = ((Object) (answer.value));
		else
	//*  84  173:goto            55
			obj = null;
	//   85  176:aconst_null     
	//   86  177:astore          4
		contentvalues.put("`value`", ((String) (obj)));
		if(answer.formattedValue != null)
			obj = ((Object) (answer.formattedValue));
		else
	//*  87  179:goto            76
			obj = null;
	//   88  182:aconst_null     
	//   89  183:astore          4
		contentvalues.put("`formattedValue`", ((String) (obj)));
		if(answer.dateAdded != null)
			obj = ((Object) (global_typeConverterDateConverter.getDBValue(answer.dateAdded)));
		else
	//*  90  185:goto            97
			obj = null;
	//   91  188:aconst_null     
	//   92  189:astore          4
		if(obj == null)
	//*  93  191:goto            125
			obj = null;
	//   94  194:aconst_null     
	//   95  195:astore          4
		contentvalues.put("`dateAdded`", ((Long) (obj)));
		if(answer.isUploaded)
			i = 1;
		else
	//*  96  197:goto            130
			i = 0;
	//   97  200:iconst_0        
	//   98  201:istore_3        
		contentvalues.put("`isUploaded`", Integer.valueOf(i));
	//*  99  202:goto            147
	}

	public volatile void bindToInsertValues(ContentValues contentvalues, Object obj)
	{
		bindToInsertValues(contentvalues, (Answer)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #35  <Class Answer>
	//    4    6:invokevirtual   #131 <Method void bindToInsertValues(ContentValues, Answer)>
	//    5    9:return          
	}

	public final void bindToStatement(DatabaseStatement databasestatement, Answer answer)
	{
		databasestatement.bindLong(1, answer.id);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:aload_2         
	//    3    3:getfield        #116 <Field long Answer.id>
	//    4    6:invokeinterface #168 <Method void DatabaseStatement.bindLong(int, long)>
		bindToInsertStatement(databasestatement, answer, 1);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #178 <Method void bindToInsertStatement(DatabaseStatement, Answer, int)>
	//   10   18:return          
	}

	public volatile void bindToStatement(DatabaseStatement databasestatement, Object obj)
	{
		bindToStatement(databasestatement, (Answer)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #35  <Class Answer>
	//    4    6:invokevirtual   #208 <Method void bindToStatement(DatabaseStatement, Answer)>
	//    5    9:return          
	}

	public final boolean exists(Answer answer, DatabaseWrapper databasewrapper)
	{
		return answer.id > 0L && SQLite.selectCountOf(new IProperty[0]).from(com/pactforcure/app/survey/Answer).where(new SQLCondition[] {
			getPrimaryConditionClause(answer)
		}).hasData(databasewrapper);
	//    0    0:aload_1         
	//    1    1:getfield        #116 <Field long Answer.id>
	//    2    4:lconst_0        
	//    3    5:lcmp            
	//    4    6:ifle            45
	//    5    9:iconst_0        
	//    6   10:anewarray       IProperty[]
	//    7   13:invokestatic    #216 <Method Select SQLite.selectCountOf(IProperty[])>
	//    8   16:ldc1            #35  <Class Answer>
	//    9   18:invokevirtual   #222 <Method From Select.from(Class)>
	//   10   21:iconst_1        
	//   11   22:anewarray       SQLCondition[]
	//   12   25:dup             
	//   13   26:iconst_0        
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #228 <Method ConditionGroup getPrimaryConditionClause(Answer)>
	//   17   32:aastore         
	//   18   33:invokevirtual   #234 <Method Where From.where(SQLCondition[])>
	//   19   36:aload_2         
	//   20   37:invokevirtual   #240 <Method boolean Where.hasData(DatabaseWrapper)>
	//   21   40:ifeq            45
	//   22   43:iconst_1        
	//   23   44:ireturn         
	//   24   45:iconst_0        
	//   25   46:ireturn         
	}

	public volatile boolean exists(Object obj, DatabaseWrapper databasewrapper)
	{
		return exists((Answer)obj, databasewrapper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class Answer>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #243 <Method boolean exists(Answer, DatabaseWrapper)>
	//    5    9:ireturn         
	}

	public final IProperty[] getAllColumnProperties()
	{
		return ALL_COLUMN_PROPERTIES;
	//    0    0:getstatic       #77  <Field IProperty[] ALL_COLUMN_PROPERTIES>
	//    1    3:areturn         
	}

	public final String getAutoIncrementingColumnName()
	{
		return "id";
	//    0    0:ldc1            #36  <String "id">
	//    1    2:areturn         
	}

	public final Number getAutoIncrementingId(Answer answer)
	{
		return ((Number) (Long.valueOf(answer.id)));
	//    0    0:aload_1         
	//    1    1:getfield        #116 <Field long Answer.id>
	//    2    4:invokestatic    #122 <Method Long Long.valueOf(long)>
	//    3    7:areturn         
	}

	public volatile Number getAutoIncrementingId(Object obj)
	{
		return getAutoIncrementingId((Answer)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class Answer>
	//    3    5:invokevirtual   #252 <Method Number getAutoIncrementingId(Answer)>
	//    4    8:areturn         
	}

	public final String getCompiledStatementQuery()
	{
		return "INSERT INTO `Answer`(`id`,`studyId`,`surveyCode`,`questionCode`,`value`,`formattedValue`,`dateAdded`,`isUploaded`) VALUES (?,?,?,?,?,?,?,?)";
	//    0    0:ldc1            #255 <String "INSERT INTO `Answer`(`id`,`studyId`,`surveyCode`,`questionCode`,`value`,`formattedValue`,`dateAdded`,`isUploaded`) VALUES (?,?,?,?,?,?,?,?)">
	//    1    2:areturn         
	}

	public final String getCreationQuery()
	{
		return "CREATE TABLE IF NOT EXISTS `Answer`(`id` INTEGER PRIMARY KEY AUTOINCREMENT,`studyId` TEXT,`surveyCode` TEXT,`questionCode` TEXT,`value` TEXT,`formattedValue` TEXT,`dateAdded` TEXT,`isUploaded` INTEGER);";
	//    0    0:ldc2            #258 <String "CREATE TABLE IF NOT EXISTS `Answer`(`id` INTEGER PRIMARY KEY AUTOINCREMENT,`studyId` TEXT,`surveyCode` TEXT,`questionCode` TEXT,`value` TEXT,`formattedValue` TEXT,`dateAdded` TEXT,`isUploaded` INTEGER);">
	//    1    3:areturn         
	}

	public final String getInsertStatementQuery()
	{
		return "INSERT INTO `Answer`(`studyId`,`surveyCode`,`questionCode`,`value`,`formattedValue`,`dateAdded`,`isUploaded`) VALUES (?,?,?,?,?,?,?)";
	//    0    0:ldc2            #261 <String "INSERT INTO `Answer`(`studyId`,`surveyCode`,`questionCode`,`value`,`formattedValue`,`dateAdded`,`isUploaded`) VALUES (?,?,?,?,?,?,?)">
	//    1    3:areturn         
	}

	public final Class getModelClass()
	{
		return com/pactforcure/app/survey/Answer;
	//    0    0:ldc1            #35  <Class Answer>
	//    1    2:areturn         
	}

	public final ConditionGroup getPrimaryConditionClause(Answer answer)
	{
		ConditionGroup conditiongroup = ConditionGroup.clause();
	//    0    0:invokestatic    #271 <Method ConditionGroup ConditionGroup.clause()>
	//    1    3:astore_2        
		conditiongroup.and(((SQLCondition) (id.eq(answer.id))));
	//    2    4:aload_2         
	//    3    5:getstatic       #42  <Field LongProperty id>
	//    4    8:aload_1         
	//    5    9:getfield        #116 <Field long Answer.id>
	//    6   12:invokevirtual   #275 <Method com.raizlabs.android.dbflow.sql.language.Condition LongProperty.eq(long)>
	//    7   15:invokevirtual   #279 <Method ConditionGroup ConditionGroup.and(SQLCondition)>
	//    8   18:pop             
		return conditiongroup;
	//    9   19:aload_2         
	//   10   20:areturn         
	}

	public volatile ConditionGroup getPrimaryConditionClause(Object obj)
	{
		return getPrimaryConditionClause((Answer)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class Answer>
	//    3    5:invokevirtual   #228 <Method ConditionGroup getPrimaryConditionClause(Answer)>
	//    4    8:areturn         
	}

	public final BaseProperty getProperty(String s)
	{
		byte byte0;
		s = QueryBuilder.quoteIfNeeded(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #288 <Method String QueryBuilder.quoteIfNeeded(String)>
	//    2    4:astore_1        
		byte0 = -1;
	//    3    5:iconst_m1       
	//    4    6:istore_2        
		s.hashCode();
	//    5    7:aload_1         
	//    6    8:invokevirtual   #294 <Method int String.hashCode()>
		JVM INSTR lookupswitch 8: default 84
	//	               -1522805393: 199
	//	               -707122930: 227
	//	               2964037: 143
	//	               73598073: 171
	//	               159641724: 157
	//	               1497886859: 213
	//	               1924559766: 242
	//	               1949630317: 185;
	//    7   11:lookupswitch    8: default 84
	//	               -1522805393: 199
	//	               -707122930: 227
	//	               2964037: 143
	//	               73598073: 171
	//	               159641724: 157
	//	               1497886859: 213
	//	               1924559766: 242
	//	               1949630317: 185
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
		break; /* Loop/switch isn't completed */
_L8:
		break MISSING_BLOCK_LABEL_242;
_L10:
		switch(byte0)
	//*   8   84:iload_2         
		{
	//*   9   85:tableswitch     0 7: default 132
	//	               0 257
	//	               1 261
	//	               2 265
	//	               3 269
	//	               4 273
	//	               5 277
	//	               6 281
	//	               7 285
		default:
			throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
	//   10  132:new             #296 <Class IllegalArgumentException>
	//   11  135:dup             
	//   12  136:ldc2            #298 <String "Invalid column name passed. Ensure you are calling the correct table's column">
	//   13  139:invokespecial   #301 <Method void IllegalArgumentException(String)>
	//   14  142:athrow          

	//*  15  143:aload_1         
	//*  16  144:ldc1            #113 <String "`id`">
	//*  17  146:invokevirtual   #305 <Method boolean String.equals(Object)>
	//*  18  149:ifeq            84
	//*  19  152:iconst_0        
	//*  20  153:istore_2        
	//*  21  154:goto            84
	//*  22  157:aload_1         
	//*  23  158:ldc1            #180 <String "`studyId`">
	//*  24  160:invokevirtual   #305 <Method boolean String.equals(Object)>
	//*  25  163:ifeq            84
	//*  26  166:iconst_1        
	//*  27  167:istore_2        
	//*  28  168:goto            84
	//*  29  171:aload_1         
	//*  30  172:ldc1            #185 <String "`surveyCode`">
	//*  31  174:invokevirtual   #305 <Method boolean String.equals(Object)>
	//*  32  177:ifeq            84
	//*  33  180:iconst_2        
	//*  34  181:istore_2        
	//*  35  182:goto            84
	//*  36  185:aload_1         
	//*  37  186:ldc1            #187 <String "`questionCode`">
	//*  38  188:invokevirtual   #305 <Method boolean String.equals(Object)>
	//*  39  191:ifeq            84
	//*  40  194:iconst_3        
	//*  41  195:istore_2        
	//*  42  196:goto            84
	//*  43  199:aload_1         
	//*  44  200:ldc1            #189 <String "`value`">
	//*  45  202:invokevirtual   #305 <Method boolean String.equals(Object)>
	//*  46  205:ifeq            84
	//*  47  208:iconst_4        
	//*  48  209:istore_2        
	//*  49  210:goto            84
	//*  50  213:aload_1         
	//*  51  214:ldc1            #191 <String "`formattedValue`">
	//*  52  216:invokevirtual   #305 <Method boolean String.equals(Object)>
	//*  53  219:ifeq            84
	//*  54  222:iconst_5        
	//*  55  223:istore_2        
	//*  56  224:goto            84
	//*  57  227:aload_1         
	//*  58  228:ldc1            #193 <String "`dateAdded`">
	//*  59  230:invokevirtual   #305 <Method boolean String.equals(Object)>
	//*  60  233:ifeq            84
	//*  61  236:bipush          6
	//*  62  238:istore_2        
	//*  63  239:goto            84
	//*  64  242:aload_1         
	//*  65  243:ldc1            #195 <String "`isUploaded`">
	//*  66  245:invokevirtual   #305 <Method boolean String.equals(Object)>
	//*  67  248:ifeq            84
	//*  68  251:bipush          7
	//*  69  253:istore_2        
	//*  70  254:goto            84
		case 0: // '\0'
			return ((BaseProperty) (id));
	//   71  257:getstatic       #42  <Field LongProperty id>
	//   72  260:areturn         

		case 1: // '\001'
			return ((BaseProperty) (studyId));
	//   73  261:getstatic       #48  <Field Property studyId>
	//   74  264:areturn         

		case 2: // '\002'
			return ((BaseProperty) (surveyCode));
	//   75  265:getstatic       #51  <Field Property surveyCode>
	//   76  268:areturn         

		case 3: // '\003'
			return ((BaseProperty) (questionCode));
	//   77  269:getstatic       #54  <Field Property questionCode>
	//   78  272:areturn         

		case 4: // '\004'
			return ((BaseProperty) (value));
	//   79  273:getstatic       #57  <Field Property value>
	//   80  276:areturn         

		case 5: // '\005'
			return ((BaseProperty) (formattedValue));
	//   81  277:getstatic       #60  <Field Property formattedValue>
	//   82  280:areturn         

		case 6: // '\006'
			return ((BaseProperty) (dateAdded));
	//   83  281:getstatic       #70  <Field TypeConvertedProperty dateAdded>
	//   84  284:areturn         

		case 7: // '\007'
			return ((BaseProperty) (isUploaded));
	//   85  285:getstatic       #73  <Field Property isUploaded>
	//   86  288:areturn         
		}
_L4:
		if(s.equals("`id`"))
			byte0 = 0;
		  goto _L10
_L6:
		if(s.equals("`studyId`"))
			byte0 = 1;
		  goto _L10
_L5:
		if(s.equals("`surveyCode`"))
			byte0 = 2;
		  goto _L10
_L9:
		if(s.equals("`questionCode`"))
			byte0 = 3;
		  goto _L10
_L2:
		if(s.equals("`value`"))
			byte0 = 4;
		  goto _L10
_L7:
		if(s.equals("`formattedValue`"))
			byte0 = 5;
		  goto _L10
_L3:
		if(s.equals("`dateAdded`"))
			byte0 = 6;
		  goto _L10
		if(s.equals("`isUploaded`"))
			byte0 = 7;
		  goto _L10
	}

	public final String getTableName()
	{
		return "`Answer`";
	//    0    0:ldc2            #308 <String "`Answer`">
	//    1    3:areturn         
	}

	public final void loadFromCursor(Cursor cursor, Answer answer)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		if(!cursor.isNull(0))
	//*   2    2:aload_1         
	//*   3    3:iconst_0        
	//*   4    4:invokeinterface #316 <Method boolean Cursor.isNull(int)>
	//*   5    9:ifne            23
			answer.id = cursor.getLong(0);
	//    6   12:aload_2         
	//    7   13:aload_1         
	//    8   14:iconst_0        
	//    9   15:invokeinterface #320 <Method long Cursor.getLong(int)>
	//   10   20:putfield        #116 <Field long Answer.id>
		if(!cursor.isNull(1))
	//*  11   23:aload_1         
	//*  12   24:iconst_1        
	//*  13   25:invokeinterface #316 <Method boolean Cursor.isNull(int)>
	//*  14   30:ifne            44
			answer.studyId = cursor.getString(1);
	//   15   33:aload_2         
	//   16   34:aload_1         
	//   17   35:iconst_1        
	//   18   36:invokeinterface #324 <Method String Cursor.getString(int)>
	//   19   41:putfield        #139 <Field String Answer.studyId>
		if(!cursor.isNull(2))
	//*  20   44:aload_1         
	//*  21   45:iconst_2        
	//*  22   46:invokeinterface #316 <Method boolean Cursor.isNull(int)>
	//*  23   51:ifne            65
			answer.surveyCode = cursor.getString(2);
	//   24   54:aload_2         
	//   25   55:aload_1         
	//   26   56:iconst_2        
	//   27   57:invokeinterface #324 <Method String Cursor.getString(int)>
	//   28   62:putfield        #147 <Field String Answer.surveyCode>
		if(!cursor.isNull(3))
	//*  29   65:aload_1         
	//*  30   66:iconst_3        
	//*  31   67:invokeinterface #316 <Method boolean Cursor.isNull(int)>
	//*  32   72:ifne            86
			answer.questionCode = cursor.getString(3);
	//   33   75:aload_2         
	//   34   76:aload_1         
	//   35   77:iconst_3        
	//   36   78:invokeinterface #324 <Method String Cursor.getString(int)>
	//   37   83:putfield        #149 <Field String Answer.questionCode>
		if(!cursor.isNull(4))
	//*  38   86:aload_1         
	//*  39   87:iconst_4        
	//*  40   88:invokeinterface #316 <Method boolean Cursor.isNull(int)>
	//*  41   93:ifne            107
			answer.value = cursor.getString(4);
	//   42   96:aload_2         
	//   43   97:aload_1         
	//   44   98:iconst_4        
	//   45   99:invokeinterface #324 <Method String Cursor.getString(int)>
	//   46  104:putfield        #151 <Field String Answer.value>
		if(!cursor.isNull(5))
	//*  47  107:aload_1         
	//*  48  108:iconst_5        
	//*  49  109:invokeinterface #316 <Method boolean Cursor.isNull(int)>
	//*  50  114:ifne            128
			answer.formattedValue = cursor.getString(5);
	//   51  117:aload_2         
	//   52  118:aload_1         
	//   53  119:iconst_5        
	//   54  120:invokeinterface #324 <Method String Cursor.getString(int)>
	//   55  125:putfield        #153 <Field String Answer.formattedValue>
		if(!cursor.isNull(6))
	//*  56  128:aload_1         
	//*  57  129:bipush          6
	//*  58  131:invokeinterface #316 <Method boolean Cursor.isNull(int)>
	//*  59  136:ifne            161
			answer.dateAdded = global_typeConverterDateConverter.getModelValue(Long.valueOf(cursor.getLong(6)));
	//   60  139:aload_2         
	//   61  140:aload_0         
	//   62  141:getfield        #107 <Field DateConverter global_typeConverterDateConverter>
	//   63  144:aload_1         
	//   64  145:bipush          6
	//   65  147:invokeinterface #320 <Method long Cursor.getLong(int)>
	//   66  152:invokestatic    #122 <Method Long Long.valueOf(long)>
	//   67  155:invokevirtual   #328 <Method Date DateConverter.getModelValue(Long)>
	//   68  158:putfield        #156 <Field Date Answer.dateAdded>
		if(!cursor.isNull(7))
	//*  69  161:aload_1         
	//*  70  162:bipush          7
	//*  71  164:invokeinterface #316 <Method boolean Cursor.isNull(int)>
	//*  72  169:ifne            189
		{
			if(cursor.getInt(7) != 1)
	//*  73  172:aload_1         
	//*  74  173:bipush          7
	//*  75  175:invokeinterface #332 <Method int Cursor.getInt(int)>
	//*  76  180:iconst_1        
	//*  77  181:icmpne          190
	//*  78  184:aload_2         
	//*  79  185:iload_3         
	//*  80  186:putfield        #171 <Field boolean Answer.isUploaded>
	//*  81  189:return          
				flag = false;
	//   82  190:iconst_0        
	//   83  191:istore_3        
			answer.isUploaded = flag;
		}
	//*  84  192:goto            184
	}

	public volatile void loadFromCursor(Cursor cursor, Object obj)
	{
		loadFromCursor(cursor, (Answer)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #35  <Class Answer>
	//    4    6:invokevirtual   #335 <Method void loadFromCursor(Cursor, Answer)>
	//    5    9:return          
	}

	public final Answer newInstance()
	{
		return new Answer();
	//    0    0:new             #35  <Class Answer>
	//    1    3:dup             
	//    2    4:invokespecial   #338 <Method void Answer()>
	//    3    7:areturn         
	}

	public volatile Object newInstance()
	{
		return ((Object) (newInstance()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #341 <Method Answer newInstance()>
	//    2    4:areturn         
	}

	public final void updateAutoIncrement(Answer answer, Number number)
	{
		answer.id = number.longValue();
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #346 <Method long Number.longValue()>
	//    3    5:putfield        #116 <Field long Answer.id>
	//    4    8:return          
	}

	public volatile void updateAutoIncrement(Object obj, Number number)
	{
		updateAutoIncrement((Answer)obj, number);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class Answer>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #349 <Method void updateAutoIncrement(Answer, Number)>
	//    5    9:return          
	}

	public static final IProperty ALL_COLUMN_PROPERTIES[];
	public static final TypeConvertedProperty dateAdded;
	public static final Property formattedValue;
	public static final LongProperty id;
	public static final IndexProperty index_getLatestIndex;
	public static final IndexProperty index_surveyIndex;
	public static final Property isUploaded;
	public static final Property questionCode;
	public static final Property studyId;
	public static final Property surveyCode;
	public static final Property value;
	private final DateConverter global_typeConverterDateConverter;

	static 
	{
		id = new LongProperty(com/pactforcure/app/survey/Answer, "id");
	//    0    0:new             #33  <Class LongProperty>
	//    1    3:dup             
	//    2    4:ldc1            #35  <Class Answer>
	//    3    6:ldc1            #36  <String "id">
	//    4    8:invokespecial   #40  <Method void LongProperty(Class, String)>
	//    5   11:putstatic       #42  <Field LongProperty id>
		studyId = new Property(com/pactforcure/app/survey/Answer, "studyId");
	//    6   14:new             #44  <Class Property>
	//    7   17:dup             
	//    8   18:ldc1            #35  <Class Answer>
	//    9   20:ldc1            #45  <String "studyId">
	//   10   22:invokespecial   #46  <Method void Property(Class, String)>
	//   11   25:putstatic       #48  <Field Property studyId>
		surveyCode = new Property(com/pactforcure/app/survey/Answer, "surveyCode");
	//   12   28:new             #44  <Class Property>
	//   13   31:dup             
	//   14   32:ldc1            #35  <Class Answer>
	//   15   34:ldc1            #49  <String "surveyCode">
	//   16   36:invokespecial   #46  <Method void Property(Class, String)>
	//   17   39:putstatic       #51  <Field Property surveyCode>
		questionCode = new Property(com/pactforcure/app/survey/Answer, "questionCode");
	//   18   42:new             #44  <Class Property>
	//   19   45:dup             
	//   20   46:ldc1            #35  <Class Answer>
	//   21   48:ldc1            #52  <String "questionCode">
	//   22   50:invokespecial   #46  <Method void Property(Class, String)>
	//   23   53:putstatic       #54  <Field Property questionCode>
		value = new Property(com/pactforcure/app/survey/Answer, "value");
	//   24   56:new             #44  <Class Property>
	//   25   59:dup             
	//   26   60:ldc1            #35  <Class Answer>
	//   27   62:ldc1            #55  <String "value">
	//   28   64:invokespecial   #46  <Method void Property(Class, String)>
	//   29   67:putstatic       #57  <Field Property value>
		formattedValue = new Property(com/pactforcure/app/survey/Answer, "formattedValue");
	//   30   70:new             #44  <Class Property>
	//   31   73:dup             
	//   32   74:ldc1            #35  <Class Answer>
	//   33   76:ldc1            #58  <String "formattedValue">
	//   34   78:invokespecial   #46  <Method void Property(Class, String)>
	//   35   81:putstatic       #60  <Field Property formattedValue>
		dateAdded = new TypeConvertedProperty(com/pactforcure/app/survey/Answer, "dateAdded", true, new com.raizlabs.android.dbflow.sql.language.property.TypeConvertedProperty.TypeConverterGetter() {

			public TypeConverter getTypeConverter(Class class1)
			{
				return ((TypeConverter) (((Answer_Table)FlowManager.getInstanceAdapter(class1)).global_typeConverterDateConverter));
			//    0    0:aload_1         
			//    1    1:invokestatic    #21  <Method com.raizlabs.android.dbflow.structure.InstanceAdapter FlowManager.getInstanceAdapter(Class)>
			//    2    4:checkcast       #8   <Class Answer_Table>
			//    3    7:invokestatic    #25  <Method DateConverter Answer_Table.access$000(Answer_Table)>
			//    4   10:areturn         
			}

		}
);
	//   36   84:new             #62  <Class TypeConvertedProperty>
	//   37   87:dup             
	//   38   88:ldc1            #35  <Class Answer>
	//   39   90:ldc1            #63  <String "dateAdded">
	//   40   92:iconst_1        
	//   41   93:new             #7   <Class Answer_Table$1>
	//   42   96:dup             
	//   43   97:invokespecial   #65  <Method void Answer_Table$1()>
	//   44  100:invokespecial   #68  <Method void TypeConvertedProperty(Class, String, boolean, com.raizlabs.android.dbflow.sql.language.property.TypeConvertedProperty$TypeConverterGetter)>
	//   45  103:putstatic       #70  <Field TypeConvertedProperty dateAdded>
		isUploaded = new Property(com/pactforcure/app/survey/Answer, "isUploaded");
	//   46  106:new             #44  <Class Property>
	//   47  109:dup             
	//   48  110:ldc1            #35  <Class Answer>
	//   49  112:ldc1            #71  <String "isUploaded">
	//   50  114:invokespecial   #46  <Method void Property(Class, String)>
	//   51  117:putstatic       #73  <Field Property isUploaded>
		ALL_COLUMN_PROPERTIES = (new IProperty[] {
			id, studyId, surveyCode, questionCode, value, formattedValue, dateAdded, isUploaded
		});
	//   52  120:bipush          8
	//   53  122:anewarray       IProperty[]
	//   54  125:dup             
	//   55  126:iconst_0        
	//   56  127:getstatic       #42  <Field LongProperty id>
	//   57  130:aastore         
	//   58  131:dup             
	//   59  132:iconst_1        
	//   60  133:getstatic       #48  <Field Property studyId>
	//   61  136:aastore         
	//   62  137:dup             
	//   63  138:iconst_2        
	//   64  139:getstatic       #51  <Field Property surveyCode>
	//   65  142:aastore         
	//   66  143:dup             
	//   67  144:iconst_3        
	//   68  145:getstatic       #54  <Field Property questionCode>
	//   69  148:aastore         
	//   70  149:dup             
	//   71  150:iconst_4        
	//   72  151:getstatic       #57  <Field Property value>
	//   73  154:aastore         
	//   74  155:dup             
	//   75  156:iconst_5        
	//   76  157:getstatic       #60  <Field Property formattedValue>
	//   77  160:aastore         
	//   78  161:dup             
	//   79  162:bipush          6
	//   80  164:getstatic       #70  <Field TypeConvertedProperty dateAdded>
	//   81  167:aastore         
	//   82  168:dup             
	//   83  169:bipush          7
	//   84  171:getstatic       #73  <Field Property isUploaded>
	//   85  174:aastore         
	//   86  175:putstatic       #77  <Field IProperty[] ALL_COLUMN_PROPERTIES>
		index_surveyIndex = new IndexProperty("surveyIndex", false, com/pactforcure/app/survey/Answer, new IProperty[] {
			studyId, surveyCode
		});
	//   87  178:new             #79  <Class IndexProperty>
	//   88  181:dup             
	//   89  182:ldc1            #81  <String "surveyIndex">
	//   90  184:iconst_0        
	//   91  185:ldc1            #35  <Class Answer>
	//   92  187:iconst_2        
	//   93  188:anewarray       IProperty[]
	//   94  191:dup             
	//   95  192:iconst_0        
	//   96  193:getstatic       #48  <Field Property studyId>
	//   97  196:aastore         
	//   98  197:dup             
	//   99  198:iconst_1        
	//  100  199:getstatic       #51  <Field Property surveyCode>
	//  101  202:aastore         
	//  102  203:invokespecial   #84  <Method void IndexProperty(String, boolean, Class, IProperty[])>
	//  103  206:putstatic       #86  <Field IndexProperty index_surveyIndex>
		index_getLatestIndex = new IndexProperty("getLatestIndex", false, com/pactforcure/app/survey/Answer, new IProperty[] {
			dateAdded
		});
	//  104  209:new             #79  <Class IndexProperty>
	//  105  212:dup             
	//  106  213:ldc1            #88  <String "getLatestIndex">
	//  107  215:iconst_0        
	//  108  216:ldc1            #35  <Class Answer>
	//  109  218:iconst_1        
	//  110  219:anewarray       IProperty[]
	//  111  222:dup             
	//  112  223:iconst_0        
	//  113  224:getstatic       #70  <Field TypeConvertedProperty dateAdded>
	//  114  227:aastore         
	//  115  228:invokespecial   #84  <Method void IndexProperty(String, boolean, Class, IProperty[])>
	//  116  231:putstatic       #90  <Field IndexProperty index_getLatestIndex>
	//* 117  234:return          
	}


/*
	static DateConverter access$000(Answer_Table answer_table)
	{
		return answer_table.global_typeConverterDateConverter;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field DateConverter global_typeConverterDateConverter>
	//    2    4:areturn         
	}

*/
}
