// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.irobot.home.fragments.bg;
import com.irobot.home.fragments.bh;
import com.irobot.home.m.c;
import com.irobot.home.util.j;
import com.irobot.home.util.k;
import org.androidannotations.api.b.d;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity

public class RobotCleaningPreferencesActivity extends BaseFragmentActivity
{

	public RobotCleaningPreferencesActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void BaseFragmentActivity()>
		b = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #36  <Field boolean b>
		c = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #38  <Field boolean c>
	//    8   14:return          
	}

	public void e()
	{
		b(0x7f0f08c7);
	//    0    0:aload_0         
	//    1    1:ldc1            #39  <Int 0x7f0f08c7>
	//    2    3:invokevirtual   #42  <Method void b(int)>
		f = bh.c().a(a).a(b).a();
	//    3    6:aload_0         
	//    4    7:invokestatic    #47  <Method com.irobot.home.fragments.bh$a bh.c()>
	//    5   10:aload_0         
	//    6   11:getfield        #49  <Field String a>
	//    7   14:invokevirtual   #54  <Method com.irobot.home.fragments.bh$a com.irobot.home.fragments.bh$a.a(String)>
	//    8   17:aload_0         
	//    9   18:getfield        #36  <Field boolean b>
	//   10   21:invokevirtual   #57  <Method com.irobot.home.fragments.bh$a com.irobot.home.fragments.bh$a.a(boolean)>
	//   11   24:invokevirtual   #60  <Method bg com.irobot.home.fragments.bh$a.a()>
	//   12   27:putfield        #62  <Field bg f>
		getSupportFragmentManager().beginTransaction().add(0x7f0902fe, ((android.support.v4.app.Fragment) (f))).commit();
	//   13   30:aload_0         
	//   14   31:invokevirtual   #66  <Method FragmentManager getSupportFragmentManager()>
	//   15   34:invokevirtual   #72  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   16   37:ldc1            #73  <Int 0x7f0902fe>
	//   17   39:aload_0         
	//   18   40:getfield        #62  <Field bg f>
	//   19   43:invokevirtual   #79  <Method FragmentTransaction FragmentTransaction.add(int, android.support.v4.app.Fragment)>
	//   20   46:invokevirtual   #83  <Method int FragmentTransaction.commit()>
	//   21   49:pop             
		f();
	//   22   50:aload_0         
	//   23   51:invokevirtual   #85  <Method void f()>
	//   24   54:return          
	}

	public void f()
	{
		if(!((Boolean)d.f().a()).booleanValue() && !c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field k d>
	//*   2    4:invokevirtual   #92  <Method d k.f()>
	//*   3    7:invokevirtual   #97  <Method Object d.a()>
	//*   4   10:checkcast       #99  <Class Boolean>
	//*   5   13:invokevirtual   #103 <Method boolean Boolean.booleanValue()>
	//*   6   16:ifne            55
	//*   7   19:aload_0         
	//*   8   20:getfield        #38  <Field boolean c>
	//*   9   23:ifne            55
		{
			com.irobot.home.m.c.a(((android.app.Activity) (this)), 0x7f0900df, 0x7f0f05e8);
	//   10   26:aload_0         
	//   11   27:ldc1            #104 <Int 0x7f0900df>
	//   12   29:ldc1            #105 <Int 0x7f0f05e8>
	//   13   31:invokestatic    #110 <Method android.view.View c.a(android.app.Activity, int, int)>
	//   14   34:pop             
			((com.irobot.home.util.k.a)d.a().f().a(true)).n();
	//   15   35:aload_0         
	//   16   36:getfield        #87  <Field k d>
	//   17   39:invokevirtual   #113 <Method com.irobot.home.util.k$a k.a()>
	//   18   42:invokevirtual   #118 <Method org.androidannotations.api.b.c com.irobot.home.util.k$a.f()>
	//   19   45:iconst_1        
	//   20   46:invokevirtual   #123 <Method org.androidannotations.api.b.e org.androidannotations.api.b.c.a(boolean)>
	//   21   49:checkcast       #115 <Class com.irobot.home.util.k$a>
	//   22   52:invokevirtual   #126 <Method void com.irobot.home.util.k$a.n()>
		}
	//   23   55:return          
	}

	private static final String e = j.r(((Class) (com/irobot/home/RobotCleaningPreferencesActivity)).getSimpleName());
	String a;
	boolean b;
	boolean c;
	k d;
	private bg f;

	static 
	{
	//    0    0:ldc1            #2   <Class RobotCleaningPreferencesActivity>
	//    1    2:invokevirtual   #22  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #28  <Method String j.r(String)>
	//    3    8:putstatic       #30  <Field String e>
	//*   4   11:return          
	}
}
