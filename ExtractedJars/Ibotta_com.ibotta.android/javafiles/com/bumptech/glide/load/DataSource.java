// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load;


public final class DataSource extends Enum
{

	private DataSource(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #38  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static DataSource valueOf(String s)
	{
		return (DataSource)Enum.valueOf(com/bumptech/glide/load/DataSource, s);
	//    0    0:ldc1            #2   <Class DataSource>
	//    1    2:aload_0         
	//    2    3:invokestatic    #44  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class DataSource>
	//    4    9:areturn         
	}

	public static DataSource[] values()
	{
		return (DataSource[])((DataSource []) ($VALUES)).clone();
	//    0    0:getstatic       #36  <Field DataSource[] $VALUES>
	//    1    3:invokevirtual   #51  <Method Object _5B_Lcom.bumptech.glide.load.DataSource_3B_.clone()>
	//    2    6:checkcast       #47  <Class DataSource[]>
	//    3    9:areturn         
	}

	private static final DataSource $VALUES[];
	public static final DataSource DATA_DISK_CACHE;
	public static final DataSource LOCAL;
	public static final DataSource MEMORY_CACHE;
	public static final DataSource REMOTE;
	public static final DataSource RESOURCE_DISK_CACHE;

	static 
	{
		LOCAL = new DataSource("LOCAL", 0);
	//    0    0:new             #2   <Class DataSource>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "LOCAL">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void DataSource(String, int)>
	//    5   10:putstatic       #22  <Field DataSource LOCAL>
		REMOTE = new DataSource("REMOTE", 1);
	//    6   13:new             #2   <Class DataSource>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "REMOTE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void DataSource(String, int)>
	//   11   23:putstatic       #25  <Field DataSource REMOTE>
		DATA_DISK_CACHE = new DataSource("DATA_DISK_CACHE", 2);
	//   12   26:new             #2   <Class DataSource>
	//   13   29:dup             
	//   14   30:ldc1            #26  <String "DATA_DISK_CACHE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #20  <Method void DataSource(String, int)>
	//   17   36:putstatic       #28  <Field DataSource DATA_DISK_CACHE>
		RESOURCE_DISK_CACHE = new DataSource("RESOURCE_DISK_CACHE", 3);
	//   18   39:new             #2   <Class DataSource>
	//   19   42:dup             
	//   20   43:ldc1            #29  <String "RESOURCE_DISK_CACHE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #20  <Method void DataSource(String, int)>
	//   23   49:putstatic       #31  <Field DataSource RESOURCE_DISK_CACHE>
		MEMORY_CACHE = new DataSource("MEMORY_CACHE", 4);
	//   24   52:new             #2   <Class DataSource>
	//   25   55:dup             
	//   26   56:ldc1            #32  <String "MEMORY_CACHE">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #20  <Method void DataSource(String, int)>
	//   29   62:putstatic       #34  <Field DataSource MEMORY_CACHE>
		$VALUES = (new DataSource[] {
			LOCAL, REMOTE, DATA_DISK_CACHE, RESOURCE_DISK_CACHE, MEMORY_CACHE
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       DataSource[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #22  <Field DataSource LOCAL>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #25  <Field DataSource REMOTE>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #28  <Field DataSource DATA_DISK_CACHE>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #31  <Field DataSource RESOURCE_DISK_CACHE>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #34  <Field DataSource MEMORY_CACHE>
	//   51   98:aastore         
	//   52   99:putstatic       #36  <Field DataSource[] $VALUES>
	//*  53  102:return          
	}
}
