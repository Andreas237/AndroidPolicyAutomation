// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;


// Referenced classes of package com.facebook:
//			GraphResponse

public static final class GraphResponse$PagingDirection extends Enum
{

	public static GraphResponse$PagingDirection valueOf(String s)
	{
		return (GraphResponse$PagingDirection)Enum.valueOf(com/facebook/GraphResponse$PagingDirection, s);
	//    0    0:ldc1            #2   <Class GraphResponse$PagingDirection>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class GraphResponse$PagingDirection>
	//    4    9:areturn         
	}

	public static GraphResponse$PagingDirection[] values()
	{
		return (GraphResponse$PagingDirection[])((GraphResponse$PagingDirection []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field GraphResponse$PagingDirection[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.GraphResponse$PagingDirection_3B_.clone()>
	//    2    6:checkcast       #38  <Class GraphResponse$PagingDirection[]>
	//    3    9:areturn         
	}

	private static final GraphResponse$PagingDirection $VALUES[];
	public static final GraphResponse$PagingDirection NEXT;
	public static final GraphResponse$PagingDirection PREVIOUS;

	static 
	{
		NEXT = new GraphResponse$PagingDirection("NEXT", 0);
	//    0    0:new             #2   <Class GraphResponse$PagingDirection>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "NEXT">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void GraphResponse$PagingDirection(String, int)>
	//    5   10:putstatic       #22  <Field GraphResponse$PagingDirection NEXT>
		PREVIOUS = new GraphResponse$PagingDirection("PREVIOUS", 1);
	//    6   13:new             #2   <Class GraphResponse$PagingDirection>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "PREVIOUS">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void GraphResponse$PagingDirection(String, int)>
	//   11   23:putstatic       #25  <Field GraphResponse$PagingDirection PREVIOUS>
		$VALUES = (new GraphResponse$PagingDirection[] {
			NEXT, PREVIOUS
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       GraphResponse$PagingDirection[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field GraphResponse$PagingDirection NEXT>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field GraphResponse$PagingDirection PREVIOUS>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field GraphResponse$PagingDirection[] $VALUES>
	//*  23   45:return          
	}

	private GraphResponse$PagingDirection(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
