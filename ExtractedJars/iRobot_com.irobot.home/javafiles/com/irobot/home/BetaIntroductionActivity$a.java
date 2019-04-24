// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.widget.ProgressBar;
import android.widget.Toast;
import com.irobot.core.*;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomButton;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BetaIntroductionActivity, BetaFeaturesActivity_

private class BetaIntroductionActivity$a extends AccountUIServiceDataCallback
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
			int i = BetaIntroductionActivity$1.a[((AccountViewState) (accountuiservicedata)).ordinal()];
	//   38   87:getstatic       #78  <Field int[] BetaIntroductionActivity$1.a>
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
	//	               1 186
	//	               2 172
	//	               3 158
	//	               4 131
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
				BetaFeaturesActivity_.a(((android.content.Context) (a))).a();
	//   60  158:aload_0         
	//   61  159:getfield        #12  <Field BetaIntroductionActivity a>
	//   62  162:invokestatic    #107 <Method BetaFeaturesActivity_$a BetaFeaturesActivity_.a(android.content.Context)>
	//   63  165:invokevirtual   #112 <Method org.androidannotations.api.a.e BetaFeaturesActivity_$a.a()>
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

	private BetaIntroductionActivity$a(BetaIntroductionActivity betaintroductionactivity)
	{
		a = betaintroductionactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field BetaIntroductionActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void AccountUIServiceDataCallback()>
	//    5    9:return          
	}

	BetaIntroductionActivity$a(BetaIntroductionActivity betaintroductionactivity, BetaIntroductionActivity$1 betaintroductionactivity$1)
	{
		this(betaintroductionactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void BetaIntroductionActivity$a(BetaIntroductionActivity)>
	//    3    5:return          
	}
}
