// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package javax.annotation;

import java.lang.annotation.Annotation;
import javax.annotation.meta.When;

public interface Nonnull
	extends Annotation
{

	public abstract When when();

	// Unreferenced inner class javax/annotation/Nonnull$Checker
	/* block-local class not found */
	class Checker {}

}
