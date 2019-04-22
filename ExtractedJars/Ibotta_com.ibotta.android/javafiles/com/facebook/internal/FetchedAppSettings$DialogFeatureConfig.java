// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.net.Uri;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//			FetchedAppSettings, Utility

public static class FetchedAppSettings$DialogFeatureConfig
{

	public static FetchedAppSettings$DialogFeatureConfig parseDialogConfig(JSONObject jsonobject)
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
			return new FetchedAppSettings$DialogFeatureConfig(s, s1, uri, parseVersionSpec(jsonobject.optJSONArray("versions")));
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

	private FetchedAppSettings$DialogFeatureConfig(String s, String s1, Uri uri, int ai[])
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
