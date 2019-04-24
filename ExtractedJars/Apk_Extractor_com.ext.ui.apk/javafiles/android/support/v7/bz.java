// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.*;
import android.content.pm.PackageManager;
import android.os.*;
import android.text.TextUtils;
import android.util.Log;
import java.util.*;
import org.json.JSONException;

// Referenced classes of package android.support.v7:
//			bu, cd, cc, cb, 
//			ce, by, ca

public class bz
{
	public static interface a
	{

		public abstract void a(ca ca1, cc cc1);
	}

	public static interface b
	{

		public abstract void a(ca ca1);
	}

	public static interface c
	{

		public abstract void a(ca ca1, cb cb1);
	}


	public bz(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		a = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #44  <Field boolean a>
		b = "IabHelper";
	//    5    9:aload_0         
	//    6   10:ldc1            #46  <String "IabHelper">
	//    7   12:putfield        #48  <Field String b>
		c = false;
	//    8   15:aload_0         
	//    9   16:iconst_0        
	//   10   17:putfield        #50  <Field boolean c>
		d = false;
	//   11   20:aload_0         
	//   12   21:iconst_0        
	//   13   22:putfield        #52  <Field boolean d>
		e = false;
	//   14   25:aload_0         
	//   15   26:iconst_0        
	//   16   27:putfield        #54  <Field boolean e>
		f = false;
	//   17   30:aload_0         
	//   18   31:iconst_0        
	//   19   32:putfield        #56  <Field boolean f>
		g = "";
	//   20   35:aload_0         
	//   21   36:ldc1            #58  <String "">
	//   22   38:putfield        #60  <Field String g>
		m = null;
	//   23   41:aload_0         
	//   24   42:aconst_null     
	//   25   43:putfield        #62  <Field String m>
		h = context.getApplicationContext();
	//   26   46:aload_0         
	//   27   47:aload_1         
	//   28   48:invokevirtual   #68  <Method Context Context.getApplicationContext()>
	//   29   51:putfield        #70  <Field Context h>
		m = s;
	//   30   54:aload_0         
	//   31   55:aload_2         
	//   32   56:putfield        #62  <Field String m>
		b("IAB helper created.");
	//   33   59:aload_0         
	//   34   60:ldc1            #72  <String "IAB helper created.">
	//   35   62:invokevirtual   #75  <Method void b(String)>
	//   36   65:return          
	}

	public static String a(int i1)
	{
		String as[] = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
	//    0    0:ldc1            #79  <String "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned">
	//    1    2:ldc1            #81  <String "/">
	//    2    4:invokevirtual   #87  <Method String[] String.split(String)>
	//    3    7:astore_2        
		String as1[] = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split("/");
	//    4    8:ldc1            #89  <String "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt">
	//    5   10:ldc1            #81  <String "/">
	//    6   12:invokevirtual   #87  <Method String[] String.split(String)>
	//    7   15:astore_3        
		if(i1 <= -1000)
	//*   8   16:iload_0         
	//*   9   17:sipush          -1000
	//*  10   20:icmpgt          66
		{
			int j1 = -1000 - i1;
	//   11   23:sipush          -1000
	//   12   26:iload_0         
	//   13   27:isub            
	//   14   28:istore_1        
			if(j1 >= 0 && j1 < as1.length)
	//*  15   29:iload_1         
	//*  16   30:iflt            43
	//*  17   33:iload_1         
	//*  18   34:aload_3         
	//*  19   35:arraylength     
	//*  20   36:icmpge          43
				return as1[j1];
	//   21   39:aload_3         
	//   22   40:iload_1         
	//   23   41:aaload          
	//   24   42:areturn         
			else
				return (new StringBuilder()).append(String.valueOf(i1)).append(":Unknown IAB Helper Error").toString();
	//   25   43:new             #91  <Class StringBuilder>
	//   26   46:dup             
	//   27   47:invokespecial   #92  <Method void StringBuilder()>
	//   28   50:iload_0         
	//   29   51:invokestatic    #95  <Method String String.valueOf(int)>
	//   30   54:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   31   57:ldc1            #101 <String ":Unknown IAB Helper Error">
	//   32   59:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   33   62:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   34   65:areturn         
		}
		if(i1 < 0 || i1 >= as.length)
	//*  35   66:iload_0         
	//*  36   67:iflt            76
	//*  37   70:iload_0         
	//*  38   71:aload_2         
	//*  39   72:arraylength     
	//*  40   73:icmplt          99
			return (new StringBuilder()).append(String.valueOf(i1)).append(":Unknown").toString();
	//   41   76:new             #91  <Class StringBuilder>
	//   42   79:dup             
	//   43   80:invokespecial   #92  <Method void StringBuilder()>
	//   44   83:iload_0         
	//   45   84:invokestatic    #95  <Method String String.valueOf(int)>
	//   46   87:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   47   90:ldc1            #107 <String ":Unknown">
	//   48   92:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   49   95:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   50   98:areturn         
		else
			return as[i1];
	//   51   99:aload_2         
	//   52  100:iload_0         
	//   53  101:aaload          
	//   54  102:areturn         
	}

	int a(Intent intent)
	{
		intent = ((Intent) (intent.getExtras().get("RESPONSE_CODE")));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #114 <Method Bundle Intent.getExtras()>
	//    2    4:ldc1            #116 <String "RESPONSE_CODE">
	//    3    6:invokevirtual   #122 <Method Object Bundle.get(String)>
	//    4    9:astore_1        
		if(intent == null)
	//*   5   10:aload_1         
	//*   6   11:ifnonnull       22
		{
			c("Intent with no response code, assuming OK (known issue)");
	//    7   14:aload_0         
	//    8   15:ldc1            #124 <String "Intent with no response code, assuming OK (known issue)">
	//    9   17:invokevirtual   #126 <Method void c(String)>
			return 0;
	//   10   20:iconst_0        
	//   11   21:ireturn         
		}
		if(intent instanceof Integer)
	//*  12   22:aload_1         
	//*  13   23:instanceof      #128 <Class Integer>
	//*  14   26:ifeq            37
			return ((Integer)intent).intValue();
	//   15   29:aload_1         
	//   16   30:checkcast       #128 <Class Integer>
	//   17   33:invokevirtual   #132 <Method int Integer.intValue()>
	//   18   36:ireturn         
		if(intent instanceof Long)
	//*  19   37:aload_1         
	//*  20   38:instanceof      #134 <Class Long>
	//*  21   41:ifeq            53
		{
			return (int)((Long)intent).longValue();
	//   22   44:aload_1         
	//   23   45:checkcast       #134 <Class Long>
	//   24   48:invokevirtual   #138 <Method long Long.longValue()>
	//   25   51:l2i             
	//   26   52:ireturn         
		} else
		{
			c("Unexpected type for intent response code.");
	//   27   53:aload_0         
	//   28   54:ldc1            #140 <String "Unexpected type for intent response code.">
	//   29   56:invokevirtual   #126 <Method void c(String)>
			c(((Object) (intent)).getClass().getName());
	//   30   59:aload_0         
	//   31   60:aload_1         
	//   32   61:invokevirtual   #144 <Method Class Object.getClass()>
	//   33   64:invokevirtual   #149 <Method String Class.getName()>
	//   34   67:invokevirtual   #126 <Method void c(String)>
			return 6;
	//   35   70:bipush          6
	//   36   72:ireturn         
		}
	}

	int a(Bundle bundle)
	{
		bundle = ((Bundle) (bundle.get("RESPONSE_CODE")));
	//    0    0:aload_1         
	//    1    1:ldc1            #116 <String "RESPONSE_CODE">
	//    2    3:invokevirtual   #122 <Method Object Bundle.get(String)>
	//    3    6:astore_1        
		if(bundle == null)
	//*   4    7:aload_1         
	//*   5    8:ifnonnull       19
		{
			b("Bundle with null response code, assuming OK (known issue)");
	//    6   11:aload_0         
	//    7   12:ldc1            #152 <String "Bundle with null response code, assuming OK (known issue)">
	//    8   14:invokevirtual   #75  <Method void b(String)>
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		}
		if(bundle instanceof Integer)
	//*  11   19:aload_1         
	//*  12   20:instanceof      #128 <Class Integer>
	//*  13   23:ifeq            34
			return ((Integer)bundle).intValue();
	//   14   26:aload_1         
	//   15   27:checkcast       #128 <Class Integer>
	//   16   30:invokevirtual   #132 <Method int Integer.intValue()>
	//   17   33:ireturn         
		if(bundle instanceof Long)
	//*  18   34:aload_1         
	//*  19   35:instanceof      #134 <Class Long>
	//*  20   38:ifeq            50
		{
			return (int)((Long)bundle).longValue();
	//   21   41:aload_1         
	//   22   42:checkcast       #134 <Class Long>
	//   23   45:invokevirtual   #138 <Method long Long.longValue()>
	//   24   48:l2i             
	//   25   49:ireturn         
		} else
		{
			c("Unexpected type for bundle response code.");
	//   26   50:aload_0         
	//   27   51:ldc1            #154 <String "Unexpected type for bundle response code.">
	//   28   53:invokevirtual   #126 <Method void c(String)>
			c(((Object) (bundle)).getClass().getName());
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:invokevirtual   #144 <Method Class Object.getClass()>
	//   32   61:invokevirtual   #149 <Method String Class.getName()>
	//   33   64:invokevirtual   #126 <Method void c(String)>
			return -1002;
	//   34   67:sipush          -1002
	//   35   70:ireturn         
		}
	}

	int a(cb cb1, String s)
		throws JSONException, RemoteException
	{
		boolean flag;
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
			b((new StringBuilder()).append("Querying owned items, item type: ").append(s).toString());
	//    2    3:aload_0         
	//    3    4:new             #91  <Class StringBuilder>
	//    4    7:dup             
	//    5    8:invokespecial   #92  <Method void StringBuilder()>
	//    6   11:ldc1            #161 <String "Querying owned items, item type: ">
	//    7   13:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   10   20:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   11   23:invokevirtual   #75  <Method void b(String)>
			Object obj = null;
	//   12   26:aconst_null     
	//   13   27:astore          6
			if(!d)
				break label0;
	//   14   29:aload_0         
	//   15   30:getfield        #52  <Field boolean d>
	//   16   33:ifeq            496
			int i1 = -1008;
	//   17   36:sipush          -1008
	//   18   39:istore          4
			ArrayList arraylist;
			ArrayList arraylist1;
			ArrayList arraylist2;
			String s1;
			Object obj1;
			String s2;
			do
				return i1;
	//   19   41:iload           4
	//   20   43:ireturn         
			while(!flag);
	//   21   44:aload_0         
	//   22   45:new             #91  <Class StringBuilder>
	//   23   48:dup             
	//   24   49:invokespecial   #92  <Method void StringBuilder()>
	//   25   52:ldc1            #163 <String "Calling getPurchases with continuation token: ">
	//   26   54:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   27   57:aload           6
	//   28   59:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   29   62:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   30   65:invokevirtual   #75  <Method void b(String)>
	//   31   68:aload_0         
	//   32   69:getfield        #165 <Field bu i>
	//   33   72:iconst_3        
	//   34   73:aload_0         
	//   35   74:getfield        #70  <Field Context h>
	//   36   77:invokevirtual   #168 <Method String Context.getPackageName()>
	//   37   80:aload_2         
	//   38   81:aload           6
	//   39   83:invokeinterface #173 <Method Bundle bu.a(int, String, String, String)>
	//   40   88:astore          6
	//   41   90:aload_0         
	//   42   91:aload           6
	//   43   93:invokevirtual   #175 <Method int a(Bundle)>
	//   44   96:istore          4
	//   45   98:aload_0         
	//   46   99:new             #91  <Class StringBuilder>
	//   47  102:dup             
	//   48  103:invokespecial   #92  <Method void StringBuilder()>
	//   49  106:ldc1            #177 <String "Owned items response: ">
	//   50  108:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   51  111:iload           4
	//   52  113:invokestatic    #95  <Method String String.valueOf(int)>
	//   53  116:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   54  119:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   55  122:invokevirtual   #75  <Method void b(String)>
	//   56  125:iload           4
	//   57  127:ifeq            160
	//   58  130:aload_0         
	//   59  131:new             #91  <Class StringBuilder>
	//   60  134:dup             
	//   61  135:invokespecial   #92  <Method void StringBuilder()>
	//   62  138:ldc1            #179 <String "getPurchases() failed: ">
	//   63  140:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   64  143:iload           4
	//   65  145:invokestatic    #181 <Method String a(int)>
	//   66  148:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   67  151:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   68  154:invokevirtual   #75  <Method void b(String)>
	//   69  157:iload           4
	//   70  159:ireturn         
	//   71  160:aload           6
	//   72  162:ldc1            #183 <String "INAPP_PURCHASE_ITEM_LIST">
	//   73  164:invokevirtual   #187 <Method boolean Bundle.containsKey(String)>
	//   74  167:ifeq            190
	//   75  170:aload           6
	//   76  172:ldc1            #189 <String "INAPP_PURCHASE_DATA_LIST">
	//   77  174:invokevirtual   #187 <Method boolean Bundle.containsKey(String)>
	//   78  177:ifeq            190
	//   79  180:aload           6
	//   80  182:ldc1            #191 <String "INAPP_DATA_SIGNATURE_LIST">
	//   81  184:invokevirtual   #187 <Method boolean Bundle.containsKey(String)>
	//   82  187:ifne            200
	//   83  190:aload_0         
	//   84  191:ldc1            #193 <String "Bundle returned from getPurchases() doesn't contain required fields.">
	//   85  193:invokevirtual   #126 <Method void c(String)>
	//   86  196:sipush          -1002
	//   87  199:ireturn         
	//   88  200:aload           6
	//   89  202:ldc1            #183 <String "INAPP_PURCHASE_ITEM_LIST">
	//   90  204:invokevirtual   #197 <Method ArrayList Bundle.getStringArrayList(String)>
	//   91  207:astore          7
	//   92  209:aload           6
	//   93  211:ldc1            #189 <String "INAPP_PURCHASE_DATA_LIST">
	//   94  213:invokevirtual   #197 <Method ArrayList Bundle.getStringArrayList(String)>
	//   95  216:astore          8
	//   96  218:aload           6
	//   97  220:ldc1            #191 <String "INAPP_DATA_SIGNATURE_LIST">
	//   98  222:invokevirtual   #197 <Method ArrayList Bundle.getStringArrayList(String)>
	//   99  225:astore          9
	//  100  227:iconst_0        
	//  101  228:istore          4
	//  102  230:iload           4
	//  103  232:aload           8
	//  104  234:invokevirtual   #202 <Method int ArrayList.size()>
	//  105  237:icmpge          443
	//  106  240:aload           8
	//  107  242:iload           4
	//  108  244:invokevirtual   #205 <Method Object ArrayList.get(int)>
	//  109  247:checkcast       #83  <Class String>
	//  110  250:astore          10
	//  111  252:aload           9
	//  112  254:iload           4
	//  113  256:invokevirtual   #205 <Method Object ArrayList.get(int)>
	//  114  259:checkcast       #83  <Class String>
	//  115  262:astore          11
	//  116  264:aload           7
	//  117  266:iload           4
	//  118  268:invokevirtual   #205 <Method Object ArrayList.get(int)>
	//  119  271:checkcast       #83  <Class String>
	//  120  274:astore          12
	//  121  276:aload_0         
	//  122  277:getfield        #62  <Field String m>
	//  123  280:aload           10
	//  124  282:aload           11
	//  125  284:invokestatic    #210 <Method boolean cd.a(String, String, String)>
	//  126  287:ifeq            384
	//  127  290:aload_0         
	//  128  291:new             #91  <Class StringBuilder>
	//  129  294:dup             
	//  130  295:invokespecial   #92  <Method void StringBuilder()>
	//  131  298:ldc1            #212 <String "Sku is owned: ">
	//  132  300:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  133  303:aload           12
	//  134  305:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  135  308:invokevirtual   #105 <Method String StringBuilder.toString()>
	//  136  311:invokevirtual   #75  <Method void b(String)>
	//  137  314:new             #214 <Class cc>
	//  138  317:dup             
	//  139  318:aload_2         
	//  140  319:aload           10
	//  141  321:aload           11
	//  142  323:invokespecial   #217 <Method void cc(String, String, String)>
	//  143  326:astore          11
	//  144  328:aload           11
	//  145  330:invokevirtual   #219 <Method String cc.c()>
	//  146  333:invokestatic    #225 <Method boolean TextUtils.isEmpty(CharSequence)>
	//  147  336:ifeq            369
	//  148  339:aload_0         
	//  149  340:ldc1            #227 <String "BUG: empty/null token!">
	//  150  342:invokevirtual   #229 <Method void d(String)>
	//  151  345:aload_0         
	//  152  346:new             #91  <Class StringBuilder>
	//  153  349:dup             
	//  154  350:invokespecial   #92  <Method void StringBuilder()>
	//  155  353:ldc1            #231 <String "Purchase data: ">
	//  156  355:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  157  358:aload           10
	//  158  360:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  159  363:invokevirtual   #105 <Method String StringBuilder.toString()>
	//  160  366:invokevirtual   #75  <Method void b(String)>
	//  161  369:aload_1         
	//  162  370:aload           11
	//  163  372:invokevirtual   #236 <Method void cb.a(cc)>
	//  164  375:iload           4
	//  165  377:iconst_1        
	//  166  378:iadd            
	//  167  379:istore          4
	//  168  381:goto            230
	//  169  384:aload_0         
	//  170  385:ldc1            #238 <String "Purchase signature verification **FAILED**. Not adding item.">
	//  171  387:invokevirtual   #229 <Method void d(String)>
	//  172  390:aload_0         
	//  173  391:new             #91  <Class StringBuilder>
	//  174  394:dup             
	//  175  395:invokespecial   #92  <Method void StringBuilder()>
	//  176  398:ldc1            #240 <String "   Purchase data: ">
	//  177  400:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  178  403:aload           10
	//  179  405:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  180  408:invokevirtual   #105 <Method String StringBuilder.toString()>
	//  181  411:invokevirtual   #75  <Method void b(String)>
	//  182  414:aload_0         
	//  183  415:new             #91  <Class StringBuilder>
	//  184  418:dup             
	//  185  419:invokespecial   #92  <Method void StringBuilder()>
	//  186  422:ldc1            #242 <String "   Signature: ">
	//  187  424:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  188  427:aload           11
	//  189  429:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  190  432:invokevirtual   #105 <Method String StringBuilder.toString()>
	//  191  435:invokevirtual   #75  <Method void b(String)>
	//  192  438:iconst_1        
	//  193  439:istore_3        
	//  194  440:goto            375
	//  195  443:aload           6
	//  196  445:ldc1            #244 <String "INAPP_CONTINUATION_TOKEN">
	//  197  447:invokevirtual   #248 <Method String Bundle.getString(String)>
	//  198  450:astore          6
	//  199  452:aload_0         
	//  200  453:new             #91  <Class StringBuilder>
	//  201  456:dup             
	//  202  457:invokespecial   #92  <Method void StringBuilder()>
	//  203  460:ldc1            #250 <String "Continuation token: ">
	//  204  462:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  205  465:aload           6
	//  206  467:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  207  470:invokevirtual   #105 <Method String StringBuilder.toString()>
	//  208  473:invokevirtual   #75  <Method void b(String)>
	//  209  476:aload           6
	//  210  478:invokestatic    #225 <Method boolean TextUtils.isEmpty(CharSequence)>
	//  211  481:ifeq            44
	//  212  484:iload           5
	//  213  486:istore          4
	//  214  488:iload_3         
	//  215  489:ifeq            41
			return -1003;
	//  216  492:sipush          -1003
	//  217  495:ireturn         
		}
		flag = false;
	//  218  496:iconst_0        
	//  219  497:istore_3        
		do
		{
			b((new StringBuilder()).append("Calling getPurchases with continuation token: ").append(((String) (obj))).toString());
			obj = ((Object) (i.a(3, h.getPackageName(), s, ((String) (obj)))));
			i1 = a(((Bundle) (obj)));
			b((new StringBuilder()).append("Owned items response: ").append(String.valueOf(i1)).toString());
			if(i1 != 0)
			{
				b((new StringBuilder()).append("getPurchases() failed: ").append(a(i1)).toString());
				return i1;
			}
			if(!((Bundle) (obj)).containsKey("INAPP_PURCHASE_ITEM_LIST") || !((Bundle) (obj)).containsKey("INAPP_PURCHASE_DATA_LIST") || !((Bundle) (obj)).containsKey("INAPP_DATA_SIGNATURE_LIST"))
			{
				c("Bundle returned from getPurchases() doesn't contain required fields.");
				return -1002;
			}
			arraylist = ((Bundle) (obj)).getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
			arraylist1 = ((Bundle) (obj)).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
			arraylist2 = ((Bundle) (obj)).getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
			i1 = 0;
			while(i1 < arraylist1.size()) 
			{
				s1 = (String)arraylist1.get(i1);
				obj1 = ((Object) ((String)arraylist2.get(i1)));
				s2 = (String)arraylist.get(i1);
				if(cd.a(m, s1, ((String) (obj1))))
				{
					b((new StringBuilder()).append("Sku is owned: ").append(s2).toString());
					obj1 = ((Object) (new cc(s, s1, ((String) (obj1)))));
					if(TextUtils.isEmpty(((CharSequence) (((cc) (obj1)).c()))))
					{
						d("BUG: empty/null token!");
						b((new StringBuilder()).append("Purchase data: ").append(s1).toString());
					}
					cb1.a(((cc) (obj1)));
				} else
				{
					d("Purchase signature verification **FAILED**. Not adding item.");
					b((new StringBuilder()).append("   Purchase data: ").append(s1).toString());
					b((new StringBuilder()).append("   Signature: ").append(((String) (obj1))).toString());
					flag = true;
				}
				i1++;
			}
			obj = ((Object) (((Bundle) (obj)).getString("INAPP_CONTINUATION_TOKEN")));
			b((new StringBuilder()).append("Continuation token: ").append(((String) (obj))).toString());
		} while(!TextUtils.isEmpty(((CharSequence) (obj))));
		i1 = ((int) (flag1));
		continue;
	//  220  498:goto            44
	}

	int a(String s, cb cb1, List list)
		throws RemoteException, JSONException
	{
		b("Querying SKU details.");
	//    0    0:aload_0         
	//    1    1:ldc1            #254 <String "Querying SKU details.">
	//    2    3:invokevirtual   #75  <Method void b(String)>
		ArrayList arraylist = new ArrayList();
	//    3    6:new             #199 <Class ArrayList>
	//    4    9:dup             
	//    5   10:invokespecial   #255 <Method void ArrayList()>
	//    6   13:astore          5
		arraylist.addAll(((java.util.Collection) (cb1.b(s))));
	//    7   15:aload           5
	//    8   17:aload_2         
	//    9   18:aload_1         
	//   10   19:invokevirtual   #258 <Method List cb.b(String)>
	//   11   22:invokevirtual   #262 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   12   25:pop             
		if(list != null)
	//*  13   26:aload_3         
	//*  14   27:ifnull          78
		{
			list = ((List) (list.iterator()));
	//   15   30:aload_3         
	//   16   31:invokeinterface #268 <Method Iterator List.iterator()>
	//   17   36:astore_3        
			do
			{
				if(!((Iterator) (list)).hasNext())
					break;
	//   18   37:aload_3         
	//   19   38:invokeinterface #274 <Method boolean Iterator.hasNext()>
	//   20   43:ifeq            78
				String s1 = (String)((Iterator) (list)).next();
	//   21   46:aload_3         
	//   22   47:invokeinterface #278 <Method Object Iterator.next()>
	//   23   52:checkcast       #83  <Class String>
	//   24   55:astore          6
				if(!arraylist.contains(((Object) (s1))))
	//*  25   57:aload           5
	//*  26   59:aload           6
	//*  27   61:invokevirtual   #282 <Method boolean ArrayList.contains(Object)>
	//*  28   64:ifne            37
					arraylist.add(((Object) (s1)));
	//   29   67:aload           5
	//   30   69:aload           6
	//   31   71:invokevirtual   #285 <Method boolean ArrayList.add(Object)>
	//   32   74:pop             
			} while(true);
	//   33   75:goto            37
		}
		if(arraylist.size() == 0)
	//*  34   78:aload           5
	//*  35   80:invokevirtual   #202 <Method int ArrayList.size()>
	//*  36   83:ifne            95
		{
			b("queryPrices: nothing to do because there are no SKUs.");
	//   37   86:aload_0         
	//   38   87:ldc2            #287 <String "queryPrices: nothing to do because there are no SKUs.">
	//   39   90:invokevirtual   #75  <Method void b(String)>
			return 0;
	//   40   93:iconst_0        
	//   41   94:ireturn         
		}
		if(d)
	//*  42   95:aload_0         
	//*  43   96:getfield        #52  <Field boolean d>
	//*  44   99:ifeq            106
			return -1002;
	//   45  102:sipush          -1002
	//   46  105:ireturn         
		list = ((List) (new Bundle()));
	//   47  106:new             #118 <Class Bundle>
	//   48  109:dup             
	//   49  110:invokespecial   #288 <Method void Bundle()>
	//   50  113:astore_3        
		((Bundle) (list)).putStringArrayList("ITEM_ID_LIST", arraylist);
	//   51  114:aload_3         
	//   52  115:ldc2            #290 <String "ITEM_ID_LIST">
	//   53  118:aload           5
	//   54  120:invokevirtual   #294 <Method void Bundle.putStringArrayList(String, ArrayList)>
		list = ((List) (i.a(3, h.getPackageName(), s, ((Bundle) (list)))));
	//   55  123:aload_0         
	//   56  124:getfield        #165 <Field bu i>
	//   57  127:iconst_3        
	//   58  128:aload_0         
	//   59  129:getfield        #70  <Field Context h>
	//   60  132:invokevirtual   #168 <Method String Context.getPackageName()>
	//   61  135:aload_1         
	//   62  136:aload_3         
	//   63  137:invokeinterface #297 <Method Bundle bu.a(int, String, String, Bundle)>
	//   64  142:astore_3        
		if(!((Bundle) (list)).containsKey("DETAILS_LIST"))
	//*  65  143:aload_3         
	//*  66  144:ldc2            #299 <String "DETAILS_LIST">
	//*  67  147:invokevirtual   #187 <Method boolean Bundle.containsKey(String)>
	//*  68  150:ifne            207
		{
			int i1 = a(((Bundle) (list)));
	//   69  153:aload_0         
	//   70  154:aload_3         
	//   71  155:invokevirtual   #175 <Method int a(Bundle)>
	//   72  158:istore          4
			if(i1 != 0)
	//*  73  160:iload           4
	//*  74  162:ifeq            196
			{
				b((new StringBuilder()).append("getSkuDetails() failed: ").append(a(i1)).toString());
	//   75  165:aload_0         
	//   76  166:new             #91  <Class StringBuilder>
	//   77  169:dup             
	//   78  170:invokespecial   #92  <Method void StringBuilder()>
	//   79  173:ldc2            #301 <String "getSkuDetails() failed: ">
	//   80  176:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   81  179:iload           4
	//   82  181:invokestatic    #181 <Method String a(int)>
	//   83  184:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   84  187:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   85  190:invokevirtual   #75  <Method void b(String)>
				return i1;
	//   86  193:iload           4
	//   87  195:ireturn         
			} else
			{
				c("getSkuDetails() returned a bundle with neither an error nor a detail list.");
	//   88  196:aload_0         
	//   89  197:ldc2            #303 <String "getSkuDetails() returned a bundle with neither an error nor a detail list.">
	//   90  200:invokevirtual   #126 <Method void c(String)>
				return -1002;
	//   91  203:sipush          -1002
	//   92  206:ireturn         
			}
		}
		ce ce1;
		for(list = ((List) (((Bundle) (list)).getStringArrayList("DETAILS_LIST").iterator())); ((Iterator) (list)).hasNext(); cb1.a(ce1))
	//*  93  207:aload_3         
	//*  94  208:ldc2            #299 <String "DETAILS_LIST">
	//*  95  211:invokevirtual   #197 <Method ArrayList Bundle.getStringArrayList(String)>
	//*  96  214:invokevirtual   #304 <Method Iterator ArrayList.iterator()>
	//*  97  217:astore_3        
	//*  98  218:aload_3         
	//*  99  219:invokeinterface #274 <Method boolean Iterator.hasNext()>
	//* 100  224:ifeq            280
		{
			ce1 = new ce(s, (String)((Iterator) (list)).next());
	//  101  227:new             #306 <Class ce>
	//  102  230:dup             
	//  103  231:aload_1         
	//  104  232:aload_3         
	//  105  233:invokeinterface #278 <Method Object Iterator.next()>
	//  106  238:checkcast       #83  <Class String>
	//  107  241:invokespecial   #309 <Method void ce(String, String)>
	//  108  244:astore          5
			b((new StringBuilder()).append("Got sku details: ").append(((Object) (ce1))).toString());
	//  109  246:aload_0         
	//  110  247:new             #91  <Class StringBuilder>
	//  111  250:dup             
	//  112  251:invokespecial   #92  <Method void StringBuilder()>
	//  113  254:ldc2            #311 <String "Got sku details: ">
	//  114  257:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  115  260:aload           5
	//  116  262:invokevirtual   #314 <Method StringBuilder StringBuilder.append(Object)>
	//  117  265:invokevirtual   #105 <Method String StringBuilder.toString()>
	//  118  268:invokevirtual   #75  <Method void b(String)>
		}

	//  119  271:aload_2         
	//  120  272:aload           5
	//  121  274:invokevirtual   #317 <Method void cb.a(ce)>
	//* 122  277:goto            218
		return 0;
	//  123  280:iconst_0        
	//  124  281:ireturn         
	}

	public cb a(boolean flag, List list)
		throws by
	{
		return a(flag, list, ((List) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #325 <Method cb a(boolean, List, List)>
	//    5    7:areturn         
	}

	public cb a(boolean flag, List list, List list1)
		throws by
	{
		if(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field boolean d>
	//*   2    4:ifeq            20
			throw new by(6, "Error refreshing inventory (querying owned items).");
	//    3    7:new             #322 <Class by>
	//    4   10:dup             
	//    5   11:bipush          6
	//    6   13:ldc2            #328 <String "Error refreshing inventory (querying owned items).">
	//    7   16:invokespecial   #331 <Method void by(int, String)>
	//    8   19:athrow          
		if(!c)
	//*   9   20:aload_0         
	//*  10   21:getfield        #50  <Field boolean c>
	//*  11   24:ifne            40
			throw new by(6, "Error refreshing inventory (querying owned items).");
	//   12   27:new             #322 <Class by>
	//   13   30:dup             
	//   14   31:bipush          6
	//   15   33:ldc2            #328 <String "Error refreshing inventory (querying owned items).">
	//   16   36:invokespecial   #331 <Method void by(int, String)>
	//   17   39:athrow          
		int i1;
		try
		{
			list1 = ((List) (new cb()));
	//   18   40:new             #233 <Class cb>
	//   19   43:dup             
	//   20   44:invokespecial   #332 <Method void cb()>
	//   21   47:astore_3        
			i1 = a(((cb) (list1)), "inapp");
	//   22   48:aload_0         
	//   23   49:aload_3         
	//   24   50:ldc2            #334 <String "inapp">
	//   25   53:invokevirtual   #336 <Method int a(cb, String)>
	//   26   56:istore          4
		}
	//*  27   58:iload           4
	//*  28   60:ifeq            92
	//*  29   63:new             #322 <Class by>
	//*  30   66:dup             
	//*  31   67:iload           4
	//*  32   69:ldc2            #328 <String "Error refreshing inventory (querying owned items).">
	//*  33   72:invokespecial   #331 <Method void by(int, String)>
	//*  34   75:athrow          
		// Misplaced declaration of an exception variable
		catch(List list)
	//*  35   76:astore_2        
		{
			throw new by(-1001, "Remote exception while refreshing inventory.", ((Exception) (list)));
	//   36   77:new             #322 <Class by>
	//   37   80:dup             
	//   38   81:sipush          -1001
	//   39   84:ldc2            #338 <String "Remote exception while refreshing inventory.">
	//   40   87:aload_2         
	//   41   88:invokespecial   #341 <Method void by(int, String, Exception)>
	//   42   91:athrow          
		}
	//*  43   92:iload_1         
	//*  44   93:ifeq            141
	//*  45   96:aload_0         
	//*  46   97:ldc2            #334 <String "inapp">
	//*  47  100:aload_3         
	//*  48  101:aload_2         
	//*  49  102:invokevirtual   #343 <Method int a(String, cb, List)>
	//*  50  105:istore          4
	//*  51  107:iload           4
	//*  52  109:ifeq            141
	//*  53  112:new             #322 <Class by>
	//*  54  115:dup             
	//*  55  116:iload           4
	//*  56  118:ldc2            #345 <String "Error refreshing inventory (querying prices of items).">
	//*  57  121:invokespecial   #331 <Method void by(int, String)>
	//*  58  124:athrow          
		// Misplaced declaration of an exception variable
		catch(List list)
	//*  59  125:astore_2        
		{
			throw new by(-1002, "Error parsing JSON response while refreshing inventory.", ((Exception) (list)));
	//   60  126:new             #322 <Class by>
	//   61  129:dup             
	//   62  130:sipush          -1002
	//   63  133:ldc2            #347 <String "Error parsing JSON response while refreshing inventory.">
	//   64  136:aload_2         
	//   65  137:invokespecial   #341 <Method void by(int, String, Exception)>
	//   66  140:athrow          
		}
		if(i1 == 0)
			break MISSING_BLOCK_LABEL_92;
		throw new by(i1, "Error refreshing inventory (querying owned items).");
		if(!flag)
			break MISSING_BLOCK_LABEL_141;
		i1 = a("inapp", ((cb) (list1)), list);
		if(i1 == 0)
			break MISSING_BLOCK_LABEL_141;
		throw new by(i1, "Error refreshing inventory (querying prices of items).");
		int j1;
		if(!e)
			break MISSING_BLOCK_LABEL_209;
	//   67  141:aload_0         
	//   68  142:getfield        #54  <Field boolean e>
	//   69  145:ifeq            209
		j1 = a(((cb) (list1)), "subs");
	//   70  148:aload_0         
	//   71  149:aload_3         
	//   72  150:ldc2            #349 <String "subs">
	//   73  153:invokevirtual   #336 <Method int a(cb, String)>
	//   74  156:istore          4
		if(j1 == 0)
			break MISSING_BLOCK_LABEL_176;
	//   75  158:iload           4
	//   76  160:ifeq            176
		throw new by(j1, "Error refreshing inventory (querying owned subscriptions).");
	//   77  163:new             #322 <Class by>
	//   78  166:dup             
	//   79  167:iload           4
	//   80  169:ldc2            #351 <String "Error refreshing inventory (querying owned subscriptions).">
	//   81  172:invokespecial   #331 <Method void by(int, String)>
	//   82  175:athrow          
		if(!flag)
			break MISSING_BLOCK_LABEL_209;
	//   83  176:iload_1         
	//   84  177:ifeq            209
		j1 = a("subs", ((cb) (list1)), list);
	//   85  180:aload_0         
	//   86  181:ldc2            #349 <String "subs">
	//   87  184:aload_3         
	//   88  185:aload_2         
	//   89  186:invokevirtual   #343 <Method int a(String, cb, List)>
	//   90  189:istore          4
		if(j1 == 0)
			break MISSING_BLOCK_LABEL_209;
	//   91  191:iload           4
	//   92  193:ifeq            209
		throw new by(j1, "Error refreshing inventory (querying prices of subscriptions).");
	//   93  196:new             #322 <Class by>
	//   94  199:dup             
	//   95  200:iload           4
	//   96  202:ldc2            #353 <String "Error refreshing inventory (querying prices of subscriptions).">
	//   97  205:invokespecial   #331 <Method void by(int, String)>
	//   98  208:athrow          
		return ((cb) (list1));
	//   99  209:aload_3         
	//  100  210:areturn         
	}

	public void a()
	{
		b("Disposing.");
	//    0    0:aload_0         
	//    1    1:ldc2            #356 <String "Disposing.">
	//    2    4:invokevirtual   #75  <Method void b(String)>
		c = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #50  <Field boolean c>
		if(j != null && i != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #358 <Field ServiceConnection j>
	//*   8   16:ifnull          51
	//*   9   19:aload_0         
	//*  10   20:getfield        #165 <Field bu i>
	//*  11   23:ifnull          51
		{
			b("Unbinding from service.");
	//   12   26:aload_0         
	//   13   27:ldc2            #360 <String "Unbinding from service.">
	//   14   30:invokevirtual   #75  <Method void b(String)>
			if(h != null)
	//*  15   33:aload_0         
	//*  16   34:getfield        #70  <Field Context h>
	//*  17   37:ifnull          51
				h.unbindService(j);
	//   18   40:aload_0         
	//   19   41:getfield        #70  <Field Context h>
	//   20   44:aload_0         
	//   21   45:getfield        #358 <Field ServiceConnection j>
	//   22   48:invokevirtual   #364 <Method void Context.unbindService(ServiceConnection)>
		}
		d = true;
	//   23   51:aload_0         
	//   24   52:iconst_1        
	//   25   53:putfield        #52  <Field boolean d>
		h = null;
	//   26   56:aload_0         
	//   27   57:aconst_null     
	//   28   58:putfield        #70  <Field Context h>
		j = null;
	//   29   61:aload_0         
	//   30   62:aconst_null     
	//   31   63:putfield        #358 <Field ServiceConnection j>
		i = null;
	//   32   66:aload_0         
	//   33   67:aconst_null     
	//   34   68:putfield        #165 <Field bu i>
		n = null;
	//   35   71:aload_0         
	//   36   72:aconst_null     
	//   37   73:putfield        #366 <Field bz$a n>
	//   38   76:return          
	}

	public void a(Activity activity, String s, int i1, a a1, String s1)
	{
		a(activity, s, "inapp", i1, a1, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc2            #334 <String "inapp">
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:invokevirtual   #370 <Method void a(Activity, String, String, int, bz$a, String)>
	//    8   14:return          
	}

	public void a(Activity activity, String s, String s1, int i1, a a1, String s2)
	{
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field boolean d>
	//*   2    4:ifeq            8
_L2:
		return;
	//    3    7:return          
		if(d || !c) goto _L2; else goto _L1
	//    4    8:aload_0         
	//    5    9:getfield        #50  <Field boolean c>
	//    6   12:ifeq            7
_L1:
		a("launchPurchaseFlow");
	//    7   15:aload_0         
	//    8   16:ldc2            #374 <String "launchPurchaseFlow">
	//    9   19:invokevirtual   #376 <Method void a(String)>
		if(!s1.equals("subs") || e)
			continue; /* Loop/switch isn't completed */
	//   10   22:aload_3         
	//   11   23:ldc2            #349 <String "subs">
	//   12   26:invokevirtual   #379 <Method boolean String.equals(Object)>
	//   13   29:ifeq            72
	//   14   32:aload_0         
	//   15   33:getfield        #54  <Field boolean e>
	//   16   36:ifne            72
		activity = ((Activity) (new ca(-1009, "Subscriptions are not available.")));
	//   17   39:new             #381 <Class ca>
	//   18   42:dup             
	//   19   43:sipush          -1009
	//   20   46:ldc2            #383 <String "Subscriptions are not available.">
	//   21   49:invokespecial   #384 <Method void ca(int, String)>
	//   22   52:astore_1        
		b();
	//   23   53:aload_0         
	//   24   54:invokevirtual   #386 <Method void b()>
		if(a1 != null)
	//*  25   57:aload           5
	//*  26   59:ifnull          7
		{
			a1.a(((ca) (activity)), ((cc) (null)));
	//   27   62:aload           5
	//   28   64:aload_1         
	//   29   65:aconst_null     
	//   30   66:invokeinterface #389 <Method void bz$a.a(ca, cc)>
			return;
	//   31   71:return          
		}
		continue; /* Loop/switch isn't completed */
		if(d) goto _L2; else goto _L3
	//   32   72:aload_0         
	//   33   73:getfield        #52  <Field boolean d>
	//   34   76:ifne            7
_L3:
		int j1;
		b((new StringBuilder()).append("Constructing buy intent for ").append(s).append(", item type: ").append(s1).toString());
	//   35   79:aload_0         
	//   36   80:new             #91  <Class StringBuilder>
	//   37   83:dup             
	//   38   84:invokespecial   #92  <Method void StringBuilder()>
	//   39   87:ldc2            #391 <String "Constructing buy intent for ">
	//   40   90:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   41   93:aload_2         
	//   42   94:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   43   97:ldc2            #393 <String ", item type: ">
	//   44  100:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   45  103:aload_3         
	//   46  104:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   47  107:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   48  110:invokevirtual   #75  <Method void b(String)>
		s2 = ((String) (i.a(3, h.getPackageName(), s, s1, s2)));
	//   49  113:aload_0         
	//   50  114:getfield        #165 <Field bu i>
	//   51  117:iconst_3        
	//   52  118:aload_0         
	//   53  119:getfield        #70  <Field Context h>
	//   54  122:invokevirtual   #168 <Method String Context.getPackageName()>
	//   55  125:aload_2         
	//   56  126:aload_3         
	//   57  127:aload           6
	//   58  129:invokeinterface #396 <Method Bundle bu.a(int, String, String, String, String)>
	//   59  134:astore          6
		j1 = a(((Bundle) (s2)));
	//   60  136:aload_0         
	//   61  137:aload           6
	//   62  139:invokevirtual   #175 <Method int a(Bundle)>
	//   63  142:istore          7
		if(j1 == 0)
			break MISSING_BLOCK_LABEL_271;
	//   64  144:iload           7
	//   65  146:ifeq            271
		c((new StringBuilder()).append("Unable to buy item, Error response: ").append(a(j1)).toString());
	//   66  149:aload_0         
	//   67  150:new             #91  <Class StringBuilder>
	//   68  153:dup             
	//   69  154:invokespecial   #92  <Method void StringBuilder()>
	//   70  157:ldc2            #398 <String "Unable to buy item, Error response: ">
	//   71  160:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   72  163:iload           7
	//   73  165:invokestatic    #181 <Method String a(int)>
	//   74  168:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   75  171:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   76  174:invokevirtual   #126 <Method void c(String)>
		b();
	//   77  177:aload_0         
	//   78  178:invokevirtual   #386 <Method void b()>
		activity = ((Activity) (new ca(j1, "Unable to buy item")));
	//   79  181:new             #381 <Class ca>
	//   80  184:dup             
	//   81  185:iload           7
	//   82  187:ldc2            #400 <String "Unable to buy item">
	//   83  190:invokespecial   #384 <Method void ca(int, String)>
	//   84  193:astore_1        
		if(a1 != null)
	//*  85  194:aload           5
	//*  86  196:ifnull          7
			try
			{
				a1.a(((ca) (activity)), ((cc) (null)));
	//   87  199:aload           5
	//   88  201:aload_1         
	//   89  202:aconst_null     
	//   90  203:invokeinterface #389 <Method void bz$a.a(ca, cc)>
				return;
	//   91  208:return          
			}
			// Misplaced declaration of an exception variable
			catch(Activity activity)
	//*  92  209:astore_1        
			{
				c((new StringBuilder()).append("SendIntentException while launching purchase flow for sku ").append(s).toString());
	//   93  210:aload_0         
	//   94  211:new             #91  <Class StringBuilder>
	//   95  214:dup             
	//   96  215:invokespecial   #92  <Method void StringBuilder()>
	//   97  218:ldc2            #402 <String "SendIntentException while launching purchase flow for sku ">
	//   98  221:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   99  224:aload_2         
	//  100  225:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  101  228:invokevirtual   #105 <Method String StringBuilder.toString()>
	//  102  231:invokevirtual   #126 <Method void c(String)>
				((android.content.IntentSender.SendIntentException) (activity)).printStackTrace();
	//  103  234:aload_1         
	//  104  235:invokevirtual   #405 <Method void android.content.IntentSender$SendIntentException.printStackTrace()>
				b();
	//  105  238:aload_0         
	//  106  239:invokevirtual   #386 <Method void b()>
				activity = ((Activity) (new ca(-1004, "Failed to send intent.")));
	//  107  242:new             #381 <Class ca>
	//  108  245:dup             
	//  109  246:sipush          -1004
	//  110  249:ldc2            #407 <String "Failed to send intent.">
	//  111  252:invokespecial   #384 <Method void ca(int, String)>
	//  112  255:astore_1        
				if(a1 != null)
	//* 113  256:aload           5
	//* 114  258:ifnull          7
				{
					a1.a(((ca) (activity)), ((cc) (null)));
	//  115  261:aload           5
	//  116  263:aload_1         
	//  117  264:aconst_null     
	//  118  265:invokeinterface #389 <Method void bz$a.a(ca, cc)>
					return;
	//  119  270:return          
				}
			}
	//* 120  271:aload           6
	//* 121  273:ldc2            #409 <String "BUY_INTENT">
	//* 122  276:invokevirtual   #413 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//* 123  279:checkcast       #415 <Class PendingIntent>
	//* 124  282:astore          6
	//* 125  284:aload_0         
	//* 126  285:new             #91  <Class StringBuilder>
	//* 127  288:dup             
	//* 128  289:invokespecial   #92  <Method void StringBuilder()>
	//* 129  292:ldc2            #417 <String "Launching buy intent for ">
	//* 130  295:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//* 131  298:aload_2         
	//* 132  299:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//* 133  302:ldc2            #419 <String ". Request code: ">
	//* 134  305:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//* 135  308:iload           4
	//* 136  310:invokevirtual   #422 <Method StringBuilder StringBuilder.append(int)>
	//* 137  313:invokevirtual   #105 <Method String StringBuilder.toString()>
	//* 138  316:invokevirtual   #75  <Method void b(String)>
	//* 139  319:aload_0         
	//* 140  320:iload           4
	//* 141  322:putfield        #424 <Field int k>
	//* 142  325:aload_0         
	//* 143  326:aload           5
	//* 144  328:putfield        #366 <Field bz$a n>
	//* 145  331:aload_0         
	//* 146  332:aload_3         
	//* 147  333:putfield        #426 <Field String l>
	//* 148  336:aload_1         
	//* 149  337:aload           6
	//* 150  339:invokevirtual   #430 <Method android.content.IntentSender PendingIntent.getIntentSender()>
	//* 151  342:iload           4
	//* 152  344:new             #110 <Class Intent>
	//* 153  347:dup             
	//* 154  348:invokespecial   #431 <Method void Intent()>
	//* 155  351:iconst_0        
	//* 156  352:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//* 157  355:invokevirtual   #132 <Method int Integer.intValue()>
	//* 158  358:iconst_0        
	//* 159  359:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//* 160  362:invokevirtual   #132 <Method int Integer.intValue()>
	//* 161  365:iconst_0        
	//* 162  366:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//* 163  369:invokevirtual   #132 <Method int Integer.intValue()>
	//* 164  372:invokevirtual   #440 <Method void Activity.startIntentSenderForResult(android.content.IntentSender, int, Intent, int, int, int)>
	//* 165  375:return          
			// Misplaced declaration of an exception variable
			catch(Activity activity)
	//* 166  376:astore_1        
			{
				c((new StringBuilder()).append("RemoteException while launching purchase flow for sku ").append(s).toString());
	//  167  377:aload_0         
	//  168  378:new             #91  <Class StringBuilder>
	//  169  381:dup             
	//  170  382:invokespecial   #92  <Method void StringBuilder()>
	//  171  385:ldc2            #442 <String "RemoteException while launching purchase flow for sku ">
	//  172  388:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  173  391:aload_2         
	//  174  392:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  175  395:invokevirtual   #105 <Method String StringBuilder.toString()>
	//  176  398:invokevirtual   #126 <Method void c(String)>
				((RemoteException) (activity)).printStackTrace();
	//  177  401:aload_1         
	//  178  402:invokevirtual   #443 <Method void RemoteException.printStackTrace()>
				b();
	//  179  405:aload_0         
	//  180  406:invokevirtual   #386 <Method void b()>
				activity = ((Activity) (new ca(-1001, "Remote exception while starting purchase flow")));
	//  181  409:new             #381 <Class ca>
	//  182  412:dup             
	//  183  413:sipush          -1001
	//  184  416:ldc2            #445 <String "Remote exception while starting purchase flow">
	//  185  419:invokespecial   #384 <Method void ca(int, String)>
	//  186  422:astore_1        
				if(a1 != null)
	//* 187  423:aload           5
	//* 188  425:ifnull          7
				{
					a1.a(((ca) (activity)), ((cc) (null)));
	//  189  428:aload           5
	//  190  430:aload_1         
	//  191  431:aconst_null     
	//  192  432:invokeinterface #389 <Method void bz$a.a(ca, cc)>
					return;
	//  193  437:return          
				}
			}
		continue; /* Loop/switch isn't completed */
		s2 = ((String) ((PendingIntent)((Bundle) (s2)).getParcelable("BUY_INTENT")));
		b((new StringBuilder()).append("Launching buy intent for ").append(s).append(". Request code: ").append(i1).toString());
		k = i1;
		n = a1;
		l = s1;
		activity.startIntentSenderForResult(((PendingIntent) (s2)).getIntentSender(), i1, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
		return;
		if(true) goto _L2; else goto _L4
_L4:
	}

	public void a(b b1)
	{
		if(!d && !c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field boolean d>
	//*   2    4:ifeq            8
	//*   3    7:return          
	//*   4    8:aload_0         
	//*   5    9:getfield        #50  <Field boolean c>
	//*   6   12:ifne            7
		{
			b("Starting in-app billing setup.");
	//    7   15:aload_0         
	//    8   16:ldc2            #448 <String "Starting in-app billing setup.">
	//    9   19:invokevirtual   #75  <Method void b(String)>
			j = new ServiceConnection(b1) {

				public void onServiceConnected(ComponentName componentname, IBinder ibinder)
				{
					if(!b.d) goto _L2; else goto _L1
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field bz b>
				//    2    4:getfield        #32  <Field boolean bz.d>
				//    3    7:ifeq            11
_L1:
					return;
				//    4   10:return          
_L2:
					b.b("Billing service connected.");
				//    5   11:aload_0         
				//    6   12:getfield        #18  <Field bz b>
				//    7   15:ldc1            #34  <String "Billing service connected.">
				//    8   17:invokevirtual   #37  <Method void bz.b(String)>
					b.i = bu.a.a(ibinder);
				//    9   20:aload_0         
				//   10   21:getfield        #18  <Field bz b>
				//   11   24:aload_2         
				//   12   25:invokestatic    #42  <Method bu bu$a.a(IBinder)>
				//   13   28:putfield        #46  <Field bu bz.i>
					componentname = ((ComponentName) (b.h.getPackageName()));
				//   14   31:aload_0         
				//   15   32:getfield        #18  <Field bz b>
				//   16   35:getfield        #50  <Field Context bz.h>
				//   17   38:invokevirtual   #56  <Method String Context.getPackageName()>
				//   18   41:astore_1        
					int i1;
					b.b("Checking for in-app billing 3 support.");
				//   19   42:aload_0         
				//   20   43:getfield        #18  <Field bz b>
				//   21   46:ldc1            #58  <String "Checking for in-app billing 3 support.">
				//   22   48:invokevirtual   #37  <Method void bz.b(String)>
					i1 = b.i.a(3, ((String) (componentname)), "inapp");
				//   23   51:aload_0         
				//   24   52:getfield        #18  <Field bz b>
				//   25   55:getfield        #46  <Field bu bz.i>
				//   26   58:iconst_3        
				//   27   59:aload_1         
				//   28   60:ldc1            #60  <String "inapp">
				//   29   62:invokeinterface #65  <Method int bu.a(int, String, String)>
				//   30   67:istore_3        
					if(i1 != 0)
				//*  31   68:iload_3         
				//*  32   69:ifeq            141
					{
						try
						{
							if(a != null)
				//*  33   72:aload_0         
				//*  34   73:getfield        #20  <Field bz$b a>
				//*  35   76:ifnull          98
								a.a(new ca(i1, "Error checking for billing v3 support."));
				//   36   79:aload_0         
				//   37   80:getfield        #20  <Field bz$b a>
				//   38   83:new             #67  <Class ca>
				//   39   86:dup             
				//   40   87:iload_3         
				//   41   88:ldc1            #69  <String "Error checking for billing v3 support.">
				//   42   90:invokespecial   #72  <Method void ca(int, String)>
				//   43   93:invokeinterface #77  <Method void bz$b.a(ca)>
							b.e = false;
				//   44   98:aload_0         
				//   45   99:getfield        #18  <Field bz b>
				//   46  102:iconst_0        
				//   47  103:putfield        #80  <Field boolean bz.e>
							return;
				//   48  106:return          
						}
						// Misplaced declaration of an exception variable
						catch(ComponentName componentname) { }
				//   49  107:astore_1        
						if(a != null)
				//*  50  108:aload_0         
				//*  51  109:getfield        #20  <Field bz$b a>
				//*  52  112:ifnull          136
							a.a(new ca(-1001, "RemoteException while setting up in-app billing."));
				//   53  115:aload_0         
				//   54  116:getfield        #20  <Field bz$b a>
				//   55  119:new             #67  <Class ca>
				//   56  122:dup             
				//   57  123:sipush          -1001
				//   58  126:ldc1            #82  <String "RemoteException while setting up in-app billing.">
				//   59  128:invokespecial   #72  <Method void ca(int, String)>
				//   60  131:invokeinterface #77  <Method void bz$b.a(ca)>
						((RemoteException) (componentname)).printStackTrace();
				//   61  136:aload_1         
				//   62  137:invokevirtual   #85  <Method void RemoteException.printStackTrace()>
						return;
				//   63  140:return          
					}
					b.b((new StringBuilder()).append("In-app billing version 3 supported for ").append(((String) (componentname))).toString());
				//   64  141:aload_0         
				//   65  142:getfield        #18  <Field bz b>
				//   66  145:new             #87  <Class StringBuilder>
				//   67  148:dup             
				//   68  149:invokespecial   #88  <Method void StringBuilder()>
				//   69  152:ldc1            #90  <String "In-app billing version 3 supported for ">
				//   70  154:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
				//   71  157:aload_1         
				//   72  158:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
				//   73  161:invokevirtual   #97  <Method String StringBuilder.toString()>
				//   74  164:invokevirtual   #37  <Method void bz.b(String)>
					i1 = b.i.a(3, ((String) (componentname)), "subs");
				//   75  167:aload_0         
				//   76  168:getfield        #18  <Field bz b>
				//   77  171:getfield        #46  <Field bu bz.i>
				//   78  174:iconst_3        
				//   79  175:aload_1         
				//   80  176:ldc1            #99  <String "subs">
				//   81  178:invokeinterface #65  <Method int bu.a(int, String, String)>
				//   82  183:istore_3        
					if(i1 != 0)
						break MISSING_BLOCK_LABEL_240;
				//   83  184:iload_3         
				//   84  185:ifne            240
					b.b("Subscriptions AVAILABLE.");
				//   85  188:aload_0         
				//   86  189:getfield        #18  <Field bz b>
				//   87  192:ldc1            #101 <String "Subscriptions AVAILABLE.">
				//   88  194:invokevirtual   #37  <Method void bz.b(String)>
					b.e = true;
				//   89  197:aload_0         
				//   90  198:getfield        #18  <Field bz b>
				//   91  201:iconst_1        
				//   92  202:putfield        #80  <Field boolean bz.e>
_L4:
					b.c = true;
				//   93  205:aload_0         
				//   94  206:getfield        #18  <Field bz b>
				//   95  209:iconst_1        
				//   96  210:putfield        #104 <Field boolean bz.c>
					if(a == null) goto _L1; else goto _L3
				//   97  213:aload_0         
				//   98  214:getfield        #20  <Field bz$b a>
				//   99  217:ifnull          10
_L3:
					a.a(new ca(0, "Setup successful."));
				//  100  220:aload_0         
				//  101  221:getfield        #20  <Field bz$b a>
				//  102  224:new             #67  <Class ca>
				//  103  227:dup             
				//  104  228:iconst_0        
				//  105  229:ldc1            #106 <String "Setup successful.">
				//  106  231:invokespecial   #72  <Method void ca(int, String)>
				//  107  234:invokeinterface #77  <Method void bz$b.a(ca)>
					return;
				//  108  239:return          
					b.b((new StringBuilder()).append("Subscriptions NOT AVAILABLE. Response: ").append(i1).toString());
				//  109  240:aload_0         
				//  110  241:getfield        #18  <Field bz b>
				//  111  244:new             #87  <Class StringBuilder>
				//  112  247:dup             
				//  113  248:invokespecial   #88  <Method void StringBuilder()>
				//  114  251:ldc1            #108 <String "Subscriptions NOT AVAILABLE. Response: ">
				//  115  253:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
				//  116  256:iload_3         
				//  117  257:invokevirtual   #111 <Method StringBuilder StringBuilder.append(int)>
				//  118  260:invokevirtual   #97  <Method String StringBuilder.toString()>
				//  119  263:invokevirtual   #37  <Method void bz.b(String)>
					  goto _L4
				//* 120  266:goto            205
				}

				public void onServiceDisconnected(ComponentName componentname)
				{
					b.b("Billing service disconnected.");
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field bz b>
				//    2    4:ldc1            #115 <String "Billing service disconnected.">
				//    3    6:invokevirtual   #37  <Method void bz.b(String)>
					b.i = null;
				//    4    9:aload_0         
				//    5   10:getfield        #18  <Field bz b>
				//    6   13:aconst_null     
				//    7   14:putfield        #46  <Field bu bz.i>
				//    8   17:return          
				}

				final b a;
				final bz b;

			
			{
				b = bz.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field bz b>
				a = b1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field bz$b a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
;
	//   10   22:aload_0         
	//   11   23:new             #6   <Class bz$1>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:invokespecial   #451 <Method void bz$1(bz, bz$b)>
	//   16   32:putfield        #358 <Field ServiceConnection j>
			Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
	//   17   35:new             #110 <Class Intent>
	//   18   38:dup             
	//   19   39:ldc2            #453 <String "com.android.vending.billing.InAppBillingService.BIND">
	//   20   42:invokespecial   #455 <Method void Intent(String)>
	//   21   45:astore_2        
			intent.setPackage("com.android.vending");
	//   22   46:aload_2         
	//   23   47:ldc2            #457 <String "com.android.vending">
	//   24   50:invokevirtual   #461 <Method Intent Intent.setPackage(String)>
	//   25   53:pop             
			if(h.getPackageManager().queryIntentServices(intent, 0) != null && !h.getPackageManager().queryIntentServices(intent, 0).isEmpty())
	//*  26   54:aload_0         
	//*  27   55:getfield        #70  <Field Context h>
	//*  28   58:invokevirtual   #465 <Method PackageManager Context.getPackageManager()>
	//*  29   61:aload_2         
	//*  30   62:iconst_0        
	//*  31   63:invokevirtual   #471 <Method List PackageManager.queryIntentServices(Intent, int)>
	//*  32   66:ifnull          104
	//*  33   69:aload_0         
	//*  34   70:getfield        #70  <Field Context h>
	//*  35   73:invokevirtual   #465 <Method PackageManager Context.getPackageManager()>
	//*  36   76:aload_2         
	//*  37   77:iconst_0        
	//*  38   78:invokevirtual   #471 <Method List PackageManager.queryIntentServices(Intent, int)>
	//*  39   81:invokeinterface #473 <Method boolean List.isEmpty()>
	//*  40   86:ifne            104
			{
				h.bindService(intent, j, 1);
	//   41   89:aload_0         
	//   42   90:getfield        #70  <Field Context h>
	//   43   93:aload_2         
	//   44   94:aload_0         
	//   45   95:getfield        #358 <Field ServiceConnection j>
	//   46   98:iconst_1        
	//   47   99:invokevirtual   #477 <Method boolean Context.bindService(Intent, ServiceConnection, int)>
	//   48  102:pop             
				return;
	//   49  103:return          
			}
			if(b1 != null)
	//*  50  104:aload_1         
	//*  51  105:ifnull          7
			{
				b1.a(new ca(3, "Billing service unavailable on device."));
	//   52  108:aload_1         
	//   53  109:new             #381 <Class ca>
	//   54  112:dup             
	//   55  113:iconst_3        
	//   56  114:ldc2            #479 <String "Billing service unavailable on device.">
	//   57  117:invokespecial   #384 <Method void ca(int, String)>
	//   58  120:invokeinterface #482 <Method void bz$b.a(ca)>
				return;
	//   59  125:return          
			}
		}
	}

	public void a(c c1)
	{
		a(true, ((List) (null)), c1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aconst_null     
	//    3    3:aload_1         
	//    4    4:invokevirtual   #486 <Method void a(boolean, List, bz$c)>
	//    5    7:return          
	}

	void a(String s)
	{
		if(f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field boolean f>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			g = s;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #60  <Field String g>
			f = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #56  <Field boolean f>
			b((new StringBuilder()).append("Starting async operation: ").append(s).toString());
	//   10   18:aload_0         
	//   11   19:new             #91  <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #92  <Method void StringBuilder()>
	//   14   26:ldc2            #488 <String "Starting async operation: ">
	//   15   29:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:aload_1         
	//   17   33:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   19   39:invokevirtual   #75  <Method void b(String)>
			return;
	//   20   42:return          
		}
	}

	public void a(boolean flag)
	{
		if(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field boolean d>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			a = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #44  <Field boolean a>
			return;
	//    7   13:return          
		}
	}

	public void a(boolean flag, List list, c c1)
	{
		Handler handler;
		for(handler = new Handler(); d || !c;)
	//*   0    0:new             #491 <Class Handler>
	//*   1    3:dup             
	//*   2    4:invokespecial   #492 <Method void Handler()>
	//*   3    7:astore          4
	//*   4    9:aload_0         
	//*   5   10:getfield        #52  <Field boolean d>
	//*   6   13:ifeq            17
			return;
	//    7   16:return          

	//    8   17:aload_0         
	//    9   18:getfield        #50  <Field boolean c>
	//   10   21:ifeq            16
		a("refresh inventory");
	//   11   24:aload_0         
	//   12   25:ldc2            #494 <String "refresh inventory">
	//   13   28:invokevirtual   #376 <Method void a(String)>
		(new Thread(new Runnable(flag, list, c1, handler) {

			public void run()
			{
				cb cb1;
				ca ca1;
				ca1 = new ca(0, "Inventory refresh successful.");
			//    0    0:new             #43  <Class ca>
			//    1    3:dup             
			//    2    4:iconst_0        
			//    3    5:ldc1            #45  <String "Inventory refresh successful.">
			//    4    7:invokespecial   #48  <Method void ca(int, String)>
			//    5   10:astore_2        
				cb1 = null;
			//    6   11:aconst_null     
			//    7   12:astore_1        
				cb cb2 = e.a(a, b);
			//    8   13:aload_0         
			//    9   14:getfield        #26  <Field bz e>
			//   10   17:aload_0         
			//   11   18:getfield        #28  <Field boolean a>
			//   12   21:aload_0         
			//   13   22:getfield        #30  <Field List b>
			//   14   25:invokevirtual   #51  <Method cb bz.a(boolean, List)>
			//   15   28:astore_3        
				cb1 = cb2;
			//   16   29:aload_3         
			//   17   30:astore_1        
_L2:
				e.b();
			//   18   31:aload_0         
			//   19   32:getfield        #26  <Field bz e>
			//   20   35:invokevirtual   #53  <Method void bz.b()>
				if(!e.d && c != null)
			//*  21   38:aload_0         
			//*  22   39:getfield        #26  <Field bz e>
			//*  23   42:getfield        #55  <Field boolean bz.d>
			//*  24   45:ifne            73
			//*  25   48:aload_0         
			//*  26   49:getfield        #32  <Field bz$c c>
			//*  27   52:ifnull          73
					d.post(new Runnable(this, ca1, cb1) {

						public void run()
						{
							c.c.a(a, b);
						//    0    0:aload_0         
						//    1    1:getfield        #21  <Field bz$2 c>
						//    2    4:getfield        #31  <Field bz$c bz$2.c>
						//    3    7:aload_0         
						//    4    8:getfield        #23  <Field ca a>
						//    5   11:aload_0         
						//    6   12:getfield        #25  <Field cb b>
						//    7   15:invokeinterface #36  <Method void bz$c.a(ca, cb)>
						//    8   20:return          
						}

						final ca a;
						final cb b;
						final _cls2 c;

			
			{
				c = _pcls2;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field bz$2 c>
				a = ca1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field ca a>
				b = cb1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field cb b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
					}
);
			//   28   55:aload_0         
			//   29   56:getfield        #34  <Field Handler d>
			//   30   59:new             #13  <Class bz$2$1>
			//   31   62:dup             
			//   32   63:aload_0         
			//   33   64:aload_2         
			//   34   65:aload_1         
			//   35   66:invokespecial   #58  <Method void bz$2$1(bz$2, ca, cb)>
			//   36   69:invokevirtual   #64  <Method boolean Handler.post(Runnable)>
			//   37   72:pop             
				return;
			//   38   73:return          
				by by1;
				by1;
			//   39   74:astore_2        
				by1 = ((by) (by1.a()));
			//   40   75:aload_2         
			//   41   76:invokevirtual   #67  <Method ca by.a()>
			//   42   79:astore_2        
				if(true) goto _L2; else goto _L1
			//   43   80:goto            31
_L1:
			}

			final boolean a;
			final List b;
			final c c;
			final Handler d;
			final bz e;

			
			{
				e = bz.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field bz e>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #28  <Field boolean a>
				b = list;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field List b>
				c = c1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field bz$c c>
				d = handler;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #34  <Field Handler d>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #37  <Method void Object()>
			//   17   31:return          
			}
		}
)).start();
	//   14   31:new             #496 <Class Thread>
	//   15   34:dup             
	//   16   35:new             #8   <Class bz$2>
	//   17   38:dup             
	//   18   39:aload_0         
	//   19   40:iload_1         
	//   20   41:aload_2         
	//   21   42:aload_3         
	//   22   43:aload           4
	//   23   45:invokespecial   #499 <Method void bz$2(bz, boolean, List, bz$c, Handler)>
	//   24   48:invokespecial   #502 <Method void Thread(Runnable)>
	//   25   51:invokevirtual   #505 <Method void Thread.start()>
	//   26   54:return          
	}

	public boolean a(int i1, int j1, Intent intent)
	{
		String s;
		String s1;
		if(i1 != k)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #424 <Field int k>
	//*   3    5:icmpeq          10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		if(d)
	//*   6   10:aload_0         
	//*   7   11:getfield        #52  <Field boolean d>
	//*   8   14:ifeq            19
			return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		if(!c)
	//*  11   19:aload_0         
	//*  12   20:getfield        #50  <Field boolean c>
	//*  13   23:ifne            28
			return true;
	//   14   26:iconst_1        
	//   15   27:ireturn         
		b();
	//   16   28:aload_0         
	//   17   29:invokevirtual   #386 <Method void b()>
		if(intent == null)
	//*  18   32:aload_3         
	//*  19   33:ifnonnull       77
		{
			c("Null data in IAB activity result.");
	//   20   36:aload_0         
	//   21   37:ldc2            #509 <String "Null data in IAB activity result.">
	//   22   40:invokevirtual   #126 <Method void c(String)>
			intent = ((Intent) (new ca(-1002, "Null data in IAB result")));
	//   23   43:new             #381 <Class ca>
	//   24   46:dup             
	//   25   47:sipush          -1002
	//   26   50:ldc2            #511 <String "Null data in IAB result">
	//   27   53:invokespecial   #384 <Method void ca(int, String)>
	//   28   56:astore_3        
			if(n != null)
	//*  29   57:aload_0         
	//*  30   58:getfield        #366 <Field bz$a n>
	//*  31   61:ifnull          75
				n.a(((ca) (intent)), ((cc) (null)));
	//   32   64:aload_0         
	//   33   65:getfield        #366 <Field bz$a n>
	//   34   68:aload_3         
	//   35   69:aconst_null     
	//   36   70:invokeinterface #389 <Method void bz$a.a(ca, cc)>
			return true;
	//   37   75:iconst_1        
	//   38   76:ireturn         
		}
		i1 = a(intent);
	//   39   77:aload_0         
	//   40   78:aload_3         
	//   41   79:invokevirtual   #513 <Method int a(Intent)>
	//   42   82:istore_1        
		s = intent.getStringExtra("INAPP_PURCHASE_DATA");
	//   43   83:aload_3         
	//   44   84:ldc2            #515 <String "INAPP_PURCHASE_DATA">
	//   45   87:invokevirtual   #518 <Method String Intent.getStringExtra(String)>
	//   46   90:astore          4
		s1 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
	//   47   92:aload_3         
	//   48   93:ldc2            #520 <String "INAPP_DATA_SIGNATURE">
	//   49   96:invokevirtual   #518 <Method String Intent.getStringExtra(String)>
	//   50   99:astore          5
		if(j1 != -1 || i1 != 0) goto _L2; else goto _L1
	//   51  101:iload_2         
	//   52  102:iconst_m1       
	//   53  103:icmpne          500
	//   54  106:iload_1         
	//   55  107:ifne            500
_L1:
		b("Successful resultcode from purchase activity.");
	//   56  110:aload_0         
	//   57  111:ldc2            #522 <String "Successful resultcode from purchase activity.">
	//   58  114:invokevirtual   #75  <Method void b(String)>
		b((new StringBuilder()).append("Purchase data: ").append(s).toString());
	//   59  117:aload_0         
	//   60  118:new             #91  <Class StringBuilder>
	//   61  121:dup             
	//   62  122:invokespecial   #92  <Method void StringBuilder()>
	//   63  125:ldc1            #231 <String "Purchase data: ">
	//   64  127:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   65  130:aload           4
	//   66  132:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   67  135:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   68  138:invokevirtual   #75  <Method void b(String)>
		b((new StringBuilder()).append("Data signature: ").append(s1).toString());
	//   69  141:aload_0         
	//   70  142:new             #91  <Class StringBuilder>
	//   71  145:dup             
	//   72  146:invokespecial   #92  <Method void StringBuilder()>
	//   73  149:ldc2            #524 <String "Data signature: ">
	//   74  152:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   75  155:aload           5
	//   76  157:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   77  160:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   78  163:invokevirtual   #75  <Method void b(String)>
		b((new StringBuilder()).append("Extras: ").append(((Object) (intent.getExtras()))).toString());
	//   79  166:aload_0         
	//   80  167:new             #91  <Class StringBuilder>
	//   81  170:dup             
	//   82  171:invokespecial   #92  <Method void StringBuilder()>
	//   83  174:ldc2            #526 <String "Extras: ">
	//   84  177:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   85  180:aload_3         
	//   86  181:invokevirtual   #114 <Method Bundle Intent.getExtras()>
	//   87  184:invokevirtual   #314 <Method StringBuilder StringBuilder.append(Object)>
	//   88  187:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   89  190:invokevirtual   #75  <Method void b(String)>
		b((new StringBuilder()).append("Expected item type: ").append(l).toString());
	//   90  193:aload_0         
	//   91  194:new             #91  <Class StringBuilder>
	//   92  197:dup             
	//   93  198:invokespecial   #92  <Method void StringBuilder()>
	//   94  201:ldc2            #528 <String "Expected item type: ">
	//   95  204:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   96  207:aload_0         
	//   97  208:getfield        #426 <Field String l>
	//   98  211:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   99  214:invokevirtual   #105 <Method String StringBuilder.toString()>
	//  100  217:invokevirtual   #75  <Method void b(String)>
		if(s == null || s1 == null)
	//* 101  220:aload           4
	//* 102  222:ifnull          230
	//* 103  225:aload           5
	//* 104  227:ifnonnull       301
		{
			c("BUG: either purchaseData or dataSignature is null.");
	//  105  230:aload_0         
	//  106  231:ldc2            #530 <String "BUG: either purchaseData or dataSignature is null.">
	//  107  234:invokevirtual   #126 <Method void c(String)>
			b((new StringBuilder()).append("Extras: ").append(intent.getExtras().toString()).toString());
	//  108  237:aload_0         
	//  109  238:new             #91  <Class StringBuilder>
	//  110  241:dup             
	//  111  242:invokespecial   #92  <Method void StringBuilder()>
	//  112  245:ldc2            #526 <String "Extras: ">
	//  113  248:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  114  251:aload_3         
	//  115  252:invokevirtual   #114 <Method Bundle Intent.getExtras()>
	//  116  255:invokevirtual   #531 <Method String Bundle.toString()>
	//  117  258:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  118  261:invokevirtual   #105 <Method String StringBuilder.toString()>
	//  119  264:invokevirtual   #75  <Method void b(String)>
			intent = ((Intent) (new ca(-1008, "IAB returned null purchaseData or dataSignature")));
	//  120  267:new             #381 <Class ca>
	//  121  270:dup             
	//  122  271:sipush          -1008
	//  123  274:ldc2            #533 <String "IAB returned null purchaseData or dataSignature">
	//  124  277:invokespecial   #384 <Method void ca(int, String)>
	//  125  280:astore_3        
			if(n != null)
	//* 126  281:aload_0         
	//* 127  282:getfield        #366 <Field bz$a n>
	//* 128  285:ifnull          299
				n.a(((ca) (intent)), ((cc) (null)));
	//  129  288:aload_0         
	//  130  289:getfield        #366 <Field bz$a n>
	//  131  292:aload_3         
	//  132  293:aconst_null     
	//  133  294:invokeinterface #389 <Method void bz$a.a(ca, cc)>
			return true;
	//  134  299:iconst_1        
	//  135  300:ireturn         
		}
		String s2;
		intent = ((Intent) (new cc(l, s, s1)));
	//  136  301:new             #214 <Class cc>
	//  137  304:dup             
	//  138  305:aload_0         
	//  139  306:getfield        #426 <Field String l>
	//  140  309:aload           4
	//  141  311:aload           5
	//  142  313:invokespecial   #217 <Method void cc(String, String, String)>
	//  143  316:astore_3        
		s2 = ((cc) (intent)).b();
	//  144  317:aload_3         
	//  145  318:invokevirtual   #535 <Method String cc.b()>
	//  146  321:astore          6
		if(cd.a(m, s, s1)) goto _L4; else goto _L3
	//  147  323:aload_0         
	//  148  324:getfield        #62  <Field String m>
	//  149  327:aload           4
	//  150  329:aload           5
	//  151  331:invokestatic    #210 <Method boolean cd.a(String, String, String)>
	//  152  334:ifne            417
_L3:
		c((new StringBuilder()).append("Purchase signature verification FAILED for sku ").append(s2).toString());
	//  153  337:aload_0         
	//  154  338:new             #91  <Class StringBuilder>
	//  155  341:dup             
	//  156  342:invokespecial   #92  <Method void StringBuilder()>
	//  157  345:ldc2            #537 <String "Purchase signature verification FAILED for sku ">
	//  158  348:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  159  351:aload           6
	//  160  353:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  161  356:invokevirtual   #105 <Method String StringBuilder.toString()>
	//  162  359:invokevirtual   #126 <Method void c(String)>
		ca ca1 = new ca(-1003, (new StringBuilder()).append("Signature verification failed for sku ").append(s2).toString());
	//  163  362:new             #381 <Class ca>
	//  164  365:dup             
	//  165  366:sipush          -1003
	//  166  369:new             #91  <Class StringBuilder>
	//  167  372:dup             
	//  168  373:invokespecial   #92  <Method void StringBuilder()>
	//  169  376:ldc2            #539 <String "Signature verification failed for sku ">
	//  170  379:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  171  382:aload           6
	//  172  384:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  173  387:invokevirtual   #105 <Method String StringBuilder.toString()>
	//  174  390:invokespecial   #384 <Method void ca(int, String)>
	//  175  393:astore          4
		if(n != null)
	//* 176  395:aload_0         
	//* 177  396:getfield        #366 <Field bz$a n>
	//* 178  399:ifnull          706
			n.a(ca1, ((cc) (intent)));
	//  179  402:aload_0         
	//  180  403:getfield        #366 <Field bz$a n>
	//  181  406:aload           4
	//  182  408:aload_3         
	//  183  409:invokeinterface #389 <Method void bz$a.a(ca, cc)>
		  goto _L5
	//* 184  414:goto            706
_L4:
		try
		{
			b("Purchase signature successfully verified.");
	//  185  417:aload_0         
	//  186  418:ldc2            #541 <String "Purchase signature successfully verified.">
	//  187  421:invokevirtual   #75  <Method void b(String)>
		}
	//* 188  424:aload_0         
	//* 189  425:getfield        #366 <Field bz$a n>
	//* 190  428:ifnull          452
	//* 191  431:aload_0         
	//* 192  432:getfield        #366 <Field bz$a n>
	//* 193  435:new             #381 <Class ca>
	//* 194  438:dup             
	//* 195  439:iconst_0        
	//* 196  440:ldc2            #543 <String "Success">
	//* 197  443:invokespecial   #384 <Method void ca(int, String)>
	//* 198  446:aload_3         
	//* 199  447:invokeinterface #389 <Method void bz$a.a(ca, cc)>
	//* 200  452:iconst_1        
	//* 201  453:ireturn         
		// Misplaced declaration of an exception variable
		catch(Intent intent)
	//* 202  454:astore_3        
		{
			c("Failed to parse purchase data.");
	//  203  455:aload_0         
	//  204  456:ldc2            #545 <String "Failed to parse purchase data.">
	//  205  459:invokevirtual   #126 <Method void c(String)>
			((JSONException) (intent)).printStackTrace();
	//  206  462:aload_3         
	//  207  463:invokevirtual   #546 <Method void JSONException.printStackTrace()>
			intent = ((Intent) (new ca(-1002, "Failed to parse purchase data.")));
	//  208  466:new             #381 <Class ca>
	//  209  469:dup             
	//  210  470:sipush          -1002
	//  211  473:ldc2            #545 <String "Failed to parse purchase data.">
	//  212  476:invokespecial   #384 <Method void ca(int, String)>
	//  213  479:astore_3        
			if(n != null)
	//* 214  480:aload_0         
	//* 215  481:getfield        #366 <Field bz$a n>
	//* 216  484:ifnull          498
				n.a(((ca) (intent)), ((cc) (null)));
	//  217  487:aload_0         
	//  218  488:getfield        #366 <Field bz$a n>
	//  219  491:aload_3         
	//  220  492:aconst_null     
	//  221  493:invokeinterface #389 <Method void bz$a.a(ca, cc)>
			return true;
	//  222  498:iconst_1        
	//  223  499:ireturn         
		}
		if(n != null)
			n.a(new ca(0, "Success"), ((cc) (intent)));
_L6:
		return true;
_L2:
		if(j1 == -1)
	//* 224  500:iload_2         
	//* 225  501:iconst_m1       
	//* 226  502:icmpne          565
		{
			b((new StringBuilder()).append("Result code was OK but in-app billing response was not OK: ").append(a(i1)).toString());
	//  227  505:aload_0         
	//  228  506:new             #91  <Class StringBuilder>
	//  229  509:dup             
	//  230  510:invokespecial   #92  <Method void StringBuilder()>
	//  231  513:ldc2            #548 <String "Result code was OK but in-app billing response was not OK: ">
	//  232  516:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  233  519:iload_1         
	//  234  520:invokestatic    #181 <Method String a(int)>
	//  235  523:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  236  526:invokevirtual   #105 <Method String StringBuilder.toString()>
	//  237  529:invokevirtual   #75  <Method void b(String)>
			if(n != null)
	//* 238  532:aload_0         
	//* 239  533:getfield        #366 <Field bz$a n>
	//* 240  536:ifnull          452
			{
				intent = ((Intent) (new ca(i1, "Problem purchashing item.")));
	//  241  539:new             #381 <Class ca>
	//  242  542:dup             
	//  243  543:iload_1         
	//  244  544:ldc2            #550 <String "Problem purchashing item.">
	//  245  547:invokespecial   #384 <Method void ca(int, String)>
	//  246  550:astore_3        
				n.a(((ca) (intent)), ((cc) (null)));
	//  247  551:aload_0         
	//  248  552:getfield        #366 <Field bz$a n>
	//  249  555:aload_3         
	//  250  556:aconst_null     
	//  251  557:invokeinterface #389 <Method void bz$a.a(ca, cc)>
			}
		} else
	//* 252  562:goto            452
		if(j1 == 0)
	//* 253  565:iload_2         
	//* 254  566:ifne            631
		{
			b((new StringBuilder()).append("Purchase canceled - Response: ").append(a(i1)).toString());
	//  255  569:aload_0         
	//  256  570:new             #91  <Class StringBuilder>
	//  257  573:dup             
	//  258  574:invokespecial   #92  <Method void StringBuilder()>
	//  259  577:ldc2            #552 <String "Purchase canceled - Response: ">
	//  260  580:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  261  583:iload_1         
	//  262  584:invokestatic    #181 <Method String a(int)>
	//  263  587:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  264  590:invokevirtual   #105 <Method String StringBuilder.toString()>
	//  265  593:invokevirtual   #75  <Method void b(String)>
			intent = ((Intent) (new ca(-1005, "User canceled.")));
	//  266  596:new             #381 <Class ca>
	//  267  599:dup             
	//  268  600:sipush          -1005
	//  269  603:ldc2            #554 <String "User canceled.">
	//  270  606:invokespecial   #384 <Method void ca(int, String)>
	//  271  609:astore_3        
			if(n != null)
	//* 272  610:aload_0         
	//* 273  611:getfield        #366 <Field bz$a n>
	//* 274  614:ifnull          452
				n.a(((ca) (intent)), ((cc) (null)));
	//  275  617:aload_0         
	//  276  618:getfield        #366 <Field bz$a n>
	//  277  621:aload_3         
	//  278  622:aconst_null     
	//  279  623:invokeinterface #389 <Method void bz$a.a(ca, cc)>
		} else
	//* 280  628:goto            452
		{
			c((new StringBuilder()).append("Purchase failed. Result code: ").append(Integer.toString(j1)).append(". Response: ").append(a(i1)).toString());
	//  281  631:aload_0         
	//  282  632:new             #91  <Class StringBuilder>
	//  283  635:dup             
	//  284  636:invokespecial   #92  <Method void StringBuilder()>
	//  285  639:ldc2            #556 <String "Purchase failed. Result code: ">
	//  286  642:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  287  645:iload_2         
	//  288  646:invokestatic    #558 <Method String Integer.toString(int)>
	//  289  649:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  290  652:ldc2            #560 <String ". Response: ">
	//  291  655:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  292  658:iload_1         
	//  293  659:invokestatic    #181 <Method String a(int)>
	//  294  662:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  295  665:invokevirtual   #105 <Method String StringBuilder.toString()>
	//  296  668:invokevirtual   #126 <Method void c(String)>
			intent = ((Intent) (new ca(-1006, "Unknown purchase response.")));
	//  297  671:new             #381 <Class ca>
	//  298  674:dup             
	//  299  675:sipush          -1006
	//  300  678:ldc2            #562 <String "Unknown purchase response.">
	//  301  681:invokespecial   #384 <Method void ca(int, String)>
	//  302  684:astore_3        
			if(n != null)
	//* 303  685:aload_0         
	//* 304  686:getfield        #366 <Field bz$a n>
	//* 305  689:ifnull          452
				n.a(((ca) (intent)), ((cc) (null)));
	//  306  692:aload_0         
	//  307  693:getfield        #366 <Field bz$a n>
	//  308  696:aload_3         
	//  309  697:aconst_null     
	//  310  698:invokeinterface #389 <Method void bz$a.a(ca, cc)>
		}
		if(true) goto _L6; else goto _L5
	//  311  703:goto            452
_L5:
		return true;
	//  312  706:iconst_1        
	//  313  707:ireturn         
	}

	void b()
	{
		b((new StringBuilder()).append("Ending async operation: ").append(g).toString());
	//    0    0:aload_0         
	//    1    1:new             #91  <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #92  <Method void StringBuilder()>
	//    4    8:ldc2            #564 <String "Ending async operation: ">
	//    5   11:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:aload_0         
	//    7   15:getfield        #60  <Field String g>
	//    8   18:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   10   24:invokevirtual   #75  <Method void b(String)>
		g = "";
	//   11   27:aload_0         
	//   12   28:ldc1            #58  <String "">
	//   13   30:putfield        #60  <Field String g>
		f = false;
	//   14   33:aload_0         
	//   15   34:iconst_0        
	//   16   35:putfield        #56  <Field boolean f>
	//   17   38:return          
	}

	void b(String s)
	{
		if(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field boolean a>
	//*   2    4:ifeq            16
			Log.d(b, s);
	//    3    7:aload_0         
	//    4    8:getfield        #48  <Field String b>
	//    5   11:aload_1         
	//    6   12:invokestatic    #569 <Method int Log.d(String, String)>
	//    7   15:pop             
	//    8   16:return          
	}

	void c(String s)
	{
		Log.e(b, (new StringBuilder()).append("In-app billing error: ").append(s).toString());
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String b>
	//    2    4:new             #91  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #92  <Method void StringBuilder()>
	//    5   11:ldc2            #571 <String "In-app billing error: ">
	//    6   14:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   10   24:invokestatic    #573 <Method int Log.e(String, String)>
	//   11   27:pop             
	//   12   28:return          
	}

	void d(String s)
	{
		Log.w(b, (new StringBuilder()).append("In-app billing warning: ").append(s).toString());
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String b>
	//    2    4:new             #91  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #92  <Method void StringBuilder()>
	//    5   11:ldc2            #575 <String "In-app billing warning: ">
	//    6   14:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   10   24:invokestatic    #578 <Method int Log.w(String, String)>
	//   11   27:pop             
	//   12   28:return          
	}

	boolean a;
	String b;
	boolean c;
	boolean d;
	boolean e;
	boolean f;
	String g;
	Context h;
	bu i;
	ServiceConnection j;
	int k;
	String l;
	String m;
	a n;
}
