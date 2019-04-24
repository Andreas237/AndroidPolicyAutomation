// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import java.util.HashSet;

// Referenced classes of package com.crashlytics.android.answers:
//			SamplingEventFilter

static final class SamplingEventFilter$1 extends HashSet
{

	SamplingEventFilter$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void HashSet()>
		add(((Object) (SessionEvent.Type.START)));
	//    2    4:aload_0         
	//    3    5:getstatic       #17  <Field SessionEvent$Type SessionEvent$Type.START>
	//    4    8:invokevirtual   #21  <Method boolean add(Object)>
	//    5   11:pop             
		add(((Object) (SessionEvent.Type.RESUME)));
	//    6   12:aload_0         
	//    7   13:getstatic       #24  <Field SessionEvent$Type SessionEvent$Type.RESUME>
	//    8   16:invokevirtual   #21  <Method boolean add(Object)>
	//    9   19:pop             
		add(((Object) (SessionEvent.Type.PAUSE)));
	//   10   20:aload_0         
	//   11   21:getstatic       #27  <Field SessionEvent$Type SessionEvent$Type.PAUSE>
	//   12   24:invokevirtual   #21  <Method boolean add(Object)>
	//   13   27:pop             
		add(((Object) (SessionEvent.Type.STOP)));
	//   14   28:aload_0         
	//   15   29:getstatic       #30  <Field SessionEvent$Type SessionEvent$Type.STOP>
	//   16   32:invokevirtual   #21  <Method boolean add(Object)>
	//   17   35:pop             
	//   18   36:return          
	}
}
