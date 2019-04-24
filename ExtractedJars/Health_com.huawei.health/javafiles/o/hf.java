// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package o:
//			gy

public final class hf extends gy
{

	public hf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void gy()>
	//    2    4:return          
	}

	protected final JSONObject d()
		throws JSONException
	{
		return gy.c("cashier", "main");
	//    0    0:ldc1            #15  <String "cashier">
	//    1    2:ldc1            #17  <String "main">
	//    2    4:invokestatic    #21  <Method JSONObject gy.c(String, String)>
	//    3    7:areturn         
	}
}
