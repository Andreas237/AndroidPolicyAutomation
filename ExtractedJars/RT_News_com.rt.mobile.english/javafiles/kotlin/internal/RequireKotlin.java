// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.internal;

import java.lang.annotation.Annotation;
import kotlin.DeprecationLevel;

// Referenced classes of package kotlin.internal:
//			RequireKotlinVersionKind

public interface RequireKotlin
	extends Annotation
{

	public abstract int errorCode();

	public abstract DeprecationLevel level();

	public abstract String message();

	public abstract String version();

	public abstract RequireKotlinVersionKind versionKind();
}
