// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.PointF;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			LottieComposition, JsonUtils

class Keyframe
{
	static class Factory
	{

		static Keyframe newInstance(JSONObject jsonobject, LottieComposition lottiecomposition, float f, AnimatableValue.Factory factory)
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
					obj = factory.valueFromObject(obj, f);
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
					factory = ((AnimatableValue.Factory) (factory.valueFromObject(obj2, f)));
		//   34   69:aload_3         
		//   35   70:aload           10
		//   36   72:fload_2         
		//   37   73:invokeinterface #33  <Method Object AnimatableValue$Factory.valueFromObject(Object, float)>
		//   38   78:astore_3        
				else
		//*  39   79:goto            84
					factory = null;
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
					jsonobject = ((JSONObject) (Keyframe.LINEAR_INTERPOLATOR));
		//   80  161:invokestatic    #59  <Method Interpolator Keyframe.access$000()>
		//   81  164:astore_0        
					factory = ((AnimatableValue.Factory) (obj));
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
		//  103  204:invokestatic    #74  <Method Interpolator PathInterpolatorCompat.create(float, float, float, float)>
		//  104  207:astore_0        
				else
		//* 105  208:goto            215
					jsonobject = ((JSONObject) (Keyframe.LINEAR_INTERPOLATOR));
		//  106  211:invokestatic    #59  <Method Interpolator Keyframe.access$000()>
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
				jsonobject = ((JSONObject) (factory.valueFromObject(((Object) (jsonobject)), f)));
		//  113  224:aload_3         
		//  114  225:aload_0         
		//  115  226:fload_2         
		//  116  227:invokeinterface #33  <Method Object AnimatableValue$Factory.valueFromObject(Object, float)>
		//  117  232:astore_0        
				obj1 = null;
		//  118  233:aconst_null     
		//  119  234:astore          9
				factory = ((AnimatableValue.Factory) (jsonobject));
		//  120  236:aload_0         
		//  121  237:astore_3        
				f = 0.0F;
		//  122  238:fconst_0        
		//  123  239:fstore_2        
				obj = ((Object) (jsonobject));
		//  124  240:aload_0         
		//  125  241:astore          8
			}
			return new Keyframe(lottiecomposition, obj, ((Object) (factory)), ((Interpolator) (obj1)), f, ((Float) (null)));
		//  126  243:new             #6   <Class Keyframe>
		//  127  246:dup             
		//  128  247:aload_1         
		//  129  248:aload           8
		//  130  250:aload_3         
		//  131  251:aload           9
		//  132  253:fload_2         
		//  133  254:aconst_null     
		//  134  255:invokespecial   #78  <Method void Keyframe(LottieComposition, Object, Object, Interpolator, float, Float)>
		//  135  258:areturn         
		}

		static List parseKeyframes(JSONArray jsonarray, LottieComposition lottiecomposition, float f, AnimatableValue.Factory factory)
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
				((List) (arraylist)).add(((Object) (newInstance(jsonarray.optJSONObject(i), lottiecomposition, f, factory))));
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


	public Keyframe(LottieComposition lottiecomposition, Object obj, Object obj1, Interpolator interpolator1, float f, Float float1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		composition = lottiecomposition;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #36  <Field LottieComposition composition>
		startValue = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #38  <Field Object startValue>
		endValue = obj1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #40  <Field Object endValue>
		interpolator = interpolator1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #42  <Field Interpolator interpolator>
		startFrame = f;
	//   14   25:aload_0         
	//   15   26:fload           5
	//   16   28:putfield        #44  <Field float startFrame>
		endFrame = float1;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #46  <Field Float endFrame>
	//   20   37:return          
	}

	static void setEndFrames(List list)
	{
		int j = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #59  <Method int List.size()>
	//    2    6:istore_2        
		int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
		int k;
		do
		{
			k = j - 1;
	//    5    9:iload_2         
	//    6   10:iconst_1        
	//    7   11:isub            
	//    8   12:istore_3        
			if(i >= k)
				break;
	//    9   13:iload_1         
	//   10   14:iload_3         
	//   11   15:icmpge          58
			Keyframe keyframe = (Keyframe)list.get(i);
	//   12   18:aload_0         
	//   13   19:iload_1         
	//   14   20:invokeinterface #63  <Method Object List.get(int)>
	//   15   25:checkcast       #2   <Class Keyframe>
	//   16   28:astore          4
			i++;
	//   17   30:iload_1         
	//   18   31:iconst_1        
	//   19   32:iadd            
	//   20   33:istore_1        
			keyframe.endFrame = Float.valueOf(((Keyframe)list.get(i)).startFrame);
	//   21   34:aload           4
	//   22   36:aload_0         
	//   23   37:iload_1         
	//   24   38:invokeinterface #63  <Method Object List.get(int)>
	//   25   43:checkcast       #2   <Class Keyframe>
	//   26   46:getfield        #44  <Field float startFrame>
	//   27   49:invokestatic    #69  <Method Float Float.valueOf(float)>
	//   28   52:putfield        #46  <Field Float endFrame>
		} while(true);
	//   29   55:goto            9
		Keyframe keyframe1 = (Keyframe)list.get(k);
	//   30   58:aload_0         
	//   31   59:iload_3         
	//   32   60:invokeinterface #63  <Method Object List.get(int)>
	//   33   65:checkcast       #2   <Class Keyframe>
	//   34   68:astore          4
		if(keyframe1.startValue == null)
	//*  35   70:aload           4
	//*  36   72:getfield        #38  <Field Object startValue>
	//*  37   75:ifnonnull       87
			list.remove(((Object) (keyframe1)));
	//   38   78:aload_0         
	//   39   79:aload           4
	//   40   81:invokeinterface #73  <Method boolean List.remove(Object)>
	//   41   86:pop             
	//   42   87:return          
	}

	boolean containsProgress(float f)
	{
		return f >= getStartProgress() && f <= getEndProgress();
	//    0    0:fload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #87  <Method float getStartProgress()>
	//    3    5:fcmpl           
	//    4    6:iflt            20
	//    5    9:fload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #90  <Method float getEndProgress()>
	//    8   14:fcmpg           
	//    9   15:ifgt            20
	//   10   18:iconst_1        
	//   11   19:ireturn         
	//   12   20:iconst_0        
	//   13   21:ireturn         
	}

	float getEndProgress()
	{
		Float float1 = endFrame;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Float endFrame>
	//    2    4:astore_1        
		if(float1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 1.0F;
	//    5    9:fconst_1        
	//    6   10:freturn         
		else
			return float1.floatValue() / composition.getDurationFrames();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #93  <Method float Float.floatValue()>
	//    9   15:aload_0         
	//   10   16:getfield        #36  <Field LottieComposition composition>
	//   11   19:invokevirtual   #98  <Method float LottieComposition.getDurationFrames()>
	//   12   22:fdiv            
	//   13   23:freturn         
	}

	float getStartProgress()
	{
		return startFrame / composition.getDurationFrames();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field float startFrame>
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field LottieComposition composition>
	//    4    8:invokevirtual   #98  <Method float LottieComposition.getDurationFrames()>
	//    5   11:fdiv            
	//    6   12:freturn         
	}

	boolean isStatic()
	{
		return interpolator == null;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Interpolator interpolator>
	//    2    4:ifnonnull       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #105 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Keyframe{startValue=");
	//    4    8:aload_1         
	//    5    9:ldc1            #108 <String "Keyframe{startValue=">
	//    6   11:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(startValue);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #38  <Field Object startValue>
	//   11   20:invokevirtual   #115 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", endValue=");
	//   13   24:aload_1         
	//   14   25:ldc1            #117 <String ", endValue=">
	//   15   27:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(endValue);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #40  <Field Object endValue>
	//   20   36:invokevirtual   #115 <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append(", startFrame=");
	//   22   40:aload_1         
	//   23   41:ldc1            #119 <String ", startFrame=">
	//   24   43:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(startFrame);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #44  <Field float startFrame>
	//   29   52:invokevirtual   #122 <Method StringBuilder StringBuilder.append(float)>
	//   30   55:pop             
		stringbuilder.append(", endFrame=");
	//   31   56:aload_1         
	//   32   57:ldc1            #124 <String ", endFrame=">
	//   33   59:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(((Object) (endFrame)));
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #46  <Field Float endFrame>
	//   38   68:invokevirtual   #115 <Method StringBuilder StringBuilder.append(Object)>
	//   39   71:pop             
		stringbuilder.append(", interpolator=");
	//   40   72:aload_1         
	//   41   73:ldc1            #126 <String ", interpolator=">
	//   42   75:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(((Object) (interpolator)));
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #42  <Field Interpolator interpolator>
	//   47   84:invokevirtual   #115 <Method StringBuilder StringBuilder.append(Object)>
	//   48   87:pop             
		stringbuilder.append('}');
	//   49   88:aload_1         
	//   50   89:bipush          125
	//   51   91:invokevirtual   #129 <Method StringBuilder StringBuilder.append(char)>
	//   52   94:pop             
		return stringbuilder.toString();
	//   53   95:aload_1         
	//   54   96:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   55   99:areturn         
	}

	private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
	private final LottieComposition composition;
	Float endFrame;
	final Object endValue;
	final Interpolator interpolator;
	final float startFrame;
	final Object startValue;

	static 
	{
	//    0    0:new             #26  <Class LinearInterpolator>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void LinearInterpolator()>
	//    3    7:putstatic       #31  <Field Interpolator LINEAR_INTERPOLATOR>
	//*   4   10:return          
	}


/*
	static Interpolator access$000()
	{
		return LINEAR_INTERPOLATOR;
	//    0    0:getstatic       #31  <Field Interpolator LINEAR_INTERPOLATOR>
	//    1    3:areturn         
	}

*/
}
