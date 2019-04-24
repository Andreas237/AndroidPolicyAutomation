// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.*;
import android.util.Property;

class PathProperty extends Property
{

	PathProperty(Property property, Path path)
	{
		super(java/lang/Float, property.getName());
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <Class Float>
	//    2    3:aload_1         
	//    3    4:invokevirtual   #25  <Method String Property.getName()>
	//    4    7:invokespecial   #28  <Method void Property(Class, String)>
	//    5   10:aload_0         
	//    6   11:iconst_2        
	//    7   12:newarray        float[]
	//    8   14:putfield        #30  <Field float[] mPosition>
	//    9   17:aload_0         
	//   10   18:new             #32  <Class PointF>
	//   11   21:dup             
	//   12   22:invokespecial   #35  <Method void PointF()>
	//   13   25:putfield        #37  <Field PointF mPointF>
		mProperty = property;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:putfield        #39  <Field Property mProperty>
		mPathMeasure = new PathMeasure(path, false);
	//   17   33:aload_0         
	//   18   34:new             #41  <Class PathMeasure>
	//   19   37:dup             
	//   20   38:aload_2         
	//   21   39:iconst_0        
	//   22   40:invokespecial   #44  <Method void PathMeasure(Path, boolean)>
	//   23   43:putfield        #46  <Field PathMeasure mPathMeasure>
		mPathLength = mPathMeasure.getLength();
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #46  <Field PathMeasure mPathMeasure>
	//   27   51:invokevirtual   #50  <Method float PathMeasure.getLength()>
	//   28   54:putfield        #52  <Field float mPathLength>
	//   29   57:return          
	}

	public Float get(Object obj)
	{
		return Float.valueOf(mCurrentFraction);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field float mCurrentFraction>
	//    2    4:invokestatic    #63  <Method Float Float.valueOf(float)>
	//    3    7:areturn         
	}

	public volatile Object get(Object obj)
	{
		return ((Object) (get(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #67  <Method Float get(Object)>
	//    3    5:areturn         
	}

	public void set(Object obj, Float float1)
	{
		mCurrentFraction = float1.floatValue();
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #72  <Method float Float.floatValue()>
	//    3    5:putfield        #59  <Field float mCurrentFraction>
		mPathMeasure.getPosTan(mPathLength * float1.floatValue(), mPosition, ((float []) (null)));
	//    4    8:aload_0         
	//    5    9:getfield        #46  <Field PathMeasure mPathMeasure>
	//    6   12:aload_0         
	//    7   13:getfield        #52  <Field float mPathLength>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #72  <Method float Float.floatValue()>
	//   10   20:fmul            
	//   11   21:aload_0         
	//   12   22:getfield        #30  <Field float[] mPosition>
	//   13   25:aconst_null     
	//   14   26:invokevirtual   #76  <Method boolean PathMeasure.getPosTan(float, float[], float[])>
	//   15   29:pop             
		mPointF.x = mPosition[0];
	//   16   30:aload_0         
	//   17   31:getfield        #37  <Field PointF mPointF>
	//   18   34:aload_0         
	//   19   35:getfield        #30  <Field float[] mPosition>
	//   20   38:iconst_0        
	//   21   39:faload          
	//   22   40:putfield        #79  <Field float PointF.x>
		mPointF.y = mPosition[1];
	//   23   43:aload_0         
	//   24   44:getfield        #37  <Field PointF mPointF>
	//   25   47:aload_0         
	//   26   48:getfield        #30  <Field float[] mPosition>
	//   27   51:iconst_1        
	//   28   52:faload          
	//   29   53:putfield        #82  <Field float PointF.y>
		mProperty.set(obj, ((Object) (mPointF)));
	//   30   56:aload_0         
	//   31   57:getfield        #39  <Field Property mProperty>
	//   32   60:aload_1         
	//   33   61:aload_0         
	//   34   62:getfield        #37  <Field PointF mPointF>
	//   35   65:invokevirtual   #85  <Method void Property.set(Object, Object)>
	//   36   68:return          
	}

	public volatile void set(Object obj, Object obj1)
	{
		set(obj, (Float)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #21  <Class Float>
	//    4    6:invokevirtual   #88  <Method void set(Object, Float)>
	//    5    9:return          
	}

	private float mCurrentFraction;
	private final float mPathLength;
	private final PathMeasure mPathMeasure;
	private final PointF mPointF = new PointF();
	private final float mPosition[] = new float[2];
	private final Property mProperty;
}
