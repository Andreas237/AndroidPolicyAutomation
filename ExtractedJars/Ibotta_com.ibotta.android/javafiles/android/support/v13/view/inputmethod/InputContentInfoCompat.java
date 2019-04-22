// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v13.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;

public final class InputContentInfoCompat
{
	private static interface InputContentInfoCompatImpl
	{

		public abstract Uri getContentUri();

		public abstract ClipDescription getDescription();

		public abstract Object getInputContentInfo();

		public abstract Uri getLinkUri();

		public abstract void releasePermission();

		public abstract void requestPermission();
	}

}
