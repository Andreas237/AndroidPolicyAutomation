// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.resource.drawable:
//			NonOwnedDrawableResource

public class UnitDrawableDecoder
	implements ResourceDecoder
{

	public UnitDrawableDecoder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public Resource decode(Drawable drawable, int i, int j, Options options)
	{
		return NonOwnedDrawableResource.newInstance(drawable);
	//    0    0:aload_1         
	//    1    1:invokestatic    #22  <Method Resource NonOwnedDrawableResource.newInstance(Drawable)>
	//    2    4:areturn         
	}

	public volatile Resource decode(Object obj, int i, int j, Options options)
		throws IOException
	{
		return decode((Drawable)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #31  <Class Drawable>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #33  <Method Resource decode(Drawable, int, int, Options)>
	//    7   12:areturn         
	}

	public boolean handles(Drawable drawable, Options options)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public volatile boolean handles(Object obj, Options options)
		throws IOException
	{
		return handles((Drawable)obj, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #31  <Class Drawable>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #39  <Method boolean handles(Drawable, Options)>
	//    5    9:ireturn         
	}
}
