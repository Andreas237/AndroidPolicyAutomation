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
import com.irobot.home.view.CustomEditTextView;
import com.irobot.home.view.CustomTextView;
import java.util.ArrayList;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			DuplicateRegionNameActivity

public final class DuplicateRegionNameActivity_ extends DuplicateRegionNameActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(String s)
		{
			return (a)super.a("usedRegionName", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "usedRegionName">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class DuplicateRegionNameActivity_$a>
		//    5   10:areturn         
		}

		public a a(ArrayList arraylist)
		{
			return (a)super.a("regionNames", ((java.io.Serializable) (arraylist)));
		//    0    0:aload_0         
		//    1    1:ldc1            #27  <String "regionNames">
		//    2    3:aload_1         
		//    3    4:invokespecial   #30  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, java.io.Serializable)>
		//    4    7:checkcast       #2   <Class DuplicateRegionNameActivity_$a>
		//    5   10:areturn         
		}

		public a a(boolean flag)
		{
			return (a)super.a("enteredFromCustomTypeFlow", flag);
		//    0    0:aload_0         
		//    1    1:ldc1            #35  <String "enteredFromCustomTypeFlow">
		//    2    3:iload_1         
		//    3    4:invokespecial   #38  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, boolean)>
		//    4    7:checkcast       #2   <Class DuplicateRegionNameActivity_$a>
		//    5   10:areturn         
		}

		public e a(int j)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #41  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, j);
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
				d.startActivityForResult(c, j, a);
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
				ActivityCompat.startActivityForResult((Activity)b, c, j, a);
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

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/DuplicateRegionNameActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class DuplicateRegionNameActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public DuplicateRegionNameActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void DuplicateRegionNameActivity()>
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
	//    0    0:new             #14  <Class DuplicateRegionNameActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #31  <Method void DuplicateRegionNameActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #35  <Method void c.a(b)>
		h();
	//    2    4:aload_0         
	//    3    5:invokespecial   #38  <Method void h()>
	//    4    8:return          
	}

	private void h()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method Intent getIntent()>
	//    2    4:invokevirtual   #48  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          88
		{
			if(bundle.containsKey("usedRegionName"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #50  <String "usedRegionName">
	//*   8   15:invokevirtual   #56  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				a = bundle.getString("usedRegionName");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #50  <String "usedRegionName">
	//   13   25:invokevirtual   #60  <Method String Bundle.getString(String)>
	//   14   28:putfield        #63  <Field String a>
			if(bundle.containsKey("previousRegionId"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #65  <String "previousRegionId">
	//*  17   34:invokevirtual   #56  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				b = bundle.getString("previousRegionId");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #65  <String "previousRegionId">
	//   22   44:invokevirtual   #60  <Method String Bundle.getString(String)>
	//   23   47:putfield        #68  <Field String b>
			if(bundle.containsKey("regionNames"))
	//*  24   50:aload_1         
	//*  25   51:ldc1            #70  <String "regionNames">
	//*  26   53:invokevirtual   #56  <Method boolean Bundle.containsKey(String)>
	//*  27   56:ifeq            69
				c = bundle.getStringArrayList("regionNames");
	//   28   59:aload_0         
	//   29   60:aload_1         
	//   30   61:ldc1            #70  <String "regionNames">
	//   31   63:invokevirtual   #74  <Method ArrayList Bundle.getStringArrayList(String)>
	//   32   66:putfield        #78  <Field ArrayList c>
			if(bundle.containsKey("enteredFromCustomTypeFlow"))
	//*  33   69:aload_1         
	//*  34   70:ldc1            #80  <String "enteredFromCustomTypeFlow">
	//*  35   72:invokevirtual   #56  <Method boolean Bundle.containsKey(String)>
	//*  36   75:ifeq            88
				d = bundle.getBoolean("enteredFromCustomTypeFlow");
	//   37   78:aload_0         
	//   38   79:aload_1         
	//   39   80:ldc1            #80  <String "enteredFromCustomTypeFlow">
	//   40   82:invokevirtual   #83  <Method boolean Bundle.getBoolean(String)>
	//   41   85:putfield        #87  <Field boolean d>
		}
	//   42   88:return          
	}

	public View a(int j)
	{
		return findViewById(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #91  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		e = (CustomEditTextView)a1.a(0x7f090175);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #95  <Int 0x7f090175>
	//    3    4:invokeinterface #97  <Method View a.a(int)>
	//    4    9:checkcast       #99  <Class CustomEditTextView>
	//    5   12:putfield        #103 <Field CustomEditTextView e>
		f = (CustomTextView)a1.a(0x7f09030c);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #104 <Int 0x7f09030c>
	//    9   19:invokeinterface #97  <Method View a.a(int)>
	//   10   24:checkcast       #106 <Class CustomTextView>
	//   11   27:putfield        #110 <Field CustomTextView f>
		g = (ImageButton)a1.a(0x7f0900fb);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #111 <Int 0x7f0900fb>
	//   15   34:invokeinterface #97  <Method View a.a(int)>
	//   16   39:checkcast       #113 <Class ImageButton>
	//   17   42:putfield        #117 <Field ImageButton g>
		h = (CustomTextView)a1.a(0x7f0900bd);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #118 <Int 0x7f0900bd>
	//   21   49:invokeinterface #97  <Method View a.a(int)>
	//   22   54:checkcast       #106 <Class CustomTextView>
	//   23   57:putfield        #120 <Field CustomTextView h>
		if(h != null)
	//*  24   60:aload_0         
	//*  25   61:getfield        #120 <Field CustomTextView h>
	//*  26   64:ifnull          82
			h.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DuplicateRegionNameActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DuplicateRegionNameActivity_.f()>
				//    3    7:return          
				}

				final DuplicateRegionNameActivity_ a;

			
			{
				a = DuplicateRegionNameActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DuplicateRegionNameActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   27   67:aload_0         
	//   28   68:getfield        #120 <Field CustomTextView h>
	//   29   71:new             #10  <Class DuplicateRegionNameActivity_$1>
	//   30   74:dup             
	//   31   75:aload_0         
	//   32   76:invokespecial   #123 <Method void DuplicateRegionNameActivity_$1(DuplicateRegionNameActivity_)>
	//   33   79:invokevirtual   #127 <Method void CustomTextView.setOnClickListener(android.view.View$OnClickListener)>
		if(g != null)
	//*  34   82:aload_0         
	//*  35   83:getfield        #117 <Field ImageButton g>
	//*  36   86:ifnull          104
			g.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DuplicateRegionNameActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DuplicateRegionNameActivity_.g()>
				//    3    7:return          
				}

				final DuplicateRegionNameActivity_ a;

			
			{
				a = DuplicateRegionNameActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DuplicateRegionNameActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   37   89:aload_0         
	//   38   90:getfield        #117 <Field ImageButton g>
	//   39   93:new             #12  <Class DuplicateRegionNameActivity_$2>
	//   40   96:dup             
	//   41   97:aload_0         
	//   42   98:invokespecial   #128 <Method void DuplicateRegionNameActivity_$2(DuplicateRegionNameActivity_)>
	//   43  101:invokevirtual   #129 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   44  104:aload_0         
	//   45  105:invokevirtual   #131 <Method void e()>
	//   46  108:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field c i>
	//    2    4:invokestatic    #135 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #137 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #139 <Method void DuplicateRegionNameActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #135 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b003e);
	//   13   23:aload_0         
	//   14   24:ldc1            #140 <Int 0x7f0b003e>
	//   15   26:invokevirtual   #144 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int j)
	{
		super.setContentView(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #145 <Method void DuplicateRegionNameActivity.setContentView(int)>
		i.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field c i>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #147 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #150 <Method void DuplicateRegionNameActivity.setContentView(View)>
		i.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field c i>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #147 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #153 <Method void DuplicateRegionNameActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		i.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field c i>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #147 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #157 <Method void DuplicateRegionNameActivity.setIntent(Intent)>
		h();
	//    3    5:aload_0         
	//    4    6:invokespecial   #38  <Method void h()>
	//    5    9:return          
	}

	private final c i = new c();
}
