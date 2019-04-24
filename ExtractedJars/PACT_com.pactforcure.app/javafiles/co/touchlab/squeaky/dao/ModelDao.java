// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import co.touchlab.squeaky.db.SQLiteDatabase;
import co.touchlab.squeaky.db.SQLiteStatement;
import co.touchlab.squeaky.field.FieldType;
import co.touchlab.squeaky.field.ForeignCollectionInfo;
import co.touchlab.squeaky.sql.SqlHelper;
import co.touchlab.squeaky.table.*;
import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package co.touchlab.squeaky.dao:
//			Dao, DaoHelper, SqueakyContext, Query, 
//			SelectIterator, CloseableIterator

public class ModelDao
	implements Dao
{
	class QueryModifiersImpl
		implements Dao.QueryModifiers
	{

		public Dao.QueryModifiers foreignRefreshMap(Dao.ForeignRefresh aforeignrefresh[])
		{
			foreignRefreshMap = aforeignrefresh;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #40  <Field Dao$ForeignRefresh[] foreignRefreshMap>
			return ((Dao.QueryModifiers) (this));
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Dao.QueryModifiers limit(Integer integer)
		{
			limit = integer;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #45  <Field Integer limit>
			return ((Dao.QueryModifiers) (this));
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public List list()
			throws SQLException
		{
			ModelDao modeldao = ModelDao.this;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field ModelDao this$0>
		//    2    4:astore_2        
			String s = from;
		//    3    5:aload_0         
		//    4    6:getfield        #32  <Field String from>
		//    5    9:astore_3        
			String s1 = where;
		//    6   10:aload_0         
		//    7   11:getfield        #34  <Field String where>
		//    8   14:astore          4
			String as[] = args;
		//    9   16:aload_0         
		//   10   17:getfield        #36  <Field String[] args>
		//   11   20:astore          5
			String s2 = orderBy;
		//   12   22:aload_0         
		//   13   23:getfield        #52  <Field String orderBy>
		//   14   26:astore          6
			Integer integer = limit;
		//   15   28:aload_0         
		//   16   29:getfield        #45  <Field Integer limit>
		//   17   32:astore          7
			Integer integer1 = offset;
		//   18   34:aload_0         
		//   19   35:getfield        #54  <Field Integer offset>
		//   20   38:astore          8
			Dao.ForeignRefresh aforeignrefresh[];
			if(foreignRefreshMap == null)
		//*  21   40:aload_0         
		//*  22   41:getfield        #40  <Field Dao$ForeignRefresh[] foreignRefreshMap>
		//*  23   44:ifnonnull       72
				aforeignrefresh = generateDefaultForeignRefreshMap();
		//   24   47:aload_0         
		//   25   48:getfield        #27  <Field ModelDao this$0>
		//   26   51:invokestatic    #58  <Method Dao$ForeignRefresh[] ModelDao.access$300(ModelDao)>
		//   27   54:astore_1        
			else
		//*  28   55:aload_2         
		//*  29   56:aload_3         
		//*  30   57:aload           4
		//*  31   59:aload           5
		//*  32   61:aload           6
		//*  33   63:aload           7
		//*  34   65:aload           8
		//*  35   67:aload_1         
		//*  36   68:invokestatic    #62  <Method List ModelDao.access$400(ModelDao, String, String, String[], String, Integer, Integer, Dao$ForeignRefresh[])>
		//*  37   71:areturn         
				aforeignrefresh = foreignRefreshMap;
		//   38   72:aload_0         
		//   39   73:getfield        #40  <Field Dao$ForeignRefresh[] foreignRefreshMap>
		//   40   76:astore_1        
			return modeldao.makeCursorResults(s, s1, as, s2, integer, integer1, aforeignrefresh);
		//*  41   77:goto            55
		}

		public Dao.QueryModifiers offset(Integer integer)
		{
			offset = integer;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #54  <Field Integer offset>
			return ((Dao.QueryModifiers) (this));
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Dao.QueryModifiers orderBy(String s)
		{
			orderBy = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #52  <Field String orderBy>
			return ((Dao.QueryModifiers) (this));
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private final String args[];
		private Dao.ForeignRefresh foreignRefreshMap[];
		private final String from;
		private Integer limit;
		private Integer offset;
		private String orderBy;
		final ModelDao this$0;
		private final String where;

		public QueryModifiersImpl(String s, String s1, String as[])
		{
			this$0 = ModelDao.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #27  <Field ModelDao this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #30  <Method void Object()>
			from = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #32  <Field String from>
			where = s1;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #34  <Field String where>
			args = as;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #36  <Field String[] args>
		//   14   25:return          
		}
	}


	protected ModelDao(SqueakyContext squeakycontext, Class class1, GeneratedTableMapper generatedtablemapper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
		daoObserverSet = Collections.newSetFromMap(((Map) (new ConcurrentHashMap())));
	//    2    4:aload_0         
	//    3    5:new             #56  <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #57  <Method void ConcurrentHashMap()>
	//    6   12:invokestatic    #63  <Method Set Collections.newSetFromMap(Map)>
	//    7   15:putfield        #65  <Field Set daoObserverSet>
		statementList = Collections.synchronizedList(((List) (new ArrayList())));
	//    8   18:aload_0         
	//    9   19:new             #67  <Class ArrayList>
	//   10   22:dup             
	//   11   23:invokespecial   #68  <Method void ArrayList()>
	//   12   26:invokestatic    #72  <Method List Collections.synchronizedList(List)>
	//   13   29:putfield        #74  <Field List statementList>
		createStatement = ((ThreadLocal) (new ThreadLocal() {

			protected SQLiteStatement initialValue()
			{
				SQLiteStatement sqlitestatement = makeCreateStatement();
			//    0    0:aload_0         
			//    1    1:getfield        #13  <Field ModelDao this$0>
			//    2    4:invokestatic    #23  <Method SQLiteStatement ModelDao.access$000(ModelDao)>
			//    3    7:astore_1        
				statementList.add(((Object) (sqlitestatement)));
			//    4    8:aload_0         
			//    5    9:getfield        #13  <Field ModelDao this$0>
			//    6   12:invokestatic    #27  <Method List ModelDao.access$100(ModelDao)>
			//    7   15:aload_1         
			//    8   16:invokeinterface #33  <Method boolean List.add(Object)>
			//    9   21:pop             
				return sqlitestatement;
			//   10   22:aload_1         
			//   11   23:areturn         
			}

			protected volatile Object initialValue()
			{
				return ((Object) (initialValue()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #36  <Method SQLiteStatement initialValue()>
			//    2    4:areturn         
			}

			final ModelDao this$0;

			
			{
				this$0 = ModelDao.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #13  <Field ModelDao this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #16  <Method void ThreadLocal()>
			//    5    9:return          
			}
		}
));
	//   14   32:aload_0         
	//   15   33:new             #9   <Class ModelDao$1>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:invokespecial   #77  <Method void ModelDao$1(ModelDao)>
	//   19   41:putfield        #79  <Field ThreadLocal createStatement>
		updateStatement = ((ThreadLocal) (new ThreadLocal() {

			protected SQLiteStatement initialValue()
			{
				SQLiteStatement sqlitestatement = makeUpdateStatement();
			//    0    0:aload_0         
			//    1    1:getfield        #13  <Field ModelDao this$0>
			//    2    4:invokestatic    #23  <Method SQLiteStatement ModelDao.access$200(ModelDao)>
			//    3    7:astore_1        
				statementList.add(((Object) (sqlitestatement)));
			//    4    8:aload_0         
			//    5    9:getfield        #13  <Field ModelDao this$0>
			//    6   12:invokestatic    #27  <Method List ModelDao.access$100(ModelDao)>
			//    7   15:aload_1         
			//    8   16:invokeinterface #33  <Method boolean List.add(Object)>
			//    9   21:pop             
				return sqlitestatement;
			//   10   22:aload_1         
			//   11   23:areturn         
			}

			protected volatile Object initialValue()
			{
				return ((Object) (initialValue()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #36  <Method SQLiteStatement initialValue()>
			//    2    4:areturn         
			}

			final ModelDao this$0;

			
			{
				this$0 = ModelDao.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #13  <Field ModelDao this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #16  <Method void ThreadLocal()>
			//    5    9:return          
			}
		}
));
	//   20   44:aload_0         
	//   21   45:new             #11  <Class ModelDao$2>
	//   22   48:dup             
	//   23   49:aload_0         
	//   24   50:invokespecial   #80  <Method void ModelDao$2(ModelDao)>
	//   25   53:putfield        #82  <Field ThreadLocal updateStatement>
		squeakyContext = squeakycontext;
	//   26   56:aload_0         
	//   27   57:aload_1         
	//   28   58:putfield        #84  <Field SqueakyContext squeakyContext>
		entityClass = class1;
	//   29   61:aload_0         
	//   30   62:aload_2         
	//   31   63:putfield        #86  <Field Class entityClass>
		int i;
		int j;
		try
		{
			generatedTableMapper = generatedtablemapper;
	//   32   66:aload_0         
	//   33   67:aload_3         
	//   34   68:putfield        #88  <Field GeneratedTableMapper generatedTableMapper>
		}
	//*  35   71:aconst_null     
	//*  36   72:astore_2        
	//*  37   73:aload_3         
	//*  38   74:invokeinterface #94  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//*  39   79:invokevirtual   #100 <Method FieldType[] TableInfo.getFieldTypes()>
	//*  40   82:astore_3        
	//*  41   83:aload_3         
	//*  42   84:arraylength     
	//*  43   85:istore          5
	//*  44   87:iconst_0        
	//*  45   88:istore          4
	//*  46   90:aload_2         
	//*  47   91:astore_1        
	//*  48   92:iload           4
	//*  49   94:iload           5
	//*  50   96:icmpge          121
	//*  51   99:aload_3         
	//*  52  100:iload           4
	//*  53  102:aaload          
	//*  54  103:astore_1        
	//*  55  104:aload_1         
	//*  56  105:invokevirtual   #106 <Method boolean FieldType.isId()>
	//*  57  108:ifne            154
	//*  58  111:aload_1         
	//*  59  112:invokevirtual   #109 <Method boolean FieldType.isGeneratedId()>
	//*  60  115:ifeq            135
	//*  61  118:goto            154
	//*  62  121:aload_0         
	//*  63  122:aload_1         
	//*  64  123:putfield        #111 <Field FieldType idFieldType>
	//*  65  126:aload_0         
	//*  66  127:aload_0         
	//*  67  128:invokespecial   #115 <Method String[] buildSelect()>
	//*  68  131:putfield        #117 <Field String[] tableCols>
	//*  69  134:return          
	//*  70  135:iload           4
	//*  71  137:iconst_1        
	//*  72  138:iadd            
	//*  73  139:istore          4
	//*  74  141:goto            90
		// Misplaced declaration of an exception variable
		catch(SqueakyContext squeakycontext)
	//*  75  144:astore_1        
		{
			throw new RuntimeException(((Throwable) (squeakycontext)));
	//   76  145:new             #119 <Class RuntimeException>
	//   77  148:dup             
	//   78  149:aload_1         
	//   79  150:invokespecial   #122 <Method void RuntimeException(Throwable)>
	//   80  153:athrow          
		}
		class1 = null;
		generatedtablemapper = ((GeneratedTableMapper) (generatedtablemapper.getTableConfig().getFieldTypes()));
		j = generatedtablemapper.length;
		i = 0;
_L2:
		squeakycontext = ((SqueakyContext) (class1));
		if(i >= j)
			break MISSING_BLOCK_LABEL_121;
		squeakycontext = ((SqueakyContext) (generatedtablemapper[i]));
		if(!((FieldType) (squeakycontext)).isId() && !((FieldType) (squeakycontext)).isGeneratedId())
			break MISSING_BLOCK_LABEL_135;
		idFieldType = ((FieldType) (squeakycontext));
		tableCols = buildSelect();
		return;
		i++;
		if(true) goto _L2; else goto _L1
_L1:
	//*  81  154:goto            121
	}

	private String[] buildSelect()
		throws SQLException
	{
		FieldType afieldtype[] = generatedTableMapper.getTableConfig().getFieldTypes();
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//    2    4:invokeinterface #94  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//    3    9:invokevirtual   #100 <Method FieldType[] TableInfo.getFieldTypes()>
	//    4   12:astore_2        
		String as[] = new String[afieldtype.length];
	//    5   13:aload_2         
	//    6   14:arraylength     
	//    7   15:anewarray       String[]
	//    8   18:astore_3        
		for(int i = 0; i < afieldtype.length; i++)
	//*   9   19:iconst_0        
	//*  10   20:istore_1        
	//*  11   21:iload_1         
	//*  12   22:aload_2         
	//*  13   23:arraylength     
	//*  14   24:icmpge          61
			as[i] = (new StringBuilder()).append("t.").append(afieldtype[i].getColumnName()).toString();
	//   15   27:aload_3         
	//   16   28:iload_1         
	//   17   29:new             #158 <Class StringBuilder>
	//   18   32:dup             
	//   19   33:invokespecial   #159 <Method void StringBuilder()>
	//   20   36:ldc1            #161 <String "t.">
	//   21   38:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   22   41:aload_2         
	//   23   42:iload_1         
	//   24   43:aaload          
	//   25   44:invokevirtual   #169 <Method String FieldType.getColumnName()>
	//   26   47:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   27   50:invokevirtual   #172 <Method String StringBuilder.toString()>
	//   28   53:aastore         

	//   29   54:iload_1         
	//   30   55:iconst_1        
	//   31   56:iadd            
	//   32   57:istore_1        
	//*  33   58:goto            21
		return as;
	//   34   61:aload_3         
	//   35   62:areturn         
	}

	private String createDefaultFrom()
		throws SQLException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #158 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #159 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(generatedTableMapper.getTableConfig().getTableName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//    7   13:invokeinterface #94  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//    8   18:invokevirtual   #176 <Method String TableInfo.getTableName()>
	//    9   21:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:pop             
		stringbuilder.append(' ');
	//   11   25:aload_1         
	//   12   26:bipush          32
	//   13   28:invokevirtual   #179 <Method StringBuilder StringBuilder.append(char)>
	//   14   31:pop             
		stringbuilder.append("t");
	//   15   32:aload_1         
	//   16   33:ldc1            #22  <String "t">
	//   17   35:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
		return stringbuilder.toString();
	//   19   39:aload_1         
	//   20   40:invokevirtual   #172 <Method String StringBuilder.toString()>
	//   21   43:areturn         
	}

	private void fillContentVal(ContentValues contentvalues, FieldType fieldtype, Object obj)
	{
		if(obj instanceof String)
	//*   0    0:aload_3         
	//*   1    1:instanceof      #156 <Class String>
	//*   2    4:ifeq            20
		{
			contentvalues.put(fieldtype.getColumnName(), (String)obj);
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #169 <Method String FieldType.getColumnName()>
	//    6   12:aload_3         
	//    7   13:checkcast       #156 <Class String>
	//    8   16:invokevirtual   #187 <Method void ContentValues.put(String, String)>
			return;
	//    9   19:return          
		}
		if(obj instanceof Integer)
	//*  10   20:aload_3         
	//*  11   21:instanceof      #189 <Class Integer>
	//*  12   24:ifeq            40
		{
			contentvalues.put(fieldtype.getColumnName(), (Integer)obj);
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:invokevirtual   #169 <Method String FieldType.getColumnName()>
	//   16   32:aload_3         
	//   17   33:checkcast       #189 <Class Integer>
	//   18   36:invokevirtual   #192 <Method void ContentValues.put(String, Integer)>
			return;
	//   19   39:return          
		}
		if(obj instanceof Long)
	//*  20   40:aload_3         
	//*  21   41:instanceof      #194 <Class Long>
	//*  22   44:ifeq            60
		{
			contentvalues.put(fieldtype.getColumnName(), (Long)obj);
	//   23   47:aload_1         
	//   24   48:aload_2         
	//   25   49:invokevirtual   #169 <Method String FieldType.getColumnName()>
	//   26   52:aload_3         
	//   27   53:checkcast       #194 <Class Long>
	//   28   56:invokevirtual   #197 <Method void ContentValues.put(String, Long)>
			return;
	//   29   59:return          
		}
		if(obj instanceof Byte)
	//*  30   60:aload_3         
	//*  31   61:instanceof      #199 <Class Byte>
	//*  32   64:ifeq            80
		{
			contentvalues.put(fieldtype.getColumnName(), (Byte)obj);
	//   33   67:aload_1         
	//   34   68:aload_2         
	//   35   69:invokevirtual   #169 <Method String FieldType.getColumnName()>
	//   36   72:aload_3         
	//   37   73:checkcast       #199 <Class Byte>
	//   38   76:invokevirtual   #202 <Method void ContentValues.put(String, Byte)>
			return;
	//   39   79:return          
		}
		if(obj instanceof Short)
	//*  40   80:aload_3         
	//*  41   81:instanceof      #204 <Class Short>
	//*  42   84:ifeq            100
		{
			contentvalues.put(fieldtype.getColumnName(), (Short)obj);
	//   43   87:aload_1         
	//   44   88:aload_2         
	//   45   89:invokevirtual   #169 <Method String FieldType.getColumnName()>
	//   46   92:aload_3         
	//   47   93:checkcast       #204 <Class Short>
	//   48   96:invokevirtual   #207 <Method void ContentValues.put(String, Short)>
			return;
	//   49   99:return          
		}
		if(obj instanceof Float)
	//*  50  100:aload_3         
	//*  51  101:instanceof      #209 <Class Float>
	//*  52  104:ifeq            120
		{
			contentvalues.put(fieldtype.getColumnName(), (Float)obj);
	//   53  107:aload_1         
	//   54  108:aload_2         
	//   55  109:invokevirtual   #169 <Method String FieldType.getColumnName()>
	//   56  112:aload_3         
	//   57  113:checkcast       #209 <Class Float>
	//   58  116:invokevirtual   #212 <Method void ContentValues.put(String, Float)>
			return;
	//   59  119:return          
		}
		if(obj instanceof Double)
	//*  60  120:aload_3         
	//*  61  121:instanceof      #214 <Class Double>
	//*  62  124:ifeq            140
		{
			contentvalues.put(fieldtype.getColumnName(), (Double)obj);
	//   63  127:aload_1         
	//   64  128:aload_2         
	//   65  129:invokevirtual   #169 <Method String FieldType.getColumnName()>
	//   66  132:aload_3         
	//   67  133:checkcast       #214 <Class Double>
	//   68  136:invokevirtual   #217 <Method void ContentValues.put(String, Double)>
			return;
	//   69  139:return          
		}
		if(obj instanceof Boolean)
	//*  70  140:aload_3         
	//*  71  141:instanceof      #219 <Class Boolean>
	//*  72  144:ifeq            160
		{
			contentvalues.put(fieldtype.getColumnName(), (Boolean)obj);
	//   73  147:aload_1         
	//   74  148:aload_2         
	//   75  149:invokevirtual   #169 <Method String FieldType.getColumnName()>
	//   76  152:aload_3         
	//   77  153:checkcast       #219 <Class Boolean>
	//   78  156:invokevirtual   #222 <Method void ContentValues.put(String, Boolean)>
			return;
	//   79  159:return          
		}
		if(obj instanceof byte[])
	//*  80  160:aload_3         
	//*  81  161:instanceof      #224 <Class byte[]>
	//*  82  164:ifeq            183
		{
			contentvalues.put(fieldtype.getColumnName(), (byte[])(byte[])obj);
	//   83  167:aload_1         
	//   84  168:aload_2         
	//   85  169:invokevirtual   #169 <Method String FieldType.getColumnName()>
	//   86  172:aload_3         
	//   87  173:checkcast       #224 <Class byte[]>
	//   88  176:checkcast       #224 <Class byte[]>
	//   89  179:invokevirtual   #227 <Method void ContentValues.put(String, byte[])>
			return;
	//   90  182:return          
		} else
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Don't recognize type for: ").append(obj).toString());
	//   91  183:new             #229 <Class IllegalArgumentException>
	//   92  186:dup             
	//   93  187:new             #158 <Class StringBuilder>
	//   94  190:dup             
	//   95  191:invokespecial   #159 <Method void StringBuilder()>
	//   96  194:ldc1            #231 <String "Don't recognize type for: ">
	//   97  196:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   98  199:aload_3         
	//   99  200:invokevirtual   #234 <Method StringBuilder StringBuilder.append(Object)>
	//  100  203:invokevirtual   #172 <Method String StringBuilder.toString()>
	//  101  206:invokespecial   #237 <Method void IllegalArgumentException(String)>
	//  102  209:athrow          
		}
	}

	private Dao.ForeignRefresh[] generateDefaultForeignRefreshMap()
		throws SQLException
	{
		return DaoHelper.fillForeignRefreshMap(squeakyContext, generatedTableMapper.getTableConfig().getFieldTypes(), 2);
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field SqueakyContext squeakyContext>
	//    2    4:aload_0         
	//    3    5:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//    4    8:invokeinterface #94  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//    5   13:invokevirtual   #100 <Method FieldType[] TableInfo.getFieldTypes()>
	//    6   16:iconst_2        
	//    7   17:invokestatic    #243 <Method Dao$ForeignRefresh[] DaoHelper.fillForeignRefreshMap(SqueakyContext, FieldType[], int)>
	//    8   20:areturn         
	}

	private SQLiteStatement makeCreateStatement()
	{
		int i;
		boolean flag;
		boolean flag1;
		int j;
		Object obj;
		StringBuilder stringbuilder;
		StringBuilder stringbuilder1;
		FieldType afieldtype[];
		FieldType fieldtype;
		try
		{
			obj = ((Object) (squeakyContext.getDatabase()));
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field SqueakyContext squeakyContext>
	//    2    4:invokevirtual   #249 <Method SQLiteDatabase SqueakyContext.getDatabase()>
	//    3    7:astore          5
			TableInfo tableinfo = generatedTableMapper.getTableConfig();
	//    4    9:aload_0         
	//    5   10:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//    6   13:invokeinterface #94  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//    7   18:astore          7
			stringbuilder = new StringBuilder();
	//    8   20:new             #158 <Class StringBuilder>
	//    9   23:dup             
	//   10   24:invokespecial   #159 <Method void StringBuilder()>
	//   11   27:astore          6
			stringbuilder.append("insert into ");
	//   12   29:aload           6
	//   13   31:ldc1            #251 <String "insert into ">
	//   14   33:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:pop             
			stringbuilder.append(tableinfo.getTableName());
	//   16   37:aload           6
	//   17   39:aload           7
	//   18   41:invokevirtual   #176 <Method String TableInfo.getTableName()>
	//   19   44:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   20   47:pop             
			stringbuilder.append("(");
	//   21   48:aload           6
	//   22   50:ldc1            #253 <String "(">
	//   23   52:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   24   55:pop             
		}
	//*  25   56:iconst_1        
	//*  26   57:istore_2        
	//*  27   58:new             #158 <Class StringBuilder>
	//*  28   61:dup             
	//*  29   62:invokespecial   #159 <Method void StringBuilder()>
	//*  30   65:astore          7
	//*  31   67:aload_0         
	//*  32   68:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//*  33   71:invokeinterface #94  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//*  34   76:invokevirtual   #100 <Method FieldType[] TableInfo.getFieldTypes()>
	//*  35   79:astore          8
	//*  36   81:aload           8
	//*  37   83:arraylength     
	//*  38   84:istore          4
	//*  39   86:iconst_0        
	//*  40   87:istore_1        
	//*  41   88:iload_1         
	//*  42   89:iload           4
	//*  43   91:icmpge          155
	//*  44   94:aload           8
	//*  45   96:iload_1         
	//*  46   97:aaload          
	//*  47   98:astore          9
	//*  48  100:iload_2         
	//*  49  101:istore_3        
	//*  50  102:aload           9
	//*  51  104:invokevirtual   #109 <Method boolean FieldType.isGeneratedId()>
	//*  52  107:ifne            207
	//*  53  110:iload_2         
	//*  54  111:ifne            130
	//*  55  114:aload           6
	//*  56  116:ldc1            #255 <String ",">
	//*  57  118:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//*  58  121:pop             
	//*  59  122:aload           7
	//*  60  124:ldc1            #255 <String ",">
	//*  61  126:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//*  62  129:pop             
	//*  63  130:aload           6
	//*  64  132:aload           9
	//*  65  134:invokevirtual   #169 <Method String FieldType.getColumnName()>
	//*  66  137:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//*  67  140:pop             
	//*  68  141:aload           7
	//*  69  143:ldc2            #257 <String "?">
	//*  70  146:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//*  71  149:pop             
	//*  72  150:iconst_0        
	//*  73  151:istore_3        
	//*  74  152:goto            207
	//*  75  155:aload           6
	//*  76  157:ldc2            #259 <String ")values(">
	//*  77  160:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//*  78  163:aload           7
	//*  79  165:invokevirtual   #172 <Method String StringBuilder.toString()>
	//*  80  168:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//*  81  171:ldc2            #261 <String ")">
	//*  82  174:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//*  83  177:pop             
	//*  84  178:aload           5
	//*  85  180:aload           6
	//*  86  182:invokevirtual   #172 <Method String StringBuilder.toString()>
	//*  87  185:invokeinterface #267 <Method SQLiteStatement SQLiteDatabase.compileStatement(String)>
	//*  88  190:astore          5
	//*  89  192:aload           5
	//*  90  194:areturn         
		catch(SQLException sqlexception)
	//*  91  195:astore          5
		{
			throw new RuntimeException(((Throwable) (sqlexception)));
	//   92  197:new             #119 <Class RuntimeException>
	//   93  200:dup             
	//   94  201:aload           5
	//   95  203:invokespecial   #122 <Method void RuntimeException(Throwable)>
	//   96  206:athrow          
		}
		flag = true;
		stringbuilder1 = new StringBuilder();
		afieldtype = generatedTableMapper.getTableConfig().getFieldTypes();
		j = afieldtype.length;
		i = 0;
_L2:
		if(i >= j)
			break MISSING_BLOCK_LABEL_155;
		fieldtype = afieldtype[i];
		flag1 = flag;
		if(fieldtype.isGeneratedId())
			break MISSING_BLOCK_LABEL_207;
		if(flag)
			break MISSING_BLOCK_LABEL_130;
		stringbuilder.append(",");
		stringbuilder1.append(",");
		stringbuilder.append(fieldtype.getColumnName());
		stringbuilder1.append("?");
		flag1 = false;
		break MISSING_BLOCK_LABEL_207;
		stringbuilder.append(")values(").append(stringbuilder1.toString()).append(")");
		obj = ((Object) (((SQLiteDatabase) (obj)).compileStatement(stringbuilder.toString())));
		return ((SQLiteStatement) (obj));
		i++;
	//   97  207:iload_1         
	//   98  208:iconst_1        
	//   99  209:iadd            
	//  100  210:istore_1        
		flag = flag1;
	//  101  211:iload_3         
	//  102  212:istore_2        
		if(true) goto _L2; else goto _L1
	//  103  213:goto            88
_L1:
	}

	private Cursor makeCursor(String s, String s1, String as[], String s2, Integer integer, Integer integer1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #158 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #159 <Method void StringBuilder()>
	//    3    7:astore          7
		stringbuilder.append("select ").append(TextUtils.join(",", ((Object []) (tableCols)))).append(" from ").append(s);
	//    4    9:aload           7
	//    5   11:ldc2            #271 <String "select ">
	//    6   14:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc1            #255 <String ",">
	//    8   19:aload_0         
	//    9   20:getfield        #117 <Field String[] tableCols>
	//   10   23:invokestatic    #277 <Method String TextUtils.join(CharSequence, Object[])>
	//   11   26:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   12   29:ldc2            #279 <String " from ">
	//   13   32:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   14   35:aload_1         
	//   15   36:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   16   39:pop             
		if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//*  17   40:aload_2         
	//*  18   41:invokestatic    #283 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  19   44:ifne            60
			stringbuilder.append(" where ").append(s1);
	//   20   47:aload           7
	//   21   49:ldc2            #285 <String " where ">
	//   22   52:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   23   55:aload_2         
	//   24   56:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   25   59:pop             
		if(!TextUtils.isEmpty(((CharSequence) (s2))))
	//*  26   60:aload           4
	//*  27   62:invokestatic    #283 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  28   65:ifne            82
			stringbuilder.append(" order by ").append(s2);
	//   29   68:aload           7
	//   30   70:ldc2            #287 <String " order by ">
	//   31   73:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   32   76:aload           4
	//   33   78:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   34   81:pop             
		if(integer != null)
	//*  35   82:aload           5
	//*  36   84:ifnull          101
			stringbuilder.append(" limit ").append(((Object) (integer)));
	//   37   87:aload           7
	//   38   89:ldc2            #289 <String " limit ">
	//   39   92:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   40   95:aload           5
	//   41   97:invokevirtual   #234 <Method StringBuilder StringBuilder.append(Object)>
	//   42  100:pop             
		if(integer1 != null)
	//*  43  101:aload           6
	//*  44  103:ifnull          120
			stringbuilder.append(" offset ").append(((Object) (integer1)));
	//   45  106:aload           7
	//   46  108:ldc2            #291 <String " offset ">
	//   47  111:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   48  114:aload           6
	//   49  116:invokevirtual   #234 <Method StringBuilder StringBuilder.append(Object)>
	//   50  119:pop             
		s = stringbuilder.toString();
	//   51  120:aload           7
	//   52  122:invokevirtual   #172 <Method String StringBuilder.toString()>
	//   53  125:astore_1        
		return squeakyContext.getDatabase().rawQuery(s, as);
	//   54  126:aload_0         
	//   55  127:getfield        #84  <Field SqueakyContext squeakyContext>
	//   56  130:invokevirtual   #249 <Method SQLiteDatabase SqueakyContext.getDatabase()>
	//   57  133:aload_1         
	//   58  134:aload_3         
	//   59  135:invokeinterface #295 <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   60  140:areturn         
	}

	private List makeCursorResults(String s, String s1, String as[], String s2, Integer integer, Integer integer1, Dao.ForeignRefresh aforeignrefresh[])
		throws SQLException
	{
		ArrayList arraylist;
		TransientCache transientcache;
		arraylist = new ArrayList();
	//    0    0:new             #67  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #68  <Method void ArrayList()>
	//    3    7:astore          9
		transientcache = new TransientCache();
	//    4    9:new             #297 <Class TransientCache>
	//    5   12:dup             
	//    6   13:invokespecial   #298 <Method void TransientCache()>
	//    7   16:astore          10
		s = ((String) (makeCursor(s, s1, as, s2, integer, integer1)));
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:aload           4
	//   13   24:aload           5
	//   14   26:aload           6
	//   15   28:invokespecial   #300 <Method Cursor makeCursor(String, String, String[], String, Integer, Integer)>
	//   16   31:astore_1        
		boolean flag;
		if(((Cursor) (s)).moveToFirst())
	//*  17   32:aload_1         
	//*  18   33:invokeinterface #305 <Method boolean Cursor.moveToFirst()>
	//*  19   38:ifeq            90
			do
			{
				s1 = ((String) (generatedTableMapper.createObject(((Cursor) (s)))));
	//   20   41:aload_0         
	//   21   42:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//   22   45:aload_1         
	//   23   46:invokeinterface #309 <Method Object GeneratedTableMapper.createObject(Cursor)>
	//   24   51:astore_2        
				generatedTableMapper.fillRow(((Object) (s1)), ((Cursor) (s)), this, aforeignrefresh, transientcache);
	//   25   52:aload_0         
	//   26   53:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//   27   56:aload_2         
	//   28   57:aload_1         
	//   29   58:aload_0         
	//   30   59:aload           7
	//   31   61:aload           10
	//   32   63:invokeinterface #313 <Method void GeneratedTableMapper.fillRow(Object, Cursor, ModelDao, Dao$ForeignRefresh[], TransientCache)>
				((List) (arraylist)).add(((Object) (s1)));
	//   33   68:aload           9
	//   34   70:aload_2         
	//   35   71:invokeinterface #319 <Method boolean List.add(Object)>
	//   36   76:pop             
				flag = ((Cursor) (s)).moveToNext();
	//   37   77:aload_1         
	//   38   78:invokeinterface #322 <Method boolean Cursor.moveToNext()>
	//   39   83:istore          8
			} while(flag);
	//   40   85:iload           8
	//   41   87:ifne            41
		((Cursor) (s)).close();
	//   42   90:aload_1         
	//   43   91:invokeinterface #325 <Method void Cursor.close()>
		return ((List) (arraylist));
	//   44   96:aload           9
	//   45   98:areturn         
		s1;
	//   46   99:astore_2        
		((Cursor) (s)).close();
	//   47  100:aload_1         
	//   48  101:invokeinterface #325 <Method void Cursor.close()>
		throw s1;
	//   49  106:aload_2         
	//   50  107:athrow          
	}

	private SQLiteStatement makeUpdateStatement()
	{
		int i;
		boolean flag;
		boolean flag1;
		int j;
		Object obj;
		StringBuilder stringbuilder;
		FieldType afieldtype[];
		FieldType fieldtype;
		try
		{
			obj = ((Object) (squeakyContext.getDatabase()));
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field SqueakyContext squeakyContext>
	//    2    4:invokevirtual   #249 <Method SQLiteDatabase SqueakyContext.getDatabase()>
	//    3    7:astore          5
			TableInfo tableinfo = generatedTableMapper.getTableConfig();
	//    4    9:aload_0         
	//    5   10:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//    6   13:invokeinterface #94  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//    7   18:astore          7
			stringbuilder = new StringBuilder();
	//    8   20:new             #158 <Class StringBuilder>
	//    9   23:dup             
	//   10   24:invokespecial   #159 <Method void StringBuilder()>
	//   11   27:astore          6
			stringbuilder.append("update ").append(tableinfo.getTableName()).append(" set ");
	//   12   29:aload           6
	//   13   31:ldc2            #328 <String "update ">
	//   14   34:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   15   37:aload           7
	//   16   39:invokevirtual   #176 <Method String TableInfo.getTableName()>
	//   17   42:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   18   45:ldc2            #330 <String " set ">
	//   19   48:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   20   51:pop             
		}
	//*  21   52:iconst_1        
	//*  22   53:istore_2        
	//*  23   54:aload_0         
	//*  24   55:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//*  25   58:invokeinterface #94  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//*  26   63:invokevirtual   #100 <Method FieldType[] TableInfo.getFieldTypes()>
	//*  27   66:astore          7
	//*  28   68:aload           7
	//*  29   70:arraylength     
	//*  30   71:istore          4
	//*  31   73:iconst_0        
	//*  32   74:istore_1        
	//*  33   75:iload_1         
	//*  34   76:iload           4
	//*  35   78:icmpge          141
	//*  36   81:aload           7
	//*  37   83:iload_1         
	//*  38   84:aaload          
	//*  39   85:astore          8
	//*  40   87:iload_2         
	//*  41   88:istore_3        
	//*  42   89:aload           8
	//*  43   91:invokevirtual   #109 <Method boolean FieldType.isGeneratedId()>
	//*  44   94:ifne            203
	//*  45   97:iload_2         
	//*  46   98:istore_3        
	//*  47   99:aload           8
	//*  48  101:invokevirtual   #106 <Method boolean FieldType.isId()>
	//*  49  104:ifne            203
	//*  50  107:iload_2         
	//*  51  108:ifne            119
	//*  52  111:aload           6
	//*  53  113:ldc1            #255 <String ",">
	//*  54  115:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//*  55  118:pop             
	//*  56  119:aload           6
	//*  57  121:aload           8
	//*  58  123:invokevirtual   #169 <Method String FieldType.getColumnName()>
	//*  59  126:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//*  60  129:ldc2            #332 <String " = ?">
	//*  61  132:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//*  62  135:pop             
	//*  63  136:iconst_0        
	//*  64  137:istore_3        
	//*  65  138:goto            203
	//*  66  141:aload           6
	//*  67  143:ldc2            #285 <String " where ">
	//*  68  146:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//*  69  149:aload_0         
	//*  70  150:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//*  71  153:invokeinterface #94  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//*  72  158:getfield        #335 <Field FieldType TableInfo.idField>
	//*  73  161:invokevirtual   #169 <Method String FieldType.getColumnName()>
	//*  74  164:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//*  75  167:ldc2            #332 <String " = ?">
	//*  76  170:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//*  77  173:pop             
	//*  78  174:aload           5
	//*  79  176:aload           6
	//*  80  178:invokevirtual   #172 <Method String StringBuilder.toString()>
	//*  81  181:invokeinterface #267 <Method SQLiteStatement SQLiteDatabase.compileStatement(String)>
	//*  82  186:astore          5
	//*  83  188:aload           5
	//*  84  190:areturn         
		catch(SQLException sqlexception)
	//*  85  191:astore          5
		{
			throw new RuntimeException(((Throwable) (sqlexception)));
	//   86  193:new             #119 <Class RuntimeException>
	//   87  196:dup             
	//   88  197:aload           5
	//   89  199:invokespecial   #122 <Method void RuntimeException(Throwable)>
	//   90  202:athrow          
		}
		flag = true;
		afieldtype = generatedTableMapper.getTableConfig().getFieldTypes();
		j = afieldtype.length;
		i = 0;
_L2:
		if(i >= j)
			break MISSING_BLOCK_LABEL_141;
		fieldtype = afieldtype[i];
		flag1 = flag;
		if(fieldtype.isGeneratedId())
			break MISSING_BLOCK_LABEL_203;
		flag1 = flag;
		if(fieldtype.isId())
			break MISSING_BLOCK_LABEL_203;
		if(flag)
			break MISSING_BLOCK_LABEL_119;
		stringbuilder.append(",");
		stringbuilder.append(fieldtype.getColumnName()).append(" = ?");
		flag1 = false;
		break MISSING_BLOCK_LABEL_203;
		stringbuilder.append(" where ").append(generatedTableMapper.getTableConfig().idField.getColumnName()).append(" = ?");
		obj = ((Object) (((SQLiteDatabase) (obj)).compileStatement(stringbuilder.toString())));
		return ((SQLiteStatement) (obj));
		i++;
	//   91  203:iload_1         
	//   92  204:iconst_1        
	//   93  205:iadd            
	//   94  206:istore_1        
		flag = flag1;
	//   95  207:iload_3         
	//   96  208:istore_2        
		if(true) goto _L2; else goto _L1
	//   97  209:goto            75
_L1:
	}

	public Query all()
	{
		return new Query() {

			public String getFromStatement(boolean flag)
				throws SQLException
			{
				StringBuilder stringbuilder = new StringBuilder();
			//    0    0:new             #27  <Class StringBuilder>
			//    1    3:dup             
			//    2    4:invokespecial   #28  <Method void StringBuilder()>
			//    3    7:astore_2        
				stringbuilder.append(generatedTableMapper.getTableConfig().getTableName());
			//    4    8:aload_2         
			//    5    9:aload_0         
			//    6   10:getfield        #17  <Field ModelDao this$0>
			//    7   13:invokestatic    #32  <Method GeneratedTableMapper ModelDao.access$500(ModelDao)>
			//    8   16:invokeinterface #38  <Method TableInfo GeneratedTableMapper.getTableConfig()>
			//    9   21:invokevirtual   #44  <Method String TableInfo.getTableName()>
			//   10   24:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
			//   11   27:pop             
				if(flag)
			//*  12   28:iload_1         
			//*  13   29:ifeq            44
					stringbuilder.append(" ").append("t");
			//   14   32:aload_2         
			//   15   33:ldc1            #50  <String " ">
			//   16   35:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
			//   17   38:ldc1            #52  <String "t">
			//   18   40:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
			//   19   43:pop             
				return stringbuilder.toString();
			//   20   44:aload_2         
			//   21   45:invokevirtual   #55  <Method String StringBuilder.toString()>
			//   22   48:areturn         
			}

			public String[] getParameters()
				throws SQLException
			{
				return null;
			//    0    0:aconst_null     
			//    1    1:areturn         
			}

			public String getWhereStatement(boolean flag)
				throws SQLException
			{
				return null;
			//    0    0:aconst_null     
			//    1    1:areturn         
			}

			final ModelDao this$0;

			
			{
				this$0 = ModelDao.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ModelDao this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #15  <Class ModelDao$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #338 <Method void ModelDao$4(ModelDao)>
	//    4    8:areturn         
	}

	public void cleanUp()
	{
		for(Iterator iterator1 = statementList.iterator(); iterator1.hasNext(); ((SQLiteStatement)iterator1.next()).close());
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field List statementList>
	//    2    4:invokeinterface #343 <Method Iterator List.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #348 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            36
	//    7   19:aload_1         
	//    8   20:invokeinterface #352 <Method Object Iterator.next()>
	//    9   25:checkcast       #354 <Class SQLiteStatement>
	//   10   28:invokeinterface #355 <Method void SQLiteStatement.close()>
	//*  11   33:goto            10
	//   12   36:return          
	}

	public long countOf()
		throws SQLException
	{
		return squeakyContext.getDatabase().countOf(generatedTableMapper.getTableConfig().getTableName());
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field SqueakyContext squeakyContext>
	//    2    4:invokevirtual   #249 <Method SQLiteDatabase SqueakyContext.getDatabase()>
	//    3    7:aload_0         
	//    4    8:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//    5   11:invokeinterface #94  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//    6   16:invokevirtual   #176 <Method String TableInfo.getTableName()>
	//    7   19:invokeinterface #360 <Method long SQLiteDatabase.countOf(String)>
	//    8   24:lreturn         
	}

	public long countOf(Query query1)
		throws SQLException
	{
		return squeakyContext.getDatabase().countOf(query1);
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field SqueakyContext squeakyContext>
	//    2    4:invokevirtual   #249 <Method SQLiteDatabase SqueakyContext.getDatabase()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #363 <Method long SQLiteDatabase.countOf(Query)>
	//    5   13:lreturn         
	}

	public void create(Object obj)
		throws SQLException
	{
		SQLiteStatement sqlitestatement = (SQLiteStatement)createStatement.get();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field ThreadLocal createStatement>
	//    2    4:invokevirtual   #372 <Method Object ThreadLocal.get()>
	//    3    7:checkcast       #354 <Class SQLiteStatement>
	//    4   10:astore          4
		generatedTableMapper.bindCreateVals(sqlitestatement, obj);
	//    5   12:aload_0         
	//    6   13:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//    7   16:aload           4
	//    8   18:aload_1         
	//    9   19:invokeinterface #376 <Method void GeneratedTableMapper.bindCreateVals(SQLiteStatement, Object)>
		try
		{
			long l = sqlitestatement.executeInsert();
	//   10   24:aload           4
	//   11   26:invokeinterface #379 <Method long SQLiteStatement.executeInsert()>
	//   12   31:lstore_2        
			if(idFieldType != null && idFieldType.isGeneratedId())
	//*  13   32:aload_0         
	//*  14   33:getfield        #111 <Field FieldType idFieldType>
	//*  15   36:ifnull          63
	//*  16   39:aload_0         
	//*  17   40:getfield        #111 <Field FieldType idFieldType>
	//*  18   43:invokevirtual   #109 <Method boolean FieldType.isGeneratedId()>
	//*  19   46:ifeq            63
				generatedTableMapper.assignId(obj, ((Object) (Long.valueOf(l))));
	//   20   49:aload_0         
	//   21   50:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//   22   53:aload_1         
	//   23   54:lload_2         
	//   24   55:invokestatic    #383 <Method Long Long.valueOf(long)>
	//   25   58:invokeinterface #387 <Method void GeneratedTableMapper.assignId(Object, Object)>
			notifyChanges();
	//   26   63:aload_0         
	//   27   64:invokevirtual   #390 <Method void notifyChanges()>
			return;
	//   28   67:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  29   68:astore_1        
		{
			throw new SQLException("create failed", ((Throwable) (obj)));
	//   30   69:new             #141 <Class SQLException>
	//   31   72:dup             
	//   32   73:ldc2            #392 <String "create failed">
	//   33   76:aload_1         
	//   34   77:invokespecial   #395 <Method void SQLException(String, Throwable)>
	//   35   80:athrow          
		}
	}

	public Object createIfNotExists(Object obj)
		throws SQLException
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		Object obj1 = queryForId(generatedTableMapper.extractId(obj));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//    7   11:aload_1         
	//    8   12:invokeinterface #401 <Method Object GeneratedTableMapper.extractId(Object)>
	//    9   17:invokevirtual   #404 <Method Object queryForId(Object)>
	//   10   20:astore_2        
		if(obj1 == null)
	//*  11   21:aload_2         
	//*  12   22:ifnonnull       32
		{
			create(obj);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #406 <Method void create(Object)>
			return obj;
	//   16   30:aload_1         
	//   17   31:areturn         
		} else
		{
			return obj1;
	//   18   32:aload_2         
	//   19   33:areturn         
		}
	}

	public void createOrUpdate(Object obj)
		throws SQLException
	{
		Object obj1 = extractId(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #409 <Method Object extractId(Object)>
	//    3    5:astore_2        
		if(obj1 == null || !idExists(obj1))
	//*   4    6:aload_2         
	//*   5    7:ifnull          18
	//*   6   10:aload_0         
	//*   7   11:aload_2         
	//*   8   12:invokevirtual   #412 <Method boolean idExists(Object)>
	//*   9   15:ifne            24
		{
			create(obj);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #406 <Method void create(Object)>
			return;
	//   13   23:return          
		} else
		{
			update(obj);
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:invokevirtual   #415 <Method void update(Object)>
			return;
	//   17   29:return          
		}
	}

	public int delete(Query query1)
		throws SQLException
	{
		long l = squeakyContext.getDatabase().delete(query1.getFromStatement(false), query1.getWhereStatement(false), query1.getParameters());
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field SqueakyContext squeakyContext>
	//    2    4:invokevirtual   #249 <Method SQLiteDatabase SqueakyContext.getDatabase()>
	//    3    7:aload_1         
	//    4    8:iconst_0        
	//    5    9:invokeinterface #423 <Method String Query.getFromStatement(boolean)>
	//    6   14:aload_1         
	//    7   15:iconst_0        
	//    8   16:invokeinterface #426 <Method String Query.getWhereStatement(boolean)>
	//    9   21:aload_1         
	//   10   22:invokeinterface #429 <Method String[] Query.getParameters()>
	//   11   27:invokeinterface #432 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   12   32:i2l             
	//   13   33:lstore_2        
		notifyChanges();
	//   14   34:aload_0         
	//   15   35:invokevirtual   #390 <Method void notifyChanges()>
		return (int)l;
	//   16   38:lload_2         
	//   17   39:l2i             
	//   18   40:ireturn         
	}

	public int delete(Object obj)
		throws SQLException
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return deleteById(generatedTableMapper.extractId(obj));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//    7   11:aload_1         
	//    8   12:invokeinterface #401 <Method Object GeneratedTableMapper.extractId(Object)>
	//    9   17:invokevirtual   #436 <Method int deleteById(Object)>
	//   10   20:ireturn         
	}

	public int delete(Collection collection)
		throws SQLException
	{
		ArrayList arraylist = new ArrayList(collection.size());
	//    0    0:new             #67  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokeinterface #444 <Method int Collection.size()>
	//    4   10:invokespecial   #447 <Method void ArrayList(int)>
	//    5   13:astore_2        
		Object obj;
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); ((List) (arraylist)).add(generatedTableMapper.extractId(obj)))
	//*   6   14:aload_1         
	//*   7   15:invokeinterface #448 <Method Iterator Collection.iterator()>
	//*   8   20:astore_1        
	//*   9   21:aload_1         
	//*  10   22:invokeinterface #348 <Method boolean Iterator.hasNext()>
	//*  11   27:ifeq            57
			obj = ((Iterator) (collection)).next();
	//   12   30:aload_1         
	//   13   31:invokeinterface #352 <Method Object Iterator.next()>
	//   14   36:astore_3        

	//   15   37:aload_2         
	//   16   38:aload_0         
	//   17   39:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//   18   42:aload_3         
	//   19   43:invokeinterface #401 <Method Object GeneratedTableMapper.extractId(Object)>
	//   20   48:invokeinterface #319 <Method boolean List.add(Object)>
	//   21   53:pop             
	//*  22   54:goto            21
		return deleteIds(((Collection) (arraylist)));
	//   23   57:aload_0         
	//   24   58:aload_2         
	//   25   59:invokevirtual   #451 <Method int deleteIds(Collection)>
	//   26   62:ireturn         
	}

	public int deleteById(Object obj)
		throws SQLException
	{
		int i = squeakyContext.getDatabase().delete(generatedTableMapper.getTableConfig().getTableName(), (new StringBuilder()).append(idFieldType.getColumnName()).append("= ?").toString(), new String[] {
			obj.toString()
		});
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field SqueakyContext squeakyContext>
	//    2    4:invokevirtual   #249 <Method SQLiteDatabase SqueakyContext.getDatabase()>
	//    3    7:aload_0         
	//    4    8:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//    5   11:invokeinterface #94  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//    6   16:invokevirtual   #176 <Method String TableInfo.getTableName()>
	//    7   19:new             #158 <Class StringBuilder>
	//    8   22:dup             
	//    9   23:invokespecial   #159 <Method void StringBuilder()>
	//   10   26:aload_0         
	//   11   27:getfield        #111 <Field FieldType idFieldType>
	//   12   30:invokevirtual   #169 <Method String FieldType.getColumnName()>
	//   13   33:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   14   36:ldc1            #25  <String "= ?">
	//   15   38:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   16   41:invokevirtual   #172 <Method String StringBuilder.toString()>
	//   17   44:iconst_1        
	//   18   45:anewarray       String[]
	//   19   48:dup             
	//   20   49:iconst_0        
	//   21   50:aload_1         
	//   22   51:invokevirtual   #453 <Method String Object.toString()>
	//   23   54:aastore         
	//   24   55:invokeinterface #432 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   25   60:istore_2        
		notifyChanges();
	//   26   61:aload_0         
	//   27   62:invokevirtual   #390 <Method void notifyChanges()>
		return i;
	//   28   65:iload_2         
	//   29   66:ireturn         
	}

	public int deleteIds(Collection collection)
		throws SQLException
	{
		final StringBuilder sb = new StringBuilder();
	//    0    0:new             #158 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #159 <Method void StringBuilder()>
	//    3    7:astore_3        
		sb.append(idFieldType.getColumnName()).append(" in (");
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #111 <Field FieldType idFieldType>
	//    7   13:invokevirtual   #169 <Method String FieldType.getColumnName()>
	//    8   16:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:ldc2            #455 <String " in (">
	//   10   22:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:pop             
		boolean flag = true;
	//   12   26:iconst_1        
	//   13   27:istore_2        
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext();)
	//*  14   28:aload_1         
	//*  15   29:invokeinterface #448 <Method Iterator Collection.iterator()>
	//*  16   34:astore_1        
	//*  17   35:aload_1         
	//*  18   36:invokeinterface #348 <Method boolean Iterator.hasNext()>
	//*  19   41:ifeq            103
		{
			Object obj = ((Iterator) (collection)).next();
	//   20   44:aload_1         
	//   21   45:invokeinterface #352 <Method Object Iterator.next()>
	//   22   50:astore          4
			if(flag)
	//*  23   52:iload_2         
	//*  24   53:ifeq            80
				flag = false;
	//   25   56:iconst_0        
	//   26   57:istore_2        
			else
	//*  27   58:aload_0         
	//*  28   59:getfield        #111 <Field FieldType idFieldType>
	//*  29   62:invokevirtual   #458 <Method boolean FieldType.isEscapedValue()>
	//*  30   65:ifeq            90
	//*  31   68:aload_3         
	//*  32   69:aload           4
	//*  33   71:invokevirtual   #453 <Method String Object.toString()>
	//*  34   74:invokestatic    #464 <Method void TableUtils.appendEscapedWord(StringBuilder, String)>
	//*  35   77:goto            35
				sb.append(',');
	//   36   80:aload_3         
	//   37   81:bipush          44
	//   38   83:invokevirtual   #179 <Method StringBuilder StringBuilder.append(char)>
	//   39   86:pop             
			if(idFieldType.isEscapedValue())
				TableUtils.appendEscapedWord(sb, obj.toString());
			else
	//*  40   87:goto            58
				sb.append(obj.toString());
	//   41   90:aload_3         
	//   42   91:aload           4
	//   43   93:invokevirtual   #453 <Method String Object.toString()>
	//   44   96:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   45   99:pop             
		}

	//*  46  100:goto            35
		sb.append(")");
	//   47  103:aload_3         
	//   48  104:ldc2            #261 <String ")">
	//   49  107:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   50  110:pop             
		return delete(new Query() {

			public String getFromStatement(boolean flag1)
				throws SQLException
			{
				return generatedTableMapper.getTableConfig().getTableName();
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field ModelDao this$0>
			//    2    4:invokestatic    #33  <Method GeneratedTableMapper ModelDao.access$500(ModelDao)>
			//    3    7:invokeinterface #39  <Method TableInfo GeneratedTableMapper.getTableConfig()>
			//    4   12:invokevirtual   #45  <Method String TableInfo.getTableName()>
			//    5   15:areturn         
			}

			public String[] getParameters()
				throws SQLException
			{
				return null;
			//    0    0:aconst_null     
			//    1    1:areturn         
			}

			public String getWhereStatement(boolean flag1)
			{
				return sb.toString();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field StringBuilder val$sb>
			//    2    4:invokevirtual   #54  <Method String StringBuilder.toString()>
			//    3    7:areturn         
			}

			final ModelDao this$0;
			final StringBuilder val$sb;

			
			{
				this$0 = ModelDao.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ModelDao this$0>
				sb = stringbuilder;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field StringBuilder val$sb>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   51  111:aload_0         
	//   52  112:new             #13  <Class ModelDao$3>
	//   53  115:dup             
	//   54  116:aload_0         
	//   55  117:aload_3         
	//   56  118:invokespecial   #467 <Method void ModelDao$3(ModelDao, StringBuilder)>
	//   57  121:invokevirtual   #469 <Method int delete(Query)>
	//   58  124:ireturn         
	}

	public Object extractId(Object obj)
		throws SQLException
	{
		return generatedTableMapper.extractId(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//    2    4:aload_1         
	//    3    5:invokeinterface #401 <Method Object GeneratedTableMapper.extractId(Object)>
	//    4   10:areturn         
	}

	public void fillForeignCollection(Object obj, String s)
		throws SQLException
	{
		generatedTableMapper.fillForeignCollection(obj, this, s);
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokeinterface #476 <Method void GeneratedTableMapper.fillForeignCollection(Object, ModelDao, String)>
	//    6   12:return          
	}

	public ForeignCollectionInfo findForeignCollectionInfo(String s)
		throws SQLException
	{
		ForeignCollectionInfo aforeigncollectioninfo[] = generatedTableMapper.getTableConfig().getForeignCollections();
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//    2    4:invokeinterface #94  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//    3    9:invokevirtual   #483 <Method ForeignCollectionInfo[] TableInfo.getForeignCollections()>
	//    4   12:astore          4
		int j = aforeigncollectioninfo.length;
	//    5   14:aload           4
	//    6   16:arraylength     
	//    7   17:istore_3        
		for(int i = 0; i < j; i++)
	//*   8   18:iconst_0        
	//*   9   19:istore_2        
	//*  10   20:iload_2         
	//*  11   21:iload_3         
	//*  12   22:icmpge          53
		{
			ForeignCollectionInfo foreigncollectioninfo = aforeigncollectioninfo[i];
	//   13   25:aload           4
	//   14   27:iload_2         
	//   15   28:aaload          
	//   16   29:astore          5
			if(s.equals(((Object) (foreigncollectioninfo.variableName))))
	//*  17   31:aload_1         
	//*  18   32:aload           5
	//*  19   34:getfield        #488 <Field String ForeignCollectionInfo.variableName>
	//*  20   37:invokevirtual   #491 <Method boolean String.equals(Object)>
	//*  21   40:ifeq            46
				return foreigncollectioninfo;
	//   22   43:aload           5
	//   23   45:areturn         
		}

	//   24   46:iload_2         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_2        
	//*  28   50:goto            20
		throw new SQLException("Couldn't find foreign collection children");
	//   29   53:new             #141 <Class SQLException>
	//   30   56:dup             
	//   31   57:ldc2            #493 <String "Couldn't find foreign collection children">
	//   32   60:invokespecial   #494 <Method void SQLException(String)>
	//   33   63:athrow          
	}

	public Class getDataClass()
	{
		return entityClass;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field Class entityClass>
	//    2    4:areturn         
	}

	public GeneratedTableMapper getGeneratedTableMapper()
	{
		return generatedTableMapper;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//    2    4:areturn         
	}

	public SqueakyContext getOpenHelper()
	{
		return squeakyContext;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field SqueakyContext squeakyContext>
	//    2    4:areturn         
	}

	public boolean idExists(Object obj)
		throws SQLException
	{
		return queryForId(obj) != null;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #404 <Method Object queryForId(Object)>
	//    3    5:ifnull          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean isUpdatable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public CloseableIterator iterator()
		throws SQLException
	{
		return ((CloseableIterator) (new SelectIterator(makeCursor(createDefaultFrom(), ((String) (null)), ((String []) (null)), ((String) (null)), ((Integer) (null)), ((Integer) (null))), this, generateDefaultForeignRefreshMap())));
	//    0    0:new             #506 <Class SelectIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokespecial   #508 <Method String createDefaultFrom()>
	//    5    9:aconst_null     
	//    6   10:aconst_null     
	//    7   11:aconst_null     
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:invokespecial   #300 <Method Cursor makeCursor(String, String, String[], String, Integer, Integer)>
	//   11   17:aload_0         
	//   12   18:aload_0         
	//   13   19:invokespecial   #145 <Method Dao$ForeignRefresh[] generateDefaultForeignRefreshMap()>
	//   14   22:invokespecial   #511 <Method void SelectIterator(Cursor, ModelDao, Dao$ForeignRefresh[])>
	//   15   25:areturn         
	}

	public CloseableIterator iterator(Query query1)
		throws SQLException
	{
		return ((CloseableIterator) (new SelectIterator(makeCursor(query1.getFromStatement(true), query1.getWhereStatement(true), query1.getParameters(), ((String) (null)), ((Integer) (null)), ((Integer) (null))), this, generateDefaultForeignRefreshMap())));
	//    0    0:new             #506 <Class SelectIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:invokeinterface #423 <Method String Query.getFromStatement(boolean)>
	//    6   12:aload_1         
	//    7   13:iconst_1        
	//    8   14:invokeinterface #426 <Method String Query.getWhereStatement(boolean)>
	//    9   19:aload_1         
	//   10   20:invokeinterface #429 <Method String[] Query.getParameters()>
	//   11   25:aconst_null     
	//   12   26:aconst_null     
	//   13   27:aconst_null     
	//   14   28:invokespecial   #300 <Method Cursor makeCursor(String, String, String[], String, Integer, Integer)>
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:invokespecial   #145 <Method Dao$ForeignRefresh[] generateDefaultForeignRefreshMap()>
	//   18   36:invokespecial   #511 <Method void SelectIterator(Cursor, ModelDao, Dao$ForeignRefresh[])>
	//   19   39:areturn         
	}

	public void notifyChanges()
	{
		for(Iterator iterator1 = daoObserverSet.iterator(); iterator1.hasNext(); ((Dao.DaoObserver)iterator1.next()).onChange());
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Set daoObserverSet>
	//    2    4:invokeinterface #517 <Method Iterator Set.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #348 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            36
	//    7   19:aload_1         
	//    8   20:invokeinterface #352 <Method Object Iterator.next()>
	//    9   25:checkcast       #519 <Class Dao$DaoObserver>
	//   10   28:invokeinterface #522 <Method void Dao$DaoObserver.onChange()>
	//*  11   33:goto            10
	//   12   36:return          
	}

	public String objectToString(Object obj)
		throws SQLException
	{
		return generatedTableMapper.objectToString(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//    2    4:aload_1         
	//    3    5:invokeinterface #526 <Method String GeneratedTableMapper.objectToString(Object)>
	//    4   10:areturn         
	}

	public boolean objectsEqual(Object obj, Object obj1)
		throws SQLException
	{
		return generatedTableMapper.objectsEqual(obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #531 <Method boolean GeneratedTableMapper.objectsEqual(Object, Object)>
	//    5   11:ireturn         
	}

	public Dao.QueryModifiers query(Query query1)
		throws SQLException
	{
		return ((Dao.QueryModifiers) (new QueryModifiersImpl(query1.getFromStatement(true), query1.getWhereStatement(true), query1.getParameters())));
	//    0    0:new             #17  <Class ModelDao$QueryModifiersImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:invokeinterface #423 <Method String Query.getFromStatement(boolean)>
	//    6   12:aload_1         
	//    7   13:iconst_1        
	//    8   14:invokeinterface #426 <Method String Query.getWhereStatement(boolean)>
	//    9   19:aload_1         
	//   10   20:invokeinterface #429 <Method String[] Query.getParameters()>
	//   11   25:invokespecial   #537 <Method void ModelDao$QueryModifiersImpl(ModelDao, String, String, String[])>
	//   12   28:areturn         
	}

	public Dao.QueryModifiers query(String s, String as[])
		throws SQLException
	{
		return ((Dao.QueryModifiers) (new QueryModifiersImpl(createDefaultFrom(), s, as)));
	//    0    0:new             #17  <Class ModelDao$QueryModifiersImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokespecial   #508 <Method String createDefaultFrom()>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #537 <Method void ModelDao$QueryModifiersImpl(ModelDao, String, String, String[])>
	//    8   14:areturn         
	}

	public Dao.QueryModifiers queryForAll()
		throws SQLException
	{
		return ((Dao.QueryModifiers) (new QueryModifiersImpl(createDefaultFrom(), ((String) (null)), ((String []) (null)))));
	//    0    0:new             #17  <Class ModelDao$QueryModifiersImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokespecial   #508 <Method String createDefaultFrom()>
	//    5    9:aconst_null     
	//    6   10:aconst_null     
	//    7   11:invokespecial   #537 <Method void ModelDao$QueryModifiersImpl(ModelDao, String, String, String[])>
	//    8   14:areturn         
	}

	public Dao.QueryModifiers queryForEq(String s, Object obj)
		throws SQLException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #67  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #68  <Method void ArrayList()>
	//    3    7:astore_3        
		Class class1 = generatedTableMapper.getTableConfig().dataClass;
	//    4    8:aload_0         
	//    5    9:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//    6   12:invokeinterface #94  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//    7   17:getfield        #548 <Field Class TableInfo.dataClass>
	//    8   20:astore          4
		s = ((String) (squeakyContext.findFieldType(class1, s)));
	//    9   22:aload_0         
	//   10   23:getfield        #84  <Field SqueakyContext squeakyContext>
	//   11   26:aload           4
	//   12   28:aload_1         
	//   13   29:invokevirtual   #552 <Method FieldType SqueakyContext.findFieldType(Class, String)>
	//   14   32:astore_1        
		SqlHelper.appendArgOrValue(squeakyContext, ((FieldType) (s)), ((List) (arraylist)), obj);
	//   15   33:aload_0         
	//   16   34:getfield        #84  <Field SqueakyContext squeakyContext>
	//   17   37:aload_1         
	//   18   38:aload_3         
	//   19   39:aload_2         
	//   20   40:invokestatic    #558 <Method void SqlHelper.appendArgOrValue(SqueakyContext, FieldType, List, Object)>
		obj = ((Object) (new StringBuilder()));
	//   21   43:new             #158 <Class StringBuilder>
	//   22   46:dup             
	//   23   47:invokespecial   #159 <Method void StringBuilder()>
	//   24   50:astore_2        
		SqlHelper.appendWhereClauseBody(((StringBuilder) (obj)), "t", "= ?", ((FieldType) (s)));
	//   25   51:aload_2         
	//   26   52:ldc1            #22  <String "t">
	//   27   54:ldc1            #25  <String "= ?">
	//   28   56:aload_1         
	//   29   57:invokestatic    #562 <Method void SqlHelper.appendWhereClauseBody(StringBuilder, String, String, FieldType)>
		return ((Dao.QueryModifiers) (new QueryModifiersImpl(createDefaultFrom(), ((StringBuilder) (obj)).toString(), (String[])((List) (arraylist)).toArray(((Object []) (new String[((List) (arraylist)).size()]))))));
	//   30   60:new             #17  <Class ModelDao$QueryModifiersImpl>
	//   31   63:dup             
	//   32   64:aload_0         
	//   33   65:aload_0         
	//   34   66:invokespecial   #508 <Method String createDefaultFrom()>
	//   35   69:aload_2         
	//   36   70:invokevirtual   #172 <Method String StringBuilder.toString()>
	//   37   73:aload_3         
	//   38   74:aload_3         
	//   39   75:invokeinterface #563 <Method int List.size()>
	//   40   80:anewarray       String[]
	//   41   83:invokeinterface #567 <Method Object[] List.toArray(Object[])>
	//   42   88:checkcast       #568 <Class String[]>
	//   43   91:invokespecial   #537 <Method void ModelDao$QueryModifiersImpl(ModelDao, String, String, String[])>
	//   44   94:areturn         
	}

	public Dao.QueryModifiers queryForFieldValues(Map map)
		throws SQLException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #158 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #159 <Method void StringBuilder()>
	//    3    7:astore_2        
		ArrayList arraylist = new ArrayList();
	//    4    8:new             #67  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #68  <Method void ArrayList()>
	//    7   15:astore_3        
		String s;
		Object obj;
		for(Iterator iterator1 = map.keySet().iterator(); iterator1.hasNext(); SqlHelper.appendArgOrValue(squeakyContext, ((FieldType) (obj)), ((List) (arraylist)), map.get(((Object) (s)))))
	//*   8   16:aload_1         
	//*   9   17:invokeinterface #577 <Method Set Map.keySet()>
	//*  10   22:invokeinterface #517 <Method Iterator Set.iterator()>
	//*  11   27:astore          4
	//*  12   29:aload           4
	//*  13   31:invokeinterface #348 <Method boolean Iterator.hasNext()>
	//*  14   36:ifeq            124
		{
			s = (String)iterator1.next();
	//   15   39:aload           4
	//   16   41:invokeinterface #352 <Method Object Iterator.next()>
	//   17   46:checkcast       #156 <Class String>
	//   18   49:astore          5
			if(stringbuilder.length() > 0)
	//*  19   51:aload_2         
	//*  20   52:invokevirtual   #580 <Method int StringBuilder.length()>
	//*  21   55:ifle            66
				stringbuilder.append(" and ");
	//   22   58:aload_2         
	//   23   59:ldc2            #582 <String " and ">
	//   24   62:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   25   65:pop             
			obj = ((Object) (generatedTableMapper.getTableConfig().dataClass));
	//   26   66:aload_0         
	//   27   67:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//   28   70:invokeinterface #94  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//   29   75:getfield        #548 <Field Class TableInfo.dataClass>
	//   30   78:astore          6
			obj = ((Object) (squeakyContext.findFieldType(((Class) (obj)), s)));
	//   31   80:aload_0         
	//   32   81:getfield        #84  <Field SqueakyContext squeakyContext>
	//   33   84:aload           6
	//   34   86:aload           5
	//   35   88:invokevirtual   #552 <Method FieldType SqueakyContext.findFieldType(Class, String)>
	//   36   91:astore          6
			SqlHelper.appendWhereClauseBody(stringbuilder, "t", "= ?", ((FieldType) (obj)));
	//   37   93:aload_2         
	//   38   94:ldc1            #22  <String "t">
	//   39   96:ldc1            #25  <String "= ?">
	//   40   98:aload           6
	//   41  100:invokestatic    #562 <Method void SqlHelper.appendWhereClauseBody(StringBuilder, String, String, FieldType)>
		}

	//   42  103:aload_0         
	//   43  104:getfield        #84  <Field SqueakyContext squeakyContext>
	//   44  107:aload           6
	//   45  109:aload_3         
	//   46  110:aload_1         
	//   47  111:aload           5
	//   48  113:invokeinterface #584 <Method Object Map.get(Object)>
	//   49  118:invokestatic    #558 <Method void SqlHelper.appendArgOrValue(SqueakyContext, FieldType, List, Object)>
	//*  50  121:goto            29
		return ((Dao.QueryModifiers) (new QueryModifiersImpl(createDefaultFrom(), stringbuilder.toString(), (String[])((List) (arraylist)).toArray(((Object []) (new String[((List) (arraylist)).size()]))))));
	//   51  124:new             #17  <Class ModelDao$QueryModifiersImpl>
	//   52  127:dup             
	//   53  128:aload_0         
	//   54  129:aload_0         
	//   55  130:invokespecial   #508 <Method String createDefaultFrom()>
	//   56  133:aload_2         
	//   57  134:invokevirtual   #172 <Method String StringBuilder.toString()>
	//   58  137:aload_3         
	//   59  138:aload_3         
	//   60  139:invokeinterface #563 <Method int List.size()>
	//   61  144:anewarray       String[]
	//   62  147:invokeinterface #567 <Method Object[] List.toArray(Object[])>
	//   63  152:checkcast       #568 <Class String[]>
	//   64  155:invokespecial   #537 <Method void ModelDao$QueryModifiersImpl(ModelDao, String, String, String[])>
	//   65  158:areturn         
	}

	public Object queryForId(Object obj)
		throws SQLException
	{
		obj = ((Object) (queryForEq(idFieldType.getColumnName(), obj).list()));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #111 <Field FieldType idFieldType>
	//    3    5:invokevirtual   #169 <Method String FieldType.getColumnName()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #587 <Method Dao$QueryModifiers queryForEq(String, Object)>
	//    6   12:invokeinterface #593 <Method List Dao$QueryModifiers.list()>
	//    7   17:astore_1        
		if(((List) (obj)).size() == 0)
	//*   8   18:aload_1         
	//*   9   19:invokeinterface #563 <Method int List.size()>
	//*  10   24:ifne            29
			return ((Object) (null));
	//   11   27:aconst_null     
	//   12   28:areturn         
		else
			return ((List) (obj)).get(0);
	//   13   29:aload_1         
	//   14   30:iconst_0        
	//   15   31:invokeinterface #596 <Method Object List.get(int)>
	//   16   36:areturn         
	}

	public transient long queryRawValue(String s, String as[])
		throws SQLException
	{
		return squeakyContext.getDatabase().longForQuery(s, as);
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field SqueakyContext squeakyContext>
	//    2    4:invokevirtual   #249 <Method SQLiteDatabase SqueakyContext.getDatabase()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #602 <Method long SQLiteDatabase.longForQuery(String, String[])>
	//    6   14:lreturn         
	}

	public void refresh(Object obj)
		throws SQLException
	{
		refresh(obj, generateDefaultForeignRefreshMap());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokespecial   #145 <Method Dao$ForeignRefresh[] generateDefaultForeignRefreshMap()>
	//    4    6:invokevirtual   #606 <Method void refresh(Object, Dao$ForeignRefresh[])>
	//    5    9:return          
	}

	public void refresh(Object obj, Dao.ForeignRefresh aforeignrefresh[])
		throws SQLException
	{
		Cursor cursor = makeCursor(createDefaultFrom(), (new StringBuilder()).append(idFieldType.getColumnName()).append(" = ?").toString(), new String[] {
			generatedTableMapper.extractId(obj).toString()
		}, ((String) (null)), ((Integer) (null)), ((Integer) (null)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #508 <Method String createDefaultFrom()>
	//    3    5:new             #158 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #159 <Method void StringBuilder()>
	//    6   12:aload_0         
	//    7   13:getfield        #111 <Field FieldType idFieldType>
	//    8   16:invokevirtual   #169 <Method String FieldType.getColumnName()>
	//    9   19:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:ldc2            #332 <String " = ?">
	//   11   25:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:invokevirtual   #172 <Method String StringBuilder.toString()>
	//   13   31:iconst_1        
	//   14   32:anewarray       String[]
	//   15   35:dup             
	//   16   36:iconst_0        
	//   17   37:aload_0         
	//   18   38:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//   19   41:aload_1         
	//   20   42:invokeinterface #401 <Method Object GeneratedTableMapper.extractId(Object)>
	//   21   47:invokevirtual   #453 <Method String Object.toString()>
	//   22   50:aastore         
	//   23   51:aconst_null     
	//   24   52:aconst_null     
	//   25   53:aconst_null     
	//   26   54:invokespecial   #300 <Method Cursor makeCursor(String, String, String[], String, Integer, Integer)>
	//   27   57:astore          4
		boolean flag;
		if(cursor.moveToFirst())
	//*  28   59:aload           4
	//*  29   61:invokeinterface #305 <Method boolean Cursor.moveToFirst()>
	//*  30   66:ifeq            96
			do
			{
				generatedTableMapper.fillRow(obj, cursor, this, aforeignrefresh, ((TransientCache) (null)));
	//   31   69:aload_0         
	//   32   70:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//   33   73:aload_1         
	//   34   74:aload           4
	//   35   76:aload_0         
	//   36   77:aload_2         
	//   37   78:aconst_null     
	//   38   79:invokeinterface #313 <Method void GeneratedTableMapper.fillRow(Object, Cursor, ModelDao, Dao$ForeignRefresh[], TransientCache)>
				flag = cursor.moveToNext();
	//   39   84:aload           4
	//   40   86:invokeinterface #322 <Method boolean Cursor.moveToNext()>
	//   41   91:istore_3        
			} while(flag);
	//   42   92:iload_3         
	//   43   93:ifne            69
		cursor.close();
	//   44   96:aload           4
	//   45   98:invokeinterface #325 <Method void Cursor.close()>
		return;
	//   46  103:return          
		obj;
	//   47  104:astore_1        
		cursor.close();
	//   48  105:aload           4
	//   49  107:invokeinterface #325 <Method void Cursor.close()>
		throw obj;
	//   50  112:aload_1         
	//   51  113:athrow          
	}

	public void registerObserver(Dao.DaoObserver daoobserver)
	{
		daoObserverSet.add(((Object) (daoobserver)));
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Set daoObserverSet>
	//    2    4:aload_1         
	//    3    5:invokeinterface #610 <Method boolean Set.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void unregisterObserver(Dao.DaoObserver daoobserver)
	{
		daoObserverSet.remove(((Object) (daoobserver)));
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Set daoObserverSet>
	//    2    4:aload_1         
	//    3    5:invokeinterface #614 <Method boolean Set.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public int update(Query query1, Map map)
		throws SQLException
	{
		SQLiteDatabase sqlitedatabase = squeakyContext.getDatabase();
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field SqueakyContext squeakyContext>
	//    2    4:invokevirtual   #249 <Method SQLiteDatabase SqueakyContext.getDatabase()>
	//    3    7:astore          4
		ContentValues contentvalues = new ContentValues();
	//    4    9:new             #183 <Class ContentValues>
	//    5   12:dup             
	//    6   13:invokespecial   #616 <Method void ContentValues()>
	//    7   16:astore          5
		String s;
		FieldType fieldtype;
		for(Iterator iterator1 = map.keySet().iterator(); iterator1.hasNext(); fillContentVal(contentvalues, fieldtype, ((Object) (SqlHelper.pullArgOrValue(squeakyContext, fieldtype, map.get(((Object) (s))))))))
	//*   8   18:aload_2         
	//*   9   19:invokeinterface #577 <Method Set Map.keySet()>
	//*  10   24:invokeinterface #517 <Method Iterator Set.iterator()>
	//*  11   29:astore          6
	//*  12   31:aload           6
	//*  13   33:invokeinterface #348 <Method boolean Iterator.hasNext()>
	//*  14   38:ifeq            104
		{
			s = (String)iterator1.next();
	//   15   41:aload           6
	//   16   43:invokeinterface #352 <Method Object Iterator.next()>
	//   17   48:checkcast       #156 <Class String>
	//   18   51:astore          7
			fieldtype = squeakyContext.findFieldType(generatedTableMapper.getTableConfig().dataClass, s);
	//   19   53:aload_0         
	//   20   54:getfield        #84  <Field SqueakyContext squeakyContext>
	//   21   57:aload_0         
	//   22   58:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//   23   61:invokeinterface #94  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//   24   66:getfield        #548 <Field Class TableInfo.dataClass>
	//   25   69:aload           7
	//   26   71:invokevirtual   #552 <Method FieldType SqueakyContext.findFieldType(Class, String)>
	//   27   74:astore          8
		}

	//   28   76:aload_0         
	//   29   77:aload           5
	//   30   79:aload           8
	//   31   81:aload_0         
	//   32   82:getfield        #84  <Field SqueakyContext squeakyContext>
	//   33   85:aload           8
	//   34   87:aload_2         
	//   35   88:aload           7
	//   36   90:invokeinterface #584 <Method Object Map.get(Object)>
	//   37   95:invokestatic    #620 <Method String SqlHelper.pullArgOrValue(SqueakyContext, FieldType, Object)>
	//   38   98:invokespecial   #622 <Method void fillContentVal(ContentValues, FieldType, Object)>
	//*  39  101:goto            31
		int i = sqlitedatabase.update(generatedTableMapper.getTableConfig().getTableName(), contentvalues, query1.getWhereStatement(false), query1.getParameters());
	//   40  104:aload           4
	//   41  106:aload_0         
	//   42  107:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//   43  110:invokeinterface #94  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//   44  115:invokevirtual   #176 <Method String TableInfo.getTableName()>
	//   45  118:aload           5
	//   46  120:aload_1         
	//   47  121:iconst_0        
	//   48  122:invokeinterface #426 <Method String Query.getWhereStatement(boolean)>
	//   49  127:aload_1         
	//   50  128:invokeinterface #429 <Method String[] Query.getParameters()>
	//   51  133:invokeinterface #625 <Method int SQLiteDatabase.update(String, ContentValues, String, String[])>
	//   52  138:istore_3        
		notifyChanges();
	//   53  139:aload_0         
	//   54  140:invokevirtual   #390 <Method void notifyChanges()>
		return i;
	//   55  143:iload_3         
	//   56  144:ireturn         
	}

	public void update(Object obj)
		throws SQLException
	{
		SQLiteStatement sqlitestatement = (SQLiteStatement)updateStatement.get();
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field ThreadLocal updateStatement>
	//    2    4:invokevirtual   #372 <Method Object ThreadLocal.get()>
	//    3    7:checkcast       #354 <Class SQLiteStatement>
	//    4   10:astore_2        
		generatedTableMapper.bindVals(sqlitestatement, obj);
	//    5   11:aload_0         
	//    6   12:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//    7   15:aload_2         
	//    8   16:aload_1         
	//    9   17:invokeinterface #629 <Method void GeneratedTableMapper.bindVals(SQLiteStatement, Object)>
		sqlitestatement.executeUpdateDelete();
	//   10   22:aload_2         
	//   11   23:invokeinterface #632 <Method long SQLiteStatement.executeUpdateDelete()>
	//   12   28:pop2            
		notifyChanges();
	//   13   29:aload_0         
	//   14   30:invokevirtual   #390 <Method void notifyChanges()>
	//   15   33:return          
	}

	public int updateId(Object obj, Object obj1)
		throws SQLException
	{
		SQLiteDatabase sqlitedatabase = squeakyContext.getDatabase();
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field SqueakyContext squeakyContext>
	//    2    4:invokevirtual   #249 <Method SQLiteDatabase SqueakyContext.getDatabase()>
	//    3    7:astore          4
		ContentValues contentvalues = new ContentValues();
	//    4    9:new             #183 <Class ContentValues>
	//    5   12:dup             
	//    6   13:invokespecial   #616 <Method void ContentValues()>
	//    7   16:astore          5
		fillContentVal(contentvalues, idFieldType, obj1);
	//    8   18:aload_0         
	//    9   19:aload           5
	//   10   21:aload_0         
	//   11   22:getfield        #111 <Field FieldType idFieldType>
	//   12   25:aload_2         
	//   13   26:invokespecial   #622 <Method void fillContentVal(ContentValues, FieldType, Object)>
		int i = sqlitedatabase.update(generatedTableMapper.getTableConfig().getTableName(), contentvalues, (new StringBuilder()).append(idFieldType.getColumnName()).append(" = ?").toString(), new String[] {
			generatedTableMapper.extractId(obj).toString()
		});
	//   14   29:aload           4
	//   15   31:aload_0         
	//   16   32:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//   17   35:invokeinterface #94  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//   18   40:invokevirtual   #176 <Method String TableInfo.getTableName()>
	//   19   43:aload           5
	//   20   45:new             #158 <Class StringBuilder>
	//   21   48:dup             
	//   22   49:invokespecial   #159 <Method void StringBuilder()>
	//   23   52:aload_0         
	//   24   53:getfield        #111 <Field FieldType idFieldType>
	//   25   56:invokevirtual   #169 <Method String FieldType.getColumnName()>
	//   26   59:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   27   62:ldc2            #332 <String " = ?">
	//   28   65:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   29   68:invokevirtual   #172 <Method String StringBuilder.toString()>
	//   30   71:iconst_1        
	//   31   72:anewarray       String[]
	//   32   75:dup             
	//   33   76:iconst_0        
	//   34   77:aload_0         
	//   35   78:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//   36   81:aload_1         
	//   37   82:invokeinterface #401 <Method Object GeneratedTableMapper.extractId(Object)>
	//   38   87:invokevirtual   #453 <Method String Object.toString()>
	//   39   90:aastore         
	//   40   91:invokeinterface #625 <Method int SQLiteDatabase.update(String, ContentValues, String, String[])>
	//   41   96:istore_3        
		notifyChanges();
	//   42   97:aload_0         
	//   43   98:invokevirtual   #390 <Method void notifyChanges()>
		return i;
	//   44  101:iload_3         
	//   45  102:ireturn         
	}

	public static final String DEFAULT_TABLE_PREFIX = "t";
	public static final String EQ_OPERATION = "= ?";
	private ThreadLocal createStatement;
	private final Set daoObserverSet;
	private final Class entityClass;
	private final GeneratedTableMapper generatedTableMapper;
	private final FieldType idFieldType;
	private final SqueakyContext squeakyContext;
	private final List statementList;
	private final String tableCols[];
	private ThreadLocal updateStatement;


/*
	static SQLiteStatement access$000(ModelDao modeldao)
	{
		return modeldao.makeCreateStatement();
	//    0    0:aload_0         
	//    1    1:invokespecial   #131 <Method SQLiteStatement makeCreateStatement()>
	//    2    4:areturn         
	}

*/


/*
	static List access$100(ModelDao modeldao)
	{
		return modeldao.statementList;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field List statementList>
	//    2    4:areturn         
	}

*/


/*
	static SQLiteStatement access$200(ModelDao modeldao)
	{
		return modeldao.makeUpdateStatement();
	//    0    0:aload_0         
	//    1    1:invokespecial   #137 <Method SQLiteStatement makeUpdateStatement()>
	//    2    4:areturn         
	}

*/


/*
	static Dao.ForeignRefresh[] access$300(ModelDao modeldao)
		throws SQLException
	{
		return modeldao.generateDefaultForeignRefreshMap();
	//    0    0:aload_0         
	//    1    1:invokespecial   #145 <Method Dao$ForeignRefresh[] generateDefaultForeignRefreshMap()>
	//    2    4:areturn         
	}

*/


/*
	static List access$400(ModelDao modeldao, String s, String s1, String as[], String s2, Integer integer, Integer integer1, Dao.ForeignRefresh aforeignrefresh[])
		throws SQLException
	{
		return modeldao.makeCursorResults(s, s1, as, s2, integer, integer1, aforeignrefresh);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:invokespecial   #152 <Method List makeCursorResults(String, String, String[], String, Integer, Integer, Dao$ForeignRefresh[])>
	//    9   15:areturn         
	}

*/


/*
	static GeneratedTableMapper access$500(ModelDao modeldao)
	{
		return modeldao.generatedTableMapper;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field GeneratedTableMapper generatedTableMapper>
	//    2    4:areturn         
	}

*/
}
