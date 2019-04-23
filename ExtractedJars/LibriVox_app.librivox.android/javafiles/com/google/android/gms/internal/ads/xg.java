// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.*;
import android.content.*;
import android.content.pm.*;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.*;
import android.net.Uri;
import android.os.*;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.*;
import android.webkit.*;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.b.b;
import com.google.android.gms.common.b.c;
import com.google.android.gms.common.util.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wz, wi, xa, bqp, 
//			bqj, xo, p, bwk, 
//			m, zzwf, wx, zj, 
//			wt, xe, zv, tk, 
//			ys, abe, bzl, zz, 
//			xl, azc, an, xj, 
//			xk, xn, xm, xh, 
//			xi

public final class xg
{

	public xg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #41  <Method void Object()>
	//    6   12:putfield        #43  <Field Object b>
		c = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #45  <Field boolean c>
		e = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #47  <Field boolean e>
		f = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #49  <Field boolean f>
	//   16   30:return          
	}

	public static Bitmap a(View view)
	{
		view.setDrawingCacheEnabled(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #56  <Method void View.setDrawingCacheEnabled(boolean)>
		Bitmap bitmap = Bitmap.createBitmap(view.getDrawingCache());
	//    3    5:aload_0         
	//    4    6:invokevirtual   #60  <Method Bitmap View.getDrawingCache()>
	//    5    9:invokestatic    #66  <Method Bitmap Bitmap.createBitmap(Bitmap)>
	//    6   12:astore_1        
		view.setDrawingCacheEnabled(false);
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #56  <Method void View.setDrawingCacheEnabled(boolean)>
		return bitmap;
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	public static Bundle a(bqp bqp1)
	{
		if(bqp1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(aw.i().k().b() && aw.i().k().d())
	//*   4    6:invokestatic    #73  <Method wi aw.i()>
	//*   5    9:invokevirtual   #79  <Method xa com.google.android.gms.internal.ads.wi.k()>
	//*   6   12:invokeinterface #84  <Method boolean com.google.android.gms.internal.ads.xa.b()>
	//*   7   17:ifeq            36
	//*   8   20:invokestatic    #73  <Method wi aw.i()>
	//*   9   23:invokevirtual   #79  <Method xa com.google.android.gms.internal.ads.wi.k()>
	//*  10   26:invokeinterface #86  <Method boolean xa.d()>
	//*  11   31:ifeq            36
			return null;
	//   12   34:aconst_null     
	//   13   35:areturn         
		if(bqp1.d())
	//*  14   36:aload_0         
	//*  15   37:invokevirtual   #89  <Method boolean bqp.d()>
	//*  16   40:ifeq            47
			bqp1.c();
	//   17   43:aload_0         
	//   18   44:invokevirtual   #91  <Method void com.google.android.gms.internal.ads.bqp.c()>
		bqp1 = ((bqp) (bqp1.b()));
	//   19   47:aload_0         
	//   20   48:invokevirtual   #94  <Method bqj com.google.android.gms.internal.ads.bqp.b()>
	//   21   51:astore_0        
		String s;
		String s1;
		if(bqp1 != null)
	//*  22   52:aload_0         
	//*  23   53:ifnull          126
		{
			String s2 = ((bqj) (bqp1)).b();
	//   24   56:aload_0         
	//   25   57:invokevirtual   #99  <Method String com.google.android.gms.internal.ads.bqj.b()>
	//   26   60:astore_3        
			String s3 = ((bqj) (bqp1)).c();
	//   27   61:aload_0         
	//   28   62:invokevirtual   #101 <Method String com.google.android.gms.internal.ads.bqj.c()>
	//   29   65:astore          4
			String s4 = ((bqj) (bqp1)).d();
	//   30   67:aload_0         
	//   31   68:invokevirtual   #103 <Method String bqj.d()>
	//   32   71:astore          5
			if(s2 != null)
	//*  33   73:aload_3         
	//*  34   74:ifnull          89
				aw.i().k().a(s2);
	//   35   77:invokestatic    #73  <Method wi aw.i()>
	//   36   80:invokevirtual   #79  <Method xa com.google.android.gms.internal.ads.wi.k()>
	//   37   83:aload_3         
	//   38   84:invokeinterface #106 <Method void xa.a(String)>
			s1 = s2;
	//   39   89:aload_3         
	//   40   90:astore_2        
			s = s3;
	//   41   91:aload           4
	//   42   93:astore_1        
			bqp1 = ((bqp) (s4));
	//   43   94:aload           5
	//   44   96:astore_0        
			if(s4 != null)
	//*  45   97:aload           5
	//*  46   99:ifnull          152
			{
				aw.i().k().b(s4);
	//   47  102:invokestatic    #73  <Method wi aw.i()>
	//   48  105:invokevirtual   #79  <Method xa com.google.android.gms.internal.ads.wi.k()>
	//   49  108:aload           5
	//   50  110:invokeinterface #108 <Method void com.google.android.gms.internal.ads.xa.b(String)>
				s1 = s2;
	//   51  115:aload_3         
	//   52  116:astore_2        
				s = s3;
	//   53  117:aload           4
	//   54  119:astore_1        
				bqp1 = ((bqp) (s4));
	//   55  120:aload           5
	//   56  122:astore_0        
			}
		} else
	//*  57  123:goto            152
		{
			s1 = aw.i().k().c();
	//   58  126:invokestatic    #73  <Method wi aw.i()>
	//   59  129:invokevirtual   #79  <Method xa com.google.android.gms.internal.ads.wi.k()>
	//   60  132:invokeinterface #109 <Method String com.google.android.gms.internal.ads.xa.c()>
	//   61  137:astore_2        
			bqp1 = ((bqp) (aw.i().k().e()));
	//   62  138:invokestatic    #73  <Method wi aw.i()>
	//   63  141:invokevirtual   #79  <Method xa com.google.android.gms.internal.ads.wi.k()>
	//   64  144:invokeinterface #111 <Method String xa.e()>
	//   65  149:astore_0        
			s = null;
	//   66  150:aconst_null     
	//   67  151:astore_1        
		}
		Bundle bundle = new Bundle(1);
	//   68  152:new             #113 <Class Bundle>
	//   69  155:dup             
	//   70  156:iconst_1        
	//   71  157:invokespecial   #116 <Method void Bundle(int)>
	//   72  160:astore_3        
		if(bqp1 != null && !aw.i().k().d())
	//*  73  161:aload_0         
	//*  74  162:ifnull          186
	//*  75  165:invokestatic    #73  <Method wi aw.i()>
	//*  76  168:invokevirtual   #79  <Method xa com.google.android.gms.internal.ads.wi.k()>
	//*  77  171:invokeinterface #86  <Method boolean xa.d()>
	//*  78  176:ifne            186
			bundle.putString("v_fp_vertical", ((String) (bqp1)));
	//   79  179:aload_3         
	//   80  180:ldc1            #118 <String "v_fp_vertical">
	//   81  182:aload_0         
	//   82  183:invokevirtual   #122 <Method void Bundle.putString(String, String)>
		if(s1 != null && !aw.i().k().b())
	//*  83  186:aload_2         
	//*  84  187:ifnull          226
	//*  85  190:invokestatic    #73  <Method wi aw.i()>
	//*  86  193:invokevirtual   #79  <Method xa com.google.android.gms.internal.ads.wi.k()>
	//*  87  196:invokeinterface #84  <Method boolean com.google.android.gms.internal.ads.xa.b()>
	//*  88  201:ifne            226
		{
			bundle.putString("fingerprint", s1);
	//   89  204:aload_3         
	//   90  205:ldc1            #124 <String "fingerprint">
	//   91  207:aload_2         
	//   92  208:invokevirtual   #122 <Method void Bundle.putString(String, String)>
			if(!s1.equals(((Object) (s))))
	//*  93  211:aload_2         
	//*  94  212:aload_1         
	//*  95  213:invokevirtual   #130 <Method boolean String.equals(Object)>
	//*  96  216:ifne            226
				bundle.putString("v_fp", s);
	//   97  219:aload_3         
	//   98  220:ldc1            #132 <String "v_fp">
	//   99  222:aload_1         
	//  100  223:invokevirtual   #122 <Method void Bundle.putString(String, String)>
		}
		if(!bundle.isEmpty())
	//* 101  226:aload_3         
	//* 102  227:invokevirtual   #135 <Method boolean Bundle.isEmpty()>
	//* 103  230:ifne            235
			return bundle;
	//  104  233:aload_3         
	//  105  234:areturn         
		else
			return null;
	//  106  235:aconst_null     
	//  107  236:areturn         
	}

	public static DisplayMetrics a(WindowManager windowmanager)
	{
		DisplayMetrics displaymetrics = new DisplayMetrics();
	//    0    0:new             #138 <Class DisplayMetrics>
	//    1    3:dup             
	//    2    4:invokespecial   #139 <Method void DisplayMetrics()>
	//    3    7:astore_1        
		windowmanager.getDefaultDisplay().getMetrics(displaymetrics);
	//    4    8:aload_0         
	//    5    9:invokeinterface #145 <Method Display WindowManager.getDefaultDisplay()>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #151 <Method void Display.getMetrics(DisplayMetrics)>
		return displaymetrics;
	//    8   18:aload_1         
	//    9   19:areturn         
	}

	public static WebResourceResponse a(HttpURLConnection httpurlconnection)
	{
		String s;
		String s1;
label0:
		{
			aw.e();
	//    0    0:invokestatic    #155 <Method xg aw.e()>
	//    1    3:pop             
			s = httpurlconnection.getContentType();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #160 <Method String HttpURLConnection.getContentType()>
	//    4    8:astore_2        
			if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   5    9:aload_2         
	//*   6   10:invokestatic    #165 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   13:ifeq            22
				s = "";
	//    8   16:ldc1            #167 <String "">
	//    9   18:astore_2        
			else
	//*  10   19:goto            34
				s = s.split(";")[0].trim();
	//   11   22:aload_2         
	//   12   23:ldc1            #169 <String ";">
	//   13   25:invokevirtual   #173 <Method String[] String.split(String)>
	//   14   28:iconst_0        
	//   15   29:aaload          
	//   16   30:invokevirtual   #176 <Method String String.trim()>
	//   17   33:astore_2        
			aw.e();
	//   18   34:invokestatic    #155 <Method xg aw.e()>
	//   19   37:pop             
			s1 = httpurlconnection.getContentType();
	//   20   38:aload_0         
	//   21   39:invokevirtual   #160 <Method String HttpURLConnection.getContentType()>
	//   22   42:astore_3        
			if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//*  23   43:aload_3         
	//*  24   44:invokestatic    #165 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  25   47:ifne            123
			{
				String as[] = s1.split(";");
	//   26   50:aload_3         
	//   27   51:ldc1            #169 <String ";">
	//   28   53:invokevirtual   #173 <Method String[] String.split(String)>
	//   29   56:astore_3        
				if(as.length != 1)
	//*  30   57:aload_3         
	//*  31   58:arraylength     
	//*  32   59:iconst_1        
	//*  33   60:icmpeq          123
				{
					int i1 = 1;
	//   34   63:iconst_1        
	//   35   64:istore_1        
					do
					{
						if(i1 >= as.length)
							break;
	//   36   65:iload_1         
	//   37   66:aload_3         
	//   38   67:arraylength     
	//   39   68:icmpge          123
						if(as[i1].trim().startsWith("charset"))
	//*  40   71:aload_3         
	//*  41   72:iload_1         
	//*  42   73:aaload          
	//*  43   74:invokevirtual   #176 <Method String String.trim()>
	//*  44   77:ldc1            #178 <String "charset">
	//*  45   79:invokevirtual   #182 <Method boolean String.startsWith(String)>
	//*  46   82:ifeq            116
						{
							String as1[] = as[i1].trim().split("=");
	//   47   85:aload_3         
	//   48   86:iload_1         
	//   49   87:aaload          
	//   50   88:invokevirtual   #176 <Method String String.trim()>
	//   51   91:ldc1            #184 <String "=">
	//   52   93:invokevirtual   #173 <Method String[] String.split(String)>
	//   53   96:astore          4
							if(as1.length > 1)
	//*  54   98:aload           4
	//*  55  100:arraylength     
	//*  56  101:iconst_1        
	//*  57  102:icmple          116
							{
								as = ((String []) (as1[1].trim()));
	//   58  105:aload           4
	//   59  107:iconst_1        
	//   60  108:aaload          
	//   61  109:invokevirtual   #176 <Method String String.trim()>
	//   62  112:astore_3        
								break label0;
	//   63  113:goto            126
							}
						}
						i1++;
	//   64  116:iload_1         
	//   65  117:iconst_1        
	//   66  118:iadd            
	//   67  119:istore_1        
					} while(true);
	//   68  120:goto            65
				}
			}
			as = "";
	//   69  123:ldc1            #167 <String "">
	//   70  125:astore_3        
		}
		Object obj = ((Object) (httpurlconnection.getHeaderFields()));
	//   71  126:aload_0         
	//   72  127:invokevirtual   #188 <Method Map HttpURLConnection.getHeaderFields()>
	//   73  130:astore          5
		HashMap hashmap = new HashMap(((Map) (obj)).size());
	//   74  132:new             #190 <Class HashMap>
	//   75  135:dup             
	//   76  136:aload           5
	//   77  138:invokeinterface #196 <Method int Map.size()>
	//   78  143:invokespecial   #197 <Method void HashMap(int)>
	//   79  146:astore          4
		obj = ((Object) (((Map) (obj)).entrySet().iterator()));
	//   80  148:aload           5
	//   81  150:invokeinterface #201 <Method Set Map.entrySet()>
	//   82  155:invokeinterface #207 <Method Iterator Set.iterator()>
	//   83  160:astore          5
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   84  162:aload           5
	//   85  164:invokeinterface #212 <Method boolean Iterator.hasNext()>
	//   86  169:ifeq            262
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//   87  172:aload           5
	//   88  174:invokeinterface #216 <Method Object Iterator.next()>
	//   89  179:checkcast       #218 <Class java.util.Map$Entry>
	//   90  182:astore          6
			if(entry.getKey() != null && entry.getValue() != null && ((List)entry.getValue()).size() > 0)
	//*  91  184:aload           6
	//*  92  186:invokeinterface #221 <Method Object java.util.Map$Entry.getKey()>
	//*  93  191:ifnull          162
	//*  94  194:aload           6
	//*  95  196:invokeinterface #224 <Method Object java.util.Map$Entry.getValue()>
	//*  96  201:ifnull          162
	//*  97  204:aload           6
	//*  98  206:invokeinterface #224 <Method Object java.util.Map$Entry.getValue()>
	//*  99  211:checkcast       #226 <Class List>
	//* 100  214:invokeinterface #227 <Method int List.size()>
	//* 101  219:ifle            162
				((Map) (hashmap)).put(((Object) ((String)entry.getKey())), ((Object) ((String)((List)entry.getValue()).get(0))));
	//  102  222:aload           4
	//  103  224:aload           6
	//  104  226:invokeinterface #221 <Method Object java.util.Map$Entry.getKey()>
	//  105  231:checkcast       #126 <Class String>
	//  106  234:aload           6
	//  107  236:invokeinterface #224 <Method Object java.util.Map$Entry.getValue()>
	//  108  241:checkcast       #226 <Class List>
	//  109  244:iconst_0        
	//  110  245:invokeinterface #231 <Method Object List.get(int)>
	//  111  250:checkcast       #126 <Class String>
	//  112  253:invokeinterface #235 <Method Object Map.put(Object, Object)>
	//  113  258:pop             
		} while(true);
	//  114  259:goto            162
		return aw.g().a(s, ((String) (as)), httpurlconnection.getResponseCode(), httpurlconnection.getResponseMessage(), ((Map) (hashmap)), httpurlconnection.getInputStream());
	//  115  262:invokestatic    #238 <Method xo aw.g()>
	//  116  265:aload_2         
	//  117  266:aload_3         
	//  118  267:aload_0         
	//  119  268:invokevirtual   #241 <Method int HttpURLConnection.getResponseCode()>
	//  120  271:aload_0         
	//  121  272:invokevirtual   #244 <Method String HttpURLConnection.getResponseMessage()>
	//  122  275:aload           4
	//  123  277:aload_0         
	//  124  278:invokevirtual   #248 <Method java.io.InputStream HttpURLConnection.getInputStream()>
	//  125  281:invokevirtual   #253 <Method WebResourceResponse xo.a(String, String, int, String, Map, java.io.InputStream)>
	//  126  284:areturn         
	}

	public static PopupWindow a(View view, int i1, int j1, boolean flag)
	{
		return new PopupWindow(view, i1, j1, false);
	//    0    0:new             #256 <Class PopupWindow>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iconst_0        
	//    6    8:invokespecial   #259 <Method void PopupWindow(View, int, int, boolean)>
	//    7   11:areturn         
	}

	static Object a(xg xg1)
	{
		return xg1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object b>
	//    2    4:areturn         
	}

	public static String a()
	{
		return UUID.randomUUID().toString();
	//    0    0:invokestatic    #266 <Method UUID UUID.randomUUID()>
	//    1    3:invokevirtual   #269 <Method String UUID.toString()>
	//    2    6:areturn         
	}

	public static String a(Context context, View view, zzwf zzwf1)
	{
		e e1 = p.ab;
	//    0    0:getstatic       #278 <Field e p.ab>
	//    1    3:astore          4
		if(!((Boolean)bwk.e().a(e1)).booleanValue())
	//*   2    5:invokestatic    #283 <Method m bwk.e()>
	//*   3    8:aload           4
	//*   4   10:invokevirtual   #288 <Method Object m.a(e)>
	//*   5   13:checkcast       #290 <Class Boolean>
	//*   6   16:invokevirtual   #293 <Method boolean Boolean.booleanValue()>
	//*   7   19:ifne            24
			return null;
	//    8   22:aconst_null     
	//    9   23:areturn         
		JSONObject jsonobject;
		jsonobject = new JSONObject();
	//   10   24:new             #295 <Class JSONObject>
	//   11   27:dup             
	//   12   28:invokespecial   #296 <Method void JSONObject()>
	//   13   31:astore          4
		JSONObject jsonobject1 = new JSONObject();
	//   14   33:new             #295 <Class JSONObject>
	//   15   36:dup             
	//   16   37:invokespecial   #296 <Method void JSONObject()>
	//   17   40:astore          5
		jsonobject1.put("width", zzwf1.e);
	//   18   42:aload           5
	//   19   44:ldc2            #298 <String "width">
	//   20   47:aload_2         
	//   21   48:getfield        #303 <Field int zzwf.e>
	//   22   51:invokevirtual   #306 <Method JSONObject JSONObject.put(String, int)>
	//   23   54:pop             
		jsonobject1.put("height", zzwf1.b);
	//   24   55:aload           5
	//   25   57:ldc2            #308 <String "height">
	//   26   60:aload_2         
	//   27   61:getfield        #310 <Field int com.google.android.gms.internal.ads.zzwf.b>
	//   28   64:invokevirtual   #306 <Method JSONObject JSONObject.put(String, int)>
	//   29   67:pop             
		jsonobject.put("size", ((Object) (jsonobject1)));
	//   30   68:aload           4
	//   31   70:ldc2            #311 <String "size">
	//   32   73:aload           5
	//   33   75:invokevirtual   #314 <Method JSONObject JSONObject.put(String, Object)>
	//   34   78:pop             
		jsonobject.put("activity", ((Object) (p(context))));
	//   35   79:aload           4
	//   36   81:ldc2            #316 <String "activity">
	//   37   84:aload_0         
	//   38   85:invokestatic    #320 <Method String p(Context)>
	//   39   88:invokevirtual   #314 <Method JSONObject JSONObject.put(String, Object)>
	//   40   91:pop             
		if(zzwf1.d) goto _L2; else goto _L1
	//   41   92:aload_2         
	//   42   93:getfield        #322 <Field boolean zzwf.d>
	//   43   96:ifne            212
_L1:
		context = ((Context) (new JSONArray()));
	//   44   99:new             #324 <Class JSONArray>
	//   45  102:dup             
	//   46  103:invokespecial   #325 <Method void JSONArray()>
	//   47  106:astore_0        
_L8:
		if(view == null) goto _L4; else goto _L3
	//   48  107:aload_1         
	//   49  108:ifnull          195
_L3:
		int i1;
		try
		{
			zzwf1 = ((zzwf) (view.getParent()));
	//   50  111:aload_1         
	//   51  112:invokevirtual   #329 <Method ViewParent View.getParent()>
	//   52  115:astore_2        
		}
	//*  53  116:aload_2         
	//*  54  117:ifnull          176
	//*  55  120:iconst_m1       
	//*  56  121:istore_3        
	//*  57  122:aload_2         
	//*  58  123:instanceof      #331 <Class ViewGroup>
	//*  59  126:ifeq            138
	//*  60  129:aload_2         
	//*  61  130:checkcast       #331 <Class ViewGroup>
	//*  62  133:aload_1         
	//*  63  134:invokevirtual   #335 <Method int ViewGroup.indexOfChild(View)>
	//*  64  137:istore_3        
	//*  65  138:new             #295 <Class JSONObject>
	//*  66  141:dup             
	//*  67  142:invokespecial   #296 <Method void JSONObject()>
	//*  68  145:astore_1        
	//*  69  146:aload_1         
	//*  70  147:ldc2            #337 <String "type">
	//*  71  150:aload_2         
	//*  72  151:invokevirtual   #341 <Method Class Object.getClass()>
	//*  73  154:invokevirtual   #346 <Method String Class.getName()>
	//*  74  157:invokevirtual   #314 <Method JSONObject JSONObject.put(String, Object)>
	//*  75  160:pop             
	//*  76  161:aload_1         
	//*  77  162:ldc2            #348 <String "index_of_child">
	//*  78  165:iload_3         
	//*  79  166:invokevirtual   #306 <Method JSONObject JSONObject.put(String, int)>
	//*  80  169:pop             
	//*  81  170:aload_0         
	//*  82  171:aload_1         
	//*  83  172:invokevirtual   #351 <Method JSONArray JSONArray.put(Object)>
	//*  84  175:pop             
	//*  85  176:aload_2         
	//*  86  177:ifnull          230
	//*  87  180:aload_2         
	//*  88  181:instanceof      #52  <Class View>
	//*  89  184:ifeq            230
	//*  90  187:aload_2         
	//*  91  188:checkcast       #52  <Class View>
	//*  92  191:astore_1        
	//*  93  192:goto            107
	//*  94  195:aload_0         
	//*  95  196:invokevirtual   #354 <Method int JSONArray.length()>
	//*  96  199:ifle            212
	//*  97  202:aload           4
	//*  98  204:ldc2            #356 <String "parents">
	//*  99  207:aload_0         
	//* 100  208:invokevirtual   #314 <Method JSONObject JSONObject.put(String, Object)>
	//* 101  211:pop             
	//* 102  212:aload           4
	//* 103  214:invokevirtual   #357 <Method String JSONObject.toString()>
	//* 104  217:astore_0        
	//* 105  218:aload_0         
	//* 106  219:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 107  220:astore_0        
		{
			com.google.android.gms.internal.ads.wx.c("Fail to get view hierarchy json", ((Throwable) (context)));
	//  108  221:ldc2            #359 <String "Fail to get view hierarchy json">
	//  109  224:aload_0         
	//  110  225:invokestatic    #364 <Method void com.google.android.gms.internal.ads.wx.c(String, Throwable)>
			return null;
	//  111  228:aconst_null     
	//  112  229:areturn         
		}
		if(zzwf1 == null)
			break MISSING_BLOCK_LABEL_176;
		i1 = -1;
		if(zzwf1 instanceof ViewGroup)
			i1 = ((ViewGroup)zzwf1).indexOfChild(view);
		view = ((View) (new JSONObject()));
		((JSONObject) (view)).put("type", ((Object) (((Object) (zzwf1)).getClass().getName())));
		((JSONObject) (view)).put("index_of_child", i1);
		((JSONArray) (context)).put(((Object) (view)));
		if(zzwf1 == null) goto _L6; else goto _L5
_L5:
		if(zzwf1 instanceof View)
		{
			view = (View)zzwf1;
			continue; /* Loop/switch isn't completed */
		}
		  goto _L6
_L4:
		if(((JSONArray) (context)).length() > 0)
			jsonobject.put("parents", ((Object) (context)));
_L2:
		context = ((Context) (jsonobject.toString()));
		return ((String) (context));
_L6:
		view = null;
	//  113  230:aconst_null     
	//  114  231:astore_1        
		if(true) goto _L8; else goto _L7
	//  115  232:goto            107
_L7:
	}

	static String a(xg xg1, String s)
	{
		xg1.d = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #367 <Field String d>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	public static String a(InputStreamReader inputstreamreader)
	{
		StringBuilder stringbuilder = new StringBuilder(8192);
	//    0    0:new             #370 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          8192
	//    3    7:invokespecial   #371 <Method void StringBuilder(int)>
	//    4   10:astore_2        
		char ac[] = new char[2048];
	//    5   11:sipush          2048
	//    6   14:newarray        char[]
	//    7   16:astore_3        
		do
		{
			int i1 = inputstreamreader.read(ac);
	//    8   17:aload_0         
	//    9   18:aload_3         
	//   10   19:invokevirtual   #377 <Method int InputStreamReader.read(char[])>
	//   11   22:istore_1        
			if(i1 != -1)
	//*  12   23:iload_1         
	//*  13   24:iconst_m1       
	//*  14   25:icmpeq          39
				stringbuilder.append(ac, 0, i1);
	//   15   28:aload_2         
	//   16   29:aload_3         
	//   17   30:iconst_0        
	//   18   31:iload_1         
	//   19   32:invokevirtual   #381 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   20   35:pop             
			else
	//*  21   36:goto            17
				return stringbuilder.toString();
	//   22   39:aload_2         
	//   23   40:invokevirtual   #382 <Method String StringBuilder.toString()>
	//   24   43:areturn         
		} while(true);
	}

	public static String a(String s)
	{
		return Uri.parse(s).buildUpon().query(((String) (null))).build().toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #389 <Method Uri Uri.parse(String)>
	//    2    4:invokevirtual   #393 <Method android.net.Uri$Builder Uri.buildUpon()>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #399 <Method android.net.Uri$Builder android.net.Uri$Builder.query(String)>
	//    5   11:invokevirtual   #403 <Method Uri android.net.Uri$Builder.build()>
	//    6   14:invokevirtual   #404 <Method String Uri.toString()>
	//    7   17:areturn         
	}

	public static Map a(Uri uri)
	{
		if(uri == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		HashMap hashmap = new HashMap();
	//    4    6:new             #190 <Class HashMap>
	//    5    9:dup             
	//    6   10:invokespecial   #406 <Method void HashMap()>
	//    7   13:astore_1        
		String s;
		for(Iterator iterator = aw.g().a(uri).iterator(); iterator.hasNext(); hashmap.put(((Object) (s)), ((Object) (uri.getQueryParameter(s)))))
	//*   8   14:invokestatic    #238 <Method xo aw.g()>
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #409 <Method Set xo.a(Uri)>
	//*  11   21:invokeinterface #207 <Method Iterator Set.iterator()>
	//*  12   26:astore_2        
	//*  13   27:aload_2         
	//*  14   28:invokeinterface #212 <Method boolean Iterator.hasNext()>
	//*  15   33:ifeq            60
			s = (String)iterator.next();
	//   16   36:aload_2         
	//   17   37:invokeinterface #216 <Method Object Iterator.next()>
	//   18   42:checkcast       #126 <Class String>
	//   19   45:astore_3        

	//   20   46:aload_1         
	//   21   47:aload_3         
	//   22   48:aload_0         
	//   23   49:aload_3         
	//   24   50:invokevirtual   #412 <Method String Uri.getQueryParameter(String)>
	//   25   53:invokevirtual   #413 <Method Object HashMap.put(Object, Object)>
	//   26   56:pop             
	//*  27   57:goto            27
		return ((Map) (hashmap));
	//   28   60:aload_1         
	//   29   61:areturn         
	}

	private final JSONArray a(Collection collection)
	{
		JSONArray jsonarray = new JSONArray();
	//    0    0:new             #324 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #325 <Method void JSONArray()>
	//    3    7:astore_2        
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); a(jsonarray, ((Iterator) (collection)).next()));
	//    4    8:aload_1         
	//    5    9:invokeinterface #417 <Method Iterator Collection.iterator()>
	//    6   14:astore_1        
	//    7   15:aload_1         
	//    8   16:invokeinterface #212 <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            38
	//   10   24:aload_0         
	//   11   25:aload_2         
	//   12   26:aload_1         
	//   13   27:invokeinterface #216 <Method Object Iterator.next()>
	//   14   32:invokespecial   #420 <Method void a(JSONArray, Object)>
	//*  15   35:goto            15
		return jsonarray;
	//   16   38:aload_2         
	//   17   39:areturn         
	}

	private final JSONObject a(Bundle bundle)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #295 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #296 <Method void JSONObject()>
	//    3    7:astore_2        
		String s;
		for(Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); a(jsonobject, s, bundle.get(s)))
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #424 <Method Set Bundle.keySet()>
	//*   6   12:invokeinterface #207 <Method Iterator Set.iterator()>
	//*   7   17:astore_3        
	//*   8   18:aload_3         
	//*   9   19:invokeinterface #212 <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            54
			s = (String)iterator.next();
	//   11   27:aload_3         
	//   12   28:invokeinterface #216 <Method Object Iterator.next()>
	//   13   33:checkcast       #126 <Class String>
	//   14   36:astore          4

	//   15   38:aload_0         
	//   16   39:aload_2         
	//   17   40:aload           4
	//   18   42:aload_1         
	//   19   43:aload           4
	//   20   45:invokevirtual   #427 <Method Object Bundle.get(String)>
	//   21   48:invokespecial   #430 <Method void a(JSONObject, String, Object)>
	//*  22   51:goto            18
		return jsonobject;
	//   23   54:aload_2         
	//   24   55:areturn         
	}

	public static void a(Context context, Intent intent)
	{
		Throwable throwable;
		try
		{
			context.startActivity(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #439 <Method void Context.startActivity(Intent)>
			return;
	//    3    5:return          
		}
	//*   4    6:aload_1         
	//*   5    7:ldc2            #440 <Int 0x10000000>
	//*   6   10:invokevirtual   #446 <Method Intent Intent.addFlags(int)>
	//*   7   13:pop             
	//*   8   14:aload_0         
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #439 <Method void Context.startActivity(Intent)>
	//*  11   19:return          
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			intent.addFlags(0x10000000);
		}
		context.startActivity(intent);
	//*  12   20:astore_2        
	//*  13   21:goto            6
	}

	public static void a(Context context, Uri uri)
	{
		try
		{
			Intent intent = new Intent("android.intent.action.VIEW", uri);
	//    0    0:new             #442 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc2            #453 <String "android.intent.action.VIEW">
	//    3    7:aload_1         
	//    4    8:invokespecial   #456 <Method void Intent(String, Uri)>
	//    5   11:astore_2        
			Bundle bundle = new Bundle();
	//    6   12:new             #113 <Class Bundle>
	//    7   15:dup             
	//    8   16:invokespecial   #457 <Method void Bundle()>
	//    9   19:astore_3        
			intent.putExtras(bundle);
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:invokevirtual   #461 <Method Intent Intent.putExtras(Bundle)>
	//   13   25:pop             
			b(context, intent);
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:invokestatic    #463 <Method void b(Context, Intent)>
			bundle.putString("com.android.browser.application_id", context.getPackageName());
	//   17   31:aload_3         
	//   18   32:ldc2            #465 <String "com.android.browser.application_id">
	//   19   35:aload_0         
	//   20   36:invokevirtual   #468 <Method String Context.getPackageName()>
	//   21   39:invokevirtual   #122 <Method void Bundle.putString(String, String)>
			context.startActivity(intent);
	//   22   42:aload_0         
	//   23   43:aload_2         
	//   24   44:invokevirtual   #439 <Method void Context.startActivity(Intent)>
			context = ((Context) (uri.toString()));
	//   25   47:aload_1         
	//   26   48:invokevirtual   #404 <Method String Uri.toString()>
	//   27   51:astore_0        
			uri = ((Uri) (new StringBuilder(String.valueOf(((Object) (context))).length() + 26)));
	//   28   52:new             #370 <Class StringBuilder>
	//   29   55:dup             
	//   30   56:aload_0         
	//   31   57:invokestatic    #472 <Method String String.valueOf(Object)>
	//   32   60:invokevirtual   #473 <Method int String.length()>
	//   33   63:bipush          26
	//   34   65:iadd            
	//   35   66:invokespecial   #371 <Method void StringBuilder(int)>
	//   36   69:astore_1        
			((StringBuilder) (uri)).append("Opening ");
	//   37   70:aload_1         
	//   38   71:ldc2            #475 <String "Opening ">
	//   39   74:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   40   77:pop             
			((StringBuilder) (uri)).append(((String) (context)));
	//   41   78:aload_1         
	//   42   79:aload_0         
	//   43   80:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   44   83:pop             
			((StringBuilder) (uri)).append(" in a new browser.");
	//   45   84:aload_1         
	//   46   85:ldc2            #480 <String " in a new browser.">
	//   47   88:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   48   91:pop             
			com.google.android.gms.internal.ads.wx.b(((StringBuilder) (uri)).toString());
	//   49   92:aload_1         
	//   50   93:invokevirtual   #382 <Method String StringBuilder.toString()>
	//   51   96:invokestatic    #481 <Method void com.google.android.gms.internal.ads.wx.b(String)>
			return;
	//   52   99:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  53  100:astore_0        
		{
			com.google.android.gms.internal.ads.wx.b("No browser is found.", ((Throwable) (context)));
	//   54  101:ldc2            #483 <String "No browser is found.">
	//   55  104:aload_0         
	//   56  105:invokestatic    #485 <Method void com.google.android.gms.internal.ads.wx.b(String, Throwable)>
		}
	//   57  108:return          
	}

	public static void a(Context context, String s, String s1)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #489 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #490 <Method void ArrayList()>
	//    3    7:astore_3        
		((List) (arraylist)).add(((Object) (s1)));
	//    4    8:aload_3         
	//    5    9:aload_2         
	//    6   10:invokeinterface #493 <Method boolean List.add(Object)>
	//    7   15:pop             
		a(context, s, ((List) (arraylist)));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aload_3         
	//   11   19:invokestatic    #496 <Method void a(Context, String, List)>
	//   12   22:return          
	}

	public static void a(Context context, String s, List list)
	{
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((wt) (new zj(context, s, (String)((Iterator) (list)).next()))).c());
	//    0    0:aload_2         
	//    1    1:invokeinterface #497 <Method Iterator List.iterator()>
	//    2    6:astore_2        
	//    3    7:aload_2         
	//    4    8:invokeinterface #212 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            41
	//    6   16:new             #499 <Class zj>
	//    7   19:dup             
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:aload_2         
	//   11   23:invokeinterface #216 <Method Object Iterator.next()>
	//   12   28:checkcast       #126 <Class String>
	//   13   31:invokespecial   #501 <Method void zj(Context, String, String)>
	//   14   34:invokevirtual   #505 <Method Object com.google.android.gms.internal.ads.wt.c()>
	//   15   37:pop             
	//*  16   38:goto            7
	//   17   41:return          
	}

	public static void a(Context context, Throwable throwable)
	{
		boolean flag;
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		boolean flag1;
		e e1 = p.d;
	//    5    7:getstatic       #510 <Field e p.d>
	//    6   10:astore          4
		flag1 = ((Boolean)bwk.e().a(e1)).booleanValue();
	//    7   12:invokestatic    #283 <Method m bwk.e()>
	//    8   15:aload           4
	//    9   17:invokevirtual   #288 <Method Object m.a(e)>
	//   10   20:checkcast       #290 <Class Boolean>
	//   11   23:invokevirtual   #293 <Method boolean Boolean.booleanValue()>
	//   12   26:istore_3        
		flag = flag1;
	//   13   27:iload_3         
	//   14   28:istore_2        
_L2:
		if(flag)
	//*  15   29:iload_2         
	//*  16   30:ifeq            39
			com.google.android.gms.common.util.g.a(context, throwable);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:invokestatic    #515 <Method boolean g.a(Context, Throwable)>
	//   20   38:pop             
		return;
	//   21   39:return          
		IllegalStateException illegalstateexception;
		illegalstateexception;
	//   22   40:astore          4
		if(true) goto _L2; else goto _L1
	//   23   42:goto            29
_L1:
	}

	public static void a(Runnable runnable)
	{
		if(Looper.getMainLooper().getThread() != Thread.currentThread())
	//*   0    0:invokestatic    #32  <Method Looper Looper.getMainLooper()>
	//*   1    3:invokevirtual   #520 <Method Thread Looper.getThread()>
	//*   2    6:invokestatic    #525 <Method Thread Thread.currentThread()>
	//*   3    9:if_acmpeq       19
		{
			runnable.run();
	//    4   12:aload_0         
	//    5   13:invokeinterface #530 <Method void Runnable.run()>
			return;
	//    6   18:return          
		} else
		{
			xe.a(runnable);
	//    7   19:aload_0         
	//    8   20:invokestatic    #535 <Method abe xe.a(Runnable)>
	//    9   23:pop             
			return;
	//   10   24:return          
		}
	}

	private final void a(JSONArray jsonarray, Object obj)
	{
		if(obj instanceof Bundle)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #113 <Class Bundle>
	//*   2    4:ifeq            21
		{
			jsonarray.put(((Object) (a((Bundle)obj))));
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:checkcast       #113 <Class Bundle>
	//    7   13:invokespecial   #537 <Method JSONObject a(Bundle)>
	//    8   16:invokevirtual   #351 <Method JSONArray JSONArray.put(Object)>
	//    9   19:pop             
			return;
	//   10   20:return          
		}
		if(obj instanceof Map)
	//*  11   21:aload_2         
	//*  12   22:instanceof      #192 <Class Map>
	//*  13   25:ifeq            42
		{
			jsonarray.put(((Object) (a((Map)obj))));
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:checkcast       #192 <Class Map>
	//   18   34:invokevirtual   #540 <Method JSONObject a(Map)>
	//   19   37:invokevirtual   #351 <Method JSONArray JSONArray.put(Object)>
	//   20   40:pop             
			return;
	//   21   41:return          
		}
		if(obj instanceof Collection)
	//*  22   42:aload_2         
	//*  23   43:instanceof      #416 <Class Collection>
	//*  24   46:ifeq            63
		{
			jsonarray.put(((Object) (a((Collection)obj))));
	//   25   49:aload_1         
	//   26   50:aload_0         
	//   27   51:aload_2         
	//   28   52:checkcast       #416 <Class Collection>
	//   29   55:invokespecial   #542 <Method JSONArray a(Collection)>
	//   30   58:invokevirtual   #351 <Method JSONArray JSONArray.put(Object)>
	//   31   61:pop             
			return;
	//   32   62:return          
		}
		if(obj instanceof Object[])
	//*  33   63:aload_2         
	//*  34   64:instanceof      #544 <Class Object[]>
	//*  35   67:ifeq            120
		{
			obj = ((Object) ((Object[])obj));
	//   36   70:aload_2         
	//   37   71:checkcast       #544 <Class Object[]>
	//   38   74:astore_2        
			JSONArray jsonarray1 = new JSONArray();
	//   39   75:new             #324 <Class JSONArray>
	//   40   78:dup             
	//   41   79:invokespecial   #325 <Method void JSONArray()>
	//   42   82:astore          5
			int j1 = obj.length;
	//   43   84:aload_2         
	//   44   85:arraylength     
	//   45   86:istore          4
			for(int i1 = 0; i1 < j1; i1++)
	//*  46   88:iconst_0        
	//*  47   89:istore_3        
	//*  48   90:iload_3         
	//*  49   91:iload           4
	//*  50   93:icmpge          112
				a(jsonarray1, ((Object) (obj[i1])));
	//   51   96:aload_0         
	//   52   97:aload           5
	//   53   99:aload_2         
	//   54  100:iload_3         
	//   55  101:aaload          
	//   56  102:invokespecial   #420 <Method void a(JSONArray, Object)>

	//   57  105:iload_3         
	//   58  106:iconst_1        
	//   59  107:iadd            
	//   60  108:istore_3        
	//*  61  109:goto            90
			jsonarray.put(((Object) (jsonarray1)));
	//   62  112:aload_1         
	//   63  113:aload           5
	//   64  115:invokevirtual   #351 <Method JSONArray JSONArray.put(Object)>
	//   65  118:pop             
			return;
	//   66  119:return          
		} else
		{
			jsonarray.put(obj);
	//   67  120:aload_1         
	//   68  121:aload_2         
	//   69  122:invokevirtual   #351 <Method JSONArray JSONArray.put(Object)>
	//   70  125:pop             
			return;
	//   71  126:return          
		}
	}

	private final void a(JSONObject jsonobject, String s, Object obj)
	{
		if(obj instanceof Bundle)
	//*   0    0:aload_3         
	//*   1    1:instanceof      #113 <Class Bundle>
	//*   2    4:ifeq            22
		{
			jsonobject.put(s, ((Object) (a((Bundle)obj))));
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:checkcast       #113 <Class Bundle>
	//    8   14:invokespecial   #537 <Method JSONObject a(Bundle)>
	//    9   17:invokevirtual   #314 <Method JSONObject JSONObject.put(String, Object)>
	//   10   20:pop             
			return;
	//   11   21:return          
		}
		if(obj instanceof Map)
	//*  12   22:aload_3         
	//*  13   23:instanceof      #192 <Class Map>
	//*  14   26:ifeq            44
		{
			jsonobject.put(s, ((Object) (a((Map)obj))));
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:aload_0         
	//   18   32:aload_3         
	//   19   33:checkcast       #192 <Class Map>
	//   20   36:invokevirtual   #540 <Method JSONObject a(Map)>
	//   21   39:invokevirtual   #314 <Method JSONObject JSONObject.put(String, Object)>
	//   22   42:pop             
			return;
	//   23   43:return          
		}
		if(obj instanceof Collection)
	//*  24   44:aload_3         
	//*  25   45:instanceof      #416 <Class Collection>
	//*  26   48:ifeq            77
		{
			if(s == null)
	//*  27   51:aload_2         
	//*  28   52:ifnull          58
	//*  29   55:goto            62
				s = "null";
	//   30   58:ldc2            #546 <String "null">
	//   31   61:astore_2        
			jsonobject.put(s, ((Object) (a((Collection)obj))));
	//   32   62:aload_1         
	//   33   63:aload_2         
	//   34   64:aload_0         
	//   35   65:aload_3         
	//   36   66:checkcast       #416 <Class Collection>
	//   37   69:invokespecial   #542 <Method JSONArray a(Collection)>
	//   38   72:invokevirtual   #314 <Method JSONObject JSONObject.put(String, Object)>
	//   39   75:pop             
			return;
	//   40   76:return          
		}
		if(obj instanceof Object[])
	//*  41   77:aload_3         
	//*  42   78:instanceof      #544 <Class Object[]>
	//*  43   81:ifeq            102
		{
			jsonobject.put(s, ((Object) (a(((Collection) (Arrays.asList((Object[])obj)))))));
	//   44   84:aload_1         
	//   45   85:aload_2         
	//   46   86:aload_0         
	//   47   87:aload_3         
	//   48   88:checkcast       #544 <Class Object[]>
	//   49   91:invokestatic    #552 <Method List Arrays.asList(Object[])>
	//   50   94:invokespecial   #542 <Method JSONArray a(Collection)>
	//   51   97:invokevirtual   #314 <Method JSONObject JSONObject.put(String, Object)>
	//   52  100:pop             
			return;
	//   53  101:return          
		} else
		{
			jsonobject.put(s, obj);
	//   54  102:aload_1         
	//   55  103:aload_2         
	//   56  104:aload_3         
	//   57  105:invokevirtual   #314 <Method JSONObject JSONObject.put(String, Object)>
	//   58  108:pop             
			return;
	//   59  109:return          
		}
	}

	private static boolean a(int i1, int j1, int k1)
	{
		return Math.abs(i1 - j1) <= k1;
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:isub            
	//    3    3:invokestatic    #559 <Method int Math.abs(int)>
	//    4    6:iload_2         
	//    5    7:icmpgt          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public static boolean a(Activity activity, Configuration configuration)
	{
		e e1 = p.cs;
	//    0    0:getstatic       #564 <Field e p.cs>
	//    1    3:astore          10
		if(((Boolean)bwk.e().a(e1)).booleanValue())
	//*   2    5:invokestatic    #283 <Method m bwk.e()>
	//*   3    8:aload           10
	//*   4   10:invokevirtual   #288 <Method Object m.a(e)>
	//*   5   13:checkcast       #290 <Class Boolean>
	//*   6   16:invokevirtual   #293 <Method boolean Boolean.booleanValue()>
	//*   7   19:ifeq            33
			return !activity.isInMultiWindowMode();
	//    8   22:aload_0         
	//    9   23:invokevirtual   #569 <Method boolean Activity.isInMultiWindowMode()>
	//   10   26:ifne            31
	//   11   29:iconst_1        
	//   12   30:ireturn         
	//   13   31:iconst_0        
	//   14   32:ireturn         
		bwk.a();
	//   15   33:invokestatic    #572 <Method zv bwk.a()>
	//   16   36:pop             
		int j1 = zv.a(((Context) (activity)), configuration.screenHeightDp);
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:getfield        #577 <Field int Configuration.screenHeightDp>
	//   20   42:invokestatic    #582 <Method int zv.a(Context, int)>
	//   21   45:istore          5
		int k1 = zv.a(((Context) (activity)), configuration.screenWidthDp);
	//   22   47:aload_0         
	//   23   48:aload_1         
	//   24   49:getfield        #585 <Field int Configuration.screenWidthDp>
	//   25   52:invokestatic    #582 <Method int zv.a(Context, int)>
	//   26   55:istore          6
		configuration = ((Configuration) (a((WindowManager)activity.getApplicationContext().getSystemService("window"))));
	//   27   57:aload_0         
	//   28   58:invokevirtual   #589 <Method Context Activity.getApplicationContext()>
	//   29   61:ldc2            #591 <String "window">
	//   30   64:invokevirtual   #594 <Method Object Context.getSystemService(String)>
	//   31   67:checkcast       #141 <Class WindowManager>
	//   32   70:invokestatic    #596 <Method DisplayMetrics a(WindowManager)>
	//   33   73:astore_1        
		int l1 = ((DisplayMetrics) (configuration)).heightPixels;
	//   34   74:aload_1         
	//   35   75:getfield        #599 <Field int DisplayMetrics.heightPixels>
	//   36   78:istore          7
		int i2 = ((DisplayMetrics) (configuration)).widthPixels;
	//   37   80:aload_1         
	//   38   81:getfield        #602 <Field int DisplayMetrics.widthPixels>
	//   39   84:istore          8
		int i1 = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
	//   40   86:aload_0         
	//   41   87:invokevirtual   #606 <Method Resources Activity.getResources()>
	//   42   90:ldc2            #608 <String "status_bar_height">
	//   43   93:ldc2            #610 <String "dimen">
	//   44   96:ldc2            #612 <String "android">
	//   45   99:invokevirtual   #618 <Method int Resources.getIdentifier(String, String, String)>
	//   46  102:istore          4
		if(i1 > 0)
	//*  47  104:iload           4
	//*  48  106:ifle            123
			i1 = activity.getResources().getDimensionPixelSize(i1);
	//   49  109:aload_0         
	//   50  110:invokevirtual   #606 <Method Resources Activity.getResources()>
	//   51  113:iload           4
	//   52  115:invokevirtual   #621 <Method int Resources.getDimensionPixelSize(int)>
	//   53  118:istore          4
		else
	//*  54  120:goto            126
			i1 = 0;
	//   55  123:iconst_0        
	//   56  124:istore          4
		double d1 = activity.getResources().getDisplayMetrics().density;
	//   57  126:aload_0         
	//   58  127:invokevirtual   #606 <Method Resources Activity.getResources()>
	//   59  130:invokevirtual   #625 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   60  133:getfield        #629 <Field float DisplayMetrics.density>
	//   61  136:f2d             
	//   62  137:dstore_2        
		Double.isNaN(d1);
	//   63  138:dload_2         
	//   64  139:invokestatic    #635 <Method boolean Double.isNaN(double)>
	//   65  142:pop             
		int j2 = (int)Math.round(d1 + 0.5D);
	//   66  143:dload_2         
	//   67  144:ldc2w           #636 <Double 0.5D>
	//   68  147:dadd            
	//   69  148:invokestatic    #641 <Method long Math.round(double)>
	//   70  151:l2i             
	//   71  152:istore          9
		activity = ((Activity) (p.cp));
	//   72  154:getstatic       #644 <Field e p.cp>
	//   73  157:astore_0        
		j2 *= ((Integer)bwk.e().a(((e) (activity)))).intValue();
	//   74  158:iload           9
	//   75  160:invokestatic    #283 <Method m bwk.e()>
	//   76  163:aload_0         
	//   77  164:invokevirtual   #288 <Method Object m.a(e)>
	//   78  167:checkcast       #646 <Class Integer>
	//   79  170:invokevirtual   #649 <Method int Integer.intValue()>
	//   80  173:imul            
	//   81  174:istore          9
		return a(l1, j1 + i1, j2) && a(i2, k1, j2);
	//   82  176:iload           7
	//   83  178:iload           5
	//   84  180:iload           4
	//   85  182:iadd            
	//   86  183:iload           9
	//   87  185:invokestatic    #651 <Method boolean a(int, int, int)>
	//   88  188:ifeq            205
	//   89  191:iload           8
	//   90  193:iload           6
	//   91  195:iload           9
	//   92  197:invokestatic    #651 <Method boolean a(int, int, int)>
	//   93  200:ifeq            205
	//   94  203:iconst_1        
	//   95  204:ireturn         
	//   96  205:iconst_0        
	//   97  206:ireturn         
	}

	public static boolean a(Context context)
	{
		Object obj = ((Object) (tk.a(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #659 <Method Context tk.a(Context)>
	//    2    4:astore_2        
		context = ((Context) (new Intent()));
	//    3    5:new             #442 <Class Intent>
	//    4    8:dup             
	//    5    9:invokespecial   #660 <Method void Intent()>
	//    6   12:astore_0        
		((Intent) (context)).setClassName(((Context) (obj)), "com.google.android.gms.ads.AdActivity");
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:ldc2            #662 <String "com.google.android.gms.ads.AdActivity">
	//   10   18:invokevirtual   #666 <Method Intent Intent.setClassName(Context, String)>
	//   11   21:pop             
		obj = ((Object) (((Context) (obj)).getPackageManager()));
	//   12   22:aload_2         
	//   13   23:invokevirtual   #670 <Method PackageManager Context.getPackageManager()>
	//   14   26:astore_2        
		try
		{
			context = ((Context) (((PackageManager) (obj)).resolveActivity(((Intent) (context)), 0x10000)));
	//   15   27:aload_2         
	//   16   28:aload_0         
	//   17   29:ldc2            #671 <Int 0x10000>
	//   18   32:invokevirtual   #677 <Method ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//   19   35:astore_0        
		}
	//*  20   36:aload_0         
	//*  21   37:ifnull          300
	//*  22   40:aload_0         
	//*  23   41:getfield        #683 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  24   44:ifnonnull       50
	//*  25   47:goto            300
	//*  26   50:aload_0         
	//*  27   51:getfield        #683 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  28   54:getfield        #688 <Field int ActivityInfo.configChanges>
	//*  29   57:bipush          16
	//*  30   59:iand            
	//*  31   60:ifne            87
	//*  32   63:ldc2            #690 <String "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".">
	//*  33   66:iconst_1        
	//*  34   67:anewarray       Object[]
	//*  35   70:dup             
	//*  36   71:iconst_0        
	//*  37   72:ldc2            #692 <String "keyboard">
	//*  38   75:aastore         
	//*  39   76:invokestatic    #696 <Method String String.format(String, Object[])>
	//*  40   79:invokestatic    #698 <Method void wx.e(String)>
	//*  41   82:iconst_0        
	//*  42   83:istore_1        
	//*  43   84:goto            89
	//*  44   87:iconst_1        
	//*  45   88:istore_1        
	//*  46   89:aload_0         
	//*  47   90:getfield        #683 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  48   93:getfield        #688 <Field int ActivityInfo.configChanges>
	//*  49   96:bipush          32
	//*  50   98:iand            
	//*  51   99:ifne            123
	//*  52  102:ldc2            #690 <String "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".">
	//*  53  105:iconst_1        
	//*  54  106:anewarray       Object[]
	//*  55  109:dup             
	//*  56  110:iconst_0        
	//*  57  111:ldc2            #700 <String "keyboardHidden">
	//*  58  114:aastore         
	//*  59  115:invokestatic    #696 <Method String String.format(String, Object[])>
	//*  60  118:invokestatic    #698 <Method void wx.e(String)>
	//*  61  121:iconst_0        
	//*  62  122:istore_1        
	//*  63  123:aload_0         
	//*  64  124:getfield        #683 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  65  127:getfield        #688 <Field int ActivityInfo.configChanges>
	//*  66  130:sipush          128
	//*  67  133:iand            
	//*  68  134:ifne            158
	//*  69  137:ldc2            #690 <String "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".">
	//*  70  140:iconst_1        
	//*  71  141:anewarray       Object[]
	//*  72  144:dup             
	//*  73  145:iconst_0        
	//*  74  146:ldc2            #702 <String "orientation">
	//*  75  149:aastore         
	//*  76  150:invokestatic    #696 <Method String String.format(String, Object[])>
	//*  77  153:invokestatic    #698 <Method void wx.e(String)>
	//*  78  156:iconst_0        
	//*  79  157:istore_1        
	//*  80  158:aload_0         
	//*  81  159:getfield        #683 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  82  162:getfield        #688 <Field int ActivityInfo.configChanges>
	//*  83  165:sipush          256
	//*  84  168:iand            
	//*  85  169:ifne            193
	//*  86  172:ldc2            #690 <String "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".">
	//*  87  175:iconst_1        
	//*  88  176:anewarray       Object[]
	//*  89  179:dup             
	//*  90  180:iconst_0        
	//*  91  181:ldc2            #704 <String "screenLayout">
	//*  92  184:aastore         
	//*  93  185:invokestatic    #696 <Method String String.format(String, Object[])>
	//*  94  188:invokestatic    #698 <Method void wx.e(String)>
	//*  95  191:iconst_0        
	//*  96  192:istore_1        
	//*  97  193:aload_0         
	//*  98  194:getfield        #683 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  99  197:getfield        #688 <Field int ActivityInfo.configChanges>
	//* 100  200:sipush          512
	//* 101  203:iand            
	//* 102  204:ifne            228
	//* 103  207:ldc2            #690 <String "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".">
	//* 104  210:iconst_1        
	//* 105  211:anewarray       Object[]
	//* 106  214:dup             
	//* 107  215:iconst_0        
	//* 108  216:ldc2            #706 <String "uiMode">
	//* 109  219:aastore         
	//* 110  220:invokestatic    #696 <Method String String.format(String, Object[])>
	//* 111  223:invokestatic    #698 <Method void wx.e(String)>
	//* 112  226:iconst_0        
	//* 113  227:istore_1        
	//* 114  228:aload_0         
	//* 115  229:getfield        #683 <Field ActivityInfo ResolveInfo.activityInfo>
	//* 116  232:getfield        #688 <Field int ActivityInfo.configChanges>
	//* 117  235:sipush          1024
	//* 118  238:iand            
	//* 119  239:ifne            263
	//* 120  242:ldc2            #690 <String "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".">
	//* 121  245:iconst_1        
	//* 122  246:anewarray       Object[]
	//* 123  249:dup             
	//* 124  250:iconst_0        
	//* 125  251:ldc2            #708 <String "screenSize">
	//* 126  254:aastore         
	//* 127  255:invokestatic    #696 <Method String String.format(String, Object[])>
	//* 128  258:invokestatic    #698 <Method void wx.e(String)>
	//* 129  261:iconst_0        
	//* 130  262:istore_1        
	//* 131  263:aload_0         
	//* 132  264:getfield        #683 <Field ActivityInfo ResolveInfo.activityInfo>
	//* 133  267:getfield        #688 <Field int ActivityInfo.configChanges>
	//* 134  270:sipush          2048
	//* 135  273:iand            
	//* 136  274:ifne            298
	//* 137  277:ldc2            #690 <String "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".">
	//* 138  280:iconst_1        
	//* 139  281:anewarray       Object[]
	//* 140  284:dup             
	//* 141  285:iconst_0        
	//* 142  286:ldc2            #710 <String "smallestScreenSize">
	//* 143  289:aastore         
	//* 144  290:invokestatic    #696 <Method String String.format(String, Object[])>
	//* 145  293:invokestatic    #698 <Method void wx.e(String)>
	//* 146  296:iconst_0        
	//* 147  297:ireturn         
	//* 148  298:iload_1         
	//* 149  299:ireturn         
	//* 150  300:ldc2            #712 <String "Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.">
	//* 151  303:invokestatic    #698 <Method void wx.e(String)>
	//* 152  306:iconst_0        
	//* 153  307:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 154  308:astore_0        
		{
			com.google.android.gms.internal.ads.wx.c("Could not verify that com.google.android.gms.ads.AdActivity is declared in AndroidManifest.xml", ((Throwable) (context)));
	//  155  309:ldc2            #714 <String "Could not verify that com.google.android.gms.ads.AdActivity is declared in AndroidManifest.xml">
	//  156  312:aload_0         
	//  157  313:invokestatic    #364 <Method void com.google.android.gms.internal.ads.wx.c(String, Throwable)>
			aw.i().a(((Throwable) (context)), "AdUtil.hasAdActivity");
	//  158  316:invokestatic    #73  <Method wi aw.i()>
	//  159  319:aload_0         
	//  160  320:ldc2            #716 <String "AdUtil.hasAdActivity">
	//  161  323:invokevirtual   #719 <Method void wi.a(Throwable, String)>
			return false;
	//  162  326:iconst_0        
	//  163  327:ireturn         
		}
		if(context != null && ((ResolveInfo) (context)).activityInfo != null)
		{
			boolean flag;
			if((((ResolveInfo) (context)).activityInfo.configChanges & 0x10) == 0)
			{
				wx.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
					"keyboard"
				}));
				flag = false;
			} else
			{
				flag = true;
			}
			if((((ResolveInfo) (context)).activityInfo.configChanges & 0x20) == 0)
			{
				wx.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
					"keyboardHidden"
				}));
				flag = false;
			}
			if((((ResolveInfo) (context)).activityInfo.configChanges & 0x80) == 0)
			{
				wx.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
					"orientation"
				}));
				flag = false;
			}
			if((((ResolveInfo) (context)).activityInfo.configChanges & 0x100) == 0)
			{
				wx.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
					"screenLayout"
				}));
				flag = false;
			}
			if((((ResolveInfo) (context)).activityInfo.configChanges & 0x200) == 0)
			{
				wx.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
					"uiMode"
				}));
				flag = false;
			}
			if((((ResolveInfo) (context)).activityInfo.configChanges & 0x400) == 0)
			{
				wx.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
					"screenSize"
				}));
				flag = false;
			}
			if((((ResolveInfo) (context)).activityInfo.configChanges & 0x800) == 0)
			{
				wx.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
					"smallestScreenSize"
				}));
				return false;
			} else
			{
				return flag;
			}
		} else
		{
			wx.e("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
			return false;
		}
	}

	public static boolean a(Context context, String s)
	{
		context = tk.a(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #659 <Method Context tk.a(Context)>
	//    2    4:astore_0        
		String s1 = context.getPackageName();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #468 <Method String Context.getPackageName()>
	//    5    9:astore_2        
		return com.google.android.gms.common.b.c.a(context).a(s, s1) == 0;
	//    6   10:aload_0         
	//    7   11:invokestatic    #725 <Method b c.a(Context)>
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #730 <Method int b.a(String, String)>
	//   11   19:ifne            24
	//   12   22:iconst_1        
	//   13   23:ireturn         
	//   14   24:iconst_0        
	//   15   25:ireturn         
	}

	static boolean a(xg xg1, boolean flag)
	{
		xg1.c = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #45  <Field boolean c>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	public static int[] a(Activity activity)
	{
		activity = ((Activity) (activity.getWindow()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #736 <Method Window Activity.getWindow()>
	//    2    4:astore_0        
		if(activity != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          39
		{
			activity = ((Activity) (((Window) (activity)).findViewById(0x1020002)));
	//    5    9:aload_0         
	//    6   10:ldc2            #737 <Int 0x1020002>
	//    7   13:invokevirtual   #743 <Method View Window.findViewById(int)>
	//    8   16:astore_0        
			if(activity != null)
	//*   9   17:aload_0         
	//*  10   18:ifnull          39
				return (new int[] {
					((View) (activity)).getWidth(), ((View) (activity)).getHeight()
				});
	//   11   21:iconst_2        
	//   12   22:newarray        int[]
	//   13   24:dup             
	//   14   25:iconst_0        
	//   15   26:aload_0         
	//   16   27:invokevirtual   #746 <Method int View.getWidth()>
	//   17   30:iastore         
	//   18   31:dup             
	//   19   32:iconst_1        
	//   20   33:aload_0         
	//   21   34:invokevirtual   #749 <Method int View.getHeight()>
	//   22   37:iastore         
	//   23   38:areturn         
		}
		return e();
	//   24   39:invokestatic    #752 <Method int[] e()>
	//   25   42:areturn         
	}

	public static int b(String s)
	{
		int i1;
		try
		{
			i1 = Integer.parseInt(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #758 <Method int Integer.parseInt(String)>
	//    2    4:istore_1        
		}
	//*   3    5:iload_1         
	//*   4    6:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5    7:astore_0        
		{
			s = String.valueOf(((Object) (s)));
	//    6    8:aload_0         
	//    7    9:invokestatic    #472 <Method String String.valueOf(Object)>
	//    8   12:astore_0        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 22);
	//    9   13:new             #370 <Class StringBuilder>
	//   10   16:dup             
	//   11   17:aload_0         
	//   12   18:invokestatic    #472 <Method String String.valueOf(Object)>
	//   13   21:invokevirtual   #473 <Method int String.length()>
	//   14   24:bipush          22
	//   15   26:iadd            
	//   16   27:invokespecial   #371 <Method void StringBuilder(int)>
	//   17   30:astore_2        
			stringbuilder.append("Could not parse value:");
	//   18   31:aload_2         
	//   19   32:ldc2            #760 <String "Could not parse value:">
	//   20   35:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   21   38:pop             
			stringbuilder.append(s);
	//   22   39:aload_2         
	//   23   40:aload_0         
	//   24   41:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   25   44:pop             
			wx.e(stringbuilder.toString());
	//   26   45:aload_2         
	//   27   46:invokevirtual   #382 <Method String StringBuilder.toString()>
	//   28   49:invokestatic    #698 <Method void wx.e(String)>
			return 0;
	//   29   52:iconst_0        
	//   30   53:ireturn         
		}
		return i1;
	}

	public static Bitmap b(View view)
	{
		if(view == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		Bitmap bitmap1 = f(view);
	//    4    6:aload_0         
	//    5    7:invokestatic    #762 <Method Bitmap f(View)>
	//    6   10:astore_2        
		Bitmap bitmap = bitmap1;
	//    7   11:aload_2         
	//    8   12:astore_1        
		if(bitmap1 == null)
	//*   9   13:aload_2         
	//*  10   14:ifnonnull       22
			bitmap = e(view);
	//   11   17:aload_0         
	//   12   18:invokestatic    #764 <Method Bitmap e(View)>
	//   13   21:astore_1        
		return bitmap;
	//   14   22:aload_1         
	//   15   23:areturn         
	}

	public static String b()
	{
		String s = Build.MANUFACTURER;
	//    0    0:getstatic       #769 <Field String Build.MANUFACTURER>
	//    1    3:astore_0        
		String s1 = Build.MODEL;
	//    2    4:getstatic       #772 <Field String Build.MODEL>
	//    3    7:astore_1        
		if(s1.startsWith(s))
	//*   4    8:aload_1         
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #182 <Method boolean String.startsWith(String)>
	//*   7   13:ifeq            18
		{
			return s1;
	//    8   16:aload_1         
	//    9   17:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 1 + String.valueOf(((Object) (s1))).length());
	//   10   18:new             #370 <Class StringBuilder>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:invokestatic    #472 <Method String String.valueOf(Object)>
	//   14   26:invokevirtual   #473 <Method int String.length()>
	//   15   29:iconst_1        
	//   16   30:iadd            
	//   17   31:aload_1         
	//   18   32:invokestatic    #472 <Method String String.valueOf(Object)>
	//   19   35:invokevirtual   #473 <Method int String.length()>
	//   20   38:iadd            
	//   21   39:invokespecial   #371 <Method void StringBuilder(int)>
	//   22   42:astore_2        
			stringbuilder.append(s);
	//   23   43:aload_2         
	//   24   44:aload_0         
	//   25   45:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
			stringbuilder.append(" ");
	//   27   49:aload_2         
	//   28   50:ldc2            #774 <String " ">
	//   29   53:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   30   56:pop             
			stringbuilder.append(s1);
	//   31   57:aload_2         
	//   32   58:aload_1         
	//   33   59:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
			return stringbuilder.toString();
	//   35   63:aload_2         
	//   36   64:invokevirtual   #382 <Method String StringBuilder.toString()>
	//   37   67:areturn         
		}
	}

	public static void b(Context context, Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(com.google.android.gms.common.util.o.e())
	//*   3    5:invokestatic    #778 <Method boolean o.e()>
	//*   4    8:ifeq            59
		{
			Bundle bundle;
			if(intent.getExtras() != null)
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #782 <Method Bundle Intent.getExtras()>
	//*   7   15:ifnull          26
				bundle = intent.getExtras();
	//    8   18:aload_1         
	//    9   19:invokevirtual   #782 <Method Bundle Intent.getExtras()>
	//   10   22:astore_2        
			else
	//*  11   23:goto            34
				bundle = new Bundle();
	//   12   26:new             #113 <Class Bundle>
	//   13   29:dup             
	//   14   30:invokespecial   #457 <Method void Bundle()>
	//   15   33:astore_2        
			bundle.putBinder("android.support.customtabs.extra.SESSION", ((android.os.IBinder) (null)));
	//   16   34:aload_2         
	//   17   35:ldc2            #784 <String "android.support.customtabs.extra.SESSION">
	//   18   38:aconst_null     
	//   19   39:invokevirtual   #788 <Method void Bundle.putBinder(String, android.os.IBinder)>
			bundle.putString("com.android.browser.application_id", context.getPackageName());
	//   20   42:aload_2         
	//   21   43:ldc2            #465 <String "com.android.browser.application_id">
	//   22   46:aload_0         
	//   23   47:invokevirtual   #468 <Method String Context.getPackageName()>
	//   24   50:invokevirtual   #122 <Method void Bundle.putString(String, String)>
			intent.putExtras(bundle);
	//   25   53:aload_1         
	//   26   54:aload_2         
	//   27   55:invokevirtual   #461 <Method Intent Intent.putExtras(Bundle)>
	//   28   58:pop             
		}
	//   29   59:return          
	}

	public static void b(Context context, String s, String s1)
	{
		try
		{
			context = ((Context) (context.openFileOutput(s, 0)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #792 <Method FileOutputStream Context.openFileOutput(String, int)>
	//    4    6:astore_0        
			((FileOutputStream) (context)).write(s1.getBytes("UTF-8"));
	//    5    7:aload_0         
	//    6    8:aload_2         
	//    7    9:ldc2            #794 <String "UTF-8">
	//    8   12:invokevirtual   #798 <Method byte[] String.getBytes(String)>
	//    9   15:invokevirtual   #804 <Method void FileOutputStream.write(byte[])>
			((FileOutputStream) (context)).close();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #807 <Method void FileOutputStream.close()>
			return;
	//   12   22:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  13   23:astore_0        
		{
			com.google.android.gms.internal.ads.wx.b("Error writing to file in internal storage.", ((Throwable) (context)));
	//   14   24:ldc2            #809 <String "Error writing to file in internal storage.">
	//   15   27:aload_0         
	//   16   28:invokestatic    #485 <Method void com.google.android.gms.internal.ads.wx.b(String, Throwable)>
		}
	//   17   31:return          
	}

	public static Bundle c()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #113 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #457 <Method void Bundle()>
	//    3    7:astore_0        
		try
		{
			Object obj = ((Object) (p.C));
	//    4    8:getstatic       #812 <Field e p.C>
	//    5   11:astore_1        
			if(((Boolean)bwk.e().a(((e) (obj)))).booleanValue())
	//*   6   12:invokestatic    #283 <Method m bwk.e()>
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #288 <Method Object m.a(e)>
	//*   9   19:checkcast       #290 <Class Boolean>
	//*  10   22:invokevirtual   #293 <Method boolean Boolean.booleanValue()>
	//*  11   25:ifeq            48
			{
				obj = ((Object) (new android.os.Debug.MemoryInfo()));
	//   12   28:new             #814 <Class android.os.Debug$MemoryInfo>
	//   13   31:dup             
	//   14   32:invokespecial   #815 <Method void android.os.Debug$MemoryInfo()>
	//   15   35:astore_1        
				Debug.getMemoryInfo(((android.os.Debug.MemoryInfo) (obj)));
	//   16   36:aload_1         
	//   17   37:invokestatic    #821 <Method void Debug.getMemoryInfo(android.os.Debug$MemoryInfo)>
				bundle.putParcelable("debug_memory_info", ((android.os.Parcelable) (obj)));
	//   18   40:aload_0         
	//   19   41:ldc2            #823 <String "debug_memory_info">
	//   20   44:aload_1         
	//   21   45:invokevirtual   #827 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			}
			obj = ((Object) (Runtime.getRuntime()));
	//   22   48:invokestatic    #833 <Method Runtime Runtime.getRuntime()>
	//   23   51:astore_1        
			bundle.putLong("runtime_free_memory", ((Runtime) (obj)).freeMemory());
	//   24   52:aload_0         
	//   25   53:ldc2            #835 <String "runtime_free_memory">
	//   26   56:aload_1         
	//   27   57:invokevirtual   #839 <Method long Runtime.freeMemory()>
	//   28   60:invokevirtual   #843 <Method void Bundle.putLong(String, long)>
			bundle.putLong("runtime_max_memory", ((Runtime) (obj)).maxMemory());
	//   29   63:aload_0         
	//   30   64:ldc2            #845 <String "runtime_max_memory">
	//   31   67:aload_1         
	//   32   68:invokevirtual   #848 <Method long Runtime.maxMemory()>
	//   33   71:invokevirtual   #843 <Method void Bundle.putLong(String, long)>
			bundle.putLong("runtime_total_memory", ((Runtime) (obj)).totalMemory());
	//   34   74:aload_0         
	//   35   75:ldc2            #850 <String "runtime_total_memory">
	//   36   78:aload_1         
	//   37   79:invokevirtual   #853 <Method long Runtime.totalMemory()>
	//   38   82:invokevirtual   #843 <Method void Bundle.putLong(String, long)>
			bundle.putInt("web_view_count", aw.i().j());
	//   39   85:aload_0         
	//   40   86:ldc2            #855 <String "web_view_count">
	//   41   89:invokestatic    #73  <Method wi aw.i()>
	//   42   92:invokevirtual   #858 <Method int wi.j()>
	//   43   95:invokevirtual   #862 <Method void Bundle.putInt(String, int)>
		}
	//*  44   98:aload_0         
	//*  45   99:areturn         
		catch(Exception exception)
	//*  46  100:astore_1        
		{
			com.google.android.gms.internal.ads.wx.c("Unable to gather memory stats", ((Throwable) (exception)));
	//   47  101:ldc2            #864 <String "Unable to gather memory stats">
	//   48  104:aload_1         
	//   49  105:invokestatic    #364 <Method void com.google.android.gms.internal.ads.wx.c(String, Throwable)>
			return bundle;
	//   50  108:aload_0         
	//   51  109:areturn         
		}
		return bundle;
	}

	public static WebResourceResponse c(Context context, String s, String s1)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #190 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #406 <Method void HashMap()>
	//    3    7:astore_3        
		((Map) (hashmap)).put("User-Agent", ((Object) (aw.e().b(context, s))));
	//    4    8:aload_3         
	//    5    9:ldc2            #875 <String "User-Agent">
	//    6   12:invokestatic    #155 <Method xg aw.e()>
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #878 <Method String b(Context, String)>
	//   10   20:invokeinterface #235 <Method Object Map.put(Object, Object)>
	//   11   25:pop             
		((Map) (hashmap)).put("Cache-Control", "max-stale=3600");
	//   12   26:aload_3         
	//   13   27:ldc2            #880 <String "Cache-Control">
	//   14   30:ldc2            #882 <String "max-stale=3600">
	//   15   33:invokeinterface #235 <Method Object Map.put(Object, Object)>
	//   16   38:pop             
		context = ((Context) ((String)(new ys(context)).a(s1, ((Map) (hashmap))).get(60L, TimeUnit.SECONDS)));
	//   17   39:new             #884 <Class ys>
	//   18   42:dup             
	//   19   43:aload_0         
	//   20   44:invokespecial   #887 <Method void ys(Context)>
	//   21   47:aload_2         
	//   22   48:aload_3         
	//   23   49:invokevirtual   #890 <Method abe ys.a(String, Map)>
	//   24   52:ldc2w           #891 <Long 60L>
	//   25   55:getstatic       #898 <Field TimeUnit TimeUnit.SECONDS>
	//   26   58:invokeinterface #903 <Method Object abe.get(long, TimeUnit)>
	//   27   63:checkcast       #126 <Class String>
	//   28   66:astore_0        
		if(context == null)
			break MISSING_BLOCK_LABEL_121;
	//   29   67:aload_0         
	//   30   68:ifnull          121
		context = ((Context) (new WebResourceResponse("application/javascript", "UTF-8", ((java.io.InputStream) (new ByteArrayInputStream(((String) (context)).getBytes("UTF-8")))))));
	//   31   71:new             #905 <Class WebResourceResponse>
	//   32   74:dup             
	//   33   75:ldc2            #907 <String "application/javascript">
	//   34   78:ldc2            #794 <String "UTF-8">
	//   35   81:new             #909 <Class ByteArrayInputStream>
	//   36   84:dup             
	//   37   85:aload_0         
	//   38   86:ldc2            #794 <String "UTF-8">
	//   39   89:invokevirtual   #798 <Method byte[] String.getBytes(String)>
	//   40   92:invokespecial   #911 <Method void ByteArrayInputStream(byte[])>
	//   41   95:invokespecial   #914 <Method void WebResourceResponse(String, String, java.io.InputStream)>
	//   42   98:astore_0        
		return ((WebResourceResponse) (context));
	//   43   99:aload_0         
	//   44  100:areturn         
		context;
	//   45  101:astore_0        
		break MISSING_BLOCK_LABEL_114;
	//   46  102:goto            114
		context;
	//   47  105:astore_0        
		break MISSING_BLOCK_LABEL_114;
	//   48  106:goto            114
		context;
	//   49  109:astore_0        
		break MISSING_BLOCK_LABEL_114;
	//   50  110:goto            114
		context;
	//   51  113:astore_0        
		com.google.android.gms.internal.ads.wx.c("Could not fetch MRAID JS.", ((Throwable) (context)));
	//   52  114:ldc2            #916 <String "Could not fetch MRAID JS.">
	//   53  117:aload_0         
	//   54  118:invokestatic    #364 <Method void com.google.android.gms.internal.ads.wx.c(String, Throwable)>
		return null;
	//   55  121:aconst_null     
	//   56  122:areturn         
	}

	public static String c(Context context, String s)
	{
		try
		{
			context = ((Context) (new String(com.google.android.gms.common.util.k.a(((java.io.InputStream) (context.openFileInput(s))), true), "UTF-8")));
	//    0    0:new             #126 <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #920 <Method java.io.FileInputStream Context.openFileInput(String)>
	//    5    9:iconst_1        
	//    6   10:invokestatic    #925 <Method byte[] k.a(java.io.InputStream, boolean)>
	//    7   13:ldc2            #794 <String "UTF-8">
	//    8   16:invokespecial   #928 <Method void String(byte[], String)>
	//    9   19:astore_0        
		}
	//*  10   20:aload_0         
	//*  11   21:areturn         
	//*  12   22:ldc2            #930 <String "Error reading from internal storage.">
	//*  13   25:invokestatic    #481 <Method void com.google.android.gms.internal.ads.wx.b(String)>
	//*  14   28:ldc1            #167 <String "">
	//*  15   30:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			com.google.android.gms.internal.ads.wx.b("Error reading from internal storage.");
			return "";
		}
		return ((String) (context));
	//*  16   31:astore_0        
	//*  17   32:goto            22
	}

	public static boolean c(View view)
	{
		Object obj;
label0:
		{
			view = view.getRootView();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #935 <Method View View.getRootView()>
	//    2    4:astore_0        
			obj = null;
	//    3    5:aconst_null     
	//    4    6:astore_1        
			if(view != null)
	//*   5    7:aload_0         
	//*   6    8:ifnull          31
			{
				view = ((View) (view.getContext()));
	//    7   11:aload_0         
	//    8   12:invokevirtual   #938 <Method Context View.getContext()>
	//    9   15:astore_0        
				if(view instanceof Activity)
	//*  10   16:aload_0         
	//*  11   17:instanceof      #566 <Class Activity>
	//*  12   20:ifeq            31
				{
					view = ((View) ((Activity)view));
	//   13   23:aload_0         
	//   14   24:checkcast       #566 <Class Activity>
	//   15   27:astore_0        
					break label0;
	//   16   28:goto            33
				}
			}
			view = null;
	//   17   31:aconst_null     
	//   18   32:astore_0        
		}
		if(view == null)
	//*  19   33:aload_0         
	//*  20   34:ifnonnull       39
			return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
		view = ((View) (((Activity) (view)).getWindow()));
	//   23   39:aload_0         
	//   24   40:invokevirtual   #736 <Method Window Activity.getWindow()>
	//   25   43:astore_0        
		if(view == null)
	//*  26   44:aload_0         
	//*  27   45:ifnonnull       53
			view = ((View) (obj));
	//   28   48:aload_1         
	//   29   49:astore_0        
		else
	//*  30   50:goto            58
			view = ((View) (((Window) (view)).getAttributes()));
	//   31   53:aload_0         
	//   32   54:invokevirtual   #942 <Method android.view.WindowManager$LayoutParams Window.getAttributes()>
	//   33   57:astore_0        
		return view != null && (((android.view.WindowManager.LayoutParams) (view)).flags & 0x80000) != 0;
	//   34   58:aload_0         
	//   35   59:ifnull          75
	//   36   62:aload_0         
	//   37   63:getfield        #947 <Field int android.view.WindowManager$LayoutParams.flags>
	//   38   66:ldc2            #948 <Int 0x80000>
	//   39   69:iand            
	//   40   70:ifeq            75
	//   41   73:iconst_1        
	//   42   74:ireturn         
	//   43   75:iconst_0        
	//   44   76:ireturn         
	}

	public static boolean c(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #165 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return s.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
	//    5    9:aload_0         
	//    6   10:ldc2            #950 <String "([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)">
	//    7   13:invokevirtual   #953 <Method boolean String.matches(String)>
	//    8   16:ireturn         
	}

	public static int d(View view)
	{
		if(view == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return -1;
	//    2    4:iconst_m1       
	//    3    5:ireturn         
		ViewParent viewparent;
		for(viewparent = view.getParent(); viewparent != null && !(viewparent instanceof AdapterView); viewparent = viewparent.getParent());
	//    4    6:aload_0         
	//    5    7:invokevirtual   #329 <Method ViewParent View.getParent()>
	//    6   10:astore_1        
	//    7   11:aload_1         
	//    8   12:ifnull          32
	//    9   15:aload_1         
	//   10   16:instanceof      #955 <Class AdapterView>
	//   11   19:ifne            32
	//   12   22:aload_1         
	//   13   23:invokeinterface #958 <Method ViewParent ViewParent.getParent()>
	//   14   28:astore_1        
	//*  15   29:goto            11
		if(viewparent == null)
	//*  16   32:aload_1         
	//*  17   33:ifnonnull       38
			return -1;
	//   18   36:iconst_m1       
	//   19   37:ireturn         
		else
			return ((AdapterView)viewparent).getPositionForView(view);
	//   20   38:aload_1         
	//   21   39:checkcast       #955 <Class AdapterView>
	//   22   42:aload_0         
	//   23   43:invokevirtual   #961 <Method int AdapterView.getPositionForView(View)>
	//   24   46:ireturn         
	}

	private static String d()
	{
		StringBuilder stringbuilder = new StringBuilder(256);
	//    0    0:new             #370 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          256
	//    3    7:invokespecial   #371 <Method void StringBuilder(int)>
	//    4   10:astore_0        
		stringbuilder.append("Mozilla/5.0 (Linux; U; Android");
	//    5   11:aload_0         
	//    6   12:ldc2            #963 <String "Mozilla/5.0 (Linux; U; Android">
	//    7   15:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		if(android.os.Build.VERSION.RELEASE != null)
	//*   9   19:getstatic       #968 <Field String android.os.Build$VERSION.RELEASE>
	//*  10   22:ifnull          41
		{
			stringbuilder.append(" ");
	//   11   25:aload_0         
	//   12   26:ldc2            #774 <String " ">
	//   13   29:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   14   32:pop             
			stringbuilder.append(android.os.Build.VERSION.RELEASE);
	//   15   33:aload_0         
	//   16   34:getstatic       #968 <Field String android.os.Build$VERSION.RELEASE>
	//   17   37:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   18   40:pop             
		}
		stringbuilder.append("; ");
	//   19   41:aload_0         
	//   20   42:ldc2            #970 <String "; ">
	//   21   45:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:pop             
		stringbuilder.append(((Object) (Locale.getDefault())));
	//   23   49:aload_0         
	//   24   50:invokestatic    #976 <Method Locale Locale.getDefault()>
	//   25   53:invokevirtual   #979 <Method StringBuilder StringBuilder.append(Object)>
	//   26   56:pop             
		if(Build.DEVICE != null)
	//*  27   57:getstatic       #982 <Field String Build.DEVICE>
	//*  28   60:ifnull          101
		{
			stringbuilder.append("; ");
	//   29   63:aload_0         
	//   30   64:ldc2            #970 <String "; ">
	//   31   67:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   32   70:pop             
			stringbuilder.append(Build.DEVICE);
	//   33   71:aload_0         
	//   34   72:getstatic       #982 <Field String Build.DEVICE>
	//   35   75:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   36   78:pop             
			if(Build.DISPLAY != null)
	//*  37   79:getstatic       #985 <Field String Build.DISPLAY>
	//*  38   82:ifnull          101
			{
				stringbuilder.append(" Build/");
	//   39   85:aload_0         
	//   40   86:ldc2            #987 <String " Build/">
	//   41   89:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   42   92:pop             
				stringbuilder.append(Build.DISPLAY);
	//   43   93:aload_0         
	//   44   94:getstatic       #985 <Field String Build.DISPLAY>
	//   45   97:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   46  100:pop             
			}
		}
		stringbuilder.append(") AppleWebKit/533 Version/4.0 Safari/533");
	//   47  101:aload_0         
	//   48  102:ldc2            #989 <String ") AppleWebKit/533 Version/4.0 Safari/533">
	//   49  105:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   50  108:pop             
		return stringbuilder.toString();
	//   51  109:aload_0         
	//   52  110:invokevirtual   #382 <Method String StringBuilder.toString()>
	//   53  113:areturn         
	}

	protected static String d(Context context)
	{
		try
		{
			context = ((Context) ((new WebView(context)).getSettings().getUserAgentString()));
	//    0    0:new             #991 <Class WebView>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #992 <Method void WebView(Context)>
	//    4    8:invokevirtual   #996 <Method WebSettings WebView.getSettings()>
	//    5   11:invokevirtual   #1001 <Method String WebSettings.getUserAgentString()>
	//    6   14:astore_0        
		}
	//*   7   15:aload_0         
	//*   8   16:areturn         
	//*   9   17:invokestatic    #1002 <Method String d()>
	//*  10   20:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return d();
		}
		return ((String) (context));
	//*  11   21:astore_0        
	//*  12   22:goto            17
	}

	public static android.app.AlertDialog.Builder e(Context context)
	{
		return new android.app.AlertDialog.Builder(context);
	//    0    0:new             #1005 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #1006 <Method void android.app.AlertDialog$Builder(Context)>
	//    4    8:areturn         
	}

	private static Bitmap e(View view)
	{
		int i1;
		int j1;
		Bitmap bitmap;
		Canvas canvas;
		try
		{
			i1 = view.getWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #746 <Method int View.getWidth()>
	//    2    4:istore_1        
			j1 = view.getHeight();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #749 <Method int View.getHeight()>
	//    5    9:istore_2        
		}
	//*   6   10:iload_1         
	//*   7   11:ifeq            62
	//*   8   14:iload_2         
	//*   9   15:ifne            21
	//*  10   18:goto            62
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #746 <Method int View.getWidth()>
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #749 <Method int View.getHeight()>
	//*  15   29:getstatic       #1014 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//*  16   32:invokestatic    #1017 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//*  17   35:astore_3        
	//*  18   36:new             #1019 <Class Canvas>
	//*  19   39:dup             
	//*  20   40:aload_3         
	//*  21   41:invokespecial   #1022 <Method void Canvas(Bitmap)>
	//*  22   44:astore          4
	//*  23   46:aload_0         
	//*  24   47:iconst_0        
	//*  25   48:iconst_0        
	//*  26   49:iload_1         
	//*  27   50:iload_2         
	//*  28   51:invokevirtual   #1026 <Method void View.layout(int, int, int, int)>
	//*  29   54:aload_0         
	//*  30   55:aload           4
	//*  31   57:invokevirtual   #1030 <Method void View.draw(Canvas)>
	//*  32   60:aload_3         
	//*  33   61:areturn         
	//*  34   62:ldc2            #1032 <String "Width or height of view is zero">
	//*  35   65:invokestatic    #698 <Method void wx.e(String)>
	//*  36   68:aconst_null     
	//*  37   69:areturn         
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  38   70:astore_0        
		{
			com.google.android.gms.internal.ads.wx.b("Fail to capture the webview", ((Throwable) (view)));
	//   39   71:ldc2            #1034 <String "Fail to capture the webview">
	//   40   74:aload_0         
	//   41   75:invokestatic    #485 <Method void com.google.android.gms.internal.ads.wx.b(String, Throwable)>
			return null;
	//   42   78:aconst_null     
	//   43   79:areturn         
		}
		if(i1 == 0 || j1 == 0)
			break MISSING_BLOCK_LABEL_62;
		bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), android.graphics.Bitmap.Config.RGB_565);
		canvas = new Canvas(bitmap);
		view.layout(0, 0, i1, j1);
		view.draw(canvas);
		return bitmap;
		wx.e("Width or height of view is zero");
		return null;
	}

	private static int[] e()
	{
		return (new int[] {
			0, 0
		});
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:iconst_0        
	//    5    6:iastore         
	//    6    7:dup             
	//    7    8:iconst_1        
	//    8    9:iconst_0        
	//    9   10:iastore         
	//   10   11:areturn         
	}

	private static Bitmap f(View view)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		Bitmap bitmap = null;
	//    2    3:aconst_null     
	//    3    4:astore_2        
		Bitmap bitmap1 = ((Bitmap) (obj));
	//    4    5:aload           4
	//    5    7:astore_3        
		boolean flag;
		Bitmap bitmap2;
		try
		{
			flag = view.isDrawingCacheEnabled();
	//    6    8:aload_0         
	//    7    9:invokevirtual   #1037 <Method boolean View.isDrawingCacheEnabled()>
	//    8   12:istore_1        
		}
	//*   9   13:aload           4
	//*  10   15:astore_3        
	//*  11   16:aload_0         
	//*  12   17:iconst_1        
	//*  13   18:invokevirtual   #56  <Method void View.setDrawingCacheEnabled(boolean)>
	//*  14   21:aload           4
	//*  15   23:astore_3        
	//*  16   24:aload_0         
	//*  17   25:invokevirtual   #60  <Method Bitmap View.getDrawingCache()>
	//*  18   28:astore          5
	//*  19   30:aload           5
	//*  20   32:ifnull          44
	//*  21   35:aload           4
	//*  22   37:astore_3        
	//*  23   38:aload           5
	//*  24   40:invokestatic    #66  <Method Bitmap Bitmap.createBitmap(Bitmap)>
	//*  25   43:astore_2        
	//*  26   44:aload_2         
	//*  27   45:astore_3        
	//*  28   46:aload_0         
	//*  29   47:iload_1         
	//*  30   48:invokevirtual   #56  <Method void View.setDrawingCacheEnabled(boolean)>
	//*  31   51:aload_2         
	//*  32   52:areturn         
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  33   53:astore_0        
		{
			com.google.android.gms.internal.ads.wx.b("Fail to capture the web view", ((Throwable) (view)));
	//   34   54:ldc2            #1039 <String "Fail to capture the web view">
	//   35   57:aload_0         
	//   36   58:invokestatic    #485 <Method void com.google.android.gms.internal.ads.wx.b(String, Throwable)>
			return bitmap1;
	//   37   61:aload_3         
	//   38   62:areturn         
		}
		bitmap1 = ((Bitmap) (obj));
		view.setDrawingCacheEnabled(true);
		bitmap1 = ((Bitmap) (obj));
		bitmap2 = view.getDrawingCache();
		if(bitmap2 == null)
			break MISSING_BLOCK_LABEL_44;
		bitmap1 = ((Bitmap) (obj));
		bitmap = Bitmap.createBitmap(bitmap2);
		bitmap1 = bitmap;
		view.setDrawingCacheEnabled(flag);
		return bitmap;
	}

	public static bzl f(Context context)
	{
		return new bzl(context);
	//    0    0:new             #1042 <Class bzl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #1043 <Method void bzl(Context)>
	//    4    8:areturn         
	}

	public static boolean f(String s)
	{
		if(!com.google.android.gms.internal.ads.zz.c())
	//*   0    0:invokestatic    #1047 <Method boolean com.google.android.gms.internal.ads.zz.c()>
	//*   1    3:ifne            8
			return false;
	//    2    6:iconst_0        
	//    3    7:ireturn         
		Object obj = ((Object) (p.cx));
	//    4    8:getstatic       #1050 <Field e p.cx>
	//    5   11:astore_3        
		if(!((Boolean)bwk.e().a(((e) (obj)))).booleanValue())
	//*   6   12:invokestatic    #283 <Method m bwk.e()>
	//*   7   15:aload_3         
	//*   8   16:invokevirtual   #288 <Method Object m.a(e)>
	//*   9   19:checkcast       #290 <Class Boolean>
	//*  10   22:invokevirtual   #293 <Method boolean Boolean.booleanValue()>
	//*  11   25:ifne            30
			return false;
	//   12   28:iconst_0        
	//   13   29:ireturn         
		obj = ((Object) (p.cz));
	//   14   30:getstatic       #1053 <Field e p.cz>
	//   15   33:astore_3        
		obj = ((Object) ((String)bwk.e().a(((e) (obj)))));
	//   16   34:invokestatic    #283 <Method m bwk.e()>
	//   17   37:aload_3         
	//   18   38:invokevirtual   #288 <Method Object m.a(e)>
	//   19   41:checkcast       #126 <Class String>
	//   20   44:astore_3        
		if(!((String) (obj)).isEmpty())
	//*  21   45:aload_3         
	//*  22   46:invokevirtual   #1054 <Method boolean String.isEmpty()>
	//*  23   49:ifne            88
		{
			String as[] = ((String) (obj)).split(";");
	//   24   52:aload_3         
	//   25   53:ldc1            #169 <String ";">
	//   26   55:invokevirtual   #173 <Method String[] String.split(String)>
	//   27   58:astore_3        
			int k1 = as.length;
	//   28   59:aload_3         
	//   29   60:arraylength     
	//   30   61:istore_2        
			for(int i1 = 0; i1 < k1; i1++)
	//*  31   62:iconst_0        
	//*  32   63:istore_1        
	//*  33   64:iload_1         
	//*  34   65:iload_2         
	//*  35   66:icmpge          88
				if(as[i1].equals(((Object) (s))))
	//*  36   69:aload_3         
	//*  37   70:iload_1         
	//*  38   71:aaload          
	//*  39   72:aload_0         
	//*  40   73:invokevirtual   #130 <Method boolean String.equals(Object)>
	//*  41   76:ifeq            81
					return false;
	//   42   79:iconst_0        
	//   43   80:ireturn         

	//   44   81:iload_1         
	//   45   82:iconst_1        
	//   46   83:iadd            
	//   47   84:istore_1        
		}
	//*  48   85:goto            64
		as = ((String []) (p.cy));
	//   49   88:getstatic       #1057 <Field e p.cy>
	//   50   91:astore_3        
		as = ((String []) ((String)bwk.e().a(((e) (as)))));
	//   51   92:invokestatic    #283 <Method m bwk.e()>
	//   52   95:aload_3         
	//   53   96:invokevirtual   #288 <Method Object m.a(e)>
	//   54   99:checkcast       #126 <Class String>
	//   55  102:astore_3        
		if(((String) (as)).isEmpty())
	//*  56  103:aload_3         
	//*  57  104:invokevirtual   #1054 <Method boolean String.isEmpty()>
	//*  58  107:ifeq            112
			return true;
	//   59  110:iconst_1        
	//   60  111:ireturn         
		String as1[] = ((String) (as)).split(";");
	//   61  112:aload_3         
	//   62  113:ldc1            #169 <String ";">
	//   63  115:invokevirtual   #173 <Method String[] String.split(String)>
	//   64  118:astore_3        
		int l1 = as1.length;
	//   65  119:aload_3         
	//   66  120:arraylength     
	//   67  121:istore_2        
		for(int j1 = 0; j1 < l1; j1++)
	//*  68  122:iconst_0        
	//*  69  123:istore_1        
	//*  70  124:iload_1         
	//*  71  125:iload_2         
	//*  72  126:icmpge          148
			if(as1[j1].equals(((Object) (s))))
	//*  73  129:aload_3         
	//*  74  130:iload_1         
	//*  75  131:aaload          
	//*  76  132:aload_0         
	//*  77  133:invokevirtual   #130 <Method boolean String.equals(Object)>
	//*  78  136:ifeq            141
				return true;
	//   79  139:iconst_1        
	//   80  140:ireturn         

	//   81  141:iload_1         
	//   82  142:iconst_1        
	//   83  143:iadd            
	//   84  144:istore_1        
	//*  85  145:goto            124
		return false;
	//   86  148:iconst_0        
	//   87  149:ireturn         
	}

	public static boolean g(Context context)
	{
		boolean flag;
		KeyguardManager keyguardmanager;
		Object obj;
		android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
		try
		{
			obj = ((Object) ((ActivityManager)context.getSystemService("activity")));
	//    0    0:aload_0         
	//    1    1:ldc2            #316 <String "activity">
	//    2    4:invokevirtual   #594 <Method Object Context.getSystemService(String)>
	//    3    7:checkcast       #1059 <Class ActivityManager>
	//    4   10:astore_3        
			keyguardmanager = (KeyguardManager)context.getSystemService("keyguard");
	//    5   11:aload_0         
	//    6   12:ldc2            #1061 <String "keyguard">
	//    7   15:invokevirtual   #594 <Method Object Context.getSystemService(String)>
	//    8   18:checkcast       #1063 <Class KeyguardManager>
	//    9   21:astore_2        
		}
	//*  10   22:aload_3         
	//*  11   23:ifnull          111
	//*  12   26:aload_2         
	//*  13   27:ifnonnull       32
	//*  14   30:iconst_0        
	//*  15   31:ireturn         
	//*  16   32:aload_3         
	//*  17   33:invokevirtual   #1067 <Method List ActivityManager.getRunningAppProcesses()>
	//*  18   36:astore_3        
	//*  19   37:aload_3         
	//*  20   38:ifnonnull       43
	//*  21   41:iconst_0        
	//*  22   42:ireturn         
	//*  23   43:aload_3         
	//*  24   44:invokeinterface #497 <Method Iterator List.iterator()>
	//*  25   49:astore_3        
	//*  26   50:aload_3         
	//*  27   51:invokeinterface #212 <Method boolean Iterator.hasNext()>
	//*  28   56:ifeq            109
	//*  29   59:aload_3         
	//*  30   60:invokeinterface #216 <Method Object Iterator.next()>
	//*  31   65:checkcast       #1069 <Class android.app.ActivityManager$RunningAppProcessInfo>
	//*  32   68:astore          4
	//*  33   70:invokestatic    #1074 <Method int Process.myPid()>
	//*  34   73:aload           4
	//*  35   75:getfield        #1077 <Field int android.app.ActivityManager$RunningAppProcessInfo.pid>
	//*  36   78:icmpne          50
	//*  37   81:aload           4
	//*  38   83:getfield        #1080 <Field int android.app.ActivityManager$RunningAppProcessInfo.importance>
	//*  39   86:bipush          100
	//*  40   88:icmpne          109
	//*  41   91:aload_2         
	//*  42   92:invokevirtual   #1083 <Method boolean KeyguardManager.inKeyguardRestrictedInputMode()>
	//*  43   95:ifne            109
	//*  44   98:aload_0         
	//*  45   99:invokestatic    #1086 <Method boolean q(Context)>
	//*  46  102:istore_1        
	//*  47  103:iload_1         
	//*  48  104:ifeq            109
	//*  49  107:iconst_1        
	//*  50  108:ireturn         
	//*  51  109:iconst_0        
	//*  52  110:ireturn         
	//*  53  111:iconst_0        
	//*  54  112:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  55  113:astore_0        
		{
			return false;
	//   56  114:iconst_0        
	//   57  115:ireturn         
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_111;
		if(keyguardmanager == null)
			return false;
		obj = ((Object) (((ActivityManager) (obj)).getRunningAppProcesses()));
		if(obj == null)
			return false;
		obj = ((Object) (((List) (obj)).iterator()));
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break MISSING_BLOCK_LABEL_109;
			runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
		} while(Process.myPid() != runningappprocessinfo.pid);
		if(runningappprocessinfo.importance != 100 || keyguardmanager.inKeyguardRestrictedInputMode())
			break MISSING_BLOCK_LABEL_109;
		flag = q(context);
		if(flag)
			return true;
		return false;
		return false;
	}

	public static boolean h(Context context)
	{
		boolean flag;
		KeyguardManager keyguardmanager;
		Object obj;
		android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
		try
		{
			obj = ((Object) ((ActivityManager)context.getSystemService("activity")));
	//    0    0:aload_0         
	//    1    1:ldc2            #316 <String "activity">
	//    2    4:invokevirtual   #594 <Method Object Context.getSystemService(String)>
	//    3    7:checkcast       #1059 <Class ActivityManager>
	//    4   10:astore_3        
			keyguardmanager = (KeyguardManager)context.getSystemService("keyguard");
	//    5   11:aload_0         
	//    6   12:ldc2            #1061 <String "keyguard">
	//    7   15:invokevirtual   #594 <Method Object Context.getSystemService(String)>
	//    8   18:checkcast       #1063 <Class KeyguardManager>
	//    9   21:astore_2        
		}
	//*  10   22:aload_3         
	//*  11   23:ifnull          111
	//*  12   26:aload_2         
	//*  13   27:ifnonnull       32
	//*  14   30:iconst_0        
	//*  15   31:ireturn         
	//*  16   32:aload_3         
	//*  17   33:invokevirtual   #1067 <Method List ActivityManager.getRunningAppProcesses()>
	//*  18   36:astore_3        
	//*  19   37:aload_3         
	//*  20   38:ifnonnull       43
	//*  21   41:iconst_0        
	//*  22   42:ireturn         
	//*  23   43:aload_3         
	//*  24   44:invokeinterface #497 <Method Iterator List.iterator()>
	//*  25   49:astore_3        
	//*  26   50:aload_3         
	//*  27   51:invokeinterface #212 <Method boolean Iterator.hasNext()>
	//*  28   56:ifeq            109
	//*  29   59:aload_3         
	//*  30   60:invokeinterface #216 <Method Object Iterator.next()>
	//*  31   65:checkcast       #1069 <Class android.app.ActivityManager$RunningAppProcessInfo>
	//*  32   68:astore          4
	//*  33   70:invokestatic    #1074 <Method int Process.myPid()>
	//*  34   73:aload           4
	//*  35   75:getfield        #1077 <Field int android.app.ActivityManager$RunningAppProcessInfo.pid>
	//*  36   78:icmpne          50
	//*  37   81:aload           4
	//*  38   83:getfield        #1080 <Field int android.app.ActivityManager$RunningAppProcessInfo.importance>
	//*  39   86:bipush          100
	//*  40   88:icmpne          109
	//*  41   91:aload_2         
	//*  42   92:invokevirtual   #1083 <Method boolean KeyguardManager.inKeyguardRestrictedInputMode()>
	//*  43   95:ifne            109
	//*  44   98:aload_0         
	//*  45   99:invokestatic    #1086 <Method boolean q(Context)>
	//*  46  102:istore_1        
	//*  47  103:iload_1         
	//*  48  104:ifeq            109
	//*  49  107:iconst_0        
	//*  50  108:ireturn         
	//*  51  109:iconst_1        
	//*  52  110:ireturn         
	//*  53  111:iconst_0        
	//*  54  112:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  55  113:astore_0        
		{
			return false;
	//   56  114:iconst_0        
	//   57  115:ireturn         
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_111;
		if(keyguardmanager == null)
			return false;
		obj = ((Object) (((ActivityManager) (obj)).getRunningAppProcesses()));
		if(obj == null)
			return false;
		obj = ((Object) (((List) (obj)).iterator()));
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break MISSING_BLOCK_LABEL_109;
			runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
		} while(Process.myPid() != runningappprocessinfo.pid);
		if(runningappprocessinfo.importance != 100 || keyguardmanager.inKeyguardRestrictedInputMode())
			break MISSING_BLOCK_LABEL_109;
		flag = q(context);
		if(flag)
			return false;
		return true;
		return false;
	}

	public static Bitmap i(Context context)
	{
		if(!(context instanceof Activity))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #566 <Class Activity>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		context = ((Context) (((Activity)context).getWindow()));
	//    5    9:aload_0         
	//    6   10:checkcast       #566 <Class Activity>
	//    7   13:invokevirtual   #736 <Method Window Activity.getWindow()>
	//    8   16:astore_0        
		if(context == null)
			break MISSING_BLOCK_LABEL_42;
	//    9   17:aload_0         
	//   10   18:ifnull          42
		context = ((Context) (f(((Window) (context)).getDecorView().getRootView())));
	//   11   21:aload_0         
	//   12   22:invokevirtual   #1090 <Method View Window.getDecorView()>
	//   13   25:invokevirtual   #935 <Method View View.getRootView()>
	//   14   28:invokestatic    #762 <Method Bitmap f(View)>
	//   15   31:astore_0        
		return ((Bitmap) (context));
	//   16   32:aload_0         
	//   17   33:areturn         
		context;
	//   18   34:astore_0        
		com.google.android.gms.internal.ads.wx.b("Fail to capture screen shot", ((Throwable) (context)));
	//   19   35:ldc2            #1092 <String "Fail to capture screen shot">
	//   20   38:aload_0         
	//   21   39:invokestatic    #485 <Method void com.google.android.gms.internal.ads.wx.b(String, Throwable)>
		return null;
	//   22   42:aconst_null     
	//   23   43:areturn         
	}

	public static int j(Context context)
	{
		context = ((Context) (context.getApplicationInfo()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1097 <Method ApplicationInfo Context.getApplicationInfo()>
	//    2    4:astore_0        
		if(context == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return ((ApplicationInfo) (context)).targetSdkVersion;
	//    7   11:aload_0         
	//    8   12:getfield        #1102 <Field int ApplicationInfo.targetSdkVersion>
	//    9   15:ireturn         
	}

	public static boolean k(Context context)
	{
		if(context != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          32
		{
			if(!com.google.android.gms.common.util.o.c())
	//*   2    4:invokestatic    #1104 <Method boolean o.c()>
	//*   3    7:ifne            12
				return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
			context = ((Context) (r(context)));
	//    6   12:aload_0         
	//    7   13:invokestatic    #1108 <Method KeyguardManager r(Context)>
	//    8   16:astore_0        
			return context != null && ((KeyguardManager) (context)).isKeyguardLocked();
	//    9   17:aload_0         
	//   10   18:ifnull          30
	//   11   21:aload_0         
	//   12   22:invokevirtual   #1111 <Method boolean KeyguardManager.isKeyguardLocked()>
	//   13   25:ifeq            30
	//   14   28:iconst_1        
	//   15   29:ireturn         
	//   16   30:iconst_0        
	//   17   31:ireturn         
		} else
		{
			return false;
	//   18   32:iconst_0        
	//   19   33:ireturn         
		}
	}

	public static boolean l(Context context)
	{
		try
		{
			context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1118 <Method ClassLoader Context.getClassLoader()>
	//    2    4:ldc2            #1120 <String "com.google.android.gms.ads.internal.ClientApi">
	//    3    7:invokevirtual   #1126 <Method Class ClassLoader.loadClass(String)>
	//    4   10:pop             
		}
	//*   5   11:iconst_0        
	//*   6   12:ireturn         
	//*   7   13:astore_0        
	//*   8   14:ldc2            #1128 <String "Error loading class.">
	//*   9   17:aload_0         
	//*  10   18:invokestatic    #485 <Method void com.google.android.gms.internal.ads.wx.b(String, Throwable)>
	//*  11   21:invokestatic    #73  <Method wi aw.i()>
	//*  12   24:aload_0         
	//*  13   25:ldc2            #1130 <String "AdUtil.isLiteSdk">
	//*  14   28:invokevirtual   #719 <Method void wi.a(Throwable, String)>
	//*  15   31:iconst_0        
	//*  16   32:ireturn         
	//*  17   33:iconst_1        
	//*  18   34:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return true;
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			com.google.android.gms.internal.ads.wx.b("Error loading class.", ((Throwable) (context)));
			aw.i().a(((Throwable) (context)), "AdUtil.isLiteSdk");
			return false;
		}
		return false;
	//*  19   35:astore_0        
	//*  20   36:goto            33
	}

	public static boolean o(Context context)
	{
		if(!(context instanceof Activity))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #566 <Class Activity>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		context = ((Context) (((Activity)context).getWindow()));
	//    5    9:aload_0         
	//    6   10:checkcast       #566 <Class Activity>
	//    7   13:invokevirtual   #736 <Method Window Activity.getWindow()>
	//    8   16:astore_0        
		if(context != null)
	//*   9   17:aload_0         
	//*  10   18:ifnull          93
		{
			if(((Window) (context)).getDecorView() == null)
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #1090 <Method View Window.getDecorView()>
	//*  13   25:ifnonnull       30
				return false;
	//   14   28:iconst_0        
	//   15   29:ireturn         
			Rect rect = new Rect();
	//   16   30:new             #1133 <Class Rect>
	//   17   33:dup             
	//   18   34:invokespecial   #1134 <Method void Rect()>
	//   19   37:astore_1        
			Rect rect1 = new Rect();
	//   20   38:new             #1133 <Class Rect>
	//   21   41:dup             
	//   22   42:invokespecial   #1134 <Method void Rect()>
	//   23   45:astore_2        
			((Window) (context)).getDecorView().getGlobalVisibleRect(rect, ((android.graphics.Point) (null)));
	//   24   46:aload_0         
	//   25   47:invokevirtual   #1090 <Method View Window.getDecorView()>
	//   26   50:aload_1         
	//   27   51:aconst_null     
	//   28   52:invokevirtual   #1138 <Method boolean View.getGlobalVisibleRect(Rect, android.graphics.Point)>
	//   29   55:pop             
			((Window) (context)).getDecorView().getWindowVisibleDisplayFrame(rect1);
	//   30   56:aload_0         
	//   31   57:invokevirtual   #1090 <Method View Window.getDecorView()>
	//   32   60:aload_2         
	//   33   61:invokevirtual   #1142 <Method void View.getWindowVisibleDisplayFrame(Rect)>
			return rect.bottom != 0 && rect1.bottom != 0 && rect.top == rect1.top;
	//   34   64:aload_1         
	//   35   65:getfield        #1145 <Field int Rect.bottom>
	//   36   68:ifeq            91
	//   37   71:aload_2         
	//   38   72:getfield        #1145 <Field int Rect.bottom>
	//   39   75:ifeq            91
	//   40   78:aload_1         
	//   41   79:getfield        #1148 <Field int Rect.top>
	//   42   82:aload_2         
	//   43   83:getfield        #1148 <Field int Rect.top>
	//   44   86:icmpne          91
	//   45   89:iconst_1        
	//   46   90:ireturn         
	//   47   91:iconst_0        
	//   48   92:ireturn         
		} else
		{
			return false;
	//   49   93:iconst_0        
	//   50   94:ireturn         
		}
	}

	private static String p(Context context)
	{
		try
		{
			context = ((Context) ((ActivityManager)context.getSystemService("activity")));
	//    0    0:aload_0         
	//    1    1:ldc2            #316 <String "activity">
	//    2    4:invokevirtual   #594 <Method Object Context.getSystemService(String)>
	//    3    7:checkcast       #1059 <Class ActivityManager>
	//    4   10:astore_0        
		}
	//*   5   11:aload_0         
	//*   6   12:ifnonnull       17
	//*   7   15:aconst_null     
	//*   8   16:areturn         
	//*   9   17:aload_0         
	//*  10   18:iconst_1        
	//*  11   19:invokevirtual   #1152 <Method List ActivityManager.getRunningTasks(int)>
	//*  12   22:astore_0        
	//*  13   23:aload_0         
	//*  14   24:ifnull          68
	//*  15   27:aload_0         
	//*  16   28:invokeinterface #1153 <Method boolean List.isEmpty()>
	//*  17   33:ifne            68
	//*  18   36:aload_0         
	//*  19   37:iconst_0        
	//*  20   38:invokeinterface #231 <Method Object List.get(int)>
	//*  21   43:checkcast       #1155 <Class android.app.ActivityManager$RunningTaskInfo>
	//*  22   46:astore_0        
	//*  23   47:aload_0         
	//*  24   48:ifnull          68
	//*  25   51:aload_0         
	//*  26   52:getfield        #1159 <Field ComponentName android.app.ActivityManager$RunningTaskInfo.topActivity>
	//*  27   55:ifnull          68
	//*  28   58:aload_0         
	//*  29   59:getfield        #1159 <Field ComponentName android.app.ActivityManager$RunningTaskInfo.topActivity>
	//*  30   62:invokevirtual   #1164 <Method String ComponentName.getClassName()>
	//*  31   65:astore_0        
	//*  32   66:aload_0         
	//*  33   67:areturn         
	//*  34   68:aconst_null     
	//*  35   69:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  36   70:astore_0        
		{
			return null;
	//   37   71:aconst_null     
	//   38   72:areturn         
		}
		if(context == null)
			return null;
		context = ((Context) (((ActivityManager) (context)).getRunningTasks(1)));
		if(context == null)
			break MISSING_BLOCK_LABEL_68;
		if(((List) (context)).isEmpty())
			break MISSING_BLOCK_LABEL_68;
		context = ((Context) ((android.app.ActivityManager.RunningTaskInfo)((List) (context)).get(0)));
		if(context == null)
			break MISSING_BLOCK_LABEL_68;
		if(((android.app.ActivityManager.RunningTaskInfo) (context)).topActivity == null)
			break MISSING_BLOCK_LABEL_68;
		context = ((Context) (((android.app.ActivityManager.RunningTaskInfo) (context)).topActivity.getClassName()));
		return ((String) (context));
		return null;
	}

	private static boolean q(Context context)
	{
		context = ((Context) ((PowerManager)context.getSystemService("power")));
	//    0    0:aload_0         
	//    1    1:ldc2            #1166 <String "power">
	//    2    4:invokevirtual   #594 <Method Object Context.getSystemService(String)>
	//    3    7:checkcast       #1168 <Class PowerManager>
	//    4   10:astore_0        
		if(context == null)
	//*   5   11:aload_0         
	//*   6   12:ifnonnull       17
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		else
			return ((PowerManager) (context)).isScreenOn();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #1171 <Method boolean PowerManager.isScreenOn()>
	//   11   21:ireturn         
	}

	private static KeyguardManager r(Context context)
	{
		context = ((Context) (context.getSystemService("keyguard")));
	//    0    0:aload_0         
	//    1    1:ldc2            #1061 <String "keyguard">
	//    2    4:invokevirtual   #594 <Method Object Context.getSystemService(String)>
	//    3    7:astore_0        
		if(context != null && (context instanceof KeyguardManager))
	//*   4    8:aload_0         
	//*   5    9:ifnull          24
	//*   6   12:aload_0         
	//*   7   13:instanceof      #1063 <Class KeyguardManager>
	//*   8   16:ifeq            24
			return (KeyguardManager)context;
	//    9   19:aload_0         
	//   10   20:checkcast       #1063 <Class KeyguardManager>
	//   11   23:areturn         
		else
			return null;
	//   12   24:aconst_null     
	//   13   25:areturn         
	}

	public final JSONObject a(Bundle bundle, JSONObject jsonobject)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
		{
			try
			{
				bundle = ((Bundle) (a(bundle)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #537 <Method JSONObject a(Bundle)>
	//    5    9:astore_1        
			}
	//*   6   10:aload_1         
	//*   7   11:areturn         
			// Misplaced declaration of an exception variable
			catch(Bundle bundle)
	//*   8   12:astore_1        
			{
				com.google.android.gms.internal.ads.wx.b("Error converting Bundle to JSON", ((Throwable) (bundle)));
	//    9   13:ldc2            #1174 <String "Error converting Bundle to JSON">
	//   10   16:aload_1         
	//   11   17:invokestatic    #485 <Method void com.google.android.gms.internal.ads.wx.b(String, Throwable)>
				return null;
	//   12   20:aconst_null     
	//   13   21:areturn         
			}
			return ((JSONObject) (bundle));
		} else
		{
			return null;
	//   14   22:aconst_null     
	//   15   23:areturn         
		}
	}

	public final JSONObject a(Map map)
	{
		JSONObject jsonobject;
		try
		{
			jsonobject = new JSONObject();
	//    0    0:new             #295 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #296 <Method void JSONObject()>
	//    3    7:astore_2        
			String s;
			for(Iterator iterator = map.keySet().iterator(); iterator.hasNext(); a(jsonobject, s, map.get(((Object) (s)))))
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #1177 <Method Set Map.keySet()>
	//*   6   14:invokeinterface #207 <Method Iterator Set.iterator()>
	//*   7   19:astore_3        
	//*   8   20:aload_3         
	//*   9   21:invokeinterface #212 <Method boolean Iterator.hasNext()>
	//*  10   26:ifeq            58
				s = (String)iterator.next();
	//   11   29:aload_3         
	//   12   30:invokeinterface #216 <Method Object Iterator.next()>
	//   13   35:checkcast       #126 <Class String>
	//   14   38:astore          4

	//   15   40:aload_0         
	//   16   41:aload_2         
	//   17   42:aload           4
	//   18   44:aload_1         
	//   19   45:aload           4
	//   20   47:invokeinterface #1180 <Method Object Map.get(Object)>
	//   21   52:invokespecial   #430 <Method void a(JSONObject, String, Object)>
		}
	//*  22   55:goto            20
	//*  23   58:aload_2         
	//*  24   59:areturn         
		// Misplaced declaration of an exception variable
		catch(Map map)
	//*  25   60:astore_1        
		{
			map = ((Map) (String.valueOf(((Object) (((ClassCastException) (map)).getMessage())))));
	//   26   61:aload_1         
	//   27   62:invokevirtual   #1183 <Method String ClassCastException.getMessage()>
	//   28   65:invokestatic    #472 <Method String String.valueOf(Object)>
	//   29   68:astore_1        
			if(((String) (map)).length() != 0)
	//*  30   69:aload_1         
	//*  31   70:invokevirtual   #473 <Method int String.length()>
	//*  32   73:ifeq            87
				map = ((Map) ("Could not convert map to JSON: ".concat(((String) (map)))));
	//   33   76:ldc2            #1185 <String "Could not convert map to JSON: ">
	//   34   79:aload_1         
	//   35   80:invokevirtual   #1188 <Method String String.concat(String)>
	//   36   83:astore_1        
			else
	//*  37   84:goto            98
				map = ((Map) (new String("Could not convert map to JSON: ")));
	//   38   87:new             #126 <Class String>
	//   39   90:dup             
	//   40   91:ldc2            #1185 <String "Could not convert map to JSON: ">
	//   41   94:invokespecial   #1190 <Method void String(String)>
	//   42   97:astore_1        
			throw new JSONException(((String) (map)));
	//   43   98:new             #272 <Class JSONException>
	//   44  101:dup             
	//   45  102:aload_1         
	//   46  103:invokespecial   #1191 <Method void JSONException(String)>
	//   47  106:athrow          
		}
		return jsonobject;
	}

	public final void a(Context context, String s, WebSettings websettings)
	{
		websettings.setUserAgentString(b(context, s));
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokevirtual   #878 <Method String b(Context, String)>
	//    5    7:invokevirtual   #1195 <Method void WebSettings.setUserAgentString(String)>
	//    6   10:return          
	}

	public final void a(Context context, String s, String s1, Bundle bundle, boolean flag)
	{
		if(flag)
	//*   0    0:iload           5
	//*   1    2:ifeq            37
		{
			aw.e();
	//    2    5:invokestatic    #155 <Method xg aw.e()>
	//    3    8:pop             
			bundle.putString("device", b());
	//    4    9:aload           4
	//    5   11:ldc2            #1198 <String "device">
	//    6   14:invokestatic    #1199 <Method String b()>
	//    7   17:invokevirtual   #122 <Method void Bundle.putString(String, String)>
			bundle.putString("eids", TextUtils.join(",", ((Iterable) (com.google.android.gms.internal.ads.p.a()))));
	//    8   20:aload           4
	//    9   22:ldc2            #1201 <String "eids">
	//   10   25:ldc2            #1203 <String ",">
	//   11   28:invokestatic    #1205 <Method List p.a()>
	//   12   31:invokestatic    #1209 <Method String TextUtils.join(CharSequence, Iterable)>
	//   13   34:invokevirtual   #122 <Method void Bundle.putString(String, String)>
		}
		bwk.a();
	//   14   37:invokestatic    #572 <Method zv bwk.a()>
	//   15   40:pop             
		zv.a(context, s, s1, bundle, flag, ((zy) (new xl(this, context, s))));
	//   16   41:aload_1         
	//   17   42:aload_2         
	//   18   43:aload_3         
	//   19   44:aload           4
	//   20   46:iload           5
	//   21   48:new             #1211 <Class xl>
	//   22   51:dup             
	//   23   52:aload_0         
	//   24   53:aload_1         
	//   25   54:aload_2         
	//   26   55:invokespecial   #1214 <Method void xl(xg, Context, String)>
	//   27   58:invokestatic    #1217 <Method void zv.a(Context, String, String, Bundle, boolean, zy)>
	//   28   61:return          
	}

	public final void a(Context context, String s, boolean flag, HttpURLConnection httpurlconnection)
	{
		httpurlconnection.setConnectTimeout(60000);
	//    0    0:aload           4
	//    1    2:ldc2            #1219 <Int 60000>
	//    2    5:invokevirtual   #1222 <Method void HttpURLConnection.setConnectTimeout(int)>
		httpurlconnection.setInstanceFollowRedirects(false);
	//    3    8:aload           4
	//    4   10:iconst_0        
	//    5   11:invokevirtual   #1225 <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
		httpurlconnection.setReadTimeout(60000);
	//    6   14:aload           4
	//    7   16:ldc2            #1219 <Int 60000>
	//    8   19:invokevirtual   #1228 <Method void HttpURLConnection.setReadTimeout(int)>
		httpurlconnection.setRequestProperty("User-Agent", b(context, s));
	//    9   22:aload           4
	//   10   24:ldc2            #875 <String "User-Agent">
	//   11   27:aload_0         
	//   12   28:aload_1         
	//   13   29:aload_2         
	//   14   30:invokevirtual   #878 <Method String b(Context, String)>
	//   15   33:invokevirtual   #1231 <Method void HttpURLConnection.setRequestProperty(String, String)>
		httpurlconnection.setUseCaches(false);
	//   16   36:aload           4
	//   17   38:iconst_0        
	//   18   39:invokevirtual   #1234 <Method void HttpURLConnection.setUseCaches(boolean)>
	//   19   42:return          
	}

	public final void a(Context context, List list)
	{
		if(!(context instanceof Activity))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #566 <Class Activity>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		Activity activity = (Activity)context;
	//    4    8:aload_1         
	//    5    9:checkcast       #566 <Class Activity>
	//    6   12:astore_3        
		if(TextUtils.isEmpty(((CharSequence) (azc.a(((Context) (activity)))))))
	//*   7   13:aload_3         
	//*   8   14:invokestatic    #1239 <Method String azc.a(Context)>
	//*   9   17:invokestatic    #165 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  10   20:ifeq            24
			return;
	//   11   23:return          
		if(list == null)
	//*  12   24:aload_2         
	//*  13   25:ifnonnull       35
		{
			wx.a("Cannot ping urls: empty list.");
	//   14   28:ldc2            #1241 <String "Cannot ping urls: empty list.">
	//   15   31:invokestatic    #1242 <Method void wx.a(String)>
			return;
	//   16   34:return          
		}
		if(!an.a(context))
	//*  17   35:aload_1         
	//*  18   36:invokestatic    #1246 <Method boolean an.a(Context)>
	//*  19   39:ifne            49
		{
			wx.a("Cannot ping url because custom tabs is not supported");
	//   20   42:ldc2            #1248 <String "Cannot ping url because custom tabs is not supported">
	//   21   45:invokestatic    #1242 <Method void wx.a(String)>
			return;
	//   22   48:return          
		} else
		{
			an an1 = new an();
	//   23   49:new             #1244 <Class an>
	//   24   52:dup             
	//   25   53:invokespecial   #1249 <Method void an()>
	//   26   56:astore          4
			an1.a(((ao) (new xj(this, list, an1, context))));
	//   27   58:aload           4
	//   28   60:new             #1251 <Class xj>
	//   29   63:dup             
	//   30   64:aload_0         
	//   31   65:aload_2         
	//   32   66:aload           4
	//   33   68:aload_1         
	//   34   69:invokespecial   #1254 <Method void xj(xg, List, an, Context)>
	//   35   72:invokevirtual   #1257 <Method void an.a(ao)>
			an1.b(activity);
	//   36   75:aload           4
	//   37   77:aload_3         
	//   38   78:invokevirtual   #1260 <Method void com.google.android.gms.internal.ads.an.b(Activity)>
			return;
	//   39   81:return          
		}
	}

	public final boolean a(View view, Context context)
	{
		Object obj = ((Object) (context.getApplicationContext()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #1262 <Method Context Context.getApplicationContext()>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          23
			obj = ((Object) ((PowerManager)((Context) (obj)).getSystemService("power")));
	//    5    9:aload_3         
	//    6   10:ldc2            #1166 <String "power">
	//    7   13:invokevirtual   #594 <Method Object Context.getSystemService(String)>
	//    8   16:checkcast       #1168 <Class PowerManager>
	//    9   19:astore_3        
		else
	//*  10   20:goto            25
			obj = null;
	//   11   23:aconst_null     
	//   12   24:astore_3        
		return a(view, ((PowerManager) (obj)), r(context));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:aload_3         
	//   16   28:aload_2         
	//   17   29:invokestatic    #1108 <Method KeyguardManager r(Context)>
	//   18   32:invokevirtual   #1265 <Method boolean a(View, PowerManager, KeyguardManager)>
	//   19   35:ireturn         
	}

	public final boolean a(View view, PowerManager powermanager, KeyguardManager keyguardmanager)
	{
		boolean flag;
label0:
		{
			if(!aw.e().c)
	//*   0    0:invokestatic    #155 <Method xg aw.e()>
	//*   1    3:getfield        #45  <Field boolean c>
	//*   2    6:ifne            46
			{
				boolean flag2;
				if(keyguardmanager == null)
	//*   3    9:aload_3         
	//*   4   10:ifnonnull       19
					flag2 = false;
	//    5   13:iconst_0        
	//    6   14:istore          6
				else
	//*   7   16:goto            25
					flag2 = keyguardmanager.inKeyguardRestrictedInputMode();
	//    8   19:aload_3         
	//    9   20:invokevirtual   #1083 <Method boolean KeyguardManager.inKeyguardRestrictedInputMode()>
	//   10   23:istore          6
				if(flag2 && !c(view))
	//*  11   25:iload           6
	//*  12   27:ifeq            46
	//*  13   30:aload_1         
	//*  14   31:invokestatic    #1267 <Method boolean c(View)>
	//*  15   34:ifeq            40
	//*  16   37:goto            46
				{
					flag = false;
	//   17   40:iconst_0        
	//   18   41:istore          4
					break label0;
	//   19   43:goto            49
				}
			}
			flag = true;
	//   20   46:iconst_1        
	//   21   47:istore          4
		}
		if(view.getVisibility() == 0 && view.isShown())
	//*  22   49:aload_1         
	//*  23   50:invokevirtual   #1270 <Method int View.getVisibility()>
	//*  24   53:ifne            146
	//*  25   56:aload_1         
	//*  26   57:invokevirtual   #1273 <Method boolean View.isShown()>
	//*  27   60:ifeq            146
		{
			boolean flag1;
			if(powermanager != null && !powermanager.isScreenOn())
	//*  28   63:aload_2         
	//*  29   64:ifnull          83
	//*  30   67:aload_2         
	//*  31   68:invokevirtual   #1171 <Method boolean PowerManager.isScreenOn()>
	//*  32   71:ifeq            77
	//*  33   74:goto            83
				flag1 = false;
	//   34   77:iconst_0        
	//   35   78:istore          5
			else
	//*  36   80:goto            86
				flag1 = true;
	//   37   83:iconst_1        
	//   38   84:istore          5
			if(flag1 && flag)
	//*  39   86:iload           5
	//*  40   88:ifeq            146
	//*  41   91:iload           4
	//*  42   93:ifeq            146
			{
				powermanager = ((PowerManager) (p.aV));
	//   43   96:getstatic       #1276 <Field e p.aV>
	//   44   99:astore_2        
				if(!((Boolean)bwk.e().a(((e) (powermanager)))).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect()))
	//*  45  100:invokestatic    #283 <Method m bwk.e()>
	//*  46  103:aload_2         
	//*  47  104:invokevirtual   #288 <Method Object m.a(e)>
	//*  48  107:checkcast       #290 <Class Boolean>
	//*  49  110:invokevirtual   #293 <Method boolean Boolean.booleanValue()>
	//*  50  113:ifeq            144
	//*  51  116:aload_1         
	//*  52  117:new             #1133 <Class Rect>
	//*  53  120:dup             
	//*  54  121:invokespecial   #1134 <Method void Rect()>
	//*  55  124:invokevirtual   #1280 <Method boolean View.getLocalVisibleRect(Rect)>
	//*  56  127:ifne            144
	//*  57  130:aload_1         
	//*  58  131:new             #1133 <Class Rect>
	//*  59  134:dup             
	//*  60  135:invokespecial   #1134 <Method void Rect()>
	//*  61  138:invokevirtual   #1282 <Method boolean View.getGlobalVisibleRect(Rect)>
	//*  62  141:ifeq            146
					return true;
	//   63  144:iconst_1        
	//   64  145:ireturn         
			}
		}
		return false;
	//   65  146:iconst_0        
	//   66  147:ireturn         
	}

	public final String b(Context context, String s)
	{
label0:
		{
			synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field Object b>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
			{
				if(d == null)
					break label0;
	//    5    9:aload_0         
	//    6   10:getfield        #367 <Field String d>
	//    7   13:ifnull          26
				context = ((Context) (d));
	//    8   16:aload_0         
	//    9   17:getfield        #367 <Field String d>
	//   10   20:astore_1        
			}
	//   11   21:aload           4
	//   12   23:monitorexit     
			return ((String) (context));
	//   13   24:aload_1         
	//   14   25:areturn         
		}
		if(s != null)
			break MISSING_BLOCK_LABEL_39;
	//   15   26:aload_2         
	//   16   27:ifnonnull       39
		context = ((Context) (d()));
	//   17   30:invokestatic    #1002 <Method String d()>
	//   18   33:astore_1        
		obj;
	//   19   34:aload           4
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		return ((String) (context));
	//   21   37:aload_1         
	//   22   38:areturn         
		String s1;
		try
		{
			d = aw.g().a(context);
	//   23   39:aload_0         
	//   24   40:invokestatic    #238 <Method xo aw.g()>
	//   25   43:aload_1         
	//   26   44:invokevirtual   #1283 <Method String xo.a(Context)>
	//   27   47:putfield        #367 <Field String d>
		}
	//*  28   50:aload_0         
	//*  29   51:getfield        #367 <Field String d>
	//*  30   54:invokestatic    #165 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  31   57:ifeq            169
	//*  32   60:invokestatic    #572 <Method zv bwk.a()>
	//*  33   63:pop             
	//*  34   64:invokestatic    #1284 <Method boolean com.google.android.gms.internal.ads.zv.b()>
	//*  35   67:ifne            161
	//*  36   70:aload_0         
	//*  37   71:aconst_null     
	//*  38   72:putfield        #367 <Field String d>
	//*  39   75:getstatic       #38  <Field Handler a>
	//*  40   78:new             #1286 <Class xk>
	//*  41   81:dup             
	//*  42   82:aload_0         
	//*  43   83:aload_1         
	//*  44   84:invokespecial   #1289 <Method void xk(xg, Context)>
	//*  45   87:invokevirtual   #1295 <Method boolean Handler.post(Runnable)>
	//*  46   90:pop             
	//*  47   91:aload_0         
	//*  48   92:getfield        #367 <Field String d>
	//*  49   95:astore_3        
	//*  50   96:aload_3         
	//*  51   97:ifnonnull       169
	//*  52  100:aload_0         
	//*  53  101:getfield        #43  <Field Object b>
	//*  54  104:invokevirtual   #1298 <Method void Object.wait()>
	//*  55  107:goto            91
	//*  56  110:aload_0         
	//*  57  111:invokestatic    #1002 <Method String d()>
	//*  58  114:putfield        #367 <Field String d>
	//*  59  117:aload_0         
	//*  60  118:getfield        #367 <Field String d>
	//*  61  121:invokestatic    #472 <Method String String.valueOf(Object)>
	//*  62  124:astore_3        
	//*  63  125:aload_3         
	//*  64  126:invokevirtual   #473 <Method int String.length()>
	//*  65  129:ifeq            143
	//*  66  132:ldc2            #1300 <String "Interrupted, use default user agent: ">
	//*  67  135:aload_3         
	//*  68  136:invokevirtual   #1188 <Method String String.concat(String)>
	//*  69  139:astore_3        
	//*  70  140:goto            154
	//*  71  143:new             #126 <Class String>
	//*  72  146:dup             
	//*  73  147:ldc2            #1300 <String "Interrupted, use default user agent: ">
	//*  74  150:invokespecial   #1190 <Method void String(String)>
	//*  75  153:astore_3        
	//*  76  154:aload_3         
	//*  77  155:invokestatic    #698 <Method void wx.e(String)>
	//*  78  158:goto            91
	//*  79  161:aload_0         
	//*  80  162:aload_1         
	//*  81  163:invokestatic    #1302 <Method String d(Context)>
	//*  82  166:putfield        #367 <Field String d>
	//*  83  169:aload_0         
	//*  84  170:getfield        #367 <Field String d>
	//*  85  173:invokestatic    #472 <Method String String.valueOf(Object)>
	//*  86  176:astore_3        
	//*  87  177:new             #370 <Class StringBuilder>
	//*  88  180:dup             
	//*  89  181:aload_3         
	//*  90  182:invokestatic    #472 <Method String String.valueOf(Object)>
	//*  91  185:invokevirtual   #473 <Method int String.length()>
	//*  92  188:bipush          10
	//*  93  190:iadd            
	//*  94  191:aload_2         
	//*  95  192:invokestatic    #472 <Method String String.valueOf(Object)>
	//*  96  195:invokevirtual   #473 <Method int String.length()>
	//*  97  198:iadd            
	//*  98  199:invokespecial   #371 <Method void StringBuilder(int)>
	//*  99  202:astore          5
	//* 100  204:aload           5
	//* 101  206:aload_3         
	//* 102  207:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//* 103  210:pop             
	//* 104  211:aload           5
	//* 105  213:ldc2            #1304 <String " (Mobile; ">
	//* 106  216:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//* 107  219:pop             
	//* 108  220:aload           5
	//* 109  222:aload_2         
	//* 110  223:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//* 111  226:pop             
	//* 112  227:aload_0         
	//* 113  228:aload           5
	//* 114  230:invokevirtual   #382 <Method String StringBuilder.toString()>
	//* 115  233:putfield        #367 <Field String d>
	//* 116  236:aload_1         
	//* 117  237:invokestatic    #725 <Method b c.a(Context)>
	//* 118  240:invokevirtual   #1306 <Method boolean b.a()>
	//* 119  243:ifeq            277
	//* 120  246:aload_0         
	//* 121  247:aload_0         
	//* 122  248:getfield        #367 <Field String d>
	//* 123  251:invokestatic    #472 <Method String String.valueOf(Object)>
	//* 124  254:ldc2            #1308 <String ";aia">
	//* 125  257:invokevirtual   #1188 <Method String String.concat(String)>
	//* 126  260:putfield        #367 <Field String d>
	//* 127  263:goto            277
	//* 128  266:astore_1        
	//* 129  267:invokestatic    #73  <Method wi aw.i()>
	//* 130  270:aload_1         
	//* 131  271:ldc2            #1310 <String "AdUtil.getUserAgent">
	//* 132  274:invokevirtual   #719 <Method void wi.a(Throwable, String)>
	//* 133  277:aload_0         
	//* 134  278:aload_0         
	//* 135  279:getfield        #367 <Field String d>
	//* 136  282:invokestatic    #472 <Method String String.valueOf(Object)>
	//* 137  285:ldc2            #1312 <String ")">
	//* 138  288:invokevirtual   #1188 <Method String String.concat(String)>
	//* 139  291:putfield        #367 <Field String d>
	//* 140  294:aload_0         
	//* 141  295:getfield        #367 <Field String d>
	//* 142  298:astore_1        
	//* 143  299:aload           4
	//* 144  301:monitorexit     
	//* 145  302:aload_1         
	//* 146  303:areturn         
	//* 147  304:astore_1        
	//* 148  305:aload           4
	//* 149  307:monitorexit     
	//* 150  308:aload_1         
	//* 151  309:athrow          
		catch(Exception exception) { }
	//  152  310:astore_3        
		if(!TextUtils.isEmpty(((CharSequence) (d)))) goto _L2; else goto _L1
_L1:
		bwk.a();
		if(com.google.android.gms.internal.ads.zv.b()) goto _L4; else goto _L3
_L3:
		d = null;
		a.post(((Runnable) (new xk(this, context))));
_L6:
		s1 = d;
		if(s1 != null) goto _L2; else goto _L5
_L5:
		b.wait();
		  goto _L6
_L8:
		d = d();
		s1 = String.valueOf(((Object) (d)));
		if(s1.length() != 0)
		{
			s1 = "Interrupted, use default user agent: ".concat(s1);
			break MISSING_BLOCK_LABEL_154;
		}
		s1 = new String("Interrupted, use default user agent: ");
		wx.e(s1);
		  goto _L6
_L4:
		d = d(context);
_L2:
		String s2 = String.valueOf(((Object) (d)));
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s2))).length() + 10 + String.valueOf(((Object) (s))).length());
		stringbuilder.append(s2);
		stringbuilder.append(" (Mobile; ");
		stringbuilder.append(s);
		d = stringbuilder.toString();
		if(com.google.android.gms.common.b.c.a(context).a())
			d = String.valueOf(((Object) (d))).concat(";aia");
		  goto _L7
		context;
		aw.i().a(((Throwable) (context)), "AdUtil.getUserAgent");
_L7:
		d = String.valueOf(((Object) (d))).concat(")");
		context = ((Context) (d));
		obj;
		JVM INSTR monitorexit ;
		return ((String) (context));
		context;
		obj;
		JVM INSTR monitorexit ;
		throw context;
	//* 153  311:goto            50
		InterruptedException interruptedexception;
		interruptedexception;
	//  154  314:astore_3        
		  goto _L8
	//* 155  315:goto            110
	}

	public final void b(Context context, String s, String s1, Bundle bundle, boolean flag)
	{
		e e1 = p.aY;
	//    0    0:getstatic       #1315 <Field e p.aY>
	//    1    3:astore          6
		if(((Boolean)bwk.e().a(e1)).booleanValue())
	//*   2    5:invokestatic    #283 <Method m bwk.e()>
	//*   3    8:aload           6
	//*   4   10:invokevirtual   #288 <Method Object m.a(e)>
	//*   5   13:checkcast       #290 <Class Boolean>
	//*   6   16:invokevirtual   #293 <Method boolean Boolean.booleanValue()>
	//*   7   19:ifeq            33
			a(context, s, s1, bundle, flag);
	//    8   22:aload_0         
	//    9   23:aload_1         
	//   10   24:aload_2         
	//   11   25:aload_3         
	//   12   26:aload           4
	//   13   28:iload           5
	//   14   30:invokevirtual   #1317 <Method void a(Context, String, String, Bundle, boolean)>
	//   15   33:return          
	}

	public final boolean b(Context context)
	{
		if(e)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field boolean e>
	//*   2    4:ifeq            9
		{
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			IntentFilter intentfilter = new IntentFilter();
	//    5    9:new             #1319 <Class IntentFilter>
	//    6   12:dup             
	//    7   13:invokespecial   #1320 <Method void IntentFilter()>
	//    8   16:astore_2        
			intentfilter.addAction("android.intent.action.USER_PRESENT");
	//    9   17:aload_2         
	//   10   18:ldc2            #1322 <String "android.intent.action.USER_PRESENT">
	//   11   21:invokevirtual   #1325 <Method void IntentFilter.addAction(String)>
			intentfilter.addAction("android.intent.action.SCREEN_OFF");
	//   12   24:aload_2         
	//   13   25:ldc2            #1327 <String "android.intent.action.SCREEN_OFF">
	//   14   28:invokevirtual   #1325 <Method void IntentFilter.addAction(String)>
			context.getApplicationContext().registerReceiver(((android.content.BroadcastReceiver) (new xn(this, ((xj) (null))))), intentfilter);
	//   15   31:aload_1         
	//   16   32:invokevirtual   #1262 <Method Context Context.getApplicationContext()>
	//   17   35:new             #1329 <Class xn>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:aconst_null     
	//   21   41:invokespecial   #1332 <Method void xn(xg, xj)>
	//   22   44:aload_2         
	//   23   45:invokevirtual   #1336 <Method Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//   24   48:pop             
			e = true;
	//   25   49:aload_0         
	//   26   50:iconst_1        
	//   27   51:putfield        #47  <Field boolean e>
			return true;
	//   28   54:iconst_1        
	//   29   55:ireturn         
		}
	}

	public final int[] b(Activity activity)
	{
		int ai[] = a(activity);
	//    0    0:aload_1         
	//    1    1:invokestatic    #1338 <Method int[] a(Activity)>
	//    2    4:astore_3        
		bwk.a();
	//    3    5:invokestatic    #572 <Method zv bwk.a()>
	//    4    8:pop             
		int i1 = com.google.android.gms.internal.ads.zv.b(((Context) (activity)), ai[0]);
	//    5    9:aload_1         
	//    6   10:aload_3         
	//    7   11:iconst_0        
	//    8   12:iaload          
	//    9   13:invokestatic    #1340 <Method int com.google.android.gms.internal.ads.zv.b(Context, int)>
	//   10   16:istore_2        
		bwk.a();
	//   11   17:invokestatic    #572 <Method zv bwk.a()>
	//   12   20:pop             
		return (new int[] {
			i1, com.google.android.gms.internal.ads.zv.b(((Context) (activity)), ai[1])
		});
	//   13   21:iconst_2        
	//   14   22:newarray        int[]
	//   15   24:dup             
	//   16   25:iconst_0        
	//   17   26:iload_2         
	//   18   27:iastore         
	//   19   28:dup             
	//   20   29:iconst_1        
	//   21   30:aload_1         
	//   22   31:aload_3         
	//   23   32:iconst_1        
	//   24   33:iaload          
	//   25   34:invokestatic    #1340 <Method int com.google.android.gms.internal.ads.zv.b(Context, int)>
	//   26   37:iastore         
	//   27   38:areturn         
	}

	public final boolean c(Context context)
	{
		if(f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field boolean f>
	//*   2    4:ifeq            9
		{
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			IntentFilter intentfilter = new IntentFilter();
	//    5    9:new             #1319 <Class IntentFilter>
	//    6   12:dup             
	//    7   13:invokespecial   #1320 <Method void IntentFilter()>
	//    8   16:astore_2        
			intentfilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
	//    9   17:aload_2         
	//   10   18:ldc2            #1342 <String "com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED">
	//   11   21:invokevirtual   #1325 <Method void IntentFilter.addAction(String)>
			context.getApplicationContext().registerReceiver(((android.content.BroadcastReceiver) (new xm(this, ((xj) (null))))), intentfilter);
	//   12   24:aload_1         
	//   13   25:invokevirtual   #1262 <Method Context Context.getApplicationContext()>
	//   14   28:new             #1344 <Class xm>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:aconst_null     
	//   18   34:invokespecial   #1345 <Method void xm(xg, xj)>
	//   19   37:aload_2         
	//   20   38:invokevirtual   #1336 <Method Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//   21   41:pop             
			f = true;
	//   22   42:aload_0         
	//   23   43:iconst_1        
	//   24   44:putfield        #49  <Field boolean f>
			return true;
	//   25   47:iconst_1        
	//   26   48:ireturn         
		}
	}

	public final int[] c(Activity activity)
	{
		int ai[];
label0:
		{
			Window window = activity.getWindow();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #736 <Method Window Activity.getWindow()>
	//    2    4:astore_3        
			if(window != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          46
			{
				View view = window.findViewById(0x1020002);
	//    5    9:aload_3         
	//    6   10:ldc2            #737 <Int 0x1020002>
	//    7   13:invokevirtual   #743 <Method View Window.findViewById(int)>
	//    8   16:astore          4
				if(view != null)
	//*   9   18:aload           4
	//*  10   20:ifnull          46
				{
					ai = new int[2];
	//   11   23:iconst_2        
	//   12   24:newarray        int[]
	//   13   26:astore_3        
					ai[0] = view.getTop();
	//   14   27:aload_3         
	//   15   28:iconst_0        
	//   16   29:aload           4
	//   17   31:invokevirtual   #1348 <Method int View.getTop()>
	//   18   34:iastore         
					ai[1] = view.getBottom();
	//   19   35:aload_3         
	//   20   36:iconst_1        
	//   21   37:aload           4
	//   22   39:invokevirtual   #1351 <Method int View.getBottom()>
	//   23   42:iastore         
					break label0;
	//   24   43:goto            50
				}
			}
			ai = e();
	//   25   46:invokestatic    #752 <Method int[] e()>
	//   26   49:astore_3        
		}
		bwk.a();
	//   27   50:invokestatic    #572 <Method zv bwk.a()>
	//   28   53:pop             
		int i1 = com.google.android.gms.internal.ads.zv.b(((Context) (activity)), ai[0]);
	//   29   54:aload_1         
	//   30   55:aload_3         
	//   31   56:iconst_0        
	//   32   57:iaload          
	//   33   58:invokestatic    #1340 <Method int com.google.android.gms.internal.ads.zv.b(Context, int)>
	//   34   61:istore_2        
		bwk.a();
	//   35   62:invokestatic    #572 <Method zv bwk.a()>
	//   36   65:pop             
		return (new int[] {
			i1, com.google.android.gms.internal.ads.zv.b(((Context) (activity)), ai[1])
		});
	//   37   66:iconst_2        
	//   38   67:newarray        int[]
	//   39   69:dup             
	//   40   70:iconst_0        
	//   41   71:iload_2         
	//   42   72:iastore         
	//   43   73:dup             
	//   44   74:iconst_1        
	//   45   75:aload_1         
	//   46   76:aload_3         
	//   47   77:iconst_1        
	//   48   78:iaload          
	//   49   79:invokestatic    #1340 <Method int com.google.android.gms.internal.ads.zv.b(Context, int)>
	//   50   82:iastore         
	//   51   83:areturn         
	}

	public final boolean d(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #165 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		this;
	//    5    9:aload_0         
		JVM INSTR monitorenter ;
	//    6   10:monitorenter    
		boolean flag;
label0:
		{
			if(g != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #1355 <Field Pattern g>
	//*   9   15:ifnull          45
			{
				e e1 = p.ad;
	//   10   18:getstatic       #1358 <Field e p.ad>
	//   11   21:astore_3        
				if(((String)bwk.e().a(e1)).equals(((Object) (g.pattern()))))
					break label0;
	//   12   22:invokestatic    #283 <Method m bwk.e()>
	//   13   25:aload_3         
	//   14   26:invokevirtual   #288 <Method Object m.a(e)>
	//   15   29:checkcast       #126 <Class String>
	//   16   32:aload_0         
	//   17   33:getfield        #1355 <Field Pattern g>
	//   18   36:invokevirtual   #1363 <Method String Pattern.pattern()>
	//   19   39:invokevirtual   #130 <Method boolean String.equals(Object)>
	//   20   42:ifne            66
			}
			e e2 = p.ad;
	//   21   45:getstatic       #1358 <Field e p.ad>
	//   22   48:astore_3        
			g = Pattern.compile((String)bwk.e().a(e2));
	//   23   49:aload_0         
	//   24   50:invokestatic    #283 <Method m bwk.e()>
	//   25   53:aload_3         
	//   26   54:invokevirtual   #288 <Method Object m.a(e)>
	//   27   57:checkcast       #126 <Class String>
	//   28   60:invokestatic    #1367 <Method Pattern Pattern.compile(String)>
	//   29   63:putfield        #1355 <Field Pattern g>
		}
		flag = g.matcher(((CharSequence) (s))).matches();
	//   30   66:aload_0         
	//   31   67:getfield        #1355 <Field Pattern g>
	//   32   70:aload_1         
	//   33   71:invokevirtual   #1371 <Method Matcher Pattern.matcher(CharSequence)>
	//   34   74:invokevirtual   #1375 <Method boolean Matcher.matches()>
	//   35   77:istore_2        
		this;
	//   36   78:aload_0         
		JVM INSTR monitorexit ;
	//   37   79:monitorexit     
		return flag;
	//   38   80:iload_2         
	//   39   81:ireturn         
		s;
	//   40   82:astore_1        
		this;
	//   41   83:aload_0         
		JVM INSTR monitorexit ;
	//   42   84:monitorexit     
		try
		{
			throw s;
	//   43   85:aload_1         
	//   44   86:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  45   87:astore_1        
		{
			return false;
	//   46   88:iconst_0        
	//   47   89:ireturn         
		}
	}

	public final boolean e(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #165 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		this;
	//    5    9:aload_0         
		JVM INSTR monitorenter ;
	//    6   10:monitorenter    
		boolean flag;
label0:
		{
			if(h != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #1377 <Field Pattern h>
	//*   9   15:ifnull          45
			{
				e e1 = p.ae;
	//   10   18:getstatic       #1380 <Field e p.ae>
	//   11   21:astore_3        
				if(((String)bwk.e().a(e1)).equals(((Object) (h.pattern()))))
					break label0;
	//   12   22:invokestatic    #283 <Method m bwk.e()>
	//   13   25:aload_3         
	//   14   26:invokevirtual   #288 <Method Object m.a(e)>
	//   15   29:checkcast       #126 <Class String>
	//   16   32:aload_0         
	//   17   33:getfield        #1377 <Field Pattern h>
	//   18   36:invokevirtual   #1363 <Method String Pattern.pattern()>
	//   19   39:invokevirtual   #130 <Method boolean String.equals(Object)>
	//   20   42:ifne            66
			}
			e e2 = p.ae;
	//   21   45:getstatic       #1380 <Field e p.ae>
	//   22   48:astore_3        
			h = Pattern.compile((String)bwk.e().a(e2));
	//   23   49:aload_0         
	//   24   50:invokestatic    #283 <Method m bwk.e()>
	//   25   53:aload_3         
	//   26   54:invokevirtual   #288 <Method Object m.a(e)>
	//   27   57:checkcast       #126 <Class String>
	//   28   60:invokestatic    #1367 <Method Pattern Pattern.compile(String)>
	//   29   63:putfield        #1377 <Field Pattern h>
		}
		flag = h.matcher(((CharSequence) (s))).matches();
	//   30   66:aload_0         
	//   31   67:getfield        #1377 <Field Pattern h>
	//   32   70:aload_1         
	//   33   71:invokevirtual   #1371 <Method Matcher Pattern.matcher(CharSequence)>
	//   34   74:invokevirtual   #1375 <Method boolean Matcher.matches()>
	//   35   77:istore_2        
		this;
	//   36   78:aload_0         
		JVM INSTR monitorexit ;
	//   37   79:monitorexit     
		return flag;
	//   38   80:iload_2         
	//   39   81:ireturn         
		s;
	//   40   82:astore_1        
		this;
	//   41   83:aload_0         
		JVM INSTR monitorexit ;
	//   42   84:monitorexit     
		try
		{
			throw s;
	//   43   85:aload_1         
	//   44   86:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  45   87:astore_1        
		{
			return false;
	//   46   88:iconst_0        
	//   47   89:ireturn         
		}
	}

	public final String m(Context context)
	{
		e e1 = p.cO;
	//    0    0:getstatic       #1385 <Field e p.cO>
	//    1    3:astore_2        
		if(!((Boolean)bwk.e().a(e1)).booleanValue())
	//*   2    4:invokestatic    #283 <Method m bwk.e()>
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #288 <Method Object m.a(e)>
	//*   5   11:checkcast       #290 <Class Boolean>
	//*   6   14:invokevirtual   #293 <Method boolean Boolean.booleanValue()>
	//*   7   17:ifne            23
			return "";
	//    8   20:ldc1            #167 <String "">
	//    9   22:areturn         
		try
		{
			context = ((Context) ((String)xe.a(((java.util.concurrent.Callable) (new xh(this, context)))).get()));
	//   10   23:new             #1387 <Class xh>
	//   11   26:dup             
	//   12   27:aload_0         
	//   13   28:aload_1         
	//   14   29:invokespecial   #1388 <Method void xh(xg, Context)>
	//   15   32:invokestatic    #1391 <Method abe xe.a(java.util.concurrent.Callable)>
	//   16   35:invokeinterface #1393 <Method Object abe.get()>
	//   17   40:checkcast       #126 <Class String>
	//   18   43:astore_1        
		}
	//*  19   44:aload_1         
	//*  20   45:areturn         
	//*  21   46:ldc1            #167 <String "">
	//*  22   48:areturn         
	//*  23   49:invokestatic    #1396 <Method boolean Thread.interrupted()>
	//*  24   52:pop             
	//*  25   53:ldc1            #167 <String "">
	//*  26   55:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			Thread.interrupted();
			return "";
		}
	//*  27   56:astore_1        
	//*  28   57:goto            49
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return "";
		}
		return ((String) (context));
	//*  29   60:astore_1        
	//*  30   61:goto            46
	}

	public final Bundle n(Context context)
	{
		e e1 = p.cP;
	//    0    0:getstatic       #1402 <Field e p.cP>
	//    1    3:astore_2        
		if(!((Boolean)bwk.e().a(e1)).booleanValue())
	//*   2    4:invokestatic    #283 <Method m bwk.e()>
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #288 <Method Object m.a(e)>
	//*   5   11:checkcast       #290 <Class Boolean>
	//*   6   14:invokevirtual   #293 <Method boolean Boolean.booleanValue()>
	//*   7   17:ifne            22
			return null;
	//    8   20:aconst_null     
	//    9   21:areturn         
		try
		{
			context = ((Context) ((Bundle)xe.a(((java.util.concurrent.Callable) (new xi(this, context)))).get()));
	//   10   22:new             #1404 <Class xi>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokespecial   #1405 <Method void xi(xg, Context)>
	//   15   31:invokestatic    #1391 <Method abe xe.a(java.util.concurrent.Callable)>
	//   16   34:invokeinterface #1393 <Method Object abe.get()>
	//   17   39:checkcast       #113 <Class Bundle>
	//   18   42:astore_1        
		}
	//*  19   43:aload_1         
	//*  20   44:areturn         
	//*  21   45:invokestatic    #1396 <Method boolean Thread.interrupted()>
	//*  22   48:pop             
	//*  23   49:aconst_null     
	//*  24   50:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			Thread.interrupted();
			return null;
		}
	//*  25   51:astore_1        
	//*  26   52:goto            45
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  27   55:astore_1        
		{
			return null;
	//   28   56:aconst_null     
	//   29   57:areturn         
		}
		return ((Bundle) (context));
	}

	public static final Handler a = new wz(Looper.getMainLooper());
	private final Object b = new Object();
	private boolean c;
	private String d;
	private boolean e;
	private boolean f;
	private Pattern g;
	private Pattern h;

	static 
	{
	//    0    0:new             #26  <Class wz>
	//    1    3:dup             
	//    2    4:invokestatic    #32  <Method Looper Looper.getMainLooper()>
	//    3    7:invokespecial   #36  <Method void wz(Looper)>
	//    4   10:putstatic       #38  <Field Handler a>
	//*   5   13:return          
	}
}
