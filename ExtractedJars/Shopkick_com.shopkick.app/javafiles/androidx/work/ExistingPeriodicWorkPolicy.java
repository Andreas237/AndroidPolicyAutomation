// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;


public final class ExistingPeriodicWorkPolicy extends Enum
{

	private ExistingPeriodicWorkPolicy(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #26  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static ExistingPeriodicWorkPolicy valueOf(String s)
	{
		return (ExistingPeriodicWorkPolicy)Enum.valueOf(androidx/work/ExistingPeriodicWorkPolicy, s);
	//    0    0:ldc1            #2   <Class ExistingPeriodicWorkPolicy>
	//    1    2:aload_0         
	//    2    3:invokestatic    #32  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ExistingPeriodicWorkPolicy>
	//    4    9:areturn         
	}

	public static ExistingPeriodicWorkPolicy[] values()
	{
		return (ExistingPeriodicWorkPolicy[])((ExistingPeriodicWorkPolicy []) ($VALUES)).clone();
	//    0    0:getstatic       #24  <Field ExistingPeriodicWorkPolicy[] $VALUES>
	//    1    3:invokevirtual   #39  <Method Object _5B_Landroidx.work.ExistingPeriodicWorkPolicy_3B_.clone()>
	//    2    6:checkcast       #35  <Class ExistingPeriodicWorkPolicy[]>
	//    3    9:areturn         
	}

	private static final ExistingPeriodicWorkPolicy $VALUES[];
	public static final ExistingPeriodicWorkPolicy KEEP;
	public static final ExistingPeriodicWorkPolicy REPLACE;

	static 
	{
		REPLACE = new ExistingPeriodicWorkPolicy("REPLACE", 0);
	//    0    0:new             #2   <Class ExistingPeriodicWorkPolicy>
	//    1    3:dup             
	//    2    4:ldc1            #13  <String "REPLACE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #17  <Method void ExistingPeriodicWorkPolicy(String, int)>
	//    5   10:putstatic       #19  <Field ExistingPeriodicWorkPolicy REPLACE>
		KEEP = new ExistingPeriodicWorkPolicy("KEEP", 1);
	//    6   13:new             #2   <Class ExistingPeriodicWorkPolicy>
	//    7   16:dup             
	//    8   17:ldc1            #20  <String "KEEP">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #17  <Method void ExistingPeriodicWorkPolicy(String, int)>
	//   11   23:putstatic       #22  <Field ExistingPeriodicWorkPolicy KEEP>
		$VALUES = (new ExistingPeriodicWorkPolicy[] {
			REPLACE, KEEP
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       ExistingPeriodicWorkPolicy[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #19  <Field ExistingPeriodicWorkPolicy REPLACE>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #22  <Field ExistingPeriodicWorkPolicy KEEP>
	//   21   41:aastore         
	//   22   42:putstatic       #24  <Field ExistingPeriodicWorkPolicy[] $VALUES>
	//*  23   45:return          
	}
}
