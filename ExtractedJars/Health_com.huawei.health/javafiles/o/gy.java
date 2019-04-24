// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import java.io.*;
import java.util.*;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.message.BasicHeader;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package o:
//			hj, gp, gx, hb, 
//			gv, gz, ha, ht, 
//			hi, hp, hk, hr, 
//			hq

public abstract class gy
{

	public gy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		c = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #15  <Field boolean c>
		e = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #17  <Field boolean e>
	//    8   14:return          
	}

	private static byte[] a(HttpResponse httpresponse)
		throws IllegalStateException, IOException
	{
		ByteArrayOutputStream bytearrayoutputstream;
		HttpResponse httpresponse1;
		ByteArrayOutputStream bytearrayoutputstream1;
		byte abyte0[];
		bytearrayoutputstream1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		httpresponse1 = null;
	//    2    3:aconst_null     
	//    3    4:astore_3        
		abyte0 = new byte[1024];
	//    4    5:sipush          1024
	//    5    8:newarray        byte[]
	//    6   10:astore          5
		bytearrayoutputstream = bytearrayoutputstream1;
	//    7   12:aload           4
	//    8   14:astore_2        
		httpresponse = ((HttpResponse) (httpresponse.getEntity().getContent()));
	//    9   15:aload_0         
	//   10   16:invokeinterface #31  <Method HttpEntity HttpResponse.getEntity()>
	//   11   21:invokeinterface #37  <Method InputStream HttpEntity.getContent()>
	//   12   26:astore_0        
		bytearrayoutputstream = bytearrayoutputstream1;
	//   13   27:aload           4
	//   14   29:astore_2        
		httpresponse1 = httpresponse;
	//   15   30:aload_0         
	//   16   31:astore_3        
		bytearrayoutputstream1 = new ByteArrayOutputStream();
	//   17   32:new             #39  <Class ByteArrayOutputStream>
	//   18   35:dup             
	//   19   36:invokespecial   #40  <Method void ByteArrayOutputStream()>
	//   20   39:astore          4
_L2:
		bytearrayoutputstream = bytearrayoutputstream1;
	//   21   41:aload           4
	//   22   43:astore_2        
		httpresponse1 = httpresponse;
	//   23   44:aload_0         
	//   24   45:astore_3        
		int i = ((InputStream) (httpresponse)).read(abyte0);
	//   25   46:aload_0         
	//   26   47:aload           5
	//   27   49:invokevirtual   #46  <Method int InputStream.read(byte[])>
	//   28   52:istore_1        
		if(i == -1)
			break; /* Loop/switch isn't completed */
	//   29   53:iload_1         
	//   30   54:iconst_m1       
	//   31   55:icmpeq          75
		bytearrayoutputstream = bytearrayoutputstream1;
	//   32   58:aload           4
	//   33   60:astore_2        
		httpresponse1 = httpresponse;
	//   34   61:aload_0         
	//   35   62:astore_3        
		bytearrayoutputstream1.write(abyte0, 0, i);
	//   36   63:aload           4
	//   37   65:aload           5
	//   38   67:iconst_0        
	//   39   68:iload_1         
	//   40   69:invokevirtual   #50  <Method void ByteArrayOutputStream.write(byte[], int, int)>
		if(true) goto _L2; else goto _L1
	//   41   72:goto            41
_L1:
		bytearrayoutputstream = bytearrayoutputstream1;
	//   42   75:aload           4
	//   43   77:astore_2        
		httpresponse1 = httpresponse;
	//   44   78:aload_0         
	//   45   79:astore_3        
		abyte0 = bytearrayoutputstream1.toByteArray();
	//   46   80:aload           4
	//   47   82:invokevirtual   #54  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   48   85:astore          5
		if(httpresponse != null)
	//*  49   87:aload_0         
	//*  50   88:ifnull          95
			try
			{
				((InputStream) (httpresponse)).close();
	//   51   91:aload_0         
	//   52   92:invokevirtual   #57  <Method void InputStream.close()>
			}
	//*  53   95:aload           4
	//*  54   97:invokevirtual   #58  <Method void ByteArrayOutputStream.close()>
	//*  55  100:aload           5
	//*  56  102:areturn         
	//*  57  103:astore_0        
	//*  58  104:aload_3         
	//*  59  105:ifnull          112
	//*  60  108:aload_3         
	//*  61  109:invokevirtual   #57  <Method void InputStream.close()>
	//*  62  112:aload_2         
	//*  63  113:ifnull          120
	//*  64  116:aload_2         
	//*  65  117:invokevirtual   #58  <Method void ByteArrayOutputStream.close()>
	//*  66  120:aload_0         
	//*  67  121:athrow          
			// Misplaced declaration of an exception variable
			catch(HttpResponse httpresponse) { }
	//   68  122:astore_0        
		try
		{
			bytearrayoutputstream1.close();
		}
	//*  69  123:goto            95
		// Misplaced declaration of an exception variable
		catch(HttpResponse httpresponse)
	//*  70  126:astore_0        
		{
			return abyte0;
	//   71  127:aload           5
	//   72  129:areturn         
		}
		return abyte0;
		httpresponse;
		if(httpresponse1 != null)
			try
			{
				((InputStream) (httpresponse1)).close();
			}
			catch(Exception exception1) { }
	//   73  130:astore_3        
		if(bytearrayoutputstream != null)
			try
			{
				bytearrayoutputstream.close();
			}
	//*  74  131:goto            112
			catch(Exception exception) { }
	//   75  134:astore_2        
		throw httpresponse;
	//*  76  135:goto            120
	}

	public static String c(HashMap hashmap, HashMap hashmap1)
		throws JSONException
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #64  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void JSONObject()>
	//    3    7:astore_2        
		JSONObject jsonobject1 = new JSONObject();
	//    4    8:new             #64  <Class JSONObject>
	//    5   11:dup             
	//    6   12:invokespecial   #65  <Method void JSONObject()>
	//    7   15:astore_3        
		java.util.Map.Entry entry;
		for(hashmap = ((HashMap) (hashmap.entrySet().iterator())); ((Iterator) (hashmap)).hasNext(); jsonobject1.put((String)entry.getKey(), entry.getValue()))
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #71  <Method Set HashMap.entrySet()>
	//*  10   20:invokeinterface #77  <Method Iterator Set.iterator()>
	//*  11   25:astore_0        
	//*  12   26:aload_0         
	//*  13   27:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//*  14   32:ifeq            71
			entry = (java.util.Map.Entry)((Iterator) (hashmap)).next();
	//   15   35:aload_0         
	//   16   36:invokeinterface #87  <Method Object Iterator.next()>
	//   17   41:checkcast       #89  <Class java.util.Map$Entry>
	//   18   44:astore          4

	//   19   46:aload_3         
	//   20   47:aload           4
	//   21   49:invokeinterface #92  <Method Object java.util.Map$Entry.getKey()>
	//   22   54:checkcast       #94  <Class String>
	//   23   57:aload           4
	//   24   59:invokeinterface #97  <Method Object java.util.Map$Entry.getValue()>
	//   25   64:invokevirtual   #101 <Method JSONObject JSONObject.put(String, Object)>
	//   26   67:pop             
	//*  27   68:goto            26
		hashmap = ((HashMap) (new JSONObject()));
	//   28   71:new             #64  <Class JSONObject>
	//   29   74:dup             
	//   30   75:invokespecial   #65  <Method void JSONObject()>
	//   31   78:astore_0        
		java.util.Map.Entry entry1;
		for(hashmap1 = ((HashMap) (hashmap1.entrySet().iterator())); ((Iterator) (hashmap1)).hasNext(); ((JSONObject) (hashmap)).put((String)entry1.getKey(), entry1.getValue()))
	//*  32   79:aload_1         
	//*  33   80:invokevirtual   #71  <Method Set HashMap.entrySet()>
	//*  34   83:invokeinterface #77  <Method Iterator Set.iterator()>
	//*  35   88:astore_1        
	//*  36   89:aload_1         
	//*  37   90:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//*  38   95:ifeq            134
			entry1 = (java.util.Map.Entry)((Iterator) (hashmap1)).next();
	//   39   98:aload_1         
	//   40   99:invokeinterface #87  <Method Object Iterator.next()>
	//   41  104:checkcast       #89  <Class java.util.Map$Entry>
	//   42  107:astore          4

	//   43  109:aload_0         
	//   44  110:aload           4
	//   45  112:invokeinterface #92  <Method Object java.util.Map$Entry.getKey()>
	//   46  117:checkcast       #94  <Class String>
	//   47  120:aload           4
	//   48  122:invokeinterface #97  <Method Object java.util.Map$Entry.getValue()>
	//   49  127:invokevirtual   #101 <Method JSONObject JSONObject.put(String, Object)>
	//   50  130:pop             
	//*  51  131:goto            89
		jsonobject1.put("params", ((Object) (hashmap)));
	//   52  134:aload_3         
	//   53  135:ldc1            #103 <String "params">
	//   54  137:aload_0         
	//   55  138:invokevirtual   #101 <Method JSONObject JSONObject.put(String, Object)>
	//   56  141:pop             
		jsonobject.put("data", ((Object) (jsonobject1)));
	//   57  142:aload_2         
	//   58  143:ldc1            #105 <String "data">
	//   59  145:aload_3         
	//   60  146:invokevirtual   #101 <Method JSONObject JSONObject.put(String, Object)>
	//   61  149:pop             
		return jsonobject.toString();
	//   62  150:aload_2         
	//   63  151:invokevirtual   #109 <Method String JSONObject.toString()>
	//   64  154:areturn         
	}

	public static JSONObject c(String s, String s1)
		throws JSONException
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #64  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void JSONObject()>
	//    3    7:astore_2        
		JSONObject jsonobject1 = new JSONObject();
	//    4    8:new             #64  <Class JSONObject>
	//    5   11:dup             
	//    6   12:invokespecial   #65  <Method void JSONObject()>
	//    7   15:astore_3        
		jsonobject1.put("type", ((Object) (s)));
	//    8   16:aload_3         
	//    9   17:ldc1            #114 <String "type">
	//   10   19:aload_0         
	//   11   20:invokevirtual   #101 <Method JSONObject JSONObject.put(String, Object)>
	//   12   23:pop             
		jsonobject1.put("method", ((Object) (s1)));
	//   13   24:aload_3         
	//   14   25:ldc1            #116 <String "method">
	//   15   27:aload_1         
	//   16   28:invokevirtual   #101 <Method JSONObject JSONObject.put(String, Object)>
	//   17   31:pop             
		jsonobject.put("action", ((Object) (jsonobject1)));
	//   18   32:aload_2         
	//   19   33:ldc1            #118 <String "action">
	//   20   35:aload_3         
	//   21   36:invokevirtual   #101 <Method JSONObject JSONObject.put(String, Object)>
	//   22   39:pop             
		return jsonobject;
	//   23   40:aload_2         
	//   24   41:areturn         
	}

	private static boolean d(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #126 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		boolean flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_1        
		boolean flag1;
		try
		{
			s = ((String) ((new JSONObject(s)).getJSONObject("data")));
	//    7   11:new             #64  <Class JSONObject>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #129 <Method void JSONObject(String)>
	//   11   19:ldc1            #105 <String "data">
	//   12   21:invokevirtual   #133 <Method JSONObject JSONObject.getJSONObject(String)>
	//   13   24:astore_0        
			flag1 = ((JSONObject) (s)).has("params");
	//   14   25:aload_0         
	//   15   26:ldc1            #103 <String "params">
	//   16   28:invokevirtual   #136 <Method boolean JSONObject.has(String)>
	//   17   31:istore_2        
		}
	//*  18   32:iload_2         
	//*  19   33:ifne            38
	//*  20   36:iconst_0        
	//*  21   37:ireturn         
	//*  22   38:aload_0         
	//*  23   39:ldc1            #103 <String "params">
	//*  24   41:invokevirtual   #133 <Method JSONObject JSONObject.getJSONObject(String)>
	//*  25   44:ldc1            #138 <String "public_key">
	//*  26   46:aconst_null     
	//*  27   47:invokevirtual   #142 <Method String JSONObject.optString(String, String)>
	//*  28   50:astore_0        
	//*  29   51:aload_0         
	//*  30   52:invokestatic    #126 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  31   55:ifne            71
	//*  32   58:invokestatic    #147 <Method hj hj.d()>
	//*  33   61:pop             
	//*  34   62:invokestatic    #152 <Method gp gp.e()>
	//*  35   65:aload_0         
	//*  36   66:invokevirtual   #154 <Method void gp.a(String)>
	//*  37   69:iconst_1        
	//*  38   70:istore_1        
	//*  39   71:iload_1         
	//*  40   72:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  41   73:astore_0        
		{
			return false;
	//   42   74:iconst_0        
	//   43   75:ireturn         
		}
		if(!flag1)
			return false;
		s = ((JSONObject) (s)).getJSONObject("params").optString("public_key", ((String) (null)));
		if(TextUtils.isEmpty(((CharSequence) (s))))
			break MISSING_BLOCK_LABEL_71;
		hj.d();
		gp.e().a(s);
		flag = true;
		return flag;
	}

	public final hb a(Context context, String s, String s1, boolean flag)
		throws Throwable
	{
		gx gx1 = new gx(e);
	//    0    0:new             #159 <Class gx>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field boolean e>
	//    4    8:invokespecial   #162 <Method void gx(boolean)>
	//    5   11:astore          9
		Object obj;
		obj = ((Object) (gx1.a(new hb(c(), e(s, d())), c)));
	//    6   13:aload           9
	//    7   15:new             #164 <Class hb>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokevirtual   #166 <Method String c()>
	//   11   23:aload_0         
	//   12   24:aload_2         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #169 <Method JSONObject d()>
	//   15   29:invokevirtual   #172 <Method String e(String, JSONObject)>
	//   16   32:invokespecial   #175 <Method void hb(String, String)>
	//   17   35:aload_0         
	//   18   36:getfield        #15  <Field boolean c>
	//   19   39:invokevirtual   #178 <Method gz gx.a(hb, boolean)>
	//   20   42:astore          7
		if(a == null)
	//*  21   44:getstatic       #180 <Field gv a>
	//*  22   47:ifnonnull       65
		{
			a = new gv(context, s1);
	//   23   50:new             #182 <Class gv>
	//   24   53:dup             
	//   25   54:aload_1         
	//   26   55:aload_3         
	//   27   56:invokespecial   #185 <Method void gv(Context, String)>
	//   28   59:putstatic       #180 <Field gv a>
			break MISSING_BLOCK_LABEL_85;
	//   29   62:goto            85
		}
		if(!TextUtils.equals(((CharSequence) (s1)), ((CharSequence) (a.a))))
	//*  30   65:aload_3         
	//*  31   66:getstatic       #180 <Field gv a>
	//*  32   69:getfield        #188 <Field String gv.a>
	//*  33   72:invokestatic    #192 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*  34   75:ifne            85
			a.a = s1;
	//   35   78:getstatic       #180 <Field gv a>
	//   36   81:aload_3         
	//   37   82:putfield        #188 <Field String gv.a>
		Object obj1;
		gv gv1 = a;
	//   38   85:getstatic       #180 <Field gv a>
	//   39   88:astore          8
		obj1 = ((Object) (c(((gz) (obj)).a, s)));
	//   40   90:aload_0         
	//   41   91:aload           7
	//   42   93:getfield        #196 <Field boolean gz.a>
	//   43   96:aload_2         
	//   44   97:invokevirtual   #199 <Method List c(boolean, String)>
	//   45  100:astore          10
		obj1 = ((Object) (gv1.e(((gz) (obj)).d, ((List) (obj1)))));
	//   46  102:aload           8
	//   47  104:aload           7
	//   48  106:getfield        #202 <Field byte[] gz.d>
	//   49  109:aload           10
	//   50  111:invokevirtual   #205 <Method HttpResponse gv.e(byte[], List)>
	//   51  114:astore          10
		if(obj1 != null) goto _L2; else goto _L1
	//   52  116:aload           10
	//   53  118:ifnonnull       127
_L1:
		obj = null;
	//   54  121:aconst_null     
	//   55  122:astore          7
		  goto _L3
	//*  56  124:goto            225
_L2:
		int i;
		hb hb1 = null;
	//   57  127:aconst_null     
	//   58  128:astore          8
		int j;
		Header aheader[];
		String s2;
		try
		{
			aheader = ((HttpResponse) (obj1)).getAllHeaders();
	//   59  130:aload           10
	//   60  132:invokeinterface #209 <Method Header[] HttpResponse.getAllHeaders()>
	//   61  137:astore          11
		}
	//*  62  139:aload           8
	//*  63  141:astore          7
	//*  64  143:aload           11
	//*  65  145:ifnull          310
	//*  66  148:aload           8
	//*  67  150:astore          7
	//*  68  152:aload           11
	//*  69  154:arraylength     
	//*  70  155:ifle            310
	//*  71  158:aload           11
	//*  72  160:arraylength     
	//*  73  161:istore          6
	//*  74  163:iconst_0        
	//*  75  164:istore          5
	//*  76  166:aload           8
	//*  77  168:astore          7
	//*  78  170:iload           5
	//*  79  172:iload           6
	//*  80  174:icmpge          310
	//*  81  177:aload           11
	//*  82  179:iload           5
	//*  83  181:aaload          
	//*  84  182:astore          7
	//*  85  184:aload           7
	//*  86  186:ifnull          301
	//*  87  189:aload           7
	//*  88  191:invokeinterface #214 <Method String Header.getName()>
	//*  89  196:astore          12
	//*  90  198:aload           12
	//*  91  200:ifnull          301
	//*  92  203:aload           12
	//*  93  205:ldc1            #216 <String "msp-gzip">
	//*  94  207:invokevirtual   #219 <Method boolean String.equalsIgnoreCase(String)>
	//*  95  210:ifeq            301
	//*  96  213:aload           7
	//*  97  215:invokeinterface #221 <Method String Header.getValue()>
	//*  98  220:astore          7
	//*  99  222:goto            310
	//* 100  225:aload           9
	//* 101  227:new             #194 <Class gz>
	//* 102  230:dup             
	//* 103  231:aload           7
	//* 104  233:invokestatic    #227 <Method Boolean Boolean.valueOf(String)>
	//* 105  236:invokevirtual   #230 <Method boolean Boolean.booleanValue()>
	//* 106  239:aload           10
	//* 107  241:invokestatic    #232 <Method byte[] a(HttpResponse)>
	//* 108  244:invokespecial   #235 <Method void gz(boolean, byte[])>
	//* 109  247:invokevirtual   #238 <Method hb gx.e(gz)>
	//* 110  250:astore          8
	//* 111  252:aload           8
	//* 112  254:astore          7
	//* 113  256:aload           8
	//* 114  258:ifnull          295
	//* 115  261:aload           8
	//* 116  263:astore          7
	//* 117  265:aload           8
	//* 118  267:getfield        #240 <Field String hb.d>
	//* 119  270:invokestatic    #242 <Method boolean d(String)>
	//* 120  273:ifeq            295
	//* 121  276:aload           8
	//* 122  278:astore          7
	//* 123  280:iload           4
	//* 124  282:ifeq            295
	//* 125  285:aload_0         
	//* 126  286:aload_1         
	//* 127  287:aload_2         
	//* 128  288:aload_3         
	//* 129  289:iconst_0        
	//* 130  290:invokevirtual   #244 <Method hb a(Context, String, String, boolean)>
	//* 131  293:astore          7
	//* 132  295:aload           7
	//* 133  297:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 134  298:astore_1        
		{
			throw context;
	//  135  299:aload_1         
	//  136  300:athrow          
		}
		obj = ((Object) (hb1));
		if(aheader == null) goto _L3; else goto _L4
_L4:
		obj = ((Object) (hb1));
		if(aheader.length <= 0) goto _L3; else goto _L5
_L5:
		j = aheader.length;
		i = 0;
_L12:
		obj = ((Object) (hb1));
		if(i >= j) goto _L3; else goto _L6
_L6:
		obj = ((Object) (aheader[i]));
		if(obj == null) goto _L8; else goto _L7
_L7:
		s2 = ((Header) (obj)).getName();
		if(s2 == null) goto _L8; else goto _L9
_L9:
		if(!s2.equalsIgnoreCase("msp-gzip")) goto _L8; else goto _L10
_L10:
		obj = ((Object) (((Header) (obj)).getValue()));
_L3:
		hb1 = gx1.e(new gz(Boolean.valueOf(((String) (obj))).booleanValue(), a(((HttpResponse) (obj1)))));
		obj = ((Object) (hb1));
		if(hb1 == null)
			break MISSING_BLOCK_LABEL_295;
		obj = ((Object) (hb1));
		if(!d(hb1.d))
			break MISSING_BLOCK_LABEL_295;
		obj = ((Object) (hb1));
		if(!flag)
			break MISSING_BLOCK_LABEL_295;
		obj = ((Object) (a(context, s, s1, false)));
		return ((hb) (obj));
_L8:
		i++;
	//  137  301:iload           5
	//  138  303:iconst_1        
	//  139  304:iadd            
	//  140  305:istore          5
		if(true) goto _L12; else goto _L11
	//  141  307:goto            166
_L11:
	//* 142  310:goto            225
	}

	public String b()
	{
		return "4.9.0";
	//    0    0:ldc1            #247 <String "4.9.0">
	//    1    2:areturn         
	}

	public String c()
		throws JSONException
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #67  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #248 <Method void HashMap()>
	//    3    7:astore_1        
		hashmap.put("device", ((Object) (Build.MODEL)));
	//    4    8:aload_1         
	//    5    9:ldc1            #250 <String "device">
	//    6   11:getstatic       #255 <Field String Build.MODEL>
	//    7   14:invokevirtual   #258 <Method Object HashMap.put(Object, Object)>
	//    8   17:pop             
		hashmap.put("namespace", "com.alipay.mobilecashier");
	//    9   18:aload_1         
	//   10   19:ldc2            #260 <String "namespace">
	//   11   22:ldc2            #262 <String "com.alipay.mobilecashier">
	//   12   25:invokevirtual   #258 <Method Object HashMap.put(Object, Object)>
	//   13   28:pop             
		hashmap.put("api_name", "com.alipay.mcpay");
	//   14   29:aload_1         
	//   15   30:ldc2            #264 <String "api_name">
	//   16   33:ldc2            #266 <String "com.alipay.mcpay">
	//   17   36:invokevirtual   #258 <Method Object HashMap.put(Object, Object)>
	//   18   39:pop             
		hashmap.put("api_version", ((Object) (b())));
	//   19   40:aload_1         
	//   20   41:ldc2            #268 <String "api_version">
	//   21   44:aload_0         
	//   22   45:invokevirtual   #270 <Method String b()>
	//   23   48:invokevirtual   #258 <Method Object HashMap.put(Object, Object)>
	//   24   51:pop             
		return c(hashmap, new HashMap());
	//   25   52:aload_1         
	//   26   53:new             #67  <Class HashMap>
	//   27   56:dup             
	//   28   57:invokespecial   #248 <Method void HashMap()>
	//   29   60:invokestatic    #272 <Method String c(HashMap, HashMap)>
	//   30   63:areturn         
	}

	public List c(boolean flag, String s)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #274 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #275 <Method void ArrayList()>
	//    3    7:astore_3        
		((List) (arraylist)).add(((Object) (new BasicHeader("msp-gzip", String.valueOf(flag)))));
	//    4    8:aload_3         
	//    5    9:new             #277 <Class BasicHeader>
	//    6   12:dup             
	//    7   13:ldc1            #216 <String "msp-gzip">
	//    8   15:iload_1         
	//    9   16:invokestatic    #280 <Method String String.valueOf(boolean)>
	//   10   19:invokespecial   #281 <Method void BasicHeader(String, String)>
	//   11   22:invokeinterface #287 <Method boolean List.add(Object)>
	//   12   27:pop             
		((List) (arraylist)).add(((Object) (new BasicHeader("Operation-Type", "alipay.msp.cashier.dispatch.bytes"))));
	//   13   28:aload_3         
	//   14   29:new             #277 <Class BasicHeader>
	//   15   32:dup             
	//   16   33:ldc2            #289 <String "Operation-Type">
	//   17   36:ldc2            #291 <String "alipay.msp.cashier.dispatch.bytes">
	//   18   39:invokespecial   #281 <Method void BasicHeader(String, String)>
	//   19   42:invokeinterface #287 <Method boolean List.add(Object)>
	//   20   47:pop             
		((List) (arraylist)).add(((Object) (new BasicHeader("content-type", "application/octet-stream"))));
	//   21   48:aload_3         
	//   22   49:new             #277 <Class BasicHeader>
	//   23   52:dup             
	//   24   53:ldc2            #293 <String "content-type">
	//   25   56:ldc2            #295 <String "application/octet-stream">
	//   26   59:invokespecial   #281 <Method void BasicHeader(String, String)>
	//   27   62:invokeinterface #287 <Method boolean List.add(Object)>
	//   28   67:pop             
		((List) (arraylist)).add(((Object) (new BasicHeader("Version", "2.0"))));
	//   29   68:aload_3         
	//   30   69:new             #277 <Class BasicHeader>
	//   31   72:dup             
	//   32   73:ldc2            #297 <String "Version">
	//   33   76:ldc2            #299 <String "2.0">
	//   34   79:invokespecial   #281 <Method void BasicHeader(String, String)>
	//   35   82:invokeinterface #287 <Method boolean List.add(Object)>
	//   36   87:pop             
		((List) (arraylist)).add(((Object) (new BasicHeader("AppId", "TAOBAO"))));
	//   37   88:aload_3         
	//   38   89:new             #277 <Class BasicHeader>
	//   39   92:dup             
	//   40   93:ldc2            #301 <String "AppId">
	//   41   96:ldc2            #303 <String "TAOBAO">
	//   42   99:invokespecial   #281 <Method void BasicHeader(String, String)>
	//   43  102:invokeinterface #287 <Method boolean List.add(Object)>
	//   44  107:pop             
		((List) (arraylist)).add(((Object) (new BasicHeader("Msp-Param", ha.e(s)))));
	//   45  108:aload_3         
	//   46  109:new             #277 <Class BasicHeader>
	//   47  112:dup             
	//   48  113:ldc2            #305 <String "Msp-Param">
	//   49  116:aload_2         
	//   50  117:invokestatic    #310 <Method String ha.e(String)>
	//   51  120:invokespecial   #281 <Method void BasicHeader(String, String)>
	//   52  123:invokeinterface #287 <Method boolean List.add(Object)>
	//   53  128:pop             
		((List) (arraylist)).add(((Object) (new BasicHeader("des-mode", "CBC"))));
	//   54  129:aload_3         
	//   55  130:new             #277 <Class BasicHeader>
	//   56  133:dup             
	//   57  134:ldc2            #312 <String "des-mode">
	//   58  137:ldc2            #314 <String "CBC">
	//   59  140:invokespecial   #281 <Method void BasicHeader(String, String)>
	//   60  143:invokeinterface #287 <Method boolean List.add(Object)>
	//   61  148:pop             
		return ((List) (arraylist));
	//   62  149:aload_3         
	//   63  150:areturn         
	}

	public hb c(Context context, String s)
		throws Throwable
	{
		return a(context, s, ht.b(context), true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:invokestatic    #321 <Method String ht.b(Context)>
	//    5    7:iconst_1        
	//    6    8:invokevirtual   #244 <Method hb a(Context, String, String, boolean)>
	//    7   11:areturn         
	}

	public abstract JSONObject d()
		throws JSONException;

	public String e(String s, JSONObject jsonobject)
	{
		hj hj1;
		hi hi1;
		JSONObject jsonobject2;
		hj1 = hj.d();
	//    0    0:invokestatic    #147 <Method hj hj.d()>
	//    1    3:astore          7
		hi1 = hi.e();
	//    2    5:invokestatic    #326 <Method hi hi.e()>
	//    3    8:astore          8
		jsonobject2 = hp.d(new JSONObject(), jsonobject);
	//    4   10:new             #64  <Class JSONObject>
	//    5   13:dup             
	//    6   14:invokespecial   #65  <Method void JSONObject()>
	//    7   17:aload_2         
	//    8   18:invokestatic    #331 <Method JSONObject hp.d(JSONObject, JSONObject)>
	//    9   21:astore          9
		Object obj;
		Object obj1;
		gp gp1;
		Context context;
		String s4;
		String s6;
		String s8;
		Object obj2;
		jsonobject2.put("tid", ((Object) (hi1.c)));
	//   10   23:aload           9
	//   11   25:ldc2            #333 <String "tid">
	//   12   28:aload           8
	//   13   30:getfield        #335 <Field String hi.c>
	//   14   33:invokevirtual   #101 <Method JSONObject JSONObject.put(String, Object)>
	//   15   36:pop             
		gp1 = gp.e();
	//   16   37:invokestatic    #152 <Method gp gp.e()>
	//   17   40:astore          10
		context = hj.d().c;
	//   18   42:invokestatic    #147 <Method hj hj.d()>
	//   19   45:getfield        #338 <Field Context hj.c>
	//   20   48:astore          11
		obj1 = ((Object) (hk.d(context)));
	//   21   50:aload           11
	//   22   52:invokestatic    #343 <Method hk hk.d(Context)>
	//   23   55:astore          6
		if(TextUtils.isEmpty(((CharSequence) (gp1.d))))
	//*  24   57:aload           10
	//*  25   59:getfield        #344 <Field String gp.d>
	//*  26   62:invokestatic    #126 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  27   65:ifeq            217
		{
			jsonobject = ((JSONObject) (hr.d()));
	//   28   68:invokestatic    #348 <Method String hr.d()>
	//   29   71:astore_2        
			String s1 = hr.a();
	//   30   72:invokestatic    #350 <Method String hr.a()>
	//   31   75:astore          4
			String s2 = hr.i(context);
	//   32   77:aload           11
	//   33   79:invokestatic    #353 <Method String hr.i(Context)>
	//   34   82:astore          5
			String s3 = ht.b(context);
	//   35   84:aload           11
	//   36   86:invokestatic    #321 <Method String ht.b(Context)>
	//   37   89:astore          12
			s3 = s3.substring(0, s3.indexOf("://"));
	//   38   91:aload           12
	//   39   93:iconst_0        
	//   40   94:aload           12
	//   41   96:ldc2            #355 <String "://">
	//   42   99:invokevirtual   #359 <Method int String.indexOf(String)>
	//   43  102:invokevirtual   #363 <Method String String.substring(int, int)>
	//   44  105:astore          12
			String s5 = hr.k(context);
	//   45  107:aload           11
	//   46  109:invokestatic    #366 <Method String hr.k(Context)>
	//   47  112:astore          13
			String s7 = Float.toString((new TextView(context)).getTextSize());
	//   48  114:new             #368 <Class TextView>
	//   49  117:dup             
	//   50  118:aload           11
	//   51  120:invokespecial   #371 <Method void TextView(Context)>
	//   52  123:invokevirtual   #375 <Method float TextView.getTextSize()>
	//   53  126:invokestatic    #380 <Method String Float.toString(float)>
	//   54  129:astore          14
			gp1.d = (new StringBuilder()).append("Msp/15.4.5").append(" (").append(((String) (jsonobject))).append(";").append(s1).append(";").append(s2).append(";").append(s3).append(";").append(s5).append(";").append(s7).toString();
	//   55  131:aload           10
	//   56  133:new             #382 <Class StringBuilder>
	//   57  136:dup             
	//   58  137:invokespecial   #383 <Method void StringBuilder()>
	//   59  140:ldc2            #385 <String "Msp/15.4.5">
	//   60  143:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//   61  146:ldc2            #391 <String " (">
	//   62  149:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//   63  152:aload_2         
	//   64  153:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//   65  156:ldc2            #393 <String ";">
	//   66  159:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//   67  162:aload           4
	//   68  164:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//   69  167:ldc2            #393 <String ";">
	//   70  170:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//   71  173:aload           5
	//   72  175:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//   73  178:ldc2            #393 <String ";">
	//   74  181:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//   75  184:aload           12
	//   76  186:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//   77  189:ldc2            #393 <String ";">
	//   78  192:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//   79  195:aload           13
	//   80  197:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//   81  200:ldc2            #393 <String ";">
	//   82  203:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//   83  206:aload           14
	//   84  208:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//   85  211:invokevirtual   #394 <Method String StringBuilder.toString()>
	//   86  214:putfield        #344 <Field String gp.d>
		}
		s4 = hk.b(context).r;
	//   87  217:aload           11
	//   88  219:invokestatic    #397 <Method hq hk.b(Context)>
	//   89  222:getfield        #402 <Field String hq.r>
	//   90  225:astore          12
		s6 = ((hk) (obj1)).e();
	//   91  227:aload           6
	//   92  229:invokevirtual   #404 <Method String hk.e()>
	//   93  232:astore          13
		s8 = ((hk) (obj1)).b();
	//   94  234:aload           6
	//   95  236:invokevirtual   #405 <Method String hk.b()>
	//   96  239:astore          14
		obj2 = ((Object) (hj.d().c));
	//   97  241:invokestatic    #147 <Method hj hj.d()>
	//   98  244:getfield        #338 <Field Context hj.c>
	//   99  247:astore          15
		obj = ((Object) (((Context) (obj2)).getSharedPreferences("virtualImeiAndImsi", 0)));
	//  100  249:aload           15
	//  101  251:ldc2            #407 <String "virtualImeiAndImsi">
	//  102  254:iconst_0        
	//  103  255:invokevirtual   #413 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//  104  258:astore          5
		jsonobject = ((JSONObject) (((SharedPreferences) (obj)).getString("virtual_imsi", ((String) (null)))));
	//  105  260:aload           5
	//  106  262:ldc2            #415 <String "virtual_imsi">
	//  107  265:aconst_null     
	//  108  266:invokeinterface #420 <Method String SharedPreferences.getString(String, String)>
	//  109  271:astore_2        
		JSONObject jsonobject1 = jsonobject;
	//  110  272:aload_2         
	//  111  273:astore          4
		if(!TextUtils.isEmpty(((CharSequence) (jsonobject))))
			break MISSING_BLOCK_LABEL_360;
	//  112  275:aload_2         
	//  113  276:invokestatic    #126 <Method boolean TextUtils.isEmpty(CharSequence)>
	//  114  279:ifeq            360
		if(!TextUtils.isEmpty(((CharSequence) (hi.e().c)))) goto _L2; else goto _L1
	//  115  282:invokestatic    #326 <Method hi hi.e()>
	//  116  285:getfield        #335 <Field String hi.c>
	//  117  288:invokestatic    #126 <Method boolean TextUtils.isEmpty(CharSequence)>
	//  118  291:ifeq            326
_L1:
		jsonobject = ((JSONObject) (hj.d().c()));
	//  119  294:invokestatic    #147 <Method hj hj.d()>
	//  120  297:invokevirtual   #421 <Method String hj.c()>
	//  121  300:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (jsonobject))))
	//* 122  301:aload_2         
	//* 123  302:invokestatic    #126 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 124  305:ifeq            315
		{
			jsonobject = ((JSONObject) (gp.d()));
	//  125  308:invokestatic    #422 <Method String gp.d()>
	//  126  311:astore_2        
			break MISSING_BLOCK_LABEL_335;
	//  127  312:goto            335
		}
		boolean flag;
		Object obj3;
		String s9;
		StringBuilder stringbuilder;
		try
		{
			jsonobject = ((JSONObject) (((String) (jsonobject)).substring(3, 18)));
	//  128  315:aload_2         
	//  129  316:iconst_3        
	//  130  317:bipush          18
	//  131  319:invokevirtual   #363 <Method String String.substring(int, int)>
	//  132  322:astore_2        
			break MISSING_BLOCK_LABEL_335;
	//  133  323:goto            335
		}
	//* 134  326:aload           15
	//* 135  328:invokestatic    #343 <Method hk hk.d(Context)>
	//* 136  331:invokevirtual   #404 <Method String hk.e()>
	//* 137  334:astore_2        
	//* 138  335:aload           5
	//* 139  337:invokeinterface #426 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//* 140  342:ldc2            #415 <String "virtual_imsi">
	//* 141  345:aload_2         
	//* 142  346:invokeinterface #432 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//* 143  351:invokeinterface #435 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//* 144  356:pop             
	//* 145  357:aload_2         
	//* 146  358:astore          4
	//* 147  360:invokestatic    #147 <Method hj hj.d()>
	//* 148  363:getfield        #338 <Field Context hj.c>
	//* 149  366:astore          16
	//* 150  368:aload           16
	//* 151  370:ldc2            #407 <String "virtualImeiAndImsi">
	//* 152  373:iconst_0        
	//* 153  374:invokevirtual   #413 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//* 154  377:astore          15
	//* 155  379:aload           15
	//* 156  381:ldc2            #437 <String "virtual_imei">
	//* 157  384:aconst_null     
	//* 158  385:invokeinterface #420 <Method String SharedPreferences.getString(String, String)>
	//* 159  390:astore          5
	//* 160  392:aload           5
	//* 161  394:astore_2        
	//* 162  395:aload           5
	//* 163  397:invokestatic    #126 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 164  400:ifeq            453
	//* 165  403:invokestatic    #326 <Method hi hi.e()>
	//* 166  406:getfield        #335 <Field String hi.c>
	//* 167  409:invokestatic    #126 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 168  412:ifeq            422
	//* 169  415:invokestatic    #422 <Method String gp.d()>
	//* 170  418:astore_2        
	//* 171  419:goto            431
	//* 172  422:aload           16
	//* 173  424:invokestatic    #343 <Method hk hk.d(Context)>
	//* 174  427:invokevirtual   #405 <Method String hk.b()>
	//* 175  430:astore_2        
	//* 176  431:aload           15
	//* 177  433:invokeinterface #426 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//* 178  438:ldc2            #437 <String "virtual_imei">
	//* 179  441:aload_2         
	//* 180  442:invokeinterface #432 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//* 181  447:invokeinterface #435 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//* 182  452:pop             
	//* 183  453:aload           8
	//* 184  455:ifnull          468
	//* 185  458:aload           10
	//* 186  460:aload           8
	//* 187  462:getfield        #439 <Field String hi.b>
	//* 188  465:putfield        #441 <Field String gp.e>
	//* 189  468:getstatic       #444 <Field String Build.MANUFACTURER>
	//* 190  471:ldc2            #393 <String ";">
	//* 191  474:ldc2            #446 <String " ">
	//* 192  477:invokevirtual   #450 <Method String String.replace(CharSequence, CharSequence)>
	//* 193  480:astore          15
	//* 194  482:getstatic       #255 <Field String Build.MODEL>
	//* 195  485:ldc2            #393 <String ";">
	//* 196  488:ldc2            #446 <String " ">
	//* 197  491:invokevirtual   #450 <Method String String.replace(CharSequence, CharSequence)>
	//* 198  494:astore          16
	//* 199  496:invokestatic    #452 <Method boolean hj.b()>
	//* 200  499:istore_3        
	//* 201  500:aload           6
	//* 202  502:getfield        #453 <Field String hk.a>
	//* 203  505:astore          17
	//* 204  507:aload           11
	//* 205  509:invokevirtual   #457 <Method Context Context.getApplicationContext()>
	//* 206  512:ldc2            #459 <String "wifi">
	//* 207  515:invokevirtual   #463 <Method Object Context.getSystemService(String)>
	//* 208  518:checkcast       #465 <Class WifiManager>
	//* 209  521:invokevirtual   #469 <Method WifiInfo WifiManager.getConnectionInfo()>
	//* 210  524:astore          5
	//* 211  526:aload           5
	//* 212  528:ifnull          952
	//* 213  531:aload           5
	//* 214  533:invokevirtual   #474 <Method String WifiInfo.getSSID()>
	//* 215  536:astore          5
	//* 216  538:goto            541
	//* 217  541:aload           11
	//* 218  543:invokevirtual   #457 <Method Context Context.getApplicationContext()>
	//* 219  546:ldc2            #459 <String "wifi">
	//* 220  549:invokevirtual   #463 <Method Object Context.getSystemService(String)>
	//* 221  552:checkcast       #465 <Class WifiManager>
	//* 222  555:invokevirtual   #469 <Method WifiInfo WifiManager.getConnectionInfo()>
	//* 223  558:astore          6
	//* 224  560:aload           6
	//* 225  562:ifnull          960
	//* 226  565:aload           6
	//* 227  567:invokevirtual   #477 <Method String WifiInfo.getBSSID()>
	//* 228  570:astore          6
	//* 229  572:goto            575
	//* 230  575:new             #382 <Class StringBuilder>
	//* 231  578:dup             
	//* 232  579:invokespecial   #383 <Method void StringBuilder()>
	//* 233  582:astore          18
	//* 234  584:aload           18
	//* 235  586:aload           10
	//* 236  588:getfield        #344 <Field String gp.d>
	//* 237  591:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 238  594:ldc2            #393 <String ";">
	//* 239  597:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 240  600:aload           12
	//* 241  602:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 242  605:ldc2            #393 <String ";">
	//* 243  608:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 244  611:ldc2            #479 <String "-1;-1">
	//* 245  614:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 246  617:ldc2            #393 <String ";">
	//* 247  620:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 248  623:ldc2            #481 <String "1">
	//* 249  626:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 250  629:ldc2            #393 <String ";">
	//* 251  632:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 252  635:aload           13
	//* 253  637:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 254  640:ldc2            #393 <String ";">
	//* 255  643:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 256  646:aload           14
	//* 257  648:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 258  651:ldc2            #393 <String ";">
	//* 259  654:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 260  657:aload           10
	//* 261  659:getfield        #441 <Field String gp.e>
	//* 262  662:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 263  665:ldc2            #393 <String ";">
	//* 264  668:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 265  671:aload           15
	//* 266  673:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 267  676:ldc2            #393 <String ";">
	//* 268  679:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 269  682:aload           16
	//* 270  684:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 271  687:ldc2            #393 <String ";">
	//* 272  690:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 273  693:iload_3         
	//* 274  694:invokevirtual   #484 <Method StringBuilder StringBuilder.append(boolean)>
	//* 275  697:ldc2            #393 <String ";">
	//* 276  700:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 277  703:aload           17
	//* 278  705:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 279  708:ldc2            #486 <String ";-1;-1;">
	//* 280  711:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 281  714:aload           10
	//* 282  716:getfield        #487 <Field String gp.b>
	//* 283  719:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 284  722:ldc2            #393 <String ";">
	//* 285  725:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 286  728:aload           4
	//* 287  730:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 288  733:ldc2            #393 <String ";">
	//* 289  736:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 290  739:aload_2         
	//* 291  740:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 292  743:ldc2            #393 <String ";">
	//* 293  746:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 294  749:aload           5
	//* 295  751:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 296  754:ldc2            #393 <String ";">
	//* 297  757:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 298  760:aload           6
	//* 299  762:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 300  765:pop             
	//* 301  766:aload           8
	//* 302  768:ifnull          835
	//* 303  771:new             #67  <Class HashMap>
	//* 304  774:dup             
	//* 305  775:invokespecial   #248 <Method void HashMap()>
	//* 306  778:astore_2        
	//* 307  779:aload_2         
	//* 308  780:ldc2            #333 <String "tid">
	//* 309  783:aload           8
	//* 310  785:getfield        #335 <Field String hi.c>
	//* 311  788:invokevirtual   #258 <Method Object HashMap.put(Object, Object)>
	//* 312  791:pop             
	//* 313  792:aload_2         
	//* 314  793:ldc2            #489 <String "utdid">
	//* 315  796:invokestatic    #147 <Method hj hj.d()>
	//* 316  799:invokevirtual   #421 <Method String hj.c()>
	//* 317  802:invokevirtual   #258 <Method Object HashMap.put(Object, Object)>
	//* 318  805:pop             
	//* 319  806:aload           10
	//* 320  808:aload           11
	//* 321  810:aload_2         
	//* 322  811:invokevirtual   #492 <Method String gp.b(Context, HashMap)>
	//* 323  814:astore_2        
	//* 324  815:aload_2         
	//* 325  816:invokestatic    #126 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 326  819:ifne            835
	//* 327  822:aload           18
	//* 328  824:ldc2            #393 <String ";">
	//* 329  827:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 330  830:aload_2         
	//* 331  831:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 332  834:pop             
	//* 333  835:aload           18
	//* 334  837:ldc2            #494 <String ")">
	//* 335  840:invokevirtual   #389 <Method StringBuilder StringBuilder.append(String)>
	//* 336  843:pop             
	//* 337  844:aload           9
	//* 338  846:ldc2            #496 <String "user_agent">
	//* 339  849:aload           18
	//* 340  851:invokevirtual   #394 <Method String StringBuilder.toString()>
	//* 341  854:invokevirtual   #101 <Method JSONObject JSONObject.put(String, Object)>
	//* 342  857:pop             
	//* 343  858:aload           9
	//* 344  860:ldc2            #498 <String "has_alipay">
	//* 345  863:aload           7
	//* 346  865:getfield        #338 <Field Context hj.c>
	//* 347  868:invokestatic    #501 <Method boolean hr.e(Context)>
	//* 348  871:invokevirtual   #504 <Method JSONObject JSONObject.put(String, boolean)>
	//* 349  874:pop             
	//* 350  875:aload           9
	//* 351  877:ldc2            #506 <String "has_msp_app">
	//* 352  880:aload           7
	//* 353  882:getfield        #338 <Field Context hj.c>
	//* 354  885:invokestatic    #508 <Method boolean hr.a(Context)>
	//* 355  888:invokevirtual   #504 <Method JSONObject JSONObject.put(String, boolean)>
	//* 356  891:pop             
	//* 357  892:aload           9
	//* 358  894:ldc2            #510 <String "external_info">
	//* 359  897:aload_1         
	//* 360  898:invokevirtual   #101 <Method JSONObject JSONObject.put(String, Object)>
	//* 361  901:pop             
	//* 362  902:aload           9
	//* 363  904:ldc2            #512 <String "app_key">
	//* 364  907:ldc2            #514 <String "2014052600006128">
	//* 365  910:invokevirtual   #101 <Method JSONObject JSONObject.put(String, Object)>
	//* 366  913:pop             
	//* 367  914:aload           9
	//* 368  916:ldc2            #489 <String "utdid">
	//* 369  919:aload           7
	//* 370  921:invokevirtual   #421 <Method String hj.c()>
	//* 371  924:invokevirtual   #101 <Method JSONObject JSONObject.put(String, Object)>
	//* 372  927:pop             
	//* 373  928:aload           9
	//* 374  930:ldc2            #516 <String "new_client_key">
	//* 375  933:aload           8
	//* 376  935:getfield        #439 <Field String hi.b>
	//* 377  938:invokevirtual   #101 <Method JSONObject JSONObject.put(String, Object)>
	//* 378  941:pop             
	//* 379  942:aload           9
	//* 380  944:invokevirtual   #109 <Method String JSONObject.toString()>
	//* 381  947:areturn         
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//  382  948:astore_1        
		  goto _L3
_L2:
		jsonobject = ((JSONObject) (hk.d(((Context) (obj2))).e()));
		((SharedPreferences) (obj)).edit().putString("virtual_imsi", ((String) (jsonobject))).commit();
		jsonobject1 = jsonobject;
		obj3 = ((Object) (hj.d().c));
		obj2 = ((Object) (((Context) (obj3)).getSharedPreferences("virtualImeiAndImsi", 0)));
		obj = ((Object) (((SharedPreferences) (obj2)).getString("virtual_imei", ((String) (null)))));
		jsonobject = ((JSONObject) (obj));
		if(!TextUtils.isEmpty(((CharSequence) (obj))))
			break MISSING_BLOCK_LABEL_453;
		if(TextUtils.isEmpty(((CharSequence) (hi.e().c))))
		{
			jsonobject = ((JSONObject) (gp.d()));
			break MISSING_BLOCK_LABEL_431;
		}
		jsonobject = ((JSONObject) (hk.d(((Context) (obj3))).b()));
		((SharedPreferences) (obj2)).edit().putString("virtual_imei", ((String) (jsonobject))).commit();
		if(hi1 == null)
			break MISSING_BLOCK_LABEL_468;
		gp1.e = hi1.b;
		obj2 = ((Object) (Build.MANUFACTURER.replace(";", " ")));
		obj3 = ((Object) (Build.MODEL.replace(";", " ")));
		flag = hj.b();
		s9 = ((hk) (obj1)).a;
		obj = ((Object) (((WifiManager)context.getApplicationContext().getSystemService("wifi")).getConnectionInfo()));
		if(obj == null) goto _L5; else goto _L4
_L4:
		obj = ((Object) (((WifiInfo) (obj)).getSSID()));
_L6:
		obj1 = ((Object) (((WifiManager)context.getApplicationContext().getSystemService("wifi")).getConnectionInfo()));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_960;
		obj1 = ((Object) (((WifiInfo) (obj1)).getBSSID()));
_L7:
		stringbuilder = new StringBuilder();
		stringbuilder.append(gp1.d).append(";").append(s4).append(";").append("-1;-1").append(";").append("1").append(";").append(s6).append(";").append(s8).append(";").append(gp1.e).append(";").append(((String) (obj2))).append(";").append(((String) (obj3))).append(";").append(flag).append(";").append(s9).append(";-1;-1;").append(gp1.b).append(";").append(((String) (jsonobject1))).append(";").append(((String) (jsonobject))).append(";").append(((String) (obj))).append(";").append(((String) (obj1)));
		if(hi1 == null)
			break MISSING_BLOCK_LABEL_835;
		jsonobject = ((JSONObject) (new HashMap()));
		((HashMap) (jsonobject)).put("tid", ((Object) (hi1.c)));
		((HashMap) (jsonobject)).put("utdid", ((Object) (hj.d().c())));
		jsonobject = ((JSONObject) (gp1.b(context, ((HashMap) (jsonobject)))));
		if(!TextUtils.isEmpty(((CharSequence) (jsonobject))))
			stringbuilder.append(";").append(((String) (jsonobject)));
		stringbuilder.append(")");
		jsonobject2.put("user_agent", ((Object) (stringbuilder.toString())));
		jsonobject2.put("has_alipay", hr.e(hj1.c));
		jsonobject2.put("has_msp_app", hr.a(hj1.c));
		jsonobject2.put("external_info", ((Object) (s)));
		jsonobject2.put("app_key", "2014052600006128");
		jsonobject2.put("utdid", ((Object) (hj1.c())));
		jsonobject2.put("new_client_key", ((Object) (hi1.b)));
_L3:
		return jsonobject2.toString();
	//* 383  949:goto            942
_L5:
		obj = "-1";
	//  384  952:ldc2            #518 <String "-1">
	//  385  955:astore          5
		  goto _L6
	//* 386  957:goto            541
		obj1 = "00";
	//  387  960:ldc2            #520 <String "00">
	//  388  963:astore          6
		  goto _L7
	//* 389  965:goto            575
	}

	private static gv a;
	protected boolean c;
	protected boolean e;
}
