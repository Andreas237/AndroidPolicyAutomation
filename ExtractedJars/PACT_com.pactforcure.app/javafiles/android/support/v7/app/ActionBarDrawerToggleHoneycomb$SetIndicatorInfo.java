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

// Referenced classes of package android.support.v7.app:
//			ActionBarDrawerToggleHoneycomb

static class ActionBarDrawerToggleHoneycomb$SetIndicatorInfo
{

	public Method setHomeActionContentDescription;
	public Method setHomeAsUpIndicator;
	public ImageView upIndicatorView;

	ActionBarDrawerToggleHoneycomb$SetIndicatorInfo(Activity activity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
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
_L1:
		return;
	//   24   45:return          
		NoSuchMethodException nosuchmethodexception;
		nosuchmethodexception;
	//   25   46:astore_2        
		activity = ((Activity) (activity.findViewById(0x102002c)));
	//   26   47:aload_1         
	//   27   48:ldc1            #42  <Int 0x102002c>
	//   28   50:invokevirtual   #48  <Method View Activity.findViewById(int)>
	//   29   53:astore_1        
		if(activity != null)
	//*  30   54:aload_1         
	//*  31   55:ifnull          45
		{
			Object obj = ((Object) ((ViewGroup)((View) (activity)).getParent()));
	//   32   58:aload_1         
	//   33   59:invokevirtual   #54  <Method android.view.ViewParent View.getParent()>
	//   34   62:checkcast       #56  <Class ViewGroup>
	//   35   65:astore_2        
			if(((ViewGroup) (obj)).getChildCount() == 2)
	//*  36   66:aload_2         
	//*  37   67:invokevirtual   #60  <Method int ViewGroup.getChildCount()>
	//*  38   70:iconst_2        
	//*  39   71:icmpne          45
			{
				activity = ((Activity) (((ViewGroup) (obj)).getChildAt(0)));
	//   40   74:aload_2         
	//   41   75:iconst_0        
	//   42   76:invokevirtual   #63  <Method View ViewGroup.getChildAt(int)>
	//   43   79:astore_1        
				obj = ((Object) (((ViewGroup) (obj)).getChildAt(1)));
	//   44   80:aload_2         
	//   45   81:iconst_1        
	//   46   82:invokevirtual   #63  <Method View ViewGroup.getChildAt(int)>
	//   47   85:astore_2        
				if(((View) (activity)).getId() == 0x102002c)
	//*  48   86:aload_1         
	//*  49   87:invokevirtual   #66  <Method int View.getId()>
	//*  50   90:ldc1            #42  <Int 0x102002c>
	//*  51   92:icmpne          113
					activity = ((Activity) (obj));
	//   52   95:aload_2         
	//   53   96:astore_1        
				if(activity instanceof ImageView)
	//*  54   97:aload_1         
	//*  55   98:instanceof      #68  <Class ImageView>
	//*  56  101:ifeq            45
				{
					upIndicatorView = (ImageView)activity;
	//   57  104:aload_0         
	//   58  105:aload_1         
	//   59  106:checkcast       #68  <Class ImageView>
	//   60  109:putfield        #70  <Field ImageView upIndicatorView>
					return;
	//   61  112:return          
				}
			}
		}
		  goto _L1
	//*  62  113:goto            97
	}
}
