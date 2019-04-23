// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load;

import android.content.Context;
import com.bumptech.glide.load.engine.Resource;

// Referenced classes of package com.bumptech.glide.load:
//			Key

public interface Transformation
	extends Key
{

	public abstract Resource transform(Context context, Resource resource, int i, int j);
}
