// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package javax.annotation;

import java.lang.annotation.Annotation;

public interface MatchesPattern
	extends Annotation
{

	public abstract int flags();

	public abstract String value();

	// Unreferenced inner class javax/annotation/MatchesPattern$Checker
	/* block-local class not found */
	class Checker {}

}
