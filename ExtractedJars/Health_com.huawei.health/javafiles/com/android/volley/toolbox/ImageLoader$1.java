// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import android.widget.ImageView;
import com.android.volley.VolleyError;

// Referenced classes of package com.android.volley.toolbox:
//			ImageLoader

static final class ImageLoader$1
	implements ageListener
{

	public void onErrorResponse(VolleyError volleyerror)
	{
		if(val$errorImageResId != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field int val$errorImageResId>
	//*   2    4:ifeq            18
			val$view.setImageResource(val$errorImageResId);
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field ImageView val$view>
	//    5   11:aload_0         
	//    6   12:getfield        #20  <Field int val$errorImageResId>
	//    7   15:invokevirtual   #36  <Method void ImageView.setImageResource(int)>
	//    8   18:return          
	}

	public void onResponse(ageContainer agecontainer, boolean flag)
	{
		if(agecontainer.getBitmap() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #44  <Method android.graphics.Bitmap ImageLoader$ImageContainer.getBitmap()>
	//*   2    4:ifnull          19
		{
			val$view.setImageBitmap(agecontainer.getBitmap());
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field ImageView val$view>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #44  <Method android.graphics.Bitmap ImageLoader$ImageContainer.getBitmap()>
	//    7   15:invokevirtual   #48  <Method void ImageView.setImageBitmap(android.graphics.Bitmap)>
			return;
	//    8   18:return          
		}
		if(val$defaultImageResId != 0)
	//*   9   19:aload_0         
	//*  10   20:getfield        #24  <Field int val$defaultImageResId>
	//*  11   23:ifeq            37
			val$view.setImageResource(val$defaultImageResId);
	//   12   26:aload_0         
	//   13   27:getfield        #22  <Field ImageView val$view>
	//   14   30:aload_0         
	//   15   31:getfield        #24  <Field int val$defaultImageResId>
	//   16   34:invokevirtual   #36  <Method void ImageView.setImageResource(int)>
	//   17   37:return          
	}

	final int val$defaultImageResId;
	final int val$errorImageResId;
	final ImageView val$view;

	ImageLoader$1(int i, ImageView imageview, int j)
	{
		val$errorImageResId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #20  <Field int val$errorImageResId>
		val$view = imageview;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field ImageView val$view>
		val$defaultImageResId = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #24  <Field int val$defaultImageResId>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
