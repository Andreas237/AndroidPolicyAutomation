// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.streamroot.dna.core;

import android.net.Uri;
import io.streamroot.dna.core.log.LogLevel;

// Referenced classes of package io.streamroot.dna.core:
//			BandwidthListener, QosModule, DnaClient

public interface OptionalConfigBuilder
{

	public abstract OptionalConfigBuilder backendHost(String s);

	public abstract OptionalConfigBuilder backendUri(Uri uri);

	public abstract OptionalConfigBuilder bandwidthListener(BandwidthListener bandwidthlistener);

	public abstract OptionalConfigBuilder contentId(String s);

	public abstract OptionalConfigBuilder experimentalFlags(long l);

	public abstract OptionalConfigBuilder latency(int i);

	public abstract OptionalConfigBuilder logLevel(LogLevel loglevel);

	public abstract OptionalConfigBuilder property(String s);

	public abstract OptionalConfigBuilder qosModule(QosModule qosmodule);

	public abstract DnaClient start(Uri uri);

	public abstract OptionalConfigBuilder streamrootKey(String s);
}
