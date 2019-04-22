// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			MergePaths

static class MergePaths$Factory
{

	static MergePaths newInstance(JSONObject jsonobject)
	{
		return new MergePaths(jsonobject.optString("nm"), hsMode.access._mth000(jsonobject.optInt("mm", 1)), ((MergePaths._cls1) (null)));
	//    0    0:new             #6   <Class MergePaths>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #11  <String "nm">
	//    4    7:invokevirtual   #17  <Method String JSONObject.optString(String)>
	//    5   10:aload_0         
	//    6   11:ldc1            #19  <String "mm">
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #23  <Method int JSONObject.optInt(String, int)>
	//    9   17:invokestatic    #29  <Method MergePaths$MergePathsMode MergePaths$MergePathsMode.access$000(int)>
	//   10   20:aconst_null     
	//   11   21:invokespecial   #33  <Method void MergePaths(String, MergePaths$MergePathsMode, MergePaths$1)>
	//   12   24:areturn         
	}
}
