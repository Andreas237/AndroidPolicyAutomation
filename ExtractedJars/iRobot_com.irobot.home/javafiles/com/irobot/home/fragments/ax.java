// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import com.irobot.core.ScheduleLocationType;
import com.irobot.home.view.CustomRadioButton;
import com.irobot.home.view.CustomTextView;
import java.util.ArrayList;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			aw

public final class ax extends aw
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public aw a()
		{
			ax ax1 = new ax();
		//    0    0:new             #7   <Class ax>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void ax()>
		//    3    7:astore_1        
			ax1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void ax.setArguments(Bundle)>
			return ((aw) (ax1));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public a a(int i)
		{
			a.putInt("selectedTextColor", i);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #25  <String "selectedTextColor">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(ScheduleLocationType schedulelocationtype)
		{
			a.putSerializable("locationType", ((java.io.Serializable) (schedulelocationtype)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #34  <String "locationType">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #38  <Method void Bundle.putSerializable(String, java.io.Serializable)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(String s)
		{
			a.putString("incomingMapId", s);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #41  <String "incomingMapId">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #45  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(ArrayList arraylist)
		{
			a.putStringArrayList("incomingSelectedRegionIds", arraylist);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #48  <String "incomingSelectedRegionIds">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #52  <Method void Bundle.putStringArrayList(String, ArrayList)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(boolean flag)
		{
			a.putBoolean("incomingIsOrdered", flag);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #57  <String "incomingIsOrdered">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #61  <Method void Bundle.putBoolean(String, boolean)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a b(int i)
		{
			a.putInt("unselectedTextColor", i);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #64  <String "unselectedTextColor">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a b(boolean flag)
		{
			a.putBoolean("isMapUploadEnabled", flag);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #66  <String "isMapUploadEnabled">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #61  <Method void Bundle.putBoolean(String, boolean)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void org.androidannotations.api.a.c()>
		//    2    4:return          
		}
	}


	public ax()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void aw()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void c()>
	//    6   12:putfield        #26  <Field c t>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #31  <Method void c.a(b)>
		f();
	//    2    4:aload_0         
	//    3    5:invokespecial   #34  <Method void f()>
	//    4    8:return          
	}

	static void a(ax ax1)
	{
		((aw) (ax1)).aw.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void aw.d()>
	//    2    4:return          
	}

	public static a e()
	{
		return new a();
	//    0    0:new             #12  <Class ax$a>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void ax$a()>
	//    3    7:areturn         
	}

	private void f()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          145
		{
			if(bundle.containsKey("locationType"))
	//*   5    9:aload_1         
	//*   6   10:ldc1            #47  <String "locationType">
	//*   7   12:invokevirtual   #53  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            31
				m = (ScheduleLocationType)bundle.getSerializable("locationType");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #47  <String "locationType">
	//   12   22:invokevirtual   #57  <Method java.io.Serializable Bundle.getSerializable(String)>
	//   13   25:checkcast       #59  <Class ScheduleLocationType>
	//   14   28:putfield        #63  <Field ScheduleLocationType m>
			if(bundle.containsKey("incomingSelectedRegionIds"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #65  <String "incomingSelectedRegionIds">
	//*  17   34:invokevirtual   #53  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				n = bundle.getStringArrayList("incomingSelectedRegionIds");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #65  <String "incomingSelectedRegionIds">
	//   22   44:invokevirtual   #69  <Method ArrayList Bundle.getStringArrayList(String)>
	//   23   47:putfield        #73  <Field ArrayList n>
			if(bundle.containsKey("incomingMapId"))
	//*  24   50:aload_1         
	//*  25   51:ldc1            #75  <String "incomingMapId">
	//*  26   53:invokevirtual   #53  <Method boolean Bundle.containsKey(String)>
	//*  27   56:ifeq            69
				o = bundle.getString("incomingMapId");
	//   28   59:aload_0         
	//   29   60:aload_1         
	//   30   61:ldc1            #75  <String "incomingMapId">
	//   31   63:invokevirtual   #79  <Method String Bundle.getString(String)>
	//   32   66:putfield        #83  <Field String o>
			if(bundle.containsKey("selectedTextColor"))
	//*  33   69:aload_1         
	//*  34   70:ldc1            #85  <String "selectedTextColor">
	//*  35   72:invokevirtual   #53  <Method boolean Bundle.containsKey(String)>
	//*  36   75:ifeq            88
				p = bundle.getInt("selectedTextColor");
	//   37   78:aload_0         
	//   38   79:aload_1         
	//   39   80:ldc1            #85  <String "selectedTextColor">
	//   40   82:invokevirtual   #89  <Method int Bundle.getInt(String)>
	//   41   85:putfield        #93  <Field int p>
			if(bundle.containsKey("unselectedTextColor"))
	//*  42   88:aload_1         
	//*  43   89:ldc1            #95  <String "unselectedTextColor">
	//*  44   91:invokevirtual   #53  <Method boolean Bundle.containsKey(String)>
	//*  45   94:ifeq            107
				q = bundle.getInt("unselectedTextColor");
	//   46   97:aload_0         
	//   47   98:aload_1         
	//   48   99:ldc1            #95  <String "unselectedTextColor">
	//   49  101:invokevirtual   #89  <Method int Bundle.getInt(String)>
	//   50  104:putfield        #98  <Field int q>
			if(bundle.containsKey("incomingIsOrdered"))
	//*  51  107:aload_1         
	//*  52  108:ldc1            #100 <String "incomingIsOrdered">
	//*  53  110:invokevirtual   #53  <Method boolean Bundle.containsKey(String)>
	//*  54  113:ifeq            126
				r = bundle.getBoolean("incomingIsOrdered");
	//   55  116:aload_0         
	//   56  117:aload_1         
	//   57  118:ldc1            #100 <String "incomingIsOrdered">
	//   58  120:invokevirtual   #103 <Method boolean Bundle.getBoolean(String)>
	//   59  123:putfield        #107 <Field boolean r>
			if(bundle.containsKey("isMapUploadEnabled"))
	//*  60  126:aload_1         
	//*  61  127:ldc1            #109 <String "isMapUploadEnabled">
	//*  62  129:invokevirtual   #53  <Method boolean Bundle.containsKey(String)>
	//*  63  132:ifeq            145
				s = bundle.getBoolean("isMapUploadEnabled");
	//   64  135:aload_0         
	//   65  136:aload_1         
	//   66  137:ldc1            #109 <String "isMapUploadEnabled">
	//   67  139:invokevirtual   #103 <Method boolean Bundle.getBoolean(String)>
	//   68  142:putfield        #112 <Field boolean s>
		}
	//   69  145:return          
	}

	public View a(int i)
	{
		if(u == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field View u>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return u.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #115 <Field View u>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #120 <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		b = a1.a(0x7f09038f);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #124 <Int 0x7f09038f>
	//    3    4:invokeinterface #126 <Method View a.a(int)>
	//    4    9:putfield        #129 <Field View b>
		c = (RadioGroup)a1.a(0x7f090390);
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:ldc1            #130 <Int 0x7f090390>
	//    8   16:invokeinterface #126 <Method View a.a(int)>
	//    9   21:checkcast       #132 <Class RadioGroup>
	//   10   24:putfield        #136 <Field RadioGroup c>
		d = (CustomRadioButton)a1.a(0x7f090392);
	//   11   27:aload_0         
	//   12   28:aload_1         
	//   13   29:ldc1            #137 <Int 0x7f090392>
	//   14   31:invokeinterface #126 <Method View a.a(int)>
	//   15   36:checkcast       #139 <Class CustomRadioButton>
	//   16   39:putfield        #142 <Field CustomRadioButton d>
		e = (CustomRadioButton)a1.a(0x7f09038b);
	//   17   42:aload_0         
	//   18   43:aload_1         
	//   19   44:ldc1            #143 <Int 0x7f09038b>
	//   20   46:invokeinterface #126 <Method View a.a(int)>
	//   21   51:checkcast       #139 <Class CustomRadioButton>
	//   22   54:putfield        #145 <Field CustomRadioButton e>
		f = a1.a(0x7f09038d);
	//   23   57:aload_0         
	//   24   58:aload_1         
	//   25   59:ldc1            #146 <Int 0x7f09038d>
	//   26   61:invokeinterface #126 <Method View a.a(int)>
	//   27   66:putfield        #148 <Field View f>
		i = (FrameLayout)a1.a(0x7f09038e);
	//   28   69:aload_0         
	//   29   70:aload_1         
	//   30   71:ldc1            #149 <Int 0x7f09038e>
	//   31   73:invokeinterface #126 <Method View a.a(int)>
	//   32   78:checkcast       #151 <Class FrameLayout>
	//   33   81:putfield        #155 <Field FrameLayout i>
		j = (CustomTextView)a1.a(0x7f09038c);
	//   34   84:aload_0         
	//   35   85:aload_1         
	//   36   86:ldc1            #156 <Int 0x7f09038c>
	//   37   88:invokeinterface #126 <Method View a.a(int)>
	//   38   93:checkcast       #158 <Class CustomTextView>
	//   39   96:putfield        #162 <Field CustomTextView j>
		k = (CustomTextView)a1.a(0x7f090393);
	//   40   99:aload_0         
	//   41  100:aload_1         
	//   42  101:ldc1            #163 <Int 0x7f090393>
	//   43  103:invokeinterface #126 <Method View a.a(int)>
	//   44  108:checkcast       #158 <Class CustomTextView>
	//   45  111:putfield        #166 <Field CustomTextView k>
		l = (ProgressBar)a1.a(0x7f090391);
	//   46  114:aload_0         
	//   47  115:aload_1         
	//   48  116:ldc1            #167 <Int 0x7f090391>
	//   49  118:invokeinterface #126 <Method View a.a(int)>
	//   50  123:checkcast       #169 <Class ProgressBar>
	//   51  126:putfield        #173 <Field ProgressBar l>
		a();
	//   52  129:aload_0         
	//   53  130:invokevirtual   #175 <Method void a()>
	//   54  133:return          
	}

	protected void d()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.fragments.ax.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ax a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.fragments.ax.a(ax)>
			//    3    7:return          
			}

			final ax a;

			
			{
				a = ax.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ax a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #177 <String "">
	//    1    2:new             #10  <Class ax$1>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #179 <Method void ax$1(ax)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #184 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(t);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field c t>
	//    2    4:invokestatic    #188 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #190 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #192 <Method void aw.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #188 <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		u = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #196 <Method View aw.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #115 <Field View u>
		if(u == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #115 <Field View u>
	//*   9   15:ifnonnull       30
			u = layoutinflater.inflate(0x7f0b00d0, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #197 <Int 0x7f0b00d0>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #203 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #115 <Field View u>
		return u;
	//   17   30:aload_0         
	//   18   31:getfield        #115 <Field View u>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #206 <Method void aw.onDestroyView()>
		u = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #115 <Field View u>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #129 <Field View b>
		c = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #136 <Field RadioGroup c>
		d = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #142 <Field CustomRadioButton d>
		e = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #145 <Field CustomRadioButton e>
		f = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #148 <Field View f>
		i = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #155 <Field FrameLayout i>
		j = null;
	//   23   39:aload_0         
	//   24   40:aconst_null     
	//   25   41:putfield        #162 <Field CustomTextView j>
		k = null;
	//   26   44:aload_0         
	//   27   45:aconst_null     
	//   28   46:putfield        #166 <Field CustomTextView k>
		l = null;
	//   29   49:aload_0         
	//   30   50:aconst_null     
	//   31   51:putfield        #173 <Field ProgressBar l>
	//   32   54:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #210 <Method void aw.onViewCreated(View, Bundle)>
		t.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field c t>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #212 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c t = new c();
	private View u;
}
