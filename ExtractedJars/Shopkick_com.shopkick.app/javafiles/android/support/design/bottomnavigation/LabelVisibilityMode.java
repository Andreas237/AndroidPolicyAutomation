// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.bottomnavigation;

import java.lang.annotation.Annotation;

public interface LabelVisibilityMode
	extends Annotation
{

	public static final int LABEL_VISIBILITY_AUTO = -1;
	public static final int LABEL_VISIBILITY_LABELED = 1;
	public static final int LABEL_VISIBILITY_SELECTED = 0;
	public static final int LABEL_VISIBILITY_UNLABELED = 2;
}
