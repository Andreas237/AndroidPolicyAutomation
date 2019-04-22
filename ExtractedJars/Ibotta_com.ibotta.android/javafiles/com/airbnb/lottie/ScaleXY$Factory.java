// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONArray;

// Referenced classes of package com.airbnb.lottie:
//			ScaleXY

static class ScaleXY$Factory
	implements Factory
{

	public ScaleXY valueFromObject(Object obj, float f)
	{
		obj = ((Object) ((JSONArray)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #25  <Class JSONArray>
	//    2    4:astore_1        
		return new ScaleXY(((float)((JSONArray) (obj)).optDouble(0, 1.0D) / 100F) * f, ((float)((JSONArray) (obj)).optDouble(1, 1.0D) / 100F) * f);
	//    3    5:new             #9   <Class ScaleXY>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:dconst_1        
	//    8   12:invokevirtual   #29  <Method double JSONArray.optDouble(int, double)>
	//    9   15:d2f             
	//   10   16:ldc1            #30  <Float 100F>
	//   11   18:fdiv            
	//   12   19:fload_2         
	//   13   20:fmul            
	//   14   21:aload_1         
	//   15   22:iconst_1        
	//   16   23:dconst_1        
	//   17   24:invokevirtual   #29  <Method double JSONArray.optDouble(int, double)>
	//   18   27:d2f             
	//   19   28:ldc1            #30  <Float 100F>
	//   20   30:fdiv            
	//   21   31:fload_2         
	//   22   32:fmul            
	//   23   33:invokespecial   #33  <Method void ScaleXY(float, float)>
	//   24   36:areturn         
	}

	public volatile Object valueFromObject(Object obj, float f)
	{
		return ((Object) (valueFromObject(obj, f)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:invokevirtual   #36  <Method ScaleXY valueFromObject(Object, float)>
	//    4    6:areturn         
	}

	static final ScaleXY$Factory INSTANCE = new ScaleXY$Factory();

	static 
	{
	//    0    0:new             #2   <Class ScaleXY$Factory>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void ScaleXY$Factory()>
	//    3    7:putstatic       #19  <Field ScaleXY$Factory INSTANCE>
	//*   4   10:return          
	}

	private ScaleXY$Factory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}
}
