// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.graphics.Typeface;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.v4.provider:
//			FontsContractCompat

public static class FontsContractCompat$FontRequestCallback
{
	static interface FontRequestFailReason
		extends Annotation
	{
	}


	public void onTypefaceRequestFailed(int i)
	{
	//    0    0:return          
	}

	public void onTypefaceRetrieved(Typeface typeface)
	{
	//    0    0:return          
	}

	public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
	public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
	public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
	public static final int FAIL_REASON_MALFORMED_QUERY = 3;
	public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
	public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;

	public FontsContractCompat$FontRequestCallback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:return          
	}
}
