// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.id3;

import android.util.Log;
import com.google.android.exoplayer2.metadata.*;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.metadata.id3:
//			ApicFrame, BinaryFrame, Id3Frame, ChapterFrame, 
//			ChapterTocFrame, CommentFrame, GeobFrame, PrivFrame, 
//			TextInformationFrame, UrlLinkFrame

public final class Id3Decoder
	implements MetadataDecoder
{
	public static interface FramePredicate
	{

		public abstract boolean evaluate(int i, int j, int k, int l, int i1);
	}

	private static final class Id3Header
	{

		private final int framesSize;
		private final boolean isUnsynchronized;
		private final int majorVersion;


/*
		static int access$000(Id3Header id3header)
		{
			return id3header.majorVersion;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field int majorVersion>
		//    2    4:ireturn         
		}

*/


/*
		static int access$100(Id3Header id3header)
		{
			return id3header.framesSize;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field int framesSize>
		//    2    4:ireturn         
		}

*/


/*
		static boolean access$200(Id3Header id3header)
		{
			return id3header.isUnsynchronized;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field boolean isUnsynchronized>
		//    2    4:ireturn         
		}

*/

		public Id3Header(int i, boolean flag, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			majorVersion = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #19  <Field int majorVersion>
			isUnsynchronized = flag;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #21  <Field boolean isUnsynchronized>
			framesSize = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #23  <Field int framesSize>
		//   11   19:return          
		}
	}


	public Id3Decoder()
	{
		this(((FramePredicate) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #67  <Method void Id3Decoder(Id3Decoder$FramePredicate)>
	//    3    5:return          
	}

	public Id3Decoder(FramePredicate framepredicate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void Object()>
		framePredicate = framepredicate;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #70  <Field Id3Decoder$FramePredicate framePredicate>
	//    5    9:return          
	}

	private static byte[] copyOfRangeIfValid(byte abyte0[], int i, int j)
	{
		if(j <= i)
	//*   0    0:iload_2         
	//*   1    1:iload_1         
	//*   2    2:icmpgt          9
			return new byte[0];
	//    3    5:iconst_0        
	//    4    6:newarray        byte[]
	//    5    8:areturn         
		else
			return Arrays.copyOfRange(abyte0, i, j);
	//    6    9:aload_0         
	//    7   10:iload_1         
	//    8   11:iload_2         
	//    9   12:invokestatic    #77  <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   10   15:areturn         
	}

	private static ApicFrame decodeApicFrame(ParsableByteArray parsablebytearray, int i, int j)
		throws UnsupportedEncodingException
	{
		int k = parsablebytearray.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #87  <Method int ParsableByteArray.readUnsignedByte()>
	//    2    4:istore_3        
		String s2 = getCharsetName(k);
	//    3    5:iload_3         
	//    4    6:invokestatic    #91  <Method String getCharsetName(int)>
	//    5    9:astore          6
		i--;
	//    6   11:iload_1         
	//    7   12:iconst_1        
	//    8   13:isub            
	//    9   14:istore_1        
		byte abyte0[] = new byte[i];
	//   10   15:iload_1         
	//   11   16:newarray        byte[]
	//   12   18:astore          7
		parsablebytearray.readBytes(abyte0, 0, i);
	//   13   20:aload_0         
	//   14   21:aload           7
	//   15   23:iconst_0        
	//   16   24:iload_1         
	//   17   25:invokevirtual   #95  <Method void ParsableByteArray.readBytes(byte[], int, int)>
		if(j == 2)
	//*  18   28:iload_2         
	//*  19   29:iconst_2        
	//*  20   30:icmpne          96
		{
			parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
	//   21   33:new             #97  <Class StringBuilder>
	//   22   36:dup             
	//   23   37:invokespecial   #98  <Method void StringBuilder()>
	//   24   40:astore_0        
			((StringBuilder) (parsablebytearray)).append("image/");
	//   25   41:aload_0         
	//   26   42:ldc1            #100 <String "image/">
	//   27   44:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   28   47:pop             
			((StringBuilder) (parsablebytearray)).append(Util.toLowerInvariant(new String(abyte0, 0, 3, "ISO-8859-1")));
	//   29   48:aload_0         
	//   30   49:new             #106 <Class String>
	//   31   52:dup             
	//   32   53:aload           7
	//   33   55:iconst_0        
	//   34   56:iconst_3        
	//   35   57:ldc1            #108 <String "ISO-8859-1">
	//   36   59:invokespecial   #111 <Method void String(byte[], int, int, String)>
	//   37   62:invokestatic    #115 <Method String Util.toLowerInvariant(String)>
	//   38   65:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   39   68:pop             
			String s = ((StringBuilder) (parsablebytearray)).toString();
	//   40   69:aload_0         
	//   41   70:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   42   73:astore          5
			parsablebytearray = ((ParsableByteArray) (s));
	//   43   75:aload           5
	//   44   77:astore_0        
			if("image/jpg".equals(((Object) (s))))
	//*  45   78:ldc1            #121 <String "image/jpg">
	//*  46   80:aload           5
	//*  47   82:invokevirtual   #125 <Method boolean String.equals(Object)>
	//*  48   85:ifeq            91
				parsablebytearray = "image/jpeg";
	//   49   88:ldc1            #127 <String "image/jpeg">
	//   50   90:astore_0        
			i = 2;
	//   51   91:iconst_2        
	//   52   92:istore_1        
		} else
	//*  53   93:goto            166
		{
			j = indexOfZeroByte(abyte0, 0);
	//   54   96:aload           7
	//   55   98:iconst_0        
	//   56   99:invokestatic    #131 <Method int indexOfZeroByte(byte[], int)>
	//   57  102:istore_2        
			String s1 = Util.toLowerInvariant(new String(abyte0, 0, j, "ISO-8859-1"));
	//   58  103:new             #106 <Class String>
	//   59  106:dup             
	//   60  107:aload           7
	//   61  109:iconst_0        
	//   62  110:iload_2         
	//   63  111:ldc1            #108 <String "ISO-8859-1">
	//   64  113:invokespecial   #111 <Method void String(byte[], int, int, String)>
	//   65  116:invokestatic    #115 <Method String Util.toLowerInvariant(String)>
	//   66  119:astore          5
			i = j;
	//   67  121:iload_2         
	//   68  122:istore_1        
			parsablebytearray = ((ParsableByteArray) (s1));
	//   69  123:aload           5
	//   70  125:astore_0        
			if(s1.indexOf('/') == -1)
	//*  71  126:aload           5
	//*  72  128:bipush          47
	//*  73  130:invokevirtual   #135 <Method int String.indexOf(int)>
	//*  74  133:iconst_m1       
	//*  75  134:icmpne          166
			{
				parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
	//   76  137:new             #97  <Class StringBuilder>
	//   77  140:dup             
	//   78  141:invokespecial   #98  <Method void StringBuilder()>
	//   79  144:astore_0        
				((StringBuilder) (parsablebytearray)).append("image/");
	//   80  145:aload_0         
	//   81  146:ldc1            #100 <String "image/">
	//   82  148:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   83  151:pop             
				((StringBuilder) (parsablebytearray)).append(s1);
	//   84  152:aload_0         
	//   85  153:aload           5
	//   86  155:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   87  158:pop             
				parsablebytearray = ((ParsableByteArray) (((StringBuilder) (parsablebytearray)).toString()));
	//   88  159:aload_0         
	//   89  160:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   90  163:astore_0        
				i = j;
	//   91  164:iload_2         
	//   92  165:istore_1        
			}
		}
		j = ((int) (abyte0[i + 1]));
	//   93  166:aload           7
	//   94  168:iload_1         
	//   95  169:iconst_1        
	//   96  170:iadd            
	//   97  171:baload          
	//   98  172:istore_2        
		i += 2;
	//   99  173:iload_1         
	//  100  174:iconst_2        
	//  101  175:iadd            
	//  102  176:istore_1        
		int l = indexOfEos(abyte0, i, k);
	//  103  177:aload           7
	//  104  179:iload_1         
	//  105  180:iload_3         
	//  106  181:invokestatic    #139 <Method int indexOfEos(byte[], int, int)>
	//  107  184:istore          4
		return new ApicFrame(((String) (parsablebytearray)), new String(abyte0, i, l - i, s2), j & 0xff, copyOfRangeIfValid(abyte0, l + delimiterLength(k), abyte0.length));
	//  108  186:new             #141 <Class ApicFrame>
	//  109  189:dup             
	//  110  190:aload_0         
	//  111  191:new             #106 <Class String>
	//  112  194:dup             
	//  113  195:aload           7
	//  114  197:iload_1         
	//  115  198:iload           4
	//  116  200:iload_1         
	//  117  201:isub            
	//  118  202:aload           6
	//  119  204:invokespecial   #111 <Method void String(byte[], int, int, String)>
	//  120  207:iload_2         
	//  121  208:sipush          255
	//  122  211:iand            
	//  123  212:aload           7
	//  124  214:iload           4
	//  125  216:iload_3         
	//  126  217:invokestatic    #144 <Method int delimiterLength(int)>
	//  127  220:iadd            
	//  128  221:aload           7
	//  129  223:arraylength     
	//  130  224:invokestatic    #146 <Method byte[] copyOfRangeIfValid(byte[], int, int)>
	//  131  227:invokespecial   #149 <Method void ApicFrame(String, String, int, byte[])>
	//  132  230:areturn         
	}

	private static BinaryFrame decodeBinaryFrame(ParsableByteArray parsablebytearray, int i, String s)
	{
		byte abyte0[] = new byte[i];
	//    0    0:iload_1         
	//    1    1:newarray        byte[]
	//    2    3:astore_3        
		parsablebytearray.readBytes(abyte0, 0, i);
	//    3    4:aload_0         
	//    4    5:aload_3         
	//    5    6:iconst_0        
	//    6    7:iload_1         
	//    7    8:invokevirtual   #95  <Method void ParsableByteArray.readBytes(byte[], int, int)>
		return new BinaryFrame(s, abyte0);
	//    8   11:new             #154 <Class BinaryFrame>
	//    9   14:dup             
	//   10   15:aload_2         
	//   11   16:aload_3         
	//   12   17:invokespecial   #157 <Method void BinaryFrame(String, byte[])>
	//   13   20:areturn         
	}

	private static ChapterFrame decodeChapterFrame(ParsableByteArray parsablebytearray, int i, int j, boolean flag, int k, FramePredicate framepredicate)
		throws UnsupportedEncodingException
	{
		int l = parsablebytearray.getPosition();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #162 <Method int ParsableByteArray.getPosition()>
	//    2    4:istore          6
		int i1 = indexOfZeroByte(parsablebytearray.data, l);
	//    3    6:aload_0         
	//    4    7:getfield        #166 <Field byte[] ParsableByteArray.data>
	//    5   10:iload           6
	//    6   12:invokestatic    #131 <Method int indexOfZeroByte(byte[], int)>
	//    7   15:istore          7
		String s = new String(parsablebytearray.data, l, i1 - l, "ISO-8859-1");
	//    8   17:new             #106 <Class String>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:getfield        #166 <Field byte[] ParsableByteArray.data>
	//   12   25:iload           6
	//   13   27:iload           7
	//   14   29:iload           6
	//   15   31:isub            
	//   16   32:ldc1            #108 <String "ISO-8859-1">
	//   17   34:invokespecial   #111 <Method void String(byte[], int, int, String)>
	//   18   37:astore          13
		parsablebytearray.setPosition(i1 + 1);
	//   19   39:aload_0         
	//   20   40:iload           7
	//   21   42:iconst_1        
	//   22   43:iadd            
	//   23   44:invokevirtual   #170 <Method void ParsableByteArray.setPosition(int)>
		i1 = parsablebytearray.readInt();
	//   24   47:aload_0         
	//   25   48:invokevirtual   #173 <Method int ParsableByteArray.readInt()>
	//   26   51:istore          7
		int j1 = parsablebytearray.readInt();
	//   27   53:aload_0         
	//   28   54:invokevirtual   #173 <Method int ParsableByteArray.readInt()>
	//   29   57:istore          8
		long l1 = parsablebytearray.readUnsignedInt();
	//   30   59:aload_0         
	//   31   60:invokevirtual   #177 <Method long ParsableByteArray.readUnsignedInt()>
	//   32   63:lstore          9
		if(l1 == 0xffffffffL)
	//*  33   65:lload           9
	//*  34   67:ldc2w           #178 <Long 0xffffffffL>
	//*  35   70:lcmp            
	//*  36   71:ifne            82
			l1 = -1L;
	//   37   74:ldc2w           #180 <Long -1L>
	//   38   77:lstore          9
	//*  39   79:goto            82
		long l2 = parsablebytearray.readUnsignedInt();
	//   40   82:aload_0         
	//   41   83:invokevirtual   #177 <Method long ParsableByteArray.readUnsignedInt()>
	//   42   86:lstore          11
		if(l2 == 0xffffffffL)
	//*  43   88:lload           11
	//*  44   90:ldc2w           #178 <Long 0xffffffffL>
	//*  45   93:lcmp            
	//*  46   94:ifne            105
			l2 = -1L;
	//   47   97:ldc2w           #180 <Long -1L>
	//   48  100:lstore          11
	//*  49  102:goto            105
		ArrayList arraylist = new ArrayList();
	//   50  105:new             #183 <Class ArrayList>
	//   51  108:dup             
	//   52  109:invokespecial   #184 <Method void ArrayList()>
	//   53  112:astore          14
		do
		{
			if(parsablebytearray.getPosition() >= l + i)
				break;
	//   54  114:aload_0         
	//   55  115:invokevirtual   #162 <Method int ParsableByteArray.getPosition()>
	//   56  118:iload           6
	//   57  120:iload_1         
	//   58  121:iadd            
	//   59  122:icmpge          153
			Id3Frame id3frame = decodeFrame(j, parsablebytearray, flag, k, framepredicate);
	//   60  125:iload_2         
	//   61  126:aload_0         
	//   62  127:iload_3         
	//   63  128:iload           4
	//   64  130:aload           5
	//   65  132:invokestatic    #188 <Method Id3Frame decodeFrame(int, ParsableByteArray, boolean, int, Id3Decoder$FramePredicate)>
	//   66  135:astore          15
			if(id3frame != null)
	//*  67  137:aload           15
	//*  68  139:ifnull          114
				arraylist.add(((Object) (id3frame)));
	//   69  142:aload           14
	//   70  144:aload           15
	//   71  146:invokevirtual   #191 <Method boolean ArrayList.add(Object)>
	//   72  149:pop             
		} while(true);
	//   73  150:goto            114
		parsablebytearray = ((ParsableByteArray) (new Id3Frame[arraylist.size()]));
	//   74  153:aload           14
	//   75  155:invokevirtual   #194 <Method int ArrayList.size()>
	//   76  158:anewarray       Id3Frame[]
	//   77  161:astore_0        
		arraylist.toArray(((Object []) (parsablebytearray)));
	//   78  162:aload           14
	//   79  164:aload_0         
	//   80  165:invokevirtual   #200 <Method Object[] ArrayList.toArray(Object[])>
	//   81  168:pop             
		return new ChapterFrame(s, i1, j1, l1, l2, ((Id3Frame []) (parsablebytearray)));
	//   82  169:new             #202 <Class ChapterFrame>
	//   83  172:dup             
	//   84  173:aload           13
	//   85  175:iload           7
	//   86  177:iload           8
	//   87  179:lload           9
	//   88  181:lload           11
	//   89  183:aload_0         
	//   90  184:invokespecial   #205 <Method void ChapterFrame(String, int, int, long, long, Id3Frame[])>
	//   91  187:areturn         
	}

	private static ChapterTocFrame decodeChapterTOCFrame(ParsableByteArray parsablebytearray, int i, int j, boolean flag, int k, FramePredicate framepredicate)
		throws UnsupportedEncodingException
	{
		int i1 = parsablebytearray.getPosition();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #162 <Method int ParsableByteArray.getPosition()>
	//    2    4:istore          7
		int l = indexOfZeroByte(parsablebytearray.data, i1);
	//    3    6:aload_0         
	//    4    7:getfield        #166 <Field byte[] ParsableByteArray.data>
	//    5   10:iload           7
	//    6   12:invokestatic    #131 <Method int indexOfZeroByte(byte[], int)>
	//    7   15:istore          6
		String s = new String(parsablebytearray.data, i1, l - i1, "ISO-8859-1");
	//    8   17:new             #106 <Class String>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:getfield        #166 <Field byte[] ParsableByteArray.data>
	//   12   25:iload           7
	//   13   27:iload           6
	//   14   29:iload           7
	//   15   31:isub            
	//   16   32:ldc1            #108 <String "ISO-8859-1">
	//   17   34:invokespecial   #111 <Method void String(byte[], int, int, String)>
	//   18   37:astore          13
		parsablebytearray.setPosition(l + 1);
	//   19   39:aload_0         
	//   20   40:iload           6
	//   21   42:iconst_1        
	//   22   43:iadd            
	//   23   44:invokevirtual   #170 <Method void ParsableByteArray.setPosition(int)>
		int j1 = parsablebytearray.readUnsignedByte();
	//   24   47:aload_0         
	//   25   48:invokevirtual   #87  <Method int ParsableByteArray.readUnsignedByte()>
	//   26   51:istore          8
		l = 0;
	//   27   53:iconst_0        
	//   28   54:istore          6
		boolean flag1;
		if((j1 & 2) != 0)
	//*  29   56:iload           8
	//*  30   58:iconst_2        
	//*  31   59:iand            
	//*  32   60:ifeq            69
			flag1 = true;
	//   33   63:iconst_1        
	//   34   64:istore          11
		else
	//*  35   66:goto            72
			flag1 = false;
	//   36   69:iconst_0        
	//   37   70:istore          11
		boolean flag2;
		if((j1 & 1) != 0)
	//*  38   72:iload           8
	//*  39   74:iconst_1        
	//*  40   75:iand            
	//*  41   76:ifeq            85
			flag2 = true;
	//   42   79:iconst_1        
	//   43   80:istore          12
		else
	//*  44   82:goto            88
			flag2 = false;
	//   45   85:iconst_0        
	//   46   86:istore          12
		j1 = parsablebytearray.readUnsignedByte();
	//   47   88:aload_0         
	//   48   89:invokevirtual   #87  <Method int ParsableByteArray.readUnsignedByte()>
	//   49   92:istore          8
		String as[] = new String[j1];
	//   50   94:iload           8
	//   51   96:anewarray       String[]
	//   52   99:astore          14
		for(; l < j1; l++)
	//*  53  101:iload           6
	//*  54  103:iload           8
	//*  55  105:icmpge          167
		{
			int k1 = parsablebytearray.getPosition();
	//   56  108:aload_0         
	//   57  109:invokevirtual   #162 <Method int ParsableByteArray.getPosition()>
	//   58  112:istore          9
			int l1 = indexOfZeroByte(parsablebytearray.data, k1);
	//   59  114:aload_0         
	//   60  115:getfield        #166 <Field byte[] ParsableByteArray.data>
	//   61  118:iload           9
	//   62  120:invokestatic    #131 <Method int indexOfZeroByte(byte[], int)>
	//   63  123:istore          10
			as[l] = new String(parsablebytearray.data, k1, l1 - k1, "ISO-8859-1");
	//   64  125:aload           14
	//   65  127:iload           6
	//   66  129:new             #106 <Class String>
	//   67  132:dup             
	//   68  133:aload_0         
	//   69  134:getfield        #166 <Field byte[] ParsableByteArray.data>
	//   70  137:iload           9
	//   71  139:iload           10
	//   72  141:iload           9
	//   73  143:isub            
	//   74  144:ldc1            #108 <String "ISO-8859-1">
	//   75  146:invokespecial   #111 <Method void String(byte[], int, int, String)>
	//   76  149:aastore         
			parsablebytearray.setPosition(l1 + 1);
	//   77  150:aload_0         
	//   78  151:iload           10
	//   79  153:iconst_1        
	//   80  154:iadd            
	//   81  155:invokevirtual   #170 <Method void ParsableByteArray.setPosition(int)>
		}

	//   82  158:iload           6
	//   83  160:iconst_1        
	//   84  161:iadd            
	//   85  162:istore          6
	//*  86  164:goto            101
		ArrayList arraylist = new ArrayList();
	//   87  167:new             #183 <Class ArrayList>
	//   88  170:dup             
	//   89  171:invokespecial   #184 <Method void ArrayList()>
	//   90  174:astore          15
		do
		{
			if(parsablebytearray.getPosition() >= i1 + i)
				break;
	//   91  176:aload_0         
	//   92  177:invokevirtual   #162 <Method int ParsableByteArray.getPosition()>
	//   93  180:iload           7
	//   94  182:iload_1         
	//   95  183:iadd            
	//   96  184:icmpge          215
			Id3Frame id3frame = decodeFrame(j, parsablebytearray, flag, k, framepredicate);
	//   97  187:iload_2         
	//   98  188:aload_0         
	//   99  189:iload_3         
	//  100  190:iload           4
	//  101  192:aload           5
	//  102  194:invokestatic    #188 <Method Id3Frame decodeFrame(int, ParsableByteArray, boolean, int, Id3Decoder$FramePredicate)>
	//  103  197:astore          16
			if(id3frame != null)
	//* 104  199:aload           16
	//* 105  201:ifnull          176
				arraylist.add(((Object) (id3frame)));
	//  106  204:aload           15
	//  107  206:aload           16
	//  108  208:invokevirtual   #191 <Method boolean ArrayList.add(Object)>
	//  109  211:pop             
		} while(true);
	//  110  212:goto            176
		parsablebytearray = ((ParsableByteArray) (new Id3Frame[arraylist.size()]));
	//  111  215:aload           15
	//  112  217:invokevirtual   #194 <Method int ArrayList.size()>
	//  113  220:anewarray       Id3Frame[]
	//  114  223:astore_0        
		arraylist.toArray(((Object []) (parsablebytearray)));
	//  115  224:aload           15
	//  116  226:aload_0         
	//  117  227:invokevirtual   #200 <Method Object[] ArrayList.toArray(Object[])>
	//  118  230:pop             
		return new ChapterTocFrame(s, flag1, flag2, as, ((Id3Frame []) (parsablebytearray)));
	//  119  231:new             #209 <Class ChapterTocFrame>
	//  120  234:dup             
	//  121  235:aload           13
	//  122  237:iload           11
	//  123  239:iload           12
	//  124  241:aload           14
	//  125  243:aload_0         
	//  126  244:invokespecial   #212 <Method void ChapterTocFrame(String, boolean, boolean, String[], Id3Frame[])>
	//  127  247:areturn         
	}

	private static CommentFrame decodeCommentFrame(ParsableByteArray parsablebytearray, int i)
		throws UnsupportedEncodingException
	{
		if(i < 4)
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpge          7
		{
			return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
		} else
		{
			int j = parsablebytearray.readUnsignedByte();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #87  <Method int ParsableByteArray.readUnsignedByte()>
	//    7   11:istore_2        
			String s = getCharsetName(j);
	//    8   12:iload_2         
	//    9   13:invokestatic    #91  <Method String getCharsetName(int)>
	//   10   16:astore_3        
			byte abyte0[] = new byte[3];
	//   11   17:iconst_3        
	//   12   18:newarray        byte[]
	//   13   20:astore          4
			parsablebytearray.readBytes(abyte0, 0, 3);
	//   14   22:aload_0         
	//   15   23:aload           4
	//   16   25:iconst_0        
	//   17   26:iconst_3        
	//   18   27:invokevirtual   #95  <Method void ParsableByteArray.readBytes(byte[], int, int)>
			String s1 = new String(abyte0, 0, 3);
	//   19   30:new             #106 <Class String>
	//   20   33:dup             
	//   21   34:aload           4
	//   22   36:iconst_0        
	//   23   37:iconst_3        
	//   24   38:invokespecial   #216 <Method void String(byte[], int, int)>
	//   25   41:astore          4
			i -= 4;
	//   26   43:iload_1         
	//   27   44:iconst_4        
	//   28   45:isub            
	//   29   46:istore_1        
			byte abyte1[] = new byte[i];
	//   30   47:iload_1         
	//   31   48:newarray        byte[]
	//   32   50:astore          5
			parsablebytearray.readBytes(abyte1, 0, i);
	//   33   52:aload_0         
	//   34   53:aload           5
	//   35   55:iconst_0        
	//   36   56:iload_1         
	//   37   57:invokevirtual   #95  <Method void ParsableByteArray.readBytes(byte[], int, int)>
			i = indexOfEos(abyte1, 0, j);
	//   38   60:aload           5
	//   39   62:iconst_0        
	//   40   63:iload_2         
	//   41   64:invokestatic    #139 <Method int indexOfEos(byte[], int, int)>
	//   42   67:istore_1        
			parsablebytearray = ((ParsableByteArray) (new String(abyte1, 0, i, s)));
	//   43   68:new             #106 <Class String>
	//   44   71:dup             
	//   45   72:aload           5
	//   46   74:iconst_0        
	//   47   75:iload_1         
	//   48   76:aload_3         
	//   49   77:invokespecial   #111 <Method void String(byte[], int, int, String)>
	//   50   80:astore_0        
			i += delimiterLength(j);
	//   51   81:iload_1         
	//   52   82:iload_2         
	//   53   83:invokestatic    #144 <Method int delimiterLength(int)>
	//   54   86:iadd            
	//   55   87:istore_1        
			return new CommentFrame(s1, ((String) (parsablebytearray)), decodeStringIfValid(abyte1, i, indexOfEos(abyte1, i, j), s));
	//   56   88:new             #218 <Class CommentFrame>
	//   57   91:dup             
	//   58   92:aload           4
	//   59   94:aload_0         
	//   60   95:aload           5
	//   61   97:iload_1         
	//   62   98:aload           5
	//   63  100:iload_1         
	//   64  101:iload_2         
	//   65  102:invokestatic    #139 <Method int indexOfEos(byte[], int, int)>
	//   66  105:aload_3         
	//   67  106:invokestatic    #222 <Method String decodeStringIfValid(byte[], int, int, String)>
	//   68  109:invokespecial   #225 <Method void CommentFrame(String, String, String)>
	//   69  112:areturn         
		}
	}

	private static Id3Frame decodeFrame(int i, ParsableByteArray parsablebytearray, boolean flag, int j, FramePredicate framepredicate)
	{
		int k;
		int i1;
		boolean flag1;
		boolean flag2;
		int l1;
		int i2;
		int j2;
		int l2;
		int i3;
		int j3;
		int k3;
		i3 = parsablebytearray.readUnsignedByte();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #87  <Method int ParsableByteArray.readUnsignedByte()>
	//    2    4:istore          14
		j3 = parsablebytearray.readUnsignedByte();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #87  <Method int ParsableByteArray.readUnsignedByte()>
	//    5   10:istore          15
		k3 = parsablebytearray.readUnsignedByte();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #87  <Method int ParsableByteArray.readUnsignedByte()>
	//    8   16:istore          16
		if(i >= 3)
	//*   9   18:iload_0         
	//*  10   19:iconst_3        
	//*  11   20:icmplt          32
			i2 = parsablebytearray.readUnsignedByte();
	//   12   23:aload_1         
	//   13   24:invokevirtual   #87  <Method int ParsableByteArray.readUnsignedByte()>
	//   14   27:istore          10
		else
	//*  15   29:goto            35
			i2 = 0;
	//   16   32:iconst_0        
	//   17   33:istore          10
		if(i == 4)
	//*  18   35:iload_0         
	//*  19   36:iconst_4        
	//*  20   37:icmpne          108
		{
			int l = parsablebytearray.readUnsignedIntToInt();
	//   21   40:aload_1         
	//   22   41:invokevirtual   #228 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   23   44:istore          6
			k = l;
	//   24   46:iload           6
	//   25   48:istore          5
			if(!flag)
	//*  26   50:iload_2         
	//*  27   51:ifne            101
				k = (l >> 24 & 0xff) << 21 | (l & 0xff | (l >> 8 & 0xff) << 7 | (l >> 16 & 0xff) << 14);
	//   28   54:iload           6
	//   29   56:bipush          24
	//   30   58:ishr            
	//   31   59:sipush          255
	//   32   62:iand            
	//   33   63:bipush          21
	//   34   65:ishl            
	//   35   66:iload           6
	//   36   68:sipush          255
	//   37   71:iand            
	//   38   72:iload           6
	//   39   74:bipush          8
	//   40   76:ishr            
	//   41   77:sipush          255
	//   42   80:iand            
	//   43   81:bipush          7
	//   44   83:ishl            
	//   45   84:ior             
	//   46   85:iload           6
	//   47   87:bipush          16
	//   48   89:ishr            
	//   49   90:sipush          255
	//   50   93:iand            
	//   51   94:bipush          14
	//   52   96:ishl            
	//   53   97:ior             
	//   54   98:ior             
	//   55   99:istore          5
		} else
	//*  56  101:iload           5
	//*  57  103:istore          11
	//*  58  105:goto            131
		if(i == 3)
	//*  59  108:iload_0         
	//*  60  109:iconst_3        
	//*  61  110:icmpne          122
			k = parsablebytearray.readUnsignedIntToInt();
	//   62  113:aload_1         
	//   63  114:invokevirtual   #228 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   64  117:istore          5
		else
	//*  65  119:goto            101
			k = parsablebytearray.readUnsignedInt24();
	//   66  122:aload_1         
	//   67  123:invokevirtual   #231 <Method int ParsableByteArray.readUnsignedInt24()>
	//   68  126:istore          5
		j2 = k;
	//*  69  128:goto            101
		if(i >= 3)
	//*  70  131:iload_0         
	//*  71  132:iconst_3        
	//*  72  133:icmplt          145
			k = parsablebytearray.readUnsignedShort();
	//   73  136:aload_1         
	//   74  137:invokevirtual   #234 <Method int ParsableByteArray.readUnsignedShort()>
	//   75  140:istore          5
		else
	//*  76  142:goto            148
			k = 0;
	//   77  145:iconst_0        
	//   78  146:istore          5
		if(i3 == 0 && j3 == 0 && k3 == 0 && i2 == 0 && j2 == 0 && k == 0)
	//*  79  148:iload           14
	//*  80  150:ifne            188
	//*  81  153:iload           15
	//*  82  155:ifne            188
	//*  83  158:iload           16
	//*  84  160:ifne            188
	//*  85  163:iload           10
	//*  86  165:ifne            188
	//*  87  168:iload           11
	//*  88  170:ifne            188
	//*  89  173:iload           5
	//*  90  175:ifne            188
		{
			parsablebytearray.setPosition(parsablebytearray.limit());
	//   91  178:aload_1         
	//   92  179:aload_1         
	//   93  180:invokevirtual   #237 <Method int ParsableByteArray.limit()>
	//   94  183:invokevirtual   #170 <Method void ParsableByteArray.setPosition(int)>
			return null;
	//   95  186:aconst_null     
	//   96  187:areturn         
		}
		l2 = parsablebytearray.getPosition() + j2;
	//   97  188:aload_1         
	//   98  189:invokevirtual   #162 <Method int ParsableByteArray.getPosition()>
	//   99  192:iload           11
	//  100  194:iadd            
	//  101  195:istore          13
		if(l2 > parsablebytearray.limit())
	//* 102  197:iload           13
	//* 103  199:aload_1         
	//* 104  200:invokevirtual   #237 <Method int ParsableByteArray.limit()>
	//* 105  203:icmple          224
		{
			Log.w("Id3Decoder", "Frame size exceeds remaining tag data");
	//  106  206:ldc1            #45  <String "Id3Decoder">
	//  107  208:ldc1            #239 <String "Frame size exceeds remaining tag data">
	//  108  210:invokestatic    #245 <Method int Log.w(String, String)>
	//  109  213:pop             
			parsablebytearray.setPosition(parsablebytearray.limit());
	//  110  214:aload_1         
	//  111  215:aload_1         
	//  112  216:invokevirtual   #237 <Method int ParsableByteArray.limit()>
	//  113  219:invokevirtual   #170 <Method void ParsableByteArray.setPosition(int)>
			return null;
	//  114  222:aconst_null     
	//  115  223:areturn         
		}
		if(framepredicate != null && !framepredicate.evaluate(i, i3, j3, k3, i2))
	//* 116  224:aload           4
	//* 117  226:ifnull          256
	//* 118  229:aload           4
	//* 119  231:iload_0         
	//* 120  232:iload           14
	//* 121  234:iload           15
	//* 122  236:iload           16
	//* 123  238:iload           10
	//* 124  240:invokeinterface #249 <Method boolean Id3Decoder$FramePredicate.evaluate(int, int, int, int, int)>
	//* 125  245:ifne            256
		{
			parsablebytearray.setPosition(l2);
	//  126  248:aload_1         
	//  127  249:iload           13
	//  128  251:invokevirtual   #170 <Method void ParsableByteArray.setPosition(int)>
			return null;
	//  129  254:aconst_null     
	//  130  255:areturn         
		}
		l1 = k;
	//  131  256:iload           5
	//  132  258:istore          9
		if(i == 3)
	//* 133  260:iload_0         
	//* 134  261:iconst_3        
	//* 135  262:icmpne          339
		{
			if((l1 & 0x80) != 0)
	//* 136  265:iload           9
	//* 137  267:sipush          128
	//* 138  270:iand            
	//* 139  271:ifeq            280
				k = 1;
	//  140  274:iconst_1        
	//  141  275:istore          5
			else
	//* 142  277:goto            283
				k = 0;
	//  143  280:iconst_0        
	//  144  281:istore          5
			if((l1 & 0x40) != 0)
	//* 145  283:iload           9
	//* 146  285:bipush          64
	//* 147  287:iand            
	//* 148  288:ifeq            297
				flag2 = true;
	//  149  291:iconst_1        
	//  150  292:istore          8
			else
	//* 151  294:goto            300
				flag2 = false;
	//  152  297:iconst_0        
	//  153  298:istore          8
			if((l1 & 0x20) != 0)
	//* 154  300:iload           9
	//* 155  302:bipush          32
	//* 156  304:iand            
	//* 157  305:ifeq            314
				i1 = 1;
	//  158  308:iconst_1        
	//  159  309:istore          6
			else
	//* 160  311:goto            317
				i1 = 0;
	//  161  314:iconst_0        
	//  162  315:istore          6
			l1 = i1;
	//  163  317:iload           6
	//  164  319:istore          9
			boolean flag3 = false;
	//  165  321:iconst_0        
	//  166  322:istore          12
			i1 = k;
	//  167  324:iload           5
	//  168  326:istore          6
			flag1 = ((boolean) (k));
	//  169  328:iload           5
	//  170  330:istore          7
			k = ((int) (flag3));
	//  171  332:iload           12
	//  172  334:istore          5
		} else
	//* 173  336:goto            456
		if(i == 4)
	//* 174  339:iload_0         
	//* 175  340:iconst_4        
	//* 176  341:icmpne          441
		{
			if((l1 & 0x40) != 0)
	//* 177  344:iload           9
	//* 178  346:bipush          64
	//* 179  348:iand            
	//* 180  349:ifeq            358
				i1 = 1;
	//  181  352:iconst_1        
	//  182  353:istore          6
			else
	//* 183  355:goto            361
				i1 = 0;
	//  184  358:iconst_0        
	//  185  359:istore          6
			if((l1 & 8) != 0)
	//* 186  361:iload           9
	//* 187  363:bipush          8
	//* 188  365:iand            
	//* 189  366:ifeq            375
				flag1 = true;
	//  190  369:iconst_1        
	//  191  370:istore          7
			else
	//* 192  372:goto            378
				flag1 = false;
	//  193  375:iconst_0        
	//  194  376:istore          7
			if((l1 & 4) != 0)
	//* 195  378:iload           9
	//* 196  380:iconst_4        
	//* 197  381:iand            
	//* 198  382:ifeq            391
				flag2 = true;
	//  199  385:iconst_1        
	//  200  386:istore          8
			else
	//* 201  388:goto            394
				flag2 = false;
	//  202  391:iconst_0        
	//  203  392:istore          8
			if((l1 & 2) != 0)
	//* 204  394:iload           9
	//* 205  396:iconst_2        
	//* 206  397:iand            
	//* 207  398:ifeq            407
				k = 1;
	//  208  401:iconst_1        
	//  209  402:istore          5
			else
	//* 210  404:goto            410
				k = 0;
	//  211  407:iconst_0        
	//  212  408:istore          5
			if((l1 & 1) != 0)
	//* 213  410:iload           9
	//* 214  412:iconst_1        
	//* 215  413:iand            
	//* 216  414:ifeq            423
				l1 = 1;
	//  217  417:iconst_1        
	//  218  418:istore          9
			else
	//* 219  420:goto            426
				l1 = 0;
	//  220  423:iconst_0        
	//  221  424:istore          9
			int k2 = i1;
	//  222  426:iload           6
	//  223  428:istore          12
			i1 = l1;
	//  224  430:iload           9
	//  225  432:istore          6
			l1 = k2;
	//  226  434:iload           12
	//  227  436:istore          9
		} else
	//* 228  438:goto            456
		{
			flag1 = false;
	//  229  441:iconst_0        
	//  230  442:istore          7
			flag2 = false;
	//  231  444:iconst_0        
	//  232  445:istore          8
			i1 = 0;
	//  233  447:iconst_0        
	//  234  448:istore          6
			k = 0;
	//  235  450:iconst_0        
	//  236  451:istore          5
			l1 = 0;
	//  237  453:iconst_0        
	//  238  454:istore          9
		}
		if(!flag1 && !flag2) goto _L2; else goto _L1
	//  239  456:iload           7
	//  240  458:ifne            926
	//  241  461:iload           8
	//  242  463:ifeq            469
	//* 243  466:goto            926
_L2:
		int j1 = j2;
	//  244  469:iload           11
	//  245  471:istore          7
		if(l1 != 0)
	//* 246  473:iload           9
	//* 247  475:ifeq            489
		{
			j1 = j2 - 1;
	//  248  478:iload           11
	//  249  480:iconst_1        
	//  250  481:isub            
	//  251  482:istore          7
			parsablebytearray.skipBytes(1);
	//  252  484:aload_1         
	//  253  485:iconst_1        
	//  254  486:invokevirtual   #252 <Method void ParsableByteArray.skipBytes(int)>
		}
		int k1 = j1;
	//  255  489:iload           7
	//  256  491:istore          8
		if(i1 != 0)
	//* 257  493:iload           6
	//* 258  495:ifeq            509
		{
			k1 = j1 - 4;
	//  259  498:iload           7
	//  260  500:iconst_4        
	//  261  501:isub            
	//  262  502:istore          8
			parsablebytearray.skipBytes(4);
	//  263  504:aload_1         
	//  264  505:iconst_4        
	//  265  506:invokevirtual   #252 <Method void ParsableByteArray.skipBytes(int)>
		}
		i1 = k1;
	//  266  509:iload           8
	//  267  511:istore          6
		if(k)
	//* 268  513:iload           5
	//* 269  515:ifeq            526
			i1 = removeUnsynchronization(parsablebytearray, k1);
	//  270  518:aload_1         
	//  271  519:iload           8
	//  272  521:invokestatic    #256 <Method int removeUnsynchronization(ParsableByteArray, int)>
	//  273  524:istore          6
		if(i3 != 84 || j3 != 88 || k3 != 88 || i != 2 && i2 != 88) goto _L4; else goto _L3
	//  274  526:iload           14
	//  275  528:bipush          84
	//  276  530:icmpne          570
	//  277  533:iload           15
	//  278  535:bipush          88
	//  279  537:icmpne          570
	//  280  540:iload           16
	//  281  542:bipush          88
	//  282  544:icmpne          570
	//  283  547:iload_0         
	//  284  548:iconst_2        
	//  285  549:icmpeq          559
	//  286  552:iload           10
	//  287  554:bipush          88
	//  288  556:icmpne          570
_L3:
		framepredicate = ((FramePredicate) (decodeTxxxFrame(parsablebytearray, i1)));
	//  289  559:aload_1         
	//  290  560:iload           6
	//  291  562:invokestatic    #260 <Method TextInformationFrame decodeTxxxFrame(ParsableByteArray, int)>
	//  292  565:astore          4
		  goto _L5
	//* 293  567:goto            822
_L4:
		if(i3 != 84) goto _L7; else goto _L6
	//  294  570:iload           14
	//  295  572:bipush          84
	//  296  574:icmpne          953
_L6:
		framepredicate = ((FramePredicate) (decodeTextInformationFrame(parsablebytearray, i1, getFrameId(i, i3, j3, k3, i2))));
	//  297  577:aload_1         
	//  298  578:iload           6
	//  299  580:iload_0         
	//  300  581:iload           14
	//  301  583:iload           15
	//  302  585:iload           16
	//  303  587:iload           10
	//  304  589:invokestatic    #264 <Method String getFrameId(int, int, int, int, int)>
	//  305  592:invokestatic    #268 <Method TextInformationFrame decodeTextInformationFrame(ParsableByteArray, int, String)>
	//  306  595:astore          4
		  goto _L5
	//* 307  597:goto            822
_L18:
		framepredicate = ((FramePredicate) (decodeWxxxFrame(parsablebytearray, i1)));
	//  308  600:aload_1         
	//  309  601:iload           6
	//  310  603:invokestatic    #272 <Method UrlLinkFrame decodeWxxxFrame(ParsableByteArray, int)>
	//  311  606:astore          4
		  goto _L5
	//* 312  608:goto            822
_L19:
		if(i3 != 87) goto _L9; else goto _L8
	//  313  611:iload           14
	//  314  613:bipush          87
	//  315  615:icmpne          641
_L8:
		framepredicate = ((FramePredicate) (decodeUrlLinkFrame(parsablebytearray, i1, getFrameId(i, i3, j3, k3, i2))));
	//  316  618:aload_1         
	//  317  619:iload           6
	//  318  621:iload_0         
	//  319  622:iload           14
	//  320  624:iload           15
	//  321  626:iload           16
	//  322  628:iload           10
	//  323  630:invokestatic    #264 <Method String getFrameId(int, int, int, int, int)>
	//  324  633:invokestatic    #276 <Method UrlLinkFrame decodeUrlLinkFrame(ParsableByteArray, int, String)>
	//  325  636:astore          4
		  goto _L5
	//* 326  638:goto            822
_L9:
		if(i3 != 80 || j3 != 82 || k3 != 73 || i2 != 86) goto _L11; else goto _L10
	//  327  641:iload           14
	//  328  643:bipush          80
	//  329  645:icmpne          989
	//  330  648:iload           15
	//  331  650:bipush          82
	//  332  652:icmpne          989
	//  333  655:iload           16
	//  334  657:bipush          73
	//  335  659:icmpne          989
	//  336  662:iload           10
	//  337  664:bipush          86
	//  338  666:icmpne          989
_L10:
		framepredicate = ((FramePredicate) (decodePrivFrame(parsablebytearray, i1)));
	//  339  669:aload_1         
	//  340  670:iload           6
	//  341  672:invokestatic    #280 <Method PrivFrame decodePrivFrame(ParsableByteArray, int)>
	//  342  675:astore          4
		  goto _L5
	//* 343  677:goto            822
_L20:
		framepredicate = ((FramePredicate) (decodeGeobFrame(parsablebytearray, i1)));
	//  344  680:aload_1         
	//  345  681:iload           6
	//  346  683:invokestatic    #284 <Method GeobFrame decodeGeobFrame(ParsableByteArray, int)>
	//  347  686:astore          4
		  goto _L5
	//* 348  688:goto            822
_L22:
		framepredicate = ((FramePredicate) (decodeApicFrame(parsablebytearray, i1, i)));
	//  349  691:aload_1         
	//  350  692:iload           6
	//  351  694:iload_0         
	//  352  695:invokestatic    #286 <Method ApicFrame decodeApicFrame(ParsableByteArray, int, int)>
	//  353  698:astore          4
		  goto _L5
	//* 354  700:goto            822
_L24:
		framepredicate = ((FramePredicate) (decodeCommentFrame(parsablebytearray, i1)));
	//  355  703:aload_1         
	//  356  704:iload           6
	//  357  706:invokestatic    #288 <Method CommentFrame decodeCommentFrame(ParsableByteArray, int)>
	//  358  709:astore          4
		  goto _L5
	//* 359  711:goto            822
_L25:
		if(i3 != 67 || j3 != 72 || k3 != 65 || i2 != 80) goto _L13; else goto _L12
	//  360  714:iload           14
	//  361  716:bipush          67
	//  362  718:icmpne          758
	//  363  721:iload           15
	//  364  723:bipush          72
	//  365  725:icmpne          758
	//  366  728:iload           16
	//  367  730:bipush          65
	//  368  732:icmpne          758
	//  369  735:iload           10
	//  370  737:bipush          80
	//  371  739:icmpne          758
_L12:
		framepredicate = ((FramePredicate) (decodeChapterFrame(parsablebytearray, i1, i, flag, j, framepredicate)));
	//  372  742:aload_1         
	//  373  743:iload           6
	//  374  745:iload_0         
	//  375  746:iload_2         
	//  376  747:iload_3         
	//  377  748:aload           4
	//  378  750:invokestatic    #290 <Method ChapterFrame decodeChapterFrame(ParsableByteArray, int, int, boolean, int, Id3Decoder$FramePredicate)>
	//  379  753:astore          4
		  goto _L5
	//* 380  755:goto            822
_L13:
		if(i3 != 67 || j3 != 84 || k3 != 79 || i2 != 67) goto _L15; else goto _L14
	//  381  758:iload           14
	//  382  760:bipush          67
	//  383  762:icmpne          802
	//  384  765:iload           15
	//  385  767:bipush          84
	//  386  769:icmpne          802
	//  387  772:iload           16
	//  388  774:bipush          79
	//  389  776:icmpne          802
	//  390  779:iload           10
	//  391  781:bipush          67
	//  392  783:icmpne          802
_L14:
		framepredicate = ((FramePredicate) (decodeChapterTOCFrame(parsablebytearray, i1, i, flag, j, framepredicate)));
	//  393  786:aload_1         
	//  394  787:iload           6
	//  395  789:iload_0         
	//  396  790:iload_2         
	//  397  791:iload_3         
	//  398  792:aload           4
	//  399  794:invokestatic    #292 <Method ChapterTocFrame decodeChapterTOCFrame(ParsableByteArray, int, int, boolean, int, Id3Decoder$FramePredicate)>
	//  400  797:astore          4
		  goto _L5
	//* 401  799:goto            822
_L15:
		framepredicate = ((FramePredicate) (decodeBinaryFrame(parsablebytearray, i1, getFrameId(i, i3, j3, k3, i2))));
	//  402  802:aload_1         
	//  403  803:iload           6
	//  404  805:iload_0         
	//  405  806:iload           14
	//  406  808:iload           15
	//  407  810:iload           16
	//  408  812:iload           10
	//  409  814:invokestatic    #264 <Method String getFrameId(int, int, int, int, int)>
	//  410  817:invokestatic    #294 <Method BinaryFrame decodeBinaryFrame(ParsableByteArray, int, String)>
	//  411  820:astore          4
_L5:
		if(framepredicate != null)
			break MISSING_BLOCK_LABEL_891;
	//  412  822:aload           4
	//  413  824:ifnonnull       891
		StringBuilder stringbuilder = new StringBuilder();
	//  414  827:new             #97  <Class StringBuilder>
	//  415  830:dup             
	//  416  831:invokespecial   #98  <Method void StringBuilder()>
	//  417  834:astore          17
		stringbuilder.append("Failed to decode frame: id=");
	//  418  836:aload           17
	//  419  838:ldc2            #296 <String "Failed to decode frame: id=">
	//  420  841:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//  421  844:pop             
		stringbuilder.append(getFrameId(i, i3, j3, k3, i2));
	//  422  845:aload           17
	//  423  847:iload_0         
	//  424  848:iload           14
	//  425  850:iload           15
	//  426  852:iload           16
	//  427  854:iload           10
	//  428  856:invokestatic    #264 <Method String getFrameId(int, int, int, int, int)>
	//  429  859:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//  430  862:pop             
		stringbuilder.append(", frameSize=");
	//  431  863:aload           17
	//  432  865:ldc2            #298 <String ", frameSize=">
	//  433  868:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//  434  871:pop             
		stringbuilder.append(i1);
	//  435  872:aload           17
	//  436  874:iload           6
	//  437  876:invokevirtual   #301 <Method StringBuilder StringBuilder.append(int)>
	//  438  879:pop             
		Log.w("Id3Decoder", stringbuilder.toString());
	//  439  880:ldc1            #45  <String "Id3Decoder">
	//  440  882:aload           17
	//  441  884:invokevirtual   #119 <Method String StringBuilder.toString()>
	//  442  887:invokestatic    #245 <Method int Log.w(String, String)>
	//  443  890:pop             
		parsablebytearray.setPosition(l2);
	//  444  891:aload_1         
	//  445  892:iload           13
	//  446  894:invokevirtual   #170 <Method void ParsableByteArray.setPosition(int)>
		return ((Id3Frame) (framepredicate));
	//  447  897:aload           4
	//  448  899:areturn         
_L16:
		Log.w("Id3Decoder", "Unsupported character encoding");
	//  449  900:ldc1            #45  <String "Id3Decoder">
	//  450  902:ldc2            #303 <String "Unsupported character encoding">
	//  451  905:invokestatic    #245 <Method int Log.w(String, String)>
	//  452  908:pop             
		parsablebytearray.setPosition(l2);
	//  453  909:aload_1         
	//  454  910:iload           13
	//  455  912:invokevirtual   #170 <Method void ParsableByteArray.setPosition(int)>
		return null;
	//  456  915:aconst_null     
	//  457  916:areturn         
_L17:
		parsablebytearray.setPosition(l2);
	//  458  917:aload_1         
	//  459  918:iload           13
	//  460  920:invokevirtual   #170 <Method void ParsableByteArray.setPosition(int)>
		throw framepredicate;
	//  461  923:aload           4
	//  462  925:athrow          
_L1:
		Log.w("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
	//  463  926:ldc1            #45  <String "Id3Decoder">
	//  464  928:ldc2            #305 <String "Skipping unsupported compressed or encrypted frame">
	//  465  931:invokestatic    #245 <Method int Log.w(String, String)>
	//  466  934:pop             
		parsablebytearray.setPosition(l2);
	//  467  935:aload_1         
	//  468  936:iload           13
	//  469  938:invokevirtual   #170 <Method void ParsableByteArray.setPosition(int)>
		return null;
	//  470  941:aconst_null     
	//  471  942:areturn         
		framepredicate;
	//  472  943:astore          4
		  goto _L16
	//* 473  945:goto            900
		framepredicate;
	//  474  948:astore          4
		  goto _L17
	//* 475  950:goto            917
_L7:
		if(i3 != 87 || j3 != 88 || k3 != 88 || i != 2 && i2 != 88) goto _L19; else goto _L18
	//  476  953:iload           14
	//  477  955:bipush          87
	//  478  957:icmpne          611
	//  479  960:iload           15
	//  480  962:bipush          88
	//  481  964:icmpne          611
	//  482  967:iload           16
	//  483  969:bipush          88
	//  484  971:icmpne          611
	//  485  974:iload_0         
	//  486  975:iconst_2        
	//  487  976:icmpeq          600
	//  488  979:iload           10
	//  489  981:bipush          88
	//  490  983:icmpne          611
	//* 491  986:goto            600
_L11:
		if(i3 != 71 || j3 != 69 || k3 != 79 || i2 != 66 && i != 2) goto _L21; else goto _L20
	//  492  989:iload           14
	//  493  991:bipush          71
	//  494  993:icmpne          1025
	//  495  996:iload           15
	//  496  998:bipush          69
	//  497 1000:icmpne          1025
	//  498 1003:iload           16
	//  499 1005:bipush          79
	//  500 1007:icmpne          1025
	//  501 1010:iload           10
	//  502 1012:bipush          66
	//  503 1014:icmpeq          680
	//  504 1017:iload_0         
	//  505 1018:iconst_2        
	//  506 1019:icmpne          1025
	//* 507 1022:goto            680
_L21:
		if(i != 2 ? i3 != 65 || j3 != 80 || k3 != 73 || i2 != 67 : i3 != 80 || j3 != 73 || k3 != 67) goto _L23; else goto _L22
	//  508 1025:iload_0         
	//  509 1026:iconst_2        
	//  510 1027:icmpne          1054
	//  511 1030:iload           14
	//  512 1032:bipush          80
	//  513 1034:icmpne          1085
	//  514 1037:iload           15
	//  515 1039:bipush          73
	//  516 1041:icmpne          1085
	//  517 1044:iload           16
	//  518 1046:bipush          67
	//  519 1048:icmpne          1085
	//  520 1051:goto            691
	//  521 1054:iload           14
	//  522 1056:bipush          65
	//  523 1058:icmpne          1085
	//  524 1061:iload           15
	//  525 1063:bipush          80
	//  526 1065:icmpne          1085
	//  527 1068:iload           16
	//  528 1070:bipush          73
	//  529 1072:icmpne          1085
	//  530 1075:iload           10
	//  531 1077:bipush          67
	//  532 1079:icmpne          1085
	//* 533 1082:goto            691
_L23:
		if(i3 != 67 || j3 != 79 || k3 != 77 || i2 != 77 && i != 2) goto _L25; else goto _L24
	//  534 1085:iload           14
	//  535 1087:bipush          67
	//  536 1089:icmpne          714
	//  537 1092:iload           15
	//  538 1094:bipush          79
	//  539 1096:icmpne          714
	//  540 1099:iload           16
	//  541 1101:bipush          77
	//  542 1103:icmpne          714
	//  543 1106:iload           10
	//  544 1108:bipush          77
	//  545 1110:icmpeq          703
	//  546 1113:iload_0         
	//  547 1114:iconst_2        
	//  548 1115:icmpne          714
	//* 549 1118:goto            703
	}

	private static GeobFrame decodeGeobFrame(ParsableByteArray parsablebytearray, int i)
		throws UnsupportedEncodingException
	{
		int j = parsablebytearray.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #87  <Method int ParsableByteArray.readUnsignedByte()>
	//    2    4:istore_2        
		String s = getCharsetName(j);
	//    3    5:iload_2         
	//    4    6:invokestatic    #91  <Method String getCharsetName(int)>
	//    5    9:astore          4
		i--;
	//    6   11:iload_1         
	//    7   12:iconst_1        
	//    8   13:isub            
	//    9   14:istore_1        
		byte abyte0[] = new byte[i];
	//   10   15:iload_1         
	//   11   16:newarray        byte[]
	//   12   18:astore          5
		parsablebytearray.readBytes(abyte0, 0, i);
	//   13   20:aload_0         
	//   14   21:aload           5
	//   15   23:iconst_0        
	//   16   24:iload_1         
	//   17   25:invokevirtual   #95  <Method void ParsableByteArray.readBytes(byte[], int, int)>
		i = indexOfZeroByte(abyte0, 0);
	//   18   28:aload           5
	//   19   30:iconst_0        
	//   20   31:invokestatic    #131 <Method int indexOfZeroByte(byte[], int)>
	//   21   34:istore_1        
		parsablebytearray = ((ParsableByteArray) (new String(abyte0, 0, i, "ISO-8859-1")));
	//   22   35:new             #106 <Class String>
	//   23   38:dup             
	//   24   39:aload           5
	//   25   41:iconst_0        
	//   26   42:iload_1         
	//   27   43:ldc1            #108 <String "ISO-8859-1">
	//   28   45:invokespecial   #111 <Method void String(byte[], int, int, String)>
	//   29   48:astore_0        
		i++;
	//   30   49:iload_1         
	//   31   50:iconst_1        
	//   32   51:iadd            
	//   33   52:istore_1        
		int k = indexOfEos(abyte0, i, j);
	//   34   53:aload           5
	//   35   55:iload_1         
	//   36   56:iload_2         
	//   37   57:invokestatic    #139 <Method int indexOfEos(byte[], int, int)>
	//   38   60:istore_3        
		String s1 = decodeStringIfValid(abyte0, i, k, s);
	//   39   61:aload           5
	//   40   63:iload_1         
	//   41   64:iload_3         
	//   42   65:aload           4
	//   43   67:invokestatic    #222 <Method String decodeStringIfValid(byte[], int, int, String)>
	//   44   70:astore          6
		i = k + delimiterLength(j);
	//   45   72:iload_3         
	//   46   73:iload_2         
	//   47   74:invokestatic    #144 <Method int delimiterLength(int)>
	//   48   77:iadd            
	//   49   78:istore_1        
		k = indexOfEos(abyte0, i, j);
	//   50   79:aload           5
	//   51   81:iload_1         
	//   52   82:iload_2         
	//   53   83:invokestatic    #139 <Method int indexOfEos(byte[], int, int)>
	//   54   86:istore_3        
		return new GeobFrame(((String) (parsablebytearray)), s1, decodeStringIfValid(abyte0, i, k, s), copyOfRangeIfValid(abyte0, k + delimiterLength(j), abyte0.length));
	//   55   87:new             #307 <Class GeobFrame>
	//   56   90:dup             
	//   57   91:aload_0         
	//   58   92:aload           6
	//   59   94:aload           5
	//   60   96:iload_1         
	//   61   97:iload_3         
	//   62   98:aload           4
	//   63  100:invokestatic    #222 <Method String decodeStringIfValid(byte[], int, int, String)>
	//   64  103:aload           5
	//   65  105:iload_3         
	//   66  106:iload_2         
	//   67  107:invokestatic    #144 <Method int delimiterLength(int)>
	//   68  110:iadd            
	//   69  111:aload           5
	//   70  113:arraylength     
	//   71  114:invokestatic    #146 <Method byte[] copyOfRangeIfValid(byte[], int, int)>
	//   72  117:invokespecial   #310 <Method void GeobFrame(String, String, String, byte[])>
	//   73  120:areturn         
	}

	private static Id3Header decodeHeader(ParsableByteArray parsablebytearray)
	{
		int l;
label0:
		{
			if(parsablebytearray.bytesLeft() < 10)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #315 <Method int ParsableByteArray.bytesLeft()>
	//*   2    4:bipush          10
	//*   3    6:icmpge          20
			{
				Log.w("Id3Decoder", "Data too short to be an ID3 tag");
	//    4    9:ldc1            #45  <String "Id3Decoder">
	//    5   11:ldc2            #317 <String "Data too short to be an ID3 tag">
	//    6   14:invokestatic    #245 <Method int Log.w(String, String)>
	//    7   17:pop             
				return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
			}
			int i = parsablebytearray.readUnsignedInt24();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #231 <Method int ParsableByteArray.readUnsignedInt24()>
	//   12   24:istore_1        
			if(i != ID3_TAG)
	//*  13   25:iload_1         
	//*  14   26:getstatic       #63  <Field int ID3_TAG>
	//*  15   29:icmpeq          66
			{
				parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
	//   16   32:new             #97  <Class StringBuilder>
	//   17   35:dup             
	//   18   36:invokespecial   #98  <Method void StringBuilder()>
	//   19   39:astore_0        
				((StringBuilder) (parsablebytearray)).append("Unexpected first three bytes of ID3 tag header: ");
	//   20   40:aload_0         
	//   21   41:ldc2            #319 <String "Unexpected first three bytes of ID3 tag header: ">
	//   22   44:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
				((StringBuilder) (parsablebytearray)).append(i);
	//   24   48:aload_0         
	//   25   49:iload_1         
	//   26   50:invokevirtual   #301 <Method StringBuilder StringBuilder.append(int)>
	//   27   53:pop             
				Log.w("Id3Decoder", ((StringBuilder) (parsablebytearray)).toString());
	//   28   54:ldc1            #45  <String "Id3Decoder">
	//   29   56:aload_0         
	//   30   57:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   31   60:invokestatic    #245 <Method int Log.w(String, String)>
	//   32   63:pop             
				return null;
	//   33   64:aconst_null     
	//   34   65:areturn         
			}
			l = parsablebytearray.readUnsignedByte();
	//   35   66:aload_0         
	//   36   67:invokevirtual   #87  <Method int ParsableByteArray.readUnsignedByte()>
	//   37   70:istore          4
			boolean flag3 = true;
	//   38   72:iconst_1        
	//   39   73:istore          6
			parsablebytearray.skipBytes(1);
	//   40   75:aload_0         
	//   41   76:iconst_1        
	//   42   77:invokevirtual   #252 <Method void ParsableByteArray.skipBytes(int)>
			int i1 = parsablebytearray.readUnsignedByte();
	//   43   80:aload_0         
	//   44   81:invokevirtual   #87  <Method int ParsableByteArray.readUnsignedByte()>
	//   45   84:istore          5
			int k = parsablebytearray.readSynchSafeInt();
	//   46   86:aload_0         
	//   47   87:invokevirtual   #322 <Method int ParsableByteArray.readSynchSafeInt()>
	//   48   90:istore_3        
			if(l == 2)
	//*  49   91:iload           4
	//*  50   93:iconst_2        
	//*  51   94:icmpne          129
			{
				boolean flag;
				if((i1 & 0x40) != 0)
	//*  52   97:iload           5
	//*  53   99:bipush          64
	//*  54  101:iand            
	//*  55  102:ifeq            110
					flag = true;
	//   56  105:iconst_1        
	//   57  106:istore_2        
				else
	//*  58  107:goto            112
					flag = false;
	//   59  110:iconst_0        
	//   60  111:istore_2        
				i = k;
	//   61  112:iload_3         
	//   62  113:istore_1        
				if(flag)
	//*  63  114:iload_2         
	//*  64  115:ifeq            244
				{
					Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
	//   65  118:ldc1            #45  <String "Id3Decoder">
	//   66  120:ldc2            #324 <String "Skipped ID3 tag with majorVersion=2 and undefined compression scheme">
	//   67  123:invokestatic    #245 <Method int Log.w(String, String)>
	//   68  126:pop             
					return null;
	//   69  127:aconst_null     
	//   70  128:areturn         
				}
			} else
			if(l == 3)
	//*  71  129:iload           4
	//*  72  131:iconst_3        
	//*  73  132:icmpne          175
			{
				boolean flag1;
				if((i1 & 0x40) != 0)
	//*  74  135:iload           5
	//*  75  137:bipush          64
	//*  76  139:iand            
	//*  77  140:ifeq            148
					flag1 = true;
	//   78  143:iconst_1        
	//   79  144:istore_2        
				else
	//*  80  145:goto            150
					flag1 = false;
	//   81  148:iconst_0        
	//   82  149:istore_2        
				i = k;
	//   83  150:iload_3         
	//   84  151:istore_1        
				if(flag1)
	//*  85  152:iload_2         
	//*  86  153:ifeq            244
				{
					i = parsablebytearray.readInt();
	//   87  156:aload_0         
	//   88  157:invokevirtual   #173 <Method int ParsableByteArray.readInt()>
	//   89  160:istore_1        
					parsablebytearray.skipBytes(i);
	//   90  161:aload_0         
	//   91  162:iload_1         
	//   92  163:invokevirtual   #252 <Method void ParsableByteArray.skipBytes(int)>
					i = k - (i + 4);
	//   93  166:iload_3         
	//   94  167:iload_1         
	//   95  168:iconst_4        
	//   96  169:iadd            
	//   97  170:isub            
	//   98  171:istore_1        
				}
			} else
	//*  99  172:goto            244
			{
				if(l != 4)
					break label0;
	//  100  175:iload           4
	//  101  177:iconst_4        
	//  102  178:icmpne          278
				if((i1 & 0x40) != 0)
	//* 103  181:iload           5
	//* 104  183:bipush          64
	//* 105  185:iand            
	//* 106  186:ifeq            194
					i = 1;
	//  107  189:iconst_1        
	//  108  190:istore_1        
				else
	//* 109  191:goto            196
					i = 0;
	//  110  194:iconst_0        
	//  111  195:istore_1        
				int j = k;
	//  112  196:iload_3         
	//  113  197:istore_2        
				if(i != 0)
	//* 114  198:iload_1         
	//* 115  199:ifeq            218
				{
					i = parsablebytearray.readSynchSafeInt();
	//  116  202:aload_0         
	//  117  203:invokevirtual   #322 <Method int ParsableByteArray.readSynchSafeInt()>
	//  118  206:istore_1        
					parsablebytearray.skipBytes(i - 4);
	//  119  207:aload_0         
	//  120  208:iload_1         
	//  121  209:iconst_4        
	//  122  210:isub            
	//  123  211:invokevirtual   #252 <Method void ParsableByteArray.skipBytes(int)>
					j = k - i;
	//  124  214:iload_3         
	//  125  215:iload_1         
	//  126  216:isub            
	//  127  217:istore_2        
				}
				boolean flag2;
				if((i1 & 0x10) != 0)
	//* 128  218:iload           5
	//* 129  220:bipush          16
	//* 130  222:iand            
	//* 131  223:ifeq            231
					flag2 = true;
	//  132  226:iconst_1        
	//  133  227:istore_3        
				else
	//* 134  228:goto            233
					flag2 = false;
	//  135  231:iconst_0        
	//  136  232:istore_3        
				i = j;
	//  137  233:iload_2         
	//  138  234:istore_1        
				if(flag2)
	//* 139  235:iload_3         
	//* 140  236:ifeq            244
					i = j - 10;
	//  141  239:iload_2         
	//  142  240:bipush          10
	//  143  242:isub            
	//  144  243:istore_1        
			}
			if(l >= 4 || (i1 & 0x80) == 0)
	//* 145  244:iload           4
	//* 146  246:iconst_4        
	//* 147  247:icmpge          262
	//* 148  250:iload           5
	//* 149  252:sipush          128
	//* 150  255:iand            
	//* 151  256:ifeq            262
	//* 152  259:goto            265
				flag3 = false;
	//  153  262:iconst_0        
	//  154  263:istore          6
			return new Id3Header(l, flag3, i);
	//  155  265:new             #13  <Class Id3Decoder$Id3Header>
	//  156  268:dup             
	//  157  269:iload           4
	//  158  271:iload           6
	//  159  273:iload_1         
	//  160  274:invokespecial   #327 <Method void Id3Decoder$Id3Header(int, boolean, int)>
	//  161  277:areturn         
		}
		parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
	//  162  278:new             #97  <Class StringBuilder>
	//  163  281:dup             
	//  164  282:invokespecial   #98  <Method void StringBuilder()>
	//  165  285:astore_0        
		((StringBuilder) (parsablebytearray)).append("Skipped ID3 tag with unsupported majorVersion=");
	//  166  286:aload_0         
	//  167  287:ldc2            #329 <String "Skipped ID3 tag with unsupported majorVersion=">
	//  168  290:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//  169  293:pop             
		((StringBuilder) (parsablebytearray)).append(l);
	//  170  294:aload_0         
	//  171  295:iload           4
	//  172  297:invokevirtual   #301 <Method StringBuilder StringBuilder.append(int)>
	//  173  300:pop             
		Log.w("Id3Decoder", ((StringBuilder) (parsablebytearray)).toString());
	//  174  301:ldc1            #45  <String "Id3Decoder">
	//  175  303:aload_0         
	//  176  304:invokevirtual   #119 <Method String StringBuilder.toString()>
	//  177  307:invokestatic    #245 <Method int Log.w(String, String)>
	//  178  310:pop             
		return null;
	//  179  311:aconst_null     
	//  180  312:areturn         
	}

	private static PrivFrame decodePrivFrame(ParsableByteArray parsablebytearray, int i)
		throws UnsupportedEncodingException
	{
		byte abyte0[] = new byte[i];
	//    0    0:iload_1         
	//    1    1:newarray        byte[]
	//    2    3:astore_2        
		parsablebytearray.readBytes(abyte0, 0, i);
	//    3    4:aload_0         
	//    4    5:aload_2         
	//    5    6:iconst_0        
	//    6    7:iload_1         
	//    7    8:invokevirtual   #95  <Method void ParsableByteArray.readBytes(byte[], int, int)>
		i = indexOfZeroByte(abyte0, 0);
	//    8   11:aload_2         
	//    9   12:iconst_0        
	//   10   13:invokestatic    #131 <Method int indexOfZeroByte(byte[], int)>
	//   11   16:istore_1        
		return new PrivFrame(new String(abyte0, 0, i, "ISO-8859-1"), copyOfRangeIfValid(abyte0, i + 1, abyte0.length));
	//   12   17:new             #331 <Class PrivFrame>
	//   13   20:dup             
	//   14   21:new             #106 <Class String>
	//   15   24:dup             
	//   16   25:aload_2         
	//   17   26:iconst_0        
	//   18   27:iload_1         
	//   19   28:ldc1            #108 <String "ISO-8859-1">
	//   20   30:invokespecial   #111 <Method void String(byte[], int, int, String)>
	//   21   33:aload_2         
	//   22   34:iload_1         
	//   23   35:iconst_1        
	//   24   36:iadd            
	//   25   37:aload_2         
	//   26   38:arraylength     
	//   27   39:invokestatic    #146 <Method byte[] copyOfRangeIfValid(byte[], int, int)>
	//   28   42:invokespecial   #332 <Method void PrivFrame(String, byte[])>
	//   29   45:areturn         
	}

	private static String decodeStringIfValid(byte abyte0[], int i, int j, String s)
		throws UnsupportedEncodingException
	{
		if(j > i && j <= abyte0.length)
	//*   0    0:iload_2         
	//*   1    1:iload_1         
	//*   2    2:icmple          28
	//*   3    5:iload_2         
	//*   4    6:aload_0         
	//*   5    7:arraylength     
	//*   6    8:icmple          14
	//*   7   11:goto            28
			return new String(abyte0, i, j - i, s);
	//    8   14:new             #106 <Class String>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:iload_2         
	//   13   21:iload_1         
	//   14   22:isub            
	//   15   23:aload_3         
	//   16   24:invokespecial   #111 <Method void String(byte[], int, int, String)>
	//   17   27:areturn         
		else
			return "";
	//   18   28:ldc2            #334 <String "">
	//   19   31:areturn         
	}

	private static TextInformationFrame decodeTextInformationFrame(ParsableByteArray parsablebytearray, int i, String s)
		throws UnsupportedEncodingException
	{
		if(i < 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpge          7
		{
			return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
		} else
		{
			int j = parsablebytearray.readUnsignedByte();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #87  <Method int ParsableByteArray.readUnsignedByte()>
	//    7   11:istore_3        
			String s1 = getCharsetName(j);
	//    8   12:iload_3         
	//    9   13:invokestatic    #91  <Method String getCharsetName(int)>
	//   10   16:astore          4
			i--;
	//   11   18:iload_1         
	//   12   19:iconst_1        
	//   13   20:isub            
	//   14   21:istore_1        
			byte abyte0[] = new byte[i];
	//   15   22:iload_1         
	//   16   23:newarray        byte[]
	//   17   25:astore          5
			parsablebytearray.readBytes(abyte0, 0, i);
	//   18   27:aload_0         
	//   19   28:aload           5
	//   20   30:iconst_0        
	//   21   31:iload_1         
	//   22   32:invokevirtual   #95  <Method void ParsableByteArray.readBytes(byte[], int, int)>
			return new TextInformationFrame(s, ((String) (null)), new String(abyte0, 0, indexOfEos(abyte0, 0, j), s1));
	//   23   35:new             #336 <Class TextInformationFrame>
	//   24   38:dup             
	//   25   39:aload_2         
	//   26   40:aconst_null     
	//   27   41:new             #106 <Class String>
	//   28   44:dup             
	//   29   45:aload           5
	//   30   47:iconst_0        
	//   31   48:aload           5
	//   32   50:iconst_0        
	//   33   51:iload_3         
	//   34   52:invokestatic    #139 <Method int indexOfEos(byte[], int, int)>
	//   35   55:aload           4
	//   36   57:invokespecial   #111 <Method void String(byte[], int, int, String)>
	//   37   60:invokespecial   #337 <Method void TextInformationFrame(String, String, String)>
	//   38   63:areturn         
		}
	}

	private static TextInformationFrame decodeTxxxFrame(ParsableByteArray parsablebytearray, int i)
		throws UnsupportedEncodingException
	{
		if(i < 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpge          7
		{
			return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
		} else
		{
			int j = parsablebytearray.readUnsignedByte();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #87  <Method int ParsableByteArray.readUnsignedByte()>
	//    7   11:istore_2        
			String s = getCharsetName(j);
	//    8   12:iload_2         
	//    9   13:invokestatic    #91  <Method String getCharsetName(int)>
	//   10   16:astore_3        
			i--;
	//   11   17:iload_1         
	//   12   18:iconst_1        
	//   13   19:isub            
	//   14   20:istore_1        
			byte abyte0[] = new byte[i];
	//   15   21:iload_1         
	//   16   22:newarray        byte[]
	//   17   24:astore          4
			parsablebytearray.readBytes(abyte0, 0, i);
	//   18   26:aload_0         
	//   19   27:aload           4
	//   20   29:iconst_0        
	//   21   30:iload_1         
	//   22   31:invokevirtual   #95  <Method void ParsableByteArray.readBytes(byte[], int, int)>
			i = indexOfEos(abyte0, 0, j);
	//   23   34:aload           4
	//   24   36:iconst_0        
	//   25   37:iload_2         
	//   26   38:invokestatic    #139 <Method int indexOfEos(byte[], int, int)>
	//   27   41:istore_1        
			parsablebytearray = ((ParsableByteArray) (new String(abyte0, 0, i, s)));
	//   28   42:new             #106 <Class String>
	//   29   45:dup             
	//   30   46:aload           4
	//   31   48:iconst_0        
	//   32   49:iload_1         
	//   33   50:aload_3         
	//   34   51:invokespecial   #111 <Method void String(byte[], int, int, String)>
	//   35   54:astore_0        
			i += delimiterLength(j);
	//   36   55:iload_1         
	//   37   56:iload_2         
	//   38   57:invokestatic    #144 <Method int delimiterLength(int)>
	//   39   60:iadd            
	//   40   61:istore_1        
			return new TextInformationFrame("TXXX", ((String) (parsablebytearray)), decodeStringIfValid(abyte0, i, indexOfEos(abyte0, i, j), s));
	//   41   62:new             #336 <Class TextInformationFrame>
	//   42   65:dup             
	//   43   66:ldc2            #339 <String "TXXX">
	//   44   69:aload_0         
	//   45   70:aload           4
	//   46   72:iload_1         
	//   47   73:aload           4
	//   48   75:iload_1         
	//   49   76:iload_2         
	//   50   77:invokestatic    #139 <Method int indexOfEos(byte[], int, int)>
	//   51   80:aload_3         
	//   52   81:invokestatic    #222 <Method String decodeStringIfValid(byte[], int, int, String)>
	//   53   84:invokespecial   #337 <Method void TextInformationFrame(String, String, String)>
	//   54   87:areturn         
		}
	}

	private static UrlLinkFrame decodeUrlLinkFrame(ParsableByteArray parsablebytearray, int i, String s)
		throws UnsupportedEncodingException
	{
		byte abyte0[] = new byte[i];
	//    0    0:iload_1         
	//    1    1:newarray        byte[]
	//    2    3:astore_3        
		parsablebytearray.readBytes(abyte0, 0, i);
	//    3    4:aload_0         
	//    4    5:aload_3         
	//    5    6:iconst_0        
	//    6    7:iload_1         
	//    7    8:invokevirtual   #95  <Method void ParsableByteArray.readBytes(byte[], int, int)>
		return new UrlLinkFrame(s, ((String) (null)), new String(abyte0, 0, indexOfZeroByte(abyte0, 0), "ISO-8859-1"));
	//    8   11:new             #341 <Class UrlLinkFrame>
	//    9   14:dup             
	//   10   15:aload_2         
	//   11   16:aconst_null     
	//   12   17:new             #106 <Class String>
	//   13   20:dup             
	//   14   21:aload_3         
	//   15   22:iconst_0        
	//   16   23:aload_3         
	//   17   24:iconst_0        
	//   18   25:invokestatic    #131 <Method int indexOfZeroByte(byte[], int)>
	//   19   28:ldc1            #108 <String "ISO-8859-1">
	//   20   30:invokespecial   #111 <Method void String(byte[], int, int, String)>
	//   21   33:invokespecial   #342 <Method void UrlLinkFrame(String, String, String)>
	//   22   36:areturn         
	}

	private static UrlLinkFrame decodeWxxxFrame(ParsableByteArray parsablebytearray, int i)
		throws UnsupportedEncodingException
	{
		if(i < 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpge          7
		{
			return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
		} else
		{
			int j = parsablebytearray.readUnsignedByte();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #87  <Method int ParsableByteArray.readUnsignedByte()>
	//    7   11:istore_2        
			String s = getCharsetName(j);
	//    8   12:iload_2         
	//    9   13:invokestatic    #91  <Method String getCharsetName(int)>
	//   10   16:astore          4
			i--;
	//   11   18:iload_1         
	//   12   19:iconst_1        
	//   13   20:isub            
	//   14   21:istore_1        
			byte abyte0[] = new byte[i];
	//   15   22:iload_1         
	//   16   23:newarray        byte[]
	//   17   25:astore_3        
			parsablebytearray.readBytes(abyte0, 0, i);
	//   18   26:aload_0         
	//   19   27:aload_3         
	//   20   28:iconst_0        
	//   21   29:iload_1         
	//   22   30:invokevirtual   #95  <Method void ParsableByteArray.readBytes(byte[], int, int)>
			i = indexOfEos(abyte0, 0, j);
	//   23   33:aload_3         
	//   24   34:iconst_0        
	//   25   35:iload_2         
	//   26   36:invokestatic    #139 <Method int indexOfEos(byte[], int, int)>
	//   27   39:istore_1        
			parsablebytearray = ((ParsableByteArray) (new String(abyte0, 0, i, s)));
	//   28   40:new             #106 <Class String>
	//   29   43:dup             
	//   30   44:aload_3         
	//   31   45:iconst_0        
	//   32   46:iload_1         
	//   33   47:aload           4
	//   34   49:invokespecial   #111 <Method void String(byte[], int, int, String)>
	//   35   52:astore_0        
			i += delimiterLength(j);
	//   36   53:iload_1         
	//   37   54:iload_2         
	//   38   55:invokestatic    #144 <Method int delimiterLength(int)>
	//   39   58:iadd            
	//   40   59:istore_1        
			return new UrlLinkFrame("WXXX", ((String) (parsablebytearray)), decodeStringIfValid(abyte0, i, indexOfZeroByte(abyte0, i), "ISO-8859-1"));
	//   41   60:new             #341 <Class UrlLinkFrame>
	//   42   63:dup             
	//   43   64:ldc2            #344 <String "WXXX">
	//   44   67:aload_0         
	//   45   68:aload_3         
	//   46   69:iload_1         
	//   47   70:aload_3         
	//   48   71:iload_1         
	//   49   72:invokestatic    #131 <Method int indexOfZeroByte(byte[], int)>
	//   50   75:ldc1            #108 <String "ISO-8859-1">
	//   51   77:invokestatic    #222 <Method String decodeStringIfValid(byte[], int, int, String)>
	//   52   80:invokespecial   #342 <Method void UrlLinkFrame(String, String, String)>
	//   53   83:areturn         
		}
	}

	private static int delimiterLength(int i)
	{
		return i != 0 && i != 3 ? 2 : 1;
	//    0    0:iload_0         
	//    1    1:ifeq            14
	//    2    4:iload_0         
	//    3    5:iconst_3        
	//    4    6:icmpne          12
	//    5    9:goto            14
	//    6   12:iconst_2        
	//    7   13:ireturn         
	//    8   14:iconst_1        
	//    9   15:ireturn         
	}

	private static String getCharsetName(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 3: default 32
	//	               0 47
	//	               1 43
	//	               2 39
	//	               3 35
		default:
			return "ISO-8859-1";
	//    2   32:ldc1            #108 <String "ISO-8859-1">
	//    3   34:areturn         

		case 3: // '\003'
			return "UTF-8";
	//    4   35:ldc2            #346 <String "UTF-8">
	//    5   38:areturn         

		case 2: // '\002'
			return "UTF-16BE";
	//    6   39:ldc2            #348 <String "UTF-16BE">
	//    7   42:areturn         

		case 1: // '\001'
			return "UTF-16";
	//    8   43:ldc2            #350 <String "UTF-16">
	//    9   46:areturn         

		case 0: // '\0'
			return "ISO-8859-1";
	//   10   47:ldc1            #108 <String "ISO-8859-1">
	//   11   49:areturn         
		}
	}

	private static String getFrameId(int i, int j, int k, int l, int i1)
	{
		if(i == 2)
	//*   0    0:iload_0         
	//*   1    1:iconst_2        
	//*   2    2:icmpne          40
			return String.format(Locale.US, "%c%c%c", new Object[] {
				Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(l)
			});
	//    3    5:getstatic       #356 <Field Locale Locale.US>
	//    4    8:ldc2            #358 <String "%c%c%c">
	//    5   11:iconst_3        
	//    6   12:anewarray       Object[]
	//    7   15:dup             
	//    8   16:iconst_0        
	//    9   17:iload_1         
	//   10   18:invokestatic    #364 <Method Integer Integer.valueOf(int)>
	//   11   21:aastore         
	//   12   22:dup             
	//   13   23:iconst_1        
	//   14   24:iload_2         
	//   15   25:invokestatic    #364 <Method Integer Integer.valueOf(int)>
	//   16   28:aastore         
	//   17   29:dup             
	//   18   30:iconst_2        
	//   19   31:iload_3         
	//   20   32:invokestatic    #364 <Method Integer Integer.valueOf(int)>
	//   21   35:aastore         
	//   22   36:invokestatic    #368 <Method String String.format(Locale, String, Object[])>
	//   23   39:areturn         
		else
			return String.format(Locale.US, "%c%c%c%c", new Object[] {
				Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(l), Integer.valueOf(i1)
			});
	//   24   40:getstatic       #356 <Field Locale Locale.US>
	//   25   43:ldc2            #370 <String "%c%c%c%c">
	//   26   46:iconst_4        
	//   27   47:anewarray       Object[]
	//   28   50:dup             
	//   29   51:iconst_0        
	//   30   52:iload_1         
	//   31   53:invokestatic    #364 <Method Integer Integer.valueOf(int)>
	//   32   56:aastore         
	//   33   57:dup             
	//   34   58:iconst_1        
	//   35   59:iload_2         
	//   36   60:invokestatic    #364 <Method Integer Integer.valueOf(int)>
	//   37   63:aastore         
	//   38   64:dup             
	//   39   65:iconst_2        
	//   40   66:iload_3         
	//   41   67:invokestatic    #364 <Method Integer Integer.valueOf(int)>
	//   42   70:aastore         
	//   43   71:dup             
	//   44   72:iconst_3        
	//   45   73:iload           4
	//   46   75:invokestatic    #364 <Method Integer Integer.valueOf(int)>
	//   47   78:aastore         
	//   48   79:invokestatic    #368 <Method String String.format(Locale, String, Object[])>
	//   49   82:areturn         
	}

	private static int indexOfEos(byte abyte0[], int i, int j)
	{
		int k = indexOfZeroByte(abyte0, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #131 <Method int indexOfZeroByte(byte[], int)>
	//    3    5:istore_3        
		if(j != 0)
	//*   4    6:iload_2         
	//*   5    7:ifeq            57
		{
			i = k;
	//    6   10:iload_3         
	//    7   11:istore_1        
			if(j == 3)
	//*   8   12:iload_2         
	//*   9   13:iconst_3        
	//*  10   14:icmpne          19
				return k;
	//   11   17:iload_3         
	//   12   18:ireturn         
			for(; i < abyte0.length - 1; i = indexOfZeroByte(abyte0, i + 1))
	//*  13   19:iload_1         
	//*  14   20:aload_0         
	//*  15   21:arraylength     
	//*  16   22:iconst_1        
	//*  17   23:isub            
	//*  18   24:icmpge          54
				if(i % 2 == 0 && abyte0[i + 1] == 0)
	//*  19   27:iload_1         
	//*  20   28:iconst_2        
	//*  21   29:irem            
	//*  22   30:ifne            43
	//*  23   33:aload_0         
	//*  24   34:iload_1         
	//*  25   35:iconst_1        
	//*  26   36:iadd            
	//*  27   37:baload          
	//*  28   38:ifne            43
					return i;
	//   29   41:iload_1         
	//   30   42:ireturn         

	//   31   43:aload_0         
	//   32   44:iload_1         
	//   33   45:iconst_1        
	//   34   46:iadd            
	//   35   47:invokestatic    #131 <Method int indexOfZeroByte(byte[], int)>
	//   36   50:istore_1        
	//*  37   51:goto            19
			return abyte0.length;
	//   38   54:aload_0         
	//   39   55:arraylength     
	//   40   56:ireturn         
		} else
		{
			return k;
	//   41   57:iload_3         
	//   42   58:ireturn         
		}
	}

	private static int indexOfZeroByte(byte abyte0[], int i)
	{
		for(; i < abyte0.length; i++)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:arraylength     
	//*   3    3:icmpge          21
			if(abyte0[i] == 0)
	//*   4    6:aload_0         
	//*   5    7:iload_1         
	//*   6    8:baload          
	//*   7    9:ifne            14
				return i;
	//    8   12:iload_1         
	//    9   13:ireturn         

	//   10   14:iload_1         
	//   11   15:iconst_1        
	//   12   16:iadd            
	//   13   17:istore_1        
	//*  14   18:goto            0
		return abyte0.length;
	//   15   21:aload_0         
	//   16   22:arraylength     
	//   17   23:ireturn         
	}

	private static int removeUnsynchronization(ParsableByteArray parsablebytearray, int i)
	{
		byte abyte0[] = parsablebytearray.data;
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field byte[] ParsableByteArray.data>
	//    2    4:astore          5
		int k = parsablebytearray.getPosition();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #162 <Method int ParsableByteArray.getPosition()>
	//    5   10:istore_3        
		do
		{
			int l = k + 1;
	//    6   11:iload_3         
	//    7   12:iconst_1        
	//    8   13:iadd            
	//    9   14:istore          4
			if(l < i)
	//*  10   16:iload           4
	//*  11   18:iload_1         
	//*  12   19:icmpge          77
			{
				int j = i;
	//   13   22:iload_1         
	//   14   23:istore_2        
				if((abyte0[k] & 0xff) == 255)
	//*  15   24:aload           5
	//*  16   26:iload_3         
	//*  17   27:baload          
	//*  18   28:sipush          255
	//*  19   31:iand            
	//*  20   32:sipush          255
	//*  21   35:icmpne          69
				{
					j = i;
	//   22   38:iload_1         
	//   23   39:istore_2        
					if(abyte0[l] == 0)
	//*  24   40:aload           5
	//*  25   42:iload           4
	//*  26   44:baload          
	//*  27   45:ifne            69
					{
						System.arraycopy(((Object) (abyte0)), k + 2, ((Object) (abyte0)), l, i - k - 2);
	//   28   48:aload           5
	//   29   50:iload_3         
	//   30   51:iconst_2        
	//   31   52:iadd            
	//   32   53:aload           5
	//   33   55:iload           4
	//   34   57:iload_1         
	//   35   58:iload_3         
	//   36   59:isub            
	//   37   60:iconst_2        
	//   38   61:isub            
	//   39   62:invokestatic    #376 <Method void System.arraycopy(Object, int, Object, int, int)>
						j = i - 1;
	//   40   65:iload_1         
	//   41   66:iconst_1        
	//   42   67:isub            
	//   43   68:istore_2        
					}
				}
				k = l;
	//   44   69:iload           4
	//   45   71:istore_3        
				i = j;
	//   46   72:iload_2         
	//   47   73:istore_1        
			} else
	//*  48   74:goto            11
			{
				return i;
	//   49   77:iload_1         
	//   50   78:ireturn         
			}
		} while(true);
	}

	private static boolean validateFrames(ParsableByteArray parsablebytearray, int i, int j, boolean flag)
	{
		int k1 = parsablebytearray.getPosition();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #162 <Method int ParsableByteArray.getPosition()>
	//    2    4:istore          8
_L8:
		int k = parsablebytearray.bytesLeft();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #315 <Method int ParsableByteArray.bytesLeft()>
	//    5   10:istore          4
		boolean flag1;
		flag1 = true;
	//    6   12:iconst_1        
	//    7   13:istore          7
		if(k < j)
			break; /* Loop/switch isn't completed */
	//    8   15:iload           4
	//    9   17:iload_2         
	//   10   18:icmplt          352
		if(i < 3)
			break MISSING_BLOCK_LABEL_47;
	//   11   21:iload_1         
	//   12   22:iconst_3        
	//   13   23:icmplt          47
		int i1;
		long l1;
		k = parsablebytearray.readInt();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #173 <Method int ParsableByteArray.readInt()>
	//   16   30:istore          4
		l1 = parsablebytearray.readUnsignedInt();
	//   17   32:aload_0         
	//   18   33:invokevirtual   #177 <Method long ParsableByteArray.readUnsignedInt()>
	//   19   36:lstore          9
		i1 = parsablebytearray.readUnsignedShort();
	//   20   38:aload_0         
	//   21   39:invokevirtual   #234 <Method int ParsableByteArray.readUnsignedShort()>
	//   22   42:istore          6
		break MISSING_BLOCK_LABEL_67;
	//   23   44:goto            67
		int l;
		k = parsablebytearray.readUnsignedInt24();
	//   24   47:aload_0         
	//   25   48:invokevirtual   #231 <Method int ParsableByteArray.readUnsignedInt24()>
	//   26   51:istore          4
		l = parsablebytearray.readUnsignedInt24();
	//   27   53:aload_0         
	//   28   54:invokevirtual   #231 <Method int ParsableByteArray.readUnsignedInt24()>
	//   29   57:istore          5
		l1 = l;
	//   30   59:iload           5
	//   31   61:i2l             
	//   32   62:lstore          9
		i1 = 0;
	//   33   64:iconst_0        
	//   34   65:istore          6
		if(k == 0 && l1 == 0L && i1 == 0)
	//*  35   67:iload           4
	//*  36   69:ifne            92
	//*  37   72:lload           9
	//*  38   74:lconst_0        
	//*  39   75:lcmp            
	//*  40   76:ifne            92
	//*  41   79:iload           6
	//*  42   81:ifne            92
		{
			parsablebytearray.setPosition(k1);
	//   43   84:aload_0         
	//   44   85:iload           8
	//   45   87:invokevirtual   #170 <Method void ParsableByteArray.setPosition(int)>
			return true;
	//   46   90:iconst_1        
	//   47   91:ireturn         
		}
		if(i == 4 && !flag)
	//*  48   92:iload_1         
	//*  49   93:iconst_4        
	//*  50   94:icmpne          170
	//*  51   97:iload_3         
	//*  52   98:ifne            170
		{
			if((l1 & 0x808080L) != 0L)
	//*  53  101:lload           9
	//*  54  103:ldc2w           #379 <Long 0x808080L>
	//*  55  106:land            
	//*  56  107:lconst_0        
	//*  57  108:lcmp            
	//*  58  109:ifeq            120
			{
				parsablebytearray.setPosition(k1);
	//   59  112:aload_0         
	//   60  113:iload           8
	//   61  115:invokevirtual   #170 <Method void ParsableByteArray.setPosition(int)>
				return false;
	//   62  118:iconst_0        
	//   63  119:ireturn         
			}
			l1 = l1 & 255L | (l1 >> 8 & 255L) << 7 | (l1 >> 16 & 255L) << 14 | (l1 >> 24 & 255L) << 21;
	//   64  120:lload           9
	//   65  122:ldc2w           #381 <Long 255L>
	//   66  125:land            
	//   67  126:lload           9
	//   68  128:bipush          8
	//   69  130:lshr            
	//   70  131:ldc2w           #381 <Long 255L>
	//   71  134:land            
	//   72  135:bipush          7
	//   73  137:lshl            
	//   74  138:lor             
	//   75  139:lload           9
	//   76  141:bipush          16
	//   77  143:lshr            
	//   78  144:ldc2w           #381 <Long 255L>
	//   79  147:land            
	//   80  148:bipush          14
	//   81  150:lshl            
	//   82  151:lor             
	//   83  152:lload           9
	//   84  154:bipush          24
	//   85  156:lshr            
	//   86  157:ldc2w           #381 <Long 255L>
	//   87  160:land            
	//   88  161:bipush          21
	//   89  163:lshl            
	//   90  164:lor             
	//   91  165:lstore          9
		}
	//*  92  167:goto            170
		if(i != 4) goto _L2; else goto _L1
	//   93  170:iload_1         
	//   94  171:iconst_4        
	//   95  172:icmpne          223
_L1:
		if((i1 & 0x40) != 0)
	//*  96  175:iload           6
	//*  97  177:bipush          64
	//*  98  179:iand            
	//*  99  180:ifeq            189
			k = 1;
	//  100  183:iconst_1        
	//  101  184:istore          4
		else
	//* 102  186:goto            192
			k = 0;
	//  103  189:iconst_0        
	//  104  190:istore          4
		l = k;
	//  105  192:iload           4
	//  106  194:istore          5
		if((i1 & 1) == 0) goto _L4; else goto _L3
	//  107  196:iload           6
	//  108  198:iconst_1        
	//  109  199:iand            
	//  110  200:ifeq            217
_L3:
		i1 = 1;
	//  111  203:iconst_1        
	//  112  204:istore          6
		l = k;
	//  113  206:iload           4
	//  114  208:istore          5
		k = i1;
	//  115  210:iload           6
	//  116  212:istore          4
		break MISSING_BLOCK_LABEL_268;
	//  117  214:goto            268
_L4:
		k = 0;
	//  118  217:iconst_0        
	//  119  218:istore          4
		break MISSING_BLOCK_LABEL_268;
	//  120  220:goto            268
_L2:
		if(i != 3) goto _L6; else goto _L5
	//  121  223:iload_1         
	//  122  224:iconst_3        
	//  123  225:icmpne          261
_L5:
		if((i1 & 0x20) != 0)
	//* 124  228:iload           6
	//* 125  230:bipush          32
	//* 126  232:iand            
	//* 127  233:ifeq            242
			k = 1;
	//  128  236:iconst_1        
	//  129  237:istore          4
		else
	//* 130  239:goto            245
			k = 0;
	//  131  242:iconst_0        
	//  132  243:istore          4
		l = k;
	//  133  245:iload           4
	//  134  247:istore          5
		if((i1 & 0x80) == 0) goto _L4; else goto _L3
	//  135  249:iload           6
	//  136  251:sipush          128
	//  137  254:iand            
	//  138  255:ifeq            217
	//* 139  258:goto            203
_L6:
		l = 0;
	//  140  261:iconst_0        
	//  141  262:istore          5
		k = l;
	//  142  264:iload           5
	//  143  266:istore          4
		if(l != 0)
	//* 144  268:iload           5
	//* 145  270:ifeq            280
			l = ((int) (flag1));
	//  146  273:iload           7
	//  147  275:istore          5
		else
	//* 148  277:goto            283
			l = 0;
	//  149  280:iconst_0        
	//  150  281:istore          5
		int j1 = l;
	//  151  283:iload           5
	//  152  285:istore          6
		if(k != 0)
	//* 153  287:iload           4
	//* 154  289:ifeq            298
			j1 = l + 4;
	//  155  292:iload           5
	//  156  294:iconst_4        
	//  157  295:iadd            
	//  158  296:istore          6
		if(l1 < (long)j1)
	//* 159  298:lload           9
	//* 160  300:iload           6
	//* 161  302:i2l             
	//* 162  303:lcmp            
	//* 163  304:ifge            315
		{
			parsablebytearray.setPosition(k1);
	//  164  307:aload_0         
	//  165  308:iload           8
	//  166  310:invokevirtual   #170 <Method void ParsableByteArray.setPosition(int)>
			return false;
	//  167  313:iconst_0        
	//  168  314:ireturn         
		}
		k = parsablebytearray.bytesLeft();
	//  169  315:aload_0         
	//  170  316:invokevirtual   #315 <Method int ParsableByteArray.bytesLeft()>
	//  171  319:istore          4
		if((long)k < l1)
	//* 172  321:iload           4
	//* 173  323:i2l             
	//* 174  324:lload           9
	//* 175  326:lcmp            
	//* 176  327:ifge            338
		{
			parsablebytearray.setPosition(k1);
	//  177  330:aload_0         
	//  178  331:iload           8
	//  179  333:invokevirtual   #170 <Method void ParsableByteArray.setPosition(int)>
			return false;
	//  180  336:iconst_0        
	//  181  337:ireturn         
		}
		k = (int)l1;
	//  182  338:lload           9
	//  183  340:l2i             
	//  184  341:istore          4
		parsablebytearray.skipBytes(k);
	//  185  343:aload_0         
	//  186  344:iload           4
	//  187  346:invokevirtual   #252 <Method void ParsableByteArray.skipBytes(int)>
		if(true) goto _L8; else goto _L7
	//  188  349:goto            6
_L7:
		parsablebytearray.setPosition(k1);
	//  189  352:aload_0         
	//  190  353:iload           8
	//  191  355:invokevirtual   #170 <Method void ParsableByteArray.setPosition(int)>
		return true;
	//  192  358:iconst_1        
	//  193  359:ireturn         
		Exception exception;
		exception;
	//  194  360:astore          11
		parsablebytearray.setPosition(k1);
	//  195  362:aload_0         
	//  196  363:iload           8
	//  197  365:invokevirtual   #170 <Method void ParsableByteArray.setPosition(int)>
		throw exception;
	//  198  368:aload           11
	//  199  370:athrow          
	}

	public Metadata decode(MetadataInputBuffer metadatainputbuffer)
	{
		metadatainputbuffer = ((MetadataInputBuffer) (metadatainputbuffer.data));
	//    0    0:aload_1         
	//    1    1:getfield        #389 <Field ByteBuffer MetadataInputBuffer.data>
	//    2    4:astore_1        
		return decode(((ByteBuffer) (metadatainputbuffer)).array(), ((ByteBuffer) (metadatainputbuffer)).limit());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #395 <Method byte[] ByteBuffer.array()>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #396 <Method int ByteBuffer.limit()>
	//    8   14:invokevirtual   #399 <Method Metadata decode(byte[], int)>
	//    9   17:areturn         
	}

	public Metadata decode(byte abyte0[], int i)
	{
		Object obj = ((Object) (new ArrayList()));
	//    0    0:new             #183 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #184 <Method void ArrayList()>
	//    3    7:astore          6
		ParsableByteArray parsablebytearray = new ParsableByteArray(abyte0, i);
	//    4    9:new             #83  <Class ParsableByteArray>
	//    5   12:dup             
	//    6   13:aload_1         
	//    7   14:iload_2         
	//    8   15:invokespecial   #402 <Method void ParsableByteArray(byte[], int)>
	//    9   18:astore          7
		abyte0 = ((byte []) (decodeHeader(parsablebytearray)));
	//   10   20:aload           7
	//   11   22:invokestatic    #404 <Method Id3Decoder$Id3Header decodeHeader(ParsableByteArray)>
	//   12   25:astore_1        
		if(abyte0 == null)
	//*  13   26:aload_1         
	//*  14   27:ifnonnull       32
			return null;
	//   15   30:aconst_null     
	//   16   31:areturn         
		int k = parsablebytearray.getPosition();
	//   17   32:aload           7
	//   18   34:invokevirtual   #162 <Method int ParsableByteArray.getPosition()>
	//   19   37:istore          4
		if(((Id3Header) (abyte0)).majorVersion == 2)
	//*  20   39:aload_1         
	//*  21   40:invokestatic    #408 <Method int Id3Decoder$Id3Header.access$000(Id3Decoder$Id3Header)>
	//*  22   43:iconst_2        
	//*  23   44:icmpne          53
			i = 6;
	//   24   47:bipush          6
	//   25   49:istore_2        
		else
	//*  26   50:goto            56
			i = 10;
	//   27   53:bipush          10
	//   28   55:istore_2        
		int j = ((Id3Header) (abyte0)).framesSize;
	//   29   56:aload_1         
	//   30   57:invokestatic    #411 <Method int Id3Decoder$Id3Header.access$100(Id3Decoder$Id3Header)>
	//   31   60:istore_3        
		if(((Id3Header) (abyte0)).isUnsynchronized)
	//*  32   61:aload_1         
	//*  33   62:invokestatic    #415 <Method boolean Id3Decoder$Id3Header.access$200(Id3Decoder$Id3Header)>
	//*  34   65:ifeq            78
			j = removeUnsynchronization(parsablebytearray, ((Id3Header) (abyte0)).framesSize);
	//   35   68:aload           7
	//   36   70:aload_1         
	//   37   71:invokestatic    #411 <Method int Id3Decoder$Id3Header.access$100(Id3Decoder$Id3Header)>
	//   38   74:invokestatic    #256 <Method int removeUnsynchronization(ParsableByteArray, int)>
	//   39   77:istore_3        
		parsablebytearray.setLimit(k + j);
	//   40   78:aload           7
	//   41   80:iload           4
	//   42   82:iload_3         
	//   43   83:iadd            
	//   44   84:invokevirtual   #418 <Method void ParsableByteArray.setLimit(int)>
		j = ((Id3Header) (abyte0)).majorVersion;
	//   45   87:aload_1         
	//   46   88:invokestatic    #408 <Method int Id3Decoder$Id3Header.access$000(Id3Decoder$Id3Header)>
	//   47   91:istore_3        
		boolean flag = false;
	//   48   92:iconst_0        
	//   49   93:istore          5
		if(!validateFrames(parsablebytearray, j, i, false))
	//*  50   95:aload           7
	//*  51   97:iload_3         
	//*  52   98:iload_2         
	//*  53   99:iconst_0        
	//*  54  100:invokestatic    #420 <Method boolean validateFrames(ParsableByteArray, int, int, boolean)>
	//*  55  103:ifne            172
			if(((Id3Header) (abyte0)).majorVersion == 4 && validateFrames(parsablebytearray, 4, i, true))
	//*  56  106:aload_1         
	//*  57  107:invokestatic    #408 <Method int Id3Decoder$Id3Header.access$000(Id3Decoder$Id3Header)>
	//*  58  110:iconst_4        
	//*  59  111:icmpne          131
	//*  60  114:aload           7
	//*  61  116:iconst_4        
	//*  62  117:iload_2         
	//*  63  118:iconst_1        
	//*  64  119:invokestatic    #420 <Method boolean validateFrames(ParsableByteArray, int, int, boolean)>
	//*  65  122:ifeq            131
			{
				flag = true;
	//   66  125:iconst_1        
	//   67  126:istore          5
			} else
	//*  68  128:goto            172
			{
				obj = ((Object) (new StringBuilder()));
	//   69  131:new             #97  <Class StringBuilder>
	//   70  134:dup             
	//   71  135:invokespecial   #98  <Method void StringBuilder()>
	//   72  138:astore          6
				((StringBuilder) (obj)).append("Failed to validate ID3 tag with majorVersion=");
	//   73  140:aload           6
	//   74  142:ldc2            #422 <String "Failed to validate ID3 tag with majorVersion=">
	//   75  145:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   76  148:pop             
				((StringBuilder) (obj)).append(((Id3Header) (abyte0)).majorVersion);
	//   77  149:aload           6
	//   78  151:aload_1         
	//   79  152:invokestatic    #408 <Method int Id3Decoder$Id3Header.access$000(Id3Decoder$Id3Header)>
	//   80  155:invokevirtual   #301 <Method StringBuilder StringBuilder.append(int)>
	//   81  158:pop             
				Log.w("Id3Decoder", ((StringBuilder) (obj)).toString());
	//   82  159:ldc1            #45  <String "Id3Decoder">
	//   83  161:aload           6
	//   84  163:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   85  166:invokestatic    #245 <Method int Log.w(String, String)>
	//   86  169:pop             
				return null;
	//   87  170:aconst_null     
	//   88  171:areturn         
			}
		do
		{
			if(parsablebytearray.bytesLeft() < i)
				break;
	//   89  172:aload           7
	//   90  174:invokevirtual   #315 <Method int ParsableByteArray.bytesLeft()>
	//   91  177:iload_2         
	//   92  178:icmplt          217
			Id3Frame id3frame = decodeFrame(((Id3Header) (abyte0)).majorVersion, parsablebytearray, flag, i, framePredicate);
	//   93  181:aload_1         
	//   94  182:invokestatic    #408 <Method int Id3Decoder$Id3Header.access$000(Id3Decoder$Id3Header)>
	//   95  185:aload           7
	//   96  187:iload           5
	//   97  189:iload_2         
	//   98  190:aload_0         
	//   99  191:getfield        #70  <Field Id3Decoder$FramePredicate framePredicate>
	//  100  194:invokestatic    #188 <Method Id3Frame decodeFrame(int, ParsableByteArray, boolean, int, Id3Decoder$FramePredicate)>
	//  101  197:astore          8
			if(id3frame != null)
	//* 102  199:aload           8
	//* 103  201:ifnull          172
				((List) (obj)).add(((Object) (id3frame)));
	//  104  204:aload           6
	//  105  206:aload           8
	//  106  208:invokeinterface #425 <Method boolean List.add(Object)>
	//  107  213:pop             
		} while(true);
	//  108  214:goto            172
		return new Metadata(((List) (obj)));
	//  109  217:new             #427 <Class Metadata>
	//  110  220:dup             
	//  111  221:aload           6
	//  112  223:invokespecial   #430 <Method void Metadata(List)>
	//  113  226:areturn         
	}

	private static final int FRAME_FLAG_V3_HAS_GROUP_IDENTIFIER = 32;
	private static final int FRAME_FLAG_V3_IS_COMPRESSED = 128;
	private static final int FRAME_FLAG_V3_IS_ENCRYPTED = 64;
	private static final int FRAME_FLAG_V4_HAS_DATA_LENGTH = 1;
	private static final int FRAME_FLAG_V4_HAS_GROUP_IDENTIFIER = 64;
	private static final int FRAME_FLAG_V4_IS_COMPRESSED = 8;
	private static final int FRAME_FLAG_V4_IS_ENCRYPTED = 4;
	private static final int FRAME_FLAG_V4_IS_UNSYNCHRONIZED = 2;
	public static final int ID3_HEADER_LENGTH = 10;
	public static final int ID3_TAG = Util.getIntegerCodeForString("ID3");
	private static final int ID3_TEXT_ENCODING_ISO_8859_1 = 0;
	private static final int ID3_TEXT_ENCODING_UTF_16 = 1;
	private static final int ID3_TEXT_ENCODING_UTF_16BE = 2;
	private static final int ID3_TEXT_ENCODING_UTF_8 = 3;
	public static final FramePredicate NO_FRAMES_PREDICATE = new FramePredicate() {

		public boolean evaluate(int i, int j, int k, int l, int i1)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

	}
;
	private static final String TAG = "Id3Decoder";
	private final FramePredicate framePredicate;

	static 
	{
	//    0    0:new             #8   <Class Id3Decoder$1>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void Id3Decoder$1()>
	//    3    7:putstatic       #53  <Field Id3Decoder$FramePredicate NO_FRAMES_PREDICATE>
	//    4   10:ldc1            #55  <String "ID3">
	//    5   12:invokestatic    #61  <Method int Util.getIntegerCodeForString(String)>
	//    6   15:putstatic       #63  <Field int ID3_TAG>
	//*   7   18:return          
	}
}
