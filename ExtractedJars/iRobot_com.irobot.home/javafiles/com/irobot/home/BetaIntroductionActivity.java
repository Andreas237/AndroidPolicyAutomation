// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomButton;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BasePushNotificationActivity, BetaFeaturesActivity_

public class BetaIntroductionActivity extends BasePushNotificationActivity
{
	private class a extends AccountUIServiceDataCallback
	{

		public void onAccountUIServiceDataChanged(AccountUIServiceData accountuiservicedata)
		{
			if(accountuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       13
			{
				o.e(BetaIntroductionActivity.g(), "null service data");
		//    2    4:invokestatic    #25  <Method String BetaIntroductionActivity.g()>
		//    3    7:ldc1            #27  <String "null service data">
		//    4    9:invokestatic    #33  <Method void o.e(String, String)>
				return;
		//    5   12:return          
			}
			accountuiservicedata = ((AccountUIServiceData) (accountuiservicedata.getViewStates()));
		//    6   13:aload_1         
		//    7   14:invokevirtual   #39  <Method ArrayList AccountUIServiceData.getViewStates()>
		//    8   17:astore_1        
			Object obj = ((Object) (BetaIntroductionActivity.g()));
		//    9   18:invokestatic    #25  <Method String BetaIntroductionActivity.g()>
		//   10   21:astore          4
			StringBuilder stringbuilder = new StringBuilder();
		//   11   23:new             #41  <Class StringBuilder>
		//   12   26:dup             
		//   13   27:invokespecial   #42  <Method void StringBuilder()>
		//   14   30:astore          5
			stringbuilder.append("View change list: ");
		//   15   32:aload           5
		//   16   34:ldc1            #44  <String "View change list: ">
		//   17   36:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   18   39:pop             
			stringbuilder.append(((ArrayList) (accountuiservicedata)).toString());
		//   19   40:aload           5
		//   20   42:aload_1         
		//   21   43:invokevirtual   #53  <Method String ArrayList.toString()>
		//   22   46:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   23   49:pop             
			o.b(((String) (obj)), stringbuilder.toString());
		//   24   50:aload           4
		//   25   52:aload           5
		//   26   54:invokevirtual   #54  <Method String StringBuilder.toString()>
		//   27   57:invokestatic    #57  <Method void o.b(String, String)>
			obj = ((Object) (((ArrayList) (accountuiservicedata)).iterator()));
		//   28   60:aload_1         
		//   29   61:invokevirtual   #61  <Method Iterator ArrayList.iterator()>
		//   30   64:astore          4
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
		//   31   66:aload           4
		//   32   68:invokeinterface #67  <Method boolean Iterator.hasNext()>
		//   33   73:ifeq            202
				accountuiservicedata = ((AccountUIServiceData) ((AccountViewState)((Iterator) (obj)).next()));
		//   34   76:aload           4
		//   35   78:invokeinterface #71  <Method Object Iterator.next()>
		//   36   83:checkcast       #73  <Class AccountViewState>
		//   37   86:astore_1        
				static class _cls1
				{

					static final int a[];

					static 
					{
						a = new int[AccountViewState.values().length];
					//    0    0:invokestatic    #18  <Method AccountViewState[] AccountViewState.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #20  <Field int[] a>
						try
						{
							a[AccountViewState.ShowLoadingIndicator.ordinal()] = 1;
					//    4    9:getstatic       #20  <Field int[] a>
					//    5   12:getstatic       #24  <Field AccountViewState AccountViewState.ShowLoadingIndicator>
					//    6   15:invokevirtual   #28  <Method int AccountViewState.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #20  <Field int[] a>
					//*  10   23:getstatic       #31  <Field AccountViewState AccountViewState.HideLoadingIndicator>
					//*  11   26:invokevirtual   #28  <Method int AccountViewState.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:getstatic       #20  <Field int[] a>
					//*  15   34:getstatic       #34  <Field AccountViewState AccountViewState.NavigateToBetaProgramMainPage>
					//*  16   37:invokevirtual   #28  <Method int AccountViewState.ordinal()>
					//*  17   40:iconst_3        
					//*  18   41:iastore         
					//*  19   42:getstatic       #20  <Field int[] a>
					//*  20   45:getstatic       #37  <Field AccountViewState AccountViewState.ShowRequestErrorMessage>
					//*  21   48:invokevirtual   #28  <Method int AccountViewState.ordinal()>
					//*  22   51:iconst_4        
					//*  23   52:iastore         
					//*  24   53:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//   25   54:astore_0        
						try
						{
							a[AccountViewState.HideLoadingIndicator.ordinal()] = 2;
						}
					//*  26   55:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//   27   58:astore_0        
						try
						{
							a[AccountViewState.NavigateToBetaProgramMainPage.ordinal()] = 3;
						}
					//*  28   59:goto            31
						catch(NoSuchFieldError nosuchfielderror2) { }
					//   29   62:astore_0        
						try
						{
							a[AccountViewState.ShowRequestErrorMessage.ordinal()] = 4;
						}
					//*  30   63:goto            42
						catch(NoSuchFieldError nosuchfielderror3) { }
					//   31   66:astore_0        
					//*  32   67:return          
					}
				}

				int i = com.irobot.home._cls1.a[((AccountViewState) (accountuiservicedata)).ordinal()];
		//   38   87:getstatic       #78  <Field int[] com.irobot.home.BetaIntroductionActivity$1.a>
		//   39   90:aload_1         
		//   40   91:invokevirtual   #82  <Method int AccountViewState.ordinal()>
		//   41   94:iaload          
		//   42   95:istore_3        
				byte byte0 = 0;
		//   43   96:iconst_0        
		//   44   97:istore_2        
				switch(i)
		//*  45   98:iload_3         
				{
		//*  46   99:tableswitch     1 4: default 128
		//		               1 186
		//		               2 172
		//		               3 158
		//		               4 131
				default:
					continue;
		//   47  128:goto            66

				case 4: // '\004'
					Toast.makeText(((android.content.Context) (a)), 0x7f0f00ca, 0).show();
		//   48  131:aload_0         
		//   49  132:getfield        #12  <Field BetaIntroductionActivity a>
		//   50  135:ldc1            #83  <Int 0x7f0f00ca>
		//   51  137:iconst_0        
		//   52  138:invokestatic    #89  <Method Toast Toast.makeText(android.content.Context, int, int)>
		//   53  141:invokevirtual   #92  <Method void Toast.show()>
					a.d.setEnabled(true);
		//   54  144:aload_0         
		//   55  145:getfield        #12  <Field BetaIntroductionActivity a>
		//   56  148:getfield        #96  <Field CustomButton BetaIntroductionActivity.d>
		//   57  151:iconst_1        
		//   58  152:invokevirtual   #102 <Method void CustomButton.setEnabled(boolean)>
					continue;
		//   59  155:goto            66

				case 3: // '\003'
					com.irobot.home.BetaFeaturesActivity_.a(((android.content.Context) (a))).a();
		//   60  158:aload_0         
		//   61  159:getfield        #12  <Field BetaIntroductionActivity a>
		//   62  162:invokestatic    #107 <Method BetaFeaturesActivity_$a com.irobot.home.BetaFeaturesActivity_.a(android.content.Context)>
		//   63  165:invokevirtual   #112 <Method org.androidannotations.api.a.e com.irobot.home.BetaFeaturesActivity_$a.a()>
		//   64  168:pop             
					continue;
		//   65  169:goto            66

				case 2: // '\002'
					accountuiservicedata = ((AccountUIServiceData) (a.c));
		//   66  172:aload_0         
		//   67  173:getfield        #12  <Field BetaIntroductionActivity a>
		//   68  176:getfield        #116 <Field ProgressBar BetaIntroductionActivity.c>
		//   69  179:astore_1        
					byte0 = 8;
		//   70  180:bipush          8
		//   71  182:istore_2        
					break;
		//   72  183:goto            194

				case 1: // '\001'
					accountuiservicedata = ((AccountUIServiceData) (a.c));
		//   73  186:aload_0         
		//   74  187:getfield        #12  <Field BetaIntroductionActivity a>
		//   75  190:getfield        #116 <Field ProgressBar BetaIntroductionActivity.c>
		//   76  193:astore_1        
					break;
				}
				((ProgressBar) (accountuiservicedata)).setVisibility(((int) (byte0)));
		//   77  194:aload_1         
		//   78  195:iload_2         
		//   79  196:invokevirtual   #122 <Method void ProgressBar.setVisibility(int)>
			} while(true);
		//   80  199:goto            66
		//   81  202:return          
		}

		final BetaIntroductionActivity a;

		private a()
		{
			a = BetaIntroductionActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field BetaIntroductionActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void AccountUIServiceDataCallback()>
		//    5    9:return          
		}

	}


	public BetaIntroductionActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void BasePushNotificationActivity()>
		a = ((AccountUIServiceDataCallback) (new a(((_cls1) (null)))));
	//    2    4:aload_0         
	//    3    5:new             #8   <Class BetaIntroductionActivity$a>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #33  <Method void BetaIntroductionActivity$a(BetaIntroductionActivity, BetaIntroductionActivity$1)>
	//    8   14:putfield        #35  <Field AccountUIServiceDataCallback a>
	//    9   17:return          
	}

	static String g()
	{
		return f;
	//    0    0:getstatic       #38  <Field String f>
	//    1    3:areturn         
	}

	private void h()
	{
		a(b);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field Toolbar b>
	//    3    5:invokevirtual   #44  <Method void a(Toolbar)>
		ActionBar actionbar = a();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #47  <Method ActionBar a()>
	//    6   12:astore_1        
		if(actionbar != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          37
		{
			actionbar.a(((CharSequence) (null)));
	//    9   17:aload_1         
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #52  <Method void ActionBar.a(CharSequence)>
			b(0x7f0f00da);
	//   12   22:aload_0         
	//   13   23:ldc1            #53  <Int 0x7f0f00da>
	//   14   25:invokevirtual   #56  <Method void b(int)>
			e.setVisibility(8);
	//   15   28:aload_0         
	//   16   29:getfield        #58  <Field View e>
	//   17   32:bipush          8
	//   18   34:invokevirtual   #63  <Method void View.setVisibility(int)>
		}
	//   19   37:return          
	}

	void e()
	{
		Object obj = ((Object) (Assembler.getInstance()));
	//    0    0:invokestatic    #69  <Method Assembler Assembler.getInstance()>
	//    1    3:astore_1        
		g = ((Assembler) (obj)).getAccountService();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #73  <Method AccountService Assembler.getAccountService()>
	//    5    9:putfield        #75  <Field AccountService g>
		obj = ((Object) (((Assembler) (obj)).getAccountService()));
	//    6   12:aload_1         
	//    7   13:invokevirtual   #73  <Method AccountService Assembler.getAccountService()>
	//    8   16:astore_1        
		if(!((AccountService) (obj)).getValueForAccountFlag(AccountFlagType.BetaViewed))
	//*   9   17:aload_1         
	//*  10   18:getstatic       #81  <Field AccountFlagType AccountFlagType.BetaViewed>
	//*  11   21:invokevirtual   #87  <Method boolean AccountService.getValueForAccountFlag(AccountFlagType)>
	//*  12   24:ifne            35
			((AccountService) (obj)).updateAccountFlag(AccountFlagType.BetaViewed, true);
	//   13   27:aload_1         
	//   14   28:getstatic       #81  <Field AccountFlagType AccountFlagType.BetaViewed>
	//   15   31:iconst_1        
	//   16   32:invokevirtual   #91  <Method void AccountService.updateAccountFlag(AccountFlagType, boolean)>
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.BetaProgramIntro, j.j().a());
	//   17   35:invokestatic    #96  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   18   38:getstatic       #102 <Field ViewId ViewId.BetaProgramIntro>
	//   19   41:invokestatic    #108 <Method a j.j()>
	//   20   44:invokevirtual   #113 <Method com.irobot.core.AssetInfo a.a()>
	//   21   47:invokevirtual   #117 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, com.irobot.core.AssetInfo)>
	//   22   50:return          
	}

	public void f()
	{
		AnalyticsSubsystem.getInstance().trackBetaProgramIWantInButtonPressed(j.j().a());
	//    0    0:invokestatic    #96  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    1    3:invokestatic    #108 <Method a j.j()>
	//    2    6:invokevirtual   #113 <Method com.irobot.core.AssetInfo a.a()>
	//    3    9:invokevirtual   #121 <Method void AnalyticsSubsystem.trackBetaProgramIWantInButtonPressed(com.irobot.core.AssetInfo)>
		d.setEnabled(false);
	//    4   12:aload_0         
	//    5   13:getfield        #123 <Field CustomButton d>
	//    6   16:iconst_0        
	//    7   17:invokevirtual   #129 <Method void CustomButton.setEnabled(boolean)>
		AccountUIServiceData accountuiservicedata = AccountUIServiceData.create();
	//    8   20:invokestatic    #135 <Method AccountUIServiceData AccountUIServiceData.create()>
	//    9   23:astore_1        
		accountuiservicedata.setBetaEnrollmentChanged(true);
	//   10   24:aload_1         
	//   11   25:iconst_1        
	//   12   26:invokevirtual   #138 <Method void AccountUIServiceData.setBetaEnrollmentChanged(boolean)>
		g.sendCommand(AccountUIServiceCommand.BetaEnrollmentChanged, accountuiservicedata);
	//   13   29:aload_0         
	//   14   30:getfield        #75  <Field AccountService g>
	//   15   33:getstatic       #144 <Field AccountUIServiceCommand AccountUIServiceCommand.BetaEnrollmentChanged>
	//   16   36:aload_1         
	//   17   37:invokevirtual   #148 <Method void AccountService.sendCommand(AccountUIServiceCommand, AccountUIServiceData)>
	//   18   40:return          
	}

	protected void onPostCreate(Bundle bundle)
	{
		super.onPostCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #152 <Method void BasePushNotificationActivity.onPostCreate(Bundle)>
		h();
	//    3    5:aload_0         
	//    4    6:invokespecial   #154 <Method void h()>
	//    5    9:return          
	}

	public void onPostCreate(Bundle bundle, PersistableBundle persistablebundle)
	{
		super.onPostCreate(bundle, persistablebundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #157 <Method void BasePushNotificationActivity.onPostCreate(Bundle, PersistableBundle)>
		h();
	//    4    6:aload_0         
	//    5    7:invokespecial   #154 <Method void h()>
	//    6   10:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #160 <Method void BasePushNotificationActivity.onStart()>
		g.registerUISubscriber(a);
	//    2    4:aload_0         
	//    3    5:getfield        #75  <Field AccountService g>
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field AccountUIServiceDataCallback a>
	//    6   12:invokevirtual   #164 <Method boolean AccountService.registerUISubscriber(AccountUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #167 <Method void BasePushNotificationActivity.onStop()>
		g.unregisterSubscriber(a);
	//    2    4:aload_0         
	//    3    5:getfield        #75  <Field AccountService g>
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field AccountUIServiceDataCallback a>
	//    6   12:invokevirtual   #170 <Method boolean AccountService.unregisterSubscriber(AccountUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	private static final String f = "BetaIntroductionActivity";
	AccountUIServiceDataCallback a;
	Toolbar b;
	ProgressBar c;
	CustomButton d;
	View e;
	private AccountService g;

	static 
	{
	//    0    0:return          
	}
}
