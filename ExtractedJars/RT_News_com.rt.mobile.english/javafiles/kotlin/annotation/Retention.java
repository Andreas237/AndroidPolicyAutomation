// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.annotation;

import java.lang.annotation.Annotation;

// Referenced classes of package kotlin.annotation:
//			AnnotationRetention

public interface Retention
	extends Annotation
{

	public abstract AnnotationRetention value();
}
