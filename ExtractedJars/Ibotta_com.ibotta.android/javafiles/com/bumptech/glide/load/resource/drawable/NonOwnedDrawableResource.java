// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.Resource;

// Referenced classes of package com.bumptech.glide.load.resource.drawable:
//			DrawableResource

final class NonOwnedDrawableResource extends DrawableResource
{

	private NonOwnedDrawableResource(Drawable drawable)
	{
		super(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void DrawableResource(Drawable)>
	//    3    5:return          
	}

	static Resource newInstance(Drawable drawable)
	{
		if(drawable != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
			return ((Resource) (new NonOwnedDrawableResource(drawable)));
	//    2    4:new             #2   <Class NonOwnedDrawableResource>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #14  <Method void NonOwnedDrawableResource(Drawable)>
	//    6   12:areturn         
		else
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
	}

	public Class getResourceClass()
	{
		return ((Object) (drawable)).getClass();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable drawable>
	//    2    4:invokevirtual   #30  <Method Class Object.getClass()>
	//    3    7:areturn         
	}

	public int getSize()
	{
		return Math.max(1, drawable.getIntrinsicWidth() * drawable.getIntrinsicHeight() * 4);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:getfield        #25  <Field Drawable drawable>
	//    3    5:invokevirtual   #38  <Method int Drawable.getIntrinsicWidth()>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field Drawable drawable>
	//    6   12:invokevirtual   #41  <Method int Drawable.getIntrinsicHeight()>
	//    7   15:imul            
	//    8   16:iconst_4        
	//    9   17:imul            
	//   10   18:invokestatic    #47  <Method int Math.max(int, int)>
	//   11   21:ireturn         
	}

	public void recycle()
	{
	//    0    0:return          
	}
}
