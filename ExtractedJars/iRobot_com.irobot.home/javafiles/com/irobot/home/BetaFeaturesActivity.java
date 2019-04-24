// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.*;
import android.view.*;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.irobot.core.*;
import com.irobot.home.b.d;
import com.irobot.home.model.a;
import com.irobot.home.model.b;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomTextView;
import java.util.*;

// Referenced classes of package com.irobot.home:
//			BasePushNotificationActivity

public class BetaFeaturesActivity extends BasePushNotificationActivity
{
	private class a extends AccountUIServiceDataCallback
	{

		public void onAccountUIServiceDataChanged(AccountUIServiceData accountuiservicedata)
		{
			if(accountuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       13
			{
				com.irobot.home.util.o.e(BetaFeaturesActivity.g(), "null service data");
		//    2    4:invokestatic    #27  <Method String BetaFeaturesActivity.g()>
		//    3    7:ldc1            #29  <String "null service data">
		//    4    9:invokestatic    #35  <Method void o.e(String, String)>
				return;
		//    5   12:return          
			}
			Object obj = ((Object) (accountuiservicedata.getViewStates()));
		//    6   13:aload_1         
		//    7   14:invokevirtual   #41  <Method ArrayList AccountUIServiceData.getViewStates()>
		//    8   17:astore_2        
			String s = BetaFeaturesActivity.g();
		//    9   18:invokestatic    #27  <Method String BetaFeaturesActivity.g()>
		//   10   21:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
		//   11   22:new             #43  <Class StringBuilder>
		//   12   25:dup             
		//   13   26:invokespecial   #44  <Method void StringBuilder()>
		//   14   29:astore          4
			stringbuilder.append("View change list: ");
		//   15   31:aload           4
		//   16   33:ldc1            #46  <String "View change list: ">
		//   17   35:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
		//   18   38:pop             
			stringbuilder.append(((ArrayList) (obj)).toString());
		//   19   39:aload           4
		//   20   41:aload_2         
		//   21   42:invokevirtual   #55  <Method String ArrayList.toString()>
		//   22   45:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
		//   23   48:pop             
			com.irobot.home.util.o.b(s, stringbuilder.toString());
		//   24   49:aload_3         
		//   25   50:aload           4
		//   26   52:invokevirtual   #56  <Method String StringBuilder.toString()>
		//   27   55:invokestatic    #59  <Method void o.b(String, String)>
			obj = ((Object) (((ArrayList) (obj)).iterator()));
		//   28   58:aload_2         
		//   29   59:invokevirtual   #63  <Method Iterator ArrayList.iterator()>
		//   30   62:astore_2        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
		//   31   63:aload_2         
		//   32   64:invokeinterface #69  <Method boolean Iterator.hasNext()>
		//   33   69:ifeq            295
				AccountViewState accountviewstate = (AccountViewState)((Iterator) (obj)).next();
		//   34   72:aload_2         
		//   35   73:invokeinterface #73  <Method Object Iterator.next()>
		//   36   78:checkcast       #75  <Class AccountViewState>
		//   37   81:astore_3        
				static class _cls1
				{

					static final int a[];
					static final int b[];

					static 
					{
						b = new int[FeatureType.values().length];
					//    0    0:invokestatic    #19  <Method FeatureType[] FeatureType.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #21  <Field int[] b>
						try
						{
							b[FeatureType.WifiMaps.ordinal()] = 1;
					//    4    9:getstatic       #21  <Field int[] b>
					//    5   12:getstatic       #25  <Field FeatureType FeatureType.WifiMaps>
					//    6   15:invokevirtual   #29  <Method int FeatureType.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:invokestatic    #34  <Method AccountViewState[] AccountViewState.values()>
					//*  10   23:arraylength     
					//*  11   24:newarray        int[]
					//*  12   26:putstatic       #36  <Field int[] a>
					//*  13   29:getstatic       #36  <Field int[] a>
					//*  14   32:getstatic       #40  <Field AccountViewState AccountViewState.ShowLoadingIndicator>
					//*  15   35:invokevirtual   #41  <Method int AccountViewState.ordinal()>
					//*  16   38:iconst_1        
					//*  17   39:iastore         
					//*  18   40:getstatic       #36  <Field int[] a>
					//*  19   43:getstatic       #44  <Field AccountViewState AccountViewState.HideLoadingIndicator>
					//*  20   46:invokevirtual   #41  <Method int AccountViewState.ordinal()>
					//*  21   49:iconst_2        
					//*  22   50:iastore         
					//*  23   51:getstatic       #36  <Field int[] a>
					//*  24   54:getstatic       #47  <Field AccountViewState AccountViewState.ShowBetaProgramTip>
					//*  25   57:invokevirtual   #41  <Method int AccountViewState.ordinal()>
					//*  26   60:iconst_3        
					//*  27   61:iastore         
					//*  28   62:getstatic       #36  <Field int[] a>
					//*  29   65:getstatic       #50  <Field AccountViewState AccountViewState.HideBetaProgramTip>
					//*  30   68:invokevirtual   #41  <Method int AccountViewState.ordinal()>
					//*  31   71:iconst_4        
					//*  32   72:iastore         
					//*  33   73:getstatic       #36  <Field int[] a>
					//*  34   76:getstatic       #53  <Field AccountViewState AccountViewState.ShowUpdatedBetaProgramFeatures>
					//*  35   79:invokevirtual   #41  <Method int AccountViewState.ordinal()>
					//*  36   82:iconst_5        
					//*  37   83:iastore         
					//*  38   84:getstatic       #36  <Field int[] a>
					//*  39   87:getstatic       #56  <Field AccountViewState AccountViewState.ShowOutputConfirmation>
					//*  40   90:invokevirtual   #41  <Method int AccountViewState.ordinal()>
					//*  41   93:bipush          6
					//*  42   95:iastore         
					//*  43   96:getstatic       #36  <Field int[] a>
					//*  44   99:getstatic       #59  <Field AccountViewState AccountViewState.NavigateToCleanScreen>
					//*  45  102:invokevirtual   #41  <Method int AccountViewState.ordinal()>
					//*  46  105:bipush          7
					//*  47  107:iastore         
					//*  48  108:getstatic       #36  <Field int[] a>
					//*  49  111:getstatic       #62  <Field AccountViewState AccountViewState.ShowRequestErrorMessage>
					//*  50  114:invokevirtual   #41  <Method int AccountViewState.ordinal()>
					//*  51  117:bipush          8
					//*  52  119:iastore         
					//*  53  120:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//   54  121:astore_0        
						a = new int[AccountViewState.values().length];
						try
						{
							a[AccountViewState.ShowLoadingIndicator.ordinal()] = 1;
						}
					//*  55  122:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//   56  125:astore_0        
						try
						{
							a[AccountViewState.HideLoadingIndicator.ordinal()] = 2;
						}
					//*  57  126:goto            40
						catch(NoSuchFieldError nosuchfielderror2) { }
					//   58  129:astore_0        
						try
						{
							a[AccountViewState.ShowBetaProgramTip.ordinal()] = 3;
						}
					//*  59  130:goto            51
						catch(NoSuchFieldError nosuchfielderror3) { }
					//   60  133:astore_0        
						try
						{
							a[AccountViewState.HideBetaProgramTip.ordinal()] = 4;
						}
					//*  61  134:goto            62
						catch(NoSuchFieldError nosuchfielderror4) { }
					//   62  137:astore_0        
						try
						{
							a[AccountViewState.ShowUpdatedBetaProgramFeatures.ordinal()] = 5;
						}
					//*  63  138:goto            73
						catch(NoSuchFieldError nosuchfielderror5) { }
					//   64  141:astore_0        
						try
						{
							a[AccountViewState.ShowOutputConfirmation.ordinal()] = 6;
						}
					//*  65  142:goto            84
						catch(NoSuchFieldError nosuchfielderror6) { }
					//   66  145:astore_0        
						try
						{
							a[AccountViewState.NavigateToCleanScreen.ordinal()] = 7;
						}
					//*  67  146:goto            96
						catch(NoSuchFieldError nosuchfielderror7) { }
					//   68  149:astore_0        
						try
						{
							a[AccountViewState.ShowRequestErrorMessage.ordinal()] = 8;
						}
					//*  69  150:goto            108
						catch(NoSuchFieldError nosuchfielderror8) { }
					//   70  153:astore_0        
					//*  71  154:return          
					}
				}

				switch(com.irobot.home._cls1.a[accountviewstate.ordinal()])
		//*  38   82:getstatic       #80  <Field int[] com.irobot.home.BetaFeaturesActivity$1.a>
		//*  39   85:aload_3         
		//*  40   86:invokevirtual   #84  <Method int AccountViewState.ordinal()>
		//*  41   89:iaload          
				{
		//*  42   90:tableswitch     1 8: default 136
		//		               1 273
		//		               2 250
		//		               3 236
		//		               4 221
		//		               5 207
		//		               6 165
		//		               7 155
		//		               8 139
		//*  43  136:goto            63
				case 8: // '\b'
					Toast.makeText(((android.content.Context) (a)), 0x7f0f00cc, 0).show();
		//   44  139:aload_0         
		//   45  140:getfield        #14  <Field BetaFeaturesActivity a>
		//   46  143:ldc1            #85  <Int 0x7f0f00cc>
		//   47  145:iconst_0        
		//   48  146:invokestatic    #91  <Method Toast Toast.makeText(android.content.Context, int, int)>
		//   49  149:invokevirtual   #94  <Method void Toast.show()>
					break;

		//*  50  152:goto            63
				case 7: // '\007'
					a.finish();
		//   51  155:aload_0         
		//   52  156:getfield        #14  <Field BetaFeaturesActivity a>
		//   53  159:invokevirtual   #97  <Method void BetaFeaturesActivity.finish()>
					break;

		//*  54  162:goto            63
				case 6: // '\006'
					(new android.support.v7.app.a.a(((android.content.Context) (a)))).b(0x7f0f00d5).a(0x7f0f0986, new android.content.DialogInterface.OnClickListener(this) {

						public void onClick(DialogInterface dialoginterface, int i1)
						{
							AnalyticsSubsystem.getInstance().trackLeaveBetaProgramConfirmationButtonPressed(com.irobot.home.util.j.j().a());
						//    0    0:invokestatic    #31  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
						//    1    3:invokestatic    #37  <Method a j.j()>
						//    2    6:invokevirtual   #42  <Method com.irobot.core.AssetInfo a.a()>
						//    3    9:invokevirtual   #46  <Method void AnalyticsSubsystem.trackLeaveBetaProgramConfirmationButtonPressed(com.irobot.core.AssetInfo)>
							com.irobot.home.BetaFeaturesActivity.a(a.a).sendCommand(AccountUIServiceCommand.BetaOptOutConfirmed, ((AccountUIServiceData) (null)));
						//    4   12:aload_0         
						//    5   13:getfield        #19  <Field BetaFeaturesActivity$a a>
						//    6   16:getfield        #49  <Field BetaFeaturesActivity com.irobot.home.BetaFeaturesActivity$a.a>
						//    7   19:invokestatic    #52  <Method AccountService com.irobot.home.BetaFeaturesActivity.a(BetaFeaturesActivity)>
						//    8   22:getstatic       #58  <Field AccountUIServiceCommand AccountUIServiceCommand.BetaOptOutConfirmed>
						//    9   25:aconst_null     
						//   10   26:invokevirtual   #64  <Method void AccountService.sendCommand(AccountUIServiceCommand, AccountUIServiceData)>
						//   11   29:return          
						}

						final a a;

			
			{
				a = a1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BetaFeaturesActivity$a a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
					}
).b(0x7f0f017d, ((android.content.DialogInterface.OnClickListener) (null))).c();
		//   55  165:new             #99  <Class android.support.v7.app.a$a>
		//   56  168:dup             
		//   57  169:aload_0         
		//   58  170:getfield        #14  <Field BetaFeaturesActivity a>
		//   59  173:invokespecial   #102 <Method void android.support.v7.app.a$a(android.content.Context)>
		//   60  176:ldc1            #103 <Int 0x7f0f00d5>
		//   61  178:invokevirtual   #106 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(int)>
		//   62  181:ldc1            #107 <Int 0x7f0f0986>
		//   63  183:new             #9   <Class BetaFeaturesActivity$a$1>
		//   64  186:dup             
		//   65  187:aload_0         
		//   66  188:invokespecial   #110 <Method void BetaFeaturesActivity$a$1(BetaFeaturesActivity$a)>
		//   67  191:invokevirtual   #113 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(int, android.content.DialogInterface$OnClickListener)>
		//   68  194:ldc1            #114 <Int 0x7f0f017d>
		//   69  196:aconst_null     
		//   70  197:invokevirtual   #116 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(int, android.content.DialogInterface$OnClickListener)>
		//   71  200:invokevirtual   #120 <Method android.support.v7.app.a android.support.v7.app.a$a.c()>
		//   72  203:pop             
					break;

		//*  73  204:goto            63
				case 5: // '\005'
					com.irobot.home.BetaFeaturesActivity.a(a, accountuiservicedata.getAvailableBetaFeatures());
		//   74  207:aload_0         
		//   75  208:getfield        #14  <Field BetaFeaturesActivity a>
		//   76  211:aload_1         
		//   77  212:invokevirtual   #123 <Method ArrayList AccountUIServiceData.getAvailableBetaFeatures()>
		//   78  215:invokestatic    #126 <Method void com.irobot.home.BetaFeaturesActivity.a(BetaFeaturesActivity, ArrayList)>
					break;

		//*  79  218:goto            63
				case 4: // '\004'
					a.b.setVisibility(8);
		//   80  221:aload_0         
		//   81  222:getfield        #14  <Field BetaFeaturesActivity a>
		//   82  225:getfield        #129 <Field View com.irobot.home.BetaFeaturesActivity.b>
		//   83  228:bipush          8
		//   84  230:invokevirtual   #135 <Method void View.setVisibility(int)>
					break;

		//*  85  233:goto            63
				case 3: // '\003'
					a.b.setVisibility(0);
		//   86  236:aload_0         
		//   87  237:getfield        #14  <Field BetaFeaturesActivity a>
		//   88  240:getfield        #129 <Field View com.irobot.home.BetaFeaturesActivity.b>
		//   89  243:iconst_0        
		//   90  244:invokevirtual   #135 <Method void View.setVisibility(int)>
					break;

		//*  91  247:goto            63
				case 2: // '\002'
					a.c.setVisibility(8);
		//   92  250:aload_0         
		//   93  251:getfield        #14  <Field BetaFeaturesActivity a>
		//   94  254:getfield        #138 <Field ProgressBar BetaFeaturesActivity.c>
		//   95  257:bipush          8
		//   96  259:invokevirtual   #141 <Method void ProgressBar.setVisibility(int)>
					com.irobot.home.BetaFeaturesActivity.a(a, true);
		//   97  262:aload_0         
		//   98  263:getfield        #14  <Field BetaFeaturesActivity a>
		//   99  266:iconst_1        
		//  100  267:invokestatic    #144 <Method void com.irobot.home.BetaFeaturesActivity.a(BetaFeaturesActivity, boolean)>
					break;

		//* 101  270:goto            63
				case 1: // '\001'
					com.irobot.home.BetaFeaturesActivity.a(a, false);
		//  102  273:aload_0         
		//  103  274:getfield        #14  <Field BetaFeaturesActivity a>
		//  104  277:iconst_0        
		//  105  278:invokestatic    #144 <Method void com.irobot.home.BetaFeaturesActivity.a(BetaFeaturesActivity, boolean)>
					a.c.setVisibility(0);
		//  106  281:aload_0         
		//  107  282:getfield        #14  <Field BetaFeaturesActivity a>
		//  108  285:getfield        #138 <Field ProgressBar BetaFeaturesActivity.c>
		//  109  288:iconst_0        
		//  110  289:invokevirtual   #141 <Method void ProgressBar.setVisibility(int)>
					break;
				}
			} while(true);
		//* 111  292:goto            63
		//  112  295:return          
		}

		final BetaFeaturesActivity a;

		private a()
		{
			a = BetaFeaturesActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field BetaFeaturesActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void AccountUIServiceDataCallback()>
		//    5    9:return          
		}

	}

	private class b
		implements com.irobot.home.b.d.b
	{

		public void a()
		{
			com.irobot.home.util.o.b(BetaFeaturesActivity.g(), "User wants to submit an idea.");
		//    0    0:invokestatic    #26  <Method String BetaFeaturesActivity.g()>
		//    1    3:ldc1            #28  <String "User wants to submit an idea.">
		//    2    5:invokestatic    #33  <Method void o.b(String, String)>
		//    3    8:return          
		}

		public void a(FeatureType featuretype)
		{
			String s = BetaFeaturesActivity.g();
		//    0    0:invokestatic    #26  <Method String BetaFeaturesActivity.g()>
		//    1    3:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
		//    2    4:new             #36  <Class StringBuilder>
		//    3    7:dup             
		//    4    8:invokespecial   #37  <Method void StringBuilder()>
		//    5   11:astore_3        
			stringbuilder.append("User wants to view details on ");
		//    6   12:aload_3         
		//    7   13:ldc1            #39  <String "User wants to view details on ">
		//    8   15:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//    9   18:pop             
			stringbuilder.append(featuretype.name());
		//   10   19:aload_3         
		//   11   20:aload_1         
		//   12   21:invokevirtual   #48  <Method String FeatureType.name()>
		//   13   24:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//   14   27:pop             
			com.irobot.home.util.o.b(s, stringbuilder.toString());
		//   15   28:aload_2         
		//   16   29:aload_3         
		//   17   30:invokevirtual   #51  <Method String StringBuilder.toString()>
		//   18   33:invokestatic    #33  <Method void o.b(String, String)>
		//   19   36:return          
		}

		public void a(FeatureType featuretype, boolean flag)
		{
			com.irobot.home.BetaFeaturesActivity.a(a, false);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field BetaFeaturesActivity a>
		//    2    4:iconst_0        
		//    3    5:invokestatic    #55  <Method void com.irobot.home.BetaFeaturesActivity.a(BetaFeaturesActivity, boolean)>
			AccountUIServiceData accountuiservicedata = AccountUIServiceData.create();
		//    4    8:invokestatic    #61  <Method AccountUIServiceData AccountUIServiceData.create()>
		//    5   11:astore_3        
			accountuiservicedata.setBetaFeatureType(featuretype);
		//    6   12:aload_3         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #64  <Method void AccountUIServiceData.setBetaFeatureType(FeatureType)>
			accountuiservicedata.setBetaFeatureStatus(flag);
		//    9   17:aload_3         
		//   10   18:iload_2         
		//   11   19:invokevirtual   #68  <Method void AccountUIServiceData.setBetaFeatureStatus(boolean)>
			com.irobot.home.BetaFeaturesActivity.a(a).sendCommand(AccountUIServiceCommand.BetaFeatureStatusChanged, accountuiservicedata);
		//   12   22:aload_0         
		//   13   23:getfield        #15  <Field BetaFeaturesActivity a>
		//   14   26:invokestatic    #71  <Method AccountService com.irobot.home.BetaFeaturesActivity.a(BetaFeaturesActivity)>
		//   15   29:getstatic       #77  <Field AccountUIServiceCommand AccountUIServiceCommand.BetaFeatureStatusChanged>
		//   16   32:aload_3         
		//   17   33:invokevirtual   #83  <Method void AccountService.sendCommand(AccountUIServiceCommand, AccountUIServiceData)>
			if(featuretype == FeatureType.WifiMaps)
		//*  18   36:aload_1         
		//*  19   37:getstatic       #87  <Field FeatureType FeatureType.WifiMaps>
		//*  20   40:if_acmpne       56
				AnalyticsSubsystem.getInstance().trackWifiCoverageToggled(com.irobot.home.util.j.j().a(), flag);
		//   21   43:invokestatic    #93  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
		//   22   46:invokestatic    #99  <Method a j.j()>
		//   23   49:invokevirtual   #104 <Method com.irobot.core.AssetInfo a.a()>
		//   24   52:iload_2         
		//   25   53:invokevirtual   #108 <Method void AnalyticsSubsystem.trackWifiCoverageToggled(com.irobot.core.AssetInfo, boolean)>
		//   26   56:return          
		}

		final BetaFeaturesActivity a;

		private b()
		{
			a = BetaFeaturesActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field BetaFeaturesActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}


	public BetaFeaturesActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void BasePushNotificationActivity()>
		a = ((AccountUIServiceDataCallback) (new a(((_cls1) (null)))));
	//    2    4:aload_0         
	//    3    5:new             #8   <Class BetaFeaturesActivity$a>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #53  <Method void BetaFeaturesActivity$a(BetaFeaturesActivity, BetaFeaturesActivity$1)>
	//    8   14:putfield        #55  <Field AccountUIServiceDataCallback a>
		m = new b(((_cls1) (null)));
	//    9   17:aload_0         
	//   10   18:new             #13  <Class BetaFeaturesActivity$b>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:aconst_null     
	//   14   24:invokespecial   #56  <Method void BetaFeaturesActivity$b(BetaFeaturesActivity, BetaFeaturesActivity$1)>
	//   15   27:putfield        #58  <Field BetaFeaturesActivity$b m>
	//   16   30:return          
	}

	static AccountService a(BetaFeaturesActivity betafeaturesactivity)
	{
		return betafeaturesactivity.k;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field AccountService k>
	//    2    4:areturn         
	}

	static void a(BetaFeaturesActivity betafeaturesactivity, ArrayList arraylist)
	{
		betafeaturesactivity.a(arraylist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #65  <Method void a(ArrayList)>
	//    3    5:return          
	}

	static void a(BetaFeaturesActivity betafeaturesactivity, boolean flag)
	{
		betafeaturesactivity.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #69  <Method void a(boolean)>
	//    3    5:return          
	}

	private void a(ArrayList arraylist)
	{
		n.a(false);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field d n>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #74  <Method void d.a(boolean)>
		l.clear();
	//    4    8:aload_0         
	//    5    9:getfield        #76  <Field List l>
	//    6   12:invokeinterface #81  <Method void List.clear()>
		arraylist = ((ArrayList) (arraylist.iterator()));
	//    7   17:aload_1         
	//    8   18:invokevirtual   #87  <Method Iterator ArrayList.iterator()>
	//    9   21:astore_1        
		do
		{
			if(!((Iterator) (arraylist)).hasNext())
				break;
	//   10   22:aload_1         
	//   11   23:invokeinterface #93  <Method boolean Iterator.hasNext()>
	//   12   28:ifeq            94
			BetaProgramFeature betaprogramfeature = (BetaProgramFeature)((Iterator) (arraylist)).next();
	//   13   31:aload_1         
	//   14   32:invokeinterface #97  <Method Object Iterator.next()>
	//   15   37:checkcast       #99  <Class BetaProgramFeature>
	//   16   40:astore_2        
			FeatureType featuretype = betaprogramfeature.type();
	//   17   41:aload_2         
	//   18   42:invokevirtual   #103 <Method FeatureType BetaProgramFeature.type()>
	//   19   45:astore_3        
			if(com.irobot.home._cls1.b[featuretype.ordinal()] == 1)
	//*  20   46:getstatic       #106 <Field int[] com.irobot.home.BetaFeaturesActivity$1.b>
	//*  21   49:aload_3         
	//*  22   50:invokevirtual   #112 <Method int FeatureType.ordinal()>
	//*  23   53:iaload          
	//*  24   54:iconst_1        
	//*  25   55:icmpeq          61
	//*  26   58:goto            22
				l.add(((Object) (new com.irobot.home.model.b(betaprogramfeature, 0x7f0f00e0, 0x7f0f00df, 0x7f080210, 0x7f0f00dc, 0x7f0f00de, 0x7f0f00dd))));
	//   27   61:aload_0         
	//   28   62:getfield        #76  <Field List l>
	//   29   65:new             #114 <Class b>
	//   30   68:dup             
	//   31   69:aload_2         
	//   32   70:ldc1            #115 <Int 0x7f0f00e0>
	//   33   72:ldc1            #116 <Int 0x7f0f00df>
	//   34   74:ldc1            #117 <Int 0x7f080210>
	//   35   76:ldc1            #118 <Int 0x7f0f00dc>
	//   36   78:ldc1            #119 <Int 0x7f0f00de>
	//   37   80:ldc1            #120 <Int 0x7f0f00dd>
	//   38   82:invokespecial   #123 <Method void b(BetaProgramFeature, int, int, int, int, int, int)>
	//   39   85:invokeinterface #127 <Method boolean List.add(Object)>
	//   40   90:pop             
		} while(true);
	//   41   91:goto            22
		n.e();
	//   42   94:aload_0         
	//   43   95:getfield        #71  <Field d n>
	//   44   98:invokevirtual   #129 <Method void d.e()>
		n.a(true);
	//   45  101:aload_0         
	//   46  102:getfield        #71  <Field d n>
	//   47  105:iconst_1        
	//   48  106:invokevirtual   #74  <Method void d.a(boolean)>
	//   49  109:return          
	}

	private void a(boolean flag)
	{
		o = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #133 <Field boolean o>
		n.a(o);
	//    3    5:aload_0         
	//    4    6:getfield        #71  <Field d n>
	//    5    9:aload_0         
	//    6   10:getfield        #133 <Field boolean o>
	//    7   13:invokevirtual   #74  <Method void d.a(boolean)>
		supportInvalidateOptionsMenu();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #136 <Method void supportInvalidateOptionsMenu()>
	//   10   20:return          
	}

	static String g()
	{
		return h;
	//    0    0:getstatic       #139 <Field String h>
	//    1    3:areturn         
	}

	private void h()
	{
		a(f);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #141 <Field Toolbar f>
	//    3    5:invokevirtual   #144 <Method void a(Toolbar)>
		ActionBar actionbar = a();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #147 <Method ActionBar a()>
	//    6   12:astore_1        
		if(actionbar != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          37
		{
			actionbar.a(((CharSequence) (null)));
	//    9   17:aload_1         
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #152 <Method void ActionBar.a(CharSequence)>
			b(0x7f0f00da);
	//   12   22:aload_0         
	//   13   23:ldc1            #153 <Int 0x7f0f00da>
	//   14   25:invokevirtual   #156 <Method void b(int)>
			g.setVisibility(8);
	//   15   28:aload_0         
	//   16   29:getfield        #158 <Field View g>
	//   17   32:bipush          8
	//   18   34:invokevirtual   #163 <Method void View.setVisibility(int)>
		}
	//   19   37:return          
	}

	private void i()
	{
		AccountUIServiceData accountuiservicedata = AccountUIServiceData.create();
	//    0    0:invokestatic    #169 <Method AccountUIServiceData AccountUIServiceData.create()>
	//    1    3:astore_1        
		accountuiservicedata.setBetaEnrollmentChanged(false);
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #172 <Method void AccountUIServiceData.setBetaEnrollmentChanged(boolean)>
		k.sendCommand(AccountUIServiceCommand.BetaEnrollmentChanged, accountuiservicedata);
	//    5    9:aload_0         
	//    6   10:getfield        #61  <Field AccountService k>
	//    7   13:getstatic       #178 <Field AccountUIServiceCommand AccountUIServiceCommand.BetaEnrollmentChanged>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #184 <Method void AccountService.sendCommand(AccountUIServiceCommand, AccountUIServiceData)>
	//   10   20:return          
	}

	protected void e()
	{
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.BetaProgram, com.irobot.home.util.j.j().a());
	//    0    0:invokestatic    #190 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    1    3:getstatic       #196 <Field ViewId ViewId.BetaProgram>
	//    2    6:invokestatic    #201 <Method a j.j()>
	//    3    9:invokevirtual   #206 <Method com.irobot.core.AssetInfo a.a()>
	//    4   12:invokevirtual   #210 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, com.irobot.core.AssetInfo)>
		k = Assembler.getInstance().getAccountService();
	//    5   15:aload_0         
	//    6   16:invokestatic    #215 <Method Assembler Assembler.getInstance()>
	//    7   19:invokevirtual   #219 <Method AccountService Assembler.getAccountService()>
	//    8   22:putfield        #61  <Field AccountService k>
		l = ((List) (new ArrayList(2)));
	//    9   25:aload_0         
	//   10   26:new             #83  <Class ArrayList>
	//   11   29:dup             
	//   12   30:iconst_2        
	//   13   31:invokespecial   #221 <Method void ArrayList(int)>
	//   14   34:putfield        #76  <Field List l>
		n = new d(((android.content.Context) (this)), ((com.irobot.home.b.d.b) (m)), l);
	//   15   37:aload_0         
	//   16   38:new             #73  <Class d>
	//   17   41:dup             
	//   18   42:aload_0         
	//   19   43:aload_0         
	//   20   44:getfield        #58  <Field BetaFeaturesActivity$b m>
	//   21   47:aload_0         
	//   22   48:getfield        #76  <Field List l>
	//   23   51:invokespecial   #224 <Method void d(android.content.Context, com.irobot.home.b.d$b, List)>
	//   24   54:putfield        #71  <Field d n>
		e.setAdapter(((android.support.v7.widget.RecyclerView.a) (n)));
	//   25   57:aload_0         
	//   26   58:getfield        #226 <Field RecyclerView e>
	//   27   61:aload_0         
	//   28   62:getfield        #71  <Field d n>
	//   29   65:invokevirtual   #232 <Method void RecyclerView.setAdapter(android.support.v7.widget.RecyclerView$a)>
		e.setHasFixedSize(true);
	//   30   68:aload_0         
	//   31   69:getfield        #226 <Field RecyclerView e>
	//   32   72:iconst_1        
	//   33   73:invokevirtual   #235 <Method void RecyclerView.setHasFixedSize(boolean)>
		e.setLayoutManager(((android.support.v7.widget.RecyclerView.h) (new LinearLayoutManager(((android.content.Context) (this)), 1, false))));
	//   34   76:aload_0         
	//   35   77:getfield        #226 <Field RecyclerView e>
	//   36   80:new             #237 <Class LinearLayoutManager>
	//   37   83:dup             
	//   38   84:aload_0         
	//   39   85:iconst_1        
	//   40   86:iconst_0        
	//   41   87:invokespecial   #240 <Method void LinearLayoutManager(android.content.Context, int, boolean)>
	//   42   90:invokevirtual   #244 <Method void RecyclerView.setLayoutManager(android.support.v7.widget.RecyclerView$h)>
	//   43   93:return          
	}

	public void f()
	{
		k.sendCommand(AccountUIServiceCommand.BetaProgramTipDismissed, ((AccountUIServiceData) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field AccountService k>
	//    2    4:getstatic       #247 <Field AccountUIServiceCommand AccountUIServiceCommand.BetaProgramTipDismissed>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #184 <Method void AccountService.sendCommand(AccountUIServiceCommand, AccountUIServiceData)>
	//    5   11:return          
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(0x7f0c0000, menu);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #253 <Method MenuInflater getMenuInflater()>
	//    2    4:ldc1            #254 <Int 0x7f0c0000>
	//    3    6:aload_1         
	//    4    7:invokevirtual   #260 <Method void MenuInflater.inflate(int, Menu)>
		return super.onCreateOptionsMenu(menu);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokespecial   #262 <Method boolean BasePushNotificationActivity.onCreateOptionsMenu(Menu)>
	//    8   15:ireturn         
	}

	public boolean onMenuOpened(int i1, Menu menu)
	{
		if(i1 == 108 && menu != null)
	//*   0    0:iload_1         
	//*   1    1:bipush          108
	//*   2    3:icmpne          22
	//*   3    6:aload_2         
	//*   4    7:ifnull          22
			AnalyticsSubsystem.getInstance().trackBetaProgramThreeDotsButtonPressed(com.irobot.home.util.j.j().a());
	//    5   10:invokestatic    #190 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    6   13:invokestatic    #201 <Method a j.j()>
	//    7   16:invokevirtual   #206 <Method com.irobot.core.AssetInfo a.a()>
	//    8   19:invokevirtual   #268 <Method void AnalyticsSubsystem.trackBetaProgramThreeDotsButtonPressed(com.irobot.core.AssetInfo)>
		return super.onMenuOpened(i1, menu);
	//    9   22:aload_0         
	//   10   23:iload_1         
	//   11   24:aload_2         
	//   12   25:invokespecial   #270 <Method boolean BasePushNotificationActivity.onMenuOpened(int, Menu)>
	//   13   28:ireturn         
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		if(menuitem.getItemId() != 0x7f090075)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #277 <Method int MenuItem.getItemId()>
	//*   2    6:ldc2            #278 <Int 0x7f090075>
	//*   3    9:icmpeq          24
			com.irobot.home.util.o.e(h, "Undefined menu item clicked.");
	//    4   12:getstatic       #139 <Field String h>
	//    5   15:ldc2            #280 <String "Undefined menu item clicked.">
	//    6   18:invokestatic    #285 <Method void o.e(String, String)>
		else
	//*   7   21:goto            28
			i();
	//    8   24:aload_0         
	//    9   25:invokespecial   #287 <Method void i()>
		return true;
	//   10   28:iconst_1        
	//   11   29:ireturn         
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #290 <Method void BasePushNotificationActivity.onPause()>
		c.setVisibility(8);
	//    2    4:aload_0         
	//    3    5:getfield        #292 <Field ProgressBar c>
	//    4    8:bipush          8
	//    5   10:invokevirtual   #295 <Method void ProgressBar.setVisibility(int)>
	//    6   13:return          
	}

	protected void onPostCreate(Bundle bundle)
	{
		super.onPostCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #299 <Method void BasePushNotificationActivity.onPostCreate(Bundle)>
		h();
	//    3    5:aload_0         
	//    4    6:invokespecial   #301 <Method void h()>
	//    5    9:return          
	}

	public void onPostCreate(Bundle bundle, PersistableBundle persistablebundle)
	{
		super.onPostCreate(bundle, persistablebundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #304 <Method void BasePushNotificationActivity.onPostCreate(Bundle, PersistableBundle)>
		h();
	//    4    6:aload_0         
	//    5    7:invokespecial   #301 <Method void h()>
	//    6   10:return          
	}

	public boolean onPrepareOptionsMenu(Menu menu)
	{
		if(j == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #307 <Field MenuItem j>
	//*   2    4:ifnonnull       20
			j = menu.findItem(0x7f090075);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:ldc2            #278 <Int 0x7f090075>
	//    6   12:invokeinterface #313 <Method MenuItem Menu.findItem(int)>
	//    7   17:putfield        #307 <Field MenuItem j>
		j.setEnabled(o);
	//    8   20:aload_0         
	//    9   21:getfield        #307 <Field MenuItem j>
	//   10   24:aload_0         
	//   11   25:getfield        #133 <Field boolean o>
	//   12   28:invokeinterface #317 <Method MenuItem MenuItem.setEnabled(boolean)>
	//   13   33:pop             
		return super.onPrepareOptionsMenu(menu);
	//   14   34:aload_0         
	//   15   35:aload_1         
	//   16   36:invokespecial   #319 <Method boolean BasePushNotificationActivity.onPrepareOptionsMenu(Menu)>
	//   17   39:ireturn         
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #322 <Method void BasePushNotificationActivity.onResume()>
		a(true);
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokespecial   #69  <Method void a(boolean)>
	//    5    9:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #325 <Method void BasePushNotificationActivity.onStart()>
		k.registerUISubscriber(a);
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field AccountService k>
	//    4    8:aload_0         
	//    5    9:getfield        #55  <Field AccountUIServiceDataCallback a>
	//    6   12:invokevirtual   #329 <Method boolean AccountService.registerUISubscriber(AccountUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #332 <Method void BasePushNotificationActivity.onStop()>
		k.unregisterSubscriber(a);
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field AccountService k>
	//    4    8:aload_0         
	//    5    9:getfield        #55  <Field AccountUIServiceDataCallback a>
	//    6   12:invokevirtual   #335 <Method boolean AccountService.unregisterSubscriber(AccountUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	private static final String h = "BetaFeaturesActivity";
	private static boolean i = true;
	AccountUIServiceDataCallback a;
	View b;
	ProgressBar c;
	CustomTextView d;
	RecyclerView e;
	Toolbar f;
	View g;
	private MenuItem j;
	private AccountService k;
	private List l;
	private b m;
	private d n;
	private boolean o;

	static 
	{
	//    0    0:return          
	}
}
