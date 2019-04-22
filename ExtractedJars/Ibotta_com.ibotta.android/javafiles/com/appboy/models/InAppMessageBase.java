// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models;

import android.graphics.Bitmap;
import android.net.Uri;
import bo.app.*;
import com.appboy.enums.inappmessage.*;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models:
//			IInAppMessage

public abstract class InAppMessageBase
	implements IInAppMessage
{

	protected InAppMessageBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void Object()>
		l = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #79  <Field boolean l>
		m = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #81  <Field boolean m>
		n = ClickAction.NONE;
	//    8   14:aload_0         
	//    9   15:getstatic       #86  <Field ClickAction ClickAction.NONE>
	//   10   18:putfield        #88  <Field ClickAction n>
		p = DismissType.AUTO_DISMISS;
	//   11   21:aload_0         
	//   12   22:getstatic       #93  <Field DismissType DismissType.AUTO_DISMISS>
	//   13   25:putfield        #95  <Field DismissType p>
		q = 5000;
	//   14   28:aload_0         
	//   15   29:sipush          5000
	//   16   32:putfield        #97  <Field int q>
		r = 0;
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:putfield        #99  <Field int r>
		s = 0;
	//   20   40:aload_0         
	//   21   41:iconst_0        
	//   22   42:putfield        #101 <Field int s>
		t = 0;
	//   23   45:aload_0         
	//   24   46:iconst_0        
	//   25   47:putfield        #103 <Field int t>
		u = 0;
	//   26   50:aload_0         
	//   27   51:iconst_0        
	//   28   52:putfield        #105 <Field int u>
		x = Orientation.ANY;
	//   29   55:aload_0         
	//   30   56:getstatic       #110 <Field Orientation Orientation.ANY>
	//   31   59:putfield        #112 <Field Orientation x>
		z = false;
	//   32   62:aload_0         
	//   33   63:iconst_0        
	//   34   64:putfield        #114 <Field boolean z>
		e = CropType.FIT_CENTER;
	//   35   67:aload_0         
	//   36   68:getstatic       #119 <Field CropType CropType.FIT_CENTER>
	//   37   71:putfield        #121 <Field CropType e>
		f = TextAlign.CENTER;
	//   38   74:aload_0         
	//   39   75:getstatic       #126 <Field TextAlign TextAlign.CENTER>
	//   40   78:putfield        #128 <Field TextAlign f>
		g = false;
	//   41   81:aload_0         
	//   42   82:iconst_0        
	//   43   83:putfield        #130 <Field boolean g>
		A = false;
	//   44   86:aload_0         
	//   45   87:iconst_0        
	//   46   88:putfield        #132 <Field boolean A>
		B = false;
	//   47   91:aload_0         
	//   48   92:iconst_0        
	//   49   93:putfield        #134 <Field boolean B>
		C = false;
	//   50   96:aload_0         
	//   51   97:iconst_0        
	//   52   98:putfield        #136 <Field boolean C>
		D = false;
	//   53  101:aload_0         
	//   54  102:iconst_0        
	//   55  103:putfield        #138 <Field boolean D>
		F = -1L;
	//   56  106:aload_0         
	//   57  107:ldc2w           #139 <Long -1L>
	//   58  110:putfield        #142 <Field long F>
	//   59  113:return          
	}

	private InAppMessageBase(String s1, Map map, boolean flag, boolean flag1, ClickAction clickaction, String s2, int i1, 
			int j1, int k1, int l1, String s3, String s4, DismissType dismisstype, int i2, 
			String s5, String s6, String s7, boolean flag2, boolean flag3, Orientation orientation, boolean flag4, 
			boolean flag5, JSONObject jsonobject, bt bt1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void Object()>
		l = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #79  <Field boolean l>
		m = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #81  <Field boolean m>
		n = ClickAction.NONE;
	//    8   14:aload_0         
	//    9   15:getstatic       #86  <Field ClickAction ClickAction.NONE>
	//   10   18:putfield        #88  <Field ClickAction n>
		p = DismissType.AUTO_DISMISS;
	//   11   21:aload_0         
	//   12   22:getstatic       #93  <Field DismissType DismissType.AUTO_DISMISS>
	//   13   25:putfield        #95  <Field DismissType p>
		q = 5000;
	//   14   28:aload_0         
	//   15   29:sipush          5000
	//   16   32:putfield        #97  <Field int q>
		r = 0;
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:putfield        #99  <Field int r>
		s = 0;
	//   20   40:aload_0         
	//   21   41:iconst_0        
	//   22   42:putfield        #101 <Field int s>
		t = 0;
	//   23   45:aload_0         
	//   24   46:iconst_0        
	//   25   47:putfield        #103 <Field int t>
		u = 0;
	//   26   50:aload_0         
	//   27   51:iconst_0        
	//   28   52:putfield        #105 <Field int u>
		x = Orientation.ANY;
	//   29   55:aload_0         
	//   30   56:getstatic       #110 <Field Orientation Orientation.ANY>
	//   31   59:putfield        #112 <Field Orientation x>
		z = false;
	//   32   62:aload_0         
	//   33   63:iconst_0        
	//   34   64:putfield        #114 <Field boolean z>
		e = CropType.FIT_CENTER;
	//   35   67:aload_0         
	//   36   68:getstatic       #119 <Field CropType CropType.FIT_CENTER>
	//   37   71:putfield        #121 <Field CropType e>
		f = TextAlign.CENTER;
	//   38   74:aload_0         
	//   39   75:getstatic       #126 <Field TextAlign TextAlign.CENTER>
	//   40   78:putfield        #128 <Field TextAlign f>
		g = false;
	//   41   81:aload_0         
	//   42   82:iconst_0        
	//   43   83:putfield        #130 <Field boolean g>
		A = false;
	//   44   86:aload_0         
	//   45   87:iconst_0        
	//   46   88:putfield        #132 <Field boolean A>
		B = false;
	//   47   91:aload_0         
	//   48   92:iconst_0        
	//   49   93:putfield        #134 <Field boolean B>
		C = false;
	//   50   96:aload_0         
	//   51   97:iconst_0        
	//   52   98:putfield        #136 <Field boolean C>
		D = false;
	//   53  101:aload_0         
	//   54  102:iconst_0        
	//   55  103:putfield        #138 <Field boolean D>
		F = -1L;
	//   56  106:aload_0         
	//   57  107:ldc2w           #139 <Long -1L>
	//   58  110:putfield        #142 <Field long F>
		j = s1;
	//   59  113:aload_0         
	//   60  114:aload_1         
	//   61  115:putfield        #145 <Field String j>
		k = map;
	//   62  118:aload_0         
	//   63  119:aload_2         
	//   64  120:putfield        #147 <Field Map k>
		l = flag;
	//   65  123:aload_0         
	//   66  124:iload_3         
	//   67  125:putfield        #79  <Field boolean l>
		m = flag1;
	//   68  128:aload_0         
	//   69  129:iload           4
	//   70  131:putfield        #81  <Field boolean m>
		n = clickaction;
	//   71  134:aload_0         
	//   72  135:aload           5
	//   73  137:putfield        #88  <Field ClickAction n>
		if(n == ClickAction.URI && !StringUtils.isNullOrBlank(s2))
	//*  74  140:aload_0         
	//*  75  141:getfield        #88  <Field ClickAction n>
	//*  76  144:getstatic       #150 <Field ClickAction ClickAction.URI>
	//*  77  147:if_acmpne       167
	//*  78  150:aload           6
	//*  79  152:invokestatic    #156 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  80  155:ifne            167
			o = Uri.parse(s2);
	//   81  158:aload_0         
	//   82  159:aload           6
	//   83  161:invokestatic    #162 <Method Uri Uri.parse(String)>
	//   84  164:putfield        #164 <Field Uri o>
		if(dismisstype == DismissType.SWIPE)
	//*  85  167:aload           13
	//*  86  169:getstatic       #167 <Field DismissType DismissType.SWIPE>
	//*  87  172:if_acmpne       185
			p = DismissType.MANUAL;
	//   88  175:aload_0         
	//   89  176:getstatic       #170 <Field DismissType DismissType.MANUAL>
	//   90  179:putfield        #95  <Field DismissType p>
		else
	//*  91  182:goto            191
			p = dismisstype;
	//   92  185:aload_0         
	//   93  186:aload           13
	//   94  188:putfield        #95  <Field DismissType p>
		setDurationInMilliseconds(i2);
	//   95  191:aload_0         
	//   96  192:iload           14
	//   97  194:invokevirtual   #174 <Method void setDurationInMilliseconds(int)>
		r = i1;
	//   98  197:aload_0         
	//   99  198:iload           7
	//  100  200:putfield        #99  <Field int r>
		t = j1;
	//  101  203:aload_0         
	//  102  204:iload           8
	//  103  206:putfield        #103 <Field int t>
		u = k1;
	//  104  209:aload_0         
	//  105  210:iload           9
	//  106  212:putfield        #105 <Field int u>
		s = l1;
	//  107  215:aload_0         
	//  108  216:iload           10
	//  109  218:putfield        #101 <Field int s>
		v = s3;
	//  110  221:aload_0         
	//  111  222:aload           11
	//  112  224:putfield        #176 <Field String v>
		w = s4;
	//  113  227:aload_0         
	//  114  228:aload           12
	//  115  230:putfield        #178 <Field String w>
		x = orientation;
	//  116  233:aload_0         
	//  117  234:aload           20
	//  118  236:putfield        #112 <Field Orientation x>
		b = s5;
	//  119  239:aload_0         
	//  120  240:aload           15
	//  121  242:putfield        #180 <Field String b>
		c = s6;
	//  122  245:aload_0         
	//  123  246:aload           16
	//  124  248:putfield        #182 <Field String c>
		d = s7;
	//  125  251:aload_0         
	//  126  252:aload           17
	//  127  254:putfield        #184 <Field String d>
		A = flag2;
	//  128  257:aload_0         
	//  129  258:iload           18
	//  130  260:putfield        #132 <Field boolean A>
		B = flag3;
	//  131  263:aload_0         
	//  132  264:iload           19
	//  133  266:putfield        #134 <Field boolean B>
		g = flag4;
	//  134  269:aload_0         
	//  135  270:iload           21
	//  136  272:putfield        #130 <Field boolean g>
		D = flag5;
	//  137  275:aload_0         
	//  138  276:iload           22
	//  139  278:putfield        #138 <Field boolean D>
		h = jsonobject;
	//  140  281:aload_0         
	//  141  282:aload           23
	//  142  284:putfield        #186 <Field JSONObject h>
		i = bt1;
	//  143  287:aload_0         
	//  144  288:aload           24
	//  145  290:putfield        #188 <Field bt i>
	//  146  293:return          
	}

	public InAppMessageBase(JSONObject jsonobject, bt bt1)
	{
		this(jsonobject.optString("message"), ek.a(jsonobject.optJSONObject("extras"), ((Map) (new HashMap()))), jsonobject.optBoolean("animate_in", true), jsonobject.optBoolean("animate_out", true), (ClickAction)ek.a(jsonobject, "click_action", com/appboy/enums/inappmessage/ClickAction, ((Enum) (ClickAction.NONE))), jsonobject.optString("uri"), jsonobject.optInt("bg_color"), jsonobject.optInt("icon_color"), jsonobject.optInt("icon_bg_color"), jsonobject.optInt("text_color"), jsonobject.optString("icon"), jsonobject.optString("image_url"), (DismissType)ek.a(jsonobject, "message_close", com/appboy/enums/inappmessage/DismissType, ((Enum) (DismissType.AUTO_DISMISS))), jsonobject.optInt("duration"), jsonobject.optString("campaign_id"), jsonobject.optString("card_id"), jsonobject.optString("trigger_id"), false, false, (Orientation)ek.a(jsonobject, "orientation", com/appboy/enums/inappmessage/Orientation, ((Enum) (Orientation.ANY))), jsonobject.optBoolean("use_webview", false), jsonobject.optBoolean("is_control"), jsonobject, bt1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #193 <String "message">
	//    3    4:invokevirtual   #199 <Method String JSONObject.optString(String)>
	//    4    7:aload_1         
	//    5    8:ldc1            #201 <String "extras">
	//    6   10:invokevirtual   #205 <Method JSONObject JSONObject.optJSONObject(String)>
	//    7   13:new             #207 <Class HashMap>
	//    8   16:dup             
	//    9   17:invokespecial   #208 <Method void HashMap()>
	//   10   20:invokestatic    #213 <Method Map ek.a(JSONObject, Map)>
	//   11   23:aload_1         
	//   12   24:ldc1            #215 <String "animate_in">
	//   13   26:iconst_1        
	//   14   27:invokevirtual   #219 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   15   30:aload_1         
	//   16   31:ldc1            #221 <String "animate_out">
	//   17   33:iconst_1        
	//   18   34:invokevirtual   #219 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   19   37:aload_1         
	//   20   38:ldc1            #223 <String "click_action">
	//   21   40:ldc1            #83  <Class ClickAction>
	//   22   42:getstatic       #86  <Field ClickAction ClickAction.NONE>
	//   23   45:invokestatic    #226 <Method Enum ek.a(JSONObject, String, Class, Enum)>
	//   24   48:checkcast       #83  <Class ClickAction>
	//   25   51:aload_1         
	//   26   52:ldc1            #228 <String "uri">
	//   27   54:invokevirtual   #199 <Method String JSONObject.optString(String)>
	//   28   57:aload_1         
	//   29   58:ldc1            #230 <String "bg_color">
	//   30   60:invokevirtual   #234 <Method int JSONObject.optInt(String)>
	//   31   63:aload_1         
	//   32   64:ldc1            #236 <String "icon_color">
	//   33   66:invokevirtual   #234 <Method int JSONObject.optInt(String)>
	//   34   69:aload_1         
	//   35   70:ldc1            #238 <String "icon_bg_color">
	//   36   72:invokevirtual   #234 <Method int JSONObject.optInt(String)>
	//   37   75:aload_1         
	//   38   76:ldc1            #240 <String "text_color">
	//   39   78:invokevirtual   #234 <Method int JSONObject.optInt(String)>
	//   40   81:aload_1         
	//   41   82:ldc1            #242 <String "icon">
	//   42   84:invokevirtual   #199 <Method String JSONObject.optString(String)>
	//   43   87:aload_1         
	//   44   88:ldc1            #244 <String "image_url">
	//   45   90:invokevirtual   #199 <Method String JSONObject.optString(String)>
	//   46   93:aload_1         
	//   47   94:ldc1            #246 <String "message_close">
	//   48   96:ldc1            #90  <Class DismissType>
	//   49   98:getstatic       #93  <Field DismissType DismissType.AUTO_DISMISS>
	//   50  101:invokestatic    #226 <Method Enum ek.a(JSONObject, String, Class, Enum)>
	//   51  104:checkcast       #90  <Class DismissType>
	//   52  107:aload_1         
	//   53  108:ldc1            #248 <String "duration">
	//   54  110:invokevirtual   #234 <Method int JSONObject.optInt(String)>
	//   55  113:aload_1         
	//   56  114:ldc1            #250 <String "campaign_id">
	//   57  116:invokevirtual   #199 <Method String JSONObject.optString(String)>
	//   58  119:aload_1         
	//   59  120:ldc1            #252 <String "card_id">
	//   60  122:invokevirtual   #199 <Method String JSONObject.optString(String)>
	//   61  125:aload_1         
	//   62  126:ldc1            #254 <String "trigger_id">
	//   63  128:invokevirtual   #199 <Method String JSONObject.optString(String)>
	//   64  131:iconst_0        
	//   65  132:iconst_0        
	//   66  133:aload_1         
	//   67  134:ldc2            #256 <String "orientation">
	//   68  137:ldc1            #107 <Class Orientation>
	//   69  139:getstatic       #110 <Field Orientation Orientation.ANY>
	//   70  142:invokestatic    #226 <Method Enum ek.a(JSONObject, String, Class, Enum)>
	//   71  145:checkcast       #107 <Class Orientation>
	//   72  148:aload_1         
	//   73  149:ldc2            #258 <String "use_webview">
	//   74  152:iconst_0        
	//   75  153:invokevirtual   #219 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   76  156:aload_1         
	//   77  157:ldc1            #15  <String "is_control">
	//   78  159:invokevirtual   #260 <Method boolean JSONObject.optBoolean(String)>
	//   79  162:aload_1         
	//   80  163:aload_2         
	//   81  164:invokespecial   #262 <Method void InAppMessageBase(String, Map, boolean, boolean, ClickAction, String, int, int, int, int, String, String, DismissType, int, String, String, String, boolean, boolean, Orientation, boolean, boolean, JSONObject, bt)>
	//   82  167:return          
	}

	public volatile Object forJsonPut()
	{
		return ((Object) (forJsonPut()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #267 <Method JSONObject forJsonPut()>
	//    2    4:areturn         
	}

	public JSONObject forJsonPut()
	{
		JSONObject jsonobject = h;
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field JSONObject h>
	//    2    4:astore_1        
		if(jsonobject != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return jsonobject;
	//    5    9:aload_1         
	//    6   10:areturn         
		JSONObject jsonobject1;
		JSONObject jsonobject2;
		jsonobject1 = new JSONObject();
	//    7   11:new             #195 <Class JSONObject>
	//    8   14:dup             
	//    9   15:invokespecial   #270 <Method void JSONObject()>
	//   10   18:astore_1        
		jsonobject1.putOpt("message", ((Object) (j)));
	//   11   19:aload_1         
	//   12   20:ldc1            #193 <String "message">
	//   13   22:aload_0         
	//   14   23:getfield        #145 <Field String j>
	//   15   26:invokevirtual   #274 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   16   29:pop             
		jsonobject1.put("duration", q);
	//   17   30:aload_1         
	//   18   31:ldc1            #248 <String "duration">
	//   19   33:aload_0         
	//   20   34:getfield        #97  <Field int q>
	//   21   37:invokevirtual   #278 <Method JSONObject JSONObject.put(String, int)>
	//   22   40:pop             
		jsonobject1.putOpt("campaign_id", ((Object) (b)));
	//   23   41:aload_1         
	//   24   42:ldc1            #250 <String "campaign_id">
	//   25   44:aload_0         
	//   26   45:getfield        #180 <Field String b>
	//   27   48:invokevirtual   #274 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   28   51:pop             
		jsonobject1.putOpt("card_id", ((Object) (c)));
	//   29   52:aload_1         
	//   30   53:ldc1            #252 <String "card_id">
	//   31   55:aload_0         
	//   32   56:getfield        #182 <Field String c>
	//   33   59:invokevirtual   #274 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   34   62:pop             
		jsonobject1.putOpt("trigger_id", ((Object) (d)));
	//   35   63:aload_1         
	//   36   64:ldc1            #254 <String "trigger_id">
	//   37   66:aload_0         
	//   38   67:getfield        #184 <Field String d>
	//   39   70:invokevirtual   #274 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   40   73:pop             
		jsonobject1.putOpt("click_action", ((Object) (n.toString())));
	//   41   74:aload_1         
	//   42   75:ldc1            #223 <String "click_action">
	//   43   77:aload_0         
	//   44   78:getfield        #88  <Field ClickAction n>
	//   45   81:invokevirtual   #282 <Method String ClickAction.toString()>
	//   46   84:invokevirtual   #274 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   47   87:pop             
		jsonobject1.putOpt("message_close", ((Object) (p.toString())));
	//   48   88:aload_1         
	//   49   89:ldc1            #246 <String "message_close">
	//   50   91:aload_0         
	//   51   92:getfield        #95  <Field DismissType p>
	//   52   95:invokevirtual   #283 <Method String DismissType.toString()>
	//   53   98:invokevirtual   #274 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   54  101:pop             
		if(o != null)
	//*  55  102:aload_0         
	//*  56  103:getfield        #164 <Field Uri o>
	//*  57  106:ifnull          123
			jsonobject1.put("uri", ((Object) (o.toString())));
	//   58  109:aload_1         
	//   59  110:ldc1            #228 <String "uri">
	//   60  112:aload_0         
	//   61  113:getfield        #164 <Field Uri o>
	//   62  116:invokevirtual   #284 <Method String Uri.toString()>
	//   63  119:invokevirtual   #286 <Method JSONObject JSONObject.put(String, Object)>
	//   64  122:pop             
		jsonobject1.put("use_webview", g);
	//   65  123:aload_1         
	//   66  124:ldc2            #258 <String "use_webview">
	//   67  127:aload_0         
	//   68  128:getfield        #130 <Field boolean g>
	//   69  131:invokevirtual   #289 <Method JSONObject JSONObject.put(String, boolean)>
	//   70  134:pop             
		jsonobject1.put("animate_in", l);
	//   71  135:aload_1         
	//   72  136:ldc1            #215 <String "animate_in">
	//   73  138:aload_0         
	//   74  139:getfield        #79  <Field boolean l>
	//   75  142:invokevirtual   #289 <Method JSONObject JSONObject.put(String, boolean)>
	//   76  145:pop             
		jsonobject1.put("animate_out", m);
	//   77  146:aload_1         
	//   78  147:ldc1            #221 <String "animate_out">
	//   79  149:aload_0         
	//   80  150:getfield        #81  <Field boolean m>
	//   81  153:invokevirtual   #289 <Method JSONObject JSONObject.put(String, boolean)>
	//   82  156:pop             
		jsonobject1.put("bg_color", r);
	//   83  157:aload_1         
	//   84  158:ldc1            #230 <String "bg_color">
	//   85  160:aload_0         
	//   86  161:getfield        #99  <Field int r>
	//   87  164:invokevirtual   #278 <Method JSONObject JSONObject.put(String, int)>
	//   88  167:pop             
		jsonobject1.put("text_color", s);
	//   89  168:aload_1         
	//   90  169:ldc1            #240 <String "text_color">
	//   91  171:aload_0         
	//   92  172:getfield        #101 <Field int s>
	//   93  175:invokevirtual   #278 <Method JSONObject JSONObject.put(String, int)>
	//   94  178:pop             
		jsonobject1.put("icon_color", t);
	//   95  179:aload_1         
	//   96  180:ldc1            #236 <String "icon_color">
	//   97  182:aload_0         
	//   98  183:getfield        #103 <Field int t>
	//   99  186:invokevirtual   #278 <Method JSONObject JSONObject.put(String, int)>
	//  100  189:pop             
		jsonobject1.put("icon_bg_color", u);
	//  101  190:aload_1         
	//  102  191:ldc1            #238 <String "icon_bg_color">
	//  103  193:aload_0         
	//  104  194:getfield        #105 <Field int u>
	//  105  197:invokevirtual   #278 <Method JSONObject JSONObject.put(String, int)>
	//  106  200:pop             
		jsonobject1.putOpt("icon", ((Object) (v)));
	//  107  201:aload_1         
	//  108  202:ldc1            #242 <String "icon">
	//  109  204:aload_0         
	//  110  205:getfield        #176 <Field String v>
	//  111  208:invokevirtual   #274 <Method JSONObject JSONObject.putOpt(String, Object)>
	//  112  211:pop             
		jsonobject1.putOpt("image_url", ((Object) (w)));
	//  113  212:aload_1         
	//  114  213:ldc1            #244 <String "image_url">
	//  115  215:aload_0         
	//  116  216:getfield        #178 <Field String w>
	//  117  219:invokevirtual   #274 <Method JSONObject JSONObject.putOpt(String, Object)>
	//  118  222:pop             
		jsonobject1.putOpt("crop_type", ((Object) (e.toString())));
	//  119  223:aload_1         
	//  120  224:ldc2            #291 <String "crop_type">
	//  121  227:aload_0         
	//  122  228:getfield        #121 <Field CropType e>
	//  123  231:invokevirtual   #292 <Method String CropType.toString()>
	//  124  234:invokevirtual   #274 <Method JSONObject JSONObject.putOpt(String, Object)>
	//  125  237:pop             
		jsonobject1.putOpt("orientation", ((Object) (x.toString())));
	//  126  238:aload_1         
	//  127  239:ldc2            #256 <String "orientation">
	//  128  242:aload_0         
	//  129  243:getfield        #112 <Field Orientation x>
	//  130  246:invokevirtual   #293 <Method String Orientation.toString()>
	//  131  249:invokevirtual   #274 <Method JSONObject JSONObject.putOpt(String, Object)>
	//  132  252:pop             
		jsonobject1.putOpt("text_align_message", ((Object) (f.toString())));
	//  133  253:aload_1         
	//  134  254:ldc2            #295 <String "text_align_message">
	//  135  257:aload_0         
	//  136  258:getfield        #128 <Field TextAlign f>
	//  137  261:invokevirtual   #296 <Method String TextAlign.toString()>
	//  138  264:invokevirtual   #274 <Method JSONObject JSONObject.putOpt(String, Object)>
	//  139  267:pop             
		jsonobject1.putOpt("is_control", ((Object) (Boolean.valueOf(D))));
	//  140  268:aload_1         
	//  141  269:ldc1            #15  <String "is_control">
	//  142  271:aload_0         
	//  143  272:getfield        #138 <Field boolean D>
	//  144  275:invokestatic    #302 <Method Boolean Boolean.valueOf(boolean)>
	//  145  278:invokevirtual   #274 <Method JSONObject JSONObject.putOpt(String, Object)>
	//  146  281:pop             
		if(k == null)
			break MISSING_BLOCK_LABEL_361;
	//  147  282:aload_0         
	//  148  283:getfield        #147 <Field Map k>
	//  149  286:ifnull          361
		jsonobject2 = new JSONObject();
	//  150  289:new             #195 <Class JSONObject>
	//  151  292:dup             
	//  152  293:invokespecial   #270 <Method void JSONObject()>
	//  153  296:astore_2        
		String s1;
		for(Iterator iterator = k.keySet().iterator(); iterator.hasNext(); jsonobject2.put(s1, k.get(((Object) (s1)))))
	//* 154  297:aload_0         
	//* 155  298:getfield        #147 <Field Map k>
	//* 156  301:invokeinterface #308 <Method Set Map.keySet()>
	//* 157  306:invokeinterface #314 <Method Iterator Set.iterator()>
	//* 158  311:astore_3        
	//* 159  312:aload_3         
	//* 160  313:invokeinterface #320 <Method boolean Iterator.hasNext()>
	//* 161  318:ifeq            353
			s1 = (String)iterator.next();
	//  162  321:aload_3         
	//  163  322:invokeinterface #323 <Method Object Iterator.next()>
	//  164  327:checkcast       #325 <Class String>
	//  165  330:astore          4

	//  166  332:aload_2         
	//  167  333:aload           4
	//  168  335:aload_0         
	//  169  336:getfield        #147 <Field Map k>
	//  170  339:aload           4
	//  171  341:invokeinterface #329 <Method Object Map.get(Object)>
	//  172  346:invokevirtual   #286 <Method JSONObject JSONObject.put(String, Object)>
	//  173  349:pop             
	//* 174  350:goto            312
		try
		{
			jsonobject1.put("extras", ((Object) (jsonobject2)));
	//  175  353:aload_1         
	//  176  354:ldc1            #201 <String "extras">
	//  177  356:aload_2         
	//  178  357:invokevirtual   #286 <Method JSONObject JSONObject.put(String, Object)>
	//  179  360:pop             
		}
	//* 180  361:aload_1         
	//* 181  362:areturn         
	//* 182  363:aconst_null     
	//* 183  364:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			return null;
		}
		JSONException jsonexception;
		return jsonobject1;
	//* 184  365:astore_1        
	//* 185  366:goto            363
	}

	public boolean getAnimateIn()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field boolean l>
	//    2    4:ireturn         
	}

	public boolean getAnimateOut()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field boolean m>
	//    2    4:ireturn         
	}

	public int getBackgroundColor()
	{
		return r;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field int r>
	//    2    4:ireturn         
	}

	public Bitmap getBitmap()
	{
		return y;
	//    0    0:aload_0         
	//    1    1:getfield        #337 <Field Bitmap y>
	//    2    4:areturn         
	}

	public ClickAction getClickAction()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field ClickAction n>
	//    2    4:areturn         
	}

	public CropType getCropType()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field CropType e>
	//    2    4:areturn         
	}

	public DismissType getDismissType()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field DismissType p>
	//    2    4:areturn         
	}

	public int getDurationInMilliseconds()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field int q>
	//    2    4:ireturn         
	}

	public long getExpirationTimestamp()
	{
		return F;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field long F>
	//    2    4:lreturn         
	}

	public Map getExtras()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field Map k>
	//    2    4:areturn         
	}

	public String getIcon()
	{
		return v;
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field String v>
	//    2    4:areturn         
	}

	public int getIconBackgroundColor()
	{
		return u;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field int u>
	//    2    4:ireturn         
	}

	public int getIconColor()
	{
		return t;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field int t>
	//    2    4:ireturn         
	}

	public boolean getImageDownloadSuccessful()
	{
		return z;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field boolean z>
	//    2    4:ireturn         
	}

	public String getImageUrl()
	{
		return getRemoteImageUrl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #357 <Method String getRemoteImageUrl()>
	//    2    4:areturn         
	}

	public String getLocalImageUrl()
	{
		return E;
	//    0    0:aload_0         
	//    1    1:getfield        #360 <Field String E>
	//    2    4:areturn         
	}

	public String getMessage()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field String j>
	//    2    4:areturn         
	}

	public TextAlign getMessageTextAlign()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field TextAlign f>
	//    2    4:areturn         
	}

	public int getMessageTextColor()
	{
		return s;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field int s>
	//    2    4:ireturn         
	}

	public boolean getOpenUriInWebView()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field boolean g>
	//    2    4:ireturn         
	}

	public Orientation getOrientation()
	{
		return x;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field Orientation x>
	//    2    4:areturn         
	}

	public String getRemoteAssetPathForPrefetch()
	{
		return getRemoteImageUrl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #357 <Method String getRemoteImageUrl()>
	//    2    4:areturn         
	}

	public String getRemoteImageUrl()
	{
		return w;
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field String w>
	//    2    4:areturn         
	}

	public Uri getUri()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field Uri o>
	//    2    4:areturn         
	}

	public boolean isControl()
	{
		return D;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field boolean D>
	//    2    4:ireturn         
	}

	public boolean logClick()
	{
		if(StringUtils.isNullOrBlank(b) && StringUtils.isNullOrBlank(c) && StringUtils.isNullOrBlank(d))
	//*   0    0:aload_0         
	//*   1    1:getfield        #180 <Field String b>
	//*   2    4:invokestatic    #156 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   3    7:ifeq            42
	//*   4   10:aload_0         
	//*   5   11:getfield        #182 <Field String c>
	//*   6   14:invokestatic    #156 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   7   17:ifeq            42
	//*   8   20:aload_0         
	//*   9   21:getfield        #184 <Field String d>
	//*  10   24:invokestatic    #156 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  11   27:ifeq            42
		{
			AppboyLogger.d(a, "Campaign, card, and trigger Ids not found. Not logging in-app message click.");
	//   12   30:getstatic       #73  <Field String a>
	//   13   33:ldc2            #374 <String "Campaign, card, and trigger Ids not found. Not logging in-app message click.">
	//   14   36:invokestatic    #377 <Method int AppboyLogger.d(String, String)>
	//   15   39:pop             
			return false;
	//   16   40:iconst_0        
	//   17   41:ireturn         
		}
		if(B)
	//*  18   42:aload_0         
	//*  19   43:getfield        #134 <Field boolean B>
	//*  20   46:ifeq            61
		{
			AppboyLogger.i(a, "Click already logged for this in-app message. Ignoring.");
	//   21   49:getstatic       #73  <Field String a>
	//   22   52:ldc2            #379 <String "Click already logged for this in-app message. Ignoring.">
	//   23   55:invokestatic    #381 <Method int AppboyLogger.i(String, String)>
	//   24   58:pop             
			return false;
	//   25   59:iconst_0        
	//   26   60:ireturn         
		}
		if(C)
	//*  27   61:aload_0         
	//*  28   62:getfield        #136 <Field boolean C>
	//*  29   65:ifeq            80
		{
			AppboyLogger.i(a, "Display failure already logged for this in-app message. Ignoring.");
	//   30   68:getstatic       #73  <Field String a>
	//   31   71:ldc2            #383 <String "Display failure already logged for this in-app message. Ignoring.">
	//   32   74:invokestatic    #381 <Method int AppboyLogger.i(String, String)>
	//   33   77:pop             
			return false;
	//   34   78:iconst_0        
	//   35   79:ireturn         
		}
		if(i == null)
	//*  36   80:aload_0         
	//*  37   81:getfield        #188 <Field bt i>
	//*  38   84:ifnonnull       99
		{
			AppboyLogger.e(a, "Cannot log an in-app message click because the AppboyManager is null.");
	//   39   87:getstatic       #73  <Field String a>
	//   40   90:ldc2            #385 <String "Cannot log an in-app message click because the AppboyManager is null.">
	//   41   93:invokestatic    #387 <Method int AppboyLogger.e(String, String)>
	//   42   96:pop             
			return false;
	//   43   97:iconst_0        
	//   44   98:ireturn         
		}
		try
		{
			ci ci1 = ci.c(b, c, d);
	//   45   99:aload_0         
	//   46  100:getfield        #180 <Field String b>
	//   47  103:aload_0         
	//   48  104:getfield        #182 <Field String c>
	//   49  107:aload_0         
	//   50  108:getfield        #184 <Field String d>
	//   51  111:invokestatic    #392 <Method ci ci.c(String, String, String)>
	//   52  114:astore_1        
			i.a(((bo.app.cc) (ci1)));
	//   53  115:aload_0         
	//   54  116:getfield        #188 <Field bt i>
	//   55  119:aload_1         
	//   56  120:invokeinterface #397 <Method boolean bt.a(bo.app.cc)>
	//   57  125:pop             
			B = true;
	//   58  126:aload_0         
	//   59  127:iconst_1        
	//   60  128:putfield        #134 <Field boolean B>
		}
	//*  61  131:iconst_1        
	//*  62  132:ireturn         
		catch(JSONException jsonexception)
	//*  63  133:astore_1        
		{
			i.a(((Throwable) (jsonexception)));
	//   64  134:aload_0         
	//   65  135:getfield        #188 <Field bt i>
	//   66  138:aload_1         
	//   67  139:invokeinterface #400 <Method void bt.a(Throwable)>
			return false;
	//   68  144:iconst_0        
	//   69  145:ireturn         
		}
		return true;
	}

	public boolean logDisplayFailure(InAppMessageFailureType inappmessagefailuretype)
	{
		if(StringUtils.isNullOrBlank(b) && StringUtils.isNullOrBlank(c) && StringUtils.isNullOrBlank(d))
	//*   0    0:aload_0         
	//*   1    1:getfield        #180 <Field String b>
	//*   2    4:invokestatic    #156 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   3    7:ifeq            42
	//*   4   10:aload_0         
	//*   5   11:getfield        #182 <Field String c>
	//*   6   14:invokestatic    #156 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   7   17:ifeq            42
	//*   8   20:aload_0         
	//*   9   21:getfield        #184 <Field String d>
	//*  10   24:invokestatic    #156 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  11   27:ifeq            42
		{
			AppboyLogger.d(a, "Campaign, card, and trigger Ids not found. Not logging in-app message display failure.");
	//   12   30:getstatic       #73  <Field String a>
	//   13   33:ldc2            #404 <String "Campaign, card, and trigger Ids not found. Not logging in-app message display failure.">
	//   14   36:invokestatic    #377 <Method int AppboyLogger.d(String, String)>
	//   15   39:pop             
			return false;
	//   16   40:iconst_0        
	//   17   41:ireturn         
		}
		if(C)
	//*  18   42:aload_0         
	//*  19   43:getfield        #136 <Field boolean C>
	//*  20   46:ifeq            61
		{
			AppboyLogger.i(a, "Display failure already logged for this in-app message. Ignoring.");
	//   21   49:getstatic       #73  <Field String a>
	//   22   52:ldc2            #383 <String "Display failure already logged for this in-app message. Ignoring.">
	//   23   55:invokestatic    #381 <Method int AppboyLogger.i(String, String)>
	//   24   58:pop             
			return false;
	//   25   59:iconst_0        
	//   26   60:ireturn         
		}
		if(B)
	//*  27   61:aload_0         
	//*  28   62:getfield        #134 <Field boolean B>
	//*  29   65:ifeq            80
		{
			AppboyLogger.i(a, "Click already logged for this in-app message. Ignoring.");
	//   30   68:getstatic       #73  <Field String a>
	//   31   71:ldc2            #379 <String "Click already logged for this in-app message. Ignoring.">
	//   32   74:invokestatic    #381 <Method int AppboyLogger.i(String, String)>
	//   33   77:pop             
			return false;
	//   34   78:iconst_0        
	//   35   79:ireturn         
		}
		if(A)
	//*  36   80:aload_0         
	//*  37   81:getfield        #132 <Field boolean A>
	//*  38   84:ifeq            99
		{
			AppboyLogger.i(a, "Impression already logged for this in-app message. Ignoring.");
	//   39   87:getstatic       #73  <Field String a>
	//   40   90:ldc2            #406 <String "Impression already logged for this in-app message. Ignoring.">
	//   41   93:invokestatic    #381 <Method int AppboyLogger.i(String, String)>
	//   42   96:pop             
			return false;
	//   43   97:iconst_0        
	//   44   98:ireturn         
		}
		if(i == null)
	//*  45   99:aload_0         
	//*  46  100:getfield        #188 <Field bt i>
	//*  47  103:ifnonnull       118
		{
			AppboyLogger.e(a, "Cannot log an in-app message display failure because the AppboyManager is null.");
	//   48  106:getstatic       #73  <Field String a>
	//   49  109:ldc2            #408 <String "Cannot log an in-app message display failure because the AppboyManager is null.">
	//   50  112:invokestatic    #387 <Method int AppboyLogger.e(String, String)>
	//   51  115:pop             
			return false;
	//   52  116:iconst_0        
	//   53  117:ireturn         
		}
		try
		{
			inappmessagefailuretype = ((InAppMessageFailureType) (ci.a(b, c, d, inappmessagefailuretype)));
	//   54  118:aload_0         
	//   55  119:getfield        #180 <Field String b>
	//   56  122:aload_0         
	//   57  123:getfield        #182 <Field String c>
	//   58  126:aload_0         
	//   59  127:getfield        #184 <Field String d>
	//   60  130:aload_1         
	//   61  131:invokestatic    #411 <Method ci ci.a(String, String, String, InAppMessageFailureType)>
	//   62  134:astore_1        
			i.a(((bo.app.cc) (inappmessagefailuretype)));
	//   63  135:aload_0         
	//   64  136:getfield        #188 <Field bt i>
	//   65  139:aload_1         
	//   66  140:invokeinterface #397 <Method boolean bt.a(bo.app.cc)>
	//   67  145:pop             
			C = true;
	//   68  146:aload_0         
	//   69  147:iconst_1        
	//   70  148:putfield        #136 <Field boolean C>
		}
	//*  71  151:iconst_1        
	//*  72  152:ireturn         
		// Misplaced declaration of an exception variable
		catch(InAppMessageFailureType inappmessagefailuretype)
	//*  73  153:astore_1        
		{
			i.a(((Throwable) (inappmessagefailuretype)));
	//   74  154:aload_0         
	//   75  155:getfield        #188 <Field bt i>
	//   76  158:aload_1         
	//   77  159:invokeinterface #400 <Method void bt.a(Throwable)>
			return false;
	//   78  164:iconst_0        
	//   79  165:ireturn         
		}
		return true;
	}

	public boolean logImpression()
	{
		if(StringUtils.isNullOrEmpty(b) && StringUtils.isNullOrEmpty(c) && StringUtils.isNullOrEmpty(d))
	//*   0    0:aload_0         
	//*   1    1:getfield        #180 <Field String b>
	//*   2    4:invokestatic    #415 <Method boolean StringUtils.isNullOrEmpty(String)>
	//*   3    7:ifeq            42
	//*   4   10:aload_0         
	//*   5   11:getfield        #182 <Field String c>
	//*   6   14:invokestatic    #415 <Method boolean StringUtils.isNullOrEmpty(String)>
	//*   7   17:ifeq            42
	//*   8   20:aload_0         
	//*   9   21:getfield        #184 <Field String d>
	//*  10   24:invokestatic    #415 <Method boolean StringUtils.isNullOrEmpty(String)>
	//*  11   27:ifeq            42
		{
			AppboyLogger.d(a, "Campaign, card, and trigger Ids not found. Not logging in-app message impression.");
	//   12   30:getstatic       #73  <Field String a>
	//   13   33:ldc2            #417 <String "Campaign, card, and trigger Ids not found. Not logging in-app message impression.">
	//   14   36:invokestatic    #377 <Method int AppboyLogger.d(String, String)>
	//   15   39:pop             
			return false;
	//   16   40:iconst_0        
	//   17   41:ireturn         
		}
		if(A)
	//*  18   42:aload_0         
	//*  19   43:getfield        #132 <Field boolean A>
	//*  20   46:ifeq            61
		{
			AppboyLogger.i(a, "Impression already logged for this in-app message. Ignoring.");
	//   21   49:getstatic       #73  <Field String a>
	//   22   52:ldc2            #406 <String "Impression already logged for this in-app message. Ignoring.">
	//   23   55:invokestatic    #381 <Method int AppboyLogger.i(String, String)>
	//   24   58:pop             
			return false;
	//   25   59:iconst_0        
	//   26   60:ireturn         
		}
		if(C)
	//*  27   61:aload_0         
	//*  28   62:getfield        #136 <Field boolean C>
	//*  29   65:ifeq            80
		{
			AppboyLogger.i(a, "Display failure already logged for this in-app message. Ignoring.");
	//   30   68:getstatic       #73  <Field String a>
	//   31   71:ldc2            #383 <String "Display failure already logged for this in-app message. Ignoring.">
	//   32   74:invokestatic    #381 <Method int AppboyLogger.i(String, String)>
	//   33   77:pop             
			return false;
	//   34   78:iconst_0        
	//   35   79:ireturn         
		}
		if(i == null)
	//*  36   80:aload_0         
	//*  37   81:getfield        #188 <Field bt i>
	//*  38   84:ifnonnull       99
		{
			AppboyLogger.e(a, "Cannot log an in-app message impression because the AppboyManager is null.");
	//   39   87:getstatic       #73  <Field String a>
	//   40   90:ldc2            #419 <String "Cannot log an in-app message impression because the AppboyManager is null.">
	//   41   93:invokestatic    #387 <Method int AppboyLogger.e(String, String)>
	//   42   96:pop             
			return false;
	//   43   97:iconst_0        
	//   44   98:ireturn         
		}
		try
		{
			ci ci1 = ci.b(b, c, d);
	//   45   99:aload_0         
	//   46  100:getfield        #180 <Field String b>
	//   47  103:aload_0         
	//   48  104:getfield        #182 <Field String c>
	//   49  107:aload_0         
	//   50  108:getfield        #184 <Field String d>
	//   51  111:invokestatic    #421 <Method ci ci.b(String, String, String)>
	//   52  114:astore_1        
			i.a(((bo.app.cc) (ci1)));
	//   53  115:aload_0         
	//   54  116:getfield        #188 <Field bt i>
	//   55  119:aload_1         
	//   56  120:invokeinterface #397 <Method boolean bt.a(bo.app.cc)>
	//   57  125:pop             
			A = true;
	//   58  126:aload_0         
	//   59  127:iconst_1        
	//   60  128:putfield        #132 <Field boolean A>
		}
	//*  61  131:iconst_1        
	//*  62  132:ireturn         
		catch(JSONException jsonexception)
	//*  63  133:astore_1        
		{
			i.a(((Throwable) (jsonexception)));
	//   64  134:aload_0         
	//   65  135:getfield        #188 <Field bt i>
	//   66  138:aload_1         
	//   67  139:invokeinterface #400 <Method void bt.a(Throwable)>
			return false;
	//   68  144:iconst_0        
	//   69  145:ireturn         
		}
		return true;
	}

	public void onAfterClosed()
	{
		if(B && !StringUtils.isNullOrEmpty(d))
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field boolean B>
	//*   2    4:ifeq            37
	//*   3    7:aload_0         
	//*   4    8:getfield        #184 <Field String d>
	//*   5   11:invokestatic    #415 <Method boolean StringUtils.isNullOrEmpty(String)>
	//*   6   14:ifne            37
			i.a(((bo.app.fr) (new ft(d))));
	//    7   17:aload_0         
	//    8   18:getfield        #188 <Field bt i>
	//    9   21:new             #424 <Class ft>
	//   10   24:dup             
	//   11   25:aload_0         
	//   12   26:getfield        #184 <Field String d>
	//   13   29:invokespecial   #427 <Method void ft(String)>
	//   14   32:invokeinterface #430 <Method void bt.a(bo.app.fr)>
	//   15   37:return          
	}

	public void setAnimateIn(boolean flag)
	{
		l = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #79  <Field boolean l>
	//    3    5:return          
	}

	public void setAnimateOut(boolean flag)
	{
		m = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #81  <Field boolean m>
	//    3    5:return          
	}

	public void setBackgroundColor(int i1)
	{
		r = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #99  <Field int r>
	//    3    5:return          
	}

	public void setBitmap(Bitmap bitmap)
	{
		y = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #337 <Field Bitmap y>
	//    3    5:return          
	}

	public boolean setClickAction(ClickAction clickaction)
	{
		if(clickaction != ClickAction.URI)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #150 <Field ClickAction ClickAction.URI>
	//*   2    4:if_acmpeq       19
		{
			n = clickaction;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #88  <Field ClickAction n>
			o = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #164 <Field Uri o>
			return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		} else
		{
			AppboyLogger.e(a, "A non-null URI is required in order to set the message ClickAction to URI.");
	//   11   19:getstatic       #73  <Field String a>
	//   12   22:ldc2            #440 <String "A non-null URI is required in order to set the message ClickAction to URI.">
	//   13   25:invokestatic    #387 <Method int AppboyLogger.e(String, String)>
	//   14   28:pop             
			return false;
	//   15   29:iconst_0        
	//   16   30:ireturn         
		}
	}

	public boolean setClickAction(ClickAction clickaction, Uri uri)
	{
		if(uri == null && clickaction == ClickAction.URI)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       23
	//*   2    4:aload_1         
	//*   3    5:getstatic       #150 <Field ClickAction ClickAction.URI>
	//*   4    8:if_acmpne       23
		{
			AppboyLogger.e(a, "A non-null URI is required in order to set the message ClickAction to URI.");
	//    5   11:getstatic       #73  <Field String a>
	//    6   14:ldc2            #440 <String "A non-null URI is required in order to set the message ClickAction to URI.">
	//    7   17:invokestatic    #387 <Method int AppboyLogger.e(String, String)>
	//    8   20:pop             
			return false;
	//    9   21:iconst_0        
	//   10   22:ireturn         
		}
		if(uri != null && clickaction == ClickAction.URI)
	//*  11   23:aload_2         
	//*  12   24:ifnull          46
	//*  13   27:aload_1         
	//*  14   28:getstatic       #150 <Field ClickAction ClickAction.URI>
	//*  15   31:if_acmpne       46
		{
			n = clickaction;
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:putfield        #88  <Field ClickAction n>
			o = uri;
	//   19   39:aload_0         
	//   20   40:aload_2         
	//   21   41:putfield        #164 <Field Uri o>
			return true;
	//   22   44:iconst_1        
	//   23   45:ireturn         
		} else
		{
			return setClickAction(clickaction);
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:invokevirtual   #443 <Method boolean setClickAction(ClickAction)>
	//   27   51:ireturn         
		}
	}

	public void setCropType(CropType croptype)
	{
		e = croptype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #121 <Field CropType e>
	//    3    5:return          
	}

	public void setDismissType(DismissType dismisstype)
	{
		p = dismisstype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #95  <Field DismissType p>
	//    3    5:return          
	}

	public void setDurationInMilliseconds(int i1)
	{
		if(i1 < 999)
	//*   0    0:iload_1         
	//*   1    1:sipush          999
	//*   2    4:icmpge          91
		{
			q = 5000;
	//    3    7:aload_0         
	//    4    8:sipush          5000
	//    5   11:putfield        #97  <Field int q>
			String s1 = a;
	//    6   14:getstatic       #73  <Field String a>
	//    7   17:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    8   18:new             #449 <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #450 <Method void StringBuilder()>
	//   11   25:astore_3        
			stringbuilder.append("Requested in-app message duration ");
	//   12   26:aload_3         
	//   13   27:ldc2            #452 <String "Requested in-app message duration ">
	//   14   30:invokevirtual   #456 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
			stringbuilder.append(i1);
	//   16   34:aload_3         
	//   17   35:iload_1         
	//   18   36:invokevirtual   #459 <Method StringBuilder StringBuilder.append(int)>
	//   19   39:pop             
			stringbuilder.append(" is lower than the minimum of ");
	//   20   40:aload_3         
	//   21   41:ldc2            #461 <String " is lower than the minimum of ">
	//   22   44:invokevirtual   #456 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
			stringbuilder.append(999);
	//   24   48:aload_3         
	//   25   49:sipush          999
	//   26   52:invokevirtual   #459 <Method StringBuilder StringBuilder.append(int)>
	//   27   55:pop             
			stringbuilder.append(". Defaulting to ");
	//   28   56:aload_3         
	//   29   57:ldc2            #463 <String ". Defaulting to ">
	//   30   60:invokevirtual   #456 <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
			stringbuilder.append(q);
	//   32   64:aload_3         
	//   33   65:aload_0         
	//   34   66:getfield        #97  <Field int q>
	//   35   69:invokevirtual   #459 <Method StringBuilder StringBuilder.append(int)>
	//   36   72:pop             
			stringbuilder.append(" milliseconds.");
	//   37   73:aload_3         
	//   38   74:ldc2            #465 <String " milliseconds.">
	//   39   77:invokevirtual   #456 <Method StringBuilder StringBuilder.append(String)>
	//   40   80:pop             
			AppboyLogger.w(s1, stringbuilder.toString());
	//   41   81:aload_2         
	//   42   82:aload_3         
	//   43   83:invokevirtual   #466 <Method String StringBuilder.toString()>
	//   44   86:invokestatic    #468 <Method int AppboyLogger.w(String, String)>
	//   45   89:pop             
			return;
	//   46   90:return          
		} else
		{
			q = i1;
	//   47   91:aload_0         
	//   48   92:iload_1         
	//   49   93:putfield        #97  <Field int q>
			String s2 = a;
	//   50   96:getstatic       #73  <Field String a>
	//   51   99:astore_2        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   52  100:new             #449 <Class StringBuilder>
	//   53  103:dup             
	//   54  104:invokespecial   #450 <Method void StringBuilder()>
	//   55  107:astore_3        
			stringbuilder1.append("Set in-app message duration to ");
	//   56  108:aload_3         
	//   57  109:ldc2            #470 <String "Set in-app message duration to ">
	//   58  112:invokevirtual   #456 <Method StringBuilder StringBuilder.append(String)>
	//   59  115:pop             
			stringbuilder1.append(q);
	//   60  116:aload_3         
	//   61  117:aload_0         
	//   62  118:getfield        #97  <Field int q>
	//   63  121:invokevirtual   #459 <Method StringBuilder StringBuilder.append(int)>
	//   64  124:pop             
			stringbuilder1.append(" milliseconds.");
	//   65  125:aload_3         
	//   66  126:ldc2            #465 <String " milliseconds.">
	//   67  129:invokevirtual   #456 <Method StringBuilder StringBuilder.append(String)>
	//   68  132:pop             
			AppboyLogger.d(s2, stringbuilder1.toString());
	//   69  133:aload_2         
	//   70  134:aload_3         
	//   71  135:invokevirtual   #466 <Method String StringBuilder.toString()>
	//   72  138:invokestatic    #377 <Method int AppboyLogger.d(String, String)>
	//   73  141:pop             
			return;
	//   74  142:return          
		}
	}

	public void setExpirationTimestamp(long l1)
	{
		F = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #142 <Field long F>
	//    3    5:return          
	}

	public void setIcon(String s1)
	{
		v = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #176 <Field String v>
	//    3    5:return          
	}

	public void setIconBackgroundColor(int i1)
	{
		u = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #105 <Field int u>
	//    3    5:return          
	}

	public void setIconColor(int i1)
	{
		t = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #103 <Field int t>
	//    3    5:return          
	}

	public void setImageDownloadSuccessful(boolean flag)
	{
		z = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #114 <Field boolean z>
	//    3    5:return          
	}

	public void setImageUrl(String s1)
	{
		setRemoteImageUrl(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #480 <Method void setRemoteImageUrl(String)>
	//    3    5:return          
	}

	public void setLocalAssetPathForPrefetch(String s1)
	{
		setLocalImageUrl(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #484 <Method void setLocalImageUrl(String)>
	//    3    5:return          
	}

	public void setLocalImageUrl(String s1)
	{
		E = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #360 <Field String E>
	//    3    5:return          
	}

	public void setMessage(String s1)
	{
		j = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #145 <Field String j>
	//    3    5:return          
	}

	public void setMessageTextAlign(TextAlign textalign)
	{
		f = textalign;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #128 <Field TextAlign f>
	//    3    5:return          
	}

	public void setMessageTextColor(int i1)
	{
		s = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #101 <Field int s>
	//    3    5:return          
	}

	public void setOpenUriInWebView(boolean flag)
	{
		g = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #130 <Field boolean g>
	//    3    5:return          
	}

	public void setOrientation(Orientation orientation)
	{
		x = orientation;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #112 <Field Orientation x>
	//    3    5:return          
	}

	public void setRemoteImageUrl(String s1)
	{
		w = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #178 <Field String w>
	//    3    5:return          
	}

	public static final int INAPP_MESSAGE_DURATION_DEFAULT_MILLIS = 5000;
	public static final int INAPP_MESSAGE_DURATION_MIN_MILLIS = 999;
	public static final String IS_CONTROL = "is_control";
	public static final String TYPE = "type";
	protected static final String a = AppboyLogger.getAppboyLogTag(com/appboy/models/InAppMessageBase);
	private boolean A;
	private boolean B;
	private boolean C;
	private boolean D;
	private String E;
	private long F;
	String b;
	String c;
	String d;
	protected CropType e;
	protected TextAlign f;
	protected boolean g;
	protected JSONObject h;
	protected bt i;
	private String j;
	private Map k;
	private boolean l;
	private boolean m;
	private ClickAction n;
	private Uri o;
	private DismissType p;
	private int q;
	private int r;
	private int s;
	private int t;
	private int u;
	private String v;
	private String w;
	private Orientation x;
	private Bitmap y;
	private boolean z;

	static 
	{
	//    0    0:ldc1            #2   <Class InAppMessageBase>
	//    1    2:invokestatic    #71  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #73  <Field String a>
	//*   3    8:return          
	}
}
