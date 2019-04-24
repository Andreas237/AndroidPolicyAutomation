// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package butterknife.internal;


// Referenced classes of package butterknife.internal:
//			ListenerClass

public static final class ListenerClass$NONE extends Enum
{

	public static ListenerClass$NONE valueOf(String s)
	{
		return (ListenerClass$NONE)Enum.valueOf(butterknife/internal/ListenerClass$NONE, s);
	//    0    0:ldc1            #2   <Class ListenerClass$NONE>
	//    1    2:aload_0         
	//    2    3:invokestatic    #25  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ListenerClass$NONE>
	//    4    9:areturn         
	}

	public static ListenerClass$NONE[] values()
	{
		return (ListenerClass$NONE[])((ListenerClass$NONE []) ($VALUES)).clone();
	//    0    0:getstatic       #14  <Field ListenerClass$NONE[] $VALUES>
	//    1    3:invokevirtual   #32  <Method Object _5B_Lbutterknife.internal.ListenerClass$NONE_3B_.clone()>
	//    2    6:checkcast       #28  <Class ListenerClass$NONE[]>
	//    3    9:areturn         
	}

	private static final ListenerClass$NONE $VALUES[] = new ListenerClass$NONE[0];

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       ListenerClass$NONE[]
	//    2    4:putstatic       #14  <Field ListenerClass$NONE[] $VALUES>
	//*   3    7:return          
	}

	private ListenerClass$NONE(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #19  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
