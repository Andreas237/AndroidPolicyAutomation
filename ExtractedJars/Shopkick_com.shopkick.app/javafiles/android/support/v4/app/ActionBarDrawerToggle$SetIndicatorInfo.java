// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v4.app:
//			ActionBarDrawerToggle

private static class ActionBarDrawerToggle$SetIndicatorInfo
{

	Method mSetHomeActionContentDescription;
	Method mSetHomeAsUpIndicator;
	ImageView mUpIndicatorView;

	ActionBarDrawerToggle$SetIndicatorInfo(Activity activity)
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
