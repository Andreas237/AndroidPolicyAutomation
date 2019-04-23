// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import java.net.URL;
import java.util.*;
import org.json.*;

// Referenced classes of package bolts:
//			AppLink, WebViewAppLinkResolver, AppLinkResolver, Task, 
//			MeasurementEvent, Continuation

public class AppLinkNavigation
{
	public static final class NavigationResult extends Enum
	{

		public static NavigationResult valueOf(String s)
		{
			return (NavigationResult)Enum.valueOf(bolts/AppLinkNavigation$NavigationResult, s);
		//    0    0:ldc1            #2   <Class AppLinkNavigation$NavigationResult>
		//    1    2:aload_0         
		//    2    3:invokestatic    #56  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AppLinkNavigation$NavigationResult>
		//    4    9:areturn         
		}

		public static NavigationResult[] values()
		{
			return (NavigationResult[])((NavigationResult []) ($VALUES)).clone();
		//    0    0:getstatic       #41  <Field AppLinkNavigation$NavigationResult[] $VALUES>
		//    1    3:invokevirtual   #63  <Method Object _5B_Lbolts.AppLinkNavigation$NavigationResult_3B_.clone()>
		//    2    6:checkcast       #59  <Class AppLinkNavigation$NavigationResult[]>
		//    3    9:areturn         
		}

		public String getCode()
		{
			return code;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field String code>
		//    2    4:areturn         
		}

		public boolean isSucceeded()
		{
			return succeeded;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field boolean succeeded>
		//    2    4:ireturn         
		}

		private static final NavigationResult $VALUES[];
		public static final NavigationResult APP;
		public static final NavigationResult FAILED;
		public static final NavigationResult WEB;
		private String code;
		private boolean succeeded;

		static 
		{
			FAILED = new NavigationResult("FAILED", 0, "failed", false);
		//    0    0:new             #2   <Class AppLinkNavigation$NavigationResult>
		//    1    3:dup             
		//    2    4:ldc1            #21  <String "FAILED">
		//    3    6:iconst_0        
		//    4    7:ldc1            #23  <String "failed">
		//    5    9:iconst_0        
		//    6   10:invokespecial   #27  <Method void AppLinkNavigation$NavigationResult(String, int, String, boolean)>
		//    7   13:putstatic       #29  <Field AppLinkNavigation$NavigationResult FAILED>
			WEB = new NavigationResult("WEB", 1, "web", true);
		//    8   16:new             #2   <Class AppLinkNavigation$NavigationResult>
		//    9   19:dup             
		//   10   20:ldc1            #30  <String "WEB">
		//   11   22:iconst_1        
		//   12   23:ldc1            #32  <String "web">
		//   13   25:iconst_1        
		//   14   26:invokespecial   #27  <Method void AppLinkNavigation$NavigationResult(String, int, String, boolean)>
		//   15   29:putstatic       #34  <Field AppLinkNavigation$NavigationResult WEB>
			APP = new NavigationResult("APP", 2, "app", true);
		//   16   32:new             #2   <Class AppLinkNavigation$NavigationResult>
		//   17   35:dup             
		//   18   36:ldc1            #35  <String "APP">
		//   19   38:iconst_2        
		//   20   39:ldc1            #37  <String "app">
		//   21   41:iconst_1        
		//   22   42:invokespecial   #27  <Method void AppLinkNavigation$NavigationResult(String, int, String, boolean)>
		//   23   45:putstatic       #39  <Field AppLinkNavigation$NavigationResult APP>
			$VALUES = (new NavigationResult[] {
				FAILED, WEB, APP
			});
		//   24   48:iconst_3        
		//   25   49:anewarray       NavigationResult[]
		//   26   52:dup             
		//   27   53:iconst_0        
		//   28   54:getstatic       #29  <Field AppLinkNavigation$NavigationResult FAILED>
		//   29   57:aastore         
		//   30   58:dup             
		//   31   59:iconst_1        
		//   32   60:getstatic       #34  <Field AppLinkNavigation$NavigationResult WEB>
		//   33   63:aastore         
		//   34   64:dup             
		//   35   65:iconst_2        
		//   36   66:getstatic       #39  <Field AppLinkNavigation$NavigationResult APP>
		//   37   69:aastore         
		//   38   70:putstatic       #41  <Field AppLinkNavigation$NavigationResult[] $VALUES>
		//*  39   73:return          
		}

		private NavigationResult(String s, int i, String s1, boolean flag)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #45  <Method void Enum(String, int)>
			code = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #47  <Field String code>
			succeeded = flag;
		//    7   11:aload_0         
		//    8   12:iload           4
		//    9   14:putfield        #49  <Field boolean succeeded>
		//   10   17:return          
		}
	}


	public AppLinkNavigation(AppLink applink, Bundle bundle, Bundle bundle1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		if(applink != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          55
		{
			Bundle bundle2 = bundle;
	//    4    8:aload_2         
	//    5    9:astore          4
			if(bundle == null)
	//*   6   11:aload_2         
	//*   7   12:ifnonnull       24
				bundle2 = new Bundle();
	//    8   15:new             #42  <Class Bundle>
	//    9   18:dup             
	//   10   19:invokespecial   #43  <Method void Bundle()>
	//   11   22:astore          4
			bundle = bundle1;
	//   12   24:aload_3         
	//   13   25:astore_2        
			if(bundle1 == null)
	//*  14   26:aload_3         
	//*  15   27:ifnonnull       38
				bundle = new Bundle();
	//   16   30:new             #42  <Class Bundle>
	//   17   33:dup             
	//   18   34:invokespecial   #43  <Method void Bundle()>
	//   19   37:astore_2        
			appLink = applink;
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:putfield        #45  <Field AppLink appLink>
			extras = bundle2;
	//   23   43:aload_0         
	//   24   44:aload           4
	//   25   46:putfield        #47  <Field Bundle extras>
			appLinkData = bundle;
	//   26   49:aload_0         
	//   27   50:aload_2         
	//   28   51:putfield        #49  <Field Bundle appLinkData>
			return;
	//   29   54:return          
		} else
		{
			throw new IllegalArgumentException("appLink must not be null.");
	//   30   55:new             #51  <Class IllegalArgumentException>
	//   31   58:dup             
	//   32   59:ldc1            #53  <String "appLink must not be null.">
	//   33   61:invokespecial   #56  <Method void IllegalArgumentException(String)>
	//   34   64:athrow          
		}
	}

	private Bundle buildAppLinkDataForNavigation(Context context)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #42  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void Bundle()>
	//    3    7:astore_2        
		Bundle bundle1 = new Bundle();
	//    4    8:new             #42  <Class Bundle>
	//    5   11:dup             
	//    6   12:invokespecial   #43  <Method void Bundle()>
	//    7   15:astore_3        
		if(context != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          71
		{
			Object obj = ((Object) (context.getPackageName()));
	//   10   20:aload_1         
	//   11   21:invokevirtual   #65  <Method String Context.getPackageName()>
	//   12   24:astore          4
			if(obj != null)
	//*  13   26:aload           4
	//*  14   28:ifnull          39
				bundle1.putString("package", ((String) (obj)));
	//   15   31:aload_3         
	//   16   32:ldc1            #19  <String "package">
	//   17   34:aload           4
	//   18   36:invokevirtual   #69  <Method void Bundle.putString(String, String)>
			obj = ((Object) (context.getApplicationInfo()));
	//   19   39:aload_1         
	//   20   40:invokevirtual   #73  <Method ApplicationInfo Context.getApplicationInfo()>
	//   21   43:astore          4
			if(obj != null)
	//*  22   45:aload           4
	//*  23   47:ifnull          71
			{
				context = ((Context) (context.getString(((ApplicationInfo) (obj)).labelRes)));
	//   24   50:aload_1         
	//   25   51:aload           4
	//   26   53:getfield        #79  <Field int ApplicationInfo.labelRes>
	//   27   56:invokevirtual   #83  <Method String Context.getString(int)>
	//   28   59:astore_1        
				if(context != null)
	//*  29   60:aload_1         
	//*  30   61:ifnull          71
					bundle1.putString("app_name", ((String) (context)));
	//   31   64:aload_3         
	//   32   65:ldc1            #16  <String "app_name">
	//   33   67:aload_1         
	//   34   68:invokevirtual   #69  <Method void Bundle.putString(String, String)>
			}
		}
		bundle.putAll(getAppLinkData());
	//   35   71:aload_2         
	//   36   72:aload_0         
	//   37   73:invokevirtual   #87  <Method Bundle getAppLinkData()>
	//   38   76:invokevirtual   #91  <Method void Bundle.putAll(Bundle)>
		bundle.putString("target_url", getAppLink().getSourceUrl().toString());
	//   39   79:aload_2         
	//   40   80:ldc1            #93  <String "target_url">
	//   41   82:aload_0         
	//   42   83:invokevirtual   #97  <Method AppLink getAppLink()>
	//   43   86:invokevirtual   #103 <Method Uri AppLink.getSourceUrl()>
	//   44   89:invokevirtual   #108 <Method String Uri.toString()>
	//   45   92:invokevirtual   #69  <Method void Bundle.putString(String, String)>
		bundle.putString("version", "1.0");
	//   46   95:aload_2         
	//   47   96:ldc1            #25  <String "version">
	//   48   98:ldc1            #28  <String "1.0">
	//   49  100:invokevirtual   #69  <Method void Bundle.putString(String, String)>
		bundle.putString("user_agent", "Bolts Android 1.4.0");
	//   50  103:aload_2         
	//   51  104:ldc1            #22  <String "user_agent">
	//   52  106:ldc1            #110 <String "Bolts Android 1.4.0">
	//   53  108:invokevirtual   #69  <Method void Bundle.putString(String, String)>
		bundle.putBundle("referer_app_link", bundle1);
	//   54  111:aload_2         
	//   55  112:ldc1            #13  <String "referer_app_link">
	//   56  114:aload_3         
	//   57  115:invokevirtual   #114 <Method void Bundle.putBundle(String, Bundle)>
		bundle.putBundle("extras", getExtras());
	//   58  118:aload_2         
	//   59  119:ldc1            #115 <String "extras">
	//   60  121:aload_0         
	//   61  122:invokevirtual   #118 <Method Bundle getExtras()>
	//   62  125:invokevirtual   #114 <Method void Bundle.putBundle(String, Bundle)>
		return bundle;
	//   63  128:aload_2         
	//   64  129:areturn         
	}

	public static AppLinkResolver getDefaultResolver()
	{
		return defaultResolver;
	//    0    0:getstatic       #122 <Field AppLinkResolver defaultResolver>
	//    1    3:areturn         
	}

	private JSONObject getJSONForBundle(Bundle bundle)
		throws JSONException
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #128 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #129 <Method void JSONObject()>
	//    3    7:astore_2        
		String s;
		for(Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); jsonobject.put(s, getJSONValue(bundle.get(s))))
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #133 <Method Set Bundle.keySet()>
	//*   6   12:invokeinterface #139 <Method Iterator Set.iterator()>
	//*   7   17:astore_3        
	//*   8   18:aload_3         
	//*   9   19:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            58
			s = (String)iterator.next();
	//   11   27:aload_3         
	//   12   28:invokeinterface #149 <Method Object Iterator.next()>
	//   13   33:checkcast       #151 <Class String>
	//   14   36:astore          4

	//   15   38:aload_2         
	//   16   39:aload           4
	//   17   41:aload_0         
	//   18   42:aload_1         
	//   19   43:aload           4
	//   20   45:invokevirtual   #155 <Method Object Bundle.get(String)>
	//   21   48:invokespecial   #159 <Method Object getJSONValue(Object)>
	//   22   51:invokevirtual   #163 <Method JSONObject JSONObject.put(String, Object)>
	//   23   54:pop             
	//*  24   55:goto            18
		return jsonobject;
	//   25   58:aload_2         
	//   26   59:areturn         
	}

	private Object getJSONValue(Object obj)
		throws JSONException
	{
		if(obj instanceof Bundle)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #42  <Class Bundle>
	//*   2    4:ifeq            16
			return ((Object) (getJSONForBundle((Bundle)obj)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #42  <Class Bundle>
	//    6   12:invokespecial   #168 <Method JSONObject getJSONForBundle(Bundle)>
	//    7   15:areturn         
		if(obj instanceof CharSequence)
	//*   8   16:aload_1         
	//*   9   17:instanceof      #170 <Class CharSequence>
	//*  10   20:ifeq            28
			return ((Object) (obj.toString()));
	//   11   23:aload_1         
	//   12   24:invokevirtual   #171 <Method String Object.toString()>
	//   13   27:areturn         
		if(obj instanceof List)
	//*  14   28:aload_1         
	//*  15   29:instanceof      #173 <Class List>
	//*  16   32:ifeq            85
		{
			JSONArray jsonarray = new JSONArray();
	//   17   35:new             #175 <Class JSONArray>
	//   18   38:dup             
	//   19   39:invokespecial   #176 <Method void JSONArray()>
	//   20   42:astore          13
			for(obj = ((Object) (((List)obj).iterator())); ((Iterator) (obj)).hasNext(); jsonarray.put(getJSONValue(((Iterator) (obj)).next())));
	//   21   44:aload_1         
	//   22   45:checkcast       #173 <Class List>
	//   23   48:invokeinterface #177 <Method Iterator List.iterator()>
	//   24   53:astore_1        
	//   25   54:aload_1         
	//   26   55:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//   27   60:ifeq            82
	//   28   63:aload           13
	//   29   65:aload_0         
	//   30   66:aload_1         
	//   31   67:invokeinterface #149 <Method Object Iterator.next()>
	//   32   72:invokespecial   #159 <Method Object getJSONValue(Object)>
	//   33   75:invokevirtual   #180 <Method JSONArray JSONArray.put(Object)>
	//   34   78:pop             
	//*  35   79:goto            54
			return ((Object) (jsonarray));
	//   36   82:aload           13
	//   37   84:areturn         
		}
		boolean flag7 = obj instanceof SparseArray;
	//   38   85:aload_1         
	//   39   86:instanceof      #182 <Class SparseArray>
	//   40   89:istore          12
		int i = 0;
	//   41   91:iconst_0        
	//   42   92:istore_2        
		int j2 = 0;
	//   43   93:iconst_0        
	//   44   94:istore_3        
		int j4 = 0;
	//   45   95:iconst_0        
	//   46   96:istore          4
		boolean flag = false;
	//   47   98:iconst_0        
	//   48   99:istore          5
		boolean flag1 = false;
	//   49  101:iconst_0        
	//   50  102:istore          6
		boolean flag2 = false;
	//   51  104:iconst_0        
	//   52  105:istore          7
		boolean flag3 = false;
	//   53  107:iconst_0        
	//   54  108:istore          8
		boolean flag4 = false;
	//   55  110:iconst_0        
	//   56  111:istore          9
		boolean flag5 = false;
	//   57  113:iconst_0        
	//   58  114:istore          10
		boolean flag6 = false;
	//   59  116:iconst_0        
	//   60  117:istore          11
		if(flag7)
	//*  61  119:iload           12
	//*  62  121:ifeq            179
		{
			JSONArray jsonarray1 = new JSONArray();
	//   63  124:new             #175 <Class JSONArray>
	//   64  127:dup             
	//   65  128:invokespecial   #176 <Method void JSONArray()>
	//   66  131:astore          13
			obj = ((Object) ((SparseArray)obj));
	//   67  133:aload_1         
	//   68  134:checkcast       #182 <Class SparseArray>
	//   69  137:astore_1        
			for(i = ((int) (flag6)); i < ((SparseArray) (obj)).size(); i++)
	//*  70  138:iload           11
	//*  71  140:istore_2        
	//*  72  141:iload_2         
	//*  73  142:aload_1         
	//*  74  143:invokevirtual   #186 <Method int SparseArray.size()>
	//*  75  146:icmpge          176
				jsonarray1.put(((SparseArray) (obj)).keyAt(i), getJSONValue(((SparseArray) (obj)).valueAt(i)));
	//   76  149:aload           13
	//   77  151:aload_1         
	//   78  152:iload_2         
	//   79  153:invokevirtual   #190 <Method int SparseArray.keyAt(int)>
	//   80  156:aload_0         
	//   81  157:aload_1         
	//   82  158:iload_2         
	//   83  159:invokevirtual   #194 <Method Object SparseArray.valueAt(int)>
	//   84  162:invokespecial   #159 <Method Object getJSONValue(Object)>
	//   85  165:invokevirtual   #197 <Method JSONArray JSONArray.put(int, Object)>
	//   86  168:pop             

	//   87  169:iload_2         
	//   88  170:iconst_1        
	//   89  171:iadd            
	//   90  172:istore_2        
	//*  91  173:goto            141
			return ((Object) (jsonarray1));
	//   92  176:aload           13
	//   93  178:areturn         
		}
		if(obj instanceof Character)
	//*  94  179:aload_1         
	//*  95  180:instanceof      #199 <Class Character>
	//*  96  183:ifeq            191
			return ((Object) (obj.toString()));
	//   97  186:aload_1         
	//   98  187:invokevirtual   #171 <Method String Object.toString()>
	//   99  190:areturn         
		if(obj instanceof Boolean)
	//* 100  191:aload_1         
	//* 101  192:instanceof      #201 <Class Boolean>
	//* 102  195:ifeq            200
			return obj;
	//  103  198:aload_1         
	//  104  199:areturn         
		if(obj instanceof Number)
	//* 105  200:aload_1         
	//* 106  201:instanceof      #203 <Class Number>
	//* 107  204:ifeq            246
			if(!(obj instanceof Double) && !(obj instanceof Float))
	//* 108  207:aload_1         
	//* 109  208:instanceof      #205 <Class Double>
	//* 110  211:ifne            235
	//* 111  214:aload_1         
	//* 112  215:instanceof      #207 <Class Float>
	//* 113  218:ifeq            224
	//* 114  221:goto            235
				return ((Object) (Long.valueOf(((Number)obj).longValue())));
	//  115  224:aload_1         
	//  116  225:checkcast       #203 <Class Number>
	//  117  228:invokevirtual   #211 <Method long Number.longValue()>
	//  118  231:invokestatic    #217 <Method Long Long.valueOf(long)>
	//  119  234:areturn         
			else
				return ((Object) (Double.valueOf(((Number)obj).doubleValue())));
	//  120  235:aload_1         
	//  121  236:checkcast       #203 <Class Number>
	//  122  239:invokevirtual   #221 <Method double Number.doubleValue()>
	//  123  242:invokestatic    #224 <Method Double Double.valueOf(double)>
	//  124  245:areturn         
		if(obj instanceof boolean[])
	//* 125  246:aload_1         
	//* 126  247:instanceof      #226 <Class boolean[]>
	//* 127  250:ifeq            301
		{
			JSONArray jsonarray2 = new JSONArray();
	//  128  253:new             #175 <Class JSONArray>
	//  129  256:dup             
	//  130  257:invokespecial   #176 <Method void JSONArray()>
	//  131  260:astore          13
			obj = ((Object) ((boolean[])obj));
	//  132  262:aload_1         
	//  133  263:checkcast       #226 <Class boolean[]>
	//  134  266:astore_1        
			for(j2 = obj.length; i < j2; i++)
	//* 135  267:aload_1         
	//* 136  268:arraylength     
	//* 137  269:istore_3        
	//* 138  270:iload_2         
	//* 139  271:iload_3         
	//* 140  272:icmpge          298
				jsonarray2.put(getJSONValue(((Object) (Boolean.valueOf(((boolean) (obj[i])))))));
	//  141  275:aload           13
	//  142  277:aload_0         
	//  143  278:aload_1         
	//  144  279:iload_2         
	//  145  280:baload          
	//  146  281:invokestatic    #229 <Method Boolean Boolean.valueOf(boolean)>
	//  147  284:invokespecial   #159 <Method Object getJSONValue(Object)>
	//  148  287:invokevirtual   #180 <Method JSONArray JSONArray.put(Object)>
	//  149  290:pop             

	//  150  291:iload_2         
	//  151  292:iconst_1        
	//  152  293:iadd            
	//  153  294:istore_2        
	//* 154  295:goto            270
			return ((Object) (jsonarray2));
	//  155  298:aload           13
	//  156  300:areturn         
		}
		if(obj instanceof char[])
	//* 157  301:aload_1         
	//* 158  302:instanceof      #231 <Class char[]>
	//* 159  305:ifeq            360
		{
			JSONArray jsonarray3 = new JSONArray();
	//  160  308:new             #175 <Class JSONArray>
	//  161  311:dup             
	//  162  312:invokespecial   #176 <Method void JSONArray()>
	//  163  315:astore          13
			obj = ((Object) ((char[])obj));
	//  164  317:aload_1         
	//  165  318:checkcast       #231 <Class char[]>
	//  166  321:astore_1        
			j4 = obj.length;
	//  167  322:aload_1         
	//  168  323:arraylength     
	//  169  324:istore          4
			for(int j = j2; j < j4; j++)
	//* 170  326:iload_3         
	//* 171  327:istore_2        
	//* 172  328:iload_2         
	//* 173  329:iload           4
	//* 174  331:icmpge          357
				jsonarray3.put(getJSONValue(((Object) (Character.valueOf(obj[j])))));
	//  175  334:aload           13
	//  176  336:aload_0         
	//  177  337:aload_1         
	//  178  338:iload_2         
	//  179  339:caload          
	//  180  340:invokestatic    #234 <Method Character Character.valueOf(char)>
	//  181  343:invokespecial   #159 <Method Object getJSONValue(Object)>
	//  182  346:invokevirtual   #180 <Method JSONArray JSONArray.put(Object)>
	//  183  349:pop             

	//  184  350:iload_2         
	//  185  351:iconst_1        
	//  186  352:iadd            
	//  187  353:istore_2        
	//* 188  354:goto            328
			return ((Object) (jsonarray3));
	//  189  357:aload           13
	//  190  359:areturn         
		}
		if(obj instanceof CharSequence[])
	//* 191  360:aload_1         
	//* 192  361:instanceof      #236 <Class CharSequence[]>
	//* 193  364:ifeq            415
		{
			JSONArray jsonarray4 = new JSONArray();
	//  194  367:new             #175 <Class JSONArray>
	//  195  370:dup             
	//  196  371:invokespecial   #176 <Method void JSONArray()>
	//  197  374:astore          13
			obj = ((Object) ((CharSequence[])obj));
	//  198  376:aload_1         
	//  199  377:checkcast       #236 <Class CharSequence[]>
	//  200  380:astore_1        
			int k2 = obj.length;
	//  201  381:aload_1         
	//  202  382:arraylength     
	//  203  383:istore_3        
			for(int k = j4; k < k2; k++)
	//* 204  384:iload           4
	//* 205  386:istore_2        
	//* 206  387:iload_2         
	//* 207  388:iload_3         
	//* 208  389:icmpge          412
				jsonarray4.put(getJSONValue(((Object) (obj[k]))));
	//  209  392:aload           13
	//  210  394:aload_0         
	//  211  395:aload_1         
	//  212  396:iload_2         
	//  213  397:aaload          
	//  214  398:invokespecial   #159 <Method Object getJSONValue(Object)>
	//  215  401:invokevirtual   #180 <Method JSONArray JSONArray.put(Object)>
	//  216  404:pop             

	//  217  405:iload_2         
	//  218  406:iconst_1        
	//  219  407:iadd            
	//  220  408:istore_2        
	//* 221  409:goto            387
			return ((Object) (jsonarray4));
	//  222  412:aload           13
	//  223  414:areturn         
		}
		if(obj instanceof double[])
	//* 224  415:aload_1         
	//* 225  416:instanceof      #238 <Class double[]>
	//* 226  419:ifeq            473
		{
			JSONArray jsonarray5 = new JSONArray();
	//  227  422:new             #175 <Class JSONArray>
	//  228  425:dup             
	//  229  426:invokespecial   #176 <Method void JSONArray()>
	//  230  429:astore          13
			obj = ((Object) ((double[])obj));
	//  231  431:aload_1         
	//  232  432:checkcast       #238 <Class double[]>
	//  233  435:astore_1        
			int l2 = obj.length;
	//  234  436:aload_1         
	//  235  437:arraylength     
	//  236  438:istore_3        
			for(int l = ((int) (flag)); l < l2; l++)
	//* 237  439:iload           5
	//* 238  441:istore_2        
	//* 239  442:iload_2         
	//* 240  443:iload_3         
	//* 241  444:icmpge          470
				jsonarray5.put(getJSONValue(((Object) (Double.valueOf(obj[l])))));
	//  242  447:aload           13
	//  243  449:aload_0         
	//  244  450:aload_1         
	//  245  451:iload_2         
	//  246  452:daload          
	//  247  453:invokestatic    #224 <Method Double Double.valueOf(double)>
	//  248  456:invokespecial   #159 <Method Object getJSONValue(Object)>
	//  249  459:invokevirtual   #180 <Method JSONArray JSONArray.put(Object)>
	//  250  462:pop             

	//  251  463:iload_2         
	//  252  464:iconst_1        
	//  253  465:iadd            
	//  254  466:istore_2        
	//* 255  467:goto            442
			return ((Object) (jsonarray5));
	//  256  470:aload           13
	//  257  472:areturn         
		}
		if(obj instanceof float[])
	//* 258  473:aload_1         
	//* 259  474:instanceof      #240 <Class float[]>
	//* 260  477:ifeq            531
		{
			JSONArray jsonarray6 = new JSONArray();
	//  261  480:new             #175 <Class JSONArray>
	//  262  483:dup             
	//  263  484:invokespecial   #176 <Method void JSONArray()>
	//  264  487:astore          13
			obj = ((Object) ((float[])obj));
	//  265  489:aload_1         
	//  266  490:checkcast       #240 <Class float[]>
	//  267  493:astore_1        
			int i3 = obj.length;
	//  268  494:aload_1         
	//  269  495:arraylength     
	//  270  496:istore_3        
			for(int i1 = ((int) (flag1)); i1 < i3; i1++)
	//* 271  497:iload           6
	//* 272  499:istore_2        
	//* 273  500:iload_2         
	//* 274  501:iload_3         
	//* 275  502:icmpge          528
				jsonarray6.put(getJSONValue(((Object) (Float.valueOf(obj[i1])))));
	//  276  505:aload           13
	//  277  507:aload_0         
	//  278  508:aload_1         
	//  279  509:iload_2         
	//  280  510:faload          
	//  281  511:invokestatic    #243 <Method Float Float.valueOf(float)>
	//  282  514:invokespecial   #159 <Method Object getJSONValue(Object)>
	//  283  517:invokevirtual   #180 <Method JSONArray JSONArray.put(Object)>
	//  284  520:pop             

	//  285  521:iload_2         
	//  286  522:iconst_1        
	//  287  523:iadd            
	//  288  524:istore_2        
	//* 289  525:goto            500
			return ((Object) (jsonarray6));
	//  290  528:aload           13
	//  291  530:areturn         
		}
		if(obj instanceof int[])
	//* 292  531:aload_1         
	//* 293  532:instanceof      #245 <Class int[]>
	//* 294  535:ifeq            589
		{
			JSONArray jsonarray7 = new JSONArray();
	//  295  538:new             #175 <Class JSONArray>
	//  296  541:dup             
	//  297  542:invokespecial   #176 <Method void JSONArray()>
	//  298  545:astore          13
			obj = ((Object) ((int[])obj));
	//  299  547:aload_1         
	//  300  548:checkcast       #245 <Class int[]>
	//  301  551:astore_1        
			int j3 = obj.length;
	//  302  552:aload_1         
	//  303  553:arraylength     
	//  304  554:istore_3        
			for(int j1 = ((int) (flag2)); j1 < j3; j1++)
	//* 305  555:iload           7
	//* 306  557:istore_2        
	//* 307  558:iload_2         
	//* 308  559:iload_3         
	//* 309  560:icmpge          586
				jsonarray7.put(getJSONValue(((Object) (Integer.valueOf(obj[j1])))));
	//  310  563:aload           13
	//  311  565:aload_0         
	//  312  566:aload_1         
	//  313  567:iload_2         
	//  314  568:iaload          
	//  315  569:invokestatic    #250 <Method Integer Integer.valueOf(int)>
	//  316  572:invokespecial   #159 <Method Object getJSONValue(Object)>
	//  317  575:invokevirtual   #180 <Method JSONArray JSONArray.put(Object)>
	//  318  578:pop             

	//  319  579:iload_2         
	//  320  580:iconst_1        
	//  321  581:iadd            
	//  322  582:istore_2        
	//* 323  583:goto            558
			return ((Object) (jsonarray7));
	//  324  586:aload           13
	//  325  588:areturn         
		}
		if(obj instanceof long[])
	//* 326  589:aload_1         
	//* 327  590:instanceof      #252 <Class long[]>
	//* 328  593:ifeq            647
		{
			JSONArray jsonarray8 = new JSONArray();
	//  329  596:new             #175 <Class JSONArray>
	//  330  599:dup             
	//  331  600:invokespecial   #176 <Method void JSONArray()>
	//  332  603:astore          13
			obj = ((Object) ((long[])obj));
	//  333  605:aload_1         
	//  334  606:checkcast       #252 <Class long[]>
	//  335  609:astore_1        
			int k3 = obj.length;
	//  336  610:aload_1         
	//  337  611:arraylength     
	//  338  612:istore_3        
			for(int k1 = ((int) (flag3)); k1 < k3; k1++)
	//* 339  613:iload           8
	//* 340  615:istore_2        
	//* 341  616:iload_2         
	//* 342  617:iload_3         
	//* 343  618:icmpge          644
				jsonarray8.put(getJSONValue(((Object) (Long.valueOf(obj[k1])))));
	//  344  621:aload           13
	//  345  623:aload_0         
	//  346  624:aload_1         
	//  347  625:iload_2         
	//  348  626:laload          
	//  349  627:invokestatic    #217 <Method Long Long.valueOf(long)>
	//  350  630:invokespecial   #159 <Method Object getJSONValue(Object)>
	//  351  633:invokevirtual   #180 <Method JSONArray JSONArray.put(Object)>
	//  352  636:pop             

	//  353  637:iload_2         
	//  354  638:iconst_1        
	//  355  639:iadd            
	//  356  640:istore_2        
	//* 357  641:goto            616
			return ((Object) (jsonarray8));
	//  358  644:aload           13
	//  359  646:areturn         
		}
		if(obj instanceof short[])
	//* 360  647:aload_1         
	//* 361  648:instanceof      #254 <Class short[]>
	//* 362  651:ifeq            705
		{
			JSONArray jsonarray9 = new JSONArray();
	//  363  654:new             #175 <Class JSONArray>
	//  364  657:dup             
	//  365  658:invokespecial   #176 <Method void JSONArray()>
	//  366  661:astore          13
			obj = ((Object) ((short[])obj));
	//  367  663:aload_1         
	//  368  664:checkcast       #254 <Class short[]>
	//  369  667:astore_1        
			int l3 = obj.length;
	//  370  668:aload_1         
	//  371  669:arraylength     
	//  372  670:istore_3        
			for(int l1 = ((int) (flag4)); l1 < l3; l1++)
	//* 373  671:iload           9
	//* 374  673:istore_2        
	//* 375  674:iload_2         
	//* 376  675:iload_3         
	//* 377  676:icmpge          702
				jsonarray9.put(getJSONValue(((Object) (Short.valueOf(obj[l1])))));
	//  378  679:aload           13
	//  379  681:aload_0         
	//  380  682:aload_1         
	//  381  683:iload_2         
	//  382  684:saload          
	//  383  685:invokestatic    #259 <Method Short Short.valueOf(short)>
	//  384  688:invokespecial   #159 <Method Object getJSONValue(Object)>
	//  385  691:invokevirtual   #180 <Method JSONArray JSONArray.put(Object)>
	//  386  694:pop             

	//  387  695:iload_2         
	//  388  696:iconst_1        
	//  389  697:iadd            
	//  390  698:istore_2        
	//* 391  699:goto            674
			return ((Object) (jsonarray9));
	//  392  702:aload           13
	//  393  704:areturn         
		}
		if(obj instanceof String[])
	//* 394  705:aload_1         
	//* 395  706:instanceof      #261 <Class String[]>
	//* 396  709:ifeq            768
		{
			JSONArray jsonarray10 = new JSONArray();
	//  397  712:new             #175 <Class JSONArray>
	//  398  715:dup             
	//  399  716:invokespecial   #176 <Method void JSONArray()>
	//  400  719:astore          13
			obj = ((Object) ((String[])obj));
	//  401  721:aload_1         
	//  402  722:checkcast       #261 <Class String[]>
	//  403  725:astore_1        
			int i4 = obj.length;
	//  404  726:aload_1         
	//  405  727:arraylength     
	//  406  728:istore_3        
			int i2 = ((int) (flag5));
	//  407  729:iload           10
	//  408  731:istore_2        
			while(i2 < i4) 
	//* 409  732:iload_2         
	//* 410  733:iload_3         
	//* 411  734:icmpge          765
			{
				Object obj1 = ((Object) (obj[i2]));
	//  412  737:aload_1         
	//  413  738:iload_2         
	//  414  739:aaload          
	//  415  740:astore          14
				try
				{
					obj1 = getJSONValue(obj1);
	//  416  742:aload_0         
	//  417  743:aload           14
	//  418  745:invokespecial   #159 <Method Object getJSONValue(Object)>
	//  419  748:astore          14
				}
	//* 420  750:aload           13
	//* 421  752:aload           14
	//* 422  754:invokevirtual   #180 <Method JSONArray JSONArray.put(Object)>
	//* 423  757:pop             
	//* 424  758:iload_2         
	//* 425  759:iconst_1        
	//* 426  760:iadd            
	//* 427  761:istore_2        
	//* 428  762:goto            732
	//* 429  765:aload           13
	//* 430  767:areturn         
	//* 431  768:aconst_null     
	//* 432  769:areturn         
				// Misplaced declaration of an exception variable
				catch(Object obj)
	//* 433  770:astore_1        
				{
					throw obj;
	//  434  771:aload_1         
	//  435  772:athrow          
				}
				jsonarray10.put(obj1);
				i2++;
			}
			return ((Object) (jsonarray10));
		} else
		{
			return ((Object) (null));
		}
	}

	private static AppLinkResolver getResolver(Context context)
	{
		if(getDefaultResolver() != null)
	//*   0    0:invokestatic    #265 <Method AppLinkResolver getDefaultResolver()>
	//*   1    3:ifnull          10
			return getDefaultResolver();
	//    2    6:invokestatic    #265 <Method AppLinkResolver getDefaultResolver()>
	//    3    9:areturn         
		else
			return ((AppLinkResolver) (new WebViewAppLinkResolver(context)));
	//    4   10:new             #267 <Class WebViewAppLinkResolver>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #270 <Method void WebViewAppLinkResolver(Context)>
	//    8   18:areturn         
	}

	public static NavigationResult navigate(Context context, AppLink applink)
	{
		return (new AppLinkNavigation(applink, ((Bundle) (null)), ((Bundle) (null)))).navigate(context);
	//    0    0:new             #2   <Class AppLinkNavigation>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:invokespecial   #274 <Method void AppLinkNavigation(AppLink, Bundle, Bundle)>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #277 <Method AppLinkNavigation$NavigationResult navigate(Context)>
	//    8   14:areturn         
	}

	public static Task navigateInBackground(Context context, Uri uri)
	{
		return navigateInBackground(context, uri, getResolver(context));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokestatic    #281 <Method AppLinkResolver getResolver(Context)>
	//    4    6:invokestatic    #284 <Method Task navigateInBackground(Context, Uri, AppLinkResolver)>
	//    5    9:areturn         
	}

	public static Task navigateInBackground(Context context, Uri uri, AppLinkResolver applinkresolver)
	{
		return applinkresolver.getAppLinkFromUrlInBackground(uri).onSuccess(new Continuation(context) {

			public NavigationResult then(Task task)
				throws Exception
			{
				return AppLinkNavigation.navigate(context, (AppLink)task.getResult());
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field Context val$context>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #32  <Method Object Task.getResult()>
			//    4    8:checkcast       #34  <Class AppLink>
			//    5   11:invokestatic    #38  <Method AppLinkNavigation$NavigationResult AppLinkNavigation.navigate(Context, AppLink)>
			//    6   14:areturn         
			}

			public volatile Object then(Task task)
				throws Exception
			{
				return ((Object) (then(task)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #44  <Method AppLinkNavigation$NavigationResult then(Task)>
			//    3    5:areturn         
			}

			final Context val$context;

			
			{
				context = context1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Context val$context>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
, Task.UI_THREAD_EXECUTOR);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokeinterface #292 <Method Task AppLinkResolver.getAppLinkFromUrlInBackground(Uri)>
	//    3    7:new             #6   <Class AppLinkNavigation$1>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #293 <Method void AppLinkNavigation$1(Context)>
	//    7   15:getstatic       #299 <Field java.util.concurrent.Executor Task.UI_THREAD_EXECUTOR>
	//    8   18:invokevirtual   #303 <Method Task Task.onSuccess(Continuation, java.util.concurrent.Executor)>
	//    9   21:areturn         
	}

	public static Task navigateInBackground(Context context, String s)
	{
		return navigateInBackground(context, s, getResolver(context));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokestatic    #281 <Method AppLinkResolver getResolver(Context)>
	//    4    6:invokestatic    #308 <Method Task navigateInBackground(Context, String, AppLinkResolver)>
	//    5    9:areturn         
	}

	public static Task navigateInBackground(Context context, String s, AppLinkResolver applinkresolver)
	{
		return navigateInBackground(context, Uri.parse(s), applinkresolver);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #313 <Method Uri Uri.parse(String)>
	//    3    5:aload_2         
	//    4    6:invokestatic    #284 <Method Task navigateInBackground(Context, Uri, AppLinkResolver)>
	//    5    9:areturn         
	}

	public static Task navigateInBackground(Context context, URL url)
	{
		return navigateInBackground(context, url, getResolver(context));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokestatic    #281 <Method AppLinkResolver getResolver(Context)>
	//    4    6:invokestatic    #318 <Method Task navigateInBackground(Context, URL, AppLinkResolver)>
	//    5    9:areturn         
	}

	public static Task navigateInBackground(Context context, URL url, AppLinkResolver applinkresolver)
	{
		return navigateInBackground(context, Uri.parse(url.toString()), applinkresolver);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #322 <Method String URL.toString()>
	//    3    5:invokestatic    #313 <Method Uri Uri.parse(String)>
	//    4    8:aload_2         
	//    5    9:invokestatic    #284 <Method Task navigateInBackground(Context, Uri, AppLinkResolver)>
	//    6   12:areturn         
	}

	private void sendAppLinkNavigateEventBroadcast(Context context, Intent intent, NavigationResult navigationresult, JSONException jsonexception)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #327 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #328 <Method void HashMap()>
	//    3    7:astore          5
		if(jsonexception != null)
	//*   4    9:aload           4
	//*   5   11:ifnull          30
			((Map) (hashmap)).put("error", ((Object) (jsonexception.getLocalizedMessage())));
	//    6   14:aload           5
	//    7   16:ldc2            #330 <String "error">
	//    8   19:aload           4
	//    9   21:invokevirtual   #333 <Method String JSONException.getLocalizedMessage()>
	//   10   24:invokeinterface #338 <Method Object Map.put(Object, Object)>
	//   11   29:pop             
		if(navigationresult.isSucceeded())
	//*  12   30:aload_3         
	//*  13   31:invokevirtual   #341 <Method boolean AppLinkNavigation$NavigationResult.isSucceeded()>
	//*  14   34:ifeq            45
			jsonexception = "1";
	//   15   37:ldc2            #343 <String "1">
	//   16   40:astore          4
		else
	//*  17   42:goto            50
			jsonexception = "0";
	//   18   45:ldc2            #345 <String "0">
	//   19   48:astore          4
		((Map) (hashmap)).put("success", ((Object) (jsonexception)));
	//   20   50:aload           5
	//   21   52:ldc2            #347 <String "success">
	//   22   55:aload           4
	//   23   57:invokeinterface #338 <Method Object Map.put(Object, Object)>
	//   24   62:pop             
		((Map) (hashmap)).put("type", ((Object) (navigationresult.getCode())));
	//   25   63:aload           5
	//   26   65:ldc2            #349 <String "type">
	//   27   68:aload_3         
	//   28   69:invokevirtual   #352 <Method String AppLinkNavigation$NavigationResult.getCode()>
	//   29   72:invokeinterface #338 <Method Object Map.put(Object, Object)>
	//   30   77:pop             
		MeasurementEvent.sendBroadcastEvent(context, "al_nav_out", intent, ((Map) (hashmap)));
	//   31   78:aload_1         
	//   32   79:ldc2            #354 <String "al_nav_out">
	//   33   82:aload_2         
	//   34   83:aload           5
	//   35   85:invokestatic    #360 <Method void MeasurementEvent.sendBroadcastEvent(Context, String, Intent, Map)>
	//   36   88:return          
	}

	public static void setDefaultResolver(AppLinkResolver applinkresolver)
	{
		defaultResolver = applinkresolver;
	//    0    0:aload_0         
	//    1    1:putstatic       #122 <Field AppLinkResolver defaultResolver>
	//    2    4:return          
	}

	public AppLink getAppLink()
	{
		return appLink;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AppLink appLink>
	//    2    4:areturn         
	}

	public Bundle getAppLinkData()
	{
		return appLinkData;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Bundle appLinkData>
	//    2    4:areturn         
	}

	public Bundle getExtras()
	{
		return extras;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Bundle extras>
	//    2    4:areturn         
	}

	public NavigationResult navigate(Context context)
	{
		Object obj;
		Object obj1;
label0:
		{
			PackageManager packagemanager = context.getPackageManager();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #366 <Method PackageManager Context.getPackageManager()>
	//    2    4:astore          4
			obj1 = ((Object) (buildAppLinkDataForNavigation(context)));
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #368 <Method Bundle buildAppLinkDataForNavigation(Context)>
	//    6   11:astore_3        
			for(Iterator iterator = getAppLink().getTargets().iterator(); iterator.hasNext();)
	//*   7   12:aload_0         
	//*   8   13:invokevirtual   #97  <Method AppLink getAppLink()>
	//*   9   16:invokevirtual   #372 <Method List AppLink.getTargets()>
	//*  10   19:invokeinterface #177 <Method Iterator List.iterator()>
	//*  11   24:astore          5
	//*  12   26:aload           5
	//*  13   28:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//*  14   33:ifeq            149
			{
				AppLink.Target target = (AppLink.Target)iterator.next();
	//   15   36:aload           5
	//   16   38:invokeinterface #149 <Method Object Iterator.next()>
	//   17   43:checkcast       #374 <Class AppLink$Target>
	//   18   46:astore          6
				obj = ((Object) (new Intent("android.intent.action.VIEW")));
	//   19   48:new             #376 <Class Intent>
	//   20   51:dup             
	//   21   52:ldc2            #378 <String "android.intent.action.VIEW">
	//   22   55:invokespecial   #379 <Method void Intent(String)>
	//   23   58:astore_2        
				if(target.getUrl() != null)
	//*  24   59:aload           6
	//*  25   61:invokevirtual   #382 <Method Uri AppLink$Target.getUrl()>
	//*  26   64:ifnull          80
					((Intent) (obj)).setData(target.getUrl());
	//   27   67:aload_2         
	//   28   68:aload           6
	//   29   70:invokevirtual   #382 <Method Uri AppLink$Target.getUrl()>
	//   30   73:invokevirtual   #386 <Method Intent Intent.setData(Uri)>
	//   31   76:pop             
				else
	//*  32   77:goto            92
					((Intent) (obj)).setData(appLink.getSourceUrl());
	//   33   80:aload_2         
	//   34   81:aload_0         
	//   35   82:getfield        #45  <Field AppLink appLink>
	//   36   85:invokevirtual   #103 <Method Uri AppLink.getSourceUrl()>
	//   37   88:invokevirtual   #386 <Method Intent Intent.setData(Uri)>
	//   38   91:pop             
				((Intent) (obj)).setPackage(target.getPackageName());
	//   39   92:aload_2         
	//   40   93:aload           6
	//   41   95:invokevirtual   #387 <Method String AppLink$Target.getPackageName()>
	//   42   98:invokevirtual   #391 <Method Intent Intent.setPackage(String)>
	//   43  101:pop             
				if(target.getClassName() != null)
	//*  44  102:aload           6
	//*  45  104:invokevirtual   #394 <Method String AppLink$Target.getClassName()>
	//*  46  107:ifnull          125
					((Intent) (obj)).setClassName(target.getPackageName(), target.getClassName());
	//   47  110:aload_2         
	//   48  111:aload           6
	//   49  113:invokevirtual   #387 <Method String AppLink$Target.getPackageName()>
	//   50  116:aload           6
	//   51  118:invokevirtual   #394 <Method String AppLink$Target.getClassName()>
	//   52  121:invokevirtual   #398 <Method Intent Intent.setClassName(String, String)>
	//   53  124:pop             
				((Intent) (obj)).putExtra("al_applink_data", ((Bundle) (obj1)));
	//   54  125:aload_2         
	//   55  126:ldc2            #400 <String "al_applink_data">
	//   56  129:aload_3         
	//   57  130:invokevirtual   #404 <Method Intent Intent.putExtra(String, Bundle)>
	//   58  133:pop             
				if(packagemanager.resolveActivity(((Intent) (obj)), 0x10000) != null)
	//*  59  134:aload           4
	//*  60  136:aload_2         
	//*  61  137:ldc2            #405 <Int 0x10000>
	//*  62  140:invokevirtual   #411 <Method android.content.pm.ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//*  63  143:ifnull          26
					break label0;
	//   64  146:goto            151
			}

			obj = null;
	//   65  149:aconst_null     
	//   66  150:astore_2        
		}
		NavigationResult navigationresult = NavigationResult.FAILED;
	//   67  151:getstatic       #415 <Field AppLinkNavigation$NavigationResult AppLinkNavigation$NavigationResult.FAILED>
	//   68  154:astore          4
		if(obj != null)
	//*  69  156:aload_2         
	//*  70  157:ifnull          173
		{
			navigationresult = NavigationResult.APP;
	//   71  160:getstatic       #418 <Field AppLinkNavigation$NavigationResult AppLinkNavigation$NavigationResult.APP>
	//   72  163:astore          4
			obj1 = obj;
	//   73  165:aload_2         
	//   74  166:astore_3        
			obj = ((Object) (navigationresult));
	//   75  167:aload           4
	//   76  169:astore_2        
		} else
	//*  77  170:goto            254
		{
			Uri uri = getAppLink().getWebUrl();
	//   78  173:aload_0         
	//   79  174:invokevirtual   #97  <Method AppLink getAppLink()>
	//   80  177:invokevirtual   #421 <Method Uri AppLink.getWebUrl()>
	//   81  180:astore          5
			if(uri != null)
	//*  82  182:aload           5
	//*  83  184:ifnull          249
			{
				try
				{
					obj1 = ((Object) (getJSONForBundle(((Bundle) (obj1)))));
	//   84  187:aload_0         
	//   85  188:aload_3         
	//   86  189:invokespecial   #168 <Method JSONObject getJSONForBundle(Bundle)>
	//   87  192:astore_3        
				}
	//*  88  193:new             #376 <Class Intent>
	//*  89  196:dup             
	//*  90  197:ldc2            #378 <String "android.intent.action.VIEW">
	//*  91  200:aload           5
	//*  92  202:invokevirtual   #425 <Method android.net.Uri$Builder Uri.buildUpon()>
	//*  93  205:ldc2            #400 <String "al_applink_data">
	//*  94  208:aload_3         
	//*  95  209:invokevirtual   #426 <Method String JSONObject.toString()>
	//*  96  212:invokevirtual   #432 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//*  97  215:invokevirtual   #435 <Method Uri android.net.Uri$Builder.build()>
	//*  98  218:invokespecial   #438 <Method void Intent(String, Uri)>
	//*  99  221:astore_3        
	//* 100  222:getstatic       #441 <Field AppLinkNavigation$NavigationResult AppLinkNavigation$NavigationResult.WEB>
	//* 101  225:astore_2        
	//* 102  226:goto            254
				// Misplaced declaration of an exception variable
				catch(Object obj1)
	//* 103  229:astore_3        
				{
					sendAppLinkNavigateEventBroadcast(context, ((Intent) (obj)), NavigationResult.FAILED, ((JSONException) (obj1)));
	//  104  230:aload_0         
	//  105  231:aload_1         
	//  106  232:aload_2         
	//  107  233:getstatic       #415 <Field AppLinkNavigation$NavigationResult AppLinkNavigation$NavigationResult.FAILED>
	//  108  236:aload_3         
	//  109  237:invokespecial   #443 <Method void sendAppLinkNavigateEventBroadcast(Context, Intent, AppLinkNavigation$NavigationResult, JSONException)>
					throw new RuntimeException(((Throwable) (obj1)));
	//  110  240:new             #445 <Class RuntimeException>
	//  111  243:dup             
	//  112  244:aload_3         
	//  113  245:invokespecial   #448 <Method void RuntimeException(Throwable)>
	//  114  248:athrow          
				}
				obj1 = ((Object) (new Intent("android.intent.action.VIEW", uri.buildUpon().appendQueryParameter("al_applink_data", ((JSONObject) (obj1)).toString()).build())));
				obj = ((Object) (NavigationResult.WEB));
			} else
			{
				obj1 = null;
	//  115  249:aconst_null     
	//  116  250:astore_3        
				obj = ((Object) (navigationresult));
	//  117  251:aload           4
	//  118  253:astore_2        
			}
		}
		sendAppLinkNavigateEventBroadcast(context, ((Intent) (obj1)), ((NavigationResult) (obj)), ((JSONException) (null)));
	//  119  254:aload_0         
	//  120  255:aload_1         
	//  121  256:aload_3         
	//  122  257:aload_2         
	//  123  258:aconst_null     
	//  124  259:invokespecial   #443 <Method void sendAppLinkNavigateEventBroadcast(Context, Intent, AppLinkNavigation$NavigationResult, JSONException)>
		if(obj1 != null)
	//* 125  262:aload_3         
	//* 126  263:ifnull          271
			context.startActivity(((Intent) (obj1)));
	//  127  266:aload_1         
	//  128  267:aload_3         
	//  129  268:invokevirtual   #452 <Method void Context.startActivity(Intent)>
		return ((NavigationResult) (obj));
	//  130  271:aload_2         
	//  131  272:areturn         
	}

	private static final String KEY_NAME_REFERER_APP_LINK = "referer_app_link";
	private static final String KEY_NAME_REFERER_APP_LINK_APP_NAME = "app_name";
	private static final String KEY_NAME_REFERER_APP_LINK_PACKAGE = "package";
	private static final String KEY_NAME_USER_AGENT = "user_agent";
	private static final String KEY_NAME_VERSION = "version";
	private static final String VERSION = "1.0";
	private static AppLinkResolver defaultResolver;
	private final AppLink appLink;
	private final Bundle appLinkData;
	private final Bundle extras;
}
