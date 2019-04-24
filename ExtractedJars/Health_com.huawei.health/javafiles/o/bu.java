// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


public class bu extends Exception
{

	public bu(Integer integer, String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #12  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("Http Transport error");
	//    4    8:aload_3         
	//    5    9:ldc1            #17  <String "Http Transport error">
	//    6   11:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		if(integer != null)
	//*   8   15:aload_1         
	//*   9   16:ifnull          35
			stringbuilder.append("[").append(((Object) (integer))).append("]");
	//   10   19:aload_3         
	//   11   20:ldc1            #23  <String "[">
	//   12   22:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #26  <Method StringBuilder StringBuilder.append(Object)>
	//   15   29:ldc1            #28  <String "]">
	//   16   31:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
		stringbuilder.append(" : ");
	//   18   35:aload_3         
	//   19   36:ldc1            #30  <String " : ">
	//   20   38:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
		if(s != null)
	//*  22   42:aload_2         
	//*  23   43:ifnull          52
			stringbuilder.append(s);
	//   24   46:aload_3         
	//   25   47:aload_2         
	//   26   48:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
		super(stringbuilder.toString());
	//   28   52:aload_0         
	//   29   53:aload_3         
	//   30   54:invokevirtual   #34  <Method String StringBuilder.toString()>
	//   31   57:invokespecial   #37  <Method void Exception(String)>
		a = integer.intValue();
	//   32   60:aload_0         
	//   33   61:aload_1         
	//   34   62:invokevirtual   #43  <Method int Integer.intValue()>
	//   35   65:putfield        #45  <Field int a>
		d = s;
	//   36   68:aload_0         
	//   37   69:aload_2         
	//   38   70:putfield        #47  <Field String d>
	//   39   73:return          
	}

	public int a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int a>
	//    2    4:ireturn         
	}

	public String e()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String d>
	//    2    4:areturn         
	}

	private int a;
	private String d;
}
