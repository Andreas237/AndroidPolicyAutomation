// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.tip;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.pactforcure.app.tip:
//			TipOfTheWeekAdapter

static class TipOfTheWeekAdapter$TipViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
{

	TextView tipContentView;
	TextView tipIndexView;

	TipOfTheWeekAdapter$TipViewHolder(View view)
	{
		super(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
		tipIndexView = (TextView)view.findViewById(0x7f0e012c);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #15  <Int 0x7f0e012c>
	//    6    9:invokevirtual   #21  <Method View View.findViewById(int)>
	//    7   12:checkcast       #23  <Class TextView>
	//    8   15:putfield        #25  <Field TextView tipIndexView>
		tipContentView = (TextView)view.findViewById(0x7f0e012d);
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #26  <Int 0x7f0e012d>
	//   12   22:invokevirtual   #21  <Method View View.findViewById(int)>
	//   13   25:checkcast       #23  <Class TextView>
	//   14   28:putfield        #28  <Field TextView tipContentView>
	//   15   31:return          
	}
}
