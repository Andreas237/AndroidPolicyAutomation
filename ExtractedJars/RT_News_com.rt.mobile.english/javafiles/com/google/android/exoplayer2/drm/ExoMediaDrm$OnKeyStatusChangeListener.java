// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.drm:
//			ExoMediaDrm

public static interface ExoMediaDrm$OnKeyStatusChangeListener
{

	public abstract void onKeyStatusChange(ExoMediaDrm exomediadrm, byte abyte0[], List list, boolean flag);
}
