// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.AssetCapabilityUtils;
import com.irobot.core.AssetInfo;
import com.irobot.core.HelpDocumentType;
import com.irobot.core.HelpVideoType;
import com.irobot.home.model.a;
import com.irobot.home.model.rest.HelpInfo;
import com.irobot.home.rest.CustomerCareRestClient;
import com.irobot.home.util.j;
import com.irobot.home.util.k;
import com.irobot.home.util.o;
import com.irobot.home.util.q;
import com.irobot.home.view.CustomButton;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.c.f.a.b;
import org.c.f.a.d;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, QuestionsListActivity_, VideoViewActivity_, ContactTableViewActivity_

public class BaseHelpTableActivity extends BaseFragmentActivity
{

	public BaseHelpTableActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void BaseFragmentActivity()>
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class BaseHelpTableActivity>
	//    4    7:invokevirtual   #41  <Method String Class.getSimpleName()>
	//    5   10:putfield        #43  <Field String t>
		o = null;
	//    6   13:aload_0         
	//    7   14:aconst_null     
	//    8   15:putfield        #45  <Field android.content.DialogInterface$OnClickListener o>
	//    9   18:return          
	}

	private void a(HelpDocumentType helpdocumenttype)
	{
		AssetInfo assetinfo = com.irobot.home.util.j.a(l).a();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String l>
	//    2    4:invokestatic    #54  <Method a j.a(String)>
	//    3    7:invokevirtual   #59  <Method AssetInfo a.a()>
	//    4   10:astore_2        
		AnalyticsSubsystem.getInstance().trackHelpDocumentViewed(assetinfo, helpdocumenttype);
	//    5   11:invokestatic    #65  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    6   14:aload_2         
	//    7   15:aload_1         
	//    8   16:invokevirtual   #69  <Method void AnalyticsSubsystem.trackHelpDocumentViewed(AssetInfo, HelpDocumentType)>
	//    9   19:return          
	}

	private void a(HelpVideoType helpvideotype)
	{
		AssetInfo assetinfo = com.irobot.home.util.j.a(l).a();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String l>
	//    2    4:invokestatic    #54  <Method a j.a(String)>
	//    3    7:invokevirtual   #59  <Method AssetInfo a.a()>
	//    4   10:astore_2        
		AnalyticsSubsystem.getInstance().trackHelpVideoWatched(assetinfo, helpvideotype);
	//    5   11:invokestatic    #65  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    6   14:aload_2         
	//    7   15:aload_1         
	//    8   16:invokevirtual   #74  <Method void AnalyticsSubsystem.trackHelpVideoWatched(AssetInfo, HelpVideoType)>
	//    9   19:return          
	}

	protected void a(String s)
	{
		int i1;
		if(!com.irobot.home.util.j.a())
	//*   0    0:invokestatic    #78  <Method boolean j.a()>
	//*   1    3:ifne            15
		{
			i1 = 0x7f0f04db;
	//    2    6:ldc1            #79  <Int 0x7f0f04db>
	//    3    8:istore_2        
		} else
	//*   4    9:aload_0         
	//*   5   10:iload_2         
	//*   6   11:invokevirtual   #82  <Method void h(int)>
	//*   7   14:return          
		{
			if(!TextUtils.isEmpty(((CharSequence) (s))) && !this.s.a("android.permission.WRITE_EXTERNAL_STORAGE"))
	//*   8   15:aload_1         
	//*   9   16:invokestatic    #88  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  10   19:ifne            43
	//*  11   22:aload_0         
	//*  12   23:getfield        #92  <Field com.irobot.home.p.a s>
	//*  13   26:ldc1            #94  <String "android.permission.WRITE_EXTERNAL_STORAGE">
	//*  14   28:invokevirtual   #99  <Method boolean com.irobot.home.p.a.a(String)>
	//*  15   31:ifeq            37
	//*  16   34:goto            43
			{
				q.a(((android.content.Context) (this)), s);
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:invokestatic    #104 <Method void q.a(android.content.Context, String)>
				return;
	//   20   42:return          
			}
			i1 = 0x7f0f0607;
	//   21   43:ldc1            #105 <Int 0x7f0f0607>
	//   22   45:istore_2        
		}
		h(i1);
	//*  23   46:goto            9
	}

	protected void e()
	{
		s.a(new String[] {
			"android.permission.WRITE_EXTERNAL_STORAGE"
		});
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field com.irobot.home.p.a s>
	//    2    4:iconst_1        
	//    3    5:anewarray       String[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #94  <String "android.permission.WRITE_EXTERNAL_STORAGE">
	//    7   12:aastore         
	//    8   13:invokevirtual   #110 <Method void com.irobot.home.p.a.a(String[])>
		n = com.irobot.home.util.j.i(((android.content.Context) (this)));
	//    9   16:aload_0         
	//   10   17:aload_0         
	//   11   18:invokestatic    #113 <Method CustomerCareRestClient j.i(android.content.Context)>
	//   12   21:putfield        #115 <Field CustomerCareRestClient n>
		b(0x7f0f0356);
	//   13   24:aload_0         
	//   14   25:ldc1            #116 <Int 0x7f0f0356>
	//   15   27:invokevirtual   #118 <Method void b(int)>
		f();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #120 <Method void f()>
	//   18   34:return          
	}

	public void f()
	{
		try
		{
			Locale locale = Locale.getDefault();
	//    0    0:invokestatic    #128 <Method Locale Locale.getDefault()>
	//    1    3:astore_3        
			a a1 = com.irobot.home.util.j.a(l);
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field String l>
	//    4    8:invokestatic    #54  <Method a j.a(String)>
	//    5   11:astore          4
			m = n.getHelpInfo(com.irobot.home.util.j.a(locale), com.irobot.home.util.j.h(((android.content.Context) (this))), a1.a().getSku());
	//    6   13:aload_0         
	//    7   14:aload_0         
	//    8   15:getfield        #115 <Field CustomerCareRestClient n>
	//    9   18:aload_3         
	//   10   19:invokestatic    #131 <Method String j.a(Locale)>
	//   11   22:aload_0         
	//   12   23:invokestatic    #134 <Method String j.h(android.content.Context)>
	//   13   26:aload           4
	//   14   28:invokevirtual   #59  <Method AssetInfo a.a()>
	//   15   31:invokevirtual   #139 <Method String AssetInfo.getSku()>
	//   16   34:invokeinterface #145 <Method HelpInfo CustomerCareRestClient.getHelpInfo(String, String, String)>
	//   17   39:putfield        #147 <Field HelpInfo m>
			p();
	//   18   42:aload_0         
	//   19   43:invokevirtual   #150 <Method void p()>
			return;
	//   20   46:return          
		}
		catch(Exception exception)
	//*  21   47:astore_3        
		{
			boolean flag = com.irobot.home.util.j.a();
	//   22   48:invokestatic    #78  <Method boolean j.a()>
	//   23   51:istore_2        
			int i1 = 0x7f0f0925;
	//   24   52:ldc1            #151 <Int 0x7f0f0925>
	//   25   54:istore_1        
			if(!flag)
	//*  26   55:iload_2         
	//*  27   56:ifne            65
				i1 = 0x7f0f04db;
	//   28   59:ldc1            #79  <Int 0x7f0f04db>
	//   29   61:istore_1        
			else
	//*  30   62:goto            85
			if(!(exception instanceof b) && (exception instanceof d))
	//*  31   65:aload_3         
	//*  32   66:instanceof      #153 <Class b>
	//*  33   69:ifeq            75
	//*  34   72:goto            85
	//*  35   75:aload_3         
	//*  36   76:instanceof      #155 <Class d>
	//*  37   79:ifeq            85
				i1 = 0x7f0f01d9;
	//   38   82:ldc1            #156 <Int 0x7f0f01d9>
	//   39   84:istore_1        
			f(i1);
	//   40   85:aload_0         
	//   41   86:iload_1         
	//   42   87:invokevirtual   #158 <Method void f(int)>
			String s = t;
	//   43   90:aload_0         
	//   44   91:getfield        #43  <Field String t>
	//   45   94:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   46   96:new             #160 <Class StringBuilder>
	//   47   99:dup             
	//   48  100:invokespecial   #161 <Method void StringBuilder()>
	//   49  103:astore          5
			stringbuilder.append("Error in requestHelpInfo: ");
	//   50  105:aload           5
	//   51  107:ldc1            #163 <String "Error in requestHelpInfo: ">
	//   52  109:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   53  112:pop             
			stringbuilder.append(exception.getMessage());
	//   54  113:aload           5
	//   55  115:aload_3         
	//   56  116:invokevirtual   #170 <Method String Exception.getMessage()>
	//   57  119:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   58  122:pop             
			com.irobot.home.util.o.e(s, stringbuilder.toString());
	//   59  123:aload           4
	//   60  125:aload           5
	//   61  127:invokevirtual   #173 <Method String StringBuilder.toString()>
	//   62  130:invokestatic    #178 <Method void o.e(String, String)>
			return;
	//   63  133:return          
		}
	}

	public void f(int i1)
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #181 <Method boolean isFinishing()>
	//*   2    4:ifne            48
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #184 <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(i1).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

				public void onDismiss(DialogInterface dialoginterface)
				{
					a.finish();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BaseHelpTableActivity a>
				//    2    4:invokevirtual   #26  <Method void BaseHelpTableActivity.finish()>
				//    3    7:return          
				}

				final BaseHelpTableActivity a;

			
			{
				a = BaseHelpTableActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BaseHelpTableActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
).show();
	//    7   15:new             #186 <Class android.app.AlertDialog$Builder>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #189 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   11   23:iload_1         
	//   12   24:invokevirtual   #193 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   13   27:ldc1            #194 <Int 0x7f0f05bb>
	//   14   29:aconst_null     
	//   15   30:invokevirtual   #198 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   16   33:new             #8   <Class BaseHelpTableActivity$2>
	//   17   36:dup             
	//   18   37:aload_0         
	//   19   38:invokespecial   #201 <Method void BaseHelpTableActivity$2(BaseHelpTableActivity)>
	//   20   41:invokevirtual   #205 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnDismissListener(android.content.DialogInterface$OnDismissListener)>
	//   21   44:invokevirtual   #209 <Method AlertDialog android.app.AlertDialog$Builder.show()>
	//   22   47:pop             
		}
	//   23   48:return          
	}

	protected String g(int i1)
	{
		if(m != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #147 <Field HelpInfo m>
	//*   2    4:ifnull          56
		{
			Object obj = ((Object) (m.guidedTourPages));
	//    3    7:aload_0         
	//    4    8:getfield        #147 <Field HelpInfo m>
	//    5   11:getfield        #216 <Field List HelpInfo.guidedTourPages>
	//    6   14:astore_2        
			if(obj != null && i1 < ((List) (obj)).size())
	//*   7   15:aload_2         
	//*   8   16:ifnull          56
	//*   9   19:iload_1         
	//*  10   20:aload_2         
	//*  11   21:invokeinterface #222 <Method int List.size()>
	//*  12   26:icmpge          56
			{
				obj = ((Object) ((Map)((List) (obj)).get(i1)));
	//   13   29:aload_2         
	//   14   30:iload_1         
	//   15   31:invokeinterface #226 <Method Object List.get(int)>
	//   16   36:checkcast       #228 <Class Map>
	//   17   39:astore_2        
				if(obj != null)
	//*  18   40:aload_2         
	//*  19   41:ifnull          56
					return (String)((Map) (obj)).get("video");
	//   20   44:aload_2         
	//   21   45:ldc1            #230 <String "video">
	//   22   47:invokeinterface #233 <Method Object Map.get(Object)>
	//   23   52:checkcast       #107 <Class String>
	//   24   55:areturn         
			}
		}
		return null;
	//   25   56:aconst_null     
	//   26   57:areturn         
	}

	protected void g()
	{
		com.irobot.home.QuestionsListActivity_.a(((android.content.Context) (this))).a(l).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #238 <Method QuestionsListActivity_$a com.irobot.home.QuestionsListActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field String l>
	//    4    8:invokevirtual   #243 <Method QuestionsListActivity_$a com.irobot.home.QuestionsListActivity_$a.a(String)>
	//    5   11:invokevirtual   #246 <Method org.androidannotations.api.a.e com.irobot.home.QuestionsListActivity_$a.a()>
	//    6   14:pop             
	//    7   15:return          
	}

	protected void h()
	{
		i(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #248 <Method void i(int)>
		a(HelpVideoType.Welcome);
	//    3    5:aload_0         
	//    4    6:getstatic       #254 <Field HelpVideoType HelpVideoType.Welcome>
	//    5    9:invokespecial   #256 <Method void a(HelpVideoType)>
	//    6   12:return          
	}

	public void h(int i1)
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #181 <Method boolean isFinishing()>
	//*   2    4:ifne            37
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #184 <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(i1).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    7   15:new             #186 <Class android.app.AlertDialog$Builder>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #189 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   11   23:iload_1         
	//   12   24:invokevirtual   #193 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   13   27:ldc1            #194 <Int 0x7f0f05bb>
	//   14   29:aconst_null     
	//   15   30:invokevirtual   #198 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   16   33:invokevirtual   #209 <Method AlertDialog android.app.AlertDialog$Builder.show()>
	//   17   36:pop             
		}
	//   18   37:return          
	}

	protected void i()
	{
		i(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #248 <Method void i(int)>
		a(HelpVideoType.OptimizingRoomba);
	//    3    5:aload_0         
	//    4    6:getstatic       #259 <Field HelpVideoType HelpVideoType.OptimizingRoomba>
	//    5    9:invokespecial   #256 <Method void a(HelpVideoType)>
	//    6   12:return          
	}

	protected void i(int i1)
	{
		int j1;
label0:
		{
			if(g(i1) != null)
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokevirtual   #261 <Method String g(int)>
	//*   3    5:ifnull          42
			{
				Intent intent = new Intent(((android.content.Context) (this)), com/irobot/home/VideoViewActivity_);
	//    4    8:new             #263 <Class Intent>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:ldc2            #265 <Class VideoViewActivity_>
	//    8   16:invokespecial   #268 <Method void Intent(android.content.Context, Class)>
	//    9   19:astore          4
				intent.putExtra("url", g(i1));
	//   10   21:aload           4
	//   11   23:ldc2            #270 <String "url">
	//   12   26:aload_0         
	//   13   27:iload_1         
	//   14   28:invokevirtual   #261 <Method String g(int)>
	//   15   31:invokevirtual   #274 <Method Intent Intent.putExtra(String, String)>
	//   16   34:pop             
				startActivity(intent);
	//   17   35:aload_0         
	//   18   36:aload           4
	//   19   38:invokevirtual   #278 <Method void startActivity(Intent)>
				return;
	//   20   41:return          
			}
			AssetInfo assetinfo = com.irobot.home.util.j.a(l).a();
	//   21   42:aload_0         
	//   22   43:getfield        #49  <Field String l>
	//   23   46:invokestatic    #54  <Method a j.a(String)>
	//   24   49:invokevirtual   #59  <Method AssetInfo a.a()>
	//   25   52:astore          6
			int k1 = 0x7f0f0969;
	//   26   54:ldc2            #279 <Int 0x7f0f0969>
	//   27   57:istore_3        
			j1 = k1;
	//   28   58:iload_3         
	//   29   59:istore_2        
			HelpVideoType helpvideotype;
			AnalyticsSubsystem analyticssubsystem;
			switch(i1)
	//*  30   60:iload_1         
			{
	//*  31   61:tableswitch     0 2: default 88
	//	               0 135
	//	               1 110
	//	               2 93
			default:
				j1 = k1;
	//   32   88:iload_3         
	//   33   89:istore_2        
				break label0;
	//   34   90:goto            135

			case 0: // '\0'
				break label0;

			case 2: // '\002'
				i1 = 0x7f0f0926;
	//   35   93:ldc2            #280 <Int 0x7f0f0926>
	//   36   96:istore_1        
				analyticssubsystem = AnalyticsSubsystem.getInstance();
	//   37   97:invokestatic    #65  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   38  100:astore          5
				helpvideotype = HelpVideoType.MaintainingRoomba;
	//   39  102:getstatic       #283 <Field HelpVideoType HelpVideoType.MaintainingRoomba>
	//   40  105:astore          4
				break;
	//   41  107:goto            124

			case 1: // '\001'
				i1 = 0x7f0f0927;
	//   42  110:ldc2            #284 <Int 0x7f0f0927>
	//   43  113:istore_1        
				analyticssubsystem = AnalyticsSubsystem.getInstance();
	//   44  114:invokestatic    #65  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   45  117:astore          5
				helpvideotype = HelpVideoType.OptimizingRoomba;
	//   46  119:getstatic       #259 <Field HelpVideoType HelpVideoType.OptimizingRoomba>
	//   47  122:astore          4
				break;
			}
			analyticssubsystem.trackHelpVideoWatched(assetinfo, helpvideotype);
	//   48  124:aload           5
	//   49  126:aload           6
	//   50  128:aload           4
	//   51  130:invokevirtual   #74  <Method void AnalyticsSubsystem.trackHelpVideoWatched(AssetInfo, HelpVideoType)>
			j1 = i1;
	//   52  133:iload_1         
	//   53  134:istore_2        
		}
		h(j1);
	//   54  135:aload_0         
	//   55  136:iload_2         
	//   56  137:invokevirtual   #82  <Method void h(int)>
		com.irobot.home.util.o.e(t, "Video url was null.");
	//   57  140:aload_0         
	//   58  141:getfield        #43  <Field String t>
	//   59  144:ldc2            #286 <String "Video url was null.">
	//   60  147:invokestatic    #178 <Method void o.e(String, String)>
	//   61  150:return          
	}

	protected void j()
	{
		i(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokevirtual   #248 <Method void i(int)>
		a(HelpVideoType.MaintainingRoomba);
	//    3    5:aload_0         
	//    4    6:getstatic       #283 <Field HelpVideoType HelpVideoType.MaintainingRoomba>
	//    5    9:invokespecial   #256 <Method void a(HelpVideoType)>
	//    6   12:return          
	}

	protected void j(int i1)
	{
		String s1 = getString(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #289 <Method String getString(int)>
	//    3    5:astore_3        
		String s = getString(0x7f0f05dc, new Object[] {
			s1
		});
	//    4    6:aload_0         
	//    5    7:ldc2            #290 <Int 0x7f0f05dc>
	//    6   10:iconst_1        
	//    7   11:anewarray       Object[]
	//    8   14:dup             
	//    9   15:iconst_0        
	//   10   16:aload_3         
	//   11   17:aastore         
	//   12   18:invokevirtual   #295 <Method String getString(int, Object[])>
	//   13   21:astore_2        
		s1 = getString(0x7f0f045a, new Object[] {
			s1
		});
	//   14   22:aload_0         
	//   15   23:ldc2            #296 <Int 0x7f0f045a>
	//   16   26:iconst_1        
	//   17   27:anewarray       Object[]
	//   18   30:dup             
	//   19   31:iconst_0        
	//   20   32:aload_3         
	//   21   33:aastore         
	//   22   34:invokevirtual   #295 <Method String getString(int, Object[])>
	//   23   37:astore_3        
		c.setText(((CharSequence) (s)));
	//   24   38:aload_0         
	//   25   39:getfield        #298 <Field CustomButton c>
	//   26   42:aload_2         
	//   27   43:invokevirtual   #304 <Method void CustomButton.setText(CharSequence)>
		c.setContentDescription(((CharSequence) (s)));
	//   28   46:aload_0         
	//   29   47:getfield        #298 <Field CustomButton c>
	//   30   50:aload_2         
	//   31   51:invokevirtual   #307 <Method void CustomButton.setContentDescription(CharSequence)>
		d.setText(((CharSequence) (s1)));
	//   32   54:aload_0         
	//   33   55:getfield        #309 <Field CustomButton d>
	//   34   58:aload_3         
	//   35   59:invokevirtual   #304 <Method void CustomButton.setText(CharSequence)>
		d.setContentDescription(((CharSequence) (s1)));
	//   36   62:aload_0         
	//   37   63:getfield        #309 <Field CustomButton d>
	//   38   66:aload_3         
	//   39   67:invokevirtual   #307 <Method void CustomButton.setContentDescription(CharSequence)>
	//   40   70:return          
	}

	protected void k()
	{
		com.irobot.home.ContactTableViewActivity_.a(((android.content.Context) (this))).a(l).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #314 <Method ContactTableViewActivity_$a com.irobot.home.ContactTableViewActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field String l>
	//    4    8:invokevirtual   #319 <Method ContactTableViewActivity_$a com.irobot.home.ContactTableViewActivity_$a.a(String)>
	//    5   11:invokevirtual   #320 <Method org.androidannotations.api.a.e com.irobot.home.ContactTableViewActivity_$a.a()>
	//    6   14:pop             
	//    7   15:return          
	}

	protected void l()
	{
		if(m != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #147 <Field HelpInfo m>
	//*   2    4:ifnull          25
		{
			a(m.warranty);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #147 <Field HelpInfo m>
	//    6   12:getfield        #323 <Field String HelpInfo.warranty>
	//    7   15:invokevirtual   #325 <Method void a(String)>
			a(HelpDocumentType.Warranty);
	//    8   18:aload_0         
	//    9   19:getstatic       #331 <Field HelpDocumentType HelpDocumentType.Warranty>
	//   10   22:invokespecial   #333 <Method void a(HelpDocumentType)>
		}
	//   11   25:return          
	}

	protected void m()
	{
		if(m != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #147 <Field HelpInfo m>
	//*   2    4:ifnull          25
		{
			a(m.ownersManual);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #147 <Field HelpInfo m>
	//    6   12:getfield        #336 <Field String HelpInfo.ownersManual>
	//    7   15:invokevirtual   #325 <Method void a(String)>
			a(HelpDocumentType.OwnersGuide);
	//    8   18:aload_0         
	//    9   19:getstatic       #339 <Field HelpDocumentType HelpDocumentType.OwnersGuide>
	//   10   22:invokespecial   #333 <Method void a(HelpDocumentType)>
		}
	//   11   25:return          
	}

	protected void n()
	{
		if(m != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #147 <Field HelpInfo m>
	//*   2    4:ifnull          25
		{
			a(m.quickStart);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #147 <Field HelpInfo m>
	//    6   12:getfield        #342 <Field String HelpInfo.quickStart>
	//    7   15:invokevirtual   #325 <Method void a(String)>
			a(HelpDocumentType.QuickStartGuide);
	//    8   18:aload_0         
	//    9   19:getstatic       #345 <Field HelpDocumentType HelpDocumentType.QuickStartGuide>
	//   10   22:invokespecial   #333 <Method void a(HelpDocumentType)>
		}
	//   11   25:return          
	}

	protected void o()
	{
		if(o == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field android.content.DialogInterface$OnClickListener o>
	//*   2    4:ifnonnull       18
		{
			com.irobot.home.util.o.e(t, "btnReactivateClick: No OnClickListener defined");
	//    3    7:aload_0         
	//    4    8:getfield        #43  <Field String t>
	//    5   11:ldc2            #347 <String "btnReactivateClick: No OnClickListener defined">
	//    6   14:invokestatic    #178 <Method void o.e(String, String)>
			return;
	//    7   17:return          
		} else
		{
			AlertDialog alertdialog = (new android.app.AlertDialog.Builder(((android.content.Context) (this)))).create();
	//    8   18:new             #186 <Class android.app.AlertDialog$Builder>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:invokespecial   #189 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   12   26:invokevirtual   #350 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   13   29:astore_1        
			alertdialog.setTitle(((CharSequence) (getResources().getString(0x7f0f0729))));
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:invokevirtual   #354 <Method Resources getResources()>
	//   17   35:ldc2            #355 <Int 0x7f0f0729>
	//   18   38:invokevirtual   #358 <Method String Resources.getString(int)>
	//   19   41:invokevirtual   #363 <Method void AlertDialog.setTitle(CharSequence)>
			alertdialog.setMessage(((CharSequence) (getResources().getString(0x7f0f072a))));
	//   20   44:aload_1         
	//   21   45:aload_0         
	//   22   46:invokevirtual   #354 <Method Resources getResources()>
	//   23   49:ldc2            #364 <Int 0x7f0f072a>
	//   24   52:invokevirtual   #358 <Method String Resources.getString(int)>
	//   25   55:invokevirtual   #366 <Method void AlertDialog.setMessage(CharSequence)>
			alertdialog.setCancelable(true);
	//   26   58:aload_1         
	//   27   59:iconst_1        
	//   28   60:invokevirtual   #370 <Method void AlertDialog.setCancelable(boolean)>
			alertdialog.setButton(-1, ((CharSequence) (getResources().getString(0x7f0f0986))), o);
	//   29   63:aload_1         
	//   30   64:iconst_m1       
	//   31   65:aload_0         
	//   32   66:invokevirtual   #354 <Method Resources getResources()>
	//   33   69:ldc2            #371 <Int 0x7f0f0986>
	//   34   72:invokevirtual   #358 <Method String Resources.getString(int)>
	//   35   75:aload_0         
	//   36   76:getfield        #45  <Field android.content.DialogInterface$OnClickListener o>
	//   37   79:invokevirtual   #375 <Method void AlertDialog.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener)>
			alertdialog.setButton(-2, ((CharSequence) (getResources().getString(0x7f0f04d3))), new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int i1)
				{
					dialoginterface.dismiss();
				//    0    0:aload_1         
				//    1    1:invokeinterface #27  <Method void DialogInterface.dismiss()>
				//    2    6:return          
				}

				final BaseHelpTableActivity a;

			
			{
				a = BaseHelpTableActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BaseHelpTableActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   38   82:aload_1         
	//   39   83:bipush          -2
	//   40   85:aload_0         
	//   41   86:invokevirtual   #354 <Method Resources getResources()>
	//   42   89:ldc2            #376 <Int 0x7f0f04d3>
	//   43   92:invokevirtual   #358 <Method String Resources.getString(int)>
	//   44   95:new             #6   <Class BaseHelpTableActivity$1>
	//   45   98:dup             
	//   46   99:aload_0         
	//   47  100:invokespecial   #377 <Method void BaseHelpTableActivity$1(BaseHelpTableActivity)>
	//   48  103:invokevirtual   #375 <Method void AlertDialog.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener)>
			alertdialog.show();
	//   49  106:aload_1         
	//   50  107:invokevirtual   #379 <Method void AlertDialog.show()>
			return;
	//   51  110:return          
		}
	}

	public void p()
	{
		Object obj = ((Object) (com.irobot.home.util.j.a(l).a()));
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String l>
	//    2    4:invokestatic    #54  <Method a j.a(String)>
	//    3    7:invokevirtual   #59  <Method AssetInfo a.a()>
	//    4   10:astore          4
		boolean flag;
		if(AssetCapabilityUtils.isCloudCapable(((AssetInfo) (obj))) && AssetCapabilityUtils.isMoppingRobot(((AssetInfo) (obj))))
	//*   5   12:aload           4
	//*   6   14:invokestatic    #385 <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//*   7   17:ifeq            33
	//*   8   20:aload           4
	//*   9   22:invokestatic    #388 <Method boolean AssetCapabilityUtils.isMoppingRobot(AssetInfo)>
	//*  10   25:ifeq            33
			flag = true;
	//   11   28:iconst_1        
	//   12   29:istore_1        
		else
	//*  13   30:goto            35
			flag = false;
	//   14   33:iconst_0        
	//   15   34:istore_1        
		obj = ((Object) (e));
	//   16   35:aload_0         
	//   17   36:getfield        #390 <Field CustomButton e>
	//   18   39:astore          4
		HelpInfo helpinfo = m;
	//   19   41:aload_0         
	//   20   42:getfield        #147 <Field HelpInfo m>
	//   21   45:astore          5
		byte byte1 = 8;
	//   22   47:bipush          8
	//   23   49:istore_3        
		byte byte0;
		if(helpinfo != null)
	//*  24   50:aload           5
	//*  25   52:ifnull          60
			byte0 = 0;
	//   26   55:iconst_0        
	//   27   56:istore_2        
		else
	//*  28   57:goto            63
			byte0 = 8;
	//   29   60:bipush          8
	//   30   62:istore_2        
		((CustomButton) (obj)).setVisibility(((int) (byte0)));
	//   31   63:aload           4
	//   32   65:iload_2         
	//   33   66:invokevirtual   #393 <Method void CustomButton.setVisibility(int)>
		obj = ((Object) (k));
	//   34   69:aload_0         
	//   35   70:getfield        #395 <Field View k>
	//   36   73:astore          4
		byte0 = byte1;
	//   37   75:iload_3         
	//   38   76:istore_2        
		if(m != null)
	//*  39   77:aload_0         
	//*  40   78:getfield        #147 <Field HelpInfo m>
	//*  41   81:ifnull          86
			byte0 = 0;
	//   42   84:iconst_0        
	//   43   85:istore_2        
		((View) (obj)).setVisibility(((int) (byte0)));
	//   44   86:aload           4
	//   45   88:iload_2         
	//   46   89:invokevirtual   #398 <Method void View.setVisibility(int)>
		if(!flag && m != null && m.guidedTourPages != null)
	//*  47   92:iload_1         
	//*  48   93:ifne            242
	//*  49   96:aload_0         
	//*  50   97:getfield        #147 <Field HelpInfo m>
	//*  51  100:ifnull          242
	//*  52  103:aload_0         
	//*  53  104:getfield        #147 <Field HelpInfo m>
	//*  54  107:getfield        #216 <Field List HelpInfo.guidedTourPages>
	//*  55  110:ifnull          242
		{
			for(int i1 = 0; i1 < m.guidedTourPages.size(); i1++)
	//*  56  113:iconst_0        
	//*  57  114:istore_1        
	//*  58  115:iload_1         
	//*  59  116:aload_0         
	//*  60  117:getfield        #147 <Field HelpInfo m>
	//*  61  120:getfield        #216 <Field List HelpInfo.guidedTourPages>
	//*  62  123:invokeinterface #222 <Method int List.size()>
	//*  63  128:icmpge          242
			{
				if(TextUtils.isEmpty(((CharSequence) (g(i1)))))
					continue;
	//   64  131:aload_0         
	//   65  132:iload_1         
	//   66  133:invokevirtual   #261 <Method String g(int)>
	//   67  136:invokestatic    #88  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   68  139:ifne            235
				View view;
				switch(i1)
	//*  69  142:iload_1         
				{
	//*  70  143:tableswitch     0 2: default 168
	//	               0 215
	//	               1 198
	//	               2 181
				default:
					com.irobot.home.util.o.e(t, "More help videos in list than expected");
	//   71  168:aload_0         
	//   72  169:getfield        #43  <Field String t>
	//   73  172:ldc2            #400 <String "More help videos in list than expected">
	//   74  175:invokestatic    #178 <Method void o.e(String, String)>
					continue;
	//   75  178:goto            235

				case 2: // '\002'
					d.setVisibility(0);
	//   76  181:aload_0         
	//   77  182:getfield        #309 <Field CustomButton d>
	//   78  185:iconst_0        
	//   79  186:invokevirtual   #393 <Method void CustomButton.setVisibility(int)>
					view = j;
	//   80  189:aload_0         
	//   81  190:getfield        #402 <Field View j>
	//   82  193:astore          4
					break;

	//*  83  195:goto            229
				case 1: // '\001'
					c.setVisibility(0);
	//   84  198:aload_0         
	//   85  199:getfield        #298 <Field CustomButton c>
	//   86  202:iconst_0        
	//   87  203:invokevirtual   #393 <Method void CustomButton.setVisibility(int)>
					view = i;
	//   88  206:aload_0         
	//   89  207:getfield        #404 <Field View i>
	//   90  210:astore          4
					break;

	//*  91  212:goto            229
				case 0: // '\0'
					b.setVisibility(0);
	//   92  215:aload_0         
	//   93  216:getfield        #406 <Field CustomButton b>
	//   94  219:iconst_0        
	//   95  220:invokevirtual   #393 <Method void CustomButton.setVisibility(int)>
					view = h;
	//   96  223:aload_0         
	//   97  224:getfield        #408 <Field View h>
	//   98  227:astore          4
					break;
				}
				view.setVisibility(0);
	//   99  229:aload           4
	//  100  231:iconst_0        
	//  101  232:invokevirtual   #398 <Method void View.setVisibility(int)>
			}

	//  102  235:iload_1         
	//  103  236:iconst_1        
	//  104  237:iadd            
	//  105  238:istore_1        
		}
	//* 106  239:goto            115
	//  107  242:return          
	}

	k a;
	protected CustomButton b;
	protected CustomButton c;
	protected CustomButton d;
	protected CustomButton e;
	protected CustomButton f;
	protected CustomButton g;
	protected View h;
	protected View i;
	protected View j;
	protected View k;
	protected String l;
	protected HelpInfo m;
	protected CustomerCareRestClient n;
	protected android.content.DialogInterface.OnClickListener o;
	private final String t = ((Class) (com/irobot/home/BaseHelpTableActivity)).getSimpleName();
}
