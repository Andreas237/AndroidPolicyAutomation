// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import android.os.Handler;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.video.VideoRendererEventListener;

// Referenced classes of package com.google.android.exoplayer2:
//			Renderer

public interface RenderersFactory
{

	public abstract Renderer[] createRenderers(Handler handler, VideoRendererEventListener videorenderereventlistener, AudioRendererEventListener audiorenderereventlistener, TextOutput textoutput, MetadataOutput metadataoutput, DrmSessionManager drmsessionmanager);
}
