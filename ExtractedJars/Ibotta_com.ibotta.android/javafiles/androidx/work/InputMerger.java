// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import java.util.List;

// Referenced classes of package androidx.work:
//			Logger, Data

public abstract class InputMerger
{

	public InputMerger()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static InputMerger fromClassName(String s)
	{
		InputMerger inputmerger;
		try
		{
			inputmerger = (InputMerger)Class.forName(s).newInstance();
	//    0    0:aload_0         
	//    1    1:invokestatic    #23  <Method Class Class.forName(String)>
	//    2    4:invokevirtual   #27  <Method Object Class.newInstance()>
	//    3    7:checkcast       #2   <Class InputMerger>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:areturn         
		catch(Exception exception)
	//*   7   13:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   14:new             #29  <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #30  <Method void StringBuilder()>
	//   11   21:astore_2        
			stringbuilder.append("Trouble instantiating + ");
	//   12   22:aload_2         
	//   13   23:ldc1            #32  <String "Trouble instantiating + ">
	//   14   25:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
			stringbuilder.append(s);
	//   16   29:aload_2         
	//   17   30:aload_0         
	//   18   31:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             
			Logger.error("InputMerger", stringbuilder.toString(), new Throwable[] {
				exception
			});
	//   20   35:ldc1            #38  <String "InputMerger">
	//   21   37:aload_2         
	//   22   38:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   23   41:iconst_1        
	//   24   42:anewarray       Throwable[]
	//   25   45:dup             
	//   26   46:iconst_0        
	//   27   47:aload_1         
	//   28   48:aastore         
	//   29   49:invokestatic    #50  <Method void Logger.error(String, String, Throwable[])>
			return null;
	//   30   52:aconst_null     
	//   31   53:areturn         
		}
		return inputmerger;
	}

	public abstract Data merge(List list);
}
