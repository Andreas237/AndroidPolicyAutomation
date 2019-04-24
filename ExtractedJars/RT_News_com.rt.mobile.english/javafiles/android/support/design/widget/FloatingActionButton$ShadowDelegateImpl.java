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
		return mCompatPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field FloatingActionButton this$0>
	//    2    4:getfield        #31  <Field boolean FloatingActionButton.mCompatPadding>
	//    3    7:ireturn         
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		FloatingActionButton.access$001(FloatingActionButton.this, drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field FloatingActionButton this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #37  <Method void FloatingActionButton.access$001(FloatingActionButton, Drawable)>
	//    4    8:return          
	}

	public void setShadowPadding(int i, int j, int k, int l)
	{
		mShadowPadding.set(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field FloatingActionButton this$0>
	//    2    4:getfield        #43  <Field Rect FloatingActionButton.mShadowPadding>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:iload_3         
	//    6   10:iload           4
	//    7   12:invokevirtual   #48  <Method void Rect.set(int, int, int, int)>
		setPadding(i + mImagePadding, j + mImagePadding, k + mImagePadding, l + mImagePadding);
	//    8   15:aload_0         
	//    9   16:getfield        #15  <Field FloatingActionButton this$0>
	//   10   19:iload_1         
	//   11   20:aload_0         
	//   12   21:getfield        #15  <Field FloatingActionButton this$0>
	//   13   24:getfield        #52  <Field int FloatingActionButton.mImagePadding>
	//   14   27:iadd            
	//   15   28:iload_2         
	//   16   29:aload_0         
	//   17   30:getfield        #15  <Field FloatingActionButton this$0>
	//   18   33:getfield        #52  <Field int FloatingActionButton.mImagePadding>
	//   19   36:iadd            
	//   20   37:iload_3         
	//   21   38:aload_0         
	//   22   39:getfield        #15  <Field FloatingActionButton this$0>
	//   23   42:getfield        #52  <Field int FloatingActionButton.mImagePadding>
	//   24   45:iadd            
	//   25   46:iload           4
	//   26   48:aload_0         
	//   27   49:getfield        #15  <Field FloatingActionButton this$0>
	//   28   52:getfield        #52  <Field int FloatingActionButton.mImagePadding>
	//   29   55:iadd            
	//   30   56:invokevirtual   #55  <Method void FloatingActionButton.setPadding(int, int, int, int)>
	//   31   59:return          
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
