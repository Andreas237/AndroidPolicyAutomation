// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.drawable.Drawable;

public abstract class ls
{

	public ls()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		y = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #16  <Field float y>
		mData = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #18  <Field Object mData>
		mIcon = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #20  <Field Drawable mIcon>
	//   11   19:return          
	}

	public ls(float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		y = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #16  <Field float y>
		mData = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #18  <Field Object mData>
		mIcon = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #20  <Field Drawable mIcon>
		y = f;
	//   11   19:aload_0         
	//   12   20:fload_1         
	//   13   21:putfield        #16  <Field float y>
	//   14   24:return          
	}

	public ls(float f, Drawable drawable)
	{
		this(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokespecial   #25  <Method void ls(float)>
		mIcon = drawable;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field Drawable mIcon>
	//    6   10:return          
	}

	public ls(float f, Drawable drawable, Object obj)
	{
		this(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokespecial   #25  <Method void ls(float)>
		mIcon = drawable;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field Drawable mIcon>
		mData = obj;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #18  <Field Object mData>
	//    9   15:return          
	}

	public ls(float f, Object obj)
	{
		this(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokespecial   #25  <Method void ls(float)>
		mData = obj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field Object mData>
	//    6   10:return          
	}

	public Object getData()
	{
		return mData;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Object mData>
	//    2    4:areturn         
	}

	public Drawable getIcon()
	{
		return mIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Drawable mIcon>
	//    2    4:areturn         
	}

	public float getY()
	{
		return y;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field float y>
	//    2    4:freturn         
	}

	public void setData(Object obj)
	{
		mData = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Object mData>
	//    3    5:return          
	}

	public void setIcon(Drawable drawable)
	{
		mIcon = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Drawable mIcon>
	//    3    5:return          
	}

	public void setY(float f)
	{
		y = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #16  <Field float y>
	//    3    5:return          
	}

	private Object mData;
	private Drawable mIcon;
	private float y;
}
