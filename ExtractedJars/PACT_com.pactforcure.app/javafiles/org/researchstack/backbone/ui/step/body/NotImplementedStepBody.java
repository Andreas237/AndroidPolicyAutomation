// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.researchstack.backbone.ui.step.body;

import android.view.*;
import android.widget.TextView;
import java.util.List;
import org.researchstack.backbone.answerformat.AnswerFormat;
import org.researchstack.backbone.result.StepResult;
import org.researchstack.backbone.step.QuestionStep;
import org.researchstack.backbone.ui.step.GoToNextLayout;

// Referenced classes of package org.researchstack.backbone.ui.step.body:
//			StepBody, BodyAnswer

public class NotImplementedStepBody
	implements StepBody
{

	public NotImplementedStepBody(QuestionStep questionstep, StepResult stepresult)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		step = questionstep;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field QuestionStep step>
	//    5    9:return          
	}

	public void clearViews()
	{
	//    0    0:return          
	}

	public BodyAnswer getBodyAnswerState(List list)
	{
		return BodyAnswer.VALID;
	//    0    0:getstatic       #26  <Field BodyAnswer BodyAnswer.VALID>
	//    1    3:areturn         
	}

	public View getBodyView(int i, LayoutInflater layoutinflater, ViewGroup viewgroup)
	{
		viewgroup = ((ViewGroup) (new TextView(viewgroup.getContext())));
	//    0    0:new             #32  <Class TextView>
	//    1    3:dup             
	//    2    4:aload_3         
	//    3    5:invokevirtual   #38  <Method android.content.Context ViewGroup.getContext()>
	//    4    8:invokespecial   #41  <Method void TextView(android.content.Context)>
	//    5   11:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    6   12:new             #43  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #44  <Method void StringBuilder()>
	//    9   19:astore          4
		if(i == 1)
	//*  10   21:iload_1         
	//*  11   22:iconst_1        
	//*  12   23:icmpne          65
			layoutinflater = "form ";
	//   13   26:ldc1            #46  <String "form ">
	//   14   28:astore_2        
		else
	//*  15   29:aload_3         
	//*  16   30:aload           4
	//*  17   32:aload_2         
	//*  18   33:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//*  19   36:ldc1            #52  <String "not implemented: ">
	//*  20   38:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//*  21   41:aload_0         
	//*  22   42:getfield        #16  <Field QuestionStep step>
	//*  23   45:invokevirtual   #58  <Method AnswerFormat QuestionStep.getAnswerFormat()>
	//*  24   48:invokevirtual   #64  <Method org.researchstack.backbone.answerformat.AnswerFormat$QuestionType AnswerFormat.getQuestionType()>
	//*  25   51:invokevirtual   #68  <Method String Object.toString()>
	//*  26   54:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//*  27   57:invokevirtual   #69  <Method String StringBuilder.toString()>
	//*  28   60:invokevirtual   #73  <Method void TextView.setText(CharSequence)>
	//*  29   63:aload_3         
	//*  30   64:areturn         
			layoutinflater = "";
	//   31   65:ldc1            #75  <String "">
	//   32   67:astore_2        
		((TextView) (viewgroup)).setText(((CharSequence) (stringbuilder.append(((String) (layoutinflater))).append("not implemented: ").append(((Object) (step.getAnswerFormat().getQuestionType())).toString()).toString())));
		return ((View) (viewgroup));
	//*  33   68:goto            29
	}

	public StepResult getStepResult(boolean flag)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void setAnswer(String s)
	{
	//    0    0:return          
	}

	public void setOnNextListener(GoToNextLayout gotonextlayout)
	{
	//    0    0:return          
	}

	private QuestionStep step;
}
