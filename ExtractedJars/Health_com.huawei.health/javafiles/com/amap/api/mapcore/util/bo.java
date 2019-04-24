// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import java.io.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amap.api.mapcore.util:
//			br, fd, hm

public class bo extends br
{

	public bo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void br()>
		n = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #19  <String "">
	//    4    7:putfield        #21  <Field String n>
	//    5   10:return          
	}

	public bo(OfflineMapCity offlinemapcity, Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void br()>
		n = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #19  <String "">
	//    4    7:putfield        #21  <Field String n>
		o = context;
	//    5   10:aload_0         
	//    6   11:aload_2         
	//    7   12:putfield        #25  <Field Context o>
		a = offlinemapcity.getCity();
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #31  <Method String OfflineMapCity.getCity()>
	//   11   20:putfield        #33  <Field String a>
		c = offlinemapcity.getAdcode();
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:invokevirtual   #36  <Method String OfflineMapCity.getAdcode()>
	//   15   28:putfield        #39  <Field String c>
		b = offlinemapcity.getUrl();
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:invokevirtual   #42  <Method String OfflineMapCity.getUrl()>
	//   19   36:putfield        #44  <Field String b>
		g = offlinemapcity.getSize();
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:invokevirtual   #48  <Method long OfflineMapCity.getSize()>
	//   23   44:putfield        #52  <Field long g>
		e = offlinemapcity.getVersion();
	//   24   47:aload_0         
	//   25   48:aload_1         
	//   26   49:invokevirtual   #55  <Method String OfflineMapCity.getVersion()>
	//   27   52:putfield        #58  <Field String e>
		k = offlinemapcity.getCode();
	//   28   55:aload_0         
	//   29   56:aload_1         
	//   30   57:invokevirtual   #61  <Method String OfflineMapCity.getCode()>
	//   31   60:putfield        #64  <Field String k>
		i = 0;
	//   32   63:aload_0         
	//   33   64:iconst_0        
	//   34   65:putfield        #68  <Field int i>
		l = offlinemapcity.getState();
	//   35   68:aload_0         
	//   36   69:aload_1         
	//   37   70:invokevirtual   #72  <Method int OfflineMapCity.getState()>
	//   38   73:putfield        #75  <Field int l>
		j = offlinemapcity.getcompleteCode();
	//   39   76:aload_0         
	//   40   77:aload_1         
	//   41   78:invokevirtual   #78  <Method int OfflineMapCity.getcompleteCode()>
	//   42   81:putfield        #81  <Field int j>
		m = offlinemapcity.getPinyin();
	//   43   84:aload_0         
	//   44   85:aload_1         
	//   45   86:invokevirtual   #84  <Method String OfflineMapCity.getPinyin()>
	//   46   89:putfield        #87  <Field String m>
		a();
	//   47   92:aload_0         
	//   48   93:invokevirtual   #89  <Method void a()>
	//   49   96:return          
	}

	public bo(OfflineMapProvince offlinemapprovince, Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void br()>
		n = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #19  <String "">
	//    4    7:putfield        #21  <Field String n>
		o = context;
	//    5   10:aload_0         
	//    6   11:aload_2         
	//    7   12:putfield        #25  <Field Context o>
		a = offlinemapprovince.getProvinceName();
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #95  <Method String OfflineMapProvince.getProvinceName()>
	//   11   20:putfield        #33  <Field String a>
		c = offlinemapprovince.getProvinceCode();
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:invokevirtual   #98  <Method String OfflineMapProvince.getProvinceCode()>
	//   15   28:putfield        #39  <Field String c>
		b = offlinemapprovince.getUrl();
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:invokevirtual   #99  <Method String OfflineMapProvince.getUrl()>
	//   19   36:putfield        #44  <Field String b>
		g = offlinemapprovince.getSize();
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:invokevirtual   #100 <Method long OfflineMapProvince.getSize()>
	//   23   44:putfield        #52  <Field long g>
		e = offlinemapprovince.getVersion();
	//   24   47:aload_0         
	//   25   48:aload_1         
	//   26   49:invokevirtual   #101 <Method String OfflineMapProvince.getVersion()>
	//   27   52:putfield        #58  <Field String e>
		i = 1;
	//   28   55:aload_0         
	//   29   56:iconst_1        
	//   30   57:putfield        #68  <Field int i>
		l = offlinemapprovince.getState();
	//   31   60:aload_0         
	//   32   61:aload_1         
	//   33   62:invokevirtual   #102 <Method int OfflineMapProvince.getState()>
	//   34   65:putfield        #75  <Field int l>
		j = offlinemapprovince.getcompleteCode();
	//   35   68:aload_0         
	//   36   69:aload_1         
	//   37   70:invokevirtual   #103 <Method int OfflineMapProvince.getcompleteCode()>
	//   38   73:putfield        #81  <Field int j>
		m = offlinemapprovince.getPinyin();
	//   39   76:aload_0         
	//   40   77:aload_1         
	//   41   78:invokevirtual   #104 <Method String OfflineMapProvince.getPinyin()>
	//   42   81:putfield        #87  <Field String m>
		a();
	//   43   84:aload_0         
	//   44   85:invokevirtual   #89  <Method void a()>
	//   45   88:return          
	}

	public static String a(JSONObject jsonobject, String s)
		throws JSONException
	{
		if(jsonobject == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "";
	//    2    4:ldc1            #19  <String "">
	//    3    6:areturn         
		String s2 = "";
	//    4    7:ldc1            #19  <String "">
	//    5    9:astore_3        
		String s1 = s2;
	//    6   10:aload_3         
	//    7   11:astore_2        
		if(jsonobject.has(s))
	//*   8   12:aload_0         
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #113 <Method boolean JSONObject.has(String)>
	//*  11   17:ifeq            44
		{
			s1 = s2;
	//   12   20:aload_3         
	//   13   21:astore_2        
			if(!"[]".equals(((Object) (jsonobject.getString(s)))))
	//*  14   22:ldc1            #115 <String "[]">
	//*  15   24:aload_0         
	//*  16   25:aload_1         
	//*  17   26:invokevirtual   #119 <Method String JSONObject.getString(String)>
	//*  18   29:invokevirtual   #125 <Method boolean String.equals(Object)>
	//*  19   32:ifne            44
				s1 = jsonobject.optString(s).trim();
	//   20   35:aload_0         
	//   21   36:aload_1         
	//   22   37:invokevirtual   #128 <Method String JSONObject.optString(String)>
	//   23   40:invokevirtual   #131 <Method String String.trim()>
	//   24   43:astore_2        
		}
		return s1;
	//   25   44:aload_2         
	//   26   45:areturn         
	}

	protected void a()
	{
		String s = fd.c(o);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Context o>
	//    2    4:invokestatic    #137 <Method String fd.c(Context)>
	//    3    7:astore_1        
		d = (new StringBuilder()).append(s).append(m).append(".zip").append(".tmp").toString();
	//    4    8:aload_0         
	//    5    9:new             #139 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #140 <Method void StringBuilder()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:aload_0         
	//   11   21:getfield        #87  <Field String m>
	//   12   24:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:ldc1            #146 <String ".zip">
	//   14   29:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   15   32:ldc1            #148 <String ".tmp">
	//   16   34:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   18   40:putfield        #154 <Field String d>
	//   19   43:return          
	}

	public void a(String s)
	{
		n = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field String n>
	//    3    5:return          
	}

	public String b()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String n>
	//    2    4:areturn         
	}

	public void b(String s)
	{
		if(s == null)
			break MISSING_BLOCK_LABEL_15;
	//    0    0:aload_1         
	//    1    1:ifnull          15
		boolean flag = "".equals(((Object) (s)));
	//    2    4:ldc1            #19  <String "">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #125 <Method boolean String.equals(Object)>
	//    5   10:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_16;
	//    6   11:iload_2         
	//    7   12:ifeq            16
		return;
	//    8   15:return          
		s = ((String) ((new JSONObject(s)).getJSONObject("file")));
	//    9   16:new             #109 <Class JSONObject>
	//   10   19:dup             
	//   11   20:aload_1         
	//   12   21:invokespecial   #159 <Method void JSONObject(String)>
	//   13   24:ldc1            #161 <String "file">
	//   14   26:invokevirtual   #165 <Method JSONObject JSONObject.getJSONObject(String)>
	//   15   29:astore_1        
		if(s == null)
	//*  16   30:aload_1         
	//*  17   31:ifnonnull       35
			return;
	//   18   34:return          
		try
		{
			a = ((JSONObject) (s)).optString("title");
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:ldc1            #167 <String "title">
	//   22   39:invokevirtual   #128 <Method String JSONObject.optString(String)>
	//   23   42:putfield        #33  <Field String a>
			c = ((JSONObject) (s)).optString("code");
	//   24   45:aload_0         
	//   25   46:aload_1         
	//   26   47:ldc1            #169 <String "code">
	//   27   49:invokevirtual   #128 <Method String JSONObject.optString(String)>
	//   28   52:putfield        #39  <Field String c>
			b = ((JSONObject) (s)).optString("url");
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:ldc1            #171 <String "url">
	//   32   59:invokevirtual   #128 <Method String JSONObject.optString(String)>
	//   33   62:putfield        #44  <Field String b>
			d = ((JSONObject) (s)).optString("fileName");
	//   34   65:aload_0         
	//   35   66:aload_1         
	//   36   67:ldc1            #173 <String "fileName">
	//   37   69:invokevirtual   #128 <Method String JSONObject.optString(String)>
	//   38   72:putfield        #154 <Field String d>
			f = ((JSONObject) (s)).optLong("lLocalLength");
	//   39   75:aload_0         
	//   40   76:aload_1         
	//   41   77:ldc1            #175 <String "lLocalLength">
	//   42   79:invokevirtual   #179 <Method long JSONObject.optLong(String)>
	//   43   82:putfield        #182 <Field long f>
			g = ((JSONObject) (s)).optLong("lRemoteLength");
	//   44   85:aload_0         
	//   45   86:aload_1         
	//   46   87:ldc1            #184 <String "lRemoteLength">
	//   47   89:invokevirtual   #179 <Method long JSONObject.optLong(String)>
	//   48   92:putfield        #52  <Field long g>
			l = ((JSONObject) (s)).optInt("mState");
	//   49   95:aload_0         
	//   50   96:aload_1         
	//   51   97:ldc1            #186 <String "mState">
	//   52   99:invokevirtual   #190 <Method int JSONObject.optInt(String)>
	//   53  102:putfield        #75  <Field int l>
			e = ((JSONObject) (s)).optString("version");
	//   54  105:aload_0         
	//   55  106:aload_1         
	//   56  107:ldc1            #192 <String "version">
	//   57  109:invokevirtual   #128 <Method String JSONObject.optString(String)>
	//   58  112:putfield        #58  <Field String e>
			h = ((JSONObject) (s)).optString("localPath");
	//   59  115:aload_0         
	//   60  116:aload_1         
	//   61  117:ldc1            #194 <String "localPath">
	//   62  119:invokevirtual   #128 <Method String JSONObject.optString(String)>
	//   63  122:putfield        #197 <Field String h>
			n = ((JSONObject) (s)).optString("vMapFileNames");
	//   64  125:aload_0         
	//   65  126:aload_1         
	//   66  127:ldc1            #199 <String "vMapFileNames">
	//   67  129:invokevirtual   #128 <Method String JSONObject.optString(String)>
	//   68  132:putfield        #21  <Field String n>
			i = ((JSONObject) (s)).optInt("isSheng");
	//   69  135:aload_0         
	//   70  136:aload_1         
	//   71  137:ldc1            #201 <String "isSheng">
	//   72  139:invokevirtual   #190 <Method int JSONObject.optInt(String)>
	//   73  142:putfield        #68  <Field int i>
			j = ((JSONObject) (s)).optInt("mCompleteCode");
	//   74  145:aload_0         
	//   75  146:aload_1         
	//   76  147:ldc1            #203 <String "mCompleteCode">
	//   77  149:invokevirtual   #190 <Method int JSONObject.optInt(String)>
	//   78  152:putfield        #81  <Field int j>
			k = ((JSONObject) (s)).optString("mCityCode");
	//   79  155:aload_0         
	//   80  156:aload_1         
	//   81  157:ldc1            #205 <String "mCityCode">
	//   82  159:invokevirtual   #128 <Method String JSONObject.optString(String)>
	//   83  162:putfield        #64  <Field String k>
			m = a(((JSONObject) (s)), "pinyin");
	//   84  165:aload_0         
	//   85  166:aload_1         
	//   86  167:ldc1            #207 <String "pinyin">
	//   87  169:invokestatic    #209 <Method String a(JSONObject, String)>
	//   88  172:putfield        #87  <Field String m>
			if("".equals(((Object) (m))))
	//*  89  175:ldc1            #19  <String "">
	//*  90  177:aload_0         
	//*  91  178:getfield        #87  <Field String m>
	//*  92  181:invokevirtual   #125 <Method boolean String.equals(Object)>
	//*  93  184:ifeq            221
			{
				s = b.substring(b.lastIndexOf("/") + 1);
	//   94  187:aload_0         
	//   95  188:getfield        #44  <Field String b>
	//   96  191:aload_0         
	//   97  192:getfield        #44  <Field String b>
	//   98  195:ldc1            #211 <String "/">
	//   99  197:invokevirtual   #214 <Method int String.lastIndexOf(String)>
	//  100  200:iconst_1        
	//  101  201:iadd            
	//  102  202:invokevirtual   #218 <Method String String.substring(int)>
	//  103  205:astore_1        
				m = s.substring(0, s.lastIndexOf("."));
	//  104  206:aload_0         
	//  105  207:aload_1         
	//  106  208:iconst_0        
	//  107  209:aload_1         
	//  108  210:ldc1            #220 <String ".">
	//  109  212:invokevirtual   #214 <Method int String.lastIndexOf(String)>
	//  110  215:invokevirtual   #223 <Method String String.substring(int, int)>
	//  111  218:putfield        #87  <Field String m>
			}
			return;
	//  112  221:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 113  222:astore_1        
		{
			hm.c(((Throwable) (s)), "UpdateItem", "readFileToJSONObject");
	//  114  223:aload_1         
	//  115  224:ldc1            #225 <String "UpdateItem">
	//  116  226:ldc1            #227 <String "readFileToJSONObject">
	//  117  228:invokestatic    #232 <Method void hm.c(Throwable, String, String)>
		}
		((Throwable) (s)).printStackTrace();
	//  118  231:aload_1         
	//  119  232:invokevirtual   #235 <Method void Throwable.printStackTrace()>
		return;
	//  120  235:return          
	}

	public void c()
	{
		JSONObject jsonobject1 = new JSONObject();
	//    0    0:new             #109 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #238 <Method void JSONObject()>
	//    3    7:astore          4
		Object obj;
		Object obj1;
		Object obj2;
		IOException ioexception;
		Object obj3;
		IOException ioexception1;
		try
		{
			JSONObject jsonobject = new JSONObject();
	//    4    9:new             #109 <Class JSONObject>
	//    5   12:dup             
	//    6   13:invokespecial   #238 <Method void JSONObject()>
	//    7   16:astore_1        
			jsonobject.put("title", ((Object) (a)));
	//    8   17:aload_1         
	//    9   18:ldc1            #167 <String "title">
	//   10   20:aload_0         
	//   11   21:getfield        #33  <Field String a>
	//   12   24:invokevirtual   #242 <Method JSONObject JSONObject.put(String, Object)>
	//   13   27:pop             
			jsonobject.put("code", ((Object) (c)));
	//   14   28:aload_1         
	//   15   29:ldc1            #169 <String "code">
	//   16   31:aload_0         
	//   17   32:getfield        #39  <Field String c>
	//   18   35:invokevirtual   #242 <Method JSONObject JSONObject.put(String, Object)>
	//   19   38:pop             
			jsonobject.put("url", ((Object) (b)));
	//   20   39:aload_1         
	//   21   40:ldc1            #171 <String "url">
	//   22   42:aload_0         
	//   23   43:getfield        #44  <Field String b>
	//   24   46:invokevirtual   #242 <Method JSONObject JSONObject.put(String, Object)>
	//   25   49:pop             
			jsonobject.put("fileName", ((Object) (d)));
	//   26   50:aload_1         
	//   27   51:ldc1            #173 <String "fileName">
	//   28   53:aload_0         
	//   29   54:getfield        #154 <Field String d>
	//   30   57:invokevirtual   #242 <Method JSONObject JSONObject.put(String, Object)>
	//   31   60:pop             
			jsonobject.put("lLocalLength", f);
	//   32   61:aload_1         
	//   33   62:ldc1            #175 <String "lLocalLength">
	//   34   64:aload_0         
	//   35   65:getfield        #182 <Field long f>
	//   36   68:invokevirtual   #245 <Method JSONObject JSONObject.put(String, long)>
	//   37   71:pop             
			jsonobject.put("lRemoteLength", g);
	//   38   72:aload_1         
	//   39   73:ldc1            #184 <String "lRemoteLength">
	//   40   75:aload_0         
	//   41   76:getfield        #52  <Field long g>
	//   42   79:invokevirtual   #245 <Method JSONObject JSONObject.put(String, long)>
	//   43   82:pop             
			jsonobject.put("mState", l);
	//   44   83:aload_1         
	//   45   84:ldc1            #186 <String "mState">
	//   46   86:aload_0         
	//   47   87:getfield        #75  <Field int l>
	//   48   90:invokevirtual   #248 <Method JSONObject JSONObject.put(String, int)>
	//   49   93:pop             
			jsonobject.put("version", ((Object) (e)));
	//   50   94:aload_1         
	//   51   95:ldc1            #192 <String "version">
	//   52   97:aload_0         
	//   53   98:getfield        #58  <Field String e>
	//   54  101:invokevirtual   #242 <Method JSONObject JSONObject.put(String, Object)>
	//   55  104:pop             
			jsonobject.put("localPath", ((Object) (h)));
	//   56  105:aload_1         
	//   57  106:ldc1            #194 <String "localPath">
	//   58  108:aload_0         
	//   59  109:getfield        #197 <Field String h>
	//   60  112:invokevirtual   #242 <Method JSONObject JSONObject.put(String, Object)>
	//   61  115:pop             
			if(n != null)
	//*  62  116:aload_0         
	//*  63  117:getfield        #21  <Field String n>
	//*  64  120:ifnull          134
				jsonobject.put("vMapFileNames", ((Object) (n)));
	//   65  123:aload_1         
	//   66  124:ldc1            #199 <String "vMapFileNames">
	//   67  126:aload_0         
	//   68  127:getfield        #21  <Field String n>
	//   69  130:invokevirtual   #242 <Method JSONObject JSONObject.put(String, Object)>
	//   70  133:pop             
			jsonobject.put("isSheng", i);
	//   71  134:aload_1         
	//   72  135:ldc1            #201 <String "isSheng">
	//   73  137:aload_0         
	//   74  138:getfield        #68  <Field int i>
	//   75  141:invokevirtual   #248 <Method JSONObject JSONObject.put(String, int)>
	//   76  144:pop             
			jsonobject.put("mCompleteCode", j);
	//   77  145:aload_1         
	//   78  146:ldc1            #203 <String "mCompleteCode">
	//   79  148:aload_0         
	//   80  149:getfield        #81  <Field int j>
	//   81  152:invokevirtual   #248 <Method JSONObject JSONObject.put(String, int)>
	//   82  155:pop             
			jsonobject.put("mCityCode", ((Object) (k)));
	//   83  156:aload_1         
	//   84  157:ldc1            #205 <String "mCityCode">
	//   85  159:aload_0         
	//   86  160:getfield        #64  <Field String k>
	//   87  163:invokevirtual   #242 <Method JSONObject JSONObject.put(String, Object)>
	//   88  166:pop             
			jsonobject.put("pinyin", ((Object) (m)));
	//   89  167:aload_1         
	//   90  168:ldc1            #207 <String "pinyin">
	//   91  170:aload_0         
	//   92  171:getfield        #87  <Field String m>
	//   93  174:invokevirtual   #242 <Method JSONObject JSONObject.put(String, Object)>
	//   94  177:pop             
			jsonobject1.put("file", ((Object) (jsonobject)));
	//   95  178:aload           4
	//   96  180:ldc1            #161 <String "file">
	//   97  182:aload_1         
	//   98  183:invokevirtual   #242 <Method JSONObject JSONObject.put(String, Object)>
	//   99  186:pop             
			obj3 = ((Object) (new File((new StringBuilder()).append(d).append(".dt").toString())));
	//  100  187:new             #250 <Class File>
	//  101  190:dup             
	//  102  191:new             #139 <Class StringBuilder>
	//  103  194:dup             
	//  104  195:invokespecial   #140 <Method void StringBuilder()>
	//  105  198:aload_0         
	//  106  199:getfield        #154 <Field String d>
	//  107  202:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  108  205:ldc1            #252 <String ".dt">
	//  109  207:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  110  210:invokevirtual   #151 <Method String StringBuilder.toString()>
	//  111  213:invokespecial   #253 <Method void File(String)>
	//  112  216:astore_3        
			((File) (obj3)).delete();
	//  113  217:aload_3         
	//  114  218:invokevirtual   #257 <Method boolean File.delete()>
	//  115  221:pop             
		}
	//* 116  222:aconst_null     
	//* 117  223:astore_2        
	//* 118  224:aconst_null     
	//* 119  225:astore_1        
	//* 120  226:new             #259 <Class OutputStreamWriter>
	//* 121  229:dup             
	//* 122  230:new             #261 <Class FileOutputStream>
	//* 123  233:dup             
	//* 124  234:aload_3         
	//* 125  235:iconst_1        
	//* 126  236:invokespecial   #264 <Method void FileOutputStream(File, boolean)>
	//* 127  239:ldc2            #266 <String "utf-8">
	//* 128  242:invokespecial   #269 <Method void OutputStreamWriter(java.io.OutputStream, String)>
	//* 129  245:astore_3        
	//* 130  246:aload_3         
	//* 131  247:astore_1        
	//* 132  248:aload_3         
	//* 133  249:astore_2        
	//* 134  250:aload_3         
	//* 135  251:aload           4
	//* 136  253:invokevirtual   #270 <Method String JSONObject.toString()>
	//* 137  256:invokevirtual   #273 <Method void OutputStreamWriter.write(String)>
	//* 138  259:aload_3         
	//* 139  260:ifnull          267
	//* 140  263:aload_3         
	//* 141  264:invokevirtual   #276 <Method void OutputStreamWriter.close()>
	//* 142  267:goto            334
	//* 143  270:astore_1        
	//* 144  271:aload_1         
	//* 145  272:invokevirtual   #277 <Method void IOException.printStackTrace()>
	//* 146  275:goto            334
	//* 147  278:astore_3        
	//* 148  279:aload_1         
	//* 149  280:astore_2        
	//* 150  281:aload_3         
	//* 151  282:ldc1            #225 <String "UpdateItem">
	//* 152  284:ldc2            #279 <String "saveJSONObjectToFile">
	//* 153  287:invokestatic    #232 <Method void hm.c(Throwable, String, String)>
	//* 154  290:aload_1         
	//* 155  291:astore_2        
	//* 156  292:aload_3         
	//* 157  293:invokevirtual   #277 <Method void IOException.printStackTrace()>
	//* 158  296:aload_1         
	//* 159  297:ifnull          304
	//* 160  300:aload_1         
	//* 161  301:invokevirtual   #276 <Method void OutputStreamWriter.close()>
	//* 162  304:goto            334
	//* 163  307:astore_1        
	//* 164  308:aload_1         
	//* 165  309:invokevirtual   #277 <Method void IOException.printStackTrace()>
	//* 166  312:goto            334
	//* 167  315:astore_1        
	//* 168  316:aload_2         
	//* 169  317:ifnull          324
	//* 170  320:aload_2         
	//* 171  321:invokevirtual   #276 <Method void OutputStreamWriter.close()>
	//* 172  324:goto            332
	//* 173  327:astore_2        
	//* 174  328:aload_2         
	//* 175  329:invokevirtual   #277 <Method void IOException.printStackTrace()>
	//* 176  332:aload_1         
	//* 177  333:athrow          
	//* 178  334:return          
		catch(Throwable throwable)
	//* 179  335:astore_1        
		{
			hm.c(throwable, "UpdateItem", "saveJSONObjectToFile parseJson");
	//  180  336:aload_1         
	//  181  337:ldc1            #225 <String "UpdateItem">
	//  182  339:ldc2            #281 <String "saveJSONObjectToFile parseJson">
	//  183  342:invokestatic    #232 <Method void hm.c(Throwable, String, String)>
			throwable.printStackTrace();
	//  184  345:aload_1         
	//  185  346:invokevirtual   #235 <Method void Throwable.printStackTrace()>
			return;
	//  186  349:return          
		}
		obj2 = null;
		obj = null;
		obj3 = ((Object) (new OutputStreamWriter(((java.io.OutputStream) (new FileOutputStream(((File) (obj3)), true))), "utf-8")));
		obj = obj3;
		obj2 = obj3;
		((OutputStreamWriter) (obj3)).write(jsonobject1.toString());
		if(obj3 == null)
			break MISSING_BLOCK_LABEL_334;
		((OutputStreamWriter) (obj3)).close();
		break MISSING_BLOCK_LABEL_334;
		obj;
		((IOException) (obj)).printStackTrace();
		break MISSING_BLOCK_LABEL_334;
		ioexception1;
		obj2 = obj;
		hm.c(((Throwable) (ioexception1)), "UpdateItem", "saveJSONObjectToFile");
		obj2 = obj;
		ioexception1.printStackTrace();
		if(obj == null)
			break MISSING_BLOCK_LABEL_334;
		((OutputStreamWriter) (obj)).close();
		break MISSING_BLOCK_LABEL_334;
		obj1;
		((IOException) (obj1)).printStackTrace();
		break MISSING_BLOCK_LABEL_334;
		obj1;
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_332;
		((OutputStreamWriter) (obj2)).close();
		break MISSING_BLOCK_LABEL_332;
		ioexception;
		ioexception.printStackTrace();
		throw obj1;
	}

	private String n;
	private Context o;
}
