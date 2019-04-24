// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.android;

import android.database.sqlite.*;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.db.SQLBuilder;
import ch.qos.logback.classic.db.names.DBNameResolver;
import ch.qos.logback.classic.db.names.DefaultDBNameResolver;
import ch.qos.logback.classic.spi.*;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import ch.qos.logback.core.android.CommonPathUtil;
import ch.qos.logback.core.util.Duration;
import java.io.File;
import java.util.*;

// Referenced classes of package ch.qos.logback.classic.android:
//			SQLiteLogCleaner

public class SQLiteAppender extends UnsynchronizedAppenderBase
{

	public SQLiteAppender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void UnsynchronizedAppenderBase()>
		lastCleanupTime = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #54  <Field long lastCleanupTime>
	//    5    9:return          
	}

	private String asStringTruncatedTo254(Object obj)
	{
		Object obj1;
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
			obj1 = ((Object) (obj.toString()));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #67  <Method String Object.toString()>
	//    4    8:astore_2        
		else
	//*   5    9:goto            14
			obj1 = null;
	//    6   12:aconst_null     
	//    7   13:astore_2        
		obj = obj1;
	//    8   14:aload_2         
	//    9   15:astore_1        
		if(obj1 != null)
	//*  10   16:aload_2         
	//*  11   17:ifnull          41
		{
			obj = obj1;
	//   12   20:aload_2         
	//   13   21:astore_1        
			if(((String) (obj1)).length() > 254)
	//*  14   22:aload_2         
	//*  15   23:invokevirtual   #73  <Method int String.length()>
	//*  16   26:sipush          254
	//*  17   29:icmple          41
				obj = ((Object) (((String) (obj1)).substring(0, 254)));
	//   18   32:aload_2         
	//   19   33:iconst_0        
	//   20   34:sipush          254
	//   21   37:invokevirtual   #77  <Method String String.substring(int, int)>
	//   22   40:astore_1        
		}
		obj1 = obj;
	//   23   41:aload_1         
	//   24   42:astore_2        
		if(obj == null)
	//*  25   43:aload_1         
	//*  26   44:ifnonnull       50
			obj1 = "";
	//   27   47:ldc1            #79  <String "">
	//   28   49:astore_2        
		return ((String) (obj1));
	//   29   50:aload_2         
	//   30   51:areturn         
	}

	private void bindCallerData(SQLiteStatement sqlitestatement, StackTraceElement astacktraceelement[])
	{
		if(astacktraceelement != null && astacktraceelement.length > 0)
	//*   0    0:aload_2         
	//*   1    1:ifnull          60
	//*   2    4:aload_2         
	//*   3    5:arraylength     
	//*   4    6:ifle            60
		{
			astacktraceelement = ((StackTraceElement []) (astacktraceelement[0]));
	//    5    9:aload_2         
	//    6   10:iconst_0        
	//    7   11:aaload          
	//    8   12:astore_2        
			if(astacktraceelement != null)
	//*   9   13:aload_2         
	//*  10   14:ifnull          60
			{
				sqlitestatement.bindString(11, ((StackTraceElement) (astacktraceelement)).getFileName());
	//   11   17:aload_1         
	//   12   18:bipush          11
	//   13   20:aload_2         
	//   14   21:invokevirtual   #86  <Method String StackTraceElement.getFileName()>
	//   15   24:invokevirtual   #92  <Method void SQLiteStatement.bindString(int, String)>
				sqlitestatement.bindString(12, ((StackTraceElement) (astacktraceelement)).getClassName());
	//   16   27:aload_1         
	//   17   28:bipush          12
	//   18   30:aload_2         
	//   19   31:invokevirtual   #95  <Method String StackTraceElement.getClassName()>
	//   20   34:invokevirtual   #92  <Method void SQLiteStatement.bindString(int, String)>
				sqlitestatement.bindString(13, ((StackTraceElement) (astacktraceelement)).getMethodName());
	//   21   37:aload_1         
	//   22   38:bipush          13
	//   23   40:aload_2         
	//   24   41:invokevirtual   #98  <Method String StackTraceElement.getMethodName()>
	//   25   44:invokevirtual   #92  <Method void SQLiteStatement.bindString(int, String)>
				sqlitestatement.bindString(14, Integer.toString(((StackTraceElement) (astacktraceelement)).getLineNumber()));
	//   26   47:aload_1         
	//   27   48:bipush          14
	//   28   50:aload_2         
	//   29   51:invokevirtual   #101 <Method int StackTraceElement.getLineNumber()>
	//   30   54:invokestatic    #106 <Method String Integer.toString(int)>
	//   31   57:invokevirtual   #92  <Method void SQLiteStatement.bindString(int, String)>
			}
		}
	//   32   60:return          
	}

	private void bindLoggingEvent(SQLiteStatement sqlitestatement, ILoggingEvent iloggingevent)
	{
		sqlitestatement.bindLong(1, iloggingevent.getTimeStamp());
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:aload_2         
	//    3    3:invokeinterface #114 <Method long ILoggingEvent.getTimeStamp()>
	//    4    8:invokevirtual   #118 <Method void SQLiteStatement.bindLong(int, long)>
		sqlitestatement.bindString(2, iloggingevent.getFormattedMessage());
	//    5   11:aload_1         
	//    6   12:iconst_2        
	//    7   13:aload_2         
	//    8   14:invokeinterface #121 <Method String ILoggingEvent.getFormattedMessage()>
	//    9   19:invokevirtual   #92  <Method void SQLiteStatement.bindString(int, String)>
		sqlitestatement.bindString(3, iloggingevent.getLoggerName());
	//   10   22:aload_1         
	//   11   23:iconst_3        
	//   12   24:aload_2         
	//   13   25:invokeinterface #124 <Method String ILoggingEvent.getLoggerName()>
	//   14   30:invokevirtual   #92  <Method void SQLiteStatement.bindString(int, String)>
		sqlitestatement.bindString(4, iloggingevent.getLevel().toString());
	//   15   33:aload_1         
	//   16   34:iconst_4        
	//   17   35:aload_2         
	//   18   36:invokeinterface #128 <Method Level ILoggingEvent.getLevel()>
	//   19   41:invokevirtual   #131 <Method String Level.toString()>
	//   20   44:invokevirtual   #92  <Method void SQLiteStatement.bindString(int, String)>
		sqlitestatement.bindString(5, iloggingevent.getThreadName());
	//   21   47:aload_1         
	//   22   48:iconst_5        
	//   23   49:aload_2         
	//   24   50:invokeinterface #134 <Method String ILoggingEvent.getThreadName()>
	//   25   55:invokevirtual   #92  <Method void SQLiteStatement.bindString(int, String)>
		sqlitestatement.bindLong(6, computeReferenceMask(iloggingevent));
	//   26   58:aload_1         
	//   27   59:bipush          6
	//   28   61:aload_2         
	//   29   62:invokestatic    #138 <Method short computeReferenceMask(ILoggingEvent)>
	//   30   65:i2l             
	//   31   66:invokevirtual   #118 <Method void SQLiteStatement.bindLong(int, long)>
	//   32   69:return          
	}

	private void bindLoggingEventArguments(SQLiteStatement sqlitestatement, Object aobj[])
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		int i;
		if(aobj != null)
	//*   2    3:aload_2         
	//*   3    4:ifnull          13
			i = aobj.length;
	//    4    7:aload_2         
	//    5    8:arraylength     
	//    6    9:istore_3        
		else
	//*   7   10:goto            15
			i = 0;
	//    8   13:iconst_0        
	//    9   14:istore_3        
		for(; j < i && j < 4; j++)
	//*  10   15:iload           4
	//*  11   17:iload_3         
	//*  12   18:icmpge          53
	//*  13   21:iload           4
	//*  14   23:iconst_4        
	//*  15   24:icmpge          53
			sqlitestatement.bindString(j + 7, asStringTruncatedTo254(aobj[j]));
	//   16   27:aload_1         
	//   17   28:iload           4
	//   18   30:bipush          7
	//   19   32:iadd            
	//   20   33:aload_0         
	//   21   34:aload_2         
	//   22   35:iload           4
	//   23   37:aaload          
	//   24   38:invokespecial   #142 <Method String asStringTruncatedTo254(Object)>
	//   25   41:invokevirtual   #92  <Method void SQLiteStatement.bindString(int, String)>

	//   26   44:iload           4
	//   27   46:iconst_1        
	//   28   47:iadd            
	//   29   48:istore          4
	//*  30   50:goto            15
	//   31   53:return          
	}

	private void clearExpiredLogs(SQLiteDatabase sqlitedatabase)
	{
		if(lastCheckExpired(maxHistory, lastCleanupTime))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:getfield        #146 <Field Duration maxHistory>
	//*   3    5:aload_0         
	//*   4    6:getfield        #54  <Field long lastCleanupTime>
	//*   5    9:invokespecial   #150 <Method boolean lastCheckExpired(Duration, long)>
	//*   6   12:ifeq            36
		{
			lastCleanupTime = System.currentTimeMillis();
	//    7   15:aload_0         
	//    8   16:invokestatic    #155 <Method long System.currentTimeMillis()>
	//    9   19:putfield        #54  <Field long lastCleanupTime>
			getLogCleaner().performLogCleanup(sqlitedatabase, maxHistory);
	//   10   22:aload_0         
	//   11   23:invokevirtual   #159 <Method SQLiteLogCleaner getLogCleaner()>
	//   12   26:aload_1         
	//   13   27:aload_0         
	//   14   28:getfield        #146 <Field Duration maxHistory>
	//   15   31:invokeinterface #165 <Method void SQLiteLogCleaner.performLogCleanup(SQLiteDatabase, Duration)>
		}
	//   16   36:return          
	}

	private static short computeReferenceMask(ILoggingEvent iloggingevent)
	{
		Map map = iloggingevent.getMDCPropertyMap();
	//    0    0:aload_0         
	//    1    1:invokeinterface #169 <Method Map ILoggingEvent.getMDCPropertyMap()>
	//    2    6:astore          5
		int i = 0;
	//    3    8:iconst_0        
	//    4    9:istore_1        
		int j;
		if(map != null)
	//*   5   10:aload           5
	//*   6   12:ifnull          35
			j = iloggingevent.getMDCPropertyMap().keySet().size();
	//    7   15:aload_0         
	//    8   16:invokeinterface #169 <Method Map ILoggingEvent.getMDCPropertyMap()>
	//    9   21:invokeinterface #175 <Method Set Map.keySet()>
	//   10   26:invokeinterface #180 <Method int Set.size()>
	//   11   31:istore_3        
		else
	//*  12   32:goto            37
			j = 0;
	//   13   35:iconst_0        
	//   14   36:istore_3        
		int k;
		if(iloggingevent.getLoggerContextVO().getPropertyMap() != null)
	//*  15   37:aload_0         
	//*  16   38:invokeinterface #184 <Method LoggerContextVO ILoggingEvent.getLoggerContextVO()>
	//*  17   43:invokevirtual   #189 <Method Map LoggerContextVO.getPropertyMap()>
	//*  18   46:ifnull          68
			k = iloggingevent.getLoggerContextVO().getPropertyMap().size();
	//   19   49:aload_0         
	//   20   50:invokeinterface #184 <Method LoggerContextVO ILoggingEvent.getLoggerContextVO()>
	//   21   55:invokevirtual   #189 <Method Map LoggerContextVO.getPropertyMap()>
	//   22   58:invokeinterface #190 <Method int Map.size()>
	//   23   63:istore          4
		else
	//*  24   65:goto            71
			k = 0;
	//   25   68:iconst_0        
	//   26   69:istore          4
		if(j > 0 || k > 0)
	//*  27   71:iload_3         
	//*  28   72:ifgt            80
	//*  29   75:iload           4
	//*  30   77:ifle            82
			i = 1;
	//   31   80:iconst_1        
	//   32   81:istore_1        
		short word0 = ((short) (i));
	//   33   82:iload_1         
	//   34   83:istore_2        
		if(iloggingevent.getThrowableProxy() != null)
	//*  35   84:aload_0         
	//*  36   85:invokeinterface #194 <Method IThrowableProxy ILoggingEvent.getThrowableProxy()>
	//*  37   90:ifnull          98
			word0 = (short)(i | 2);
	//   38   93:iload_1         
	//   39   94:iconst_2        
	//   40   95:ior             
	//   41   96:int2short       
	//   42   97:istore_2        
		return word0;
	//   43   98:iload_2         
	//   44   99:ireturn         
	}

	private void insertException(SQLiteStatement sqlitestatement, String s, short word0, long l)
	{
		sqlitestatement.bindLong(1, l);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:lload           4
	//    3    4:invokevirtual   #118 <Method void SQLiteStatement.bindLong(int, long)>
		sqlitestatement.bindLong(2, word0);
	//    4    7:aload_1         
	//    5    8:iconst_2        
	//    6    9:iload_3         
	//    7   10:i2l             
	//    8   11:invokevirtual   #118 <Method void SQLiteStatement.bindLong(int, long)>
		sqlitestatement.bindString(3, s);
	//    9   14:aload_1         
	//   10   15:iconst_3        
	//   11   16:aload_2         
	//   12   17:invokevirtual   #92  <Method void SQLiteStatement.bindString(int, String)>
		sqlitestatement.executeInsert();
	//   13   20:aload_1         
	//   14   21:invokevirtual   #199 <Method long SQLiteStatement.executeInsert()>
	//   15   24:pop2            
	//   16   25:return          
	}

	private void insertProperties(Map map, long l)
	{
		SQLiteStatement sqlitestatement;
		if(map.size() <= 0)
			break MISSING_BLOCK_LABEL_116;
	//    0    0:aload_1         
	//    1    1:invokeinterface #190 <Method int Map.size()>
	//    2    6:ifle            116
		sqlitestatement = db.compileStatement(insertPropertiesSQL);
	//    3    9:aload_0         
	//    4   10:getfield        #203 <Field SQLiteDatabase db>
	//    5   13:aload_0         
	//    6   14:getfield        #205 <Field String insertPropertiesSQL>
	//    7   17:invokevirtual   #211 <Method SQLiteStatement SQLiteDatabase.compileStatement(String)>
	//    8   20:astore          4
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); sqlitestatement.executeInsert())
	//*   9   22:aload_1         
	//*  10   23:invokeinterface #214 <Method Set Map.entrySet()>
	//*  11   28:invokeinterface #218 <Method Iterator Set.iterator()>
	//*  12   33:astore_1        
	//*  13   34:aload_1         
	//*  14   35:invokeinterface #224 <Method boolean Iterator.hasNext()>
	//*  15   40:ifeq            102
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   16   43:aload_1         
	//   17   44:invokeinterface #228 <Method Object Iterator.next()>
	//   18   49:checkcast       #230 <Class java.util.Map$Entry>
	//   19   52:astore          5
			sqlitestatement.bindLong(1, l);
	//   20   54:aload           4
	//   21   56:iconst_1        
	//   22   57:lload_2         
	//   23   58:invokevirtual   #118 <Method void SQLiteStatement.bindLong(int, long)>
			sqlitestatement.bindString(2, (String)entry.getKey());
	//   24   61:aload           4
	//   25   63:iconst_2        
	//   26   64:aload           5
	//   27   66:invokeinterface #233 <Method Object java.util.Map$Entry.getKey()>
	//   28   71:checkcast       #69  <Class String>
	//   29   74:invokevirtual   #92  <Method void SQLiteStatement.bindString(int, String)>
			sqlitestatement.bindString(3, (String)entry.getValue());
	//   30   77:aload           4
	//   31   79:iconst_3        
	//   32   80:aload           5
	//   33   82:invokeinterface #236 <Method Object java.util.Map$Entry.getValue()>
	//   34   87:checkcast       #69  <Class String>
	//   35   90:invokevirtual   #92  <Method void SQLiteStatement.bindString(int, String)>
		}

	//   36   93:aload           4
	//   37   95:invokevirtual   #199 <Method long SQLiteStatement.executeInsert()>
	//   38   98:pop2            
	//*  39   99:goto            34
		sqlitestatement.close();
	//   40  102:aload           4
	//   41  104:invokevirtual   #239 <Method void SQLiteStatement.close()>
		return;
	//   42  107:return          
		map;
	//   43  108:astore_1        
		sqlitestatement.close();
	//   44  109:aload           4
	//   45  111:invokevirtual   #239 <Method void SQLiteStatement.close()>
		throw map;
	//   46  114:aload_1         
	//   47  115:athrow          
	//   48  116:return          
	}

	private void insertThrowable(IThrowableProxy ithrowableproxy, long l)
	{
		short word1;
		SQLiteStatement sqlitestatement;
		sqlitestatement = db.compileStatement(insertExceptionSQL);
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field SQLiteDatabase db>
	//    2    4:aload_0         
	//    3    5:getfield        #245 <Field String insertExceptionSQL>
	//    4    8:invokevirtual   #211 <Method SQLiteStatement SQLiteDatabase.compileStatement(String)>
	//    5   11:astore          8
		word1 = 0;
	//    6   13:iconst_0        
	//    7   14:istore          5
_L4:
		if(ithrowableproxy == null)
			break; /* Loop/switch isn't completed */
	//    8   16:aload_1         
	//    9   17:ifnull          250
		Object obj;
		obj = ((Object) (new StringBuilder()));
	//   10   20:new             #247 <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #248 <Method void StringBuilder()>
	//   13   27:astore          9
		ThrowableProxyUtil.subjoinFirstLine(((StringBuilder) (obj)), ithrowableproxy);
	//   14   29:aload           9
	//   15   31:aload_1         
	//   16   32:invokestatic    #254 <Method void ThrowableProxyUtil.subjoinFirstLine(StringBuilder, IThrowableProxy)>
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   17   35:aload           9
	//   18   37:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   19   40:astore          9
		short word0 = (short)(word1 + 1);
	//   20   42:iload           5
	//   21   44:iconst_1        
	//   22   45:iadd            
	//   23   46:int2short       
	//   24   47:istore          4
		int j;
		ch.qos.logback.classic.spi.StackTraceElementProxy astacktraceelementproxy[];
		insertException(sqlitestatement, ((String) (obj)), word1, l);
	//   25   49:aload_0         
	//   26   50:aload           8
	//   27   52:aload           9
	//   28   54:iload           5
	//   29   56:lload_2         
	//   30   57:invokespecial   #257 <Method void insertException(SQLiteStatement, String, short, long)>
		j = ithrowableproxy.getCommonFrames();
	//   31   60:aload_1         
	//   32   61:invokeinterface #262 <Method int IThrowableProxy.getCommonFrames()>
	//   33   66:istore          7
		astacktraceelementproxy = ithrowableproxy.getStackTraceElementProxyArray();
	//   34   68:aload_1         
	//   35   69:invokeinterface #266 <Method ch.qos.logback.classic.spi.StackTraceElementProxy[] IThrowableProxy.getStackTraceElementProxyArray()>
	//   36   74:astore          9
		int i = 0;
	//   37   76:iconst_0        
	//   38   77:istore          6
_L2:
		Object obj1;
		if(i >= astacktraceelementproxy.length - j)
			break; /* Loop/switch isn't completed */
	//   39   79:iload           6
	//   40   81:aload           9
	//   41   83:arraylength     
	//   42   84:iload           7
	//   43   86:isub            
	//   44   87:icmpge          155
		obj1 = ((Object) (new StringBuilder()));
	//   45   90:new             #247 <Class StringBuilder>
	//   46   93:dup             
	//   47   94:invokespecial   #248 <Method void StringBuilder()>
	//   48   97:astore          10
		((StringBuilder) (obj1)).append('\t');
	//   49   99:aload           10
	//   50  101:bipush          9
	//   51  103:invokevirtual   #270 <Method StringBuilder StringBuilder.append(char)>
	//   52  106:pop             
		ThrowableProxyUtil.subjoinSTEP(((StringBuilder) (obj1)), astacktraceelementproxy[i]);
	//   53  107:aload           10
	//   54  109:aload           9
	//   55  111:iload           6
	//   56  113:aaload          
	//   57  114:invokestatic    #274 <Method void ThrowableProxyUtil.subjoinSTEP(StringBuilder, ch.qos.logback.classic.spi.StackTraceElementProxy)>
		obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   58  117:aload           10
	//   59  119:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   60  122:astore          10
		word1 = (short)(word0 + 1);
	//   61  124:iload           4
	//   62  126:iconst_1        
	//   63  127:iadd            
	//   64  128:int2short       
	//   65  129:istore          5
		insertException(sqlitestatement, ((String) (obj1)), word0, l);
	//   66  131:aload_0         
	//   67  132:aload           8
	//   68  134:aload           10
	//   69  136:iload           4
	//   70  138:lload_2         
	//   71  139:invokespecial   #257 <Method void insertException(SQLiteStatement, String, short, long)>
		i++;
	//   72  142:iload           6
	//   73  144:iconst_1        
	//   74  145:iadd            
	//   75  146:istore          6
		word0 = word1;
	//   76  148:iload           5
	//   77  150:istore          4
		if(true) goto _L2; else goto _L1
	//   78  152:goto            79
_L1:
		word1 = word0;
	//   79  155:iload           4
	//   80  157:istore          5
		if(j <= 0)
			break MISSING_BLOCK_LABEL_232;
	//   81  159:iload           7
	//   82  161:ifle            232
		astacktraceelementproxy = ((ch.qos.logback.classic.spi.StackTraceElementProxy []) (new StringBuilder()));
	//   83  164:new             #247 <Class StringBuilder>
	//   84  167:dup             
	//   85  168:invokespecial   #248 <Method void StringBuilder()>
	//   86  171:astore          9
		((StringBuilder) (astacktraceelementproxy)).append('\t');
	//   87  173:aload           9
	//   88  175:bipush          9
	//   89  177:invokevirtual   #270 <Method StringBuilder StringBuilder.append(char)>
	//   90  180:pop             
		((StringBuilder) (astacktraceelementproxy)).append("... ");
	//   91  181:aload           9
	//   92  183:ldc2            #276 <String "... ">
	//   93  186:invokevirtual   #279 <Method StringBuilder StringBuilder.append(String)>
	//   94  189:pop             
		((StringBuilder) (astacktraceelementproxy)).append(j);
	//   95  190:aload           9
	//   96  192:iload           7
	//   97  194:invokevirtual   #282 <Method StringBuilder StringBuilder.append(int)>
	//   98  197:pop             
		((StringBuilder) (astacktraceelementproxy)).append(" common frames omitted");
	//   99  198:aload           9
	//  100  200:ldc2            #284 <String " common frames omitted">
	//  101  203:invokevirtual   #279 <Method StringBuilder StringBuilder.append(String)>
	//  102  206:pop             
		astacktraceelementproxy = ((ch.qos.logback.classic.spi.StackTraceElementProxy []) (((StringBuilder) (astacktraceelementproxy)).toString()));
	//  103  207:aload           9
	//  104  209:invokevirtual   #255 <Method String StringBuilder.toString()>
	//  105  212:astore          9
		word1 = (short)(word0 + 1);
	//  106  214:iload           4
	//  107  216:iconst_1        
	//  108  217:iadd            
	//  109  218:int2short       
	//  110  219:istore          5
		insertException(sqlitestatement, ((String) (astacktraceelementproxy)), word0, l);
	//  111  221:aload_0         
	//  112  222:aload           8
	//  113  224:aload           9
	//  114  226:iload           4
	//  115  228:lload_2         
	//  116  229:invokespecial   #257 <Method void insertException(SQLiteStatement, String, short, long)>
		ithrowableproxy = ithrowableproxy.getCause();
	//  117  232:aload_1         
	//  118  233:invokeinterface #287 <Method IThrowableProxy IThrowableProxy.getCause()>
	//  119  238:astore_1        
		if(true) goto _L4; else goto _L3
	//  120  239:goto            16
		ithrowableproxy;
	//  121  242:astore_1        
		sqlitestatement.close();
	//  122  243:aload           8
	//  123  245:invokevirtual   #239 <Method void SQLiteStatement.close()>
		throw ithrowableproxy;
	//  124  248:aload_1         
	//  125  249:athrow          
_L3:
		sqlitestatement.close();
	//  126  250:aload           8
	//  127  252:invokevirtual   #239 <Method void SQLiteStatement.close()>
		return;
	//  128  255:return          
	}

	private boolean lastCheckExpired(Duration duration, long l)
	{
		boolean flag;
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
			flag = flag1;
	//    2    3:iload           7
	//    3    5:istore          6
			if(duration == null)
				break label0;
	//    4    7:aload_1         
	//    5    8:ifnull          54
			flag = flag1;
	//    6   11:iload           7
	//    7   13:istore          6
			if(duration.getMilliseconds() <= 0L)
				break label0;
	//    8   15:aload_1         
	//    9   16:invokevirtual   #292 <Method long Duration.getMilliseconds()>
	//   10   19:lconst_0        
	//   11   20:lcmp            
	//   12   21:ifle            54
			long l1 = System.currentTimeMillis();
	//   13   24:invokestatic    #155 <Method long System.currentTimeMillis()>
	//   14   27:lstore          4
			if(l > 0L)
	//*  15   29:lload_2         
	//*  16   30:lconst_0        
	//*  17   31:lcmp            
	//*  18   32:ifle            51
			{
				flag = flag1;
	//   19   35:iload           7
	//   20   37:istore          6
				if(l1 - l < duration.getMilliseconds())
					break label0;
	//   21   39:lload           4
	//   22   41:lload_2         
	//   23   42:lsub            
	//   24   43:aload_1         
	//   25   44:invokevirtual   #292 <Method long Duration.getMilliseconds()>
	//   26   47:lcmp            
	//   27   48:iflt            54
			}
			flag = true;
	//   28   51:iconst_1        
	//   29   52:istore          6
		}
		return flag;
	//   30   54:iload           6
	//   31   56:ireturn         
	}

	private Map mergePropertyMaps(ILoggingEvent iloggingevent)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #296 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #297 <Method void HashMap()>
	//    3    7:astore_2        
		Map map = iloggingevent.getLoggerContextVO().getPropertyMap();
	//    4    8:aload_1         
	//    5    9:invokeinterface #184 <Method LoggerContextVO ILoggingEvent.getLoggerContextVO()>
	//    6   14:invokevirtual   #189 <Method Map LoggerContextVO.getPropertyMap()>
	//    7   17:astore_3        
		if(map != null)
	//*   8   18:aload_3         
	//*   9   19:ifnull          29
			((Map) (hashmap)).putAll(map);
	//   10   22:aload_2         
	//   11   23:aload_3         
	//   12   24:invokeinterface #301 <Method void Map.putAll(Map)>
		iloggingevent = ((ILoggingEvent) (iloggingevent.getMDCPropertyMap()));
	//   13   29:aload_1         
	//   14   30:invokeinterface #169 <Method Map ILoggingEvent.getMDCPropertyMap()>
	//   15   35:astore_1        
		if(iloggingevent != null)
	//*  16   36:aload_1         
	//*  17   37:ifnull          47
			((Map) (hashmap)).putAll(((Map) (iloggingevent)));
	//   18   40:aload_2         
	//   19   41:aload_1         
	//   20   42:invokeinterface #301 <Method void Map.putAll(Map)>
		return ((Map) (hashmap));
	//   21   47:aload_2         
	//   22   48:areturn         
	}

	private void secondarySubAppend(ILoggingEvent iloggingevent, long l)
	{
		insertProperties(mergePropertyMaps(iloggingevent), l);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokespecial   #306 <Method Map mergePropertyMaps(ILoggingEvent)>
	//    4    6:lload_2         
	//    5    7:invokespecial   #308 <Method void insertProperties(Map, long)>
		if(iloggingevent.getThrowableProxy() != null)
	//*   6   10:aload_1         
	//*   7   11:invokeinterface #194 <Method IThrowableProxy ILoggingEvent.getThrowableProxy()>
	//*   8   16:ifnull          30
			insertThrowable(iloggingevent.getThrowableProxy(), l);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokeinterface #194 <Method IThrowableProxy ILoggingEvent.getThrowableProxy()>
	//   12   26:lload_2         
	//   13   27:invokespecial   #310 <Method void insertThrowable(IThrowableProxy, long)>
	//   14   30:return          
	}

	private long subAppend(ILoggingEvent iloggingevent, SQLiteStatement sqlitestatement)
	{
		bindLoggingEvent(sqlitestatement, iloggingevent);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_1         
	//    3    3:invokespecial   #316 <Method void bindLoggingEvent(SQLiteStatement, ILoggingEvent)>
		bindLoggingEventArguments(sqlitestatement, iloggingevent.getArgumentArray());
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:aload_1         
	//    7    9:invokeinterface #320 <Method Object[] ILoggingEvent.getArgumentArray()>
	//    8   14:invokespecial   #322 <Method void bindLoggingEventArguments(SQLiteStatement, Object[])>
		bindCallerData(sqlitestatement, iloggingevent.getCallerData());
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokeinterface #326 <Method StackTraceElement[] ILoggingEvent.getCallerData()>
	//   13   25:invokespecial   #328 <Method void bindCallerData(SQLiteStatement, StackTraceElement[])>
		long l;
		try
		{
			l = sqlitestatement.executeInsert();
	//   14   28:aload_2         
	//   15   29:invokevirtual   #199 <Method long SQLiteStatement.executeInsert()>
	//   16   32:lstore_3        
		}
	//*  17   33:lload_3         
	//*  18   34:lreturn         
		// Misplaced declaration of an exception variable
		catch(ILoggingEvent iloggingevent)
	//*  19   35:astore_1        
		{
			addWarn("Failed to insert loggingEvent", ((Throwable) (iloggingevent)));
	//   20   36:aload_0         
	//   21   37:ldc2            #330 <String "Failed to insert loggingEvent">
	//   22   40:aload_1         
	//   23   41:invokevirtual   #334 <Method void addWarn(String, Throwable)>
			return -1L;
	//   24   44:ldc2w           #335 <Long -1L>
	//   25   47:lreturn         
		}
		return l;
	}

	public void append(ILoggingEvent iloggingevent)
	{
		if(!isStarted())
			break MISSING_BLOCK_LABEL_121;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #342 <Method boolean isStarted()>
	//    2    4:ifeq            121
		SQLiteStatement sqlitestatement;
		clearExpiredLogs(db);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #203 <Field SQLiteDatabase db>
	//    6   12:invokespecial   #344 <Method void clearExpiredLogs(SQLiteDatabase)>
		sqlitestatement = db.compileStatement(insertSQL);
	//    7   15:aload_0         
	//    8   16:getfield        #203 <Field SQLiteDatabase db>
	//    9   19:aload_0         
	//   10   20:getfield        #346 <Field String insertSQL>
	//   11   23:invokevirtual   #211 <Method SQLiteStatement SQLiteDatabase.compileStatement(String)>
	//   12   26:astore          4
		long l;
		db.beginTransaction();
	//   13   28:aload_0         
	//   14   29:getfield        #203 <Field SQLiteDatabase db>
	//   15   32:invokevirtual   #349 <Method void SQLiteDatabase.beginTransaction()>
		l = subAppend(iloggingevent, sqlitestatement);
	//   16   35:aload_0         
	//   17   36:aload_1         
	//   18   37:aload           4
	//   19   39:invokespecial   #351 <Method long subAppend(ILoggingEvent, SQLiteStatement)>
	//   20   42:lstore_2        
		if(l == -1L)
			break MISSING_BLOCK_LABEL_64;
	//   21   43:lload_2         
	//   22   44:ldc2w           #335 <Long -1L>
	//   23   47:lcmp            
	//   24   48:ifeq            64
		secondarySubAppend(iloggingevent, l);
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:lload_2         
	//   28   54:invokespecial   #353 <Method void secondarySubAppend(ILoggingEvent, long)>
		db.setTransactionSuccessful();
	//   29   57:aload_0         
	//   30   58:getfield        #203 <Field SQLiteDatabase db>
	//   31   61:invokevirtual   #356 <Method void SQLiteDatabase.setTransactionSuccessful()>
		try
		{
			if(db.inTransaction())
	//*  32   64:aload_0         
	//*  33   65:getfield        #203 <Field SQLiteDatabase db>
	//*  34   68:invokevirtual   #359 <Method boolean SQLiteDatabase.inTransaction()>
	//*  35   71:ifeq            81
				db.endTransaction();
	//   36   74:aload_0         
	//   37   75:getfield        #203 <Field SQLiteDatabase db>
	//   38   78:invokevirtual   #362 <Method void SQLiteDatabase.endTransaction()>
			sqlitestatement.close();
	//   39   81:aload           4
	//   40   83:invokevirtual   #239 <Method void SQLiteStatement.close()>
			return;
	//   41   86:return          
		}
	//*  42   87:astore_1        
	//*  43   88:aload_0         
	//*  44   89:getfield        #203 <Field SQLiteDatabase db>
	//*  45   92:invokevirtual   #359 <Method boolean SQLiteDatabase.inTransaction()>
	//*  46   95:ifeq            105
	//*  47   98:aload_0         
	//*  48   99:getfield        #203 <Field SQLiteDatabase db>
	//*  49  102:invokevirtual   #362 <Method void SQLiteDatabase.endTransaction()>
	//*  50  105:aload           4
	//*  51  107:invokevirtual   #239 <Method void SQLiteStatement.close()>
	//*  52  110:aload_1         
	//*  53  111:athrow          
		// Misplaced declaration of an exception variable
		catch(ILoggingEvent iloggingevent)
	//*  54  112:astore_1        
		{
			addError("Cannot append event", ((Throwable) (iloggingevent)));
	//   55  113:aload_0         
	//   56  114:ldc2            #364 <String "Cannot append event">
	//   57  117:aload_1         
	//   58  118:invokevirtual   #367 <Method void addError(String, Throwable)>
		}
		break MISSING_BLOCK_LABEL_121;
		iloggingevent;
		if(db.inTransaction())
			db.endTransaction();
		sqlitestatement.close();
		throw iloggingevent;
	//   59  121:return          
	}

	public volatile void append(Object obj)
	{
		append((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #110 <Class ILoggingEvent>
	//    3    5:invokevirtual   #370 <Method void append(ILoggingEvent)>
	//    4    8:return          
	}

	protected void finalize()
	{
		db.close();
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field SQLiteDatabase db>
	//    2    4:invokevirtual   #372 <Method void SQLiteDatabase.close()>
	//    3    7:return          
	}

	public File getDatabaseFile(String s)
	{
		Object obj;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(s != null && s.trim().length() > 0)
	//*   2    2:aload_1         
	//*   3    3:ifnull          28
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #377 <Method String String.trim()>
	//*   6   10:invokevirtual   #73  <Method int String.length()>
	//*   7   13:ifle            28
			s = ((String) (new File(s)));
	//    8   16:new             #379 <Class File>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokespecial   #382 <Method void File(String)>
	//   12   24:astore_1        
		else
	//*  13   25:goto            30
			s = null;
	//   14   28:aconst_null     
	//   15   29:astore_1        
		if(s != null && !((File) (s)).isDirectory()) goto _L2; else goto _L1
	//   16   30:aload_1         
	//   17   31:ifnull          46
	//   18   34:aload_1         
	//   19   35:invokevirtual   #385 <Method boolean File.isDirectory()>
	//   20   38:ifeq            44
	//*  21   41:goto            46
_L2:
		return ((File) (s));
	//   22   44:aload_1         
	//   23   45:areturn         
_L1:
		if(getContext() == null)
			break; /* Loop/switch isn't completed */
	//   24   46:aload_0         
	//   25   47:invokevirtual   #389 <Method Context getContext()>
	//   26   50:ifnull          95
	//*  27   53:aload_0         
	//*  28   54:invokevirtual   #389 <Method Context getContext()>
	//*  29   57:ldc2            #391 <String "PACKAGE_NAME">
	//*  30   60:invokeinterface #397 <Method String Context.getProperty(String)>
	//*  31   65:astore_2        
		if((obj = ((Object) (getContext().getProperty("PACKAGE_NAME")))) == null || ((String) (obj)).trim().length() <= 0)
			continue; /* Loop/switch isn't completed */
	//   32   66:aload_2         
	//   33   67:ifnull          44
	//   34   70:aload_2         
	//   35   71:invokevirtual   #377 <Method String String.trim()>
	//   36   74:invokevirtual   #73  <Method int String.length()>
	//   37   77:ifle            44
		obj = ((Object) (new File(CommonPathUtil.getDatabaseDirectoryPath(((String) (obj))), "logback.db")));
	//   38   80:new             #379 <Class File>
	//   39   83:dup             
	//   40   84:aload_2         
	//   41   85:invokestatic    #402 <Method String CommonPathUtil.getDatabaseDirectoryPath(String)>
	//   42   88:ldc2            #404 <String "logback.db">
	//   43   91:invokespecial   #407 <Method void File(String, String)>
	//   44   94:astore_2        
		break; /* Loop/switch isn't completed */
		if(true) goto _L2; else goto _L3
_L3:
		return ((File) (obj));
	//   45   95:aload_2         
	//   46   96:areturn         
	}

	public String getFilename()
	{
		return filename;
	//    0    0:aload_0         
	//    1    1:getfield        #410 <Field String filename>
	//    2    4:areturn         
	}

	public SQLiteLogCleaner getLogCleaner()
	{
		if(logCleaner == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #412 <Field SQLiteLogCleaner logCleaner>
	//*   2    4:ifnonnull       19
			logCleaner = new SQLiteLogCleaner() {

				public void performLogCleanup(SQLiteDatabase sqlitedatabase, Duration duration)
				{
					long l = System.currentTimeMillis();
				//    0    0:invokestatic    #29  <Method long System.currentTimeMillis()>
				//    1    3:lstore_3        
					long l1 = duration.getMilliseconds();
				//    2    4:aload_2         
				//    3    5:invokevirtual   #34  <Method long Duration.getMilliseconds()>
				//    4    8:lstore          5
					sqlitedatabase.execSQL(SQLBuilder.buildDeleteExpiredLogsSQL(dbNameResolver, l - l1));
				//    5   10:aload_1         
				//    6   11:aload_0         
				//    7   12:getfield        #17  <Field SQLiteAppender this$0>
				//    8   15:invokestatic    #38  <Method DBNameResolver SQLiteAppender.access$000(SQLiteAppender)>
				//    9   18:lload_3         
				//   10   19:lload           5
				//   11   21:lsub            
				//   12   22:invokestatic    #44  <Method String SQLBuilder.buildDeleteExpiredLogsSQL(DBNameResolver, long)>
				//   13   25:invokevirtual   #50  <Method void SQLiteDatabase.execSQL(String)>
				//   14   28:return          
				}

				final SQLiteAppender this$0;

			
			{
				this$0 = SQLiteAppender.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SQLiteAppender this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//    3    7:aload_0         
	//    4    8:new             #7   <Class SQLiteAppender$1>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #415 <Method void SQLiteAppender$1(SQLiteAppender)>
	//    8   16:putfield        #412 <Field SQLiteLogCleaner logCleaner>
		return logCleaner;
	//    9   19:aload_0         
	//   10   20:getfield        #412 <Field SQLiteLogCleaner logCleaner>
	//   11   23:areturn         
	}

	public String getMaxHistory()
	{
		if(maxHistory != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #146 <Field Duration maxHistory>
	//*   2    4:ifnull          15
			return maxHistory.toString();
	//    3    7:aload_0         
	//    4    8:getfield        #146 <Field Duration maxHistory>
	//    5   11:invokevirtual   #417 <Method String Duration.toString()>
	//    6   14:areturn         
		else
			return "";
	//    7   15:ldc1            #79  <String "">
	//    8   17:areturn         
	}

	public long getMaxHistoryMs()
	{
		if(maxHistory != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #146 <Field Duration maxHistory>
	//*   2    4:ifnull          15
			return maxHistory.getMilliseconds();
	//    3    7:aload_0         
	//    4    8:getfield        #146 <Field Duration maxHistory>
	//    5   11:invokevirtual   #292 <Method long Duration.getMilliseconds()>
	//    6   14:lreturn         
		else
			return 0L;
	//    7   15:lconst_0        
	//    8   16:lreturn         
	}

	public void setDbNameResolver(DBNameResolver dbnameresolver)
	{
		dbNameResolver = dbnameresolver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field DBNameResolver dbNameResolver>
	//    3    5:return          
	}

	public void setFilename(String s)
	{
		filename = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #410 <Field String filename>
	//    3    5:return          
	}

	public void setLogCleaner(SQLiteLogCleaner sqlitelogcleaner)
	{
		logCleaner = sqlitelogcleaner;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #412 <Field SQLiteLogCleaner logCleaner>
	//    3    5:return          
	}

	public void setMaxHistory(String s)
	{
		maxHistory = Duration.valueOf(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #428 <Method Duration Duration.valueOf(String)>
	//    3    5:putfield        #146 <Field Duration maxHistory>
	//    4    8:return          
	}

	public void start()
	{
		boolean flag;
		File file;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		started = false;
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:putfield        #433 <Field boolean started>
		file = getDatabaseFile(filename);
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #410 <Field String filename>
	//    8   12:invokevirtual   #435 <Method File getDatabaseFile(String)>
	//    9   15:astore_2        
		if(file == null)
	//*  10   16:aload_2         
	//*  11   17:ifnonnull       28
		{
			addError("Cannot determine database filename");
	//   12   20:aload_0         
	//   13   21:ldc2            #437 <String "Cannot determine database filename">
	//   14   24:invokevirtual   #439 <Method void addError(String)>
			return;
	//   15   27:return          
		}
		file.getParentFile().mkdirs();
	//   16   28:aload_2         
	//   17   29:invokevirtual   #443 <Method File File.getParentFile()>
	//   18   32:invokevirtual   #446 <Method boolean File.mkdirs()>
	//   19   35:pop             
		StringBuilder stringbuilder = new StringBuilder();
	//   20   36:new             #247 <Class StringBuilder>
	//   21   39:dup             
	//   22   40:invokespecial   #248 <Method void StringBuilder()>
	//   23   43:astore_3        
		stringbuilder.append("db path: ");
	//   24   44:aload_3         
	//   25   45:ldc2            #448 <String "db path: ">
	//   26   48:invokevirtual   #279 <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
		stringbuilder.append(file.getAbsolutePath());
	//   28   52:aload_3         
	//   29   53:aload_2         
	//   30   54:invokevirtual   #451 <Method String File.getAbsolutePath()>
	//   31   57:invokevirtual   #279 <Method StringBuilder StringBuilder.append(String)>
	//   32   60:pop             
		addInfo(stringbuilder.toString());
	//   33   61:aload_0         
	//   34   62:aload_3         
	//   35   63:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   36   66:invokevirtual   #454 <Method void addInfo(String)>
		db = SQLiteDatabase.openOrCreateDatabase(file.getPath(), ((android.database.sqlite.SQLiteDatabase.CursorFactory) (null)));
	//   37   69:aload_0         
	//   38   70:aload_2         
	//   39   71:invokevirtual   #457 <Method String File.getPath()>
	//   40   74:aconst_null     
	//   41   75:invokestatic    #461 <Method SQLiteDatabase SQLiteDatabase.openOrCreateDatabase(String, android.database.sqlite.SQLiteDatabase$CursorFactory)>
	//   42   78:putfield        #203 <Field SQLiteDatabase db>
		flag = true;
	//   43   81:iconst_1        
	//   44   82:istore_1        
		break MISSING_BLOCK_LABEL_95;
	//   45   83:goto            95
		SQLiteException sqliteexception;
		sqliteexception;
	//   46   86:astore_2        
		addError("Cannot open database", ((Throwable) (sqliteexception)));
	//   47   87:aload_0         
	//   48   88:ldc2            #463 <String "Cannot open database">
	//   49   91:aload_2         
	//   50   92:invokevirtual   #367 <Method void addError(String, Throwable)>
		if(flag)
	//*  51   95:iload_1         
	//*  52   96:ifeq            219
		{
			if(dbNameResolver == null)
	//*  53   99:aload_0         
	//*  54  100:getfield        #59  <Field DBNameResolver dbNameResolver>
	//*  55  103:ifnonnull       117
				dbNameResolver = ((DBNameResolver) (new DefaultDBNameResolver()));
	//   56  106:aload_0         
	//   57  107:new             #465 <Class DefaultDBNameResolver>
	//   58  110:dup             
	//   59  111:invokespecial   #466 <Method void DefaultDBNameResolver()>
	//   60  114:putfield        #59  <Field DBNameResolver dbNameResolver>
			insertExceptionSQL = SQLBuilder.buildInsertExceptionSQL(dbNameResolver);
	//   61  117:aload_0         
	//   62  118:aload_0         
	//   63  119:getfield        #59  <Field DBNameResolver dbNameResolver>
	//   64  122:invokestatic    #472 <Method String SQLBuilder.buildInsertExceptionSQL(DBNameResolver)>
	//   65  125:putfield        #245 <Field String insertExceptionSQL>
			insertPropertiesSQL = SQLBuilder.buildInsertPropertiesSQL(dbNameResolver);
	//   66  128:aload_0         
	//   67  129:aload_0         
	//   68  130:getfield        #59  <Field DBNameResolver dbNameResolver>
	//   69  133:invokestatic    #475 <Method String SQLBuilder.buildInsertPropertiesSQL(DBNameResolver)>
	//   70  136:putfield        #205 <Field String insertPropertiesSQL>
			insertSQL = SQLBuilder.buildInsertSQL(dbNameResolver);
	//   71  139:aload_0         
	//   72  140:aload_0         
	//   73  141:getfield        #59  <Field DBNameResolver dbNameResolver>
	//   74  144:invokestatic    #478 <Method String SQLBuilder.buildInsertSQL(DBNameResolver)>
	//   75  147:putfield        #346 <Field String insertSQL>
			try
			{
				db.execSQL(SQLBuilder.buildCreateLoggingEventTableSQL(dbNameResolver));
	//   76  150:aload_0         
	//   77  151:getfield        #203 <Field SQLiteDatabase db>
	//   78  154:aload_0         
	//   79  155:getfield        #59  <Field DBNameResolver dbNameResolver>
	//   80  158:invokestatic    #481 <Method String SQLBuilder.buildCreateLoggingEventTableSQL(DBNameResolver)>
	//   81  161:invokevirtual   #484 <Method void SQLiteDatabase.execSQL(String)>
				db.execSQL(SQLBuilder.buildCreatePropertyTableSQL(dbNameResolver));
	//   82  164:aload_0         
	//   83  165:getfield        #203 <Field SQLiteDatabase db>
	//   84  168:aload_0         
	//   85  169:getfield        #59  <Field DBNameResolver dbNameResolver>
	//   86  172:invokestatic    #487 <Method String SQLBuilder.buildCreatePropertyTableSQL(DBNameResolver)>
	//   87  175:invokevirtual   #484 <Method void SQLiteDatabase.execSQL(String)>
				db.execSQL(SQLBuilder.buildCreateExceptionTableSQL(dbNameResolver));
	//   88  178:aload_0         
	//   89  179:getfield        #203 <Field SQLiteDatabase db>
	//   90  182:aload_0         
	//   91  183:getfield        #59  <Field DBNameResolver dbNameResolver>
	//   92  186:invokestatic    #490 <Method String SQLBuilder.buildCreateExceptionTableSQL(DBNameResolver)>
	//   93  189:invokevirtual   #484 <Method void SQLiteDatabase.execSQL(String)>
				clearExpiredLogs(db);
	//   94  192:aload_0         
	//   95  193:aload_0         
	//   96  194:getfield        #203 <Field SQLiteDatabase db>
	//   97  197:invokespecial   #344 <Method void clearExpiredLogs(SQLiteDatabase)>
				super.start();
	//   98  200:aload_0         
	//   99  201:invokespecial   #492 <Method void UnsynchronizedAppenderBase.start()>
				started = true;
	//  100  204:aload_0         
	//  101  205:iconst_1        
	//  102  206:putfield        #433 <Field boolean started>
				return;
	//  103  209:return          
			}
			catch(SQLiteException sqliteexception1)
	//* 104  210:astore_2        
			{
				addError("Cannot create database tables", ((Throwable) (sqliteexception1)));
	//  105  211:aload_0         
	//  106  212:ldc2            #494 <String "Cannot create database tables">
	//  107  215:aload_2         
	//  108  216:invokevirtual   #367 <Method void addError(String, Throwable)>
			}
		}
		return;
	//  109  219:return          
	}

	public void stop()
	{
		db.close();
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field SQLiteDatabase db>
	//    2    4:invokevirtual   #372 <Method void SQLiteDatabase.close()>
		lastCleanupTime = 0L;
	//    3    7:aload_0         
	//    4    8:lconst_0        
	//    5    9:putfield        #54  <Field long lastCleanupTime>
	//    6   12:return          
	}

	private static final int ARG0_INDEX = 7;
	private static final int CALLER_CLASS_INDEX = 12;
	private static final int CALLER_FILENAME_INDEX = 11;
	private static final int CALLER_LINE_INDEX = 14;
	private static final int CALLER_METHOD_INDEX = 13;
	private static final short EXCEPTION_EXISTS = 2;
	private static final int FORMATTED_MESSAGE_INDEX = 2;
	private static final int LEVEL_STRING_INDEX = 4;
	private static final int LOGGER_NAME_INDEX = 3;
	private static final short PROPERTIES_EXIST = 1;
	private static final int REFERENCE_FLAG_INDEX = 6;
	private static final int THREAD_NAME_INDEX = 5;
	private static final int TIMESTMP_INDEX = 1;
	private SQLiteDatabase db;
	private DBNameResolver dbNameResolver;
	private String filename;
	private String insertExceptionSQL;
	private String insertPropertiesSQL;
	private String insertSQL;
	private long lastCleanupTime;
	private SQLiteLogCleaner logCleaner;
	private Duration maxHistory;


/*
	static DBNameResolver access$000(SQLiteAppender sqliteappender)
	{
		return sqliteappender.dbNameResolver;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DBNameResolver dbNameResolver>
	//    2    4:areturn         
	}

*/
}
