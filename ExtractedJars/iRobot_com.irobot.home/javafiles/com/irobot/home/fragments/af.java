// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.ArrayList;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			ae

public final class af extends ae
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public ae a()
		{
			af af1 = new af();
		//    0    0:new             #7   <Class af>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void af()>
		//    3    7:astore_1        
			af1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void af.setArguments(Bundle)>
			return ((ae) (af1));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public a a(int j)
		{
			a.putInt("resId", j);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #25  <String "resId">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(String s)
		{
			a.putString("infoSectionTitle", s);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #34  <String "infoSectionTitle">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #38  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(ArrayList arraylist)
		{
			a.putStringArrayList("infoText", arraylist);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #41  <String "infoText">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #45  <Method void Bundle.putStringArrayList(String, ArrayList)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(boolean flag)
		{
			a.putBoolean("isImageRes", flag);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #50  <String "isImageRes">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #54  <Method void Bundle.putBoolean(String, boolean)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a b(int j)
		{
			a.putInt("replayButtonResId", j);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #57  <String "replayButtonResId">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a b(String s)
		{
			a.putString("subheaderTitle", s);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #59  <String "subheaderTitle">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #38  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a b(boolean flag)
		{
			a.putBoolean("loopBack", flag);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #61  <String "loopBack">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #54  <Method void Bundle.putBoolean(String, boolean)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a c(boolean flag)
		{
			a.putBoolean("isValidNetwork", flag);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #64  <String "isValidNetwork">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #54  <Method void Bundle.putBoolean(String, boolean)>
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


	public af()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void ae()>
	//    2    4:aload_0         
	//    3    5:new             #26  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void c()>
	//    6   12:putfield        #29  <Field c a>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #34  <Method void c.a(b)>
		i();
	//    2    4:aload_0         
	//    3    5:invokespecial   #37  <Method void i()>
	//    4    8:return          
	}

	static void a(af af1, String s)
	{
		((ae) (af1)).com.irobot.home.fragments.ae.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void com.irobot.home.fragments.ae.a(String)>
	//    3    5:return          
	}

	public static a b()
	{
		return new a();
	//    0    0:new             #16  <Class af$a>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void af$a()>
	//    3    7:areturn         
	}

	private void i()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          161
		{
			if(bundle.containsKey("resId"))
	//*   5    9:aload_1         
	//*   6   10:ldc1            #49  <String "resId">
	//*   7   12:invokevirtual   #55  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            28
				j = bundle.getInt("resId");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #49  <String "resId">
	//   12   22:invokevirtual   #59  <Method int Bundle.getInt(String)>
	//   13   25:putfield        #63  <Field int j>
			if(bundle.containsKey("isImageRes"))
	//*  14   28:aload_1         
	//*  15   29:ldc1            #65  <String "isImageRes">
	//*  16   31:invokevirtual   #55  <Method boolean Bundle.containsKey(String)>
	//*  17   34:ifeq            47
				k = bundle.getBoolean("isImageRes");
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:ldc1            #65  <String "isImageRes">
	//   21   41:invokevirtual   #68  <Method boolean Bundle.getBoolean(String)>
	//   22   44:putfield        #72  <Field boolean k>
			if(bundle.containsKey("loopBack"))
	//*  23   47:aload_1         
	//*  24   48:ldc1            #74  <String "loopBack">
	//*  25   50:invokevirtual   #55  <Method boolean Bundle.containsKey(String)>
	//*  26   53:ifeq            66
				l = bundle.getBoolean("loopBack");
	//   27   56:aload_0         
	//   28   57:aload_1         
	//   29   58:ldc1            #74  <String "loopBack">
	//   30   60:invokevirtual   #68  <Method boolean Bundle.getBoolean(String)>
	//   31   63:putfield        #77  <Field boolean l>
			if(bundle.containsKey("infoSectionTitle"))
	//*  32   66:aload_1         
	//*  33   67:ldc1            #79  <String "infoSectionTitle">
	//*  34   69:invokevirtual   #55  <Method boolean Bundle.containsKey(String)>
	//*  35   72:ifeq            85
				m = bundle.getString("infoSectionTitle");
	//   36   75:aload_0         
	//   37   76:aload_1         
	//   38   77:ldc1            #79  <String "infoSectionTitle">
	//   39   79:invokevirtual   #83  <Method String Bundle.getString(String)>
	//   40   82:putfield        #87  <Field String m>
			if(bundle.containsKey("infoText"))
	//*  41   85:aload_1         
	//*  42   86:ldc1            #89  <String "infoText">
	//*  43   88:invokevirtual   #55  <Method boolean Bundle.containsKey(String)>
	//*  44   91:ifeq            104
				n = bundle.getStringArrayList("infoText");
	//   45   94:aload_0         
	//   46   95:aload_1         
	//   47   96:ldc1            #89  <String "infoText">
	//   48   98:invokevirtual   #93  <Method ArrayList Bundle.getStringArrayList(String)>
	//   49  101:putfield        #97  <Field ArrayList n>
			if(bundle.containsKey("replayButtonResId"))
	//*  50  104:aload_1         
	//*  51  105:ldc1            #99  <String "replayButtonResId">
	//*  52  107:invokevirtual   #55  <Method boolean Bundle.containsKey(String)>
	//*  53  110:ifeq            123
				o = bundle.getInt("replayButtonResId");
	//   54  113:aload_0         
	//   55  114:aload_1         
	//   56  115:ldc1            #99  <String "replayButtonResId">
	//   57  117:invokevirtual   #59  <Method int Bundle.getInt(String)>
	//   58  120:putfield        #102 <Field int o>
			if(bundle.containsKey("isValidNetwork"))
	//*  59  123:aload_1         
	//*  60  124:ldc1            #104 <String "isValidNetwork">
	//*  61  126:invokevirtual   #55  <Method boolean Bundle.containsKey(String)>
	//*  62  129:ifeq            142
				p = bundle.getBoolean("isValidNetwork");
	//   63  132:aload_0         
	//   64  133:aload_1         
	//   65  134:ldc1            #104 <String "isValidNetwork">
	//   66  136:invokevirtual   #68  <Method boolean Bundle.getBoolean(String)>
	//   67  139:putfield        #107 <Field boolean p>
			if(bundle.containsKey("subheaderTitle"))
	//*  68  142:aload_1         
	//*  69  143:ldc1            #109 <String "subheaderTitle">
	//*  70  145:invokevirtual   #55  <Method boolean Bundle.containsKey(String)>
	//*  71  148:ifeq            161
				q = bundle.getString("subheaderTitle");
	//   72  151:aload_0         
	//   73  152:aload_1         
	//   74  153:ldc1            #109 <String "subheaderTitle">
	//   75  155:invokevirtual   #83  <Method String Bundle.getString(String)>
	//   76  158:putfield        #112 <Field String q>
		}
	//   77  161:return          
	}

	public View a(int j)
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field View b>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return b.findViewById(j);
	//    5    9:aload_0         
	//    6   10:getfield        #115 <Field View b>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #120 <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(String s)
	{
		org.androidannotations.api.b.a("", new Runnable(s) {

			public void run()
			{
				com.irobot.home.fragments.af.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field af b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field String a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.fragments.af.a(af, String)>
			//    5   11:return          
			}

			final String a;
			final af b;

			
			{
				b = af.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field af b>
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
	//    0    0:ldc1            #124 <String "">
	//    1    2:new             #14  <Class af$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #126 <Method void af$3(af, String)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #131 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		d = (FrameLayout)a1.a(0x7f0903d0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #133 <Int 0x7f0903d0>
	//    3    4:invokeinterface #135 <Method View a.a(int)>
	//    4    9:checkcast       #137 <Class FrameLayout>
	//    5   12:putfield        #141 <Field FrameLayout d>
		e = (TextView)a1.a(0x7f0903bd);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #142 <Int 0x7f0903bd>
	//    9   19:invokeinterface #135 <Method View a.a(int)>
	//   10   24:checkcast       #144 <Class TextView>
	//   11   27:putfield        #148 <Field TextView e>
		f = (TextView)a1.a(0x7f0901a3);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #149 <Int 0x7f0901a3>
	//   15   34:invokeinterface #135 <Method View a.a(int)>
	//   16   39:checkcast       #144 <Class TextView>
	//   17   42:putfield        #152 <Field TextView f>
		g = (TextView)a1.a(0x7f090464);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #153 <Int 0x7f090464>
	//   21   49:invokeinterface #135 <Method View a.a(int)>
	//   22   54:checkcast       #144 <Class TextView>
	//   23   57:putfield        #156 <Field TextView g>
		h = (TextView)a1.a(0x7f09041b);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #157 <Int 0x7f09041b>
	//   27   64:invokeinterface #135 <Method View a.a(int)>
	//   28   69:checkcast       #144 <Class TextView>
	//   29   72:putfield        #160 <Field TextView h>
		i = (ImageButton)a1.a(0x7f090335);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #161 <Int 0x7f090335>
	//   33   79:invokeinterface #135 <Method View a.a(int)>
	//   34   84:checkcast       #163 <Class ImageButton>
	//   35   87:putfield        #166 <Field ImageButton i>
		if(i != null)
	//*  36   90:aload_0         
	//*  37   91:getfield        #166 <Field ImageButton i>
	//*  38   94:ifnull          112
			i.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.d();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field af a>
				//    2    4:invokevirtual   #25  <Method void af.d()>
				//    3    7:return          
				}

				final af a;

			
			{
				a = af.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field af a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   39   97:aload_0         
	//   40   98:getfield        #166 <Field ImageButton i>
	//   41  101:new             #10  <Class af$1>
	//   42  104:dup             
	//   43  105:aload_0         
	//   44  106:invokespecial   #169 <Method void af$1(af)>
	//   45  109:invokevirtual   #173 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		if(g != null)
	//*  46  112:aload_0         
	//*  47  113:getfield        #156 <Field TextView g>
	//*  48  116:ifnull          134
			g.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.e();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field af a>
				//    2    4:invokevirtual   #25  <Method void af.e()>
				//    3    7:return          
				}

				final af a;

			
			{
				a = af.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field af a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   49  119:aload_0         
	//   50  120:getfield        #156 <Field TextView g>
	//   51  123:new             #12  <Class af$2>
	//   52  126:dup             
	//   53  127:aload_0         
	//   54  128:invokespecial   #174 <Method void af$2(af)>
	//   55  131:invokevirtual   #175 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		c();
	//   56  134:aload_0         
	//   57  135:invokevirtual   #178 <Method void c()>
	//   58  138:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field c a>
	//    2    4:invokestatic    #182 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #184 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #186 <Method void ae.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #182 <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		b = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #190 <Method View ae.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #115 <Field View b>
		if(b == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #115 <Field View b>
	//*   9   15:ifnonnull       30
			b = layoutinflater.inflate(0x7f0b00b8, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #191 <Int 0x7f0b00b8>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #197 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #115 <Field View b>
		return b;
	//   17   30:aload_0         
	//   18   31:getfield        #115 <Field View b>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #200 <Method void ae.onDestroyView()>
		b = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #115 <Field View b>
		d = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #141 <Field FrameLayout d>
		e = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #148 <Field TextView e>
		f = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #152 <Field TextView f>
		g = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #156 <Field TextView g>
		h = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #160 <Field TextView h>
		i = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #166 <Field ImageButton i>
	//   23   39:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #204 <Method void ae.onViewCreated(View, Bundle)>
		a.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #29  <Field c a>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #206 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c a = new c();
	private View b;
}
