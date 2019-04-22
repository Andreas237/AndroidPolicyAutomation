// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appsflyer:
//			AppsFlyerLib, v, AFLogger

public class ServerConfigHandler
{

	public static String getUrl(String s)
	{
		return String.format(s, new Object[] {
			AppsFlyerLib.getInstance().getHost()
		});
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:anewarray       Object[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:invokestatic    #13  <Method AppsFlyerLib AppsFlyerLib.getInstance()>
	//    6   10:invokevirtual   #17  <Method String AppsFlyerLib.getHost()>
	//    7   13:aastore         
	//    8   14:invokestatic    #23  <Method String String.format(String, Object[])>
	//    9   17:areturn         
	}

	static JSONObject _mth02CF(String s)
	{
		String s2 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		String s1 = null;
	//    2    2:aconst_null     
	//    3    3:astore_1        
		try
		{
			s = ((String) (JSONObjectInstrumentation.init(s)));
	//    4    4:aload_0         
	//    5    5:invokestatic    #36  <Method JSONObject JSONObjectInstrumentation.init(String)>
	//    6    8:astore_0        
		}
	//*   7    9:aload_0         
	//*   8   10:astore_1        
	//*   9   11:aload_0         
	//*  10   12:astore_2        
	//*  11   13:aload_0         
	//*  12   14:ldc1            #38  <String "monitor">
	//*  13   16:iconst_0        
	//*  14   17:invokevirtual   #44  <Method boolean JSONObject.optBoolean(String, boolean)>
	//*  15   20:ifeq            35
	//*  16   23:aload_0         
	//*  17   24:astore_1        
	//*  18   25:aload_0         
	//*  19   26:astore_2        
	//*  20   27:invokestatic    #50  <Method v v._mth02CB()>
	//*  21   30:invokevirtual   #54  <Method void v._mth0971()>
	//*  22   33:aload_0         
	//*  23   34:areturn         
	//*  24   35:aload_0         
	//*  25   36:astore_1        
	//*  26   37:aload_0         
	//*  27   38:astore_2        
	//*  28   39:invokestatic    #50  <Method v v._mth02CB()>
	//*  29   42:invokevirtual   #56  <Method void v._mth02CF()>
	//*  30   45:aload_0         
	//*  31   46:astore_1        
	//*  32   47:aload_0         
	//*  33   48:astore_2        
	//*  34   49:invokestatic    #50  <Method v v._mth02CB()>
	//*  35   52:invokevirtual   #59  <Method void v._mth02CE()>
	//*  36   55:aload_0         
	//*  37   56:areturn         
	//*  38   57:astore_0        
	//*  39   58:aload_0         
	//*  40   59:invokevirtual   #62  <Method String Throwable.getMessage()>
	//*  41   62:aload_0         
	//*  42   63:invokestatic    #68  <Method void AFLogger.afErrorLog(String, Throwable)>
	//*  43   66:invokestatic    #50  <Method v v._mth02CB()>
	//*  44   69:invokevirtual   #56  <Method void v._mth02CF()>
	//*  45   72:invokestatic    #50  <Method v v._mth02CB()>
	//*  46   75:invokevirtual   #59  <Method void v._mth02CE()>
	//*  47   78:aload_1         
	//*  48   79:areturn         
	//*  49   80:invokestatic    #50  <Method v v._mth02CB()>
	//*  50   83:invokevirtual   #56  <Method void v._mth02CF()>
	//*  51   86:invokestatic    #50  <Method v v._mth02CB()>
	//*  52   89:invokevirtual   #59  <Method void v._mth02CE()>
	//*  53   92:aload_2         
	//*  54   93:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			v._mth02CB()._mth02CF();
			v._mth02CB()._mth02CE();
			return ((JSONObject) (s2));
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			AFLogger.afErrorLog(((Throwable) (s)).getMessage(), ((Throwable) (s)));
			v._mth02CB()._mth02CF();
			v._mth02CB()._mth02CE();
			return ((JSONObject) (s1));
		}
		s1 = s;
		s2 = s;
		if(!((JSONObject) (s)).optBoolean("monitor", false))
			break MISSING_BLOCK_LABEL_35;
		s1 = s;
		s2 = s;
		v._mth02CB()._mth0971();
		return ((JSONObject) (s));
		s1 = s;
		s2 = s;
		v._mth02CB()._mth02CF();
		s1 = s;
		s2 = s;
		v._mth02CB()._mth02CE();
		return ((JSONObject) (s));
	//*  55   94:astore_0        
	//*  56   95:goto            80
	}
}
