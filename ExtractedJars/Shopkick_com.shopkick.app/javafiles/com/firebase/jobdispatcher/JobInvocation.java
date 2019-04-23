// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.os.Bundle;
import java.util.Arrays;
import org.json.JSONObject;

// Referenced classes of package com.firebase.jobdispatcher:
//			JobParameters, RetryStrategy, JobTrigger, TriggerReason

final class JobInvocation
	implements JobParameters
{
	static final class Builder
	{

		public Builder addExtras(Bundle bundle)
		{
			if(bundle != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          12
				extras.putAll(bundle);
		//    2    4:aload_0         
		//    3    5:getfield        #35  <Field Bundle extras>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #78  <Method void Bundle.putAll(Bundle)>
			return this;
		//    6   12:aload_0         
		//    7   13:areturn         
		}

		JobInvocation build()
		{
			if(tag != null && service != null && trigger != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #40  <Field String tag>
		//*   2    4:ifnull          31
		//*   3    7:aload_0         
		//*   4    8:getfield        #43  <Field String service>
		//*   5   11:ifnull          31
		//*   6   14:aload_0         
		//*   7   15:getfield        #47  <Field JobTrigger trigger>
		//*   8   18:ifnull          31
				return new JobInvocation(this);
		//    9   21:new             #6   <Class JobInvocation>
		//   10   24:dup             
		//   11   25:aload_0         
		//   12   26:aconst_null     
		//   13   27:invokespecial   #83  <Method void JobInvocation(JobInvocation$Builder, JobInvocation$1)>
		//   14   30:areturn         
			else
				throw new IllegalArgumentException("Required fields were not populated.");
		//   15   31:new             #85  <Class IllegalArgumentException>
		//   16   34:dup             
		//   17   35:ldc1            #87  <String "Required fields were not populated.">
		//   18   37:invokespecial   #90  <Method void IllegalArgumentException(String)>
		//   19   40:athrow          
		}

		public Builder setConstraints(int ai[])
		{
			constraints = ai;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #63  <Field int[] constraints>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setLifetime(int i)
		{
			lifetime = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #59  <Field int lifetime>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setRecurring(boolean flag)
		{
			recurring = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #55  <Field boolean recurring>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setReplaceCurrent(boolean flag)
		{
			replaceCurrent = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #68  <Field boolean replaceCurrent>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setRetryStrategy(RetryStrategy retrystrategy)
		{
			retryStrategy = retrystrategy;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #51  <Field RetryStrategy retryStrategy>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setService(String s)
		{
			service = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #43  <Field String service>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setTag(String s)
		{
			tag = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #40  <Field String tag>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setTrigger(JobTrigger jobtrigger)
		{
			trigger = jobtrigger;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #47  <Field JobTrigger trigger>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setTriggerReason(TriggerReason triggerreason)
		{
			triggerReason = triggerreason;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #72  <Field TriggerReason triggerReason>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private int constraints[];
		private final Bundle extras = new Bundle();
		private int lifetime;
		private boolean recurring;
		private boolean replaceCurrent;
		private RetryStrategy retryStrategy;
		private String service;
		private String tag;
		private JobTrigger trigger;
		private TriggerReason triggerReason;


/*
		static String access$000(Builder builder)
		{
			return builder.tag;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field String tag>
		//    2    4:areturn         
		}

*/


/*
		static String access$100(Builder builder)
		{
			return builder.service;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field String service>
		//    2    4:areturn         
		}

*/


/*
		static JobTrigger access$200(Builder builder)
		{
			return builder.trigger;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field JobTrigger trigger>
		//    2    4:areturn         
		}

*/


/*
		static RetryStrategy access$300(Builder builder)
		{
			return builder.retryStrategy;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field RetryStrategy retryStrategy>
		//    2    4:areturn         
		}

*/


/*
		static boolean access$400(Builder builder)
		{
			return builder.recurring;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field boolean recurring>
		//    2    4:ireturn         
		}

*/


/*
		static int access$500(Builder builder)
		{
			return builder.lifetime;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field int lifetime>
		//    2    4:ireturn         
		}

*/


/*
		static int[] access$600(Builder builder)
		{
			return builder.constraints;
		//    0    0:aload_0         
		//    1    1:getfield        #63  <Field int[] constraints>
		//    2    4:areturn         
		}

*/


/*
		static Bundle access$700(Builder builder)
		{
			return builder.extras;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Bundle extras>
		//    2    4:areturn         
		}

*/


/*
		static boolean access$800(Builder builder)
		{
			return builder.replaceCurrent;
		//    0    0:aload_0         
		//    1    1:getfield        #68  <Field boolean replaceCurrent>
		//    2    4:ireturn         
		}

*/


/*
		static TriggerReason access$900(Builder builder)
		{
			return builder.triggerReason;
		//    0    0:aload_0         
		//    1    1:getfield        #72  <Field TriggerReason triggerReason>
		//    2    4:areturn         
		}

*/

		Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #32  <Class Bundle>
		//    4    8:dup             
		//    5    9:invokespecial   #33  <Method void Bundle()>
		//    6   12:putfield        #35  <Field Bundle extras>
		//    7   15:return          
		}
	}


	private JobInvocation(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		tag = builder.tag;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #39  <Method String JobInvocation$Builder.access$000(JobInvocation$Builder)>
	//    5    9:putfield        #41  <Field String tag>
		service = builder.service;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #44  <Method String JobInvocation$Builder.access$100(JobInvocation$Builder)>
	//    9   17:putfield        #46  <Field String service>
		trigger = builder.trigger;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #50  <Method JobTrigger JobInvocation$Builder.access$200(JobInvocation$Builder)>
	//   13   25:putfield        #52  <Field JobTrigger trigger>
		retryStrategy = builder.retryStrategy;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #56  <Method RetryStrategy JobInvocation$Builder.access$300(JobInvocation$Builder)>
	//   17   33:putfield        #58  <Field RetryStrategy retryStrategy>
		recurring = builder.recurring;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokestatic    #62  <Method boolean JobInvocation$Builder.access$400(JobInvocation$Builder)>
	//   21   41:putfield        #64  <Field boolean recurring>
		lifetime = builder.lifetime;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokestatic    #68  <Method int JobInvocation$Builder.access$500(JobInvocation$Builder)>
	//   25   49:putfield        #70  <Field int lifetime>
		constraints = builder.constraints;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokestatic    #74  <Method int[] JobInvocation$Builder.access$600(JobInvocation$Builder)>
	//   29   57:putfield        #76  <Field int[] constraints>
		extras = builder.extras;
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:invokestatic    #80  <Method Bundle JobInvocation$Builder.access$700(JobInvocation$Builder)>
	//   33   65:putfield        #82  <Field Bundle extras>
		replaceCurrent = builder.replaceCurrent;
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:invokestatic    #85  <Method boolean JobInvocation$Builder.access$800(JobInvocation$Builder)>
	//   37   73:putfield        #87  <Field boolean replaceCurrent>
		triggerReason = builder.triggerReason;
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:invokestatic    #91  <Method TriggerReason JobInvocation$Builder.access$900(JobInvocation$Builder)>
	//   41   81:putfield        #93  <Field TriggerReason triggerReason>
	//   42   84:return          
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
	//*   6    8:ifnull          64
		{
			if(!((Object) (((Object)this).getClass())).equals(((Object) (obj.getClass()))))
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #103 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #103 <Method Class Object.getClass()>
	//*  11   19:invokevirtual   #105 <Method boolean Object.equals(Object)>
	//*  12   22:ifne            27
				return false;
	//   13   25:iconst_0        
	//   14   26:ireturn         
			obj = ((Object) ((JobInvocation)obj));
	//   15   27:aload_1         
	//   16   28:checkcast       #2   <Class JobInvocation>
	//   17   31:astore_1        
			return tag.equals(((Object) (((JobInvocation) (obj)).tag))) && service.equals(((Object) (((JobInvocation) (obj)).service)));
	//   18   32:aload_0         
	//   19   33:getfield        #41  <Field String tag>
	//   20   36:aload_1         
	//   21   37:getfield        #41  <Field String tag>
	//   22   40:invokevirtual   #108 <Method boolean String.equals(Object)>
	//   23   43:ifeq            62
	//   24   46:aload_0         
	//   25   47:getfield        #46  <Field String service>
	//   26   50:aload_1         
	//   27   51:getfield        #46  <Field String service>
	//   28   54:invokevirtual   #108 <Method boolean String.equals(Object)>
	//   29   57:ifeq            62
	//   30   60:iconst_1        
	//   31   61:ireturn         
	//   32   62:iconst_0        
	//   33   63:ireturn         
		} else
		{
			return false;
	//   34   64:iconst_0        
	//   35   65:ireturn         
		}
	}

	public int[] getConstraints()
	{
		return constraints;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field int[] constraints>
	//    2    4:areturn         
	}

	public Bundle getExtras()
	{
		return extras;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field Bundle extras>
	//    2    4:areturn         
	}

	public int getLifetime()
	{
		return lifetime;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field int lifetime>
	//    2    4:ireturn         
	}

	public RetryStrategy getRetryStrategy()
	{
		return retryStrategy;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field RetryStrategy retryStrategy>
	//    2    4:areturn         
	}

	public String getService()
	{
		return service;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String service>
	//    2    4:areturn         
	}

	public String getTag()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String tag>
	//    2    4:areturn         
	}

	public JobTrigger getTrigger()
	{
		return trigger;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field JobTrigger trigger>
	//    2    4:areturn         
	}

	public TriggerReason getTriggerReason()
	{
		return triggerReason;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field TriggerReason triggerReason>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return tag.hashCode() * 31 + service.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String tag>
	//    2    4:invokevirtual   #127 <Method int String.hashCode()>
	//    3    7:bipush          31
	//    4    9:imul            
	//    5   10:aload_0         
	//    6   11:getfield        #46  <Field String service>
	//    7   14:invokevirtual   #127 <Method int String.hashCode()>
	//    8   17:iadd            
	//    9   18:ireturn         
	}

	public boolean isRecurring()
	{
		return recurring;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field boolean recurring>
	//    2    4:ireturn         
	}

	public boolean shouldReplaceCurrent()
	{
		return replaceCurrent;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field boolean replaceCurrent>
	//    2    4:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #133 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #134 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("JobInvocation{tag='");
	//    4    8:aload_1         
	//    5    9:ldc1            #136 <String "JobInvocation{tag='">
	//    6   11:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(JSONObject.quote(tag));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #41  <Field String tag>
	//   11   20:invokestatic    #146 <Method String JSONObject.quote(String)>
	//   12   23:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append('\'');
	//   14   27:aload_1         
	//   15   28:bipush          39
	//   16   30:invokevirtual   #149 <Method StringBuilder StringBuilder.append(char)>
	//   17   33:pop             
		stringbuilder.append(", service='");
	//   18   34:aload_1         
	//   19   35:ldc1            #151 <String ", service='">
	//   20   37:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
		stringbuilder.append(service);
	//   22   41:aload_1         
	//   23   42:aload_0         
	//   24   43:getfield        #46  <Field String service>
	//   25   46:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		stringbuilder.append('\'');
	//   27   50:aload_1         
	//   28   51:bipush          39
	//   29   53:invokevirtual   #149 <Method StringBuilder StringBuilder.append(char)>
	//   30   56:pop             
		stringbuilder.append(", trigger=");
	//   31   57:aload_1         
	//   32   58:ldc1            #153 <String ", trigger=">
	//   33   60:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   34   63:pop             
		stringbuilder.append(((Object) (trigger)));
	//   35   64:aload_1         
	//   36   65:aload_0         
	//   37   66:getfield        #52  <Field JobTrigger trigger>
	//   38   69:invokevirtual   #156 <Method StringBuilder StringBuilder.append(Object)>
	//   39   72:pop             
		stringbuilder.append(", recurring=");
	//   40   73:aload_1         
	//   41   74:ldc1            #158 <String ", recurring=">
	//   42   76:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   43   79:pop             
		stringbuilder.append(recurring);
	//   44   80:aload_1         
	//   45   81:aload_0         
	//   46   82:getfield        #64  <Field boolean recurring>
	//   47   85:invokevirtual   #161 <Method StringBuilder StringBuilder.append(boolean)>
	//   48   88:pop             
		stringbuilder.append(", lifetime=");
	//   49   89:aload_1         
	//   50   90:ldc1            #163 <String ", lifetime=">
	//   51   92:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   52   95:pop             
		stringbuilder.append(lifetime);
	//   53   96:aload_1         
	//   54   97:aload_0         
	//   55   98:getfield        #70  <Field int lifetime>
	//   56  101:invokevirtual   #166 <Method StringBuilder StringBuilder.append(int)>
	//   57  104:pop             
		stringbuilder.append(", constraints=");
	//   58  105:aload_1         
	//   59  106:ldc1            #168 <String ", constraints=">
	//   60  108:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   61  111:pop             
		stringbuilder.append(Arrays.toString(constraints));
	//   62  112:aload_1         
	//   63  113:aload_0         
	//   64  114:getfield        #76  <Field int[] constraints>
	//   65  117:invokestatic    #173 <Method String Arrays.toString(int[])>
	//   66  120:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   67  123:pop             
		stringbuilder.append(", extras=");
	//   68  124:aload_1         
	//   69  125:ldc1            #175 <String ", extras=">
	//   70  127:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   71  130:pop             
		stringbuilder.append(((Object) (extras)));
	//   72  131:aload_1         
	//   73  132:aload_0         
	//   74  133:getfield        #82  <Field Bundle extras>
	//   75  136:invokevirtual   #156 <Method StringBuilder StringBuilder.append(Object)>
	//   76  139:pop             
		stringbuilder.append(", retryStrategy=");
	//   77  140:aload_1         
	//   78  141:ldc1            #177 <String ", retryStrategy=">
	//   79  143:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   80  146:pop             
		stringbuilder.append(((Object) (retryStrategy)));
	//   81  147:aload_1         
	//   82  148:aload_0         
	//   83  149:getfield        #58  <Field RetryStrategy retryStrategy>
	//   84  152:invokevirtual   #156 <Method StringBuilder StringBuilder.append(Object)>
	//   85  155:pop             
		stringbuilder.append(", replaceCurrent=");
	//   86  156:aload_1         
	//   87  157:ldc1            #179 <String ", replaceCurrent=">
	//   88  159:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   89  162:pop             
		stringbuilder.append(replaceCurrent);
	//   90  163:aload_1         
	//   91  164:aload_0         
	//   92  165:getfield        #87  <Field boolean replaceCurrent>
	//   93  168:invokevirtual   #161 <Method StringBuilder StringBuilder.append(boolean)>
	//   94  171:pop             
		stringbuilder.append(", triggerReason=");
	//   95  172:aload_1         
	//   96  173:ldc1            #181 <String ", triggerReason=">
	//   97  175:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   98  178:pop             
		stringbuilder.append(((Object) (triggerReason)));
	//   99  179:aload_1         
	//  100  180:aload_0         
	//  101  181:getfield        #93  <Field TriggerReason triggerReason>
	//  102  184:invokevirtual   #156 <Method StringBuilder StringBuilder.append(Object)>
	//  103  187:pop             
		stringbuilder.append('}');
	//  104  188:aload_1         
	//  105  189:bipush          125
	//  106  191:invokevirtual   #149 <Method StringBuilder StringBuilder.append(char)>
	//  107  194:pop             
		return stringbuilder.toString();
	//  108  195:aload_1         
	//  109  196:invokevirtual   #183 <Method String StringBuilder.toString()>
	//  110  199:areturn         
	}

	private final int constraints[];
	private final Bundle extras;
	private final int lifetime;
	private final boolean recurring;
	private final boolean replaceCurrent;
	private final RetryStrategy retryStrategy;
	private final String service;
	private final String tag;
	private final JobTrigger trigger;
	private final TriggerReason triggerReason;
}
