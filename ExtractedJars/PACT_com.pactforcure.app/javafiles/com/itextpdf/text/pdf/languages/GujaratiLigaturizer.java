// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.languages;


// Referenced classes of package com.itextpdf.text.pdf.languages:
//			IndicLigaturizer

public class GujaratiLigaturizer extends IndicLigaturizer
{

	public GujaratiLigaturizer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void IndicLigaturizer()>
		langTable = new char[11];
	//    2    4:aload_0         
	//    3    5:bipush          11
	//    4    7:newarray        char[]
	//    5    9:putfield        #35  <Field char[] langTable>
		langTable[0] = '\u0ABE';
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field char[] langTable>
	//    8   16:iconst_0        
	//    9   17:sipush          2750
	//   10   20:castore         
		langTable[1] = '\u0ABF';
	//   11   21:aload_0         
	//   12   22:getfield        #35  <Field char[] langTable>
	//   13   25:iconst_1        
	//   14   26:sipush          2751
	//   15   29:castore         
		langTable[2] = '\u0AC7';
	//   16   30:aload_0         
	//   17   31:getfield        #35  <Field char[] langTable>
	//   18   34:iconst_2        
	//   19   35:sipush          2759
	//   20   38:castore         
		langTable[3] = '\u0AC8';
	//   21   39:aload_0         
	//   22   40:getfield        #35  <Field char[] langTable>
	//   23   43:iconst_3        
	//   24   44:sipush          2760
	//   25   47:castore         
		langTable[4] = '\u0AE2';
	//   26   48:aload_0         
	//   27   49:getfield        #35  <Field char[] langTable>
	//   28   52:iconst_4        
	//   29   53:sipush          2786
	//   30   56:castore         
		langTable[5] = '\u0AE3';
	//   31   57:aload_0         
	//   32   58:getfield        #35  <Field char[] langTable>
	//   33   61:iconst_5        
	//   34   62:sipush          2787
	//   35   65:castore         
		langTable[6] = '\u0A85';
	//   36   66:aload_0         
	//   37   67:getfield        #35  <Field char[] langTable>
	//   38   70:bipush          6
	//   39   72:sipush          2693
	//   40   75:castore         
		langTable[7] = '\u0A94';
	//   41   76:aload_0         
	//   42   77:getfield        #35  <Field char[] langTable>
	//   43   80:bipush          7
	//   44   82:sipush          2708
	//   45   85:castore         
		langTable[8] = '\u0A95';
	//   46   86:aload_0         
	//   47   87:getfield        #35  <Field char[] langTable>
	//   48   90:bipush          8
	//   49   92:sipush          2709
	//   50   95:castore         
		langTable[9] = '\u0AB9';
	//   51   96:aload_0         
	//   52   97:getfield        #35  <Field char[] langTable>
	//   53  100:bipush          9
	//   54  102:sipush          2745
	//   55  105:castore         
		langTable[10] = '\u0ACD';
	//   56  106:aload_0         
	//   57  107:getfield        #35  <Field char[] langTable>
	//   58  110:bipush          10
	//   59  112:sipush          2765
	//   60  115:castore         
	//   61  116:return          
	}

	public static final char GUJR_HALANTA = 2765;
	public static final char GUJR_LETTER_A = 2693;
	public static final char GUJR_LETTER_AU = 2708;
	public static final char GUJR_LETTER_HA = 2745;
	public static final char GUJR_LETTER_KA = 2709;
	public static final char GUJR_MATRA_AA = 2750;
	public static final char GUJR_MATRA_AI = 2760;
	public static final char GUJR_MATRA_E = 2759;
	public static final char GUJR_MATRA_HLR = 2786;
	public static final char GUJR_MATRA_HLRR = 2787;
	public static final char GUJR_MATRA_I = 2751;
}
