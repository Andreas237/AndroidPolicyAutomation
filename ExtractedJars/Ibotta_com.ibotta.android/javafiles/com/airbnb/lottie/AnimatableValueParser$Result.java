// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			AnimatableValueParser

static class AnimatableValueParser$Result
{

	final Object initialValue;
	final List keyframes;

	AnimatableValueParser$Result(List list, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		keyframes = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field List keyframes>
		initialValue = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field Object initialValue>
	//    8   14:return          
	}
}
