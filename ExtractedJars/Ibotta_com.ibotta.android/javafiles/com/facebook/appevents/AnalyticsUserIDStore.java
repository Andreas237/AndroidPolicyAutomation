// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.FacebookSdk;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

class AnalyticsUserIDStore
{

	AnalyticsUserIDStore()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}

	public static String getUserID()
	{
		if(!initialized)
	//*   0    0:getstatic       #26  <Field boolean initialized>
	//*   1    3:ifne            18
		{
			Log.w(TAG, "initStore should have been called before calling setUserID");
	//    2    6:getstatic       #36  <Field String TAG>
	//    3    9:ldc1            #38  <String "initStore should have been called before calling setUserID">
	//    4   11:invokestatic    #44  <Method int Log.w(String, String)>
	//    5   14:pop             
			initAndWait();
	//    6   15:invokestatic    #32  <Method void initAndWait()>
		}
		lock.readLock().lock();
	//    7   18:getstatic       #24  <Field ReentrantReadWriteLock lock>
	//    8   21:invokevirtual   #48  <Method java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock ReentrantReadWriteLock.readLock()>
	//    9   24:invokevirtual   #52  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.lock()>
		String s = userID;
	//   10   27:getstatic       #54  <Field String userID>
	//   11   30:astore_0        
		lock.readLock().unlock();
	//   12   31:getstatic       #24  <Field ReentrantReadWriteLock lock>
	//   13   34:invokevirtual   #48  <Method java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock ReentrantReadWriteLock.readLock()>
	//   14   37:invokevirtual   #57  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.unlock()>
		return s;
	//   15   40:aload_0         
	//   16   41:areturn         
		Exception exception;
		exception;
	//   17   42:astore_0        
		lock.readLock().unlock();
	//   18   43:getstatic       #24  <Field ReentrantReadWriteLock lock>
	//   19   46:invokevirtual   #48  <Method java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock ReentrantReadWriteLock.readLock()>
	//   20   49:invokevirtual   #57  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.unlock()>
		throw exception;
	//   21   52:aload_0         
	//   22   53:athrow          
	}

	private static void initAndWait()
	{
		if(initialized)
	//*   0    0:getstatic       #26  <Field boolean initialized>
	//*   1    3:ifeq            7
			return;
	//    2    6:return          
		lock.writeLock().lock();
	//    3    7:getstatic       #24  <Field ReentrantReadWriteLock lock>
	//    4   10:invokevirtual   #61  <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
	//    5   13:invokevirtual   #64  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.lock()>
		boolean flag = initialized;
	//    6   16:getstatic       #26  <Field boolean initialized>
	//    7   19:istore_0        
		if(flag)
	//*   8   20:iload_0         
	//*   9   21:ifeq            34
		{
			lock.writeLock().unlock();
	//   10   24:getstatic       #24  <Field ReentrantReadWriteLock lock>
	//   11   27:invokevirtual   #61  <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
	//   12   30:invokevirtual   #65  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
			return;
	//   13   33:return          
		}
		userID = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", ((String) (null)));
	//   14   34:invokestatic    #71  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//   15   37:invokestatic    #77  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
	//   16   40:ldc1            #79  <String "com.facebook.appevents.AnalyticsUserIDStore.userID">
	//   17   42:aconst_null     
	//   18   43:invokeinterface #85  <Method String SharedPreferences.getString(String, String)>
	//   19   48:putstatic       #54  <Field String userID>
		initialized = true;
	//   20   51:iconst_1        
	//   21   52:putstatic       #26  <Field boolean initialized>
		lock.writeLock().unlock();
	//   22   55:getstatic       #24  <Field ReentrantReadWriteLock lock>
	//   23   58:invokevirtual   #61  <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
	//   24   61:invokevirtual   #65  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
		return;
	//   25   64:return          
		Exception exception;
		exception;
	//   26   65:astore_1        
		lock.writeLock().unlock();
	//   27   66:getstatic       #24  <Field ReentrantReadWriteLock lock>
	//   28   69:invokevirtual   #61  <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
	//   29   72:invokevirtual   #65  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
		throw exception;
	//   30   75:aload_1         
	//   31   76:athrow          
	}

	public static void initStore()
	{
		if(initialized)
	//*   0    0:getstatic       #26  <Field boolean initialized>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			AppEventsLogger.getAnalyticsExecutor().execute(new Runnable() {

				public void run()
				{
					AnalyticsUserIDStore.initAndWait();
				//    0    0:invokestatic    #19  <Method void AnalyticsUserIDStore.access$000()>
				//    1    3:return          
				}

			}
);
	//    3    7:invokestatic    #92  <Method Executor AppEventsLogger.getAnalyticsExecutor()>
	//    4   10:new             #6   <Class AnalyticsUserIDStore$1>
	//    5   13:dup             
	//    6   14:invokespecial   #93  <Method void AnalyticsUserIDStore$1()>
	//    7   17:invokeinterface #99  <Method void Executor.execute(Runnable)>
			return;
	//    8   22:return          
		}
	}

	private static final String TAG = "AnalyticsUserIDStore";
	private static volatile boolean initialized = false;
	private static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	private static String userID;

	static 
	{
	//    0    0:new             #19  <Class ReentrantReadWriteLock>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void ReentrantReadWriteLock()>
	//    3    7:putstatic       #24  <Field ReentrantReadWriteLock lock>
	//    4   10:iconst_0        
	//    5   11:putstatic       #26  <Field boolean initialized>
	//*   6   14:return          
	}


/*
	static void access$000()
	{
		initAndWait();
	//    0    0:invokestatic    #32  <Method void initAndWait()>
		return;
	//    1    3:return          
	}

*/
}
