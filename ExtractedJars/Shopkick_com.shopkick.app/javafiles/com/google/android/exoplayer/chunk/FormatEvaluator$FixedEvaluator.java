// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.chunk;

import java.util.List;

// Referenced classes of package com.google.android.exoplayer.chunk:
//			FormatEvaluator, Format

public static final class FormatEvaluator$FixedEvaluator
	implements FormatEvaluator
{

	public void disable()
	{
	//    0    0:return          
	}

	public void enable()
	{
	//    0    0:return          
	}

	public void evaluate(List list, long l, Format aformat[], FormatEvaluator.Evaluation evaluation)
	{
		evaluation.format = aformat[0];
	//    0    0:aload           5
	//    1    2:aload           4
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:putfield        #22  <Field Format FormatEvaluator$Evaluation.format>
	//    5    9:return          
	}

	public FormatEvaluator$FixedEvaluator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
