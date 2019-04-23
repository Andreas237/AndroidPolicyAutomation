// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

class ActionBarDrawerToggleHoneycomb$SetIndicatorInfo
{

	public Method setHomeActionContentDescription;
	public Method setHomeAsUpIndicator;
	public ImageView upIndicatorView;

	ActionBarDrawerToggleHoneycomb$SetIndicatorInfo(Activity activity)
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
