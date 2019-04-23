// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load:
//			Options

public interface ResourceDecoder
{

	public abstract Resource decode(Object obj, int i, int j, Options options)
		throws IOException;

	public abstract boolean handles(Object obj, Options options)
		throws IOException;
}
