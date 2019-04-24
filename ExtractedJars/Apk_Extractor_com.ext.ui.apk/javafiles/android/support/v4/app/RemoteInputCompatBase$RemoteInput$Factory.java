// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Bundle;
import java.util.Set;

// Referenced classes of package android.support.v4.app:
//			RemoteInputCompatBase

public static interface RemoteInputCompatBase$RemoteInput$Factory
{

	public abstract RemoteInputCompatBase.RemoteInput build(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle, Set set);

	public abstract RemoteInputCompatBase.RemoteInput[] newArray(int i);
}
