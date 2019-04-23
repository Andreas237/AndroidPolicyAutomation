// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.internal.AppEventUtility;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

class AnalyticsUserIDStore
{

	AnalyticsUserIDStore()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:return          
	}

	public static String getUserID()
	{
		if(!initialized)
	//*   0    0:getstatic       #31  <Field boolean initialized>
	//*   1    3:ifne            18
		{
			Log.w(TAG, "initStore should have been called before calling setUserID");
	//    2    6:getstatic       #48  <Field String TAG>
	//    3    9:ldc1            #50  <String "initStore should have been called before calling setUserID">
	//    4   11:invokestatic    #56  <Method int Log.w(String, String)>
	//    5   14:pop             
			initAndWait();
	//    6   15:invokestatic    #37  <Method void initAndWait()>
		}
		lock.readLock().lock();
	//    7   18:getstatic       #29  <Field ReentrantReadWriteLock lock>
	//    8   21:invokevirtual   #60  <Method java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock ReentrantReadWriteLock.readLock()>
	//    9   24:invokevirtual   #64  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.lock()>
		String s = userID;
	//   10   27:getstatic       #43  <Field String userID>
	//   11   30:astore_0        
		lock.readLock().unlock();
	//   12   31:getstatic       #29  <Field ReentrantReadWriteLock lock>
	//   13   34:invokevirtual   #60  <Method java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock ReentrantReadWriteLock.readLock()>
	//   14   37:invokevirtual   #67  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.unlock()>
		return s;
	//   15   40:aload_0         
	//   16   41:areturn         
		Exception exception;
		exception;
	//   17   42:astore_0        
		lock.readLock().unlock();
	//   18   43:getstatic       #29  <Field ReentrantReadWriteLock lock>
	//   19   46:invokevirtual   #60  <Method java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock ReentrantReadWriteLock.readLock()>
	//   20   49:invokevirtual   #67  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.unlock()>
		throw exception;
	//   21   52:aload_0         
	//   22   53:athrow          
	}

	private static void initAndWait()
	{
		if(initialized)
	//*   0    0:getstatic       #31  <Field boolean initialized>
	//*   1    3:ifeq            7
			return;
	//    2    6:return          
		lock.writeLock().lock();
	//    3    7:getstatic       #29  <Field ReentrantReadWriteLock lock>
	//    4   10:invokevirtual   #71  <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
	//    5   13:invokevirtual   #74  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.lock()>
		boolean flag = initialized;
	//    6   16:getstatic       #31  <Field boolean initialized>
	//    7   19:istore_0        
		if(flag)
	//*   8   20:iload_0         
	//*   9   21:ifeq            34
		{
			lock.writeLock().unlock();
	//   10   24:getstatic       #29  <Field ReentrantReadWriteLock lock>
	//   11   27:invokevirtual   #71  <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
	//   12   30:invokevirtual   #75  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
			return;
	//   13   33:return          
		}
		userID = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", ((String) (null)));
	//   14   34:invokestatic    #81  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//   15   37:invokestatic    #87  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
	//   16   40:ldc1            #12  <String "com.facebook.appevents.AnalyticsUserIDStore.userID">
	//   17   42:aconst_null     
	//   18   43:invokeinterface #93  <Method String SharedPreferences.getString(String, String)>
	//   19   48:putstatic       #43  <Field String userID>
		initialized = true;
	//   20   51:iconst_1        
	//   21   52:putstatic       #31  <Field boolean initialized>
		lock.writeLock().unlock();
	//   22   55:getstatic       #29  <Field ReentrantReadWriteLock lock>
	//   23   58:invokevirtual   #71  <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
	//   24   61:invokevirtual   #75  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
		return;
	//   25   64:return          
		Exception exception;
		exception;
	//   26   65:astore_1        
		lock.writeLock().unlock();
	//   27   66:getstatic       #29  <Field ReentrantReadWriteLock lock>
	//   28   69:invokevirtual   #71  <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
	//   29   72:invokevirtual   #75  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
		throw exception;
	//   30   75:aload_1         
	//   31   76:athrow          
	}

	public static void initStore()
	{
		if(initialized)
	//*   0    0:getstatic       #31  <Field boolean initialized>
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
	//    3    7:invokestatic    #100 <Method Executor AppEventsLogger.getAnalyticsExecutor()>
	//    4   10:new             #6   <Class AnalyticsUserIDStore$1>
	//    5   13:dup             
	//    6   14:invokespecial   #101 <Method void AnalyticsUserIDStore$1()>
	//    7   17:invokeinterface #107 <Method void Executor.execute(Runnable)>
			return;
	//    8   22:return          
		}
	}

	public static void setUserID(String s)
	{
		AppEventUtility.assertIsNotMainThread();
	//    0    0:invokestatic    #114 <Method void AppEventUtility.assertIsNotMainThread()>
		if(!initialized)
	//*   1    3:getstatic       #31  <Field boolean initialized>
	//*   2    6:ifne            21
		{
			Log.w(TAG, "initStore should have been called before calling setUserID");
	//    3    9:getstatic       #48  <Field String TAG>
	//    4   12:ldc1            #50  <String "initStore should have been called before calling setUserID">
	//    5   14:invokestatic    #56  <Method int Log.w(String, String)>
	//    6   17:pop             
			initAndWait();
	//    7   18:invokestatic    #37  <Method void initAndWait()>
		}
		AppEventsLogger.getAnalyticsExecutor().execute(new Runnable(s) {

			public void run()
			{
				AnalyticsUserIDStore.lock.writeLock().lock();
			//    0    0:invokestatic    #25  <Method ReentrantReadWriteLock AnalyticsUserIDStore.access$100()>
			//    1    3:invokevirtual   #31  <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
			//    2    6:invokevirtual   #36  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.lock()>
				AnalyticsUserIDStore.userID = id;
			//    3    9:aload_0         
			//    4   10:getfield        #16  <Field String val$id>
			//    5   13:invokestatic    #40  <Method String AnalyticsUserIDStore.access$202(String)>
			//    6   16:pop             
				android.content.SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
			//    7   17:invokestatic    #46  <Method android.content.Context FacebookSdk.getApplicationContext()>
			//    8   20:invokestatic    #52  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
			//    9   23:invokeinterface #58  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
			//   10   28:astore_1        
				editor.putString("com.facebook.appevents.AnalyticsUserIDStore.userID", AnalyticsUserIDStore.userID);
			//   11   29:aload_1         
			//   12   30:ldc1            #60  <String "com.facebook.appevents.AnalyticsUserIDStore.userID">
			//   13   32:invokestatic    #64  <Method String AnalyticsUserIDStore.access$200()>
			//   14   35:invokeinterface #70  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
			//   15   40:pop             
				editor.apply();
			//   16   41:aload_1         
			//   17   42:invokeinterface #73  <Method void android.content.SharedPreferences$Editor.apply()>
				AnalyticsUserIDStore.lock.writeLock().unlock();
			//   18   47:invokestatic    #25  <Method ReentrantReadWriteLock AnalyticsUserIDStore.access$100()>
			//   19   50:invokevirtual   #31  <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
			//   20   53:invokevirtual   #76  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
				return;
			//   21   56:return          
				Exception exception;
				exception;
			//   22   57:astore_1        
				AnalyticsUserIDStore.lock.writeLock().unlock();
			//   23   58:invokestatic    #25  <Method ReentrantReadWriteLock AnalyticsUserIDStore.access$100()>
			//   24   61:invokevirtual   #31  <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
			//   25   64:invokevirtual   #76  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
				throw exception;
			//   26   67:aload_1         
			//   27   68:athrow          
			}

			final String val$id;

			
			{
				id = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field String val$id>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    8   21:invokestatic    #100 <Method Executor AppEventsLogger.getAnalyticsExecutor()>
	//    9   24:new             #8   <Class AnalyticsUserIDStore$2>
	//   10   27:dup             
	//   11   28:aload_0         
	//   12   29:invokespecial   #116 <Method void AnalyticsUserIDStore$2(String)>
	//   13   32:invokeinterface #107 <Method void Executor.execute(Runnable)>
	//   14   37:return          
	}

	private static final String ANALYTICS_USER_ID_KEY = "com.facebook.appevents.AnalyticsUserIDStore.userID";
	private static final String TAG = "AnalyticsUserIDStore";
	private static volatile boolean initialized = false;
	private static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	private static String userID;

	static 
	{
	//    0    0:new             #24  <Class ReentrantReadWriteLock>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void ReentrantReadWriteLock()>
	//    3    7:putstatic       #29  <Field ReentrantReadWriteLock lock>
	//    4   10:iconst_0        
	//    5   11:putstatic       #31  <Field boolean initialized>
	//*   6   14:return          
	}


/*
	static void access$000()
	{
		initAndWait();
	//    0    0:invokestatic    #37  <Method void initAndWait()>
		return;
	//    1    3:return          
	}

*/


/*
	static ReentrantReadWriteLock access$100()
	{
		return lock;
	//    0    0:getstatic       #29  <Field ReentrantReadWriteLock lock>
	//    1    3:areturn         
	}

*/


/*
	static String access$200()
	{
		return userID;
	//    0    0:getstatic       #43  <Field String userID>
	//    1    3:areturn         
	}

*/


/*
	static String access$202(String s)
	{
		userID = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #43  <Field String userID>
		return s;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

*/
}
