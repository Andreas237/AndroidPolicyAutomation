// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.exoplayer2.ui:
//			TrackSelectionView

static final class TrackSelectionView$1
	implements android.content.ckListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		TrackSelectionView.access$000(val$selectionView);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TrackSelectionView val$selectionView>
	//    2    4:invokestatic    #26  <Method void TrackSelectionView.access$000(TrackSelectionView)>
	//    3    7:return          
	}

	final TrackSelectionView val$selectionView;

	TrackSelectionView$1(TrackSelectionView trackselectionview)
	{
		val$selectionView = trackselectionview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TrackSelectionView val$selectionView>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
