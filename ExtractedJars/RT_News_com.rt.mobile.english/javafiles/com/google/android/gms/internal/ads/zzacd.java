// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzabv, zzpb

public interface zzacd
{

	public abstract zzpb zza(zzabv zzabv, JSONObject jsonobject)
		throws JSONException, InterruptedException, ExecutionException;
}
