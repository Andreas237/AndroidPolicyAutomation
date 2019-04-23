// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.model;

import android.arch.core.util.Function;
import androidx.work.*;
import java.util.*;

public class WorkSpec
{
	public static class IdAndState
	{

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(obj != null)
		//*   5    7:aload_1         
		//*   6    8:ifnull          54
			{
				if(((Object)this).getClass() != obj.getClass())
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #24  <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #24  <Method Class Object.getClass()>
		//*  11   19:if_acmpeq       24
					return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
				obj = ((Object) ((IdAndState)obj));
		//   14   24:aload_1         
		//   15   25:checkcast       #2   <Class WorkSpec$IdAndState>
		//   16   28:astore_1        
				if(state != ((IdAndState) (obj)).state)
		//*  17   29:aload_0         
		//*  18   30:getfield        #26  <Field androidx.work.WorkInfo$State state>
		//*  19   33:aload_1         
		//*  20   34:getfield        #26  <Field androidx.work.WorkInfo$State state>
		//*  21   37:if_acmpeq       42
					return false;
		//   22   40:iconst_0        
		//   23   41:ireturn         
				else
					return id.equals(((Object) (((IdAndState) (obj)).id)));
		//   24   42:aload_0         
		//   25   43:getfield        #28  <Field String id>
		//   26   46:aload_1         
		//   27   47:getfield        #28  <Field String id>
		//   28   50:invokevirtual   #32  <Method boolean String.equals(Object)>
		//   29   53:ireturn         
			} else
			{
				return false;
		//   30   54:iconst_0        
		//   31   55:ireturn         
			}
		}

		public int hashCode()
		{
			return id.hashCode() * 31 + state.hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field String id>
		//    2    4:invokevirtual   #36  <Method int String.hashCode()>
		//    3    7:bipush          31
		//    4    9:imul            
		//    5   10:aload_0         
		//    6   11:getfield        #26  <Field androidx.work.WorkInfo$State state>
		//    7   14:invokevirtual   #39  <Method int androidx.work.WorkInfo$State.hashCode()>
		//    8   17:iadd            
		//    9   18:ireturn         
		}

		public String id;
		public androidx.work.WorkInfo.State state;

		public IdAndState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class WorkInfoPojo
	{

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(obj != null)
		//*   5    7:aload_1         
		//*   6    8:ifnull          135
			{
				if(((Object)this).getClass() != obj.getClass())
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #37  <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #37  <Method Class Object.getClass()>
		//*  11   19:if_acmpeq       24
					return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
				obj = ((Object) ((WorkInfoPojo)obj));
		//   14   24:aload_1         
		//   15   25:checkcast       #2   <Class WorkSpec$WorkInfoPojo>
		//   16   28:astore_1        
				Object obj1 = ((Object) (id));
		//   17   29:aload_0         
		//   18   30:getfield        #39  <Field String id>
		//   19   33:astore_2        
				if(obj1 != null)
		//*  20   34:aload_2         
		//*  21   35:ifnull          51
				{
					if(!((String) (obj1)).equals(((Object) (((WorkInfoPojo) (obj)).id))))
		//*  22   38:aload_2         
		//*  23   39:aload_1         
		//*  24   40:getfield        #39  <Field String id>
		//*  25   43:invokevirtual   #43  <Method boolean String.equals(Object)>
		//*  26   46:ifne            60
						return false;
		//   27   49:iconst_0        
		//   28   50:ireturn         
				} else
				if(((WorkInfoPojo) (obj)).id != null)
		//*  29   51:aload_1         
		//*  30   52:getfield        #39  <Field String id>
		//*  31   55:ifnull          60
					return false;
		//   32   58:iconst_0        
		//   33   59:ireturn         
				if(state != ((WorkInfoPojo) (obj)).state)
		//*  34   60:aload_0         
		//*  35   61:getfield        #45  <Field androidx.work.WorkInfo$State state>
		//*  36   64:aload_1         
		//*  37   65:getfield        #45  <Field androidx.work.WorkInfo$State state>
		//*  38   68:if_acmpeq       73
					return false;
		//   39   71:iconst_0        
		//   40   72:ireturn         
				obj1 = ((Object) (output));
		//   41   73:aload_0         
		//   42   74:getfield        #47  <Field Data output>
		//   43   77:astore_2        
				if(obj1 != null)
		//*  44   78:aload_2         
		//*  45   79:ifnull          95
				{
					if(!((Data) (obj1)).equals(((Object) (((WorkInfoPojo) (obj)).output))))
		//*  46   82:aload_2         
		//*  47   83:aload_1         
		//*  48   84:getfield        #47  <Field Data output>
		//*  49   87:invokevirtual   #50  <Method boolean Data.equals(Object)>
		//*  50   90:ifne            104
						return false;
		//   51   93:iconst_0        
		//   52   94:ireturn         
				} else
				if(((WorkInfoPojo) (obj)).output != null)
		//*  53   95:aload_1         
		//*  54   96:getfield        #47  <Field Data output>
		//*  55   99:ifnull          104
					return false;
		//   56  102:iconst_0        
		//   57  103:ireturn         
				obj1 = ((Object) (tags));
		//   58  104:aload_0         
		//   59  105:getfield        #52  <Field List tags>
		//   60  108:astore_2        
				if(obj1 != null)
		//*  61  109:aload_2         
		//*  62  110:ifnull          124
					return ((List) (obj1)).equals(((Object) (((WorkInfoPojo) (obj)).tags)));
		//   63  113:aload_2         
		//   64  114:aload_1         
		//   65  115:getfield        #52  <Field List tags>
		//   66  118:invokeinterface #55  <Method boolean List.equals(Object)>
		//   67  123:ireturn         
				return ((WorkInfoPojo) (obj)).tags == null;
		//   68  124:aload_1         
		//   69  125:getfield        #52  <Field List tags>
		//   70  128:ifnonnull       133
		//   71  131:iconst_1        
		//   72  132:ireturn         
		//   73  133:iconst_0        
		//   74  134:ireturn         
			} else
			{
				return false;
		//   75  135:iconst_0        
		//   76  136:ireturn         
			}
		}

		public int hashCode()
		{
			Object obj = ((Object) (id));
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field String id>
		//    2    4:astore          5
			int l = 0;
		//    3    6:iconst_0        
		//    4    7:istore          4
			int i;
			if(obj != null)
		//*   5    9:aload           5
		//*   6   11:ifnull          23
				i = ((String) (obj)).hashCode();
		//    7   14:aload           5
		//    8   16:invokevirtual   #59  <Method int String.hashCode()>
		//    9   19:istore_1        
			else
		//*  10   20:goto            25
				i = 0;
		//   11   23:iconst_0        
		//   12   24:istore_1        
			obj = ((Object) (state));
		//   13   25:aload_0         
		//   14   26:getfield        #45  <Field androidx.work.WorkInfo$State state>
		//   15   29:astore          5
			int j;
			if(obj != null)
		//*  16   31:aload           5
		//*  17   33:ifnull          45
				j = ((androidx.work.WorkInfo.State) (obj)).hashCode();
		//   18   36:aload           5
		//   19   38:invokevirtual   #62  <Method int androidx.work.WorkInfo$State.hashCode()>
		//   20   41:istore_2        
			else
		//*  21   42:goto            47
				j = 0;
		//   22   45:iconst_0        
		//   23   46:istore_2        
			obj = ((Object) (output));
		//   24   47:aload_0         
		//   25   48:getfield        #47  <Field Data output>
		//   26   51:astore          5
			int k;
			if(obj != null)
		//*  27   53:aload           5
		//*  28   55:ifnull          67
				k = ((Data) (obj)).hashCode();
		//   29   58:aload           5
		//   30   60:invokevirtual   #63  <Method int Data.hashCode()>
		//   31   63:istore_3        
			else
		//*  32   64:goto            69
				k = 0;
		//   33   67:iconst_0        
		//   34   68:istore_3        
			obj = ((Object) (tags));
		//   35   69:aload_0         
		//   36   70:getfield        #52  <Field List tags>
		//   37   73:astore          5
			if(obj != null)
		//*  38   75:aload           5
		//*  39   77:ifnull          89
				l = ((List) (obj)).hashCode();
		//   40   80:aload           5
		//   41   82:invokeinterface #64  <Method int List.hashCode()>
		//   42   87:istore          4
			return ((i * 31 + j) * 31 + k) * 31 + l;
		//   43   89:iload_1         
		//   44   90:bipush          31
		//   45   92:imul            
		//   46   93:iload_2         
		//   47   94:iadd            
		//   48   95:bipush          31
		//   49   97:imul            
		//   50   98:iload_3         
		//   51   99:iadd            
		//   52  100:bipush          31
		//   53  102:imul            
		//   54  103:iload           4
		//   55  105:iadd            
		//   56  106:ireturn         
		}

		public WorkInfo toWorkInfo()
		{
			return new WorkInfo(UUID.fromString(id), state, output, tags);
		//    0    0:new             #68  <Class WorkInfo>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #39  <Field String id>
		//    4    8:invokestatic    #74  <Method UUID UUID.fromString(String)>
		//    5   11:aload_0         
		//    6   12:getfield        #45  <Field androidx.work.WorkInfo$State state>
		//    7   15:aload_0         
		//    8   16:getfield        #47  <Field Data output>
		//    9   19:aload_0         
		//   10   20:getfield        #52  <Field List tags>
		//   11   23:invokespecial   #77  <Method void WorkInfo(UUID, androidx.work.WorkInfo$State, Data, List)>
		//   12   26:areturn         
		}

		public String id;
		public Data output;
		public androidx.work.WorkInfo.State state;
		public List tags;

		public WorkInfoPojo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
		//    2    4:return          
		}
	}


	public WorkSpec(WorkSpec workspec)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void Object()>
		state = androidx.work.WorkInfo.State.ENQUEUED;
	//    2    4:aload_0         
	//    3    5:getstatic       #90  <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.ENQUEUED>
	//    4    8:putfield        #92  <Field androidx.work.WorkInfo$State state>
		input = Data.EMPTY;
	//    5   11:aload_0         
	//    6   12:getstatic       #97  <Field Data Data.EMPTY>
	//    7   15:putfield        #99  <Field Data input>
		output = Data.EMPTY;
	//    8   18:aload_0         
	//    9   19:getstatic       #97  <Field Data Data.EMPTY>
	//   10   22:putfield        #101 <Field Data output>
		constraints = Constraints.NONE;
	//   11   25:aload_0         
	//   12   26:getstatic       #106 <Field Constraints Constraints.NONE>
	//   13   29:putfield        #108 <Field Constraints constraints>
		backoffPolicy = BackoffPolicy.EXPONENTIAL;
	//   14   32:aload_0         
	//   15   33:getstatic       #113 <Field BackoffPolicy BackoffPolicy.EXPONENTIAL>
	//   16   36:putfield        #115 <Field BackoffPolicy backoffPolicy>
		backoffDelayDuration = 30000L;
	//   17   39:aload_0         
	//   18   40:ldc2w           #116 <Long 30000L>
	//   19   43:putfield        #119 <Field long backoffDelayDuration>
		scheduleRequestedAt = -1L;
	//   20   46:aload_0         
	//   21   47:ldc2w           #23  <Long -1L>
	//   22   50:putfield        #121 <Field long scheduleRequestedAt>
		id = workspec.id;
	//   23   53:aload_0         
	//   24   54:aload_1         
	//   25   55:getfield        #123 <Field String id>
	//   26   58:putfield        #123 <Field String id>
		workerClassName = workspec.workerClassName;
	//   27   61:aload_0         
	//   28   62:aload_1         
	//   29   63:getfield        #125 <Field String workerClassName>
	//   30   66:putfield        #125 <Field String workerClassName>
		state = workspec.state;
	//   31   69:aload_0         
	//   32   70:aload_1         
	//   33   71:getfield        #92  <Field androidx.work.WorkInfo$State state>
	//   34   74:putfield        #92  <Field androidx.work.WorkInfo$State state>
		inputMergerClassName = workspec.inputMergerClassName;
	//   35   77:aload_0         
	//   36   78:aload_1         
	//   37   79:getfield        #127 <Field String inputMergerClassName>
	//   38   82:putfield        #127 <Field String inputMergerClassName>
		input = new Data(workspec.input);
	//   39   85:aload_0         
	//   40   86:new             #94  <Class Data>
	//   41   89:dup             
	//   42   90:aload_1         
	//   43   91:getfield        #99  <Field Data input>
	//   44   94:invokespecial   #130 <Method void Data(Data)>
	//   45   97:putfield        #99  <Field Data input>
		output = new Data(workspec.output);
	//   46  100:aload_0         
	//   47  101:new             #94  <Class Data>
	//   48  104:dup             
	//   49  105:aload_1         
	//   50  106:getfield        #101 <Field Data output>
	//   51  109:invokespecial   #130 <Method void Data(Data)>
	//   52  112:putfield        #101 <Field Data output>
		initialDelay = workspec.initialDelay;
	//   53  115:aload_0         
	//   54  116:aload_1         
	//   55  117:getfield        #132 <Field long initialDelay>
	//   56  120:putfield        #132 <Field long initialDelay>
		intervalDuration = workspec.intervalDuration;
	//   57  123:aload_0         
	//   58  124:aload_1         
	//   59  125:getfield        #134 <Field long intervalDuration>
	//   60  128:putfield        #134 <Field long intervalDuration>
		flexDuration = workspec.flexDuration;
	//   61  131:aload_0         
	//   62  132:aload_1         
	//   63  133:getfield        #136 <Field long flexDuration>
	//   64  136:putfield        #136 <Field long flexDuration>
		constraints = new Constraints(workspec.constraints);
	//   65  139:aload_0         
	//   66  140:new             #103 <Class Constraints>
	//   67  143:dup             
	//   68  144:aload_1         
	//   69  145:getfield        #108 <Field Constraints constraints>
	//   70  148:invokespecial   #139 <Method void Constraints(Constraints)>
	//   71  151:putfield        #108 <Field Constraints constraints>
		runAttemptCount = workspec.runAttemptCount;
	//   72  154:aload_0         
	//   73  155:aload_1         
	//   74  156:getfield        #141 <Field int runAttemptCount>
	//   75  159:putfield        #141 <Field int runAttemptCount>
		backoffPolicy = workspec.backoffPolicy;
	//   76  162:aload_0         
	//   77  163:aload_1         
	//   78  164:getfield        #115 <Field BackoffPolicy backoffPolicy>
	//   79  167:putfield        #115 <Field BackoffPolicy backoffPolicy>
		backoffDelayDuration = workspec.backoffDelayDuration;
	//   80  170:aload_0         
	//   81  171:aload_1         
	//   82  172:getfield        #119 <Field long backoffDelayDuration>
	//   83  175:putfield        #119 <Field long backoffDelayDuration>
		periodStartTime = workspec.periodStartTime;
	//   84  178:aload_0         
	//   85  179:aload_1         
	//   86  180:getfield        #143 <Field long periodStartTime>
	//   87  183:putfield        #143 <Field long periodStartTime>
		minimumRetentionDuration = workspec.minimumRetentionDuration;
	//   88  186:aload_0         
	//   89  187:aload_1         
	//   90  188:getfield        #145 <Field long minimumRetentionDuration>
	//   91  191:putfield        #145 <Field long minimumRetentionDuration>
		scheduleRequestedAt = workspec.scheduleRequestedAt;
	//   92  194:aload_0         
	//   93  195:aload_1         
	//   94  196:getfield        #121 <Field long scheduleRequestedAt>
	//   95  199:putfield        #121 <Field long scheduleRequestedAt>
	//   96  202:return          
	}

	public WorkSpec(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void Object()>
		state = androidx.work.WorkInfo.State.ENQUEUED;
	//    2    4:aload_0         
	//    3    5:getstatic       #90  <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.ENQUEUED>
	//    4    8:putfield        #92  <Field androidx.work.WorkInfo$State state>
		input = Data.EMPTY;
	//    5   11:aload_0         
	//    6   12:getstatic       #97  <Field Data Data.EMPTY>
	//    7   15:putfield        #99  <Field Data input>
		output = Data.EMPTY;
	//    8   18:aload_0         
	//    9   19:getstatic       #97  <Field Data Data.EMPTY>
	//   10   22:putfield        #101 <Field Data output>
		constraints = Constraints.NONE;
	//   11   25:aload_0         
	//   12   26:getstatic       #106 <Field Constraints Constraints.NONE>
	//   13   29:putfield        #108 <Field Constraints constraints>
		backoffPolicy = BackoffPolicy.EXPONENTIAL;
	//   14   32:aload_0         
	//   15   33:getstatic       #113 <Field BackoffPolicy BackoffPolicy.EXPONENTIAL>
	//   16   36:putfield        #115 <Field BackoffPolicy backoffPolicy>
		backoffDelayDuration = 30000L;
	//   17   39:aload_0         
	//   18   40:ldc2w           #116 <Long 30000L>
	//   19   43:putfield        #119 <Field long backoffDelayDuration>
		scheduleRequestedAt = -1L;
	//   20   46:aload_0         
	//   21   47:ldc2w           #23  <Long -1L>
	//   22   50:putfield        #121 <Field long scheduleRequestedAt>
		id = s;
	//   23   53:aload_0         
	//   24   54:aload_1         
	//   25   55:putfield        #123 <Field String id>
		workerClassName = s1;
	//   26   58:aload_0         
	//   27   59:aload_2         
	//   28   60:putfield        #125 <Field String workerClassName>
	//   29   63:return          
	}

	public long calculateNextRunTime()
	{
		if(isBackedOff())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #153 <Method boolean isBackedOff()>
	//*   2    4:ifeq            71
		{
			boolean flag;
			if(backoffPolicy == BackoffPolicy.LINEAR)
	//*   3    7:aload_0         
	//*   4    8:getfield        #115 <Field BackoffPolicy backoffPolicy>
	//*   5   11:getstatic       #156 <Field BackoffPolicy BackoffPolicy.LINEAR>
	//*   6   14:if_acmpne       22
				flag = true;
	//    7   17:iconst_1        
	//    8   18:istore_1        
			else
	//*   9   19:goto            24
				flag = false;
	//   10   22:iconst_0        
	//   11   23:istore_1        
			long l;
			if(flag)
	//*  12   24:iload_1         
	//*  13   25:ifeq            42
				l = backoffDelayDuration * (long)runAttemptCount;
	//   14   28:aload_0         
	//   15   29:getfield        #119 <Field long backoffDelayDuration>
	//   16   32:aload_0         
	//   17   33:getfield        #141 <Field int runAttemptCount>
	//   18   36:i2l             
	//   19   37:lmul            
	//   20   38:lstore_2        
			else
	//*  21   39:goto            58
				l = (long)Math.scalb(backoffDelayDuration, runAttemptCount - 1);
	//   22   42:aload_0         
	//   23   43:getfield        #119 <Field long backoffDelayDuration>
	//   24   46:l2f             
	//   25   47:aload_0         
	//   26   48:getfield        #141 <Field int runAttemptCount>
	//   27   51:iconst_1        
	//   28   52:isub            
	//   29   53:invokestatic    #162 <Method float Math.scalb(float, int)>
	//   30   56:f2l             
	//   31   57:lstore_2        
			return periodStartTime + Math.min(0x112a880L, l);
	//   32   58:aload_0         
	//   33   59:getfield        #143 <Field long periodStartTime>
	//   34   62:ldc2w           #163 <Long 0x112a880L>
	//   35   65:lload_2         
	//   36   66:invokestatic    #168 <Method long Math.min(long, long)>
	//   37   69:ladd            
	//   38   70:lreturn         
		}
		if(isPeriodic())
	//*  39   71:aload_0         
	//*  40   72:invokevirtual   #171 <Method boolean isPeriodic()>
	//*  41   75:ifeq            93
			return (periodStartTime + intervalDuration) - flexDuration;
	//   42   78:aload_0         
	//   43   79:getfield        #143 <Field long periodStartTime>
	//   44   82:aload_0         
	//   45   83:getfield        #134 <Field long intervalDuration>
	//   46   86:ladd            
	//   47   87:aload_0         
	//   48   88:getfield        #136 <Field long flexDuration>
	//   49   91:lsub            
	//   50   92:lreturn         
		else
			return periodStartTime + initialDelay;
	//   51   93:aload_0         
	//   52   94:getfield        #143 <Field long periodStartTime>
	//   53   97:aload_0         
	//   54   98:getfield        #132 <Field long initialDelay>
	//   55  101:ladd            
	//   56  102:lreturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          279
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #177 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #177 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((WorkSpec)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class WorkSpec>
	//   16   28:astore_1        
			if(initialDelay != ((WorkSpec) (obj)).initialDelay)
	//*  17   29:aload_0         
	//*  18   30:getfield        #132 <Field long initialDelay>
	//*  19   33:aload_1         
	//*  20   34:getfield        #132 <Field long initialDelay>
	//*  21   37:lcmp            
	//*  22   38:ifeq            43
				return false;
	//   23   41:iconst_0        
	//   24   42:ireturn         
			if(intervalDuration != ((WorkSpec) (obj)).intervalDuration)
	//*  25   43:aload_0         
	//*  26   44:getfield        #134 <Field long intervalDuration>
	//*  27   47:aload_1         
	//*  28   48:getfield        #134 <Field long intervalDuration>
	//*  29   51:lcmp            
	//*  30   52:ifeq            57
				return false;
	//   31   55:iconst_0        
	//   32   56:ireturn         
			if(flexDuration != ((WorkSpec) (obj)).flexDuration)
	//*  33   57:aload_0         
	//*  34   58:getfield        #136 <Field long flexDuration>
	//*  35   61:aload_1         
	//*  36   62:getfield        #136 <Field long flexDuration>
	//*  37   65:lcmp            
	//*  38   66:ifeq            71
				return false;
	//   39   69:iconst_0        
	//   40   70:ireturn         
			if(runAttemptCount != ((WorkSpec) (obj)).runAttemptCount)
	//*  41   71:aload_0         
	//*  42   72:getfield        #141 <Field int runAttemptCount>
	//*  43   75:aload_1         
	//*  44   76:getfield        #141 <Field int runAttemptCount>
	//*  45   79:icmpeq          84
				return false;
	//   46   82:iconst_0        
	//   47   83:ireturn         
			if(backoffDelayDuration != ((WorkSpec) (obj)).backoffDelayDuration)
	//*  48   84:aload_0         
	//*  49   85:getfield        #119 <Field long backoffDelayDuration>
	//*  50   88:aload_1         
	//*  51   89:getfield        #119 <Field long backoffDelayDuration>
	//*  52   92:lcmp            
	//*  53   93:ifeq            98
				return false;
	//   54   96:iconst_0        
	//   55   97:ireturn         
			if(periodStartTime != ((WorkSpec) (obj)).periodStartTime)
	//*  56   98:aload_0         
	//*  57   99:getfield        #143 <Field long periodStartTime>
	//*  58  102:aload_1         
	//*  59  103:getfield        #143 <Field long periodStartTime>
	//*  60  106:lcmp            
	//*  61  107:ifeq            112
				return false;
	//   62  110:iconst_0        
	//   63  111:ireturn         
			if(minimumRetentionDuration != ((WorkSpec) (obj)).minimumRetentionDuration)
	//*  64  112:aload_0         
	//*  65  113:getfield        #145 <Field long minimumRetentionDuration>
	//*  66  116:aload_1         
	//*  67  117:getfield        #145 <Field long minimumRetentionDuration>
	//*  68  120:lcmp            
	//*  69  121:ifeq            126
				return false;
	//   70  124:iconst_0        
	//   71  125:ireturn         
			if(scheduleRequestedAt != ((WorkSpec) (obj)).scheduleRequestedAt)
	//*  72  126:aload_0         
	//*  73  127:getfield        #121 <Field long scheduleRequestedAt>
	//*  74  130:aload_1         
	//*  75  131:getfield        #121 <Field long scheduleRequestedAt>
	//*  76  134:lcmp            
	//*  77  135:ifeq            140
				return false;
	//   78  138:iconst_0        
	//   79  139:ireturn         
			if(!id.equals(((Object) (((WorkSpec) (obj)).id))))
	//*  80  140:aload_0         
	//*  81  141:getfield        #123 <Field String id>
	//*  82  144:aload_1         
	//*  83  145:getfield        #123 <Field String id>
	//*  84  148:invokevirtual   #181 <Method boolean String.equals(Object)>
	//*  85  151:ifne            156
				return false;
	//   86  154:iconst_0        
	//   87  155:ireturn         
			if(state != ((WorkSpec) (obj)).state)
	//*  88  156:aload_0         
	//*  89  157:getfield        #92  <Field androidx.work.WorkInfo$State state>
	//*  90  160:aload_1         
	//*  91  161:getfield        #92  <Field androidx.work.WorkInfo$State state>
	//*  92  164:if_acmpeq       169
				return false;
	//   93  167:iconst_0        
	//   94  168:ireturn         
			if(!workerClassName.equals(((Object) (((WorkSpec) (obj)).workerClassName))))
	//*  95  169:aload_0         
	//*  96  170:getfield        #125 <Field String workerClassName>
	//*  97  173:aload_1         
	//*  98  174:getfield        #125 <Field String workerClassName>
	//*  99  177:invokevirtual   #181 <Method boolean String.equals(Object)>
	//* 100  180:ifne            185
				return false;
	//  101  183:iconst_0        
	//  102  184:ireturn         
			String s = inputMergerClassName;
	//  103  185:aload_0         
	//  104  186:getfield        #127 <Field String inputMergerClassName>
	//  105  189:astore_2        
			if(s != null)
	//* 106  190:aload_2         
	//* 107  191:ifnull          207
			{
				if(!s.equals(((Object) (((WorkSpec) (obj)).inputMergerClassName))))
	//* 108  194:aload_2         
	//* 109  195:aload_1         
	//* 110  196:getfield        #127 <Field String inputMergerClassName>
	//* 111  199:invokevirtual   #181 <Method boolean String.equals(Object)>
	//* 112  202:ifne            216
					return false;
	//  113  205:iconst_0        
	//  114  206:ireturn         
			} else
			if(((WorkSpec) (obj)).inputMergerClassName != null)
	//* 115  207:aload_1         
	//* 116  208:getfield        #127 <Field String inputMergerClassName>
	//* 117  211:ifnull          216
				return false;
	//  118  214:iconst_0        
	//  119  215:ireturn         
			if(!input.equals(((Object) (((WorkSpec) (obj)).input))))
	//* 120  216:aload_0         
	//* 121  217:getfield        #99  <Field Data input>
	//* 122  220:aload_1         
	//* 123  221:getfield        #99  <Field Data input>
	//* 124  224:invokevirtual   #182 <Method boolean Data.equals(Object)>
	//* 125  227:ifne            232
				return false;
	//  126  230:iconst_0        
	//  127  231:ireturn         
			if(!output.equals(((Object) (((WorkSpec) (obj)).output))))
	//* 128  232:aload_0         
	//* 129  233:getfield        #101 <Field Data output>
	//* 130  236:aload_1         
	//* 131  237:getfield        #101 <Field Data output>
	//* 132  240:invokevirtual   #182 <Method boolean Data.equals(Object)>
	//* 133  243:ifne            248
				return false;
	//  134  246:iconst_0        
	//  135  247:ireturn         
			if(!constraints.equals(((Object) (((WorkSpec) (obj)).constraints))))
	//* 136  248:aload_0         
	//* 137  249:getfield        #108 <Field Constraints constraints>
	//* 138  252:aload_1         
	//* 139  253:getfield        #108 <Field Constraints constraints>
	//* 140  256:invokevirtual   #183 <Method boolean Constraints.equals(Object)>
	//* 141  259:ifne            264
				return false;
	//  142  262:iconst_0        
	//  143  263:ireturn         
			return backoffPolicy == ((WorkSpec) (obj)).backoffPolicy;
	//  144  264:aload_0         
	//  145  265:getfield        #115 <Field BackoffPolicy backoffPolicy>
	//  146  268:aload_1         
	//  147  269:getfield        #115 <Field BackoffPolicy backoffPolicy>
	//  148  272:if_acmpne       277
	//  149  275:iconst_1        
	//  150  276:ireturn         
	//  151  277:iconst_0        
	//  152  278:ireturn         
		} else
		{
			return false;
	//  153  279:iconst_0        
	//  154  280:ireturn         
		}
	}

	public boolean hasConstraints()
	{
		return Constraints.NONE.equals(((Object) (constraints))) ^ true;
	//    0    0:getstatic       #106 <Field Constraints Constraints.NONE>
	//    1    3:aload_0         
	//    2    4:getfield        #108 <Field Constraints constraints>
	//    3    7:invokevirtual   #183 <Method boolean Constraints.equals(Object)>
	//    4   10:iconst_1        
	//    5   11:ixor            
	//    6   12:ireturn         
	}

	public int hashCode()
	{
		int j = id.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field String id>
	//    2    4:invokevirtual   #188 <Method int String.hashCode()>
	//    3    7:istore_2        
		int k = state.hashCode();
	//    4    8:aload_0         
	//    5    9:getfield        #92  <Field androidx.work.WorkInfo$State state>
	//    6   12:invokevirtual   #189 <Method int androidx.work.WorkInfo$State.hashCode()>
	//    7   15:istore_3        
		int l = workerClassName.hashCode();
	//    8   16:aload_0         
	//    9   17:getfield        #125 <Field String workerClassName>
	//   10   20:invokevirtual   #188 <Method int String.hashCode()>
	//   11   23:istore          4
		String s = inputMergerClassName;
	//   12   25:aload_0         
	//   13   26:getfield        #127 <Field String inputMergerClassName>
	//   14   29:astore          18
		int i;
		if(s != null)
	//*  15   31:aload           18
	//*  16   33:ifnull          45
			i = s.hashCode();
	//   17   36:aload           18
	//   18   38:invokevirtual   #188 <Method int String.hashCode()>
	//   19   41:istore_1        
		else
	//*  20   42:goto            47
			i = 0;
	//   21   45:iconst_0        
	//   22   46:istore_1        
		int i1 = input.hashCode();
	//   23   47:aload_0         
	//   24   48:getfield        #99  <Field Data input>
	//   25   51:invokevirtual   #190 <Method int Data.hashCode()>
	//   26   54:istore          5
		int j1 = output.hashCode();
	//   27   56:aload_0         
	//   28   57:getfield        #101 <Field Data output>
	//   29   60:invokevirtual   #190 <Method int Data.hashCode()>
	//   30   63:istore          6
		long l3 = initialDelay;
	//   31   65:aload_0         
	//   32   66:getfield        #132 <Field long initialDelay>
	//   33   69:lstore          16
		int k1 = (int)(l3 ^ l3 >>> 32);
	//   34   71:lload           16
	//   35   73:lload           16
	//   36   75:bipush          32
	//   37   77:lushr           
	//   38   78:lxor            
	//   39   79:l2i             
	//   40   80:istore          7
		l3 = intervalDuration;
	//   41   82:aload_0         
	//   42   83:getfield        #134 <Field long intervalDuration>
	//   43   86:lstore          16
		int l1 = (int)(l3 ^ l3 >>> 32);
	//   44   88:lload           16
	//   45   90:lload           16
	//   46   92:bipush          32
	//   47   94:lushr           
	//   48   95:lxor            
	//   49   96:l2i             
	//   50   97:istore          8
		l3 = flexDuration;
	//   51   99:aload_0         
	//   52  100:getfield        #136 <Field long flexDuration>
	//   53  103:lstore          16
		int i2 = (int)(l3 ^ l3 >>> 32);
	//   54  105:lload           16
	//   55  107:lload           16
	//   56  109:bipush          32
	//   57  111:lushr           
	//   58  112:lxor            
	//   59  113:l2i             
	//   60  114:istore          9
		int j2 = constraints.hashCode();
	//   61  116:aload_0         
	//   62  117:getfield        #108 <Field Constraints constraints>
	//   63  120:invokevirtual   #191 <Method int Constraints.hashCode()>
	//   64  123:istore          10
		int k2 = runAttemptCount;
	//   65  125:aload_0         
	//   66  126:getfield        #141 <Field int runAttemptCount>
	//   67  129:istore          11
		int l2 = backoffPolicy.hashCode();
	//   68  131:aload_0         
	//   69  132:getfield        #115 <Field BackoffPolicy backoffPolicy>
	//   70  135:invokevirtual   #192 <Method int BackoffPolicy.hashCode()>
	//   71  138:istore          12
		l3 = backoffDelayDuration;
	//   72  140:aload_0         
	//   73  141:getfield        #119 <Field long backoffDelayDuration>
	//   74  144:lstore          16
		int i3 = (int)(l3 ^ l3 >>> 32);
	//   75  146:lload           16
	//   76  148:lload           16
	//   77  150:bipush          32
	//   78  152:lushr           
	//   79  153:lxor            
	//   80  154:l2i             
	//   81  155:istore          13
		l3 = periodStartTime;
	//   82  157:aload_0         
	//   83  158:getfield        #143 <Field long periodStartTime>
	//   84  161:lstore          16
		int j3 = (int)(l3 ^ l3 >>> 32);
	//   85  163:lload           16
	//   86  165:lload           16
	//   87  167:bipush          32
	//   88  169:lushr           
	//   89  170:lxor            
	//   90  171:l2i             
	//   91  172:istore          14
		l3 = minimumRetentionDuration;
	//   92  174:aload_0         
	//   93  175:getfield        #145 <Field long minimumRetentionDuration>
	//   94  178:lstore          16
		int k3 = (int)(l3 ^ l3 >>> 32);
	//   95  180:lload           16
	//   96  182:lload           16
	//   97  184:bipush          32
	//   98  186:lushr           
	//   99  187:lxor            
	//  100  188:l2i             
	//  101  189:istore          15
		l3 = scheduleRequestedAt;
	//  102  191:aload_0         
	//  103  192:getfield        #121 <Field long scheduleRequestedAt>
	//  104  195:lstore          16
		return ((((((((((((((j * 31 + k) * 31 + l) * 31 + i) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31 + (int)(l3 ^ l3 >>> 32);
	//  105  197:iload_2         
	//  106  198:bipush          31
	//  107  200:imul            
	//  108  201:iload_3         
	//  109  202:iadd            
	//  110  203:bipush          31
	//  111  205:imul            
	//  112  206:iload           4
	//  113  208:iadd            
	//  114  209:bipush          31
	//  115  211:imul            
	//  116  212:iload_1         
	//  117  213:iadd            
	//  118  214:bipush          31
	//  119  216:imul            
	//  120  217:iload           5
	//  121  219:iadd            
	//  122  220:bipush          31
	//  123  222:imul            
	//  124  223:iload           6
	//  125  225:iadd            
	//  126  226:bipush          31
	//  127  228:imul            
	//  128  229:iload           7
	//  129  231:iadd            
	//  130  232:bipush          31
	//  131  234:imul            
	//  132  235:iload           8
	//  133  237:iadd            
	//  134  238:bipush          31
	//  135  240:imul            
	//  136  241:iload           9
	//  137  243:iadd            
	//  138  244:bipush          31
	//  139  246:imul            
	//  140  247:iload           10
	//  141  249:iadd            
	//  142  250:bipush          31
	//  143  252:imul            
	//  144  253:iload           11
	//  145  255:iadd            
	//  146  256:bipush          31
	//  147  258:imul            
	//  148  259:iload           12
	//  149  261:iadd            
	//  150  262:bipush          31
	//  151  264:imul            
	//  152  265:iload           13
	//  153  267:iadd            
	//  154  268:bipush          31
	//  155  270:imul            
	//  156  271:iload           14
	//  157  273:iadd            
	//  158  274:bipush          31
	//  159  276:imul            
	//  160  277:iload           15
	//  161  279:iadd            
	//  162  280:bipush          31
	//  163  282:imul            
	//  164  283:lload           16
	//  165  285:lload           16
	//  166  287:bipush          32
	//  167  289:lushr           
	//  168  290:lxor            
	//  169  291:l2i             
	//  170  292:iadd            
	//  171  293:ireturn         
	}

	public boolean isBackedOff()
	{
		return state == androidx.work.WorkInfo.State.ENQUEUED && runAttemptCount > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field androidx.work.WorkInfo$State state>
	//    2    4:getstatic       #90  <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.ENQUEUED>
	//    3    7:if_acmpne       19
	//    4   10:aload_0         
	//    5   11:getfield        #141 <Field int runAttemptCount>
	//    6   14:ifle            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean isPeriodic()
	{
		return intervalDuration != 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field long intervalDuration>
	//    2    4:lconst_0        
	//    3    5:lcmp            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public void setBackoffDelayDuration(long l)
	{
		long l1 = l;
	//    0    0:lload_1         
	//    1    1:lstore_3        
		if(l > 0x112a880L)
	//*   2    2:lload_1         
	//*   3    3:ldc2w           #163 <Long 0x112a880L>
	//*   4    6:lcmp            
	//*   5    7:ifle            29
		{
			Logger.get().warning(TAG, "Backoff delay duration exceeds maximum value", new Throwable[0]);
	//    6   10:invokestatic    #198 <Method Logger Logger.get()>
	//    7   13:getstatic       #77  <Field String TAG>
	//    8   16:ldc1            #200 <String "Backoff delay duration exceeds maximum value">
	//    9   18:iconst_0        
	//   10   19:anewarray       Throwable[]
	//   11   22:invokevirtual   #206 <Method void Logger.warning(String, String, Throwable[])>
			l1 = 0x112a880L;
	//   12   25:ldc2w           #163 <Long 0x112a880L>
	//   13   28:lstore_3        
		}
		l = l1;
	//   14   29:lload_3         
	//   15   30:lstore_1        
		if(l1 < 10000L)
	//*  16   31:lload_3         
	//*  17   32:ldc2w           #207 <Long 10000L>
	//*  18   35:lcmp            
	//*  19   36:ifge            58
		{
			Logger.get().warning(TAG, "Backoff delay duration less than minimum value", new Throwable[0]);
	//   20   39:invokestatic    #198 <Method Logger Logger.get()>
	//   21   42:getstatic       #77  <Field String TAG>
	//   22   45:ldc1            #210 <String "Backoff delay duration less than minimum value">
	//   23   47:iconst_0        
	//   24   48:anewarray       Throwable[]
	//   25   51:invokevirtual   #206 <Method void Logger.warning(String, String, Throwable[])>
			l = 10000L;
	//   26   54:ldc2w           #207 <Long 10000L>
	//   27   57:lstore_1        
		}
		backoffDelayDuration = l;
	//   28   58:aload_0         
	//   29   59:lload_1         
	//   30   60:putfield        #119 <Field long backoffDelayDuration>
	//   31   63:return          
	}

	public void setPeriodic(long l)
	{
		long l1 = l;
	//    0    0:lload_1         
	//    1    1:lstore_3        
		if(l < 0xdbba0L)
	//*   2    2:lload_1         
	//*   3    3:ldc2w           #212 <Long 0xdbba0L>
	//*   4    6:lcmp            
	//*   5    7:ifge            45
		{
			Logger.get().warning(TAG, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[] {
				Long.valueOf(0xdbba0L)
			}), new Throwable[0]);
	//    6   10:invokestatic    #198 <Method Logger Logger.get()>
	//    7   13:getstatic       #77  <Field String TAG>
	//    8   16:ldc1            #215 <String "Interval duration lesser than minimum allowed value; Changed to %s">
	//    9   18:iconst_1        
	//   10   19:anewarray       Object[]
	//   11   22:dup             
	//   12   23:iconst_0        
	//   13   24:ldc2w           #212 <Long 0xdbba0L>
	//   14   27:invokestatic    #221 <Method Long Long.valueOf(long)>
	//   15   30:aastore         
	//   16   31:invokestatic    #225 <Method String String.format(String, Object[])>
	//   17   34:iconst_0        
	//   18   35:anewarray       Throwable[]
	//   19   38:invokevirtual   #206 <Method void Logger.warning(String, String, Throwable[])>
			l1 = 0xdbba0L;
	//   20   41:ldc2w           #212 <Long 0xdbba0L>
	//   21   44:lstore_3        
		}
		setPeriodic(l1, l1);
	//   22   45:aload_0         
	//   23   46:lload_3         
	//   24   47:lload_3         
	//   25   48:invokevirtual   #228 <Method void setPeriodic(long, long)>
	//   26   51:return          
	}

	public void setPeriodic(long l, long l1)
	{
		long l2 = l;
	//    0    0:lload_1         
	//    1    1:lstore          5
		if(l < 0xdbba0L)
	//*   2    3:lload_1         
	//*   3    4:ldc2w           #212 <Long 0xdbba0L>
	//*   4    7:lcmp            
	//*   5    8:ifge            47
		{
			Logger.get().warning(TAG, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[] {
				Long.valueOf(0xdbba0L)
			}), new Throwable[0]);
	//    6   11:invokestatic    #198 <Method Logger Logger.get()>
	//    7   14:getstatic       #77  <Field String TAG>
	//    8   17:ldc1            #215 <String "Interval duration lesser than minimum allowed value; Changed to %s">
	//    9   19:iconst_1        
	//   10   20:anewarray       Object[]
	//   11   23:dup             
	//   12   24:iconst_0        
	//   13   25:ldc2w           #212 <Long 0xdbba0L>
	//   14   28:invokestatic    #221 <Method Long Long.valueOf(long)>
	//   15   31:aastore         
	//   16   32:invokestatic    #225 <Method String String.format(String, Object[])>
	//   17   35:iconst_0        
	//   18   36:anewarray       Throwable[]
	//   19   39:invokevirtual   #206 <Method void Logger.warning(String, String, Throwable[])>
			l2 = 0xdbba0L;
	//   20   42:ldc2w           #212 <Long 0xdbba0L>
	//   21   45:lstore          5
		}
		l = l1;
	//   22   47:lload_3         
	//   23   48:lstore_1        
		if(l1 < 0x493e0L)
	//*  24   49:lload_3         
	//*  25   50:ldc2w           #229 <Long 0x493e0L>
	//*  26   53:lcmp            
	//*  27   54:ifge            92
		{
			Logger.get().warning(TAG, String.format("Flex duration lesser than minimum allowed value; Changed to %s", new Object[] {
				Long.valueOf(0x493e0L)
			}), new Throwable[0]);
	//   28   57:invokestatic    #198 <Method Logger Logger.get()>
	//   29   60:getstatic       #77  <Field String TAG>
	//   30   63:ldc1            #232 <String "Flex duration lesser than minimum allowed value; Changed to %s">
	//   31   65:iconst_1        
	//   32   66:anewarray       Object[]
	//   33   69:dup             
	//   34   70:iconst_0        
	//   35   71:ldc2w           #229 <Long 0x493e0L>
	//   36   74:invokestatic    #221 <Method Long Long.valueOf(long)>
	//   37   77:aastore         
	//   38   78:invokestatic    #225 <Method String String.format(String, Object[])>
	//   39   81:iconst_0        
	//   40   82:anewarray       Throwable[]
	//   41   85:invokevirtual   #206 <Method void Logger.warning(String, String, Throwable[])>
			l = 0x493e0L;
	//   42   88:ldc2w           #229 <Long 0x493e0L>
	//   43   91:lstore_1        
		}
		l1 = l;
	//   44   92:lload_1         
	//   45   93:lstore_3        
		if(l > l2)
	//*  46   94:lload_1         
	//*  47   95:lload           5
	//*  48   97:lcmp            
	//*  49   98:ifle            134
		{
			Logger.get().warning(TAG, String.format("Flex duration greater than interval duration; Changed to %s", new Object[] {
				Long.valueOf(l2)
			}), new Throwable[0]);
	//   50  101:invokestatic    #198 <Method Logger Logger.get()>
	//   51  104:getstatic       #77  <Field String TAG>
	//   52  107:ldc1            #234 <String "Flex duration greater than interval duration; Changed to %s">
	//   53  109:iconst_1        
	//   54  110:anewarray       Object[]
	//   55  113:dup             
	//   56  114:iconst_0        
	//   57  115:lload           5
	//   58  117:invokestatic    #221 <Method Long Long.valueOf(long)>
	//   59  120:aastore         
	//   60  121:invokestatic    #225 <Method String String.format(String, Object[])>
	//   61  124:iconst_0        
	//   62  125:anewarray       Throwable[]
	//   63  128:invokevirtual   #206 <Method void Logger.warning(String, String, Throwable[])>
			l1 = l2;
	//   64  131:lload           5
	//   65  133:lstore_3        
		}
		intervalDuration = l2;
	//   66  134:aload_0         
	//   67  135:lload           5
	//   68  137:putfield        #134 <Field long intervalDuration>
		flexDuration = l1;
	//   69  140:aload_0         
	//   70  141:lload_3         
	//   71  142:putfield        #136 <Field long flexDuration>
	//   72  145:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #238 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #239 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("{WorkSpec: ");
	//    4    8:aload_1         
	//    5    9:ldc1            #241 <String "{WorkSpec: ">
	//    6   11:invokevirtual   #245 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(id);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #123 <Field String id>
	//   11   20:invokevirtual   #245 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append("}");
	//   13   24:aload_1         
	//   14   25:ldc1            #247 <String "}">
	//   15   27:invokevirtual   #245 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #249 <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}

	public static final long SCHEDULE_NOT_REQUESTED_YET = -1L;
	private static final String TAG = Logger.tagWithPrefix("WorkSpec");
	public static final Function WORK_INFO_MAPPER = new Function() {

		public volatile Object apply(Object obj)
		{
			return ((Object) (apply((List)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class List>
		//    3    5:invokevirtual   #21  <Method List apply(List)>
		//    4    8:areturn         
		}

		public List apply(List list)
		{
			if(list == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			ArrayList arraylist = new ArrayList(list.size());
		//    4    6:new             #23  <Class ArrayList>
		//    5    9:dup             
		//    6   10:aload_1         
		//    7   11:invokeinterface #27  <Method int List.size()>
		//    8   16:invokespecial   #30  <Method void ArrayList(int)>
		//    9   19:astore_2        
			for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) (((WorkInfoPojo)((Iterator) (list)).next()).toWorkInfo()))));
		//   10   20:aload_1         
		//   11   21:invokeinterface #34  <Method Iterator List.iterator()>
		//   12   26:astore_1        
		//   13   27:aload_1         
		//   14   28:invokeinterface #40  <Method boolean Iterator.hasNext()>
		//   15   33:ifeq            58
		//   16   36:aload_2         
		//   17   37:aload_1         
		//   18   38:invokeinterface #44  <Method Object Iterator.next()>
		//   19   43:checkcast       #46  <Class WorkSpec$WorkInfoPojo>
		//   20   46:invokevirtual   #50  <Method WorkInfo WorkSpec$WorkInfoPojo.toWorkInfo()>
		//   21   49:invokeinterface #54  <Method boolean List.add(Object)>
		//   22   54:pop             
		//*  23   55:goto            27
			return ((List) (arraylist));
		//   24   58:aload_2         
		//   25   59:areturn         
		}

	}
;
	public long backoffDelayDuration;
	public BackoffPolicy backoffPolicy;
	public Constraints constraints;
	public long flexDuration;
	public String id;
	public long initialDelay;
	public Data input;
	public String inputMergerClassName;
	public long intervalDuration;
	public long minimumRetentionDuration;
	public Data output;
	public long periodStartTime;
	public int runAttemptCount;
	public long scheduleRequestedAt;
	public androidx.work.WorkInfo.State state;
	public String workerClassName;

	static 
	{
	//    0    0:ldc1            #69  <String "WorkSpec">
	//    1    2:invokestatic    #75  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #77  <Field String TAG>
	//    3    8:new             #6   <Class WorkSpec$1>
	//    4   11:dup             
	//    5   12:invokespecial   #80  <Method void WorkSpec$1()>
	//    6   15:putstatic       #82  <Field Function WORK_INFO_MAPPER>
	//*   7   18:return          
	}
}
