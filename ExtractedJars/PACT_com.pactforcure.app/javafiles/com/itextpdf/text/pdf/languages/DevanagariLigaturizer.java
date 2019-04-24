// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.languages;


// Referenced classes of package com.itextpdf.text.pdf.languages:
//			IndicLigaturizer

public class DevanagariLigaturizer extends IndicLigaturizer
{

	public DevanagariLigaturizer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void IndicLigaturizer()>
		langTable = new char[11];
	//    2    4:aload_0         
	//    3    5:bipush          11
	//    4    7:newarray        char[]
	//    5    9:putfield        #35  <Field char[] langTable>
		langTable[0] = '\u093E';
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field char[] langTable>
	//    8   16:iconst_0        
	//    9   17:sipush          2366
	//   10   20:castore         
		langTable[1] = '\u093F';
	//   11   21:aload_0         
	//   12   22:getfield        #35  <Field char[] langTable>
	//   13   25:iconst_1        
	//   14   26:sipush          2367
	//   15   29:castore         
		langTable[2] = '\u0947';
	//   16   30:aload_0         
	//   17   31:getfield        #35  <Field char[] langTable>
	//   18   34:iconst_2        
	//   19   35:sipush          2375
	//   20   38:castore         
		langTable[3] = '\u0948';
	//   21   39:aload_0         
	//   22   40:getfield        #35  <Field char[] langTable>
	//   23   43:iconst_3        
	//   24   44:sipush          2376
	//   25   47:castore         
		langTable[4] = '\u0962';
	//   26   48:aload_0         
	//   27   49:getfield        #35  <Field char[] langTable>
	//   28   52:iconst_4        
	//   29   53:sipush          2402
	//   30   56:castore         
		langTable[5] = '\u0963';
	//   31   57:aload_0         
	//   32   58:getfield        #35  <Field char[] langTable>
	//   33   61:iconst_5        
	//   34   62:sipush          2403
	//   35   65:castore         
		langTable[6] = '\u0905';
	//   36   66:aload_0         
	//   37   67:getfield        #35  <Field char[] langTable>
	//   38   70:bipush          6
	//   39   72:sipush          2309
	//   40   75:castore         
		langTable[7] = '\u0914';
	//   41   76:aload_0         
	//   42   77:getfield        #35  <Field char[] langTable>
	//   43   80:bipush          7
	//   44   82:sipush          2324
	//   45   85:castore         
		langTable[8] = '\u0915';
	//   46   86:aload_0         
	//   47   87:getfield        #35  <Field char[] langTable>
	//   48   90:bipush          8
	//   49   92:sipush          2325
	//   50   95:castore         
		langTable[9] = '\u0939';
	//   51   96:aload_0         
	//   52   97:getfield        #35  <Field char[] langTable>
	//   53  100:bipush          9
	//   54  102:sipush          2361
	//   55  105:castore         
		langTable[10] = '\u094D';
	//   56  106:aload_0         
	//   57  107:getfield        #35  <Field char[] langTable>
	//   58  110:bipush          10
	//   59  112:sipush          2381
	//   60  115:castore         
	//   61  116:return          
	}

	public static final char DEVA_HALANTA = 2381;
	public static final char DEVA_LETTER_A = 2309;
	public static final char DEVA_LETTER_AU = 2324;
	public static final char DEVA_LETTER_HA = 2361;
	public static final char DEVA_LETTER_KA = 2325;
	public static final char DEVA_MATRA_AA = 2366;
	public static final char DEVA_MATRA_AI = 2376;
	public static final char DEVA_MATRA_E = 2375;
	public static final char DEVA_MATRA_HLR = 2402;
	public static final char DEVA_MATRA_HLRR = 2403;
	public static final char DEVA_MATRA_I = 2367;
}
