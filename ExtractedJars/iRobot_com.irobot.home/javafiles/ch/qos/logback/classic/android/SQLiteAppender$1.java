// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.android;

import android.database.sqlite.SQLiteDatabase;
import ch.qos.logback.classic.db.SQLBuilder;
import ch.qos.logback.core.util.Duration;

// Referenced classes of package ch.qos.logback.classic.android:
//			SQLiteLogCleaner, SQLiteAppender

class SQLiteAppender$1
	implements SQLiteLogCleaner
{

	public void performLogCleanup(SQLiteDatabase sqlitedatabase, Duration duration)
	{
		long l = System.currentTimeMillis();
	//    0    0:invokestatic    #29  <Method long System.currentTimeMillis()>
	//    1    3:lstore_3        
		long l1 = duration.getMilliseconds();
	//    2    4:aload_2         
	//    3    5:invokevirtual   #34  <Method long Duration.getMilliseconds()>
	//    4    8:lstore          5
		sqlitedatabase.execSQL(SQLBuilder.buildDeleteExpiredLogsSQL(SQLiteAppender.access$000(SQLiteAppender.this), l - l1));
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:getfield        #17  <Field SQLiteAppender this$0>
	//    8   15:invokestatic    #38  <Method ch.qos.logback.classic.db.names.DBNameResolver SQLiteAppender.access$000(SQLiteAppender)>
	//    9   18:lload_3         
	//   10   19:lload           5
	//   11   21:lsub            
	//   12   22:invokestatic    #44  <Method String SQLBuilder.buildDeleteExpiredLogsSQL(ch.qos.logback.classic.db.names.DBNameResolver, long)>
	//   13   25:invokevirtual   #50  <Method void SQLiteDatabase.execSQL(String)>
	//   14   28:return          
	}

	final SQLiteAppender this$0;

	SQLiteAppender$1()
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
