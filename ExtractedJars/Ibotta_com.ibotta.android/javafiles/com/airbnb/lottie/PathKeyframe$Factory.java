// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.PointF;
import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			PathKeyframe, LottieComposition, JsonUtils, Keyframe, 
//			Utils

static class PathKeyframe$Factory
{

	static PathKeyframe newInstance(JSONObject jsonobject, LottieComposition lottiecomposition, ry ry)
	{
		Keyframe keyframe = Keyframe.Factory.newInstance(jsonobject, lottiecomposition, lottiecomposition.getDpScale(), ry);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #15  <Method float LottieComposition.getDpScale()>
	//    4    6:aload_2         
	//    5    7:invokestatic    #20  <Method Keyframe Keyframe$Factory.newInstance(JSONObject, LottieComposition, float, AnimatableValue$Factory)>
	//    6   10:astore_3        
		ry = ((ry) (jsonobject.optJSONArray("ti")));
	//    7   11:aload_0         
	//    8   12:ldc1            #22  <String "ti">
	//    9   14:invokevirtual   #28  <Method org.json.JSONArray JSONObject.optJSONArray(String)>
	//   10   17:astore_2        
		org.json.JSONArray jsonarray = jsonobject.optJSONArray("to");
	//   11   18:aload_0         
	//   12   19:ldc1            #30  <String "to">
	//   13   21:invokevirtual   #28  <Method org.json.JSONArray JSONObject.optJSONArray(String)>
	//   14   24:astore          4
		jsonobject = null;
	//   15   26:aconst_null     
	//   16   27:astore_0        
		if(ry != null && jsonarray != null)
	//*  17   28:aload_2         
	//*  18   29:ifnull          59
	//*  19   32:aload           4
	//*  20   34:ifnull          59
		{
			jsonobject = ((JSONObject) (JsonUtils.pointFromJsonArray(jsonarray, lottiecomposition.getDpScale())));
	//   21   37:aload           4
	//   22   39:aload_1         
	//   23   40:invokevirtual   #15  <Method float LottieComposition.getDpScale()>
	//   24   43:invokestatic    #36  <Method PointF JsonUtils.pointFromJsonArray(org.json.JSONArray, float)>
	//   25   46:astore_0        
			ry = ((ry) (JsonUtils.pointFromJsonArray(((org.json.JSONArray) (ry)), lottiecomposition.getDpScale())));
	//   26   47:aload_2         
	//   27   48:aload_1         
	//   28   49:invokevirtual   #15  <Method float LottieComposition.getDpScale()>
	//   29   52:invokestatic    #36  <Method PointF JsonUtils.pointFromJsonArray(org.json.JSONArray, float)>
	//   30   55:astore_2        
		} else
	//*  31   56:goto            61
		{
			ry = null;
	//   32   59:aconst_null     
	//   33   60:astore_2        
		}
		lottiecomposition = ((LottieComposition) (new PathKeyframe(lottiecomposition, (PointF)keyframe.startValue, (PointF)keyframe.endValue, keyframe.interpolator, keyframe.startFrame, keyframe.endFrame, ((PathKeyframe._cls1) (null)))));
	//   34   61:new             #6   <Class PathKeyframe>
	//   35   64:dup             
	//   36   65:aload_1         
	//   37   66:aload_3         
	//   38   67:getfield        #42  <Field Object Keyframe.startValue>
	//   39   70:checkcast       #44  <Class PointF>
	//   40   73:aload_3         
	//   41   74:getfield        #47  <Field Object Keyframe.endValue>
	//   42   77:checkcast       #44  <Class PointF>
	//   43   80:aload_3         
	//   44   81:getfield        #51  <Field android.view.animation.Interpolator Keyframe.interpolator>
	//   45   84:aload_3         
	//   46   85:getfield        #55  <Field float Keyframe.startFrame>
	//   47   88:aload_3         
	//   48   89:getfield        #59  <Field Float Keyframe.endFrame>
	//   49   92:aconst_null     
	//   50   93:invokespecial   #63  <Method void PathKeyframe(LottieComposition, PointF, PointF, android.view.animation.Interpolator, float, Float, PathKeyframe$1)>
	//   51   96:astore_1        
		if(keyframe.endValue != null && !((PointF)keyframe.startValue).equals(keyframe.endValue))
	//*  52   97:aload_3         
	//*  53   98:getfield        #47  <Field Object Keyframe.endValue>
	//*  54  101:ifnull          145
	//*  55  104:aload_3         
	//*  56  105:getfield        #42  <Field Object Keyframe.startValue>
	//*  57  108:checkcast       #44  <Class PointF>
	//*  58  111:aload_3         
	//*  59  112:getfield        #47  <Field Object Keyframe.endValue>
	//*  60  115:invokevirtual   #67  <Method boolean PointF.equals(Object)>
	//*  61  118:ifne            145
			PathKeyframe.access$102(((PathKeyframe) (lottiecomposition)), Utils.createPath((PointF)keyframe.startValue, (PointF)keyframe.endValue, ((PointF) (jsonobject)), ((PointF) (ry))));
	//   62  121:aload_1         
	//   63  122:aload_3         
	//   64  123:getfield        #42  <Field Object Keyframe.startValue>
	//   65  126:checkcast       #44  <Class PointF>
	//   66  129:aload_3         
	//   67  130:getfield        #47  <Field Object Keyframe.endValue>
	//   68  133:checkcast       #44  <Class PointF>
	//   69  136:aload_0         
	//   70  137:aload_2         
	//   71  138:invokestatic    #73  <Method android.graphics.Path Utils.createPath(PointF, PointF, PointF, PointF)>
	//   72  141:invokestatic    #77  <Method android.graphics.Path PathKeyframe.access$102(PathKeyframe, android.graphics.Path)>
	//   73  144:pop             
		return ((PathKeyframe) (lottiecomposition));
	//   74  145:aload_1         
	//   75  146:areturn         
	}
}
