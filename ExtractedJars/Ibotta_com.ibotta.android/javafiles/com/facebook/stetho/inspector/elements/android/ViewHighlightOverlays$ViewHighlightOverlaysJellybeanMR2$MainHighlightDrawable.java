// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			ViewHighlightOverlays

static class ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MainHighlightDrawable extends ViewHighlightOverlays.ViewHighlightOverlaysJellybeanMR2.HighlightDrawable
{

	public void draw(Canvas canvas)
	{
		Rect rect = canvas.getClipBounds();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #23  <Method Rect Canvas.getClipBounds()>
	//    2    4:astore_2        
		rect.inset(-(mMargins.right + mMargins.left), -(mMargins.top + mMargins.bottom));
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:getfield        #27  <Field Rect mMargins>
	//    6   10:getfield        #33  <Field int Rect.right>
	//    7   13:aload_0         
	//    8   14:getfield        #27  <Field Rect mMargins>
	//    9   17:getfield        #36  <Field int Rect.left>
	//   10   20:iadd            
	//   11   21:ineg            
	//   12   22:aload_0         
	//   13   23:getfield        #27  <Field Rect mMargins>
	//   14   26:getfield        #39  <Field int Rect.top>
	//   15   29:aload_0         
	//   16   30:getfield        #27  <Field Rect mMargins>
	//   17   33:getfield        #42  <Field int Rect.bottom>
	//   18   36:iadd            
	//   19   37:ineg            
	//   20   38:invokevirtual   #46  <Method void Rect.inset(int, int)>
		canvas.clipRect(rect, android.graphics.Region.Op.REPLACE);
	//   21   41:aload_1         
	//   22   42:aload_2         
	//   23   43:getstatic       #52  <Field android.graphics.Region$Op android.graphics.Region$Op.REPLACE>
	//   24   46:invokevirtual   #56  <Method boolean Canvas.clipRect(Rect, android.graphics.Region$Op)>
	//   25   49:pop             
		super.draw(canvas);
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:invokespecial   #58  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.draw(Canvas)>
	//   29   55:return          
	}

	void highlightView(View view)
	{
		super.highlightView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #62  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.highlightView(View)>
		setBounds(0, 0, view.getWidth(), view.getHeight());
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:aload_1         
	//    7    9:invokevirtual   #68  <Method int View.getWidth()>
	//    8   12:aload_1         
	//    9   13:invokevirtual   #71  <Method int View.getHeight()>
	//   10   16:invokevirtual   #75  <Method void setBounds(int, int, int, int)>
	//   11   19:return          
	}

	ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MainHighlightDrawable()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable()>
	//    2    4:return          
	}
}
