// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text;

import android.graphics.Typeface;
import com.google.android.exoplayer.util.Util;

public final class CaptionStyleCompat
{

	public CaptionStyleCompat(int i, int j, int k, int l, int i1, Typeface typeface1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		foregroundColor = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #39  <Field int foregroundColor>
		backgroundColor = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #41  <Field int backgroundColor>
		windowColor = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #43  <Field int windowColor>
		edgeType = l;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #45  <Field int edgeType>
		edgeColor = i1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #47  <Field int edgeColor>
		typeface = typeface1;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #49  <Field Typeface typeface>
	//   20   37:return          
	}

	public static CaptionStyleCompat createFromCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle captionstyle)
	{
		if(Util.SDK_INT >= 21)
	//*   0    0:getstatic       #59  <Field int Util.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return createFromCaptionStyleV21(captionstyle);
	//    3    8:aload_0         
	//    4    9:invokestatic    #62  <Method CaptionStyleCompat createFromCaptionStyleV21(android.view.accessibility.CaptioningManager$CaptionStyle)>
	//    5   12:areturn         
		else
			return createFromCaptionStyleV19(captionstyle);
	//    6   13:aload_0         
	//    7   14:invokestatic    #65  <Method CaptionStyleCompat createFromCaptionStyleV19(android.view.accessibility.CaptioningManager$CaptionStyle)>
	//    8   17:areturn         
	}

	private static CaptionStyleCompat createFromCaptionStyleV19(android.view.accessibility.CaptioningManager.CaptionStyle captionstyle)
	{
		return new CaptionStyleCompat(captionstyle.foregroundColor, captionstyle.backgroundColor, 0, captionstyle.edgeType, captionstyle.edgeColor, captionstyle.getTypeface());
	//    0    0:new             #2   <Class CaptionStyleCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #69  <Field int android.view.accessibility.CaptioningManager$CaptionStyle.foregroundColor>
	//    4    8:aload_0         
	//    5    9:getfield        #70  <Field int android.view.accessibility.CaptioningManager$CaptionStyle.backgroundColor>
	//    6   12:iconst_0        
	//    7   13:aload_0         
	//    8   14:getfield        #71  <Field int android.view.accessibility.CaptioningManager$CaptionStyle.edgeType>
	//    9   17:aload_0         
	//   10   18:getfield        #72  <Field int android.view.accessibility.CaptioningManager$CaptionStyle.edgeColor>
	//   11   21:aload_0         
	//   12   22:invokevirtual   #76  <Method Typeface android.view.accessibility.CaptioningManager$CaptionStyle.getTypeface()>
	//   13   25:invokespecial   #32  <Method void CaptionStyleCompat(int, int, int, int, int, Typeface)>
	//   14   28:areturn         
	}

	private static CaptionStyleCompat createFromCaptionStyleV21(android.view.accessibility.CaptioningManager.CaptionStyle captionstyle)
	{
		int i;
		if(captionstyle.hasForegroundColor())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #81  <Method boolean android.view.accessibility.CaptioningManager$CaptionStyle.hasForegroundColor()>
	//*   2    4:ifeq            15
			i = captionstyle.foregroundColor;
	//    3    7:aload_0         
	//    4    8:getfield        #69  <Field int android.view.accessibility.CaptioningManager$CaptionStyle.foregroundColor>
	//    5   11:istore_1        
		else
	//*   6   12:goto            22
			i = DEFAULT.foregroundColor;
	//    7   15:getstatic       #34  <Field CaptionStyleCompat DEFAULT>
	//    8   18:getfield        #39  <Field int foregroundColor>
	//    9   21:istore_1        
		int j;
		if(captionstyle.hasBackgroundColor())
	//*  10   22:aload_0         
	//*  11   23:invokevirtual   #84  <Method boolean android.view.accessibility.CaptioningManager$CaptionStyle.hasBackgroundColor()>
	//*  12   26:ifeq            37
			j = captionstyle.backgroundColor;
	//   13   29:aload_0         
	//   14   30:getfield        #70  <Field int android.view.accessibility.CaptioningManager$CaptionStyle.backgroundColor>
	//   15   33:istore_2        
		else
	//*  16   34:goto            44
			j = DEFAULT.backgroundColor;
	//   17   37:getstatic       #34  <Field CaptionStyleCompat DEFAULT>
	//   18   40:getfield        #41  <Field int backgroundColor>
	//   19   43:istore_2        
		int k;
		if(captionstyle.hasWindowColor())
	//*  20   44:aload_0         
	//*  21   45:invokevirtual   #87  <Method boolean android.view.accessibility.CaptioningManager$CaptionStyle.hasWindowColor()>
	//*  22   48:ifeq            59
			k = captionstyle.windowColor;
	//   23   51:aload_0         
	//   24   52:getfield        #88  <Field int android.view.accessibility.CaptioningManager$CaptionStyle.windowColor>
	//   25   55:istore_3        
		else
	//*  26   56:goto            66
			k = DEFAULT.windowColor;
	//   27   59:getstatic       #34  <Field CaptionStyleCompat DEFAULT>
	//   28   62:getfield        #43  <Field int windowColor>
	//   29   65:istore_3        
		int l;
		if(captionstyle.hasEdgeType())
	//*  30   66:aload_0         
	//*  31   67:invokevirtual   #91  <Method boolean android.view.accessibility.CaptioningManager$CaptionStyle.hasEdgeType()>
	//*  32   70:ifeq            82
			l = captionstyle.edgeType;
	//   33   73:aload_0         
	//   34   74:getfield        #71  <Field int android.view.accessibility.CaptioningManager$CaptionStyle.edgeType>
	//   35   77:istore          4
		else
	//*  36   79:goto            90
			l = DEFAULT.edgeType;
	//   37   82:getstatic       #34  <Field CaptionStyleCompat DEFAULT>
	//   38   85:getfield        #45  <Field int edgeType>
	//   39   88:istore          4
		int i1;
		if(captionstyle.hasEdgeColor())
	//*  40   90:aload_0         
	//*  41   91:invokevirtual   #94  <Method boolean android.view.accessibility.CaptioningManager$CaptionStyle.hasEdgeColor()>
	//*  42   94:ifeq            106
			i1 = captionstyle.edgeColor;
	//   43   97:aload_0         
	//   44   98:getfield        #72  <Field int android.view.accessibility.CaptioningManager$CaptionStyle.edgeColor>
	//   45  101:istore          5
		else
	//*  46  103:goto            114
			i1 = DEFAULT.edgeColor;
	//   47  106:getstatic       #34  <Field CaptionStyleCompat DEFAULT>
	//   48  109:getfield        #47  <Field int edgeColor>
	//   49  112:istore          5
		return new CaptionStyleCompat(i, j, k, l, i1, captionstyle.getTypeface());
	//   50  114:new             #2   <Class CaptionStyleCompat>
	//   51  117:dup             
	//   52  118:iload_1         
	//   53  119:iload_2         
	//   54  120:iload_3         
	//   55  121:iload           4
	//   56  123:iload           5
	//   57  125:aload_0         
	//   58  126:invokevirtual   #76  <Method Typeface android.view.accessibility.CaptioningManager$CaptionStyle.getTypeface()>
	//   59  129:invokespecial   #32  <Method void CaptionStyleCompat(int, int, int, int, int, Typeface)>
	//   60  132:areturn         
	}

	public static final CaptionStyleCompat DEFAULT = new CaptionStyleCompat(-1, 0xff000000, 0, 0, -1, ((Typeface) (null)));
	public static final int EDGE_TYPE_DEPRESSED = 4;
	public static final int EDGE_TYPE_DROP_SHADOW = 2;
	public static final int EDGE_TYPE_NONE = 0;
	public static final int EDGE_TYPE_OUTLINE = 1;
	public static final int EDGE_TYPE_RAISED = 3;
	public static final int USE_TRACK_COLOR_SETTINGS = 1;
	public final int backgroundColor;
	public final int edgeColor;
	public final int edgeType;
	public final int foregroundColor;
	public final Typeface typeface;
	public final int windowColor;

	static 
	{
	//    0    0:new             #2   <Class CaptionStyleCompat>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:ldc1            #28  <Int 0xff000000>
	//    4    7:iconst_0        
	//    5    8:iconst_0        
	//    6    9:iconst_m1       
	//    7   10:aconst_null     
	//    8   11:invokespecial   #32  <Method void CaptionStyleCompat(int, int, int, int, int, Typeface)>
	//    9   14:putstatic       #34  <Field CaptionStyleCompat DEFAULT>
	//*  10   17:return          
	}
}
