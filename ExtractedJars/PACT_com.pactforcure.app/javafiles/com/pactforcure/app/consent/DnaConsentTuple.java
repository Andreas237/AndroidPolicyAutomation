// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.consent;

import org.researchstack.backbone.model.ConsentDocument;

// Referenced classes of package com.pactforcure.app.consent:
//			DnaConsentTask

public class DnaConsentTuple
{

	public DnaConsentTuple(ConsentDocument consentdocument, DnaConsentTask dnaconsenttask)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		consentDocument = consentdocument;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field ConsentDocument consentDocument>
		consentTask = dnaconsenttask;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field DnaConsentTask consentTask>
	//    8   14:return          
	}

	public ConsentDocument consentDocument;
	public DnaConsentTask consentTask;
}
