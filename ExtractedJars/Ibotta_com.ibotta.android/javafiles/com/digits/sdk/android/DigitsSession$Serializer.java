// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.twitter.sdk.android.core.AuthToken;
import com.twitter.sdk.android.core.AuthTokenAdapter;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.persistence.SerializationStrategy;

// Referenced classes of package com.digits.sdk.android:
//			DigitsSession

public static class DigitsSession$Serializer
	implements SerializationStrategy
{

	public DigitsSession deserialize(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
			break MISSING_BLOCK_LABEL_90;
	//    0    0:aload_1         
	//    1    1:invokestatic    #46  <Method boolean TextUtils.isEmpty(CharSequence)>
	//    2    4:ifne            90
		Gson gson1;
		gson1 = gson;
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field Gson gson>
	//    5   11:astore_2        
		if(!(gson1 instanceof Gson))
	//*   6   12:aload_2         
	//*   7   13:instanceof      #48  <Class Gson>
	//*   8   16:ifne            30
		{
			s = ((String) (gson1.fromJson(s, com/digits/sdk/android/DigitsSession)));
	//    9   19:aload_2         
	//   10   20:aload_1         
	//   11   21:ldc1            #9   <Class DigitsSession>
	//   12   23:invokevirtual   #52  <Method Object Gson.fromJson(String, Class)>
	//   13   26:astore_1        
			break MISSING_BLOCK_LABEL_41;
	//   14   27:goto            41
		}
		s = ((String) (GsonInstrumentation.fromJson((Gson)gson1, s, com/digits/sdk/android/DigitsSession)));
	//   15   30:aload_2         
	//   16   31:checkcast       #48  <Class Gson>
	//   17   34:aload_1         
	//   18   35:ldc1            #9   <Class DigitsSession>
	//   19   37:invokestatic    #57  <Method Object GsonInstrumentation.fromJson(Gson, String, Class)>
	//   20   40:astore_1        
		s = ((String) ((DigitsSession)s));
	//   21   41:aload_1         
	//   22   42:checkcast       #9   <Class DigitsSession>
	//   23   45:astore_1        
		if(DigitsSession.access$000(((DigitsSession) (s))) != null)
			break MISSING_BLOCK_LABEL_73;
	//   24   46:aload_1         
	//   25   47:invokestatic    #61  <Method String DigitsSession.access$000(DigitsSession)>
	//   26   50:ifnonnull       73
		s = ((String) (new DigitsSession(((DigitsSession) (s)).getAuthToken(), ((DigitsSession) (s)).getId(), "")));
	//   27   53:new             #9   <Class DigitsSession>
	//   28   56:dup             
	//   29   57:aload_1         
	//   30   58:invokevirtual   #65  <Method AuthToken DigitsSession.getAuthToken()>
	//   31   61:aload_1         
	//   32   62:invokevirtual   #69  <Method long DigitsSession.getId()>
	//   33   65:ldc1            #71  <String "">
	//   34   67:invokespecial   #74  <Method void DigitsSession(AuthToken, long, String)>
	//   35   70:astore_1        
		return ((DigitsSession) (s));
	//   36   71:aload_1         
	//   37   72:areturn         
		return ((DigitsSession) (s));
	//   38   73:aload_1         
	//   39   74:areturn         
		s;
	//   40   75:astore_1        
		Fabric.getLogger().d("Digits", ((Exception) (s)).getMessage());
	//   41   76:invokestatic    #80  <Method Logger Fabric.getLogger()>
	//   42   79:ldc1            #82  <String "Digits">
	//   43   81:aload_1         
	//   44   82:invokevirtual   #86  <Method String Exception.getMessage()>
	//   45   85:invokeinterface #92  <Method void Logger.d(String, String)>
		return null;
	//   46   90:aconst_null     
	//   47   91:areturn         
	}

	public volatile Object deserialize(String s)
	{
		return ((Object) (deserialize(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #95  <Method DigitsSession deserialize(String)>
	//    3    5:areturn         
	}

	public String serialize(DigitsSession digitssession)
	{
		if(digitssession == null || digitssession.getAuthToken() == null)
			break MISSING_BLOCK_LABEL_55;
	//    0    0:aload_1         
	//    1    1:ifnull          55
	//    2    4:aload_1         
	//    3    5:invokevirtual   #65  <Method AuthToken DigitsSession.getAuthToken()>
	//    4    8:ifnull          55
		Gson gson1 = gson;
	//    5   11:aload_0         
	//    6   12:getfield        #35  <Field Gson gson>
	//    7   15:astore_2        
		if(!(gson1 instanceof Gson))
	//*   8   16:aload_2         
	//*   9   17:instanceof      #48  <Class Gson>
	//*  10   20:ifne            29
			return gson1.toJson(((Object) (digitssession)));
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #100 <Method String Gson.toJson(Object)>
	//   14   28:areturn         
		digitssession = ((DigitsSession) (GsonInstrumentation.toJson((Gson)gson1, ((Object) (digitssession)))));
	//   15   29:aload_2         
	//   16   30:checkcast       #48  <Class Gson>
	//   17   33:aload_1         
	//   18   34:invokestatic    #103 <Method String GsonInstrumentation.toJson(Gson, Object)>
	//   19   37:astore_1        
		return ((String) (digitssession));
	//   20   38:aload_1         
	//   21   39:areturn         
		digitssession;
	//   22   40:astore_1        
		Fabric.getLogger().d("Digits", ((Exception) (digitssession)).getMessage());
	//   23   41:invokestatic    #80  <Method Logger Fabric.getLogger()>
	//   24   44:ldc1            #82  <String "Digits">
	//   25   46:aload_1         
	//   26   47:invokevirtual   #86  <Method String Exception.getMessage()>
	//   27   50:invokeinterface #92  <Method void Logger.d(String, String)>
		return "";
	//   28   55:ldc1            #71  <String "">
	//   29   57:areturn         
	}

	public volatile String serialize(Object obj)
	{
		return serialize((DigitsSession)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class DigitsSession>
	//    3    5:invokevirtual   #105 <Method String serialize(DigitsSession)>
	//    4    8:areturn         
	}

	private final Gson gson = (new GsonBuilder()).registerTypeAdapter(com/twitter/sdk/android/core/AuthToken, ((Object) (new AuthTokenAdapter()))).create();

	public DigitsSession$Serializer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class GsonBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void GsonBuilder()>
	//    6   12:ldc1            #22  <Class AuthToken>
	//    7   14:new             #24  <Class AuthTokenAdapter>
	//    8   17:dup             
	//    9   18:invokespecial   #25  <Method void AuthTokenAdapter()>
	//   10   21:invokevirtual   #29  <Method GsonBuilder GsonBuilder.registerTypeAdapter(java.lang.reflect.Type, Object)>
	//   11   24:invokevirtual   #33  <Method Gson GsonBuilder.create()>
	//   12   27:putfield        #35  <Field Gson gson>
	//   13   30:return          
	}
}
