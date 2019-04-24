// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Handler;
import com.amap.api.maps.model.LatLng;
import com.amap.api.trace.TraceLocation;
import java.util.ArrayList;
import java.util.List;
import org.json.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			gh, gf, go, gr, 
//			gl

public class gj extends gh
	implements Runnable
{

	public gj(Context context, Handler handler, List list, int i1, String s, int j1, int k1)
	{
		super(context, ((Object) (list)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #22  <Method void gh(Context, Object)>
		j = null;
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:putfield        #24  <Field Handler j>
		k = 0;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #26  <Field int k>
		l = 0;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #28  <Field int l>
		i = list;
	//   13   21:aload_0         
	//   14   22:aload_3         
	//   15   23:putfield        #30  <Field List i>
		j = handler;
	//   16   26:aload_0         
	//   17   27:aload_2         
	//   18   28:putfield        #24  <Field Handler j>
		l = j1;
	//   19   31:aload_0         
	//   20   32:iload           6
	//   21   34:putfield        #28  <Field int l>
		k = k1;
	//   22   37:aload_0         
	//   23   38:iload           7
	//   24   40:putfield        #26  <Field int k>
		m = s;
	//   25   43:aload_0         
	//   26   44:aload           5
	//   27   46:putfield        #32  <Field String m>
	//   28   49:return          
	}

	protected List a(String s)
		throws gf
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #45  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void ArrayList()>
	//    3    7:astore          4
		int i1;
		boolean flag;
		JSONObject jsonobject;
		try
		{
			s = ((String) (new JSONObject(s)));
	//    4    9:new             #50  <Class JSONObject>
	//    5   12:dup             
	//    6   13:aload_1         
	//    7   14:invokespecial   #53  <Method void JSONObject(String)>
	//    8   17:astore_1        
			flag = ((JSONObject) (s)).has("data");
	//    9   18:aload_1         
	//   10   19:ldc1            #55  <String "data">
	//   11   21:invokevirtual   #59  <Method boolean JSONObject.has(String)>
	//   12   24:istore_3        
		}
	//*  13   25:iload_3         
	//*  14   26:ifne            32
	//*  15   29:aload           4
	//*  16   31:areturn         
	//*  17   32:aload_1         
	//*  18   33:ldc1            #55  <String "data">
	//*  19   35:invokevirtual   #63  <Method JSONObject JSONObject.optJSONObject(String)>
	//*  20   38:ldc1            #65  <String "points">
	//*  21   40:invokevirtual   #69  <Method JSONArray JSONObject.optJSONArray(String)>
	//*  22   43:astore_1        
	//*  23   44:aload_1         
	//*  24   45:ifnull          57
	//*  25   48:aload_1         
	//*  26   49:invokevirtual   #75  <Method int JSONArray.length()>
	//*  27   52:istore_2        
	//*  28   53:iload_2         
	//*  29   54:ifne            60
	//*  30   57:aload           4
	//*  31   59:areturn         
	//*  32   60:iconst_0        
	//*  33   61:istore_2        
	//*  34   62:iload_2         
	//*  35   63:aload_1         
	//*  36   64:invokevirtual   #75  <Method int JSONArray.length()>
	//*  37   67:icmpge          119
	//*  38   70:aload_1         
	//*  39   71:iload_2         
	//*  40   72:invokevirtual   #78  <Method JSONObject JSONArray.optJSONObject(int)>
	//*  41   75:astore          5
	//*  42   77:aload           4
	//*  43   79:new             #80  <Class LatLng>
	//*  44   82:dup             
	//*  45   83:aload           5
	//*  46   85:ldc1            #82  <String "y">
	//*  47   87:invokevirtual   #86  <Method String JSONObject.optString(String)>
	//*  48   90:invokestatic    #92  <Method double Double.parseDouble(String)>
	//*  49   93:aload           5
	//*  50   95:ldc1            #94  <String "x">
	//*  51   97:invokevirtual   #86  <Method String JSONObject.optString(String)>
	//*  52  100:invokestatic    #92  <Method double Double.parseDouble(String)>
	//*  53  103:invokespecial   #97  <Method void LatLng(double, double)>
	//*  54  106:invokeinterface #103 <Method boolean List.add(Object)>
	//*  55  111:pop             
	//*  56  112:iload_2         
	//*  57  113:iconst_1        
	//*  58  114:iadd            
	//*  59  115:istore_2        
	//*  60  116:goto            62
	//*  61  119:aload           4
	//*  62  121:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  63  122:astore_1        
		{
			((JSONException) (s)).printStackTrace();
	//   64  123:aload_1         
	//   65  124:invokevirtual   #106 <Method void JSONException.printStackTrace()>
			return ((List) (arraylist));
	//   66  127:aload           4
	//   67  129:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  68  130:astore_1        
		{
			((Throwable) (s)).printStackTrace();
	//   69  131:aload_1         
	//   70  132:invokevirtual   #107 <Method void Throwable.printStackTrace()>
			return ((List) (arraylist));
	//   71  135:aload           4
	//   72  137:areturn         
		}
		if(!flag)
			return ((List) (arraylist));
		s = ((String) (((JSONObject) (s)).optJSONObject("data").optJSONArray("points")));
		if(s == null)
			break MISSING_BLOCK_LABEL_57;
		i1 = ((JSONArray) (s)).length();
		if(i1 != 0)
			break MISSING_BLOCK_LABEL_60;
		return ((List) (arraylist));
		i1 = 0;
_L2:
		if(i1 >= ((JSONArray) (s)).length())
			break; /* Loop/switch isn't completed */
		jsonobject = ((JSONArray) (s)).optJSONObject(i1);
		((List) (arraylist)).add(((Object) (new LatLng(Double.parseDouble(jsonobject.optString("y")), Double.parseDouble(jsonobject.optString("x"))))));
		i1++;
		if(true) goto _L2; else goto _L1
_L1:
		return ((List) (arraylist));
	}

	protected Object b(String s)
		throws gf
	{
		return ((Object) (a(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #113 <Method List a(String)>
	//    3    5:areturn         
	}

	public String c()
	{
		String s = (new StringBuilder()).append("key=").append(go.f(c)).toString();
	//    0    0:new             #117 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #118 <Method void StringBuilder()>
	//    3    7:ldc1            #120 <String "key=">
	//    4    9:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #127 <Field Context c>
	//    7   16:invokestatic    #133 <Method String go.f(Context)>
	//    8   19:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   10   25:astore_1        
		String s2 = gr.a();
	//   11   26:invokestatic    #140 <Method String gr.a()>
	//   12   29:astore_3        
		String s1 = (new StringBuilder()).append("&ts=").append(s2).toString();
	//   13   30:new             #117 <Class StringBuilder>
	//   14   33:dup             
	//   15   34:invokespecial   #118 <Method void StringBuilder()>
	//   16   37:ldc1            #142 <String "&ts=">
	//   17   39:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   18   42:aload_3         
	//   19   43:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   20   46:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   21   49:astore_2        
		s2 = gr.a(c, s2, s);
	//   22   50:aload_0         
	//   23   51:getfield        #127 <Field Context c>
	//   24   54:aload_3         
	//   25   55:aload_1         
	//   26   56:invokestatic    #145 <Method String gr.a(Context, String, String)>
	//   27   59:astore_3        
		s2 = (new StringBuilder()).append("&scode=").append(s2).toString();
	//   28   60:new             #117 <Class StringBuilder>
	//   29   63:dup             
	//   30   64:invokespecial   #118 <Method void StringBuilder()>
	//   31   67:ldc1            #147 <String "&scode=">
	//   32   69:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   33   72:aload_3         
	//   34   73:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   35   76:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   36   79:astore_3        
		return (new StringBuilder()).append("http://restapi.amap.com/v4/grasproad/driving?").append(s).append(s1).append(s2).toString();
	//   37   80:new             #117 <Class StringBuilder>
	//   38   83:dup             
	//   39   84:invokespecial   #118 <Method void StringBuilder()>
	//   40   87:ldc1            #149 <String "http://restapi.amap.com/v4/grasproad/driving?">
	//   41   89:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   42   92:aload_1         
	//   43   93:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   44   96:aload_2         
	//   45   97:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   46  100:aload_3         
	//   47  101:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   48  104:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   49  107:areturn         
	}

	protected String f()
	{
		int i1;
		long l2;
		JSONArray jsonarray;
		jsonarray = new JSONArray();
	//    0    0:new             #71  <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #150 <Method void JSONArray()>
	//    3    7:astore          10
		l2 = 0L;
	//    4    9:lconst_0        
	//    5   10:lstore          4
		i1 = 0;
	//    6   12:iconst_0        
	//    7   13:istore_1        
_L6:
		if(i1 >= i.size()) goto _L2; else goto _L1
	//    8   14:iload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #30  <Field List i>
	//   11   19:invokeinterface #153 <Method int List.size()>
	//   12   24:icmpge          256
_L1:
		long l1;
		JSONObject jsonobject;
		TraceLocation tracelocation;
		tracelocation = (TraceLocation)i.get(i1);
	//   13   27:aload_0         
	//   14   28:getfield        #30  <Field List i>
	//   15   31:iload_1         
	//   16   32:invokeinterface #157 <Method Object List.get(int)>
	//   17   37:checkcast       #159 <Class TraceLocation>
	//   18   40:astore          12
		jsonobject = new JSONObject();
	//   19   42:new             #50  <Class JSONObject>
	//   20   45:dup             
	//   21   46:invokespecial   #160 <Method void JSONObject()>
	//   22   49:astore          11
		l1 = l2;
	//   23   51:lload           4
	//   24   53:lstore_2        
		jsonobject.put("x", tracelocation.getLongitude());
	//   25   54:aload           11
	//   26   56:ldc1            #94  <String "x">
	//   27   58:aload           12
	//   28   60:invokevirtual   #164 <Method double TraceLocation.getLongitude()>
	//   29   63:invokevirtual   #168 <Method JSONObject JSONObject.put(String, double)>
	//   30   66:pop             
		l1 = l2;
	//   31   67:lload           4
	//   32   69:lstore_2        
		jsonobject.put("y", tracelocation.getLatitude());
	//   33   70:aload           11
	//   34   72:ldc1            #82  <String "y">
	//   35   74:aload           12
	//   36   76:invokevirtual   #171 <Method double TraceLocation.getLatitude()>
	//   37   79:invokevirtual   #168 <Method JSONObject JSONObject.put(String, double)>
	//   38   82:pop             
		l1 = l2;
	//   39   83:lload           4
	//   40   85:lstore_2        
		jsonobject.put("ag", (int)tracelocation.getBearing());
	//   41   86:aload           11
	//   42   88:ldc1            #173 <String "ag">
	//   43   90:aload           12
	//   44   92:invokevirtual   #177 <Method float TraceLocation.getBearing()>
	//   45   95:f2i             
	//   46   96:invokevirtual   #180 <Method JSONObject JSONObject.put(String, int)>
	//   47   99:pop             
		l1 = l2;
	//   48  100:lload           4
	//   49  102:lstore_2        
		long l4 = tracelocation.getTime();
	//   50  103:aload           12
	//   51  105:invokevirtual   #184 <Method long TraceLocation.getTime()>
	//   52  108:lstore          8
		if(i1 != 0) goto _L4; else goto _L3
	//   53  110:iload_1         
	//   54  111:ifne            296
_L3:
		long l3;
		l3 = l4;
	//   55  114:lload           8
	//   56  116:lstore          6
		if(l4 != 0L)
			break MISSING_BLOCK_LABEL_141;
	//   57  118:lload           8
	//   58  120:lconst_0        
	//   59  121:lcmp            
	//   60  122:ifne            141
		l1 = l2;
	//   61  125:lload           4
	//   62  127:lstore_2        
		l3 = (System.currentTimeMillis() - 10000L) / 1000L;
	//   63  128:invokestatic    #189 <Method long System.currentTimeMillis()>
	//   64  131:ldc2w           #190 <Long 10000L>
	//   65  134:lsub            
	//   66  135:ldc2w           #192 <Long 1000L>
	//   67  138:ldiv            
	//   68  139:lstore          6
		l1 = l2;
	//   69  141:lload           4
	//   70  143:lstore_2        
		jsonobject.put("tm", l3 / 1000L);
	//   71  144:aload           11
	//   72  146:ldc1            #195 <String "tm">
	//   73  148:lload           6
	//   74  150:ldc2w           #192 <Long 1000L>
	//   75  153:ldiv            
	//   76  154:invokevirtual   #198 <Method JSONObject JSONObject.put(String, long)>
	//   77  157:pop             
		l2 = l3;
	//   78  158:lload           6
	//   79  160:lstore          4
		  goto _L5
	//*  80  162:goto            208
_L7:
		l1 = l2;
	//   81  165:lload           4
	//   82  167:lstore_2        
		jsonobject.put("tm", 1);
	//   83  168:aload           11
	//   84  170:ldc1            #195 <String "tm">
	//   85  172:iconst_1        
	//   86  173:invokevirtual   #180 <Method JSONObject JSONObject.put(String, int)>
	//   87  176:pop             
		l2 = l4;
	//   88  177:lload           8
	//   89  179:lstore          4
		  goto _L5
	//*  90  181:goto            208
_L8:
		l1 = l2;
	//   91  184:lload           4
	//   92  186:lstore_2        
		jsonobject.put("tm", (l4 - l2) / 1000L);
	//   93  187:aload           11
	//   94  189:ldc1            #195 <String "tm">
	//   95  191:lload           8
	//   96  193:lload           4
	//   97  195:lsub            
	//   98  196:ldc2w           #192 <Long 1000L>
	//   99  199:ldiv            
	//  100  200:invokevirtual   #198 <Method JSONObject JSONObject.put(String, long)>
	//  101  203:pop             
		l2 = l4;
	//  102  204:lload           8
	//  103  206:lstore          4
_L5:
		l1 = l2;
	//  104  208:lload           4
	//  105  210:lstore_2        
		jsonobject.put("sp", (int)tracelocation.getSpeed());
	//  106  211:aload           11
	//  107  213:ldc1            #200 <String "sp">
	//  108  215:aload           12
	//  109  217:invokevirtual   #203 <Method float TraceLocation.getSpeed()>
	//  110  220:f2i             
	//  111  221:invokevirtual   #180 <Method JSONObject JSONObject.put(String, int)>
	//  112  224:pop             
		l1 = l2;
	//  113  225:lload           4
	//  114  227:lstore_2        
		break MISSING_BLOCK_LABEL_238;
	//  115  228:goto            238
		JSONException jsonexception;
		jsonexception;
	//  116  231:astore          12
		jsonexception.printStackTrace();
	//  117  233:aload           12
	//  118  235:invokevirtual   #106 <Method void JSONException.printStackTrace()>
		jsonarray.put(((Object) (jsonobject)));
	//  119  238:aload           10
	//  120  240:aload           11
	//  121  242:invokevirtual   #206 <Method JSONArray JSONArray.put(Object)>
	//  122  245:pop             
		i1++;
	//  123  246:iload_1         
	//  124  247:iconst_1        
	//  125  248:iadd            
	//  126  249:istore_1        
		l2 = l1;
	//  127  250:lload_2         
	//  128  251:lstore          4
		  goto _L6
	//* 129  253:goto            14
_L2:
		d = (new StringBuilder()).append(c()).append("&").append(jsonarray.toString()).toString();
	//  130  256:aload_0         
	//  131  257:new             #117 <Class StringBuilder>
	//  132  260:dup             
	//  133  261:invokespecial   #118 <Method void StringBuilder()>
	//  134  264:aload_0         
	//  135  265:invokevirtual   #208 <Method String c()>
	//  136  268:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//  137  271:ldc1            #210 <String "&">
	//  138  273:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//  139  276:aload           10
	//  140  278:invokevirtual   #211 <Method String JSONArray.toString()>
	//  141  281:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//  142  284:invokevirtual   #136 <Method String StringBuilder.toString()>
	//  143  287:putfield        #214 <Field String d>
		return jsonarray.toString();
	//  144  290:aload           10
	//  145  292:invokevirtual   #211 <Method String JSONArray.toString()>
	//  146  295:areturn         
_L4:
		if(l4 != 0L && l4 - l2 >= 1000L) goto _L8; else goto _L7
	//  147  296:lload           8
	//  148  298:lconst_0        
	//  149  299:lcmp            
	//  150  300:ifeq            165
	//  151  303:lload           8
	//  152  305:lload           4
	//  153  307:lsub            
	//  154  308:ldc2w           #192 <Long 1000L>
	//  155  311:lcmp            
	//  156  312:ifge            184
	//* 157  315:goto            165
	}

	public void run()
	{
		new ArrayList();
	//    0    0:new             #45  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void ArrayList()>
	//    3    7:pop             
		Object obj;
		obj = ((Object) ((List)d()));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #218 <Method Object d()>
	//    6   12:checkcast       #99  <Class List>
	//    7   15:astore_1        
		break MISSING_BLOCK_LABEL_39;
	//    8   16:goto            39
		obj;
	//    9   19:astore_1        
		try
		{
			gl.a().a(j, l, ((gf) (obj)).a());
	//   10   20:invokestatic    #223 <Method gl gl.a()>
	//   11   23:aload_0         
	//   12   24:getfield        #24  <Field Handler j>
	//   13   27:aload_0         
	//   14   28:getfield        #28  <Field int l>
	//   15   31:aload_1         
	//   16   32:invokevirtual   #224 <Method String gf.a()>
	//   17   35:invokevirtual   #227 <Method void gl.a(Handler, int, String)>
			return;
	//   18   38:return          
		}
	//*  19   39:invokestatic    #223 <Method gl gl.a()>
	//*  20   42:aload_0         
	//*  21   43:getfield        #32  <Field String m>
	//*  22   46:aload_0         
	//*  23   47:getfield        #26  <Field int k>
	//*  24   50:aload_1         
	//*  25   51:invokevirtual   #230 <Method void gl.a(String, int, List)>
	//*  26   54:invokestatic    #223 <Method gl gl.a()>
	//*  27   57:aload_0         
	//*  28   58:getfield        #32  <Field String m>
	//*  29   61:invokevirtual   #233 <Method gl$a gl.a(String)>
	//*  30   64:aload_0         
	//*  31   65:getfield        #24  <Field Handler j>
	//*  32   68:invokevirtual   #238 <Method void gl$a.a(Handler)>
	//*  33   71:return          
		catch(Throwable throwable)
	//*  34   72:astore_1        
		{
			throwable.printStackTrace();
	//   35   73:aload_1         
	//   36   74:invokevirtual   #107 <Method void Throwable.printStackTrace()>
		}
		break MISSING_BLOCK_LABEL_77;
		gl.a().a(m, k, ((List) (obj)));
		gl.a().a(m).a(j);
		return;
	//   37   77:return          
	}

	private List i;
	private Handler j;
	private int k;
	private int l;
	private String m;
}
