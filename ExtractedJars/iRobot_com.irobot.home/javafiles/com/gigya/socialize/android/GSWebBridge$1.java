// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import java.util.Locale;
import org.json.JSONArray;

// Referenced classes of package com.gigya.socialize.android:
//			GSWebBridge, GSAPI

static final class GSWebBridge$1
{

	public String getAPIKey()
	{
		return GSAPI.getInstance().getAPIKey();
	//    0    0:invokestatic    #28  <Method GSAPI GSAPI.getInstance()>
	//    1    3:invokevirtual   #30  <Method String GSAPI.getAPIKey()>
	//    2    6:areturn         
	}

	public String getAdapterName()
	{
		return "mobile";
	//    0    0:ldc1            #34  <String "mobile">
	//    1    2:areturn         
	}

	public String getFeatures()
	{
		JSONArray jsonarray = new JSONArray();
	//    0    0:new             #37  <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void JSONArray()>
	//    3    7:astore_3        
		WebBridgeActions awebbridgeactions[] = WebBridgeActions.values();
	//    4    8:invokestatic    #44  <Method GSWebBridge$GSWebBridgeActions[] GSWebBridge$GSWebBridgeActions.values()>
	//    5   11:astore          4
		int j = awebbridgeactions.length;
	//    6   13:aload           4
	//    7   15:arraylength     
	//    8   16:istore_2        
		for(int i = 0; i < j; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore_1        
	//*  11   19:iload_1         
	//*  12   20:iload_2         
	//*  13   21:icmpge          49
			jsonarray.put(((Object) (awebbridgeactions[i].toString().toLowerCase(Locale.ROOT))));
	//   14   24:aload_3         
	//   15   25:aload           4
	//   16   27:iload_1         
	//   17   28:aaload          
	//   18   29:invokevirtual   #47  <Method String GSWebBridge$GSWebBridgeActions.toString()>
	//   19   32:getstatic       #53  <Field Locale Locale.ROOT>
	//   20   35:invokevirtual   #59  <Method String String.toLowerCase(Locale)>
	//   21   38:invokevirtual   #63  <Method JSONArray JSONArray.put(Object)>
	//   22   41:pop             

	//   23   42:iload_1         
	//   24   43:iconst_1        
	//   25   44:iadd            
	//   26   45:istore_1        
	//*  27   46:goto            19
		return jsonarray.toString();
	//   28   49:aload_3         
	//   29   50:invokevirtual   #64  <Method String JSONArray.toString()>
	//   30   53:areturn         
	}

	public String getObfuscationStrategy()
	{
		GSAPI.getInstance();
	//    0    0:invokestatic    #28  <Method GSAPI GSAPI.getInstance()>
	//    1    3:pop             
		if(GSAPI.OPTION_OBFUSCATION_ENABLED)
	//*   2    4:getstatic       #69  <Field boolean GSAPI.OPTION_OBFUSCATION_ENABLED>
	//*   3    7:ifeq            13
			return "base64";
	//    4   10:ldc1            #71  <String "base64">
	//    5   12:areturn         
		else
			return "";
	//    6   13:ldc1            #73  <String "">
	//    7   15:areturn         
	}

	public boolean sendToMobile(String s, String s1, String s2)
	{
		return val$bridge.invoke(s, s1, s2);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GSWebBridge val$bridge>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #78  <Method boolean GSWebBridge.invoke(String, String, String)>
	//    6   10:ireturn         
	}

	final GSWebBridge val$bridge;

	GSWebBridge$1(GSWebBridge gswebbridge)
	{
		val$bridge = gswebbridge;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field GSWebBridge val$bridge>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
