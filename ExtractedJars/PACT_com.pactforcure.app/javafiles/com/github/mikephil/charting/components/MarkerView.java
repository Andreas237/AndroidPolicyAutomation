// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;

public abstract class MarkerView extends RelativeLayout
{

	public MarkerView(Context context, int i)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void RelativeLayout(Context)>
		setupLayoutResource(i);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokespecial   #13  <Method void setupLayoutResource(int)>
	//    6   10:return          
	}

	private void setupLayoutResource(int i)
	{
		View view = LayoutInflater.from(getContext()).inflate(i, ((android.view.ViewGroup) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #18  <Method Context getContext()>
	//    2    4:invokestatic    #24  <Method LayoutInflater LayoutInflater.from(Context)>
	//    3    7:iload_1         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #28  <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    6   12:astore_2        
		view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.RelativeLayout.LayoutParams(-2, -2))));
	//    7   13:aload_2         
	//    8   14:new             #30  <Class android.widget.RelativeLayout$LayoutParams>
	//    9   17:dup             
	//   10   18:bipush          -2
	//   11   20:bipush          -2
	//   12   22:invokespecial   #33  <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   13   25:invokevirtual   #39  <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		view.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
	//   14   28:aload_2         
	//   15   29:iconst_0        
	//   16   30:iconst_0        
	//   17   31:invokestatic    #45  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   18   34:iconst_0        
	//   19   35:iconst_0        
	//   20   36:invokestatic    #45  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   21   39:invokevirtual   #48  <Method void View.measure(int, int)>
		view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
	//   22   42:aload_2         
	//   23   43:iconst_0        
	//   24   44:iconst_0        
	//   25   45:aload_2         
	//   26   46:invokevirtual   #52  <Method int View.getMeasuredWidth()>
	//   27   49:aload_2         
	//   28   50:invokevirtual   #55  <Method int View.getMeasuredHeight()>
	//   29   53:invokevirtual   #59  <Method void View.layout(int, int, int, int)>
	//   30   56:return          
	}

	public void draw(Canvas canvas, float f, float f1)
	{
		f += getXOffset(f);
	//    0    0:fload_2         
	//    1    1:aload_0         
	//    2    2:fload_2         
	//    3    3:invokevirtual   #65  <Method int getXOffset(float)>
	//    4    6:i2f             
	//    5    7:fadd            
	//    6    8:fstore_2        
		f1 += getYOffset(f1);
	//    7    9:fload_3         
	//    8   10:aload_0         
	//    9   11:fload_3         
	//   10   12:invokevirtual   #68  <Method int getYOffset(float)>
	//   11   15:i2f             
	//   12   16:fadd            
	//   13   17:fstore_3        
		canvas.translate(f, f1);
	//   14   18:aload_1         
	//   15   19:fload_2         
	//   16   20:fload_3         
	//   17   21:invokevirtual   #74  <Method void Canvas.translate(float, float)>
		draw(canvas);
	//   18   24:aload_0         
	//   19   25:aload_1         
	//   20   26:invokevirtual   #77  <Method void draw(Canvas)>
		canvas.translate(-f, -f1);
	//   21   29:aload_1         
	//   22   30:fload_2         
	//   23   31:fneg            
	//   24   32:fload_3         
	//   25   33:fneg            
	//   26   34:invokevirtual   #74  <Method void Canvas.translate(float, float)>
	//   27   37:return          
	}

	public abstract int getXOffset(float f);

	public abstract int getYOffset(float f);

	public abstract void refreshContent(Entry entry, Highlight highlight);
}
