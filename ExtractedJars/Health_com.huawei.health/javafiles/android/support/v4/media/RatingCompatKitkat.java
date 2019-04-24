// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.media.Rating;

class RatingCompatKitkat
{

	RatingCompatKitkat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static float getPercentRating(Object obj)
	{
		return ((Rating)obj).getPercentRating();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class Rating>
	//    2    4:invokevirtual   #19  <Method float Rating.getPercentRating()>
	//    3    7:freturn         
	}

	public static int getRatingStyle(Object obj)
	{
		return ((Rating)obj).getRatingStyle();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class Rating>
	//    2    4:invokevirtual   #24  <Method int Rating.getRatingStyle()>
	//    3    7:ireturn         
	}

	public static float getStarRating(Object obj)
	{
		return ((Rating)obj).getStarRating();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class Rating>
	//    2    4:invokevirtual   #27  <Method float Rating.getStarRating()>
	//    3    7:freturn         
	}

	public static boolean hasHeart(Object obj)
	{
		return ((Rating)obj).hasHeart();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class Rating>
	//    2    4:invokevirtual   #32  <Method boolean Rating.hasHeart()>
	//    3    7:ireturn         
	}

	public static boolean isRated(Object obj)
	{
		return ((Rating)obj).isRated();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class Rating>
	//    2    4:invokevirtual   #35  <Method boolean Rating.isRated()>
	//    3    7:ireturn         
	}

	public static boolean isThumbUp(Object obj)
	{
		return ((Rating)obj).isThumbUp();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class Rating>
	//    2    4:invokevirtual   #38  <Method boolean Rating.isThumbUp()>
	//    3    7:ireturn         
	}

	public static Object newHeartRating(boolean flag)
	{
		return ((Object) (Rating.newHeartRating(flag)));
	//    0    0:iload_0         
	//    1    1:invokestatic    #43  <Method Rating Rating.newHeartRating(boolean)>
	//    2    4:areturn         
	}

	public static Object newPercentageRating(float f)
	{
		return ((Object) (Rating.newPercentageRating(f)));
	//    0    0:fload_0         
	//    1    1:invokestatic    #48  <Method Rating Rating.newPercentageRating(float)>
	//    2    4:areturn         
	}

	public static Object newStarRating(int i, float f)
	{
		return ((Object) (Rating.newStarRating(i, f)));
	//    0    0:iload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #53  <Method Rating Rating.newStarRating(int, float)>
	//    3    5:areturn         
	}

	public static Object newThumbRating(boolean flag)
	{
		return ((Object) (Rating.newThumbRating(flag)));
	//    0    0:iload_0         
	//    1    1:invokestatic    #56  <Method Rating Rating.newThumbRating(boolean)>
	//    2    4:areturn         
	}

	public static Object newUnratedRating(int i)
	{
		return ((Object) (Rating.newUnratedRating(i)));
	//    0    0:iload_0         
	//    1    1:invokestatic    #61  <Method Rating Rating.newUnratedRating(int)>
	//    2    4:areturn         
	}
}
