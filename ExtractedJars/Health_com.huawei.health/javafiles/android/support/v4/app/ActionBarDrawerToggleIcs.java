// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

class ActionBarDrawerToggleIcs
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


	ActionBarDrawerToggleIcs()
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

	public static Object setActionBarDescription(Object obj, Activity activity, int i)
	{
		Object obj1;
		obj1 = obj;
	//    0    0:aload_0         
	//    1    1:astore_3        
		if(obj == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       15
			obj1 = ((Object) (new SetIndicatorInfo(activity)));
	//    4    6:new             #6   <Class ActionBarDrawerToggleIcs$SetIndicatorInfo>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokespecial   #49  <Method void ActionBarDrawerToggleIcs$SetIndicatorInfo(Activity)>
	//    8   14:astore_3        
		obj = ((Object) ((SetIndicatorInfo)obj1));
	//    9   15:aload_3         
	//   10   16:checkcast       #6   <Class ActionBarDrawerToggleIcs$SetIndicatorInfo>
	//   11   19:astore_0        
		if(((SetIndicatorInfo) (obj)).setHomeAsUpIndicator == null)
			break MISSING_BLOCK_LABEL_80;
	//   12   20:aload_0         
	//   13   21:getfield        #53  <Field Method ActionBarDrawerToggleIcs$SetIndicatorInfo.setHomeAsUpIndicator>
	//   14   24:ifnull          80
		activity = ((Activity) (activity.getActionBar()));
	//   15   27:aload_1         
	//   16   28:invokevirtual   #57  <Method ActionBar Activity.getActionBar()>
	//   17   31:astore_1        
		((SetIndicatorInfo) (obj)).setHomeActionContentDescription.invoke(((Object) (activity)), new Object[] {
			Integer.valueOf(i)
		});
	//   18   32:aload_0         
	//   19   33:getfield        #60  <Field Method ActionBarDrawerToggleIcs$SetIndicatorInfo.setHomeActionContentDescription>
	//   20   36:aload_1         
	//   21   37:iconst_1        
	//   22   38:anewarray       Object[]
	//   23   41:dup             
	//   24   42:iconst_0        
	//   25   43:iload_2         
	//   26   44:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   27   47:aastore         
	//   28   48:invokevirtual   #72  <Method Object Method.invoke(Object, Object[])>
	//   29   51:pop             
		if(android.os.Build.VERSION.SDK_INT <= 19)
	//*  30   52:getstatic       #78  <Field int android.os.Build$VERSION.SDK_INT>
	//*  31   55:bipush          19
	//*  32   57:icmpgt          68
			((ActionBar) (activity)).setSubtitle(((ActionBar) (activity)).getSubtitle());
	//   33   60:aload_1         
	//   34   61:aload_1         
	//   35   62:invokevirtual   #84  <Method CharSequence ActionBar.getSubtitle()>
	//   36   65:invokevirtual   #88  <Method void ActionBar.setSubtitle(CharSequence)>
		return obj1;
	//   37   68:aload_3         
	//   38   69:areturn         
		obj;
	//   39   70:astore_0        
		Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set content description via JB-MR2 API", ((Throwable) (obj)));
	//   40   71:ldc1            #14  <String "ActionBarDrawerToggleHoneycomb">
	//   41   73:ldc1            #90  <String "Couldn't set content description via JB-MR2 API">
	//   42   75:aload_0         
	//   43   76:invokestatic    #96  <Method int Log.w(String, String, Throwable)>
	//   44   79:pop             
		return obj1;
	//   45   80:aload_3         
	//   46   81:areturn         
	}

	public static Object setActionBarUpIndicator(Object obj, Activity activity, Drawable drawable, int i)
	{
		Object obj1 = obj;
	//    0    0:aload_0         
	//    1    1:astore          4
		if(obj == null)
	//*   2    3:aload_0         
	//*   3    4:ifnonnull       17
			obj1 = ((Object) (new SetIndicatorInfo(activity)));
	//    4    7:new             #6   <Class ActionBarDrawerToggleIcs$SetIndicatorInfo>
	//    5   10:dup             
	//    6   11:aload_1         
	//    7   12:invokespecial   #49  <Method void ActionBarDrawerToggleIcs$SetIndicatorInfo(Activity)>
	//    8   15:astore          4
		obj = ((Object) ((SetIndicatorInfo)obj1));
	//    9   17:aload           4
	//   10   19:checkcast       #6   <Class ActionBarDrawerToggleIcs$SetIndicatorInfo>
	//   11   22:astore_0        
		if(((SetIndicatorInfo) (obj)).setHomeAsUpIndicator != null)
	//*  12   23:aload_0         
	//*  13   24:getfield        #53  <Field Method ActionBarDrawerToggleIcs$SetIndicatorInfo.setHomeAsUpIndicator>
	//*  14   27:ifnull          88
		{
			try
			{
				activity = ((Activity) (activity.getActionBar()));
	//   15   30:aload_1         
	//   16   31:invokevirtual   #57  <Method ActionBar Activity.getActionBar()>
	//   17   34:astore_1        
				((SetIndicatorInfo) (obj)).setHomeAsUpIndicator.invoke(((Object) (activity)), new Object[] {
					drawable
				});
	//   18   35:aload_0         
	//   19   36:getfield        #53  <Field Method ActionBarDrawerToggleIcs$SetIndicatorInfo.setHomeAsUpIndicator>
	//   20   39:aload_1         
	//   21   40:iconst_1        
	//   22   41:anewarray       Object[]
	//   23   44:dup             
	//   24   45:iconst_0        
	//   25   46:aload_2         
	//   26   47:aastore         
	//   27   48:invokevirtual   #72  <Method Object Method.invoke(Object, Object[])>
	//   28   51:pop             
				((SetIndicatorInfo) (obj)).setHomeActionContentDescription.invoke(((Object) (activity)), new Object[] {
					Integer.valueOf(i)
				});
	//   29   52:aload_0         
	//   30   53:getfield        #60  <Field Method ActionBarDrawerToggleIcs$SetIndicatorInfo.setHomeActionContentDescription>
	//   31   56:aload_1         
	//   32   57:iconst_1        
	//   33   58:anewarray       Object[]
	//   34   61:dup             
	//   35   62:iconst_0        
	//   36   63:iload_3         
	//   37   64:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   38   67:aastore         
	//   39   68:invokevirtual   #72  <Method Object Method.invoke(Object, Object[])>
	//   40   71:pop             
			}
	//*  41   72:aload           4
	//*  42   74:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  43   75:astore_0        
			{
				Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator via JB-MR2 API", ((Throwable) (obj)));
	//   44   76:ldc1            #14  <String "ActionBarDrawerToggleHoneycomb">
	//   45   78:ldc1            #100 <String "Couldn't set home-as-up indicator via JB-MR2 API">
	//   46   80:aload_0         
	//   47   81:invokestatic    #96  <Method int Log.w(String, String, Throwable)>
	//   48   84:pop             
				return obj1;
	//   49   85:aload           4
	//   50   87:areturn         
			}
			return obj1;
		}
		if(((SetIndicatorInfo) (obj)).upIndicatorView != null)
	//*  51   88:aload_0         
	//*  52   89:getfield        #104 <Field ImageView ActionBarDrawerToggleIcs$SetIndicatorInfo.upIndicatorView>
	//*  53   92:ifnull          106
		{
			((SetIndicatorInfo) (obj)).upIndicatorView.setImageDrawable(drawable);
	//   54   95:aload_0         
	//   55   96:getfield        #104 <Field ImageView ActionBarDrawerToggleIcs$SetIndicatorInfo.upIndicatorView>
	//   56   99:aload_2         
	//   57  100:invokevirtual   #110 <Method void ImageView.setImageDrawable(Drawable)>
			return obj1;
	//   58  103:aload           4
	//   59  105:areturn         
		} else
		{
			Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator");
	//   60  106:ldc1            #14  <String "ActionBarDrawerToggleHoneycomb">
	//   61  108:ldc1            #112 <String "Couldn't set home-as-up indicator">
	//   62  110:invokestatic    #115 <Method int Log.w(String, String)>
	//   63  113:pop             
			return obj1;
	//   64  114:aload           4
	//   65  116:areturn         
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
