// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			ViewHighlightOverlays

static class ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MarginTopHighlightDrawable extends ViewHighlightOverlays.ViewHighlightOverlaysJellybeanMR2.HighlightDrawable
{

	public void draw(Canvas canvas)
	{
		canvas.translate(0.0F, -mMargins.top);
	//    0    0:aload_1         
	//    1    1:fconst_0        
	//    2    2:aload_0         
	//    3    3:getfield        #23  <Field Rect mMargins>
	//    4    6:getfield        #29  <Field int Rect.top>
	//    5    9:ineg            
	//    6   10:i2f             
	//    7   11:invokevirtual   #35  <Method void Canvas.translate(float, float)>
		super.draw(canvas);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #37  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.draw(Canvas)>
	//   11   19:return          
	}

	void highlightView(View view)
	{
		super.highlightView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.highlightView(View)>
		setBounds(0, 0, view.getWidth(), mMargins.top);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:aload_1         
	//    7    9:invokevirtual   #47  <Method int View.getWidth()>
	//    8   12:aload_0         
	//    9   13:getfield        #23  <Field Rect mMargins>
	//   10   16:getfield        #29  <Field int Rect.top>
	//   11   19:invokevirtual   #51  <Method void setBounds(int, int, int, int)>
	//   12   22:return          
	}

	ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MarginTopHighlightDrawable()
	{
		super(0xaaf4ca9e);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <Int 0xaaf4ca9e>
	//    2    3:invokespecial   #16  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable(int)>
	//    3    6:return          
	}
}
