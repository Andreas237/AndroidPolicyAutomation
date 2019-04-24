// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.*;
import android.support.v4.graphics.BitmapCompat;
import android.support.v4.view.GravityCompat;
import android.util.Log;
import java.io.InputStream;

// Referenced classes of package android.support.v4.graphics.drawable:
//			RoundedBitmapDrawable21, RoundedBitmapDrawable

public final class RoundedBitmapDrawableFactory
{
	private static class DefaultRoundedBitmapDrawable extends RoundedBitmapDrawable
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

		DefaultRoundedBitmapDrawable(Resources resources, Bitmap bitmap)
		{
			super(resources, bitmap);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #11  <Method void RoundedBitmapDrawable(Resources, Bitmap)>
		//    4    6:return          
		}
	}


	private RoundedBitmapDrawableFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static RoundedBitmapDrawable create(Resources resources, Bitmap bitmap)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          18
			return ((RoundedBitmapDrawable) (new RoundedBitmapDrawable21(resources, bitmap)));
	//    3    8:new             #28  <Class RoundedBitmapDrawable21>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:invokespecial   #31  <Method void RoundedBitmapDrawable21(Resources, Bitmap)>
	//    8   17:areturn         
		else
			return ((RoundedBitmapDrawable) (new DefaultRoundedBitmapDrawable(resources, bitmap)));
	//    9   18:new             #6   <Class RoundedBitmapDrawableFactory$DefaultRoundedBitmapDrawable>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokespecial   #32  <Method void RoundedBitmapDrawableFactory$DefaultRoundedBitmapDrawable(Resources, Bitmap)>
	//   14   27:areturn         
	}

	public static RoundedBitmapDrawable create(Resources resources, InputStream inputstream)
	{
		resources = ((Resources) (create(resources, BitmapFactory.decodeStream(inputstream))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #41  <Method Bitmap BitmapFactory.decodeStream(InputStream)>
	//    3    5:invokestatic    #43  <Method RoundedBitmapDrawable create(Resources, Bitmap)>
	//    4    8:astore_0        
		if(((RoundedBitmapDrawable) (resources)).getBitmap() == null)
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #49  <Method Bitmap RoundedBitmapDrawable.getBitmap()>
	//*   7   13:ifnonnull       47
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   16:new             #51  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #52  <Method void StringBuilder()>
	//   11   23:astore_2        
			stringbuilder.append("RoundedBitmapDrawable cannot decode ");
	//   12   24:aload_2         
	//   13   25:ldc1            #54  <String "RoundedBitmapDrawable cannot decode ">
	//   14   27:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			stringbuilder.append(((Object) (inputstream)));
	//   16   31:aload_2         
	//   17   32:aload_1         
	//   18   33:invokevirtual   #61  <Method StringBuilder StringBuilder.append(Object)>
	//   19   36:pop             
			Log.w("RoundedBitmapDrawableFa", stringbuilder.toString());
	//   20   37:ldc1            #11  <String "RoundedBitmapDrawableFa">
	//   21   39:aload_2         
	//   22   40:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   23   43:invokestatic    #71  <Method int Log.w(String, String)>
	//   24   46:pop             
		}
		return ((RoundedBitmapDrawable) (resources));
	//   25   47:aload_0         
	//   26   48:areturn         
	}

	public static RoundedBitmapDrawable create(Resources resources, String s)
	{
		resources = ((Resources) (create(resources, BitmapFactory.decodeFile(s))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #76  <Method Bitmap BitmapFactory.decodeFile(String)>
	//    3    5:invokestatic    #43  <Method RoundedBitmapDrawable create(Resources, Bitmap)>
	//    4    8:astore_0        
		if(((RoundedBitmapDrawable) (resources)).getBitmap() == null)
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #49  <Method Bitmap RoundedBitmapDrawable.getBitmap()>
	//*   7   13:ifnonnull       47
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   16:new             #51  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #52  <Method void StringBuilder()>
	//   11   23:astore_2        
			stringbuilder.append("RoundedBitmapDrawable cannot decode ");
	//   12   24:aload_2         
	//   13   25:ldc1            #54  <String "RoundedBitmapDrawable cannot decode ">
	//   14   27:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			stringbuilder.append(s);
	//   16   31:aload_2         
	//   17   32:aload_1         
	//   18   33:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
			Log.w("RoundedBitmapDrawableFa", stringbuilder.toString());
	//   20   37:ldc1            #11  <String "RoundedBitmapDrawableFa">
	//   21   39:aload_2         
	//   22   40:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   23   43:invokestatic    #71  <Method int Log.w(String, String)>
	//   24   46:pop             
		}
		return ((RoundedBitmapDrawable) (resources));
	//   25   47:aload_0         
	//   26   48:areturn         
	}

	private static final String TAG = "RoundedBitmapDrawableFa";
}
