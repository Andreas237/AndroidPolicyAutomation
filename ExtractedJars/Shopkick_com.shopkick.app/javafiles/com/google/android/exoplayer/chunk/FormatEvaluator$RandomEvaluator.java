// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.chunk;

import java.util.List;
import java.util.Random;

// Referenced classes of package com.google.android.exoplayer.chunk:
//			FormatEvaluator, Format

public static final class FormatEvaluator$RandomEvaluator
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
		list = ((List) (aformat[random.nextInt(aformat.length)]));
	//    0    0:aload           4
	//    1    2:aload_0         
	//    2    3:getfield        #18  <Field Random random>
	//    3    6:aload           4
	//    4    8:arraylength     
	//    5    9:invokevirtual   #31  <Method int Random.nextInt(int)>
	//    6   12:aaload          
	//    7   13:astore_1        
		if(evaluation.format != null && !evaluation.format.equals(((Object) (list))))
	//*   8   14:aload           5
	//*   9   16:getfield        #37  <Field Format FormatEvaluator$Evaluation.format>
	//*  10   19:ifnull          40
	//*  11   22:aload           5
	//*  12   24:getfield        #37  <Field Format FormatEvaluator$Evaluation.format>
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #43  <Method boolean Format.equals(Object)>
	//*  15   31:ifne            40
			evaluation.trigger = 3;
	//   16   34:aload           5
	//   17   36:iconst_3        
	//   18   37:putfield        #47  <Field int FormatEvaluator$Evaluation.trigger>
		evaluation.format = ((Format) (list));
	//   19   40:aload           5
	//   20   42:aload_1         
	//   21   43:putfield        #37  <Field Format FormatEvaluator$Evaluation.format>
	//   22   46:return          
	}

	private final Random random;

	public FormatEvaluator$RandomEvaluator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		random = new Random();
	//    2    4:aload_0         
	//    3    5:new             #15  <Class Random>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void Random()>
	//    6   12:putfield        #18  <Field Random random>
	//    7   15:return          
	}

	public FormatEvaluator$RandomEvaluator(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		random = new Random(i);
	//    2    4:aload_0         
	//    3    5:new             #15  <Class Random>
	//    4    8:dup             
	//    5    9:iload_1         
	//    6   10:i2l             
	//    7   11:invokespecial   #23  <Method void Random(long)>
	//    8   14:putfield        #18  <Field Random random>
	//    9   17:return          
	}
}
