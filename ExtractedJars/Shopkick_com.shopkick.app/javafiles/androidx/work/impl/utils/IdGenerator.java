// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class IdGenerator
{

	public IdGenerator(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field Context mContext>
	//    5    9:return          
	}

	private void loadPreferencesIfNecessary()
	{
		if(!mLoadedPreferences)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field boolean mLoadedPreferences>
	//*   2    4:ifne            26
		{
			mSharedPrefs = mContext.getSharedPreferences("androidx.work.util.id", 0);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field Context mContext>
	//    6   12:ldc1            #21  <String "androidx.work.util.id">
	//    7   14:iconst_0        
	//    8   15:invokevirtual   #44  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    9   18:putfield        #46  <Field SharedPreferences mSharedPrefs>
			mLoadedPreferences = true;
	//   10   21:aload_0         
	//   11   22:iconst_1        
	//   12   23:putfield        #38  <Field boolean mLoadedPreferences>
		}
	//   13   26:return          
	}

	private int nextId(String s)
	{
		SharedPreferences sharedpreferences = mSharedPrefs;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SharedPreferences mSharedPrefs>
	//    2    4:astore          4
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		int j = sharedpreferences.getInt(s, 0);
	//    5    8:aload           4
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:invokeinterface #54  <Method int SharedPreferences.getInt(String, int)>
	//    9   17:istore_3        
		if(j != 0x7fffffff)
	//*  10   18:iload_3         
	//*  11   19:ldc1            #55  <Int 0x7fffffff>
	//*  12   21:icmpne          27
	//*  13   24:goto            31
			i = j + 1;
	//   14   27:iload_3         
	//   15   28:iconst_1        
	//   16   29:iadd            
	//   17   30:istore_2        
		update(s, i);
	//   18   31:aload_0         
	//   19   32:aload_1         
	//   20   33:iload_2         
	//   21   34:invokespecial   #59  <Method void update(String, int)>
		return j;
	//   22   37:iload_3         
	//   23   38:ireturn         
	}

	private void update(String s, int i)
	{
		mSharedPrefs.edit().putInt(s, i).apply();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field SharedPreferences mSharedPrefs>
	//    2    4:invokeinterface #63  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:aload_1         
	//    4   10:iload_2         
	//    5   11:invokeinterface #69  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//    6   16:invokeinterface #72  <Method void android.content.SharedPreferences$Editor.apply()>
	//    7   21:return          
	}

	public int nextAlarmManagerId()
	{
		androidx/work/impl/utils/IdGenerator;
	//    0    0:ldc1            #2   <Class IdGenerator>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		int i;
		loadPreferencesIfNecessary();
	//    2    3:aload_0         
	//    3    4:invokespecial   #76  <Method void loadPreferencesIfNecessary()>
		i = nextId("next_alarm_manager_id");
	//    4    7:aload_0         
	//    5    8:ldc1            #15  <String "next_alarm_manager_id">
	//    6   10:invokespecial   #78  <Method int nextId(String)>
	//    7   13:istore_1        
		androidx/work/impl/utils/IdGenerator;
	//    8   14:ldc1            #2   <Class IdGenerator>
		JVM INSTR monitorexit ;
	//    9   16:monitorexit     
		return i;
	//   10   17:iload_1         
	//   11   18:ireturn         
		Exception exception;
		exception;
	//   12   19:astore_2        
		androidx/work/impl/utils/IdGenerator;
	//   13   20:ldc1            #2   <Class IdGenerator>
		JVM INSTR monitorexit ;
	//   14   22:monitorexit     
		throw exception;
	//   15   23:aload_2         
	//   16   24:athrow          
	}

	public int nextJobSchedulerIdWithRange(int i, int j)
	{
		androidx/work/impl/utils/IdGenerator;
	//    0    0:ldc1            #2   <Class IdGenerator>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		int k;
		loadPreferencesIfNecessary();
	//    2    3:aload_0         
	//    3    4:invokespecial   #76  <Method void loadPreferencesIfNecessary()>
		k = nextId("next_job_scheduler_id");
	//    4    7:aload_0         
	//    5    8:ldc1            #18  <String "next_job_scheduler_id">
	//    6   10:invokespecial   #78  <Method int nextId(String)>
	//    7   13:istore_3        
		if(k >= i && k <= j)
	//*   8   14:iload_3         
	//*   9   15:iload_1         
	//*  10   16:icmplt          27
	//*  11   19:iload_3         
	//*  12   20:iload_2         
	//*  13   21:icmple          49
			break MISSING_BLOCK_LABEL_49;
	//   14   24:goto            27
		update("next_job_scheduler_id", i + 1);
	//   15   27:aload_0         
	//   16   28:ldc1            #18  <String "next_job_scheduler_id">
	//   17   30:iload_1         
	//   18   31:iconst_1        
	//   19   32:iadd            
	//   20   33:invokespecial   #59  <Method void update(String, int)>
_L1:
		androidx/work/impl/utils/IdGenerator;
	//   21   36:ldc1            #2   <Class IdGenerator>
		JVM INSTR monitorexit ;
	//   22   38:monitorexit     
		return i;
	//   23   39:iload_1         
	//   24   40:ireturn         
		Exception exception;
		exception;
	//   25   41:astore          4
		androidx/work/impl/utils/IdGenerator;
	//   26   43:ldc1            #2   <Class IdGenerator>
		JVM INSTR monitorexit ;
	//   27   45:monitorexit     
		throw exception;
	//   28   46:aload           4
	//   29   48:athrow          
		i = k;
	//   30   49:iload_3         
	//   31   50:istore_1        
		  goto _L1
	//*  32   51:goto            36
	}

	public static final int INITIAL_ID = 0;
	static final String NEXT_ALARM_MANAGER_ID_KEY = "next_alarm_manager_id";
	static final String NEXT_JOB_SCHEDULER_ID_KEY = "next_job_scheduler_id";
	static final String PREFERENCE_FILE_KEY = "androidx.work.util.id";
	private final Context mContext;
	private boolean mLoadedPreferences;
	private SharedPreferences mSharedPrefs;
}
