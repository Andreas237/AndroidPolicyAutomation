// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.PointF;
import android.support.v4.view.animation.PathInterpolatorCompat;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			Keyframe, JsonUtils, LottieComposition

static class Keyframe$Factory
{

	static Keyframe newInstance(JSONObject jsonobject, LottieComposition lottiecomposition, float f, actory actory)
	{
		boolean flag1 = jsonobject.has("t");
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "t">
	//    2    3:invokevirtual   #17  <Method boolean JSONObject.has(String)>
	//    3    6:istore          7
		Object obj1 = null;
	//    4    8:aconst_null     
	//    5    9:astore          9
		Object obj;
		if(flag1)
	//*   6   11:iload           7
	//*   7   13:ifeq            224
		{
			float f1 = (float)jsonobject.optDouble("t", 0.0D);
	//    8   16:aload_0         
	//    9   17:ldc1            #11  <String "t">
	//   10   19:dconst_0        
	//   11   20:invokevirtual   #21  <Method double JSONObject.optDouble(String, double)>
	//   12   23:d2f             
	//   13   24:fstore          4
			obj = jsonobject.opt("s");
	//   14   26:aload_0         
	//   15   27:ldc1            #23  <String "s">
	//   16   29:invokevirtual   #27  <Method Object JSONObject.opt(String)>
	//   17   32:astore          8
			if(obj != null)
	//*  18   34:aload           8
	//*  19   36:ifnull          53
				obj = actory.valueFromObject(obj, f);
	//   20   39:aload_3         
	//   21   40:aload           8
	//   22   42:fload_2         
	//   23   43:invokeinterface #33  <Method Object AnimatableValue$Factory.valueFromObject(Object, float)>
	//   24   48:astore          8
			else
	//*  25   50:goto            56
				obj = null;
	//   26   53:aconst_null     
	//   27   54:astore          8
			Object obj2 = jsonobject.opt("e");
	//   28   56:aload_0         
	//   29   57:ldc1            #35  <String "e">
	//   30   59:invokevirtual   #27  <Method Object JSONObject.opt(String)>
	//   31   62:astore          10
			if(obj2 != null)
	//*  32   64:aload           10
	//*  33   66:ifnull          82
				actory = ((actory) (actory.valueFromObject(obj2, f)));
	//   34   69:aload_3         
	//   35   70:aload           10
	//   36   72:fload_2         
	//   37   73:invokeinterface #33  <Method Object AnimatableValue$Factory.valueFromObject(Object, float)>
	//   38   78:astore_3        
			else
	//*  39   79:goto            84
				actory = null;
	//   40   82:aconst_null     
	//   41   83:astore_3        
			JSONObject jsonobject1 = jsonobject.optJSONObject("o");
	//   42   84:aload_0         
	//   43   85:ldc1            #37  <String "o">
	//   44   87:invokevirtual   #41  <Method JSONObject JSONObject.optJSONObject(String)>
	//   45   90:astore          11
			obj2 = ((Object) (jsonobject.optJSONObject("i")));
	//   46   92:aload_0         
	//   47   93:ldc1            #43  <String "i">
	//   48   95:invokevirtual   #41  <Method JSONObject JSONObject.optJSONObject(String)>
	//   49   98:astore          10
			if(jsonobject1 != null && obj2 != null)
	//*  50  100:aload           11
	//*  51  102:ifnull          129
	//*  52  105:aload           10
	//*  53  107:ifnull          129
			{
				obj1 = ((Object) (JsonUtils.pointFromJsonObject(jsonobject1, f)));
	//   54  110:aload           11
	//   55  112:fload_2         
	//   56  113:invokestatic    #49  <Method PointF JsonUtils.pointFromJsonObject(JSONObject, float)>
	//   57  116:astore          9
				obj2 = ((Object) (JsonUtils.pointFromJsonObject(((JSONObject) (obj2)), f)));
	//   58  118:aload           10
	//   59  120:fload_2         
	//   60  121:invokestatic    #49  <Method PointF JsonUtils.pointFromJsonObject(JSONObject, float)>
	//   61  124:astore          10
			} else
	//*  62  126:goto            132
			{
				obj2 = null;
	//   63  129:aconst_null     
	//   64  130:astore          10
			}
			int i = jsonobject.optInt("h", 0);
	//   65  132:aload_0         
	//   66  133:ldc1            #51  <String "h">
	//   67  135:iconst_0        
	//   68  136:invokevirtual   #55  <Method int JSONObject.optInt(String, int)>
	//   69  139:istore          6
			boolean flag = true;
	//   70  141:iconst_1        
	//   71  142:istore          5
			if(i != 1)
	//*  72  144:iload           6
	//*  73  146:iconst_1        
	//*  74  147:icmpne          153
	//*  75  150:goto            156
				flag = false;
	//   76  153:iconst_0        
	//   77  154:istore          5
			if(flag)
	//*  78  156:iload           5
	//*  79  158:ifeq            171
			{
				jsonobject = ((JSONObject) (Keyframe.access$000()));
	//   80  161:invokestatic    #59  <Method android.view.animation.Interpolator Keyframe.access$000()>
	//   81  164:astore_0        
				actory = ((actory) (obj));
	//   82  165:aload           8
	//   83  167:astore_3        
			} else
	//*  84  168:goto            215
			if(obj1 != null)
	//*  85  171:aload           9
	//*  86  173:ifnull          211
				jsonobject = ((JSONObject) (PathInterpolatorCompat.create(((PointF) (obj1)).x / f, ((PointF) (obj1)).y / f, ((PointF) (obj2)).x / f, ((PointF) (obj2)).y / f)));
	//   87  176:aload           9
	//   88  178:getfield        #65  <Field float PointF.x>
	//   89  181:fload_2         
	//   90  182:fdiv            
	//   91  183:aload           9
	//   92  185:getfield        #68  <Field float PointF.y>
	//   93  188:fload_2         
	//   94  189:fdiv            
	//   95  190:aload           10
	//   96  192:getfield        #65  <Field float PointF.x>
	//   97  195:fload_2         
	//   98  196:fdiv            
	//   99  197:aload           10
	//  100  199:getfield        #68  <Field float PointF.y>
	//  101  202:fload_2         
	//  102  203:fdiv            
	//  103  204:invokestatic    #74  <Method android.view.animation.Interpolator PathInterpolatorCompat.create(float, float, float, float)>
	//  104  207:astore_0        
			else
	//* 105  208:goto            215
				jsonobject = ((JSONObject) (Keyframe.access$000()));
	//  106  211:invokestatic    #59  <Method android.view.animation.Interpolator Keyframe.access$000()>
	//  107  214:astore_0        
			f = f1;
	//  108  215:fload           4
	//  109  217:fstore_2        
			obj1 = ((Object) (jsonobject));
	//  110  218:aload_0         
	//  111  219:astore          9
		} else
	//* 112  221:goto            243
		{
			jsonobject = ((JSONObject) (actory.valueFromObject(((Object) (jsonobject)), f)));
	//  113  224:aload_3         
	//  114  225:aload_0         
	//  115  226:fload_2         
	//  116  227:invokeinterface #33  <Method Object AnimatableValue$Factory.valueFromObject(Object, float)>
	//  117  232:astore_0        
			obj1 = null;
	//  118  233:aconst_null     
	//  119  234:astore          9
			actory = ((actory) (jsonobject));
	//  120  236:aload_0         
	//  121  237:astore_3        
			f = 0.0F;
	//  122  238:fconst_0        
	//  123  239:fstore_2        
			obj = ((Object) (jsonobject));
	//  124  240:aload_0         
	//  125  241:astore          8
		}
		return new Keyframe(lottiecomposition, obj, ((Object) (actory)), ((android.view.animation.Interpolator) (obj1)), f, ((Float) (null)));
	//  126  243:new             #6   <Class Keyframe>
	//  127  246:dup             
	//  128  247:aload_1         
	//  129  248:aload           8
	//  130  250:aload_3         
	//  131  251:aload           9
	//  132  253:fload_2         
	//  133  254:aconst_null     
	//  134  255:invokespecial   #78  <Method void Keyframe(LottieComposition, Object, Object, android.view.animation.Interpolator, float, Float)>
	//  135  258:areturn         
	}

	static List parseKeyframes(JSONArray jsonarray, LottieComposition lottiecomposition, float f, actory actory)
	{
		int j = jsonarray.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method int JSONArray.length()>
	//    2    4:istore          5
		if(j == 0)
	//*   3    6:iload           5
	//*   4    8:ifne            15
			return Collections.emptyList();
	//    5   11:invokestatic    #95  <Method List Collections.emptyList()>
	//    6   14:areturn         
		ArrayList arraylist = new ArrayList();
	//    7   15:new             #97  <Class ArrayList>
	//    8   18:dup             
	//    9   19:invokespecial   #100 <Method void ArrayList()>
	//   10   22:astore          6
		for(int i = 0; i < j; i++)
	//*  11   24:iconst_0        
	//*  12   25:istore          4
	//*  13   27:iload           4
	//*  14   29:iload           5
	//*  15   31:icmpge          63
			((List) (arraylist)).add(((Object) (newInstance(jsonarray.optJSONObject(i), lottiecomposition, f, actory))));
	//   16   34:aload           6
	//   17   36:aload_0         
	//   18   37:iload           4
	//   19   39:invokevirtual   #103 <Method JSONObject JSONArray.optJSONObject(int)>
	//   20   42:aload_1         
	//   21   43:fload_2         
	//   22   44:aload_3         
	//   23   45:invokestatic    #105 <Method Keyframe newInstance(JSONObject, LottieComposition, float, AnimatableValue$Factory)>
	//   24   48:invokeinterface #111 <Method boolean List.add(Object)>
	//   25   53:pop             

	//   26   54:iload           4
	//   27   56:iconst_1        
	//   28   57:iadd            
	//   29   58:istore          4
	//*  30   60:goto            27
		Keyframe.setEndFrames(((List) (arraylist)));
	//   31   63:aload           6
	//   32   65:invokestatic    #115 <Method void Keyframe.setEndFrames(List)>
		return ((List) (arraylist));
	//   33   68:aload           6
	//   34   70:areturn         
	}
}
