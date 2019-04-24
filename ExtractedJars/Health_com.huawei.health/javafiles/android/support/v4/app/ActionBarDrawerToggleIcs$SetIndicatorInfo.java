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
//			ActionBarDrawerToggleIcs

static class ActionBarDrawerToggleIcs$SetIndicatorInfo
{

	public Method setHomeActionContentDescription;
	public Method setHomeAsUpIndicator;
	public ImageView upIndicatorView;

	ActionBarDrawerToggleIcs$SetIndicatorInfo(Activity activity)
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
