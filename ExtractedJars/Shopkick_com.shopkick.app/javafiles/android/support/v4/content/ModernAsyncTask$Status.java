// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;


// Referenced classes of package android.support.v4.content:
//			ModernAsyncTask

public static final class ModernAsyncTask$Status extends Enum
{

	public static ModernAsyncTask$Status valueOf(String s)
	{
		return (ModernAsyncTask$Status)Enum.valueOf(android/support/v4/content/ModernAsyncTask$Status, s);
	//    0    0:ldc1            #2   <Class ModernAsyncTask$Status>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ModernAsyncTask$Status>
	//    4    9:areturn         
	}

	public static ModernAsyncTask$Status[] values()
	{
		return (ModernAsyncTask$Status[])((ModernAsyncTask$Status []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field ModernAsyncTask$Status[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Landroid.support.v4.content.ModernAsyncTask$Status_3B_.clone()>
	//    2    6:checkcast       #42  <Class ModernAsyncTask$Status[]>
	//    3    9:areturn         
	}

	private static final ModernAsyncTask$Status $VALUES[];
	public static final ModernAsyncTask$Status FINISHED;
	public static final ModernAsyncTask$Status PENDING;
	public static final ModernAsyncTask$Status RUNNING;

	static 
	{
		PENDING = new ModernAsyncTask$Status("PENDING", 0);
	//    0    0:new             #2   <Class ModernAsyncTask$Status>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "PENDING">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void ModernAsyncTask$Status(String, int)>
	//    5   10:putstatic       #23  <Field ModernAsyncTask$Status PENDING>
		RUNNING = new ModernAsyncTask$Status("RUNNING", 1);
	//    6   13:new             #2   <Class ModernAsyncTask$Status>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "RUNNING">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void ModernAsyncTask$Status(String, int)>
	//   11   23:putstatic       #26  <Field ModernAsyncTask$Status RUNNING>
		FINISHED = new ModernAsyncTask$Status("FINISHED", 2);
	//   12   26:new             #2   <Class ModernAsyncTask$Status>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "FINISHED">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void ModernAsyncTask$Status(String, int)>
	//   17   36:putstatic       #29  <Field ModernAsyncTask$Status FINISHED>
		$VALUES = (new ModernAsyncTask$Status[] {
			PENDING, RUNNING, FINISHED
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       ModernAsyncTask$Status[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field ModernAsyncTask$Status PENDING>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field ModernAsyncTask$Status RUNNING>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field ModernAsyncTask$Status FINISHED>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field ModernAsyncTask$Status[] $VALUES>
	//*  33   64:return          
	}

	private ModernAsyncTask$Status(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
