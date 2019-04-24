// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

class ActionBarDrawerToggleHoneycomb
{
	static class SetIndicatorInfo
	{

		public Method setHomeActionContentDescription;
		public Method setHomeAsUpIndicator;
		public ImageView upIndicatorView;

		SetIndicatorInfo(Activity activity)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			try
			{
				setHomeAsUpIndicator = ((Class) (android/app/ActionBar)).getDeclaredMethod("setHomeAsUpIndicator", new Class[] {
					android/graphics/drawable/Drawable
				});
		//    2    4:aload_0         
		//    3    5:ldc1            #21  <Class ActionBar>
		//    4    7:ldc1            #22  <String "setHomeAsUpIndicator">
		//    5    9:iconst_1        
		//    6   10:anewarray       Class[]
		//    7   13:dup             
		//    8   14:iconst_0        
		//    9   15:ldc1            #26  <Class Drawable>
		//   10   17:aastore         
		//   11   18:invokevirtual   #30  <Method Method Class.getDeclaredMethod(String, Class[])>
		//   12   21:putfield        #32  <Field Method setHomeAsUpIndicator>
				setHomeActionContentDescription = ((Class) (android/app/ActionBar)).getDeclaredMethod("setHomeActionContentDescription", new Class[] {
					Integer.TYPE
				});
		//   13   24:aload_0         
		//   14   25:ldc1            #21  <Class ActionBar>
		//   15   27:ldc1            #33  <String "setHomeActionContentDescription">
		//   16   29:iconst_1        
		//   17   30:anewarray       Class[]
		//   18   33:dup             
		//   19   34:iconst_0        
		//   20   35:getstatic       #39  <Field Class Integer.TYPE>
		//   21   38:aastore         
		//   22   39:invokevirtual   #30  <Method Method Class.getDeclaredMethod(String, Class[])>
		//   23   42:putfield        #41  <Field Method setHomeActionContentDescription>
				return;
		//   24   45:return          
			}
			catch(NoSuchMethodException nosuchmethodexception)
		//*  25   46:astore_2        
			{
				activity = ((Activity) (activity.findViewById(0x102002c)));
		//   26   47:aload_1         
		//   27   48:ldc1            #42  <Int 0x102002c>
		//   28   50:invokevirtual   #48  <Method View Activity.findViewById(int)>
		//   29   53:astore_1        
			}
			if(activity == null)
		//*  30   54:aload_1         
		//*  31   55:ifnonnull       59
				return;
		//   32   58:return          
			Object obj = ((Object) ((ViewGroup)((View) (activity)).getParent()));
		//   33   59:aload_1         
		//   34   60:invokevirtual   #54  <Method android.view.ViewParent View.getParent()>
		//   35   63:checkcast       #56  <Class ViewGroup>
		//   36   66:astore_2        
			if(((ViewGroup) (obj)).getChildCount() != 2)
		//*  37   67:aload_2         
		//*  38   68:invokevirtual   #60  <Method int ViewGroup.getChildCount()>
		//*  39   71:iconst_2        
		//*  40   72:icmpeq          76
				return;
		//   41   75:return          
			activity = ((Activity) (((ViewGroup) (obj)).getChildAt(0)));
		//   42   76:aload_2         
		//   43   77:iconst_0        
		//   44   78:invokevirtual   #63  <Method View ViewGroup.getChildAt(int)>
		//   45   81:astore_1        
			obj = ((Object) (((ViewGroup) (obj)).getChildAt(1)));
		//   46   82:aload_2         
		//   47   83:iconst_1        
		//   48   84:invokevirtual   #63  <Method View ViewGroup.getChildAt(int)>
		//   49   87:astore_2        
			if(((View) (activity)).getId() == 0x102002c)
		//*  50   88:aload_1         
		//*  51   89:invokevirtual   #66  <Method int View.getId()>
		//*  52   92:ldc1            #42  <Int 0x102002c>
		//*  53   94:icmpne          102
				activity = ((Activity) (obj));
		//   54   97:aload_2         
		//   55   98:astore_1        
		//*  56   99:goto            102
			if(activity instanceof ImageView)
		//*  57  102:aload_1         
		//*  58  103:instanceof      #68  <Class ImageView>
		//*  59  106:ifeq            117
				upIndicatorView = (ImageView)activity;
		//   60  109:aload_0         
		//   61  110:aload_1         
		//   62  111:checkcast       #68  <Class ImageView>
		//   63  114:putfield        #70  <Field ImageView upIndicatorView>
		//   64  117:return          
		}
	}


	ActionBarDrawerToggleHoneycomb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	public static Drawable getThemeUpIndicator(Activity activity)
	{
		activity = ((Activity) (activity.obtainStyledAttributes(THEME_ATTRS)));
	//    0    0:aload_0         
	//    1    1:getstatic       #21  <Field int[] THEME_ATTRS>
	//    2    4:invokevirtual   #33  <Method TypedArray Activity.obtainStyledAttributes(int[])>
	//    3    7:astore_0        
		Drawable drawable = ((TypedArray) (activity)).getDrawable(0);
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #39  <Method Drawable TypedArray.getDrawable(int)>
	//    7   13:astore_1        
		((TypedArray) (activity)).recycle();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #42  <Method void TypedArray.recycle()>
		return drawable;
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	public static SetIndicatorInfo setActionBarDescription(SetIndicatorInfo setindicatorinfo, Activity activity, int i)
	{
		SetIndicatorInfo setindicatorinfo1;
		setindicatorinfo1 = setindicatorinfo;
	//    0    0:aload_0         
	//    1    1:astore_3        
		if(setindicatorinfo == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       15
			setindicatorinfo1 = new SetIndicatorInfo(activity);
	//    4    6:new             #6   <Class ActionBarDrawerToggleHoneycomb$SetIndicatorInfo>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokespecial   #49  <Method void ActionBarDrawerToggleHoneycomb$SetIndicatorInfo(Activity)>
	//    8   14:astore_3        
		if(setindicatorinfo1.setHomeAsUpIndicator == null)
			break MISSING_BLOCK_LABEL_75;
	//    9   15:aload_3         
	//   10   16:getfield        #53  <Field Method ActionBarDrawerToggleHoneycomb$SetIndicatorInfo.setHomeAsUpIndicator>
	//   11   19:ifnull          75
		setindicatorinfo = ((SetIndicatorInfo) (activity.getActionBar()));
	//   12   22:aload_1         
	//   13   23:invokevirtual   #57  <Method ActionBar Activity.getActionBar()>
	//   14   26:astore_0        
		setindicatorinfo1.setHomeActionContentDescription.invoke(((Object) (setindicatorinfo)), new Object[] {
			Integer.valueOf(i)
		});
	//   15   27:aload_3         
	//   16   28:getfield        #60  <Field Method ActionBarDrawerToggleHoneycomb$SetIndicatorInfo.setHomeActionContentDescription>
	//   17   31:aload_0         
	//   18   32:iconst_1        
	//   19   33:anewarray       Object[]
	//   20   36:dup             
	//   21   37:iconst_0        
	//   22   38:iload_2         
	//   23   39:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   24   42:aastore         
	//   25   43:invokevirtual   #72  <Method Object Method.invoke(Object, Object[])>
	//   26   46:pop             
		if(android.os.Build.VERSION.SDK_INT <= 19)
	//*  27   47:getstatic       #78  <Field int android.os.Build$VERSION.SDK_INT>
	//*  28   50:bipush          19
	//*  29   52:icmpgt          63
			((ActionBar) (setindicatorinfo)).setSubtitle(((ActionBar) (setindicatorinfo)).getSubtitle());
	//   30   55:aload_0         
	//   31   56:aload_0         
	//   32   57:invokevirtual   #84  <Method CharSequence ActionBar.getSubtitle()>
	//   33   60:invokevirtual   #88  <Method void ActionBar.setSubtitle(CharSequence)>
		return setindicatorinfo1;
	//   34   63:aload_3         
	//   35   64:areturn         
		setindicatorinfo;
	//   36   65:astore_0        
		Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set content description via JB-MR2 API", ((Throwable) (setindicatorinfo)));
	//   37   66:ldc1            #14  <String "ActionBarDrawerToggleHoneycomb">
	//   38   68:ldc1            #90  <String "Couldn't set content description via JB-MR2 API">
	//   39   70:aload_0         
	//   40   71:invokestatic    #96  <Method int Log.w(String, String, Throwable)>
	//   41   74:pop             
		return setindicatorinfo1;
	//   42   75:aload_3         
	//   43   76:areturn         
	}

	public static SetIndicatorInfo setActionBarUpIndicator(SetIndicatorInfo setindicatorinfo, Activity activity, Drawable drawable, int i)
	{
		setindicatorinfo = new SetIndicatorInfo(activity);
	//    0    0:new             #6   <Class ActionBarDrawerToggleHoneycomb$SetIndicatorInfo>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #49  <Method void ActionBarDrawerToggleHoneycomb$SetIndicatorInfo(Activity)>
	//    4    8:astore_0        
		if(setindicatorinfo.setHomeAsUpIndicator != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #53  <Field Method ActionBarDrawerToggleHoneycomb$SetIndicatorInfo.setHomeAsUpIndicator>
	//*   7   13:ifnull          72
		{
			try
			{
				activity = ((Activity) (activity.getActionBar()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #57  <Method ActionBar Activity.getActionBar()>
	//   10   20:astore_1        
				setindicatorinfo.setHomeAsUpIndicator.invoke(((Object) (activity)), new Object[] {
					drawable
				});
	//   11   21:aload_0         
	//   12   22:getfield        #53  <Field Method ActionBarDrawerToggleHoneycomb$SetIndicatorInfo.setHomeAsUpIndicator>
	//   13   25:aload_1         
	//   14   26:iconst_1        
	//   15   27:anewarray       Object[]
	//   16   30:dup             
	//   17   31:iconst_0        
	//   18   32:aload_2         
	//   19   33:aastore         
	//   20   34:invokevirtual   #72  <Method Object Method.invoke(Object, Object[])>
	//   21   37:pop             
				setindicatorinfo.setHomeActionContentDescription.invoke(((Object) (activity)), new Object[] {
					Integer.valueOf(i)
				});
	//   22   38:aload_0         
	//   23   39:getfield        #60  <Field Method ActionBarDrawerToggleHoneycomb$SetIndicatorInfo.setHomeActionContentDescription>
	//   24   42:aload_1         
	//   25   43:iconst_1        
	//   26   44:anewarray       Object[]
	//   27   47:dup             
	//   28   48:iconst_0        
	//   29   49:iload_3         
	//   30   50:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   31   53:aastore         
	//   32   54:invokevirtual   #72  <Method Object Method.invoke(Object, Object[])>
	//   33   57:pop             
			}
	//*  34   58:aload_0         
	//*  35   59:areturn         
			// Misplaced declaration of an exception variable
			catch(Activity activity)
	//*  36   60:astore_1        
			{
				Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator via JB-MR2 API", ((Throwable) (activity)));
	//   37   61:ldc1            #14  <String "ActionBarDrawerToggleHoneycomb">
	//   38   63:ldc1            #100 <String "Couldn't set home-as-up indicator via JB-MR2 API">
	//   39   65:aload_1         
	//   40   66:invokestatic    #96  <Method int Log.w(String, String, Throwable)>
	//   41   69:pop             
				return setindicatorinfo;
	//   42   70:aload_0         
	//   43   71:areturn         
			}
			return setindicatorinfo;
		}
		if(setindicatorinfo.upIndicatorView != null)
	//*  44   72:aload_0         
	//*  45   73:getfield        #104 <Field ImageView ActionBarDrawerToggleHoneycomb$SetIndicatorInfo.upIndicatorView>
	//*  46   76:ifnull          89
		{
			setindicatorinfo.upIndicatorView.setImageDrawable(drawable);
	//   47   79:aload_0         
	//   48   80:getfield        #104 <Field ImageView ActionBarDrawerToggleHoneycomb$SetIndicatorInfo.upIndicatorView>
	//   49   83:aload_2         
	//   50   84:invokevirtual   #110 <Method void ImageView.setImageDrawable(Drawable)>
			return setindicatorinfo;
	//   51   87:aload_0         
	//   52   88:areturn         
		} else
		{
			Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator");
	//   53   89:ldc1            #14  <String "ActionBarDrawerToggleHoneycomb">
	//   54   91:ldc1            #112 <String "Couldn't set home-as-up indicator">
	//   55   93:invokestatic    #115 <Method int Log.w(String, String)>
	//   56   96:pop             
			return setindicatorinfo;
	//   57   97:aload_0         
	//   58   98:areturn         
		}
	}

	private static final String TAG = "ActionBarDrawerToggleHoneycomb";
	private static final int THEME_ATTRS[] = {
		0x101030b
	};

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #19  <Int 0x101030b>
	//    5    7:iastore         
	//    6    8:putstatic       #21  <Field int[] THEME_ATTRS>
	//*   7   11:return          
	}
}
