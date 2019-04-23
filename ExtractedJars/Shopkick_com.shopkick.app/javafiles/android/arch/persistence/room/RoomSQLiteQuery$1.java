// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import android.arch.persistence.db.SupportSQLiteProgram;

// Referenced classes of package android.arch.persistence.room:
//			RoomSQLiteQuery

static final class RoomSQLiteQuery$1
	implements SupportSQLiteProgram
{

	public void bindBlob(int i, byte abyte0[])
	{
		val$query.bindBlob(i, abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RoomSQLiteQuery val$query>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #25  <Method void RoomSQLiteQuery.bindBlob(int, byte[])>
	//    5    9:return          
	}

	public void bindDouble(int i, double d)
	{
		val$query.bindDouble(i, d);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RoomSQLiteQuery val$query>
	//    2    4:iload_1         
	//    3    5:dload_2         
	//    4    6:invokevirtual   #29  <Method void RoomSQLiteQuery.bindDouble(int, double)>
	//    5    9:return          
	}

	public void bindLong(int i, long l)
	{
		val$query.bindLong(i, l);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RoomSQLiteQuery val$query>
	//    2    4:iload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #33  <Method void RoomSQLiteQuery.bindLong(int, long)>
	//    5    9:return          
	}

	public void bindNull(int i)
	{
		val$query.bindNull(i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RoomSQLiteQuery val$query>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #37  <Method void RoomSQLiteQuery.bindNull(int)>
	//    4    8:return          
	}

	public void bindString(int i, String s)
	{
		val$query.bindString(i, s);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RoomSQLiteQuery val$query>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #41  <Method void RoomSQLiteQuery.bindString(int, String)>
	//    5    9:return          
	}

	public void clearBindings()
	{
		val$query.clearBindings();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RoomSQLiteQuery val$query>
	//    2    4:invokevirtual   #44  <Method void RoomSQLiteQuery.clearBindings()>
	//    3    7:return          
	}

	public void close()
	{
	//    0    0:return          
	}

	final RoomSQLiteQuery val$query;

	RoomSQLiteQuery$1(RoomSQLiteQuery roomsqlitequery)
	{
		val$query = roomsqlitequery;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field RoomSQLiteQuery val$query>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
