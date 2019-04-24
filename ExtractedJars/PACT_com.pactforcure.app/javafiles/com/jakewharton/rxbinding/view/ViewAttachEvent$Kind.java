// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;


// Referenced classes of package com.jakewharton.rxbinding.view:
//			ViewAttachEvent

public static final class ViewAttachEvent$Kind extends Enum
{

	public static ViewAttachEvent$Kind valueOf(String s)
	{
		return (ViewAttachEvent$Kind)Enum.valueOf(com/jakewharton/rxbinding/view/ViewAttachEvent$Kind, s);
	//    0    0:ldc1            #2   <Class ViewAttachEvent$Kind>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ViewAttachEvent$Kind>
	//    4    9:areturn         
	}

	public static ViewAttachEvent$Kind[] values()
	{
		return (ViewAttachEvent$Kind[])((ViewAttachEvent$Kind []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field ViewAttachEvent$Kind[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.jakewharton.rxbinding.view.ViewAttachEvent$Kind_3B_.clone()>
	//    2    6:checkcast       #38  <Class ViewAttachEvent$Kind[]>
	//    3    9:areturn         
	}

	private static final ViewAttachEvent$Kind $VALUES[];
	public static final ViewAttachEvent$Kind ATTACH;
	public static final ViewAttachEvent$Kind DETACH;

	static 
	{
		ATTACH = new ViewAttachEvent$Kind("ATTACH", 0);
	//    0    0:new             #2   <Class ViewAttachEvent$Kind>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "ATTACH">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void ViewAttachEvent$Kind(String, int)>
	//    5   10:putstatic       #22  <Field ViewAttachEvent$Kind ATTACH>
		DETACH = new ViewAttachEvent$Kind("DETACH", 1);
	//    6   13:new             #2   <Class ViewAttachEvent$Kind>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "DETACH">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void ViewAttachEvent$Kind(String, int)>
	//   11   23:putstatic       #25  <Field ViewAttachEvent$Kind DETACH>
		$VALUES = (new ViewAttachEvent$Kind[] {
			ATTACH, DETACH
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       ViewAttachEvent$Kind[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field ViewAttachEvent$Kind ATTACH>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field ViewAttachEvent$Kind DETACH>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field ViewAttachEvent$Kind[] $VALUES>
	//*  23   45:return          
	}

	private ViewAttachEvent$Kind(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
