// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.view.View;

final class SurveyTasksFragment$AddCards$$Lambda$1
	implements android.view.View.OnClickListener
{

	public static android.view.View.OnClickListener lambdaFactory$(SurveyTasksFragment.AddCards addcards)
	{
		return ((android.view.View.OnClickListener) (new SurveyTasksFragment$AddCards$$Lambda$1(addcards)));
	//    0    0:new             #2   <Class SurveyTasksFragment$AddCards$$Lambda$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void SurveyTasksFragment$AddCards$$Lambda$1(SurveyTasksFragment$AddCards)>
	//    4    8:areturn         
	}

	public void onClick(View view)
	{
		SurveyTasksFragment.AddCards.lambda$invoke$53(arg$1, view);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SurveyTasksFragment$AddCards arg$1>
	//    2    4:aload_1         
	//    3    5:invokestatic    #28  <Method void SurveyTasksFragment$AddCards.lambda$invoke$53(SurveyTasksFragment$AddCards, View)>
	//    4    8:return          
	}

	private final SurveyTasksFragment.AddCards arg$1;

	private SurveyTasksFragment$AddCards$$Lambda$1(SurveyTasksFragment.AddCards addcards)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		arg$1 = addcards;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field SurveyTasksFragment$AddCards arg$1>
	//    5    9:return          
	}
}
