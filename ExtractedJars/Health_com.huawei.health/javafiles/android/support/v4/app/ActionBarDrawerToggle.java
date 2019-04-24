// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.*;

// Referenced classes of package android.support.v4.app:
//			ActionBarDrawerToggleIcs, ActionBarDrawerToggleJellybeanMR2, ActionBarDrawerToggle

public class ActionBarDrawerToggle
	implements android.support.v4.widget.DrawerLayout.DrawerListener
{
	static interface ActionBarDrawerToggleImpl
	{

		public abstract Drawable getThemeUpIndicator(Activity activity);

		public abstract Object setActionBarDescription(Object obj, Activity activity, int i);

		public abstract Object setActionBarUpIndicator(Object obj, Activity activity, Drawable drawable, int i);
	}

	static class ActionBarDrawerToggleImplIcs
		implements ActionBarDrawerToggleImpl
	{

		public Drawable getThemeUpIndicator(Activity activity)
		{
			return ActionBarDrawerToggleIcs.getThemeUpIndicator(activity);
		//    0    0:aload_1         
		//    1    1:invokestatic    #23  <Method Drawable ActionBarDrawerToggleIcs.getThemeUpIndicator(Activity)>
		//    2    4:areturn         
		}

		public Object setActionBarDescription(Object obj, Activity activity, int i)
		{
			return ActionBarDrawerToggleIcs.setActionBarDescription(obj, activity, i);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:iload_3         
		//    3    3:invokestatic    #27  <Method Object ActionBarDrawerToggleIcs.setActionBarDescription(Object, Activity, int)>
		//    4    6:areturn         
		}

		public Object setActionBarUpIndicator(Object obj, Activity activity, Drawable drawable, int i)
		{
			return ActionBarDrawerToggleIcs.setActionBarUpIndicator(obj, activity, drawable, i);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:iload           4
		//    4    5:invokestatic    #31  <Method Object ActionBarDrawerToggleIcs.setActionBarUpIndicator(Object, Activity, Drawable, int)>
		//    5    8:areturn         
		}

		ActionBarDrawerToggleImplIcs()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}

	static class ActionBarDrawerToggleImplJellybeanMR2
		implements ActionBarDrawerToggleImpl
	{

		public Drawable getThemeUpIndicator(Activity activity)
		{
			return ActionBarDrawerToggleJellybeanMR2.getThemeUpIndicator(activity);
		//    0    0:aload_1         
		//    1    1:invokestatic    #23  <Method Drawable ActionBarDrawerToggleJellybeanMR2.getThemeUpIndicator(Activity)>
		//    2    4:areturn         
		}

		public Object setActionBarDescription(Object obj, Activity activity, int i)
		{
			return ActionBarDrawerToggleJellybeanMR2.setActionBarDescription(obj, activity, i);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:iload_3         
		//    3    3:invokestatic    #27  <Method Object ActionBarDrawerToggleJellybeanMR2.setActionBarDescription(Object, Activity, int)>
		//    4    6:areturn         
		}

		public Object setActionBarUpIndicator(Object obj, Activity activity, Drawable drawable, int i)
		{
			return ActionBarDrawerToggleJellybeanMR2.setActionBarUpIndicator(obj, activity, drawable, i);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:iload           4
		//    4    5:invokestatic    #31  <Method Object ActionBarDrawerToggleJellybeanMR2.setActionBarUpIndicator(Object, Activity, Drawable, int)>
		//    5    8:areturn         
		}

		ActionBarDrawerToggleImplJellybeanMR2()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}

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

	class SlideDrawable extends InsetDrawable
		implements android.graphics.drawable.Drawable.Callback
	{

		public void draw(Canvas canvas)
		{
			copyBounds(mTmpRect);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #40  <Field Rect mTmpRect>
		//    3    5:invokevirtual   #47  <Method void copyBounds(Rect)>
			canvas.save();
		//    4    8:aload_1         
		//    5    9:invokevirtual   #53  <Method int Canvas.save()>
		//    6   12:pop             
			boolean flag;
			if(ViewCompat.getLayoutDirection(mActivity.getWindow().getDecorView()) == 1)
		//*   7   13:aload_0         
		//*   8   14:getfield        #22  <Field ActionBarDrawerToggle this$0>
		//*   9   17:getfield        #57  <Field Activity ActionBarDrawerToggle.mActivity>
		//*  10   20:invokevirtual   #63  <Method Window Activity.getWindow()>
		//*  11   23:invokevirtual   #69  <Method View Window.getDecorView()>
		//*  12   26:invokestatic    #75  <Method int ViewCompat.getLayoutDirection(View)>
		//*  13   29:iconst_1        
		//*  14   30:icmpne          38
				flag = true;
		//   15   33:iconst_1        
		//   16   34:istore_2        
			else
		//*  17   35:goto            40
				flag = false;
		//   18   38:iconst_0        
		//   19   39:istore_2        
			int i;
			if(flag)
		//*  20   40:iload_2         
		//*  21   41:ifeq            49
				i = -1;
		//   22   44:iconst_m1       
		//   23   45:istore_3        
			else
		//*  24   46:goto            51
				i = 1;
		//   25   49:iconst_1        
		//   26   50:istore_3        
			int j = mTmpRect.width();
		//   27   51:aload_0         
		//   28   52:getfield        #40  <Field Rect mTmpRect>
		//   29   55:invokevirtual   #78  <Method int Rect.width()>
		//   30   58:istore          4
			canvas.translate(-mOffset * (float)j * mPosition * (float)i, 0.0F);
		//   31   60:aload_1         
		//   32   61:aload_0         
		//   33   62:getfield        #80  <Field float mOffset>
		//   34   65:fneg            
		//   35   66:iload           4
		//   36   68:i2f             
		//   37   69:fmul            
		//   38   70:aload_0         
		//   39   71:getfield        #82  <Field float mPosition>
		//   40   74:fmul            
		//   41   75:iload_3         
		//   42   76:i2f             
		//   43   77:fmul            
		//   44   78:fconst_0        
		//   45   79:invokevirtual   #86  <Method void Canvas.translate(float, float)>
			if(flag && !mHasMirroring)
		//*  46   82:iload_2         
		//*  47   83:ifeq            108
		//*  48   86:aload_0         
		//*  49   87:getfield        #33  <Field boolean mHasMirroring>
		//*  50   90:ifne            108
			{
				canvas.translate(j, 0.0F);
		//   51   93:aload_1         
		//   52   94:iload           4
		//   53   96:i2f             
		//   54   97:fconst_0        
		//   55   98:invokevirtual   #86  <Method void Canvas.translate(float, float)>
				canvas.scale(-1F, 1.0F);
		//   56  101:aload_1         
		//   57  102:ldc1            #87  <Float -1F>
		//   58  104:fconst_1        
		//   59  105:invokevirtual   #90  <Method void Canvas.scale(float, float)>
			}
			super.draw(canvas);
		//   60  108:aload_0         
		//   61  109:aload_1         
		//   62  110:invokespecial   #92  <Method void InsetDrawable.draw(Canvas)>
			canvas.restore();
		//   63  113:aload_1         
		//   64  114:invokevirtual   #95  <Method void Canvas.restore()>
		//   65  117:return          
		}

		public float getPosition()
		{
			return mPosition;
		//    0    0:aload_0         
		//    1    1:getfield        #82  <Field float mPosition>
		//    2    4:freturn         
		}

		public void setOffset(float f)
		{
			mOffset = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #80  <Field float mOffset>
			invalidateSelf();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #102 <Method void invalidateSelf()>
		//    5    9:return          
		}

		public void setPosition(float f)
		{
			mPosition = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #82  <Field float mPosition>
			invalidateSelf();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #102 <Method void invalidateSelf()>
		//    5    9:return          
		}

		private final boolean mHasMirroring;
		private float mOffset;
		private float mPosition;
		private final Rect mTmpRect = new Rect();
		final ActionBarDrawerToggle this$0;

		SlideDrawable(Drawable drawable)
		{
			this$0 = ActionBarDrawerToggle.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #22  <Field ActionBarDrawerToggle this$0>
			super(drawable, 0);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:iconst_0        
		//    6    8:invokespecial   #25  <Method void InsetDrawable(Drawable, int)>
			boolean flag;
			if(android.os.Build.VERSION.SDK_INT > 18)
		//*   7   11:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
		//*   8   14:bipush          18
		//*   9   16:icmple          24
				flag = true;
		//   10   19:iconst_1        
		//   11   20:istore_3        
			else
		//*  12   21:goto            26
				flag = false;
		//   13   24:iconst_0        
		//   14   25:istore_3        
			mHasMirroring = flag;
		//   15   26:aload_0         
		//   16   27:iload_3         
		//   17   28:putfield        #33  <Field boolean mHasMirroring>
		//   18   31:aload_0         
		//   19   32:new             #35  <Class Rect>
		//   20   35:dup             
		//   21   36:invokespecial   #38  <Method void Rect()>
		//   22   39:putfield        #40  <Field Rect mTmpRect>
		//   23   42:return          
		}
	}


	public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerlayout, int i, int j, int k)
	{
		boolean flag;
		if(!assumeMaterial(((Context) (activity))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #73  <Method boolean assumeMaterial(Context)>
	//*   2    4:ifne            13
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore          6
		else
	//*   5   10:goto            16
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore          6
		this(activity, drawerlayout, flag, i, j, k);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:iload           6
	//   12   21:iload_3         
	//   13   22:iload           4
	//   14   24:iload           5
	//   15   26:invokespecial   #76  <Method void ActionBarDrawerToggle(Activity, DrawerLayout, boolean, int, int, int)>
	//   16   29:return          
	}

	public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerlayout, boolean flag, int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #78  <Method void Object()>
		mDrawerIndicatorEnabled = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #80  <Field boolean mDrawerIndicatorEnabled>
		mActivity = activity;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #82  <Field Activity mActivity>
		if(activity instanceof DelegateProvider)
	//*   8   14:aload_1         
	//*   9   15:instanceof      #20  <Class ActionBarDrawerToggle$DelegateProvider>
	//*  10   18:ifeq            37
			mActivityImpl = ((DelegateProvider)activity).getDrawerToggleDelegate();
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:checkcast       #20  <Class ActionBarDrawerToggle$DelegateProvider>
	//   14   26:invokeinterface #86  <Method ActionBarDrawerToggle$Delegate ActionBarDrawerToggle$DelegateProvider.getDrawerToggleDelegate()>
	//   15   31:putfield        #88  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
		else
	//*  16   34:goto            42
			mActivityImpl = null;
	//   17   37:aload_0         
	//   18   38:aconst_null     
	//   19   39:putfield        #88  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
		mDrawerLayout = drawerlayout;
	//   20   42:aload_0         
	//   21   43:aload_2         
	//   22   44:putfield        #90  <Field DrawerLayout mDrawerLayout>
		mDrawerImageResource = i;
	//   23   47:aload_0         
	//   24   48:iload           4
	//   25   50:putfield        #92  <Field int mDrawerImageResource>
		mOpenDrawerContentDescRes = j;
	//   26   53:aload_0         
	//   27   54:iload           5
	//   28   56:putfield        #94  <Field int mOpenDrawerContentDescRes>
		mCloseDrawerContentDescRes = k;
	//   29   59:aload_0         
	//   30   60:iload           6
	//   31   62:putfield        #96  <Field int mCloseDrawerContentDescRes>
		mHomeAsUpIndicator = getThemeUpIndicator();
	//   32   65:aload_0         
	//   33   66:aload_0         
	//   34   67:invokevirtual   #100 <Method Drawable getThemeUpIndicator()>
	//   35   70:putfield        #102 <Field Drawable mHomeAsUpIndicator>
		mDrawerImage = ContextCompat.getDrawable(((Context) (activity)), i);
	//   36   73:aload_0         
	//   37   74:aload_1         
	//   38   75:iload           4
	//   39   77:invokestatic    #108 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//   40   80:putfield        #110 <Field Drawable mDrawerImage>
		mSlider = new SlideDrawable(mDrawerImage);
	//   41   83:aload_0         
	//   42   84:new             #23  <Class ActionBarDrawerToggle$SlideDrawable>
	//   43   87:dup             
	//   44   88:aload_0         
	//   45   89:aload_0         
	//   46   90:getfield        #110 <Field Drawable mDrawerImage>
	//   47   93:invokespecial   #113 <Method void ActionBarDrawerToggle$SlideDrawable(ActionBarDrawerToggle, Drawable)>
	//   48   96:putfield        #115 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
		activity = ((Activity) (mSlider));
	//   49   99:aload_0         
	//   50  100:getfield        #115 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
	//   51  103:astore_1        
		float f;
		if(flag)
	//*  52  104:iload_3         
	//*  53  105:ifeq            115
			f = 0.3333333F;
	//   54  108:ldc1            #33  <Float 0.3333333F>
	//   55  110:fstore          7
		else
	//*  56  112:goto            118
			f = 0.0F;
	//   57  115:fconst_0        
	//   58  116:fstore          7
		((SlideDrawable) (activity)).setOffset(f);
	//   59  118:aload_1         
	//   60  119:fload           7
	//   61  121:invokevirtual   #119 <Method void ActionBarDrawerToggle$SlideDrawable.setOffset(float)>
	//   62  124:return          
	}

	private static boolean assumeMaterial(Context context)
	{
		return context.getApplicationInfo().targetSdkVersion >= 21 && android.os.Build.VERSION.SDK_INT >= 21;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #125 <Method ApplicationInfo Context.getApplicationInfo()>
	//    2    4:getfield        #130 <Field int ApplicationInfo.targetSdkVersion>
	//    3    7:bipush          21
	//    4    9:icmplt          22
	//    5   12:getstatic       #59  <Field int android.os.Build$VERSION.SDK_INT>
	//    6   15:bipush          21
	//    7   17:icmplt          22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	Drawable getThemeUpIndicator()
	{
		if(mActivityImpl != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
	//*   2    4:ifnull          17
			return mActivityImpl.getThemeUpIndicator();
	//    3    7:aload_0         
	//    4    8:getfield        #88  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
	//    5   11:invokeinterface #131 <Method Drawable ActionBarDrawerToggle$Delegate.getThemeUpIndicator()>
	//    6   16:areturn         
		else
			return IMPL.getThemeUpIndicator(mActivity);
	//    7   17:getstatic       #64  <Field ActionBarDrawerToggle$ActionBarDrawerToggleImpl IMPL>
	//    8   20:aload_0         
	//    9   21:getfield        #82  <Field Activity mActivity>
	//   10   24:invokeinterface #134 <Method Drawable ActionBarDrawerToggle$ActionBarDrawerToggleImpl.getThemeUpIndicator(Activity)>
	//   11   29:areturn         
	}

	public boolean isDrawerIndicatorEnabled()
	{
		return mDrawerIndicatorEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field boolean mDrawerIndicatorEnabled>
	//    2    4:ireturn         
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		if(!mHasCustomUpIndicator)
	//*   0    0:aload_0         
	//*   1    1:getfield        #140 <Field boolean mHasCustomUpIndicator>
	//*   2    4:ifne            15
			mHomeAsUpIndicator = getThemeUpIndicator();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #100 <Method Drawable getThemeUpIndicator()>
	//    6   12:putfield        #102 <Field Drawable mHomeAsUpIndicator>
		mDrawerImage = ContextCompat.getDrawable(((Context) (mActivity)), mDrawerImageResource);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #82  <Field Activity mActivity>
	//   10   20:aload_0         
	//   11   21:getfield        #92  <Field int mDrawerImageResource>
	//   12   24:invokestatic    #108 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//   13   27:putfield        #110 <Field Drawable mDrawerImage>
		syncState();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #143 <Method void syncState()>
	//   16   34:return          
	}

	public void onDrawerClosed(View view)
	{
		mSlider.setPosition(0.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
	//    2    4:fconst_0        
	//    3    5:invokevirtual   #148 <Method void ActionBarDrawerToggle$SlideDrawable.setPosition(float)>
		if(mDrawerIndicatorEnabled)
	//*   4    8:aload_0         
	//*   5    9:getfield        #80  <Field boolean mDrawerIndicatorEnabled>
	//*   6   12:ifeq            23
			setActionBarDescription(mOpenDrawerContentDescRes);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #94  <Field int mOpenDrawerContentDescRes>
	//   10   20:invokevirtual   #152 <Method void setActionBarDescription(int)>
	//   11   23:return          
	}

	public void onDrawerOpened(View view)
	{
		mSlider.setPosition(1.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
	//    2    4:fconst_1        
	//    3    5:invokevirtual   #148 <Method void ActionBarDrawerToggle$SlideDrawable.setPosition(float)>
		if(mDrawerIndicatorEnabled)
	//*   4    8:aload_0         
	//*   5    9:getfield        #80  <Field boolean mDrawerIndicatorEnabled>
	//*   6   12:ifeq            23
			setActionBarDescription(mCloseDrawerContentDescRes);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #96  <Field int mCloseDrawerContentDescRes>
	//   10   20:invokevirtual   #152 <Method void setActionBarDescription(int)>
	//   11   23:return          
	}

	public void onDrawerSlide(View view, float f)
	{
		float f1 = mSlider.getPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
	//    2    4:invokevirtual   #159 <Method float ActionBarDrawerToggle$SlideDrawable.getPosition()>
	//    3    7:fstore_3        
		if(f > 0.5F)
	//*   4    8:fload_2         
	//*   5    9:ldc1            #160 <Float 0.5F>
	//*   6   11:fcmpl           
	//*   7   12:ifle            33
			f = Math.max(f1, Math.max(0.0F, f - 0.5F) * 2.0F);
	//    8   15:fload_3         
	//    9   16:fconst_0        
	//   10   17:fload_2         
	//   11   18:ldc1            #160 <Float 0.5F>
	//   12   20:fsub            
	//   13   21:invokestatic    #166 <Method float Math.max(float, float)>
	//   14   24:fconst_2        
	//   15   25:fmul            
	//   16   26:invokestatic    #166 <Method float Math.max(float, float)>
	//   17   29:fstore_2        
		else
	//*  18   30:goto            41
			f = Math.min(f1, 2.0F * f);
	//   19   33:fload_3         
	//   20   34:fconst_2        
	//   21   35:fload_2         
	//   22   36:fmul            
	//   23   37:invokestatic    #169 <Method float Math.min(float, float)>
	//   24   40:fstore_2        
		mSlider.setPosition(f);
	//   25   41:aload_0         
	//   26   42:getfield        #115 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
	//   27   45:fload_2         
	//   28   46:invokevirtual   #148 <Method void ActionBarDrawerToggle$SlideDrawable.setPosition(float)>
	//   29   49:return          
	}

	public void onDrawerStateChanged(int i)
	{
	//    0    0:return          
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		if(menuitem != null && menuitem.getItemId() == 0x102002c && mDrawerIndicatorEnabled)
	//*   0    0:aload_1         
	//*   1    1:ifnull          57
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #178 <Method int MenuItem.getItemId()>
	//*   4   10:ldc1            #28  <Int 0x102002c>
	//*   5   12:icmpne          57
	//*   6   15:aload_0         
	//*   7   16:getfield        #80  <Field boolean mDrawerIndicatorEnabled>
	//*   8   19:ifeq            57
		{
			if(mDrawerLayout.isDrawerVisible(0x800003))
	//*   9   22:aload_0         
	//*  10   23:getfield        #90  <Field DrawerLayout mDrawerLayout>
	//*  11   26:ldc1            #179 <Int 0x800003>
	//*  12   28:invokevirtual   #185 <Method boolean DrawerLayout.isDrawerVisible(int)>
	//*  13   31:ifeq            46
				mDrawerLayout.closeDrawer(0x800003);
	//   14   34:aload_0         
	//   15   35:getfield        #90  <Field DrawerLayout mDrawerLayout>
	//   16   38:ldc1            #179 <Int 0x800003>
	//   17   40:invokevirtual   #188 <Method void DrawerLayout.closeDrawer(int)>
			else
	//*  18   43:goto            55
				mDrawerLayout.openDrawer(0x800003);
	//   19   46:aload_0         
	//   20   47:getfield        #90  <Field DrawerLayout mDrawerLayout>
	//   21   50:ldc1            #179 <Int 0x800003>
	//   22   52:invokevirtual   #191 <Method void DrawerLayout.openDrawer(int)>
			return true;
	//   23   55:iconst_1        
	//   24   56:ireturn         
		} else
		{
			return false;
	//   25   57:iconst_0        
	//   26   58:ireturn         
		}
	}

	void setActionBarDescription(int i)
	{
		if(mActivityImpl != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
	//*   2    4:ifnull          18
		{
			mActivityImpl.setActionBarDescription(i);
	//    3    7:aload_0         
	//    4    8:getfield        #88  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
	//    5   11:iload_1         
	//    6   12:invokeinterface #192 <Method void ActionBarDrawerToggle$Delegate.setActionBarDescription(int)>
			return;
	//    7   17:return          
		} else
		{
			mSetIndicatorInfo = IMPL.setActionBarDescription(mSetIndicatorInfo, mActivity, i);
	//    8   18:aload_0         
	//    9   19:getstatic       #64  <Field ActionBarDrawerToggle$ActionBarDrawerToggleImpl IMPL>
	//   10   22:aload_0         
	//   11   23:getfield        #194 <Field Object mSetIndicatorInfo>
	//   12   26:aload_0         
	//   13   27:getfield        #82  <Field Activity mActivity>
	//   14   30:iload_1         
	//   15   31:invokeinterface #197 <Method Object ActionBarDrawerToggle$ActionBarDrawerToggleImpl.setActionBarDescription(Object, Activity, int)>
	//   16   36:putfield        #194 <Field Object mSetIndicatorInfo>
			return;
	//   17   39:return          
		}
	}

	void setActionBarUpIndicator(Drawable drawable, int i)
	{
		if(mActivityImpl != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
	//*   2    4:ifnull          19
		{
			mActivityImpl.setActionBarUpIndicator(drawable, i);
	//    3    7:aload_0         
	//    4    8:getfield        #88  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:invokeinterface #201 <Method void ActionBarDrawerToggle$Delegate.setActionBarUpIndicator(Drawable, int)>
			return;
	//    8   18:return          
		} else
		{
			mSetIndicatorInfo = IMPL.setActionBarUpIndicator(mSetIndicatorInfo, mActivity, drawable, i);
	//    9   19:aload_0         
	//   10   20:getstatic       #64  <Field ActionBarDrawerToggle$ActionBarDrawerToggleImpl IMPL>
	//   11   23:aload_0         
	//   12   24:getfield        #194 <Field Object mSetIndicatorInfo>
	//   13   27:aload_0         
	//   14   28:getfield        #82  <Field Activity mActivity>
	//   15   31:aload_1         
	//   16   32:iload_2         
	//   17   33:invokeinterface #204 <Method Object ActionBarDrawerToggle$ActionBarDrawerToggleImpl.setActionBarUpIndicator(Object, Activity, Drawable, int)>
	//   18   38:putfield        #194 <Field Object mSetIndicatorInfo>
			return;
	//   19   41:return          
		}
	}

	public void setDrawerIndicatorEnabled(boolean flag)
	{
		if(flag != mDrawerIndicatorEnabled)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #80  <Field boolean mDrawerIndicatorEnabled>
	//*   3    5:icmpeq          65
		{
			if(flag)
	//*   4    8:iload_1         
	//*   5    9:ifeq            51
			{
				SlideDrawable slidedrawable = mSlider;
	//    6   12:aload_0         
	//    7   13:getfield        #115 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
	//    8   16:astore_3        
				int i;
				if(mDrawerLayout.isDrawerOpen(0x800003))
	//*   9   17:aload_0         
	//*  10   18:getfield        #90  <Field DrawerLayout mDrawerLayout>
	//*  11   21:ldc1            #179 <Int 0x800003>
	//*  12   23:invokevirtual   #209 <Method boolean DrawerLayout.isDrawerOpen(int)>
	//*  13   26:ifeq            37
					i = mCloseDrawerContentDescRes;
	//   14   29:aload_0         
	//   15   30:getfield        #96  <Field int mCloseDrawerContentDescRes>
	//   16   33:istore_2        
				else
	//*  17   34:goto            42
					i = mOpenDrawerContentDescRes;
	//   18   37:aload_0         
	//   19   38:getfield        #94  <Field int mOpenDrawerContentDescRes>
	//   20   41:istore_2        
				setActionBarUpIndicator(((Drawable) (slidedrawable)), i);
	//   21   42:aload_0         
	//   22   43:aload_3         
	//   23   44:iload_2         
	//   24   45:invokevirtual   #210 <Method void setActionBarUpIndicator(Drawable, int)>
			} else
	//*  25   48:goto            60
			{
				setActionBarUpIndicator(mHomeAsUpIndicator, 0);
	//   26   51:aload_0         
	//   27   52:aload_0         
	//   28   53:getfield        #102 <Field Drawable mHomeAsUpIndicator>
	//   29   56:iconst_0        
	//   30   57:invokevirtual   #210 <Method void setActionBarUpIndicator(Drawable, int)>
			}
			mDrawerIndicatorEnabled = flag;
	//   31   60:aload_0         
	//   32   61:iload_1         
	//   33   62:putfield        #80  <Field boolean mDrawerIndicatorEnabled>
		}
	//   34   65:return          
	}

	public void setHomeAsUpIndicator(int i)
	{
		Drawable drawable = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(i != 0)
	//*   2    2:iload_1         
	//*   3    3:ifeq            15
			drawable = ContextCompat.getDrawable(((Context) (mActivity)), i);
	//    4    6:aload_0         
	//    5    7:getfield        #82  <Field Activity mActivity>
	//    6   10:iload_1         
	//    7   11:invokestatic    #108 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    8   14:astore_2        
		setHomeAsUpIndicator(drawable);
	//    9   15:aload_0         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #214 <Method void setHomeAsUpIndicator(Drawable)>
	//   12   20:return          
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
	//    4    6:invokevirtual   #100 <Method Drawable getThemeUpIndicator()>
	//    5    9:putfield        #102 <Field Drawable mHomeAsUpIndicator>
			mHasCustomUpIndicator = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #140 <Field boolean mHasCustomUpIndicator>
		} else
	//*   9   17:goto            30
		{
			mHomeAsUpIndicator = drawable;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #102 <Field Drawable mHomeAsUpIndicator>
			mHasCustomUpIndicator = true;
	//   13   25:aload_0         
	//   14   26:iconst_1        
	//   15   27:putfield        #140 <Field boolean mHasCustomUpIndicator>
		}
		if(!mDrawerIndicatorEnabled)
	//*  16   30:aload_0         
	//*  17   31:getfield        #80  <Field boolean mDrawerIndicatorEnabled>
	//*  18   34:ifne            46
			setActionBarUpIndicator(mHomeAsUpIndicator, 0);
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #102 <Field Drawable mHomeAsUpIndicator>
	//   22   42:iconst_0        
	//   23   43:invokevirtual   #210 <Method void setActionBarUpIndicator(Drawable, int)>
	//   24   46:return          
	}

	public void syncState()
	{
		if(mDrawerLayout.isDrawerOpen(0x800003))
	//*   0    0:aload_0         
	//*   1    1:getfield        #90  <Field DrawerLayout mDrawerLayout>
	//*   2    4:ldc1            #179 <Int 0x800003>
	//*   3    6:invokevirtual   #209 <Method boolean DrawerLayout.isDrawerOpen(int)>
	//*   4    9:ifeq            23
			mSlider.setPosition(1.0F);
	//    5   12:aload_0         
	//    6   13:getfield        #115 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
	//    7   16:fconst_1        
	//    8   17:invokevirtual   #148 <Method void ActionBarDrawerToggle$SlideDrawable.setPosition(float)>
		else
	//*   9   20:goto            31
			mSlider.setPosition(0.0F);
	//   10   23:aload_0         
	//   11   24:getfield        #115 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
	//   12   27:fconst_0        
	//   13   28:invokevirtual   #148 <Method void ActionBarDrawerToggle$SlideDrawable.setPosition(float)>
		if(mDrawerIndicatorEnabled)
	//*  14   31:aload_0         
	//*  15   32:getfield        #80  <Field boolean mDrawerIndicatorEnabled>
	//*  16   35:ifeq            74
		{
			SlideDrawable slidedrawable = mSlider;
	//   17   38:aload_0         
	//   18   39:getfield        #115 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
	//   19   42:astore_2        
			int i;
			if(mDrawerLayout.isDrawerOpen(0x800003))
	//*  20   43:aload_0         
	//*  21   44:getfield        #90  <Field DrawerLayout mDrawerLayout>
	//*  22   47:ldc1            #179 <Int 0x800003>
	//*  23   49:invokevirtual   #209 <Method boolean DrawerLayout.isDrawerOpen(int)>
	//*  24   52:ifeq            63
				i = mCloseDrawerContentDescRes;
	//   25   55:aload_0         
	//   26   56:getfield        #96  <Field int mCloseDrawerContentDescRes>
	//   27   59:istore_1        
			else
	//*  28   60:goto            68
				i = mOpenDrawerContentDescRes;
	//   29   63:aload_0         
	//   30   64:getfield        #94  <Field int mOpenDrawerContentDescRes>
	//   31   67:istore_1        
			setActionBarUpIndicator(((Drawable) (slidedrawable)), i);
	//   32   68:aload_0         
	//   33   69:aload_2         
	//   34   70:iload_1         
	//   35   71:invokevirtual   #210 <Method void setActionBarUpIndicator(Drawable, int)>
		}
	//   36   74:return          
	}

	private static final int ID_HOME = 0x102002c;
	private static final ActionBarDrawerToggleImpl IMPL;
	private static final float TOGGLE_DRAWABLE_OFFSET = 0.3333333F;
	final Activity mActivity;
	private final Delegate mActivityImpl;
	private final int mCloseDrawerContentDescRes;
	private Drawable mDrawerImage;
	private final int mDrawerImageResource;
	private boolean mDrawerIndicatorEnabled;
	private final DrawerLayout mDrawerLayout;
	private boolean mHasCustomUpIndicator;
	private Drawable mHomeAsUpIndicator;
	private final int mOpenDrawerContentDescRes;
	private Object mSetIndicatorInfo;
	private SlideDrawable mSlider;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #59  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          19
			IMPL = ((ActionBarDrawerToggleImpl) (new ActionBarDrawerToggleImplJellybeanMR2()));
	//    3    8:new             #14  <Class ActionBarDrawerToggle$ActionBarDrawerToggleImplJellybeanMR2>
	//    4   11:dup             
	//    5   12:invokespecial   #62  <Method void ActionBarDrawerToggle$ActionBarDrawerToggleImplJellybeanMR2()>
	//    6   15:putstatic       #64  <Field ActionBarDrawerToggle$ActionBarDrawerToggleImpl IMPL>
	//    7   18:return          
		else
			IMPL = ((ActionBarDrawerToggleImpl) (new ActionBarDrawerToggleImplIcs()));
	//    8   19:new             #11  <Class ActionBarDrawerToggle$ActionBarDrawerToggleImplIcs>
	//    9   22:dup             
	//   10   23:invokespecial   #65  <Method void ActionBarDrawerToggle$ActionBarDrawerToggleImplIcs()>
	//   11   26:putstatic       #64  <Field ActionBarDrawerToggle$ActionBarDrawerToggleImpl IMPL>
	//*  12   29:return          
	}
}
