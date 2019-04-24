// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package butterknife.internal;


final class Parameter
{

	Parameter(int i, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		listenerPosition = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #21  <Field int listenerPosition>
		type = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field String type>
	//    8   14:return          
	}

	int getListenerPosition()
	{
		return listenerPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int listenerPosition>
	//    2    4:ireturn         
	}

	String getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String type>
	//    2    4:areturn         
	}

	static final Parameter NONE[] = new Parameter[0];
	private final int listenerPosition;
	private final String type;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       Parameter[]
	//    2    4:putstatic       #14  <Field Parameter[] NONE>
	//*   3    7:return          
	}
}
