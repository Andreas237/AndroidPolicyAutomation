// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.text.TextUtils;
import com.irobot.core.*;
import com.irobot.home.i.a;
import com.irobot.home.model.Robot;
import com.irobot.home.model.RobotAvailableLanguages;
import com.irobot.home.model.RobotLanguage;
import com.irobot.home.model.rest.LanguagePack;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package com.irobot.home:
//			BaseRobotLanguageListActivity

public class RoombaV2LanguageListActivity extends BaseRobotLanguageListActivity
{

	public RoombaV2LanguageListActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void BaseRobotLanguageListActivity()>
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #35  <Field int k>
		l = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #37  <Field byte[] l>
		m = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #39  <Field boolean m>
		o = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #41  <Field int o>
		t = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #43  <Field a t>
	//   17   29:aload_0         
	//   18   30:iconst_1        
	//   19   31:invokestatic    #49  <Method ScheduledExecutorService Executors.newScheduledThreadPool(int)>
	//   20   34:putfield        #51  <Field ScheduledExecutorService v>
	//   21   37:return          
	}

	private void a(int i1)
	{
		t.a(((Object) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field a t>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #59  <Method void a.a(Object)>
		int j1 = i1;
	//    4    8:iload_1         
	//    5    9:istore_2        
		if(i1 == 0)
	//*   6   10:iload_1         
	//*   7   11:ifne            17
			j1 = 0x7f0f0312;
	//    8   14:ldc1            #60  <Int 0x7f0f0312>
	//    9   16:istore_2        
		g(j1);
	//   10   17:aload_0         
	//   11   18:iload_2         
	//   12   19:invokevirtual   #63  <Method void g(int)>
		if(u != null && !u.isCancelled())
	//*  13   22:aload_0         
	//*  14   23:getfield        #65  <Field ScheduledFuture u>
	//*  15   26:ifnull          52
	//*  16   29:aload_0         
	//*  17   30:getfield        #65  <Field ScheduledFuture u>
	//*  18   33:invokeinterface #71  <Method boolean ScheduledFuture.isCancelled()>
	//*  19   38:ifne            52
			u.cancel(false);
	//   20   41:aload_0         
	//   21   42:getfield        #65  <Field ScheduledFuture u>
	//   22   45:iconst_0        
	//   23   46:invokeinterface #75  <Method boolean ScheduledFuture.cancel(boolean)>
	//   24   51:pop             
	//   25   52:return          
	}

	static void a(RoombaV2LanguageListActivity roombav2languagelistactivity, int i1)
	{
		roombav2languagelistactivity.a(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #78  <Method void a(int)>
	//    3    5:return          
	}

	static boolean a(RoombaV2LanguageListActivity roombav2languagelistactivity, boolean flag)
	{
		roombav2languagelistactivity.m = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #39  <Field boolean m>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private void k()
	{
		if(l != null && l.length == o)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field byte[] l>
	//*   2    4:ifnull          79
	//*   3    7:aload_0         
	//*   4    8:getfield        #37  <Field byte[] l>
	//*   5   11:arraylength     
	//*   6   12:aload_0         
	//*   7   13:getfield        #41  <Field int o>
	//*   8   16:icmpeq          22
	//*   9   19:goto            79
		{
			h(0x7f0f030c);
	//   10   22:aload_0         
	//   11   23:ldc1            #80  <Int 0x7f0f030c>
	//   12   25:invokevirtual   #83  <Method void h(int)>
			t.a(((Object) (this)), EventType.AssetOtaUpdateStatusEvent);
	//   13   28:aload_0         
	//   14   29:getfield        #43  <Field a t>
	//   15   32:aload_0         
	//   16   33:getstatic       #89  <Field EventType EventType.AssetOtaUpdateStatusEvent>
	//   17   36:invokevirtual   #92  <Method void a.a(Object, EventType)>
			CommandTierAgent commandtieragent = Assembler.getInstance().getCommandTierAgent(com.irobot.home.util.j.k());
	//   18   39:invokestatic    #98  <Method Assembler Assembler.getInstance()>
	//   19   42:invokestatic    #103 <Method com.irobot.core.AssetId j.k()>
	//   20   45:invokevirtual   #107 <Method CommandTierAgent Assembler.getCommandTierAgent(com.irobot.core.AssetId)>
	//   21   48:astore_1        
			if(Assembler.getInstance().getNetworkUIService(com.irobot.home.util.j.k()).getServiceData().isConnectedLocally())
	//*  22   49:invokestatic    #98  <Method Assembler Assembler.getInstance()>
	//*  23   52:invokestatic    #103 <Method com.irobot.core.AssetId j.k()>
	//*  24   55:invokevirtual   #111 <Method AssetNetworkUIService Assembler.getNetworkUIService(com.irobot.core.AssetId)>
	//*  25   58:invokevirtual   #117 <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//*  26   61:invokevirtual   #122 <Method boolean AssetNetworkUIServiceData.isConnectedLocally()>
	//*  27   64:ifeq            72
			{
				commandtieragent.startOTAUpdate();
	//   28   67:aload_1         
	//   29   68:invokevirtual   #127 <Method void CommandTierAgent.startOTAUpdate()>
				return;
	//   30   71:return          
			} else
			{
				a(0x7f0f0284);
	//   31   72:aload_0         
	//   32   73:ldc1            #128 <Int 0x7f0f0284>
	//   33   75:invokespecial   #78  <Method void a(int)>
				return;
	//   34   78:return          
			}
		} else
		{
			com.irobot.home.util.o.e("AwsLangListActivity", "Invalid language pack firmware, aborting upload attempt to robot");
	//   35   79:ldc1            #130 <String "AwsLangListActivity">
	//   36   81:ldc1            #132 <String "Invalid language pack firmware, aborting upload attempt to robot">
	//   37   83:invokestatic    #138 <Method void o.e(String, String)>
			return;
	//   38   86:return          
		}
	}

	private void l()
	{
		com.irobot.home.util.j.o(d).l();
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field String d>
	//    2    4:invokestatic    #145 <Method Robot j.o(String)>
	//    3    7:invokevirtual   #149 <Method void Robot.l()>
		u = v.schedule(new Runnable() {

			public void run()
			{
				if(!a.b)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field RoombaV2LanguageListActivity a>
			//*   2    4:getfield        #25  <Field boolean RoombaV2LanguageListActivity.b>
			//*   3    7:ifne            18
					com.irobot.home.RoombaV2LanguageListActivity.a(a, 0);
			//    4   10:aload_0         
			//    5   11:getfield        #17  <Field RoombaV2LanguageListActivity a>
			//    6   14:iconst_0        
			//    7   15:invokestatic    #28  <Method void com.irobot.home.RoombaV2LanguageListActivity.a(RoombaV2LanguageListActivity, int)>
			//    8   18:return          
			}

			final RoombaV2LanguageListActivity a;

			
			{
				a = RoombaV2LanguageListActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RoombaV2LanguageListActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 120L, TimeUnit.SECONDS);
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #51  <Field ScheduledExecutorService v>
	//    7   15:new             #8   <Class RoombaV2LanguageListActivity$2>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #152 <Method void RoombaV2LanguageListActivity$2(RoombaV2LanguageListActivity)>
	//   11   23:ldc2w           #153 <Long 120L>
	//   12   26:getstatic       #160 <Field TimeUnit TimeUnit.SECONDS>
	//   13   29:invokeinterface #166 <Method ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
	//   14   34:putfield        #65  <Field ScheduledFuture u>
		CommandTierAgent commandtieragent = Assembler.getInstance().getCommandTierAgent(com.irobot.home.util.j.k());
	//   15   37:invokestatic    #98  <Method Assembler Assembler.getInstance()>
	//   16   40:invokestatic    #103 <Method com.irobot.core.AssetId j.k()>
	//   17   43:invokevirtual   #107 <Method CommandTierAgent Assembler.getCommandTierAgent(com.irobot.core.AssetId)>
	//   18   46:astore_1        
		v.submit(new Runnable(commandtieragent) {

			public void run()
			{
				com.irobot.home.RoombaV2LanguageListActivity.a(b, true);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RoombaV2LanguageListActivity b>
			//    2    4:iconst_1        
			//    3    5:invokestatic    #28  <Method boolean com.irobot.home.RoombaV2LanguageListActivity.a(RoombaV2LanguageListActivity, boolean)>
			//    4    8:pop             
				a.disconnect();
			//    5    9:aload_0         
			//    6   10:getfield        #21  <Field CommandTierAgent a>
			//    7   13:invokevirtual   #33  <Method void CommandTierAgent.disconnect()>
			//    8   16:return          
			}

			final CommandTierAgent a;
			final RoombaV2LanguageListActivity b;

			
			{
				b = RoombaV2LanguageListActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RoombaV2LanguageListActivity b>
				a = commandtieragent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CommandTierAgent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   19   47:aload_0         
	//   20   48:getfield        #51  <Field ScheduledExecutorService v>
	//   21   51:new             #10  <Class RoombaV2LanguageListActivity$3>
	//   22   54:dup             
	//   23   55:aload_0         
	//   24   56:aload_1         
	//   25   57:invokespecial   #169 <Method void RoombaV2LanguageListActivity$3(RoombaV2LanguageListActivity, CommandTierAgent)>
	//   26   60:invokeinterface #173 <Method java.util.concurrent.Future ScheduledExecutorService.submit(Runnable)>
	//   27   65:pop             
		v.schedule(new Runnable(commandtieragent) {

			public void run()
			{
				a.connect();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field CommandTierAgent a>
			//    2    4:invokevirtual   #30  <Method void CommandTierAgent.connect()>
			//    3    7:return          
			}

			final CommandTierAgent a;
			final RoombaV2LanguageListActivity b;

			
			{
				b = RoombaV2LanguageListActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RoombaV2LanguageListActivity b>
				a = commandtieragent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CommandTierAgent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 15000L, TimeUnit.MILLISECONDS);
	//   28   66:aload_0         
	//   29   67:getfield        #51  <Field ScheduledExecutorService v>
	//   30   70:new             #12  <Class RoombaV2LanguageListActivity$4>
	//   31   73:dup             
	//   32   74:aload_0         
	//   33   75:aload_1         
	//   34   76:invokespecial   #174 <Method void RoombaV2LanguageListActivity$4(RoombaV2LanguageListActivity, CommandTierAgent)>
	//   35   79:ldc2w           #175 <Long 15000L>
	//   36   82:getstatic       #179 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   37   85:invokeinterface #166 <Method ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
	//   38   90:pop             
	//   39   91:return          
	}

	public void a(LanguagePack languagepack)
	{
		n = languagepack;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #182 <Field LanguagePack n>
		f(0x7f0f0289);
	//    3    5:aload_0         
	//    4    6:ldc1            #183 <Int 0x7f0f0289>
	//    5    8:invokevirtual   #186 <Method void f(int)>
		m = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #39  <Field boolean m>
		t = (a)Assembler.getInstance().getDomainEventBus();
	//    9   16:aload_0         
	//   10   17:invokestatic    #98  <Method Assembler Assembler.getInstance()>
	//   11   20:invokevirtual   #190 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//   12   23:checkcast       #56  <Class a>
	//   13   26:putfield        #43  <Field a t>
		t.a(((Object) (this)), EventType.ConnectionStateEvent);
	//   14   29:aload_0         
	//   15   30:getfield        #43  <Field a t>
	//   16   33:aload_0         
	//   17   34:getstatic       #193 <Field EventType EventType.ConnectionStateEvent>
	//   18   37:invokevirtual   #92  <Method void a.a(Object, EventType)>
		j();
	//   19   40:aload_0         
	//   20   41:invokevirtual   #196 <Method void j()>
	//   21   44:return          
	}

	protected void i()
	{
		k();
	//    0    0:aload_0         
	//    1    1:invokespecial   #199 <Method void k()>
	//    2    4:return          
	}

	protected void j()
	{
		if(n != null && !TextUtils.isEmpty(((CharSequence) (n.downloadUrl)))) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field LanguagePack n>
	//    2    4:ifnull          236
	//    3    7:aload_0         
	//    4    8:getfield        #182 <Field LanguagePack n>
	//    5   11:getfield        #208 <Field String LanguagePack.downloadUrl>
	//    6   14:invokestatic    #214 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    7   17:ifeq            23
	//*   8   20:goto            236
_L2:
		int i1;
		Object obj;
		obj = ((Object) (new StringBuilder()));
	//    9   23:new             #216 <Class StringBuilder>
	//   10   26:dup             
	//   11   27:invokespecial   #217 <Method void StringBuilder()>
	//   12   30:astore_2        
		((StringBuilder) (obj)).append("Downloading package: ");
	//   13   31:aload_2         
	//   14   32:ldc1            #219 <String "Downloading package: ">
	//   15   34:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   16   37:pop             
		((StringBuilder) (obj)).append(n.downloadUrl);
	//   17   38:aload_2         
	//   18   39:aload_0         
	//   19   40:getfield        #182 <Field LanguagePack n>
	//   20   43:getfield        #208 <Field String LanguagePack.downloadUrl>
	//   21   46:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   22   49:pop             
		com.irobot.home.util.o.b("AwsLangListActivity", ((StringBuilder) (obj)).toString());
	//   23   50:ldc1            #130 <String "AwsLangListActivity">
	//   24   52:aload_2         
	//   25   53:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   26   56:invokestatic    #230 <Method void o.b(String, String)>
		obj = ((Object) (new URL(n.downloadUrl)));
	//   27   59:new             #232 <Class URL>
	//   28   62:dup             
	//   29   63:aload_0         
	//   30   64:getfield        #182 <Field LanguagePack n>
	//   31   67:getfield        #208 <Field String LanguagePack.downloadUrl>
	//   32   70:invokespecial   #235 <Method void URL(String)>
	//   33   73:astore_2        
		h(0x7f0f0311);
	//   34   74:aload_0         
	//   35   75:ldc1            #236 <Int 0x7f0f0311>
	//   36   77:invokevirtual   #83  <Method void h(int)>
		obj = ((Object) ((HttpURLConnection)((URL) (obj)).openConnection()));
	//   37   80:aload_2         
	//   38   81:invokevirtual   #240 <Method java.net.URLConnection URL.openConnection()>
	//   39   84:checkcast       #242 <Class HttpURLConnection>
	//   40   87:astore_2        
		((HttpURLConnection) (obj)).setDoInput(true);
	//   41   88:aload_2         
	//   42   89:iconst_1        
	//   43   90:invokevirtual   #246 <Method void HttpURLConnection.setDoInput(boolean)>
		((HttpURLConnection) (obj)).setRequestMethod("GET");
	//   44   93:aload_2         
	//   45   94:ldc1            #248 <String "GET">
	//   46   96:invokevirtual   #251 <Method void HttpURLConnection.setRequestMethod(String)>
		((HttpURLConnection) (obj)).setConnectTimeout(8000);
	//   47   99:aload_2         
	//   48  100:sipush          8000
	//   49  103:invokevirtual   #254 <Method void HttpURLConnection.setConnectTimeout(int)>
		((HttpURLConnection) (obj)).connect();
	//   50  106:aload_2         
	//   51  107:invokevirtual   #257 <Method void HttpURLConnection.connect()>
		i1 = ((HttpURLConnection) (obj)).getResponseCode();
	//   52  110:aload_2         
	//   53  111:invokevirtual   #261 <Method int HttpURLConnection.getResponseCode()>
	//   54  114:istore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   55  115:new             #216 <Class StringBuilder>
	//   56  118:dup             
	//   57  119:invokespecial   #217 <Method void StringBuilder()>
	//   58  122:astore_3        
		stringbuilder.append("https response code: ");
	//   59  123:aload_3         
	//   60  124:ldc2            #263 <String "https response code: ">
	//   61  127:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   62  130:pop             
		stringbuilder.append(i1);
	//   63  131:aload_3         
	//   64  132:iload_1         
	//   65  133:invokevirtual   #266 <Method StringBuilder StringBuilder.append(int)>
	//   66  136:pop             
		com.irobot.home.util.o.b("AwsLangListActivity", stringbuilder.toString());
	//   67  137:ldc1            #130 <String "AwsLangListActivity">
	//   68  139:aload_3         
	//   69  140:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   70  143:invokestatic    #230 <Method void o.b(String, String)>
		if(i1 == 200) goto _L4; else goto _L3
	//   71  146:iload_1         
	//   72  147:sipush          200
	//   73  150:icmpeq          161
_L3:
		java.io.InputStream inputstream;
		try
		{
			g(0x7f0f030e);
	//   74  153:aload_0         
	//   75  154:ldc2            #267 <Int 0x7f0f030e>
	//   76  157:invokevirtual   #63  <Method void g(int)>
			return;
	//   77  160:return          
		}
	//*  78  161:aload_2         
	//*  79  162:invokevirtual   #271 <Method java.io.InputStream HttpURLConnection.getInputStream()>
	//*  80  165:astore_3        
	//*  81  166:aload_3         
	//*  82  167:ifnull          227
	//*  83  170:aload_0         
	//*  84  171:aload_2         
	//*  85  172:invokevirtual   #274 <Method int HttpURLConnection.getContentLength()>
	//*  86  175:putfield        #41  <Field int o>
	//*  87  178:aload_0         
	//*  88  179:aload_0         
	//*  89  180:getfield        #41  <Field int o>
	//*  90  183:newarray        byte[]
	//*  91  185:putfield        #37  <Field byte[] l>
	//*  92  188:new             #276 <Class DataInputStream>
	//*  93  191:dup             
	//*  94  192:aload_3         
	//*  95  193:invokespecial   #279 <Method void DataInputStream(java.io.InputStream)>
	//*  96  196:astore_2        
	//*  97  197:aload_2         
	//*  98  198:aload_0         
	//*  99  199:getfield        #37  <Field byte[] l>
	//* 100  202:invokevirtual   #283 <Method void DataInputStream.readFully(byte[])>
	//* 101  205:goto            215
	//* 102  208:aload_0         
	//* 103  209:ldc2            #284 <Int 0x7f0f0310>
	//* 104  212:invokevirtual   #63  <Method void g(int)>
	//* 105  215:aload_0         
	//* 106  216:invokevirtual   #286 <Method void i()>
	//* 107  219:return          
	//* 108  220:aload_0         
	//* 109  221:ldc2            #284 <Int 0x7f0f0310>
	//* 110  224:invokevirtual   #63  <Method void g(int)>
	//* 111  227:return          
	//* 112  228:aload_0         
	//* 113  229:ldc2            #287 <Int 0x7f0f030f>
	//* 114  232:invokevirtual   #63  <Method void g(int)>
	//* 115  235:return          
	//* 116  236:ldc1            #130 <String "AwsLangListActivity">
	//* 117  238:ldc2            #289 <String "Invalid language pack or language pack URL">
	//* 118  241:invokestatic    #138 <Method void o.e(String, String)>
	//* 119  244:return          
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			g(0x7f0f030f);
			return;
		}
	//* 120  245:astore_2        
	//* 121  246:goto            228
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			g(0x7f0f0310);
		}
		  goto _L5
_L4:
		inputstream = ((HttpURLConnection) (obj)).getInputStream();
		if(inputstream == null) goto _L5; else goto _L6
_L6:
		o = ((HttpURLConnection) (obj)).getContentLength();
		l = new byte[o];
		obj = ((Object) (new DataInputStream(inputstream)));
		((DataInputStream) (obj)).readFully(l);
		  goto _L7
_L9:
		g(0x7f0f0310);
_L7:
		i();
		return;
_L5:
		return;
_L1:
		Object obj1;
		com.irobot.home.util.o.e("AwsLangListActivity", "Invalid language pack or language pack URL");
		return;
	//* 122  249:astore_2        
	//* 123  250:goto            220
		obj1;
	//  124  253:astore_2        
		if(true) goto _L9; else goto _L8
_L8:
	//* 125  254:goto            208
	}

	public void onAssetOtaUpdateStatusEvent(AssetOtaUpdateStatusEvent assetotaupdatestatusevent)
	{
label0:
		{
label1:
			{
				if(isFinishing())
					break label0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #295 <Method boolean isFinishing()>
	//    2    4:ifne            245
				if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #298 <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
					return;
	//    6   14:return          
				static class _cls5
				{

					static final int a[];
					static final int b[];

					static 
					{
						b = new int[OtaUpdateStatus.values().length];
					//    0    0:invokestatic    #19  <Method OtaUpdateStatus[] OtaUpdateStatus.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #21  <Field int[] b>
						try
						{
							b[OtaUpdateStatus.None.ordinal()] = 1;
					//    4    9:getstatic       #21  <Field int[] b>
					//    5   12:getstatic       #25  <Field OtaUpdateStatus OtaUpdateStatus.None>
					//    6   15:invokevirtual   #29  <Method int OtaUpdateStatus.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #21  <Field int[] b>
					//*  10   23:getstatic       #32  <Field OtaUpdateStatus OtaUpdateStatus.DownloadAvailable>
					//*  11   26:invokevirtual   #29  <Method int OtaUpdateStatus.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:getstatic       #21  <Field int[] b>
					//*  15   34:getstatic       #35  <Field OtaUpdateStatus OtaUpdateStatus.ReadyToInstall>
					//*  16   37:invokevirtual   #29  <Method int OtaUpdateStatus.ordinal()>
					//*  17   40:iconst_3        
					//*  18   41:iastore         
					//*  19   42:getstatic       #21  <Field int[] b>
					//*  20   45:getstatic       #38  <Field OtaUpdateStatus OtaUpdateStatus.Installing>
					//*  21   48:invokevirtual   #29  <Method int OtaUpdateStatus.ordinal()>
					//*  22   51:iconst_4        
					//*  23   52:iastore         
					//*  24   53:invokestatic    #43  <Method SettingType[] SettingType.values()>
					//*  25   56:arraylength     
					//*  26   57:newarray        int[]
					//*  27   59:putstatic       #45  <Field int[] a>
					//*  28   62:getstatic       #45  <Field int[] a>
					//*  29   65:getstatic       #49  <Field SettingType SettingType.RobotLanguagesAvailable>
					//*  30   68:invokevirtual   #50  <Method int SettingType.ordinal()>
					//*  31   71:iconst_1        
					//*  32   72:iastore         
					//*  33   73:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//   34   74:astore_0        
						try
						{
							b[OtaUpdateStatus.DownloadAvailable.ordinal()] = 2;
						}
					//*  35   75:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//   36   78:astore_0        
						try
						{
							b[OtaUpdateStatus.ReadyToInstall.ordinal()] = 3;
						}
					//*  37   79:goto            31
						catch(NoSuchFieldError nosuchfielderror2) { }
					//   38   82:astore_0        
						try
						{
							b[OtaUpdateStatus.Installing.ordinal()] = 4;
						}
					//*  39   83:goto            42
						catch(NoSuchFieldError nosuchfielderror3) { }
					//   40   86:astore_0        
						a = new int[SettingType.values().length];
						try
						{
							a[SettingType.RobotLanguagesAvailable.ordinal()] = 1;
						}
					//*  41   87:goto            53
						catch(NoSuchFieldError nosuchfielderror4) { }
					//   42   90:astore_0        
					//*  43   91:return          
					}
				}

				int i1;
				switch(_cls5.b[assetotaupdatestatusevent.status().ordinal()])
	//*   7   15:getstatic       #301 <Field int[] RoombaV2LanguageListActivity$5.b>
	//*   8   18:aload_1         
	//*   9   19:invokevirtual   #307 <Method OtaUpdateStatus AssetOtaUpdateStatusEvent.status()>
	//*  10   22:invokevirtual   #312 <Method int OtaUpdateStatus.ordinal()>
	//*  11   25:iaload          
				{
	//*  12   26:tableswitch     1 4: default 56
	//	               1 194
	//	               2 179
	//	               3 81
	//	               4 59
				default:
					break label1;
	//   13   56:goto            211

				case 4: // '\004'
					com.irobot.home.util.o.b("AwsLangListActivity", "language_update_installing_package");
	//   14   59:ldc1            #130 <String "AwsLangListActivity">
	//   15   61:ldc2            #314 <String "language_update_installing_package">
	//   16   64:invokestatic    #230 <Method void o.b(String, String)>
					h(0x7f0f0314);
	//   17   67:aload_0         
	//   18   68:ldc2            #315 <Int 0x7f0f0314>
	//   19   71:invokevirtual   #83  <Method void h(int)>
					l();
	//   20   74:aload_0         
	//   21   75:invokespecial   #316 <Method void l()>
					break label1;
	//   22   78:goto            211

				case 3: // '\003'
					com.irobot.home.util.o.b("AwsLangListActivity", "language_update_uploading_package");
	//   23   81:ldc1            #130 <String "AwsLangListActivity">
	//   24   83:ldc2            #318 <String "language_update_uploading_package">
	//   25   86:invokestatic    #230 <Method void o.b(String, String)>
					h(0x7f0f031e);
	//   26   89:aload_0         
	//   27   90:ldc2            #319 <Int 0x7f0f031e>
	//   28   93:invokevirtual   #83  <Method void h(int)>
					if(l == null)
	//*  29   96:aload_0         
	//*  30   97:getfield        #37  <Field byte[] l>
	//*  31  100:ifnonnull       117
					{
						com.irobot.home.util.o.b("AwsLangListActivity", "language package is null");
	//   32  103:ldc1            #130 <String "AwsLangListActivity">
	//   33  105:ldc2            #321 <String "language package is null">
	//   34  108:invokestatic    #230 <Method void o.b(String, String)>
						a(0);
	//   35  111:aload_0         
	//   36  112:iconst_0        
	//   37  113:invokespecial   #78  <Method void a(int)>
						return;
	//   38  116:return          
					}
					CommandTierAgent commandtieragent = Assembler.getInstance().getCommandTierAgent(assetotaupdatestatusevent.assetId());
	//   39  117:invokestatic    #98  <Method Assembler Assembler.getInstance()>
	//   40  120:aload_1         
	//   41  121:invokevirtual   #324 <Method com.irobot.core.AssetId AssetOtaUpdateStatusEvent.assetId()>
	//   42  124:invokevirtual   #107 <Method CommandTierAgent Assembler.getCommandTierAgent(com.irobot.core.AssetId)>
	//   43  127:astore_3        
					AssetNetworkUIService assetnetworkuiservice = Assembler.getInstance().getNetworkUIService(assetotaupdatestatusevent.assetId());
	//   44  128:invokestatic    #98  <Method Assembler Assembler.getInstance()>
	//   45  131:aload_1         
	//   46  132:invokevirtual   #324 <Method com.irobot.core.AssetId AssetOtaUpdateStatusEvent.assetId()>
	//   47  135:invokevirtual   #111 <Method AssetNetworkUIService Assembler.getNetworkUIService(com.irobot.core.AssetId)>
	//   48  138:astore          4
					if(assetnetworkuiservice != null && assetnetworkuiservice.getServiceData().isConnectedLocally())
	//*  49  140:aload           4
	//*  50  142:ifnull          170
	//*  51  145:aload           4
	//*  52  147:invokevirtual   #117 <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//*  53  150:invokevirtual   #122 <Method boolean AssetNetworkUIServiceData.isConnectedLocally()>
	//*  54  153:ifne            159
	//*  55  156:goto            170
						commandtieragent.sendOTAPackage(l);
	//   56  159:aload_3         
	//   57  160:aload_0         
	//   58  161:getfield        #37  <Field byte[] l>
	//   59  164:invokevirtual   #327 <Method void CommandTierAgent.sendOTAPackage(byte[])>
					else
	//*  60  167:goto            211
						a(0x7f0f0284);
	//   61  170:aload_0         
	//   62  171:ldc1            #128 <Int 0x7f0f0284>
	//   63  173:invokespecial   #78  <Method void a(int)>
					break label1;
	//   64  176:goto            211

				case 2: // '\002'
					com.irobot.home.util.o.b("AwsLangListActivity", "language_update_preparing_for_update");
	//   65  179:ldc1            #130 <String "AwsLangListActivity">
	//   66  181:ldc2            #329 <String "language_update_preparing_for_update">
	//   67  184:invokestatic    #230 <Method void o.b(String, String)>
					i1 = 0x7f0f031c;
	//   68  187:ldc2            #330 <Int 0x7f0f031c>
	//   69  190:istore_2        
					break;
	//   70  191:goto            206

				case 1: // '\001'
					com.irobot.home.util.o.b("AwsLangListActivity", "language_update_waiting_robot_ack");
	//   71  194:ldc1            #130 <String "AwsLangListActivity">
	//   72  196:ldc2            #332 <String "language_update_waiting_robot_ack">
	//   73  199:invokestatic    #230 <Method void o.b(String, String)>
					i1 = 0x7f0f0320;
	//   74  202:ldc2            #333 <Int 0x7f0f0320>
	//   75  205:istore_2        
					break;
				}
				h(i1);
	//   76  206:aload_0         
	//   77  207:iload_2         
	//   78  208:invokevirtual   #83  <Method void h(int)>
			}
			if(assetotaupdatestatusevent.status() == OtaUpdateStatus.Error || assetotaupdatestatusevent.error() != OtaUpdateError.None)
	//*  79  211:aload_1         
	//*  80  212:invokevirtual   #307 <Method OtaUpdateStatus AssetOtaUpdateStatusEvent.status()>
	//*  81  215:getstatic       #337 <Field OtaUpdateStatus OtaUpdateStatus.Error>
	//*  82  218:if_acmpeq       231
	//*  83  221:aload_1         
	//*  84  222:invokevirtual   #341 <Method OtaUpdateError AssetOtaUpdateStatusEvent.error()>
	//*  85  225:getstatic       #347 <Field OtaUpdateError OtaUpdateError.None>
	//*  86  228:if_acmpeq       245
			{
				com.irobot.home.util.o.b("AwsLangListActivity", "language_update_failed");
	//   87  231:ldc1            #130 <String "AwsLangListActivity">
	//   88  233:ldc2            #349 <String "language_update_failed">
	//   89  236:invokestatic    #230 <Method void o.b(String, String)>
				g(0x7f0f0312);
	//   90  239:aload_0         
	//   91  240:ldc1            #60  <Int 0x7f0f0312>
	//   92  242:invokevirtual   #63  <Method void g(int)>
			}
		}
	//   93  245:return          
	}

	public void onConnectionStateEvent(ConnectionStateEvent connectionstateevent)
	{
		if(((Map) (connectionstateevent.networkState())).get(((Object) (NetworkType.Local))) == NetworkState.Connected)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #358 <Method java.util.HashMap ConnectionStateEvent.networkState()>
	//*   2    4:getstatic       #364 <Field NetworkType NetworkType.Local>
	//*   3    7:invokeinterface #370 <Method Object Map.get(Object)>
	//*   4   12:getstatic       #376 <Field NetworkState NetworkState.Connected>
	//*   5   15:if_acmpne       66
		{
			t.a(((Object) (this)), EventType.RobotLanguagesAvailableEvent);
	//    6   18:aload_0         
	//    7   19:getfield        #43  <Field a t>
	//    8   22:aload_0         
	//    9   23:getstatic       #379 <Field EventType EventType.RobotLanguagesAvailableEvent>
	//   10   26:invokevirtual   #92  <Method void a.a(Object, EventType)>
			connectionstateevent = ((ConnectionStateEvent) (Assembler.getInstance().getSettingsSubsystem(com.irobot.home.util.j.k())));
	//   11   29:invokestatic    #98  <Method Assembler Assembler.getInstance()>
	//   12   32:invokestatic    #103 <Method com.irobot.core.AssetId j.k()>
	//   13   35:invokevirtual   #383 <Method SettingsSubsystem Assembler.getSettingsSubsystem(com.irobot.core.AssetId)>
	//   14   38:astore_1        
			((SettingsSubsystem) (connectionstateevent)).registerSubscriber(((SettingsUIServiceDataCallback) (new SettingsUIServiceDataCallback(((SettingsSubsystem) (connectionstateevent))) {

				public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
				{
					if(settingsuiservicedata == null)
				//*   0    0:aload_1         
				//*   1    1:ifnonnull       12
					{
						com.irobot.home.util.o.e("AwsLangListActivity", "Service data was null.");
				//    2    4:ldc1            #27  <String "AwsLangListActivity">
				//    3    6:ldc1            #29  <String "Service data was null.">
				//    4    8:invokestatic    #35  <Method void o.e(String, String)>
						return;
				//    5   11:return          
					}
					Iterator iterator = settingsuiservicedata.getSettingsChangeList().iterator();
				//    6   12:aload_1         
				//    7   13:invokevirtual   #41  <Method HashSet SettingsUIServiceData.getSettingsChangeList()>
				//    8   16:invokevirtual   #47  <Method Iterator HashSet.iterator()>
				//    9   19:astore_2        
					do
					{
						if(!iterator.hasNext())
							break;
				//   10   20:aload_2         
				//   11   21:invokeinterface #53  <Method boolean Iterator.hasNext()>
				//   12   26:ifeq            77
						SettingType settingtype = (SettingType)iterator.next();
				//   13   29:aload_2         
				//   14   30:invokeinterface #57  <Method Object Iterator.next()>
				//   15   35:checkcast       #59  <Class SettingType>
				//   16   38:astore_3        
						if(com.irobot.home._cls5.a[settingtype.ordinal()] == 1)
				//*  17   39:getstatic       #64  <Field int[] com.irobot.home.RoombaV2LanguageListActivity$5.a>
				//*  18   42:aload_3         
				//*  19   43:invokevirtual   #68  <Method int SettingType.ordinal()>
				//*  20   46:iaload          
				//*  21   47:iconst_1        
				//*  22   48:icmpeq          54
				//*  23   51:goto            20
						{
							a.unregisterSubscriber(((SettingsUIServiceDataCallback) (this)));
				//   24   54:aload_0         
				//   25   55:getfield        #19  <Field SettingsSubsystem a>
				//   26   58:aload_0         
				//   27   59:invokevirtual   #74  <Method boolean SettingsSubsystem.unregisterSubscriber(SettingsUIServiceDataCallback)>
				//   28   62:pop             
							b.processAvailableLanguages(settingsuiservicedata.getAvailableLanguages());
				//   29   63:aload_0         
				//   30   64:getfield        #17  <Field RoombaV2LanguageListActivity b>
				//   31   67:aload_1         
				//   32   68:invokevirtual   #78  <Method ArrayList SettingsUIServiceData.getAvailableLanguages()>
				//   33   71:invokevirtual   #82  <Method void RoombaV2LanguageListActivity.processAvailableLanguages(ArrayList)>
						}
					} while(true);
				//   34   74:goto            20
				//   35   77:return          
				}

				final SettingsSubsystem a;
				final RoombaV2LanguageListActivity b;

			
			{
				b = RoombaV2LanguageListActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RoombaV2LanguageListActivity b>
				a = settingssubsystem;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field SettingsSubsystem a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void SettingsUIServiceDataCallback()>
			//    8   14:return          
			}
			}
)));
	//   15   39:aload_1         
	//   16   40:new             #6   <Class RoombaV2LanguageListActivity$1>
	//   17   43:dup             
	//   18   44:aload_0         
	//   19   45:aload_1         
	//   20   46:invokespecial   #386 <Method void RoombaV2LanguageListActivity$1(RoombaV2LanguageListActivity, SettingsSubsystem)>
	//   21   49:invokevirtual   #392 <Method boolean SettingsSubsystem.registerSubscriber(SettingsUIServiceDataCallback)>
	//   22   52:pop             
			if(!m)
	//*  23   53:aload_0         
	//*  24   54:getfield        #39  <Field boolean m>
	//*  25   57:ifne            79
			{
				m = false;
	//   26   60:aload_0         
	//   27   61:iconst_0        
	//   28   62:putfield        #39  <Field boolean m>
				return;
	//   29   65:return          
			}
		} else
		if(!m)
	//*  30   66:aload_0         
	//*  31   67:getfield        #39  <Field boolean m>
	//*  32   70:ifne            79
			a(0x7f0f0284);
	//   33   73:aload_0         
	//   34   74:ldc1            #128 <Int 0x7f0f0284>
	//   35   76:invokespecial   #78  <Method void a(int)>
	//   36   79:return          
	}

	protected void onDestroy()
	{
		v.shutdownNow();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ScheduledExecutorService v>
	//    2    4:invokeinterface #397 <Method List ScheduledExecutorService.shutdownNow()>
	//    3    9:pop             
		super.onDestroy();
	//    4   10:aload_0         
	//    5   11:invokespecial   #399 <Method void BaseRobotLanguageListActivity.onDestroy()>
	//    6   14:return          
	}

	public void processAvailableLanguages(ArrayList arraylist)
	{
		boolean flag;
		RobotAvailableLanguages robotavailablelanguages;
label0:
		{
			Object obj = ((Object) (Assembler.getInstance().getNetworkUIService(com.irobot.home.util.j.k())));
	//    0    0:invokestatic    #98  <Method Assembler Assembler.getInstance()>
	//    1    3:invokestatic    #103 <Method com.irobot.core.AssetId j.k()>
	//    2    6:invokevirtual   #111 <Method AssetNetworkUIService Assembler.getNetworkUIService(com.irobot.core.AssetId)>
	//    3    9:astore          4
			if(obj == null)
	//*   4   11:aload           4
	//*   5   13:ifnonnull       17
				return;
	//    6   16:return          
			if(!((AssetNetworkUIService) (obj)).getServiceData().isConnectedLocally())
	//*   7   17:aload           4
	//*   8   19:invokevirtual   #117 <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//*   9   22:invokevirtual   #122 <Method boolean AssetNetworkUIServiceData.isConnectedLocally()>
	//*  10   25:ifne            37
			{
				com.irobot.home.util.o.e("AwsLangListActivity", "Dropping onRobotLanguageAvailable event, received over remote");
	//   11   28:ldc1            #130 <String "AwsLangListActivity">
	//   12   30:ldc2            #403 <String "Dropping onRobotLanguageAvailable event, received over remote">
	//   13   33:invokestatic    #138 <Method void o.e(String, String)>
				return;
	//   14   36:return          
			}
			Object obj1 = null;
	//   15   37:aconst_null     
	//   16   38:astore          5
			obj = "";
	//   17   40:ldc2            #405 <String "">
	//   18   43:astore          4
			if(n instanceof LanguagePack)
	//*  19   45:aload_0         
	//*  20   46:getfield        #182 <Field LanguagePack n>
	//*  21   49:instanceof      #205 <Class LanguagePack>
	//*  22   52:ifeq            67
			{
				obj = ((Object) (n.lang));
	//   23   55:aload_0         
	//   24   56:getfield        #182 <Field LanguagePack n>
	//   25   59:getfield        #408 <Field String LanguagePack.lang>
	//   26   62:astore          4
			} else
	//*  27   64:goto            80
			{
				com.irobot.home.util.o.e("AwsLangListActivity", "Unable to set the selected language");
	//   28   67:ldc1            #130 <String "AwsLangListActivity">
	//   29   69:ldc2            #410 <String "Unable to set the selected language">
	//   30   72:invokestatic    #138 <Method void o.e(String, String)>
				a(0);
	//   31   75:aload_0         
	//   32   76:iconst_0        
	//   33   77:invokespecial   #78  <Method void a(int)>
			}
			boolean flag1 = ((String) (obj)).equals("default");
	//   34   80:aload           4
	//   35   82:ldc2            #412 <String "default">
	//   36   85:invokevirtual   #418 <Method boolean String.equals(Object)>
	//   37   88:istore_3        
			robotavailablelanguages = new RobotAvailableLanguages(com.irobot.home.util.j.a(arraylist));
	//   38   89:new             #420 <Class RobotAvailableLanguages>
	//   39   92:dup             
	//   40   93:aload_1         
	//   41   94:invokestatic    #423 <Method List j.a(ArrayList)>
	//   42   97:invokespecial   #426 <Method void RobotAvailableLanguages(List)>
	//   43  100:astore          6
			for(Iterator iterator = robotavailablelanguages.a().iterator(); iterator.hasNext();)
	//*  44  102:aload           6
	//*  45  104:invokevirtual   #428 <Method List RobotAvailableLanguages.a()>
	//*  46  107:invokeinterface #434 <Method Iterator List.iterator()>
	//*  47  112:astore          7
	//*  48  114:aload           7
	//*  49  116:invokeinterface #439 <Method boolean Iterator.hasNext()>
	//*  50  121:ifeq            163
			{
				arraylist = ((ArrayList) ((RobotLanguage)iterator.next()));
	//   51  124:aload           7
	//   52  126:invokeinterface #443 <Method Object Iterator.next()>
	//   53  131:checkcast       #445 <Class RobotLanguage>
	//   54  134:astore_1        
				if(((RobotLanguage) (arraylist)).b.equals(obj) || flag1 && ((RobotLanguage) (arraylist)).a == 0)
	//*  55  135:aload_1         
	//*  56  136:getfield        #447 <Field String RobotLanguage.b>
	//*  57  139:aload           4
	//*  58  141:invokevirtual   #418 <Method boolean String.equals(Object)>
	//*  59  144:ifne            158
	//*  60  147:iload_3         
	//*  61  148:ifeq            114
	//*  62  151:aload_1         
	//*  63  152:getfield        #449 <Field int RobotLanguage.a>
	//*  64  155:ifne            114
				{
					flag = true;
	//   65  158:iconst_1        
	//   66  159:istore_2        
					break label0;
	//   67  160:goto            168
				}
			}

			flag = false;
	//   68  163:iconst_0        
	//   69  164:istore_2        
			arraylist = ((ArrayList) (obj1));
	//   70  165:aload           5
	//   71  167:astore_1        
		}
		if(flag)
	//*  72  168:iload_2         
	//*  73  169:ifeq            208
		{
			a(false);
	//   74  172:aload_0         
	//   75  173:iconst_0        
	//   76  174:invokevirtual   #451 <Method void a(boolean)>
			j = robotavailablelanguages;
	//   77  177:aload_0         
	//   78  178:aload           6
	//   79  180:putfield        #454 <Field RobotAvailableLanguages j>
			i = ((RobotLanguage) (arraylist)).a;
	//   80  183:aload_0         
	//   81  184:aload_1         
	//   82  185:getfield        #449 <Field int RobotLanguage.a>
	//   83  188:putfield        #456 <Field int i>
			f();
	//   84  191:aload_0         
	//   85  192:invokevirtual   #458 <Method void f()>
			a(((RobotLanguage) (arraylist)));
	//   86  195:aload_0         
	//   87  196:aload_1         
	//   88  197:invokevirtual   #461 <Method void a(RobotLanguage)>
			t.a(((Object) (this)));
	//   89  200:aload_0         
	//   90  201:getfield        #43  <Field a t>
	//   91  204:aload_0         
	//   92  205:invokevirtual   #59  <Method void a.a(Object)>
		}
	//   93  208:return          
	}

	private final int k = 0;
	private byte l[];
	private boolean m;
	private LanguagePack n;
	private int o;
	private a t;
	private ScheduledFuture u;
	private final ScheduledExecutorService v = Executors.newScheduledThreadPool(1);
}
