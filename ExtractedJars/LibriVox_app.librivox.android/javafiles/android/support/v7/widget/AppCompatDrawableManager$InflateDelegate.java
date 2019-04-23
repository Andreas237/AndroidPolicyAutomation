// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

interface AppCompatDrawableManager$InflateDelegate
{

	public abstract Drawable createFromXmlInner(Context context, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme);
}
