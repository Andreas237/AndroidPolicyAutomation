// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.PointF;
import android.util.Property;

// Referenced classes of package android.support.transition:
//			ChangeTransform

static final class ChangeTransform$2 extends Property
{

	public PointF get(thAnimatorMatrix thanimatormatrix)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public volatile Object get(Object obj)
	{
		return ((Object) (get((thAnimatorMatrix)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #17  <Class ChangeTransform$PathAnimatorMatrix>
	//    3    5:invokevirtual   #19  <Method PointF get(ChangeTransform$PathAnimatorMatrix)>
	//    4    8:areturn         
	}

	public void set(thAnimatorMatrix thanimatormatrix, PointF pointf)
	{
		thanimatormatrix.setTranslation(pointf);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #25  <Method void ChangeTransform$PathAnimatorMatrix.setTranslation(PointF)>
	//    3    5:return          
	}

	public volatile void set(Object obj, Object obj1)
	{
		set((thAnimatorMatrix)obj, (PointF)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #17  <Class ChangeTransform$PathAnimatorMatrix>
	//    3    5:aload_2         
	//    4    6:checkcast       #28  <Class PointF>
	//    5    9:invokevirtual   #30  <Method void set(ChangeTransform$PathAnimatorMatrix, PointF)>
	//    6   12:return          
	}

	ChangeTransform$2(Class class1, String s)
	{
		super(class1, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void Property(Class, String)>
	//    4    6:return          
	}
}
