// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamite;

import android.content.Context;

// Referenced classes of package com.google.android.gms.dynamite:
//			DynamiteModule

public static interface DynamiteModule$VersionPolicy$zza
{

	public abstract int getLocalVersion(Context context, String s);

	public abstract int zza(Context context, String s, boolean flag)
		throws DynamiteModule.LoadingException;
}
