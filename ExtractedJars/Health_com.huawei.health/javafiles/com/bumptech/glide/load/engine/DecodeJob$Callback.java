// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;

// Referenced classes of package com.bumptech.glide.load.engine:
//			DecodeJob, GlideException, Resource

static interface DecodeJob$Callback
{

	public abstract void onLoadFailed(GlideException glideexception);

	public abstract void onResourceReady(Resource resource, DataSource datasource);

	public abstract void reschedule(DecodeJob decodejob);
}
