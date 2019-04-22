// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common.android;

import android.app.Dialog;

// Referenced classes of package com.facebook.stetho.common.android:
//			FragmentAccessor

public interface DialogFragmentAccessor
	extends FragmentAccessor
{

	public abstract Dialog getDialog(Object obj);
}
