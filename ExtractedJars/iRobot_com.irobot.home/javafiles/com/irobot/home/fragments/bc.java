// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.app.Activity;
import android.content.Context;
import android.widget.*;
import com.irobot.home.WebViewActivity_;
import com.irobot.home.model.rest.RobotErrorHelpContent;
import com.irobot.home.model.rest.RobotErrorHelpContentList;
import com.irobot.home.rest.CustomerCareRestClient;
import com.irobot.home.util.j;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.irobot.home.fragments:
//			g

public class bc extends g
{
	public static interface a
	{

		public abstract void E();
	}


	public bc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void g()>
		h = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #47  <Field boolean h>
		j = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #49  <Field String j>
		k = com.irobot.home.util.j.i(((Context) (getActivity())));
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #53  <Method Activity getActivity()>
	//   11   19:invokestatic    #56  <Method CustomerCareRestClient j.i(Context)>
	//   12   22:putfield        #58  <Field CustomerCareRestClient k>
	//   13   25:return          
	}

	protected void a()
	{
		a.setText(0x7f0f0238);
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field TextView a>
	//    2    4:ldc1            #61  <Int 0x7f0f0238>
	//    3    6:invokevirtual   #67  <Method void TextView.setText(int)>
		b.setVisibility(0);
	//    4    9:aload_0         
	//    5   10:getfield        #69  <Field ImageButton b>
	//    6   13:iconst_0        
	//    7   14:invokevirtual   #74  <Method void ImageButton.setVisibility(int)>
		c.setText(((CharSequence) (f)));
	//    8   17:aload_0         
	//    9   18:getfield        #76  <Field TextView c>
	//   10   21:aload_0         
	//   11   22:getfield        #78  <Field String f>
	//   12   25:invokevirtual   #81  <Method void TextView.setText(CharSequence)>
		d.setText(((CharSequence) (g)));
	//   13   28:aload_0         
	//   14   29:getfield        #83  <Field TextView d>
	//   15   32:aload_0         
	//   16   33:getfield        #85  <Field String g>
	//   17   36:invokevirtual   #81  <Method void TextView.setText(CharSequence)>
		a(false);
	//   18   39:aload_0         
	//   19   40:iconst_0        
	//   20   41:invokevirtual   #88  <Method void a(boolean)>
		if(h)
	//*  21   44:aload_0         
	//*  22   45:getfield        #47  <Field boolean h>
	//*  23   48:ifeq            55
			d();
	//   24   51:aload_0         
	//   25   52:invokevirtual   #90  <Method void d()>
	//   26   55:return          
	}

	protected void a(boolean flag)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
			byte0 = 0;
	//    2    4:iconst_0        
	//    3    5:istore_2        
		else
	//*   4    6:goto            12
			byte0 = 8;
	//    5    9:bipush          8
	//    6   11:istore_2        
		e.setVisibility(((int) (byte0)));
	//    7   12:aload_0         
	//    8   13:getfield        #92  <Field Button e>
	//    9   16:iload_2         
	//   10   17:invokevirtual   #95  <Method void Button.setVisibility(int)>
		d.setVisibility(((int) (byte0)));
	//   11   20:aload_0         
	//   12   21:getfield        #83  <Field TextView d>
	//   13   24:iload_2         
	//   14   25:invokevirtual   #96  <Method void TextView.setVisibility(int)>
	//   15   28:return          
	}

	public void b()
	{
		if(l != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field bc$a l>
	//*   2    4:ifnull          16
			l.E();
	//    3    7:aload_0         
	//    4    8:getfield        #98  <Field bc$a l>
	//    5   11:invokeinterface #101 <Method void bc$a.E()>
	//    6   16:return          
	}

	public void c()
	{
		WebViewActivity_.a(((Context) (getActivity()))).a(j).a(Integer.valueOf(0x7f0f05d8)).a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method Activity getActivity()>
	//    2    4:invokestatic    #106 <Method com.irobot.home.WebViewActivity_$a WebViewActivity_.a(Context)>
	//    3    7:aload_0         
	//    4    8:getfield        #49  <Field String j>
	//    5   11:invokevirtual   #111 <Method com.irobot.home.WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(String)>
	//    6   14:ldc1            #112 <Int 0x7f0f05d8>
	//    7   16:invokestatic    #118 <Method Integer Integer.valueOf(int)>
	//    8   19:invokevirtual   #121 <Method com.irobot.home.WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(Integer)>
	//    9   22:invokevirtual   #124 <Method org.androidannotations.api.a.e com.irobot.home.WebViewActivity_$a.a()>
	//   10   25:pop             
	//   11   26:return          
	}

	protected void d()
	{
label0:
		{
			Object obj = ((Object) (k.getRobotErrorHelp(com.irobot.home.util.j.f(((Context) (getActivity()))), com.irobot.home.util.j.h(((Context) (getActivity()))), "R980020")));
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field CustomerCareRestClient k>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #53  <Method Activity getActivity()>
	//    4    8:invokestatic    #127 <Method String j.f(Context)>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #53  <Method Activity getActivity()>
	//    7   15:invokestatic    #129 <Method String j.h(Context)>
	//    8   18:ldc1            #131 <String "R980020">
	//    9   20:invokeinterface #137 <Method RobotErrorHelpContentList CustomerCareRestClient.getRobotErrorHelp(String, String, String)>
	//   10   25:astore_1        
			if(obj == null || ((RobotErrorHelpContentList) (obj)).otherContent == null)
				break label0;
	//   11   26:aload_1         
	//   12   27:ifnull          91
	//   13   30:aload_1         
	//   14   31:getfield        #143 <Field List RobotErrorHelpContentList.otherContent>
	//   15   34:ifnull          91
			obj = ((Object) (((RobotErrorHelpContentList) (obj)).otherContent.iterator()));
	//   16   37:aload_1         
	//   17   38:getfield        #143 <Field List RobotErrorHelpContentList.otherContent>
	//   18   41:invokeinterface #149 <Method Iterator List.iterator()>
	//   19   46:astore_1        
			RobotErrorHelpContent roboterrorhelpcontent;
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break label0;
	//   20   47:aload_1         
	//   21   48:invokeinterface #155 <Method boolean Iterator.hasNext()>
	//   22   53:ifeq            91
				roboterrorhelpcontent = (RobotErrorHelpContent)((Iterator) (obj)).next();
	//   23   56:aload_1         
	//   24   57:invokeinterface #159 <Method Object Iterator.next()>
	//   25   62:checkcast       #161 <Class RobotErrorHelpContent>
	//   26   65:astore_2        
			} while(!"Cloud_down_no_globes".equalsIgnoreCase(roboterrorhelpcontent.id));
	//   27   66:ldc1            #163 <String "Cloud_down_no_globes">
	//   28   68:aload_2         
	//   29   69:getfield        #166 <Field String RobotErrorHelpContent.id>
	//   30   72:invokevirtual   #172 <Method boolean String.equalsIgnoreCase(String)>
	//   31   75:ifeq            47
			j = roboterrorhelpcontent.content;
	//   32   78:aload_0         
	//   33   79:aload_2         
	//   34   80:getfield        #175 <Field String RobotErrorHelpContent.content>
	//   35   83:putfield        #49  <Field String j>
			a(true);
	//   36   86:aload_0         
	//   37   87:iconst_1        
	//   38   88:invokevirtual   #88  <Method void a(boolean)>
		}
	//   39   91:return          
	}

	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #179 <Method void g.onAttach(Activity)>
		if(activity instanceof a)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #6   <Class bc$a>
	//*   5    9:ifeq            21
		{
			l = (a)activity;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #6   <Class bc$a>
	//    9   17:putfield        #98  <Field bc$a l>
			return;
	//   10   20:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   21:new             #181 <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #182 <Method void StringBuilder()>
	//   14   28:astore_2        
			stringbuilder.append(((Object) (activity)).toString());
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #187 <Method String Object.toString()>
	//   18   34:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(" must implement OnRemoteConnectionErrorListener");
	//   20   38:aload_2         
	//   21   39:ldc1            #193 <String " must implement OnRemoteConnectionErrorListener">
	//   22   41:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			throw new RuntimeException(stringbuilder.toString());
	//   24   45:new             #195 <Class RuntimeException>
	//   25   48:dup             
	//   26   49:aload_2         
	//   27   50:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   28   53:invokespecial   #199 <Method void RuntimeException(String)>
	//   29   56:athrow          
		}
	}

	public void onAttach(Context context)
	{
		super.onAttach(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #202 <Method void g.onAttach(Context)>
		if(context instanceof a)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #6   <Class bc$a>
	//*   5    9:ifeq            21
		{
			l = (a)context;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #6   <Class bc$a>
	//    9   17:putfield        #98  <Field bc$a l>
			return;
	//   10   20:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   21:new             #181 <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #182 <Method void StringBuilder()>
	//   14   28:astore_2        
			stringbuilder.append(((Object) (context)).toString());
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #187 <Method String Object.toString()>
	//   18   34:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(" must implement OnRemoteConnectionErrorListener");
	//   20   38:aload_2         
	//   21   39:ldc1            #193 <String " must implement OnRemoteConnectionErrorListener">
	//   22   41:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			throw new RuntimeException(stringbuilder.toString());
	//   24   45:new             #195 <Class RuntimeException>
	//   25   48:dup             
	//   26   49:aload_2         
	//   27   50:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   28   53:invokespecial   #199 <Method void RuntimeException(String)>
	//   29   56:athrow          
		}
	}

	public void onDetach()
	{
		super.onDetach();
	//    0    0:aload_0         
	//    1    1:invokespecial   #205 <Method void g.onDetach()>
		l = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #98  <Field bc$a l>
	//    5    9:return          
	}

	private static final String i = com.irobot.home.util.j.r(((Class) (com/irobot/home/fragments/bc)).getSimpleName());
	TextView a;
	ImageButton b;
	TextView c;
	TextView d;
	Button e;
	String f;
	String g;
	boolean h;
	private String j;
	private CustomerCareRestClient k;
	private a l;

	static 
	{
	//    0    0:ldc1            #2   <Class bc>
	//    1    2:invokevirtual   #33  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #39  <Method String j.r(String)>
	//    3    8:putstatic       #41  <Field String i>
	//*   4   11:return          
	}
}
