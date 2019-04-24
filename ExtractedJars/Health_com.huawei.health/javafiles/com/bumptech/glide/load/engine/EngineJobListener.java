// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;

// Referenced classes of package com.bumptech.glide.load.engine:
//			EngineJob, EngineResource

interface EngineJobListener
{

	public abstract void onEngineJobCancelled(EngineJob enginejob, Key key);

	public abstract void onEngineJobComplete(Key key, EngineResource engineresource);
}
