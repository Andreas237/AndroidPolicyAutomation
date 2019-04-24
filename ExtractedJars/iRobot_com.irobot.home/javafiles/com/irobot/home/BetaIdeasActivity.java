// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.support.design.widget.TextInputEditText;
import android.widget.Toast;
import com.irobot.core.*;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity

public class BetaIdeasActivity extends BaseFragmentActivity
{

	public BetaIdeasActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void BaseFragmentActivity()>
		d = Assembler.getInstance().getApplicationUIService();
	//    2    4:aload_0         
	//    3    5:invokestatic    #43  <Method Assembler Assembler.getInstance()>
	//    4    8:invokevirtual   #47  <Method ApplicationUIService Assembler.getApplicationUIService()>
	//    5   11:putfield        #49  <Field ApplicationUIService d>
		e = ((ApplicationUIServiceDataCallback) (new ApplicationUIServiceDataCallback() {

			public void onApplicationUIServiceDataChanged(ApplicationUIServiceData applicationuiservicedata)
			{
				for(applicationuiservicedata = ((ApplicationUIServiceData) (applicationuiservicedata.getViewStateChangelist().iterator())); ((Iterator) (applicationuiservicedata)).hasNext();)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #24  <Method ArrayList ApplicationUIServiceData.getViewStateChangelist()>
			//*   2    4:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
			//*   3    7:astore_1        
			//*   4    8:aload_1         
			//*   5    9:invokeinterface #36  <Method boolean Iterator.hasNext()>
			//*   6   14:ifeq            92
				{
					ApplicationUIState applicationuistate = (ApplicationUIState)((Iterator) (applicationuiservicedata)).next();
			//    7   17:aload_1         
			//    8   18:invokeinterface #40  <Method Object Iterator.next()>
			//    9   23:checkcast       #42  <Class ApplicationUIState>
			//   10   26:astore_2        
					static class _cls2
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
								a[ApplicationUIState.BetaProgramFeedbackSubmissionSucceeded.ordinal()] = 1;
						//    4    9:getstatic       #20  <Field int[] a>
						//    5   12:getstatic       #24  <Field ApplicationUIState ApplicationUIState.BetaProgramFeedbackSubmissionSucceeded>
						//    6   15:invokevirtual   #28  <Method int ApplicationUIState.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
						//    9   20:return          
							}
							catch(NoSuchFieldError nosuchfielderror) { }
						//   10   21:astore_0        
						//*  11   22:return          
						}
					}

					if(_cls2.a[applicationuistate.ordinal()] != 1)
			//*  11   27:getstatic       #47  <Field int[] BetaIdeasActivity$2.a>
			//*  12   30:aload_2         
			//*  13   31:invokevirtual   #51  <Method int ApplicationUIState.ordinal()>
			//*  14   34:iaload          
			//*  15   35:iconst_1        
			//*  16   36:icmpeq          82
					{
						String s = BetaIdeasActivity.g();
			//   17   39:invokestatic    #55  <Method String BetaIdeasActivity.g()>
			//   18   42:astore_3        
						StringBuilder stringbuilder = new StringBuilder();
			//   19   43:new             #57  <Class StringBuilder>
			//   20   46:dup             
			//   21   47:invokespecial   #58  <Method void StringBuilder()>
			//   22   50:astore          4
						stringbuilder.append("Unhandled ApplicationUIState: ");
			//   23   52:aload           4
			//   24   54:ldc1            #60  <String "Unhandled ApplicationUIState: ">
			//   25   56:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
			//   26   59:pop             
						stringbuilder.append(applicationuistate.name());
			//   27   60:aload           4
			//   28   62:aload_2         
			//   29   63:invokevirtual   #67  <Method String ApplicationUIState.name()>
			//   30   66:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
			//   31   69:pop             
						o.d(s, stringbuilder.toString());
			//   32   70:aload_3         
			//   33   71:aload           4
			//   34   73:invokevirtual   #70  <Method String StringBuilder.toString()>
			//   35   76:invokestatic    #76  <Method void o.d(String, String)>
					} else
			//*  36   79:goto            8
					{
						BetaIdeasActivity.a(a);
			//   37   82:aload_0         
			//   38   83:getfield        #12  <Field BetaIdeasActivity a>
			//   39   86:invokestatic    #78  <Method void BetaIdeasActivity.a(BetaIdeasActivity)>
					}
				}

			//*  40   89:goto            8
			//   41   92:return          
			}

			final BetaIdeasActivity a;

			
			{
				a = BetaIdeasActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field BetaIdeasActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void ApplicationUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//    6   14:aload_0         
	//    7   15:new             #6   <Class BetaIdeasActivity$1>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #52  <Method void BetaIdeasActivity$1(BetaIdeasActivity)>
	//   11   23:putfield        #54  <Field ApplicationUIServiceDataCallback e>
	//   12   26:return          
	}

	static void a(BetaIdeasActivity betaideasactivity)
	{
		betaideasactivity.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void h()>
	//    2    4:return          
	}

	static String g()
	{
		return c;
	//    0    0:getstatic       #33  <Field String c>
	//    1    3:areturn         
	}

	private void h()
	{
		Toast.makeText(((android.content.Context) (this)), 0x7f0f02ea, 0).show();
	//    0    0:aload_0         
	//    1    1:ldc1            #59  <Int 0x7f0f02ea>
	//    2    3:iconst_0        
	//    3    4:invokestatic    #65  <Method Toast Toast.makeText(android.content.Context, int, int)>
	//    4    7:invokevirtual   #68  <Method void Toast.show()>
		finish();
	//    5   10:aload_0         
	//    6   11:invokevirtual   #71  <Method void finish()>
	//    7   14:return          
	}

	protected void e()
	{
		b(0x7f0f00d7);
	//    0    0:aload_0         
	//    1    1:ldc1            #72  <Int 0x7f0f00d7>
	//    2    3:invokevirtual   #75  <Method void b(int)>
	//    3    6:return          
	}

	protected void f()
	{
		ApplicationUIServiceData applicationuiservicedata = ApplicationUIServiceData.create();
	//    0    0:invokestatic    #82  <Method ApplicationUIServiceData ApplicationUIServiceData.create()>
	//    1    3:astore_1        
		applicationuiservicedata.setBetaProgramFeedbackData(((Object) (a.getText())).toString(), ((Object) (b.getText())).toString());
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #84  <Field TextInputEditText a>
	//    5    9:invokevirtual   #90  <Method android.text.Editable TextInputEditText.getText()>
	//    6   12:invokevirtual   #95  <Method String Object.toString()>
	//    7   15:aload_0         
	//    8   16:getfield        #97  <Field TextInputEditText b>
	//    9   19:invokevirtual   #90  <Method android.text.Editable TextInputEditText.getText()>
	//   10   22:invokevirtual   #95  <Method String Object.toString()>
	//   11   25:invokevirtual   #101 <Method void ApplicationUIServiceData.setBetaProgramFeedbackData(String, String)>
		d.sendCommand(ApplicationUIServiceCommand.SubmitBetaProgramFeedback, applicationuiservicedata);
	//   12   28:aload_0         
	//   13   29:getfield        #49  <Field ApplicationUIService d>
	//   14   32:getstatic       #107 <Field ApplicationUIServiceCommand ApplicationUIServiceCommand.SubmitBetaProgramFeedback>
	//   15   35:aload_1         
	//   16   36:invokevirtual   #113 <Method void ApplicationUIService.sendCommand(ApplicationUIServiceCommand, ApplicationUIServiceData)>
	//   17   39:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #116 <Method void BaseFragmentActivity.onStart()>
		d.registerUISubscriber(e);
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field ApplicationUIService d>
	//    4    8:aload_0         
	//    5    9:getfield        #54  <Field ApplicationUIServiceDataCallback e>
	//    6   12:invokevirtual   #120 <Method boolean ApplicationUIService.registerUISubscriber(ApplicationUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #123 <Method void BaseFragmentActivity.onStop()>
		d.registerUISubscriber(e);
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field ApplicationUIService d>
	//    4    8:aload_0         
	//    5    9:getfield        #54  <Field ApplicationUIServiceDataCallback e>
	//    6   12:invokevirtual   #120 <Method boolean ApplicationUIService.registerUISubscriber(ApplicationUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	private static final String c = j.r(((Class) (com/irobot/home/BetaIdeasActivity)).getSimpleName());
	TextInputEditText a;
	TextInputEditText b;
	private ApplicationUIService d;
	private ApplicationUIServiceDataCallback e;

	static 
	{
	//    0    0:ldc1            #2   <Class BetaIdeasActivity>
	//    1    2:invokevirtual   #25  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #31  <Method String j.r(String)>
	//    3    8:putstatic       #33  <Field String c>
	//*   4   11:return          
	}
}
