// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.util.Preconditions;

public abstract class DrawableResource
	implements Resource, Initializable
{

	public DrawableResource(Drawable drawable1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		drawable = (Drawable)Preconditions.checkNotNull(((Object) (drawable1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #23  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #25  <Class Drawable>
	//    6   12:putfield        #27  <Field Drawable drawable>
	//    7   15:return          
	}

	public final Drawable get()
	{
		return drawable.getConstantState().newDrawable();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Drawable drawable>
	//    2    4:invokevirtual   #36  <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//    3    7:invokevirtual   #41  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//    4   10:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method Drawable get()>
	//    2    4:areturn         
	}

	public void initialize()
	{
		if(drawable instanceof BitmapDrawable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Drawable drawable>
	//*   2    4:instanceof      #48  <Class BitmapDrawable>
	//*   3    7:ifeq            24
		{
			((BitmapDrawable)drawable).getBitmap().prepareToDraw();
	//    4   10:aload_0         
	//    5   11:getfield        #27  <Field Drawable drawable>
	//    6   14:checkcast       #48  <Class BitmapDrawable>
	//    7   17:invokevirtual   #52  <Method Bitmap BitmapDrawable.getBitmap()>
	//    8   20:invokevirtual   #57  <Method void Bitmap.prepareToDraw()>
			return;
	//    9   23:return          
		}
		if(drawable instanceof GifDrawable)
	//*  10   24:aload_0         
	//*  11   25:getfield        #27  <Field Drawable drawable>
	//*  12   28:instanceof      #59  <Class GifDrawable>
	//*  13   31:ifeq            47
			((GifDrawable)drawable).getFirstFrame().prepareToDraw();
	//   14   34:aload_0         
	//   15   35:getfield        #27  <Field Drawable drawable>
	//   16   38:checkcast       #59  <Class GifDrawable>
	//   17   41:invokevirtual   #62  <Method Bitmap GifDrawable.getFirstFrame()>
	//   18   44:invokevirtual   #57  <Method void Bitmap.prepareToDraw()>
	//   19   47:return          
	}

	protected final Drawable drawable;
}
