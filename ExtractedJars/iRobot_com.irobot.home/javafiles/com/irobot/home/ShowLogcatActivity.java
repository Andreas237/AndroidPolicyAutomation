// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
import com.irobot.core.Assembler;
import com.irobot.core.AssetCapabilityUtils;
import com.irobot.core.AssetNetworkUIService;
import com.irobot.core.AssetNetworkUIServiceCommand;
import com.irobot.core.AssetNetworkUIServiceData;
import com.irobot.core.AssetNetworkUIServiceDataCallback;
import com.irobot.core.AssetNetworkUIServiceDataState;
import com.irobot.core.AssetWifiLogEvent;
import com.irobot.home.core.a.h;
import com.irobot.home.model.IRobotModel;
import com.irobot.home.p.a;
import com.irobot.home.util.f;
import com.irobot.home.util.i;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, IRobotApplication

public class ShowLogcatActivity extends BaseFragmentActivity
{

	public ShowLogcatActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void BaseFragmentActivity()>
	//    2    4:aload_0         
	//    3    5:new             #74  <Class h>
	//    4    8:dup             
	//    5    9:invokespecial   #75  <Method void h()>
	//    6   12:putfield        #77  <Field h g>
	//    7   15:aload_0         
	//    8   16:new             #79  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #80  <Method void ArrayList()>
	//   11   23:putfield        #82  <Field List h>
		b = null;
	//   12   26:aload_0         
	//   13   27:aconst_null     
	//   14   28:putfield        #84  <Field ArrayAdapter b>
	//   15   31:aload_0         
	//   16   32:new             #8   <Class ShowLogcatActivity$2>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:invokespecial   #87  <Method void ShowLogcatActivity$2(ShowLogcatActivity)>
	//   20   40:putfield        #89  <Field AssetNetworkUIServiceDataCallback i>
	//   21   43:return          
	}

	private void a(AssetWifiLogEvent assetwifilogevent)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #79  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #80  <Method void ArrayList()>
	//    3    7:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #92  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #93  <Method void StringBuilder()>
	//    7   15:astore_3        
		stringbuilder.append("WiFi logs: ");
	//    8   16:aload_3         
	//    9   17:ldc1            #95  <String "WiFi logs: ">
	//   10   19:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		stringbuilder.append(i.a);
	//   12   23:aload_3         
	//   13   24:getstatic       #104 <Field String i.a>
	//   14   27:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
		arraylist.add(((Object) (stringbuilder.toString())));
	//   16   31:aload_2         
	//   17   32:aload_3         
	//   18   33:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   19   36:invokevirtual   #112 <Method boolean ArrayList.add(Object)>
	//   20   39:pop             
		StringBuilder stringbuilder1;
		for(assetwifilogevent = ((AssetWifiLogEvent) (assetwifilogevent.log().iterator())); ((Iterator) (assetwifilogevent)).hasNext(); arraylist.add(((Object) (stringbuilder1.toString()))))
	//*  21   40:aload_1         
	//*  22   41:invokevirtual   #118 <Method ArrayList AssetWifiLogEvent.log()>
	//*  23   44:invokevirtual   #122 <Method Iterator ArrayList.iterator()>
	//*  24   47:astore_1        
	//*  25   48:aload_1         
	//*  26   49:invokeinterface #128 <Method boolean Iterator.hasNext()>
	//*  27   54:ifeq            105
		{
			String s = (String)((Iterator) (assetwifilogevent)).next();
	//   28   57:aload_1         
	//   29   58:invokeinterface #132 <Method Object Iterator.next()>
	//   30   63:checkcast       #134 <Class String>
	//   31   66:astore_3        
			stringbuilder1 = new StringBuilder();
	//   32   67:new             #92  <Class StringBuilder>
	//   33   70:dup             
	//   34   71:invokespecial   #93  <Method void StringBuilder()>
	//   35   74:astore          4
			stringbuilder1.append(s);
	//   36   76:aload           4
	//   37   78:aload_3         
	//   38   79:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   39   82:pop             
			stringbuilder1.append(i.a);
	//   40   83:aload           4
	//   41   85:getstatic       #104 <Field String i.a>
	//   42   88:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   43   91:pop             
		}

	//   44   92:aload_2         
	//   45   93:aload           4
	//   46   95:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   47   98:invokevirtual   #112 <Method boolean ArrayList.add(Object)>
	//   48  101:pop             
	//*  49  102:goto            48
		if(arraylist.size() > 1)
	//*  50  105:aload_2         
	//*  51  106:invokevirtual   #138 <Method int ArrayList.size()>
	//*  52  109:iconst_1        
	//*  53  110:icmple          118
			showLogcat(arraylist);
	//   54  113:aload_0         
	//   55  114:aload_2         
	//   56  115:invokevirtual   #142 <Method void showLogcat(ArrayList)>
		p();
	//   57  118:aload_0         
	//   58  119:invokespecial   #145 <Method void p()>
	//   59  122:return          
	}

	static void a(ShowLogcatActivity showlogcatactivity, AssetWifiLogEvent assetwifilogevent)
	{
		showlogcatactivity.a(assetwifilogevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #148 <Method void a(AssetWifiLogEvent)>
	//    3    5:return          
	}

	private void p()
	{
		if(e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Toast e>
	//*   2    4:ifnull          14
			e.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #150 <Field Toast e>
	//    5   11:invokevirtual   #155 <Method void Toast.cancel()>
	//    6   14:return          
	}

	void e()
	{
		b(0x7f0f083c);
	//    0    0:aload_0         
	//    1    1:ldc1            #156 <Int 0x7f0f083c>
	//    2    3:invokevirtual   #159 <Method void b(int)>
		s.a(new String[] {
			"android.permission.WRITE_EXTERNAL_STORAGE"
		});
	//    3    6:aload_0         
	//    4    7:getfield        #163 <Field a s>
	//    5   10:iconst_1        
	//    6   11:anewarray       String[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:ldc1            #165 <String "android.permission.WRITE_EXTERNAL_STORAGE">
	//   10   18:aastore         
	//   11   19:invokevirtual   #170 <Method void a.a(String[])>
		o();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #173 <Method void o()>
		com.irobot.home.util.f.a();
	//   14   26:invokestatic    #177 <Method void f.a()>
		f();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #179 <Method void f()>
	//   17   33:return          
	}

	void f()
	{
		Object obj;
		String s;
		Object obj3;
		ArrayList arraylist;
		j();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #184 <Method void j()>
		arraylist = new ArrayList();
	//    2    4:new             #79  <Class ArrayList>
	//    3    7:dup             
	//    4    8:invokespecial   #80  <Method void ArrayList()>
	//    5   11:astore          7
		obj3 = null;
	//    6   13:aconst_null     
	//    7   14:astore          5
		s = null;
	//    8   16:aconst_null     
	//    9   17:astore          4
		obj = ((Object) (s));
	//   10   19:aload           4
	//   11   21:astore_2        
		Object obj1 = ((Object) (com.irobot.home.util.j.j()));
	//   12   22:invokestatic    #189 <Method com.irobot.home.model.a j.j()>
	//   13   25:astore_3        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_50;
	//   14   26:aload_3         
	//   15   27:ifnull          50
		obj = ((Object) (s));
	//   16   30:aload           4
	//   17   32:astore_2        
		if(!AssetCapabilityUtils.isCloudCapable(((com.irobot.home.model.a) (obj1)).a()))
			break MISSING_BLOCK_LABEL_50;
	//   18   33:aload_3         
	//   19   34:invokevirtual   #194 <Method com.irobot.core.AssetInfo com.irobot.home.model.a.a()>
	//   20   37:invokestatic    #200 <Method boolean AssetCapabilityUtils.isCloudCapable(com.irobot.core.AssetInfo)>
	//   21   40:ifeq            50
		obj = ((Object) (s));
	//   22   43:aload           4
	//   23   45:astore_2        
		g();
	//   24   46:aload_0         
	//   25   47:invokevirtual   #202 <Method void g()>
		obj = ((Object) (s));
	//   26   50:aload           4
	//   27   52:astore_2        
		obj1 = ((Object) (d.getSelectedItem().toString()));
	//   28   53:aload_0         
	//   29   54:getfield        #204 <Field Spinner d>
	//   30   57:invokevirtual   #209 <Method Object Spinner.getSelectedItem()>
	//   31   60:invokevirtual   #212 <Method String Object.toString()>
	//   32   63:astore_3        
		obj = ((Object) (s));
	//   33   64:aload           4
	//   34   66:astore_2        
		String s1 = (String)f.get(obj1);
	//   35   67:getstatic       #40  <Field Map f>
	//   36   70:aload_3         
	//   37   71:invokeinterface #216 <Method Object Map.get(Object)>
	//   38   76:checkcast       #134 <Class String>
	//   39   79:astore          6
		obj1 = ((Object) (s1));
	//   40   81:aload           6
	//   41   83:astore_3        
		if(s1 == null)
	//*  42   84:aload           6
	//*  43   86:ifnonnull       92
			obj1 = "W";
	//   44   89:ldc1            #62  <String "W">
	//   45   91:astore_3        
		obj = ((Object) (s));
	//   46   92:aload           4
	//   47   94:astore_2        
		if(((String) (obj1)).equals("V"))
	//*  48   95:aload_3         
	//*  49   96:ldc1            #44  <String "V">
	//*  50   98:invokevirtual   #219 <Method boolean String.equals(Object)>
	//*  51  101:ifeq            110
		{
			obj1 = "logcat -d -v threadtime";
	//   52  104:ldc1            #221 <String "logcat -d -v threadtime">
	//   53  106:astore_3        
			break MISSING_BLOCK_LABEL_130;
	//   54  107:goto            130
		}
		obj = ((Object) (s));
	//   55  110:aload           4
	//   56  112:astore_2        
		obj1 = ((Object) (String.format(Locale.US, "logcat -d -v threadtime *:%s", new Object[] {
			obj1
		})));
	//   57  113:getstatic       #227 <Field Locale Locale.US>
	//   58  116:ldc1            #229 <String "logcat -d -v threadtime *:%s">
	//   59  118:iconst_1        
	//   60  119:anewarray       Object[]
	//   61  122:dup             
	//   62  123:iconst_0        
	//   63  124:aload_3         
	//   64  125:aastore         
	//   65  126:invokestatic    #233 <Method String String.format(Locale, String, Object[])>
	//   66  129:astore_3        
		obj = ((Object) (s));
	//   67  130:aload           4
	//   68  132:astore_2        
		obj1 = ((Object) (new BufferedReader(((java.io.Reader) (new InputStreamReader(Runtime.getRuntime().exec(((String) (obj1))).getInputStream()))))));
	//   69  133:new             #235 <Class BufferedReader>
	//   70  136:dup             
	//   71  137:new             #237 <Class InputStreamReader>
	//   72  140:dup             
	//   73  141:invokestatic    #243 <Method Runtime Runtime.getRuntime()>
	//   74  144:aload_3         
	//   75  145:invokevirtual   #247 <Method Process Runtime.exec(String)>
	//   76  148:invokevirtual   #253 <Method java.io.InputStream Process.getInputStream()>
	//   77  151:invokespecial   #256 <Method void InputStreamReader(java.io.InputStream)>
	//   78  154:invokespecial   #259 <Method void BufferedReader(java.io.Reader)>
	//   79  157:astore_3        
_L2:
		s = ((BufferedReader) (obj1)).readLine();
	//   80  158:aload_3         
	//   81  159:invokevirtual   #262 <Method String BufferedReader.readLine()>
	//   82  162:astore          4
		if(s == null)
			break MISSING_BLOCK_LABEL_250;
	//   83  164:aload           4
	//   84  166:ifnull          250
		obj = ((Object) (new StringBuilder()));
	//   85  169:new             #92  <Class StringBuilder>
	//   86  172:dup             
	//   87  173:invokespecial   #93  <Method void StringBuilder()>
	//   88  176:astore_2        
		((StringBuilder) (obj)).append(s);
	//   89  177:aload_2         
	//   90  178:aload           4
	//   91  180:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   92  183:pop             
		((StringBuilder) (obj)).append(i.a);
	//   93  184:aload_2         
	//   94  185:getstatic       #104 <Field String i.a>
	//   95  188:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   96  191:pop             
		int i1 = 1;
	//   97  192:iconst_1        
	//   98  193:istore_1        
_L1:
		s = ((BufferedReader) (obj1)).readLine();
	//   99  194:aload_3         
	//  100  195:invokevirtual   #262 <Method String BufferedReader.readLine()>
	//  101  198:astore          4
		if(s == null || i1 >= 500)
			break MISSING_BLOCK_LABEL_237;
	//  102  200:aload           4
	//  103  202:ifnull          237
	//  104  205:iload_1         
	//  105  206:sipush          500
	//  106  209:icmpge          237
		i1++;
	//  107  212:iload_1         
	//  108  213:iconst_1        
	//  109  214:iadd            
	//  110  215:istore_1        
		((StringBuilder) (obj)).append(s);
	//  111  216:aload_2         
	//  112  217:aload           4
	//  113  219:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  114  222:pop             
		((StringBuilder) (obj)).append(System.getProperty("line.separator"));
	//  115  223:aload_2         
	//  116  224:ldc2            #264 <String "line.separator">
	//  117  227:invokestatic    #270 <Method String System.getProperty(String)>
	//  118  230:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  119  233:pop             
		  goto _L1
	//* 120  234:goto            194
		arraylist.add(((Object) (((StringBuilder) (obj)).toString())));
	//  121  237:aload           7
	//  122  239:aload_2         
	//  123  240:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  124  243:invokevirtual   #112 <Method boolean ArrayList.add(Object)>
	//  125  246:pop             
		  goto _L2
	//* 126  247:goto            158
		obj = ((Object) (new StringBuilder()));
	//  127  250:new             #92  <Class StringBuilder>
	//  128  253:dup             
	//  129  254:invokespecial   #93  <Method void StringBuilder()>
	//  130  257:astore_2        
		((StringBuilder) (obj)).append("-.-> number of chunks is ***");
	//  131  258:aload_2         
	//  132  259:ldc2            #272 <String "-.-> number of chunks is ***">
	//  133  262:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  134  265:pop             
		((StringBuilder) (obj)).append(h.size());
	//  135  266:aload_2         
	//  136  267:aload_0         
	//  137  268:getfield        #82  <Field List h>
	//  138  271:invokeinterface #275 <Method int List.size()>
	//  139  276:invokevirtual   #278 <Method StringBuilder StringBuilder.append(int)>
	//  140  279:pop             
		((StringBuilder) (obj)).append("***");
	//  141  280:aload_2         
	//  142  281:ldc2            #280 <String "***">
	//  143  284:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  144  287:pop             
		com.irobot.home.util.o.b("ShowLogcatActivity", ((StringBuilder) (obj)).toString());
	//  145  288:ldc2            #282 <String "ShowLogcatActivity">
	//  146  291:aload_2         
	//  147  292:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  148  295:invokestatic    #287 <Method void o.b(String, String)>
		Object obj2;
		if(obj1 != null)
	//* 149  298:aload_3         
	//* 150  299:ifnull          356
			try
			{
				((BufferedReader) (obj1)).close();
	//  151  302:aload_3         
	//  152  303:invokevirtual   #290 <Method void BufferedReader.close()>
			}
	//* 153  306:goto            356
	//* 154  309:astore          4
	//* 155  311:aload_3         
	//* 156  312:astore_2        
	//* 157  313:aload           4
	//* 158  315:astore_3        
	//* 159  316:goto            363
	//* 160  319:astore          4
	//* 161  321:goto            333
	//* 162  324:astore_3        
	//* 163  325:goto            363
	//* 164  328:astore          4
	//* 165  330:aload           5
	//* 166  332:astore_3        
	//* 167  333:aload_3         
	//* 168  334:astore_2        
	//* 169  335:aload           4
	//* 170  337:invokevirtual   #293 <Method void IOException.printStackTrace()>
	//* 171  340:aload_3         
	//* 172  341:ifnull          356
	//* 173  344:aload_3         
	//* 174  345:invokevirtual   #290 <Method void BufferedReader.close()>
	//* 175  348:goto            356
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//* 176  351:astore_2        
			{
				((IOException) (obj)).printStackTrace();
	//  177  352:aload_2         
	//  178  353:invokevirtual   #293 <Method void IOException.printStackTrace()>
			}
		break MISSING_BLOCK_LABEL_356;
		obj2;
		obj = obj1;
		obj1 = obj2;
		break MISSING_BLOCK_LABEL_363;
		obj2;
		break MISSING_BLOCK_LABEL_333;
		obj1;
		break MISSING_BLOCK_LABEL_363;
		obj2;
		obj1 = ((Object) (obj3));
		obj = obj1;
		((IOException) (obj2)).printStackTrace();
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_356;
		((BufferedReader) (obj1)).close();
		showLogcat(arraylist);
	//  179  356:aload_0         
	//  180  357:aload           7
	//  181  359:invokevirtual   #142 <Method void showLogcat(ArrayList)>
		return;
	//  182  362:return          
		if(obj != null)
	//* 183  363:aload_2         
	//* 184  364:ifnull          379
			try
			{
				((BufferedReader) (obj)).close();
	//  185  367:aload_2         
	//  186  368:invokevirtual   #290 <Method void BufferedReader.close()>
			}
	//* 187  371:goto            379
			catch(IOException ioexception)
	//* 188  374:astore_2        
			{
				ioexception.printStackTrace();
	//  189  375:aload_2         
	//  190  376:invokevirtual   #293 <Method void IOException.printStackTrace()>
			}
		throw obj1;
	//  191  379:aload_3         
	//  192  380:athrow          
	}

	void g()
	{
		Object obj;
		String s;
		s = "";
	//    0    0:ldc2            #295 <String "">
	//    1    3:astore_2        
		obj = ((Object) (((IRobotApplication)getApplication()).h()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #299 <Method android.app.Application getApplication()>
	//    4    8:checkcast       #301 <Class IRobotApplication>
	//    5   11:invokevirtual   #304 <Method IRobotModel com.irobot.home.IRobotApplication.h()>
	//    6   14:astore_1        
		if(((IRobotModel) (obj)).c() != null)
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #308 <Method com.irobot.home.model.a IRobotModel.c()>
	//*   9   19:ifnull          30
			obj = ((Object) (((IRobotModel) (obj)).c()));
	//   10   22:aload_1         
	//   11   23:invokevirtual   #308 <Method com.irobot.home.model.a IRobotModel.c()>
	//   12   26:astore_1        
		else
	//*  13   27:goto            35
			obj = ((Object) (((IRobotModel) (obj)).e()));
	//   14   30:aload_1         
	//   15   31:invokevirtual   #310 <Method com.irobot.home.model.a IRobotModel.e()>
	//   16   34:astore_1        
		if(obj != null) goto _L2; else goto _L1
	//   17   35:aload_1         
	//   18   36:ifnonnull       46
_L1:
		obj = "***** Robot Wi-Fi log not available: no robot selected *****";
	//   19   39:ldc2            #312 <String "***** Robot Wi-Fi log not available: no robot selected *****">
	//   20   42:astore_1        
		break; /* Loop/switch isn't completed */
	//   21   43:goto            117
	//*  22   46:invokestatic    #318 <Method Assembler Assembler.getInstance()>
	//*  23   49:aload_1         
	//*  24   50:invokevirtual   #321 <Method com.irobot.core.AssetId com.irobot.home.model.a.b()>
	//*  25   53:invokevirtual   #325 <Method AssetNetworkUIService Assembler.getNetworkUIService(com.irobot.core.AssetId)>
	//*  26   56:astore_1        
_L2:
		if((obj = ((Object) (Assembler.getInstance().getNetworkUIService(((com.irobot.home.model.a) (obj)).b())))) == null || !((AssetNetworkUIService) (obj)).getServiceData().getSupportedNetworkDataTypes().contains(((Object) (AssetNetworkUIServiceDataState.WifiLog))))
			continue; /* Loop/switch isn't completed */
	//   27   57:aload_1         
	//   28   58:ifnull          39
	//   29   61:aload_1         
	//   30   62:invokevirtual   #331 <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//   31   65:invokevirtual   #336 <Method ArrayList AssetNetworkUIServiceData.getSupportedNetworkDataTypes()>
	//   32   68:getstatic       #342 <Field AssetNetworkUIServiceDataState AssetNetworkUIServiceDataState.WifiLog>
	//   33   71:invokevirtual   #345 <Method boolean ArrayList.contains(Object)>
	//   34   74:ifeq            39
		if(((AssetNetworkUIService) (obj)).getServiceData().isConnectedLocally())
	//*  35   77:aload_1         
	//*  36   78:invokevirtual   #331 <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//*  37   81:invokevirtual   #348 <Method boolean AssetNetworkUIServiceData.isConnectedLocally()>
	//*  38   84:ifeq            113
		{
			((AssetNetworkUIService) (obj)).registerUISubscriber(i);
	//   39   87:aload_1         
	//   40   88:aload_0         
	//   41   89:getfield        #89  <Field AssetNetworkUIServiceDataCallback i>
	//   42   92:invokevirtual   #352 <Method boolean AssetNetworkUIService.registerUISubscriber(AssetNetworkUIServiceDataCallback)>
	//   43   95:pop             
			h();
	//   44   96:aload_0         
	//   45   97:invokevirtual   #354 <Method void h()>
			((AssetNetworkUIService) (obj)).sendCommand(AssetNetworkUIServiceCommand.FetchWiFiLogs, ((AssetNetworkUIServiceData) (null)));
	//   46  100:aload_1         
	//   47  101:getstatic       #360 <Field AssetNetworkUIServiceCommand AssetNetworkUIServiceCommand.FetchWiFiLogs>
	//   48  104:aconst_null     
	//   49  105:invokevirtual   #364 <Method void AssetNetworkUIService.sendCommand(AssetNetworkUIServiceCommand, AssetNetworkUIServiceData)>
			obj = ((Object) (s));
	//   50  108:aload_2         
	//   51  109:astore_1        
		} else
	//*  52  110:goto            117
		{
			obj = "***** Robot Wi-Fi log not available: no robot connected locally *****";
	//   53  113:ldc2            #366 <String "***** Robot Wi-Fi log not available: no robot connected locally *****">
	//   54  116:astore_1        
		}
		break; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L3
_L3:
		if(!TextUtils.isEmpty(((CharSequence) (obj))))
	//*  55  117:aload_1         
	//*  56  118:invokestatic    #372 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  57  121:ifne            143
		{
			ArrayList arraylist = new ArrayList();
	//   58  124:new             #79  <Class ArrayList>
	//   59  127:dup             
	//   60  128:invokespecial   #80  <Method void ArrayList()>
	//   61  131:astore_2        
			arraylist.add(obj);
	//   62  132:aload_2         
	//   63  133:aload_1         
	//   64  134:invokevirtual   #112 <Method boolean ArrayList.add(Object)>
	//   65  137:pop             
			showLogcat(arraylist);
	//   66  138:aload_0         
	//   67  139:aload_2         
	//   68  140:invokevirtual   #142 <Method void showLogcat(ArrayList)>
		}
		return;
	//   69  143:return          
	}

	protected void h()
	{
		if(e == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Toast e>
	//*   2    4:ifnonnull       19
			e = Toast.makeText(((android.content.Context) (this)), "Gathering WiFi logs...", 1);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:ldc2            #374 <String "Gathering WiFi logs...">
	//    6   12:iconst_1        
	//    7   13:invokestatic    #378 <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
	//    8   16:putfield        #150 <Field Toast e>
		e.show();
	//    9   19:aload_0         
	//   10   20:getfield        #150 <Field Toast e>
	//   11   23:invokevirtual   #381 <Method void Toast.show()>
	//   12   26:return          
	}

	void i()
	{
		j();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #184 <Method void j()>
		a = new ProgressDialog(((android.content.Context) (this)));
	//    2    4:aload_0         
	//    3    5:new             #383 <Class ProgressDialog>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #386 <Method void ProgressDialog(android.content.Context)>
	//    7   13:putfield        #388 <Field ProgressDialog a>
		a.setMessage("Get logcat data");
	//    8   16:aload_0         
	//    9   17:getfield        #388 <Field ProgressDialog a>
	//   10   20:ldc2            #390 <String "Get logcat data">
	//   11   23:invokevirtual   #394 <Method void ProgressDialog.setMessage(CharSequence)>
		a.show();
	//   12   26:aload_0         
	//   13   27:getfield        #388 <Field ProgressDialog a>
	//   14   30:invokevirtual   #395 <Method void ProgressDialog.show()>
		f();
	//   15   33:aload_0         
	//   16   34:invokevirtual   #179 <Method void f()>
	//   17   37:return          
	}

	void j()
	{
		h.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field List h>
	//    2    4:invokeinterface #398 <Method void List.clear()>
		if(b == null)
	//*   3    9:aload_0         
	//*   4   10:getfield        #84  <Field ArrayAdapter b>
	//*   5   13:ifnonnull       17
		{
			return;
	//    6   16:return          
		} else
		{
			b.clear();
	//    7   17:aload_0         
	//    8   18:getfield        #84  <Field ArrayAdapter b>
	//    9   21:invokevirtual   #401 <Method void ArrayAdapter.clear()>
			b.notifyDataSetChanged();
	//   10   24:aload_0         
	//   11   25:getfield        #84  <Field ArrayAdapter b>
	//   12   28:invokevirtual   #404 <Method void ArrayAdapter.notifyDataSetChanged()>
			b.notifyDataSetInvalidated();
	//   13   31:aload_0         
	//   14   32:getfield        #84  <Field ArrayAdapter b>
	//   15   35:invokevirtual   #407 <Method void ArrayAdapter.notifyDataSetInvalidated()>
			return;
	//   16   38:return          
		}
	}

	void k()
	{
		m();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #411 <Method void m()>
		j();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #184 <Method void j()>
	//    4    8:return          
	}

	void l()
	{
		if(s.b("android.permission.WRITE_EXTERNAL_STORAGE"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #163 <Field a s>
	//*   2    4:ldc1            #165 <String "android.permission.WRITE_EXTERNAL_STORAGE">
	//*   3    6:invokevirtual   #415 <Method boolean a.b(String)>
	//*   4    9:ifeq            17
		{
			n();
	//    5   12:aload_0         
	//    6   13:invokevirtual   #418 <Method void n()>
			return;
	//    7   16:return          
		}
		if(s.e("android.permission.WRITE_EXTERNAL_STORAGE"))
	//*   8   17:aload_0         
	//*   9   18:getfield        #163 <Field a s>
	//*  10   21:ldc1            #165 <String "android.permission.WRITE_EXTERNAL_STORAGE">
	//*  11   23:invokevirtual   #420 <Method boolean a.e(String)>
	//*  12   26:ifeq            62
		{
			(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(0x7f0f024f).setPositiveButton(0x7f0f034a, new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int i1)
				{
					a.s.a();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field ShowLogcatActivity a>
				//    2    4:getfield        #26  <Field a ShowLogcatActivity.s>
				//    3    7:invokevirtual   #30  <Method void a.a()>
				//    4   10:return          
				}

				final ShowLogcatActivity a;

			
			{
				a = ShowLogcatActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ShowLogcatActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).show();
	//   13   29:new             #422 <Class android.app.AlertDialog$Builder>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:invokespecial   #423 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   17   37:ldc2            #424 <Int 0x7f0f024f>
	//   18   40:invokevirtual   #427 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   19   43:ldc2            #428 <Int 0x7f0f034a>
	//   20   46:new             #6   <Class ShowLogcatActivity$1>
	//   21   49:dup             
	//   22   50:aload_0         
	//   23   51:invokespecial   #429 <Method void ShowLogcatActivity$1(ShowLogcatActivity)>
	//   24   54:invokevirtual   #433 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   25   57:invokevirtual   #436 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   26   60:pop             
			return;
	//   27   61:return          
		} else
		{
			s.a(new String[] {
				"android.permission.WRITE_EXTERNAL_STORAGE"
			});
	//   28   62:aload_0         
	//   29   63:getfield        #163 <Field a s>
	//   30   66:iconst_1        
	//   31   67:anewarray       String[]
	//   32   70:dup             
	//   33   71:iconst_0        
	//   34   72:ldc1            #165 <String "android.permission.WRITE_EXTERNAL_STORAGE">
	//   35   74:aastore         
	//   36   75:invokevirtual   #170 <Method void a.a(String[])>
			return;
	//   37   78:return          
		}
	}

	void m()
	{
		try
		{
			(new ProcessBuilder(new String[0])).command(new String[] {
				"logcat", "-c"
			}).redirectErrorStream(true).start();
	//    0    0:new             #438 <Class ProcessBuilder>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:anewarray       String[]
	//    4    8:invokespecial   #440 <Method void ProcessBuilder(String[])>
	//    5   11:iconst_2        
	//    6   12:anewarray       String[]
	//    7   15:dup             
	//    8   16:iconst_0        
	//    9   17:ldc2            #442 <String "logcat">
	//   10   20:aastore         
	//   11   21:dup             
	//   12   22:iconst_1        
	//   13   23:ldc2            #444 <String "-c">
	//   14   26:aastore         
	//   15   27:invokevirtual   #448 <Method ProcessBuilder ProcessBuilder.command(String[])>
	//   16   30:iconst_1        
	//   17   31:invokevirtual   #452 <Method ProcessBuilder ProcessBuilder.redirectErrorStream(boolean)>
	//   18   34:invokevirtual   #456 <Method Process ProcessBuilder.start()>
	//   19   37:pop             
			return;
	//   20   38:return          
		}
		catch(IOException ioexception)
	//*  21   39:astore_1        
		{
			ioexception.printStackTrace();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #293 <Method void IOException.printStackTrace()>
		}
	//   24   44:return          
	}

	void n()
	{
		if(h != null && h.size() != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field List h>
	//*   2    4:ifnull          265
	//*   3    7:aload_0         
	//*   4    8:getfield        #82  <Field List h>
	//*   5   11:invokeinterface #275 <Method int List.size()>
	//*   6   16:ifne            22
	//*   7   19:goto            265
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   22:new             #92  <Class StringBuilder>
	//    9   25:dup             
	//   10   26:invokespecial   #93  <Method void StringBuilder()>
	//   11   29:astore_1        
			stringbuilder.append(g.a());
	//   12   30:aload_1         
	//   13   31:aload_0         
	//   14   32:getfield        #77  <Field h g>
	//   15   35:invokevirtual   #460 <Method String h.a()>
	//   16   38:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   17   41:pop             
			for(Iterator iterator = h.iterator(); iterator.hasNext(); stringbuilder.append((String)iterator.next()));
	//   18   42:aload_0         
	//   19   43:getfield        #82  <Field List h>
	//   20   46:invokeinterface #461 <Method Iterator List.iterator()>
	//   21   51:astore_2        
	//   22   52:aload_2         
	//   23   53:invokeinterface #128 <Method boolean Iterator.hasNext()>
	//   24   58:ifeq            78
	//   25   61:aload_1         
	//   26   62:aload_2         
	//   27   63:invokeinterface #132 <Method Object Iterator.next()>
	//   28   68:checkcast       #134 <Class String>
	//   29   71:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   30   74:pop             
	//*  31   75:goto            52
			Object obj = ((Object) ((new SimpleDateFormat("yyyyMMdd_HHmmss")).format(new Date())));
	//   32   78:new             #463 <Class SimpleDateFormat>
	//   33   81:dup             
	//   34   82:ldc2            #465 <String "yyyyMMdd_HHmmss">
	//   35   85:invokespecial   #468 <Method void SimpleDateFormat(String)>
	//   36   88:new             #470 <Class Date>
	//   37   91:dup             
	//   38   92:invokespecial   #471 <Method void Date()>
	//   39   95:invokevirtual   #474 <Method String SimpleDateFormat.format(Date)>
	//   40   98:astore_2        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   41   99:new             #92  <Class StringBuilder>
	//   42  102:dup             
	//   43  103:invokespecial   #93  <Method void StringBuilder()>
	//   44  106:astore_3        
			stringbuilder1.append("logcat_");
	//   45  107:aload_3         
	//   46  108:ldc2            #476 <String "logcat_">
	//   47  111:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   48  114:pop             
			stringbuilder1.append(((String) (obj)));
	//   49  115:aload_3         
	//   50  116:aload_2         
	//   51  117:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   52  120:pop             
			stringbuilder1.append(".log");
	//   53  121:aload_3         
	//   54  122:ldc2            #478 <String ".log">
	//   55  125:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   56  128:pop             
			obj = ((Object) (com.irobot.home.util.f.a(((android.content.Context) (this)), stringbuilder1.toString(), stringbuilder.toString())));
	//   57  129:aload_0         
	//   58  130:aload_3         
	//   59  131:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   60  134:aload_1         
	//   61  135:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   62  138:invokestatic    #481 <Method android.net.Uri f.a(android.content.Context, String, String)>
	//   63  141:astore_2        
			try
			{
				Intent intent = new Intent("android.intent.action.SEND");
	//   64  142:new             #483 <Class Intent>
	//   65  145:dup             
	//   66  146:ldc2            #485 <String "android.intent.action.SEND">
	//   67  149:invokespecial   #486 <Method void Intent(String)>
	//   68  152:astore_1        
				intent.setType("message/rfc822");
	//   69  153:aload_1         
	//   70  154:ldc2            #488 <String "message/rfc822">
	//   71  157:invokevirtual   #492 <Method Intent Intent.setType(String)>
	//   72  160:pop             
				intent.putExtra("android.intent.extra.STREAM", ((android.os.Parcelable) (obj)));
	//   73  161:aload_1         
	//   74  162:ldc2            #494 <String "android.intent.extra.STREAM">
	//   75  165:aload_2         
	//   76  166:invokevirtual   #498 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   77  169:pop             
				obj = ((Object) (getPackageManager().getPackageInfo(getPackageName(), 128)));
	//   78  170:aload_0         
	//   79  171:invokevirtual   #502 <Method PackageManager getPackageManager()>
	//   80  174:aload_0         
	//   81  175:invokevirtual   #505 <Method String getPackageName()>
	//   82  178:sipush          128
	//   83  181:invokevirtual   #511 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   84  184:astore_2        
				StringBuilder stringbuilder2 = new StringBuilder();
	//   85  185:new             #92  <Class StringBuilder>
	//   86  188:dup             
	//   87  189:invokespecial   #93  <Method void StringBuilder()>
	//   88  192:astore_3        
				stringbuilder2.append((new SimpleDateFormat("MM/dd/yyyy")).format(new Date()));
	//   89  193:aload_3         
	//   90  194:new             #463 <Class SimpleDateFormat>
	//   91  197:dup             
	//   92  198:ldc2            #513 <String "MM/dd/yyyy">
	//   93  201:invokespecial   #468 <Method void SimpleDateFormat(String)>
	//   94  204:new             #470 <Class Date>
	//   95  207:dup             
	//   96  208:invokespecial   #471 <Method void Date()>
	//   97  211:invokevirtual   #474 <Method String SimpleDateFormat.format(Date)>
	//   98  214:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   99  217:pop             
				stringbuilder2.append(", Version ");
	//  100  218:aload_3         
	//  101  219:ldc2            #515 <String ", Version ">
	//  102  222:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  103  225:pop             
				stringbuilder2.append(((PackageInfo) (obj)).versionName);
	//  104  226:aload_3         
	//  105  227:aload_2         
	//  106  228:getfield        #520 <Field String PackageInfo.versionName>
	//  107  231:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  108  234:pop             
				intent.putExtra("android.intent.extra.SUBJECT", stringbuilder2.toString());
	//  109  235:aload_1         
	//  110  236:ldc2            #522 <String "android.intent.extra.SUBJECT">
	//  111  239:aload_3         
	//  112  240:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  113  243:invokevirtual   #525 <Method Intent Intent.putExtra(String, String)>
	//  114  246:pop             
				startActivity(Intent.createChooser(intent, "Send email..."));
	//  115  247:aload_0         
	//  116  248:aload_1         
	//  117  249:ldc2            #527 <String "Send email...">
	//  118  252:invokestatic    #531 <Method Intent Intent.createChooser(Intent, CharSequence)>
	//  119  255:invokevirtual   #535 <Method void startActivity(Intent)>
				return;
	//  120  258:return          
			}
			catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
	//* 121  259:astore_1        
			{
				namenotfoundexception.printStackTrace();
	//  122  260:aload_1         
	//  123  261:invokevirtual   #536 <Method void android.content.pm.PackageManager$NameNotFoundException.printStackTrace()>
			}
			return;
	//  124  264:return          
		} else
		{
			(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage("Logcat returned no items").setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//  125  265:new             #422 <Class android.app.AlertDialog$Builder>
	//  126  268:dup             
	//  127  269:aload_0         
	//  128  270:invokespecial   #423 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//  129  273:ldc2            #538 <String "Logcat returned no items">
	//  130  276:invokevirtual   #541 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//  131  279:ldc2            #542 <Int 0x7f0f05bb>
	//  132  282:aconst_null     
	//  133  283:invokevirtual   #433 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//  134  286:invokevirtual   #436 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//  135  289:pop             
			return;
	//  136  290:return          
		}
	}

	void o()
	{
		ArrayAdapter arrayadapter = ArrayAdapter.createFromResource(((android.content.Context) (this)), 0x7f03000b, 0x1090008);
	//    0    0:aload_0         
	//    1    1:ldc2            #543 <Int 0x7f03000b>
	//    2    4:ldc2            #544 <Int 0x1090008>
	//    3    7:invokestatic    #548 <Method ArrayAdapter ArrayAdapter.createFromResource(android.content.Context, int, int)>
	//    4   10:astore_1        
		arrayadapter.setDropDownViewResource(0x1090009);
	//    5   11:aload_1         
	//    6   12:ldc2            #549 <Int 0x1090009>
	//    7   15:invokevirtual   #552 <Method void ArrayAdapter.setDropDownViewResource(int)>
		d.setAdapter(((android.widget.SpinnerAdapter) (arrayadapter)));
	//    8   18:aload_0         
	//    9   19:getfield        #204 <Field Spinner d>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #556 <Method void Spinner.setAdapter(android.widget.SpinnerAdapter)>
	//   12   26:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #559 <Method void BaseFragmentActivity.onPause()>
		p();
	//    2    4:aload_0         
	//    3    5:invokespecial   #145 <Method void p()>
	//    4    8:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #562 <Method void BaseFragmentActivity.onStop()>
		if(com.irobot.home.util.j.j() != null)
	//*   2    4:invokestatic    #189 <Method com.irobot.home.model.a j.j()>
	//*   3    7:ifnull          30
			Assembler.getInstance().getNetworkUIService(com.irobot.home.util.j.j().b()).unregisterSubscriber(i);
	//    4   10:invokestatic    #318 <Method Assembler Assembler.getInstance()>
	//    5   13:invokestatic    #189 <Method com.irobot.home.model.a j.j()>
	//    6   16:invokevirtual   #321 <Method com.irobot.core.AssetId com.irobot.home.model.a.b()>
	//    7   19:invokevirtual   #325 <Method AssetNetworkUIService Assembler.getNetworkUIService(com.irobot.core.AssetId)>
	//    8   22:aload_0         
	//    9   23:getfield        #89  <Field AssetNetworkUIServiceDataCallback i>
	//   10   26:invokevirtual   #565 <Method boolean AssetNetworkUIService.unregisterSubscriber(AssetNetworkUIServiceDataCallback)>
	//   11   29:pop             
	//   12   30:return          
	}

	void showLogcat(ArrayList arraylist)
	{
		if(arraylist != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
			h.addAll(((java.util.Collection) (arraylist)));
	//    2    4:aload_0         
	//    3    5:getfield        #82  <Field List h>
	//    4    8:aload_1         
	//    5    9:invokeinterface #569 <Method boolean List.addAll(java.util.Collection)>
	//    6   14:pop             
		if(b == null && arraylist != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #84  <Field ArrayAdapter b>
	//*   9   19:ifnonnull       67
	//*  10   22:aload_1         
	//*  11   23:ifnull          67
		{
			b = new ArrayAdapter(((android.content.Context) (this)), 0x1090003, h);
	//   12   26:aload_0         
	//   13   27:new             #400 <Class ArrayAdapter>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:ldc2            #570 <Int 0x1090003>
	//   17   35:aload_0         
	//   18   36:getfield        #82  <Field List h>
	//   19   39:invokespecial   #573 <Method void ArrayAdapter(android.content.Context, int, List)>
	//   20   42:putfield        #84  <Field ArrayAdapter b>
			c.setAdapter(((android.widget.ListAdapter) (b)));
	//   21   45:aload_0         
	//   22   46:getfield        #575 <Field ListView c>
	//   23   49:aload_0         
	//   24   50:getfield        #84  <Field ArrayAdapter b>
	//   25   53:invokevirtual   #580 <Method void ListView.setAdapter(android.widget.ListAdapter)>
			b.setNotifyOnChange(true);
	//   26   56:aload_0         
	//   27   57:getfield        #84  <Field ArrayAdapter b>
	//   28   60:iconst_1        
	//   29   61:invokevirtual   #584 <Method void ArrayAdapter.setNotifyOnChange(boolean)>
		} else
	//*  30   64:goto            81
		{
			b.notifyDataSetChanged();
	//   31   67:aload_0         
	//   32   68:getfield        #84  <Field ArrayAdapter b>
	//   33   71:invokevirtual   #404 <Method void ArrayAdapter.notifyDataSetChanged()>
			b.notifyDataSetInvalidated();
	//   34   74:aload_0         
	//   35   75:getfield        #84  <Field ArrayAdapter b>
	//   36   78:invokevirtual   #407 <Method void ArrayAdapter.notifyDataSetInvalidated()>
		}
		if(a != null)
	//*  37   81:aload_0         
	//*  38   82:getfield        #388 <Field ProgressDialog a>
	//*  39   85:ifnull          95
			a.dismiss();
	//   40   88:aload_0         
	//   41   89:getfield        #388 <Field ProgressDialog a>
	//   42   92:invokevirtual   #587 <Method void ProgressDialog.dismiss()>
	//   43   95:return          
	}

	private static final Map f;
	ProgressDialog a;
	ArrayAdapter b;
	ListView c;
	Spinner d;
	protected Toast e;
	private final h g = new h();
	private final List h = new ArrayList();
	private final AssetNetworkUIServiceDataCallback i = new AssetNetworkUIServiceDataCallback() {

		public void onAssetNetworkUIServiceDataChanged(AssetNetworkUIServiceData assetnetworkuiservicedata)
		{
			if(assetnetworkuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       5
				return;
		//    2    4:return          
			Iterator iterator = assetnetworkuiservicedata.getDataStateChangelist().iterator();
		//    3    5:aload_1         
		//    4    6:invokevirtual   #24  <Method ArrayList AssetNetworkUIServiceData.getDataStateChangelist()>
		//    5    9:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
		//    6   12:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
		//    7   13:aload_2         
		//    8   14:invokeinterface #36  <Method boolean Iterator.hasNext()>
		//    9   19:ifeq            61
				AssetNetworkUIServiceDataState assetnetworkuiservicedatastate = (AssetNetworkUIServiceDataState)iterator.next();
		//   10   22:aload_2         
		//   11   23:invokeinterface #40  <Method Object Iterator.next()>
		//   12   28:checkcast       #42  <Class AssetNetworkUIServiceDataState>
		//   13   31:astore_3        
				static class _cls3
				{

					static final int a[];

					static 
					{
						a = new int[AssetNetworkUIServiceDataState.values().length];
					//    0    0:invokestatic    #18  <Method AssetNetworkUIServiceDataState[] AssetNetworkUIServiceDataState.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #20  <Field int[] a>
						try
						{
							a[AssetNetworkUIServiceDataState.WifiLog.ordinal()] = 1;
					//    4    9:getstatic       #20  <Field int[] a>
					//    5   12:getstatic       #24  <Field AssetNetworkUIServiceDataState AssetNetworkUIServiceDataState.WifiLog>
					//    6   15:invokevirtual   #28  <Method int AssetNetworkUIServiceDataState.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
					//    9   20:return          
						}
						catch(NoSuchFieldError nosuchfielderror) { }
					//   10   21:astore_0        
					//*  11   22:return          
					}
				}

				if(com.irobot.home._cls3.a[assetnetworkuiservicedatastate.ordinal()] == 1)
		//*  14   32:getstatic       #47  <Field int[] com.irobot.home.ShowLogcatActivity$3.a>
		//*  15   35:aload_3         
		//*  16   36:invokevirtual   #51  <Method int AssetNetworkUIServiceDataState.ordinal()>
		//*  17   39:iaload          
		//*  18   40:iconst_1        
		//*  19   41:icmpeq          47
		//*  20   44:goto            13
					com.irobot.home.ShowLogcatActivity.a(a, assetnetworkuiservicedata.getWifiLogs());
		//   21   47:aload_0         
		//   22   48:getfield        #12  <Field ShowLogcatActivity a>
		//   23   51:aload_1         
		//   24   52:invokevirtual   #55  <Method AssetWifiLogEvent AssetNetworkUIServiceData.getWifiLogs()>
		//   25   55:invokestatic    #58  <Method void com.irobot.home.ShowLogcatActivity.a(ShowLogcatActivity, AssetWifiLogEvent)>
			} while(true);
		//   26   58:goto            13
		//   27   61:return          
		}

		final ShowLogcatActivity a;

			
			{
				a = ShowLogcatActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field ShowLogcatActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void AssetNetworkUIServiceDataCallback()>
			//    5    9:return          
			}
	}
;

	static 
	{
		f = ((Map) (new HashMap()));
	//    0    0:new             #35  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void HashMap()>
	//    3    7:putstatic       #40  <Field Map f>
		f.put("Verbose", "V");
	//    4   10:getstatic       #40  <Field Map f>
	//    5   13:ldc1            #42  <String "Verbose">
	//    6   15:ldc1            #44  <String "V">
	//    7   17:invokeinterface #50  <Method Object Map.put(Object, Object)>
	//    8   22:pop             
		f.put("Debug", "D");
	//    9   23:getstatic       #40  <Field Map f>
	//   10   26:ldc1            #52  <String "Debug">
	//   11   28:ldc1            #54  <String "D">
	//   12   30:invokeinterface #50  <Method Object Map.put(Object, Object)>
	//   13   35:pop             
		f.put("Info", "I");
	//   14   36:getstatic       #40  <Field Map f>
	//   15   39:ldc1            #56  <String "Info">
	//   16   41:ldc1            #58  <String "I">
	//   17   43:invokeinterface #50  <Method Object Map.put(Object, Object)>
	//   18   48:pop             
		f.put("Warning", "W");
	//   19   49:getstatic       #40  <Field Map f>
	//   20   52:ldc1            #60  <String "Warning">
	//   21   54:ldc1            #62  <String "W">
	//   22   56:invokeinterface #50  <Method Object Map.put(Object, Object)>
	//   23   61:pop             
		f.put("Error", "E");
	//   24   62:getstatic       #40  <Field Map f>
	//   25   65:ldc1            #64  <String "Error">
	//   26   67:ldc1            #66  <String "E">
	//   27   69:invokeinterface #50  <Method Object Map.put(Object, Object)>
	//   28   74:pop             
		f.put("Fatal", "F");
	//   29   75:getstatic       #40  <Field Map f>
	//   30   78:ldc1            #68  <String "Fatal">
	//   31   80:ldc1            #70  <String "F">
	//   32   82:invokeinterface #50  <Method Object Map.put(Object, Object)>
	//   33   87:pop             
	//*  34   88:return          
	}
}
