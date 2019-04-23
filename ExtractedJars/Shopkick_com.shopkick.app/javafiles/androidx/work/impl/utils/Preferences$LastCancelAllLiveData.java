// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import android.arch.lifecycle.MutableLiveData;
import android.content.SharedPreferences;

// Referenced classes of package androidx.work.impl.utils:
//			Preferences

private static class Preferences$LastCancelAllLiveData extends MutableLiveData
	implements android.content.ceChangeListener
{

	protected void onActive()
	{
		super.onActive();
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void MutableLiveData.onActive()>
		mSharedPreferences.registerOnSharedPreferenceChangeListener(((android.content.ceChangeListener) (this)));
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field SharedPreferences mSharedPreferences>
	//    4    8:aload_0         
	//    5    9:invokeinterface #49  <Method void SharedPreferences.registerOnSharedPreferenceChangeListener(android.content.SharedPreferences$OnSharedPreferenceChangeListener)>
	//    6   14:return          
	}

	protected void onInactive()
	{
		super.onInactive();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void MutableLiveData.onInactive()>
		mSharedPreferences.unregisterOnSharedPreferenceChangeListener(((android.content.ceChangeListener) (this)));
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field SharedPreferences mSharedPreferences>
	//    4    8:aload_0         
	//    5    9:invokeinterface #55  <Method void SharedPreferences.unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences$OnSharedPreferenceChangeListener)>
	//    6   14:return          
	}

	public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
	{
		if("last_cancel_all_time_ms".equals(((Object) (s))))
	//*   0    0:ldc1            #23  <String "last_cancel_all_time_ms">
	//*   1    2:aload_2         
	//*   2    3:invokevirtual   #63  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            43
		{
			long l = sharedpreferences.getLong(s, 0L);
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:lconst_0        
	//    7   12:invokeinterface #29  <Method long SharedPreferences.getLong(String, long)>
	//    8   17:lstore_3        
			if(mLastCancelAllTimeMillis != l)
	//*   9   18:aload_0         
	//*  10   19:getfield        #31  <Field long mLastCancelAllTimeMillis>
	//*  11   22:lload_3         
	//*  12   23:lcmp            
	//*  13   24:ifeq            43
			{
				mLastCancelAllTimeMillis = l;
	//   14   27:aload_0         
	//   15   28:lload_3         
	//   16   29:putfield        #31  <Field long mLastCancelAllTimeMillis>
				setValue(((Object) (Long.valueOf(mLastCancelAllTimeMillis))));
	//   17   32:aload_0         
	//   18   33:aload_0         
	//   19   34:getfield        #31  <Field long mLastCancelAllTimeMillis>
	//   20   37:invokestatic    #37  <Method Long Long.valueOf(long)>
	//   21   40:invokevirtual   #66  <Method void setValue(Object)>
			}
		}
	//   22   43:return          
	}

	private long mLastCancelAllTimeMillis;
	private SharedPreferences mSharedPreferences;

	Preferences$LastCancelAllLiveData(SharedPreferences sharedpreferences)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void MutableLiveData()>
		mSharedPreferences = sharedpreferences;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field SharedPreferences mSharedPreferences>
		mLastCancelAllTimeMillis = mSharedPreferences.getLong("last_cancel_all_time_ms", 0L);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #21  <Field SharedPreferences mSharedPreferences>
	//    8   14:ldc1            #23  <String "last_cancel_all_time_ms">
	//    9   16:lconst_0        
	//   10   17:invokeinterface #29  <Method long SharedPreferences.getLong(String, long)>
	//   11   22:putfield        #31  <Field long mLastCancelAllTimeMillis>
		postValue(((Object) (Long.valueOf(mLastCancelAllTimeMillis))));
	//   12   25:aload_0         
	//   13   26:aload_0         
	//   14   27:getfield        #31  <Field long mLastCancelAllTimeMillis>
	//   15   30:invokestatic    #37  <Method Long Long.valueOf(long)>
	//   16   33:invokevirtual   #41  <Method void postValue(Object)>
	//   17   36:return          
	}
}
