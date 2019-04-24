// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.net.Uri;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//			Utility

public static class Utility$DialogFeatureConfig
{

	private static Utility$DialogFeatureConfig parseDialogConfig(JSONObject jsonobject)
	{
		String s = jsonobject.optString("name");
	//    0    0:aload_0         
	//    1    1:ldc1            #35  <String "name">
	//    2    3:invokevirtual   #41  <Method String JSONObject.optString(String)>
	//    3    6:astore_3        
		boolean flag = Utility.isNullOrEmpty(s);
	//    4    7:aload_3         
	//    5    8:invokestatic    #45  <Method boolean Utility.isNullOrEmpty(String)>
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
	//   14   21:ldc1            #47  <String "\\|">
	//   15   23:invokevirtual   #53  <Method String[] String.split(String)>
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
	//*  32   49:invokestatic    #45  <Method boolean Utility.isNullOrEmpty(String)>
	//*  33   52:ifne            108
		{
			if(Utility.isNullOrEmpty(s1))
	//*  34   55:aload           4
	//*  35   57:invokestatic    #45  <Method boolean Utility.isNullOrEmpty(String)>
	//*  36   60:ifeq            65
				return null;
	//   37   63:aconst_null     
	//   38   64:areturn         
			String s2 = jsonobject.optString("url");
	//   39   65:aload_0         
	//   40   66:ldc1            #55  <String "url">
	//   41   68:invokevirtual   #41  <Method String JSONObject.optString(String)>
	//   42   71:astore          5
			if(!Utility.isNullOrEmpty(s2))
	//*  43   73:aload           5
	//*  44   75:invokestatic    #45  <Method boolean Utility.isNullOrEmpty(String)>
	//*  45   78:ifne            87
				uri = Uri.parse(s2);
	//   46   81:aload           5
	//   47   83:invokestatic    #61  <Method Uri Uri.parse(String)>
	//   48   86:astore_2        
			return new Utility$DialogFeatureConfig(s, s1, uri, parseVersionSpec(jsonobject.optJSONArray("versions")));
	//   49   87:new             #2   <Class Utility$DialogFeatureConfig>
	//   50   90:dup             
	//   51   91:aload_3         
	//   52   92:aload           4
	//   53   94:aload_2         
	//   54   95:aload_0         
	//   55   96:ldc1            #63  <String "versions">
	//   56   98:invokevirtual   #67  <Method JSONArray JSONObject.optJSONArray(String)>
	//   57  101:invokestatic    #71  <Method int[] parseVersionSpec(JSONArray)>
	//   58  104:invokespecial   #73  <Method void Utility$DialogFeatureConfig(String, String, Uri, int[])>
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
	//*   1    1:ifnull          91
		{
			int l = jsonarray.length();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #81  <Method int JSONArray.length()>
	//    4    8:istore          4
			int ai[] = new int[l];
	//    5   10:iload           4
	//    6   12:newarray        int[]
	//    7   14:astore          6
			int j = 0;
	//    8   16:iconst_0        
	//    9   17:istore_2        
			do
			{
				obj = ((Object) (ai));
	//   10   18:aload           6
	//   11   20:astore          5
				if(j >= l)
					break;
	//   12   22:iload_2         
	//   13   23:iload           4
	//   14   25:icmpge          94
				int k = jsonarray.optInt(j, -1);
	//   15   28:aload_0         
	//   16   29:iload_2         
	//   17   30:iconst_m1       
	//   18   31:invokevirtual   #85  <Method int JSONArray.optInt(int, int)>
	//   19   34:istore_3        
				int i = k;
	//   20   35:iload_3         
	//   21   36:istore_1        
				if(k == -1)
	//*  22   37:iload_3         
	//*  23   38:iconst_m1       
	//*  24   39:icmpne          79
				{
					obj = ((Object) (jsonarray.optString(j)));
	//   25   42:aload_0         
	//   26   43:iload_2         
	//   27   44:invokevirtual   #88  <Method String JSONArray.optString(int)>
	//   28   47:astore          5
					i = k;
	//   29   49:iload_3         
	//   30   50:istore_1        
					if(!Utility.isNullOrEmpty(((String) (obj))))
	//*  31   51:aload           5
	//*  32   53:invokestatic    #45  <Method boolean Utility.isNullOrEmpty(String)>
	//*  33   56:ifne            79
						try
						{
							i = Integer.parseInt(((String) (obj)));
	//   34   59:aload           5
	//   35   61:invokestatic    #94  <Method int Integer.parseInt(String)>
	//   36   64:istore_1        
						}
	//*  37   65:goto            79
						// Misplaced declaration of an exception variable
						catch(Object obj)
	//*  38   68:astore          5
						{
							Utility.logd("FacebookSDK", ((Exception) (obj)));
	//   39   70:ldc1            #96  <String "FacebookSDK">
	//   40   72:aload           5
	//   41   74:invokestatic    #100 <Method void Utility.logd(String, Exception)>
							i = -1;
	//   42   77:iconst_m1       
	//   43   78:istore_1        
						}
				}
				ai[j] = i;
	//   44   79:aload           6
	//   45   81:iload_2         
	//   46   82:iload_1         
	//   47   83:iastore         
				j++;
	//   48   84:iload_2         
	//   49   85:iconst_1        
	//   50   86:iadd            
	//   51   87:istore_2        
			} while(true);
	//   52   88:goto            18
		} else
		{
			obj = null;
	//   53   91:aconst_null     
	//   54   92:astore          5
		}
		return ((int []) (obj));
	//   55   94:aload           5
	//   56   96:areturn         
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


/*
	static Utility$DialogFeatureConfig access$400(JSONObject jsonobject)
	{
		return parseDialogConfig(jsonobject);
	//    0    0:aload_0         
	//    1    1:invokestatic    #33  <Method Utility$DialogFeatureConfig parseDialogConfig(JSONObject)>
	//    2    4:areturn         
	}

*/

	private Utility$DialogFeatureConfig(String s, String s1, Uri uri, int ai[])
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
