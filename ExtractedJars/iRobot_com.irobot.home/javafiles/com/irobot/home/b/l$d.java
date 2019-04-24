// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.irobot.home.view.CustomTextView;
import com.irobot.home.view.PercentageRingView;
import org.apmem.tools.layouts.FlowLayout;

// Referenced classes of package com.irobot.home.b:
//			l

public static class l$d extends android.support.v7.widget.clerView.u
{

	public RelativeLayout n;
	public CustomTextView o;
	public CustomTextView p;
	public CustomTextView q;
	public PercentageRingView r;
	public ImageView s;
	public FlowLayout t;

	public l$d(View view)
	{
		super(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void android.support.v7.widget.RecyclerView$u(View)>
		n = (RelativeLayout)view.findViewById(0x7f090119);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #24  <Int 0x7f090119>
	//    6    9:invokevirtual   #30  <Method View View.findViewById(int)>
	//    7   12:checkcast       #32  <Class RelativeLayout>
	//    8   15:putfield        #34  <Field RelativeLayout n>
		o = (CustomTextView)view.findViewById(0x7f090194);
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #35  <Int 0x7f090194>
	//   12   22:invokevirtual   #30  <Method View View.findViewById(int)>
	//   13   25:checkcast       #37  <Class CustomTextView>
	//   14   28:putfield        #39  <Field CustomTextView o>
		p = (CustomTextView)view.findViewById(0x7f09010d);
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:ldc1            #40  <Int 0x7f09010d>
	//   18   35:invokevirtual   #30  <Method View View.findViewById(int)>
	//   19   38:checkcast       #37  <Class CustomTextView>
	//   20   41:putfield        #42  <Field CustomTextView p>
		q = (CustomTextView)view.findViewById(0x7f090204);
	//   21   44:aload_0         
	//   22   45:aload_1         
	//   23   46:ldc1            #43  <Int 0x7f090204>
	//   24   48:invokevirtual   #30  <Method View View.findViewById(int)>
	//   25   51:checkcast       #37  <Class CustomTextView>
	//   26   54:putfield        #45  <Field CustomTextView q>
		r = (PercentageRingView)view.findViewById(0x7f09020e);
	//   27   57:aload_0         
	//   28   58:aload_1         
	//   29   59:ldc1            #46  <Int 0x7f09020e>
	//   30   61:invokevirtual   #30  <Method View View.findViewById(int)>
	//   31   64:checkcast       #48  <Class PercentageRingView>
	//   32   67:putfield        #50  <Field PercentageRingView r>
		s = (ImageView)view.findViewById(0x7f0903cd);
	//   33   70:aload_0         
	//   34   71:aload_1         
	//   35   72:ldc1            #51  <Int 0x7f0903cd>
	//   36   74:invokevirtual   #30  <Method View View.findViewById(int)>
	//   37   77:checkcast       #53  <Class ImageView>
	//   38   80:putfield        #55  <Field ImageView s>
		t = (FlowLayout)view.findViewById(0x7f09023e);
	//   39   83:aload_0         
	//   40   84:aload_1         
	//   41   85:ldc1            #56  <Int 0x7f09023e>
	//   42   87:invokevirtual   #30  <Method View View.findViewById(int)>
	//   43   90:checkcast       #58  <Class FlowLayout>
	//   44   93:putfield        #60  <Field FlowLayout t>
	//   45   96:return          
	}
}
