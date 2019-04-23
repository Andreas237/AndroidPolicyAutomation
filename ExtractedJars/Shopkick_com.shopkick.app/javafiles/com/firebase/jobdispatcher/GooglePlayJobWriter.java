// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.net.Uri;
import android.os.Bundle;
import java.util.List;

// Referenced classes of package com.firebase.jobdispatcher:
//			JobCoder, JobParameters, Constraint, ObservedUri, 
//			RetryStrategy, Trigger, GooglePlayReceiver

final class GooglePlayJobWriter
{

	GooglePlayJobWriter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #74  <Class JobCoder>
	//    4    8:dup             
	//    5    9:ldc1            #76  <String "com.firebase.jobdispatcher.">
	//    6   11:invokespecial   #79  <Method void JobCoder(String)>
	//    7   14:putfield        #81  <Field JobCoder jobCoder>
	//    8   17:return          
	}

	private static int convertConstraintsToLegacyNetConstant(int i)
	{
		byte byte0 = 2;
	//    0    0:iconst_2        
	//    1    1:istore_1        
		if((i & 2) == 2)
	//*   2    2:iload_0         
	//*   3    3:iconst_2        
	//*   4    4:iand            
	//*   5    5:iconst_2        
	//*   6    6:icmpne          11
			byte0 = 0;
	//    7    9:iconst_0        
	//    8   10:istore_1        
		if((i & 1) == 1)
	//*   9   11:iload_0         
	//*  10   12:iconst_1        
	//*  11   13:iand            
	//*  12   14:iconst_1        
	//*  13   15:icmpne          20
			return 1;
	//   14   18:iconst_1        
	//   15   19:ireturn         
		else
			return ((int) (byte0));
	//   16   20:iload_1         
	//   17   21:ireturn         
	}

	private static int convertRetryPolicyToLegacyVersion(int i)
	{
		return i == 2 ? 1 : 0;
	//    0    0:iload_0         
	//    1    1:iconst_2        
	//    2    2:icmpeq          7
	//    3    5:iconst_0        
	//    4    6:ireturn         
	//    5    7:iconst_1        
	//    6    8:ireturn         
	}

	private static void writeConstraintsToBundle(JobParameters jobparameters, Bundle bundle)
	{
		int i = Constraint.compact(jobparameters.getConstraints());
	//    0    0:aload_0         
	//    1    1:invokeinterface #93  <Method int[] JobParameters.getConstraints()>
	//    2    6:invokestatic    #99  <Method int Constraint.compact(int[])>
	//    3    9:istore_2        
		boolean flag1 = true;
	//    4   10:iconst_1        
	//    5   11:istore          4
		boolean flag;
		if((i & 4) == 4)
	//*   6   13:iload_2         
	//*   7   14:iconst_4        
	//*   8   15:iand            
	//*   9   16:iconst_4        
	//*  10   17:icmpne          25
			flag = true;
	//   11   20:iconst_1        
	//   12   21:istore_3        
		else
	//*  13   22:goto            27
			flag = false;
	//   14   25:iconst_0        
	//   15   26:istore_3        
		bundle.putBoolean("requiresCharging", flag);
	//   16   27:aload_1         
	//   17   28:ldc1            #27  <String "requiresCharging">
	//   18   30:iload_3         
	//   19   31:invokevirtual   #105 <Method void Bundle.putBoolean(String, boolean)>
		if((i & 8) == 8)
	//*  20   34:iload_2         
	//*  21   35:bipush          8
	//*  22   37:iand            
	//*  23   38:bipush          8
	//*  24   40:icmpne          49
			flag = flag1;
	//   25   43:iload           4
	//   26   45:istore_3        
		else
	//*  27   46:goto            51
			flag = false;
	//   28   49:iconst_0        
	//   29   50:istore_3        
		bundle.putBoolean("requiresIdle", flag);
	//   30   51:aload_1         
	//   31   52:ldc1            #30  <String "requiresIdle">
	//   32   54:iload_3         
	//   33   55:invokevirtual   #105 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putInt("requiredNetwork", convertConstraintsToLegacyNetConstant(i));
	//   34   58:aload_1         
	//   35   59:ldc1            #24  <String "requiredNetwork">
	//   36   61:iload_2         
	//   37   62:invokestatic    #107 <Method int convertConstraintsToLegacyNetConstant(int)>
	//   38   65:invokevirtual   #111 <Method void Bundle.putInt(String, int)>
	//   39   68:return          
	}

	private static void writeContentUriTriggerToBundle(Bundle bundle, JobTrigger.ContentUriTrigger contenturitrigger)
	{
		bundle.putInt("trigger_type", 3);
	//    0    0:aload_0         
	//    1    1:ldc1            #51  <String "trigger_type">
	//    2    3:iconst_3        
	//    3    4:invokevirtual   #111 <Method void Bundle.putInt(String, int)>
		int j = contenturitrigger.getUris().size();
	//    4    7:aload_1         
	//    5    8:invokevirtual   #119 <Method List JobTrigger$ContentUriTrigger.getUris()>
	//    6   11:invokeinterface #125 <Method int List.size()>
	//    7   16:istore_3        
		int ai[] = new int[j];
	//    8   17:iload_3         
	//    9   18:newarray        int[]
	//   10   20:astore          4
		Uri auri[] = new Uri[j];
	//   11   22:iload_3         
	//   12   23:anewarray       Uri[]
	//   13   26:astore          5
		for(int i = 0; i < j; i++)
	//*  14   28:iconst_0        
	//*  15   29:istore_2        
	//*  16   30:iload_2         
	//*  17   31:iload_3         
	//*  18   32:icmpge          75
		{
			ObservedUri observeduri = (ObservedUri)contenturitrigger.getUris().get(i);
	//   19   35:aload_1         
	//   20   36:invokevirtual   #119 <Method List JobTrigger$ContentUriTrigger.getUris()>
	//   21   39:iload_2         
	//   22   40:invokeinterface #131 <Method Object List.get(int)>
	//   23   45:checkcast       #133 <Class ObservedUri>
	//   24   48:astore          6
			ai[i] = observeduri.getFlags();
	//   25   50:aload           4
	//   26   52:iload_2         
	//   27   53:aload           6
	//   28   55:invokevirtual   #136 <Method int ObservedUri.getFlags()>
	//   29   58:iastore         
			auri[i] = observeduri.getUri();
	//   30   59:aload           5
	//   31   61:iload_2         
	//   32   62:aload           6
	//   33   64:invokevirtual   #140 <Method Uri ObservedUri.getUri()>
	//   34   67:aastore         
		}

	//   35   68:iload_2         
	//   36   69:iconst_1        
	//   37   70:iadd            
	//   38   71:istore_2        
	//*  39   72:goto            30
		bundle.putIntArray("content_uri_flags_array", ai);
	//   40   75:aload_0         
	//   41   76:ldc1            #142 <String "content_uri_flags_array">
	//   42   78:aload           4
	//   43   80:invokevirtual   #146 <Method void Bundle.putIntArray(String, int[])>
		bundle.putParcelableArray("content_uri_array", ((android.os.Parcelable []) (auri)));
	//   44   83:aload_0         
	//   45   84:ldc1            #148 <String "content_uri_array">
	//   46   86:aload           5
	//   47   88:invokevirtual   #152 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
	//   48   91:return          
	}

	private static void writeExecutionWindowTriggerToBundle(JobParameters jobparameters, Bundle bundle, JobTrigger.ExecutionWindowTrigger executionwindowtrigger)
	{
		bundle.putInt("trigger_type", 1);
	//    0    0:aload_1         
	//    1    1:ldc1            #51  <String "trigger_type">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #111 <Method void Bundle.putInt(String, int)>
		if(jobparameters.isRecurring())
	//*   4    7:aload_0         
	//*   5    8:invokeinterface #158 <Method boolean JobParameters.isRecurring()>
	//*   6   13:ifeq            44
		{
			bundle.putLong("period", executionwindowtrigger.getWindowEnd());
	//    7   16:aload_1         
	//    8   17:ldc1            #60  <String "period">
	//    9   19:aload_2         
	//   10   20:invokevirtual   #163 <Method int JobTrigger$ExecutionWindowTrigger.getWindowEnd()>
	//   11   23:i2l             
	//   12   24:invokevirtual   #167 <Method void Bundle.putLong(String, long)>
			bundle.putLong("period_flex", executionwindowtrigger.getWindowEnd() - executionwindowtrigger.getWindowStart());
	//   13   27:aload_1         
	//   14   28:ldc1            #57  <String "period_flex">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #163 <Method int JobTrigger$ExecutionWindowTrigger.getWindowEnd()>
	//   17   34:aload_2         
	//   18   35:invokevirtual   #170 <Method int JobTrigger$ExecutionWindowTrigger.getWindowStart()>
	//   19   38:isub            
	//   20   39:i2l             
	//   21   40:invokevirtual   #167 <Method void Bundle.putLong(String, long)>
			return;
	//   22   43:return          
		} else
		{
			bundle.putLong("window_start", executionwindowtrigger.getWindowStart());
	//   23   44:aload_1         
	//   24   45:ldc1            #63  <String "window_start">
	//   25   47:aload_2         
	//   26   48:invokevirtual   #170 <Method int JobTrigger$ExecutionWindowTrigger.getWindowStart()>
	//   27   51:i2l             
	//   28   52:invokevirtual   #167 <Method void Bundle.putLong(String, long)>
			bundle.putLong("window_end", executionwindowtrigger.getWindowEnd());
	//   29   55:aload_1         
	//   30   56:ldc1            #54  <String "window_end">
	//   31   58:aload_2         
	//   32   59:invokevirtual   #163 <Method int JobTrigger$ExecutionWindowTrigger.getWindowEnd()>
	//   33   62:i2l             
	//   34   63:invokevirtual   #167 <Method void Bundle.putLong(String, long)>
			return;
	//   35   66:return          
		}
	}

	private static void writeImmediateTriggerToBundle(Bundle bundle)
	{
		bundle.putInt("trigger_type", 2);
	//    0    0:aload_0         
	//    1    1:ldc1            #51  <String "trigger_type">
	//    2    3:iconst_2        
	//    3    4:invokevirtual   #111 <Method void Bundle.putInt(String, int)>
		bundle.putLong("window_start", 0L);
	//    4    7:aload_0         
	//    5    8:ldc1            #63  <String "window_start">
	//    6   10:lconst_0        
	//    7   11:invokevirtual   #167 <Method void Bundle.putLong(String, long)>
		bundle.putLong("window_end", 1L);
	//    8   14:aload_0         
	//    9   15:ldc1            #54  <String "window_end">
	//   10   17:lconst_1        
	//   11   18:invokevirtual   #167 <Method void Bundle.putLong(String, long)>
	//   12   21:return          
	}

	private static void writeRetryStrategyToBundle(JobParameters jobparameters, Bundle bundle)
	{
		jobparameters = ((JobParameters) (jobparameters.getRetryStrategy()));
	//    0    0:aload_0         
	//    1    1:invokeinterface #177 <Method RetryStrategy JobParameters.getRetryStrategy()>
	//    2    6:astore_0        
		Bundle bundle1 = new Bundle();
	//    3    7:new             #101 <Class Bundle>
	//    4   10:dup             
	//    5   11:invokespecial   #178 <Method void Bundle()>
	//    6   14:astore_2        
		bundle1.putInt("retry_policy", convertRetryPolicyToLegacyVersion(((RetryStrategy) (jobparameters)).getPolicy()));
	//    7   15:aload_2         
	//    8   16:ldc1            #42  <String "retry_policy">
	//    9   18:aload_0         
	//   10   19:invokevirtual   #183 <Method int RetryStrategy.getPolicy()>
	//   11   22:invokestatic    #185 <Method int convertRetryPolicyToLegacyVersion(int)>
	//   12   25:invokevirtual   #111 <Method void Bundle.putInt(String, int)>
		bundle1.putInt("initial_backoff_seconds", ((RetryStrategy) (jobparameters)).getInitialBackoff());
	//   13   28:aload_2         
	//   14   29:ldc1            #36  <String "initial_backoff_seconds">
	//   15   31:aload_0         
	//   16   32:invokevirtual   #188 <Method int RetryStrategy.getInitialBackoff()>
	//   17   35:invokevirtual   #111 <Method void Bundle.putInt(String, int)>
		bundle1.putInt("maximum_backoff_seconds", ((RetryStrategy) (jobparameters)).getMaximumBackoff());
	//   18   38:aload_2         
	//   19   39:ldc1            #39  <String "maximum_backoff_seconds">
	//   20   41:aload_0         
	//   21   42:invokevirtual   #191 <Method int RetryStrategy.getMaximumBackoff()>
	//   22   45:invokevirtual   #111 <Method void Bundle.putInt(String, int)>
		bundle.putBundle("retryStrategy", bundle1);
	//   23   48:aload_1         
	//   24   49:ldc1            #33  <String "retryStrategy">
	//   25   51:aload_2         
	//   26   52:invokevirtual   #195 <Method void Bundle.putBundle(String, Bundle)>
	//   27   55:return          
	}

	private static void writeTriggerToBundle(JobParameters jobparameters, Bundle bundle)
	{
		JobTrigger jobtrigger = jobparameters.getTrigger();
	//    0    0:aload_0         
	//    1    1:invokeinterface #200 <Method JobTrigger JobParameters.getTrigger()>
	//    2    6:astore_2        
		if(jobtrigger == Trigger.NOW)
	//*   3    7:aload_2         
	//*   4    8:getstatic       #206 <Field JobTrigger$ImmediateTrigger Trigger.NOW>
	//*   5   11:if_acmpne       19
		{
			writeImmediateTriggerToBundle(bundle);
	//    6   14:aload_1         
	//    7   15:invokestatic    #208 <Method void writeImmediateTriggerToBundle(Bundle)>
			return;
	//    8   18:return          
		}
		if(jobtrigger instanceof JobTrigger.ExecutionWindowTrigger)
	//*   9   19:aload_2         
	//*  10   20:instanceof      #160 <Class JobTrigger$ExecutionWindowTrigger>
	//*  11   23:ifeq            36
		{
			writeExecutionWindowTriggerToBundle(jobparameters, bundle, (JobTrigger.ExecutionWindowTrigger)jobtrigger);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:checkcast       #160 <Class JobTrigger$ExecutionWindowTrigger>
	//   16   32:invokestatic    #210 <Method void writeExecutionWindowTriggerToBundle(JobParameters, Bundle, JobTrigger$ExecutionWindowTrigger)>
			return;
	//   17   35:return          
		}
		if(jobtrigger instanceof JobTrigger.ContentUriTrigger)
	//*  18   36:aload_2         
	//*  19   37:instanceof      #115 <Class JobTrigger$ContentUriTrigger>
	//*  20   40:ifeq            52
		{
			writeContentUriTriggerToBundle(bundle, (JobTrigger.ContentUriTrigger)jobtrigger);
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:checkcast       #115 <Class JobTrigger$ContentUriTrigger>
	//   24   48:invokestatic    #212 <Method void writeContentUriTriggerToBundle(Bundle, JobTrigger$ContentUriTrigger)>
			return;
	//   25   51:return          
		} else
		{
			jobparameters = ((JobParameters) (new StringBuilder()));
	//   26   52:new             #214 <Class StringBuilder>
	//   27   55:dup             
	//   28   56:invokespecial   #215 <Method void StringBuilder()>
	//   29   59:astore_0        
			((StringBuilder) (jobparameters)).append("Unknown trigger: ");
	//   30   60:aload_0         
	//   31   61:ldc1            #217 <String "Unknown trigger: ">
	//   32   63:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
	//   33   66:pop             
			((StringBuilder) (jobparameters)).append(((Object) (((Object) (jobtrigger)).getClass())));
	//   34   67:aload_0         
	//   35   68:aload_2         
	//   36   69:invokevirtual   #225 <Method Class Object.getClass()>
	//   37   72:invokevirtual   #228 <Method StringBuilder StringBuilder.append(Object)>
	//   38   75:pop             
			throw new IllegalArgumentException(((StringBuilder) (jobparameters)).toString());
	//   39   76:new             #230 <Class IllegalArgumentException>
	//   40   79:dup             
	//   41   80:aload_0         
	//   42   81:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   43   84:invokespecial   #235 <Method void IllegalArgumentException(String)>
	//   44   87:athrow          
		}
	}

	public Bundle writeToBundle(JobParameters jobparameters, Bundle bundle)
	{
		bundle.putString("tag", jobparameters.getTag());
	//    0    0:aload_2         
	//    1    1:ldc1            #48  <String "tag">
	//    2    3:aload_1         
	//    3    4:invokeinterface #240 <Method String JobParameters.getTag()>
	//    4    9:invokevirtual   #244 <Method void Bundle.putString(String, String)>
		bundle.putBoolean("update_current", jobparameters.shouldReplaceCurrent());
	//    5   12:aload_2         
	//    6   13:ldc1            #66  <String "update_current">
	//    7   15:aload_1         
	//    8   16:invokeinterface #247 <Method boolean JobParameters.shouldReplaceCurrent()>
	//    9   21:invokevirtual   #105 <Method void Bundle.putBoolean(String, boolean)>
		boolean flag;
		if(jobparameters.getLifetime() == 2)
	//*  10   24:aload_1         
	//*  11   25:invokeinterface #250 <Method int JobParameters.getLifetime()>
	//*  12   30:iconst_2        
	//*  13   31:icmpne          39
			flag = true;
	//   14   34:iconst_1        
	//   15   35:istore_3        
		else
	//*  16   36:goto            41
			flag = false;
	//   17   39:iconst_0        
	//   18   40:istore_3        
		bundle.putBoolean("persisted", flag);
	//   19   41:aload_2         
	//   20   42:ldc1            #21  <String "persisted">
	//   21   44:iload_3         
	//   22   45:invokevirtual   #105 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putString("service", ((Class) (com/firebase/jobdispatcher/GooglePlayReceiver)).getName());
	//   23   48:aload_2         
	//   24   49:ldc1            #45  <String "service">
	//   25   51:ldc1            #252 <Class GooglePlayReceiver>
	//   26   53:invokevirtual   #257 <Method String Class.getName()>
	//   27   56:invokevirtual   #244 <Method void Bundle.putString(String, String)>
		writeTriggerToBundle(jobparameters, bundle);
	//   28   59:aload_1         
	//   29   60:aload_2         
	//   30   61:invokestatic    #259 <Method void writeTriggerToBundle(JobParameters, Bundle)>
		writeConstraintsToBundle(jobparameters, bundle);
	//   31   64:aload_1         
	//   32   65:aload_2         
	//   33   66:invokestatic    #261 <Method void writeConstraintsToBundle(JobParameters, Bundle)>
		writeRetryStrategyToBundle(jobparameters, bundle);
	//   34   69:aload_1         
	//   35   70:aload_2         
	//   36   71:invokestatic    #263 <Method void writeRetryStrategyToBundle(JobParameters, Bundle)>
		Bundle bundle2 = jobparameters.getExtras();
	//   37   74:aload_1         
	//   38   75:invokeinterface #267 <Method Bundle JobParameters.getExtras()>
	//   39   80:astore          5
		Bundle bundle1 = bundle2;
	//   40   82:aload           5
	//   41   84:astore          4
		if(bundle2 == null)
	//*  42   86:aload           5
	//*  43   88:ifnonnull       100
			bundle1 = new Bundle();
	//   44   91:new             #101 <Class Bundle>
	//   45   94:dup             
	//   46   95:invokespecial   #178 <Method void Bundle()>
	//   47   98:astore          4
		bundle.putBundle("extras", jobCoder.encode(jobparameters, bundle1));
	//   48  100:aload_2         
	//   49  101:ldc1            #18  <String "extras">
	//   50  103:aload_0         
	//   51  104:getfield        #81  <Field JobCoder jobCoder>
	//   52  107:aload_1         
	//   53  108:aload           4
	//   54  110:invokevirtual   #270 <Method Bundle JobCoder.encode(JobParameters, Bundle)>
	//   55  113:invokevirtual   #195 <Method void Bundle.putBundle(String, Bundle)>
		return bundle;
	//   56  116:aload_2         
	//   57  117:areturn         
	}

	static final int LEGACY_NETWORK_ANY = 2;
	static final int LEGACY_NETWORK_CONNECTED = 0;
	static final int LEGACY_NETWORK_UNMETERED = 1;
	static final int LEGACY_RETRY_POLICY_EXPONENTIAL = 0;
	static final int LEGACY_RETRY_POLICY_LINEAR = 1;
	static final String REQUEST_PARAM_EXTRAS = "extras";
	static final String REQUEST_PARAM_PERSISTED = "persisted";
	static final String REQUEST_PARAM_REQUIRED_NETWORK = "requiredNetwork";
	static final String REQUEST_PARAM_REQUIRES_CHARGING = "requiresCharging";
	static final String REQUEST_PARAM_REQUIRES_IDLE = "requiresIdle";
	static final String REQUEST_PARAM_RETRY_STRATEGY = "retryStrategy";
	static final String REQUEST_PARAM_RETRY_STRATEGY_INITIAL_BACKOFF_SECONDS = "initial_backoff_seconds";
	static final String REQUEST_PARAM_RETRY_STRATEGY_MAXIMUM_BACKOFF_SECONDS = "maximum_backoff_seconds";
	static final String REQUEST_PARAM_RETRY_STRATEGY_POLICY = "retry_policy";
	static final String REQUEST_PARAM_SERVICE = "service";
	static final String REQUEST_PARAM_TAG = "tag";
	static final String REQUEST_PARAM_TRIGGER_TYPE = "trigger_type";
	static final String REQUEST_PARAM_TRIGGER_WINDOW_END = "window_end";
	static final String REQUEST_PARAM_TRIGGER_WINDOW_FLEX = "period_flex";
	static final String REQUEST_PARAM_TRIGGER_WINDOW_PERIOD = "period";
	static final String REQUEST_PARAM_TRIGGER_WINDOW_START = "window_start";
	static final String REQUEST_PARAM_UPDATE_CURRENT = "update_current";
	private final JobCoder jobCoder = new JobCoder("com.firebase.jobdispatcher.");
}
