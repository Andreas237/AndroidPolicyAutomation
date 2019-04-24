// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.graphics.Matrix;
import android.widget.ImageView;

interface ImageViewUtilsImpl
{

	public abstract void animateTransform(ImageView imageview, Matrix matrix);

	public abstract void reserveEndAnimateTransform(ImageView imageview, Animator animator);

	public abstract void startAnimateTransform(ImageView imageview);
}
