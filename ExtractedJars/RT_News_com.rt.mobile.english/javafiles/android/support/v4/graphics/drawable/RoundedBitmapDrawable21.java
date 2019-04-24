// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.*;
import android.view.Gravity;

// Referenced classes of package android.support.v4.graphics.drawable:
//			RoundedBitmapDrawable

class RoundedBitmapDrawable21 extends RoundedBitmapDrawable
{

	protected RoundedBitmapDrawable21(Resources resources, Bitmap bitmap)
	{
		super(resources, bitmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void RoundedBitmapDrawable(Resources, Bitmap)>
	//    4    6:return          
	}

	public void getOutline(Outline outline)
	{
		updateDstRect();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #18  <Method void updateDstRect()>
		outline.setRoundRect(mDstRect, getCornerRadius());
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field Rect mDstRect>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #26  <Method float getCornerRadius()>
	//    7   13:invokevirtual   #32  <Method void Outline.setRoundRect(Rect, float)>
	//    8   16:return          
	}

	void gravityCompatApply(int i, int j, int k, Rect rect, Rect rect1)
	{
		Gravity.apply(i, j, k, rect, rect1, 0);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:iconst_0        
	//    6    8:invokestatic    #40  <Method void Gravity.apply(int, int, int, Rect, Rect, int)>
	//    7   11:return          
	}

	public boolean hasMipMap()
	{
		return mBitmap != null && mBitmap.hasMipMap();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Bitmap mBitmap>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #46  <Field Bitmap mBitmap>
	//    5   11:invokevirtual   #50  <Method boolean Bitmap.hasMipMap()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public void setMipMap(boolean flag)
	{
		if(mBitmap != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field Bitmap mBitmap>
	//*   2    4:ifnull          19
		{
			mBitmap.setHasMipMap(flag);
	//    3    7:aload_0         
	//    4    8:getfield        #46  <Field Bitmap mBitmap>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #55  <Method void Bitmap.setHasMipMap(boolean)>
			invalidateSelf();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #58  <Method void invalidateSelf()>
		}
	//    9   19:return          
	}
}
