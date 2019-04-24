// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.irobot.core.*;
import com.irobot.home.util.f;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CheckableLinearLayout;
import com.irobot.home.view.CustomButton;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity

public class PersistentMapFeedbackActivity extends BaseFragmentActivity
	implements com.irobot.home.view.CheckableLinearLayout.a
{

	public PersistentMapFeedbackActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void BaseFragmentActivity()>
		l = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #69  <Field boolean l>
		m = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #71  <Field boolean m>
		n = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #73  <Field boolean n>
		o = Assembler.getInstance().getApplicationUIService();
	//   11   19:aload_0         
	//   12   20:invokestatic    #79  <Method Assembler Assembler.getInstance()>
	//   13   23:invokevirtual   #83  <Method ApplicationUIService Assembler.getApplicationUIService()>
	//   14   26:putfield        #85  <Field ApplicationUIService o>
		t = ((ApplicationUIServiceDataCallback) (new ApplicationUIServiceDataCallback() {

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
			//    6   14:ifeq            133
					ApplicationUIState applicationuistate = (ApplicationUIState)((Iterator) (applicationuiservicedata)).next();
			//    7   17:aload_1         
			//    8   18:invokeinterface #40  <Method Object Iterator.next()>
			//    9   23:checkcast       #42  <Class ApplicationUIState>
			//   10   26:astore_2        
					static class _cls6
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

					switch(_cls6.a[applicationuistate.ordinal()])
			//*  11   27:getstatic       #47  <Field int[] PersistentMapFeedbackActivity$6.a>
			//*  12   30:aload_2         
			//*  13   31:invokevirtual   #51  <Method int ApplicationUIState.ordinal()>
			//*  14   34:iaload          
					{
			//*  15   35:tableswitch     1 3: default 60
			//			               1 123
			//			               2 113
			//			               3 103
					default:
						String s = PersistentMapFeedbackActivity.g();
			//   16   60:invokestatic    #55  <Method String PersistentMapFeedbackActivity.g()>
			//   17   63:astore_3        
						StringBuilder stringbuilder = new StringBuilder();
			//   18   64:new             #57  <Class StringBuilder>
			//   19   67:dup             
			//   20   68:invokespecial   #58  <Method void StringBuilder()>
			//   21   71:astore          4
						stringbuilder.append("Unhandled ApplicationUIState: ");
			//   22   73:aload           4
			//   23   75:ldc1            #60  <String "Unhandled ApplicationUIState: ">
			//   24   77:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
			//   25   80:pop             
						stringbuilder.append(applicationuistate.name());
			//   26   81:aload           4
			//   27   83:aload_2         
			//   28   84:invokevirtual   #67  <Method String ApplicationUIState.name()>
			//   29   87:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
			//   30   90:pop             
						com.irobot.home.util.o.d(s, stringbuilder.toString());
			//   31   91:aload_3         
			//   32   92:aload           4
			//   33   94:invokevirtual   #70  <Method String StringBuilder.toString()>
			//   34   97:invokestatic    #76  <Method void o.d(String, String)>
						break;

			//*  35  100:goto            8
					case 3: // '\003'
						PersistentMapFeedbackActivity.h(a);
			//   36  103:aload_0         
			//   37  104:getfield        #12  <Field PersistentMapFeedbackActivity a>
			//   38  107:invokestatic    #79  <Method void PersistentMapFeedbackActivity.h(PersistentMapFeedbackActivity)>
						break;

			//*  39  110:goto            8
					case 2: // '\002'
						PersistentMapFeedbackActivity.g(a);
			//   40  113:aload_0         
			//   41  114:getfield        #12  <Field PersistentMapFeedbackActivity a>
			//   42  117:invokestatic    #81  <Method void PersistentMapFeedbackActivity.g(PersistentMapFeedbackActivity)>
						break;

			//*  43  120:goto            8
					case 1: // '\001'
						com.irobot.home.PersistentMapFeedbackActivity.f(a);
			//   44  123:aload_0         
			//   45  124:getfield        #12  <Field PersistentMapFeedbackActivity a>
			//   46  127:invokestatic    #84  <Method void com.irobot.home.PersistentMapFeedbackActivity.f(PersistentMapFeedbackActivity)>
						break;
					}
				} while(true);
			//*  47  130:goto            8
			//   48  133:return          
			}

			final PersistentMapFeedbackActivity a;

			
			{
				a = PersistentMapFeedbackActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field PersistentMapFeedbackActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void ApplicationUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//   15   29:aload_0         
	//   16   30:new             #20  <Class PersistentMapFeedbackActivity$5>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:invokespecial   #88  <Method void PersistentMapFeedbackActivity$5(PersistentMapFeedbackActivity)>
	//   20   38:putfield        #90  <Field ApplicationUIServiceDataCallback t>
	//   21   41:return          
	}

	static void a(PersistentMapFeedbackActivity persistentmapfeedbackactivity)
	{
		persistentmapfeedbackactivity.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method void h()>
	//    2    4:return          
	}

	static boolean a(PersistentMapFeedbackActivity persistentmapfeedbackactivity, boolean flag)
	{
		persistentmapfeedbackactivity.n = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #73  <Field boolean n>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static boolean b(PersistentMapFeedbackActivity persistentmapfeedbackactivity)
	{
		return persistentmapfeedbackactivity.l;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field boolean l>
	//    2    4:ireturn         
	}

	static boolean c(PersistentMapFeedbackActivity persistentmapfeedbackactivity)
	{
		return persistentmapfeedbackactivity.m;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field boolean m>
	//    2    4:ireturn         
	}

	static void d(PersistentMapFeedbackActivity persistentmapfeedbackactivity)
	{
		persistentmapfeedbackactivity.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method void j()>
	//    2    4:return          
	}

	static void e(PersistentMapFeedbackActivity persistentmapfeedbackactivity)
	{
		persistentmapfeedbackactivity.k();
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void k()>
	//    2    4:return          
	}

	static void f(PersistentMapFeedbackActivity persistentmapfeedbackactivity)
	{
		persistentmapfeedbackactivity.l();
	//    0    0:aload_0         
	//    1    1:invokespecial   #100 <Method void l()>
	//    2    4:return          
	}

	static String g()
	{
		return k;
	//    0    0:getstatic       #63  <Field String k>
	//    1    3:areturn         
	}

	static void g(PersistentMapFeedbackActivity persistentmapfeedbackactivity)
	{
		persistentmapfeedbackactivity.m();
	//    0    0:aload_0         
	//    1    1:invokespecial   #102 <Method void m()>
	//    2    4:return          
	}

	private void h()
	{
		CustomButton custombutton = d;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field CustomButton d>
	//    2    4:astore_2        
		boolean flag;
		if(!l && !m && !n)
	//*   3    5:aload_0         
	//*   4    6:getfield        #69  <Field boolean l>
	//*   5    9:ifne            34
	//*   6   12:aload_0         
	//*   7   13:getfield        #71  <Field boolean m>
	//*   8   16:ifne            34
	//*   9   19:aload_0         
	//*  10   20:getfield        #73  <Field boolean n>
	//*  11   23:ifeq            29
	//*  12   26:goto            34
			flag = false;
	//   13   29:iconst_0        
	//   14   30:istore_1        
		else
	//*  15   31:goto            36
			flag = true;
	//   16   34:iconst_1        
	//   17   35:istore_1        
		custombutton.setEnabled(flag);
	//   18   36:aload_2         
	//   19   37:iload_1         
	//   20   38:invokevirtual   #110 <Method void CustomButton.setEnabled(boolean)>
	//   21   41:return          
	}

	static void h(PersistentMapFeedbackActivity persistentmapfeedbackactivity)
	{
		persistentmapfeedbackactivity.n();
	//    0    0:aload_0         
	//    1    1:invokespecial   #112 <Method void n()>
	//    2    4:return          
	}

	private void i()
	{
		i = new ProgressDialog(((android.content.Context) (this)));
	//    0    0:aload_0         
	//    1    1:new             #114 <Class ProgressDialog>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #117 <Method void ProgressDialog(android.content.Context)>
	//    5    9:putfield        #119 <Field ProgressDialog i>
		i.setMessage(((CharSequence) (getString(0x7f0f0172))));
	//    6   12:aload_0         
	//    7   13:getfield        #119 <Field ProgressDialog i>
	//    8   16:aload_0         
	//    9   17:ldc1            #120 <Int 0x7f0f0172>
	//   10   19:invokevirtual   #124 <Method String getString(int)>
	//   11   22:invokevirtual   #128 <Method void ProgressDialog.setMessage(CharSequence)>
		i.show();
	//   12   25:aload_0         
	//   13   26:getfield        #119 <Field ProgressDialog i>
	//   14   29:invokevirtual   #131 <Method void ProgressDialog.show()>
	//   15   32:return          
	}

	private void j()
	{
		if(i != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #119 <Field ProgressDialog i>
	//*   2    4:ifnull          19
		{
			i.dismiss();
	//    3    7:aload_0         
	//    4    8:getfield        #119 <Field ProgressDialog i>
	//    5   11:invokevirtual   #134 <Method void ProgressDialog.dismiss()>
			i = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #119 <Field ProgressDialog i>
		}
	//    9   19:return          
	}

	private void k()
	{
		View view = getCurrentFocus();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #138 <Method View getCurrentFocus()>
	//    2    4:astore_1        
		InputMethodManager inputmethodmanager = (InputMethodManager)getSystemService("input_method");
	//    3    5:aload_0         
	//    4    6:ldc1            #140 <String "input_method">
	//    5    8:invokevirtual   #144 <Method Object getSystemService(String)>
	//    6   11:checkcast       #146 <Class InputMethodManager>
	//    7   14:astore_2        
		if(inputmethodmanager != null)
	//*   8   15:aload_2         
	//*   9   16:ifnull          29
			inputmethodmanager.hideSoftInputFromWindow(view.getWindowToken(), 2);
	//   10   19:aload_2         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #152 <Method android.os.IBinder View.getWindowToken()>
	//   13   24:iconst_2        
	//   14   25:invokevirtual   #156 <Method boolean InputMethodManager.hideSoftInputFromWindow(android.os.IBinder, int)>
	//   15   28:pop             
	//   16   29:return          
	}

	private void l()
	{
	//    0    0:return          
	}

	private void m()
	{
		runOnUiThread(new Runnable() {

			public void run()
			{
				PersistentMapFeedbackActivity.d(a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field PersistentMapFeedbackActivity a>
			//    2    4:invokestatic    #26  <Method void PersistentMapFeedbackActivity.d(PersistentMapFeedbackActivity)>
				a.j = (new android.app.AlertDialog.Builder(((android.content.Context) (a)))).setMessage(0x7f0f02f0).setPositiveButton(0x7f0f05bb, new android.content.DialogInterface.OnClickListener(this) {

					public void onClick(DialogInterface dialoginterface, int i1)
					{
						com.irobot.home.util.f.a();
					//    0    0:invokestatic    #26  <Method void f.a()>
						PersistentMapFeedbackActivity.e(a.a);
					//    1    3:aload_0         
					//    2    4:getfield        #17  <Field PersistentMapFeedbackActivity$3 a>
					//    3    7:getfield        #29  <Field PersistentMapFeedbackActivity PersistentMapFeedbackActivity$3.a>
					//    4   10:invokestatic    #35  <Method void PersistentMapFeedbackActivity.e(PersistentMapFeedbackActivity)>
						a.a.finish();
					//    5   13:aload_0         
					//    6   14:getfield        #17  <Field PersistentMapFeedbackActivity$3 a>
					//    7   17:getfield        #29  <Field PersistentMapFeedbackActivity PersistentMapFeedbackActivity$3.a>
					//    8   20:invokevirtual   #38  <Method void PersistentMapFeedbackActivity.finish()>
					//    9   23:return          
					}

					final _cls3 a;

			
			{
				a = _pcls3;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PersistentMapFeedbackActivity$3 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
).show();
			//    3    7:aload_0         
			//    4    8:getfield        #19  <Field PersistentMapFeedbackActivity a>
			//    5   11:new             #28  <Class android.app.AlertDialog$Builder>
			//    6   14:dup             
			//    7   15:aload_0         
			//    8   16:getfield        #19  <Field PersistentMapFeedbackActivity a>
			//    9   19:invokespecial   #31  <Method void android.app.AlertDialog$Builder(android.content.Context)>
			//   10   22:ldc1            #32  <Int 0x7f0f02f0>
			//   11   24:invokevirtual   #36  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
			//   12   27:ldc1            #37  <Int 0x7f0f05bb>
			//   13   29:new             #13  <Class PersistentMapFeedbackActivity$3$1>
			//   14   32:dup             
			//   15   33:aload_0         
			//   16   34:invokespecial   #40  <Method void PersistentMapFeedbackActivity$3$1(PersistentMapFeedbackActivity$3)>
			//   17   37:invokevirtual   #44  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
			//   18   40:invokevirtual   #48  <Method AlertDialog android.app.AlertDialog$Builder.show()>
			//   19   43:putfield        #52  <Field AlertDialog com.irobot.home.PersistentMapFeedbackActivity.j>
			//   20   46:return          
			}

			final PersistentMapFeedbackActivity a;

			
			{
				a = PersistentMapFeedbackActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field PersistentMapFeedbackActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #12  <Class PersistentMapFeedbackActivity$3>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #157 <Method void PersistentMapFeedbackActivity$3(PersistentMapFeedbackActivity)>
	//    5    9:invokevirtual   #161 <Method void runOnUiThread(Runnable)>
	//    6   12:return          
	}

	private void n()
	{
		runOnUiThread(new Runnable() {

			public void run()
			{
				a.d.setEnabled(true);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field PersistentMapFeedbackActivity a>
			//    2    4:getfield        #27  <Field CustomButton PersistentMapFeedbackActivity.d>
			//    3    7:iconst_1        
			//    4    8:invokevirtual   #33  <Method void CustomButton.setEnabled(boolean)>
				PersistentMapFeedbackActivity.d(a);
			//    5   11:aload_0         
			//    6   12:getfield        #19  <Field PersistentMapFeedbackActivity a>
			//    7   15:invokestatic    #35  <Method void PersistentMapFeedbackActivity.d(PersistentMapFeedbackActivity)>
				a.j = (new android.app.AlertDialog.Builder(((android.content.Context) (a)))).setMessage(0x7f0f02ec).setPositiveButton(0x7f0f05bb, new android.content.DialogInterface.OnClickListener(this) {

					public void onClick(DialogInterface dialoginterface, int i1)
					{
						PersistentMapFeedbackActivity.e(a.a);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field PersistentMapFeedbackActivity$4 a>
					//    2    4:getfield        #25  <Field PersistentMapFeedbackActivity PersistentMapFeedbackActivity$4.a>
					//    3    7:invokestatic    #31  <Method void PersistentMapFeedbackActivity.e(PersistentMapFeedbackActivity)>
					//    4   10:return          
					}

					final _cls4 a;

			
			{
				a = _pcls4;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PersistentMapFeedbackActivity$4 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
).show();
			//    8   18:aload_0         
			//    9   19:getfield        #19  <Field PersistentMapFeedbackActivity a>
			//   10   22:new             #37  <Class android.app.AlertDialog$Builder>
			//   11   25:dup             
			//   12   26:aload_0         
			//   13   27:getfield        #19  <Field PersistentMapFeedbackActivity a>
			//   14   30:invokespecial   #40  <Method void android.app.AlertDialog$Builder(android.content.Context)>
			//   15   33:ldc1            #41  <Int 0x7f0f02ec>
			//   16   35:invokevirtual   #45  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
			//   17   38:ldc1            #46  <Int 0x7f0f05bb>
			//   18   40:new             #13  <Class PersistentMapFeedbackActivity$4$1>
			//   19   43:dup             
			//   20   44:aload_0         
			//   21   45:invokespecial   #49  <Method void PersistentMapFeedbackActivity$4$1(PersistentMapFeedbackActivity$4)>
			//   22   48:invokevirtual   #53  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
			//   23   51:invokevirtual   #57  <Method AlertDialog android.app.AlertDialog$Builder.show()>
			//   24   54:putfield        #61  <Field AlertDialog com.irobot.home.PersistentMapFeedbackActivity.j>
			//   25   57:return          
			}

			final PersistentMapFeedbackActivity a;

			
			{
				a = PersistentMapFeedbackActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field PersistentMapFeedbackActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #16  <Class PersistentMapFeedbackActivity$4>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #162 <Method void PersistentMapFeedbackActivity$4(PersistentMapFeedbackActivity)>
	//    5    9:invokevirtual   #161 <Method void runOnUiThread(Runnable)>
	//    6   12:return          
	}

	public void a(CheckableLinearLayout checkablelinearlayout, boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #165 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #167 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #172 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	void e()
	{
		b(0x7f0f068e);
	//    0    0:aload_0         
	//    1    1:ldc1            #173 <Int 0x7f0f068e>
	//    2    3:invokevirtual   #176 <Method void b(int)>
		b.setOnCheckedChangeListener(((com.irobot.home.view.CheckableLinearLayout.a) (this)));
	//    3    6:aload_0         
	//    4    7:getfield        #178 <Field CheckableLinearLayout b>
	//    5   10:aload_0         
	//    6   11:invokevirtual   #184 <Method void CheckableLinearLayout.setOnCheckedChangeListener(com.irobot.home.view.CheckableLinearLayout$a)>
		a.setOnCheckedChangeListener(((com.irobot.home.view.CheckableLinearLayout.a) (this)));
	//    7   14:aload_0         
	//    8   15:getfield        #186 <Field CheckableLinearLayout a>
	//    9   18:aload_0         
	//   10   19:invokevirtual   #184 <Method void CheckableLinearLayout.setOnCheckedChangeListener(com.irobot.home.view.CheckableLinearLayout$a)>
		c.addTextChangedListener(new TextWatcher() {

			public void afterTextChanged(Editable editable)
			{
			//    0    0:return          
			}

			public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
			{
			//    0    0:return          
			}

			public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
			{
				PersistentMapFeedbackActivity persistentmapfeedbackactivity = a;
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field PersistentMapFeedbackActivity a>
			//    2    4:astore          6
				boolean flag;
				if(charsequence.toString().trim().length() != 0)
			//*   3    6:aload_1         
			//*   4    7:invokeinterface #31  <Method String CharSequence.toString()>
			//*   5   12:invokevirtual   #36  <Method String String.trim()>
			//*   6   15:invokevirtual   #40  <Method int String.length()>
			//*   7   18:ifeq            27
					flag = true;
			//    8   21:iconst_1        
			//    9   22:istore          5
				else
			//*  10   24:goto            30
					flag = false;
			//   11   27:iconst_0        
			//   12   28:istore          5
				PersistentMapFeedbackActivity.a(persistentmapfeedbackactivity, flag);
			//   13   30:aload           6
			//   14   32:iload           5
			//   15   34:invokestatic    #43  <Method boolean PersistentMapFeedbackActivity.a(PersistentMapFeedbackActivity, boolean)>
			//   16   37:pop             
				PersistentMapFeedbackActivity.a(a);
			//   17   38:aload_0         
			//   18   39:getfield        #17  <Field PersistentMapFeedbackActivity a>
			//   19   42:invokestatic    #45  <Method void PersistentMapFeedbackActivity.a(PersistentMapFeedbackActivity)>
			//   20   45:return          
			}

			final PersistentMapFeedbackActivity a;

			
			{
				a = PersistentMapFeedbackActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PersistentMapFeedbackActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   11   22:aload_0         
	//   12   23:getfield        #188 <Field EditText c>
	//   13   26:new             #8   <Class PersistentMapFeedbackActivity$1>
	//   14   29:dup             
	//   15   30:aload_0         
	//   16   31:invokespecial   #189 <Method void PersistentMapFeedbackActivity$1(PersistentMapFeedbackActivity)>
	//   17   34:invokevirtual   #195 <Method void EditText.addTextChangedListener(TextWatcher)>
	//   18   37:return          
	}

	public void f()
	{
		d.setEnabled(false);
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field CustomButton d>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #110 <Method void CustomButton.setEnabled(boolean)>
		i();
	//    4    8:aload_0         
	//    5    9:invokespecial   #197 <Method void i()>
		AsyncTask.execute(new Runnable() {

			public void run()
			{
				String s = ((Object) (a.c.getText())).toString();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field PersistentMapFeedbackActivity a>
			//    2    4:getfield        #25  <Field EditText PersistentMapFeedbackActivity.c>
			//    3    7:invokevirtual   #31  <Method Editable EditText.getText()>
			//    4   10:invokevirtual   #35  <Method String Object.toString()>
			//    5   13:astore_1        
				ApplicationUIServiceData.create().setPersistentMapFeedbackData(s, a.e, PersistentMapFeedbackActivity.b(a), PersistentMapFeedbackActivity.c(a), a.g, a.h, a.f, com.irobot.home.util.j.b(((android.content.Context) (a))));
			//    6   14:invokestatic    #41  <Method ApplicationUIServiceData ApplicationUIServiceData.create()>
			//    7   17:aload_1         
			//    8   18:aload_0         
			//    9   19:getfield        #17  <Field PersistentMapFeedbackActivity a>
			//   10   22:getfield        #45  <Field String PersistentMapFeedbackActivity.e>
			//   11   25:aload_0         
			//   12   26:getfield        #17  <Field PersistentMapFeedbackActivity a>
			//   13   29:invokestatic    #49  <Method boolean PersistentMapFeedbackActivity.b(PersistentMapFeedbackActivity)>
			//   14   32:aload_0         
			//   15   33:getfield        #17  <Field PersistentMapFeedbackActivity a>
			//   16   36:invokestatic    #51  <Method boolean PersistentMapFeedbackActivity.c(PersistentMapFeedbackActivity)>
			//   17   39:aload_0         
			//   18   40:getfield        #17  <Field PersistentMapFeedbackActivity a>
			//   19   43:getfield        #54  <Field String PersistentMapFeedbackActivity.g>
			//   20   46:aload_0         
			//   21   47:getfield        #17  <Field PersistentMapFeedbackActivity a>
			//   22   50:getfield        #57  <Field String PersistentMapFeedbackActivity.h>
			//   23   53:aload_0         
			//   24   54:getfield        #17  <Field PersistentMapFeedbackActivity a>
			//   25   57:getfield        #59  <Field String com.irobot.home.PersistentMapFeedbackActivity.f>
			//   26   60:aload_0         
			//   27   61:getfield        #17  <Field PersistentMapFeedbackActivity a>
			//   28   64:invokestatic    #64  <Method String j.b(android.content.Context)>
			//   29   67:invokevirtual   #68  <Method void ApplicationUIServiceData.setPersistentMapFeedbackData(String, String, boolean, boolean, String, String, String, String)>
			//   30   70:return          
			}

			final PersistentMapFeedbackActivity a;

			
			{
				a = PersistentMapFeedbackActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PersistentMapFeedbackActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    6   12:new             #10  <Class PersistentMapFeedbackActivity$2>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #198 <Method void PersistentMapFeedbackActivity$2(PersistentMapFeedbackActivity)>
	//   10   20:invokestatic    #203 <Method void AsyncTask.execute(Runnable)>
		setResult(-1);
	//   11   23:aload_0         
	//   12   24:iconst_m1       
	//   13   25:invokevirtual   #206 <Method void setResult(int)>
	//   14   28:return          
	}

	public void onBackPressed()
	{
		setResult(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #206 <Method void setResult(int)>
		super.onBackPressed();
	//    3    5:aload_0         
	//    4    6:invokespecial   #209 <Method void BaseFragmentActivity.onBackPressed()>
	//    5    9:return          
	}

	protected void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #212 <Method void BaseFragmentActivity.onDestroy()>
		if(f != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #214 <Field String f>
	//*   4    8:ifnull          18
			com.irobot.home.util.f.a(f);
	//    5   11:aload_0         
	//    6   12:getfield        #214 <Field String f>
	//    7   15:invokestatic    #218 <Method void f.a(String)>
	//    8   18:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #221 <Method void BaseFragmentActivity.onResume()>
		if(j != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #223 <Field AlertDialog j>
	//*   4    8:ifnull          18
			j.dismiss();
	//    5   11:aload_0         
	//    6   12:getfield        #223 <Field AlertDialog j>
	//    7   15:invokevirtual   #226 <Method void AlertDialog.dismiss()>
	//    8   18:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #229 <Method void BaseFragmentActivity.onStart()>
		o.registerUISubscriber(t);
	//    2    4:aload_0         
	//    3    5:getfield        #85  <Field ApplicationUIService o>
	//    4    8:aload_0         
	//    5    9:getfield        #90  <Field ApplicationUIServiceDataCallback t>
	//    6   12:invokevirtual   #235 <Method boolean ApplicationUIService.registerUISubscriber(ApplicationUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void BaseFragmentActivity.onStop()>
		o.unregisterSubscriber(t);
	//    2    4:aload_0         
	//    3    5:getfield        #85  <Field ApplicationUIService o>
	//    4    8:aload_0         
	//    5    9:getfield        #90  <Field ApplicationUIServiceDataCallback t>
	//    6   12:invokevirtual   #241 <Method boolean ApplicationUIService.unregisterSubscriber(ApplicationUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	private static final String k = com.irobot.home.util.j.r(((Class) (com/irobot/home/PersistentMapFeedbackActivity)).getSimpleName());
	CheckableLinearLayout a;
	CheckableLinearLayout b;
	EditText c;
	CustomButton d;
	String e;
	String f;
	String g;
	String h;
	ProgressDialog i;
	AlertDialog j;
	private boolean l;
	private boolean m;
	private boolean n;
	private ApplicationUIService o;
	private ApplicationUIServiceDataCallback t;

	static 
	{
	//    0    0:ldc1            #2   <Class PersistentMapFeedbackActivity>
	//    1    2:invokevirtual   #55  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #61  <Method String j.r(String)>
	//    3    8:putstatic       #63  <Field String k>
	//*   4   11:return          
	}
}
