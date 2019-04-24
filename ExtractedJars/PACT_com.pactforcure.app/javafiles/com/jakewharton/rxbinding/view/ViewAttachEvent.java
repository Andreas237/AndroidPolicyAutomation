// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.View;

// Referenced classes of package com.jakewharton.rxbinding.view:
//			ViewEvent

public final class ViewAttachEvent extends ViewEvent
{
	public static final class Kind extends Enum
	{

		public static Kind valueOf(String s)
		{
			return (Kind)Enum.valueOf(com/jakewharton/rxbinding/view/ViewAttachEvent$Kind, s);
		//    0    0:ldc1            #2   <Class ViewAttachEvent$Kind>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ViewAttachEvent$Kind>
		//    4    9:areturn         
		}

		public static Kind[] values()
		{
			return (Kind[])((Kind []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field ViewAttachEvent$Kind[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.jakewharton.rxbinding.view.ViewAttachEvent$Kind_3B_.clone()>
		//    2    6:checkcast       #38  <Class ViewAttachEvent$Kind[]>
		//    3    9:areturn         
		}

		private static final Kind $VALUES[];
		public static final Kind ATTACH;
		public static final Kind DETACH;

		static 
		{
			ATTACH = new Kind("ATTACH", 0);
		//    0    0:new             #2   <Class ViewAttachEvent$Kind>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "ATTACH">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void ViewAttachEvent$Kind(String, int)>
		//    5   10:putstatic       #22  <Field ViewAttachEvent$Kind ATTACH>
			DETACH = new Kind("DETACH", 1);
		//    6   13:new             #2   <Class ViewAttachEvent$Kind>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "DETACH">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void ViewAttachEvent$Kind(String, int)>
		//   11   23:putstatic       #25  <Field ViewAttachEvent$Kind DETACH>
			$VALUES = (new Kind[] {
				ATTACH, DETACH
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       Kind[]
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

		private Kind(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	private ViewAttachEvent(View view, Kind kind1)
	{
		super(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void ViewEvent(View)>
		kind = kind1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field ViewAttachEvent$Kind kind>
	//    6   10:return          
	}

	public static ViewAttachEvent create(View view, Kind kind1)
	{
		return new ViewAttachEvent(view, kind1);
	//    0    0:new             #2   <Class ViewAttachEvent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #25  <Method void ViewAttachEvent(View, ViewAttachEvent$Kind)>
	//    5    9:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(!(obj instanceof ViewAttachEvent))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class ViewAttachEvent>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((ViewAttachEvent)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class ViewAttachEvent>
	//   12   20:astore_1        
			if(((ViewAttachEvent) (obj)).view() != view() || ((ViewAttachEvent) (obj)).kind() != kind())
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #32  <Method View view()>
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #32  <Method View view()>
	//*  17   29:if_acmpne       43
	//*  18   32:aload_1         
	//*  19   33:invokevirtual   #35  <Method ViewAttachEvent$Kind kind()>
	//*  20   36:aload_0         
	//*  21   37:invokevirtual   #35  <Method ViewAttachEvent$Kind kind()>
	//*  22   40:if_acmpeq       5
				return false;
	//   23   43:iconst_0        
	//   24   44:ireturn         
		}
		return true;
	}

	public int hashCode()
	{
		return (((Object) (view())).hashCode() + 629) * 37 + kind().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method View view()>
	//    2    4:invokevirtual   #41  <Method int Object.hashCode()>
	//    3    7:sipush          629
	//    4   10:iadd            
	//    5   11:bipush          37
	//    6   13:imul            
	//    7   14:aload_0         
	//    8   15:invokevirtual   #35  <Method ViewAttachEvent$Kind kind()>
	//    9   18:invokevirtual   #42  <Method int ViewAttachEvent$Kind.hashCode()>
	//   10   21:iadd            
	//   11   22:ireturn         
	}

	public Kind kind()
	{
		return kind;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ViewAttachEvent$Kind kind>
	//    2    4:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("ViewAttachEvent{view=").append(((Object) (view()))).append(", kind=").append(((Object) (kind()))).append('}').toString();
	//    0    0:new             #46  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void StringBuilder()>
	//    3    7:ldc1            #51  <String "ViewAttachEvent{view=">
	//    4    9:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #32  <Method View view()>
	//    7   16:invokevirtual   #58  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #60  <String ", kind=">
	//    9   21:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #35  <Method ViewAttachEvent$Kind kind()>
	//   12   28:invokevirtual   #58  <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:bipush          125
	//   14   33:invokevirtual   #63  <Method StringBuilder StringBuilder.append(char)>
	//   15   36:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   16   39:areturn         
	}

	private final Kind kind;
}
