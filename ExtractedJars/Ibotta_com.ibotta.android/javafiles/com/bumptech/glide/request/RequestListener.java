// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.Target;

public interface RequestListener
{

	public abstract boolean onLoadFailed(GlideException glideexception, Object obj, Target target, boolean flag);

	public abstract boolean onResourceReady(Object obj, Object obj1, Target target, DataSource datasource, boolean flag);
}
