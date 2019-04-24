// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.b;

import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

// Referenced classes of package com.irobot.home.b:
//			z

public class z$b extends android.support.v7.widget.clerView.u
{

	public TextView n;
	public TextView o;
	public TextView p;
	public TextView q;
	public Switch r;
	final z s;

	public z$b(z z1, View view)
	{
		s = z1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field z s>
		super(view);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #23  <Method void android.support.v7.widget.RecyclerView$u(View)>
		n = (TextView)view.findViewById(0x7f0903a7);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:ldc1            #24  <Int 0x7f0903a7>
	//    9   14:invokevirtual   #30  <Method View View.findViewById(int)>
	//   10   17:checkcast       #32  <Class TextView>
	//   11   20:putfield        #34  <Field TextView n>
		o = (TextView)view.findViewById(0x7f0903a8);
	//   12   23:aload_0         
	//   13   24:aload_2         
	//   14   25:ldc1            #35  <Int 0x7f0903a8>
	//   15   27:invokevirtual   #30  <Method View View.findViewById(int)>
	//   16   30:checkcast       #32  <Class TextView>
	//   17   33:putfield        #37  <Field TextView o>
		p = (TextView)view.findViewById(0x7f0903a6);
	//   18   36:aload_0         
	//   19   37:aload_2         
	//   20   38:ldc1            #38  <Int 0x7f0903a6>
	//   21   40:invokevirtual   #30  <Method View View.findViewById(int)>
	//   22   43:checkcast       #32  <Class TextView>
	//   23   46:putfield        #40  <Field TextView p>
		q = (TextView)view.findViewById(0x7f090328);
	//   24   49:aload_0         
	//   25   50:aload_2         
	//   26   51:ldc1            #41  <Int 0x7f090328>
	//   27   53:invokevirtual   #30  <Method View View.findViewById(int)>
	//   28   56:checkcast       #32  <Class TextView>
	//   29   59:putfield        #43  <Field TextView q>
		r = (Switch)view.findViewById(0x7f090387);
	//   30   62:aload_0         
	//   31   63:aload_2         
	//   32   64:ldc1            #44  <Int 0x7f090387>
	//   33   66:invokevirtual   #30  <Method View View.findViewById(int)>
	//   34   69:checkcast       #46  <Class Switch>
	//   35   72:putfield        #48  <Field Switch r>
	//   36   75:return          
	}
}
