// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;


// Referenced classes of package bo.app:
//			fi, fb, bu

public class fg extends fi
	implements fb
{

	public fg(String s, bu bu)
	{
		super(bu);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #13  <Method void fi(bu)>
		a = a(s);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #16  <Method String a(String)>
	//    7   11:putfield        #18  <Field String a>
	//    8   14:return          
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String a>
	//    2    4:areturn         
	}

	public String b()
	{
		return "push_click";
	//    0    0:ldc1            #23  <String "push_click">
	//    1    2:areturn         
	}

	private String a;
}
