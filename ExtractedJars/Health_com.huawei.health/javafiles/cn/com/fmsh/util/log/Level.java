// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.util.log;


public final class Level extends Enum
{

	private Level(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #38  <Method void Enum(String, int)>
		id = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #40  <Field int id>
	//    7   11:return          
	}

	public static Level instance(int i)
	{
		Level alevel[] = values();
	//    0    0:invokestatic    #46  <Method Level[] values()>
	//    1    3:astore_3        
		int k = alevel.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int j = 0; j < k; j++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:goto            33
		{
			Level level = alevel[j];
	//    8   12:aload_3         
	//    9   13:iload_1         
	//   10   14:aaload          
	//   11   15:astore          4
			if(level.getId() == i)
	//*  12   17:aload           4
	//*  13   19:invokevirtual   #50  <Method int getId()>
	//*  14   22:iload_0         
	//*  15   23:icmpne          29
				return level;
	//   16   26:aload           4
	//   17   28:areturn         
		}

	//   18   29:iload_1         
	//   19   30:iconst_1        
	//   20   31:iadd            
	//   21   32:istore_1        
	//   22   33:iload_1         
	//   23   34:iload_2         
	//   24   35:icmplt          12
		return null;
	//   25   38:aconst_null     
	//   26   39:areturn         
	}

	public static Level valueOf(String s)
	{
		return (Level)Enum.valueOf(cn/com/fmsh/util/log/Level, s);
	//    0    0:ldc1            #2   <Class Level>
	//    1    2:aload_0         
	//    2    3:invokestatic    #55  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Level>
	//    4    9:areturn         
	}

	public static Level[] values()
	{
		Level alevel[] = ENUM$VALUES;
	//    0    0:getstatic       #34  <Field Level[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = alevel.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		Level alevel1[] = new Level[i];
	//    5    7:iload_0         
	//    6    8:anewarray       Level[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (alevel)), 0, ((Object) (alevel1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #61  <Method void System.arraycopy(Object, int, Object, int, int)>
		return alevel1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public int getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int id>
	//    2    4:ireturn         
	}

	public static final Level DEBUG;
	private static final Level ENUM$VALUES[];
	public static final Level ERROR;
	public static final Level INFO;
	public static final Level WARNING;
	private int id;

	static 
	{
		DEBUG = new Level("DEBUG", 0, 0);
	//    0    0:new             #2   <Class Level>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "DEBUG">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #21  <Method void Level(String, int, int)>
	//    6   11:putstatic       #23  <Field Level DEBUG>
		INFO = new Level("INFO", 1, 1);
	//    7   14:new             #2   <Class Level>
	//    8   17:dup             
	//    9   18:ldc1            #24  <String "INFO">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #21  <Method void Level(String, int, int)>
	//   13   25:putstatic       #26  <Field Level INFO>
		WARNING = new Level("WARNING", 2, 2);
	//   14   28:new             #2   <Class Level>
	//   15   31:dup             
	//   16   32:ldc1            #27  <String "WARNING">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #21  <Method void Level(String, int, int)>
	//   20   39:putstatic       #29  <Field Level WARNING>
		ERROR = new Level("ERROR", 3, 3);
	//   21   42:new             #2   <Class Level>
	//   22   45:dup             
	//   23   46:ldc1            #30  <String "ERROR">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #21  <Method void Level(String, int, int)>
	//   27   53:putstatic       #32  <Field Level ERROR>
		ENUM$VALUES = (new Level[] {
			DEBUG, INFO, WARNING, ERROR
		});
	//   28   56:iconst_4        
	//   29   57:anewarray       Level[]
	//   30   60:dup             
	//   31   61:iconst_0        
	//   32   62:getstatic       #23  <Field Level DEBUG>
	//   33   65:aastore         
	//   34   66:dup             
	//   35   67:iconst_1        
	//   36   68:getstatic       #26  <Field Level INFO>
	//   37   71:aastore         
	//   38   72:dup             
	//   39   73:iconst_2        
	//   40   74:getstatic       #29  <Field Level WARNING>
	//   41   77:aastore         
	//   42   78:dup             
	//   43   79:iconst_3        
	//   44   80:getstatic       #32  <Field Level ERROR>
	//   45   83:aastore         
	//   46   84:putstatic       #34  <Field Level[] ENUM$VALUES>
	//*  47   87:return          
	}
}
