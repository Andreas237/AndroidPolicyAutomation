// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BetaFeaturesActivity

private class BetaFeaturesActivity$a extends AccountUIServiceDataCallback
{

	public void onAccountUIServiceDataChanged(AccountUIServiceData accountuiservicedata)
	{
		if(accountuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			o.e(BetaFeaturesActivity.g(), "null service data");
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
		o.b(s, stringbuilder.toString());
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
			switch(com.irobot.home.BetaFeaturesActivity$1.a[accountviewstate.ordinal()])
	//*  38   82:getstatic       #80  <Field int[] com.irobot.home.BetaFeaturesActivity$1.a>
	//*  39   85:aload_3         
	//*  40   86:invokevirtual   #84  <Method int AccountViewState.ordinal()>
	//*  41   89:iaload          
			{
	//*  42   90:tableswitch     1 8: default 136
	//	               1 273
	//	               2 250
	//	               3 236
	//	               4 221
	//	               5 207
	//	               6 165
	//	               7 155
	//	               8 139
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
				(new android.support.v7.app.a.a(((android.content.Context) (a)))).b(0x7f0f00d5).a(0x7f0f0986, new android.content.DialogInterface.OnClickListener() {

					public void onClick(DialogInterface dialoginterface, int i)
					{
						AnalyticsSubsystem.getInstance().trackLeaveBetaProgramConfirmationButtonPressed(j.j().a());
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

					final BetaFeaturesActivity.a a;

			
			{
				a = BetaFeaturesActivity.a.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BetaFeaturesActivity$a a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
				}
).b(0x7f0f017d, ((android.content.Listener) (null))).c();
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
	//   82  225:getfield        #129 <Field View BetaFeaturesActivity.b>
	//   83  228:bipush          8
	//   84  230:invokevirtual   #135 <Method void View.setVisibility(int)>
				break;

	//*  85  233:goto            63
			case 3: // '\003'
				a.b.setVisibility(0);
	//   86  236:aload_0         
	//   87  237:getfield        #14  <Field BetaFeaturesActivity a>
	//   88  240:getfield        #129 <Field View BetaFeaturesActivity.b>
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

	private BetaFeaturesActivity$a(BetaFeaturesActivity betafeaturesactivity)
	{
		a = betafeaturesactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field BetaFeaturesActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void AccountUIServiceDataCallback()>
	//    5    9:return          
	}

	BetaFeaturesActivity$a(BetaFeaturesActivity betafeaturesactivity, BetaFeaturesActivity$1 betafeaturesactivity$1)
	{
		this(betafeaturesactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void BetaFeaturesActivity$a(BetaFeaturesActivity)>
	//    3    5:return          
	}
}
