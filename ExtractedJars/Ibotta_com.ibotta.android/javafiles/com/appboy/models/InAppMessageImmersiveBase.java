// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models;

import bo.app.*;
import com.appboy.enums.inappmessage.ImageStyle;
import com.appboy.enums.inappmessage.TextAlign;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.*;
import org.json.*;

// Referenced classes of package com.appboy.models:
//			InAppMessageBase, IInAppMessageImmersive, MessageButton

public abstract class InAppMessageImmersiveBase extends InAppMessageBase
	implements IInAppMessageImmersive
{

	protected InAppMessageImmersiveBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void InAppMessageBase()>
		l = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #29  <Field int l>
		m = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #31  <Field int m>
		j = ImageStyle.TOP;
	//    8   14:aload_0         
	//    9   15:getstatic       #36  <Field ImageStyle ImageStyle.TOP>
	//   10   18:putfield        #38  <Field ImageStyle j>
		o = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #40  <Field Integer o>
		p = TextAlign.CENTER;
	//   14   26:aload_0         
	//   15   27:getstatic       #45  <Field TextAlign TextAlign.CENTER>
	//   16   30:putfield        #47  <Field TextAlign p>
		r = null;
	//   17   33:aload_0         
	//   18   34:aconst_null     
	//   19   35:putfield        #49  <Field String r>
	//   20   38:return          
	}

	public InAppMessageImmersiveBase(JSONObject jsonobject, bt bt1)
	{
		this(jsonobject, bt1, jsonobject.optString("header"), jsonobject.optInt("header_text_color"), jsonobject.optInt("close_btn_color"), (ImageStyle)ek.a(jsonobject, "image_style", com/appboy/enums/inappmessage/ImageStyle, ((Enum) (ImageStyle.TOP))), (TextAlign)ek.a(jsonobject, "text_align_header", com/appboy/enums/inappmessage/TextAlign, ((Enum) (TextAlign.CENTER))), (TextAlign)ek.a(jsonobject, "text_align_message", com/appboy/enums/inappmessage/TextAlign, ((Enum) (TextAlign.CENTER))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:ldc1            #53  <String "header">
	//    5    6:invokevirtual   #59  <Method String JSONObject.optString(String)>
	//    6    9:aload_1         
	//    7   10:ldc1            #61  <String "header_text_color">
	//    8   12:invokevirtual   #65  <Method int JSONObject.optInt(String)>
	//    9   15:aload_1         
	//   10   16:ldc1            #67  <String "close_btn_color">
	//   11   18:invokevirtual   #65  <Method int JSONObject.optInt(String)>
	//   12   21:aload_1         
	//   13   22:ldc1            #69  <String "image_style">
	//   14   24:ldc1            #33  <Class ImageStyle>
	//   15   26:getstatic       #36  <Field ImageStyle ImageStyle.TOP>
	//   16   29:invokestatic    #75  <Method Enum ek.a(JSONObject, String, Class, Enum)>
	//   17   32:checkcast       #33  <Class ImageStyle>
	//   18   35:aload_1         
	//   19   36:ldc1            #77  <String "text_align_header">
	//   20   38:ldc1            #42  <Class TextAlign>
	//   21   40:getstatic       #45  <Field TextAlign TextAlign.CENTER>
	//   22   43:invokestatic    #75  <Method Enum ek.a(JSONObject, String, Class, Enum)>
	//   23   46:checkcast       #42  <Class TextAlign>
	//   24   49:aload_1         
	//   25   50:ldc1            #79  <String "text_align_message">
	//   26   52:ldc1            #42  <Class TextAlign>
	//   27   54:getstatic       #45  <Field TextAlign TextAlign.CENTER>
	//   28   57:invokestatic    #75  <Method Enum ek.a(JSONObject, String, Class, Enum)>
	//   29   60:checkcast       #42  <Class TextAlign>
	//   30   63:invokespecial   #82  <Method void InAppMessageImmersiveBase(JSONObject, bt, String, int, int, ImageStyle, TextAlign, TextAlign)>
		if(jsonobject.optJSONArray("btns") != null)
	//*  31   66:aload_1         
	//*  32   67:ldc1            #84  <String "btns">
	//*  33   69:invokevirtual   #88  <Method JSONArray JSONObject.optJSONArray(String)>
	//*  34   72:ifnull          131
		{
			bt1 = ((bt) (new ArrayList()));
	//   35   75:new             #90  <Class ArrayList>
	//   36   78:dup             
	//   37   79:invokespecial   #91  <Method void ArrayList()>
	//   38   82:astore_2        
			jsonobject = ((JSONObject) (jsonobject.optJSONArray("btns")));
	//   39   83:aload_1         
	//   40   84:ldc1            #84  <String "btns">
	//   41   86:invokevirtual   #88  <Method JSONArray JSONObject.optJSONArray(String)>
	//   42   89:astore_1        
			for(int i = 0; i < ((JSONArray) (jsonobject)).length(); i++)
	//*  43   90:iconst_0        
	//*  44   91:istore_3        
	//*  45   92:iload_3         
	//*  46   93:aload_1         
	//*  47   94:invokevirtual   #97  <Method int JSONArray.length()>
	//*  48   97:icmpge          126
				((List) (bt1)).add(((Object) (new MessageButton(((JSONArray) (jsonobject)).optJSONObject(i)))));
	//   49  100:aload_2         
	//   50  101:new             #99  <Class MessageButton>
	//   51  104:dup             
	//   52  105:aload_1         
	//   53  106:iload_3         
	//   54  107:invokevirtual   #103 <Method JSONObject JSONArray.optJSONObject(int)>
	//   55  110:invokespecial   #106 <Method void MessageButton(JSONObject)>
	//   56  113:invokeinterface #112 <Method boolean List.add(Object)>
	//   57  118:pop             

	//   58  119:iload_3         
	//   59  120:iconst_1        
	//   60  121:iadd            
	//   61  122:istore_3        
	//*  62  123:goto            92
			setMessageButtons(((List) (bt1)));
	//   63  126:aload_0         
	//   64  127:aload_2         
	//   65  128:invokevirtual   #116 <Method void setMessageButtons(List)>
		}
	//   66  131:return          
	}

	private InAppMessageImmersiveBase(JSONObject jsonobject, bt bt1, String s, int i, int i1, ImageStyle imagestyle, TextAlign textalign, 
			TextAlign textalign1)
	{
		super(jsonobject, bt1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #118 <Method void InAppMessageBase(JSONObject, bt)>
		l = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #29  <Field int l>
		m = 0;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #31  <Field int m>
		j = ImageStyle.TOP;
	//   10   16:aload_0         
	//   11   17:getstatic       #36  <Field ImageStyle ImageStyle.TOP>
	//   12   20:putfield        #38  <Field ImageStyle j>
		o = null;
	//   13   23:aload_0         
	//   14   24:aconst_null     
	//   15   25:putfield        #40  <Field Integer o>
		p = TextAlign.CENTER;
	//   16   28:aload_0         
	//   17   29:getstatic       #45  <Field TextAlign TextAlign.CENTER>
	//   18   32:putfield        #47  <Field TextAlign p>
		r = null;
	//   19   35:aload_0         
	//   20   36:aconst_null     
	//   21   37:putfield        #49  <Field String r>
		k = s;
	//   22   40:aload_0         
	//   23   41:aload_3         
	//   24   42:putfield        #120 <Field String k>
		l = i;
	//   25   45:aload_0         
	//   26   46:iload           4
	//   27   48:putfield        #29  <Field int l>
		m = i1;
	//   28   51:aload_0         
	//   29   52:iload           5
	//   30   54:putfield        #31  <Field int m>
		if(jsonobject.has("frame_color"))
	//*  31   57:aload_1         
	//*  32   58:ldc1            #122 <String "frame_color">
	//*  33   60:invokevirtual   #126 <Method boolean JSONObject.has(String)>
	//*  34   63:ifeq            79
			o = Integer.valueOf(jsonobject.optInt("frame_color"));
	//   35   66:aload_0         
	//   36   67:aload_1         
	//   37   68:ldc1            #122 <String "frame_color">
	//   38   70:invokevirtual   #65  <Method int JSONObject.optInt(String)>
	//   39   73:invokestatic    #132 <Method Integer Integer.valueOf(int)>
	//   40   76:putfield        #40  <Field Integer o>
		j = imagestyle;
	//   41   79:aload_0         
	//   42   80:aload           6
	//   43   82:putfield        #38  <Field ImageStyle j>
		p = textalign;
	//   44   85:aload_0         
	//   45   86:aload           7
	//   46   88:putfield        #47  <Field TextAlign p>
		f = textalign1;
	//   47   91:aload_0         
	//   48   92:aload           8
	//   49   94:putfield        #135 <Field TextAlign f>
	//   50   97:return          
	}

	public volatile Object forJsonPut()
	{
		return ((Object) (forJsonPut()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method JSONObject forJsonPut()>
	//    2    4:areturn         
	}

	public JSONObject forJsonPut()
	{
		if(h != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #146 <Field JSONObject h>
	//*   2    4:ifnull          12
			return h;
	//    3    7:aload_0         
	//    4    8:getfield        #146 <Field JSONObject h>
	//    5   11:areturn         
		JSONObject jsonobject;
		JSONArray jsonarray;
		jsonobject = super.forJsonPut();
	//    6   12:aload_0         
	//    7   13:invokespecial   #147 <Method JSONObject InAppMessageBase.forJsonPut()>
	//    8   16:astore_1        
		jsonobject.putOpt("header", ((Object) (k)));
	//    9   17:aload_1         
	//   10   18:ldc1            #53  <String "header">
	//   11   20:aload_0         
	//   12   21:getfield        #120 <Field String k>
	//   13   24:invokevirtual   #151 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   14   27:pop             
		jsonobject.put("header_text_color", l);
	//   15   28:aload_1         
	//   16   29:ldc1            #61  <String "header_text_color">
	//   17   31:aload_0         
	//   18   32:getfield        #29  <Field int l>
	//   19   35:invokevirtual   #155 <Method JSONObject JSONObject.put(String, int)>
	//   20   38:pop             
		jsonobject.put("close_btn_color", m);
	//   21   39:aload_1         
	//   22   40:ldc1            #67  <String "close_btn_color">
	//   23   42:aload_0         
	//   24   43:getfield        #31  <Field int m>
	//   25   46:invokevirtual   #155 <Method JSONObject JSONObject.put(String, int)>
	//   26   49:pop             
		jsonobject.putOpt("image_style", ((Object) (j.toString())));
	//   27   50:aload_1         
	//   28   51:ldc1            #69  <String "image_style">
	//   29   53:aload_0         
	//   30   54:getfield        #38  <Field ImageStyle j>
	//   31   57:invokevirtual   #159 <Method String ImageStyle.toString()>
	//   32   60:invokevirtual   #151 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   33   63:pop             
		jsonobject.putOpt("text_align_header", ((Object) (p.toString())));
	//   34   64:aload_1         
	//   35   65:ldc1            #77  <String "text_align_header">
	//   36   67:aload_0         
	//   37   68:getfield        #47  <Field TextAlign p>
	//   38   71:invokevirtual   #160 <Method String TextAlign.toString()>
	//   39   74:invokevirtual   #151 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   40   77:pop             
		if(o != null)
	//*  41   78:aload_0         
	//*  42   79:getfield        #40  <Field Integer o>
	//*  43   82:ifnull          99
			jsonobject.put("frame_color", o.intValue());
	//   44   85:aload_1         
	//   45   86:ldc1            #122 <String "frame_color">
	//   46   88:aload_0         
	//   47   89:getfield        #40  <Field Integer o>
	//   48   92:invokevirtual   #163 <Method int Integer.intValue()>
	//   49   95:invokevirtual   #155 <Method JSONObject JSONObject.put(String, int)>
	//   50   98:pop             
		if(n == null)
			break MISSING_BLOCK_LABEL_161;
	//   51   99:aload_0         
	//   52  100:getfield        #165 <Field List n>
	//   53  103:ifnull          161
		jsonarray = new JSONArray();
	//   54  106:new             #93  <Class JSONArray>
	//   55  109:dup             
	//   56  110:invokespecial   #166 <Method void JSONArray()>
	//   57  113:astore_2        
		for(Iterator iterator = n.iterator(); iterator.hasNext(); jsonarray.put(((Object) (((MessageButton)iterator.next()).forJsonPut()))));
	//   58  114:aload_0         
	//   59  115:getfield        #165 <Field List n>
	//   60  118:invokeinterface #170 <Method Iterator List.iterator()>
	//   61  123:astore_3        
	//   62  124:aload_3         
	//   63  125:invokeinterface #176 <Method boolean Iterator.hasNext()>
	//   64  130:ifeq            153
	//   65  133:aload_2         
	//   66  134:aload_3         
	//   67  135:invokeinterface #179 <Method Object Iterator.next()>
	//   68  140:checkcast       #99  <Class MessageButton>
	//   69  143:invokevirtual   #180 <Method JSONObject MessageButton.forJsonPut()>
	//   70  146:invokevirtual   #183 <Method JSONArray JSONArray.put(Object)>
	//   71  149:pop             
	//*  72  150:goto            124
		try
		{
			jsonobject.put("btns", ((Object) (jsonarray)));
	//   73  153:aload_1         
	//   74  154:ldc1            #84  <String "btns">
	//   75  156:aload_2         
	//   76  157:invokevirtual   #185 <Method JSONObject JSONObject.put(String, Object)>
	//   77  160:pop             
		}
	//*  78  161:aload_1         
	//*  79  162:areturn         
	//*  80  163:aconst_null     
	//*  81  164:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			return null;
		}
		JSONException jsonexception;
		return jsonobject;
	//*  82  165:astore_1        
	//*  83  166:goto            163
	}

	public int getCloseButtonColor()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int m>
	//    2    4:ireturn         
	}

	public Integer getFrameColor()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Integer o>
	//    2    4:areturn         
	}

	public String getHeader()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field String k>
	//    2    4:areturn         
	}

	public TextAlign getHeaderTextAlign()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field TextAlign p>
	//    2    4:areturn         
	}

	public int getHeaderTextColor()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int l>
	//    2    4:ireturn         
	}

	public ImageStyle getImageStyle()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ImageStyle j>
	//    2    4:areturn         
	}

	public List getMessageButtons()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field List n>
	//    2    4:areturn         
	}

	public boolean logButtonClick(MessageButton messagebutton)
	{
		if(StringUtils.isNullOrBlank(b) && StringUtils.isNullOrBlank(c) && StringUtils.isNullOrBlank(d))
	//*   0    0:aload_0         
	//*   1    1:getfield        #203 <Field String b>
	//*   2    4:invokestatic    #208 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   3    7:ifeq            41
	//*   4   10:aload_0         
	//*   5   11:getfield        #211 <Field String c>
	//*   6   14:invokestatic    #208 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   7   17:ifeq            41
	//*   8   20:aload_0         
	//*   9   21:getfield        #214 <Field String d>
	//*  10   24:invokestatic    #208 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  11   27:ifeq            41
		{
			AppboyLogger.d(a, "Campaign, trigger, and card Ids not found. Not logging button click.");
	//   12   30:getstatic       #216 <Field String a>
	//   13   33:ldc1            #218 <String "Campaign, trigger, and card Ids not found. Not logging button click.">
	//   14   35:invokestatic    #223 <Method int AppboyLogger.d(String, String)>
	//   15   38:pop             
			return false;
	//   16   39:iconst_0        
	//   17   40:ireturn         
		}
		if(messagebutton == null)
	//*  18   41:aload_1         
	//*  19   42:ifnonnull       56
		{
			AppboyLogger.w(a, "Message button was null. Ignoring button click.");
	//   20   45:getstatic       #216 <Field String a>
	//   21   48:ldc1            #225 <String "Message button was null. Ignoring button click.">
	//   22   50:invokestatic    #228 <Method int AppboyLogger.w(String, String)>
	//   23   53:pop             
			return false;
	//   24   54:iconst_0        
	//   25   55:ireturn         
		}
		if(q)
	//*  26   56:aload_0         
	//*  27   57:getfield        #230 <Field boolean q>
	//*  28   60:ifeq            74
		{
			AppboyLogger.i(a, "Button click already logged for this message. Ignoring.");
	//   29   63:getstatic       #216 <Field String a>
	//   30   66:ldc1            #232 <String "Button click already logged for this message. Ignoring.">
	//   31   68:invokestatic    #235 <Method int AppboyLogger.i(String, String)>
	//   32   71:pop             
			return false;
	//   33   72:iconst_0        
	//   34   73:ireturn         
		}
		if(i == null)
	//*  35   74:aload_0         
	//*  36   75:getfield        #238 <Field bt i>
	//*  37   78:ifnonnull       92
		{
			AppboyLogger.e(a, "Cannot log a button click because the AppboyManager is null.");
	//   38   81:getstatic       #216 <Field String a>
	//   39   84:ldc1            #240 <String "Cannot log a button click because the AppboyManager is null.">
	//   40   86:invokestatic    #243 <Method int AppboyLogger.e(String, String)>
	//   41   89:pop             
			return false;
	//   42   90:iconst_0        
	//   43   91:ireturn         
		}
		try
		{
			ci ci1 = ci.a(b, c, d, messagebutton);
	//   44   92:aload_0         
	//   45   93:getfield        #203 <Field String b>
	//   46   96:aload_0         
	//   47   97:getfield        #211 <Field String c>
	//   48  100:aload_0         
	//   49  101:getfield        #214 <Field String d>
	//   50  104:aload_1         
	//   51  105:invokestatic    #248 <Method ci ci.a(String, String, String, MessageButton)>
	//   52  108:astore_2        
			r = ci.a(messagebutton);
	//   53  109:aload_0         
	//   54  110:aload_1         
	//   55  111:invokestatic    #251 <Method String ci.a(MessageButton)>
	//   56  114:putfield        #49  <Field String r>
			i.a(((bo.app.cc) (ci1)));
	//   57  117:aload_0         
	//   58  118:getfield        #238 <Field bt i>
	//   59  121:aload_2         
	//   60  122:invokeinterface #256 <Method boolean bt.a(bo.app.cc)>
	//   61  127:pop             
			q = true;
	//   62  128:aload_0         
	//   63  129:iconst_1        
	//   64  130:putfield        #230 <Field boolean q>
		}
	//*  65  133:iconst_1        
	//*  66  134:ireturn         
		// Misplaced declaration of an exception variable
		catch(MessageButton messagebutton)
	//*  67  135:astore_1        
		{
			i.a(((Throwable) (messagebutton)));
	//   68  136:aload_0         
	//   69  137:getfield        #238 <Field bt i>
	//   70  140:aload_1         
	//   71  141:invokeinterface #259 <Method void bt.a(Throwable)>
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
	//    1    1:invokespecial   #262 <Method void InAppMessageBase.onAfterClosed()>
		if(q && !StringUtils.isNullOrBlank(d) && !StringUtils.isNullOrBlank(r))
	//*   2    4:aload_0         
	//*   3    5:getfield        #230 <Field boolean q>
	//*   4    8:ifeq            55
	//*   5   11:aload_0         
	//*   6   12:getfield        #214 <Field String d>
	//*   7   15:invokestatic    #208 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   8   18:ifne            55
	//*   9   21:aload_0         
	//*  10   22:getfield        #49  <Field String r>
	//*  11   25:invokestatic    #208 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  12   28:ifne            55
			i.a(((bo.app.fr) (new ft(d, r))));
	//   13   31:aload_0         
	//   14   32:getfield        #238 <Field bt i>
	//   15   35:new             #264 <Class ft>
	//   16   38:dup             
	//   17   39:aload_0         
	//   18   40:getfield        #214 <Field String d>
	//   19   43:aload_0         
	//   20   44:getfield        #49  <Field String r>
	//   21   47:invokespecial   #267 <Method void ft(String, String)>
	//   22   50:invokeinterface #270 <Method void bt.a(bo.app.fr)>
	//   23   55:return          
	}

	public void setCloseButtonColor(int i)
	{
		m = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #31  <Field int m>
	//    3    5:return          
	}

	public void setFrameColor(Integer integer)
	{
		o = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field Integer o>
	//    3    5:return          
	}

	public void setHeader(String s)
	{
		k = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #120 <Field String k>
	//    3    5:return          
	}

	public void setHeaderTextAlign(TextAlign textalign)
	{
		p = textalign;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field TextAlign p>
	//    3    5:return          
	}

	public void setHeaderTextColor(int i)
	{
		l = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #29  <Field int l>
	//    3    5:return          
	}

	public void setImageStyle(ImageStyle imagestyle)
	{
		j = imagestyle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field ImageStyle j>
	//    3    5:return          
	}

	public void setMessageButtons(List list)
	{
		n = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #165 <Field List n>
	//    3    5:return          
	}

	protected ImageStyle j;
	private String k;
	private int l;
	private int m;
	private List n;
	private Integer o;
	private TextAlign p;
	private boolean q;
	private String r;
}
