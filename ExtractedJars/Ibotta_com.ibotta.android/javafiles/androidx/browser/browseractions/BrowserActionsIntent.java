// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.browser.browseractions;

import java.lang.annotation.Annotation;

public class BrowserActionsIntent
{
	static interface BrowserActionsFallDialogListener
	{

		public abstract void onDialogShown();
	}

	public static interface BrowserActionsItemId
		extends Annotation
	{
	}

	public static interface BrowserActionsUrlType
		extends Annotation
	{
	}

}
