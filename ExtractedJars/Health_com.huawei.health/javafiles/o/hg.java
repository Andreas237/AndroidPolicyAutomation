// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package o:
//			gy

public final class hg extends gy
{

	public hg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void gy()>
	//    2    4:return          
	}

	protected final String b()
	{
		return "5.0.0";
	//    0    0:ldc1            #13  <String "5.0.0">
	//    1    2:areturn         
	}

	protected final JSONObject d()
		throws JSONException
	{
		return gy.c("sdkConfig", "obtain");
	//    0    0:ldc1            #19  <String "sdkConfig">
	//    1    2:ldc1            #21  <String "obtain">
	//    2    4:invokestatic    #25  <Method JSONObject gy.c(String, String)>
	//    3    7:areturn         
	}
}
