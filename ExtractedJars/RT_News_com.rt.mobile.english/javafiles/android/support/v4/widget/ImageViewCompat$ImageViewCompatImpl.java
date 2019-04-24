// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.widget.ImageView;

// Referenced classes of package android.support.v4.widget:
//			ImageViewCompat

static interface ImageViewCompat$ImageViewCompatImpl
{

	public abstract ColorStateList getImageTintList(ImageView imageview);

	public abstract android.graphics.PorterDuff.Mode getImageTintMode(ImageView imageview);

	public abstract void setImageTintList(ImageView imageview, ColorStateList colorstatelist);

	public abstract void setImageTintMode(ImageView imageview, android.graphics.PorterDuff.Mode mode);
}
