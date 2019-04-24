// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.widget.*;
import com.irobot.core.*;
import com.irobot.home.model.IRobotModel;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, IRobotApplication

public class ResetTableViewActivity extends BaseFragmentActivity
{

	public ResetTableViewActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void BaseFragmentActivity()>
		f = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #52  <String "">
	//    4    7:putfield        #54  <Field String f>
		g = ((ApplicationUIServiceDataCallback) (new ApplicationUIServiceDataCallback() {

			public void onApplicationUIServiceDataChanged(ApplicationUIServiceData applicationuiservicedata)
			{
				if(applicationuiservicedata == null)
			//*   0    0:aload_1         
			//*   1    1:ifnonnull       5
					return;
			//    2    4:return          
				Iterator iterator = applicationuiservicedata.getViewStateChangelist().iterator();
			//    3    5:aload_1         
			//    4    6:invokevirtual   #24  <Method ArrayList ApplicationUIServiceData.getViewStateChangelist()>
			//    5    9:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
			//    6   12:astore_2        
				do
				{
					if(!iterator.hasNext())
						break;
			//    7   13:aload_2         
			//    8   14:invokeinterface #36  <Method boolean Iterator.hasNext()>
			//    9   19:ifeq            176
					ApplicationUIState applicationuistate = (ApplicationUIState)iterator.next();
			//   10   22:aload_2         
			//   11   23:invokeinterface #40  <Method Object Iterator.next()>
			//   12   28:checkcast       #42  <Class ApplicationUIState>
			//   13   31:astore_3        
					static class _cls7
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
								a[ApplicationUIState.DisplayConfirmAssetResetOrRemovalUI.ordinal()] = 1;
						//    4    9:getstatic       #20  <Field int[] a>
						//    5   12:getstatic       #24  <Field ApplicationUIState ApplicationUIState.DisplayConfirmAssetResetOrRemovalUI>
						//    6   15:invokevirtual   #28  <Method int ApplicationUIState.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
							}
						//*   9   20:getstatic       #20  <Field int[] a>
						//*  10   23:getstatic       #31  <Field ApplicationUIState ApplicationUIState.AssetResetOrRemovalStarted>
						//*  11   26:invokevirtual   #28  <Method int ApplicationUIState.ordinal()>
						//*  12   29:iconst_2        
						//*  13   30:iastore         
						//*  14   31:getstatic       #20  <Field int[] a>
						//*  15   34:getstatic       #34  <Field ApplicationUIState ApplicationUIState.DisplayAssetResetOrRemoveFailedOnRemote>
						//*  16   37:invokevirtual   #28  <Method int ApplicationUIState.ordinal()>
						//*  17   40:iconst_3        
						//*  18   41:iastore         
						//*  19   42:getstatic       #20  <Field int[] a>
						//*  20   45:getstatic       #37  <Field ApplicationUIState ApplicationUIState.DisplayAssetResetFailedOnLocal>
						//*  21   48:invokevirtual   #28  <Method int ApplicationUIState.ordinal()>
						//*  22   51:iconst_4        
						//*  23   52:iastore         
						//*  24   53:getstatic       #20  <Field int[] a>
						//*  25   56:getstatic       #40  <Field ApplicationUIState ApplicationUIState.RemoveAssetFromPlatform>
						//*  26   59:invokevirtual   #28  <Method int ApplicationUIState.ordinal()>
						//*  27   62:iconst_5        
						//*  28   63:iastore         
						//*  29   64:getstatic       #20  <Field int[] a>
						//*  30   67:getstatic       #43  <Field ApplicationUIState ApplicationUIState.DisplayResetOrRemoveSuccessDialog>
						//*  31   70:invokevirtual   #28  <Method int ApplicationUIState.ordinal()>
						//*  32   73:bipush          6
						//*  33   75:iastore         
						//*  34   76:getstatic       #20  <Field int[] a>
						//*  35   79:getstatic       #46  <Field ApplicationUIState ApplicationUIState.AssetRemovalSuccessful>
						//*  36   82:invokevirtual   #28  <Method int ApplicationUIState.ordinal()>
						//*  37   85:bipush          7
						//*  38   87:iastore         
						//*  39   88:return          
							catch(NoSuchFieldError nosuchfielderror) { }
						//   40   89:astore_0        
							try
							{
								a[ApplicationUIState.AssetResetOrRemovalStarted.ordinal()] = 2;
							}
						//*  41   90:goto            20
							catch(NoSuchFieldError nosuchfielderror1) { }
						//   42   93:astore_0        
							try
							{
								a[ApplicationUIState.DisplayAssetResetOrRemoveFailedOnRemote.ordinal()] = 3;
							}
						//*  43   94:goto            31
							catch(NoSuchFieldError nosuchfielderror2) { }
						//   44   97:astore_0        
							try
							{
								a[ApplicationUIState.DisplayAssetResetFailedOnLocal.ordinal()] = 4;
							}
						//*  45   98:goto            42
							catch(NoSuchFieldError nosuchfielderror3) { }
						//   46  101:astore_0        
							try
							{
								a[ApplicationUIState.RemoveAssetFromPlatform.ordinal()] = 5;
							}
						//*  47  102:goto            53
							catch(NoSuchFieldError nosuchfielderror4) { }
						//   48  105:astore_0        
							try
							{
								a[ApplicationUIState.DisplayResetOrRemoveSuccessDialog.ordinal()] = 6;
							}
						//*  49  106:goto            64
							catch(NoSuchFieldError nosuchfielderror5) { }
						//   50  109:astore_0        
							try
							{
								a[ApplicationUIState.AssetRemovalSuccessful.ordinal()] = 7;
							}
						//*  51  110:goto            76
							catch(NoSuchFieldError nosuchfielderror6) { }
						//   52  113:astore_0        
						//*  53  114:return          
						}
					}

					switch(com.irobot.home._cls7.a[applicationuistate.ordinal()])
			//*  14   32:getstatic       #47  <Field int[] com.irobot.home.ResetTableViewActivity$7.a>
			//*  15   35:aload_3         
			//*  16   36:invokevirtual   #51  <Method int ApplicationUIState.ordinal()>
			//*  17   39:iaload          
					{
			//*  18   40:tableswitch     1 7: default 84
			//			               1 166
			//			               2 155
			//			               3 145
			//			               4 135
			//			               5 107
			//			               6 97
			//			               7 87
			//*  19   84:goto            13
					case 7: // '\007'
						com.irobot.home.util.j.a(((android.app.Activity) (a)));
			//   20   87:aload_0         
			//   21   88:getfield        #12  <Field ResetTableViewActivity a>
			//   22   91:invokestatic    #56  <Method void j.a(android.app.Activity)>
						break;

			//*  23   94:goto            13
					case 6: // '\006'
						ResetTableViewActivity.d(a);
			//   24   97:aload_0         
			//   25   98:getfield        #12  <Field ResetTableViewActivity a>
			//   26  101:invokestatic    #59  <Method void ResetTableViewActivity.d(ResetTableViewActivity)>
						break;

			//*  27  104:goto            13
					case 5: // '\005'
						AssetId assetid = applicationuiservicedata.getAssetForRemoval().getAssetId();
			//   28  107:aload_1         
			//   29  108:invokevirtual   #63  <Method AssetInfo ApplicationUIServiceData.getAssetForRemoval()>
			//   30  111:invokevirtual   #69  <Method AssetId AssetInfo.getAssetId()>
			//   31  114:astore_3        
						((IRobotApplication)com.irobot.home.util.j.g()).h().c(assetid.getId());
			//   32  115:invokestatic    #73  <Method android.app.Application j.g()>
			//   33  118:checkcast       #75  <Class IRobotApplication>
			//   34  121:invokevirtual   #79  <Method IRobotModel IRobotApplication.h()>
			//   35  124:aload_3         
			//   36  125:invokevirtual   #85  <Method String AssetId.getId()>
			//   37  128:invokevirtual   #91  <Method boolean IRobotModel.c(String)>
			//   38  131:pop             
						break;

			//*  39  132:goto            13
					case 4: // '\004'
						ResetTableViewActivity.c(a);
			//   40  135:aload_0         
			//   41  136:getfield        #12  <Field ResetTableViewActivity a>
			//   42  139:invokestatic    #93  <Method void ResetTableViewActivity.c(ResetTableViewActivity)>
						break;

			//*  43  142:goto            13
					case 3: // '\003'
						ResetTableViewActivity.b(a);
			//   44  145:aload_0         
			//   45  146:getfield        #12  <Field ResetTableViewActivity a>
			//   46  149:invokestatic    #96  <Method void ResetTableViewActivity.b(ResetTableViewActivity)>
						break;

			//*  47  152:goto            13
					case 2: // '\002'
						com.irobot.home.ResetTableViewActivity.a(a, true);
			//   48  155:aload_0         
			//   49  156:getfield        #12  <Field ResetTableViewActivity a>
			//   50  159:iconst_1        
			//   51  160:invokestatic    #99  <Method void com.irobot.home.ResetTableViewActivity.a(ResetTableViewActivity, boolean)>
						break;

			//*  52  163:goto            13
					case 1: // '\001'
						com.irobot.home.ResetTableViewActivity.a(a);
			//   53  166:aload_0         
			//   54  167:getfield        #12  <Field ResetTableViewActivity a>
			//   55  170:invokestatic    #101 <Method void com.irobot.home.ResetTableViewActivity.a(ResetTableViewActivity)>
						break;
					}
				} while(true);
			//*  56  173:goto            13
			//   57  176:return          
			}

			final ResetTableViewActivity a;

			
			{
				a = ResetTableViewActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field ResetTableViewActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void ApplicationUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//    5   10:aload_0         
	//    6   11:new             #6   <Class ResetTableViewActivity$1>
	//    7   14:dup             
	//    8   15:aload_0         
	//    9   16:invokespecial   #57  <Method void ResetTableViewActivity$1(ResetTableViewActivity)>
	//   10   19:putfield        #59  <Field ApplicationUIServiceDataCallback g>
	//   11   22:return          
	}

	static void a(ResetTableViewActivity resettableviewactivity)
	{
		resettableviewactivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void g()>
	//    2    4:return          
	}

	static void a(ResetTableViewActivity resettableviewactivity, boolean flag)
	{
		resettableviewactivity.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #65  <Method void a(boolean)>
	//    3    5:return          
	}

	private void a(boolean flag)
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #69  <Method boolean isFinishing()>
	//*   2    4:ifne            36
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #72  <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			ProgressBar progressbar = d;
	//    7   15:aload_0         
	//    8   16:getfield        #74  <Field ProgressBar d>
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
	//   19   33:invokevirtual   #80  <Method void ProgressBar.setVisibility(int)>
		}
	//   20   36:return          
	}

	static void b(ResetTableViewActivity resettableviewactivity)
	{
		resettableviewactivity.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #83  <Method void i()>
	//    2    4:return          
	}

	static void c(ResetTableViewActivity resettableviewactivity)
	{
		resettableviewactivity.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method void j()>
	//    2    4:return          
	}

	static void d(ResetTableViewActivity resettableviewactivity)
	{
		resettableviewactivity.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #89  <Method void h()>
	//    2    4:return          
	}

	private void g()
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #69  <Method boolean isFinishing()>
	//*   2    4:ifne            93
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #72  <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle(((CharSequence) (getString(0x7f0f075a, new Object[] {
				f
			})))).setMessage(((CharSequence) (getString(0x7f0f0219, new Object[] {
				f
			})))).setPositiveButton(0x7f0f0986, new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int k)
				{
					Assembler.getInstance().getApplicationUIService().sendCommand(ApplicationUIServiceCommand.ConfirmResetOrRemoveAsset, ((ApplicationUIServiceData) (null)));
				//    0    0:invokestatic    #28  <Method Assembler Assembler.getInstance()>
				//    1    3:invokevirtual   #32  <Method ApplicationUIService Assembler.getApplicationUIService()>
				//    2    6:getstatic       #38  <Field ApplicationUIServiceCommand ApplicationUIServiceCommand.ConfirmResetOrRemoveAsset>
				//    3    9:aconst_null     
				//    4   10:invokevirtual   #44  <Method void ApplicationUIService.sendCommand(ApplicationUIServiceCommand, ApplicationUIServiceData)>
				//    5   13:return          
				}

				final ResetTableViewActivity a;

			
			{
				a = ResetTableViewActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ResetTableViewActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).setNegativeButton(0x7f0f04d3, new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int k)
				{
					Assembler.getInstance().getApplicationUIService().sendCommand(ApplicationUIServiceCommand.AssetResetOrRemovalCancelled, ((ApplicationUIServiceData) (null)));
				//    0    0:invokestatic    #28  <Method Assembler Assembler.getInstance()>
				//    1    3:invokevirtual   #32  <Method ApplicationUIService Assembler.getApplicationUIService()>
				//    2    6:getstatic       #38  <Field ApplicationUIServiceCommand ApplicationUIServiceCommand.AssetResetOrRemovalCancelled>
				//    3    9:aconst_null     
				//    4   10:invokevirtual   #44  <Method void ApplicationUIService.sendCommand(ApplicationUIServiceCommand, ApplicationUIServiceData)>
				//    5   13:return          
				}

				final ResetTableViewActivity a;

			
			{
				a = ResetTableViewActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ResetTableViewActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).show();
	//    7   15:new             #94  <Class android.app.AlertDialog$Builder>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #97  <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   11   23:aload_0         
	//   12   24:ldc1            #98  <Int 0x7f0f075a>
	//   13   26:iconst_1        
	//   14   27:anewarray       Object[]
	//   15   30:dup             
	//   16   31:iconst_0        
	//   17   32:aload_0         
	//   18   33:getfield        #54  <Field String f>
	//   19   36:aastore         
	//   20   37:invokevirtual   #104 <Method String getString(int, Object[])>
	//   21   40:invokevirtual   #108 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   22   43:aload_0         
	//   23   44:ldc1            #109 <Int 0x7f0f0219>
	//   24   46:iconst_1        
	//   25   47:anewarray       Object[]
	//   26   50:dup             
	//   27   51:iconst_0        
	//   28   52:aload_0         
	//   29   53:getfield        #54  <Field String f>
	//   30   56:aastore         
	//   31   57:invokevirtual   #104 <Method String getString(int, Object[])>
	//   32   60:invokevirtual   #112 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   33   63:ldc1            #113 <Int 0x7f0f0986>
	//   34   65:new             #10  <Class ResetTableViewActivity$3>
	//   35   68:dup             
	//   36   69:aload_0         
	//   37   70:invokespecial   #114 <Method void ResetTableViewActivity$3(ResetTableViewActivity)>
	//   38   73:invokevirtual   #118 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   39   76:ldc1            #119 <Int 0x7f0f04d3>
	//   40   78:new             #8   <Class ResetTableViewActivity$2>
	//   41   81:dup             
	//   42   82:aload_0         
	//   43   83:invokespecial   #120 <Method void ResetTableViewActivity$2(ResetTableViewActivity)>
	//   44   86:invokevirtual   #123 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   45   89:invokevirtual   #127 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   46   92:pop             
		}
	//   47   93:return          
	}

	private void h()
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #69  <Method boolean isFinishing()>
	//*   2    4:ifne            82
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #72  <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			d.setVisibility(4);
	//    7   15:aload_0         
	//    8   16:getfield        #74  <Field ProgressBar d>
	//    9   19:iconst_4        
	//   10   20:invokevirtual   #80  <Method void ProgressBar.setVisibility(int)>
			setResult(-1);
	//   11   23:aload_0         
	//   12   24:iconst_m1       
	//   13   25:invokevirtual   #131 <Method void setResult(int)>
			String s = String.format(getString(0x7f0f0758), new Object[] {
				f
			});
	//   14   28:aload_0         
	//   15   29:ldc1            #132 <Int 0x7f0f0758>
	//   16   31:invokevirtual   #135 <Method String getString(int)>
	//   17   34:iconst_1        
	//   18   35:anewarray       Object[]
	//   19   38:dup             
	//   20   39:iconst_0        
	//   21   40:aload_0         
	//   22   41:getfield        #54  <Field String f>
	//   23   44:aastore         
	//   24   45:invokestatic    #141 <Method String String.format(String, Object[])>
	//   25   48:astore_1        
			(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(((CharSequence) (s))).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

				public void onDismiss(DialogInterface dialoginterface)
				{
					Assembler.getInstance().getApplicationUIService().sendCommand(ApplicationUIServiceCommand.AcknowledgeResetOrRemovalSuccessHandled, ((ApplicationUIServiceData) (null)));
				//    0    0:invokestatic    #28  <Method Assembler Assembler.getInstance()>
				//    1    3:invokevirtual   #32  <Method ApplicationUIService Assembler.getApplicationUIService()>
				//    2    6:getstatic       #38  <Field ApplicationUIServiceCommand ApplicationUIServiceCommand.AcknowledgeResetOrRemovalSuccessHandled>
				//    3    9:aconst_null     
				//    4   10:invokevirtual   #44  <Method void ApplicationUIService.sendCommand(ApplicationUIServiceCommand, ApplicationUIServiceData)>
				//    5   13:return          
				}

				final ResetTableViewActivity a;

			
			{
				a = ResetTableViewActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ResetTableViewActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).show();
	//   26   49:new             #94  <Class android.app.AlertDialog$Builder>
	//   27   52:dup             
	//   28   53:aload_0         
	//   29   54:invokespecial   #97  <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   30   57:aload_1         
	//   31   58:invokevirtual   #112 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   32   61:ldc1            #142 <Int 0x7f0f05bb>
	//   33   63:aconst_null     
	//   34   64:invokevirtual   #118 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   35   67:new             #12  <Class ResetTableViewActivity$4>
	//   36   70:dup             
	//   37   71:aload_0         
	//   38   72:invokespecial   #143 <Method void ResetTableViewActivity$4(ResetTableViewActivity)>
	//   39   75:invokevirtual   #147 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnDismissListener(android.content.DialogInterface$OnDismissListener)>
	//   40   78:invokevirtual   #127 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   41   81:pop             
		}
	//   42   82:return          
	}

	private void i()
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #69  <Method boolean isFinishing()>
	//*   2    4:ifne            58
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #72  <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(0x7f0f0744).setPositiveButton(0x7f0f0756, new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int k)
				{
					Assembler.getInstance().getApplicationUIService().sendCommand(ApplicationUIServiceCommand.ContinueWithLocalResetOrRemove, ((ApplicationUIServiceData) (null)));
				//    0    0:invokestatic    #28  <Method Assembler Assembler.getInstance()>
				//    1    3:invokevirtual   #32  <Method ApplicationUIService Assembler.getApplicationUIService()>
				//    2    6:getstatic       #38  <Field ApplicationUIServiceCommand ApplicationUIServiceCommand.ContinueWithLocalResetOrRemove>
				//    3    9:aconst_null     
				//    4   10:invokevirtual   #44  <Method void ApplicationUIService.sendCommand(ApplicationUIServiceCommand, ApplicationUIServiceData)>
				//    5   13:return          
				}

				final ResetTableViewActivity a;

			
			{
				a = ResetTableViewActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ResetTableViewActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).setNegativeButton(0x7f0f017d, new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int k)
				{
					Assembler.getInstance().getApplicationUIService().sendCommand(ApplicationUIServiceCommand.AssetResetOrRemovalCancelled, ((ApplicationUIServiceData) (null)));
				//    0    0:invokestatic    #28  <Method Assembler Assembler.getInstance()>
				//    1    3:invokevirtual   #32  <Method ApplicationUIService Assembler.getApplicationUIService()>
				//    2    6:getstatic       #38  <Field ApplicationUIServiceCommand ApplicationUIServiceCommand.AssetResetOrRemovalCancelled>
				//    3    9:aconst_null     
				//    4   10:invokevirtual   #44  <Method void ApplicationUIService.sendCommand(ApplicationUIServiceCommand, ApplicationUIServiceData)>
					a.d.setVisibility(4);
				//    5   13:aload_0         
				//    6   14:getfield        #17  <Field ResetTableViewActivity a>
				//    7   17:getfield        #48  <Field ProgressBar ResetTableViewActivity.d>
				//    8   20:iconst_4        
				//    9   21:invokevirtual   #54  <Method void ProgressBar.setVisibility(int)>
				//   10   24:return          
				}

				final ResetTableViewActivity a;

			
			{
				a = ResetTableViewActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ResetTableViewActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).show();
	//    7   15:new             #94  <Class android.app.AlertDialog$Builder>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #97  <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   11   23:ldc1            #148 <Int 0x7f0f0744>
	//   12   25:invokevirtual   #151 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   13   28:ldc1            #152 <Int 0x7f0f0756>
	//   14   30:new             #16  <Class ResetTableViewActivity$6>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:invokespecial   #153 <Method void ResetTableViewActivity$6(ResetTableViewActivity)>
	//   18   38:invokevirtual   #118 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   19   41:ldc1            #154 <Int 0x7f0f017d>
	//   20   43:new             #14  <Class ResetTableViewActivity$5>
	//   21   46:dup             
	//   22   47:aload_0         
	//   23   48:invokespecial   #155 <Method void ResetTableViewActivity$5(ResetTableViewActivity)>
	//   24   51:invokevirtual   #123 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   25   54:invokevirtual   #127 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   26   57:pop             
		}
	//   27   58:return          
	}

	private void j()
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #69  <Method boolean isFinishing()>
	//*   2    4:ifne            69
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #72  <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			d.setVisibility(4);
	//    7   15:aload_0         
	//    8   16:getfield        #74  <Field ProgressBar d>
	//    9   19:iconst_4        
	//   10   20:invokevirtual   #80  <Method void ProgressBar.setVisibility(int)>
			setResult(0);
	//   11   23:aload_0         
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #131 <Method void setResult(int)>
			(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(((CharSequence) (String.format(getString(0x7f0f0930), new Object[] {
				f
			})))).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//   14   28:new             #94  <Class android.app.AlertDialog$Builder>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #97  <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   18   36:aload_0         
	//   19   37:ldc1            #156 <Int 0x7f0f0930>
	//   20   39:invokevirtual   #135 <Method String getString(int)>
	//   21   42:iconst_1        
	//   22   43:anewarray       Object[]
	//   23   46:dup             
	//   24   47:iconst_0        
	//   25   48:aload_0         
	//   26   49:getfield        #54  <Field String f>
	//   27   52:aastore         
	//   28   53:invokestatic    #141 <Method String String.format(String, Object[])>
	//   29   56:invokevirtual   #112 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   30   59:ldc1            #142 <Int 0x7f0f05bb>
	//   31   61:aconst_null     
	//   32   62:invokevirtual   #118 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   33   65:invokevirtual   #127 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   34   68:pop             
		}
	//   35   69:return          
	}

	void e()
	{
		a a1 = com.irobot.home.util.j.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field String a>
	//    2    4:invokestatic    #161 <Method a j.a(String)>
	//    3    7:astore_2        
		if(a1 == null)
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       21
		{
			o.e(e, "Asset is null");
	//    6   12:getstatic       #46  <Field String e>
	//    7   15:ldc1            #163 <String "Asset is null">
	//    8   17:invokestatic    #168 <Method void o.e(String, String)>
			return;
	//    9   20:return          
		}
		AssetInfo assetinfo = a1.a();
	//   10   21:aload_2         
	//   11   22:invokevirtual   #173 <Method AssetInfo a.a()>
	//   12   25:astore          4
		f = assetinfo.getName();
	//   13   27:aload_0         
	//   14   28:aload           4
	//   15   30:invokevirtual   #178 <Method String AssetInfo.getName()>
	//   16   33:putfield        #54  <Field String f>
		b(0x7f0f08d0);
	//   17   36:aload_0         
	//   18   37:ldc1            #179 <Int 0x7f0f08d0>
	//   19   39:invokevirtual   #181 <Method void b(int)>
		c.setText(((CharSequence) (getString(0x7f0f075a, new Object[] {
			f
		}))));
	//   20   42:aload_0         
	//   21   43:getfield        #183 <Field Button c>
	//   22   46:aload_0         
	//   23   47:ldc1            #98  <Int 0x7f0f075a>
	//   24   49:iconst_1        
	//   25   50:anewarray       Object[]
	//   26   53:dup             
	//   27   54:iconst_0        
	//   28   55:aload_0         
	//   29   56:getfield        #54  <Field String f>
	//   30   59:aastore         
	//   31   60:invokevirtual   #104 <Method String getString(int, Object[])>
	//   32   63:invokevirtual   #189 <Method void Button.setText(CharSequence)>
		if(com.irobot.home.util.j.C())
	//*  33   66:invokestatic    #192 <Method boolean j.C()>
	//*  34   69:ifeq            99
		{
			c.setBackground(getResources().getDrawable(0x7f080084));
	//   35   72:aload_0         
	//   36   73:getfield        #183 <Field Button c>
	//   37   76:aload_0         
	//   38   77:invokevirtual   #196 <Method Resources getResources()>
	//   39   80:ldc1            #197 <Int 0x7f080084>
	//   40   82:invokevirtual   #203 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   41   85:invokevirtual   #207 <Method void Button.setBackground(android.graphics.drawable.Drawable)>
			c.setEnabled(false);
	//   42   88:aload_0         
	//   43   89:getfield        #183 <Field Button c>
	//   44   92:iconst_0        
	//   45   93:invokevirtual   #210 <Method void Button.setEnabled(boolean)>
		} else
	//*  46   96:goto            204
		{
			c.setEnabled(true);
	//   47   99:aload_0         
	//   48  100:getfield        #183 <Field Button c>
	//   49  103:iconst_1        
	//   50  104:invokevirtual   #210 <Method void Button.setEnabled(boolean)>
			int k;
			Button button;
			Resources resources;
			if(AssetCapabilityUtils.isNonCloudCapableMoppingRobot(assetinfo))
	//*  51  107:aload           4
	//*  52  109:invokestatic    #216 <Method boolean AssetCapabilityUtils.isNonCloudCapableMoppingRobot(AssetInfo)>
	//*  53  112:ifeq            164
			{
				b.setText(((CharSequence) (getString(0x7f0f013c, new Object[] {
					f
				}))));
	//   54  115:aload_0         
	//   55  116:getfield        #218 <Field TextView b>
	//   56  119:aload_0         
	//   57  120:ldc1            #219 <Int 0x7f0f013c>
	//   58  122:iconst_1        
	//   59  123:anewarray       Object[]
	//   60  126:dup             
	//   61  127:iconst_0        
	//   62  128:aload_0         
	//   63  129:getfield        #54  <Field String f>
	//   64  132:aastore         
	//   65  133:invokevirtual   #104 <Method String getString(int, Object[])>
	//   66  136:invokevirtual   #222 <Method void TextView.setText(CharSequence)>
				button = c;
	//   67  139:aload_0         
	//   68  140:getfield        #183 <Field Button c>
	//   69  143:astore_2        
				resources = getResources();
	//   70  144:aload_0         
	//   71  145:invokevirtual   #196 <Method Resources getResources()>
	//   72  148:astore_3        
				k = 0x7f0800c7;
	//   73  149:ldc1            #223 <Int 0x7f0800c7>
	//   74  151:istore_1        
			} else
	//*  75  152:aload_2         
	//*  76  153:aload_3         
	//*  77  154:iload_1         
	//*  78  155:invokevirtual   #203 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//*  79  158:invokevirtual   #207 <Method void Button.setBackground(android.graphics.drawable.Drawable)>
	//*  80  161:goto            204
			{
				b.setText(((CharSequence) (getString(0x7f0f0757, new Object[] {
					f
				}))));
	//   81  164:aload_0         
	//   82  165:getfield        #218 <Field TextView b>
	//   83  168:aload_0         
	//   84  169:ldc1            #224 <Int 0x7f0f0757>
	//   85  171:iconst_1        
	//   86  172:anewarray       Object[]
	//   87  175:dup             
	//   88  176:iconst_0        
	//   89  177:aload_0         
	//   90  178:getfield        #54  <Field String f>
	//   91  181:aastore         
	//   92  182:invokevirtual   #104 <Method String getString(int, Object[])>
	//   93  185:invokevirtual   #222 <Method void TextView.setText(CharSequence)>
				button = c;
	//   94  188:aload_0         
	//   95  189:getfield        #183 <Field Button c>
	//   96  192:astore_2        
				resources = getResources();
	//   97  193:aload_0         
	//   98  194:invokevirtual   #196 <Method Resources getResources()>
	//   99  197:astore_3        
				k = 0x7f0800c8;
	//  100  198:ldc1            #225 <Int 0x7f0800c8>
	//  101  200:istore_1        
			}
			button.setBackground(resources.getDrawable(k));
		}
	//* 102  201:goto            152
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.ResetRobot, assetinfo);
	//  103  204:invokestatic    #231 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//  104  207:getstatic       #237 <Field ViewId ViewId.ResetRobot>
	//  105  210:aload           4
	//  106  212:invokevirtual   #241 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
	//  107  215:return          
	}

	public void f()
	{
		AssetInfo assetinfo = com.irobot.home.util.j.a(a).a();
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field String a>
	//    2    4:invokestatic    #161 <Method a j.a(String)>
	//    3    7:invokevirtual   #173 <Method AssetInfo a.a()>
	//    4   10:astore_1        
		ApplicationUIService applicationuiservice = Assembler.getInstance().getApplicationUIService();
	//    5   11:invokestatic    #246 <Method Assembler Assembler.getInstance()>
	//    6   14:invokevirtual   #250 <Method ApplicationUIService Assembler.getApplicationUIService()>
	//    7   17:astore_2        
		ApplicationUIServiceData applicationuiservicedata = ApplicationUIServiceData.create();
	//    8   18:invokestatic    #256 <Method ApplicationUIServiceData ApplicationUIServiceData.create()>
	//    9   21:astore_3        
		applicationuiservicedata.setAssetForResetOrRemoval(assetinfo, true);
	//   10   22:aload_3         
	//   11   23:aload_1         
	//   12   24:iconst_1        
	//   13   25:invokevirtual   #260 <Method void ApplicationUIServiceData.setAssetForResetOrRemoval(AssetInfo, boolean)>
		applicationuiservice.sendCommand(ApplicationUIServiceCommand.InitiateResetOrRemoveAsset, applicationuiservicedata);
	//   14   28:aload_2         
	//   15   29:getstatic       #266 <Field ApplicationUIServiceCommand ApplicationUIServiceCommand.InitiateResetOrRemoveAsset>
	//   16   32:aload_3         
	//   17   33:invokevirtual   #272 <Method void ApplicationUIService.sendCommand(ApplicationUIServiceCommand, ApplicationUIServiceData)>
	//   18   36:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #275 <Method void BaseFragmentActivity.onStart()>
		Assembler.getInstance().getApplicationUIService().registerUISubscriber(g);
	//    2    4:invokestatic    #246 <Method Assembler Assembler.getInstance()>
	//    3    7:invokevirtual   #250 <Method ApplicationUIService Assembler.getApplicationUIService()>
	//    4   10:aload_0         
	//    5   11:getfield        #59  <Field ApplicationUIServiceDataCallback g>
	//    6   14:invokevirtual   #279 <Method boolean ApplicationUIService.registerUISubscriber(ApplicationUIServiceDataCallback)>
	//    7   17:pop             
	//    8   18:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #282 <Method void BaseFragmentActivity.onStop()>
		Assembler.getInstance().getApplicationUIService().unregisterSubscriber(g);
	//    2    4:invokestatic    #246 <Method Assembler Assembler.getInstance()>
	//    3    7:invokevirtual   #250 <Method ApplicationUIService Assembler.getApplicationUIService()>
	//    4   10:aload_0         
	//    5   11:getfield        #59  <Field ApplicationUIServiceDataCallback g>
	//    6   14:invokevirtual   #285 <Method boolean ApplicationUIService.unregisterSubscriber(ApplicationUIServiceDataCallback)>
	//    7   17:pop             
	//    8   18:return          
	}

	private static final String e = com.irobot.home.util.j.r(((Class) (com/irobot/home/ResetTableViewActivity)).getSimpleName());
	String a;
	TextView b;
	Button c;
	ProgressBar d;
	private String f;
	private ApplicationUIServiceDataCallback g;

	static 
	{
	//    0    0:ldc1            #2   <Class ResetTableViewActivity>
	//    1    2:invokevirtual   #38  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #44  <Method String j.r(String)>
	//    3    8:putstatic       #46  <Field String e>
	//*   4   11:return          
	}
}
