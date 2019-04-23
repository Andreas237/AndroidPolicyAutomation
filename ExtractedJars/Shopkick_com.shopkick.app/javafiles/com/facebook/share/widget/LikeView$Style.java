// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;


// Referenced classes of package com.facebook.share.widget:
//			LikeView

public static final class LikeView$Style extends Enum
{

	static LikeView$Style fromInt(int i)
	{
		LikeView$Style alikeview$style[] = values();
	//    0    0:invokestatic    #66  <Method LikeView$Style[] values()>
	//    1    3:astore_3        
		int k = alikeview$style.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int j = 0; j < k; j++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:iload_1         
	//*   8   10:iload_2         
	//*   9   11:icmpge          38
		{
			LikeView$Style likeview$style = alikeview$style[j];
	//   10   14:aload_3         
	//   11   15:iload_1         
	//   12   16:aaload          
	//   13   17:astore          4
			if(likeview$style.getValue() == i)
	//*  14   19:aload           4
	//*  15   21:invokespecial   #60  <Method int getValue()>
	//*  16   24:iload_0         
	//*  17   25:icmpne          31
				return likeview$style;
	//   18   28:aload           4
	//   19   30:areturn         
		}

	//   20   31:iload_1         
	//   21   32:iconst_1        
	//   22   33:iadd            
	//   23   34:istore_1        
	//*  24   35:goto            9
		return null;
	//   25   38:aconst_null     
	//   26   39:areturn         
	}

	private int getValue()
	{
		return intValue;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int intValue>
	//    2    4:ireturn         
	}

	public static LikeView$Style valueOf(String s)
	{
		return (LikeView$Style)Enum.valueOf(com/facebook/share/widget/LikeView$Style, s);
	//    0    0:ldc1            #2   <Class LikeView$Style>
	//    1    2:aload_0         
	//    2    3:invokestatic    #71  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class LikeView$Style>
	//    4    9:areturn         
	}

	public static LikeView$Style[] values()
	{
		return (LikeView$Style[])((LikeView$Style []) ($VALUES)).clone();
	//    0    0:getstatic       #43  <Field LikeView$Style[] $VALUES>
	//    1    3:invokevirtual   #76  <Method Object _5B_Lcom.facebook.share.widget.LikeView$Style_3B_.clone()>
	//    2    6:checkcast       #72  <Class LikeView$Style[]>
	//    3    9:areturn         
	}

	public String toString()
	{
		return stringValue;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String stringValue>
	//    2    4:areturn         
	}

	private static final LikeView$Style $VALUES[];
	public static final LikeView$Style BOX_COUNT;
	public static final LikeView$Style BUTTON;
	static LikeView$Style DEFAULT;
	public static final LikeView$Style STANDARD;
	private int intValue;
	private String stringValue;

	static 
	{
		STANDARD = new LikeView$Style("STANDARD", 0, "standard", 0);
	//    0    0:new             #2   <Class LikeView$Style>
	//    1    3:dup             
	//    2    4:ldc1            #23  <String "STANDARD">
	//    3    6:iconst_0        
	//    4    7:ldc1            #25  <String "standard">
	//    5    9:iconst_0        
	//    6   10:invokespecial   #29  <Method void LikeView$Style(String, int, String, int)>
	//    7   13:putstatic       #31  <Field LikeView$Style STANDARD>
		BUTTON = new LikeView$Style("BUTTON", 1, "button", 1);
	//    8   16:new             #2   <Class LikeView$Style>
	//    9   19:dup             
	//   10   20:ldc1            #32  <String "BUTTON">
	//   11   22:iconst_1        
	//   12   23:ldc1            #34  <String "button">
	//   13   25:iconst_1        
	//   14   26:invokespecial   #29  <Method void LikeView$Style(String, int, String, int)>
	//   15   29:putstatic       #36  <Field LikeView$Style BUTTON>
		BOX_COUNT = new LikeView$Style("BOX_COUNT", 2, "box_count", 2);
	//   16   32:new             #2   <Class LikeView$Style>
	//   17   35:dup             
	//   18   36:ldc1            #37  <String "BOX_COUNT">
	//   19   38:iconst_2        
	//   20   39:ldc1            #39  <String "box_count">
	//   21   41:iconst_2        
	//   22   42:invokespecial   #29  <Method void LikeView$Style(String, int, String, int)>
	//   23   45:putstatic       #41  <Field LikeView$Style BOX_COUNT>
		LikeView$Style likeview$style = STANDARD;
	//   24   48:getstatic       #31  <Field LikeView$Style STANDARD>
	//   25   51:astore_0        
		$VALUES = (new LikeView$Style[] {
			likeview$style, BUTTON, BOX_COUNT
		});
	//   26   52:iconst_3        
	//   27   53:anewarray       LikeView$Style[]
	//   28   56:dup             
	//   29   57:iconst_0        
	//   30   58:aload_0         
	//   31   59:aastore         
	//   32   60:dup             
	//   33   61:iconst_1        
	//   34   62:getstatic       #36  <Field LikeView$Style BUTTON>
	//   35   65:aastore         
	//   36   66:dup             
	//   37   67:iconst_2        
	//   38   68:getstatic       #41  <Field LikeView$Style BOX_COUNT>
	//   39   71:aastore         
	//   40   72:putstatic       #43  <Field LikeView$Style[] $VALUES>
		DEFAULT = likeview$style;
	//   41   75:aload_0         
	//   42   76:putstatic       #45  <Field LikeView$Style DEFAULT>
	//*  43   79:return          
	}


/*
	static int access$000(LikeView$Style likeview$style)
	{
		return likeview$style.getValue();
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method int getValue()>
	//    2    4:ireturn         
	}

*/

	private LikeView$Style(String s, int i, String s1, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #49  <Method void Enum(String, int)>
		stringValue = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #51  <Field String stringValue>
		intValue = j;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #53  <Field int intValue>
	//   10   17:return          
	}
}
