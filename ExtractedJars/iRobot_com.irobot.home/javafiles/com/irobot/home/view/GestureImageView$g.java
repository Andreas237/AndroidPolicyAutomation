// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;


// Referenced classes of package com.irobot.home.view:
//			GestureImageView

private static final class GestureImageView$g extends Enum
{

	public static GestureImageView$g valueOf(String s)
	{
		return (GestureImageView$g)Enum.valueOf(com/irobot/home/view/GestureImageView$g, s);
	//    0    0:ldc1            #2   <Class GestureImageView$g>
	//    1    2:aload_0         
	//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class GestureImageView$g>
	//    4    9:areturn         
	}

	public static GestureImageView$g[] values()
	{
		return (GestureImageView$g[])((GestureImageView$g []) ($VALUES)).clone();
	//    0    0:getstatic       #39  <Field GestureImageView$g[] $VALUES>
	//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.irobot.home.view.GestureImageView$g_3B_.clone()>
	//    2    6:checkcast       #50  <Class GestureImageView$g[]>
	//    3    9:areturn         
	}

	private static final GestureImageView$g $VALUES[];
	public static final GestureImageView$g ANIMATE_ZOOM;
	public static final GestureImageView$g DRAG;
	public static final GestureImageView$g NONE;
	public static final GestureImageView$g ROTATE;
	public static final GestureImageView$g ZOOM;

	static 
	{
		NONE = new GestureImageView$g("NONE", 0);
	//    0    0:new             #2   <Class GestureImageView$g>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "NONE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void GestureImageView$g(String, int)>
	//    5   10:putstatic       #25  <Field GestureImageView$g NONE>
		ZOOM = new GestureImageView$g("ZOOM", 1);
	//    6   13:new             #2   <Class GestureImageView$g>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "ZOOM">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void GestureImageView$g(String, int)>
	//   11   23:putstatic       #28  <Field GestureImageView$g ZOOM>
		ROTATE = new GestureImageView$g("ROTATE", 2);
	//   12   26:new             #2   <Class GestureImageView$g>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "ROTATE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void GestureImageView$g(String, int)>
	//   17   36:putstatic       #31  <Field GestureImageView$g ROTATE>
		DRAG = new GestureImageView$g("DRAG", 3);
	//   18   39:new             #2   <Class GestureImageView$g>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "DRAG">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void GestureImageView$g(String, int)>
	//   23   49:putstatic       #34  <Field GestureImageView$g DRAG>
		ANIMATE_ZOOM = new GestureImageView$g("ANIMATE_ZOOM", 4);
	//   24   52:new             #2   <Class GestureImageView$g>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "ANIMATE_ZOOM">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void GestureImageView$g(String, int)>
	//   29   62:putstatic       #37  <Field GestureImageView$g ANIMATE_ZOOM>
		$VALUES = (new GestureImageView$g[] {
			NONE, ZOOM, ROTATE, DRAG, ANIMATE_ZOOM
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       GestureImageView$g[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #25  <Field GestureImageView$g NONE>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #28  <Field GestureImageView$g ZOOM>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #31  <Field GestureImageView$g ROTATE>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #34  <Field GestureImageView$g DRAG>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #37  <Field GestureImageView$g ANIMATE_ZOOM>
	//   51   98:aastore         
	//   52   99:putstatic       #39  <Field GestureImageView$g[] $VALUES>
	//*  53  102:return          
	}

	private GestureImageView$g(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
