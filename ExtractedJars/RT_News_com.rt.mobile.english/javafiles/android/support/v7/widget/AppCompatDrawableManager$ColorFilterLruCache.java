// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.PorterDuffColorFilter;
import android.support.v4.util.LruCache;

// Referenced classes of package android.support.v7.widget:
//			AppCompatDrawableManager

private static class AppCompatDrawableManager$ColorFilterLruCache extends LruCache
{

	private static int generateCacheKey(int i, android.graphics.PorterDuff.Mode mode)
	{
		return 31 * (i + 31) + mode.hashCode();
	//    0    0:bipush          31
	//    1    2:iload_0         
	//    2    3:bipush          31
	//    3    5:iadd            
	//    4    6:imul            
	//    5    7:aload_1         
	//    6    8:invokevirtual   #21  <Method int android.graphics.PorterDuff$Mode.hashCode()>
	//    7   11:iadd            
	//    8   12:ireturn         
	}

	PorterDuffColorFilter get(int i, android.graphics.PorterDuff.Mode mode)
	{
		return (PorterDuffColorFilter)get(((Object) (Integer.valueOf(generateCacheKey(i, mode)))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #25  <Method int generateCacheKey(int, android.graphics.PorterDuff$Mode)>
	//    4    6:invokestatic    #31  <Method Integer Integer.valueOf(int)>
	//    5    9:invokevirtual   #34  <Method Object get(Object)>
	//    6   12:checkcast       #36  <Class PorterDuffColorFilter>
	//    7   15:areturn         
	}

	PorterDuffColorFilter put(int i, android.graphics.PorterDuff.Mode mode, PorterDuffColorFilter porterduffcolorfilter)
	{
		return (PorterDuffColorFilter)put(((Object) (Integer.valueOf(generateCacheKey(i, mode)))), ((Object) (porterduffcolorfilter)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #25  <Method int generateCacheKey(int, android.graphics.PorterDuff$Mode)>
	//    4    6:invokestatic    #31  <Method Integer Integer.valueOf(int)>
	//    5    9:aload_3         
	//    6   10:invokevirtual   #41  <Method Object put(Object, Object)>
	//    7   13:checkcast       #36  <Class PorterDuffColorFilter>
	//    8   16:areturn         
	}

	public AppCompatDrawableManager$ColorFilterLruCache(int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #12  <Method void LruCache(int)>
	//    3    5:return          
	}
}
