// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.widget:
//			ResourcesWrapper, AppCompatDrawableManager

class TintResources extends ResourcesWrapper
{

	public TintResources(Context context, Resources resources)
	{
		super(resources);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #13  <Method void ResourcesWrapper(Resources)>
		mContextRef = new WeakReference(((Object) (context)));
	//    3    5:aload_0         
	//    4    6:new             #15  <Class WeakReference>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokespecial   #18  <Method void WeakReference(Object)>
	//    8   14:putfield        #20  <Field WeakReference mContextRef>
	//    9   17:return          
	}

	public Drawable getDrawable(int i)
		throws android.content.res.Resources.NotFoundException
	{
		Drawable drawable = super.getDrawable(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #28  <Method Drawable ResourcesWrapper.getDrawable(int)>
	//    3    5:astore_2        
		Context context = (Context)mContextRef.get();
	//    4    6:aload_0         
	//    5    7:getfield        #20  <Field WeakReference mContextRef>
	//    6   10:invokevirtual   #32  <Method Object WeakReference.get()>
	//    7   13:checkcast       #34  <Class Context>
	//    8   16:astore_3        
		if(drawable != null && context != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          36
	//*  11   21:aload_3         
	//*  12   22:ifnull          36
		{
			AppCompatDrawableManager.get();
	//   13   25:invokestatic    #39  <Method AppCompatDrawableManager AppCompatDrawableManager.get()>
	//   14   28:pop             
			AppCompatDrawableManager.tintDrawableUsingColorFilter(context, i, drawable);
	//   15   29:aload_3         
	//   16   30:iload_1         
	//   17   31:aload_2         
	//   18   32:invokestatic    #43  <Method boolean AppCompatDrawableManager.tintDrawableUsingColorFilter(Context, int, Drawable)>
	//   19   35:pop             
		}
		return drawable;
	//   20   36:aload_2         
	//   21   37:areturn         
	}

	private final WeakReference mContextRef;
}
