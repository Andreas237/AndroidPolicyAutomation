// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin;


public final class DeprecationLevel extends Enum
{

	protected DeprecationLevel(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #43  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static DeprecationLevel valueOf(String s)
	{
		return (DeprecationLevel)Enum.valueOf(kotlin/DeprecationLevel, s);
	//    0    0:ldc1            #2   <Class DeprecationLevel>
	//    1    2:aload_0         
	//    2    3:invokestatic    #49  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class DeprecationLevel>
	//    4    9:areturn         
	}

	public static DeprecationLevel[] values()
	{
		return (DeprecationLevel[])((DeprecationLevel []) ($VALUES)).clone();
	//    0    0:getstatic       #41  <Field DeprecationLevel[] $VALUES>
	//    1    3:invokevirtual   #56  <Method Object _5B_Lkotlin.DeprecationLevel_3B_.clone()>
	//    2    6:checkcast       #52  <Class DeprecationLevel[]>
	//    3    9:areturn         
	}

	private static final DeprecationLevel $VALUES[];
	public static final DeprecationLevel ERROR;
	public static final DeprecationLevel HIDDEN;
	public static final DeprecationLevel WARNING;

	static 
	{
		DeprecationLevel deprecationlevel = new DeprecationLevel("WARNING", 0);
	//    0    0:new             #2   <Class DeprecationLevel>
	//    1    3:dup             
	//    2    4:ldc1            #28  <String "WARNING">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #31  <Method void DeprecationLevel(String, int)>
	//    5   10:astore_0        
		WARNING = deprecationlevel;
	//    6   11:aload_0         
	//    7   12:putstatic       #33  <Field DeprecationLevel WARNING>
		DeprecationLevel deprecationlevel1 = new DeprecationLevel("ERROR", 1);
	//    8   15:new             #2   <Class DeprecationLevel>
	//    9   18:dup             
	//   10   19:ldc1            #34  <String "ERROR">
	//   11   21:iconst_1        
	//   12   22:invokespecial   #31  <Method void DeprecationLevel(String, int)>
	//   13   25:astore_1        
		ERROR = deprecationlevel1;
	//   14   26:aload_1         
	//   15   27:putstatic       #36  <Field DeprecationLevel ERROR>
		DeprecationLevel deprecationlevel2 = new DeprecationLevel("HIDDEN", 2);
	//   16   30:new             #2   <Class DeprecationLevel>
	//   17   33:dup             
	//   18   34:ldc1            #37  <String "HIDDEN">
	//   19   36:iconst_2        
	//   20   37:invokespecial   #31  <Method void DeprecationLevel(String, int)>
	//   21   40:astore_2        
		HIDDEN = deprecationlevel2;
	//   22   41:aload_2         
	//   23   42:putstatic       #39  <Field DeprecationLevel HIDDEN>
		$VALUES = (new DeprecationLevel[] {
			deprecationlevel, deprecationlevel1, deprecationlevel2
		});
	//   24   45:iconst_3        
	//   25   46:anewarray       DeprecationLevel[]
	//   26   49:dup             
	//   27   50:iconst_0        
	//   28   51:aload_0         
	//   29   52:aastore         
	//   30   53:dup             
	//   31   54:iconst_1        
	//   32   55:aload_1         
	//   33   56:aastore         
	//   34   57:dup             
	//   35   58:iconst_2        
	//   36   59:aload_2         
	//   37   60:aastore         
	//   38   61:putstatic       #41  <Field DeprecationLevel[] $VALUES>
	//*  39   64:return          
	}
}
