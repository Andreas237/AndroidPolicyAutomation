// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.b;

import android.widget.CompoundButton;
import com.irobot.core.DayOfTheWeek;

// Referenced classes of package com.irobot.home.b:
//			ai

class ai$3
	implements android.widget.undButton.OnCheckedChangeListener
{

	public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
	{
		compoundbutton = ((CompoundButton) ((DayOfTheWeek)compoundbutton.getTag()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #28  <Method Object CompoundButton.getTag()>
	//    2    4:checkcast       #30  <Class DayOfTheWeek>
	//    3    7:astore_1        
		ai.a(a).a(((DayOfTheWeek) (compoundbutton)), flag);
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field ai a>
	//    6   12:invokestatic    #33  <Method ai$a ai.a(ai)>
	//    7   15:aload_1         
	//    8   16:iload_2         
	//    9   17:invokeinterface #38  <Method void ai$a.a(DayOfTheWeek, boolean)>
	//   10   22:return          
	}

	final ai a;

	ai$3(ai ai1)
	{
		a = ai1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field ai a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
