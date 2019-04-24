// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.graphics.Rect;
import com.autonavi.amap.mapcore.interfaces.IOverlayImage;

// Referenced classes of package com.amap.api.mapcore.util:
//			s

public interface de
	extends IOverlayImage
{

	public abstract void a(s s);

	public abstract void a(s s, float af[], int i1, float f);

	public abstract void b(boolean flag);

	public abstract boolean h();

	public abstract Rect i();

	public abstract boolean isInfoWindowShown();

	public abstract boolean j();

	public abstract int k();

	public abstract boolean l();
}
