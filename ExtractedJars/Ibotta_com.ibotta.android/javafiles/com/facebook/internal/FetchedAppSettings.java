// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.net.Uri;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//			Utility, FetchedAppSettingsManager, FacebookRequestErrorClassification

public final class FetchedAppSettings
{
	public static class DialogFeatureConfig
	{

		public static DialogFeatureConfig parseDialogConfig(JSONObject jsonobject)
		{
			String s = jsonobject.optString("name");
		//    0    0:aload_0         
		//    1    1:ldc1            #32  <String "name">
		//    2    3:invokevirtual   #38  <Method String JSONObject.optString(String)>
		//    3    6:astore_3        
			boolean flag = Utility.isNullOrEmpty(s);
		//    4    7:aload_3         
		//    5    8:invokestatic    #44  <Method boolean Utility.isNullOrEmpty(String)>
		//    6   11:istore_1        
			Uri uri = null;
		//    7   12:aconst_null     
		//    8   13:astore_2        
			if(flag)
		//*   9   14:iload_1         
		//*  10   15:ifeq            20
				return null;
		//   11   18:aconst_null     
		//   12   19:areturn         
			String as[] = s.split("\\|");
		//   13   20:aload_3         
		//   14   21:ldc1            #46  <String "\\|">
		//   15   23:invokevirtual   #52  <Method String[] String.split(String)>
		//   16   26:astore          4
			if(as.length != 2)
		//*  17   28:aload           4
		//*  18   30:arraylength     
		//*  19   31:iconst_2        
		//*  20   32:icmpeq          37
				return null;
		//   21   35:aconst_null     
		//   22   36:areturn         
			s = as[0];
		//   23   37:aload           4
		//   24   39:iconst_0        
		//   25   40:aaload          
		//   26   41:astore_3        
			String s1 = as[1];
		//   27   42:aload           4
		//   28   44:iconst_1        
		//   29   45:aaload          
		//   30   46:astore          4
			if(!Utility.isNullOrEmpty(s))
		//*  31   48:aload_3         
		//*  32   49:invokestatic    #44  <Method boolean Utility.isNullOrEmpty(String)>
		//*  33   52:ifne            108
			{
				if(Utility.isNullOrEmpty(s1))
		//*  34   55:aload           4
		//*  35   57:invokestatic    #44  <Method boolean Utility.isNullOrEmpty(String)>
		//*  36   60:ifeq            65
					return null;
		//   37   63:aconst_null     
		//   38   64:areturn         
				String s2 = jsonobject.optString("url");
		//   39   65:aload_0         
		//   40   66:ldc1            #54  <String "url">
		//   41   68:invokevirtual   #38  <Method String JSONObject.optString(String)>
		//   42   71:astore          5
				if(!Utility.isNullOrEmpty(s2))
		//*  43   73:aload           5
		//*  44   75:invokestatic    #44  <Method boolean Utility.isNullOrEmpty(String)>
		//*  45   78:ifne            87
					uri = Uri.parse(s2);
		//   46   81:aload           5
		//   47   83:invokestatic    #60  <Method Uri Uri.parse(String)>
		//   48   86:astore_2        
				return new DialogFeatureConfig(s, s1, uri, parseVersionSpec(jsonobject.optJSONArray("versions")));
		//   49   87:new             #2   <Class FetchedAppSettings$DialogFeatureConfig>
		//   50   90:dup             
		//   51   91:aload_3         
		//   52   92:aload           4
		//   53   94:aload_2         
		//   54   95:aload_0         
		//   55   96:ldc1            #62  <String "versions">
		//   56   98:invokevirtual   #66  <Method JSONArray JSONObject.optJSONArray(String)>
		//   57  101:invokestatic    #70  <Method int[] parseVersionSpec(JSONArray)>
		//   58  104:invokespecial   #72  <Method void FetchedAppSettings$DialogFeatureConfig(String, String, Uri, int[])>
		//   59  107:areturn         
			} else
			{
				return null;
		//   60  108:aconst_null     
		//   61  109:areturn         
			}
		}

		private static int[] parseVersionSpec(JSONArray jsonarray)
		{
			Object obj;
			if(jsonarray != null)
		//*   0    0:aload_0         
		//*   1    1:ifnull          94
			{
				int l = jsonarray.length();
		//    2    4:aload_0         
		//    3    5:invokevirtual   #80  <Method int JSONArray.length()>
		//    4    8:istore          4
				int ai[] = new int[l];
		//    5   10:iload           4
		//    6   12:newarray        int[]
		//    7   14:astore          6
				int j = 0;
		//    8   16:iconst_0        
		//    9   17:istore_2        
label0:
				do
				{
					int i;
label1:
					{
						obj = ((Object) (ai));
		//   10   18:aload           6
		//   11   20:astore          5
						if(j >= l)
							break label0;
		//   12   22:iload_2         
		//   13   23:iload           4
		//   14   25:icmpge          97
						i = -1;
		//   15   28:iconst_m1       
		//   16   29:istore_1        
						int k = jsonarray.optInt(j, -1);
		//   17   30:aload_0         
		//   18   31:iload_2         
		//   19   32:iconst_m1       
		//   20   33:invokevirtual   #84  <Method int JSONArray.optInt(int, int)>
		//   21   36:istore_3        
						if(k == -1)
		//*  22   37:iload_3         
		//*  23   38:iconst_m1       
		//*  24   39:icmpne          80
						{
							obj = ((Object) (jsonarray.optString(j)));
		//   25   42:aload_0         
		//   26   43:iload_2         
		//   27   44:invokevirtual   #87  <Method String JSONArray.optString(int)>
		//   28   47:astore          5
							if(!Utility.isNullOrEmpty(((String) (obj))))
		//*  29   49:aload           5
		//*  30   51:invokestatic    #44  <Method boolean Utility.isNullOrEmpty(String)>
		//*  31   54:ifne            80
							{
								try
								{
									k = Integer.parseInt(((String) (obj)));
		//   32   57:aload           5
		//   33   59:invokestatic    #93  <Method int Integer.parseInt(String)>
		//   34   62:istore_3        
								}
		//*  35   63:iload_3         
		//*  36   64:istore_1        
		//*  37   65:goto            82
								// Misplaced declaration of an exception variable
								catch(Object obj)
		//*  38   68:astore          5
								{
									Utility.logd("FacebookSDK", ((Exception) (obj)));
		//   39   70:ldc1            #95  <String "FacebookSDK">
		//   40   72:aload           5
		//   41   74:invokestatic    #99  <Method void Utility.logd(String, Exception)>
									break label1;
		//   42   77:goto            82
								}
								i = k;
								break label1;
							}
						}
						i = k;
		//   43   80:iload_3         
		//   44   81:istore_1        
					}
					ai[j] = i;
		//   45   82:aload           6
		//   46   84:iload_2         
		//   47   85:iload_1         
		//   48   86:iastore         
					j++;
		//   49   87:iload_2         
		//   50   88:iconst_1        
		//   51   89:iadd            
		//   52   90:istore_2        
				} while(true);
		//   53   91:goto            18
			} else
			{
				obj = null;
		//   54   94:aconst_null     
		//   55   95:astore          5
			}
			return ((int []) (obj));
		//   56   97:aload           5
		//   57   99:areturn         
		}

		public String getDialogName()
		{
			return dialogName;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field String dialogName>
		//    2    4:areturn         
		}

		public Uri getFallbackUrl()
		{
			return fallbackUrl;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Uri fallbackUrl>
		//    2    4:areturn         
		}

		public String getFeatureName()
		{
			return featureName;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field String featureName>
		//    2    4:areturn         
		}

		public int[] getVersionSpec()
		{
			return featureVersionSpec;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field int[] featureVersionSpec>
		//    2    4:areturn         
		}

		private String dialogName;
		private Uri fallbackUrl;
		private String featureName;
		private int featureVersionSpec[];

		private DialogFeatureConfig(String s, String s1, Uri uri, int ai[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			dialogName = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field String dialogName>
			featureName = s1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field String featureName>
			fallbackUrl = uri;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #25  <Field Uri fallbackUrl>
			featureVersionSpec = ai;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #27  <Field int[] featureVersionSpec>
		//   14   25:return          
		}
	}


	public FetchedAppSettings(boolean flag, String s, boolean flag1, boolean flag2, int i, EnumSet enumset, Map map, 
			boolean flag3, FacebookRequestErrorClassification facebookrequesterrorclassification, String s1, String s2, boolean flag4, boolean flag5, JSONArray jsonarray, 
			String s3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		supportsImplicitLogging = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #38  <Field boolean supportsImplicitLogging>
		nuxContent = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #40  <Field String nuxContent>
		nuxEnabled = flag1;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #42  <Field boolean nuxEnabled>
		customTabsEnabled = flag2;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #44  <Field boolean customTabsEnabled>
		dialogConfigMap = map;
	//   14   25:aload_0         
	//   15   26:aload           7
	//   16   28:putfield        #46  <Field Map dialogConfigMap>
		errorClassification = facebookrequesterrorclassification;
	//   17   31:aload_0         
	//   18   32:aload           9
	//   19   34:putfield        #48  <Field FacebookRequestErrorClassification errorClassification>
		sessionTimeoutInSeconds = i;
	//   20   37:aload_0         
	//   21   38:iload           5
	//   22   40:putfield        #50  <Field int sessionTimeoutInSeconds>
		automaticLoggingEnabled = flag3;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #52  <Field boolean automaticLoggingEnabled>
		smartLoginOptions = enumset;
	//   26   49:aload_0         
	//   27   50:aload           6
	//   28   52:putfield        #54  <Field EnumSet smartLoginOptions>
		smartLoginBookmarkIconURL = s1;
	//   29   55:aload_0         
	//   30   56:aload           10
	//   31   58:putfield        #56  <Field String smartLoginBookmarkIconURL>
		smartLoginMenuIconURL = s2;
	//   32   61:aload_0         
	//   33   62:aload           11
	//   34   64:putfield        #58  <Field String smartLoginMenuIconURL>
		IAPAutomaticLoggingEnabled = flag4;
	//   35   67:aload_0         
	//   36   68:iload           12
	//   37   70:putfield        #60  <Field boolean IAPAutomaticLoggingEnabled>
		codelessEventsEnabled = flag5;
	//   38   73:aload_0         
	//   39   74:iload           13
	//   40   76:putfield        #62  <Field boolean codelessEventsEnabled>
		eventBindings = jsonarray;
	//   41   79:aload_0         
	//   42   80:aload           14
	//   43   82:putfield        #64  <Field JSONArray eventBindings>
		sdkUpdateMessage = s3;
	//   44   85:aload_0         
	//   45   86:aload           15
	//   46   88:putfield        #66  <Field String sdkUpdateMessage>
	//   47   91:return          
	}

	public static DialogFeatureConfig getDialogFeatureConfig(String s, String s1, String s2)
	{
		if(!Utility.isNullOrEmpty(s1))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #77  <Method boolean Utility.isNullOrEmpty(String)>
	//*   2    4:ifne            56
		{
			if(Utility.isNullOrEmpty(s2))
	//*   3    7:aload_2         
	//*   4    8:invokestatic    #77  <Method boolean Utility.isNullOrEmpty(String)>
	//*   5   11:ifeq            16
				return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
			s = ((String) (FetchedAppSettingsManager.getAppSettingsWithoutQuery(s)));
	//    8   16:aload_0         
	//    9   17:invokestatic    #83  <Method FetchedAppSettings FetchedAppSettingsManager.getAppSettingsWithoutQuery(String)>
	//   10   20:astore_0        
			if(s != null)
	//*  11   21:aload_0         
	//*  12   22:ifnull          54
			{
				s = ((String) ((Map)((FetchedAppSettings) (s)).getDialogConfigurations().get(((Object) (s1)))));
	//   13   25:aload_0         
	//   14   26:invokevirtual   #87  <Method Map getDialogConfigurations()>
	//   15   29:aload_1         
	//   16   30:invokeinterface #93  <Method Object Map.get(Object)>
	//   17   35:checkcast       #89  <Class Map>
	//   18   38:astore_0        
				if(s != null)
	//*  19   39:aload_0         
	//*  20   40:ifnull          54
					return (DialogFeatureConfig)((Map) (s)).get(((Object) (s2)));
	//   21   43:aload_0         
	//   22   44:aload_2         
	//   23   45:invokeinterface #93  <Method Object Map.get(Object)>
	//   24   50:checkcast       #6   <Class FetchedAppSettings$DialogFeatureConfig>
	//   25   53:areturn         
			}
			return null;
	//   26   54:aconst_null     
	//   27   55:areturn         
		} else
		{
			return null;
	//   28   56:aconst_null     
	//   29   57:areturn         
		}
	}

	public boolean getAutomaticLoggingEnabled()
	{
		return automaticLoggingEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field boolean automaticLoggingEnabled>
	//    2    4:ireturn         
	}

	public boolean getCodelessEventsEnabled()
	{
		return codelessEventsEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field boolean codelessEventsEnabled>
	//    2    4:ireturn         
	}

	public boolean getCustomTabsEnabled()
	{
		return customTabsEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field boolean customTabsEnabled>
	//    2    4:ireturn         
	}

	public Map getDialogConfigurations()
	{
		return dialogConfigMap;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Map dialogConfigMap>
	//    2    4:areturn         
	}

	public FacebookRequestErrorClassification getErrorClassification()
	{
		return errorClassification;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field FacebookRequestErrorClassification errorClassification>
	//    2    4:areturn         
	}

	public JSONArray getEventBindings()
	{
		return eventBindings;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field JSONArray eventBindings>
	//    2    4:areturn         
	}

	public boolean getIAPAutomaticLoggingEnabled()
	{
		return IAPAutomaticLoggingEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field boolean IAPAutomaticLoggingEnabled>
	//    2    4:ireturn         
	}

	public String getSdkUpdateMessage()
	{
		return sdkUpdateMessage;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field String sdkUpdateMessage>
	//    2    4:areturn         
	}

	public int getSessionTimeoutInSeconds()
	{
		return sessionTimeoutInSeconds;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int sessionTimeoutInSeconds>
	//    2    4:ireturn         
	}

	public EnumSet getSmartLoginOptions()
	{
		return smartLoginOptions;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field EnumSet smartLoginOptions>
	//    2    4:areturn         
	}

	public boolean supportsImplicitLogging()
	{
		return supportsImplicitLogging;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field boolean supportsImplicitLogging>
	//    2    4:ireturn         
	}

	private boolean IAPAutomaticLoggingEnabled;
	private boolean automaticLoggingEnabled;
	private boolean codelessEventsEnabled;
	private boolean customTabsEnabled;
	private Map dialogConfigMap;
	private FacebookRequestErrorClassification errorClassification;
	private JSONArray eventBindings;
	private String nuxContent;
	private boolean nuxEnabled;
	private String sdkUpdateMessage;
	private int sessionTimeoutInSeconds;
	private String smartLoginBookmarkIconURL;
	private String smartLoginMenuIconURL;
	private EnumSet smartLoginOptions;
	private boolean supportsImplicitLogging;
}
