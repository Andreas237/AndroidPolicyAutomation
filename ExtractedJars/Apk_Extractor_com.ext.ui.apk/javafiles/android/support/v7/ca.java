// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;


// Referenced classes of package android.support.v7:
//			bz

public class ca
{

	public ca(int i, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #15  <Field int a>
		if(s == null || s.trim().length() == 0)
	//*   5    9:aload_2         
	//*   6   10:ifnull          23
	//*   7   13:aload_2         
	//*   8   14:invokevirtual   #21  <Method String String.trim()>
	//*   9   17:invokevirtual   #25  <Method int String.length()>
	//*  10   20:ifne            32
		{
			b = bz.a(i);
	//   11   23:aload_0         
	//   12   24:iload_1         
	//   13   25:invokestatic    #30  <Method String bz.a(int)>
	//   14   28:putfield        #32  <Field String b>
			return;
	//   15   31:return          
		} else
		{
			b = (new StringBuilder()).append(s).append(" (response: ").append(bz.a(i)).append(")").toString();
	//   16   32:aload_0         
	//   17   33:new             #34  <Class StringBuilder>
	//   18   36:dup             
	//   19   37:invokespecial   #35  <Method void StringBuilder()>
	//   20   40:aload_2         
	//   21   41:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   22   44:ldc1            #41  <String " (response: ">
	//   23   46:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   24   49:iload_1         
	//   25   50:invokestatic    #30  <Method String bz.a(int)>
	//   26   53:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   27   56:ldc1            #43  <String ")">
	//   28   58:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   29   61:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   30   64:putfield        #32  <Field String b>
			return;
	//   31   67:return          
		}
	}

	public String a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String b>
	//    2    4:areturn         
	}

	public boolean b()
	{
		return a == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field int a>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean c()
	{
		return !b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #51  <Method boolean b()>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("IabResult: ").append(a()).toString();
	//    0    0:new             #34  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void StringBuilder()>
	//    3    7:ldc1            #53  <String "IabResult: ">
	//    4    9:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #55  <Method String a()>
	//    7   16:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #46  <Method String StringBuilder.toString()>
	//    9   22:areturn         
	}

	int a;
	String b;
}
