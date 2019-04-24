// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.view.View;

final class SurveyTasksFragment$AddCards$$Lambda$4
	implements android.view.View.OnClickListener
{

	public static android.view.View.OnClickListener lambdaFactory$(SurveyTasksFragment.AddCards addcards, int i)
	{
		return ((android.view.View.OnClickListener) (new SurveyTasksFragment$AddCards$$Lambda$4(addcards, i)));
	//    0    0:new             #2   <Class SurveyTasksFragment$AddCards$$Lambda$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #24  <Method void SurveyTasksFragment$AddCards$$Lambda$4(SurveyTasksFragment$AddCards, int)>
	//    5    9:areturn         
	}

	public void onClick(View view)
	{
		SurveyTasksFragment.AddCards.lambda$addHealthEconomicsCards$56(arg$1, arg$2, view);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SurveyTasksFragment$AddCards arg$1>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field int arg$2>
	//    4    8:aload_1         
	//    5    9:invokestatic    #32  <Method void SurveyTasksFragment$AddCards.lambda$addHealthEconomicsCards$56(SurveyTasksFragment$AddCards, int, View)>
	//    6   12:return          
	}

	private final SurveyTasksFragment.AddCards arg$1;
	private final int arg$2;

	private SurveyTasksFragment$AddCards$$Lambda$4(SurveyTasksFragment.AddCards addcards, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		arg$1 = addcards;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field SurveyTasksFragment$AddCards arg$1>
		arg$2 = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field int arg$2>
	//    8   14:return          
	}
}
