// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.cea;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.*;
import android.util.Log;
import com.google.android.exoplayer2.text.*;
import com.google.android.exoplayer2.util.*;
import java.nio.ByteBuffer;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.text.cea:
//			CeaDecoder, CeaSubtitle, Cea708Cue

public final class Cea708Decoder extends CeaDecoder
{
	private static final class CueBuilder
	{

		public static int getArgbColorFromCeaColor(int i, int j, int k)
		{
			return getArgbColorFromCeaColor(i, j, k, 0);
		//    0    0:iload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:iconst_0        
		//    4    4:invokestatic    #84  <Method int getArgbColorFromCeaColor(int, int, int, int)>
		//    5    7:ireturn         
		}

		public static int getArgbColorFromCeaColor(int i, int j, int k, int l)
		{
			Assertions.checkIndex(i, 0, 4);
		//    0    0:iload_0         
		//    1    1:iconst_0        
		//    2    2:iconst_4        
		//    3    3:invokestatic    #129 <Method int Assertions.checkIndex(int, int, int)>
		//    4    6:pop             
			Assertions.checkIndex(j, 0, 4);
		//    5    7:iload_1         
		//    6    8:iconst_0        
		//    7    9:iconst_4        
		//    8   10:invokestatic    #129 <Method int Assertions.checkIndex(int, int, int)>
		//    9   13:pop             
			Assertions.checkIndex(k, 0, 4);
		//   10   14:iload_2         
		//   11   15:iconst_0        
		//   12   16:iconst_4        
		//   13   17:invokestatic    #129 <Method int Assertions.checkIndex(int, int, int)>
		//   14   20:pop             
			Assertions.checkIndex(l, 0, 4);
		//   15   21:iload_3         
		//   16   22:iconst_0        
		//   17   23:iconst_4        
		//   18   24:invokestatic    #129 <Method int Assertions.checkIndex(int, int, int)>
		//   19   27:pop             
			char c = '\377';
		//   20   28:sipush          255
		//   21   31:istore          4
			switch(l)
		//*  22   33:iload_3         
			{
		//*  23   34:tableswitch     0 3: default 64
		//		               0 64
		//		               1 64
		//		               2 76
		//		               3 71
			case 0: // '\0'
			case 1: // '\001'
			default:
				l = 255;
		//   24   64:sipush          255
		//   25   67:istore_3        
				break;

		//*  26   68:goto            79
			case 3: // '\003'
				l = 0;
		//   27   71:iconst_0        
		//   28   72:istore_3        
				break;

		//*  29   73:goto            79
			case 2: // '\002'
				l = 127;
		//   30   76:bipush          127
		//   31   78:istore_3        
				break;
			}
			if(i > 1)
		//*  32   79:iload_0         
		//*  33   80:iconst_1        
		//*  34   81:icmple          91
				i = 255;
		//   35   84:sipush          255
		//   36   87:istore_0        
			else
		//*  37   88:goto            93
				i = 0;
		//   38   91:iconst_0        
		//   39   92:istore_0        
			if(j > 1)
		//*  40   93:iload_1         
		//*  41   94:iconst_1        
		//*  42   95:icmple          105
				j = 255;
		//   43   98:sipush          255
		//   44  101:istore_1        
			else
		//*  45  102:goto            107
				j = 0;
		//   46  105:iconst_0        
		//   47  106:istore_1        
			if(k > 1)
		//*  48  107:iload_2         
		//*  49  108:iconst_1        
		//*  50  109:icmple          118
				k = ((int) (c));
		//   51  112:iload           4
		//   52  114:istore_2        
			else
		//*  53  115:goto            120
				k = 0;
		//   54  118:iconst_0        
		//   55  119:istore_2        
			return Color.argb(l, i, j, k);
		//   56  120:iload_3         
		//   57  121:iload_0         
		//   58  122:iload_1         
		//   59  123:iload_2         
		//   60  124:invokestatic    #134 <Method int Color.argb(int, int, int, int)>
		//   61  127:ireturn         
		}

		public void append(char c)
		{
			if(c == '\n')
		//*   0    0:iload_1         
		//*   1    1:bipush          10
		//*   2    3:icmpne          130
			{
				rolledUpCaptions.add(((Object) (buildSpannableString())));
		//    3    6:aload_0         
		//    4    7:getfield        #115 <Field List rolledUpCaptions>
		//    5   10:aload_0         
		//    6   11:invokevirtual   #140 <Method SpannableString buildSpannableString()>
		//    7   14:invokeinterface #146 <Method boolean List.add(Object)>
		//    8   19:pop             
				captionStringBuilder.clear();
		//    9   20:aload_0         
		//   10   21:getfield        #120 <Field SpannableStringBuilder captionStringBuilder>
		//   11   24:invokevirtual   #149 <Method void SpannableStringBuilder.clear()>
				if(italicsStartPosition != -1)
		//*  12   27:aload_0         
		//*  13   28:getfield        #151 <Field int italicsStartPosition>
		//*  14   31:iconst_m1       
		//*  15   32:icmpeq          40
					italicsStartPosition = 0;
		//   16   35:aload_0         
		//   17   36:iconst_0        
		//   18   37:putfield        #151 <Field int italicsStartPosition>
				if(underlineStartPosition != -1)
		//*  19   40:aload_0         
		//*  20   41:getfield        #153 <Field int underlineStartPosition>
		//*  21   44:iconst_m1       
		//*  22   45:icmpeq          53
					underlineStartPosition = 0;
		//   23   48:aload_0         
		//   24   49:iconst_0        
		//   25   50:putfield        #153 <Field int underlineStartPosition>
				if(foregroundColorStartPosition != -1)
		//*  26   53:aload_0         
		//*  27   54:getfield        #155 <Field int foregroundColorStartPosition>
		//*  28   57:iconst_m1       
		//*  29   58:icmpeq          66
					foregroundColorStartPosition = 0;
		//   30   61:aload_0         
		//   31   62:iconst_0        
		//   32   63:putfield        #155 <Field int foregroundColorStartPosition>
				if(backgroundColorStartPosition != -1)
		//*  33   66:aload_0         
		//*  34   67:getfield        #157 <Field int backgroundColorStartPosition>
		//*  35   70:iconst_m1       
		//*  36   71:icmpeq          79
					backgroundColorStartPosition = 0;
		//   37   74:aload_0         
		//   38   75:iconst_0        
		//   39   76:putfield        #157 <Field int backgroundColorStartPosition>
				for(; rowLock && rolledUpCaptions.size() >= rowCount || rolledUpCaptions.size() >= 15; rolledUpCaptions.remove(0));
		//   40   79:aload_0         
		//   41   80:getfield        #159 <Field boolean rowLock>
		//   42   83:ifeq            102
		//   43   86:aload_0         
		//   44   87:getfield        #115 <Field List rolledUpCaptions>
		//   45   90:invokeinterface #163 <Method int List.size()>
		//   46   95:aload_0         
		//   47   96:getfield        #165 <Field int rowCount>
		//   48   99:icmpge          116
		//   49  102:aload_0         
		//   50  103:getfield        #115 <Field List rolledUpCaptions>
		//   51  106:invokeinterface #163 <Method int List.size()>
		//   52  111:bipush          15
		//   53  113:icmplt          139
		//   54  116:aload_0         
		//   55  117:getfield        #115 <Field List rolledUpCaptions>
		//   56  120:iconst_0        
		//   57  121:invokeinterface #169 <Method Object List.remove(int)>
		//   58  126:pop             
			} else
		//*  59  127:goto            79
			{
				captionStringBuilder.append(c);
		//   60  130:aload_0         
		//   61  131:getfield        #120 <Field SpannableStringBuilder captionStringBuilder>
		//   62  134:iload_1         
		//   63  135:invokevirtual   #172 <Method SpannableStringBuilder SpannableStringBuilder.append(char)>
		//   64  138:pop             
			}
		//   65  139:return          
		}

		public void backspace()
		{
			int i = captionStringBuilder.length();
		//    0    0:aload_0         
		//    1    1:getfield        #120 <Field SpannableStringBuilder captionStringBuilder>
		//    2    4:invokevirtual   #176 <Method int SpannableStringBuilder.length()>
		//    3    7:istore_1        
			if(i > 0)
		//*   4    8:iload_1         
		//*   5    9:ifle            24
				captionStringBuilder.delete(i - 1, i);
		//    6   12:aload_0         
		//    7   13:getfield        #120 <Field SpannableStringBuilder captionStringBuilder>
		//    8   16:iload_1         
		//    9   17:iconst_1        
		//   10   18:isub            
		//   11   19:iload_1         
		//   12   20:invokevirtual   #180 <Method SpannableStringBuilder SpannableStringBuilder.delete(int, int)>
		//   13   23:pop             
		//   14   24:return          
		}

		public Cea708Cue build()
		{
			if(isEmpty())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #186 <Method boolean isEmpty()>
		//*   2    4:ifeq            9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
		//    5    9:new             #117 <Class SpannableStringBuilder>
		//    6   12:dup             
		//    7   13:invokespecial   #118 <Method void SpannableStringBuilder()>
		//    8   16:astore          7
			for(int i = 0; i < rolledUpCaptions.size(); i++)
		//*   9   18:iconst_0        
		//*  10   19:istore_3        
		//*  11   20:iload_3         
		//*  12   21:aload_0         
		//*  13   22:getfield        #115 <Field List rolledUpCaptions>
		//*  14   25:invokeinterface #163 <Method int List.size()>
		//*  15   30:icmpge          67
			{
				spannablestringbuilder.append((CharSequence)rolledUpCaptions.get(i));
		//   16   33:aload           7
		//   17   35:aload_0         
		//   18   36:getfield        #115 <Field List rolledUpCaptions>
		//   19   39:iload_3         
		//   20   40:invokeinterface #189 <Method Object List.get(int)>
		//   21   45:checkcast       #191 <Class CharSequence>
		//   22   48:invokevirtual   #194 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
		//   23   51:pop             
				spannablestringbuilder.append('\n');
		//   24   52:aload           7
		//   25   54:bipush          10
		//   26   56:invokevirtual   #172 <Method SpannableStringBuilder SpannableStringBuilder.append(char)>
		//   27   59:pop             
			}

		//   28   60:iload_3         
		//   29   61:iconst_1        
		//   30   62:iadd            
		//   31   63:istore_3        
		//*  32   64:goto            20
			spannablestringbuilder.append(((CharSequence) (buildSpannableString())));
		//   33   67:aload           7
		//   34   69:aload_0         
		//   35   70:invokevirtual   #140 <Method SpannableString buildSpannableString()>
		//   36   73:invokevirtual   #194 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
		//   37   76:pop             
			android.text.Layout.Alignment alignment;
			switch(justification)
		//*  38   77:aload_0         
		//*  39   78:getfield        #196 <Field int justification>
			{
		//*  40   81:tableswitch     0 3: default 112
		//		               0 168
		//		               1 160
		//		               2 152
		//		               3 168
			default:
				StringBuilder stringbuilder = new StringBuilder();
		//   41  112:new             #198 <Class StringBuilder>
		//   42  115:dup             
		//   43  116:invokespecial   #199 <Method void StringBuilder()>
		//   44  119:astore          6
				stringbuilder.append("Unexpected justification value: ");
		//   45  121:aload           6
		//   46  123:ldc1            #201 <String "Unexpected justification value: ">
		//   47  125:invokevirtual   #204 <Method StringBuilder StringBuilder.append(String)>
		//   48  128:pop             
				stringbuilder.append(justification);
		//   49  129:aload           6
		//   50  131:aload_0         
		//   51  132:getfield        #196 <Field int justification>
		//   52  135:invokevirtual   #207 <Method StringBuilder StringBuilder.append(int)>
		//   53  138:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
		//   54  139:new             #209 <Class IllegalArgumentException>
		//   55  142:dup             
		//   56  143:aload           6
		//   57  145:invokevirtual   #213 <Method String StringBuilder.toString()>
		//   58  148:invokespecial   #216 <Method void IllegalArgumentException(String)>
		//   59  151:athrow          

			case 2: // '\002'
				alignment = android.text.Layout.Alignment.ALIGN_CENTER;
		//   60  152:getstatic       #222 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_CENTER>
		//   61  155:astore          6
				break;

		//*  62  157:goto            173
			case 1: // '\001'
				alignment = android.text.Layout.Alignment.ALIGN_OPPOSITE;
		//   63  160:getstatic       #225 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_OPPOSITE>
		//   64  163:astore          6
				break;

		//*  65  165:goto            173
			case 0: // '\0'
			case 3: // '\003'
				alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
		//   66  168:getstatic       #228 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_NORMAL>
		//   67  171:astore          6
				break;
			}
			float f;
			float f1;
			if(relativePositioning)
		//*  68  173:aload_0         
		//*  69  174:getfield        #230 <Field boolean relativePositioning>
		//*  70  177:ifeq            201
			{
				f = (float)horizontalAnchor / 99F;
		//   71  180:aload_0         
		//   72  181:getfield        #232 <Field int horizontalAnchor>
		//   73  184:i2f             
		//   74  185:ldc1            #233 <Float 99F>
		//   75  187:fdiv            
		//   76  188:fstore_1        
				f1 = (float)verticalAnchor / 99F;
		//   77  189:aload_0         
		//   78  190:getfield        #235 <Field int verticalAnchor>
		//   79  193:i2f             
		//   80  194:ldc1            #233 <Float 99F>
		//   81  196:fdiv            
		//   82  197:fstore_2        
			} else
		//*  83  198:goto            219
			{
				f = (float)horizontalAnchor / 209F;
		//   84  201:aload_0         
		//   85  202:getfield        #232 <Field int horizontalAnchor>
		//   86  205:i2f             
		//   87  206:ldc1            #236 <Float 209F>
		//   88  208:fdiv            
		//   89  209:fstore_1        
				f1 = (float)verticalAnchor / 74F;
		//   90  210:aload_0         
		//   91  211:getfield        #235 <Field int verticalAnchor>
		//   92  214:i2f             
		//   93  215:ldc1            #237 <Float 74F>
		//   94  217:fdiv            
		//   95  218:fstore_2        
			}
			byte byte0;
			if(anchorId % 3 == 0)
		//*  96  219:aload_0         
		//*  97  220:getfield        #239 <Field int anchorId>
		//*  98  223:iconst_3        
		//*  99  224:irem            
		//* 100  225:ifne            233
				byte0 = 0;
		//  101  228:iconst_0        
		//  102  229:istore_3        
			else
		//* 103  230:goto            250
			if(anchorId % 3 == 1)
		//* 104  233:aload_0         
		//* 105  234:getfield        #239 <Field int anchorId>
		//* 106  237:iconst_3        
		//* 107  238:irem            
		//* 108  239:iconst_1        
		//* 109  240:icmpne          248
				byte0 = 1;
		//  110  243:iconst_1        
		//  111  244:istore_3        
			else
		//* 112  245:goto            250
				byte0 = 2;
		//  113  248:iconst_2        
		//  114  249:istore_3        
			byte byte1;
			if(anchorId / 3 == 0)
		//* 115  250:aload_0         
		//* 116  251:getfield        #239 <Field int anchorId>
		//* 117  254:iconst_3        
		//* 118  255:idiv            
		//* 119  256:ifne            265
				byte1 = 0;
		//  120  259:iconst_0        
		//  121  260:istore          4
			else
		//* 122  262:goto            284
			if(anchorId / 3 == 1)
		//* 123  265:aload_0         
		//* 124  266:getfield        #239 <Field int anchorId>
		//* 125  269:iconst_3        
		//* 126  270:idiv            
		//* 127  271:iconst_1        
		//* 128  272:icmpne          281
				byte1 = 1;
		//  129  275:iconst_1        
		//  130  276:istore          4
			else
		//* 131  278:goto            284
				byte1 = 2;
		//  132  281:iconst_2        
		//  133  282:istore          4
			boolean flag;
			if(windowFillColor != COLOR_SOLID_BLACK)
		//* 134  284:aload_0         
		//* 135  285:getfield        #241 <Field int windowFillColor>
		//* 136  288:getstatic       #88  <Field int COLOR_SOLID_BLACK>
		//* 137  291:icmpeq          300
				flag = true;
		//  138  294:iconst_1        
		//  139  295:istore          5
			else
		//* 140  297:goto            303
				flag = false;
		//  141  300:iconst_0        
		//  142  301:istore          5
			return new Cea708Cue(((CharSequence) (spannablestringbuilder)), alignment, f1 * 0.9F + 0.05F, 0, ((int) (byte0)), f * 0.9F + 0.05F, ((int) (byte1)), 1.401298E-45F, flag, windowFillColor, priority);
		//  143  303:new             #243 <Class Cea708Cue>
		//  144  306:dup             
		//  145  307:aload           7
		//  146  309:aload           6
		//  147  311:fload_2         
		//  148  312:ldc1            #244 <Float 0.9F>
		//  149  314:fmul            
		//  150  315:ldc1            #245 <Float 0.05F>
		//  151  317:fadd            
		//  152  318:iconst_0        
		//  153  319:iload_3         
		//  154  320:fload_1         
		//  155  321:ldc1            #244 <Float 0.9F>
		//  156  323:fmul            
		//  157  324:ldc1            #245 <Float 0.05F>
		//  158  326:fadd            
		//  159  327:iload           4
		//  160  329:ldc1            #246 <Float 1.401298E-45F>
		//  161  331:iload           5
		//  162  333:aload_0         
		//  163  334:getfield        #241 <Field int windowFillColor>
		//  164  337:aload_0         
		//  165  338:getfield        #248 <Field int priority>
		//  166  341:invokespecial   #251 <Method void Cea708Cue(CharSequence, android.text.Layout$Alignment, float, int, int, float, int, float, boolean, int, int)>
		//  167  344:areturn         
		}

		public SpannableString buildSpannableString()
		{
			SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(((CharSequence) (captionStringBuilder)));
		//    0    0:new             #117 <Class SpannableStringBuilder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #120 <Field SpannableStringBuilder captionStringBuilder>
		//    4    8:invokespecial   #254 <Method void SpannableStringBuilder(CharSequence)>
		//    5   11:astore_2        
			int i = spannablestringbuilder.length();
		//    6   12:aload_2         
		//    7   13:invokevirtual   #176 <Method int SpannableStringBuilder.length()>
		//    8   16:istore_1        
			if(i > 0)
		//*   9   17:iload_1         
		//*  10   18:ifle            134
			{
				if(italicsStartPosition != -1)
		//*  11   21:aload_0         
		//*  12   22:getfield        #151 <Field int italicsStartPosition>
		//*  13   25:iconst_m1       
		//*  14   26:icmpeq          48
					spannablestringbuilder.setSpan(((Object) (new StyleSpan(2))), italicsStartPosition, i, 33);
		//   15   29:aload_2         
		//   16   30:new             #256 <Class StyleSpan>
		//   17   33:dup             
		//   18   34:iconst_2        
		//   19   35:invokespecial   #259 <Method void StyleSpan(int)>
		//   20   38:aload_0         
		//   21   39:getfield        #151 <Field int italicsStartPosition>
		//   22   42:iload_1         
		//   23   43:bipush          33
		//   24   45:invokevirtual   #263 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
				if(underlineStartPosition != -1)
		//*  25   48:aload_0         
		//*  26   49:getfield        #153 <Field int underlineStartPosition>
		//*  27   52:iconst_m1       
		//*  28   53:icmpeq          74
					spannablestringbuilder.setSpan(((Object) (new UnderlineSpan())), underlineStartPosition, i, 33);
		//   29   56:aload_2         
		//   30   57:new             #265 <Class UnderlineSpan>
		//   31   60:dup             
		//   32   61:invokespecial   #266 <Method void UnderlineSpan()>
		//   33   64:aload_0         
		//   34   65:getfield        #153 <Field int underlineStartPosition>
		//   35   68:iload_1         
		//   36   69:bipush          33
		//   37   71:invokevirtual   #263 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
				if(foregroundColorStartPosition != -1)
		//*  38   74:aload_0         
		//*  39   75:getfield        #155 <Field int foregroundColorStartPosition>
		//*  40   78:iconst_m1       
		//*  41   79:icmpeq          104
					spannablestringbuilder.setSpan(((Object) (new ForegroundColorSpan(foregroundColor))), foregroundColorStartPosition, i, 33);
		//   42   82:aload_2         
		//   43   83:new             #268 <Class ForegroundColorSpan>
		//   44   86:dup             
		//   45   87:aload_0         
		//   46   88:getfield        #270 <Field int foregroundColor>
		//   47   91:invokespecial   #271 <Method void ForegroundColorSpan(int)>
		//   48   94:aload_0         
		//   49   95:getfield        #155 <Field int foregroundColorStartPosition>
		//   50   98:iload_1         
		//   51   99:bipush          33
		//   52  101:invokevirtual   #263 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
				if(backgroundColorStartPosition != -1)
		//*  53  104:aload_0         
		//*  54  105:getfield        #157 <Field int backgroundColorStartPosition>
		//*  55  108:iconst_m1       
		//*  56  109:icmpeq          134
					spannablestringbuilder.setSpan(((Object) (new BackgroundColorSpan(backgroundColor))), backgroundColorStartPosition, i, 33);
		//   57  112:aload_2         
		//   58  113:new             #273 <Class BackgroundColorSpan>
		//   59  116:dup             
		//   60  117:aload_0         
		//   61  118:getfield        #275 <Field int backgroundColor>
		//   62  121:invokespecial   #276 <Method void BackgroundColorSpan(int)>
		//   63  124:aload_0         
		//   64  125:getfield        #157 <Field int backgroundColorStartPosition>
		//   65  128:iload_1         
		//   66  129:bipush          33
		//   67  131:invokevirtual   #263 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
			}
			return new SpannableString(((CharSequence) (spannablestringbuilder)));
		//   68  134:new             #278 <Class SpannableString>
		//   69  137:dup             
		//   70  138:aload_2         
		//   71  139:invokespecial   #279 <Method void SpannableString(CharSequence)>
		//   72  142:areturn         
		}

		public void clear()
		{
			rolledUpCaptions.clear();
		//    0    0:aload_0         
		//    1    1:getfield        #115 <Field List rolledUpCaptions>
		//    2    4:invokeinterface #280 <Method void List.clear()>
			captionStringBuilder.clear();
		//    3    9:aload_0         
		//    4   10:getfield        #120 <Field SpannableStringBuilder captionStringBuilder>
		//    5   13:invokevirtual   #149 <Method void SpannableStringBuilder.clear()>
			italicsStartPosition = -1;
		//    6   16:aload_0         
		//    7   17:iconst_m1       
		//    8   18:putfield        #151 <Field int italicsStartPosition>
			underlineStartPosition = -1;
		//    9   21:aload_0         
		//   10   22:iconst_m1       
		//   11   23:putfield        #153 <Field int underlineStartPosition>
			foregroundColorStartPosition = -1;
		//   12   26:aload_0         
		//   13   27:iconst_m1       
		//   14   28:putfield        #155 <Field int foregroundColorStartPosition>
			backgroundColorStartPosition = -1;
		//   15   31:aload_0         
		//   16   32:iconst_m1       
		//   17   33:putfield        #157 <Field int backgroundColorStartPosition>
			row = 0;
		//   18   36:aload_0         
		//   19   37:iconst_0        
		//   20   38:putfield        #282 <Field int row>
		//   21   41:return          
		}

		public void defineWindow(boolean flag, boolean flag1, boolean flag2, int i, boolean flag3, int j, int k, 
				int l, int i1, int j1, int k1, int l1)
		{
			defined = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #286 <Field boolean defined>
			visible = flag;
		//    3    5:aload_0         
		//    4    6:iload_1         
		//    5    7:putfield        #288 <Field boolean visible>
			rowLock = flag1;
		//    6   10:aload_0         
		//    7   11:iload_2         
		//    8   12:putfield        #159 <Field boolean rowLock>
			priority = i;
		//    9   15:aload_0         
		//   10   16:iload           4
		//   11   18:putfield        #248 <Field int priority>
			relativePositioning = flag3;
		//   12   21:aload_0         
		//   13   22:iload           5
		//   14   24:putfield        #230 <Field boolean relativePositioning>
			verticalAnchor = j;
		//   15   27:aload_0         
		//   16   28:iload           6
		//   17   30:putfield        #235 <Field int verticalAnchor>
			horizontalAnchor = k;
		//   18   33:aload_0         
		//   19   34:iload           7
		//   20   36:putfield        #232 <Field int horizontalAnchor>
			anchorId = j1;
		//   21   39:aload_0         
		//   22   40:iload           10
		//   23   42:putfield        #239 <Field int anchorId>
			i = rowCount;
		//   24   45:aload_0         
		//   25   46:getfield        #165 <Field int rowCount>
		//   26   49:istore          4
			j = l + 1;
		//   27   51:iload           8
		//   28   53:iconst_1        
		//   29   54:iadd            
		//   30   55:istore          6
			if(i != j)
		//*  31   57:iload           4
		//*  32   59:iload           6
		//*  33   61:icmpeq          118
				for(rowCount = j; flag1 && rolledUpCaptions.size() >= rowCount || rolledUpCaptions.size() >= 15; rolledUpCaptions.remove(0));
		//   34   64:aload_0         
		//   35   65:iload           6
		//   36   67:putfield        #165 <Field int rowCount>
		//   37   70:iload_2         
		//   38   71:ifeq            90
		//   39   74:aload_0         
		//   40   75:getfield        #115 <Field List rolledUpCaptions>
		//   41   78:invokeinterface #163 <Method int List.size()>
		//   42   83:aload_0         
		//   43   84:getfield        #165 <Field int rowCount>
		//   44   87:icmpge          104
		//   45   90:aload_0         
		//   46   91:getfield        #115 <Field List rolledUpCaptions>
		//   47   94:invokeinterface #163 <Method int List.size()>
		//   48   99:bipush          15
		//   49  101:icmplt          118
		//   50  104:aload_0         
		//   51  105:getfield        #115 <Field List rolledUpCaptions>
		//   52  108:iconst_0        
		//   53  109:invokeinterface #169 <Method Object List.remove(int)>
		//   54  114:pop             
		//*  55  115:goto            70
			if(k1 != 0 && windowStyleId != k1)
		//*  56  118:iload           11
		//*  57  120:ifeq            182
		//*  58  123:aload_0         
		//*  59  124:getfield        #290 <Field int windowStyleId>
		//*  60  127:iload           11
		//*  61  129:icmpeq          182
			{
				windowStyleId = k1;
		//   62  132:aload_0         
		//   63  133:iload           11
		//   64  135:putfield        #290 <Field int windowStyleId>
				i = k1 - 1;
		//   65  138:iload           11
		//   66  140:iconst_1        
		//   67  141:isub            
		//   68  142:istore          4
				setWindowAttributes(WINDOW_STYLE_FILL[i], COLOR_TRANSPARENT, WINDOW_STYLE_WORD_WRAP[i], 0, WINDOW_STYLE_PRINT_DIRECTION[i], WINDOW_STYLE_SCROLL_DIRECTION[i], WINDOW_STYLE_JUSTIFICATION[i]);
		//   69  144:aload_0         
		//   70  145:getstatic       #100 <Field int[] WINDOW_STYLE_FILL>
		//   71  148:iload           4
		//   72  150:iaload          
		//   73  151:getstatic       #90  <Field int COLOR_TRANSPARENT>
		//   74  154:getstatic       #98  <Field boolean[] WINDOW_STYLE_WORD_WRAP>
		//   75  157:iload           4
		//   76  159:baload          
		//   77  160:iconst_0        
		//   78  161:getstatic       #94  <Field int[] WINDOW_STYLE_PRINT_DIRECTION>
		//   79  164:iload           4
		//   80  166:iaload          
		//   81  167:getstatic       #96  <Field int[] WINDOW_STYLE_SCROLL_DIRECTION>
		//   82  170:iload           4
		//   83  172:iaload          
		//   84  173:getstatic       #92  <Field int[] WINDOW_STYLE_JUSTIFICATION>
		//   85  176:iload           4
		//   86  178:iaload          
		//   87  179:invokevirtual   #294 <Method void setWindowAttributes(int, int, boolean, int, int, int, int)>
			}
			if(l1 != 0 && penStyleId != l1)
		//*  88  182:iload           12
		//*  89  184:ifeq            245
		//*  90  187:aload_0         
		//*  91  188:getfield        #296 <Field int penStyleId>
		//*  92  191:iload           12
		//*  93  193:icmpeq          245
			{
				penStyleId = l1;
		//   94  196:aload_0         
		//   95  197:iload           12
		//   96  199:putfield        #296 <Field int penStyleId>
				i = l1 - 1;
		//   97  202:iload           12
		//   98  204:iconst_1        
		//   99  205:isub            
		//  100  206:istore          4
				setPenAttributes(0, 1, 1, false, false, PEN_STYLE_EDGE_TYPE[i], PEN_STYLE_FONT_STYLE[i]);
		//  101  208:aload_0         
		//  102  209:iconst_0        
		//  103  210:iconst_1        
		//  104  211:iconst_1        
		//  105  212:iconst_0        
		//  106  213:iconst_0        
		//  107  214:getstatic       #104 <Field int[] PEN_STYLE_EDGE_TYPE>
		//  108  217:iload           4
		//  109  219:iaload          
		//  110  220:getstatic       #102 <Field int[] PEN_STYLE_FONT_STYLE>
		//  111  223:iload           4
		//  112  225:iaload          
		//  113  226:invokevirtual   #300 <Method void setPenAttributes(int, int, int, boolean, boolean, int, int)>
				setPenColor(COLOR_SOLID_WHITE, PEN_STYLE_BACKGROUND[i], COLOR_SOLID_BLACK);
		//  114  229:aload_0         
		//  115  230:getstatic       #86  <Field int COLOR_SOLID_WHITE>
		//  116  233:getstatic       #106 <Field int[] PEN_STYLE_BACKGROUND>
		//  117  236:iload           4
		//  118  238:iaload          
		//  119  239:getstatic       #88  <Field int COLOR_SOLID_BLACK>
		//  120  242:invokevirtual   #304 <Method void setPenColor(int, int, int)>
			}
		//  121  245:return          
		}

		public boolean isDefined()
		{
			return defined;
		//    0    0:aload_0         
		//    1    1:getfield        #286 <Field boolean defined>
		//    2    4:ireturn         
		}

		public boolean isEmpty()
		{
			return !isDefined() || rolledUpCaptions.isEmpty() && captionStringBuilder.length() == 0;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #307 <Method boolean isDefined()>
		//    2    4:ifeq            34
		//    3    7:aload_0         
		//    4    8:getfield        #115 <Field List rolledUpCaptions>
		//    5   11:invokeinterface #308 <Method boolean List.isEmpty()>
		//    6   16:ifeq            32
		//    7   19:aload_0         
		//    8   20:getfield        #120 <Field SpannableStringBuilder captionStringBuilder>
		//    9   23:invokevirtual   #176 <Method int SpannableStringBuilder.length()>
		//   10   26:ifne            32
		//   11   29:goto            34
		//   12   32:iconst_0        
		//   13   33:ireturn         
		//   14   34:iconst_1        
		//   15   35:ireturn         
		}

		public boolean isVisible()
		{
			return visible;
		//    0    0:aload_0         
		//    1    1:getfield        #288 <Field boolean visible>
		//    2    4:ireturn         
		}

		public void reset()
		{
			clear();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #310 <Method void clear()>
			defined = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #286 <Field boolean defined>
			visible = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #288 <Field boolean visible>
			priority = 4;
		//    8   14:aload_0         
		//    9   15:iconst_4        
		//   10   16:putfield        #248 <Field int priority>
			relativePositioning = false;
		//   11   19:aload_0         
		//   12   20:iconst_0        
		//   13   21:putfield        #230 <Field boolean relativePositioning>
			verticalAnchor = 0;
		//   14   24:aload_0         
		//   15   25:iconst_0        
		//   16   26:putfield        #235 <Field int verticalAnchor>
			horizontalAnchor = 0;
		//   17   29:aload_0         
		//   18   30:iconst_0        
		//   19   31:putfield        #232 <Field int horizontalAnchor>
			anchorId = 0;
		//   20   34:aload_0         
		//   21   35:iconst_0        
		//   22   36:putfield        #239 <Field int anchorId>
			rowCount = 15;
		//   23   39:aload_0         
		//   24   40:bipush          15
		//   25   42:putfield        #165 <Field int rowCount>
			rowLock = true;
		//   26   45:aload_0         
		//   27   46:iconst_1        
		//   28   47:putfield        #159 <Field boolean rowLock>
			justification = 0;
		//   29   50:aload_0         
		//   30   51:iconst_0        
		//   31   52:putfield        #196 <Field int justification>
			windowStyleId = 0;
		//   32   55:aload_0         
		//   33   56:iconst_0        
		//   34   57:putfield        #290 <Field int windowStyleId>
			penStyleId = 0;
		//   35   60:aload_0         
		//   36   61:iconst_0        
		//   37   62:putfield        #296 <Field int penStyleId>
			windowFillColor = COLOR_SOLID_BLACK;
		//   38   65:aload_0         
		//   39   66:getstatic       #88  <Field int COLOR_SOLID_BLACK>
		//   40   69:putfield        #241 <Field int windowFillColor>
			foregroundColor = COLOR_SOLID_WHITE;
		//   41   72:aload_0         
		//   42   73:getstatic       #86  <Field int COLOR_SOLID_WHITE>
		//   43   76:putfield        #270 <Field int foregroundColor>
			backgroundColor = COLOR_SOLID_BLACK;
		//   44   79:aload_0         
		//   45   80:getstatic       #88  <Field int COLOR_SOLID_BLACK>
		//   46   83:putfield        #275 <Field int backgroundColor>
		//   47   86:return          
		}

		public void setPenAttributes(int i, int j, int k, boolean flag, boolean flag1, int l, int i1)
		{
			if(italicsStartPosition != -1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #151 <Field int italicsStartPosition>
		//*   2    4:iconst_m1       
		//*   3    5:icmpeq          49
			{
				if(!flag)
		//*   4    8:iload           4
		//*   5   10:ifne            65
				{
					captionStringBuilder.setSpan(((Object) (new StyleSpan(2))), italicsStartPosition, captionStringBuilder.length(), 33);
		//    6   13:aload_0         
		//    7   14:getfield        #120 <Field SpannableStringBuilder captionStringBuilder>
		//    8   17:new             #256 <Class StyleSpan>
		//    9   20:dup             
		//   10   21:iconst_2        
		//   11   22:invokespecial   #259 <Method void StyleSpan(int)>
		//   12   25:aload_0         
		//   13   26:getfield        #151 <Field int italicsStartPosition>
		//   14   29:aload_0         
		//   15   30:getfield        #120 <Field SpannableStringBuilder captionStringBuilder>
		//   16   33:invokevirtual   #176 <Method int SpannableStringBuilder.length()>
		//   17   36:bipush          33
		//   18   38:invokevirtual   #263 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
					italicsStartPosition = -1;
		//   19   41:aload_0         
		//   20   42:iconst_m1       
		//   21   43:putfield        #151 <Field int italicsStartPosition>
				}
			} else
		//*  22   46:goto            65
			if(flag)
		//*  23   49:iload           4
		//*  24   51:ifeq            65
				italicsStartPosition = captionStringBuilder.length();
		//   25   54:aload_0         
		//   26   55:aload_0         
		//   27   56:getfield        #120 <Field SpannableStringBuilder captionStringBuilder>
		//   28   59:invokevirtual   #176 <Method int SpannableStringBuilder.length()>
		//   29   62:putfield        #151 <Field int italicsStartPosition>
			if(underlineStartPosition != -1)
		//*  30   65:aload_0         
		//*  31   66:getfield        #153 <Field int underlineStartPosition>
		//*  32   69:iconst_m1       
		//*  33   70:icmpeq          111
			{
				if(!flag1)
		//*  34   73:iload           5
		//*  35   75:ifne            127
				{
					captionStringBuilder.setSpan(((Object) (new UnderlineSpan())), underlineStartPosition, captionStringBuilder.length(), 33);
		//   36   78:aload_0         
		//   37   79:getfield        #120 <Field SpannableStringBuilder captionStringBuilder>
		//   38   82:new             #265 <Class UnderlineSpan>
		//   39   85:dup             
		//   40   86:invokespecial   #266 <Method void UnderlineSpan()>
		//   41   89:aload_0         
		//   42   90:getfield        #153 <Field int underlineStartPosition>
		//   43   93:aload_0         
		//   44   94:getfield        #120 <Field SpannableStringBuilder captionStringBuilder>
		//   45   97:invokevirtual   #176 <Method int SpannableStringBuilder.length()>
		//   46  100:bipush          33
		//   47  102:invokevirtual   #263 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
					underlineStartPosition = -1;
		//   48  105:aload_0         
		//   49  106:iconst_m1       
		//   50  107:putfield        #153 <Field int underlineStartPosition>
					return;
		//   51  110:return          
				}
			} else
			if(flag1)
		//*  52  111:iload           5
		//*  53  113:ifeq            127
				underlineStartPosition = captionStringBuilder.length();
		//   54  116:aload_0         
		//   55  117:aload_0         
		//   56  118:getfield        #120 <Field SpannableStringBuilder captionStringBuilder>
		//   57  121:invokevirtual   #176 <Method int SpannableStringBuilder.length()>
		//   58  124:putfield        #153 <Field int underlineStartPosition>
		//   59  127:return          
		}

		public void setPenColor(int i, int j, int k)
		{
			if(foregroundColorStartPosition != -1 && foregroundColor != i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #155 <Field int foregroundColorStartPosition>
		//*   2    4:iconst_m1       
		//*   3    5:icmpeq          47
		//*   4    8:aload_0         
		//*   5    9:getfield        #270 <Field int foregroundColor>
		//*   6   12:iload_1         
		//*   7   13:icmpeq          47
				captionStringBuilder.setSpan(((Object) (new ForegroundColorSpan(foregroundColor))), foregroundColorStartPosition, captionStringBuilder.length(), 33);
		//    8   16:aload_0         
		//    9   17:getfield        #120 <Field SpannableStringBuilder captionStringBuilder>
		//   10   20:new             #268 <Class ForegroundColorSpan>
		//   11   23:dup             
		//   12   24:aload_0         
		//   13   25:getfield        #270 <Field int foregroundColor>
		//   14   28:invokespecial   #271 <Method void ForegroundColorSpan(int)>
		//   15   31:aload_0         
		//   16   32:getfield        #155 <Field int foregroundColorStartPosition>
		//   17   35:aload_0         
		//   18   36:getfield        #120 <Field SpannableStringBuilder captionStringBuilder>
		//   19   39:invokevirtual   #176 <Method int SpannableStringBuilder.length()>
		//   20   42:bipush          33
		//   21   44:invokevirtual   #263 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
			if(i != COLOR_SOLID_WHITE)
		//*  22   47:iload_1         
		//*  23   48:getstatic       #86  <Field int COLOR_SOLID_WHITE>
		//*  24   51:icmpeq          70
			{
				foregroundColorStartPosition = captionStringBuilder.length();
		//   25   54:aload_0         
		//   26   55:aload_0         
		//   27   56:getfield        #120 <Field SpannableStringBuilder captionStringBuilder>
		//   28   59:invokevirtual   #176 <Method int SpannableStringBuilder.length()>
		//   29   62:putfield        #155 <Field int foregroundColorStartPosition>
				foregroundColor = i;
		//   30   65:aload_0         
		//   31   66:iload_1         
		//   32   67:putfield        #270 <Field int foregroundColor>
			}
			if(backgroundColorStartPosition != -1 && backgroundColor != j)
		//*  33   70:aload_0         
		//*  34   71:getfield        #157 <Field int backgroundColorStartPosition>
		//*  35   74:iconst_m1       
		//*  36   75:icmpeq          117
		//*  37   78:aload_0         
		//*  38   79:getfield        #275 <Field int backgroundColor>
		//*  39   82:iload_2         
		//*  40   83:icmpeq          117
				captionStringBuilder.setSpan(((Object) (new BackgroundColorSpan(backgroundColor))), backgroundColorStartPosition, captionStringBuilder.length(), 33);
		//   41   86:aload_0         
		//   42   87:getfield        #120 <Field SpannableStringBuilder captionStringBuilder>
		//   43   90:new             #273 <Class BackgroundColorSpan>
		//   44   93:dup             
		//   45   94:aload_0         
		//   46   95:getfield        #275 <Field int backgroundColor>
		//   47   98:invokespecial   #276 <Method void BackgroundColorSpan(int)>
		//   48  101:aload_0         
		//   49  102:getfield        #157 <Field int backgroundColorStartPosition>
		//   50  105:aload_0         
		//   51  106:getfield        #120 <Field SpannableStringBuilder captionStringBuilder>
		//   52  109:invokevirtual   #176 <Method int SpannableStringBuilder.length()>
		//   53  112:bipush          33
		//   54  114:invokevirtual   #263 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
			if(j != COLOR_SOLID_BLACK)
		//*  55  117:iload_2         
		//*  56  118:getstatic       #88  <Field int COLOR_SOLID_BLACK>
		//*  57  121:icmpeq          140
			{
				backgroundColorStartPosition = captionStringBuilder.length();
		//   58  124:aload_0         
		//   59  125:aload_0         
		//   60  126:getfield        #120 <Field SpannableStringBuilder captionStringBuilder>
		//   61  129:invokevirtual   #176 <Method int SpannableStringBuilder.length()>
		//   62  132:putfield        #157 <Field int backgroundColorStartPosition>
				backgroundColor = j;
		//   63  135:aload_0         
		//   64  136:iload_2         
		//   65  137:putfield        #275 <Field int backgroundColor>
			}
		//   66  140:return          
		}

		public void setPenLocation(int i, int j)
		{
			if(row != i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #282 <Field int row>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          14
				append('\n');
		//    4    8:aload_0         
		//    5    9:bipush          10
		//    6   11:invokevirtual   #314 <Method void append(char)>
			row = i;
		//    7   14:aload_0         
		//    8   15:iload_1         
		//    9   16:putfield        #282 <Field int row>
		//   10   19:return          
		}

		public void setVisibility(boolean flag)
		{
			visible = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #288 <Field boolean visible>
		//    3    5:return          
		}

		public void setWindowAttributes(int i, int j, boolean flag, int k, int l, int i1, int j1)
		{
			windowFillColor = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #241 <Field int windowFillColor>
			justification = j1;
		//    3    5:aload_0         
		//    4    6:iload           7
		//    5    8:putfield        #196 <Field int justification>
		//    6   11:return          
		}

		private static final int BORDER_AND_EDGE_TYPE_NONE = 0;
		private static final int BORDER_AND_EDGE_TYPE_UNIFORM = 3;
		public static final int COLOR_SOLID_BLACK;
		public static final int COLOR_SOLID_WHITE = getArgbColorFromCeaColor(2, 2, 2, 0);
		public static final int COLOR_TRANSPARENT;
		private static final int DEFAULT_PRIORITY = 4;
		private static final int DIRECTION_BOTTOM_TO_TOP = 3;
		private static final int DIRECTION_LEFT_TO_RIGHT = 0;
		private static final int DIRECTION_RIGHT_TO_LEFT = 1;
		private static final int DIRECTION_TOP_TO_BOTTOM = 2;
		private static final int HORIZONTAL_SIZE = 209;
		private static final int JUSTIFICATION_CENTER = 2;
		private static final int JUSTIFICATION_FULL = 3;
		private static final int JUSTIFICATION_LEFT = 0;
		private static final int JUSTIFICATION_RIGHT = 1;
		private static final int MAXIMUM_ROW_COUNT = 15;
		private static final int PEN_FONT_STYLE_DEFAULT = 0;
		private static final int PEN_FONT_STYLE_MONOSPACED_WITHOUT_SERIFS = 3;
		private static final int PEN_FONT_STYLE_MONOSPACED_WITH_SERIFS = 1;
		private static final int PEN_FONT_STYLE_PROPORTIONALLY_SPACED_WITHOUT_SERIFS = 4;
		private static final int PEN_FONT_STYLE_PROPORTIONALLY_SPACED_WITH_SERIFS = 2;
		private static final int PEN_OFFSET_NORMAL = 1;
		private static final int PEN_SIZE_STANDARD = 1;
		private static final int PEN_STYLE_BACKGROUND[];
		private static final int PEN_STYLE_EDGE_TYPE[] = {
			0, 0, 0, 0, 0, 3, 3
		};
		private static final int PEN_STYLE_FONT_STYLE[] = {
			0, 1, 2, 3, 4, 3, 4
		};
		private static final int RELATIVE_CUE_SIZE = 99;
		private static final int VERTICAL_SIZE = 74;
		private static final int WINDOW_STYLE_FILL[];
		private static final int WINDOW_STYLE_JUSTIFICATION[] = {
			0, 0, 0, 0, 0, 2, 0
		};
		private static final int WINDOW_STYLE_PRINT_DIRECTION[] = {
			0, 0, 0, 0, 0, 0, 2
		};
		private static final int WINDOW_STYLE_SCROLL_DIRECTION[] = {
			3, 3, 3, 3, 3, 3, 1
		};
		private static final boolean WINDOW_STYLE_WORD_WRAP[] = {
			0, 0, 0, 1, 1, 1, 0
		};
		private int anchorId;
		private int backgroundColor;
		private int backgroundColorStartPosition;
		private final SpannableStringBuilder captionStringBuilder = new SpannableStringBuilder();
		private boolean defined;
		private int foregroundColor;
		private int foregroundColorStartPosition;
		private int horizontalAnchor;
		private int italicsStartPosition;
		private int justification;
		private int penStyleId;
		private int priority;
		private boolean relativePositioning;
		private final List rolledUpCaptions = new ArrayList();
		private int row;
		private int rowCount;
		private boolean rowLock;
		private int underlineStartPosition;
		private int verticalAnchor;
		private boolean visible;
		private int windowFillColor;
		private int windowStyleId;

		static 
		{
		//    0    0:iconst_2        
		//    1    1:iconst_2        
		//    2    2:iconst_2        
		//    3    3:iconst_0        
		//    4    4:invokestatic    #84  <Method int getArgbColorFromCeaColor(int, int, int, int)>
		//    5    7:putstatic       #86  <Field int COLOR_SOLID_WHITE>
			COLOR_SOLID_BLACK = getArgbColorFromCeaColor(0, 0, 0, 0);
		//    6   10:iconst_0        
		//    7   11:iconst_0        
		//    8   12:iconst_0        
		//    9   13:iconst_0        
		//   10   14:invokestatic    #84  <Method int getArgbColorFromCeaColor(int, int, int, int)>
		//   11   17:putstatic       #88  <Field int COLOR_SOLID_BLACK>
			COLOR_TRANSPARENT = getArgbColorFromCeaColor(0, 0, 0, 3);
		//   12   20:iconst_0        
		//   13   21:iconst_0        
		//   14   22:iconst_0        
		//   15   23:iconst_3        
		//   16   24:invokestatic    #84  <Method int getArgbColorFromCeaColor(int, int, int, int)>
		//   17   27:putstatic       #90  <Field int COLOR_TRANSPARENT>
		//   18   30:bipush          7
		//   19   32:newarray        int[]
		//   20   34:dup             
		//   21   35:iconst_0        
		//   22   36:iconst_0        
		//   23   37:iastore         
		//   24   38:dup             
		//   25   39:iconst_1        
		//   26   40:iconst_0        
		//   27   41:iastore         
		//   28   42:dup             
		//   29   43:iconst_2        
		//   30   44:iconst_0        
		//   31   45:iastore         
		//   32   46:dup             
		//   33   47:iconst_3        
		//   34   48:iconst_0        
		//   35   49:iastore         
		//   36   50:dup             
		//   37   51:iconst_4        
		//   38   52:iconst_0        
		//   39   53:iastore         
		//   40   54:dup             
		//   41   55:iconst_5        
		//   42   56:iconst_2        
		//   43   57:iastore         
		//   44   58:dup             
		//   45   59:bipush          6
		//   46   61:iconst_0        
		//   47   62:iastore         
		//   48   63:putstatic       #92  <Field int[] WINDOW_STYLE_JUSTIFICATION>
		//   49   66:bipush          7
		//   50   68:newarray        int[]
		//   51   70:dup             
		//   52   71:iconst_0        
		//   53   72:iconst_0        
		//   54   73:iastore         
		//   55   74:dup             
		//   56   75:iconst_1        
		//   57   76:iconst_0        
		//   58   77:iastore         
		//   59   78:dup             
		//   60   79:iconst_2        
		//   61   80:iconst_0        
		//   62   81:iastore         
		//   63   82:dup             
		//   64   83:iconst_3        
		//   65   84:iconst_0        
		//   66   85:iastore         
		//   67   86:dup             
		//   68   87:iconst_4        
		//   69   88:iconst_0        
		//   70   89:iastore         
		//   71   90:dup             
		//   72   91:iconst_5        
		//   73   92:iconst_0        
		//   74   93:iastore         
		//   75   94:dup             
		//   76   95:bipush          6
		//   77   97:iconst_2        
		//   78   98:iastore         
		//   79   99:putstatic       #94  <Field int[] WINDOW_STYLE_PRINT_DIRECTION>
		//   80  102:bipush          7
		//   81  104:newarray        int[]
		//   82  106:dup             
		//   83  107:iconst_0        
		//   84  108:iconst_3        
		//   85  109:iastore         
		//   86  110:dup             
		//   87  111:iconst_1        
		//   88  112:iconst_3        
		//   89  113:iastore         
		//   90  114:dup             
		//   91  115:iconst_2        
		//   92  116:iconst_3        
		//   93  117:iastore         
		//   94  118:dup             
		//   95  119:iconst_3        
		//   96  120:iconst_3        
		//   97  121:iastore         
		//   98  122:dup             
		//   99  123:iconst_4        
		//  100  124:iconst_3        
		//  101  125:iastore         
		//  102  126:dup             
		//  103  127:iconst_5        
		//  104  128:iconst_3        
		//  105  129:iastore         
		//  106  130:dup             
		//  107  131:bipush          6
		//  108  133:iconst_1        
		//  109  134:iastore         
		//  110  135:putstatic       #96  <Field int[] WINDOW_STYLE_SCROLL_DIRECTION>
		//  111  138:bipush          7
		//  112  140:newarray        boolean[]
		//  113  142:dup             
		//  114  143:iconst_0        
		//  115  144:ldc1            #10  <Int 0>
		//  116  146:bastore         
		//  117  147:dup             
		//  118  148:iconst_1        
		//  119  149:ldc1            #10  <Int 0>
		//  120  151:bastore         
		//  121  152:dup             
		//  122  153:iconst_2        
		//  123  154:ldc1            #10  <Int 0>
		//  124  156:bastore         
		//  125  157:dup             
		//  126  158:iconst_3        
		//  127  159:ldc1            #21  <Int 1>
		//  128  161:bastore         
		//  129  162:dup             
		//  130  163:iconst_4        
		//  131  164:ldc1            #21  <Int 1>
		//  132  166:bastore         
		//  133  167:dup             
		//  134  168:iconst_5        
		//  135  169:ldc1            #21  <Int 1>
		//  136  171:bastore         
		//  137  172:dup             
		//  138  173:bipush          6
		//  139  175:ldc1            #10  <Int 0>
		//  140  177:bastore         
		//  141  178:putstatic       #98  <Field boolean[] WINDOW_STYLE_WORD_WRAP>
			WINDOW_STYLE_FILL = (new int[] {
				COLOR_SOLID_BLACK, COLOR_TRANSPARENT, COLOR_SOLID_BLACK, COLOR_SOLID_BLACK, COLOR_TRANSPARENT, COLOR_SOLID_BLACK, COLOR_SOLID_BLACK
			});
		//  142  181:bipush          7
		//  143  183:newarray        int[]
		//  144  185:dup             
		//  145  186:iconst_0        
		//  146  187:getstatic       #88  <Field int COLOR_SOLID_BLACK>
		//  147  190:iastore         
		//  148  191:dup             
		//  149  192:iconst_1        
		//  150  193:getstatic       #90  <Field int COLOR_TRANSPARENT>
		//  151  196:iastore         
		//  152  197:dup             
		//  153  198:iconst_2        
		//  154  199:getstatic       #88  <Field int COLOR_SOLID_BLACK>
		//  155  202:iastore         
		//  156  203:dup             
		//  157  204:iconst_3        
		//  158  205:getstatic       #88  <Field int COLOR_SOLID_BLACK>
		//  159  208:iastore         
		//  160  209:dup             
		//  161  210:iconst_4        
		//  162  211:getstatic       #90  <Field int COLOR_TRANSPARENT>
		//  163  214:iastore         
		//  164  215:dup             
		//  165  216:iconst_5        
		//  166  217:getstatic       #88  <Field int COLOR_SOLID_BLACK>
		//  167  220:iastore         
		//  168  221:dup             
		//  169  222:bipush          6
		//  170  224:getstatic       #88  <Field int COLOR_SOLID_BLACK>
		//  171  227:iastore         
		//  172  228:putstatic       #100 <Field int[] WINDOW_STYLE_FILL>
		//  173  231:bipush          7
		//  174  233:newarray        int[]
		//  175  235:dup             
		//  176  236:iconst_0        
		//  177  237:iconst_0        
		//  178  238:iastore         
		//  179  239:dup             
		//  180  240:iconst_1        
		//  181  241:iconst_1        
		//  182  242:iastore         
		//  183  243:dup             
		//  184  244:iconst_2        
		//  185  245:iconst_2        
		//  186  246:iastore         
		//  187  247:dup             
		//  188  248:iconst_3        
		//  189  249:iconst_3        
		//  190  250:iastore         
		//  191  251:dup             
		//  192  252:iconst_4        
		//  193  253:iconst_4        
		//  194  254:iastore         
		//  195  255:dup             
		//  196  256:iconst_5        
		//  197  257:iconst_3        
		//  198  258:iastore         
		//  199  259:dup             
		//  200  260:bipush          6
		//  201  262:iconst_4        
		//  202  263:iastore         
		//  203  264:putstatic       #102 <Field int[] PEN_STYLE_FONT_STYLE>
		//  204  267:bipush          7
		//  205  269:newarray        int[]
		//  206  271:dup             
		//  207  272:iconst_0        
		//  208  273:iconst_0        
		//  209  274:iastore         
		//  210  275:dup             
		//  211  276:iconst_1        
		//  212  277:iconst_0        
		//  213  278:iastore         
		//  214  279:dup             
		//  215  280:iconst_2        
		//  216  281:iconst_0        
		//  217  282:iastore         
		//  218  283:dup             
		//  219  284:iconst_3        
		//  220  285:iconst_0        
		//  221  286:iastore         
		//  222  287:dup             
		//  223  288:iconst_4        
		//  224  289:iconst_0        
		//  225  290:iastore         
		//  226  291:dup             
		//  227  292:iconst_5        
		//  228  293:iconst_3        
		//  229  294:iastore         
		//  230  295:dup             
		//  231  296:bipush          6
		//  232  298:iconst_3        
		//  233  299:iastore         
		//  234  300:putstatic       #104 <Field int[] PEN_STYLE_EDGE_TYPE>
			PEN_STYLE_BACKGROUND = (new int[] {
				COLOR_SOLID_BLACK, COLOR_SOLID_BLACK, COLOR_SOLID_BLACK, COLOR_SOLID_BLACK, COLOR_SOLID_BLACK, COLOR_TRANSPARENT, COLOR_TRANSPARENT
			});
		//  235  303:bipush          7
		//  236  305:newarray        int[]
		//  237  307:dup             
		//  238  308:iconst_0        
		//  239  309:getstatic       #88  <Field int COLOR_SOLID_BLACK>
		//  240  312:iastore         
		//  241  313:dup             
		//  242  314:iconst_1        
		//  243  315:getstatic       #88  <Field int COLOR_SOLID_BLACK>
		//  244  318:iastore         
		//  245  319:dup             
		//  246  320:iconst_2        
		//  247  321:getstatic       #88  <Field int COLOR_SOLID_BLACK>
		//  248  324:iastore         
		//  249  325:dup             
		//  250  326:iconst_3        
		//  251  327:getstatic       #88  <Field int COLOR_SOLID_BLACK>
		//  252  330:iastore         
		//  253  331:dup             
		//  254  332:iconst_4        
		//  255  333:getstatic       #88  <Field int COLOR_SOLID_BLACK>
		//  256  336:iastore         
		//  257  337:dup             
		//  258  338:iconst_5        
		//  259  339:getstatic       #90  <Field int COLOR_TRANSPARENT>
		//  260  342:iastore         
		//  261  343:dup             
		//  262  344:bipush          6
		//  263  346:getstatic       #90  <Field int COLOR_TRANSPARENT>
		//  264  349:iastore         
		//  265  350:putstatic       #106 <Field int[] PEN_STYLE_BACKGROUND>
		//* 266  353:return          
		}

		public CueBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #110 <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #112 <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #113 <Method void ArrayList()>
		//    6   12:putfield        #115 <Field List rolledUpCaptions>
		//    7   15:aload_0         
		//    8   16:new             #117 <Class SpannableStringBuilder>
		//    9   19:dup             
		//   10   20:invokespecial   #118 <Method void SpannableStringBuilder()>
		//   11   23:putfield        #120 <Field SpannableStringBuilder captionStringBuilder>
			reset();
		//   12   26:aload_0         
		//   13   27:invokevirtual   #123 <Method void reset()>
		//   14   30:return          
		}
	}

	private static final class DtvCcPacket
	{

		int currentIndex;
		public final byte packetData[];
		public final int packetSize;
		public final int sequenceNumber;

		public DtvCcPacket(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			sequenceNumber = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #20  <Field int sequenceNumber>
			packetSize = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #22  <Field int packetSize>
			packetData = new byte[2 * j - 1];
		//    8   14:aload_0         
		//    9   15:iconst_2        
		//   10   16:iload_2         
		//   11   17:imul            
		//   12   18:iconst_1        
		//   13   19:isub            
		//   14   20:newarray        byte[]
		//   15   22:putfield        #24  <Field byte[] packetData>
			currentIndex = 0;
		//   16   25:aload_0         
		//   17   26:iconst_0        
		//   18   27:putfield        #26  <Field int currentIndex>
		//   19   30:return          
		}
	}


	public Cea708Decoder(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #182 <Method void CeaDecoder()>
	//    2    4:aload_0         
	//    3    5:new             #184 <Class ParsableByteArray>
	//    4    8:dup             
	//    5    9:invokespecial   #185 <Method void ParsableByteArray()>
	//    6   12:putfield        #187 <Field ParsableByteArray ccData>
	//    7   15:aload_0         
	//    8   16:new             #189 <Class ParsableBitArray>
	//    9   19:dup             
	//   10   20:invokespecial   #190 <Method void ParsableBitArray()>
	//   11   23:putfield        #192 <Field ParsableBitArray serviceBlockPacket>
		int j = i;
	//   12   26:iload_1         
	//   13   27:istore_2        
		if(i == -1)
	//*  14   28:iload_1         
	//*  15   29:iconst_m1       
	//*  16   30:icmpne          35
			j = 1;
	//   17   33:iconst_1        
	//   18   34:istore_2        
		selectedServiceNumber = j;
	//   19   35:aload_0         
	//   20   36:iload_2         
	//   21   37:putfield        #194 <Field int selectedServiceNumber>
	//   22   40:aload_0         
	//   23   41:bipush          8
	//   24   43:anewarray       CueBuilder[]
	//   25   46:putfield        #196 <Field Cea708Decoder$CueBuilder[] cueBuilders>
		for(i = 0; i < 8; i++)
	//*  26   49:iconst_0        
	//*  27   50:istore_1        
	//*  28   51:iload_1         
	//*  29   52:bipush          8
	//*  30   54:icmpge          77
			cueBuilders[i] = new CueBuilder();
	//   31   57:aload_0         
	//   32   58:getfield        #196 <Field Cea708Decoder$CueBuilder[] cueBuilders>
	//   33   61:iload_1         
	//   34   62:new             #6   <Class Cea708Decoder$CueBuilder>
	//   35   65:dup             
	//   36   66:invokespecial   #197 <Method void Cea708Decoder$CueBuilder()>
	//   37   69:aastore         

	//   38   70:iload_1         
	//   39   71:iconst_1        
	//   40   72:iadd            
	//   41   73:istore_1        
	//*  42   74:goto            51
		currentCueBuilder = cueBuilders[0];
	//   43   77:aload_0         
	//   44   78:aload_0         
	//   45   79:getfield        #196 <Field Cea708Decoder$CueBuilder[] cueBuilders>
	//   46   82:iconst_0        
	//   47   83:aaload          
	//   48   84:putfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
		resetCueBuilders();
	//   49   87:aload_0         
	//   50   88:invokespecial   #202 <Method void resetCueBuilders()>
	//   51   91:return          
	}

	private void finalizeCurrentPacket()
	{
		if(currentDtvCcPacket == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #206 <Field Cea708Decoder$DtvCcPacket currentDtvCcPacket>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			processCurrentPacket();
	//    4    8:aload_0         
	//    5    9:invokespecial   #209 <Method void processCurrentPacket()>
			currentDtvCcPacket = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #206 <Field Cea708Decoder$DtvCcPacket currentDtvCcPacket>
			return;
	//    9   17:return          
		}
	}

	private List getDisplayCues()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #213 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #214 <Method void ArrayList()>
	//    3    7:astore_2        
		for(int i = 0; i < 8; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:bipush          8
	//*   8   13:icmpge          63
			if(!cueBuilders[i].isEmpty() && cueBuilders[i].isVisible())
	//*   9   16:aload_0         
	//*  10   17:getfield        #196 <Field Cea708Decoder$CueBuilder[] cueBuilders>
	//*  11   20:iload_1         
	//*  12   21:aaload          
	//*  13   22:invokevirtual   #218 <Method boolean Cea708Decoder$CueBuilder.isEmpty()>
	//*  14   25:ifne            56
	//*  15   28:aload_0         
	//*  16   29:getfield        #196 <Field Cea708Decoder$CueBuilder[] cueBuilders>
	//*  17   32:iload_1         
	//*  18   33:aaload          
	//*  19   34:invokevirtual   #221 <Method boolean Cea708Decoder$CueBuilder.isVisible()>
	//*  20   37:ifeq            56
				((List) (arraylist)).add(((Object) (cueBuilders[i].build())));
	//   21   40:aload_2         
	//   22   41:aload_0         
	//   23   42:getfield        #196 <Field Cea708Decoder$CueBuilder[] cueBuilders>
	//   24   45:iload_1         
	//   25   46:aaload          
	//   26   47:invokevirtual   #225 <Method Cea708Cue Cea708Decoder$CueBuilder.build()>
	//   27   50:invokeinterface #231 <Method boolean List.add(Object)>
	//   28   55:pop             

	//   29   56:iload_1         
	//   30   57:iconst_1        
	//   31   58:iadd            
	//   32   59:istore_1        
	//*  33   60:goto            10
		Collections.sort(((List) (arraylist)));
	//   34   63:aload_2         
	//   35   64:invokestatic    #237 <Method void Collections.sort(List)>
		return Collections.unmodifiableList(((List) (arraylist)));
	//   36   67:aload_2         
	//   37   68:invokestatic    #241 <Method List Collections.unmodifiableList(List)>
	//   38   71:areturn         
	}

	private void handleC0Command(int i)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            215
			if(i != 3)
	//*   2    4:iload_1         
	//*   3    5:iconst_3        
	//*   4    6:icmpeq          207
			{
				if(i != 8)
	//*   5    9:iload_1         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          199
				{
					switch(i)
	//*   8   15:iload_1         
					{
	//*   9   16:tableswitch     12 14: default 44
	//	               12 194
	//	               13 184
	//	               14 215
					default:
						if(i >= 17 && i <= 23)
	//*  10   44:iload_1         
	//*  11   45:bipush          17
	//*  12   47:icmplt          97
	//*  13   50:iload_1         
	//*  14   51:bipush          23
	//*  15   53:icmpgt          97
						{
							StringBuilder stringbuilder = new StringBuilder();
	//   16   56:new             #246 <Class StringBuilder>
	//   17   59:dup             
	//   18   60:invokespecial   #247 <Method void StringBuilder()>
	//   19   63:astore_2        
							stringbuilder.append("Currently unsupported COMMAND_EXT1 Command: ");
	//   20   64:aload_2         
	//   21   65:ldc1            #249 <String "Currently unsupported COMMAND_EXT1 Command: ">
	//   22   67:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//   23   70:pop             
							stringbuilder.append(i);
	//   24   71:aload_2         
	//   25   72:iload_1         
	//   26   73:invokevirtual   #256 <Method StringBuilder StringBuilder.append(int)>
	//   27   76:pop             
							Log.w("Cea708Decoder", stringbuilder.toString());
	//   28   77:ldc1            #161 <String "Cea708Decoder">
	//   29   79:aload_2         
	//   30   80:invokevirtual   #260 <Method String StringBuilder.toString()>
	//   31   83:invokestatic    #266 <Method int Log.w(String, String)>
	//   32   86:pop             
							serviceBlockPacket.skipBits(8);
	//   33   87:aload_0         
	//   34   88:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   35   91:bipush          8
	//   36   93:invokevirtual   #269 <Method void ParsableBitArray.skipBits(int)>
							return;
	//   37   96:return          
						}
						if(i >= 24 && i <= 31)
	//*  38   97:iload_1         
	//*  39   98:bipush          24
	//*  40  100:icmplt          151
	//*  41  103:iload_1         
	//*  42  104:bipush          31
	//*  43  106:icmpgt          151
						{
							StringBuilder stringbuilder1 = new StringBuilder();
	//   44  109:new             #246 <Class StringBuilder>
	//   45  112:dup             
	//   46  113:invokespecial   #247 <Method void StringBuilder()>
	//   47  116:astore_2        
							stringbuilder1.append("Currently unsupported COMMAND_P16 Command: ");
	//   48  117:aload_2         
	//   49  118:ldc2            #271 <String "Currently unsupported COMMAND_P16 Command: ">
	//   50  121:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//   51  124:pop             
							stringbuilder1.append(i);
	//   52  125:aload_2         
	//   53  126:iload_1         
	//   54  127:invokevirtual   #256 <Method StringBuilder StringBuilder.append(int)>
	//   55  130:pop             
							Log.w("Cea708Decoder", stringbuilder1.toString());
	//   56  131:ldc1            #161 <String "Cea708Decoder">
	//   57  133:aload_2         
	//   58  134:invokevirtual   #260 <Method String StringBuilder.toString()>
	//   59  137:invokestatic    #266 <Method int Log.w(String, String)>
	//   60  140:pop             
							serviceBlockPacket.skipBits(16);
	//   61  141:aload_0         
	//   62  142:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   63  145:bipush          16
	//   64  147:invokevirtual   #269 <Method void ParsableBitArray.skipBits(int)>
							return;
	//   65  150:return          
						} else
						{
							StringBuilder stringbuilder2 = new StringBuilder();
	//   66  151:new             #246 <Class StringBuilder>
	//   67  154:dup             
	//   68  155:invokespecial   #247 <Method void StringBuilder()>
	//   69  158:astore_2        
							stringbuilder2.append("Invalid C0 command: ");
	//   70  159:aload_2         
	//   71  160:ldc2            #273 <String "Invalid C0 command: ">
	//   72  163:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//   73  166:pop             
							stringbuilder2.append(i);
	//   74  167:aload_2         
	//   75  168:iload_1         
	//   76  169:invokevirtual   #256 <Method StringBuilder StringBuilder.append(int)>
	//   77  172:pop             
							Log.w("Cea708Decoder", stringbuilder2.toString());
	//   78  173:ldc1            #161 <String "Cea708Decoder">
	//   79  175:aload_2         
	//   80  176:invokevirtual   #260 <Method String StringBuilder.toString()>
	//   81  179:invokestatic    #266 <Method int Log.w(String, String)>
	//   82  182:pop             
							return;
	//   83  183:return          
						}

					case 13: // '\r'
						currentCueBuilder.append('\n');
	//   84  184:aload_0         
	//   85  185:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//   86  188:bipush          10
	//   87  190:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
						return;
	//   88  193:return          

					case 12: // '\f'
						resetCueBuilders();
	//   89  194:aload_0         
	//   90  195:invokespecial   #202 <Method void resetCueBuilders()>
						return;
	//   91  198:return          

					case 14: // '\016'
						break;
					}
				} else
				{
					currentCueBuilder.backspace();
	//   92  199:aload_0         
	//   93  200:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//   94  203:invokevirtual   #279 <Method void Cea708Decoder$CueBuilder.backspace()>
					return;
	//   95  206:return          
				}
			} else
			{
				cues = getDisplayCues();
	//   96  207:aload_0         
	//   97  208:aload_0         
	//   98  209:invokespecial   #281 <Method List getDisplayCues()>
	//   99  212:putfield        #283 <Field List cues>
			}
	//  100  215:return          
	}

	private void handleC1Command(int i)
	{
		int k = 1;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		int l = 1;
	//    2    2:iconst_1        
	//    3    3:istore          4
		int j = 1;
	//    4    5:iconst_1        
	//    5    6:istore_2        
label0:
		switch(i)
	//*   6    7:iload_1         
		{
	//*   7    8:tableswitch     128 146: default 100
	//	               128 535
	//	               129 535
	//	               130 535
	//	               131 535
	//	               132 535
	//	               133 535
	//	               134 535
	//	               135 535
	//	               136 496
	//	               137 458
	//	               138 422
	//	               139 374
	//	               140 339
	//	               141 329
	//	               142 564
	//	               143 324
	//	               144 299
	//	               145 274
	//	               146 249
		default:
			switch(i)
	//*   8  100:iload_1         
			{
	//*   9  101:tableswitch     151 159: default 152
	//	               151 224
	//	               152 189
	//	               153 189
	//	               154 189
	//	               155 189
	//	               156 189
	//	               157 189
	//	               158 189
	//	               159 189
			default:
				StringBuilder stringbuilder = new StringBuilder();
	//   10  152:new             #246 <Class StringBuilder>
	//   11  155:dup             
	//   12  156:invokespecial   #247 <Method void StringBuilder()>
	//   13  159:astore          5
				stringbuilder.append("Invalid C1 command: ");
	//   14  161:aload           5
	//   15  163:ldc2            #286 <String "Invalid C1 command: ">
	//   16  166:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//   17  169:pop             
				stringbuilder.append(i);
	//   18  170:aload           5
	//   19  172:iload_1         
	//   20  173:invokevirtual   #256 <Method StringBuilder StringBuilder.append(int)>
	//   21  176:pop             
				Log.w("Cea708Decoder", stringbuilder.toString());
	//   22  177:ldc1            #161 <String "Cea708Decoder">
	//   23  179:aload           5
	//   24  181:invokevirtual   #260 <Method String StringBuilder.toString()>
	//   25  184:invokestatic    #266 <Method int Log.w(String, String)>
	//   26  187:pop             
				return;
	//   27  188:return          

			case 152: 
			case 153: 
			case 154: 
			case 155: 
			case 156: 
			case 157: 
			case 158: 
			case 159: 
				i -= 152;
	//   28  189:iload_1         
	//   29  190:sipush          152
	//   30  193:isub            
	//   31  194:istore_1        
				handleDefineWindow(i);
	//   32  195:aload_0         
	//   33  196:iload_1         
	//   34  197:invokespecial   #289 <Method void handleDefineWindow(int)>
				if(currentWindow != i)
	//*  35  200:aload_0         
	//*  36  201:getfield        #291 <Field int currentWindow>
	//*  37  204:iload_1         
	//*  38  205:icmpeq          564
				{
					currentWindow = i;
	//   39  208:aload_0         
	//   40  209:iload_1         
	//   41  210:putfield        #291 <Field int currentWindow>
					currentCueBuilder = cueBuilders[i];
	//   42  213:aload_0         
	//   43  214:aload_0         
	//   44  215:getfield        #196 <Field Cea708Decoder$CueBuilder[] cueBuilders>
	//   45  218:iload_1         
	//   46  219:aaload          
	//   47  220:putfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
					return;
	//   48  223:return          
				}
				break;

			case 151: 
				if(!currentCueBuilder.isDefined())
	//*  49  224:aload_0         
	//*  50  225:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//*  51  228:invokevirtual   #294 <Method boolean Cea708Decoder$CueBuilder.isDefined()>
	//*  52  231:ifne            244
				{
					serviceBlockPacket.skipBits(32);
	//   53  234:aload_0         
	//   54  235:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   55  238:bipush          32
	//   56  240:invokevirtual   #269 <Method void ParsableBitArray.skipBits(int)>
					return;
	//   57  243:return          
				} else
				{
					handleSetWindowAttributes();
	//   58  244:aload_0         
	//   59  245:invokespecial   #297 <Method void handleSetWindowAttributes()>
					return;
	//   60  248:return          
				}
			}
			break;

		case 142: 
			break;

		case 146: 
			if(!currentCueBuilder.isDefined())
	//*  61  249:aload_0         
	//*  62  250:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//*  63  253:invokevirtual   #294 <Method boolean Cea708Decoder$CueBuilder.isDefined()>
	//*  64  256:ifne            269
			{
				serviceBlockPacket.skipBits(16);
	//   65  259:aload_0         
	//   66  260:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   67  263:bipush          16
	//   68  265:invokevirtual   #269 <Method void ParsableBitArray.skipBits(int)>
				return;
	//   69  268:return          
			} else
			{
				handleSetPenLocation();
	//   70  269:aload_0         
	//   71  270:invokespecial   #300 <Method void handleSetPenLocation()>
				return;
	//   72  273:return          
			}

		case 145: 
			if(!currentCueBuilder.isDefined())
	//*  73  274:aload_0         
	//*  74  275:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//*  75  278:invokevirtual   #294 <Method boolean Cea708Decoder$CueBuilder.isDefined()>
	//*  76  281:ifne            294
			{
				serviceBlockPacket.skipBits(24);
	//   77  284:aload_0         
	//   78  285:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   79  288:bipush          24
	//   80  290:invokevirtual   #269 <Method void ParsableBitArray.skipBits(int)>
				return;
	//   81  293:return          
			} else
			{
				handleSetPenColor();
	//   82  294:aload_0         
	//   83  295:invokespecial   #303 <Method void handleSetPenColor()>
				return;
	//   84  298:return          
			}

		case 144: 
			if(!currentCueBuilder.isDefined())
	//*  85  299:aload_0         
	//*  86  300:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//*  87  303:invokevirtual   #294 <Method boolean Cea708Decoder$CueBuilder.isDefined()>
	//*  88  306:ifne            319
			{
				serviceBlockPacket.skipBits(16);
	//   89  309:aload_0         
	//   90  310:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   91  313:bipush          16
	//   92  315:invokevirtual   #269 <Method void ParsableBitArray.skipBits(int)>
				return;
	//   93  318:return          
			} else
			{
				handleSetPenAttributes();
	//   94  319:aload_0         
	//   95  320:invokespecial   #306 <Method void handleSetPenAttributes()>
				return;
	//   96  323:return          
			}

		case 143: 
			resetCueBuilders();
	//   97  324:aload_0         
	//   98  325:invokespecial   #202 <Method void resetCueBuilders()>
			return;
	//   99  328:return          

		case 141: 
			serviceBlockPacket.skipBits(8);
	//  100  329:aload_0         
	//  101  330:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//  102  333:bipush          8
	//  103  335:invokevirtual   #269 <Method void ParsableBitArray.skipBits(int)>
			return;
	//  104  338:return          

		case 140: 
			do
			{
				if(j > 8)
					break label0;
	//  105  339:iload_2         
	//  106  340:bipush          8
	//  107  342:icmpgt          564
				if(serviceBlockPacket.readBit())
	//* 108  345:aload_0         
	//* 109  346:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//* 110  349:invokevirtual   #309 <Method boolean ParsableBitArray.readBit()>
	//* 111  352:ifeq            367
					cueBuilders[8 - j].reset();
	//  112  355:aload_0         
	//  113  356:getfield        #196 <Field Cea708Decoder$CueBuilder[] cueBuilders>
	//  114  359:bipush          8
	//  115  361:iload_2         
	//  116  362:isub            
	//  117  363:aaload          
	//  118  364:invokevirtual   #312 <Method void Cea708Decoder$CueBuilder.reset()>
				j++;
	//  119  367:iload_2         
	//  120  368:iconst_1        
	//  121  369:iadd            
	//  122  370:istore_2        
			} while(true);
	//  123  371:goto            339

		case 139: 
			i = 1;
	//  124  374:iconst_1        
	//  125  375:istore_1        
			do
			{
				if(i > 8)
					break label0;
	//  126  376:iload_1         
	//  127  377:bipush          8
	//  128  379:icmpgt          564
				if(serviceBlockPacket.readBit())
	//* 129  382:aload_0         
	//* 130  383:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//* 131  386:invokevirtual   #309 <Method boolean ParsableBitArray.readBit()>
	//* 132  389:ifeq            415
				{
					CueBuilder cuebuilder = cueBuilders[8 - i];
	//  133  392:aload_0         
	//  134  393:getfield        #196 <Field Cea708Decoder$CueBuilder[] cueBuilders>
	//  135  396:bipush          8
	//  136  398:iload_1         
	//  137  399:isub            
	//  138  400:aaload          
	//  139  401:astore          5
					cuebuilder.setVisibility(cuebuilder.isVisible() ^ true);
	//  140  403:aload           5
	//  141  405:aload           5
	//  142  407:invokevirtual   #221 <Method boolean Cea708Decoder$CueBuilder.isVisible()>
	//  143  410:iconst_1        
	//  144  411:ixor            
	//  145  412:invokevirtual   #316 <Method void Cea708Decoder$CueBuilder.setVisibility(boolean)>
				}
				i++;
	//  146  415:iload_1         
	//  147  416:iconst_1        
	//  148  417:iadd            
	//  149  418:istore_1        
			} while(true);
	//  150  419:goto            376

		case 138: 
			do
			{
				if(k > 8)
					break label0;
	//  151  422:iload_3         
	//  152  423:bipush          8
	//  153  425:icmpgt          564
				if(serviceBlockPacket.readBit())
	//* 154  428:aload_0         
	//* 155  429:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//* 156  432:invokevirtual   #309 <Method boolean ParsableBitArray.readBit()>
	//* 157  435:ifeq            451
					cueBuilders[8 - k].setVisibility(false);
	//  158  438:aload_0         
	//  159  439:getfield        #196 <Field Cea708Decoder$CueBuilder[] cueBuilders>
	//  160  442:bipush          8
	//  161  444:iload_3         
	//  162  445:isub            
	//  163  446:aaload          
	//  164  447:iconst_0        
	//  165  448:invokevirtual   #316 <Method void Cea708Decoder$CueBuilder.setVisibility(boolean)>
				k++;
	//  166  451:iload_3         
	//  167  452:iconst_1        
	//  168  453:iadd            
	//  169  454:istore_3        
			} while(true);
	//  170  455:goto            422

		case 137: 
			i = 1;
	//  171  458:iconst_1        
	//  172  459:istore_1        
			do
			{
				if(i > 8)
					break label0;
	//  173  460:iload_1         
	//  174  461:bipush          8
	//  175  463:icmpgt          564
				if(serviceBlockPacket.readBit())
	//* 176  466:aload_0         
	//* 177  467:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//* 178  470:invokevirtual   #309 <Method boolean ParsableBitArray.readBit()>
	//* 179  473:ifeq            489
					cueBuilders[8 - i].setVisibility(true);
	//  180  476:aload_0         
	//  181  477:getfield        #196 <Field Cea708Decoder$CueBuilder[] cueBuilders>
	//  182  480:bipush          8
	//  183  482:iload_1         
	//  184  483:isub            
	//  185  484:aaload          
	//  186  485:iconst_1        
	//  187  486:invokevirtual   #316 <Method void Cea708Decoder$CueBuilder.setVisibility(boolean)>
				i++;
	//  188  489:iload_1         
	//  189  490:iconst_1        
	//  190  491:iadd            
	//  191  492:istore_1        
			} while(true);
	//  192  493:goto            460

		case 136: 
			do
			{
				if(l > 8)
					break label0;
	//  193  496:iload           4
	//  194  498:bipush          8
	//  195  500:icmpgt          564
				if(serviceBlockPacket.readBit())
	//* 196  503:aload_0         
	//* 197  504:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//* 198  507:invokevirtual   #309 <Method boolean ParsableBitArray.readBit()>
	//* 199  510:ifeq            526
					cueBuilders[8 - l].clear();
	//  200  513:aload_0         
	//  201  514:getfield        #196 <Field Cea708Decoder$CueBuilder[] cueBuilders>
	//  202  517:bipush          8
	//  203  519:iload           4
	//  204  521:isub            
	//  205  522:aaload          
	//  206  523:invokevirtual   #319 <Method void Cea708Decoder$CueBuilder.clear()>
				l++;
	//  207  526:iload           4
	//  208  528:iconst_1        
	//  209  529:iadd            
	//  210  530:istore          4
			} while(true);
	//  211  532:goto            496

		case 128: 
		case 129: 
		case 130: 
		case 131: 
		case 132: 
		case 133: 
		case 134: 
		case 135: 
			i -= 128;
	//  212  535:iload_1         
	//  213  536:sipush          128
	//  214  539:isub            
	//  215  540:istore_1        
			if(currentWindow != i)
	//* 216  541:aload_0         
	//* 217  542:getfield        #291 <Field int currentWindow>
	//* 218  545:iload_1         
	//* 219  546:icmpeq          564
			{
				currentWindow = i;
	//  220  549:aload_0         
	//  221  550:iload_1         
	//  222  551:putfield        #291 <Field int currentWindow>
				currentCueBuilder = cueBuilders[i];
	//  223  554:aload_0         
	//  224  555:aload_0         
	//  225  556:getfield        #196 <Field Cea708Decoder$CueBuilder[] cueBuilders>
	//  226  559:iload_1         
	//  227  560:aaload          
	//  228  561:putfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
			}
			break;
		}
	//  229  564:return          
	}

	private void handleC2Command(int i)
	{
		if(i <= 7)
	//*   0    0:iload_1         
	//*   1    1:bipush          7
	//*   2    3:icmpgt          7
			return;
	//    3    6:return          
		if(i <= 15)
	//*   4    7:iload_1         
	//*   5    8:bipush          15
	//*   6   10:icmpgt          23
		{
			serviceBlockPacket.skipBits(8);
	//    7   13:aload_0         
	//    8   14:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//    9   17:bipush          8
	//   10   19:invokevirtual   #269 <Method void ParsableBitArray.skipBits(int)>
			return;
	//   11   22:return          
		}
		if(i <= 23)
	//*  12   23:iload_1         
	//*  13   24:bipush          23
	//*  14   26:icmpgt          39
		{
			serviceBlockPacket.skipBits(16);
	//   15   29:aload_0         
	//   16   30:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   17   33:bipush          16
	//   18   35:invokevirtual   #269 <Method void ParsableBitArray.skipBits(int)>
			return;
	//   19   38:return          
		}
		if(i <= 31)
	//*  20   39:iload_1         
	//*  21   40:bipush          31
	//*  22   42:icmpgt          54
			serviceBlockPacket.skipBits(24);
	//   23   45:aload_0         
	//   24   46:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   25   49:bipush          24
	//   26   51:invokevirtual   #269 <Method void ParsableBitArray.skipBits(int)>
	//   27   54:return          
	}

	private void handleC3Command(int i)
	{
		if(i <= 135)
	//*   0    0:iload_1         
	//*   1    1:sipush          135
	//*   2    4:icmpgt          17
		{
			serviceBlockPacket.skipBits(32);
	//    3    7:aload_0         
	//    4    8:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//    5   11:bipush          32
	//    6   13:invokevirtual   #269 <Method void ParsableBitArray.skipBits(int)>
			return;
	//    7   16:return          
		}
		if(i <= 143)
	//*   8   17:iload_1         
	//*   9   18:sipush          143
	//*  10   21:icmpgt          34
		{
			serviceBlockPacket.skipBits(40);
	//   11   24:aload_0         
	//   12   25:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   13   28:bipush          40
	//   14   30:invokevirtual   #269 <Method void ParsableBitArray.skipBits(int)>
			return;
	//   15   33:return          
		}
		if(i <= 159)
	//*  16   34:iload_1         
	//*  17   35:sipush          159
	//*  18   38:icmpgt          70
		{
			serviceBlockPacket.skipBits(2);
	//   19   41:aload_0         
	//   20   42:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   21   45:iconst_2        
	//   22   46:invokevirtual   #269 <Method void ParsableBitArray.skipBits(int)>
			i = serviceBlockPacket.readBits(6);
	//   23   49:aload_0         
	//   24   50:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   25   53:bipush          6
	//   26   55:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   27   58:istore_1        
			serviceBlockPacket.skipBits(8 * i);
	//   28   59:aload_0         
	//   29   60:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   30   63:bipush          8
	//   31   65:iload_1         
	//   32   66:imul            
	//   33   67:invokevirtual   #269 <Method void ParsableBitArray.skipBits(int)>
		}
	//   34   70:return          
	}

	private void handleDefineWindow(int i)
	{
		CueBuilder cuebuilder = cueBuilders[i];
	//    0    0:aload_0         
	//    1    1:getfield        #196 <Field Cea708Decoder$CueBuilder[] cueBuilders>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:astore          11
		serviceBlockPacket.skipBits(2);
	//    5    8:aload_0         
	//    6    9:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//    7   12:iconst_2        
	//    8   13:invokevirtual   #269 <Method void ParsableBitArray.skipBits(int)>
		boolean flag = serviceBlockPacket.readBit();
	//    9   16:aload_0         
	//   10   17:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   11   20:invokevirtual   #309 <Method boolean ParsableBitArray.readBit()>
	//   12   23:istore          7
		boolean flag1 = serviceBlockPacket.readBit();
	//   13   25:aload_0         
	//   14   26:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   15   29:invokevirtual   #309 <Method boolean ParsableBitArray.readBit()>
	//   16   32:istore          8
		boolean flag2 = serviceBlockPacket.readBit();
	//   17   34:aload_0         
	//   18   35:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   19   38:invokevirtual   #309 <Method boolean ParsableBitArray.readBit()>
	//   20   41:istore          9
		i = serviceBlockPacket.readBits(3);
	//   21   43:aload_0         
	//   22   44:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   23   47:iconst_3        
	//   24   48:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   25   51:istore_1        
		boolean flag3 = serviceBlockPacket.readBit();
	//   26   52:aload_0         
	//   27   53:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   28   56:invokevirtual   #309 <Method boolean ParsableBitArray.readBit()>
	//   29   59:istore          10
		int j = serviceBlockPacket.readBits(7);
	//   30   61:aload_0         
	//   31   62:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   32   65:bipush          7
	//   33   67:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   34   70:istore_2        
		int k = serviceBlockPacket.readBits(8);
	//   35   71:aload_0         
	//   36   72:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   37   75:bipush          8
	//   38   77:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   39   80:istore_3        
		int l = serviceBlockPacket.readBits(4);
	//   40   81:aload_0         
	//   41   82:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   42   85:iconst_4        
	//   43   86:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   44   89:istore          4
		int i1 = serviceBlockPacket.readBits(4);
	//   45   91:aload_0         
	//   46   92:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   47   95:iconst_4        
	//   48   96:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   49   99:istore          5
		serviceBlockPacket.skipBits(2);
	//   50  101:aload_0         
	//   51  102:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   52  105:iconst_2        
	//   53  106:invokevirtual   #269 <Method void ParsableBitArray.skipBits(int)>
		int j1 = serviceBlockPacket.readBits(6);
	//   54  109:aload_0         
	//   55  110:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   56  113:bipush          6
	//   57  115:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   58  118:istore          6
		serviceBlockPacket.skipBits(2);
	//   59  120:aload_0         
	//   60  121:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   61  124:iconst_2        
	//   62  125:invokevirtual   #269 <Method void ParsableBitArray.skipBits(int)>
		cuebuilder.defineWindow(flag, flag1, flag2, i, flag3, j, k, i1, j1, l, serviceBlockPacket.readBits(3), serviceBlockPacket.readBits(3));
	//   63  128:aload           11
	//   64  130:iload           7
	//   65  132:iload           8
	//   66  134:iload           9
	//   67  136:iload_1         
	//   68  137:iload           10
	//   69  139:iload_2         
	//   70  140:iload_3         
	//   71  141:iload           5
	//   72  143:iload           6
	//   73  145:iload           4
	//   74  147:aload_0         
	//   75  148:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   76  151:iconst_3        
	//   77  152:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   78  155:aload_0         
	//   79  156:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   80  159:iconst_3        
	//   81  160:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   82  163:invokevirtual   #329 <Method void Cea708Decoder$CueBuilder.defineWindow(boolean, boolean, boolean, int, boolean, int, int, int, int, int, int, int)>
	//   83  166:return          
	}

	private void handleG0Character(int i)
	{
		if(i == 127)
	//*   0    0:iload_1         
	//*   1    1:bipush          127
	//*   2    3:icmpne          17
		{
			currentCueBuilder.append('\u266B');
	//    3    6:aload_0         
	//    4    7:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//    5   10:sipush          9835
	//    6   13:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
			return;
	//    7   16:return          
		} else
		{
			currentCueBuilder.append((char)(i & 0xff));
	//    8   17:aload_0         
	//    9   18:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//   10   21:iload_1         
	//   11   22:sipush          255
	//   12   25:iand            
	//   13   26:int2char        
	//   14   27:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
			return;
	//   15   30:return          
		}
	}

	private void handleG1Character(int i)
	{
		currentCueBuilder.append((char)(i & 0xff));
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//    2    4:iload_1         
	//    3    5:sipush          255
	//    4    8:iand            
	//    5    9:int2char        
	//    6   10:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
	//    7   13:return          
	}

	private void handleG2Character(int i)
	{
		if(i != 37)
	//*   0    0:iload_1         
	//*   1    1:bipush          37
	//*   2    3:icmpeq          499
		{
			if(i != 42)
	//*   3    6:iload_1         
	//*   4    7:bipush          42
	//*   5    9:icmpeq          488
			{
				if(i != 44)
	//*   6   12:iload_1         
	//*   7   13:bipush          44
	//*   8   15:icmpeq          477
				{
					if(i != 63)
	//*   9   18:iload_1         
	//*  10   19:bipush          63
	//*  11   21:icmpeq          466
					{
						switch(i)
	//*  12   24:iload_1         
						{
	//*  13   25:tableswitch     32 33: default 48
	//	               32 456
	//	               33 445
						default:
							switch(i)
	//*  14   48:iload_1         
							{
	//*  15   49:tableswitch     48 53: default 88
	//	               48 434
	//	               49 423
	//	               50 412
	//	               51 401
	//	               52 390
	//	               53 379
							default:
								switch(i)
	//*  16   88:iload_1         
								{
	//*  17   89:tableswitch     57 58: default 112
	//	               57 368
	//	               58 357
								default:
									switch(i)
	//*  18  112:iload_1         
									{
	//*  19  113:tableswitch     60 61: default 136
	//	               60 346
	//	               61 335
									default:
										switch(i)
	//*  20  136:iload_1         
										{
	//*  21  137:tableswitch     118 127: default 192
	//	               118 324
	//	               119 313
	//	               120 302
	//	               121 291
	//	               122 280
	//	               123 269
	//	               124 258
	//	               125 247
	//	               126 236
	//	               127 225
										default:
											StringBuilder stringbuilder = new StringBuilder();
	//   22  192:new             #246 <Class StringBuilder>
	//   23  195:dup             
	//   24  196:invokespecial   #247 <Method void StringBuilder()>
	//   25  199:astore_2        
											stringbuilder.append("Invalid G2 character: ");
	//   26  200:aload_2         
	//   27  201:ldc2            #334 <String "Invalid G2 character: ">
	//   28  204:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//   29  207:pop             
											stringbuilder.append(i);
	//   30  208:aload_2         
	//   31  209:iload_1         
	//   32  210:invokevirtual   #256 <Method StringBuilder StringBuilder.append(int)>
	//   33  213:pop             
											Log.w("Cea708Decoder", stringbuilder.toString());
	//   34  214:ldc1            #161 <String "Cea708Decoder">
	//   35  216:aload_2         
	//   36  217:invokevirtual   #260 <Method String StringBuilder.toString()>
	//   37  220:invokestatic    #266 <Method int Log.w(String, String)>
	//   38  223:pop             
											return;
	//   39  224:return          

										case 127: // '\177'
											currentCueBuilder.append('\u250C');
	//   40  225:aload_0         
	//   41  226:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//   42  229:sipush          9484
	//   43  232:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
											return;
	//   44  235:return          

										case 126: // '~'
											currentCueBuilder.append('\u2518');
	//   45  236:aload_0         
	//   46  237:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//   47  240:sipush          9496
	//   48  243:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
											return;
	//   49  246:return          

										case 125: // '}'
											currentCueBuilder.append('\u2500');
	//   50  247:aload_0         
	//   51  248:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//   52  251:sipush          9472
	//   53  254:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
											return;
	//   54  257:return          

										case 124: // '|'
											currentCueBuilder.append('\u2514');
	//   55  258:aload_0         
	//   56  259:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//   57  262:sipush          9492
	//   58  265:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
											return;
	//   59  268:return          

										case 123: // '{'
											currentCueBuilder.append('\u2510');
	//   60  269:aload_0         
	//   61  270:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//   62  273:sipush          9488
	//   63  276:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
											return;
	//   64  279:return          

										case 122: // 'z'
											currentCueBuilder.append('\u2502');
	//   65  280:aload_0         
	//   66  281:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//   67  284:sipush          9474
	//   68  287:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
											return;
	//   69  290:return          

										case 121: // 'y'
											currentCueBuilder.append('\u215E');
	//   70  291:aload_0         
	//   71  292:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//   72  295:sipush          8542
	//   73  298:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
											return;
	//   74  301:return          

										case 120: // 'x'
											currentCueBuilder.append('\u215D');
	//   75  302:aload_0         
	//   76  303:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//   77  306:sipush          8541
	//   78  309:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
											return;
	//   79  312:return          

										case 119: // 'w'
											currentCueBuilder.append('\u215C');
	//   80  313:aload_0         
	//   81  314:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//   82  317:sipush          8540
	//   83  320:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
											return;
	//   84  323:return          

										case 118: // 'v'
											currentCueBuilder.append('\u215B');
	//   85  324:aload_0         
	//   86  325:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//   87  328:sipush          8539
	//   88  331:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
											return;
	//   89  334:return          
										}

									case 61: // '='
										currentCueBuilder.append('\u2120');
	//   90  335:aload_0         
	//   91  336:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//   92  339:sipush          8480
	//   93  342:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
										return;
	//   94  345:return          

									case 60: // '<'
										currentCueBuilder.append('\u0153');
	//   95  346:aload_0         
	//   96  347:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//   97  350:sipush          339
	//   98  353:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
										return;
	//   99  356:return          
									}

								case 58: // ':'
									currentCueBuilder.append('\u0161');
	//  100  357:aload_0         
	//  101  358:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//  102  361:sipush          353
	//  103  364:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
									return;
	//  104  367:return          

								case 57: // '9'
									currentCueBuilder.append('\u2122');
	//  105  368:aload_0         
	//  106  369:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//  107  372:sipush          8482
	//  108  375:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
									return;
	//  109  378:return          
								}

							case 53: // '5'
								currentCueBuilder.append('\u2022');
	//  110  379:aload_0         
	//  111  380:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//  112  383:sipush          8226
	//  113  386:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
								return;
	//  114  389:return          

							case 52: // '4'
								currentCueBuilder.append('\u201D');
	//  115  390:aload_0         
	//  116  391:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//  117  394:sipush          8221
	//  118  397:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
								return;
	//  119  400:return          

							case 51: // '3'
								currentCueBuilder.append('\u201C');
	//  120  401:aload_0         
	//  121  402:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//  122  405:sipush          8220
	//  123  408:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
								return;
	//  124  411:return          

							case 50: // '2'
								currentCueBuilder.append('\u2019');
	//  125  412:aload_0         
	//  126  413:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//  127  416:sipush          8217
	//  128  419:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
								return;
	//  129  422:return          

							case 49: // '1'
								currentCueBuilder.append('\u2018');
	//  130  423:aload_0         
	//  131  424:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//  132  427:sipush          8216
	//  133  430:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
								return;
	//  134  433:return          

							case 48: // '0'
								currentCueBuilder.append('\u2588');
	//  135  434:aload_0         
	//  136  435:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//  137  438:sipush          9608
	//  138  441:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
								return;
	//  139  444:return          
							}

						case 33: // '!'
							currentCueBuilder.append('\240');
	//  140  445:aload_0         
	//  141  446:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//  142  449:sipush          160
	//  143  452:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
							return;
	//  144  455:return          

						case 32: // ' '
							currentCueBuilder.append(' ');
	//  145  456:aload_0         
	//  146  457:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//  147  460:bipush          32
	//  148  462:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
							return;
	//  149  465:return          
						}
					} else
					{
						currentCueBuilder.append('\u0178');
	//  150  466:aload_0         
	//  151  467:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//  152  470:sipush          376
	//  153  473:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
						return;
	//  154  476:return          
					}
				} else
				{
					currentCueBuilder.append('\u0152');
	//  155  477:aload_0         
	//  156  478:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//  157  481:sipush          338
	//  158  484:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
					return;
	//  159  487:return          
				}
			} else
			{
				currentCueBuilder.append('\u0160');
	//  160  488:aload_0         
	//  161  489:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//  162  492:sipush          352
	//  163  495:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
				return;
	//  164  498:return          
			}
		} else
		{
			currentCueBuilder.append('\u2026');
	//  165  499:aload_0         
	//  166  500:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//  167  503:sipush          8230
	//  168  506:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
			return;
	//  169  509:return          
		}
	}

	private void handleG3Character(int i)
	{
		if(i == 160)
	//*   0    0:iload_1         
	//*   1    1:sipush          160
	//*   2    4:icmpne          18
		{
			currentCueBuilder.append('\u33C4');
	//    3    7:aload_0         
	//    4    8:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//    5   11:sipush          13252
	//    6   14:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
			return;
	//    7   17:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   18:new             #246 <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #247 <Method void StringBuilder()>
	//   11   25:astore_2        
			stringbuilder.append("Invalid G3 character: ");
	//   12   26:aload_2         
	//   13   27:ldc2            #337 <String "Invalid G3 character: ">
	//   14   30:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
			stringbuilder.append(i);
	//   16   34:aload_2         
	//   17   35:iload_1         
	//   18   36:invokevirtual   #256 <Method StringBuilder StringBuilder.append(int)>
	//   19   39:pop             
			Log.w("Cea708Decoder", stringbuilder.toString());
	//   20   40:ldc1            #161 <String "Cea708Decoder">
	//   21   42:aload_2         
	//   22   43:invokevirtual   #260 <Method String StringBuilder.toString()>
	//   23   46:invokestatic    #266 <Method int Log.w(String, String)>
	//   24   49:pop             
			currentCueBuilder.append('_');
	//   25   50:aload_0         
	//   26   51:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//   27   54:bipush          95
	//   28   56:invokevirtual   #276 <Method void Cea708Decoder$CueBuilder.append(char)>
			return;
	//   29   59:return          
		}
	}

	private void handleSetPenAttributes()
	{
		int i = serviceBlockPacket.readBits(4);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//    2    4:iconst_4        
	//    3    5:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//    4    8:istore_1        
		int j = serviceBlockPacket.readBits(2);
	//    5    9:aload_0         
	//    6   10:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//    7   13:iconst_2        
	//    8   14:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//    9   17:istore_2        
		int k = serviceBlockPacket.readBits(2);
	//   10   18:aload_0         
	//   11   19:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   12   22:iconst_2        
	//   13   23:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   14   26:istore_3        
		boolean flag = serviceBlockPacket.readBit();
	//   15   27:aload_0         
	//   16   28:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   17   31:invokevirtual   #309 <Method boolean ParsableBitArray.readBit()>
	//   18   34:istore          6
		boolean flag1 = serviceBlockPacket.readBit();
	//   19   36:aload_0         
	//   20   37:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   21   40:invokevirtual   #309 <Method boolean ParsableBitArray.readBit()>
	//   22   43:istore          7
		int l = serviceBlockPacket.readBits(3);
	//   23   45:aload_0         
	//   24   46:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   25   49:iconst_3        
	//   26   50:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   27   53:istore          4
		int i1 = serviceBlockPacket.readBits(3);
	//   28   55:aload_0         
	//   29   56:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   30   59:iconst_3        
	//   31   60:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   32   63:istore          5
		currentCueBuilder.setPenAttributes(i, j, k, flag, flag1, l, i1);
	//   33   65:aload_0         
	//   34   66:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//   35   69:iload_1         
	//   36   70:iload_2         
	//   37   71:iload_3         
	//   38   72:iload           6
	//   39   74:iload           7
	//   40   76:iload           4
	//   41   78:iload           5
	//   42   80:invokevirtual   #341 <Method void Cea708Decoder$CueBuilder.setPenAttributes(int, int, int, boolean, boolean, int, int)>
	//   43   83:return          
	}

	private void handleSetPenColor()
	{
		int i = serviceBlockPacket.readBits(2);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//    2    4:iconst_2        
	//    3    5:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//    4    8:istore_1        
		i = CueBuilder.getArgbColorFromCeaColor(serviceBlockPacket.readBits(2), serviceBlockPacket.readBits(2), serviceBlockPacket.readBits(2), i);
	//    5    9:aload_0         
	//    6   10:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//    7   13:iconst_2        
	//    8   14:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//    9   17:aload_0         
	//   10   18:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   11   21:iconst_2        
	//   12   22:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   13   25:aload_0         
	//   14   26:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   15   29:iconst_2        
	//   16   30:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   17   33:iload_1         
	//   18   34:invokestatic    #345 <Method int Cea708Decoder$CueBuilder.getArgbColorFromCeaColor(int, int, int, int)>
	//   19   37:istore_1        
		int j = serviceBlockPacket.readBits(2);
	//   20   38:aload_0         
	//   21   39:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   22   42:iconst_2        
	//   23   43:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   24   46:istore_2        
		j = CueBuilder.getArgbColorFromCeaColor(serviceBlockPacket.readBits(2), serviceBlockPacket.readBits(2), serviceBlockPacket.readBits(2), j);
	//   25   47:aload_0         
	//   26   48:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   27   51:iconst_2        
	//   28   52:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   29   55:aload_0         
	//   30   56:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   31   59:iconst_2        
	//   32   60:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   33   63:aload_0         
	//   34   64:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   35   67:iconst_2        
	//   36   68:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   37   71:iload_2         
	//   38   72:invokestatic    #345 <Method int Cea708Decoder$CueBuilder.getArgbColorFromCeaColor(int, int, int, int)>
	//   39   75:istore_2        
		serviceBlockPacket.skipBits(2);
	//   40   76:aload_0         
	//   41   77:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   42   80:iconst_2        
	//   43   81:invokevirtual   #269 <Method void ParsableBitArray.skipBits(int)>
		int k = CueBuilder.getArgbColorFromCeaColor(serviceBlockPacket.readBits(2), serviceBlockPacket.readBits(2), serviceBlockPacket.readBits(2));
	//   44   84:aload_0         
	//   45   85:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   46   88:iconst_2        
	//   47   89:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   48   92:aload_0         
	//   49   93:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   50   96:iconst_2        
	//   51   97:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   52  100:aload_0         
	//   53  101:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   54  104:iconst_2        
	//   55  105:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   56  108:invokestatic    #348 <Method int Cea708Decoder$CueBuilder.getArgbColorFromCeaColor(int, int, int)>
	//   57  111:istore_3        
		currentCueBuilder.setPenColor(i, j, k);
	//   58  112:aload_0         
	//   59  113:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//   60  116:iload_1         
	//   61  117:iload_2         
	//   62  118:iload_3         
	//   63  119:invokevirtual   #352 <Method void Cea708Decoder$CueBuilder.setPenColor(int, int, int)>
	//   64  122:return          
	}

	private void handleSetPenLocation()
	{
		serviceBlockPacket.skipBits(4);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//    2    4:iconst_4        
	//    3    5:invokevirtual   #269 <Method void ParsableBitArray.skipBits(int)>
		int i = serviceBlockPacket.readBits(4);
	//    4    8:aload_0         
	//    5    9:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//    6   12:iconst_4        
	//    7   13:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//    8   16:istore_1        
		serviceBlockPacket.skipBits(2);
	//    9   17:aload_0         
	//   10   18:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   11   21:iconst_2        
	//   12   22:invokevirtual   #269 <Method void ParsableBitArray.skipBits(int)>
		int j = serviceBlockPacket.readBits(6);
	//   13   25:aload_0         
	//   14   26:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   15   29:bipush          6
	//   16   31:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   17   34:istore_2        
		currentCueBuilder.setPenLocation(i, j);
	//   18   35:aload_0         
	//   19   36:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//   20   39:iload_1         
	//   21   40:iload_2         
	//   22   41:invokevirtual   #356 <Method void Cea708Decoder$CueBuilder.setPenLocation(int, int)>
	//   23   44:return          
	}

	private void handleSetWindowAttributes()
	{
		int i = serviceBlockPacket.readBits(2);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//    2    4:iconst_2        
	//    3    5:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//    4    8:istore_1        
		int k = CueBuilder.getArgbColorFromCeaColor(serviceBlockPacket.readBits(2), serviceBlockPacket.readBits(2), serviceBlockPacket.readBits(2), i);
	//    5    9:aload_0         
	//    6   10:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//    7   13:iconst_2        
	//    8   14:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//    9   17:aload_0         
	//   10   18:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   11   21:iconst_2        
	//   12   22:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   13   25:aload_0         
	//   14   26:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   15   29:iconst_2        
	//   16   30:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   17   33:iload_1         
	//   18   34:invokestatic    #345 <Method int Cea708Decoder$CueBuilder.getArgbColorFromCeaColor(int, int, int, int)>
	//   19   37:istore_3        
		int j = serviceBlockPacket.readBits(2);
	//   20   38:aload_0         
	//   21   39:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   22   42:iconst_2        
	//   23   43:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   24   46:istore_2        
		int l = CueBuilder.getArgbColorFromCeaColor(serviceBlockPacket.readBits(2), serviceBlockPacket.readBits(2), serviceBlockPacket.readBits(2));
	//   25   47:aload_0         
	//   26   48:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   27   51:iconst_2        
	//   28   52:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   29   55:aload_0         
	//   30   56:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   31   59:iconst_2        
	//   32   60:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   33   63:aload_0         
	//   34   64:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   35   67:iconst_2        
	//   36   68:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   37   71:invokestatic    #348 <Method int Cea708Decoder$CueBuilder.getArgbColorFromCeaColor(int, int, int)>
	//   38   74:istore          4
		i = j;
	//   39   76:iload_2         
	//   40   77:istore_1        
		if(serviceBlockPacket.readBit())
	//*  41   78:aload_0         
	//*  42   79:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//*  43   82:invokevirtual   #309 <Method boolean ParsableBitArray.readBit()>
	//*  44   85:ifeq            92
			i = j | 4;
	//   45   88:iload_2         
	//   46   89:iconst_4        
	//   47   90:ior             
	//   48   91:istore_1        
		boolean flag = serviceBlockPacket.readBit();
	//   49   92:aload_0         
	//   50   93:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   51   96:invokevirtual   #309 <Method boolean ParsableBitArray.readBit()>
	//   52   99:istore          7
		j = serviceBlockPacket.readBits(2);
	//   53  101:aload_0         
	//   54  102:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   55  105:iconst_2        
	//   56  106:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   57  109:istore_2        
		int i1 = serviceBlockPacket.readBits(2);
	//   58  110:aload_0         
	//   59  111:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   60  114:iconst_2        
	//   61  115:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   62  118:istore          5
		int j1 = serviceBlockPacket.readBits(2);
	//   63  120:aload_0         
	//   64  121:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   65  124:iconst_2        
	//   66  125:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   67  128:istore          6
		serviceBlockPacket.skipBits(8);
	//   68  130:aload_0         
	//   69  131:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   70  134:bipush          8
	//   71  136:invokevirtual   #269 <Method void ParsableBitArray.skipBits(int)>
		currentCueBuilder.setWindowAttributes(k, l, flag, i, j, i1, j1);
	//   72  139:aload_0         
	//   73  140:getfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
	//   74  143:iload_3         
	//   75  144:iload           4
	//   76  146:iload           7
	//   77  148:iload_1         
	//   78  149:iload_2         
	//   79  150:iload           5
	//   80  152:iload           6
	//   81  154:invokevirtual   #360 <Method void Cea708Decoder$CueBuilder.setWindowAttributes(int, int, boolean, int, int, int, int)>
	//   82  157:return          
	}

	private void processCurrentPacket()
	{
		boolean flag;
		if(currentDtvCcPacket.currentIndex != currentDtvCcPacket.packetSize * 2 - 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #206 <Field Cea708Decoder$DtvCcPacket currentDtvCcPacket>
	//*   2    4:getfield        #363 <Field int Cea708Decoder$DtvCcPacket.currentIndex>
	//*   3    7:aload_0         
	//*   4    8:getfield        #206 <Field Cea708Decoder$DtvCcPacket currentDtvCcPacket>
	//*   5   11:getfield        #366 <Field int Cea708Decoder$DtvCcPacket.packetSize>
	//*   6   14:iconst_2        
	//*   7   15:imul            
	//*   8   16:iconst_1        
	//*   9   17:isub            
	//*  10   18:icmpeq          121
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   21:new             #246 <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #247 <Method void StringBuilder()>
	//   14   28:astore          4
			stringbuilder.append("DtvCcPacket ended prematurely; size is ");
	//   15   30:aload           4
	//   16   32:ldc2            #368 <String "DtvCcPacket ended prematurely; size is ">
	//   17   35:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
			stringbuilder.append(currentDtvCcPacket.packetSize * 2 - 1);
	//   19   39:aload           4
	//   20   41:aload_0         
	//   21   42:getfield        #206 <Field Cea708Decoder$DtvCcPacket currentDtvCcPacket>
	//   22   45:getfield        #366 <Field int Cea708Decoder$DtvCcPacket.packetSize>
	//   23   48:iconst_2        
	//   24   49:imul            
	//   25   50:iconst_1        
	//   26   51:isub            
	//   27   52:invokevirtual   #256 <Method StringBuilder StringBuilder.append(int)>
	//   28   55:pop             
			stringbuilder.append(", but current index is ");
	//   29   56:aload           4
	//   30   58:ldc2            #370 <String ", but current index is ">
	//   31   61:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//   32   64:pop             
			stringbuilder.append(currentDtvCcPacket.currentIndex);
	//   33   65:aload           4
	//   34   67:aload_0         
	//   35   68:getfield        #206 <Field Cea708Decoder$DtvCcPacket currentDtvCcPacket>
	//   36   71:getfield        #363 <Field int Cea708Decoder$DtvCcPacket.currentIndex>
	//   37   74:invokevirtual   #256 <Method StringBuilder StringBuilder.append(int)>
	//   38   77:pop             
			stringbuilder.append(" (sequence number ");
	//   39   78:aload           4
	//   40   80:ldc2            #372 <String " (sequence number ">
	//   41   83:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//   42   86:pop             
			stringbuilder.append(currentDtvCcPacket.sequenceNumber);
	//   43   87:aload           4
	//   44   89:aload_0         
	//   45   90:getfield        #206 <Field Cea708Decoder$DtvCcPacket currentDtvCcPacket>
	//   46   93:getfield        #375 <Field int Cea708Decoder$DtvCcPacket.sequenceNumber>
	//   47   96:invokevirtual   #256 <Method StringBuilder StringBuilder.append(int)>
	//   48   99:pop             
			stringbuilder.append("); ignoring packet");
	//   49  100:aload           4
	//   50  102:ldc2            #377 <String "); ignoring packet">
	//   51  105:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//   52  108:pop             
			Log.w("Cea708Decoder", stringbuilder.toString());
	//   53  109:ldc1            #161 <String "Cea708Decoder">
	//   54  111:aload           4
	//   55  113:invokevirtual   #260 <Method String StringBuilder.toString()>
	//   56  116:invokestatic    #266 <Method int Log.w(String, String)>
	//   57  119:pop             
			return;
	//   58  120:return          
		}
		serviceBlockPacket.reset(currentDtvCcPacket.packetData, currentDtvCcPacket.currentIndex);
	//   59  121:aload_0         
	//   60  122:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   61  125:aload_0         
	//   62  126:getfield        #206 <Field Cea708Decoder$DtvCcPacket currentDtvCcPacket>
	//   63  129:getfield        #381 <Field byte[] Cea708Decoder$DtvCcPacket.packetData>
	//   64  132:aload_0         
	//   65  133:getfield        #206 <Field Cea708Decoder$DtvCcPacket currentDtvCcPacket>
	//   66  136:getfield        #363 <Field int Cea708Decoder$DtvCcPacket.currentIndex>
	//   67  139:invokevirtual   #384 <Method void ParsableBitArray.reset(byte[], int)>
		int j = serviceBlockPacket.readBits(3);
	//   68  142:aload_0         
	//   69  143:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   70  146:iconst_3        
	//   71  147:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   72  150:istore_2        
		int l = serviceBlockPacket.readBits(5);
	//   73  151:aload_0         
	//   74  152:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   75  155:iconst_5        
	//   76  156:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   77  159:istore_3        
		int i = j;
	//   78  160:iload_2         
	//   79  161:istore_1        
		if(j == 7)
	//*  80  162:iload_2         
	//*  81  163:bipush          7
	//*  82  165:icmpne          188
		{
			serviceBlockPacket.skipBits(2);
	//   83  168:aload_0         
	//   84  169:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   85  172:iconst_2        
	//   86  173:invokevirtual   #269 <Method void ParsableBitArray.skipBits(int)>
			i = j + serviceBlockPacket.readBits(6);
	//   87  176:iload_2         
	//   88  177:aload_0         
	//   89  178:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//   90  181:bipush          6
	//   91  183:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//   92  186:iadd            
	//   93  187:istore_1        
		}
		if(l == 0)
	//*  94  188:iload_3         
	//*  95  189:ifne            242
		{
			if(i != 0)
	//*  96  192:iload_1         
	//*  97  193:ifeq            241
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   98  196:new             #246 <Class StringBuilder>
	//   99  199:dup             
	//  100  200:invokespecial   #247 <Method void StringBuilder()>
	//  101  203:astore          4
				stringbuilder1.append("serviceNumber is non-zero (");
	//  102  205:aload           4
	//  103  207:ldc2            #386 <String "serviceNumber is non-zero (">
	//  104  210:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//  105  213:pop             
				stringbuilder1.append(i);
	//  106  214:aload           4
	//  107  216:iload_1         
	//  108  217:invokevirtual   #256 <Method StringBuilder StringBuilder.append(int)>
	//  109  220:pop             
				stringbuilder1.append(") when blockSize is 0");
	//  110  221:aload           4
	//  111  223:ldc2            #388 <String ") when blockSize is 0">
	//  112  226:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//  113  229:pop             
				Log.w("Cea708Decoder", stringbuilder1.toString());
	//  114  230:ldc1            #161 <String "Cea708Decoder">
	//  115  232:aload           4
	//  116  234:invokevirtual   #260 <Method String StringBuilder.toString()>
	//  117  237:invokestatic    #266 <Method int Log.w(String, String)>
	//  118  240:pop             
			}
			return;
	//  119  241:return          
		}
		if(i != selectedServiceNumber)
	//* 120  242:iload_1         
	//* 121  243:aload_0         
	//* 122  244:getfield        #194 <Field int selectedServiceNumber>
	//* 123  247:icmpeq          251
			return;
	//  124  250:return          
		flag = false;
	//  125  251:iconst_0        
	//  126  252:istore_1        
_L8:
		int k;
		if(serviceBlockPacket.bitsLeft() <= 0)
			break; /* Loop/switch isn't completed */
	//  127  253:aload_0         
	//  128  254:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//  129  257:invokevirtual   #392 <Method int ParsableBitArray.bitsLeft()>
	//  130  260:ifle            485
		k = serviceBlockPacket.readBits(8);
	//  131  263:aload_0         
	//  132  264:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//  133  267:bipush          8
	//  134  269:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//  135  272:istore_2        
		if(k == 16) goto _L2; else goto _L1
	//  136  273:iload_2         
	//  137  274:bipush          16
	//  138  276:icmpeq          378
_L1:
		if(k <= 31)
	//* 139  279:iload_2         
	//* 140  280:bipush          31
	//* 141  282:icmpgt          293
		{
			handleC0Command(k);
	//  142  285:aload_0         
	//  143  286:iload_2         
	//  144  287:invokespecial   #394 <Method void handleC0Command(int)>
			continue; /* Loop/switch isn't completed */
	//  145  290:goto            253
		}
		if(k > 127) goto _L4; else goto _L3
	//  146  293:iload_2         
	//  147  294:bipush          127
	//  148  296:icmpgt          309
_L3:
		handleG0Character(k);
	//  149  299:aload_0         
	//  150  300:iload_2         
	//  151  301:invokespecial   #396 <Method void handleG0Character(int)>
_L6:
		flag = true;
	//  152  304:iconst_1        
	//  153  305:istore_1        
		continue; /* Loop/switch isn't completed */
	//  154  306:goto            253
_L4:
		if(k <= 159)
	//* 155  309:iload_2         
	//* 156  310:sipush          159
	//* 157  313:icmpgt          324
		{
			handleC1Command(k);
	//  158  316:aload_0         
	//  159  317:iload_2         
	//  160  318:invokespecial   #398 <Method void handleC1Command(int)>
			continue; /* Loop/switch isn't completed */
	//  161  321:goto            304
		}
		if(k <= 255)
	//* 162  324:iload_2         
	//* 163  325:sipush          255
	//* 164  328:icmpgt          339
		{
			handleG1Character(k);
	//  165  331:aload_0         
	//  166  332:iload_2         
	//  167  333:invokespecial   #400 <Method void handleG1Character(int)>
			continue; /* Loop/switch isn't completed */
	//  168  336:goto            304
		}
		StringBuilder stringbuilder2 = new StringBuilder();
	//  169  339:new             #246 <Class StringBuilder>
	//  170  342:dup             
	//  171  343:invokespecial   #247 <Method void StringBuilder()>
	//  172  346:astore          4
		stringbuilder2.append("Invalid base command: ");
	//  173  348:aload           4
	//  174  350:ldc2            #402 <String "Invalid base command: ">
	//  175  353:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//  176  356:pop             
		stringbuilder2.append(k);
	//  177  357:aload           4
	//  178  359:iload_2         
	//  179  360:invokevirtual   #256 <Method StringBuilder StringBuilder.append(int)>
	//  180  363:pop             
		Log.w("Cea708Decoder", stringbuilder2.toString());
	//  181  364:ldc1            #161 <String "Cea708Decoder">
	//  182  366:aload           4
	//  183  368:invokevirtual   #260 <Method String StringBuilder.toString()>
	//  184  371:invokestatic    #266 <Method int Log.w(String, String)>
	//  185  374:pop             
		continue; /* Loop/switch isn't completed */
	//  186  375:goto            253
_L2:
		k = serviceBlockPacket.readBits(8);
	//  187  378:aload_0         
	//  188  379:getfield        #192 <Field ParsableBitArray serviceBlockPacket>
	//  189  382:bipush          8
	//  190  384:invokevirtual   #325 <Method int ParsableBitArray.readBits(int)>
	//  191  387:istore_2        
		if(k <= 31)
	//* 192  388:iload_2         
	//* 193  389:bipush          31
	//* 194  391:icmpgt          402
		{
			handleC2Command(k);
	//  195  394:aload_0         
	//  196  395:iload_2         
	//  197  396:invokespecial   #404 <Method void handleC2Command(int)>
			continue; /* Loop/switch isn't completed */
	//  198  399:goto            253
		}
		if(k <= 127)
	//* 199  402:iload_2         
	//* 200  403:bipush          127
	//* 201  405:icmpgt          416
		{
			handleG2Character(k);
	//  202  408:aload_0         
	//  203  409:iload_2         
	//  204  410:invokespecial   #406 <Method void handleG2Character(int)>
			continue; /* Loop/switch isn't completed */
	//  205  413:goto            304
		}
		if(k <= 159)
	//* 206  416:iload_2         
	//* 207  417:sipush          159
	//* 208  420:icmpgt          431
		{
			handleC3Command(k);
	//  209  423:aload_0         
	//  210  424:iload_2         
	//  211  425:invokespecial   #408 <Method void handleC3Command(int)>
			continue; /* Loop/switch isn't completed */
	//  212  428:goto            253
		}
		if(k > 255)
			break; /* Loop/switch isn't completed */
	//  213  431:iload_2         
	//  214  432:sipush          255
	//  215  435:icmpgt          446
		handleG3Character(k);
	//  216  438:aload_0         
	//  217  439:iload_2         
	//  218  440:invokespecial   #410 <Method void handleG3Character(int)>
		if(true) goto _L6; else goto _L5
	//  219  443:goto            304
_L5:
		StringBuilder stringbuilder3 = new StringBuilder();
	//  220  446:new             #246 <Class StringBuilder>
	//  221  449:dup             
	//  222  450:invokespecial   #247 <Method void StringBuilder()>
	//  223  453:astore          4
		stringbuilder3.append("Invalid extended command: ");
	//  224  455:aload           4
	//  225  457:ldc2            #412 <String "Invalid extended command: ">
	//  226  460:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//  227  463:pop             
		stringbuilder3.append(k);
	//  228  464:aload           4
	//  229  466:iload_2         
	//  230  467:invokevirtual   #256 <Method StringBuilder StringBuilder.append(int)>
	//  231  470:pop             
		Log.w("Cea708Decoder", stringbuilder3.toString());
	//  232  471:ldc1            #161 <String "Cea708Decoder">
	//  233  473:aload           4
	//  234  475:invokevirtual   #260 <Method String StringBuilder.toString()>
	//  235  478:invokestatic    #266 <Method int Log.w(String, String)>
	//  236  481:pop             
		if(true) goto _L8; else goto _L7
	//  237  482:goto            253
_L7:
		if(flag)
	//* 238  485:iload_1         
	//* 239  486:ifeq            497
			cues = getDisplayCues();
	//  240  489:aload_0         
	//  241  490:aload_0         
	//  242  491:invokespecial   #281 <Method List getDisplayCues()>
	//  243  494:putfield        #283 <Field List cues>
		return;
	//  244  497:return          
	}

	private void resetCueBuilders()
	{
		for(int i = 0; i < 8; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:bipush          8
	//*   4    5:icmpge          24
			cueBuilders[i].reset();
	//    5    8:aload_0         
	//    6    9:getfield        #196 <Field Cea708Decoder$CueBuilder[] cueBuilders>
	//    7   12:iload_1         
	//    8   13:aaload          
	//    9   14:invokevirtual   #312 <Method void Cea708Decoder$CueBuilder.reset()>

	//   10   17:iload_1         
	//   11   18:iconst_1        
	//   12   19:iadd            
	//   13   20:istore_1        
	//*  14   21:goto            2
	//   15   24:return          
	}

	protected Subtitle createSubtitle()
	{
		lastCues = cues;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #283 <Field List cues>
	//    3    5:putfield        #416 <Field List lastCues>
		return ((Subtitle) (new CeaSubtitle(cues)));
	//    4    8:new             #418 <Class CeaSubtitle>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #283 <Field List cues>
	//    8   16:invokespecial   #420 <Method void CeaSubtitle(List)>
	//    9   19:areturn         
	}

	protected void decode(SubtitleInputBuffer subtitleinputbuffer)
	{
		byte abyte0[] = subtitleinputbuffer.data.array();
	//    0    0:aload_1         
	//    1    1:getfield        #428 <Field ByteBuffer SubtitleInputBuffer.data>
	//    2    4:invokevirtual   #434 <Method byte[] ByteBuffer.array()>
	//    3    7:astore          7
		ccData.reset(abyte0, subtitleinputbuffer.data.limit());
	//    4    9:aload_0         
	//    5   10:getfield        #187 <Field ParsableByteArray ccData>
	//    6   13:aload           7
	//    7   15:aload_1         
	//    8   16:getfield        #428 <Field ByteBuffer SubtitleInputBuffer.data>
	//    9   19:invokevirtual   #437 <Method int ByteBuffer.limit()>
	//   10   22:invokevirtual   #438 <Method void ParsableByteArray.reset(byte[], int)>
		do
		{
			if(ccData.bytesLeft() < 3)
				break;
	//   11   25:aload_0         
	//   12   26:getfield        #187 <Field ParsableByteArray ccData>
	//   13   29:invokevirtual   #441 <Method int ParsableByteArray.bytesLeft()>
	//   14   32:iconst_3        
	//   15   33:icmplt          334
			int i = ccData.readUnsignedByte() & 7;
	//   16   36:aload_0         
	//   17   37:getfield        #187 <Field ParsableByteArray ccData>
	//   18   40:invokevirtual   #444 <Method int ParsableByteArray.readUnsignedByte()>
	//   19   43:bipush          7
	//   20   45:iand            
	//   21   46:istore          4
			int l = i & 3;
	//   22   48:iload           4
	//   23   50:iconst_3        
	//   24   51:iand            
	//   25   52:istore          5
			boolean flag1 = false;
	//   26   54:iconst_0        
	//   27   55:istore          6
			boolean flag;
			if((i & 4) == 4)
	//*  28   57:iload           4
	//*  29   59:iconst_4        
	//*  30   60:iand            
	//*  31   61:iconst_4        
	//*  32   62:icmpne          71
				flag = true;
	//   33   65:iconst_1        
	//   34   66:istore          4
			else
	//*  35   68:goto            74
				flag = false;
	//   36   71:iconst_0        
	//   37   72:istore          4
			byte byte0 = (byte)ccData.readUnsignedByte();
	//   38   74:aload_0         
	//   39   75:getfield        #187 <Field ParsableByteArray ccData>
	//   40   78:invokevirtual   #444 <Method int ParsableByteArray.readUnsignedByte()>
	//   41   81:int2byte        
	//   42   82:istore_2        
			byte byte1 = (byte)ccData.readUnsignedByte();
	//   43   83:aload_0         
	//   44   84:getfield        #187 <Field ParsableByteArray ccData>
	//   45   87:invokevirtual   #444 <Method int ParsableByteArray.readUnsignedByte()>
	//   46   90:int2byte        
	//   47   91:istore_3        
			if(l != 2 && l != 3 || !flag)
	//*  48   92:iload           5
	//*  49   94:iconst_2        
	//*  50   95:icmpeq          107
	//*  51   98:iload           5
	//*  52  100:iconst_3        
	//*  53  101:icmpeq          107
	//*  54  104:goto            25
	//*  55  107:iload           4
	//*  56  109:ifne            115
				continue;
	//   57  112:goto            25
			if(l == 3)
	//*  58  115:iload           5
	//*  59  117:iconst_3        
	//*  60  118:icmpne          203
			{
				finalizeCurrentPacket();
	//   61  121:aload_0         
	//   62  122:invokespecial   #446 <Method void finalizeCurrentPacket()>
				l = byte0 & 0x3f;
	//   63  125:iload_2         
	//   64  126:bipush          63
	//   65  128:iand            
	//   66  129:istore          5
				int j = l;
	//   67  131:iload           5
	//   68  133:istore          4
				if(l == 0)
	//*  69  135:iload           5
	//*  70  137:ifne            144
					j = 64;
	//   71  140:bipush          64
	//   72  142:istore          4
				currentDtvCcPacket = new DtvCcPacket((byte0 & 0xc0) >> 6, j);
	//   73  144:aload_0         
	//   74  145:new             #9   <Class Cea708Decoder$DtvCcPacket>
	//   75  148:dup             
	//   76  149:iload_2         
	//   77  150:sipush          192
	//   78  153:iand            
	//   79  154:bipush          6
	//   80  156:ishr            
	//   81  157:iload           4
	//   82  159:invokespecial   #448 <Method void Cea708Decoder$DtvCcPacket(int, int)>
	//   83  162:putfield        #206 <Field Cea708Decoder$DtvCcPacket currentDtvCcPacket>
				subtitleinputbuffer = ((SubtitleInputBuffer) (currentDtvCcPacket.packetData));
	//   84  165:aload_0         
	//   85  166:getfield        #206 <Field Cea708Decoder$DtvCcPacket currentDtvCcPacket>
	//   86  169:getfield        #381 <Field byte[] Cea708Decoder$DtvCcPacket.packetData>
	//   87  172:astore_1        
				DtvCcPacket dtvccpacket = currentDtvCcPacket;
	//   88  173:aload_0         
	//   89  174:getfield        #206 <Field Cea708Decoder$DtvCcPacket currentDtvCcPacket>
	//   90  177:astore          7
				j = dtvccpacket.currentIndex;
	//   91  179:aload           7
	//   92  181:getfield        #363 <Field int Cea708Decoder$DtvCcPacket.currentIndex>
	//   93  184:istore          4
				dtvccpacket.currentIndex = j + 1;
	//   94  186:aload           7
	//   95  188:iload           4
	//   96  190:iconst_1        
	//   97  191:iadd            
	//   98  192:putfield        #363 <Field int Cea708Decoder$DtvCcPacket.currentIndex>
				subtitleinputbuffer[j] = byte1;
	//   99  195:aload_1         
	//  100  196:iload           4
	//  101  198:iload_3         
	//  102  199:bastore         
			} else
	//* 103  200:goto            306
			{
				if(l == 2)
	//* 104  203:iload           5
	//* 105  205:iconst_2        
	//* 106  206:icmpne          212
					flag1 = true;
	//  107  209:iconst_1        
	//  108  210:istore          6
				Assertions.checkArgument(flag1);
	//  109  212:iload           6
	//  110  214:invokestatic    #453 <Method void Assertions.checkArgument(boolean)>
				if(currentDtvCcPacket == null)
	//* 111  217:aload_0         
	//* 112  218:getfield        #206 <Field Cea708Decoder$DtvCcPacket currentDtvCcPacket>
	//* 113  221:ifnonnull       236
				{
					Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
	//  114  224:ldc1            #161 <String "Cea708Decoder">
	//  115  226:ldc2            #455 <String "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START">
	//  116  229:invokestatic    #458 <Method int Log.e(String, String)>
	//  117  232:pop             
					continue;
	//  118  233:goto            25
				}
				subtitleinputbuffer = ((SubtitleInputBuffer) (currentDtvCcPacket.packetData));
	//  119  236:aload_0         
	//  120  237:getfield        #206 <Field Cea708Decoder$DtvCcPacket currentDtvCcPacket>
	//  121  240:getfield        #381 <Field byte[] Cea708Decoder$DtvCcPacket.packetData>
	//  122  243:astore_1        
				DtvCcPacket dtvccpacket1 = currentDtvCcPacket;
	//  123  244:aload_0         
	//  124  245:getfield        #206 <Field Cea708Decoder$DtvCcPacket currentDtvCcPacket>
	//  125  248:astore          7
				int k = dtvccpacket1.currentIndex;
	//  126  250:aload           7
	//  127  252:getfield        #363 <Field int Cea708Decoder$DtvCcPacket.currentIndex>
	//  128  255:istore          4
				dtvccpacket1.currentIndex = k + 1;
	//  129  257:aload           7
	//  130  259:iload           4
	//  131  261:iconst_1        
	//  132  262:iadd            
	//  133  263:putfield        #363 <Field int Cea708Decoder$DtvCcPacket.currentIndex>
				subtitleinputbuffer[k] = byte0;
	//  134  266:aload_1         
	//  135  267:iload           4
	//  136  269:iload_2         
	//  137  270:bastore         
				subtitleinputbuffer = ((SubtitleInputBuffer) (currentDtvCcPacket.packetData));
	//  138  271:aload_0         
	//  139  272:getfield        #206 <Field Cea708Decoder$DtvCcPacket currentDtvCcPacket>
	//  140  275:getfield        #381 <Field byte[] Cea708Decoder$DtvCcPacket.packetData>
	//  141  278:astore_1        
				dtvccpacket1 = currentDtvCcPacket;
	//  142  279:aload_0         
	//  143  280:getfield        #206 <Field Cea708Decoder$DtvCcPacket currentDtvCcPacket>
	//  144  283:astore          7
				k = dtvccpacket1.currentIndex;
	//  145  285:aload           7
	//  146  287:getfield        #363 <Field int Cea708Decoder$DtvCcPacket.currentIndex>
	//  147  290:istore          4
				dtvccpacket1.currentIndex = k + 1;
	//  148  292:aload           7
	//  149  294:iload           4
	//  150  296:iconst_1        
	//  151  297:iadd            
	//  152  298:putfield        #363 <Field int Cea708Decoder$DtvCcPacket.currentIndex>
				subtitleinputbuffer[k] = byte1;
	//  153  301:aload_1         
	//  154  302:iload           4
	//  155  304:iload_3         
	//  156  305:bastore         
			}
			if(currentDtvCcPacket.currentIndex == currentDtvCcPacket.packetSize * 2 - 1)
	//* 157  306:aload_0         
	//* 158  307:getfield        #206 <Field Cea708Decoder$DtvCcPacket currentDtvCcPacket>
	//* 159  310:getfield        #363 <Field int Cea708Decoder$DtvCcPacket.currentIndex>
	//* 160  313:aload_0         
	//* 161  314:getfield        #206 <Field Cea708Decoder$DtvCcPacket currentDtvCcPacket>
	//* 162  317:getfield        #366 <Field int Cea708Decoder$DtvCcPacket.packetSize>
	//* 163  320:iconst_2        
	//* 164  321:imul            
	//* 165  322:iconst_1        
	//* 166  323:isub            
	//* 167  324:icmpne          25
				finalizeCurrentPacket();
	//  168  327:aload_0         
	//  169  328:invokespecial   #446 <Method void finalizeCurrentPacket()>
		} while(true);
	//  170  331:goto            25
	//  171  334:return          
	}

	public volatile SubtitleInputBuffer dequeueInputBuffer()
		throws SubtitleDecoderException
	{
		return super.dequeueInputBuffer();
	//    0    0:aload_0         
	//    1    1:invokespecial   #464 <Method SubtitleInputBuffer CeaDecoder.dequeueInputBuffer()>
	//    2    4:areturn         
	}

	public volatile SubtitleOutputBuffer dequeueOutputBuffer()
		throws SubtitleDecoderException
	{
		return super.dequeueOutputBuffer();
	//    0    0:aload_0         
	//    1    1:invokespecial   #469 <Method SubtitleOutputBuffer CeaDecoder.dequeueOutputBuffer()>
	//    2    4:areturn         
	}

	public void flush()
	{
		super.flush();
	//    0    0:aload_0         
	//    1    1:invokespecial   #472 <Method void CeaDecoder.flush()>
		cues = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #283 <Field List cues>
		lastCues = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #416 <Field List lastCues>
		currentWindow = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #291 <Field int currentWindow>
		currentCueBuilder = cueBuilders[currentWindow];
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #196 <Field Cea708Decoder$CueBuilder[] cueBuilders>
	//   14   24:aload_0         
	//   15   25:getfield        #291 <Field int currentWindow>
	//   16   28:aaload          
	//   17   29:putfield        #199 <Field Cea708Decoder$CueBuilder currentCueBuilder>
		resetCueBuilders();
	//   18   32:aload_0         
	//   19   33:invokespecial   #202 <Method void resetCueBuilders()>
		currentDtvCcPacket = null;
	//   20   36:aload_0         
	//   21   37:aconst_null     
	//   22   38:putfield        #206 <Field Cea708Decoder$DtvCcPacket currentDtvCcPacket>
	//   23   41:return          
	}

	public String getName()
	{
		return "Cea708Decoder";
	//    0    0:ldc1            #161 <String "Cea708Decoder">
	//    1    2:areturn         
	}

	protected boolean isNewSubtitleDataAvailable()
	{
		return cues != lastCues;
	//    0    0:aload_0         
	//    1    1:getfield        #283 <Field List cues>
	//    2    4:aload_0         
	//    3    5:getfield        #416 <Field List lastCues>
	//    4    8:if_acmpeq       13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public volatile void queueInputBuffer(SubtitleInputBuffer subtitleinputbuffer)
		throws SubtitleDecoderException
	{
		super.queueInputBuffer(subtitleinputbuffer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #477 <Method void CeaDecoder.queueInputBuffer(SubtitleInputBuffer)>
	//    3    5:return          
	}

	public volatile void release()
	{
		super.release();
	//    0    0:aload_0         
	//    1    1:invokespecial   #480 <Method void CeaDecoder.release()>
	//    2    4:return          
	}

	public volatile void setPositionUs(long l)
	{
		super.setPositionUs(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #484 <Method void CeaDecoder.setPositionUs(long)>
	//    3    5:return          
	}

	private static final int CC_VALID_FLAG = 4;
	private static final int CHARACTER_BIG_CARONS = 42;
	private static final int CHARACTER_BIG_OE = 44;
	private static final int CHARACTER_BOLD_BULLET = 53;
	private static final int CHARACTER_CLOSE_DOUBLE_QUOTE = 52;
	private static final int CHARACTER_CLOSE_SINGLE_QUOTE = 50;
	private static final int CHARACTER_DIAERESIS_Y = 63;
	private static final int CHARACTER_ELLIPSIS = 37;
	private static final int CHARACTER_FIVE_EIGHTHS = 120;
	private static final int CHARACTER_HORIZONTAL_BORDER = 125;
	private static final int CHARACTER_LOWER_LEFT_BORDER = 124;
	private static final int CHARACTER_LOWER_RIGHT_BORDER = 126;
	private static final int CHARACTER_MN = 127;
	private static final int CHARACTER_NBTSP = 33;
	private static final int CHARACTER_ONE_EIGHTH = 118;
	private static final int CHARACTER_OPEN_DOUBLE_QUOTE = 51;
	private static final int CHARACTER_OPEN_SINGLE_QUOTE = 49;
	private static final int CHARACTER_SEVEN_EIGHTHS = 121;
	private static final int CHARACTER_SM = 61;
	private static final int CHARACTER_SMALL_CARONS = 58;
	private static final int CHARACTER_SMALL_OE = 60;
	private static final int CHARACTER_SOLID_BLOCK = 48;
	private static final int CHARACTER_THREE_EIGHTHS = 119;
	private static final int CHARACTER_TM = 57;
	private static final int CHARACTER_TSP = 32;
	private static final int CHARACTER_UPPER_LEFT_BORDER = 127;
	private static final int CHARACTER_UPPER_RIGHT_BORDER = 123;
	private static final int CHARACTER_VERTICAL_BORDER = 122;
	private static final int COMMAND_BS = 8;
	private static final int COMMAND_CLW = 136;
	private static final int COMMAND_CR = 13;
	private static final int COMMAND_CW0 = 128;
	private static final int COMMAND_CW1 = 129;
	private static final int COMMAND_CW2 = 130;
	private static final int COMMAND_CW3 = 131;
	private static final int COMMAND_CW4 = 132;
	private static final int COMMAND_CW5 = 133;
	private static final int COMMAND_CW6 = 134;
	private static final int COMMAND_CW7 = 135;
	private static final int COMMAND_DF0 = 152;
	private static final int COMMAND_DF1 = 153;
	private static final int COMMAND_DF2 = 154;
	private static final int COMMAND_DF3 = 155;
	private static final int COMMAND_DF4 = 156;
	private static final int COMMAND_DF5 = 157;
	private static final int COMMAND_DF6 = 158;
	private static final int COMMAND_DF7 = 159;
	private static final int COMMAND_DLC = 142;
	private static final int COMMAND_DLW = 140;
	private static final int COMMAND_DLY = 141;
	private static final int COMMAND_DSW = 137;
	private static final int COMMAND_ETX = 3;
	private static final int COMMAND_EXT1 = 16;
	private static final int COMMAND_EXT1_END = 23;
	private static final int COMMAND_EXT1_START = 17;
	private static final int COMMAND_FF = 12;
	private static final int COMMAND_HCR = 14;
	private static final int COMMAND_HDW = 138;
	private static final int COMMAND_NUL = 0;
	private static final int COMMAND_P16_END = 31;
	private static final int COMMAND_P16_START = 24;
	private static final int COMMAND_RST = 143;
	private static final int COMMAND_SPA = 144;
	private static final int COMMAND_SPC = 145;
	private static final int COMMAND_SPL = 146;
	private static final int COMMAND_SWA = 151;
	private static final int COMMAND_TGW = 139;
	private static final int DTVCC_PACKET_DATA = 2;
	private static final int DTVCC_PACKET_START = 3;
	private static final int GROUP_C0_END = 31;
	private static final int GROUP_C1_END = 159;
	private static final int GROUP_C2_END = 31;
	private static final int GROUP_C3_END = 159;
	private static final int GROUP_G0_END = 127;
	private static final int GROUP_G1_END = 255;
	private static final int GROUP_G2_END = 127;
	private static final int GROUP_G3_END = 255;
	private static final int NUM_WINDOWS = 8;
	private static final String TAG = "Cea708Decoder";
	private final ParsableByteArray ccData = new ParsableByteArray();
	private final CueBuilder cueBuilders[] = new CueBuilder[8];
	private List cues;
	private CueBuilder currentCueBuilder;
	private DtvCcPacket currentDtvCcPacket;
	private int currentWindow;
	private List lastCues;
	private final int selectedServiceNumber;
	private final ParsableBitArray serviceBlockPacket = new ParsableBitArray();
}
