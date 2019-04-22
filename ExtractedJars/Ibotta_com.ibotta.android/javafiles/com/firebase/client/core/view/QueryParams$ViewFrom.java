// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view;


// Referenced classes of package com.firebase.client.core.view:
//			QueryParams

private static final class QueryParams$ViewFrom extends Enum
{

	public static QueryParams$ViewFrom valueOf(String s)
	{
		return (QueryParams$ViewFrom)Enum.valueOf(com/firebase/client/core/view/QueryParams$ViewFrom, s);
	//    0    0:ldc1            #2   <Class QueryParams$ViewFrom>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class QueryParams$ViewFrom>
	//    4    9:areturn         
	}

	public static QueryParams$ViewFrom[] values()
	{
		return (QueryParams$ViewFrom[])((QueryParams$ViewFrom []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field QueryParams$ViewFrom[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.firebase.client.core.view.QueryParams$ViewFrom_3B_.clone()>
	//    2    6:checkcast       #38  <Class QueryParams$ViewFrom[]>
	//    3    9:areturn         
	}

	private static final QueryParams$ViewFrom $VALUES[];
	public static final QueryParams$ViewFrom LEFT;
	public static final QueryParams$ViewFrom RIGHT;

	static 
	{
		LEFT = new QueryParams$ViewFrom("LEFT", 0);
	//    0    0:new             #2   <Class QueryParams$ViewFrom>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "LEFT">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void QueryParams$ViewFrom(String, int)>
	//    5   10:putstatic       #22  <Field QueryParams$ViewFrom LEFT>
		RIGHT = new QueryParams$ViewFrom("RIGHT", 1);
	//    6   13:new             #2   <Class QueryParams$ViewFrom>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "RIGHT">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void QueryParams$ViewFrom(String, int)>
	//   11   23:putstatic       #25  <Field QueryParams$ViewFrom RIGHT>
		$VALUES = (new QueryParams$ViewFrom[] {
			LEFT, RIGHT
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       QueryParams$ViewFrom[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field QueryParams$ViewFrom LEFT>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field QueryParams$ViewFrom RIGHT>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field QueryParams$ViewFrom[] $VALUES>
	//*  23   45:return          
	}

	private QueryParams$ViewFrom(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
