// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.*;

// Referenced classes of package com.airbnb.lottie:
//			Content

interface DrawingContent
	extends Content
{

	public abstract void addColorFilter(String s, String s1, ColorFilter colorfilter);

	public abstract void draw(Canvas canvas, Matrix matrix, int i);

	public abstract void getBounds(RectF rectf, Matrix matrix);
}
