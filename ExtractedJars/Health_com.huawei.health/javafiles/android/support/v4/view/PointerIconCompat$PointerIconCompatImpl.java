// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;

// Referenced classes of package android.support.v4.view:
//			PointerIconCompat

static interface PointerIconCompat$PointerIconCompatImpl
{

	public abstract Object create(Bitmap bitmap, float f, float f1);

	public abstract Object getSystemIcon(Context context, int i);

	public abstract Object load(Resources resources, int i);
}
