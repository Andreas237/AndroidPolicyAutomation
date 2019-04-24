// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;

// Referenced classes of package android.support.v4.graphics:
//			TypefaceCompat

static interface TypefaceCompat$TypefaceCompatImpl
{

	public abstract Typeface createFromFontFamilyFilesResourceEntry(Context context, android.support.v4.content.res.lyFilesResourceEntry lyfilesresourceentry, Resources resources, int i);

	public abstract Typeface createFromFontInfo(Context context, CancellationSignal cancellationsignal, android.support.v4.provider.FontsContractCompat.FontInfo afontinfo[], int i);

	public abstract Typeface createFromResourcesFontFile(Context context, Resources resources, int i, String s, int j);
}
