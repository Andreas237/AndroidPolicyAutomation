// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;


// Referenced classes of package com.firebase.client.snapshot:
//			LeafNode

protected static final class LeafNode$LeafType extends Enum
{

	public static LeafNode$LeafType valueOf(String s)
	{
		return (LeafNode$LeafType)Enum.valueOf(com/firebase/client/snapshot/LeafNode$LeafType, s);
	//    0    0:ldc1            #2   <Class LeafNode$LeafType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class LeafNode$LeafType>
	//    4    9:areturn         
	}

	public static LeafNode$LeafType[] values()
	{
		return (LeafNode$LeafType[])((LeafNode$LeafType []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field LeafNode$LeafType[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.firebase.client.snapshot.LeafNode$LeafType_3B_.clone()>
	//    2    6:checkcast       #46  <Class LeafNode$LeafType[]>
	//    3    9:areturn         
	}

	private static final LeafNode$LeafType $VALUES[];
	public static final LeafNode$LeafType Boolean;
	public static final LeafNode$LeafType DeferredValue;
	public static final LeafNode$LeafType Number;
	public static final LeafNode$LeafType String;

	static 
	{
		DeferredValue = new LeafNode$LeafType("DeferredValue", 0);
	//    0    0:new             #2   <Class LeafNode$LeafType>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "DeferredValue">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void LeafNode$LeafType(String, int)>
	//    5   10:putstatic       #24  <Field LeafNode$LeafType DeferredValue>
		Boolean = new LeafNode$LeafType("Boolean", 1);
	//    6   13:new             #2   <Class LeafNode$LeafType>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "Boolean">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void LeafNode$LeafType(String, int)>
	//   11   23:putstatic       #27  <Field LeafNode$LeafType Boolean>
		Number = new LeafNode$LeafType("Number", 2);
	//   12   26:new             #2   <Class LeafNode$LeafType>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "Number">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void LeafNode$LeafType(String, int)>
	//   17   36:putstatic       #30  <Field LeafNode$LeafType Number>
		String = new LeafNode$LeafType("String", 3);
	//   18   39:new             #2   <Class LeafNode$LeafType>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "String">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void LeafNode$LeafType(String, int)>
	//   23   49:putstatic       #33  <Field LeafNode$LeafType String>
		$VALUES = (new LeafNode$LeafType[] {
			DeferredValue, Boolean, Number, String
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       LeafNode$LeafType[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field LeafNode$LeafType DeferredValue>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field LeafNode$LeafType Boolean>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field LeafNode$LeafType Number>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field LeafNode$LeafType String>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field LeafNode$LeafType[] $VALUES>
	//*  43   83:return          
	}

	private LeafNode$LeafType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
