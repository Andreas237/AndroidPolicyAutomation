// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			ViewHighlightOverlays

static class ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MarginBottomHighlightDrawable extends ViewHighlightOverlays.ViewHighlightOverlaysJellybeanMR2.HighlightDrawable
{

	public void draw(Canvas canvas)
	{
		canvas.translate(0.0F, mMargins.bottom + mMargins.top);
	//    0    0:aload_1         
	//    1    1:fconst_0        
	//    2    2:aload_0         
	//    3    3:getfield        #23  <Field Rect mMargins>
	//    4    6:getfield        #29  <Field int Rect.bottom>
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field Rect mMargins>
	//    7   13:getfield        #32  <Field int Rect.top>
	//    8   16:iadd            
	//    9   17:i2f             
	//   10   18:invokevirtual   #38  <Method void Canvas.translate(float, float)>
		super.draw(canvas);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #40  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.draw(Canvas)>
	//   14   26:return          
	}

	void highlightView(View view)
	{
		super.highlightView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #44  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.highlightView(View)>
		setBounds(0, view.getHeight() - mMargins.bottom, view.getWidth(), view.getHeight());
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:invokevirtual   #50  <Method int View.getHeight()>
	//    7   11:aload_0         
	//    8   12:getfield        #23  <Field Rect mMargins>
	//    9   15:getfield        #29  <Field int Rect.bottom>
	//   10   18:isub            
	//   11   19:aload_1         
	//   12   20:invokevirtual   #53  <Method int View.getWidth()>
	//   13   23:aload_1         
	//   14   24:invokevirtual   #50  <Method int View.getHeight()>
	//   15   27:invokevirtual   #57  <Method void setBounds(int, int, int, int)>
	//   16   30:return          
	}

	ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MarginBottomHighlightDrawable()
	{
		super(0xaaf4ca9e);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <Int 0xaaf4ca9e>
	//    2    3:invokespecial   #16  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable(int)>
	//    3    6:return          
	}
}
