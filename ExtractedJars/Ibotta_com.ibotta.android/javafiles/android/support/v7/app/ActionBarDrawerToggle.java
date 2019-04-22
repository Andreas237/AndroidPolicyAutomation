// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.graphics.drawable.DrawerArrowDrawable;
import android.view.View;

public class ActionBarDrawerToggle
	implements android.support.v4.widget.DrawerLayout.DrawerListener
{
	public static interface Delegate
	{

		public abstract Context getActionBarThemedContext();

		public abstract Drawable getThemeUpIndicator();

		public abstract boolean isNavigationVisible();

		public abstract void setActionBarDescription(int i);

		public abstract void setActionBarUpIndicator(Drawable drawable, int i);
	}

	public static interface DelegateProvider
	{

		public abstract Delegate getDrawerToggleDelegate();
	}


	private void setPosition(float f)
	{
		if(f == 1.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_1        
	//*   2    2:fcmpl           
	//*   3    3:ifne            17
			mSlider.setVerticalMirror(true);
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field DrawerArrowDrawable mSlider>
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #32  <Method void DrawerArrowDrawable.setVerticalMirror(boolean)>
		else
	//*   8   14:goto            31
		if(f == 0.0F)
	//*   9   17:fload_1         
	//*  10   18:fconst_0        
	//*  11   19:fcmpl           
	//*  12   20:ifne            31
			mSlider.setVerticalMirror(false);
	//   13   23:aload_0         
	//   14   24:getfield        #26  <Field DrawerArrowDrawable mSlider>
	//   15   27:iconst_0        
	//   16   28:invokevirtual   #32  <Method void DrawerArrowDrawable.setVerticalMirror(boolean)>
		mSlider.setProgress(f);
	//   17   31:aload_0         
	//   18   32:getfield        #26  <Field DrawerArrowDrawable mSlider>
	//   19   35:fload_1         
	//   20   36:invokevirtual   #35  <Method void DrawerArrowDrawable.setProgress(float)>
	//   21   39:return          
	}

	public void onDrawerClosed(View view)
	{
		setPosition(0.0F);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:invokespecial   #40  <Method void setPosition(float)>
		if(mDrawerIndicatorEnabled)
	//*   3    5:aload_0         
	//*   4    6:getfield        #42  <Field boolean mDrawerIndicatorEnabled>
	//*   5    9:ifeq            20
			setActionBarDescription(mOpenDrawerContentDescRes);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #44  <Field int mOpenDrawerContentDescRes>
	//    9   17:invokevirtual   #48  <Method void setActionBarDescription(int)>
	//   10   20:return          
	}

	public void onDrawerOpened(View view)
	{
		setPosition(1.0F);
	//    0    0:aload_0         
	//    1    1:fconst_1        
	//    2    2:invokespecial   #40  <Method void setPosition(float)>
		if(mDrawerIndicatorEnabled)
	//*   3    5:aload_0         
	//*   4    6:getfield        #42  <Field boolean mDrawerIndicatorEnabled>
	//*   5    9:ifeq            20
			setActionBarDescription(mCloseDrawerContentDescRes);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #51  <Field int mCloseDrawerContentDescRes>
	//    9   17:invokevirtual   #48  <Method void setActionBarDescription(int)>
	//   10   20:return          
	}

	public void onDrawerSlide(View view, float f)
	{
		if(mDrawerSlideAnimationEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field boolean mDrawerSlideAnimationEnabled>
	//*   2    4:ifeq            21
		{
			setPosition(Math.min(1.0F, Math.max(0.0F, f)));
	//    3    7:aload_0         
	//    4    8:fconst_1        
	//    5    9:fconst_0        
	//    6   10:fload_2         
	//    7   11:invokestatic    #61  <Method float Math.max(float, float)>
	//    8   14:invokestatic    #64  <Method float Math.min(float, float)>
	//    9   17:invokespecial   #40  <Method void setPosition(float)>
			return;
	//   10   20:return          
		} else
		{
			setPosition(0.0F);
	//   11   21:aload_0         
	//   12   22:fconst_0        
	//   13   23:invokespecial   #40  <Method void setPosition(float)>
			return;
	//   14   26:return          
		}
	}

	public void onDrawerStateChanged(int i)
	{
	//    0    0:return          
	}

	void setActionBarDescription(int i)
	{
		mActivityImpl.setActionBarDescription(i);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #68  <Method void ActionBarDrawerToggle$Delegate.setActionBarDescription(int)>
	//    4   10:return          
	}

	private final Delegate mActivityImpl;
	private final int mCloseDrawerContentDescRes;
	boolean mDrawerIndicatorEnabled;
	private boolean mDrawerSlideAnimationEnabled;
	private final int mOpenDrawerContentDescRes;
	private DrawerArrowDrawable mSlider;
}
