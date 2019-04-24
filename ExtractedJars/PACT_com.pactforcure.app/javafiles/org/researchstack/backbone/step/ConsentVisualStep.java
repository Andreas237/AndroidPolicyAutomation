// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.researchstack.backbone.step;

import org.researchstack.backbone.model.ConsentSection;
import org.researchstack.backbone.ui.step.layout.ConsentVisualStepLayout;

// Referenced classes of package org.researchstack.backbone.step:
//			Step

public class ConsentVisualStep extends Step
{

	public ConsentVisualStep(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void Step(String)>
	//    3    5:return          
	}

	public String getNextButtonString()
	{
		return nextButtonString;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String nextButtonString>
	//    2    4:areturn         
	}

	public ConsentSection getSection()
	{
		return section;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ConsentSection section>
	//    2    4:areturn         
	}

	public Class getStepLayoutClass()
	{
		return org/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;
	//    0    0:ldc1            #27  <Class ConsentVisualStepLayout>
	//    1    2:areturn         
	}

	public int getStepTitle()
	{
		if(super.getStepTitle() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #31  <Method int Step.getStepTitle()>
	//*   2    4:ifne            11
			return org.researchstack.backbone.R.string.rsb_consent;
	//    3    7:getstatic       #37  <Field int org.researchstack.backbone.R$string.rsb_consent>
	//    4   10:ireturn         
		else
			return super.getStepTitle();
	//    5   11:aload_0         
	//    6   12:invokespecial   #31  <Method int Step.getStepTitle()>
	//    7   15:ireturn         
	}

	public void setNextButtonString(String s)
	{
		nextButtonString = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field String nextButtonString>
	//    3    5:return          
	}

	public void setSection(ConsentSection consentsection)
	{
		section = consentsection;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field ConsentSection section>
	//    3    5:return          
	}

	private String nextButtonString;
	private ConsentSection section;
}
