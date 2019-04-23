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
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public static InputMerger fromClassName(String s)
	{
		InputMerger inputmerger;
		try
		{
			inputmerger = (InputMerger)Class.forName(s).newInstance();
	//    0    0:aload_0         
	//    1    1:invokestatic    #36  <Method Class Class.forName(String)>
	//    2    4:invokevirtual   #40  <Method Object Class.newInstance()>
	//    3    7:checkcast       #2   <Class InputMerger>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:areturn         
		catch(Exception exception)
	//*   7   13:astore_1        
		{
			Logger logger = Logger.get();
	//    8   14:invokestatic    #44  <Method Logger Logger.get()>
	//    9   17:astore_2        
			String s1 = TAG;
	//   10   18:getstatic       #18  <Field String TAG>
	//   11   21:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   12   22:new             #46  <Class StringBuilder>
	//   13   25:dup             
	//   14   26:invokespecial   #47  <Method void StringBuilder()>
	//   15   29:astore          4
			stringbuilder.append("Trouble instantiating + ");
	//   16   31:aload           4
	//   17   33:ldc1            #49  <String "Trouble instantiating + ">
	//   18   35:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
			stringbuilder.append(s);
	//   20   39:aload           4
	//   21   41:aload_0         
	//   22   42:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
			logger.error(s1, stringbuilder.toString(), new Throwable[] {
				exception
			});
	//   24   46:aload_2         
	//   25   47:aload_3         
	//   26   48:aload           4
	//   27   50:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   28   53:iconst_1        
	//   29   54:anewarray       Throwable[]
	//   30   57:dup             
	//   31   58:iconst_0        
	//   32   59:aload_1         
	//   33   60:aastore         
	//   34   61:invokevirtual   #63  <Method void Logger.error(String, String, Throwable[])>
			return null;
	//   35   64:aconst_null     
	//   36   65:areturn         
		}
		return inputmerger;
	}

	public abstract Data merge(List list);

	private static final String TAG = Logger.tagWithPrefix("InputMerger");

	static 
	{
	//    0    0:ldc1            #10  <String "InputMerger">
	//    1    2:invokestatic    #16  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #18  <Field String TAG>
	//*   3    8:return          
	}
}
