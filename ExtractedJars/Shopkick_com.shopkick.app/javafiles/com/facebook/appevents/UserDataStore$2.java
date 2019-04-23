// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.facebook.appevents:
//			UserDataStore

static final class UserDataStore$2
	implements Runnable
{

	public void run()
	{
		UserDataStore.access$100().writeLock().lock();
	//    0    0:invokestatic    #25  <Method ReentrantReadWriteLock UserDataStore.access$100()>
	//    1    3:invokevirtual   #31  <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
	//    2    6:invokevirtual   #36  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.lock()>
		UserDataStore.access$202(UserDataStore.access$300(val$ud));
	//    3    9:aload_0         
	//    4   10:getfield        #16  <Field Bundle val$ud>
	//    5   13:invokestatic    #40  <Method String UserDataStore.access$300(Bundle)>
	//    6   16:invokestatic    #44  <Method String UserDataStore.access$202(String)>
	//    7   19:pop             
		android.content.s.Editor editor = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
	//    8   20:invokestatic    #50  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    9   23:invokestatic    #56  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
	//   10   26:invokeinterface #62  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   11   31:astore_1        
		editor.putString("com.facebook.appevents.UserDataStore.userData", UserDataStore.access$200());
	//   12   32:aload_1         
	//   13   33:ldc1            #64  <String "com.facebook.appevents.UserDataStore.userData">
	//   14   35:invokestatic    #68  <Method String UserDataStore.access$200()>
	//   15   38:invokeinterface #74  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   16   43:pop             
		editor.apply();
	//   17   44:aload_1         
	//   18   45:invokeinterface #77  <Method void android.content.SharedPreferences$Editor.apply()>
		UserDataStore.access$100().writeLock().unlock();
	//   19   50:invokestatic    #25  <Method ReentrantReadWriteLock UserDataStore.access$100()>
	//   20   53:invokevirtual   #31  <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
	//   21   56:invokevirtual   #80  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
		return;
	//   22   59:return          
		Exception exception;
		exception;
	//   23   60:astore_1        
		UserDataStore.access$100().writeLock().unlock();
	//   24   61:invokestatic    #25  <Method ReentrantReadWriteLock UserDataStore.access$100()>
	//   25   64:invokevirtual   #31  <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
	//   26   67:invokevirtual   #80  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
		throw exception;
	//   27   70:aload_1         
	//   28   71:athrow          
	}

	final Bundle val$ud;

	UserDataStore$2(Bundle bundle)
	{
		val$ud = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Bundle val$ud>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
