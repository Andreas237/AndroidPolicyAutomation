// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.support.v4.graphics.BitmapCompat;
import android.support.v4.view.GravityCompat;

// Referenced classes of package android.support.v4.graphics.drawable:
//			RoundedBitmapDrawable, RoundedBitmapDrawableFactory

private static class RoundedBitmapDrawableFactory$DefaultRoundedBitmapDrawable extends RoundedBitmapDrawable
{

	void gravityCompatApply(int i, int j, int k, Rect rect, Rect rect1)
	{
		GravityCompat.apply(i, j, k, rect, rect1, 0);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:iconst_0        
	//    6    8:invokestatic    #20  <Method void GravityCompat.apply(int, int, int, Rect, Rect, int)>
	//    7   11:return          
	}

	public boolean hasMipMap()
	{
		return mBitmap != null && BitmapCompat.hasMipMap(mBitmap);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Bitmap mBitmap>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field Bitmap mBitmap>
	//    5   11:invokestatic    #31  <Method boolean BitmapCompat.hasMipMap(Bitmap)>
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
	//*   1    1:getfield        #26  <Field Bitmap mBitmap>
	//*   2    4:ifnull          19
		{
			BitmapCompat.setHasMipMap(mBitmap, flag);
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field Bitmap mBitmap>
	//    5   11:iload_1         
	//    6   12:invokestatic    #37  <Method void BitmapCompat.setHasMipMap(Bitmap, boolean)>
			invalidateSelf();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #41  <Method void invalidateSelf()>
		}
	//    9   19:return          
	}

	RoundedBitmapDrawableFactory$DefaultRoundedBitmapDrawable(Resources resources, Bitmap bitmap)
	{
		super(resources, bitmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void RoundedBitmapDrawable(Resources, Bitmap)>
	//    4    6:return          
	}
}
