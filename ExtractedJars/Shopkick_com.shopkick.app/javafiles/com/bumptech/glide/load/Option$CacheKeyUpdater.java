// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load;

import java.security.MessageDigest;

// Referenced classes of package com.bumptech.glide.load:
//			Option

public static interface Option$CacheKeyUpdater
{

	public abstract void update(byte abyte0[], Object obj, MessageDigest messagedigest);
}
