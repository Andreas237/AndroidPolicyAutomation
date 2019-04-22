// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			ViewHighlightOverlays

static class ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MarginRightHighlightDrawable extends ViewHighlightOverlays.ViewHighlightOverlaysJellybeanMR2.HighlightDrawable
{

	public void draw(Canvas canvas)
	{
		canvas.translate(mMargins.right, -(mMargins.top + mMargins.bottom));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #23  <Field Rect mMargins>
	//    3    5:getfield        #29  <Field int Rect.right>
	//    4    8:i2f             
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field Rect mMargins>
	//    7   13:getfield        #32  <Field int Rect.top>
	//    8   16:aload_0         
	//    9   17:getfield        #23  <Field Rect mMargins>
	//   10   20:getfield        #35  <Field int Rect.bottom>
	//   11   23:iadd            
	//   12   24:ineg            
	//   13   25:i2f             
	//   14   26:invokevirtual   #41  <Method void Canvas.translate(float, float)>
		super.draw(canvas);
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokespecial   #43  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.draw(Canvas)>
	//   18   34:return          
	}

	void highlightView(View view)
	{
		super.highlightView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.highlightView(View)>
		setBounds(view.getWidth() - mMargins.right, 0, view.getWidth(), view.getHeight() + mMargins.top + mMargins.bottom);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #53  <Method int View.getWidth()>
	//    6   10:aload_0         
	//    7   11:getfield        #23  <Field Rect mMargins>
	//    8   14:getfield        #29  <Field int Rect.right>
	//    9   17:isub            
	//   10   18:iconst_0        
	//   11   19:aload_1         
	//   12   20:invokevirtual   #53  <Method int View.getWidth()>
	//   13   23:aload_1         
	//   14   24:invokevirtual   #56  <Method int View.getHeight()>
	//   15   27:aload_0         
	//   16   28:getfield        #23  <Field Rect mMargins>
	//   17   31:getfield        #32  <Field int Rect.top>
	//   18   34:iadd            
	//   19   35:aload_0         
	//   20   36:getfield        #23  <Field Rect mMargins>
	//   21   39:getfield        #35  <Field int Rect.bottom>
	//   22   42:iadd            
	//   23   43:invokevirtual   #60  <Method void setBounds(int, int, int, int)>
	//   24   46:return          
	}

	ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MarginRightHighlightDrawable()
	{
		super(0xaaf4ca9e);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <Int 0xaaf4ca9e>
	//    2    3:invokespecial   #16  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable(int)>
	//    3    6:return          
	}
}
