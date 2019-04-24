// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.widget.Button;
import com.irobot.home.fragments.af;
import com.irobot.home.util.j;
import java.util.ArrayList;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity

public class VideoHelpActivity extends BaseFragmentActivity
{

	public VideoHelpActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void BaseFragmentActivity()>
		e = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #32  <Field ArrayList e>
		h = 0x7f0f0235;
	//    5    9:aload_0         
	//    6   10:ldc1            #33  <Int 0x7f0f0235>
	//    7   12:putfield        #35  <Field int h>
		i = 0x7f060078;
	//    8   15:aload_0         
	//    9   16:ldc1            #36  <Int 0x7f060078>
	//   10   18:putfield        #38  <Field int i>
		k = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #40  <Field boolean k>
		l = false;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #42  <Field boolean l>
		m = false;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #44  <Field boolean m>
		n = false;
	//   20   36:aload_0         
	//   21   37:iconst_0        
	//   22   38:putfield        #46  <Field boolean n>
	//   23   41:return          
	}

	protected void e()
	{
		if(l)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field boolean l>
	//*   2    4:ifeq            11
			com.irobot.home.util.j.a(((android.app.Activity) (this)));
	//    3    7:aload_0         
	//    4    8:invokestatic    #51  <Method void j.a(android.app.Activity)>
		finish();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #54  <Method void finish()>
	//    7   15:return          
	}

	protected void f()
	{
		b(f);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #56  <Field int f>
	//    3    5:invokevirtual   #60  <Method void b(int)>
		Object obj = ((Object) (af.b().a(g).b(i).a(e).a(j).b(k).a()));
	//    4    8:invokestatic    #65  <Method com.irobot.home.fragments.af$a af.b()>
	//    5   11:aload_0         
	//    6   12:getfield        #67  <Field int g>
	//    7   15:invokevirtual   #72  <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(int)>
	//    8   18:aload_0         
	//    9   19:getfield        #38  <Field int i>
	//   10   22:invokevirtual   #74  <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.b(int)>
	//   11   25:aload_0         
	//   12   26:getfield        #32  <Field ArrayList e>
	//   13   29:invokevirtual   #77  <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(ArrayList)>
	//   14   32:aload_0         
	//   15   33:getfield        #79  <Field boolean j>
	//   16   36:invokevirtual   #82  <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(boolean)>
	//   17   39:aload_0         
	//   18   40:getfield        #40  <Field boolean k>
	//   19   43:invokevirtual   #84  <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.b(boolean)>
	//   20   46:invokevirtual   #87  <Method com.irobot.home.fragments.ae com.irobot.home.fragments.af$a.a()>
	//   21   49:astore_2        
		getFragmentManager().beginTransaction().add(0x7f0901de, ((android.app.Fragment) (obj))).commit();
	//   22   50:aload_0         
	//   23   51:invokevirtual   #91  <Method FragmentManager getFragmentManager()>
	//   24   54:invokevirtual   #97  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   25   57:ldc1            #98  <Int 0x7f0901de>
	//   26   59:aload_2         
	//   27   60:invokevirtual   #104 <Method FragmentTransaction FragmentTransaction.add(int, android.app.Fragment)>
	//   28   63:invokevirtual   #108 <Method int FragmentTransaction.commit()>
	//   29   66:pop             
		obj = ((Object) (o));
	//   30   67:aload_0         
	//   31   68:getfield        #110 <Field Button o>
	//   32   71:astore_2        
		byte byte0;
		if(m)
	//*  33   72:aload_0         
	//*  34   73:getfield        #44  <Field boolean m>
	//*  35   76:ifeq            84
			byte0 = 0;
	//   36   79:iconst_0        
	//   37   80:istore_1        
		else
	//*  38   81:goto            87
			byte0 = 8;
	//   39   84:bipush          8
	//   40   86:istore_1        
		((Button) (obj)).setVisibility(((int) (byte0)));
	//   41   87:aload_2         
	//   42   88:iload_1         
	//   43   89:invokevirtual   #115 <Method void Button.setVisibility(int)>
		o.setText(h);
	//   44   92:aload_0         
	//   45   93:getfield        #110 <Field Button o>
	//   46   96:aload_0         
	//   47   97:getfield        #35  <Field int h>
	//   48  100:invokevirtual   #118 <Method void Button.setText(int)>
	//   49  103:return          
	}

	public void onBackPressed()
	{
		if(n)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field boolean n>
	//*   2    4:ifeq            12
		{
			e();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #121 <Method void e()>
			return;
	//    5   11:return          
		} else
		{
			super.onBackPressed();
	//    6   12:aload_0         
	//    7   13:invokespecial   #123 <Method void BaseFragmentActivity.onBackPressed()>
			return;
	//    8   16:return          
		}
	}

	private static final String a = "VideoHelpActivity";
	ArrayList e;
	int f;
	int g;
	int h;
	int i;
	boolean j;
	boolean k;
	boolean l;
	boolean m;
	boolean n;
	Button o;

	static 
	{
	//    0    0:return          
	}
}
