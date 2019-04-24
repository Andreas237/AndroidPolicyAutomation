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
import com.irobot.home.util.c;
import com.irobot.home.util.j;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, IRobotApplication

public class RemoveButtonActivity extends BaseFragmentActivity
{

	public RemoveButtonActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void BaseFragmentActivity()>
		h = ((ApplicationUIServiceDataCallback) (new ApplicationUIServiceDataCallback() {

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
			//    9   19:ifeq            162
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
						//*  20   45:getstatic       #37  <Field ApplicationUIState ApplicationUIState.RemoveAssetFromPlatform>
						//*  21   48:invokevirtual   #28  <Method int ApplicationUIState.ordinal()>
						//*  22   51:iconst_4        
						//*  23   52:iastore         
						//*  24   53:getstatic       #20  <Field int[] a>
						//*  25   56:getstatic       #40  <Field ApplicationUIState ApplicationUIState.DisplayResetOrRemoveSuccessDialog>
						//*  26   59:invokevirtual   #28  <Method int ApplicationUIState.ordinal()>
						//*  27   62:iconst_5        
						//*  28   63:iastore         
						//*  29   64:getstatic       #20  <Field int[] a>
						//*  30   67:getstatic       #43  <Field ApplicationUIState ApplicationUIState.AssetRemovalSuccessful>
						//*  31   70:invokevirtual   #28  <Method int ApplicationUIState.ordinal()>
						//*  32   73:bipush          6
						//*  33   75:iastore         
						//*  34   76:return          
							catch(NoSuchFieldError nosuchfielderror) { }
						//   35   77:astore_0        
							try
							{
								a[ApplicationUIState.AssetResetOrRemovalStarted.ordinal()] = 2;
							}
						//*  36   78:goto            20
							catch(NoSuchFieldError nosuchfielderror1) { }
						//   37   81:astore_0        
							try
							{
								a[ApplicationUIState.DisplayAssetResetOrRemoveFailedOnRemote.ordinal()] = 3;
							}
						//*  38   82:goto            31
							catch(NoSuchFieldError nosuchfielderror2) { }
						//   39   85:astore_0        
							try
							{
								a[ApplicationUIState.RemoveAssetFromPlatform.ordinal()] = 4;
							}
						//*  40   86:goto            42
							catch(NoSuchFieldError nosuchfielderror3) { }
						//   41   89:astore_0        
							try
							{
								a[ApplicationUIState.DisplayResetOrRemoveSuccessDialog.ordinal()] = 5;
							}
						//*  42   90:goto            53
							catch(NoSuchFieldError nosuchfielderror4) { }
						//   43   93:astore_0        
							try
							{
								a[ApplicationUIState.AssetRemovalSuccessful.ordinal()] = 6;
							}
						//*  44   94:goto            64
							catch(NoSuchFieldError nosuchfielderror5) { }
						//   45   97:astore_0        
						//*  46   98:return          
						}
					}

					switch(com.irobot.home._cls7.a[applicationuistate.ordinal()])
			//*  14   32:getstatic       #47  <Field int[] com.irobot.home.RemoveButtonActivity$7.a>
			//*  15   35:aload_3         
			//*  16   36:invokevirtual   #51  <Method int ApplicationUIState.ordinal()>
			//*  17   39:iaload          
					{
			//*  18   40:tableswitch     1 6: default 80
			//			               1 152
			//			               2 141
			//			               3 131
			//			               4 103
			//			               5 93
			//			               6 83
			//*  19   80:goto            13
					case 6: // '\006'
						j.a(((android.app.Activity) (a)));
			//   20   83:aload_0         
			//   21   84:getfield        #12  <Field RemoveButtonActivity a>
			//   22   87:invokestatic    #56  <Method void j.a(android.app.Activity)>
						break;

			//*  23   90:goto            13
					case 5: // '\005'
						com.irobot.home.RemoveButtonActivity.c(a);
			//   24   93:aload_0         
			//   25   94:getfield        #12  <Field RemoveButtonActivity a>
			//   26   97:invokestatic    #59  <Method void com.irobot.home.RemoveButtonActivity.c(RemoveButtonActivity)>
						break;

			//*  27  100:goto            13
					case 4: // '\004'
						AssetId assetid = applicationuiservicedata.getAssetForRemoval().getAssetId();
			//   28  103:aload_1         
			//   29  104:invokevirtual   #63  <Method AssetInfo ApplicationUIServiceData.getAssetForRemoval()>
			//   30  107:invokevirtual   #69  <Method AssetId AssetInfo.getAssetId()>
			//   31  110:astore_3        
						((IRobotApplication)j.g()).h().c(assetid.getId());
			//   32  111:invokestatic    #73  <Method android.app.Application j.g()>
			//   33  114:checkcast       #75  <Class IRobotApplication>
			//   34  117:invokevirtual   #79  <Method IRobotModel IRobotApplication.h()>
			//   35  120:aload_3         
			//   36  121:invokevirtual   #85  <Method String AssetId.getId()>
			//   37  124:invokevirtual   #90  <Method boolean IRobotModel.c(String)>
			//   38  127:pop             
						break;

			//*  39  128:goto            13
					case 3: // '\003'
						RemoveButtonActivity.b(a);
			//   40  131:aload_0         
			//   41  132:getfield        #12  <Field RemoveButtonActivity a>
			//   42  135:invokestatic    #93  <Method void RemoveButtonActivity.b(RemoveButtonActivity)>
						break;

			//*  43  138:goto            13
					case 2: // '\002'
						com.irobot.home.RemoveButtonActivity.a(a, true);
			//   44  141:aload_0         
			//   45  142:getfield        #12  <Field RemoveButtonActivity a>
			//   46  145:iconst_1        
			//   47  146:invokestatic    #96  <Method void com.irobot.home.RemoveButtonActivity.a(RemoveButtonActivity, boolean)>
						break;

			//*  48  149:goto            13
					case 1: // '\001'
						com.irobot.home.RemoveButtonActivity.a(a);
			//   49  152:aload_0         
			//   50  153:getfield        #12  <Field RemoveButtonActivity a>
			//   51  156:invokestatic    #98  <Method void com.irobot.home.RemoveButtonActivity.a(RemoveButtonActivity)>
						break;
					}
				} while(true);
			//*  52  159:goto            13
			//   53  162:return          
			}

			final RemoveButtonActivity a;

			
			{
				a = RemoveButtonActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field RemoveButtonActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void ApplicationUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//    2    4:aload_0         
	//    3    5:new             #6   <Class RemoveButtonActivity$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #55  <Method void RemoveButtonActivity$1(RemoveButtonActivity)>
	//    7   13:putfield        #57  <Field ApplicationUIServiceDataCallback h>
	//    8   16:return          
	}

	static void a(RemoveButtonActivity removebuttonactivity)
	{
		removebuttonactivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void g()>
	//    2    4:return          
	}

	static void a(RemoveButtonActivity removebuttonactivity, boolean flag)
	{
		removebuttonactivity.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #63  <Method void a(boolean)>
	//    3    5:return          
	}

	private void a(boolean flag)
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #67  <Method boolean isFinishing()>
	//*   2    4:ifne            36
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #70  <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			ProgressBar progressbar = f;
	//    7   15:aload_0         
	//    8   16:getfield        #72  <Field ProgressBar f>
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
	//   19   33:invokevirtual   #78  <Method void ProgressBar.setVisibility(int)>
		}
	//   20   36:return          
	}

	static void b(RemoveButtonActivity removebuttonactivity)
	{
		removebuttonactivity.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void i()>
	//    2    4:return          
	}

	static void c(RemoveButtonActivity removebuttonactivity)
	{
		removebuttonactivity.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #83  <Method void h()>
	//    2    4:return          
	}

	private void g()
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #67  <Method boolean isFinishing()>
	//*   2    4:ifne            93
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #70  <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle(((CharSequence) (getString(0x7f0f074a, new Object[] {
				c
			})))).setMessage(((CharSequence) (getString(0x7f0f0218, new Object[] {
				c
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

				final RemoveButtonActivity a;

			
			{
				a = RemoveButtonActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RemoveButtonActivity a>
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

				final RemoveButtonActivity a;

			
			{
				a = RemoveButtonActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RemoveButtonActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).show();
	//    7   15:new             #88  <Class android.app.AlertDialog$Builder>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #91  <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   11   23:aload_0         
	//   12   24:ldc1            #92  <Int 0x7f0f074a>
	//   13   26:iconst_1        
	//   14   27:anewarray       Object[]
	//   15   30:dup             
	//   16   31:iconst_0        
	//   17   32:aload_0         
	//   18   33:getfield        #96  <Field String c>
	//   19   36:aastore         
	//   20   37:invokevirtual   #100 <Method String getString(int, Object[])>
	//   21   40:invokevirtual   #104 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   22   43:aload_0         
	//   23   44:ldc1            #105 <Int 0x7f0f0218>
	//   24   46:iconst_1        
	//   25   47:anewarray       Object[]
	//   26   50:dup             
	//   27   51:iconst_0        
	//   28   52:aload_0         
	//   29   53:getfield        #96  <Field String c>
	//   30   56:aastore         
	//   31   57:invokevirtual   #100 <Method String getString(int, Object[])>
	//   32   60:invokevirtual   #108 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   33   63:ldc1            #109 <Int 0x7f0f0986>
	//   34   65:new             #10  <Class RemoveButtonActivity$3>
	//   35   68:dup             
	//   36   69:aload_0         
	//   37   70:invokespecial   #110 <Method void RemoveButtonActivity$3(RemoveButtonActivity)>
	//   38   73:invokevirtual   #114 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   39   76:ldc1            #115 <Int 0x7f0f04d3>
	//   40   78:new             #8   <Class RemoveButtonActivity$2>
	//   41   81:dup             
	//   42   82:aload_0         
	//   43   83:invokespecial   #116 <Method void RemoveButtonActivity$2(RemoveButtonActivity)>
	//   44   86:invokevirtual   #119 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   45   89:invokevirtual   #123 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   46   92:pop             
		}
	//   47   93:return          
	}

	private void h()
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #67  <Method boolean isFinishing()>
	//*   2    4:ifne            82
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #70  <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			f.setVisibility(4);
	//    7   15:aload_0         
	//    8   16:getfield        #72  <Field ProgressBar f>
	//    9   19:iconst_4        
	//   10   20:invokevirtual   #78  <Method void ProgressBar.setVisibility(int)>
			setResult(-1);
	//   11   23:aload_0         
	//   12   24:iconst_m1       
	//   13   25:invokevirtual   #127 <Method void setResult(int)>
			String s = String.format(getString(0x7f0f074f), new Object[] {
				c
			});
	//   14   28:aload_0         
	//   15   29:ldc1            #128 <Int 0x7f0f074f>
	//   16   31:invokevirtual   #131 <Method String getString(int)>
	//   17   34:iconst_1        
	//   18   35:anewarray       Object[]
	//   19   38:dup             
	//   20   39:iconst_0        
	//   21   40:aload_0         
	//   22   41:getfield        #96  <Field String c>
	//   23   44:aastore         
	//   24   45:invokestatic    #137 <Method String String.format(String, Object[])>
	//   25   48:astore_1        
			(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(((CharSequence) (s))).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

				public void onDismiss(DialogInterface dialoginterface)
				{
					Assembler.getInstance().getPersistenceHandler().removeFromGroup("MapGettingStartedTour", a.b);
				//    0    0:invokestatic    #28  <Method Assembler Assembler.getInstance()>
				//    1    3:invokevirtual   #32  <Method PersistenceHandler Assembler.getPersistenceHandler()>
				//    2    6:ldc1            #34  <String "MapGettingStartedTour">
				//    3    8:aload_0         
				//    4    9:getfield        #17  <Field RemoveButtonActivity a>
				//    5   12:getfield        #38  <Field String RemoveButtonActivity.b>
				//    6   15:invokevirtual   #44  <Method void PersistenceHandler.removeFromGroup(String, String)>
					Assembler.getInstance().getApplicationUIService().sendCommand(ApplicationUIServiceCommand.AcknowledgeResetOrRemovalSuccessHandled, ((ApplicationUIServiceData) (null)));
				//    7   18:invokestatic    #28  <Method Assembler Assembler.getInstance()>
				//    8   21:invokevirtual   #48  <Method ApplicationUIService Assembler.getApplicationUIService()>
				//    9   24:getstatic       #54  <Field ApplicationUIServiceCommand ApplicationUIServiceCommand.AcknowledgeResetOrRemovalSuccessHandled>
				//   10   27:aconst_null     
				//   11   28:invokevirtual   #60  <Method void ApplicationUIService.sendCommand(ApplicationUIServiceCommand, ApplicationUIServiceData)>
					if(j.C())
				//*  12   31:invokestatic    #66  <Method boolean j.C()>
				//*  13   34:ifeq            44
						com.irobot.home.util.c.a(((android.app.Activity) (a)));
				//   14   37:aload_0         
				//   15   38:getfield        #17  <Field RemoveButtonActivity a>
				//   16   41:invokestatic    #71  <Method void c.a(android.app.Activity)>
				//   17   44:return          
				}

				final RemoveButtonActivity a;

			
			{
				a = RemoveButtonActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RemoveButtonActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).show();
	//   26   49:new             #88  <Class android.app.AlertDialog$Builder>
	//   27   52:dup             
	//   28   53:aload_0         
	//   29   54:invokespecial   #91  <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   30   57:aload_1         
	//   31   58:invokevirtual   #108 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   32   61:ldc1            #138 <Int 0x7f0f05bb>
	//   33   63:aconst_null     
	//   34   64:invokevirtual   #114 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   35   67:new             #12  <Class RemoveButtonActivity$4>
	//   36   70:dup             
	//   37   71:aload_0         
	//   38   72:invokespecial   #139 <Method void RemoveButtonActivity$4(RemoveButtonActivity)>
	//   39   75:invokevirtual   #143 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnDismissListener(android.content.DialogInterface$OnDismissListener)>
	//   40   78:invokevirtual   #123 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   41   81:pop             
		}
	//   42   82:return          
	}

	private void i()
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #67  <Method boolean isFinishing()>
	//*   2    4:ifne            58
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #70  <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(0x7f0f0743).setPositiveButton(0x7f0f0747, new android.content.DialogInterface.OnClickListener() {

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

				final RemoveButtonActivity a;

			
			{
				a = RemoveButtonActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RemoveButtonActivity a>
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
					a.f.setVisibility(4);
				//    5   13:aload_0         
				//    6   14:getfield        #17  <Field RemoveButtonActivity a>
				//    7   17:getfield        #48  <Field ProgressBar RemoveButtonActivity.f>
				//    8   20:iconst_4        
				//    9   21:invokevirtual   #54  <Method void ProgressBar.setVisibility(int)>
				//   10   24:return          
				}

				final RemoveButtonActivity a;

			
			{
				a = RemoveButtonActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RemoveButtonActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).show();
	//    7   15:new             #88  <Class android.app.AlertDialog$Builder>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #91  <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   11   23:ldc1            #144 <Int 0x7f0f0743>
	//   12   25:invokevirtual   #147 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   13   28:ldc1            #148 <Int 0x7f0f0747>
	//   14   30:new             #16  <Class RemoveButtonActivity$6>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:invokespecial   #149 <Method void RemoveButtonActivity$6(RemoveButtonActivity)>
	//   18   38:invokevirtual   #114 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   19   41:ldc1            #150 <Int 0x7f0f017d>
	//   20   43:new             #14  <Class RemoveButtonActivity$5>
	//   21   46:dup             
	//   22   47:aload_0         
	//   23   48:invokespecial   #151 <Method void RemoveButtonActivity$5(RemoveButtonActivity)>
	//   24   51:invokevirtual   #119 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   25   54:invokevirtual   #123 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   26   57:pop             
		}
	//   27   58:return          
	}

	void e()
	{
		AssetInfo assetinfo = j.a(b).a();
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field String b>
	//    2    4:invokestatic    #156 <Method a j.a(String)>
	//    3    7:invokevirtual   #161 <Method AssetInfo a.a()>
	//    4   10:astore_2        
		b(0x7f0f08cf);
	//    5   11:aload_0         
	//    6   12:ldc1            #162 <Int 0x7f0f08cf>
	//    7   14:invokevirtual   #164 <Method void b(int)>
		d.setText(((CharSequence) (getString(0x7f0f074a, new Object[] {
			c
		}))));
	//    8   17:aload_0         
	//    9   18:getfield        #166 <Field Button d>
	//   10   21:aload_0         
	//   11   22:ldc1            #92  <Int 0x7f0f074a>
	//   12   24:iconst_1        
	//   13   25:anewarray       Object[]
	//   14   28:dup             
	//   15   29:iconst_0        
	//   16   30:aload_0         
	//   17   31:getfield        #96  <Field String c>
	//   18   34:aastore         
	//   19   35:invokevirtual   #100 <Method String getString(int, Object[])>
	//   20   38:invokevirtual   #172 <Method void Button.setText(CharSequence)>
		Button button = d;
	//   21   41:aload_0         
	//   22   42:getfield        #166 <Field Button d>
	//   23   45:astore_3        
		Resources resources = getResources();
	//   24   46:aload_0         
	//   25   47:invokevirtual   #176 <Method Resources getResources()>
	//   26   50:astore          4
		int k;
		if(AssetCapabilityUtils.isNonCloudCapableMoppingRobot(assetinfo))
	//*  27   52:aload_2         
	//*  28   53:invokestatic    #182 <Method boolean AssetCapabilityUtils.isNonCloudCapableMoppingRobot(AssetInfo)>
	//*  29   56:ifeq            65
			k = 0x7f0800c7;
	//   30   59:ldc1            #183 <Int 0x7f0800c7>
	//   31   61:istore_1        
		else
	//*  32   62:goto            68
			k = 0x7f0800c8;
	//   33   65:ldc1            #184 <Int 0x7f0800c8>
	//   34   67:istore_1        
		button.setBackground(resources.getDrawable(k));
	//   35   68:aload_3         
	//   36   69:aload           4
	//   37   71:iload_1         
	//   38   72:invokevirtual   #190 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   39   75:invokevirtual   #194 <Method void Button.setBackground(android.graphics.drawable.Drawable)>
		e.setText(((CharSequence) (getString(0x7f0f0749, new Object[] {
			c
		}))));
	//   40   78:aload_0         
	//   41   79:getfield        #196 <Field TextView e>
	//   42   82:aload_0         
	//   43   83:ldc1            #197 <Int 0x7f0f0749>
	//   44   85:iconst_1        
	//   45   86:anewarray       Object[]
	//   46   89:dup             
	//   47   90:iconst_0        
	//   48   91:aload_0         
	//   49   92:getfield        #96  <Field String c>
	//   50   95:aastore         
	//   51   96:invokevirtual   #100 <Method String getString(int, Object[])>
	//   52   99:invokevirtual   #200 <Method void TextView.setText(CharSequence)>
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.RemoveRobot, assetinfo);
	//   53  102:invokestatic    #206 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   54  105:getstatic       #212 <Field ViewId ViewId.RemoveRobot>
	//   55  108:aload_2         
	//   56  109:invokevirtual   #216 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
	//   57  112:return          
	}

	public void f()
	{
		AssetInfo assetinfo = j.a(b).a();
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field String b>
	//    2    4:invokestatic    #156 <Method a j.a(String)>
	//    3    7:invokevirtual   #161 <Method AssetInfo a.a()>
	//    4   10:astore_1        
		ApplicationUIService applicationuiservice = Assembler.getInstance().getApplicationUIService();
	//    5   11:invokestatic    #221 <Method Assembler Assembler.getInstance()>
	//    6   14:invokevirtual   #225 <Method ApplicationUIService Assembler.getApplicationUIService()>
	//    7   17:astore_2        
		ApplicationUIServiceData applicationuiservicedata = ApplicationUIServiceData.create();
	//    8   18:invokestatic    #231 <Method ApplicationUIServiceData ApplicationUIServiceData.create()>
	//    9   21:astore_3        
		applicationuiservicedata.setAssetForResetOrRemoval(assetinfo, false);
	//   10   22:aload_3         
	//   11   23:aload_1         
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #235 <Method void ApplicationUIServiceData.setAssetForResetOrRemoval(AssetInfo, boolean)>
		applicationuiservice.sendCommand(ApplicationUIServiceCommand.InitiateResetOrRemoveAsset, applicationuiservicedata);
	//   14   28:aload_2         
	//   15   29:getstatic       #241 <Field ApplicationUIServiceCommand ApplicationUIServiceCommand.InitiateResetOrRemoveAsset>
	//   16   32:aload_3         
	//   17   33:invokevirtual   #247 <Method void ApplicationUIService.sendCommand(ApplicationUIServiceCommand, ApplicationUIServiceData)>
	//   18   36:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #250 <Method void BaseFragmentActivity.onStart()>
		Assembler.getInstance().getApplicationUIService().registerUISubscriber(h);
	//    2    4:invokestatic    #221 <Method Assembler Assembler.getInstance()>
	//    3    7:invokevirtual   #225 <Method ApplicationUIService Assembler.getApplicationUIService()>
	//    4   10:aload_0         
	//    5   11:getfield        #57  <Field ApplicationUIServiceDataCallback h>
	//    6   14:invokevirtual   #254 <Method boolean ApplicationUIService.registerUISubscriber(ApplicationUIServiceDataCallback)>
	//    7   17:pop             
	//    8   18:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #257 <Method void BaseFragmentActivity.onStop()>
		Assembler.getInstance().getApplicationUIService().unregisterSubscriber(h);
	//    2    4:invokestatic    #221 <Method Assembler Assembler.getInstance()>
	//    3    7:invokevirtual   #225 <Method ApplicationUIService Assembler.getApplicationUIService()>
	//    4   10:aload_0         
	//    5   11:getfield        #57  <Field ApplicationUIServiceDataCallback h>
	//    6   14:invokevirtual   #260 <Method boolean ApplicationUIService.unregisterSubscriber(ApplicationUIServiceDataCallback)>
	//    7   17:pop             
	//    8   18:return          
	}

	private static final String g = j.r(((Class) (com/irobot/home/RemoveButtonActivity)).getSimpleName());
	IRobotApplication a;
	String b;
	String c;
	Button d;
	TextView e;
	ProgressBar f;
	private ApplicationUIServiceDataCallback h;

	static 
	{
	//    0    0:ldc1            #2   <Class RemoveButtonActivity>
	//    1    2:invokevirtual   #40  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #46  <Method String j.r(String)>
	//    3    8:putstatic       #48  <Field String g>
	//*   4   11:return          
	}
}
