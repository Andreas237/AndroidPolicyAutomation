// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import com.pactforcure.app.studies.StudyId;

// Referenced classes of package com.pactforcure.app.ui:
//			ParticipantAddressFormActivity

static class ParticipantAddressFormActivity$2
{

	static final int $SwitchMap$com$pactforcure$app$studies$StudyId[];

	static 
	{
		$SwitchMap$com$pactforcure$app$studies$StudyId = new int[StudyId.values().length];
	//    0    0:invokestatic    #18  <Method StudyId[] StudyId.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$studies$StudyId>
		try
		{
			$SwitchMap$com$pactforcure$app$studies$StudyId[StudyId.US.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$studies$StudyId>
	//    5   12:getstatic       #24  <Field StudyId StudyId.US>
	//    6   15:invokevirtual   #28  <Method int StudyId.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$studies$StudyId>
	//*  10   23:getstatic       #31  <Field StudyId StudyId.AU>
	//*  11   26:invokevirtual   #28  <Method int StudyId.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$studies$StudyId>
	//*  15   34:getstatic       #34  <Field StudyId StudyId.UK>
	//*  16   37:invokevirtual   #28  <Method int StudyId.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:return          
	//*  20   43:astore_0        
	//*  21   44:return          
	//*  22   45:astore_0        
	//*  23   46:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   49:astore_0        
		try
		{
			$SwitchMap$com$pactforcure$app$studies$StudyId[StudyId.AU.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror1) { }
		try
		{
			$SwitchMap$com$pactforcure$app$studies$StudyId[StudyId.UK.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  25   50:goto            20
	}
}
