// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home.view:
//			HideableView

public static final class HideableView$a extends Enum
{

	public static HideableView$a fromInt(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 38
	//	               1 34
		default:
			o.e(HideableView.a(), "Unrecognized enum value");
	//    2   24:invokestatic    #35  <Method String HideableView.a()>
	//    3   27:ldc1            #37  <String "Unrecognized enum value">
	//    4   29:invokestatic    #43  <Method void o.e(String, String)>
			return null;
	//    5   32:aconst_null     
	//    6   33:areturn         

		case 1: // '\001'
			return removeFromLayout;
	//    7   34:getstatic       #25  <Field HideableView$a removeFromLayout>
	//    8   37:areturn         

		case 0: // '\0'
			return hideInLayout;
	//    9   38:getstatic       #22  <Field HideableView$a hideInLayout>
	//   10   41:areturn         
		}
	}

	public static HideableView$a valueOf(String s)
	{
		return (HideableView$a)Enum.valueOf(com/irobot/home/view/HideableView$a, s);
	//    0    0:ldc1            #2   <Class HideableView$a>
	//    1    2:aload_0         
	//    2    3:invokestatic    #48  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class HideableView$a>
	//    4    9:areturn         
	}

	public static HideableView$a[] values()
	{
		return (HideableView$a[])((HideableView$a []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field HideableView$a[] $VALUES>
	//    1    3:invokevirtual   #55  <Method Object _5B_Lcom.irobot.home.view.HideableView$a_3B_.clone()>
	//    2    6:checkcast       #51  <Class HideableView$a[]>
	//    3    9:areturn         
	}

	private static final HideableView$a $VALUES[];
	public static final HideableView$a hideInLayout;
	public static final HideableView$a removeFromLayout;

	static 
	{
		hideInLayout = new HideableView$a("hideInLayout", 0);
	//    0    0:new             #2   <Class HideableView$a>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "hideInLayout">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void HideableView$a(String, int)>
	//    5   10:putstatic       #22  <Field HideableView$a hideInLayout>
		removeFromLayout = new HideableView$a("removeFromLayout", 1);
	//    6   13:new             #2   <Class HideableView$a>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "removeFromLayout">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void HideableView$a(String, int)>
	//   11   23:putstatic       #25  <Field HideableView$a removeFromLayout>
		$VALUES = (new HideableView$a[] {
			hideInLayout, removeFromLayout
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       HideableView$a[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field HideableView$a hideInLayout>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field HideableView$a removeFromLayout>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field HideableView$a[] $VALUES>
	//*  23   45:return          
	}

	private HideableView$a(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
