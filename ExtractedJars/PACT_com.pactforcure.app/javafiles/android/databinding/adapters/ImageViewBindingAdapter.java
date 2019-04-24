// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

public class ImageViewBindingAdapter
{

	public ImageViewBindingAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	public static void setImageDrawable(ImageView imageview, Drawable drawable)
	{
		imageview.setImageDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #29  <Method void ImageView.setImageDrawable(Drawable)>
	//    3    5:return          
	}

	public static void setImageUri(ImageView imageview, Uri uri)
	{
		imageview.setImageURI(uri);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #36  <Method void ImageView.setImageURI(Uri)>
	//    3    5:return          
	}

	public static void setImageUri(ImageView imageview, String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
		{
			imageview.setImageURI(((Uri) (null)));
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #36  <Method void ImageView.setImageURI(Uri)>
			return;
	//    5    9:return          
		} else
		{
			imageview.setImageURI(Uri.parse(s));
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokestatic    #43  <Method Uri Uri.parse(String)>
	//    9   15:invokevirtual   #36  <Method void ImageView.setImageURI(Uri)>
			return;
	//   10   18:return          
		}
	}
}
