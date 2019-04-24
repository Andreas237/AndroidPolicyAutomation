// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.irobot.home.view.CustomTextView;

// Referenced classes of package com.irobot.home.b:
//			af

public static class af$b extends android.support.v7.widget.lerView.u
{

	public LinearLayout n;
	public ImageView o;
	public CustomTextView p;
	public ImageView q;

	public af$b(View view)
	{
		super(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void android.support.v7.widget.RecyclerView$u(View)>
		n = (LinearLayout)view.findViewById(0x7f090119);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #19  <Int 0x7f090119>
	//    6    9:invokevirtual   #25  <Method View View.findViewById(int)>
	//    7   12:checkcast       #27  <Class LinearLayout>
	//    8   15:putfield        #29  <Field LinearLayout n>
		p = (CustomTextView)view.findViewById(0x7f090371);
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #30  <Int 0x7f090371>
	//   12   22:invokevirtual   #25  <Method View View.findViewById(int)>
	//   13   25:checkcast       #32  <Class CustomTextView>
	//   14   28:putfield        #34  <Field CustomTextView p>
		o = (ImageView)view.findViewById(0x7f090370);
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:ldc1            #35  <Int 0x7f090370>
	//   18   35:invokevirtual   #25  <Method View View.findViewById(int)>
	//   19   38:checkcast       #37  <Class ImageView>
	//   20   41:putfield        #39  <Field ImageView o>
		q = (ImageView)view.findViewById(0x7f090053);
	//   21   44:aload_0         
	//   22   45:aload_1         
	//   23   46:ldc1            #40  <Int 0x7f090053>
	//   24   48:invokevirtual   #25  <Method View View.findViewById(int)>
	//   25   51:checkcast       #37  <Class ImageView>
	//   26   54:putfield        #42  <Field ImageView q>
	//   27   57:return          
	}
}
