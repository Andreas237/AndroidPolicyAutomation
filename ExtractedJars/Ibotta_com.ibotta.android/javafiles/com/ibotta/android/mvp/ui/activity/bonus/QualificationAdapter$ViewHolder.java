// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.bonus:
//			QualificationAdapter

class QualificationAdapter$ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
{

	protected ImageView ivCompleted;
	final QualificationAdapter this$0;
	protected TextView tvQualification;

	public QualificationAdapter$ViewHolder(View view)
	{
		this$0 = QualificationAdapter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field QualificationAdapter this$0>
		super(view);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #20  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
		ivCompleted = (ImageView)view.findViewById(0x7f09029f);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:ldc1            #21  <Int 0x7f09029f>
	//    9   14:invokevirtual   #27  <Method View View.findViewById(int)>
	//   10   17:checkcast       #29  <Class ImageView>
	//   11   20:putfield        #31  <Field ImageView ivCompleted>
		tvQualification = (TextView)view.findViewById(0x7f090560);
	//   12   23:aload_0         
	//   13   24:aload_2         
	//   14   25:ldc1            #32  <Int 0x7f090560>
	//   15   27:invokevirtual   #27  <Method View View.findViewById(int)>
	//   16   30:checkcast       #34  <Class TextView>
	//   17   33:putfield        #36  <Field TextView tvQualification>
	//   18   36:return          
	}
}
