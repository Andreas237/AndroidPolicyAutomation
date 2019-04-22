// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.graphics.Rect;
import android.view.View;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			ViewHighlightOverlays

static class ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$PaddingBottomHighlightDrawable extends ViewHighlightOverlays.ViewHighlightOverlaysJellybeanMR2.HighlightDrawable
{

	void highlightView(View view)
	{
		super.highlightView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.highlightView(View)>
		setBounds(mPaddings.left, view.getHeight() - mPaddings.bottom, view.getWidth() - mPaddings.right, view.getHeight());
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #25  <Field Rect mPaddings>
	//    6   10:getfield        #31  <Field int Rect.left>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #37  <Method int View.getHeight()>
	//    9   17:aload_0         
	//   10   18:getfield        #25  <Field Rect mPaddings>
	//   11   21:getfield        #40  <Field int Rect.bottom>
	//   12   24:isub            
	//   13   25:aload_1         
	//   14   26:invokevirtual   #43  <Method int View.getWidth()>
	//   15   29:aload_0         
	//   16   30:getfield        #25  <Field Rect mPaddings>
	//   17   33:getfield        #46  <Field int Rect.right>
	//   18   36:isub            
	//   19   37:aload_1         
	//   20   38:invokevirtual   #37  <Method int View.getHeight()>
	//   21   41:invokevirtual   #50  <Method void setBounds(int, int, int, int)>
	//   22   44:return          
	}

	ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$PaddingBottomHighlightDrawable()
	{
		super(0xaabedab6);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <Int 0xaabedab6>
	//    2    3:invokespecial   #16  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable(int)>
	//    3    6:return          
	}
}
