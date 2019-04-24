// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.support.v4.content.a;
import android.support.v4.view.s;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.*;
import android.widget.ImageView;
import java.lang.reflect.Method;

public class ActionBarDrawerToggle
	implements android.support.v4.widget.DrawerLayout.c
{
	public static interface Delegate
	{

		public abstract Drawable getThemeUpIndicator();

		public abstract void setActionBarDescription(int i);

		public abstract void setActionBarUpIndicator(Drawable drawable, int i);
	}

	public static interface DelegateProvider
	{

		public abstract Delegate getDrawerToggleDelegate();
	}

	private static class SetIndicatorInfo
	{

		Method mSetHomeActionContentDescription;
		Method mSetHomeAsUpIndicator;
		ImageView mUpIndicatorView;

		SetIndicatorInfo(Activity activity)
		{
			NoSuchMethodException nosuchmethodexception;
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			try
			{
				mSetHomeAsUpIndicator = ((Class) (android/app/ActionBar)).getDeclaredMethod("setHomeAsUpIndicator", new Class[] {
					android/graphics/drawable/Drawable
				});
		//    2    4:aload_0         
		//    3    5:ldc1            #21  <Class ActionBar>
		//    4    7:ldc1            #23  <String "setHomeAsUpIndicator">
		//    5    9:iconst_1        
		//    6   10:anewarray       Class[]
		//    7   13:dup             
		//    8   14:iconst_0        
		//    9   15:ldc1            #27  <Class Drawable>
		//   10   17:aastore         
		//   11   18:invokevirtual   #31  <Method Method Class.getDeclaredMethod(String, Class[])>
		//   12   21:putfield        #33  <Field Method mSetHomeAsUpIndicator>
				mSetHomeActionContentDescription = ((Class) (android/app/ActionBar)).getDeclaredMethod("setHomeActionContentDescription", new Class[] {
					Integer.TYPE
				});
		//   13   24:aload_0         
		//   14   25:ldc1            #21  <Class ActionBar>
		//   15   27:ldc1            #35  <String "setHomeActionContentDescription">
		//   16   29:iconst_1        
		//   17   30:anewarray       Class[]
		//   18   33:dup             
		//   19   34:iconst_0        
		//   20   35:getstatic       #41  <Field Class Integer.TYPE>
		//   21   38:aastore         
		//   22   39:invokevirtual   #31  <Method Method Class.getDeclaredMethod(String, Class[])>
		//   23   42:putfield        #43  <Field Method mSetHomeActionContentDescription>
				return;
		//   24   45:return          
			}
		//*  25   46:aload_1         
		//*  26   47:ldc1            #44  <Int 0x102002c>
		//*  27   49:invokevirtual   #50  <Method View Activity.findViewById(int)>
		//*  28   52:astore_1        
		//*  29   53:aload_1         
		//*  30   54:ifnonnull       58
		//*  31   57:return          
		//*  32   58:aload_1         
		//*  33   59:invokevirtual   #56  <Method android.view.ViewParent View.getParent()>
		//*  34   62:checkcast       #58  <Class ViewGroup>
		//*  35   65:astore_2        
		//*  36   66:aload_2         
		//*  37   67:invokevirtual   #62  <Method int ViewGroup.getChildCount()>
		//*  38   70:iconst_2        
		//*  39   71:icmpeq          75
		//*  40   74:return          
		//*  41   75:aload_2         
		//*  42   76:iconst_0        
		//*  43   77:invokevirtual   #65  <Method View ViewGroup.getChildAt(int)>
		//*  44   80:astore_1        
		//*  45   81:aload_2         
		//*  46   82:iconst_1        
		//*  47   83:invokevirtual   #65  <Method View ViewGroup.getChildAt(int)>
		//*  48   86:astore_2        
		//*  49   87:aload_1         
		//*  50   88:invokevirtual   #68  <Method int View.getId()>
		//*  51   91:ldc1            #44  <Int 0x102002c>
		//*  52   93:icmpne          101
		//*  53   96:aload_2         
		//*  54   97:astore_1        
		//*  55   98:goto            101
		//*  56  101:aload_1         
		//*  57  102:instanceof      #70  <Class ImageView>
		//*  58  105:ifeq            116
		//*  59  108:aload_0         
		//*  60  109:aload_1         
		//*  61  110:checkcast       #70  <Class ImageView>
		//*  62  113:putfield        #72  <Field ImageView mUpIndicatorView>
		//*  63  116:return          
			// Misplaced declaration of an exception variable
			catch(NoSuchMethodException nosuchmethodexception)
			{
				activity = ((Activity) (activity.findViewById(0x102002c)));
			}
			if(activity == null)
				return;
			Object obj = ((Object) ((ViewGroup)((View) (activity)).getParent()));
			if(((ViewGroup) (obj)).getChildCount() != 2)
				return;
			activity = ((Activity) (((ViewGroup) (obj)).getChildAt(0)));
			obj = ((Object) (((ViewGroup) (obj)).getChildAt(1)));
			if(((View) (activity)).getId() == 0x102002c)
				activity = ((Activity) (obj));
			if(activity instanceof ImageView)
				mUpIndicatorView = (ImageView)activity;
		//*  64  117:astore_2        
		//*  65  118:goto            46
		}
	}

	private class SlideDrawable extends InsetDrawable
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
			int i = s.e(mActivity.getWindow().getDecorView());
		//    7   13:aload_0         
		//    8   14:getfield        #22  <Field ActionBarDrawerToggle this$0>
		//    9   17:getfield        #57  <Field Activity ActionBarDrawerToggle.mActivity>
		//   10   20:invokevirtual   #63  <Method Window Activity.getWindow()>
		//   11   23:invokevirtual   #69  <Method View Window.getDecorView()>
		//   12   26:invokestatic    #75  <Method int s.e(View)>
		//   13   29:istore          4
			int j = 1;
		//   14   31:iconst_1        
		//   15   32:istore          5
			boolean flag;
			if(i == 1)
		//*  16   34:iload           4
		//*  17   36:iconst_1        
		//*  18   37:icmpne          46
				flag = true;
		//   19   40:iconst_1        
		//   20   41:istore          4
			else
		//*  21   43:goto            49
				flag = false;
		//   22   46:iconst_0        
		//   23   47:istore          4
			if(flag)
		//*  24   49:iload           4
		//*  25   51:ifeq            57
				j = -1;
		//   26   54:iconst_m1       
		//   27   55:istore          5
			int k = mTmpRect.width();
		//   28   57:aload_0         
		//   29   58:getfield        #40  <Field Rect mTmpRect>
		//   30   61:invokevirtual   #78  <Method int Rect.width()>
		//   31   64:istore          6
			float f = -mOffset;
		//   32   66:aload_0         
		//   33   67:getfield        #80  <Field float mOffset>
		//   34   70:fneg            
		//   35   71:fstore_2        
			float f1 = k;
		//   36   72:iload           6
		//   37   74:i2f             
		//   38   75:fstore_3        
			canvas.translate(f * f1 * mPosition * (float)j, 0.0F);
		//   39   76:aload_1         
		//   40   77:fload_2         
		//   41   78:fload_3         
		//   42   79:fmul            
		//   43   80:aload_0         
		//   44   81:getfield        #82  <Field float mPosition>
		//   45   84:fmul            
		//   46   85:iload           5
		//   47   87:i2f             
		//   48   88:fmul            
		//   49   89:fconst_0        
		//   50   90:invokevirtual   #86  <Method void Canvas.translate(float, float)>
			if(flag && !mHasMirroring)
		//*  51   93:iload           4
		//*  52   95:ifeq            118
		//*  53   98:aload_0         
		//*  54   99:getfield        #33  <Field boolean mHasMirroring>
		//*  55  102:ifne            118
			{
				canvas.translate(f1, 0.0F);
		//   56  105:aload_1         
		//   57  106:fload_3         
		//   58  107:fconst_0        
		//   59  108:invokevirtual   #86  <Method void Canvas.translate(float, float)>
				canvas.scale(-1F, 1.0F);
		//   60  111:aload_1         
		//   61  112:ldc1            #87  <Float -1F>
		//   62  114:fconst_1        
		//   63  115:invokevirtual   #90  <Method void Canvas.scale(float, float)>
			}
			super.draw(canvas);
		//   64  118:aload_0         
		//   65  119:aload_1         
		//   66  120:invokespecial   #92  <Method void InsetDrawable.draw(Canvas)>
			canvas.restore();
		//   67  123:aload_1         
		//   68  124:invokevirtual   #95  <Method void Canvas.restore()>
		//   69  127:return          
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
			boolean flag = false;
		//    3    5:iconst_0        
		//    4    6:istore_3        
			super(drawable, 0);
		//    5    7:aload_0         
		//    6    8:aload_2         
		//    7    9:iconst_0        
		//    8   10:invokespecial   #25  <Method void InsetDrawable(Drawable, int)>
			if(android.os.Build.VERSION.SDK_INT > 18)
		//*   9   13:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
		//*  10   16:bipush          18
		//*  11   18:icmple          23
				flag = true;
		//   12   21:iconst_1        
		//   13   22:istore_3        
			mHasMirroring = flag;
		//   14   23:aload_0         
		//   15   24:iload_3         
		//   16   25:putfield        #33  <Field boolean mHasMirroring>
		//   17   28:aload_0         
		//   18   29:new             #35  <Class Rect>
		//   19   32:dup             
		//   20   33:invokespecial   #38  <Method void Rect()>
		//   21   36:putfield        #40  <Field Rect mTmpRect>
		//   22   39:return          
		}
	}


	public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerlayout, int i, int j, int k)
	{
		this(activity, drawerlayout, assumeMaterial(((Context) (activity))) ^ true, i, j, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:invokestatic    #62  <Method boolean assumeMaterial(Context)>
	//    5    7:iconst_1        
	//    6    8:ixor            
	//    7    9:iload_3         
	//    8   10:iload           4
	//    9   12:iload           5
	//   10   14:invokespecial   #65  <Method void ActionBarDrawerToggle(Activity, DrawerLayout, boolean, int, int, int)>
	//   11   17:return          
	}

	public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerlayout, boolean flag, int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void Object()>
		mDrawerIndicatorEnabled = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #69  <Field boolean mDrawerIndicatorEnabled>
		mActivity = activity;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #71  <Field Activity mActivity>
		Delegate delegate1;
		if(activity instanceof DelegateProvider)
	//*   8   14:aload_1         
	//*   9   15:instanceof      #11  <Class ActionBarDrawerToggle$DelegateProvider>
	//*  10   18:ifeq            41
			delegate1 = ((DelegateProvider)activity).getDrawerToggleDelegate();
	//   11   21:aload_1         
	//   12   22:checkcast       #11  <Class ActionBarDrawerToggle$DelegateProvider>
	//   13   25:invokeinterface #75  <Method ActionBarDrawerToggle$Delegate ActionBarDrawerToggle$DelegateProvider.getDrawerToggleDelegate()>
	//   14   30:astore          8
		else
	//*  15   32:aload_0         
	//*  16   33:aload           8
	//*  17   35:putfield        #77  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
	//*  18   38:goto            47
			delegate1 = null;
	//   19   41:aconst_null     
	//   20   42:astore          8
		mActivityImpl = delegate1;
	//*  21   44:goto            32
		mDrawerLayout = drawerlayout;
	//   22   47:aload_0         
	//   23   48:aload_2         
	//   24   49:putfield        #79  <Field DrawerLayout mDrawerLayout>
		mDrawerImageResource = i;
	//   25   52:aload_0         
	//   26   53:iload           4
	//   27   55:putfield        #81  <Field int mDrawerImageResource>
		mOpenDrawerContentDescRes = j;
	//   28   58:aload_0         
	//   29   59:iload           5
	//   30   61:putfield        #83  <Field int mOpenDrawerContentDescRes>
		mCloseDrawerContentDescRes = k;
	//   31   64:aload_0         
	//   32   65:iload           6
	//   33   67:putfield        #85  <Field int mCloseDrawerContentDescRes>
		mHomeAsUpIndicator = getThemeUpIndicator();
	//   34   70:aload_0         
	//   35   71:aload_0         
	//   36   72:invokespecial   #89  <Method Drawable getThemeUpIndicator()>
	//   37   75:putfield        #91  <Field Drawable mHomeAsUpIndicator>
		mDrawerImage = a.getDrawable(((Context) (activity)), i);
	//   38   78:aload_0         
	//   39   79:aload_1         
	//   40   80:iload           4
	//   41   82:invokestatic    #97  <Method Drawable a.getDrawable(Context, int)>
	//   42   85:putfield        #99  <Field Drawable mDrawerImage>
		mSlider = new SlideDrawable(mDrawerImage);
	//   43   88:aload_0         
	//   44   89:new             #17  <Class ActionBarDrawerToggle$SlideDrawable>
	//   45   92:dup             
	//   46   93:aload_0         
	//   47   94:aload_0         
	//   48   95:getfield        #99  <Field Drawable mDrawerImage>
	//   49   98:invokespecial   #102 <Method void ActionBarDrawerToggle$SlideDrawable(ActionBarDrawerToggle, Drawable)>
	//   50  101:putfield        #104 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
		activity = ((Activity) (mSlider));
	//   51  104:aload_0         
	//   52  105:getfield        #104 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
	//   53  108:astore_1        
		float f;
		if(flag)
	//*  54  109:iload_3         
	//*  55  110:ifeq            120
			f = 0.3333333F;
	//   56  113:ldc1            #31  <Float 0.3333333F>
	//   57  115:fstore          7
		else
	//*  58  117:goto            123
			f = 0.0F;
	//   59  120:fconst_0        
	//   60  121:fstore          7
		((SlideDrawable) (activity)).setOffset(f);
	//   61  123:aload_1         
	//   62  124:fload           7
	//   63  126:invokevirtual   #108 <Method void ActionBarDrawerToggle$SlideDrawable.setOffset(float)>
	//   64  129:return          
	}

	private static boolean assumeMaterial(Context context)
	{
		return context.getApplicationInfo().targetSdkVersion >= 21 && android.os.Build.VERSION.SDK_INT >= 21;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #114 <Method ApplicationInfo Context.getApplicationInfo()>
	//    2    4:getfield        #119 <Field int ApplicationInfo.targetSdkVersion>
	//    3    7:bipush          21
	//    4    9:icmplt          22
	//    5   12:getstatic       #124 <Field int android.os.Build$VERSION.SDK_INT>
	//    6   15:bipush          21
	//    7   17:icmplt          22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	private Drawable getThemeUpIndicator()
	{
		if(mActivityImpl != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
	//*   2    4:ifnull          17
			return mActivityImpl.getThemeUpIndicator();
	//    3    7:aload_0         
	//    4    8:getfield        #77  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
	//    5   11:invokeinterface #125 <Method Drawable ActionBarDrawerToggle$Delegate.getThemeUpIndicator()>
	//    6   16:areturn         
		Object obj;
		Drawable drawable;
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   7   17:getstatic       #124 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   20:bipush          18
	//*   9   22:icmplt          74
		{
			obj = ((Object) (mActivity.getActionBar()));
	//   10   25:aload_0         
	//   11   26:getfield        #71  <Field Activity mActivity>
	//   12   29:invokevirtual   #131 <Method ActionBar Activity.getActionBar()>
	//   13   32:astore_1        
			if(obj != null)
	//*  14   33:aload_1         
	//*  15   34:ifnull          45
				obj = ((Object) (((ActionBar) (obj)).getThemedContext()));
	//   16   37:aload_1         
	//   17   38:invokevirtual   #137 <Method Context ActionBar.getThemedContext()>
	//   18   41:astore_1        
			else
	//*  19   42:goto            50
				obj = ((Object) (mActivity));
	//   20   45:aload_0         
	//   21   46:getfield        #71  <Field Activity mActivity>
	//   22   49:astore_1        
			obj = ((Object) (((Context) (obj)).obtainStyledAttributes(((android.util.AttributeSet) (null)), THEME_ATTRS, 0x10102ce, 0)));
	//   23   50:aload_1         
	//   24   51:aconst_null     
	//   25   52:getstatic       #55  <Field int[] THEME_ATTRS>
	//   26   55:ldc1            #138 <Int 0x10102ce>
	//   27   57:iconst_0        
	//   28   58:invokevirtual   #142 <Method TypedArray Context.obtainStyledAttributes(android.util.AttributeSet, int[], int, int)>
	//   29   61:astore_1        
		} else
	//*  30   62:aload_1         
	//*  31   63:iconst_0        
	//*  32   64:invokevirtual   #147 <Method Drawable TypedArray.getDrawable(int)>
	//*  33   67:astore_2        
	//*  34   68:aload_1         
	//*  35   69:invokevirtual   #150 <Method void TypedArray.recycle()>
	//*  36   72:aload_2         
	//*  37   73:areturn         
		{
			obj = ((Object) (mActivity.obtainStyledAttributes(THEME_ATTRS)));
	//   38   74:aload_0         
	//   39   75:getfield        #71  <Field Activity mActivity>
	//   40   78:getstatic       #55  <Field int[] THEME_ATTRS>
	//   41   81:invokevirtual   #153 <Method TypedArray Activity.obtainStyledAttributes(int[])>
	//   42   84:astore_1        
		}
		drawable = ((TypedArray) (obj)).getDrawable(0);
		((TypedArray) (obj)).recycle();
		return drawable;
	//*  43   85:goto            62
	}

	private void setActionBarDescription(int i)
	{
		if(mActivityImpl != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
	//*   2    4:ifnull          18
		{
			mActivityImpl.setActionBarDescription(i);
	//    3    7:aload_0         
	//    4    8:getfield        #77  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
	//    5   11:iload_1         
	//    6   12:invokeinterface #159 <Method void ActionBarDrawerToggle$Delegate.setActionBarDescription(int)>
			return;
	//    7   17:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   8   18:getstatic       #124 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   21:bipush          18
	//*  10   23:icmplt          44
		{
			ActionBar actionbar = mActivity.getActionBar();
	//   11   26:aload_0         
	//   12   27:getfield        #71  <Field Activity mActivity>
	//   13   30:invokevirtual   #131 <Method ActionBar Activity.getActionBar()>
	//   14   33:astore_2        
			if(actionbar != null)
	//*  15   34:aload_2         
	//*  16   35:ifnull          126
			{
				actionbar.setHomeActionContentDescription(i);
	//   17   38:aload_2         
	//   18   39:iload_1         
	//   19   40:invokevirtual   #162 <Method void ActionBar.setHomeActionContentDescription(int)>
				return;
	//   20   43:return          
			}
		} else
		{
			if(mSetIndicatorInfo == null)
	//*  21   44:aload_0         
	//*  22   45:getfield        #164 <Field ActionBarDrawerToggle$SetIndicatorInfo mSetIndicatorInfo>
	//*  23   48:ifnonnull       66
				mSetIndicatorInfo = new SetIndicatorInfo(mActivity);
	//   24   51:aload_0         
	//   25   52:new             #14  <Class ActionBarDrawerToggle$SetIndicatorInfo>
	//   26   55:dup             
	//   27   56:aload_0         
	//   28   57:getfield        #71  <Field Activity mActivity>
	//   29   60:invokespecial   #167 <Method void ActionBarDrawerToggle$SetIndicatorInfo(Activity)>
	//   30   63:putfield        #164 <Field ActionBarDrawerToggle$SetIndicatorInfo mSetIndicatorInfo>
			if(mSetIndicatorInfo.mSetHomeAsUpIndicator != null)
	//*  31   66:aload_0         
	//*  32   67:getfield        #164 <Field ActionBarDrawerToggle$SetIndicatorInfo mSetIndicatorInfo>
	//*  33   70:getfield        #171 <Field Method ActionBarDrawerToggle$SetIndicatorInfo.mSetHomeAsUpIndicator>
	//*  34   73:ifnull          126
				try
				{
					ActionBar actionbar1 = mActivity.getActionBar();
	//   35   76:aload_0         
	//   36   77:getfield        #71  <Field Activity mActivity>
	//   37   80:invokevirtual   #131 <Method ActionBar Activity.getActionBar()>
	//   38   83:astore_2        
					mSetIndicatorInfo.mSetHomeActionContentDescription.invoke(((Object) (actionbar1)), new Object[] {
						Integer.valueOf(i)
					});
	//   39   84:aload_0         
	//   40   85:getfield        #164 <Field ActionBarDrawerToggle$SetIndicatorInfo mSetIndicatorInfo>
	//   41   88:getfield        #174 <Field Method ActionBarDrawerToggle$SetIndicatorInfo.mSetHomeActionContentDescription>
	//   42   91:aload_2         
	//   43   92:iconst_1        
	//   44   93:anewarray       Object[]
	//   45   96:dup             
	//   46   97:iconst_0        
	//   47   98:iload_1         
	//   48   99:invokestatic    #180 <Method Integer Integer.valueOf(int)>
	//   49  102:aastore         
	//   50  103:invokevirtual   #186 <Method Object Method.invoke(Object, Object[])>
	//   51  106:pop             
					actionbar1.setSubtitle(actionbar1.getSubtitle());
	//   52  107:aload_2         
	//   53  108:aload_2         
	//   54  109:invokevirtual   #190 <Method CharSequence ActionBar.getSubtitle()>
	//   55  112:invokevirtual   #194 <Method void ActionBar.setSubtitle(CharSequence)>
					return;
	//   56  115:return          
				}
				catch(Exception exception)
	//*  57  116:astore_2        
				{
					Log.w("ActionBarDrawerToggle", "Couldn't set content description via JB-MR2 API", ((Throwable) (exception)));
	//   58  117:ldc1            #26  <String "ActionBarDrawerToggle">
	//   59  119:ldc1            #196 <String "Couldn't set content description via JB-MR2 API">
	//   60  121:aload_2         
	//   61  122:invokestatic    #202 <Method int Log.w(String, String, Throwable)>
	//   62  125:pop             
				}
		}
	//   63  126:return          
	}

	private void setActionBarUpIndicator(Drawable drawable, int i)
	{
		if(mActivityImpl != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
	//*   2    4:ifnull          19
		{
			mActivityImpl.setActionBarUpIndicator(drawable, i);
	//    3    7:aload_0         
	//    4    8:getfield        #77  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:invokeinterface #206 <Method void ActionBarDrawerToggle$Delegate.setActionBarUpIndicator(Drawable, int)>
			return;
	//    8   18:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   9   19:getstatic       #124 <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   22:bipush          18
	//*  11   24:icmplt          50
		{
			ActionBar actionbar = mActivity.getActionBar();
	//   12   27:aload_0         
	//   13   28:getfield        #71  <Field Activity mActivity>
	//   14   31:invokevirtual   #131 <Method ActionBar Activity.getActionBar()>
	//   15   34:astore_3        
			if(actionbar != null)
	//*  16   35:aload_3         
	//*  17   36:ifnull          175
			{
				actionbar.setHomeAsUpIndicator(drawable);
	//   18   39:aload_3         
	//   19   40:aload_1         
	//   20   41:invokevirtual   #210 <Method void ActionBar.setHomeAsUpIndicator(Drawable)>
				actionbar.setHomeActionContentDescription(i);
	//   21   44:aload_3         
	//   22   45:iload_2         
	//   23   46:invokevirtual   #162 <Method void ActionBar.setHomeActionContentDescription(int)>
				return;
	//   24   49:return          
			}
		} else
		{
			if(mSetIndicatorInfo == null)
	//*  25   50:aload_0         
	//*  26   51:getfield        #164 <Field ActionBarDrawerToggle$SetIndicatorInfo mSetIndicatorInfo>
	//*  27   54:ifnonnull       72
				mSetIndicatorInfo = new SetIndicatorInfo(mActivity);
	//   28   57:aload_0         
	//   29   58:new             #14  <Class ActionBarDrawerToggle$SetIndicatorInfo>
	//   30   61:dup             
	//   31   62:aload_0         
	//   32   63:getfield        #71  <Field Activity mActivity>
	//   33   66:invokespecial   #167 <Method void ActionBarDrawerToggle$SetIndicatorInfo(Activity)>
	//   34   69:putfield        #164 <Field ActionBarDrawerToggle$SetIndicatorInfo mSetIndicatorInfo>
			if(mSetIndicatorInfo.mSetHomeAsUpIndicator != null)
	//*  35   72:aload_0         
	//*  36   73:getfield        #164 <Field ActionBarDrawerToggle$SetIndicatorInfo mSetIndicatorInfo>
	//*  37   76:getfield        #171 <Field Method ActionBarDrawerToggle$SetIndicatorInfo.mSetHomeAsUpIndicator>
	//*  38   79:ifnull          145
			{
				try
				{
					ActionBar actionbar1 = mActivity.getActionBar();
	//   39   82:aload_0         
	//   40   83:getfield        #71  <Field Activity mActivity>
	//   41   86:invokevirtual   #131 <Method ActionBar Activity.getActionBar()>
	//   42   89:astore_3        
					mSetIndicatorInfo.mSetHomeAsUpIndicator.invoke(((Object) (actionbar1)), new Object[] {
						drawable
					});
	//   43   90:aload_0         
	//   44   91:getfield        #164 <Field ActionBarDrawerToggle$SetIndicatorInfo mSetIndicatorInfo>
	//   45   94:getfield        #171 <Field Method ActionBarDrawerToggle$SetIndicatorInfo.mSetHomeAsUpIndicator>
	//   46   97:aload_3         
	//   47   98:iconst_1        
	//   48   99:anewarray       Object[]
	//   49  102:dup             
	//   50  103:iconst_0        
	//   51  104:aload_1         
	//   52  105:aastore         
	//   53  106:invokevirtual   #186 <Method Object Method.invoke(Object, Object[])>
	//   54  109:pop             
					mSetIndicatorInfo.mSetHomeActionContentDescription.invoke(((Object) (actionbar1)), new Object[] {
						Integer.valueOf(i)
					});
	//   55  110:aload_0         
	//   56  111:getfield        #164 <Field ActionBarDrawerToggle$SetIndicatorInfo mSetIndicatorInfo>
	//   57  114:getfield        #174 <Field Method ActionBarDrawerToggle$SetIndicatorInfo.mSetHomeActionContentDescription>
	//   58  117:aload_3         
	//   59  118:iconst_1        
	//   60  119:anewarray       Object[]
	//   61  122:dup             
	//   62  123:iconst_0        
	//   63  124:iload_2         
	//   64  125:invokestatic    #180 <Method Integer Integer.valueOf(int)>
	//   65  128:aastore         
	//   66  129:invokevirtual   #186 <Method Object Method.invoke(Object, Object[])>
	//   67  132:pop             
					return;
	//   68  133:return          
				}
				// Misplaced declaration of an exception variable
				catch(Drawable drawable)
	//*  69  134:astore_1        
				{
					Log.w("ActionBarDrawerToggle", "Couldn't set home-as-up indicator via JB-MR2 API", ((Throwable) (drawable)));
	//   70  135:ldc1            #26  <String "ActionBarDrawerToggle">
	//   71  137:ldc1            #212 <String "Couldn't set home-as-up indicator via JB-MR2 API">
	//   72  139:aload_1         
	//   73  140:invokestatic    #202 <Method int Log.w(String, String, Throwable)>
	//   74  143:pop             
				}
				return;
	//   75  144:return          
			}
			if(mSetIndicatorInfo.mUpIndicatorView != null)
	//*  76  145:aload_0         
	//*  77  146:getfield        #164 <Field ActionBarDrawerToggle$SetIndicatorInfo mSetIndicatorInfo>
	//*  78  149:getfield        #216 <Field ImageView ActionBarDrawerToggle$SetIndicatorInfo.mUpIndicatorView>
	//*  79  152:ifnull          167
			{
				mSetIndicatorInfo.mUpIndicatorView.setImageDrawable(drawable);
	//   80  155:aload_0         
	//   81  156:getfield        #164 <Field ActionBarDrawerToggle$SetIndicatorInfo mSetIndicatorInfo>
	//   82  159:getfield        #216 <Field ImageView ActionBarDrawerToggle$SetIndicatorInfo.mUpIndicatorView>
	//   83  162:aload_1         
	//   84  163:invokevirtual   #221 <Method void ImageView.setImageDrawable(Drawable)>
				return;
	//   85  166:return          
			}
			Log.w("ActionBarDrawerToggle", "Couldn't set home-as-up indicator");
	//   86  167:ldc1            #26  <String "ActionBarDrawerToggle">
	//   87  169:ldc1            #223 <String "Couldn't set home-as-up indicator">
	//   88  171:invokestatic    #226 <Method int Log.w(String, String)>
	//   89  174:pop             
		}
	//   90  175:return          
	}

	public boolean isDrawerIndicatorEnabled()
	{
		return mDrawerIndicatorEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field boolean mDrawerIndicatorEnabled>
	//    2    4:ireturn         
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		if(!mHasCustomUpIndicator)
	//*   0    0:aload_0         
	//*   1    1:getfield        #232 <Field boolean mHasCustomUpIndicator>
	//*   2    4:ifne            15
			mHomeAsUpIndicator = getThemeUpIndicator();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #89  <Method Drawable getThemeUpIndicator()>
	//    6   12:putfield        #91  <Field Drawable mHomeAsUpIndicator>
		mDrawerImage = a.getDrawable(((Context) (mActivity)), mDrawerImageResource);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #71  <Field Activity mActivity>
	//   10   20:aload_0         
	//   11   21:getfield        #81  <Field int mDrawerImageResource>
	//   12   24:invokestatic    #97  <Method Drawable a.getDrawable(Context, int)>
	//   13   27:putfield        #99  <Field Drawable mDrawerImage>
		syncState();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #235 <Method void syncState()>
	//   16   34:return          
	}

	public void onDrawerClosed(View view)
	{
		mSlider.setPosition(0.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
	//    2    4:fconst_0        
	//    3    5:invokevirtual   #240 <Method void ActionBarDrawerToggle$SlideDrawable.setPosition(float)>
		if(mDrawerIndicatorEnabled)
	//*   4    8:aload_0         
	//*   5    9:getfield        #69  <Field boolean mDrawerIndicatorEnabled>
	//*   6   12:ifeq            23
			setActionBarDescription(mOpenDrawerContentDescRes);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #83  <Field int mOpenDrawerContentDescRes>
	//   10   20:invokespecial   #241 <Method void setActionBarDescription(int)>
	//   11   23:return          
	}

	public void onDrawerOpened(View view)
	{
		mSlider.setPosition(1.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
	//    2    4:fconst_1        
	//    3    5:invokevirtual   #240 <Method void ActionBarDrawerToggle$SlideDrawable.setPosition(float)>
		if(mDrawerIndicatorEnabled)
	//*   4    8:aload_0         
	//*   5    9:getfield        #69  <Field boolean mDrawerIndicatorEnabled>
	//*   6   12:ifeq            23
			setActionBarDescription(mCloseDrawerContentDescRes);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #85  <Field int mCloseDrawerContentDescRes>
	//   10   20:invokespecial   #241 <Method void setActionBarDescription(int)>
	//   11   23:return          
	}

	public void onDrawerSlide(View view, float f)
	{
		float f1 = mSlider.getPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
	//    2    4:invokevirtual   #248 <Method float ActionBarDrawerToggle$SlideDrawable.getPosition()>
	//    3    7:fstore_3        
		if(f > 0.5F)
	//*   4    8:fload_2         
	//*   5    9:ldc1            #249 <Float 0.5F>
	//*   6   11:fcmpl           
	//*   7   12:ifle            33
			f = Math.max(f1, Math.max(0.0F, f - 0.5F) * 2.0F);
	//    8   15:fload_3         
	//    9   16:fconst_0        
	//   10   17:fload_2         
	//   11   18:ldc1            #249 <Float 0.5F>
	//   12   20:fsub            
	//   13   21:invokestatic    #255 <Method float Math.max(float, float)>
	//   14   24:fconst_2        
	//   15   25:fmul            
	//   16   26:invokestatic    #255 <Method float Math.max(float, float)>
	//   17   29:fstore_2        
		else
	//*  18   30:goto            41
			f = Math.min(f1, f * 2.0F);
	//   19   33:fload_3         
	//   20   34:fload_2         
	//   21   35:fconst_2        
	//   22   36:fmul            
	//   23   37:invokestatic    #258 <Method float Math.min(float, float)>
	//   24   40:fstore_2        
		mSlider.setPosition(f);
	//   25   41:aload_0         
	//   26   42:getfield        #104 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
	//   27   45:fload_2         
	//   28   46:invokevirtual   #240 <Method void ActionBarDrawerToggle$SlideDrawable.setPosition(float)>
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
	//*   1    1:ifnull          60
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #267 <Method int MenuItem.getItemId()>
	//*   4   10:ldc1            #22  <Int 0x102002c>
	//*   5   12:icmpne          60
	//*   6   15:aload_0         
	//*   7   16:getfield        #69  <Field boolean mDrawerIndicatorEnabled>
	//*   8   19:ifeq            60
		{
			if(mDrawerLayout.h(0x800003))
	//*   9   22:aload_0         
	//*  10   23:getfield        #79  <Field DrawerLayout mDrawerLayout>
	//*  11   26:ldc2            #268 <Int 0x800003>
	//*  12   29:invokevirtual   #274 <Method boolean DrawerLayout.h(int)>
	//*  13   32:ifeq            48
				mDrawerLayout.f(0x800003);
	//   14   35:aload_0         
	//   15   36:getfield        #79  <Field DrawerLayout mDrawerLayout>
	//   16   39:ldc2            #268 <Int 0x800003>
	//   17   42:invokevirtual   #277 <Method void DrawerLayout.f(int)>
			else
	//*  18   45:goto            58
				mDrawerLayout.e(0x800003);
	//   19   48:aload_0         
	//   20   49:getfield        #79  <Field DrawerLayout mDrawerLayout>
	//   21   52:ldc2            #268 <Int 0x800003>
	//   22   55:invokevirtual   #280 <Method void DrawerLayout.e(int)>
			return true;
	//   23   58:iconst_1        
	//   24   59:ireturn         
		} else
		{
			return false;
	//   25   60:iconst_0        
	//   26   61:ireturn         
		}
	}

	public void setDrawerIndicatorEnabled(boolean flag)
	{
		if(flag != mDrawerIndicatorEnabled)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #69  <Field boolean mDrawerIndicatorEnabled>
	//*   3    5:icmpeq          64
		{
			int i;
			Object obj;
			if(flag)
	//*   4    8:iload_1         
	//*   5    9:ifeq            46
			{
				obj = ((Object) (mSlider));
	//    6   12:aload_0         
	//    7   13:getfield        #104 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
	//    8   16:astore_3        
				if(mDrawerLayout.g(0x800003))
	//*   9   17:aload_0         
	//*  10   18:getfield        #79  <Field DrawerLayout mDrawerLayout>
	//*  11   21:ldc2            #268 <Int 0x800003>
	//*  12   24:invokevirtual   #285 <Method boolean DrawerLayout.g(int)>
	//*  13   27:ifeq            38
					i = mCloseDrawerContentDescRes;
	//   14   30:aload_0         
	//   15   31:getfield        #85  <Field int mCloseDrawerContentDescRes>
	//   16   34:istore_2        
				else
	//*  17   35:goto            53
					i = mOpenDrawerContentDescRes;
	//   18   38:aload_0         
	//   19   39:getfield        #83  <Field int mOpenDrawerContentDescRes>
	//   20   42:istore_2        
			} else
	//*  21   43:goto            53
			{
				obj = ((Object) (mHomeAsUpIndicator));
	//   22   46:aload_0         
	//   23   47:getfield        #91  <Field Drawable mHomeAsUpIndicator>
	//   24   50:astore_3        
				i = 0;
	//   25   51:iconst_0        
	//   26   52:istore_2        
			}
			setActionBarUpIndicator(((Drawable) (obj)), i);
	//   27   53:aload_0         
	//   28   54:aload_3         
	//   29   55:iload_2         
	//   30   56:invokespecial   #286 <Method void setActionBarUpIndicator(Drawable, int)>
			mDrawerIndicatorEnabled = flag;
	//   31   59:aload_0         
	//   32   60:iload_1         
	//   33   61:putfield        #69  <Field boolean mDrawerIndicatorEnabled>
		}
	//   34   64:return          
	}

	public void setHomeAsUpIndicator(int i)
	{
		Drawable drawable;
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			drawable = a.getDrawable(((Context) (mActivity)), i);
	//    2    4:aload_0         
	//    3    5:getfield        #71  <Field Activity mActivity>
	//    4    8:iload_1         
	//    5    9:invokestatic    #97  <Method Drawable a.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			drawable = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setHomeAsUpIndicator(drawable);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #287 <Method void setHomeAsUpIndicator(Drawable)>
	//   13   23:return          
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
	//    4    6:invokespecial   #89  <Method Drawable getThemeUpIndicator()>
	//    5    9:putfield        #91  <Field Drawable mHomeAsUpIndicator>
			mHasCustomUpIndicator = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #232 <Field boolean mHasCustomUpIndicator>
		} else
	//*   9   17:goto            30
		{
			mHomeAsUpIndicator = drawable;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #91  <Field Drawable mHomeAsUpIndicator>
			mHasCustomUpIndicator = true;
	//   13   25:aload_0         
	//   14   26:iconst_1        
	//   15   27:putfield        #232 <Field boolean mHasCustomUpIndicator>
		}
		if(!mDrawerIndicatorEnabled)
	//*  16   30:aload_0         
	//*  17   31:getfield        #69  <Field boolean mDrawerIndicatorEnabled>
	//*  18   34:ifne            46
			setActionBarUpIndicator(mHomeAsUpIndicator, 0);
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #91  <Field Drawable mHomeAsUpIndicator>
	//   22   42:iconst_0        
	//   23   43:invokespecial   #286 <Method void setActionBarUpIndicator(Drawable, int)>
	//   24   46:return          
	}

	public void syncState()
	{
		float f;
		SlideDrawable slidedrawable;
		if(mDrawerLayout.g(0x800003))
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field DrawerLayout mDrawerLayout>
	//*   2    4:ldc2            #268 <Int 0x800003>
	//*   3    7:invokevirtual   #285 <Method boolean DrawerLayout.g(int)>
	//*   4   10:ifeq            28
		{
			slidedrawable = mSlider;
	//    5   13:aload_0         
	//    6   14:getfield        #104 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
	//    7   17:astore_3        
			f = 1.0F;
	//    8   18:fconst_1        
	//    9   19:fstore_1        
		} else
	//*  10   20:aload_3         
	//*  11   21:fload_1         
	//*  12   22:invokevirtual   #240 <Method void ActionBarDrawerToggle$SlideDrawable.setPosition(float)>
	//*  13   25:goto            38
		{
			slidedrawable = mSlider;
	//   14   28:aload_0         
	//   15   29:getfield        #104 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
	//   16   32:astore_3        
			f = 0.0F;
	//   17   33:fconst_0        
	//   18   34:fstore_1        
		}
		slidedrawable.setPosition(f);
	//*  19   35:goto            20
		if(mDrawerIndicatorEnabled)
	//*  20   38:aload_0         
	//*  21   39:getfield        #69  <Field boolean mDrawerIndicatorEnabled>
	//*  22   42:ifeq            82
		{
			SlideDrawable slidedrawable1 = mSlider;
	//   23   45:aload_0         
	//   24   46:getfield        #104 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
	//   25   49:astore_3        
			int i;
			if(mDrawerLayout.g(0x800003))
	//*  26   50:aload_0         
	//*  27   51:getfield        #79  <Field DrawerLayout mDrawerLayout>
	//*  28   54:ldc2            #268 <Int 0x800003>
	//*  29   57:invokevirtual   #285 <Method boolean DrawerLayout.g(int)>
	//*  30   60:ifeq            71
				i = mCloseDrawerContentDescRes;
	//   31   63:aload_0         
	//   32   64:getfield        #85  <Field int mCloseDrawerContentDescRes>
	//   33   67:istore_2        
			else
	//*  34   68:goto            76
				i = mOpenDrawerContentDescRes;
	//   35   71:aload_0         
	//   36   72:getfield        #83  <Field int mOpenDrawerContentDescRes>
	//   37   75:istore_2        
			setActionBarUpIndicator(((Drawable) (slidedrawable1)), i);
	//   38   76:aload_0         
	//   39   77:aload_3         
	//   40   78:iload_2         
	//   41   79:invokespecial   #286 <Method void setActionBarUpIndicator(Drawable, int)>
		}
	//   42   82:return          
	}

	private static final int ID_HOME = 0x102002c;
	private static final String TAG = "ActionBarDrawerToggle";
	private static final int THEME_ATTRS[] = {
		0x101030b
	};
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
	private SetIndicatorInfo mSetIndicatorInfo;
	private SlideDrawable mSlider;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #53  <Int 0x101030b>
	//    5    7:iastore         
	//    6    8:putstatic       #55  <Field int[] THEME_ATTRS>
	//*   7   11:return          
	}
}
