// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.irobot.home.view.CustomTextView;

// Referenced classes of package com.irobot.home.b:
//			u

public static class u$e extends android.support.v7.widget.clerView.u
{

	public RelativeLayout n;
	public CustomTextView o;
	public ImageView p;

	public u$e(View view)
	{
		super(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void android.support.v7.widget.RecyclerView$u(View)>
		n = (RelativeLayout)view.findViewById(0x7f090119);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #18  <Int 0x7f090119>
	//    6    9:invokevirtual   #24  <Method View View.findViewById(int)>
	//    7   12:checkcast       #26  <Class RelativeLayout>
	//    8   15:putfield        #28  <Field RelativeLayout n>
		o = (CustomTextView)view.findViewById(0x7f090194);
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #29  <Int 0x7f090194>
	//   12   22:invokevirtual   #24  <Method View View.findViewById(int)>
	//   13   25:checkcast       #31  <Class CustomTextView>
	//   14   28:putfield        #33  <Field CustomTextView o>
		p = (ImageView)view.findViewById(0x7f0900c1);
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:ldc1            #34  <Int 0x7f0900c1>
	//   18   35:invokevirtual   #24  <Method View View.findViewById(int)>
	//   19   38:checkcast       #36  <Class ImageView>
	//   20   41:putfield        #38  <Field ImageView p>
	//   21   44:return          
	}
}
