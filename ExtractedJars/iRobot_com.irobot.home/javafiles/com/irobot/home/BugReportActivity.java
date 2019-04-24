// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.widget.SwitchCompat;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import com.irobot.core.AccountService;
import com.irobot.core.ApplicationUIService;
import com.irobot.core.ApplicationUIServiceCommand;
import com.irobot.core.ApplicationUIServiceData;
import com.irobot.core.ApplicationUIServiceDataCallback;
import com.irobot.core.ApplicationUIState;
import com.irobot.core.Assembler;
import com.irobot.core.AssetCapabilityUtils;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.BugReportFileType;
import com.irobot.core.FeatureType;
import com.irobot.core.MissionSubsystem;
import com.irobot.core.MissionUIServiceCommand;
import com.irobot.home.b.f;
import com.irobot.home.b.g;
import com.irobot.home.model.IRobotModel;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, IRobotApplication

public class BugReportActivity extends BaseFragmentActivity
{

	public BugReportActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void BaseFragmentActivity()>
		m = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #64  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #65  <Method void ArrayList()>
	//    6   12:putfield        #67  <Field List m>
	//    7   15:aload_0         
	//    8   16:new             #69  <Class Handler>
	//    9   19:dup             
	//   10   20:invokespecial   #70  <Method void Handler()>
	//   11   23:putfield        #72  <Field Handler n>
		o = false;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #74  <Field boolean o>
	//   15   31:aload_0         
	//   16   32:new             #6   <Class BugReportActivity$1>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:invokespecial   #77  <Method void BugReportActivity$1(BugReportActivity)>
	//   20   40:putfield        #79  <Field Runnable t>
		u = Assembler.getInstance().getApplicationUIService();
	//   21   43:aload_0         
	//   22   44:invokestatic    #85  <Method Assembler Assembler.getInstance()>
	//   23   47:invokevirtual   #89  <Method ApplicationUIService Assembler.getApplicationUIService()>
	//   24   50:putfield        #91  <Field ApplicationUIService u>
		v = null;
	//   25   53:aload_0         
	//   26   54:aconst_null     
	//   27   55:putfield        #93  <Field MissionSubsystem v>
		w = ((ApplicationUIServiceDataCallback) (new ApplicationUIServiceDataCallback() {

			public void onApplicationUIServiceDataChanged(ApplicationUIServiceData applicationuiservicedata)
			{
				applicationuiservicedata = ((ApplicationUIServiceData) (applicationuiservicedata.getViewStateChangelist().iterator()));
			//    0    0:aload_1         
			//    1    1:invokevirtual   #24  <Method ArrayList ApplicationUIServiceData.getViewStateChangelist()>
			//    2    4:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
			//    3    7:astore_1        
				do
				{
					if(!((Iterator) (applicationuiservicedata)).hasNext())
						break;
			//    4    8:aload_1         
			//    5    9:invokeinterface #36  <Method boolean Iterator.hasNext()>
			//    6   14:ifeq            126
					ApplicationUIState applicationuistate = (ApplicationUIState)((Iterator) (applicationuiservicedata)).next();
			//    7   17:aload_1         
			//    8   18:invokeinterface #40  <Method Object Iterator.next()>
			//    9   23:checkcast       #42  <Class ApplicationUIState>
			//   10   26:astore_2        
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
								a[ApplicationUIState.BugReportDescriptionFieldEmpty.ordinal()] = 1;
						//    4    9:getstatic       #20  <Field int[] a>
						//    5   12:getstatic       #24  <Field ApplicationUIState ApplicationUIState.BugReportDescriptionFieldEmpty>
						//    6   15:invokevirtual   #28  <Method int ApplicationUIState.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
							}
						//*   9   20:getstatic       #20  <Field int[] a>
						//*  10   23:getstatic       #31  <Field ApplicationUIState ApplicationUIState.BugReportSubmissionSucceeded>
						//*  11   26:invokevirtual   #28  <Method int ApplicationUIState.ordinal()>
						//*  12   29:iconst_2        
						//*  13   30:iastore         
						//*  14   31:getstatic       #20  <Field int[] a>
						//*  15   34:getstatic       #34  <Field ApplicationUIState ApplicationUIState.BugReportSubmissionFailed>
						//*  16   37:invokevirtual   #28  <Method int ApplicationUIState.ordinal()>
						//*  17   40:iconst_3        
						//*  18   41:iastore         
						//*  19   42:return          
							catch(NoSuchFieldError nosuchfielderror) { }
						//   20   43:astore_0        
							try
							{
								a[ApplicationUIState.BugReportSubmissionSucceeded.ordinal()] = 2;
							}
						//*  21   44:goto            20
							catch(NoSuchFieldError nosuchfielderror1) { }
						//   22   47:astore_0        
							try
							{
								a[ApplicationUIState.BugReportSubmissionFailed.ordinal()] = 3;
							}
						//*  23   48:goto            31
							catch(NoSuchFieldError nosuchfielderror2) { }
						//   24   51:astore_0        
						//*  25   52:return          
						}
					}

					switch(com.irobot.home._cls7.a[applicationuistate.ordinal()])
			//*  11   27:getstatic       #47  <Field int[] com.irobot.home.BugReportActivity$7.a>
			//*  12   30:aload_2         
			//*  13   31:invokevirtual   #51  <Method int ApplicationUIState.ordinal()>
			//*  14   34:iaload          
					{
			//*  15   35:tableswitch     1 3: default 60
			//			               1 116
			//			               2 106
			//			               3 96
					default:
						StringBuilder stringbuilder = new StringBuilder();
			//   16   60:new             #53  <Class StringBuilder>
			//   17   63:dup             
			//   18   64:invokespecial   #54  <Method void StringBuilder()>
			//   19   67:astore_3        
						stringbuilder.append("Unhandled ApplicationUIState: ");
			//   20   68:aload_3         
			//   21   69:ldc1            #56  <String "Unhandled ApplicationUIState: ">
			//   22   71:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
			//   23   74:pop             
						stringbuilder.append(applicationuistate.name());
			//   24   75:aload_3         
			//   25   76:aload_2         
			//   26   77:invokevirtual   #64  <Method String ApplicationUIState.name()>
			//   27   80:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
			//   28   83:pop             
						com.irobot.home.util.o.d("BugReport", stringbuilder.toString());
			//   29   84:ldc1            #66  <String "BugReport">
			//   30   86:aload_3         
			//   31   87:invokevirtual   #69  <Method String StringBuilder.toString()>
			//   32   90:invokestatic    #75  <Method void o.d(String, String)>
						break;

			//*  33   93:goto            8
					case 3: // '\003'
						BugReportActivity.h(a);
			//   34   96:aload_0         
			//   35   97:getfield        #12  <Field BugReportActivity a>
			//   36  100:invokestatic    #78  <Method void BugReportActivity.h(BugReportActivity)>
						break;

			//*  37  103:goto            8
					case 2: // '\002'
						com.irobot.home.BugReportActivity.g(a);
			//   38  106:aload_0         
			//   39  107:getfield        #12  <Field BugReportActivity a>
			//   40  110:invokestatic    #81  <Method void com.irobot.home.BugReportActivity.g(BugReportActivity)>
						break;

			//*  41  113:goto            8
					case 1: // '\001'
						com.irobot.home.BugReportActivity.f(a);
			//   42  116:aload_0         
			//   43  117:getfield        #12  <Field BugReportActivity a>
			//   44  120:invokestatic    #84  <Method void com.irobot.home.BugReportActivity.f(BugReportActivity)>
						break;
					}
				} while(true);
			//*  45  123:goto            8
			//   46  126:return          
			}

			final BugReportActivity a;

			
			{
				a = BugReportActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field BugReportActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void ApplicationUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//   28   58:aload_0         
	//   29   59:new             #20  <Class BugReportActivity$6>
	//   30   62:dup             
	//   31   63:aload_0         
	//   32   64:invokespecial   #94  <Method void BugReportActivity$6(BugReportActivity)>
	//   33   67:putfield        #96  <Field ApplicationUIServiceDataCallback w>
	//   34   70:return          
	}

	static MissionSubsystem a(BugReportActivity bugreportactivity)
	{
		return bugreportactivity.v;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field MissionSubsystem v>
	//    2    4:areturn         
	}

	static g b(BugReportActivity bugreportactivity)
	{
		return bugreportactivity.l;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field g l>
	//    2    4:areturn         
	}

	static List c(BugReportActivity bugreportactivity)
	{
		return bugreportactivity.m;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field List m>
	//    2    4:areturn         
	}

	static ApplicationUIService d(BugReportActivity bugreportactivity)
	{
		return bugreportactivity.u;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ApplicationUIService u>
	//    2    4:areturn         
	}

	static void e(BugReportActivity bugreportactivity)
	{
		bugreportactivity.l();
	//    0    0:aload_0         
	//    1    1:invokespecial   #105 <Method void l()>
	//    2    4:return          
	}

	static void f(BugReportActivity bugreportactivity)
	{
		bugreportactivity.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #107 <Method void h()>
	//    2    4:return          
	}

	private void g()
	{
		l = new g(((android.content.Context) (this)), ((IRobotApplication)getApplication()).h().f(), d);
	//    0    0:aload_0         
	//    1    1:new             #109 <Class g>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #113 <Method android.app.Application getApplication()>
	//    6   10:checkcast       #115 <Class IRobotApplication>
	//    7   13:invokevirtual   #118 <Method IRobotModel IRobotApplication.h()>
	//    8   16:invokevirtual   #123 <Method List IRobotModel.f()>
	//    9   19:aload_0         
	//   10   20:getfield        #125 <Field Spinner d>
	//   11   23:invokespecial   #128 <Method void g(android.content.Context, List, Spinner)>
	//   12   26:putfield        #101 <Field g l>
		l.setDropDownViewResource(0x1090009);
	//   13   29:aload_0         
	//   14   30:getfield        #101 <Field g l>
	//   15   33:ldc1            #129 <Int 0x1090009>
	//   16   35:invokevirtual   #133 <Method void g.setDropDownViewResource(int)>
		d.setAdapter(((android.widget.SpinnerAdapter) (l)));
	//   17   38:aload_0         
	//   18   39:getfield        #125 <Field Spinner d>
	//   19   42:aload_0         
	//   20   43:getfield        #101 <Field g l>
	//   21   46:invokevirtual   #139 <Method void Spinner.setAdapter(android.widget.SpinnerAdapter)>
		d.setEmptyView(((android.view.View) (c)));
	//   22   49:aload_0         
	//   23   50:getfield        #125 <Field Spinner d>
	//   24   53:aload_0         
	//   25   54:getfield        #141 <Field CustomTextView c>
	//   26   57:invokevirtual   #145 <Method void Spinner.setEmptyView(android.view.View)>
		int i1 = l.getCount();
	//   27   60:aload_0         
	//   28   61:getfield        #101 <Field g l>
	//   29   64:invokevirtual   #149 <Method int g.getCount()>
	//   30   67:istore_1        
		boolean flag = false;
	//   31   68:iconst_0        
	//   32   69:istore_2        
		if(i1 > 0)
	//*  33   70:iload_1         
	//*  34   71:ifle            82
			d.setSelection(0);
	//   35   74:aload_0         
	//   36   75:getfield        #125 <Field Spinner d>
	//   37   78:iconst_0        
	//   38   79:invokevirtual   #152 <Method void Spinner.setSelection(int)>
		getResources().getStringArray(0x7f030001);
	//   39   82:aload_0         
	//   40   83:invokevirtual   #156 <Method Resources getResources()>
	//   41   86:ldc1            #157 <Int 0x7f030001>
	//   42   88:invokevirtual   #163 <Method String[] Resources.getStringArray(int)>
	//   43   91:pop             
		f f1 = new f(((android.content.Context) (this)), e);
	//   44   92:new             #165 <Class f>
	//   45   95:dup             
	//   46   96:aload_0         
	//   47   97:aload_0         
	//   48   98:getfield        #167 <Field Spinner e>
	//   49  101:invokespecial   #170 <Method void f(android.content.Context, Spinner)>
	//   50  104:astore_3        
		e.setAdapter(((android.widget.SpinnerAdapter) (f1)));
	//   51  105:aload_0         
	//   52  106:getfield        #167 <Field Spinner e>
	//   53  109:aload_3         
	//   54  110:invokevirtual   #139 <Method void Spinner.setAdapter(android.widget.SpinnerAdapter)>
		e.setSelection(0);
	//   55  113:aload_0         
	//   56  114:getfield        #167 <Field Spinner e>
	//   57  117:iconst_0        
	//   58  118:invokevirtual   #152 <Method void Spinner.setSelection(int)>
		if(h != null)
	//*  59  121:aload_0         
	//*  60  122:getfield        #172 <Field String h>
	//*  61  125:ifnull          130
			flag = true;
	//   62  128:iconst_1        
	//   63  129:istore_2        
		b.setChecked(flag);
	//   64  130:aload_0         
	//   65  131:getfield        #174 <Field SwitchCompat b>
	//   66  134:iload_2         
	//   67  135:invokevirtual   #180 <Method void SwitchCompat.setChecked(boolean)>
		b.setEnabled(flag);
	//   68  138:aload_0         
	//   69  139:getfield        #174 <Field SwitchCompat b>
	//   70  142:iload_2         
	//   71  143:invokevirtual   #183 <Method void SwitchCompat.setEnabled(boolean)>
	//   72  146:return          
	}

	static void g(BugReportActivity bugreportactivity)
	{
		bugreportactivity.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method void i()>
	//    2    4:return          
	}

	private void h()
	{
		runOnUiThread(new Runnable() {

			public void run()
			{
				BugReportActivity.e(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BugReportActivity a>
			//    2    4:invokestatic    #24  <Method void BugReportActivity.e(BugReportActivity)>
				a.f.setEnabled(true);
			//    3    7:aload_0         
			//    4    8:getfield        #17  <Field BugReportActivity a>
			//    5   11:getfield        #28  <Field Button com.irobot.home.BugReportActivity.f>
			//    6   14:iconst_1        
			//    7   15:invokevirtual   #34  <Method void Button.setEnabled(boolean)>
				a.k = (new android.support.v7.app.a.a(((android.content.Context) (a)))).b(0x7f0f0171).a(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).c();
			//    8   18:aload_0         
			//    9   19:getfield        #17  <Field BugReportActivity a>
			//   10   22:new             #36  <Class android.support.v7.app.a$a>
			//   11   25:dup             
			//   12   26:aload_0         
			//   13   27:getfield        #17  <Field BugReportActivity a>
			//   14   30:invokespecial   #39  <Method void android.support.v7.app.a$a(android.content.Context)>
			//   15   33:ldc1            #40  <Int 0x7f0f0171>
			//   16   35:invokevirtual   #44  <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(int)>
			//   17   38:ldc1            #45  <Int 0x7f0f05bb>
			//   18   40:aconst_null     
			//   19   41:invokevirtual   #48  <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(int, android.content.DialogInterface$OnClickListener)>
			//   20   44:invokevirtual   #52  <Method android.support.v7.app.a android.support.v7.app.a$a.c()>
			//   21   47:putfield        #56  <Field android.support.v7.app.a BugReportActivity.k>
			//   22   50:return          
			}

			final BugReportActivity a;

			
			{
				a = BugReportActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BugReportActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #10  <Class BugReportActivity$3>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #186 <Method void BugReportActivity$3(BugReportActivity)>
	//    5    9:invokevirtual   #190 <Method void runOnUiThread(Runnable)>
	//    6   12:return          
	}

	static void h(BugReportActivity bugreportactivity)
	{
		bugreportactivity.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #192 <Method void j()>
	//    2    4:return          
	}

	private void i()
	{
		runOnUiThread(new Runnable() {

			public void run()
			{
				BugReportActivity.e(a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field BugReportActivity a>
			//    2    4:invokestatic    #26  <Method void BugReportActivity.e(BugReportActivity)>
				a.j = (new android.support.v7.app.a.a(((android.content.Context) (a)))).b(0x7f0f02f0).a(0x7f0f05bb, new android.content.DialogInterface.OnClickListener(this) {

					public void onClick(DialogInterface dialoginterface, int i1)
					{
						com.irobot.home.util.f.a();
					//    0    0:invokestatic    #26  <Method void com.irobot.home.util.f.a()>
						a.a.finish();
					//    1    3:aload_0         
					//    2    4:getfield        #17  <Field BugReportActivity$4 a>
					//    3    7:getfield        #29  <Field BugReportActivity com.irobot.home.BugReportActivity$4.a>
					//    4   10:invokevirtual   #34  <Method void BugReportActivity.finish()>
					//    5   13:return          
					}

					final _cls4 a;

			
			{
				a = _pcls4;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BugReportActivity$4 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
).c();
			//    3    7:aload_0         
			//    4    8:getfield        #19  <Field BugReportActivity a>
			//    5   11:new             #28  <Class android.support.v7.app.a$a>
			//    6   14:dup             
			//    7   15:aload_0         
			//    8   16:getfield        #19  <Field BugReportActivity a>
			//    9   19:invokespecial   #31  <Method void android.support.v7.app.a$a(android.content.Context)>
			//   10   22:ldc1            #32  <Int 0x7f0f02f0>
			//   11   24:invokevirtual   #36  <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(int)>
			//   12   27:ldc1            #37  <Int 0x7f0f05bb>
			//   13   29:new             #13  <Class BugReportActivity$4$1>
			//   14   32:dup             
			//   15   33:aload_0         
			//   16   34:invokespecial   #40  <Method void BugReportActivity$4$1(BugReportActivity$4)>
			//   17   37:invokevirtual   #43  <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(int, android.content.DialogInterface$OnClickListener)>
			//   18   40:invokevirtual   #47  <Method android.support.v7.app.a android.support.v7.app.a$a.c()>
			//   19   43:putfield        #51  <Field android.support.v7.app.a com.irobot.home.BugReportActivity.j>
			//   20   46:return          
			}

			final BugReportActivity a;

			
			{
				a = BugReportActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BugReportActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #12  <Class BugReportActivity$4>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #193 <Method void BugReportActivity$4(BugReportActivity)>
	//    5    9:invokevirtual   #190 <Method void runOnUiThread(Runnable)>
	//    6   12:return          
	}

	private void j()
	{
		runOnUiThread(new Runnable() {

			public void run()
			{
				a.f.setEnabled(true);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field BugReportActivity a>
			//    2    4:getfield        #27  <Field Button com.irobot.home.BugReportActivity.f>
			//    3    7:iconst_1        
			//    4    8:invokevirtual   #33  <Method void Button.setEnabled(boolean)>
				BugReportActivity.e(a);
			//    5   11:aload_0         
			//    6   12:getfield        #19  <Field BugReportActivity a>
			//    7   15:invokestatic    #36  <Method void BugReportActivity.e(BugReportActivity)>
				a.j = (new android.support.v7.app.a.a(((android.content.Context) (a)))).b(0x7f0f02ec).a(0x7f0f05bb, new android.content.DialogInterface.OnClickListener(this) {

					public void onClick(DialogInterface dialoginterface, int i1)
					{
					//    0    0:return          
					}

					final _cls5 a;

			
			{
				a = _pcls5;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BugReportActivity$5 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
).c();
			//    8   18:aload_0         
			//    9   19:getfield        #19  <Field BugReportActivity a>
			//   10   22:new             #38  <Class android.support.v7.app.a$a>
			//   11   25:dup             
			//   12   26:aload_0         
			//   13   27:getfield        #19  <Field BugReportActivity a>
			//   14   30:invokespecial   #41  <Method void android.support.v7.app.a$a(android.content.Context)>
			//   15   33:ldc1            #42  <Int 0x7f0f02ec>
			//   16   35:invokevirtual   #46  <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(int)>
			//   17   38:ldc1            #47  <Int 0x7f0f05bb>
			//   18   40:new             #13  <Class BugReportActivity$5$1>
			//   19   43:dup             
			//   20   44:aload_0         
			//   21   45:invokespecial   #50  <Method void BugReportActivity$5$1(BugReportActivity$5)>
			//   22   48:invokevirtual   #53  <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(int, android.content.DialogInterface$OnClickListener)>
			//   23   51:invokevirtual   #57  <Method android.support.v7.app.a android.support.v7.app.a$a.c()>
			//   24   54:putfield        #60  <Field android.support.v7.app.a com.irobot.home.BugReportActivity.j>
			//   25   57:return          
			}

			final BugReportActivity a;

			
			{
				a = BugReportActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BugReportActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #16  <Class BugReportActivity$5>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #194 <Method void BugReportActivity$5(BugReportActivity)>
	//    5    9:invokevirtual   #190 <Method void runOnUiThread(Runnable)>
	//    6   12:return          
	}

	private void k()
	{
		i = new ProgressDialog(((android.content.Context) (this)));
	//    0    0:aload_0         
	//    1    1:new             #196 <Class ProgressDialog>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #199 <Method void ProgressDialog(android.content.Context)>
	//    5    9:putfield        #201 <Field ProgressDialog i>
		i.setMessage(((CharSequence) (getString(0x7f0f0172))));
	//    6   12:aload_0         
	//    7   13:getfield        #201 <Field ProgressDialog i>
	//    8   16:aload_0         
	//    9   17:ldc1            #202 <Int 0x7f0f0172>
	//   10   19:invokevirtual   #206 <Method String getString(int)>
	//   11   22:invokevirtual   #210 <Method void ProgressDialog.setMessage(CharSequence)>
		i.show();
	//   12   25:aload_0         
	//   13   26:getfield        #201 <Field ProgressDialog i>
	//   14   29:invokevirtual   #213 <Method void ProgressDialog.show()>
	//   15   32:return          
	}

	private void l()
	{
		if(i != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #201 <Field ProgressDialog i>
	//*   2    4:ifnull          19
		{
			i.dismiss();
	//    3    7:aload_0         
	//    4    8:getfield        #201 <Field ProgressDialog i>
	//    5   11:invokevirtual   #216 <Method void ProgressDialog.dismiss()>
			i = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #201 <Field ProgressDialog i>
		}
	//    9   19:return          
	}

	void e()
	{
		b(0x7f0f02f1);
	//    0    0:aload_0         
	//    1    1:ldc1            #217 <Int 0x7f0f02f1>
	//    2    3:invokevirtual   #219 <Method void b(int)>
		if(g != null)
	//*   3    6:aload_0         
	//*   4    7:getfield        #221 <Field String g>
	//*   5   10:ifnull          54
		{
			AssetInfo assetinfo = com.irobot.home.util.j.a(g).a();
	//    6   13:aload_0         
	//    7   14:getfield        #221 <Field String g>
	//    8   17:invokestatic    #226 <Method a j.a(String)>
	//    9   20:invokevirtual   #231 <Method AssetInfo a.a()>
	//   10   23:astore_1        
			v = Assembler.getInstance().getMissionSubsystem(assetinfo.getAssetId());
	//   11   24:aload_0         
	//   12   25:invokestatic    #85  <Method Assembler Assembler.getInstance()>
	//   13   28:aload_1         
	//   14   29:invokevirtual   #237 <Method AssetId AssetInfo.getAssetId()>
	//   15   32:invokevirtual   #241 <Method MissionSubsystem Assembler.getMissionSubsystem(AssetId)>
	//   16   35:putfield        #93  <Field MissionSubsystem v>
			if(assetinfo != null && AssetCapabilityUtils.isCloudCapable(assetinfo))
	//*  17   38:aload_1         
	//*  18   39:ifnull          54
	//*  19   42:aload_1         
	//*  20   43:invokestatic    #247 <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//*  21   46:ifeq            54
				o = true;
	//   22   49:aload_0         
	//   23   50:iconst_1        
	//   24   51:putfield        #74  <Field boolean o>
		}
		g();
	//   25   54:aload_0         
	//   26   55:invokespecial   #249 <Method void g()>
		AccountService accountservice = Assembler.getInstance().getAccountService();
	//   27   58:invokestatic    #85  <Method Assembler Assembler.getInstance()>
	//   28   61:invokevirtual   #253 <Method AccountService Assembler.getAccountService()>
	//   29   64:astore_1        
		if(!accountservice.isFeatureEnabled(FeatureType.FeedbackReport))
	//*  30   65:aload_1         
	//*  31   66:getstatic       #259 <Field FeatureType FeatureType.FeedbackReport>
	//*  32   69:invokevirtual   #265 <Method boolean AccountService.isFeatureEnabled(FeatureType)>
	//*  33   72:ifne            83
			accountservice.updateFeatureStatus(FeatureType.FeedbackReport, true);
	//   34   75:aload_1         
	//   35   76:getstatic       #259 <Field FeatureType FeatureType.FeedbackReport>
	//   36   79:iconst_1        
	//   37   80:invokevirtual   #269 <Method void AccountService.updateFeatureStatus(FeatureType, boolean)>
	//   38   83:return          
	}

	public void f()
	{
		f.setEnabled(false);
	//    0    0:aload_0         
	//    1    1:getfield        #271 <Field Button f>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #274 <Method void Button.setEnabled(boolean)>
		k();
	//    4    8:aload_0         
	//    5    9:invokespecial   #276 <Method void k()>
		AsyncTask.execute(new Runnable() {

			public void run()
			{
				int i1 = a.d.getSelectedItemPosition();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BugReportActivity a>
			//    2    4:getfield        #25  <Field Spinner BugReportActivity.d>
			//    3    7:invokevirtual   #31  <Method int Spinner.getSelectedItemPosition()>
			//    4   10:istore_1        
				String s;
				if(i1 > 0)
			//*   5   11:iload_1         
			//*   6   12:ifle            36
					s = BugReportActivity.b(a).a(i1).b().getId();
			//    7   15:aload_0         
			//    8   16:getfield        #17  <Field BugReportActivity a>
			//    9   19:invokestatic    #35  <Method g BugReportActivity.b(BugReportActivity)>
			//   10   22:iload_1         
			//   11   23:invokevirtual   #40  <Method a g.a(int)>
			//   12   26:invokevirtual   #45  <Method AssetId a.b()>
			//   13   29:invokevirtual   #51  <Method String AssetId.getId()>
			//   14   32:astore_2        
				else
			//*  15   33:goto            42
					s = "";
			//   16   36:ldc1            #53  <String "">
			//   17   38:astore_2        
			//*  18   39:goto            33
				if(com.irobot.home.BugReportActivity.a(a) != null)
			//*  19   42:aload_0         
			//*  20   43:getfield        #17  <Field BugReportActivity a>
			//*  21   46:invokestatic    #56  <Method MissionSubsystem com.irobot.home.BugReportActivity.a(BugReportActivity)>
			//*  22   49:ifnull          66
					com.irobot.home.BugReportActivity.a(a).sendServiceCommand(MissionUIServiceCommand.DisableLogStream, ((com.irobot.core.MissionUIServiceData) (null)));
			//   23   52:aload_0         
			//   24   53:getfield        #17  <Field BugReportActivity a>
			//   25   56:invokestatic    #56  <Method MissionSubsystem com.irobot.home.BugReportActivity.a(BugReportActivity)>
			//   26   59:getstatic       #62  <Field MissionUIServiceCommand MissionUIServiceCommand.DisableLogStream>
			//   27   62:aconst_null     
			//   28   63:invokevirtual   #68  <Method void MissionSubsystem.sendServiceCommand(MissionUIServiceCommand, com.irobot.core.MissionUIServiceData)>
				String s1 = TextUtils.join("\n", ((Iterable) (BugReportActivity.c(a))));
			//   29   66:ldc1            #70  <String "\n">
			//   30   68:aload_0         
			//   31   69:getfield        #17  <Field BugReportActivity a>
			//   32   72:invokestatic    #74  <Method List BugReportActivity.c(BugReportActivity)>
			//   33   75:invokestatic    #80  <Method String TextUtils.join(CharSequence, Iterable)>
			//   34   78:astore_3        
				String s2 = ((Object) (a.a.getText())).toString();
			//   35   79:aload_0         
			//   36   80:getfield        #17  <Field BugReportActivity a>
			//   37   83:getfield        #83  <Field EditText com.irobot.home.BugReportActivity.a>
			//   38   86:invokevirtual   #89  <Method android.text.Editable EditText.getText()>
			//   39   89:invokevirtual   #92  <Method String Object.toString()>
			//   40   92:astore          4
				HashMap hashmap = new HashMap();
			//   41   94:new             #94  <Class HashMap>
			//   42   97:dup             
			//   43   98:invokespecial   #95  <Method void HashMap()>
			//   44  101:astore          5
				if(a.b.isEnabled() && a.b.isChecked())
			//*  45  103:aload_0         
			//*  46  104:getfield        #17  <Field BugReportActivity a>
			//*  47  107:getfield        #98  <Field SwitchCompat BugReportActivity.b>
			//*  48  110:invokevirtual   #104 <Method boolean SwitchCompat.isEnabled()>
			//*  49  113:ifeq            162
			//*  50  116:aload_0         
			//*  51  117:getfield        #17  <Field BugReportActivity a>
			//*  52  120:getfield        #98  <Field SwitchCompat BugReportActivity.b>
			//*  53  123:invokevirtual   #107 <Method boolean SwitchCompat.isChecked()>
			//*  54  126:ifeq            162
				{
					ArrayList arraylist = new ArrayList();
			//   55  129:new             #109 <Class ArrayList>
			//   56  132:dup             
			//   57  133:invokespecial   #110 <Method void ArrayList()>
			//   58  136:astore          6
					arraylist.add(((Object) (a.h)));
			//   59  138:aload           6
			//   60  140:aload_0         
			//   61  141:getfield        #17  <Field BugReportActivity a>
			//   62  144:getfield        #114 <Field String BugReportActivity.h>
			//   63  147:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
			//   64  150:pop             
					hashmap.put(((Object) (BugReportFileType.Screenshot)), ((Object) (arraylist)));
			//   65  151:aload           5
			//   66  153:getstatic       #124 <Field BugReportFileType BugReportFileType.Screenshot>
			//   67  156:aload           6
			//   68  158:invokevirtual   #128 <Method Object HashMap.put(Object, Object)>
			//   69  161:pop             
				}
				ApplicationUIServiceData applicationuiservicedata = ApplicationUIServiceData.create();
			//   70  162:invokestatic    #134 <Method ApplicationUIServiceData ApplicationUIServiceData.create()>
			//   71  165:astore          6
				applicationuiservicedata.setBugReportData(s2, s, a.e.getSelectedItem().toString(), s1, com.irobot.home.util.j.b(((android.content.Context) (a))), hashmap);
			//   72  167:aload           6
			//   73  169:aload           4
			//   74  171:aload_2         
			//   75  172:aload_0         
			//   76  173:getfield        #17  <Field BugReportActivity a>
			//   77  176:getfield        #137 <Field Spinner BugReportActivity.e>
			//   78  179:invokevirtual   #141 <Method Object Spinner.getSelectedItem()>
			//   79  182:invokevirtual   #92  <Method String Object.toString()>
			//   80  185:aload_3         
			//   81  186:aload_0         
			//   82  187:getfield        #17  <Field BugReportActivity a>
			//   83  190:invokestatic    #146 <Method String j.b(android.content.Context)>
			//   84  193:aload           5
			//   85  195:invokevirtual   #150 <Method void ApplicationUIServiceData.setBugReportData(String, String, String, String, String, HashMap)>
				BugReportActivity.d(a).sendCommand(ApplicationUIServiceCommand.SubmitBugReport, applicationuiservicedata);
			//   86  198:aload_0         
			//   87  199:getfield        #17  <Field BugReportActivity a>
			//   88  202:invokestatic    #153 <Method ApplicationUIService BugReportActivity.d(BugReportActivity)>
			//   89  205:getstatic       #159 <Field ApplicationUIServiceCommand ApplicationUIServiceCommand.SubmitBugReport>
			//   90  208:aload           6
			//   91  210:invokevirtual   #165 <Method void ApplicationUIService.sendCommand(ApplicationUIServiceCommand, ApplicationUIServiceData)>
			//   92  213:return          
			}

			final BugReportActivity a;

			
			{
				a = BugReportActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BugReportActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    6   12:new             #8   <Class BugReportActivity$2>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #277 <Method void BugReportActivity$2(BugReportActivity)>
	//   10   20:invokestatic    #282 <Method void AsyncTask.execute(Runnable)>
	//   11   23:return          
	}

	protected void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #285 <Method void BaseFragmentActivity.onDestroy()>
		if(h != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #172 <Field String h>
	//*   4    8:ifnull          18
			com.irobot.home.util.f.a(h);
	//    5   11:aload_0         
	//    6   12:getfield        #172 <Field String h>
	//    7   15:invokestatic    #290 <Method void com.irobot.home.util.f.a(String)>
	//    8   18:return          
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #293 <Method void BaseFragmentActivity.onPause()>
		if(j != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #295 <Field android.support.v7.app.a j>
	//*   4    8:ifnull          18
			j.dismiss();
	//    5   11:aload_0         
	//    6   12:getfield        #295 <Field android.support.v7.app.a j>
	//    7   15:invokevirtual   #298 <Method void android.support.v7.app.a.dismiss()>
		if(k != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #300 <Field android.support.v7.app.a k>
	//*  10   22:ifnull          32
			k.dismiss();
	//   11   25:aload_0         
	//   12   26:getfield        #300 <Field android.support.v7.app.a k>
	//   13   29:invokevirtual   #298 <Method void android.support.v7.app.a.dismiss()>
	//   14   32:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #303 <Method void BaseFragmentActivity.onResume()>
		if(o)
	//*   2    4:aload_0         
	//*   3    5:getfield        #74  <Field boolean o>
	//*   4    8:ifeq            42
		{
			v.sendServiceCommand(MissionUIServiceCommand.EnableLogStream, ((com.irobot.core.MissionUIServiceData) (null)));
	//    5   11:aload_0         
	//    6   12:getfield        #93  <Field MissionSubsystem v>
	//    7   15:getstatic       #309 <Field MissionUIServiceCommand MissionUIServiceCommand.EnableLogStream>
	//    8   18:aconst_null     
	//    9   19:invokevirtual   #315 <Method void MissionSubsystem.sendServiceCommand(MissionUIServiceCommand, com.irobot.core.MissionUIServiceData)>
			n.postDelayed(t, 10000L);
	//   10   22:aload_0         
	//   11   23:getfield        #72  <Field Handler n>
	//   12   26:aload_0         
	//   13   27:getfield        #79  <Field Runnable t>
	//   14   30:ldc2w           #316 <Long 10000L>
	//   15   33:invokevirtual   #321 <Method boolean Handler.postDelayed(Runnable, long)>
	//   16   36:pop             
			o = false;
	//   17   37:aload_0         
	//   18   38:iconst_0        
	//   19   39:putfield        #74  <Field boolean o>
		}
	//   20   42:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #324 <Method void BaseFragmentActivity.onStart()>
		u.registerUISubscriber(w);
	//    2    4:aload_0         
	//    3    5:getfield        #91  <Field ApplicationUIService u>
	//    4    8:aload_0         
	//    5    9:getfield        #96  <Field ApplicationUIServiceDataCallback w>
	//    6   12:invokevirtual   #330 <Method boolean ApplicationUIService.registerUISubscriber(ApplicationUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #333 <Method void BaseFragmentActivity.onStop()>
		u.unregisterSubscriber(w);
	//    2    4:aload_0         
	//    3    5:getfield        #91  <Field ApplicationUIService u>
	//    4    8:aload_0         
	//    5    9:getfield        #96  <Field ApplicationUIServiceDataCallback w>
	//    6   12:invokevirtual   #336 <Method boolean ApplicationUIService.unregisterSubscriber(ApplicationUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	EditText a;
	SwitchCompat b;
	CustomTextView c;
	Spinner d;
	Spinner e;
	Button f;
	String g;
	String h;
	ProgressDialog i;
	android.support.v7.app.a j;
	android.support.v7.app.a k;
	private g l;
	private List m;
	private final Handler n = new Handler();
	private boolean o;
	private final Runnable t = new Runnable() {

		public void run()
		{
			com.irobot.home.BugReportActivity.a(a).sendServiceCommand(MissionUIServiceCommand.DisableLogStream, ((com.irobot.core.MissionUIServiceData) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field BugReportActivity a>
		//    2    4:invokestatic    #22  <Method MissionSubsystem com.irobot.home.BugReportActivity.a(BugReportActivity)>
		//    3    7:getstatic       #28  <Field MissionUIServiceCommand MissionUIServiceCommand.DisableLogStream>
		//    4   10:aconst_null     
		//    5   11:invokevirtual   #34  <Method void MissionSubsystem.sendServiceCommand(MissionUIServiceCommand, com.irobot.core.MissionUIServiceData)>
		//    6   14:return          
		}

		final BugReportActivity a;

			
			{
				a = BugReportActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field BugReportActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private ApplicationUIService u;
	private MissionSubsystem v;
	private ApplicationUIServiceDataCallback w;
}
