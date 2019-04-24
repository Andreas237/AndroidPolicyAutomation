// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.View;
import com.irobot.home.util.k;
import com.irobot.home.view.CustomButton;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			RoombaHelpTableViewActivity

public final class RoombaHelpTableViewActivity_ extends RoombaHelpTableViewActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(String s)
		{
			return (a)super.a("robotBlid", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "robotBlid">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class RoombaHelpTableViewActivity_$a>
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

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/RoombaHelpTableViewActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class RoombaHelpTableViewActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public RoombaHelpTableViewActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void RoombaHelpTableViewActivity()>
	//    2    4:aload_0         
	//    3    5:new             #45  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #46  <Method void c()>
	//    6   12:putfield        #48  <Field c u>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #36  <Class RoombaHelpTableViewActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #53  <Method void RoombaHelpTableViewActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		t = new k(((Context) (this)));
	//    0    0:aload_0         
	//    1    1:new             #56  <Class k>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #57  <Method void k(Context)>
	//    5    9:putfield        #61  <Field k t>
		t = new k(((Context) (this)));
	//    6   12:aload_0         
	//    7   13:new             #56  <Class k>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokespecial   #57  <Method void k(Context)>
	//   11   21:putfield        #61  <Field k t>
		c.a(((b) (this)));
	//   12   24:aload_0         
	//   13   25:invokestatic    #64  <Method void c.a(b)>
		q();
	//   14   28:aload_0         
	//   15   29:invokespecial   #67  <Method void q()>
	//   16   32:return          
	}

	static void a(RoombaHelpTableViewActivity_ roombahelptableviewactivity_)
	{
		((RoombaHelpTableViewActivity) (roombahelptableviewactivity_)).RoombaHelpTableViewActivity.p();
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void RoombaHelpTableViewActivity.p()>
	//    2    4:return          
	}

	static void a(RoombaHelpTableViewActivity_ roombahelptableviewactivity_, int i)
	{
		((RoombaHelpTableViewActivity) (roombahelptableviewactivity_)).RoombaHelpTableViewActivity.f(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #76  <Method void RoombaHelpTableViewActivity.f(int)>
	//    3    5:return          
	}

	static void b(RoombaHelpTableViewActivity_ roombahelptableviewactivity_)
	{
		((RoombaHelpTableViewActivity) (roombahelptableviewactivity_)).RoombaHelpTableViewActivity.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void RoombaHelpTableViewActivity.f()>
	//    2    4:return          
	}

	static void b(RoombaHelpTableViewActivity_ roombahelptableviewactivity_, int i)
	{
		((RoombaHelpTableViewActivity) (roombahelptableviewactivity_)).RoombaHelpTableViewActivity.h(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #82  <Method void RoombaHelpTableViewActivity.h(int)>
	//    3    5:return          
	}

	private void q()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #86  <Method Intent getIntent()>
	//    2    4:invokevirtual   #92  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("robotBlid"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #94  <String "robotBlid">
	//*   8   15:invokevirtual   #100 <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			l = bundle.getString("robotBlid");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #94  <String "robotBlid">
	//   13   25:invokevirtual   #104 <Method String Bundle.getString(String)>
	//   14   28:putfield        #108 <Field String l>
	//   15   31:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #112 <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		b = (CustomButton)a1.a(0x7f09009e);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #116 <Int 0x7f09009e>
	//    3    4:invokeinterface #118 <Method View a.a(int)>
	//    4    9:checkcast       #120 <Class CustomButton>
	//    5   12:putfield        #123 <Field CustomButton b>
		c = (CustomButton)a1.a(0x7f090097);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #124 <Int 0x7f090097>
	//    9   19:invokeinterface #118 <Method View a.a(int)>
	//   10   24:checkcast       #120 <Class CustomButton>
	//   11   27:putfield        #127 <Field CustomButton c>
		d = (CustomButton)a1.a(0x7f090096);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #128 <Int 0x7f090096>
	//   15   34:invokeinterface #118 <Method View a.a(int)>
	//   16   39:checkcast       #120 <Class CustomButton>
	//   17   42:putfield        #131 <Field CustomButton d>
		e = (CustomButton)a1.a(0x7f09009d);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #132 <Int 0x7f09009d>
	//   21   49:invokeinterface #118 <Method View a.a(int)>
	//   22   54:checkcast       #120 <Class CustomButton>
	//   23   57:putfield        #135 <Field CustomButton e>
		f = (CustomButton)a1.a(0x7f090098);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #136 <Int 0x7f090098>
	//   27   64:invokeinterface #118 <Method View a.a(int)>
	//   28   69:checkcast       #120 <Class CustomButton>
	//   29   72:putfield        #138 <Field CustomButton f>
		g = (CustomButton)a1.a(0x7f090099);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #139 <Int 0x7f090099>
	//   33   79:invokeinterface #118 <Method View a.a(int)>
	//   34   84:checkcast       #120 <Class CustomButton>
	//   35   87:putfield        #142 <Field CustomButton g>
		h = a1.a(0x7f090497);
	//   36   90:aload_0         
	//   37   91:aload_1         
	//   38   92:ldc1            #143 <Int 0x7f090497>
	//   39   94:invokeinterface #118 <Method View a.a(int)>
	//   40   99:putfield        #146 <Field View h>
		i = a1.a(0x7f0902ad);
	//   41  102:aload_0         
	//   42  103:aload_1         
	//   43  104:ldc1            #147 <Int 0x7f0902ad>
	//   44  106:invokeinterface #118 <Method View a.a(int)>
	//   45  111:putfield        #150 <Field View i>
		j = a1.a(0x7f090231);
	//   46  114:aload_0         
	//   47  115:aload_1         
	//   48  116:ldc1            #151 <Int 0x7f090231>
	//   49  118:invokeinterface #118 <Method View a.a(int)>
	//   50  123:putfield        #154 <Field View j>
		k = a1.a(0x7f090490);
	//   51  126:aload_0         
	//   52  127:aload_1         
	//   53  128:ldc1            #155 <Int 0x7f090490>
	//   54  130:invokeinterface #118 <Method View a.a(int)>
	//   55  135:putfield        #158 <Field View k>
		View view = a1.a(0x7f090093);
	//   56  138:aload_1         
	//   57  139:ldc1            #159 <Int 0x7f090093>
	//   58  141:invokeinterface #118 <Method View a.a(int)>
	//   59  146:astore_2        
		View view1 = a1.a(0x7f090094);
	//   60  147:aload_1         
	//   61  148:ldc1            #160 <Int 0x7f090094>
	//   62  150:invokeinterface #118 <Method View a.a(int)>
	//   63  155:astore_3        
		a1 = ((org.androidannotations.api.c.a) (a1.a(0x7f09009a)));
	//   64  156:aload_1         
	//   65  157:ldc1            #161 <Int 0x7f09009a>
	//   66  159:invokeinterface #118 <Method View a.a(int)>
	//   67  164:astore_1        
		if(view != null)
	//*  68  165:aload_2         
	//*  69  166:ifnull          181
			view.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RoombaHelpTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RoombaHelpTableViewActivity_.g()>
				//    3    7:return          
				}

				final RoombaHelpTableViewActivity_ a;

			
			{
				a = RoombaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RoombaHelpTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   70  169:aload_2         
	//   71  170:new             #10  <Class RoombaHelpTableViewActivity_$1>
	//   72  173:dup             
	//   73  174:aload_0         
	//   74  175:invokespecial   #163 <Method void RoombaHelpTableViewActivity_$1(RoombaHelpTableViewActivity_)>
	//   75  178:invokevirtual   #169 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(b != null)
	//*  76  181:aload_0         
	//*  77  182:getfield        #123 <Field CustomButton b>
	//*  78  185:ifnull          203
			b.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RoombaHelpTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RoombaHelpTableViewActivity_.h()>
				//    3    7:return          
				}

				final RoombaHelpTableViewActivity_ a;

			
			{
				a = RoombaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RoombaHelpTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   79  188:aload_0         
	//   80  189:getfield        #123 <Field CustomButton b>
	//   81  192:new             #28  <Class RoombaHelpTableViewActivity_$6>
	//   82  195:dup             
	//   83  196:aload_0         
	//   84  197:invokespecial   #170 <Method void RoombaHelpTableViewActivity_$6(RoombaHelpTableViewActivity_)>
	//   85  200:invokevirtual   #171 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(c != null)
	//*  86  203:aload_0         
	//*  87  204:getfield        #127 <Field CustomButton c>
	//*  88  207:ifnull          225
			c.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.i();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RoombaHelpTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RoombaHelpTableViewActivity_.i()>
				//    3    7:return          
				}

				final RoombaHelpTableViewActivity_ a;

			
			{
				a = RoombaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RoombaHelpTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   89  210:aload_0         
	//   90  211:getfield        #127 <Field CustomButton c>
	//   91  214:new             #30  <Class RoombaHelpTableViewActivity_$7>
	//   92  217:dup             
	//   93  218:aload_0         
	//   94  219:invokespecial   #172 <Method void RoombaHelpTableViewActivity_$7(RoombaHelpTableViewActivity_)>
	//   95  222:invokevirtual   #171 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(d != null)
	//*  96  225:aload_0         
	//*  97  226:getfield        #131 <Field CustomButton d>
	//*  98  229:ifnull          247
			d.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.j();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RoombaHelpTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RoombaHelpTableViewActivity_.j()>
				//    3    7:return          
				}

				final RoombaHelpTableViewActivity_ a;

			
			{
				a = RoombaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RoombaHelpTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   99  232:aload_0         
	//  100  233:getfield        #131 <Field CustomButton d>
	//  101  236:new             #32  <Class RoombaHelpTableViewActivity_$8>
	//  102  239:dup             
	//  103  240:aload_0         
	//  104  241:invokespecial   #173 <Method void RoombaHelpTableViewActivity_$8(RoombaHelpTableViewActivity_)>
	//  105  244:invokevirtual   #171 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(view1 != null)
	//* 106  247:aload_3         
	//* 107  248:ifnull          263
			view1.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.k();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RoombaHelpTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void com.irobot.home.RoombaHelpTableViewActivity_.k()>
				//    3    7:return          
				}

				final RoombaHelpTableViewActivity_ a;

			
			{
				a = RoombaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RoombaHelpTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  108  251:aload_3         
	//  109  252:new             #34  <Class RoombaHelpTableViewActivity_$9>
	//  110  255:dup             
	//  111  256:aload_0         
	//  112  257:invokespecial   #174 <Method void RoombaHelpTableViewActivity_$9(RoombaHelpTableViewActivity_)>
	//  113  260:invokevirtual   #169 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(e != null)
	//* 114  263:aload_0         
	//* 115  264:getfield        #135 <Field CustomButton e>
	//* 116  267:ifnull          285
			e.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.l();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RoombaHelpTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RoombaHelpTableViewActivity_.l()>
				//    3    7:return          
				}

				final RoombaHelpTableViewActivity_ a;

			
			{
				a = RoombaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RoombaHelpTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  117  270:aload_0         
	//  118  271:getfield        #135 <Field CustomButton e>
	//  119  274:new             #12  <Class RoombaHelpTableViewActivity_$10>
	//  120  277:dup             
	//  121  278:aload_0         
	//  122  279:invokespecial   #175 <Method void RoombaHelpTableViewActivity_$10(RoombaHelpTableViewActivity_)>
	//  123  282:invokevirtual   #171 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(f != null)
	//* 124  285:aload_0         
	//* 125  286:getfield        #138 <Field CustomButton f>
	//* 126  289:ifnull          307
			f.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.m();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RoombaHelpTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RoombaHelpTableViewActivity_.m()>
				//    3    7:return          
				}

				final RoombaHelpTableViewActivity_ a;

			
			{
				a = RoombaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RoombaHelpTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  127  292:aload_0         
	//  128  293:getfield        #138 <Field CustomButton f>
	//  129  296:new             #14  <Class RoombaHelpTableViewActivity_$11>
	//  130  299:dup             
	//  131  300:aload_0         
	//  132  301:invokespecial   #176 <Method void RoombaHelpTableViewActivity_$11(RoombaHelpTableViewActivity_)>
	//  133  304:invokevirtual   #171 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(g != null)
	//* 134  307:aload_0         
	//* 135  308:getfield        #142 <Field CustomButton g>
	//* 136  311:ifnull          329
			g.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.n();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RoombaHelpTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RoombaHelpTableViewActivity_.n()>
				//    3    7:return          
				}

				final RoombaHelpTableViewActivity_ a;

			
			{
				a = RoombaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RoombaHelpTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  137  314:aload_0         
	//  138  315:getfield        #142 <Field CustomButton g>
	//  139  318:new             #16  <Class RoombaHelpTableViewActivity_$12>
	//  140  321:dup             
	//  141  322:aload_0         
	//  142  323:invokespecial   #177 <Method void RoombaHelpTableViewActivity_$12(RoombaHelpTableViewActivity_)>
	//  143  326:invokevirtual   #171 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(a1 != null)
	//* 144  329:aload_1         
	//* 145  330:ifnull          345
			((View) (a1)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.o();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RoombaHelpTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RoombaHelpTableViewActivity_.o()>
				//    3    7:return          
				}

				final RoombaHelpTableViewActivity_ a;

			
			{
				a = RoombaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RoombaHelpTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  146  333:aload_1         
	//  147  334:new             #18  <Class RoombaHelpTableViewActivity_$13>
	//  148  337:dup             
	//  149  338:aload_0         
	//  150  339:invokespecial   #178 <Method void RoombaHelpTableViewActivity_$13(RoombaHelpTableViewActivity_)>
	//  151  342:invokevirtual   #169 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//  152  345:aload_0         
	//  153  346:invokevirtual   #180 <Method void e()>
	//  154  349:return          
	}

	public void f()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.RoombaHelpTableViewActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field RoombaHelpTableViewActivity_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.RoombaHelpTableViewActivity_.b(RoombaHelpTableViewActivity_)>
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

			final RoombaHelpTableViewActivity_ a;

			
			{
				a = RoombaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field RoombaHelpTableViewActivity_ a>
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
	//    0    0:new             #26  <Class RoombaHelpTableViewActivity_$5>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #182 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #182 <String "">
	//    6   10:invokespecial   #185 <Method void RoombaHelpTableViewActivity_$5(RoombaHelpTableViewActivity_, String, long, String)>
	//    7   13:invokestatic    #190 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void f(int i)
	{
		org.androidannotations.api.b.a("", new Runnable(i) {

			public void run()
			{
				com.irobot.home.RoombaHelpTableViewActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RoombaHelpTableViewActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field int a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.RoombaHelpTableViewActivity_.a(RoombaHelpTableViewActivity_, int)>
			//    5   11:return          
			}

			final int a;
			final RoombaHelpTableViewActivity_ b;

			
			{
				b = RoombaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RoombaHelpTableViewActivity_ b>
				a = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #182 <String "">
	//    1    2:new             #20  <Class RoombaHelpTableViewActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #192 <Method void RoombaHelpTableViewActivity_$2(RoombaHelpTableViewActivity_, int)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #197 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void h(int i)
	{
		org.androidannotations.api.b.a("", new Runnable(i) {

			public void run()
			{
				com.irobot.home.RoombaHelpTableViewActivity_.b(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RoombaHelpTableViewActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field int a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.RoombaHelpTableViewActivity_.b(RoombaHelpTableViewActivity_, int)>
			//    5   11:return          
			}

			final int a;
			final RoombaHelpTableViewActivity_ b;

			
			{
				b = RoombaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RoombaHelpTableViewActivity_ b>
				a = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #182 <String "">
	//    1    2:new             #22  <Class RoombaHelpTableViewActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #198 <Method void RoombaHelpTableViewActivity_$3(RoombaHelpTableViewActivity_, int)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #197 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(u);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field c u>
	//    2    4:invokestatic    #202 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #204 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #206 <Method void RoombaHelpTableViewActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #202 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0043);
	//   13   23:aload_0         
	//   14   24:ldc1            #207 <Int 0x7f0b0043>
	//   15   26:invokevirtual   #210 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void p()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.RoombaHelpTableViewActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RoombaHelpTableViewActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.RoombaHelpTableViewActivity_.a(RoombaHelpTableViewActivity_)>
			//    3    7:return          
			}

			final RoombaHelpTableViewActivity_ a;

			
			{
				a = RoombaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RoombaHelpTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #182 <String "">
	//    1    2:new             #24  <Class RoombaHelpTableViewActivity_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #211 <Method void RoombaHelpTableViewActivity_$4(RoombaHelpTableViewActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #197 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #212 <Method void RoombaHelpTableViewActivity.setContentView(int)>
		u.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #48  <Field c u>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #214 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #217 <Method void RoombaHelpTableViewActivity.setContentView(View)>
		u.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #48  <Field c u>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #214 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #220 <Method void RoombaHelpTableViewActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		u.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #48  <Field c u>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #214 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #224 <Method void RoombaHelpTableViewActivity.setIntent(Intent)>
		q();
	//    3    5:aload_0         
	//    4    6:invokespecial   #67  <Method void q()>
	//    5    9:return          
	}

	private final c u = new c();
}
