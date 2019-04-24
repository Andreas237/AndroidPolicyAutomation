// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin;

import java.lang.annotation.Annotation;

// Referenced classes of package kotlin:
//			DeprecationLevel, ReplaceWith

public interface Deprecated
	extends Annotation
{

	public abstract DeprecationLevel level();

	public abstract String message();

	public abstract ReplaceWith replaceWith();
}
