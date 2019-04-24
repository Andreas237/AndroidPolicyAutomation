// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			ny

public static abstract class ny$b
{

	protected abstract ny$b a();

	public static int f = -1;
	int g;

	static 
	{
	//    0    0:iconst_m1       
	//    1    1:putstatic       #14  <Field int f>
	//*   2    4:return          
	}

	public ny$b()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		g = f;
	//    2    4:aload_0         
	//    3    5:getstatic       #14  <Field int f>
	//    4    8:putfield        #20  <Field int g>
	//    5   11:return          
	}
}
