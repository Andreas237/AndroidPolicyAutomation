// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.*;
import android.widget.ImageView;
import android.widget.TextView;
import com.irobot.home.view.BatteryGaugeView;
import com.irobot.home.view.CustomButton;
import org.androidannotations.api.c.*;

// Referenced classes of package com.irobot.home.fragments:
//			bk

public final class bl extends bk
	implements a, b
{

	public bl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void bk()>
	//    2    4:aload_0         
	//    3    5:new             #22  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void c()>
	//    6   12:putfield        #25  <Field c n>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #31  <Method void c.a(b)>
	//    2    4:return          
	}

	public View a(int i)
	{
		if(o == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field View o>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return o.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field View o>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #39  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(a a1)
	{
		g = (CustomButton)a1.a(0x7f090342);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #43  <Int 0x7f090342>
	//    3    4:invokeinterface #45  <Method View a.a(int)>
	//    4    9:checkcast       #47  <Class CustomButton>
	//    5   12:putfield        #51  <Field CustomButton g>
		h = (CustomButton)a1.a(0x7f090171);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #52  <Int 0x7f090171>
	//    9   19:invokeinterface #45  <Method View a.a(int)>
	//   10   24:checkcast       #47  <Class CustomButton>
	//   11   27:putfield        #55  <Field CustomButton h>
		i = (ImageView)a1.a(0x7f090085);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #56  <Int 0x7f090085>
	//   15   34:invokeinterface #45  <Method View a.a(int)>
	//   16   39:checkcast       #58  <Class ImageView>
	//   17   42:putfield        #62  <Field ImageView i>
		j = (TextView)a1.a(0x7f090363);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #63  <Int 0x7f090363>
	//   21   49:invokeinterface #45  <Method View a.a(int)>
	//   22   54:checkcast       #65  <Class TextView>
	//   23   57:putfield        #69  <Field TextView j>
		k = (TextView)a1.a(0x7f090364);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #70  <Int 0x7f090364>
	//   27   64:invokeinterface #45  <Method View a.a(int)>
	//   28   69:checkcast       #65  <Class TextView>
	//   29   72:putfield        #73  <Field TextView k>
		l = (BatteryGaugeView)a1.a(0x7f090062);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #74  <Int 0x7f090062>
	//   33   79:invokeinterface #45  <Method View a.a(int)>
	//   34   84:checkcast       #76  <Class BatteryGaugeView>
	//   35   87:putfield        #80  <Field BatteryGaugeView l>
		if(g != null)
	//*  36   90:aload_0         
	//*  37   91:getfield        #51  <Field CustomButton g>
	//*  38   94:ifnull          112
			g.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.c();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bl a>
				//    2    4:invokevirtual   #25  <Method void com.irobot.home.fragments.bl.c()>
				//    3    7:return          
				}

				final bl a;

			
			{
				a = bl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bl a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   39   97:aload_0         
	//   40   98:getfield        #51  <Field CustomButton g>
	//   41  101:new             #10  <Class bl$1>
	//   42  104:dup             
	//   43  105:aload_0         
	//   44  106:invokespecial   #83  <Method void bl$1(bl)>
	//   45  109:invokevirtual   #87  <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(h != null)
	//*  46  112:aload_0         
	//*  47  113:getfield        #55  <Field CustomButton h>
	//*  48  116:ifnull          134
			h.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.d();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bl a>
				//    2    4:invokevirtual   #25  <Method void bl.d()>
				//    3    7:return          
				}

				final bl a;

			
			{
				a = bl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bl a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   49  119:aload_0         
	//   50  120:getfield        #55  <Field CustomButton h>
	//   51  123:new             #12  <Class bl$2>
	//   52  126:dup             
	//   53  127:aload_0         
	//   54  128:invokespecial   #88  <Method void bl$2(bl)>
	//   55  131:invokevirtual   #87  <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		a();
	//   56  134:aload_0         
	//   57  135:invokevirtual   #90  <Method void a()>
	//   58  138:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(n);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field c n>
	//    2    4:invokestatic    #94  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #96  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #98  <Method void bk.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #94  <Method c c.a(c)>
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
	//    5    5:invokespecial   #102 <Method View bk.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #34  <Field View o>
		if(o == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #34  <Field View o>
	//*   9   15:ifnonnull       30
			o = layoutinflater.inflate(0x7f0b00cd, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #103 <Int 0x7f0b00cd>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #109 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #34  <Field View o>
		return o;
	//   17   30:aload_0         
	//   18   31:getfield        #34  <Field View o>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #112 <Method void bk.onDestroyView()>
		o = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #34  <Field View o>
		g = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #51  <Field CustomButton g>
		h = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #55  <Field CustomButton h>
		i = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #62  <Field ImageView i>
		j = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #69  <Field TextView j>
		k = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #73  <Field TextView k>
		l = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #80  <Field BatteryGaugeView l>
	//   23   39:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #116 <Method void bk.onViewCreated(View, Bundle)>
		n.a(((a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #25  <Field c n>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #118 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c n = new c();
	private View o;
}
