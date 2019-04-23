// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.content.SharedPreferences;

public class Preferences
{
	private static class LastCancelAllLiveData extends MutableLiveData
		implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
	{

		protected void onActive()
		{
			super.onActive();
		//    0    0:aload_0         
		//    1    1:invokespecial   #45  <Method void MutableLiveData.onActive()>
			mSharedPreferences.registerOnSharedPreferenceChangeListener(((android.content.SharedPreferences.OnSharedPreferenceChangeListener) (this)));
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
			mSharedPreferences.unregisterOnSharedPreferenceChangeListener(((android.content.SharedPreferences.OnSharedPreferenceChangeListener) (this)));
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

		LastCancelAllLiveData(SharedPreferences sharedpreferences)
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


	public Preferences(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field Context mContext>
	//    5    9:return          
	}

	public Preferences(SharedPreferences sharedpreferences)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		mSharedPreferences = sharedpreferences;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field SharedPreferences mSharedPreferences>
	//    5    9:return          
	}

	private SharedPreferences getSharedPreferences()
	{
		androidx/work/impl/utils/Preferences;
	//    0    0:ldc1            #2   <Class Preferences>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		SharedPreferences sharedpreferences;
		if(mSharedPreferences == null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #39  <Field SharedPreferences mSharedPreferences>
	//*   4    7:ifnonnull       24
			mSharedPreferences = mContext.getSharedPreferences("androidx.work.util.preferences", 0);
	//    5   10:aload_0         
	//    6   11:aload_0         
	//    7   12:getfield        #33  <Field Context mContext>
	//    8   15:ldc1            #21  <String "androidx.work.util.preferences">
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #47  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   11   21:putfield        #39  <Field SharedPreferences mSharedPreferences>
		sharedpreferences = mSharedPreferences;
	//   12   24:aload_0         
	//   13   25:getfield        #39  <Field SharedPreferences mSharedPreferences>
	//   14   28:astore_1        
		androidx/work/impl/utils/Preferences;
	//   15   29:ldc1            #2   <Class Preferences>
		JVM INSTR monitorexit ;
	//   16   31:monitorexit     
		return sharedpreferences;
	//   17   32:aload_1         
	//   18   33:areturn         
		Exception exception;
		exception;
	//   19   34:astore_1        
		androidx/work/impl/utils/Preferences;
	//   20   35:ldc1            #2   <Class Preferences>
		JVM INSTR monitorexit ;
	//   21   37:monitorexit     
		throw exception;
	//   22   38:aload_1         
	//   23   39:athrow          
	}

	public long getLastCancelAllTimeMillis()
	{
		return getSharedPreferences().getLong("last_cancel_all_time_ms", 0L);
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method SharedPreferences getSharedPreferences()>
	//    2    4:ldc1            #15  <String "last_cancel_all_time_ms">
	//    3    6:lconst_0        
	//    4    7:invokeinterface #57  <Method long SharedPreferences.getLong(String, long)>
	//    5   12:lreturn         
	}

	public LiveData getLastCancelAllTimeMillisLiveData()
	{
		return ((LiveData) (new LastCancelAllLiveData(getSharedPreferences())));
	//    0    0:new             #6   <Class Preferences$LastCancelAllLiveData>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #51  <Method SharedPreferences getSharedPreferences()>
	//    4    8:invokespecial   #61  <Method void Preferences$LastCancelAllLiveData(SharedPreferences)>
	//    5   11:areturn         
	}

	public boolean needsReschedule()
	{
		return getSharedPreferences().getBoolean("reschedule_needed", false);
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method SharedPreferences getSharedPreferences()>
	//    2    4:ldc1            #18  <String "reschedule_needed">
	//    3    6:iconst_0        
	//    4    7:invokeinterface #69  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    5   12:ireturn         
	}

	public void setLastCancelAllTimeMillis(long l)
	{
		getSharedPreferences().edit().putLong("last_cancel_all_time_ms", l).apply();
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method SharedPreferences getSharedPreferences()>
	//    2    4:invokeinterface #75  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:ldc1            #15  <String "last_cancel_all_time_ms">
	//    4   11:lload_1         
	//    5   12:invokeinterface #81  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//    6   17:invokeinterface #84  <Method void android.content.SharedPreferences$Editor.apply()>
	//    7   22:return          
	}

	public void setNeedsReschedule(boolean flag)
	{
		getSharedPreferences().edit().putBoolean("reschedule_needed", flag).apply();
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method SharedPreferences getSharedPreferences()>
	//    2    4:invokeinterface #75  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:ldc1            #18  <String "reschedule_needed">
	//    4   11:iload_1         
	//    5   12:invokeinterface #90  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    6   17:invokeinterface #84  <Method void android.content.SharedPreferences$Editor.apply()>
	//    7   22:return          
	}

	private static final String KEY_LAST_CANCEL_ALL_TIME_MS = "last_cancel_all_time_ms";
	private static final String KEY_RESCHEDULE_NEEDED = "reschedule_needed";
	private static final String PREFERENCES_FILE_NAME = "androidx.work.util.preferences";
	private Context mContext;
	private SharedPreferences mSharedPreferences;
}
