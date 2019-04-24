// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.tools;

import android.graphics.*;
import android.text.TextPaint;
import java.nio.ByteBuffer;

public class TextTextureGenerator
{

	public TextTextureGenerator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		textFontsize = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #32  <Field int textFontsize>
		textFontsizeTrue = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #34  <Field int textFontsizeTrue>
		baseLine = 0.0F;
	//    8   14:aload_0         
	//    9   15:fconst_0        
	//   10   16:putfield        #36  <Field float baseLine>
		startX = 0.0F;
	//   11   19:aload_0         
	//   12   20:fconst_0        
	//   13   21:putfield        #38  <Field float startX>
		textPaint = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #40  <Field Paint textPaint>
		createTextParam();
	//   17   29:aload_0         
	//   18   30:invokespecial   #43  <Method void createTextParam()>
	//   19   33:return          
	}

	private void createTextParam()
	{
		float f;
		float f1;
		float f2;
		float f4;
		textFontsizeTrue = textFontsize - 2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #32  <Field int textFontsize>
	//    3    5:iconst_2        
	//    4    6:isub            
	//    5    7:putfield        #34  <Field int textFontsizeTrue>
		textPaint = newPaint(((String) (null)), textFontsizeTrue, 49);
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:aload_0         
	//    9   13:getfield        #34  <Field int textFontsizeTrue>
	//   10   16:bipush          49
	//   11   18:invokestatic    #50  <Method Paint newPaint(String, int, int)>
	//   12   21:putfield        #40  <Field Paint textPaint>
		f4 = (float)(textFontsize - textFontsizeTrue) / 2.0F;
	//   13   24:aload_0         
	//   14   25:getfield        #32  <Field int textFontsize>
	//   15   28:aload_0         
	//   16   29:getfield        #34  <Field int textFontsizeTrue>
	//   17   32:isub            
	//   18   33:i2f             
	//   19   34:fconst_2        
	//   20   35:fdiv            
	//   21   36:fstore          5
		startX = f4;
	//   22   38:aload_0         
	//   23   39:fload           5
	//   24   41:putfield        #38  <Field float startX>
		f1 = 7.324219F;
	//   25   44:ldc1            #51  <Float 7.324219F>
	//   26   46:fstore_2        
		f2 = -27.83203F;
	//   27   47:ldc1            #52  <Float -27.83203F>
	//   28   49:fstore_3        
		f = f1;
	//   29   50:fload_2         
	//   30   51:fstore_1        
		android.graphics.Paint.FontMetrics fontmetrics = textPaint.getFontMetrics();
	//   31   52:aload_0         
	//   32   53:getfield        #40  <Field Paint textPaint>
	//   33   56:invokevirtual   #58  <Method android.graphics.Paint$FontMetrics Paint.getFontMetrics()>
	//   34   59:astore          6
		f = f1;
	//   35   61:fload_2         
	//   36   62:fstore_1        
		f1 = fontmetrics.descent;
	//   37   63:aload           6
	//   38   65:getfield        #63  <Field float android.graphics.Paint$FontMetrics.descent>
	//   39   68:fstore_2        
		f = f1;
	//   40   69:fload_2         
	//   41   70:fstore_1        
		float f3 = fontmetrics.ascent;
	//   42   71:aload           6
	//   43   73:getfield        #66  <Field float android.graphics.Paint$FontMetrics.ascent>
	//   44   76:fstore          4
		f = f3;
	//   45   78:fload           4
	//   46   80:fstore_1        
		f2 = f;
	//   47   81:fload_1         
	//   48   82:fstore_3        
		break MISSING_BLOCK_LABEL_90;
	//   49   83:goto            90
		Exception exception;
		exception;
	//   50   86:astore          6
		f1 = f;
	//   51   88:fload_1         
	//   52   89:fstore_2        
		baseLine = ((float)textFontsizeTrue - (f1 + f2)) / 2.0F + f4 + 0.5F;
	//   53   90:aload_0         
	//   54   91:aload_0         
	//   55   92:getfield        #34  <Field int textFontsizeTrue>
	//   56   95:i2f             
	//   57   96:fload_2         
	//   58   97:fload_3         
	//   59   98:fadd            
	//   60   99:fsub            
	//   61  100:fconst_2        
	//   62  101:fdiv            
	//   63  102:fload           5
	//   64  104:fadd            
	//   65  105:ldc1            #67  <Float 0.5F>
	//   66  107:fadd            
	//   67  108:putfield        #36  <Field float baseLine>
		return;
	//   68  111:return          
	}

	public static float getFontHeight(Paint paint)
	{
		paint = ((Paint) (paint.getFontMetrics()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #58  <Method android.graphics.Paint$FontMetrics Paint.getFontMetrics()>
	//    2    4:astore_0        
		return ((android.graphics.Paint.FontMetrics) (paint)).descent - ((android.graphics.Paint.FontMetrics) (paint)).ascent;
	//    3    5:aload_0         
	//    4    6:getfield        #63  <Field float android.graphics.Paint$FontMetrics.descent>
	//    5    9:aload_0         
	//    6   10:getfield        #66  <Field float android.graphics.Paint$FontMetrics.ascent>
	//    7   13:fsub            
	//    8   14:freturn         
	}

	public static float getFontlength(Paint paint, String s)
	{
		return paint.measureText(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #75  <Method float Paint.measureText(String)>
	//    3    5:freturn         
	}

	public static int getNearstSize2N(int i)
	{
		int j = 1;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		do
		{
			if(i <= j)
	//*   2    2:iload_0         
	//*   3    3:iload_1         
	//*   4    4:icmpgt          9
				return j;
	//    5    7:iload_1         
	//    6    8:ireturn         
			j *= 2;
	//    7    9:iload_1         
	//    8   10:iconst_2        
	//    9   11:imul            
	//   10   12:istore_1        
		} while(true);
	//   11   13:goto            2
	}

	private static Paint newPaint(String s, int i, int j)
	{
		s = ((String) (new TextPaint()));
	//    0    0:new             #79  <Class TextPaint>
	//    1    3:dup             
	//    2    4:invokespecial   #80  <Method void TextPaint()>
	//    3    7:astore_0        
		((TextPaint) (s)).setColor(-1);
	//    4    8:aload_0         
	//    5    9:iconst_m1       
	//    6   10:invokevirtual   #84  <Method void TextPaint.setColor(int)>
		((TextPaint) (s)).setTextSize(i);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:i2f             
	//   10   16:invokevirtual   #88  <Method void TextPaint.setTextSize(float)>
		((TextPaint) (s)).setAntiAlias(true);
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:invokevirtual   #92  <Method void TextPaint.setAntiAlias(boolean)>
		((TextPaint) (s)).setFilterBitmap(true);
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:invokevirtual   #95  <Method void TextPaint.setFilterBitmap(boolean)>
		((TextPaint) (s)).setTypeface(Typeface.DEFAULT);
	//   17   29:aload_0         
	//   18   30:getstatic       #101 <Field Typeface Typeface.DEFAULT>
	//   19   33:invokevirtual   #105 <Method Typeface TextPaint.setTypeface(Typeface)>
	//   20   36:pop             
		switch(j)
	//*  21   37:iload_2         
		{
	//*  22   38:tableswitch     49 51: default 64
	//	               49 76
	//	               50 85
	//	               51 67
	//*  23   64:goto            94
		case 51: // '3'
			((TextPaint) (s)).setTextAlign(android.graphics.Paint.Align.CENTER);
	//   24   67:aload_0         
	//   25   68:getstatic       #111 <Field android.graphics.Paint$Align android.graphics.Paint$Align.CENTER>
	//   26   71:invokevirtual   #115 <Method void TextPaint.setTextAlign(android.graphics.Paint$Align)>
			return ((Paint) (s));
	//   27   74:aload_0         
	//   28   75:areturn         

		case 49: // '1'
			((TextPaint) (s)).setTextAlign(android.graphics.Paint.Align.LEFT);
	//   29   76:aload_0         
	//   30   77:getstatic       #118 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//   31   80:invokevirtual   #115 <Method void TextPaint.setTextAlign(android.graphics.Paint$Align)>
			return ((Paint) (s));
	//   32   83:aload_0         
	//   33   84:areturn         

		case 50: // '2'
			((TextPaint) (s)).setTextAlign(android.graphics.Paint.Align.RIGHT);
	//   34   85:aload_0         
	//   35   86:getstatic       #121 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//   36   89:invokevirtual   #115 <Method void TextPaint.setTextAlign(android.graphics.Paint$Align)>
			return ((Paint) (s));
	//   37   92:aload_0         
	//   38   93:areturn         
		}
		((TextPaint) (s)).setTextAlign(android.graphics.Paint.Align.LEFT);
	//   39   94:aload_0         
	//   40   95:getstatic       #118 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//   41   98:invokevirtual   #115 <Method void TextPaint.setTextAlign(android.graphics.Paint$Align)>
		return ((Paint) (s));
	//   42  101:aload_0         
	//   43  102:areturn         
	}

	public byte[] getCharsWidths(int ai[])
	{
		int j = ai.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		byte abyte0[] = new byte[j];
	//    3    3:iload_3         
	//    4    4:newarray        byte[]
	//    5    6:astore          4
		float af[] = new float[1];
	//    6    8:iconst_1        
	//    7    9:newarray        float[]
	//    8   11:astore          5
		for(int i = 0; i < j; i++)
	//*   9   13:iconst_0        
	//*  10   14:istore_2        
	//*  11   15:iload_2         
	//*  12   16:iload_3         
	//*  13   17:icmpge          81
		{
			af[0] = textPaint.measureText((new StringBuilder()).append((char)ai[i]).append("").toString());
	//   14   20:aload           5
	//   15   22:iconst_0        
	//   16   23:aload_0         
	//   17   24:getfield        #40  <Field Paint textPaint>
	//   18   27:new             #125 <Class StringBuilder>
	//   19   30:dup             
	//   20   31:invokespecial   #126 <Method void StringBuilder()>
	//   21   34:aload_1         
	//   22   35:iload_2         
	//   23   36:iaload          
	//   24   37:int2char        
	//   25   38:invokevirtual   #130 <Method StringBuilder StringBuilder.append(char)>
	//   26   41:ldc1            #132 <String "">
	//   27   43:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   28   46:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   29   49:invokevirtual   #75  <Method float Paint.measureText(String)>
	//   30   52:fastore         
			abyte0[i] = (byte)(int)(af[0] + (float)(textFontsize - textFontsizeTrue));
	//   31   53:aload           4
	//   32   55:iload_2         
	//   33   56:aload           5
	//   34   58:iconst_0        
	//   35   59:faload          
	//   36   60:aload_0         
	//   37   61:getfield        #32  <Field int textFontsize>
	//   38   64:aload_0         
	//   39   65:getfield        #34  <Field int textFontsizeTrue>
	//   40   68:isub            
	//   41   69:i2f             
	//   42   70:fadd            
	//   43   71:f2i             
	//   44   72:int2byte        
	//   45   73:bastore         
		}

	//   46   74:iload_2         
	//   47   75:iconst_1        
	//   48   76:iadd            
	//   49   77:istore_2        
	//*  50   78:goto            15
		return abyte0;
	//   51   81:aload           4
	//   52   83:areturn         
	}

	public byte[] getTextPixelBuffer(int i, int j)
	{
		if(textFontsize != j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field int textFontsize>
	//*   2    4:iload_2         
	//*   3    5:icmpeq          17
		{
			textFontsize = j;
	//    4    8:aload_0         
	//    5    9:iload_2         
	//    6   10:putfield        #32  <Field int textFontsize>
			createTextParam();
	//    7   13:aload_0         
	//    8   14:invokespecial   #43  <Method void createTextParam()>
		}
		char ac[] = new char[1];
	//    9   17:iconst_1        
	//   10   18:newarray        char[]
	//   11   20:astore          6
		ac[0] = (char)i;
	//   12   22:aload           6
	//   13   24:iconst_0        
	//   14   25:iload_1         
	//   15   26:int2char        
	//   16   27:castore         
		float f1;
		float f2;
		Bitmap bitmap;
		Canvas canvas;
		byte abyte0[];
		ByteBuffer bytebuffer;
		f1 = baseLine;
	//   17   28:aload_0         
	//   18   29:getfield        #36  <Field float baseLine>
	//   19   32:fstore          4
		bitmap = Bitmap.createBitmap(textFontsize, textFontsize, android.graphics.Bitmap.Config.ALPHA_8);
	//   20   34:aload_0         
	//   21   35:getfield        #32  <Field int textFontsize>
	//   22   38:aload_0         
	//   23   39:getfield        #32  <Field int textFontsize>
	//   24   42:getstatic       #149 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ALPHA_8>
	//   25   45:invokestatic    #155 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   26   48:astore          7
		canvas = new Canvas(bitmap);
	//   27   50:new             #157 <Class Canvas>
	//   28   53:dup             
	//   29   54:aload           7
	//   30   56:invokespecial   #160 <Method void Canvas(Bitmap)>
	//   31   59:astore          8
		abyte0 = new byte[textFontsize * textFontsize];
	//   32   61:aload_0         
	//   33   62:getfield        #32  <Field int textFontsize>
	//   34   65:aload_0         
	//   35   66:getfield        #32  <Field int textFontsize>
	//   36   69:imul            
	//   37   70:newarray        byte[]
	//   38   72:astore          9
		bytebuffer = ByteBuffer.wrap(abyte0);
	//   39   74:aload           9
	//   40   76:invokestatic    #166 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   41   79:astore          10
		f2 = textPaint.measureText(String.valueOf((char)i));
	//   42   81:aload_0         
	//   43   82:getfield        #40  <Field Paint textPaint>
	//   44   85:iload_1         
	//   45   86:int2char        
	//   46   87:invokestatic    #172 <Method String String.valueOf(char)>
	//   47   90:invokevirtual   #75  <Method float Paint.measureText(String)>
	//   48   93:fstore          5
		float f;
		f = f1;
	//   49   95:fload           4
	//   50   97:fstore_3        
		if(ac[0] > 0)
	//*  51   98:aload           6
	//*  52  100:iconst_0        
	//*  53  101:caload          
	//*  54  102:ifle            124
		{
			f = f1;
	//   55  105:fload           4
	//   56  107:fstore_3        
			if(ac[0] < '\u0100')
	//*  57  108:aload           6
	//*  58  110:iconst_0        
	//*  59  111:caload          
	//*  60  112:sipush          256
	//*  61  115:icmpge          124
				f = f1 - 1.5F;
	//   62  118:fload           4
	//   63  120:ldc1            #173 <Float 1.5F>
	//   64  122:fsub            
	//   65  123:fstore_3        
		}
		android.graphics.Paint.Align align;
		align = textPaint.getTextAlign();
	//   66  124:aload_0         
	//   67  125:getfield        #40  <Field Paint textPaint>
	//   68  128:invokevirtual   #177 <Method android.graphics.Paint$Align Paint.getTextAlign()>
	//   69  131:astore          11
		f1 = f2 - (float)textFontsizeTrue;
	//   70  133:fload           5
	//   71  135:aload_0         
	//   72  136:getfield        #34  <Field int textFontsizeTrue>
	//   73  139:i2f             
	//   74  140:fsub            
	//   75  141:fstore          4
		if(align == android.graphics.Paint.Align.CENTER || f1 < 4F) goto _L2; else goto _L1
	//   76  143:aload           11
	//   77  145:getstatic       #111 <Field android.graphics.Paint$Align android.graphics.Paint$Align.CENTER>
	//   78  148:if_acmpeq       220
	//   79  151:fload           4
	//   80  153:ldc1            #178 <Float 4F>
	//   81  155:fcmpl           
	//   82  156:iflt            220
_L1:
		try
		{
			textPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
	//   83  159:aload_0         
	//   84  160:getfield        #40  <Field Paint textPaint>
	//   85  163:getstatic       #111 <Field android.graphics.Paint$Align android.graphics.Paint$Align.CENTER>
	//   86  166:invokevirtual   #179 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
			textPaint.setTextSize((float)textFontsizeTrue - f1);
	//   87  169:aload_0         
	//   88  170:getfield        #40  <Field Paint textPaint>
	//   89  173:aload_0         
	//   90  174:getfield        #34  <Field int textFontsizeTrue>
	//   91  177:i2f             
	//   92  178:fload           4
	//   93  180:fsub            
	//   94  181:invokevirtual   #180 <Method void Paint.setTextSize(float)>
			canvas.drawText(ac, 0, 1, ((float)textFontsizeTrue - f1) / 2.0F, f, textPaint);
	//   95  184:aload           8
	//   96  186:aload           6
	//   97  188:iconst_0        
	//   98  189:iconst_1        
	//   99  190:aload_0         
	//  100  191:getfield        #34  <Field int textFontsizeTrue>
	//  101  194:i2f             
	//  102  195:fload           4
	//  103  197:fsub            
	//  104  198:fconst_2        
	//  105  199:fdiv            
	//  106  200:fload_3         
	//  107  201:aload_0         
	//  108  202:getfield        #40  <Field Paint textPaint>
	//  109  205:invokevirtual   #184 <Method void Canvas.drawText(char[], int, int, float, float, Paint)>
			textPaint.setTextAlign(align);
	//  110  208:aload_0         
	//  111  209:getfield        #40  <Field Paint textPaint>
	//  112  212:aload           11
	//  113  214:invokevirtual   #179 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
			break MISSING_BLOCK_LABEL_238;
	//  114  217:goto            238
		}
	//* 115  220:aload           8
	//* 116  222:aload           6
	//* 117  224:iconst_0        
	//* 118  225:iconst_1        
	//* 119  226:aload_0         
	//* 120  227:getfield        #38  <Field float startX>
	//* 121  230:fload_3         
	//* 122  231:aload_0         
	//* 123  232:getfield        #40  <Field Paint textPaint>
	//* 124  235:invokevirtual   #184 <Method void Canvas.drawText(char[], int, int, float, float, Paint)>
	//* 125  238:aload           7
	//* 126  240:aload           10
	//* 127  242:invokevirtual   #188 <Method void Bitmap.copyPixelsToBuffer(java.nio.Buffer)>
	//* 128  245:aload           7
	//* 129  247:invokevirtual   #191 <Method void Bitmap.recycle()>
	//* 130  250:aload           9
	//* 131  252:areturn         
		catch(OutOfMemoryError outofmemoryerror)
	//* 132  253:astore          6
		{
			break MISSING_BLOCK_LABEL_260;
	//  133  255:goto            260
		}
		catch(Exception exception) { }
	//  134  258:astore          6
		  goto _L3
_L2:
		canvas.drawText(ac, 0, 1, startX, f, textPaint);
		bitmap.copyPixelsToBuffer(((java.nio.Buffer) (bytebuffer)));
		bitmap.recycle();
		return abyte0;
_L3:
		return null;
	//  135  260:aconst_null     
	//  136  261:areturn         
	}

	private static final int ALIGNCENTER = 51;
	private static final int ALIGNLEFT = 49;
	private static final int ALIGNRIGHT = 50;
	static final int AN_LABEL_MAXCHARINLINE = 7;
	static final int AN_LABEL_MULITYLINE_SPAN = 2;
	public static final int CHAR_MAX = 256;
	public static final int MIN_DIFF_SIZE = 4;
	private float baseLine;
	private float startX;
	private int textFontsize;
	private int textFontsizeTrue;
	private Paint textPaint;
}
