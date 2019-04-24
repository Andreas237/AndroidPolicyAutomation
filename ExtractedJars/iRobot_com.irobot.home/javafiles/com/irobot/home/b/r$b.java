// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.irobot.home.b:
//			r

public class r$b extends android.support.v7.widget.clerView.u
{

	ImageView n;
	TextView o;
	TextView p;
	TextView q;
	final r r;

	public r$b(r r1, View view)
	{
		r = r1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field r r>
		super(view);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #22  <Method void android.support.v7.widget.RecyclerView$u(View)>
		n = (ImageView)view.findViewById(0x7f09010c);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:ldc1            #23  <Int 0x7f09010c>
	//    9   14:invokevirtual   #29  <Method View View.findViewById(int)>
	//   10   17:checkcast       #31  <Class ImageView>
	//   11   20:putfield        #33  <Field ImageView n>
		o = (TextView)view.findViewById(0x7f09026a);
	//   12   23:aload_0         
	//   13   24:aload_2         
	//   14   25:ldc1            #34  <Int 0x7f09026a>
	//   15   27:invokevirtual   #29  <Method View View.findViewById(int)>
	//   16   30:checkcast       #36  <Class TextView>
	//   17   33:putfield        #38  <Field TextView o>
		p = (TextView)view.findViewById(0x7f09026b);
	//   18   36:aload_0         
	//   19   37:aload_2         
	//   20   38:ldc1            #39  <Int 0x7f09026b>
	//   21   40:invokevirtual   #29  <Method View View.findViewById(int)>
	//   22   43:checkcast       #36  <Class TextView>
	//   23   46:putfield        #41  <Field TextView p>
		q = (TextView)view.findViewById(0x7f090179);
	//   24   49:aload_0         
	//   25   50:aload_2         
	//   26   51:ldc1            #42  <Int 0x7f090179>
	//   27   53:invokevirtual   #29  <Method View View.findViewById(int)>
	//   28   56:checkcast       #36  <Class TextView>
	//   29   59:putfield        #44  <Field TextView q>
		view.setOnClickListener(com.irobot.home.b.r.c(r1));
	//   30   62:aload_2         
	//   31   63:aload_1         
	//   32   64:invokestatic    #48  <Method android.view.View$OnClickListener r.c(r)>
	//   33   67:invokevirtual   #52  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
	//   34   70:return          
	}
}
