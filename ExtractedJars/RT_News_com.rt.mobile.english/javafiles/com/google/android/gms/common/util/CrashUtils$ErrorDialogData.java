// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.gms.common.util:
//			CrashUtils

public static interface CrashUtils$ErrorDialogData
	extends Annotation
{

	public static final int AVG_CRASH_FREQ = 2;
	public static final int BINDER_CRASH = 0x10000000;
	public static final int DYNAMITE_CRASH = 0x20000000;
	public static final int FORCED_SHUSHED_BY_WRAPPER = 4;
	public static final int NONE = 0;
	public static final int POPUP_FREQ = 1;
	public static final int SUPPRESSED = 0x40000000;
}
