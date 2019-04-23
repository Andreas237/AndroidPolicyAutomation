// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;


// Referenced classes of package com.facebook.share.widget:
//			LikeView

public static final class LikeView$AuxiliaryViewPosition extends Enum
{

	static LikeView$AuxiliaryViewPosition fromInt(int i)
	{
		LikeView$AuxiliaryViewPosition alikeview$auxiliaryviewposition[] = values();
	//    0    0:invokestatic    #66  <Method LikeView$AuxiliaryViewPosition[] values()>
	//    1    3:astore_3        
		int k = alikeview$auxiliaryviewposition.length;
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
			LikeView$AuxiliaryViewPosition likeview$auxiliaryviewposition = alikeview$auxiliaryviewposition[j];
	//   10   14:aload_3         
	//   11   15:iload_1         
	//   12   16:aaload          
	//   13   17:astore          4
			if(likeview$auxiliaryviewposition.getValue() == i)
	//*  14   19:aload           4
	//*  15   21:invokespecial   #60  <Method int getValue()>
	//*  16   24:iload_0         
	//*  17   25:icmpne          31
				return likeview$auxiliaryviewposition;
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

	public static LikeView$AuxiliaryViewPosition valueOf(String s)
	{
		return (LikeView$AuxiliaryViewPosition)Enum.valueOf(com/facebook/share/widget/LikeView$AuxiliaryViewPosition, s);
	//    0    0:ldc1            #2   <Class LikeView$AuxiliaryViewPosition>
	//    1    2:aload_0         
	//    2    3:invokestatic    #71  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class LikeView$AuxiliaryViewPosition>
	//    4    9:areturn         
	}

	public static LikeView$AuxiliaryViewPosition[] values()
	{
		return (LikeView$AuxiliaryViewPosition[])((LikeView$AuxiliaryViewPosition []) ($VALUES)).clone();
	//    0    0:getstatic       #43  <Field LikeView$AuxiliaryViewPosition[] $VALUES>
	//    1    3:invokevirtual   #76  <Method Object _5B_Lcom.facebook.share.widget.LikeView$AuxiliaryViewPosition_3B_.clone()>
	//    2    6:checkcast       #72  <Class LikeView$AuxiliaryViewPosition[]>
	//    3    9:areturn         
	}

	public String toString()
	{
		return stringValue;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String stringValue>
	//    2    4:areturn         
	}

	private static final LikeView$AuxiliaryViewPosition $VALUES[];
	public static final LikeView$AuxiliaryViewPosition BOTTOM;
	static LikeView$AuxiliaryViewPosition DEFAULT;
	public static final LikeView$AuxiliaryViewPosition INLINE;
	public static final LikeView$AuxiliaryViewPosition TOP;
	private int intValue;
	private String stringValue;

	static 
	{
		BOTTOM = new LikeView$AuxiliaryViewPosition("BOTTOM", 0, "bottom", 0);
	//    0    0:new             #2   <Class LikeView$AuxiliaryViewPosition>
	//    1    3:dup             
	//    2    4:ldc1            #23  <String "BOTTOM">
	//    3    6:iconst_0        
	//    4    7:ldc1            #25  <String "bottom">
	//    5    9:iconst_0        
	//    6   10:invokespecial   #29  <Method void LikeView$AuxiliaryViewPosition(String, int, String, int)>
	//    7   13:putstatic       #31  <Field LikeView$AuxiliaryViewPosition BOTTOM>
		INLINE = new LikeView$AuxiliaryViewPosition("INLINE", 1, "inline", 1);
	//    8   16:new             #2   <Class LikeView$AuxiliaryViewPosition>
	//    9   19:dup             
	//   10   20:ldc1            #32  <String "INLINE">
	//   11   22:iconst_1        
	//   12   23:ldc1            #34  <String "inline">
	//   13   25:iconst_1        
	//   14   26:invokespecial   #29  <Method void LikeView$AuxiliaryViewPosition(String, int, String, int)>
	//   15   29:putstatic       #36  <Field LikeView$AuxiliaryViewPosition INLINE>
		TOP = new LikeView$AuxiliaryViewPosition("TOP", 2, "top", 2);
	//   16   32:new             #2   <Class LikeView$AuxiliaryViewPosition>
	//   17   35:dup             
	//   18   36:ldc1            #37  <String "TOP">
	//   19   38:iconst_2        
	//   20   39:ldc1            #39  <String "top">
	//   21   41:iconst_2        
	//   22   42:invokespecial   #29  <Method void LikeView$AuxiliaryViewPosition(String, int, String, int)>
	//   23   45:putstatic       #41  <Field LikeView$AuxiliaryViewPosition TOP>
		LikeView$AuxiliaryViewPosition likeview$auxiliaryviewposition = BOTTOM;
	//   24   48:getstatic       #31  <Field LikeView$AuxiliaryViewPosition BOTTOM>
	//   25   51:astore_0        
		$VALUES = (new LikeView$AuxiliaryViewPosition[] {
			likeview$auxiliaryviewposition, INLINE, TOP
		});
	//   26   52:iconst_3        
	//   27   53:anewarray       LikeView$AuxiliaryViewPosition[]
	//   28   56:dup             
	//   29   57:iconst_0        
	//   30   58:aload_0         
	//   31   59:aastore         
	//   32   60:dup             
	//   33   61:iconst_1        
	//   34   62:getstatic       #36  <Field LikeView$AuxiliaryViewPosition INLINE>
	//   35   65:aastore         
	//   36   66:dup             
	//   37   67:iconst_2        
	//   38   68:getstatic       #41  <Field LikeView$AuxiliaryViewPosition TOP>
	//   39   71:aastore         
	//   40   72:putstatic       #43  <Field LikeView$AuxiliaryViewPosition[] $VALUES>
		DEFAULT = likeview$auxiliaryviewposition;
	//   41   75:aload_0         
	//   42   76:putstatic       #45  <Field LikeView$AuxiliaryViewPosition DEFAULT>
	//*  43   79:return          
	}


/*
	static int access$100(LikeView$AuxiliaryViewPosition likeview$auxiliaryviewposition)
	{
		return likeview$auxiliaryviewposition.getValue();
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method int getValue()>
	//    2    4:ireturn         
	}

*/

	private LikeView$AuxiliaryViewPosition(String s, int i, String s1, int j)
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
