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
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.irobot.home.view.CustomTextView;
import java.util.ArrayList;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			NotificationDetailsActivity

public final class NotificationDetailsActivity_ extends NotificationDetailsActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(long l)
		{
			return (a)super.a("timestamp", l);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "timestamp">
		//    2    3:lload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, long)>
		//    4    7:checkcast       #2   <Class NotificationDetailsActivity_$a>
		//    5   10:areturn         
		}

		public a a(String s)
		{
			return (a)super.a("type", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #27  <String "type">
		//    2    3:aload_1         
		//    3    4:invokespecial   #30  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class NotificationDetailsActivity_$a>
		//    5   10:areturn         
		}

		public a a(ArrayList arraylist)
		{
			return (a)super.a("payLoadMap", ((java.io.Serializable) (arraylist)));
		//    0    0:aload_0         
		//    1    1:ldc1            #33  <String "payLoadMap">
		//    2    3:aload_1         
		//    3    4:invokespecial   #36  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, java.io.Serializable)>
		//    4    7:checkcast       #2   <Class NotificationDetailsActivity_$a>
		//    5   10:areturn         
		}

		public e a(int i)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #41  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i);
		//    3    7:aload_0         
		//    4    8:getfield        #41  <Field Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #45  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #51  <Method void Fragment.startActivityForResult(Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #53  <Field android.app.Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, i, a);
		//   13   29:aload_0         
		//   14   30:getfield        #53  <Field android.app.Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #45  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #56  <Field Bundle a>
		//   20   42:invokevirtual   #61  <Method void android.app.Fragment.startActivityForResult(Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #65  <Field Context b>
		//*  24   52:instanceof      #67  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, i, a);
		//   26   58:aload_0         
		//   27   59:getfield        #65  <Field Context b>
		//   28   62:checkcast       #67  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #45  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #56  <Field Bundle a>
		//   34   74:invokestatic    #72  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #65  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #45  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #56  <Field Bundle a>
		//   42   92:invokevirtual   #78  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #80  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #65  <Field Context b>
		//   47  103:invokespecial   #82  <Method void e(Context)>
		//   48  106:areturn         
		}

		public a b(int i)
		{
			return (a)super.a("detailsContentId", i);
		//    0    0:aload_0         
		//    1    1:ldc1            #85  <String "detailsContentId">
		//    2    3:iload_1         
		//    3    4:invokespecial   #88  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, int)>
		//    4    7:checkcast       #2   <Class NotificationDetailsActivity_$a>
		//    5   10:areturn         
		}

		public a b(String s)
		{
			return (a)super.a("categoryIconId", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #90  <String "categoryIconId">
		//    2    3:aload_1         
		//    3    4:invokespecial   #30  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class NotificationDetailsActivity_$a>
		//    5   10:areturn         
		}

		public a c(int i)
		{
			return (a)super.a("detailsContentVersion", i);
		//    0    0:aload_0         
		//    1    1:ldc1            #92  <String "detailsContentVersion">
		//    2    3:iload_1         
		//    3    4:invokespecial   #88  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, int)>
		//    4    7:checkcast       #2   <Class NotificationDetailsActivity_$a>
		//    5   10:areturn         
		}

		public a c(String s)
		{
			return (a)super.a("headlineText", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #94  <String "headlineText">
		//    2    3:aload_1         
		//    3    4:invokespecial   #30  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class NotificationDetailsActivity_$a>
		//    5   10:areturn         
		}

		public a d(String s)
		{
			return (a)super.a("eventId", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #96  <String "eventId">
		//    2    3:aload_1         
		//    3    4:invokespecial   #30  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class NotificationDetailsActivity_$a>
		//    5   10:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/NotificationDetailsActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class NotificationDetailsActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public NotificationDetailsActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void NotificationDetailsActivity()>
	//    2    4:aload_0         
	//    3    5:new             #29  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void c()>
	//    6   12:putfield        #32  <Field c v>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #20  <Class NotificationDetailsActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #37  <Method void NotificationDetailsActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #41  <Method void c.a(b)>
		j();
	//    2    4:aload_0         
	//    3    5:invokespecial   #44  <Method void j()>
	//    4    8:return          
	}

	static void a(NotificationDetailsActivity_ notificationdetailsactivity_)
	{
		((NotificationDetailsActivity) (notificationdetailsactivity_)).NotificationDetailsActivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void NotificationDetailsActivity.g()>
	//    2    4:return          
	}

	static void a(NotificationDetailsActivity_ notificationdetailsactivity_, boolean flag)
	{
		((NotificationDetailsActivity) (notificationdetailsactivity_)).com.irobot.home.NotificationDetailsActivity.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #52  <Method void com.irobot.home.NotificationDetailsActivity.a(boolean)>
	//    3    5:return          
	}

	private void j()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #56  <Method Intent getIntent()>
	//    2    4:invokevirtual   #62  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          167
		{
			if(bundle.containsKey("type"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #64  <String "type">
	//*   8   15:invokevirtual   #70  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				c = bundle.getString("type");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #64  <String "type">
	//   13   25:invokevirtual   #74  <Method String Bundle.getString(String)>
	//   14   28:putfield        #78  <Field String c>
			if(bundle.containsKey("categoryIconId"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #80  <String "categoryIconId">
	//*  17   34:invokevirtual   #70  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				d = bundle.getString("categoryIconId");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #80  <String "categoryIconId">
	//   22   44:invokevirtual   #74  <Method String Bundle.getString(String)>
	//   23   47:putfield        #83  <Field String d>
			if(bundle.containsKey("headlineText"))
	//*  24   50:aload_1         
	//*  25   51:ldc1            #85  <String "headlineText">
	//*  26   53:invokevirtual   #70  <Method boolean Bundle.containsKey(String)>
	//*  27   56:ifeq            69
				e = bundle.getString("headlineText");
	//   28   59:aload_0         
	//   29   60:aload_1         
	//   30   61:ldc1            #85  <String "headlineText">
	//   31   63:invokevirtual   #74  <Method String Bundle.getString(String)>
	//   32   66:putfield        #88  <Field String e>
			if(bundle.containsKey("timestamp"))
	//*  33   69:aload_1         
	//*  34   70:ldc1            #90  <String "timestamp">
	//*  35   72:invokevirtual   #70  <Method boolean Bundle.containsKey(String)>
	//*  36   75:ifeq            88
				f = bundle.getLong("timestamp");
	//   37   78:aload_0         
	//   38   79:aload_1         
	//   39   80:ldc1            #90  <String "timestamp">
	//   40   82:invokevirtual   #94  <Method long Bundle.getLong(String)>
	//   41   85:putfield        #98  <Field long f>
			if(bundle.containsKey("eventId"))
	//*  42   88:aload_1         
	//*  43   89:ldc1            #100 <String "eventId">
	//*  44   91:invokevirtual   #70  <Method boolean Bundle.containsKey(String)>
	//*  45   94:ifeq            107
				g = bundle.getString("eventId");
	//   46   97:aload_0         
	//   47   98:aload_1         
	//   48   99:ldc1            #100 <String "eventId">
	//   49  101:invokevirtual   #74  <Method String Bundle.getString(String)>
	//   50  104:putfield        #102 <Field String g>
			if(bundle.containsKey("detailsContentId"))
	//*  51  107:aload_1         
	//*  52  108:ldc1            #104 <String "detailsContentId">
	//*  53  110:invokevirtual   #70  <Method boolean Bundle.containsKey(String)>
	//*  54  113:ifeq            126
				h = bundle.getInt("detailsContentId");
	//   55  116:aload_0         
	//   56  117:aload_1         
	//   57  118:ldc1            #104 <String "detailsContentId">
	//   58  120:invokevirtual   #108 <Method int Bundle.getInt(String)>
	//   59  123:putfield        #112 <Field int h>
			if(bundle.containsKey("detailsContentVersion"))
	//*  60  126:aload_1         
	//*  61  127:ldc1            #114 <String "detailsContentVersion">
	//*  62  129:invokevirtual   #70  <Method boolean Bundle.containsKey(String)>
	//*  63  132:ifeq            145
				i = bundle.getInt("detailsContentVersion");
	//   64  135:aload_0         
	//   65  136:aload_1         
	//   66  137:ldc1            #114 <String "detailsContentVersion">
	//   67  139:invokevirtual   #108 <Method int Bundle.getInt(String)>
	//   68  142:putfield        #117 <Field int i>
			if(bundle.containsKey("payLoadMap"))
	//*  69  145:aload_1         
	//*  70  146:ldc1            #119 <String "payLoadMap">
	//*  71  148:invokevirtual   #70  <Method boolean Bundle.containsKey(String)>
	//*  72  151:ifeq            167
				j = (ArrayList)bundle.getSerializable("payLoadMap");
	//   73  154:aload_0         
	//   74  155:aload_1         
	//   75  156:ldc1            #119 <String "payLoadMap">
	//   76  158:invokevirtual   #123 <Method java.io.Serializable Bundle.getSerializable(String)>
	//   77  161:checkcast       #125 <Class ArrayList>
	//   78  164:putfield        #128 <Field ArrayList j>
		}
	//   79  167:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #132 <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (LinearLayout)a1.a(0x7f090293);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #136 <Int 0x7f090293>
	//    3    4:invokeinterface #138 <Method View a.a(int)>
	//    4    9:checkcast       #140 <Class LinearLayout>
	//    5   12:putfield        #143 <Field LinearLayout a>
		b = (ImageView)a1.a(0x7f09005d);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #144 <Int 0x7f09005d>
	//    9   19:invokeinterface #138 <Method View a.a(int)>
	//   10   24:checkcast       #146 <Class ImageView>
	//   11   27:putfield        #150 <Field ImageView b>
		k = (CustomTextView)a1.a(0x7f09029e);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #151 <Int 0x7f09029e>
	//   15   34:invokeinterface #138 <Method View a.a(int)>
	//   16   39:checkcast       #153 <Class CustomTextView>
	//   17   42:putfield        #157 <Field CustomTextView k>
		l = (CustomTextView)a1.a(0x7f09029b);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #158 <Int 0x7f09029b>
	//   21   49:invokeinterface #138 <Method View a.a(int)>
	//   22   54:checkcast       #153 <Class CustomTextView>
	//   23   57:putfield        #161 <Field CustomTextView l>
		m = (CustomTextView)a1.a(0x7f090185);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #162 <Int 0x7f090185>
	//   27   64:invokeinterface #138 <Method View a.a(int)>
	//   28   69:checkcast       #153 <Class CustomTextView>
	//   29   72:putfield        #165 <Field CustomTextView m>
		n = (ImageView)a1.a(0x7f090298);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #166 <Int 0x7f090298>
	//   33   79:invokeinterface #138 <Method View a.a(int)>
	//   34   84:checkcast       #146 <Class ImageView>
	//   35   87:putfield        #169 <Field ImageView n>
		o = (LinearLayout)a1.a(0x7f0901bf);
	//   36   90:aload_0         
	//   37   91:aload_1         
	//   38   92:ldc1            #170 <Int 0x7f0901bf>
	//   39   94:invokeinterface #138 <Method View a.a(int)>
	//   40   99:checkcast       #140 <Class LinearLayout>
	//   41  102:putfield        #173 <Field LinearLayout o>
		t = (LinearLayout)a1.a(0x7f09028e);
	//   42  105:aload_0         
	//   43  106:aload_1         
	//   44  107:ldc1            #174 <Int 0x7f09028e>
	//   45  109:invokeinterface #138 <Method View a.a(int)>
	//   46  114:checkcast       #140 <Class LinearLayout>
	//   47  117:putfield        #177 <Field LinearLayout t>
		u = (LinearLayout)a1.a(0x7f090187);
	//   48  120:aload_0         
	//   49  121:aload_1         
	//   50  122:ldc1            #178 <Int 0x7f090187>
	//   51  124:invokeinterface #138 <Method View a.a(int)>
	//   52  129:checkcast       #140 <Class LinearLayout>
	//   53  132:putfield        #181 <Field LinearLayout u>
		if(b != null)
	//*  54  135:aload_0         
	//*  55  136:getfield        #150 <Field ImageView b>
	//*  56  139:ifnull          157
			b.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field NotificationDetailsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void NotificationDetailsActivity_.f()>
				//    3    7:return          
				}

				final NotificationDetailsActivity_ a;

			
			{
				a = NotificationDetailsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field NotificationDetailsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   57  142:aload_0         
	//   58  143:getfield        #150 <Field ImageView b>
	//   59  146:new             #10  <Class NotificationDetailsActivity_$1>
	//   60  149:dup             
	//   61  150:aload_0         
	//   62  151:invokespecial   #183 <Method void NotificationDetailsActivity_$1(NotificationDetailsActivity_)>
	//   63  154:invokevirtual   #187 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		if(o != null)
	//*  64  157:aload_0         
	//*  65  158:getfield        #173 <Field LinearLayout o>
	//*  66  161:ifnull          179
			o.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field NotificationDetailsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void NotificationDetailsActivity_.h()>
				//    3    7:return          
				}

				final NotificationDetailsActivity_ a;

			
			{
				a = NotificationDetailsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field NotificationDetailsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   67  164:aload_0         
	//   68  165:getfield        #173 <Field LinearLayout o>
	//   69  168:new             #12  <Class NotificationDetailsActivity_$2>
	//   70  171:dup             
	//   71  172:aload_0         
	//   72  173:invokespecial   #188 <Method void NotificationDetailsActivity_$2(NotificationDetailsActivity_)>
	//   73  176:invokevirtual   #189 <Method void LinearLayout.setOnClickListener(android.view.View$OnClickListener)>
		if(t != null)
	//*  74  179:aload_0         
	//*  75  180:getfield        #177 <Field LinearLayout t>
	//*  76  183:ifnull          201
			t.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.i();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field NotificationDetailsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void NotificationDetailsActivity_.i()>
				//    3    7:return          
				}

				final NotificationDetailsActivity_ a;

			
			{
				a = NotificationDetailsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field NotificationDetailsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   77  186:aload_0         
	//   78  187:getfield        #177 <Field LinearLayout t>
	//   79  190:new             #14  <Class NotificationDetailsActivity_$3>
	//   80  193:dup             
	//   81  194:aload_0         
	//   82  195:invokespecial   #190 <Method void NotificationDetailsActivity_$3(NotificationDetailsActivity_)>
	//   83  198:invokevirtual   #189 <Method void LinearLayout.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   84  201:aload_0         
	//   85  202:invokevirtual   #192 <Method void e()>
	//   86  205:return          
	}

	public void a(boolean flag)
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "", flag) {

			public void a()
			{
				try
				{
					com.irobot.home.NotificationDetailsActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field NotificationDetailsActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #18  <Field boolean a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.NotificationDetailsActivity_.a(NotificationDetailsActivity_, boolean)>
					return;
			//    5   11:return          
				}
				catch(Throwable throwable)
			//*   6   12:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    7   13:invokestatic    #34  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    8   16:invokestatic    #38  <Method Thread Thread.currentThread()>
			//    9   19:aload_1         
			//   10   20:invokeinterface #44  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//   11   25:return          
			}

			final boolean a;
			final NotificationDetailsActivity_ b;

			
			{
				b = NotificationDetailsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field NotificationDetailsActivity_ b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload           6
			//    5    8:putfield        #18  <Field boolean a>
				super(s, l, s1);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:lload_3         
			//    9   14:aload           5
			//   10   16:invokespecial   #21  <Method void org.androidannotations.api.a$a(String, long, String)>
			//   11   19:return          
			}
		}
)));
	//    0    0:new             #18  <Class NotificationDetailsActivity_$5>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #194 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #194 <String "">
	//    6   10:iload_1         
	//    7   11:invokespecial   #197 <Method void NotificationDetailsActivity_$5(NotificationDetailsActivity_, String, long, String, boolean)>
	//    8   14:invokestatic    #202 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    9   17:return          
	}

	public void g()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.NotificationDetailsActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field NotificationDetailsActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.NotificationDetailsActivity_.a(NotificationDetailsActivity_)>
					return;
			//    3    7:return          
				}
				catch(Throwable throwable)
			//*   4    8:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    5    9:invokestatic    #30  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    6   12:invokestatic    #34  <Method Thread Thread.currentThread()>
			//    7   15:aload_1         
			//    8   16:invokeinterface #40  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//    9   21:return          
			}

			final NotificationDetailsActivity_ a;

			
			{
				a = NotificationDetailsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field NotificationDetailsActivity_ a>
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
	//    0    0:new             #16  <Class NotificationDetailsActivity_$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #194 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #194 <String "">
	//    6   10:invokespecial   #205 <Method void NotificationDetailsActivity_$4(NotificationDetailsActivity_, String, long, String)>
	//    7   13:invokestatic    #202 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(v);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field c v>
	//    2    4:invokestatic    #209 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #211 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #213 <Method void NotificationDetailsActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #209 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0057);
	//   13   23:aload_0         
	//   14   24:ldc1            #214 <Int 0x7f0b0057>
	//   15   26:invokevirtual   #218 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #219 <Method void NotificationDetailsActivity.setContentView(int)>
		v.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #32  <Field c v>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #221 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #224 <Method void NotificationDetailsActivity.setContentView(View)>
		v.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #32  <Field c v>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #221 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #227 <Method void NotificationDetailsActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		v.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #32  <Field c v>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #221 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #231 <Method void NotificationDetailsActivity.setIntent(Intent)>
		j();
	//    3    5:aload_0         
	//    4    6:invokespecial   #44  <Method void j()>
	//    5    9:return          
	}

	private final c v = new c();
}
