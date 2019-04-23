// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import java.lang.reflect.Method;

class ActionBarDrawerToggleHoneycomb
{

	private ActionBarDrawerToggleHoneycomb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	public static Drawable getThemeUpIndicator(Activity activity)
	{
		activity = ((Activity) (activity.obtainStyledAttributes(THEME_ATTRS)));
	//    0    0:aload_0         
	//    1    1:getstatic       #15  <Field int[] THEME_ATTRS>
	//    2    4:invokevirtual   #27  <Method TypedArray Activity.obtainStyledAttributes(int[])>
	//    3    7:astore_0        
		Drawable drawable = ((TypedArray) (activity)).getDrawable(0);
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #33  <Method Drawable TypedArray.getDrawable(int)>
	//    7   13:astore_1        
		((TypedArray) (activity)).recycle();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #36  <Method void TypedArray.recycle()>
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
	//    4    6:new             #42  <Class ActionBarDrawerToggleHoneycomb$SetIndicatorInfo>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokespecial   #45  <Method void ActionBarDrawerToggleHoneycomb$SetIndicatorInfo(Activity)>
	//    8   14:astore_3        
		if(setindicatorinfo1.setHomeAsUpIndicator == null)
			break MISSING_BLOCK_LABEL_75;
	//    9   15:aload_3         
	//   10   16:getfield        #49  <Field Method ActionBarDrawerToggleHoneycomb$SetIndicatorInfo.setHomeAsUpIndicator>
	//   11   19:ifnull          75
		setindicatorinfo = ((SetIndicatorInfo) (activity.getActionBar()));
	//   12   22:aload_1         
	//   13   23:invokevirtual   #53  <Method ActionBar Activity.getActionBar()>
	//   14   26:astore_0        
		setindicatorinfo1.setHomeActionContentDescription.invoke(((Object) (setindicatorinfo)), new Object[] {
			Integer.valueOf(i)
		});
	//   15   27:aload_3         
	//   16   28:getfield        #56  <Field Method ActionBarDrawerToggleHoneycomb$SetIndicatorInfo.setHomeActionContentDescription>
	//   17   31:aload_0         
	//   18   32:iconst_1        
	//   19   33:anewarray       Object[]
	//   20   36:dup             
	//   21   37:iconst_0        
	//   22   38:iload_2         
	//   23   39:invokestatic    #62  <Method Integer Integer.valueOf(int)>
	//   24   42:aastore         
	//   25   43:invokevirtual   #68  <Method Object Method.invoke(Object, Object[])>
	//   26   46:pop             
		if(android.os.Build.VERSION.SDK_INT > 19)
			break MISSING_BLOCK_LABEL_75;
	//   27   47:getstatic       #74  <Field int android.os.Build$VERSION.SDK_INT>
	//   28   50:bipush          19
	//   29   52:icmpgt          75
		((ActionBar) (setindicatorinfo)).setSubtitle(((ActionBar) (setindicatorinfo)).getSubtitle());
	//   30   55:aload_0         
	//   31   56:aload_0         
	//   32   57:invokevirtual   #80  <Method CharSequence ActionBar.getSubtitle()>
	//   33   60:invokevirtual   #84  <Method void ActionBar.setSubtitle(CharSequence)>
		return setindicatorinfo1;
	//   34   63:aload_3         
	//   35   64:areturn         
		setindicatorinfo;
	//   36   65:astore_0        
		Log.w("ActionBarDrawerToggleHC", "Couldn't set content description via JB-MR2 API", ((Throwable) (setindicatorinfo)));
	//   37   66:ldc1            #8   <String "ActionBarDrawerToggleHC">
	//   38   68:ldc1            #86  <String "Couldn't set content description via JB-MR2 API">
	//   39   70:aload_0         
	//   40   71:invokestatic    #92  <Method int Log.w(String, String, Throwable)>
	//   41   74:pop             
		return setindicatorinfo1;
	//   42   75:aload_3         
	//   43   76:areturn         
	}

	public static SetIndicatorInfo setActionBarUpIndicator(SetIndicatorInfo setindicatorinfo, Activity activity, Drawable drawable, int i)
	{
		setindicatorinfo = new SetIndicatorInfo(activity);
	//    0    0:new             #42  <Class ActionBarDrawerToggleHoneycomb$SetIndicatorInfo>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #45  <Method void ActionBarDrawerToggleHoneycomb$SetIndicatorInfo(Activity)>
	//    4    8:astore_0        
		if(setindicatorinfo.setHomeAsUpIndicator != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #49  <Field Method ActionBarDrawerToggleHoneycomb$SetIndicatorInfo.setHomeAsUpIndicator>
	//*   7   13:ifnull          72
		{
			try
			{
				activity = ((Activity) (activity.getActionBar()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #53  <Method ActionBar Activity.getActionBar()>
	//   10   20:astore_1        
				setindicatorinfo.setHomeAsUpIndicator.invoke(((Object) (activity)), new Object[] {
					drawable
				});
	//   11   21:aload_0         
	//   12   22:getfield        #49  <Field Method ActionBarDrawerToggleHoneycomb$SetIndicatorInfo.setHomeAsUpIndicator>
	//   13   25:aload_1         
	//   14   26:iconst_1        
	//   15   27:anewarray       Object[]
	//   16   30:dup             
	//   17   31:iconst_0        
	//   18   32:aload_2         
	//   19   33:aastore         
	//   20   34:invokevirtual   #68  <Method Object Method.invoke(Object, Object[])>
	//   21   37:pop             
				setindicatorinfo.setHomeActionContentDescription.invoke(((Object) (activity)), new Object[] {
					Integer.valueOf(i)
				});
	//   22   38:aload_0         
	//   23   39:getfield        #56  <Field Method ActionBarDrawerToggleHoneycomb$SetIndicatorInfo.setHomeActionContentDescription>
	//   24   42:aload_1         
	//   25   43:iconst_1        
	//   26   44:anewarray       Object[]
	//   27   47:dup             
	//   28   48:iconst_0        
	//   29   49:iload_3         
	//   30   50:invokestatic    #62  <Method Integer Integer.valueOf(int)>
	//   31   53:aastore         
	//   32   54:invokevirtual   #68  <Method Object Method.invoke(Object, Object[])>
	//   33   57:pop             
			}
	//*  34   58:aload_0         
	//*  35   59:areturn         
			// Misplaced declaration of an exception variable
			catch(Activity activity)
	//*  36   60:astore_1        
			{
				Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator via JB-MR2 API", ((Throwable) (activity)));
	//   37   61:ldc1            #8   <String "ActionBarDrawerToggleHC">
	//   38   63:ldc1            #96  <String "Couldn't set home-as-up indicator via JB-MR2 API">
	//   39   65:aload_1         
	//   40   66:invokestatic    #92  <Method int Log.w(String, String, Throwable)>
	//   41   69:pop             
				return setindicatorinfo;
	//   42   70:aload_0         
	//   43   71:areturn         
			}
			return setindicatorinfo;
		}
		if(setindicatorinfo.upIndicatorView != null)
	//*  44   72:aload_0         
	//*  45   73:getfield        #100 <Field ImageView ActionBarDrawerToggleHoneycomb$SetIndicatorInfo.upIndicatorView>
	//*  46   76:ifnull          89
		{
			setindicatorinfo.upIndicatorView.setImageDrawable(drawable);
	//   47   79:aload_0         
	//   48   80:getfield        #100 <Field ImageView ActionBarDrawerToggleHoneycomb$SetIndicatorInfo.upIndicatorView>
	//   49   83:aload_2         
	//   50   84:invokevirtual   #106 <Method void ImageView.setImageDrawable(Drawable)>
			return setindicatorinfo;
	//   51   87:aload_0         
	//   52   88:areturn         
		} else
		{
			Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator");
	//   53   89:ldc1            #8   <String "ActionBarDrawerToggleHC">
	//   54   91:ldc1            #108 <String "Couldn't set home-as-up indicator">
	//   55   93:invokestatic    #111 <Method int Log.w(String, String)>
	//   56   96:pop             
			return setindicatorinfo;
	//   57   97:aload_0         
	//   58   98:areturn         
		}
	}

	private static final String TAG = "ActionBarDrawerToggleHC";
	private static final int THEME_ATTRS[] = {
		0x101030b
	};

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #13  <Int 0x101030b>
	//    5    7:iastore         
	//    6    8:putstatic       #15  <Field int[] THEME_ATTRS>
	//*   7   11:return          
	}

	private class SetIndicatorInfo
	{

		public Method setHomeActionContentDescription;
		public Method setHomeAsUpIndicator;
		public ImageView upIndicatorView;

		SetIndicatorInfo(Activity activity)
		{
			NoSuchMethodException nosuchmethodexception;
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			try
			{
				setHomeAsUpIndicator = ((Class) (android/app/ActionBar)).getDeclaredMethod("setHomeAsUpIndicator", new Class[] {
					android/graphics/drawable/Drawable
				});
		//    2    4:aload_0         
		//    3    5:ldc1            #18  <Class ActionBar>
		//    4    7:ldc1            #19  <String "setHomeAsUpIndicator">
		//    5    9:iconst_1        
		//    6   10:anewarray       Class[]
		//    7   13:dup             
		//    8   14:iconst_0        
		//    9   15:ldc1            #23  <Class Drawable>
		//   10   17:aastore         
		//   11   18:invokevirtual   #27  <Method Method Class.getDeclaredMethod(String, Class[])>
		//   12   21:putfield        #29  <Field Method setHomeAsUpIndicator>
				setHomeActionContentDescription = ((Class) (android/app/ActionBar)).getDeclaredMethod("setHomeActionContentDescription", new Class[] {
					Integer.TYPE
				});
		//   13   24:aload_0         
		//   14   25:ldc1            #18  <Class ActionBar>
		//   15   27:ldc1            #30  <String "setHomeActionContentDescription">
		//   16   29:iconst_1        
		//   17   30:anewarray       Class[]
		//   18   33:dup             
		//   19   34:iconst_0        
		//   20   35:getstatic       #36  <Field Class Integer.TYPE>
		//   21   38:aastore         
		//   22   39:invokevirtual   #27  <Method Method Class.getDeclaredMethod(String, Class[])>
		//   23   42:putfield        #38  <Field Method setHomeActionContentDescription>
				return;
		//   24   45:return          
			}
		//*  25   46:aload_1         
		//*  26   47:ldc1            #39  <Int 0x102002c>
		//*  27   49:invokevirtual   #45  <Method View Activity.findViewById(int)>
		//*  28   52:astore_1        
		//*  29   53:aload_1         
		//*  30   54:ifnonnull       58
		//*  31   57:return          
		//*  32   58:aload_1         
		//*  33   59:invokevirtual   #51  <Method android.view.ViewParent View.getParent()>
		//*  34   62:checkcast       #53  <Class ViewGroup>
		//*  35   65:astore_2        
		//*  36   66:aload_2         
		//*  37   67:invokevirtual   #57  <Method int ViewGroup.getChildCount()>
		//*  38   70:iconst_2        
		//*  39   71:icmpeq          75
		//*  40   74:return          
		//*  41   75:aload_2         
		//*  42   76:iconst_0        
		//*  43   77:invokevirtual   #60  <Method View ViewGroup.getChildAt(int)>
		//*  44   80:astore_1        
		//*  45   81:aload_2         
		//*  46   82:iconst_1        
		//*  47   83:invokevirtual   #60  <Method View ViewGroup.getChildAt(int)>
		//*  48   86:astore_2        
		//*  49   87:aload_1         
		//*  50   88:invokevirtual   #63  <Method int View.getId()>
		//*  51   91:ldc1            #39  <Int 0x102002c>
		//*  52   93:icmpne          101
		//*  53   96:aload_2         
		//*  54   97:astore_1        
		//*  55   98:goto            101
		//*  56  101:aload_1         
		//*  57  102:instanceof      #65  <Class ImageView>
		//*  58  105:ifeq            116
		//*  59  108:aload_0         
		//*  60  109:aload_1         
		//*  61  110:checkcast       #65  <Class ImageView>
		//*  62  113:putfield        #67  <Field ImageView upIndicatorView>
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
				upIndicatorView = (ImageView)activity;
		//*  64  117:astore_2        
		//*  65  118:goto            46
		}
	}

}
