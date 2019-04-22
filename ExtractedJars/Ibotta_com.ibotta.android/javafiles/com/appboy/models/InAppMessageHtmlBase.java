// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models;

import bo.app.*;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models:
//			InAppMessageBase, IInAppMessageHtml

public abstract class InAppMessageHtmlBase extends InAppMessageBase
	implements IInAppMessageHtml
{

	protected InAppMessageHtmlBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void InAppMessageBase()>
		l = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #18  <Field boolean l>
		m = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #20  <Field String m>
		g = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #23  <Field boolean g>
	//   11   19:return          
	}

	public InAppMessageHtmlBase(JSONObject jsonobject, bt bt1)
	{
		super(jsonobject, bt1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #27  <Method void InAppMessageBase(JSONObject, bt)>
		l = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #18  <Field boolean l>
		m = null;
	//    7   11:aload_0         
	//    8   12:aconst_null     
	//    9   13:putfield        #20  <Field String m>
		if(!StringUtils.isNullOrBlank(jsonobject.optString("zipped_assets_url")))
	//*  10   16:aload_1         
	//*  11   17:ldc1            #29  <String "zipped_assets_url">
	//*  12   19:invokevirtual   #35  <Method String JSONObject.optString(String)>
	//*  13   22:invokestatic    #41  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  14   25:ifne            38
			j = jsonobject.optString("zipped_assets_url");
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:ldc1            #29  <String "zipped_assets_url">
	//   18   32:invokevirtual   #35  <Method String JSONObject.optString(String)>
	//   19   35:putfield        #43  <Field String j>
		g = jsonobject.optBoolean("use_webview", true);
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:ldc1            #45  <String "use_webview">
	//   23   42:iconst_1        
	//   24   43:invokevirtual   #49  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   25   46:putfield        #23  <Field boolean g>
	//   26   49:return          
	}

	public volatile Object forJsonPut()
	{
		return ((Object) (forJsonPut()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #54  <Method JSONObject forJsonPut()>
	//    2    4:areturn         
	}

	public JSONObject forJsonPut()
	{
		JSONException jsonexception;
		if(h != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field JSONObject h>
	//*   2    4:ifnull          12
			return h;
	//    3    7:aload_0         
	//    4    8:getfield        #60  <Field JSONObject h>
	//    5   11:areturn         
		JSONObject jsonobject;
		try
		{
			jsonobject = super.forJsonPut();
	//    6   12:aload_0         
	//    7   13:invokespecial   #61  <Method JSONObject InAppMessageBase.forJsonPut()>
	//    8   16:astore_1        
			jsonobject.putOpt("zipped_assets_url", ((Object) (j)));
	//    9   17:aload_1         
	//   10   18:ldc1            #29  <String "zipped_assets_url">
	//   11   20:aload_0         
	//   12   21:getfield        #43  <Field String j>
	//   13   24:invokevirtual   #65  <Method JSONObject JSONObject.putOpt(String, Object)>
	//   14   27:pop             
		}
	//*  15   28:aload_1         
	//*  16   29:areturn         
	//*  17   30:aconst_null     
	//*  18   31:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			return null;
		}
		return jsonobject;
	//*  19   32:astore_1        
	//*  20   33:goto            30
	}

	public String getAssetsZipRemoteUrl()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String j>
	//    2    4:areturn         
	}

	public String getLocalAssetsDirectoryUrl()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field String k>
	//    2    4:areturn         
	}

	public String getRemoteAssetPathForPrefetch()
	{
		return getAssetsZipRemoteUrl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method String getAssetsZipRemoteUrl()>
	//    2    4:areturn         
	}

	public boolean logButtonClick(String s)
	{
		if(StringUtils.isNullOrEmpty(b) && StringUtils.isNullOrEmpty(c) && StringUtils.isNullOrEmpty(d))
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field String b>
	//*   2    4:invokestatic    #80  <Method boolean StringUtils.isNullOrEmpty(String)>
	//*   3    7:ifeq            41
	//*   4   10:aload_0         
	//*   5   11:getfield        #83  <Field String c>
	//*   6   14:invokestatic    #80  <Method boolean StringUtils.isNullOrEmpty(String)>
	//*   7   17:ifeq            41
	//*   8   20:aload_0         
	//*   9   21:getfield        #86  <Field String d>
	//*  10   24:invokestatic    #80  <Method boolean StringUtils.isNullOrEmpty(String)>
	//*  11   27:ifeq            41
		{
			AppboyLogger.d(a, "Campaign, card, and trigger Ids not found. Not logging html in-app message click.");
	//   12   30:getstatic       #89  <Field String a>
	//   13   33:ldc1            #91  <String "Campaign, card, and trigger Ids not found. Not logging html in-app message click.">
	//   14   35:invokestatic    #96  <Method int AppboyLogger.d(String, String)>
	//   15   38:pop             
			return false;
	//   16   39:iconst_0        
	//   17   40:ireturn         
		}
		if(StringUtils.isNullOrBlank(s))
	//*  18   41:aload_1         
	//*  19   42:invokestatic    #41  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  20   45:ifeq            59
		{
			AppboyLogger.i(a, "Button Id was null or blank for this html in-app message. Ignoring.");
	//   21   48:getstatic       #89  <Field String a>
	//   22   51:ldc1            #98  <String "Button Id was null or blank for this html in-app message. Ignoring.">
	//   23   53:invokestatic    #101 <Method int AppboyLogger.i(String, String)>
	//   24   56:pop             
			return false;
	//   25   57:iconst_0        
	//   26   58:ireturn         
		}
		if(l)
	//*  27   59:aload_0         
	//*  28   60:getfield        #18  <Field boolean l>
	//*  29   63:ifeq            77
		{
			AppboyLogger.i(a, "Button click already logged for this html in-app message. Ignoring.");
	//   30   66:getstatic       #89  <Field String a>
	//   31   69:ldc1            #103 <String "Button click already logged for this html in-app message. Ignoring.">
	//   32   71:invokestatic    #101 <Method int AppboyLogger.i(String, String)>
	//   33   74:pop             
			return false;
	//   34   75:iconst_0        
	//   35   76:ireturn         
		}
		if(i == null)
	//*  36   77:aload_0         
	//*  37   78:getfield        #106 <Field bt i>
	//*  38   81:ifnonnull       95
		{
			AppboyLogger.e(a, "Cannot log an html in-app message button click because the AppboyManager is null.");
	//   39   84:getstatic       #89  <Field String a>
	//   40   87:ldc1            #108 <String "Cannot log an html in-app message button click because the AppboyManager is null.">
	//   41   89:invokestatic    #111 <Method int AppboyLogger.e(String, String)>
	//   42   92:pop             
			return false;
	//   43   93:iconst_0        
	//   44   94:ireturn         
		}
		try
		{
			ci ci1 = ci.a(b, c, d, s);
	//   45   95:aload_0         
	//   46   96:getfield        #77  <Field String b>
	//   47   99:aload_0         
	//   48  100:getfield        #83  <Field String c>
	//   49  103:aload_0         
	//   50  104:getfield        #86  <Field String d>
	//   51  107:aload_1         
	//   52  108:invokestatic    #116 <Method ci ci.a(String, String, String, String)>
	//   53  111:astore_2        
			i.a(((bo.app.cc) (ci1)));
	//   54  112:aload_0         
	//   55  113:getfield        #106 <Field bt i>
	//   56  116:aload_2         
	//   57  117:invokeinterface #121 <Method boolean bt.a(bo.app.cc)>
	//   58  122:pop             
			m = s;
	//   59  123:aload_0         
	//   60  124:aload_1         
	//   61  125:putfield        #20  <Field String m>
			l = true;
	//   62  128:aload_0         
	//   63  129:iconst_1        
	//   64  130:putfield        #18  <Field boolean l>
		}
	//*  65  133:iconst_1        
	//*  66  134:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  67  135:astore_1        
		{
			i.a(((Throwable) (s)));
	//   68  136:aload_0         
	//   69  137:getfield        #106 <Field bt i>
	//   70  140:aload_1         
	//   71  141:invokeinterface #124 <Method void bt.a(Throwable)>
			return false;
	//   72  146:iconst_0        
	//   73  147:ireturn         
		}
		return true;
	}

	public void onAfterClosed()
	{
		super.onAfterClosed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #127 <Method void InAppMessageBase.onAfterClosed()>
		if(l && !StringUtils.isNullOrBlank(d) && !StringUtils.isNullOrBlank(m))
	//*   2    4:aload_0         
	//*   3    5:getfield        #18  <Field boolean l>
	//*   4    8:ifeq            55
	//*   5   11:aload_0         
	//*   6   12:getfield        #86  <Field String d>
	//*   7   15:invokestatic    #41  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   8   18:ifne            55
	//*   9   21:aload_0         
	//*  10   22:getfield        #20  <Field String m>
	//*  11   25:invokestatic    #41  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  12   28:ifne            55
			i.a(((bo.app.fr) (new ft(d, m))));
	//   13   31:aload_0         
	//   14   32:getfield        #106 <Field bt i>
	//   15   35:new             #129 <Class ft>
	//   16   38:dup             
	//   17   39:aload_0         
	//   18   40:getfield        #86  <Field String d>
	//   19   43:aload_0         
	//   20   44:getfield        #20  <Field String m>
	//   21   47:invokespecial   #132 <Method void ft(String, String)>
	//   22   50:invokeinterface #135 <Method void bt.a(bo.app.fr)>
	//   23   55:return          
	}

	public void setAssetsZipRemoteUrl(String s)
	{
		j = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field String j>
	//    3    5:return          
	}

	public void setLocalAssetPathForPrefetch(String s)
	{
		setLocalAssetsDirectoryUrl(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #141 <Method void setLocalAssetsDirectoryUrl(String)>
	//    3    5:return          
	}

	public void setLocalAssetsDirectoryUrl(String s)
	{
		k = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #70  <Field String k>
	//    3    5:return          
	}

	private String j;
	private String k;
	private boolean l;
	private String m;
}
