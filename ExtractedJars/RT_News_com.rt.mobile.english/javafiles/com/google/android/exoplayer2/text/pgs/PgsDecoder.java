// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.pgs;

import android.graphics.Bitmap;
import com.google.android.exoplayer2.text.*;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.*;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

// Referenced classes of package com.google.android.exoplayer2.text.pgs:
//			PgsSubtitle

public final class PgsDecoder extends SimpleSubtitleDecoder
{
	private static final class CueBuilder
	{

		private void parseBitmapSection(ParsableByteArray parsablebytearray, int i)
		{
			if(i < 4)
		//*   0    0:iload_2         
		//*   1    1:iconst_4        
		//*   2    2:icmpge          6
				return;
		//    3    5:return          
			parsablebytearray.skipBytes(3);
		//    4    6:aload_1         
		//    5    7:iconst_3        
		//    6    8:invokevirtual   #50  <Method void ParsableByteArray.skipBytes(int)>
			boolean flag;
			if((0x80 & parsablebytearray.readUnsignedByte()) != 0)
		//*   7   11:sipush          128
		//*   8   14:aload_1         
		//*   9   15:invokevirtual   #54  <Method int ParsableByteArray.readUnsignedByte()>
		//*  10   18:iand            
		//*  11   19:ifeq            27
				flag = true;
		//   12   22:iconst_1        
		//   13   23:istore_3        
			else
		//*  14   24:goto            29
				flag = false;
		//   15   27:iconst_0        
		//   16   28:istore_3        
			int k = i - 4;
		//   17   29:iload_2         
		//   18   30:iconst_4        
		//   19   31:isub            
		//   20   32:istore          4
			i = k;
		//   21   34:iload           4
		//   22   36:istore_2        
			if(flag)
		//*  23   37:iload_3         
		//*  24   38:ifeq            92
			{
				if(k < 7)
		//*  25   41:iload           4
		//*  26   43:bipush          7
		//*  27   45:icmpge          49
					return;
		//   28   48:return          
				i = parsablebytearray.readUnsignedInt24();
		//   29   49:aload_1         
		//   30   50:invokevirtual   #57  <Method int ParsableByteArray.readUnsignedInt24()>
		//   31   53:istore_2        
				if(i < 4)
		//*  32   54:iload_2         
		//*  33   55:iconst_4        
		//*  34   56:icmpge          60
					return;
		//   35   59:return          
				bitmapWidth = parsablebytearray.readUnsignedShort();
		//   36   60:aload_0         
		//   37   61:aload_1         
		//   38   62:invokevirtual   #60  <Method int ParsableByteArray.readUnsignedShort()>
		//   39   65:putfield        #62  <Field int bitmapWidth>
				bitmapHeight = parsablebytearray.readUnsignedShort();
		//   40   68:aload_0         
		//   41   69:aload_1         
		//   42   70:invokevirtual   #60  <Method int ParsableByteArray.readUnsignedShort()>
		//   43   73:putfield        #64  <Field int bitmapHeight>
				bitmapData.reset(i - 4);
		//   44   76:aload_0         
		//   45   77:getfield        #29  <Field ParsableByteArray bitmapData>
		//   46   80:iload_2         
		//   47   81:iconst_4        
		//   48   82:isub            
		//   49   83:invokevirtual   #67  <Method void ParsableByteArray.reset(int)>
				i = k - 7;
		//   50   86:iload           4
		//   51   88:bipush          7
		//   52   90:isub            
		//   53   91:istore_2        
			}
			int j = bitmapData.getPosition();
		//   54   92:aload_0         
		//   55   93:getfield        #29  <Field ParsableByteArray bitmapData>
		//   56   96:invokevirtual   #70  <Method int ParsableByteArray.getPosition()>
		//   57   99:istore_3        
			k = bitmapData.limit();
		//   58  100:aload_0         
		//   59  101:getfield        #29  <Field ParsableByteArray bitmapData>
		//   60  104:invokevirtual   #73  <Method int ParsableByteArray.limit()>
		//   61  107:istore          4
			if(j < k && i > 0)
		//*  62  109:iload_3         
		//*  63  110:iload           4
		//*  64  112:icmpge          151
		//*  65  115:iload_2         
		//*  66  116:ifle            151
			{
				i = Math.min(i, k - j);
		//   67  119:iload_2         
		//   68  120:iload           4
		//   69  122:iload_3         
		//   70  123:isub            
		//   71  124:invokestatic    #79  <Method int Math.min(int, int)>
		//   72  127:istore_2        
				parsablebytearray.readBytes(bitmapData.data, j, i);
		//   73  128:aload_1         
		//   74  129:aload_0         
		//   75  130:getfield        #29  <Field ParsableByteArray bitmapData>
		//   76  133:getfield        #83  <Field byte[] ParsableByteArray.data>
		//   77  136:iload_3         
		//   78  137:iload_2         
		//   79  138:invokevirtual   #87  <Method void ParsableByteArray.readBytes(byte[], int, int)>
				bitmapData.setPosition(j + i);
		//   80  141:aload_0         
		//   81  142:getfield        #29  <Field ParsableByteArray bitmapData>
		//   82  145:iload_3         
		//   83  146:iload_2         
		//   84  147:iadd            
		//   85  148:invokevirtual   #90  <Method void ParsableByteArray.setPosition(int)>
			}
		//   86  151:return          
		}

		private void parseIdentifierSection(ParsableByteArray parsablebytearray, int i)
		{
			if(i < 19)
		//*   0    0:iload_2         
		//*   1    1:bipush          19
		//*   2    3:icmpge          7
			{
				return;
		//    3    6:return          
			} else
			{
				planeWidth = parsablebytearray.readUnsignedShort();
		//    4    7:aload_0         
		//    5    8:aload_1         
		//    6    9:invokevirtual   #60  <Method int ParsableByteArray.readUnsignedShort()>
		//    7   12:putfield        #92  <Field int planeWidth>
				planeHeight = parsablebytearray.readUnsignedShort();
		//    8   15:aload_0         
		//    9   16:aload_1         
		//   10   17:invokevirtual   #60  <Method int ParsableByteArray.readUnsignedShort()>
		//   11   20:putfield        #94  <Field int planeHeight>
				parsablebytearray.skipBytes(11);
		//   12   23:aload_1         
		//   13   24:bipush          11
		//   14   26:invokevirtual   #50  <Method void ParsableByteArray.skipBytes(int)>
				bitmapX = parsablebytearray.readUnsignedShort();
		//   15   29:aload_0         
		//   16   30:aload_1         
		//   17   31:invokevirtual   #60  <Method int ParsableByteArray.readUnsignedShort()>
		//   18   34:putfield        #96  <Field int bitmapX>
				bitmapY = parsablebytearray.readUnsignedShort();
		//   19   37:aload_0         
		//   20   38:aload_1         
		//   21   39:invokevirtual   #60  <Method int ParsableByteArray.readUnsignedShort()>
		//   22   42:putfield        #98  <Field int bitmapY>
				return;
		//   23   45:return          
			}
		}

		private void parsePaletteSection(ParsableByteArray parsablebytearray, int i)
		{
			if(i % 5 != 2)
		//*   0    0:iload_2         
		//*   1    1:iconst_5        
		//*   2    2:irem            
		//*   3    3:iconst_2        
		//*   4    4:icmpeq          8
				return;
		//    5    7:return          
			parsablebytearray.skipBytes(2);
		//    6    8:aload_1         
		//    7    9:iconst_2        
		//    8   10:invokevirtual   #50  <Method void ParsableByteArray.skipBytes(int)>
			Arrays.fill(colors, 0);
		//    9   13:aload_0         
		//   10   14:getfield        #31  <Field int[] colors>
		//   11   17:iconst_0        
		//   12   18:invokestatic    #104 <Method void Arrays.fill(int[], int)>
			int j = i / 5;
		//   13   21:iload_2         
		//   14   22:iconst_5        
		//   15   23:idiv            
		//   16   24:istore          9
			for(i = 0; i < j; i++)
		//*  17   26:iconst_0        
		//*  18   27:istore_2        
		//*  19   28:iload_2         
		//*  20   29:iload           9
		//*  21   31:icmpge          193
			{
				int k = parsablebytearray.readUnsignedByte();
		//   22   34:aload_1         
		//   23   35:invokevirtual   #54  <Method int ParsableByteArray.readUnsignedByte()>
		//   24   38:istore          10
				int j1 = parsablebytearray.readUnsignedByte();
		//   25   40:aload_1         
		//   26   41:invokevirtual   #54  <Method int ParsableByteArray.readUnsignedByte()>
		//   27   44:istore          13
				int k1 = parsablebytearray.readUnsignedByte();
		//   28   46:aload_1         
		//   29   47:invokevirtual   #54  <Method int ParsableByteArray.readUnsignedByte()>
		//   30   50:istore          14
				int i1 = parsablebytearray.readUnsignedByte();
		//   31   52:aload_1         
		//   32   53:invokevirtual   #54  <Method int ParsableByteArray.readUnsignedByte()>
		//   33   56:istore          12
				int l = parsablebytearray.readUnsignedByte();
		//   34   58:aload_1         
		//   35   59:invokevirtual   #54  <Method int ParsableByteArray.readUnsignedByte()>
		//   36   62:istore          11
				double d = j1;
		//   37   64:iload           13
		//   38   66:i2d             
		//   39   67:dstore_3        
				double d1 = k1 - 128;
		//   40   68:iload           14
		//   41   70:sipush          128
		//   42   73:isub            
		//   43   74:i2d             
		//   44   75:dstore          5
				j1 = (int)(1.4019999999999999D * d1 + d);
		//   45   77:ldc2w           #105 <Double 1.4019999999999999D>
		//   46   80:dload           5
		//   47   82:dmul            
		//   48   83:dload_3         
		//   49   84:dadd            
		//   50   85:d2i             
		//   51   86:istore          13
				double d2 = i1 - 128;
		//   52   88:iload           12
		//   53   90:sipush          128
		//   54   93:isub            
		//   55   94:i2d             
		//   56   95:dstore          7
				k1 = (int)(d - 0.34414D * d2 - 0.71414D * d1);
		//   57   97:dload_3         
		//   58   98:ldc2w           #107 <Double 0.34414D>
		//   59  101:dload           7
		//   60  103:dmul            
		//   61  104:dsub            
		//   62  105:ldc2w           #109 <Double 0.71414D>
		//   63  108:dload           5
		//   64  110:dmul            
		//   65  111:dsub            
		//   66  112:d2i             
		//   67  113:istore          14
				i1 = (int)(d + 1.772D * d2);
		//   68  115:dload_3         
		//   69  116:ldc2w           #111 <Double 1.772D>
		//   70  119:dload           7
		//   71  121:dmul            
		//   72  122:dadd            
		//   73  123:d2i             
		//   74  124:istore          12
				int ai[] = colors;
		//   75  126:aload_0         
		//   76  127:getfield        #31  <Field int[] colors>
		//   77  130:astore          15
				j1 = Util.constrainValue(j1, 0, 255);
		//   78  132:iload           13
		//   79  134:iconst_0        
		//   80  135:sipush          255
		//   81  138:invokestatic    #118 <Method int Util.constrainValue(int, int, int)>
		//   82  141:istore          13
				k1 = Util.constrainValue(k1, 0, 255);
		//   83  143:iload           14
		//   84  145:iconst_0        
		//   85  146:sipush          255
		//   86  149:invokestatic    #118 <Method int Util.constrainValue(int, int, int)>
		//   87  152:istore          14
				ai[k] = Util.constrainValue(i1, 0, 255) | (k1 << 8 | (l << 24 | j1 << 16));
		//   88  154:aload           15
		//   89  156:iload           10
		//   90  158:iload           12
		//   91  160:iconst_0        
		//   92  161:sipush          255
		//   93  164:invokestatic    #118 <Method int Util.constrainValue(int, int, int)>
		//   94  167:iload           14
		//   95  169:bipush          8
		//   96  171:ishl            
		//   97  172:iload           11
		//   98  174:bipush          24
		//   99  176:ishl            
		//  100  177:iload           13
		//  101  179:bipush          16
		//  102  181:ishl            
		//  103  182:ior             
		//  104  183:ior             
		//  105  184:ior             
		//  106  185:iastore         
			}

		//  107  186:iload_2         
		//  108  187:iconst_1        
		//  109  188:iadd            
		//  110  189:istore_2        
		//* 111  190:goto            28
			colorsSet = true;
		//  112  193:aload_0         
		//  113  194:iconst_1        
		//  114  195:putfield        #120 <Field boolean colorsSet>
		//  115  198:return          
		}

		public Cue build()
		{
			if(planeWidth != 0 && planeHeight != 0 && bitmapWidth != 0 && bitmapHeight != 0 && bitmapData.limit() != 0 && bitmapData.getPosition() == bitmapData.limit() && colorsSet)
		//*   0    0:aload_0         
		//*   1    1:getfield        #92  <Field int planeWidth>
		//*   2    4:ifeq            282
		//*   3    7:aload_0         
		//*   4    8:getfield        #94  <Field int planeHeight>
		//*   5   11:ifeq            282
		//*   6   14:aload_0         
		//*   7   15:getfield        #62  <Field int bitmapWidth>
		//*   8   18:ifeq            282
		//*   9   21:aload_0         
		//*  10   22:getfield        #64  <Field int bitmapHeight>
		//*  11   25:ifeq            282
		//*  12   28:aload_0         
		//*  13   29:getfield        #29  <Field ParsableByteArray bitmapData>
		//*  14   32:invokevirtual   #73  <Method int ParsableByteArray.limit()>
		//*  15   35:ifeq            282
		//*  16   38:aload_0         
		//*  17   39:getfield        #29  <Field ParsableByteArray bitmapData>
		//*  18   42:invokevirtual   #70  <Method int ParsableByteArray.getPosition()>
		//*  19   45:aload_0         
		//*  20   46:getfield        #29  <Field ParsableByteArray bitmapData>
		//*  21   49:invokevirtual   #73  <Method int ParsableByteArray.limit()>
		//*  22   52:icmpne          282
		//*  23   55:aload_0         
		//*  24   56:getfield        #120 <Field boolean colorsSet>
		//*  25   59:ifne            65
		//*  26   62:goto            282
			{
				bitmapData.setPosition(0);
		//   27   65:aload_0         
		//   28   66:getfield        #29  <Field ParsableByteArray bitmapData>
		//   29   69:iconst_0        
		//   30   70:invokevirtual   #90  <Method void ParsableByteArray.setPosition(int)>
				int ai[] = new int[bitmapWidth * bitmapHeight];
		//   31   73:aload_0         
		//   32   74:getfield        #62  <Field int bitmapWidth>
		//   33   77:aload_0         
		//   34   78:getfield        #64  <Field int bitmapHeight>
		//   35   81:imul            
		//   36   82:newarray        int[]
		//   37   84:astore          4
				int i = 0;
		//   38   86:iconst_0        
		//   39   87:istore_1        
				do
				{
					if(i >= ai.length)
						break;
		//   40   88:iload_1         
		//   41   89:aload           4
		//   42   91:arraylength     
		//   43   92:icmpge          212
					int l = bitmapData.readUnsignedByte();
		//   44   95:aload_0         
		//   45   96:getfield        #29  <Field ParsableByteArray bitmapData>
		//   46   99:invokevirtual   #54  <Method int ParsableByteArray.readUnsignedByte()>
		//   47  102:istore_3        
					if(l != 0)
		//*  48  103:iload_3         
		//*  49  104:ifeq            126
					{
						int j = i + 1;
		//   50  107:iload_1         
		//   51  108:iconst_1        
		//   52  109:iadd            
		//   53  110:istore_2        
						ai[i] = colors[l];
		//   54  111:aload           4
		//   55  113:iload_1         
		//   56  114:aload_0         
		//   57  115:getfield        #31  <Field int[] colors>
		//   58  118:iload_3         
		//   59  119:iaload          
		//   60  120:iastore         
						i = j;
		//   61  121:iload_2         
		//   62  122:istore_1        
					} else
		//*  63  123:goto            88
					{
						int i1 = bitmapData.readUnsignedByte();
		//   64  126:aload_0         
		//   65  127:getfield        #29  <Field ParsableByteArray bitmapData>
		//   66  130:invokevirtual   #54  <Method int ParsableByteArray.readUnsignedByte()>
		//   67  133:istore_3        
						if(i1 != 0)
		//*  68  134:iload_3         
		//*  69  135:ifeq            88
						{
							int k;
							if((i1 & 0x40) == 0)
		//*  70  138:iload_3         
		//*  71  139:bipush          64
		//*  72  141:iand            
		//*  73  142:ifne            153
								k = i1 & 0x3f;
		//   74  145:iload_3         
		//   75  146:bipush          63
		//   76  148:iand            
		//   77  149:istore_2        
							else
		//*  78  150:goto            169
								k = (i1 & 0x3f) << 8 | bitmapData.readUnsignedByte();
		//   79  153:iload_3         
		//   80  154:bipush          63
		//   81  156:iand            
		//   82  157:bipush          8
		//   83  159:ishl            
		//   84  160:aload_0         
		//   85  161:getfield        #29  <Field ParsableByteArray bitmapData>
		//   86  164:invokevirtual   #54  <Method int ParsableByteArray.readUnsignedByte()>
		//   87  167:ior             
		//   88  168:istore_2        
							if((i1 & 0x80) == 0)
		//*  89  169:iload_3         
		//*  90  170:sipush          128
		//*  91  173:iand            
		//*  92  174:ifne            182
								i1 = 0;
		//   93  177:iconst_0        
		//   94  178:istore_3        
							else
		//*  95  179:goto            195
								i1 = colors[bitmapData.readUnsignedByte()];
		//   96  182:aload_0         
		//   97  183:getfield        #31  <Field int[] colors>
		//   98  186:aload_0         
		//   99  187:getfield        #29  <Field ParsableByteArray bitmapData>
		//  100  190:invokevirtual   #54  <Method int ParsableByteArray.readUnsignedByte()>
		//  101  193:iaload          
		//  102  194:istore_3        
							k += i;
		//  103  195:iload_2         
		//  104  196:iload_1         
		//  105  197:iadd            
		//  106  198:istore_2        
							Arrays.fill(ai, i, k, i1);
		//  107  199:aload           4
		//  108  201:iload_1         
		//  109  202:iload_2         
		//  110  203:iload_3         
		//  111  204:invokestatic    #125 <Method void Arrays.fill(int[], int, int, int)>
							i = k;
		//  112  207:iload_2         
		//  113  208:istore_1        
						}
					}
				} while(true);
		//  114  209:goto            123
				return new Cue(Bitmap.createBitmap(ai, bitmapWidth, bitmapHeight, android.graphics.Bitmap.Config.ARGB_8888), (float)bitmapX / (float)planeWidth, 0, (float)bitmapY / (float)planeHeight, 0, (float)bitmapWidth / (float)planeWidth, (float)bitmapHeight / (float)planeHeight);
		//  115  212:new             #127 <Class Cue>
		//  116  215:dup             
		//  117  216:aload           4
		//  118  218:aload_0         
		//  119  219:getfield        #62  <Field int bitmapWidth>
		//  120  222:aload_0         
		//  121  223:getfield        #64  <Field int bitmapHeight>
		//  122  226:getstatic       #133 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
		//  123  229:invokestatic    #139 <Method Bitmap Bitmap.createBitmap(int[], int, int, android.graphics.Bitmap$Config)>
		//  124  232:aload_0         
		//  125  233:getfield        #96  <Field int bitmapX>
		//  126  236:i2f             
		//  127  237:aload_0         
		//  128  238:getfield        #92  <Field int planeWidth>
		//  129  241:i2f             
		//  130  242:fdiv            
		//  131  243:iconst_0        
		//  132  244:aload_0         
		//  133  245:getfield        #98  <Field int bitmapY>
		//  134  248:i2f             
		//  135  249:aload_0         
		//  136  250:getfield        #94  <Field int planeHeight>
		//  137  253:i2f             
		//  138  254:fdiv            
		//  139  255:iconst_0        
		//  140  256:aload_0         
		//  141  257:getfield        #62  <Field int bitmapWidth>
		//  142  260:i2f             
		//  143  261:aload_0         
		//  144  262:getfield        #92  <Field int planeWidth>
		//  145  265:i2f             
		//  146  266:fdiv            
		//  147  267:aload_0         
		//  148  268:getfield        #64  <Field int bitmapHeight>
		//  149  271:i2f             
		//  150  272:aload_0         
		//  151  273:getfield        #94  <Field int planeHeight>
		//  152  276:i2f             
		//  153  277:fdiv            
		//  154  278:invokespecial   #142 <Method void Cue(Bitmap, float, int, float, int, float, float)>
		//  155  281:areturn         
			} else
			{
				return null;
		//  156  282:aconst_null     
		//  157  283:areturn         
			}
		}

		public void reset()
		{
			planeWidth = 0;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #92  <Field int planeWidth>
			planeHeight = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #94  <Field int planeHeight>
			bitmapX = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #96  <Field int bitmapX>
			bitmapY = 0;
		//    9   15:aload_0         
		//   10   16:iconst_0        
		//   11   17:putfield        #98  <Field int bitmapY>
			bitmapWidth = 0;
		//   12   20:aload_0         
		//   13   21:iconst_0        
		//   14   22:putfield        #62  <Field int bitmapWidth>
			bitmapHeight = 0;
		//   15   25:aload_0         
		//   16   26:iconst_0        
		//   17   27:putfield        #64  <Field int bitmapHeight>
			bitmapData.reset(0);
		//   18   30:aload_0         
		//   19   31:getfield        #29  <Field ParsableByteArray bitmapData>
		//   20   34:iconst_0        
		//   21   35:invokevirtual   #67  <Method void ParsableByteArray.reset(int)>
			colorsSet = false;
		//   22   38:aload_0         
		//   23   39:iconst_0        
		//   24   40:putfield        #120 <Field boolean colorsSet>
		//   25   43:return          
		}

		private final ParsableByteArray bitmapData = new ParsableByteArray();
		private int bitmapHeight;
		private int bitmapWidth;
		private int bitmapX;
		private int bitmapY;
		private final int colors[] = new int[256];
		private boolean colorsSet;
		private int planeHeight;
		private int planeWidth;


/*
		static void access$000(CueBuilder cuebuilder, ParsableByteArray parsablebytearray, int i)
		{
			cuebuilder.parsePaletteSection(parsablebytearray, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #38  <Method void parsePaletteSection(ParsableByteArray, int)>
			return;
		//    4    6:return          
		}

*/


/*
		static void access$100(CueBuilder cuebuilder, ParsableByteArray parsablebytearray, int i)
		{
			cuebuilder.parseBitmapSection(parsablebytearray, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #42  <Method void parseBitmapSection(ParsableByteArray, int)>
			return;
		//    4    6:return          
		}

*/


/*
		static void access$200(CueBuilder cuebuilder, ParsableByteArray parsablebytearray, int i)
		{
			cuebuilder.parseIdentifierSection(parsablebytearray, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #46  <Method void parseIdentifierSection(ParsableByteArray, int)>
			return;
		//    4    6:return          
		}

*/

		public CueBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #26  <Class ParsableByteArray>
		//    4    8:dup             
		//    5    9:invokespecial   #27  <Method void ParsableByteArray()>
		//    6   12:putfield        #29  <Field ParsableByteArray bitmapData>
		//    7   15:aload_0         
		//    8   16:sipush          256
		//    9   19:newarray        int[]
		//   10   21:putfield        #31  <Field int[] colors>
		//   11   24:return          
		}
	}


	public PgsDecoder()
	{
		super("PgsDecoder");
	//    0    0:aload_0         
	//    1    1:ldc1            #32  <String "PgsDecoder">
	//    2    3:invokespecial   #35  <Method void SimpleSubtitleDecoder(String)>
	//    3    6:aload_0         
	//    4    7:new             #37  <Class ParsableByteArray>
	//    5   10:dup             
	//    6   11:invokespecial   #39  <Method void ParsableByteArray()>
	//    7   14:putfield        #41  <Field ParsableByteArray buffer>
	//    8   17:aload_0         
	//    9   18:new             #6   <Class PgsDecoder$CueBuilder>
	//   10   21:dup             
	//   11   22:invokespecial   #42  <Method void PgsDecoder$CueBuilder()>
	//   12   25:putfield        #44  <Field PgsDecoder$CueBuilder cueBuilder>
	//   13   28:return          
	}

	private boolean maybeInflateData(byte abyte0[], int i)
	{
		if(i == 0)
			break MISSING_BLOCK_LABEL_187;
	//    0    0:iload_2         
	//    1    1:ifeq            187
		if(abyte0[0] != 120)
	//*   2    4:aload_1         
	//*   3    5:iconst_0        
	//*   4    6:baload          
	//*   5    7:bipush          120
	//*   6    9:icmpeq          14
			return false;
	//    7   12:iconst_0        
	//    8   13:ireturn         
		if(inflater == null)
	//*   9   14:aload_0         
	//*  10   15:getfield        #51  <Field Inflater inflater>
	//*  11   18:ifnonnull       39
		{
			inflater = new Inflater();
	//   12   21:aload_0         
	//   13   22:new             #53  <Class Inflater>
	//   14   25:dup             
	//   15   26:invokespecial   #54  <Method void Inflater()>
	//   16   29:putfield        #51  <Field Inflater inflater>
			inflatedData = new byte[i];
	//   17   32:aload_0         
	//   18   33:iload_2         
	//   19   34:newarray        byte[]
	//   20   36:putfield        #56  <Field byte[] inflatedData>
		}
		inflatedDataSize = 0;
	//   21   39:aload_0         
	//   22   40:iconst_0        
	//   23   41:putfield        #58  <Field int inflatedDataSize>
		inflater.setInput(abyte0, 0, i);
	//   24   44:aload_0         
	//   25   45:getfield        #51  <Field Inflater inflater>
	//   26   48:aload_1         
	//   27   49:iconst_0        
	//   28   50:iload_2         
	//   29   51:invokevirtual   #62  <Method void Inflater.setInput(byte[], int, int)>
		boolean flag;
		try
		{
			while(!inflater.finished() && !inflater.needsDictionary() && !inflater.needsInput()) 
	//*  30   54:aload_0         
	//*  31   55:getfield        #51  <Field Inflater inflater>
	//*  32   58:invokevirtual   #66  <Method boolean Inflater.finished()>
	//*  33   61:ifne            151
	//*  34   64:aload_0         
	//*  35   65:getfield        #51  <Field Inflater inflater>
	//*  36   68:invokevirtual   #69  <Method boolean Inflater.needsDictionary()>
	//*  37   71:ifne            151
	//*  38   74:aload_0         
	//*  39   75:getfield        #51  <Field Inflater inflater>
	//*  40   78:invokevirtual   #72  <Method boolean Inflater.needsInput()>
	//*  41   81:ifne            151
			{
				if(inflatedDataSize == inflatedData.length)
	//*  42   84:aload_0         
	//*  43   85:getfield        #58  <Field int inflatedDataSize>
	//*  44   88:aload_0         
	//*  45   89:getfield        #56  <Field byte[] inflatedData>
	//*  46   92:arraylength     
	//*  47   93:icmpne          114
					inflatedData = Arrays.copyOf(inflatedData, inflatedData.length * 2);
	//   48   96:aload_0         
	//   49   97:aload_0         
	//   50   98:getfield        #56  <Field byte[] inflatedData>
	//   51  101:aload_0         
	//   52  102:getfield        #56  <Field byte[] inflatedData>
	//   53  105:arraylength     
	//   54  106:iconst_2        
	//   55  107:imul            
	//   56  108:invokestatic    #78  <Method byte[] Arrays.copyOf(byte[], int)>
	//   57  111:putfield        #56  <Field byte[] inflatedData>
				inflatedDataSize = inflatedDataSize + inflater.inflate(inflatedData, inflatedDataSize, inflatedData.length - inflatedDataSize);
	//   58  114:aload_0         
	//   59  115:aload_0         
	//   60  116:getfield        #58  <Field int inflatedDataSize>
	//   61  119:aload_0         
	//   62  120:getfield        #51  <Field Inflater inflater>
	//   63  123:aload_0         
	//   64  124:getfield        #56  <Field byte[] inflatedData>
	//   65  127:aload_0         
	//   66  128:getfield        #58  <Field int inflatedDataSize>
	//   67  131:aload_0         
	//   68  132:getfield        #56  <Field byte[] inflatedData>
	//   69  135:arraylength     
	//   70  136:aload_0         
	//   71  137:getfield        #58  <Field int inflatedDataSize>
	//   72  140:isub            
	//   73  141:invokevirtual   #82  <Method int Inflater.inflate(byte[], int, int)>
	//   74  144:iadd            
	//   75  145:putfield        #58  <Field int inflatedDataSize>
			}
		}
	//*  76  148:goto            54
	//*  77  151:aload_0         
	//*  78  152:getfield        #51  <Field Inflater inflater>
	//*  79  155:invokevirtual   #66  <Method boolean Inflater.finished()>
	//*  80  158:istore_3        
	//*  81  159:aload_0         
	//*  82  160:getfield        #51  <Field Inflater inflater>
	//*  83  163:invokevirtual   #85  <Method void Inflater.reset()>
	//*  84  166:iload_3         
	//*  85  167:ireturn         
	//*  86  168:astore_1        
	//*  87  169:aload_0         
	//*  88  170:getfield        #51  <Field Inflater inflater>
	//*  89  173:invokevirtual   #85  <Method void Inflater.reset()>
	//*  90  176:aload_1         
	//*  91  177:athrow          
	//*  92  178:aload_0         
	//*  93  179:getfield        #51  <Field Inflater inflater>
	//*  94  182:invokevirtual   #85  <Method void Inflater.reset()>
	//*  95  185:iconst_0        
	//*  96  186:ireturn         
	//*  97  187:iconst_0        
	//*  98  188:ireturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			inflater.reset();
			return false;
		}
		flag = inflater.finished();
		inflater.reset();
		return flag;
		abyte0;
		inflater.reset();
		throw abyte0;
		return false;
	//*  99  189:astore_1        
	//* 100  190:goto            178
	}

	private static Cue readNextSection(ParsableByteArray parsablebytearray, CueBuilder cuebuilder)
	{
		int i = parsablebytearray.limit();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #91  <Method int ParsableByteArray.limit()>
	//    2    4:istore_2        
		int j = parsablebytearray.readUnsignedByte();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #94  <Method int ParsableByteArray.readUnsignedByte()>
	//    5    9:istore_3        
		int k = parsablebytearray.readUnsignedShort();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #97  <Method int ParsableByteArray.readUnsignedShort()>
	//    8   14:istore          4
		int l = parsablebytearray.getPosition() + k;
	//    9   16:aload_0         
	//   10   17:invokevirtual   #100 <Method int ParsableByteArray.getPosition()>
	//   11   20:iload           4
	//   12   22:iadd            
	//   13   23:istore          5
		Object obj = null;
	//   14   25:aconst_null     
	//   15   26:astore          6
		if(l > i)
	//*  16   28:iload           5
	//*  17   30:iload_2         
	//*  18   31:icmple          41
		{
			parsablebytearray.setPosition(i);
	//   19   34:aload_0         
	//   20   35:iload_2         
	//   21   36:invokevirtual   #104 <Method void ParsableByteArray.setPosition(int)>
			return null;
	//   22   39:aconst_null     
	//   23   40:areturn         
		}
		if(j != 128)
	//*  24   41:iload_3         
	//*  25   42:sipush          128
	//*  26   45:icmpeq          121
		{
			switch(j)
	//*  27   48:iload_3         
			{
	//*  28   49:tableswitch     20 22: default 76
	//	               20 108
	//	               21 95
	//	               22 82
			default:
				cuebuilder = ((CueBuilder) (obj));
	//   29   76:aload           6
	//   30   78:astore_1        
				break;

	//*  31   79:goto            134
			case 22: // '\026'
				cuebuilder.parseIdentifierSection(parsablebytearray, k);
	//   32   82:aload_1         
	//   33   83:aload_0         
	//   34   84:iload           4
	//   35   86:invokestatic    #108 <Method void PgsDecoder$CueBuilder.access$200(PgsDecoder$CueBuilder, ParsableByteArray, int)>
				cuebuilder = ((CueBuilder) (obj));
	//   36   89:aload           6
	//   37   91:astore_1        
				break;

	//*  38   92:goto            134
			case 21: // '\025'
				cuebuilder.parseBitmapSection(parsablebytearray, k);
	//   39   95:aload_1         
	//   40   96:aload_0         
	//   41   97:iload           4
	//   42   99:invokestatic    #111 <Method void PgsDecoder$CueBuilder.access$100(PgsDecoder$CueBuilder, ParsableByteArray, int)>
				cuebuilder = ((CueBuilder) (obj));
	//   43  102:aload           6
	//   44  104:astore_1        
				break;

	//*  45  105:goto            134
			case 20: // '\024'
				cuebuilder.parsePaletteSection(parsablebytearray, k);
	//   46  108:aload_1         
	//   47  109:aload_0         
	//   48  110:iload           4
	//   49  112:invokestatic    #114 <Method void PgsDecoder$CueBuilder.access$000(PgsDecoder$CueBuilder, ParsableByteArray, int)>
				cuebuilder = ((CueBuilder) (obj));
	//   50  115:aload           6
	//   51  117:astore_1        
				break;
			}
		} else
	//*  52  118:goto            134
		{
			Cue cue = cuebuilder.build();
	//   53  121:aload_1         
	//   54  122:invokevirtual   #118 <Method Cue PgsDecoder$CueBuilder.build()>
	//   55  125:astore          6
			cuebuilder.reset();
	//   56  127:aload_1         
	//   57  128:invokevirtual   #119 <Method void PgsDecoder$CueBuilder.reset()>
			cuebuilder = ((CueBuilder) (cue));
	//   58  131:aload           6
	//   59  133:astore_1        
		}
		parsablebytearray.setPosition(l);
	//   60  134:aload_0         
	//   61  135:iload           5
	//   62  137:invokevirtual   #104 <Method void ParsableByteArray.setPosition(int)>
		return ((Cue) (cuebuilder));
	//   63  140:aload_1         
	//   64  141:areturn         
	}

	protected Subtitle decode(byte abyte0[], int i, boolean flag)
		throws SubtitleDecoderException
	{
		if(maybeInflateData(abyte0, i))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:iload_2         
	//*   3    3:invokespecial   #125 <Method boolean maybeInflateData(byte[], int)>
	//*   4    6:ifeq            27
			buffer.reset(inflatedData, inflatedDataSize);
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field ParsableByteArray buffer>
	//    7   13:aload_0         
	//    8   14:getfield        #56  <Field byte[] inflatedData>
	//    9   17:aload_0         
	//   10   18:getfield        #58  <Field int inflatedDataSize>
	//   11   21:invokevirtual   #128 <Method void ParsableByteArray.reset(byte[], int)>
		else
	//*  12   24:goto            36
			buffer.reset(abyte0, i);
	//   13   27:aload_0         
	//   14   28:getfield        #41  <Field ParsableByteArray buffer>
	//   15   31:aload_1         
	//   16   32:iload_2         
	//   17   33:invokevirtual   #128 <Method void ParsableByteArray.reset(byte[], int)>
		cueBuilder.reset();
	//   18   36:aload_0         
	//   19   37:getfield        #44  <Field PgsDecoder$CueBuilder cueBuilder>
	//   20   40:invokevirtual   #119 <Method void PgsDecoder$CueBuilder.reset()>
		abyte0 = ((byte []) (new ArrayList()));
	//   21   43:new             #130 <Class ArrayList>
	//   22   46:dup             
	//   23   47:invokespecial   #131 <Method void ArrayList()>
	//   24   50:astore_1        
		do
		{
			if(buffer.bytesLeft() < 3)
				break;
	//   25   51:aload_0         
	//   26   52:getfield        #41  <Field ParsableByteArray buffer>
	//   27   55:invokevirtual   #134 <Method int ParsableByteArray.bytesLeft()>
	//   28   58:iconst_3        
	//   29   59:icmplt          90
			Cue cue = readNextSection(buffer, cueBuilder);
	//   30   62:aload_0         
	//   31   63:getfield        #41  <Field ParsableByteArray buffer>
	//   32   66:aload_0         
	//   33   67:getfield        #44  <Field PgsDecoder$CueBuilder cueBuilder>
	//   34   70:invokestatic    #136 <Method Cue readNextSection(ParsableByteArray, PgsDecoder$CueBuilder)>
	//   35   73:astore          4
			if(cue != null)
	//*  36   75:aload           4
	//*  37   77:ifnull          51
				((ArrayList) (abyte0)).add(((Object) (cue)));
	//   38   80:aload_1         
	//   39   81:aload           4
	//   40   83:invokevirtual   #140 <Method boolean ArrayList.add(Object)>
	//   41   86:pop             
		} while(true);
	//   42   87:goto            51
		return ((Subtitle) (new PgsSubtitle(Collections.unmodifiableList(((java.util.List) (abyte0))))));
	//   43   90:new             #142 <Class PgsSubtitle>
	//   44   93:dup             
	//   45   94:aload_1         
	//   46   95:invokestatic    #148 <Method java.util.List Collections.unmodifiableList(java.util.List)>
	//   47   98:invokespecial   #151 <Method void PgsSubtitle(java.util.List)>
	//   48  101:areturn         
	}

	private static final byte INFLATE_HEADER = 120;
	private static final int SECTION_TYPE_BITMAP_PICTURE = 21;
	private static final int SECTION_TYPE_END = 128;
	private static final int SECTION_TYPE_IDENTIFIER = 22;
	private static final int SECTION_TYPE_PALETTE = 20;
	private final ParsableByteArray buffer = new ParsableByteArray();
	private final CueBuilder cueBuilder = new CueBuilder();
	private byte inflatedData[];
	private int inflatedDataSize;
	private Inflater inflater;
}
