// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package dagger;

import java.lang.annotation.Annotation;

public interface Module
	extends Annotation
{

	public abstract Class addsTo();

	public abstract boolean complete();

	public abstract Class[] includes();

	public abstract Class[] injects();

	public abstract boolean library();

	public abstract boolean overrides();

	public abstract Class[] staticInjections();
}
