// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.researchstack.backbone.ui.callbacks;

import org.researchstack.backbone.result.StepResult;
import org.researchstack.backbone.step.Step;

public interface StepCallbacks
{

	public abstract void onCancelStep();

	public abstract void onSaveStep(int i, Step step, StepResult stepresult);

	public static final int ACTION_END = 2;
	public static final int ACTION_NEXT = 1;
	public static final int ACTION_NONE = 0;
	public static final int ACTION_PREV = -1;
}
