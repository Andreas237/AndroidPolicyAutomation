// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			ViewHighlightOverlays

static class ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MarginLeftHighlightDrawable extends ViewHighlightOverlays.ViewHighlightOverlaysJellybeanMR2.HighlightDrawable
{

	public void draw(Canvas canvas)
	{
		canvas.translate(-(mMargins.left + mMargins.right), 0.0F);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #23  <Field Rect mMargins>
	//    3    5:getfield        #29  <Field int Rect.left>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field Rect mMargins>
	//    6   12:getfield        #32  <Field int Rect.right>
	//    7   15:iadd            
	//    8   16:ineg            
	//    9   17:i2f             
	//   10   18:fconst_0        
	//   11   19:invokevirtual   #38  <Method void Canvas.translate(float, float)>
		super.draw(canvas);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokespecial   #40  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.draw(Canvas)>
	//   15   27:return          
	}

	void highlightView(View view)
	{
		super.highlightView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #44  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.highlightView(View)>
		setBounds(0, 0, mMargins.left, view.getHeight() + mMargins.top + mMargins.bottom);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:aload_0         
	//    7    9:getfield        #23  <Field Rect mMargins>
	//    8   12:getfield        #29  <Field int Rect.left>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #50  <Method int View.getHeight()>
	//   11   19:aload_0         
	//   12   20:getfield        #23  <Field Rect mMargins>
	//   13   23:getfield        #53  <Field int Rect.top>
	//   14   26:iadd            
	//   15   27:aload_0         
	//   16   28:getfield        #23  <Field Rect mMargins>
	//   17   31:getfield        #56  <Field int Rect.bottom>
	//   18   34:iadd            
	//   19   35:invokevirtual   #60  <Method void setBounds(int, int, int, int)>
	//   20   38:return          
	}

	ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MarginLeftHighlightDrawable()
	{
		super(0xaaf4ca9e);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <Int 0xaaf4ca9e>
	//    2    3:invokespecial   #16  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable(int)>
	//    3    6:return          
	}
}
