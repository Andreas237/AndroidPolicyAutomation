// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.text.TextUtils;
import java.util.List;

// Referenced classes of package com.firebase.jobdispatcher:
//			JobValidator, JobParameters, JobTrigger, RetryStrategy

public class ValidationEnforcer
	implements JobValidator
{
	public static final class ValidationException extends RuntimeException
	{

		public List getErrors()
		{
			return errors;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field List errors>
		//    2    4:areturn         
		}

		private final List errors;

		public ValidationException(String s, List list)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #15  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #18  <Method void StringBuilder()>
		//    3    7:astore_3        
			stringbuilder.append(s);
		//    4    8:aload_3         
		//    5    9:aload_1         
		//    6   10:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
		//    7   13:pop             
			stringbuilder.append(": ");
		//    8   14:aload_3         
		//    9   15:ldc1            #24  <String ": ">
		//   10   17:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
		//   11   20:pop             
			stringbuilder.append(TextUtils.join("\n  - ", ((Iterable) (list))));
		//   12   21:aload_3         
		//   13   22:ldc1            #26  <String "\n  - ">
		//   14   24:aload_2         
		//   15   25:invokestatic    #32  <Method String TextUtils.join(CharSequence, Iterable)>
		//   16   28:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
		//   17   31:pop             
			super(stringbuilder.toString());
		//   18   32:aload_0         
		//   19   33:aload_3         
		//   20   34:invokevirtual   #36  <Method String StringBuilder.toString()>
		//   21   37:invokespecial   #39  <Method void RuntimeException(String)>
			errors = list;
		//   22   40:aload_0         
		//   23   41:aload_2         
		//   24   42:putfield        #41  <Field List errors>
		//   25   45:return          
		}
	}


	public ValidationEnforcer(JobValidator jobvalidator)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		validator = jobvalidator;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field JobValidator validator>
	//    5    9:return          
	}

	private static void ensureNoErrors(List list)
	{
		if(list == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		else
			throw new ValidationException("JobParameters is invalid", list);
	//    3    5:new             #8   <Class ValidationEnforcer$ValidationException>
	//    4    8:dup             
	//    5    9:ldc1            #23  <String "JobParameters is invalid">
	//    6   11:aload_0         
	//    7   12:invokespecial   #26  <Method void ValidationEnforcer$ValidationException(String, List)>
	//    8   15:athrow          
	}

	public final void ensureValid(JobParameters jobparameters)
	{
		ensureNoErrors(validate(jobparameters));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #34  <Method List validate(JobParameters)>
	//    3    5:invokestatic    #36  <Method void ensureNoErrors(List)>
	//    4    8:return          
	}

	public final void ensureValid(JobTrigger jobtrigger)
	{
		ensureNoErrors(validate(jobtrigger));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #40  <Method List validate(JobTrigger)>
	//    3    5:invokestatic    #36  <Method void ensureNoErrors(List)>
	//    4    8:return          
	}

	public final void ensureValid(RetryStrategy retrystrategy)
	{
		ensureNoErrors(validate(retrystrategy));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #44  <Method List validate(RetryStrategy)>
	//    3    5:invokestatic    #36  <Method void ensureNoErrors(List)>
	//    4    8:return          
	}

	public final boolean isValid(JobParameters jobparameters)
	{
		return validate(jobparameters) == null;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #34  <Method List validate(JobParameters)>
	//    3    5:ifnonnull       10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public final boolean isValid(JobTrigger jobtrigger)
	{
		return validate(jobtrigger) == null;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #40  <Method List validate(JobTrigger)>
	//    3    5:ifnonnull       10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public final boolean isValid(RetryStrategy retrystrategy)
	{
		return validate(retrystrategy) == null;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #44  <Method List validate(RetryStrategy)>
	//    3    5:ifnonnull       10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public List validate(JobParameters jobparameters)
	{
		return validator.validate(jobparameters);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field JobValidator validator>
	//    2    4:aload_1         
	//    3    5:invokeinterface #50  <Method List JobValidator.validate(JobParameters)>
	//    4   10:areturn         
	}

	public List validate(JobTrigger jobtrigger)
	{
		return validator.validate(jobtrigger);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field JobValidator validator>
	//    2    4:aload_1         
	//    3    5:invokeinterface #53  <Method List JobValidator.validate(JobTrigger)>
	//    4   10:areturn         
	}

	public List validate(RetryStrategy retrystrategy)
	{
		return validator.validate(retrystrategy);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field JobValidator validator>
	//    2    4:aload_1         
	//    3    5:invokeinterface #55  <Method List JobValidator.validate(RetryStrategy)>
	//    4   10:areturn         
	}

	private final JobValidator validator;
}
