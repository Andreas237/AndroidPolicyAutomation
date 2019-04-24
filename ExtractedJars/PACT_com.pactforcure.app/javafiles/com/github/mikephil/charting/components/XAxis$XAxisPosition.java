// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.components;


// Referenced classes of package com.github.mikephil.charting.components:
//			XAxis

public static final class XAxis$XAxisPosition extends Enum
{

	public static XAxis$XAxisPosition valueOf(String s)
	{
		return (XAxis$XAxisPosition)Enum.valueOf(com/github/mikephil/charting/components/XAxis$XAxisPosition, s);
	//    0    0:ldc1            #2   <Class XAxis$XAxisPosition>
	//    1    2:aload_0         
	//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class XAxis$XAxisPosition>
	//    4    9:areturn         
	}

	public static XAxis$XAxisPosition[] values()
	{
		return (XAxis$XAxisPosition[])((XAxis$XAxisPosition []) ($VALUES)).clone();
	//    0    0:getstatic       #39  <Field XAxis$XAxisPosition[] $VALUES>
	//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.github.mikephil.charting.components.XAxis$XAxisPosition_3B_.clone()>
	//    2    6:checkcast       #50  <Class XAxis$XAxisPosition[]>
	//    3    9:areturn         
	}

	private static final XAxis$XAxisPosition $VALUES[];
	public static final XAxis$XAxisPosition BOTH_SIDED;
	public static final XAxis$XAxisPosition BOTTOM;
	public static final XAxis$XAxisPosition BOTTOM_INSIDE;
	public static final XAxis$XAxisPosition TOP;
	public static final XAxis$XAxisPosition TOP_INSIDE;

	static 
	{
		TOP = new XAxis$XAxisPosition("TOP", 0);
	//    0    0:new             #2   <Class XAxis$XAxisPosition>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "TOP">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void XAxis$XAxisPosition(String, int)>
	//    5   10:putstatic       #25  <Field XAxis$XAxisPosition TOP>
		BOTTOM = new XAxis$XAxisPosition("BOTTOM", 1);
	//    6   13:new             #2   <Class XAxis$XAxisPosition>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "BOTTOM">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void XAxis$XAxisPosition(String, int)>
	//   11   23:putstatic       #28  <Field XAxis$XAxisPosition BOTTOM>
		BOTH_SIDED = new XAxis$XAxisPosition("BOTH_SIDED", 2);
	//   12   26:new             #2   <Class XAxis$XAxisPosition>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "BOTH_SIDED">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void XAxis$XAxisPosition(String, int)>
	//   17   36:putstatic       #31  <Field XAxis$XAxisPosition BOTH_SIDED>
		TOP_INSIDE = new XAxis$XAxisPosition("TOP_INSIDE", 3);
	//   18   39:new             #2   <Class XAxis$XAxisPosition>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "TOP_INSIDE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void XAxis$XAxisPosition(String, int)>
	//   23   49:putstatic       #34  <Field XAxis$XAxisPosition TOP_INSIDE>
		BOTTOM_INSIDE = new XAxis$XAxisPosition("BOTTOM_INSIDE", 4);
	//   24   52:new             #2   <Class XAxis$XAxisPosition>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "BOTTOM_INSIDE">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void XAxis$XAxisPosition(String, int)>
	//   29   62:putstatic       #37  <Field XAxis$XAxisPosition BOTTOM_INSIDE>
		$VALUES = (new XAxis$XAxisPosition[] {
			TOP, BOTTOM, BOTH_SIDED, TOP_INSIDE, BOTTOM_INSIDE
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       XAxis$XAxisPosition[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #25  <Field XAxis$XAxisPosition TOP>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #28  <Field XAxis$XAxisPosition BOTTOM>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #31  <Field XAxis$XAxisPosition BOTH_SIDED>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #34  <Field XAxis$XAxisPosition TOP_INSIDE>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #37  <Field XAxis$XAxisPosition BOTTOM_INSIDE>
	//   51   98:aastore         
	//   52   99:putstatic       #39  <Field XAxis$XAxisPosition[] $VALUES>
	//*  53  102:return          
	}

	private XAxis$XAxisPosition(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
