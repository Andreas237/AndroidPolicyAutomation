// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			BarcodeDatamatrix

private static class BarcodeDatamatrix$DmParams
{

	int dataBlock;
	int dataSize;
	int errorBlock;
	int height;
	int heightSection;
	int width;
	int widthSection;

	BarcodeDatamatrix$DmParams(int i, int j, int k, int l, int i1, int j1, int k1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		height = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #22  <Field int height>
		width = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #24  <Field int width>
		heightSection = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #26  <Field int heightSection>
		widthSection = l;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #28  <Field int widthSection>
		dataSize = i1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #30  <Field int dataSize>
		dataBlock = j1;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #32  <Field int dataBlock>
		errorBlock = k1;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #34  <Field int errorBlock>
	//   23   43:return          
	}
}
