// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			p, w

public final class l
	implements p
{

	public l()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		b = w.a;
	//    2    4:aload_0         
	//    3    5:getstatic       #31  <Field w w.a>
	//    4    8:putfield        #33  <Field w b>
		c = false;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #35  <Field boolean c>
		d = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #37  <Field boolean d>
	//   11   21:return          
	}

	public w a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field w b>
	//    2    4:areturn         
	}

	public void a(Intent intent, ConnectivityManager connectivitymanager)
	{
		String s = intent.getAction();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #47  <Method String Intent.getAction()>
	//    2    4:astore          5
		if(s.equals("android.net.conn.CONNECTIVITY_CHANGE"))
	//*   3    6:aload           5
	//*   4    8:ldc1            #49  <String "android.net.conn.CONNECTIVITY_CHANGE">
	//*   5   10:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*   6   13:ifeq            266
		{
			boolean flag;
			try
			{
				connectivitymanager = ((ConnectivityManager) (connectivitymanager.getActiveNetworkInfo()));
	//    7   16:aload_2         
	//    8   17:invokevirtual   #61  <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//    9   20:astore_2        
			}
	//*  10   21:aload_1         
	//*  11   22:ldc1            #63  <String "noConnectivity">
	//*  12   24:iconst_0        
	//*  13   25:invokevirtual   #67  <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*  14   28:istore          4
	//*  15   30:aload_2         
	//*  16   31:ifnull          236
	//*  17   34:iload           4
	//*  18   36:ifeq            42
	//*  19   39:goto            236
	//*  20   42:aload_0         
	//*  21   43:aload_2         
	//*  22   44:invokevirtual   #73  <Method boolean NetworkInfo.isConnectedOrConnecting()>
	//*  23   47:putfield        #37  <Field boolean d>
	//*  24   50:aload_0         
	//*  25   51:aload_2         
	//*  26   52:invokevirtual   #76  <Method boolean NetworkInfo.isRoaming()>
	//*  27   55:putfield        #35  <Field boolean c>
	//*  28   58:aload_2         
	//*  29   59:invokevirtual   #80  <Method int NetworkInfo.getType()>
	//*  30   62:tableswitch     0 9: default 116
	//	               0 196
	//	               1 188
	//	               2 180
	//	               3 172
	//	               4 164
	//	               5 156
	//	               6 148
	//	               7 140
	//	               8 132
	//	               9 124
	//*  31  116:aload_0         
	//*  32  117:getstatic       #31  <Field w w.a>
	//*  33  120:putfield        #33  <Field w b>
	//*  34  123:return          
	//*  35  124:aload_0         
	//*  36  125:getstatic       #31  <Field w w.a>
	//*  37  128:putfield        #33  <Field w b>
	//*  38  131:return          
	//*  39  132:aload_0         
	//*  40  133:getstatic       #31  <Field w w.a>
	//*  41  136:putfield        #33  <Field w b>
	//*  42  139:return          
	//*  43  140:aload_0         
	//*  44  141:getstatic       #31  <Field w w.a>
	//*  45  144:putfield        #33  <Field w b>
	//*  46  147:return          
	//*  47  148:aload_0         
	//*  48  149:getstatic       #83  <Field w w.f>
	//*  49  152:putfield        #33  <Field w b>
	//*  50  155:return          
	//*  51  156:aload_0         
	//*  52  157:getstatic       #31  <Field w w.a>
	//*  53  160:putfield        #33  <Field w b>
	//*  54  163:return          
	//*  55  164:aload_0         
	//*  56  165:getstatic       #31  <Field w w.a>
	//*  57  168:putfield        #33  <Field w b>
	//*  58  171:return          
	//*  59  172:aload_0         
	//*  60  173:getstatic       #31  <Field w w.a>
	//*  61  176:putfield        #33  <Field w b>
	//*  62  179:return          
	//*  63  180:aload_0         
	//*  64  181:getstatic       #31  <Field w w.a>
	//*  65  184:putfield        #33  <Field w b>
	//*  66  187:return          
	//*  67  188:aload_0         
	//*  68  189:getstatic       #83  <Field w w.f>
	//*  69  192:putfield        #33  <Field w b>
	//*  70  195:return          
	//*  71  196:aload_2         
	//*  72  197:invokevirtual   #86  <Method int NetworkInfo.getSubtype()>
	//*  73  200:istore_3        
	//*  74  201:iload_3         
	//*  75  202:iconst_3        
	//*  76  203:icmpeq          228
	//*  77  206:iload_3         
	//*  78  207:bipush          13
	//*  79  209:icmpeq          220
	//*  80  212:aload_0         
	//*  81  213:getstatic       #88  <Field w w.c>
	//*  82  216:putfield        #33  <Field w b>
	//*  83  219:return          
	//*  84  220:aload_0         
	//*  85  221:getstatic       #91  <Field w w.e>
	//*  86  224:putfield        #33  <Field w b>
	//*  87  227:return          
	//*  88  228:aload_0         
	//*  89  229:getstatic       #93  <Field w w.d>
	//*  90  232:putfield        #33  <Field w b>
	//*  91  235:return          
	//*  92  236:aload_0         
	//*  93  237:getstatic       #94  <Field w w.b>
	//*  94  240:putfield        #33  <Field w b>
	//*  95  243:aload_0         
	//*  96  244:iconst_0        
	//*  97  245:putfield        #37  <Field boolean d>
	//*  98  248:aload_0         
	//*  99  249:iconst_0        
	//* 100  250:putfield        #35  <Field boolean c>
	//* 101  253:return          
			// Misplaced declaration of an exception variable
			catch(Intent intent)
	//* 102  254:astore_1        
			{
				AppboyLogger.e(a, "Failed to get active network information. Ensure the permission android.permission.ACCESS_NETWORK_STATE is defined in your AndroidManifest.xml", ((Throwable) (intent)));
	//  103  255:getstatic       #23  <Field String a>
	//  104  258:ldc1            #96  <String "Failed to get active network information. Ensure the permission android.permission.ACCESS_NETWORK_STATE is defined in your AndroidManifest.xml">
	//  105  260:aload_1         
	//  106  261:invokestatic    #99  <Method int AppboyLogger.e(String, String, Throwable)>
	//  107  264:pop             
				return;
	//  108  265:return          
			}
			flag = intent.getBooleanExtra("noConnectivity", false);
			if(connectivitymanager != null && !flag)
			{
				d = ((NetworkInfo) (connectivitymanager)).isConnectedOrConnecting();
				c = ((NetworkInfo) (connectivitymanager)).isRoaming();
				int i;
				switch(((NetworkInfo) (connectivitymanager)).getType())
				{
				default:
					b = w.a;
					return;

				case 9: // '\t'
					b = w.a;
					return;

				case 8: // '\b'
					b = w.a;
					return;

				case 7: // '\007'
					b = w.a;
					return;

				case 6: // '\006'
					b = w.f;
					return;

				case 5: // '\005'
					b = w.a;
					return;

				case 4: // '\004'
					b = w.a;
					return;

				case 3: // '\003'
					b = w.a;
					return;

				case 2: // '\002'
					b = w.a;
					return;

				case 1: // '\001'
					b = w.f;
					return;

				case 0: // '\0'
					i = ((NetworkInfo) (connectivitymanager)).getSubtype();
					break;
				}
				if(i != 3)
				{
					if(i != 13)
					{
						b = w.c;
						return;
					} else
					{
						b = w.e;
						return;
					}
				} else
				{
					b = w.d;
					return;
				}
			} else
			{
				b = w.b;
				d = false;
				c = false;
				return;
			}
		} else
		{
			intent = ((Intent) (a));
	//  109  266:getstatic       #23  <Field String a>
	//  110  269:astore_1        
			connectivitymanager = ((ConnectivityManager) (new StringBuilder()));
	//  111  270:new             #101 <Class StringBuilder>
	//  112  273:dup             
	//  113  274:invokespecial   #102 <Method void StringBuilder()>
	//  114  277:astore_2        
			((StringBuilder) (connectivitymanager)).append("Unexpected system broadcast received [");
	//  115  278:aload_2         
	//  116  279:ldc1            #104 <String "Unexpected system broadcast received [">
	//  117  281:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  118  284:pop             
			((StringBuilder) (connectivitymanager)).append(s);
	//  119  285:aload_2         
	//  120  286:aload           5
	//  121  288:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  122  291:pop             
			((StringBuilder) (connectivitymanager)).append("]");
	//  123  292:aload_2         
	//  124  293:ldc1            #110 <String "]">
	//  125  295:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  126  298:pop             
			AppboyLogger.w(((String) (intent)), ((StringBuilder) (connectivitymanager)).toString());
	//  127  299:aload_1         
	//  128  300:aload_2         
	//  129  301:invokevirtual   #113 <Method String StringBuilder.toString()>
	//  130  304:invokestatic    #117 <Method int AppboyLogger.w(String, String)>
	//  131  307:pop             
			return;
	//  132  308:return          
		}
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/l);
	private w b;
	private boolean c;
	private boolean d;

	static 
	{
	//    0    0:ldc1            #2   <Class l>
	//    1    2:invokestatic    #21  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #23  <Field String a>
	//*   3    8:return          
	}
}
