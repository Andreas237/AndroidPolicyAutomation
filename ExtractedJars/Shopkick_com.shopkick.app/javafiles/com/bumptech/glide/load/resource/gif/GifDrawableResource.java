// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.resource.drawable.DrawableResource;

// Referenced classes of package com.bumptech.glide.load.resource.gif:
//			GifDrawable

public class GifDrawableResource extends DrawableResource
	implements Initializable
{

	public GifDrawableResource(GifDrawable gifdrawable)
	{
		super(((android.graphics.drawable.Drawable) (gifdrawable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void DrawableResource(android.graphics.drawable.Drawable)>
	//    3    5:return          
	}

	public Class getResourceClass()
	{
		return com/bumptech/glide/load/resource/gif/GifDrawable;
	//    0    0:ldc1            #18  <Class GifDrawable>
	//    1    2:areturn         
	}

	public int getSize()
	{
		return ((GifDrawable)drawable).getSize();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field android.graphics.drawable.Drawable drawable>
	//    2    4:checkcast       #18  <Class GifDrawable>
	//    3    7:invokevirtual   #29  <Method int GifDrawable.getSize()>
	//    4   10:ireturn         
	}

	public void initialize()
	{
		((GifDrawable)drawable).getFirstFrame().prepareToDraw();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field android.graphics.drawable.Drawable drawable>
	//    2    4:checkcast       #18  <Class GifDrawable>
	//    3    7:invokevirtual   #35  <Method Bitmap GifDrawable.getFirstFrame()>
	//    4   10:invokevirtual   #40  <Method void Bitmap.prepareToDraw()>
	//    5   13:return          
	}

	public void recycle()
	{
		((GifDrawable)drawable).stop();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field android.graphics.drawable.Drawable drawable>
	//    2    4:checkcast       #18  <Class GifDrawable>
	//    3    7:invokevirtual   #44  <Method void GifDrawable.stop()>
		((GifDrawable)drawable).recycle();
	//    4   10:aload_0         
	//    5   11:getfield        #27  <Field android.graphics.drawable.Drawable drawable>
	//    6   14:checkcast       #18  <Class GifDrawable>
	//    7   17:invokevirtual   #46  <Method void GifDrawable.recycle()>
	//    8   20:return          
	}
}
