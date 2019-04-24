// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.widget.*;
import com.irobot.core.*;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.*;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity

public class NotificationSettingsActivity extends BaseFragmentActivity
	implements android.widget.CompoundButton.OnCheckedChangeListener
{
	private class a extends AccountUIServiceDataCallback
	{

		public void onAccountUIServiceDataChanged(AccountUIServiceData accountuiservicedata)
		{
			if(accountuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       13
			{
				o.e(NotificationSettingsActivity.f(), "service data is null");
		//    2    4:invokestatic    #25  <Method String NotificationSettingsActivity.f()>
		//    3    7:ldc1            #27  <String "service data is null">
		//    4    9:invokestatic    #33  <Method void o.e(String, String)>
				return;
		//    5   12:return          
			}
			Object obj = ((Object) (accountuiservicedata.getViewStates()));
		//    6   13:aload_1         
		//    7   14:invokevirtual   #39  <Method ArrayList AccountUIServiceData.getViewStates()>
		//    8   17:astore_2        
			String s = NotificationSettingsActivity.f();
		//    9   18:invokestatic    #25  <Method String NotificationSettingsActivity.f()>
		//   10   21:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
		//   11   22:new             #41  <Class StringBuilder>
		//   12   25:dup             
		//   13   26:invokespecial   #42  <Method void StringBuilder()>
		//   14   29:astore          4
			stringbuilder.append("View change list: ");
		//   15   31:aload           4
		//   16   33:ldc1            #44  <String "View change list: ">
		//   17   35:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   18   38:pop             
			stringbuilder.append(((ArrayList) (obj)).toString());
		//   19   39:aload           4
		//   20   41:aload_2         
		//   21   42:invokevirtual   #53  <Method String ArrayList.toString()>
		//   22   45:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   23   48:pop             
			o.b(s, stringbuilder.toString());
		//   24   49:aload_3         
		//   25   50:aload           4
		//   26   52:invokevirtual   #54  <Method String StringBuilder.toString()>
		//   27   55:invokestatic    #57  <Method void o.b(String, String)>
			obj = ((Object) (((ArrayList) (obj)).iterator()));
		//   28   58:aload_2         
		//   29   59:invokevirtual   #61  <Method Iterator ArrayList.iterator()>
		//   30   62:astore_2        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
		//   31   63:aload_2         
		//   32   64:invokeinterface #67  <Method boolean Iterator.hasNext()>
		//   33   69:ifeq            185
				AccountViewState accountviewstate = (AccountViewState)((Iterator) (obj)).next();
		//   34   72:aload_2         
		//   35   73:invokeinterface #71  <Method Object Iterator.next()>
		//   36   78:checkcast       #73  <Class AccountViewState>
		//   37   81:astore_3        
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
							a[AccountViewState.ShowLoadingSpinner.ordinal()] = 1;
					//    4    9:getstatic       #20  <Field int[] a>
					//    5   12:getstatic       #24  <Field AccountViewState AccountViewState.ShowLoadingSpinner>
					//    6   15:invokevirtual   #28  <Method int AccountViewState.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #20  <Field int[] a>
					//*  10   23:getstatic       #31  <Field AccountViewState AccountViewState.ShowNotificationEmailSetting>
					//*  11   26:invokevirtual   #28  <Method int AccountViewState.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:getstatic       #20  <Field int[] a>
					//*  15   34:getstatic       #34  <Field AccountViewState AccountViewState.ShowNotificationSettingsErrorDialog>
					//*  16   37:invokevirtual   #28  <Method int AccountViewState.ordinal()>
					//*  17   40:iconst_3        
					//*  18   41:iastore         
					//*  19   42:getstatic       #20  <Field int[] a>
					//*  20   45:getstatic       #37  <Field AccountViewState AccountViewState.ShowNotificationSettingsFailure>
					//*  21   48:invokevirtual   #28  <Method int AccountViewState.ordinal()>
					//*  22   51:iconst_4        
					//*  23   52:iastore         
					//*  24   53:getstatic       #20  <Field int[] a>
					//*  25   56:getstatic       #40  <Field AccountViewState AccountViewState.ShowNotificationSettingsUpdate>
					//*  26   59:invokevirtual   #28  <Method int AccountViewState.ordinal()>
					//*  27   62:iconst_5        
					//*  28   63:iastore         
					//*  29   64:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//   30   65:astore_0        
						try
						{
							a[AccountViewState.ShowNotificationEmailSetting.ordinal()] = 2;
						}
					//*  31   66:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//   32   69:astore_0        
						try
						{
							a[AccountViewState.ShowNotificationSettingsErrorDialog.ordinal()] = 3;
						}
					//*  33   70:goto            31
						catch(NoSuchFieldError nosuchfielderror2) { }
					//   34   73:astore_0        
						try
						{
							a[AccountViewState.ShowNotificationSettingsFailure.ordinal()] = 4;
						}
					//*  35   74:goto            42
						catch(NoSuchFieldError nosuchfielderror3) { }
					//   36   77:astore_0        
						try
						{
							a[AccountViewState.ShowNotificationSettingsUpdate.ordinal()] = 5;
						}
					//*  37   78:goto            53
						catch(NoSuchFieldError nosuchfielderror4) { }
					//   38   81:astore_0        
					//*  39   82:return          
					}
				}

				switch(_cls1.a[accountviewstate.ordinal()])
		//*  38   82:getstatic       #78  <Field int[] NotificationSettingsActivity$1.a>
		//*  39   85:aload_3         
		//*  40   86:invokevirtual   #82  <Method int AccountViewState.ordinal()>
		//*  41   89:iaload          
				{
		//*  42   90:tableswitch     1 5: default 124
		//		               1 175
		//		               2 165
		//		               3 155
		//		               4 141
		//		               5 127
		//*  43  124:goto            63
				case 5: // '\005'
					NotificationSettingsActivity.a(a, accountuiservicedata.getUpdatedPushNotificationSetting());
		//   44  127:aload_0         
		//   45  128:getfield        #12  <Field NotificationSettingsActivity a>
		//   46  131:aload_1         
		//   47  132:invokevirtual   #85  <Method ArrayList AccountUIServiceData.getUpdatedPushNotificationSetting()>
		//   48  135:invokestatic    #88  <Method void NotificationSettingsActivity.a(NotificationSettingsActivity, ArrayList)>
					break;

		//*  49  138:goto            63
				case 4: // '\004'
					NotificationSettingsActivity.a(a, accountuiservicedata.getFailedPushNotificationSettingStatus());
		//   50  141:aload_0         
		//   51  142:getfield        #12  <Field NotificationSettingsActivity a>
		//   52  145:aload_1         
		//   53  146:invokevirtual   #92  <Method PushNotificationsGetSettingsFailedStatus AccountUIServiceData.getFailedPushNotificationSettingStatus()>
		//   54  149:invokestatic    #95  <Method void NotificationSettingsActivity.a(NotificationSettingsActivity, PushNotificationsGetSettingsFailedStatus)>
					break;

		//*  55  152:goto            63
				case 3: // '\003'
					NotificationSettingsActivity.c(a);
		//   56  155:aload_0         
		//   57  156:getfield        #12  <Field NotificationSettingsActivity a>
		//   58  159:invokestatic    #98  <Method void NotificationSettingsActivity.c(NotificationSettingsActivity)>
					break;

		//*  59  162:goto            63
				case 2: // '\002'
					NotificationSettingsActivity.b(a);
		//   60  165:aload_0         
		//   61  166:getfield        #12  <Field NotificationSettingsActivity a>
		//   62  169:invokestatic    #100 <Method void NotificationSettingsActivity.b(NotificationSettingsActivity)>
					break;

		//*  63  172:goto            63
				case 1: // '\001'
					NotificationSettingsActivity.a(a);
		//   64  175:aload_0         
		//   65  176:getfield        #12  <Field NotificationSettingsActivity a>
		//   66  179:invokestatic    #102 <Method void NotificationSettingsActivity.a(NotificationSettingsActivity)>
					break;
				}
			} while(true);
		//*  67  182:goto            63
		//   68  185:return          
		}

		final NotificationSettingsActivity a;

		private a()
		{
			a = NotificationSettingsActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field NotificationSettingsActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void AccountUIServiceDataCallback()>
		//    5    9:return          
		}

	}


	public NotificationSettingsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void BaseFragmentActivity()>
		h = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #55  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #56  <Method void HashMap()>
	//    6   12:putfield        #58  <Field Map h>
		i = ((Map) (new HashMap()));
	//    7   15:aload_0         
	//    8   16:new             #55  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #56  <Method void HashMap()>
	//   11   23:putfield        #60  <Field Map i>
		j = null;
	//   12   26:aload_0         
	//   13   27:aconst_null     
	//   14   28:putfield        #62  <Field AlertDialog j>
		l = ((AccountUIServiceDataCallback) (new a(((_cls1) (null)))));
	//   15   31:aload_0         
	//   16   32:new             #10  <Class NotificationSettingsActivity$a>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:aconst_null     
	//   20   38:invokespecial   #65  <Method void NotificationSettingsActivity$a(NotificationSettingsActivity, NotificationSettingsActivity$1)>
	//   21   41:putfield        #67  <Field AccountUIServiceDataCallback l>
	//   22   44:return          
	}

	private void a(RelativeLayout relativelayout, int i1, int j1)
	{
		k = com.irobot.home.util.j.a(relativelayout, getString(i1), ((android.widget.CompoundButton.OnCheckedChangeListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:iload_2         
	//    4    4:invokevirtual   #72  <Method String getString(int)>
	//    5    7:aconst_null     
	//    6    8:invokestatic    #75  <Method SwitchCompat j.a(RelativeLayout, String, android.widget.CompoundButton$OnCheckedChangeListener)>
	//    7   11:putfield        #77  <Field SwitchCompat k>
		com.irobot.home.util.j.a(relativelayout, getString(j1));
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:iload_3         
	//   11   17:invokevirtual   #72  <Method String getString(int)>
	//   12   20:invokestatic    #80  <Method void j.a(RelativeLayout, String)>
		boolean flag = Assembler.getInstance().getAccountService().getAccountInfo().promoOptIn();
	//   13   23:invokestatic    #86  <Method Assembler Assembler.getInstance()>
	//   14   26:invokevirtual   #90  <Method AccountService Assembler.getAccountService()>
	//   15   29:invokevirtual   #96  <Method AccountInfo AccountService.getAccountInfo()>
	//   16   32:invokevirtual   #102 <Method boolean AccountInfo.promoOptIn()>
	//   17   35:istore          4
		k.setChecked(flag);
	//   18   37:aload_0         
	//   19   38:getfield        #77  <Field SwitchCompat k>
	//   20   41:iload           4
	//   21   43:invokevirtual   #108 <Method void SwitchCompat.setChecked(boolean)>
		k.setOnCheckedChangeListener(((android.widget.CompoundButton.OnCheckedChangeListener) (this)));
	//   22   46:aload_0         
	//   23   47:getfield        #77  <Field SwitchCompat k>
	//   24   50:aload_0         
	//   25   51:invokevirtual   #112 <Method void SwitchCompat.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
	//   26   54:return          
	}

	private void a(PushNotificationType pushnotificationtype, RelativeLayout relativelayout, int i1, int j1)
	{
		SwitchCompat switchcompat = com.irobot.home.util.j.a(relativelayout, getString(i1), ((android.widget.CompoundButton.OnCheckedChangeListener) (null)));
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #72  <Method String getString(int)>
	//    4    6:aconst_null     
	//    5    7:invokestatic    #75  <Method SwitchCompat j.a(RelativeLayout, String, android.widget.CompoundButton$OnCheckedChangeListener)>
	//    6   10:astore          5
		com.irobot.home.util.j.a(relativelayout, getString(j1));
	//    7   12:aload_2         
	//    8   13:aload_0         
	//    9   14:iload           4
	//   10   16:invokevirtual   #72  <Method String getString(int)>
	//   11   19:invokestatic    #80  <Method void j.a(RelativeLayout, String)>
		i.put(((Object) (pushnotificationtype)), ((Object) (relativelayout)));
	//   12   22:aload_0         
	//   13   23:getfield        #60  <Field Map i>
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//   17   33:pop             
		h.put(((Object) (pushnotificationtype)), ((Object) (switchcompat)));
	//   18   34:aload_0         
	//   19   35:getfield        #58  <Field Map h>
	//   20   38:aload_1         
	//   21   39:aload           5
	//   22   41:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//   23   46:pop             
	//   24   47:return          
	}

	private void a(PushNotificationsGetSettingsFailedStatus pushnotificationsgetsettingsfailedstatus)
	{
		a(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #122 <Method void a(boolean)>
		f(0x7f0f0542);
	//    3    5:aload_0         
	//    4    6:ldc1            #123 <Int 0x7f0f0542>
	//    5    8:invokevirtual   #126 <Method void f(int)>
	//    6   11:return          
	}

	static void a(NotificationSettingsActivity notificationsettingsactivity)
	{
		notificationsettingsactivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #129 <Method void g()>
	//    2    4:return          
	}

	static void a(NotificationSettingsActivity notificationsettingsactivity, PushNotificationsGetSettingsFailedStatus pushnotificationsgetsettingsfailedstatus)
	{
		notificationsettingsactivity.a(pushnotificationsgetsettingsfailedstatus);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #132 <Method void a(PushNotificationsGetSettingsFailedStatus)>
	//    3    5:return          
	}

	static void a(NotificationSettingsActivity notificationsettingsactivity, ArrayList arraylist)
	{
		notificationsettingsactivity.b(arraylist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #136 <Method void b(ArrayList)>
	//    3    5:return          
	}

	static void b(NotificationSettingsActivity notificationsettingsactivity)
	{
		notificationsettingsactivity.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #138 <Method void i()>
	//    2    4:return          
	}

	private void b(ArrayList arraylist)
	{
		a(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #122 <Method void a(boolean)>
		a(arraylist);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #140 <Method void a(ArrayList)>
	//    6   10:return          
	}

	static void c(NotificationSettingsActivity notificationsettingsactivity)
	{
		notificationsettingsactivity.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #144 <Method void h()>
	//    2    4:return          
	}

	static String f()
	{
		return g;
	//    0    0:getstatic       #49  <Field String g>
	//    1    3:areturn         
	}

	private void g()
	{
		a(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #122 <Method void a(boolean)>
	//    3    5:return          
	}

	private void h()
	{
		a(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #122 <Method void a(boolean)>
		f(0x7f0f0548);
	//    3    5:aload_0         
	//    4    6:ldc1            #145 <Int 0x7f0f0548>
	//    5    8:invokevirtual   #126 <Method void f(int)>
	//    6   11:return          
	}

	private void i()
	{
		a(e, 0x7f0f0543, 0x7f0f0544);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #147 <Field RelativeLayout e>
	//    3    5:ldc1            #148 <Int 0x7f0f0543>
	//    4    7:ldc1            #149 <Int 0x7f0f0544>
	//    5    9:invokespecial   #151 <Method void a(RelativeLayout, int, int)>
	//    6   12:return          
	}

	protected void a(ArrayList arraylist)
	{
		for(arraylist = ((ArrayList) (arraylist.iterator())); ((Iterator) (arraylist)).hasNext();)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #157 <Method Iterator ArrayList.iterator()>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:invokeinterface #162 <Method boolean Iterator.hasNext()>
	//*   5   11:ifeq            154
		{
			PushNotificationSetting pushnotificationsetting = (PushNotificationSetting)((Iterator) (arraylist)).next();
	//    6   14:aload_1         
	//    7   15:invokeinterface #166 <Method Object Iterator.next()>
	//    8   20:checkcast       #168 <Class PushNotificationSetting>
	//    9   23:astore_3        
			PushNotificationType pushnotificationtype = pushnotificationsetting.type();
	//   10   24:aload_3         
	//   11   25:invokevirtual   #172 <Method PushNotificationType PushNotificationSetting.type()>
	//   12   28:astore          4
			boolean flag = pushnotificationsetting.enabled();
	//   13   30:aload_3         
	//   14   31:invokevirtual   #175 <Method boolean PushNotificationSetting.enabled()>
	//   15   34:istore_2        
			if(i.containsKey(((Object) (pushnotificationtype))))
	//*  16   35:aload_0         
	//*  17   36:getfield        #60  <Field Map i>
	//*  18   39:aload           4
	//*  19   41:invokeinterface #179 <Method boolean Map.containsKey(Object)>
	//*  20   46:ifeq            106
			{
				((SwitchCompat)h.get(((Object) (pushnotificationtype)))).setChecked(flag);
	//   21   49:aload_0         
	//   22   50:getfield        #58  <Field Map h>
	//   23   53:aload           4
	//   24   55:invokeinterface #183 <Method Object Map.get(Object)>
	//   25   60:checkcast       #104 <Class SwitchCompat>
	//   26   63:iload_2         
	//   27   64:invokevirtual   #108 <Method void SwitchCompat.setChecked(boolean)>
				((SwitchCompat)h.get(((Object) (pushnotificationtype)))).setOnCheckedChangeListener(((android.widget.CompoundButton.OnCheckedChangeListener) (this)));
	//   28   67:aload_0         
	//   29   68:getfield        #58  <Field Map h>
	//   30   71:aload           4
	//   31   73:invokeinterface #183 <Method Object Map.get(Object)>
	//   32   78:checkcast       #104 <Class SwitchCompat>
	//   33   81:aload_0         
	//   34   82:invokevirtual   #112 <Method void SwitchCompat.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
				((RelativeLayout)i.get(((Object) (pushnotificationtype)))).setVisibility(0);
	//   35   85:aload_0         
	//   36   86:getfield        #60  <Field Map i>
	//   37   89:aload           4
	//   38   91:invokeinterface #183 <Method Object Map.get(Object)>
	//   39   96:checkcast       #185 <Class RelativeLayout>
	//   40   99:iconst_0        
	//   41  100:invokevirtual   #188 <Method void RelativeLayout.setVisibility(int)>
			} else
	//*  42  103:goto            5
			{
				String s = g;
	//   43  106:getstatic       #49  <Field String g>
	//   44  109:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   45  111:new             #190 <Class StringBuilder>
	//   46  114:dup             
	//   47  115:invokespecial   #191 <Method void StringBuilder()>
	//   48  118:astore          5
				stringbuilder.append("Unsupported PushNotificationType: ");
	//   49  120:aload           5
	//   50  122:ldc1            #193 <String "Unsupported PushNotificationType: ">
	//   51  124:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   52  127:pop             
				stringbuilder.append(pushnotificationsetting.type().name());
	//   53  128:aload           5
	//   54  130:aload_3         
	//   55  131:invokevirtual   #172 <Method PushNotificationType PushNotificationSetting.type()>
	//   56  134:invokevirtual   #202 <Method String PushNotificationType.name()>
	//   57  137:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   58  140:pop             
				o.d(s, stringbuilder.toString());
	//   59  141:aload           4
	//   60  143:aload           5
	//   61  145:invokevirtual   #205 <Method String StringBuilder.toString()>
	//   62  148:invokestatic    #210 <Method void o.d(String, String)>
			}
		}

	//*  63  151:goto            5
	//   64  154:return          
	}

	protected void a(boolean flag)
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #213 <Method boolean isFinishing()>
	//*   2    4:ifne            36
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #216 <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			ProgressBar progressbar = f;
	//    7   15:aload_0         
	//    8   16:getfield        #218 <Field ProgressBar f>
	//    9   19:astore_3        
			byte byte0;
			if(flag)
	//*  10   20:iload_1         
	//*  11   21:ifeq            29
				byte0 = 0;
	//   12   24:iconst_0        
	//   13   25:istore_2        
			else
	//*  14   26:goto            31
				byte0 = 4;
	//   15   29:iconst_4        
	//   16   30:istore_2        
			progressbar.setVisibility(((int) (byte0)));
	//   17   31:aload_3         
	//   18   32:iload_2         
	//   19   33:invokevirtual   #221 <Method void ProgressBar.setVisibility(int)>
		}
	//   20   36:return          
	}

	protected void e()
	{
		b(0x7f0f0539);
	//    0    0:aload_0         
	//    1    1:ldc1            #222 <Int 0x7f0f0539>
	//    2    3:invokevirtual   #224 <Method void b(int)>
		a(PushNotificationType.CleaningReport, a, 0x7f0f0540, 0x7f0f053f);
	//    3    6:aload_0         
	//    4    7:getstatic       #228 <Field PushNotificationType PushNotificationType.CleaningReport>
	//    5   10:aload_0         
	//    6   11:getfield        #230 <Field RelativeLayout a>
	//    7   14:ldc1            #231 <Int 0x7f0f0540>
	//    8   16:ldc1            #232 <Int 0x7f0f053f>
	//    9   18:invokespecial   #234 <Method void a(PushNotificationType, RelativeLayout, int, int)>
		a(PushNotificationType.CleaningStopError, b, 0x7f0f053e, 0x7f0f053d);
	//   10   21:aload_0         
	//   11   22:getstatic       #237 <Field PushNotificationType PushNotificationType.CleaningStopError>
	//   12   25:aload_0         
	//   13   26:getfield        #239 <Field RelativeLayout b>
	//   14   29:ldc1            #240 <Int 0x7f0f053e>
	//   15   31:ldc1            #241 <Int 0x7f0f053d>
	//   16   33:invokespecial   #234 <Method void a(PushNotificationType, RelativeLayout, int, int)>
		a(PushNotificationType.BinFull, c, 0x7f0f053b, 0x7f0f053a);
	//   17   36:aload_0         
	//   18   37:getstatic       #244 <Field PushNotificationType PushNotificationType.BinFull>
	//   19   40:aload_0         
	//   20   41:getfield        #246 <Field RelativeLayout c>
	//   21   44:ldc1            #247 <Int 0x7f0f053b>
	//   22   46:ldc1            #248 <Int 0x7f0f053a>
	//   23   48:invokespecial   #234 <Method void a(PushNotificationType, RelativeLayout, int, int)>
		a(PushNotificationType.Ota, d, 0x7f0f0546, 0x7f0f0545);
	//   24   51:aload_0         
	//   25   52:getstatic       #251 <Field PushNotificationType PushNotificationType.Ota>
	//   26   55:aload_0         
	//   27   56:getfield        #253 <Field RelativeLayout d>
	//   28   59:ldc1            #254 <Int 0x7f0f0546>
	//   29   61:ldc1            #255 <Int 0x7f0f0545>
	//   30   63:invokespecial   #234 <Method void a(PushNotificationType, RelativeLayout, int, int)>
		m = Assembler.getInstance().getAccountService();
	//   31   66:aload_0         
	//   32   67:invokestatic    #86  <Method Assembler Assembler.getInstance()>
	//   33   70:invokevirtual   #90  <Method AccountService Assembler.getAccountService()>
	//   34   73:putfield        #257 <Field AccountService m>
	//   35   76:return          
	}

	protected void f(int i1)
	{
		if(j == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field AlertDialog j>
	//*   2    4:ifnonnull       41
			j = (new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(i1).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).create();
	//    3    7:aload_0         
	//    4    8:new             #259 <Class android.app.AlertDialog$Builder>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #262 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #266 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   10   20:ldc2            #267 <Int 0x7f0f05bb>
	//   11   23:aconst_null     
	//   12   24:invokevirtual   #271 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   13   27:invokevirtual   #275 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   14   30:putfield        #62  <Field AlertDialog j>
		else
	//*  15   33:aload_0         
	//*  16   34:getfield        #62  <Field AlertDialog j>
	//*  17   37:invokevirtual   #280 <Method void AlertDialog.show()>
	//*  18   40:return          
		if(!j.isShowing())
	//*  19   41:aload_0         
	//*  20   42:getfield        #62  <Field AlertDialog j>
	//*  21   45:invokevirtual   #283 <Method boolean AlertDialog.isShowing()>
	//*  22   48:ifne            66
			j.setMessage(((CharSequence) (getString(i1))));
	//   23   51:aload_0         
	//   24   52:getfield        #62  <Field AlertDialog j>
	//   25   55:aload_0         
	//   26   56:iload_1         
	//   27   57:invokevirtual   #72  <Method String getString(int)>
	//   28   60:invokevirtual   #286 <Method void AlertDialog.setMessage(CharSequence)>
		else
	//*  29   63:goto            33
			return;
	//   30   66:return          
		j.show();
	}

	public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
	{
		if(compoundbutton == k)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #77  <Field SwitchCompat k>
	//*   3    5:if_acmpne       32
		{
			AccountUIServiceData accountuiservicedata = AccountUIServiceData.create();
	//    4    8:invokestatic    #293 <Method AccountUIServiceData AccountUIServiceData.create()>
	//    5   11:astore_3        
			accountuiservicedata.setEmailOptIn(compoundbutton.isChecked());
	//    6   12:aload_3         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #298 <Method boolean CompoundButton.isChecked()>
	//    9   17:invokevirtual   #301 <Method void AccountUIServiceData.setEmailOptIn(boolean)>
			m.sendCommand(AccountUIServiceCommand.UpdateEmailOptIn, accountuiservicedata);
	//   10   20:aload_0         
	//   11   21:getfield        #257 <Field AccountService m>
	//   12   24:getstatic       #307 <Field AccountUIServiceCommand AccountUIServiceCommand.UpdateEmailOptIn>
	//   13   27:aload_3         
	//   14   28:invokevirtual   #311 <Method void AccountService.sendCommand(AccountUIServiceCommand, AccountUIServiceData)>
			return;
	//   15   31:return          
		}
		Iterator iterator = h.entrySet().iterator();
	//   16   32:aload_0         
	//   17   33:getfield        #58  <Field Map h>
	//   18   36:invokeinterface #315 <Method Set Map.entrySet()>
	//   19   41:invokeinterface #318 <Method Iterator Set.iterator()>
	//   20   46:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   21   47:aload_3         
	//   22   48:invokeinterface #162 <Method boolean Iterator.hasNext()>
	//   23   53:ifeq            98
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   24   56:aload_3         
	//   25   57:invokeinterface #166 <Method Object Iterator.next()>
	//   26   62:checkcast       #320 <Class java.util.Map$Entry>
	//   27   65:astore          4
			if(compoundbutton != entry.getValue())
				continue;
	//   28   67:aload_1         
	//   29   68:aload           4
	//   30   70:invokeinterface #323 <Method Object java.util.Map$Entry.getValue()>
	//   31   75:if_acmpne       47
			Assembler.getInstance().getPushNotificationService().updatePushNotificationSetting((PushNotificationType)entry.getKey(), flag);
	//   32   78:invokestatic    #86  <Method Assembler Assembler.getInstance()>
	//   33   81:invokevirtual   #327 <Method PushNotificationService Assembler.getPushNotificationService()>
	//   34   84:aload           4
	//   35   86:invokeinterface #330 <Method Object java.util.Map$Entry.getKey()>
	//   36   91:checkcast       #199 <Class PushNotificationType>
	//   37   94:iload_2         
	//   38   95:invokevirtual   #336 <Method void PushNotificationService.updatePushNotificationSetting(PushNotificationType, boolean)>
			break;
		} while(true);
	//   39   98:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #340 <Method void BaseFragmentActivity.onCreate(Bundle)>
		AnalyticsSubsystem.getInstance().trackView(ViewId.NotificationSettings);
	//    3    5:invokestatic    #345 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    4    8:getstatic       #351 <Field ViewId ViewId.NotificationSettings>
	//    5   11:invokevirtual   #355 <Method void AnalyticsSubsystem.trackView(ViewId)>
	//    6   14:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #358 <Method void BaseFragmentActivity.onStart()>
		m.registerUISubscriber(l);
	//    2    4:aload_0         
	//    3    5:getfield        #257 <Field AccountService m>
	//    4    8:aload_0         
	//    5    9:getfield        #67  <Field AccountUIServiceDataCallback l>
	//    6   12:invokevirtual   #362 <Method boolean AccountService.registerUISubscriber(AccountUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #365 <Method void BaseFragmentActivity.onStop()>
		m.unregisterSubscriber(l);
	//    2    4:aload_0         
	//    3    5:getfield        #257 <Field AccountService m>
	//    4    8:aload_0         
	//    5    9:getfield        #67  <Field AccountUIServiceDataCallback l>
	//    6   12:invokevirtual   #368 <Method boolean AccountService.unregisterSubscriber(AccountUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	private static final String g = com.irobot.home.util.j.r(((Class) (com/irobot/home/NotificationSettingsActivity)).getSimpleName());
	RelativeLayout a;
	RelativeLayout b;
	RelativeLayout c;
	RelativeLayout d;
	RelativeLayout e;
	ProgressBar f;
	private Map h;
	private Map i;
	private AlertDialog j;
	private SwitchCompat k;
	private AccountUIServiceDataCallback l;
	private AccountService m;

	static 
	{
	//    0    0:ldc1            #2   <Class NotificationSettingsActivity>
	//    1    2:invokevirtual   #41  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #47  <Method String j.r(String)>
	//    3    8:putstatic       #49  <Field String g>
	//*   4   11:return          
	}
}
