// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.*;
import android.content.res.Resources;
import android.net.Uri;
import android.os.*;
import android.support.design.widget.Snackbar;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.*;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.*;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.*;
import android.widget.TextView;
import android.widget.Toast;
import com.startapp.android.publish.ads.nativead.*;
import com.startapp.android.publish.adsCommon.*;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import java.util.*;

// Referenced classes of package com.ext.ui:
//			BillingActivity, a, SettingsActivity

public class MainActivity extends BillingActivity
	implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.support.v7.bv.b
{
	private class a extends AsyncTask
	{

		protected transient String a(ArrayList aarraylist[])
		{
			aarraylist = ((ArrayList []) (aarraylist[0]));
		//    0    0:aload_1         
		//    1    1:iconst_0        
		//    2    2:aaload          
		//    3    3:astore_1        
			if(b == 1)
		//*   4    4:aload_0         
		//*   5    5:getfield        #22  <Field int b>
		//*   6    8:iconst_1        
		//*   7    9:icmpne          72
			{
				int i1 = ((Integer)((ArrayList) (aarraylist)).get(0)).intValue();
		//    8   12:aload_1         
		//    9   13:iconst_0        
		//   10   14:invokevirtual   #32  <Method Object ArrayList.get(int)>
		//   11   17:checkcast       #34  <Class Integer>
		//   12   20:invokevirtual   #38  <Method int Integer.intValue()>
		//   13   23:istore_2        
				aarraylist = ((ArrayList []) (MainActivity.a(a).a(i1)));
		//   14   24:aload_0         
		//   15   25:getfield        #17  <Field MainActivity a>
		//   16   28:invokestatic    #41  <Method bv MainActivity.a(MainActivity)>
		//   17   31:iload_2         
		//   18   32:invokevirtual   #46  <Method ck bv.a(int)>
		//   19   35:astore_1        
				ci.a("MainActivity : ", (new StringBuilder()).append("app to extract : ").append(((Object) (aarraylist))).toString());
		//   20   36:ldc1            #48  <String "MainActivity : ">
		//   21   38:new             #50  <Class StringBuilder>
		//   22   41:dup             
		//   23   42:invokespecial   #51  <Method void StringBuilder()>
		//   24   45:ldc1            #53  <String "app to extract : ">
		//   25   47:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
		//   26   50:aload_1         
		//   27   51:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
		//   28   54:invokevirtual   #64  <Method String StringBuilder.toString()>
		//   29   57:invokestatic    #69  <Method void ci.a(String, String)>
				return MainActivity.f(a).a(((Object) (aarraylist)));
		//   30   60:aload_0         
		//   31   61:getfield        #17  <Field MainActivity a>
		//   32   64:invokestatic    #73  <Method cn MainActivity.f(MainActivity)>
		//   33   67:aload_1         
		//   34   68:invokevirtual   #78  <Method String cn.a(Object)>
		//   35   71:areturn         
			}
			for(int j1 = 0; j1 < ((ArrayList) (aarraylist)).size(); j1++)
		//*  36   72:iconst_0        
		//*  37   73:istore_2        
		//*  38   74:iload_2         
		//*  39   75:aload_1         
		//*  40   76:invokevirtual   #81  <Method int ArrayList.size()>
		//*  41   79:icmpge          154
			{
				int k1 = ((Integer)((ArrayList) (aarraylist)).get(j1)).intValue();
		//   42   82:aload_1         
		//   43   83:iload_2         
		//   44   84:invokevirtual   #32  <Method Object ArrayList.get(int)>
		//   45   87:checkcast       #34  <Class Integer>
		//   46   90:invokevirtual   #38  <Method int Integer.intValue()>
		//   47   93:istore_3        
				ck ck1 = MainActivity.a(a).a(k1);
		//   48   94:aload_0         
		//   49   95:getfield        #17  <Field MainActivity a>
		//   50   98:invokestatic    #41  <Method bv MainActivity.a(MainActivity)>
		//   51  101:iload_3         
		//   52  102:invokevirtual   #46  <Method ck bv.a(int)>
		//   53  105:astore          4
				MainActivity.f(a).a(((Object) (ck1)));
		//   54  107:aload_0         
		//   55  108:getfield        #17  <Field MainActivity a>
		//   56  111:invokestatic    #73  <Method cn MainActivity.f(MainActivity)>
		//   57  114:aload           4
		//   58  116:invokevirtual   #78  <Method String cn.a(Object)>
		//   59  119:pop             
				publishProgress(((Object []) (new Integer[] {
					Integer.valueOf(j1 + 1), Integer.valueOf(((ArrayList) (aarraylist)).size())
				})));
		//   60  120:aload_0         
		//   61  121:iconst_2        
		//   62  122:anewarray       Integer[]
		//   63  125:dup             
		//   64  126:iconst_0        
		//   65  127:iload_2         
		//   66  128:iconst_1        
		//   67  129:iadd            
		//   68  130:invokestatic    #85  <Method Integer Integer.valueOf(int)>
		//   69  133:aastore         
		//   70  134:dup             
		//   71  135:iconst_1        
		//   72  136:aload_1         
		//   73  137:invokevirtual   #81  <Method int ArrayList.size()>
		//   74  140:invokestatic    #85  <Method Integer Integer.valueOf(int)>
		//   75  143:aastore         
		//   76  144:invokevirtual   #89  <Method void publishProgress(Object[])>
			}

		//   77  147:iload_2         
		//   78  148:iconst_1        
		//   79  149:iadd            
		//   80  150:istore_2        
		//*  81  151:goto            74
			return cm.d();
		//   82  154:invokestatic    #94  <Method String cm.d()>
		//   83  157:areturn         
		}

		protected void a(String s1)
		{
			super.onPostExecute(((Object) (s1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #101 <Method void AsyncTask.onPostExecute(Object)>
			a.c();
		//    3    5:aload_0         
		//    4    6:getfield        #17  <Field MainActivity a>
		//    5    9:invokevirtual   #103 <Method void MainActivity.c()>
			String s2 = (new StringBuilder()).append(a.getString(0x7f0d0041)).append(s1).toString();
		//    6   12:new             #50  <Class StringBuilder>
		//    7   15:dup             
		//    8   16:invokespecial   #51  <Method void StringBuilder()>
		//    9   19:aload_0         
		//   10   20:getfield        #17  <Field MainActivity a>
		//   11   23:ldc1            #104 <Int 0x7f0d0041>
		//   12   25:invokevirtual   #108 <Method String MainActivity.getString(int)>
		//   13   28:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
		//   14   31:aload_1         
		//   15   32:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
		//   16   35:invokevirtual   #64  <Method String StringBuilder.toString()>
		//   17   38:astore_2        
			MainActivity.b(a, s2);
		//   18   39:aload_0         
		//   19   40:getfield        #17  <Field MainActivity a>
		//   20   43:aload_2         
		//   21   44:invokestatic    #111 <Method void MainActivity.b(MainActivity, String)>
			if(c && !s1.equals(((Object) (MainActivity.f(a).a(0x7f0d003f)))))
		//*  22   47:aload_0         
		//*  23   48:getfield        #24  <Field boolean c>
		//*  24   51:ifeq            88
		//*  25   54:aload_1         
		//*  26   55:aload_0         
		//*  27   56:getfield        #17  <Field MainActivity a>
		//*  28   59:invokestatic    #73  <Method cn MainActivity.f(MainActivity)>
		//*  29   62:ldc1            #112 <Int 0x7f0d003f>
		//*  30   64:invokevirtual   #114 <Method String cn.a(int)>
		//*  31   67:invokevirtual   #120 <Method boolean String.equals(Object)>
		//*  32   70:ifne            88
				MainActivity.f(a).b(((Context) (a)), s1);
		//   33   73:aload_0         
		//   34   74:getfield        #17  <Field MainActivity a>
		//   35   77:invokestatic    #73  <Method cn MainActivity.f(MainActivity)>
		//   36   80:aload_0         
		//   37   81:getfield        #17  <Field MainActivity a>
		//   38   84:aload_1         
		//   39   85:invokevirtual   #123 <Method void cn.b(Context, String)>
		//   40   88:return          
		}

		protected transient void a(Integer ainteger[])
		{
			super.onProgressUpdate(((Object []) (ainteger)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #127 <Method void AsyncTask.onProgressUpdate(Object[])>
			if(MainActivity.g(a) != null)
		//*   3    5:aload_0         
		//*   4    6:getfield        #17  <Field MainActivity a>
		//*   5    9:invokestatic    #131 <Method ProgressDialog MainActivity.g(MainActivity)>
		//*   6   12:ifnull          47
			{
				MainActivity.g(a).setProgress(ainteger[0].intValue());
		//    7   15:aload_0         
		//    8   16:getfield        #17  <Field MainActivity a>
		//    9   19:invokestatic    #131 <Method ProgressDialog MainActivity.g(MainActivity)>
		//   10   22:aload_1         
		//   11   23:iconst_0        
		//   12   24:aaload          
		//   13   25:invokevirtual   #38  <Method int Integer.intValue()>
		//   14   28:invokevirtual   #137 <Method void ProgressDialog.setProgress(int)>
				MainActivity.g(a).setMax(ainteger[1].intValue());
		//   15   31:aload_0         
		//   16   32:getfield        #17  <Field MainActivity a>
		//   17   35:invokestatic    #131 <Method ProgressDialog MainActivity.g(MainActivity)>
		//   18   38:aload_1         
		//   19   39:iconst_1        
		//   20   40:aaload          
		//   21   41:invokevirtual   #38  <Method int Integer.intValue()>
		//   22   44:invokevirtual   #140 <Method void ProgressDialog.setMax(int)>
			}
		//   23   47:return          
		}

		protected Object doInBackground(Object aobj[])
		{
			return ((Object) (a((ArrayList[])aobj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #144 <Class ArrayList[]>
		//    3    5:invokevirtual   #146 <Method String a(ArrayList[])>
		//    4    8:areturn         
		}

		protected void onPostExecute(Object obj)
		{
			a((String)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #116 <Class String>
		//    3    5:invokevirtual   #148 <Method void a(String)>
		//    4    8:return          
		}

		protected void onPreExecute()
		{
			super.onPreExecute();
		//    0    0:aload_0         
		//    1    1:invokespecial   #151 <Method void AsyncTask.onPreExecute()>
			ci.a("MainActivity : ", (new StringBuilder()).append("Extract:: onPreExecute ,Size:").append(b).toString());
		//    2    4:ldc1            #48  <String "MainActivity : ">
		//    3    6:new             #50  <Class StringBuilder>
		//    4    9:dup             
		//    5   10:invokespecial   #51  <Method void StringBuilder()>
		//    6   13:ldc1            #153 <String "Extract:: onPreExecute ,Size:">
		//    7   15:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
		//    8   18:aload_0         
		//    9   19:getfield        #22  <Field int b>
		//   10   22:invokevirtual   #156 <Method StringBuilder StringBuilder.append(int)>
		//   11   25:invokevirtual   #64  <Method String StringBuilder.toString()>
		//   12   28:invokestatic    #69  <Method void ci.a(String, String)>
			if(b == 1)
		//*  13   31:aload_0         
		//*  14   32:getfield        #22  <Field int b>
		//*  15   35:iconst_1        
		//*  16   36:icmpne          60
			{
				a.a(MainActivity.f(a).a(0x7f0d0042), 0);
		//   17   39:aload_0         
		//   18   40:getfield        #17  <Field MainActivity a>
		//   19   43:aload_0         
		//   20   44:getfield        #17  <Field MainActivity a>
		//   21   47:invokestatic    #73  <Method cn MainActivity.f(MainActivity)>
		//   22   50:ldc1            #157 <Int 0x7f0d0042>
		//   23   52:invokevirtual   #114 <Method String cn.a(int)>
		//   24   55:iconst_0        
		//   25   56:invokevirtual   #160 <Method void MainActivity.a(String, int)>
				return;
		//   26   59:return          
			} else
			{
				a.a(MainActivity.f(a).a(0x7f0d0042), 1);
		//   27   60:aload_0         
		//   28   61:getfield        #17  <Field MainActivity a>
		//   29   64:aload_0         
		//   30   65:getfield        #17  <Field MainActivity a>
		//   31   68:invokestatic    #73  <Method cn MainActivity.f(MainActivity)>
		//   32   71:ldc1            #157 <Int 0x7f0d0042>
		//   33   73:invokevirtual   #114 <Method String cn.a(int)>
		//   34   76:iconst_1        
		//   35   77:invokevirtual   #160 <Method void MainActivity.a(String, int)>
				return;
		//   36   80:return          
			}
		}

		protected void onProgressUpdate(Object aobj[])
		{
			a((Integer[])aobj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #162 <Class Integer[]>
		//    3    5:invokevirtual   #164 <Method void a(Integer[])>
		//    4    8:return          
		}

		final MainActivity a;
		private int b;
		private boolean c;

		public a(int i1, boolean flag)
		{
			a = MainActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field MainActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void AsyncTask()>
			b = 0;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #22  <Field int b>
			c = false;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #24  <Field boolean c>
			b = i1;
		//   11   19:aload_0         
		//   12   20:iload_2         
		//   13   21:putfield        #22  <Field int b>
			c = flag;
		//   14   24:aload_0         
		//   15   25:iload_3         
		//   16   26:putfield        #24  <Field boolean c>
		//   17   29:return          
		}
	}


	public MainActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #101 <Method void BillingActivity()>
	//    2    4:aload_0         
	//    3    5:ldc1            #103 <String "MainActivity : ">
	//    4    7:putfield        #105 <Field String n>
	//    5   10:aload_0         
	//    6   11:iconst_1        
	//    7   12:putfield        #107 <Field int o>
		p = null;
	//    8   15:aload_0         
	//    9   16:aconst_null     
	//   10   17:putfield        #109 <Field bv p>
		f = ((BroadcastReceiver) (new BroadcastReceiver() {

			public void onReceive(Context context, Intent intent)
			{
				intent.getAction();
			//    0    0:aload_2         
			//    1    1:invokevirtual   #24  <Method String Intent.getAction()>
			//    2    4:pop             
				MainActivity.a(a).e();
			//    3    5:aload_0         
			//    4    6:getfield        #12  <Field MainActivity a>
			//    5    9:invokestatic    #27  <Method bv MainActivity.a(MainActivity)>
			//    6   12:invokevirtual   #32  <Method void bv.e()>
			//    7   15:return          
			}

			final MainActivity a;

			
			{
				a = MainActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field MainActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
		}
));
	//   11   20:aload_0         
	//   12   21:new             #11  <Class MainActivity$1>
	//   13   24:dup             
	//   14   25:aload_0         
	//   15   26:invokespecial   #112 <Method void MainActivity$1(MainActivity)>
	//   16   29:putfield        #114 <Field BroadcastReceiver f>
		s = ((List) (new ArrayList()));
	//   17   32:aload_0         
	//   18   33:new             #116 <Class ArrayList>
	//   19   36:dup             
	//   20   37:invokespecial   #117 <Method void ArrayList()>
	//   21   40:putfield        #119 <Field List s>
		t = null;
	//   22   43:aload_0         
	//   23   44:aconst_null     
	//   24   45:putfield        #121 <Field ProgressDialog t>
		u = null;
	//   25   48:aload_0         
	//   26   49:aconst_null     
	//   27   50:putfield        #123 <Field StartAppAd u>
		x = null;
	//   28   53:aload_0         
	//   29   54:aconst_null     
	//   30   55:putfield        #125 <Field TextView x>
		g = new android.support.v4.view.MenuItemCompat.OnActionExpandListener() {

			public boolean onMenuItemActionCollapse(MenuItem menuitem)
			{
				(new Thread(new Runnable(this, new Handler()) {

					public void run()
					{
						a.post(new Runnable(this) {

							public void run()
							{
								ci.a("MainActivity : ", "onMenuItemActionCollapse filtering apps");
							//    0    0:ldc1            #24  <String "MainActivity : ">
							//    1    2:ldc1            #26  <String "onMenuItemActionCollapse filtering apps">
							//    2    4:invokestatic    #31  <Method void ci.a(String, String)>
								MainActivity.a(a.b.a, "");
							//    3    7:aload_0         
							//    4    8:getfield        #19  <Field MainActivity$2$1 a>
							//    5   11:getfield        #35  <Field MainActivity$2 MainActivity$2$1.b>
							//    6   14:getfield        #38  <Field MainActivity MainActivity$2.a>
							//    7   17:ldc1            #40  <String "">
							//    8   19:invokestatic    #45  <Method void MainActivity.a(MainActivity, String)>
								MainActivity.b(a.b.a).clear();
							//    9   22:aload_0         
							//   10   23:getfield        #19  <Field MainActivity$2$1 a>
							//   11   26:getfield        #35  <Field MainActivity$2 MainActivity$2$1.b>
							//   12   29:getfield        #38  <Field MainActivity MainActivity$2.a>
							//   13   32:invokestatic    #48  <Method List MainActivity.b(MainActivity)>
							//   14   35:invokeinterface #53  <Method void List.clear()>
							//   15   40:return          
							}

							final _cls1 a;

			
			{
				a = _pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MainActivity$2$1 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
						}
);
					//    0    0:aload_0         
					//    1    1:getfield        #23  <Field Handler a>
					//    2    4:new             #13  <Class MainActivity$2$1$1>
					//    3    7:dup             
					//    4    8:aload_0         
					//    5    9:invokespecial   #31  <Method void MainActivity$2$1$1(MainActivity$2$1)>
					//    6   12:invokevirtual   #37  <Method boolean Handler.post(Runnable)>
					//    7   15:pop             
					//    8   16:return          
					}

					final Handler a;
					final _cls2 b;

			
			{
				b = _pcls2;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field MainActivity$2 b>
				a = handler;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Handler a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
				}
)).start();
			//    0    0:new             #26  <Class Thread>
			//    1    3:dup             
			//    2    4:new             #10  <Class MainActivity$2$1>
			//    3    7:dup             
			//    4    8:aload_0         
			//    5    9:new             #28  <Class Handler>
			//    6   12:dup             
			//    7   13:invokespecial   #29  <Method void Handler()>
			//    8   16:invokespecial   #32  <Method void MainActivity$2$1(MainActivity$2, Handler)>
			//    9   19:invokespecial   #35  <Method void Thread(Runnable)>
			//   10   22:invokevirtual   #38  <Method void Thread.start()>
				return true;
			//   11   25:iconst_1        
			//   12   26:ireturn         
			}

			public boolean onMenuItemActionExpand(MenuItem menuitem)
			{
				MainActivity.b(a).clear();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field MainActivity a>
			//    2    4:invokestatic    #43  <Method List MainActivity.b(MainActivity)>
			//    3    7:invokeinterface #48  <Method void List.clear()>
				MainActivity.b(a).addAll(((java.util.Collection) (MainActivity.a(a).a())));
			//    4   12:aload_0         
			//    5   13:getfield        #18  <Field MainActivity a>
			//    6   16:invokestatic    #43  <Method List MainActivity.b(MainActivity)>
			//    7   19:aload_0         
			//    8   20:getfield        #18  <Field MainActivity a>
			//    9   23:invokestatic    #51  <Method bv MainActivity.a(MainActivity)>
			//   10   26:invokevirtual   #56  <Method List bv.a()>
			//   11   29:invokeinterface #60  <Method boolean List.addAll(java.util.Collection)>
			//   12   34:pop             
				return true;
			//   13   35:iconst_1        
			//   14   36:ireturn         
			}

			final MainActivity a;

			
			{
				a = MainActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field MainActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   31   58:aload_0         
	//   32   59:new             #13  <Class MainActivity$2>
	//   33   62:dup             
	//   34   63:aload_0         
	//   35   64:invokespecial   #126 <Method void MainActivity$2(MainActivity)>
	//   36   67:putfield        #128 <Field android.support.v4.view.MenuItemCompat$OnActionExpandListener g>
		h = new android.support.v7.widget.SearchView.OnQueryTextListener() {

			public boolean onQueryTextChange(String s1)
			{
				(new Thread(new Runnable(this, new Handler(), s1) {

					public void run()
					{
						a.post(new Runnable(this) {

							public void run()
							{
								if(!MainActivity.c(a.c.a).isIconified())
							//*   0    0:aload_0         
							//*   1    1:getfield        #19  <Field MainActivity$3$1 a>
							//*   2    4:getfield        #26  <Field MainActivity$3 MainActivity$3$1.c>
							//*   3    7:getfield        #29  <Field MainActivity MainActivity$3.a>
							//*   4   10:invokestatic    #34  <Method SearchView MainActivity.c(MainActivity)>
							//*   5   13:invokevirtual   #40  <Method boolean SearchView.isIconified()>
							//*   6   16:ifne            46
								{
									ci.a("MainActivity : ", "onQueryTextChange filtering apps");
							//    7   19:ldc1            #42  <String "MainActivity : ">
							//    8   21:ldc1            #44  <String "onQueryTextChange filtering apps">
							//    9   23:invokestatic    #49  <Method void ci.a(String, String)>
									MainActivity.a(a.c.a, a.b);
							//   10   26:aload_0         
							//   11   27:getfield        #19  <Field MainActivity$3$1 a>
							//   12   30:getfield        #26  <Field MainActivity$3 MainActivity$3$1.c>
							//   13   33:getfield        #29  <Field MainActivity MainActivity$3.a>
							//   14   36:aload_0         
							//   15   37:getfield        #19  <Field MainActivity$3$1 a>
							//   16   40:getfield        #53  <Field String MainActivity$3$1.b>
							//   17   43:invokestatic    #56  <Method void MainActivity.a(MainActivity, String)>
								}
							//   18   46:return          
							}

							final _cls1 a;

			
			{
				a = _pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MainActivity$3$1 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
						}
);
					//    0    0:aload_0         
					//    1    1:getfield        #25  <Field Handler a>
					//    2    4:new             #13  <Class MainActivity$3$1$1>
					//    3    7:dup             
					//    4    8:aload_0         
					//    5    9:invokespecial   #35  <Method void MainActivity$3$1$1(MainActivity$3$1)>
					//    6   12:invokevirtual   #41  <Method boolean Handler.post(Runnable)>
					//    7   15:pop             
					//    8   16:return          
					}

					final Handler a;
					final String b;
					final _cls3 c;

			
			{
				c = _pcls3;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field MainActivity$3 c>
				a = handler;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field Handler a>
				b = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field String b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #30  <Method void Object()>
			//   11   19:return          
			}
				}
)).start();
			//    0    0:new             #26  <Class Thread>
			//    1    3:dup             
			//    2    4:new             #10  <Class MainActivity$3$1>
			//    3    7:dup             
			//    4    8:aload_0         
			//    5    9:new             #28  <Class Handler>
			//    6   12:dup             
			//    7   13:invokespecial   #29  <Method void Handler()>
			//    8   16:aload_1         
			//    9   17:invokespecial   #32  <Method void MainActivity$3$1(MainActivity$3, Handler, String)>
			//   10   20:invokespecial   #35  <Method void Thread(Runnable)>
			//   11   23:invokevirtual   #38  <Method void Thread.start()>
				return true;
			//   12   26:iconst_1        
			//   13   27:ireturn         
			}

			public boolean onQueryTextSubmit(String s1)
			{
				return false;
			//    0    0:iconst_0        
			//    1    1:ireturn         
			}

			final MainActivity a;

			
			{
				a = MainActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field MainActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   37   70:aload_0         
	//   38   71:new             #19  <Class MainActivity$3>
	//   39   74:dup             
	//   40   75:aload_0         
	//   41   76:invokespecial   #129 <Method void MainActivity$3(MainActivity)>
	//   42   79:putfield        #131 <Field android.support.v7.widget.SearchView$OnQueryTextListener h>
		i = new android.support.v7.view.ActionMode.Callback() {

			public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
			{
				if(menuitem.getItemId() == 0x7f090012)
			//*   0    0:aload_2         
			//*   1    1:invokeinterface #26  <Method int MenuItem.getItemId()>
			//*   2    6:ldc1            #27  <Int 0x7f090012>
			//*   3    8:icmpne          63
				{
					ci.a("MainActivity : ", "onActionItemClicked: Extract");
			//    4   11:ldc1            #29  <String "MainActivity : ">
			//    5   13:ldc1            #31  <String "onActionItemClicked: Extract">
			//    6   15:invokestatic    #36  <Method void ci.a(String, String)>
					actionmode = ((ActionMode) (new ArrayList()));
			//    7   18:new             #38  <Class ArrayList>
			//    8   21:dup             
			//    9   22:invokespecial   #39  <Method void ArrayList()>
			//   10   25:astore_1        
					((ArrayList) (actionmode)).addAll(((java.util.Collection) (MainActivity.a(a).d())));
			//   11   26:aload_1         
			//   12   27:aload_0         
			//   13   28:getfield        #14  <Field MainActivity a>
			//   14   31:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
			//   15   34:invokevirtual   #48  <Method HashSet bv.d()>
			//   16   37:invokevirtual   #52  <Method boolean ArrayList.addAll(java.util.Collection)>
			//   17   40:pop             
					MainActivity.a(a, 1, ((ArrayList) (actionmode)), false);
			//   18   41:aload_0         
			//   19   42:getfield        #14  <Field MainActivity a>
			//   20   45:iconst_1        
			//   21   46:aload_1         
			//   22   47:iconst_0        
			//   23   48:invokestatic    #55  <Method void MainActivity.a(MainActivity, int, ArrayList, boolean)>
					MainActivity.d(a).finish();
			//   24   51:aload_0         
			//   25   52:getfield        #14  <Field MainActivity a>
			//   26   55:invokestatic    #58  <Method ActionMode MainActivity.d(MainActivity)>
			//   27   58:invokevirtual   #63  <Method void ActionMode.finish()>
					return true;
			//   28   61:iconst_1        
			//   29   62:ireturn         
				}
				if(menuitem.getItemId() == 0x7f09002f)
			//*  30   63:aload_2         
			//*  31   64:invokeinterface #26  <Method int MenuItem.getItemId()>
			//*  32   69:ldc1            #64  <Int 0x7f09002f>
			//*  33   71:icmpne          230
				{
					int i1 = MainActivity.a(a).getItemCount();
			//   34   74:aload_0         
			//   35   75:getfield        #14  <Field MainActivity a>
			//   36   78:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
			//   37   81:invokevirtual   #67  <Method int bv.getItemCount()>
			//   38   84:istore_3        
					if(i1 <= MainActivity.a(a).d().size())
			//*  39   85:iload_3         
			//*  40   86:aload_0         
			//*  41   87:getfield        #14  <Field MainActivity a>
			//*  42   90:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
			//*  43   93:invokevirtual   #48  <Method HashSet bv.d()>
			//*  44   96:invokevirtual   #72  <Method int HashSet.size()>
			//*  45   99:icmpgt          169
					{
						menuitem.setIcon(0x108000f);
			//   46  102:aload_2         
			//   47  103:ldc1            #73  <Int 0x108000f>
			//   48  105:invokeinterface #77  <Method MenuItem MenuItem.setIcon(int)>
			//   49  110:pop             
						MainActivity.a(a).b();
			//   50  111:aload_0         
			//   51  112:getfield        #14  <Field MainActivity a>
			//   52  115:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
			//   53  118:invokevirtual   #80  <Method void bv.b()>
						MainActivity.d(a).setTitle(((CharSequence) ((new StringBuilder()).append("0 / ").append(i1).toString())));
			//   54  121:aload_0         
			//   55  122:getfield        #14  <Field MainActivity a>
			//   56  125:invokestatic    #58  <Method ActionMode MainActivity.d(MainActivity)>
			//   57  128:new             #82  <Class StringBuilder>
			//   58  131:dup             
			//   59  132:invokespecial   #83  <Method void StringBuilder()>
			//   60  135:ldc1            #85  <String "0 / ">
			//   61  137:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
			//   62  140:iload_3         
			//   63  141:invokevirtual   #92  <Method StringBuilder StringBuilder.append(int)>
			//   64  144:invokevirtual   #96  <Method String StringBuilder.toString()>
			//   65  147:invokevirtual   #100 <Method void ActionMode.setTitle(CharSequence)>
						ci.a("MainActivity : ", "onActionItemClicked :check_box: Cleared all Selections");
			//   66  150:ldc1            #29  <String "MainActivity : ">
			//   67  152:ldc1            #102 <String "onActionItemClicked :check_box: Cleared all Selections">
			//   68  154:invokestatic    #36  <Method void ci.a(String, String)>
						MainActivity.d(a).finish();
			//   69  157:aload_0         
			//   70  158:getfield        #14  <Field MainActivity a>
			//   71  161:invokestatic    #58  <Method ActionMode MainActivity.d(MainActivity)>
			//   72  164:invokevirtual   #63  <Method void ActionMode.finish()>
						return true;
			//   73  167:iconst_1        
			//   74  168:ireturn         
					} else
					{
						menuitem.setIcon(0x1080010);
			//   75  169:aload_2         
			//   76  170:ldc1            #103 <Int 0x1080010>
			//   77  172:invokeinterface #77  <Method MenuItem MenuItem.setIcon(int)>
			//   78  177:pop             
						MainActivity.a(a).c();
			//   79  178:aload_0         
			//   80  179:getfield        #14  <Field MainActivity a>
			//   81  182:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
			//   82  185:invokevirtual   #106 <Method void bv.c()>
						MainActivity.d(a).setTitle(((CharSequence) ((new StringBuilder()).append(i1).append(" / ").append(i1).toString())));
			//   83  188:aload_0         
			//   84  189:getfield        #14  <Field MainActivity a>
			//   85  192:invokestatic    #58  <Method ActionMode MainActivity.d(MainActivity)>
			//   86  195:new             #82  <Class StringBuilder>
			//   87  198:dup             
			//   88  199:invokespecial   #83  <Method void StringBuilder()>
			//   89  202:iload_3         
			//   90  203:invokevirtual   #92  <Method StringBuilder StringBuilder.append(int)>
			//   91  206:ldc1            #108 <String " / ">
			//   92  208:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
			//   93  211:iload_3         
			//   94  212:invokevirtual   #92  <Method StringBuilder StringBuilder.append(int)>
			//   95  215:invokevirtual   #96  <Method String StringBuilder.toString()>
			//   96  218:invokevirtual   #100 <Method void ActionMode.setTitle(CharSequence)>
						ci.a("MainActivity : ", "onActionItemClicked:check_box: selected all items");
			//   97  221:ldc1            #29  <String "MainActivity : ">
			//   98  223:ldc1            #110 <String "onActionItemClicked:check_box: selected all items">
			//   99  225:invokestatic    #36  <Method void ci.a(String, String)>
						return true;
			//  100  228:iconst_1        
			//  101  229:ireturn         
					}
				} else
				{
					return false;
			//  102  230:iconst_0        
			//  103  231:ireturn         
				}
			}

			public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
			{
				ci.a("MainActivity : ", "onCreateActionMode");
			//    0    0:ldc1            #29  <String "MainActivity : ">
			//    1    2:ldc1            #113 <String "onCreateActionMode">
			//    2    4:invokestatic    #36  <Method void ci.a(String, String)>
				actionmode.getMenuInflater().inflate(0x7f0c0002, menu);
			//    3    7:aload_1         
			//    4    8:invokevirtual   #117 <Method MenuInflater ActionMode.getMenuInflater()>
			//    5   11:ldc1            #118 <Int 0x7f0c0002>
			//    6   13:aload_2         
			//    7   14:invokevirtual   #124 <Method void MenuInflater.inflate(int, Menu)>
				MainActivity.a(a).a(true);
			//    8   17:aload_0         
			//    9   18:getfield        #14  <Field MainActivity a>
			//   10   21:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
			//   11   24:iconst_1        
			//   12   25:invokevirtual   #127 <Method void bv.a(boolean)>
				MainActivity.a(a).b();
			//   13   28:aload_0         
			//   14   29:getfield        #14  <Field MainActivity a>
			//   15   32:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
			//   16   35:invokevirtual   #80  <Method void bv.b()>
				return true;
			//   17   38:iconst_1        
			//   18   39:ireturn         
			}

			public void onDestroyActionMode(ActionMode actionmode)
			{
				MainActivity.a(a).a(false);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field MainActivity a>
			//    2    4:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
			//    3    7:iconst_0        
			//    4    8:invokevirtual   #127 <Method void bv.a(boolean)>
				MainActivity.a(a).b();
			//    5   11:aload_0         
			//    6   12:getfield        #14  <Field MainActivity a>
			//    7   15:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
			//    8   18:invokevirtual   #80  <Method void bv.b()>
				MainActivity.a(a, ((ActionMode) (null)));
			//    9   21:aload_0         
			//   10   22:getfield        #14  <Field MainActivity a>
			//   11   25:aconst_null     
			//   12   26:invokestatic    #132 <Method ActionMode MainActivity.a(MainActivity, ActionMode)>
			//   13   29:pop             
				MainActivity.a(a).b(1);
			//   14   30:aload_0         
			//   15   31:getfield        #14  <Field MainActivity a>
			//   16   34:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
			//   17   37:iconst_1        
			//   18   38:invokevirtual   #135 <Method void bv.b(int)>
				ci.a("MainActivity : ", "onDestroyActionMode");
			//   19   41:ldc1            #29  <String "MainActivity : ">
			//   20   43:ldc1            #136 <String "onDestroyActionMode">
			//   21   45:invokestatic    #36  <Method void ci.a(String, String)>
			//   22   48:return          
			}

			public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
			{
				int i1 = MainActivity.a(a).getItemCount();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field MainActivity a>
			//    2    4:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
			//    3    7:invokevirtual   #67  <Method int bv.getItemCount()>
			//    4   10:istore_3        
				int j1 = MainActivity.a(a).d().size();
			//    5   11:aload_0         
			//    6   12:getfield        #14  <Field MainActivity a>
			//    7   15:invokestatic    #42  <Method bv MainActivity.a(MainActivity)>
			//    8   18:invokevirtual   #48  <Method HashSet bv.d()>
			//    9   21:invokevirtual   #72  <Method int HashSet.size()>
			//   10   24:istore          4
				String s1 = (new StringBuilder()).append(j1).append(" / ").append(i1).toString();
			//   11   26:new             #82  <Class StringBuilder>
			//   12   29:dup             
			//   13   30:invokespecial   #83  <Method void StringBuilder()>
			//   14   33:iload           4
			//   15   35:invokevirtual   #92  <Method StringBuilder StringBuilder.append(int)>
			//   16   38:ldc1            #108 <String " / ">
			//   17   40:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
			//   18   43:iload_3         
			//   19   44:invokevirtual   #92  <Method StringBuilder StringBuilder.append(int)>
			//   20   47:invokevirtual   #96  <Method String StringBuilder.toString()>
			//   21   50:astore          5
				if(i1 == j1)
			//*  22   52:iload_3         
			//*  23   53:iload           4
			//*  24   55:icmpne          107
					menu.findItem(0x7f09002f).setIcon(0x1080010);
			//   25   58:aload_2         
			//   26   59:ldc1            #64  <Int 0x7f09002f>
			//   27   61:invokeinterface #142 <Method MenuItem Menu.findItem(int)>
			//   28   66:ldc1            #103 <Int 0x1080010>
			//   29   68:invokeinterface #77  <Method MenuItem MenuItem.setIcon(int)>
			//   30   73:pop             
				else
			//*  31   74:aload_1         
			//*  32   75:aload           5
			//*  33   77:invokevirtual   #100 <Method void ActionMode.setTitle(CharSequence)>
			//*  34   80:ldc1            #29  <String "MainActivity : ">
			//*  35   82:new             #82  <Class StringBuilder>
			//*  36   85:dup             
			//*  37   86:invokespecial   #83  <Method void StringBuilder()>
			//*  38   89:ldc1            #144 <String "onPrepareActionMode :">
			//*  39   91:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
			//*  40   94:aload           5
			//*  41   96:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
			//*  42   99:invokevirtual   #96  <Method String StringBuilder.toString()>
			//*  43  102:invokestatic    #36  <Method void ci.a(String, String)>
			//*  44  105:iconst_1        
			//*  45  106:ireturn         
					menu.findItem(0x7f09002f).setIcon(0x108000f);
			//   46  107:aload_2         
			//   47  108:ldc1            #64  <Int 0x7f09002f>
			//   48  110:invokeinterface #142 <Method MenuItem Menu.findItem(int)>
			//   49  115:ldc1            #73  <Int 0x108000f>
			//   50  117:invokeinterface #77  <Method MenuItem MenuItem.setIcon(int)>
			//   51  122:pop             
				actionmode.setTitle(((CharSequence) (s1)));
				ci.a("MainActivity : ", (new StringBuilder()).append("onPrepareActionMode :").append(s1).toString());
				return true;
			//*  52  123:goto            74
			}

			final MainActivity a;

			
			{
				a = MainActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field MainActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   43   82:aload_0         
	//   44   83:new             #25  <Class MainActivity$4>
	//   45   86:dup             
	//   46   87:aload_0         
	//   47   88:invokespecial   #132 <Method void MainActivity$4(MainActivity)>
	//   48   91:putfield        #134 <Field android.support.v7.view.ActionMode$Callback i>
		j = new StartAppNativeAd(((Context) (this)));
	//   49   94:aload_0         
	//   50   95:new             #136 <Class StartAppNativeAd>
	//   51   98:dup             
	//   52   99:aload_0         
	//   53  100:invokespecial   #139 <Method void StartAppNativeAd(Context)>
	//   54  103:putfield        #141 <Field StartAppNativeAd j>
		k = new AdEventListener() {

			public void onFailedToReceiveAd(Ad ad)
			{
				ci.a("MainActivity : ", "StartAppNativeAd : onFailedToReceiveAd ");
			//    0    0:ldc1            #22  <String "MainActivity : ">
			//    1    2:ldc1            #24  <String "StartAppNativeAd : onFailedToReceiveAd ">
			//    2    4:invokestatic    #29  <Method void ci.a(String, String)>
			//    3    7:return          
			}

			public void onReceiveAd(Ad ad)
			{
				ci.a("MainActivity : ", "StartAppNativeAd : onReceiveAd ");
			//    0    0:ldc1            #22  <String "MainActivity : ">
			//    1    2:ldc1            #32  <String "StartAppNativeAd : onReceiveAd ">
			//    2    4:invokestatic    #29  <Method void ci.a(String, String)>
				a.e = a.j.getNativeAds();
			//    3    7:aload_0         
			//    4    8:getfield        #14  <Field MainActivity a>
			//    5   11:aload_0         
			//    6   12:getfield        #14  <Field MainActivity a>
			//    7   15:getfield        #36  <Field StartAppNativeAd MainActivity.j>
			//    8   18:invokevirtual   #42  <Method ArrayList StartAppNativeAd.getNativeAds()>
			//    9   21:putfield        #46  <Field ArrayList MainActivity.e>
				if(a.e != null && MainActivity.h(a) != null) goto _L2; else goto _L1
			//   10   24:aload_0         
			//   11   25:getfield        #14  <Field MainActivity a>
			//   12   28:getfield        #46  <Field ArrayList MainActivity.e>
			//   13   31:ifnull          44
			//   14   34:aload_0         
			//   15   35:getfield        #14  <Field MainActivity a>
			//   16   38:invokestatic    #50  <Method HashMap MainActivity.h(MainActivity)>
			//   17   41:ifnonnull       45
_L1:
				return;
			//   18   44:return          
_L2:
				ad = ((Ad) ((ArrayList)MainActivity.h(a).get(((Object) (Integer.valueOf(1))))));
			//   19   45:aload_0         
			//   20   46:getfield        #14  <Field MainActivity a>
			//   21   49:invokestatic    #50  <Method HashMap MainActivity.h(MainActivity)>
			//   22   52:iconst_1        
			//   23   53:invokestatic    #56  <Method Integer Integer.valueOf(int)>
			//   24   56:invokevirtual   #62  <Method Object HashMap.get(Object)>
			//   25   59:checkcast       #64  <Class ArrayList>
			//   26   62:astore_1        
				ArrayList arraylist = (ArrayList)MainActivity.h(a).get(((Object) (Integer.valueOf(2))));
			//   27   63:aload_0         
			//   28   64:getfield        #14  <Field MainActivity a>
			//   29   67:invokestatic    #50  <Method HashMap MainActivity.h(MainActivity)>
			//   30   70:iconst_2        
			//   31   71:invokestatic    #56  <Method Integer Integer.valueOf(int)>
			//   32   74:invokevirtual   #62  <Method Object HashMap.get(Object)>
			//   33   77:checkcast       #64  <Class ArrayList>
			//   34   80:astore          4
				ArrayList arraylist1 = (ArrayList)MainActivity.h(a).get(((Object) (Integer.valueOf(3))));
			//   35   82:aload_0         
			//   36   83:getfield        #14  <Field MainActivity a>
			//   37   86:invokestatic    #50  <Method HashMap MainActivity.h(MainActivity)>
			//   38   89:iconst_3        
			//   39   90:invokestatic    #56  <Method Integer Integer.valueOf(int)>
			//   40   93:invokevirtual   #62  <Method Object HashMap.get(Object)>
			//   41   96:checkcast       #64  <Class ArrayList>
			//   42   99:astore          5
				int i1 = a.e.size();
			//   43  101:aload_0         
			//   44  102:getfield        #14  <Field MainActivity a>
			//   45  105:getfield        #46  <Field ArrayList MainActivity.e>
			//   46  108:invokevirtual   #68  <Method int ArrayList.size()>
			//   47  111:istore_2        
				if(i1 > 2)
			//*  48  112:iload_2         
			//*  49  113:iconst_2        
			//*  50  114:icmple          434
					i1 = 1;
			//   51  117:iconst_1        
			//   52  118:istore_2        
				int j1 = 0;
			//   53  119:iconst_0        
			//   54  120:istore_3        
label0:
				do
				{
label1:
					{
						if(j1 >= i1)
							break label1;
			//   55  121:iload_3         
			//   56  122:iload_2         
			//   57  123:icmpge          313
						NativeAdDetails nativeaddetails = (NativeAdDetails)a.e.get(j1);
			//   58  126:aload_0         
			//   59  127:getfield        #14  <Field MainActivity a>
			//   60  130:getfield        #46  <Field ArrayList MainActivity.e>
			//   61  133:iload_3         
			//   62  134:invokevirtual   #71  <Method Object ArrayList.get(int)>
			//   63  137:checkcast       #73  <Class NativeAdDetails>
			//   64  140:astore          6
						nativeaddetails.sendImpression(((Context) (a)));
			//   65  142:aload           6
			//   66  144:aload_0         
			//   67  145:getfield        #14  <Field MainActivity a>
			//   68  148:invokevirtual   #77  <Method void NativeAdDetails.sendImpression(Context)>
						if(ad == null)
							break label0;
			//   69  151:aload_1         
			//   70  152:ifnull          44
						((ArrayList) (ad)).add(j1, ((Object) (new ck(nativeaddetails.getTitle(), nativeaddetails.getPackacgeName(), nativeaddetails.getDescription(), nativeaddetails.getImageBitmap(), true))));
			//   71  155:aload_1         
			//   72  156:iload_3         
			//   73  157:new             #79  <Class ck>
			//   74  160:dup             
			//   75  161:aload           6
			//   76  163:invokevirtual   #83  <Method String NativeAdDetails.getTitle()>
			//   77  166:aload           6
			//   78  168:invokevirtual   #86  <Method String NativeAdDetails.getPackacgeName()>
			//   79  171:aload           6
			//   80  173:invokevirtual   #89  <Method String NativeAdDetails.getDescription()>
			//   81  176:aload           6
			//   82  178:invokevirtual   #93  <Method android.graphics.Bitmap NativeAdDetails.getImageBitmap()>
			//   83  181:iconst_1        
			//   84  182:invokespecial   #96  <Method void ck(String, String, String, android.graphics.Bitmap, boolean)>
			//   85  185:invokevirtual   #100 <Method void ArrayList.add(int, Object)>
						arraylist.add(j1, ((Object) (new ck(nativeaddetails.getTitle(), nativeaddetails.getPackacgeName(), nativeaddetails.getDescription(), nativeaddetails.getImageBitmap(), true))));
			//   86  188:aload           4
			//   87  190:iload_3         
			//   88  191:new             #79  <Class ck>
			//   89  194:dup             
			//   90  195:aload           6
			//   91  197:invokevirtual   #83  <Method String NativeAdDetails.getTitle()>
			//   92  200:aload           6
			//   93  202:invokevirtual   #86  <Method String NativeAdDetails.getPackacgeName()>
			//   94  205:aload           6
			//   95  207:invokevirtual   #89  <Method String NativeAdDetails.getDescription()>
			//   96  210:aload           6
			//   97  212:invokevirtual   #93  <Method android.graphics.Bitmap NativeAdDetails.getImageBitmap()>
			//   98  215:iconst_1        
			//   99  216:invokespecial   #96  <Method void ck(String, String, String, android.graphics.Bitmap, boolean)>
			//  100  219:invokevirtual   #100 <Method void ArrayList.add(int, Object)>
						arraylist1.add(j1, ((Object) (new ck(nativeaddetails.getTitle(), nativeaddetails.getPackacgeName(), nativeaddetails.getDescription(), nativeaddetails.getImageBitmap(), true))));
			//  101  222:aload           5
			//  102  224:iload_3         
			//  103  225:new             #79  <Class ck>
			//  104  228:dup             
			//  105  229:aload           6
			//  106  231:invokevirtual   #83  <Method String NativeAdDetails.getTitle()>
			//  107  234:aload           6
			//  108  236:invokevirtual   #86  <Method String NativeAdDetails.getPackacgeName()>
			//  109  239:aload           6
			//  110  241:invokevirtual   #89  <Method String NativeAdDetails.getDescription()>
			//  111  244:aload           6
			//  112  246:invokevirtual   #93  <Method android.graphics.Bitmap NativeAdDetails.getImageBitmap()>
			//  113  249:iconst_1        
			//  114  250:invokespecial   #96  <Method void ck(String, String, String, android.graphics.Bitmap, boolean)>
			//  115  253:invokevirtual   #100 <Method void ArrayList.add(int, Object)>
						MainActivity.h(a).put(((Object) (Integer.valueOf(1))), ((Object) (ad)));
			//  116  256:aload_0         
			//  117  257:getfield        #14  <Field MainActivity a>
			//  118  260:invokestatic    #50  <Method HashMap MainActivity.h(MainActivity)>
			//  119  263:iconst_1        
			//  120  264:invokestatic    #56  <Method Integer Integer.valueOf(int)>
			//  121  267:aload_1         
			//  122  268:invokevirtual   #104 <Method Object HashMap.put(Object, Object)>
			//  123  271:pop             
						MainActivity.h(a).put(((Object) (Integer.valueOf(2))), ((Object) (arraylist)));
			//  124  272:aload_0         
			//  125  273:getfield        #14  <Field MainActivity a>
			//  126  276:invokestatic    #50  <Method HashMap MainActivity.h(MainActivity)>
			//  127  279:iconst_2        
			//  128  280:invokestatic    #56  <Method Integer Integer.valueOf(int)>
			//  129  283:aload           4
			//  130  285:invokevirtual   #104 <Method Object HashMap.put(Object, Object)>
			//  131  288:pop             
						MainActivity.h(a).put(((Object) (Integer.valueOf(3))), ((Object) (arraylist1)));
			//  132  289:aload_0         
			//  133  290:getfield        #14  <Field MainActivity a>
			//  134  293:invokestatic    #50  <Method HashMap MainActivity.h(MainActivity)>
			//  135  296:iconst_3        
			//  136  297:invokestatic    #56  <Method Integer Integer.valueOf(int)>
			//  137  300:aload           5
			//  138  302:invokevirtual   #104 <Method Object HashMap.put(Object, Object)>
			//  139  305:pop             
						j1++;
			//  140  306:iload_3         
			//  141  307:iconst_1        
			//  142  308:iadd            
			//  143  309:istore_3        
					}
				} while(true);
			//  144  310:goto            121
				if(true) goto _L1; else goto _L3
_L3:
				if(MainActivity.i(a).b(cj.e, true))
			//* 145  313:aload_0         
			//* 146  314:getfield        #14  <Field MainActivity a>
			//* 147  317:invokestatic    #108 <Method cj MainActivity.i(MainActivity)>
			//* 148  320:getstatic       #113 <Field String cj.e>
			//* 149  323:iconst_1        
			//* 150  324:invokevirtual   #117 <Method boolean cj.b(String, boolean)>
			//* 151  327:ifeq            368
					MainActivity.a(a).a((List)MainActivity.h(a).get(((Object) (Integer.valueOf(1)))));
			//  152  330:aload_0         
			//  153  331:getfield        #14  <Field MainActivity a>
			//  154  334:invokestatic    #120 <Method bv MainActivity.a(MainActivity)>
			//  155  337:aload_0         
			//  156  338:getfield        #14  <Field MainActivity a>
			//  157  341:invokestatic    #50  <Method HashMap MainActivity.h(MainActivity)>
			//  158  344:iconst_1        
			//  159  345:invokestatic    #56  <Method Integer Integer.valueOf(int)>
			//  160  348:invokevirtual   #62  <Method Object HashMap.get(Object)>
			//  161  351:checkcast       #122 <Class List>
			//  162  354:invokevirtual   #127 <Method void bv.a(List)>
				else
			//* 163  357:aload_0         
			//* 164  358:getfield        #14  <Field MainActivity a>
			//* 165  361:invokestatic    #120 <Method bv MainActivity.a(MainActivity)>
			//* 166  364:invokevirtual   #130 <Method void bv.notifyDataSetChanged()>
			//* 167  367:return          
				if(MainActivity.d)
			//* 168  368:getstatic       #134 <Field boolean MainActivity.d>
			//* 169  371:ifeq            404
					MainActivity.a(a).a((List)MainActivity.h(a).get(((Object) (Integer.valueOf(2)))));
			//  170  374:aload_0         
			//  171  375:getfield        #14  <Field MainActivity a>
			//  172  378:invokestatic    #120 <Method bv MainActivity.a(MainActivity)>
			//  173  381:aload_0         
			//  174  382:getfield        #14  <Field MainActivity a>
			//  175  385:invokestatic    #50  <Method HashMap MainActivity.h(MainActivity)>
			//  176  388:iconst_2        
			//  177  389:invokestatic    #56  <Method Integer Integer.valueOf(int)>
			//  178  392:invokevirtual   #62  <Method Object HashMap.get(Object)>
			//  179  395:checkcast       #122 <Class List>
			//  180  398:invokevirtual   #127 <Method void bv.a(List)>
				else
			//* 181  401:goto            357
					MainActivity.a(a).a((List)MainActivity.h(a).get(((Object) (Integer.valueOf(3)))));
			//  182  404:aload_0         
			//  183  405:getfield        #14  <Field MainActivity a>
			//  184  408:invokestatic    #120 <Method bv MainActivity.a(MainActivity)>
			//  185  411:aload_0         
			//  186  412:getfield        #14  <Field MainActivity a>
			//  187  415:invokestatic    #50  <Method HashMap MainActivity.h(MainActivity)>
			//  188  418:iconst_3        
			//  189  419:invokestatic    #56  <Method Integer Integer.valueOf(int)>
			//  190  422:invokevirtual   #62  <Method Object HashMap.get(Object)>
			//  191  425:checkcast       #122 <Class List>
			//  192  428:invokevirtual   #127 <Method void bv.a(List)>
				MainActivity.a(a).notifyDataSetChanged();
				return;
			//* 193  431:goto            357
			//* 194  434:goto            119
			}

			final MainActivity a;

			
			{
				a = MainActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field MainActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   55  106:aload_0         
	//   56  107:new             #33  <Class MainActivity$7>
	//   57  110:dup             
	//   58  111:aload_0         
	//   59  112:invokespecial   #142 <Method void MainActivity$7(MainActivity)>
	//   60  115:putfield        #144 <Field AdEventListener k>
		l = ((BroadcastReceiver) (new BroadcastReceiver() {

			public void onReceive(Context context, Intent intent)
			{
				a.d();
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field MainActivity a>
			//    2    4:invokevirtual   #21  <Method void MainActivity.d()>
			//    3    7:return          
			}

			final MainActivity a;

			
			{
				a = MainActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field MainActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
		}
));
	//   61  118:aload_0         
	//   62  119:new             #35  <Class MainActivity$8>
	//   63  122:dup             
	//   64  123:aload_0         
	//   65  124:invokespecial   #145 <Method void MainActivity$8(MainActivity)>
	//   66  127:putfield        #147 <Field BroadcastReceiver l>
	//   67  130:return          
	}

	static bv a(MainActivity mainactivity)
	{
		return mainactivity.p;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field bv p>
	//    2    4:areturn         
	}

	static ActionMode a(MainActivity mainactivity, ActionMode actionmode)
	{
		mainactivity.B = actionmode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #151 <Field ActionMode B>
		return actionmode;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private void a(int i1)
	{
		CharSequence acharsequence[] = new CharSequence[2];
	//    0    0:iconst_2        
	//    1    1:anewarray       CharSequence[]
	//    2    4:astore_2        
		acharsequence[0] = ((CharSequence) (getResources().getString(0x7f0d005c)));
	//    3    5:aload_2         
	//    4    6:iconst_0        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #158 <Method Resources getResources()>
	//    7   11:ldc1            #159 <Int 0x7f0d005c>
	//    8   13:invokevirtual   #165 <Method String Resources.getString(int)>
	//    9   16:aastore         
		acharsequence[1] = ((CharSequence) (getResources().getString(0x7f0d005b)));
	//   10   17:aload_2         
	//   11   18:iconst_1        
	//   12   19:aload_0         
	//   13   20:invokevirtual   #158 <Method Resources getResources()>
	//   14   23:ldc1            #166 <Int 0x7f0d005b>
	//   15   25:invokevirtual   #165 <Method String Resources.getString(int)>
	//   16   28:aastore         
		ck ck1 = p.a(i1);
	//   17   29:aload_0         
	//   18   30:getfield        #109 <Field bv p>
	//   19   33:iload_1         
	//   20   34:invokevirtual   #171 <Method ck bv.a(int)>
	//   21   37:astore_3        
		if(p == null)
	//*  22   38:aload_0         
	//*  23   39:getfield        #109 <Field bv p>
	//*  24   42:ifnonnull       46
		{
			return;
	//   25   45:return          
		} else
		{
			android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(((Context) (new ContextThemeWrapper(((Context) (this)), 0x7f0e0002))));
	//   26   46:new             #173 <Class android.app.AlertDialog$Builder>
	//   27   49:dup             
	//   28   50:new             #175 <Class ContextThemeWrapper>
	//   29   53:dup             
	//   30   54:aload_0         
	//   31   55:ldc1            #176 <Int 0x7f0e0002>
	//   32   57:invokespecial   #179 <Method void ContextThemeWrapper(Context, int)>
	//   33   60:invokespecial   #180 <Method void android.app.AlertDialog$Builder(Context)>
	//   34   63:astore          4
			builder.setTitle(((CharSequence) (p.a(i1).d())));
	//   35   65:aload           4
	//   36   67:aload_0         
	//   37   68:getfield        #109 <Field bv p>
	//   38   71:iload_1         
	//   39   72:invokevirtual   #171 <Method ck bv.a(int)>
	//   40   75:invokevirtual   #185 <Method String ck.d()>
	//   41   78:invokevirtual   #189 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   42   81:pop             
			builder.setItems(acharsequence, new android.content.DialogInterface.OnClickListener(acharsequence, ck1, i1) {

				public void onClick(DialogInterface dialoginterface, int j1)
				{
					if(((Object) (a[j1])).equals("Launch"))
				//*   0    0:aload_0         
				//*   1    1:getfield        #24  <Field CharSequence[] a>
				//*   2    4:iload_2         
				//*   3    5:aaload          
				//*   4    6:ldc1            #36  <String "Launch">
				//*   5    8:invokevirtual   #40  <Method boolean Object.equals(Object)>
				//*   6   11:ifeq            33
					{
						MainActivity.f(d).b(b, ((Context) (d)));
				//    7   14:aload_0         
				//    8   15:getfield        #22  <Field MainActivity d>
				//    9   18:invokestatic    #44  <Method cn MainActivity.f(MainActivity)>
				//   10   21:aload_0         
				//   11   22:getfield        #26  <Field ck b>
				//   12   25:aload_0         
				//   13   26:getfield        #22  <Field MainActivity d>
				//   14   29:invokevirtual   #49  <Method void cn.b(ck, Context)>
					} else
				//*  15   32:return          
					{
						if(((Object) (a[j1])).equals("View in play store"))
				//*  16   33:aload_0         
				//*  17   34:getfield        #24  <Field CharSequence[] a>
				//*  18   37:iload_2         
				//*  19   38:aaload          
				//*  20   39:ldc1            #51  <String "View in play store">
				//*  21   41:invokevirtual   #40  <Method boolean Object.equals(Object)>
				//*  22   44:ifeq            66
						{
							MainActivity.f(d).a(b, ((Context) (d)));
				//   23   47:aload_0         
				//   24   48:getfield        #22  <Field MainActivity d>
				//   25   51:invokestatic    #44  <Method cn MainActivity.f(MainActivity)>
				//   26   54:aload_0         
				//   27   55:getfield        #26  <Field ck b>
				//   28   58:aload_0         
				//   29   59:getfield        #22  <Field MainActivity d>
				//   30   62:invokevirtual   #53  <Method void cn.a(ck, Context)>
							return;
				//   31   65:return          
						}
						if(((Object) (a[j1])).equals(((Object) (d.getResources().getString(0x7f0d005c)))))
				//*  32   66:aload_0         
				//*  33   67:getfield        #24  <Field CharSequence[] a>
				//*  34   70:iload_2         
				//*  35   71:aaload          
				//*  36   72:aload_0         
				//*  37   73:getfield        #22  <Field MainActivity d>
				//*  38   76:invokevirtual   #57  <Method Resources MainActivity.getResources()>
				//*  39   79:ldc1            #58  <Int 0x7f0d005c>
				//*  40   81:invokevirtual   #64  <Method String Resources.getString(int)>
				//*  41   84:invokevirtual   #40  <Method boolean Object.equals(Object)>
				//*  42   87:ifeq            121
						{
							dialoginterface = ((DialogInterface) (new ArrayList()));
				//   43   90:new             #66  <Class ArrayList>
				//   44   93:dup             
				//   45   94:invokespecial   #67  <Method void ArrayList()>
				//   46   97:astore_1        
							((ArrayList) (dialoginterface)).add(((Object) (Integer.valueOf(c))));
				//   47   98:aload_1         
				//   48   99:aload_0         
				//   49  100:getfield        #28  <Field int c>
				//   50  103:invokestatic    #73  <Method Integer Integer.valueOf(int)>
				//   51  106:invokevirtual   #76  <Method boolean ArrayList.add(Object)>
				//   52  109:pop             
							MainActivity.a(d, 1, ((ArrayList) (dialoginterface)), true);
				//   53  110:aload_0         
				//   54  111:getfield        #22  <Field MainActivity d>
				//   55  114:iconst_1        
				//   56  115:aload_1         
				//   57  116:iconst_1        
				//   58  117:invokestatic    #79  <Method void MainActivity.a(MainActivity, int, ArrayList, boolean)>
							return;
				//   59  120:return          
						}
						if(((Object) (a[j1])).equals(((Object) (d.getResources().getString(0x7f0d005b)))))
				//*  60  121:aload_0         
				//*  61  122:getfield        #24  <Field CharSequence[] a>
				//*  62  125:iload_2         
				//*  63  126:aaload          
				//*  64  127:aload_0         
				//*  65  128:getfield        #22  <Field MainActivity d>
				//*  66  131:invokevirtual   #57  <Method Resources MainActivity.getResources()>
				//*  67  134:ldc1            #80  <Int 0x7f0d005b>
				//*  68  136:invokevirtual   #64  <Method String Resources.getString(int)>
				//*  69  139:invokevirtual   #40  <Method boolean Object.equals(Object)>
				//*  70  142:ifeq            32
						{
							MainActivity.f(d).a(((Context) (d)), MainActivity.a(d).a(c).e());
				//   71  145:aload_0         
				//   72  146:getfield        #22  <Field MainActivity d>
				//   73  149:invokestatic    #44  <Method cn MainActivity.f(MainActivity)>
				//   74  152:aload_0         
				//   75  153:getfield        #22  <Field MainActivity d>
				//   76  156:aload_0         
				//   77  157:getfield        #22  <Field MainActivity d>
				//   78  160:invokestatic    #83  <Method bv MainActivity.a(MainActivity)>
				//   79  163:aload_0         
				//   80  164:getfield        #28  <Field int c>
				//   81  167:invokevirtual   #88  <Method ck bv.a(int)>
				//   82  170:invokevirtual   #94  <Method String ck.e()>
				//   83  173:invokevirtual   #97  <Method void cn.a(Context, String)>
							return;
				//   84  176:return          
						}
					}
				}

				final CharSequence a[];
				final ck b;
				final int c;
				final MainActivity d;

			
			{
				d = MainActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field MainActivity d>
				a = acharsequence;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field CharSequence[] a>
				b = ck1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field ck b>
				c = i1;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #28  <Field int c>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//   43   82:aload           4
	//   44   84:aload_2         
	//   45   85:new             #31  <Class MainActivity$6>
	//   46   88:dup             
	//   47   89:aload_0         
	//   48   90:aload_2         
	//   49   91:aload_3         
	//   50   92:iload_1         
	//   51   93:invokespecial   #192 <Method void MainActivity$6(MainActivity, CharSequence[], ck, int)>
	//   52   96:invokevirtual   #196 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setItems(CharSequence[], android.content.DialogInterface$OnClickListener)>
	//   53   99:pop             
			builder.create().show();
	//   54  100:aload           4
	//   55  102:invokevirtual   #200 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   56  105:invokevirtual   #205 <Method void AlertDialog.show()>
			return;
	//   57  108:return          
		}
	}

	private void a(int i1, ArrayList arraylist, boolean flag)
	{
		switch(i1)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 1: default 20
	//	               1 21
		default:
			return;
	//    2   20:return          

		case 1: // '\001'
			a("android.permission.WRITE_EXTERNAL_STORAGE", new cl(arraylist, flag) {

				public void a()
				{
					Snackbar.make(((View) (MainActivity.e(c))), "Cannot Extract, Storage Permission denied.", -2).setAction("Enable", new android.view.View.OnClickListener(this) {

						public void onClick(View view)
						{
							view = ((View) (new Intent()));
						//    0    0:new             #23  <Class Intent>
						//    1    3:dup             
						//    2    4:invokespecial   #24  <Method void Intent()>
						//    3    7:astore_1        
							((Intent) (view)).setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
						//    4    8:aload_1         
						//    5    9:ldc1            #26  <String "android.settings.APPLICATION_DETAILS_SETTINGS">
						//    6   11:invokevirtual   #30  <Method Intent Intent.setAction(String)>
						//    7   14:pop             
							((Intent) (view)).setData(Uri.fromParts("package", a.c.getPackageName(), ((String) (null))));
						//    8   15:aload_1         
						//    9   16:ldc1            #32  <String "package">
						//   10   18:aload_0         
						//   11   19:getfield        #16  <Field MainActivity$5 a>
						//   12   22:getfield        #36  <Field MainActivity MainActivity$5.c>
						//   13   25:invokevirtual   #42  <Method String MainActivity.getPackageName()>
						//   14   28:aconst_null     
						//   15   29:invokestatic    #48  <Method Uri Uri.fromParts(String, String, String)>
						//   16   32:invokevirtual   #52  <Method Intent Intent.setData(Uri)>
						//   17   35:pop             
							a.c.startActivity(((Intent) (view)));
						//   18   36:aload_0         
						//   19   37:getfield        #16  <Field MainActivity$5 a>
						//   20   40:getfield        #36  <Field MainActivity MainActivity$5.c>
						//   21   43:aload_1         
						//   22   44:invokevirtual   #56  <Method void MainActivity.startActivity(Intent)>
						//   23   47:return          
						}

						final _cls5 a;

			
			{
				a = _pcls5;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MainActivity$5 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
					}
).show();
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field MainActivity c>
				//    2    4:invokestatic    #34  <Method RecyclerView MainActivity.e(MainActivity)>
				//    3    7:ldc1            #36  <String "Cannot Extract, Storage Permission denied.">
				//    4    9:bipush          -2
				//    5   11:invokestatic    #42  <Method Snackbar Snackbar.make(View, CharSequence, int)>
				//    6   14:ldc1            #44  <String "Enable">
				//    7   16:new             #13  <Class MainActivity$5$1>
				//    8   19:dup             
				//    9   20:aload_0         
				//   10   21:invokespecial   #47  <Method void MainActivity$5$1(MainActivity$5)>
				//   11   24:invokevirtual   #51  <Method Snackbar Snackbar.setAction(CharSequence, android.view.View$OnClickListener)>
				//   12   27:invokevirtual   #54  <Method void Snackbar.show()>
				//   13   30:return          
				}

				public void a(String as[])
				{
					if(cm.a())
				//*   0    0:invokestatic    #60  <Method boolean cm.a()>
				//*   1    3:ifeq            60
					{
						Snackbar.make(((View) (MainActivity.e(c))), "Storage Permission Granted.", 0).show();
				//    2    6:aload_0         
				//    3    7:getfield        #22  <Field MainActivity c>
				//    4   10:invokestatic    #34  <Method RecyclerView MainActivity.e(MainActivity)>
				//    5   13:ldc1            #62  <String "Storage Permission Granted.">
				//    6   15:iconst_0        
				//    7   16:invokestatic    #42  <Method Snackbar Snackbar.make(View, CharSequence, int)>
				//    8   19:invokevirtual   #54  <Method void Snackbar.show()>
						(((a) (c)). new a(a.size(), b)).execute(((Object []) (new ArrayList[] {
							a
						})));
				//    9   22:new             #64  <Class MainActivity$a>
				//   10   25:dup             
				//   11   26:aload_0         
				//   12   27:getfield        #22  <Field MainActivity c>
				//   13   30:aload_0         
				//   14   31:getfield        #24  <Field ArrayList a>
				//   15   34:invokevirtual   #70  <Method int ArrayList.size()>
				//   16   37:aload_0         
				//   17   38:getfield        #26  <Field boolean b>
				//   18   41:invokespecial   #73  <Method void MainActivity$a(MainActivity, int, boolean)>
				//   19   44:iconst_1        
				//   20   45:anewarray       ArrayList[]
				//   21   48:dup             
				//   22   49:iconst_0        
				//   23   50:aload_0         
				//   24   51:getfield        #24  <Field ArrayList a>
				//   25   54:aastore         
				//   26   55:invokevirtual   #77  <Method AsyncTask MainActivity$a.execute(Object[])>
				//   27   58:pop             
						return;
				//   28   59:return          
					} else
					{
						MainActivity.b(c, cm.b());
				//   29   60:aload_0         
				//   30   61:getfield        #22  <Field MainActivity c>
				//   31   64:invokestatic    #80  <Method String cm.b()>
				//   32   67:invokestatic    #83  <Method void MainActivity.b(MainActivity, String)>
						return;
				//   33   70:return          
					}
				}

				public void b(String as[])
				{
					boolean flag1 = cm.a();
				//    0    0:invokestatic    #60  <Method boolean cm.a()>
				//    1    3:istore_2        
					ci.a("MainActivity : ", (new StringBuilder()).append("executeOrder APK_EXTRACT sdcard status : ").append(flag1).toString());
				//    2    4:ldc1            #85  <String "MainActivity : ">
				//    3    6:new             #87  <Class StringBuilder>
				//    4    9:dup             
				//    5   10:invokespecial   #88  <Method void StringBuilder()>
				//    6   13:ldc1            #90  <String "executeOrder APK_EXTRACT sdcard status : ">
				//    7   15:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
				//    8   18:iload_2         
				//    9   19:invokevirtual   #97  <Method StringBuilder StringBuilder.append(boolean)>
				//   10   22:invokevirtual   #100 <Method String StringBuilder.toString()>
				//   11   25:invokestatic    #105 <Method void ci.a(String, String)>
					if(flag1)
				//*  12   28:iload_2         
				//*  13   29:ifeq            70
					{
						(((a) (c)). new a(a.size(), b)).execute(((Object []) (new ArrayList[] {
							a
						})));
				//   14   32:new             #64  <Class MainActivity$a>
				//   15   35:dup             
				//   16   36:aload_0         
				//   17   37:getfield        #22  <Field MainActivity c>
				//   18   40:aload_0         
				//   19   41:getfield        #24  <Field ArrayList a>
				//   20   44:invokevirtual   #70  <Method int ArrayList.size()>
				//   21   47:aload_0         
				//   22   48:getfield        #26  <Field boolean b>
				//   23   51:invokespecial   #73  <Method void MainActivity$a(MainActivity, int, boolean)>
				//   24   54:iconst_1        
				//   25   55:anewarray       ArrayList[]
				//   26   58:dup             
				//   27   59:iconst_0        
				//   28   60:aload_0         
				//   29   61:getfield        #24  <Field ArrayList a>
				//   30   64:aastore         
				//   31   65:invokevirtual   #77  <Method AsyncTask MainActivity$a.execute(Object[])>
				//   32   68:pop             
						return;
				//   33   69:return          
					} else
					{
						MainActivity.b(c, cm.b());
				//   34   70:aload_0         
				//   35   71:getfield        #22  <Field MainActivity c>
				//   36   74:invokestatic    #80  <Method String cm.b()>
				//   37   77:invokestatic    #83  <Method void MainActivity.b(MainActivity, String)>
						return;
				//   38   80:return          
					}
				}

				final ArrayList a;
				final boolean b;
				final MainActivity c;

			
			{
				c = MainActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field MainActivity c>
				a = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field ArrayList a>
				b = flag;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #26  <Field boolean b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #29  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    3   21:aload_0         
	//    4   22:ldc1            #208 <String "android.permission.WRITE_EXTERNAL_STORAGE">
	//    5   24:new             #27  <Class MainActivity$5>
	//    6   27:dup             
	//    7   28:aload_0         
	//    8   29:aload_2         
	//    9   30:iload_3         
	//   10   31:invokespecial   #211 <Method void MainActivity$5(MainActivity, ArrayList, boolean)>
	//   11   34:invokevirtual   #214 <Method void a(String, cl)>
			break;
		}
	//   12   37:return          
	}

	private void a(MenuItem menuitem)
	{
		r.setIconifiedByDefault(true);
	//    0    0:aload_0         
	//    1    1:getfield        #219 <Field SearchView r>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #225 <Method void SearchView.setIconifiedByDefault(boolean)>
		r.setOnQueryTextListener(h);
	//    4    8:aload_0         
	//    5    9:getfield        #219 <Field SearchView r>
	//    6   12:aload_0         
	//    7   13:getfield        #131 <Field android.support.v7.widget.SearchView$OnQueryTextListener h>
	//    8   16:invokevirtual   #229 <Method void SearchView.setOnQueryTextListener(android.support.v7.widget.SearchView$OnQueryTextListener)>
		MenuItemCompat.setOnActionExpandListener(menuitem, g);
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #128 <Field android.support.v4.view.MenuItemCompat$OnActionExpandListener g>
	//   12   24:invokestatic    #235 <Method MenuItem MenuItemCompat.setOnActionExpandListener(MenuItem, android.support.v4.view.MenuItemCompat$OnActionExpandListener)>
	//   13   27:pop             
	//   14   28:return          
	}

	static void a(MainActivity mainactivity, int i1, ArrayList arraylist, boolean flag)
	{
		mainactivity.a(i1, arraylist, flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #238 <Method void a(int, ArrayList, boolean)>
	//    5    7:return          
	}

	static void a(MainActivity mainactivity, String s1)
	{
		mainactivity.d(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #242 <Method void d(String)>
	//    3    5:return          
	}

	static List b(MainActivity mainactivity)
	{
		return mainactivity.s;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field List s>
	//    2    4:areturn         
	}

	static void b(MainActivity mainactivity, String s1)
	{
		mainactivity.e(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #246 <Method void e(String)>
	//    3    5:return          
	}

	static SearchView c(MainActivity mainactivity)
	{
		return mainactivity.r;
	//    0    0:aload_0         
	//    1    1:getfield        #219 <Field SearchView r>
	//    2    4:areturn         
	}

	static ActionMode d(MainActivity mainactivity)
	{
		return mainactivity.B;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field ActionMode B>
	//    2    4:areturn         
	}

	private void d(String s1)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		this;
	//    2    2:aload_0         
		JVM INSTR monitorenter ;
	//    3    3:monitorenter    
		ArrayList arraylist;
		String s2;
		arraylist = new ArrayList();
	//    4    4:new             #116 <Class ArrayList>
	//    5    7:dup             
	//    6    8:invokespecial   #117 <Method void ArrayList()>
	//    7   11:astore          4
		s2 = s1.toLowerCase(Locale.US).trim();
	//    8   13:aload_1         
	//    9   14:getstatic       #254 <Field Locale Locale.US>
	//   10   17:invokevirtual   #260 <Method String String.toLowerCase(Locale)>
	//   11   20:invokevirtual   #263 <Method String String.trim()>
	//   12   23:astore          5
		ci.a("MainActivity : ", (new StringBuilder()).append("Search text  :").append(s1).append(" ").append(r.isIconified()).toString());
	//   13   25:ldc1            #103 <String "MainActivity : ">
	//   14   27:new             #265 <Class StringBuilder>
	//   15   30:dup             
	//   16   31:invokespecial   #266 <Method void StringBuilder()>
	//   17   34:ldc2            #268 <String "Search text  :">
	//   18   37:invokevirtual   #272 <Method StringBuilder StringBuilder.append(String)>
	//   19   40:aload_1         
	//   20   41:invokevirtual   #272 <Method StringBuilder StringBuilder.append(String)>
	//   21   44:ldc2            #274 <String " ">
	//   22   47:invokevirtual   #272 <Method StringBuilder StringBuilder.append(String)>
	//   23   50:aload_0         
	//   24   51:getfield        #219 <Field SearchView r>
	//   25   54:invokevirtual   #278 <Method boolean SearchView.isIconified()>
	//   26   57:invokevirtual   #281 <Method StringBuilder StringBuilder.append(boolean)>
	//   27   60:invokevirtual   #284 <Method String StringBuilder.toString()>
	//   28   63:invokestatic    #289 <Method void ci.a(String, String)>
		if(s2.trim().length() != 0 || w == null) goto _L2; else goto _L1
	//   29   66:aload           5
	//   30   68:invokevirtual   #263 <Method String String.trim()>
	//   31   71:invokevirtual   #293 <Method int String.length()>
	//   32   74:ifne            258
	//   33   77:aload_0         
	//   34   78:getfield        #295 <Field HashMap w>
	//   35   81:ifnull          258
_L1:
		if(!A.b(cj.e, true) || w.get(((Object) (Integer.valueOf(1)))) == null) goto _L4; else goto _L3
	//   36   84:aload_0         
	//   37   85:getfield        #297 <Field cj A>
	//   38   88:getstatic       #301 <Field String cj.e>
	//   39   91:iconst_1        
	//   40   92:invokevirtual   #304 <Method boolean cj.b(String, boolean)>
	//   41   95:ifeq            216
	//   42   98:aload_0         
	//   43   99:getfield        #295 <Field HashMap w>
	//   44  102:iconst_1        
	//   45  103:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//   46  106:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//   47  109:ifnull          216
_L3:
		s1 = ((String) ((List)w.get(((Object) (Integer.valueOf(1))))));
	//   48  112:aload_0         
	//   49  113:getfield        #295 <Field HashMap w>
	//   50  116:iconst_1        
	//   51  117:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//   52  120:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//   53  123:checkcast       #318 <Class List>
	//   54  126:astore_1        
_L9:
		if(p == null || s1 == null) goto _L6; else goto _L5
	//   55  127:aload_0         
	//   56  128:getfield        #109 <Field bv p>
	//   57  131:ifnull          213
	//   58  134:aload_1         
	//   59  135:ifnull          213
_L5:
		ci.a("MainActivity : ", (new StringBuilder()).append("search text match count :").append(((List) (s1)).size()).toString());
	//   60  138:ldc1            #103 <String "MainActivity : ">
	//   61  140:new             #265 <Class StringBuilder>
	//   62  143:dup             
	//   63  144:invokespecial   #266 <Method void StringBuilder()>
	//   64  147:ldc2            #320 <String "search text match count :">
	//   65  150:invokevirtual   #272 <Method StringBuilder StringBuilder.append(String)>
	//   66  153:aload_1         
	//   67  154:invokeinterface #323 <Method int List.size()>
	//   68  159:invokevirtual   #326 <Method StringBuilder StringBuilder.append(int)>
	//   69  162:invokevirtual   #284 <Method String StringBuilder.toString()>
	//   70  165:invokestatic    #289 <Method void ci.a(String, String)>
		p.a(((List) (s1)));
	//   71  168:aload_0         
	//   72  169:getfield        #109 <Field bv p>
	//   73  172:aload_1         
	//   74  173:invokevirtual   #329 <Method void bv.a(List)>
		p.notifyDataSetChanged();
	//   75  176:aload_0         
	//   76  177:getfield        #109 <Field bv p>
	//   77  180:invokevirtual   #332 <Method void bv.notifyDataSetChanged()>
		if(((List) (s1)).size() != 0) goto _L8; else goto _L7
	//   78  183:aload_1         
	//   79  184:invokeinterface #323 <Method int List.size()>
	//   80  189:ifne            486
_L7:
		q.setVisibility(8);
	//   81  192:aload_0         
	//   82  193:getfield        #334 <Field RecyclerView q>
	//   83  196:bipush          8
	//   84  198:invokevirtual   #339 <Method void RecyclerView.setVisibility(int)>
		x.setVisibility(0);
	//   85  201:aload_0         
	//   86  202:getfield        #125 <Field TextView x>
	//   87  205:iconst_0        
	//   88  206:invokevirtual   #342 <Method void TextView.setVisibility(int)>
_L17:
		e();
	//   89  209:aload_0         
	//   90  210:invokespecial   #344 <Method void e()>
_L6:
		this;
	//   91  213:aload_0         
		JVM INSTR monitorexit ;
	//   92  214:monitorexit     
		return;
	//   93  215:return          
_L4:
label0:
		{
			if(!d)
				break label0;
	//   94  216:getstatic       #346 <Field boolean d>
	//   95  219:ifeq            240
			s1 = ((String) ((List)w.get(((Object) (Integer.valueOf(2))))));
	//   96  222:aload_0         
	//   97  223:getfield        #295 <Field HashMap w>
	//   98  226:iconst_2        
	//   99  227:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//  100  230:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//  101  233:checkcast       #318 <Class List>
	//  102  236:astore_1        
		}
		  goto _L9
	//* 103  237:goto            127
		s1 = ((String) ((List)w.get(((Object) (Integer.valueOf(3))))));
	//  104  240:aload_0         
	//  105  241:getfield        #295 <Field HashMap w>
	//  106  244:iconst_3        
	//  107  245:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//  108  248:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//  109  251:checkcast       #318 <Class List>
	//  110  254:astore_1        
		  goto _L9
	//* 111  255:goto            127
_L2:
		if(!A.b(cj.e, true) || w == null || w.get(((Object) (Integer.valueOf(1)))) == null) goto _L11; else goto _L10
	//  112  258:aload_0         
	//  113  259:getfield        #297 <Field cj A>
	//  114  262:getstatic       #301 <Field String cj.e>
	//  115  265:iconst_1        
	//  116  266:invokevirtual   #304 <Method boolean cj.b(String, boolean)>
	//  117  269:ifeq            383
	//  118  272:aload_0         
	//  119  273:getfield        #295 <Field HashMap w>
	//  120  276:ifnull          383
	//  121  279:aload_0         
	//  122  280:getfield        #295 <Field HashMap w>
	//  123  283:iconst_1        
	//  124  284:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//  125  287:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//  126  290:ifnull          383
_L10:
		s = (List)w.get(((Object) (Integer.valueOf(1))));
	//  127  293:aload_0         
	//  128  294:aload_0         
	//  129  295:getfield        #295 <Field HashMap w>
	//  130  298:iconst_1        
	//  131  299:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//  132  302:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//  133  305:checkcast       #318 <Class List>
	//  134  308:putfield        #119 <Field List s>
		int i1 = ((int) (flag));
	//  135  311:iload_3         
	//  136  312:istore_2        
_L14:
		if(i1 >= s.size()) goto _L13; else goto _L12
	//  137  313:iload_2         
	//  138  314:aload_0         
	//  139  315:getfield        #119 <Field List s>
	//  140  318:invokeinterface #323 <Method int List.size()>
	//  141  323:icmpge          506
_L12:
		s1 = ((ck)s.get(i1)).d();
	//  142  326:aload_0         
	//  143  327:getfield        #119 <Field List s>
	//  144  330:iload_2         
	//  145  331:invokeinterface #349 <Method Object List.get(int)>
	//  146  336:checkcast       #182 <Class ck>
	//  147  339:invokevirtual   #185 <Method String ck.d()>
	//  148  342:astore_1        
		if(s1 == null)
			break MISSING_BLOCK_LABEL_512;
	//  149  343:aload_1         
	//  150  344:ifnull          512
		if(s1.toLowerCase(Locale.getDefault()).startsWith(s2))
	//* 151  347:aload_1         
	//* 152  348:invokestatic    #353 <Method Locale Locale.getDefault()>
	//* 153  351:invokevirtual   #260 <Method String String.toLowerCase(Locale)>
	//* 154  354:aload           5
	//* 155  356:invokevirtual   #357 <Method boolean String.startsWith(String)>
	//* 156  359:ifeq            512
			((List) (arraylist)).add(s.get(i1));
	//  157  362:aload           4
	//  158  364:aload_0         
	//  159  365:getfield        #119 <Field List s>
	//  160  368:iload_2         
	//  161  369:invokeinterface #349 <Method Object List.get(int)>
	//  162  374:invokeinterface #361 <Method boolean List.add(Object)>
	//  163  379:pop             
		break MISSING_BLOCK_LABEL_512;
	//  164  380:goto            512
_L11:
		if(!d || w == null || w.get(((Object) (Integer.valueOf(2)))) == null)
			break MISSING_BLOCK_LABEL_438;
	//  165  383:getstatic       #346 <Field boolean d>
	//  166  386:ifeq            438
	//  167  389:aload_0         
	//  168  390:getfield        #295 <Field HashMap w>
	//  169  393:ifnull          438
	//  170  396:aload_0         
	//  171  397:getfield        #295 <Field HashMap w>
	//  172  400:iconst_2        
	//  173  401:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//  174  404:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//  175  407:ifnull          438
		s = (List)w.get(((Object) (Integer.valueOf(2))));
	//  176  410:aload_0         
	//  177  411:aload_0         
	//  178  412:getfield        #295 <Field HashMap w>
	//  179  415:iconst_2        
	//  180  416:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//  181  419:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//  182  422:checkcast       #318 <Class List>
	//  183  425:putfield        #119 <Field List s>
		i1 = ((int) (flag));
	//  184  428:iload_3         
	//  185  429:istore_2        
		  goto _L14
	//* 186  430:goto            313
		s1;
	//  187  433:astore_1        
	//* 188  434:aload_0         
		throw s1;
	//  189  435:monitorexit     
	//  190  436:aload_1         
	//  191  437:athrow          
		i1 = ((int) (flag));
	//  192  438:iload_3         
	//  193  439:istore_2        
		if(w == null) goto _L14; else goto _L15
	//  194  440:aload_0         
	//  195  441:getfield        #295 <Field HashMap w>
	//  196  444:ifnull          313
_L15:
		i1 = ((int) (flag));
	//  197  447:iload_3         
	//  198  448:istore_2        
		if(w.get(((Object) (Integer.valueOf(3)))) == null) goto _L14; else goto _L16
	//  199  449:aload_0         
	//  200  450:getfield        #295 <Field HashMap w>
	//  201  453:iconst_3        
	//  202  454:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//  203  457:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//  204  460:ifnull          313
_L16:
		s = (List)w.get(((Object) (Integer.valueOf(3))));
	//  205  463:aload_0         
	//  206  464:aload_0         
	//  207  465:getfield        #295 <Field HashMap w>
	//  208  468:iconst_3        
	//  209  469:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//  210  472:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//  211  475:checkcast       #318 <Class List>
	//  212  478:putfield        #119 <Field List s>
		i1 = ((int) (flag));
	//  213  481:iload_3         
	//  214  482:istore_2        
		  goto _L14
	//* 215  483:goto            313
_L8:
		q.setVisibility(0);
	//  216  486:aload_0         
	//  217  487:getfield        #334 <Field RecyclerView q>
	//  218  490:iconst_0        
	//  219  491:invokevirtual   #339 <Method void RecyclerView.setVisibility(int)>
		x.setVisibility(8);
	//  220  494:aload_0         
	//  221  495:getfield        #125 <Field TextView x>
	//  222  498:bipush          8
	//  223  500:invokevirtual   #342 <Method void TextView.setVisibility(int)>
		  goto _L17
	//* 224  503:goto            209
_L13:
		s1 = ((String) (arraylist));
	//  225  506:aload           4
	//  226  508:astore_1        
		  goto _L9
	//* 227  509:goto            127
		i1++;
	//  228  512:iload_2         
	//  229  513:iconst_1        
	//  230  514:iadd            
	//  231  515:istore_2        
		  goto _L14
	//* 232  516:goto            313
	}

	static RecyclerView e(MainActivity mainactivity)
	{
		return mainactivity.q;
	//    0    0:aload_0         
	//    1    1:getfield        #334 <Field RecyclerView q>
	//    2    4:areturn         
	}

	private void e()
	{
		int i1 = getResources().getDimensionPixelSize(0x7f07007a);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #158 <Method Resources getResources()>
	//    2    4:ldc2            #363 <Int 0x7f07007a>
	//    3    7:invokevirtual   #367 <Method int Resources.getDimensionPixelSize(int)>
	//    4   10:istore_1        
		int j1 = q.getAdapter().getItemCount();
	//    5   11:aload_0         
	//    6   12:getfield        #334 <Field RecyclerView q>
	//    7   15:invokevirtual   #371 <Method android.support.v7.widget.RecyclerView$Adapter RecyclerView.getAdapter()>
	//    8   18:invokevirtual   #376 <Method int android.support.v7.widget.RecyclerView$Adapter.getItemCount()>
	//    9   21:istore_2        
		DisplayMetrics displaymetrics = new DisplayMetrics();
	//   10   22:new             #378 <Class DisplayMetrics>
	//   11   25:dup             
	//   12   26:invokespecial   #379 <Method void DisplayMetrics()>
	//   13   29:astore          5
		getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
	//   14   31:aload_0         
	//   15   32:invokevirtual   #383 <Method WindowManager getWindowManager()>
	//   16   35:invokeinterface #389 <Method Display WindowManager.getDefaultDisplay()>
	//   17   40:aload           5
	//   18   42:invokevirtual   #395 <Method void Display.getMetrics(DisplayMetrics)>
		int k1 = displaymetrics.heightPixels;
	//   19   45:aload           5
	//   20   47:getfield        #398 <Field int DisplayMetrics.heightPixels>
	//   21   50:istore_3        
		int l1 = displaymetrics.widthPixels;
	//   22   51:aload           5
	//   23   53:getfield        #401 <Field int DisplayMetrics.widthPixels>
	//   24   56:istore          4
		if(i1 * j1 > k1)
	//*  25   58:iload_1         
	//*  26   59:iload_2         
	//*  27   60:imul            
	//*  28   61:iload_3         
	//*  29   62:icmple          71
		{
			a(true);
	//   30   65:aload_0         
	//   31   66:iconst_1        
	//   32   67:invokevirtual   #403 <Method void a(boolean)>
			return;
	//   33   70:return          
		} else
		{
			a(false);
	//   34   71:aload_0         
	//   35   72:iconst_0        
	//   36   73:invokevirtual   #403 <Method void a(boolean)>
			return;
	//   37   76:return          
		}
	}

	private void e(String s1)
	{
		ci.a("MainActivity : ", (new StringBuilder()).append("Toast Message : ").append(s1).toString());
	//    0    0:ldc1            #103 <String "MainActivity : ">
	//    1    2:new             #265 <Class StringBuilder>
	//    2    5:dup             
	//    3    6:invokespecial   #266 <Method void StringBuilder()>
	//    4    9:ldc2            #405 <String "Toast Message : ">
	//    5   12:invokevirtual   #272 <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_1         
	//    7   16:invokevirtual   #272 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #284 <Method String StringBuilder.toString()>
	//    9   22:invokestatic    #289 <Method void ci.a(String, String)>
		Toast.makeText(((Context) (this)), ((CharSequence) ((new StringBuilder()).append("").append(s1).toString())), 0).show();
	//   10   25:aload_0         
	//   11   26:new             #265 <Class StringBuilder>
	//   12   29:dup             
	//   13   30:invokespecial   #266 <Method void StringBuilder()>
	//   14   33:ldc2            #407 <String "">
	//   15   36:invokevirtual   #272 <Method StringBuilder StringBuilder.append(String)>
	//   16   39:aload_1         
	//   17   40:invokevirtual   #272 <Method StringBuilder StringBuilder.append(String)>
	//   18   43:invokevirtual   #284 <Method String StringBuilder.toString()>
	//   19   46:iconst_0        
	//   20   47:invokestatic    #413 <Method Toast Toast.makeText(Context, CharSequence, int)>
	//   21   50:invokevirtual   #414 <Method void Toast.show()>
	//   22   53:return          
	}

	static cn f(MainActivity mainactivity)
	{
		return mainactivity.v;
	//    0    0:aload_0         
	//    1    1:getfield        #417 <Field cn v>
	//    2    4:areturn         
	}

	private void f(String s1)
	{
		try
		{
			startActivity(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("market://details?id=").append(s1).toString())));
	//    0    0:aload_0         
	//    1    1:new             #421 <Class Intent>
	//    2    4:dup             
	//    3    5:ldc2            #423 <String "android.intent.action.VIEW">
	//    4    8:new             #265 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #266 <Method void StringBuilder()>
	//    7   15:ldc2            #425 <String "market://details?id=">
	//    8   18:invokevirtual   #272 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #272 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:invokevirtual   #284 <Method String StringBuilder.toString()>
	//   12   28:invokestatic    #431 <Method Uri Uri.parse(String)>
	//   13   31:invokespecial   #434 <Method void Intent(String, Uri)>
	//   14   34:invokevirtual   #438 <Method void startActivity(Intent)>
			return;
	//   15   37:return          
		}
		catch(ActivityNotFoundException activitynotfoundexception)
	//*  16   38:astore_2        
		{
			startActivity(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("https://play.google.com/store/apps/details?id=").append(s1).toString())));
	//   17   39:aload_0         
	//   18   40:new             #421 <Class Intent>
	//   19   43:dup             
	//   20   44:ldc2            #423 <String "android.intent.action.VIEW">
	//   21   47:new             #265 <Class StringBuilder>
	//   22   50:dup             
	//   23   51:invokespecial   #266 <Method void StringBuilder()>
	//   24   54:ldc2            #440 <String "https://play.google.com/store/apps/details?id=">
	//   25   57:invokevirtual   #272 <Method StringBuilder StringBuilder.append(String)>
	//   26   60:aload_1         
	//   27   61:invokevirtual   #272 <Method StringBuilder StringBuilder.append(String)>
	//   28   64:invokevirtual   #284 <Method String StringBuilder.toString()>
	//   29   67:invokestatic    #431 <Method Uri Uri.parse(String)>
	//   30   70:invokespecial   #434 <Method void Intent(String, Uri)>
	//   31   73:invokevirtual   #438 <Method void startActivity(Intent)>
		}
	//   32   76:return          
	}

	static ProgressDialog g(MainActivity mainactivity)
	{
		return mainactivity.t;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field ProgressDialog t>
	//    2    4:areturn         
	}

	static HashMap h(MainActivity mainactivity)
	{
		return mainactivity.w;
	//    0    0:aload_0         
	//    1    1:getfield        #295 <Field HashMap w>
	//    2    4:areturn         
	}

	static cj i(MainActivity mainactivity)
	{
		return mainactivity.A;
	//    0    0:aload_0         
	//    1    1:getfield        #297 <Field cj A>
	//    2    4:areturn         
	}

	public void a(View view, int i1)
	{
		if(i1 < 0 || i1 > p.getItemCount() - 1)
	//*   0    0:iload_2         
	//*   1    1:iflt            17
	//*   2    4:iload_2         
	//*   3    5:aload_0         
	//*   4    6:getfield        #109 <Field bv p>
	//*   5    9:invokevirtual   #445 <Method int bv.getItemCount()>
	//*   6   12:iconst_1        
	//*   7   13:isub            
	//*   8   14:icmple          43
		{
			ci.a("MainActivity : ", (new StringBuilder()).append("onAdapterItemClick ,Invalid position : ").append(i1).toString());
	//    9   17:ldc1            #103 <String "MainActivity : ">
	//   10   19:new             #265 <Class StringBuilder>
	//   11   22:dup             
	//   12   23:invokespecial   #266 <Method void StringBuilder()>
	//   13   26:ldc2            #447 <String "onAdapterItemClick ,Invalid position : ">
	//   14   29:invokevirtual   #272 <Method StringBuilder StringBuilder.append(String)>
	//   15   32:iload_2         
	//   16   33:invokevirtual   #326 <Method StringBuilder StringBuilder.append(int)>
	//   17   36:invokevirtual   #284 <Method String StringBuilder.toString()>
	//   18   39:invokestatic    #289 <Method void ci.a(String, String)>
			return;
	//   19   42:return          
		} else
		{
			a(i1);
	//   20   43:aload_0         
	//   21   44:iload_2         
	//   22   45:invokespecial   #449 <Method void a(int)>
			return;
	//   23   48:return          
		}
	}

	public void a(String s1, int i1)
	{
		if(t != null && t.isShowing())
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field ProgressDialog t>
	//*   2    4:ifnull          26
	//*   3    7:aload_0         
	//*   4    8:getfield        #121 <Field ProgressDialog t>
	//*   5   11:invokevirtual   #455 <Method boolean ProgressDialog.isShowing()>
	//*   6   14:ifeq            26
		{
			ci.a("MainActivity : ", "progress bar displayed already");
	//    7   17:ldc1            #103 <String "MainActivity : ">
	//    8   19:ldc2            #457 <String "progress bar displayed already">
	//    9   22:invokestatic    #289 <Method void ci.a(String, String)>
			return;
	//   10   25:return          
		}
		if(isFinishing())
	//*  11   26:aload_0         
	//*  12   27:invokevirtual   #460 <Method boolean isFinishing()>
	//*  13   30:ifeq            42
		{
			ci.a("MainActivity : ", "Activity is finishing,not displaying Progress Dialog");
	//   14   33:ldc1            #103 <String "MainActivity : ">
	//   15   35:ldc2            #462 <String "Activity is finishing,not displaying Progress Dialog">
	//   16   38:invokestatic    #289 <Method void ci.a(String, String)>
			return;
	//   17   41:return          
		} else
		{
			t = new ProgressDialog(((Context) (this)));
	//   18   42:aload_0         
	//   19   43:new             #452 <Class ProgressDialog>
	//   20   46:dup             
	//   21   47:aload_0         
	//   22   48:invokespecial   #463 <Method void ProgressDialog(Context)>
	//   23   51:putfield        #121 <Field ProgressDialog t>
			t.setMessage(((CharSequence) (s1)));
	//   24   54:aload_0         
	//   25   55:getfield        #121 <Field ProgressDialog t>
	//   26   58:aload_1         
	//   27   59:invokevirtual   #467 <Method void ProgressDialog.setMessage(CharSequence)>
			t.setProgressStyle(i1);
	//   28   62:aload_0         
	//   29   63:getfield        #121 <Field ProgressDialog t>
	//   30   66:iload_2         
	//   31   67:invokevirtual   #470 <Method void ProgressDialog.setProgressStyle(int)>
			t.setCancelable(false);
	//   32   70:aload_0         
	//   33   71:getfield        #121 <Field ProgressDialog t>
	//   34   74:iconst_0        
	//   35   75:invokevirtual   #473 <Method void ProgressDialog.setCancelable(boolean)>
			t.show();
	//   36   78:aload_0         
	//   37   79:getfield        #121 <Field ProgressDialog t>
	//   38   82:invokevirtual   #474 <Method void ProgressDialog.show()>
			ci.a("MainActivity : ", "displaying progress bar");
	//   39   85:ldc1            #103 <String "MainActivity : ">
	//   40   87:ldc2            #476 <String "displaying progress bar">
	//   41   90:invokestatic    #289 <Method void ci.a(String, String)>
			return;
	//   42   93:return          
		}
	}

	public void a(boolean flag)
	{
		android.support.design.widget.AppBarLayout.LayoutParams layoutparams = (android.support.design.widget.AppBarLayout.LayoutParams)y.getLayoutParams();
	//    0    0:aload_0         
	//    1    1:getfield        #478 <Field Toolbar y>
	//    2    4:invokevirtual   #484 <Method android.view.ViewGroup$LayoutParams Toolbar.getLayoutParams()>
	//    3    7:checkcast       #486 <Class android.support.design.widget.AppBarLayout$LayoutParams>
	//    4   10:astore_2        
		if(flag)
	//*   5   11:iload_1         
	//*   6   12:ifeq            21
		{
			layoutparams.setScrollFlags(5);
	//    7   15:aload_2         
	//    8   16:iconst_5        
	//    9   17:invokevirtual   #489 <Method void android.support.design.widget.AppBarLayout$LayoutParams.setScrollFlags(int)>
			return;
	//   10   20:return          
		} else
		{
			layoutparams.setScrollFlags(0);
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #489 <Method void android.support.design.widget.AppBarLayout$LayoutParams.setScrollFlags(int)>
			return;
	//   14   26:return          
		}
	}

	public void b(View view, int i1)
	{
		while(i1 == -1 || B != null) 
	//*   0    0:iload_2         
	//*   1    1:iconst_m1       
	//*   2    2:icmpne          6
			return;
	//    3    5:return          
	//    4    6:aload_0         
	//    5    7:getfield        #151 <Field ActionMode B>
	//    6   10:ifnonnull       5
		p.b(2);
	//    7   13:aload_0         
	//    8   14:getfield        #109 <Field bv p>
	//    9   17:iconst_2        
	//   10   18:invokevirtual   #491 <Method void bv.b(int)>
		B = startSupportActionMode(i);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #134 <Field android.support.v7.view.ActionMode$Callback i>
	//   15   27:invokevirtual   #495 <Method ActionMode startSupportActionMode(android.support.v7.view.ActionMode$Callback)>
	//   16   30:putfield        #151 <Field ActionMode B>
		p.a(Integer.valueOf(i1));
	//   17   33:aload_0         
	//   18   34:getfield        #109 <Field bv p>
	//   19   37:iload_2         
	//   20   38:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//   21   41:invokevirtual   #498 <Method boolean bv.a(Integer)>
	//   22   44:pop             
		B.invalidate();
	//   23   45:aload_0         
	//   24   46:getfield        #151 <Field ActionMode B>
	//   25   49:invokevirtual   #503 <Method void ActionMode.invalidate()>
	//   26   52:return          
	}

	public void c()
	{
		if(t != null && t.isShowing())
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field ProgressDialog t>
	//*   2    4:ifnull          37
	//*   3    7:aload_0         
	//*   4    8:getfield        #121 <Field ProgressDialog t>
	//*   5   11:invokevirtual   #455 <Method boolean ProgressDialog.isShowing()>
	//*   6   14:ifeq            37
		{
			t.dismiss();
	//    7   17:aload_0         
	//    8   18:getfield        #121 <Field ProgressDialog t>
	//    9   21:invokevirtual   #506 <Method void ProgressDialog.dismiss()>
			t = null;
	//   10   24:aload_0         
	//   11   25:aconst_null     
	//   12   26:putfield        #121 <Field ProgressDialog t>
			ci.a("MainActivity : ", " dismissProgressbar");
	//   13   29:ldc1            #103 <String "MainActivity : ">
	//   14   31:ldc2            #508 <String " dismissProgressbar">
	//   15   34:invokestatic    #289 <Method void ci.a(String, String)>
		}
	//   16   37:return          
	}

	public void d()
	{
		if(!b()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokevirtual   #510 <Method boolean b()>
	//    2    4:ifeq            269
_L1:
		if(u != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #123 <Field StartAppAd u>
	//*   5   11:ifnull          21
			u.close();
	//    6   14:aload_0         
	//    7   15:getfield        #123 <Field StartAppAd u>
	//    8   18:invokevirtual   #515 <Method void StartAppAd.close()>
		u = null;
	//    9   21:aload_0         
	//   10   22:aconst_null     
	//   11   23:putfield        #123 <Field StartAppAd u>
		if(w != null) goto _L4; else goto _L3
	//   12   26:aload_0         
	//   13   27:getfield        #295 <Field HashMap w>
	//   14   30:ifnonnull       34
_L3:
		return;
	//   15   33:return          
_L4:
		ArrayList arraylist = (ArrayList)w.get(((Object) (Integer.valueOf(1))));
	//   16   34:aload_0         
	//   17   35:getfield        #295 <Field HashMap w>
	//   18   38:iconst_1        
	//   19   39:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//   20   42:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//   21   45:checkcast       #116 <Class ArrayList>
	//   22   48:astore_1        
		if(arraylist != null && arraylist.size() > 0 && ((ck)arraylist.get(0)).b())
	//*  23   49:aload_1         
	//*  24   50:ifnull          80
	//*  25   53:aload_1         
	//*  26   54:invokevirtual   #516 <Method int ArrayList.size()>
	//*  27   57:ifle            80
	//*  28   60:aload_1         
	//*  29   61:iconst_0        
	//*  30   62:invokevirtual   #517 <Method Object ArrayList.get(int)>
	//*  31   65:checkcast       #182 <Class ck>
	//*  32   68:invokevirtual   #518 <Method boolean ck.b()>
	//*  33   71:ifeq            80
			arraylist.remove(0);
	//   34   74:aload_1         
	//   35   75:iconst_0        
	//   36   76:invokevirtual   #521 <Method Object ArrayList.remove(int)>
	//   37   79:pop             
		arraylist = (ArrayList)w.get(((Object) (Integer.valueOf(2))));
	//   38   80:aload_0         
	//   39   81:getfield        #295 <Field HashMap w>
	//   40   84:iconst_2        
	//   41   85:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//   42   88:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//   43   91:checkcast       #116 <Class ArrayList>
	//   44   94:astore_1        
		if(arraylist != null && arraylist.size() > 0 && ((ck)arraylist.get(0)).b())
	//*  45   95:aload_1         
	//*  46   96:ifnull          126
	//*  47   99:aload_1         
	//*  48  100:invokevirtual   #516 <Method int ArrayList.size()>
	//*  49  103:ifle            126
	//*  50  106:aload_1         
	//*  51  107:iconst_0        
	//*  52  108:invokevirtual   #517 <Method Object ArrayList.get(int)>
	//*  53  111:checkcast       #182 <Class ck>
	//*  54  114:invokevirtual   #518 <Method boolean ck.b()>
	//*  55  117:ifeq            126
			arraylist.remove(0);
	//   56  120:aload_1         
	//   57  121:iconst_0        
	//   58  122:invokevirtual   #521 <Method Object ArrayList.remove(int)>
	//   59  125:pop             
		arraylist = (ArrayList)w.get(((Object) (Integer.valueOf(3))));
	//   60  126:aload_0         
	//   61  127:getfield        #295 <Field HashMap w>
	//   62  130:iconst_3        
	//   63  131:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//   64  134:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//   65  137:checkcast       #116 <Class ArrayList>
	//   66  140:astore_1        
		if(arraylist != null && arraylist.size() > 0 && ((ck)arraylist.get(0)).b())
	//*  67  141:aload_1         
	//*  68  142:ifnull          172
	//*  69  145:aload_1         
	//*  70  146:invokevirtual   #516 <Method int ArrayList.size()>
	//*  71  149:ifle            172
	//*  72  152:aload_1         
	//*  73  153:iconst_0        
	//*  74  154:invokevirtual   #517 <Method Object ArrayList.get(int)>
	//*  75  157:checkcast       #182 <Class ck>
	//*  76  160:invokevirtual   #518 <Method boolean ck.b()>
	//*  77  163:ifeq            172
			arraylist.remove(0);
	//   78  166:aload_1         
	//   79  167:iconst_0        
	//   80  168:invokevirtual   #521 <Method Object ArrayList.remove(int)>
	//   81  171:pop             
		if(A.b(cj.e, true))
	//*  82  172:aload_0         
	//*  83  173:getfield        #297 <Field cj A>
	//*  84  176:getstatic       #301 <Field String cj.e>
	//*  85  179:iconst_1        
	//*  86  180:invokevirtual   #304 <Method boolean cj.b(String, boolean)>
	//*  87  183:ifeq            215
			p.a((List)w.get(((Object) (Integer.valueOf(1)))));
	//   88  186:aload_0         
	//   89  187:getfield        #109 <Field bv p>
	//   90  190:aload_0         
	//   91  191:getfield        #295 <Field HashMap w>
	//   92  194:iconst_1        
	//   93  195:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//   94  198:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//   95  201:checkcast       #318 <Class List>
	//   96  204:invokevirtual   #329 <Method void bv.a(List)>
		else
	//*  97  207:aload_0         
	//*  98  208:getfield        #109 <Field bv p>
	//*  99  211:invokevirtual   #332 <Method void bv.notifyDataSetChanged()>
	//* 100  214:return          
		if(d)
	//* 101  215:getstatic       #346 <Field boolean d>
	//* 102  218:ifeq            245
			p.a((List)w.get(((Object) (Integer.valueOf(2)))));
	//  103  221:aload_0         
	//  104  222:getfield        #109 <Field bv p>
	//  105  225:aload_0         
	//  106  226:getfield        #295 <Field HashMap w>
	//  107  229:iconst_2        
	//  108  230:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//  109  233:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//  110  236:checkcast       #318 <Class List>
	//  111  239:invokevirtual   #329 <Method void bv.a(List)>
		else
	//* 112  242:goto            207
			p.a((List)w.get(((Object) (Integer.valueOf(3)))));
	//  113  245:aload_0         
	//  114  246:getfield        #109 <Field bv p>
	//  115  249:aload_0         
	//  116  250:getfield        #295 <Field HashMap w>
	//  117  253:iconst_3        
	//  118  254:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//  119  257:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//  120  260:checkcast       #318 <Class List>
	//  121  263:invokevirtual   #329 <Method void bv.a(List)>
		p.notifyDataSetChanged();
		return;
	//* 122  266:goto            207
_L2:
		if(u == null)
	//* 123  269:aload_0         
	//* 124  270:getfield        #123 <Field StartAppAd u>
	//* 125  273:ifnonnull       33
		{
			u = new StartAppAd(((Context) (this)));
	//  126  276:aload_0         
	//  127  277:new             #512 <Class StartAppAd>
	//  128  280:dup             
	//  129  281:aload_0         
	//  130  282:invokespecial   #522 <Method void StartAppAd(Context)>
	//  131  285:putfield        #123 <Field StartAppAd u>
			return;
	//  132  288:return          
		}
		if(true) goto _L3; else goto _L5
_L5:
	}

	protected void onActivityResult(int i1, int j1, Intent intent)
	{
		super.onActivityResult(i1, j1, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #526 <Method void BillingActivity.onActivityResult(int, int, Intent)>
		if(j1 == 9 && w != null)
	//*   5    7:iload_2         
	//*   6    8:bipush          9
	//*   7   10:icmpne          108
	//*   8   13:aload_0         
	//*   9   14:getfield        #295 <Field HashMap w>
	//*  10   17:ifnull          108
		{
			d = false;
	//   11   20:iconst_0        
	//   12   21:putstatic       #346 <Field boolean d>
			if(A.b(cj.e, true))
	//*  13   24:aload_0         
	//*  14   25:getfield        #297 <Field cj A>
	//*  15   28:getstatic       #301 <Field String cj.e>
	//*  16   31:iconst_1        
	//*  17   32:invokevirtual   #304 <Method boolean cj.b(String, boolean)>
	//*  18   35:ifeq            109
				p.a((List)w.get(((Object) (Integer.valueOf(1)))));
	//   19   38:aload_0         
	//   20   39:getfield        #109 <Field bv p>
	//   21   42:aload_0         
	//   22   43:getfield        #295 <Field HashMap w>
	//   23   46:iconst_1        
	//   24   47:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//   25   50:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//   26   53:checkcast       #318 <Class List>
	//   27   56:invokevirtual   #329 <Method void bv.a(List)>
			else
	//*  28   59:aload_0         
	//*  29   60:getfield        #219 <Field SearchView r>
	//*  30   63:ifnull          97
	//*  31   66:aload_0         
	//*  32   67:getfield        #219 <Field SearchView r>
	//*  33   70:invokevirtual   #530 <Method CharSequence SearchView.getQuery()>
	//*  34   73:invokeinterface #531 <Method int CharSequence.length()>
	//*  35   78:ifle            97
	//*  36   81:aload_0         
	//*  37   82:aload_0         
	//*  38   83:getfield        #219 <Field SearchView r>
	//*  39   86:invokevirtual   #530 <Method CharSequence SearchView.getQuery()>
	//*  40   89:invokeinterface #532 <Method String CharSequence.toString()>
	//*  41   94:invokespecial   #242 <Method void d(String)>
	//*  42   97:aload_0         
	//*  43   98:getfield        #109 <Field bv p>
	//*  44  101:invokevirtual   #332 <Method void bv.notifyDataSetChanged()>
	//*  45  104:aload_0         
	//*  46  105:invokespecial   #344 <Method void e()>
	//*  47  108:return          
			if(d)
	//*  48  109:getstatic       #346 <Field boolean d>
	//*  49  112:ifeq            139
				p.a((List)w.get(((Object) (Integer.valueOf(2)))));
	//   50  115:aload_0         
	//   51  116:getfield        #109 <Field bv p>
	//   52  119:aload_0         
	//   53  120:getfield        #295 <Field HashMap w>
	//   54  123:iconst_2        
	//   55  124:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//   56  127:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//   57  130:checkcast       #318 <Class List>
	//   58  133:invokevirtual   #329 <Method void bv.a(List)>
			else
	//*  59  136:goto            59
				p.a((List)w.get(((Object) (Integer.valueOf(3)))));
	//   60  139:aload_0         
	//   61  140:getfield        #109 <Field bv p>
	//   62  143:aload_0         
	//   63  144:getfield        #295 <Field HashMap w>
	//   64  147:iconst_3        
	//   65  148:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//   66  151:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//   67  154:checkcast       #318 <Class List>
	//   68  157:invokevirtual   #329 <Method void bv.a(List)>
			if(r != null && r.getQuery().length() > 0)
				d(r.getQuery().toString());
			p.notifyDataSetChanged();
			e();
		}
	//*  69  160:goto            59
	}

	public void onAdapterViewClick(View view)
	{
		int i1 = q.getChildAdapterPosition(view);
	//    0    0:aload_0         
	//    1    1:getfield        #334 <Field RecyclerView q>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #538 <Method int RecyclerView.getChildAdapterPosition(View)>
	//    4    8:istore_2        
		ci.a("MainActivity : ", (new StringBuilder()).append("onItemClick : ").append(i1).toString());
	//    5    9:ldc1            #103 <String "MainActivity : ">
	//    6   11:new             #265 <Class StringBuilder>
	//    7   14:dup             
	//    8   15:invokespecial   #266 <Method void StringBuilder()>
	//    9   18:ldc2            #540 <String "onItemClick : ">
	//   10   21:invokevirtual   #272 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:iload_2         
	//   12   25:invokevirtual   #326 <Method StringBuilder StringBuilder.append(int)>
	//   13   28:invokevirtual   #284 <Method String StringBuilder.toString()>
	//   14   31:invokestatic    #289 <Method void ci.a(String, String)>
		if(i1 == -1)
	//*  15   34:iload_2         
	//*  16   35:iconst_m1       
	//*  17   36:icmpne          40
			return;
	//   18   39:return          
		view = ((View) (p.a(i1)));
	//   19   40:aload_0         
	//   20   41:getfield        #109 <Field bv p>
	//   21   44:iload_2         
	//   22   45:invokevirtual   #171 <Method ck bv.a(int)>
	//   23   48:astore_1        
		if(((ck) (view)).b())
	//*  24   49:aload_1         
	//*  25   50:invokevirtual   #518 <Method boolean ck.b()>
	//*  26   53:ifeq            108
		{
			((NativeAdDetails)e.get(i1)).sendClick(((Context) (this)));
	//   27   56:aload_0         
	//   28   57:getfield        #542 <Field ArrayList e>
	//   29   60:iload_2         
	//   30   61:invokevirtual   #517 <Method Object ArrayList.get(int)>
	//   31   64:checkcast       #544 <Class NativeAdDetails>
	//   32   67:aload_0         
	//   33   68:invokevirtual   #547 <Method void NativeAdDetails.sendClick(Context)>
			f(((ck) (view)).e());
	//   34   71:aload_0         
	//   35   72:aload_1         
	//   36   73:invokevirtual   #549 <Method String ck.e()>
	//   37   76:invokespecial   #551 <Method void f(String)>
			ci.a("MainActivity : ", (new StringBuilder()).append("onAd click : ").append(((ck) (view)).e()).toString());
	//   38   79:ldc1            #103 <String "MainActivity : ">
	//   39   81:new             #265 <Class StringBuilder>
	//   40   84:dup             
	//   41   85:invokespecial   #266 <Method void StringBuilder()>
	//   42   88:ldc2            #553 <String "onAd click : ">
	//   43   91:invokevirtual   #272 <Method StringBuilder StringBuilder.append(String)>
	//   44   94:aload_1         
	//   45   95:invokevirtual   #549 <Method String ck.e()>
	//   46   98:invokevirtual   #272 <Method StringBuilder StringBuilder.append(String)>
	//   47  101:invokevirtual   #284 <Method String StringBuilder.toString()>
	//   48  104:invokestatic    #289 <Method void ci.a(String, String)>
			return;
	//   49  107:return          
		}
		if(p.f() != 2)
	//*  50  108:aload_0         
	//*  51  109:getfield        #109 <Field bv p>
	//*  52  112:invokevirtual   #555 <Method int bv.f()>
	//*  53  115:iconst_2        
	//*  54  116:icmpeq          144
		{
			view = ((View) (new ArrayList()));
	//   55  119:new             #116 <Class ArrayList>
	//   56  122:dup             
	//   57  123:invokespecial   #117 <Method void ArrayList()>
	//   58  126:astore_1        
			((ArrayList) (view)).add(((Object) (Integer.valueOf(i1))));
	//   59  127:aload_1         
	//   60  128:iload_2         
	//   61  129:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//   62  132:invokevirtual   #556 <Method boolean ArrayList.add(Object)>
	//   63  135:pop             
			a(1, ((ArrayList) (view)), false);
	//   64  136:aload_0         
	//   65  137:iconst_1        
	//   66  138:aload_1         
	//   67  139:iconst_0        
	//   68  140:invokespecial   #238 <Method void a(int, ArrayList, boolean)>
			return;
	//   69  143:return          
		}
		boolean flag = p.a(Integer.valueOf(i1));
	//   70  144:aload_0         
	//   71  145:getfield        #109 <Field bv p>
	//   72  148:iload_2         
	//   73  149:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//   74  152:invokevirtual   #498 <Method boolean bv.a(Integer)>
	//   75  155:istore_3        
		B.invalidate();
	//   76  156:aload_0         
	//   77  157:getfield        #151 <Field ActionMode B>
	//   78  160:invokevirtual   #503 <Method void ActionMode.invalidate()>
		if(!flag && p.d().size() == 0)
	//*  79  163:iload_3         
	//*  80  164:ifne            188
	//*  81  167:aload_0         
	//*  82  168:getfield        #109 <Field bv p>
	//*  83  171:invokevirtual   #559 <Method HashSet bv.d()>
	//*  84  174:invokevirtual   #562 <Method int HashSet.size()>
	//*  85  177:ifne            188
		{
			B.finish();
	//   86  180:aload_0         
	//   87  181:getfield        #151 <Field ActionMode B>
	//   88  184:invokevirtual   #565 <Method void ActionMode.finish()>
			return;
	//   89  187:return          
		} else
		{
			B.invalidate();
	//   90  188:aload_0         
	//   91  189:getfield        #151 <Field ActionMode B>
	//   92  192:invokevirtual   #503 <Method void ActionMode.invalidate()>
			return;
	//   93  195:return          
		}
	}

	public void onBackPressed()
	{
		MenuItemCompat.collapseActionView(z);
	//    0    0:aload_0         
	//    1    1:getfield        #568 <Field MenuItem z>
	//    2    4:invokestatic    #572 <Method boolean MenuItemCompat.collapseActionView(MenuItem)>
	//    3    7:pop             
		if(B != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #151 <Field ActionMode B>
	//*   6   12:ifnull          23
		{
			B.finish();
	//    7   15:aload_0         
	//    8   16:getfield        #151 <Field ActionMode B>
	//    9   19:invokevirtual   #565 <Method void ActionMode.finish()>
			return;
	//   10   22:return          
		}
		if(cn.a().c() || u == null) goto _L2; else goto _L1
	//   11   23:invokestatic    #577 <Method cn cn.a()>
	//   12   26:invokevirtual   #579 <Method boolean cn.c()>
	//   13   29:ifne            70
	//   14   32:aload_0         
	//   15   33:getfield        #123 <Field StartAppAd u>
	//   16   36:ifnull          70
_L1:
		Log.i("MainActivity : ", "Not a premium user,displaying ad");
	//   17   39:ldc1            #103 <String "MainActivity : ">
	//   18   41:ldc2            #581 <String "Not a premium user,displaying ad">
	//   19   44:invokestatic    #586 <Method int Log.i(String, String)>
	//   20   47:pop             
		StartAppAd startappad = u;
	//   21   48:aload_0         
	//   22   49:getfield        #123 <Field StartAppAd u>
	//   23   52:astore_1        
		StartAppAd.onBackPressed(((Context) (this)));
	//   24   53:aload_0         
	//   25   54:invokestatic    #588 <Method void StartAppAd.onBackPressed(Context)>
_L4:
		ci.a("MainActivity : ", "back key pressed");
	//   26   57:ldc1            #103 <String "MainActivity : ">
	//   27   59:ldc2            #590 <String "back key pressed">
	//   28   62:invokestatic    #289 <Method void ci.a(String, String)>
		super.onBackPressed();
	//   29   65:aload_0         
	//   30   66:invokespecial   #592 <Method void BillingActivity.onBackPressed()>
		return;
	//   31   69:return          
_L2:
		if(cn.a().c() && u != null)
	//*  32   70:invokestatic    #577 <Method cn cn.a()>
	//*  33   73:invokevirtual   #579 <Method boolean cn.c()>
	//*  34   76:ifeq            57
	//*  35   79:aload_0         
	//*  36   80:getfield        #123 <Field StartAppAd u>
	//*  37   83:ifnull          57
		{
			Log.i("MainActivity : ", "premium user,Cancel displaying ad");
	//   38   86:ldc1            #103 <String "MainActivity : ">
	//   39   88:ldc2            #594 <String "premium user,Cancel displaying ad">
	//   40   91:invokestatic    #586 <Method int Log.i(String, String)>
	//   41   94:pop             
			u.close();
	//   42   95:aload_0         
	//   43   96:getfield        #123 <Field StartAppAd u>
	//   44   99:invokevirtual   #515 <Method void StartAppAd.close()>
			u = null;
	//   45  102:aload_0         
	//   46  103:aconst_null     
	//   47  104:putfield        #123 <Field StartAppAd u>
		}
		if(true) goto _L4; else goto _L3
	//   48  107:goto            57
_L3:
	}

	public void onCreate(Bundle bundle)
	{
label0:
		{
			super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #598 <Method void BillingActivity.onCreate(Bundle)>
			ci.a("MainActivity : ", " onCreate");
	//    3    5:ldc1            #103 <String "MainActivity : ">
	//    4    7:ldc2            #600 <String " onCreate">
	//    5   10:invokestatic    #289 <Method void ci.a(String, String)>
			setContentView(0x7f0b002f);
	//    6   13:aload_0         
	//    7   14:ldc2            #601 <Int 0x7f0b002f>
	//    8   17:invokevirtual   #604 <Method void setContentView(int)>
			v = cn.a();
	//    9   20:aload_0         
	//   10   21:invokestatic    #577 <Method cn cn.a()>
	//   11   24:putfield        #417 <Field cn v>
			y = (Toolbar)findViewById(0x7f090079);
	//   12   27:aload_0         
	//   13   28:aload_0         
	//   14   29:ldc2            #605 <Int 0x7f090079>
	//   15   32:invokevirtual   #609 <Method View findViewById(int)>
	//   16   35:checkcast       #480 <Class Toolbar>
	//   17   38:putfield        #478 <Field Toolbar y>
			setSupportActionBar(y);
	//   18   41:aload_0         
	//   19   42:aload_0         
	//   20   43:getfield        #478 <Field Toolbar y>
	//   21   46:invokevirtual   #613 <Method void setSupportActionBar(Toolbar)>
			q = (RecyclerView)findViewById(0x7f09007a);
	//   22   49:aload_0         
	//   23   50:aload_0         
	//   24   51:ldc2            #614 <Int 0x7f09007a>
	//   25   54:invokevirtual   #609 <Method View findViewById(int)>
	//   26   57:checkcast       #336 <Class RecyclerView>
	//   27   60:putfield        #334 <Field RecyclerView q>
			q.setHasFixedSize(true);
	//   28   63:aload_0         
	//   29   64:getfield        #334 <Field RecyclerView q>
	//   30   67:iconst_1        
	//   31   68:invokevirtual   #617 <Method void RecyclerView.setHasFixedSize(boolean)>
			q.setLayoutManager(((android.support.v7.widget.RecyclerView.LayoutManager) (new LinearLayoutManager(((Context) (this))))));
	//   32   71:aload_0         
	//   33   72:getfield        #334 <Field RecyclerView q>
	//   34   75:new             #619 <Class LinearLayoutManager>
	//   35   78:dup             
	//   36   79:aload_0         
	//   37   80:invokespecial   #620 <Method void LinearLayoutManager(Context)>
	//   38   83:invokevirtual   #624 <Method void RecyclerView.setLayoutManager(android.support.v7.widget.RecyclerView$LayoutManager)>
			x = (TextView)findViewById(0x7f09004c);
	//   39   86:aload_0         
	//   40   87:aload_0         
	//   41   88:ldc2            #625 <Int 0x7f09004c>
	//   42   91:invokevirtual   #609 <Method View findViewById(int)>
	//   43   94:checkcast       #341 <Class TextView>
	//   44   97:putfield        #125 <Field TextView x>
			bundle = ((Bundle) (new IntentFilter()));
	//   45  100:new             #627 <Class IntentFilter>
	//   46  103:dup             
	//   47  104:invokespecial   #628 <Method void IntentFilter()>
	//   48  107:astore_1        
			((IntentFilter) (bundle)).addAction("android.intent.action.PACKAGE_ADDED");
	//   49  108:aload_1         
	//   50  109:ldc2            #630 <String "android.intent.action.PACKAGE_ADDED">
	//   51  112:invokevirtual   #633 <Method void IntentFilter.addAction(String)>
			((IntentFilter) (bundle)).addAction("android.intent.action.PACKAGE_REMOVED");
	//   52  115:aload_1         
	//   53  116:ldc2            #635 <String "android.intent.action.PACKAGE_REMOVED">
	//   54  119:invokevirtual   #633 <Method void IntentFilter.addAction(String)>
			((IntentFilter) (bundle)).addDataScheme("package");
	//   55  122:aload_1         
	//   56  123:ldc2            #637 <String "package">
	//   57  126:invokevirtual   #640 <Method void IntentFilter.addDataScheme(String)>
			registerReceiver(f, ((IntentFilter) (bundle)));
	//   58  129:aload_0         
	//   59  130:aload_0         
	//   60  131:getfield        #114 <Field BroadcastReceiver f>
	//   61  134:aload_1         
	//   62  135:invokevirtual   #644 <Method Intent registerReceiver(BroadcastReceiver, IntentFilter)>
	//   63  138:pop             
			bundle = ((Bundle) (new IntentFilter()));
	//   64  139:new             #627 <Class IntentFilter>
	//   65  142:dup             
	//   66  143:invokespecial   #628 <Method void IntentFilter()>
	//   67  146:astore_1        
			((IntentFilter) (bundle)).addAction("com.ext.ui.purchase_action");
	//   68  147:aload_1         
	//   69  148:ldc2            #646 <String "com.ext.ui.purchase_action">
	//   70  151:invokevirtual   #633 <Method void IntentFilter.addAction(String)>
			registerReceiver(l, ((IntentFilter) (bundle)));
	//   71  154:aload_0         
	//   72  155:aload_0         
	//   73  156:getfield        #147 <Field BroadcastReceiver l>
	//   74  159:aload_1         
	//   75  160:invokevirtual   #644 <Method Intent registerReceiver(BroadcastReceiver, IntentFilter)>
	//   76  163:pop             
			p = new bv(((Context) (this)), s);
	//   77  164:aload_0         
	//   78  165:new             #168 <Class bv>
	//   79  168:dup             
	//   80  169:aload_0         
	//   81  170:aload_0         
	//   82  171:getfield        #119 <Field List s>
	//   83  174:invokespecial   #649 <Method void bv(Context, List)>
	//   84  177:putfield        #109 <Field bv p>
			q.setAdapter(((android.support.v7.widget.RecyclerView.Adapter) (p)));
	//   85  180:aload_0         
	//   86  181:getfield        #334 <Field RecyclerView q>
	//   87  184:aload_0         
	//   88  185:getfield        #109 <Field bv p>
	//   89  188:invokevirtual   #653 <Method void RecyclerView.setAdapter(android.support.v7.widget.RecyclerView$Adapter)>
			A = cj.a();
	//   90  191:aload_0         
	//   91  192:invokestatic    #656 <Method cj cj.a()>
	//   92  195:putfield        #297 <Field cj A>
			c();
	//   93  198:aload_0         
	//   94  199:invokevirtual   #658 <Method void c()>
			getSupportLoaderManager().initLoader(1, ((Bundle) (null)), ((android.support.v4.app.LoaderManager.LoaderCallbacks) (this)));
	//   95  202:aload_0         
	//   96  203:invokevirtual   #662 <Method LoaderManager getSupportLoaderManager()>
	//   97  206:iconst_1        
	//   98  207:aconst_null     
	//   99  208:aload_0         
	//  100  209:invokevirtual   #668 <Method Loader LoaderManager.initLoader(int, Bundle, android.support.v4.app.LoaderManager$LoaderCallbacks)>
	//  101  212:pop             
			ci.a("MainActivity : ", (new StringBuilder()).append("Premium user status : ").append(cn.a().c()).toString());
	//  102  213:ldc1            #103 <String "MainActivity : ">
	//  103  215:new             #265 <Class StringBuilder>
	//  104  218:dup             
	//  105  219:invokespecial   #266 <Method void StringBuilder()>
	//  106  222:ldc2            #670 <String "Premium user status : ">
	//  107  225:invokevirtual   #272 <Method StringBuilder StringBuilder.append(String)>
	//  108  228:invokestatic    #577 <Method cn cn.a()>
	//  109  231:invokevirtual   #579 <Method boolean cn.c()>
	//  110  234:invokevirtual   #281 <Method StringBuilder StringBuilder.append(boolean)>
	//  111  237:invokevirtual   #284 <Method String StringBuilder.toString()>
	//  112  240:invokestatic    #289 <Method void ci.a(String, String)>
			if(!cn.a().c())
	//* 113  243:invokestatic    #577 <Method cn cn.a()>
	//* 114  246:invokevirtual   #579 <Method boolean cn.c()>
	//* 115  249:ifne            290
			{
				StartAppSDK.init(((android.app.Activity) (this)), "201644477", true);
	//  116  252:aload_0         
	//  117  253:ldc2            #672 <String "201644477">
	//  118  256:iconst_1        
	//  119  257:invokestatic    #678 <Method void StartAppSDK.init(android.app.Activity, String, boolean)>
				u = new StartAppAd(((Context) (this)));
	//  120  260:aload_0         
	//  121  261:new             #512 <Class StartAppAd>
	//  122  264:dup             
	//  123  265:aload_0         
	//  124  266:invokespecial   #522 <Method void StartAppAd(Context)>
	//  125  269:putfield        #123 <Field StartAppAd u>
				StartAppAd.disableSplash();
	//  126  272:invokestatic    #681 <Method void StartAppAd.disableSplash()>
				if(p.a().size() != 0)
					break label0;
	//  127  275:aload_0         
	//  128  276:getfield        #109 <Field bv p>
	//  129  279:invokevirtual   #684 <Method List bv.a()>
	//  130  282:invokeinterface #323 <Method int List.size()>
	//  131  287:ifne            291
			}
			return;
	//  132  290:return          
		}
		j.loadAd((new NativeAdPreferences()).setAdsNumber(1).setAutoBitmapDownload(true).setImageSize(com.startapp.android.publish.ads.nativead.NativeAdPreferences.NativeAdBitmapSize.SIZE72X72), k);
	//  133  291:aload_0         
	//  134  292:getfield        #141 <Field StartAppNativeAd j>
	//  135  295:new             #686 <Class NativeAdPreferences>
	//  136  298:dup             
	//  137  299:invokespecial   #687 <Method void NativeAdPreferences()>
	//  138  302:iconst_1        
	//  139  303:invokevirtual   #691 <Method NativeAdPreferences NativeAdPreferences.setAdsNumber(int)>
	//  140  306:iconst_1        
	//  141  307:invokevirtual   #695 <Method NativeAdPreferences NativeAdPreferences.setAutoBitmapDownload(boolean)>
	//  142  310:getstatic       #701 <Field com.startapp.android.publish.ads.nativead.NativeAdPreferences$NativeAdBitmapSize com.startapp.android.publish.ads.nativead.NativeAdPreferences$NativeAdBitmapSize.SIZE72X72>
	//  143  313:invokevirtual   #705 <Method NativeAdPreferences NativeAdPreferences.setImageSize(com.startapp.android.publish.ads.nativead.NativeAdPreferences$NativeAdBitmapSize)>
	//  144  316:aload_0         
	//  145  317:getfield        #144 <Field AdEventListener k>
	//  146  320:invokevirtual   #709 <Method boolean StartAppNativeAd.loadAd(NativeAdPreferences, AdEventListener)>
	//  147  323:pop             
	//  148  324:return          
	}

	public Loader onCreateLoader(int i1, Bundle bundle)
	{
		if(i1 == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          37
		{
			a(v.a(0x7f0d0054), 0);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #417 <Field cn v>
	//    6   10:ldc2            #712 <Int 0x7f0d0054>
	//    7   13:invokevirtual   #714 <Method String cn.a(int)>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #716 <Method void a(String, int)>
			ci.a("MainActivity : ", " onCreateLoader");
	//   10   20:ldc1            #103 <String "MainActivity : ">
	//   11   22:ldc2            #718 <String " onCreateLoader">
	//   12   25:invokestatic    #289 <Method void ci.a(String, String)>
			return ((Loader) (new com.ext.ui.a(((Context) (this)))));
	//   13   28:new             #720 <Class a>
	//   14   31:dup             
	//   15   32:aload_0         
	//   16   33:invokespecial   #721 <Method void a(Context)>
	//   17   36:areturn         
		} else
		{
			return null;
	//   18   37:aconst_null     
	//   19   38:areturn         
		}
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(0x7f0c0001, menu);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #727 <Method MenuInflater getMenuInflater()>
	//    2    4:ldc2            #728 <Int 0x7f0c0001>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #734 <Method void MenuInflater.inflate(int, Menu)>
		z = menu.findItem(0x7f090019);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:ldc2            #735 <Int 0x7f090019>
	//    8   16:invokeinterface #741 <Method MenuItem Menu.findItem(int)>
	//    9   21:putfield        #568 <Field MenuItem z>
		r = (SearchView)MenuItemCompat.getActionView(z);
	//   10   24:aload_0         
	//   11   25:aload_0         
	//   12   26:getfield        #568 <Field MenuItem z>
	//   13   29:invokestatic    #745 <Method View MenuItemCompat.getActionView(MenuItem)>
	//   14   32:checkcast       #221 <Class SearchView>
	//   15   35:putfield        #219 <Field SearchView r>
		a(z);
	//   16   38:aload_0         
	//   17   39:aload_0         
	//   18   40:getfield        #568 <Field MenuItem z>
	//   19   43:invokespecial   #747 <Method void a(MenuItem)>
		return true;
	//   20   46:iconst_1        
	//   21   47:ireturn         
	}

	public void onDestroy()
	{
		if(r != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #219 <Field SearchView r>
	//*   2    4:ifnull          15
			r.setIconified(true);
	//    3    7:aload_0         
	//    4    8:getfield        #219 <Field SearchView r>
	//    5   11:iconst_1        
	//    6   12:invokevirtual   #751 <Method void SearchView.setIconified(boolean)>
		super.onDestroy();
	//    7   15:aload_0         
	//    8   16:invokespecial   #753 <Method void BillingActivity.onDestroy()>
		c();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #658 <Method void c()>
		unregisterReceiver(f);
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #114 <Field BroadcastReceiver f>
	//   14   28:invokevirtual   #757 <Method void unregisterReceiver(BroadcastReceiver)>
		unregisterReceiver(l);
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #147 <Field BroadcastReceiver l>
	//   18   36:invokevirtual   #757 <Method void unregisterReceiver(BroadcastReceiver)>
		f = null;
	//   19   39:aload_0         
	//   20   40:aconst_null     
	//   21   41:putfield        #114 <Field BroadcastReceiver f>
		m = null;
	//   22   44:aconst_null     
	//   23   45:putstatic       #97  <Field List m>
		u = null;
	//   24   48:aload_0         
	//   25   49:aconst_null     
	//   26   50:putfield        #123 <Field StartAppAd u>
		ci.a("MainActivity : ", "onDestroy");
	//   27   53:ldc1            #103 <String "MainActivity : ">
	//   28   55:ldc2            #758 <String "onDestroy">
	//   29   58:invokestatic    #289 <Method void ci.a(String, String)>
	//   30   61:return          
	}

	public void onLoadFinished(Loader loader, Object obj)
	{
		if(loader.getId() == 1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #765 <Method int Loader.getId()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          154
		{
			ci.a("MainActivity : ", "onLoadFInished");
	//    4    8:ldc1            #103 <String "MainActivity : ">
	//    5   10:ldc2            #767 <String "onLoadFInished">
	//    6   13:invokestatic    #289 <Method void ci.a(String, String)>
			w = (HashMap)obj;
	//    7   16:aload_0         
	//    8   17:aload_2         
	//    9   18:checkcast       #312 <Class HashMap>
	//   10   21:putfield        #295 <Field HashMap w>
			if(A.b(cj.e, true))
	//*  11   24:aload_0         
	//*  12   25:getfield        #297 <Field cj A>
	//*  13   28:getstatic       #301 <Field String cj.e>
	//*  14   31:iconst_1        
	//*  15   32:invokevirtual   #304 <Method boolean cj.b(String, boolean)>
	//*  16   35:ifeq            155
				p.a((List)w.get(((Object) (Integer.valueOf(1)))));
	//   17   38:aload_0         
	//   18   39:getfield        #109 <Field bv p>
	//   19   42:aload_0         
	//   20   43:getfield        #295 <Field HashMap w>
	//   21   46:iconst_1        
	//   22   47:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//   23   50:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//   24   53:checkcast       #318 <Class List>
	//   25   56:invokevirtual   #329 <Method void bv.a(List)>
			else
	//*  26   59:aload_0         
	//*  27   60:getfield        #219 <Field SearchView r>
	//*  28   63:ifnull          97
	//*  29   66:aload_0         
	//*  30   67:getfield        #219 <Field SearchView r>
	//*  31   70:invokevirtual   #530 <Method CharSequence SearchView.getQuery()>
	//*  32   73:invokeinterface #531 <Method int CharSequence.length()>
	//*  33   78:ifle            97
	//*  34   81:aload_0         
	//*  35   82:aload_0         
	//*  36   83:getfield        #219 <Field SearchView r>
	//*  37   86:invokevirtual   #530 <Method CharSequence SearchView.getQuery()>
	//*  38   89:invokeinterface #532 <Method String CharSequence.toString()>
	//*  39   94:invokespecial   #242 <Method void d(String)>
	//*  40   97:aload_0         
	//*  41   98:getfield        #109 <Field bv p>
	//*  42  101:invokevirtual   #332 <Method void bv.notifyDataSetChanged()>
	//*  43  104:aload_0         
	//*  44  105:invokevirtual   #658 <Method void c()>
	//*  45  108:aload_0         
	//*  46  109:invokespecial   #344 <Method void e()>
	//*  47  112:invokestatic    #577 <Method cn cn.a()>
	//*  48  115:invokevirtual   #579 <Method boolean cn.c()>
	//*  49  118:ifne            154
	//*  50  121:aload_0         
	//*  51  122:getfield        #141 <Field StartAppNativeAd j>
	//*  52  125:new             #686 <Class NativeAdPreferences>
	//*  53  128:dup             
	//*  54  129:invokespecial   #687 <Method void NativeAdPreferences()>
	//*  55  132:iconst_1        
	//*  56  133:invokevirtual   #691 <Method NativeAdPreferences NativeAdPreferences.setAdsNumber(int)>
	//*  57  136:iconst_1        
	//*  58  137:invokevirtual   #695 <Method NativeAdPreferences NativeAdPreferences.setAutoBitmapDownload(boolean)>
	//*  59  140:getstatic       #701 <Field com.startapp.android.publish.ads.nativead.NativeAdPreferences$NativeAdBitmapSize com.startapp.android.publish.ads.nativead.NativeAdPreferences$NativeAdBitmapSize.SIZE72X72>
	//*  60  143:invokevirtual   #705 <Method NativeAdPreferences NativeAdPreferences.setImageSize(com.startapp.android.publish.ads.nativead.NativeAdPreferences$NativeAdBitmapSize)>
	//*  61  146:aload_0         
	//*  62  147:getfield        #144 <Field AdEventListener k>
	//*  63  150:invokevirtual   #709 <Method boolean StartAppNativeAd.loadAd(NativeAdPreferences, AdEventListener)>
	//*  64  153:pop             
	//*  65  154:return          
			if(d)
	//*  66  155:getstatic       #346 <Field boolean d>
	//*  67  158:ifeq            185
				p.a((List)w.get(((Object) (Integer.valueOf(2)))));
	//   68  161:aload_0         
	//   69  162:getfield        #109 <Field bv p>
	//   70  165:aload_0         
	//   71  166:getfield        #295 <Field HashMap w>
	//   72  169:iconst_2        
	//   73  170:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//   74  173:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//   75  176:checkcast       #318 <Class List>
	//   76  179:invokevirtual   #329 <Method void bv.a(List)>
			else
	//*  77  182:goto            59
				p.a((List)w.get(((Object) (Integer.valueOf(3)))));
	//   78  185:aload_0         
	//   79  186:getfield        #109 <Field bv p>
	//   80  189:aload_0         
	//   81  190:getfield        #295 <Field HashMap w>
	//   82  193:iconst_3        
	//   83  194:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//   84  197:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//   85  200:checkcast       #318 <Class List>
	//   86  203:invokevirtual   #329 <Method void bv.a(List)>
			if(r != null && r.getQuery().length() > 0)
				d(r.getQuery().toString());
			p.notifyDataSetChanged();
			c();
			e();
			if(!cn.a().c())
				j.loadAd((new NativeAdPreferences()).setAdsNumber(1).setAutoBitmapDownload(true).setImageSize(com.startapp.android.publish.ads.nativead.NativeAdPreferences.NativeAdBitmapSize.SIZE72X72), k);
		}
	//*  87  206:goto            59
	}

	public void onLoaderReset(Loader loader)
	{
		ci.a("MainActivity : ", "onLoaderReset");
	//    0    0:ldc1            #103 <String "MainActivity : ">
	//    1    2:ldc2            #771 <String "onLoaderReset">
	//    2    5:invokestatic    #289 <Method void ci.a(String, String)>
		if(loader.getId() == 1)
	//*   3    8:aload_1         
	//*   4    9:invokevirtual   #765 <Method int Loader.getId()>
	//*   5   12:iconst_1        
	//*   6   13:icmpne          24
			p.a(((List) (null)));
	//    7   16:aload_0         
	//    8   17:getfield        #109 <Field bv p>
	//    9   20:aconst_null     
	//   10   21:invokevirtual   #329 <Method void bv.a(List)>
	//   11   24:return          
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		ci.a("MainActivity : ", (new StringBuilder()).append(" onOptionsMenuSelected :").append(((Object) (menuitem.getTitle()))).toString());
	//    0    0:ldc1            #103 <String "MainActivity : ">
	//    1    2:new             #265 <Class StringBuilder>
	//    2    5:dup             
	//    3    6:invokespecial   #266 <Method void StringBuilder()>
	//    4    9:ldc2            #775 <String " onOptionsMenuSelected :">
	//    5   12:invokevirtual   #272 <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_1         
	//    7   16:invokeinterface #780 <Method CharSequence MenuItem.getTitle()>
	//    8   21:invokevirtual   #783 <Method StringBuilder StringBuilder.append(Object)>
	//    9   24:invokevirtual   #284 <Method String StringBuilder.toString()>
	//   10   27:invokestatic    #289 <Method void ci.a(String, String)>
		if(menuitem.getTitle().toString().equals(((Object) (getResources().getString(0x7f0d002f)))))
	//*  11   30:aload_1         
	//*  12   31:invokeinterface #780 <Method CharSequence MenuItem.getTitle()>
	//*  13   36:invokeinterface #532 <Method String CharSequence.toString()>
	//*  14   41:aload_0         
	//*  15   42:invokevirtual   #158 <Method Resources getResources()>
	//*  16   45:ldc2            #784 <Int 0x7f0d002f>
	//*  17   48:invokevirtual   #165 <Method String Resources.getString(int)>
	//*  18   51:invokevirtual   #787 <Method boolean String.equals(Object)>
	//*  19   54:ifeq            80
		{
			if(c)
	//*  20   57:getstatic       #95  <Field boolean c>
	//*  21   60:ifeq            78
			{
				f(getPackageName());
	//   22   63:aload_0         
	//   23   64:aload_0         
	//   24   65:invokevirtual   #790 <Method String getPackageName()>
	//   25   68:invokespecial   #551 <Method void f(String)>
				a("RATE");
	//   26   71:aload_0         
	//   27   72:ldc2            #792 <String "RATE">
	//   28   75:invokevirtual   #794 <Method void a(String)>
			}
			return true;
	//   29   78:iconst_1        
	//   30   79:ireturn         
		}
		if(menuitem.getTitle().toString().equals(((Object) (getResources().getString(0x7f0d0069)))))
	//*  31   80:aload_1         
	//*  32   81:invokeinterface #780 <Method CharSequence MenuItem.getTitle()>
	//*  33   86:invokeinterface #532 <Method String CharSequence.toString()>
	//*  34   91:aload_0         
	//*  35   92:invokevirtual   #158 <Method Resources getResources()>
	//*  36   95:ldc2            #795 <Int 0x7f0d0069>
	//*  37   98:invokevirtual   #165 <Method String Resources.getString(int)>
	//*  38  101:invokevirtual   #787 <Method boolean String.equals(Object)>
	//*  39  104:ifeq            129
		{
			startActivityForResult(new Intent(((Context) (this)), com/ext/ui/SettingsActivity), 1);
	//   40  107:aload_0         
	//   41  108:new             #421 <Class Intent>
	//   42  111:dup             
	//   43  112:aload_0         
	//   44  113:ldc2            #797 <Class SettingsActivity>
	//   45  116:invokespecial   #800 <Method void Intent(Context, Class)>
	//   46  119:iconst_1        
	//   47  120:invokevirtual   #804 <Method void startActivityForResult(Intent, int)>
		} else
	//*  48  123:aload_0         
	//*  49  124:aload_1         
	//*  50  125:invokespecial   #806 <Method boolean BillingActivity.onOptionsItemSelected(MenuItem)>
	//*  51  128:ireturn         
		{
			if(menuitem.getTitle().toString().equals(((Object) (getString(0x7f0d0077)))))
	//*  52  129:aload_1         
	//*  53  130:invokeinterface #780 <Method CharSequence MenuItem.getTitle()>
	//*  54  135:invokeinterface #532 <Method String CharSequence.toString()>
	//*  55  140:aload_0         
	//*  56  141:ldc2            #807 <Int 0x7f0d0077>
	//*  57  144:invokevirtual   #808 <Method String getString(int)>
	//*  58  147:invokevirtual   #787 <Method boolean String.equals(Object)>
	//*  59  150:ifeq            243
			{
				menuitem.setTitle(((CharSequence) (getString(0x7f0d0076))));
	//   60  153:aload_1         
	//   61  154:aload_0         
	//   62  155:ldc2            #809 <Int 0x7f0d0076>
	//   63  158:invokevirtual   #808 <Method String getString(int)>
	//   64  161:invokeinterface #812 <Method MenuItem MenuItem.setTitle(CharSequence)>
	//   65  166:pop             
				d = false;
	//   66  167:iconst_0        
	//   67  168:putstatic       #346 <Field boolean d>
				p.a((List)w.get(((Object) (Integer.valueOf(3)))));
	//   68  171:aload_0         
	//   69  172:getfield        #109 <Field bv p>
	//   70  175:aload_0         
	//   71  176:getfield        #295 <Field HashMap w>
	//   72  179:iconst_3        
	//   73  180:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//   74  183:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//   75  186:checkcast       #318 <Class List>
	//   76  189:invokevirtual   #329 <Method void bv.a(List)>
				if(r != null && r.getQuery().length() > 0)
	//*  77  192:aload_0         
	//*  78  193:getfield        #219 <Field SearchView r>
	//*  79  196:ifnull          230
	//*  80  199:aload_0         
	//*  81  200:getfield        #219 <Field SearchView r>
	//*  82  203:invokevirtual   #530 <Method CharSequence SearchView.getQuery()>
	//*  83  206:invokeinterface #531 <Method int CharSequence.length()>
	//*  84  211:ifle            230
					d(r.getQuery().toString());
	//   85  214:aload_0         
	//   86  215:aload_0         
	//   87  216:getfield        #219 <Field SearchView r>
	//   88  219:invokevirtual   #530 <Method CharSequence SearchView.getQuery()>
	//   89  222:invokeinterface #532 <Method String CharSequence.toString()>
	//   90  227:invokespecial   #242 <Method void d(String)>
				p.notifyDataSetChanged();
	//   91  230:aload_0         
	//   92  231:getfield        #109 <Field bv p>
	//   93  234:invokevirtual   #332 <Method void bv.notifyDataSetChanged()>
				e();
	//   94  237:aload_0         
	//   95  238:invokespecial   #344 <Method void e()>
				return true;
	//   96  241:iconst_1        
	//   97  242:ireturn         
			}
			if(menuitem.getTitle().toString().equals(((Object) (getString(0x7f0d0076)))))
	//*  98  243:aload_1         
	//*  99  244:invokeinterface #780 <Method CharSequence MenuItem.getTitle()>
	//* 100  249:invokeinterface #532 <Method String CharSequence.toString()>
	//* 101  254:aload_0         
	//* 102  255:ldc2            #809 <Int 0x7f0d0076>
	//* 103  258:invokevirtual   #808 <Method String getString(int)>
	//* 104  261:invokevirtual   #787 <Method boolean String.equals(Object)>
	//* 105  264:ifeq            357
			{
				menuitem.setTitle(((CharSequence) (getString(0x7f0d0077))));
	//  106  267:aload_1         
	//  107  268:aload_0         
	//  108  269:ldc2            #807 <Int 0x7f0d0077>
	//  109  272:invokevirtual   #808 <Method String getString(int)>
	//  110  275:invokeinterface #812 <Method MenuItem MenuItem.setTitle(CharSequence)>
	//  111  280:pop             
				d = true;
	//  112  281:iconst_1        
	//  113  282:putstatic       #346 <Field boolean d>
				p.a((List)w.get(((Object) (Integer.valueOf(2)))));
	//  114  285:aload_0         
	//  115  286:getfield        #109 <Field bv p>
	//  116  289:aload_0         
	//  117  290:getfield        #295 <Field HashMap w>
	//  118  293:iconst_2        
	//  119  294:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//  120  297:invokevirtual   #316 <Method Object HashMap.get(Object)>
	//  121  300:checkcast       #318 <Class List>
	//  122  303:invokevirtual   #329 <Method void bv.a(List)>
				if(r != null && r.getQuery().length() > 0)
	//* 123  306:aload_0         
	//* 124  307:getfield        #219 <Field SearchView r>
	//* 125  310:ifnull          344
	//* 126  313:aload_0         
	//* 127  314:getfield        #219 <Field SearchView r>
	//* 128  317:invokevirtual   #530 <Method CharSequence SearchView.getQuery()>
	//* 129  320:invokeinterface #531 <Method int CharSequence.length()>
	//* 130  325:ifle            344
					d(r.getQuery().toString());
	//  131  328:aload_0         
	//  132  329:aload_0         
	//  133  330:getfield        #219 <Field SearchView r>
	//  134  333:invokevirtual   #530 <Method CharSequence SearchView.getQuery()>
	//  135  336:invokeinterface #532 <Method String CharSequence.toString()>
	//  136  341:invokespecial   #242 <Method void d(String)>
				p.notifyDataSetChanged();
	//  137  344:aload_0         
	//  138  345:getfield        #109 <Field bv p>
	//  139  348:invokevirtual   #332 <Method void bv.notifyDataSetChanged()>
				e();
	//  140  351:aload_0         
	//  141  352:invokespecial   #344 <Method void e()>
				return true;
	//  142  355:iconst_1        
	//  143  356:ireturn         
			}
			if(menuitem.getTitle().toString().equals(((Object) (getString(0x7f0d0067)))))
	//* 144  357:aload_1         
	//* 145  358:invokeinterface #780 <Method CharSequence MenuItem.getTitle()>
	//* 146  363:invokeinterface #532 <Method String CharSequence.toString()>
	//* 147  368:aload_0         
	//* 148  369:ldc2            #813 <Int 0x7f0d0067>
	//* 149  372:invokevirtual   #808 <Method String getString(int)>
	//* 150  375:invokevirtual   #787 <Method boolean String.equals(Object)>
	//* 151  378:ifeq            123
			{
				if(B == null)
	//* 152  381:aload_0         
	//* 153  382:getfield        #151 <Field ActionMode B>
	//* 154  385:ifnonnull       408
				{
					p.b(2);
	//  155  388:aload_0         
	//  156  389:getfield        #109 <Field bv p>
	//  157  392:iconst_2        
	//  158  393:invokevirtual   #491 <Method void bv.b(int)>
					B = startSupportActionMode(i);
	//  159  396:aload_0         
	//  160  397:aload_0         
	//  161  398:aload_0         
	//  162  399:getfield        #134 <Field android.support.v7.view.ActionMode$Callback i>
	//  163  402:invokevirtual   #495 <Method ActionMode startSupportActionMode(android.support.v7.view.ActionMode$Callback)>
	//  164  405:putfield        #151 <Field ActionMode B>
				}
				int i1 = p.getItemCount();
	//  165  408:aload_0         
	//  166  409:getfield        #109 <Field bv p>
	//  167  412:invokevirtual   #445 <Method int bv.getItemCount()>
	//  168  415:istore_2        
				if(i1 <= p.d().size())
	//* 169  416:iload_2         
	//* 170  417:aload_0         
	//* 171  418:getfield        #109 <Field bv p>
	//* 172  421:invokevirtual   #559 <Method HashSet bv.d()>
	//* 173  424:invokevirtual   #562 <Method int HashSet.size()>
	//* 174  427:icmpgt          491
				{
					menuitem.setIcon(0x108000f);
	//  175  430:aload_1         
	//  176  431:ldc2            #814 <Int 0x108000f>
	//  177  434:invokeinterface #817 <Method MenuItem MenuItem.setIcon(int)>
	//  178  439:pop             
					p.b();
	//  179  440:aload_0         
	//  180  441:getfield        #109 <Field bv p>
	//  181  444:invokevirtual   #819 <Method void bv.b()>
					B.setTitle(((CharSequence) ((new StringBuilder()).append("0 / ").append(i1).toString())));
	//  182  447:aload_0         
	//  183  448:getfield        #151 <Field ActionMode B>
	//  184  451:new             #265 <Class StringBuilder>
	//  185  454:dup             
	//  186  455:invokespecial   #266 <Method void StringBuilder()>
	//  187  458:ldc2            #821 <String "0 / ">
	//  188  461:invokevirtual   #272 <Method StringBuilder StringBuilder.append(String)>
	//  189  464:iload_2         
	//  190  465:invokevirtual   #326 <Method StringBuilder StringBuilder.append(int)>
	//  191  468:invokevirtual   #284 <Method String StringBuilder.toString()>
	//  192  471:invokevirtual   #823 <Method void ActionMode.setTitle(CharSequence)>
					ci.a("MainActivity : ", "onActionItemClicked :check_box: Cleared all Selections");
	//  193  474:ldc1            #103 <String "MainActivity : ">
	//  194  476:ldc2            #825 <String "onActionItemClicked :check_box: Cleared all Selections">
	//  195  479:invokestatic    #289 <Method void ci.a(String, String)>
					B.finish();
	//  196  482:aload_0         
	//  197  483:getfield        #151 <Field ActionMode B>
	//  198  486:invokevirtual   #565 <Method void ActionMode.finish()>
				} else
	//* 199  489:iconst_1        
	//* 200  490:ireturn         
				{
					menuitem.setIcon(0x1080010);
	//  201  491:aload_1         
	//  202  492:ldc2            #826 <Int 0x1080010>
	//  203  495:invokeinterface #817 <Method MenuItem MenuItem.setIcon(int)>
	//  204  500:pop             
					p.c();
	//  205  501:aload_0         
	//  206  502:getfield        #109 <Field bv p>
	//  207  505:invokevirtual   #827 <Method void bv.c()>
					B.setTitle(((CharSequence) ((new StringBuilder()).append(i1).append(" / ").append(i1).toString())));
	//  208  508:aload_0         
	//  209  509:getfield        #151 <Field ActionMode B>
	//  210  512:new             #265 <Class StringBuilder>
	//  211  515:dup             
	//  212  516:invokespecial   #266 <Method void StringBuilder()>
	//  213  519:iload_2         
	//  214  520:invokevirtual   #326 <Method StringBuilder StringBuilder.append(int)>
	//  215  523:ldc2            #829 <String " / ">
	//  216  526:invokevirtual   #272 <Method StringBuilder StringBuilder.append(String)>
	//  217  529:iload_2         
	//  218  530:invokevirtual   #326 <Method StringBuilder StringBuilder.append(int)>
	//  219  533:invokevirtual   #284 <Method String StringBuilder.toString()>
	//  220  536:invokevirtual   #823 <Method void ActionMode.setTitle(CharSequence)>
					ci.a("MainActivity : ", "onActionItemClicked:check_box: selected all items");
	//  221  539:ldc1            #103 <String "MainActivity : ">
	//  222  541:ldc2            #831 <String "onActionItemClicked:check_box: selected all items">
	//  223  544:invokestatic    #289 <Method void ci.a(String, String)>
					B.invalidate();
	//  224  547:aload_0         
	//  225  548:getfield        #151 <Field ActionMode B>
	//  226  551:invokevirtual   #503 <Method void ActionMode.invalidate()>
				}
				return true;
			}
		}
		return super.onOptionsItemSelected(menuitem);
	//* 227  554:goto            489
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #834 <Method void BillingActivity.onPause()>
		if(!cn.a().c() && u != null)
	//*   2    4:invokestatic    #577 <Method cn cn.a()>
	//*   3    7:invokevirtual   #579 <Method boolean cn.c()>
	//*   4   10:ifne            27
	//*   5   13:aload_0         
	//*   6   14:getfield        #123 <Field StartAppAd u>
	//*   7   17:ifnull          27
			u.onPause();
	//    8   20:aload_0         
	//    9   21:getfield        #123 <Field StartAppAd u>
	//   10   24:invokevirtual   #835 <Method void StartAppAd.onPause()>
	//   11   27:return          
	}

	public boolean onPrepareOptionsMenu(Menu menu)
	{
		menu.removeGroup(5);
	//    0    0:aload_1         
	//    1    1:iconst_5        
	//    2    2:invokeinterface #839 <Method void Menu.removeGroup(int)>
		if(!A.b(cj.e, true))
	//*   3    7:aload_0         
	//*   4    8:getfield        #297 <Field cj A>
	//*   5   11:getstatic       #301 <Field String cj.e>
	//*   6   14:iconst_1        
	//*   7   15:invokevirtual   #304 <Method boolean cj.b(String, boolean)>
	//*   8   18:ifeq            57
	//*   9   21:aload_1         
	//*  10   22:iconst_5        
	//*  11   23:iconst_2        
	//*  12   24:iconst_0        
	//*  13   25:aload_0         
	//*  14   26:ldc2            #813 <Int 0x7f0d0067>
	//*  15   29:invokevirtual   #808 <Method String getString(int)>
	//*  16   32:invokeinterface #842 <Method MenuItem Menu.add(int, int, int, CharSequence)>
	//*  17   37:pop             
	//*  18   38:aload_1         
	//*  19   39:iconst_5        
	//*  20   40:iconst_2        
	//*  21   41:iconst_0        
	//*  22   42:aload_0         
	//*  23   43:ldc2            #795 <Int 0x7f0d0069>
	//*  24   46:invokevirtual   #808 <Method String getString(int)>
	//*  25   49:invokeinterface #842 <Method MenuItem Menu.add(int, int, int, CharSequence)>
	//*  26   54:pop             
	//*  27   55:iconst_1        
	//*  28   56:ireturn         
			if(d)
	//*  29   57:getstatic       #346 <Field boolean d>
	//*  30   60:ifeq            83
				menu.add(5, 1, 0, ((CharSequence) (getString(0x7f0d0077))));
	//   31   63:aload_1         
	//   32   64:iconst_5        
	//   33   65:iconst_1        
	//   34   66:iconst_0        
	//   35   67:aload_0         
	//   36   68:ldc2            #807 <Int 0x7f0d0077>
	//   37   71:invokevirtual   #808 <Method String getString(int)>
	//   38   74:invokeinterface #842 <Method MenuItem Menu.add(int, int, int, CharSequence)>
	//   39   79:pop             
			else
	//*  40   80:goto            21
				menu.add(5, 1, 0, ((CharSequence) (getString(0x7f0d0076))));
	//   41   83:aload_1         
	//   42   84:iconst_5        
	//   43   85:iconst_1        
	//   44   86:iconst_0        
	//   45   87:aload_0         
	//   46   88:ldc2            #809 <Int 0x7f0d0076>
	//   47   91:invokevirtual   #808 <Method String getString(int)>
	//   48   94:invokeinterface #842 <Method MenuItem Menu.add(int, int, int, CharSequence)>
	//   49   99:pop             
		menu.add(5, 2, 0, ((CharSequence) (getString(0x7f0d0067))));
		menu.add(5, 2, 0, ((CharSequence) (getString(0x7f0d0069))));
		return true;
	//*  50  100:goto            21
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #845 <Method void BillingActivity.onResume()>
		if(!cn.a().c() && u != null)
	//*   2    4:invokestatic    #577 <Method cn cn.a()>
	//*   3    7:invokevirtual   #579 <Method boolean cn.c()>
	//*   4   10:ifne            27
	//*   5   13:aload_0         
	//*   6   14:getfield        #123 <Field StartAppAd u>
	//*   7   17:ifnull          27
			u.onResume();
	//    8   20:aload_0         
	//    9   21:getfield        #123 <Field StartAppAd u>
	//   10   24:invokevirtual   #846 <Method void StartAppAd.onResume()>
	//   11   27:return          
	}

	public static boolean c = true;
	public static boolean d;
	private static List m = null;
	private cj A;
	private ActionMode B;
	ArrayList e;
	BroadcastReceiver f;
	android.support.v4.view.MenuItemCompat.OnActionExpandListener g;
	android.support.v7.widget.SearchView.OnQueryTextListener h;
	android.support.v7.view.ActionMode.Callback i;
	StartAppNativeAd j;
	AdEventListener k;
	BroadcastReceiver l;
	private final String n = "MainActivity : ";
	private final int o = 1;
	private bv p;
	private RecyclerView q;
	private SearchView r;
	private List s;
	private ProgressDialog t;
	private StartAppAd u;
	private cn v;
	private HashMap w;
	private TextView x;
	private Toolbar y;
	private MenuItem z;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:putstatic       #95  <Field boolean c>
	//    2    4:aconst_null     
	//    3    5:putstatic       #97  <Field List m>
	//*   4    8:return          
	}
}
