// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import java.net.URL;

// Referenced classes of package com.craftar:
//			ResourceDownloader

static interface ResourceDownloader$DownloadProgressHandler
{

	public abstract void onDownloadFinished(int i, int j, URL url, boolean flag);

	public abstract void onDownloadProgress(int i, int j);

	public abstract void onFileSizeDetermined(int i, long l);
}
