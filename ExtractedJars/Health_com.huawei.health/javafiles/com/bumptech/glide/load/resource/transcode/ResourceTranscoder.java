// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.transcode;

import com.bumptech.glide.load.engine.Resource;

public interface ResourceTranscoder
{

	public abstract Resource transcode(Resource resource);
}
