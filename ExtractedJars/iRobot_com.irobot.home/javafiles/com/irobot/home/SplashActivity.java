// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.AlertDialog;
import android.content.*;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.irobot.core.*;
import com.irobot.home.model.IRobotModel;
import com.irobot.home.model.a;
import com.irobot.home.util.WifiStateReceiver;
import com.irobot.home.util.ab;
import com.irobot.home.util.j;
import com.irobot.home.util.k;
import com.irobot.home.util.o;
import com.irobot.home.util.t;
import java.util.*;
import org.androidannotations.api.b.*;

// Referenced classes of package com.irobot.home:
//			BasePushNotificationActivity, IRobotApplication, AppWelcomeActivity_, CreateAccountOrLoginActivity_, 
//			SelectRobotTypeActivity_

public class SplashActivity extends BasePushNotificationActivity
	implements com.irobot.home.util.WifiStateReceiver.a
{

	public SplashActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void BasePushNotificationActivity()>
		h = new Handler();
	//    2    4:aload_0         
	//    3    5:new             #57  <Class Handler>
	//    4    8:dup             
	//    5    9:invokespecial   #58  <Method void Handler()>
	//    6   12:putfield        #60  <Field Handler h>
		c = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #62  <Field AlertDialog c>
		d = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #64  <Field AlertDialog d>
		i = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #66  <Field boolean i>
		j = false;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #68  <Field boolean j>
		k = false;
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:putfield        #70  <Field boolean k>
	//   22   40:aload_0         
	//   23   41:invokestatic    #76  <Method Assembler Assembler.getInstance()>
	//   24   44:invokevirtual   #80  <Method ApplicationUIService Assembler.getApplicationUIService()>
	//   25   47:putfield        #82  <Field ApplicationUIService l>
		m = ((ApplicationUIServiceDataCallback) (new ApplicationUIServiceDataCallback() {

			public void onApplicationUIServiceDataChanged(ApplicationUIServiceData applicationuiservicedata)
			{
				Iterator iterator = applicationuiservicedata.getViewStateChangelist().iterator();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #24  <Method ArrayList ApplicationUIServiceData.getViewStateChangelist()>
			//    2    4:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
			//    3    7:astore          4
				do
				{
					if(!iterator.hasNext())
						break;
			//    4    9:aload           4
			//    5   11:invokeinterface #36  <Method boolean Iterator.hasNext()>
			//    6   16:ifeq            174
					ApplicationUIState applicationuistate = (ApplicationUIState)iterator.next();
			//    7   19:aload           4
			//    8   21:invokeinterface #40  <Method Object Iterator.next()>
			//    9   26:checkcast       #42  <Class ApplicationUIState>
			//   10   29:astore          5
					static class _cls9
					{

						static final int a[];

						static 
						{
							a = new int[ApplicationUIState.values().length];
						//    0    0:invokestatic    #18  <Method ApplicationUIState[] ApplicationUIState.values()>
						//    1    3:arraylength     
						//    2    4:newarray        int[]
						//    3    6:putstatic       #20  <Field int[] a>
							try
							{
								a[ApplicationUIState.AppVersionUnavailable.ordinal()] = 1;
						//    4    9:getstatic       #20  <Field int[] a>
						//    5   12:getstatic       #24  <Field ApplicationUIState ApplicationUIState.AppVersionUnavailable>
						//    6   15:invokevirtual   #28  <Method int ApplicationUIState.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
							}
						//*   9   20:getstatic       #20  <Field int[] a>
						//*  10   23:getstatic       #31  <Field ApplicationUIState ApplicationUIState.NewAppVersionAvailable>
						//*  11   26:invokevirtual   #28  <Method int ApplicationUIState.ordinal()>
						//*  12   29:iconst_2        
						//*  13   30:iastore         
						//*  14   31:getstatic       #20  <Field int[] a>
						//*  15   34:getstatic       #34  <Field ApplicationUIState ApplicationUIState.NewAppVersionRequired>
						//*  16   37:invokevirtual   #28  <Method int ApplicationUIState.ordinal()>
						//*  17   40:iconst_3        
						//*  18   41:iastore         
						//*  19   42:return          
							catch(NoSuchFieldError nosuchfielderror) { }
						//   20   43:astore_0        
							try
							{
								a[ApplicationUIState.NewAppVersionAvailable.ordinal()] = 2;
							}
						//*  21   44:goto            20
							catch(NoSuchFieldError nosuchfielderror1) { }
						//   22   47:astore_0        
							try
							{
								a[ApplicationUIState.NewAppVersionRequired.ordinal()] = 3;
							}
						//*  23   48:goto            31
							catch(NoSuchFieldError nosuchfielderror2) { }
						//   24   51:astore_0        
						//*  25   52:return          
						}
					}

					int i1 = com.irobot.home._cls9.a[applicationuistate.ordinal()];
			//   11   31:getstatic       #47  <Field int[] com.irobot.home.SplashActivity$9.a>
			//   12   34:aload           5
			//   13   36:invokevirtual   #51  <Method int ApplicationUIState.ordinal()>
			//   14   39:iaload          
			//   15   40:istore_2        
					boolean flag = true;
			//   16   41:iconst_1        
			//   17   42:istore_3        
					switch(i1)
			//*  18   43:iload_2         
					{
			//*  19   44:tableswitch     1 3: default 72
			//			               1 162
			//			               2 118
			//			               3 118
					default:
						String s = SplashActivity.h();
			//   20   72:invokestatic    #55  <Method String SplashActivity.h()>
			//   21   75:astore          6
						StringBuilder stringbuilder = new StringBuilder();
			//   22   77:new             #57  <Class StringBuilder>
			//   23   80:dup             
			//   24   81:invokespecial   #58  <Method void StringBuilder()>
			//   25   84:astore          7
						stringbuilder.append("Unhandled ApplicationUIState: ");
			//   26   86:aload           7
			//   27   88:ldc1            #60  <String "Unhandled ApplicationUIState: ">
			//   28   90:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
			//   29   93:pop             
						stringbuilder.append(applicationuistate.name());
			//   30   94:aload           7
			//   31   96:aload           5
			//   32   98:invokevirtual   #67  <Method String ApplicationUIState.name()>
			//   33  101:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
			//   34  104:pop             
						o.d(s, stringbuilder.toString());
			//   35  105:aload           6
			//   36  107:aload           7
			//   37  109:invokevirtual   #70  <Method String StringBuilder.toString()>
			//   38  112:invokestatic    #76  <Method void o.d(String, String)>
						break;

			//*  39  115:goto            9
					case 2: // '\002'
					case 3: // '\003'
						String s1 = applicationuiservicedata.getApplicationVersion();
			//   40  118:aload_1         
			//   41  119:invokevirtual   #79  <Method String ApplicationUIServiceData.getApplicationVersion()>
			//   42  122:astore          6
						String s2 = applicationuiservicedata.getAppDownloadUrl();
			//   43  124:aload_1         
			//   44  125:invokevirtual   #82  <Method String ApplicationUIServiceData.getAppDownloadUrl()>
			//   45  128:astore          7
						SplashActivity splashactivity = a;
			//   46  130:aload_0         
			//   47  131:getfield        #12  <Field SplashActivity a>
			//   48  134:astore          8
						if(applicationuistate != ApplicationUIState.NewAppVersionAvailable)
			//*  49  136:aload           5
			//*  50  138:getstatic       #86  <Field ApplicationUIState ApplicationUIState.NewAppVersionAvailable>
			//*  51  141:if_acmpne       147
			//*  52  144:goto            149
							flag = false;
			//   53  147:iconst_0        
			//   54  148:istore_3        
						splashactivity.a(s1, s2, flag);
			//   55  149:aload           8
			//   56  151:aload           6
			//   57  153:aload           7
			//   58  155:iload_3         
			//   59  156:invokevirtual   #89  <Method void com.irobot.home.SplashActivity.a(String, String, boolean)>
						break;

			//*  60  159:goto            9
					case 1: // '\001'
						com.irobot.home.SplashActivity.a(a, true);
			//   61  162:aload_0         
			//   62  163:getfield        #12  <Field SplashActivity a>
			//   63  166:iconst_1        
			//   64  167:invokestatic    #92  <Method boolean com.irobot.home.SplashActivity.a(SplashActivity, boolean)>
			//   65  170:pop             
						break;
					}
				} while(true);
			//*  66  171:goto            9
			//   67  174:return          
			}

			final SplashActivity a;

			
			{
				a = SplashActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field SplashActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void ApplicationUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//   26   50:aload_0         
	//   27   51:new             #8   <Class SplashActivity$1>
	//   28   54:dup             
	//   29   55:aload_0         
	//   30   56:invokespecial   #85  <Method void SplashActivity$1(SplashActivity)>
	//   31   59:putfield        #87  <Field ApplicationUIServiceDataCallback m>
	//   32   62:aload_0         
	//   33   63:new             #10  <Class SplashActivity$2>
	//   34   66:dup             
	//   35   67:aload_0         
	//   36   68:invokespecial   #88  <Method void SplashActivity$2(SplashActivity)>
	//   37   71:putfield        #90  <Field Runnable e>
		n = new Handler();
	//   38   74:aload_0         
	//   39   75:new             #57  <Class Handler>
	//   40   78:dup             
	//   41   79:invokespecial   #58  <Method void Handler()>
	//   42   82:putfield        #92  <Field Handler n>
	//   43   85:aload_0         
	//   44   86:new             #12  <Class SplashActivity$3>
	//   45   89:dup             
	//   46   90:aload_0         
	//   47   91:invokespecial   #93  <Method void SplashActivity$3(SplashActivity)>
	//   48   94:putfield        #95  <Field Runnable f>
	//   49   97:return          
	}

	static void a(SplashActivity splashactivity, String s)
	{
		splashactivity.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #99  <Method void a(String)>
	//    3    5:return          
	}

	private void a(String s)
	{
		ApplicationUIServiceData applicationuiservicedata = ApplicationUIServiceData.create();
	//    0    0:invokestatic    #105 <Method ApplicationUIServiceData ApplicationUIServiceData.create()>
	//    1    3:astore_2        
		applicationuiservicedata.setAppVersionViewed(s);
	//    2    4:aload_2         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #108 <Method void ApplicationUIServiceData.setAppVersionViewed(String)>
		l.sendCommand(ApplicationUIServiceCommand.AppVersionViewed, applicationuiservicedata);
	//    5    9:aload_0         
	//    6   10:getfield        #82  <Field ApplicationUIService l>
	//    7   13:getstatic       #114 <Field ApplicationUIServiceCommand ApplicationUIServiceCommand.AppVersionViewed>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #120 <Method void ApplicationUIService.sendCommand(ApplicationUIServiceCommand, ApplicationUIServiceData)>
	//   10   20:return          
	}

	static boolean a(SplashActivity splashactivity)
	{
		return splashactivity.i;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field boolean i>
	//    2    4:ireturn         
	}

	static boolean a(SplashActivity splashactivity, boolean flag)
	{
		splashactivity.i = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #66  <Field boolean i>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static Handler b(SplashActivity splashactivity)
	{
		return splashactivity.h;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Handler h>
	//    2    4:areturn         
	}

	static void c(SplashActivity splashactivity)
	{
		splashactivity.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method void i()>
	//    2    4:return          
	}

	static String h()
	{
		return g;
	//    0    0:getstatic       #128 <Field String g>
	//    1    3:areturn         
	}

	private void i()
	{
		h.removeCallbacks(e);
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Handler h>
	//    2    4:aload_0         
	//    3    5:getfield        #90  <Field Runnable e>
	//    4    8:invokevirtual   #132 <Method void Handler.removeCallbacks(Runnable)>
		h.postDelayed(e, 2000L);
	//    5   11:aload_0         
	//    6   12:getfield        #60  <Field Handler h>
	//    7   15:aload_0         
	//    8   16:getfield        #90  <Field Runnable e>
	//    9   19:ldc2w           #133 <Long 2000L>
	//   10   22:invokevirtual   #138 <Method boolean Handler.postDelayed(Runnable, long)>
	//   11   25:pop             
	//   12   26:return          
	}

	private void j()
	{
		Object obj = ((Object) (a.h().f()));
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field IRobotApplication a>
	//    2    4:invokevirtual   #145 <Method IRobotModel IRobotApplication.h()>
	//    3    7:invokevirtual   #150 <Method List IRobotModel.f()>
	//    4   10:astore_2        
		ArrayList arraylist = new ArrayList();
	//    5   11:new             #152 <Class ArrayList>
	//    6   14:dup             
	//    7   15:invokespecial   #153 <Method void ArrayList()>
	//    8   18:astore_1        
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); arraylist.add(((Object) (((a)((Iterator) (obj)).next()).a()))));
	//    9   19:aload_2         
	//   10   20:invokeinterface #159 <Method Iterator List.iterator()>
	//   11   25:astore_2        
	//   12   26:aload_2         
	//   13   27:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//   14   32:ifeq            55
	//   15   35:aload_1         
	//   16   36:aload_2         
	//   17   37:invokeinterface #169 <Method Object Iterator.next()>
	//   18   42:checkcast       #171 <Class a>
	//   19   45:invokevirtual   #174 <Method com.irobot.core.AssetInfo a.a()>
	//   20   48:invokevirtual   #178 <Method boolean ArrayList.add(Object)>
	//   21   51:pop             
	//*  22   52:goto            26
		AnalyticsSubsystem.getInstance().trackAppLaunched(v(), arraylist);
	//   23   55:invokestatic    #183 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   24   58:aload_0         
	//   25   59:invokevirtual   #186 <Method boolean v()>
	//   26   62:aload_1         
	//   27   63:invokevirtual   #190 <Method void AnalyticsSubsystem.trackAppLaunched(boolean, ArrayList)>
	//   28   66:return          
	}

	protected void a(int i1, int j1, android.content.DialogInterface.OnClickListener onclicklistener, boolean flag)
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #194 <Method boolean isFinishing()>
	//*   2    4:ifne            104
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #197 <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			if(c != null && c.isShowing())
	//*   7   15:aload_0         
	//*   8   16:getfield        #62  <Field AlertDialog c>
	//*   9   19:ifnull          33
	//*  10   22:aload_0         
	//*  11   23:getfield        #62  <Field AlertDialog c>
	//*  12   26:invokevirtual   #202 <Method boolean AlertDialog.isShowing()>
	//*  13   29:ifeq            33
				return;
	//   14   32:return          
			if(c == null)
	//*  15   33:aload_0         
	//*  16   34:getfield        #62  <Field AlertDialog c>
	//*  17   37:ifnonnull       79
				c = (new android.app.AlertDialog.Builder(((Context) (this)))).setCancelable(false).setMessage(i1).setPositiveButton(j1, onclicklistener).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

					public void onDismiss(DialogInterface dialoginterface)
					{
						a.a.b();
					//    0    0:aload_0         
					//    1    1:getfield        #16  <Field SplashActivity a>
					//    2    4:getfield        #25  <Field IRobotApplication com.irobot.home.SplashActivity.a>
					//    3    7:invokevirtual   #30  <Method void IRobotApplication.b()>
						com.irobot.home.SplashActivity.c(a);
					//    4   10:aload_0         
					//    5   11:getfield        #16  <Field SplashActivity a>
					//    6   14:invokestatic    #33  <Method void com.irobot.home.SplashActivity.c(SplashActivity)>
					//    7   17:return          
					}

					final SplashActivity a;

			
			{
				a = SplashActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field SplashActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
).create();
	//   18   40:aload_0         
	//   19   41:new             #204 <Class android.app.AlertDialog$Builder>
	//   20   44:dup             
	//   21   45:aload_0         
	//   22   46:invokespecial   #207 <Method void android.app.AlertDialog$Builder(Context)>
	//   23   49:iconst_0        
	//   24   50:invokevirtual   #211 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setCancelable(boolean)>
	//   25   53:iload_1         
	//   26   54:invokevirtual   #215 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   27   57:iload_2         
	//   28   58:aload_3         
	//   29   59:invokevirtual   #219 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   30   62:new             #14  <Class SplashActivity$4>
	//   31   65:dup             
	//   32   66:aload_0         
	//   33   67:invokespecial   #220 <Method void SplashActivity$4(SplashActivity)>
	//   34   70:invokevirtual   #224 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnDismissListener(android.content.DialogInterface$OnDismissListener)>
	//   35   73:invokevirtual   #227 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   36   76:putfield        #62  <Field AlertDialog c>
			c.show();
	//   37   79:aload_0         
	//   38   80:getfield        #62  <Field AlertDialog c>
	//   39   83:invokevirtual   #230 <Method void AlertDialog.show()>
			if(flag)
	//*  40   86:iload           4
	//*  41   88:ifeq            104
				AnalyticsSubsystem.getInstance().trackAccountServiceUnavailableDialogViewed(a.d());
	//   42   91:invokestatic    #183 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   43   94:aload_0         
	//   44   95:getfield        #140 <Field IRobotApplication a>
	//   45   98:invokevirtual   #233 <Method com.irobot.core.AccountError com.irobot.home.IRobotApplication.d()>
	//   46  101:invokevirtual   #237 <Method void AnalyticsSubsystem.trackAccountServiceUnavailableDialogViewed(com.irobot.core.AccountError)>
		}
	//   47  104:return          
	}

	public void a(android.net.NetworkInfo.DetailedState detailedstate, NetworkInfo networkinfo)
	{
		if(j && detailedstate == android.net.NetworkInfo.DetailedState.CONNECTED)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field boolean j>
	//*   2    4:ifeq            90
	//*   3    7:aload_1         
	//*   4    8:getstatic       #244 <Field android.net.NetworkInfo$DetailedState android.net.NetworkInfo$DetailedState.CONNECTED>
	//*   5   11:if_acmpne       90
		{
			detailedstate = ((android.net.NetworkInfo.DetailedState) (networkinfo.getExtraInfo()));
	//    6   14:aload_2         
	//    7   15:invokevirtual   #249 <Method String NetworkInfo.getExtraInfo()>
	//    8   18:astore_1        
			k = com.irobot.home.util.j.j(((String) (detailedstate)));
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokestatic    #254 <Method boolean j.j(String)>
	//   12   24:putfield        #70  <Field boolean k>
			if(!k)
	//*  13   27:aload_0         
	//*  14   28:getfield        #70  <Field boolean k>
	//*  15   31:ifne            90
			{
				networkinfo = ((NetworkInfo) (g));
	//   16   34:getstatic       #128 <Field String g>
	//   17   37:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   18   38:new             #256 <Class StringBuilder>
	//   19   41:dup             
	//   20   42:invokespecial   #257 <Method void StringBuilder()>
	//   21   45:astore_3        
				stringbuilder.append("Reconnected to ");
	//   22   46:aload_3         
	//   23   47:ldc2            #259 <String "Reconnected to ">
	//   24   50:invokevirtual   #263 <Method StringBuilder StringBuilder.append(String)>
	//   25   53:pop             
				stringbuilder.append(((String) (detailedstate)));
	//   26   54:aload_3         
	//   27   55:aload_1         
	//   28   56:invokevirtual   #263 <Method StringBuilder StringBuilder.append(String)>
	//   29   59:pop             
				o.b(((String) (networkinfo)), stringbuilder.toString());
	//   30   60:aload_2         
	//   31   61:aload_3         
	//   32   62:invokevirtual   #266 <Method String StringBuilder.toString()>
	//   33   65:invokestatic    #271 <Method void o.b(String, String)>
				(new Handler()).postDelayed(new Runnable() {

					public void run()
					{
						a.a.b();
					//    0    0:aload_0         
					//    1    1:getfield        #16  <Field SplashActivity a>
					//    2    4:getfield        #24  <Field IRobotApplication com.irobot.home.SplashActivity.a>
					//    3    7:invokevirtual   #29  <Method void IRobotApplication.b()>
						a.g();
					//    4   10:aload_0         
					//    5   11:getfield        #16  <Field SplashActivity a>
					//    6   14:invokevirtual   #32  <Method void com.irobot.home.SplashActivity.g()>
						SplashActivity.b(a).postDelayed(a.e, 2000L);
					//    7   17:aload_0         
					//    8   18:getfield        #16  <Field SplashActivity a>
					//    9   21:invokestatic    #35  <Method Handler SplashActivity.b(SplashActivity)>
					//   10   24:aload_0         
					//   11   25:getfield        #16  <Field SplashActivity a>
					//   12   28:getfield        #39  <Field Runnable SplashActivity.e>
					//   13   31:ldc2w           #40  <Long 2000L>
					//   14   34:invokevirtual   #47  <Method boolean Handler.postDelayed(Runnable, long)>
					//   15   37:pop             
					//   16   38:return          
					}

					final SplashActivity a;

			
			{
				a = SplashActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field SplashActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
, 1000L);
	//   34   68:new             #57  <Class Handler>
	//   35   71:dup             
	//   36   72:invokespecial   #58  <Method void Handler()>
	//   37   75:new             #22  <Class SplashActivity$8>
	//   38   78:dup             
	//   39   79:aload_0         
	//   40   80:invokespecial   #272 <Method void SplashActivity$8(SplashActivity)>
	//   41   83:ldc2w           #273 <Long 1000L>
	//   42   86:invokevirtual   #138 <Method boolean Handler.postDelayed(Runnable, long)>
	//   43   89:pop             
			}
		}
	//   44   90:return          
	}

	public void a(NetworkInfo networkinfo)
	{
	//    0    0:return          
	}

	protected void a(String s, String s1, boolean flag)
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #194 <Method boolean isFinishing()>
	//*   2    4:ifne            136
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #197 <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			if(d != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #64  <Field AlertDialog d>
	//*   9   19:ifnull          30
			{
				d.show();
	//   10   22:aload_0         
	//   11   23:getfield        #64  <Field AlertDialog d>
	//   12   26:invokevirtual   #230 <Method void AlertDialog.show()>
				return;
	//   13   29:return          
			}
			AnalyticsSubsystem analyticssubsystem = Assembler.getInstance().getAnalyticsSubsystem();
	//   14   30:invokestatic    #76  <Method Assembler Assembler.getInstance()>
	//   15   33:invokevirtual   #279 <Method AnalyticsSubsystem Assembler.getAnalyticsSubsystem()>
	//   16   36:astore          4
			s1 = ((String) ((new android.app.AlertDialog.Builder(((Context) (this)))).setTitle(0x7f0f04c4).setMessage(((CharSequence) (getString(0x7f0f04c7, new Object[] {
				s
			})))).setCancelable(false).setPositiveButton(0x7f0f093b, new android.content.DialogInterface.OnClickListener(analyticssubsystem, s, s1) {

				public void onClick(DialogInterface dialoginterface, int i1)
				{
					a.trackNewAppVersionAvailableUpdateClicked(b);
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field AnalyticsSubsystem a>
				//    2    4:aload_0         
				//    3    5:getfield        #25  <Field String b>
				//    4    8:invokevirtual   #39  <Method void AnalyticsSubsystem.trackNewAppVersionAvailableUpdateClicked(String)>
					dialoginterface = ((DialogInterface) (new Intent("android.intent.action.VIEW", Uri.parse(c))));
				//    5   11:new             #41  <Class Intent>
				//    6   14:dup             
				//    7   15:ldc1            #43  <String "android.intent.action.VIEW">
				//    8   17:aload_0         
				//    9   18:getfield        #27  <Field String c>
				//   10   21:invokestatic    #49  <Method Uri Uri.parse(String)>
				//   11   24:invokespecial   #52  <Method void Intent(String, Uri)>
				//   12   27:astore_1        
					d.startActivity(((Intent) (dialoginterface)));
				//   13   28:aload_0         
				//   14   29:getfield        #21  <Field SplashActivity d>
				//   15   32:aload_1         
				//   16   33:invokevirtual   #56  <Method void SplashActivity.startActivity(Intent)>
				//   17   36:return          
				}

				final AnalyticsSubsystem a;
				final String b;
				final String c;
				final SplashActivity d;

			
			{
				d = SplashActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field SplashActivity d>
				a = analyticssubsystem;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field AnalyticsSubsystem a>
				b = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field String b>
				c = s1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #27  <Field String c>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #30  <Method void Object()>
			//   14   25:return          
			}
			}
).setOnDismissListener(new android.content.DialogInterface.OnDismissListener(s) {

				public void onDismiss(DialogInterface dialoginterface)
				{
					com.irobot.home.SplashActivity.a(b, a);
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field SplashActivity b>
				//    2    4:aload_0         
				//    3    5:getfield        #20  <Field String a>
				//    4    8:invokestatic    #28  <Method void com.irobot.home.SplashActivity.a(SplashActivity, String)>
				//    5   11:return          
				}

				final String a;
				final SplashActivity b;

			
			{
				b = SplashActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field SplashActivity b>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
)));
	//   17   38:new             #204 <Class android.app.AlertDialog$Builder>
	//   18   41:dup             
	//   19   42:aload_0         
	//   20   43:invokespecial   #207 <Method void android.app.AlertDialog$Builder(Context)>
	//   21   46:ldc2            #280 <Int 0x7f0f04c4>
	//   22   49:invokevirtual   #283 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//   23   52:aload_0         
	//   24   53:ldc2            #284 <Int 0x7f0f04c7>
	//   25   56:iconst_1        
	//   26   57:anewarray       Object[]
	//   27   60:dup             
	//   28   61:iconst_0        
	//   29   62:aload_1         
	//   30   63:aastore         
	//   31   64:invokevirtual   #290 <Method String getString(int, Object[])>
	//   32   67:invokevirtual   #293 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   33   70:iconst_0        
	//   34   71:invokevirtual   #211 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setCancelable(boolean)>
	//   35   74:ldc2            #294 <Int 0x7f0f093b>
	//   36   77:new             #18  <Class SplashActivity$6>
	//   37   80:dup             
	//   38   81:aload_0         
	//   39   82:aload           4
	//   40   84:aload_1         
	//   41   85:aload_2         
	//   42   86:invokespecial   #297 <Method void SplashActivity$6(SplashActivity, AnalyticsSubsystem, String, String)>
	//   43   89:invokevirtual   #219 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   44   92:new             #16  <Class SplashActivity$5>
	//   45   95:dup             
	//   46   96:aload_0         
	//   47   97:aload_1         
	//   48   98:invokespecial   #299 <Method void SplashActivity$5(SplashActivity, String)>
	//   49  101:invokevirtual   #224 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnDismissListener(android.content.DialogInterface$OnDismissListener)>
	//   50  104:astore_2        
			if(flag)
	//*  51  105:iload_3         
	//*  52  106:ifeq            128
				((android.app.AlertDialog.Builder) (s1)).setNegativeButton(0x7f0f0845, new android.content.DialogInterface.OnClickListener(analyticssubsystem, s) {

					public void onClick(DialogInterface dialoginterface, int i1)
					{
						a.trackNewAppVersionAvailableSkipClicked(b);
					//    0    0:aload_0         
					//    1    1:getfield        #22  <Field AnalyticsSubsystem a>
					//    2    4:aload_0         
					//    3    5:getfield        #24  <Field String b>
					//    4    8:invokevirtual   #36  <Method void AnalyticsSubsystem.trackNewAppVersionAvailableSkipClicked(String)>
						com.irobot.home.SplashActivity.a(c, true);
					//    5   11:aload_0         
					//    6   12:getfield        #20  <Field SplashActivity c>
					//    7   15:iconst_1        
					//    8   16:invokestatic    #39  <Method boolean com.irobot.home.SplashActivity.a(SplashActivity, boolean)>
					//    9   19:pop             
						com.irobot.home.SplashActivity.c(c);
					//   10   20:aload_0         
					//   11   21:getfield        #20  <Field SplashActivity c>
					//   12   24:invokestatic    #42  <Method void com.irobot.home.SplashActivity.c(SplashActivity)>
					//   13   27:return          
					}

					final AnalyticsSubsystem a;
					final String b;
					final SplashActivity c;

			
			{
				c = SplashActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field SplashActivity c>
				a = analyticssubsystem;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field AnalyticsSubsystem a>
				b = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field String b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
				}
);
	//   53  109:aload_2         
	//   54  110:ldc2            #300 <Int 0x7f0f0845>
	//   55  113:new             #20  <Class SplashActivity$7>
	//   56  116:dup             
	//   57  117:aload_0         
	//   58  118:aload           4
	//   59  120:aload_1         
	//   60  121:invokespecial   #303 <Method void SplashActivity$7(SplashActivity, AnalyticsSubsystem, String)>
	//   61  124:invokevirtual   #306 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   62  127:pop             
			d = ((android.app.AlertDialog.Builder) (s1)).show();
	//   63  128:aload_0         
	//   64  129:aload_2         
	//   65  130:invokevirtual   #308 <Method AlertDialog android.app.AlertDialog$Builder.show()>
	//   66  133:putfield        #64  <Field AlertDialog d>
		}
	//   67  136:return          
	}

	protected void e()
	{
		boolean flag;
		boolean flag1;
		boolean flag2;
		boolean flag3;
		Object obj;
		obj = ((Object) (getIntent().getStringExtra("push_notification_screen_id")));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #312 <Method Intent getIntent()>
	//    2    4:ldc2            #314 <String "push_notification_screen_id">
	//    3    7:invokevirtual   #320 <Method String Intent.getStringExtra(String)>
	//    4   10:astore          5
		if(!TextUtils.isEmpty(((CharSequence) (obj))))
	//*   5   12:aload           5
	//*   6   14:invokestatic    #326 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   17:ifne            56
		{
			obj = ((Object) (new Intent(((Context) (this)), t.a(((String) (obj))))));
	//    8   20:new             #316 <Class Intent>
	//    9   23:dup             
	//   10   24:aload_0         
	//   11   25:aload           5
	//   12   27:invokestatic    #331 <Method Class t.a(String)>
	//   13   30:invokespecial   #334 <Method void Intent(Context, Class)>
	//   14   33:astore          5
			((Intent) (obj)).putExtras(getIntent());
	//   15   35:aload           5
	//   16   37:aload_0         
	//   17   38:invokevirtual   #312 <Method Intent getIntent()>
	//   18   41:invokevirtual   #338 <Method Intent Intent.putExtras(Intent)>
	//   19   44:pop             
			startActivity(((Intent) (obj)));
	//   20   45:aload_0         
	//   21   46:aload           5
	//   22   48:invokevirtual   #342 <Method void startActivity(Intent)>
			finish();
	//   23   51:aload_0         
	//   24   52:invokevirtual   #345 <Method void finish()>
			return;
	//   25   55:return          
		}
		if(com.irobot.home.util.j.i())
	//*  26   56:invokestatic    #347 <Method boolean j.i()>
	//*  27   59:ifeq            70
			obj = ((Object) (com.irobot.home.util.j.j()));
	//   28   62:invokestatic    #350 <Method a j.j()>
	//   29   65:astore          5
		else
	//*  30   67:goto            73
			obj = null;
	//   31   70:aconst_null     
	//   32   71:astore          5
		flag2 = ((Boolean)b.h().a()).booleanValue();
	//   33   73:aload_0         
	//   34   74:getfield        #352 <Field k b>
	//   35   77:invokevirtual   #357 <Method d k.h()>
	//   36   80:invokevirtual   #361 <Method Object d.a()>
	//   37   83:checkcast       #363 <Class Boolean>
	//   38   86:invokevirtual   #366 <Method boolean Boolean.booleanValue()>
	//   39   89:istore_3        
		if(((Integer)b.i().a()).intValue() != 8)
	//*  40   90:aload_0         
	//*  41   91:getfield        #352 <Field k b>
	//*  42   94:invokevirtual   #369 <Method g k.i()>
	//*  43   97:invokevirtual   #372 <Method Object g.a()>
	//*  44  100:checkcast       #374 <Class Integer>
	//*  45  103:invokevirtual   #378 <Method int Integer.intValue()>
	//*  46  106:bipush          8
	//*  47  108:icmpeq          116
			flag = true;
	//   48  111:iconst_1        
	//   49  112:istore_1        
		else
	//*  50  113:goto            118
			flag = false;
	//   51  116:iconst_0        
	//   52  117:istore_1        
		if(flag2 && (!flag2 || !flag))
	//*  53  118:iload_3         
	//*  54  119:ifeq            138
	//*  55  122:iload_3         
	//*  56  123:ifeq            133
	//*  57  126:iload_1         
	//*  58  127:ifeq            133
	//*  59  130:goto            138
			flag1 = false;
	//   60  133:iconst_0        
	//   61  134:istore_2        
		else
	//*  62  135:goto            140
			flag1 = true;
	//   63  138:iconst_1        
	//   64  139:istore_2        
		flag3 = Assembler.getInstance().getAccountService().hasLoggedInBefore();
	//   65  140:invokestatic    #76  <Method Assembler Assembler.getInstance()>
	//   66  143:invokevirtual   #382 <Method AccountService Assembler.getAccountService()>
	//   67  146:invokevirtual   #387 <Method boolean AccountService.hasLoggedInBefore()>
	//   68  149:istore          4
		if(obj == null) goto _L2; else goto _L1
	//   69  151:aload           5
	//   70  153:ifnull          228
_L1:
		if(!flag1 || flag3) goto _L4; else goto _L3
	//   71  156:iload_2         
	//   72  157:ifeq            221
	//   73  160:iload           4
	//   74  162:ifne            221
_L3:
		if(!flag2)
	//*  75  165:iload_3         
	//*  76  166:ifne            182
		{
			obj = ((Object) (com.irobot.home.AppWelcomeActivity_.a(((Context) (this))).a(true)));
	//   77  169:aload_0         
	//   78  170:invokestatic    #392 <Method AppWelcomeActivity_$a com.irobot.home.AppWelcomeActivity_.a(Context)>
	//   79  173:iconst_1        
	//   80  174:invokevirtual   #397 <Method AppWelcomeActivity_$a com.irobot.home.AppWelcomeActivity_$a.a(boolean)>
	//   81  177:astore          5
			break MISSING_BLOCK_LABEL_275;
	//   82  179:goto            275
		}
		((com.irobot.home.util.k.a)b.a().h().a(false)).n();
	//   83  182:aload_0         
	//   84  183:getfield        #352 <Field k b>
	//   85  186:invokevirtual   #400 <Method com.irobot.home.util.k$a k.a()>
	//   86  189:invokevirtual   #405 <Method c com.irobot.home.util.k$a.h()>
	//   87  192:iconst_0        
	//   88  193:invokevirtual   #410 <Method org.androidannotations.api.b.e c.a(boolean)>
	//   89  196:checkcast       #402 <Class com.irobot.home.util.k$a>
	//   90  199:invokevirtual   #412 <Method void com.irobot.home.util.k$a.n()>
		obj = ((Object) (com.irobot.home.CreateAccountOrLoginActivity_.a(((Context) (this))).a(true)));
	//   91  202:aload_0         
	//   92  203:invokestatic    #417 <Method CreateAccountOrLoginActivity_$a com.irobot.home.CreateAccountOrLoginActivity_.a(Context)>
	//   93  206:iconst_1        
	//   94  207:invokevirtual   #422 <Method CreateAccountOrLoginActivity_$a com.irobot.home.CreateAccountOrLoginActivity_$a.a(boolean)>
	//   95  210:astore          5
_L6:
		((CreateAccountOrLoginActivity_.a) (obj)).a();
	//   96  212:aload           5
	//   97  214:invokevirtual   #425 <Method org.androidannotations.api.a.e com.irobot.home.CreateAccountOrLoginActivity_$a.a()>
	//   98  217:pop             
		break MISSING_BLOCK_LABEL_281;
	//   99  218:goto            281
_L4:
		com.irobot.home.util.j.a(((android.app.Activity) (this)));
	//  100  221:aload_0         
	//  101  222:invokestatic    #428 <Method void j.a(android.app.Activity)>
		break MISSING_BLOCK_LABEL_281;
	//  102  225:goto            281
_L2:
		if(!flag2)
			break; /* Loop/switch isn't completed */
	//  103  228:iload_3         
	//  104  229:ifeq            265
		if(flag && !flag3)
	//* 105  232:iload_1         
	//* 106  233:ifeq            254
	//* 107  236:iload           4
	//* 108  238:ifne            254
		{
			obj = ((Object) (com.irobot.home.CreateAccountOrLoginActivity_.a(((Context) (this))).a(false)));
	//  109  241:aload_0         
	//  110  242:invokestatic    #417 <Method CreateAccountOrLoginActivity_$a com.irobot.home.CreateAccountOrLoginActivity_.a(Context)>
	//  111  245:iconst_0        
	//  112  246:invokevirtual   #422 <Method CreateAccountOrLoginActivity_$a com.irobot.home.CreateAccountOrLoginActivity_$a.a(boolean)>
	//  113  249:astore          5
		} else
	//* 114  251:goto            212
		{
			com.irobot.home.SelectRobotTypeActivity_.a(((Context) (this))).a();
	//  115  254:aload_0         
	//  116  255:invokestatic    #433 <Method SelectRobotTypeActivity_$a com.irobot.home.SelectRobotTypeActivity_.a(Context)>
	//  117  258:invokevirtual   #436 <Method org.androidannotations.api.a.e com.irobot.home.SelectRobotTypeActivity_$a.a()>
	//  118  261:pop             
			break MISSING_BLOCK_LABEL_281;
	//  119  262:goto            281
		}
		if(true) goto _L6; else goto _L5
_L5:
		obj = ((Object) (com.irobot.home.AppWelcomeActivity_.a(((Context) (this))).a(false)));
	//  120  265:aload_0         
	//  121  266:invokestatic    #392 <Method AppWelcomeActivity_$a com.irobot.home.AppWelcomeActivity_.a(Context)>
	//  122  269:iconst_0        
	//  123  270:invokevirtual   #397 <Method AppWelcomeActivity_$a com.irobot.home.AppWelcomeActivity_$a.a(boolean)>
	//  124  273:astore          5
		((AppWelcomeActivity_.a) (obj)).a();
	//  125  275:aload           5
	//  126  277:invokevirtual   #437 <Method org.androidannotations.api.a.e com.irobot.home.AppWelcomeActivity_$a.a()>
	//  127  280:pop             
		finish();
	//  128  281:aload_0         
	//  129  282:invokevirtual   #345 <Method void finish()>
		return;
	//  130  285:return          
	}

	protected void f()
	{
		String s = com.irobot.home.util.j.b(((Context) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #440 <Method String j.b(Context)>
	//    2    4:astore_2        
		int i1 = s.indexOf("-");
	//    3    5:aload_2         
	//    4    6:ldc2            #442 <String "-">
	//    5    9:invokevirtual   #448 <Method int String.indexOf(String)>
	//    6   12:istore_1        
		if(i1 != -1)
	//*   7   13:iload_1         
	//*   8   14:iconst_m1       
	//*   9   15:icmpne          21
	//*  10   18:goto            28
			s = s.substring(0, i1);
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:iload_1         
	//   14   24:invokevirtual   #452 <Method String String.substring(int, int)>
	//   15   27:astore_2        
		ApplicationUIServiceData applicationuiservicedata = ApplicationUIServiceData.create();
	//   16   28:invokestatic    #105 <Method ApplicationUIServiceData ApplicationUIServiceData.create()>
	//   17   31:astore_3        
		applicationuiservicedata.setAppDownloadUrl(com.irobot.home.util.j.k(((Context) (this))));
	//   18   32:aload_3         
	//   19   33:aload_0         
	//   20   34:invokestatic    #454 <Method String j.k(Context)>
	//   21   37:invokevirtual   #457 <Method void ApplicationUIServiceData.setAppDownloadUrl(String)>
		applicationuiservicedata.setApplicationVersion(s);
	//   22   40:aload_3         
	//   23   41:aload_2         
	//   24   42:invokevirtual   #460 <Method void ApplicationUIServiceData.setApplicationVersion(String)>
		l.sendCommand(ApplicationUIServiceCommand.UpdateApplicationData, applicationuiservicedata);
	//   25   45:aload_0         
	//   26   46:getfield        #82  <Field ApplicationUIService l>
	//   27   49:getstatic       #463 <Field ApplicationUIServiceCommand ApplicationUIServiceCommand.UpdateApplicationData>
	//   28   52:aload_3         
	//   29   53:invokevirtual   #120 <Method void ApplicationUIService.sendCommand(ApplicationUIServiceCommand, ApplicationUIServiceData)>
		Assembler.getInstance().getTimeService().queryNtpTime();
	//   30   56:invokestatic    #76  <Method Assembler Assembler.getInstance()>
	//   31   59:invokevirtual   #467 <Method TimeService Assembler.getTimeService()>
	//   32   62:invokevirtual   #472 <Method void TimeService.queryNtpTime()>
		j();
	//   33   65:aload_0         
	//   34   66:invokespecial   #474 <Method void j()>
	//   35   69:return          
	}

	protected void g()
	{
		String s = com.irobot.home.util.j.a(((Context) (this)), false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #477 <Method String j.a(Context, boolean)>
	//    3    5:astore_1        
		if(s.equals("country_not_set"))
	//*   4    6:aload_1         
	//*   5    7:ldc2            #479 <String "country_not_set">
	//*   6   10:invokevirtual   #482 <Method boolean String.equals(Object)>
	//*   7   13:ifeq            22
		{
			i = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #66  <Field boolean i>
			return;
	//   11   21:return          
		}
		if(!i)
	//*  12   22:aload_0         
	//*  13   23:getfield        #66  <Field boolean i>
	//*  14   26:ifne            64
		{
			ApplicationUIServiceData applicationuiservicedata = ApplicationUIServiceData.create();
	//   15   29:invokestatic    #105 <Method ApplicationUIServiceData ApplicationUIServiceData.create()>
	//   16   32:astore_2        
			applicationuiservicedata.setCountryCode(s);
	//   17   33:aload_2         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #485 <Method void ApplicationUIServiceData.setCountryCode(String)>
			l.sendCommand(ApplicationUIServiceCommand.RequestLatestAppVersion, applicationuiservicedata);
	//   20   38:aload_0         
	//   21   39:getfield        #82  <Field ApplicationUIService l>
	//   22   42:getstatic       #488 <Field ApplicationUIServiceCommand ApplicationUIServiceCommand.RequestLatestAppVersion>
	//   23   45:aload_2         
	//   24   46:invokevirtual   #120 <Method void ApplicationUIService.sendCommand(ApplicationUIServiceCommand, ApplicationUIServiceData)>
			n.postDelayed(f, 5000L);
	//   25   49:aload_0         
	//   26   50:getfield        #92  <Field Handler n>
	//   27   53:aload_0         
	//   28   54:getfield        #95  <Field Runnable f>
	//   29   57:ldc2w           #489 <Long 5000L>
	//   30   60:invokevirtual   #138 <Method boolean Handler.postDelayed(Runnable, long)>
	//   31   63:pop             
		}
	//   32   64:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #494 <Method void BasePushNotificationActivity.onCreate(Bundle)>
		getWindow().getDecorView().setSystemUiVisibility(6);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #498 <Method Window getWindow()>
	//    5    9:invokevirtual   #504 <Method View Window.getDecorView()>
	//    6   12:bipush          6
	//    7   14:invokevirtual   #510 <Method void View.setSystemUiVisibility(int)>
		bundle = ((Bundle) (AnalyticsSubsystem.getInstance()));
	//    8   17:invokestatic    #183 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    9   20:astore_1        
		((AnalyticsSubsystem) (bundle)).trackAppLanguageCode(com.irobot.home.util.j.f(((Context) (this))));
	//   10   21:aload_1         
	//   11   22:aload_0         
	//   12   23:invokestatic    #512 <Method String j.f(Context)>
	//   13   26:invokevirtual   #515 <Method void AnalyticsSubsystem.trackAppLanguageCode(String)>
		boolean flag;
		if(a.h().b() > 0)
	//*  14   29:aload_0         
	//*  15   30:getfield        #140 <Field IRobotApplication a>
	//*  16   33:invokevirtual   #145 <Method IRobotModel IRobotApplication.h()>
	//*  17   36:invokevirtual   #517 <Method int IRobotModel.b()>
	//*  18   39:ifle            47
			flag = true;
	//   19   42:iconst_1        
	//   20   43:istore_2        
		else
	//*  21   44:goto            49
			flag = false;
	//   22   47:iconst_0        
	//   23   48:istore_2        
		((AnalyticsSubsystem) (bundle)).trackIsLegacyUser(flag);
	//   24   49:aload_1         
	//   25   50:iload_2         
	//   26   51:invokevirtual   #521 <Method void AnalyticsSubsystem.trackIsLegacyUser(boolean)>
	//   27   54:return          
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #524 <Method void BasePushNotificationActivity.onPause()>
		if(c != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #62  <Field AlertDialog c>
	//*   4    8:ifnull          18
			c.dismiss();
	//    5   11:aload_0         
	//    6   12:getfield        #62  <Field AlertDialog c>
	//    7   15:invokevirtual   #527 <Method void AlertDialog.dismiss()>
		if(d != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #64  <Field AlertDialog d>
	//*  10   22:ifnull          32
			d.dismiss();
	//   11   25:aload_0         
	//   12   26:getfield        #64  <Field AlertDialog d>
	//   13   29:invokevirtual   #527 <Method void AlertDialog.dismiss()>
		h.removeCallbacks(e);
	//   14   32:aload_0         
	//   15   33:getfield        #60  <Field Handler h>
	//   16   36:aload_0         
	//   17   37:getfield        #90  <Field Runnable e>
	//   18   40:invokevirtual   #132 <Method void Handler.removeCallbacks(Runnable)>
		n.removeCallbacks(f);
	//   19   43:aload_0         
	//   20   44:getfield        #92  <Field Handler n>
	//   21   47:aload_0         
	//   22   48:getfield        #95  <Field Runnable f>
	//   23   51:invokevirtual   #132 <Method void Handler.removeCallbacks(Runnable)>
		WifiStateReceiver.a().b(((com.irobot.home.util.WifiStateReceiver.a) (this)));
	//   24   54:invokestatic    #532 <Method WifiStateReceiver WifiStateReceiver.a()>
	//   25   57:aload_0         
	//   26   58:invokevirtual   #535 <Method boolean WifiStateReceiver.b(com.irobot.home.util.WifiStateReceiver$a)>
	//   27   61:pop             
	//   28   62:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #538 <Method void BasePushNotificationActivity.onResume()>
		WifiStateReceiver.a().a(((com.irobot.home.util.WifiStateReceiver.a) (this)));
	//    2    4:invokestatic    #532 <Method WifiStateReceiver WifiStateReceiver.a()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #540 <Method boolean WifiStateReceiver.a(com.irobot.home.util.WifiStateReceiver$a)>
	//    5   11:pop             
		k = com.irobot.home.util.j.e(((Context) (this)));
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:invokestatic    #543 <Method boolean j.e(Context)>
	//    9   17:putfield        #70  <Field boolean k>
		boolean flag1 = k ^ true;
	//   10   20:aload_0         
	//   11   21:getfield        #70  <Field boolean k>
	//   12   24:iconst_1        
	//   13   25:ixor            
	//   14   26:istore_2        
		boolean flag = flag1;
	//   15   27:iload_2         
	//   16   28:istore_1        
		if(k)
	//*  17   29:aload_0         
	//*  18   30:getfield        #70  <Field boolean k>
	//*  19   33:ifeq            147
		{
			WifiManager wifimanager = (WifiManager)getApplicationContext().getSystemService("wifi");
	//   20   36:aload_0         
	//   21   37:invokevirtual   #547 <Method Context getApplicationContext()>
	//   22   40:ldc2            #549 <String "wifi">
	//   23   43:invokevirtual   #555 <Method Object Context.getSystemService(String)>
	//   24   46:checkcast       #557 <Class WifiManager>
	//   25   49:astore_3        
			WifiInfo wifiinfo = wifimanager.getConnectionInfo();
	//   26   50:aload_3         
	//   27   51:invokevirtual   #561 <Method WifiInfo WifiManager.getConnectionInfo()>
	//   28   54:astore          4
			flag = flag1;
	//   29   56:iload_2         
	//   30   57:istore_1        
			if(wifimanager.disconnect())
	//*  31   58:aload_3         
	//*  32   59:invokevirtual   #564 <Method boolean WifiManager.disconnect()>
	//*  33   62:ifeq            147
			{
				o.b(g, "onResume: Disconnected from robot SoftAP...");
	//   34   65:getstatic       #128 <Field String g>
	//   35   68:ldc2            #566 <String "onResume: Disconnected from robot SoftAP...">
	//   36   71:invokestatic    #271 <Method void o.b(String, String)>
				j = wifimanager.disableNetwork(wifiinfo.getNetworkId());
	//   37   74:aload_0         
	//   38   75:aload_3         
	//   39   76:aload           4
	//   40   78:invokevirtual   #571 <Method int WifiInfo.getNetworkId()>
	//   41   81:invokevirtual   #575 <Method boolean WifiManager.disableNetwork(int)>
	//   42   84:putfield        #68  <Field boolean j>
				if(!j)
	//*  43   87:aload_0         
	//*  44   88:getfield        #68  <Field boolean j>
	//*  45   91:ifne            127
				{
					o.d(g, "onResume: Failed to disable auto-reconnects to robot SoftAP");
	//   46   94:getstatic       #128 <Field String g>
	//   47   97:ldc2            #577 <String "onResume: Failed to disable auto-reconnects to robot SoftAP">
	//   48  100:invokestatic    #579 <Method void o.d(String, String)>
					a(0x7f0f0227, 0x7f0f034b, ((android.content.DialogInterface.OnClickListener) (new ab(((Context) (this))))), false);
	//   49  103:aload_0         
	//   50  104:ldc2            #580 <Int 0x7f0f0227>
	//   51  107:ldc2            #581 <Int 0x7f0f034b>
	//   52  110:new             #583 <Class ab>
	//   53  113:dup             
	//   54  114:aload_0         
	//   55  115:invokespecial   #584 <Method void ab(Context)>
	//   56  118:iconst_0        
	//   57  119:invokevirtual   #586 <Method void a(int, int, android.content.DialogInterface$OnClickListener, boolean)>
					flag = flag1;
	//   58  122:iload_2         
	//   59  123:istore_1        
				} else
	//*  60  124:goto            147
				{
					flag = flag1;
	//   61  127:iload_2         
	//   62  128:istore_1        
					if(!wifimanager.reconnect())
	//*  63  129:aload_3         
	//*  64  130:invokevirtual   #589 <Method boolean WifiManager.reconnect()>
	//*  65  133:ifne            147
					{
						o.d(g, "onResume: Failed to reconnect to a Wi-Fi network");
	//   66  136:getstatic       #128 <Field String g>
	//   67  139:ldc2            #591 <String "onResume: Failed to reconnect to a Wi-Fi network">
	//   68  142:invokestatic    #579 <Method void o.d(String, String)>
						flag = true;
	//   69  145:iconst_1        
	//   70  146:istore_1        
					}
				}
			}
		}
		if(flag)
	//*  71  147:iload_1         
	//*  72  148:ifeq            170
		{
			g();
	//   73  151:aload_0         
	//   74  152:invokevirtual   #593 <Method void g()>
			h.postDelayed(e, 2000L);
	//   75  155:aload_0         
	//   76  156:getfield        #60  <Field Handler h>
	//   77  159:aload_0         
	//   78  160:getfield        #90  <Field Runnable e>
	//   79  163:ldc2w           #133 <Long 2000L>
	//   80  166:invokevirtual   #138 <Method boolean Handler.postDelayed(Runnable, long)>
	//   81  169:pop             
		}
	//   82  170:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #596 <Method void BasePushNotificationActivity.onStart()>
		l.registerUISubscriber(m);
	//    2    4:aload_0         
	//    3    5:getfield        #82  <Field ApplicationUIService l>
	//    4    8:aload_0         
	//    5    9:getfield        #87  <Field ApplicationUIServiceDataCallback m>
	//    6   12:invokevirtual   #600 <Method boolean ApplicationUIService.registerUISubscriber(ApplicationUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #603 <Method void BasePushNotificationActivity.onStop()>
		l.unregisterSubscriber(m);
	//    2    4:aload_0         
	//    3    5:getfield        #82  <Field ApplicationUIService l>
	//    4    8:aload_0         
	//    5    9:getfield        #87  <Field ApplicationUIServiceDataCallback m>
	//    6   12:invokevirtual   #606 <Method boolean ApplicationUIService.unregisterSubscriber(ApplicationUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	private static final String g = "SplashActivity";
	IRobotApplication a;
	k b;
	AlertDialog c;
	AlertDialog d;
	final Runnable e = new Runnable() {

		public void run()
		{
			if(com.irobot.home.SplashActivity.a(a))
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field SplashActivity a>
		//*   2    4:invokestatic    #22  <Method boolean com.irobot.home.SplashActivity.a(SplashActivity)>
		//*   3    7:ifeq            123
			{
				AccountService accountservice = Assembler.getInstance().getAccountService();
		//    4   10:invokestatic    #28  <Method Assembler Assembler.getInstance()>
		//    5   13:invokevirtual   #32  <Method AccountService Assembler.getAccountService()>
		//    6   16:astore_2        
				boolean flag;
				if(accountservice.isAccountProviderInitialized() && a.a.c() == IRobotApplication.a.False)
		//*   7   17:aload_2         
		//*   8   18:invokevirtual   #38  <Method boolean AccountService.isAccountProviderInitialized()>
		//*   9   21:ifeq            45
		//*  10   24:aload_0         
		//*  11   25:getfield        #14  <Field SplashActivity a>
		//*  12   28:getfield        #41  <Field IRobotApplication com.irobot.home.SplashActivity.a>
		//*  13   31:invokevirtual   #47  <Method IRobotApplication$a com.irobot.home.IRobotApplication.c()>
		//*  14   34:getstatic       #53  <Field IRobotApplication$a IRobotApplication$a.False>
		//*  15   37:if_acmpne       45
					flag = true;
		//   16   40:iconst_1        
		//   17   41:istore_1        
				else
		//*  18   42:goto            47
					flag = false;
		//   19   45:iconst_0        
		//   20   46:istore_1        
				if(accountservice.hasLoggedInBefore() && !flag)
		//*  21   47:aload_2         
		//*  22   48:invokevirtual   #56  <Method boolean AccountService.hasLoggedInBefore()>
		//*  23   51:ifeq            115
		//*  24   54:iload_1         
		//*  25   55:ifeq            61
		//*  26   58:goto            115
				{
					if(!com.irobot.home.util.j.a())
		//*  27   61:invokestatic    #60  <Method boolean j.a()>
		//*  28   64:ifne            83
						a.a(0x7f0f04db, 0x7f0f0761, ((android.content.DialogInterface.OnClickListener) (null)), false);
		//   29   67:aload_0         
		//   30   68:getfield        #14  <Field SplashActivity a>
		//   31   71:ldc1            #61  <Int 0x7f0f04db>
		//   32   73:ldc1            #62  <Int 0x7f0f0761>
		//   33   75:aconst_null     
		//   34   76:iconst_0        
		//   35   77:invokevirtual   #65  <Method void com.irobot.home.SplashActivity.a(int, int, android.content.DialogInterface$OnClickListener, boolean)>
					else
		//*  36   80:goto            123
					if(a.a.c() == IRobotApplication.a.True)
		//*  37   83:aload_0         
		//*  38   84:getfield        #14  <Field SplashActivity a>
		//*  39   87:getfield        #41  <Field IRobotApplication com.irobot.home.SplashActivity.a>
		//*  40   90:invokevirtual   #47  <Method IRobotApplication$a com.irobot.home.IRobotApplication.c()>
		//*  41   93:getstatic       #68  <Field IRobotApplication$a IRobotApplication$a.True>
		//*  42   96:if_acmpne       123
						a.a(0x7f0f0430, 0x7f0f0761, ((android.content.DialogInterface.OnClickListener) (null)), true);
		//   43   99:aload_0         
		//   44  100:getfield        #14  <Field SplashActivity a>
		//   45  103:ldc1            #69  <Int 0x7f0f0430>
		//   46  105:ldc1            #62  <Int 0x7f0f0761>
		//   47  107:aconst_null     
		//   48  108:iconst_1        
		//   49  109:invokevirtual   #65  <Method void com.irobot.home.SplashActivity.a(int, int, android.content.DialogInterface$OnClickListener, boolean)>
				} else
		//*  50  112:goto            123
				{
					a.e();
		//   51  115:aload_0         
		//   52  116:getfield        #14  <Field SplashActivity a>
		//   53  119:invokevirtual   #72  <Method void SplashActivity.e()>
					return;
		//   54  122:return          
				}
			}
			SplashActivity.b(a).postDelayed(a.e, 2000L);
		//   55  123:aload_0         
		//   56  124:getfield        #14  <Field SplashActivity a>
		//   57  127:invokestatic    #76  <Method Handler SplashActivity.b(SplashActivity)>
		//   58  130:aload_0         
		//   59  131:getfield        #14  <Field SplashActivity a>
		//   60  134:getfield        #79  <Field Runnable SplashActivity.e>
		//   61  137:ldc2w           #80  <Long 2000L>
		//   62  140:invokevirtual   #87  <Method boolean Handler.postDelayed(Runnable, long)>
		//   63  143:pop             
		//   64  144:return          
		}

		final SplashActivity a;

			
			{
				a = SplashActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SplashActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	final Runnable f = new Runnable() {

		public void run()
		{
			if(a.d == null || !a.d.isShowing())
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field SplashActivity a>
		//*   2    4:getfield        #23  <Field AlertDialog com.irobot.home.SplashActivity.d>
		//*   3    7:ifnull          23
		//*   4   10:aload_0         
		//*   5   11:getfield        #14  <Field SplashActivity a>
		//*   6   14:getfield        #23  <Field AlertDialog com.irobot.home.SplashActivity.d>
		//*   7   17:invokevirtual   #29  <Method boolean AlertDialog.isShowing()>
		//*   8   20:ifne            40
			{
				com.irobot.home.SplashActivity.a(a, true);
		//    9   23:aload_0         
		//   10   24:getfield        #14  <Field SplashActivity a>
		//   11   27:iconst_1        
		//   12   28:invokestatic    #32  <Method boolean com.irobot.home.SplashActivity.a(SplashActivity, boolean)>
		//   13   31:pop             
				o.d(SplashActivity.h(), "App version check request timed out. Skipping...");
		//   14   32:invokestatic    #36  <Method String SplashActivity.h()>
		//   15   35:ldc1            #38  <String "App version check request timed out. Skipping...">
		//   16   37:invokestatic    #43  <Method void o.d(String, String)>
			}
		//   17   40:return          
		}

		final SplashActivity a;

			
			{
				a = SplashActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SplashActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private Handler h;
	private boolean i;
	private boolean j;
	private boolean k;
	private final ApplicationUIService l = Assembler.getInstance().getApplicationUIService();
	private ApplicationUIServiceDataCallback m;
	private Handler n;

	static 
	{
	//    0    0:return          
	}
}
