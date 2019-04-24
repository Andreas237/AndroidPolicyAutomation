// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// Referenced classes of package com.bumptech.glide.request.target:
//			BitmapImageViewTarget, DrawableImageViewTarget, Target

public class ImageViewTargetFactory
{

	public ImageViewTargetFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public Target buildTarget(ImageView imageview, Class class1)
	{
		if(((Object) (android/graphics/Bitmap)).equals(((Object) (class1))))
	//*   0    0:ldc1            #13  <Class Bitmap>
	//*   1    2:aload_2         
	//*   2    3:invokevirtual   #17  <Method boolean Object.equals(Object)>
	//*   3    6:ifeq            18
			return ((Target) (new BitmapImageViewTarget(imageview)));
	//    4    9:new             #19  <Class BitmapImageViewTarget>
	//    5   12:dup             
	//    6   13:aload_1         
	//    7   14:invokespecial   #22  <Method void BitmapImageViewTarget(ImageView)>
	//    8   17:areturn         
		if(((Class) (android/graphics/drawable/Drawable)).isAssignableFrom(class1))
	//*   9   18:ldc1            #24  <Class Drawable>
	//*  10   20:aload_2         
	//*  11   21:invokevirtual   #30  <Method boolean Class.isAssignableFrom(Class)>
	//*  12   24:ifeq            36
			return ((Target) (new DrawableImageViewTarget(imageview)));
	//   13   27:new             #32  <Class DrawableImageViewTarget>
	//   14   30:dup             
	//   15   31:aload_1         
	//   16   32:invokespecial   #33  <Method void DrawableImageViewTarget(ImageView)>
	//   17   35:areturn         
		else
			throw new IllegalArgumentException((new StringBuilder()).append("Unhandled class: ").append(((Object) (class1))).append(", try .as*(Class).transcode(ResourceTranscoder)").toString());
	//   18   36:new             #35  <Class IllegalArgumentException>
	//   19   39:dup             
	//   20   40:new             #37  <Class StringBuilder>
	//   21   43:dup             
	//   22   44:invokespecial   #38  <Method void StringBuilder()>
	//   23   47:ldc1            #40  <String "Unhandled class: ">
	//   24   49:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:aload_2         
	//   26   53:invokevirtual   #47  <Method StringBuilder StringBuilder.append(Object)>
	//   27   56:ldc1            #49  <String ", try .as*(Class).transcode(ResourceTranscoder)">
	//   28   58:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   29   61:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   30   64:invokespecial   #56  <Method void IllegalArgumentException(String)>
	//   31   67:athrow          
	}
}
