// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

public class LottieImageAsset
{
	static class Factory
	{

		static LottieImageAsset newInstance(JSONObject jsonobject)
		{
			return new LottieImageAsset(jsonobject.optInt("w"), jsonobject.optInt("h"), jsonobject.optString("id"), jsonobject.optString("p"));
		//    0    0:new             #6   <Class LottieImageAsset>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:ldc1            #11  <String "w">
		//    4    7:invokevirtual   #17  <Method int JSONObject.optInt(String)>
		//    5   10:aload_0         
		//    6   11:ldc1            #19  <String "h">
		//    7   13:invokevirtual   #17  <Method int JSONObject.optInt(String)>
		//    8   16:aload_0         
		//    9   17:ldc1            #21  <String "id">
		//   10   19:invokevirtual   #25  <Method String JSONObject.optString(String)>
		//   11   22:aload_0         
		//   12   23:ldc1            #27  <String "p">
		//   13   25:invokevirtual   #25  <Method String JSONObject.optString(String)>
		//   14   28:aconst_null     
		//   15   29:invokespecial   #31  <Method void LottieImageAsset(int, int, String, String, LottieImageAsset$1)>
		//   16   32:areturn         
		}
	}


	private LottieImageAsset(int i, int j, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		width = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #22  <Field int width>
		height = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #24  <Field int height>
		id = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field String id>
		fileName = s1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #28  <Field String fileName>
	//   14   25:return          
	}


	public String getFileName()
	{
		return fileName;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String fileName>
	//    2    4:areturn         
	}

	public String getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String id>
	//    2    4:areturn         
	}

	private final String fileName;
	private final int height;
	private final String id;
	private final int width;
}
