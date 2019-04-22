// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.graphics.Rect;
import android.view.View;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			ViewHighlightOverlays

static class ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$PaddingRightHighlightDrawable extends ViewHighlightOverlays.ViewHighlightOverlaysJellybeanMR2.HighlightDrawable
{

	void highlightView(View view)
	{
		super.highlightView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.highlightView(View)>
		setBounds(view.getWidth() - mPaddings.right, 0, view.getWidth(), view.getHeight());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #27  <Method int View.getWidth()>
	//    6   10:aload_0         
	//    7   11:getfield        #31  <Field Rect mPaddings>
	//    8   14:getfield        #37  <Field int Rect.right>
	//    9   17:isub            
	//   10   18:iconst_0        
	//   11   19:aload_1         
	//   12   20:invokevirtual   #27  <Method int View.getWidth()>
	//   13   23:aload_1         
	//   14   24:invokevirtual   #40  <Method int View.getHeight()>
	//   15   27:invokevirtual   #44  <Method void setBounds(int, int, int, int)>
	//   16   30:return          
	}

	ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$PaddingRightHighlightDrawable()
	{
		super(0xaabedab6);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <Int 0xaabedab6>
	//    2    3:invokespecial   #16  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable(int)>
	//    3    6:return          
	}
}
