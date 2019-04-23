// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.cast.aj;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//			p, VastAdsRequest

public class AdBreakClipInfo extends AbstractSafeParcelable
{

	AdBreakClipInfo(String s, String s1, long l1, String s2, String s3, String s4, 
			String s5, String s6, String s7, long l2, String s8, VastAdsRequest vastadsrequest)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void AbstractSafeParcelable()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field String a>
		b = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #41  <Field String b>
		c = l1;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #43  <Field long c>
		d = s2;
	//   11   19:aload_0         
	//   12   20:aload           5
	//   13   22:putfield        #45  <Field String d>
		e = s3;
	//   14   25:aload_0         
	//   15   26:aload           6
	//   16   28:putfield        #47  <Field String e>
		f = s4;
	//   17   31:aload_0         
	//   18   32:aload           7
	//   19   34:putfield        #49  <Field String f>
		g = s5;
	//   20   37:aload_0         
	//   21   38:aload           8
	//   22   40:putfield        #51  <Field String g>
		h = s6;
	//   23   43:aload_0         
	//   24   44:aload           9
	//   25   46:putfield        #53  <Field String h>
		i = s7;
	//   26   49:aload_0         
	//   27   50:aload           10
	//   28   52:putfield        #55  <Field String i>
		j = l2;
	//   29   55:aload_0         
	//   30   56:lload           11
	//   31   58:putfield        #57  <Field long j>
		k = s8;
	//   32   61:aload_0         
	//   33   62:aload           13
	//   34   64:putfield        #59  <Field String k>
		l = vastadsrequest;
	//   35   67:aload_0         
	//   36   68:aload           14
	//   37   70:putfield        #61  <Field VastAdsRequest l>
		if(!TextUtils.isEmpty(((CharSequence) (g))))
	//*  38   73:aload_0         
	//*  39   74:getfield        #51  <Field String g>
	//*  40   77:invokestatic    #67  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  41   80:ifne            140
		{
			try
			{
				m = new JSONObject(s5);
	//   42   83:aload_0         
	//   43   84:new             #69  <Class JSONObject>
	//   44   87:dup             
	//   45   88:aload           8
	//   46   90:invokespecial   #72  <Method void JSONObject(String)>
	//   47   93:putfield        #74  <Field JSONObject m>
				return;
	//   48   96:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  49   97:astore_1        
			{
				Log.w("AdBreakClipInfo", String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", new Object[] {
					((JSONException) (s)).getMessage()
				}));
	//   50   98:ldc1            #76  <String "AdBreakClipInfo">
	//   51  100:getstatic       #82  <Field Locale Locale.ROOT>
	//   52  103:ldc1            #84  <String "Error creating AdBreakClipInfo: %s">
	//   53  105:iconst_1        
	//   54  106:anewarray       Object[]
	//   55  109:dup             
	//   56  110:iconst_0        
	//   57  111:aload_1         
	//   58  112:invokevirtual   #90  <Method String JSONException.getMessage()>
	//   59  115:aastore         
	//   60  116:invokestatic    #96  <Method String String.format(Locale, String, Object[])>
	//   61  119:invokestatic    #102 <Method int Log.w(String, String)>
	//   62  122:pop             
			}
			g = null;
	//   63  123:aload_0         
	//   64  124:aconst_null     
	//   65  125:putfield        #51  <Field String g>
			m = new JSONObject();
	//   66  128:aload_0         
	//   67  129:new             #69  <Class JSONObject>
	//   68  132:dup             
	//   69  133:invokespecial   #103 <Method void JSONObject()>
	//   70  136:putfield        #74  <Field JSONObject m>
			return;
	//   71  139:return          
		} else
		{
			m = new JSONObject();
	//   72  140:aload_0         
	//   73  141:new             #69  <Class JSONObject>
	//   74  144:dup             
	//   75  145:invokespecial   #103 <Method void JSONObject()>
	//   76  148:putfield        #74  <Field JSONObject m>
			return;
	//   77  151:return          
		}
	}

	static AdBreakClipInfo a(JSONObject jsonobject)
	{
		if(jsonobject == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(!jsonobject.has("id"))
	//*   4    6:aload_0         
	//*   5    7:ldc1            #106 <String "id">
	//*   6    9:invokevirtual   #110 <Method boolean JSONObject.has(String)>
	//*   7   12:ifne            17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		double d1;
		int i1;
		long l1;
		long l2;
		String s;
		String s1;
		String s2;
		String s3;
		String s4;
		String s5;
		String s6;
		String s7;
		VastAdsRequest vastadsrequest;
		JSONObject jsonobject1;
		try
		{
			s1 = jsonobject.getString("id");
	//   10   17:aload_0         
	//   11   18:ldc1            #106 <String "id">
	//   12   20:invokevirtual   #114 <Method String JSONObject.getString(String)>
	//   13   23:astore          9
			l1 = jsonobject.optLong("duration");
	//   14   25:aload_0         
	//   15   26:ldc1            #116 <String "duration">
	//   16   28:invokevirtual   #120 <Method long JSONObject.optLong(String)>
	//   17   31:lstore          4
		}
	//*  18   33:lload           4
	//*  19   35:l2d             
	//*  20   36:dstore_1        
	//*  21   37:dload_1         
	//*  22   38:invokestatic    #126 <Method boolean Double.isNaN(double)>
	//*  23   41:pop             
	//*  24   42:dload_1         
	//*  25   43:ldc2w           #127 <Double 1000D>
	//*  26   46:dmul            
	//*  27   47:d2l             
	//*  28   48:lstore          6
	//*  29   50:aload_0         
	//*  30   51:ldc1            #130 <String "clickThroughUrl">
	//*  31   53:aconst_null     
	//*  32   54:invokevirtual   #134 <Method String JSONObject.optString(String, String)>
	//*  33   57:astore          10
	//*  34   59:aload_0         
	//*  35   60:ldc1            #136 <String "contentUrl">
	//*  36   62:aconst_null     
	//*  37   63:invokevirtual   #134 <Method String JSONObject.optString(String, String)>
	//*  38   66:astore          11
	//*  39   68:aload_0         
	//*  40   69:ldc1            #138 <String "mimeType">
	//*  41   71:aconst_null     
	//*  42   72:invokevirtual   #134 <Method String JSONObject.optString(String, String)>
	//*  43   75:astore          8
	//*  44   77:aload           8
	//*  45   79:ifnonnull       281
	//*  46   82:aload_0         
	//*  47   83:ldc1            #140 <String "contentType">
	//*  48   85:aconst_null     
	//*  49   86:invokevirtual   #134 <Method String JSONObject.optString(String, String)>
	//*  50   89:astore          8
	//*  51   91:goto            94
	//*  52   94:aload_0         
	//*  53   95:ldc1            #142 <String "title">
	//*  54   97:aconst_null     
	//*  55   98:invokevirtual   #134 <Method String JSONObject.optString(String, String)>
	//*  56  101:astore          12
	//*  57  103:aload_0         
	//*  58  104:ldc1            #144 <String "customData">
	//*  59  106:invokevirtual   #148 <Method JSONObject JSONObject.optJSONObject(String)>
	//*  60  109:astore          17
	//*  61  111:aload_0         
	//*  62  112:ldc1            #150 <String "contentId">
	//*  63  114:aconst_null     
	//*  64  115:invokevirtual   #134 <Method String JSONObject.optString(String, String)>
	//*  65  118:astore          13
	//*  66  120:aload_0         
	//*  67  121:ldc1            #152 <String "posterUrl">
	//*  68  123:aconst_null     
	//*  69  124:invokevirtual   #134 <Method String JSONObject.optString(String, String)>
	//*  70  127:astore          14
	//*  71  129:aload_0         
	//*  72  130:ldc1            #154 <String "whenSkippable">
	//*  73  132:invokevirtual   #110 <Method boolean JSONObject.has(String)>
	//*  74  135:ifeq            170
	//*  75  138:aload_0         
	//*  76  139:ldc1            #154 <String "whenSkippable">
	//*  77  141:invokevirtual   #158 <Method Object JSONObject.get(String)>
	//*  78  144:checkcast       #160 <Class Integer>
	//*  79  147:invokevirtual   #164 <Method int Integer.intValue()>
	//*  80  150:istore_3        
	//*  81  151:iload_3         
	//*  82  152:i2d             
	//*  83  153:dstore_1        
	//*  84  154:dload_1         
	//*  85  155:invokestatic    #126 <Method boolean Double.isNaN(double)>
	//*  86  158:pop             
	//*  87  159:dload_1         
	//*  88  160:ldc2w           #127 <Double 1000D>
	//*  89  163:dmul            
	//*  90  164:d2l             
	//*  91  165:lstore          4
	//*  92  167:goto            175
	//*  93  170:ldc2w           #165 <Long -1L>
	//*  94  173:lstore          4
	//*  95  175:aload_0         
	//*  96  176:ldc1            #168 <String "hlsSegmentFormat">
	//*  97  178:aconst_null     
	//*  98  179:invokevirtual   #134 <Method String JSONObject.optString(String, String)>
	//*  99  182:astore          15
	//* 100  184:aload_0         
	//* 101  185:ldc1            #170 <String "vastAdsRequest">
	//* 102  187:invokevirtual   #148 <Method JSONObject JSONObject.optJSONObject(String)>
	//* 103  190:invokestatic    #175 <Method VastAdsRequest VastAdsRequest.a(JSONObject)>
	//* 104  193:astore          16
	//* 105  195:aload           17
	//* 106  197:ifnull          284
	//* 107  200:aload           17
	//* 108  202:invokevirtual   #178 <Method int JSONObject.length()>
	//* 109  205:ifne            211
	//* 110  208:goto            284
	//* 111  211:aload           17
	//* 112  213:invokevirtual   #181 <Method String JSONObject.toString()>
	//* 113  216:astore_0        
	//* 114  217:goto            220
	//* 115  220:new             #2   <Class AdBreakClipInfo>
	//* 116  223:dup             
	//* 117  224:aload           9
	//* 118  226:aload           12
	//* 119  228:lload           6
	//* 120  230:aload           11
	//* 121  232:aload           8
	//* 122  234:aload           10
	//* 123  236:aload_0         
	//* 124  237:aload           13
	//* 125  239:aload           14
	//* 126  241:lload           4
	//* 127  243:aload           15
	//* 128  245:aload           16
	//* 129  247:invokespecial   #183 <Method void AdBreakClipInfo(String, String, long, String, String, String, String, String, String, long, String, VastAdsRequest)>
	//* 130  250:astore_0        
	//* 131  251:aload_0         
	//* 132  252:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//* 133  253:astore_0        
		{
			Log.d("AdBreakClipInfo", String.format(Locale.ROOT, "Error while creating an AdBreakClipInfo from JSON: %s", new Object[] {
				((JSONException) (jsonobject)).getMessage()
			}));
	//  134  254:ldc1            #76  <String "AdBreakClipInfo">
	//  135  256:getstatic       #82  <Field Locale Locale.ROOT>
	//  136  259:ldc1            #185 <String "Error while creating an AdBreakClipInfo from JSON: %s">
	//  137  261:iconst_1        
	//  138  262:anewarray       Object[]
	//  139  265:dup             
	//  140  266:iconst_0        
	//  141  267:aload_0         
	//  142  268:invokevirtual   #90  <Method String JSONException.getMessage()>
	//  143  271:aastore         
	//  144  272:invokestatic    #96  <Method String String.format(Locale, String, Object[])>
	//  145  275:invokestatic    #187 <Method int Log.d(String, String)>
	//  146  278:pop             
			return null;
	//  147  279:aconst_null     
	//  148  280:areturn         
		}
		d1 = l1;
		Double.isNaN(d1);
		l2 = (long)(d1 * 1000D);
		s2 = jsonobject.optString("clickThroughUrl", ((String) (null)));
		s3 = jsonobject.optString("contentUrl", ((String) (null)));
		s = jsonobject.optString("mimeType", ((String) (null)));
		if(s != null)
			break MISSING_BLOCK_LABEL_94;
		s = jsonobject.optString("contentType", ((String) (null)));
		s4 = jsonobject.optString("title", ((String) (null)));
		jsonobject1 = jsonobject.optJSONObject("customData");
		s5 = jsonobject.optString("contentId", ((String) (null)));
		s6 = jsonobject.optString("posterUrl", ((String) (null)));
		if(!jsonobject.has("whenSkippable"))
			break MISSING_BLOCK_LABEL_170;
		i1 = ((Integer)jsonobject.get("whenSkippable")).intValue();
		d1 = i1;
		Double.isNaN(d1);
		l1 = (long)(d1 * 1000D);
		break MISSING_BLOCK_LABEL_175;
		l1 = -1L;
		s7 = jsonobject.optString("hlsSegmentFormat", ((String) (null)));
		vastadsrequest = VastAdsRequest.a(jsonobject.optJSONObject("vastAdsRequest"));
		if(jsonobject1 == null) goto _L2; else goto _L1
_L1:
		if(jsonobject1.length() != 0) goto _L3; else goto _L2
_L3:
		jsonobject = ((JSONObject) (jsonobject1.toString()));
_L5:
		jsonobject = ((JSONObject) (new AdBreakClipInfo(s1, s4, l2, s3, s, s2, ((String) (jsonobject)), s5, s6, l1, s7, vastadsrequest)));
		return ((AdBreakClipInfo) (jsonobject));
	//* 149  281:goto            94
_L2:
		jsonobject = null;
	//  150  284:aconst_null     
	//  151  285:astore_0        
		if(true) goto _L5; else goto _L4
	//  152  286:goto            220
_L4:
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String a>
	//    2    4:areturn         
	}

	public String b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String b>
	//    2    4:areturn         
	}

	public long c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field long c>
	//    2    4:lreturn         
	}

	public String d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String d>
	//    2    4:areturn         
	}

	public String e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String e>
	//    2    4:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof AdBreakClipInfo))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class AdBreakClipInfo>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((AdBreakClipInfo)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class AdBreakClipInfo>
	//   12   20:astore_1        
		return aj.a(((Object) (a)), ((Object) (((AdBreakClipInfo) (obj)).a))) && aj.a(((Object) (b)), ((Object) (((AdBreakClipInfo) (obj)).b))) && c == ((AdBreakClipInfo) (obj)).c && aj.a(((Object) (d)), ((Object) (((AdBreakClipInfo) (obj)).d))) && aj.a(((Object) (e)), ((Object) (((AdBreakClipInfo) (obj)).e))) && aj.a(((Object) (f)), ((Object) (((AdBreakClipInfo) (obj)).f))) && aj.a(((Object) (g)), ((Object) (((AdBreakClipInfo) (obj)).g))) && aj.a(((Object) (h)), ((Object) (((AdBreakClipInfo) (obj)).h))) && aj.a(((Object) (i)), ((Object) (((AdBreakClipInfo) (obj)).i))) && j == ((AdBreakClipInfo) (obj)).j && aj.a(((Object) (k)), ((Object) (((AdBreakClipInfo) (obj)).k))) && aj.a(((Object) (l)), ((Object) (((AdBreakClipInfo) (obj)).l)));
	//   13   21:aload_0         
	//   14   22:getfield        #39  <Field String a>
	//   15   25:aload_1         
	//   16   26:getfield        #39  <Field String a>
	//   17   29:invokestatic    #195 <Method boolean aj.a(Object, Object)>
	//   18   32:ifeq            187
	//   19   35:aload_0         
	//   20   36:getfield        #41  <Field String b>
	//   21   39:aload_1         
	//   22   40:getfield        #41  <Field String b>
	//   23   43:invokestatic    #195 <Method boolean aj.a(Object, Object)>
	//   24   46:ifeq            187
	//   25   49:aload_0         
	//   26   50:getfield        #43  <Field long c>
	//   27   53:aload_1         
	//   28   54:getfield        #43  <Field long c>
	//   29   57:lcmp            
	//   30   58:ifne            187
	//   31   61:aload_0         
	//   32   62:getfield        #45  <Field String d>
	//   33   65:aload_1         
	//   34   66:getfield        #45  <Field String d>
	//   35   69:invokestatic    #195 <Method boolean aj.a(Object, Object)>
	//   36   72:ifeq            187
	//   37   75:aload_0         
	//   38   76:getfield        #47  <Field String e>
	//   39   79:aload_1         
	//   40   80:getfield        #47  <Field String e>
	//   41   83:invokestatic    #195 <Method boolean aj.a(Object, Object)>
	//   42   86:ifeq            187
	//   43   89:aload_0         
	//   44   90:getfield        #49  <Field String f>
	//   45   93:aload_1         
	//   46   94:getfield        #49  <Field String f>
	//   47   97:invokestatic    #195 <Method boolean aj.a(Object, Object)>
	//   48  100:ifeq            187
	//   49  103:aload_0         
	//   50  104:getfield        #51  <Field String g>
	//   51  107:aload_1         
	//   52  108:getfield        #51  <Field String g>
	//   53  111:invokestatic    #195 <Method boolean aj.a(Object, Object)>
	//   54  114:ifeq            187
	//   55  117:aload_0         
	//   56  118:getfield        #53  <Field String h>
	//   57  121:aload_1         
	//   58  122:getfield        #53  <Field String h>
	//   59  125:invokestatic    #195 <Method boolean aj.a(Object, Object)>
	//   60  128:ifeq            187
	//   61  131:aload_0         
	//   62  132:getfield        #55  <Field String i>
	//   63  135:aload_1         
	//   64  136:getfield        #55  <Field String i>
	//   65  139:invokestatic    #195 <Method boolean aj.a(Object, Object)>
	//   66  142:ifeq            187
	//   67  145:aload_0         
	//   68  146:getfield        #57  <Field long j>
	//   69  149:aload_1         
	//   70  150:getfield        #57  <Field long j>
	//   71  153:lcmp            
	//   72  154:ifne            187
	//   73  157:aload_0         
	//   74  158:getfield        #59  <Field String k>
	//   75  161:aload_1         
	//   76  162:getfield        #59  <Field String k>
	//   77  165:invokestatic    #195 <Method boolean aj.a(Object, Object)>
	//   78  168:ifeq            187
	//   79  171:aload_0         
	//   80  172:getfield        #61  <Field VastAdsRequest l>
	//   81  175:aload_1         
	//   82  176:getfield        #61  <Field VastAdsRequest l>
	//   83  179:invokestatic    #195 <Method boolean aj.a(Object, Object)>
	//   84  182:ifeq            187
	//   85  185:iconst_1        
	//   86  186:ireturn         
	//   87  187:iconst_0        
	//   88  188:ireturn         
	}

	public String f()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String f>
	//    2    4:areturn         
	}

	public String g()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String h>
	//    2    4:areturn         
	}

	public String h()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field String i>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return ak.a(new Object[] {
			a, b, Long.valueOf(c), d, e, f, g, h, i, Long.valueOf(j), 
			k, l
		});
	//    0    0:bipush          12
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #39  <Field String a>
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:aload_0         
	//   10   15:getfield        #41  <Field String b>
	//   11   18:aastore         
	//   12   19:dup             
	//   13   20:iconst_2        
	//   14   21:aload_0         
	//   15   22:getfield        #43  <Field long c>
	//   16   25:invokestatic    #202 <Method Long Long.valueOf(long)>
	//   17   28:aastore         
	//   18   29:dup             
	//   19   30:iconst_3        
	//   20   31:aload_0         
	//   21   32:getfield        #45  <Field String d>
	//   22   35:aastore         
	//   23   36:dup             
	//   24   37:iconst_4        
	//   25   38:aload_0         
	//   26   39:getfield        #47  <Field String e>
	//   27   42:aastore         
	//   28   43:dup             
	//   29   44:iconst_5        
	//   30   45:aload_0         
	//   31   46:getfield        #49  <Field String f>
	//   32   49:aastore         
	//   33   50:dup             
	//   34   51:bipush          6
	//   35   53:aload_0         
	//   36   54:getfield        #51  <Field String g>
	//   37   57:aastore         
	//   38   58:dup             
	//   39   59:bipush          7
	//   40   61:aload_0         
	//   41   62:getfield        #53  <Field String h>
	//   42   65:aastore         
	//   43   66:dup             
	//   44   67:bipush          8
	//   45   69:aload_0         
	//   46   70:getfield        #55  <Field String i>
	//   47   73:aastore         
	//   48   74:dup             
	//   49   75:bipush          9
	//   50   77:aload_0         
	//   51   78:getfield        #57  <Field long j>
	//   52   81:invokestatic    #202 <Method Long Long.valueOf(long)>
	//   53   84:aastore         
	//   54   85:dup             
	//   55   86:bipush          10
	//   56   88:aload_0         
	//   57   89:getfield        #59  <Field String k>
	//   58   92:aastore         
	//   59   93:dup             
	//   60   94:bipush          11
	//   61   96:aload_0         
	//   62   97:getfield        #61  <Field VastAdsRequest l>
	//   63  100:aastore         
	//   64  101:invokestatic    #207 <Method int ak.a(Object[])>
	//   65  104:ireturn         
	}

	public long i()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field long j>
	//    2    4:lreturn         
	}

	public String j()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String k>
	//    2    4:areturn         
	}

	public VastAdsRequest k()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field VastAdsRequest l>
	//    2    4:areturn         
	}

	public final JSONObject l()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #69  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #103 <Method void JSONObject()>
	//    3    7:astore          5
		double d1;
		long l1;
		try
		{
			jsonobject.put("id", ((Object) (a)));
	//    4    9:aload           5
	//    5   11:ldc1            #106 <String "id">
	//    6   13:aload_0         
	//    7   14:getfield        #39  <Field String a>
	//    8   17:invokevirtual   #213 <Method JSONObject JSONObject.put(String, Object)>
	//    9   20:pop             
			l1 = c;
	//   10   21:aload_0         
	//   11   22:getfield        #43  <Field long c>
	//   12   25:lstore_3        
		}
	//*  13   26:lload_3         
	//*  14   27:l2d             
	//*  15   28:dstore_1        
	//*  16   29:dload_1         
	//*  17   30:invokestatic    #126 <Method boolean Double.isNaN(double)>
	//*  18   33:pop             
	//*  19   34:dload_1         
	//*  20   35:ldc2w           #127 <Double 1000D>
	//*  21   38:ddiv            
	//*  22   39:dstore_1        
	//*  23   40:aload           5
	//*  24   42:ldc1            #116 <String "duration">
	//*  25   44:dload_1         
	//*  26   45:invokevirtual   #216 <Method JSONObject JSONObject.put(String, double)>
	//*  27   48:pop             
	//*  28   49:aload_0         
	//*  29   50:getfield        #57  <Field long j>
	//*  30   53:ldc2w           #165 <Long -1L>
	//*  31   56:lcmp            
	//*  32   57:ifeq            88
	//*  33   60:aload_0         
	//*  34   61:getfield        #57  <Field long j>
	//*  35   64:lstore_3        
	//*  36   65:lload_3         
	//*  37   66:l2d             
	//*  38   67:dstore_1        
	//*  39   68:dload_1         
	//*  40   69:invokestatic    #126 <Method boolean Double.isNaN(double)>
	//*  41   72:pop             
	//*  42   73:dload_1         
	//*  43   74:ldc2w           #127 <Double 1000D>
	//*  44   77:ddiv            
	//*  45   78:dstore_1        
	//*  46   79:aload           5
	//*  47   81:ldc1            #154 <String "whenSkippable">
	//*  48   83:dload_1         
	//*  49   84:invokevirtual   #216 <Method JSONObject JSONObject.put(String, double)>
	//*  50   87:pop             
	//*  51   88:aload_0         
	//*  52   89:getfield        #53  <Field String h>
	//*  53   92:ifnull          107
	//*  54   95:aload           5
	//*  55   97:ldc1            #150 <String "contentId">
	//*  56   99:aload_0         
	//*  57  100:getfield        #53  <Field String h>
	//*  58  103:invokevirtual   #213 <Method JSONObject JSONObject.put(String, Object)>
	//*  59  106:pop             
	//*  60  107:aload_0         
	//*  61  108:getfield        #47  <Field String e>
	//*  62  111:ifnull          126
	//*  63  114:aload           5
	//*  64  116:ldc1            #140 <String "contentType">
	//*  65  118:aload_0         
	//*  66  119:getfield        #47  <Field String e>
	//*  67  122:invokevirtual   #213 <Method JSONObject JSONObject.put(String, Object)>
	//*  68  125:pop             
	//*  69  126:aload_0         
	//*  70  127:getfield        #41  <Field String b>
	//*  71  130:ifnull          145
	//*  72  133:aload           5
	//*  73  135:ldc1            #142 <String "title">
	//*  74  137:aload_0         
	//*  75  138:getfield        #41  <Field String b>
	//*  76  141:invokevirtual   #213 <Method JSONObject JSONObject.put(String, Object)>
	//*  77  144:pop             
	//*  78  145:aload_0         
	//*  79  146:getfield        #45  <Field String d>
	//*  80  149:ifnull          164
	//*  81  152:aload           5
	//*  82  154:ldc1            #136 <String "contentUrl">
	//*  83  156:aload_0         
	//*  84  157:getfield        #45  <Field String d>
	//*  85  160:invokevirtual   #213 <Method JSONObject JSONObject.put(String, Object)>
	//*  86  163:pop             
	//*  87  164:aload_0         
	//*  88  165:getfield        #49  <Field String f>
	//*  89  168:ifnull          183
	//*  90  171:aload           5
	//*  91  173:ldc1            #130 <String "clickThroughUrl">
	//*  92  175:aload_0         
	//*  93  176:getfield        #49  <Field String f>
	//*  94  179:invokevirtual   #213 <Method JSONObject JSONObject.put(String, Object)>
	//*  95  182:pop             
	//*  96  183:aload_0         
	//*  97  184:getfield        #74  <Field JSONObject m>
	//*  98  187:ifnull          202
	//*  99  190:aload           5
	//* 100  192:ldc1            #144 <String "customData">
	//* 101  194:aload_0         
	//* 102  195:getfield        #74  <Field JSONObject m>
	//* 103  198:invokevirtual   #213 <Method JSONObject JSONObject.put(String, Object)>
	//* 104  201:pop             
	//* 105  202:aload_0         
	//* 106  203:getfield        #55  <Field String i>
	//* 107  206:ifnull          221
	//* 108  209:aload           5
	//* 109  211:ldc1            #152 <String "posterUrl">
	//* 110  213:aload_0         
	//* 111  214:getfield        #55  <Field String i>
	//* 112  217:invokevirtual   #213 <Method JSONObject JSONObject.put(String, Object)>
	//* 113  220:pop             
	//* 114  221:aload_0         
	//* 115  222:getfield        #59  <Field String k>
	//* 116  225:ifnull          240
	//* 117  228:aload           5
	//* 118  230:ldc1            #168 <String "hlsSegmentFormat">
	//* 119  232:aload_0         
	//* 120  233:getfield        #59  <Field String k>
	//* 121  236:invokevirtual   #213 <Method JSONObject JSONObject.put(String, Object)>
	//* 122  239:pop             
	//* 123  240:aload_0         
	//* 124  241:getfield        #61  <Field VastAdsRequest l>
	//* 125  244:ifnull          262
	//* 126  247:aload           5
	//* 127  249:ldc1            #170 <String "vastAdsRequest">
	//* 128  251:aload_0         
	//* 129  252:getfield        #61  <Field VastAdsRequest l>
	//* 130  255:invokevirtual   #218 <Method JSONObject com.google.android.gms.cast.VastAdsRequest.c()>
	//* 131  258:invokevirtual   #213 <Method JSONObject JSONObject.put(String, Object)>
	//* 132  261:pop             
	//* 133  262:aload           5
	//* 134  264:areturn         
		catch(JSONException jsonexception)
	//* 135  265:astore          6
		{
			return jsonobject;
	//  136  267:aload           5
	//  137  269:areturn         
		}
		d1 = l1;
		Double.isNaN(d1);
		d1 /= 1000D;
		jsonobject.put("duration", d1);
		if(j == -1L)
			break MISSING_BLOCK_LABEL_88;
		l1 = j;
		d1 = l1;
		Double.isNaN(d1);
		d1 /= 1000D;
		jsonobject.put("whenSkippable", d1);
		if(h != null)
			jsonobject.put("contentId", ((Object) (h)));
		if(e != null)
			jsonobject.put("contentType", ((Object) (e)));
		if(b != null)
			jsonobject.put("title", ((Object) (b)));
		if(d != null)
			jsonobject.put("contentUrl", ((Object) (d)));
		if(f != null)
			jsonobject.put("clickThroughUrl", ((Object) (f)));
		if(m != null)
			jsonobject.put("customData", ((Object) (m)));
		if(i != null)
			jsonobject.put("posterUrl", ((Object) (i)));
		if(k != null)
			jsonobject.put("hlsSegmentFormat", ((Object) (k)));
		if(l != null)
			jsonobject.put("vastAdsRequest", ((Object) (l.c())));
		return jsonobject;
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		int j1 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #225 <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a(), false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #227 <Method String a()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #230 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b(), false);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:invokevirtual   #232 <Method String b()>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #230 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c());
	//   15   25:aload_1         
	//   16   26:iconst_4        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #234 <Method long c()>
	//   19   31:invokestatic    #237 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, d(), false);
	//   20   34:aload_1         
	//   21   35:iconst_5        
	//   22   36:aload_0         
	//   23   37:invokevirtual   #239 <Method String d()>
	//   24   40:iconst_0        
	//   25   41:invokestatic    #230 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, e(), false);
	//   26   44:aload_1         
	//   27   45:bipush          6
	//   28   47:aload_0         
	//   29   48:invokevirtual   #241 <Method String e()>
	//   30   51:iconst_0        
	//   31   52:invokestatic    #230 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, f(), false);
	//   32   55:aload_1         
	//   33   56:bipush          7
	//   34   58:aload_0         
	//   35   59:invokevirtual   #243 <Method String f()>
	//   36   62:iconst_0        
	//   37   63:invokestatic    #230 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, g, false);
	//   38   66:aload_1         
	//   39   67:bipush          8
	//   40   69:aload_0         
	//   41   70:getfield        #51  <Field String g>
	//   42   73:iconst_0        
	//   43   74:invokestatic    #230 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, g(), false);
	//   44   77:aload_1         
	//   45   78:bipush          9
	//   46   80:aload_0         
	//   47   81:invokevirtual   #245 <Method String g()>
	//   48   84:iconst_0        
	//   49   85:invokestatic    #230 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, h(), false);
	//   50   88:aload_1         
	//   51   89:bipush          10
	//   52   91:aload_0         
	//   53   92:invokevirtual   #247 <Method String h()>
	//   54   95:iconst_0        
	//   55   96:invokestatic    #230 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, i());
	//   56   99:aload_1         
	//   57  100:bipush          11
	//   58  102:aload_0         
	//   59  103:invokevirtual   #249 <Method long i()>
	//   60  106:invokestatic    #237 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, j(), false);
	//   61  109:aload_1         
	//   62  110:bipush          12
	//   63  112:aload_0         
	//   64  113:invokevirtual   #251 <Method String j()>
	//   65  116:iconst_0        
	//   66  117:invokestatic    #230 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 13, ((android.os.Parcelable) (k())), i1, false);
	//   67  120:aload_1         
	//   68  121:bipush          13
	//   69  123:aload_0         
	//   70  124:invokevirtual   #253 <Method VastAdsRequest k()>
	//   71  127:iload_2         
	//   72  128:iconst_0        
	//   73  129:invokestatic    #256 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j1);
	//   74  132:aload_1         
	//   75  133:iload_3         
	//   76  134:invokestatic    #258 <Method void c.a(Parcel, int)>
	//   77  137:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new p();
	private final String a;
	private final String b;
	private final long c;
	private final String d;
	private final String e;
	private final String f;
	private String g;
	private String h;
	private String i;
	private final long j;
	private final String k;
	private final VastAdsRequest l;
	private JSONObject m;

	static 
	{
	//    0    0:new             #27  <Class p>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void p()>
	//    3    7:putstatic       #32  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
