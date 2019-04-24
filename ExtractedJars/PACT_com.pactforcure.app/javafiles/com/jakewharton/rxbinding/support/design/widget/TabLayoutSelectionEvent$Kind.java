// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.support.design.widget;


// Referenced classes of package com.jakewharton.rxbinding.support.design.widget:
//			TabLayoutSelectionEvent

public static final class TabLayoutSelectionEvent$Kind extends Enum
{

	public static TabLayoutSelectionEvent$Kind valueOf(String s)
	{
		return (TabLayoutSelectionEvent$Kind)Enum.valueOf(com/jakewharton/rxbinding/support/design/widget/TabLayoutSelectionEvent$Kind, s);
	//    0    0:ldc1            #2   <Class TabLayoutSelectionEvent$Kind>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class TabLayoutSelectionEvent$Kind>
	//    4    9:areturn         
	}

	public static TabLayoutSelectionEvent$Kind[] values()
	{
		return (TabLayoutSelectionEvent$Kind[])((TabLayoutSelectionEvent$Kind []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field TabLayoutSelectionEvent$Kind[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.jakewharton.rxbinding.support.design.widget.TabLayoutSelectionEvent$Kind_3B_.clone()>
	//    2    6:checkcast       #42  <Class TabLayoutSelectionEvent$Kind[]>
	//    3    9:areturn         
	}

	private static final TabLayoutSelectionEvent$Kind $VALUES[];
	public static final TabLayoutSelectionEvent$Kind RESELECTED;
	public static final TabLayoutSelectionEvent$Kind SELECTED;
	public static final TabLayoutSelectionEvent$Kind UNSELECTED;

	static 
	{
		SELECTED = new TabLayoutSelectionEvent$Kind("SELECTED", 0);
	//    0    0:new             #2   <Class TabLayoutSelectionEvent$Kind>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "SELECTED">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void TabLayoutSelectionEvent$Kind(String, int)>
	//    5   10:putstatic       #23  <Field TabLayoutSelectionEvent$Kind SELECTED>
		RESELECTED = new TabLayoutSelectionEvent$Kind("RESELECTED", 1);
	//    6   13:new             #2   <Class TabLayoutSelectionEvent$Kind>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "RESELECTED">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void TabLayoutSelectionEvent$Kind(String, int)>
	//   11   23:putstatic       #26  <Field TabLayoutSelectionEvent$Kind RESELECTED>
		UNSELECTED = new TabLayoutSelectionEvent$Kind("UNSELECTED", 2);
	//   12   26:new             #2   <Class TabLayoutSelectionEvent$Kind>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "UNSELECTED">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void TabLayoutSelectionEvent$Kind(String, int)>
	//   17   36:putstatic       #29  <Field TabLayoutSelectionEvent$Kind UNSELECTED>
		$VALUES = (new TabLayoutSelectionEvent$Kind[] {
			SELECTED, RESELECTED, UNSELECTED
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       TabLayoutSelectionEvent$Kind[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field TabLayoutSelectionEvent$Kind SELECTED>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field TabLayoutSelectionEvent$Kind RESELECTED>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field TabLayoutSelectionEvent$Kind UNSELECTED>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field TabLayoutSelectionEvent$Kind[] $VALUES>
	//*  33   64:return          
	}

	private TabLayoutSelectionEvent$Kind(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
