// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;

import android.view.View;

// Referenced classes of package com.google.android.exoplayer2.ui:
//			TrackSelectionView

private class TrackSelectionView$ComponentListener
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		TrackSelectionView.access$200(TrackSelectionView.this, view);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field TrackSelectionView this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #28  <Method void TrackSelectionView.access$200(TrackSelectionView, View)>
	//    4    8:return          
	}

	final TrackSelectionView this$0;

	private TrackSelectionView$ComponentListener()
	{
		this$0 = TrackSelectionView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field TrackSelectionView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	TrackSelectionView$ComponentListener(TrackSelectionView._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void TrackSelectionView$ComponentListener(TrackSelectionView)>
	//    3    5:return          
	}
}
