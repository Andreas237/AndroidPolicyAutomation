// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.irobot.core.ABTestHandler;
import com.irobot.core.ABTestIdentifier;
import com.irobot.core.AccountFlagType;
import com.irobot.core.AccountLoggedInEvent;
import com.irobot.core.AccountLoggedOutEvent;
import com.irobot.core.AccountService;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.ApplicationUIService;
import com.irobot.core.ApplicationUIServiceData;
import com.irobot.core.Assembler;
import com.irobot.core.AssetCapabilityUtils;
import com.irobot.core.AssetCloudConfigEvent;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.CommandTierAgent;
import com.irobot.core.EventType;
import com.irobot.core.NotificationCenterServiceCommand;
import com.irobot.core.NotificationCenterServiceDataState;
import com.irobot.core.NotificationCenterUIService;
import com.irobot.core.NotificationCenterUIServiceData;
import com.irobot.core.NotificationCenterUIServiceDataCallback;
import com.irobot.core.PlatformManager;
import com.irobot.core.SettingType;
import com.irobot.core.SettingsSubsystem;
import com.irobot.core.SettingsUIServiceData;
import com.irobot.core.SettingsUIServiceDataCallback;
import com.irobot.home.aws.authentication.AwsCredentialsService;
import com.irobot.home.fragments.ac;
import com.irobot.home.fragments.ag;
import com.irobot.home.g.e;
import com.irobot.home.model.a;
import com.irobot.home.model.i;
import com.irobot.home.model.rest.TermsInfo;
import com.irobot.home.q.b;
import com.irobot.home.rest.CustomerCareRestClient;
import com.irobot.home.util.j;
import com.irobot.home.util.k;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.androidannotations.api.b.d;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, IRobotApplication, AccountLoginActivity_, LegalTermsActivity_, 
//			BroadcastSetupActivity_

public class BaseCleanActivity extends BaseFragmentActivity
	implements e
{
	private class a extends NotificationCenterUIServiceDataCallback
	{

		public void onNotificationCenterUIServiceDataChanged(NotificationCenterUIServiceData notificationcenteruiservicedata)
		{
			if(notificationcenteruiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       13
			{
				com.irobot.home.util.o.e(BaseCleanActivity.t(), "[HKC] NotificationCenterServiceData was null.");
		//    2    4:invokestatic    #25  <Method String BaseCleanActivity.t()>
		//    3    7:ldc1            #27  <String "[HKC] NotificationCenterServiceData was null.">
		//    4    9:invokestatic    #33  <Method void o.e(String, String)>
				return;
		//    5   12:return          
			}
			Iterator iterator = notificationcenteruiservicedata.getDataStateChangelist().iterator();
		//    6   13:aload_1         
		//    7   14:invokevirtual   #39  <Method ArrayList NotificationCenterUIServiceData.getDataStateChangelist()>
		//    8   17:invokevirtual   #45  <Method Iterator ArrayList.iterator()>
		//    9   20:astore_3        
			do
			{
				if(!iterator.hasNext())
					break;
		//   10   21:aload_3         
		//   11   22:invokeinterface #51  <Method boolean Iterator.hasNext()>
		//   12   27:ifeq            256
				NotificationCenterServiceDataState notificationcenterservicedatastate = (NotificationCenterServiceDataState)iterator.next();
		//   13   30:aload_3         
		//   14   31:invokeinterface #55  <Method Object Iterator.next()>
		//   15   36:checkcast       #57  <Class NotificationCenterServiceDataState>
		//   16   39:astore          4
				static class _cls6
				{

					static final int a[];
					static final int b[];

					static 
					{
						b = new int[NotificationCenterServiceDataState.values().length];
					//    0    0:invokestatic    #19  <Method NotificationCenterServiceDataState[] NotificationCenterServiceDataState.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #21  <Field int[] b>
						try
						{
							b[NotificationCenterServiceDataState.NotificationListUpdated.ordinal()] = 1;
					//    4    9:getstatic       #21  <Field int[] b>
					//    5   12:getstatic       #25  <Field NotificationCenterServiceDataState NotificationCenterServiceDataState.NotificationListUpdated>
					//    6   15:invokevirtual   #29  <Method int NotificationCenterServiceDataState.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #21  <Field int[] b>
					//*  10   23:getstatic       #32  <Field NotificationCenterServiceDataState NotificationCenterServiceDataState.NotificationRequestFailure>
					//*  11   26:invokevirtual   #29  <Method int NotificationCenterServiceDataState.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:getstatic       #21  <Field int[] b>
					//*  15   34:getstatic       #35  <Field NotificationCenterServiceDataState NotificationCenterServiceDataState.Invalid>
					//*  16   37:invokevirtual   #29  <Method int NotificationCenterServiceDataState.ordinal()>
					//*  17   40:iconst_3        
					//*  18   41:iastore         
					//*  19   42:invokestatic    #40  <Method SettingType[] SettingType.values()>
					//*  20   45:arraylength     
					//*  21   46:newarray        int[]
					//*  22   48:putstatic       #42  <Field int[] a>
					//*  23   51:getstatic       #42  <Field int[] a>
					//*  24   54:getstatic       #46  <Field SettingType SettingType.Name>
					//*  25   57:invokevirtual   #47  <Method int SettingType.ordinal()>
					//*  26   60:iconst_1        
					//*  27   61:iastore         
					//*  28   62:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//   29   63:astore_0        
						try
						{
							b[NotificationCenterServiceDataState.NotificationRequestFailure.ordinal()] = 2;
						}
					//*  30   64:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//   31   67:astore_0        
						try
						{
							b[NotificationCenterServiceDataState.Invalid.ordinal()] = 3;
						}
					//*  32   68:goto            31
						catch(NoSuchFieldError nosuchfielderror2) { }
					//   33   71:astore_0        
						a = new int[SettingType.values().length];
						try
						{
							a[SettingType.Name.ordinal()] = 1;
						}
					//*  34   72:goto            42
						catch(NoSuchFieldError nosuchfielderror3) { }
					//   35   75:astore_0        
					//*  36   76:return          
					}
				}

				switch(com.irobot.home._cls6.b[notificationcenterservicedatastate.ordinal()])
		//*  17   41:getstatic       #63  <Field int[] com.irobot.home.BaseCleanActivity$6.b>
		//*  18   44:aload           4
		//*  19   46:invokevirtual   #67  <Method int NotificationCenterServiceDataState.ordinal()>
		//*  20   49:iaload          
				{
		//*  21   50:tableswitch     1 3: default 76
		//		               1 111
		//		               2 90
		//		               3 79
		//*  22   76:goto            21
				case 3: // '\003'
					com.irobot.home.util.o.b(BaseCleanActivity.t(), "[HKC] Invalid notification center service!");
		//   23   79:invokestatic    #25  <Method String BaseCleanActivity.t()>
		//   24   82:ldc1            #69  <String "[HKC] Invalid notification center service!">
		//   25   84:invokestatic    #71  <Method void o.b(String, String)>
					break;

		//*  26   87:goto            21
				case 2: // '\002'
					com.irobot.home.util.o.b(BaseCleanActivity.t(), "[HKC] Failed to receive list of notifications!");
		//   27   90:invokestatic    #25  <Method String BaseCleanActivity.t()>
		//   28   93:ldc1            #73  <String "[HKC] Failed to receive list of notifications!">
		//   29   95:invokestatic    #71  <Method void o.b(String, String)>
					a.i.b();
		//   30   98:aload_0         
		//   31   99:getfield        #12  <Field BaseCleanActivity a>
		//   32  102:getfield        #77  <Field ac com.irobot.home.BaseCleanActivity.i>
		//   33  105:invokevirtual   #81  <Method void ac.b()>
					break;

		//*  34  108:goto            21
				case 1: // '\001'
					String s1 = BaseCleanActivity.t();
		//   35  111:invokestatic    #25  <Method String BaseCleanActivity.t()>
		//   36  114:astore          4
					StringBuilder stringbuilder = new StringBuilder();
		//   37  116:new             #83  <Class StringBuilder>
		//   38  119:dup             
		//   39  120:invokespecial   #84  <Method void StringBuilder()>
		//   40  123:astore          5
					stringbuilder.append("[HKC] Received list of ");
		//   41  125:aload           5
		//   42  127:ldc1            #86  <String "[HKC] Received list of ">
		//   43  129:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
		//   44  132:pop             
					stringbuilder.append(String.valueOf(notificationcenteruiservicedata.getNotificationList().size()));
		//   45  133:aload           5
		//   46  135:aload_1         
		//   47  136:invokevirtual   #93  <Method ArrayList NotificationCenterUIServiceData.getNotificationList()>
		//   48  139:invokevirtual   #96  <Method int ArrayList.size()>
		//   49  142:invokestatic    #102 <Method String String.valueOf(int)>
		//   50  145:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
		//   51  148:pop             
					stringbuilder.append(" notifications successfully");
		//   52  149:aload           5
		//   53  151:ldc1            #104 <String " notifications successfully">
		//   54  153:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
		//   55  156:pop             
					com.irobot.home.util.o.b(s1, stringbuilder.toString());
		//   56  157:aload           4
		//   57  159:aload           5
		//   58  161:invokevirtual   #107 <Method String StringBuilder.toString()>
		//   59  164:invokestatic    #71  <Method void o.b(String, String)>
					com.irobot.home.BaseCleanActivity.a(a, notificationcenteruiservicedata.getUnreadNotifications());
		//   60  167:aload_0         
		//   61  168:getfield        #12  <Field BaseCleanActivity a>
		//   62  171:aload_1         
		//   63  172:invokevirtual   #110 <Method ArrayList NotificationCenterUIServiceData.getUnreadNotifications()>
		//   64  175:invokestatic    #113 <Method ArrayList com.irobot.home.BaseCleanActivity.a(BaseCleanActivity, ArrayList)>
		//   65  178:pop             
					if(com.irobot.home.BaseCleanActivity.a(a) != null)
		//*  66  179:aload_0         
		//*  67  180:getfield        #12  <Field BaseCleanActivity a>
		//*  68  183:invokestatic    #116 <Method ArrayList com.irobot.home.BaseCleanActivity.a(BaseCleanActivity)>
		//*  69  186:ifnull          221
					{
						com.irobot.home.BaseCleanActivity.a(a).addAll(((java.util.Collection) (notificationcenteruiservicedata.getReadNotifications())));
		//   70  189:aload_0         
		//   71  190:getfield        #12  <Field BaseCleanActivity a>
		//   72  193:invokestatic    #116 <Method ArrayList com.irobot.home.BaseCleanActivity.a(BaseCleanActivity)>
		//   73  196:aload_1         
		//   74  197:invokevirtual   #119 <Method ArrayList NotificationCenterUIServiceData.getReadNotifications()>
		//   75  200:invokevirtual   #123 <Method boolean ArrayList.addAll(java.util.Collection)>
		//   76  203:pop             
						a.i.a(com.irobot.home.BaseCleanActivity.a(a));
		//   77  204:aload_0         
		//   78  205:getfield        #12  <Field BaseCleanActivity a>
		//   79  208:getfield        #77  <Field ac com.irobot.home.BaseCleanActivity.i>
		//   80  211:aload_0         
		//   81  212:getfield        #12  <Field BaseCleanActivity a>
		//   82  215:invokestatic    #116 <Method ArrayList com.irobot.home.BaseCleanActivity.a(BaseCleanActivity)>
		//   83  218:invokevirtual   #126 <Method void ac.a(ArrayList)>
					}
					boolean flag;
					if(notificationcenteruiservicedata.getUnreadNotifications() != null && notificationcenteruiservicedata.getUnreadNotifications().size() > 0)
		//*  84  221:aload_1         
		//*  85  222:invokevirtual   #110 <Method ArrayList NotificationCenterUIServiceData.getUnreadNotifications()>
		//*  86  225:ifnull          243
		//*  87  228:aload_1         
		//*  88  229:invokevirtual   #110 <Method ArrayList NotificationCenterUIServiceData.getUnreadNotifications()>
		//*  89  232:invokevirtual   #96  <Method int ArrayList.size()>
		//*  90  235:ifle            243
						flag = true;
		//   91  238:iconst_1        
		//   92  239:istore_2        
					else
		//*  93  240:goto            245
						flag = false;
		//   94  243:iconst_0        
		//   95  244:istore_2        
					com.irobot.home.BaseCleanActivity.a(a, flag);
		//   96  245:aload_0         
		//   97  246:getfield        #12  <Field BaseCleanActivity a>
		//   98  249:iload_2         
		//   99  250:invokestatic    #129 <Method void com.irobot.home.BaseCleanActivity.a(BaseCleanActivity, boolean)>
					break;
				}
			} while(true);
		//* 100  253:goto            21
		//  101  256:return          
		}

		final BaseCleanActivity a;

		private a()
		{
			a = BaseCleanActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field BaseCleanActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void NotificationCenterUIServiceDataCallback()>
		//    5    9:return          
		}

	}


	public BaseCleanActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #78  <Method void BaseFragmentActivity()>
		j = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #80  <String "">
	//    4    7:putfield        #82  <Field String j>
		u = 0;
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:putfield        #84  <Field int u>
		y = true;
	//    8   15:aload_0         
	//    9   16:iconst_1        
	//   10   17:putfield        #86  <Field boolean y>
		z = true;
	//   11   20:aload_0         
	//   12   21:iconst_1        
	//   13   22:putfield        #88  <Field boolean z>
		l = true;
	//   14   25:aload_0         
	//   15   26:iconst_1        
	//   16   27:putfield        #90  <Field boolean l>
	//   17   30:aload_0         
	//   18   31:new             #24  <Class BaseCleanActivity$a>
	//   19   34:dup             
	//   20   35:aload_0         
	//   21   36:aconst_null     
	//   22   37:invokespecial   #93  <Method void BaseCleanActivity$a(BaseCleanActivity, BaseCleanActivity$1)>
	//   23   40:putfield        #95  <Field BaseCleanActivity$a n>
	//   24   43:aload_0         
	//   25   44:new             #8   <Class BaseCleanActivity$1>
	//   26   47:dup             
	//   27   48:aload_0         
	//   28   49:invokespecial   #98  <Method void BaseCleanActivity$1(BaseCleanActivity)>
	//   29   52:putfield        #100 <Field SettingsUIServiceDataCallback C>
		o = new Runnable() {

			public void run()
			{
				if(a.q != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #14  <Field BaseCleanActivity a>
			//*   2    4:getfield        #23  <Field TextView BaseCleanActivity.q>
			//*   3    7:ifnull          24
					a.e(a.j);
			//    4   10:aload_0         
			//    5   11:getfield        #14  <Field BaseCleanActivity a>
			//    6   14:aload_0         
			//    7   15:getfield        #14  <Field BaseCleanActivity a>
			//    8   18:getfield        #27  <Field String com.irobot.home.BaseCleanActivity.j>
			//    9   21:invokevirtual   #31  <Method void com.irobot.home.BaseCleanActivity.e(String)>
			//   10   24:return          
			}

			final BaseCleanActivity a;

			
			{
				a = BaseCleanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field BaseCleanActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   30   55:aload_0         
	//   31   56:new             #18  <Class BaseCleanActivity$4>
	//   32   59:dup             
	//   33   60:aload_0         
	//   34   61:invokespecial   #101 <Method void BaseCleanActivity$4(BaseCleanActivity)>
	//   35   64:putfield        #103 <Field Runnable o>
	//   36   67:return          
	}

	static ArrayList a(BaseCleanActivity basecleanactivity)
	{
		return basecleanactivity.A;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field ArrayList A>
	//    2    4:areturn         
	}

	static ArrayList a(BaseCleanActivity basecleanactivity, ArrayList arraylist)
	{
		basecleanactivity.A = arraylist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #106 <Field ArrayList A>
		return arraylist;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static void a(BaseCleanActivity basecleanactivity, boolean flag)
	{
		basecleanactivity.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #111 <Method void a(boolean)>
	//    3    5:return          
	}

	private void a(boolean flag)
	{
		ImageView imageview = f;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field ImageView f>
	//    2    4:astore_3        
		byte byte0;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            14
			byte0 = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		else
	//*   7   11:goto            17
			byte0 = 8;
	//    8   14:bipush          8
	//    9   16:istore_2        
		imageview.setVisibility(((int) (byte0)));
	//   10   17:aload_3         
	//   11   18:iload_2         
	//   12   19:invokevirtual   #119 <Method void ImageView.setVisibility(int)>
	//   13   22:return          
	}

	static String t()
	{
		return t;
	//    0    0:getstatic       #122 <Field String t>
	//    1    3:areturn         
	}

	private void x()
	{
		m = Assembler.getInstance().getNotificationCenterUIService(com.irobot.home.util.j.j().a().getAssetId());
	//    0    0:aload_0         
	//    1    1:invokestatic    #128 <Method Assembler Assembler.getInstance()>
	//    2    4:invokestatic    #133 <Method a j.j()>
	//    3    7:invokevirtual   #138 <Method AssetInfo a.a()>
	//    4   10:invokevirtual   #144 <Method AssetId AssetInfo.getAssetId()>
	//    5   13:invokevirtual   #148 <Method NotificationCenterUIService Assembler.getNotificationCenterUIService(AssetId)>
	//    6   16:putfield        #150 <Field NotificationCenterUIService m>
		if(i != null)
	//*   7   19:aload_0         
	//*   8   20:getfield        #152 <Field ac i>
	//*   9   23:ifnull          37
			i.a(m);
	//   10   26:aload_0         
	//   11   27:getfield        #152 <Field ac i>
	//   12   30:aload_0         
	//   13   31:getfield        #150 <Field NotificationCenterUIService m>
	//   14   34:invokevirtual   #157 <Method void ac.a(NotificationCenterUIService)>
		if(m != null)
	//*  15   37:aload_0         
	//*  16   38:getfield        #150 <Field NotificationCenterUIService m>
	//*  17   41:ifnull          56
			m.registerUISubscriber(((NotificationCenterUIServiceDataCallback) (n)));
	//   18   44:aload_0         
	//   19   45:getfield        #150 <Field NotificationCenterUIService m>
	//   20   48:aload_0         
	//   21   49:getfield        #95  <Field BaseCleanActivity$a n>
	//   22   52:invokevirtual   #163 <Method boolean NotificationCenterUIService.registerUISubscriber(NotificationCenterUIServiceDataCallback)>
	//   23   55:pop             
		s();
	//   24   56:aload_0         
	//   25   57:invokevirtual   #166 <Method void s()>
	//   26   60:return          
	}

	private int y()
	{
		return e.getWidth() - d.getWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field RelativeLayout e>
	//    2    4:invokevirtual   #174 <Method int RelativeLayout.getWidth()>
	//    3    7:aload_0         
	//    4    8:getfield        #176 <Field ImageView d>
	//    5   11:invokevirtual   #177 <Method int ImageView.getWidth()>
	//    6   14:isub            
	//    7   15:ireturn         
	}

	protected void a(String s1)
	{
		if(B != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #180 <Field SettingsSubsystem B>
	//*   2    4:ifnull          19
			B.unregisterSubscriber(C);
	//    3    7:aload_0         
	//    4    8:getfield        #180 <Field SettingsSubsystem B>
	//    5   11:aload_0         
	//    6   12:getfield        #100 <Field SettingsUIServiceDataCallback C>
	//    7   15:invokevirtual   #186 <Method boolean SettingsSubsystem.unregisterSubscriber(SettingsUIServiceDataCallback)>
	//    8   18:pop             
		B = Assembler.getInstance().getSettingsSubsystem(AssetId.assetIdForString(s1));
	//    9   19:aload_0         
	//   10   20:invokestatic    #128 <Method Assembler Assembler.getInstance()>
	//   11   23:aload_1         
	//   12   24:invokestatic    #192 <Method AssetId AssetId.assetIdForString(String)>
	//   13   27:invokevirtual   #196 <Method SettingsSubsystem Assembler.getSettingsSubsystem(AssetId)>
	//   14   30:putfield        #180 <Field SettingsSubsystem B>
		B.registerUISubscriber(C);
	//   15   33:aload_0         
	//   16   34:getfield        #180 <Field SettingsSubsystem B>
	//   17   37:aload_0         
	//   18   38:getfield        #100 <Field SettingsUIServiceDataCallback C>
	//   19   41:invokevirtual   #198 <Method boolean SettingsSubsystem.registerUISubscriber(SettingsUIServiceDataCallback)>
	//   20   44:pop             
	//   21   45:return          
	}

	protected void b(String s1)
	{
		String s2 = s1;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(!com.irobot.home.util.j.i(s1))
	//*   2    2:aload_1         
	//*   3    3:invokestatic    #201 <Method boolean j.i(String)>
	//*   4    6:ifne            19
			s2 = com.irobot.home.util.j.j().a().getName();
	//    5    9:invokestatic    #133 <Method a j.j()>
	//    6   12:invokevirtual   #138 <Method AssetInfo a.a()>
	//    7   15:invokevirtual   #204 <Method String AssetInfo.getName()>
	//    8   18:astore_2        
		if(com.irobot.home.util.j.i(s2) && !j.equals(((Object) (s2))))
	//*   9   19:aload_2         
	//*  10   20:invokestatic    #201 <Method boolean j.i(String)>
	//*  11   23:ifeq            54
	//*  12   26:aload_0         
	//*  13   27:getfield        #82  <Field String j>
	//*  14   30:aload_2         
	//*  15   31:invokevirtual   #210 <Method boolean String.equals(Object)>
	//*  16   34:ifne            54
		{
			j = s2;
	//   17   37:aload_0         
	//   18   38:aload_2         
	//   19   39:putfield        #82  <Field String j>
			q.post(o);
	//   20   42:aload_0         
	//   21   43:getfield        #214 <Field TextView q>
	//   22   46:aload_0         
	//   23   47:getfield        #103 <Field Runnable o>
	//   24   50:invokevirtual   #220 <Method boolean TextView.post(Runnable)>
	//   25   53:pop             
		}
		m();
	//   26   54:aload_0         
	//   27   55:invokevirtual   #222 <Method void m()>
		h.a();
	//   28   58:aload_0         
	//   29   59:getfield        #224 <Field ag h>
	//   30   62:invokevirtual   #228 <Method void ag.a()>
	//   31   65:return          
	}

	protected void e()
	{
		Assembler assembler = Assembler.getInstance();
	//    0    0:invokestatic    #128 <Method Assembler Assembler.getInstance()>
	//    1    3:astore_1        
		com.irobot.home.util.j.j().a();
	//    2    4:invokestatic    #133 <Method a j.j()>
	//    3    7:invokevirtual   #138 <Method AssetInfo a.a()>
	//    4   10:pop             
		if(c instanceof DrawerLayout)
	//*   5   11:aload_0         
	//*   6   12:getfield        #230 <Field View c>
	//*   7   15:instanceof      #232 <Class DrawerLayout>
	//*   8   18:ifeq            42
		{
			DrawerLayout drawerlayout = (DrawerLayout)c;
	//    9   21:aload_0         
	//   10   22:getfield        #230 <Field View c>
	//   11   25:checkcast       #232 <Class DrawerLayout>
	//   12   28:astore_2        
			drawerlayout.a(new android.support.v4.widget.DrawerLayout.c(drawerlayout) {

				public void onDrawerClosed(View view)
				{
				//    0    0:return          
				}

				public void onDrawerOpened(View view)
				{
					if(a.g(0x800003))
				//*   0    0:aload_0         
				//*   1    1:getfield        #21  <Field DrawerLayout a>
				//*   2    4:ldc1            #28  <Int 0x800003>
				//*   3    6:invokevirtual   #34  <Method boolean DrawerLayout.g(int)>
				//*   4    9:ifeq            18
						AnalyticsSubsystem.getInstance().trackSideMenuView();
				//    5   12:invokestatic    #40  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
				//    6   15:invokevirtual   #43  <Method void AnalyticsSubsystem.trackSideMenuView()>
					if(a.g(0x800005) && b.i != null)
				//*   7   18:aload_0         
				//*   8   19:getfield        #21  <Field DrawerLayout a>
				//*   9   22:ldc1            #44  <Int 0x800005>
				//*  10   24:invokevirtual   #34  <Method boolean DrawerLayout.g(int)>
				//*  11   27:ifeq            50
				//*  12   30:aload_0         
				//*  13   31:getfield        #19  <Field BaseCleanActivity b>
				//*  14   34:getfield        #48  <Field ac com.irobot.home.BaseCleanActivity.i>
				//*  15   37:ifnull          50
						b.i.d();
				//   16   40:aload_0         
				//   17   41:getfield        #19  <Field BaseCleanActivity b>
				//   18   44:getfield        #48  <Field ac com.irobot.home.BaseCleanActivity.i>
				//   19   47:invokevirtual   #53  <Method void ac.d()>
				//   20   50:return          
				}

				public void onDrawerSlide(View view, float f1)
				{
				//    0    0:return          
				}

				public void onDrawerStateChanged(int i1)
				{
				//    0    0:return          
				}

				final DrawerLayout a;
				final BaseCleanActivity b;

			
			{
				b = BaseCleanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BaseCleanActivity b>
				a = drawerlayout;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field DrawerLayout a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   13   29:aload_2         
	//   14   30:new             #10  <Class BaseCleanActivity$2>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:aload_2         
	//   18   36:invokespecial   #235 <Method void BaseCleanActivity$2(BaseCleanActivity, DrawerLayout)>
	//   19   39:invokevirtual   #238 <Method void DrawerLayout.a(android.support.v4.widget.DrawerLayout$c)>
		}
		k = (com.irobot.home.i.a)assembler.getDomainEventBus();
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:invokevirtual   #242 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//   23   47:checkcast       #244 <Class com.irobot.home.i.a>
	//   24   50:putfield        #246 <Field com.irobot.home.i.a k>
		com.irobot.home.util.j.a(com.irobot.home.util.j.B());
	//   25   53:invokestatic    #249 <Method k j.B()>
	//   26   56:invokestatic    #252 <Method void j.a(k)>
		w = ((Boolean)com.irobot.home.util.j.B().j().a()).booleanValue() ^ true;
	//   27   59:aload_0         
	//   28   60:invokestatic    #249 <Method k j.B()>
	//   29   63:invokevirtual   #257 <Method d k.j()>
	//   30   66:invokevirtual   #262 <Method Object d.a()>
	//   31   69:checkcast       #264 <Class Boolean>
	//   32   72:invokevirtual   #268 <Method boolean Boolean.booleanValue()>
	//   33   75:iconst_1        
	//   34   76:ixor            
	//   35   77:putfield        #270 <Field boolean w>
		b = com.irobot.home.util.j.i(((Context) (this)));
	//   36   80:aload_0         
	//   37   81:aload_0         
	//   38   82:invokestatic    #273 <Method CustomerCareRestClient j.i(Context)>
	//   39   85:putfield        #275 <Field CustomerCareRestClient b>
	//   40   88:return          
	}

	public void f()
	{
		try
		{
			Locale locale = Locale.getDefault();
	//    0    0:invokestatic    #283 <Method Locale Locale.getDefault()>
	//    1    3:astore_1        
			v = b.getTermsInfo(com.irobot.home.util.j.a(locale), com.irobot.home.util.j.h(((Context) (this))), "R980020");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #275 <Field CustomerCareRestClient b>
	//    5    9:aload_1         
	//    6   10:invokestatic    #286 <Method String j.a(Locale)>
	//    7   13:aload_0         
	//    8   14:invokestatic    #289 <Method String j.h(Context)>
	//    9   17:ldc2            #291 <String "R980020">
	//   10   20:invokeinterface #297 <Method TermsInfo CustomerCareRestClient.getTermsInfo(String, String, String)>
	//   11   25:putfield        #299 <Field TermsInfo v>
			z = false;
	//   12   28:aload_0         
	//   13   29:iconst_0        
	//   14   30:putfield        #88  <Field boolean z>
			if(g())
	//*  15   33:aload_0         
	//*  16   34:invokevirtual   #301 <Method boolean g()>
	//*  17   37:ifeq            98
			{
				a.a(false);
	//   18   40:aload_0         
	//   19   41:getfield        #303 <Field IRobotApplication a>
	//   20   44:iconst_0        
	//   21   45:invokevirtual   #306 <Method void com.irobot.home.IRobotApplication.a(boolean)>
				if(y)
	//*  22   48:aload_0         
	//*  23   49:getfield        #86  <Field boolean y>
	//*  24   52:ifeq            98
				{
					q();
	//   25   55:aload_0         
	//   26   56:invokevirtual   #308 <Method void q()>
					return;
	//   27   59:return          
				}
			}
		}
		catch(Exception exception)
	//*  28   60:astore_1        
		{
			String s1 = t;
	//   29   61:getstatic       #122 <Field String t>
	//   30   64:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   31   65:new             #310 <Class StringBuilder>
	//   32   68:dup             
	//   33   69:invokespecial   #311 <Method void StringBuilder()>
	//   34   72:astore_3        
			stringbuilder.append("Cannot retrieve TermsInfo: ");
	//   35   73:aload_3         
	//   36   74:ldc2            #313 <String "Cannot retrieve TermsInfo: ">
	//   37   77:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   38   80:pop             
			stringbuilder.append(exception.getMessage());
	//   39   81:aload_3         
	//   40   82:aload_1         
	//   41   83:invokevirtual   #320 <Method String Exception.getMessage()>
	//   42   86:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   43   89:pop             
			com.irobot.home.util.o.e(s1, stringbuilder.toString());
	//   44   90:aload_2         
	//   45   91:aload_3         
	//   46   92:invokevirtual   #323 <Method String StringBuilder.toString()>
	//   47   95:invokestatic    #328 <Method void o.e(String, String)>
		}
	//   48   98:return          
	}

	protected boolean g()
	{
		return v != null && com.irobot.home.util.j.i(v.version) && !v.version.equals(((Object) (a.e())));
	//    0    0:aload_0         
	//    1    1:getfield        #299 <Field TermsInfo v>
	//    2    4:ifnull          42
	//    3    7:aload_0         
	//    4    8:getfield        #299 <Field TermsInfo v>
	//    5   11:getfield        #333 <Field String TermsInfo.version>
	//    6   14:invokestatic    #201 <Method boolean j.i(String)>
	//    7   17:ifeq            42
	//    8   20:aload_0         
	//    9   21:getfield        #299 <Field TermsInfo v>
	//   10   24:getfield        #333 <Field String TermsInfo.version>
	//   11   27:aload_0         
	//   12   28:getfield        #303 <Field IRobotApplication a>
	//   13   31:invokevirtual   #335 <Method String com.irobot.home.IRobotApplication.e()>
	//   14   34:invokevirtual   #210 <Method boolean String.equals(Object)>
	//   15   37:ifne            42
	//   16   40:iconst_1        
	//   17   41:ireturn         
	//   18   42:iconst_0        
	//   19   43:ireturn         
	}

	protected void h()
	{
		AssetInfo assetinfo = com.irobot.home.util.j.j().a();
	//    0    0:invokestatic    #133 <Method a j.j()>
	//    1    3:invokevirtual   #138 <Method AssetInfo a.a()>
	//    2    6:astore_1        
		if(AssetCapabilityUtils.isAwsEnabledAsset(assetinfo) ^ true)
	//*   3    7:aload_1         
	//*   4    8:invokestatic    #341 <Method boolean AssetCapabilityUtils.isAwsEnabledAsset(AssetInfo)>
	//*   5   11:iconst_1        
	//*   6   12:ixor            
	//*   7   13:ifeq            40
		{
			k.a(((Object) (this)), EventType.AssetCloudConfigEvent);
	//    8   16:aload_0         
	//    9   17:getfield        #246 <Field com.irobot.home.i.a k>
	//   10   20:aload_0         
	//   11   21:getstatic       #347 <Field EventType EventType.AssetCloudConfigEvent>
	//   12   24:invokevirtual   #350 <Method void com.irobot.home.i.a.a(Object, EventType)>
			Assembler.getInstance().getCommandTierAgent(assetinfo.getAssetId()).queryCloudConfig();
	//   13   27:invokestatic    #128 <Method Assembler Assembler.getInstance()>
	//   14   30:aload_1         
	//   15   31:invokevirtual   #144 <Method AssetId AssetInfo.getAssetId()>
	//   16   34:invokevirtual   #354 <Method CommandTierAgent Assembler.getCommandTierAgent(AssetId)>
	//   17   37:invokevirtual   #359 <Method void CommandTierAgent.queryCloudConfig()>
		}
	//   18   40:return          
	}

	protected void i()
	{
		if(m != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field NotificationCenterUIService m>
	//*   2    4:ifnull          19
			m.unregisterSubscriber(((NotificationCenterUIServiceDataCallback) (n)));
	//    3    7:aload_0         
	//    4    8:getfield        #150 <Field NotificationCenterUIService m>
	//    5   11:aload_0         
	//    6   12:getfield        #95  <Field BaseCleanActivity$a n>
	//    7   15:invokevirtual   #361 <Method boolean NotificationCenterUIService.unregisterSubscriber(NotificationCenterUIServiceDataCallback)>
	//    8   18:pop             
		a(false);
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:invokespecial   #111 <Method void a(boolean)>
		x();
	//   12   24:aload_0         
	//   13   25:invokespecial   #363 <Method void x()>
	//   14   28:return          
	}

	public void j()
	{
		if(c instanceof DrawerLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #230 <Field View c>
	//*   2    4:instanceof      #232 <Class DrawerLayout>
	//*   3    7:ifeq            43
		{
			DrawerLayout drawerlayout = (DrawerLayout)c;
	//    4   10:aload_0         
	//    5   11:getfield        #230 <Field View c>
	//    6   14:checkcast       #232 <Class DrawerLayout>
	//    7   17:astore_1        
			if(drawerlayout.g(0x800003))
	//*   8   18:aload_1         
	//*   9   19:ldc2            #364 <Int 0x800003>
	//*  10   22:invokevirtual   #367 <Method boolean DrawerLayout.g(int)>
	//*  11   25:ifeq            36
			{
				drawerlayout.f(0x800003);
	//   12   28:aload_1         
	//   13   29:ldc2            #364 <Int 0x800003>
	//   14   32:invokevirtual   #369 <Method void DrawerLayout.f(int)>
				return;
	//   15   35:return          
			}
			drawerlayout.e(0x800003);
	//   16   36:aload_1         
	//   17   37:ldc2            #364 <Int 0x800003>
	//   18   40:invokevirtual   #371 <Method void DrawerLayout.e(int)>
		}
	//   19   43:return          
	}

	public void k()
	{
		if(c instanceof DrawerLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #230 <Field View c>
	//*   2    4:instanceof      #232 <Class DrawerLayout>
	//*   3    7:ifeq            45
		{
			DrawerLayout drawerlayout = (DrawerLayout)c;
	//    4   10:aload_0         
	//    5   11:getfield        #230 <Field View c>
	//    6   14:checkcast       #232 <Class DrawerLayout>
	//    7   17:astore_1        
			if(drawerlayout.g(0x800005))
	//*   8   18:aload_1         
	//*   9   19:ldc2            #372 <Int 0x800005>
	//*  10   22:invokevirtual   #367 <Method boolean DrawerLayout.g(int)>
	//*  11   25:ifeq            38
				drawerlayout.f(0x800005);
	//   12   28:aload_1         
	//   13   29:ldc2            #372 <Int 0x800005>
	//   14   32:invokevirtual   #369 <Method void DrawerLayout.f(int)>
			else
	//*  15   35:goto            45
				drawerlayout.e(0x800005);
	//   16   38:aload_1         
	//   17   39:ldc2            #372 <Int 0x800005>
	//   18   42:invokevirtual   #371 <Method void DrawerLayout.e(int)>
		}
		if(com.irobot.home.util.j.j() != null)
	//*  19   45:invokestatic    #133 <Method a j.j()>
	//*  20   48:ifnull          70
			AnalyticsSubsystem.getInstance().trackNotificationCenterBellIconPressed(com.irobot.home.util.j.j().a(), f.isShown());
	//   21   51:invokestatic    #377 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   22   54:invokestatic    #133 <Method a j.j()>
	//   23   57:invokevirtual   #138 <Method AssetInfo a.a()>
	//   24   60:aload_0         
	//   25   61:getfield        #113 <Field ImageView f>
	//   26   64:invokevirtual   #380 <Method boolean ImageView.isShown()>
	//   27   67:invokevirtual   #384 <Method void AnalyticsSubsystem.trackNotificationCenterBellIconPressed(AssetInfo, boolean)>
	//   28   70:return          
	}

	public boolean l()
	{
		return e.getWidth() <= 0 || d.getWidth() <= 0 || u != y();
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field RelativeLayout e>
	//    2    4:invokevirtual   #174 <Method int RelativeLayout.getWidth()>
	//    3    7:ifle            36
	//    4   10:aload_0         
	//    5   11:getfield        #176 <Field ImageView d>
	//    6   14:invokevirtual   #177 <Method int ImageView.getWidth()>
	//    7   17:ifle            36
	//    8   20:aload_0         
	//    9   21:getfield        #84  <Field int u>
	//   10   24:aload_0         
	//   11   25:invokespecial   #386 <Method int y()>
	//   12   28:icmpeq          34
	//   13   31:goto            36
	//   14   34:iconst_0        
	//   15   35:ireturn         
	//   16   36:iconst_1        
	//   17   37:ireturn         
	}

	public void m()
	{
		if(!l())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #388 <Method boolean l()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			int i1 = y();
	//    4    8:aload_0         
	//    5    9:invokespecial   #386 <Method int y()>
	//    6   12:istore_1        
			u = i1;
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:putfield        #84  <Field int u>
			android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)q.getLayoutParams();
	//   10   18:aload_0         
	//   11   19:getfield        #214 <Field TextView q>
	//   12   22:invokevirtual   #392 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//   13   25:checkcast       #394 <Class android.widget.LinearLayout$LayoutParams>
	//   14   28:astore_2        
			layoutparams.setMarginStart(i1);
	//   15   29:aload_2         
	//   16   30:iload_1         
	//   17   31:invokevirtual   #397 <Method void android.widget.LinearLayout$LayoutParams.setMarginStart(int)>
			q.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

				public void onGlobalLayout()
				{
					a.q.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BaseCleanActivity a>
				//    2    4:getfield        #25  <Field TextView BaseCleanActivity.q>
				//    3    7:invokevirtual   #31  <Method ViewTreeObserver TextView.getViewTreeObserver()>
				//    4   10:aload_0         
				//    5   11:invokevirtual   #37  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
					a.q.removeCallbacks(a.o);
				//    6   14:aload_0         
				//    7   15:getfield        #17  <Field BaseCleanActivity a>
				//    8   18:getfield        #25  <Field TextView BaseCleanActivity.q>
				//    9   21:aload_0         
				//   10   22:getfield        #17  <Field BaseCleanActivity a>
				//   11   25:getfield        #41  <Field Runnable com.irobot.home.BaseCleanActivity.o>
				//   12   28:invokevirtual   #45  <Method boolean TextView.removeCallbacks(Runnable)>
				//   13   31:pop             
					a.q.post(a.o);
				//   14   32:aload_0         
				//   15   33:getfield        #17  <Field BaseCleanActivity a>
				//   16   36:getfield        #25  <Field TextView BaseCleanActivity.q>
				//   17   39:aload_0         
				//   18   40:getfield        #17  <Field BaseCleanActivity a>
				//   19   43:getfield        #41  <Field Runnable com.irobot.home.BaseCleanActivity.o>
				//   20   46:invokevirtual   #48  <Method boolean TextView.post(Runnable)>
				//   21   49:pop             
				//   22   50:return          
				}

				final BaseCleanActivity a;

			
			{
				a = BaseCleanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BaseCleanActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   18   34:aload_0         
	//   19   35:getfield        #214 <Field TextView q>
	//   20   38:invokevirtual   #401 <Method ViewTreeObserver TextView.getViewTreeObserver()>
	//   21   41:new             #20  <Class BaseCleanActivity$5>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:invokespecial   #402 <Method void BaseCleanActivity$5(BaseCleanActivity)>
	//   25   49:invokevirtual   #408 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			q.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   26   52:aload_0         
	//   27   53:getfield        #214 <Field TextView q>
	//   28   56:aload_2         
	//   29   57:invokevirtual   #412 <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			return;
	//   30   60:return          
		}
	}

	protected boolean n()
	{
		if(c instanceof DrawerLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #230 <Field View c>
	//*   2    4:instanceof      #232 <Class DrawerLayout>
	//*   3    7:ifeq            37
		{
			DrawerLayout drawerlayout = (DrawerLayout)c;
	//    4   10:aload_0         
	//    5   11:getfield        #230 <Field View c>
	//    6   14:checkcast       #232 <Class DrawerLayout>
	//    7   17:astore_1        
			if(drawerlayout.g(0x800003))
	//*   8   18:aload_1         
	//*   9   19:ldc2            #364 <Int 0x800003>
	//*  10   22:invokevirtual   #367 <Method boolean DrawerLayout.g(int)>
	//*  11   25:ifeq            37
			{
				drawerlayout.f(0x800003);
	//   12   28:aload_1         
	//   13   29:ldc2            #364 <Int 0x800003>
	//   14   32:invokevirtual   #369 <Method void DrawerLayout.f(int)>
				return true;
	//   15   35:iconst_1        
	//   16   36:ireturn         
			}
		}
		return false;
	//   17   37:iconst_0        
	//   18   38:ireturn         
	}

	protected boolean o()
	{
		if(c instanceof DrawerLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #230 <Field View c>
	//*   2    4:instanceof      #232 <Class DrawerLayout>
	//*   3    7:ifeq            56
		{
			DrawerLayout drawerlayout = (DrawerLayout)c;
	//    4   10:aload_0         
	//    5   11:getfield        #230 <Field View c>
	//    6   14:checkcast       #232 <Class DrawerLayout>
	//    7   17:astore_1        
			if(drawerlayout.g(0x800003))
	//*   8   18:aload_1         
	//*   9   19:ldc2            #364 <Int 0x800003>
	//*  10   22:invokevirtual   #367 <Method boolean DrawerLayout.g(int)>
	//*  11   25:ifeq            37
			{
				drawerlayout.f(0x800003);
	//   12   28:aload_1         
	//   13   29:ldc2            #364 <Int 0x800003>
	//   14   32:invokevirtual   #369 <Method void DrawerLayout.f(int)>
				return true;
	//   15   35:iconst_1        
	//   16   36:ireturn         
			}
			if(drawerlayout.g(0x800005))
	//*  17   37:aload_1         
	//*  18   38:ldc2            #372 <Int 0x800005>
	//*  19   41:invokevirtual   #367 <Method boolean DrawerLayout.g(int)>
	//*  20   44:ifeq            56
			{
				drawerlayout.f(0x800005);
	//   21   47:aload_1         
	//   22   48:ldc2            #372 <Int 0x800005>
	//   23   51:invokevirtual   #369 <Method void DrawerLayout.f(int)>
				return true;
	//   24   54:iconst_1        
	//   25   55:ireturn         
			}
		}
		return false;
	//   26   56:iconst_0        
	//   27   57:ireturn         
	}

	public void onAccountLoggedInEvent(AccountLoggedInEvent accountloggedinevent)
	{
		com.irobot.home.util.o.b(t, "AccountLoggedInEvent received");
	//    0    0:getstatic       #122 <Field String t>
	//    1    3:ldc2            #417 <String "AccountLoggedInEvent received">
	//    2    6:invokestatic    #419 <Method void o.b(String, String)>
		p();
	//    3    9:aload_0         
	//    4   10:invokevirtual   #422 <Method void p()>
		accountloggedinevent = ((AccountLoggedInEvent) (com.irobot.home.util.j.k().getId()));
	//    5   13:invokestatic    #424 <Method AssetId j.k()>
	//    6   16:invokevirtual   #427 <Method String AssetId.getId()>
	//    7   19:astore_1        
		if(a.d(((String) (accountloggedinevent))))
	//*   8   20:aload_0         
	//*   9   21:getfield        #303 <Field IRobotApplication a>
	//*  10   24:aload_1         
	//*  11   25:invokevirtual   #429 <Method boolean com.irobot.home.IRobotApplication.d(String)>
	//*  12   28:ifeq            39
			a.c(((String) (accountloggedinevent)));
	//   13   31:aload_0         
	//   14   32:getfield        #303 <Field IRobotApplication a>
	//   15   35:aload_1         
	//   16   36:invokevirtual   #431 <Method void IRobotApplication.c(String)>
	//   17   39:return          
	}

	public void onAccountLoggedOutEvent(AccountLoggedOutEvent accountloggedoutevent)
	{
		com.irobot.home.util.o.b(t, "AccountLoggedOutEvent received");
	//    0    0:getstatic       #122 <Field String t>
	//    1    3:ldc2            #436 <String "AccountLoggedOutEvent received">
	//    2    6:invokestatic    #419 <Method void o.b(String, String)>
		o();
	//    3    9:aload_0         
	//    4   10:invokevirtual   #438 <Method boolean o()>
	//    5   13:pop             
		r.d(com.irobot.home.util.j.k().getId());
	//    6   14:aload_0         
	//    7   15:getfield        #442 <Field b r>
	//    8   18:invokestatic    #424 <Method AssetId j.k()>
	//    9   21:invokevirtual   #427 <Method String AssetId.getId()>
	//   10   24:invokevirtual   #446 <Method void b.d(String)>
		com.irobot.home.util.j.a(((android.app.Activity) (this)), com.irobot.home.AccountLoginActivity_.a(((Context) (this))).b());
	//   11   27:aload_0         
	//   12   28:aload_0         
	//   13   29:invokestatic    #451 <Method AccountLoginActivity_$a com.irobot.home.AccountLoginActivity_.a(Context)>
	//   14   32:invokevirtual   #456 <Method Intent com.irobot.home.AccountLoginActivity_$a.b()>
	//   15   35:invokestatic    #459 <Method void j.a(android.app.Activity, Intent)>
	//   16   38:return          
	}

	protected void onActivityResult(int i1, int j1, Intent intent)
	{
		if(i1 == 2 && x != null && x.isVisible() && j1 == -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_2        
	//*   2    2:icmpne          34
	//*   3    5:aload_0         
	//*   4    6:getfield        #463 <Field com.irobot.home.g.d x>
	//*   5    9:ifnull          34
	//*   6   12:aload_0         
	//*   7   13:getfield        #463 <Field com.irobot.home.g.d x>
	//*   8   16:invokevirtual   #468 <Method boolean com.irobot.home.g.d.isVisible()>
	//*   9   19:ifeq            34
	//*  10   22:iload_2         
	//*  11   23:iconst_m1       
	//*  12   24:icmpne          34
			x.dismiss();
	//   13   27:aload_0         
	//   14   28:getfield        #463 <Field com.irobot.home.g.d x>
	//   15   31:invokevirtual   #471 <Method void com.irobot.home.g.d.dismiss()>
		super.onActivityResult(i1, j1, intent);
	//   16   34:aload_0         
	//   17   35:iload_1         
	//   18   36:iload_2         
	//   19   37:aload_3         
	//   20   38:invokespecial   #473 <Method void BaseFragmentActivity.onActivityResult(int, int, Intent)>
	//   21   41:return          
	}

	public void onAssetCloudConfigEvent(AssetCloudConfigEvent assetcloudconfigevent)
	{
		String s1 = assetcloudconfigevent.cloudConfigHost();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #480 <Method String AssetCloudConfigEvent.cloudConfigHost()>
	//    2    4:astore_2        
		assetcloudconfigevent = ((AssetCloudConfigEvent) (assetcloudconfigevent.assetId()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #483 <Method AssetId AssetCloudConfigEvent.assetId()>
	//    5    9:astore_1        
		if(s1 != null && assetcloudconfigevent != null && s1.contains("axeda.com"))
	//*   6   10:aload_2         
	//*   7   11:ifnull          54
	//*   8   14:aload_1         
	//*   9   15:ifnull          54
	//*  10   18:aload_2         
	//*  11   19:ldc2            #485 <String "axeda.com">
	//*  12   22:invokevirtual   #489 <Method boolean String.contains(CharSequence)>
	//*  13   25:ifeq            54
		{
			Handler handler = new Handler(Looper.getMainLooper());
	//   14   28:new             #491 <Class Handler>
	//   15   31:dup             
	//   16   32:invokestatic    #497 <Method Looper Looper.getMainLooper()>
	//   17   35:invokespecial   #500 <Method void Handler(Looper)>
	//   18   38:astore_2        
			handler.post(new Runnable(handler, ((AssetId) (assetcloudconfigevent))) {

				public void run()
				{
					String s2 = com.irobot.home.util.j.j().a().getName();
				//    0    0:invokestatic    #40  <Method a j.j()>
				//    1    3:invokevirtual   #45  <Method AssetInfo a.a()>
				//    2    6:invokevirtual   #51  <Method String AssetInfo.getName()>
				//    3    9:astore_1        
					(new android.app.AlertDialog.Builder(((Context) (c)))).setTitle(0x7f0f0786).setMessage(((CharSequence) (c.getString(0x7f0f019f, new Object[] {
						s2, s2
					})))).setCancelable(false).setPositiveButton(0x7f0f05bb, new android.content.DialogInterface.OnClickListener(this) {

						public void onClick(DialogInterface dialoginterface, int i1)
						{
							a.a.post(new Runnable(this) {

								public void run()
								{
									CommandTierAgent commandtieragent = Assembler.getInstance().getCommandTierAgent(a.a.b);
								//    0    0:invokestatic    #32  <Method Assembler Assembler.getInstance()>
								//    1    3:aload_0         
								//    2    4:getfield        #19  <Field BaseCleanActivity$3$1 a>
								//    3    7:getfield        #35  <Field BaseCleanActivity$3 com.irobot.home.BaseCleanActivity$3$1.a>
								//    4   10:getfield        #39  <Field AssetId com.irobot.home.BaseCleanActivity$3.b>
								//    5   13:invokevirtual   #43  <Method CommandTierAgent Assembler.getCommandTierAgent(AssetId)>
								//    6   16:astore_1        
									try
									{
										com.irobot.home.o.a.a(a.a.b.getId()).a(i.WIPE);
								//    7   17:aload_0         
								//    8   18:getfield        #19  <Field BaseCleanActivity$3$1 a>
								//    9   21:getfield        #35  <Field BaseCleanActivity$3 com.irobot.home.BaseCleanActivity$3$1.a>
								//   10   24:getfield        #39  <Field AssetId com.irobot.home.BaseCleanActivity$3.b>
								//   11   27:invokevirtual   #49  <Method String AssetId.getId()>
								//   12   30:invokestatic    #54  <Method com.irobot.home.o.a com.irobot.home.o.a.a(String)>
								//   13   33:getstatic       #60  <Field i i.WIPE>
								//   14   36:invokevirtual   #63  <Method void com.irobot.home.o.a.a(i)>
									}
								//*  15   39:goto            83
									catch(Exception exception)
								//*  16   42:astore_2        
									{
										String s1 = BaseCleanActivity.t();
								//   17   43:invokestatic    #68  <Method String BaseCleanActivity.t()>
								//   18   46:astore_3        
										StringBuilder stringbuilder = new StringBuilder();
								//   19   47:new             #70  <Class StringBuilder>
								//   20   50:dup             
								//   21   51:invokespecial   #71  <Method void StringBuilder()>
								//   22   54:astore          4
										stringbuilder.append("Error sending wipe command to robot. ");
								//   23   56:aload           4
								//   24   58:ldc1            #73  <String "Error sending wipe command to robot. ">
								//   25   60:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
								//   26   63:pop             
										stringbuilder.append(exception.getMessage());
								//   27   64:aload           4
								//   28   66:aload_2         
								//   29   67:invokevirtual   #80  <Method String Exception.getMessage()>
								//   30   70:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
								//   31   73:pop             
										com.irobot.home.util.o.e(s1, stringbuilder.toString());
								//   32   74:aload_3         
								//   33   75:aload           4
								//   34   77:invokevirtual   #83  <Method String StringBuilder.toString()>
								//   35   80:invokestatic    #89  <Method void o.e(String, String)>
									}
									commandtieragent.resetRobotRemotely();
								//   36   83:aload_1         
								//   37   84:invokevirtual   #94  <Method void CommandTierAgent.resetRobotRemotely()>
									com.irobot.home.util.j.b(a.a.b.getId());
								//   38   87:aload_0         
								//   39   88:getfield        #19  <Field BaseCleanActivity$3$1 a>
								//   40   91:getfield        #35  <Field BaseCleanActivity$3 com.irobot.home.BaseCleanActivity$3$1.a>
								//   41   94:getfield        #39  <Field AssetId com.irobot.home.BaseCleanActivity$3.b>
								//   42   97:invokevirtual   #49  <Method String AssetId.getId()>
								//   43  100:invokestatic    #99  <Method void j.b(String)>
								//   44  103:return          
								}

								final _cls1 a;

			
			{
				a = _pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BaseCleanActivity$3$1 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
							}
);
						//    0    0:aload_0         
						//    1    1:getfield        #19  <Field BaseCleanActivity$3 a>
						//    2    4:getfield        #27  <Field Handler com.irobot.home.BaseCleanActivity$3.a>
						//    3    7:new             #13  <Class BaseCleanActivity$3$1$1>
						//    4   10:dup             
						//    5   11:aload_0         
						//    6   12:invokespecial   #30  <Method void BaseCleanActivity$3$1$1(BaseCleanActivity$3$1)>
						//    7   15:invokevirtual   #36  <Method boolean Handler.post(Runnable)>
						//    8   18:pop             
							com.irobot.home.BroadcastSetupActivity_.a(((Context) (a.c))).a(true).a();
						//    9   19:aload_0         
						//   10   20:getfield        #19  <Field BaseCleanActivity$3 a>
						//   11   23:getfield        #40  <Field BaseCleanActivity BaseCleanActivity$3.c>
						//   12   26:invokestatic    #45  <Method BroadcastSetupActivity_$a com.irobot.home.BroadcastSetupActivity_.a(Context)>
						//   13   29:iconst_1        
						//   14   30:invokevirtual   #50  <Method BroadcastSetupActivity_$a com.irobot.home.BroadcastSetupActivity_$a.a(boolean)>
						//   15   33:invokevirtual   #53  <Method org.androidannotations.api.a.e com.irobot.home.BroadcastSetupActivity_$a.a()>
						//   16   36:pop             
							a.c.finish();
						//   17   37:aload_0         
						//   18   38:getfield        #19  <Field BaseCleanActivity$3 a>
						//   19   41:getfield        #40  <Field BaseCleanActivity BaseCleanActivity$3.c>
						//   20   44:invokevirtual   #58  <Method void BaseCleanActivity.finish()>
						//   21   47:return          
						}

						final _cls3 a;

			
			{
				a = _pcls3;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BaseCleanActivity$3 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
					}
).show();
				//    4   10:new             #53  <Class android.app.AlertDialog$Builder>
				//    5   13:dup             
				//    6   14:aload_0         
				//    7   15:getfield        #25  <Field BaseCleanActivity c>
				//    8   18:invokespecial   #56  <Method void android.app.AlertDialog$Builder(Context)>
				//    9   21:ldc1            #57  <Int 0x7f0f0786>
				//   10   23:invokevirtual   #61  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
				//   11   26:aload_0         
				//   12   27:getfield        #25  <Field BaseCleanActivity c>
				//   13   30:ldc1            #62  <Int 0x7f0f019f>
				//   14   32:iconst_2        
				//   15   33:anewarray       Object[]
				//   16   36:dup             
				//   17   37:iconst_0        
				//   18   38:aload_1         
				//   19   39:aastore         
				//   20   40:dup             
				//   21   41:iconst_1        
				//   22   42:aload_1         
				//   23   43:aastore         
				//   24   44:invokevirtual   #66  <Method String BaseCleanActivity.getString(int, Object[])>
				//   25   47:invokevirtual   #70  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
				//   26   50:iconst_0        
				//   27   51:invokevirtual   #74  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setCancelable(boolean)>
				//   28   54:ldc1            #75  <Int 0x7f0f05bb>
				//   29   56:new             #13  <Class BaseCleanActivity$3$1>
				//   30   59:dup             
				//   31   60:aload_0         
				//   32   61:invokespecial   #78  <Method void BaseCleanActivity$3$1(BaseCleanActivity$3)>
				//   33   64:invokevirtual   #82  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
				//   34   67:invokevirtual   #86  <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
				//   35   70:pop             
				//   36   71:return          
				}

				final Handler a;
				final AssetId b;
				final BaseCleanActivity c;

			
			{
				c = BaseCleanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field BaseCleanActivity c>
				a = handler;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field Handler a>
				b = assetid;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #29  <Field AssetId b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #32  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   19   39:aload_2         
	//   20   40:new             #12  <Class BaseCleanActivity$3>
	//   21   43:dup             
	//   22   44:aload_0         
	//   23   45:aload_2         
	//   24   46:aload_1         
	//   25   47:invokespecial   #503 <Method void BaseCleanActivity$3(BaseCleanActivity, Handler, AssetId)>
	//   26   50:invokevirtual   #504 <Method boolean Handler.post(Runnable)>
	//   27   53:pop             
		}
	//   28   54:return          
	}

	public void onBackPressed()
	{
		if(!o())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #438 <Method boolean o()>
	//*   2    4:ifne            11
			super.onBackPressed();
	//    3    7:aload_0         
	//    4    8:invokespecial   #507 <Method void BaseFragmentActivity.onBackPressed()>
	//    5   11:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #511 <Method void BaseFragmentActivity.onCreate(Bundle)>
		u();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #513 <Method void u()>
	//    5    9:return          
	}

	public void onCreate(Bundle bundle, PersistableBundle persistablebundle)
	{
		super.onCreate(bundle, persistablebundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #516 <Method void BaseFragmentActivity.onCreate(Bundle, PersistableBundle)>
		u();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #513 <Method void u()>
	//    6   10:return          
	}

	protected void onDestroy()
	{
		AnalyticsSubsystem.getInstance().flushMessages();
	//    0    0:invokestatic    #377 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    1    3:invokevirtual   #520 <Method void AnalyticsSubsystem.flushMessages()>
		super.onDestroy();
	//    2    6:aload_0         
	//    3    7:invokespecial   #522 <Method void BaseFragmentActivity.onDestroy()>
	//    4   10:return          
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #525 <Method void BaseFragmentActivity.onPause()>
		k.b(((Object) (this)), EventType.AccountLoggedInEvent);
	//    2    4:aload_0         
	//    3    5:getfield        #246 <Field com.irobot.home.i.a k>
	//    4    8:aload_0         
	//    5    9:getstatic       #528 <Field EventType EventType.AccountLoggedInEvent>
	//    6   12:invokevirtual   #530 <Method void com.irobot.home.i.a.b(Object, EventType)>
		k.b(((Object) (this)), EventType.AccountLoggedOutEvent);
	//    7   15:aload_0         
	//    8   16:getfield        #246 <Field com.irobot.home.i.a k>
	//    9   19:aload_0         
	//   10   20:getstatic       #533 <Field EventType EventType.AccountLoggedOutEvent>
	//   11   23:invokevirtual   #530 <Method void com.irobot.home.i.a.b(Object, EventType)>
		k.b(((Object) (this)), EventType.AssetCloudConfigEvent);
	//   12   26:aload_0         
	//   13   27:getfield        #246 <Field com.irobot.home.i.a k>
	//   14   30:aload_0         
	//   15   31:getstatic       #347 <Field EventType EventType.AssetCloudConfigEvent>
	//   16   34:invokevirtual   #530 <Method void com.irobot.home.i.a.b(Object, EventType)>
		k.b(((Object) (this)), EventType.RobotNameEvent);
	//   17   37:aload_0         
	//   18   38:getfield        #246 <Field com.irobot.home.i.a k>
	//   19   41:aload_0         
	//   20   42:getstatic       #536 <Field EventType EventType.RobotNameEvent>
	//   21   45:invokevirtual   #530 <Method void com.irobot.home.i.a.b(Object, EventType)>
		n();
	//   22   48:aload_0         
	//   23   49:invokevirtual   #538 <Method boolean n()>
	//   24   52:pop             
		y = false;
	//   25   53:aload_0         
	//   26   54:iconst_0        
	//   27   55:putfield        #86  <Field boolean y>
	//   28   58:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #541 <Method void BaseFragmentActivity.onResume()>
		Object obj = ((Object) (Assembler.getInstance().getAccountService()));
	//    2    4:invokestatic    #128 <Method Assembler Assembler.getInstance()>
	//    3    7:invokevirtual   #545 <Method AccountService Assembler.getAccountService()>
	//    4   10:astore_3        
		k.a(((Object) (this)), EventType.AccountLoggedInEvent);
	//    5   11:aload_0         
	//    6   12:getfield        #246 <Field com.irobot.home.i.a k>
	//    7   15:aload_0         
	//    8   16:getstatic       #528 <Field EventType EventType.AccountLoggedInEvent>
	//    9   19:invokevirtual   #350 <Method void com.irobot.home.i.a.a(Object, EventType)>
		k.a(((Object) (this)), EventType.AccountLoggedOutEvent);
	//   10   22:aload_0         
	//   11   23:getfield        #246 <Field com.irobot.home.i.a k>
	//   12   26:aload_0         
	//   13   27:getstatic       #533 <Field EventType EventType.AccountLoggedOutEvent>
	//   14   30:invokevirtual   #350 <Method void com.irobot.home.i.a.a(Object, EventType)>
		if(!((AccountService) (obj)).isLoggedIn())
	//*  15   33:aload_3         
	//*  16   34:invokevirtual   #550 <Method boolean AccountService.isLoggedIn()>
	//*  17   37:ifne            51
			com.irobot.home.util.j.a(((android.app.Activity) (this)), com.irobot.home.AccountLoginActivity_.a(((Context) (this))).b());
	//   18   40:aload_0         
	//   19   41:aload_0         
	//   20   42:invokestatic    #451 <Method AccountLoginActivity_$a com.irobot.home.AccountLoginActivity_.a(Context)>
	//   21   45:invokevirtual   #456 <Method Intent com.irobot.home.AccountLoginActivity_$a.b()>
	//   22   48:invokestatic    #459 <Method void j.a(android.app.Activity, Intent)>
		h();
	//   23   51:aload_0         
	//   24   52:invokevirtual   #552 <Method void h()>
		if(((AccountService) (obj)).isEligibleForBetaProgram())
	//*  25   55:aload_3         
	//*  26   56:invokevirtual   #555 <Method boolean AccountService.isEligibleForBetaProgram()>
	//*  27   59:ifeq            101
		{
			boolean flag = ((AccountService) (obj)).getValueForAccountFlag(AccountFlagType.BetaViewed);
	//   28   62:aload_3         
	//   29   63:getstatic       #561 <Field AccountFlagType AccountFlagType.BetaViewed>
	//   30   66:invokevirtual   #565 <Method boolean AccountService.getValueForAccountFlag(AccountFlagType)>
	//   31   69:istore_2        
			obj = ((Object) (d));
	//   32   70:aload_0         
	//   33   71:getfield        #176 <Field ImageView d>
	//   34   74:astore_3        
			int i1;
			if(flag ^ true)
	//*  35   75:iload_2         
	//*  36   76:iconst_1        
	//*  37   77:ixor            
	//*  38   78:ifeq            88
				i1 = 0x7f08012e;
	//   39   81:ldc2            #566 <Int 0x7f08012e>
	//   40   84:istore_1        
			else
	//*  41   85:goto            92
				i1 = 0x7f08012d;
	//   42   88:ldc2            #567 <Int 0x7f08012d>
	//   43   91:istore_1        
			((ImageView) (obj)).setImageDrawable(android.support.v4.content.a.getDrawable(((Context) (this)), i1));
	//   44   92:aload_3         
	//   45   93:aload_0         
	//   46   94:iload_1         
	//   47   95:invokestatic    #573 <Method android.graphics.drawable.Drawable android.support.v4.content.a.getDrawable(Context, int)>
	//   48   98:invokevirtual   #577 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
		}
		y = true;
	//   49  101:aload_0         
	//   50  102:iconst_1        
	//   51  103:putfield        #86  <Field boolean y>
		if(z)
	//*  52  106:aload_0         
	//*  53  107:getfield        #88  <Field boolean z>
	//*  54  110:ifeq            120
			f();
	//   55  113:aload_0         
	//   56  114:invokevirtual   #579 <Method void f()>
		else
	//*  57  117:goto            131
		if(g())
	//*  58  120:aload_0         
	//*  59  121:invokevirtual   #301 <Method boolean g()>
	//*  60  124:ifeq            131
			q();
	//   61  127:aload_0         
	//   62  128:invokevirtual   #308 <Method void q()>
		if(c instanceof DrawerLayout)
	//*  63  131:aload_0         
	//*  64  132:getfield        #230 <Field View c>
	//*  65  135:instanceof      #232 <Class DrawerLayout>
	//*  66  138:ifeq            233
		{
			DrawerLayout drawerlayout = (DrawerLayout)c;
	//   67  141:aload_0         
	//   68  142:getfield        #230 <Field View c>
	//   69  145:checkcast       #232 <Class DrawerLayout>
	//   70  148:astore_3        
			for(ABTestHandler abtesthandler = Assembler.getInstance().getApplicationUIService().getServiceData().getPlatformManager().getABTestHandler(); getBaseContext().getSharedPreferences("DEVEL", 0).getBoolean("enable_notification_center", false) || abtesthandler.doesUserSatisfyABTest(ABTestIdentifier.NotificationCenterAccess);)
	//*  71  149:invokestatic    #128 <Method Assembler Assembler.getInstance()>
	//*  72  152:invokevirtual   #583 <Method ApplicationUIService Assembler.getApplicationUIService()>
	//*  73  155:invokevirtual   #589 <Method ApplicationUIServiceData ApplicationUIService.getServiceData()>
	//*  74  158:invokevirtual   #595 <Method PlatformManager ApplicationUIServiceData.getPlatformManager()>
	//*  75  161:invokevirtual   #601 <Method ABTestHandler PlatformManager.getABTestHandler()>
	//*  76  164:astore          4
	//*  77  166:aload_0         
	//*  78  167:invokevirtual   #605 <Method Context getBaseContext()>
	//*  79  170:ldc2            #607 <String "DEVEL">
	//*  80  173:iconst_0        
	//*  81  174:invokevirtual   #613 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//*  82  177:ldc2            #615 <String "enable_notification_center">
	//*  83  180:iconst_0        
	//*  84  181:invokeinterface #621 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//*  85  186:ifeq            204
			{
				e.setVisibility(0);
	//   86  189:aload_0         
	//   87  190:getfield        #169 <Field RelativeLayout e>
	//   88  193:iconst_0        
	//   89  194:invokevirtual   #622 <Method void RelativeLayout.setVisibility(int)>
				drawerlayout.a(0, 5);
	//   90  197:aload_3         
	//   91  198:iconst_0        
	//   92  199:iconst_5        
	//   93  200:invokevirtual   #625 <Method void DrawerLayout.a(int, int)>
				return;
	//   94  203:return          
			}

	//   95  204:aload           4
	//   96  206:getstatic       #631 <Field ABTestIdentifier ABTestIdentifier.NotificationCenterAccess>
	//   97  209:invokevirtual   #637 <Method boolean ABTestHandler.doesUserSatisfyABTest(ABTestIdentifier)>
	//   98  212:ifeq            218
	//*  99  215:goto            189
			e.setVisibility(8);
	//  100  218:aload_0         
	//  101  219:getfield        #169 <Field RelativeLayout e>
	//  102  222:bipush          8
	//  103  224:invokevirtual   #622 <Method void RelativeLayout.setVisibility(int)>
			drawerlayout.a(1, 5);
	//  104  227:aload_3         
	//  105  228:iconst_1        
	//  106  229:iconst_5        
	//  107  230:invokevirtual   #625 <Method void DrawerLayout.a(int, int)>
		}
	//  108  233:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #640 <Method void BaseFragmentActivity.onStart()>
		x();
	//    2    4:aload_0         
	//    3    5:invokespecial   #363 <Method void x()>
	//    4    8:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #643 <Method void BaseFragmentActivity.onStop()>
		if(B != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #180 <Field SettingsSubsystem B>
	//*   4    8:ifnull          23
			B.unregisterSubscriber(C);
	//    5   11:aload_0         
	//    6   12:getfield        #180 <Field SettingsSubsystem B>
	//    7   15:aload_0         
	//    8   16:getfield        #100 <Field SettingsUIServiceDataCallback C>
	//    9   19:invokevirtual   #186 <Method boolean SettingsSubsystem.unregisterSubscriber(SettingsUIServiceDataCallback)>
	//   10   22:pop             
		if(m != null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #150 <Field NotificationCenterUIService m>
	//*  13   27:ifnull          42
			m.unregisterSubscriber(((NotificationCenterUIServiceDataCallback) (n)));
	//   14   30:aload_0         
	//   15   31:getfield        #150 <Field NotificationCenterUIService m>
	//   16   34:aload_0         
	//   17   35:getfield        #95  <Field BaseCleanActivity$a n>
	//   18   38:invokevirtual   #361 <Method boolean NotificationCenterUIService.unregisterSubscriber(NotificationCenterUIServiceDataCallback)>
	//   19   41:pop             
	//   20   42:return          
	}

	protected void p()
	{
		AwsCredentialsService.f().a();
	//    0    0:invokestatic    #648 <Method AwsCredentialsService AwsCredentialsService.f()>
	//    1    3:invokevirtual   #649 <Method void AwsCredentialsService.a()>
	//    2    6:return          
	}

	public void q()
	{
		android.app.FragmentTransaction fragmenttransaction = getFragmentManager().beginTransaction();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #653 <Method FragmentManager getFragmentManager()>
	//    2    4:invokevirtual   #659 <Method android.app.FragmentTransaction FragmentManager.beginTransaction()>
	//    3    7:astore_1        
		x = com.irobot.home.g.d.a(((e) (this)));
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:invokestatic    #662 <Method com.irobot.home.g.d com.irobot.home.g.d.a(e)>
	//    7   13:putfield        #463 <Field com.irobot.home.g.d x>
		x.setCancelable(false);
	//    8   16:aload_0         
	//    9   17:getfield        #463 <Field com.irobot.home.g.d x>
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #665 <Method void com.irobot.home.g.d.setCancelable(boolean)>
		x.show(fragmenttransaction, "legalTermsDialog");
	//   12   24:aload_0         
	//   13   25:getfield        #463 <Field com.irobot.home.g.d x>
	//   14   28:aload_1         
	//   15   29:ldc2            #667 <String "legalTermsDialog">
	//   16   32:invokevirtual   #671 <Method int com.irobot.home.g.d.show(android.app.FragmentTransaction, String)>
	//   17   35:pop             
	//   18   36:return          
	}

	public void r()
	{
		com.irobot.home.LegalTermsActivity_.a(((Context) (this))).a(true).a(2);
	//    0    0:aload_0         
	//    1    1:invokestatic    #676 <Method LegalTermsActivity_$a com.irobot.home.LegalTermsActivity_.a(Context)>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #681 <Method LegalTermsActivity_$a com.irobot.home.LegalTermsActivity_$a.a(boolean)>
	//    4    8:iconst_2        
	//    5    9:invokevirtual   #684 <Method org.androidannotations.api.a.e com.irobot.home.LegalTermsActivity_$a.a(int)>
	//    6   12:pop             
	//    7   13:return          
	}

	protected void s()
	{
		if(m != null && com.irobot.home.util.j.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field NotificationCenterUIService m>
	//*   2    4:ifnull          24
	//*   3    7:invokestatic    #686 <Method boolean j.a()>
	//*   4   10:ifeq            24
			m.sendCommand(NotificationCenterServiceCommand.GetNotifications, ((NotificationCenterUIServiceData) (null)));
	//    5   13:aload_0         
	//    6   14:getfield        #150 <Field NotificationCenterUIService m>
	//    7   17:getstatic       #692 <Field NotificationCenterServiceCommand NotificationCenterServiceCommand.GetNotifications>
	//    8   20:aconst_null     
	//    9   21:invokevirtual   #696 <Method void NotificationCenterUIService.sendCommand(NotificationCenterServiceCommand, NotificationCenterUIServiceData)>
	//   10   24:return          
	}

	private static final String t = "BaseCleanActivity";
	private ArrayList A;
	private SettingsSubsystem B;
	private final SettingsUIServiceDataCallback C = new SettingsUIServiceDataCallback() {

		public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
		{
			Iterator iterator = settingsuiservicedata.getSettingsChangeList().iterator();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #24  <Method HashSet SettingsUIServiceData.getSettingsChangeList()>
		//    2    4:invokevirtual   #30  <Method Iterator HashSet.iterator()>
		//    3    7:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
		//    4    8:aload_2         
		//    5    9:invokeinterface #36  <Method boolean Iterator.hasNext()>
		//    6   14:ifeq            100
				SettingType settingtype = (SettingType)iterator.next();
		//    7   17:aload_2         
		//    8   18:invokeinterface #40  <Method Object Iterator.next()>
		//    9   23:checkcast       #42  <Class SettingType>
		//   10   26:astore_3        
				if(com.irobot.home._cls6.a[settingtype.ordinal()] == 1)
		//*  11   27:getstatic       #47  <Field int[] com.irobot.home.BaseCleanActivity$6.a>
		//*  12   30:aload_3         
		//*  13   31:invokevirtual   #51  <Method int SettingType.ordinal()>
		//*  14   34:iaload          
		//*  15   35:iconst_1        
		//*  16   36:icmpeq          42
		//*  17   39:goto            8
				{
					String s1 = settingsuiservicedata.getStringSetting(SettingType.Name);
		//   18   42:aload_1         
		//   19   43:getstatic       #55  <Field SettingType SettingType.Name>
		//   20   46:invokevirtual   #59  <Method String SettingsUIServiceData.getStringSetting(SettingType)>
		//   21   49:astore_3        
					a.b(s1);
		//   22   50:aload_0         
		//   23   51:getfield        #12  <Field BaseCleanActivity a>
		//   24   54:aload_3         
		//   25   55:invokevirtual   #63  <Method void com.irobot.home.BaseCleanActivity.b(String)>
					String s2 = BaseCleanActivity.t();
		//   26   58:invokestatic    #67  <Method String BaseCleanActivity.t()>
		//   27   61:astore          4
					StringBuilder stringbuilder = new StringBuilder();
		//   28   63:new             #69  <Class StringBuilder>
		//   29   66:dup             
		//   30   67:invokespecial   #70  <Method void StringBuilder()>
		//   31   70:astore          5
					stringbuilder.append("Robot name is: ");
		//   32   72:aload           5
		//   33   74:ldc1            #72  <String "Robot name is: ">
		//   34   76:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
		//   35   79:pop             
					stringbuilder.append(s1);
		//   36   80:aload           5
		//   37   82:aload_3         
		//   38   83:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
		//   39   86:pop             
					com.irobot.home.util.o.b(s2, stringbuilder.toString());
		//   40   87:aload           4
		//   41   89:aload           5
		//   42   91:invokevirtual   #79  <Method String StringBuilder.toString()>
		//   43   94:invokestatic    #84  <Method void o.b(String, String)>
				}
			} while(true);
		//   44   97:goto            8
		//   45  100:return          
		}

		final BaseCleanActivity a;

			
			{
				a = BaseCleanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field BaseCleanActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void SettingsUIServiceDataCallback()>
			//    5    9:return          
			}
	}
;
	IRobotApplication a;
	CustomerCareRestClient b;
	View c;
	ImageView d;
	RelativeLayout e;
	ImageView f;
	LinearLayout g;
	protected ag h;
	protected ac i;
	protected String j;
	com.irobot.home.i.a k;
	protected boolean l;
	protected NotificationCenterUIService m;
	protected final a n = new a();
	protected Runnable o;
	private int u;
	private TermsInfo v;
	private boolean w;
	private com.irobot.home.g.d x;
	private boolean y;
	private boolean z;

	static 
	{
	//    0    0:return          
	}
}
