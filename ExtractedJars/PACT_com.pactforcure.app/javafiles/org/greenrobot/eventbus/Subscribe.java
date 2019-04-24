// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.greenrobot.eventbus;

import java.lang.annotation.Annotation;

// Referenced classes of package org.greenrobot.eventbus:
//			ThreadMode

public interface Subscribe
	extends Annotation
{

	public abstract int priority();

	public abstract boolean sticky();

	public abstract ThreadMode threadMode();
}
