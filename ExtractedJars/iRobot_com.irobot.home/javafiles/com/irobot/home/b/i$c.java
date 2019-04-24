// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.b;

import android.view.View;
import android.widget.LinearLayout;
import com.irobot.home.view.CustomTextView;

// Referenced classes of package com.irobot.home.b:
//			i

public static class i$c extends android.support.v7.widget.clerView.u
{

	public CustomTextView n;
	public LinearLayout o;

	public i$c(View view)
	{
		super(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void android.support.v7.widget.RecyclerView$u(View)>
		n = (CustomTextView)view.findViewById(0x7f09046d);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #16  <Int 0x7f09046d>
	//    6    9:invokevirtual   #22  <Method View View.findViewById(int)>
	//    7   12:checkcast       #24  <Class CustomTextView>
	//    8   15:putfield        #26  <Field CustomTextView n>
		o = (LinearLayout)view.findViewById(0x7f09046c);
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #27  <Int 0x7f09046c>
	//   12   22:invokevirtual   #22  <Method View View.findViewById(int)>
	//   13   25:checkcast       #29  <Class LinearLayout>
	//   14   28:putfield        #31  <Field LinearLayout o>
	//   15   31:return          
	}
}
