// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			aq

public final class ar extends aq
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public aq a()
		{
			ar ar1 = new ar();
		//    0    0:new             #7   <Class ar>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void ar()>
		//    3    7:astore_1        
			ar1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void ar.setArguments(Bundle)>
			return ((aq) (ar1));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public a a(Boolean boolean1)
		{
			a.putSerializable("isHeaderVisible", ((java.io.Serializable) (boolean1)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #25  <String "isHeaderVisible">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putSerializable(String, java.io.Serializable)>
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


	public ar()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void aq()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void c()>
	//    6   12:putfield        #24  <Field c n>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #29  <Method void c.a(b)>
		d();
	//    2    4:aload_0         
	//    3    5:invokespecial   #32  <Method void d()>
	//    4    8:return          
	}

	public static a c()
	{
		return new a();
	//    0    0:new             #10  <Class ar$a>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void ar$a()>
	//    3    7:areturn         
	}

	private void d()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null && bundle.containsKey("isHeaderVisible"))
	//*   3    5:aload_1         
	//*   4    6:ifnull          31
	//*   5    9:aload_1         
	//*   6   10:ldc1            #41  <String "isHeaderVisible">
	//*   7   12:invokevirtual   #47  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            31
			a = (Boolean)bundle.getSerializable("isHeaderVisible");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #41  <String "isHeaderVisible">
	//   12   22:invokevirtual   #51  <Method java.io.Serializable Bundle.getSerializable(String)>
	//   13   25:checkcast       #53  <Class Boolean>
	//   14   28:putfield        #56  <Field Boolean a>
	//   15   31:return          
	}

	public View a(int i)
	{
		if(o == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field View o>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return o.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #59  <Field View o>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #64  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		b = (CustomTextView)a1.a(0x7f090217);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #68  <Int 0x7f090217>
	//    3    4:invokeinterface #70  <Method View a.a(int)>
	//    4    9:checkcast       #72  <Class CustomTextView>
	//    5   12:putfield        #76  <Field CustomTextView b>
		c = (ImageButton)a1.a(0x7f0901c4);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #77  <Int 0x7f0901c4>
	//    9   19:invokeinterface #70  <Method View a.a(int)>
	//   10   24:checkcast       #79  <Class ImageButton>
	//   11   27:putfield        #82  <Field ImageButton c>
		d = a1.a(0x7f09045a);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #83  <Int 0x7f09045a>
	//   15   34:invokeinterface #70  <Method View a.a(int)>
	//   16   39:putfield        #85  <Field View d>
		e = a1.a(0x7f090151);
	//   17   42:aload_0         
	//   18   43:aload_1         
	//   19   44:ldc1            #86  <Int 0x7f090151>
	//   20   46:invokeinterface #70  <Method View a.a(int)>
	//   21   51:putfield        #89  <Field View e>
		f = a1.a(0x7f0902a6);
	//   22   54:aload_0         
	//   23   55:aload_1         
	//   24   56:ldc1            #90  <Int 0x7f0902a6>
	//   25   58:invokeinterface #70  <Method View a.a(int)>
	//   26   63:putfield        #93  <Field View f>
		i = a1.a(0x7f0902a5);
	//   27   66:aload_0         
	//   28   67:aload_1         
	//   29   68:ldc1            #94  <Int 0x7f0902a5>
	//   30   70:invokeinterface #70  <Method View a.a(int)>
	//   31   75:putfield        #97  <Field View i>
		a();
	//   32   78:aload_0         
	//   33   79:invokevirtual   #99  <Method void a()>
	//   34   82:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(n);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field c n>
	//    2    4:invokestatic    #103 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #105 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #107 <Method void aq.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #103 <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		o = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #111 <Method View aq.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #59  <Field View o>
		if(o == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #59  <Field View o>
	//*   9   15:ifnonnull       30
			o = layoutinflater.inflate(0x7f0b00c0, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #112 <Int 0x7f0b00c0>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #118 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #59  <Field View o>
		return o;
	//   17   30:aload_0         
	//   18   31:getfield        #59  <Field View o>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #121 <Method void aq.onDestroyView()>
		o = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #59  <Field View o>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #76  <Field CustomTextView b>
		c = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #82  <Field ImageButton c>
		d = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #85  <Field View d>
		e = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #89  <Field View e>
		f = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #93  <Field View f>
		i = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #97  <Field View i>
	//   23   39:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #125 <Method void aq.onViewCreated(View, Bundle)>
		n.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field c n>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #127 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c n = new c();
	private View o;
}
