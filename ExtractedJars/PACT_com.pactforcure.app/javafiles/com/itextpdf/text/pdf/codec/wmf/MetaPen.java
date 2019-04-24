// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec.wmf;

import com.itextpdf.text.BaseColor;
import java.io.IOException;

// Referenced classes of package com.itextpdf.text.pdf.codec.wmf:
//			MetaObject, InputMeta

public class MetaPen extends MetaObject
{

	public MetaPen()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void MetaObject()>
		style = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #29  <Field int style>
		penWidth = 1;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #31  <Field int penWidth>
		color = BaseColor.BLACK;
	//    8   14:aload_0         
	//    9   15:getstatic       #36  <Field BaseColor BaseColor.BLACK>
	//   10   18:putfield        #38  <Field BaseColor color>
		type = 1;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #41  <Field int type>
	//   14   26:return          
	}

	public BaseColor getColor()
	{
		return color;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field BaseColor color>
	//    2    4:areturn         
	}

	public int getPenWidth()
	{
		return penWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int penWidth>
	//    2    4:ireturn         
	}

	public int getStyle()
	{
		return style;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int style>
	//    2    4:ireturn         
	}

	public void init(InputMeta inputmeta)
		throws IOException
	{
		style = inputmeta.readWord();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #56  <Method int InputMeta.readWord()>
	//    3    5:putfield        #29  <Field int style>
		penWidth = inputmeta.readShort();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #59  <Method int InputMeta.readShort()>
	//    7   13:putfield        #31  <Field int penWidth>
		inputmeta.readWord();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #56  <Method int InputMeta.readWord()>
	//   10   20:pop             
		color = inputmeta.readColor();
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #62  <Method BaseColor InputMeta.readColor()>
	//   14   26:putfield        #38  <Field BaseColor color>
	//   15   29:return          
	}

	public static final int PS_DASH = 1;
	public static final int PS_DASHDOT = 3;
	public static final int PS_DASHDOTDOT = 4;
	public static final int PS_DOT = 2;
	public static final int PS_INSIDEFRAME = 6;
	public static final int PS_NULL = 5;
	public static final int PS_SOLID = 0;
	BaseColor color;
	int penWidth;
	int style;
}
