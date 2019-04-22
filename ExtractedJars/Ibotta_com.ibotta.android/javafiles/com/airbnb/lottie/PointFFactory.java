// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.PointF;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			JsonUtils

class PointFFactory
	implements AnimatableValue.Factory
{

	private PointFFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public PointF valueFromObject(Object obj, float f)
	{
		if(obj instanceof JSONArray)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #22  <Class JSONArray>
	//*   2    4:ifeq            16
			return JsonUtils.pointFromJsonArray((JSONArray)obj, f);
	//    3    7:aload_1         
	//    4    8:checkcast       #22  <Class JSONArray>
	//    5   11:fload_2         
	//    6   12:invokestatic    #28  <Method PointF JsonUtils.pointFromJsonArray(JSONArray, float)>
	//    7   15:areturn         
		if(obj instanceof JSONObject)
	//*   8   16:aload_1         
	//*   9   17:instanceof      #30  <Class JSONObject>
	//*  10   20:ifeq            32
		{
			return JsonUtils.pointFromJsonObject((JSONObject)obj, f);
	//   11   23:aload_1         
	//   12   24:checkcast       #30  <Class JSONObject>
	//   13   27:fload_2         
	//   14   28:invokestatic    #34  <Method PointF JsonUtils.pointFromJsonObject(JSONObject, float)>
	//   15   31:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   16   32:new             #36  <Class StringBuilder>
	//   17   35:dup             
	//   18   36:invokespecial   #37  <Method void StringBuilder()>
	//   19   39:astore_3        
			stringbuilder.append("Unable to parse point from ");
	//   20   40:aload_3         
	//   21   41:ldc1            #39  <String "Unable to parse point from ">
	//   22   43:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
			stringbuilder.append(obj);
	//   24   47:aload_3         
	//   25   48:aload_1         
	//   26   49:invokevirtual   #46  <Method StringBuilder StringBuilder.append(Object)>
	//   27   52:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   28   53:new             #48  <Class IllegalArgumentException>
	//   29   56:dup             
	//   30   57:aload_3         
	//   31   58:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   32   61:invokespecial   #55  <Method void IllegalArgumentException(String)>
	//   33   64:athrow          
		}
	}

	public volatile Object valueFromObject(Object obj, float f)
	{
		return ((Object) (valueFromObject(obj, f)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:invokevirtual   #58  <Method PointF valueFromObject(Object, float)>
	//    4    6:areturn         
	}

	static final PointFFactory INSTANCE = new PointFFactory();

	static 
	{
	//    0    0:new             #2   <Class PointFFactory>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void PointFFactory()>
	//    3    7:putstatic       #16  <Field PointFFactory INSTANCE>
	//*   4   10:return          
	}
}
