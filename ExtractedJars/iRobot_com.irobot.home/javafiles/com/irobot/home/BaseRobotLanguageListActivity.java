// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.*;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.*;
import com.irobot.home.b.p;
import com.irobot.home.model.Robot;
import com.irobot.home.model.RobotAvailableLanguages;
import com.irobot.home.model.RobotLanguage;
import com.irobot.home.model.RobotPreferences;
import com.irobot.home.model.rest.LanguagePack;
import com.irobot.home.model.rest.LanguagePackList;
import com.irobot.home.model.s;
import com.irobot.home.q.b;
import com.irobot.home.rest.CustomerCareRestClient;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.*;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, CustomerRegistrationActivity_, IRobotApplication

public class BaseRobotLanguageListActivity extends BaseFragmentActivity
	implements android.widget.AdapterView.OnItemClickListener
{
	private class a
		implements android.content.DialogInterface.OnClickListener
	{

		public void onClick(DialogInterface dialoginterface, int i1)
		{
			if(a.h())
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field BaseRobotLanguageListActivity a>
		//*   2    4:invokevirtual   #28  <Method boolean BaseRobotLanguageListActivity.h()>
		//*   3    7:ifeq            22
			{
				a.a(b);
		//    4   10:aload_0         
		//    5   11:getfield        #16  <Field BaseRobotLanguageListActivity a>
		//    6   14:aload_0         
		//    7   15:getfield        #21  <Field LanguagePack b>
		//    8   18:invokevirtual   #31  <Method void BaseRobotLanguageListActivity.a(LanguagePack)>
				return;
		//    9   21:return          
			} else
			{
				a.g(0x7f0f043f);
		//   10   22:aload_0         
		//   11   23:getfield        #16  <Field BaseRobotLanguageListActivity a>
		//   12   26:ldc1            #32  <Int 0x7f0f043f>
		//   13   28:invokevirtual   #36  <Method void BaseRobotLanguageListActivity.g(int)>
				return;
		//   14   31:return          
			}
		}

		final BaseRobotLanguageListActivity a;
		private LanguagePack b;

		public a(LanguagePack languagepack)
		{
			a = BaseRobotLanguageListActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field BaseRobotLanguageListActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
			b = languagepack;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field LanguagePack b>
		//    8   14:return          
		}
	}


	public BaseRobotLanguageListActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void BaseFragmentActivity()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #43  <Field AlertDialog a>
		b = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #45  <Field boolean b>
	//    8   14:return          
	}

	public void a(RobotLanguage robotlanguage)
	{
		if(m == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field RobotPreferences m>
	//*   2    4:ifnonnull       35
		{
			m = new RobotPreferences();
	//    3    7:aload_0         
	//    4    8:new             #51  <Class RobotPreferences>
	//    5   11:dup             
	//    6   12:invokespecial   #52  <Method void RobotPreferences()>
	//    7   15:putfield        #49  <Field RobotPreferences m>
			m.a(com.irobot.home.util.j.o(d).a());
	//    8   18:aload_0         
	//    9   19:getfield        #49  <Field RobotPreferences m>
	//   10   22:aload_0         
	//   11   23:getfield        #54  <Field String d>
	//   12   26:invokestatic    #59  <Method Robot j.o(String)>
	//   13   29:invokevirtual   #64  <Method RobotPreferences Robot.a()>
	//   14   32:invokevirtual   #67  <Method void RobotPreferences.a(RobotPreferences)>
		}
		if(robotlanguage != null)
	//*  15   35:aload_1         
	//*  16   36:ifnull          98
		{
			b = true;
	//   17   39:aload_0         
	//   18   40:iconst_1        
	//   19   41:putfield        #45  <Field boolean b>
			m.a(robotlanguage.a);
	//   20   44:aload_0         
	//   21   45:getfield        #49  <Field RobotPreferences m>
	//   22   48:aload_1         
	//   23   49:getfield        #71  <Field int RobotLanguage.a>
	//   24   52:invokevirtual   #74  <Method void RobotPreferences.a(int)>
			r.a(m);
	//   25   55:aload_0         
	//   26   56:getfield        #78  <Field b r>
	//   27   59:aload_0         
	//   28   60:getfield        #49  <Field RobotPreferences m>
	//   29   63:invokevirtual   #81  <Method void b.a(RobotPreferences)>
			com.irobot.home.util.j.a(((android.content.Context) (this)), 0x7f0f03f1, getString(0x7f0f0797, new Object[] {
				l, robotlanguage.a(false)
			}));
	//   30   66:aload_0         
	//   31   67:ldc1            #82  <Int 0x7f0f03f1>
	//   32   69:aload_0         
	//   33   70:ldc1            #83  <Int 0x7f0f0797>
	//   34   72:iconst_2        
	//   35   73:anewarray       Object[]
	//   36   76:dup             
	//   37   77:iconst_0        
	//   38   78:aload_0         
	//   39   79:getfield        #87  <Field String l>
	//   40   82:aastore         
	//   41   83:dup             
	//   42   84:iconst_1        
	//   43   85:aload_1         
	//   44   86:iconst_0        
	//   45   87:invokevirtual   #90  <Method String RobotLanguage.a(boolean)>
	//   46   90:aastore         
	//   47   91:invokevirtual   #94  <Method String getString(int, Object[])>
	//   48   94:invokestatic    #97  <Method void j.a(android.content.Context, int, String)>
			return;
	//   49   97:return          
		} else
		{
			com.irobot.home.util.j.a(6, "updateRobotWithSelectedLanguage called with null robotLanguage");
	//   50   98:bipush          6
	//   51  100:ldc1            #99  <String "updateRobotWithSelectedLanguage called with null robotLanguage">
	//   52  102:invokestatic    #102 <Method void j.a(int, String)>
			com.irobot.home.util.o.e("RobotLanguageActivity", "updateRobotWithSelectedLanguage called with null robotLanguage");
	//   53  105:ldc1            #104 <String "RobotLanguageActivity">
	//   54  107:ldc1            #99  <String "updateRobotWithSelectedLanguage called with null robotLanguage">
	//   55  109:invokestatic    #109 <Method void o.e(String, String)>
			return;
	//   56  112:return          
		}
	}

	public void a(LanguagePack languagepack)
	{
		f(0x7f0f0289);
	//    0    0:aload_0         
	//    1    1:ldc1            #111 <Int 0x7f0f0289>
	//    2    3:invokevirtual   #113 <Method void f(int)>
	//    3    6:return          
	}

	public void a(boolean flag)
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #118 <Method boolean isFinishing()>
	//*   2    4:ifne            41
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #121 <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			if(t != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #123 <Field ProgressDialog t>
	//*   9   19:ifnull          41
			{
				if(flag)
	//*  10   22:iload_1         
	//*  11   23:ifeq            34
				{
					t.show();
	//   12   26:aload_0         
	//   13   27:getfield        #123 <Field ProgressDialog t>
	//   14   30:invokevirtual   #128 <Method void ProgressDialog.show()>
					return;
	//   15   33:return          
				}
				t.hide();
	//   16   34:aload_0         
	//   17   35:getfield        #123 <Field ProgressDialog t>
	//   18   38:invokevirtual   #131 <Method void ProgressDialog.hide()>
			}
		}
	//   19   41:return          
	}

	void e()
	{
		Robot robot = com.irobot.home.util.j.o(d);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field String d>
	//    2    4:invokestatic    #59  <Method Robot j.o(String)>
	//    3    7:astore_2        
		l = robot.i();
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #134 <Method String Robot.i()>
	//    7   13:putfield        #87  <Field String l>
		i = robot.j();
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #137 <Method int Robot.j()>
	//   11   21:putfield        #139 <Field int i>
		j = robot.k();
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #142 <Method RobotAvailableLanguages Robot.k()>
	//   15   29:putfield        #144 <Field RobotAvailableLanguages j>
		o = getCallingActivity().getClassName().equals(((Object) (((Class) (com/irobot/home/CustomerRegistrationActivity_)).getName())));
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:invokevirtual   #148 <Method ComponentName getCallingActivity()>
	//   19   37:invokevirtual   #153 <Method String ComponentName.getClassName()>
	//   20   40:ldc1            #155 <Class CustomerRegistrationActivity_>
	//   21   42:invokevirtual   #160 <Method String Class.getName()>
	//   22   45:invokevirtual   #166 <Method boolean String.equals(Object)>
	//   23   48:putfield        #168 <Field boolean o>
		int i1;
		if(o)
	//*  24   51:aload_0         
	//*  25   52:getfield        #168 <Field boolean o>
	//*  26   55:ifeq            69
			i1 = 0x7f0f0770;
	//   27   58:ldc1            #169 <Int 0x7f0f0770>
	//   28   60:istore_1        
		else
	//*  29   61:aload_0         
	//*  30   62:iload_1         
	//*  31   63:invokevirtual   #171 <Method void b(int)>
	//*  32   66:goto            75
			i1 = 0x7f0f0422;
	//   33   69:ldc1            #172 <Int 0x7f0f0422>
	//   34   71:istore_1        
		b(i1);
	//*  35   72:goto            61
		g.setVisibility(0);
	//   36   75:aload_0         
	//   37   76:getfield        #174 <Field ProgressBar g>
	//   38   79:iconst_0        
	//   39   80:invokevirtual   #179 <Method void ProgressBar.setVisibility(int)>
		f.setVisibility(8);
	//   40   83:aload_0         
	//   41   84:getfield        #181 <Field ListView f>
	//   42   87:bipush          8
	//   43   89:invokevirtual   #184 <Method void ListView.setVisibility(int)>
		h = com.irobot.home.util.j.i(((android.content.Context) (this)));
	//   44   92:aload_0         
	//   45   93:aload_0         
	//   46   94:invokestatic    #187 <Method CustomerCareRestClient j.i(android.content.Context)>
	//   47   97:putfield        #189 <Field CustomerCareRestClient h>
		f();
	//   48  100:aload_0         
	//   49  101:invokevirtual   #191 <Method void f()>
	//   50  104:return          
	}

	public void f()
	{
		if(n != null || !e)
			break MISSING_BLOCK_LABEL_99;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field LanguagePackList n>
	//    2    4:ifnonnull       99
	//    3    7:aload_0         
	//    4    8:getfield        #197 <Field boolean e>
	//    5   11:ifeq            99
		Robot robot = com.irobot.home.util.j.o(d);
	//    6   14:aload_0         
	//    7   15:getfield        #54  <Field String d>
	//    8   18:invokestatic    #59  <Method Robot j.o(String)>
	//    9   21:astore_1        
		if(robot == null)
	//*  10   22:aload_1         
	//*  11   23:ifnonnull       34
		{
			try
			{
				com.irobot.home.util.o.e("RobotLanguageActivity", "Null robot found in createAdapterWithAdditionalLanguages()");
	//   12   26:ldc1            #104 <String "RobotLanguageActivity">
	//   13   28:ldc1            #199 <String "Null robot found in createAdapterWithAdditionalLanguages()">
	//   14   30:invokestatic    #109 <Method void o.e(String, String)>
				return;
	//   15   33:return          
			}
	//*  16   34:aload_0         
	//*  17   35:aload_0         
	//*  18   36:getfield        #189 <Field CustomerCareRestClient h>
	//*  19   39:aload_0         
	//*  20   40:invokestatic    #202 <Method String j.h(android.content.Context)>
	//*  21   43:aload_1         
	//*  22   44:invokevirtual   #205 <Method String Robot.v()>
	//*  23   47:aload_1         
	//*  24   48:invokevirtual   #207 <Method int Robot.t()>
	//*  25   51:invokestatic    #211 <Method String String.valueOf(int)>
	//*  26   54:invokeinterface #217 <Method LanguagePackList CustomerCareRestClient.getLanguagePack(String, String, String)>
	//*  27   59:putfield        #195 <Field LanguagePackList n>
	//*  28   62:goto            99
			catch(Exception exception)
	//*  29   65:astore_1        
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   30   66:new             #219 <Class StringBuilder>
	//   31   69:dup             
	//   32   70:invokespecial   #220 <Method void StringBuilder()>
	//   33   73:astore_2        
				stringbuilder.append("Cannot retrieve additional languages: ");
	//   34   74:aload_2         
	//   35   75:ldc1            #222 <String "Cannot retrieve additional languages: ">
	//   36   77:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   37   80:pop             
				stringbuilder.append(exception.getMessage());
	//   38   81:aload_2         
	//   39   82:aload_1         
	//   40   83:invokevirtual   #229 <Method String Exception.getMessage()>
	//   41   86:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   42   89:pop             
				com.irobot.home.util.o.e("RobotLanguageActivity", stringbuilder.toString());
	//   43   90:ldc1            #104 <String "RobotLanguageActivity">
	//   44   92:aload_2         
	//   45   93:invokevirtual   #232 <Method String StringBuilder.toString()>
	//   46   96:invokestatic    #109 <Method void o.e(String, String)>
			}
			break MISSING_BLOCK_LABEL_99;
		}
		n = h.getLanguagePack(com.irobot.home.util.j.h(((android.content.Context) (this))), robot.v(), String.valueOf(robot.t()));
		g();
	//   47   99:aload_0         
	//   48  100:invokevirtual   #234 <Method void g()>
		return;
	//   49  103:return          
	}

	public void f(int i1)
	{
		t = new ProgressDialog(((android.content.Context) (this)));
	//    0    0:aload_0         
	//    1    1:new             #125 <Class ProgressDialog>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #237 <Method void ProgressDialog(android.content.Context)>
	//    5    9:putfield        #123 <Field ProgressDialog t>
		t.setMessage(((CharSequence) (getString(i1))));
	//    6   12:aload_0         
	//    7   13:getfield        #123 <Field ProgressDialog t>
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokevirtual   #239 <Method String getString(int)>
	//   11   21:invokevirtual   #243 <Method void ProgressDialog.setMessage(CharSequence)>
		t.setProgressStyle(0);
	//   12   24:aload_0         
	//   13   25:getfield        #123 <Field ProgressDialog t>
	//   14   28:iconst_0        
	//   15   29:invokevirtual   #246 <Method void ProgressDialog.setProgressStyle(int)>
		t.setCanceledOnTouchOutside(false);
	//   16   32:aload_0         
	//   17   33:getfield        #123 <Field ProgressDialog t>
	//   18   36:iconst_0        
	//   19   37:invokevirtual   #249 <Method void ProgressDialog.setCanceledOnTouchOutside(boolean)>
		t.setCancelable(false);
	//   20   40:aload_0         
	//   21   41:getfield        #123 <Field ProgressDialog t>
	//   22   44:iconst_0        
	//   23   45:invokevirtual   #252 <Method void ProgressDialog.setCancelable(boolean)>
		a(true);
	//   24   48:aload_0         
	//   25   49:iconst_1        
	//   26   50:invokevirtual   #254 <Method void a(boolean)>
	//   27   53:return          
	}

	public void g()
	{
label0:
		{
			ArrayList arraylist = new ArrayList();
	//    0    0:new             #256 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #257 <Method void ArrayList()>
	//    3    7:astore_3        
			if(!o)
	//*   4    8:aload_0         
	//*   5    9:getfield        #168 <Field boolean o>
	//*   6   12:ifne            35
				arraylist.add(((Object) (new s(getString(0x7f0f0400), ((Object) (null))))));
	//    7   15:aload_3         
	//    8   16:new             #259 <Class s>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:ldc2            #260 <Int 0x7f0f0400>
	//   12   24:invokevirtual   #239 <Method String getString(int)>
	//   13   27:aconst_null     
	//   14   28:invokespecial   #263 <Method void s(String, Object)>
	//   15   31:invokevirtual   #266 <Method boolean ArrayList.add(Object)>
	//   16   34:pop             
			int i1 = -1;
	//   17   35:iconst_m1       
	//   18   36:istore_1        
			Iterator iterator = j.a().iterator();
	//   19   37:aload_0         
	//   20   38:getfield        #144 <Field RobotAvailableLanguages j>
	//   21   41:invokevirtual   #271 <Method List RobotAvailableLanguages.a()>
	//   22   44:invokeinterface #277 <Method Iterator List.iterator()>
	//   23   49:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//   24   50:aload_2         
	//   25   51:invokeinterface #282 <Method boolean Iterator.hasNext()>
	//   26   56:ifeq            111
				RobotLanguage robotlanguage = (RobotLanguage)iterator.next();
	//   27   59:aload_2         
	//   28   60:invokeinterface #286 <Method Object Iterator.next()>
	//   29   65:checkcast       #69  <Class RobotLanguage>
	//   30   68:astore          4
				arraylist.add(((Object) (new s(robotlanguage.a(), ((Object) (robotlanguage))))));
	//   31   70:aload_3         
	//   32   71:new             #259 <Class s>
	//   33   74:dup             
	//   34   75:aload           4
	//   35   77:invokevirtual   #288 <Method String RobotLanguage.a()>
	//   36   80:aload           4
	//   37   82:invokespecial   #263 <Method void s(String, Object)>
	//   38   85:invokevirtual   #266 <Method boolean ArrayList.add(Object)>
	//   39   88:pop             
				if(robotlanguage.a == i)
	//*  40   89:aload           4
	//*  41   91:getfield        #71  <Field int RobotLanguage.a>
	//*  42   94:aload_0         
	//*  43   95:getfield        #139 <Field int i>
	//*  44   98:icmpne          50
					i1 = arraylist.size() - 1;
	//   45  101:aload_3         
	//   46  102:invokevirtual   #291 <Method int ArrayList.size()>
	//   47  105:iconst_1        
	//   48  106:isub            
	//   49  107:istore_1        
			} while(true);
	//   50  108:goto            50
			k = new p(((android.content.Context) (this)), arraylist, i1);
	//   51  111:aload_0         
	//   52  112:new             #293 <Class p>
	//   53  115:dup             
	//   54  116:aload_0         
	//   55  117:aload_3         
	//   56  118:iload_1         
	//   57  119:invokespecial   #296 <Method void p(android.content.Context, ArrayList, int)>
	//   58  122:putfield        #298 <Field p k>
			f.setAdapter(((android.widget.ListAdapter) (k)));
	//   59  125:aload_0         
	//   60  126:getfield        #181 <Field ListView f>
	//   61  129:aload_0         
	//   62  130:getfield        #298 <Field p k>
	//   63  133:invokevirtual   #302 <Method void ListView.setAdapter(android.widget.ListAdapter)>
			if(o)
	//*  64  136:aload_0         
	//*  65  137:getfield        #168 <Field boolean o>
	//*  66  140:ifeq            179
			{
				if(e)
	//*  67  143:aload_0         
	//*  68  144:getfield        #197 <Field boolean e>
	//*  69  147:ifeq            168
					f.addFooterView(getLayoutInflater().inflate(0x7f0b0134, ((android.view.ViewGroup) (null))));
	//   70  150:aload_0         
	//   71  151:getfield        #181 <Field ListView f>
	//   72  154:aload_0         
	//   73  155:invokevirtual   #306 <Method LayoutInflater getLayoutInflater()>
	//   74  158:ldc2            #307 <Int 0x7f0b0134>
	//   75  161:aconst_null     
	//   76  162:invokevirtual   #313 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   77  165:invokevirtual   #317 <Method void ListView.addFooterView(View)>
				f.setFooterDividersEnabled(false);
	//   78  168:aload_0         
	//   79  169:getfield        #181 <Field ListView f>
	//   80  172:iconst_0        
	//   81  173:invokevirtual   #320 <Method void ListView.setFooterDividersEnabled(boolean)>
				break label0;
	//   82  176:goto            373
			}
			if(n == null || n.languagePackItems.isEmpty())
				break label0;
	//   83  179:aload_0         
	//   84  180:getfield        #195 <Field LanguagePackList n>
	//   85  183:ifnull          373
	//   86  186:aload_0         
	//   87  187:getfield        #195 <Field LanguagePackList n>
	//   88  190:getfield        #326 <Field List LanguagePackList.languagePackItems>
	//   89  193:invokeinterface #329 <Method boolean List.isEmpty()>
	//   90  198:ifne            373
			arraylist.add(((Object) (new s(getString(0x7f0f0076), ((Object) (null))))));
	//   91  201:aload_3         
	//   92  202:new             #259 <Class s>
	//   93  205:dup             
	//   94  206:aload_0         
	//   95  207:ldc2            #330 <Int 0x7f0f0076>
	//   96  210:invokevirtual   #239 <Method String getString(int)>
	//   97  213:aconst_null     
	//   98  214:invokespecial   #263 <Method void s(String, Object)>
	//   99  217:invokevirtual   #266 <Method boolean ArrayList.add(Object)>
	//  100  220:pop             
			Iterator iterator2 = n.languagePackItems.iterator();
	//  101  221:aload_0         
	//  102  222:getfield        #195 <Field LanguagePackList n>
	//  103  225:getfield        #326 <Field List LanguagePackList.languagePackItems>
	//  104  228:invokeinterface #277 <Method Iterator List.iterator()>
	//  105  233:astore          4
label1:
			do
			{
				boolean flag;
				LanguagePack languagepack;
label2:
				{
					if(!iterator2.hasNext())
						break label1;
	//  106  235:aload           4
	//  107  237:invokeinterface #282 <Method boolean Iterator.hasNext()>
	//  108  242:ifeq            366
					languagepack = (LanguagePack)iterator2.next();
	//  109  245:aload           4
	//  110  247:invokeinterface #286 <Method Object Iterator.next()>
	//  111  252:checkcast       #332 <Class LanguagePack>
	//  112  255:astore          5
					for(Iterator iterator1 = j.a().iterator(); iterator1.hasNext();)
	//* 113  257:aload_0         
	//* 114  258:getfield        #144 <Field RobotAvailableLanguages j>
	//* 115  261:invokevirtual   #271 <Method List RobotAvailableLanguages.a()>
	//* 116  264:invokeinterface #277 <Method Iterator List.iterator()>
	//* 117  269:astore_2        
	//* 118  270:aload_2         
	//* 119  271:invokeinterface #282 <Method boolean Iterator.hasNext()>
	//* 120  276:ifeq            311
					{
						RobotLanguage robotlanguage1 = (RobotLanguage)iterator1.next();
	//  121  279:aload_2         
	//  122  280:invokeinterface #286 <Method Object Iterator.next()>
	//  123  285:checkcast       #69  <Class RobotLanguage>
	//  124  288:astore          6
						if(languagepack.lang.equals(((Object) (robotlanguage1.b))))
	//* 125  290:aload           5
	//* 126  292:getfield        #335 <Field String LanguagePack.lang>
	//* 127  295:aload           6
	//* 128  297:getfield        #337 <Field String RobotLanguage.b>
	//* 129  300:invokevirtual   #166 <Method boolean String.equals(Object)>
	//* 130  303:ifeq            270
						{
							flag = true;
	//  131  306:iconst_1        
	//  132  307:istore_1        
							break label2;
	//  133  308:goto            313
						}
					}

					flag = false;
	//  134  311:iconst_0        
	//  135  312:istore_1        
				}
				if(!flag)
	//* 136  313:iload_1         
	//* 137  314:ifne            235
				{
					String s1;
					if(languagepack.lang.equals("default"))
	//* 138  317:aload           5
	//* 139  319:getfield        #335 <Field String LanguagePack.lang>
	//* 140  322:ldc2            #339 <String "default">
	//* 141  325:invokevirtual   #166 <Method boolean String.equals(Object)>
	//* 142  328:ifeq            342
						s1 = getString(0x7f0f024b);
	//  143  331:aload_0         
	//  144  332:ldc2            #340 <Int 0x7f0f024b>
	//  145  335:invokevirtual   #239 <Method String getString(int)>
	//  146  338:astore_2        
					else
	//* 147  339:goto            348
						s1 = languagepack.getDisplayName();
	//  148  342:aload           5
	//  149  344:invokevirtual   #343 <Method String LanguagePack.getDisplayName()>
	//  150  347:astore_2        
					arraylist.add(((Object) (new s(s1, ((Object) (languagepack))))));
	//  151  348:aload_3         
	//  152  349:new             #259 <Class s>
	//  153  352:dup             
	//  154  353:aload_2         
	//  155  354:aload           5
	//  156  356:invokespecial   #263 <Method void s(String, Object)>
	//  157  359:invokevirtual   #266 <Method boolean ArrayList.add(Object)>
	//  158  362:pop             
				}
			} while(true);
	//  159  363:goto            235
			k.notifyDataSetChanged();
	//  160  366:aload_0         
	//  161  367:getfield        #298 <Field p k>
	//  162  370:invokevirtual   #346 <Method void p.notifyDataSetChanged()>
		}
		f.setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (this)));
	//  163  373:aload_0         
	//  164  374:getfield        #181 <Field ListView f>
	//  165  377:aload_0         
	//  166  378:invokevirtual   #350 <Method void ListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		f.setVisibility(0);
	//  167  381:aload_0         
	//  168  382:getfield        #181 <Field ListView f>
	//  169  385:iconst_0        
	//  170  386:invokevirtual   #184 <Method void ListView.setVisibility(int)>
		g.setVisibility(8);
	//  171  389:aload_0         
	//  172  390:getfield        #174 <Field ProgressBar g>
	//  173  393:bipush          8
	//  174  395:invokevirtual   #179 <Method void ProgressBar.setVisibility(int)>
	//  175  398:return          
	}

	protected void g(int i1)
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #118 <Method boolean isFinishing()>
	//*   2    4:ifne            80
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #121 <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			a(false);
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #254 <Method void a(boolean)>
			if(a == null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #43  <Field AlertDialog a>
	//*  12   24:ifnonnull       42
				a = (new android.app.AlertDialog.Builder(((android.content.Context) (this)))).create();
	//   13   27:aload_0         
	//   14   28:new             #352 <Class android.app.AlertDialog$Builder>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #353 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   18   36:invokevirtual   #357 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   19   39:putfield        #43  <Field AlertDialog a>
			a.setMessage(((CharSequence) (getString(i1))));
	//   20   42:aload_0         
	//   21   43:getfield        #43  <Field AlertDialog a>
	//   22   46:aload_0         
	//   23   47:iload_1         
	//   24   48:invokevirtual   #239 <Method String getString(int)>
	//   25   51:invokevirtual   #360 <Method void AlertDialog.setMessage(CharSequence)>
			a.setButton(-1, ((CharSequence) (getString(0x7f0f05bb))), (android.content.DialogInterface.OnClickListener)null);
	//   26   54:aload_0         
	//   27   55:getfield        #43  <Field AlertDialog a>
	//   28   58:iconst_m1       
	//   29   59:aload_0         
	//   30   60:ldc2            #361 <Int 0x7f0f05bb>
	//   31   63:invokevirtual   #239 <Method String getString(int)>
	//   32   66:aconst_null     
	//   33   67:checkcast       #363 <Class android.content.DialogInterface$OnClickListener>
	//   34   70:invokevirtual   #367 <Method void AlertDialog.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener)>
			a.show();
	//   35   73:aload_0         
	//   36   74:getfield        #43  <Field AlertDialog a>
	//   37   77:invokevirtual   #368 <Method void AlertDialog.show()>
		}
	//   38   80:return          
	}

	public void h(int i1)
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #118 <Method boolean isFinishing()>
	//*   2    4:ifne            40
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #121 <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			if(t != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #123 <Field ProgressDialog t>
	//*   9   19:ifnull          35
			{
				t.setMessage(((CharSequence) (getString(i1))));
	//   10   22:aload_0         
	//   11   23:getfield        #123 <Field ProgressDialog t>
	//   12   26:aload_0         
	//   13   27:iload_1         
	//   14   28:invokevirtual   #239 <Method String getString(int)>
	//   15   31:invokevirtual   #243 <Method void ProgressDialog.setMessage(CharSequence)>
				return;
	//   16   34:return          
			}
			f(i1);
	//   17   35:aload_0         
	//   18   36:iload_1         
	//   19   37:invokevirtual   #113 <Method void f(int)>
		}
	//   20   40:return          
	}

	public boolean h()
	{
		Object obj = ((Object) (com.irobot.home.util.j.o(d)));
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field String d>
	//    2    4:invokestatic    #59  <Method Robot j.o(String)>
	//    3    7:astore_1        
		if(obj == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       48
		{
			obj = ((Object) (new StringBuilder()));
	//    6   12:new             #219 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #220 <Method void StringBuilder()>
	//    9   19:astore_1        
			((StringBuilder) (obj)).append("Null robot encountered");
	//   10   20:aload_1         
	//   11   21:ldc2            #370 <String "Null robot encountered">
	//   12   24:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
			((StringBuilder) (obj)).append(d);
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #54  <Field String d>
	//   17   33:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			com.irobot.home.util.o.e("RobotLanguageActivity", ((StringBuilder) (obj)).toString());
	//   19   37:ldc1            #104 <String "RobotLanguageActivity">
	//   20   39:aload_1         
	//   21   40:invokevirtual   #232 <Method String StringBuilder.toString()>
	//   22   43:invokestatic    #109 <Method void o.e(String, String)>
			return false;
	//   23   46:iconst_0        
	//   24   47:ireturn         
		} else
		{
			return ((Robot) (obj)).e();
	//   25   48:aload_1         
	//   26   49:invokevirtual   #372 <Method boolean Robot.e()>
	//   27   52:ireturn         
		}
	}

	public void onBackPressed()
	{
		if(m != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field RobotPreferences m>
	//*   2    4:ifnull          85
		{
			Intent intent = null;
	//    3    7:aconst_null     
	//    4    8:astore_2        
			Iterator iterator = j.a().iterator();
	//    5    9:aload_0         
	//    6   10:getfield        #144 <Field RobotAvailableLanguages j>
	//    7   13:invokevirtual   #271 <Method List RobotAvailableLanguages.a()>
	//    8   16:invokeinterface #277 <Method Iterator List.iterator()>
	//    9   21:astore_3        
			RobotLanguage robotlanguage;
			do
			{
				robotlanguage = ((RobotLanguage) (intent));
	//   10   22:aload_2         
	//   11   23:astore_1        
				if(!iterator.hasNext())
					break;
	//   12   24:aload_3         
	//   13   25:invokeinterface #282 <Method boolean Iterator.hasNext()>
	//   14   30:ifeq            57
				robotlanguage = (RobotLanguage)iterator.next();
	//   15   33:aload_3         
	//   16   34:invokeinterface #286 <Method Object Iterator.next()>
	//   17   39:checkcast       #69  <Class RobotLanguage>
	//   18   42:astore_1        
			} while(robotlanguage.a != m.c());
	//   19   43:aload_1         
	//   20   44:getfield        #71  <Field int RobotLanguage.a>
	//   21   47:aload_0         
	//   22   48:getfield        #49  <Field RobotPreferences m>
	//   23   51:invokevirtual   #375 <Method int RobotPreferences.c()>
	//   24   54:icmpne          22
			intent = new Intent();
	//   25   57:new             #377 <Class Intent>
	//   26   60:dup             
	//   27   61:invokespecial   #378 <Method void Intent()>
	//   28   64:astore_2        
			intent.putExtra("result", ((android.os.Parcelable) (robotlanguage)));
	//   29   65:aload_2         
	//   30   66:ldc2            #380 <String "result">
	//   31   69:aload_1         
	//   32   70:invokevirtual   #384 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   33   73:pop             
			setResult(-1, intent);
	//   34   74:aload_0         
	//   35   75:iconst_m1       
	//   36   76:aload_2         
	//   37   77:invokevirtual   #388 <Method void setResult(int, Intent)>
			finish();
	//   38   80:aload_0         
	//   39   81:invokevirtual   #391 <Method void finish()>
			return;
	//   40   84:return          
		} else
		{
			super.onBackPressed();
	//   41   85:aload_0         
	//   42   86:invokespecial   #393 <Method void BaseFragmentActivity.onBackPressed()>
			return;
	//   43   89:return          
		}
	}

	protected void onDestroy()
	{
		if(t != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #123 <Field ProgressDialog t>
	//*   2    4:ifnull          19
		{
			t.dismiss();
	//    3    7:aload_0         
	//    4    8:getfield        #123 <Field ProgressDialog t>
	//    5   11:invokevirtual   #397 <Method void ProgressDialog.dismiss()>
			t = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #123 <Field ProgressDialog t>
		}
		if(a != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #43  <Field AlertDialog a>
	//*  11   23:ifnull          38
		{
			a.dismiss();
	//   12   26:aload_0         
	//   13   27:getfield        #43  <Field AlertDialog a>
	//   14   30:invokevirtual   #398 <Method void AlertDialog.dismiss()>
			a = null;
	//   15   33:aload_0         
	//   16   34:aconst_null     
	//   17   35:putfield        #43  <Field AlertDialog a>
		}
		super.onDestroy();
	//   18   38:aload_0         
	//   19   39:invokespecial   #400 <Method void BaseFragmentActivity.onDestroy()>
	//   20   42:return          
	}

	public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
	{
		if(k.a(i1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #298 <Field p k>
	//*   2    4:iload_3         
	//*   3    5:invokevirtual   #405 <Method boolean p.a(int)>
	//*   4    8:ifeq            30
		{
			k.notifyDataSetChanged();
	//    5   11:aload_0         
	//    6   12:getfield        #298 <Field p k>
	//    7   15:invokevirtual   #346 <Method void p.notifyDataSetChanged()>
			a(k.a());
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #298 <Field p k>
	//   11   23:invokevirtual   #408 <Method RobotLanguage p.a()>
	//   12   26:invokevirtual   #410 <Method void a(RobotLanguage)>
			return;
	//   13   29:return          
		}
		if(i1 > j.b())
	//*  14   30:iload_3         
	//*  15   31:aload_0         
	//*  16   32:getfield        #144 <Field RobotAvailableLanguages j>
	//*  17   35:invokevirtual   #412 <Method int RobotAvailableLanguages.b()>
	//*  18   38:icmple          210
		{
			adapterview = ((AdapterView) (k.getItem(i1)));
	//   19   41:aload_0         
	//   20   42:getfield        #298 <Field p k>
	//   21   45:iload_3         
	//   22   46:invokevirtual   #416 <Method Object p.getItem(int)>
	//   23   49:astore_1        
			if(adapterview instanceof s)
	//*  24   50:aload_1         
	//*  25   51:instanceof      #259 <Class s>
	//*  26   54:ifeq            168
			{
				adapterview = ((AdapterView) ((s)adapterview));
	//   27   57:aload_1         
	//   28   58:checkcast       #259 <Class s>
	//   29   61:astore_1        
				if(((s) (adapterview)).a == com.irobot.home.model.s.a.DOWNLOADABLE_LANGUAGE && (((s) (adapterview)).c instanceof LanguagePack))
	//*  30   62:aload_1         
	//*  31   63:getfield        #419 <Field com.irobot.home.model.s$a s.a>
	//*  32   66:getstatic       #424 <Field com.irobot.home.model.s$a com.irobot.home.model.s$a.DOWNLOADABLE_LANGUAGE>
	//*  33   69:if_acmpne       133
	//*  34   72:aload_1         
	//*  35   73:getfield        #427 <Field Object s.c>
	//*  36   76:instanceof      #332 <Class LanguagePack>
	//*  37   79:ifeq            133
				{
					adapterview = ((AdapterView) ((LanguagePack)((s) (adapterview)).c));
	//   38   82:aload_1         
	//   39   83:getfield        #427 <Field Object s.c>
	//   40   86:checkcast       #332 <Class LanguagePack>
	//   41   89:astore_1        
					(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(0x7f0f0283).setPositiveButton(0x7f0f03fc, ((android.content.DialogInterface.OnClickListener) (new a(((LanguagePack) (adapterview)))))).setNegativeButton(0x7f0f017d, ((android.content.DialogInterface.OnClickListener) (null))).create().show();
	//   42   90:new             #352 <Class android.app.AlertDialog$Builder>
	//   43   93:dup             
	//   44   94:aload_0         
	//   45   95:invokespecial   #353 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   46   98:ldc2            #428 <Int 0x7f0f0283>
	//   47  101:invokevirtual   #431 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   48  104:ldc2            #432 <Int 0x7f0f03fc>
	//   49  107:new             #8   <Class BaseRobotLanguageListActivity$a>
	//   50  110:dup             
	//   51  111:aload_0         
	//   52  112:aload_1         
	//   53  113:invokespecial   #435 <Method void BaseRobotLanguageListActivity$a(BaseRobotLanguageListActivity, LanguagePack)>
	//   54  116:invokevirtual   #439 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   55  119:ldc2            #440 <Int 0x7f0f017d>
	//   56  122:aconst_null     
	//   57  123:invokevirtual   #443 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   58  126:invokevirtual   #357 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   59  129:invokevirtual   #368 <Method void AlertDialog.show()>
					return;
	//   60  132:return          
				} else
				{
					view = ((View) (new StringBuilder()));
	//   61  133:new             #219 <Class StringBuilder>
	//   62  136:dup             
	//   63  137:invokespecial   #220 <Method void StringBuilder()>
	//   64  140:astore_2        
					((StringBuilder) (view)).append("Could not convert languageUIItem data to language pack for languageUIItem with text: ");
	//   65  141:aload_2         
	//   66  142:ldc2            #445 <String "Could not convert languageUIItem data to language pack for languageUIItem with text: ">
	//   67  145:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   68  148:pop             
					((StringBuilder) (view)).append(((s) (adapterview)).b);
	//   69  149:aload_2         
	//   70  150:aload_1         
	//   71  151:getfield        #446 <Field String s.b>
	//   72  154:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   73  157:pop             
					com.irobot.home.util.o.e("RobotLanguageActivity", ((StringBuilder) (view)).toString());
	//   74  158:ldc1            #104 <String "RobotLanguageActivity">
	//   75  160:aload_2         
	//   76  161:invokevirtual   #232 <Method String StringBuilder.toString()>
	//   77  164:invokestatic    #109 <Method void o.e(String, String)>
					return;
	//   78  167:return          
				}
			}
			adapterview = ((AdapterView) (new StringBuilder()));
	//   79  168:new             #219 <Class StringBuilder>
	//   80  171:dup             
	//   81  172:invokespecial   #220 <Method void StringBuilder()>
	//   82  175:astore_1        
			((StringBuilder) (adapterview)).append("Could not get a valid cell from the adapter for position: ");
	//   83  176:aload_1         
	//   84  177:ldc2            #448 <String "Could not get a valid cell from the adapter for position: ">
	//   85  180:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   86  183:pop             
			((StringBuilder) (adapterview)).append(String.valueOf(i1));
	//   87  184:aload_1         
	//   88  185:iload_3         
	//   89  186:invokestatic    #211 <Method String String.valueOf(int)>
	//   90  189:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   91  192:pop             
			((StringBuilder) (adapterview)).append(".");
	//   92  193:aload_1         
	//   93  194:ldc2            #450 <String ".">
	//   94  197:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   95  200:pop             
			com.irobot.home.util.o.e("RobotLanguageActivity", ((StringBuilder) (adapterview)).toString());
	//   96  201:ldc1            #104 <String "RobotLanguageActivity">
	//   97  203:aload_1         
	//   98  204:invokevirtual   #232 <Method String StringBuilder.toString()>
	//   99  207:invokestatic    #109 <Method void o.e(String, String)>
		}
	//  100  210:return          
	}

	protected AlertDialog a;
	protected boolean b;
	IRobotApplication c;
	String d;
	boolean e;
	ListView f;
	ProgressBar g;
	CustomerCareRestClient h;
	protected int i;
	protected RobotAvailableLanguages j;
	private p k;
	private String l;
	private RobotPreferences m;
	private LanguagePackList n;
	private boolean o;
	private ProgressDialog t;
}
