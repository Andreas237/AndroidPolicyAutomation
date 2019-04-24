// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.consent;

import org.researchstack.backbone.model.ConsentDocument;

// Referenced classes of package com.pactforcure.app.consent:
//			GeneralConsentTask

public class GeneralConsentTuple
{

	public GeneralConsentTuple(ConsentDocument consentdocument, GeneralConsentTask generalconsenttask)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		consentDocument = consentdocument;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field ConsentDocument consentDocument>
		generalConsentTask = generalconsenttask;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field GeneralConsentTask generalConsentTask>
	//    8   14:return          
	}

	public ConsentDocument consentDocument;
	public GeneralConsentTask generalConsentTask;
}
