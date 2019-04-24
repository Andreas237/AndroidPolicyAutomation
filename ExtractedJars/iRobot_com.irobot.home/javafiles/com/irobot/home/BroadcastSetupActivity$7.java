// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.net.wifi.WifiManager;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.V1ProvisioningError;
import com.irobot.home.util.j;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home:
//			BroadcastSetupActivity

class BroadcastSetupActivity$7
	implements com.irobot.home.fragments.bu.b
{

	private void c()
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void d()>
		a.x = 5;
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field BroadcastSetupActivity a>
	//    4    8:iconst_5        
	//    5    9:putfield        #29  <Field int BroadcastSetupActivity.x>
		a.B = null;
	//    6   12:aload_0         
	//    7   13:getfield        #17  <Field BroadcastSetupActivity a>
	//    8   16:aconst_null     
	//    9   17:putfield        #33  <Field android.net.wifi.ScanResult BroadcastSetupActivity.B>
		a.E = false;
	//   10   20:aload_0         
	//   11   21:getfield        #17  <Field BroadcastSetupActivity a>
	//   12   24:iconst_0        
	//   13   25:putfield        #37  <Field boolean BroadcastSetupActivity.E>
		a.F = false;
	//   14   28:aload_0         
	//   15   29:getfield        #17  <Field BroadcastSetupActivity a>
	//   16   32:iconst_0        
	//   17   33:putfield        #40  <Field boolean BroadcastSetupActivity.F>
		a.m();
	//   18   36:aload_0         
	//   19   37:getfield        #17  <Field BroadcastSetupActivity a>
	//   20   40:invokevirtual   #43  <Method void BroadcastSetupActivity.m()>
	//   21   43:return          
	}

	private void d()
	{
		if(j.j(com.irobot.home.BroadcastSetupActivity.o(a)) && a.C.disconnect())
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field BroadcastSetupActivity a>
	//*   2    4:invokestatic    #47  <Method String com.irobot.home.BroadcastSetupActivity.o(BroadcastSetupActivity)>
	//*   3    7:invokestatic    #53  <Method boolean j.j(String)>
	//*   4   10:ifeq            43
	//*   5   13:aload_0         
	//*   6   14:getfield        #17  <Field BroadcastSetupActivity a>
	//*   7   17:getfield        #57  <Field WifiManager BroadcastSetupActivity.C>
	//*   8   20:invokevirtual   #63  <Method boolean WifiManager.disconnect()>
	//*   9   23:ifeq            43
			j.a(a.C, a.I);
	//   10   26:aload_0         
	//   11   27:getfield        #17  <Field BroadcastSetupActivity a>
	//   12   30:getfield        #57  <Field WifiManager BroadcastSetupActivity.C>
	//   13   33:aload_0         
	//   14   34:getfield        #17  <Field BroadcastSetupActivity a>
	//   15   37:getfield        #66  <Field android.net.wifi.WifiInfo BroadcastSetupActivity.I>
	//   16   40:invokestatic    #69  <Method void j.a(WifiManager, android.net.wifi.WifiInfo)>
	//   17   43:return          
	}

	public void a()
	{
		BroadcastSetupActivity.g(a, false);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #73  <Method boolean BroadcastSetupActivity.g(BroadcastSetupActivity, boolean)>
	//    4    8:pop             
		BroadcastSetupActivity.e(a, true);
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field BroadcastSetupActivity a>
	//    7   13:iconst_1        
	//    8   14:invokestatic    #76  <Method boolean BroadcastSetupActivity.e(BroadcastSetupActivity, boolean)>
	//    9   17:pop             
		c();
	//   10   18:aload_0         
	//   11   19:invokespecial   #78  <Method void c()>
	//   12   22:return          
	}

	public void a(int i)
	{
		V1ProvisioningError v1provisioningerror;
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     3 15: default 68
	//	               3 296
	//	               4 282
	//	               5 68
	//	               6 68
	//	               7 271
	//	               8 68
	//	               9 260
	//	               10 229
	//	               11 213
	//	               12 199
	//	               13 185
	//	               14 132
	//	               15 116
		case 5: // '\005'
		case 6: // '\006'
		case 8: // '\b'
		default:
			v1provisioningerror = V1ProvisioningError.Default;
	//    2   68:getstatic       #85  <Field V1ProvisioningError V1ProvisioningError.Default>
	//    3   71:astore_2        
			String s = a.w;
	//    4   72:aload_0         
	//    5   73:getfield        #17  <Field BroadcastSetupActivity a>
	//    6   76:getfield        #89  <Field String BroadcastSetupActivity.w>
	//    7   79:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//    8   80:new             #91  <Class StringBuilder>
	//    9   83:dup             
	//   10   84:invokespecial   #92  <Method void StringBuilder()>
	//   11   87:astore          4
			stringbuilder.append("Unknown error code during provisioning: ");
	//   12   89:aload           4
	//   13   91:ldc1            #94  <String "Unknown error code during provisioning: ">
	//   14   93:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   15   96:pop             
			stringbuilder.append(i);
	//   16   97:aload           4
	//   17   99:iload_1         
	//   18  100:invokevirtual   #101 <Method StringBuilder StringBuilder.append(int)>
	//   19  103:pop             
			o.e(s, stringbuilder.toString());
	//   20  104:aload_3         
	//   21  105:aload           4
	//   22  107:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   23  110:invokestatic    #110 <Method void o.e(String, String)>
			break;

	//*  24  113:goto            309
		case 15: // '\017'
			BroadcastSetupActivity.g(a, false);
	//   25  116:aload_0         
	//   26  117:getfield        #17  <Field BroadcastSetupActivity a>
	//   27  120:iconst_0        
	//   28  121:invokestatic    #73  <Method boolean BroadcastSetupActivity.g(BroadcastSetupActivity, boolean)>
	//   29  124:pop             
			v1provisioningerror = V1ProvisioningError.Default;
	//   30  125:getstatic       #85  <Field V1ProvisioningError V1ProvisioningError.Default>
	//   31  128:astore_2        
			break;

	//*  32  129:goto            309
		case 14: // '\016'
			BroadcastSetupActivity.g(a, false);
	//   33  132:aload_0         
	//   34  133:getfield        #17  <Field BroadcastSetupActivity a>
	//   35  136:iconst_0        
	//   36  137:invokestatic    #73  <Method boolean BroadcastSetupActivity.g(BroadcastSetupActivity, boolean)>
	//   37  140:pop             
			BroadcastSetupActivity.e(a, true);
	//   38  141:aload_0         
	//   39  142:getfield        #17  <Field BroadcastSetupActivity a>
	//   40  145:iconst_1        
	//   41  146:invokestatic    #76  <Method boolean BroadcastSetupActivity.e(BroadcastSetupActivity, boolean)>
	//   42  149:pop             
			d();
	//   43  150:aload_0         
	//   44  151:invokespecial   #25  <Method void d()>
			a.B = null;
	//   45  154:aload_0         
	//   46  155:getfield        #17  <Field BroadcastSetupActivity a>
	//   47  158:aconst_null     
	//   48  159:putfield        #33  <Field android.net.wifi.ScanResult BroadcastSetupActivity.B>
			a.E = false;
	//   49  162:aload_0         
	//   50  163:getfield        #17  <Field BroadcastSetupActivity a>
	//   51  166:iconst_0        
	//   52  167:putfield        #37  <Field boolean BroadcastSetupActivity.E>
			a.F = false;
	//   53  170:aload_0         
	//   54  171:getfield        #17  <Field BroadcastSetupActivity a>
	//   55  174:iconst_0        
	//   56  175:putfield        #40  <Field boolean BroadcastSetupActivity.F>
			v1provisioningerror = V1ProvisioningError.RobotDiscovery;
	//   57  178:getstatic       #113 <Field V1ProvisioningError V1ProvisioningError.RobotDiscovery>
	//   58  181:astore_2        
			break;

	//*  59  182:goto            309
		case 13: // '\r'
			BroadcastSetupActivity.h(a);
	//   60  185:aload_0         
	//   61  186:getfield        #17  <Field BroadcastSetupActivity a>
	//   62  189:invokestatic    #116 <Method void BroadcastSetupActivity.h(BroadcastSetupActivity)>
			v1provisioningerror = V1ProvisioningError.Link;
	//   63  192:getstatic       #119 <Field V1ProvisioningError V1ProvisioningError.Link>
	//   64  195:astore_2        
			break;

	//*  65  196:goto            309
		case 12: // '\f'
			BroadcastSetupActivity.h(a);
	//   66  199:aload_0         
	//   67  200:getfield        #17  <Field BroadcastSetupActivity a>
	//   68  203:invokestatic    #116 <Method void BroadcastSetupActivity.h(BroadcastSetupActivity)>
			v1provisioningerror = V1ProvisioningError.Network;
	//   69  206:getstatic       #122 <Field V1ProvisioningError V1ProvisioningError.Network>
	//   70  209:astore_2        
			break;

	//*  71  210:goto            309
		case 11: // '\013'
			BroadcastSetupActivity.i(a, true);
	//   72  213:aload_0         
	//   73  214:getfield        #17  <Field BroadcastSetupActivity a>
	//   74  217:iconst_1        
	//   75  218:invokestatic    #125 <Method boolean BroadcastSetupActivity.i(BroadcastSetupActivity, boolean)>
	//   76  221:pop             
			v1provisioningerror = V1ProvisioningError.NetworkReconnect;
	//   77  222:getstatic       #128 <Field V1ProvisioningError V1ProvisioningError.NetworkReconnect>
	//   78  225:astore_2        
			break;

	//*  79  226:goto            309
		case 10: // '\n'
			a.B = null;
	//   80  229:aload_0         
	//   81  230:getfield        #17  <Field BroadcastSetupActivity a>
	//   82  233:aconst_null     
	//   83  234:putfield        #33  <Field android.net.wifi.ScanResult BroadcastSetupActivity.B>
			a.E = false;
	//   84  237:aload_0         
	//   85  238:getfield        #17  <Field BroadcastSetupActivity a>
	//   86  241:iconst_0        
	//   87  242:putfield        #37  <Field boolean BroadcastSetupActivity.E>
			a.F = false;
	//   88  245:aload_0         
	//   89  246:getfield        #17  <Field BroadcastSetupActivity a>
	//   90  249:iconst_0        
	//   91  250:putfield        #40  <Field boolean BroadcastSetupActivity.F>
			v1provisioningerror = V1ProvisioningError.RobotConnection;
	//   92  253:getstatic       #131 <Field V1ProvisioningError V1ProvisioningError.RobotConnection>
	//   93  256:astore_2        
			break;

	//*  94  257:goto            309
		case 9: // '\t'
			d();
	//   95  260:aload_0         
	//   96  261:invokespecial   #25  <Method void d()>
			v1provisioningerror = V1ProvisioningError.RobotComms;
	//   97  264:getstatic       #134 <Field V1ProvisioningError V1ProvisioningError.RobotComms>
	//   98  267:astore_2        
			break;

	//*  99  268:goto            309
		case 7: // '\007'
			d();
	//  100  271:aload_0         
	//  101  272:invokespecial   #25  <Method void d()>
			v1provisioningerror = V1ProvisioningError.Ssl;
	//  102  275:getstatic       #137 <Field V1ProvisioningError V1ProvisioningError.Ssl>
	//  103  278:astore_2        
			break;

	//* 104  279:goto            309
		case 4: // '\004'
			BroadcastSetupActivity.h(a);
	//  105  282:aload_0         
	//  106  283:getfield        #17  <Field BroadcastSetupActivity a>
	//  107  286:invokestatic    #116 <Method void BroadcastSetupActivity.h(BroadcastSetupActivity)>
			v1provisioningerror = V1ProvisioningError.Dhcp;
	//  108  289:getstatic       #140 <Field V1ProvisioningError V1ProvisioningError.Dhcp>
	//  109  292:astore_2        
			break;

	//* 110  293:goto            309
		case 3: // '\003'
			BroadcastSetupActivity.d(a, true);
	//  111  296:aload_0         
	//  112  297:getfield        #17  <Field BroadcastSetupActivity a>
	//  113  300:iconst_1        
	//  114  301:invokestatic    #142 <Method boolean BroadcastSetupActivity.d(BroadcastSetupActivity, boolean)>
	//  115  304:pop             
			v1provisioningerror = V1ProvisioningError.Password;
	//  116  305:getstatic       #145 <Field V1ProvisioningError V1ProvisioningError.Password>
	//  117  308:astore_2        
			break;
		}
		BroadcastSetupActivity.a(a, i);
	//  118  309:aload_0         
	//  119  310:getfield        #17  <Field BroadcastSetupActivity a>
	//  120  313:iload_1         
	//  121  314:invokestatic    #148 <Method int BroadcastSetupActivity.a(BroadcastSetupActivity, int)>
	//  122  317:pop             
		a.x = 10;
	//  123  318:aload_0         
	//  124  319:getfield        #17  <Field BroadcastSetupActivity a>
	//  125  322:bipush          10
	//  126  324:putfield        #29  <Field int BroadcastSetupActivity.x>
		AnalyticsSubsystem.getInstance().trackRoombaV1ProvisioningError(BroadcastSetupActivity.p(a), v1provisioningerror);
	//  127  327:invokestatic    #154 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//  128  330:aload_0         
	//  129  331:getfield        #17  <Field BroadcastSetupActivity a>
	//  130  334:invokestatic    #158 <Method com.irobot.core.AssetInfo BroadcastSetupActivity.p(BroadcastSetupActivity)>
	//  131  337:aload_2         
	//  132  338:invokevirtual   #162 <Method void AnalyticsSubsystem.trackRoombaV1ProvisioningError(com.irobot.core.AssetInfo, V1ProvisioningError)>
		BroadcastSetupActivity.m(a);
	//  133  341:aload_0         
	//  134  342:getfield        #17  <Field BroadcastSetupActivity a>
	//  135  345:invokestatic    #164 <Method void BroadcastSetupActivity.m(BroadcastSetupActivity)>
	//  136  348:return          
	}

	public void a(String s)
	{
		BroadcastSetupActivity.h(a, true);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #167 <Method boolean BroadcastSetupActivity.h(BroadcastSetupActivity, boolean)>
	//    4    8:pop             
		BroadcastSetupActivity.d(a, s);
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field BroadcastSetupActivity a>
	//    7   13:aload_1         
	//    8   14:invokestatic    #170 <Method String BroadcastSetupActivity.d(BroadcastSetupActivity, String)>
	//    9   17:pop             
		BroadcastSetupActivity.n(a);
	//   10   18:aload_0         
	//   11   19:getfield        #17  <Field BroadcastSetupActivity a>
	//   12   22:invokestatic    #173 <Method void BroadcastSetupActivity.n(BroadcastSetupActivity)>
	//   13   25:return          
	}

	public void a(boolean flag)
	{
		a.b(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #177 <Method void BroadcastSetupActivity.b(boolean)>
	//    4    8:return          
	}

	public void b()
	{
		a.F();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
	//    2    4:invokevirtual   #179 <Method void BroadcastSetupActivity.F()>
	//    3    7:return          
	}

	public void b(String s)
	{
	//    0    0:return          
	}

	final BroadcastSetupActivity a;

	BroadcastSetupActivity$7(BroadcastSetupActivity broadcastsetupactivity)
	{
		a = broadcastsetupactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BroadcastSetupActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
