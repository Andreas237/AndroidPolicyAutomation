// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.support.design.widget;

import android.support.design.widget.TabLayout;
import com.jakewharton.rxbinding.view.ViewEvent;

public final class TabLayoutSelectionEvent extends ViewEvent
{
	public static final class Kind extends Enum
	{

		public static Kind valueOf(String s)
		{
			return (Kind)Enum.valueOf(com/jakewharton/rxbinding/support/design/widget/TabLayoutSelectionEvent$Kind, s);
		//    0    0:ldc1            #2   <Class TabLayoutSelectionEvent$Kind>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class TabLayoutSelectionEvent$Kind>
		//    4    9:areturn         
		}

		public static Kind[] values()
		{
			return (Kind[])((Kind []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field TabLayoutSelectionEvent$Kind[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.jakewharton.rxbinding.support.design.widget.TabLayoutSelectionEvent$Kind_3B_.clone()>
		//    2    6:checkcast       #42  <Class TabLayoutSelectionEvent$Kind[]>
		//    3    9:areturn         
		}

		private static final Kind $VALUES[];
		public static final Kind RESELECTED;
		public static final Kind SELECTED;
		public static final Kind UNSELECTED;

		static 
		{
			SELECTED = new Kind("SELECTED", 0);
		//    0    0:new             #2   <Class TabLayoutSelectionEvent$Kind>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "SELECTED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void TabLayoutSelectionEvent$Kind(String, int)>
		//    5   10:putstatic       #23  <Field TabLayoutSelectionEvent$Kind SELECTED>
			RESELECTED = new Kind("RESELECTED", 1);
		//    6   13:new             #2   <Class TabLayoutSelectionEvent$Kind>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "RESELECTED">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void TabLayoutSelectionEvent$Kind(String, int)>
		//   11   23:putstatic       #26  <Field TabLayoutSelectionEvent$Kind RESELECTED>
			UNSELECTED = new Kind("UNSELECTED", 2);
		//   12   26:new             #2   <Class TabLayoutSelectionEvent$Kind>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "UNSELECTED">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void TabLayoutSelectionEvent$Kind(String, int)>
		//   17   36:putstatic       #29  <Field TabLayoutSelectionEvent$Kind UNSELECTED>
			$VALUES = (new Kind[] {
				SELECTED, RESELECTED, UNSELECTED
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       Kind[]
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

		private Kind(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	private TabLayoutSelectionEvent(TabLayout tablayout, Kind kind1, android.support.design.widget.TabLayout.Tab tab1)
	{
		super(((android.view.View) (tablayout)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void ViewEvent(android.view.View)>
		tab = tab1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #20  <Field android.support.design.widget.TabLayout$Tab tab>
		kind = kind1;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #22  <Field TabLayoutSelectionEvent$Kind kind>
	//    9   15:return          
	}

	public static TabLayoutSelectionEvent create(TabLayout tablayout, Kind kind1, android.support.design.widget.TabLayout.Tab tab1)
	{
		return new TabLayoutSelectionEvent(tablayout, kind1, tab1);
	//    0    0:new             #2   <Class TabLayoutSelectionEvent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #29  <Method void TabLayoutSelectionEvent(TabLayout, TabLayoutSelectionEvent$Kind, android.support.design.widget.TabLayout$Tab)>
	//    6   10:areturn         
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
			if(!(obj instanceof TabLayoutSelectionEvent))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class TabLayoutSelectionEvent>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((TabLayoutSelectionEvent)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class TabLayoutSelectionEvent>
	//   12   20:astore_1        
			if(view() != ((TabLayoutSelectionEvent) (obj)).view() || kind != ((TabLayoutSelectionEvent) (obj)).kind || tab != ((TabLayoutSelectionEvent) (obj)).tab)
	//*  13   21:aload_0         
	//*  14   22:invokevirtual   #36  <Method android.view.View view()>
	//*  15   25:aload_1         
	//*  16   26:invokevirtual   #36  <Method android.view.View view()>
	//*  17   29:if_acmpne       54
	//*  18   32:aload_0         
	//*  19   33:getfield        #22  <Field TabLayoutSelectionEvent$Kind kind>
	//*  20   36:aload_1         
	//*  21   37:getfield        #22  <Field TabLayoutSelectionEvent$Kind kind>
	//*  22   40:if_acmpne       54
	//*  23   43:aload_0         
	//*  24   44:getfield        #20  <Field android.support.design.widget.TabLayout$Tab tab>
	//*  25   47:aload_1         
	//*  26   48:getfield        #20  <Field android.support.design.widget.TabLayout$Tab tab>
	//*  27   51:if_acmpeq       5
				return false;
	//   28   54:iconst_0        
	//   29   55:ireturn         
		}
		return true;
	}

	public int hashCode()
	{
		return ((((Object) ((TabLayout)view())).hashCode() + 629) * 37 + kind.hashCode()) * 37 + ((Object) (tab)).hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #36  <Method android.view.View view()>
	//    2    4:checkcast       #40  <Class TabLayout>
	//    3    7:invokevirtual   #44  <Method int Object.hashCode()>
	//    4   10:sipush          629
	//    5   13:iadd            
	//    6   14:bipush          37
	//    7   16:imul            
	//    8   17:aload_0         
	//    9   18:getfield        #22  <Field TabLayoutSelectionEvent$Kind kind>
	//   10   21:invokevirtual   #45  <Method int TabLayoutSelectionEvent$Kind.hashCode()>
	//   11   24:iadd            
	//   12   25:bipush          37
	//   13   27:imul            
	//   14   28:aload_0         
	//   15   29:getfield        #20  <Field android.support.design.widget.TabLayout$Tab tab>
	//   16   32:invokevirtual   #44  <Method int Object.hashCode()>
	//   17   35:iadd            
	//   18   36:ireturn         
	}

	public Kind kind()
	{
		return kind;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field TabLayoutSelectionEvent$Kind kind>
	//    2    4:areturn         
	}

	public android.support.design.widget.TabLayout.Tab tab()
	{
		return tab;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field android.support.design.widget.TabLayout$Tab tab>
	//    2    4:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("ViewTouchEvent{view=").append(((Object) (view()))).append(", kind=").append(((Object) (kind))).append(", tab=").append(((Object) (tab))).append('}').toString();
	//    0    0:new             #51  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void StringBuilder()>
	//    3    7:ldc1            #56  <String "ViewTouchEvent{view=">
	//    4    9:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #36  <Method android.view.View view()>
	//    7   16:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #65  <String ", kind=">
	//    9   21:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #22  <Field TabLayoutSelectionEvent$Kind kind>
	//   12   28:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:ldc1            #67  <String ", tab=">
	//   14   33:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #20  <Field android.support.design.widget.TabLayout$Tab tab>
	//   17   40:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   18   43:bipush          125
	//   19   45:invokevirtual   #70  <Method StringBuilder StringBuilder.append(char)>
	//   20   48:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   21   51:areturn         
	}

	private final Kind kind;
	private final android.support.design.widget.TabLayout.Tab tab;
}
