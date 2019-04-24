// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.b;

import android.view.View;
import com.irobot.home.view.CustomTextView;

// Referenced classes of package com.irobot.home.b:
//			l

public static class l$b extends android.support.v7.widget.clerView.u
{

	public CustomTextView n;

	public l$b(View view)
	{
		super(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void android.support.v7.widget.RecyclerView$u(View)>
		n = (CustomTextView)view.findViewById(0x7f0901d9);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #14  <Int 0x7f0901d9>
	//    6    9:invokevirtual   #20  <Method View View.findViewById(int)>
	//    7   12:checkcast       #22  <Class CustomTextView>
	//    8   15:putfield        #24  <Field CustomTextView n>
	//    9   18:return          
	}
}
