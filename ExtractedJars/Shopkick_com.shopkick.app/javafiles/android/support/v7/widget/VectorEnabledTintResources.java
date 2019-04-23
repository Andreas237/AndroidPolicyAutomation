// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.widget:
//			AppCompatDrawableManager

public class VectorEnabledTintResources extends Resources
{

	public VectorEnabledTintResources(Context context, Resources resources)
	{
		super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #27  <Method android.content.res.AssetManager Resources.getAssets()>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #31  <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #35  <Method android.content.res.Configuration Resources.getConfiguration()>
	//    7   13:invokespecial   #38  <Method void Resources(android.content.res.AssetManager, android.util.DisplayMetrics, android.content.res.Configuration)>
		mContextRef = new WeakReference(((Object) (context)));
	//    8   16:aload_0         
	//    9   17:new             #40  <Class WeakReference>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #43  <Method void WeakReference(Object)>
	//   13   25:putfield        #45  <Field WeakReference mContextRef>
	//   14   28:return          
	}

	public static boolean isCompatVectorFromResourcesEnabled()
	{
		return sCompatVectorFromResourcesEnabled;
	//    0    0:getstatic       #50  <Field boolean sCompatVectorFromResourcesEnabled>
	//    1    3:ireturn         
	}

	public static void setCompatVectorFromResourcesEnabled(boolean flag)
	{
		sCompatVectorFromResourcesEnabled = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #50  <Field boolean sCompatVectorFromResourcesEnabled>
	//    2    4:return          
	}

	public static boolean shouldBeUsed()
	{
		return isCompatVectorFromResourcesEnabled() && android.os.Build.VERSION.SDK_INT <= 20;
	//    0    0:invokestatic    #55  <Method boolean isCompatVectorFromResourcesEnabled()>
	//    1    3:ifeq            16
	//    2    6:getstatic       #60  <Field int android.os.Build$VERSION.SDK_INT>
	//    3    9:bipush          20
	//    4   11:icmpgt          16
	//    5   14:iconst_1        
	//    6   15:ireturn         
	//    7   16:iconst_0        
	//    8   17:ireturn         
	}

	public Drawable getDrawable(int i)
		throws android.content.res.Resources.NotFoundException
	{
		Context context = (Context)mContextRef.get();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field WeakReference mContextRef>
	//    2    4:invokevirtual   #68  <Method Object WeakReference.get()>
	//    3    7:checkcast       #70  <Class Context>
	//    4   10:astore_2        
		if(context != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          25
			return AppCompatDrawableManager.get().onDrawableLoadedFromResources(context, this, i);
	//    7   15:invokestatic    #75  <Method AppCompatDrawableManager AppCompatDrawableManager.get()>
	//    8   18:aload_2         
	//    9   19:aload_0         
	//   10   20:iload_1         
	//   11   21:invokevirtual   #79  <Method Drawable AppCompatDrawableManager.onDrawableLoadedFromResources(Context, VectorEnabledTintResources, int)>
	//   12   24:areturn         
		else
			return super.getDrawable(i);
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:invokespecial   #81  <Method Drawable Resources.getDrawable(int)>
	//   16   30:areturn         
	}

	final Drawable superGetDrawable(int i)
	{
		return super.getDrawable(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #81  <Method Drawable Resources.getDrawable(int)>
	//    3    5:areturn         
	}

	public static final int MAX_SDK_WHERE_REQUIRED = 20;
	private static boolean sCompatVectorFromResourcesEnabled = false;
	private final WeakReference mContextRef;

	static 
	{
	//    0    0:return          
	}
}
