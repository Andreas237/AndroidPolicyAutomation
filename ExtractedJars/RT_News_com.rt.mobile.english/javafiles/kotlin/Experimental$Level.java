// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin;


// Referenced classes of package kotlin:
//			Experimental

public static final class Experimental$Level extends Enum
{

	public static Experimental$Level valueOf(String s)
	{
		return (Experimental$Level)Enum.valueOf(kotlin/Experimental$Level, s);
	//    0    0:ldc1            #2   <Class Experimental$Level>
	//    1    2:aload_0         
	//    2    3:invokestatic    #48  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Experimental$Level>
	//    4    9:areturn         
	}

	public static Experimental$Level[] values()
	{
		return (Experimental$Level[])((Experimental$Level []) ($VALUES)).clone();
	//    0    0:getstatic       #40  <Field Experimental$Level[] $VALUES>
	//    1    3:invokevirtual   #55  <Method Object _5B_Lkotlin.Experimental$Level_3B_.clone()>
	//    2    6:checkcast       #51  <Class Experimental$Level[]>
	//    3    9:areturn         
	}

	private static final Experimental$Level $VALUES[];
	public static final Experimental$Level ERROR;
	public static final Experimental$Level WARNING;

	static 
	{
		Experimental$Level experimental$level = new Experimental$Level("WARNING", 0);
	//    0    0:new             #2   <Class Experimental$Level>
	//    1    3:dup             
	//    2    4:ldc1            #30  <String "WARNING">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #33  <Method void Experimental$Level(String, int)>
	//    5   10:astore_0        
		WARNING = experimental$level;
	//    6   11:aload_0         
	//    7   12:putstatic       #35  <Field Experimental$Level WARNING>
		Experimental$Level experimental$level1 = new Experimental$Level("ERROR", 1);
	//    8   15:new             #2   <Class Experimental$Level>
	//    9   18:dup             
	//   10   19:ldc1            #36  <String "ERROR">
	//   11   21:iconst_1        
	//   12   22:invokespecial   #33  <Method void Experimental$Level(String, int)>
	//   13   25:astore_1        
		ERROR = experimental$level1;
	//   14   26:aload_1         
	//   15   27:putstatic       #38  <Field Experimental$Level ERROR>
		$VALUES = (new Experimental$Level[] {
			experimental$level, experimental$level1
		});
	//   16   30:iconst_2        
	//   17   31:anewarray       Experimental$Level[]
	//   18   34:dup             
	//   19   35:iconst_0        
	//   20   36:aload_0         
	//   21   37:aastore         
	//   22   38:dup             
	//   23   39:iconst_1        
	//   24   40:aload_1         
	//   25   41:aastore         
	//   26   42:putstatic       #40  <Field Experimental$Level[] $VALUES>
	//*  27   45:return          
	}

	protected Experimental$Level(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #42  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
