// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.mp3;

import android.util.Pair;
import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.extractor.GaplessInfo;
import com.google.android.exoplayer.util.ParsableByteArray;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;
import java.nio.charset.Charset;

final class Id3Util
{

	private Id3Util()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
	//    2    4:return          
	}

	private static boolean canParseMetadata(int i, int j, int k, int l)
	{
		return j != 255 && i >= 2 && i <= 4 && l <= 0x300000 && (i != 2 || (k & 0x3f) == 0 && (k & 0x40) == 0) && (i != 3 || (k & 0x1f) == 0) && (i != 4 || (k & 0xf) == 0);
	//    0    0:iload_1         
	//    1    1:sipush          255
	//    2    4:icmpeq          68
	//    3    7:iload_0         
	//    4    8:iconst_2        
	//    5    9:icmplt          68
	//    6   12:iload_0         
	//    7   13:iconst_4        
	//    8   14:icmpgt          68
	//    9   17:iload_3         
	//   10   18:ldc1            #10  <Int 0x300000>
	//   11   20:icmpgt          68
	//   12   23:iload_0         
	//   13   24:iconst_2        
	//   14   25:icmpne          42
	//   15   28:iload_2         
	//   16   29:bipush          63
	//   17   31:iand            
	//   18   32:ifne            68
	//   19   35:iload_2         
	//   20   36:bipush          64
	//   21   38:iand            
	//   22   39:ifne            68
	//   23   42:iload_0         
	//   24   43:iconst_3        
	//   25   44:icmpne          54
	//   26   47:iload_2         
	//   27   48:bipush          31
	//   28   50:iand            
	//   29   51:ifne            68
	//   30   54:iload_0         
	//   31   55:iconst_4        
	//   32   56:icmpne          66
	//   33   59:iload_2         
	//   34   60:bipush          15
	//   35   62:iand            
	//   36   63:ifne            68
	//   37   66:iconst_1        
	//   38   67:ireturn         
	//   39   68:iconst_0        
	//   40   69:ireturn         
	}

	private static boolean canUnescapeVersion4(ParsableByteArray parsablebytearray, boolean flag)
	{
		parsablebytearray.setPosition(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #52  <Method void ParsableByteArray.setPosition(int)>
		long l;
		for(; parsablebytearray.bytesLeft() >= 10; parsablebytearray.skipBytes((int)l))
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #56  <Method int ParsableByteArray.bytesLeft()>
	//*   5    9:bipush          10
	//*   6   11:icmplt          137
		{
			if(parsablebytearray.readInt() == 0)
	//*   7   14:aload_0         
	//*   8   15:invokevirtual   #59  <Method int ParsableByteArray.readInt()>
	//*   9   18:ifne            23
				return true;
	//   10   21:iconst_1        
	//   11   22:ireturn         
			long l1 = parsablebytearray.readUnsignedInt();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #63  <Method long ParsableByteArray.readUnsignedInt()>
	//   14   27:lstore          4
			l = l1;
	//   15   29:lload           4
	//   16   31:lstore_2        
			if(!flag)
	//*  17   32:iload_1         
	//*  18   33:ifne            95
			{
				if((0x808080L & l1) != 0L)
	//*  19   36:ldc2w           #64  <Long 0x808080L>
	//*  20   39:lload           4
	//*  21   41:land            
	//*  22   42:lconst_0        
	//*  23   43:lcmp            
	//*  24   44:ifeq            49
					return false;
	//   25   47:iconst_0        
	//   26   48:ireturn         
				l = (l1 >> 24 & 127L) << 21 | (l1 & 127L | (l1 >> 8 & 127L) << 7 | (l1 >> 16 & 127L) << 14);
	//   27   49:lload           4
	//   28   51:bipush          24
	//   29   53:lshr            
	//   30   54:ldc2w           #66  <Long 127L>
	//   31   57:land            
	//   32   58:bipush          21
	//   33   60:lshl            
	//   34   61:lload           4
	//   35   63:ldc2w           #66  <Long 127L>
	//   36   66:land            
	//   37   67:lload           4
	//   38   69:bipush          8
	//   39   71:lshr            
	//   40   72:ldc2w           #66  <Long 127L>
	//   41   75:land            
	//   42   76:bipush          7
	//   43   78:lshl            
	//   44   79:lor             
	//   45   80:lload           4
	//   46   82:bipush          16
	//   47   84:lshr            
	//   48   85:ldc2w           #66  <Long 127L>
	//   49   88:land            
	//   50   89:bipush          14
	//   51   91:lshl            
	//   52   92:lor             
	//   53   93:lor             
	//   54   94:lstore_2        
			}
			if(l > (long)(parsablebytearray.bytesLeft() - 2))
	//*  55   95:lload_2         
	//*  56   96:aload_0         
	//*  57   97:invokevirtual   #56  <Method int ParsableByteArray.bytesLeft()>
	//*  58  100:iconst_2        
	//*  59  101:isub            
	//*  60  102:i2l             
	//*  61  103:lcmp            
	//*  62  104:ifle            109
				return false;
	//   63  107:iconst_0        
	//   64  108:ireturn         
			if((1 & parsablebytearray.readUnsignedShort()) != 0 && parsablebytearray.bytesLeft() < 4)
	//*  65  109:iconst_1        
	//*  66  110:aload_0         
	//*  67  111:invokevirtual   #70  <Method int ParsableByteArray.readUnsignedShort()>
	//*  68  114:iand            
	//*  69  115:ifeq            128
	//*  70  118:aload_0         
	//*  71  119:invokevirtual   #56  <Method int ParsableByteArray.bytesLeft()>
	//*  72  122:iconst_4        
	//*  73  123:icmpge          128
				return false;
	//   74  126:iconst_0        
	//   75  127:ireturn         
		}

	//   76  128:aload_0         
	//   77  129:lload_2         
	//   78  130:l2i             
	//   79  131:invokevirtual   #73  <Method void ParsableByteArray.skipBytes(int)>
	//*  80  134:goto            5
		return true;
	//   81  137:iconst_1        
	//   82  138:ireturn         
	}

	private static Pair findNextComment(int i, ParsableByteArray parsablebytearray)
	{
label0:
		do
		{
			int k;
label1:
			{
				int j;
label2:
				{
					Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
					if(i == 2)
	//*   2    3:iload_0         
	//*   3    4:iconst_2        
	//*   4    5:icmpne          79
					{
						if(parsablebytearray.bytesLeft() < 6)
	//*   5    8:aload_1         
	//*   6    9:invokevirtual   #56  <Method int ParsableByteArray.bytesLeft()>
	//*   7   12:bipush          6
	//*   8   14:icmpge          19
							return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
						String s = parsablebytearray.readString(3, Charset.forName("US-ASCII"));
	//   11   19:aload_1         
	//   12   20:iconst_3        
	//   13   21:ldc1            #77  <String "US-ASCII">
	//   14   23:invokestatic    #30  <Method Charset Charset.forName(String)>
	//   15   26:invokevirtual   #81  <Method String ParsableByteArray.readString(int, Charset)>
	//   16   29:astore          5
						if(s.equals("\000\000\0"))
	//*  17   31:aload           5
	//*  18   33:ldc1            #83  <String "\000\000\0">
	//*  19   35:invokevirtual   #89  <Method boolean String.equals(Object)>
	//*  20   38:ifeq            43
							return null;
	//   21   41:aconst_null     
	//   22   42:areturn         
						j = parsablebytearray.readUnsignedInt24();
	//   23   43:aload_1         
	//   24   44:invokevirtual   #92  <Method int ParsableByteArray.readUnsignedInt24()>
	//   25   47:istore_2        
						if(j != 0)
	//*  26   48:iload_2         
	//*  27   49:ifeq            77
						{
							if(j > parsablebytearray.bytesLeft())
	//*  28   52:iload_2         
	//*  29   53:aload_1         
	//*  30   54:invokevirtual   #56  <Method int ParsableByteArray.bytesLeft()>
	//*  31   57:icmple          62
								return null;
	//   32   60:aconst_null     
	//   33   61:areturn         
							k = j;
	//   34   62:iload_2         
	//   35   63:istore_3        
							if(!s.equals("COM"))
	//*  36   64:aload           5
	//*  37   66:ldc1            #94  <String "COM">
	//*  38   68:invokevirtual   #89  <Method boolean String.equals(Object)>
	//*  39   71:ifeq            268
								break label1;
	//   40   74:goto            199
						} else
						{
							return null;
	//   41   77:aconst_null     
	//   42   78:areturn         
						}
					} else
					{
						if(parsablebytearray.bytesLeft() < 10)
	//*  43   79:aload_1         
	//*  44   80:invokevirtual   #56  <Method int ParsableByteArray.bytesLeft()>
	//*  45   83:bipush          10
	//*  46   85:icmpge          90
							return null;
	//   47   88:aconst_null     
	//   48   89:areturn         
						String s1 = parsablebytearray.readString(4, Charset.forName("US-ASCII"));
	//   49   90:aload_1         
	//   50   91:iconst_4        
	//   51   92:ldc1            #77  <String "US-ASCII">
	//   52   94:invokestatic    #30  <Method Charset Charset.forName(String)>
	//   53   97:invokevirtual   #81  <Method String ParsableByteArray.readString(int, Charset)>
	//   54  100:astore          5
						if(s1.equals("\000\000\000\0"))
	//*  55  102:aload           5
	//*  56  104:ldc1            #96  <String "\000\000\000\0">
	//*  57  106:invokevirtual   #89  <Method boolean String.equals(Object)>
	//*  58  109:ifeq            114
							return null;
	//   59  112:aconst_null     
	//   60  113:areturn         
						if(i == 4)
	//*  61  114:iload_0         
	//*  62  115:iconst_4        
	//*  63  116:icmpne          127
							j = parsablebytearray.readSynchSafeInt();
	//   64  119:aload_1         
	//   65  120:invokevirtual   #99  <Method int ParsableByteArray.readSynchSafeInt()>
	//   66  123:istore_2        
						else
	//*  67  124:goto            132
							j = parsablebytearray.readUnsignedIntToInt();
	//   68  127:aload_1         
	//   69  128:invokevirtual   #102 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   70  131:istore_2        
						if(j == 0)
							break label0;
	//   71  132:iload_2         
	//   72  133:ifeq            276
						if(j > parsablebytearray.bytesLeft() - 2)
	//*  73  136:iload_2         
	//*  74  137:aload_1         
	//*  75  138:invokevirtual   #56  <Method int ParsableByteArray.bytesLeft()>
	//*  76  141:iconst_2        
	//*  77  142:isub            
	//*  78  143:icmple          148
							return null;
	//   79  146:aconst_null     
	//   80  147:areturn         
						k = parsablebytearray.readUnsignedShort();
	//   81  148:aload_1         
	//   82  149:invokevirtual   #70  <Method int ParsableByteArray.readUnsignedShort()>
	//   83  152:istore_3        
						if(i == 4 && (k & 0xc) != 0 || i == 3 && (k & 0xc0) != 0)
	//*  84  153:iload_0         
	//*  85  154:iconst_4        
	//*  86  155:icmpne          165
	//*  87  158:iload_3         
	//*  88  159:bipush          12
	//*  89  161:iand            
	//*  90  162:ifne            178
	//*  91  165:iload_0         
	//*  92  166:iconst_3        
	//*  93  167:icmpne          183
	//*  94  170:iload_3         
	//*  95  171:sipush          192
	//*  96  174:iand            
	//*  97  175:ifeq            183
							k = 1;
	//   98  178:iconst_1        
	//   99  179:istore_3        
						else
	//* 100  180:goto            185
							k = 0;
	//  101  183:iconst_0        
	//  102  184:istore_3        
						if(k != 0 || !s1.equals("COMM"))
							break label2;
	//  103  185:iload_3         
	//  104  186:ifne            266
	//  105  189:aload           5
	//  106  191:ldc1            #104 <String "COMM">
	//  107  193:invokevirtual   #89  <Method boolean String.equals(Object)>
	//  108  196:ifeq            266
					}
					i = parsablebytearray.readUnsignedByte();
	//  109  199:aload_1         
	//  110  200:invokevirtual   #107 <Method int ParsableByteArray.readUnsignedByte()>
	//  111  203:istore_0        
					if(i >= 0)
	//* 112  204:iload_0         
	//* 113  205:iflt            264
					{
						Object aobj[] = ((Object []) (CHARSET_BY_ENCODING));
	//  114  208:getstatic       #38  <Field Charset[] CHARSET_BY_ENCODING>
	//  115  211:astore          5
						if(i >= aobj.length)
	//* 116  213:iload_0         
	//* 117  214:aload           5
	//* 118  216:arraylength     
	//* 119  217:icmplt          222
							return null;
	//  120  220:aconst_null     
	//  121  221:areturn         
						aobj = ((Object []) (parsablebytearray.readString(j - 1, aobj[i]).split("\0")));
	//  122  222:aload_1         
	//  123  223:iload_2         
	//  124  224:iconst_1        
	//  125  225:isub            
	//  126  226:aload           5
	//  127  228:iload_0         
	//  128  229:aaload          
	//  129  230:invokevirtual   #81  <Method String ParsableByteArray.readString(int, Charset)>
	//  130  233:ldc1            #109 <String "\0">
	//  131  235:invokevirtual   #113 <Method String[] String.split(String)>
	//  132  238:astore          5
						parsablebytearray = ((ParsableByteArray) (obj));
	//  133  240:aload           4
	//  134  242:astore_1        
						if(aobj.length == 2)
	//* 135  243:aload           5
	//* 136  245:arraylength     
	//* 137  246:iconst_2        
	//* 138  247:icmpne          262
							parsablebytearray = ((ParsableByteArray) (Pair.create(((Object) (aobj[0])), ((Object) (aobj[1])))));
	//  139  250:aload           5
	//  140  252:iconst_0        
	//  141  253:aaload          
	//  142  254:aload           5
	//  143  256:iconst_1        
	//  144  257:aaload          
	//  145  258:invokestatic    #119 <Method Pair Pair.create(Object, Object)>
	//  146  261:astore_1        
						return ((Pair) (parsablebytearray));
	//  147  262:aload_1         
	//  148  263:areturn         
					} else
					{
						return null;
	//  149  264:aconst_null     
	//  150  265:areturn         
					}
				}
				k = j;
	//  151  266:iload_2         
	//  152  267:istore_3        
			}
			parsablebytearray.skipBytes(k);
	//  153  268:aload_1         
	//  154  269:iload_3         
	//  155  270:invokevirtual   #73  <Method void ParsableByteArray.skipBytes(int)>
		} while(true);
	//  156  273:goto            0
		return null;
	//  157  276:aconst_null     
	//  158  277:areturn         
	}

	private static GaplessInfo parseGaplessInfo(ParsableByteArray parsablebytearray, int i, int j)
	{
		unescape(parsablebytearray, i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #127 <Method boolean unescape(ParsableByteArray, int, int)>
	//    4    6:pop             
		parsablebytearray.setPosition(0);
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #52  <Method void ParsableByteArray.setPosition(int)>
		if(i == 3 && (j & 0x40) != 0)
	//*   8   12:iload_1         
	//*   9   13:iconst_3        
	//*  10   14:icmpne          98
	//*  11   17:iload_2         
	//*  12   18:bipush          64
	//*  13   20:iand            
	//*  14   21:ifeq            98
		{
			if(parsablebytearray.bytesLeft() < 4)
	//*  15   24:aload_0         
	//*  16   25:invokevirtual   #56  <Method int ParsableByteArray.bytesLeft()>
	//*  17   28:iconst_4        
	//*  18   29:icmpge          34
				return null;
	//   19   32:aconst_null     
	//   20   33:areturn         
			j = parsablebytearray.readUnsignedIntToInt();
	//   21   34:aload_0         
	//   22   35:invokevirtual   #102 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   23   38:istore_2        
			if(j > parsablebytearray.bytesLeft())
	//*  24   39:iload_2         
	//*  25   40:aload_0         
	//*  26   41:invokevirtual   #56  <Method int ParsableByteArray.bytesLeft()>
	//*  27   44:icmple          49
				return null;
	//   28   47:aconst_null     
	//   29   48:areturn         
			if(j >= 6)
	//*  30   49:iload_2         
	//*  31   50:bipush          6
	//*  32   52:icmplt          90
			{
				parsablebytearray.skipBytes(2);
	//   33   55:aload_0         
	//   34   56:iconst_2        
	//   35   57:invokevirtual   #73  <Method void ParsableByteArray.skipBytes(int)>
				int k = parsablebytearray.readUnsignedIntToInt();
	//   36   60:aload_0         
	//   37   61:invokevirtual   #102 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   38   64:istore_3        
				parsablebytearray.setPosition(4);
	//   39   65:aload_0         
	//   40   66:iconst_4        
	//   41   67:invokevirtual   #52  <Method void ParsableByteArray.setPosition(int)>
				parsablebytearray.setLimit(parsablebytearray.limit() - k);
	//   42   70:aload_0         
	//   43   71:aload_0         
	//   44   72:invokevirtual   #130 <Method int ParsableByteArray.limit()>
	//   45   75:iload_3         
	//   46   76:isub            
	//   47   77:invokevirtual   #133 <Method void ParsableByteArray.setLimit(int)>
				if(parsablebytearray.bytesLeft() < j)
	//*  48   80:aload_0         
	//*  49   81:invokevirtual   #56  <Method int ParsableByteArray.bytesLeft()>
	//*  50   84:iload_2         
	//*  51   85:icmpge          90
					return null;
	//   52   88:aconst_null     
	//   53   89:areturn         
			}
			parsablebytearray.skipBytes(j);
	//   54   90:aload_0         
	//   55   91:iload_2         
	//   56   92:invokevirtual   #73  <Method void ParsableByteArray.skipBytes(int)>
		} else
	//*  57   95:goto            153
		if(i == 4 && (j & 0x40) != 0)
	//*  58   98:iload_1         
	//*  59   99:iconst_4        
	//*  60  100:icmpne          153
	//*  61  103:iload_2         
	//*  62  104:bipush          64
	//*  63  106:iand            
	//*  64  107:ifeq            153
		{
			if(parsablebytearray.bytesLeft() < 4)
	//*  65  110:aload_0         
	//*  66  111:invokevirtual   #56  <Method int ParsableByteArray.bytesLeft()>
	//*  67  114:iconst_4        
	//*  68  115:icmpge          120
				return null;
	//   69  118:aconst_null     
	//   70  119:areturn         
			j = parsablebytearray.readSynchSafeInt();
	//   71  120:aload_0         
	//   72  121:invokevirtual   #99  <Method int ParsableByteArray.readSynchSafeInt()>
	//   73  124:istore_2        
			if(j >= 6)
	//*  74  125:iload_2         
	//*  75  126:bipush          6
	//*  76  128:icmplt          151
			{
				if(j > parsablebytearray.bytesLeft() + 4)
	//*  77  131:iload_2         
	//*  78  132:aload_0         
	//*  79  133:invokevirtual   #56  <Method int ParsableByteArray.bytesLeft()>
	//*  80  136:iconst_4        
	//*  81  137:iadd            
	//*  82  138:icmple          143
					return null;
	//   83  141:aconst_null     
	//   84  142:areturn         
				parsablebytearray.setPosition(j);
	//   85  143:aload_0         
	//   86  144:iload_2         
	//   87  145:invokevirtual   #52  <Method void ParsableByteArray.setPosition(int)>
			} else
	//*  88  148:goto            153
			{
				return null;
	//   89  151:aconst_null     
	//   90  152:areturn         
			}
		}
		do
		{
			Object obj = ((Object) (findNextComment(i, parsablebytearray)));
	//   91  153:iload_1         
	//   92  154:aload_0         
	//   93  155:invokestatic    #135 <Method Pair findNextComment(int, ParsableByteArray)>
	//   94  158:astore          4
			if(obj != null)
	//*  95  160:aload           4
	//*  96  162:ifnull          213
			{
				if(((String)((Pair) (obj)).first).length() > 3)
	//*  97  165:aload           4
	//*  98  167:getfield        #139 <Field Object Pair.first>
	//*  99  170:checkcast       #85  <Class String>
	//* 100  173:invokevirtual   #142 <Method int String.length()>
	//* 101  176:iconst_3        
	//* 102  177:icmple          153
				{
					obj = ((Object) (GaplessInfo.createFromComment(((String)((Pair) (obj)).first).substring(3), (String)((Pair) (obj)).second)));
	//  103  180:aload           4
	//  104  182:getfield        #139 <Field Object Pair.first>
	//  105  185:checkcast       #85  <Class String>
	//  106  188:iconst_3        
	//  107  189:invokevirtual   #146 <Method String String.substring(int)>
	//  108  192:aload           4
	//  109  194:getfield        #149 <Field Object Pair.second>
	//  110  197:checkcast       #85  <Class String>
	//  111  200:invokestatic    #155 <Method GaplessInfo GaplessInfo.createFromComment(String, String)>
	//  112  203:astore          4
					if(obj != null)
	//* 113  205:aload           4
	//* 114  207:ifnull          153
						return ((GaplessInfo) (obj));
	//  115  210:aload           4
	//  116  212:areturn         
				}
			} else
			{
				return null;
	//  117  213:aconst_null     
	//  118  214:areturn         
			}
		} while(true);
	}

	public static GaplessInfo parseId3(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		ParsableByteArray parsablebytearray = new ParsableByteArray(10);
	//    0    0:new             #48  <Class ParsableByteArray>
	//    1    3:dup             
	//    2    4:bipush          10
	//    3    6:invokespecial   #163 <Method void ParsableByteArray(int)>
	//    4    9:astore          7
		Object obj = null;
	//    5   11:aconst_null     
	//    6   12:astore          6
		int i = 0;
	//    7   14:iconst_0        
	//    8   15:istore_1        
		do
		{
			extractorinput.peekFully(parsablebytearray.data, 0, 10);
	//    9   16:aload_0         
	//   10   17:aload           7
	//   11   19:getfield        #167 <Field byte[] ParsableByteArray.data>
	//   12   22:iconst_0        
	//   13   23:bipush          10
	//   14   25:invokeinterface #173 <Method void ExtractorInput.peekFully(byte[], int, int)>
			parsablebytearray.setPosition(0);
	//   15   30:aload           7
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #52  <Method void ParsableByteArray.setPosition(int)>
			if(parsablebytearray.readUnsignedInt24() != ID3_TAG)
	//*  18   36:aload           7
	//*  19   38:invokevirtual   #92  <Method int ParsableByteArray.readUnsignedInt24()>
	//*  20   41:getstatic       #22  <Field int ID3_TAG>
	//*  21   44:icmpeq          63
			{
				extractorinput.resetPeekPosition();
	//   22   47:aload_0         
	//   23   48:invokeinterface #176 <Method void ExtractorInput.resetPeekPosition()>
				extractorinput.advancePeekPosition(i);
	//   24   53:aload_0         
	//   25   54:iload_1         
	//   26   55:invokeinterface #179 <Method void ExtractorInput.advancePeekPosition(int)>
				return ((GaplessInfo) (obj));
	//   27   60:aload           6
	//   28   62:areturn         
			}
			int j = parsablebytearray.readUnsignedByte();
	//   29   63:aload           7
	//   30   65:invokevirtual   #107 <Method int ParsableByteArray.readUnsignedByte()>
	//   31   68:istore_2        
			int k = parsablebytearray.readUnsignedByte();
	//   32   69:aload           7
	//   33   71:invokevirtual   #107 <Method int ParsableByteArray.readUnsignedByte()>
	//   34   74:istore_3        
			int l = parsablebytearray.readUnsignedByte();
	//   35   75:aload           7
	//   36   77:invokevirtual   #107 <Method int ParsableByteArray.readUnsignedByte()>
	//   37   80:istore          4
			int i1 = parsablebytearray.readSynchSafeInt();
	//   38   82:aload           7
	//   39   84:invokevirtual   #99  <Method int ParsableByteArray.readSynchSafeInt()>
	//   40   87:istore          5
			if(obj == null && canParseMetadata(j, k, l, i1))
	//*  41   89:aload           6
	//*  42   91:ifnonnull       143
	//*  43   94:iload_2         
	//*  44   95:iload_3         
	//*  45   96:iload           4
	//*  46   98:iload           5
	//*  47  100:invokestatic    #181 <Method boolean canParseMetadata(int, int, int, int)>
	//*  48  103:ifeq            143
			{
				obj = ((Object) (new byte[i1]));
	//   49  106:iload           5
	//   50  108:newarray        byte[]
	//   51  110:astore          6
				extractorinput.peekFully(((byte []) (obj)), 0, i1);
	//   52  112:aload_0         
	//   53  113:aload           6
	//   54  115:iconst_0        
	//   55  116:iload           5
	//   56  118:invokeinterface #173 <Method void ExtractorInput.peekFully(byte[], int, int)>
				obj = ((Object) (parseGaplessInfo(new ParsableByteArray(((byte []) (obj))), j, l)));
	//   57  123:new             #48  <Class ParsableByteArray>
	//   58  126:dup             
	//   59  127:aload           6
	//   60  129:invokespecial   #184 <Method void ParsableByteArray(byte[])>
	//   61  132:iload_2         
	//   62  133:iload           4
	//   63  135:invokestatic    #186 <Method GaplessInfo parseGaplessInfo(ParsableByteArray, int, int)>
	//   64  138:astore          6
			} else
	//*  65  140:goto            151
			{
				extractorinput.advancePeekPosition(i1);
	//   66  143:aload_0         
	//   67  144:iload           5
	//   68  146:invokeinterface #179 <Method void ExtractorInput.advancePeekPosition(int)>
			}
			i += i1 + 10;
	//   69  151:iload_1         
	//   70  152:iload           5
	//   71  154:bipush          10
	//   72  156:iadd            
	//   73  157:iadd            
	//   74  158:istore_1        
		} while(true);
	//   75  159:goto            16
	}

	private static boolean unescape(ParsableByteArray parsablebytearray, int i, int j)
	{
label0:
		{
			int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
			if(i != 4)
	//*   2    2:iload_1         
	//*   3    3:iconst_4        
	//*   4    4:icmpeq          98
			{
				if((j & 0x80) != 0)
	//*   5    7:iload_2         
	//*   6    8:sipush          128
	//*   7   11:iand            
	//*   8   12:ifeq            126
				{
					byte abyte0[] = parsablebytearray.data;
	//    9   15:aload_0         
	//   10   16:getfield        #167 <Field byte[] ParsableByteArray.data>
	//   11   19:astore          5
					i = abyte0.length;
	//   12   21:aload           5
	//   13   23:arraylength     
	//   14   24:istore_1        
					do
					{
						int l = k + 1;
	//   15   25:iload_3         
	//   16   26:iconst_1        
	//   17   27:iadd            
	//   18   28:istore          4
						if(l < i)
	//*  19   30:iload           4
	//*  20   32:iload_1         
	//*  21   33:icmpge          91
						{
							j = i;
	//   22   36:iload_1         
	//   23   37:istore_2        
							if((abyte0[k] & 0xff) == 255)
	//*  24   38:aload           5
	//*  25   40:iload_3         
	//*  26   41:baload          
	//*  27   42:sipush          255
	//*  28   45:iand            
	//*  29   46:sipush          255
	//*  30   49:icmpne          83
							{
								j = i;
	//   31   52:iload_1         
	//   32   53:istore_2        
								if(abyte0[l] == 0)
	//*  33   54:aload           5
	//*  34   56:iload           4
	//*  35   58:baload          
	//*  36   59:ifne            83
								{
									System.arraycopy(((Object) (abyte0)), k + 2, ((Object) (abyte0)), l, i - k - 2);
	//   37   62:aload           5
	//   38   64:iload_3         
	//   39   65:iconst_2        
	//   40   66:iadd            
	//   41   67:aload           5
	//   42   69:iload           4
	//   43   71:iload_1         
	//   44   72:iload_3         
	//   45   73:isub            
	//   46   74:iconst_2        
	//   47   75:isub            
	//   48   76:invokestatic    #193 <Method void System.arraycopy(Object, int, Object, int, int)>
									j = i - 1;
	//   49   79:iload_1         
	//   50   80:iconst_1        
	//   51   81:isub            
	//   52   82:istore_2        
								}
							}
							k = l;
	//   53   83:iload           4
	//   54   85:istore_3        
							i = j;
	//   55   86:iload_2         
	//   56   87:istore_1        
						} else
	//*  57   88:goto            25
						{
							parsablebytearray.setLimit(i);
	//   58   91:aload_0         
	//   59   92:iload_1         
	//   60   93:invokevirtual   #133 <Method void ParsableByteArray.setLimit(int)>
							return true;
	//   61   96:iconst_1        
	//   62   97:ireturn         
						}
					} while(true);
				}
			} else
			{
				if(canUnescapeVersion4(parsablebytearray, false))
	//*  63   98:aload_0         
	//*  64   99:iconst_0        
	//*  65  100:invokestatic    #195 <Method boolean canUnescapeVersion4(ParsableByteArray, boolean)>
	//*  66  103:ifeq            113
				{
					unescapeVersion4(parsablebytearray, false);
	//   67  106:aload_0         
	//   68  107:iconst_0        
	//   69  108:invokestatic    #199 <Method void unescapeVersion4(ParsableByteArray, boolean)>
					return true;
	//   70  111:iconst_1        
	//   71  112:ireturn         
				}
				if(!canUnescapeVersion4(parsablebytearray, true))
					break label0;
	//   72  113:aload_0         
	//   73  114:iconst_1        
	//   74  115:invokestatic    #195 <Method boolean canUnescapeVersion4(ParsableByteArray, boolean)>
	//   75  118:ifeq            128
				unescapeVersion4(parsablebytearray, true);
	//   76  121:aload_0         
	//   77  122:iconst_1        
	//   78  123:invokestatic    #199 <Method void unescapeVersion4(ParsableByteArray, boolean)>
			}
			return true;
	//   79  126:iconst_1        
	//   80  127:ireturn         
		}
		return false;
	//   81  128:iconst_0        
	//   82  129:ireturn         
	}

	private static void unescapeVersion4(ParsableByteArray parsablebytearray, boolean flag)
	{
		parsablebytearray.setPosition(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #52  <Method void ParsableByteArray.setPosition(int)>
		byte abyte0[] = parsablebytearray.data;
	//    3    5:aload_0         
	//    4    6:getfield        #167 <Field byte[] ParsableByteArray.data>
	//    5    9:astore          10
		int i1;
		for(; parsablebytearray.bytesLeft() >= 10; parsablebytearray.skipBytes(i1))
	//*   6   11:aload_0         
	//*   7   12:invokevirtual   #56  <Method int ParsableByteArray.bytesLeft()>
	//*   8   15:bipush          10
	//*   9   17:icmplt          329
		{
			if(parsablebytearray.readInt() == 0)
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #59  <Method int ParsableByteArray.readInt()>
	//*  12   24:ifne            28
				return;
	//   13   27:return          
			int i;
			if(flag)
	//*  14   28:iload_1         
	//*  15   29:ifeq            40
				i = parsablebytearray.readUnsignedIntToInt();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #102 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   18   36:istore_2        
			else
	//*  19   37:goto            45
				i = parsablebytearray.readSynchSafeInt();
	//   20   40:aload_0         
	//   21   41:invokevirtual   #99  <Method int ParsableByteArray.readSynchSafeInt()>
	//   22   44:istore_2        
			int l1 = parsablebytearray.readUnsignedShort();
	//   23   45:aload_0         
	//   24   46:invokevirtual   #70  <Method int ParsableByteArray.readUnsignedShort()>
	//   25   49:istore          8
			int k;
			if((l1 & 1) != 0)
	//*  26   51:iload           8
	//*  27   53:iconst_1        
	//*  28   54:iand            
	//*  29   55:ifeq            103
			{
				k = parsablebytearray.getPosition();
	//   30   58:aload_0         
	//   31   59:invokevirtual   #202 <Method int ParsableByteArray.getPosition()>
	//   32   62:istore_3        
				System.arraycopy(((Object) (abyte0)), k + 4, ((Object) (abyte0)), k, parsablebytearray.bytesLeft() - 4);
	//   33   63:aload           10
	//   34   65:iload_3         
	//   35   66:iconst_4        
	//   36   67:iadd            
	//   37   68:aload           10
	//   38   70:iload_3         
	//   39   71:aload_0         
	//   40   72:invokevirtual   #56  <Method int ParsableByteArray.bytesLeft()>
	//   41   75:iconst_4        
	//   42   76:isub            
	//   43   77:invokestatic    #193 <Method void System.arraycopy(Object, int, Object, int, int)>
				i -= 4;
	//   44   80:iload_2         
	//   45   81:iconst_4        
	//   46   82:isub            
	//   47   83:istore_2        
				k = l1 & -2;
	//   48   84:iload           8
	//   49   86:bipush          -2
	//   50   88:iand            
	//   51   89:istore_3        
				parsablebytearray.setLimit(parsablebytearray.limit() - 4);
	//   52   90:aload_0         
	//   53   91:aload_0         
	//   54   92:invokevirtual   #130 <Method int ParsableByteArray.limit()>
	//   55   95:iconst_4        
	//   56   96:isub            
	//   57   97:invokevirtual   #133 <Method void ParsableByteArray.setLimit(int)>
			} else
	//*  58  100:goto            106
			{
				k = l1;
	//   59  103:iload           8
	//   60  105:istore_3        
			}
			i1 = i;
	//   61  106:iload_2         
	//   62  107:istore          5
			int l = k;
	//   63  109:iload_3         
	//   64  110:istore          4
			if((k & 2) != 0)
	//*  65  112:iload_3         
	//*  66  113:iconst_2        
	//*  67  114:iand            
	//*  68  115:ifeq            268
			{
				l = parsablebytearray.getPosition() + 1;
	//   69  118:aload_0         
	//   70  119:invokevirtual   #202 <Method int ParsableByteArray.getPosition()>
	//   71  122:iconst_1        
	//   72  123:iadd            
	//   73  124:istore          4
				i1 = l;
	//   74  126:iload           4
	//   75  128:istore          5
				int k1 = 0;
	//   76  130:iconst_0        
	//   77  131:istore          7
				do
				{
					int i2 = k1 + 1;
	//   78  133:iload           7
	//   79  135:iconst_1        
	//   80  136:iadd            
	//   81  137:istore          9
					if(i2 >= i)
						break;
	//   82  139:iload           9
	//   83  141:iload_2         
	//   84  142:icmpge          227
					int j1 = i;
	//   85  145:iload_2         
	//   86  146:istore          6
					k1 = l;
	//   87  148:iload           4
	//   88  150:istore          7
					if((abyte0[l - 1] & 0xff) == 255)
	//*  89  152:aload           10
	//*  90  154:iload           4
	//*  91  156:iconst_1        
	//*  92  157:isub            
	//*  93  158:baload          
	//*  94  159:sipush          255
	//*  95  162:iand            
	//*  96  163:sipush          255
	//*  97  166:icmpne          195
					{
						j1 = i;
	//   98  169:iload_2         
	//   99  170:istore          6
						k1 = l;
	//  100  172:iload           4
	//  101  174:istore          7
						if(abyte0[l] == 0)
	//* 102  176:aload           10
	//* 103  178:iload           4
	//* 104  180:baload          
	//* 105  181:ifne            195
						{
							k1 = l + 1;
	//  106  184:iload           4
	//  107  186:iconst_1        
	//  108  187:iadd            
	//  109  188:istore          7
							j1 = i - 1;
	//  110  190:iload_2         
	//  111  191:iconst_1        
	//  112  192:isub            
	//  113  193:istore          6
						}
					}
					abyte0[i1] = abyte0[k1];
	//  114  195:aload           10
	//  115  197:iload           5
	//  116  199:aload           10
	//  117  201:iload           7
	//  118  203:baload          
	//  119  204:bastore         
					i1++;
	//  120  205:iload           5
	//  121  207:iconst_1        
	//  122  208:iadd            
	//  123  209:istore          5
					l = k1 + 1;
	//  124  211:iload           7
	//  125  213:iconst_1        
	//  126  214:iadd            
	//  127  215:istore          4
					k1 = i2;
	//  128  217:iload           9
	//  129  219:istore          7
					i = j1;
	//  130  221:iload           6
	//  131  223:istore_2        
				} while(true);
	//  132  224:goto            133
				parsablebytearray.setLimit(parsablebytearray.limit() - (l - i1));
	//  133  227:aload_0         
	//  134  228:aload_0         
	//  135  229:invokevirtual   #130 <Method int ParsableByteArray.limit()>
	//  136  232:iload           4
	//  137  234:iload           5
	//  138  236:isub            
	//  139  237:isub            
	//  140  238:invokevirtual   #133 <Method void ParsableByteArray.setLimit(int)>
				System.arraycopy(((Object) (abyte0)), l, ((Object) (abyte0)), i1, parsablebytearray.bytesLeft() - l);
	//  141  241:aload           10
	//  142  243:iload           4
	//  143  245:aload           10
	//  144  247:iload           5
	//  145  249:aload_0         
	//  146  250:invokevirtual   #56  <Method int ParsableByteArray.bytesLeft()>
	//  147  253:iload           4
	//  148  255:isub            
	//  149  256:invokestatic    #193 <Method void System.arraycopy(Object, int, Object, int, int)>
				l = k & -3;
	//  150  259:iload_3         
	//  151  260:bipush          -3
	//  152  262:iand            
	//  153  263:istore          4
				i1 = i;
	//  154  265:iload_2         
	//  155  266:istore          5
			}
			if(l != l1 || flag)
	//* 156  268:iload           4
	//* 157  270:iload           8
	//* 158  272:icmpne          279
	//* 159  275:iload_1         
	//* 160  276:ifeq            320
			{
				int j = parsablebytearray.getPosition() - 6;
	//  161  279:aload_0         
	//  162  280:invokevirtual   #202 <Method int ParsableByteArray.getPosition()>
	//  163  283:bipush          6
	//  164  285:isub            
	//  165  286:istore_2        
				writeSyncSafeInteger(abyte0, j, i1);
	//  166  287:aload           10
	//  167  289:iload_2         
	//  168  290:iload           5
	//  169  292:invokestatic    #205 <Method void writeSyncSafeInteger(byte[], int, int)>
				abyte0[j + 4] = (byte)(l >> 8);
	//  170  295:aload           10
	//  171  297:iload_2         
	//  172  298:iconst_4        
	//  173  299:iadd            
	//  174  300:iload           4
	//  175  302:bipush          8
	//  176  304:ishr            
	//  177  305:int2byte        
	//  178  306:bastore         
				abyte0[j + 5] = (byte)(l & 0xff);
	//  179  307:aload           10
	//  180  309:iload_2         
	//  181  310:iconst_5        
	//  182  311:iadd            
	//  183  312:iload           4
	//  184  314:sipush          255
	//  185  317:iand            
	//  186  318:int2byte        
	//  187  319:bastore         
			}
		}

	//  188  320:aload_0         
	//  189  321:iload           5
	//  190  323:invokevirtual   #73  <Method void ParsableByteArray.skipBytes(int)>
	//* 191  326:goto            11
	//  192  329:return          
	}

	private static void writeSyncSafeInteger(byte abyte0[], int i, int j)
	{
		abyte0[i] = (byte)(j >> 21 & 0x7f);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:bipush          21
	//    4    5:ishr            
	//    5    6:bipush          127
	//    6    8:iand            
	//    7    9:int2byte        
	//    8   10:bastore         
		abyte0[i + 1] = (byte)(j >> 14 & 0x7f);
	//    9   11:aload_0         
	//   10   12:iload_1         
	//   11   13:iconst_1        
	//   12   14:iadd            
	//   13   15:iload_2         
	//   14   16:bipush          14
	//   15   18:ishr            
	//   16   19:bipush          127
	//   17   21:iand            
	//   18   22:int2byte        
	//   19   23:bastore         
		abyte0[i + 2] = (byte)(j >> 7 & 0x7f);
	//   20   24:aload_0         
	//   21   25:iload_1         
	//   22   26:iconst_2        
	//   23   27:iadd            
	//   24   28:iload_2         
	//   25   29:bipush          7
	//   26   31:ishr            
	//   27   32:bipush          127
	//   28   34:iand            
	//   29   35:int2byte        
	//   30   36:bastore         
		abyte0[i + 3] = (byte)(j & 0x7f);
	//   31   37:aload_0         
	//   32   38:iload_1         
	//   33   39:iconst_3        
	//   34   40:iadd            
	//   35   41:iload_2         
	//   36   42:bipush          127
	//   37   44:iand            
	//   38   45:int2byte        
	//   39   46:bastore         
	//   40   47:return          
	}

	private static final Charset CHARSET_BY_ENCODING[] = {
		Charset.forName("ISO-8859-1"), Charset.forName("UTF-16LE"), Charset.forName("UTF-16BE"), Charset.forName("UTF-8")
	};
	private static final int ID3_TAG = Util.getIntegerCodeForString("ID3");
	private static final int MAXIMUM_METADATA_SIZE = 0x300000;

	static 
	{
	//    0    0:ldc1            #14  <String "ID3">
	//    1    2:invokestatic    #20  <Method int Util.getIntegerCodeForString(String)>
	//    2    5:putstatic       #22  <Field int ID3_TAG>
	//    3    8:iconst_4        
	//    4    9:anewarray       Charset[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:ldc1            #26  <String "ISO-8859-1">
	//    8   16:invokestatic    #30  <Method Charset Charset.forName(String)>
	//    9   19:aastore         
	//   10   20:dup             
	//   11   21:iconst_1        
	//   12   22:ldc1            #32  <String "UTF-16LE">
	//   13   24:invokestatic    #30  <Method Charset Charset.forName(String)>
	//   14   27:aastore         
	//   15   28:dup             
	//   16   29:iconst_2        
	//   17   30:ldc1            #34  <String "UTF-16BE">
	//   18   32:invokestatic    #30  <Method Charset Charset.forName(String)>
	//   19   35:aastore         
	//   20   36:dup             
	//   21   37:iconst_3        
	//   22   38:ldc1            #36  <String "UTF-8">
	//   23   40:invokestatic    #30  <Method Charset Charset.forName(String)>
	//   24   43:aastore         
	//   25   44:putstatic       #38  <Field Charset[] CHARSET_BY_ENCODING>
	//*  26   47:return          
	}
}
