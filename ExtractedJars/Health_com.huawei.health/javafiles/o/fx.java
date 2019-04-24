// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			fv

public final class fx
{

	public fx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static String d(int i, String s, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #14  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("resultStatus={").append(i).append("};memo={").append(s).append("};result={").append(s1).append("}");
	//    4    8:aload_3         
	//    5    9:ldc1            #17  <String "resultStatus={">
	//    6   11:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:iload_0         
	//    8   15:invokevirtual   #24  <Method StringBuilder StringBuilder.append(int)>
	//    9   18:ldc1            #26  <String "};memo={">
	//   10   20:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:ldc1            #28  <String "};result={">
	//   14   29:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:aload_2         
	//   16   33:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   17   36:ldc1            #30  <String "}">
	//   18   38:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   19   41:pop             
		return stringbuilder.toString();
	//   20   42:aload_3         
	//   21   43:invokevirtual   #34  <Method String StringBuilder.toString()>
	//   22   46:areturn         
	}

	public static String e()
	{
		fv fv1 = fv.b(fv.a.i);
	//    0    0:getstatic       #41  <Field fv fv.a>
	//    1    3:getfield        #45  <Field int fv.i>
	//    2    6:invokestatic    #49  <Method fv fv.b(int)>
	//    3    9:astore_0        
		return d(fv1.i, fv1.k, "");
	//    4   10:aload_0         
	//    5   11:getfield        #45  <Field int fv.i>
	//    6   14:aload_0         
	//    7   15:getfield        #52  <Field String fv.k>
	//    8   18:ldc1            #54  <String "">
	//    9   20:invokestatic    #56  <Method String d(int, String, String)>
	//   10   23:areturn         
	}

	public static String d;
}
