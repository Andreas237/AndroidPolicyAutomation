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
	implements Initializable, Resource
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
		android.graphics.drawable.Drawable.ConstantState constantstate = drawable.getConstantState();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Drawable drawable>
	//    2    4:invokevirtual   #37  <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//    3    7:astore_1        
		if(constantstate == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       17
			return drawable;
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field Drawable drawable>
	//    8   16:areturn         
		else
			return constantstate.newDrawable();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #42  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   11   21:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method Drawable get()>
	//    2    4:areturn         
	}

	public void initialize()
	{
		Drawable drawable1 = drawable;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Drawable drawable>
	//    2    4:astore_1        
		if(drawable1 instanceof BitmapDrawable)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #50  <Class BitmapDrawable>
	//*   5    9:ifeq            23
		{
			((BitmapDrawable)drawable1).getBitmap().prepareToDraw();
	//    6   12:aload_1         
	//    7   13:checkcast       #50  <Class BitmapDrawable>
	//    8   16:invokevirtual   #54  <Method Bitmap BitmapDrawable.getBitmap()>
	//    9   19:invokevirtual   #59  <Method void Bitmap.prepareToDraw()>
			return;
	//   10   22:return          
		}
		if(drawable1 instanceof GifDrawable)
	//*  11   23:aload_1         
	//*  12   24:instanceof      #61  <Class GifDrawable>
	//*  13   27:ifeq            40
			((GifDrawable)drawable1).getFirstFrame().prepareToDraw();
	//   14   30:aload_1         
	//   15   31:checkcast       #61  <Class GifDrawable>
	//   16   34:invokevirtual   #64  <Method Bitmap GifDrawable.getFirstFrame()>
	//   17   37:invokevirtual   #59  <Method void Bitmap.prepareToDraw()>
	//   18   40:return          
	}

	protected final Drawable drawable;
}
