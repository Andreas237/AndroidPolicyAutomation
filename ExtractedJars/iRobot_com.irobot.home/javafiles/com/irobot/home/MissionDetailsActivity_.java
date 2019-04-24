// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.AppCompatSeekBar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.irobot.home.rest.CustomerCareRestClient_;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;
import com.irobot.home.view.WebViewLanguageCompat;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			MissionDetailsActivity, IRobotApplication_

public final class MissionDetailsActivity_ extends MissionDetailsActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(String s)
		{
			return (a)super.a("assetId", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "assetId">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class MissionDetailsActivity_$a>
		//    5   10:areturn         
		}

		public e a(int i)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i);
		//    3    7:aload_0         
		//    4    8:getfield        #27  <Field Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #31  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #37  <Method void Fragment.startActivityForResult(Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #39  <Field android.app.Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, i, a);
		//   13   29:aload_0         
		//   14   30:getfield        #39  <Field android.app.Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #31  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #42  <Field Bundle a>
		//   20   42:invokevirtual   #47  <Method void android.app.Fragment.startActivityForResult(Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #51  <Field Context b>
		//*  24   52:instanceof      #53  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, i, a);
		//   26   58:aload_0         
		//   27   59:getfield        #51  <Field Context b>
		//   28   62:checkcast       #53  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #31  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #42  <Field Bundle a>
		//   34   74:invokestatic    #58  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #51  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #31  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #42  <Field Bundle a>
		//   42   92:invokevirtual   #64  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #66  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #51  <Field Context b>
		//   47  103:invokespecial   #68  <Method void e(Context)>
		//   48  106:areturn         
		}

		public a b(int i)
		{
			return (a)super.a("missionId", i);
		//    0    0:aload_0         
		//    1    1:ldc1            #71  <String "missionId">
		//    2    3:iload_1         
		//    3    4:invokespecial   #74  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, int)>
		//    4    7:checkcast       #2   <Class MissionDetailsActivity_$a>
		//    5   10:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/MissionDetailsActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class MissionDetailsActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public MissionDetailsActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void MissionDetailsActivity()>
	//    2    4:aload_0         
	//    3    5:new             #47  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #48  <Method void c()>
	//    6   12:putfield        #50  <Field c Q>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #38  <Class MissionDetailsActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #55  <Method void MissionDetailsActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #59  <Method void c.a(b)>
		a = IRobotApplication_.r();
	//    2    4:aload_0         
	//    3    5:invokestatic    #65  <Method IRobotApplication IRobotApplication_.r()>
	//    4    8:putfield        #68  <Field IRobotApplication a>
		r();
	//    5   11:aload_0         
	//    6   12:invokespecial   #70  <Method void r()>
		O = ((com.irobot.home.rest.CustomerCareRestClient) (new CustomerCareRestClient_(((Context) (this)))));
	//    7   15:aload_0         
	//    8   16:new             #72  <Class CustomerCareRestClient_>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #73  <Method void CustomerCareRestClient_(Context)>
	//   12   24:putfield        #77  <Field com.irobot.home.rest.CustomerCareRestClient O>
	//   13   27:return          
	}

	static void a(MissionDetailsActivity_ missiondetailsactivity_)
	{
		((MissionDetailsActivity) (missiondetailsactivity_)).MissionDetailsActivity.a_();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void MissionDetailsActivity.a_()>
	//    2    4:return          
	}

	static void a(MissionDetailsActivity_ missiondetailsactivity_, Bitmap bitmap)
	{
		((MissionDetailsActivity) (missiondetailsactivity_)).com.irobot.home.MissionDetailsActivity.a(bitmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #85  <Method void com.irobot.home.MissionDetailsActivity.a(Bitmap)>
	//    3    5:return          
	}

	static void a(MissionDetailsActivity_ missiondetailsactivity_, String s)
	{
		((MissionDetailsActivity) (missiondetailsactivity_)).com.irobot.home.MissionDetailsActivity.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #89  <Method void com.irobot.home.MissionDetailsActivity.a(String)>
	//    3    5:return          
	}

	static void b(MissionDetailsActivity_ missiondetailsactivity_)
	{
		((MissionDetailsActivity) (missiondetailsactivity_)).MissionDetailsActivity.b_();
	//    0    0:aload_0         
	//    1    1:invokespecial   #93  <Method void MissionDetailsActivity.b_()>
	//    2    4:return          
	}

	static void c(MissionDetailsActivity_ missiondetailsactivity_)
	{
		((MissionDetailsActivity) (missiondetailsactivity_)).com.irobot.home.MissionDetailsActivity.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method void com.irobot.home.MissionDetailsActivity.c()>
	//    2    4:return          
	}

	static void d(MissionDetailsActivity_ missiondetailsactivity_)
	{
		((MissionDetailsActivity) (missiondetailsactivity_)).MissionDetailsActivity.p();
	//    0    0:aload_0         
	//    1    1:invokespecial   #100 <Method void MissionDetailsActivity.p()>
	//    2    4:return          
	}

	private void r()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #104 <Method Intent getIntent()>
	//    2    4:invokevirtual   #110 <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          69
		{
			if(bundle.containsKey("assetId"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #112 <String "assetId">
	//*   8   15:invokevirtual   #118 <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				b = bundle.getString("assetId");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #112 <String "assetId">
	//   13   25:invokevirtual   #122 <Method String Bundle.getString(String)>
	//   14   28:putfield        #125 <Field String b>
			if(bundle.containsKey("missionId"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #127 <String "missionId">
	//*  17   34:invokevirtual   #118 <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				c = bundle.getInt("missionId");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #127 <String "missionId">
	//   22   44:invokevirtual   #131 <Method int Bundle.getInt(String)>
	//   23   47:putfield        #134 <Field int c>
			if(bundle.containsKey("stateCode"))
	//*  24   50:aload_1         
	//*  25   51:ldc1            #136 <String "stateCode">
	//*  26   53:invokevirtual   #118 <Method boolean Bundle.containsKey(String)>
	//*  27   56:ifeq            69
				d = bundle.getInt("stateCode");
	//   28   59:aload_0         
	//   29   60:aload_1         
	//   30   61:ldc1            #136 <String "stateCode">
	//   31   63:invokevirtual   #131 <Method int Bundle.getInt(String)>
	//   32   66:putfield        #138 <Field int d>
		}
	//   33   69:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #142 <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(Bitmap bitmap)
	{
		org.androidannotations.api.b.a("", new Runnable(bitmap) {

			public void run()
			{
				com.irobot.home.MissionDetailsActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field MissionDetailsActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field Bitmap a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.MissionDetailsActivity_.a(MissionDetailsActivity_, Bitmap)>
			//    5   11:return          
			}

			final Bitmap a;
			final MissionDetailsActivity_ b;

			
			{
				b = MissionDetailsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field MissionDetailsActivity_ b>
				a = bitmap;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field Bitmap a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #146 <String "">
	//    1    2:new             #28  <Class MissionDetailsActivity_$5>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #148 <Method void MissionDetailsActivity_$5(MissionDetailsActivity_, Bitmap)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #153 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	protected void a(String s)
	{
		org.androidannotations.api.b.a("", new Runnable(s) {

			public void run()
			{
				com.irobot.home.MissionDetailsActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field MissionDetailsActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field String a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.MissionDetailsActivity_.a(MissionDetailsActivity_, String)>
			//    5   11:return          
			}

			final String a;
			final MissionDetailsActivity_ b;

			
			{
				b = MissionDetailsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field MissionDetailsActivity_ b>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #146 <String "">
	//    1    2:new             #30  <Class MissionDetailsActivity_$6>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #155 <Method void MissionDetailsActivity_$6(MissionDetailsActivity_, String)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #153 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		e = (ProgressBar)a1.a(0x7f090223);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #157 <Int 0x7f090223>
	//    3    4:invokeinterface #159 <Method View a.a(int)>
	//    4    9:checkcast       #161 <Class ProgressBar>
	//    5   12:putfield        #165 <Field ProgressBar e>
		f = (NestedScrollView)a1.a(0x7f09008d);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #166 <Int 0x7f09008d>
	//    9   19:invokeinterface #159 <Method View a.a(int)>
	//   10   24:checkcast       #168 <Class NestedScrollView>
	//   11   27:putfield        #172 <Field NestedScrollView f>
		g = (NestedScrollView)a1.a(0x7f09008e);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #173 <Int 0x7f09008e>
	//   15   34:invokeinterface #159 <Method View a.a(int)>
	//   16   39:checkcast       #168 <Class NestedScrollView>
	//   17   42:putfield        #176 <Field NestedScrollView g>
		h = (LinearLayout)a1.a(0x7f09008c);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #177 <Int 0x7f09008c>
	//   21   49:invokeinterface #159 <Method View a.a(int)>
	//   22   54:checkcast       #179 <Class LinearLayout>
	//   23   57:putfield        #183 <Field LinearLayout h>
		i = (ImageView)a1.a(0x7f09010c);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #184 <Int 0x7f09010c>
	//   27   64:invokeinterface #159 <Method View a.a(int)>
	//   28   69:checkcast       #186 <Class ImageView>
	//   29   72:putfield        #190 <Field ImageView i>
		j = (CustomTextView)a1.a(0x7f09010d);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #191 <Int 0x7f09010d>
	//   33   79:invokeinterface #159 <Method View a.a(int)>
	//   34   84:checkcast       #193 <Class CustomTextView>
	//   35   87:putfield        #197 <Field CustomTextView j>
		k = (CustomTextView)a1.a(0x7f0900f6);
	//   36   90:aload_0         
	//   37   91:aload_1         
	//   38   92:ldc1            #198 <Int 0x7f0900f6>
	//   39   94:invokeinterface #159 <Method View a.a(int)>
	//   40   99:checkcast       #193 <Class CustomTextView>
	//   41  102:putfield        #201 <Field CustomTextView k>
		l = (ImageView)a1.a(0x7f0900c2);
	//   42  105:aload_0         
	//   43  106:aload_1         
	//   44  107:ldc1            #202 <Int 0x7f0900c2>
	//   45  109:invokeinterface #159 <Method View a.a(int)>
	//   46  114:checkcast       #186 <Class ImageView>
	//   47  117:putfield        #205 <Field ImageView l>
		m = (ImageView)a1.a(0x7f0900c3);
	//   48  120:aload_0         
	//   49  121:aload_1         
	//   50  122:ldc1            #206 <Int 0x7f0900c3>
	//   51  124:invokeinterface #159 <Method View a.a(int)>
	//   52  129:checkcast       #186 <Class ImageView>
	//   53  132:putfield        #209 <Field ImageView m>
		n = (LinearLayout)a1.a(0x7f090263);
	//   54  135:aload_0         
	//   55  136:aload_1         
	//   56  137:ldc1            #210 <Int 0x7f090263>
	//   57  139:invokeinterface #159 <Method View a.a(int)>
	//   58  144:checkcast       #179 <Class LinearLayout>
	//   59  147:putfield        #213 <Field LinearLayout n>
		o = (TextView)a1.a(0x7f090051);
	//   60  150:aload_0         
	//   61  151:aload_1         
	//   62  152:ldc1            #214 <Int 0x7f090051>
	//   63  154:invokeinterface #159 <Method View a.a(int)>
	//   64  159:checkcast       #216 <Class TextView>
	//   65  162:putfield        #220 <Field TextView o>
		t = (TextView)a1.a(0x7f090261);
	//   66  165:aload_0         
	//   67  166:aload_1         
	//   68  167:ldc1            #221 <Int 0x7f090261>
	//   69  169:invokeinterface #159 <Method View a.a(int)>
	//   70  174:checkcast       #216 <Class TextView>
	//   71  177:putfield        #224 <Field TextView t>
		u = (TextView)a1.a(0x7f090377);
	//   72  180:aload_0         
	//   73  181:aload_1         
	//   74  182:ldc1            #225 <Int 0x7f090377>
	//   75  184:invokeinterface #159 <Method View a.a(int)>
	//   76  189:checkcast       #216 <Class TextView>
	//   77  192:putfield        #228 <Field TextView u>
		v = (CustomTextView)a1.a(0x7f090179);
	//   78  195:aload_0         
	//   79  196:aload_1         
	//   80  197:ldc1            #229 <Int 0x7f090179>
	//   81  199:invokeinterface #159 <Method View a.a(int)>
	//   82  204:checkcast       #193 <Class CustomTextView>
	//   83  207:putfield        #232 <Field CustomTextView v>
		w = (CustomTextView)a1.a(0x7f0900f9);
	//   84  210:aload_0         
	//   85  211:aload_1         
	//   86  212:ldc1            #233 <Int 0x7f0900f9>
	//   87  214:invokeinterface #159 <Method View a.a(int)>
	//   88  219:checkcast       #193 <Class CustomTextView>
	//   89  222:putfield        #236 <Field CustomTextView w>
		x = (CustomTextView)a1.a(0x7f090052);
	//   90  225:aload_0         
	//   91  226:aload_1         
	//   92  227:ldc1            #237 <Int 0x7f090052>
	//   93  229:invokeinterface #159 <Method View a.a(int)>
	//   94  234:checkcast       #193 <Class CustomTextView>
	//   95  237:putfield        #240 <Field CustomTextView x>
		y = (CustomTextView)a1.a(0x7f090260);
	//   96  240:aload_0         
	//   97  241:aload_1         
	//   98  242:ldc1            #241 <Int 0x7f090260>
	//   99  244:invokeinterface #159 <Method View a.a(int)>
	//  100  249:checkcast       #193 <Class CustomTextView>
	//  101  252:putfield        #244 <Field CustomTextView y>
		z = (CustomTextView)a1.a(0x7f09043d);
	//  102  255:aload_0         
	//  103  256:aload_1         
	//  104  257:ldc1            #245 <Int 0x7f09043d>
	//  105  259:invokeinterface #159 <Method View a.a(int)>
	//  106  264:checkcast       #193 <Class CustomTextView>
	//  107  267:putfield        #248 <Field CustomTextView z>
		A = (CustomTextView)a1.a(0x7f09049a);
	//  108  270:aload_0         
	//  109  271:aload_1         
	//  110  272:ldc1            #249 <Int 0x7f09049a>
	//  111  274:invokeinterface #159 <Method View a.a(int)>
	//  112  279:checkcast       #193 <Class CustomTextView>
	//  113  282:putfield        #252 <Field CustomTextView A>
		B = (CustomTextView)a1.a(0x7f090440);
	//  114  285:aload_0         
	//  115  286:aload_1         
	//  116  287:ldc1            #253 <Int 0x7f090440>
	//  117  289:invokeinterface #159 <Method View a.a(int)>
	//  118  294:checkcast       #193 <Class CustomTextView>
	//  119  297:putfield        #256 <Field CustomTextView B>
		C = (CustomTextView)a1.a(0x7f09043f);
	//  120  300:aload_0         
	//  121  301:aload_1         
	//  122  302:ldc2            #257 <Int 0x7f09043f>
	//  123  305:invokeinterface #159 <Method View a.a(int)>
	//  124  310:checkcast       #193 <Class CustomTextView>
	//  125  313:putfield        #260 <Field CustomTextView C>
		D = (CustomTextView)a1.a(0x7f090441);
	//  126  316:aload_0         
	//  127  317:aload_1         
	//  128  318:ldc2            #261 <Int 0x7f090441>
	//  129  321:invokeinterface #159 <Method View a.a(int)>
	//  130  326:checkcast       #193 <Class CustomTextView>
	//  131  329:putfield        #264 <Field CustomTextView D>
		E = a1.a(0x7f0904a1);
	//  132  332:aload_0         
	//  133  333:aload_1         
	//  134  334:ldc2            #265 <Int 0x7f0904a1>
	//  135  337:invokeinterface #159 <Method View a.a(int)>
	//  136  342:putfield        #269 <Field View E>
		F = (WebViewLanguageCompat)a1.a(0x7f0902f6);
	//  137  345:aload_0         
	//  138  346:aload_1         
	//  139  347:ldc2            #270 <Int 0x7f0902f6>
	//  140  350:invokeinterface #159 <Method View a.a(int)>
	//  141  355:checkcast       #272 <Class WebViewLanguageCompat>
	//  142  358:putfield        #276 <Field WebViewLanguageCompat F>
		G = (CustomButton)a1.a(0x7f09031b);
	//  143  361:aload_0         
	//  144  362:aload_1         
	//  145  363:ldc2            #277 <Int 0x7f09031b>
	//  146  366:invokeinterface #159 <Method View a.a(int)>
	//  147  371:checkcast       #279 <Class CustomButton>
	//  148  374:putfield        #283 <Field CustomButton G>
		H = (LinearLayout)a1.a(0x7f09004f);
	//  149  377:aload_0         
	//  150  378:aload_1         
	//  151  379:ldc2            #284 <Int 0x7f09004f>
	//  152  382:invokeinterface #159 <Method View a.a(int)>
	//  153  387:checkcast       #179 <Class LinearLayout>
	//  154  390:putfield        #287 <Field LinearLayout H>
		I = (ImageButton)a1.a(0x7f0902f9);
	//  155  393:aload_0         
	//  156  394:aload_1         
	//  157  395:ldc2            #288 <Int 0x7f0902f9>
	//  158  398:invokeinterface #159 <Method View a.a(int)>
	//  159  403:checkcast       #290 <Class ImageButton>
	//  160  406:putfield        #293 <Field ImageButton I>
		J = (ImageButton)a1.a(0x7f0902f0);
	//  161  409:aload_0         
	//  162  410:aload_1         
	//  163  411:ldc2            #294 <Int 0x7f0902f0>
	//  164  414:invokeinterface #159 <Method View a.a(int)>
	//  165  419:checkcast       #290 <Class ImageButton>
	//  166  422:putfield        #297 <Field ImageButton J>
		K = (AppCompatSeekBar)a1.a(0x7f090269);
	//  167  425:aload_0         
	//  168  426:aload_1         
	//  169  427:ldc2            #298 <Int 0x7f090269>
	//  170  430:invokeinterface #159 <Method View a.a(int)>
	//  171  435:checkcast       #300 <Class AppCompatSeekBar>
	//  172  438:putfield        #304 <Field AppCompatSeekBar K>
		L = (LinearLayout)a1.a(0x7f09021d);
	//  173  441:aload_0         
	//  174  442:aload_1         
	//  175  443:ldc2            #305 <Int 0x7f09021d>
	//  176  446:invokeinterface #159 <Method View a.a(int)>
	//  177  451:checkcast       #179 <Class LinearLayout>
	//  178  454:putfield        #308 <Field LinearLayout L>
		M = (CustomTextView)a1.a(0x7f09021e);
	//  179  457:aload_0         
	//  180  458:aload_1         
	//  181  459:ldc2            #309 <Int 0x7f09021e>
	//  182  462:invokeinterface #159 <Method View a.a(int)>
	//  183  467:checkcast       #193 <Class CustomTextView>
	//  184  470:putfield        #312 <Field CustomTextView M>
		N = (FloatingActionButton)a1.a(0x7f090322);
	//  185  473:aload_0         
	//  186  474:aload_1         
	//  187  475:ldc2            #313 <Int 0x7f090322>
	//  188  478:invokeinterface #159 <Method View a.a(int)>
	//  189  483:checkcast       #315 <Class FloatingActionButton>
	//  190  486:putfield        #319 <Field FloatingActionButton N>
		View view = a1.a(0x7f090412);
	//  191  489:aload_1         
	//  192  490:ldc2            #320 <Int 0x7f090412>
	//  193  493:invokeinterface #159 <Method View a.a(int)>
	//  194  498:astore_2        
		View view1 = a1.a(0x7f090413);
	//  195  499:aload_1         
	//  196  500:ldc2            #321 <Int 0x7f090413>
	//  197  503:invokeinterface #159 <Method View a.a(int)>
	//  198  508:astore_3        
		a1 = ((org.androidannotations.api.c.a) (a1.a(0x7f090184)));
	//  199  509:aload_1         
	//  200  510:ldc2            #322 <Int 0x7f090184>
	//  201  513:invokeinterface #159 <Method View a.a(int)>
	//  202  518:astore_1        
		if(G != null)
	//* 203  519:aload_0         
	//* 204  520:getfield        #283 <Field CustomButton G>
	//* 205  523:ifnull          541
			G.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MissionDetailsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MissionDetailsActivity_.f()>
				//    3    7:return          
				}

				final MissionDetailsActivity_ a;

			
			{
				a = MissionDetailsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MissionDetailsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  206  526:aload_0         
	//  207  527:getfield        #283 <Field CustomButton G>
	//  208  530:new             #10  <Class MissionDetailsActivity_$1>
	//  209  533:dup             
	//  210  534:aload_0         
	//  211  535:invokespecial   #324 <Method void MissionDetailsActivity_$1(MissionDetailsActivity_)>
	//  212  538:invokevirtual   #328 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(I != null)
	//* 213  541:aload_0         
	//* 214  542:getfield        #293 <Field ImageButton I>
	//* 215  545:ifnull          563
			I.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MissionDetailsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MissionDetailsActivity_.g()>
				//    3    7:return          
				}

				final MissionDetailsActivity_ a;

			
			{
				a = MissionDetailsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MissionDetailsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  216  548:aload_0         
	//  217  549:getfield        #293 <Field ImageButton I>
	//  218  552:new             #34  <Class MissionDetailsActivity_$8>
	//  219  555:dup             
	//  220  556:aload_0         
	//  221  557:invokespecial   #329 <Method void MissionDetailsActivity_$8(MissionDetailsActivity_)>
	//  222  560:invokevirtual   #330 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		if(J != null)
	//* 223  563:aload_0         
	//* 224  564:getfield        #297 <Field ImageButton J>
	//* 225  567:ifnull          585
			J.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MissionDetailsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MissionDetailsActivity_.h()>
				//    3    7:return          
				}

				final MissionDetailsActivity_ a;

			
			{
				a = MissionDetailsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MissionDetailsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  226  570:aload_0         
	//  227  571:getfield        #297 <Field ImageButton J>
	//  228  574:new             #36  <Class MissionDetailsActivity_$9>
	//  229  577:dup             
	//  230  578:aload_0         
	//  231  579:invokespecial   #331 <Method void MissionDetailsActivity_$9(MissionDetailsActivity_)>
	//  232  582:invokevirtual   #330 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		if(N != null)
	//* 233  585:aload_0         
	//* 234  586:getfield        #319 <Field FloatingActionButton N>
	//* 235  589:ifnull          607
			N.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.i();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MissionDetailsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MissionDetailsActivity_.i()>
				//    3    7:return          
				}

				final MissionDetailsActivity_ a;

			
			{
				a = MissionDetailsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MissionDetailsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  236  592:aload_0         
	//  237  593:getfield        #319 <Field FloatingActionButton N>
	//  238  596:new             #12  <Class MissionDetailsActivity_$10>
	//  239  599:dup             
	//  240  600:aload_0         
	//  241  601:invokespecial   #332 <Method void MissionDetailsActivity_$10(MissionDetailsActivity_)>
	//  242  604:invokevirtual   #333 <Method void FloatingActionButton.setOnClickListener(android.view.View$OnClickListener)>
		if(view != null)
	//* 243  607:aload_2         
	//* 244  608:ifnull          623
			view.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.k();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MissionDetailsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MissionDetailsActivity_.k()>
				//    3    7:return          
				}

				final MissionDetailsActivity_ a;

			
			{
				a = MissionDetailsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MissionDetailsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  245  611:aload_2         
	//  246  612:new             #14  <Class MissionDetailsActivity_$11>
	//  247  615:dup             
	//  248  616:aload_0         
	//  249  617:invokespecial   #334 <Method void MissionDetailsActivity_$11(MissionDetailsActivity_)>
	//  250  620:invokevirtual   #337 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(view1 != null)
	//* 251  623:aload_3         
	//* 252  624:ifnull          639
			view1.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.l();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MissionDetailsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MissionDetailsActivity_.l()>
				//    3    7:return          
				}

				final MissionDetailsActivity_ a;

			
			{
				a = MissionDetailsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MissionDetailsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  253  627:aload_3         
	//  254  628:new             #16  <Class MissionDetailsActivity_$12>
	//  255  631:dup             
	//  256  632:aload_0         
	//  257  633:invokespecial   #338 <Method void MissionDetailsActivity_$12(MissionDetailsActivity_)>
	//  258  636:invokevirtual   #337 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(a1 != null)
	//* 259  639:aload_1         
	//* 260  640:ifnull          655
			((View) (a1)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.m();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MissionDetailsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MissionDetailsActivity_.m()>
				//    3    7:return          
				}

				final MissionDetailsActivity_ a;

			
			{
				a = MissionDetailsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MissionDetailsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  261  643:aload_1         
	//  262  644:new             #18  <Class MissionDetailsActivity_$13>
	//  263  647:dup             
	//  264  648:aload_0         
	//  265  649:invokespecial   #339 <Method void MissionDetailsActivity_$13(MissionDetailsActivity_)>
	//  266  652:invokevirtual   #337 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(v != null)
	//* 267  655:aload_0         
	//* 268  656:getfield        #232 <Field CustomTextView v>
	//* 269  659:ifnull          677
			v.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.n();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MissionDetailsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MissionDetailsActivity_.n()>
				//    3    7:return          
				}

				final MissionDetailsActivity_ a;

			
			{
				a = MissionDetailsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MissionDetailsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  270  662:aload_0         
	//  271  663:getfield        #232 <Field CustomTextView v>
	//  272  666:new             #20  <Class MissionDetailsActivity_$14>
	//  273  669:dup             
	//  274  670:aload_0         
	//  275  671:invokespecial   #340 <Method void MissionDetailsActivity_$14(MissionDetailsActivity_)>
	//  276  674:invokevirtual   #341 <Method void CustomTextView.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//  277  677:aload_0         
	//  278  678:invokevirtual   #343 <Method void e()>
	//  279  681:return          
	}

	public void a_()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.MissionDetailsActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MissionDetailsActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.MissionDetailsActivity_.a(MissionDetailsActivity_)>
			//    3    7:return          
			}

			final MissionDetailsActivity_ a;

			
			{
				a = MissionDetailsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MissionDetailsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #146 <String "">
	//    1    2:new             #22  <Class MissionDetailsActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #344 <Method void MissionDetailsActivity_$2(MissionDetailsActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #153 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void b_()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.MissionDetailsActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MissionDetailsActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.MissionDetailsActivity_.b(MissionDetailsActivity_)>
			//    3    7:return          
			}

			final MissionDetailsActivity_ a;

			
			{
				a = MissionDetailsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MissionDetailsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #146 <String "">
	//    1    2:new             #24  <Class MissionDetailsActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #345 <Method void MissionDetailsActivity_$3(MissionDetailsActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #153 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void c()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.MissionDetailsActivity_.c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MissionDetailsActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.MissionDetailsActivity_.c(MissionDetailsActivity_)>
			//    3    7:return          
			}

			final MissionDetailsActivity_ a;

			
			{
				a = MissionDetailsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MissionDetailsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #146 <String "">
	//    1    2:new             #26  <Class MissionDetailsActivity_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #346 <Method void MissionDetailsActivity_$4(MissionDetailsActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #153 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(Q);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field c Q>
	//    2    4:invokestatic    #350 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #352 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #354 <Method void MissionDetailsActivity.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #350 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0052);
	//   13   23:aload_0         
	//   14   24:ldc2            #355 <Int 0x7f0b0052>
	//   15   27:invokevirtual   #359 <Method void setContentView(int)>
	//   16   30:return          
	}

	public void p()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					MissionDetailsActivity_.d(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field MissionDetailsActivity_ a>
			//    2    4:invokestatic    #25  <Method void MissionDetailsActivity_.d(MissionDetailsActivity_)>
					return;
			//    3    7:return          
				}
				catch(Throwable throwable)
			//*   4    8:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    5    9:invokestatic    #31  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    6   12:invokestatic    #35  <Method Thread Thread.currentThread()>
			//    7   15:aload_1         
			//    8   16:invokeinterface #41  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//    9   21:return          
			}

			final MissionDetailsActivity_ a;

			
			{
				a = MissionDetailsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field MissionDetailsActivity_ a>
				super(s, l, s1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:lload_3         
			//    6    8:aload           5
			//    7   10:invokespecial   #18  <Method void org.androidannotations.api.a$a(String, long, String)>
			//    8   13:return          
			}
		}
)));
	//    0    0:new             #32  <Class MissionDetailsActivity_$7>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #146 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #146 <String "">
	//    6   10:invokespecial   #362 <Method void MissionDetailsActivity_$7(MissionDetailsActivity_, String, long, String)>
	//    7   13:invokestatic    #367 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #368 <Method void MissionDetailsActivity.setContentView(int)>
		Q.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #50  <Field c Q>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #370 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #373 <Method void MissionDetailsActivity.setContentView(View)>
		Q.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #50  <Field c Q>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #370 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #376 <Method void MissionDetailsActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		Q.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #50  <Field c Q>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #370 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #380 <Method void MissionDetailsActivity.setIntent(Intent)>
		r();
	//    3    5:aload_0         
	//    4    6:invokespecial   #70  <Method void r()>
	//    5    9:return          
	}

	private final c Q = new c();
}
