// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.consent;

import com.pactforcure.app.studies.Res;
import org.researchstack.backbone.model.ConsentDocument;
import org.researchstack.backbone.step.ConsentDocumentStep;
import org.researchstack.backbone.step.Step;

public class ConsentReviewStepsFactory
{

	public ConsentReviewStepsFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Step createReviewStep(ConsentDocument consentdocument, String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #13  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(String.format("<h1 style=\"text-align: center; font-family:sans-serif-light;\">%1$s</h1>", new Object[] {
			Res.getRegularString(0x7f08005b)
		}));
	//    4    8:aload_2         
	//    5    9:ldc1            #16  <String "<h1 style=\"text-align: center; font-family:sans-serif-light;\">%1$s</h1>">
	//    6   11:iconst_1        
	//    7   12:anewarray       Object[]
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:ldc1            #17  <Int 0x7f08005b>
	//   11   19:invokestatic    #23  <Method String Res.getRegularString(int)>
	//   12   22:aastore         
	//   13   23:invokestatic    #29  <Method String String.format(String, Object[])>
	//   14   26:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		stringbuilder.append(String.format("<p style=\"text-align: center\">%1$s</p>", new Object[] {
			Res.getRegularString(0x7f08005a)
		}));
	//   16   30:aload_2         
	//   17   31:ldc1            #35  <String "<p style=\"text-align: center\">%1$s</p>">
	//   18   33:iconst_1        
	//   19   34:anewarray       Object[]
	//   20   37:dup             
	//   21   38:iconst_0        
	//   22   39:ldc1            #36  <Int 0x7f08005a>
	//   23   41:invokestatic    #23  <Method String Res.getRegularString(int)>
	//   24   44:aastore         
	//   25   45:invokestatic    #29  <Method String String.format(String, Object[])>
	//   26   48:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
		stringbuilder.append(consentdocument.getHtmlReviewContent());
	//   28   52:aload_2         
	//   29   53:aload_0         
	//   30   54:invokevirtual   #42  <Method String ConsentDocument.getHtmlReviewContent()>
	//   31   57:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   32   60:pop             
		consentdocument = ((ConsentDocument) (new ConsentDocumentStep("consent_document_identifier")));
	//   33   61:new             #44  <Class ConsentDocumentStep>
	//   34   64:dup             
	//   35   65:ldc1            #46  <String "consent_document_identifier">
	//   36   67:invokespecial   #49  <Method void ConsentDocumentStep(String)>
	//   37   70:astore_0        
		((ConsentDocumentStep) (consentdocument)).setConsentHTML(stringbuilder.toString());
	//   38   71:aload_0         
	//   39   72:aload_2         
	//   40   73:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   41   76:invokevirtual   #55  <Method void ConsentDocumentStep.setConsentHTML(String)>
		((ConsentDocumentStep) (consentdocument)).setConfirmMessage(s);
	//   42   79:aload_0         
	//   43   80:aload_1         
	//   44   81:invokevirtual   #58  <Method void ConsentDocumentStep.setConfirmMessage(String)>
		return ((Step) (consentdocument));
	//   45   84:aload_0         
	//   46   85:areturn         
	}
}
