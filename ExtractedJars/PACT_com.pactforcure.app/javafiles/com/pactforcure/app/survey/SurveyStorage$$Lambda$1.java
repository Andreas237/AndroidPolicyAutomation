// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import com.pactforcure.app.core.lambda.Predicate;

// Referenced classes of package com.pactforcure.app.survey:
//			ProgressStatus, SurveyStorage

final class SurveyStorage$$Lambda$1
	implements Predicate
{

	public static Predicate lambdaFactory$()
	{
		return ((Predicate) (instance));
	//    0    0:getstatic       #15  <Field SurveyStorage$$Lambda$1 instance>
	//    1    3:areturn         
	}

	public boolean test(Object obj)
	{
		return SurveyStorage.lambda$anySurveyAtStarted$1((ProgressStatus)obj);
	//    0    0:aload_1         
	//    1    1:checkcast       #23  <Class ProgressStatus>
	//    2    4:invokestatic    #29  <Method boolean SurveyStorage.lambda$anySurveyAtStarted$1(ProgressStatus)>
	//    3    7:ireturn         
	}

	private static final SurveyStorage$$Lambda$1 instance = new SurveyStorage$$Lambda$1();

	static 
	{
	//    0    0:new             #2   <Class SurveyStorage$$Lambda$1>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void SurveyStorage$$Lambda$1()>
	//    3    7:putstatic       #15  <Field SurveyStorage$$Lambda$1 instance>
	//*   4   10:return          
	}

	private SurveyStorage$$Lambda$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}
}
