// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;


// Referenced classes of package android.support.v4.view:
//			ViewPager

public static interface ViewPager$OnPageChangeListener
{

	public abstract void onPageScrollStateChanged(int i);

	public abstract void onPageScrolled(int i, float f, int j);

	public abstract void onPageSelected(int i);
}
