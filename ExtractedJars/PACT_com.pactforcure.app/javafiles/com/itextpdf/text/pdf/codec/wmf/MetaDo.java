// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec.wmf;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.codec.BmpImage;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.codec.wmf:
//			MetaState, InputMeta, MetaPen, MetaBrush, 
//			MetaFont, MetaObject, Point

public class MetaDo
{

	public MetaDo(InputStream inputstream, PdfContentByte pdfcontentbyte)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #157 <Method void Object()>
		state = new MetaState();
	//    2    4:aload_0         
	//    3    5:new             #159 <Class MetaState>
	//    4    8:dup             
	//    5    9:invokespecial   #160 <Method void MetaState()>
	//    6   12:putfield        #162 <Field MetaState state>
		cb = pdfcontentbyte;
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:putfield        #164 <Field PdfContentByte cb>
		in = new InputMeta(inputstream);
	//   10   20:aload_0         
	//   11   21:new             #166 <Class InputMeta>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #169 <Method void InputMeta(InputStream)>
	//   15   29:putfield        #171 <Field InputMeta in>
	//   16   32:return          
	}

	static double getArc(double d, double d1, double d2, double d3)
	{
		d1 = Math.atan2(d3 - d1, d2 - d);
	//    0    0:dload           6
	//    1    2:dload_2         
	//    2    3:dsub            
	//    3    4:dload           4
	//    4    6:dload_0         
	//    5    7:dsub            
	//    6    8:invokestatic    #180 <Method double Math.atan2(double, double)>
	//    7   11:dstore_2        
		d = d1;
	//    8   12:dload_2         
	//    9   13:dstore_0        
		if(d1 < 0.0D)
	//*  10   14:dload_2         
	//*  11   15:dconst_0        
	//*  12   16:dcmpg           
	//*  13   17:ifge            26
			d = d1 + 6.2831853071795862D;
	//   14   20:dload_2         
	//   15   21:ldc2w           #181 <Double 6.2831853071795862D>
	//   16   24:dadd            
	//   17   25:dstore_0        
		return (double)(float)((d / 3.1415926535897931D) * 180D);
	//   18   26:dload_0         
	//   19   27:ldc2w           #183 <Double 3.1415926535897931D>
	//   20   30:ddiv            
	//   21   31:ldc2w           #185 <Double 180D>
	//   22   34:dmul            
	//   23   35:d2f             
	//   24   36:f2d             
	//   25   37:dreturn         
	}

	static float getArc(float f, float f1, float f2, float f3)
	{
		return (float)getArc(f, f1, f2, f3);
	//    0    0:fload_0         
	//    1    1:f2d             
	//    2    2:fload_1         
	//    3    3:f2d             
	//    4    4:fload_2         
	//    5    5:f2d             
	//    6    6:fload_3         
	//    7    7:f2d             
	//    8    8:invokestatic    #189 <Method double getArc(double, double, double, double)>
	//    9   11:d2f             
	//   10   12:freturn         
	}

	public static byte[] wrapBMP(Image image)
		throws IOException
	{
		if(image.getOriginalType() != 4)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #199 <Method int Image.getOriginalType()>
	//*   2    4:iconst_4        
	//*   3    5:icmpeq          25
			throw new IOException(MessageLocalization.getComposedMessage("only.bmp.can.be.wrapped.in.wmf", new Object[0]));
	//    4    8:new             #193 <Class IOException>
	//    5   11:dup             
	//    6   12:ldc1            #201 <String "only.bmp.can.be.wrapped.in.wmf">
	//    7   14:iconst_0        
	//    8   15:anewarray       Object[]
	//    9   18:invokestatic    #207 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   10   21:invokespecial   #210 <Method void IOException(String)>
	//   11   24:athrow          
		int j;
		byte abyte0[];
		ByteArrayOutputStream bytearrayoutputstream1;
		if(image.getOriginalData() == null)
	//*  12   25:aload_0         
	//*  13   26:invokevirtual   #214 <Method byte[] Image.getOriginalData()>
	//*  14   29:ifnonnull       331
		{
			InputStream inputstream = image.getUrl().openStream();
	//   15   32:aload_0         
	//   16   33:invokevirtual   #218 <Method URL Image.getUrl()>
	//   17   36:invokevirtual   #224 <Method InputStream URL.openStream()>
	//   18   39:astore_2        
			ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//   19   40:new             #226 <Class ByteArrayOutputStream>
	//   20   43:dup             
	//   21   44:invokespecial   #227 <Method void ByteArrayOutputStream()>
	//   22   47:astore_3        
			do
			{
				int i = inputstream.read();
	//   23   48:aload_2         
	//   24   49:invokevirtual   #232 <Method int InputStream.read()>
	//   25   52:istore_1        
				if(i == -1)
					break;
	//   26   53:iload_1         
	//   27   54:iconst_m1       
	//   28   55:icmpeq          66
				bytearrayoutputstream.write(i);
	//   29   58:aload_3         
	//   30   59:iload_1         
	//   31   60:invokevirtual   #236 <Method void ByteArrayOutputStream.write(int)>
			} while(true);
	//   32   63:goto            48
			inputstream.close();
	//   33   66:aload_2         
	//   34   67:invokevirtual   #239 <Method void InputStream.close()>
			abyte0 = bytearrayoutputstream.toByteArray();
	//   35   70:aload_3         
	//   36   71:invokevirtual   #242 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   37   74:astore_2        
		} else
	//*  38   75:aload_2         
	//*  39   76:arraylength     
	//*  40   77:bipush          14
	//*  41   79:isub            
	//*  42   80:iconst_1        
	//*  43   81:iadd            
	//*  44   82:iconst_1        
	//*  45   83:iushr           
	//*  46   84:istore_1        
	//*  47   85:new             #226 <Class ByteArrayOutputStream>
	//*  48   88:dup             
	//*  49   89:invokespecial   #227 <Method void ByteArrayOutputStream()>
	//*  50   92:astore_3        
	//*  51   93:aload_3         
	//*  52   94:iconst_1        
	//*  53   95:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//*  54   98:aload_3         
	//*  55   99:bipush          9
	//*  56  101:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//*  57  104:aload_3         
	//*  58  105:sipush          768
	//*  59  108:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//*  60  111:aload_3         
	//*  61  112:iload_1         
	//*  62  113:bipush          36
	//*  63  115:iadd            
	//*  64  116:iconst_3        
	//*  65  117:iadd            
	//*  66  118:invokestatic    #249 <Method void writeDWord(OutputStream, int)>
	//*  67  121:aload_3         
	//*  68  122:iconst_1        
	//*  69  123:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//*  70  126:aload_3         
	//*  71  127:iload_1         
	//*  72  128:bipush          14
	//*  73  130:iadd            
	//*  74  131:invokestatic    #249 <Method void writeDWord(OutputStream, int)>
	//*  75  134:aload_3         
	//*  76  135:iconst_0        
	//*  77  136:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//*  78  139:aload_3         
	//*  79  140:iconst_4        
	//*  80  141:invokestatic    #249 <Method void writeDWord(OutputStream, int)>
	//*  81  144:aload_3         
	//*  82  145:sipush          259
	//*  83  148:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//*  84  151:aload_3         
	//*  85  152:bipush          8
	//*  86  154:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//*  87  157:aload_3         
	//*  88  158:iconst_5        
	//*  89  159:invokestatic    #249 <Method void writeDWord(OutputStream, int)>
	//*  90  162:aload_3         
	//*  91  163:sipush          523
	//*  92  166:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//*  93  169:aload_3         
	//*  94  170:iconst_0        
	//*  95  171:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//*  96  174:aload_3         
	//*  97  175:iconst_0        
	//*  98  176:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//*  99  179:aload_3         
	//* 100  180:iconst_5        
	//* 101  181:invokestatic    #249 <Method void writeDWord(OutputStream, int)>
	//* 102  184:aload_3         
	//* 103  185:sipush          524
	//* 104  188:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//* 105  191:aload_3         
	//* 106  192:aload_0         
	//* 107  193:invokevirtual   #253 <Method float Image.getHeight()>
	//* 108  196:f2i             
	//* 109  197:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//* 110  200:aload_3         
	//* 111  201:aload_0         
	//* 112  202:invokevirtual   #256 <Method float Image.getWidth()>
	//* 113  205:f2i             
	//* 114  206:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//* 115  209:aload_3         
	//* 116  210:iload_1         
	//* 117  211:bipush          13
	//* 118  213:iadd            
	//* 119  214:invokestatic    #249 <Method void writeDWord(OutputStream, int)>
	//* 120  217:aload_3         
	//* 121  218:sipush          2881
	//* 122  221:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//* 123  224:aload_3         
	//* 124  225:ldc2            #257 <Int 0xcc0020>
	//* 125  228:invokestatic    #249 <Method void writeDWord(OutputStream, int)>
	//* 126  231:aload_3         
	//* 127  232:aload_0         
	//* 128  233:invokevirtual   #253 <Method float Image.getHeight()>
	//* 129  236:f2i             
	//* 130  237:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//* 131  240:aload_3         
	//* 132  241:aload_0         
	//* 133  242:invokevirtual   #256 <Method float Image.getWidth()>
	//* 134  245:f2i             
	//* 135  246:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//* 136  249:aload_3         
	//* 137  250:iconst_0        
	//* 138  251:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//* 139  254:aload_3         
	//* 140  255:iconst_0        
	//* 141  256:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//* 142  259:aload_3         
	//* 143  260:aload_0         
	//* 144  261:invokevirtual   #253 <Method float Image.getHeight()>
	//* 145  264:f2i             
	//* 146  265:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//* 147  268:aload_3         
	//* 148  269:aload_0         
	//* 149  270:invokevirtual   #256 <Method float Image.getWidth()>
	//* 150  273:f2i             
	//* 151  274:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//* 152  277:aload_3         
	//* 153  278:iconst_0        
	//* 154  279:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//* 155  282:aload_3         
	//* 156  283:iconst_0        
	//* 157  284:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//* 158  287:aload_3         
	//* 159  288:aload_2         
	//* 160  289:bipush          14
	//* 161  291:aload_2         
	//* 162  292:arraylength     
	//* 163  293:bipush          14
	//* 164  295:isub            
	//* 165  296:invokevirtual   #260 <Method void ByteArrayOutputStream.write(byte[], int, int)>
	//* 166  299:aload_2         
	//* 167  300:arraylength     
	//* 168  301:iconst_1        
	//* 169  302:iand            
	//* 170  303:iconst_1        
	//* 171  304:icmpne          312
	//* 172  307:aload_3         
	//* 173  308:iconst_0        
	//* 174  309:invokevirtual   #236 <Method void ByteArrayOutputStream.write(int)>
	//* 175  312:aload_3         
	//* 176  313:iconst_3        
	//* 177  314:invokestatic    #249 <Method void writeDWord(OutputStream, int)>
	//* 178  317:aload_3         
	//* 179  318:iconst_0        
	//* 180  319:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//* 181  322:aload_3         
	//* 182  323:invokevirtual   #261 <Method void ByteArrayOutputStream.close()>
	//* 183  326:aload_3         
	//* 184  327:invokevirtual   #242 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//* 185  330:areturn         
		{
			abyte0 = image.getOriginalData();
	//  186  331:aload_0         
	//  187  332:invokevirtual   #214 <Method byte[] Image.getOriginalData()>
	//  188  335:astore_2        
		}
		j = (abyte0.length - 14) + 1 >>> 1;
		bytearrayoutputstream1 = new ByteArrayOutputStream();
		writeWord(((OutputStream) (bytearrayoutputstream1)), 1);
		writeWord(((OutputStream) (bytearrayoutputstream1)), 9);
		writeWord(((OutputStream) (bytearrayoutputstream1)), 768);
		writeDWord(((OutputStream) (bytearrayoutputstream1)), j + 36 + 3);
		writeWord(((OutputStream) (bytearrayoutputstream1)), 1);
		writeDWord(((OutputStream) (bytearrayoutputstream1)), j + 14);
		writeWord(((OutputStream) (bytearrayoutputstream1)), 0);
		writeDWord(((OutputStream) (bytearrayoutputstream1)), 4);
		writeWord(((OutputStream) (bytearrayoutputstream1)), 259);
		writeWord(((OutputStream) (bytearrayoutputstream1)), 8);
		writeDWord(((OutputStream) (bytearrayoutputstream1)), 5);
		writeWord(((OutputStream) (bytearrayoutputstream1)), 523);
		writeWord(((OutputStream) (bytearrayoutputstream1)), 0);
		writeWord(((OutputStream) (bytearrayoutputstream1)), 0);
		writeDWord(((OutputStream) (bytearrayoutputstream1)), 5);
		writeWord(((OutputStream) (bytearrayoutputstream1)), 524);
		writeWord(((OutputStream) (bytearrayoutputstream1)), (int)image.getHeight());
		writeWord(((OutputStream) (bytearrayoutputstream1)), (int)image.getWidth());
		writeDWord(((OutputStream) (bytearrayoutputstream1)), j + 13);
		writeWord(((OutputStream) (bytearrayoutputstream1)), 2881);
		writeDWord(((OutputStream) (bytearrayoutputstream1)), 0xcc0020);
		writeWord(((OutputStream) (bytearrayoutputstream1)), (int)image.getHeight());
		writeWord(((OutputStream) (bytearrayoutputstream1)), (int)image.getWidth());
		writeWord(((OutputStream) (bytearrayoutputstream1)), 0);
		writeWord(((OutputStream) (bytearrayoutputstream1)), 0);
		writeWord(((OutputStream) (bytearrayoutputstream1)), (int)image.getHeight());
		writeWord(((OutputStream) (bytearrayoutputstream1)), (int)image.getWidth());
		writeWord(((OutputStream) (bytearrayoutputstream1)), 0);
		writeWord(((OutputStream) (bytearrayoutputstream1)), 0);
		bytearrayoutputstream1.write(abyte0, 14, abyte0.length - 14);
		if((abyte0.length & 1) == 1)
			bytearrayoutputstream1.write(0);
		writeDWord(((OutputStream) (bytearrayoutputstream1)), 3);
		writeWord(((OutputStream) (bytearrayoutputstream1)), 0);
		bytearrayoutputstream1.close();
		return bytearrayoutputstream1.toByteArray();
	//* 189  336:goto            75
	}

	public static void writeDWord(OutputStream outputstream, int i)
		throws IOException
	{
		writeWord(outputstream, i & 0xffff);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ldc2            #263 <Int 65535>
	//    3    5:iand            
	//    4    6:invokestatic    #246 <Method void writeWord(OutputStream, int)>
		writeWord(outputstream, i >>> 16 & 0xffff);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:bipush          16
	//    8   13:iushr           
	//    9   14:ldc2            #263 <Int 65535>
	//   10   17:iand            
	//   11   18:invokestatic    #246 <Method void writeWord(OutputStream, int)>
	//   12   21:return          
	}

	public static void writeWord(OutputStream outputstream, int i)
		throws IOException
	{
		outputstream.write(i & 0xff);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:sipush          255
	//    3    5:iand            
	//    4    6:invokevirtual   #266 <Method void OutputStream.write(int)>
		outputstream.write(i >>> 8 & 0xff);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:bipush          8
	//    8   13:iushr           
	//    9   14:sipush          255
	//   10   17:iand            
	//   11   18:invokevirtual   #266 <Method void OutputStream.write(int)>
	//   12   21:return          
	}

	public boolean isNullStrokeFill(boolean flag)
	{
		boolean flag3;
label0:
		{
			MetaPen metapen = state.getCurrentPen();
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field MetaState state>
	//    2    4:invokevirtual   #272 <Method MetaPen MetaState.getCurrentPen()>
	//    3    7:astore          5
			MetaBrush metabrush = state.getCurrentBrush();
	//    4    9:aload_0         
	//    5   10:getfield        #162 <Field MetaState state>
	//    6   13:invokevirtual   #276 <Method MetaBrush MetaState.getCurrentBrush()>
	//    7   16:astore          6
			boolean flag1;
			int i;
			boolean flag2;
			if(metapen.getStyle() == 5)
	//*   8   18:aload           5
	//*   9   20:invokevirtual   #281 <Method int MetaPen.getStyle()>
	//*  10   23:iconst_5        
	//*  11   24:icmpne          90
				flag1 = true;
	//   12   27:iconst_1        
	//   13   28:istore_2        
			else
	//*  14   29:aload           6
	//*  15   31:invokevirtual   #284 <Method int MetaBrush.getStyle()>
	//*  16   34:istore_3        
	//*  17   35:iload_3         
	//*  18   36:ifeq            55
	//*  19   39:iload_3         
	//*  20   40:iconst_2        
	//*  21   41:icmpne          95
	//*  22   44:aload_0         
	//*  23   45:getfield        #162 <Field MetaState state>
	//*  24   48:invokevirtual   #287 <Method int MetaState.getBackgroundMode()>
	//*  25   51:iconst_2        
	//*  26   52:icmpne          95
	//*  27   55:iconst_1        
	//*  28   56:istore_3        
	//*  29   57:iload_2         
	//*  30   58:ifeq            100
	//*  31   61:iload_3         
	//*  32   62:ifne            100
	//*  33   65:iconst_1        
	//*  34   66:istore          4
	//*  35   68:iload_2         
	//*  36   69:ifne            87
	//*  37   72:iload_1         
	//*  38   73:ifeq            106
	//*  39   76:aload_0         
	//*  40   77:getfield        #162 <Field MetaState state>
	//*  41   80:aload_0         
	//*  42   81:getfield        #164 <Field PdfContentByte cb>
	//*  43   84:invokevirtual   #291 <Method void MetaState.setLineJoinRectangle(PdfContentByte)>
	//*  44   87:iload           4
	//*  45   89:ireturn         
				flag1 = false;
	//   46   90:iconst_0        
	//   47   91:istore_2        
			i = metabrush.getStyle();
			if(i == 0 || i == 2 && state.getBackgroundMode() == 2)
				flag2 = true;
			else
	//*  48   92:goto            29
				flag2 = false;
	//   49   95:iconst_0        
	//   50   96:istore_3        
			if(flag1 && !flag2)
				flag3 = true;
			else
	//*  51   97:goto            57
				flag3 = false;
	//   52  100:iconst_0        
	//   53  101:istore          4
			if(!flag1)
			{
				if(!flag)
					break label0;
				state.setLineJoinRectangle(cb);
			}
			return flag3;
		}
	//*  54  103:goto            68
		state.setLineJoinPolygon(cb);
	//   55  106:aload_0         
	//   56  107:getfield        #162 <Field MetaState state>
	//   57  110:aload_0         
	//   58  111:getfield        #164 <Field PdfContentByte cb>
	//   59  114:invokevirtual   #294 <Method void MetaState.setLineJoinPolygon(PdfContentByte)>
		return flag3;
	//   60  117:iload           4
	//   61  119:ireturn         
	}

	public void outputText(int i, int j, int k, int l, int i1, int j1, int k1, 
			String s)
	{
		MetaFont metafont = state.getCurrentFont();
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field MetaState state>
	//    2    4:invokevirtual   #300 <Method MetaFont MetaState.getCurrentFont()>
	//    3    7:astore          18
		float f1 = state.transformX(i);
	//    4    9:aload_0         
	//    5   10:getfield        #162 <Field MetaState state>
	//    6   13:iload_1         
	//    7   14:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//    8   17:fstore          10
		float f6 = state.transformY(j);
	//    9   19:aload_0         
	//   10   20:getfield        #162 <Field MetaState state>
	//   11   23:iload_2         
	//   12   24:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//   13   27:fstore          15
		float f = state.transformAngle(metafont.getAngle());
	//   14   29:aload_0         
	//   15   30:getfield        #162 <Field MetaState state>
	//   16   33:aload           18
	//   17   35:invokevirtual   #312 <Method float MetaFont.getAngle()>
	//   18   38:invokevirtual   #316 <Method float MetaState.transformAngle(float)>
	//   19   41:fstore          9
		float f7 = (float)Math.sin(f);
	//   20   43:fload           9
	//   21   45:f2d             
	//   22   46:invokestatic    #320 <Method double Math.sin(double)>
	//   23   49:d2f             
	//   24   50:fstore          16
		float f8 = (float)Math.cos(f);
	//   25   52:fload           9
	//   26   54:f2d             
	//   27   55:invokestatic    #323 <Method double Math.cos(double)>
	//   28   58:d2f             
	//   29   59:fstore          17
		float f2 = metafont.getFontSize(state);
	//   30   61:aload           18
	//   31   63:aload_0         
	//   32   64:getfield        #162 <Field MetaState state>
	//   33   67:invokevirtual   #327 <Method float MetaFont.getFontSize(MetaState)>
	//   34   70:fstore          11
		BaseFont basefont = metafont.getFont();
	//   35   72:aload           18
	//   36   74:invokevirtual   #331 <Method BaseFont MetaFont.getFont()>
	//   37   77:astore          19
		i = state.getTextAlign();
	//   38   79:aload_0         
	//   39   80:getfield        #162 <Field MetaState state>
	//   40   83:invokevirtual   #334 <Method int MetaState.getTextAlign()>
	//   41   86:istore_1        
		float f3 = basefont.getWidthPoint(s, f2);
	//   42   87:aload           19
	//   43   89:aload           8
	//   44   91:fload           11
	//   45   93:invokevirtual   #340 <Method float BaseFont.getWidthPoint(String, float)>
	//   46   96:fstore          12
		f = 0.0F;
	//   47   98:fconst_0        
	//   48   99:fstore          9
		float f4 = basefont.getFontDescriptor(3, f2);
	//   49  101:aload           19
	//   50  103:iconst_3        
	//   51  104:fload           11
	//   52  106:invokevirtual   #344 <Method float BaseFont.getFontDescriptor(int, float)>
	//   53  109:fstore          13
		float f5 = basefont.getFontDescriptor(8, f2);
	//   54  111:aload           19
	//   55  113:bipush          8
	//   56  115:fload           11
	//   57  117:invokevirtual   #344 <Method float BaseFont.getFontDescriptor(int, float)>
	//   58  120:fstore          14
		cb.saveState();
	//   59  122:aload_0         
	//   60  123:getfield        #164 <Field PdfContentByte cb>
	//   61  126:invokevirtual   #349 <Method void PdfContentByte.saveState()>
		cb.concatCTM(f8, f7, -f7, f8, f1, f6);
	//   62  129:aload_0         
	//   63  130:getfield        #164 <Field PdfContentByte cb>
	//   64  133:fload           17
	//   65  135:fload           16
	//   66  137:fload           16
	//   67  139:fneg            
	//   68  140:fload           17
	//   69  142:fload           10
	//   70  144:fload           15
	//   71  146:invokevirtual   #353 <Method void PdfContentByte.concatCTM(float, float, float, float, float, float)>
		com.itextpdf.text.BaseColor basecolor1;
		if((i & 6) == 6)
	//*  72  149:iload_1         
	//*  73  150:bipush          6
	//*  74  152:iand            
	//*  75  153:bipush          6
	//*  76  155:icmpne          387
			f = -f3 / 2.0F;
	//   77  158:fload           12
	//   78  160:fneg            
	//   79  161:fconst_2        
	//   80  162:fdiv            
	//   81  163:fstore          9
		else
	//*  82  165:iload_1         
	//*  83  166:bipush          24
	//*  84  168:iand            
	//*  85  169:bipush          24
	//*  86  171:icmpne          402
	//*  87  174:fconst_0        
	//*  88  175:fstore          10
	//*  89  177:aload_0         
	//*  90  178:getfield        #162 <Field MetaState state>
	//*  91  181:invokevirtual   #287 <Method int MetaState.getBackgroundMode()>
	//*  92  184:iconst_2        
	//*  93  185:icmpne          234
	//*  94  188:aload_0         
	//*  95  189:getfield        #162 <Field MetaState state>
	//*  96  192:invokevirtual   #357 <Method com.itextpdf.text.BaseColor MetaState.getCurrentBackgroundColor()>
	//*  97  195:astore          20
	//*  98  197:aload_0         
	//*  99  198:getfield        #164 <Field PdfContentByte cb>
	//* 100  201:aload           20
	//* 101  203:invokevirtual   #361 <Method void PdfContentByte.setColorFill(com.itextpdf.text.BaseColor)>
	//* 102  206:aload_0         
	//* 103  207:getfield        #164 <Field PdfContentByte cb>
	//* 104  210:fload           9
	//* 105  212:fload           10
	//* 106  214:fload           13
	//* 107  216:fadd            
	//* 108  217:fload           12
	//* 109  219:fload           14
	//* 110  221:fload           13
	//* 111  223:fsub            
	//* 112  224:invokevirtual   #365 <Method void PdfContentByte.rectangle(float, float, float, float)>
	//* 113  227:aload_0         
	//* 114  228:getfield        #164 <Field PdfContentByte cb>
	//* 115  231:invokevirtual   #368 <Method void PdfContentByte.fill()>
	//* 116  234:aload_0         
	//* 117  235:getfield        #162 <Field MetaState state>
	//* 118  238:invokevirtual   #371 <Method com.itextpdf.text.BaseColor MetaState.getCurrentTextColor()>
	//* 119  241:astore          20
	//* 120  243:aload_0         
	//* 121  244:getfield        #164 <Field PdfContentByte cb>
	//* 122  247:aload           20
	//* 123  249:invokevirtual   #361 <Method void PdfContentByte.setColorFill(com.itextpdf.text.BaseColor)>
	//* 124  252:aload_0         
	//* 125  253:getfield        #164 <Field PdfContentByte cb>
	//* 126  256:invokevirtual   #374 <Method void PdfContentByte.beginText()>
	//* 127  259:aload_0         
	//* 128  260:getfield        #164 <Field PdfContentByte cb>
	//* 129  263:aload           19
	//* 130  265:fload           11
	//* 131  267:invokevirtual   #378 <Method void PdfContentByte.setFontAndSize(BaseFont, float)>
	//* 132  270:aload_0         
	//* 133  271:getfield        #164 <Field PdfContentByte cb>
	//* 134  274:fload           9
	//* 135  276:fload           10
	//* 136  278:invokevirtual   #382 <Method void PdfContentByte.setTextMatrix(float, float)>
	//* 137  281:aload_0         
	//* 138  282:getfield        #164 <Field PdfContentByte cb>
	//* 139  285:aload           8
	//* 140  287:invokevirtual   #385 <Method void PdfContentByte.showText(String)>
	//* 141  290:aload_0         
	//* 142  291:getfield        #164 <Field PdfContentByte cb>
	//* 143  294:invokevirtual   #388 <Method void PdfContentByte.endText()>
	//* 144  297:aload           18
	//* 145  299:invokevirtual   #392 <Method boolean MetaFont.isUnderline()>
	//* 146  302:ifeq            338
	//* 147  305:aload_0         
	//* 148  306:getfield        #164 <Field PdfContentByte cb>
	//* 149  309:fload           9
	//* 150  311:fload           10
	//* 151  313:fload           11
	//* 152  315:ldc2            #393 <Float 4F>
	//* 153  318:fdiv            
	//* 154  319:fsub            
	//* 155  320:fload           12
	//* 156  322:fload           11
	//* 157  324:ldc2            #394 <Float 15F>
	//* 158  327:fdiv            
	//* 159  328:invokevirtual   #365 <Method void PdfContentByte.rectangle(float, float, float, float)>
	//* 160  331:aload_0         
	//* 161  332:getfield        #164 <Field PdfContentByte cb>
	//* 162  335:invokevirtual   #368 <Method void PdfContentByte.fill()>
	//* 163  338:aload           18
	//* 164  340:invokevirtual   #397 <Method boolean MetaFont.isStrikeout()>
	//* 165  343:ifeq            379
	//* 166  346:aload_0         
	//* 167  347:getfield        #164 <Field PdfContentByte cb>
	//* 168  350:fload           9
	//* 169  352:fload           11
	//* 170  354:ldc2            #398 <Float 3F>
	//* 171  357:fdiv            
	//* 172  358:fload           10
	//* 173  360:fadd            
	//* 174  361:fload           12
	//* 175  363:fload           11
	//* 176  365:ldc2            #394 <Float 15F>
	//* 177  368:fdiv            
	//* 178  369:invokevirtual   #365 <Method void PdfContentByte.rectangle(float, float, float, float)>
	//* 179  372:aload_0         
	//* 180  373:getfield        #164 <Field PdfContentByte cb>
	//* 181  376:invokevirtual   #368 <Method void PdfContentByte.fill()>
	//* 182  379:aload_0         
	//* 183  380:getfield        #164 <Field PdfContentByte cb>
	//* 184  383:invokevirtual   #401 <Method void PdfContentByte.restoreState()>
	//* 185  386:return          
		if((i & 2) == 2)
	//* 186  387:iload_1         
	//* 187  388:iconst_2        
	//* 188  389:iand            
	//* 189  390:iconst_2        
	//* 190  391:icmpne          165
			f = -f3;
	//  191  394:fload           12
	//  192  396:fneg            
	//  193  397:fstore          9
		if((i & 0x18) == 24)
			f1 = 0.0F;
		else
	//* 194  399:goto            165
		if((i & 8) == 8)
	//* 195  402:iload_1         
	//* 196  403:bipush          8
	//* 197  405:iand            
	//* 198  406:bipush          8
	//* 199  408:icmpne          419
			f1 = -f4;
	//  200  411:fload           13
	//  201  413:fneg            
	//  202  414:fstore          10
		else
	//* 203  416:goto            177
			f1 = -f5;
	//  204  419:fload           14
	//  205  421:fneg            
	//  206  422:fstore          10
		if(state.getBackgroundMode() == 2)
		{
			com.itextpdf.text.BaseColor basecolor = state.getCurrentBackgroundColor();
			cb.setColorFill(basecolor);
			cb.rectangle(f, f1 + f4, f3, f5 - f4);
			cb.fill();
		}
		basecolor1 = state.getCurrentTextColor();
		cb.setColorFill(basecolor1);
		cb.beginText();
		cb.setFontAndSize(basefont, f2);
		cb.setTextMatrix(f, f1);
		cb.showText(s);
		cb.endText();
		if(metafont.isUnderline())
		{
			cb.rectangle(f, f1 - f2 / 4F, f3, f2 / 15F);
			cb.fill();
		}
		if(metafont.isStrikeout())
		{
			cb.rectangle(f, f2 / 3F + f1, f3, f2 / 15F);
			cb.fill();
		}
		cb.restoreState();
	//* 207  424:goto            177
	}

	public void readAll()
		throws IOException, DocumentException
	{
		if(in.readInt() != 0x9ac6cdd7)
	//*   0    0:aload_0         
	//*   1    1:getfield        #171 <Field InputMeta in>
	//*   2    4:invokevirtual   #411 <Method int InputMeta.readInt()>
	//*   3    7:ldc2            #412 <Int 0x9ac6cdd7>
	//*   4   10:icmpeq          31
			throw new DocumentException(MessageLocalization.getComposedMessage("not.a.placeable.windows.metafile", new Object[0]));
	//    5   13:new             #404 <Class DocumentException>
	//    6   16:dup             
	//    7   17:ldc2            #414 <String "not.a.placeable.windows.metafile">
	//    8   20:iconst_0        
	//    9   21:anewarray       Object[]
	//   10   24:invokestatic    #207 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   11   27:invokespecial   #415 <Method void DocumentException(String)>
	//   12   30:athrow          
		in.readWord();
	//   13   31:aload_0         
	//   14   32:getfield        #171 <Field InputMeta in>
	//   15   35:invokevirtual   #418 <Method int InputMeta.readWord()>
	//   16   38:pop             
		left = in.readShort();
	//   17   39:aload_0         
	//   18   40:aload_0         
	//   19   41:getfield        #171 <Field InputMeta in>
	//   20   44:invokevirtual   #421 <Method int InputMeta.readShort()>
	//   21   47:putfield        #423 <Field int left>
		top = in.readShort();
	//   22   50:aload_0         
	//   23   51:aload_0         
	//   24   52:getfield        #171 <Field InputMeta in>
	//   25   55:invokevirtual   #421 <Method int InputMeta.readShort()>
	//   26   58:putfield        #425 <Field int top>
		right = in.readShort();
	//   27   61:aload_0         
	//   28   62:aload_0         
	//   29   63:getfield        #171 <Field InputMeta in>
	//   30   66:invokevirtual   #421 <Method int InputMeta.readShort()>
	//   31   69:putfield        #427 <Field int right>
		bottom = in.readShort();
	//   32   72:aload_0         
	//   33   73:aload_0         
	//   34   74:getfield        #171 <Field InputMeta in>
	//   35   77:invokevirtual   #421 <Method int InputMeta.readShort()>
	//   36   80:putfield        #429 <Field int bottom>
		inch = in.readWord();
	//   37   83:aload_0         
	//   38   84:aload_0         
	//   39   85:getfield        #171 <Field InputMeta in>
	//   40   88:invokevirtual   #418 <Method int InputMeta.readWord()>
	//   41   91:putfield        #431 <Field int inch>
		state.setScalingX(((float)(right - left) / (float)inch) * 72F);
	//   42   94:aload_0         
	//   43   95:getfield        #162 <Field MetaState state>
	//   44   98:aload_0         
	//   45   99:getfield        #427 <Field int right>
	//   46  102:aload_0         
	//   47  103:getfield        #423 <Field int left>
	//   48  106:isub            
	//   49  107:i2f             
	//   50  108:aload_0         
	//   51  109:getfield        #431 <Field int inch>
	//   52  112:i2f             
	//   53  113:fdiv            
	//   54  114:ldc2            #432 <Float 72F>
	//   55  117:fmul            
	//   56  118:invokevirtual   #436 <Method void MetaState.setScalingX(float)>
		state.setScalingY(((float)(bottom - top) / (float)inch) * 72F);
	//   57  121:aload_0         
	//   58  122:getfield        #162 <Field MetaState state>
	//   59  125:aload_0         
	//   60  126:getfield        #429 <Field int bottom>
	//   61  129:aload_0         
	//   62  130:getfield        #425 <Field int top>
	//   63  133:isub            
	//   64  134:i2f             
	//   65  135:aload_0         
	//   66  136:getfield        #431 <Field int inch>
	//   67  139:i2f             
	//   68  140:fdiv            
	//   69  141:ldc2            #432 <Float 72F>
	//   70  144:fmul            
	//   71  145:invokevirtual   #439 <Method void MetaState.setScalingY(float)>
		state.setOffsetWx(left);
	//   72  148:aload_0         
	//   73  149:getfield        #162 <Field MetaState state>
	//   74  152:aload_0         
	//   75  153:getfield        #423 <Field int left>
	//   76  156:invokevirtual   #442 <Method void MetaState.setOffsetWx(int)>
		state.setOffsetWy(top);
	//   77  159:aload_0         
	//   78  160:getfield        #162 <Field MetaState state>
	//   79  163:aload_0         
	//   80  164:getfield        #425 <Field int top>
	//   81  167:invokevirtual   #445 <Method void MetaState.setOffsetWy(int)>
		state.setExtentWx(right - left);
	//   82  170:aload_0         
	//   83  171:getfield        #162 <Field MetaState state>
	//   84  174:aload_0         
	//   85  175:getfield        #427 <Field int right>
	//   86  178:aload_0         
	//   87  179:getfield        #423 <Field int left>
	//   88  182:isub            
	//   89  183:invokevirtual   #448 <Method void MetaState.setExtentWx(int)>
		state.setExtentWy(bottom - top);
	//   90  186:aload_0         
	//   91  187:getfield        #162 <Field MetaState state>
	//   92  190:aload_0         
	//   93  191:getfield        #429 <Field int bottom>
	//   94  194:aload_0         
	//   95  195:getfield        #425 <Field int top>
	//   96  198:isub            
	//   97  199:invokevirtual   #451 <Method void MetaState.setExtentWy(int)>
		in.readInt();
	//   98  202:aload_0         
	//   99  203:getfield        #171 <Field InputMeta in>
	//  100  206:invokevirtual   #411 <Method int InputMeta.readInt()>
	//  101  209:pop             
		in.readWord();
	//  102  210:aload_0         
	//  103  211:getfield        #171 <Field InputMeta in>
	//  104  214:invokevirtual   #418 <Method int InputMeta.readWord()>
	//  105  217:pop             
		in.skip(18);
	//  106  218:aload_0         
	//  107  219:getfield        #171 <Field InputMeta in>
	//  108  222:bipush          18
	//  109  224:invokevirtual   #454 <Method void InputMeta.skip(int)>
		cb.setLineCap(1);
	//  110  227:aload_0         
	//  111  228:getfield        #164 <Field PdfContentByte cb>
	//  112  231:iconst_1        
	//  113  232:invokevirtual   #457 <Method void PdfContentByte.setLineCap(int)>
		cb.setLineJoin(1);
	//  114  235:aload_0         
	//  115  236:getfield        #164 <Field PdfContentByte cb>
	//  116  239:iconst_1        
	//  117  240:invokevirtual   #460 <Method void PdfContentByte.setLineJoin(int)>
_L34:
		int i;
		int l6;
		int i7;
		l6 = in.getLength();
	//  118  243:aload_0         
	//  119  244:getfield        #171 <Field InputMeta in>
	//  120  247:invokevirtual   #463 <Method int InputMeta.getLength()>
	//  121  250:istore          23
		i7 = in.readInt();
	//  122  252:aload_0         
	//  123  253:getfield        #171 <Field InputMeta in>
	//  124  256:invokevirtual   #411 <Method int InputMeta.readInt()>
	//  125  259:istore          24
		if(i7 < 3)
	//* 126  261:iload           24
	//* 127  263:iconst_3        
	//* 128  264:icmpge          279
		{
			state.cleanup(cb);
	//  129  267:aload_0         
	//  130  268:getfield        #162 <Field MetaState state>
	//  131  271:aload_0         
	//  132  272:getfield        #164 <Field PdfContentByte cb>
	//  133  275:invokevirtual   #466 <Method void MetaState.cleanup(PdfContentByte)>
			return;
	//  134  278:return          
		}
		i = in.readWord();
	//  135  279:aload_0         
	//  136  280:getfield        #171 <Field InputMeta in>
	//  137  283:invokevirtual   #418 <Method int InputMeta.readWord()>
	//  138  286:istore          18
		i;
	//  139  288:iload           18
		JVM INSTR lookupswitch 35: default 580
	//	               0: 580
	//	               30: 758
	//	               247: 605
	//	               258: 3319
	//	               262: 3336
	//	               295: 772
	//	               301: 712
	//	               302: 3302
	//	               322: 605
	//	               496: 737
	//	               513: 3268
	//	               521: 3285
	//	               523: 797
	//	               524: 828
	//	               531: 898
	//	               532: 859
	//	               762: 622
	//	               763: 682
	//	               764: 652
	//	               804: 1144
	//	               805: 1009
	//	               1046: 2832
	//	               1048: 1513
	//	               1051: 2565
	//	               1055: 3353
	//	               1313: 3129
	//	               1336: 1298
	//	               1564: 2665
	//	               1791: 605
	//	               2071: 1617
	//	               2074: 1854
	//	               2096: 2212
	//	               2610: 2934
	//	               2881: 3444
	//	               3907: 3444;
	//  140  290:lookupswitch    35: default 580
	//	               0: 580
	//	               30: 758
	//	               247: 605
	//	               258: 3319
	//	               262: 3336
	//	               295: 772
	//	               301: 712
	//	               302: 3302
	//	               322: 605
	//	               496: 737
	//	               513: 3268
	//	               521: 3285
	//	               523: 797
	//	               524: 828
	//	               531: 898
	//	               532: 859
	//	               762: 622
	//	               763: 682
	//	               764: 652
	//	               804: 1144
	//	               805: 1009
	//	               1046: 2832
	//	               1048: 1513
	//	               1051: 2565
	//	               1055: 3353
	//	               1313: 3129
	//	               1336: 1298
	//	               1564: 2665
	//	               1791: 605
	//	               2071: 1617
	//	               2074: 1854
	//	               2096: 2212
	//	               2610: 2934
	//	               2881: 3444
	//	               3907: 3444
		   goto _L1 _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L3 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L3 _L28 _L29 _L30 _L31 _L32 _L32
_L32:
		break MISSING_BLOCK_LABEL_3444;
_L1:
		break; /* Loop/switch isn't completed */
_L3:
		break; /* Loop/switch isn't completed */
_L35:
		in.skip(i7 * 2 - (in.getLength() - l6));
	//  141  580:aload_0         
	//  142  581:getfield        #171 <Field InputMeta in>
	//  143  584:iload           24
	//  144  586:iconst_2        
	//  145  587:imul            
	//  146  588:aload_0         
	//  147  589:getfield        #171 <Field InputMeta in>
	//  148  592:invokevirtual   #463 <Method int InputMeta.getLength()>
	//  149  595:iload           23
	//  150  597:isub            
	//  151  598:isub            
	//  152  599:invokevirtual   #454 <Method void InputMeta.skip(int)>
		if(true) goto _L34; else goto _L33
	//  153  602:goto            243
_L33:
		state.addMetaObject(new MetaObject());
	//  154  605:aload_0         
	//  155  606:getfield        #162 <Field MetaState state>
	//  156  609:new             #468 <Class MetaObject>
	//  157  612:dup             
	//  158  613:invokespecial   #469 <Method void MetaObject()>
	//  159  616:invokevirtual   #473 <Method void MetaState.addMetaObject(MetaObject)>
		  goto _L35
	//* 160  619:goto            580
_L16:
		MetaPen metapen = new MetaPen();
	//  161  622:new             #278 <Class MetaPen>
	//  162  625:dup             
	//  163  626:invokespecial   #474 <Method void MetaPen()>
	//  164  629:astore          29
		metapen.init(in);
	//  165  631:aload           29
	//  166  633:aload_0         
	//  167  634:getfield        #171 <Field InputMeta in>
	//  168  637:invokevirtual   #478 <Method void MetaPen.init(InputMeta)>
		state.addMetaObject(((MetaObject) (metapen)));
	//  169  640:aload_0         
	//  170  641:getfield        #162 <Field MetaState state>
	//  171  644:aload           29
	//  172  646:invokevirtual   #473 <Method void MetaState.addMetaObject(MetaObject)>
		  goto _L35
	//* 173  649:goto            580
_L18:
		MetaBrush metabrush = new MetaBrush();
	//  174  652:new             #283 <Class MetaBrush>
	//  175  655:dup             
	//  176  656:invokespecial   #479 <Method void MetaBrush()>
	//  177  659:astore          29
		metabrush.init(in);
	//  178  661:aload           29
	//  179  663:aload_0         
	//  180  664:getfield        #171 <Field InputMeta in>
	//  181  667:invokevirtual   #480 <Method void MetaBrush.init(InputMeta)>
		state.addMetaObject(((MetaObject) (metabrush)));
	//  182  670:aload_0         
	//  183  671:getfield        #162 <Field MetaState state>
	//  184  674:aload           29
	//  185  676:invokevirtual   #473 <Method void MetaState.addMetaObject(MetaObject)>
		  goto _L35
	//* 186  679:goto            580
_L17:
		MetaFont metafont = new MetaFont();
	//  187  682:new             #309 <Class MetaFont>
	//  188  685:dup             
	//  189  686:invokespecial   #481 <Method void MetaFont()>
	//  190  689:astore          29
		metafont.init(in);
	//  191  691:aload           29
	//  192  693:aload_0         
	//  193  694:getfield        #171 <Field InputMeta in>
	//  194  697:invokevirtual   #482 <Method void MetaFont.init(InputMeta)>
		state.addMetaObject(((MetaObject) (metafont)));
	//  195  700:aload_0         
	//  196  701:getfield        #162 <Field MetaState state>
	//  197  704:aload           29
	//  198  706:invokevirtual   #473 <Method void MetaState.addMetaObject(MetaObject)>
		  goto _L35
	//* 199  709:goto            580
_L7:
		i = in.readWord();
	//  200  712:aload_0         
	//  201  713:getfield        #171 <Field InputMeta in>
	//  202  716:invokevirtual   #418 <Method int InputMeta.readWord()>
	//  203  719:istore          18
		state.selectMetaObject(i, cb);
	//  204  721:aload_0         
	//  205  722:getfield        #162 <Field MetaState state>
	//  206  725:iload           18
	//  207  727:aload_0         
	//  208  728:getfield        #164 <Field PdfContentByte cb>
	//  209  731:invokevirtual   #486 <Method void MetaState.selectMetaObject(int, PdfContentByte)>
		  goto _L35
	//* 210  734:goto            580
_L9:
		i = in.readWord();
	//  211  737:aload_0         
	//  212  738:getfield        #171 <Field InputMeta in>
	//  213  741:invokevirtual   #418 <Method int InputMeta.readWord()>
	//  214  744:istore          18
		state.deleteMetaObject(i);
	//  215  746:aload_0         
	//  216  747:getfield        #162 <Field MetaState state>
	//  217  750:iload           18
	//  218  752:invokevirtual   #489 <Method void MetaState.deleteMetaObject(int)>
		  goto _L35
	//* 219  755:goto            580
_L2:
		state.saveState(cb);
	//  220  758:aload_0         
	//  221  759:getfield        #162 <Field MetaState state>
	//  222  762:aload_0         
	//  223  763:getfield        #164 <Field PdfContentByte cb>
	//  224  766:invokevirtual   #491 <Method void MetaState.saveState(PdfContentByte)>
		  goto _L35
	//* 225  769:goto            580
_L6:
		i = in.readShort();
	//  226  772:aload_0         
	//  227  773:getfield        #171 <Field InputMeta in>
	//  228  776:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  229  779:istore          18
		state.restoreState(i, cb);
	//  230  781:aload_0         
	//  231  782:getfield        #162 <Field MetaState state>
	//  232  785:iload           18
	//  233  787:aload_0         
	//  234  788:getfield        #164 <Field PdfContentByte cb>
	//  235  791:invokevirtual   #493 <Method void MetaState.restoreState(int, PdfContentByte)>
		  goto _L35
	//* 236  794:goto            580
_L12:
		state.setOffsetWy(in.readShort());
	//  237  797:aload_0         
	//  238  798:getfield        #162 <Field MetaState state>
	//  239  801:aload_0         
	//  240  802:getfield        #171 <Field InputMeta in>
	//  241  805:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  242  808:invokevirtual   #445 <Method void MetaState.setOffsetWy(int)>
		state.setOffsetWx(in.readShort());
	//  243  811:aload_0         
	//  244  812:getfield        #162 <Field MetaState state>
	//  245  815:aload_0         
	//  246  816:getfield        #171 <Field InputMeta in>
	//  247  819:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  248  822:invokevirtual   #442 <Method void MetaState.setOffsetWx(int)>
		  goto _L35
	//* 249  825:goto            580
_L13:
		state.setExtentWy(in.readShort());
	//  250  828:aload_0         
	//  251  829:getfield        #162 <Field MetaState state>
	//  252  832:aload_0         
	//  253  833:getfield        #171 <Field InputMeta in>
	//  254  836:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  255  839:invokevirtual   #451 <Method void MetaState.setExtentWy(int)>
		state.setExtentWx(in.readShort());
	//  256  842:aload_0         
	//  257  843:getfield        #162 <Field MetaState state>
	//  258  846:aload_0         
	//  259  847:getfield        #171 <Field InputMeta in>
	//  260  850:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  261  853:invokevirtual   #448 <Method void MetaState.setExtentWx(int)>
		  goto _L35
	//* 262  856:goto            580
_L15:
		i = in.readShort();
	//  263  859:aload_0         
	//  264  860:getfield        #171 <Field InputMeta in>
	//  265  863:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  266  866:istore          18
		Point point = new Point(in.readShort(), i);
	//  267  868:new             #495 <Class Point>
	//  268  871:dup             
	//  269  872:aload_0         
	//  270  873:getfield        #171 <Field InputMeta in>
	//  271  876:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  272  879:iload           18
	//  273  881:invokespecial   #498 <Method void Point(int, int)>
	//  274  884:astore          29
		state.setCurrentPoint(point);
	//  275  886:aload_0         
	//  276  887:getfield        #162 <Field MetaState state>
	//  277  890:aload           29
	//  278  892:invokevirtual   #502 <Method void MetaState.setCurrentPoint(Point)>
		  goto _L35
	//* 279  895:goto            580
_L14:
		i = in.readShort();
	//  280  898:aload_0         
	//  281  899:getfield        #171 <Field InputMeta in>
	//  282  902:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  283  905:istore          18
		int k = in.readShort();
	//  284  907:aload_0         
	//  285  908:getfield        #171 <Field InputMeta in>
	//  286  911:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  287  914:istore          19
		Point point1 = state.getCurrentPoint();
	//  288  916:aload_0         
	//  289  917:getfield        #162 <Field MetaState state>
	//  290  920:invokevirtual   #506 <Method Point MetaState.getCurrentPoint()>
	//  291  923:astore          29
		cb.moveTo(state.transformX(point1.x), state.transformY(point1.y));
	//  292  925:aload_0         
	//  293  926:getfield        #164 <Field PdfContentByte cb>
	//  294  929:aload_0         
	//  295  930:getfield        #162 <Field MetaState state>
	//  296  933:aload           29
	//  297  935:getfield        #509 <Field int Point.x>
	//  298  938:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  299  941:aload_0         
	//  300  942:getfield        #162 <Field MetaState state>
	//  301  945:aload           29
	//  302  947:getfield        #512 <Field int Point.y>
	//  303  950:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  304  953:invokevirtual   #515 <Method void PdfContentByte.moveTo(float, float)>
		cb.lineTo(state.transformX(k), state.transformY(i));
	//  305  956:aload_0         
	//  306  957:getfield        #164 <Field PdfContentByte cb>
	//  307  960:aload_0         
	//  308  961:getfield        #162 <Field MetaState state>
	//  309  964:iload           19
	//  310  966:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  311  969:aload_0         
	//  312  970:getfield        #162 <Field MetaState state>
	//  313  973:iload           18
	//  314  975:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  315  978:invokevirtual   #518 <Method void PdfContentByte.lineTo(float, float)>
		cb.stroke();
	//  316  981:aload_0         
	//  317  982:getfield        #164 <Field PdfContentByte cb>
	//  318  985:invokevirtual   #521 <Method void PdfContentByte.stroke()>
		state.setCurrentPoint(new Point(k, i));
	//  319  988:aload_0         
	//  320  989:getfield        #162 <Field MetaState state>
	//  321  992:new             #495 <Class Point>
	//  322  995:dup             
	//  323  996:iload           19
	//  324  998:iload           18
	//  325 1000:invokespecial   #498 <Method void Point(int, int)>
	//  326 1003:invokevirtual   #502 <Method void MetaState.setCurrentPoint(Point)>
		  goto _L35
	//* 327 1006:goto            580
_L20:
		state.setLineJoinPolygon(cb);
	//  328 1009:aload_0         
	//  329 1010:getfield        #162 <Field MetaState state>
	//  330 1013:aload_0         
	//  331 1014:getfield        #164 <Field PdfContentByte cb>
	//  332 1017:invokevirtual   #294 <Method void MetaState.setLineJoinPolygon(PdfContentByte)>
		int l = in.readWord();
	//  333 1020:aload_0         
	//  334 1021:getfield        #171 <Field InputMeta in>
	//  335 1024:invokevirtual   #418 <Method int InputMeta.readWord()>
	//  336 1027:istore          19
		i = in.readShort();
	//  337 1029:aload_0         
	//  338 1030:getfield        #171 <Field InputMeta in>
	//  339 1033:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  340 1036:istore          18
		int k2 = in.readShort();
	//  341 1038:aload_0         
	//  342 1039:getfield        #171 <Field InputMeta in>
	//  343 1042:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  344 1045:istore          20
		cb.moveTo(state.transformX(i), state.transformY(k2));
	//  345 1047:aload_0         
	//  346 1048:getfield        #164 <Field PdfContentByte cb>
	//  347 1051:aload_0         
	//  348 1052:getfield        #162 <Field MetaState state>
	//  349 1055:iload           18
	//  350 1057:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  351 1060:aload_0         
	//  352 1061:getfield        #162 <Field MetaState state>
	//  353 1064:iload           20
	//  354 1066:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  355 1069:invokevirtual   #515 <Method void PdfContentByte.moveTo(float, float)>
		for(i = 1; i < l; i++)
	//* 356 1072:iconst_1        
	//* 357 1073:istore          18
	//* 358 1075:iload           18
	//* 359 1077:iload           19
	//* 360 1079:icmpge          1134
		{
			int l2 = in.readShort();
	//  361 1082:aload_0         
	//  362 1083:getfield        #171 <Field InputMeta in>
	//  363 1086:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  364 1089:istore          20
			int j4 = in.readShort();
	//  365 1091:aload_0         
	//  366 1092:getfield        #171 <Field InputMeta in>
	//  367 1095:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  368 1098:istore          21
			cb.lineTo(state.transformX(l2), state.transformY(j4));
	//  369 1100:aload_0         
	//  370 1101:getfield        #164 <Field PdfContentByte cb>
	//  371 1104:aload_0         
	//  372 1105:getfield        #162 <Field MetaState state>
	//  373 1108:iload           20
	//  374 1110:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  375 1113:aload_0         
	//  376 1114:getfield        #162 <Field MetaState state>
	//  377 1117:iload           21
	//  378 1119:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  379 1122:invokevirtual   #518 <Method void PdfContentByte.lineTo(float, float)>
		}

	//  380 1125:iload           18
	//  381 1127:iconst_1        
	//  382 1128:iadd            
	//  383 1129:istore          18
	//* 384 1131:goto            1075
		cb.stroke();
	//  385 1134:aload_0         
	//  386 1135:getfield        #164 <Field PdfContentByte cb>
	//  387 1138:invokevirtual   #521 <Method void PdfContentByte.stroke()>
		  goto _L35
	//* 388 1141:goto            580
_L19:
		if(!isNullStrokeFill(false))
	//* 389 1144:aload_0         
	//* 390 1145:iconst_0        
	//* 391 1146:invokevirtual   #523 <Method boolean isNullStrokeFill(boolean)>
	//* 392 1149:ifne            580
		{
			int i1 = in.readWord();
	//  393 1152:aload_0         
	//  394 1153:getfield        #171 <Field InputMeta in>
	//  395 1156:invokevirtual   #418 <Method int InputMeta.readWord()>
	//  396 1159:istore          19
			int i3 = in.readShort();
	//  397 1161:aload_0         
	//  398 1162:getfield        #171 <Field InputMeta in>
	//  399 1165:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  400 1168:istore          20
			int k4 = in.readShort();
	//  401 1170:aload_0         
	//  402 1171:getfield        #171 <Field InputMeta in>
	//  403 1174:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  404 1177:istore          21
			cb.moveTo(state.transformX(i3), state.transformY(k4));
	//  405 1179:aload_0         
	//  406 1180:getfield        #164 <Field PdfContentByte cb>
	//  407 1183:aload_0         
	//  408 1184:getfield        #162 <Field MetaState state>
	//  409 1187:iload           20
	//  410 1189:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  411 1192:aload_0         
	//  412 1193:getfield        #162 <Field MetaState state>
	//  413 1196:iload           21
	//  414 1198:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  415 1201:invokevirtual   #515 <Method void PdfContentByte.moveTo(float, float)>
			for(i = 1; i < i1; i++)
	//* 416 1204:iconst_1        
	//* 417 1205:istore          18
	//* 418 1207:iload           18
	//* 419 1209:iload           19
	//* 420 1211:icmpge          1266
			{
				int l5 = in.readShort();
	//  421 1214:aload_0         
	//  422 1215:getfield        #171 <Field InputMeta in>
	//  423 1218:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  424 1221:istore          22
				int j7 = in.readShort();
	//  425 1223:aload_0         
	//  426 1224:getfield        #171 <Field InputMeta in>
	//  427 1227:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  428 1230:istore          25
				cb.lineTo(state.transformX(l5), state.transformY(j7));
	//  429 1232:aload_0         
	//  430 1233:getfield        #164 <Field PdfContentByte cb>
	//  431 1236:aload_0         
	//  432 1237:getfield        #162 <Field MetaState state>
	//  433 1240:iload           22
	//  434 1242:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  435 1245:aload_0         
	//  436 1246:getfield        #162 <Field MetaState state>
	//  437 1249:iload           25
	//  438 1251:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  439 1254:invokevirtual   #518 <Method void PdfContentByte.lineTo(float, float)>
			}

	//  440 1257:iload           18
	//  441 1259:iconst_1        
	//  442 1260:iadd            
	//  443 1261:istore          18
	//* 444 1263:goto            1207
			cb.lineTo(state.transformX(i3), state.transformY(k4));
	//  445 1266:aload_0         
	//  446 1267:getfield        #164 <Field PdfContentByte cb>
	//  447 1270:aload_0         
	//  448 1271:getfield        #162 <Field MetaState state>
	//  449 1274:iload           20
	//  450 1276:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  451 1279:aload_0         
	//  452 1280:getfield        #162 <Field MetaState state>
	//  453 1283:iload           21
	//  454 1285:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  455 1288:invokevirtual   #518 <Method void PdfContentByte.lineTo(float, float)>
			strokeAndFill();
	//  456 1291:aload_0         
	//  457 1292:invokevirtual   #526 <Method void strokeAndFill()>
		}
		  goto _L35
	//* 458 1295:goto            580
_L26:
		if(!isNullStrokeFill(false))
	//* 459 1298:aload_0         
	//* 460 1299:iconst_0        
	//* 461 1300:invokevirtual   #523 <Method boolean isNullStrokeFill(boolean)>
	//* 462 1303:ifne            580
		{
			int ai[] = new int[in.readWord()];
	//  463 1306:aload_0         
	//  464 1307:getfield        #171 <Field InputMeta in>
	//  465 1310:invokevirtual   #418 <Method int InputMeta.readWord()>
	//  466 1313:newarray        int[]
	//  467 1315:astore          29
			for(i = 0; i < ai.length; i++)
	//* 468 1317:iconst_0        
	//* 469 1318:istore          18
	//* 470 1320:iload           18
	//* 471 1322:aload           29
	//* 472 1324:arraylength     
	//* 473 1325:icmpge          1349
				ai[i] = in.readWord();
	//  474 1328:aload           29
	//  475 1330:iload           18
	//  476 1332:aload_0         
	//  477 1333:getfield        #171 <Field InputMeta in>
	//  478 1336:invokevirtual   #418 <Method int InputMeta.readWord()>
	//  479 1339:iastore         

	//  480 1340:iload           18
	//  481 1342:iconst_1        
	//  482 1343:iadd            
	//  483 1344:istore          18
	//* 484 1346:goto            1320
			for(i = 0; i < ai.length; i++)
	//* 485 1349:iconst_0        
	//* 486 1350:istore          18
	//* 487 1352:iload           18
	//* 488 1354:aload           29
	//* 489 1356:arraylength     
	//* 490 1357:icmpge          1506
			{
				int j3 = ai[i];
	//  491 1360:aload           29
	//  492 1362:iload           18
	//  493 1364:iaload          
	//  494 1365:istore          20
				int l4 = in.readShort();
	//  495 1367:aload_0         
	//  496 1368:getfield        #171 <Field InputMeta in>
	//  497 1371:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  498 1374:istore          21
				int i6 = in.readShort();
	//  499 1376:aload_0         
	//  500 1377:getfield        #171 <Field InputMeta in>
	//  501 1380:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  502 1383:istore          22
				cb.moveTo(state.transformX(l4), state.transformY(i6));
	//  503 1385:aload_0         
	//  504 1386:getfield        #164 <Field PdfContentByte cb>
	//  505 1389:aload_0         
	//  506 1390:getfield        #162 <Field MetaState state>
	//  507 1393:iload           21
	//  508 1395:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  509 1398:aload_0         
	//  510 1399:getfield        #162 <Field MetaState state>
	//  511 1402:iload           22
	//  512 1404:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  513 1407:invokevirtual   #515 <Method void PdfContentByte.moveTo(float, float)>
				for(int j1 = 1; j1 < j3; j1++)
	//* 514 1410:iconst_1        
	//* 515 1411:istore          19
	//* 516 1413:iload           19
	//* 517 1415:iload           20
	//* 518 1417:icmpge          1472
				{
					int k7 = in.readShort();
	//  519 1420:aload_0         
	//  520 1421:getfield        #171 <Field InputMeta in>
	//  521 1424:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  522 1427:istore          25
					int i8 = in.readShort();
	//  523 1429:aload_0         
	//  524 1430:getfield        #171 <Field InputMeta in>
	//  525 1433:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  526 1436:istore          26
					cb.lineTo(state.transformX(k7), state.transformY(i8));
	//  527 1438:aload_0         
	//  528 1439:getfield        #164 <Field PdfContentByte cb>
	//  529 1442:aload_0         
	//  530 1443:getfield        #162 <Field MetaState state>
	//  531 1446:iload           25
	//  532 1448:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  533 1451:aload_0         
	//  534 1452:getfield        #162 <Field MetaState state>
	//  535 1455:iload           26
	//  536 1457:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  537 1460:invokevirtual   #518 <Method void PdfContentByte.lineTo(float, float)>
				}

	//  538 1463:iload           19
	//  539 1465:iconst_1        
	//  540 1466:iadd            
	//  541 1467:istore          19
	//* 542 1469:goto            1413
				cb.lineTo(state.transformX(l4), state.transformY(i6));
	//  543 1472:aload_0         
	//  544 1473:getfield        #164 <Field PdfContentByte cb>
	//  545 1476:aload_0         
	//  546 1477:getfield        #162 <Field MetaState state>
	//  547 1480:iload           21
	//  548 1482:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  549 1485:aload_0         
	//  550 1486:getfield        #162 <Field MetaState state>
	//  551 1489:iload           22
	//  552 1491:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  553 1494:invokevirtual   #518 <Method void PdfContentByte.lineTo(float, float)>
			}

	//  554 1497:iload           18
	//  555 1499:iconst_1        
	//  556 1500:iadd            
	//  557 1501:istore          18
	//* 558 1503:goto            1352
			strokeAndFill();
	//  559 1506:aload_0         
	//  560 1507:invokevirtual   #526 <Method void strokeAndFill()>
		}
		  goto _L35
	//* 561 1510:goto            580
_L22:
		if(!isNullStrokeFill(state.getLineNeutral()))
	//* 562 1513:aload_0         
	//* 563 1514:aload_0         
	//* 564 1515:getfield        #162 <Field MetaState state>
	//* 565 1518:invokevirtual   #529 <Method boolean MetaState.getLineNeutral()>
	//* 566 1521:invokevirtual   #523 <Method boolean isNullStrokeFill(boolean)>
	//* 567 1524:ifne            580
		{
			i = in.readShort();
	//  568 1527:aload_0         
	//  569 1528:getfield        #171 <Field InputMeta in>
	//  570 1531:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  571 1534:istore          18
			int k1 = in.readShort();
	//  572 1536:aload_0         
	//  573 1537:getfield        #171 <Field InputMeta in>
	//  574 1540:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  575 1543:istore          19
			int k3 = in.readShort();
	//  576 1545:aload_0         
	//  577 1546:getfield        #171 <Field InputMeta in>
	//  578 1549:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  579 1552:istore          20
			int i5 = in.readShort();
	//  580 1554:aload_0         
	//  581 1555:getfield        #171 <Field InputMeta in>
	//  582 1558:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  583 1561:istore          21
			cb.arc(state.transformX(i5), state.transformY(i), state.transformX(k1), state.transformY(k3), 0.0F, 360F);
	//  584 1563:aload_0         
	//  585 1564:getfield        #164 <Field PdfContentByte cb>
	//  586 1567:aload_0         
	//  587 1568:getfield        #162 <Field MetaState state>
	//  588 1571:iload           21
	//  589 1573:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  590 1576:aload_0         
	//  591 1577:getfield        #162 <Field MetaState state>
	//  592 1580:iload           18
	//  593 1582:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  594 1585:aload_0         
	//  595 1586:getfield        #162 <Field MetaState state>
	//  596 1589:iload           19
	//  597 1591:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  598 1594:aload_0         
	//  599 1595:getfield        #162 <Field MetaState state>
	//  600 1598:iload           20
	//  601 1600:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  602 1603:fconst_0        
	//  603 1604:ldc2            #530 <Float 360F>
	//  604 1607:invokevirtual   #533 <Method void PdfContentByte.arc(float, float, float, float, float, float)>
			strokeAndFill();
	//  605 1610:aload_0         
	//  606 1611:invokevirtual   #526 <Method void strokeAndFill()>
		}
		  goto _L35
	//* 607 1614:goto            580
_L28:
		if(!isNullStrokeFill(state.getLineNeutral()))
	//* 608 1617:aload_0         
	//* 609 1618:aload_0         
	//* 610 1619:getfield        #162 <Field MetaState state>
	//* 611 1622:invokevirtual   #529 <Method boolean MetaState.getLineNeutral()>
	//* 612 1625:invokevirtual   #523 <Method boolean isNullStrokeFill(boolean)>
	//* 613 1628:ifne            580
		{
			float f = state.transformY(in.readShort());
	//  614 1631:aload_0         
	//  615 1632:getfield        #162 <Field MetaState state>
	//  616 1635:aload_0         
	//  617 1636:getfield        #171 <Field InputMeta in>
	//  618 1639:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  619 1642:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  620 1645:fstore          8
			float f7 = state.transformX(in.readShort());
	//  621 1647:aload_0         
	//  622 1648:getfield        #162 <Field MetaState state>
	//  623 1651:aload_0         
	//  624 1652:getfield        #171 <Field InputMeta in>
	//  625 1655:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  626 1658:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  627 1661:fstore          9
			float f36 = state.transformY(in.readShort());
	//  628 1663:aload_0         
	//  629 1664:getfield        #162 <Field MetaState state>
	//  630 1667:aload_0         
	//  631 1668:getfield        #171 <Field InputMeta in>
	//  632 1671:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  633 1674:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  634 1677:fstore          14
			float f46 = state.transformX(in.readShort());
	//  635 1679:aload_0         
	//  636 1680:getfield        #162 <Field MetaState state>
	//  637 1683:aload_0         
	//  638 1684:getfield        #171 <Field InputMeta in>
	//  639 1687:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  640 1690:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  641 1693:fstore          17
			float f14 = state.transformY(in.readShort());
	//  642 1695:aload_0         
	//  643 1696:getfield        #162 <Field MetaState state>
	//  644 1699:aload_0         
	//  645 1700:getfield        #171 <Field InputMeta in>
	//  646 1703:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  647 1706:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  648 1709:fstore          10
			float f21 = state.transformX(in.readShort());
	//  649 1711:aload_0         
	//  650 1712:getfield        #162 <Field MetaState state>
	//  651 1715:aload_0         
	//  652 1716:getfield        #171 <Field InputMeta in>
	//  653 1719:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  654 1722:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  655 1725:fstore          11
			float f28 = state.transformY(in.readShort());
	//  656 1727:aload_0         
	//  657 1728:getfield        #162 <Field MetaState state>
	//  658 1731:aload_0         
	//  659 1732:getfield        #171 <Field InputMeta in>
	//  660 1735:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  661 1738:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  662 1741:fstore          12
			float f32 = state.transformX(in.readShort());
	//  663 1743:aload_0         
	//  664 1744:getfield        #162 <Field MetaState state>
	//  665 1747:aload_0         
	//  666 1748:getfield        #171 <Field InputMeta in>
	//  667 1751:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  668 1754:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  669 1757:fstore          13
			float f40 = (f21 + f32) / 2.0F;
	//  670 1759:fload           11
	//  671 1761:fload           13
	//  672 1763:fadd            
	//  673 1764:fconst_2        
	//  674 1765:fdiv            
	//  675 1766:fstore          15
			float f44 = (f28 + f14) / 2.0F;
	//  676 1768:fload           12
	//  677 1770:fload           10
	//  678 1772:fadd            
	//  679 1773:fconst_2        
	//  680 1774:fdiv            
	//  681 1775:fstore          16
			f36 = getArc(f40, f44, f46, f36);
	//  682 1777:fload           15
	//  683 1779:fload           16
	//  684 1781:fload           17
	//  685 1783:fload           14
	//  686 1785:invokestatic    #535 <Method float getArc(float, float, float, float)>
	//  687 1788:fstore          14
			f7 = getArc(f40, f44, f7, f) - f36;
	//  688 1790:fload           15
	//  689 1792:fload           16
	//  690 1794:fload           9
	//  691 1796:fload           8
	//  692 1798:invokestatic    #535 <Method float getArc(float, float, float, float)>
	//  693 1801:fload           14
	//  694 1803:fsub            
	//  695 1804:fstore          9
			f = f7;
	//  696 1806:fload           9
	//  697 1808:fstore          8
			if(f7 <= 0.0F)
	//* 698 1810:fload           9
	//* 699 1812:fconst_0        
	//* 700 1813:fcmpg           
	//* 701 1814:ifgt            1825
				f = f7 + 360F;
	//  702 1817:fload           9
	//  703 1819:ldc2            #530 <Float 360F>
	//  704 1822:fadd            
	//  705 1823:fstore          8
			cb.arc(f32, f14, f21, f28, f36, f);
	//  706 1825:aload_0         
	//  707 1826:getfield        #164 <Field PdfContentByte cb>
	//  708 1829:fload           13
	//  709 1831:fload           10
	//  710 1833:fload           11
	//  711 1835:fload           12
	//  712 1837:fload           14
	//  713 1839:fload           8
	//  714 1841:invokevirtual   #533 <Method void PdfContentByte.arc(float, float, float, float, float, float)>
			cb.stroke();
	//  715 1844:aload_0         
	//  716 1845:getfield        #164 <Field PdfContentByte cb>
	//  717 1848:invokevirtual   #521 <Method void PdfContentByte.stroke()>
		}
		  goto _L35
	//* 718 1851:goto            580
_L29:
		if(!isNullStrokeFill(state.getLineNeutral()))
	//* 719 1854:aload_0         
	//* 720 1855:aload_0         
	//* 721 1856:getfield        #162 <Field MetaState state>
	//* 722 1859:invokevirtual   #529 <Method boolean MetaState.getLineNeutral()>
	//* 723 1862:invokevirtual   #523 <Method boolean isNullStrokeFill(boolean)>
	//* 724 1865:ifne            580
		{
			float f1 = state.transformY(in.readShort());
	//  725 1868:aload_0         
	//  726 1869:getfield        #162 <Field MetaState state>
	//  727 1872:aload_0         
	//  728 1873:getfield        #171 <Field InputMeta in>
	//  729 1876:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  730 1879:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  731 1882:fstore          8
			float f8 = state.transformX(in.readShort());
	//  732 1884:aload_0         
	//  733 1885:getfield        #162 <Field MetaState state>
	//  734 1888:aload_0         
	//  735 1889:getfield        #171 <Field InputMeta in>
	//  736 1892:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  737 1895:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  738 1898:fstore          9
			float f15 = state.transformY(in.readShort());
	//  739 1900:aload_0         
	//  740 1901:getfield        #162 <Field MetaState state>
	//  741 1904:aload_0         
	//  742 1905:getfield        #171 <Field InputMeta in>
	//  743 1908:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  744 1911:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  745 1914:fstore          10
			float f22 = state.transformX(in.readShort());
	//  746 1916:aload_0         
	//  747 1917:getfield        #162 <Field MetaState state>
	//  748 1920:aload_0         
	//  749 1921:getfield        #171 <Field InputMeta in>
	//  750 1924:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  751 1927:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  752 1930:fstore          11
			float f29 = state.transformY(in.readShort());
	//  753 1932:aload_0         
	//  754 1933:getfield        #162 <Field MetaState state>
	//  755 1936:aload_0         
	//  756 1937:getfield        #171 <Field InputMeta in>
	//  757 1940:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  758 1943:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  759 1946:fstore          12
			float f33 = state.transformX(in.readShort());
	//  760 1948:aload_0         
	//  761 1949:getfield        #162 <Field MetaState state>
	//  762 1952:aload_0         
	//  763 1953:getfield        #171 <Field InputMeta in>
	//  764 1956:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  765 1959:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  766 1962:fstore          13
			float f37 = state.transformY(in.readShort());
	//  767 1964:aload_0         
	//  768 1965:getfield        #162 <Field MetaState state>
	//  769 1968:aload_0         
	//  770 1969:getfield        #171 <Field InputMeta in>
	//  771 1972:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  772 1975:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  773 1978:fstore          14
			float f41 = state.transformX(in.readShort());
	//  774 1980:aload_0         
	//  775 1981:getfield        #162 <Field MetaState state>
	//  776 1984:aload_0         
	//  777 1985:getfield        #171 <Field InputMeta in>
	//  778 1988:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  779 1991:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  780 1994:fstore          15
			float f45 = (f33 + f41) / 2.0F;
	//  781 1996:fload           13
	//  782 1998:fload           15
	//  783 2000:fadd            
	//  784 2001:fconst_2        
	//  785 2002:fdiv            
	//  786 2003:fstore          16
			float f47 = (f37 + f29) / 2.0F;
	//  787 2005:fload           14
	//  788 2007:fload           12
	//  789 2009:fadd            
	//  790 2010:fconst_2        
	//  791 2011:fdiv            
	//  792 2012:fstore          17
			double d6 = getArc(f45, f47, f22, f15);
	//  793 2014:fload           16
	//  794 2016:fload           17
	//  795 2018:fload           11
	//  796 2020:fload           10
	//  797 2022:invokestatic    #535 <Method float getArc(float, float, float, float)>
	//  798 2025:f2d             
	//  799 2026:dstore          6
			double d3 = (double)getArc(f45, f47, f8, f1) - d6;
	//  800 2028:fload           16
	//  801 2030:fload           17
	//  802 2032:fload           9
	//  803 2034:fload           8
	//  804 2036:invokestatic    #535 <Method float getArc(float, float, float, float)>
	//  805 2039:f2d             
	//  806 2040:dload           6
	//  807 2042:dsub            
	//  808 2043:dstore          4
			double d = d3;
	//  809 2045:dload           4
	//  810 2047:dstore_2        
			if(d3 <= 0.0D)
	//* 811 2048:dload           4
	//* 812 2050:dconst_0        
	//* 813 2051:dcmpg           
	//* 814 2052:ifgt            2062
				d = d3 + 360D;
	//  815 2055:dload           4
	//  816 2057:ldc2w           #536 <Double 360D>
	//  817 2060:dadd            
	//  818 2061:dstore_2        
			ArrayList arraylist = PdfContentByte.bezierArc(f41, f29, f33, f37, d6, d);
	//  819 2062:fload           15
	//  820 2064:f2d             
	//  821 2065:fload           12
	//  822 2067:f2d             
	//  823 2068:fload           13
	//  824 2070:f2d             
	//  825 2071:fload           14
	//  826 2073:f2d             
	//  827 2074:dload           6
	//  828 2076:dload_2         
	//  829 2077:invokestatic    #541 <Method ArrayList PdfContentByte.bezierArc(double, double, double, double, double, double)>
	//  830 2080:astore          29
			if(!arraylist.isEmpty())
	//* 831 2082:aload           29
	//* 832 2084:invokevirtual   #546 <Method boolean ArrayList.isEmpty()>
	//* 833 2087:ifne            580
			{
				double ad[] = (double[])arraylist.get(0);
	//  834 2090:aload           29
	//  835 2092:iconst_0        
	//  836 2093:invokevirtual   #550 <Method Object ArrayList.get(int)>
	//  837 2096:checkcast       #552 <Class double[]>
	//  838 2099:astore          30
				cb.moveTo(f45, f47);
	//  839 2101:aload_0         
	//  840 2102:getfield        #164 <Field PdfContentByte cb>
	//  841 2105:fload           16
	//  842 2107:fload           17
	//  843 2109:invokevirtual   #515 <Method void PdfContentByte.moveTo(float, float)>
				cb.lineTo(ad[0], ad[1]);
	//  844 2112:aload_0         
	//  845 2113:getfield        #164 <Field PdfContentByte cb>
	//  846 2116:aload           30
	//  847 2118:iconst_0        
	//  848 2119:daload          
	//  849 2120:aload           30
	//  850 2122:iconst_1        
	//  851 2123:daload          
	//  852 2124:invokevirtual   #555 <Method void PdfContentByte.lineTo(double, double)>
				for(i = 0; i < arraylist.size(); i++)
	//* 853 2127:iconst_0        
	//* 854 2128:istore          18
	//* 855 2130:iload           18
	//* 856 2132:aload           29
	//* 857 2134:invokevirtual   #558 <Method int ArrayList.size()>
	//* 858 2137:icmpge          2194
				{
					double ad1[] = (double[])arraylist.get(i);
	//  859 2140:aload           29
	//  860 2142:iload           18
	//  861 2144:invokevirtual   #550 <Method Object ArrayList.get(int)>
	//  862 2147:checkcast       #552 <Class double[]>
	//  863 2150:astore          30
					cb.curveTo(ad1[2], ad1[3], ad1[4], ad1[5], ad1[6], ad1[7]);
	//  864 2152:aload_0         
	//  865 2153:getfield        #164 <Field PdfContentByte cb>
	//  866 2156:aload           30
	//  867 2158:iconst_2        
	//  868 2159:daload          
	//  869 2160:aload           30
	//  870 2162:iconst_3        
	//  871 2163:daload          
	//  872 2164:aload           30
	//  873 2166:iconst_4        
	//  874 2167:daload          
	//  875 2168:aload           30
	//  876 2170:iconst_5        
	//  877 2171:daload          
	//  878 2172:aload           30
	//  879 2174:bipush          6
	//  880 2176:daload          
	//  881 2177:aload           30
	//  882 2179:bipush          7
	//  883 2181:daload          
	//  884 2182:invokevirtual   #562 <Method void PdfContentByte.curveTo(double, double, double, double, double, double)>
				}

	//  885 2185:iload           18
	//  886 2187:iconst_1        
	//  887 2188:iadd            
	//  888 2189:istore          18
	//* 889 2191:goto            2130
				cb.lineTo(f45, f47);
	//  890 2194:aload_0         
	//  891 2195:getfield        #164 <Field PdfContentByte cb>
	//  892 2198:fload           16
	//  893 2200:fload           17
	//  894 2202:invokevirtual   #518 <Method void PdfContentByte.lineTo(float, float)>
				strokeAndFill();
	//  895 2205:aload_0         
	//  896 2206:invokevirtual   #526 <Method void strokeAndFill()>
			}
		}
		  goto _L35
	//* 897 2209:goto            580
_L30:
		if(!isNullStrokeFill(state.getLineNeutral()))
	//* 898 2212:aload_0         
	//* 899 2213:aload_0         
	//* 900 2214:getfield        #162 <Field MetaState state>
	//* 901 2217:invokevirtual   #529 <Method boolean MetaState.getLineNeutral()>
	//* 902 2220:invokevirtual   #523 <Method boolean isNullStrokeFill(boolean)>
	//* 903 2223:ifne            580
		{
			float f2 = state.transformY(in.readShort());
	//  904 2226:aload_0         
	//  905 2227:getfield        #162 <Field MetaState state>
	//  906 2230:aload_0         
	//  907 2231:getfield        #171 <Field InputMeta in>
	//  908 2234:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  909 2237:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  910 2240:fstore          8
			float f9 = state.transformX(in.readShort());
	//  911 2242:aload_0         
	//  912 2243:getfield        #162 <Field MetaState state>
	//  913 2246:aload_0         
	//  914 2247:getfield        #171 <Field InputMeta in>
	//  915 2250:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  916 2253:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  917 2256:fstore          9
			float f16 = state.transformY(in.readShort());
	//  918 2258:aload_0         
	//  919 2259:getfield        #162 <Field MetaState state>
	//  920 2262:aload_0         
	//  921 2263:getfield        #171 <Field InputMeta in>
	//  922 2266:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  923 2269:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  924 2272:fstore          10
			float f23 = state.transformX(in.readShort());
	//  925 2274:aload_0         
	//  926 2275:getfield        #162 <Field MetaState state>
	//  927 2278:aload_0         
	//  928 2279:getfield        #171 <Field InputMeta in>
	//  929 2282:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  930 2285:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  931 2288:fstore          11
			float f30 = state.transformY(in.readShort());
	//  932 2290:aload_0         
	//  933 2291:getfield        #162 <Field MetaState state>
	//  934 2294:aload_0         
	//  935 2295:getfield        #171 <Field InputMeta in>
	//  936 2298:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  937 2301:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  938 2304:fstore          12
			float f34 = state.transformX(in.readShort());
	//  939 2306:aload_0         
	//  940 2307:getfield        #162 <Field MetaState state>
	//  941 2310:aload_0         
	//  942 2311:getfield        #171 <Field InputMeta in>
	//  943 2314:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  944 2317:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  945 2320:fstore          13
			float f38 = state.transformY(in.readShort());
	//  946 2322:aload_0         
	//  947 2323:getfield        #162 <Field MetaState state>
	//  948 2326:aload_0         
	//  949 2327:getfield        #171 <Field InputMeta in>
	//  950 2330:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  951 2333:invokevirtual   #307 <Method float MetaState.transformY(int)>
	//  952 2336:fstore          14
			float f42 = state.transformX(in.readShort());
	//  953 2338:aload_0         
	//  954 2339:getfield        #162 <Field MetaState state>
	//  955 2342:aload_0         
	//  956 2343:getfield        #171 <Field InputMeta in>
	//  957 2346:invokevirtual   #421 <Method int InputMeta.readShort()>
	//  958 2349:invokevirtual   #304 <Method float MetaState.transformX(int)>
	//  959 2352:fstore          15
			double d1 = (f34 + f42) / 2.0F;
	//  960 2354:fload           13
	//  961 2356:fload           15
	//  962 2358:fadd            
	//  963 2359:fconst_2        
	//  964 2360:fdiv            
	//  965 2361:f2d             
	//  966 2362:dstore_2        
			double d4 = (f38 + f30) / 2.0F;
	//  967 2363:fload           14
	//  968 2365:fload           12
	//  969 2367:fadd            
	//  970 2368:fconst_2        
	//  971 2369:fdiv            
	//  972 2370:f2d             
	//  973 2371:dstore          4
			double d7 = getArc(d1, d4, f23, f16);
	//  974 2373:dload_2         
	//  975 2374:dload           4
	//  976 2376:fload           11
	//  977 2378:f2d             
	//  978 2379:fload           10
	//  979 2381:f2d             
	//  980 2382:invokestatic    #189 <Method double getArc(double, double, double, double)>
	//  981 2385:dstore          6
			d4 = getArc(d1, d4, f9, f2) - d7;
	//  982 2387:dload_2         
	//  983 2388:dload           4
	//  984 2390:fload           9
	//  985 2392:f2d             
	//  986 2393:fload           8
	//  987 2395:f2d             
	//  988 2396:invokestatic    #189 <Method double getArc(double, double, double, double)>
	//  989 2399:dload           6
	//  990 2401:dsub            
	//  991 2402:dstore          4
			d1 = d4;
	//  992 2404:dload           4
	//  993 2406:dstore_2        
			if(d4 <= 0.0D)
	//* 994 2407:dload           4
	//* 995 2409:dconst_0        
	//* 996 2410:dcmpg           
	//* 997 2411:ifgt            2421
				d1 = d4 + 360D;
	//  998 2414:dload           4
	//  999 2416:ldc2w           #536 <Double 360D>
	// 1000 2419:dadd            
	// 1001 2420:dstore_2        
			ArrayList arraylist1 = PdfContentByte.bezierArc(f42, f30, f34, f38, d7, d1);
	// 1002 2421:fload           15
	// 1003 2423:f2d             
	// 1004 2424:fload           12
	// 1005 2426:f2d             
	// 1006 2427:fload           13
	// 1007 2429:f2d             
	// 1008 2430:fload           14
	// 1009 2432:f2d             
	// 1010 2433:dload           6
	// 1011 2435:dload_2         
	// 1012 2436:invokestatic    #541 <Method ArrayList PdfContentByte.bezierArc(double, double, double, double, double, double)>
	// 1013 2439:astore          29
			if(!arraylist1.isEmpty())
	//*1014 2441:aload           29
	//*1015 2443:invokevirtual   #546 <Method boolean ArrayList.isEmpty()>
	//*1016 2446:ifne            580
			{
				double ad2[] = (double[])arraylist1.get(0);
	// 1017 2449:aload           29
	// 1018 2451:iconst_0        
	// 1019 2452:invokevirtual   #550 <Method Object ArrayList.get(int)>
	// 1020 2455:checkcast       #552 <Class double[]>
	// 1021 2458:astore          30
				double d2 = ad2[0];
	// 1022 2460:aload           30
	// 1023 2462:iconst_0        
	// 1024 2463:daload          
	// 1025 2464:dstore_2        
				double d5 = ad2[1];
	// 1026 2465:aload           30
	// 1027 2467:iconst_1        
	// 1028 2468:daload          
	// 1029 2469:dstore          4
				cb.moveTo(d2, d5);
	// 1030 2471:aload_0         
	// 1031 2472:getfield        #164 <Field PdfContentByte cb>
	// 1032 2475:dload_2         
	// 1033 2476:dload           4
	// 1034 2478:invokevirtual   #564 <Method void PdfContentByte.moveTo(double, double)>
				for(i = 0; i < arraylist1.size(); i++)
	//*1035 2481:iconst_0        
	//*1036 2482:istore          18
	//*1037 2484:iload           18
	//*1038 2486:aload           29
	//*1039 2488:invokevirtual   #558 <Method int ArrayList.size()>
	//*1040 2491:icmpge          2548
				{
					double ad3[] = (double[])arraylist1.get(i);
	// 1041 2494:aload           29
	// 1042 2496:iload           18
	// 1043 2498:invokevirtual   #550 <Method Object ArrayList.get(int)>
	// 1044 2501:checkcast       #552 <Class double[]>
	// 1045 2504:astore          30
					cb.curveTo(ad3[2], ad3[3], ad3[4], ad3[5], ad3[6], ad3[7]);
	// 1046 2506:aload_0         
	// 1047 2507:getfield        #164 <Field PdfContentByte cb>
	// 1048 2510:aload           30
	// 1049 2512:iconst_2        
	// 1050 2513:daload          
	// 1051 2514:aload           30
	// 1052 2516:iconst_3        
	// 1053 2517:daload          
	// 1054 2518:aload           30
	// 1055 2520:iconst_4        
	// 1056 2521:daload          
	// 1057 2522:aload           30
	// 1058 2524:iconst_5        
	// 1059 2525:daload          
	// 1060 2526:aload           30
	// 1061 2528:bipush          6
	// 1062 2530:daload          
	// 1063 2531:aload           30
	// 1064 2533:bipush          7
	// 1065 2535:daload          
	// 1066 2536:invokevirtual   #562 <Method void PdfContentByte.curveTo(double, double, double, double, double, double)>
				}

	// 1067 2539:iload           18
	// 1068 2541:iconst_1        
	// 1069 2542:iadd            
	// 1070 2543:istore          18
	//*1071 2545:goto            2484
				cb.lineTo(d2, d5);
	// 1072 2548:aload_0         
	// 1073 2549:getfield        #164 <Field PdfContentByte cb>
	// 1074 2552:dload_2         
	// 1075 2553:dload           4
	// 1076 2555:invokevirtual   #555 <Method void PdfContentByte.lineTo(double, double)>
				strokeAndFill();
	// 1077 2558:aload_0         
	// 1078 2559:invokevirtual   #526 <Method void strokeAndFill()>
			}
		}
		  goto _L35
	//*1079 2562:goto            580
_L23:
		if(!isNullStrokeFill(true))
	//*1080 2565:aload_0         
	//*1081 2566:iconst_1        
	//*1082 2567:invokevirtual   #523 <Method boolean isNullStrokeFill(boolean)>
	//*1083 2570:ifne            580
		{
			float f3 = state.transformY(in.readShort());
	// 1084 2573:aload_0         
	// 1085 2574:getfield        #162 <Field MetaState state>
	// 1086 2577:aload_0         
	// 1087 2578:getfield        #171 <Field InputMeta in>
	// 1088 2581:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1089 2584:invokevirtual   #307 <Method float MetaState.transformY(int)>
	// 1090 2587:fstore          8
			float f10 = state.transformX(in.readShort());
	// 1091 2589:aload_0         
	// 1092 2590:getfield        #162 <Field MetaState state>
	// 1093 2593:aload_0         
	// 1094 2594:getfield        #171 <Field InputMeta in>
	// 1095 2597:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1096 2600:invokevirtual   #304 <Method float MetaState.transformX(int)>
	// 1097 2603:fstore          9
			float f17 = state.transformY(in.readShort());
	// 1098 2605:aload_0         
	// 1099 2606:getfield        #162 <Field MetaState state>
	// 1100 2609:aload_0         
	// 1101 2610:getfield        #171 <Field InputMeta in>
	// 1102 2613:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1103 2616:invokevirtual   #307 <Method float MetaState.transformY(int)>
	// 1104 2619:fstore          10
			float f24 = state.transformX(in.readShort());
	// 1105 2621:aload_0         
	// 1106 2622:getfield        #162 <Field MetaState state>
	// 1107 2625:aload_0         
	// 1108 2626:getfield        #171 <Field InputMeta in>
	// 1109 2629:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1110 2632:invokevirtual   #304 <Method float MetaState.transformX(int)>
	// 1111 2635:fstore          11
			cb.rectangle(f24, f3, f10 - f24, f17 - f3);
	// 1112 2637:aload_0         
	// 1113 2638:getfield        #164 <Field PdfContentByte cb>
	// 1114 2641:fload           11
	// 1115 2643:fload           8
	// 1116 2645:fload           9
	// 1117 2647:fload           11
	// 1118 2649:fsub            
	// 1119 2650:fload           10
	// 1120 2652:fload           8
	// 1121 2654:fsub            
	// 1122 2655:invokevirtual   #365 <Method void PdfContentByte.rectangle(float, float, float, float)>
			strokeAndFill();
	// 1123 2658:aload_0         
	// 1124 2659:invokevirtual   #526 <Method void strokeAndFill()>
		}
		  goto _L35
	//*1125 2662:goto            580
_L27:
		if(!isNullStrokeFill(true))
	//*1126 2665:aload_0         
	//*1127 2666:iconst_1        
	//*1128 2667:invokevirtual   #523 <Method boolean isNullStrokeFill(boolean)>
	//*1129 2670:ifne            580
		{
			float f4 = state.transformY(0);
	// 1130 2673:aload_0         
	// 1131 2674:getfield        #162 <Field MetaState state>
	// 1132 2677:iconst_0        
	// 1133 2678:invokevirtual   #307 <Method float MetaState.transformY(int)>
	// 1134 2681:fstore          8
			float f11 = state.transformY(in.readShort());
	// 1135 2683:aload_0         
	// 1136 2684:getfield        #162 <Field MetaState state>
	// 1137 2687:aload_0         
	// 1138 2688:getfield        #171 <Field InputMeta in>
	// 1139 2691:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1140 2694:invokevirtual   #307 <Method float MetaState.transformY(int)>
	// 1141 2697:fstore          9
			float f18 = state.transformX(in.readShort());
	// 1142 2699:aload_0         
	// 1143 2700:getfield        #162 <Field MetaState state>
	// 1144 2703:aload_0         
	// 1145 2704:getfield        #171 <Field InputMeta in>
	// 1146 2707:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1147 2710:invokevirtual   #304 <Method float MetaState.transformX(int)>
	// 1148 2713:fstore          10
			float f25 = state.transformX(0);
	// 1149 2715:aload_0         
	// 1150 2716:getfield        #162 <Field MetaState state>
	// 1151 2719:iconst_0        
	// 1152 2720:invokevirtual   #304 <Method float MetaState.transformX(int)>
	// 1153 2723:fstore          11
			float f31 = state.transformY(in.readShort());
	// 1154 2725:aload_0         
	// 1155 2726:getfield        #162 <Field MetaState state>
	// 1156 2729:aload_0         
	// 1157 2730:getfield        #171 <Field InputMeta in>
	// 1158 2733:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1159 2736:invokevirtual   #307 <Method float MetaState.transformY(int)>
	// 1160 2739:fstore          12
			float f35 = state.transformX(in.readShort());
	// 1161 2741:aload_0         
	// 1162 2742:getfield        #162 <Field MetaState state>
	// 1163 2745:aload_0         
	// 1164 2746:getfield        #171 <Field InputMeta in>
	// 1165 2749:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1166 2752:invokevirtual   #304 <Method float MetaState.transformX(int)>
	// 1167 2755:fstore          13
			float f39 = state.transformY(in.readShort());
	// 1168 2757:aload_0         
	// 1169 2758:getfield        #162 <Field MetaState state>
	// 1170 2761:aload_0         
	// 1171 2762:getfield        #171 <Field InputMeta in>
	// 1172 2765:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1173 2768:invokevirtual   #307 <Method float MetaState.transformY(int)>
	// 1174 2771:fstore          14
			float f43 = state.transformX(in.readShort());
	// 1175 2773:aload_0         
	// 1176 2774:getfield        #162 <Field MetaState state>
	// 1177 2777:aload_0         
	// 1178 2778:getfield        #171 <Field InputMeta in>
	// 1179 2781:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1180 2784:invokevirtual   #304 <Method float MetaState.transformX(int)>
	// 1181 2787:fstore          15
			cb.roundRectangle(f43, f31, f35 - f43, f39 - f31, ((f4 - f11) + (f18 - f25)) / 4F);
	// 1182 2789:aload_0         
	// 1183 2790:getfield        #164 <Field PdfContentByte cb>
	// 1184 2793:fload           15
	// 1185 2795:fload           12
	// 1186 2797:fload           13
	// 1187 2799:fload           15
	// 1188 2801:fsub            
	// 1189 2802:fload           14
	// 1190 2804:fload           12
	// 1191 2806:fsub            
	// 1192 2807:fload           8
	// 1193 2809:fload           9
	// 1194 2811:fsub            
	// 1195 2812:fload           10
	// 1196 2814:fload           11
	// 1197 2816:fsub            
	// 1198 2817:fadd            
	// 1199 2818:ldc2            #393 <Float 4F>
	// 1200 2821:fdiv            
	// 1201 2822:invokevirtual   #568 <Method void PdfContentByte.roundRectangle(float, float, float, float, float)>
			strokeAndFill();
	// 1202 2825:aload_0         
	// 1203 2826:invokevirtual   #526 <Method void strokeAndFill()>
		}
		  goto _L35
	//*1204 2829:goto            580
_L21:
		float f5 = state.transformY(in.readShort());
	// 1205 2832:aload_0         
	// 1206 2833:getfield        #162 <Field MetaState state>
	// 1207 2836:aload_0         
	// 1208 2837:getfield        #171 <Field InputMeta in>
	// 1209 2840:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1210 2843:invokevirtual   #307 <Method float MetaState.transformY(int)>
	// 1211 2846:fstore          8
		float f12 = state.transformX(in.readShort());
	// 1212 2848:aload_0         
	// 1213 2849:getfield        #162 <Field MetaState state>
	// 1214 2852:aload_0         
	// 1215 2853:getfield        #171 <Field InputMeta in>
	// 1216 2856:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1217 2859:invokevirtual   #304 <Method float MetaState.transformX(int)>
	// 1218 2862:fstore          9
		float f19 = state.transformY(in.readShort());
	// 1219 2864:aload_0         
	// 1220 2865:getfield        #162 <Field MetaState state>
	// 1221 2868:aload_0         
	// 1222 2869:getfield        #171 <Field InputMeta in>
	// 1223 2872:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1224 2875:invokevirtual   #307 <Method float MetaState.transformY(int)>
	// 1225 2878:fstore          10
		float f26 = state.transformX(in.readShort());
	// 1226 2880:aload_0         
	// 1227 2881:getfield        #162 <Field MetaState state>
	// 1228 2884:aload_0         
	// 1229 2885:getfield        #171 <Field InputMeta in>
	// 1230 2888:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1231 2891:invokevirtual   #304 <Method float MetaState.transformX(int)>
	// 1232 2894:fstore          11
		cb.rectangle(f26, f5, f12 - f26, f19 - f5);
	// 1233 2896:aload_0         
	// 1234 2897:getfield        #164 <Field PdfContentByte cb>
	// 1235 2900:fload           11
	// 1236 2902:fload           8
	// 1237 2904:fload           9
	// 1238 2906:fload           11
	// 1239 2908:fsub            
	// 1240 2909:fload           10
	// 1241 2911:fload           8
	// 1242 2913:fsub            
	// 1243 2914:invokevirtual   #365 <Method void PdfContentByte.rectangle(float, float, float, float)>
		cb.eoClip();
	// 1244 2917:aload_0         
	// 1245 2918:getfield        #164 <Field PdfContentByte cb>
	// 1246 2921:invokevirtual   #571 <Method void PdfContentByte.eoClip()>
		cb.newPath();
	// 1247 2924:aload_0         
	// 1248 2925:getfield        #164 <Field PdfContentByte cb>
	// 1249 2928:invokevirtual   #574 <Method void PdfContentByte.newPath()>
		  goto _L35
	//*1250 2931:goto            580
_L31:
		int l1;
		int l3;
		int j5;
		int j6;
		int l7;
		int j8;
		int k8;
		int l8;
		byte abyte1[];
		l7 = in.readShort();
	// 1251 2934:aload_0         
	// 1252 2935:getfield        #171 <Field InputMeta in>
	// 1253 2938:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1254 2941:istore          25
		j8 = in.readShort();
	// 1255 2943:aload_0         
	// 1256 2944:getfield        #171 <Field InputMeta in>
	// 1257 2947:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1258 2950:istore          26
		k8 = in.readWord();
	// 1259 2952:aload_0         
	// 1260 2953:getfield        #171 <Field InputMeta in>
	// 1261 2956:invokevirtual   #418 <Method int InputMeta.readWord()>
	// 1262 2959:istore          27
		l8 = in.readWord();
	// 1263 2961:aload_0         
	// 1264 2962:getfield        #171 <Field InputMeta in>
	// 1265 2965:invokevirtual   #418 <Method int InputMeta.readWord()>
	// 1266 2968:istore          28
		i = 0;
	// 1267 2970:iconst_0        
	// 1268 2971:istore          18
		l1 = 0;
	// 1269 2973:iconst_0        
	// 1270 2974:istore          19
		l3 = 0;
	// 1271 2976:iconst_0        
	// 1272 2977:istore          20
		j5 = 0;
	// 1273 2979:iconst_0        
	// 1274 2980:istore          21
		if((l8 & 6) != 0)
	//*1275 2982:iload           28
	//*1276 2984:bipush          6
	//*1277 2986:iand            
	//*1278 2987:ifeq            3026
		{
			i = in.readShort();
	// 1279 2990:aload_0         
	// 1280 2991:getfield        #171 <Field InputMeta in>
	// 1281 2994:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1282 2997:istore          18
			l1 = in.readShort();
	// 1283 2999:aload_0         
	// 1284 3000:getfield        #171 <Field InputMeta in>
	// 1285 3003:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1286 3006:istore          19
			l3 = in.readShort();
	// 1287 3008:aload_0         
	// 1288 3009:getfield        #171 <Field InputMeta in>
	// 1289 3012:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1290 3015:istore          20
			j5 = in.readShort();
	// 1291 3017:aload_0         
	// 1292 3018:getfield        #171 <Field InputMeta in>
	// 1293 3021:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1294 3024:istore          21
		}
		abyte1 = new byte[k8];
	// 1295 3026:iload           27
	// 1296 3028:newarray        byte[]
	// 1297 3030:astore          30
		j6 = 0;
	// 1298 3032:iconst_0        
	// 1299 3033:istore          22
_L36:
label0:
		{
			byte byte0;
			if(j6 < k8)
	//*1300 3035:iload           22
	//*1301 3037:iload           27
	//*1302 3039:icmpge          3055
			{
				byte0 = (byte)in.readByte();
	// 1303 3042:aload_0         
	// 1304 3043:getfield        #171 <Field InputMeta in>
	// 1305 3046:invokevirtual   #577 <Method int InputMeta.readByte()>
	// 1306 3049:int2byte        
	// 1307 3050:istore_1        
				if(byte0 != 0)
					break label0;
	// 1308 3051:iload_1         
	// 1309 3052:ifne            3095
			}
			String s;
			try
			{
				s = new String(abyte1, 0, j6, "Cp1252");
	// 1310 3055:new             #579 <Class String>
	// 1311 3058:dup             
	// 1312 3059:aload           30
	// 1313 3061:iconst_0        
	// 1314 3062:iload           22
	// 1315 3064:ldc2            #581 <String "Cp1252">
	// 1316 3067:invokespecial   #584 <Method void String(byte[], int, int, String)>
	// 1317 3070:astore          29
			}
	//*1318 3072:aload_0         
	//*1319 3073:iload           26
	//*1320 3075:iload           25
	//*1321 3077:iload           28
	//*1322 3079:iload           18
	//*1323 3081:iload           19
	//*1324 3083:iload           20
	//*1325 3085:iload           21
	//*1326 3087:aload           29
	//*1327 3089:invokevirtual   #586 <Method void outputText(int, int, int, int, int, int, int, String)>
	//*1328 3092:goto            580
	//*1329 3095:aload           30
	//*1330 3097:iload           22
	//*1331 3099:iload_1         
	//*1332 3100:bastore         
	//*1333 3101:iload           22
	//*1334 3103:iconst_1        
	//*1335 3104:iadd            
	//*1336 3105:istore          22
	//*1337 3107:goto            3035
			catch(UnsupportedEncodingException unsupportedencodingexception)
	//*1338 3110:astore          29
			{
				unsupportedencodingexception = ((UnsupportedEncodingException) (new String(abyte1, 0, j6)));
	// 1339 3112:new             #579 <Class String>
	// 1340 3115:dup             
	// 1341 3116:aload           30
	// 1342 3118:iconst_0        
	// 1343 3119:iload           22
	// 1344 3121:invokespecial   #588 <Method void String(byte[], int, int)>
	// 1345 3124:astore          29
			}
			outputText(j8, l7, l8, i, l1, l3, j5, s);
		}
		  goto _L35
		abyte1[j6] = byte0;
		j6++;
		  goto _L36
	//*1346 3126:goto            3072
_L25:
		l1 = in.readWord();
	// 1347 3129:aload_0         
	// 1348 3130:getfield        #171 <Field InputMeta in>
	// 1349 3133:invokevirtual   #418 <Method int InputMeta.readWord()>
	// 1350 3136:istore          19
		abyte1 = new byte[l1];
	// 1351 3138:iload           19
	// 1352 3140:newarray        byte[]
	// 1353 3142:astore          30
		i = 0;
	// 1354 3144:iconst_0        
	// 1355 3145:istore          18
_L37:
label1:
		{
			byte byte1;
			if(i < l1)
	//*1356 3147:iload           18
	//*1357 3149:iload           19
	//*1358 3151:icmpge          3167
			{
				byte1 = (byte)in.readByte();
	// 1359 3154:aload_0         
	// 1360 3155:getfield        #171 <Field InputMeta in>
	// 1361 3158:invokevirtual   #577 <Method int InputMeta.readByte()>
	// 1362 3161:int2byte        
	// 1363 3162:istore_1        
				if(byte1 != 0)
					break label1;
	// 1364 3163:iload_1         
	// 1365 3164:ifne            3234
			}
			String s1;
			try
			{
				s1 = new String(abyte1, 0, i, "Cp1252");
	// 1366 3167:new             #579 <Class String>
	// 1367 3170:dup             
	// 1368 3171:aload           30
	// 1369 3173:iconst_0        
	// 1370 3174:iload           18
	// 1371 3176:ldc2            #581 <String "Cp1252">
	// 1372 3179:invokespecial   #584 <Method void String(byte[], int, int, String)>
	// 1373 3182:astore          29
			}
	//*1374 3184:aload_0         
	//*1375 3185:getfield        #171 <Field InputMeta in>
	//*1376 3188:iload           19
	//*1377 3190:iconst_1        
	//*1378 3191:iadd            
	//*1379 3192:ldc2            #589 <Int 65534>
	//*1380 3195:iand            
	//*1381 3196:iload           18
	//*1382 3198:isub            
	//*1383 3199:invokevirtual   #454 <Method void InputMeta.skip(int)>
	//*1384 3202:aload_0         
	//*1385 3203:getfield        #171 <Field InputMeta in>
	//*1386 3206:invokevirtual   #421 <Method int InputMeta.readShort()>
	//*1387 3209:istore          18
	//*1388 3211:aload_0         
	//*1389 3212:aload_0         
	//*1390 3213:getfield        #171 <Field InputMeta in>
	//*1391 3216:invokevirtual   #421 <Method int InputMeta.readShort()>
	//*1392 3219:iload           18
	//*1393 3221:iconst_0        
	//*1394 3222:iconst_0        
	//*1395 3223:iconst_0        
	//*1396 3224:iconst_0        
	//*1397 3225:iconst_0        
	//*1398 3226:aload           29
	//*1399 3228:invokevirtual   #586 <Method void outputText(int, int, int, int, int, int, int, String)>
	//*1400 3231:goto            580
	//*1401 3234:aload           30
	//*1402 3236:iload           18
	//*1403 3238:iload_1         
	//*1404 3239:bastore         
	//*1405 3240:iload           18
	//*1406 3242:iconst_1        
	//*1407 3243:iadd            
	//*1408 3244:istore          18
	//*1409 3246:goto            3147
			catch(UnsupportedEncodingException unsupportedencodingexception1)
	//*1410 3249:astore          29
			{
				unsupportedencodingexception1 = ((UnsupportedEncodingException) (new String(abyte1, 0, i)));
	// 1411 3251:new             #579 <Class String>
	// 1412 3254:dup             
	// 1413 3255:aload           30
	// 1414 3257:iconst_0        
	// 1415 3258:iload           18
	// 1416 3260:invokespecial   #588 <Method void String(byte[], int, int)>
	// 1417 3263:astore          29
			}
			in.skip((l1 + 1 & 0xfffe) - i);
			i = in.readShort();
			outputText(in.readShort(), i, 0, 0, 0, 0, 0, s1);
		}
		  goto _L35
		abyte1[i] = byte1;
		i++;
		  goto _L37
	//*1418 3265:goto            3184
_L10:
		state.setCurrentBackgroundColor(in.readColor());
	// 1419 3268:aload_0         
	// 1420 3269:getfield        #162 <Field MetaState state>
	// 1421 3272:aload_0         
	// 1422 3273:getfield        #171 <Field InputMeta in>
	// 1423 3276:invokevirtual   #592 <Method com.itextpdf.text.BaseColor InputMeta.readColor()>
	// 1424 3279:invokevirtual   #595 <Method void MetaState.setCurrentBackgroundColor(com.itextpdf.text.BaseColor)>
		  goto _L35
	//*1425 3282:goto            580
_L11:
		state.setCurrentTextColor(in.readColor());
	// 1426 3285:aload_0         
	// 1427 3286:getfield        #162 <Field MetaState state>
	// 1428 3289:aload_0         
	// 1429 3290:getfield        #171 <Field InputMeta in>
	// 1430 3293:invokevirtual   #592 <Method com.itextpdf.text.BaseColor InputMeta.readColor()>
	// 1431 3296:invokevirtual   #598 <Method void MetaState.setCurrentTextColor(com.itextpdf.text.BaseColor)>
		  goto _L35
	//*1432 3299:goto            580
_L8:
		state.setTextAlign(in.readWord());
	// 1433 3302:aload_0         
	// 1434 3303:getfield        #162 <Field MetaState state>
	// 1435 3306:aload_0         
	// 1436 3307:getfield        #171 <Field InputMeta in>
	// 1437 3310:invokevirtual   #418 <Method int InputMeta.readWord()>
	// 1438 3313:invokevirtual   #601 <Method void MetaState.setTextAlign(int)>
		  goto _L35
	//*1439 3316:goto            580
_L4:
		state.setBackgroundMode(in.readWord());
	// 1440 3319:aload_0         
	// 1441 3320:getfield        #162 <Field MetaState state>
	// 1442 3323:aload_0         
	// 1443 3324:getfield        #171 <Field InputMeta in>
	// 1444 3327:invokevirtual   #418 <Method int InputMeta.readWord()>
	// 1445 3330:invokevirtual   #604 <Method void MetaState.setBackgroundMode(int)>
		  goto _L35
	//*1446 3333:goto            580
_L5:
		state.setPolyFillMode(in.readWord());
	// 1447 3336:aload_0         
	// 1448 3337:getfield        #162 <Field MetaState state>
	// 1449 3340:aload_0         
	// 1450 3341:getfield        #171 <Field InputMeta in>
	// 1451 3344:invokevirtual   #418 <Method int InputMeta.readWord()>
	// 1452 3347:invokevirtual   #607 <Method void MetaState.setPolyFillMode(int)>
		  goto _L35
	//*1453 3350:goto            580
_L24:
		com.itextpdf.text.BaseColor basecolor = in.readColor();
	// 1454 3353:aload_0         
	// 1455 3354:getfield        #171 <Field InputMeta in>
	// 1456 3357:invokevirtual   #592 <Method com.itextpdf.text.BaseColor InputMeta.readColor()>
	// 1457 3360:astore          29
		i = in.readShort();
	// 1458 3362:aload_0         
	// 1459 3363:getfield        #171 <Field InputMeta in>
	// 1460 3366:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1461 3369:istore          18
		int i2 = in.readShort();
	// 1462 3371:aload_0         
	// 1463 3372:getfield        #171 <Field InputMeta in>
	// 1464 3375:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1465 3378:istore          19
		cb.saveState();
	// 1466 3380:aload_0         
	// 1467 3381:getfield        #164 <Field PdfContentByte cb>
	// 1468 3384:invokevirtual   #349 <Method void PdfContentByte.saveState()>
		cb.setColorFill(basecolor);
	// 1469 3387:aload_0         
	// 1470 3388:getfield        #164 <Field PdfContentByte cb>
	// 1471 3391:aload           29
	// 1472 3393:invokevirtual   #361 <Method void PdfContentByte.setColorFill(com.itextpdf.text.BaseColor)>
		cb.rectangle(state.transformX(i2), state.transformY(i), 0.2F, 0.2F);
	// 1473 3396:aload_0         
	// 1474 3397:getfield        #164 <Field PdfContentByte cb>
	// 1475 3400:aload_0         
	// 1476 3401:getfield        #162 <Field MetaState state>
	// 1477 3404:iload           19
	// 1478 3406:invokevirtual   #304 <Method float MetaState.transformX(int)>
	// 1479 3409:aload_0         
	// 1480 3410:getfield        #162 <Field MetaState state>
	// 1481 3413:iload           18
	// 1482 3415:invokevirtual   #307 <Method float MetaState.transformY(int)>
	// 1483 3418:ldc2            #608 <Float 0.2F>
	// 1484 3421:ldc2            #608 <Float 0.2F>
	// 1485 3424:invokevirtual   #365 <Method void PdfContentByte.rectangle(float, float, float, float)>
		cb.fill();
	// 1486 3427:aload_0         
	// 1487 3428:getfield        #164 <Field PdfContentByte cb>
	// 1488 3431:invokevirtual   #368 <Method void PdfContentByte.fill()>
		cb.restoreState();
	// 1489 3434:aload_0         
	// 1490 3435:getfield        #164 <Field PdfContentByte cb>
	// 1491 3438:invokevirtual   #401 <Method void PdfContentByte.restoreState()>
		  goto _L35
	//*1492 3441:goto            580
		in.readInt();
	// 1493 3444:aload_0         
	// 1494 3445:getfield        #171 <Field InputMeta in>
	// 1495 3448:invokevirtual   #411 <Method int InputMeta.readInt()>
	// 1496 3451:pop             
		if(i == 3907)
	//*1497 3452:iload           18
	//*1498 3454:sipush          3907
	//*1499 3457:icmpne          3468
			in.readWord();
	// 1500 3460:aload_0         
	// 1501 3461:getfield        #171 <Field InputMeta in>
	// 1502 3464:invokevirtual   #418 <Method int InputMeta.readWord()>
	// 1503 3467:pop             
		int j2 = in.readShort();
	// 1504 3468:aload_0         
	// 1505 3469:getfield        #171 <Field InputMeta in>
	// 1506 3472:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1507 3475:istore          19
		int i4 = in.readShort();
	// 1508 3477:aload_0         
	// 1509 3478:getfield        #171 <Field InputMeta in>
	// 1510 3481:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1511 3484:istore          20
		int k5 = in.readShort();
	// 1512 3486:aload_0         
	// 1513 3487:getfield        #171 <Field InputMeta in>
	// 1514 3490:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1515 3493:istore          21
		int k6 = in.readShort();
	// 1516 3495:aload_0         
	// 1517 3496:getfield        #171 <Field InputMeta in>
	// 1518 3499:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1519 3502:istore          22
		float f6 = state.transformY(in.readShort()) - state.transformY(0);
	// 1520 3504:aload_0         
	// 1521 3505:getfield        #162 <Field MetaState state>
	// 1522 3508:aload_0         
	// 1523 3509:getfield        #171 <Field InputMeta in>
	// 1524 3512:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1525 3515:invokevirtual   #307 <Method float MetaState.transformY(int)>
	// 1526 3518:aload_0         
	// 1527 3519:getfield        #162 <Field MetaState state>
	// 1528 3522:iconst_0        
	// 1529 3523:invokevirtual   #307 <Method float MetaState.transformY(int)>
	// 1530 3526:fsub            
	// 1531 3527:fstore          8
		float f13 = state.transformX(in.readShort()) - state.transformX(0);
	// 1532 3529:aload_0         
	// 1533 3530:getfield        #162 <Field MetaState state>
	// 1534 3533:aload_0         
	// 1535 3534:getfield        #171 <Field InputMeta in>
	// 1536 3537:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1537 3540:invokevirtual   #304 <Method float MetaState.transformX(int)>
	// 1538 3543:aload_0         
	// 1539 3544:getfield        #162 <Field MetaState state>
	// 1540 3547:iconst_0        
	// 1541 3548:invokevirtual   #304 <Method float MetaState.transformX(int)>
	// 1542 3551:fsub            
	// 1543 3552:fstore          9
		float f20 = state.transformY(in.readShort());
	// 1544 3554:aload_0         
	// 1545 3555:getfield        #162 <Field MetaState state>
	// 1546 3558:aload_0         
	// 1547 3559:getfield        #171 <Field InputMeta in>
	// 1548 3562:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1549 3565:invokevirtual   #307 <Method float MetaState.transformY(int)>
	// 1550 3568:fstore          10
		float f27 = state.transformX(in.readShort());
	// 1551 3570:aload_0         
	// 1552 3571:getfield        #162 <Field MetaState state>
	// 1553 3574:aload_0         
	// 1554 3575:getfield        #171 <Field InputMeta in>
	// 1555 3578:invokevirtual   #421 <Method int InputMeta.readShort()>
	// 1556 3581:invokevirtual   #304 <Method float MetaState.transformX(int)>
	// 1557 3584:fstore          11
		byte abyte0[] = new byte[i7 * 2 - (in.getLength() - l6)];
	// 1558 3586:iload           24
	// 1559 3588:iconst_2        
	// 1560 3589:imul            
	// 1561 3590:aload_0         
	// 1562 3591:getfield        #171 <Field InputMeta in>
	// 1563 3594:invokevirtual   #463 <Method int InputMeta.getLength()>
	// 1564 3597:iload           23
	// 1565 3599:isub            
	// 1566 3600:isub            
	// 1567 3601:newarray        byte[]
	// 1568 3603:astore          29
		for(int j = 0; j < abyte0.length; j++)
	//*1569 3605:iconst_0        
	//*1570 3606:istore          18
	//*1571 3608:iload           18
	//*1572 3610:aload           29
	//*1573 3612:arraylength     
	//*1574 3613:icmpge          3638
			abyte0[j] = (byte)in.readByte();
	// 1575 3616:aload           29
	// 1576 3618:iload           18
	// 1577 3620:aload_0         
	// 1578 3621:getfield        #171 <Field InputMeta in>
	// 1579 3624:invokevirtual   #577 <Method int InputMeta.readByte()>
	// 1580 3627:int2byte        
	// 1581 3628:bastore         

	// 1582 3629:iload           18
	// 1583 3631:iconst_1        
	// 1584 3632:iadd            
	// 1585 3633:istore          18
	//*1586 3635:goto            3608
		try
		{
			Image image = BmpImage.getImage(((InputStream) (new ByteArrayInputStream(abyte0))), true, abyte0.length);
	// 1587 3638:new             #610 <Class ByteArrayInputStream>
	// 1588 3641:dup             
	// 1589 3642:aload           29
	// 1590 3644:invokespecial   #613 <Method void ByteArrayInputStream(byte[])>
	// 1591 3647:iconst_1        
	// 1592 3648:aload           29
	// 1593 3650:arraylength     
	// 1594 3651:invokestatic    #619 <Method Image BmpImage.getImage(InputStream, boolean, int)>
	// 1595 3654:astore          29
			cb.saveState();
	// 1596 3656:aload_0         
	// 1597 3657:getfield        #164 <Field PdfContentByte cb>
	// 1598 3660:invokevirtual   #349 <Method void PdfContentByte.saveState()>
			cb.rectangle(f27, f20, f13, f6);
	// 1599 3663:aload_0         
	// 1600 3664:getfield        #164 <Field PdfContentByte cb>
	// 1601 3667:fload           11
	// 1602 3669:fload           10
	// 1603 3671:fload           9
	// 1604 3673:fload           8
	// 1605 3675:invokevirtual   #365 <Method void PdfContentByte.rectangle(float, float, float, float)>
			cb.clip();
	// 1606 3678:aload_0         
	// 1607 3679:getfield        #164 <Field PdfContentByte cb>
	// 1608 3682:invokevirtual   #622 <Method void PdfContentByte.clip()>
			cb.newPath();
	// 1609 3685:aload_0         
	// 1610 3686:getfield        #164 <Field PdfContentByte cb>
	// 1611 3689:invokevirtual   #574 <Method void PdfContentByte.newPath()>
			image.scaleAbsolute((image.getWidth() * f13) / (float)i4, (-f6 * image.getHeight()) / (float)j2);
	// 1612 3692:aload           29
	// 1613 3694:aload           29
	// 1614 3696:invokevirtual   #256 <Method float Image.getWidth()>
	// 1615 3699:fload           9
	// 1616 3701:fmul            
	// 1617 3702:iload           20
	// 1618 3704:i2f             
	// 1619 3705:fdiv            
	// 1620 3706:fload           8
	// 1621 3708:fneg            
	// 1622 3709:aload           29
	// 1623 3711:invokevirtual   #253 <Method float Image.getHeight()>
	// 1624 3714:fmul            
	// 1625 3715:iload           19
	// 1626 3717:i2f             
	// 1627 3718:fdiv            
	// 1628 3719:invokevirtual   #625 <Method void Image.scaleAbsolute(float, float)>
			image.setAbsolutePosition(f27 - ((float)k6 * f13) / (float)i4, (((float)k5 * f6) / (float)j2 + f20) - image.getScaledHeight());
	// 1629 3722:aload           29
	// 1630 3724:fload           11
	// 1631 3726:iload           22
	// 1632 3728:i2f             
	// 1633 3729:fload           9
	// 1634 3731:fmul            
	// 1635 3732:iload           20
	// 1636 3734:i2f             
	// 1637 3735:fdiv            
	// 1638 3736:fsub            
	// 1639 3737:iload           21
	// 1640 3739:i2f             
	// 1641 3740:fload           8
	// 1642 3742:fmul            
	// 1643 3743:iload           19
	// 1644 3745:i2f             
	// 1645 3746:fdiv            
	// 1646 3747:fload           10
	// 1647 3749:fadd            
	// 1648 3750:aload           29
	// 1649 3752:invokevirtual   #628 <Method float Image.getScaledHeight()>
	// 1650 3755:fsub            
	// 1651 3756:invokevirtual   #631 <Method void Image.setAbsolutePosition(float, float)>
			cb.addImage(image);
	// 1652 3759:aload_0         
	// 1653 3760:getfield        #164 <Field PdfContentByte cb>
	// 1654 3763:aload           29
	// 1655 3765:invokevirtual   #635 <Method void PdfContentByte.addImage(Image)>
			cb.restoreState();
	// 1656 3768:aload_0         
	// 1657 3769:getfield        #164 <Field PdfContentByte cb>
	// 1658 3772:invokevirtual   #401 <Method void PdfContentByte.restoreState()>
		}
	//*1659 3775:goto            580
		catch(Exception exception) { }
	// 1660 3778:astore          29
		  goto _L35
	//*1661 3780:goto            580
	}

	public void strokeAndFill()
	{
		MetaPen metapen = state.getCurrentPen();
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field MetaState state>
	//    2    4:invokevirtual   #272 <Method MetaPen MetaState.getCurrentPen()>
	//    3    7:astore_3        
		MetaBrush metabrush = state.getCurrentBrush();
	//    4    8:aload_0         
	//    5    9:getfield        #162 <Field MetaState state>
	//    6   12:invokevirtual   #276 <Method MetaBrush MetaState.getCurrentBrush()>
	//    7   15:astore          4
		int i = metapen.getStyle();
	//    8   17:aload_3         
	//    9   18:invokevirtual   #281 <Method int MetaPen.getStyle()>
	//   10   21:istore_1        
		int j = metabrush.getStyle();
	//   11   22:aload           4
	//   12   24:invokevirtual   #284 <Method int MetaBrush.getStyle()>
	//   13   27:istore_2        
		if(i == 5)
	//*  14   28:iload_1         
	//*  15   29:iconst_5        
	//*  16   30:icmpne          67
		{
			cb.closePath();
	//   17   33:aload_0         
	//   18   34:getfield        #164 <Field PdfContentByte cb>
	//   19   37:invokevirtual   #638 <Method void PdfContentByte.closePath()>
			if(state.getPolyFillMode() == 1)
	//*  20   40:aload_0         
	//*  21   41:getfield        #162 <Field MetaState state>
	//*  22   44:invokevirtual   #641 <Method int MetaState.getPolyFillMode()>
	//*  23   47:iconst_1        
	//*  24   48:icmpne          59
			{
				cb.eoFill();
	//   25   51:aload_0         
	//   26   52:getfield        #164 <Field PdfContentByte cb>
	//   27   55:invokevirtual   #644 <Method void PdfContentByte.eoFill()>
				return;
	//   28   58:return          
			} else
			{
				cb.fill();
	//   29   59:aload_0         
	//   30   60:getfield        #164 <Field PdfContentByte cb>
	//   31   63:invokevirtual   #368 <Method void PdfContentByte.fill()>
				return;
	//   32   66:return          
			}
		}
		boolean flag;
		if(j == 0 || j == 2 && state.getBackgroundMode() == 2)
	//*  33   67:iload_2         
	//*  34   68:ifeq            87
	//*  35   71:iload_2         
	//*  36   72:iconst_2        
	//*  37   73:icmpne          112
	//*  38   76:aload_0         
	//*  39   77:getfield        #162 <Field MetaState state>
	//*  40   80:invokevirtual   #287 <Method int MetaState.getBackgroundMode()>
	//*  41   83:iconst_2        
	//*  42   84:icmpne          112
			flag = true;
	//   43   87:iconst_1        
	//   44   88:istore_1        
		else
	//*  45   89:iload_1         
	//*  46   90:ifeq            125
	//*  47   93:aload_0         
	//*  48   94:getfield        #162 <Field MetaState state>
	//*  49   97:invokevirtual   #641 <Method int MetaState.getPolyFillMode()>
	//*  50  100:iconst_1        
	//*  51  101:icmpne          117
	//*  52  104:aload_0         
	//*  53  105:getfield        #164 <Field PdfContentByte cb>
	//*  54  108:invokevirtual   #647 <Method void PdfContentByte.closePathEoFillStroke()>
	//*  55  111:return          
			flag = false;
	//   56  112:iconst_0        
	//   57  113:istore_1        
		if(flag)
		{
			if(state.getPolyFillMode() == 1)
			{
				cb.closePathEoFillStroke();
				return;
			} else
	//*  58  114:goto            89
			{
				cb.closePathFillStroke();
	//   59  117:aload_0         
	//   60  118:getfield        #164 <Field PdfContentByte cb>
	//   61  121:invokevirtual   #650 <Method void PdfContentByte.closePathFillStroke()>
				return;
	//   62  124:return          
			}
		} else
		{
			cb.closePathStroke();
	//   63  125:aload_0         
	//   64  126:getfield        #164 <Field PdfContentByte cb>
	//   65  129:invokevirtual   #653 <Method void PdfContentByte.closePathStroke()>
			return;
	//   66  132:return          
		}
	}

	public static final int META_ANIMATEPALETTE = 1078;
	public static final int META_ARC = 2071;
	public static final int META_BITBLT = 2338;
	public static final int META_CHORD = 2096;
	public static final int META_CREATEBRUSHINDIRECT = 764;
	public static final int META_CREATEFONTINDIRECT = 763;
	public static final int META_CREATEPALETTE = 247;
	public static final int META_CREATEPATTERNBRUSH = 505;
	public static final int META_CREATEPENINDIRECT = 762;
	public static final int META_CREATEREGION = 1791;
	public static final int META_DELETEOBJECT = 496;
	public static final int META_DIBBITBLT = 2368;
	public static final int META_DIBCREATEPATTERNBRUSH = 322;
	public static final int META_DIBSTRETCHBLT = 2881;
	public static final int META_ELLIPSE = 1048;
	public static final int META_ESCAPE = 1574;
	public static final int META_EXCLUDECLIPRECT = 1045;
	public static final int META_EXTFLOODFILL = 1352;
	public static final int META_EXTTEXTOUT = 2610;
	public static final int META_FILLREGION = 552;
	public static final int META_FLOODFILL = 1049;
	public static final int META_FRAMEREGION = 1065;
	public static final int META_INTERSECTCLIPRECT = 1046;
	public static final int META_INVERTREGION = 298;
	public static final int META_LINETO = 531;
	public static final int META_MOVETO = 532;
	public static final int META_OFFSETCLIPRGN = 544;
	public static final int META_OFFSETVIEWPORTORG = 529;
	public static final int META_OFFSETWINDOWORG = 527;
	public static final int META_PAINTREGION = 299;
	public static final int META_PATBLT = 1565;
	public static final int META_PIE = 2074;
	public static final int META_POLYGON = 804;
	public static final int META_POLYLINE = 805;
	public static final int META_POLYPOLYGON = 1336;
	public static final int META_REALIZEPALETTE = 53;
	public static final int META_RECTANGLE = 1051;
	public static final int META_RESIZEPALETTE = 313;
	public static final int META_RESTOREDC = 295;
	public static final int META_ROUNDRECT = 1564;
	public static final int META_SAVEDC = 30;
	public static final int META_SCALEVIEWPORTEXT = 1042;
	public static final int META_SCALEWINDOWEXT = 1040;
	public static final int META_SELECTCLIPREGION = 300;
	public static final int META_SELECTOBJECT = 301;
	public static final int META_SELECTPALETTE = 564;
	public static final int META_SETBKCOLOR = 513;
	public static final int META_SETBKMODE = 258;
	public static final int META_SETDIBTODEV = 3379;
	public static final int META_SETMAPMODE = 259;
	public static final int META_SETMAPPERFLAGS = 561;
	public static final int META_SETPALENTRIES = 55;
	public static final int META_SETPIXEL = 1055;
	public static final int META_SETPOLYFILLMODE = 262;
	public static final int META_SETRELABS = 261;
	public static final int META_SETROP2 = 260;
	public static final int META_SETSTRETCHBLTMODE = 263;
	public static final int META_SETTEXTALIGN = 302;
	public static final int META_SETTEXTCHAREXTRA = 264;
	public static final int META_SETTEXTCOLOR = 521;
	public static final int META_SETTEXTJUSTIFICATION = 522;
	public static final int META_SETVIEWPORTEXT = 526;
	public static final int META_SETVIEWPORTORG = 525;
	public static final int META_SETWINDOWEXT = 524;
	public static final int META_SETWINDOWORG = 523;
	public static final int META_STRETCHBLT = 2851;
	public static final int META_STRETCHDIB = 3907;
	public static final int META_TEXTOUT = 1313;
	int bottom;
	public PdfContentByte cb;
	public InputMeta in;
	int inch;
	int left;
	int right;
	MetaState state;
	int top;
}
