// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load;


// Referenced classes of package com.bumptech.glide.load:
//			Encoder, Options, EncodeStrategy

public interface ResourceEncoder
	extends Encoder
{

	public abstract EncodeStrategy getEncodeStrategy(Options options);
}
