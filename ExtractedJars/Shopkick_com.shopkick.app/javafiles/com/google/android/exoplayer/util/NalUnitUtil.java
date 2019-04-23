// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;

import java.nio.ByteBuffer;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer.util:
//			Assertions, ParsableByteArray, CodecSpecificDataUtil, ParsableBitArray

public final class NalUnitUtil
{
	public static final class PpsData
	{

		public final boolean bottomFieldPicOrderInFramePresentFlag;
		public final int picParameterSetId;
		public final int seqParameterSetId;

		public PpsData(int i, int j, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			picParameterSetId = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #19  <Field int picParameterSetId>
			seqParameterSetId = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #21  <Field int seqParameterSetId>
			bottomFieldPicOrderInFramePresentFlag = flag;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #23  <Field boolean bottomFieldPicOrderInFramePresentFlag>
		//   11   19:return          
		}
	}

	public static final class SpsData
	{

		public final boolean deltaPicOrderAlwaysZeroFlag;
		public final boolean frameMbsOnlyFlag;
		public final int frameNumLength;
		public final int height;
		public final int picOrderCntLsbLength;
		public final int picOrderCountType;
		public final float pixelWidthAspectRatio;
		public final boolean separateColorPlaneFlag;
		public final int seqParameterSetId;
		public final int width;

		public SpsData(int i, int j, int k, float f, boolean flag, boolean flag1, int l, 
				int i1, int j1, boolean flag2)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			seqParameterSetId = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #27  <Field int seqParameterSetId>
			width = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #29  <Field int width>
			height = k;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #31  <Field int height>
			pixelWidthAspectRatio = f;
		//   11   19:aload_0         
		//   12   20:fload           4
		//   13   22:putfield        #33  <Field float pixelWidthAspectRatio>
			separateColorPlaneFlag = flag;
		//   14   25:aload_0         
		//   15   26:iload           5
		//   16   28:putfield        #35  <Field boolean separateColorPlaneFlag>
			frameMbsOnlyFlag = flag1;
		//   17   31:aload_0         
		//   18   32:iload           6
		//   19   34:putfield        #37  <Field boolean frameMbsOnlyFlag>
			frameNumLength = l;
		//   20   37:aload_0         
		//   21   38:iload           7
		//   22   40:putfield        #39  <Field int frameNumLength>
			picOrderCountType = i1;
		//   23   43:aload_0         
		//   24   44:iload           8
		//   25   46:putfield        #41  <Field int picOrderCountType>
			picOrderCntLsbLength = j1;
		//   26   49:aload_0         
		//   27   50:iload           9
		//   28   52:putfield        #43  <Field int picOrderCntLsbLength>
			deltaPicOrderAlwaysZeroFlag = flag2;
		//   29   55:aload_0         
		//   30   56:iload           10
		//   31   58:putfield        #45  <Field boolean deltaPicOrderAlwaysZeroFlag>
		//   32   61:return          
		}
	}


	private NalUnitUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
	//    2    4:return          
	}

	public static void clearPrefixFlags(boolean aflag[])
	{
		aflag[0] = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:bastore         
		aflag[1] = false;
	//    4    4:aload_0         
	//    5    5:iconst_1        
	//    6    6:iconst_0        
	//    7    7:bastore         
		aflag[2] = false;
	//    8    8:aload_0         
	//    9    9:iconst_2        
	//   10   10:iconst_0        
	//   11   11:bastore         
	//   12   12:return          
	}

	public static void discardToSps(ByteBuffer bytebuffer)
	{
		int i1 = bytebuffer.position();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method int ByteBuffer.position()>
	//    2    4:istore          5
		int k = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int i = k;
	//    5    8:iload_3         
	//    6    9:istore_1        
		do
		{
			int l = k + 1;
	//    7   10:iload_3         
	//    8   11:iconst_1        
	//    9   12:iadd            
	//   10   13:istore          4
			if(l < i1)
	//*  11   15:iload           4
	//*  12   17:iload           5
	//*  13   19:icmpge          125
			{
				int j1 = bytebuffer.get(k) & 0xff;
	//   14   22:aload_0         
	//   15   23:iload_3         
	//   16   24:invokevirtual   #71  <Method byte ByteBuffer.get(int)>
	//   17   27:sipush          255
	//   18   30:iand            
	//   19   31:istore          6
				int j;
				if(i == 3)
	//*  20   33:iload_1         
	//*  21   34:iconst_3        
	//*  22   35:icmpne          99
				{
					j = i;
	//   23   38:iload_1         
	//   24   39:istore_2        
					if(j1 == 1)
	//*  25   40:iload           6
	//*  26   42:iconst_1        
	//*  27   43:icmpne          110
					{
						j = i;
	//   28   46:iload_1         
	//   29   47:istore_2        
						if((bytebuffer.get(l) & 0x1f) == 7)
	//*  30   48:aload_0         
	//*  31   49:iload           4
	//*  32   51:invokevirtual   #71  <Method byte ByteBuffer.get(int)>
	//*  33   54:bipush          31
	//*  34   56:iand            
	//*  35   57:bipush          7
	//*  36   59:icmpne          110
						{
							ByteBuffer bytebuffer1 = bytebuffer.duplicate();
	//   37   62:aload_0         
	//   38   63:invokevirtual   #75  <Method ByteBuffer ByteBuffer.duplicate()>
	//   39   66:astore          7
							bytebuffer1.position(k - 3);
	//   40   68:aload           7
	//   41   70:iload_3         
	//   42   71:iconst_3        
	//   43   72:isub            
	//   44   73:invokevirtual   #78  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   45   76:pop             
							bytebuffer1.limit(i1);
	//   46   77:aload           7
	//   47   79:iload           5
	//   48   81:invokevirtual   #81  <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   49   84:pop             
							bytebuffer.position(0);
	//   50   85:aload_0         
	//   51   86:iconst_0        
	//   52   87:invokevirtual   #78  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   53   90:pop             
							bytebuffer.put(bytebuffer1);
	//   54   91:aload_0         
	//   55   92:aload           7
	//   56   94:invokevirtual   #85  <Method ByteBuffer ByteBuffer.put(ByteBuffer)>
	//   57   97:pop             
							return;
	//   58   98:return          
						}
					}
				} else
				{
					j = i;
	//   59   99:iload_1         
	//   60  100:istore_2        
					if(j1 == 0)
	//*  61  101:iload           6
	//*  62  103:ifne            110
						j = i + 1;
	//   63  106:iload_1         
	//   64  107:iconst_1        
	//   65  108:iadd            
	//   66  109:istore_2        
				}
				i = j;
	//   67  110:iload_2         
	//   68  111:istore_1        
				if(j1 != 0)
	//*  69  112:iload           6
	//*  70  114:ifeq            119
					i = 0;
	//   71  117:iconst_0        
	//   72  118:istore_1        
				k = l;
	//   73  119:iload           4
	//   74  121:istore_3        
			} else
	//*  75  122:goto            10
			{
				bytebuffer.clear();
	//   76  125:aload_0         
	//   77  126:invokevirtual   #89  <Method java.nio.Buffer ByteBuffer.clear()>
	//   78  129:pop             
				return;
	//   79  130:return          
			}
		} while(true);
	}

	public static int findNalUnit(byte abyte0[], int i, int j, boolean aflag[])
	{
		int k = j - i;
	//    0    0:iload_2         
	//    1    1:iload_1         
	//    2    2:isub            
	//    3    3:istore          4
		boolean flag2 = false;
	//    4    5:iconst_0        
	//    5    6:istore          8
		boolean flag;
		if(k >= 0)
	//*   6    8:iload           4
	//*   7   10:iflt            19
			flag = true;
	//    8   13:iconst_1        
	//    9   14:istore          7
		else
	//*  10   16:goto            22
			flag = false;
	//   11   19:iconst_0        
	//   12   20:istore          7
		Assertions.checkState(flag);
	//   13   22:iload           7
	//   14   24:invokestatic    #97  <Method void Assertions.checkState(boolean)>
		if(k == 0)
	//*  15   27:iload           4
	//*  16   29:ifne            34
			return j;
	//   17   32:iload_2         
	//   18   33:ireturn         
		if(aflag != null)
	//*  19   34:aload_3         
	//*  20   35:ifnull          114
		{
			if(aflag[0])
	//*  21   38:aload_3         
	//*  22   39:iconst_0        
	//*  23   40:baload          
	//*  24   41:ifeq            52
			{
				clearPrefixFlags(aflag);
	//   25   44:aload_3         
	//   26   45:invokestatic    #99  <Method void clearPrefixFlags(boolean[])>
				return i - 3;
	//   27   48:iload_1         
	//   28   49:iconst_3        
	//   29   50:isub            
	//   30   51:ireturn         
			}
			if(k > 1 && aflag[1] && abyte0[i] == 1)
	//*  31   52:iload           4
	//*  32   54:iconst_1        
	//*  33   55:icmple          79
	//*  34   58:aload_3         
	//*  35   59:iconst_1        
	//*  36   60:baload          
	//*  37   61:ifeq            79
	//*  38   64:aload_0         
	//*  39   65:iload_1         
	//*  40   66:baload          
	//*  41   67:iconst_1        
	//*  42   68:icmpne          79
			{
				clearPrefixFlags(aflag);
	//   43   71:aload_3         
	//   44   72:invokestatic    #99  <Method void clearPrefixFlags(boolean[])>
				return i - 2;
	//   45   75:iload_1         
	//   46   76:iconst_2        
	//   47   77:isub            
	//   48   78:ireturn         
			}
			if(k > 2 && aflag[2] && abyte0[i] == 0 && abyte0[i + 1] == 1)
	//*  49   79:iload           4
	//*  50   81:iconst_2        
	//*  51   82:icmple          114
	//*  52   85:aload_3         
	//*  53   86:iconst_2        
	//*  54   87:baload          
	//*  55   88:ifeq            114
	//*  56   91:aload_0         
	//*  57   92:iload_1         
	//*  58   93:baload          
	//*  59   94:ifne            114
	//*  60   97:aload_0         
	//*  61   98:iload_1         
	//*  62   99:iconst_1        
	//*  63  100:iadd            
	//*  64  101:baload          
	//*  65  102:iconst_1        
	//*  66  103:icmpne          114
			{
				clearPrefixFlags(aflag);
	//   67  106:aload_3         
	//   68  107:invokestatic    #99  <Method void clearPrefixFlags(boolean[])>
				return i - 1;
	//   69  110:iload_1         
	//   70  111:iconst_1        
	//   71  112:isub            
	//   72  113:ireturn         
			}
		}
		int l = j - 1;
	//   73  114:iload_2         
	//   74  115:iconst_1        
	//   75  116:isub            
	//   76  117:istore          5
		for(i += 2; i < l; i += 3)
	//*  77  119:iload_1         
	//*  78  120:iconst_2        
	//*  79  121:iadd            
	//*  80  122:istore_1        
	//*  81  123:iload_1         
	//*  82  124:iload           5
	//*  83  126:icmpge          191
		{
			if((abyte0[i] & 0xfe) != 0)
	//*  84  129:aload_0         
	//*  85  130:iload_1         
	//*  86  131:baload          
	//*  87  132:sipush          254
	//*  88  135:iand            
	//*  89  136:ifeq            142
				continue;
	//   90  139:goto            184
			int i1 = i - 2;
	//   91  142:iload_1         
	//   92  143:iconst_2        
	//   93  144:isub            
	//   94  145:istore          6
			if(abyte0[i1] == 0 && abyte0[i - 1] == 0 && abyte0[i] == 1)
	//*  95  147:aload_0         
	//*  96  148:iload           6
	//*  97  150:baload          
	//*  98  151:ifne            180
	//*  99  154:aload_0         
	//* 100  155:iload_1         
	//* 101  156:iconst_1        
	//* 102  157:isub            
	//* 103  158:baload          
	//* 104  159:ifne            180
	//* 105  162:aload_0         
	//* 106  163:iload_1         
	//* 107  164:baload          
	//* 108  165:iconst_1        
	//* 109  166:icmpne          180
			{
				if(aflag != null)
	//* 110  169:aload_3         
	//* 111  170:ifnull          177
					clearPrefixFlags(aflag);
	//  112  173:aload_3         
	//  113  174:invokestatic    #99  <Method void clearPrefixFlags(boolean[])>
				return i1;
	//  114  177:iload           6
	//  115  179:ireturn         
			}
			i -= 2;
	//  116  180:iload_1         
	//  117  181:iconst_2        
	//  118  182:isub            
	//  119  183:istore_1        
		}

	//  120  184:iload_1         
	//  121  185:iconst_3        
	//  122  186:iadd            
	//  123  187:istore_1        
	//* 124  188:goto            123
		if(aflag != null)
	//* 125  191:aload_3         
	//* 126  192:ifnull          357
		{
			boolean flag1;
			if(k <= 2 ? k != 2 ? !aflag[1] || abyte0[l] != 1 : !aflag[2] || abyte0[j - 2] != 0 || abyte0[l] != 1 : abyte0[j - 3] != 0 || abyte0[j - 2] != 0 || abyte0[l] != 1)
	//* 127  195:iload           4
	//* 128  197:iconst_2        
	//* 129  198:icmple          234
	//* 130  201:aload_0         
	//* 131  202:iload_2         
	//* 132  203:iconst_3        
	//* 133  204:isub            
	//* 134  205:baload          
	//* 135  206:ifne            228
	//* 136  209:aload_0         
	//* 137  210:iload_2         
	//* 138  211:iconst_2        
	//* 139  212:isub            
	//* 140  213:baload          
	//* 141  214:ifne            228
	//* 142  217:aload_0         
	//* 143  218:iload           5
	//* 144  220:baload          
	//* 145  221:iconst_1        
	//* 146  222:icmpne          228
	//* 147  225:goto            279
				flag1 = false;
	//  148  228:iconst_0        
	//  149  229:istore          7
			else
	//* 150  231:goto            282
	//* 151  234:iload           4
	//* 152  236:iconst_2        
	//* 153  237:icmpne          265
	//* 154  240:aload_3         
	//* 155  241:iconst_2        
	//* 156  242:baload          
	//* 157  243:ifeq            228
	//* 158  246:aload_0         
	//* 159  247:iload_2         
	//* 160  248:iconst_2        
	//* 161  249:isub            
	//* 162  250:baload          
	//* 163  251:ifne            228
	//* 164  254:aload_0         
	//* 165  255:iload           5
	//* 166  257:baload          
	//* 167  258:iconst_1        
	//* 168  259:icmpne          228
	//* 169  262:goto            279
	//* 170  265:aload_3         
	//* 171  266:iconst_1        
	//* 172  267:baload          
	//* 173  268:ifeq            228
	//* 174  271:aload_0         
	//* 175  272:iload           5
	//* 176  274:baload          
	//* 177  275:iconst_1        
	//* 178  276:icmpne          228
				flag1 = true;
	//  179  279:iconst_1        
	//  180  280:istore          7
			aflag[0] = flag1;
	//  181  282:aload_3         
	//  182  283:iconst_0        
	//  183  284:iload           7
	//  184  286:bastore         
			if(k <= 1 ? aflag[2] && abyte0[l] == 0 : abyte0[j - 2] == 0 && abyte0[l] == 0)
	//* 185  287:iload           4
	//* 186  289:iconst_1        
	//* 187  290:icmple          311
	//* 188  293:aload_0         
	//* 189  294:iload_2         
	//* 190  295:iconst_2        
	//* 191  296:isub            
	//* 192  297:baload          
	//* 193  298:ifne            330
	//* 194  301:aload_0         
	//* 195  302:iload           5
	//* 196  304:baload          
	//* 197  305:ifne            330
	//* 198  308:goto            324
	//* 199  311:aload_3         
	//* 200  312:iconst_2        
	//* 201  313:baload          
	//* 202  314:ifeq            330
	//* 203  317:aload_0         
	//* 204  318:iload           5
	//* 205  320:baload          
	//* 206  321:ifne            330
				flag1 = true;
	//  207  324:iconst_1        
	//  208  325:istore          7
			else
	//* 209  327:goto            333
				flag1 = false;
	//  210  330:iconst_0        
	//  211  331:istore          7
			aflag[1] = flag1;
	//  212  333:aload_3         
	//  213  334:iconst_1        
	//  214  335:iload           7
	//  215  337:bastore         
			flag1 = flag2;
	//  216  338:iload           8
	//  217  340:istore          7
			if(abyte0[l] == 0)
	//* 218  342:aload_0         
	//* 219  343:iload           5
	//* 220  345:baload          
	//* 221  346:ifne            352
				flag1 = true;
	//  222  349:iconst_1        
	//  223  350:istore          7
			aflag[2] = flag1;
	//  224  352:aload_3         
	//  225  353:iconst_2        
	//  226  354:iload           7
	//  227  356:bastore         
		}
		return j;
	//  228  357:iload_2         
	//  229  358:ireturn         
	}

	private static int findNextUnescapeIndex(byte abyte0[], int i, int j)
	{
		for(; i < j - 2; i++)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:iconst_2        
	//*   3    3:isub            
	//*   4    4:icmpge          39
			if(abyte0[i] == 0 && abyte0[i + 1] == 0 && abyte0[i + 2] == 3)
	//*   5    7:aload_0         
	//*   6    8:iload_1         
	//*   7    9:baload          
	//*   8   10:ifne            32
	//*   9   13:aload_0         
	//*  10   14:iload_1         
	//*  11   15:iconst_1        
	//*  12   16:iadd            
	//*  13   17:baload          
	//*  14   18:ifne            32
	//*  15   21:aload_0         
	//*  16   22:iload_1         
	//*  17   23:iconst_2        
	//*  18   24:iadd            
	//*  19   25:baload          
	//*  20   26:iconst_3        
	//*  21   27:icmpne          32
				return i;
	//   22   30:iload_1         
	//   23   31:ireturn         

	//   24   32:iload_1         
	//   25   33:iconst_1        
	//   26   34:iadd            
	//   27   35:istore_1        
	//*  28   36:goto            0
		return j;
	//   29   39:iload_2         
	//   30   40:ireturn         
	}

	public static int getH265NalUnitType(byte abyte0[], int i)
	{
		return (abyte0[i + 3] & 0x7e) >> 1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_3        
	//    3    3:iadd            
	//    4    4:baload          
	//    5    5:bipush          126
	//    6    7:iand            
	//    7    8:iconst_1        
	//    8    9:ishr            
	//    9   10:ireturn         
	}

	public static int getNalUnitType(byte abyte0[], int i)
	{
		return abyte0[i + 3] & 0x1f;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_3        
	//    3    3:iadd            
	//    4    4:baload          
	//    5    5:bipush          31
	//    6    7:iand            
	//    7    8:ireturn         
	}

	public static byte[] parseChildNalUnit(ParsableByteArray parsablebytearray)
	{
		int i = parsablebytearray.readUnsignedShort();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #111 <Method int ParsableByteArray.readUnsignedShort()>
	//    2    4:istore_1        
		int j = parsablebytearray.getPosition();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #114 <Method int ParsableByteArray.getPosition()>
	//    5    9:istore_2        
		parsablebytearray.skipBytes(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokevirtual   #118 <Method void ParsableByteArray.skipBytes(int)>
		return CodecSpecificDataUtil.buildNalUnit(parsablebytearray.data, j, i);
	//    9   15:aload_0         
	//   10   16:getfield        #121 <Field byte[] ParsableByteArray.data>
	//   11   19:iload_2         
	//   12   20:iload_1         
	//   13   21:invokestatic    #127 <Method byte[] CodecSpecificDataUtil.buildNalUnit(byte[], int, int)>
	//   14   24:areturn         
	}

	public static PpsData parsePpsNalUnit(ParsableBitArray parsablebitarray)
	{
		int i = parsablebitarray.readUnsignedExpGolombCodedInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #134 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//    2    4:istore_1        
		int j = parsablebitarray.readUnsignedExpGolombCodedInt();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #134 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//    5    9:istore_2        
		parsablebitarray.skipBits(1);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:invokevirtual   #137 <Method void ParsableBitArray.skipBits(int)>
		return new PpsData(i, j, parsablebitarray.readBit());
	//    9   15:new             #6   <Class NalUnitUtil$PpsData>
	//   10   18:dup             
	//   11   19:iload_1         
	//   12   20:iload_2         
	//   13   21:aload_0         
	//   14   22:invokevirtual   #141 <Method boolean ParsableBitArray.readBit()>
	//   15   25:invokespecial   #144 <Method void NalUnitUtil$PpsData(int, int, boolean)>
	//   16   28:areturn         
	}

	public static SpsData parseSpsNalUnit(ParsableBitArray parsablebitarray)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:668)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #148 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #150 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:668)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #155 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	private static void skipScalingList(ParsableBitArray parsablebitarray, int i)
	{
		int i1 = 8;
	//    0    0:bipush          8
	//    1    2:istore          5
		int k = 0;
	//    2    4:iconst_0        
	//    3    5:istore_3        
		int l = 8;
	//    4    6:bipush          8
	//    5    8:istore          4
		while(k < i) 
	//*   6   10:iload_3         
	//*   7   11:iload_1         
	//*   8   12:icmpge          59
		{
			int j = i1;
	//    9   15:iload           5
	//   10   17:istore_2        
			if(i1 != 0)
	//*  11   18:iload           5
	//*  12   20:ifeq            39
				j = (parsablebitarray.readSignedExpGolombCodedInt() + l + 256) % 256;
	//   13   23:aload_0         
	//   14   24:invokevirtual   #160 <Method int ParsableBitArray.readSignedExpGolombCodedInt()>
	//   15   27:iload           4
	//   16   29:iadd            
	//   17   30:sipush          256
	//   18   33:iadd            
	//   19   34:sipush          256
	//   20   37:irem            
	//   21   38:istore_2        
			if(j != 0)
	//*  22   39:iload_2         
	//*  23   40:ifne            46
	//*  24   43:goto            49
				l = j;
	//   25   46:iload_2         
	//   26   47:istore          4
			k++;
	//   27   49:iload_3         
	//   28   50:iconst_1        
	//   29   51:iadd            
	//   30   52:istore_3        
			i1 = j;
	//   31   53:iload_2         
	//   32   54:istore          5
		}
	//*  33   56:goto            10
	//   34   59:return          
	}

	public static int unescapeStream(byte abyte0[], int i)
	{
		Object obj = scratchEscapePositionsLock;
	//    0    0:getstatic       #54  <Field Object scratchEscapePositionsLock>
	//    1    3:astore          8
		obj;
	//    2    5:aload           8
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		int j;
		int k;
		j = 0;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		k = j;
	//    6   10:iload_2         
	//    7   11:istore_3        
_L2:
		if(j >= i)
			break; /* Loop/switch isn't completed */
	//    8   12:iload_2         
	//    9   13:iload_1         
	//   10   14:icmpge          171
		int l = findNextUnescapeIndex(abyte0, j, i);
	//   11   17:aload_0         
	//   12   18:iload_2         
	//   13   19:iload_1         
	//   14   20:invokestatic    #163 <Method int findNextUnescapeIndex(byte[], int, int)>
	//   15   23:istore          4
		j = l;
	//   16   25:iload           4
	//   17   27:istore_2        
		if(l >= i)
			continue; /* Loop/switch isn't completed */
	//   18   28:iload           4
	//   19   30:iload_1         
	//   20   31:icmpge          12
		if(scratchEscapePositions.length <= k)
	//*  21   34:getstatic       #56  <Field int[] scratchEscapePositions>
	//*  22   37:arraylength     
	//*  23   38:iload_3         
	//*  24   39:icmpgt          57
			scratchEscapePositions = Arrays.copyOf(scratchEscapePositions, scratchEscapePositions.length * 2);
	//   25   42:getstatic       #56  <Field int[] scratchEscapePositions>
	//   26   45:getstatic       #56  <Field int[] scratchEscapePositions>
	//   27   48:arraylength     
	//   28   49:iconst_2        
	//   29   50:imul            
	//   30   51:invokestatic    #169 <Method int[] Arrays.copyOf(int[], int)>
	//   31   54:putstatic       #56  <Field int[] scratchEscapePositions>
		scratchEscapePositions[k] = l;
	//   32   57:getstatic       #56  <Field int[] scratchEscapePositions>
	//   33   60:iload_3         
	//   34   61:iload           4
	//   35   63:iastore         
		j = l + 3;
	//   36   64:iload           4
	//   37   66:iconst_3        
	//   38   67:iadd            
	//   39   68:istore_2        
		k++;
	//   40   69:iload_3         
	//   41   70:iconst_1        
	//   42   71:iadd            
	//   43   72:istore_3        
		if(true) goto _L2; else goto _L1
	//   44   73:goto            12
_L5:
		if(j >= k)
			break MISSING_BLOCK_LABEL_143;
	//   45   76:iload_2         
	//   46   77:iload_3         
	//   47   78:icmpge          143
		int i1;
		i1 = scratchEscapePositions[j] - i;
	//   48   81:getstatic       #56  <Field int[] scratchEscapePositions>
	//   49   84:iload_2         
	//   50   85:iaload          
	//   51   86:iload_1         
	//   52   87:isub            
	//   53   88:istore          5
		System.arraycopy(((Object) (abyte0)), i, ((Object) (abyte0)), l, i1);
	//   54   90:aload_0         
	//   55   91:iload_1         
	//   56   92:aload_0         
	//   57   93:iload           4
	//   58   95:iload           5
	//   59   97:invokestatic    #175 <Method void System.arraycopy(Object, int, Object, int, int)>
		l += i1;
	//   60  100:iload           4
	//   61  102:iload           5
	//   62  104:iadd            
	//   63  105:istore          4
		int l1 = l + 1;
	//   64  107:iload           4
	//   65  109:iconst_1        
	//   66  110:iadd            
	//   67  111:istore          7
		abyte0[l] = 0;
	//   68  113:aload_0         
	//   69  114:iload           4
	//   70  116:iconst_0        
	//   71  117:bastore         
		l = l1 + 1;
	//   72  118:iload           7
	//   73  120:iconst_1        
	//   74  121:iadd            
	//   75  122:istore          4
		abyte0[l1] = 0;
	//   76  124:aload_0         
	//   77  125:iload           7
	//   78  127:iconst_0        
	//   79  128:bastore         
		i += i1 + 3;
	//   80  129:iload_1         
	//   81  130:iload           5
	//   82  132:iconst_3        
	//   83  133:iadd            
	//   84  134:iadd            
	//   85  135:istore_1        
		j++;
	//   86  136:iload_2         
	//   87  137:iconst_1        
	//   88  138:iadd            
	//   89  139:istore_2        
		continue; /* Loop/switch isn't completed */
	//   90  140:goto            76
		int k1;
		System.arraycopy(((Object) (abyte0)), i, ((Object) (abyte0)), l, k1 - l);
	//   91  143:aload_0         
	//   92  144:iload_1         
	//   93  145:aload_0         
	//   94  146:iload           4
	//   95  148:iload           6
	//   96  150:iload           4
	//   97  152:isub            
	//   98  153:invokestatic    #175 <Method void System.arraycopy(Object, int, Object, int, int)>
		obj;
	//   99  156:aload           8
		JVM INSTR monitorexit ;
	//  100  158:monitorexit     
		return k1;
	//  101  159:iload           6
	//  102  161:ireturn         
_L3:
		obj;
	//  103  162:aload           8
		JVM INSTR monitorexit ;
	//  104  164:monitorexit     
		throw abyte0;
	//  105  165:aload_0         
	//  106  166:athrow          
		abyte0;
	//  107  167:astore_0        
		if(true) goto _L3; else goto _L1
	//  108  168:goto            162
_L1:
		k1 = i - k;
	//  109  171:iload_1         
	//  110  172:iload_3         
	//  111  173:isub            
	//  112  174:istore          6
		j = 0;
	//  113  176:iconst_0        
	//  114  177:istore_2        
		i = j;
	//  115  178:iload_2         
	//  116  179:istore_1        
		int j1 = i;
	//  117  180:iload_1         
	//  118  181:istore          5
		l = i;
	//  119  183:iload_1         
	//  120  184:istore          4
		i = j1;
	//  121  186:iload           5
	//  122  188:istore_1        
		if(true) goto _L5; else goto _L4
	//  123  189:goto            76
_L4:
	}

	public static final float ASPECT_RATIO_IDC_VALUES[] = {
		1.0F, 1.0F, 1.090909F, 0.9090909F, 1.454545F, 1.212121F, 2.181818F, 1.818182F, 2.909091F, 2.424242F, 
		1.636364F, 1.363636F, 1.939394F, 1.616162F, 1.333333F, 1.5F, 2.0F
	};
	public static final int EXTENDED_SAR = 255;
	public static final byte NAL_START_CODE[] = {
		0, 0, 0, 1
	};
	private static final int NAL_UNIT_TYPE_SPS = 7;
	private static final String TAG = "NalUnitUtil";
	private static int scratchEscapePositions[] = new int[10];
	private static final Object scratchEscapePositionsLock = new Object();

	static 
	{
	//    0    0:iconst_4        
	//    1    1:newarray        byte[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #30  <Int 0>
	//    5    7:bastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:ldc1            #30  <Int 0>
	//    9   12:bastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:ldc1            #30  <Int 0>
	//   13   17:bastore         
	//   14   18:dup             
	//   15   19:iconst_3        
	//   16   20:ldc1            #31  <Int 1>
	//   17   22:bastore         
	//   18   23:putstatic       #33  <Field byte[] NAL_START_CODE>
	//   19   26:bipush          17
	//   20   28:newarray        float[]
	//   21   30:dup             
	//   22   31:iconst_0        
	//   23   32:fconst_1        
	//   24   33:fastore         
	//   25   34:dup             
	//   26   35:iconst_1        
	//   27   36:fconst_1        
	//   28   37:fastore         
	//   29   38:dup             
	//   30   39:iconst_2        
	//   31   40:ldc1            #34  <Float 1.090909F>
	//   32   42:fastore         
	//   33   43:dup             
	//   34   44:iconst_3        
	//   35   45:ldc1            #35  <Float 0.9090909F>
	//   36   47:fastore         
	//   37   48:dup             
	//   38   49:iconst_4        
	//   39   50:ldc1            #36  <Float 1.454545F>
	//   40   52:fastore         
	//   41   53:dup             
	//   42   54:iconst_5        
	//   43   55:ldc1            #37  <Float 1.212121F>
	//   44   57:fastore         
	//   45   58:dup             
	//   46   59:bipush          6
	//   47   61:ldc1            #38  <Float 2.181818F>
	//   48   63:fastore         
	//   49   64:dup             
	//   50   65:bipush          7
	//   51   67:ldc1            #39  <Float 1.818182F>
	//   52   69:fastore         
	//   53   70:dup             
	//   54   71:bipush          8
	//   55   73:ldc1            #40  <Float 2.909091F>
	//   56   75:fastore         
	//   57   76:dup             
	//   58   77:bipush          9
	//   59   79:ldc1            #41  <Float 2.424242F>
	//   60   81:fastore         
	//   61   82:dup             
	//   62   83:bipush          10
	//   63   85:ldc1            #42  <Float 1.636364F>
	//   64   87:fastore         
	//   65   88:dup             
	//   66   89:bipush          11
	//   67   91:ldc1            #43  <Float 1.363636F>
	//   68   93:fastore         
	//   69   94:dup             
	//   70   95:bipush          12
	//   71   97:ldc1            #44  <Float 1.939394F>
	//   72   99:fastore         
	//   73  100:dup             
	//   74  101:bipush          13
	//   75  103:ldc1            #45  <Float 1.616162F>
	//   76  105:fastore         
	//   77  106:dup             
	//   78  107:bipush          14
	//   79  109:ldc1            #46  <Float 1.333333F>
	//   80  111:fastore         
	//   81  112:dup             
	//   82  113:bipush          15
	//   83  115:ldc1            #47  <Float 1.5F>
	//   84  117:fastore         
	//   85  118:dup             
	//   86  119:bipush          16
	//   87  121:fconst_2        
	//   88  122:fastore         
	//   89  123:putstatic       #49  <Field float[] ASPECT_RATIO_IDC_VALUES>
	//   90  126:new             #4   <Class Object>
	//   91  129:dup             
	//   92  130:invokespecial   #52  <Method void Object()>
	//   93  133:putstatic       #54  <Field Object scratchEscapePositionsLock>
	//   94  136:bipush          10
	//   95  138:newarray        int[]
	//   96  140:putstatic       #56  <Field int[] scratchEscapePositions>
	//*  97  143:return          
	}
}
