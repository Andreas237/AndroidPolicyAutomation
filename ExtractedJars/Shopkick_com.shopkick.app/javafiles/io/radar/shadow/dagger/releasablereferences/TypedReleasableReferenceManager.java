// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.shadow.dagger.releasablereferences;

import java.lang.annotation.Annotation;

// Referenced classes of package io.radar.shadow.dagger.releasablereferences:
//			ReleasableReferenceManager

public interface TypedReleasableReferenceManager
	extends ReleasableReferenceManager
{

	public abstract Annotation metadata();
}
