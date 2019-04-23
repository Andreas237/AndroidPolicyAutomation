// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models;


// Referenced classes of package com.appboy.models:
//			IInAppMessage

public interface IInAppMessageHtml
	extends IInAppMessage
{

	public abstract String getAssetsZipRemoteUrl();

	public abstract String getLocalAssetsDirectoryUrl();

	public abstract boolean logButtonClick(String s);

	public abstract void setAssetsZipRemoteUrl(String s);

	public abstract void setLocalAssetsDirectoryUrl(String s);
}
