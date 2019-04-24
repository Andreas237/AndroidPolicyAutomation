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
import com.irobot.home.model.rest.ContactInfo;
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			ContactTableViewActivity

public final class ContactTableViewActivity_ extends ContactTableViewActivity
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
		//    4    7:checkcast       #2   <Class ContactTableViewActivity_$a>
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

		public a b(String s)
		{
			return (a)super.a("robotSku", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #70  <String "robotSku">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class ContactTableViewActivity_$a>
		//    5   10:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/ContactTableViewActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class ContactTableViewActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public ContactTableViewActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void ContactTableViewActivity()>
	//    2    4:aload_0         
	//    3    5:new             #33  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void c()>
	//    6   12:putfield        #36  <Field c o>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #24  <Class ContactTableViewActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #41  <Method void ContactTableViewActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #45  <Method void c.a(b)>
		k();
	//    2    4:aload_0         
	//    3    5:invokespecial   #48  <Method void k()>
	//    4    8:return          
	}

	static void a(ContactTableViewActivity_ contacttableviewactivity_)
	{
		((ContactTableViewActivity) (contacttableviewactivity_)).ContactTableViewActivity.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void ContactTableViewActivity.f()>
	//    2    4:return          
	}

	static void a(ContactTableViewActivity_ contacttableviewactivity_, ContactInfo contactinfo)
	{
		((ContactTableViewActivity) (contacttableviewactivity_)).com.irobot.home.ContactTableViewActivity.a(contactinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #56  <Method void com.irobot.home.ContactTableViewActivity.a(ContactInfo)>
	//    3    5:return          
	}

	static void a(ContactTableViewActivity_ contacttableviewactivity_, String s, View view, View view1)
	{
		((ContactTableViewActivity) (contacttableviewactivity_)).com.irobot.home.ContactTableViewActivity.a(s, view, view1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #60  <Method void com.irobot.home.ContactTableViewActivity.a(String, View, View)>
	//    5    7:return          
	}

	static void b(ContactTableViewActivity_ contacttableviewactivity_)
	{
		((ContactTableViewActivity) (contacttableviewactivity_)).ContactTableViewActivity.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void ContactTableViewActivity.j()>
	//    2    4:return          
	}

	private void k()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method Intent getIntent()>
	//    2    4:invokevirtual   #74  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          50
		{
			if(bundle.containsKey("assetId"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #76  <String "assetId">
	//*   8   15:invokevirtual   #82  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				k = bundle.getString("assetId");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #76  <String "assetId">
	//   13   25:invokevirtual   #86  <Method String Bundle.getString(String)>
	//   14   28:putfield        #89  <Field String k>
			if(bundle.containsKey("robotSku"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #91  <String "robotSku">
	//*  17   34:invokevirtual   #82  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				l = bundle.getString("robotSku");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #91  <String "robotSku">
	//   22   44:invokevirtual   #86  <Method String Bundle.getString(String)>
	//   23   47:putfield        #94  <Field String l>
		}
	//   24   50:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #98  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(ContactInfo contactinfo)
	{
		org.androidannotations.api.b.a("", new Runnable(contactinfo) {

			public void run()
			{
				com.irobot.home.ContactTableViewActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field ContactTableViewActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field ContactInfo a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.ContactTableViewActivity_.a(ContactTableViewActivity_, ContactInfo)>
			//    5   11:return          
			}

			final ContactInfo a;
			final ContactTableViewActivity_ b;

			
			{
				b = ContactTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ContactTableViewActivity_ b>
				a = contactinfo;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field ContactInfo a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #102 <String "">
	//    1    2:new             #20  <Class ContactTableViewActivity_$6>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #104 <Method void ContactTableViewActivity_$6(ContactTableViewActivity_, ContactInfo)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #109 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void a(String s, View view, View view1)
	{
		org.androidannotations.api.b.a("", new Runnable(s, view, view1) {

			public void run()
			{
				com.irobot.home.ContactTableViewActivity_.a(d, a, b, c);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field ContactTableViewActivity_ d>
			//    2    4:aload_0         
			//    3    5:getfield        #23  <Field String a>
			//    4    8:aload_0         
			//    5    9:getfield        #25  <Field View b>
			//    6   12:aload_0         
			//    7   13:getfield        #27  <Field View c>
			//    8   16:invokestatic    #34  <Method void com.irobot.home.ContactTableViewActivity_.a(ContactTableViewActivity_, String, View, View)>
			//    9   19:return          
			}

			final String a;
			final View b;
			final View c;
			final ContactTableViewActivity_ d;

			
			{
				d = ContactTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field ContactTableViewActivity_ d>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field String a>
				b = view;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field View b>
				c = view1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #27  <Field View c>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #30  <Method void Object()>
			//   14   25:return          
			}
		}
, 0L);
	//    0    0:ldc1            #102 <String "">
	//    1    2:new             #18  <Class ContactTableViewActivity_$5>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:aload_3         
	//    7   10:invokespecial   #111 <Method void ContactTableViewActivity_$5(ContactTableViewActivity_, String, View, View)>
	//    8   13:lconst_0        
	//    9   14:invokestatic    #109 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//   10   17:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (CustomTextView)a1.a(0x7f0900ab);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #113 <Int 0x7f0900ab>
	//    3    4:invokeinterface #115 <Method View a.a(int)>
	//    4    9:checkcast       #117 <Class CustomTextView>
	//    5   12:putfield        #120 <Field CustomTextView a>
		b = (CustomTextView)a1.a(0x7f090118);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #121 <Int 0x7f090118>
	//    9   19:invokeinterface #115 <Method View a.a(int)>
	//   10   24:checkcast       #117 <Class CustomTextView>
	//   11   27:putfield        #123 <Field CustomTextView b>
		c = (CustomTextView)a1.a(0x7f090378);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #124 <Int 0x7f090378>
	//   15   34:invokeinterface #115 <Method View a.a(int)>
	//   16   39:checkcast       #117 <Class CustomTextView>
	//   17   42:putfield        #127 <Field CustomTextView c>
		d = a1.a(0x7f0900aa);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #128 <Int 0x7f0900aa>
	//   21   49:invokeinterface #115 <Method View a.a(int)>
	//   22   54:putfield        #132 <Field View d>
		e = a1.a(0x7f090164);
	//   23   57:aload_0         
	//   24   58:aload_1         
	//   25   59:ldc1            #133 <Int 0x7f090164>
	//   26   61:invokeinterface #115 <Method View a.a(int)>
	//   27   66:putfield        #136 <Field View e>
		f = a1.a(0x7f0902a9);
	//   28   69:aload_0         
	//   29   70:aload_1         
	//   30   71:ldc1            #137 <Int 0x7f0902a9>
	//   31   73:invokeinterface #115 <Method View a.a(int)>
	//   32   78:putfield        #139 <Field View f>
		g = a1.a(0x7f0900ac);
	//   33   81:aload_0         
	//   34   82:aload_1         
	//   35   83:ldc1            #140 <Int 0x7f0900ac>
	//   36   85:invokeinterface #115 <Method View a.a(int)>
	//   37   90:putfield        #143 <Field View g>
		h = a1.a(0x7f090165);
	//   38   93:aload_0         
	//   39   94:aload_1         
	//   40   95:ldc1            #144 <Int 0x7f090165>
	//   41   97:invokeinterface #115 <Method View a.a(int)>
	//   42  102:putfield        #147 <Field View h>
		i = a1.a(0x7f0902aa);
	//   43  105:aload_0         
	//   44  106:aload_1         
	//   45  107:ldc1            #148 <Int 0x7f0902aa>
	//   46  109:invokeinterface #115 <Method View a.a(int)>
	//   47  114:putfield        #151 <Field View i>
		j = a1.a(0x7f090140);
	//   48  117:aload_0         
	//   49  118:aload_1         
	//   50  119:ldc1            #152 <Int 0x7f090140>
	//   51  121:invokeinterface #115 <Method View a.a(int)>
	//   52  126:putfield        #154 <Field View j>
		if(d != null)
	//*  53  129:aload_0         
	//*  54  130:getfield        #132 <Field View d>
	//*  55  133:ifnull          151
			d.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ContactTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void ContactTableViewActivity_.g()>
				//    3    7:return          
				}

				final ContactTableViewActivity_ a;

			
			{
				a = ContactTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field ContactTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   56  136:aload_0         
	//   57  137:getfield        #132 <Field View d>
	//   58  140:new             #10  <Class ContactTableViewActivity_$1>
	//   59  143:dup             
	//   60  144:aload_0         
	//   61  145:invokespecial   #156 <Method void ContactTableViewActivity_$1(ContactTableViewActivity_)>
	//   62  148:invokevirtual   #162 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(e != null)
	//*  63  151:aload_0         
	//*  64  152:getfield        #136 <Field View e>
	//*  65  155:ifnull          173
			e.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ContactTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void ContactTableViewActivity_.h()>
				//    3    7:return          
				}

				final ContactTableViewActivity_ a;

			
			{
				a = ContactTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field ContactTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   66  158:aload_0         
	//   67  159:getfield        #136 <Field View e>
	//   68  162:new             #12  <Class ContactTableViewActivity_$2>
	//   69  165:dup             
	//   70  166:aload_0         
	//   71  167:invokespecial   #163 <Method void ContactTableViewActivity_$2(ContactTableViewActivity_)>
	//   72  170:invokevirtual   #162 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(f != null)
	//*  73  173:aload_0         
	//*  74  174:getfield        #139 <Field View f>
	//*  75  177:ifnull          195
			f.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.i();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ContactTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void ContactTableViewActivity_.i()>
				//    3    7:return          
				}

				final ContactTableViewActivity_ a;

			
			{
				a = ContactTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field ContactTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   76  180:aload_0         
	//   77  181:getfield        #139 <Field View f>
	//   78  184:new             #14  <Class ContactTableViewActivity_$3>
	//   79  187:dup             
	//   80  188:aload_0         
	//   81  189:invokespecial   #164 <Method void ContactTableViewActivity_$3(ContactTableViewActivity_)>
	//   82  192:invokevirtual   #162 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   83  195:aload_0         
	//   84  196:invokevirtual   #166 <Method void e()>
	//   85  199:return          
	}

	public void f()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.ContactTableViewActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ContactTableViewActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.ContactTableViewActivity_.a(ContactTableViewActivity_)>
			//    3    7:return          
			}

			final ContactTableViewActivity_ a;

			
			{
				a = ContactTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ContactTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #102 <String "">
	//    1    2:new             #16  <Class ContactTableViewActivity_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #167 <Method void ContactTableViewActivity_$4(ContactTableViewActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #109 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void j()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.ContactTableViewActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ContactTableViewActivity_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.ContactTableViewActivity_.b(ContactTableViewActivity_)>
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

			final ContactTableViewActivity_ a;

			
			{
				a = ContactTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ContactTableViewActivity_ a>
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
	//    0    0:new             #22  <Class ContactTableViewActivity_$7>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #102 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #102 <String "">
	//    6   10:invokespecial   #170 <Method void ContactTableViewActivity_$7(ContactTableViewActivity_, String, long, String)>
	//    7   13:invokestatic    #175 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(o);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field c o>
	//    2    4:invokestatic    #179 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #181 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #183 <Method void ContactTableViewActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #179 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0036);
	//   13   23:aload_0         
	//   14   24:ldc1            #184 <Int 0x7f0b0036>
	//   15   26:invokevirtual   #188 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #189 <Method void ContactTableViewActivity.setContentView(int)>
		o.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field c o>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #191 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #194 <Method void ContactTableViewActivity.setContentView(View)>
		o.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field c o>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #191 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #197 <Method void ContactTableViewActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		o.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #36  <Field c o>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #191 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #201 <Method void ContactTableViewActivity.setIntent(Intent)>
		k();
	//    3    5:aload_0         
	//    4    6:invokespecial   #48  <Method void k()>
	//    5    9:return          
	}

	private final c o = new c();
}
