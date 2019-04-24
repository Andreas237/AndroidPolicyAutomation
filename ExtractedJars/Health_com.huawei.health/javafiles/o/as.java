// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.view.ViewGroup;

// Referenced classes of package o:
//			ao, ar, aq, al

public class as
{

	as()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	public static void a(ViewGroup viewgroup, boolean flag)
	{
		a.e(viewgroup, flag);
	//    0    0:getstatic       #21  <Field aq a>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokeinterface #33  <Method void aq.e(ViewGroup, boolean)>
	//    4   10:return          
	}

	public static al e(ViewGroup viewgroup)
	{
		return a.d(viewgroup);
	//    0    0:getstatic       #21  <Field aq a>
	//    1    3:aload_0         
	//    2    4:invokeinterface #38  <Method al aq.d(ViewGroup)>
	//    3    9:areturn         
	}

	private static final aq a;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          19
			a = ((aq) (new ao()));
	//    3    8:new             #16  <Class ao>
	//    4   11:dup             
	//    5   12:invokespecial   #19  <Method void ao()>
	//    6   15:putstatic       #21  <Field aq a>
	//    7   18:return          
		else
			a = ((aq) (new ar()));
	//    8   19:new             #23  <Class ar>
	//    9   22:dup             
	//   10   23:invokespecial   #24  <Method void ar()>
	//   11   26:putstatic       #21  <Field aq a>
	//*  12   29:return          
	}
}
