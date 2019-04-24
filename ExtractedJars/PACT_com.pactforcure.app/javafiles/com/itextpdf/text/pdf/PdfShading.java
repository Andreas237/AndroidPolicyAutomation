// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.IOException;

// Referenced classes of package com.itextpdf.text.pdf:
//			ExtendedColor, SpotColor, GrayColor, CMYKColor, 
//			DeviceNColor, PdfFunction, PdfDictionary, PdfName, 
//			PdfNumber, PdfArray, PdfBoolean, PdfWriter, 
//			ColorDetails, PdfIndirectReference

public class PdfShading
{

	protected PdfShading(PdfWriter pdfwriter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		antiAlias = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #29  <Field boolean antiAlias>
		writer = pdfwriter;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #31  <Field PdfWriter writer>
	//    8   14:return          
	}

	public static void checkCompatibleColors(BaseColor basecolor, BaseColor basecolor1)
	{
		int i = ExtendedColor.getType(basecolor);
	//    0    0:aload_0         
	//    1    1:invokestatic    #40  <Method int ExtendedColor.getType(BaseColor)>
	//    2    4:istore_2        
		if(i != ExtendedColor.getType(basecolor1))
	//*   3    5:iload_2         
	//*   4    6:aload_1         
	//*   5    7:invokestatic    #40  <Method int ExtendedColor.getType(BaseColor)>
	//*   6   10:icmpeq          30
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("both.colors.must.be.of.the.same.type", new Object[0]));
	//    7   13:new             #42  <Class IllegalArgumentException>
	//    8   16:dup             
	//    9   17:ldc1            #44  <String "both.colors.must.be.of.the.same.type">
	//   10   19:iconst_0        
	//   11   20:anewarray       Object[]
	//   12   23:invokestatic    #50  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   13   26:invokespecial   #53  <Method void IllegalArgumentException(String)>
	//   14   29:athrow          
		if(i == 3 && ((SpotColor)basecolor).getPdfSpotColor() != ((SpotColor)basecolor1).getPdfSpotColor())
	//*  15   30:iload_2         
	//*  16   31:iconst_3        
	//*  17   32:icmpne          69
	//*  18   35:aload_0         
	//*  19   36:checkcast       #55  <Class SpotColor>
	//*  20   39:invokevirtual   #59  <Method PdfSpotColor SpotColor.getPdfSpotColor()>
	//*  21   42:aload_1         
	//*  22   43:checkcast       #55  <Class SpotColor>
	//*  23   46:invokevirtual   #59  <Method PdfSpotColor SpotColor.getPdfSpotColor()>
	//*  24   49:if_acmpeq       69
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.spot.color.must.be.the.same.only.the.tint.can.vary", new Object[0]));
	//   25   52:new             #42  <Class IllegalArgumentException>
	//   26   55:dup             
	//   27   56:ldc1            #61  <String "the.spot.color.must.be.the.same.only.the.tint.can.vary">
	//   28   58:iconst_0        
	//   29   59:anewarray       Object[]
	//   30   62:invokestatic    #50  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   31   65:invokespecial   #53  <Method void IllegalArgumentException(String)>
	//   32   68:athrow          
		if(i == 4 || i == 5)
	//*  33   69:iload_2         
	//*  34   70:iconst_4        
	//*  35   71:icmpeq          79
	//*  36   74:iload_2         
	//*  37   75:iconst_5        
	//*  38   76:icmpne          82
			throwColorSpaceError();
	//   39   79:invokestatic    #64  <Method void throwColorSpaceError()>
	//   40   82:return          
	}

	public static float[] getColorArray(BaseColor basecolor)
	{
		switch(ExtendedColor.getType(basecolor))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #40  <Method int ExtendedColor.getType(BaseColor)>
		{
	//*   2    4:tableswitch     0 6: default 48
	//	               0 126
	//	               1 53
	//	               2 67
	//	               3 104
	//	               4 48
	//	               5 48
	//	               6 118
		case 4: // '\004'
		case 5: // '\005'
		default:
			throwColorSpaceError();
	//    3   48:invokestatic    #64  <Method void throwColorSpaceError()>
			return null;
	//    4   51:aconst_null     
	//    5   52:areturn         

		case 1: // '\001'
			return (new float[] {
				((GrayColor)basecolor).getGray()
			});
	//    6   53:iconst_1        
	//    7   54:newarray        float[]
	//    8   56:dup             
	//    9   57:iconst_0        
	//   10   58:aload_0         
	//   11   59:checkcast       #68  <Class GrayColor>
	//   12   62:invokevirtual   #72  <Method float GrayColor.getGray()>
	//   13   65:fastore         
	//   14   66:areturn         

		case 2: // '\002'
			basecolor = ((BaseColor) ((CMYKColor)basecolor));
	//   15   67:aload_0         
	//   16   68:checkcast       #74  <Class CMYKColor>
	//   17   71:astore_0        
			return (new float[] {
				((CMYKColor) (basecolor)).getCyan(), ((CMYKColor) (basecolor)).getMagenta(), ((CMYKColor) (basecolor)).getYellow(), ((CMYKColor) (basecolor)).getBlack()
			});
	//   18   72:iconst_4        
	//   19   73:newarray        float[]
	//   20   75:dup             
	//   21   76:iconst_0        
	//   22   77:aload_0         
	//   23   78:invokevirtual   #77  <Method float CMYKColor.getCyan()>
	//   24   81:fastore         
	//   25   82:dup             
	//   26   83:iconst_1        
	//   27   84:aload_0         
	//   28   85:invokevirtual   #80  <Method float CMYKColor.getMagenta()>
	//   29   88:fastore         
	//   30   89:dup             
	//   31   90:iconst_2        
	//   32   91:aload_0         
	//   33   92:invokevirtual   #83  <Method float CMYKColor.getYellow()>
	//   34   95:fastore         
	//   35   96:dup             
	//   36   97:iconst_3        
	//   37   98:aload_0         
	//   38   99:invokevirtual   #86  <Method float CMYKColor.getBlack()>
	//   39  102:fastore         
	//   40  103:areturn         

		case 3: // '\003'
			return (new float[] {
				((SpotColor)basecolor).getTint()
			});
	//   41  104:iconst_1        
	//   42  105:newarray        float[]
	//   43  107:dup             
	//   44  108:iconst_0        
	//   45  109:aload_0         
	//   46  110:checkcast       #55  <Class SpotColor>
	//   47  113:invokevirtual   #89  <Method float SpotColor.getTint()>
	//   48  116:fastore         
	//   49  117:areturn         

		case 6: // '\006'
			return ((DeviceNColor)basecolor).getTints();
	//   50  118:aload_0         
	//   51  119:checkcast       #91  <Class DeviceNColor>
	//   52  122:invokevirtual   #95  <Method float[] DeviceNColor.getTints()>
	//   53  125:areturn         

		case 0: // '\0'
			return (new float[] {
				(float)basecolor.getRed() / 255F, (float)basecolor.getGreen() / 255F, (float)basecolor.getBlue() / 255F
			});
	//   54  126:iconst_3        
	//   55  127:newarray        float[]
	//   56  129:dup             
	//   57  130:iconst_0        
	//   58  131:aload_0         
	//   59  132:invokevirtual   #101 <Method int BaseColor.getRed()>
	//   60  135:i2f             
	//   61  136:ldc1            #102 <Float 255F>
	//   62  138:fdiv            
	//   63  139:fastore         
	//   64  140:dup             
	//   65  141:iconst_1        
	//   66  142:aload_0         
	//   67  143:invokevirtual   #105 <Method int BaseColor.getGreen()>
	//   68  146:i2f             
	//   69  147:ldc1            #102 <Float 255F>
	//   70  149:fdiv            
	//   71  150:fastore         
	//   72  151:dup             
	//   73  152:iconst_2        
	//   74  153:aload_0         
	//   75  154:invokevirtual   #108 <Method int BaseColor.getBlue()>
	//   76  157:i2f             
	//   77  158:ldc1            #102 <Float 255F>
	//   78  160:fdiv            
	//   79  161:fastore         
	//   80  162:areturn         
		}
	}

	public static PdfShading simpleAxial(PdfWriter pdfwriter, float f, float f1, float f2, float f3, BaseColor basecolor, BaseColor basecolor1)
	{
		return simpleAxial(pdfwriter, f, f1, f2, f3, basecolor, basecolor1, true, true);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:iconst_1        
	//    8   11:iconst_1        
	//    9   12:invokestatic    #113 <Method PdfShading simpleAxial(PdfWriter, float, float, float, float, BaseColor, BaseColor, boolean, boolean)>
	//   10   15:areturn         
	}

	public static PdfShading simpleAxial(PdfWriter pdfwriter, float f, float f1, float f2, float f3, BaseColor basecolor, BaseColor basecolor1, boolean flag, 
			boolean flag1)
	{
		checkCompatibleColors(basecolor, basecolor1);
	//    0    0:aload           5
	//    1    2:aload           6
	//    2    4:invokestatic    #115 <Method void checkCompatibleColors(BaseColor, BaseColor)>
		float af[] = getColorArray(basecolor);
	//    3    7:aload           5
	//    4    9:invokestatic    #117 <Method float[] getColorArray(BaseColor)>
	//    5   12:astore          9
		basecolor1 = ((BaseColor) (getColorArray(basecolor1)));
	//    6   14:aload           6
	//    7   16:invokestatic    #117 <Method float[] getColorArray(BaseColor)>
	//    8   19:astore          6
		basecolor1 = ((BaseColor) (PdfFunction.type2(pdfwriter, new float[] {
			0.0F, 1.0F
		}, ((float []) (null)), af, ((float []) (basecolor1)), 1.0F)));
	//    9   21:aload_0         
	//   10   22:iconst_2        
	//   11   23:newarray        float[]
	//   12   25:dup             
	//   13   26:iconst_0        
	//   14   27:fconst_0        
	//   15   28:fastore         
	//   16   29:dup             
	//   17   30:iconst_1        
	//   18   31:fconst_1        
	//   19   32:fastore         
	//   20   33:aconst_null     
	//   21   34:aload           9
	//   22   36:aload           6
	//   23   38:fconst_1        
	//   24   39:invokestatic    #123 <Method PdfFunction PdfFunction.type2(PdfWriter, float[], float[], float[], float[], float)>
	//   25   42:astore          6
		return type2(pdfwriter, basecolor, new float[] {
			f, f1, f2, f3
		}, ((float []) (null)), ((PdfFunction) (basecolor1)), new boolean[] {
			flag, flag1
		});
	//   26   44:aload_0         
	//   27   45:aload           5
	//   28   47:iconst_4        
	//   29   48:newarray        float[]
	//   30   50:dup             
	//   31   51:iconst_0        
	//   32   52:fload_1         
	//   33   53:fastore         
	//   34   54:dup             
	//   35   55:iconst_1        
	//   36   56:fload_2         
	//   37   57:fastore         
	//   38   58:dup             
	//   39   59:iconst_2        
	//   40   60:fload_3         
	//   41   61:fastore         
	//   42   62:dup             
	//   43   63:iconst_3        
	//   44   64:fload           4
	//   45   66:fastore         
	//   46   67:aconst_null     
	//   47   68:aload           6
	//   48   70:iconst_2        
	//   49   71:newarray        boolean[]
	//   50   73:dup             
	//   51   74:iconst_0        
	//   52   75:iload           7
	//   53   77:bastore         
	//   54   78:dup             
	//   55   79:iconst_1        
	//   56   80:iload           8
	//   57   82:bastore         
	//   58   83:invokestatic    #126 <Method PdfShading type2(PdfWriter, BaseColor, float[], float[], PdfFunction, boolean[])>
	//   59   86:areturn         
	}

	public static PdfShading simpleRadial(PdfWriter pdfwriter, float f, float f1, float f2, float f3, float f4, float f5, BaseColor basecolor, 
			BaseColor basecolor1)
	{
		return simpleRadial(pdfwriter, f, f1, f2, f3, f4, f5, basecolor, basecolor1, true, true);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:fload           5
	//    6    8:fload           6
	//    7   10:aload           7
	//    8   12:aload           8
	//    9   14:iconst_1        
	//   10   15:iconst_1        
	//   11   16:invokestatic    #131 <Method PdfShading simpleRadial(PdfWriter, float, float, float, float, float, float, BaseColor, BaseColor, boolean, boolean)>
	//   12   19:areturn         
	}

	public static PdfShading simpleRadial(PdfWriter pdfwriter, float f, float f1, float f2, float f3, float f4, float f5, BaseColor basecolor, 
			BaseColor basecolor1, boolean flag, boolean flag1)
	{
		checkCompatibleColors(basecolor, basecolor1);
	//    0    0:aload           7
	//    1    2:aload           8
	//    2    4:invokestatic    #115 <Method void checkCompatibleColors(BaseColor, BaseColor)>
		float af[] = getColorArray(basecolor);
	//    3    7:aload           7
	//    4    9:invokestatic    #117 <Method float[] getColorArray(BaseColor)>
	//    5   12:astore          11
		basecolor1 = ((BaseColor) (getColorArray(basecolor1)));
	//    6   14:aload           8
	//    7   16:invokestatic    #117 <Method float[] getColorArray(BaseColor)>
	//    8   19:astore          8
		basecolor1 = ((BaseColor) (PdfFunction.type2(pdfwriter, new float[] {
			0.0F, 1.0F
		}, ((float []) (null)), af, ((float []) (basecolor1)), 1.0F)));
	//    9   21:aload_0         
	//   10   22:iconst_2        
	//   11   23:newarray        float[]
	//   12   25:dup             
	//   13   26:iconst_0        
	//   14   27:fconst_0        
	//   15   28:fastore         
	//   16   29:dup             
	//   17   30:iconst_1        
	//   18   31:fconst_1        
	//   19   32:fastore         
	//   20   33:aconst_null     
	//   21   34:aload           11
	//   22   36:aload           8
	//   23   38:fconst_1        
	//   24   39:invokestatic    #123 <Method PdfFunction PdfFunction.type2(PdfWriter, float[], float[], float[], float[], float)>
	//   25   42:astore          8
		return type3(pdfwriter, basecolor, new float[] {
			f, f1, f2, f3, f4, f5
		}, ((float []) (null)), ((PdfFunction) (basecolor1)), new boolean[] {
			flag, flag1
		});
	//   26   44:aload_0         
	//   27   45:aload           7
	//   28   47:bipush          6
	//   29   49:newarray        float[]
	//   30   51:dup             
	//   31   52:iconst_0        
	//   32   53:fload_1         
	//   33   54:fastore         
	//   34   55:dup             
	//   35   56:iconst_1        
	//   36   57:fload_2         
	//   37   58:fastore         
	//   38   59:dup             
	//   39   60:iconst_2        
	//   40   61:fload_3         
	//   41   62:fastore         
	//   42   63:dup             
	//   43   64:iconst_3        
	//   44   65:fload           4
	//   45   67:fastore         
	//   46   68:dup             
	//   47   69:iconst_4        
	//   48   70:fload           5
	//   49   72:fastore         
	//   50   73:dup             
	//   51   74:iconst_5        
	//   52   75:fload           6
	//   53   77:fastore         
	//   54   78:aconst_null     
	//   55   79:aload           8
	//   56   81:iconst_2        
	//   57   82:newarray        boolean[]
	//   58   84:dup             
	//   59   85:iconst_0        
	//   60   86:iload           9
	//   61   88:bastore         
	//   62   89:dup             
	//   63   90:iconst_1        
	//   64   91:iload           10
	//   65   93:bastore         
	//   66   94:invokestatic    #134 <Method PdfShading type3(PdfWriter, BaseColor, float[], float[], PdfFunction, boolean[])>
	//   67   97:areturn         
	}

	public static void throwColorSpaceError()
	{
		throw new IllegalArgumentException(MessageLocalization.getComposedMessage("a.tiling.or.shading.pattern.cannot.be.used.as.a.color.space.in.a.shading.pattern", new Object[0]));
	//    0    0:new             #42  <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:ldc1            #136 <String "a.tiling.or.shading.pattern.cannot.be.used.as.a.color.space.in.a.shading.pattern">
	//    3    6:iconst_0        
	//    4    7:anewarray       Object[]
	//    5   10:invokestatic    #50  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    6   13:invokespecial   #53  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
	}

	public static PdfShading type1(PdfWriter pdfwriter, BaseColor basecolor, float af[], float af1[], PdfFunction pdffunction)
	{
		pdfwriter = ((PdfWriter) (new PdfShading(pdfwriter)));
	//    0    0:new             #2   <Class PdfShading>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #140 <Method void PdfShading(PdfWriter)>
	//    4    8:astore_0        
		pdfwriter.shading = new PdfDictionary();
	//    5    9:aload_0         
	//    6   10:new             #142 <Class PdfDictionary>
	//    7   13:dup             
	//    8   14:invokespecial   #143 <Method void PdfDictionary()>
	//    9   17:putfield        #145 <Field PdfDictionary shading>
		pdfwriter.shadingType = 1;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #147 <Field int shadingType>
		((PdfShading) (pdfwriter)).shading.put(PdfName.SHADINGTYPE, ((PdfObject) (new PdfNumber(((PdfShading) (pdfwriter)).shadingType))));
	//   13   25:aload_0         
	//   14   26:getfield        #145 <Field PdfDictionary shading>
	//   15   29:getstatic       #152 <Field PdfName PdfName.SHADINGTYPE>
	//   16   32:new             #154 <Class PdfNumber>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:getfield        #147 <Field int shadingType>
	//   20   40:invokespecial   #157 <Method void PdfNumber(int)>
	//   21   43:invokevirtual   #161 <Method void PdfDictionary.put(PdfName, PdfObject)>
		((PdfShading) (pdfwriter)).setColorSpace(basecolor);
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:invokevirtual   #165 <Method void setColorSpace(BaseColor)>
		if(af != null)
	//*  25   51:aload_2         
	//*  26   52:ifnull          73
			((PdfShading) (pdfwriter)).shading.put(PdfName.DOMAIN, ((PdfObject) (new PdfArray(af))));
	//   27   55:aload_0         
	//   28   56:getfield        #145 <Field PdfDictionary shading>
	//   29   59:getstatic       #168 <Field PdfName PdfName.DOMAIN>
	//   30   62:new             #170 <Class PdfArray>
	//   31   65:dup             
	//   32   66:aload_2         
	//   33   67:invokespecial   #173 <Method void PdfArray(float[])>
	//   34   70:invokevirtual   #161 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(af1 != null)
	//*  35   73:aload_3         
	//*  36   74:ifnull          95
			((PdfShading) (pdfwriter)).shading.put(PdfName.MATRIX, ((PdfObject) (new PdfArray(af1))));
	//   37   77:aload_0         
	//   38   78:getfield        #145 <Field PdfDictionary shading>
	//   39   81:getstatic       #176 <Field PdfName PdfName.MATRIX>
	//   40   84:new             #170 <Class PdfArray>
	//   41   87:dup             
	//   42   88:aload_3         
	//   43   89:invokespecial   #173 <Method void PdfArray(float[])>
	//   44   92:invokevirtual   #161 <Method void PdfDictionary.put(PdfName, PdfObject)>
		((PdfShading) (pdfwriter)).shading.put(PdfName.FUNCTION, ((PdfObject) (pdffunction.getReference())));
	//   45   95:aload_0         
	//   46   96:getfield        #145 <Field PdfDictionary shading>
	//   47   99:getstatic       #179 <Field PdfName PdfName.FUNCTION>
	//   48  102:aload           4
	//   49  104:invokevirtual   #183 <Method PdfIndirectReference PdfFunction.getReference()>
	//   50  107:invokevirtual   #161 <Method void PdfDictionary.put(PdfName, PdfObject)>
		return ((PdfShading) (pdfwriter));
	//   51  110:aload_0         
	//   52  111:areturn         
	}

	public static PdfShading type2(PdfWriter pdfwriter, BaseColor basecolor, float af[], float af1[], PdfFunction pdffunction, boolean aflag[])
	{
		PdfShading pdfshading = new PdfShading(pdfwriter);
	//    0    0:new             #2   <Class PdfShading>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #140 <Method void PdfShading(PdfWriter)>
	//    4    8:astore          6
		pdfshading.shading = new PdfDictionary();
	//    5   10:aload           6
	//    6   12:new             #142 <Class PdfDictionary>
	//    7   15:dup             
	//    8   16:invokespecial   #143 <Method void PdfDictionary()>
	//    9   19:putfield        #145 <Field PdfDictionary shading>
		pdfshading.shadingType = 2;
	//   10   22:aload           6
	//   11   24:iconst_2        
	//   12   25:putfield        #147 <Field int shadingType>
		pdfshading.shading.put(PdfName.SHADINGTYPE, ((PdfObject) (new PdfNumber(pdfshading.shadingType))));
	//   13   28:aload           6
	//   14   30:getfield        #145 <Field PdfDictionary shading>
	//   15   33:getstatic       #152 <Field PdfName PdfName.SHADINGTYPE>
	//   16   36:new             #154 <Class PdfNumber>
	//   17   39:dup             
	//   18   40:aload           6
	//   19   42:getfield        #147 <Field int shadingType>
	//   20   45:invokespecial   #157 <Method void PdfNumber(int)>
	//   21   48:invokevirtual   #161 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfshading.setColorSpace(basecolor);
	//   22   51:aload           6
	//   23   53:aload_1         
	//   24   54:invokevirtual   #165 <Method void setColorSpace(BaseColor)>
		pdfshading.shading.put(PdfName.COORDS, ((PdfObject) (new PdfArray(af))));
	//   25   57:aload           6
	//   26   59:getfield        #145 <Field PdfDictionary shading>
	//   27   62:getstatic       #186 <Field PdfName PdfName.COORDS>
	//   28   65:new             #170 <Class PdfArray>
	//   29   68:dup             
	//   30   69:aload_2         
	//   31   70:invokespecial   #173 <Method void PdfArray(float[])>
	//   32   73:invokevirtual   #161 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(af1 != null)
	//*  33   76:aload_3         
	//*  34   77:ifnull          99
			pdfshading.shading.put(PdfName.DOMAIN, ((PdfObject) (new PdfArray(af1))));
	//   35   80:aload           6
	//   36   82:getfield        #145 <Field PdfDictionary shading>
	//   37   85:getstatic       #168 <Field PdfName PdfName.DOMAIN>
	//   38   88:new             #170 <Class PdfArray>
	//   39   91:dup             
	//   40   92:aload_3         
	//   41   93:invokespecial   #173 <Method void PdfArray(float[])>
	//   42   96:invokevirtual   #161 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfshading.shading.put(PdfName.FUNCTION, ((PdfObject) (pdffunction.getReference())));
	//   43   99:aload           6
	//   44  101:getfield        #145 <Field PdfDictionary shading>
	//   45  104:getstatic       #179 <Field PdfName PdfName.FUNCTION>
	//   46  107:aload           4
	//   47  109:invokevirtual   #183 <Method PdfIndirectReference PdfFunction.getReference()>
	//   48  112:invokevirtual   #161 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(aflag != null && (aflag[0] || aflag[1]))
	//*  49  115:aload           5
	//*  50  117:ifnull          183
	//*  51  120:aload           5
	//*  52  122:iconst_0        
	//*  53  123:baload          
	//*  54  124:ifne            134
	//*  55  127:aload           5
	//*  56  129:iconst_1        
	//*  57  130:baload          
	//*  58  131:ifeq            183
		{
			if(aflag[0])
	//*  59  134:aload           5
	//*  60  136:iconst_0        
	//*  61  137:baload          
	//*  62  138:ifeq            186
				pdfwriter = ((PdfWriter) (PdfBoolean.PDFTRUE));
	//   63  141:getstatic       #192 <Field PdfBoolean PdfBoolean.PDFTRUE>
	//   64  144:astore_0        
			else
	//*  65  145:new             #170 <Class PdfArray>
	//*  66  148:dup             
	//*  67  149:aload_0         
	//*  68  150:invokespecial   #195 <Method void PdfArray(PdfObject)>
	//*  69  153:astore_1        
	//*  70  154:aload           5
	//*  71  156:iconst_1        
	//*  72  157:baload          
	//*  73  158:ifeq            193
	//*  74  161:getstatic       #192 <Field PdfBoolean PdfBoolean.PDFTRUE>
	//*  75  164:astore_0        
	//*  76  165:aload_1         
	//*  77  166:aload_0         
	//*  78  167:invokevirtual   #199 <Method boolean PdfArray.add(PdfObject)>
	//*  79  170:pop             
	//*  80  171:aload           6
	//*  81  173:getfield        #145 <Field PdfDictionary shading>
	//*  82  176:getstatic       #202 <Field PdfName PdfName.EXTEND>
	//*  83  179:aload_1         
	//*  84  180:invokevirtual   #161 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  85  183:aload           6
	//*  86  185:areturn         
				pdfwriter = ((PdfWriter) (PdfBoolean.PDFFALSE));
	//   87  186:getstatic       #205 <Field PdfBoolean PdfBoolean.PDFFALSE>
	//   88  189:astore_0        
			basecolor = ((BaseColor) (new PdfArray(((PdfObject) (pdfwriter)))));
			if(aflag[1])
				pdfwriter = ((PdfWriter) (PdfBoolean.PDFTRUE));
			else
	//*  89  190:goto            145
				pdfwriter = ((PdfWriter) (PdfBoolean.PDFFALSE));
	//   90  193:getstatic       #205 <Field PdfBoolean PdfBoolean.PDFFALSE>
	//   91  196:astore_0        
			((PdfArray) (basecolor)).add(((PdfObject) (pdfwriter)));
			pdfshading.shading.put(PdfName.EXTEND, ((PdfObject) (basecolor)));
		}
		return pdfshading;
	//*  92  197:goto            165
	}

	public static PdfShading type3(PdfWriter pdfwriter, BaseColor basecolor, float af[], float af1[], PdfFunction pdffunction, boolean aflag[])
	{
		pdfwriter = ((PdfWriter) (type2(pdfwriter, basecolor, af, af1, pdffunction, aflag)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokestatic    #126 <Method PdfShading type2(PdfWriter, BaseColor, float[], float[], PdfFunction, boolean[])>
	//    7   11:astore_0        
		pdfwriter.shadingType = 3;
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:putfield        #147 <Field int shadingType>
		((PdfShading) (pdfwriter)).shading.put(PdfName.SHADINGTYPE, ((PdfObject) (new PdfNumber(((PdfShading) (pdfwriter)).shadingType))));
	//   11   17:aload_0         
	//   12   18:getfield        #145 <Field PdfDictionary shading>
	//   13   21:getstatic       #152 <Field PdfName PdfName.SHADINGTYPE>
	//   14   24:new             #154 <Class PdfNumber>
	//   15   27:dup             
	//   16   28:aload_0         
	//   17   29:getfield        #147 <Field int shadingType>
	//   18   32:invokespecial   #157 <Method void PdfNumber(int)>
	//   19   35:invokevirtual   #161 <Method void PdfDictionary.put(PdfName, PdfObject)>
		return ((PdfShading) (pdfwriter));
	//   20   38:aload_0         
	//   21   39:areturn         
	}

	public void addToBody()
		throws IOException
	{
		if(bBox != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #210 <Field float[] bBox>
	//*   2    4:ifnull          28
			shading.put(PdfName.BBOX, ((PdfObject) (new PdfArray(bBox))));
	//    3    7:aload_0         
	//    4    8:getfield        #145 <Field PdfDictionary shading>
	//    5   11:getstatic       #213 <Field PdfName PdfName.BBOX>
	//    6   14:new             #170 <Class PdfArray>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:getfield        #210 <Field float[] bBox>
	//   10   22:invokespecial   #173 <Method void PdfArray(float[])>
	//   11   25:invokevirtual   #161 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(antiAlias)
	//*  12   28:aload_0         
	//*  13   29:getfield        #29  <Field boolean antiAlias>
	//*  14   32:ifeq            48
			shading.put(PdfName.ANTIALIAS, ((PdfObject) (PdfBoolean.PDFTRUE)));
	//   15   35:aload_0         
	//   16   36:getfield        #145 <Field PdfDictionary shading>
	//   17   39:getstatic       #216 <Field PdfName PdfName.ANTIALIAS>
	//   18   42:getstatic       #192 <Field PdfBoolean PdfBoolean.PDFTRUE>
	//   19   45:invokevirtual   #161 <Method void PdfDictionary.put(PdfName, PdfObject)>
		writer.addToBody(((PdfObject) (shading)), getShadingReference());
	//   20   48:aload_0         
	//   21   49:getfield        #31  <Field PdfWriter writer>
	//   22   52:aload_0         
	//   23   53:getfield        #145 <Field PdfDictionary shading>
	//   24   56:aload_0         
	//   25   57:invokevirtual   #219 <Method PdfIndirectReference getShadingReference()>
	//   26   60:invokevirtual   #224 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, PdfIndirectReference)>
	//   27   63:pop             
	//   28   64:return          
	}

	public float[] getBBox()
	{
		return bBox;
	//    0    0:aload_0         
	//    1    1:getfield        #210 <Field float[] bBox>
	//    2    4:areturn         
	}

	ColorDetails getColorDetails()
	{
		return colorDetails;
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field ColorDetails colorDetails>
	//    2    4:areturn         
	}

	public BaseColor getColorSpace()
	{
		return cspace;
	//    0    0:aload_0         
	//    1    1:getfield        #234 <Field BaseColor cspace>
	//    2    4:areturn         
	}

	PdfName getShadingName()
	{
		return shadingName;
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field PdfName shadingName>
	//    2    4:areturn         
	}

	PdfIndirectReference getShadingReference()
	{
		if(shadingReference == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #240 <Field PdfIndirectReference shadingReference>
	//*   2    4:ifnonnull       18
			shadingReference = writer.getPdfIndirectReference();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field PdfWriter writer>
	//    6   12:invokevirtual   #243 <Method PdfIndirectReference PdfWriter.getPdfIndirectReference()>
	//    7   15:putfield        #240 <Field PdfIndirectReference shadingReference>
		return shadingReference;
	//    8   18:aload_0         
	//    9   19:getfield        #240 <Field PdfIndirectReference shadingReference>
	//   10   22:areturn         
	}

	PdfWriter getWriter()
	{
		return writer;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field PdfWriter writer>
	//    2    4:areturn         
	}

	public boolean isAntiAlias()
	{
		return antiAlias;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field boolean antiAlias>
	//    2    4:ireturn         
	}

	public void setAntiAlias(boolean flag)
	{
		antiAlias = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #29  <Field boolean antiAlias>
	//    3    5:return          
	}

	public void setBBox(float af[])
	{
		if(af.length != 4)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:iconst_4        
	//*   3    3:icmpeq          23
		{
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("bbox.must.be.a.4.element.array", new Object[0]));
	//    4    6:new             #42  <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:ldc1            #252 <String "bbox.must.be.a.4.element.array">
	//    7   12:iconst_0        
	//    8   13:anewarray       Object[]
	//    9   16:invokestatic    #50  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   10   19:invokespecial   #53  <Method void IllegalArgumentException(String)>
	//   11   22:athrow          
		} else
		{
			bBox = af;
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:putfield        #210 <Field float[] bBox>
			return;
	//   15   28:return          
		}
	}

	protected void setColorSpace(BaseColor basecolor)
	{
		cspace = basecolor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #234 <Field BaseColor cspace>
		ExtendedColor.getType(basecolor);
	//    3    5:aload_1         
	//    4    6:invokestatic    #40  <Method int ExtendedColor.getType(BaseColor)>
		JVM INSTR tableswitch 1 6: default 48
	//	               1 64
	//	               2 71
	//	               3 78
	//	               4 140
	//	               5 140
	//	               6 109;
	//    5    9:tableswitch     1 6: default 48
	//	               1 64
	//	               2 71
	//	               3 78
	//	               4 140
	//	               5 140
	//	               6 109
		   goto _L1 _L2 _L3 _L4 _L5 _L5 _L6
_L1:
		basecolor = ((BaseColor) (PdfName.DEVICERGB));
	//    6   48:getstatic       #255 <Field PdfName PdfName.DEVICERGB>
	//    7   51:astore_1        
_L7:
		shading.put(PdfName.COLORSPACE, ((PdfObject) (basecolor)));
	//    8   52:aload_0         
	//    9   53:getfield        #145 <Field PdfDictionary shading>
	//   10   56:getstatic       #258 <Field PdfName PdfName.COLORSPACE>
	//   11   59:aload_1         
	//   12   60:invokevirtual   #161 <Method void PdfDictionary.put(PdfName, PdfObject)>
		return;
	//   13   63:return          
_L2:
		basecolor = ((BaseColor) (PdfName.DEVICEGRAY));
	//   14   64:getstatic       #261 <Field PdfName PdfName.DEVICEGRAY>
	//   15   67:astore_1        
		continue; /* Loop/switch isn't completed */
	//   16   68:goto            52
_L3:
		basecolor = ((BaseColor) (PdfName.DEVICECMYK));
	//   17   71:getstatic       #264 <Field PdfName PdfName.DEVICECMYK>
	//   18   74:astore_1        
		continue; /* Loop/switch isn't completed */
	//   19   75:goto            52
_L4:
		basecolor = ((BaseColor) ((SpotColor)basecolor));
	//   20   78:aload_1         
	//   21   79:checkcast       #55  <Class SpotColor>
	//   22   82:astore_1        
		colorDetails = writer.addSimple(((ICachedColorSpace) (((SpotColor) (basecolor)).getPdfSpotColor())));
	//   23   83:aload_0         
	//   24   84:aload_0         
	//   25   85:getfield        #31  <Field PdfWriter writer>
	//   26   88:aload_1         
	//   27   89:invokevirtual   #59  <Method PdfSpotColor SpotColor.getPdfSpotColor()>
	//   28   92:invokevirtual   #268 <Method ColorDetails PdfWriter.addSimple(ICachedColorSpace)>
	//   29   95:putfield        #230 <Field ColorDetails colorDetails>
		basecolor = ((BaseColor) (colorDetails.getIndirectReference()));
	//   30   98:aload_0         
	//   31   99:getfield        #230 <Field ColorDetails colorDetails>
	//   32  102:invokevirtual   #273 <Method PdfIndirectReference ColorDetails.getIndirectReference()>
	//   33  105:astore_1        
		continue; /* Loop/switch isn't completed */
	//   34  106:goto            52
_L6:
		basecolor = ((BaseColor) ((DeviceNColor)basecolor));
	//   35  109:aload_1         
	//   36  110:checkcast       #91  <Class DeviceNColor>
	//   37  113:astore_1        
		colorDetails = writer.addSimple(((ICachedColorSpace) (((DeviceNColor) (basecolor)).getPdfDeviceNColor())));
	//   38  114:aload_0         
	//   39  115:aload_0         
	//   40  116:getfield        #31  <Field PdfWriter writer>
	//   41  119:aload_1         
	//   42  120:invokevirtual   #277 <Method PdfDeviceNColor DeviceNColor.getPdfDeviceNColor()>
	//   43  123:invokevirtual   #268 <Method ColorDetails PdfWriter.addSimple(ICachedColorSpace)>
	//   44  126:putfield        #230 <Field ColorDetails colorDetails>
		basecolor = ((BaseColor) (colorDetails.getIndirectReference()));
	//   45  129:aload_0         
	//   46  130:getfield        #230 <Field ColorDetails colorDetails>
	//   47  133:invokevirtual   #273 <Method PdfIndirectReference ColorDetails.getIndirectReference()>
	//   48  136:astore_1        
		if(true) goto _L7; else goto _L5
	//   49  137:goto            52
_L5:
		throwColorSpaceError();
	//   50  140:invokestatic    #64  <Method void throwColorSpaceError()>
		if(true) goto _L1; else goto _L8
	//   51  143:goto            48
_L8:
	}

	void setName(int i)
	{
		shadingName = new PdfName((new StringBuilder()).append("Sh").append(i).toString());
	//    0    0:aload_0         
	//    1    1:new             #149 <Class PdfName>
	//    2    4:dup             
	//    3    5:new             #280 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #281 <Method void StringBuilder()>
	//    6   12:ldc2            #283 <String "Sh">
	//    7   15:invokevirtual   #287 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:iload_1         
	//    9   19:invokevirtual   #290 <Method StringBuilder StringBuilder.append(int)>
	//   10   22:invokevirtual   #294 <Method String StringBuilder.toString()>
	//   11   25:invokespecial   #295 <Method void PdfName(String)>
	//   12   28:putfield        #238 <Field PdfName shadingName>
	//   13   31:return          
	}

	protected boolean antiAlias;
	protected float bBox[];
	protected ColorDetails colorDetails;
	private BaseColor cspace;
	protected PdfDictionary shading;
	protected PdfName shadingName;
	protected PdfIndirectReference shadingReference;
	protected int shadingType;
	protected PdfWriter writer;
}
