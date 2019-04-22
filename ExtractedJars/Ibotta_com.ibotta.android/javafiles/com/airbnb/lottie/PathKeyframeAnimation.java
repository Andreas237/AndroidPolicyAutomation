// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			KeyframeAnimation, PathKeyframe, Keyframe

class PathKeyframeAnimation extends KeyframeAnimation
{

	PathKeyframeAnimation(List list)
	{
		super(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void KeyframeAnimation(List)>
	//    3    5:aload_0         
	//    4    6:new             #19  <Class PointF>
	//    5    9:dup             
	//    6   10:invokespecial   #22  <Method void PointF()>
	//    7   13:putfield        #24  <Field PointF point>
	//    8   16:aload_0         
	//    9   17:iconst_2        
	//   10   18:newarray        float[]
	//   11   20:putfield        #26  <Field float[] pos>
	//   12   23:return          
	}

	public PointF getValue(Keyframe keyframe, float f)
	{
		PathKeyframe pathkeyframe = (PathKeyframe)keyframe;
	//    0    0:aload_1         
	//    1    1:checkcast       #33  <Class PathKeyframe>
	//    2    4:astore_3        
		android.graphics.Path path = pathkeyframe.getPath();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #37  <Method android.graphics.Path PathKeyframe.getPath()>
	//    5    9:astore          4
		if(path == null)
	//*   6   11:aload           4
	//*   7   13:ifnonnull       24
			return (PointF)keyframe.startValue;
	//    8   16:aload_1         
	//    9   17:getfield        #43  <Field Object Keyframe.startValue>
	//   10   20:checkcast       #19  <Class PointF>
	//   11   23:areturn         
		if(pathMeasureKeyframe != pathkeyframe)
	//*  12   24:aload_0         
	//*  13   25:getfield        #45  <Field PathKeyframe pathMeasureKeyframe>
	//*  14   28:aload_3         
	//*  15   29:if_acmpeq       51
		{
			pathMeasure = new PathMeasure(path, false);
	//   16   32:aload_0         
	//   17   33:new             #47  <Class PathMeasure>
	//   18   36:dup             
	//   19   37:aload           4
	//   20   39:iconst_0        
	//   21   40:invokespecial   #50  <Method void PathMeasure(android.graphics.Path, boolean)>
	//   22   43:putfield        #52  <Field PathMeasure pathMeasure>
			pathMeasureKeyframe = pathkeyframe;
	//   23   46:aload_0         
	//   24   47:aload_3         
	//   25   48:putfield        #45  <Field PathKeyframe pathMeasureKeyframe>
		}
		keyframe = ((Keyframe) (pathMeasure));
	//   26   51:aload_0         
	//   27   52:getfield        #52  <Field PathMeasure pathMeasure>
	//   28   55:astore_1        
		((PathMeasure) (keyframe)).getPosTan(f * ((PathMeasure) (keyframe)).getLength(), pos, ((float []) (null)));
	//   29   56:aload_1         
	//   30   57:fload_2         
	//   31   58:aload_1         
	//   32   59:invokevirtual   #56  <Method float PathMeasure.getLength()>
	//   33   62:fmul            
	//   34   63:aload_0         
	//   35   64:getfield        #26  <Field float[] pos>
	//   36   67:aconst_null     
	//   37   68:invokevirtual   #60  <Method boolean PathMeasure.getPosTan(float, float[], float[])>
	//   38   71:pop             
		keyframe = ((Keyframe) (point));
	//   39   72:aload_0         
	//   40   73:getfield        #24  <Field PointF point>
	//   41   76:astore_1        
		float af[] = pos;
	//   42   77:aload_0         
	//   43   78:getfield        #26  <Field float[] pos>
	//   44   81:astore_3        
		((PointF) (keyframe)).set(af[0], af[1]);
	//   45   82:aload_1         
	//   46   83:aload_3         
	//   47   84:iconst_0        
	//   48   85:faload          
	//   49   86:aload_3         
	//   50   87:iconst_1        
	//   51   88:faload          
	//   52   89:invokevirtual   #64  <Method void PointF.set(float, float)>
		return point;
	//   53   92:aload_0         
	//   54   93:getfield        #24  <Field PointF point>
	//   55   96:areturn         
	}

	public volatile Object getValue(Keyframe keyframe, float f)
	{
		return ((Object) (getValue(keyframe, f)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:invokevirtual   #68  <Method PointF getValue(Keyframe, float)>
	//    4    6:areturn         
	}

	private PathMeasure pathMeasure;
	private PathKeyframe pathMeasureKeyframe;
	private final PointF point = new PointF();
	private final float pos[] = new float[2];
}
