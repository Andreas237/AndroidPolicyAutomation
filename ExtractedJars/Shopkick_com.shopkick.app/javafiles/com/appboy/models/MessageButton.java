// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models;

import android.net.Uri;
import bo.app.dt;
import com.appboy.enums.inappmessage.ClickAction;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models:
//			IPutIntoJson

public class MessageButton
	implements IPutIntoJson
{

	public MessageButton()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		c = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #38  <Field int c>
		d = ClickAction.NONE;
	//    5    9:aload_0         
	//    6   10:getstatic       #43  <Field ClickAction ClickAction.NONE>
	//    7   13:putfield        #45  <Field ClickAction d>
		g = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #47  <Field int g>
		h = 0;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #49  <Field int h>
	//   14   26:return          
	}

	public MessageButton(JSONObject jsonobject)
	{
		this(jsonobject, jsonobject.optInt("id", -1), (ClickAction)dt.a(jsonobject, "click_action", com/appboy/enums/inappmessage/ClickAction, ((Enum) (ClickAction.NEWS_FEED))), jsonobject.optString("uri"), jsonobject.optString("text"), jsonobject.optInt("bg_color"), jsonobject.optInt("text_color"), jsonobject.optBoolean("use_webview", false));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:ldc1            #52  <String "id">
	//    4    5:iconst_m1       
	//    5    6:invokevirtual   #58  <Method int JSONObject.optInt(String, int)>
	//    6    9:aload_1         
	//    7   10:ldc1            #60  <String "click_action">
	//    8   12:ldc1            #40  <Class ClickAction>
	//    9   14:getstatic       #63  <Field ClickAction ClickAction.NEWS_FEED>
	//   10   17:invokestatic    #68  <Method Enum dt.a(JSONObject, String, Class, Enum)>
	//   11   20:checkcast       #40  <Class ClickAction>
	//   12   23:aload_1         
	//   13   24:ldc1            #70  <String "uri">
	//   14   26:invokevirtual   #74  <Method String JSONObject.optString(String)>
	//   15   29:aload_1         
	//   16   30:ldc1            #76  <String "text">
	//   17   32:invokevirtual   #74  <Method String JSONObject.optString(String)>
	//   18   35:aload_1         
	//   19   36:ldc1            #78  <String "bg_color">
	//   20   38:invokevirtual   #81  <Method int JSONObject.optInt(String)>
	//   21   41:aload_1         
	//   22   42:ldc1            #83  <String "text_color">
	//   23   44:invokevirtual   #81  <Method int JSONObject.optInt(String)>
	//   24   47:aload_1         
	//   25   48:ldc1            #85  <String "use_webview">
	//   26   50:iconst_0        
	//   27   51:invokevirtual   #89  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   28   54:invokespecial   #92  <Method void MessageButton(JSONObject, int, ClickAction, String, String, int, int, boolean)>
	//   29   57:return          
	}

	private MessageButton(JSONObject jsonobject, int j, ClickAction clickaction, String s, String s1, int k, int l, 
			boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		c = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #38  <Field int c>
		d = ClickAction.NONE;
	//    5    9:aload_0         
	//    6   10:getstatic       #43  <Field ClickAction ClickAction.NONE>
	//    7   13:putfield        #45  <Field ClickAction d>
		g = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #47  <Field int g>
		h = 0;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #49  <Field int h>
		b = jsonobject;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:putfield        #94  <Field JSONObject b>
		c = j;
	//   17   31:aload_0         
	//   18   32:iload_2         
	//   19   33:putfield        #38  <Field int c>
		d = clickaction;
	//   20   36:aload_0         
	//   21   37:aload_3         
	//   22   38:putfield        #45  <Field ClickAction d>
		if(d == ClickAction.URI && !StringUtils.isNullOrBlank(s))
	//*  23   41:aload_0         
	//*  24   42:getfield        #45  <Field ClickAction d>
	//*  25   45:getstatic       #97  <Field ClickAction ClickAction.URI>
	//*  26   48:if_acmpne       68
	//*  27   51:aload           4
	//*  28   53:invokestatic    #103 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  29   56:ifne            68
			e = Uri.parse(s);
	//   30   59:aload_0         
	//   31   60:aload           4
	//   32   62:invokestatic    #109 <Method Uri Uri.parse(String)>
	//   33   65:putfield        #111 <Field Uri e>
		f = s1;
	//   34   68:aload_0         
	//   35   69:aload           5
	//   36   71:putfield        #113 <Field String f>
		g = k;
	//   37   74:aload_0         
	//   38   75:iload           6
	//   39   77:putfield        #47  <Field int g>
		h = l;
	//   40   80:aload_0         
	//   41   81:iload           7
	//   42   83:putfield        #49  <Field int h>
		i = flag;
	//   43   86:aload_0         
	//   44   87:iload           8
	//   45   89:putfield        #115 <Field boolean i>
	//   46   92:return          
	}

	public volatile Object forJsonPut()
	{
		return ((Object) (forJsonPut()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #120 <Method JSONObject forJsonPut()>
	//    2    4:areturn         
	}

	public JSONObject forJsonPut()
	{
		JSONException jsonexception;
		JSONObject jsonobject;
		try
		{
			jsonobject = new JSONObject();
	//    0    0:new             #54  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #123 <Method void JSONObject()>
	//    3    7:astore_1        
			jsonobject.put("id", c);
	//    4    8:aload_1         
	//    5    9:ldc1            #52  <String "id">
	//    6   11:aload_0         
	//    7   12:getfield        #38  <Field int c>
	//    8   15:invokevirtual   #127 <Method JSONObject JSONObject.put(String, int)>
	//    9   18:pop             
			jsonobject.put("click_action", ((Object) (d.toString())));
	//   10   19:aload_1         
	//   11   20:ldc1            #60  <String "click_action">
	//   12   22:aload_0         
	//   13   23:getfield        #45  <Field ClickAction d>
	//   14   26:invokevirtual   #131 <Method String ClickAction.toString()>
	//   15   29:invokevirtual   #134 <Method JSONObject JSONObject.put(String, Object)>
	//   16   32:pop             
			if(e != null)
	//*  17   33:aload_0         
	//*  18   34:getfield        #111 <Field Uri e>
	//*  19   37:ifnull          54
				jsonobject.put("uri", ((Object) (e.toString())));
	//   20   40:aload_1         
	//   21   41:ldc1            #70  <String "uri">
	//   22   43:aload_0         
	//   23   44:getfield        #111 <Field Uri e>
	//   24   47:invokevirtual   #135 <Method String Uri.toString()>
	//   25   50:invokevirtual   #134 <Method JSONObject JSONObject.put(String, Object)>
	//   26   53:pop             
			jsonobject.putOpt("text", ((Object) (f)));
	//   27   54:aload_1         
	//   28   55:ldc1            #76  <String "text">
	//   29   57:aload_0         
	//   30   58:getfield        #113 <Field String f>
	//   31   61:invokevirtual   #138 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   32   64:pop             
			jsonobject.put("bg_color", g);
	//   33   65:aload_1         
	//   34   66:ldc1            #78  <String "bg_color">
	//   35   68:aload_0         
	//   36   69:getfield        #47  <Field int g>
	//   37   72:invokevirtual   #127 <Method JSONObject JSONObject.put(String, int)>
	//   38   75:pop             
			jsonobject.put("text_color", h);
	//   39   76:aload_1         
	//   40   77:ldc1            #83  <String "text_color">
	//   41   79:aload_0         
	//   42   80:getfield        #49  <Field int h>
	//   43   83:invokevirtual   #127 <Method JSONObject JSONObject.put(String, int)>
	//   44   86:pop             
			jsonobject.put("use_webview", i);
	//   45   87:aload_1         
	//   46   88:ldc1            #85  <String "use_webview">
	//   47   90:aload_0         
	//   48   91:getfield        #115 <Field boolean i>
	//   49   94:invokevirtual   #141 <Method JSONObject JSONObject.put(String, boolean)>
	//   50   97:pop             
		}
	//*  51   98:aload_1         
	//*  52   99:areturn         
	//*  53  100:aload_0         
	//*  54  101:getfield        #94  <Field JSONObject b>
	//*  55  104:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			return b;
		}
		return jsonobject;
	//*  56  105:astore_1        
	//*  57  106:goto            100
	}

	public int getBackgroundColor()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int g>
	//    2    4:ireturn         
	}

	public ClickAction getClickAction()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ClickAction d>
	//    2    4:areturn         
	}

	public int getId()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int c>
	//    2    4:ireturn         
	}

	public boolean getOpenUriInWebview()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field boolean i>
	//    2    4:ireturn         
	}

	public String getText()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field String f>
	//    2    4:areturn         
	}

	public int getTextColor()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int h>
	//    2    4:ireturn         
	}

	public Uri getUri()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field Uri e>
	//    2    4:areturn         
	}

	public void setBackgroundColor(int j)
	{
		g = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #47  <Field int g>
	//    3    5:return          
	}

	public boolean setClickAction(ClickAction clickaction)
	{
		if(clickaction != ClickAction.URI)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #97  <Field ClickAction ClickAction.URI>
	//*   2    4:if_acmpeq       19
		{
			d = clickaction;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #45  <Field ClickAction d>
			e = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #111 <Field Uri e>
			return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		} else
		{
			AppboyLogger.e(a, "A non-null URI is required in order to set the button ClickAction to URI.");
	//   11   19:getstatic       #32  <Field String a>
	//   12   22:ldc1            #158 <String "A non-null URI is required in order to set the button ClickAction to URI.">
	//   13   24:invokestatic    #161 <Method int AppboyLogger.e(String, String)>
	//   14   27:pop             
			return false;
	//   15   28:iconst_0        
	//   16   29:ireturn         
		}
	}

	public boolean setClickAction(ClickAction clickaction, Uri uri)
	{
		if(uri == null && clickaction == ClickAction.URI)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       22
	//*   2    4:aload_1         
	//*   3    5:getstatic       #97  <Field ClickAction ClickAction.URI>
	//*   4    8:if_acmpne       22
		{
			AppboyLogger.e(a, "A non-null URI is required in order to set the button ClickAction to URI.");
	//    5   11:getstatic       #32  <Field String a>
	//    6   14:ldc1            #158 <String "A non-null URI is required in order to set the button ClickAction to URI.">
	//    7   16:invokestatic    #161 <Method int AppboyLogger.e(String, String)>
	//    8   19:pop             
			return false;
	//    9   20:iconst_0        
	//   10   21:ireturn         
		}
		if(uri != null && clickaction == ClickAction.URI)
	//*  11   22:aload_2         
	//*  12   23:ifnull          45
	//*  13   26:aload_1         
	//*  14   27:getstatic       #97  <Field ClickAction ClickAction.URI>
	//*  15   30:if_acmpne       45
		{
			d = clickaction;
	//   16   33:aload_0         
	//   17   34:aload_1         
	//   18   35:putfield        #45  <Field ClickAction d>
			e = uri;
	//   19   38:aload_0         
	//   20   39:aload_2         
	//   21   40:putfield        #111 <Field Uri e>
			return true;
	//   22   43:iconst_1        
	//   23   44:ireturn         
		} else
		{
			return setClickAction(clickaction);
	//   24   45:aload_0         
	//   25   46:aload_1         
	//   26   47:invokevirtual   #164 <Method boolean setClickAction(ClickAction)>
	//   27   50:ireturn         
		}
	}

	public void setOpenUriInWebview(boolean flag)
	{
		i = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #115 <Field boolean i>
	//    3    5:return          
	}

	public void setText(String s)
	{
		f = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #113 <Field String f>
	//    3    5:return          
	}

	public void setTextColor(int j)
	{
		h = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #49  <Field int h>
	//    3    5:return          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/models/MessageButton);
	private JSONObject b;
	private int c;
	private ClickAction d;
	private Uri e;
	private String f;
	private int g;
	private int h;
	private boolean i;

	static 
	{
	//    0    0:ldc1            #2   <Class MessageButton>
	//    1    2:invokestatic    #30  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #32  <Field String a>
	//*   3    8:return          
	}
}
