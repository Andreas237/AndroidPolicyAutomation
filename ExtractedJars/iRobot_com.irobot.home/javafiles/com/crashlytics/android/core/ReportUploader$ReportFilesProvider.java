// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.File;

// Referenced classes of package com.crashlytics.android.core:
//			ReportUploader

static interface ReportUploader$ReportFilesProvider
{

	public abstract File[] getCompleteSessionFiles();

	public abstract File[] getInvalidSessionFiles();

	public abstract File[] getNativeReportFiles();
}
