// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.utils.overlay;


// Referenced classes of package com.amap.api.maps.utils.overlay:
//			SmoothMoveMarker

static final class SmoothMoveMarker$a extends Enum
{

	public static SmoothMoveMarker$a valueOf(String s)
	{
		return (SmoothMoveMarker$a)Enum.valueOf(com/amap/api/maps/utils/overlay/SmoothMoveMarker$a, s);
	//    0    0:ldc1            #2   <Class SmoothMoveMarker$a>
	//    1    2:aload_0         
	//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class SmoothMoveMarker$a>
	//    4    9:areturn         
	}

	public static SmoothMoveMarker$a[] values()
	{
		return (SmoothMoveMarker$a[])((SmoothMoveMarker$a []) (f)).clone();
	//    0    0:getstatic       #43  <Field SmoothMoveMarker$a[] f>
	//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.amap.api.maps.utils.overlay.SmoothMoveMarker$a_3B_.clone()>
	//    2    6:checkcast       #54  <Class SmoothMoveMarker$a[]>
	//    3    9:areturn         
	}

	public static final SmoothMoveMarker$a a;
	public static final SmoothMoveMarker$a b;
	public static final SmoothMoveMarker$a c;
	public static final SmoothMoveMarker$a d;
	public static final SmoothMoveMarker$a e;
	private static final SmoothMoveMarker$a f[];

	static 
	{
		a = new SmoothMoveMarker$a("ACTION_UNKNOWN", 0);
	//    0    0:new             #2   <Class SmoothMoveMarker$a>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "ACTION_UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void SmoothMoveMarker$a(String, int)>
	//    5   10:putstatic       #25  <Field SmoothMoveMarker$a a>
		b = new SmoothMoveMarker$a("ACTION_START", 1);
	//    6   13:new             #2   <Class SmoothMoveMarker$a>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "ACTION_START">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void SmoothMoveMarker$a(String, int)>
	//   11   23:putstatic       #29  <Field SmoothMoveMarker$a b>
		c = new SmoothMoveMarker$a("ACTION_RUNNING", 2);
	//   12   26:new             #2   <Class SmoothMoveMarker$a>
	//   13   29:dup             
	//   14   30:ldc1            #31  <String "ACTION_RUNNING">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void SmoothMoveMarker$a(String, int)>
	//   17   36:putstatic       #33  <Field SmoothMoveMarker$a c>
		d = new SmoothMoveMarker$a("ACTION_PAUSE", 3);
	//   18   39:new             #2   <Class SmoothMoveMarker$a>
	//   19   42:dup             
	//   20   43:ldc1            #35  <String "ACTION_PAUSE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void SmoothMoveMarker$a(String, int)>
	//   23   49:putstatic       #37  <Field SmoothMoveMarker$a d>
		e = new SmoothMoveMarker$a("ACTION_STOP", 4);
	//   24   52:new             #2   <Class SmoothMoveMarker$a>
	//   25   55:dup             
	//   26   56:ldc1            #39  <String "ACTION_STOP">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void SmoothMoveMarker$a(String, int)>
	//   29   62:putstatic       #41  <Field SmoothMoveMarker$a e>
		f = (new SmoothMoveMarker$a[] {
			a, b, c, d, e
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       SmoothMoveMarker$a[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #25  <Field SmoothMoveMarker$a a>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #29  <Field SmoothMoveMarker$a b>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #33  <Field SmoothMoveMarker$a c>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #37  <Field SmoothMoveMarker$a d>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #41  <Field SmoothMoveMarker$a e>
	//   51   98:aastore         
	//   52   99:putstatic       #43  <Field SmoothMoveMarker$a[] f>
	//*  53  102:return          
	}

	private SmoothMoveMarker$a(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #45  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
