// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.tx3g;

import android.text.SpannableStringBuilder;
import android.text.style.*;
import com.google.android.exoplayer2.text.*;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.nio.charset.Charset;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.text.tx3g:
//			Tx3gSubtitle

public final class Tx3gDecoder extends SimpleSubtitleDecoder
{

	public Tx3gDecoder(List list)
	{
		super("Tx3gDecoder");
	//    0    0:aload_0         
	//    1    1:ldc1            #71  <String "Tx3gDecoder">
	//    2    3:invokespecial   #74  <Method void SimpleSubtitleDecoder(String)>
	//    3    6:aload_0         
	//    4    7:new             #76  <Class ParsableByteArray>
	//    5   10:dup             
	//    6   11:invokespecial   #78  <Method void ParsableByteArray()>
	//    7   14:putfield        #80  <Field ParsableByteArray parsableByteArray>
		decodeInitializationData(list);
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:invokespecial   #83  <Method void decodeInitializationData(List)>
	//   11   22:return          
	}

	private void applyStyleRecord(ParsableByteArray parsablebytearray, SpannableStringBuilder spannablestringbuilder)
		throws SubtitleDecoderException
	{
		boolean flag;
		if(parsablebytearray.bytesLeft() >= 12)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #93  <Method int ParsableByteArray.bytesLeft()>
	//*   2    4:bipush          12
	//*   3    6:icmplt          15
			flag = true;
	//    4    9:iconst_1        
	//    5   10:istore          7
		else
	//*   6   12:goto            18
			flag = false;
	//    7   15:iconst_0        
	//    8   16:istore          7
		assertTrue(flag);
	//    9   18:iload           7
	//   10   20:invokestatic    #97  <Method void assertTrue(boolean)>
		int i = parsablebytearray.readUnsignedShort();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #100 <Method int ParsableByteArray.readUnsignedShort()>
	//   13   27:istore_3        
		int j = parsablebytearray.readUnsignedShort();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #100 <Method int ParsableByteArray.readUnsignedShort()>
	//   16   32:istore          4
		parsablebytearray.skipBytes(2);
	//   17   34:aload_1         
	//   18   35:iconst_2        
	//   19   36:invokevirtual   #104 <Method void ParsableByteArray.skipBytes(int)>
		int k = parsablebytearray.readUnsignedByte();
	//   20   39:aload_1         
	//   21   40:invokevirtual   #107 <Method int ParsableByteArray.readUnsignedByte()>
	//   22   43:istore          5
		parsablebytearray.skipBytes(1);
	//   23   45:aload_1         
	//   24   46:iconst_1        
	//   25   47:invokevirtual   #104 <Method void ParsableByteArray.skipBytes(int)>
		int l = parsablebytearray.readInt();
	//   26   50:aload_1         
	//   27   51:invokevirtual   #110 <Method int ParsableByteArray.readInt()>
	//   28   54:istore          6
		attachFontFace(spannablestringbuilder, k, defaultFontFace, i, j, 0);
	//   29   56:aload_2         
	//   30   57:iload           5
	//   31   59:aload_0         
	//   32   60:getfield        #112 <Field int defaultFontFace>
	//   33   63:iload_3         
	//   34   64:iload           4
	//   35   66:iconst_0        
	//   36   67:invokestatic    #116 <Method void attachFontFace(SpannableStringBuilder, int, int, int, int, int)>
		attachColor(spannablestringbuilder, l, defaultColorRgba, i, j, 0);
	//   37   70:aload_2         
	//   38   71:iload           6
	//   39   73:aload_0         
	//   40   74:getfield        #118 <Field int defaultColorRgba>
	//   41   77:iload_3         
	//   42   78:iload           4
	//   43   80:iconst_0        
	//   44   81:invokestatic    #121 <Method void attachColor(SpannableStringBuilder, int, int, int, int, int)>
	//   45   84:return          
	}

	private static void assertTrue(boolean flag)
		throws SubtitleDecoderException
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            14
			throw new SubtitleDecoderException("Unexpected subtitle format.");
	//    2    4:new             #89  <Class SubtitleDecoderException>
	//    3    7:dup             
	//    4    8:ldc1            #124 <String "Unexpected subtitle format.">
	//    5   10:invokespecial   #125 <Method void SubtitleDecoderException(String)>
	//    6   13:athrow          
		else
			return;
	//    7   14:return          
	}

	private static void attachColor(SpannableStringBuilder spannablestringbuilder, int i, int j, int k, int l, int i1)
	{
		if(i != j)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpeq          37
			spannablestringbuilder.setSpan(((Object) (new ForegroundColorSpan(i >>> 8 | (i & 0xff) << 24))), k, l, 0x21 | i1);
	//    3    5:aload_0         
	//    4    6:new             #127 <Class ForegroundColorSpan>
	//    5    9:dup             
	//    6   10:iload_1         
	//    7   11:bipush          8
	//    8   13:iushr           
	//    9   14:iload_1         
	//   10   15:sipush          255
	//   11   18:iand            
	//   12   19:bipush          24
	//   13   21:ishl            
	//   14   22:ior             
	//   15   23:invokespecial   #129 <Method void ForegroundColorSpan(int)>
	//   16   26:iload_3         
	//   17   27:iload           4
	//   18   29:bipush          33
	//   19   31:iload           5
	//   20   33:ior             
	//   21   34:invokevirtual   #135 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
	//   22   37:return          
	}

	private static void attachFontFace(SpannableStringBuilder spannablestringbuilder, int i, int j, int k, int l, int i1)
	{
		if(i != j)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpeq          178
		{
			int j1 = 0x21 | i1;
	//    3    5:bipush          33
	//    4    7:iload           5
	//    5    9:ior             
	//    6   10:istore          7
			boolean flag = true;
	//    7   12:iconst_1        
	//    8   13:istore          6
			if((i & 1) != 0)
	//*   9   15:iload_1         
	//*  10   16:iconst_1        
	//*  11   17:iand            
	//*  12   18:ifeq            26
				j = 1;
	//   13   21:iconst_1        
	//   14   22:istore_2        
			else
	//*  15   23:goto            28
				j = 0;
	//   16   26:iconst_0        
	//   17   27:istore_2        
			if((i & 2) != 0)
	//*  18   28:iload_1         
	//*  19   29:iconst_2        
	//*  20   30:iand            
	//*  21   31:ifeq            40
				i1 = 1;
	//   22   34:iconst_1        
	//   23   35:istore          5
			else
	//*  24   37:goto            43
				i1 = 0;
	//   25   40:iconst_0        
	//   26   41:istore          5
			if(j != 0)
	//*  27   43:iload_2         
	//*  28   44:ifeq            92
			{
				if(i1 != 0)
	//*  29   47:iload           5
	//*  30   49:ifeq            72
					spannablestringbuilder.setSpan(((Object) (new StyleSpan(3))), k, l, j1);
	//   31   52:aload_0         
	//   32   53:new             #137 <Class StyleSpan>
	//   33   56:dup             
	//   34   57:iconst_3        
	//   35   58:invokespecial   #138 <Method void StyleSpan(int)>
	//   36   61:iload_3         
	//   37   62:iload           4
	//   38   64:iload           7
	//   39   66:invokevirtual   #135 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
				else
	//*  40   69:goto            114
					spannablestringbuilder.setSpan(((Object) (new StyleSpan(1))), k, l, j1);
	//   41   72:aload_0         
	//   42   73:new             #137 <Class StyleSpan>
	//   43   76:dup             
	//   44   77:iconst_1        
	//   45   78:invokespecial   #138 <Method void StyleSpan(int)>
	//   46   81:iload_3         
	//   47   82:iload           4
	//   48   84:iload           7
	//   49   86:invokevirtual   #135 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
			} else
	//*  50   89:goto            114
			if(i1 != 0)
	//*  51   92:iload           5
	//*  52   94:ifeq            114
				spannablestringbuilder.setSpan(((Object) (new StyleSpan(2))), k, l, j1);
	//   53   97:aload_0         
	//   54   98:new             #137 <Class StyleSpan>
	//   55  101:dup             
	//   56  102:iconst_2        
	//   57  103:invokespecial   #138 <Method void StyleSpan(int)>
	//   58  106:iload_3         
	//   59  107:iload           4
	//   60  109:iload           7
	//   61  111:invokevirtual   #135 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
			if((i & 4) != 0)
	//*  62  114:iload_1         
	//*  63  115:iconst_4        
	//*  64  116:iand            
	//*  65  117:ifeq            126
				i = ((int) (flag));
	//   66  120:iload           6
	//   67  122:istore_1        
			else
	//*  68  123:goto            128
				i = 0;
	//   69  126:iconst_0        
	//   70  127:istore_1        
			if(i != 0)
	//*  71  128:iload_1         
	//*  72  129:ifeq            148
				spannablestringbuilder.setSpan(((Object) (new UnderlineSpan())), k, l, j1);
	//   73  132:aload_0         
	//   74  133:new             #140 <Class UnderlineSpan>
	//   75  136:dup             
	//   76  137:invokespecial   #141 <Method void UnderlineSpan()>
	//   77  140:iload_3         
	//   78  141:iload           4
	//   79  143:iload           7
	//   80  145:invokevirtual   #135 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
			if(i == 0 && j == 0 && i1 == 0)
	//*  81  148:iload_1         
	//*  82  149:ifne            178
	//*  83  152:iload_2         
	//*  84  153:ifne            178
	//*  85  156:iload           5
	//*  86  158:ifne            178
				spannablestringbuilder.setSpan(((Object) (new StyleSpan(0))), k, l, j1);
	//   87  161:aload_0         
	//   88  162:new             #137 <Class StyleSpan>
	//   89  165:dup             
	//   90  166:iconst_0        
	//   91  167:invokespecial   #138 <Method void StyleSpan(int)>
	//   92  170:iload_3         
	//   93  171:iload           4
	//   94  173:iload           7
	//   95  175:invokevirtual   #135 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		}
	//   96  178:return          
	}

	private static void attachFontFamily(SpannableStringBuilder spannablestringbuilder, String s, String s1, int i, int j, int k)
	{
		if(s != s1)
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:if_acmpeq       25
			spannablestringbuilder.setSpan(((Object) (new TypefaceSpan(s))), i, j, 0x21 | k);
	//    3    5:aload_0         
	//    4    6:new             #145 <Class TypefaceSpan>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokespecial   #146 <Method void TypefaceSpan(String)>
	//    8   14:iload_3         
	//    9   15:iload           4
	//   10   17:bipush          33
	//   11   19:iload           5
	//   12   21:ior             
	//   13   22:invokevirtual   #135 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
	//   14   25:return          
	}

	private void decodeInitializationData(List list)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(list != null && list.size() == 1 && (((byte[])list.get(0)).length == 48 || ((byte[])list.get(0)).length == 53))
	//*   2    2:aload_1         
	//*   3    3:ifnull          249
	//*   4    6:aload_1         
	//*   5    7:invokeinterface #151 <Method int List.size()>
	//*   6   12:iconst_1        
	//*   7   13:icmpne          249
	//*   8   16:aload_1         
	//*   9   17:iconst_0        
	//*  10   18:invokeinterface #155 <Method Object List.get(int)>
	//*  11   23:checkcast       #157 <Class byte[]>
	//*  12   26:arraylength     
	//*  13   27:bipush          48
	//*  14   29:icmpeq          48
	//*  15   32:aload_1         
	//*  16   33:iconst_0        
	//*  17   34:invokeinterface #155 <Method Object List.get(int)>
	//*  18   39:checkcast       #157 <Class byte[]>
	//*  19   42:arraylength     
	//*  20   43:bipush          53
	//*  21   45:icmpne          249
		{
			byte abyte0[] = (byte[])list.get(0);
	//   22   48:aload_1         
	//   23   49:iconst_0        
	//   24   50:invokeinterface #155 <Method Object List.get(int)>
	//   25   55:checkcast       #157 <Class byte[]>
	//   26   58:astore          4
			defaultFontFace = ((int) (abyte0[24]));
	//   27   60:aload_0         
	//   28   61:aload           4
	//   29   63:bipush          24
	//   30   65:baload          
	//   31   66:putfield        #112 <Field int defaultFontFace>
			defaultColorRgba = (abyte0[26] & 0xff) << 24 | (abyte0[27] & 0xff) << 16 | (abyte0[28] & 0xff) << 8 | abyte0[29] & 0xff;
	//   32   69:aload_0         
	//   33   70:aload           4
	//   34   72:bipush          26
	//   35   74:baload          
	//   36   75:sipush          255
	//   37   78:iand            
	//   38   79:bipush          24
	//   39   81:ishl            
	//   40   82:aload           4
	//   41   84:bipush          27
	//   42   86:baload          
	//   43   87:sipush          255
	//   44   90:iand            
	//   45   91:bipush          16
	//   46   93:ishl            
	//   47   94:ior             
	//   48   95:aload           4
	//   49   97:bipush          28
	//   50   99:baload          
	//   51  100:sipush          255
	//   52  103:iand            
	//   53  104:bipush          8
	//   54  106:ishl            
	//   55  107:ior             
	//   56  108:aload           4
	//   57  110:bipush          29
	//   58  112:baload          
	//   59  113:sipush          255
	//   60  116:iand            
	//   61  117:ior             
	//   62  118:putfield        #118 <Field int defaultColorRgba>
			if("Serif".equals(((Object) (Util.fromUtf8Bytes(abyte0, 43, abyte0.length - 43)))))
	//*  63  121:ldc1            #39  <String "Serif">
	//*  64  123:aload           4
	//*  65  125:bipush          43
	//*  66  127:aload           4
	//*  67  129:arraylength     
	//*  68  130:bipush          43
	//*  69  132:isub            
	//*  70  133:invokestatic    #161 <Method String Util.fromUtf8Bytes(byte[], int, int)>
	//*  71  136:invokevirtual   #167 <Method boolean String.equals(Object)>
	//*  72  139:ifeq            148
				list = "serif";
	//   73  142:ldc1            #169 <String "serif">
	//   74  144:astore_1        
			else
	//*  75  145:goto            151
				list = "sans-serif";
	//   76  148:ldc1            #18  <String "sans-serif">
	//   77  150:astore_1        
			defaultFontFamily = ((String) (list));
	//   78  151:aload_0         
	//   79  152:aload_1         
	//   80  153:putfield        #171 <Field String defaultFontFamily>
			calculatedVideoTrackHeight = 20 * abyte0[25];
	//   81  156:aload_0         
	//   82  157:bipush          20
	//   83  159:aload           4
	//   84  161:bipush          25
	//   85  163:baload          
	//   86  164:imul            
	//   87  165:putfield        #173 <Field int calculatedVideoTrackHeight>
			if((abyte0[0] & 0x20) != 0)
	//*  88  168:aload           4
	//*  89  170:iconst_0        
	//*  90  171:baload          
	//*  91  172:bipush          32
	//*  92  174:iand            
	//*  93  175:ifeq            180
				flag = true;
	//   94  178:iconst_1        
	//   95  179:istore_3        
			customVerticalPlacement = flag;
	//   96  180:aload_0         
	//   97  181:iload_3         
	//   98  182:putfield        #175 <Field boolean customVerticalPlacement>
			if(customVerticalPlacement)
	//*  99  185:aload_0         
	//* 100  186:getfield        #175 <Field boolean customVerticalPlacement>
	//* 101  189:ifeq            242
			{
				byte byte0 = abyte0[10];
	//  102  192:aload           4
	//  103  194:bipush          10
	//  104  196:baload          
	//  105  197:istore_2        
				defaultVerticalPlacement = (float)(abyte0[11] & 0xff | (byte0 & 0xff) << 8) / (float)calculatedVideoTrackHeight;
	//  106  198:aload_0         
	//  107  199:aload           4
	//  108  201:bipush          11
	//  109  203:baload          
	//  110  204:sipush          255
	//  111  207:iand            
	//  112  208:iload_2         
	//  113  209:sipush          255
	//  114  212:iand            
	//  115  213:bipush          8
	//  116  215:ishl            
	//  117  216:ior             
	//  118  217:i2f             
	//  119  218:aload_0         
	//  120  219:getfield        #173 <Field int calculatedVideoTrackHeight>
	//  121  222:i2f             
	//  122  223:fdiv            
	//  123  224:putfield        #177 <Field float defaultVerticalPlacement>
				defaultVerticalPlacement = Util.constrainValue(defaultVerticalPlacement, 0.0F, 0.95F);
	//  124  227:aload_0         
	//  125  228:aload_0         
	//  126  229:getfield        #177 <Field float defaultVerticalPlacement>
	//  127  232:fconst_0        
	//  128  233:ldc1            #178 <Float 0.95F>
	//  129  235:invokestatic    #182 <Method float Util.constrainValue(float, float, float)>
	//  130  238:putfield        #177 <Field float defaultVerticalPlacement>
				return;
	//  131  241:return          
			} else
			{
				defaultVerticalPlacement = 0.85F;
	//  132  242:aload_0         
	//  133  243:ldc1            #21  <Float 0.85F>
	//  134  245:putfield        #177 <Field float defaultVerticalPlacement>
				return;
	//  135  248:return          
			}
		} else
		{
			defaultFontFace = 0;
	//  136  249:aload_0         
	//  137  250:iconst_0        
	//  138  251:putfield        #112 <Field int defaultFontFace>
			defaultColorRgba = -1;
	//  139  254:aload_0         
	//  140  255:iconst_m1       
	//  141  256:putfield        #118 <Field int defaultColorRgba>
			defaultFontFamily = "sans-serif";
	//  142  259:aload_0         
	//  143  260:ldc1            #18  <String "sans-serif">
	//  144  262:putfield        #171 <Field String defaultFontFamily>
			customVerticalPlacement = false;
	//  145  265:aload_0         
	//  146  266:iconst_0        
	//  147  267:putfield        #175 <Field boolean customVerticalPlacement>
			defaultVerticalPlacement = 0.85F;
	//  148  270:aload_0         
	//  149  271:ldc1            #21  <Float 0.85F>
	//  150  273:putfield        #177 <Field float defaultVerticalPlacement>
			return;
	//  151  276:return          
		}
	}

	private static String readSubtitleText(ParsableByteArray parsablebytearray)
		throws SubtitleDecoderException
	{
		boolean flag;
		if(parsablebytearray.bytesLeft() >= 2)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #93  <Method int ParsableByteArray.bytesLeft()>
	//*   2    4:iconst_2        
	//*   3    5:icmplt          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_3        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_3        
		assertTrue(flag);
	//    9   15:iload_3         
	//   10   16:invokestatic    #97  <Method void assertTrue(boolean)>
		int i = parsablebytearray.readUnsignedShort();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #100 <Method int ParsableByteArray.readUnsignedShort()>
	//   13   23:istore_1        
		if(i == 0)
	//*  14   24:iload_1         
	//*  15   25:ifne            31
			return "";
	//   16   28:ldc1            #186 <String "">
	//   17   30:areturn         
		if(parsablebytearray.bytesLeft() >= 2)
	//*  18   31:aload_0         
	//*  19   32:invokevirtual   #93  <Method int ParsableByteArray.bytesLeft()>
	//*  20   35:iconst_2        
	//*  21   36:icmplt          67
		{
			char c = parsablebytearray.peekChar();
	//   22   39:aload_0         
	//   23   40:invokevirtual   #190 <Method char ParsableByteArray.peekChar()>
	//   24   43:istore_2        
			if(c == '\uFEFF' || c == '\uFFFE')
	//*  25   44:iload_2         
	//*  26   45:ldc1            #7   <Int 65279>
	//*  27   47:icmpeq          56
	//*  28   50:iload_2         
	//*  29   51:ldc1            #9   <Int 65534>
	//*  30   53:icmpne          67
				return parsablebytearray.readString(i, Charset.forName("UTF-16"));
	//   31   56:aload_0         
	//   32   57:iload_1         
	//   33   58:ldc1            #192 <String "UTF-16">
	//   34   60:invokestatic    #198 <Method Charset Charset.forName(String)>
	//   35   63:invokevirtual   #202 <Method String ParsableByteArray.readString(int, Charset)>
	//   36   66:areturn         
		}
		return parsablebytearray.readString(i, Charset.forName("UTF-8"));
	//   37   67:aload_0         
	//   38   68:iload_1         
	//   39   69:ldc1            #204 <String "UTF-8">
	//   40   71:invokestatic    #198 <Method Charset Charset.forName(String)>
	//   41   74:invokevirtual   #202 <Method String ParsableByteArray.readString(int, Charset)>
	//   42   77:areturn         
	}

	protected Subtitle decode(byte abyte0[], int i, boolean flag)
		throws SubtitleDecoderException
	{
		parsableByteArray.reset(abyte0, i);
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field ParsableByteArray parsableByteArray>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #210 <Method void ParsableByteArray.reset(byte[], int)>
		abyte0 = ((byte []) (readSubtitleText(parsableByteArray)));
	//    5    9:aload_0         
	//    6   10:getfield        #80  <Field ParsableByteArray parsableByteArray>
	//    7   13:invokestatic    #212 <Method String readSubtitleText(ParsableByteArray)>
	//    8   16:astore_1        
		if(((String) (abyte0)).isEmpty())
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #216 <Method boolean String.isEmpty()>
	//*  11   21:ifeq            28
			return ((Subtitle) (Tx3gSubtitle.EMPTY));
	//   12   24:getstatic       #222 <Field Tx3gSubtitle Tx3gSubtitle.EMPTY>
	//   13   27:areturn         
		abyte0 = ((byte []) (new SpannableStringBuilder(((CharSequence) (abyte0)))));
	//   14   28:new             #131 <Class SpannableStringBuilder>
	//   15   31:dup             
	//   16   32:aload_1         
	//   17   33:invokespecial   #225 <Method void SpannableStringBuilder(CharSequence)>
	//   18   36:astore_1        
		attachFontFace(((SpannableStringBuilder) (abyte0)), defaultFontFace, 0, 0, ((SpannableStringBuilder) (abyte0)).length(), 0xff0000);
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:getfield        #112 <Field int defaultFontFace>
	//   22   42:iconst_0        
	//   23   43:iconst_0        
	//   24   44:aload_1         
	//   25   45:invokevirtual   #228 <Method int SpannableStringBuilder.length()>
	//   26   48:ldc1            #36  <Int 0xff0000>
	//   27   50:invokestatic    #116 <Method void attachFontFace(SpannableStringBuilder, int, int, int, int, int)>
		attachColor(((SpannableStringBuilder) (abyte0)), defaultColorRgba, -1, 0, ((SpannableStringBuilder) (abyte0)).length(), 0xff0000);
	//   28   53:aload_1         
	//   29   54:aload_0         
	//   30   55:getfield        #118 <Field int defaultColorRgba>
	//   31   58:iconst_m1       
	//   32   59:iconst_0        
	//   33   60:aload_1         
	//   34   61:invokevirtual   #228 <Method int SpannableStringBuilder.length()>
	//   35   64:ldc1            #36  <Int 0xff0000>
	//   36   66:invokestatic    #121 <Method void attachColor(SpannableStringBuilder, int, int, int, int, int)>
		attachFontFamily(((SpannableStringBuilder) (abyte0)), defaultFontFamily, "sans-serif", 0, ((SpannableStringBuilder) (abyte0)).length(), 0xff0000);
	//   37   69:aload_1         
	//   38   70:aload_0         
	//   39   71:getfield        #171 <Field String defaultFontFamily>
	//   40   74:ldc1            #18  <String "sans-serif">
	//   41   76:iconst_0        
	//   42   77:aload_1         
	//   43   78:invokevirtual   #228 <Method int SpannableStringBuilder.length()>
	//   44   81:ldc1            #36  <Int 0xff0000>
	//   45   83:invokestatic    #230 <Method void attachFontFamily(SpannableStringBuilder, String, String, int, int, int)>
		float f;
		float f1;
		for(f = defaultVerticalPlacement; parsableByteArray.bytesLeft() >= 8; f = f1)
	//*  46   86:aload_0         
	//*  47   87:getfield        #177 <Field float defaultVerticalPlacement>
	//*  48   90:fstore          4
	//*  49   92:aload_0         
	//*  50   93:getfield        #80  <Field ParsableByteArray parsableByteArray>
	//*  51   96:invokevirtual   #93  <Method int ParsableByteArray.bytesLeft()>
	//*  52   99:bipush          8
	//*  53  101:icmplt          289
		{
			int j = parsableByteArray.getPosition();
	//   54  104:aload_0         
	//   55  105:getfield        #80  <Field ParsableByteArray parsableByteArray>
	//   56  108:invokevirtual   #233 <Method int ParsableByteArray.getPosition()>
	//   57  111:istore          6
			int k = parsableByteArray.readInt();
	//   58  113:aload_0         
	//   59  114:getfield        #80  <Field ParsableByteArray parsableByteArray>
	//   60  117:invokevirtual   #110 <Method int ParsableByteArray.readInt()>
	//   61  120:istore          7
			int l = parsableByteArray.readInt();
	//   62  122:aload_0         
	//   63  123:getfield        #80  <Field ParsableByteArray parsableByteArray>
	//   64  126:invokevirtual   #110 <Method int ParsableByteArray.readInt()>
	//   65  129:istore          8
			int i1 = TYPE_STYL;
	//   66  131:getstatic       #62  <Field int TYPE_STYL>
	//   67  134:istore          9
			boolean flag1 = false;
	//   68  136:iconst_0        
	//   69  137:istore          10
			i = 0;
	//   70  139:iconst_0        
	//   71  140:istore_2        
			flag = true;
	//   72  141:iconst_1        
	//   73  142:istore_3        
			if(l == i1)
	//*  74  143:iload           8
	//*  75  145:iload           9
	//*  76  147:icmpne          205
			{
				if(parsableByteArray.bytesLeft() < 2)
	//*  77  150:aload_0         
	//*  78  151:getfield        #80  <Field ParsableByteArray parsableByteArray>
	//*  79  154:invokevirtual   #93  <Method int ParsableByteArray.bytesLeft()>
	//*  80  157:iconst_2        
	//*  81  158:icmplt          164
	//*  82  161:goto            166
					flag = false;
	//   83  164:iconst_0        
	//   84  165:istore_3        
				assertTrue(flag);
	//   85  166:iload_3         
	//   86  167:invokestatic    #97  <Method void assertTrue(boolean)>
				l = parsableByteArray.readUnsignedShort();
	//   87  170:aload_0         
	//   88  171:getfield        #80  <Field ParsableByteArray parsableByteArray>
	//   89  174:invokevirtual   #100 <Method int ParsableByteArray.readUnsignedShort()>
	//   90  177:istore          8
				do
				{
					f1 = f;
	//   91  179:fload           4
	//   92  181:fstore          5
					if(i >= l)
						break;
	//   93  183:iload_2         
	//   94  184:iload           8
	//   95  186:icmpge          270
					applyStyleRecord(parsableByteArray, ((SpannableStringBuilder) (abyte0)));
	//   96  189:aload_0         
	//   97  190:aload_0         
	//   98  191:getfield        #80  <Field ParsableByteArray parsableByteArray>
	//   99  194:aload_1         
	//  100  195:invokespecial   #235 <Method void applyStyleRecord(ParsableByteArray, SpannableStringBuilder)>
					i++;
	//  101  198:iload_2         
	//  102  199:iconst_1        
	//  103  200:iadd            
	//  104  201:istore_2        
				} while(true);
	//  105  202:goto            179
			} else
			{
				f1 = f;
	//  106  205:fload           4
	//  107  207:fstore          5
				if(l == TYPE_TBOX)
	//* 108  209:iload           8
	//* 109  211:getstatic       #66  <Field int TYPE_TBOX>
	//* 110  214:icmpne          270
				{
					f1 = f;
	//  111  217:fload           4
	//  112  219:fstore          5
					if(customVerticalPlacement)
	//* 113  221:aload_0         
	//* 114  222:getfield        #175 <Field boolean customVerticalPlacement>
	//* 115  225:ifeq            270
					{
						flag = flag1;
	//  116  228:iload           10
	//  117  230:istore_3        
						if(parsableByteArray.bytesLeft() >= 2)
	//* 118  231:aload_0         
	//* 119  232:getfield        #80  <Field ParsableByteArray parsableByteArray>
	//* 120  235:invokevirtual   #93  <Method int ParsableByteArray.bytesLeft()>
	//* 121  238:iconst_2        
	//* 122  239:icmplt          244
							flag = true;
	//  123  242:iconst_1        
	//  124  243:istore_3        
						assertTrue(flag);
	//  125  244:iload_3         
	//  126  245:invokestatic    #97  <Method void assertTrue(boolean)>
						f1 = Util.constrainValue((float)parsableByteArray.readUnsignedShort() / (float)calculatedVideoTrackHeight, 0.0F, 0.95F);
	//  127  248:aload_0         
	//  128  249:getfield        #80  <Field ParsableByteArray parsableByteArray>
	//  129  252:invokevirtual   #100 <Method int ParsableByteArray.readUnsignedShort()>
	//  130  255:i2f             
	//  131  256:aload_0         
	//  132  257:getfield        #173 <Field int calculatedVideoTrackHeight>
	//  133  260:i2f             
	//  134  261:fdiv            
	//  135  262:fconst_0        
	//  136  263:ldc1            #178 <Float 0.95F>
	//  137  265:invokestatic    #182 <Method float Util.constrainValue(float, float, float)>
	//  138  268:fstore          5
					}
				}
			}
			parsableByteArray.setPosition(j + k);
	//  139  270:aload_0         
	//  140  271:getfield        #80  <Field ParsableByteArray parsableByteArray>
	//  141  274:iload           6
	//  142  276:iload           7
	//  143  278:iadd            
	//  144  279:invokevirtual   #238 <Method void ParsableByteArray.setPosition(int)>
		}

	//  145  282:fload           5
	//  146  284:fstore          4
	//* 147  286:goto            92
		return ((Subtitle) (new Tx3gSubtitle(new Cue(((CharSequence) (abyte0)), ((android.text.Layout.Alignment) (null)), f, 0, 0, 1.401298E-45F, 0x80000000, 1.401298E-45F))));
	//  148  289:new             #218 <Class Tx3gSubtitle>
	//  149  292:dup             
	//  150  293:new             #240 <Class Cue>
	//  151  296:dup             
	//  152  297:aload_1         
	//  153  298:aconst_null     
	//  154  299:fload           4
	//  155  301:iconst_0        
	//  156  302:iconst_0        
	//  157  303:ldc1            #241 <Float 1.401298E-45F>
	//  158  305:ldc1            #242 <Int 0x80000000>
	//  159  307:ldc1            #241 <Float 1.401298E-45F>
	//  160  309:invokespecial   #245 <Method void Cue(CharSequence, android.text.Layout$Alignment, float, int, int, float, int, float)>
	//  161  312:invokespecial   #248 <Method void Tx3gSubtitle(Cue)>
	//  162  315:areturn         
	}

	private static final char BOM_UTF16_BE = 65279;
	private static final char BOM_UTF16_LE = 65534;
	private static final int DEFAULT_COLOR = -1;
	private static final int DEFAULT_FONT_FACE = 0;
	private static final String DEFAULT_FONT_FAMILY = "sans-serif";
	private static final float DEFAULT_VERTICAL_PLACEMENT = 0.85F;
	private static final int FONT_FACE_BOLD = 1;
	private static final int FONT_FACE_ITALIC = 2;
	private static final int FONT_FACE_UNDERLINE = 4;
	private static final int SIZE_ATOM_HEADER = 8;
	private static final int SIZE_BOM_UTF16 = 2;
	private static final int SIZE_SHORT = 2;
	private static final int SIZE_STYLE_RECORD = 12;
	private static final int SPAN_PRIORITY_HIGH = 0;
	private static final int SPAN_PRIORITY_LOW = 0xff0000;
	private static final String TX3G_SERIF = "Serif";
	private static final int TYPE_STYL = Util.getIntegerCodeForString("styl");
	private static final int TYPE_TBOX = Util.getIntegerCodeForString("tbox");
	private int calculatedVideoTrackHeight;
	private boolean customVerticalPlacement;
	private int defaultColorRgba;
	private int defaultFontFace;
	private String defaultFontFamily;
	private float defaultVerticalPlacement;
	private final ParsableByteArray parsableByteArray = new ParsableByteArray();

	static 
	{
	//    0    0:ldc1            #54  <String "styl">
	//    1    2:invokestatic    #60  <Method int Util.getIntegerCodeForString(String)>
	//    2    5:putstatic       #62  <Field int TYPE_STYL>
	//    3    8:ldc1            #64  <String "tbox">
	//    4   10:invokestatic    #60  <Method int Util.getIntegerCodeForString(String)>
	//    5   13:putstatic       #66  <Field int TYPE_TBOX>
	//*   6   16:return          
	}
}
