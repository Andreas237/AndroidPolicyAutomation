// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import com.pactforcure.app.survey.SurveyDataException;
import com.pactforcure.app.survey.TaskClosureReason;
import java.io.Serializable;
import org.researchstack.backbone.result.TaskResult;
import org.researchstack.backbone.step.Step;

public interface SurveyCallbacks
	extends Serializable
{

	public abstract void answerSelected(String s, Step step, Step step1, TaskResult taskresult)
		throws SurveyDataException;

	public abstract void taskClosedByTheUser(String s, String s1);

	public abstract void willStop(TaskClosureReason taskclosurereason);
}
