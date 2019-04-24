// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mkv;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.*;
import com.google.android.exoplayer2.video.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.extractor.mkv:
//			MatroskaExtractor

private static final class MatroskaExtractor$Track
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
		if(parsablebytearray.readLong() != MatroskaExtractor.access$400().getMostSignificantBits())
			break MISSING_BLOCK_LABEL_60;
		l = parsablebytearray.readLong();
		l1 = MatroskaExtractor.access$400().getLeastSignificantBits();
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
	//	               -2095576542: 766
	//	               -2095575984: 749
	//	               -1985379776: 731
	//	               -1784763192: 713
	//	               -1730367663: 695
	//	               -1482641358: 677
	//	               -1482641357: 659
	//	               -1373388978: 641
	//	               -933872740: 623
	//	               -538363189: 606
	//	               -538363109: 588
	//	               -425012669: 570
	//	               -356037306: 552
	//	               62923557: 534
	//	               62923603: 516
	//	               62927045: 498
	//	               82338133: 481
	//	               82338134: 464
	//	               99146302: 446
	//	               444813526: 428
	//	               542569478: 410
	//	               725957860: 392
	//	               738597099: 374
	//	               855502857: 356
	//	               1422270023: 338
	//	               1809237540: 321
	//	               1950749482: 303
	//	               1950789798: 285
	//	               1951062397: 267
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
	//	               0 1685
	//	               1 1677
	//	               2 1669
	//	               3 1639
	//	               4 1639
	//	               5 1639
	//	               6 1592
	//	               7 1552
	//	               8 1506
	//	               9 1499
	//	               10 1474
	//	               11 1381
	//	               12 1364
	//	               13 1344
	//	               14 1336
	//	               15 1328
	//	               16 1320
	//	               17 1301
	//	               18 1293
	//	               19 1293
	//	               20 1285
	//	               21 1268
	//	               22 1122
	//	               23 1024
	//	               24 1016
	//	               25 1008
	//	               26 991
	//	               27 983
	//	               28 931;
	//  221  791:tableswitch     0 28: default 920
	//	               0 1685
	//	               1 1677
	//	               2 1669
	//	               3 1639
	//	               4 1639
	//	               5 1639
	//	               6 1592
	//	               7 1552
	//	               8 1506
	//	               9 1499
	//	               10 1474
	//	               11 1381
	//	               12 1364
	//	               13 1344
	//	               14 1336
	//	               15 1328
	//	               16 1320
	//	               17 1301
	//	               18 1293
	//	               19 1293
	//	               20 1285
	//	               21 1268
	//	               22 1122
	//	               23 1024
	//	               24 1016
	//	               25 1008
	//	               26 991
	//	               27 983
	//	               28 931
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
		trueHdSampleRechunker = new SampleRechunker();
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
			((List) (obj)).add(((Object) (MatroskaExtractor.access$300())));
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
	public SampleRechunker trueHdSampleRechunker;
	public int type;
	public float whitePointChromaticityX;
	public float whitePointChromaticityY;
	public int width;


/*
	static String access$202(MatroskaExtractor$Track matroskaextractor$track, String s)
	{
		matroskaextractor$track.language = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #136 <Field String language>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/

	private MatroskaExtractor$Track()
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

	MatroskaExtractor$Track(MatroskaExtractor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #139 <Method void MatroskaExtractor$Track()>
	//    2    4:return          
	}
}
