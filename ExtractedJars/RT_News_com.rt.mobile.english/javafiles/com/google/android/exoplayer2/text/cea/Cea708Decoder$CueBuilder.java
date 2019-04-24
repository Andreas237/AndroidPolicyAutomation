// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.cea;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.*;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.text.cea:
//			Cea708Decoder, Cea708Cue

private static final class Cea708Decoder$CueBuilder
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
	//	               0 64
	//	               1 64
	//	               2 76
	//	               3 71
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
	//	               0 168
	//	               1 160
	//	               2 152
	//	               3 168
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

	public Cea708Decoder$CueBuilder()
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
