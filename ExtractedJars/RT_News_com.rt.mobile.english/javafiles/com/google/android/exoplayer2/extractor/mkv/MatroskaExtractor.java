// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mkv;

import android.util.*;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.util.*;
import com.google.android.exoplayer2.video.*;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.extractor.mkv:
//			DefaultEbmlReader, EbmlReader, VarintReader, Sniffer, 
//			EbmlReaderOutput

public final class MatroskaExtractor
	implements Extractor
{
	public static interface Flags
		extends Annotation
	{
	}

	private final class InnerEbmlReaderOutput
		implements EbmlReaderOutput
	{

		public void binaryElement(int i, int j, ExtractorInput extractorinput)
			throws IOException, InterruptedException
		{
			MatroskaExtractor.this.binaryElement(i, j, extractorinput);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field MatroskaExtractor this$0>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #30  <Method void MatroskaExtractor.binaryElement(int, int, ExtractorInput)>
		//    6   10:return          
		}

		public void endMasterElement(int i)
			throws ParserException
		{
			MatroskaExtractor.this.endMasterElement(i);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field MatroskaExtractor this$0>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #37  <Method void MatroskaExtractor.endMasterElement(int)>
		//    4    8:return          
		}

		public void floatElement(int i, double d)
			throws ParserException
		{
			MatroskaExtractor.this.floatElement(i, d);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field MatroskaExtractor this$0>
		//    2    4:iload_1         
		//    3    5:dload_2         
		//    4    6:invokevirtual   #41  <Method void MatroskaExtractor.floatElement(int, double)>
		//    5    9:return          
		}

		public int getElementType(int i)
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:lookupswitch    78: default 636
		//		               131: 646
		//		               134: 644
		//		               136: 646
		//		               155: 646
		//		               159: 646
		//		               160: 642
		//		               161: 640
		//		               163: 640
		//		               174: 642
		//		               176: 646
		//		               179: 646
		//		               181: 638
		//		               183: 642
		//		               186: 646
		//		               187: 642
		//		               215: 646
		//		               224: 642
		//		               225: 642
		//		               231: 646
		//		               241: 646
		//		               251: 646
		//		               16980: 646
		//		               16981: 640
		//		               17026: 644
		//		               17029: 646
		//		               17143: 646
		//		               17545: 638
		//		               18401: 646
		//		               18402: 640
		//		               18407: 642
		//		               18408: 646
		//		               19899: 642
		//		               20529: 646
		//		               20530: 646
		//		               20532: 642
		//		               20533: 642
		//		               21419: 640
		//		               21420: 646
		//		               21432: 646
		//		               21680: 646
		//		               21682: 646
		//		               21690: 646
		//		               21930: 646
		//		               21936: 642
		//		               21945: 646
		//		               21946: 646
		//		               21947: 646
		//		               21948: 646
		//		               21949: 646
		//		               21968: 642
		//		               21969: 638
		//		               21970: 638
		//		               21971: 638
		//		               21972: 638
		//		               21973: 638
		//		               21974: 638
		//		               21975: 638
		//		               21976: 638
		//		               21977: 638
		//		               21978: 638
		//		               22186: 646
		//		               22203: 646
		//		               25152: 642
		//		               25188: 646
		//		               25506: 640
		//		               28032: 642
		//		               30320: 642
		//		               30322: 640
		//		               2274716: 644
		//		               2352003: 646
		//		               2807729: 646
		//		               290298740: 642
		//		               357149030: 642
		//		               374648427: 642
		//		               408125543: 642
		//		               440786851: 642
		//		               475249515: 642
		//		               524531317: 642
			default:
				return 0;
		//    2  636:iconst_0        
		//    3  637:ireturn         

			case 181: 
			case 17545: 
			case 21969: 
			case 21970: 
			case 21971: 
			case 21972: 
			case 21973: 
			case 21974: 
			case 21975: 
			case 21976: 
			case 21977: 
			case 21978: 
				return 5;
		//    4  638:iconst_5        
		//    5  639:ireturn         

			case 161: 
			case 163: 
			case 16981: 
			case 18402: 
			case 21419: 
			case 25506: 
			case 30322: 
				return 4;
		//    6  640:iconst_4        
		//    7  641:ireturn         

			case 160: 
			case 174: 
			case 183: 
			case 187: 
			case 224: 
			case 225: 
			case 18407: 
			case 19899: 
			case 20532: 
			case 20533: 
			case 21936: 
			case 21968: 
			case 25152: 
			case 28032: 
			case 30320: 
			case 290298740: 
			case 357149030: 
			case 374648427: 
			case 408125543: 
			case 440786851: 
			case 475249515: 
			case 524531317: 
				return 1;
		//    8  642:iconst_1        
		//    9  643:ireturn         

			case 134: 
			case 17026: 
			case 2274716: 
				return 3;
		//   10  644:iconst_3        
		//   11  645:ireturn         

			case 131: 
			case 136: 
			case 155: 
			case 159: 
			case 176: 
			case 179: 
			case 186: 
			case 215: 
			case 231: 
			case 241: 
			case 251: 
			case 16980: 
			case 17029: 
			case 17143: 
			case 18401: 
			case 18408: 
			case 20529: 
			case 20530: 
			case 21420: 
			case 21432: 
			case 21680: 
			case 21682: 
			case 21690: 
			case 21930: 
			case 21945: 
			case 21946: 
			case 21947: 
			case 21948: 
			case 21949: 
			case 22186: 
			case 22203: 
			case 25188: 
			case 2352003: 
			case 2807729: 
				return 2;
		//   12  646:iconst_2        
		//   13  647:ireturn         
			}
		}

		public void integerElement(int i, long l)
			throws ParserException
		{
			MatroskaExtractor.this.integerElement(i, l);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field MatroskaExtractor this$0>
		//    2    4:iload_1         
		//    3    5:lload_2         
		//    4    6:invokevirtual   #47  <Method void MatroskaExtractor.integerElement(int, long)>
		//    5    9:return          
		}

		public boolean isLevel1Element(int i)
		{
			return i == 0x1549a966 || i == 0x1f43b675 || i == 0x1c53bb6b || i == 0x1654ae6b;
		//    0    0:iload_1         
		//    1    1:ldc1            #50  <Int 0x1549a966>
		//    2    3:icmpeq          29
		//    3    6:iload_1         
		//    4    7:ldc1            #51  <Int 0x1f43b675>
		//    5    9:icmpeq          29
		//    6   12:iload_1         
		//    7   13:ldc1            #52  <Int 0x1c53bb6b>
		//    8   15:icmpeq          29
		//    9   18:iload_1         
		//   10   19:ldc1            #53  <Int 0x1654ae6b>
		//   11   21:icmpne          27
		//   12   24:goto            29
		//   13   27:iconst_0        
		//   14   28:ireturn         
		//   15   29:iconst_1        
		//   16   30:ireturn         
		}

		public void startMasterElement(int i, long l, long l1)
			throws ParserException
		{
			MatroskaExtractor.this.startMasterElement(i, l, l1);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field MatroskaExtractor this$0>
		//    2    4:iload_1         
		//    3    5:lload_2         
		//    4    6:lload           4
		//    5    8:invokevirtual   #57  <Method void MatroskaExtractor.startMasterElement(int, long, long)>
		//    6   11:return          
		}

		public void stringElement(int i, String s)
			throws ParserException
		{
			MatroskaExtractor.this.stringElement(i, s);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field MatroskaExtractor this$0>
		//    2    4:iload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #61  <Method void MatroskaExtractor.stringElement(int, String)>
		//    5    9:return          
		}

		final MatroskaExtractor this$0;

		private InnerEbmlReaderOutput()
		{
			this$0 = MatroskaExtractor.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field MatroskaExtractor this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}

	private static final class Track
	{

		private byte[] getHdrStaticInfo()
		{
			if(primaryRChromaticityX != -1F && primaryRChromaticityY != -1F && primaryGChromaticityX != -1F && primaryGChromaticityY != -1F && primaryBChromaticityX != -1F && primaryBChromaticityY != -1F && whitePointChromaticityX != -1F && whitePointChromaticityY != -1F && maxMasteringLuminance != -1F && minMasteringLuminance != -1F)
		//*   0    0:aload_0         
		//*   1    1:getfield        #102 <Field float primaryRChromaticityX>
		//*   2    4:ldc1            #100 <Float -1F>
		//*   3    6:fcmpl           
		//*   4    7:ifeq            305
		//*   5   10:aload_0         
		//*   6   11:getfield        #104 <Field float primaryRChromaticityY>
		//*   7   14:ldc1            #100 <Float -1F>
		//*   8   16:fcmpl           
		//*   9   17:ifeq            305
		//*  10   20:aload_0         
		//*  11   21:getfield        #106 <Field float primaryGChromaticityX>
		//*  12   24:ldc1            #100 <Float -1F>
		//*  13   26:fcmpl           
		//*  14   27:ifeq            305
		//*  15   30:aload_0         
		//*  16   31:getfield        #108 <Field float primaryGChromaticityY>
		//*  17   34:ldc1            #100 <Float -1F>
		//*  18   36:fcmpl           
		//*  19   37:ifeq            305
		//*  20   40:aload_0         
		//*  21   41:getfield        #110 <Field float primaryBChromaticityX>
		//*  22   44:ldc1            #100 <Float -1F>
		//*  23   46:fcmpl           
		//*  24   47:ifeq            305
		//*  25   50:aload_0         
		//*  26   51:getfield        #112 <Field float primaryBChromaticityY>
		//*  27   54:ldc1            #100 <Float -1F>
		//*  28   56:fcmpl           
		//*  29   57:ifeq            305
		//*  30   60:aload_0         
		//*  31   61:getfield        #114 <Field float whitePointChromaticityX>
		//*  32   64:ldc1            #100 <Float -1F>
		//*  33   66:fcmpl           
		//*  34   67:ifeq            305
		//*  35   70:aload_0         
		//*  36   71:getfield        #116 <Field float whitePointChromaticityY>
		//*  37   74:ldc1            #100 <Float -1F>
		//*  38   76:fcmpl           
		//*  39   77:ifeq            305
		//*  40   80:aload_0         
		//*  41   81:getfield        #118 <Field float maxMasteringLuminance>
		//*  42   84:ldc1            #100 <Float -1F>
		//*  43   86:fcmpl           
		//*  44   87:ifeq            305
		//*  45   90:aload_0         
		//*  46   91:getfield        #120 <Field float minMasteringLuminance>
		//*  47   94:ldc1            #100 <Float -1F>
		//*  48   96:fcmpl           
		//*  49   97:ifne            103
		//*  50  100:goto            305
			{
				byte abyte0[] = new byte[25];
		//   51  103:bipush          25
		//   52  105:newarray        byte[]
		//   53  107:astore_1        
				ByteBuffer bytebuffer = ByteBuffer.wrap(abyte0);
		//   54  108:aload_1         
		//   55  109:invokestatic    #149 <Method ByteBuffer ByteBuffer.wrap(byte[])>
		//   56  112:astore_2        
				bytebuffer.put((byte)0);
		//   57  113:aload_2         
		//   58  114:iconst_0        
		//   59  115:invokevirtual   #153 <Method ByteBuffer ByteBuffer.put(byte)>
		//   60  118:pop             
				bytebuffer.putShort((short)(int)(primaryRChromaticityX * 50000F + 0.5F));
		//   61  119:aload_2         
		//   62  120:aload_0         
		//   63  121:getfield        #102 <Field float primaryRChromaticityX>
		//   64  124:ldc1            #154 <Float 50000F>
		//   65  126:fmul            
		//   66  127:ldc1            #155 <Float 0.5F>
		//   67  129:fadd            
		//   68  130:f2i             
		//   69  131:int2short       
		//   70  132:invokevirtual   #159 <Method ByteBuffer ByteBuffer.putShort(short)>
		//   71  135:pop             
				bytebuffer.putShort((short)(int)(primaryRChromaticityY * 50000F + 0.5F));
		//   72  136:aload_2         
		//   73  137:aload_0         
		//   74  138:getfield        #104 <Field float primaryRChromaticityY>
		//   75  141:ldc1            #154 <Float 50000F>
		//   76  143:fmul            
		//   77  144:ldc1            #155 <Float 0.5F>
		//   78  146:fadd            
		//   79  147:f2i             
		//   80  148:int2short       
		//   81  149:invokevirtual   #159 <Method ByteBuffer ByteBuffer.putShort(short)>
		//   82  152:pop             
				bytebuffer.putShort((short)(int)(primaryGChromaticityX * 50000F + 0.5F));
		//   83  153:aload_2         
		//   84  154:aload_0         
		//   85  155:getfield        #106 <Field float primaryGChromaticityX>
		//   86  158:ldc1            #154 <Float 50000F>
		//   87  160:fmul            
		//   88  161:ldc1            #155 <Float 0.5F>
		//   89  163:fadd            
		//   90  164:f2i             
		//   91  165:int2short       
		//   92  166:invokevirtual   #159 <Method ByteBuffer ByteBuffer.putShort(short)>
		//   93  169:pop             
				bytebuffer.putShort((short)(int)(primaryGChromaticityY * 50000F + 0.5F));
		//   94  170:aload_2         
		//   95  171:aload_0         
		//   96  172:getfield        #108 <Field float primaryGChromaticityY>
		//   97  175:ldc1            #154 <Float 50000F>
		//   98  177:fmul            
		//   99  178:ldc1            #155 <Float 0.5F>
		//  100  180:fadd            
		//  101  181:f2i             
		//  102  182:int2short       
		//  103  183:invokevirtual   #159 <Method ByteBuffer ByteBuffer.putShort(short)>
		//  104  186:pop             
				bytebuffer.putShort((short)(int)(primaryBChromaticityX * 50000F + 0.5F));
		//  105  187:aload_2         
		//  106  188:aload_0         
		//  107  189:getfield        #110 <Field float primaryBChromaticityX>
		//  108  192:ldc1            #154 <Float 50000F>
		//  109  194:fmul            
		//  110  195:ldc1            #155 <Float 0.5F>
		//  111  197:fadd            
		//  112  198:f2i             
		//  113  199:int2short       
		//  114  200:invokevirtual   #159 <Method ByteBuffer ByteBuffer.putShort(short)>
		//  115  203:pop             
				bytebuffer.putShort((short)(int)(primaryBChromaticityY * 50000F + 0.5F));
		//  116  204:aload_2         
		//  117  205:aload_0         
		//  118  206:getfield        #112 <Field float primaryBChromaticityY>
		//  119  209:ldc1            #154 <Float 50000F>
		//  120  211:fmul            
		//  121  212:ldc1            #155 <Float 0.5F>
		//  122  214:fadd            
		//  123  215:f2i             
		//  124  216:int2short       
		//  125  217:invokevirtual   #159 <Method ByteBuffer ByteBuffer.putShort(short)>
		//  126  220:pop             
				bytebuffer.putShort((short)(int)(whitePointChromaticityX * 50000F + 0.5F));
		//  127  221:aload_2         
		//  128  222:aload_0         
		//  129  223:getfield        #114 <Field float whitePointChromaticityX>
		//  130  226:ldc1            #154 <Float 50000F>
		//  131  228:fmul            
		//  132  229:ldc1            #155 <Float 0.5F>
		//  133  231:fadd            
		//  134  232:f2i             
		//  135  233:int2short       
		//  136  234:invokevirtual   #159 <Method ByteBuffer ByteBuffer.putShort(short)>
		//  137  237:pop             
				bytebuffer.putShort((short)(int)(whitePointChromaticityY * 50000F + 0.5F));
		//  138  238:aload_2         
		//  139  239:aload_0         
		//  140  240:getfield        #116 <Field float whitePointChromaticityY>
		//  141  243:ldc1            #154 <Float 50000F>
		//  142  245:fmul            
		//  143  246:ldc1            #155 <Float 0.5F>
		//  144  248:fadd            
		//  145  249:f2i             
		//  146  250:int2short       
		//  147  251:invokevirtual   #159 <Method ByteBuffer ByteBuffer.putShort(short)>
		//  148  254:pop             
				bytebuffer.putShort((short)(int)(maxMasteringLuminance + 0.5F));
		//  149  255:aload_2         
		//  150  256:aload_0         
		//  151  257:getfield        #118 <Field float maxMasteringLuminance>
		//  152  260:ldc1            #155 <Float 0.5F>
		//  153  262:fadd            
		//  154  263:f2i             
		//  155  264:int2short       
		//  156  265:invokevirtual   #159 <Method ByteBuffer ByteBuffer.putShort(short)>
		//  157  268:pop             
				bytebuffer.putShort((short)(int)(minMasteringLuminance + 0.5F));
		//  158  269:aload_2         
		//  159  270:aload_0         
		//  160  271:getfield        #120 <Field float minMasteringLuminance>
		//  161  274:ldc1            #155 <Float 0.5F>
		//  162  276:fadd            
		//  163  277:f2i             
		//  164  278:int2short       
		//  165  279:invokevirtual   #159 <Method ByteBuffer ByteBuffer.putShort(short)>
		//  166  282:pop             
				bytebuffer.putShort((short)maxContentLuminance);
		//  167  283:aload_2         
		//  168  284:aload_0         
		//  169  285:getfield        #97  <Field int maxContentLuminance>
		//  170  288:int2short       
		//  171  289:invokevirtual   #159 <Method ByteBuffer ByteBuffer.putShort(short)>
		//  172  292:pop             
				bytebuffer.putShort((short)maxFrameAverageLuminance);
		//  173  293:aload_2         
		//  174  294:aload_0         
		//  175  295:getfield        #99  <Field int maxFrameAverageLuminance>
		//  176  298:int2short       
		//  177  299:invokevirtual   #159 <Method ByteBuffer ByteBuffer.putShort(short)>
		//  178  302:pop             
				return abyte0;
		//  179  303:aload_1         
		//  180  304:areturn         
			} else
			{
				return null;
		//  181  305:aconst_null     
		//  182  306:areturn         
			}
		}

		private static Pair parseFourCcPrivate(ParsableByteArray parsablebytearray)
			throws ParserException
		{
			int i;
			long l;
			try
			{
				parsablebytearray.skipBytes(16);
		//    0    0:aload_0         
		//    1    1:bipush          16
		//    2    3:invokevirtual   #171 <Method void ParsableByteArray.skipBytes(int)>
				l = parsablebytearray.readLittleEndianUnsignedInt();
		//    3    6:aload_0         
		//    4    7:invokevirtual   #175 <Method long ParsableByteArray.readLittleEndianUnsignedInt()>
		//    5   10:lstore_2        
			}
		//*   6   11:lload_2         
		//*   7   12:ldc2w           #176 <Long 0x58564944L>
		//*   8   15:lcmp            
		//*   9   16:ifne            30
		//*  10   19:new             #179 <Class Pair>
		//*  11   22:dup             
		//*  12   23:ldc1            #181 <String "video/3gpp">
		//*  13   25:aconst_null     
		//*  14   26:invokespecial   #184 <Method void Pair(Object, Object)>
		//*  15   29:areturn         
		//*  16   30:lload_2         
		//*  17   31:ldc2w           #185 <Long 0x31435657L>
		//*  18   34:lcmp            
		//*  19   35:ifne            122
		//*  20   38:aload_0         
		//*  21   39:invokevirtual   #190 <Method int ParsableByteArray.getPosition()>
		//*  22   42:bipush          20
		//*  23   44:iadd            
		//*  24   45:istore_1        
		//*  25   46:aload_0         
		//*  26   47:getfield        #193 <Field byte[] ParsableByteArray.data>
		//*  27   50:astore_0        
		//*  28   51:iload_1         
		//*  29   52:aload_0         
		//*  30   53:arraylength     
		//*  31   54:iconst_4        
		//*  32   55:isub            
		//*  33   56:icmpge          112
		//*  34   59:aload_0         
		//*  35   60:iload_1         
		//*  36   61:baload          
		//*  37   62:ifne            155
		//*  38   65:aload_0         
		//*  39   66:iload_1         
		//*  40   67:iconst_1        
		//*  41   68:iadd            
		//*  42   69:baload          
		//*  43   70:ifne            155
		//*  44   73:aload_0         
		//*  45   74:iload_1         
		//*  46   75:iconst_2        
		//*  47   76:iadd            
		//*  48   77:baload          
		//*  49   78:iconst_1        
		//*  50   79:icmpne          155
		//*  51   82:aload_0         
		//*  52   83:iload_1         
		//*  53   84:iconst_3        
		//*  54   85:iadd            
		//*  55   86:baload          
		//*  56   87:bipush          15
		//*  57   89:icmpne          155
		//*  58   92:new             #179 <Class Pair>
		//*  59   95:dup             
		//*  60   96:ldc1            #195 <String "video/wvc1">
		//*  61   98:aload_0         
		//*  62   99:iload_1         
		//*  63  100:aload_0         
		//*  64  101:arraylength     
		//*  65  102:invokestatic    #201 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
		//*  66  105:invokestatic    #207 <Method List Collections.singletonList(Object)>
		//*  67  108:invokespecial   #184 <Method void Pair(Object, Object)>
		//*  68  111:areturn         
		//*  69  112:new             #163 <Class ParserException>
		//*  70  115:dup             
		//*  71  116:ldc1            #209 <String "Failed to find FourCC VC1 initialization data">
		//*  72  118:invokespecial   #212 <Method void ParserException(String)>
		//*  73  121:athrow          
		//*  74  122:ldc1            #214 <String "MatroskaExtractor">
		//*  75  124:ldc1            #216 <String "Unknown FourCC. Setting mimeType to video/x-unknown">
		//*  76  126:invokestatic    #222 <Method int Log.w(String, String)>
		//*  77  129:pop             
		//*  78  130:new             #179 <Class Pair>
		//*  79  133:dup             
		//*  80  134:ldc1            #224 <String "video/x-unknown">
		//*  81  136:aconst_null     
		//*  82  137:invokespecial   #184 <Method void Pair(Object, Object)>
		//*  83  140:areturn         
		//*  84  141:new             #163 <Class ParserException>
		//*  85  144:dup             
		//*  86  145:ldc1            #226 <String "Error parsing FourCC private data">
		//*  87  147:invokespecial   #212 <Method void ParserException(String)>
		//*  88  150:athrow          
			// Misplaced declaration of an exception variable
			catch(ParsableByteArray parsablebytearray)
			{
				throw new ParserException("Error parsing FourCC private data");
			}
			if(l != 0x58564944L)
				break MISSING_BLOCK_LABEL_30;
			return new Pair("video/3gpp", ((Object) (null)));
			if(l != 0x31435657L) goto _L2; else goto _L1
_L1:
			i = parsablebytearray.getPosition() + 20;
			parsablebytearray = ((ParsableByteArray) (parsablebytearray.data));
_L5:
			if(i >= parsablebytearray.length - 4) goto _L4; else goto _L3
_L3:
			if(parsablebytearray[i] != 0 || parsablebytearray[i + 1] != 0 || parsablebytearray[i + 2] != 1 || parsablebytearray[i + 3] != 15)
				break MISSING_BLOCK_LABEL_155;
			return new Pair("video/wvc1", ((Object) (Collections.singletonList(((Object) (Arrays.copyOfRange(((byte []) (parsablebytearray)), i, parsablebytearray.length)))))));
_L4:
			throw new ParserException("Failed to find FourCC VC1 initialization data");
_L2:
			Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
			return new Pair("video/x-unknown", ((Object) (null)));
		//*  89  151:astore_0        
		//*  90  152:goto            141
			i++;
		//   91  155:iload_1         
		//   92  156:iconst_1        
		//   93  157:iadd            
		//   94  158:istore_1        
			  goto _L5
		//*  95  159:goto            51
		}

		private static boolean parseMsAcmCodecPrivate(ParsableByteArray parsablebytearray)
			throws ParserException
		{
			int i;
			long l;
			long l1;
			try
			{
				i = parsablebytearray.readLittleEndianUnsignedShort();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #234 <Method int ParsableByteArray.readLittleEndianUnsignedShort()>
		//    2    4:istore_1        
			}
		//*   3    5:iload_1         
		//*   4    6:iconst_1        
		//*   5    7:icmpne          12
		//*   6   10:iconst_1        
		//*   7   11:ireturn         
		//*   8   12:iload_1         
		//*   9   13:ldc1            #235 <Int 65534>
		//*  10   15:icmpne          62
		//*  11   18:aload_0         
		//*  12   19:bipush          24
		//*  13   21:invokevirtual   #238 <Method void ParsableByteArray.setPosition(int)>
		//*  14   24:aload_0         
		//*  15   25:invokevirtual   #241 <Method long ParsableByteArray.readLong()>
		//*  16   28:invokestatic    #245 <Method UUID MatroskaExtractor.access$400()>
		//*  17   31:invokevirtual   #250 <Method long UUID.getMostSignificantBits()>
		//*  18   34:lcmp            
		//*  19   35:ifne            60
		//*  20   38:aload_0         
		//*  21   39:invokevirtual   #241 <Method long ParsableByteArray.readLong()>
		//*  22   42:lstore_2        
		//*  23   43:invokestatic    #245 <Method UUID MatroskaExtractor.access$400()>
		//*  24   46:invokevirtual   #253 <Method long UUID.getLeastSignificantBits()>
		//*  25   49:lstore          4
		//*  26   51:lload_2         
		//*  27   52:lload           4
		//*  28   54:lcmp            
		//*  29   55:ifne            60
		//*  30   58:iconst_1        
		//*  31   59:ireturn         
		//*  32   60:iconst_0        
		//*  33   61:ireturn         
		//*  34   62:iconst_0        
		//*  35   63:ireturn         
		//*  36   64:new             #163 <Class ParserException>
		//*  37   67:dup             
		//*  38   68:ldc1            #255 <String "Error parsing MS/ACM codec private">
		//*  39   70:invokespecial   #212 <Method void ParserException(String)>
		//*  40   73:athrow          
			// Misplaced declaration of an exception variable
			catch(ParsableByteArray parsablebytearray)
			{
				throw new ParserException("Error parsing MS/ACM codec private");
			}
			if(i == 1)
				return true;
			if(i != 65534)
				break MISSING_BLOCK_LABEL_62;
			parsablebytearray.setPosition(24);
			if(parsablebytearray.readLong() != MatroskaExtractor.WAVE_SUBFORMAT_PCM.getMostSignificantBits())
				break MISSING_BLOCK_LABEL_60;
			l = parsablebytearray.readLong();
			l1 = MatroskaExtractor.WAVE_SUBFORMAT_PCM.getLeastSignificantBits();
			if(l == l1)
				return true;
			return false;
			return false;
		//*  41   74:astore_0        
		//*  42   75:goto            64
		}

		private static List parseVorbisCodecPrivate(byte abyte0[])
			throws ParserException
		{
		//*   0    0:aload_0         
		//*   1    1:iconst_0        
		//*   2    2:baload          
		//*   3    3:iconst_2        
		//*   4    4:icmpeq          171
		//*   5    7:new             #163 <Class ParserException>
		//*   6   10:dup             
		//*   7   11:ldc2            #259 <String "Error parsing vorbis codec private">
		//*   8   14:invokespecial   #212 <Method void ParserException(String)>
		//*   9   17:athrow          
_L2:
			k = j + 1;
		//   10   18:iload_2         
		//   11   19:iconst_1        
		//   12   20:iadd            
		//   13   21:istore_3        
			j = ((int) (abyte0[j]));
		//   14   22:aload_0         
		//   15   23:iload_2         
		//   16   24:baload          
		//   17   25:istore_2        
			if(abyte0[k] == 1)
				break MISSING_BLOCK_LABEL_44;
		//   18   26:aload_0         
		//   19   27:iload_3         
		//   20   28:baload          
		//   21   29:iconst_1        
		//   22   30:icmpeq          44
			throw new ParserException("Error parsing vorbis codec private");
		//   23   33:new             #163 <Class ParserException>
		//   24   36:dup             
		//   25   37:ldc2            #259 <String "Error parsing vorbis codec private">
		//   26   40:invokespecial   #212 <Method void ParserException(String)>
		//   27   43:athrow          
			abyte1 = new byte[l];
		//   28   44:iload           4
		//   29   46:newarray        byte[]
		//   30   48:astore          5
			System.arraycopy(((Object) (abyte0)), k, ((Object) (abyte1)), 0, l);
		//   31   50:aload_0         
		//   32   51:iload_3         
		//   33   52:aload           5
		//   34   54:iconst_0        
		//   35   55:iload           4
		//   36   57:invokestatic    #265 <Method void System.arraycopy(Object, int, Object, int, int)>
			k += l;
		//   37   60:iload_3         
		//   38   61:iload           4
		//   39   63:iadd            
		//   40   64:istore_3        
			if(abyte0[k] == 3)
				break MISSING_BLOCK_LABEL_83;
		//   41   65:aload_0         
		//   42   66:iload_3         
		//   43   67:baload          
		//   44   68:iconst_3        
		//   45   69:icmpeq          83
			throw new ParserException("Error parsing vorbis codec private");
		//   46   72:new             #163 <Class ParserException>
		//   47   75:dup             
		//   48   76:ldc2            #259 <String "Error parsing vorbis codec private">
		//   49   79:invokespecial   #212 <Method void ParserException(String)>
		//   50   82:athrow          
			i = k + (i + j);
		//   51   83:iload_3         
		//   52   84:iload_1         
		//   53   85:iload_2         
		//   54   86:iadd            
		//   55   87:iadd            
		//   56   88:istore_1        
			if(abyte0[i] == 5)
				break MISSING_BLOCK_LABEL_107;
		//   57   89:aload_0         
		//   58   90:iload_1         
		//   59   91:baload          
		//   60   92:iconst_5        
		//   61   93:icmpeq          107
			throw new ParserException("Error parsing vorbis codec private");
		//   62   96:new             #163 <Class ParserException>
		//   63   99:dup             
		//   64  100:ldc2            #259 <String "Error parsing vorbis codec private">
		//   65  103:invokespecial   #212 <Method void ParserException(String)>
		//   66  106:athrow          
			byte abyte2[] = new byte[abyte0.length - i];
		//   67  107:aload_0         
		//   68  108:arraylength     
		//   69  109:iload_1         
		//   70  110:isub            
		//   71  111:newarray        byte[]
		//   72  113:astore          6
			System.arraycopy(((Object) (abyte0)), i, ((Object) (abyte2)), 0, abyte0.length - i);
		//   73  115:aload_0         
		//   74  116:iload_1         
		//   75  117:aload           6
		//   76  119:iconst_0        
		//   77  120:aload_0         
		//   78  121:arraylength     
		//   79  122:iload_1         
		//   80  123:isub            
		//   81  124:invokestatic    #265 <Method void System.arraycopy(Object, int, Object, int, int)>
			abyte0 = ((byte []) (new ArrayList(2)));
		//   82  127:new             #267 <Class ArrayList>
		//   83  130:dup             
		//   84  131:iconst_2        
		//   85  132:invokespecial   #269 <Method void ArrayList(int)>
		//   86  135:astore_0        
			((List) (abyte0)).add(((Object) (abyte1)));
		//   87  136:aload_0         
		//   88  137:aload           5
		//   89  139:invokeinterface #275 <Method boolean List.add(Object)>
		//   90  144:pop             
			((List) (abyte0)).add(((Object) (abyte2)));
		//   91  145:aload_0         
		//   92  146:aload           6
		//   93  148:invokeinterface #275 <Method boolean List.add(Object)>
		//   94  153:pop             
			return ((List) (abyte0));
		//   95  154:aload_0         
		//   96  155:areturn         
			int i;
			int j;
			int k;
			int l;
			byte abyte1[];
			if(abyte0[0] != 2)
				try
				{
					throw new ParserException("Error parsing vorbis codec private");
				}
		//*  97  156:new             #163 <Class ParserException>
		//*  98  159:dup             
		//*  99  160:ldc2            #259 <String "Error parsing vorbis codec private">
		//* 100  163:invokespecial   #212 <Method void ParserException(String)>
		//* 101  166:athrow          
				// Misplaced declaration of an exception variable
				catch(byte abyte0[])
				{
					throw new ParserException("Error parsing vorbis codec private");
				}
		//* 102  167:astore_0        
		//* 103  168:goto            156
			j = 0;
		//  104  171:iconst_0        
		//  105  172:istore_2        
			for(i = 1; abyte0[i] == -1; i++)
		//* 106  173:iconst_1        
		//* 107  174:istore_1        
		//* 108  175:aload_0         
		//* 109  176:iload_1         
		//* 110  177:baload          
		//* 111  178:iconst_m1       
		//* 112  179:icmpne          195
				j += 255;
		//  113  182:iload_2         
		//  114  183:sipush          255
		//  115  186:iadd            
		//  116  187:istore_2        

		//  117  188:iload_1         
		//  118  189:iconst_1        
		//  119  190:iadd            
		//  120  191:istore_1        
		//* 121  192:goto            175
			k = i + 1;
		//  122  195:iload_1         
		//  123  196:iconst_1        
		//  124  197:iadd            
		//  125  198:istore_3        
			l = j + abyte0[i];
		//  126  199:iload_2         
		//  127  200:aload_0         
		//  128  201:iload_1         
		//  129  202:baload          
		//  130  203:iadd            
		//  131  204:istore          4
			i = 0;
		//  132  206:iconst_0        
		//  133  207:istore_1        
			j = k;
		//  134  208:iload_3         
		//  135  209:istore_2        
			while(abyte0[j] == -1) 
		//* 136  210:aload_0         
		//* 137  211:iload_2         
		//* 138  212:baload          
		//* 139  213:iconst_m1       
		//* 140  214:icmpne          18
			{
				i += 255;
		//  141  217:iload_1         
		//  142  218:sipush          255
		//  143  221:iadd            
		//  144  222:istore_1        
				j++;
		//  145  223:iload_2         
		//  146  224:iconst_1        
		//  147  225:iadd            
		//  148  226:istore_2        
			}
			if(true) goto _L2; else goto _L1
		//  149  227:goto            210
_L1:
		}

		public void initializeOutput(ExtractorOutput extractoroutput, int i)
			throws ParserException
		{
			int j;
			int i1;
			byte byte0;
			Object obj2;
label0:
			{
				String s = codecId;
		//    0    0:aload_0         
		//    1    1:getfield        #280 <Field String codecId>
		//    2    4:astore          10
				j = s.hashCode();
		//    3    6:aload           10
		//    4    8:invokevirtual   #285 <Method int String.hashCode()>
		//    5   11:istore          5
				i1 = 0;
		//    6   13:iconst_0        
		//    7   14:istore          7
				byte0 = 3;
		//    8   16:iconst_3        
		//    9   17:istore          8
				switch(j)
		//*  10   19:iload           5
				{
				default:
					break;

		//*  11   21:lookupswitch    29: default 264
		//		               -2095576542: 766
		//		               -2095575984: 749
		//		               -1985379776: 731
		//		               -1784763192: 713
		//		               -1730367663: 695
		//		               -1482641358: 677
		//		               -1482641357: 659
		//		               -1373388978: 641
		//		               -933872740: 623
		//		               -538363189: 606
		//		               -538363109: 588
		//		               -425012669: 570
		//		               -356037306: 552
		//		               62923557: 534
		//		               62923603: 516
		//		               62927045: 498
		//		               82338133: 481
		//		               82338134: 464
		//		               99146302: 446
		//		               444813526: 428
		//		               542569478: 410
		//		               725957860: 392
		//		               738597099: 374
		//		               855502857: 356
		//		               1422270023: 338
		//		               1809237540: 321
		//		               1950749482: 303
		//		               1950789798: 285
		//		               1951062397: 267
		//*  12  264:goto            783
				case 1951062397: 
					if(s.equals("A_OPUS"))
		//*  13  267:aload           10
		//*  14  269:ldc2            #287 <String "A_OPUS">
		//*  15  272:invokevirtual   #290 <Method boolean String.equals(Object)>
		//*  16  275:ifeq            783
					{
						j = 11;
		//   17  278:bipush          11
		//   18  280:istore          5
						break label0;
		//   19  282:goto            786
					}
					break;

				case 1950789798: 
					if(!s.equals("A_FLAC"))
						break;
		//   20  285:aload           10
		//   21  287:ldc2            #292 <String "A_FLAC">
		//   22  290:invokevirtual   #290 <Method boolean String.equals(Object)>
		//   23  293:ifeq            783
					j = 21;
		//   24  296:bipush          21
		//   25  298:istore          5
					break label0;
		//   26  300:goto            786

				case 1950749482: 
					if(!s.equals("A_EAC3"))
						break;
		//   27  303:aload           10
		//   28  305:ldc2            #294 <String "A_EAC3">
		//   29  308:invokevirtual   #290 <Method boolean String.equals(Object)>
		//   30  311:ifeq            783
					j = 16;
		//   31  314:bipush          16
		//   32  316:istore          5
					break label0;
		//   33  318:goto            786

				case 1809237540: 
					if(!s.equals("V_MPEG2"))
						break;
		//   34  321:aload           10
		//   35  323:ldc2            #296 <String "V_MPEG2">
		//   36  326:invokevirtual   #290 <Method boolean String.equals(Object)>
		//   37  329:ifeq            783
					j = 2;
		//   38  332:iconst_2        
		//   39  333:istore          5
					break label0;
		//   40  335:goto            786

				case 1422270023: 
					if(!s.equals("S_TEXT/UTF8"))
						break;
		//   41  338:aload           10
		//   42  340:ldc2            #298 <String "S_TEXT/UTF8">
		//   43  343:invokevirtual   #290 <Method boolean String.equals(Object)>
		//   44  346:ifeq            783
					j = 24;
		//   45  349:bipush          24
		//   46  351:istore          5
					break label0;
		//   47  353:goto            786

				case 855502857: 
					if(!s.equals("V_MPEGH/ISO/HEVC"))
						break;
		//   48  356:aload           10
		//   49  358:ldc2            #300 <String "V_MPEGH/ISO/HEVC">
		//   50  361:invokevirtual   #290 <Method boolean String.equals(Object)>
		//   51  364:ifeq            783
					j = 7;
		//   52  367:bipush          7
		//   53  369:istore          5
					break label0;
		//   54  371:goto            786

				case 738597099: 
					if(!s.equals("S_TEXT/ASS"))
						break;
		//   55  374:aload           10
		//   56  376:ldc2            #302 <String "S_TEXT/ASS">
		//   57  379:invokevirtual   #290 <Method boolean String.equals(Object)>
		//   58  382:ifeq            783
					j = 25;
		//   59  385:bipush          25
		//   60  387:istore          5
					break label0;
		//   61  389:goto            786

				case 725957860: 
					if(!s.equals("A_PCM/INT/LIT"))
						break;
		//   62  392:aload           10
		//   63  394:ldc2            #304 <String "A_PCM/INT/LIT">
		//   64  397:invokevirtual   #290 <Method boolean String.equals(Object)>
		//   65  400:ifeq            783
					j = 23;
		//   66  403:bipush          23
		//   67  405:istore          5
					break label0;
		//   68  407:goto            786

				case 542569478: 
					if(!s.equals("A_DTS/EXPRESS"))
						break;
		//   69  410:aload           10
		//   70  412:ldc2            #306 <String "A_DTS/EXPRESS">
		//   71  415:invokevirtual   #290 <Method boolean String.equals(Object)>
		//   72  418:ifeq            783
					j = 19;
		//   73  421:bipush          19
		//   74  423:istore          5
					break label0;
		//   75  425:goto            786

				case 444813526: 
					if(!s.equals("V_THEORA"))
						break;
		//   76  428:aload           10
		//   77  430:ldc2            #308 <String "V_THEORA">
		//   78  433:invokevirtual   #290 <Method boolean String.equals(Object)>
		//   79  436:ifeq            783
					j = 9;
		//   80  439:bipush          9
		//   81  441:istore          5
					break label0;
		//   82  443:goto            786

				case 99146302: 
					if(!s.equals("S_HDMV/PGS"))
						break;
		//   83  446:aload           10
		//   84  448:ldc2            #310 <String "S_HDMV/PGS">
		//   85  451:invokevirtual   #290 <Method boolean String.equals(Object)>
		//   86  454:ifeq            783
					j = 27;
		//   87  457:bipush          27
		//   88  459:istore          5
					break label0;
		//   89  461:goto            786

				case 82338134: 
					if(!s.equals("V_VP9"))
						break;
		//   90  464:aload           10
		//   91  466:ldc2            #312 <String "V_VP9">
		//   92  469:invokevirtual   #290 <Method boolean String.equals(Object)>
		//   93  472:ifeq            783
					j = 1;
		//   94  475:iconst_1        
		//   95  476:istore          5
					break label0;
		//   96  478:goto            786

				case 82338133: 
					if(!s.equals("V_VP8"))
						break;
		//   97  481:aload           10
		//   98  483:ldc2            #314 <String "V_VP8">
		//   99  486:invokevirtual   #290 <Method boolean String.equals(Object)>
		//  100  489:ifeq            783
					j = 0;
		//  101  492:iconst_0        
		//  102  493:istore          5
					break label0;
		//  103  495:goto            786

				case 62927045: 
					if(!s.equals("A_DTS"))
						break;
		//  104  498:aload           10
		//  105  500:ldc2            #316 <String "A_DTS">
		//  106  503:invokevirtual   #290 <Method boolean String.equals(Object)>
		//  107  506:ifeq            783
					j = 18;
		//  108  509:bipush          18
		//  109  511:istore          5
					break label0;
		//  110  513:goto            786

				case 62923603: 
					if(!s.equals("A_AC3"))
						break;
		//  111  516:aload           10
		//  112  518:ldc2            #318 <String "A_AC3">
		//  113  521:invokevirtual   #290 <Method boolean String.equals(Object)>
		//  114  524:ifeq            783
					j = 15;
		//  115  527:bipush          15
		//  116  529:istore          5
					break label0;
		//  117  531:goto            786

				case 62923557: 
					if(!s.equals("A_AAC"))
						break;
		//  118  534:aload           10
		//  119  536:ldc2            #320 <String "A_AAC">
		//  120  539:invokevirtual   #290 <Method boolean String.equals(Object)>
		//  121  542:ifeq            783
					j = 12;
		//  122  545:bipush          12
		//  123  547:istore          5
					break label0;
		//  124  549:goto            786

				case -356037306: 
					if(!s.equals("A_DTS/LOSSLESS"))
						break;
		//  125  552:aload           10
		//  126  554:ldc2            #322 <String "A_DTS/LOSSLESS">
		//  127  557:invokevirtual   #290 <Method boolean String.equals(Object)>
		//  128  560:ifeq            783
					j = 20;
		//  129  563:bipush          20
		//  130  565:istore          5
					break label0;
		//  131  567:goto            786

				case -425012669: 
					if(!s.equals("S_VOBSUB"))
						break;
		//  132  570:aload           10
		//  133  572:ldc2            #324 <String "S_VOBSUB">
		//  134  575:invokevirtual   #290 <Method boolean String.equals(Object)>
		//  135  578:ifeq            783
					j = 26;
		//  136  581:bipush          26
		//  137  583:istore          5
					break label0;
		//  138  585:goto            786

				case -538363109: 
					if(!s.equals("V_MPEG4/ISO/AVC"))
						break;
		//  139  588:aload           10
		//  140  590:ldc2            #326 <String "V_MPEG4/ISO/AVC">
		//  141  593:invokevirtual   #290 <Method boolean String.equals(Object)>
		//  142  596:ifeq            783
					j = 6;
		//  143  599:bipush          6
		//  144  601:istore          5
					break label0;
		//  145  603:goto            786

				case -538363189: 
					if(!s.equals("V_MPEG4/ISO/ASP"))
						break;
		//  146  606:aload           10
		//  147  608:ldc2            #328 <String "V_MPEG4/ISO/ASP">
		//  148  611:invokevirtual   #290 <Method boolean String.equals(Object)>
		//  149  614:ifeq            783
					j = 4;
		//  150  617:iconst_4        
		//  151  618:istore          5
					break label0;
		//  152  620:goto            786

				case -933872740: 
					if(!s.equals("S_DVBSUB"))
						break;
		//  153  623:aload           10
		//  154  625:ldc2            #330 <String "S_DVBSUB">
		//  155  628:invokevirtual   #290 <Method boolean String.equals(Object)>
		//  156  631:ifeq            783
					j = 28;
		//  157  634:bipush          28
		//  158  636:istore          5
					break label0;
		//  159  638:goto            786

				case -1373388978: 
					if(!s.equals("V_MS/VFW/FOURCC"))
						break;
		//  160  641:aload           10
		//  161  643:ldc2            #332 <String "V_MS/VFW/FOURCC">
		//  162  646:invokevirtual   #290 <Method boolean String.equals(Object)>
		//  163  649:ifeq            783
					j = 8;
		//  164  652:bipush          8
		//  165  654:istore          5
					break label0;
		//  166  656:goto            786

				case -1482641357: 
					if(!s.equals("A_MPEG/L3"))
						break;
		//  167  659:aload           10
		//  168  661:ldc2            #334 <String "A_MPEG/L3">
		//  169  664:invokevirtual   #290 <Method boolean String.equals(Object)>
		//  170  667:ifeq            783
					j = 14;
		//  171  670:bipush          14
		//  172  672:istore          5
					break label0;
		//  173  674:goto            786

				case -1482641358: 
					if(!s.equals("A_MPEG/L2"))
						break;
		//  174  677:aload           10
		//  175  679:ldc2            #336 <String "A_MPEG/L2">
		//  176  682:invokevirtual   #290 <Method boolean String.equals(Object)>
		//  177  685:ifeq            783
					j = 13;
		//  178  688:bipush          13
		//  179  690:istore          5
					break label0;
		//  180  692:goto            786

				case -1730367663: 
					if(!s.equals("A_VORBIS"))
						break;
		//  181  695:aload           10
		//  182  697:ldc2            #338 <String "A_VORBIS">
		//  183  700:invokevirtual   #290 <Method boolean String.equals(Object)>
		//  184  703:ifeq            783
					j = 10;
		//  185  706:bipush          10
		//  186  708:istore          5
					break label0;
		//  187  710:goto            786

				case -1784763192: 
					if(!s.equals("A_TRUEHD"))
						break;
		//  188  713:aload           10
		//  189  715:ldc2            #340 <String "A_TRUEHD">
		//  190  718:invokevirtual   #290 <Method boolean String.equals(Object)>
		//  191  721:ifeq            783
					j = 17;
		//  192  724:bipush          17
		//  193  726:istore          5
					break label0;
		//  194  728:goto            786

				case -1985379776: 
					if(!s.equals("A_MS/ACM"))
						break;
		//  195  731:aload           10
		//  196  733:ldc2            #342 <String "A_MS/ACM">
		//  197  736:invokevirtual   #290 <Method boolean String.equals(Object)>
		//  198  739:ifeq            783
					j = 22;
		//  199  742:bipush          22
		//  200  744:istore          5
					break label0;
		//  201  746:goto            786

				case -2095575984: 
					if(!s.equals("V_MPEG4/ISO/SP"))
						break;
		//  202  749:aload           10
		//  203  751:ldc2            #344 <String "V_MPEG4/ISO/SP">
		//  204  754:invokevirtual   #290 <Method boolean String.equals(Object)>
		//  205  757:ifeq            783
					j = 3;
		//  206  760:iconst_3        
		//  207  761:istore          5
					break label0;
		//  208  763:goto            786

				case -2095576542: 
					if(!s.equals("V_MPEG4/ISO/AP"))
						break;
		//  209  766:aload           10
		//  210  768:ldc2            #346 <String "V_MPEG4/ISO/AP">
		//  211  771:invokevirtual   #290 <Method boolean String.equals(Object)>
		//  212  774:ifeq            783
					j = 5;
		//  213  777:iconst_5        
		//  214  778:istore          5
					break label0;
		//  215  780:goto            786
				}
				j = -1;
		//  216  783:iconst_m1       
		//  217  784:istore          5
			}
			obj2 = null;
		//  218  786:aconst_null     
		//  219  787:astore          12
			j;
		//  220  789:iload           5
			JVM INSTR tableswitch 0 28: default 920
		//		               0 1685
		//		               1 1677
		//		               2 1669
		//		               3 1639
		//		               4 1639
		//		               5 1639
		//		               6 1592
		//		               7 1552
		//		               8 1506
		//		               9 1499
		//		               10 1474
		//		               11 1381
		//		               12 1364
		//		               13 1344
		//		               14 1336
		//		               15 1328
		//		               16 1320
		//		               17 1301
		//		               18 1293
		//		               19 1293
		//		               20 1285
		//		               21 1268
		//		               22 1122
		//		               23 1024
		//		               24 1016
		//		               25 1008
		//		               26 991
		//		               27 983
		//		               28 931;
		//  221  791:tableswitch     0 28: default 920
		//		               0 1685
		//		               1 1677
		//		               2 1669
		//		               3 1639
		//		               4 1639
		//		               5 1639
		//		               6 1592
		//		               7 1552
		//		               8 1506
		//		               9 1499
		//		               10 1474
		//		               11 1381
		//		               12 1364
		//		               13 1344
		//		               14 1336
		//		               15 1328
		//		               16 1320
		//		               17 1301
		//		               18 1293
		//		               19 1293
		//		               20 1285
		//		               21 1268
		//		               22 1122
		//		               23 1024
		//		               24 1016
		//		               25 1008
		//		               26 991
		//		               27 983
		//		               28 931
			   goto _L1 _L2 _L3 _L4 _L5 _L5 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27
_L1:
			throw new ParserException("Unrecognized codec identifier.");
		//  222  920:new             #163 <Class ParserException>
		//  223  923:dup             
		//  224  924:ldc2            #348 <String "Unrecognized codec identifier.">
		//  225  927:invokespecial   #212 <Method void ParserException(String)>
		//  226  930:athrow          
_L27:
			Object obj;
			Object obj1;
			obj1 = "application/dvbsubs";
		//  227  931:ldc2            #350 <String "application/dvbsubs">
		//  228  934:astore          11
			obj = ((Object) (Collections.singletonList(((Object) (new byte[] {
				codecPrivate[0], codecPrivate[1], codecPrivate[2], codecPrivate[3]
			})))));
		//  229  936:iconst_4        
		//  230  937:newarray        byte[]
		//  231  939:dup             
		//  232  940:iconst_0        
		//  233  941:aload_0         
		//  234  942:getfield        #352 <Field byte[] codecPrivate>
		//  235  945:iconst_0        
		//  236  946:baload          
		//  237  947:bastore         
		//  238  948:dup             
		//  239  949:iconst_1        
		//  240  950:aload_0         
		//  241  951:getfield        #352 <Field byte[] codecPrivate>
		//  242  954:iconst_1        
		//  243  955:baload          
		//  244  956:bastore         
		//  245  957:dup             
		//  246  958:iconst_2        
		//  247  959:aload_0         
		//  248  960:getfield        #352 <Field byte[] codecPrivate>
		//  249  963:iconst_2        
		//  250  964:baload          
		//  251  965:bastore         
		//  252  966:dup             
		//  253  967:iconst_3        
		//  254  968:aload_0         
		//  255  969:getfield        #352 <Field byte[] codecPrivate>
		//  256  972:iconst_3        
		//  257  973:baload          
		//  258  974:bastore         
		//  259  975:invokestatic    #207 <Method List Collections.singletonList(Object)>
		//  260  978:astore          10
			  goto _L28
		//* 261  980:goto            1378
_L26:
			obj = "application/pgs";
		//  262  983:ldc2            #354 <String "application/pgs">
		//  263  986:astore          10
			  goto _L29
		//* 264  988:goto            1690
_L25:
			obj1 = "application/vobsub";
		//  265  991:ldc2            #356 <String "application/vobsub">
		//  266  994:astore          11
			obj = ((Object) (Collections.singletonList(((Object) (codecPrivate)))));
		//  267  996:aload_0         
		//  268  997:getfield        #352 <Field byte[] codecPrivate>
		//  269 1000:invokestatic    #207 <Method List Collections.singletonList(Object)>
		//  270 1003:astore          10
			  goto _L28
		//* 271 1005:goto            1378
_L24:
			obj = "text/x-ssa";
		//  272 1008:ldc2            #358 <String "text/x-ssa">
		//  273 1011:astore          10
			  goto _L29
		//* 274 1013:goto            1690
_L23:
			obj = "application/x-subrip";
		//  275 1016:ldc2            #360 <String "application/x-subrip">
		//  276 1019:astore          10
			  goto _L29
		//* 277 1021:goto            1690
_L22:
			int k;
			k = Util.getPcmEncoding(audioBitDepth);
		//  278 1024:aload_0         
		//  279 1025:getfield        #124 <Field int audioBitDepth>
		//  280 1028:invokestatic    #366 <Method int Util.getPcmEncoding(int)>
		//  281 1031:istore          6
			j = k;
		//  282 1033:iload           6
		//  283 1035:istore          5
			if(k != 0) goto _L31; else goto _L30
		//  284 1037:iload           6
		//  285 1039:ifne            1107
_L30:
			obj = "audio/x-unknown";
		//  286 1042:ldc2            #368 <String "audio/x-unknown">
		//  287 1045:astore          10
			obj1 = ((Object) (new StringBuilder()));
		//  288 1047:new             #370 <Class StringBuilder>
		//  289 1050:dup             
		//  290 1051:invokespecial   #371 <Method void StringBuilder()>
		//  291 1054:astore          11
			((StringBuilder) (obj1)).append("Unsupported PCM bit depth: ");
		//  292 1056:aload           11
		//  293 1058:ldc2            #373 <String "Unsupported PCM bit depth: ">
		//  294 1061:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
		//  295 1064:pop             
			((StringBuilder) (obj1)).append(audioBitDepth);
		//  296 1065:aload           11
		//  297 1067:aload_0         
		//  298 1068:getfield        #124 <Field int audioBitDepth>
		//  299 1071:invokevirtual   #380 <Method StringBuilder StringBuilder.append(int)>
		//  300 1074:pop             
			((StringBuilder) (obj1)).append(". Setting mimeType to ");
		//  301 1075:aload           11
		//  302 1077:ldc2            #382 <String ". Setting mimeType to ">
		//  303 1080:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
		//  304 1083:pop             
			((StringBuilder) (obj1)).append("audio/x-unknown");
		//  305 1084:aload           11
		//  306 1086:ldc2            #368 <String "audio/x-unknown">
		//  307 1089:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
		//  308 1092:pop             
			Log.w("MatroskaExtractor", ((StringBuilder) (obj1)).toString());
		//  309 1093:ldc1            #214 <String "MatroskaExtractor">
		//  310 1095:aload           11
		//  311 1097:invokevirtual   #386 <Method String StringBuilder.toString()>
		//  312 1100:invokestatic    #222 <Method int Log.w(String, String)>
		//  313 1103:pop             
			  goto _L29
		//* 314 1104:goto            1690
_L31:
			obj1 = "audio/raw";
		//  315 1107:ldc2            #388 <String "audio/raw">
		//  316 1110:astore          11
			k = j;
		//  317 1112:iload           5
		//  318 1114:istore          6
			j = -1;
		//  319 1116:iconst_m1       
		//  320 1117:istore          5
			  goto _L32
		//* 321 1119:goto            1701
_L21:
			if(!parseMsAcmCodecPrivate(new ParsableByteArray(codecPrivate))) goto _L34; else goto _L33
		//  322 1122:new             #167 <Class ParsableByteArray>
		//  323 1125:dup             
		//  324 1126:aload_0         
		//  325 1127:getfield        #352 <Field byte[] codecPrivate>
		//  326 1130:invokespecial   #391 <Method void ParsableByteArray(byte[])>
		//  327 1133:invokestatic    #393 <Method boolean parseMsAcmCodecPrivate(ParsableByteArray)>
		//  328 1136:ifeq            1222
_L33:
			k = Util.getPcmEncoding(audioBitDepth);
		//  329 1139:aload_0         
		//  330 1140:getfield        #124 <Field int audioBitDepth>
		//  331 1143:invokestatic    #366 <Method int Util.getPcmEncoding(int)>
		//  332 1146:istore          6
			j = k;
		//  333 1148:iload           6
		//  334 1150:istore          5
			if(k != 0) goto _L31; else goto _L35
		//  335 1152:iload           6
		//  336 1154:ifne            1107
_L35:
			obj = "audio/x-unknown";
		//  337 1157:ldc2            #368 <String "audio/x-unknown">
		//  338 1160:astore          10
			obj1 = ((Object) (new StringBuilder()));
		//  339 1162:new             #370 <Class StringBuilder>
		//  340 1165:dup             
		//  341 1166:invokespecial   #371 <Method void StringBuilder()>
		//  342 1169:astore          11
			((StringBuilder) (obj1)).append("Unsupported PCM bit depth: ");
		//  343 1171:aload           11
		//  344 1173:ldc2            #373 <String "Unsupported PCM bit depth: ">
		//  345 1176:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
		//  346 1179:pop             
			((StringBuilder) (obj1)).append(audioBitDepth);
		//  347 1180:aload           11
		//  348 1182:aload_0         
		//  349 1183:getfield        #124 <Field int audioBitDepth>
		//  350 1186:invokevirtual   #380 <Method StringBuilder StringBuilder.append(int)>
		//  351 1189:pop             
			((StringBuilder) (obj1)).append(". Setting mimeType to ");
		//  352 1190:aload           11
		//  353 1192:ldc2            #382 <String ". Setting mimeType to ">
		//  354 1195:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
		//  355 1198:pop             
			((StringBuilder) (obj1)).append("audio/x-unknown");
		//  356 1199:aload           11
		//  357 1201:ldc2            #368 <String "audio/x-unknown">
		//  358 1204:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
		//  359 1207:pop             
			Log.w("MatroskaExtractor", ((StringBuilder) (obj1)).toString());
		//  360 1208:ldc1            #214 <String "MatroskaExtractor">
		//  361 1210:aload           11
		//  362 1212:invokevirtual   #386 <Method String StringBuilder.toString()>
		//  363 1215:invokestatic    #222 <Method int Log.w(String, String)>
		//  364 1218:pop             
			  goto _L29
		//* 365 1219:goto            1690
_L34:
			obj = "audio/x-unknown";
		//  366 1222:ldc2            #368 <String "audio/x-unknown">
		//  367 1225:astore          10
			obj1 = ((Object) (new StringBuilder()));
		//  368 1227:new             #370 <Class StringBuilder>
		//  369 1230:dup             
		//  370 1231:invokespecial   #371 <Method void StringBuilder()>
		//  371 1234:astore          11
			((StringBuilder) (obj1)).append("Non-PCM MS/ACM is unsupported. Setting mimeType to ");
		//  372 1236:aload           11
		//  373 1238:ldc2            #395 <String "Non-PCM MS/ACM is unsupported. Setting mimeType to ">
		//  374 1241:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
		//  375 1244:pop             
			((StringBuilder) (obj1)).append("audio/x-unknown");
		//  376 1245:aload           11
		//  377 1247:ldc2            #368 <String "audio/x-unknown">
		//  378 1250:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
		//  379 1253:pop             
			Log.w("MatroskaExtractor", ((StringBuilder) (obj1)).toString());
		//  380 1254:ldc1            #214 <String "MatroskaExtractor">
		//  381 1256:aload           11
		//  382 1258:invokevirtual   #386 <Method String StringBuilder.toString()>
		//  383 1261:invokestatic    #222 <Method int Log.w(String, String)>
		//  384 1264:pop             
			  goto _L29
		//* 385 1265:goto            1690
_L20:
			obj1 = "audio/flac";
		//  386 1268:ldc2            #397 <String "audio/flac">
		//  387 1271:astore          11
			obj = ((Object) (Collections.singletonList(((Object) (codecPrivate)))));
		//  388 1273:aload_0         
		//  389 1274:getfield        #352 <Field byte[] codecPrivate>
		//  390 1277:invokestatic    #207 <Method List Collections.singletonList(Object)>
		//  391 1280:astore          10
			  goto _L28
		//* 392 1282:goto            1378
_L19:
			obj = "audio/vnd.dts.hd";
		//  393 1285:ldc2            #399 <String "audio/vnd.dts.hd">
		//  394 1288:astore          10
			  goto _L29
		//* 395 1290:goto            1690
_L18:
			obj = "audio/vnd.dts";
		//  396 1293:ldc2            #401 <String "audio/vnd.dts">
		//  397 1296:astore          10
			  goto _L29
		//* 398 1298:goto            1690
_L17:
			obj = "audio/true-hd";
		//  399 1301:ldc2            #403 <String "audio/true-hd">
		//  400 1304:astore          10
			trueHdSampleRechunker = new TrueHdSampleRechunker();
		//  401 1306:aload_0         
		//  402 1307:new             #405 <Class MatroskaExtractor$TrueHdSampleRechunker>
		//  403 1310:dup             
		//  404 1311:invokespecial   #406 <Method void MatroskaExtractor$TrueHdSampleRechunker()>
		//  405 1314:putfield        #408 <Field MatroskaExtractor$TrueHdSampleRechunker trueHdSampleRechunker>
			  goto _L29
		//* 406 1317:goto            1690
_L16:
			obj = "audio/eac3";
		//  407 1320:ldc2            #410 <String "audio/eac3">
		//  408 1323:astore          10
			  goto _L29
		//* 409 1325:goto            1690
_L15:
			obj = "audio/ac3";
		//  410 1328:ldc2            #412 <String "audio/ac3">
		//  411 1331:astore          10
			  goto _L29
		//* 412 1333:goto            1690
_L14:
			obj = "audio/mpeg";
		//  413 1336:ldc2            #414 <String "audio/mpeg">
		//  414 1339:astore          10
			  goto _L36
		//* 415 1341:goto            1349
_L13:
			obj = "audio/mpeg-L2";
		//  416 1344:ldc2            #416 <String "audio/mpeg-L2">
		//  417 1347:astore          10
_L36:
			j = 4096;
		//  418 1349:sipush          4096
		//  419 1352:istore          5
			k = -1;
		//  420 1354:iconst_m1       
		//  421 1355:istore          6
			obj1 = obj;
		//  422 1357:aload           10
		//  423 1359:astore          11
			  goto _L32
		//* 424 1361:goto            1701
_L12:
			obj1 = "audio/mp4a-latm";
		//  425 1364:ldc2            #418 <String "audio/mp4a-latm">
		//  426 1367:astore          11
			obj = ((Object) (Collections.singletonList(((Object) (codecPrivate)))));
		//  427 1369:aload_0         
		//  428 1370:getfield        #352 <Field byte[] codecPrivate>
		//  429 1373:invokestatic    #207 <Method List Collections.singletonList(Object)>
		//  430 1376:astore          10
			  goto _L28
		//* 431 1378:goto            1629
_L11:
			obj1 = "audio/opus";
		//  432 1381:ldc2            #420 <String "audio/opus">
		//  433 1384:astore          11
			j = 5760;
		//  434 1386:sipush          5760
		//  435 1389:istore          5
			obj = ((Object) (new ArrayList(3)));
		//  436 1391:new             #267 <Class ArrayList>
		//  437 1394:dup             
		//  438 1395:iconst_3        
		//  439 1396:invokespecial   #269 <Method void ArrayList(int)>
		//  440 1399:astore          10
			((List) (obj)).add(((Object) (codecPrivate)));
		//  441 1401:aload           10
		//  442 1403:aload_0         
		//  443 1404:getfield        #352 <Field byte[] codecPrivate>
		//  444 1407:invokeinterface #275 <Method boolean List.add(Object)>
		//  445 1412:pop             
			((List) (obj)).add(((Object) (ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(codecDelayNs).array())));
		//  446 1413:aload           10
		//  447 1415:bipush          8
		//  448 1417:invokestatic    #424 <Method ByteBuffer ByteBuffer.allocate(int)>
		//  449 1420:invokestatic    #430 <Method ByteOrder ByteOrder.nativeOrder()>
		//  450 1423:invokevirtual   #434 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
		//  451 1426:aload_0         
		//  452 1427:getfield        #128 <Field long codecDelayNs>
		//  453 1430:invokevirtual   #438 <Method ByteBuffer ByteBuffer.putLong(long)>
		//  454 1433:invokevirtual   #441 <Method byte[] ByteBuffer.array()>
		//  455 1436:invokeinterface #275 <Method boolean List.add(Object)>
		//  456 1441:pop             
			((List) (obj)).add(((Object) (ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(seekPreRollNs).array())));
		//  457 1442:aload           10
		//  458 1444:bipush          8
		//  459 1446:invokestatic    #424 <Method ByteBuffer ByteBuffer.allocate(int)>
		//  460 1449:invokestatic    #430 <Method ByteOrder ByteOrder.nativeOrder()>
		//  461 1452:invokevirtual   #434 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
		//  462 1455:aload_0         
		//  463 1456:getfield        #130 <Field long seekPreRollNs>
		//  464 1459:invokevirtual   #438 <Method ByteBuffer ByteBuffer.putLong(long)>
		//  465 1462:invokevirtual   #441 <Method byte[] ByteBuffer.array()>
		//  466 1465:invokeinterface #275 <Method boolean List.add(Object)>
		//  467 1470:pop             
			  goto _L37
		//* 468 1471:goto            1493
_L10:
			obj1 = "audio/vorbis";
		//  469 1474:ldc2            #443 <String "audio/vorbis">
		//  470 1477:astore          11
			j = 8192;
		//  471 1479:sipush          8192
		//  472 1482:istore          5
			obj = ((Object) (parseVorbisCodecPrivate(codecPrivate)));
		//  473 1484:aload_0         
		//  474 1485:getfield        #352 <Field byte[] codecPrivate>
		//  475 1488:invokestatic    #445 <Method List parseVorbisCodecPrivate(byte[])>
		//  476 1491:astore          10
_L37:
			k = -1;
		//  477 1493:iconst_m1       
		//  478 1494:istore          6
			  goto _L38
		//* 479 1496:goto            1704
_L9:
			obj = "video/x-unknown";
		//  480 1499:ldc1            #224 <String "video/x-unknown">
		//  481 1501:astore          10
			  goto _L29
		//* 482 1503:goto            1690
_L8:
			obj = ((Object) (parseFourCcPrivate(new ParsableByteArray(codecPrivate))));
		//  483 1506:new             #167 <Class ParsableByteArray>
		//  484 1509:dup             
		//  485 1510:aload_0         
		//  486 1511:getfield        #352 <Field byte[] codecPrivate>
		//  487 1514:invokespecial   #391 <Method void ParsableByteArray(byte[])>
		//  488 1517:invokestatic    #447 <Method Pair parseFourCcPrivate(ParsableByteArray)>
		//  489 1520:astore          10
			obj1 = ((Object) ((String)((Pair) (obj)).first));
		//  490 1522:aload           10
		//  491 1524:getfield        #451 <Field Object Pair.first>
		//  492 1527:checkcast       #282 <Class String>
		//  493 1530:astore          11
			obj = ((Object) ((List)((Pair) (obj)).second));
		//  494 1532:aload           10
		//  495 1534:getfield        #454 <Field Object Pair.second>
		//  496 1537:checkcast       #271 <Class List>
		//  497 1540:astore          10
			j = -1;
		//  498 1542:iconst_m1       
		//  499 1543:istore          5
			k = j;
		//  500 1545:iload           5
		//  501 1547:istore          6
			  goto _L38
		//* 502 1549:goto            1704
_L7:
			obj1 = "video/hevc";
		//  503 1552:ldc2            #456 <String "video/hevc">
		//  504 1555:astore          11
			HevcConfig hevcconfig = HevcConfig.parse(new ParsableByteArray(codecPrivate));
		//  505 1557:new             #167 <Class ParsableByteArray>
		//  506 1560:dup             
		//  507 1561:aload_0         
		//  508 1562:getfield        #352 <Field byte[] codecPrivate>
		//  509 1565:invokespecial   #391 <Method void ParsableByteArray(byte[])>
		//  510 1568:invokestatic    #462 <Method HevcConfig HevcConfig.parse(ParsableByteArray)>
		//  511 1571:astore          13
			obj = ((Object) (hevcconfig.initializationData));
		//  512 1573:aload           13
		//  513 1575:getfield        #466 <Field List HevcConfig.initializationData>
		//  514 1578:astore          10
			nalUnitLengthFieldLength = hevcconfig.nalUnitLengthFieldLength;
		//  515 1580:aload_0         
		//  516 1581:aload           13
		//  517 1583:getfield        #468 <Field int HevcConfig.nalUnitLengthFieldLength>
		//  518 1586:putfield        #469 <Field int nalUnitLengthFieldLength>
			  goto _L28
		//* 519 1589:goto            1629
_L6:
			obj1 = "video/avc";
		//  520 1592:ldc2            #471 <String "video/avc">
		//  521 1595:astore          11
			AvcConfig avcconfig = AvcConfig.parse(new ParsableByteArray(codecPrivate));
		//  522 1597:new             #167 <Class ParsableByteArray>
		//  523 1600:dup             
		//  524 1601:aload_0         
		//  525 1602:getfield        #352 <Field byte[] codecPrivate>
		//  526 1605:invokespecial   #391 <Method void ParsableByteArray(byte[])>
		//  527 1608:invokestatic    #476 <Method AvcConfig AvcConfig.parse(ParsableByteArray)>
		//  528 1611:astore          13
			obj = ((Object) (avcconfig.initializationData));
		//  529 1613:aload           13
		//  530 1615:getfield        #477 <Field List AvcConfig.initializationData>
		//  531 1618:astore          10
			nalUnitLengthFieldLength = avcconfig.nalUnitLengthFieldLength;
		//  532 1620:aload_0         
		//  533 1621:aload           13
		//  534 1623:getfield        #478 <Field int AvcConfig.nalUnitLengthFieldLength>
		//  535 1626:putfield        #469 <Field int nalUnitLengthFieldLength>
_L28:
			j = -1;
		//  536 1629:iconst_m1       
		//  537 1630:istore          5
			k = j;
		//  538 1632:iload           5
		//  539 1634:istore          6
			break; /* Loop/switch isn't completed */
		//  540 1636:goto            1704
_L5:
			obj1 = "video/mp4v-es";
		//  541 1639:ldc2            #480 <String "video/mp4v-es">
		//  542 1642:astore          11
			if(codecPrivate == null)
		//* 543 1644:aload_0         
		//* 544 1645:getfield        #352 <Field byte[] codecPrivate>
		//* 545 1648:ifnonnull       1657
				obj = null;
		//  546 1651:aconst_null     
		//  547 1652:astore          10
			else
		//* 548 1654:goto            1378
				obj = ((Object) (Collections.singletonList(((Object) (codecPrivate)))));
		//  549 1657:aload_0         
		//  550 1658:getfield        #352 <Field byte[] codecPrivate>
		//  551 1661:invokestatic    #207 <Method List Collections.singletonList(Object)>
		//  552 1664:astore          10
			if(true) goto _L28; else goto _L38
		//  553 1666:goto            1378
_L4:
			obj = "video/mpeg2";
		//  554 1669:ldc2            #482 <String "video/mpeg2">
		//  555 1672:astore          10
			  goto _L29
		//* 556 1674:goto            1690
_L3:
			obj = "video/x-vnd.on2.vp9";
		//  557 1677:ldc2            #484 <String "video/x-vnd.on2.vp9">
		//  558 1680:astore          10
			  goto _L29
		//* 559 1682:goto            1690
_L2:
			obj = "video/x-vnd.on2.vp8";
		//  560 1685:ldc2            #486 <String "video/x-vnd.on2.vp8">
		//  561 1688:astore          10
_L29:
			j = -1;
		//  562 1690:iconst_m1       
		//  563 1691:istore          5
			k = j;
		//  564 1693:iload           5
		//  565 1695:istore          6
			obj1 = obj;
		//  566 1697:aload           10
		//  567 1699:astore          11
_L32:
			obj = null;
		//  568 1701:aconst_null     
		//  569 1702:astore          10
_L38:
			boolean flag = flagDefault;
		//  570 1704:aload_0         
		//  571 1705:getfield        #132 <Field boolean flagDefault>
		//  572 1708:istore          9
			if(flagForced)
		//* 573 1710:aload_0         
		//* 574 1711:getfield        #488 <Field boolean flagForced>
		//* 575 1714:ifeq            1720
				i1 = 2;
		//  576 1717:iconst_2        
		//  577 1718:istore          7
			i1 = flag | false | i1;
		//  578 1720:iload           9
		//  579 1722:iconst_0        
		//  580 1723:ior             
		//  581 1724:iload           7
		//  582 1726:ior             
		//  583 1727:istore          7
			if(MimeTypes.isAudio(((String) (obj1))))
		//* 584 1729:aload           11
		//* 585 1731:invokestatic    #494 <Method boolean MimeTypes.isAudio(String)>
		//* 586 1734:ifeq            1779
			{
				obj = ((Object) (Format.createAudioSampleFormat(Integer.toString(i), ((String) (obj1)), ((String) (null)), -1, j, channelCount, sampleRate, k, ((List) (obj)), drmInitData, i1, language)));
		//  587 1737:iload_2         
		//  588 1738:invokestatic    #499 <Method String Integer.toString(int)>
		//  589 1741:aload           11
		//  590 1743:aconst_null     
		//  591 1744:iconst_m1       
		//  592 1745:iload           5
		//  593 1747:aload_0         
		//  594 1748:getfield        #122 <Field int channelCount>
		//  595 1751:aload_0         
		//  596 1752:getfield        #126 <Field int sampleRate>
		//  597 1755:iload           6
		//  598 1757:aload           10
		//  599 1759:aload_0         
		//  600 1760:getfield        #501 <Field DrmInitData drmInitData>
		//  601 1763:iload           7
		//  602 1765:aload_0         
		//  603 1766:getfield        #136 <Field String language>
		//  604 1769:invokestatic    #507 <Method Format Format.createAudioSampleFormat(String, String, String, int, int, int, int, int, List, DrmInitData, int, String)>
		//  605 1772:astore          10
				i = 1;
		//  606 1774:iconst_1        
		//  607 1775:istore_2        
			} else
		//* 608 1776:goto            2176
			if(MimeTypes.isVideo(((String) (obj1))))
		//* 609 1779:aload           11
		//* 610 1781:invokestatic    #510 <Method boolean MimeTypes.isVideo(String)>
		//* 611 1784:ifeq            1984
			{
				if(displayUnit == 0)
		//* 612 1787:aload_0         
		//* 613 1788:getfield        #83  <Field int displayUnit>
		//* 614 1791:ifne            1852
				{
					int l;
					if(displayWidth == -1)
		//* 615 1794:aload_0         
		//* 616 1795:getfield        #79  <Field int displayWidth>
		//* 617 1798:iconst_m1       
		//* 618 1799:icmpne          1811
						l = width;
		//  619 1802:aload_0         
		//  620 1803:getfield        #75  <Field int width>
		//  621 1806:istore          6
					else
		//* 622 1808:goto            1817
						l = displayWidth;
		//  623 1811:aload_0         
		//  624 1812:getfield        #79  <Field int displayWidth>
		//  625 1815:istore          6
					displayWidth = l;
		//  626 1817:aload_0         
		//  627 1818:iload           6
		//  628 1820:putfield        #79  <Field int displayWidth>
					if(displayHeight == -1)
		//* 629 1823:aload_0         
		//* 630 1824:getfield        #81  <Field int displayHeight>
		//* 631 1827:iconst_m1       
		//* 632 1828:icmpne          1840
						l = height;
		//  633 1831:aload_0         
		//  634 1832:getfield        #77  <Field int height>
		//  635 1835:istore          6
					else
		//* 636 1837:goto            1846
						l = displayHeight;
		//  637 1840:aload_0         
		//  638 1841:getfield        #81  <Field int displayHeight>
		//  639 1844:istore          6
					displayHeight = l;
		//  640 1846:aload_0         
		//  641 1847:iload           6
		//  642 1849:putfield        #81  <Field int displayHeight>
				}
				float f1 = -1F;
		//  643 1852:ldc1            #100 <Float -1F>
		//  644 1854:fstore          4
				float f = f1;
		//  645 1856:fload           4
		//  646 1858:fstore_3        
				if(displayWidth != -1)
		//* 647 1859:aload_0         
		//* 648 1860:getfield        #79  <Field int displayWidth>
		//* 649 1863:iconst_m1       
		//* 650 1864:icmpeq          1900
				{
					f = f1;
		//  651 1867:fload           4
		//  652 1869:fstore_3        
					if(displayHeight != -1)
		//* 653 1870:aload_0         
		//* 654 1871:getfield        #81  <Field int displayHeight>
		//* 655 1874:iconst_m1       
		//* 656 1875:icmpeq          1900
						f = (float)(height * displayWidth) / (float)(width * displayHeight);
		//  657 1878:aload_0         
		//  658 1879:getfield        #77  <Field int height>
		//  659 1882:aload_0         
		//  660 1883:getfield        #79  <Field int displayWidth>
		//  661 1886:imul            
		//  662 1887:i2f             
		//  663 1888:aload_0         
		//  664 1889:getfield        #75  <Field int width>
		//  665 1892:aload_0         
		//  666 1893:getfield        #81  <Field int displayHeight>
		//  667 1896:imul            
		//  668 1897:i2f             
		//  669 1898:fdiv            
		//  670 1899:fstore_3        
				}
				if(hasColorInfo)
		//* 671 1900:aload_0         
		//* 672 1901:getfield        #89  <Field boolean hasColorInfo>
		//* 673 1904:ifeq            1936
				{
					obj2 = ((Object) (getHdrStaticInfo()));
		//  674 1907:aload_0         
		//  675 1908:invokespecial   #512 <Method byte[] getHdrStaticInfo()>
		//  676 1911:astore          12
					obj2 = ((Object) (new ColorInfo(colorSpace, colorRange, colorTransfer, ((byte []) (obj2)))));
		//  677 1913:new             #514 <Class ColorInfo>
		//  678 1916:dup             
		//  679 1917:aload_0         
		//  680 1918:getfield        #91  <Field int colorSpace>
		//  681 1921:aload_0         
		//  682 1922:getfield        #95  <Field int colorRange>
		//  683 1925:aload_0         
		//  684 1926:getfield        #93  <Field int colorTransfer>
		//  685 1929:aload           12
		//  686 1931:invokespecial   #517 <Method void ColorInfo(int, int, int, byte[])>
		//  687 1934:astore          12
				}
				obj = ((Object) (Format.createVideoSampleFormat(Integer.toString(i), ((String) (obj1)), ((String) (null)), -1, j, width, height, -1F, ((List) (obj)), -1, f, projectionData, stereoMode, ((ColorInfo) (obj2)), drmInitData)));
		//  688 1936:iload_2         
		//  689 1937:invokestatic    #499 <Method String Integer.toString(int)>
		//  690 1940:aload           11
		//  691 1942:aconst_null     
		//  692 1943:iconst_m1       
		//  693 1944:iload           5
		//  694 1946:aload_0         
		//  695 1947:getfield        #75  <Field int width>
		//  696 1950:aload_0         
		//  697 1951:getfield        #77  <Field int height>
		//  698 1954:ldc1            #100 <Float -1F>
		//  699 1956:aload           10
		//  700 1958:iconst_m1       
		//  701 1959:fload_3         
		//  702 1960:aload_0         
		//  703 1961:getfield        #85  <Field byte[] projectionData>
		//  704 1964:aload_0         
		//  705 1965:getfield        #87  <Field int stereoMode>
		//  706 1968:aload           12
		//  707 1970:aload_0         
		//  708 1971:getfield        #501 <Field DrmInitData drmInitData>
		//  709 1974:invokestatic    #521 <Method Format Format.createVideoSampleFormat(String, String, String, int, int, int, int, float, List, int, float, byte[], int, ColorInfo, DrmInitData)>
		//  710 1977:astore          10
				i = 2;
		//  711 1979:iconst_2        
		//  712 1980:istore_2        
			} else
		//* 713 1981:goto            2176
			if("application/x-subrip".equals(obj1))
		//* 714 1984:ldc2            #360 <String "application/x-subrip">
		//* 715 1987:aload           11
		//* 716 1989:invokevirtual   #290 <Method boolean String.equals(Object)>
		//* 717 1992:ifeq            2022
			{
				obj = ((Object) (Format.createTextSampleFormat(Integer.toString(i), ((String) (obj1)), i1, language, drmInitData)));
		//  718 1995:iload_2         
		//  719 1996:invokestatic    #499 <Method String Integer.toString(int)>
		//  720 1999:aload           11
		//  721 2001:iload           7
		//  722 2003:aload_0         
		//  723 2004:getfield        #136 <Field String language>
		//  724 2007:aload_0         
		//  725 2008:getfield        #501 <Field DrmInitData drmInitData>
		//  726 2011:invokestatic    #525 <Method Format Format.createTextSampleFormat(String, String, int, String, DrmInitData)>
		//  727 2014:astore          10
				i = ((int) (byte0));
		//  728 2016:iload           8
		//  729 2018:istore_2        
			} else
		//* 730 2019:goto            2176
			if("text/x-ssa".equals(obj1))
		//* 731 2022:ldc2            #358 <String "text/x-ssa">
		//* 732 2025:aload           11
		//* 733 2027:invokevirtual   #290 <Method boolean String.equals(Object)>
		//* 734 2030:ifeq            2101
			{
				obj = ((Object) (new ArrayList(2)));
		//  735 2033:new             #267 <Class ArrayList>
		//  736 2036:dup             
		//  737 2037:iconst_2        
		//  738 2038:invokespecial   #269 <Method void ArrayList(int)>
		//  739 2041:astore          10
				((List) (obj)).add(((Object) (MatroskaExtractor.SSA_DIALOGUE_FORMAT)));
		//  740 2043:aload           10
		//  741 2045:invokestatic    #528 <Method byte[] MatroskaExtractor.access$300()>
		//  742 2048:invokeinterface #275 <Method boolean List.add(Object)>
		//  743 2053:pop             
				((List) (obj)).add(((Object) (codecPrivate)));
		//  744 2054:aload           10
		//  745 2056:aload_0         
		//  746 2057:getfield        #352 <Field byte[] codecPrivate>
		//  747 2060:invokeinterface #275 <Method boolean List.add(Object)>
		//  748 2065:pop             
				obj = ((Object) (Format.createTextSampleFormat(Integer.toString(i), ((String) (obj1)), ((String) (null)), -1, i1, language, -1, drmInitData, 0xffffffffL, ((List) (obj)))));
		//  749 2066:iload_2         
		//  750 2067:invokestatic    #499 <Method String Integer.toString(int)>
		//  751 2070:aload           11
		//  752 2072:aconst_null     
		//  753 2073:iconst_m1       
		//  754 2074:iload           7
		//  755 2076:aload_0         
		//  756 2077:getfield        #136 <Field String language>
		//  757 2080:iconst_m1       
		//  758 2081:aload_0         
		//  759 2082:getfield        #501 <Field DrmInitData drmInitData>
		//  760 2085:ldc2w           #529 <Long 0xffffffffL>
		//  761 2088:aload           10
		//  762 2090:invokestatic    #533 <Method Format Format.createTextSampleFormat(String, String, String, int, int, String, int, DrmInitData, long, List)>
		//  763 2093:astore          10
				i = ((int) (byte0));
		//  764 2095:iload           8
		//  765 2097:istore_2        
			} else
		//* 766 2098:goto            2176
			{
				if(!"application/vobsub".equals(obj1) && !"application/pgs".equals(obj1) && !"application/dvbsubs".equals(obj1))
		//* 767 2101:ldc2            #356 <String "application/vobsub">
		//* 768 2104:aload           11
		//* 769 2106:invokevirtual   #290 <Method boolean String.equals(Object)>
		//* 770 2109:ifne            2148
		//* 771 2112:ldc2            #354 <String "application/pgs">
		//* 772 2115:aload           11
		//* 773 2117:invokevirtual   #290 <Method boolean String.equals(Object)>
		//* 774 2120:ifne            2148
		//* 775 2123:ldc2            #350 <String "application/dvbsubs">
		//* 776 2126:aload           11
		//* 777 2128:invokevirtual   #290 <Method boolean String.equals(Object)>
		//* 778 2131:ifeq            2137
		//* 779 2134:goto            2148
					throw new ParserException("Unexpected MIME type.");
		//  780 2137:new             #163 <Class ParserException>
		//  781 2140:dup             
		//  782 2141:ldc2            #535 <String "Unexpected MIME type.">
		//  783 2144:invokespecial   #212 <Method void ParserException(String)>
		//  784 2147:athrow          
				obj = ((Object) (Format.createImageSampleFormat(Integer.toString(i), ((String) (obj1)), ((String) (null)), -1, i1, ((List) (obj)), language, drmInitData)));
		//  785 2148:iload_2         
		//  786 2149:invokestatic    #499 <Method String Integer.toString(int)>
		//  787 2152:aload           11
		//  788 2154:aconst_null     
		//  789 2155:iconst_m1       
		//  790 2156:iload           7
		//  791 2158:aload           10
		//  792 2160:aload_0         
		//  793 2161:getfield        #136 <Field String language>
		//  794 2164:aload_0         
		//  795 2165:getfield        #501 <Field DrmInitData drmInitData>
		//  796 2168:invokestatic    #539 <Method Format Format.createImageSampleFormat(String, String, String, int, int, List, String, DrmInitData)>
		//  797 2171:astore          10
				i = ((int) (byte0));
		//  798 2173:iload           8
		//  799 2175:istore_2        
			}
			output = extractoroutput.track(number, i);
		//  800 2176:aload_0         
		//  801 2177:aload_1         
		//  802 2178:aload_0         
		//  803 2179:getfield        #541 <Field int number>
		//  804 2182:iload_2         
		//  805 2183:invokeinterface #547 <Method TrackOutput ExtractorOutput.track(int, int)>
		//  806 2188:putfield        #549 <Field TrackOutput output>
			output.format(((Format) (obj)));
		//  807 2191:aload_0         
		//  808 2192:getfield        #549 <Field TrackOutput output>
		//  809 2195:aload           10
		//  810 2197:invokeinterface #555 <Method void TrackOutput.format(Format)>
			return;
		//  811 2202:return          
		}

		public void outputPendingSampleMetadata()
		{
			if(trueHdSampleRechunker != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #408 <Field MatroskaExtractor$TrueHdSampleRechunker trueHdSampleRechunker>
		//*   2    4:ifnull          15
				trueHdSampleRechunker.outputPendingSampleMetadata(this);
		//    3    7:aload_0         
		//    4    8:getfield        #408 <Field MatroskaExtractor$TrueHdSampleRechunker trueHdSampleRechunker>
		//    5   11:aload_0         
		//    6   12:invokevirtual   #559 <Method void MatroskaExtractor$TrueHdSampleRechunker.outputPendingSampleMetadata(MatroskaExtractor$Track)>
		//    7   15:return          
		}

		public void reset()
		{
			if(trueHdSampleRechunker != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #408 <Field MatroskaExtractor$TrueHdSampleRechunker trueHdSampleRechunker>
		//*   2    4:ifnull          14
				trueHdSampleRechunker.reset();
		//    3    7:aload_0         
		//    4    8:getfield        #408 <Field MatroskaExtractor$TrueHdSampleRechunker trueHdSampleRechunker>
		//    5   11:invokevirtual   #562 <Method void MatroskaExtractor$TrueHdSampleRechunker.reset()>
		//    6   14:return          
		}

		private static final int DEFAULT_MAX_CLL = 1000;
		private static final int DEFAULT_MAX_FALL = 200;
		private static final int DISPLAY_UNIT_PIXELS = 0;
		private static final int MAX_CHROMATICITY = 50000;
		public int audioBitDepth;
		public int channelCount;
		public long codecDelayNs;
		public String codecId;
		public byte codecPrivate[];
		public int colorRange;
		public int colorSpace;
		public int colorTransfer;
		public com.google.android.exoplayer2.extractor.TrackOutput.CryptoData cryptoData;
		public int defaultSampleDurationNs;
		public int displayHeight;
		public int displayUnit;
		public int displayWidth;
		public DrmInitData drmInitData;
		public boolean flagDefault;
		public boolean flagForced;
		public boolean hasColorInfo;
		public boolean hasContentEncryption;
		public int height;
		private String language;
		public int maxContentLuminance;
		public int maxFrameAverageLuminance;
		public float maxMasteringLuminance;
		public float minMasteringLuminance;
		public int nalUnitLengthFieldLength;
		public int number;
		public TrackOutput output;
		public float primaryBChromaticityX;
		public float primaryBChromaticityY;
		public float primaryGChromaticityX;
		public float primaryGChromaticityY;
		public float primaryRChromaticityX;
		public float primaryRChromaticityY;
		public byte projectionData[];
		public int sampleRate;
		public byte sampleStrippedBytes[];
		public long seekPreRollNs;
		public int stereoMode;
		public TrueHdSampleRechunker trueHdSampleRechunker;
		public int type;
		public float whitePointChromaticityX;
		public float whitePointChromaticityY;
		public int width;


/*
		static String access$202(Track track, String s)
		{
			track.language = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #136 <Field String language>
			return s;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/

		private Track()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #73  <Method void Object()>
			width = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #75  <Field int width>
			height = -1;
		//    5    9:aload_0         
		//    6   10:iconst_m1       
		//    7   11:putfield        #77  <Field int height>
			displayWidth = -1;
		//    8   14:aload_0         
		//    9   15:iconst_m1       
		//   10   16:putfield        #79  <Field int displayWidth>
			displayHeight = -1;
		//   11   19:aload_0         
		//   12   20:iconst_m1       
		//   13   21:putfield        #81  <Field int displayHeight>
			displayUnit = 0;
		//   14   24:aload_0         
		//   15   25:iconst_0        
		//   16   26:putfield        #83  <Field int displayUnit>
			projectionData = null;
		//   17   29:aload_0         
		//   18   30:aconst_null     
		//   19   31:putfield        #85  <Field byte[] projectionData>
			stereoMode = -1;
		//   20   34:aload_0         
		//   21   35:iconst_m1       
		//   22   36:putfield        #87  <Field int stereoMode>
			hasColorInfo = false;
		//   23   39:aload_0         
		//   24   40:iconst_0        
		//   25   41:putfield        #89  <Field boolean hasColorInfo>
			colorSpace = -1;
		//   26   44:aload_0         
		//   27   45:iconst_m1       
		//   28   46:putfield        #91  <Field int colorSpace>
			colorTransfer = -1;
		//   29   49:aload_0         
		//   30   50:iconst_m1       
		//   31   51:putfield        #93  <Field int colorTransfer>
			colorRange = -1;
		//   32   54:aload_0         
		//   33   55:iconst_m1       
		//   34   56:putfield        #95  <Field int colorRange>
			maxContentLuminance = 1000;
		//   35   59:aload_0         
		//   36   60:sipush          1000
		//   37   63:putfield        #97  <Field int maxContentLuminance>
			maxFrameAverageLuminance = 200;
		//   38   66:aload_0         
		//   39   67:sipush          200
		//   40   70:putfield        #99  <Field int maxFrameAverageLuminance>
			primaryRChromaticityX = -1F;
		//   41   73:aload_0         
		//   42   74:ldc1            #100 <Float -1F>
		//   43   76:putfield        #102 <Field float primaryRChromaticityX>
			primaryRChromaticityY = -1F;
		//   44   79:aload_0         
		//   45   80:ldc1            #100 <Float -1F>
		//   46   82:putfield        #104 <Field float primaryRChromaticityY>
			primaryGChromaticityX = -1F;
		//   47   85:aload_0         
		//   48   86:ldc1            #100 <Float -1F>
		//   49   88:putfield        #106 <Field float primaryGChromaticityX>
			primaryGChromaticityY = -1F;
		//   50   91:aload_0         
		//   51   92:ldc1            #100 <Float -1F>
		//   52   94:putfield        #108 <Field float primaryGChromaticityY>
			primaryBChromaticityX = -1F;
		//   53   97:aload_0         
		//   54   98:ldc1            #100 <Float -1F>
		//   55  100:putfield        #110 <Field float primaryBChromaticityX>
			primaryBChromaticityY = -1F;
		//   56  103:aload_0         
		//   57  104:ldc1            #100 <Float -1F>
		//   58  106:putfield        #112 <Field float primaryBChromaticityY>
			whitePointChromaticityX = -1F;
		//   59  109:aload_0         
		//   60  110:ldc1            #100 <Float -1F>
		//   61  112:putfield        #114 <Field float whitePointChromaticityX>
			whitePointChromaticityY = -1F;
		//   62  115:aload_0         
		//   63  116:ldc1            #100 <Float -1F>
		//   64  118:putfield        #116 <Field float whitePointChromaticityY>
			maxMasteringLuminance = -1F;
		//   65  121:aload_0         
		//   66  122:ldc1            #100 <Float -1F>
		//   67  124:putfield        #118 <Field float maxMasteringLuminance>
			minMasteringLuminance = -1F;
		//   68  127:aload_0         
		//   69  128:ldc1            #100 <Float -1F>
		//   70  130:putfield        #120 <Field float minMasteringLuminance>
			channelCount = 1;
		//   71  133:aload_0         
		//   72  134:iconst_1        
		//   73  135:putfield        #122 <Field int channelCount>
			audioBitDepth = -1;
		//   74  138:aload_0         
		//   75  139:iconst_m1       
		//   76  140:putfield        #124 <Field int audioBitDepth>
			sampleRate = 8000;
		//   77  143:aload_0         
		//   78  144:sipush          8000
		//   79  147:putfield        #126 <Field int sampleRate>
			codecDelayNs = 0L;
		//   80  150:aload_0         
		//   81  151:lconst_0        
		//   82  152:putfield        #128 <Field long codecDelayNs>
			seekPreRollNs = 0L;
		//   83  155:aload_0         
		//   84  156:lconst_0        
		//   85  157:putfield        #130 <Field long seekPreRollNs>
			flagDefault = true;
		//   86  160:aload_0         
		//   87  161:iconst_1        
		//   88  162:putfield        #132 <Field boolean flagDefault>
			language = "eng";
		//   89  165:aload_0         
		//   90  166:ldc1            #134 <String "eng">
		//   91  168:putfield        #136 <Field String language>
		//   92  171:return          
		}

	}

	private static final class TrueHdSampleRechunker
	{

		public void outputPendingSampleMetadata(Track track)
		{
			if(foundSyncframe && sampleCount > 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field boolean foundSyncframe>
		//*   2    4:ifeq            45
		//*   3    7:aload_0         
		//*   4    8:getfield        #30  <Field int sampleCount>
		//*   5   11:ifle            45
			{
				track.output.sampleMetadata(timeUs, blockFlags, chunkSize, 0, track.cryptoData);
		//    6   14:aload_1         
		//    7   15:getfield        #36  <Field TrackOutput MatroskaExtractor$Track.output>
		//    8   18:aload_0         
		//    9   19:getfield        #38  <Field long timeUs>
		//   10   22:aload_0         
		//   11   23:getfield        #40  <Field int blockFlags>
		//   12   26:aload_0         
		//   13   27:getfield        #42  <Field int chunkSize>
		//   14   30:iconst_0        
		//   15   31:aload_1         
		//   16   32:getfield        #46  <Field com.google.android.exoplayer2.extractor.TrackOutput$CryptoData MatroskaExtractor$Track.cryptoData>
		//   17   35:invokeinterface #52  <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
				sampleCount = 0;
		//   18   40:aload_0         
		//   19   41:iconst_0        
		//   20   42:putfield        #30  <Field int sampleCount>
			}
		//   21   45:return          
		}

		public void reset()
		{
			foundSyncframe = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #28  <Field boolean foundSyncframe>
		//    3    5:return          
		}

		public void sampleMetadata(Track track, long l)
		{
			if(!foundSyncframe)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field boolean foundSyncframe>
		//*   2    4:ifne            8
				return;
		//    3    7:return          
			int i = sampleCount;
		//    4    8:aload_0         
		//    5    9:getfield        #30  <Field int sampleCount>
		//    6   12:istore          4
			sampleCount = i + 1;
		//    7   14:aload_0         
		//    8   15:iload           4
		//    9   17:iconst_1        
		//   10   18:iadd            
		//   11   19:putfield        #30  <Field int sampleCount>
			if(i == 0)
		//*  12   22:iload           4
		//*  13   24:ifne            32
				timeUs = l;
		//   14   27:aload_0         
		//   15   28:lload_2         
		//   16   29:putfield        #38  <Field long timeUs>
			if(sampleCount < 16)
		//*  17   32:aload_0         
		//*  18   33:getfield        #30  <Field int sampleCount>
		//*  19   36:bipush          16
		//*  20   38:icmpge          42
			{
				return;
		//   21   41:return          
			} else
			{
				track.output.sampleMetadata(timeUs, blockFlags, chunkSize, 0, track.cryptoData);
		//   22   42:aload_1         
		//   23   43:getfield        #36  <Field TrackOutput MatroskaExtractor$Track.output>
		//   24   46:aload_0         
		//   25   47:getfield        #38  <Field long timeUs>
		//   26   50:aload_0         
		//   27   51:getfield        #40  <Field int blockFlags>
		//   28   54:aload_0         
		//   29   55:getfield        #42  <Field int chunkSize>
		//   30   58:iconst_0        
		//   31   59:aload_1         
		//   32   60:getfield        #46  <Field com.google.android.exoplayer2.extractor.TrackOutput$CryptoData MatroskaExtractor$Track.cryptoData>
		//   33   63:invokeinterface #52  <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
				sampleCount = 0;
		//   34   68:aload_0         
		//   35   69:iconst_0        
		//   36   70:putfield        #30  <Field int sampleCount>
				return;
		//   37   73:return          
			}
		}

		public void startSample(ExtractorInput extractorinput, int i, int j)
			throws IOException, InterruptedException
		{
			if(!foundSyncframe)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field boolean foundSyncframe>
		//*   2    4:ifne            48
			{
				extractorinput.peekFully(syncframePrefix, 0, 10);
		//    3    7:aload_1         
		//    4    8:aload_0         
		//    5    9:getfield        #23  <Field byte[] syncframePrefix>
		//    6   12:iconst_0        
		//    7   13:bipush          10
		//    8   15:invokeinterface #66  <Method void ExtractorInput.peekFully(byte[], int, int)>
				extractorinput.resetPeekPosition();
		//    9   20:aload_1         
		//   10   21:invokeinterface #69  <Method void ExtractorInput.resetPeekPosition()>
				if(Ac3Util.parseTrueHdSyncframeAudioSampleCount(syncframePrefix) == -1)
		//*  11   26:aload_0         
		//*  12   27:getfield        #23  <Field byte[] syncframePrefix>
		//*  13   30:invokestatic    #75  <Method int Ac3Util.parseTrueHdSyncframeAudioSampleCount(byte[])>
		//*  14   33:iconst_m1       
		//*  15   34:icmpne          38
					return;
		//   16   37:return          
				foundSyncframe = true;
		//   17   38:aload_0         
		//   18   39:iconst_1        
		//   19   40:putfield        #28  <Field boolean foundSyncframe>
				sampleCount = 0;
		//   20   43:aload_0         
		//   21   44:iconst_0        
		//   22   45:putfield        #30  <Field int sampleCount>
			}
			if(sampleCount == 0)
		//*  23   48:aload_0         
		//*  24   49:getfield        #30  <Field int sampleCount>
		//*  25   52:ifne            65
			{
				blockFlags = i;
		//   26   55:aload_0         
		//   27   56:iload_2         
		//   28   57:putfield        #40  <Field int blockFlags>
				chunkSize = 0;
		//   29   60:aload_0         
		//   30   61:iconst_0        
		//   31   62:putfield        #42  <Field int chunkSize>
			}
			chunkSize = chunkSize + j;
		//   32   65:aload_0         
		//   33   66:aload_0         
		//   34   67:getfield        #42  <Field int chunkSize>
		//   35   70:iload_3         
		//   36   71:iadd            
		//   37   72:putfield        #42  <Field int chunkSize>
		//   38   75:return          
		}

		private int blockFlags;
		private int chunkSize;
		private boolean foundSyncframe;
		private int sampleCount;
		private final byte syncframePrefix[] = new byte[10];
		private long timeUs;

		public TrueHdSampleRechunker()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:bipush          10
		//    4    7:newarray        byte[]
		//    5    9:putfield        #23  <Field byte[] syncframePrefix>
		//    6   12:return          
		}
	}


	public MatroskaExtractor()
	{
		this(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #451 <Method void MatroskaExtractor(int)>
	//    3    5:return          
	}

	public MatroskaExtractor(int i)
	{
		this(((EbmlReader) (new DefaultEbmlReader())), i);
	//    0    0:aload_0         
	//    1    1:new             #453 <Class DefaultEbmlReader>
	//    2    4:dup             
	//    3    5:invokespecial   #454 <Method void DefaultEbmlReader()>
	//    4    8:iload_1         
	//    5    9:invokespecial   #457 <Method void MatroskaExtractor(EbmlReader, int)>
	//    6   12:return          
	}

	MatroskaExtractor(EbmlReader ebmlreader, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #458 <Method void Object()>
		segmentContentPosition = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #459 <Long -1L>
	//    4    8:putfield        #462 <Field long segmentContentPosition>
		timecodeScale = 0x1L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #463 <Long 0x1L>
	//    7   15:putfield        #466 <Field long timecodeScale>
		durationTimecode = 0x1L;
	//    8   18:aload_0         
	//    9   19:ldc2w           #463 <Long 0x1L>
	//   10   22:putfield        #468 <Field long durationTimecode>
		durationUs = 0x1L;
	//   11   25:aload_0         
	//   12   26:ldc2w           #463 <Long 0x1L>
	//   13   29:putfield        #470 <Field long durationUs>
		cuesContentPosition = -1L;
	//   14   32:aload_0         
	//   15   33:ldc2w           #459 <Long -1L>
	//   16   36:putfield        #472 <Field long cuesContentPosition>
		seekPositionAfterBuildingCues = -1L;
	//   17   39:aload_0         
	//   18   40:ldc2w           #459 <Long -1L>
	//   19   43:putfield        #474 <Field long seekPositionAfterBuildingCues>
		clusterTimecodeUs = 0x1L;
	//   20   46:aload_0         
	//   21   47:ldc2w           #463 <Long 0x1L>
	//   22   50:putfield        #476 <Field long clusterTimecodeUs>
		reader = ebmlreader;
	//   23   53:aload_0         
	//   24   54:aload_1         
	//   25   55:putfield        #478 <Field EbmlReader reader>
		reader.init(((EbmlReaderOutput) (new InnerEbmlReaderOutput())));
	//   26   58:aload_0         
	//   27   59:getfield        #478 <Field EbmlReader reader>
	//   28   62:new             #13  <Class MatroskaExtractor$InnerEbmlReaderOutput>
	//   29   65:dup             
	//   30   66:aload_0         
	//   31   67:aconst_null     
	//   32   68:invokespecial   #481 <Method void MatroskaExtractor$InnerEbmlReaderOutput(MatroskaExtractor, MatroskaExtractor$1)>
	//   33   71:invokeinterface #487 <Method void EbmlReader.init(EbmlReaderOutput)>
		boolean flag = true;
	//   34   76:iconst_1        
	//   35   77:istore_3        
		if((i & 1) != 0)
	//*  36   78:iload_2         
	//*  37   79:iconst_1        
	//*  38   80:iand            
	//*  39   81:ifne            87
	//*  40   84:goto            89
			flag = false;
	//   41   87:iconst_0        
	//   42   88:istore_3        
		seekForCuesEnabled = flag;
	//   43   89:aload_0         
	//   44   90:iload_3         
	//   45   91:putfield        #489 <Field boolean seekForCuesEnabled>
		varintReader = new VarintReader();
	//   46   94:aload_0         
	//   47   95:new             #491 <Class VarintReader>
	//   48   98:dup             
	//   49   99:invokespecial   #492 <Method void VarintReader()>
	//   50  102:putfield        #494 <Field VarintReader varintReader>
		tracks = new SparseArray();
	//   51  105:aload_0         
	//   52  106:new             #496 <Class SparseArray>
	//   53  109:dup             
	//   54  110:invokespecial   #497 <Method void SparseArray()>
	//   55  113:putfield        #499 <Field SparseArray tracks>
		scratch = new ParsableByteArray(4);
	//   56  116:aload_0         
	//   57  117:new             #501 <Class ParsableByteArray>
	//   58  120:dup             
	//   59  121:iconst_4        
	//   60  122:invokespecial   #502 <Method void ParsableByteArray(int)>
	//   61  125:putfield        #504 <Field ParsableByteArray scratch>
		vorbisNumPageSamples = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
	//   62  128:aload_0         
	//   63  129:new             #501 <Class ParsableByteArray>
	//   64  132:dup             
	//   65  133:iconst_4        
	//   66  134:invokestatic    #510 <Method ByteBuffer ByteBuffer.allocate(int)>
	//   67  137:iconst_m1       
	//   68  138:invokevirtual   #513 <Method ByteBuffer ByteBuffer.putInt(int)>
	//   69  141:invokevirtual   #517 <Method byte[] ByteBuffer.array()>
	//   70  144:invokespecial   #520 <Method void ParsableByteArray(byte[])>
	//   71  147:putfield        #522 <Field ParsableByteArray vorbisNumPageSamples>
		seekEntryIdBytes = new ParsableByteArray(4);
	//   72  150:aload_0         
	//   73  151:new             #501 <Class ParsableByteArray>
	//   74  154:dup             
	//   75  155:iconst_4        
	//   76  156:invokespecial   #502 <Method void ParsableByteArray(int)>
	//   77  159:putfield        #524 <Field ParsableByteArray seekEntryIdBytes>
		nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
	//   78  162:aload_0         
	//   79  163:new             #501 <Class ParsableByteArray>
	//   80  166:dup             
	//   81  167:getstatic       #529 <Field byte[] NalUnitUtil.NAL_START_CODE>
	//   82  170:invokespecial   #520 <Method void ParsableByteArray(byte[])>
	//   83  173:putfield        #531 <Field ParsableByteArray nalStartCode>
		nalLength = new ParsableByteArray(4);
	//   84  176:aload_0         
	//   85  177:new             #501 <Class ParsableByteArray>
	//   86  180:dup             
	//   87  181:iconst_4        
	//   88  182:invokespecial   #502 <Method void ParsableByteArray(int)>
	//   89  185:putfield        #533 <Field ParsableByteArray nalLength>
		sampleStrippedBytes = new ParsableByteArray();
	//   90  188:aload_0         
	//   91  189:new             #501 <Class ParsableByteArray>
	//   92  192:dup             
	//   93  193:invokespecial   #534 <Method void ParsableByteArray()>
	//   94  196:putfield        #536 <Field ParsableByteArray sampleStrippedBytes>
		subtitleSample = new ParsableByteArray();
	//   95  199:aload_0         
	//   96  200:new             #501 <Class ParsableByteArray>
	//   97  203:dup             
	//   98  204:invokespecial   #534 <Method void ParsableByteArray()>
	//   99  207:putfield        #538 <Field ParsableByteArray subtitleSample>
		encryptionInitializationVector = new ParsableByteArray(8);
	//  100  210:aload_0         
	//  101  211:new             #501 <Class ParsableByteArray>
	//  102  214:dup             
	//  103  215:bipush          8
	//  104  217:invokespecial   #502 <Method void ParsableByteArray(int)>
	//  105  220:putfield        #540 <Field ParsableByteArray encryptionInitializationVector>
		encryptionSubsampleData = new ParsableByteArray();
	//  106  223:aload_0         
	//  107  224:new             #501 <Class ParsableByteArray>
	//  108  227:dup             
	//  109  228:invokespecial   #534 <Method void ParsableByteArray()>
	//  110  231:putfield        #542 <Field ParsableByteArray encryptionSubsampleData>
	//  111  234:return          
	}

	private SeekMap buildSeekMap()
	{
		if(segmentContentPosition != -1L && durationUs != 0x1L && cueTimesUs != null && cueTimesUs.size() != 0 && cueClusterPositions != null && cueClusterPositions.size() == cueTimesUs.size())
	//*   0    0:aload_0         
	//*   1    1:getfield        #462 <Field long segmentContentPosition>
	//*   2    4:ldc2w           #459 <Long -1L>
	//*   3    7:lcmp            
	//*   4    8:ifeq            251
	//*   5   11:aload_0         
	//*   6   12:getfield        #470 <Field long durationUs>
	//*   7   15:ldc2w           #463 <Long 0x1L>
	//*   8   18:lcmp            
	//*   9   19:ifeq            251
	//*  10   22:aload_0         
	//*  11   23:getfield        #549 <Field LongArray cueTimesUs>
	//*  12   26:ifnull          251
	//*  13   29:aload_0         
	//*  14   30:getfield        #549 <Field LongArray cueTimesUs>
	//*  15   33:invokevirtual   #555 <Method int LongArray.size()>
	//*  16   36:ifeq            251
	//*  17   39:aload_0         
	//*  18   40:getfield        #557 <Field LongArray cueClusterPositions>
	//*  19   43:ifnull          251
	//*  20   46:aload_0         
	//*  21   47:getfield        #557 <Field LongArray cueClusterPositions>
	//*  22   50:invokevirtual   #555 <Method int LongArray.size()>
	//*  23   53:aload_0         
	//*  24   54:getfield        #549 <Field LongArray cueTimesUs>
	//*  25   57:invokevirtual   #555 <Method int LongArray.size()>
	//*  26   60:icmpeq          66
	//*  27   63:goto            251
		{
			int l = cueTimesUs.size();
	//   28   66:aload_0         
	//   29   67:getfield        #549 <Field LongArray cueTimesUs>
	//   30   70:invokevirtual   #555 <Method int LongArray.size()>
	//   31   73:istore          4
			int ai[] = new int[l];
	//   32   75:iload           4
	//   33   77:newarray        int[]
	//   34   79:astore          5
			long al[] = new long[l];
	//   35   81:iload           4
	//   36   83:newarray        long[]
	//   37   85:astore          6
			long al1[] = new long[l];
	//   38   87:iload           4
	//   39   89:newarray        long[]
	//   40   91:astore          7
			long al2[] = new long[l];
	//   41   93:iload           4
	//   42   95:newarray        long[]
	//   43   97:astore          8
			boolean flag = false;
	//   44   99:iconst_0        
	//   45  100:istore_3        
			int j = 0;
	//   46  101:iconst_0        
	//   47  102:istore_2        
			int i;
			do
			{
				i = ((int) (flag));
	//   48  103:iload_3         
	//   49  104:istore_1        
				if(j >= l)
					break;
	//   50  105:iload_2         
	//   51  106:iload           4
	//   52  108:icmpge          147
				al2[j] = cueTimesUs.get(j);
	//   53  111:aload           8
	//   54  113:iload_2         
	//   55  114:aload_0         
	//   56  115:getfield        #549 <Field LongArray cueTimesUs>
	//   57  118:iload_2         
	//   58  119:invokevirtual   #561 <Method long LongArray.get(int)>
	//   59  122:lastore         
				al[j] = segmentContentPosition + cueClusterPositions.get(j);
	//   60  123:aload           6
	//   61  125:iload_2         
	//   62  126:aload_0         
	//   63  127:getfield        #462 <Field long segmentContentPosition>
	//   64  130:aload_0         
	//   65  131:getfield        #557 <Field LongArray cueClusterPositions>
	//   66  134:iload_2         
	//   67  135:invokevirtual   #561 <Method long LongArray.get(int)>
	//   68  138:ladd            
	//   69  139:lastore         
				j++;
	//   70  140:iload_2         
	//   71  141:iconst_1        
	//   72  142:iadd            
	//   73  143:istore_2        
			} while(true);
	//   74  144:goto            103
			do
			{
				int k = l - 1;
	//   75  147:iload           4
	//   76  149:iconst_1        
	//   77  150:isub            
	//   78  151:istore_2        
				if(i < k)
	//*  79  152:iload_1         
	//*  80  153:iload_2         
	//*  81  154:icmpge          193
				{
					k = i + 1;
	//   82  157:iload_1         
	//   83  158:iconst_1        
	//   84  159:iadd            
	//   85  160:istore_2        
					ai[i] = (int)(al[k] - al[i]);
	//   86  161:aload           5
	//   87  163:iload_1         
	//   88  164:aload           6
	//   89  166:iload_2         
	//   90  167:laload          
	//   91  168:aload           6
	//   92  170:iload_1         
	//   93  171:laload          
	//   94  172:lsub            
	//   95  173:l2i             
	//   96  174:iastore         
					al1[i] = al2[k] - al2[i];
	//   97  175:aload           7
	//   98  177:iload_1         
	//   99  178:aload           8
	//  100  180:iload_2         
	//  101  181:laload          
	//  102  182:aload           8
	//  103  184:iload_1         
	//  104  185:laload          
	//  105  186:lsub            
	//  106  187:lastore         
					i = k;
	//  107  188:iload_2         
	//  108  189:istore_1        
				} else
	//* 109  190:goto            147
				{
					ai[k] = (int)((segmentContentPosition + segmentContentSize) - al[k]);
	//  110  193:aload           5
	//  111  195:iload_2         
	//  112  196:aload_0         
	//  113  197:getfield        #462 <Field long segmentContentPosition>
	//  114  200:aload_0         
	//  115  201:getfield        #563 <Field long segmentContentSize>
	//  116  204:ladd            
	//  117  205:aload           6
	//  118  207:iload_2         
	//  119  208:laload          
	//  120  209:lsub            
	//  121  210:l2i             
	//  122  211:iastore         
					al1[k] = durationUs - al2[k];
	//  123  212:aload           7
	//  124  214:iload_2         
	//  125  215:aload_0         
	//  126  216:getfield        #470 <Field long durationUs>
	//  127  219:aload           8
	//  128  221:iload_2         
	//  129  222:laload          
	//  130  223:lsub            
	//  131  224:lastore         
					cueTimesUs = null;
	//  132  225:aload_0         
	//  133  226:aconst_null     
	//  134  227:putfield        #549 <Field LongArray cueTimesUs>
					cueClusterPositions = null;
	//  135  230:aload_0         
	//  136  231:aconst_null     
	//  137  232:putfield        #557 <Field LongArray cueClusterPositions>
					return ((SeekMap) (new ChunkIndex(ai, al, al1, al2)));
	//  138  235:new             #565 <Class ChunkIndex>
	//  139  238:dup             
	//  140  239:aload           5
	//  141  241:aload           6
	//  142  243:aload           7
	//  143  245:aload           8
	//  144  247:invokespecial   #568 <Method void ChunkIndex(int[], long[], long[], long[])>
	//  145  250:areturn         
				}
			} while(true);
		} else
		{
			cueTimesUs = null;
	//  146  251:aload_0         
	//  147  252:aconst_null     
	//  148  253:putfield        #549 <Field LongArray cueTimesUs>
			cueClusterPositions = null;
	//  149  256:aload_0         
	//  150  257:aconst_null     
	//  151  258:putfield        #557 <Field LongArray cueClusterPositions>
			return ((SeekMap) (new com.google.android.exoplayer2.extractor.SeekMap.Unseekable(durationUs)));
	//  152  261:new             #570 <Class com.google.android.exoplayer2.extractor.SeekMap$Unseekable>
	//  153  264:dup             
	//  154  265:aload_0         
	//  155  266:getfield        #470 <Field long durationUs>
	//  156  269:invokespecial   #573 <Method void com.google.android.exoplayer2.extractor.SeekMap$Unseekable(long)>
	//  157  272:areturn         
		}
	}

	private void commitSampleToOutput(Track track, long l)
	{
		if(track.trueHdSampleRechunker != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #579 <Field MatroskaExtractor$TrueHdSampleRechunker MatroskaExtractor$Track.trueHdSampleRechunker>
	//*   2    4:ifnull          19
		{
			track.trueHdSampleRechunker.sampleMetadata(track, l);
	//    3    7:aload_1         
	//    4    8:getfield        #579 <Field MatroskaExtractor$TrueHdSampleRechunker MatroskaExtractor$Track.trueHdSampleRechunker>
	//    5   11:aload_1         
	//    6   12:lload_2         
	//    7   13:invokevirtual   #582 <Method void MatroskaExtractor$TrueHdSampleRechunker.sampleMetadata(MatroskaExtractor$Track, long)>
		} else
	//*   8   16:goto            101
		{
			if("S_TEXT/UTF8".equals(((Object) (track.codecId))))
	//*   9   19:ldc1            #97  <String "S_TEXT/UTF8">
	//*  10   21:aload_1         
	//*  11   22:getfield        #585 <Field String MatroskaExtractor$Track.codecId>
	//*  12   25:invokevirtual   #591 <Method boolean String.equals(Object)>
	//*  13   28:ifeq            50
				commitSubtitleSample(track, "%02d:%02d:%02d,%03d", 19, 1000L, SUBRIP_TIMECODE_EMPTY);
	//   14   31:aload_0         
	//   15   32:aload_1         
	//   16   33:ldc2            #314 <String "%02d:%02d:%02d,%03d">
	//   17   36:bipush          19
	//   18   38:ldc2w           #316 <Long 1000L>
	//   19   41:getstatic       #414 <Field byte[] SUBRIP_TIMECODE_EMPTY>
	//   20   44:invokespecial   #595 <Method void commitSubtitleSample(MatroskaExtractor$Track, String, int, long, byte[])>
			else
	//*  21   47:goto            78
			if("S_TEXT/ASS".equals(((Object) (track.codecId))))
	//*  22   50:ldc1            #40  <String "S_TEXT/ASS">
	//*  23   52:aload_1         
	//*  24   53:getfield        #585 <Field String MatroskaExtractor$Track.codecId>
	//*  25   56:invokevirtual   #591 <Method boolean String.equals(Object)>
	//*  26   59:ifeq            78
				commitSubtitleSample(track, "%01d:%02d:%02d:%02d", 21, 10000L, SSA_TIMECODE_EMPTY);
	//   27   62:aload_0         
	//   28   63:aload_1         
	//   29   64:ldc2            #303 <String "%01d:%02d:%02d:%02d">
	//   30   67:bipush          21
	//   31   69:ldc2w           #306 <Long 10000L>
	//   32   72:getstatic       #436 <Field byte[] SSA_TIMECODE_EMPTY>
	//   33   75:invokespecial   #595 <Method void commitSubtitleSample(MatroskaExtractor$Track, String, int, long, byte[])>
			track.output.sampleMetadata(l, blockFlags, sampleBytesWritten, 0, track.cryptoData);
	//   34   78:aload_1         
	//   35   79:getfield        #599 <Field TrackOutput MatroskaExtractor$Track.output>
	//   36   82:lload_2         
	//   37   83:aload_0         
	//   38   84:getfield        #601 <Field int blockFlags>
	//   39   87:aload_0         
	//   40   88:getfield        #603 <Field int sampleBytesWritten>
	//   41   91:iconst_0        
	//   42   92:aload_1         
	//   43   93:getfield        #607 <Field com.google.android.exoplayer2.extractor.TrackOutput$CryptoData MatroskaExtractor$Track.cryptoData>
	//   44   96:invokeinterface #612 <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
		}
		sampleRead = true;
	//   45  101:aload_0         
	//   46  102:iconst_1        
	//   47  103:putfield        #614 <Field boolean sampleRead>
		resetSample();
	//   48  106:aload_0         
	//   49  107:invokespecial   #617 <Method void resetSample()>
	//   50  110:return          
	}

	private void commitSubtitleSample(Track track, String s, int i, long l, byte abyte0[])
	{
		setSampleDuration(subtitleSample.data, blockDurationUs, s, i, l, abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #538 <Field ParsableByteArray subtitleSample>
	//    2    4:getfield        #620 <Field byte[] ParsableByteArray.data>
	//    3    7:aload_0         
	//    4    8:getfield        #622 <Field long blockDurationUs>
	//    5   11:aload_2         
	//    6   12:iload_3         
	//    7   13:lload           4
	//    8   15:aload           6
	//    9   17:invokestatic    #626 <Method void setSampleDuration(byte[], long, String, int, long, byte[])>
		track.output.sampleData(subtitleSample, subtitleSample.limit());
	//   10   20:aload_1         
	//   11   21:getfield        #599 <Field TrackOutput MatroskaExtractor$Track.output>
	//   12   24:aload_0         
	//   13   25:getfield        #538 <Field ParsableByteArray subtitleSample>
	//   14   28:aload_0         
	//   15   29:getfield        #538 <Field ParsableByteArray subtitleSample>
	//   16   32:invokevirtual   #629 <Method int ParsableByteArray.limit()>
	//   17   35:invokeinterface #633 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
		sampleBytesWritten = sampleBytesWritten + subtitleSample.limit();
	//   18   40:aload_0         
	//   19   41:aload_0         
	//   20   42:getfield        #603 <Field int sampleBytesWritten>
	//   21   45:aload_0         
	//   22   46:getfield        #538 <Field ParsableByteArray subtitleSample>
	//   23   49:invokevirtual   #629 <Method int ParsableByteArray.limit()>
	//   24   52:iadd            
	//   25   53:putfield        #603 <Field int sampleBytesWritten>
	//   26   56:return          
	}

	private static int[] ensureArrayCapacity(int ai[], int i)
	{
		if(ai == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return new int[i];
	//    2    4:iload_1         
	//    3    5:newarray        int[]
	//    4    7:areturn         
		if(ai.length >= i)
	//*   5    8:aload_0         
	//*   6    9:arraylength     
	//*   7   10:iload_1         
	//*   8   11:icmplt          16
			return ai;
	//    9   14:aload_0         
	//   10   15:areturn         
		else
			return new int[Math.max(ai.length * 2, i)];
	//   11   16:aload_0         
	//   12   17:arraylength     
	//   13   18:iconst_2        
	//   14   19:imul            
	//   15   20:iload_1         
	//   16   21:invokestatic    #641 <Method int Math.max(int, int)>
	//   17   24:newarray        int[]
	//   18   26:areturn         
	}

	private static boolean isCodecSupported(String s)
	{
		return "V_VP8".equals(((Object) (s))) || "V_VP9".equals(((Object) (s))) || "V_MPEG2".equals(((Object) (s))) || "V_MPEG4/ISO/SP".equals(((Object) (s))) || "V_MPEG4/ISO/ASP".equals(((Object) (s))) || "V_MPEG4/ISO/AP".equals(((Object) (s))) || "V_MPEG4/ISO/AVC".equals(((Object) (s))) || "V_MPEGH/ISO/HEVC".equals(((Object) (s))) || "V_MS/VFW/FOURCC".equals(((Object) (s))) || "V_THEORA".equals(((Object) (s))) || "A_OPUS".equals(((Object) (s))) || "A_VORBIS".equals(((Object) (s))) || "A_AAC".equals(((Object) (s))) || "A_MPEG/L2".equals(((Object) (s))) || "A_MPEG/L3".equals(((Object) (s))) || "A_AC3".equals(((Object) (s))) || "A_EAC3".equals(((Object) (s))) || "A_TRUEHD".equals(((Object) (s))) || "A_DTS".equals(((Object) (s))) || "A_DTS/EXPRESS".equals(((Object) (s))) || "A_DTS/LOSSLESS".equals(((Object) (s))) || "A_FLAC".equals(((Object) (s))) || "A_MS/ACM".equals(((Object) (s))) || "A_PCM/INT/LIT".equals(((Object) (s))) || "S_TEXT/UTF8".equals(((Object) (s))) || "S_TEXT/ASS".equals(((Object) (s))) || "S_VOBSUB".equals(((Object) (s))) || "S_HDMV/PGS".equals(((Object) (s))) || "S_DVBSUB".equals(((Object) (s)));
	//    0    0:ldc1            #112 <String "V_VP8">
	//    1    2:aload_0         
	//    2    3:invokevirtual   #591 <Method boolean String.equals(Object)>
	//    3    6:ifne            266
	//    4    9:ldc1            #115 <String "V_VP9">
	//    5   11:aload_0         
	//    6   12:invokevirtual   #591 <Method boolean String.equals(Object)>
	//    7   15:ifne            266
	//    8   18:ldc1            #76  <String "V_MPEG2">
	//    9   20:aload_0         
	//   10   21:invokevirtual   #591 <Method boolean String.equals(Object)>
	//   11   24:ifne            266
	//   12   27:ldc1            #85  <String "V_MPEG4/ISO/SP">
	//   13   29:aload_0         
	//   14   30:invokevirtual   #591 <Method boolean String.equals(Object)>
	//   15   33:ifne            266
	//   16   36:ldc1            #82  <String "V_MPEG4/ISO/ASP">
	//   17   38:aload_0         
	//   18   39:invokevirtual   #591 <Method boolean String.equals(Object)>
	//   19   42:ifne            266
	//   20   45:ldc1            #79  <String "V_MPEG4/ISO/AP">
	//   21   47:aload_0         
	//   22   48:invokevirtual   #591 <Method boolean String.equals(Object)>
	//   23   51:ifne            266
	//   24   54:ldc1            #64  <String "V_MPEG4/ISO/AVC">
	//   25   56:aload_0         
	//   26   57:invokevirtual   #591 <Method boolean String.equals(Object)>
	//   27   60:ifne            266
	//   28   63:ldc1            #67  <String "V_MPEGH/ISO/HEVC">
	//   29   65:aload_0         
	//   30   66:invokevirtual   #591 <Method boolean String.equals(Object)>
	//   31   69:ifne            266
	//   32   72:ldc1            #61  <String "V_MS/VFW/FOURCC">
	//   33   74:aload_0         
	//   34   75:invokevirtual   #591 <Method boolean String.equals(Object)>
	//   35   78:ifne            266
	//   36   81:ldc1            #100 <String "V_THEORA">
	//   37   83:aload_0         
	//   38   84:invokevirtual   #591 <Method boolean String.equals(Object)>
	//   39   87:ifne            266
	//   40   90:ldc1            #88  <String "A_OPUS">
	//   41   92:aload_0         
	//   42   93:invokevirtual   #591 <Method boolean String.equals(Object)>
	//   43   96:ifne            266
	//   44   99:ldc1            #109 <String "A_VORBIS">
	//   45  101:aload_0         
	//   46  102:invokevirtual   #591 <Method boolean String.equals(Object)>
	//   47  105:ifne            266
	//   48  108:ldc1            #31  <String "A_AAC">
	//   49  110:aload_0         
	//   50  111:invokevirtual   #591 <Method boolean String.equals(Object)>
	//   51  114:ifne            266
	//   52  117:ldc1            #70  <String "A_MPEG/L2">
	//   53  119:aload_0         
	//   54  120:invokevirtual   #591 <Method boolean String.equals(Object)>
	//   55  123:ifne            266
	//   56  126:ldc1            #73  <String "A_MPEG/L3">
	//   57  128:aload_0         
	//   58  129:invokevirtual   #591 <Method boolean String.equals(Object)>
	//   59  132:ifne            266
	//   60  135:ldc1            #34  <String "A_AC3">
	//   61  137:aload_0         
	//   62  138:invokevirtual   #591 <Method boolean String.equals(Object)>
	//   63  141:ifne            266
	//   64  144:ldc1            #55  <String "A_EAC3">
	//   65  146:aload_0         
	//   66  147:invokevirtual   #591 <Method boolean String.equals(Object)>
	//   67  150:ifne            266
	//   68  153:ldc1            #103 <String "A_TRUEHD">
	//   69  155:aload_0         
	//   70  156:invokevirtual   #591 <Method boolean String.equals(Object)>
	//   71  159:ifne            266
	//   72  162:ldc1            #43  <String "A_DTS">
	//   73  164:aload_0         
	//   74  165:invokevirtual   #591 <Method boolean String.equals(Object)>
	//   75  168:ifne            266
	//   76  171:ldc1            #46  <String "A_DTS/EXPRESS">
	//   77  173:aload_0         
	//   78  174:invokevirtual   #591 <Method boolean String.equals(Object)>
	//   79  177:ifne            266
	//   80  180:ldc1            #49  <String "A_DTS/LOSSLESS">
	//   81  182:aload_0         
	//   82  183:invokevirtual   #591 <Method boolean String.equals(Object)>
	//   83  186:ifne            266
	//   84  189:ldc1            #58  <String "A_FLAC">
	//   85  191:aload_0         
	//   86  192:invokevirtual   #591 <Method boolean String.equals(Object)>
	//   87  195:ifne            266
	//   88  198:ldc1            #37  <String "A_MS/ACM">
	//   89  200:aload_0         
	//   90  201:invokevirtual   #591 <Method boolean String.equals(Object)>
	//   91  204:ifne            266
	//   92  207:ldc1            #91  <String "A_PCM/INT/LIT">
	//   93  209:aload_0         
	//   94  210:invokevirtual   #591 <Method boolean String.equals(Object)>
	//   95  213:ifne            266
	//   96  216:ldc1            #97  <String "S_TEXT/UTF8">
	//   97  218:aload_0         
	//   98  219:invokevirtual   #591 <Method boolean String.equals(Object)>
	//   99  222:ifne            266
	//  100  225:ldc1            #40  <String "S_TEXT/ASS">
	//  101  227:aload_0         
	//  102  228:invokevirtual   #591 <Method boolean String.equals(Object)>
	//  103  231:ifne            266
	//  104  234:ldc1            #106 <String "S_VOBSUB">
	//  105  236:aload_0         
	//  106  237:invokevirtual   #591 <Method boolean String.equals(Object)>
	//  107  240:ifne            266
	//  108  243:ldc1            #94  <String "S_HDMV/PGS">
	//  109  245:aload_0         
	//  110  246:invokevirtual   #591 <Method boolean String.equals(Object)>
	//  111  249:ifne            266
	//  112  252:ldc1            #52  <String "S_DVBSUB">
	//  113  254:aload_0         
	//  114  255:invokevirtual   #591 <Method boolean String.equals(Object)>
	//  115  258:ifeq            264
	//  116  261:goto            266
	//  117  264:iconst_0        
	//  118  265:ireturn         
	//  119  266:iconst_1        
	//  120  267:ireturn         
	}

	private boolean maybeSeekForCues(PositionHolder positionholder, long l)
	{
		if(seekForCues)
	//*   0    0:aload_0         
	//*   1    1:getfield        #647 <Field boolean seekForCues>
	//*   2    4:ifeq            27
		{
			seekPositionAfterBuildingCues = l;
	//    3    7:aload_0         
	//    4    8:lload_2         
	//    5    9:putfield        #474 <Field long seekPositionAfterBuildingCues>
			positionholder.position = cuesContentPosition;
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #472 <Field long cuesContentPosition>
	//    9   17:putfield        #652 <Field long PositionHolder.position>
			seekForCues = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #647 <Field boolean seekForCues>
			return true;
	//   13   25:iconst_1        
	//   14   26:ireturn         
		}
		if(sentSeekMap && seekPositionAfterBuildingCues != -1L)
	//*  15   27:aload_0         
	//*  16   28:getfield        #654 <Field boolean sentSeekMap>
	//*  17   31:ifeq            62
	//*  18   34:aload_0         
	//*  19   35:getfield        #474 <Field long seekPositionAfterBuildingCues>
	//*  20   38:ldc2w           #459 <Long -1L>
	//*  21   41:lcmp            
	//*  22   42:ifeq            62
		{
			positionholder.position = seekPositionAfterBuildingCues;
	//   23   45:aload_1         
	//   24   46:aload_0         
	//   25   47:getfield        #474 <Field long seekPositionAfterBuildingCues>
	//   26   50:putfield        #652 <Field long PositionHolder.position>
			seekPositionAfterBuildingCues = -1L;
	//   27   53:aload_0         
	//   28   54:ldc2w           #459 <Long -1L>
	//   29   57:putfield        #474 <Field long seekPositionAfterBuildingCues>
			return true;
	//   30   60:iconst_1        
	//   31   61:ireturn         
		} else
		{
			return false;
	//   32   62:iconst_0        
	//   33   63:ireturn         
		}
	}

	private void readScratch(ExtractorInput extractorinput, int i)
		throws IOException, InterruptedException
	{
		if(scratch.limit() >= i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #504 <Field ParsableByteArray scratch>
	//*   2    4:invokevirtual   #629 <Method int ParsableByteArray.limit()>
	//*   3    7:iload_2         
	//*   4    8:icmplt          12
			return;
	//    5   11:return          
		if(scratch.capacity() < i)
	//*   6   12:aload_0         
	//*   7   13:getfield        #504 <Field ParsableByteArray scratch>
	//*   8   16:invokevirtual   #663 <Method int ParsableByteArray.capacity()>
	//*   9   19:iload_2         
	//*  10   20:icmpge          61
			scratch.reset(Arrays.copyOf(scratch.data, Math.max(scratch.data.length * 2, i)), scratch.limit());
	//   11   23:aload_0         
	//   12   24:getfield        #504 <Field ParsableByteArray scratch>
	//   13   27:aload_0         
	//   14   28:getfield        #504 <Field ParsableByteArray scratch>
	//   15   31:getfield        #620 <Field byte[] ParsableByteArray.data>
	//   16   34:aload_0         
	//   17   35:getfield        #504 <Field ParsableByteArray scratch>
	//   18   38:getfield        #620 <Field byte[] ParsableByteArray.data>
	//   19   41:arraylength     
	//   20   42:iconst_2        
	//   21   43:imul            
	//   22   44:iload_2         
	//   23   45:invokestatic    #641 <Method int Math.max(int, int)>
	//   24   48:invokestatic    #669 <Method byte[] Arrays.copyOf(byte[], int)>
	//   25   51:aload_0         
	//   26   52:getfield        #504 <Field ParsableByteArray scratch>
	//   27   55:invokevirtual   #629 <Method int ParsableByteArray.limit()>
	//   28   58:invokevirtual   #673 <Method void ParsableByteArray.reset(byte[], int)>
		extractorinput.readFully(scratch.data, scratch.limit(), i - scratch.limit());
	//   29   61:aload_1         
	//   30   62:aload_0         
	//   31   63:getfield        #504 <Field ParsableByteArray scratch>
	//   32   66:getfield        #620 <Field byte[] ParsableByteArray.data>
	//   33   69:aload_0         
	//   34   70:getfield        #504 <Field ParsableByteArray scratch>
	//   35   73:invokevirtual   #629 <Method int ParsableByteArray.limit()>
	//   36   76:iload_2         
	//   37   77:aload_0         
	//   38   78:getfield        #504 <Field ParsableByteArray scratch>
	//   39   81:invokevirtual   #629 <Method int ParsableByteArray.limit()>
	//   40   84:isub            
	//   41   85:invokeinterface #679 <Method void ExtractorInput.readFully(byte[], int, int)>
		scratch.setLimit(i);
	//   42   90:aload_0         
	//   43   91:getfield        #504 <Field ParsableByteArray scratch>
	//   44   94:iload_2         
	//   45   95:invokevirtual   #682 <Method void ParsableByteArray.setLimit(int)>
	//   46   98:return          
	}

	private int readToOutput(ExtractorInput extractorinput, TrackOutput trackoutput, int i)
		throws IOException, InterruptedException
	{
		int j = sampleStrippedBytes.bytesLeft();
	//    0    0:aload_0         
	//    1    1:getfield        #536 <Field ParsableByteArray sampleStrippedBytes>
	//    2    4:invokevirtual   #688 <Method int ParsableByteArray.bytesLeft()>
	//    3    7:istore          4
		if(j > 0)
	//*   4    9:iload           4
	//*   5   11:ifle            35
		{
			i = Math.min(i, j);
	//    6   14:iload_3         
	//    7   15:iload           4
	//    8   17:invokestatic    #691 <Method int Math.min(int, int)>
	//    9   20:istore_3        
			trackoutput.sampleData(sampleStrippedBytes, i);
	//   10   21:aload_2         
	//   11   22:aload_0         
	//   12   23:getfield        #536 <Field ParsableByteArray sampleStrippedBytes>
	//   13   26:iload_3         
	//   14   27:invokeinterface #633 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
		} else
	//*  15   32:goto            45
		{
			i = trackoutput.sampleData(extractorinput, i, false);
	//   16   35:aload_2         
	//   17   36:aload_1         
	//   18   37:iload_3         
	//   19   38:iconst_0        
	//   20   39:invokeinterface #694 <Method int TrackOutput.sampleData(ExtractorInput, int, boolean)>
	//   21   44:istore_3        
		}
		sampleBytesRead = sampleBytesRead + i;
	//   22   45:aload_0         
	//   23   46:aload_0         
	//   24   47:getfield        #696 <Field int sampleBytesRead>
	//   25   50:iload_3         
	//   26   51:iadd            
	//   27   52:putfield        #696 <Field int sampleBytesRead>
		sampleBytesWritten = sampleBytesWritten + i;
	//   28   55:aload_0         
	//   29   56:aload_0         
	//   30   57:getfield        #603 <Field int sampleBytesWritten>
	//   31   60:iload_3         
	//   32   61:iadd            
	//   33   62:putfield        #603 <Field int sampleBytesWritten>
		return i;
	//   34   65:iload_3         
	//   35   66:ireturn         
	}

	private void readToTarget(ExtractorInput extractorinput, byte abyte0[], int i, int j)
		throws IOException, InterruptedException
	{
		int k = Math.min(j, sampleStrippedBytes.bytesLeft());
	//    0    0:iload           4
	//    1    2:aload_0         
	//    2    3:getfield        #536 <Field ParsableByteArray sampleStrippedBytes>
	//    3    6:invokevirtual   #688 <Method int ParsableByteArray.bytesLeft()>
	//    4    9:invokestatic    #691 <Method int Math.min(int, int)>
	//    5   12:istore          5
		extractorinput.readFully(abyte0, i + k, j - k);
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:iload_3         
	//    9   17:iload           5
	//   10   19:iadd            
	//   11   20:iload           4
	//   12   22:iload           5
	//   13   24:isub            
	//   14   25:invokeinterface #679 <Method void ExtractorInput.readFully(byte[], int, int)>
		if(k > 0)
	//*  15   30:iload           5
	//*  16   32:ifle            46
			sampleStrippedBytes.readBytes(abyte0, i, k);
	//   17   35:aload_0         
	//   18   36:getfield        #536 <Field ParsableByteArray sampleStrippedBytes>
	//   19   39:aload_2         
	//   20   40:iload_3         
	//   21   41:iload           5
	//   22   43:invokevirtual   #701 <Method void ParsableByteArray.readBytes(byte[], int, int)>
		sampleBytesRead = sampleBytesRead + j;
	//   23   46:aload_0         
	//   24   47:aload_0         
	//   25   48:getfield        #696 <Field int sampleBytesRead>
	//   26   51:iload           4
	//   27   53:iadd            
	//   28   54:putfield        #696 <Field int sampleBytesRead>
	//   29   57:return          
	}

	private void resetSample()
	{
		sampleBytesRead = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #696 <Field int sampleBytesRead>
		sampleBytesWritten = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #603 <Field int sampleBytesWritten>
		sampleCurrentNalBytesRemaining = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #703 <Field int sampleCurrentNalBytesRemaining>
		sampleEncodingHandled = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #705 <Field boolean sampleEncodingHandled>
		sampleSignalByteRead = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #707 <Field boolean sampleSignalByteRead>
		samplePartitionCountRead = false;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #709 <Field boolean samplePartitionCountRead>
		samplePartitionCount = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #711 <Field int samplePartitionCount>
		sampleSignalByte = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #713 <Field byte sampleSignalByte>
		sampleInitializationVectorRead = false;
	//   24   40:aload_0         
	//   25   41:iconst_0        
	//   26   42:putfield        #715 <Field boolean sampleInitializationVectorRead>
		sampleStrippedBytes.reset();
	//   27   45:aload_0         
	//   28   46:getfield        #536 <Field ParsableByteArray sampleStrippedBytes>
	//   29   49:invokevirtual   #717 <Method void ParsableByteArray.reset()>
	//   30   52:return          
	}

	private long scaleTimecodeToUs(long l)
		throws ParserException
	{
		if(timecodeScale == 0x1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #466 <Field long timecodeScale>
	//*   2    4:ldc2w           #463 <Long 0x1L>
	//*   3    7:lcmp            
	//*   4    8:ifne            22
			throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
	//    5   11:new             #721 <Class ParserException>
	//    6   14:dup             
	//    7   15:ldc2            #723 <String "Can't scale timecode prior to timecodeScale being set.">
	//    8   18:invokespecial   #726 <Method void ParserException(String)>
	//    9   21:athrow          
		else
			return Util.scaleLargeTimestamp(l, timecodeScale, 1000L);
	//   10   22:lload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #466 <Field long timecodeScale>
	//   13   27:ldc2w           #316 <Long 1000L>
	//   14   30:invokestatic    #730 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   15   33:lreturn         
	}

	private static void setSampleDuration(byte abyte0[], long l, String s, int i, long l1, byte abyte1[])
	{
		if(l == 0x1L)
	//*   0    0:lload_1         
	//*   1    1:ldc2w           #463 <Long 0x1L>
	//*   2    4:lcmp            
	//*   3    5:ifne            14
		{
			s = ((String) (abyte1));
	//    4    8:aload           7
	//    5   10:astore_3        
		} else
	//*   6   11:goto            127
		{
			int j = (int)(l / 0xd693a400L);
	//    7   14:lload_1         
	//    8   15:ldc2w           #731 <Long 0xd693a400L>
	//    9   18:ldiv            
	//   10   19:l2i             
	//   11   20:istore          8
			l -= (long)(j * 3600) * 0xf4240L;
	//   12   22:lload_1         
	//   13   23:iload           8
	//   14   25:sipush          3600
	//   15   28:imul            
	//   16   29:i2l             
	//   17   30:ldc2w           #733 <Long 0xf4240L>
	//   18   33:lmul            
	//   19   34:lsub            
	//   20   35:lstore_1        
			int k = (int)(l / 0x3938700L);
	//   21   36:lload_1         
	//   22   37:ldc2w           #735 <Long 0x3938700L>
	//   23   40:ldiv            
	//   24   41:l2i             
	//   25   42:istore          9
			l -= (long)(k * 60) * 0xf4240L;
	//   26   44:lload_1         
	//   27   45:iload           9
	//   28   47:bipush          60
	//   29   49:imul            
	//   30   50:i2l             
	//   31   51:ldc2w           #733 <Long 0xf4240L>
	//   32   54:lmul            
	//   33   55:lsub            
	//   34   56:lstore_1        
			int i1 = (int)(l / 0xf4240L);
	//   35   57:lload_1         
	//   36   58:ldc2w           #733 <Long 0xf4240L>
	//   37   61:ldiv            
	//   38   62:l2i             
	//   39   63:istore          10
			int j1 = (int)((l - (long)i1 * 0xf4240L) / l1);
	//   40   65:lload_1         
	//   41   66:iload           10
	//   42   68:i2l             
	//   43   69:ldc2w           #733 <Long 0xf4240L>
	//   44   72:lmul            
	//   45   73:lsub            
	//   46   74:lload           5
	//   47   76:ldiv            
	//   48   77:l2i             
	//   49   78:istore          11
			s = ((String) (Util.getUtf8Bytes(String.format(Locale.US, s, new Object[] {
				Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i1), Integer.valueOf(j1)
			}))));
	//   50   80:getstatic       #742 <Field Locale Locale.US>
	//   51   83:aload_3         
	//   52   84:iconst_4        
	//   53   85:anewarray       Object[]
	//   54   88:dup             
	//   55   89:iconst_0        
	//   56   90:iload           8
	//   57   92:invokestatic    #748 <Method Integer Integer.valueOf(int)>
	//   58   95:aastore         
	//   59   96:dup             
	//   60   97:iconst_1        
	//   61   98:iload           9
	//   62  100:invokestatic    #748 <Method Integer Integer.valueOf(int)>
	//   63  103:aastore         
	//   64  104:dup             
	//   65  105:iconst_2        
	//   66  106:iload           10
	//   67  108:invokestatic    #748 <Method Integer Integer.valueOf(int)>
	//   68  111:aastore         
	//   69  112:dup             
	//   70  113:iconst_3        
	//   71  114:iload           11
	//   72  116:invokestatic    #748 <Method Integer Integer.valueOf(int)>
	//   73  119:aastore         
	//   74  120:invokestatic    #752 <Method String String.format(Locale, String, Object[])>
	//   75  123:invokestatic    #422 <Method byte[] Util.getUtf8Bytes(String)>
	//   76  126:astore_3        
		}
		System.arraycopy(((Object) (s)), 0, ((Object) (abyte0)), i, abyte1.length);
	//   77  127:aload_3         
	//   78  128:iconst_0        
	//   79  129:aload_0         
	//   80  130:iload           4
	//   81  132:aload           7
	//   82  134:arraylength     
	//   83  135:invokestatic    #758 <Method void System.arraycopy(Object, int, Object, int, int)>
	//   84  138:return          
	}

	private void writeSampleData(ExtractorInput extractorinput, Track track, int i)
		throws IOException, InterruptedException
	{
		if("S_TEXT/UTF8".equals(((Object) (track.codecId))))
	//*   0    0:ldc1            #97  <String "S_TEXT/UTF8">
	//*   1    2:aload_2         
	//*   2    3:getfield        #585 <Field String MatroskaExtractor$Track.codecId>
	//*   3    6:invokevirtual   #591 <Method boolean String.equals(Object)>
	//*   4    9:ifeq            22
		{
			writeSubtitleSampleData(extractorinput, SUBRIP_PREFIX, i);
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:getstatic       #412 <Field byte[] SUBRIP_PREFIX>
	//    8   17:iload_3         
	//    9   18:invokespecial   #764 <Method void writeSubtitleSampleData(ExtractorInput, byte[], int)>
			return;
	//   10   21:return          
		}
		if("S_TEXT/ASS".equals(((Object) (track.codecId))))
	//*  11   22:ldc1            #40  <String "S_TEXT/ASS">
	//*  12   24:aload_2         
	//*  13   25:getfield        #585 <Field String MatroskaExtractor$Track.codecId>
	//*  14   28:invokevirtual   #591 <Method boolean String.equals(Object)>
	//*  15   31:ifeq            44
		{
			writeSubtitleSampleData(extractorinput, SSA_PREFIX, i);
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:getstatic       #434 <Field byte[] SSA_PREFIX>
	//   19   39:iload_3         
	//   20   40:invokespecial   #764 <Method void writeSubtitleSampleData(ExtractorInput, byte[], int)>
			return;
	//   21   43:return          
		}
		TrackOutput trackoutput = track.output;
	//   22   44:aload_2         
	//   23   45:getfield        #599 <Field TrackOutput MatroskaExtractor$Track.output>
	//   24   48:astore          11
		boolean flag3 = sampleEncodingHandled;
	//   25   50:aload_0         
	//   26   51:getfield        #705 <Field boolean sampleEncodingHandled>
	//   27   54:istore          10
		boolean flag2 = true;
	//   28   56:iconst_1        
	//   29   57:istore          9
		if(!flag3)
	//*  30   59:iload           10
	//*  31   61:ifne            730
		{
			if(track.hasContentEncryption)
	//*  32   64:aload_2         
	//*  33   65:getfield        #767 <Field boolean MatroskaExtractor$Track.hasContentEncryption>
	//*  34   68:ifeq            702
			{
				blockFlags = blockFlags & 0xbfffffff;
	//   35   71:aload_0         
	//   36   72:aload_0         
	//   37   73:getfield        #601 <Field int blockFlags>
	//   38   76:ldc2            #768 <Int 0xbfffffff>
	//   39   79:iand            
	//   40   80:putfield        #601 <Field int blockFlags>
				boolean flag4 = sampleSignalByteRead;
	//   41   83:aload_0         
	//   42   84:getfield        #707 <Field boolean sampleSignalByteRead>
	//   43   87:istore          10
				char c = '\200';
	//   44   89:sipush          128
	//   45   92:istore          6
				if(!flag4)
	//*  46   94:iload           10
	//*  47   96:ifne            172
				{
					extractorinput.readFully(scratch.data, 0, 1);
	//   48   99:aload_1         
	//   49  100:aload_0         
	//   50  101:getfield        #504 <Field ParsableByteArray scratch>
	//   51  104:getfield        #620 <Field byte[] ParsableByteArray.data>
	//   52  107:iconst_0        
	//   53  108:iconst_1        
	//   54  109:invokeinterface #679 <Method void ExtractorInput.readFully(byte[], int, int)>
					sampleBytesRead = sampleBytesRead + 1;
	//   55  114:aload_0         
	//   56  115:aload_0         
	//   57  116:getfield        #696 <Field int sampleBytesRead>
	//   58  119:iconst_1        
	//   59  120:iadd            
	//   60  121:putfield        #696 <Field int sampleBytesRead>
					if((scratch.data[0] & 0x80) == 128)
	//*  61  124:aload_0         
	//*  62  125:getfield        #504 <Field ParsableByteArray scratch>
	//*  63  128:getfield        #620 <Field byte[] ParsableByteArray.data>
	//*  64  131:iconst_0        
	//*  65  132:baload          
	//*  66  133:sipush          128
	//*  67  136:iand            
	//*  68  137:sipush          128
	//*  69  140:icmpne          154
						throw new ParserException("Extension bit is set in signal byte");
	//   70  143:new             #721 <Class ParserException>
	//   71  146:dup             
	//   72  147:ldc2            #770 <String "Extension bit is set in signal byte">
	//   73  150:invokespecial   #726 <Method void ParserException(String)>
	//   74  153:athrow          
					sampleSignalByte = scratch.data[0];
	//   75  154:aload_0         
	//   76  155:aload_0         
	//   77  156:getfield        #504 <Field ParsableByteArray scratch>
	//   78  159:getfield        #620 <Field byte[] ParsableByteArray.data>
	//   79  162:iconst_0        
	//   80  163:baload          
	//   81  164:putfield        #713 <Field byte sampleSignalByte>
					sampleSignalByteRead = true;
	//   82  167:aload_0         
	//   83  168:iconst_1        
	//   84  169:putfield        #707 <Field boolean sampleSignalByteRead>
				}
				boolean flag;
				if((sampleSignalByte & 1) == 1)
	//*  85  172:aload_0         
	//*  86  173:getfield        #713 <Field byte sampleSignalByte>
	//*  87  176:iconst_1        
	//*  88  177:iand            
	//*  89  178:iconst_1        
	//*  90  179:icmpne          188
					flag = true;
	//   91  182:iconst_1        
	//   92  183:istore          5
				else
	//*  93  185:goto            191
					flag = false;
	//   94  188:iconst_0        
	//   95  189:istore          5
				if(flag)
	//*  96  191:iload           5
	//*  97  193:ifeq            725
				{
					boolean flag1;
					if((sampleSignalByte & 2) == 2)
	//*  98  196:aload_0         
	//*  99  197:getfield        #713 <Field byte sampleSignalByte>
	//* 100  200:iconst_2        
	//* 101  201:iand            
	//* 102  202:iconst_2        
	//* 103  203:icmpne          212
						flag1 = true;
	//  104  206:iconst_1        
	//  105  207:istore          5
					else
	//* 106  209:goto            215
						flag1 = false;
	//  107  212:iconst_0        
	//  108  213:istore          5
					blockFlags = blockFlags | 0x40000000;
	//  109  215:aload_0         
	//  110  216:aload_0         
	//  111  217:getfield        #601 <Field int blockFlags>
	//  112  220:ldc2            #771 <Int 0x40000000>
	//  113  223:ior             
	//  114  224:putfield        #601 <Field int blockFlags>
					if(!sampleInitializationVectorRead)
	//* 115  227:aload_0         
	//* 116  228:getfield        #715 <Field boolean sampleInitializationVectorRead>
	//* 117  231:ifne            358
					{
						extractorinput.readFully(encryptionInitializationVector.data, 0, 8);
	//  118  234:aload_1         
	//  119  235:aload_0         
	//  120  236:getfield        #540 <Field ParsableByteArray encryptionInitializationVector>
	//  121  239:getfield        #620 <Field byte[] ParsableByteArray.data>
	//  122  242:iconst_0        
	//  123  243:bipush          8
	//  124  245:invokeinterface #679 <Method void ExtractorInput.readFully(byte[], int, int)>
						sampleBytesRead = sampleBytesRead + 8;
	//  125  250:aload_0         
	//  126  251:aload_0         
	//  127  252:getfield        #696 <Field int sampleBytesRead>
	//  128  255:bipush          8
	//  129  257:iadd            
	//  130  258:putfield        #696 <Field int sampleBytesRead>
						sampleInitializationVectorRead = true;
	//  131  261:aload_0         
	//  132  262:iconst_1        
	//  133  263:putfield        #715 <Field boolean sampleInitializationVectorRead>
						byte abyte0[] = scratch.data;
	//  134  266:aload_0         
	//  135  267:getfield        #504 <Field ParsableByteArray scratch>
	//  136  270:getfield        #620 <Field byte[] ParsableByteArray.data>
	//  137  273:astore          12
						if(!flag1)
	//* 138  275:iload           5
	//* 139  277:ifeq            283
	//* 140  280:goto            286
							c = '\0';
	//  141  283:iconst_0        
	//  142  284:istore          6
						abyte0[0] = (byte)(c | 8);
	//  143  286:aload           12
	//  144  288:iconst_0        
	//  145  289:iload           6
	//  146  291:bipush          8
	//  147  293:ior             
	//  148  294:int2byte        
	//  149  295:bastore         
						scratch.setPosition(0);
	//  150  296:aload_0         
	//  151  297:getfield        #504 <Field ParsableByteArray scratch>
	//  152  300:iconst_0        
	//  153  301:invokevirtual   #774 <Method void ParsableByteArray.setPosition(int)>
						trackoutput.sampleData(scratch, 1);
	//  154  304:aload           11
	//  155  306:aload_0         
	//  156  307:getfield        #504 <Field ParsableByteArray scratch>
	//  157  310:iconst_1        
	//  158  311:invokeinterface #633 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
						sampleBytesWritten = sampleBytesWritten + 1;
	//  159  316:aload_0         
	//  160  317:aload_0         
	//  161  318:getfield        #603 <Field int sampleBytesWritten>
	//  162  321:iconst_1        
	//  163  322:iadd            
	//  164  323:putfield        #603 <Field int sampleBytesWritten>
						encryptionInitializationVector.setPosition(0);
	//  165  326:aload_0         
	//  166  327:getfield        #540 <Field ParsableByteArray encryptionInitializationVector>
	//  167  330:iconst_0        
	//  168  331:invokevirtual   #774 <Method void ParsableByteArray.setPosition(int)>
						trackoutput.sampleData(encryptionInitializationVector, 8);
	//  169  334:aload           11
	//  170  336:aload_0         
	//  171  337:getfield        #540 <Field ParsableByteArray encryptionInitializationVector>
	//  172  340:bipush          8
	//  173  342:invokeinterface #633 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
						sampleBytesWritten = sampleBytesWritten + 8;
	//  174  347:aload_0         
	//  175  348:aload_0         
	//  176  349:getfield        #603 <Field int sampleBytesWritten>
	//  177  352:bipush          8
	//  178  354:iadd            
	//  179  355:putfield        #603 <Field int sampleBytesWritten>
					}
					if(flag1)
	//* 180  358:iload           5
	//* 181  360:ifeq            725
					{
						if(!samplePartitionCountRead)
	//* 182  363:aload_0         
	//* 183  364:getfield        #709 <Field boolean samplePartitionCountRead>
	//* 184  367:ifne            419
						{
							extractorinput.readFully(scratch.data, 0, 1);
	//  185  370:aload_1         
	//  186  371:aload_0         
	//  187  372:getfield        #504 <Field ParsableByteArray scratch>
	//  188  375:getfield        #620 <Field byte[] ParsableByteArray.data>
	//  189  378:iconst_0        
	//  190  379:iconst_1        
	//  191  380:invokeinterface #679 <Method void ExtractorInput.readFully(byte[], int, int)>
							sampleBytesRead = sampleBytesRead + 1;
	//  192  385:aload_0         
	//  193  386:aload_0         
	//  194  387:getfield        #696 <Field int sampleBytesRead>
	//  195  390:iconst_1        
	//  196  391:iadd            
	//  197  392:putfield        #696 <Field int sampleBytesRead>
							scratch.setPosition(0);
	//  198  395:aload_0         
	//  199  396:getfield        #504 <Field ParsableByteArray scratch>
	//  200  399:iconst_0        
	//  201  400:invokevirtual   #774 <Method void ParsableByteArray.setPosition(int)>
							samplePartitionCount = scratch.readUnsignedByte();
	//  202  403:aload_0         
	//  203  404:aload_0         
	//  204  405:getfield        #504 <Field ParsableByteArray scratch>
	//  205  408:invokevirtual   #777 <Method int ParsableByteArray.readUnsignedByte()>
	//  206  411:putfield        #711 <Field int samplePartitionCount>
							samplePartitionCountRead = true;
	//  207  414:aload_0         
	//  208  415:iconst_1        
	//  209  416:putfield        #709 <Field boolean samplePartitionCountRead>
						}
						int j = samplePartitionCount * 4;
	//  210  419:aload_0         
	//  211  420:getfield        #711 <Field int samplePartitionCount>
	//  212  423:iconst_4        
	//  213  424:imul            
	//  214  425:istore          5
						scratch.reset(j);
	//  215  427:aload_0         
	//  216  428:getfield        #504 <Field ParsableByteArray scratch>
	//  217  431:iload           5
	//  218  433:invokevirtual   #779 <Method void ParsableByteArray.reset(int)>
						extractorinput.readFully(scratch.data, 0, j);
	//  219  436:aload_1         
	//  220  437:aload_0         
	//  221  438:getfield        #504 <Field ParsableByteArray scratch>
	//  222  441:getfield        #620 <Field byte[] ParsableByteArray.data>
	//  223  444:iconst_0        
	//  224  445:iload           5
	//  225  447:invokeinterface #679 <Method void ExtractorInput.readFully(byte[], int, int)>
						sampleBytesRead = sampleBytesRead + j;
	//  226  452:aload_0         
	//  227  453:aload_0         
	//  228  454:getfield        #696 <Field int sampleBytesRead>
	//  229  457:iload           5
	//  230  459:iadd            
	//  231  460:putfield        #696 <Field int sampleBytesRead>
						short word0 = (short)(samplePartitionCount / 2 + 1);
	//  232  463:aload_0         
	//  233  464:getfield        #711 <Field int samplePartitionCount>
	//  234  467:iconst_2        
	//  235  468:idiv            
	//  236  469:iconst_1        
	//  237  470:iadd            
	//  238  471:int2short       
	//  239  472:istore          4
						int k1 = 6 * word0 + 2;
	//  240  474:bipush          6
	//  241  476:iload           4
	//  242  478:imul            
	//  243  479:iconst_2        
	//  244  480:iadd            
	//  245  481:istore          8
						if(encryptionSubsampleDataBuffer == null || encryptionSubsampleDataBuffer.capacity() < k1)
	//* 246  483:aload_0         
	//* 247  484:getfield        #781 <Field ByteBuffer encryptionSubsampleDataBuffer>
	//* 248  487:ifnull          502
	//* 249  490:aload_0         
	//* 250  491:getfield        #781 <Field ByteBuffer encryptionSubsampleDataBuffer>
	//* 251  494:invokevirtual   #782 <Method int ByteBuffer.capacity()>
	//* 252  497:iload           8
	//* 253  499:icmpge          511
							encryptionSubsampleDataBuffer = ByteBuffer.allocate(k1);
	//  254  502:aload_0         
	//  255  503:iload           8
	//  256  505:invokestatic    #510 <Method ByteBuffer ByteBuffer.allocate(int)>
	//  257  508:putfield        #781 <Field ByteBuffer encryptionSubsampleDataBuffer>
						encryptionSubsampleDataBuffer.position(0);
	//  258  511:aload_0         
	//  259  512:getfield        #781 <Field ByteBuffer encryptionSubsampleDataBuffer>
	//  260  515:iconst_0        
	//  261  516:invokevirtual   #785 <Method java.nio.Buffer ByteBuffer.position(int)>
	//  262  519:pop             
						encryptionSubsampleDataBuffer.putShort(word0);
	//  263  520:aload_0         
	//  264  521:getfield        #781 <Field ByteBuffer encryptionSubsampleDataBuffer>
	//  265  524:iload           4
	//  266  526:invokevirtual   #789 <Method ByteBuffer ByteBuffer.putShort(short)>
	//  267  529:pop             
						j = 0;
	//  268  530:iconst_0        
	//  269  531:istore          5
						int l;
						int j1;
						for(l = j; j < samplePartitionCount; l = j1)
	//* 270  533:iload           5
	//* 271  535:istore          6
	//* 272  537:iload           5
	//* 273  539:aload_0         
	//* 274  540:getfield        #711 <Field int samplePartitionCount>
	//* 275  543:icmpge          605
						{
							j1 = scratch.readUnsignedIntToInt();
	//  276  546:aload_0         
	//  277  547:getfield        #504 <Field ParsableByteArray scratch>
	//  278  550:invokevirtual   #792 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  279  553:istore          7
							if(j % 2 == 0)
	//* 280  555:iload           5
	//* 281  557:iconst_2        
	//* 282  558:irem            
	//* 283  559:ifne            579
								encryptionSubsampleDataBuffer.putShort((short)(j1 - l));
	//  284  562:aload_0         
	//  285  563:getfield        #781 <Field ByteBuffer encryptionSubsampleDataBuffer>
	//  286  566:iload           7
	//  287  568:iload           6
	//  288  570:isub            
	//  289  571:int2short       
	//  290  572:invokevirtual   #789 <Method ByteBuffer ByteBuffer.putShort(short)>
	//  291  575:pop             
							else
	//* 292  576:goto            592
								encryptionSubsampleDataBuffer.putInt(j1 - l);
	//  293  579:aload_0         
	//  294  580:getfield        #781 <Field ByteBuffer encryptionSubsampleDataBuffer>
	//  295  583:iload           7
	//  296  585:iload           6
	//  297  587:isub            
	//  298  588:invokevirtual   #513 <Method ByteBuffer ByteBuffer.putInt(int)>
	//  299  591:pop             
							j++;
	//  300  592:iload           5
	//  301  594:iconst_1        
	//  302  595:iadd            
	//  303  596:istore          5
						}

	//  304  598:iload           7
	//  305  600:istore          6
	//* 306  602:goto            537
						j = i - sampleBytesRead - l;
	//  307  605:iload_3         
	//  308  606:aload_0         
	//  309  607:getfield        #696 <Field int sampleBytesRead>
	//  310  610:isub            
	//  311  611:iload           6
	//  312  613:isub            
	//  313  614:istore          5
						if(samplePartitionCount % 2 == 1)
	//* 314  616:aload_0         
	//* 315  617:getfield        #711 <Field int samplePartitionCount>
	//* 316  620:iconst_2        
	//* 317  621:irem            
	//* 318  622:iconst_1        
	//* 319  623:icmpne          639
						{
							encryptionSubsampleDataBuffer.putInt(j);
	//  320  626:aload_0         
	//  321  627:getfield        #781 <Field ByteBuffer encryptionSubsampleDataBuffer>
	//  322  630:iload           5
	//  323  632:invokevirtual   #513 <Method ByteBuffer ByteBuffer.putInt(int)>
	//  324  635:pop             
						} else
	//* 325  636:goto            659
						{
							encryptionSubsampleDataBuffer.putShort((short)j);
	//  326  639:aload_0         
	//  327  640:getfield        #781 <Field ByteBuffer encryptionSubsampleDataBuffer>
	//  328  643:iload           5
	//  329  645:int2short       
	//  330  646:invokevirtual   #789 <Method ByteBuffer ByteBuffer.putShort(short)>
	//  331  649:pop             
							encryptionSubsampleDataBuffer.putInt(0);
	//  332  650:aload_0         
	//  333  651:getfield        #781 <Field ByteBuffer encryptionSubsampleDataBuffer>
	//  334  654:iconst_0        
	//  335  655:invokevirtual   #513 <Method ByteBuffer ByteBuffer.putInt(int)>
	//  336  658:pop             
						}
						encryptionSubsampleData.reset(encryptionSubsampleDataBuffer.array(), k1);
	//  337  659:aload_0         
	//  338  660:getfield        #542 <Field ParsableByteArray encryptionSubsampleData>
	//  339  663:aload_0         
	//  340  664:getfield        #781 <Field ByteBuffer encryptionSubsampleDataBuffer>
	//  341  667:invokevirtual   #517 <Method byte[] ByteBuffer.array()>
	//  342  670:iload           8
	//  343  672:invokevirtual   #673 <Method void ParsableByteArray.reset(byte[], int)>
						trackoutput.sampleData(encryptionSubsampleData, k1);
	//  344  675:aload           11
	//  345  677:aload_0         
	//  346  678:getfield        #542 <Field ParsableByteArray encryptionSubsampleData>
	//  347  681:iload           8
	//  348  683:invokeinterface #633 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
						sampleBytesWritten = sampleBytesWritten + k1;
	//  349  688:aload_0         
	//  350  689:aload_0         
	//  351  690:getfield        #603 <Field int sampleBytesWritten>
	//  352  693:iload           8
	//  353  695:iadd            
	//  354  696:putfield        #603 <Field int sampleBytesWritten>
					}
				}
			} else
	//* 355  699:goto            725
			if(track.sampleStrippedBytes != null)
	//* 356  702:aload_2         
	//* 357  703:getfield        #794 <Field byte[] MatroskaExtractor$Track.sampleStrippedBytes>
	//* 358  706:ifnull          725
				sampleStrippedBytes.reset(track.sampleStrippedBytes, track.sampleStrippedBytes.length);
	//  359  709:aload_0         
	//  360  710:getfield        #536 <Field ParsableByteArray sampleStrippedBytes>
	//  361  713:aload_2         
	//  362  714:getfield        #794 <Field byte[] MatroskaExtractor$Track.sampleStrippedBytes>
	//  363  717:aload_2         
	//  364  718:getfield        #794 <Field byte[] MatroskaExtractor$Track.sampleStrippedBytes>
	//  365  721:arraylength     
	//  366  722:invokevirtual   #673 <Method void ParsableByteArray.reset(byte[], int)>
			sampleEncodingHandled = true;
	//  367  725:aload_0         
	//  368  726:iconst_1        
	//  369  727:putfield        #705 <Field boolean sampleEncodingHandled>
		}
		i += sampleStrippedBytes.limit();
	//  370  730:iload_3         
	//  371  731:aload_0         
	//  372  732:getfield        #536 <Field ParsableByteArray sampleStrippedBytes>
	//  373  735:invokevirtual   #629 <Method int ParsableByteArray.limit()>
	//  374  738:iadd            
	//  375  739:istore_3        
		if(!"V_MPEG4/ISO/AVC".equals(((Object) (track.codecId))) && !"V_MPEGH/ISO/HEVC".equals(((Object) (track.codecId))))
	//* 376  740:ldc1            #64  <String "V_MPEG4/ISO/AVC">
	//* 377  742:aload_2         
	//* 378  743:getfield        #585 <Field String MatroskaExtractor$Track.codecId>
	//* 379  746:invokevirtual   #591 <Method boolean String.equals(Object)>
	//* 380  749:ifne            833
	//* 381  752:ldc1            #67  <String "V_MPEGH/ISO/HEVC">
	//* 382  754:aload_2         
	//* 383  755:getfield        #585 <Field String MatroskaExtractor$Track.codecId>
	//* 384  758:invokevirtual   #591 <Method boolean String.equals(Object)>
	//* 385  761:ifeq            767
	//* 386  764:goto            833
		{
			if(track.trueHdSampleRechunker != null)
	//* 387  767:aload_2         
	//* 388  768:getfield        #579 <Field MatroskaExtractor$TrueHdSampleRechunker MatroskaExtractor$Track.trueHdSampleRechunker>
	//* 389  771:ifnull          808
			{
				if(sampleStrippedBytes.limit() != 0)
	//* 390  774:aload_0         
	//* 391  775:getfield        #536 <Field ParsableByteArray sampleStrippedBytes>
	//* 392  778:invokevirtual   #629 <Method int ParsableByteArray.limit()>
	//* 393  781:ifne            787
	//* 394  784:goto            790
					flag2 = false;
	//  395  787:iconst_0        
	//  396  788:istore          9
				Assertions.checkState(flag2);
	//  397  790:iload           9
	//  398  792:invokestatic    #800 <Method void Assertions.checkState(boolean)>
				track.trueHdSampleRechunker.startSample(extractorinput, blockFlags, i);
	//  399  795:aload_2         
	//  400  796:getfield        #579 <Field MatroskaExtractor$TrueHdSampleRechunker MatroskaExtractor$Track.trueHdSampleRechunker>
	//  401  799:aload_1         
	//  402  800:aload_0         
	//  403  801:getfield        #601 <Field int blockFlags>
	//  404  804:iload_3         
	//  405  805:invokevirtual   #804 <Method void MatroskaExtractor$TrueHdSampleRechunker.startSample(ExtractorInput, int, int)>
			}
			while(sampleBytesRead < i) 
	//* 406  808:aload_0         
	//* 407  809:getfield        #696 <Field int sampleBytesRead>
	//* 408  812:iload_3         
	//* 409  813:icmpge          972
				readToOutput(extractorinput, trackoutput, i - sampleBytesRead);
	//  410  816:aload_0         
	//  411  817:aload_1         
	//  412  818:aload           11
	//  413  820:iload_3         
	//  414  821:aload_0         
	//  415  822:getfield        #696 <Field int sampleBytesRead>
	//  416  825:isub            
	//  417  826:invokespecial   #806 <Method int readToOutput(ExtractorInput, TrackOutput, int)>
	//  418  829:pop             
		} else
	//* 419  830:goto            808
		{
			byte abyte1[] = nalLength.data;
	//  420  833:aload_0         
	//  421  834:getfield        #533 <Field ParsableByteArray nalLength>
	//  422  837:getfield        #620 <Field byte[] ParsableByteArray.data>
	//  423  840:astore          12
			abyte1[0] = 0;
	//  424  842:aload           12
	//  425  844:iconst_0        
	//  426  845:iconst_0        
	//  427  846:bastore         
			abyte1[1] = 0;
	//  428  847:aload           12
	//  429  849:iconst_1        
	//  430  850:iconst_0        
	//  431  851:bastore         
			abyte1[2] = 0;
	//  432  852:aload           12
	//  433  854:iconst_2        
	//  434  855:iconst_0        
	//  435  856:bastore         
			int k = track.nalUnitLengthFieldLength;
	//  436  857:aload_2         
	//  437  858:getfield        #809 <Field int MatroskaExtractor$Track.nalUnitLengthFieldLength>
	//  438  861:istore          5
			int i1 = track.nalUnitLengthFieldLength;
	//  439  863:aload_2         
	//  440  864:getfield        #809 <Field int MatroskaExtractor$Track.nalUnitLengthFieldLength>
	//  441  867:istore          6
			while(sampleBytesRead < i) 
	//* 442  869:aload_0         
	//* 443  870:getfield        #696 <Field int sampleBytesRead>
	//* 444  873:iload_3         
	//* 445  874:icmpge          972
				if(sampleCurrentNalBytesRemaining == 0)
	//* 446  877:aload_0         
	//* 447  878:getfield        #703 <Field int sampleCurrentNalBytesRemaining>
	//* 448  881:ifne            949
				{
					readToTarget(extractorinput, abyte1, 4 - i1, k);
	//  449  884:aload_0         
	//  450  885:aload_1         
	//  451  886:aload           12
	//  452  888:iconst_4        
	//  453  889:iload           6
	//  454  891:isub            
	//  455  892:iload           5
	//  456  894:invokespecial   #811 <Method void readToTarget(ExtractorInput, byte[], int, int)>
					nalLength.setPosition(0);
	//  457  897:aload_0         
	//  458  898:getfield        #533 <Field ParsableByteArray nalLength>
	//  459  901:iconst_0        
	//  460  902:invokevirtual   #774 <Method void ParsableByteArray.setPosition(int)>
					sampleCurrentNalBytesRemaining = nalLength.readUnsignedIntToInt();
	//  461  905:aload_0         
	//  462  906:aload_0         
	//  463  907:getfield        #533 <Field ParsableByteArray nalLength>
	//  464  910:invokevirtual   #792 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  465  913:putfield        #703 <Field int sampleCurrentNalBytesRemaining>
					nalStartCode.setPosition(0);
	//  466  916:aload_0         
	//  467  917:getfield        #531 <Field ParsableByteArray nalStartCode>
	//  468  920:iconst_0        
	//  469  921:invokevirtual   #774 <Method void ParsableByteArray.setPosition(int)>
					trackoutput.sampleData(nalStartCode, 4);
	//  470  924:aload           11
	//  471  926:aload_0         
	//  472  927:getfield        #531 <Field ParsableByteArray nalStartCode>
	//  473  930:iconst_4        
	//  474  931:invokeinterface #633 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
					sampleBytesWritten = sampleBytesWritten + 4;
	//  475  936:aload_0         
	//  476  937:aload_0         
	//  477  938:getfield        #603 <Field int sampleBytesWritten>
	//  478  941:iconst_4        
	//  479  942:iadd            
	//  480  943:putfield        #603 <Field int sampleBytesWritten>
				} else
	//* 481  946:goto            869
				{
					sampleCurrentNalBytesRemaining = sampleCurrentNalBytesRemaining - readToOutput(extractorinput, trackoutput, sampleCurrentNalBytesRemaining);
	//  482  949:aload_0         
	//  483  950:aload_0         
	//  484  951:getfield        #703 <Field int sampleCurrentNalBytesRemaining>
	//  485  954:aload_0         
	//  486  955:aload_1         
	//  487  956:aload           11
	//  488  958:aload_0         
	//  489  959:getfield        #703 <Field int sampleCurrentNalBytesRemaining>
	//  490  962:invokespecial   #806 <Method int readToOutput(ExtractorInput, TrackOutput, int)>
	//  491  965:isub            
	//  492  966:putfield        #703 <Field int sampleCurrentNalBytesRemaining>
				}
		}
	//* 493  969:goto            869
		if("A_VORBIS".equals(((Object) (track.codecId))))
	//* 494  972:ldc1            #109 <String "A_VORBIS">
	//* 495  974:aload_2         
	//* 496  975:getfield        #585 <Field String MatroskaExtractor$Track.codecId>
	//* 497  978:invokevirtual   #591 <Method boolean String.equals(Object)>
	//* 498  981:ifeq            1014
		{
			vorbisNumPageSamples.setPosition(0);
	//  499  984:aload_0         
	//  500  985:getfield        #522 <Field ParsableByteArray vorbisNumPageSamples>
	//  501  988:iconst_0        
	//  502  989:invokevirtual   #774 <Method void ParsableByteArray.setPosition(int)>
			trackoutput.sampleData(vorbisNumPageSamples, 4);
	//  503  992:aload           11
	//  504  994:aload_0         
	//  505  995:getfield        #522 <Field ParsableByteArray vorbisNumPageSamples>
	//  506  998:iconst_4        
	//  507  999:invokeinterface #633 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
			sampleBytesWritten = sampleBytesWritten + 4;
	//  508 1004:aload_0         
	//  509 1005:aload_0         
	//  510 1006:getfield        #603 <Field int sampleBytesWritten>
	//  511 1009:iconst_4        
	//  512 1010:iadd            
	//  513 1011:putfield        #603 <Field int sampleBytesWritten>
		}
	//  514 1014:return          
	}

	private void writeSubtitleSampleData(ExtractorInput extractorinput, byte abyte0[], int i)
		throws IOException, InterruptedException
	{
		int j = abyte0.length + i;
	//    0    0:aload_2         
	//    1    1:arraylength     
	//    2    2:iload_3         
	//    3    3:iadd            
	//    4    4:istore          4
		if(subtitleSample.capacity() < j)
	//*   5    6:aload_0         
	//*   6    7:getfield        #538 <Field ParsableByteArray subtitleSample>
	//*   7   10:invokevirtual   #663 <Method int ParsableByteArray.capacity()>
	//*   8   13:iload           4
	//*   9   15:icmpge          36
			subtitleSample.data = Arrays.copyOf(abyte0, j + i);
	//   10   18:aload_0         
	//   11   19:getfield        #538 <Field ParsableByteArray subtitleSample>
	//   12   22:aload_2         
	//   13   23:iload           4
	//   14   25:iload_3         
	//   15   26:iadd            
	//   16   27:invokestatic    #669 <Method byte[] Arrays.copyOf(byte[], int)>
	//   17   30:putfield        #620 <Field byte[] ParsableByteArray.data>
		else
	//*  18   33:goto            51
			System.arraycopy(((Object) (abyte0)), 0, ((Object) (subtitleSample.data)), 0, abyte0.length);
	//   19   36:aload_2         
	//   20   37:iconst_0        
	//   21   38:aload_0         
	//   22   39:getfield        #538 <Field ParsableByteArray subtitleSample>
	//   23   42:getfield        #620 <Field byte[] ParsableByteArray.data>
	//   24   45:iconst_0        
	//   25   46:aload_2         
	//   26   47:arraylength     
	//   27   48:invokestatic    #758 <Method void System.arraycopy(Object, int, Object, int, int)>
		extractorinput.readFully(subtitleSample.data, abyte0.length, i);
	//   28   51:aload_1         
	//   29   52:aload_0         
	//   30   53:getfield        #538 <Field ParsableByteArray subtitleSample>
	//   31   56:getfield        #620 <Field byte[] ParsableByteArray.data>
	//   32   59:aload_2         
	//   33   60:arraylength     
	//   34   61:iload_3         
	//   35   62:invokeinterface #679 <Method void ExtractorInput.readFully(byte[], int, int)>
		subtitleSample.reset(j);
	//   36   67:aload_0         
	//   37   68:getfield        #538 <Field ParsableByteArray subtitleSample>
	//   38   71:iload           4
	//   39   73:invokevirtual   #779 <Method void ParsableByteArray.reset(int)>
	//   40   76:return          
	}

	void binaryElement(int i, int j, ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		Track track;
label0:
		{
			int l;
label1:
			{
				int k = 4;
	//    0    0:iconst_4        
	//    1    1:istore          4
				if(i != 161 && i != 163)
	//*   2    3:iload_1         
	//*   3    4:sipush          161
	//*   4    7:icmpeq          248
	//*   5   10:iload_1         
	//*   6   11:sipush          163
	//*   7   14:icmpeq          248
					if(i != 16981)
	//*   8   17:iload_1         
	//*   9   18:sipush          16981
	//*  10   21:icmpeq          222
					{
						if(i != 18402)
	//*  11   24:iload_1         
	//*  12   25:sipush          18402
	//*  13   28:icmpeq          187
						{
							if(i != 21419)
	//*  14   31:iload_1         
	//*  15   32:sipush          21419
	//*  16   35:icmpeq          138
							{
								if(i != 25506)
	//*  17   38:iload_1         
	//*  18   39:sipush          25506
	//*  19   42:icmpeq          112
								{
									if(i != 30322)
	//*  20   45:iload_1         
	//*  21   46:sipush          30322
	//*  22   49:icmpeq          86
									{
										extractorinput = ((ExtractorInput) (new StringBuilder()));
	//   23   52:new             #815 <Class StringBuilder>
	//   24   55:dup             
	//   25   56:invokespecial   #816 <Method void StringBuilder()>
	//   26   59:astore_3        
										((StringBuilder) (extractorinput)).append("Unexpected id: ");
	//   27   60:aload_3         
	//   28   61:ldc2            #818 <String "Unexpected id: ">
	//   29   64:invokevirtual   #822 <Method StringBuilder StringBuilder.append(String)>
	//   30   67:pop             
										((StringBuilder) (extractorinput)).append(i);
	//   31   68:aload_3         
	//   32   69:iload_1         
	//   33   70:invokevirtual   #825 <Method StringBuilder StringBuilder.append(int)>
	//   34   73:pop             
										throw new ParserException(((StringBuilder) (extractorinput)).toString());
	//   35   74:new             #721 <Class ParserException>
	//   36   77:dup             
	//   37   78:aload_3         
	//   38   79:invokevirtual   #829 <Method String StringBuilder.toString()>
	//   39   82:invokespecial   #726 <Method void ParserException(String)>
	//   40   85:athrow          
									} else
									{
										currentTrack.projectionData = new byte[j];
	//   41   86:aload_0         
	//   42   87:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   43   90:iload_2         
	//   44   91:newarray        byte[]
	//   45   93:putfield        #834 <Field byte[] MatroskaExtractor$Track.projectionData>
										extractorinput.readFully(currentTrack.projectionData, 0, j);
	//   46   96:aload_3         
	//   47   97:aload_0         
	//   48   98:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   49  101:getfield        #834 <Field byte[] MatroskaExtractor$Track.projectionData>
	//   50  104:iconst_0        
	//   51  105:iload_2         
	//   52  106:invokeinterface #679 <Method void ExtractorInput.readFully(byte[], int, int)>
										return;
	//   53  111:return          
									}
								} else
								{
									currentTrack.codecPrivate = new byte[j];
	//   54  112:aload_0         
	//   55  113:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   56  116:iload_2         
	//   57  117:newarray        byte[]
	//   58  119:putfield        #837 <Field byte[] MatroskaExtractor$Track.codecPrivate>
									extractorinput.readFully(currentTrack.codecPrivate, 0, j);
	//   59  122:aload_3         
	//   60  123:aload_0         
	//   61  124:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   62  127:getfield        #837 <Field byte[] MatroskaExtractor$Track.codecPrivate>
	//   63  130:iconst_0        
	//   64  131:iload_2         
	//   65  132:invokeinterface #679 <Method void ExtractorInput.readFully(byte[], int, int)>
									return;
	//   66  137:return          
								}
							} else
							{
								Arrays.fill(seekEntryIdBytes.data, (byte)0);
	//   67  138:aload_0         
	//   68  139:getfield        #524 <Field ParsableByteArray seekEntryIdBytes>
	//   69  142:getfield        #620 <Field byte[] ParsableByteArray.data>
	//   70  145:iconst_0        
	//   71  146:invokestatic    #841 <Method void Arrays.fill(byte[], byte)>
								extractorinput.readFully(seekEntryIdBytes.data, 4 - j, j);
	//   72  149:aload_3         
	//   73  150:aload_0         
	//   74  151:getfield        #524 <Field ParsableByteArray seekEntryIdBytes>
	//   75  154:getfield        #620 <Field byte[] ParsableByteArray.data>
	//   76  157:iconst_4        
	//   77  158:iload_2         
	//   78  159:isub            
	//   79  160:iload_2         
	//   80  161:invokeinterface #679 <Method void ExtractorInput.readFully(byte[], int, int)>
								seekEntryIdBytes.setPosition(0);
	//   81  166:aload_0         
	//   82  167:getfield        #524 <Field ParsableByteArray seekEntryIdBytes>
	//   83  170:iconst_0        
	//   84  171:invokevirtual   #774 <Method void ParsableByteArray.setPosition(int)>
								seekEntryId = (int)seekEntryIdBytes.readUnsignedInt();
	//   85  174:aload_0         
	//   86  175:aload_0         
	//   87  176:getfield        #524 <Field ParsableByteArray seekEntryIdBytes>
	//   88  179:invokevirtual   #845 <Method long ParsableByteArray.readUnsignedInt()>
	//   89  182:l2i             
	//   90  183:putfield        #847 <Field int seekEntryId>
								return;
	//   91  186:return          
							}
						} else
						{
							byte abyte0[] = new byte[j];
	//   92  187:iload_2         
	//   93  188:newarray        byte[]
	//   94  190:astore          14
							extractorinput.readFully(abyte0, 0, j);
	//   95  192:aload_3         
	//   96  193:aload           14
	//   97  195:iconst_0        
	//   98  196:iload_2         
	//   99  197:invokeinterface #679 <Method void ExtractorInput.readFully(byte[], int, int)>
							currentTrack.cryptoData = new com.google.android.exoplayer2.extractor.TrackOutput.CryptoData(1, abyte0, 0, 0);
	//  100  202:aload_0         
	//  101  203:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  102  206:new             #849 <Class com.google.android.exoplayer2.extractor.TrackOutput$CryptoData>
	//  103  209:dup             
	//  104  210:iconst_1        
	//  105  211:aload           14
	//  106  213:iconst_0        
	//  107  214:iconst_0        
	//  108  215:invokespecial   #852 <Method void com.google.android.exoplayer2.extractor.TrackOutput$CryptoData(int, byte[], int, int)>
	//  109  218:putfield        #607 <Field com.google.android.exoplayer2.extractor.TrackOutput$CryptoData MatroskaExtractor$Track.cryptoData>
							return;
	//  110  221:return          
						}
					} else
					{
						currentTrack.sampleStrippedBytes = new byte[j];
	//  111  222:aload_0         
	//  112  223:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  113  226:iload_2         
	//  114  227:newarray        byte[]
	//  115  229:putfield        #794 <Field byte[] MatroskaExtractor$Track.sampleStrippedBytes>
						extractorinput.readFully(currentTrack.sampleStrippedBytes, 0, j);
	//  116  232:aload_3         
	//  117  233:aload_0         
	//  118  234:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  119  237:getfield        #794 <Field byte[] MatroskaExtractor$Track.sampleStrippedBytes>
	//  120  240:iconst_0        
	//  121  241:iload_2         
	//  122  242:invokeinterface #679 <Method void ExtractorInput.readFully(byte[], int, int)>
						return;
	//  123  247:return          
					}
				if(blockState == 0)
	//* 124  248:aload_0         
	//* 125  249:getfield        #854 <Field int blockState>
	//* 126  252:ifne            302
				{
					blockTrackNumber = (int)varintReader.readUnsignedVarint(extractorinput, false, true, 8);
	//  127  255:aload_0         
	//  128  256:aload_0         
	//  129  257:getfield        #494 <Field VarintReader varintReader>
	//  130  260:aload_3         
	//  131  261:iconst_0        
	//  132  262:iconst_1        
	//  133  263:bipush          8
	//  134  265:invokevirtual   #858 <Method long VarintReader.readUnsignedVarint(ExtractorInput, boolean, boolean, int)>
	//  135  268:l2i             
	//  136  269:putfield        #860 <Field int blockTrackNumber>
					blockTrackNumberLength = varintReader.getLastLength();
	//  137  272:aload_0         
	//  138  273:aload_0         
	//  139  274:getfield        #494 <Field VarintReader varintReader>
	//  140  277:invokevirtual   #863 <Method int VarintReader.getLastLength()>
	//  141  280:putfield        #865 <Field int blockTrackNumberLength>
					blockDurationUs = 0x1L;
	//  142  283:aload_0         
	//  143  284:ldc2w           #463 <Long 0x1L>
	//  144  287:putfield        #622 <Field long blockDurationUs>
					blockState = 1;
	//  145  290:aload_0         
	//  146  291:iconst_1        
	//  147  292:putfield        #854 <Field int blockState>
					scratch.reset();
	//  148  295:aload_0         
	//  149  296:getfield        #504 <Field ParsableByteArray scratch>
	//  150  299:invokevirtual   #717 <Method void ParsableByteArray.reset()>
				}
				track = (Track)tracks.get(blockTrackNumber);
	//  151  302:aload_0         
	//  152  303:getfield        #499 <Field SparseArray tracks>
	//  153  306:aload_0         
	//  154  307:getfield        #860 <Field int blockTrackNumber>
	//  155  310:invokevirtual   #868 <Method Object SparseArray.get(int)>
	//  156  313:checkcast       #16  <Class MatroskaExtractor$Track>
	//  157  316:astore          14
				if(track == null)
	//* 158  318:aload           14
	//* 159  320:ifnonnull       341
				{
					extractorinput.skipFully(j - blockTrackNumberLength);
	//  160  323:aload_3         
	//  161  324:iload_2         
	//  162  325:aload_0         
	//  163  326:getfield        #865 <Field int blockTrackNumberLength>
	//  164  329:isub            
	//  165  330:invokeinterface #871 <Method void ExtractorInput.skipFully(int)>
					blockState = 0;
	//  166  335:aload_0         
	//  167  336:iconst_0        
	//  168  337:putfield        #854 <Field int blockState>
					return;
	//  169  340:return          
				}
				if(blockState != 1)
					break label0;
	//  170  341:aload_0         
	//  171  342:getfield        #854 <Field int blockState>
	//  172  345:iconst_1        
	//  173  346:icmpne          1210
				readScratch(extractorinput, 3);
	//  174  349:aload_0         
	//  175  350:aload_3         
	//  176  351:iconst_3        
	//  177  352:invokespecial   #873 <Method void readScratch(ExtractorInput, int)>
				l = (scratch.data[2] & 6) >> 1;
	//  178  355:aload_0         
	//  179  356:getfield        #504 <Field ParsableByteArray scratch>
	//  180  359:getfield        #620 <Field byte[] ParsableByteArray.data>
	//  181  362:iconst_2        
	//  182  363:baload          
	//  183  364:bipush          6
	//  184  366:iand            
	//  185  367:iconst_1        
	//  186  368:ishr            
	//  187  369:istore          5
				if(l == 0)
	//* 188  371:iload           5
	//* 189  373:ifne            410
				{
					blockLacingSampleCount = 1;
	//  190  376:aload_0         
	//  191  377:iconst_1        
	//  192  378:putfield        #875 <Field int blockLacingSampleCount>
					blockLacingSampleSizes = ensureArrayCapacity(blockLacingSampleSizes, 1);
	//  193  381:aload_0         
	//  194  382:aload_0         
	//  195  383:getfield        #877 <Field int[] blockLacingSampleSizes>
	//  196  386:iconst_1        
	//  197  387:invokestatic    #879 <Method int[] ensureArrayCapacity(int[], int)>
	//  198  390:putfield        #877 <Field int[] blockLacingSampleSizes>
					blockLacingSampleSizes[0] = j - blockTrackNumberLength - 3;
	//  199  393:aload_0         
	//  200  394:getfield        #877 <Field int[] blockLacingSampleSizes>
	//  201  397:iconst_0        
	//  202  398:iload_2         
	//  203  399:aload_0         
	//  204  400:getfield        #865 <Field int blockTrackNumberLength>
	//  205  403:isub            
	//  206  404:iconst_3        
	//  207  405:isub            
	//  208  406:iastore         
				} else
	//* 209  407:goto            1021
				{
					if(i != 163)
	//* 210  410:iload_1         
	//* 211  411:sipush          163
	//* 212  414:icmpeq          428
						throw new ParserException("Lacing only supported in SimpleBlocks.");
	//  213  417:new             #721 <Class ParserException>
	//  214  420:dup             
	//  215  421:ldc2            #881 <String "Lacing only supported in SimpleBlocks.">
	//  216  424:invokespecial   #726 <Method void ParserException(String)>
	//  217  427:athrow          
					readScratch(extractorinput, 4);
	//  218  428:aload_0         
	//  219  429:aload_3         
	//  220  430:iconst_4        
	//  221  431:invokespecial   #873 <Method void readScratch(ExtractorInput, int)>
					blockLacingSampleCount = (scratch.data[3] & 0xff) + 1;
	//  222  434:aload_0         
	//  223  435:aload_0         
	//  224  436:getfield        #504 <Field ParsableByteArray scratch>
	//  225  439:getfield        #620 <Field byte[] ParsableByteArray.data>
	//  226  442:iconst_3        
	//  227  443:baload          
	//  228  444:sipush          255
	//  229  447:iand            
	//  230  448:iconst_1        
	//  231  449:iadd            
	//  232  450:putfield        #875 <Field int blockLacingSampleCount>
					blockLacingSampleSizes = ensureArrayCapacity(blockLacingSampleSizes, blockLacingSampleCount);
	//  233  453:aload_0         
	//  234  454:aload_0         
	//  235  455:getfield        #877 <Field int[] blockLacingSampleSizes>
	//  236  458:aload_0         
	//  237  459:getfield        #875 <Field int blockLacingSampleCount>
	//  238  462:invokestatic    #879 <Method int[] ensureArrayCapacity(int[], int)>
	//  239  465:putfield        #877 <Field int[] blockLacingSampleSizes>
					if(l == 2)
	//* 240  468:iload           5
	//* 241  470:iconst_2        
	//* 242  471:icmpne          504
					{
						j = (j - blockTrackNumberLength - 4) / blockLacingSampleCount;
	//  243  474:iload_2         
	//  244  475:aload_0         
	//  245  476:getfield        #865 <Field int blockTrackNumberLength>
	//  246  479:isub            
	//  247  480:iconst_4        
	//  248  481:isub            
	//  249  482:aload_0         
	//  250  483:getfield        #875 <Field int blockLacingSampleCount>
	//  251  486:idiv            
	//  252  487:istore_2        
						Arrays.fill(blockLacingSampleSizes, 0, blockLacingSampleCount, j);
	//  253  488:aload_0         
	//  254  489:getfield        #877 <Field int[] blockLacingSampleSizes>
	//  255  492:iconst_0        
	//  256  493:aload_0         
	//  257  494:getfield        #875 <Field int blockLacingSampleCount>
	//  258  497:iload_2         
	//  259  498:invokestatic    #884 <Method void Arrays.fill(int[], int, int, int)>
					} else
	//* 260  501:goto            1021
					if(l == 1)
	//* 261  504:iload           5
	//* 262  506:iconst_1        
	//* 263  507:icmpne          649
					{
						int i1 = 0;
	//  264  510:iconst_0        
	//  265  511:istore          6
						l = i1;
	//  266  513:iload           6
	//  267  515:istore          5
						for(; i1 < blockLacingSampleCount - 1; i1++)
	//* 268  517:iload           6
	//* 269  519:aload_0         
	//* 270  520:getfield        #875 <Field int blockLacingSampleCount>
	//* 271  523:iconst_1        
	//* 272  524:isub            
	//* 273  525:icmpge          623
						{
							blockLacingSampleSizes[i1] = 0;
	//  274  528:aload_0         
	//  275  529:getfield        #877 <Field int[] blockLacingSampleSizes>
	//  276  532:iload           6
	//  277  534:iconst_0        
	//  278  535:iastore         
							int k1 = k;
	//  279  536:iload           4
	//  280  538:istore          7
							int j2;
							do
							{
								k = k1 + 1;
	//  281  540:iload           7
	//  282  542:iconst_1        
	//  283  543:iadd            
	//  284  544:istore          4
								readScratch(extractorinput, k);
	//  285  546:aload_0         
	//  286  547:aload_3         
	//  287  548:iload           4
	//  288  550:invokespecial   #873 <Method void readScratch(ExtractorInput, int)>
								j2 = scratch.data[k - 1] & 0xff;
	//  289  553:aload_0         
	//  290  554:getfield        #504 <Field ParsableByteArray scratch>
	//  291  557:getfield        #620 <Field byte[] ParsableByteArray.data>
	//  292  560:iload           4
	//  293  562:iconst_1        
	//  294  563:isub            
	//  295  564:baload          
	//  296  565:sipush          255
	//  297  568:iand            
	//  298  569:istore          8
								int ai[] = blockLacingSampleSizes;
	//  299  571:aload_0         
	//  300  572:getfield        #877 <Field int[] blockLacingSampleSizes>
	//  301  575:astore          15
								ai[i1] = ai[i1] + j2;
	//  302  577:aload           15
	//  303  579:iload           6
	//  304  581:aload           15
	//  305  583:iload           6
	//  306  585:iaload          
	//  307  586:iload           8
	//  308  588:iadd            
	//  309  589:iastore         
								k1 = k;
	//  310  590:iload           4
	//  311  592:istore          7
							} while(j2 == 255);
	//  312  594:iload           8
	//  313  596:sipush          255
	//  314  599:icmpeq          540
							l += blockLacingSampleSizes[i1];
	//  315  602:iload           5
	//  316  604:aload_0         
	//  317  605:getfield        #877 <Field int[] blockLacingSampleSizes>
	//  318  608:iload           6
	//  319  610:iaload          
	//  320  611:iadd            
	//  321  612:istore          5
						}

	//  322  614:iload           6
	//  323  616:iconst_1        
	//  324  617:iadd            
	//  325  618:istore          6
	//* 326  620:goto            517
						blockLacingSampleSizes[blockLacingSampleCount - 1] = j - blockTrackNumberLength - k - l;
	//  327  623:aload_0         
	//  328  624:getfield        #877 <Field int[] blockLacingSampleSizes>
	//  329  627:aload_0         
	//  330  628:getfield        #875 <Field int blockLacingSampleCount>
	//  331  631:iconst_1        
	//  332  632:isub            
	//  333  633:iload_2         
	//  334  634:aload_0         
	//  335  635:getfield        #865 <Field int blockTrackNumberLength>
	//  336  638:isub            
	//  337  639:iload           4
	//  338  641:isub            
	//  339  642:iload           5
	//  340  644:isub            
	//  341  645:iastore         
					} else
	//* 342  646:goto            1021
					{
						if(l != 3)
							break label1;
	//  343  649:iload           5
	//  344  651:iconst_3        
	//  345  652:icmpne          1175
						int j1 = 0;
	//  346  655:iconst_0        
	//  347  656:istore          6
						l = j1;
	//  348  658:iload           6
	//  349  660:istore          5
						while(j1 < blockLacingSampleCount - 1) 
	//* 350  662:iload           6
	//* 351  664:aload_0         
	//* 352  665:getfield        #875 <Field int blockLacingSampleCount>
	//* 353  668:iconst_1        
	//* 354  669:isub            
	//* 355  670:icmpge          998
						{
							blockLacingSampleSizes[j1] = 0;
	//  356  673:aload_0         
	//  357  674:getfield        #877 <Field int[] blockLacingSampleSizes>
	//  358  677:iload           6
	//  359  679:iconst_0        
	//  360  680:iastore         
							int k2 = k + 1;
	//  361  681:iload           4
	//  362  683:iconst_1        
	//  363  684:iadd            
	//  364  685:istore          8
							readScratch(extractorinput, k2);
	//  365  687:aload_0         
	//  366  688:aload_3         
	//  367  689:iload           8
	//  368  691:invokespecial   #873 <Method void readScratch(ExtractorInput, int)>
							byte abyte1[] = scratch.data;
	//  369  694:aload_0         
	//  370  695:getfield        #504 <Field ParsableByteArray scratch>
	//  371  698:getfield        #620 <Field byte[] ParsableByteArray.data>
	//  372  701:astore          15
							int l2 = k2 - 1;
	//  373  703:iload           8
	//  374  705:iconst_1        
	//  375  706:isub            
	//  376  707:istore          9
							if(abyte1[l2] == 0)
	//* 377  709:aload           15
	//* 378  711:iload           9
	//* 379  713:baload          
	//* 380  714:ifne            728
								throw new ParserException("No valid varint length mask found");
	//  381  717:new             #721 <Class ParserException>
	//  382  720:dup             
	//  383  721:ldc2            #886 <String "No valid varint length mask found">
	//  384  724:invokespecial   #726 <Method void ParserException(String)>
	//  385  727:athrow          
							long l3 = 0L;
	//  386  728:lconst_0        
	//  387  729:lstore          10
							int l1 = 0;
	//  388  731:iconst_0        
	//  389  732:istore          7
							long l5;
							do
							{
								k = k2;
	//  390  734:iload           8
	//  391  736:istore          4
								l5 = l3;
	//  392  738:lload           10
	//  393  740:lstore          12
								if(l1 >= 8)
									break;
	//  394  742:iload           7
	//  395  744:bipush          8
	//  396  746:icmpge          905
								k = 1 << 7 - l1;
	//  397  749:iconst_1        
	//  398  750:bipush          7
	//  399  752:iload           7
	//  400  754:isub            
	//  401  755:ishl            
	//  402  756:istore          4
								if((scratch.data[l2] & k) != 0)
	//* 403  758:aload_0         
	//* 404  759:getfield        #504 <Field ParsableByteArray scratch>
	//* 405  762:getfield        #620 <Field byte[] ParsableByteArray.data>
	//* 406  765:iload           9
	//* 407  767:baload          
	//* 408  768:iload           4
	//* 409  770:iand            
	//* 410  771:ifeq            896
								{
									k2 += l1;
	//  411  774:iload           8
	//  412  776:iload           7
	//  413  778:iadd            
	//  414  779:istore          8
									readScratch(extractorinput, k2);
	//  415  781:aload_0         
	//  416  782:aload_3         
	//  417  783:iload           8
	//  418  785:invokespecial   #873 <Method void readScratch(ExtractorInput, int)>
									long l4 = scratch.data[l2] & 0xff & ~k;
	//  419  788:aload_0         
	//  420  789:getfield        #504 <Field ParsableByteArray scratch>
	//  421  792:getfield        #620 <Field byte[] ParsableByteArray.data>
	//  422  795:iload           9
	//  423  797:baload          
	//  424  798:sipush          255
	//  425  801:iand            
	//  426  802:iload           4
	//  427  804:iconst_m1       
	//  428  805:ixor            
	//  429  806:iand            
	//  430  807:i2l             
	//  431  808:lstore          10
									for(k = l2 + 1; k < k2;)
	//* 432  810:iload           9
	//* 433  812:iconst_1        
	//* 434  813:iadd            
	//* 435  814:istore          4
	//* 436  816:iload           4
	//* 437  818:iload           8
	//* 438  820:icmpge          859
									{
										l5 = scratch.data[k] & 0xff;
	//  439  823:aload_0         
	//  440  824:getfield        #504 <Field ParsableByteArray scratch>
	//  441  827:getfield        #620 <Field byte[] ParsableByteArray.data>
	//  442  830:iload           4
	//  443  832:baload          
	//  444  833:sipush          255
	//  445  836:iand            
	//  446  837:i2l             
	//  447  838:lstore          12
										k++;
	//  448  840:iload           4
	//  449  842:iconst_1        
	//  450  843:iadd            
	//  451  844:istore          4
										l4 = l4 << 8 | l5;
	//  452  846:lload           10
	//  453  848:bipush          8
	//  454  850:lshl            
	//  455  851:lload           12
	//  456  853:lor             
	//  457  854:lstore          10
									}

	//* 458  856:goto            816
									k = k2;
	//  459  859:iload           8
	//  460  861:istore          4
									l5 = l4;
	//  461  863:lload           10
	//  462  865:lstore          12
									if(j1 > 0)
	//* 463  867:iload           6
	//* 464  869:ifle            905
									{
										l5 = l4 - ((1L << l1 * 7 + 6) - 1L);
	//  465  872:lload           10
	//  466  874:lconst_1        
	//  467  875:iload           7
	//  468  877:bipush          7
	//  469  879:imul            
	//  470  880:bipush          6
	//  471  882:iadd            
	//  472  883:lshl            
	//  473  884:lconst_1        
	//  474  885:lsub            
	//  475  886:lsub            
	//  476  887:lstore          12
										k = k2;
	//  477  889:iload           8
	//  478  891:istore          4
									}
									break;
	//  479  893:goto            905
								}
								l1++;
	//  480  896:iload           7
	//  481  898:iconst_1        
	//  482  899:iadd            
	//  483  900:istore          7
							} while(true);
	//  484  902:goto            734
							if(l5 >= 0x80000000L && l5 <= 0x7fffffffL)
	//* 485  905:lload           12
	//* 486  907:ldc2w           #887 <Long 0x80000000L>
	//* 487  910:lcmp            
	//* 488  911:iflt            987
	//* 489  914:lload           12
	//* 490  916:ldc2w           #889 <Long 0x7fffffffL>
	//* 491  919:lcmp            
	//* 492  920:ifle            926
	//* 493  923:goto            987
							{
								int i2 = (int)l5;
	//  494  926:lload           12
	//  495  928:l2i             
	//  496  929:istore          7
								int ai1[] = blockLacingSampleSizes;
	//  497  931:aload_0         
	//  498  932:getfield        #877 <Field int[] blockLacingSampleSizes>
	//  499  935:astore          15
								if(j1 != 0)
	//* 500  937:iload           6
	//* 501  939:ifne            945
	//* 502  942:goto            959
									i2 += blockLacingSampleSizes[j1 - 1];
	//  503  945:iload           7
	//  504  947:aload_0         
	//  505  948:getfield        #877 <Field int[] blockLacingSampleSizes>
	//  506  951:iload           6
	//  507  953:iconst_1        
	//  508  954:isub            
	//  509  955:iaload          
	//  510  956:iadd            
	//  511  957:istore          7
								ai1[j1] = i2;
	//  512  959:aload           15
	//  513  961:iload           6
	//  514  963:iload           7
	//  515  965:iastore         
								l += blockLacingSampleSizes[j1];
	//  516  966:iload           5
	//  517  968:aload_0         
	//  518  969:getfield        #877 <Field int[] blockLacingSampleSizes>
	//  519  972:iload           6
	//  520  974:iaload          
	//  521  975:iadd            
	//  522  976:istore          5
								j1++;
	//  523  978:iload           6
	//  524  980:iconst_1        
	//  525  981:iadd            
	//  526  982:istore          6
							} else
	//* 527  984:goto            662
							{
								throw new ParserException("EBML lacing sample size out of range.");
	//  528  987:new             #721 <Class ParserException>
	//  529  990:dup             
	//  530  991:ldc2            #892 <String "EBML lacing sample size out of range.">
	//  531  994:invokespecial   #726 <Method void ParserException(String)>
	//  532  997:athrow          
							}
						}
						blockLacingSampleSizes[blockLacingSampleCount - 1] = j - blockTrackNumberLength - k - l;
	//  533  998:aload_0         
	//  534  999:getfield        #877 <Field int[] blockLacingSampleSizes>
	//  535 1002:aload_0         
	//  536 1003:getfield        #875 <Field int blockLacingSampleCount>
	//  537 1006:iconst_1        
	//  538 1007:isub            
	//  539 1008:iload_2         
	//  540 1009:aload_0         
	//  541 1010:getfield        #865 <Field int blockTrackNumberLength>
	//  542 1013:isub            
	//  543 1014:iload           4
	//  544 1016:isub            
	//  545 1017:iload           5
	//  546 1019:isub            
	//  547 1020:iastore         
					}
				}
				j = ((int) (scratch.data[0]));
	//  548 1021:aload_0         
	//  549 1022:getfield        #504 <Field ParsableByteArray scratch>
	//  550 1025:getfield        #620 <Field byte[] ParsableByteArray.data>
	//  551 1028:iconst_0        
	//  552 1029:baload          
	//  553 1030:istore_2        
				k = ((int) (scratch.data[1]));
	//  554 1031:aload_0         
	//  555 1032:getfield        #504 <Field ParsableByteArray scratch>
	//  556 1035:getfield        #620 <Field byte[] ParsableByteArray.data>
	//  557 1038:iconst_1        
	//  558 1039:baload          
	//  559 1040:istore          4
				blockTimeUs = clusterTimecodeUs + scaleTimecodeToUs(j << 8 | k & 0xff);
	//  560 1042:aload_0         
	//  561 1043:aload_0         
	//  562 1044:getfield        #476 <Field long clusterTimecodeUs>
	//  563 1047:aload_0         
	//  564 1048:iload_2         
	//  565 1049:bipush          8
	//  566 1051:ishl            
	//  567 1052:iload           4
	//  568 1054:sipush          255
	//  569 1057:iand            
	//  570 1058:ior             
	//  571 1059:i2l             
	//  572 1060:invokespecial   #894 <Method long scaleTimecodeToUs(long)>
	//  573 1063:ladd            
	//  574 1064:putfield        #896 <Field long blockTimeUs>
				boolean flag;
				if((scratch.data[2] & 8) == 8)
	//* 575 1067:aload_0         
	//* 576 1068:getfield        #504 <Field ParsableByteArray scratch>
	//* 577 1071:getfield        #620 <Field byte[] ParsableByteArray.data>
	//* 578 1074:iconst_2        
	//* 579 1075:baload          
	//* 580 1076:bipush          8
	//* 581 1078:iand            
	//* 582 1079:bipush          8
	//* 583 1081:icmpne          1090
					flag = true;
	//  584 1084:iconst_1        
	//  585 1085:istore          4
				else
	//* 586 1087:goto            1093
					flag = false;
	//  587 1090:iconst_0        
	//  588 1091:istore          4
				if(track.type != 2 && (i != 163 || (scratch.data[2] & 0x80) != 128))
	//* 589 1093:aload           14
	//* 590 1095:getfield        #899 <Field int MatroskaExtractor$Track.type>
	//* 591 1098:iconst_2        
	//* 592 1099:icmpeq          1136
	//* 593 1102:iload_1         
	//* 594 1103:sipush          163
	//* 595 1106:icmpne          1131
	//* 596 1109:aload_0         
	//* 597 1110:getfield        #504 <Field ParsableByteArray scratch>
	//* 598 1113:getfield        #620 <Field byte[] ParsableByteArray.data>
	//* 599 1116:iconst_2        
	//* 600 1117:baload          
	//* 601 1118:sipush          128
	//* 602 1121:iand            
	//* 603 1122:sipush          128
	//* 604 1125:icmpne          1131
	//* 605 1128:goto            1136
					j = 0;
	//  606 1131:iconst_0        
	//  607 1132:istore_2        
				else
	//* 608 1133:goto            1138
					j = 1;
	//  609 1136:iconst_1        
	//  610 1137:istore_2        
				if(flag)
	//* 611 1138:iload           4
	//* 612 1140:ifeq            1151
					flag = 0x80000000;
	//  613 1143:ldc2            #900 <Int 0x80000000>
	//  614 1146:istore          4
				else
	//* 615 1148:goto            1154
					flag = false;
	//  616 1151:iconst_0        
	//  617 1152:istore          4
				blockFlags = j | flag;
	//  618 1154:aload_0         
	//  619 1155:iload_2         
	//  620 1156:iload           4
	//  621 1158:ior             
	//  622 1159:putfield        #601 <Field int blockFlags>
				blockState = 2;
	//  623 1162:aload_0         
	//  624 1163:iconst_2        
	//  625 1164:putfield        #854 <Field int blockState>
				blockLacingSampleIndex = 0;
	//  626 1167:aload_0         
	//  627 1168:iconst_0        
	//  628 1169:putfield        #902 <Field int blockLacingSampleIndex>
				break label0;
	//  629 1172:goto            1210
			}
			extractorinput = ((ExtractorInput) (new StringBuilder()));
	//  630 1175:new             #815 <Class StringBuilder>
	//  631 1178:dup             
	//  632 1179:invokespecial   #816 <Method void StringBuilder()>
	//  633 1182:astore_3        
			((StringBuilder) (extractorinput)).append("Unexpected lacing value: ");
	//  634 1183:aload_3         
	//  635 1184:ldc2            #904 <String "Unexpected lacing value: ">
	//  636 1187:invokevirtual   #822 <Method StringBuilder StringBuilder.append(String)>
	//  637 1190:pop             
			((StringBuilder) (extractorinput)).append(l);
	//  638 1191:aload_3         
	//  639 1192:iload           5
	//  640 1194:invokevirtual   #825 <Method StringBuilder StringBuilder.append(int)>
	//  641 1197:pop             
			throw new ParserException(((StringBuilder) (extractorinput)).toString());
	//  642 1198:new             #721 <Class ParserException>
	//  643 1201:dup             
	//  644 1202:aload_3         
	//  645 1203:invokevirtual   #829 <Method String StringBuilder.toString()>
	//  646 1206:invokespecial   #726 <Method void ParserException(String)>
	//  647 1209:athrow          
		}
		if(i == 163)
	//* 648 1210:iload_1         
	//* 649 1211:sipush          163
	//* 650 1214:icmpne          1289
		{
			for(; blockLacingSampleIndex < blockLacingSampleCount; blockLacingSampleIndex = blockLacingSampleIndex + 1)
	//* 651 1217:aload_0         
	//* 652 1218:getfield        #902 <Field int blockLacingSampleIndex>
	//* 653 1221:aload_0         
	//* 654 1222:getfield        #875 <Field int blockLacingSampleCount>
	//* 655 1225:icmpge          1283
			{
				writeSampleData(extractorinput, track, blockLacingSampleSizes[blockLacingSampleIndex]);
	//  656 1228:aload_0         
	//  657 1229:aload_3         
	//  658 1230:aload           14
	//  659 1232:aload_0         
	//  660 1233:getfield        #877 <Field int[] blockLacingSampleSizes>
	//  661 1236:aload_0         
	//  662 1237:getfield        #902 <Field int blockLacingSampleIndex>
	//  663 1240:iaload          
	//  664 1241:invokespecial   #906 <Method void writeSampleData(ExtractorInput, MatroskaExtractor$Track, int)>
				commitSampleToOutput(track, blockTimeUs + (long)((blockLacingSampleIndex * track.defaultSampleDurationNs) / 1000));
	//  665 1244:aload_0         
	//  666 1245:aload           14
	//  667 1247:aload_0         
	//  668 1248:getfield        #896 <Field long blockTimeUs>
	//  669 1251:aload_0         
	//  670 1252:getfield        #902 <Field int blockLacingSampleIndex>
	//  671 1255:aload           14
	//  672 1257:getfield        #909 <Field int MatroskaExtractor$Track.defaultSampleDurationNs>
	//  673 1260:imul            
	//  674 1261:sipush          1000
	//  675 1264:idiv            
	//  676 1265:i2l             
	//  677 1266:ladd            
	//  678 1267:invokespecial   #911 <Method void commitSampleToOutput(MatroskaExtractor$Track, long)>
			}

	//  679 1270:aload_0         
	//  680 1271:aload_0         
	//  681 1272:getfield        #902 <Field int blockLacingSampleIndex>
	//  682 1275:iconst_1        
	//  683 1276:iadd            
	//  684 1277:putfield        #902 <Field int blockLacingSampleIndex>
	//* 685 1280:goto            1217
			blockState = 0;
	//  686 1283:aload_0         
	//  687 1284:iconst_0        
	//  688 1285:putfield        #854 <Field int blockState>
			return;
	//  689 1288:return          
		} else
		{
			writeSampleData(extractorinput, track, blockLacingSampleSizes[0]);
	//  690 1289:aload_0         
	//  691 1290:aload_3         
	//  692 1291:aload           14
	//  693 1293:aload_0         
	//  694 1294:getfield        #877 <Field int[] blockLacingSampleSizes>
	//  695 1297:iconst_0        
	//  696 1298:iaload          
	//  697 1299:invokespecial   #906 <Method void writeSampleData(ExtractorInput, MatroskaExtractor$Track, int)>
			return;
	//  698 1302:return          
		}
	}

	void endMasterElement(int i)
		throws ParserException
	{
		if(i != 160)
	//*   0    0:iload_1         
	//*   1    1:sipush          160
	//*   2    4:icmpeq          367
		{
			if(i != 174)
	//*   3    7:iload_1         
	//*   4    8:sipush          174
	//*   5   11:icmpeq          312
			{
				if(i != 19899)
	//*   6   14:iload_1         
	//*   7   15:sipush          19899
	//*   8   18:icmpeq          261
				{
					if(i != 25152)
	//*   9   21:iload_1         
	//*  10   22:sipush          25152
	//*  11   25:icmpeq          185
					{
						if(i != 28032)
	//*  12   28:iload_1         
	//*  13   29:sipush          28032
	//*  14   32:icmpeq          154
						{
							if(i != 0x1549a966)
	//*  15   35:iload_1         
	//*  16   36:ldc1            #216 <Int 0x1549a966>
	//*  17   38:icmpeq          112
							{
								if(i != 0x1654ae6b)
	//*  18   41:iload_1         
	//*  19   42:ldc2            #275 <Int 0x1654ae6b>
	//*  20   45:icmpeq          81
								{
									if(i != 0x1c53bb6b)
	//*  21   48:iload_1         
	//*  22   49:ldc1            #184 <Int 0x1c53bb6b>
	//*  23   51:icmpeq          55
										return;
	//   24   54:return          
									if(!sentSeekMap)
	//*  25   55:aload_0         
	//*  26   56:getfield        #654 <Field boolean sentSeekMap>
	//*  27   59:ifne            420
									{
										extractorOutput.seekMap(buildSeekMap());
	//   28   62:aload_0         
	//   29   63:getfield        #914 <Field ExtractorOutput extractorOutput>
	//   30   66:aload_0         
	//   31   67:invokespecial   #916 <Method SeekMap buildSeekMap()>
	//   32   70:invokeinterface #922 <Method void ExtractorOutput.seekMap(SeekMap)>
										sentSeekMap = true;
	//   33   75:aload_0         
	//   34   76:iconst_1        
	//   35   77:putfield        #654 <Field boolean sentSeekMap>
										return;
	//   36   80:return          
									}
								} else
								if(tracks.size() == 0)
	//*  37   81:aload_0         
	//*  38   82:getfield        #499 <Field SparseArray tracks>
	//*  39   85:invokevirtual   #923 <Method int SparseArray.size()>
	//*  40   88:ifne            102
								{
									throw new ParserException("No valid tracks were found");
	//   41   91:new             #721 <Class ParserException>
	//   42   94:dup             
	//   43   95:ldc2            #925 <String "No valid tracks were found">
	//   44   98:invokespecial   #726 <Method void ParserException(String)>
	//   45  101:athrow          
								} else
								{
									extractorOutput.endTracks();
	//   46  102:aload_0         
	//   47  103:getfield        #914 <Field ExtractorOutput extractorOutput>
	//   48  106:invokeinterface #928 <Method void ExtractorOutput.endTracks()>
									return;
	//   49  111:return          
								}
							} else
							{
								if(timecodeScale == 0x1L)
	//*  50  112:aload_0         
	//*  51  113:getfield        #466 <Field long timecodeScale>
	//*  52  116:ldc2w           #463 <Long 0x1L>
	//*  53  119:lcmp            
	//*  54  120:ifne            130
									timecodeScale = 0xf4240L;
	//   55  123:aload_0         
	//   56  124:ldc2w           #733 <Long 0xf4240L>
	//   57  127:putfield        #466 <Field long timecodeScale>
								if(durationTimecode != 0x1L)
	//*  58  130:aload_0         
	//*  59  131:getfield        #468 <Field long durationTimecode>
	//*  60  134:ldc2w           #463 <Long 0x1L>
	//*  61  137:lcmp            
	//*  62  138:ifeq            420
								{
									durationUs = scaleTimecodeToUs(durationTimecode);
	//   63  141:aload_0         
	//   64  142:aload_0         
	//   65  143:aload_0         
	//   66  144:getfield        #468 <Field long durationTimecode>
	//   67  147:invokespecial   #894 <Method long scaleTimecodeToUs(long)>
	//   68  150:putfield        #470 <Field long durationUs>
									return;
	//   69  153:return          
								}
							}
						} else
						if(currentTrack.hasContentEncryption && currentTrack.sampleStrippedBytes != null)
	//*  70  154:aload_0         
	//*  71  155:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//*  72  158:getfield        #767 <Field boolean MatroskaExtractor$Track.hasContentEncryption>
	//*  73  161:ifeq            420
	//*  74  164:aload_0         
	//*  75  165:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//*  76  168:getfield        #794 <Field byte[] MatroskaExtractor$Track.sampleStrippedBytes>
	//*  77  171:ifnull          420
							throw new ParserException("Combining encryption and compression is not supported");
	//   78  174:new             #721 <Class ParserException>
	//   79  177:dup             
	//   80  178:ldc2            #930 <String "Combining encryption and compression is not supported">
	//   81  181:invokespecial   #726 <Method void ParserException(String)>
	//   82  184:athrow          
					} else
					if(currentTrack.hasContentEncryption)
	//*  83  185:aload_0         
	//*  84  186:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//*  85  189:getfield        #767 <Field boolean MatroskaExtractor$Track.hasContentEncryption>
	//*  86  192:ifeq            420
						if(currentTrack.cryptoData == null)
	//*  87  195:aload_0         
	//*  88  196:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//*  89  199:getfield        #607 <Field com.google.android.exoplayer2.extractor.TrackOutput$CryptoData MatroskaExtractor$Track.cryptoData>
	//*  90  202:ifnonnull       216
						{
							throw new ParserException("Encrypted Track found but ContentEncKeyID was not found");
	//   91  205:new             #721 <Class ParserException>
	//   92  208:dup             
	//   93  209:ldc2            #932 <String "Encrypted Track found but ContentEncKeyID was not found">
	//   94  212:invokespecial   #726 <Method void ParserException(String)>
	//   95  215:athrow          
						} else
						{
							currentTrack.drmInitData = new DrmInitData(new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[] {
								new com.google.android.exoplayer2.drm.DrmInitData.SchemeData(C.UUID_NIL, "video/webm", currentTrack.cryptoData.encryptionKey)
							});
	//   96  216:aload_0         
	//   97  217:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   98  220:new             #934 <Class DrmInitData>
	//   99  223:dup             
	//  100  224:iconst_1        
	//  101  225:anewarray       com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]
	//  102  228:dup             
	//  103  229:iconst_0        
	//  104  230:new             #936 <Class com.google.android.exoplayer2.drm.DrmInitData$SchemeData>
	//  105  233:dup             
	//  106  234:getstatic       #941 <Field UUID C.UUID_NIL>
	//  107  237:ldc2            #943 <String "video/webm">
	//  108  240:aload_0         
	//  109  241:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  110  244:getfield        #607 <Field com.google.android.exoplayer2.extractor.TrackOutput$CryptoData MatroskaExtractor$Track.cryptoData>
	//  111  247:getfield        #946 <Field byte[] com.google.android.exoplayer2.extractor.TrackOutput$CryptoData.encryptionKey>
	//  112  250:invokespecial   #949 <Method void com.google.android.exoplayer2.drm.DrmInitData$SchemeData(UUID, String, byte[])>
	//  113  253:aastore         
	//  114  254:invokespecial   #952 <Method void DrmInitData(com.google.android.exoplayer2.drm.DrmInitData$SchemeData[])>
	//  115  257:putfield        #956 <Field DrmInitData MatroskaExtractor$Track.drmInitData>
							return;
	//  116  260:return          
						}
				} else
				if(seekEntryId != -1 && seekEntryPosition != -1L)
	//* 117  261:aload_0         
	//* 118  262:getfield        #847 <Field int seekEntryId>
	//* 119  265:iconst_m1       
	//* 120  266:icmpeq          301
	//* 121  269:aload_0         
	//* 122  270:getfield        #958 <Field long seekEntryPosition>
	//* 123  273:ldc2w           #459 <Long -1L>
	//* 124  276:lcmp            
	//* 125  277:ifne            283
	//* 126  280:goto            301
				{
					if(seekEntryId == 0x1c53bb6b)
	//* 127  283:aload_0         
	//* 128  284:getfield        #847 <Field int seekEntryId>
	//* 129  287:ldc1            #184 <Int 0x1c53bb6b>
	//* 130  289:icmpne          420
					{
						cuesContentPosition = seekEntryPosition;
	//  131  292:aload_0         
	//  132  293:aload_0         
	//  133  294:getfield        #958 <Field long seekEntryPosition>
	//  134  297:putfield        #472 <Field long cuesContentPosition>
						return;
	//  135  300:return          
					}
				} else
				{
					throw new ParserException("Mandatory element SeekID or SeekPosition not found");
	//  136  301:new             #721 <Class ParserException>
	//  137  304:dup             
	//  138  305:ldc2            #960 <String "Mandatory element SeekID or SeekPosition not found">
	//  139  308:invokespecial   #726 <Method void ParserException(String)>
	//  140  311:athrow          
				}
			} else
			{
				if(isCodecSupported(currentTrack.codecId))
	//* 141  312:aload_0         
	//* 142  313:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//* 143  316:getfield        #585 <Field String MatroskaExtractor$Track.codecId>
	//* 144  319:invokestatic    #962 <Method boolean isCodecSupported(String)>
	//* 145  322:ifeq            361
				{
					currentTrack.initializeOutput(extractorOutput, currentTrack.number);
	//  146  325:aload_0         
	//  147  326:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  148  329:aload_0         
	//  149  330:getfield        #914 <Field ExtractorOutput extractorOutput>
	//  150  333:aload_0         
	//  151  334:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  152  337:getfield        #965 <Field int MatroskaExtractor$Track.number>
	//  153  340:invokevirtual   #969 <Method void MatroskaExtractor$Track.initializeOutput(ExtractorOutput, int)>
					tracks.put(currentTrack.number, ((Object) (currentTrack)));
	//  154  343:aload_0         
	//  155  344:getfield        #499 <Field SparseArray tracks>
	//  156  347:aload_0         
	//  157  348:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  158  351:getfield        #965 <Field int MatroskaExtractor$Track.number>
	//  159  354:aload_0         
	//  160  355:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  161  358:invokevirtual   #973 <Method void SparseArray.put(int, Object)>
				}
				currentTrack = null;
	//  162  361:aload_0         
	//  163  362:aconst_null     
	//  164  363:putfield        #831 <Field MatroskaExtractor$Track currentTrack>
				return;
	//  165  366:return          
			}
		} else
		{
			if(blockState != 2)
	//* 166  367:aload_0         
	//* 167  368:getfield        #854 <Field int blockState>
	//* 168  371:iconst_2        
	//* 169  372:icmpeq          376
				return;
	//  170  375:return          
			if(!sampleSeenReferenceBlock)
	//* 171  376:aload_0         
	//* 172  377:getfield        #975 <Field boolean sampleSeenReferenceBlock>
	//* 173  380:ifne            393
				blockFlags = blockFlags | 1;
	//  174  383:aload_0         
	//  175  384:aload_0         
	//  176  385:getfield        #601 <Field int blockFlags>
	//  177  388:iconst_1        
	//  178  389:ior             
	//  179  390:putfield        #601 <Field int blockFlags>
			commitSampleToOutput((Track)tracks.get(blockTrackNumber), blockTimeUs);
	//  180  393:aload_0         
	//  181  394:aload_0         
	//  182  395:getfield        #499 <Field SparseArray tracks>
	//  183  398:aload_0         
	//  184  399:getfield        #860 <Field int blockTrackNumber>
	//  185  402:invokevirtual   #868 <Method Object SparseArray.get(int)>
	//  186  405:checkcast       #16  <Class MatroskaExtractor$Track>
	//  187  408:aload_0         
	//  188  409:getfield        #896 <Field long blockTimeUs>
	//  189  412:invokespecial   #911 <Method void commitSampleToOutput(MatroskaExtractor$Track, long)>
			blockState = 0;
	//  190  415:aload_0         
	//  191  416:iconst_0        
	//  192  417:putfield        #854 <Field int blockState>
		}
	//  193  420:return          
	}

	void floatElement(int i, double d)
	{
		if(i != 181)
	//*   0    0:iload_1         
	//*   1    1:sipush          181
	//*   2    4:icmpeq          176
		{
			if(i != 17545)
	//*   3    7:iload_1         
	//*   4    8:sipush          17545
	//*   5   11:icmpeq          169
			{
				switch(i)
	//*   6   14:iload_1         
				{
	//*   7   15:tableswitch     21969 21978: default 68
	//	               21969 159
	//	               21970 149
	//	               21971 139
	//	               21972 129
	//	               21973 119
	//	               21974 109
	//	               21975 99
	//	               21976 89
	//	               21977 79
	//	               21978 69
				default:
					return;
	//    8   68:return          

				case 21978: 
					currentTrack.minMasteringLuminance = (float)d;
	//    9   69:aload_0         
	//   10   70:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   11   73:dload_2         
	//   12   74:d2f             
	//   13   75:putfield        #981 <Field float MatroskaExtractor$Track.minMasteringLuminance>
					return;
	//   14   78:return          

				case 21977: 
					currentTrack.maxMasteringLuminance = (float)d;
	//   15   79:aload_0         
	//   16   80:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   17   83:dload_2         
	//   18   84:d2f             
	//   19   85:putfield        #984 <Field float MatroskaExtractor$Track.maxMasteringLuminance>
					return;
	//   20   88:return          

				case 21976: 
					currentTrack.whitePointChromaticityY = (float)d;
	//   21   89:aload_0         
	//   22   90:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   23   93:dload_2         
	//   24   94:d2f             
	//   25   95:putfield        #987 <Field float MatroskaExtractor$Track.whitePointChromaticityY>
					return;
	//   26   98:return          

				case 21975: 
					currentTrack.whitePointChromaticityX = (float)d;
	//   27   99:aload_0         
	//   28  100:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   29  103:dload_2         
	//   30  104:d2f             
	//   31  105:putfield        #990 <Field float MatroskaExtractor$Track.whitePointChromaticityX>
					return;
	//   32  108:return          

				case 21974: 
					currentTrack.primaryBChromaticityY = (float)d;
	//   33  109:aload_0         
	//   34  110:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   35  113:dload_2         
	//   36  114:d2f             
	//   37  115:putfield        #993 <Field float MatroskaExtractor$Track.primaryBChromaticityY>
					return;
	//   38  118:return          

				case 21973: 
					currentTrack.primaryBChromaticityX = (float)d;
	//   39  119:aload_0         
	//   40  120:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   41  123:dload_2         
	//   42  124:d2f             
	//   43  125:putfield        #996 <Field float MatroskaExtractor$Track.primaryBChromaticityX>
					return;
	//   44  128:return          

				case 21972: 
					currentTrack.primaryGChromaticityY = (float)d;
	//   45  129:aload_0         
	//   46  130:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   47  133:dload_2         
	//   48  134:d2f             
	//   49  135:putfield        #999 <Field float MatroskaExtractor$Track.primaryGChromaticityY>
					return;
	//   50  138:return          

				case 21971: 
					currentTrack.primaryGChromaticityX = (float)d;
	//   51  139:aload_0         
	//   52  140:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   53  143:dload_2         
	//   54  144:d2f             
	//   55  145:putfield        #1002 <Field float MatroskaExtractor$Track.primaryGChromaticityX>
					return;
	//   56  148:return          

				case 21970: 
					currentTrack.primaryRChromaticityY = (float)d;
	//   57  149:aload_0         
	//   58  150:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   59  153:dload_2         
	//   60  154:d2f             
	//   61  155:putfield        #1005 <Field float MatroskaExtractor$Track.primaryRChromaticityY>
					return;
	//   62  158:return          

				case 21969: 
					currentTrack.primaryRChromaticityX = (float)d;
	//   63  159:aload_0         
	//   64  160:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   65  163:dload_2         
	//   66  164:d2f             
	//   67  165:putfield        #1008 <Field float MatroskaExtractor$Track.primaryRChromaticityX>
					return;
	//   68  168:return          
				}
			} else
			{
				durationTimecode = (long)d;
	//   69  169:aload_0         
	//   70  170:dload_2         
	//   71  171:d2l             
	//   72  172:putfield        #468 <Field long durationTimecode>
				return;
	//   73  175:return          
			}
		} else
		{
			currentTrack.sampleRate = (int)d;
	//   74  176:aload_0         
	//   75  177:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   76  180:dload_2         
	//   77  181:d2i             
	//   78  182:putfield        #1011 <Field int MatroskaExtractor$Track.sampleRate>
			return;
	//   79  185:return          
		}
	}

	public void init(ExtractorOutput extractoroutput)
	{
		extractorOutput = extractoroutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #914 <Field ExtractorOutput extractorOutput>
	//    3    5:return          
	}

	void integerElement(int i, long l)
		throws ParserException
	{
		boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		boolean flag = false;
	//    2    3:iconst_0        
	//    3    4:istore          4
		switch(i)
	//*   4    6:iload_1         
		{
	//*   5    7:lookupswitch    34: default 288
	//	               131: 1202
	//	               136: 1175
	//	               155: 1165
	//	               159: 1155
	//	               176: 1145
	//	               179: 1132
	//	               186: 1122
	//	               215: 1112
	//	               231: 1102
	//	               241: 1081
	//	               251: 1075
	//	               16980: 1020
	//	               17029: 959
	//	               17143: 906
	//	               18401: 851
	//	               18408: 798
	//	               20529: 745
	//	               20530: 692
	//	               21420: 681
	//	               21432: 608
	//	               21680: 598
	//	               21682: 588
	//	               21690: 578
	//	               21930: 555
	//	               21945: 510
	//	               21946: 437
	//	               21947: 353
	//	               21948: 343
	//	               21949: 333
	//	               22186: 324
	//	               22203: 315
	//	               25188: 305
	//	               2352003: 295
	//	               2807729: 289
		default:
			return;
	//    6  288:return          

		case 2807729: 
			timecodeScale = l;
	//    7  289:aload_0         
	//    8  290:lload_2         
	//    9  291:putfield        #466 <Field long timecodeScale>
			return;
	//   10  294:return          

		case 2352003: 
			currentTrack.defaultSampleDurationNs = (int)l;
	//   11  295:aload_0         
	//   12  296:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   13  299:lload_2         
	//   14  300:l2i             
	//   15  301:putfield        #909 <Field int MatroskaExtractor$Track.defaultSampleDurationNs>
			return;
	//   16  304:return          

		case 25188: 
			currentTrack.audioBitDepth = (int)l;
	//   17  305:aload_0         
	//   18  306:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   19  309:lload_2         
	//   20  310:l2i             
	//   21  311:putfield        #1017 <Field int MatroskaExtractor$Track.audioBitDepth>
			return;
	//   22  314:return          

		case 22203: 
			currentTrack.seekPreRollNs = l;
	//   23  315:aload_0         
	//   24  316:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   25  319:lload_2         
	//   26  320:putfield        #1020 <Field long MatroskaExtractor$Track.seekPreRollNs>
			return;
	//   27  323:return          

		case 22186: 
			currentTrack.codecDelayNs = l;
	//   28  324:aload_0         
	//   29  325:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   30  328:lload_2         
	//   31  329:putfield        #1023 <Field long MatroskaExtractor$Track.codecDelayNs>
			return;
	//   32  332:return          

		case 21949: 
			currentTrack.maxFrameAverageLuminance = (int)l;
	//   33  333:aload_0         
	//   34  334:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   35  337:lload_2         
	//   36  338:l2i             
	//   37  339:putfield        #1026 <Field int MatroskaExtractor$Track.maxFrameAverageLuminance>
			return;
	//   38  342:return          

		case 21948: 
			currentTrack.maxContentLuminance = (int)l;
	//   39  343:aload_0         
	//   40  344:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   41  347:lload_2         
	//   42  348:l2i             
	//   43  349:putfield        #1029 <Field int MatroskaExtractor$Track.maxContentLuminance>
			return;
	//   44  352:return          

		case 21947: 
			currentTrack.hasColorInfo = true;
	//   45  353:aload_0         
	//   46  354:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   47  357:iconst_1        
	//   48  358:putfield        #1032 <Field boolean MatroskaExtractor$Track.hasColorInfo>
			i = (int)l;
	//   49  361:lload_2         
	//   50  362:l2i             
	//   51  363:istore_1        
			if(i != 1)
	//*  52  364:iload_1         
	//*  53  365:iconst_1        
	//*  54  366:icmpeq          428
			{
				if(i != 9)
	//*  55  369:iload_1         
	//*  56  370:bipush          9
	//*  57  372:icmpeq          418
				{
					switch(i)
	//*  58  375:iload_1         
					{
	//*  59  376:tableswitch     4 7: default 408
	//	               4 409
	//	               5 409
	//	               6 409
	//	               7 409
					default:
						return;
	//   60  408:return          

					case 4: // '\004'
					case 5: // '\005'
					case 6: // '\006'
					case 7: // '\007'
						currentTrack.colorSpace = 2;
	//   61  409:aload_0         
	//   62  410:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   63  413:iconst_2        
	//   64  414:putfield        #1035 <Field int MatroskaExtractor$Track.colorSpace>
						break;
					}
					return;
	//   65  417:return          
				} else
				{
					currentTrack.colorSpace = 6;
	//   66  418:aload_0         
	//   67  419:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   68  422:bipush          6
	//   69  424:putfield        #1035 <Field int MatroskaExtractor$Track.colorSpace>
					return;
	//   70  427:return          
				}
			} else
			{
				currentTrack.colorSpace = 1;
	//   71  428:aload_0         
	//   72  429:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   73  432:iconst_1        
	//   74  433:putfield        #1035 <Field int MatroskaExtractor$Track.colorSpace>
				return;
	//   75  436:return          
			}

		case 21946: 
			i = (int)l;
	//   76  437:lload_2         
	//   77  438:l2i             
	//   78  439:istore_1        
			if(i != 1)
	//*  79  440:iload_1         
	//*  80  441:iconst_1        
	//*  81  442:icmpeq          501
				if(i != 16)
	//*  82  445:iload_1         
	//*  83  446:bipush          16
	//*  84  448:icmpeq          491
				{
					if(i != 18)
	//*  85  451:iload_1         
	//*  86  452:bipush          18
	//*  87  454:icmpeq          481
					{
						switch(i)
	//*  88  457:iload_1         
						{
	//*  89  458:tableswitch     6 7: default 480
	//	               6 501
	//	               7 501
						default:
							return;
	//   90  480:return          

						case 6: // '\006'
						case 7: // '\007'
							break;
						}
					} else
					{
						currentTrack.colorTransfer = 7;
	//   91  481:aload_0         
	//   92  482:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   93  485:bipush          7
	//   94  487:putfield        #1038 <Field int MatroskaExtractor$Track.colorTransfer>
						return;
	//   95  490:return          
					}
				} else
				{
					currentTrack.colorTransfer = 6;
	//   96  491:aload_0         
	//   97  492:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   98  495:bipush          6
	//   99  497:putfield        #1038 <Field int MatroskaExtractor$Track.colorTransfer>
					return;
	//  100  500:return          
				}
			currentTrack.colorTransfer = 3;
	//  101  501:aload_0         
	//  102  502:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  103  505:iconst_3        
	//  104  506:putfield        #1038 <Field int MatroskaExtractor$Track.colorTransfer>
			return;
	//  105  509:return          

		case 21945: 
			switch((int)l)
	//* 106  510:lload_2         
	//* 107  511:l2i             
			{
	//* 108  512:tableswitch     1 2: default 536
	//	               1 546
	//	               2 537
			default:
				return;
	//  109  536:return          

			case 2: // '\002'
				currentTrack.colorRange = 1;
	//  110  537:aload_0         
	//  111  538:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  112  541:iconst_1        
	//  113  542:putfield        #1041 <Field int MatroskaExtractor$Track.colorRange>
				return;
	//  114  545:return          

			case 1: // '\001'
				currentTrack.colorRange = 2;
	//  115  546:aload_0         
	//  116  547:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  117  550:iconst_2        
	//  118  551:putfield        #1041 <Field int MatroskaExtractor$Track.colorRange>
				return;
	//  119  554:return          
			}

		case 21930: 
			Track track = currentTrack;
	//  120  555:aload_0         
	//  121  556:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  122  559:astore          6
			if(l == 1L)
	//* 123  561:lload_2         
	//* 124  562:lconst_1        
	//* 125  563:lcmp            
	//* 126  564:ifne            570
				flag = true;
	//  127  567:iconst_1        
	//  128  568:istore          4
			track.flagForced = flag;
	//  129  570:aload           6
	//  130  572:iload           4
	//  131  574:putfield        #1044 <Field boolean MatroskaExtractor$Track.flagForced>
			return;
	//  132  577:return          

		case 21690: 
			currentTrack.displayHeight = (int)l;
	//  133  578:aload_0         
	//  134  579:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  135  582:lload_2         
	//  136  583:l2i             
	//  137  584:putfield        #1047 <Field int MatroskaExtractor$Track.displayHeight>
			return;
	//  138  587:return          

		case 21682: 
			currentTrack.displayUnit = (int)l;
	//  139  588:aload_0         
	//  140  589:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  141  592:lload_2         
	//  142  593:l2i             
	//  143  594:putfield        #1050 <Field int MatroskaExtractor$Track.displayUnit>
			return;
	//  144  597:return          

		case 21680: 
			currentTrack.displayWidth = (int)l;
	//  145  598:aload_0         
	//  146  599:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  147  602:lload_2         
	//  148  603:l2i             
	//  149  604:putfield        #1053 <Field int MatroskaExtractor$Track.displayWidth>
			return;
	//  150  607:return          

		case 21432: 
			i = (int)l;
	//  151  608:lload_2         
	//  152  609:l2i             
	//  153  610:istore_1        
			if(i != 3)
	//* 154  611:iload_1         
	//* 155  612:iconst_3        
	//* 156  613:icmpeq          672
			{
				if(i != 15)
	//* 157  616:iload_1         
	//* 158  617:bipush          15
	//* 159  619:icmpeq          663
				{
					switch(i)
	//* 160  622:iload_1         
					{
	//* 161  623:tableswitch     0 1: default 644
	//	               0 654
	//	               1 645
					default:
						return;
	//  162  644:return          

					case 1: // '\001'
						currentTrack.stereoMode = 2;
	//  163  645:aload_0         
	//  164  646:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  165  649:iconst_2        
	//  166  650:putfield        #1056 <Field int MatroskaExtractor$Track.stereoMode>
						return;
	//  167  653:return          

					case 0: // '\0'
						currentTrack.stereoMode = 0;
	//  168  654:aload_0         
	//  169  655:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  170  658:iconst_0        
	//  171  659:putfield        #1056 <Field int MatroskaExtractor$Track.stereoMode>
						return;
	//  172  662:return          
					}
				} else
				{
					currentTrack.stereoMode = 3;
	//  173  663:aload_0         
	//  174  664:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  175  667:iconst_3        
	//  176  668:putfield        #1056 <Field int MatroskaExtractor$Track.stereoMode>
					return;
	//  177  671:return          
				}
			} else
			{
				currentTrack.stereoMode = 1;
	//  178  672:aload_0         
	//  179  673:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  180  676:iconst_1        
	//  181  677:putfield        #1056 <Field int MatroskaExtractor$Track.stereoMode>
				return;
	//  182  680:return          
			}

		case 21420: 
			seekEntryPosition = l + segmentContentPosition;
	//  183  681:aload_0         
	//  184  682:lload_2         
	//  185  683:aload_0         
	//  186  684:getfield        #462 <Field long segmentContentPosition>
	//  187  687:ladd            
	//  188  688:putfield        #958 <Field long seekEntryPosition>
			return;
	//  189  691:return          

		case 20530: 
			if(l != 1L)
	//* 190  692:lload_2         
	//* 191  693:lconst_1        
	//* 192  694:lcmp            
	//* 193  695:ifeq            1211
			{
				StringBuilder stringbuilder = new StringBuilder();
	//  194  698:new             #815 <Class StringBuilder>
	//  195  701:dup             
	//  196  702:invokespecial   #816 <Method void StringBuilder()>
	//  197  705:astore          6
				stringbuilder.append("ContentEncodingScope ");
	//  198  707:aload           6
	//  199  709:ldc2            #1058 <String "ContentEncodingScope ">
	//  200  712:invokevirtual   #822 <Method StringBuilder StringBuilder.append(String)>
	//  201  715:pop             
				stringbuilder.append(l);
	//  202  716:aload           6
	//  203  718:lload_2         
	//  204  719:invokevirtual   #1061 <Method StringBuilder StringBuilder.append(long)>
	//  205  722:pop             
				stringbuilder.append(" not supported");
	//  206  723:aload           6
	//  207  725:ldc2            #1063 <String " not supported">
	//  208  728:invokevirtual   #822 <Method StringBuilder StringBuilder.append(String)>
	//  209  731:pop             
				throw new ParserException(stringbuilder.toString());
	//  210  732:new             #721 <Class ParserException>
	//  211  735:dup             
	//  212  736:aload           6
	//  213  738:invokevirtual   #829 <Method String StringBuilder.toString()>
	//  214  741:invokespecial   #726 <Method void ParserException(String)>
	//  215  744:athrow          
			}
			break;

		case 20529: 
			if(l != 0L)
	//* 216  745:lload_2         
	//* 217  746:lconst_0        
	//* 218  747:lcmp            
	//* 219  748:ifeq            1211
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//  220  751:new             #815 <Class StringBuilder>
	//  221  754:dup             
	//  222  755:invokespecial   #816 <Method void StringBuilder()>
	//  223  758:astore          6
				stringbuilder1.append("ContentEncodingOrder ");
	//  224  760:aload           6
	//  225  762:ldc2            #1065 <String "ContentEncodingOrder ">
	//  226  765:invokevirtual   #822 <Method StringBuilder StringBuilder.append(String)>
	//  227  768:pop             
				stringbuilder1.append(l);
	//  228  769:aload           6
	//  229  771:lload_2         
	//  230  772:invokevirtual   #1061 <Method StringBuilder StringBuilder.append(long)>
	//  231  775:pop             
				stringbuilder1.append(" not supported");
	//  232  776:aload           6
	//  233  778:ldc2            #1063 <String " not supported">
	//  234  781:invokevirtual   #822 <Method StringBuilder StringBuilder.append(String)>
	//  235  784:pop             
				throw new ParserException(stringbuilder1.toString());
	//  236  785:new             #721 <Class ParserException>
	//  237  788:dup             
	//  238  789:aload           6
	//  239  791:invokevirtual   #829 <Method String StringBuilder.toString()>
	//  240  794:invokespecial   #726 <Method void ParserException(String)>
	//  241  797:athrow          
			}
			break;

		case 18408: 
			if(l != 1L)
	//* 242  798:lload_2         
	//* 243  799:lconst_1        
	//* 244  800:lcmp            
	//* 245  801:ifeq            1211
			{
				StringBuilder stringbuilder2 = new StringBuilder();
	//  246  804:new             #815 <Class StringBuilder>
	//  247  807:dup             
	//  248  808:invokespecial   #816 <Method void StringBuilder()>
	//  249  811:astore          6
				stringbuilder2.append("AESSettingsCipherMode ");
	//  250  813:aload           6
	//  251  815:ldc2            #1067 <String "AESSettingsCipherMode ">
	//  252  818:invokevirtual   #822 <Method StringBuilder StringBuilder.append(String)>
	//  253  821:pop             
				stringbuilder2.append(l);
	//  254  822:aload           6
	//  255  824:lload_2         
	//  256  825:invokevirtual   #1061 <Method StringBuilder StringBuilder.append(long)>
	//  257  828:pop             
				stringbuilder2.append(" not supported");
	//  258  829:aload           6
	//  259  831:ldc2            #1063 <String " not supported">
	//  260  834:invokevirtual   #822 <Method StringBuilder StringBuilder.append(String)>
	//  261  837:pop             
				throw new ParserException(stringbuilder2.toString());
	//  262  838:new             #721 <Class ParserException>
	//  263  841:dup             
	//  264  842:aload           6
	//  265  844:invokevirtual   #829 <Method String StringBuilder.toString()>
	//  266  847:invokespecial   #726 <Method void ParserException(String)>
	//  267  850:athrow          
			}
			break;

		case 18401: 
			if(l != 5L)
	//* 268  851:lload_2         
	//* 269  852:ldc2w           #1068 <Long 5L>
	//* 270  855:lcmp            
	//* 271  856:ifeq            1211
			{
				StringBuilder stringbuilder3 = new StringBuilder();
	//  272  859:new             #815 <Class StringBuilder>
	//  273  862:dup             
	//  274  863:invokespecial   #816 <Method void StringBuilder()>
	//  275  866:astore          6
				stringbuilder3.append("ContentEncAlgo ");
	//  276  868:aload           6
	//  277  870:ldc2            #1071 <String "ContentEncAlgo ">
	//  278  873:invokevirtual   #822 <Method StringBuilder StringBuilder.append(String)>
	//  279  876:pop             
				stringbuilder3.append(l);
	//  280  877:aload           6
	//  281  879:lload_2         
	//  282  880:invokevirtual   #1061 <Method StringBuilder StringBuilder.append(long)>
	//  283  883:pop             
				stringbuilder3.append(" not supported");
	//  284  884:aload           6
	//  285  886:ldc2            #1063 <String " not supported">
	//  286  889:invokevirtual   #822 <Method StringBuilder StringBuilder.append(String)>
	//  287  892:pop             
				throw new ParserException(stringbuilder3.toString());
	//  288  893:new             #721 <Class ParserException>
	//  289  896:dup             
	//  290  897:aload           6
	//  291  899:invokevirtual   #829 <Method String StringBuilder.toString()>
	//  292  902:invokespecial   #726 <Method void ParserException(String)>
	//  293  905:athrow          
			}
			break;

		case 17143: 
			if(l != 1L)
	//* 294  906:lload_2         
	//* 295  907:lconst_1        
	//* 296  908:lcmp            
	//* 297  909:ifeq            1211
			{
				StringBuilder stringbuilder4 = new StringBuilder();
	//  298  912:new             #815 <Class StringBuilder>
	//  299  915:dup             
	//  300  916:invokespecial   #816 <Method void StringBuilder()>
	//  301  919:astore          6
				stringbuilder4.append("EBMLReadVersion ");
	//  302  921:aload           6
	//  303  923:ldc2            #1073 <String "EBMLReadVersion ">
	//  304  926:invokevirtual   #822 <Method StringBuilder StringBuilder.append(String)>
	//  305  929:pop             
				stringbuilder4.append(l);
	//  306  930:aload           6
	//  307  932:lload_2         
	//  308  933:invokevirtual   #1061 <Method StringBuilder StringBuilder.append(long)>
	//  309  936:pop             
				stringbuilder4.append(" not supported");
	//  310  937:aload           6
	//  311  939:ldc2            #1063 <String " not supported">
	//  312  942:invokevirtual   #822 <Method StringBuilder StringBuilder.append(String)>
	//  313  945:pop             
				throw new ParserException(stringbuilder4.toString());
	//  314  946:new             #721 <Class ParserException>
	//  315  949:dup             
	//  316  950:aload           6
	//  317  952:invokevirtual   #829 <Method String StringBuilder.toString()>
	//  318  955:invokespecial   #726 <Method void ParserException(String)>
	//  319  958:athrow          
			}
			break;

		case 17029: 
			if(l < 1L || l > 2L)
	//* 320  959:lload_2         
	//* 321  960:lconst_1        
	//* 322  961:lcmp            
	//* 323  962:iflt            973
	//* 324  965:lload_2         
	//* 325  966:ldc2w           #1074 <Long 2L>
	//* 326  969:lcmp            
	//* 327  970:ifle            1211
			{
				StringBuilder stringbuilder5 = new StringBuilder();
	//  328  973:new             #815 <Class StringBuilder>
	//  329  976:dup             
	//  330  977:invokespecial   #816 <Method void StringBuilder()>
	//  331  980:astore          6
				stringbuilder5.append("DocTypeReadVersion ");
	//  332  982:aload           6
	//  333  984:ldc2            #1077 <String "DocTypeReadVersion ">
	//  334  987:invokevirtual   #822 <Method StringBuilder StringBuilder.append(String)>
	//  335  990:pop             
				stringbuilder5.append(l);
	//  336  991:aload           6
	//  337  993:lload_2         
	//  338  994:invokevirtual   #1061 <Method StringBuilder StringBuilder.append(long)>
	//  339  997:pop             
				stringbuilder5.append(" not supported");
	//  340  998:aload           6
	//  341 1000:ldc2            #1063 <String " not supported">
	//  342 1003:invokevirtual   #822 <Method StringBuilder StringBuilder.append(String)>
	//  343 1006:pop             
				throw new ParserException(stringbuilder5.toString());
	//  344 1007:new             #721 <Class ParserException>
	//  345 1010:dup             
	//  346 1011:aload           6
	//  347 1013:invokevirtual   #829 <Method String StringBuilder.toString()>
	//  348 1016:invokespecial   #726 <Method void ParserException(String)>
	//  349 1019:athrow          
			}
			break;

		case 16980: 
			if(l != 3L)
	//* 350 1020:lload_2         
	//* 351 1021:ldc2w           #1078 <Long 3L>
	//* 352 1024:lcmp            
	//* 353 1025:ifeq            1211
			{
				StringBuilder stringbuilder6 = new StringBuilder();
	//  354 1028:new             #815 <Class StringBuilder>
	//  355 1031:dup             
	//  356 1032:invokespecial   #816 <Method void StringBuilder()>
	//  357 1035:astore          6
				stringbuilder6.append("ContentCompAlgo ");
	//  358 1037:aload           6
	//  359 1039:ldc2            #1081 <String "ContentCompAlgo ">
	//  360 1042:invokevirtual   #822 <Method StringBuilder StringBuilder.append(String)>
	//  361 1045:pop             
				stringbuilder6.append(l);
	//  362 1046:aload           6
	//  363 1048:lload_2         
	//  364 1049:invokevirtual   #1061 <Method StringBuilder StringBuilder.append(long)>
	//  365 1052:pop             
				stringbuilder6.append(" not supported");
	//  366 1053:aload           6
	//  367 1055:ldc2            #1063 <String " not supported">
	//  368 1058:invokevirtual   #822 <Method StringBuilder StringBuilder.append(String)>
	//  369 1061:pop             
				throw new ParserException(stringbuilder6.toString());
	//  370 1062:new             #721 <Class ParserException>
	//  371 1065:dup             
	//  372 1066:aload           6
	//  373 1068:invokevirtual   #829 <Method String StringBuilder.toString()>
	//  374 1071:invokespecial   #726 <Method void ParserException(String)>
	//  375 1074:athrow          
			}
			break;

		case 251: 
			sampleSeenReferenceBlock = true;
	//  376 1075:aload_0         
	//  377 1076:iconst_1        
	//  378 1077:putfield        #975 <Field boolean sampleSeenReferenceBlock>
			return;
	//  379 1080:return          

		case 241: 
			if(!seenClusterPositionForCurrentCuePoint)
	//* 380 1081:aload_0         
	//* 381 1082:getfield        #1083 <Field boolean seenClusterPositionForCurrentCuePoint>
	//* 382 1085:ifne            1211
			{
				cueClusterPositions.add(l);
	//  383 1088:aload_0         
	//  384 1089:getfield        #557 <Field LongArray cueClusterPositions>
	//  385 1092:lload_2         
	//  386 1093:invokevirtual   #1086 <Method void LongArray.add(long)>
				seenClusterPositionForCurrentCuePoint = true;
	//  387 1096:aload_0         
	//  388 1097:iconst_1        
	//  389 1098:putfield        #1083 <Field boolean seenClusterPositionForCurrentCuePoint>
				return;
	//  390 1101:return          
			}
			break;

		case 231: 
			clusterTimecodeUs = scaleTimecodeToUs(l);
	//  391 1102:aload_0         
	//  392 1103:aload_0         
	//  393 1104:lload_2         
	//  394 1105:invokespecial   #894 <Method long scaleTimecodeToUs(long)>
	//  395 1108:putfield        #476 <Field long clusterTimecodeUs>
			return;
	//  396 1111:return          

		case 215: 
			currentTrack.number = (int)l;
	//  397 1112:aload_0         
	//  398 1113:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  399 1116:lload_2         
	//  400 1117:l2i             
	//  401 1118:putfield        #965 <Field int MatroskaExtractor$Track.number>
			return;
	//  402 1121:return          

		case 186: 
			currentTrack.height = (int)l;
	//  403 1122:aload_0         
	//  404 1123:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  405 1126:lload_2         
	//  406 1127:l2i             
	//  407 1128:putfield        #1089 <Field int MatroskaExtractor$Track.height>
			return;
	//  408 1131:return          

		case 179: 
			cueTimesUs.add(scaleTimecodeToUs(l));
	//  409 1132:aload_0         
	//  410 1133:getfield        #549 <Field LongArray cueTimesUs>
	//  411 1136:aload_0         
	//  412 1137:lload_2         
	//  413 1138:invokespecial   #894 <Method long scaleTimecodeToUs(long)>
	//  414 1141:invokevirtual   #1086 <Method void LongArray.add(long)>
			return;
	//  415 1144:return          

		case 176: 
			currentTrack.width = (int)l;
	//  416 1145:aload_0         
	//  417 1146:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  418 1149:lload_2         
	//  419 1150:l2i             
	//  420 1151:putfield        #1092 <Field int MatroskaExtractor$Track.width>
			return;
	//  421 1154:return          

		case 159: 
			currentTrack.channelCount = (int)l;
	//  422 1155:aload_0         
	//  423 1156:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  424 1159:lload_2         
	//  425 1160:l2i             
	//  426 1161:putfield        #1095 <Field int MatroskaExtractor$Track.channelCount>
			return;
	//  427 1164:return          

		case 155: 
			blockDurationUs = scaleTimecodeToUs(l);
	//  428 1165:aload_0         
	//  429 1166:aload_0         
	//  430 1167:lload_2         
	//  431 1168:invokespecial   #894 <Method long scaleTimecodeToUs(long)>
	//  432 1171:putfield        #622 <Field long blockDurationUs>
			return;
	//  433 1174:return          

		case 136: 
			Track track1 = currentTrack;
	//  434 1175:aload_0         
	//  435 1176:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  436 1179:astore          6
			boolean flag1 = flag2;
	//  437 1181:iload           5
	//  438 1183:istore          4
			if(l == 1L)
	//* 439 1185:lload_2         
	//* 440 1186:lconst_1        
	//* 441 1187:lcmp            
	//* 442 1188:ifne            1194
				flag1 = true;
	//  443 1191:iconst_1        
	//  444 1192:istore          4
			track1.flagDefault = flag1;
	//  445 1194:aload           6
	//  446 1196:iload           4
	//  447 1198:putfield        #1098 <Field boolean MatroskaExtractor$Track.flagDefault>
			return;
	//  448 1201:return          

		case 131: 
			currentTrack.type = (int)l;
	//  449 1202:aload_0         
	//  450 1203:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//  451 1206:lload_2         
	//  452 1207:l2i             
	//  453 1208:putfield        #899 <Field int MatroskaExtractor$Track.type>
			break;
		}
	//  454 1211:return          
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		sampleRead = false;
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:putfield        #614 <Field boolean sampleRead>
		boolean flag;
		for(flag = true; flag && !sampleRead;)
	//*   5    7:iconst_1        
	//*   6    8:istore          4
	//*   7   10:iload           4
	//*   8   12:ifeq            63
	//*   9   15:aload_0         
	//*  10   16:getfield        #614 <Field boolean sampleRead>
	//*  11   19:ifne            63
		{
			boolean flag1 = reader.read(extractorinput);
	//   12   22:aload_0         
	//   13   23:getfield        #478 <Field EbmlReader reader>
	//   14   26:aload_1         
	//   15   27:invokeinterface #1103 <Method boolean EbmlReader.read(ExtractorInput)>
	//   16   32:istore          5
			flag = flag1;
	//   17   34:iload           5
	//   18   36:istore          4
			if(flag1)
	//*  19   38:iload           5
	//*  20   40:ifeq            10
			{
				flag = flag1;
	//   21   43:iload           5
	//   22   45:istore          4
				if(maybeSeekForCues(positionholder, extractorinput.getPosition()))
	//*  23   47:aload_0         
	//*  24   48:aload_2         
	//*  25   49:aload_1         
	//*  26   50:invokeinterface #1106 <Method long ExtractorInput.getPosition()>
	//*  27   55:invokespecial   #1108 <Method boolean maybeSeekForCues(PositionHolder, long)>
	//*  28   58:ifeq            10
					return 1;
	//   29   61:iconst_1        
	//   30   62:ireturn         
			}
		}

		if(!flag)
	//*  31   63:iload           4
	//*  32   65:ifne            102
		{
			for(; i < tracks.size(); i++)
	//*  33   68:iload_3         
	//*  34   69:aload_0         
	//*  35   70:getfield        #499 <Field SparseArray tracks>
	//*  36   73:invokevirtual   #923 <Method int SparseArray.size()>
	//*  37   76:icmpge          100
				((Track)tracks.valueAt(i)).outputPendingSampleMetadata();
	//   38   79:aload_0         
	//   39   80:getfield        #499 <Field SparseArray tracks>
	//   40   83:iload_3         
	//   41   84:invokevirtual   #1111 <Method Object SparseArray.valueAt(int)>
	//   42   87:checkcast       #16  <Class MatroskaExtractor$Track>
	//   43   90:invokevirtual   #1114 <Method void MatroskaExtractor$Track.outputPendingSampleMetadata()>

	//   44   93:iload_3         
	//   45   94:iconst_1        
	//   46   95:iadd            
	//   47   96:istore_3        
	//*  48   97:goto            68
			return -1;
	//   49  100:iconst_m1       
	//   50  101:ireturn         
		} else
		{
			return 0;
	//   51  102:iconst_0        
	//   52  103:ireturn         
		}
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seek(long l, long l1)
	{
		clusterTimecodeUs = 0x1L;
	//    0    0:aload_0         
	//    1    1:ldc2w           #463 <Long 0x1L>
	//    2    4:putfield        #476 <Field long clusterTimecodeUs>
		int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore          5
		blockState = 0;
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:putfield        #854 <Field int blockState>
		reader.reset();
	//    8   15:aload_0         
	//    9   16:getfield        #478 <Field EbmlReader reader>
	//   10   19:invokeinterface #1117 <Method void EbmlReader.reset()>
		varintReader.reset();
	//   11   24:aload_0         
	//   12   25:getfield        #494 <Field VarintReader varintReader>
	//   13   28:invokevirtual   #1118 <Method void VarintReader.reset()>
		resetSample();
	//   14   31:aload_0         
	//   15   32:invokespecial   #617 <Method void resetSample()>
		for(; i < tracks.size(); i++)
	//*  16   35:iload           5
	//*  17   37:aload_0         
	//*  18   38:getfield        #499 <Field SparseArray tracks>
	//*  19   41:invokevirtual   #923 <Method int SparseArray.size()>
	//*  20   44:icmpge          71
			((Track)tracks.valueAt(i)).reset();
	//   21   47:aload_0         
	//   22   48:getfield        #499 <Field SparseArray tracks>
	//   23   51:iload           5
	//   24   53:invokevirtual   #1111 <Method Object SparseArray.valueAt(int)>
	//   25   56:checkcast       #16  <Class MatroskaExtractor$Track>
	//   26   59:invokevirtual   #1119 <Method void MatroskaExtractor$Track.reset()>

	//   27   62:iload           5
	//   28   64:iconst_1        
	//   29   65:iadd            
	//   30   66:istore          5
	//*  31   68:goto            35
	//   32   71:return          
	}

	public boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		return (new Sniffer()).sniff(extractorinput);
	//    0    0:new             #1122 <Class Sniffer>
	//    1    3:dup             
	//    2    4:invokespecial   #1123 <Method void Sniffer()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #1125 <Method boolean Sniffer.sniff(ExtractorInput)>
	//    5   11:ireturn         
	}

	void startMasterElement(int i, long l, long l1)
		throws ParserException
	{
		if(i != 160)
	//*   0    0:iload_1         
	//*   1    1:sipush          160
	//*   2    4:icmpeq          242
		{
			if(i != 174)
	//*   3    7:iload_1         
	//*   4    8:sipush          174
	//*   5   11:icmpeq          229
			{
				if(i != 187)
	//*   6   14:iload_1         
	//*   7   15:sipush          187
	//*   8   18:icmpeq          223
				{
					if(i != 19899)
	//*   9   21:iload_1         
	//*  10   22:sipush          19899
	//*  11   25:icmpeq          210
					{
						if(i != 20533)
	//*  12   28:iload_1         
	//*  13   29:sipush          20533
	//*  14   32:icmpeq          201
						{
							if(i != 21968)
	//*  15   35:iload_1         
	//*  16   36:sipush          21968
	//*  17   39:icmpeq          192
							{
								if(i != 25152)
	//*  18   42:iload_1         
	//*  19   43:sipush          25152
	//*  20   46:icmpeq          247
									if(i != 0x18538067)
	//*  21   49:iload_1         
	//*  22   50:ldc2            #264 <Int 0x18538067>
	//*  23   53:icmpeq          149
									{
										if(i != 0x1c53bb6b)
	//*  24   56:iload_1         
	//*  25   57:ldc1            #184 <Int 0x1c53bb6b>
	//*  26   59:icmpeq          126
										{
											if(i != 0x1f43b675)
	//*  27   62:iload_1         
	//*  28   63:ldc1            #144 <Int 0x1f43b675>
	//*  29   65:icmpeq          69
												return;
	//   30   68:return          
											if(!sentSeekMap)
	//*  31   69:aload_0         
	//*  32   70:getfield        #654 <Field boolean sentSeekMap>
	//*  33   73:ifne            247
												if(seekForCuesEnabled && cuesContentPosition != -1L)
	//*  34   76:aload_0         
	//*  35   77:getfield        #489 <Field boolean seekForCuesEnabled>
	//*  36   80:ifeq            100
	//*  37   83:aload_0         
	//*  38   84:getfield        #472 <Field long cuesContentPosition>
	//*  39   87:ldc2w           #459 <Long -1L>
	//*  40   90:lcmp            
	//*  41   91:ifeq            100
												{
													seekForCues = true;
	//   42   94:aload_0         
	//   43   95:iconst_1        
	//   44   96:putfield        #647 <Field boolean seekForCues>
													return;
	//   45   99:return          
												} else
												{
													extractorOutput.seekMap(((SeekMap) (new com.google.android.exoplayer2.extractor.SeekMap.Unseekable(durationUs))));
	//   46  100:aload_0         
	//   47  101:getfield        #914 <Field ExtractorOutput extractorOutput>
	//   48  104:new             #570 <Class com.google.android.exoplayer2.extractor.SeekMap$Unseekable>
	//   49  107:dup             
	//   50  108:aload_0         
	//   51  109:getfield        #470 <Field long durationUs>
	//   52  112:invokespecial   #573 <Method void com.google.android.exoplayer2.extractor.SeekMap$Unseekable(long)>
	//   53  115:invokeinterface #922 <Method void ExtractorOutput.seekMap(SeekMap)>
													sentSeekMap = true;
	//   54  120:aload_0         
	//   55  121:iconst_1        
	//   56  122:putfield        #654 <Field boolean sentSeekMap>
													return;
	//   57  125:return          
												}
										} else
										{
											cueTimesUs = new LongArray();
	//   58  126:aload_0         
	//   59  127:new             #551 <Class LongArray>
	//   60  130:dup             
	//   61  131:invokespecial   #1128 <Method void LongArray()>
	//   62  134:putfield        #549 <Field LongArray cueTimesUs>
											cueClusterPositions = new LongArray();
	//   63  137:aload_0         
	//   64  138:new             #551 <Class LongArray>
	//   65  141:dup             
	//   66  142:invokespecial   #1128 <Method void LongArray()>
	//   67  145:putfield        #557 <Field LongArray cueClusterPositions>
											return;
	//   68  148:return          
										}
									} else
									if(segmentContentPosition != -1L && segmentContentPosition != l)
	//*  69  149:aload_0         
	//*  70  150:getfield        #462 <Field long segmentContentPosition>
	//*  71  153:ldc2w           #459 <Long -1L>
	//*  72  156:lcmp            
	//*  73  157:ifeq            180
	//*  74  160:aload_0         
	//*  75  161:getfield        #462 <Field long segmentContentPosition>
	//*  76  164:lload_2         
	//*  77  165:lcmp            
	//*  78  166:ifeq            180
									{
										throw new ParserException("Multiple Segment elements not supported");
	//   79  169:new             #721 <Class ParserException>
	//   80  172:dup             
	//   81  173:ldc2            #1130 <String "Multiple Segment elements not supported">
	//   82  176:invokespecial   #726 <Method void ParserException(String)>
	//   83  179:athrow          
									} else
									{
										segmentContentPosition = l;
	//   84  180:aload_0         
	//   85  181:lload_2         
	//   86  182:putfield        #462 <Field long segmentContentPosition>
										segmentContentSize = l1;
	//   87  185:aload_0         
	//   88  186:lload           4
	//   89  188:putfield        #563 <Field long segmentContentSize>
										return;
	//   90  191:return          
									}
							} else
							{
								currentTrack.hasColorInfo = true;
	//   91  192:aload_0         
	//   92  193:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   93  196:iconst_1        
	//   94  197:putfield        #1032 <Field boolean MatroskaExtractor$Track.hasColorInfo>
								return;
	//   95  200:return          
							}
						} else
						{
							currentTrack.hasContentEncryption = true;
	//   96  201:aload_0         
	//   97  202:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   98  205:iconst_1        
	//   99  206:putfield        #767 <Field boolean MatroskaExtractor$Track.hasContentEncryption>
							return;
	//  100  209:return          
						}
					} else
					{
						seekEntryId = -1;
	//  101  210:aload_0         
	//  102  211:iconst_m1       
	//  103  212:putfield        #847 <Field int seekEntryId>
						seekEntryPosition = -1L;
	//  104  215:aload_0         
	//  105  216:ldc2w           #459 <Long -1L>
	//  106  219:putfield        #958 <Field long seekEntryPosition>
						return;
	//  107  222:return          
					}
				} else
				{
					seenClusterPositionForCurrentCuePoint = false;
	//  108  223:aload_0         
	//  109  224:iconst_0        
	//  110  225:putfield        #1083 <Field boolean seenClusterPositionForCurrentCuePoint>
					return;
	//  111  228:return          
				}
			} else
			{
				currentTrack = new Track();
	//  112  229:aload_0         
	//  113  230:new             #16  <Class MatroskaExtractor$Track>
	//  114  233:dup             
	//  115  234:aconst_null     
	//  116  235:invokespecial   #1133 <Method void MatroskaExtractor$Track(MatroskaExtractor$1)>
	//  117  238:putfield        #831 <Field MatroskaExtractor$Track currentTrack>
				return;
	//  118  241:return          
			}
		} else
		{
			sampleSeenReferenceBlock = false;
	//  119  242:aload_0         
	//  120  243:iconst_0        
	//  121  244:putfield        #975 <Field boolean sampleSeenReferenceBlock>
		}
	//  122  247:return          
	}

	void stringElement(int i, String s)
		throws ParserException
	{
		if(i != 134)
	//*   0    0:iload_1         
	//*   1    1:sipush          134
	//*   2    4:icmpeq          91
		{
			if(i != 17026)
	//*   3    7:iload_1         
	//*   4    8:sipush          17026
	//*   5   11:icmpeq          31
				if(i != 0x22b59c)
	//*   6   14:iload_1         
	//*   7   15:ldc1            #218 <Int 0x22b59c>
	//*   8   17:icmpeq          21
				{
					return;
	//    9   20:return          
				} else
				{
					currentTrack.language = s;
	//   10   21:aload_0         
	//   11   22:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   12   25:aload_2         
	//   13   26:invokestatic    #1139 <Method String MatroskaExtractor$Track.access$202(MatroskaExtractor$Track, String)>
	//   14   29:pop             
					return;
	//   15   30:return          
				}
			if(!"webm".equals(((Object) (s))) && !"matroska".equals(((Object) (s))))
	//*  16   31:ldc1            #121 <String "webm">
	//*  17   33:aload_2         
	//*  18   34:invokevirtual   #591 <Method boolean String.equals(Object)>
	//*  19   37:ifne            99
	//*  20   40:ldc1            #118 <String "matroska">
	//*  21   42:aload_2         
	//*  22   43:invokevirtual   #591 <Method boolean String.equals(Object)>
	//*  23   46:ifne            99
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   24   49:new             #815 <Class StringBuilder>
	//   25   52:dup             
	//   26   53:invokespecial   #816 <Method void StringBuilder()>
	//   27   56:astore_3        
				stringbuilder.append("DocType ");
	//   28   57:aload_3         
	//   29   58:ldc2            #1141 <String "DocType ">
	//   30   61:invokevirtual   #822 <Method StringBuilder StringBuilder.append(String)>
	//   31   64:pop             
				stringbuilder.append(s);
	//   32   65:aload_3         
	//   33   66:aload_2         
	//   34   67:invokevirtual   #822 <Method StringBuilder StringBuilder.append(String)>
	//   35   70:pop             
				stringbuilder.append(" not supported");
	//   36   71:aload_3         
	//   37   72:ldc2            #1063 <String " not supported">
	//   38   75:invokevirtual   #822 <Method StringBuilder StringBuilder.append(String)>
	//   39   78:pop             
				throw new ParserException(stringbuilder.toString());
	//   40   79:new             #721 <Class ParserException>
	//   41   82:dup             
	//   42   83:aload_3         
	//   43   84:invokevirtual   #829 <Method String StringBuilder.toString()>
	//   44   87:invokespecial   #726 <Method void ParserException(String)>
	//   45   90:athrow          
			}
		} else
		{
			currentTrack.codecId = s;
	//   46   91:aload_0         
	//   47   92:getfield        #831 <Field MatroskaExtractor$Track currentTrack>
	//   48   95:aload_2         
	//   49   96:putfield        #585 <Field String MatroskaExtractor$Track.codecId>
		}
	//   50   99:return          
	}

	private static final int BLOCK_STATE_DATA = 2;
	private static final int BLOCK_STATE_HEADER = 1;
	private static final int BLOCK_STATE_START = 0;
	private static final String CODEC_ID_AAC = "A_AAC";
	private static final String CODEC_ID_AC3 = "A_AC3";
	private static final String CODEC_ID_ACM = "A_MS/ACM";
	private static final String CODEC_ID_ASS = "S_TEXT/ASS";
	private static final String CODEC_ID_DTS = "A_DTS";
	private static final String CODEC_ID_DTS_EXPRESS = "A_DTS/EXPRESS";
	private static final String CODEC_ID_DTS_LOSSLESS = "A_DTS/LOSSLESS";
	private static final String CODEC_ID_DVBSUB = "S_DVBSUB";
	private static final String CODEC_ID_E_AC3 = "A_EAC3";
	private static final String CODEC_ID_FLAC = "A_FLAC";
	private static final String CODEC_ID_FOURCC = "V_MS/VFW/FOURCC";
	private static final String CODEC_ID_H264 = "V_MPEG4/ISO/AVC";
	private static final String CODEC_ID_H265 = "V_MPEGH/ISO/HEVC";
	private static final String CODEC_ID_MP2 = "A_MPEG/L2";
	private static final String CODEC_ID_MP3 = "A_MPEG/L3";
	private static final String CODEC_ID_MPEG2 = "V_MPEG2";
	private static final String CODEC_ID_MPEG4_AP = "V_MPEG4/ISO/AP";
	private static final String CODEC_ID_MPEG4_ASP = "V_MPEG4/ISO/ASP";
	private static final String CODEC_ID_MPEG4_SP = "V_MPEG4/ISO/SP";
	private static final String CODEC_ID_OPUS = "A_OPUS";
	private static final String CODEC_ID_PCM_INT_LIT = "A_PCM/INT/LIT";
	private static final String CODEC_ID_PGS = "S_HDMV/PGS";
	private static final String CODEC_ID_SUBRIP = "S_TEXT/UTF8";
	private static final String CODEC_ID_THEORA = "V_THEORA";
	private static final String CODEC_ID_TRUEHD = "A_TRUEHD";
	private static final String CODEC_ID_VOBSUB = "S_VOBSUB";
	private static final String CODEC_ID_VORBIS = "A_VORBIS";
	private static final String CODEC_ID_VP8 = "V_VP8";
	private static final String CODEC_ID_VP9 = "V_VP9";
	private static final String DOC_TYPE_MATROSKA = "matroska";
	private static final String DOC_TYPE_WEBM = "webm";
	private static final int ENCRYPTION_IV_SIZE = 8;
	public static final ExtractorsFactory FACTORY = new ExtractorsFactory() {

		public Extractor[] createExtractors()
		{
			return (new Extractor[] {
				new MatroskaExtractor()
			});
		//    0    0:iconst_1        
		//    1    1:anewarray       Extractor[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:new             #8   <Class MatroskaExtractor>
		//    5    9:dup             
		//    6   10:invokespecial   #18  <Method void MatroskaExtractor()>
		//    7   13:aastore         
		//    8   14:areturn         
		}

	}
;
	public static final int FLAG_DISABLE_SEEK_FOR_CUES = 1;
	private static final int FOURCC_COMPRESSION_DIVX = 0x58564944;
	private static final int FOURCC_COMPRESSION_VC1 = 0x31435657;
	private static final int ID_AUDIO = 225;
	private static final int ID_AUDIO_BIT_DEPTH = 25188;
	private static final int ID_BLOCK = 161;
	private static final int ID_BLOCK_DURATION = 155;
	private static final int ID_BLOCK_GROUP = 160;
	private static final int ID_CHANNELS = 159;
	private static final int ID_CLUSTER = 0x1f43b675;
	private static final int ID_CODEC_DELAY = 22186;
	private static final int ID_CODEC_ID = 134;
	private static final int ID_CODEC_PRIVATE = 25506;
	private static final int ID_COLOUR = 21936;
	private static final int ID_COLOUR_PRIMARIES = 21947;
	private static final int ID_COLOUR_RANGE = 21945;
	private static final int ID_COLOUR_TRANSFER = 21946;
	private static final int ID_CONTENT_COMPRESSION = 20532;
	private static final int ID_CONTENT_COMPRESSION_ALGORITHM = 16980;
	private static final int ID_CONTENT_COMPRESSION_SETTINGS = 16981;
	private static final int ID_CONTENT_ENCODING = 25152;
	private static final int ID_CONTENT_ENCODINGS = 28032;
	private static final int ID_CONTENT_ENCODING_ORDER = 20529;
	private static final int ID_CONTENT_ENCODING_SCOPE = 20530;
	private static final int ID_CONTENT_ENCRYPTION = 20533;
	private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS = 18407;
	private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE = 18408;
	private static final int ID_CONTENT_ENCRYPTION_ALGORITHM = 18401;
	private static final int ID_CONTENT_ENCRYPTION_KEY_ID = 18402;
	private static final int ID_CUES = 0x1c53bb6b;
	private static final int ID_CUE_CLUSTER_POSITION = 241;
	private static final int ID_CUE_POINT = 187;
	private static final int ID_CUE_TIME = 179;
	private static final int ID_CUE_TRACK_POSITIONS = 183;
	private static final int ID_DEFAULT_DURATION = 0x23e383;
	private static final int ID_DISPLAY_HEIGHT = 21690;
	private static final int ID_DISPLAY_UNIT = 21682;
	private static final int ID_DISPLAY_WIDTH = 21680;
	private static final int ID_DOC_TYPE = 17026;
	private static final int ID_DOC_TYPE_READ_VERSION = 17029;
	private static final int ID_DURATION = 17545;
	private static final int ID_EBML = 0x1a45dfa3;
	private static final int ID_EBML_READ_VERSION = 17143;
	private static final int ID_FLAG_DEFAULT = 136;
	private static final int ID_FLAG_FORCED = 21930;
	private static final int ID_INFO = 0x1549a966;
	private static final int ID_LANGUAGE = 0x22b59c;
	private static final int ID_LUMNINANCE_MAX = 21977;
	private static final int ID_LUMNINANCE_MIN = 21978;
	private static final int ID_MASTERING_METADATA = 21968;
	private static final int ID_MAX_CLL = 21948;
	private static final int ID_MAX_FALL = 21949;
	private static final int ID_PIXEL_HEIGHT = 186;
	private static final int ID_PIXEL_WIDTH = 176;
	private static final int ID_PRIMARY_B_CHROMATICITY_X = 21973;
	private static final int ID_PRIMARY_B_CHROMATICITY_Y = 21974;
	private static final int ID_PRIMARY_G_CHROMATICITY_X = 21971;
	private static final int ID_PRIMARY_G_CHROMATICITY_Y = 21972;
	private static final int ID_PRIMARY_R_CHROMATICITY_X = 21969;
	private static final int ID_PRIMARY_R_CHROMATICITY_Y = 21970;
	private static final int ID_PROJECTION = 30320;
	private static final int ID_PROJECTION_PRIVATE = 30322;
	private static final int ID_REFERENCE_BLOCK = 251;
	private static final int ID_SAMPLING_FREQUENCY = 181;
	private static final int ID_SEEK = 19899;
	private static final int ID_SEEK_HEAD = 0x114d9b74;
	private static final int ID_SEEK_ID = 21419;
	private static final int ID_SEEK_POSITION = 21420;
	private static final int ID_SEEK_PRE_ROLL = 22203;
	private static final int ID_SEGMENT = 0x18538067;
	private static final int ID_SEGMENT_INFO = 0x1549a966;
	private static final int ID_SIMPLE_BLOCK = 163;
	private static final int ID_STEREO_MODE = 21432;
	private static final int ID_TIMECODE_SCALE = 0x2ad7b1;
	private static final int ID_TIME_CODE = 231;
	private static final int ID_TRACKS = 0x1654ae6b;
	private static final int ID_TRACK_ENTRY = 174;
	private static final int ID_TRACK_NUMBER = 215;
	private static final int ID_TRACK_TYPE = 131;
	private static final int ID_VIDEO = 224;
	private static final int ID_WHITE_POINT_CHROMATICITY_X = 21975;
	private static final int ID_WHITE_POINT_CHROMATICITY_Y = 21976;
	private static final int LACING_EBML = 3;
	private static final int LACING_FIXED_SIZE = 2;
	private static final int LACING_NONE = 0;
	private static final int LACING_XIPH = 1;
	private static final int OPUS_MAX_INPUT_SIZE = 5760;
	private static final byte SSA_DIALOGUE_FORMAT[] = Util.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
	private static final byte SSA_PREFIX[] = {
		68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 
		48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 
		44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 
		48, 44
	};
	private static final int SSA_PREFIX_END_TIMECODE_OFFSET = 21;
	private static final byte SSA_TIMECODE_EMPTY[] = {
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32
	};
	private static final String SSA_TIMECODE_FORMAT = "%01d:%02d:%02d:%02d";
	private static final long SSA_TIMECODE_LAST_VALUE_SCALING_FACTOR = 10000L;
	private static final byte SUBRIP_PREFIX[] = {
		49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 
		44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 
		48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 
		48, 10
	};
	private static final int SUBRIP_PREFIX_END_TIMECODE_OFFSET = 19;
	private static final byte SUBRIP_TIMECODE_EMPTY[] = {
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 
		32, 32
	};
	private static final String SUBRIP_TIMECODE_FORMAT = "%02d:%02d:%02d,%03d";
	private static final long SUBRIP_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000L;
	private static final String TAG = "MatroskaExtractor";
	private static final int TRACK_TYPE_AUDIO = 2;
	private static final int UNSET_ENTRY_ID = -1;
	private static final int VORBIS_MAX_INPUT_SIZE = 8192;
	private static final int WAVE_FORMAT_EXTENSIBLE = 65534;
	private static final int WAVE_FORMAT_PCM = 1;
	private static final int WAVE_FORMAT_SIZE = 18;
	private static final UUID WAVE_SUBFORMAT_PCM = new UUID(0x1000L, 0x389b71L);
	private long blockDurationUs;
	private int blockFlags;
	private int blockLacingSampleCount;
	private int blockLacingSampleIndex;
	private int blockLacingSampleSizes[];
	private int blockState;
	private long blockTimeUs;
	private int blockTrackNumber;
	private int blockTrackNumberLength;
	private long clusterTimecodeUs;
	private LongArray cueClusterPositions;
	private LongArray cueTimesUs;
	private long cuesContentPosition;
	private Track currentTrack;
	private long durationTimecode;
	private long durationUs;
	private final ParsableByteArray encryptionInitializationVector;
	private final ParsableByteArray encryptionSubsampleData;
	private ByteBuffer encryptionSubsampleDataBuffer;
	private ExtractorOutput extractorOutput;
	private final ParsableByteArray nalLength;
	private final ParsableByteArray nalStartCode;
	private final EbmlReader reader;
	private int sampleBytesRead;
	private int sampleBytesWritten;
	private int sampleCurrentNalBytesRemaining;
	private boolean sampleEncodingHandled;
	private boolean sampleInitializationVectorRead;
	private int samplePartitionCount;
	private boolean samplePartitionCountRead;
	private boolean sampleRead;
	private boolean sampleSeenReferenceBlock;
	private byte sampleSignalByte;
	private boolean sampleSignalByteRead;
	private final ParsableByteArray sampleStrippedBytes;
	private final ParsableByteArray scratch;
	private int seekEntryId;
	private final ParsableByteArray seekEntryIdBytes;
	private long seekEntryPosition;
	private boolean seekForCues;
	private final boolean seekForCuesEnabled;
	private long seekPositionAfterBuildingCues;
	private boolean seenClusterPositionForCurrentCuePoint;
	private long segmentContentPosition;
	private long segmentContentSize;
	private boolean sentSeekMap;
	private final ParsableByteArray subtitleSample;
	private long timecodeScale;
	private final SparseArray tracks;
	private final VarintReader varintReader;
	private final ParsableByteArray vorbisNumPageSamples;

	static 
	{
	//    0    0:new             #8   <Class MatroskaExtractor$1>
	//    1    3:dup             
	//    2    4:invokespecial   #400 <Method void MatroskaExtractor$1()>
	//    3    7:putstatic       #402 <Field ExtractorsFactory FACTORY>
	//    4   10:bipush          32
	//    5   12:newarray        byte[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:ldc2            #403 <Int 49>
	//    9   19:bastore         
	//   10   20:dup             
	//   11   21:iconst_1        
	//   12   22:ldc2            #404 <Int 10>
	//   13   25:bastore         
	//   14   26:dup             
	//   15   27:iconst_2        
	//   16   28:ldc2            #405 <Int 48>
	//   17   31:bastore         
	//   18   32:dup             
	//   19   33:iconst_3        
	//   20   34:ldc2            #405 <Int 48>
	//   21   37:bastore         
	//   22   38:dup             
	//   23   39:iconst_4        
	//   24   40:ldc2            #406 <Int 58>
	//   25   43:bastore         
	//   26   44:dup             
	//   27   45:iconst_5        
	//   28   46:ldc2            #405 <Int 48>
	//   29   49:bastore         
	//   30   50:dup             
	//   31   51:bipush          6
	//   32   53:ldc2            #405 <Int 48>
	//   33   56:bastore         
	//   34   57:dup             
	//   35   58:bipush          7
	//   36   60:ldc2            #406 <Int 58>
	//   37   63:bastore         
	//   38   64:dup             
	//   39   65:bipush          8
	//   40   67:ldc2            #405 <Int 48>
	//   41   70:bastore         
	//   42   71:dup             
	//   43   72:bipush          9
	//   44   74:ldc2            #405 <Int 48>
	//   45   77:bastore         
	//   46   78:dup             
	//   47   79:bipush          10
	//   48   81:ldc2            #407 <Int 44>
	//   49   84:bastore         
	//   50   85:dup             
	//   51   86:bipush          11
	//   52   88:ldc2            #405 <Int 48>
	//   53   91:bastore         
	//   54   92:dup             
	//   55   93:bipush          12
	//   56   95:ldc2            #405 <Int 48>
	//   57   98:bastore         
	//   58   99:dup             
	//   59  100:bipush          13
	//   60  102:ldc2            #405 <Int 48>
	//   61  105:bastore         
	//   62  106:dup             
	//   63  107:bipush          14
	//   64  109:ldc2            #408 <Int 32>
	//   65  112:bastore         
	//   66  113:dup             
	//   67  114:bipush          15
	//   68  116:ldc2            #409 <Int 45>
	//   69  119:bastore         
	//   70  120:dup             
	//   71  121:bipush          16
	//   72  123:ldc2            #409 <Int 45>
	//   73  126:bastore         
	//   74  127:dup             
	//   75  128:bipush          17
	//   76  130:ldc2            #410 <Int 62>
	//   77  133:bastore         
	//   78  134:dup             
	//   79  135:bipush          18
	//   80  137:ldc2            #408 <Int 32>
	//   81  140:bastore         
	//   82  141:dup             
	//   83  142:bipush          19
	//   84  144:ldc2            #405 <Int 48>
	//   85  147:bastore         
	//   86  148:dup             
	//   87  149:bipush          20
	//   88  151:ldc2            #405 <Int 48>
	//   89  154:bastore         
	//   90  155:dup             
	//   91  156:bipush          21
	//   92  158:ldc2            #406 <Int 58>
	//   93  161:bastore         
	//   94  162:dup             
	//   95  163:bipush          22
	//   96  165:ldc2            #405 <Int 48>
	//   97  168:bastore         
	//   98  169:dup             
	//   99  170:bipush          23
	//  100  172:ldc2            #405 <Int 48>
	//  101  175:bastore         
	//  102  176:dup             
	//  103  177:bipush          24
	//  104  179:ldc2            #406 <Int 58>
	//  105  182:bastore         
	//  106  183:dup             
	//  107  184:bipush          25
	//  108  186:ldc2            #405 <Int 48>
	//  109  189:bastore         
	//  110  190:dup             
	//  111  191:bipush          26
	//  112  193:ldc2            #405 <Int 48>
	//  113  196:bastore         
	//  114  197:dup             
	//  115  198:bipush          27
	//  116  200:ldc2            #407 <Int 44>
	//  117  203:bastore         
	//  118  204:dup             
	//  119  205:bipush          28
	//  120  207:ldc2            #405 <Int 48>
	//  121  210:bastore         
	//  122  211:dup             
	//  123  212:bipush          29
	//  124  214:ldc2            #405 <Int 48>
	//  125  217:bastore         
	//  126  218:dup             
	//  127  219:bipush          30
	//  128  221:ldc2            #405 <Int 48>
	//  129  224:bastore         
	//  130  225:dup             
	//  131  226:bipush          31
	//  132  228:ldc2            #404 <Int 10>
	//  133  231:bastore         
	//  134  232:putstatic       #412 <Field byte[] SUBRIP_PREFIX>
	//  135  235:bipush          12
	//  136  237:newarray        byte[]
	//  137  239:dup             
	//  138  240:iconst_0        
	//  139  241:ldc2            #408 <Int 32>
	//  140  244:bastore         
	//  141  245:dup             
	//  142  246:iconst_1        
	//  143  247:ldc2            #408 <Int 32>
	//  144  250:bastore         
	//  145  251:dup             
	//  146  252:iconst_2        
	//  147  253:ldc2            #408 <Int 32>
	//  148  256:bastore         
	//  149  257:dup             
	//  150  258:iconst_3        
	//  151  259:ldc2            #408 <Int 32>
	//  152  262:bastore         
	//  153  263:dup             
	//  154  264:iconst_4        
	//  155  265:ldc2            #408 <Int 32>
	//  156  268:bastore         
	//  157  269:dup             
	//  158  270:iconst_5        
	//  159  271:ldc2            #408 <Int 32>
	//  160  274:bastore         
	//  161  275:dup             
	//  162  276:bipush          6
	//  163  278:ldc2            #408 <Int 32>
	//  164  281:bastore         
	//  165  282:dup             
	//  166  283:bipush          7
	//  167  285:ldc2            #408 <Int 32>
	//  168  288:bastore         
	//  169  289:dup             
	//  170  290:bipush          8
	//  171  292:ldc2            #408 <Int 32>
	//  172  295:bastore         
	//  173  296:dup             
	//  174  297:bipush          9
	//  175  299:ldc2            #408 <Int 32>
	//  176  302:bastore         
	//  177  303:dup             
	//  178  304:bipush          10
	//  179  306:ldc2            #408 <Int 32>
	//  180  309:bastore         
	//  181  310:dup             
	//  182  311:bipush          11
	//  183  313:ldc2            #408 <Int 32>
	//  184  316:bastore         
	//  185  317:putstatic       #414 <Field byte[] SUBRIP_TIMECODE_EMPTY>
	//  186  320:ldc2            #416 <String "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text">
	//  187  323:invokestatic    #422 <Method byte[] Util.getUtf8Bytes(String)>
	//  188  326:putstatic       #424 <Field byte[] SSA_DIALOGUE_FORMAT>
	//  189  329:bipush          32
	//  190  331:newarray        byte[]
	//  191  333:dup             
	//  192  334:iconst_0        
	//  193  335:ldc2            #425 <Int 68>
	//  194  338:bastore         
	//  195  339:dup             
	//  196  340:iconst_1        
	//  197  341:ldc2            #426 <Int 105>
	//  198  344:bastore         
	//  199  345:dup             
	//  200  346:iconst_2        
	//  201  347:ldc2            #427 <Int 97>
	//  202  350:bastore         
	//  203  351:dup             
	//  204  352:iconst_3        
	//  205  353:ldc2            #428 <Int 108>
	//  206  356:bastore         
	//  207  357:dup             
	//  208  358:iconst_4        
	//  209  359:ldc2            #429 <Int 111>
	//  210  362:bastore         
	//  211  363:dup             
	//  212  364:iconst_5        
	//  213  365:ldc2            #430 <Int 103>
	//  214  368:bastore         
	//  215  369:dup             
	//  216  370:bipush          6
	//  217  372:ldc2            #431 <Int 117>
	//  218  375:bastore         
	//  219  376:dup             
	//  220  377:bipush          7
	//  221  379:ldc2            #432 <Int 101>
	//  222  382:bastore         
	//  223  383:dup             
	//  224  384:bipush          8
	//  225  386:ldc2            #406 <Int 58>
	//  226  389:bastore         
	//  227  390:dup             
	//  228  391:bipush          9
	//  229  393:ldc2            #408 <Int 32>
	//  230  396:bastore         
	//  231  397:dup             
	//  232  398:bipush          10
	//  233  400:ldc2            #405 <Int 48>
	//  234  403:bastore         
	//  235  404:dup             
	//  236  405:bipush          11
	//  237  407:ldc2            #406 <Int 58>
	//  238  410:bastore         
	//  239  411:dup             
	//  240  412:bipush          12
	//  241  414:ldc2            #405 <Int 48>
	//  242  417:bastore         
	//  243  418:dup             
	//  244  419:bipush          13
	//  245  421:ldc2            #405 <Int 48>
	//  246  424:bastore         
	//  247  425:dup             
	//  248  426:bipush          14
	//  249  428:ldc2            #406 <Int 58>
	//  250  431:bastore         
	//  251  432:dup             
	//  252  433:bipush          15
	//  253  435:ldc2            #405 <Int 48>
	//  254  438:bastore         
	//  255  439:dup             
	//  256  440:bipush          16
	//  257  442:ldc2            #405 <Int 48>
	//  258  445:bastore         
	//  259  446:dup             
	//  260  447:bipush          17
	//  261  449:ldc2            #406 <Int 58>
	//  262  452:bastore         
	//  263  453:dup             
	//  264  454:bipush          18
	//  265  456:ldc2            #405 <Int 48>
	//  266  459:bastore         
	//  267  460:dup             
	//  268  461:bipush          19
	//  269  463:ldc2            #405 <Int 48>
	//  270  466:bastore         
	//  271  467:dup             
	//  272  468:bipush          20
	//  273  470:ldc2            #407 <Int 44>
	//  274  473:bastore         
	//  275  474:dup             
	//  276  475:bipush          21
	//  277  477:ldc2            #405 <Int 48>
	//  278  480:bastore         
	//  279  481:dup             
	//  280  482:bipush          22
	//  281  484:ldc2            #406 <Int 58>
	//  282  487:bastore         
	//  283  488:dup             
	//  284  489:bipush          23
	//  285  491:ldc2            #405 <Int 48>
	//  286  494:bastore         
	//  287  495:dup             
	//  288  496:bipush          24
	//  289  498:ldc2            #405 <Int 48>
	//  290  501:bastore         
	//  291  502:dup             
	//  292  503:bipush          25
	//  293  505:ldc2            #406 <Int 58>
	//  294  508:bastore         
	//  295  509:dup             
	//  296  510:bipush          26
	//  297  512:ldc2            #405 <Int 48>
	//  298  515:bastore         
	//  299  516:dup             
	//  300  517:bipush          27
	//  301  519:ldc2            #405 <Int 48>
	//  302  522:bastore         
	//  303  523:dup             
	//  304  524:bipush          28
	//  305  526:ldc2            #406 <Int 58>
	//  306  529:bastore         
	//  307  530:dup             
	//  308  531:bipush          29
	//  309  533:ldc2            #405 <Int 48>
	//  310  536:bastore         
	//  311  537:dup             
	//  312  538:bipush          30
	//  313  540:ldc2            #405 <Int 48>
	//  314  543:bastore         
	//  315  544:dup             
	//  316  545:bipush          31
	//  317  547:ldc2            #407 <Int 44>
	//  318  550:bastore         
	//  319  551:putstatic       #434 <Field byte[] SSA_PREFIX>
	//  320  554:bipush          10
	//  321  556:newarray        byte[]
	//  322  558:dup             
	//  323  559:iconst_0        
	//  324  560:ldc2            #408 <Int 32>
	//  325  563:bastore         
	//  326  564:dup             
	//  327  565:iconst_1        
	//  328  566:ldc2            #408 <Int 32>
	//  329  569:bastore         
	//  330  570:dup             
	//  331  571:iconst_2        
	//  332  572:ldc2            #408 <Int 32>
	//  333  575:bastore         
	//  334  576:dup             
	//  335  577:iconst_3        
	//  336  578:ldc2            #408 <Int 32>
	//  337  581:bastore         
	//  338  582:dup             
	//  339  583:iconst_4        
	//  340  584:ldc2            #408 <Int 32>
	//  341  587:bastore         
	//  342  588:dup             
	//  343  589:iconst_5        
	//  344  590:ldc2            #408 <Int 32>
	//  345  593:bastore         
	//  346  594:dup             
	//  347  595:bipush          6
	//  348  597:ldc2            #408 <Int 32>
	//  349  600:bastore         
	//  350  601:dup             
	//  351  602:bipush          7
	//  352  604:ldc2            #408 <Int 32>
	//  353  607:bastore         
	//  354  608:dup             
	//  355  609:bipush          8
	//  356  611:ldc2            #408 <Int 32>
	//  357  614:bastore         
	//  358  615:dup             
	//  359  616:bipush          9
	//  360  618:ldc2            #408 <Int 32>
	//  361  621:bastore         
	//  362  622:putstatic       #436 <Field byte[] SSA_TIMECODE_EMPTY>
	//  363  625:new             #438 <Class UUID>
	//  364  628:dup             
	//  365  629:ldc2w           #439 <Long 0x1000L>
	//  366  632:ldc2w           #441 <Long 0x389b71L>
	//  367  635:invokespecial   #445 <Method void UUID(long, long)>
	//  368  638:putstatic       #447 <Field UUID WAVE_SUBFORMAT_PCM>
	//* 369  641:return          
	}


/*
	static byte[] access$300()
	{
		return SSA_DIALOGUE_FORMAT;
	//    0    0:getstatic       #424 <Field byte[] SSA_DIALOGUE_FORMAT>
	//    1    3:areturn         
	}

*/


/*
	static UUID access$400()
	{
		return WAVE_SUBFORMAT_PCM;
	//    0    0:getstatic       #447 <Field UUID WAVE_SUBFORMAT_PCM>
	//    1    3:areturn         
	}

*/
}
