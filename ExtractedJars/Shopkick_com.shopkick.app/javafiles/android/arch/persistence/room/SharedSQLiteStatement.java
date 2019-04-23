// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import android.arch.persistence.db.SupportSQLiteStatement;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package android.arch.persistence.room:
//			RoomDatabase

public abstract class SharedSQLiteStatement
{

	public SharedSQLiteStatement(RoomDatabase roomdatabase)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class AtomicBoolean>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #24  <Method void AtomicBoolean(boolean)>
	//    7   13:putfield        #26  <Field AtomicBoolean mLock>
		mDatabase = roomdatabase;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #28  <Field RoomDatabase mDatabase>
	//   11   21:return          
	}

	private SupportSQLiteStatement createNewStatement()
	{
		String s = createQuery();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #35  <Method String createQuery()>
	//    2    4:astore_1        
		return mDatabase.compileStatement(s);
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field RoomDatabase mDatabase>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #41  <Method SupportSQLiteStatement RoomDatabase.compileStatement(String)>
	//    7   13:areturn         
	}

	private SupportSQLiteStatement getStmt(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            24
		{
			if(mStmt == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #45  <Field SupportSQLiteStatement mStmt>
	//*   4    8:ifnonnull       19
				mStmt = createNewStatement();
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:invokespecial   #47  <Method SupportSQLiteStatement createNewStatement()>
	//    8   16:putfield        #45  <Field SupportSQLiteStatement mStmt>
			return mStmt;
	//    9   19:aload_0         
	//   10   20:getfield        #45  <Field SupportSQLiteStatement mStmt>
	//   11   23:areturn         
		} else
		{
			return createNewStatement();
	//   12   24:aload_0         
	//   13   25:invokespecial   #47  <Method SupportSQLiteStatement createNewStatement()>
	//   14   28:areturn         
		}
	}

	public SupportSQLiteStatement acquire()
	{
		assertNotMainThread();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #51  <Method void assertNotMainThread()>
		return getStmt(mLock.compareAndSet(false, true));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field AtomicBoolean mLock>
	//    5    9:iconst_0        
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #55  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//    8   14:invokespecial   #57  <Method SupportSQLiteStatement getStmt(boolean)>
	//    9   17:areturn         
	}

	protected void assertNotMainThread()
	{
		mDatabase.assertNotMainThread();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field RoomDatabase mDatabase>
	//    2    4:invokevirtual   #58  <Method void RoomDatabase.assertNotMainThread()>
	//    3    7:return          
	}

	protected abstract String createQuery();

	public void release(SupportSQLiteStatement supportsqlitestatement)
	{
		if(supportsqlitestatement == mStmt)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #45  <Field SupportSQLiteStatement mStmt>
	//*   3    5:if_acmpne       16
			mLock.set(false);
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field AtomicBoolean mLock>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #63  <Method void AtomicBoolean.set(boolean)>
	//    8   16:return          
	}

	private final RoomDatabase mDatabase;
	private final AtomicBoolean mLock = new AtomicBoolean(false);
	private volatile SupportSQLiteStatement mStmt;
}
