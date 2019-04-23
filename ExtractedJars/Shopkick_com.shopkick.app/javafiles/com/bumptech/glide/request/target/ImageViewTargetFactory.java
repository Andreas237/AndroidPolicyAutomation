// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// Referenced classes of package com.bumptech.glide.request.target:
//			BitmapImageViewTarget, DrawableImageViewTarget, ViewTarget

public class ImageViewTargetFactory
{

	public ImageViewTargetFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public ViewTarget buildTarget(ImageView imageview, Class class1)
	{
		if(((Object) (android/graphics/Bitmap)).equals(((Object) (class1))))
	//*   0    0:ldc1            #14  <Class Bitmap>
	//*   1    2:aload_2         
	//*   2    3:invokevirtual   #18  <Method boolean Object.equals(Object)>
	//*   3    6:ifeq            18
			return ((ViewTarget) (new BitmapImageViewTarget(imageview)));
	//    4    9:new             #20  <Class BitmapImageViewTarget>
	//    5   12:dup             
	//    6   13:aload_1         
	//    7   14:invokespecial   #23  <Method void BitmapImageViewTarget(ImageView)>
	//    8   17:areturn         
		if(((Class) (android/graphics/drawable/Drawable)).isAssignableFrom(class1))
	//*   9   18:ldc1            #25  <Class Drawable>
	//*  10   20:aload_2         
	//*  11   21:invokevirtual   #31  <Method boolean Class.isAssignableFrom(Class)>
	//*  12   24:ifeq            36
		{
			return ((ViewTarget) (new DrawableImageViewTarget(imageview)));
	//   13   27:new             #33  <Class DrawableImageViewTarget>
	//   14   30:dup             
	//   15   31:aload_1         
	//   16   32:invokespecial   #34  <Method void DrawableImageViewTarget(ImageView)>
	//   17   35:areturn         
		} else
		{
			imageview = ((ImageView) (new StringBuilder()));
	//   18   36:new             #36  <Class StringBuilder>
	//   19   39:dup             
	//   20   40:invokespecial   #37  <Method void StringBuilder()>
	//   21   43:astore_1        
			((StringBuilder) (imageview)).append("Unhandled class: ");
	//   22   44:aload_1         
	//   23   45:ldc1            #39  <String "Unhandled class: ">
	//   24   47:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
			((StringBuilder) (imageview)).append(((Object) (class1)));
	//   26   51:aload_1         
	//   27   52:aload_2         
	//   28   53:invokevirtual   #46  <Method StringBuilder StringBuilder.append(Object)>
	//   29   56:pop             
			((StringBuilder) (imageview)).append(", try .as*(Class).transcode(ResourceTranscoder)");
	//   30   57:aload_1         
	//   31   58:ldc1            #48  <String ", try .as*(Class).transcode(ResourceTranscoder)">
	//   32   60:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   33   63:pop             
			throw new IllegalArgumentException(((StringBuilder) (imageview)).toString());
	//   34   64:new             #50  <Class IllegalArgumentException>
	//   35   67:dup             
	//   36   68:aload_1         
	//   37   69:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   38   72:invokespecial   #57  <Method void IllegalArgumentException(String)>
	//   39   75:athrow          
		}
	}
}
