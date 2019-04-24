// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package net.sqlcipher.database;

import android.util.Log;
import java.util.Map;

// Referenced classes of package net.sqlcipher.database:
//			SQLiteClosable, SQLiteDatabase, SQLiteCompiledSql, SQLiteDebug

public abstract class SQLiteProgram extends SQLiteClosable
{

	SQLiteProgram(SQLiteDatabase sqlitedatabase, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void SQLiteClosable()>
		nHandle = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #24  <Field int nHandle>
		nStatement = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #26  <Field int nStatement>
		mDatabase = sqlitedatabase;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #28  <Field SQLiteDatabase mDatabase>
		mSql = s.trim();
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:invokevirtual   #34  <Method String String.trim()>
	//   14   24:putfield        #36  <Field String mSql>
		sqlitedatabase.acquireReference();
	//   15   27:aload_1         
	//   16   28:invokevirtual   #41  <Method void SQLiteDatabase.acquireReference()>
		sqlitedatabase.addSQLiteClosable(((SQLiteClosable) (this)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:invokevirtual   #45  <Method void SQLiteDatabase.addSQLiteClosable(SQLiteClosable)>
		nHandle = sqlitedatabase.mNativeHandle;
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:getfield        #48  <Field int SQLiteDatabase.mNativeHandle>
	//   23   41:putfield        #24  <Field int nHandle>
		String s1 = mSql.substring(0, 6);
	//   24   44:aload_0         
	//   25   45:getfield        #36  <Field String mSql>
	//   26   48:iconst_0        
	//   27   49:bipush          6
	//   28   51:invokevirtual   #52  <Method String String.substring(int, int)>
	//   29   54:astore          4
		if(!s1.equalsIgnoreCase("INSERT") && !s1.equalsIgnoreCase("UPDATE") && !s1.equalsIgnoreCase("REPLAC") && !s1.equalsIgnoreCase("DELETE") && !s1.equalsIgnoreCase("SELECT"))
	//*  30   56:aload           4
	//*  31   58:ldc1            #54  <String "INSERT">
	//*  32   60:invokevirtual   #58  <Method boolean String.equalsIgnoreCase(String)>
	//*  33   63:ifne            131
	//*  34   66:aload           4
	//*  35   68:ldc1            #60  <String "UPDATE">
	//*  36   70:invokevirtual   #58  <Method boolean String.equalsIgnoreCase(String)>
	//*  37   73:ifne            131
	//*  38   76:aload           4
	//*  39   78:ldc1            #62  <String "REPLAC">
	//*  40   80:invokevirtual   #58  <Method boolean String.equalsIgnoreCase(String)>
	//*  41   83:ifne            131
	//*  42   86:aload           4
	//*  43   88:ldc1            #64  <String "DELETE">
	//*  44   90:invokevirtual   #58  <Method boolean String.equalsIgnoreCase(String)>
	//*  45   93:ifne            131
	//*  46   96:aload           4
	//*  47   98:ldc1            #66  <String "SELECT">
	//*  48  100:invokevirtual   #58  <Method boolean String.equalsIgnoreCase(String)>
	//*  49  103:ifne            131
		{
			mCompiledSql = new SQLiteCompiledSql(sqlitedatabase, s);
	//   50  106:aload_0         
	//   51  107:new             #68  <Class SQLiteCompiledSql>
	//   52  110:dup             
	//   53  111:aload_1         
	//   54  112:aload_2         
	//   55  113:invokespecial   #70  <Method void SQLiteCompiledSql(SQLiteDatabase, String)>
	//   56  116:putfield        #72  <Field SQLiteCompiledSql mCompiledSql>
			nStatement = mCompiledSql.nStatement;
	//   57  119:aload_0         
	//   58  120:aload_0         
	//   59  121:getfield        #72  <Field SQLiteCompiledSql mCompiledSql>
	//   60  124:getfield        #73  <Field int SQLiteCompiledSql.nStatement>
	//   61  127:putfield        #26  <Field int nStatement>
			return;
	//   62  130:return          
		}
		mCompiledSql = sqlitedatabase.getCompiledStatementForSql(s);
	//   63  131:aload_0         
	//   64  132:aload_1         
	//   65  133:aload_2         
	//   66  134:invokevirtual   #77  <Method SQLiteCompiledSql SQLiteDatabase.getCompiledStatementForSql(String)>
	//   67  137:putfield        #72  <Field SQLiteCompiledSql mCompiledSql>
		if(mCompiledSql != null) goto _L2; else goto _L1
	//   68  140:aload_0         
	//   69  141:getfield        #72  <Field SQLiteCompiledSql mCompiledSql>
	//   70  144:ifnonnull       235
_L1:
		mCompiledSql = new SQLiteCompiledSql(sqlitedatabase, s);
	//   71  147:aload_0         
	//   72  148:new             #68  <Class SQLiteCompiledSql>
	//   73  151:dup             
	//   74  152:aload_1         
	//   75  153:aload_2         
	//   76  154:invokespecial   #70  <Method void SQLiteCompiledSql(SQLiteDatabase, String)>
	//   77  157:putfield        #72  <Field SQLiteCompiledSql mCompiledSql>
		mCompiledSql.acquire();
	//   78  160:aload_0         
	//   79  161:getfield        #72  <Field SQLiteCompiledSql mCompiledSql>
	//   80  164:invokevirtual   #81  <Method boolean SQLiteCompiledSql.acquire()>
	//   81  167:pop             
		sqlitedatabase.addToCompiledQueries(s, mCompiledSql);
	//   82  168:aload_1         
	//   83  169:aload_2         
	//   84  170:aload_0         
	//   85  171:getfield        #72  <Field SQLiteCompiledSql mCompiledSql>
	//   86  174:invokevirtual   #85  <Method void SQLiteDatabase.addToCompiledQueries(String, SQLiteCompiledSql)>
		if(SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION)
	//*  87  177:getstatic       #91  <Field boolean SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION>
	//*  88  180:ifeq            223
			Log.v("SQLiteProgram", (new StringBuilder()).append("Created DbObj (id#").append(mCompiledSql.nStatement).append(") for sql: ").append(s).toString());
	//   89  183:ldc1            #8   <String "SQLiteProgram">
	//   90  185:new             #93  <Class StringBuilder>
	//   91  188:dup             
	//   92  189:invokespecial   #94  <Method void StringBuilder()>
	//   93  192:ldc1            #96  <String "Created DbObj (id#">
	//   94  194:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   95  197:aload_0         
	//   96  198:getfield        #72  <Field SQLiteCompiledSql mCompiledSql>
	//   97  201:getfield        #73  <Field int SQLiteCompiledSql.nStatement>
	//   98  204:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
	//   99  207:ldc1            #105 <String ") for sql: ">
	//  100  209:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  101  212:aload_2         
	//  102  213:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  103  216:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  104  219:invokestatic    #114 <Method int Log.v(String, String)>
	//  105  222:pop             
_L4:
		nStatement = mCompiledSql.nStatement;
	//  106  223:aload_0         
	//  107  224:aload_0         
	//  108  225:getfield        #72  <Field SQLiteCompiledSql mCompiledSql>
	//  109  228:getfield        #73  <Field int SQLiteCompiledSql.nStatement>
	//  110  231:putfield        #26  <Field int nStatement>
		return;
	//  111  234:return          
_L2:
		if(!mCompiledSql.acquire())
	//* 112  235:aload_0         
	//* 113  236:getfield        #72  <Field SQLiteCompiledSql mCompiledSql>
	//* 114  239:invokevirtual   #81  <Method boolean SQLiteCompiledSql.acquire()>
	//* 115  242:ifne            223
		{
			int i = mCompiledSql.nStatement;
	//  116  245:aload_0         
	//  117  246:getfield        #72  <Field SQLiteCompiledSql mCompiledSql>
	//  118  249:getfield        #73  <Field int SQLiteCompiledSql.nStatement>
	//  119  252:istore_3        
			mCompiledSql = new SQLiteCompiledSql(sqlitedatabase, s);
	//  120  253:aload_0         
	//  121  254:new             #68  <Class SQLiteCompiledSql>
	//  122  257:dup             
	//  123  258:aload_1         
	//  124  259:aload_2         
	//  125  260:invokespecial   #70  <Method void SQLiteCompiledSql(SQLiteDatabase, String)>
	//  126  263:putfield        #72  <Field SQLiteCompiledSql mCompiledSql>
			if(SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION)
	//* 127  266:getstatic       #91  <Field boolean SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION>
	//* 128  269:ifeq            223
				Log.v("SQLiteProgram", (new StringBuilder()).append("** possible bug ** Created NEW DbObj (id#").append(mCompiledSql.nStatement).append(") because the previously created DbObj (id#").append(i).append(") was not released for sql:").append(s).toString());
	//  129  272:ldc1            #8   <String "SQLiteProgram">
	//  130  274:new             #93  <Class StringBuilder>
	//  131  277:dup             
	//  132  278:invokespecial   #94  <Method void StringBuilder()>
	//  133  281:ldc1            #116 <String "** possible bug ** Created NEW DbObj (id#">
	//  134  283:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  135  286:aload_0         
	//  136  287:getfield        #72  <Field SQLiteCompiledSql mCompiledSql>
	//  137  290:getfield        #73  <Field int SQLiteCompiledSql.nStatement>
	//  138  293:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
	//  139  296:ldc1            #118 <String ") because the previously created DbObj (id#">
	//  140  298:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  141  301:iload_3         
	//  142  302:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
	//  143  305:ldc1            #120 <String ") was not released for sql:">
	//  144  307:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  145  310:aload_2         
	//  146  311:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  147  314:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  148  317:invokestatic    #114 <Method int Log.v(String, String)>
	//  149  320:pop             
		}
		if(true) goto _L4; else goto _L3
	//  150  321:goto            223
_L3:
	}

	private final native void native_clear_bindings();

	private void releaseCompiledSqlIfNotInCache()
	{
		if(mCompiledSql == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field SQLiteCompiledSql mCompiledSql>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		Map map = mDatabase.mCompiledQueries;
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field SQLiteDatabase mDatabase>
	//    6   12:getfield        #127 <Field Map SQLiteDatabase.mCompiledQueries>
	//    7   15:astore_1        
		map;
	//    8   16:aload_1         
		JVM INSTR monitorenter ;
	//    9   17:monitorenter    
		if(mDatabase.mCompiledQueries.containsValue(((Object) (mCompiledSql))))
			break MISSING_BLOCK_LABEL_62;
	//   10   18:aload_0         
	//   11   19:getfield        #28  <Field SQLiteDatabase mDatabase>
	//   12   22:getfield        #127 <Field Map SQLiteDatabase.mCompiledQueries>
	//   13   25:aload_0         
	//   14   26:getfield        #72  <Field SQLiteCompiledSql mCompiledSql>
	//   15   29:invokeinterface #133 <Method boolean Map.containsValue(Object)>
	//   16   34:ifne            62
		mCompiledSql.releaseSqlStatement();
	//   17   37:aload_0         
	//   18   38:getfield        #72  <Field SQLiteCompiledSql mCompiledSql>
	//   19   41:invokevirtual   #136 <Method void SQLiteCompiledSql.releaseSqlStatement()>
		mCompiledSql = null;
	//   20   44:aload_0         
	//   21   45:aconst_null     
	//   22   46:putfield        #72  <Field SQLiteCompiledSql mCompiledSql>
		nStatement = 0;
	//   23   49:aload_0         
	//   24   50:iconst_0        
	//   25   51:putfield        #26  <Field int nStatement>
	//*  26   54:aload_1         
_L1:
		return;
	//   27   55:monitorexit     
	//   28   56:return          
		Exception exception;
		exception;
	//   29   57:astore_2        
		map;
	//   30   58:aload_1         
		JVM INSTR monitorexit ;
	//   31   59:monitorexit     
		throw exception;
	//   32   60:aload_2         
	//   33   61:athrow          
		mCompiledSql.release();
	//   34   62:aload_0         
	//   35   63:getfield        #72  <Field SQLiteCompiledSql mCompiledSql>
	//   36   66:invokevirtual   #139 <Method void SQLiteCompiledSql.release()>
		  goto _L1
	//*  37   69:goto            54
	}

	public void bindBlob(int i, byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       36
			throw new IllegalArgumentException((new StringBuilder()).append("the bind value at index ").append(i).append(" is null").toString());
	//    2    4:new             #143 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:new             #93  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #94  <Method void StringBuilder()>
	//    7   15:ldc1            #145 <String "the bind value at index ">
	//    8   17:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:iload_1         
	//   10   21:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
	//   11   24:ldc1            #147 <String " is null">
	//   12   26:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   14   32:invokespecial   #150 <Method void IllegalArgumentException(String)>
	//   15   35:athrow          
		if(!mDatabase.isOpen())
	//*  16   36:aload_0         
	//*  17   37:getfield        #28  <Field SQLiteDatabase mDatabase>
	//*  18   40:invokevirtual   #153 <Method boolean SQLiteDatabase.isOpen()>
	//*  19   43:ifne            84
			throw new IllegalStateException((new StringBuilder()).append("database ").append(mDatabase.getPath()).append(" already closed").toString());
	//   20   46:new             #155 <Class IllegalStateException>
	//   21   49:dup             
	//   22   50:new             #93  <Class StringBuilder>
	//   23   53:dup             
	//   24   54:invokespecial   #94  <Method void StringBuilder()>
	//   25   57:ldc1            #157 <String "database ">
	//   26   59:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   27   62:aload_0         
	//   28   63:getfield        #28  <Field SQLiteDatabase mDatabase>
	//   29   66:invokevirtual   #160 <Method String SQLiteDatabase.getPath()>
	//   30   69:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   31   72:ldc1            #162 <String " already closed">
	//   32   74:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   33   77:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   34   80:invokespecial   #163 <Method void IllegalStateException(String)>
	//   35   83:athrow          
		acquireReference();
	//   36   84:aload_0         
	//   37   85:invokevirtual   #164 <Method void acquireReference()>
		native_bind_blob(i, abyte0);
	//   38   88:aload_0         
	//   39   89:iload_1         
	//   40   90:aload_2         
	//   41   91:invokevirtual   #167 <Method void native_bind_blob(int, byte[])>
		releaseReference();
	//   42   94:aload_0         
	//   43   95:invokevirtual   #170 <Method void releaseReference()>
		return;
	//   44   98:return          
		abyte0;
	//   45   99:astore_2        
		releaseReference();
	//   46  100:aload_0         
	//   47  101:invokevirtual   #170 <Method void releaseReference()>
		throw abyte0;
	//   48  104:aload_2         
	//   49  105:athrow          
	}

	public void bindDouble(int i, double d)
	{
		if(!mDatabase.isOpen())
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field SQLiteDatabase mDatabase>
	//*   2    4:invokevirtual   #153 <Method boolean SQLiteDatabase.isOpen()>
	//*   3    7:ifne            48
			throw new IllegalStateException((new StringBuilder()).append("database ").append(mDatabase.getPath()).append(" already closed").toString());
	//    4   10:new             #155 <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:new             #93  <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #94  <Method void StringBuilder()>
	//    9   21:ldc1            #157 <String "database ">
	//   10   23:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:aload_0         
	//   12   27:getfield        #28  <Field SQLiteDatabase mDatabase>
	//   13   30:invokevirtual   #160 <Method String SQLiteDatabase.getPath()>
	//   14   33:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:ldc1            #162 <String " already closed">
	//   16   38:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   17   41:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   18   44:invokespecial   #163 <Method void IllegalStateException(String)>
	//   19   47:athrow          
		acquireReference();
	//   20   48:aload_0         
	//   21   49:invokevirtual   #164 <Method void acquireReference()>
		native_bind_double(i, d);
	//   22   52:aload_0         
	//   23   53:iload_1         
	//   24   54:dload_2         
	//   25   55:invokevirtual   #175 <Method void native_bind_double(int, double)>
		releaseReference();
	//   26   58:aload_0         
	//   27   59:invokevirtual   #170 <Method void releaseReference()>
		return;
	//   28   62:return          
		Exception exception;
		exception;
	//   29   63:astore          4
		releaseReference();
	//   30   65:aload_0         
	//   31   66:invokevirtual   #170 <Method void releaseReference()>
		throw exception;
	//   32   69:aload           4
	//   33   71:athrow          
	}

	public void bindLong(int i, long l)
	{
		if(!mDatabase.isOpen())
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field SQLiteDatabase mDatabase>
	//*   2    4:invokevirtual   #153 <Method boolean SQLiteDatabase.isOpen()>
	//*   3    7:ifne            48
			throw new IllegalStateException((new StringBuilder()).append("database ").append(mDatabase.getPath()).append(" already closed").toString());
	//    4   10:new             #155 <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:new             #93  <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #94  <Method void StringBuilder()>
	//    9   21:ldc1            #157 <String "database ">
	//   10   23:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:aload_0         
	//   12   27:getfield        #28  <Field SQLiteDatabase mDatabase>
	//   13   30:invokevirtual   #160 <Method String SQLiteDatabase.getPath()>
	//   14   33:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:ldc1            #162 <String " already closed">
	//   16   38:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   17   41:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   18   44:invokespecial   #163 <Method void IllegalStateException(String)>
	//   19   47:athrow          
		acquireReference();
	//   20   48:aload_0         
	//   21   49:invokevirtual   #164 <Method void acquireReference()>
		native_bind_long(i, l);
	//   22   52:aload_0         
	//   23   53:iload_1         
	//   24   54:lload_2         
	//   25   55:invokevirtual   #180 <Method void native_bind_long(int, long)>
		releaseReference();
	//   26   58:aload_0         
	//   27   59:invokevirtual   #170 <Method void releaseReference()>
		return;
	//   28   62:return          
		Exception exception;
		exception;
	//   29   63:astore          4
		releaseReference();
	//   30   65:aload_0         
	//   31   66:invokevirtual   #170 <Method void releaseReference()>
		throw exception;
	//   32   69:aload           4
	//   33   71:athrow          
	}

	public void bindNull(int i)
	{
		if(!mDatabase.isOpen())
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field SQLiteDatabase mDatabase>
	//*   2    4:invokevirtual   #153 <Method boolean SQLiteDatabase.isOpen()>
	//*   3    7:ifne            48
			throw new IllegalStateException((new StringBuilder()).append("database ").append(mDatabase.getPath()).append(" already closed").toString());
	//    4   10:new             #155 <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:new             #93  <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #94  <Method void StringBuilder()>
	//    9   21:ldc1            #157 <String "database ">
	//   10   23:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:aload_0         
	//   12   27:getfield        #28  <Field SQLiteDatabase mDatabase>
	//   13   30:invokevirtual   #160 <Method String SQLiteDatabase.getPath()>
	//   14   33:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:ldc1            #162 <String " already closed">
	//   16   38:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   17   41:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   18   44:invokespecial   #163 <Method void IllegalStateException(String)>
	//   19   47:athrow          
		acquireReference();
	//   20   48:aload_0         
	//   21   49:invokevirtual   #164 <Method void acquireReference()>
		native_bind_null(i);
	//   22   52:aload_0         
	//   23   53:iload_1         
	//   24   54:invokevirtual   #185 <Method void native_bind_null(int)>
		releaseReference();
	//   25   57:aload_0         
	//   26   58:invokevirtual   #170 <Method void releaseReference()>
		return;
	//   27   61:return          
		Exception exception;
		exception;
	//   28   62:astore_2        
		releaseReference();
	//   29   63:aload_0         
	//   30   64:invokevirtual   #170 <Method void releaseReference()>
		throw exception;
	//   31   67:aload_2         
	//   32   68:athrow          
	}

	public void bindString(int i, String s)
	{
		if(s == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       36
			throw new IllegalArgumentException((new StringBuilder()).append("the bind value at index ").append(i).append(" is null").toString());
	//    2    4:new             #143 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:new             #93  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #94  <Method void StringBuilder()>
	//    7   15:ldc1            #145 <String "the bind value at index ">
	//    8   17:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:iload_1         
	//   10   21:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
	//   11   24:ldc1            #147 <String " is null">
	//   12   26:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   14   32:invokespecial   #150 <Method void IllegalArgumentException(String)>
	//   15   35:athrow          
		if(!mDatabase.isOpen())
	//*  16   36:aload_0         
	//*  17   37:getfield        #28  <Field SQLiteDatabase mDatabase>
	//*  18   40:invokevirtual   #153 <Method boolean SQLiteDatabase.isOpen()>
	//*  19   43:ifne            84
			throw new IllegalStateException((new StringBuilder()).append("database ").append(mDatabase.getPath()).append(" already closed").toString());
	//   20   46:new             #155 <Class IllegalStateException>
	//   21   49:dup             
	//   22   50:new             #93  <Class StringBuilder>
	//   23   53:dup             
	//   24   54:invokespecial   #94  <Method void StringBuilder()>
	//   25   57:ldc1            #157 <String "database ">
	//   26   59:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   27   62:aload_0         
	//   28   63:getfield        #28  <Field SQLiteDatabase mDatabase>
	//   29   66:invokevirtual   #160 <Method String SQLiteDatabase.getPath()>
	//   30   69:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   31   72:ldc1            #162 <String " already closed">
	//   32   74:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   33   77:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   34   80:invokespecial   #163 <Method void IllegalStateException(String)>
	//   35   83:athrow          
		acquireReference();
	//   36   84:aload_0         
	//   37   85:invokevirtual   #164 <Method void acquireReference()>
		native_bind_string(i, s);
	//   38   88:aload_0         
	//   39   89:iload_1         
	//   40   90:aload_2         
	//   41   91:invokevirtual   #190 <Method void native_bind_string(int, String)>
		releaseReference();
	//   42   94:aload_0         
	//   43   95:invokevirtual   #170 <Method void releaseReference()>
		return;
	//   44   98:return          
		s;
	//   45   99:astore_2        
		releaseReference();
	//   46  100:aload_0         
	//   47  101:invokevirtual   #170 <Method void releaseReference()>
		throw s;
	//   48  104:aload_2         
	//   49  105:athrow          
	}

	public void clearBindings()
	{
		if(!mDatabase.isOpen())
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field SQLiteDatabase mDatabase>
	//*   2    4:invokevirtual   #153 <Method boolean SQLiteDatabase.isOpen()>
	//*   3    7:ifne            48
			throw new IllegalStateException((new StringBuilder()).append("database ").append(mDatabase.getPath()).append(" already closed").toString());
	//    4   10:new             #155 <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:new             #93  <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #94  <Method void StringBuilder()>
	//    9   21:ldc1            #157 <String "database ">
	//   10   23:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:aload_0         
	//   12   27:getfield        #28  <Field SQLiteDatabase mDatabase>
	//   13   30:invokevirtual   #160 <Method String SQLiteDatabase.getPath()>
	//   14   33:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:ldc1            #162 <String " already closed">
	//   16   38:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   17   41:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   18   44:invokespecial   #163 <Method void IllegalStateException(String)>
	//   19   47:athrow          
		acquireReference();
	//   20   48:aload_0         
	//   21   49:invokevirtual   #164 <Method void acquireReference()>
		native_clear_bindings();
	//   22   52:aload_0         
	//   23   53:invokespecial   #193 <Method void native_clear_bindings()>
		releaseReference();
	//   24   56:aload_0         
	//   25   57:invokevirtual   #170 <Method void releaseReference()>
		return;
	//   26   60:return          
		Exception exception;
		exception;
	//   27   61:astore_1        
		releaseReference();
	//   28   62:aload_0         
	//   29   63:invokevirtual   #170 <Method void releaseReference()>
		throw exception;
	//   30   66:aload_1         
	//   31   67:athrow          
	}

	public void close()
	{
		if(!mDatabase.isOpen())
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field SQLiteDatabase mDatabase>
	//*   2    4:invokevirtual   #153 <Method boolean SQLiteDatabase.isOpen()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		mDatabase.lock();
	//    5   11:aload_0         
	//    6   12:getfield        #28  <Field SQLiteDatabase mDatabase>
	//    7   15:invokevirtual   #197 <Method void SQLiteDatabase.lock()>
		releaseReference();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #170 <Method void releaseReference()>
		mDatabase.unlock();
	//   10   22:aload_0         
	//   11   23:getfield        #28  <Field SQLiteDatabase mDatabase>
	//   12   26:invokevirtual   #200 <Method void SQLiteDatabase.unlock()>
		return;
	//   13   29:return          
		Exception exception;
		exception;
	//   14   30:astore_1        
		mDatabase.unlock();
	//   15   31:aload_0         
	//   16   32:getfield        #28  <Field SQLiteDatabase mDatabase>
	//   17   35:invokevirtual   #200 <Method void SQLiteDatabase.unlock()>
		throw exception;
	//   18   38:aload_1         
	//   19   39:athrow          
	}

	protected void compile(String s, boolean flag)
	{
	//    0    0:return          
	}

	String getSqlString()
	{
		return mSql;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field String mSql>
	//    2    4:areturn         
	}

	public final int getUniqueId()
	{
		return nStatement;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int nStatement>
	//    2    4:ireturn         
	}

	protected final native void native_bind_blob(int i, byte abyte0[]);

	protected final native void native_bind_double(int i, double d);

	protected final native void native_bind_long(int i, long l);

	protected final native void native_bind_null(int i);

	protected final native void native_bind_string(int i, String s);

	protected final native void native_compile(String s);

	protected final native void native_finalize();

	protected void onAllReferencesReleased()
	{
		releaseCompiledSqlIfNotInCache();
	//    0    0:aload_0         
	//    1    1:invokespecial   #211 <Method void releaseCompiledSqlIfNotInCache()>
		mDatabase.releaseReference();
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field SQLiteDatabase mDatabase>
	//    4    8:invokevirtual   #212 <Method void SQLiteDatabase.releaseReference()>
		mDatabase.removeSQLiteClosable(((SQLiteClosable) (this)));
	//    5   11:aload_0         
	//    6   12:getfield        #28  <Field SQLiteDatabase mDatabase>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #215 <Method void SQLiteDatabase.removeSQLiteClosable(SQLiteClosable)>
	//    9   19:return          
	}

	protected void onAllReferencesReleasedFromContainer()
	{
		releaseCompiledSqlIfNotInCache();
	//    0    0:aload_0         
	//    1    1:invokespecial   #211 <Method void releaseCompiledSqlIfNotInCache()>
		mDatabase.releaseReference();
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field SQLiteDatabase mDatabase>
	//    4    8:invokevirtual   #212 <Method void SQLiteDatabase.releaseReference()>
	//    5   11:return          
	}

	private static final String TAG = "SQLiteProgram";
	private SQLiteCompiledSql mCompiledSql;
	protected SQLiteDatabase mDatabase;
	final String mSql;
	protected int nHandle;
	protected int nStatement;
}
