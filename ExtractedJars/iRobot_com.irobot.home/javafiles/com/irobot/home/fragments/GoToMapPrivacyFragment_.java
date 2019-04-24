// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.irobot.home.view.CustomButton;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			ab

public final class GoToMapPrivacyFragment_ extends ab
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public ab a()
		{
			GoToMapPrivacyFragment_ gotomapprivacyfragment_ = new GoToMapPrivacyFragment_();
		//    0    0:new             #7   <Class GoToMapPrivacyFragment_>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void GoToMapPrivacyFragment_()>
		//    3    7:astore_1        
			gotomapprivacyfragment_.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void GoToMapPrivacyFragment_.setArguments(Bundle)>
			return ((ab) (gotomapprivacyfragment_));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void org.androidannotations.api.a.c()>
		//    2    4:return          
		}
	}


	public GoToMapPrivacyFragment_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void ab()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void c()>
	//    6   12:putfield        #26  <Field c b>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #31  <Method void c.a(b)>
	//    2    4:return          
	}

	public static a b()
	{
		return new a();
	//    0    0:new             #12  <Class GoToMapPrivacyFragment_$a>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void GoToMapPrivacyFragment_$a()>
	//    3    7:areturn         
	}

	public View a(int i)
	{
		if(c == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field View c>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return c.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #36  <Field View c>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #41  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (CustomButton)a1.a(0x7f0901a6);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #45  <Int 0x7f0901a6>
	//    3    4:invokeinterface #47  <Method View a.a(int)>
	//    4    9:checkcast       #49  <Class CustomButton>
	//    5   12:putfield        #52  <Field CustomButton a>
		if(a != null)
	//*   6   15:aload_0         
	//*   7   16:getfield        #52  <Field CustomButton a>
	//*   8   19:ifnull          37
			a.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.a();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field GoToMapPrivacyFragment_ a>
				//    2    4:invokevirtual   #24  <Method void com.irobot.home.fragments.GoToMapPrivacyFragment_.a()>
				//    3    7:return          
				}

				final GoToMapPrivacyFragment_ a;

			
			{
				a = GoToMapPrivacyFragment_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field GoToMapPrivacyFragment_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    9   22:aload_0         
	//   10   23:getfield        #52  <Field CustomButton a>
	//   11   26:new             #10  <Class GoToMapPrivacyFragment_$1>
	//   12   29:dup             
	//   13   30:aload_0         
	//   14   31:invokespecial   #55  <Method void GoToMapPrivacyFragment_$1(GoToMapPrivacyFragment_)>
	//   15   34:invokevirtual   #59  <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
	//   16   37:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(b);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field c b>
	//    2    4:invokestatic    #63  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #65  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #67  <Method void ab.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #63  <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		c = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #71  <Method View ab.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #36  <Field View c>
		if(c == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #36  <Field View c>
	//*   9   15:ifnonnull       30
			c = layoutinflater.inflate(0x7f0b00b6, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #72  <Int 0x7f0b00b6>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #78  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #36  <Field View c>
		return c;
	//   17   30:aload_0         
	//   18   31:getfield        #36  <Field View c>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void ab.onDestroyView()>
		c = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #36  <Field View c>
		a = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #52  <Field CustomButton a>
	//    8   14:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #85  <Method void ab.onViewCreated(View, Bundle)>
		b.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field c b>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #87  <Method void c.a(a)>
	//    8   14:return          
	}

	private final c b = new c();
	private View c;
}
