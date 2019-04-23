// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.models.outgoing.AppboyProperties;

// Referenced classes of package bo.app:
//			fj, bu

public class fa extends fj
{

	public fa(String s, AppboyProperties appboyproperties, bu bu)
	{
		super(appboyproperties, bu);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #11  <Method void fj(AppboyProperties, bu)>
		a = s;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #13  <Field String a>
	//    7   11:return          
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field String a>
	//    2    4:areturn         
	}

	public String b()
	{
		return "custom_event";
	//    0    0:ldc1            #18  <String "custom_event">
	//    1    2:areturn         
	}

	private String a;
}
