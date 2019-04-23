// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.PorterDuffColorFilter;
import android.support.v4.g.i;

class AppCompatDrawableManager$ColorFilterLruCache extends i
{

	private static int generateCacheKey(int j, android.graphics.PorterDuff.Mode mode)
	{
		return (j + 31) * 31 + mode.hashCode();
	//    0    0:iload_0         
	//    1    1:bipush          31
	//    2    3:iadd            
	//    3    4:bipush          31
	//    4    6:imul            
	//    5    7:aload_1         
	//    6    8:invokevirtual   #17  <Method int android.graphics.PorterDuff$Mode.hashCode()>
	//    7   11:iadd            
	//    8   12:ireturn         
	}

	PorterDuffColorFilter get(int j, android.graphics.PorterDuff.Mode mode)
	{
		return (PorterDuffColorFilter)get(((Object) (Integer.valueOf(generateCacheKey(j, mode)))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #21  <Method int generateCacheKey(int, android.graphics.PorterDuff$Mode)>
	//    4    6:invokestatic    #27  <Method Integer Integer.valueOf(int)>
	//    5    9:invokevirtual   #30  <Method Object get(Object)>
	//    6   12:checkcast       #32  <Class PorterDuffColorFilter>
	//    7   15:areturn         
	}

	PorterDuffColorFilter put(int j, android.graphics.PorterDuff.Mode mode, PorterDuffColorFilter porterduffcolorfilter)
	{
		return (PorterDuffColorFilter)put(((Object) (Integer.valueOf(generateCacheKey(j, mode)))), ((Object) (porterduffcolorfilter)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #21  <Method int generateCacheKey(int, android.graphics.PorterDuff$Mode)>
	//    4    6:invokestatic    #27  <Method Integer Integer.valueOf(int)>
	//    5    9:aload_3         
	//    6   10:invokevirtual   #37  <Method Object put(Object, Object)>
	//    7   13:checkcast       #32  <Class PorterDuffColorFilter>
	//    8   16:areturn         
	}

	public AppCompatDrawableManager$ColorFilterLruCache(int j)
	{
		super(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #8   <Method void i(int)>
	//    3    5:return          
	}
}
