// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.b;

import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.irobot.home.b:
//			ai

public class ai$b extends android.support.v7.widget.lerView.u
{

	TextView n;
	TextView o;
	SwitchCompat p;
	final ai q;

	public ai$b(ai ai1, View view)
	{
		q = ai1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ai q>
		super(view);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #21  <Method void android.support.v7.widget.RecyclerView$u(View)>
		n = (TextView)view.findViewById(0x7f090384);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:ldc1            #22  <Int 0x7f090384>
	//    9   14:invokevirtual   #28  <Method View View.findViewById(int)>
	//   10   17:checkcast       #30  <Class TextView>
	//   11   20:putfield        #32  <Field TextView n>
		o = (TextView)view.findViewById(0x7f090389);
	//   12   23:aload_0         
	//   13   24:aload_2         
	//   14   25:ldc1            #33  <Int 0x7f090389>
	//   15   27:invokevirtual   #28  <Method View View.findViewById(int)>
	//   16   30:checkcast       #30  <Class TextView>
	//   17   33:putfield        #35  <Field TextView o>
		p = (SwitchCompat)view.findViewById(0x7f09039d);
	//   18   36:aload_0         
	//   19   37:aload_2         
	//   20   38:ldc1            #36  <Int 0x7f09039d>
	//   21   40:invokevirtual   #28  <Method View View.findViewById(int)>
	//   22   43:checkcast       #38  <Class SwitchCompat>
	//   23   46:putfield        #40  <Field SwitchCompat p>
	//   24   49:return          
	}
}
