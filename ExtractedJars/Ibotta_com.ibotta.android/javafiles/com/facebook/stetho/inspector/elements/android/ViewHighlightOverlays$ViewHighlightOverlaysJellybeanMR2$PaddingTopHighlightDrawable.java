// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.graphics.Rect;
import android.view.View;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			ViewHighlightOverlays

static class ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$PaddingTopHighlightDrawable extends ViewHighlightOverlays.ViewHighlightOverlaysJellybeanMR2.HighlightDrawable
{

	void highlightView(View view)
	{
		super.highlightView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.highlightView(View)>
		setBounds(mPaddings.left, 0, view.getWidth() - mPaddings.right, mPaddings.top);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #25  <Field Rect mPaddings>
	//    6   10:getfield        #31  <Field int Rect.left>
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:invokevirtual   #37  <Method int View.getWidth()>
	//   10   18:aload_0         
	//   11   19:getfield        #25  <Field Rect mPaddings>
	//   12   22:getfield        #40  <Field int Rect.right>
	//   13   25:isub            
	//   14   26:aload_0         
	//   15   27:getfield        #25  <Field Rect mPaddings>
	//   16   30:getfield        #43  <Field int Rect.top>
	//   17   33:invokevirtual   #47  <Method void setBounds(int, int, int, int)>
	//   18   36:return          
	}

	ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$PaddingTopHighlightDrawable()
	{
		super(0xaabedab6);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <Int 0xaabedab6>
	//    2    3:invokespecial   #16  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable(int)>
	//    3    6:return          
	}
}
