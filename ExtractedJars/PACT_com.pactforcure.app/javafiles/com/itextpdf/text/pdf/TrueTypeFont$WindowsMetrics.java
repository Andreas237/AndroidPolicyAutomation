// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			TrueTypeFont

protected static class TrueTypeFont$WindowsMetrics
{

	byte achVendID[];
	int fsSelection;
	short fsType;
	byte panose[];
	int sCapHeight;
	short sFamilyClass;
	short sTypoAscender;
	short sTypoDescender;
	short sTypoLineGap;
	int ulCodePageRange1;
	int ulCodePageRange2;
	int usFirstCharIndex;
	int usLastCharIndex;
	int usWeightClass;
	int usWidthClass;
	int usWinAscent;
	int usWinDescent;
	short xAvgCharWidth;
	short yStrikeoutPosition;
	short yStrikeoutSize;
	short ySubscriptXOffset;
	short ySubscriptXSize;
	short ySubscriptYOffset;
	short ySubscriptYSize;
	short ySuperscriptXOffset;
	short ySuperscriptXSize;
	short ySuperscriptYOffset;
	short ySuperscriptYSize;

	protected TrueTypeFont$WindowsMetrics()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		panose = new byte[10];
	//    2    4:aload_0         
	//    3    5:bipush          10
	//    4    7:newarray        byte[]
	//    5    9:putfield        #44  <Field byte[] panose>
		achVendID = new byte[4];
	//    6   12:aload_0         
	//    7   13:iconst_4        
	//    8   14:newarray        byte[]
	//    9   16:putfield        #46  <Field byte[] achVendID>
	//   10   19:return          
	}
}
