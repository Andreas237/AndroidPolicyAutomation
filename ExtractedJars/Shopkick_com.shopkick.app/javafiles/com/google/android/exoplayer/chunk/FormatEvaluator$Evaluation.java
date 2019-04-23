// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.chunk;


// Referenced classes of package com.google.android.exoplayer.chunk:
//			FormatEvaluator, Format

public static final class FormatEvaluator$Evaluation
{

	public Format format;
	public int queueSize;
	public int trigger;

	public FormatEvaluator$Evaluation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		trigger = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #18  <Field int trigger>
	//    5    9:return          
	}
}
