// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.facebook.appevents:
//			AnalyticsUserIDStore

static final class AnalyticsUserIDStore$2
	implements Runnable
{

	public void run()
	{
		AnalyticsUserIDStore.access$100().writeLock().lock();
	//    0    0:invokestatic    #25  <Method ReentrantReadWriteLock AnalyticsUserIDStore.access$100()>
	//    1    3:invokevirtual   #31  <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
	//    2    6:invokevirtual   #36  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.lock()>
		AnalyticsUserIDStore.access$202(val$id);
	//    3    9:aload_0         
	//    4   10:getfield        #16  <Field String val$id>
	//    5   13:invokestatic    #40  <Method String AnalyticsUserIDStore.access$202(String)>
	//    6   16:pop             
		android.content.r r = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
	//    7   17:invokestatic    #46  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    8   20:invokestatic    #52  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
	//    9   23:invokeinterface #58  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   10   28:astore_1        
		r.putString("com.facebook.appevents.AnalyticsUserIDStore.userID", AnalyticsUserIDStore.access$200());
	//   11   29:aload_1         
	//   12   30:ldc1            #60  <String "com.facebook.appevents.AnalyticsUserIDStore.userID">
	//   13   32:invokestatic    #64  <Method String AnalyticsUserIDStore.access$200()>
	//   14   35:invokeinterface #70  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   15   40:pop             
		r.apply();
	//   16   41:aload_1         
	//   17   42:invokeinterface #73  <Method void android.content.SharedPreferences$Editor.apply()>
		AnalyticsUserIDStore.access$100().writeLock().unlock();
	//   18   47:invokestatic    #25  <Method ReentrantReadWriteLock AnalyticsUserIDStore.access$100()>
	//   19   50:invokevirtual   #31  <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
	//   20   53:invokevirtual   #76  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
		return;
	//   21   56:return          
		Exception exception;
		exception;
	//   22   57:astore_1        
		AnalyticsUserIDStore.access$100().writeLock().unlock();
	//   23   58:invokestatic    #25  <Method ReentrantReadWriteLock AnalyticsUserIDStore.access$100()>
	//   24   61:invokevirtual   #31  <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
	//   25   64:invokevirtual   #76  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
		throw exception;
	//   26   67:aload_1         
	//   27   68:athrow          
	}

	final String val$id;

	AnalyticsUserIDStore$2(String s)
	{
		val$id = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field String val$id>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
