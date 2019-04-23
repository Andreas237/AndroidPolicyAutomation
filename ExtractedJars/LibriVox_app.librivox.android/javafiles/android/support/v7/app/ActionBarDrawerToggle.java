// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.m;
import android.support.v7.graphics.drawable.DrawerArrowDrawable;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public class ActionBarDrawerToggle
	implements m
{

	public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerlayout, int i, int j)
	{
		this(activity, ((Toolbar) (null)), drawerlayout, ((DrawerArrowDrawable) (null)), i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:aconst_null     
	//    5    5:iload_3         
	//    6    6:iload           4
	//    7    8:invokespecial   #29  <Method void ActionBarDrawerToggle(Activity, Toolbar, DrawerLayout, DrawerArrowDrawable, int, int)>
	//    8   11:return          
	}

	public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerlayout, Toolbar toolbar, int i, int j)
	{
		this(activity, toolbar, drawerlayout, ((DrawerArrowDrawable) (null)), i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:aload_2         
	//    4    4:aconst_null     
	//    5    5:iload           4
	//    6    7:iload           5
	//    7    9:invokespecial   #29  <Method void ActionBarDrawerToggle(Activity, Toolbar, DrawerLayout, DrawerArrowDrawable, int, int)>
	//    8   12:return          
	}

	ActionBarDrawerToggle(Activity activity, Toolbar toolbar, DrawerLayout drawerlayout, DrawerArrowDrawable drawerarrowdrawable, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		mDrawerSlideAnimationEnabled = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #36  <Field boolean mDrawerSlideAnimationEnabled>
		mDrawerIndicatorEnabled = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #38  <Field boolean mDrawerIndicatorEnabled>
		mWarnedForDisplayHomeAsUp = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #40  <Field boolean mWarnedForDisplayHomeAsUp>
		if(toolbar != null)
	//*  11   19:aload_2         
	//*  12   20:ifnull          50
		{
			mActivityImpl = ((Delegate) (new ToolbarCompatDelegate(toolbar)));
	//   13   23:aload_0         
	//   14   24:new             #42  <Class ActionBarDrawerToggle$ToolbarCompatDelegate>
	//   15   27:dup             
	//   16   28:aload_2         
	//   17   29:invokespecial   #45  <Method void ActionBarDrawerToggle$ToolbarCompatDelegate(Toolbar)>
	//   18   32:putfield        #47  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
			toolbar.setNavigationOnClickListener(((android.view.View.OnClickListener) (new _cls1())));
	//   19   35:aload_2         
	//   20   36:new             #49  <Class ActionBarDrawerToggle$1>
	//   21   39:dup             
	//   22   40:aload_0         
	//   23   41:invokespecial   #52  <Method void ActionBarDrawerToggle$1(ActionBarDrawerToggle)>
	//   24   44:invokevirtual   #58  <Method void Toolbar.setNavigationOnClickListener(android.view.View$OnClickListener)>
		} else
	//*  25   47:goto            85
		if(activity instanceof DelegateProvider)
	//*  26   50:aload_1         
	//*  27   51:instanceof      #60  <Class ActionBarDrawerToggle$DelegateProvider>
	//*  28   54:ifeq            73
			mActivityImpl = ((DelegateProvider)activity).getDrawerToggleDelegate();
	//   29   57:aload_0         
	//   30   58:aload_1         
	//   31   59:checkcast       #60  <Class ActionBarDrawerToggle$DelegateProvider>
	//   32   62:invokeinterface #64  <Method ActionBarDrawerToggle$Delegate ActionBarDrawerToggle$DelegateProvider.getDrawerToggleDelegate()>
	//   33   67:putfield        #47  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
		else
	//*  34   70:goto            85
			mActivityImpl = ((Delegate) (new FrameworkActionBarDelegate(activity)));
	//   35   73:aload_0         
	//   36   74:new             #66  <Class ActionBarDrawerToggle$FrameworkActionBarDelegate>
	//   37   77:dup             
	//   38   78:aload_1         
	//   39   79:invokespecial   #69  <Method void ActionBarDrawerToggle$FrameworkActionBarDelegate(Activity)>
	//   40   82:putfield        #47  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
		mDrawerLayout = drawerlayout;
	//   41   85:aload_0         
	//   42   86:aload_3         
	//   43   87:putfield        #71  <Field DrawerLayout mDrawerLayout>
		mOpenDrawerContentDescRes = i;
	//   44   90:aload_0         
	//   45   91:iload           5
	//   46   93:putfield        #73  <Field int mOpenDrawerContentDescRes>
		mCloseDrawerContentDescRes = j;
	//   47   96:aload_0         
	//   48   97:iload           6
	//   49   99:putfield        #75  <Field int mCloseDrawerContentDescRes>
		if(drawerarrowdrawable == null)
	//*  50  102:aload           4
	//*  51  104:ifnonnull       130
			mSlider = new DrawerArrowDrawable(mActivityImpl.getActionBarThemedContext());
	//   52  107:aload_0         
	//   53  108:new             #77  <Class DrawerArrowDrawable>
	//   54  111:dup             
	//   55  112:aload_0         
	//   56  113:getfield        #47  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
	//   57  116:invokeinterface #83  <Method Context ActionBarDrawerToggle$Delegate.getActionBarThemedContext()>
	//   58  121:invokespecial   #86  <Method void DrawerArrowDrawable(Context)>
	//   59  124:putfield        #88  <Field DrawerArrowDrawable mSlider>
		else
	//*  60  127:goto            136
			mSlider = drawerarrowdrawable;
	//   61  130:aload_0         
	//   62  131:aload           4
	//   63  133:putfield        #88  <Field DrawerArrowDrawable mSlider>
		mHomeAsUpIndicator = getThemeUpIndicator();
	//   64  136:aload_0         
	//   65  137:aload_0         
	//   66  138:invokevirtual   #92  <Method Drawable getThemeUpIndicator()>
	//   67  141:putfield        #94  <Field Drawable mHomeAsUpIndicator>
	//   68  144:return          
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
	//    5    7:getfield        #88  <Field DrawerArrowDrawable mSlider>
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #100 <Method void DrawerArrowDrawable.setVerticalMirror(boolean)>
		else
	//*   8   14:goto            31
		if(f == 0.0F)
	//*   9   17:fload_1         
	//*  10   18:fconst_0        
	//*  11   19:fcmpl           
	//*  12   20:ifne            31
			mSlider.setVerticalMirror(false);
	//   13   23:aload_0         
	//   14   24:getfield        #88  <Field DrawerArrowDrawable mSlider>
	//   15   27:iconst_0        
	//   16   28:invokevirtual   #100 <Method void DrawerArrowDrawable.setVerticalMirror(boolean)>
		mSlider.setProgress(f);
	//   17   31:aload_0         
	//   18   32:getfield        #88  <Field DrawerArrowDrawable mSlider>
	//   19   35:fload_1         
	//   20   36:invokevirtual   #103 <Method void DrawerArrowDrawable.setProgress(float)>
	//   21   39:return          
	}

	public DrawerArrowDrawable getDrawerArrowDrawable()
	{
		return mSlider;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field DrawerArrowDrawable mSlider>
	//    2    4:areturn         
	}

	Drawable getThemeUpIndicator()
	{
		return mActivityImpl.getThemeUpIndicator();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
	//    2    4:invokeinterface #106 <Method Drawable ActionBarDrawerToggle$Delegate.getThemeUpIndicator()>
	//    3    9:areturn         
	}

	public android.view.View.OnClickListener getToolbarNavigationClickListener()
	{
		return mToolbarNavigationClickListener;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field android.view.View$OnClickListener mToolbarNavigationClickListener>
	//    2    4:areturn         
	}

	public boolean isDrawerIndicatorEnabled()
	{
		return mDrawerIndicatorEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field boolean mDrawerIndicatorEnabled>
	//    2    4:ireturn         
	}

	public boolean isDrawerSlideAnimationEnabled()
	{
		return mDrawerSlideAnimationEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean mDrawerSlideAnimationEnabled>
	//    2    4:ireturn         
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		if(!mHasCustomUpIndicator)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field boolean mHasCustomUpIndicator>
	//*   2    4:ifne            15
			mHomeAsUpIndicator = getThemeUpIndicator();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #92  <Method Drawable getThemeUpIndicator()>
	//    6   12:putfield        #94  <Field Drawable mHomeAsUpIndicator>
		syncState();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #120 <Method void syncState()>
	//    9   19:return          
	}

	public void onDrawerClosed(View view)
	{
		setPosition(0.0F);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:invokespecial   #124 <Method void setPosition(float)>
		if(mDrawerIndicatorEnabled)
	//*   3    5:aload_0         
	//*   4    6:getfield        #38  <Field boolean mDrawerIndicatorEnabled>
	//*   5    9:ifeq            20
			setActionBarDescription(mOpenDrawerContentDescRes);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #73  <Field int mOpenDrawerContentDescRes>
	//    9   17:invokevirtual   #128 <Method void setActionBarDescription(int)>
	//   10   20:return          
	}

	public void onDrawerOpened(View view)
	{
		setPosition(1.0F);
	//    0    0:aload_0         
	//    1    1:fconst_1        
	//    2    2:invokespecial   #124 <Method void setPosition(float)>
		if(mDrawerIndicatorEnabled)
	//*   3    5:aload_0         
	//*   4    6:getfield        #38  <Field boolean mDrawerIndicatorEnabled>
	//*   5    9:ifeq            20
			setActionBarDescription(mCloseDrawerContentDescRes);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #75  <Field int mCloseDrawerContentDescRes>
	//    9   17:invokevirtual   #128 <Method void setActionBarDescription(int)>
	//   10   20:return          
	}

	public void onDrawerSlide(View view, float f)
	{
		if(mDrawerSlideAnimationEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field boolean mDrawerSlideAnimationEnabled>
	//*   2    4:ifeq            21
		{
			setPosition(Math.min(1.0F, Math.max(0.0F, f)));
	//    3    7:aload_0         
	//    4    8:fconst_1        
	//    5    9:fconst_0        
	//    6   10:fload_2         
	//    7   11:invokestatic    #137 <Method float Math.max(float, float)>
	//    8   14:invokestatic    #140 <Method float Math.min(float, float)>
	//    9   17:invokespecial   #124 <Method void setPosition(float)>
			return;
	//   10   20:return          
		} else
		{
			setPosition(0.0F);
	//   11   21:aload_0         
	//   12   22:fconst_0        
	//   13   23:invokespecial   #124 <Method void setPosition(float)>
			return;
	//   14   26:return          
		}
	}

	public void onDrawerStateChanged(int i)
	{
	//    0    0:return          
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		if(menuitem != null && menuitem.getItemId() == 0x102002c && mDrawerIndicatorEnabled)
	//*   0    0:aload_1         
	//*   1    1:ifnull          28
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #149 <Method int MenuItem.getItemId()>
	//*   4   10:ldc1            #150 <Int 0x102002c>
	//*   5   12:icmpne          28
	//*   6   15:aload_0         
	//*   7   16:getfield        #38  <Field boolean mDrawerIndicatorEnabled>
	//*   8   19:ifeq            28
		{
			toggle();
	//    9   22:aload_0         
	//   10   23:invokevirtual   #153 <Method void toggle()>
			return true;
	//   11   26:iconst_1        
	//   12   27:ireturn         
		} else
		{
			return false;
	//   13   28:iconst_0        
	//   14   29:ireturn         
		}
	}

	void setActionBarDescription(int i)
	{
		mActivityImpl.setActionBarDescription(i);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #154 <Method void ActionBarDrawerToggle$Delegate.setActionBarDescription(int)>
	//    4   10:return          
	}

	void setActionBarUpIndicator(Drawable drawable, int i)
	{
		if(!mWarnedForDisplayHomeAsUp && !mActivityImpl.isNavigationVisible())
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field boolean mWarnedForDisplayHomeAsUp>
	//*   2    4:ifne            32
	//*   3    7:aload_0         
	//*   4    8:getfield        #47  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
	//*   5   11:invokeinterface #159 <Method boolean ActionBarDrawerToggle$Delegate.isNavigationVisible()>
	//*   6   16:ifne            32
		{
			Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
	//    7   19:ldc1            #161 <String "ActionBarDrawerToggle">
	//    8   21:ldc1            #163 <String "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);">
	//    9   23:invokestatic    #169 <Method int Log.w(String, String)>
	//   10   26:pop             
			mWarnedForDisplayHomeAsUp = true;
	//   11   27:aload_0         
	//   12   28:iconst_1        
	//   13   29:putfield        #40  <Field boolean mWarnedForDisplayHomeAsUp>
		}
		mActivityImpl.setActionBarUpIndicator(drawable, i);
	//   14   32:aload_0         
	//   15   33:getfield        #47  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
	//   16   36:aload_1         
	//   17   37:iload_2         
	//   18   38:invokeinterface #171 <Method void ActionBarDrawerToggle$Delegate.setActionBarUpIndicator(Drawable, int)>
	//   19   43:return          
	}

	public void setDrawerArrowDrawable(DrawerArrowDrawable drawerarrowdrawable)
	{
		mSlider = drawerarrowdrawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field DrawerArrowDrawable mSlider>
		syncState();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #120 <Method void syncState()>
	//    5    9:return          
	}

	public void setDrawerIndicatorEnabled(boolean flag)
	{
		if(flag != mDrawerIndicatorEnabled)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #38  <Field boolean mDrawerIndicatorEnabled>
	//*   3    5:icmpeq          65
		{
			if(flag)
	//*   4    8:iload_1         
	//*   5    9:ifeq            51
			{
				DrawerArrowDrawable drawerarrowdrawable = mSlider;
	//    6   12:aload_0         
	//    7   13:getfield        #88  <Field DrawerArrowDrawable mSlider>
	//    8   16:astore_3        
				int i;
				if(mDrawerLayout.f(0x800003))
	//*   9   17:aload_0         
	//*  10   18:getfield        #71  <Field DrawerLayout mDrawerLayout>
	//*  11   21:ldc1            #175 <Int 0x800003>
	//*  12   23:invokevirtual   #181 <Method boolean DrawerLayout.f(int)>
	//*  13   26:ifeq            37
					i = mCloseDrawerContentDescRes;
	//   14   29:aload_0         
	//   15   30:getfield        #75  <Field int mCloseDrawerContentDescRes>
	//   16   33:istore_2        
				else
	//*  17   34:goto            42
					i = mOpenDrawerContentDescRes;
	//   18   37:aload_0         
	//   19   38:getfield        #73  <Field int mOpenDrawerContentDescRes>
	//   20   41:istore_2        
				setActionBarUpIndicator(((Drawable) (drawerarrowdrawable)), i);
	//   21   42:aload_0         
	//   22   43:aload_3         
	//   23   44:iload_2         
	//   24   45:invokevirtual   #182 <Method void setActionBarUpIndicator(Drawable, int)>
			} else
	//*  25   48:goto            60
			{
				setActionBarUpIndicator(mHomeAsUpIndicator, 0);
	//   26   51:aload_0         
	//   27   52:aload_0         
	//   28   53:getfield        #94  <Field Drawable mHomeAsUpIndicator>
	//   29   56:iconst_0        
	//   30   57:invokevirtual   #182 <Method void setActionBarUpIndicator(Drawable, int)>
			}
			mDrawerIndicatorEnabled = flag;
	//   31   60:aload_0         
	//   32   61:iload_1         
	//   33   62:putfield        #38  <Field boolean mDrawerIndicatorEnabled>
		}
	//   34   65:return          
	}

	public void setDrawerSlideAnimationEnabled(boolean flag)
	{
		mDrawerSlideAnimationEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #36  <Field boolean mDrawerSlideAnimationEnabled>
		if(!flag)
	//*   3    5:iload_1         
	//*   4    6:ifne            14
			setPosition(0.0F);
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:invokespecial   #124 <Method void setPosition(float)>
	//    8   14:return          
	}

	public void setHomeAsUpIndicator(int i)
	{
		Drawable drawable;
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            19
			drawable = mDrawerLayout.getResources().getDrawable(i);
	//    2    4:aload_0         
	//    3    5:getfield        #71  <Field DrawerLayout mDrawerLayout>
	//    4    8:invokevirtual   #188 <Method Resources DrawerLayout.getResources()>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #194 <Method Drawable Resources.getDrawable(int)>
	//    7   15:astore_2        
		else
	//*   8   16:goto            21
			drawable = null;
	//    9   19:aconst_null     
	//   10   20:astore_2        
		setHomeAsUpIndicator(drawable);
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #197 <Method void setHomeAsUpIndicator(Drawable)>
	//   14   26:return          
	}

	public void setHomeAsUpIndicator(Drawable drawable)
	{
		if(drawable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       20
		{
			mHomeAsUpIndicator = getThemeUpIndicator();
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #92  <Method Drawable getThemeUpIndicator()>
	//    5    9:putfield        #94  <Field Drawable mHomeAsUpIndicator>
			mHasCustomUpIndicator = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #117 <Field boolean mHasCustomUpIndicator>
		} else
	//*   9   17:goto            30
		{
			mHomeAsUpIndicator = drawable;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #94  <Field Drawable mHomeAsUpIndicator>
			mHasCustomUpIndicator = true;
	//   13   25:aload_0         
	//   14   26:iconst_1        
	//   15   27:putfield        #117 <Field boolean mHasCustomUpIndicator>
		}
		if(!mDrawerIndicatorEnabled)
	//*  16   30:aload_0         
	//*  17   31:getfield        #38  <Field boolean mDrawerIndicatorEnabled>
	//*  18   34:ifne            46
			setActionBarUpIndicator(mHomeAsUpIndicator, 0);
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #94  <Field Drawable mHomeAsUpIndicator>
	//   22   42:iconst_0        
	//   23   43:invokevirtual   #182 <Method void setActionBarUpIndicator(Drawable, int)>
	//   24   46:return          
	}

	public void setToolbarNavigationClickListener(android.view.View.OnClickListener onclicklistener)
	{
		mToolbarNavigationClickListener = onclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #110 <Field android.view.View$OnClickListener mToolbarNavigationClickListener>
	//    3    5:return          
	}

	public void syncState()
	{
		if(mDrawerLayout.f(0x800003))
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field DrawerLayout mDrawerLayout>
	//*   2    4:ldc1            #175 <Int 0x800003>
	//*   3    6:invokevirtual   #181 <Method boolean DrawerLayout.f(int)>
	//*   4    9:ifeq            20
			setPosition(1.0F);
	//    5   12:aload_0         
	//    6   13:fconst_1        
	//    7   14:invokespecial   #124 <Method void setPosition(float)>
		else
	//*   8   17:goto            25
			setPosition(0.0F);
	//    9   20:aload_0         
	//   10   21:fconst_0        
	//   11   22:invokespecial   #124 <Method void setPosition(float)>
		if(mDrawerIndicatorEnabled)
	//*  12   25:aload_0         
	//*  13   26:getfield        #38  <Field boolean mDrawerIndicatorEnabled>
	//*  14   29:ifeq            68
		{
			DrawerArrowDrawable drawerarrowdrawable = mSlider;
	//   15   32:aload_0         
	//   16   33:getfield        #88  <Field DrawerArrowDrawable mSlider>
	//   17   36:astore_2        
			int i;
			if(mDrawerLayout.f(0x800003))
	//*  18   37:aload_0         
	//*  19   38:getfield        #71  <Field DrawerLayout mDrawerLayout>
	//*  20   41:ldc1            #175 <Int 0x800003>
	//*  21   43:invokevirtual   #181 <Method boolean DrawerLayout.f(int)>
	//*  22   46:ifeq            57
				i = mCloseDrawerContentDescRes;
	//   23   49:aload_0         
	//   24   50:getfield        #75  <Field int mCloseDrawerContentDescRes>
	//   25   53:istore_1        
			else
	//*  26   54:goto            62
				i = mOpenDrawerContentDescRes;
	//   27   57:aload_0         
	//   28   58:getfield        #73  <Field int mOpenDrawerContentDescRes>
	//   29   61:istore_1        
			setActionBarUpIndicator(((Drawable) (drawerarrowdrawable)), i);
	//   30   62:aload_0         
	//   31   63:aload_2         
	//   32   64:iload_1         
	//   33   65:invokevirtual   #182 <Method void setActionBarUpIndicator(Drawable, int)>
		}
	//   34   68:return          
	}

	void toggle()
	{
		int i = mDrawerLayout.a(0x800003);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field DrawerLayout mDrawerLayout>
	//    2    4:ldc1            #175 <Int 0x800003>
	//    3    6:invokevirtual   #202 <Method int DrawerLayout.a(int)>
	//    4    9:istore_1        
		if(mDrawerLayout.g(0x800003) && i != 2)
	//*   5   10:aload_0         
	//*   6   11:getfield        #71  <Field DrawerLayout mDrawerLayout>
	//*   7   14:ldc1            #175 <Int 0x800003>
	//*   8   16:invokevirtual   #205 <Method boolean DrawerLayout.g(int)>
	//*   9   19:ifeq            37
	//*  10   22:iload_1         
	//*  11   23:iconst_2        
	//*  12   24:icmpeq          37
		{
			mDrawerLayout.e(0x800003);
	//   13   27:aload_0         
	//   14   28:getfield        #71  <Field DrawerLayout mDrawerLayout>
	//   15   31:ldc1            #175 <Int 0x800003>
	//   16   33:invokevirtual   #208 <Method void DrawerLayout.e(int)>
			return;
	//   17   36:return          
		}
		if(i != 1)
	//*  18   37:iload_1         
	//*  19   38:iconst_1        
	//*  20   39:icmpeq          51
			mDrawerLayout.d(0x800003);
	//   21   42:aload_0         
	//   22   43:getfield        #71  <Field DrawerLayout mDrawerLayout>
	//   23   46:ldc1            #175 <Int 0x800003>
	//   24   48:invokevirtual   #211 <Method void DrawerLayout.d(int)>
	//   25   51:return          
	}

	private final Delegate mActivityImpl;
	private final int mCloseDrawerContentDescRes;
	boolean mDrawerIndicatorEnabled;
	private final DrawerLayout mDrawerLayout;
	private boolean mDrawerSlideAnimationEnabled;
	private boolean mHasCustomUpIndicator;
	private Drawable mHomeAsUpIndicator;
	private final int mOpenDrawerContentDescRes;
	private DrawerArrowDrawable mSlider;
	android.view.View.OnClickListener mToolbarNavigationClickListener;
	private boolean mWarnedForDisplayHomeAsUp;

	private class ToolbarCompatDelegate
		implements Delegate
	{

		public Context getActionBarThemedContext()
		{
			return mToolbar.getContext();
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Toolbar mToolbar>
		//    2    4:invokevirtual   #39  <Method Context Toolbar.getContext()>
		//    3    7:areturn         
		}

		public Drawable getThemeUpIndicator()
		{
			return mDefaultUpIndicator;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field Drawable mDefaultUpIndicator>
		//    2    4:areturn         
		}

		public boolean isNavigationVisible()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public void setActionBarDescription(int i)
		{
			if(i == 0)
		//*   0    0:iload_1         
		//*   1    1:ifne            16
			{
				mToolbar.setNavigationContentDescription(mDefaultContentDescription);
		//    2    4:aload_0         
		//    3    5:getfield        #19  <Field Toolbar mToolbar>
		//    4    8:aload_0         
		//    5    9:getfield        #33  <Field CharSequence mDefaultContentDescription>
		//    6   12:invokevirtual   #48  <Method void Toolbar.setNavigationContentDescription(CharSequence)>
				return;
		//    7   15:return          
			} else
			{
				mToolbar.setNavigationContentDescription(i);
		//    8   16:aload_0         
		//    9   17:getfield        #19  <Field Toolbar mToolbar>
		//   10   20:iload_1         
		//   11   21:invokevirtual   #50  <Method void Toolbar.setNavigationContentDescription(int)>
				return;
		//   12   24:return          
			}
		}

		public void setActionBarUpIndicator(Drawable drawable, int i)
		{
			mToolbar.setNavigationIcon(drawable);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Toolbar mToolbar>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #56  <Method void Toolbar.setNavigationIcon(Drawable)>
			setActionBarDescription(i);
		//    4    8:aload_0         
		//    5    9:iload_2         
		//    6   10:invokevirtual   #58  <Method void setActionBarDescription(int)>
		//    7   13:return          
		}

		final CharSequence mDefaultContentDescription;
		final Drawable mDefaultUpIndicator;
		final Toolbar mToolbar;

		ToolbarCompatDelegate(Toolbar toolbar)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mToolbar = toolbar;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field Toolbar mToolbar>
			mDefaultUpIndicator = toolbar.getNavigationIcon();
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:invokevirtual   #25  <Method Drawable Toolbar.getNavigationIcon()>
		//    8   14:putfield        #27  <Field Drawable mDefaultUpIndicator>
			mDefaultContentDescription = toolbar.getNavigationContentDescription();
		//    9   17:aload_0         
		//   10   18:aload_1         
		//   11   19:invokevirtual   #31  <Method CharSequence Toolbar.getNavigationContentDescription()>
		//   12   22:putfield        #33  <Field CharSequence mDefaultContentDescription>
		//   13   25:return          
		}
	}


	private class _cls1
		implements android.view.View.OnClickListener
	{

		public void onClick(View view)
		{
			if(mDrawerIndicatorEnabled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #12  <Field ActionBarDrawerToggle this$0>
		//*   2    4:getfield        #24  <Field boolean ActionBarDrawerToggle.mDrawerIndicatorEnabled>
		//*   3    7:ifeq            18
			{
				toggle();
		//    4   10:aload_0         
		//    5   11:getfield        #12  <Field ActionBarDrawerToggle this$0>
		//    6   14:invokevirtual   #27  <Method void ActionBarDrawerToggle.toggle()>
				return;
		//    7   17:return          
			}
			if(mToolbarNavigationClickListener != null)
		//*   8   18:aload_0         
		//*   9   19:getfield        #12  <Field ActionBarDrawerToggle this$0>
		//*  10   22:getfield        #31  <Field android.view.View$OnClickListener ActionBarDrawerToggle.mToolbarNavigationClickListener>
		//*  11   25:ifnull          41
				mToolbarNavigationClickListener.onClick(view);
		//   12   28:aload_0         
		//   13   29:getfield        #12  <Field ActionBarDrawerToggle this$0>
		//   14   32:getfield        #31  <Field android.view.View$OnClickListener ActionBarDrawerToggle.mToolbarNavigationClickListener>
		//   15   35:aload_1         
		//   16   36:invokeinterface #33  <Method void android.view.View$OnClickListener.onClick(View)>
		//   17   41:return          
		}

		final ActionBarDrawerToggle this$0;

		_cls1()
		{
			this$0 = ActionBarDrawerToggle.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field ActionBarDrawerToggle this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}


	private class DelegateProvider
	{

		public abstract Delegate getDrawerToggleDelegate();
	}


	private class FrameworkActionBarDelegate
		implements Delegate
	{

		public Context getActionBarThemedContext()
		{
			ActionBar actionbar = mActivity.getActionBar();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field Activity mActivity>
		//    2    4:invokevirtual   #26  <Method ActionBar Activity.getActionBar()>
		//    3    7:astore_1        
			if(actionbar != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          17
				return actionbar.getThemedContext();
		//    6   12:aload_1         
		//    7   13:invokevirtual   #31  <Method Context ActionBar.getThemedContext()>
		//    8   16:areturn         
			else
				return ((Context) (mActivity));
		//    9   17:aload_0         
		//   10   18:getfield        #17  <Field Activity mActivity>
		//   11   21:areturn         
		}

		public Drawable getThemeUpIndicator()
		{
			if(android.os.Build.VERSION.SDK_INT >= 18)
		//*   0    0:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          18
		//*   2    5:icmplt          40
			{
				TypedArray typedarray = getActionBarThemedContext().obtainStyledAttributes(((android.util.AttributeSet) (null)), new int[] {
					0x101030b
				}, 0x10102ce, 0);
		//    3    8:aload_0         
		//    4    9:invokevirtual   #41  <Method Context getActionBarThemedContext()>
		//    5   12:aconst_null     
		//    6   13:iconst_1        
		//    7   14:newarray        int[]
		//    8   16:dup             
		//    9   17:iconst_0        
		//   10   18:ldc1            #42  <Int 0x101030b>
		//   11   20:iastore         
		//   12   21:ldc1            #43  <Int 0x10102ce>
		//   13   23:iconst_0        
		//   14   24:invokevirtual   #49  <Method TypedArray Context.obtainStyledAttributes(android.util.AttributeSet, int[], int, int)>
		//   15   27:astore_1        
				Drawable drawable = typedarray.getDrawable(0);
		//   16   28:aload_1         
		//   17   29:iconst_0        
		//   18   30:invokevirtual   #55  <Method Drawable TypedArray.getDrawable(int)>
		//   19   33:astore_2        
				typedarray.recycle();
		//   20   34:aload_1         
		//   21   35:invokevirtual   #58  <Method void TypedArray.recycle()>
				return drawable;
		//   22   38:aload_2         
		//   23   39:areturn         
			} else
			{
				return ActionBarDrawerToggleHoneycomb.getThemeUpIndicator(mActivity);
		//   24   40:aload_0         
		//   25   41:getfield        #17  <Field Activity mActivity>
		//   26   44:invokestatic    #63  <Method Drawable ActionBarDrawerToggleHoneycomb.getThemeUpIndicator(Activity)>
		//   27   47:areturn         
			}
		}

		public boolean isNavigationVisible()
		{
			ActionBar actionbar = mActivity.getActionBar();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field Activity mActivity>
		//    2    4:invokevirtual   #26  <Method ActionBar Activity.getActionBar()>
		//    3    7:astore_1        
			return actionbar != null && (actionbar.getDisplayOptions() & 4) != 0;
		//    4    8:aload_1         
		//    5    9:ifnull          23
		//    6   12:aload_1         
		//    7   13:invokevirtual   #69  <Method int ActionBar.getDisplayOptions()>
		//    8   16:iconst_4        
		//    9   17:iand            
		//   10   18:ifeq            23
		//   11   21:iconst_1        
		//   12   22:ireturn         
		//   13   23:iconst_0        
		//   14   24:ireturn         
		}

		public void setActionBarDescription(int i)
		{
			if(android.os.Build.VERSION.SDK_INT >= 18)
		//*   0    0:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          18
		//*   2    5:icmplt          26
			{
				ActionBar actionbar = mActivity.getActionBar();
		//    3    8:aload_0         
		//    4    9:getfield        #17  <Field Activity mActivity>
		//    5   12:invokevirtual   #26  <Method ActionBar Activity.getActionBar()>
		//    6   15:astore_2        
				if(actionbar != null)
		//*   7   16:aload_2         
		//*   8   17:ifnull          42
				{
					actionbar.setHomeActionContentDescription(i);
		//    9   20:aload_2         
		//   10   21:iload_1         
		//   11   22:invokevirtual   #74  <Method void ActionBar.setHomeActionContentDescription(int)>
					return;
		//   12   25:return          
				}
			} else
			{
				mSetIndicatorInfo = ActionBarDrawerToggleHoneycomb.setActionBarDescription(mSetIndicatorInfo, mActivity, i);
		//   13   26:aload_0         
		//   14   27:aload_0         
		//   15   28:getfield        #76  <Field ActionBarDrawerToggleHoneycomb$SetIndicatorInfo mSetIndicatorInfo>
		//   16   31:aload_0         
		//   17   32:getfield        #17  <Field Activity mActivity>
		//   18   35:iload_1         
		//   19   36:invokestatic    #79  <Method ActionBarDrawerToggleHoneycomb$SetIndicatorInfo ActionBarDrawerToggleHoneycomb.setActionBarDescription(ActionBarDrawerToggleHoneycomb$SetIndicatorInfo, Activity, int)>
		//   20   39:putfield        #76  <Field ActionBarDrawerToggleHoneycomb$SetIndicatorInfo mSetIndicatorInfo>
			}
		//   21   42:return          
		}

		public void setActionBarUpIndicator(Drawable drawable, int i)
		{
			ActionBar actionbar = mActivity.getActionBar();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field Activity mActivity>
		//    2    4:invokevirtual   #26  <Method ActionBar Activity.getActionBar()>
		//    3    7:astore_3        
			if(actionbar != null)
		//*   4    8:aload_3         
		//*   5    9:ifnull          58
			{
				if(android.os.Build.VERSION.SDK_INT >= 18)
		//*   6   12:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
		//*   7   15:bipush          18
		//*   8   17:icmplt          31
				{
					actionbar.setHomeAsUpIndicator(drawable);
		//    9   20:aload_3         
		//   10   21:aload_1         
		//   11   22:invokevirtual   #85  <Method void ActionBar.setHomeAsUpIndicator(Drawable)>
					actionbar.setHomeActionContentDescription(i);
		//   12   25:aload_3         
		//   13   26:iload_2         
		//   14   27:invokevirtual   #74  <Method void ActionBar.setHomeActionContentDescription(int)>
					return;
		//   15   30:return          
				}
				actionbar.setDisplayShowHomeEnabled(true);
		//   16   31:aload_3         
		//   17   32:iconst_1        
		//   18   33:invokevirtual   #89  <Method void ActionBar.setDisplayShowHomeEnabled(boolean)>
				mSetIndicatorInfo = ActionBarDrawerToggleHoneycomb.setActionBarUpIndicator(mSetIndicatorInfo, mActivity, drawable, i);
		//   19   36:aload_0         
		//   20   37:aload_0         
		//   21   38:getfield        #76  <Field ActionBarDrawerToggleHoneycomb$SetIndicatorInfo mSetIndicatorInfo>
		//   22   41:aload_0         
		//   23   42:getfield        #17  <Field Activity mActivity>
		//   24   45:aload_1         
		//   25   46:iload_2         
		//   26   47:invokestatic    #92  <Method ActionBarDrawerToggleHoneycomb$SetIndicatorInfo ActionBarDrawerToggleHoneycomb.setActionBarUpIndicator(ActionBarDrawerToggleHoneycomb$SetIndicatorInfo, Activity, Drawable, int)>
		//   27   50:putfield        #76  <Field ActionBarDrawerToggleHoneycomb$SetIndicatorInfo mSetIndicatorInfo>
				actionbar.setDisplayShowHomeEnabled(false);
		//   28   53:aload_3         
		//   29   54:iconst_0        
		//   30   55:invokevirtual   #89  <Method void ActionBar.setDisplayShowHomeEnabled(boolean)>
			}
		//   31   58:return          
		}

		private final Activity mActivity;
		private ActionBarDrawerToggleHoneycomb.SetIndicatorInfo mSetIndicatorInfo;

		FrameworkActionBarDelegate(Activity activity)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			mActivity = activity;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field Activity mActivity>
		//    5    9:return          
		}
	}


	private class Delegate
	{

		public abstract Context getActionBarThemedContext();

		public abstract Drawable getThemeUpIndicator();

		public abstract boolean isNavigationVisible();

		public abstract void setActionBarDescription(int i);

		public abstract void setActionBarUpIndicator(Drawable drawable, int i);
	}

}
