// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			ShapeGroup, LottieComposition

static class ShapeGroup$Factory
{

	private static ShapeGroup newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
	{
		JSONArray jsonarray = jsonobject.optJSONArray("it");
	//    0    0:aload_0         
	//    1    1:ldc1            #15  <String "it">
	//    2    3:invokevirtual   #21  <Method JSONArray JSONObject.optJSONArray(String)>
	//    3    6:astore_3        
		jsonobject = ((JSONObject) (jsonobject.optString("nm")));
	//    4    7:aload_0         
	//    5    8:ldc1            #23  <String "nm">
	//    6   10:invokevirtual   #27  <Method String JSONObject.optString(String)>
	//    7   13:astore_0        
		ArrayList arraylist = new ArrayList();
	//    8   14:new             #29  <Class ArrayList>
	//    9   17:dup             
	//   10   18:invokespecial   #33  <Method void ArrayList()>
	//   11   21:astore          4
		for(int i = 0; i < jsonarray.length(); i++)
	//*  12   23:iconst_0        
	//*  13   24:istore_2        
	//*  14   25:iload_2         
	//*  15   26:aload_3         
	//*  16   27:invokevirtual   #39  <Method int JSONArray.length()>
	//*  17   30:icmpge          66
		{
			Object obj = ShapeGroup.shapeItemWithJson(jsonarray.optJSONObject(i), lottiecomposition);
	//   18   33:aload_3         
	//   19   34:iload_2         
	//   20   35:invokevirtual   #43  <Method JSONObject JSONArray.optJSONObject(int)>
	//   21   38:aload_1         
	//   22   39:invokestatic    #47  <Method Object ShapeGroup.shapeItemWithJson(JSONObject, LottieComposition)>
	//   23   42:astore          5
			if(obj != null)
	//*  24   44:aload           5
	//*  25   46:ifnull          59
				((List) (arraylist)).add(obj);
	//   26   49:aload           4
	//   27   51:aload           5
	//   28   53:invokeinterface #53  <Method boolean List.add(Object)>
	//   29   58:pop             
		}

	//   30   59:iload_2         
	//   31   60:iconst_1        
	//   32   61:iadd            
	//   33   62:istore_2        
	//*  34   63:goto            25
		return new ShapeGroup(((String) (jsonobject)), ((List) (arraylist)));
	//   35   66:new             #6   <Class ShapeGroup>
	//   36   69:dup             
	//   37   70:aload_0         
	//   38   71:aload           4
	//   39   73:invokespecial   #56  <Method void ShapeGroup(String, List)>
	//   40   76:areturn         
	}


/*
	static ShapeGroup access$000(JSONObject jsonobject, LottieComposition lottiecomposition)
	{
		return newInstance(jsonobject, lottiecomposition);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #12  <Method ShapeGroup newInstance(JSONObject, LottieComposition)>
	//    3    5:areturn         
	}

*/
}
