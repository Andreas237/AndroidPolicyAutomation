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
import android.widget.ImageButton;
import android.widget.TextView;
import com.irobot.core.OnDemandOTAEntryType;
import com.irobot.core.OnDemandOTAPathType;
import com.irobot.core.OnDemandOTAStatus;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			OnDemandOtaActivity, IRobotApplication_

public final class OnDemandOtaActivity_ extends OnDemandOtaActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(OnDemandOTAEntryType ondemandotaentrytype)
		{
			return (a)super.a("entryType", ((java.io.Serializable) (ondemandotaentrytype)));
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "entryType">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, java.io.Serializable)>
		//    4    7:checkcast       #2   <Class OnDemandOtaActivity_$a>
		//    5   10:areturn         
		}

		public a a(OnDemandOTAPathType ondemandotapathtype)
		{
			return (a)super.a("pathType", ((java.io.Serializable) (ondemandotapathtype)));
		//    0    0:aload_0         
		//    1    1:ldc1            #27  <String "pathType">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, java.io.Serializable)>
		//    4    7:checkcast       #2   <Class OnDemandOtaActivity_$a>
		//    5   10:areturn         
		}

		public a a(OnDemandOTAStatus ondemandotastatus)
		{
			return (a)super.a("otaStatus", ((java.io.Serializable) (ondemandotastatus)));
		//    0    0:aload_0         
		//    1    1:ldc1            #30  <String "otaStatus">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, java.io.Serializable)>
		//    4    7:checkcast       #2   <Class OnDemandOtaActivity_$a>
		//    5   10:areturn         
		}

		public a a(String s)
		{
			return (a)super.a("assetId", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #33  <String "assetId">
		//    2    3:aload_1         
		//    3    4:invokespecial   #36  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class OnDemandOtaActivity_$a>
		//    5   10:areturn         
		}

		public a a(boolean flag)
		{
			return (a)super.a("skipSoftwareUpdateCheck", flag);
		//    0    0:aload_0         
		//    1    1:ldc1            #39  <String "skipSoftwareUpdateCheck">
		//    2    3:iload_1         
		//    3    4:invokespecial   #42  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, boolean)>
		//    4    7:checkcast       #2   <Class OnDemandOtaActivity_$a>
		//    5   10:areturn         
		}

		public e a(int j)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #45  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, j);
		//    3    7:aload_0         
		//    4    8:getfield        #45  <Field Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #49  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #55  <Method void Fragment.startActivityForResult(Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #57  <Field android.app.Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, j, a);
		//   13   29:aload_0         
		//   14   30:getfield        #57  <Field android.app.Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #49  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #60  <Field Bundle a>
		//   20   42:invokevirtual   #65  <Method void android.app.Fragment.startActivityForResult(Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #69  <Field Context b>
		//*  24   52:instanceof      #71  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, j, a);
		//   26   58:aload_0         
		//   27   59:getfield        #69  <Field Context b>
		//   28   62:checkcast       #71  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #49  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #60  <Field Bundle a>
		//   34   74:invokestatic    #76  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #69  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #49  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #60  <Field Bundle a>
		//   42   92:invokevirtual   #82  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #84  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #69  <Field Context b>
		//   47  103:invokespecial   #86  <Method void e(Context)>
		//   48  106:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/OnDemandOtaActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class OnDemandOtaActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public OnDemandOtaActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void OnDemandOtaActivity()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void c()>
	//    6   12:putfield        #26  <Field c i>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #14  <Class OnDemandOtaActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #31  <Method void OnDemandOtaActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #35  <Method void c.a(b)>
		a = IRobotApplication_.r();
	//    2    4:aload_0         
	//    3    5:invokestatic    #41  <Method IRobotApplication IRobotApplication_.r()>
	//    4    8:putfield        #44  <Field IRobotApplication a>
		l();
	//    5   11:aload_0         
	//    6   12:invokespecial   #47  <Method void l()>
	//    7   15:return          
	}

	static void a(OnDemandOtaActivity_ ondemandotaactivity_, boolean flag)
	{
		((OnDemandOtaActivity) (ondemandotaactivity_)).com.irobot.home.OnDemandOtaActivity.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #51  <Method void com.irobot.home.OnDemandOtaActivity.a(boolean)>
	//    3    5:return          
	}

	private void l()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method Intent getIntent()>
	//    2    4:invokevirtual   #61  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          116
		{
			if(bundle.containsKey("assetId"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #63  <String "assetId">
	//*   8   15:invokevirtual   #69  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				b = bundle.getString("assetId");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #63  <String "assetId">
	//   13   25:invokevirtual   #73  <Method String Bundle.getString(String)>
	//   14   28:putfield        #77  <Field String b>
			if(bundle.containsKey("entryType"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #79  <String "entryType">
	//*  17   34:invokevirtual   #69  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            53
				c = (OnDemandOTAEntryType)bundle.getSerializable("entryType");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #79  <String "entryType">
	//   22   44:invokevirtual   #83  <Method java.io.Serializable Bundle.getSerializable(String)>
	//   23   47:checkcast       #85  <Class OnDemandOTAEntryType>
	//   24   50:putfield        #89  <Field OnDemandOTAEntryType c>
			if(bundle.containsKey("pathType"))
	//*  25   53:aload_1         
	//*  26   54:ldc1            #91  <String "pathType">
	//*  27   56:invokevirtual   #69  <Method boolean Bundle.containsKey(String)>
	//*  28   59:ifeq            75
				d = (OnDemandOTAPathType)bundle.getSerializable("pathType");
	//   29   62:aload_0         
	//   30   63:aload_1         
	//   31   64:ldc1            #91  <String "pathType">
	//   32   66:invokevirtual   #83  <Method java.io.Serializable Bundle.getSerializable(String)>
	//   33   69:checkcast       #93  <Class OnDemandOTAPathType>
	//   34   72:putfield        #97  <Field OnDemandOTAPathType d>
			if(bundle.containsKey("otaStatus"))
	//*  35   75:aload_1         
	//*  36   76:ldc1            #99  <String "otaStatus">
	//*  37   78:invokevirtual   #69  <Method boolean Bundle.containsKey(String)>
	//*  38   81:ifeq            97
				e = (OnDemandOTAStatus)bundle.getSerializable("otaStatus");
	//   39   84:aload_0         
	//   40   85:aload_1         
	//   41   86:ldc1            #99  <String "otaStatus">
	//   42   88:invokevirtual   #83  <Method java.io.Serializable Bundle.getSerializable(String)>
	//   43   91:checkcast       #101 <Class OnDemandOTAStatus>
	//   44   94:putfield        #105 <Field OnDemandOTAStatus e>
			if(bundle.containsKey("skipSoftwareUpdateCheck"))
	//*  45   97:aload_1         
	//*  46   98:ldc1            #107 <String "skipSoftwareUpdateCheck">
	//*  47  100:invokevirtual   #69  <Method boolean Bundle.containsKey(String)>
	//*  48  103:ifeq            116
				f = bundle.getBoolean("skipSoftwareUpdateCheck");
	//   49  106:aload_0         
	//   50  107:aload_1         
	//   51  108:ldc1            #107 <String "skipSoftwareUpdateCheck">
	//   52  110:invokevirtual   #110 <Method boolean Bundle.getBoolean(String)>
	//   53  113:putfield        #114 <Field boolean f>
		}
	//   54  116:return          
	}

	public View a(int j)
	{
		return findViewById(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #118 <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		g = (TextView)a1.a(0x7f0901b7);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #122 <Int 0x7f0901b7>
	//    3    4:invokeinterface #124 <Method View a.a(int)>
	//    4    9:checkcast       #126 <Class TextView>
	//    5   12:putfield        #130 <Field TextView g>
		h = (ImageButton)a1.a(0x7f0901b0);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #131 <Int 0x7f0901b0>
	//    9   19:invokeinterface #124 <Method View a.a(int)>
	//   10   24:checkcast       #133 <Class ImageButton>
	//   11   27:putfield        #137 <Field ImageButton h>
		if(h != null)
	//*  12   30:aload_0         
	//*  13   31:getfield        #137 <Field ImageButton h>
	//*  14   34:ifnull          52
			h.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.k();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field OnDemandOtaActivity_ a>
				//    2    4:invokevirtual   #25  <Method void OnDemandOtaActivity_.k()>
				//    3    7:return          
				}

				final OnDemandOtaActivity_ a;

			
			{
				a = OnDemandOtaActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field OnDemandOtaActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   15   37:aload_0         
	//   16   38:getfield        #137 <Field ImageButton h>
	//   17   41:new             #10  <Class OnDemandOtaActivity_$1>
	//   18   44:dup             
	//   19   45:aload_0         
	//   20   46:invokespecial   #140 <Method void OnDemandOtaActivity_$1(OnDemandOtaActivity_)>
	//   21   49:invokevirtual   #144 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   22   52:aload_0         
	//   23   53:invokevirtual   #146 <Method void e()>
	//   24   56:return          
	}

	public void a(boolean flag)
	{
		org.androidannotations.api.b.a("", new Runnable(flag) {

			public void run()
			{
				com.irobot.home.OnDemandOtaActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field OnDemandOtaActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field boolean a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.OnDemandOtaActivity_.a(OnDemandOtaActivity_, boolean)>
			//    5   11:return          
			}

			final boolean a;
			final OnDemandOtaActivity_ b;

			
			{
				b = OnDemandOtaActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field OnDemandOtaActivity_ b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #20  <Field boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #148 <String "">
	//    1    2:new             #12  <Class OnDemandOtaActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #150 <Method void OnDemandOtaActivity_$2(OnDemandOtaActivity_, boolean)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #155 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field c i>
	//    2    4:invokestatic    #159 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #161 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #163 <Method void OnDemandOtaActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #159 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0059);
	//   13   23:aload_0         
	//   14   24:ldc1            #164 <Int 0x7f0b0059>
	//   15   26:invokevirtual   #168 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int j)
	{
		super.setContentView(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #169 <Method void OnDemandOtaActivity.setContentView(int)>
		i.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field c i>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #171 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #174 <Method void OnDemandOtaActivity.setContentView(View)>
		i.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field c i>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #171 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #177 <Method void OnDemandOtaActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		i.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field c i>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #171 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #181 <Method void OnDemandOtaActivity.setIntent(Intent)>
		l();
	//    3    5:aload_0         
	//    4    6:invokespecial   #47  <Method void l()>
	//    5    9:return          
	}

	private final c i = new c();
}
