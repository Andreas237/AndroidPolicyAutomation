// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.bumptech.glide.load.data:
//			HttpUrlFetcher

static interface HttpUrlFetcher$HttpUrlConnectionFactory
{

	public abstract HttpURLConnection build(URL url)
		throws IOException;
}
