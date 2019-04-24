// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.cea;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.*;
import com.google.android.exoplayer2.text.*;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.text.cea:
//			CeaDecoder, CeaSubtitle

public final class Cea608Decoder extends CeaDecoder
{
	private static class CueBuilder
	{

		private static void setColorSpan(SpannableStringBuilder spannablestringbuilder, int i, int j, int k)
		{
			if(k == -1)
		//*   0    0:iload_3         
		//*   1    1:iconst_m1       
		//*   2    2:icmpne          6
			{
				return;
		//    3    5:return          
			} else
			{
				spannablestringbuilder.setSpan(((Object) (new ForegroundColorSpan(k))), i, j, 33);
		//    4    6:aload_0         
		//    5    7:new             #56  <Class ForegroundColorSpan>
		//    6   10:dup             
		//    7   11:iload_3         
		//    8   12:invokespecial   #58  <Method void ForegroundColorSpan(int)>
		//    9   15:iload_1         
		//   10   16:iload_2         
		//   11   17:bipush          33
		//   12   19:invokevirtual   #64  <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
				return;
		//   13   22:return          
			}
		}

		private static void setItalicSpan(SpannableStringBuilder spannablestringbuilder, int i, int j)
		{
			spannablestringbuilder.setSpan(((Object) (new StyleSpan(2))), i, j, 33);
		//    0    0:aload_0         
		//    1    1:new             #68  <Class StyleSpan>
		//    2    4:dup             
		//    3    5:iconst_2        
		//    4    6:invokespecial   #69  <Method void StyleSpan(int)>
		//    5    9:iload_1         
		//    6   10:iload_2         
		//    7   11:bipush          33
		//    8   13:invokevirtual   #64  <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		//    9   16:return          
		}

		private static void setUnderlineSpan(SpannableStringBuilder spannablestringbuilder, int i, int j)
		{
			spannablestringbuilder.setSpan(((Object) (new UnderlineSpan())), i, j, 33);
		//    0    0:aload_0         
		//    1    1:new             #72  <Class UnderlineSpan>
		//    2    4:dup             
		//    3    5:invokespecial   #73  <Method void UnderlineSpan()>
		//    4    8:iload_1         
		//    5    9:iload_2         
		//    6   10:bipush          33
		//    7   12:invokevirtual   #64  <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		//    8   15:return          
		}

		public void append(char c)
		{
			captionStringBuilder.append(c);
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field StringBuilder captionStringBuilder>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #78  <Method StringBuilder StringBuilder.append(char)>
		//    4    8:pop             
		//    5    9:return          
		}

		public void backspace()
		{
			int j = captionStringBuilder.length();
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field StringBuilder captionStringBuilder>
		//    2    4:invokevirtual   #83  <Method int StringBuilder.length()>
		//    3    7:istore_2        
			if(j > 0)
		//*   4    8:iload_2         
		//*   5    9:ifle            79
			{
				captionStringBuilder.delete(j - 1, j);
		//    6   12:aload_0         
		//    7   13:getfield        #44  <Field StringBuilder captionStringBuilder>
		//    8   16:iload_2         
		//    9   17:iconst_1        
		//   10   18:isub            
		//   11   19:iload_2         
		//   12   20:invokevirtual   #87  <Method StringBuilder StringBuilder.delete(int, int)>
		//   13   23:pop             
				int i = cueStyles.size() - 1;
		//   14   24:aload_0         
		//   15   25:getfield        #37  <Field List cueStyles>
		//   16   28:invokeinterface #92  <Method int List.size()>
		//   17   33:iconst_1        
		//   18   34:isub            
		//   19   35:istore_1        
				do
				{
					if(i < 0)
						break;
		//   20   36:iload_1         
		//   21   37:iflt            79
					CueStyle cuestyle = (CueStyle)cueStyles.get(i);
		//   22   40:aload_0         
		//   23   41:getfield        #37  <Field List cueStyles>
		//   24   44:iload_1         
		//   25   45:invokeinterface #96  <Method Object List.get(int)>
		//   26   50:checkcast       #9   <Class Cea608Decoder$CueBuilder$CueStyle>
		//   27   53:astore_3        
					if(cuestyle.start != j)
						break;
		//   28   54:aload_3         
		//   29   55:getfield        #99  <Field int Cea608Decoder$CueBuilder$CueStyle.start>
		//   30   58:iload_2         
		//   31   59:icmpne          79
					cuestyle.start = cuestyle.start - 1;
		//   32   62:aload_3         
		//   33   63:aload_3         
		//   34   64:getfield        #99  <Field int Cea608Decoder$CueBuilder$CueStyle.start>
		//   35   67:iconst_1        
		//   36   68:isub            
		//   37   69:putfield        #99  <Field int Cea608Decoder$CueBuilder$CueStyle.start>
					i--;
		//   38   72:iload_1         
		//   39   73:iconst_1        
		//   40   74:isub            
		//   41   75:istore_1        
				} while(true);
		//   42   76:goto            36
			}
		//   43   79:return          
		}

		public Cue build()
		{
			SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
		//    0    0:new             #60  <Class SpannableStringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #102 <Method void SpannableStringBuilder()>
		//    3    7:astore          5
			for(int i = 0; i < rolledUpCaptions.size(); i++)
		//*   4    9:iconst_0        
		//*   5   10:istore_2        
		//*   6   11:iload_2         
		//*   7   12:aload_0         
		//*   8   13:getfield        #39  <Field List rolledUpCaptions>
		//*   9   16:invokeinterface #92  <Method int List.size()>
		//*  10   21:icmpge          58
			{
				spannablestringbuilder.append((CharSequence)rolledUpCaptions.get(i));
		//   11   24:aload           5
		//   12   26:aload_0         
		//   13   27:getfield        #39  <Field List rolledUpCaptions>
		//   14   30:iload_2         
		//   15   31:invokeinterface #96  <Method Object List.get(int)>
		//   16   36:checkcast       #104 <Class CharSequence>
		//   17   39:invokevirtual   #107 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
		//   18   42:pop             
				spannablestringbuilder.append('\n');
		//   19   43:aload           5
		//   20   45:bipush          10
		//   21   47:invokevirtual   #110 <Method SpannableStringBuilder SpannableStringBuilder.append(char)>
		//   22   50:pop             
			}

		//   23   51:iload_2         
		//   24   52:iconst_1        
		//   25   53:iadd            
		//   26   54:istore_2        
		//*  27   55:goto            11
			spannablestringbuilder.append(((CharSequence) (buildSpannableString())));
		//   28   58:aload           5
		//   29   60:aload_0         
		//   30   61:invokevirtual   #114 <Method SpannableString buildSpannableString()>
		//   31   64:invokevirtual   #107 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
		//   32   67:pop             
			if(spannablestringbuilder.length() == 0)
		//*  33   68:aload           5
		//*  34   70:invokevirtual   #115 <Method int SpannableStringBuilder.length()>
		//*  35   73:ifne            78
				return null;
		//   36   76:aconst_null     
		//   37   77:areturn         
			int j = indent + tabOffset;
		//   38   78:aload_0         
		//   39   79:getfield        #117 <Field int indent>
		//   40   82:aload_0         
		//   41   83:getfield        #119 <Field int tabOffset>
		//   42   86:iadd            
		//   43   87:istore_2        
			int k = 32 - j - spannablestringbuilder.length();
		//   44   88:bipush          32
		//   45   90:iload_2         
		//   46   91:isub            
		//   47   92:aload           5
		//   48   94:invokevirtual   #115 <Method int SpannableStringBuilder.length()>
		//   49   97:isub            
		//   50   98:istore_3        
			int l = j - k;
		//   51   99:iload_2         
		//   52  100:iload_3         
		//   53  101:isub            
		//   54  102:istore          4
			float f;
			if(captionMode == 2 && (Math.abs(l) < 3 || k < 0))
		//*  55  104:aload_0         
		//*  56  105:getfield        #121 <Field int captionMode>
		//*  57  108:iconst_2        
		//*  58  109:icmpne          133
		//*  59  112:iload           4
		//*  60  114:invokestatic    #127 <Method int Math.abs(int)>
		//*  61  117:iconst_3        
		//*  62  118:icmplt          125
		//*  63  121:iload_3         
		//*  64  122:ifge            133
			{
				f = 0.5F;
		//   65  125:ldc1            #128 <Float 0.5F>
		//   66  127:fstore_1        
				j = 1;
		//   67  128:iconst_1        
		//   68  129:istore_2        
			} else
		//*  69  130:goto            182
			if(captionMode == 2 && l > 0)
		//*  70  133:aload_0         
		//*  71  134:getfield        #121 <Field int captionMode>
		//*  72  137:iconst_2        
		//*  73  138:icmpne          166
		//*  74  141:iload           4
		//*  75  143:ifle            166
			{
				f = ((float)(32 - k) / 32F) * 0.8F + 0.1F;
		//   76  146:bipush          32
		//   77  148:iload_3         
		//   78  149:isub            
		//   79  150:i2f             
		//   80  151:ldc1            #129 <Float 32F>
		//   81  153:fdiv            
		//   82  154:ldc1            #130 <Float 0.8F>
		//   83  156:fmul            
		//   84  157:ldc1            #131 <Float 0.1F>
		//   85  159:fadd            
		//   86  160:fstore_1        
				j = 2;
		//   87  161:iconst_2        
		//   88  162:istore_2        
			} else
		//*  89  163:goto            182
			{
				f = (float)j / 32F;
		//   90  166:iload_2         
		//   91  167:i2f             
		//   92  168:ldc1            #129 <Float 32F>
		//   93  170:fdiv            
		//   94  171:fstore_1        
				j = 0;
		//   95  172:iconst_0        
		//   96  173:istore_2        
				f = f * 0.8F + 0.1F;
		//   97  174:fload_1         
		//   98  175:ldc1            #130 <Float 0.8F>
		//   99  177:fmul            
		//  100  178:ldc1            #131 <Float 0.1F>
		//  101  180:fadd            
		//  102  181:fstore_1        
			}
			if(captionMode != 1 && row <= 7)
		//* 103  182:aload_0         
		//* 104  183:getfield        #121 <Field int captionMode>
		//* 105  186:iconst_1        
		//* 106  187:icmpeq          213
		//* 107  190:aload_0         
		//* 108  191:getfield        #133 <Field int row>
		//* 109  194:bipush          7
		//* 110  196:icmple          202
		//* 111  199:goto            213
			{
				k = row;
		//  112  202:aload_0         
		//  113  203:getfield        #133 <Field int row>
		//  114  206:istore_3        
				l = 0;
		//  115  207:iconst_0        
		//  116  208:istore          4
			} else
		//* 117  210:goto            226
			{
				k = row - 15 - 2;
		//  118  213:aload_0         
		//  119  214:getfield        #133 <Field int row>
		//  120  217:bipush          15
		//  121  219:isub            
		//  122  220:iconst_2        
		//  123  221:isub            
		//  124  222:istore_3        
				l = 2;
		//  125  223:iconst_2        
		//  126  224:istore          4
			}
			return new Cue(((CharSequence) (spannablestringbuilder)), android.text.Layout.Alignment.ALIGN_NORMAL, k, 1, l, f, j, 1.401298E-45F);
		//  127  226:new             #135 <Class Cue>
		//  128  229:dup             
		//  129  230:aload           5
		//  130  232:getstatic       #141 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_NORMAL>
		//  131  235:iload_3         
		//  132  236:i2f             
		//  133  237:iconst_1        
		//  134  238:iload           4
		//  135  240:fload_1         
		//  136  241:iload_2         
		//  137  242:ldc1            #142 <Float 1.401298E-45F>
		//  138  244:invokespecial   #145 <Method void Cue(CharSequence, android.text.Layout$Alignment, float, int, int, float, int, float)>
		//  139  247:areturn         
		}

		public SpannableString buildSpannableString()
		{
			SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(((CharSequence) (captionStringBuilder)));
		//    0    0:new             #60  <Class SpannableStringBuilder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #44  <Field StringBuilder captionStringBuilder>
		//    4    8:invokespecial   #148 <Method void SpannableStringBuilder(CharSequence)>
		//    5   11:astore          16
			int l3 = spannablestringbuilder.length();
		//    6   13:aload           16
		//    7   15:invokevirtual   #115 <Method int SpannableStringBuilder.length()>
		//    8   18:istore          13
			int j3 = 0;
		//    9   20:iconst_0        
		//   10   21:istore          11
			int l = j3;
		//   11   23:iload           11
		//   12   25:istore_3        
			int k3 = l;
		//   13   26:iload_3         
		//   14   27:istore          12
			int l2 = -1;
		//   15   29:iconst_m1       
		//   16   30:istore          9
			int i = l2;
		//   17   32:iload           9
		//   18   34:istore_1        
			int j1 = i;
		//   19   35:iload_1         
		//   20   36:istore          4
			int k = j1;
		//   21   38:iload           4
		//   22   40:istore_2        
			int j2 = j1;
		//   23   41:iload           4
		//   24   43:istore          7
			int i2 = l;
		//   25   45:iload_3         
		//   26   46:istore          6
			int k2 = i;
		//   27   48:iload_1         
		//   28   49:istore          8
			do
			{
				if(j3 >= cueStyles.size())
					break;
		//   29   51:iload           11
		//   30   53:aload_0         
		//   31   54:getfield        #37  <Field List cueStyles>
		//   32   57:invokeinterface #92  <Method int List.size()>
		//   33   62:icmpge          362
				CueStyle cuestyle = (CueStyle)cueStyles.get(j3);
		//   34   65:aload_0         
		//   35   66:getfield        #37  <Field List cueStyles>
		//   36   69:iload           11
		//   37   71:invokeinterface #96  <Method Object List.get(int)>
		//   38   76:checkcast       #9   <Class Cea608Decoder$CueBuilder$CueStyle>
		//   39   79:astore          17
				boolean flag = cuestyle.underline;
		//   40   81:aload           17
		//   41   83:getfield        #152 <Field boolean Cea608Decoder$CueBuilder$CueStyle.underline>
		//   42   86:istore          15
				int i1 = cuestyle.style;
		//   43   88:aload           17
		//   44   90:getfield        #155 <Field int Cea608Decoder$CueBuilder$CueStyle.style>
		//   45   93:istore_3        
				int j = k;
		//   46   94:iload_2         
		//   47   95:istore_1        
				int i3 = k3;
		//   48   96:iload           12
		//   49   98:istore          10
				if(i1 != 8)
		//*  50  100:iload_3         
		//*  51  101:bipush          8
		//*  52  103:icmpeq          139
				{
					if(i1 == 7)
		//*  53  106:iload_3         
		//*  54  107:bipush          7
		//*  55  109:icmpne          117
						j = 1;
		//   56  112:iconst_1        
		//   57  113:istore_1        
					else
		//*  58  114:goto            119
						j = 0;
		//   59  117:iconst_0        
		//   60  118:istore_1        
					if(i1 != 7)
		//*  61  119:iload_3         
		//*  62  120:bipush          7
		//*  63  122:icmpne          128
		//*  64  125:goto            134
						k = Cea608Decoder.STYLE_COLORS[i1];
		//   65  128:invokestatic    #159 <Method int[] Cea608Decoder.access$000()>
		//   66  131:iload_3         
		//   67  132:iaload          
		//   68  133:istore_2        
					i3 = j;
		//   69  134:iload_1         
		//   70  135:istore          10
					j = k;
		//   71  137:iload_2         
		//   72  138:istore_1        
				}
				i1 = cuestyle.start;
		//   73  139:aload           17
		//   74  141:getfield        #99  <Field int Cea608Decoder$CueBuilder$CueStyle.start>
		//   75  144:istore_3        
				int i4 = j3 + 1;
		//   76  145:iload           11
		//   77  147:iconst_1        
		//   78  148:iadd            
		//   79  149:istore          14
				if(i4 < cueStyles.size())
		//*  80  151:iload           14
		//*  81  153:aload_0         
		//*  82  154:getfield        #37  <Field List cueStyles>
		//*  83  157:invokeinterface #92  <Method int List.size()>
		//*  84  162:icmpge          186
					k = ((CueStyle)cueStyles.get(i4)).start;
		//   85  165:aload_0         
		//   86  166:getfield        #37  <Field List cueStyles>
		//   87  169:iload           14
		//   88  171:invokeinterface #96  <Method Object List.get(int)>
		//   89  176:checkcast       #9   <Class Cea608Decoder$CueBuilder$CueStyle>
		//   90  179:getfield        #99  <Field int Cea608Decoder$CueBuilder$CueStyle.start>
		//   91  182:istore_2        
				else
		//*  92  183:goto            189
					k = l3;
		//   93  186:iload           13
		//   94  188:istore_2        
				if(i1 == k)
		//*  95  189:iload_3         
		//*  96  190:iload_2         
		//*  97  191:icmpne          207
				{
					j3 = i4;
		//   98  194:iload           14
		//   99  196:istore          11
					k = j;
		//  100  198:iload_1         
		//  101  199:istore_2        
					k3 = i3;
		//  102  200:iload           10
		//  103  202:istore          12
				} else
		//* 104  204:goto            51
				{
					int k1;
					if(l2 != -1 && !flag)
		//* 105  207:iload           9
		//* 106  209:iconst_m1       
		//* 107  210:icmpeq          232
		//* 108  213:iload           15
		//* 109  215:ifne            232
					{
						setUnderlineSpan(spannablestringbuilder, l2, i1);
		//  110  218:aload           16
		//  111  220:iload           9
		//  112  222:iload_3         
		//  113  223:invokestatic    #161 <Method void setUnderlineSpan(SpannableStringBuilder, int, int)>
						k1 = -1;
		//  114  226:iconst_m1       
		//  115  227:istore          4
					} else
		//* 116  229:goto            254
					{
						k1 = l2;
		//  117  232:iload           9
		//  118  234:istore          4
						if(l2 == -1)
		//* 119  236:iload           9
		//* 120  238:iconst_m1       
		//* 121  239:icmpne          254
						{
							k1 = l2;
		//  122  242:iload           9
		//  123  244:istore          4
							if(flag)
		//* 124  246:iload           15
		//* 125  248:ifeq            254
								k1 = i1;
		//  126  251:iload_3         
		//  127  252:istore          4
						}
					}
					int l1;
					if(k2 != -1 && i3 == 0)
		//* 128  254:iload           8
		//* 129  256:iconst_m1       
		//* 130  257:icmpeq          279
		//* 131  260:iload           10
		//* 132  262:ifne            279
					{
						setItalicSpan(spannablestringbuilder, k2, i1);
		//  133  265:aload           16
		//  134  267:iload           8
		//  135  269:iload_3         
		//  136  270:invokestatic    #163 <Method void setItalicSpan(SpannableStringBuilder, int, int)>
						l1 = -1;
		//  137  273:iconst_m1       
		//  138  274:istore          5
					} else
		//* 139  276:goto            301
					{
						l1 = k2;
		//  140  279:iload           8
		//  141  281:istore          5
						if(k2 == -1)
		//* 142  283:iload           8
		//* 143  285:iconst_m1       
		//* 144  286:icmpne          301
						{
							l1 = k2;
		//  145  289:iload           8
		//  146  291:istore          5
							if(i3 != 0)
		//* 147  293:iload           10
		//* 148  295:ifeq            301
								l1 = i1;
		//  149  298:iload_3         
		//  150  299:istore          5
						}
					}
					j3 = i4;
		//  151  301:iload           14
		//  152  303:istore          11
					l2 = k1;
		//  153  305:iload           4
		//  154  307:istore          9
					k2 = l1;
		//  155  309:iload           5
		//  156  311:istore          8
					k = j;
		//  157  313:iload_1         
		//  158  314:istore_2        
					k3 = i3;
		//  159  315:iload           10
		//  160  317:istore          12
					if(j != j2)
		//* 161  319:iload_1         
		//* 162  320:iload           7
		//* 163  322:icmpeq          51
					{
						setColorSpan(spannablestringbuilder, i2, i1, j2);
		//  164  325:aload           16
		//  165  327:iload           6
		//  166  329:iload_3         
		//  167  330:iload           7
		//  168  332:invokestatic    #165 <Method void setColorSpan(SpannableStringBuilder, int, int, int)>
						j2 = j;
		//  169  335:iload_1         
		//  170  336:istore          7
						j3 = i4;
		//  171  338:iload           14
		//  172  340:istore          11
						l2 = k1;
		//  173  342:iload           4
		//  174  344:istore          9
						k2 = l1;
		//  175  346:iload           5
		//  176  348:istore          8
						i2 = i1;
		//  177  350:iload_3         
		//  178  351:istore          6
						k = j;
		//  179  353:iload_1         
		//  180  354:istore_2        
						k3 = i3;
		//  181  355:iload           10
		//  182  357:istore          12
					}
				}
			} while(true);
		//  183  359:goto            51
			if(l2 != -1 && l2 != l3)
		//* 184  362:iload           9
		//* 185  364:iconst_m1       
		//* 186  365:icmpeq          384
		//* 187  368:iload           9
		//* 188  370:iload           13
		//* 189  372:icmpeq          384
				setUnderlineSpan(spannablestringbuilder, l2, l3);
		//  190  375:aload           16
		//  191  377:iload           9
		//  192  379:iload           13
		//  193  381:invokestatic    #161 <Method void setUnderlineSpan(SpannableStringBuilder, int, int)>
			if(k2 != -1 && k2 != l3)
		//* 194  384:iload           8
		//* 195  386:iconst_m1       
		//* 196  387:icmpeq          406
		//* 197  390:iload           8
		//* 198  392:iload           13
		//* 199  394:icmpeq          406
				setItalicSpan(spannablestringbuilder, k2, l3);
		//  200  397:aload           16
		//  201  399:iload           8
		//  202  401:iload           13
		//  203  403:invokestatic    #163 <Method void setItalicSpan(SpannableStringBuilder, int, int)>
			if(i2 != l3)
		//* 204  406:iload           6
		//* 205  408:iload           13
		//* 206  410:icmpeq          424
				setColorSpan(spannablestringbuilder, i2, l3, j2);
		//  207  413:aload           16
		//  208  415:iload           6
		//  209  417:iload           13
		//  210  419:iload           7
		//  211  421:invokestatic    #165 <Method void setColorSpan(SpannableStringBuilder, int, int, int)>
			return new SpannableString(((CharSequence) (spannablestringbuilder)));
		//  212  424:new             #167 <Class SpannableString>
		//  213  427:dup             
		//  214  428:aload           16
		//  215  430:invokespecial   #168 <Method void SpannableString(CharSequence)>
		//  216  433:areturn         
		}

		public int getRow()
		{
			return row;
		//    0    0:aload_0         
		//    1    1:getfield        #133 <Field int row>
		//    2    4:ireturn         
		}

		public boolean isEmpty()
		{
			return cueStyles.isEmpty() && rolledUpCaptions.isEmpty() && captionStringBuilder.length() == 0;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field List cueStyles>
		//    2    4:invokeinterface #173 <Method boolean List.isEmpty()>
		//    3    9:ifeq            36
		//    4   12:aload_0         
		//    5   13:getfield        #39  <Field List rolledUpCaptions>
		//    6   16:invokeinterface #173 <Method boolean List.isEmpty()>
		//    7   21:ifeq            36
		//    8   24:aload_0         
		//    9   25:getfield        #44  <Field StringBuilder captionStringBuilder>
		//   10   28:invokevirtual   #83  <Method int StringBuilder.length()>
		//   11   31:ifne            36
		//   12   34:iconst_1        
		//   13   35:ireturn         
		//   14   36:iconst_0        
		//   15   37:ireturn         
		}

		public void reset(int i)
		{
			captionMode = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #121 <Field int captionMode>
			cueStyles.clear();
		//    3    5:aload_0         
		//    4    6:getfield        #37  <Field List cueStyles>
		//    5    9:invokeinterface #176 <Method void List.clear()>
			rolledUpCaptions.clear();
		//    6   14:aload_0         
		//    7   15:getfield        #39  <Field List rolledUpCaptions>
		//    8   18:invokeinterface #176 <Method void List.clear()>
			captionStringBuilder.setLength(0);
		//    9   23:aload_0         
		//   10   24:getfield        #44  <Field StringBuilder captionStringBuilder>
		//   11   27:iconst_0        
		//   12   28:invokevirtual   #179 <Method void StringBuilder.setLength(int)>
			row = 15;
		//   13   31:aload_0         
		//   14   32:bipush          15
		//   15   34:putfield        #133 <Field int row>
			indent = 0;
		//   16   37:aload_0         
		//   17   38:iconst_0        
		//   18   39:putfield        #117 <Field int indent>
			tabOffset = 0;
		//   19   42:aload_0         
		//   20   43:iconst_0        
		//   21   44:putfield        #119 <Field int tabOffset>
		//   22   47:return          
		}

		public void rollUp()
		{
			rolledUpCaptions.add(((Object) (buildSpannableString())));
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field List rolledUpCaptions>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #114 <Method SpannableString buildSpannableString()>
		//    4    8:invokeinterface #184 <Method boolean List.add(Object)>
		//    5   13:pop             
			captionStringBuilder.setLength(0);
		//    6   14:aload_0         
		//    7   15:getfield        #44  <Field StringBuilder captionStringBuilder>
		//    8   18:iconst_0        
		//    9   19:invokevirtual   #179 <Method void StringBuilder.setLength(int)>
			cueStyles.clear();
		//   10   22:aload_0         
		//   11   23:getfield        #37  <Field List cueStyles>
		//   12   26:invokeinterface #176 <Method void List.clear()>
			for(int i = Math.min(captionRowCount, row); rolledUpCaptions.size() >= i; rolledUpCaptions.remove(0));
		//   13   31:aload_0         
		//   14   32:getfield        #186 <Field int captionRowCount>
		//   15   35:aload_0         
		//   16   36:getfield        #133 <Field int row>
		//   17   39:invokestatic    #190 <Method int Math.min(int, int)>
		//   18   42:istore_1        
		//   19   43:aload_0         
		//   20   44:getfield        #39  <Field List rolledUpCaptions>
		//   21   47:invokeinterface #92  <Method int List.size()>
		//   22   52:iload_1         
		//   23   53:icmplt          70
		//   24   56:aload_0         
		//   25   57:getfield        #39  <Field List rolledUpCaptions>
		//   26   60:iconst_0        
		//   27   61:invokeinterface #193 <Method Object List.remove(int)>
		//   28   66:pop             
		//*  29   67:goto            43
		//   30   70:return          
		}

		public void setCaptionRowCount(int i)
		{
			captionRowCount = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #186 <Field int captionRowCount>
		//    3    5:return          
		}

		public void setIndent(int i)
		{
			indent = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #117 <Field int indent>
		//    3    5:return          
		}

		public void setRow(int i)
		{
			row = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #133 <Field int row>
		//    3    5:return          
		}

		public void setStyle(int i, boolean flag)
		{
			cueStyles.add(((Object) (new CueStyle(i, flag, captionStringBuilder.length()))));
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field List cueStyles>
		//    2    4:new             #9   <Class Cea608Decoder$CueBuilder$CueStyle>
		//    3    7:dup             
		//    4    8:iload_1         
		//    5    9:iload_2         
		//    6   10:aload_0         
		//    7   11:getfield        #44  <Field StringBuilder captionStringBuilder>
		//    8   14:invokevirtual   #83  <Method int StringBuilder.length()>
		//    9   17:invokespecial   #200 <Method void Cea608Decoder$CueBuilder$CueStyle(int, boolean, int)>
		//   10   20:invokeinterface #184 <Method boolean List.add(Object)>
		//   11   25:pop             
		//   12   26:return          
		}

		public void setTab(int i)
		{
			tabOffset = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #119 <Field int tabOffset>
		//    3    5:return          
		}

		public String toString()
		{
			return captionStringBuilder.toString();
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field StringBuilder captionStringBuilder>
		//    2    4:invokevirtual   #205 <Method String StringBuilder.toString()>
		//    3    7:areturn         
		}

		private static final int BASE_ROW = 15;
		private static final int SCREEN_CHARWIDTH = 32;
		private int captionMode;
		private int captionRowCount;
		private final StringBuilder captionStringBuilder = new StringBuilder();
		private final List cueStyles = new ArrayList();
		private int indent;
		private final List rolledUpCaptions = new ArrayList();
		private int row;
		private int tabOffset;

		public CueBuilder(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #32  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #34  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #35  <Method void ArrayList()>
		//    6   12:putfield        #37  <Field List cueStyles>
		//    7   15:aload_0         
		//    8   16:new             #34  <Class ArrayList>
		//    9   19:dup             
		//   10   20:invokespecial   #35  <Method void ArrayList()>
		//   11   23:putfield        #39  <Field List rolledUpCaptions>
		//   12   26:aload_0         
		//   13   27:new             #41  <Class StringBuilder>
		//   14   30:dup             
		//   15   31:invokespecial   #42  <Method void StringBuilder()>
		//   16   34:putfield        #44  <Field StringBuilder captionStringBuilder>
			reset(i);
		//   17   37:aload_0         
		//   18   38:iload_1         
		//   19   39:invokevirtual   #48  <Method void reset(int)>
			setCaptionRowCount(j);
		//   20   42:aload_0         
		//   21   43:iload_2         
		//   22   44:invokevirtual   #51  <Method void setCaptionRowCount(int)>
		//   23   47:return          
		}
	}

	private static class CueBuilder.CueStyle
	{

		public int start;
		public final int style;
		public final boolean underline;

		public CueBuilder.CueStyle(int i, boolean flag, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			style = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #22  <Field int style>
			underline = flag;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #24  <Field boolean underline>
			start = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #26  <Field int start>
		//   11   19:return          
		}
	}


	public Cea608Decoder(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #109 <Method void CeaDecoder()>
	//    2    4:aload_0         
	//    3    5:new             #111 <Class ParsableByteArray>
	//    4    8:dup             
	//    5    9:invokespecial   #112 <Method void ParsableByteArray()>
	//    6   12:putfield        #114 <Field ParsableByteArray ccData>
	//    7   15:aload_0         
	//    8   16:new             #116 <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #117 <Method void ArrayList()>
	//   11   23:putfield        #119 <Field ArrayList cueBuilders>
		currentCueBuilder = new CueBuilder(0, 4);
	//   12   26:aload_0         
	//   13   27:new             #6   <Class Cea608Decoder$CueBuilder>
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:iconst_4        
	//   17   33:invokespecial   #122 <Method void Cea608Decoder$CueBuilder(int, int)>
	//   18   36:putfield        #124 <Field Cea608Decoder$CueBuilder currentCueBuilder>
		int j;
		if("application/x-mp4-cea-608".equals(((Object) (s))))
	//*  19   39:ldc1            #126 <String "application/x-mp4-cea-608">
	//*  20   41:aload_1         
	//*  21   42:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  22   45:ifeq            53
			j = 2;
	//   23   48:iconst_2        
	//   24   49:istore_3        
		else
	//*  25   50:goto            55
			j = 3;
	//   26   53:iconst_3        
	//   27   54:istore_3        
		packetLength = j;
	//   28   55:aload_0         
	//   29   56:iload_3         
	//   30   57:putfield        #134 <Field int packetLength>
		switch(i)
	//*  31   60:iload_2         
		{
	//*  32   61:tableswitch     3 4: default 84
	//	               3 92
	//	               4 92
		default:
			selectedField = 1;
	//   33   84:aload_0         
	//   34   85:iconst_1        
	//   35   86:putfield        #136 <Field int selectedField>
			break;

	//*  36   89:goto            97
		case 3: // '\003'
		case 4: // '\004'
			selectedField = 2;
	//   37   92:aload_0         
	//   38   93:iconst_2        
	//   39   94:putfield        #136 <Field int selectedField>
			break;
		}
		setCaptionMode(0);
	//   40   97:aload_0         
	//   41   98:iconst_0        
	//   42   99:invokespecial   #140 <Method void setCaptionMode(int)>
		resetCueBuilders();
	//   43  102:aload_0         
	//   44  103:invokespecial   #143 <Method void resetCueBuilders()>
	//   45  106:return          
	}

	private static char getChar(byte byte0)
	{
		return (char)BASIC_CHARACTER_SET[(byte0 & 0x7f) - 32];
	//    0    0:getstatic       #98  <Field int[] BASIC_CHARACTER_SET>
	//    1    3:iload_0         
	//    2    4:bipush          127
	//    3    6:iand            
	//    4    7:bipush          32
	//    5    9:isub            
	//    6   10:iaload          
	//    7   11:int2char        
	//    8   12:ireturn         
	}

	private List getDisplayCues()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #116 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #117 <Method void ArrayList()>
	//    3    7:astore_2        
		for(int i = 0; i < cueBuilders.size(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #119 <Field ArrayList cueBuilders>
	//*   9   15:invokevirtual   #153 <Method int ArrayList.size()>
	//*  10   18:icmpge          55
		{
			Cue cue = ((CueBuilder)cueBuilders.get(i)).build();
	//   11   21:aload_0         
	//   12   22:getfield        #119 <Field ArrayList cueBuilders>
	//   13   25:iload_1         
	//   14   26:invokevirtual   #157 <Method Object ArrayList.get(int)>
	//   15   29:checkcast       #6   <Class Cea608Decoder$CueBuilder>
	//   16   32:invokevirtual   #161 <Method Cue Cea608Decoder$CueBuilder.build()>
	//   17   35:astore_3        
			if(cue != null)
	//*  18   36:aload_3         
	//*  19   37:ifnull          48
				((List) (arraylist)).add(((Object) (cue)));
	//   20   40:aload_2         
	//   21   41:aload_3         
	//   22   42:invokeinterface #166 <Method boolean List.add(Object)>
	//   23   47:pop             
		}

	//   24   48:iload_1         
	//   25   49:iconst_1        
	//   26   50:iadd            
	//   27   51:istore_1        
	//*  28   52:goto            10
		return ((List) (arraylist));
	//   29   55:aload_2         
	//   30   56:areturn         
	}

	private static char getExtendedEsFrChar(byte byte0)
	{
		return (char)SPECIAL_ES_FR_CHARACTER_SET[byte0 & 0x1f];
	//    0    0:getstatic       #102 <Field int[] SPECIAL_ES_FR_CHARACTER_SET>
	//    1    3:iload_0         
	//    2    4:bipush          31
	//    3    6:iand            
	//    4    7:iaload          
	//    5    8:int2char        
	//    6    9:ireturn         
	}

	private static char getExtendedPtDeChar(byte byte0)
	{
		return (char)SPECIAL_PT_DE_CHARACTER_SET[byte0 & 0x1f];
	//    0    0:getstatic       #104 <Field int[] SPECIAL_PT_DE_CHARACTER_SET>
	//    1    3:iload_0         
	//    2    4:bipush          31
	//    3    6:iand            
	//    4    7:iaload          
	//    5    8:int2char        
	//    6    9:ireturn         
	}

	private static char getSpecialChar(byte byte0)
	{
		return (char)SPECIAL_CHARACTER_SET[byte0 & 0xf];
	//    0    0:getstatic       #100 <Field int[] SPECIAL_CHARACTER_SET>
	//    1    3:iload_0         
	//    2    4:bipush          15
	//    3    6:iand            
	//    4    7:iaload          
	//    5    8:int2char        
	//    6    9:ireturn         
	}

	private boolean handleCtrl(byte byte0, byte byte1)
	{
		boolean flag = isRepeatable(byte0);
	//    0    0:iload_1         
	//    1    1:invokestatic    #177 <Method boolean isRepeatable(byte)>
	//    2    4:istore_3        
		if(flag)
	//*   3    5:iload_3         
	//*   4    6:ifeq            54
		{
			if(repeatableControlSet && repeatableControlCc1 == byte0 && repeatableControlCc2 == byte1)
	//*   5    9:aload_0         
	//*   6   10:getfield        #179 <Field boolean repeatableControlSet>
	//*   7   13:ifeq            39
	//*   8   16:aload_0         
	//*   9   17:getfield        #181 <Field byte repeatableControlCc1>
	//*  10   20:iload_1         
	//*  11   21:icmpne          39
	//*  12   24:aload_0         
	//*  13   25:getfield        #183 <Field byte repeatableControlCc2>
	//*  14   28:iload_2         
	//*  15   29:icmpne          39
			{
				repeatableControlSet = false;
	//   16   32:aload_0         
	//   17   33:iconst_0        
	//   18   34:putfield        #179 <Field boolean repeatableControlSet>
				return true;
	//   19   37:iconst_1        
	//   20   38:ireturn         
			}
			repeatableControlSet = true;
	//   21   39:aload_0         
	//   22   40:iconst_1        
	//   23   41:putfield        #179 <Field boolean repeatableControlSet>
			repeatableControlCc1 = byte0;
	//   24   44:aload_0         
	//   25   45:iload_1         
	//   26   46:putfield        #181 <Field byte repeatableControlCc1>
			repeatableControlCc2 = byte1;
	//   27   49:aload_0         
	//   28   50:iload_2         
	//   29   51:putfield        #183 <Field byte repeatableControlCc2>
		}
		if(isMidrowCtrlCode(byte0, byte1))
	//*  30   54:iload_1         
	//*  31   55:iload_2         
	//*  32   56:invokestatic    #186 <Method boolean isMidrowCtrlCode(byte, byte)>
	//*  33   59:ifeq            69
		{
			handleMidrowCtrl(byte1);
	//   34   62:aload_0         
	//   35   63:iload_2         
	//   36   64:invokespecial   #190 <Method void handleMidrowCtrl(byte)>
			return flag;
	//   37   67:iload_3         
	//   38   68:ireturn         
		}
		if(isPreambleAddressCode(byte0, byte1))
	//*  39   69:iload_1         
	//*  40   70:iload_2         
	//*  41   71:invokestatic    #193 <Method boolean isPreambleAddressCode(byte, byte)>
	//*  42   74:ifeq            85
		{
			handlePreambleAddressCode(byte0, byte1);
	//   43   77:aload_0         
	//   44   78:iload_1         
	//   45   79:iload_2         
	//   46   80:invokespecial   #197 <Method void handlePreambleAddressCode(byte, byte)>
			return flag;
	//   47   83:iload_3         
	//   48   84:ireturn         
		}
		if(isTabCtrlCode(byte0, byte1))
	//*  49   85:iload_1         
	//*  50   86:iload_2         
	//*  51   87:invokestatic    #200 <Method boolean isTabCtrlCode(byte, byte)>
	//*  52   90:ifeq            106
		{
			currentCueBuilder.setTab(byte1 - 32);
	//   53   93:aload_0         
	//   54   94:getfield        #124 <Field Cea608Decoder$CueBuilder currentCueBuilder>
	//   55   97:iload_2         
	//   56   98:bipush          32
	//   57  100:isub            
	//   58  101:invokevirtual   #203 <Method void Cea608Decoder$CueBuilder.setTab(int)>
			return flag;
	//   59  104:iload_3         
	//   60  105:ireturn         
		}
		if(isMiscCode(byte0, byte1))
	//*  61  106:iload_1         
	//*  62  107:iload_2         
	//*  63  108:invokestatic    #206 <Method boolean isMiscCode(byte, byte)>
	//*  64  111:ifeq            119
			handleMiscCode(byte1);
	//   65  114:aload_0         
	//   66  115:iload_2         
	//   67  116:invokespecial   #209 <Method void handleMiscCode(byte)>
		return flag;
	//   68  119:iload_3         
	//   69  120:ireturn         
	}

	private void handleMidrowCtrl(byte byte0)
	{
		currentCueBuilder.append(' ');
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field Cea608Decoder$CueBuilder currentCueBuilder>
	//    2    4:bipush          32
	//    3    6:invokevirtual   #213 <Method void Cea608Decoder$CueBuilder.append(char)>
		boolean flag;
		if((byte0 & 1) == 1)
	//*   4    9:iload_1         
	//*   5   10:iconst_1        
	//*   6   11:iand            
	//*   7   12:iconst_1        
	//*   8   13:icmpne          21
			flag = true;
	//    9   16:iconst_1        
	//   10   17:istore_2        
		else
	//*  11   18:goto            23
			flag = false;
	//   12   21:iconst_0        
	//   13   22:istore_2        
		currentCueBuilder.setStyle(byte0 >> 1 & 7, flag);
	//   14   23:aload_0         
	//   15   24:getfield        #124 <Field Cea608Decoder$CueBuilder currentCueBuilder>
	//   16   27:iload_1         
	//   17   28:iconst_1        
	//   18   29:ishr            
	//   19   30:bipush          7
	//   20   32:iand            
	//   21   33:iload_2         
	//   22   34:invokevirtual   #217 <Method void Cea608Decoder$CueBuilder.setStyle(int, boolean)>
	//   23   37:return          
	}

	private void handleMiscCode(byte byte0)
	{
		if(byte0 != 32)
	//*   0    0:iload_1         
	//*   1    1:bipush          32
	//*   2    3:icmpeq          210
		{
			if(byte0 != 41)
	//*   3    6:iload_1         
	//*   4    7:bipush          41
	//*   5    9:icmpeq          204
			{
				switch(byte0)
	//*   6   12:iload_1         
				{
	//*   7   13:tableswitch     37 39: default 40
	//	               37 193
	//	               38 182
	//	               39 171
				default:
					if(captionMode == 0)
	//*   8   40:aload_0         
	//*   9   41:getfield        #219 <Field int captionMode>
	//*  10   44:ifne            48
						return;
	//   11   47:return          
					if(byte0 != 33)
	//*  12   48:iload_1         
	//*  13   49:bipush          33
	//*  14   51:icmpeq          163
					{
						if(byte0 != 36)
	//*  15   54:iload_1         
	//*  16   55:bipush          36
	//*  17   57:icmpeq          170
							switch(byte0)
	//*  18   60:iload_1         
							{
	//*  19   61:tableswitch     44 47: default 92
	//	               44 137
	//	               45 111
	//	               46 106
	//	               47 93
							default:
								return;
	//   20   92:return          

							case 47: // '/'
								cues = getDisplayCues();
	//   21   93:aload_0         
	//   22   94:aload_0         
	//   23   95:invokespecial   #221 <Method List getDisplayCues()>
	//   24   98:putfield        #223 <Field List cues>
								resetCueBuilders();
	//   25  101:aload_0         
	//   26  102:invokespecial   #143 <Method void resetCueBuilders()>
								return;
	//   27  105:return          

							case 46: // '.'
								resetCueBuilders();
	//   28  106:aload_0         
	//   29  107:invokespecial   #143 <Method void resetCueBuilders()>
								return;
	//   30  110:return          

							case 45: // '-'
								if(captionMode == 1 && !currentCueBuilder.isEmpty())
	//*  31  111:aload_0         
	//*  32  112:getfield        #219 <Field int captionMode>
	//*  33  115:iconst_1        
	//*  34  116:icmpne          170
	//*  35  119:aload_0         
	//*  36  120:getfield        #124 <Field Cea608Decoder$CueBuilder currentCueBuilder>
	//*  37  123:invokevirtual   #227 <Method boolean Cea608Decoder$CueBuilder.isEmpty()>
	//*  38  126:ifne            170
								{
									currentCueBuilder.rollUp();
	//   39  129:aload_0         
	//   40  130:getfield        #124 <Field Cea608Decoder$CueBuilder currentCueBuilder>
	//   41  133:invokevirtual   #230 <Method void Cea608Decoder$CueBuilder.rollUp()>
									return;
	//   42  136:return          
								}
								break;

							case 44: // ','
								cues = null;
	//   43  137:aload_0         
	//   44  138:aconst_null     
	//   45  139:putfield        #223 <Field List cues>
								if(captionMode == 1 || captionMode == 3)
	//*  46  142:aload_0         
	//*  47  143:getfield        #219 <Field int captionMode>
	//*  48  146:iconst_1        
	//*  49  147:icmpeq          158
	//*  50  150:aload_0         
	//*  51  151:getfield        #219 <Field int captionMode>
	//*  52  154:iconst_3        
	//*  53  155:icmpne          170
								{
									resetCueBuilders();
	//   54  158:aload_0         
	//   55  159:invokespecial   #143 <Method void resetCueBuilders()>
									return;
	//   56  162:return          
								}
								break;
							}
					} else
					{
						currentCueBuilder.backspace();
	//   57  163:aload_0         
	//   58  164:getfield        #124 <Field Cea608Decoder$CueBuilder currentCueBuilder>
	//   59  167:invokevirtual   #233 <Method void Cea608Decoder$CueBuilder.backspace()>
					}
					return;
	//   60  170:return          

				case 39: // '\''
					setCaptionMode(1);
	//   61  171:aload_0         
	//   62  172:iconst_1        
	//   63  173:invokespecial   #140 <Method void setCaptionMode(int)>
					setCaptionRowCount(4);
	//   64  176:aload_0         
	//   65  177:iconst_4        
	//   66  178:invokespecial   #236 <Method void setCaptionRowCount(int)>
					return;
	//   67  181:return          

				case 38: // '&'
					setCaptionMode(1);
	//   68  182:aload_0         
	//   69  183:iconst_1        
	//   70  184:invokespecial   #140 <Method void setCaptionMode(int)>
					setCaptionRowCount(3);
	//   71  187:aload_0         
	//   72  188:iconst_3        
	//   73  189:invokespecial   #236 <Method void setCaptionRowCount(int)>
					return;
	//   74  192:return          

				case 37: // '%'
					setCaptionMode(1);
	//   75  193:aload_0         
	//   76  194:iconst_1        
	//   77  195:invokespecial   #140 <Method void setCaptionMode(int)>
					setCaptionRowCount(2);
	//   78  198:aload_0         
	//   79  199:iconst_2        
	//   80  200:invokespecial   #236 <Method void setCaptionRowCount(int)>
					return;
	//   81  203:return          
				}
			} else
			{
				setCaptionMode(3);
	//   82  204:aload_0         
	//   83  205:iconst_3        
	//   84  206:invokespecial   #140 <Method void setCaptionMode(int)>
				return;
	//   85  209:return          
			}
		} else
		{
			setCaptionMode(2);
	//   86  210:aload_0         
	//   87  211:iconst_2        
	//   88  212:invokespecial   #140 <Method void setCaptionMode(int)>
			return;
	//   89  215:return          
		}
	}

	private void handlePreambleAddressCode(byte byte0, byte byte1)
	{
		int j = ROW_INDICES[byte0 & 7];
	//    0    0:getstatic       #87  <Field int[] ROW_INDICES>
	//    1    3:iload_1         
	//    2    4:bipush          7
	//    3    6:iand            
	//    4    7:iaload          
	//    5    8:istore          4
		boolean flag = false;
	//    6   10:iconst_0        
	//    7   11:istore          5
		if((byte1 & 0x20) != 0)
	//*   8   13:iload_2         
	//*   9   14:bipush          32
	//*  10   16:iand            
	//*  11   17:ifeq            25
			byte0 = 1;
	//   12   20:iconst_1        
	//   13   21:istore_1        
		else
	//*  14   22:goto            27
			byte0 = 0;
	//   15   25:iconst_0        
	//   16   26:istore_1        
		int i = j;
	//   17   27:iload           4
	//   18   29:istore_3        
		if(byte0 != 0)
	//*  19   30:iload_1         
	//*  20   31:ifeq            39
			i = j + 1;
	//   21   34:iload           4
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:istore_3        
		if(i != currentCueBuilder.getRow())
	//*  25   39:iload_3         
	//*  26   40:aload_0         
	//*  27   41:getfield        #124 <Field Cea608Decoder$CueBuilder currentCueBuilder>
	//*  28   44:invokevirtual   #239 <Method int Cea608Decoder$CueBuilder.getRow()>
	//*  29   47:icmpeq          107
		{
			if(captionMode != 1 && !currentCueBuilder.isEmpty())
	//*  30   50:aload_0         
	//*  31   51:getfield        #219 <Field int captionMode>
	//*  32   54:iconst_1        
	//*  33   55:icmpeq          99
	//*  34   58:aload_0         
	//*  35   59:getfield        #124 <Field Cea608Decoder$CueBuilder currentCueBuilder>
	//*  36   62:invokevirtual   #227 <Method boolean Cea608Decoder$CueBuilder.isEmpty()>
	//*  37   65:ifne            99
			{
				currentCueBuilder = new CueBuilder(captionMode, captionRowCount);
	//   38   68:aload_0         
	//   39   69:new             #6   <Class Cea608Decoder$CueBuilder>
	//   40   72:dup             
	//   41   73:aload_0         
	//   42   74:getfield        #219 <Field int captionMode>
	//   43   77:aload_0         
	//   44   78:getfield        #241 <Field int captionRowCount>
	//   45   81:invokespecial   #122 <Method void Cea608Decoder$CueBuilder(int, int)>
	//   46   84:putfield        #124 <Field Cea608Decoder$CueBuilder currentCueBuilder>
				cueBuilders.add(((Object) (currentCueBuilder)));
	//   47   87:aload_0         
	//   48   88:getfield        #119 <Field ArrayList cueBuilders>
	//   49   91:aload_0         
	//   50   92:getfield        #124 <Field Cea608Decoder$CueBuilder currentCueBuilder>
	//   51   95:invokevirtual   #242 <Method boolean ArrayList.add(Object)>
	//   52   98:pop             
			}
			currentCueBuilder.setRow(i);
	//   53   99:aload_0         
	//   54  100:getfield        #124 <Field Cea608Decoder$CueBuilder currentCueBuilder>
	//   55  103:iload_3         
	//   56  104:invokevirtual   #245 <Method void Cea608Decoder$CueBuilder.setRow(int)>
		}
		if((byte1 & 0x10) == 16)
	//*  57  107:iload_2         
	//*  58  108:bipush          16
	//*  59  110:iand            
	//*  60  111:bipush          16
	//*  61  113:icmpne          121
			byte0 = 1;
	//   62  116:iconst_1        
	//   63  117:istore_1        
		else
	//*  64  118:goto            123
			byte0 = 0;
	//   65  121:iconst_0        
	//   66  122:istore_1        
		if((byte1 & 1) == 1)
	//*  67  123:iload_2         
	//*  68  124:iconst_1        
	//*  69  125:iand            
	//*  70  126:iconst_1        
	//*  71  127:icmpne          133
			flag = true;
	//   72  130:iconst_1        
	//   73  131:istore          5
		i = byte1 >> 1 & 7;
	//   74  133:iload_2         
	//   75  134:iconst_1        
	//   76  135:ishr            
	//   77  136:bipush          7
	//   78  138:iand            
	//   79  139:istore_3        
		CueBuilder cuebuilder = currentCueBuilder;
	//   80  140:aload_0         
	//   81  141:getfield        #124 <Field Cea608Decoder$CueBuilder currentCueBuilder>
	//   82  144:astore          6
		if(byte0 != 0)
	//*  83  146:iload_1         
	//*  84  147:ifeq            156
			byte1 = 8;
	//   85  150:bipush          8
	//   86  152:istore_2        
		else
	//*  87  153:goto            158
			byte1 = ((byte) (i));
	//   88  156:iload_3         
	//   89  157:istore_2        
		cuebuilder.setStyle(((int) (byte1)), flag);
	//   90  158:aload           6
	//   91  160:iload_2         
	//   92  161:iload           5
	//   93  163:invokevirtual   #217 <Method void Cea608Decoder$CueBuilder.setStyle(int, boolean)>
		if(byte0 != 0)
	//*  94  166:iload_1         
	//*  95  167:ifeq            182
			currentCueBuilder.setIndent(COLUMN_INDICES[i]);
	//   96  170:aload_0         
	//   97  171:getfield        #124 <Field Cea608Decoder$CueBuilder currentCueBuilder>
	//   98  174:getstatic       #89  <Field int[] COLUMN_INDICES>
	//   99  177:iload_3         
	//  100  178:iaload          
	//  101  179:invokevirtual   #248 <Method void Cea608Decoder$CueBuilder.setIndent(int)>
	//  102  182:return          
	}

	private static boolean isMidrowCtrlCode(byte byte0, byte byte1)
	{
		return (byte0 & 0xf7) == 17 && (byte1 & 0xf0) == 32;
	//    0    0:iload_0         
	//    1    1:sipush          247
	//    2    4:iand            
	//    3    5:bipush          17
	//    4    7:icmpne          22
	//    5   10:iload_1         
	//    6   11:sipush          240
	//    7   14:iand            
	//    8   15:bipush          32
	//    9   17:icmpne          22
	//   10   20:iconst_1        
	//   11   21:ireturn         
	//   12   22:iconst_0        
	//   13   23:ireturn         
	}

	private static boolean isMiscCode(byte byte0, byte byte1)
	{
		return (byte0 & 0xf7) == 20 && (byte1 & 0xf0) == 32;
	//    0    0:iload_0         
	//    1    1:sipush          247
	//    2    4:iand            
	//    3    5:bipush          20
	//    4    7:icmpne          22
	//    5   10:iload_1         
	//    6   11:sipush          240
	//    7   14:iand            
	//    8   15:bipush          32
	//    9   17:icmpne          22
	//   10   20:iconst_1        
	//   11   21:ireturn         
	//   12   22:iconst_0        
	//   13   23:ireturn         
	}

	private static boolean isPreambleAddressCode(byte byte0, byte byte1)
	{
		return (byte0 & 0xf0) == 16 && (byte1 & 0xc0) == 64;
	//    0    0:iload_0         
	//    1    1:sipush          240
	//    2    4:iand            
	//    3    5:bipush          16
	//    4    7:icmpne          22
	//    5   10:iload_1         
	//    6   11:sipush          192
	//    7   14:iand            
	//    8   15:bipush          64
	//    9   17:icmpne          22
	//   10   20:iconst_1        
	//   11   21:ireturn         
	//   12   22:iconst_0        
	//   13   23:ireturn         
	}

	private static boolean isRepeatable(byte byte0)
	{
		return (byte0 & 0xf0) == 16;
	//    0    0:iload_0         
	//    1    1:sipush          240
	//    2    4:iand            
	//    3    5:bipush          16
	//    4    7:icmpne          12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	private static boolean isTabCtrlCode(byte byte0, byte byte1)
	{
		return (byte0 & 0xf7) == 23 && byte1 >= 33 && byte1 <= 35;
	//    0    0:iload_0         
	//    1    1:sipush          247
	//    2    4:iand            
	//    3    5:bipush          23
	//    4    7:icmpne          24
	//    5   10:iload_1         
	//    6   11:bipush          33
	//    7   13:icmplt          24
	//    8   16:iload_1         
	//    9   17:bipush          35
	//   10   19:icmpgt          24
	//   11   22:iconst_1        
	//   12   23:ireturn         
	//   13   24:iconst_0        
	//   14   25:ireturn         
	}

	private void resetCueBuilders()
	{
		currentCueBuilder.reset(captionMode);
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field Cea608Decoder$CueBuilder currentCueBuilder>
	//    2    4:aload_0         
	//    3    5:getfield        #219 <Field int captionMode>
	//    4    8:invokevirtual   #251 <Method void Cea608Decoder$CueBuilder.reset(int)>
		cueBuilders.clear();
	//    5   11:aload_0         
	//    6   12:getfield        #119 <Field ArrayList cueBuilders>
	//    7   15:invokevirtual   #254 <Method void ArrayList.clear()>
		cueBuilders.add(((Object) (currentCueBuilder)));
	//    8   18:aload_0         
	//    9   19:getfield        #119 <Field ArrayList cueBuilders>
	//   10   22:aload_0         
	//   11   23:getfield        #124 <Field Cea608Decoder$CueBuilder currentCueBuilder>
	//   12   26:invokevirtual   #242 <Method boolean ArrayList.add(Object)>
	//   13   29:pop             
	//   14   30:return          
	}

	private void setCaptionMode(int i)
	{
		if(captionMode == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #219 <Field int captionMode>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		int j = captionMode;
	//    5    9:aload_0         
	//    6   10:getfield        #219 <Field int captionMode>
	//    7   13:istore_2        
		captionMode = i;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #219 <Field int captionMode>
		resetCueBuilders();
	//   11   19:aload_0         
	//   12   20:invokespecial   #143 <Method void resetCueBuilders()>
		if(j == 3 || i == 1 || i == 0)
	//*  13   23:iload_2         
	//*  14   24:iconst_3        
	//*  15   25:icmpeq          37
	//*  16   28:iload_1         
	//*  17   29:iconst_1        
	//*  18   30:icmpeq          37
	//*  19   33:iload_1         
	//*  20   34:ifne            42
			cues = null;
	//   21   37:aload_0         
	//   22   38:aconst_null     
	//   23   39:putfield        #223 <Field List cues>
	//   24   42:return          
	}

	private void setCaptionRowCount(int i)
	{
		captionRowCount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #241 <Field int captionRowCount>
		currentCueBuilder.setCaptionRowCount(i);
	//    3    5:aload_0         
	//    4    6:getfield        #124 <Field Cea608Decoder$CueBuilder currentCueBuilder>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #255 <Method void Cea608Decoder$CueBuilder.setCaptionRowCount(int)>
	//    7   13:return          
	}

	protected Subtitle createSubtitle()
	{
		lastCues = cues;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #223 <Field List cues>
	//    3    5:putfield        #259 <Field List lastCues>
		return ((Subtitle) (new CeaSubtitle(cues)));
	//    4    8:new             #261 <Class CeaSubtitle>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #223 <Field List cues>
	//    8   16:invokespecial   #264 <Method void CeaSubtitle(List)>
	//    9   19:areturn         
	}

	protected void decode(SubtitleInputBuffer subtitleinputbuffer)
	{
		ccData.reset(subtitleinputbuffer.data.array(), subtitleinputbuffer.data.limit());
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field ParsableByteArray ccData>
	//    2    4:aload_1         
	//    3    5:getfield        #272 <Field ByteBuffer SubtitleInputBuffer.data>
	//    4    8:invokevirtual   #278 <Method byte[] ByteBuffer.array()>
	//    5   11:aload_1         
	//    6   12:getfield        #272 <Field ByteBuffer SubtitleInputBuffer.data>
	//    7   15:invokevirtual   #281 <Method int ByteBuffer.limit()>
	//    8   18:invokevirtual   #284 <Method void ParsableByteArray.reset(byte[], int)>
		boolean flag1 = false;
	//    9   21:iconst_0        
	//   10   22:istore          6
		boolean flag = flag1;
	//   11   24:iload           6
	//   12   26:istore          5
		boolean flag3 = flag1;
	//   13   28:iload           6
	//   14   30:istore          7
		do
		{
			if(ccData.bytesLeft() < packetLength)
				break;
	//   15   32:aload_0         
	//   16   33:getfield        #114 <Field ParsableByteArray ccData>
	//   17   36:invokevirtual   #287 <Method int ParsableByteArray.bytesLeft()>
	//   18   39:aload_0         
	//   19   40:getfield        #134 <Field int packetLength>
	//   20   43:icmplt          326
			byte byte2;
			if(packetLength == 2)
	//*  21   46:aload_0         
	//*  22   47:getfield        #134 <Field int packetLength>
	//*  23   50:iconst_2        
	//*  24   51:icmpne          61
				byte2 = -4;
	//   25   54:bipush          -4
	//   26   56:istore          4
			else
	//*  27   58:goto            71
				byte2 = (byte)ccData.readUnsignedByte();
	//   28   61:aload_0         
	//   29   62:getfield        #114 <Field ParsableByteArray ccData>
	//   30   65:invokevirtual   #290 <Method int ParsableByteArray.readUnsignedByte()>
	//   31   68:int2byte        
	//   32   69:istore          4
			byte byte0 = (byte)(ccData.readUnsignedByte() & 0x7f);
	//   33   71:aload_0         
	//   34   72:getfield        #114 <Field ParsableByteArray ccData>
	//   35   75:invokevirtual   #290 <Method int ParsableByteArray.readUnsignedByte()>
	//   36   78:bipush          127
	//   37   80:iand            
	//   38   81:int2byte        
	//   39   82:istore_2        
			byte byte1 = (byte)(ccData.readUnsignedByte() & 0x7f);
	//   40   83:aload_0         
	//   41   84:getfield        #114 <Field ParsableByteArray ccData>
	//   42   87:invokevirtual   #290 <Method int ParsableByteArray.readUnsignedByte()>
	//   43   90:bipush          127
	//   44   92:iand            
	//   45   93:int2byte        
	//   46   94:istore_3        
			if((byte2 & 6) == 4 && (selectedField != 1 || (byte2 & 1) == 0) && (selectedField != 2 || (byte2 & 1) == 1) && (byte0 != 0 || byte1 != 0))
	//*  47   95:iload           4
	//*  48   97:bipush          6
	//*  49   99:iand            
	//*  50  100:iconst_4        
	//*  51  101:icmpeq          107
	//*  52  104:goto            32
	//*  53  107:aload_0         
	//*  54  108:getfield        #136 <Field int selectedField>
	//*  55  111:iconst_1        
	//*  56  112:icmpne          122
	//*  57  115:iload           4
	//*  58  117:iconst_1        
	//*  59  118:iand            
	//*  60  119:ifne            32
	//*  61  122:aload_0         
	//*  62  123:getfield        #136 <Field int selectedField>
	//*  63  126:iconst_2        
	//*  64  127:icmpne          141
	//*  65  130:iload           4
	//*  66  132:iconst_1        
	//*  67  133:iand            
	//*  68  134:iconst_1        
	//*  69  135:icmpeq          141
	//*  70  138:goto            32
	//*  71  141:iload_2         
	//*  72  142:ifne            152
	//*  73  145:iload_3         
	//*  74  146:ifne            152
	//*  75  149:goto            32
			{
				boolean flag2;
				if((byte0 & 0xf7) == 17 && (byte1 & 0xf0) == 48)
	//*  76  152:iload_2         
	//*  77  153:sipush          247
	//*  78  156:iand            
	//*  79  157:bipush          17
	//*  80  159:icmpne          190
	//*  81  162:iload_3         
	//*  82  163:sipush          240
	//*  83  166:iand            
	//*  84  167:bipush          48
	//*  85  169:icmpne          190
				{
					currentCueBuilder.append(getSpecialChar(byte1));
	//   86  172:aload_0         
	//   87  173:getfield        #124 <Field Cea608Decoder$CueBuilder currentCueBuilder>
	//   88  176:iload_3         
	//   89  177:invokestatic    #292 <Method char getSpecialChar(byte)>
	//   90  180:invokevirtual   #213 <Method void Cea608Decoder$CueBuilder.append(char)>
					flag2 = flag;
	//   91  183:iload           5
	//   92  185:istore          6
				} else
	//*  93  187:goto            316
				if((byte0 & 0xf6) == 18 && (byte1 & 0xe0) == 32)
	//*  94  190:iload_2         
	//*  95  191:sipush          246
	//*  96  194:iand            
	//*  97  195:bipush          18
	//*  98  197:icmpne          259
	//*  99  200:iload_3         
	//* 100  201:sipush          224
	//* 101  204:iand            
	//* 102  205:bipush          32
	//* 103  207:icmpne          259
				{
					currentCueBuilder.backspace();
	//  104  210:aload_0         
	//  105  211:getfield        #124 <Field Cea608Decoder$CueBuilder currentCueBuilder>
	//  106  214:invokevirtual   #233 <Method void Cea608Decoder$CueBuilder.backspace()>
					if((byte0 & 1) == 0)
	//* 107  217:iload_2         
	//* 108  218:iconst_1        
	//* 109  219:iand            
	//* 110  220:ifne            241
					{
						currentCueBuilder.append(getExtendedEsFrChar(byte1));
	//  111  223:aload_0         
	//  112  224:getfield        #124 <Field Cea608Decoder$CueBuilder currentCueBuilder>
	//  113  227:iload_3         
	//  114  228:invokestatic    #294 <Method char getExtendedEsFrChar(byte)>
	//  115  231:invokevirtual   #213 <Method void Cea608Decoder$CueBuilder.append(char)>
						flag2 = flag;
	//  116  234:iload           5
	//  117  236:istore          6
					} else
	//* 118  238:goto            316
					{
						currentCueBuilder.append(getExtendedPtDeChar(byte1));
	//  119  241:aload_0         
	//  120  242:getfield        #124 <Field Cea608Decoder$CueBuilder currentCueBuilder>
	//  121  245:iload_3         
	//  122  246:invokestatic    #296 <Method char getExtendedPtDeChar(byte)>
	//  123  249:invokevirtual   #213 <Method void Cea608Decoder$CueBuilder.append(char)>
						flag2 = flag;
	//  124  252:iload           5
	//  125  254:istore          6
					}
				} else
	//* 126  256:goto            316
				if((byte0 & 0xe0) == 0)
	//* 127  259:iload_2         
	//* 128  260:sipush          224
	//* 129  263:iand            
	//* 130  264:ifne            278
				{
					flag2 = handleCtrl(byte0, byte1);
	//  131  267:aload_0         
	//  132  268:iload_2         
	//  133  269:iload_3         
	//  134  270:invokespecial   #298 <Method boolean handleCtrl(byte, byte)>
	//  135  273:istore          6
				} else
	//* 136  275:goto            316
				{
					currentCueBuilder.append(getChar(byte0));
	//  137  278:aload_0         
	//  138  279:getfield        #124 <Field Cea608Decoder$CueBuilder currentCueBuilder>
	//  139  282:iload_2         
	//  140  283:invokestatic    #300 <Method char getChar(byte)>
	//  141  286:invokevirtual   #213 <Method void Cea608Decoder$CueBuilder.append(char)>
					flag2 = flag;
	//  142  289:iload           5
	//  143  291:istore          6
					if((byte1 & 0xe0) != 0)
	//* 144  293:iload_3         
	//* 145  294:sipush          224
	//* 146  297:iand            
	//* 147  298:ifeq            316
					{
						currentCueBuilder.append(getChar(byte1));
	//  148  301:aload_0         
	//  149  302:getfield        #124 <Field Cea608Decoder$CueBuilder currentCueBuilder>
	//  150  305:iload_3         
	//  151  306:invokestatic    #300 <Method char getChar(byte)>
	//  152  309:invokevirtual   #213 <Method void Cea608Decoder$CueBuilder.append(char)>
						flag2 = flag;
	//  153  312:iload           5
	//  154  314:istore          6
					}
				}
				flag3 = true;
	//  155  316:iconst_1        
	//  156  317:istore          7
				flag = flag2;
	//  157  319:iload           6
	//  158  321:istore          5
			}
		} while(true);
	//  159  323:goto            32
		if(flag3)
	//* 160  326:iload           7
	//* 161  328:ifeq            365
		{
			if(!flag)
	//* 162  331:iload           5
	//* 163  333:ifne            341
				repeatableControlSet = false;
	//  164  336:aload_0         
	//  165  337:iconst_0        
	//  166  338:putfield        #179 <Field boolean repeatableControlSet>
			if(captionMode == 1 || captionMode == 3)
	//* 167  341:aload_0         
	//* 168  342:getfield        #219 <Field int captionMode>
	//* 169  345:iconst_1        
	//* 170  346:icmpeq          357
	//* 171  349:aload_0         
	//* 172  350:getfield        #219 <Field int captionMode>
	//* 173  353:iconst_3        
	//* 174  354:icmpne          365
				cues = getDisplayCues();
	//  175  357:aload_0         
	//  176  358:aload_0         
	//  177  359:invokespecial   #221 <Method List getDisplayCues()>
	//  178  362:putfield        #223 <Field List cues>
		}
	//  179  365:return          
	}

	public volatile SubtitleInputBuffer dequeueInputBuffer()
		throws SubtitleDecoderException
	{
		return super.dequeueInputBuffer();
	//    0    0:aload_0         
	//    1    1:invokespecial   #306 <Method SubtitleInputBuffer CeaDecoder.dequeueInputBuffer()>
	//    2    4:areturn         
	}

	public volatile SubtitleOutputBuffer dequeueOutputBuffer()
		throws SubtitleDecoderException
	{
		return super.dequeueOutputBuffer();
	//    0    0:aload_0         
	//    1    1:invokespecial   #311 <Method SubtitleOutputBuffer CeaDecoder.dequeueOutputBuffer()>
	//    2    4:areturn         
	}

	public void flush()
	{
		super.flush();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void CeaDecoder.flush()>
		cues = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #223 <Field List cues>
		lastCues = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #259 <Field List lastCues>
		setCaptionMode(0);
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:invokespecial   #140 <Method void setCaptionMode(int)>
		setCaptionRowCount(4);
	//   11   19:aload_0         
	//   12   20:iconst_4        
	//   13   21:invokespecial   #236 <Method void setCaptionRowCount(int)>
		resetCueBuilders();
	//   14   24:aload_0         
	//   15   25:invokespecial   #143 <Method void resetCueBuilders()>
		repeatableControlSet = false;
	//   16   28:aload_0         
	//   17   29:iconst_0        
	//   18   30:putfield        #179 <Field boolean repeatableControlSet>
		repeatableControlCc1 = 0;
	//   19   33:aload_0         
	//   20   34:iconst_0        
	//   21   35:putfield        #181 <Field byte repeatableControlCc1>
		repeatableControlCc2 = 0;
	//   22   38:aload_0         
	//   23   39:iconst_0        
	//   24   40:putfield        #183 <Field byte repeatableControlCc2>
	//   25   43:return          
	}

	public String getName()
	{
		return "Cea608Decoder";
	//    0    0:ldc2            #318 <String "Cea608Decoder">
	//    1    3:areturn         
	}

	protected boolean isNewSubtitleDataAvailable()
	{
		return cues != lastCues;
	//    0    0:aload_0         
	//    1    1:getfield        #223 <Field List cues>
	//    2    4:aload_0         
	//    3    5:getfield        #259 <Field List lastCues>
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
	//    2    2:invokespecial   #322 <Method void CeaDecoder.queueInputBuffer(SubtitleInputBuffer)>
	//    3    5:return          
	}

	public void release()
	{
	//    0    0:return          
	}

	public volatile void setPositionUs(long l)
	{
		super.setPositionUs(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #327 <Method void CeaDecoder.setPositionUs(long)>
	//    3    5:return          
	}

	private static final int BASIC_CHARACTER_SET[] = {
		32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 
		225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 
		52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 
		62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 
		72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 
		82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 
		233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 
		102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 
		112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 
		122, 231, 247, 209, 241, 9632
	};
	private static final int CC_FIELD_FLAG = 1;
	private static final byte CC_IMPLICIT_DATA_HEADER = -4;
	private static final int CC_MODE_PAINT_ON = 3;
	private static final int CC_MODE_POP_ON = 2;
	private static final int CC_MODE_ROLL_UP = 1;
	private static final int CC_MODE_UNKNOWN = 0;
	private static final int CC_TYPE_FLAG = 2;
	private static final int CC_VALID_608_ID = 4;
	private static final int CC_VALID_FLAG = 4;
	private static final int COLUMN_INDICES[] = {
		0, 4, 8, 12, 16, 20, 24, 28
	};
	private static final byte CTRL_BACKSPACE = 33;
	private static final byte CTRL_CARRIAGE_RETURN = 45;
	private static final byte CTRL_DELETE_TO_END_OF_ROW = 36;
	private static final byte CTRL_END_OF_CAPTION = 47;
	private static final byte CTRL_ERASE_DISPLAYED_MEMORY = 44;
	private static final byte CTRL_ERASE_NON_DISPLAYED_MEMORY = 46;
	private static final byte CTRL_RESUME_CAPTION_LOADING = 32;
	private static final byte CTRL_RESUME_DIRECT_CAPTIONING = 41;
	private static final byte CTRL_ROLL_UP_CAPTIONS_2_ROWS = 37;
	private static final byte CTRL_ROLL_UP_CAPTIONS_3_ROWS = 38;
	private static final byte CTRL_ROLL_UP_CAPTIONS_4_ROWS = 39;
	private static final int DEFAULT_CAPTIONS_ROW_COUNT = 4;
	private static final int NTSC_CC_FIELD_1 = 0;
	private static final int NTSC_CC_FIELD_2 = 1;
	private static final int ROW_INDICES[] = {
		11, 1, 3, 12, 14, 5, 7, 9
	};
	private static final int SPECIAL_CHARACTER_SET[] = {
		174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 
		232, 226, 234, 238, 244, 251
	};
	private static final int SPECIAL_ES_FR_CHARACTER_SET[] = {
		193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 
		8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 
		202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 
		171, 187
	};
	private static final int SPECIAL_PT_DE_CHARACTER_SET[] = {
		195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 
		125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 
		223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 
		9492, 9496
	};
	private static final int STYLE_COLORS[] = {
		-1, 0xff00ff00, 0xff0000ff, 0xff00ffff, 0xffff0000, -256, -65281
	};
	private static final int STYLE_ITALICS = 7;
	private static final int STYLE_UNCHANGED = 8;
	private int captionMode;
	private int captionRowCount;
	private final ParsableByteArray ccData = new ParsableByteArray();
	private final ArrayList cueBuilders = new ArrayList();
	private List cues;
	private CueBuilder currentCueBuilder;
	private List lastCues;
	private final int packetLength;
	private byte repeatableControlCc1;
	private byte repeatableControlCc2;
	private boolean repeatableControlSet;
	private final int selectedField;

	static 
	{
	//    0    0:bipush          8
	//    1    2:newarray        int[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:bipush          11
	//    5    8:iastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:iconst_1        
	//    9   12:iastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:iconst_3        
	//   13   16:iastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:bipush          12
	//   17   21:iastore         
	//   18   22:dup             
	//   19   23:iconst_4        
	//   20   24:bipush          14
	//   21   26:iastore         
	//   22   27:dup             
	//   23   28:iconst_5        
	//   24   29:iconst_5        
	//   25   30:iastore         
	//   26   31:dup             
	//   27   32:bipush          6
	//   28   34:bipush          7
	//   29   36:iastore         
	//   30   37:dup             
	//   31   38:bipush          7
	//   32   40:bipush          9
	//   33   42:iastore         
	//   34   43:putstatic       #87  <Field int[] ROW_INDICES>
	//   35   46:bipush          8
	//   36   48:newarray        int[]
	//   37   50:dup             
	//   38   51:iconst_0        
	//   39   52:iconst_0        
	//   40   53:iastore         
	//   41   54:dup             
	//   42   55:iconst_1        
	//   43   56:iconst_4        
	//   44   57:iastore         
	//   45   58:dup             
	//   46   59:iconst_2        
	//   47   60:bipush          8
	//   48   62:iastore         
	//   49   63:dup             
	//   50   64:iconst_3        
	//   51   65:bipush          12
	//   52   67:iastore         
	//   53   68:dup             
	//   54   69:iconst_4        
	//   55   70:bipush          16
	//   56   72:iastore         
	//   57   73:dup             
	//   58   74:iconst_5        
	//   59   75:bipush          20
	//   60   77:iastore         
	//   61   78:dup             
	//   62   79:bipush          6
	//   63   81:bipush          24
	//   64   83:iastore         
	//   65   84:dup             
	//   66   85:bipush          7
	//   67   87:bipush          28
	//   68   89:iastore         
	//   69   90:putstatic       #89  <Field int[] COLUMN_INDICES>
	//   70   93:bipush          7
	//   71   95:newarray        int[]
	//   72   97:dup             
	//   73   98:iconst_0        
	//   74   99:iconst_m1       
	//   75  100:iastore         
	//   76  101:dup             
	//   77  102:iconst_1        
	//   78  103:ldc1            #90  <Int 0xff00ff00>
	//   79  105:iastore         
	//   80  106:dup             
	//   81  107:iconst_2        
	//   82  108:ldc1            #91  <Int 0xff0000ff>
	//   83  110:iastore         
	//   84  111:dup             
	//   85  112:iconst_3        
	//   86  113:ldc1            #92  <Int 0xff00ffff>
	//   87  115:iastore         
	//   88  116:dup             
	//   89  117:iconst_4        
	//   90  118:ldc1            #93  <Int 0xffff0000>
	//   91  120:iastore         
	//   92  121:dup             
	//   93  122:iconst_5        
	//   94  123:sipush          -256
	//   95  126:iastore         
	//   96  127:dup             
	//   97  128:bipush          6
	//   98  130:ldc1            #94  <Int -65281>
	//   99  132:iastore         
	//  100  133:putstatic       #96  <Field int[] STYLE_COLORS>
	//  101  136:bipush          96
	//  102  138:newarray        int[]
	//  103  140:dup             
	//  104  141:iconst_0        
	//  105  142:bipush          32
	//  106  144:iastore         
	//  107  145:dup             
	//  108  146:iconst_1        
	//  109  147:bipush          33
	//  110  149:iastore         
	//  111  150:dup             
	//  112  151:iconst_2        
	//  113  152:bipush          34
	//  114  154:iastore         
	//  115  155:dup             
	//  116  156:iconst_3        
	//  117  157:bipush          35
	//  118  159:iastore         
	//  119  160:dup             
	//  120  161:iconst_4        
	//  121  162:bipush          36
	//  122  164:iastore         
	//  123  165:dup             
	//  124  166:iconst_5        
	//  125  167:bipush          37
	//  126  169:iastore         
	//  127  170:dup             
	//  128  171:bipush          6
	//  129  173:bipush          38
	//  130  175:iastore         
	//  131  176:dup             
	//  132  177:bipush          7
	//  133  179:bipush          39
	//  134  181:iastore         
	//  135  182:dup             
	//  136  183:bipush          8
	//  137  185:bipush          40
	//  138  187:iastore         
	//  139  188:dup             
	//  140  189:bipush          9
	//  141  191:bipush          41
	//  142  193:iastore         
	//  143  194:dup             
	//  144  195:bipush          10
	//  145  197:sipush          225
	//  146  200:iastore         
	//  147  201:dup             
	//  148  202:bipush          11
	//  149  204:bipush          43
	//  150  206:iastore         
	//  151  207:dup             
	//  152  208:bipush          12
	//  153  210:bipush          44
	//  154  212:iastore         
	//  155  213:dup             
	//  156  214:bipush          13
	//  157  216:bipush          45
	//  158  218:iastore         
	//  159  219:dup             
	//  160  220:bipush          14
	//  161  222:bipush          46
	//  162  224:iastore         
	//  163  225:dup             
	//  164  226:bipush          15
	//  165  228:bipush          47
	//  166  230:iastore         
	//  167  231:dup             
	//  168  232:bipush          16
	//  169  234:bipush          48
	//  170  236:iastore         
	//  171  237:dup             
	//  172  238:bipush          17
	//  173  240:bipush          49
	//  174  242:iastore         
	//  175  243:dup             
	//  176  244:bipush          18
	//  177  246:bipush          50
	//  178  248:iastore         
	//  179  249:dup             
	//  180  250:bipush          19
	//  181  252:bipush          51
	//  182  254:iastore         
	//  183  255:dup             
	//  184  256:bipush          20
	//  185  258:bipush          52
	//  186  260:iastore         
	//  187  261:dup             
	//  188  262:bipush          21
	//  189  264:bipush          53
	//  190  266:iastore         
	//  191  267:dup             
	//  192  268:bipush          22
	//  193  270:bipush          54
	//  194  272:iastore         
	//  195  273:dup             
	//  196  274:bipush          23
	//  197  276:bipush          55
	//  198  278:iastore         
	//  199  279:dup             
	//  200  280:bipush          24
	//  201  282:bipush          56
	//  202  284:iastore         
	//  203  285:dup             
	//  204  286:bipush          25
	//  205  288:bipush          57
	//  206  290:iastore         
	//  207  291:dup             
	//  208  292:bipush          26
	//  209  294:bipush          58
	//  210  296:iastore         
	//  211  297:dup             
	//  212  298:bipush          27
	//  213  300:bipush          59
	//  214  302:iastore         
	//  215  303:dup             
	//  216  304:bipush          28
	//  217  306:bipush          60
	//  218  308:iastore         
	//  219  309:dup             
	//  220  310:bipush          29
	//  221  312:bipush          61
	//  222  314:iastore         
	//  223  315:dup             
	//  224  316:bipush          30
	//  225  318:bipush          62
	//  226  320:iastore         
	//  227  321:dup             
	//  228  322:bipush          31
	//  229  324:bipush          63
	//  230  326:iastore         
	//  231  327:dup             
	//  232  328:bipush          32
	//  233  330:bipush          64
	//  234  332:iastore         
	//  235  333:dup             
	//  236  334:bipush          33
	//  237  336:bipush          65
	//  238  338:iastore         
	//  239  339:dup             
	//  240  340:bipush          34
	//  241  342:bipush          66
	//  242  344:iastore         
	//  243  345:dup             
	//  244  346:bipush          35
	//  245  348:bipush          67
	//  246  350:iastore         
	//  247  351:dup             
	//  248  352:bipush          36
	//  249  354:bipush          68
	//  250  356:iastore         
	//  251  357:dup             
	//  252  358:bipush          37
	//  253  360:bipush          69
	//  254  362:iastore         
	//  255  363:dup             
	//  256  364:bipush          38
	//  257  366:bipush          70
	//  258  368:iastore         
	//  259  369:dup             
	//  260  370:bipush          39
	//  261  372:bipush          71
	//  262  374:iastore         
	//  263  375:dup             
	//  264  376:bipush          40
	//  265  378:bipush          72
	//  266  380:iastore         
	//  267  381:dup             
	//  268  382:bipush          41
	//  269  384:bipush          73
	//  270  386:iastore         
	//  271  387:dup             
	//  272  388:bipush          42
	//  273  390:bipush          74
	//  274  392:iastore         
	//  275  393:dup             
	//  276  394:bipush          43
	//  277  396:bipush          75
	//  278  398:iastore         
	//  279  399:dup             
	//  280  400:bipush          44
	//  281  402:bipush          76
	//  282  404:iastore         
	//  283  405:dup             
	//  284  406:bipush          45
	//  285  408:bipush          77
	//  286  410:iastore         
	//  287  411:dup             
	//  288  412:bipush          46
	//  289  414:bipush          78
	//  290  416:iastore         
	//  291  417:dup             
	//  292  418:bipush          47
	//  293  420:bipush          79
	//  294  422:iastore         
	//  295  423:dup             
	//  296  424:bipush          48
	//  297  426:bipush          80
	//  298  428:iastore         
	//  299  429:dup             
	//  300  430:bipush          49
	//  301  432:bipush          81
	//  302  434:iastore         
	//  303  435:dup             
	//  304  436:bipush          50
	//  305  438:bipush          82
	//  306  440:iastore         
	//  307  441:dup             
	//  308  442:bipush          51
	//  309  444:bipush          83
	//  310  446:iastore         
	//  311  447:dup             
	//  312  448:bipush          52
	//  313  450:bipush          84
	//  314  452:iastore         
	//  315  453:dup             
	//  316  454:bipush          53
	//  317  456:bipush          85
	//  318  458:iastore         
	//  319  459:dup             
	//  320  460:bipush          54
	//  321  462:bipush          86
	//  322  464:iastore         
	//  323  465:dup             
	//  324  466:bipush          55
	//  325  468:bipush          87
	//  326  470:iastore         
	//  327  471:dup             
	//  328  472:bipush          56
	//  329  474:bipush          88
	//  330  476:iastore         
	//  331  477:dup             
	//  332  478:bipush          57
	//  333  480:bipush          89
	//  334  482:iastore         
	//  335  483:dup             
	//  336  484:bipush          58
	//  337  486:bipush          90
	//  338  488:iastore         
	//  339  489:dup             
	//  340  490:bipush          59
	//  341  492:bipush          91
	//  342  494:iastore         
	//  343  495:dup             
	//  344  496:bipush          60
	//  345  498:sipush          233
	//  346  501:iastore         
	//  347  502:dup             
	//  348  503:bipush          61
	//  349  505:bipush          93
	//  350  507:iastore         
	//  351  508:dup             
	//  352  509:bipush          62
	//  353  511:sipush          237
	//  354  514:iastore         
	//  355  515:dup             
	//  356  516:bipush          63
	//  357  518:sipush          243
	//  358  521:iastore         
	//  359  522:dup             
	//  360  523:bipush          64
	//  361  525:sipush          250
	//  362  528:iastore         
	//  363  529:dup             
	//  364  530:bipush          65
	//  365  532:bipush          97
	//  366  534:iastore         
	//  367  535:dup             
	//  368  536:bipush          66
	//  369  538:bipush          98
	//  370  540:iastore         
	//  371  541:dup             
	//  372  542:bipush          67
	//  373  544:bipush          99
	//  374  546:iastore         
	//  375  547:dup             
	//  376  548:bipush          68
	//  377  550:bipush          100
	//  378  552:iastore         
	//  379  553:dup             
	//  380  554:bipush          69
	//  381  556:bipush          101
	//  382  558:iastore         
	//  383  559:dup             
	//  384  560:bipush          70
	//  385  562:bipush          102
	//  386  564:iastore         
	//  387  565:dup             
	//  388  566:bipush          71
	//  389  568:bipush          103
	//  390  570:iastore         
	//  391  571:dup             
	//  392  572:bipush          72
	//  393  574:bipush          104
	//  394  576:iastore         
	//  395  577:dup             
	//  396  578:bipush          73
	//  397  580:bipush          105
	//  398  582:iastore         
	//  399  583:dup             
	//  400  584:bipush          74
	//  401  586:bipush          106
	//  402  588:iastore         
	//  403  589:dup             
	//  404  590:bipush          75
	//  405  592:bipush          107
	//  406  594:iastore         
	//  407  595:dup             
	//  408  596:bipush          76
	//  409  598:bipush          108
	//  410  600:iastore         
	//  411  601:dup             
	//  412  602:bipush          77
	//  413  604:bipush          109
	//  414  606:iastore         
	//  415  607:dup             
	//  416  608:bipush          78
	//  417  610:bipush          110
	//  418  612:iastore         
	//  419  613:dup             
	//  420  614:bipush          79
	//  421  616:bipush          111
	//  422  618:iastore         
	//  423  619:dup             
	//  424  620:bipush          80
	//  425  622:bipush          112
	//  426  624:iastore         
	//  427  625:dup             
	//  428  626:bipush          81
	//  429  628:bipush          113
	//  430  630:iastore         
	//  431  631:dup             
	//  432  632:bipush          82
	//  433  634:bipush          114
	//  434  636:iastore         
	//  435  637:dup             
	//  436  638:bipush          83
	//  437  640:bipush          115
	//  438  642:iastore         
	//  439  643:dup             
	//  440  644:bipush          84
	//  441  646:bipush          116
	//  442  648:iastore         
	//  443  649:dup             
	//  444  650:bipush          85
	//  445  652:bipush          117
	//  446  654:iastore         
	//  447  655:dup             
	//  448  656:bipush          86
	//  449  658:bipush          118
	//  450  660:iastore         
	//  451  661:dup             
	//  452  662:bipush          87
	//  453  664:bipush          119
	//  454  666:iastore         
	//  455  667:dup             
	//  456  668:bipush          88
	//  457  670:bipush          120
	//  458  672:iastore         
	//  459  673:dup             
	//  460  674:bipush          89
	//  461  676:bipush          121
	//  462  678:iastore         
	//  463  679:dup             
	//  464  680:bipush          90
	//  465  682:bipush          122
	//  466  684:iastore         
	//  467  685:dup             
	//  468  686:bipush          91
	//  469  688:sipush          231
	//  470  691:iastore         
	//  471  692:dup             
	//  472  693:bipush          92
	//  473  695:sipush          247
	//  474  698:iastore         
	//  475  699:dup             
	//  476  700:bipush          93
	//  477  702:sipush          209
	//  478  705:iastore         
	//  479  706:dup             
	//  480  707:bipush          94
	//  481  709:sipush          241
	//  482  712:iastore         
	//  483  713:dup             
	//  484  714:bipush          95
	//  485  716:sipush          9632
	//  486  719:iastore         
	//  487  720:putstatic       #98  <Field int[] BASIC_CHARACTER_SET>
	//  488  723:bipush          16
	//  489  725:newarray        int[]
	//  490  727:dup             
	//  491  728:iconst_0        
	//  492  729:sipush          174
	//  493  732:iastore         
	//  494  733:dup             
	//  495  734:iconst_1        
	//  496  735:sipush          176
	//  497  738:iastore         
	//  498  739:dup             
	//  499  740:iconst_2        
	//  500  741:sipush          189
	//  501  744:iastore         
	//  502  745:dup             
	//  503  746:iconst_3        
	//  504  747:sipush          191
	//  505  750:iastore         
	//  506  751:dup             
	//  507  752:iconst_4        
	//  508  753:sipush          8482
	//  509  756:iastore         
	//  510  757:dup             
	//  511  758:iconst_5        
	//  512  759:sipush          162
	//  513  762:iastore         
	//  514  763:dup             
	//  515  764:bipush          6
	//  516  766:sipush          163
	//  517  769:iastore         
	//  518  770:dup             
	//  519  771:bipush          7
	//  520  773:sipush          9834
	//  521  776:iastore         
	//  522  777:dup             
	//  523  778:bipush          8
	//  524  780:sipush          224
	//  525  783:iastore         
	//  526  784:dup             
	//  527  785:bipush          9
	//  528  787:bipush          32
	//  529  789:iastore         
	//  530  790:dup             
	//  531  791:bipush          10
	//  532  793:sipush          232
	//  533  796:iastore         
	//  534  797:dup             
	//  535  798:bipush          11
	//  536  800:sipush          226
	//  537  803:iastore         
	//  538  804:dup             
	//  539  805:bipush          12
	//  540  807:sipush          234
	//  541  810:iastore         
	//  542  811:dup             
	//  543  812:bipush          13
	//  544  814:sipush          238
	//  545  817:iastore         
	//  546  818:dup             
	//  547  819:bipush          14
	//  548  821:sipush          244
	//  549  824:iastore         
	//  550  825:dup             
	//  551  826:bipush          15
	//  552  828:sipush          251
	//  553  831:iastore         
	//  554  832:putstatic       #100 <Field int[] SPECIAL_CHARACTER_SET>
	//  555  835:bipush          32
	//  556  837:newarray        int[]
	//  557  839:dup             
	//  558  840:iconst_0        
	//  559  841:sipush          193
	//  560  844:iastore         
	//  561  845:dup             
	//  562  846:iconst_1        
	//  563  847:sipush          201
	//  564  850:iastore         
	//  565  851:dup             
	//  566  852:iconst_2        
	//  567  853:sipush          211
	//  568  856:iastore         
	//  569  857:dup             
	//  570  858:iconst_3        
	//  571  859:sipush          218
	//  572  862:iastore         
	//  573  863:dup             
	//  574  864:iconst_4        
	//  575  865:sipush          220
	//  576  868:iastore         
	//  577  869:dup             
	//  578  870:iconst_5        
	//  579  871:sipush          252
	//  580  874:iastore         
	//  581  875:dup             
	//  582  876:bipush          6
	//  583  878:sipush          8216
	//  584  881:iastore         
	//  585  882:dup             
	//  586  883:bipush          7
	//  587  885:sipush          161
	//  588  888:iastore         
	//  589  889:dup             
	//  590  890:bipush          8
	//  591  892:bipush          42
	//  592  894:iastore         
	//  593  895:dup             
	//  594  896:bipush          9
	//  595  898:bipush          39
	//  596  900:iastore         
	//  597  901:dup             
	//  598  902:bipush          10
	//  599  904:sipush          8212
	//  600  907:iastore         
	//  601  908:dup             
	//  602  909:bipush          11
	//  603  911:sipush          169
	//  604  914:iastore         
	//  605  915:dup             
	//  606  916:bipush          12
	//  607  918:sipush          8480
	//  608  921:iastore         
	//  609  922:dup             
	//  610  923:bipush          13
	//  611  925:sipush          8226
	//  612  928:iastore         
	//  613  929:dup             
	//  614  930:bipush          14
	//  615  932:sipush          8220
	//  616  935:iastore         
	//  617  936:dup             
	//  618  937:bipush          15
	//  619  939:sipush          8221
	//  620  942:iastore         
	//  621  943:dup             
	//  622  944:bipush          16
	//  623  946:sipush          192
	//  624  949:iastore         
	//  625  950:dup             
	//  626  951:bipush          17
	//  627  953:sipush          194
	//  628  956:iastore         
	//  629  957:dup             
	//  630  958:bipush          18
	//  631  960:sipush          199
	//  632  963:iastore         
	//  633  964:dup             
	//  634  965:bipush          19
	//  635  967:sipush          200
	//  636  970:iastore         
	//  637  971:dup             
	//  638  972:bipush          20
	//  639  974:sipush          202
	//  640  977:iastore         
	//  641  978:dup             
	//  642  979:bipush          21
	//  643  981:sipush          203
	//  644  984:iastore         
	//  645  985:dup             
	//  646  986:bipush          22
	//  647  988:sipush          235
	//  648  991:iastore         
	//  649  992:dup             
	//  650  993:bipush          23
	//  651  995:sipush          206
	//  652  998:iastore         
	//  653  999:dup             
	//  654 1000:bipush          24
	//  655 1002:sipush          207
	//  656 1005:iastore         
	//  657 1006:dup             
	//  658 1007:bipush          25
	//  659 1009:sipush          239
	//  660 1012:iastore         
	//  661 1013:dup             
	//  662 1014:bipush          26
	//  663 1016:sipush          212
	//  664 1019:iastore         
	//  665 1020:dup             
	//  666 1021:bipush          27
	//  667 1023:sipush          217
	//  668 1026:iastore         
	//  669 1027:dup             
	//  670 1028:bipush          28
	//  671 1030:sipush          249
	//  672 1033:iastore         
	//  673 1034:dup             
	//  674 1035:bipush          29
	//  675 1037:sipush          219
	//  676 1040:iastore         
	//  677 1041:dup             
	//  678 1042:bipush          30
	//  679 1044:sipush          171
	//  680 1047:iastore         
	//  681 1048:dup             
	//  682 1049:bipush          31
	//  683 1051:sipush          187
	//  684 1054:iastore         
	//  685 1055:putstatic       #102 <Field int[] SPECIAL_ES_FR_CHARACTER_SET>
	//  686 1058:bipush          32
	//  687 1060:newarray        int[]
	//  688 1062:dup             
	//  689 1063:iconst_0        
	//  690 1064:sipush          195
	//  691 1067:iastore         
	//  692 1068:dup             
	//  693 1069:iconst_1        
	//  694 1070:sipush          227
	//  695 1073:iastore         
	//  696 1074:dup             
	//  697 1075:iconst_2        
	//  698 1076:sipush          205
	//  699 1079:iastore         
	//  700 1080:dup             
	//  701 1081:iconst_3        
	//  702 1082:sipush          204
	//  703 1085:iastore         
	//  704 1086:dup             
	//  705 1087:iconst_4        
	//  706 1088:sipush          236
	//  707 1091:iastore         
	//  708 1092:dup             
	//  709 1093:iconst_5        
	//  710 1094:sipush          210
	//  711 1097:iastore         
	//  712 1098:dup             
	//  713 1099:bipush          6
	//  714 1101:sipush          242
	//  715 1104:iastore         
	//  716 1105:dup             
	//  717 1106:bipush          7
	//  718 1108:sipush          213
	//  719 1111:iastore         
	//  720 1112:dup             
	//  721 1113:bipush          8
	//  722 1115:sipush          245
	//  723 1118:iastore         
	//  724 1119:dup             
	//  725 1120:bipush          9
	//  726 1122:bipush          123
	//  727 1124:iastore         
	//  728 1125:dup             
	//  729 1126:bipush          10
	//  730 1128:bipush          125
	//  731 1130:iastore         
	//  732 1131:dup             
	//  733 1132:bipush          11
	//  734 1134:bipush          92
	//  735 1136:iastore         
	//  736 1137:dup             
	//  737 1138:bipush          12
	//  738 1140:bipush          94
	//  739 1142:iastore         
	//  740 1143:dup             
	//  741 1144:bipush          13
	//  742 1146:bipush          95
	//  743 1148:iastore         
	//  744 1149:dup             
	//  745 1150:bipush          14
	//  746 1152:bipush          124
	//  747 1154:iastore         
	//  748 1155:dup             
	//  749 1156:bipush          15
	//  750 1158:bipush          126
	//  751 1160:iastore         
	//  752 1161:dup             
	//  753 1162:bipush          16
	//  754 1164:sipush          196
	//  755 1167:iastore         
	//  756 1168:dup             
	//  757 1169:bipush          17
	//  758 1171:sipush          228
	//  759 1174:iastore         
	//  760 1175:dup             
	//  761 1176:bipush          18
	//  762 1178:sipush          214
	//  763 1181:iastore         
	//  764 1182:dup             
	//  765 1183:bipush          19
	//  766 1185:sipush          246
	//  767 1188:iastore         
	//  768 1189:dup             
	//  769 1190:bipush          20
	//  770 1192:sipush          223
	//  771 1195:iastore         
	//  772 1196:dup             
	//  773 1197:bipush          21
	//  774 1199:sipush          165
	//  775 1202:iastore         
	//  776 1203:dup             
	//  777 1204:bipush          22
	//  778 1206:sipush          164
	//  779 1209:iastore         
	//  780 1210:dup             
	//  781 1211:bipush          23
	//  782 1213:sipush          9474
	//  783 1216:iastore         
	//  784 1217:dup             
	//  785 1218:bipush          24
	//  786 1220:sipush          197
	//  787 1223:iastore         
	//  788 1224:dup             
	//  789 1225:bipush          25
	//  790 1227:sipush          229
	//  791 1230:iastore         
	//  792 1231:dup             
	//  793 1232:bipush          26
	//  794 1234:sipush          216
	//  795 1237:iastore         
	//  796 1238:dup             
	//  797 1239:bipush          27
	//  798 1241:sipush          248
	//  799 1244:iastore         
	//  800 1245:dup             
	//  801 1246:bipush          28
	//  802 1248:sipush          9484
	//  803 1251:iastore         
	//  804 1252:dup             
	//  805 1253:bipush          29
	//  806 1255:sipush          9488
	//  807 1258:iastore         
	//  808 1259:dup             
	//  809 1260:bipush          30
	//  810 1262:sipush          9492
	//  811 1265:iastore         
	//  812 1266:dup             
	//  813 1267:bipush          31
	//  814 1269:sipush          9496
	//  815 1272:iastore         
	//  816 1273:putstatic       #104 <Field int[] SPECIAL_PT_DE_CHARACTER_SET>
	//* 817 1276:return          
	}


/*
	static int[] access$000()
	{
		return STYLE_COLORS;
	//    0    0:getstatic       #96  <Field int[] STYLE_COLORS>
	//    1    3:areturn         
	}

*/
}
