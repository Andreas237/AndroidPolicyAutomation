// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.design.widget:
//			ShadowViewDelegate, FloatingActionButton

private class FloatingActionButton$ShadowDelegateImpl
	implements ShadowViewDelegate
{

	public float getRadius()
	{
		return (float)getSizeDimension() / 2.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field FloatingActionButton this$0>
	//    2    4:invokevirtual   #25  <Method int FloatingActionButton.getSizeDimension()>
	//    3    7:i2f             
	//    4    8:fconst_2        
	//    5    9:fdiv            
	//    6   10:freturn         
	}

	public boolean isCompatPaddingEnabled()
	{
		return compatPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field FloatingActionButton this$0>
	//    2    4:getfield        #31  <Field boolean FloatingActionButton.compatPadding>
	//    3    7:ireturn         
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		FloatingActionButton.access$101(FloatingActionButton.this, drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field FloatingActionButton this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #37  <Method void FloatingActionButton.access$101(FloatingActionButton, Drawable)>
	//    4    8:return          
	}

	public void setShadowPadding(int i, int j, int k, int l)
	{
		shadowPadding.set(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field FloatingActionButton this$0>
	//    2    4:getfield        #43  <Field Rect FloatingActionButton.shadowPadding>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:iload_3         
	//    6   10:iload           4
	//    7   12:invokevirtual   #48  <Method void Rect.set(int, int, int, int)>
		FloatingActionButton floatingactionbutton = FloatingActionButton.this;
	//    8   15:aload_0         
	//    9   16:getfield        #15  <Field FloatingActionButton this$0>
	//   10   19:astore          5
		floatingactionbutton.setPadding(i + FloatingActionButton.access$000(floatingactionbutton), j + FloatingActionButton.access$000(FloatingActionButton.this), k + FloatingActionButton.access$000(FloatingActionButton.this), l + FloatingActionButton.access$000(FloatingActionButton.this));
	//   11   21:aload           5
	//   12   23:iload_1         
	//   13   24:aload           5
	//   14   26:invokestatic    #52  <Method int FloatingActionButton.access$000(FloatingActionButton)>
	//   15   29:iadd            
	//   16   30:iload_2         
	//   17   31:aload_0         
	//   18   32:getfield        #15  <Field FloatingActionButton this$0>
	//   19   35:invokestatic    #52  <Method int FloatingActionButton.access$000(FloatingActionButton)>
	//   20   38:iadd            
	//   21   39:iload_3         
	//   22   40:aload_0         
	//   23   41:getfield        #15  <Field FloatingActionButton this$0>
	//   24   44:invokestatic    #52  <Method int FloatingActionButton.access$000(FloatingActionButton)>
	//   25   47:iadd            
	//   26   48:iload           4
	//   27   50:aload_0         
	//   28   51:getfield        #15  <Field FloatingActionButton this$0>
	//   29   54:invokestatic    #52  <Method int FloatingActionButton.access$000(FloatingActionButton)>
	//   30   57:iadd            
	//   31   58:invokevirtual   #55  <Method void FloatingActionButton.setPadding(int, int, int, int)>
	//   32   61:return          
	}

	final FloatingActionButton this$0;

	FloatingActionButton$ShadowDelegateImpl()
	{
		this$0 = FloatingActionButton.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field FloatingActionButton this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
