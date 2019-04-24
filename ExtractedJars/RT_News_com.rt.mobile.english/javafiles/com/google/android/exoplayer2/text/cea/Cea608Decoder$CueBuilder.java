// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.cea;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.*;
import com.google.android.exoplayer2.text.Cue;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.text.cea:
//			Cea608Decoder

private static class Cea608Decoder$CueBuilder
{
	private static class CueStyle
	{

		public int start;
		public final int style;
		public final boolean underline;

		public CueStyle(int i, boolean flag, int j)
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
					k = Cea608Decoder.access$000()[i1];
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

	public Cea608Decoder$CueBuilder(int i, int j)
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
