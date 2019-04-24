// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.RadioGroup;
import rx.functions.Action1;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			RxRadioGroup

static final class RxRadioGroup$1
	implements Action1
{

	public void call(Integer integer)
	{
		if(integer.intValue() == -1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #30  <Method int Integer.intValue()>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          16
		{
			val$view.clearCheck();
	//    4    8:aload_0         
	//    5    9:getfield        #18  <Field RadioGroup val$view>
	//    6   12:invokevirtual   #35  <Method void RadioGroup.clearCheck()>
			return;
	//    7   15:return          
		} else
		{
			val$view.check(integer.intValue());
	//    8   16:aload_0         
	//    9   17:getfield        #18  <Field RadioGroup val$view>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #30  <Method int Integer.intValue()>
	//   12   24:invokevirtual   #39  <Method void RadioGroup.check(int)>
			return;
	//   13   27:return          
		}
	}

	public volatile void call(Object obj)
	{
		call((Integer)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class Integer>
	//    3    5:invokevirtual   #42  <Method void call(Integer)>
	//    4    8:return          
	}

	final RadioGroup val$view;

	RxRadioGroup$1(RadioGroup radiogroup)
	{
		val$view = radiogroup;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field RadioGroup val$view>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
