// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec.wmf;

import com.itextpdf.text.BaseColor;
import java.io.IOException;

// Referenced classes of package com.itextpdf.text.pdf.codec.wmf:
//			MetaObject, InputMeta

public class MetaBrush extends MetaObject
{

	public MetaBrush()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void MetaObject()>
		style = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #32  <Field int style>
		color = BaseColor.WHITE;
	//    5    9:aload_0         
	//    6   10:getstatic       #37  <Field BaseColor BaseColor.WHITE>
	//    7   13:putfield        #39  <Field BaseColor color>
		type = 2;
	//    8   16:aload_0         
	//    9   17:iconst_2        
	//   10   18:putfield        #42  <Field int type>
	//   11   21:return          
	}

	public BaseColor getColor()
	{
		return color;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field BaseColor color>
	//    2    4:areturn         
	}

	public int getHatch()
	{
		return hatch;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int hatch>
	//    2    4:ireturn         
	}

	public int getStyle()
	{
		return style;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int style>
	//    2    4:ireturn         
	}

	public void init(InputMeta inputmeta)
		throws IOException
	{
		style = inputmeta.readWord();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #59  <Method int InputMeta.readWord()>
	//    3    5:putfield        #32  <Field int style>
		color = inputmeta.readColor();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #62  <Method BaseColor InputMeta.readColor()>
	//    7   13:putfield        #39  <Field BaseColor color>
		hatch = inputmeta.readWord();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #59  <Method int InputMeta.readWord()>
	//   11   21:putfield        #49  <Field int hatch>
	//   12   24:return          
	}

	public static final int BS_DIBPATTERN = 5;
	public static final int BS_HATCHED = 2;
	public static final int BS_NULL = 1;
	public static final int BS_PATTERN = 3;
	public static final int BS_SOLID = 0;
	public static final int HS_BDIAGONAL = 3;
	public static final int HS_CROSS = 4;
	public static final int HS_DIAGCROSS = 5;
	public static final int HS_FDIAGONAL = 2;
	public static final int HS_HORIZONTAL = 0;
	public static final int HS_VERTICAL = 1;
	BaseColor color;
	int hatch;
	int style;
}
