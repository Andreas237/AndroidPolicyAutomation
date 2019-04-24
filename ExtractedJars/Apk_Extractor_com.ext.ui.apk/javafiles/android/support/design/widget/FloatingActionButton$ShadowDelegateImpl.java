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
		setPadding(mImagePadding + i, mImagePadding + j, mImagePadding + k, mImagePadding + l);
	//    8   15:aload_0         
	//    9   16:getfield        #15  <Field FloatingActionButton this$0>
	//   10   19:aload_0         
	//   11   20:getfield        #15  <Field FloatingActionButton this$0>
	//   12   23:getfield        #52  <Field int FloatingActionButton.mImagePadding>
	//   13   26:iload_1         
	//   14   27:iadd            
	//   15   28:aload_0         
	//   16   29:getfield        #15  <Field FloatingActionButton this$0>
	//   17   32:getfield        #52  <Field int FloatingActionButton.mImagePadding>
	//   18   35:iload_2         
	//   19   36:iadd            
	//   20   37:aload_0         
	//   21   38:getfield        #15  <Field FloatingActionButton this$0>
	//   22   41:getfield        #52  <Field int FloatingActionButton.mImagePadding>
	//   23   44:iload_3         
	//   24   45:iadd            
	//   25   46:aload_0         
	//   26   47:getfield        #15  <Field FloatingActionButton this$0>
	//   27   50:getfield        #52  <Field int FloatingActionButton.mImagePadding>
	//   28   53:iload           4
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
