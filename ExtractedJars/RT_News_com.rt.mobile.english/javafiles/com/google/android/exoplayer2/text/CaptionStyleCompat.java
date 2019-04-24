// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text;

import android.graphics.Typeface;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Annotation;

public final class CaptionStyleCompat
{
	public static interface EdgeType
		extends Annotation
	{
	}


	public CaptionStyleCompat(int i, int j, int k, int l, int i1, Typeface typeface1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		foregroundColor = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #42  <Field int foregroundColor>
		backgroundColor = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #44  <Field int backgroundColor>
		windowColor = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #46  <Field int windowColor>
		edgeType = l;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #48  <Field int edgeType>
		edgeColor = i1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #50  <Field int edgeColor>
		typeface = typeface1;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #52  <Field Typeface typeface>
	//   20   37:return          
	}

	public static CaptionStyleCompat createFromCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle captionstyle)
	{
		if(Util.SDK_INT >= 21)
	//*   0    0:getstatic       #62  <Field int Util.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return createFromCaptionStyleV21(captionstyle);
	//    3    8:aload_0         
	//    4    9:invokestatic    #65  <Method CaptionStyleCompat createFromCaptionStyleV21(android.view.accessibility.CaptioningManager$CaptionStyle)>
	//    5   12:areturn         
		else
			return createFromCaptionStyleV19(captionstyle);
	//    6   13:aload_0         
	//    7   14:invokestatic    #68  <Method CaptionStyleCompat createFromCaptionStyleV19(android.view.accessibility.CaptioningManager$CaptionStyle)>
	//    8   17:areturn         
	}

	private static CaptionStyleCompat createFromCaptionStyleV19(android.view.accessibility.CaptioningManager.CaptionStyle captionstyle)
	{
		return new CaptionStyleCompat(captionstyle.foregroundColor, captionstyle.backgroundColor, 0, captionstyle.edgeType, captionstyle.edgeColor, captionstyle.getTypeface());
	//    0    0:new             #2   <Class CaptionStyleCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field int android.view.accessibility.CaptioningManager$CaptionStyle.foregroundColor>
	//    4    8:aload_0         
	//    5    9:getfield        #73  <Field int android.view.accessibility.CaptioningManager$CaptionStyle.backgroundColor>
	//    6   12:iconst_0        
	//    7   13:aload_0         
	//    8   14:getfield        #74  <Field int android.view.accessibility.CaptioningManager$CaptionStyle.edgeType>
	//    9   17:aload_0         
	//   10   18:getfield        #75  <Field int android.view.accessibility.CaptioningManager$CaptionStyle.edgeColor>
	//   11   21:aload_0         
	//   12   22:invokevirtual   #79  <Method Typeface android.view.accessibility.CaptioningManager$CaptionStyle.getTypeface()>
	//   13   25:invokespecial   #35  <Method void CaptionStyleCompat(int, int, int, int, int, Typeface)>
	//   14   28:areturn         
	}

	private static CaptionStyleCompat createFromCaptionStyleV21(android.view.accessibility.CaptioningManager.CaptionStyle captionstyle)
	{
		int i;
		if(captionstyle.hasForegroundColor())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #84  <Method boolean android.view.accessibility.CaptioningManager$CaptionStyle.hasForegroundColor()>
	//*   2    4:ifeq            15
			i = captionstyle.foregroundColor;
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field int android.view.accessibility.CaptioningManager$CaptionStyle.foregroundColor>
	//    5   11:istore_1        
		else
	//*   6   12:goto            25
			i = DEFAULT.foregroundColor;
	//    7   15:getstatic       #37  <Field CaptionStyleCompat DEFAULT>
	//    8   18:getfield        #42  <Field int foregroundColor>
	//    9   21:istore_1        
	//*  10   22:goto            12
		int j;
		if(captionstyle.hasBackgroundColor())
	//*  11   25:aload_0         
	//*  12   26:invokevirtual   #87  <Method boolean android.view.accessibility.CaptioningManager$CaptionStyle.hasBackgroundColor()>
	//*  13   29:ifeq            40
			j = captionstyle.backgroundColor;
	//   14   32:aload_0         
	//   15   33:getfield        #73  <Field int android.view.accessibility.CaptioningManager$CaptionStyle.backgroundColor>
	//   16   36:istore_2        
		else
	//*  17   37:goto            50
			j = DEFAULT.backgroundColor;
	//   18   40:getstatic       #37  <Field CaptionStyleCompat DEFAULT>
	//   19   43:getfield        #44  <Field int backgroundColor>
	//   20   46:istore_2        
	//*  21   47:goto            37
		int k;
		if(captionstyle.hasWindowColor())
	//*  22   50:aload_0         
	//*  23   51:invokevirtual   #90  <Method boolean android.view.accessibility.CaptioningManager$CaptionStyle.hasWindowColor()>
	//*  24   54:ifeq            65
			k = captionstyle.windowColor;
	//   25   57:aload_0         
	//   26   58:getfield        #91  <Field int android.view.accessibility.CaptioningManager$CaptionStyle.windowColor>
	//   27   61:istore_3        
		else
	//*  28   62:goto            75
			k = DEFAULT.windowColor;
	//   29   65:getstatic       #37  <Field CaptionStyleCompat DEFAULT>
	//   30   68:getfield        #46  <Field int windowColor>
	//   31   71:istore_3        
	//*  32   72:goto            62
		int l;
		if(captionstyle.hasEdgeType())
	//*  33   75:aload_0         
	//*  34   76:invokevirtual   #94  <Method boolean android.view.accessibility.CaptioningManager$CaptionStyle.hasEdgeType()>
	//*  35   79:ifeq            91
			l = captionstyle.edgeType;
	//   36   82:aload_0         
	//   37   83:getfield        #74  <Field int android.view.accessibility.CaptioningManager$CaptionStyle.edgeType>
	//   38   86:istore          4
		else
	//*  39   88:goto            102
			l = DEFAULT.edgeType;
	//   40   91:getstatic       #37  <Field CaptionStyleCompat DEFAULT>
	//   41   94:getfield        #48  <Field int edgeType>
	//   42   97:istore          4
	//*  43   99:goto            88
		int i1;
		if(captionstyle.hasEdgeColor())
	//*  44  102:aload_0         
	//*  45  103:invokevirtual   #97  <Method boolean android.view.accessibility.CaptioningManager$CaptionStyle.hasEdgeColor()>
	//*  46  106:ifeq            118
			i1 = captionstyle.edgeColor;
	//   47  109:aload_0         
	//   48  110:getfield        #75  <Field int android.view.accessibility.CaptioningManager$CaptionStyle.edgeColor>
	//   49  113:istore          5
		else
	//*  50  115:goto            129
			i1 = DEFAULT.edgeColor;
	//   51  118:getstatic       #37  <Field CaptionStyleCompat DEFAULT>
	//   52  121:getfield        #50  <Field int edgeColor>
	//   53  124:istore          5
	//*  54  126:goto            115
		return new CaptionStyleCompat(i, j, k, l, i1, captionstyle.getTypeface());
	//   55  129:new             #2   <Class CaptionStyleCompat>
	//   56  132:dup             
	//   57  133:iload_1         
	//   58  134:iload_2         
	//   59  135:iload_3         
	//   60  136:iload           4
	//   61  138:iload           5
	//   62  140:aload_0         
	//   63  141:invokevirtual   #79  <Method Typeface android.view.accessibility.CaptioningManager$CaptionStyle.getTypeface()>
	//   64  144:invokespecial   #35  <Method void CaptionStyleCompat(int, int, int, int, int, Typeface)>
	//   65  147:areturn         
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
	//    3    5:ldc1            #31  <Int 0xff000000>
	//    4    7:iconst_0        
	//    5    8:iconst_0        
	//    6    9:iconst_m1       
	//    7   10:aconst_null     
	//    8   11:invokespecial   #35  <Method void CaptionStyleCompat(int, int, int, int, int, Typeface)>
	//    9   14:putstatic       #37  <Field CaptionStyleCompat DEFAULT>
	//*  10   17:return          
	}
}
