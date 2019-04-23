// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.eia608;

import android.os.*;
import com.google.android.exoplayer.*;
import com.google.android.exoplayer.text.Cue;
import com.google.android.exoplayer.text.TextRenderer;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.util.Collections;
import java.util.TreeSet;

// Referenced classes of package com.google.android.exoplayer.text.eia608:
//			Eia608Parser, ClosedCaptionList, ClosedCaption, ClosedCaptionCtrl, 
//			ClosedCaptionText

public final class Eia608TrackRenderer extends SampleSourceTrackRenderer
	implements android.os.Handler.Callback
{

	public Eia608TrackRenderer(SampleSource samplesource, TextRenderer textrenderer, Looper looper)
	{
		super(new SampleSource[] {
			samplesource
		});
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:anewarray       SampleSource[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:aastore         
	//    7    9:invokespecial   #51  <Method void SampleSourceTrackRenderer(SampleSource[])>
		textRenderer = (TextRenderer)Assertions.checkNotNull(((Object) (textrenderer)));
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:invokestatic    #57  <Method Object Assertions.checkNotNull(Object)>
	//   11   17:checkcast       #59  <Class TextRenderer>
	//   12   20:putfield        #61  <Field TextRenderer textRenderer>
		if(looper == null)
	//*  13   23:aload_3         
	//*  14   24:ifnonnull       32
			samplesource = null;
	//   15   27:aconst_null     
	//   16   28:astore_1        
		else
	//*  17   29:goto            42
			samplesource = ((SampleSource) (new Handler(looper, ((android.os.Handler.Callback) (this)))));
	//   18   32:new             #63  <Class Handler>
	//   19   35:dup             
	//   20   36:aload_3         
	//   21   37:aload_0         
	//   22   38:invokespecial   #66  <Method void Handler(Looper, android.os.Handler$Callback)>
	//   23   41:astore_1        
		textRendererHandler = ((Handler) (samplesource));
	//   24   42:aload_0         
	//   25   43:aload_1         
	//   26   44:putfield        #68  <Field Handler textRendererHandler>
	//   27   47:aload_0         
	//   28   48:new             #70  <Class Eia608Parser>
	//   29   51:dup             
	//   30   52:invokespecial   #73  <Method void Eia608Parser()>
	//   31   55:putfield        #75  <Field Eia608Parser eia608Parser>
	//   32   58:aload_0         
	//   33   59:new             #77  <Class MediaFormatHolder>
	//   34   62:dup             
	//   35   63:invokespecial   #78  <Method void MediaFormatHolder()>
	//   36   66:putfield        #80  <Field MediaFormatHolder formatHolder>
	//   37   69:aload_0         
	//   38   70:new             #82  <Class SampleHolder>
	//   39   73:dup             
	//   40   74:iconst_1        
	//   41   75:invokespecial   #85  <Method void SampleHolder(int)>
	//   42   78:putfield        #87  <Field SampleHolder sampleHolder>
	//   43   81:aload_0         
	//   44   82:new             #89  <Class StringBuilder>
	//   45   85:dup             
	//   46   86:invokespecial   #90  <Method void StringBuilder()>
	//   47   89:putfield        #92  <Field StringBuilder captionStringBuilder>
	//   48   92:aload_0         
	//   49   93:new             #94  <Class TreeSet>
	//   50   96:dup             
	//   51   97:invokespecial   #95  <Method void TreeSet()>
	//   52  100:putfield        #97  <Field TreeSet pendingCaptionLists>
	//   53  103:return          
	}

	private void clearPendingSample()
	{
		SampleHolder sampleholder = sampleHolder;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field SampleHolder sampleHolder>
	//    2    4:astore_1        
		sampleholder.timeUs = -1L;
	//    3    5:aload_1         
	//    4    6:ldc2w           #100 <Long -1L>
	//    5    9:putfield        #105 <Field long SampleHolder.timeUs>
		sampleholder.clearData();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #108 <Method void SampleHolder.clearData()>
	//    8   16:return          
	}

	private void consumeCaptionList(ClosedCaptionList closedcaptionlist)
	{
		int k = closedcaptionlist.captions.length;
	//    0    0:aload_1         
	//    1    1:getfield        #116 <Field ClosedCaption[] ClosedCaptionList.captions>
	//    2    4:arraylength     
	//    3    5:istore          5
		if(k == 0)
	//*   4    7:iload           5
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		int j = 0;
	//    7   13:iconst_0        
	//    8   14:istore_3        
		int i = j;
	//    9   15:iload_3         
	//   10   16:istore_2        
label0:
		do
		{
label1:
			{
				boolean flag = true;
	//   11   17:iconst_1        
	//   12   18:istore          4
				if(j >= k)
					break label0;
	//   13   20:iload_3         
	//   14   21:iload           5
	//   15   23:icmpge          180
				Object obj = ((Object) (closedcaptionlist.captions[j]));
	//   16   26:aload_1         
	//   17   27:getfield        #116 <Field ClosedCaption[] ClosedCaptionList.captions>
	//   18   30:iload_3         
	//   19   31:aaload          
	//   20   32:astore          6
				if(((ClosedCaption) (obj)).type == 0)
	//*  21   34:aload           6
	//*  22   36:getfield        #121 <Field int ClosedCaption.type>
	//*  23   39:ifne            164
				{
					obj = ((Object) ((ClosedCaptionCtrl)obj));
	//   24   42:aload           6
	//   25   44:checkcast       #123 <Class ClosedCaptionCtrl>
	//   26   47:astore          6
					if(k == 1 && ((ClosedCaptionCtrl) (obj)).isRepeatable())
	//*  27   49:iload           5
	//*  28   51:iconst_1        
	//*  29   52:icmpne          69
	//*  30   55:aload           6
	//*  31   57:invokevirtual   #127 <Method boolean ClosedCaptionCtrl.isRepeatable()>
	//*  32   60:ifeq            69
						i = ((int) (flag));
	//   33   63:iload           4
	//   34   65:istore_2        
					else
	//*  35   66:goto            71
						i = 0;
	//   36   69:iconst_0        
	//   37   70:istore_2        
					if(i != 0)
	//*  38   71:iload_2         
	//*  39   72:ifeq            122
					{
						ClosedCaptionCtrl closedcaptionctrl = repeatableControl;
	//   40   75:aload_0         
	//   41   76:getfield        #129 <Field ClosedCaptionCtrl repeatableControl>
	//   42   79:astore          7
						if(closedcaptionctrl != null && closedcaptionctrl.cc1 == ((ClosedCaptionCtrl) (obj)).cc1 && repeatableControl.cc2 == ((ClosedCaptionCtrl) (obj)).cc2)
	//*  43   81:aload           7
	//*  44   83:ifnull          122
	//*  45   86:aload           7
	//*  46   88:getfield        #133 <Field byte ClosedCaptionCtrl.cc1>
	//*  47   91:aload           6
	//*  48   93:getfield        #133 <Field byte ClosedCaptionCtrl.cc1>
	//*  49   96:icmpne          122
	//*  50   99:aload_0         
	//*  51  100:getfield        #129 <Field ClosedCaptionCtrl repeatableControl>
	//*  52  103:getfield        #136 <Field byte ClosedCaptionCtrl.cc2>
	//*  53  106:aload           6
	//*  54  108:getfield        #136 <Field byte ClosedCaptionCtrl.cc2>
	//*  55  111:icmpne          122
						{
							repeatableControl = null;
	//   56  114:aload_0         
	//   57  115:aconst_null     
	//   58  116:putfield        #129 <Field ClosedCaptionCtrl repeatableControl>
							break label1;
	//   59  119:goto            161
						}
					}
					if(i != 0)
	//*  60  122:iload_2         
	//*  61  123:ifeq            132
						repeatableControl = ((ClosedCaptionCtrl) (obj));
	//   62  126:aload_0         
	//   63  127:aload           6
	//   64  129:putfield        #129 <Field ClosedCaptionCtrl repeatableControl>
					if(((ClosedCaptionCtrl) (obj)).isMiscCode())
	//*  65  132:aload           6
	//*  66  134:invokevirtual   #139 <Method boolean ClosedCaptionCtrl.isMiscCode()>
	//*  67  137:ifeq            149
						handleMiscCode(((ClosedCaptionCtrl) (obj)));
	//   68  140:aload_0         
	//   69  141:aload           6
	//   70  143:invokespecial   #143 <Method void handleMiscCode(ClosedCaptionCtrl)>
					else
	//*  71  146:goto            161
					if(((ClosedCaptionCtrl) (obj)).isPreambleAddressCode())
	//*  72  149:aload           6
	//*  73  151:invokevirtual   #146 <Method boolean ClosedCaptionCtrl.isPreambleAddressCode()>
	//*  74  154:ifeq            161
						handlePreambleAddressCode();
	//   75  157:aload_0         
	//   76  158:invokespecial   #149 <Method void handlePreambleAddressCode()>
				} else
	//*  77  161:goto            173
				{
					handleText((ClosedCaptionText)obj);
	//   78  164:aload_0         
	//   79  165:aload           6
	//   80  167:checkcast       #151 <Class ClosedCaptionText>
	//   81  170:invokespecial   #155 <Method void handleText(ClosedCaptionText)>
				}
			}
			j++;
	//   82  173:iload_3         
	//   83  174:iconst_1        
	//   84  175:iadd            
	//   85  176:istore_3        
		} while(true);
	//   86  177:goto            17
		if(i == 0)
	//*  87  180:iload_2         
	//*  88  181:ifne            189
			repeatableControl = null;
	//   89  184:aload_0         
	//   90  185:aconst_null     
	//   91  186:putfield        #129 <Field ClosedCaptionCtrl repeatableControl>
		i = captionMode;
	//   92  189:aload_0         
	//   93  190:getfield        #157 <Field int captionMode>
	//   94  193:istore_2        
		if(i == 1 || i == 3)
	//*  95  194:iload_2         
	//*  96  195:iconst_1        
	//*  97  196:icmpeq          204
	//*  98  199:iload_2         
	//*  99  200:iconst_3        
	//* 100  201:icmpne          212
			caption = getDisplayCaption();
	//  101  204:aload_0         
	//  102  205:aload_0         
	//  103  206:invokespecial   #161 <Method String getDisplayCaption()>
	//  104  209:putfield        #163 <Field String caption>
	//  105  212:return          
	}

	private String getDisplayCaption()
	{
		int i = captionStringBuilder.length();
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field StringBuilder captionStringBuilder>
	//    2    4:invokevirtual   #167 <Method int StringBuilder.length()>
	//    3    7:istore_1        
		if(i == 0)
	//*   4    8:iload_1         
	//*   5    9:ifne            14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		StringBuilder stringbuilder = captionStringBuilder;
	//    8   14:aload_0         
	//    9   15:getfield        #92  <Field StringBuilder captionStringBuilder>
	//   10   18:astore          4
		int l = i - 1;
	//   11   20:iload_1         
	//   12   21:iconst_1        
	//   13   22:isub            
	//   14   23:istore_3        
		boolean flag;
		if(stringbuilder.charAt(l) == '\n')
	//*  15   24:aload           4
	//*  16   26:iload_3         
	//*  17   27:invokevirtual   #171 <Method char StringBuilder.charAt(int)>
	//*  18   30:bipush          10
	//*  19   32:icmpne          40
			flag = true;
	//   20   35:iconst_1        
	//   21   36:istore_2        
		else
	//*  22   37:goto            42
			flag = false;
	//   23   40:iconst_0        
	//   24   41:istore_2        
		if(i == 1 && flag)
	//*  25   42:iload_1         
	//*  26   43:iconst_1        
	//*  27   44:icmpne          53
	//*  28   47:iload_2         
	//*  29   48:ifeq            53
			return null;
	//   30   51:aconst_null     
	//   31   52:areturn         
		if(flag)
	//*  32   53:iload_2         
	//*  33   54:ifeq            59
			i = l;
	//   34   57:iload_3         
	//   35   58:istore_1        
		if(captionMode != 1)
	//*  36   59:aload_0         
	//*  37   60:getfield        #157 <Field int captionMode>
	//*  38   63:iconst_1        
	//*  39   64:icmpeq          77
			return captionStringBuilder.substring(0, i);
	//   40   67:aload_0         
	//   41   68:getfield        #92  <Field StringBuilder captionStringBuilder>
	//   42   71:iconst_0        
	//   43   72:iload_1         
	//   44   73:invokevirtual   #175 <Method String StringBuilder.substring(int, int)>
	//   45   76:areturn         
		l = i;
	//   46   77:iload_1         
	//   47   78:istore_3        
		for(int j = 0; j < captionRowCount && l != -1; j++)
	//*  48   79:iconst_0        
	//*  49   80:istore_2        
	//*  50   81:iload_2         
	//*  51   82:aload_0         
	//*  52   83:getfield        #177 <Field int captionRowCount>
	//*  53   86:icmpge          114
	//*  54   89:iload_3         
	//*  55   90:iconst_m1       
	//*  56   91:icmpeq          114
			l = captionStringBuilder.lastIndexOf("\n", l - 1);
	//   57   94:aload_0         
	//   58   95:getfield        #92  <Field StringBuilder captionStringBuilder>
	//   59   98:ldc1            #179 <String "\n">
	//   60  100:iload_3         
	//   61  101:iconst_1        
	//   62  102:isub            
	//   63  103:invokevirtual   #183 <Method int StringBuilder.lastIndexOf(String, int)>
	//   64  106:istore_3        

	//   65  107:iload_2         
	//   66  108:iconst_1        
	//   67  109:iadd            
	//   68  110:istore_2        
	//*  69  111:goto            81
		int k;
		if(l != -1)
	//*  70  114:iload_3         
	//*  71  115:iconst_m1       
	//*  72  116:icmpeq          126
			k = l + 1;
	//   73  119:iload_3         
	//   74  120:iconst_1        
	//   75  121:iadd            
	//   76  122:istore_2        
		else
	//*  77  123:goto            128
			k = 0;
	//   78  126:iconst_0        
	//   79  127:istore_2        
		captionStringBuilder.delete(0, k);
	//   80  128:aload_0         
	//   81  129:getfield        #92  <Field StringBuilder captionStringBuilder>
	//   82  132:iconst_0        
	//   83  133:iload_2         
	//   84  134:invokevirtual   #187 <Method StringBuilder StringBuilder.delete(int, int)>
	//   85  137:pop             
		return captionStringBuilder.substring(0, i - k);
	//   86  138:aload_0         
	//   87  139:getfield        #92  <Field StringBuilder captionStringBuilder>
	//   88  142:iconst_0        
	//   89  143:iload_1         
	//   90  144:iload_2         
	//   91  145:isub            
	//   92  146:invokevirtual   #175 <Method String StringBuilder.substring(int, int)>
	//   93  149:areturn         
	}

	private void handleMiscCode(ClosedCaptionCtrl closedcaptionctrl)
	{
		byte byte0 = closedcaptionctrl.cc2;
	//    0    0:aload_1         
	//    1    1:getfield        #136 <Field byte ClosedCaptionCtrl.cc2>
	//    2    4:istore_2        
		if(byte0 != 32)
	//*   3    5:iload_2         
	//*   4    6:bipush          32
	//*   5    8:icmpeq          222
		{
			if(byte0 != 41)
	//*   6   11:iload_2         
	//*   7   12:bipush          41
	//*   8   14:icmpeq          216
			{
				switch(byte0)
	//*   9   17:iload_2         
				{
	//*  10   18:tableswitch     37 39: default 44
	//	               37 205
	//	               38 194
	//	               39 183
				default:
					if(captionMode == 0)
	//*  11   44:aload_0         
	//*  12   45:getfield        #157 <Field int captionMode>
	//*  13   48:ifne            52
						return;
	//   14   51:return          
					int i = ((int) (closedcaptionctrl.cc2));
	//   15   52:aload_1         
	//   16   53:getfield        #136 <Field byte ClosedCaptionCtrl.cc2>
	//   17   56:istore_2        
					if(i != 33)
	//*  18   57:iload_2         
	//*  19   58:bipush          33
	//*  20   60:icmpeq          157
					{
						switch(i)
	//*  21   63:iload_2         
						{
	//*  22   64:tableswitch     44 47: default 96
	//	               44 128
	//	               45 123
	//	               46 114
	//	               47 97
						default:
							return;
	//   23   96:return          

						case 47: // '/'
							caption = getDisplayCaption();
	//   24   97:aload_0         
	//   25   98:aload_0         
	//   26   99:invokespecial   #161 <Method String getDisplayCaption()>
	//   27  102:putfield        #163 <Field String caption>
							captionStringBuilder.setLength(0);
	//   28  105:aload_0         
	//   29  106:getfield        #92  <Field StringBuilder captionStringBuilder>
	//   30  109:iconst_0        
	//   31  110:invokevirtual   #190 <Method void StringBuilder.setLength(int)>
							return;
	//   32  113:return          

						case 46: // '.'
							captionStringBuilder.setLength(0);
	//   33  114:aload_0         
	//   34  115:getfield        #92  <Field StringBuilder captionStringBuilder>
	//   35  118:iconst_0        
	//   36  119:invokevirtual   #190 <Method void StringBuilder.setLength(int)>
							return;
	//   37  122:return          

						case 45: // '-'
							maybeAppendNewline();
	//   38  123:aload_0         
	//   39  124:invokespecial   #193 <Method void maybeAppendNewline()>
							return;
	//   40  127:return          

						case 44: // ','
							caption = null;
	//   41  128:aload_0         
	//   42  129:aconst_null     
	//   43  130:putfield        #163 <Field String caption>
							i = captionMode;
	//   44  133:aload_0         
	//   45  134:getfield        #157 <Field int captionMode>
	//   46  137:istore_2        
							break;
						}
						if(i == 1 || i == 3)
	//*  47  138:iload_2         
	//*  48  139:iconst_1        
	//*  49  140:icmpeq          148
	//*  50  143:iload_2         
	//*  51  144:iconst_3        
	//*  52  145:icmpne          156
							captionStringBuilder.setLength(0);
	//   53  148:aload_0         
	//   54  149:getfield        #92  <Field StringBuilder captionStringBuilder>
	//   55  152:iconst_0        
	//   56  153:invokevirtual   #190 <Method void StringBuilder.setLength(int)>
						return;
	//   57  156:return          
					}
					if(captionStringBuilder.length() > 0)
	//*  58  157:aload_0         
	//*  59  158:getfield        #92  <Field StringBuilder captionStringBuilder>
	//*  60  161:invokevirtual   #167 <Method int StringBuilder.length()>
	//*  61  164:ifle            182
					{
						closedcaptionctrl = ((ClosedCaptionCtrl) (captionStringBuilder));
	//   62  167:aload_0         
	//   63  168:getfield        #92  <Field StringBuilder captionStringBuilder>
	//   64  171:astore_1        
						((StringBuilder) (closedcaptionctrl)).setLength(((StringBuilder) (closedcaptionctrl)).length() - 1);
	//   65  172:aload_1         
	//   66  173:aload_1         
	//   67  174:invokevirtual   #167 <Method int StringBuilder.length()>
	//   68  177:iconst_1        
	//   69  178:isub            
	//   70  179:invokevirtual   #190 <Method void StringBuilder.setLength(int)>
					}
					return;
	//   71  182:return          

				case 39: // '\''
					captionRowCount = 4;
	//   72  183:aload_0         
	//   73  184:iconst_4        
	//   74  185:putfield        #177 <Field int captionRowCount>
					setCaptionMode(1);
	//   75  188:aload_0         
	//   76  189:iconst_1        
	//   77  190:invokespecial   #196 <Method void setCaptionMode(int)>
					return;
	//   78  193:return          

				case 38: // '&'
					captionRowCount = 3;
	//   79  194:aload_0         
	//   80  195:iconst_3        
	//   81  196:putfield        #177 <Field int captionRowCount>
					setCaptionMode(1);
	//   82  199:aload_0         
	//   83  200:iconst_1        
	//   84  201:invokespecial   #196 <Method void setCaptionMode(int)>
					return;
	//   85  204:return          

				case 37: // '%'
					captionRowCount = 2;
	//   86  205:aload_0         
	//   87  206:iconst_2        
	//   88  207:putfield        #177 <Field int captionRowCount>
					setCaptionMode(1);
	//   89  210:aload_0         
	//   90  211:iconst_1        
	//   91  212:invokespecial   #196 <Method void setCaptionMode(int)>
					return;
	//   92  215:return          
				}
			} else
			{
				setCaptionMode(3);
	//   93  216:aload_0         
	//   94  217:iconst_3        
	//   95  218:invokespecial   #196 <Method void setCaptionMode(int)>
				return;
	//   96  221:return          
			}
		} else
		{
			setCaptionMode(2);
	//   97  222:aload_0         
	//   98  223:iconst_2        
	//   99  224:invokespecial   #196 <Method void setCaptionMode(int)>
			return;
	//  100  227:return          
		}
	}

	private void handlePreambleAddressCode()
	{
		maybeAppendNewline();
	//    0    0:aload_0         
	//    1    1:invokespecial   #193 <Method void maybeAppendNewline()>
	//    2    4:return          
	}

	private void handleText(ClosedCaptionText closedcaptiontext)
	{
		if(captionMode != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #157 <Field int captionMode>
	//*   2    4:ifeq            19
			captionStringBuilder.append(closedcaptiontext.text);
	//    3    7:aload_0         
	//    4    8:getfield        #92  <Field StringBuilder captionStringBuilder>
	//    5   11:aload_1         
	//    6   12:getfield        #199 <Field String ClosedCaptionText.text>
	//    7   15:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
	//    9   19:return          
	}

	private void invokeRenderer(String s)
	{
		if(Util.areEqual(((Object) (lastRenderedCaption)), ((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #207 <Field String lastRenderedCaption>
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #213 <Method boolean Util.areEqual(Object, Object)>
	//*   4    8:ifeq            12
			return;
	//    5   11:return          
		lastRenderedCaption = s;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #207 <Field String lastRenderedCaption>
		Handler handler = textRendererHandler;
	//    9   17:aload_0         
	//   10   18:getfield        #68  <Field Handler textRendererHandler>
	//   11   21:astore_2        
		if(handler != null)
	//*  12   22:aload_2         
	//*  13   23:ifnull          36
		{
			handler.obtainMessage(0, ((Object) (s))).sendToTarget();
	//   14   26:aload_2         
	//   15   27:iconst_0        
	//   16   28:aload_1         
	//   17   29:invokevirtual   #217 <Method Message Handler.obtainMessage(int, Object)>
	//   18   32:invokevirtual   #222 <Method void Message.sendToTarget()>
			return;
	//   19   35:return          
		} else
		{
			invokeRendererInternal(s);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokespecial   #225 <Method void invokeRendererInternal(String)>
			return;
	//   23   41:return          
		}
	}

	private void invokeRendererInternal(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			textRenderer.onCues(Collections.emptyList());
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field TextRenderer textRenderer>
	//    4    8:invokestatic    #231 <Method java.util.List Collections.emptyList()>
	//    5   11:invokeinterface #235 <Method void TextRenderer.onCues(java.util.List)>
			return;
	//    6   16:return          
		} else
		{
			textRenderer.onCues(Collections.singletonList(((Object) (new Cue(((CharSequence) (s)))))));
	//    7   17:aload_0         
	//    8   18:getfield        #61  <Field TextRenderer textRenderer>
	//    9   21:new             #237 <Class Cue>
	//   10   24:dup             
	//   11   25:aload_1         
	//   12   26:invokespecial   #240 <Method void Cue(CharSequence)>
	//   13   29:invokestatic    #244 <Method java.util.List Collections.singletonList(Object)>
	//   14   32:invokeinterface #235 <Method void TextRenderer.onCues(java.util.List)>
			return;
	//   15   37:return          
		}
	}

	private boolean isSamplePending()
	{
		return sampleHolder.timeUs != -1L;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field SampleHolder sampleHolder>
	//    2    4:getfield        #105 <Field long SampleHolder.timeUs>
	//    3    7:ldc2w           #100 <Long -1L>
	//    4   10:lcmp            
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	private void maybeAppendNewline()
	{
		int i = captionStringBuilder.length();
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field StringBuilder captionStringBuilder>
	//    2    4:invokevirtual   #167 <Method int StringBuilder.length()>
	//    3    7:istore_1        
		if(i > 0 && captionStringBuilder.charAt(i - 1) != '\n')
	//*   4    8:iload_1         
	//*   5    9:ifle            37
	//*   6   12:aload_0         
	//*   7   13:getfield        #92  <Field StringBuilder captionStringBuilder>
	//*   8   16:iload_1         
	//*   9   17:iconst_1        
	//*  10   18:isub            
	//*  11   19:invokevirtual   #171 <Method char StringBuilder.charAt(int)>
	//*  12   22:bipush          10
	//*  13   24:icmpeq          37
			captionStringBuilder.append('\n');
	//   14   27:aload_0         
	//   15   28:getfield        #92  <Field StringBuilder captionStringBuilder>
	//   16   31:bipush          10
	//   17   33:invokevirtual   #248 <Method StringBuilder StringBuilder.append(char)>
	//   18   36:pop             
	//   19   37:return          
	}

	private void maybeParsePendingSample(long l)
	{
		if(sampleHolder.timeUs > l + 0x4c4b40L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field SampleHolder sampleHolder>
	//*   2    4:getfield        #105 <Field long SampleHolder.timeUs>
	//*   3    7:lload_1         
	//*   4    8:ldc2w           #251 <Long 0x4c4b40L>
	//*   5   11:ladd            
	//*   6   12:lcmp            
	//*   7   13:ifle            17
			return;
	//    8   16:return          
		ClosedCaptionList closedcaptionlist = eia608Parser.parse(sampleHolder);
	//    9   17:aload_0         
	//   10   18:getfield        #75  <Field Eia608Parser eia608Parser>
	//   11   21:aload_0         
	//   12   22:getfield        #87  <Field SampleHolder sampleHolder>
	//   13   25:invokevirtual   #256 <Method ClosedCaptionList Eia608Parser.parse(SampleHolder)>
	//   14   28:astore_3        
		clearPendingSample();
	//   15   29:aload_0         
	//   16   30:invokespecial   #258 <Method void clearPendingSample()>
		if(closedcaptionlist != null)
	//*  17   33:aload_3         
	//*  18   34:ifnull          46
			pendingCaptionLists.add(((Object) (closedcaptionlist)));
	//   19   37:aload_0         
	//   20   38:getfield        #97  <Field TreeSet pendingCaptionLists>
	//   21   41:aload_3         
	//   22   42:invokevirtual   #262 <Method boolean TreeSet.add(Object)>
	//   23   45:pop             
	//   24   46:return          
	}

	private void setCaptionMode(int i)
	{
		if(captionMode == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #157 <Field int captionMode>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		captionMode = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #157 <Field int captionMode>
		captionStringBuilder.setLength(0);
	//    8   14:aload_0         
	//    9   15:getfield        #92  <Field StringBuilder captionStringBuilder>
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #190 <Method void StringBuilder.setLength(int)>
		if(i == 1 || i == 0)
	//*  12   22:iload_1         
	//*  13   23:iconst_1        
	//*  14   24:icmpeq          31
	//*  15   27:iload_1         
	//*  16   28:ifne            36
			caption = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #163 <Field String caption>
	//   20   36:return          
	}

	protected void doSomeWork(long l, long l1, boolean flag)
		throws ExoPlaybackException
	{
		if(isSamplePending())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #268 <Method boolean isSamplePending()>
	//*   2    4:ifeq            12
			maybeParsePendingSample(l);
	//    3    7:aload_0         
	//    4    8:lload_1         
	//    5    9:invokespecial   #270 <Method void maybeParsePendingSample(long)>
		int i;
		if(inputStreamEnded)
	//*   6   12:aload_0         
	//*   7   13:getfield        #272 <Field boolean inputStreamEnded>
	//*   8   16:ifeq            25
			i = -1;
	//    9   19:iconst_m1       
	//   10   20:istore          6
		else
	//*  11   22:goto            29
			i = -3;
	//   12   25:bipush          -3
	//   13   27:istore          6
		do
		{
			if(isSamplePending() || i != -3)
				break;
	//   14   29:aload_0         
	//   15   30:invokespecial   #268 <Method boolean isSamplePending()>
	//   16   33:ifne            99
	//   17   36:iload           6
	//   18   38:bipush          -3
	//   19   40:icmpne          99
			int j = readSource(l, formatHolder, sampleHolder);
	//   20   43:aload_0         
	//   21   44:lload_1         
	//   22   45:aload_0         
	//   23   46:getfield        #80  <Field MediaFormatHolder formatHolder>
	//   24   49:aload_0         
	//   25   50:getfield        #87  <Field SampleHolder sampleHolder>
	//   26   53:invokevirtual   #276 <Method int readSource(long, MediaFormatHolder, SampleHolder)>
	//   27   56:istore          7
			if(j == -3)
	//*  28   58:iload           7
	//*  29   60:bipush          -3
	//*  30   62:icmpne          77
			{
				maybeParsePendingSample(l);
	//   31   65:aload_0         
	//   32   66:lload_1         
	//   33   67:invokespecial   #270 <Method void maybeParsePendingSample(long)>
				i = j;
	//   34   70:iload           7
	//   35   72:istore          6
			} else
	//*  36   74:goto            29
			{
				i = j;
	//   37   77:iload           7
	//   38   79:istore          6
				if(j == -1)
	//*  39   81:iload           7
	//*  40   83:iconst_m1       
	//*  41   84:icmpne          29
				{
					inputStreamEnded = true;
	//   42   87:aload_0         
	//   43   88:iconst_1        
	//   44   89:putfield        #272 <Field boolean inputStreamEnded>
					i = j;
	//   45   92:iload           7
	//   46   94:istore          6
				}
			}
		} while(true);
	//   47   96:goto            29
		do
		{
			if(pendingCaptionLists.isEmpty())
				break;
	//   48   99:aload_0         
	//   49  100:getfield        #97  <Field TreeSet pendingCaptionLists>
	//   50  103:invokevirtual   #279 <Method boolean TreeSet.isEmpty()>
	//   51  106:ifne            165
			if(((ClosedCaptionList)pendingCaptionLists.first()).timeUs > l)
	//*  52  109:aload_0         
	//*  53  110:getfield        #97  <Field TreeSet pendingCaptionLists>
	//*  54  113:invokevirtual   #283 <Method Object TreeSet.first()>
	//*  55  116:checkcast       #112 <Class ClosedCaptionList>
	//*  56  119:getfield        #284 <Field long ClosedCaptionList.timeUs>
	//*  57  122:lload_1         
	//*  58  123:lcmp            
	//*  59  124:ifle            128
				return;
	//   60  127:return          
			ClosedCaptionList closedcaptionlist = (ClosedCaptionList)pendingCaptionLists.pollFirst();
	//   61  128:aload_0         
	//   62  129:getfield        #97  <Field TreeSet pendingCaptionLists>
	//   63  132:invokevirtual   #287 <Method Object TreeSet.pollFirst()>
	//   64  135:checkcast       #112 <Class ClosedCaptionList>
	//   65  138:astore          8
			consumeCaptionList(closedcaptionlist);
	//   66  140:aload_0         
	//   67  141:aload           8
	//   68  143:invokespecial   #289 <Method void consumeCaptionList(ClosedCaptionList)>
			if(!closedcaptionlist.decodeOnly)
	//*  69  146:aload           8
	//*  70  148:getfield        #292 <Field boolean ClosedCaptionList.decodeOnly>
	//*  71  151:ifne            99
				invokeRenderer(caption);
	//   72  154:aload_0         
	//   73  155:aload_0         
	//   74  156:getfield        #163 <Field String caption>
	//   75  159:invokespecial   #294 <Method void invokeRenderer(String)>
		} while(true);
	//   76  162:goto            99
	//   77  165:return          
	}

	protected long getBufferedPositionUs()
	{
		return -3L;
	//    0    0:ldc2w           #298 <Long -3L>
	//    1    3:lreturn         
	}

	public boolean handleMessage(Message message)
	{
		if(message.what != 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #304 <Field int Message.what>
	//*   2    4:ifeq            9
		{
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			invokeRendererInternal((String)message.obj);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #308 <Field Object Message.obj>
	//    8   14:checkcast       #310 <Class String>
	//    9   17:invokespecial   #225 <Method void invokeRendererInternal(String)>
			return true;
	//   10   20:iconst_1        
	//   11   21:ireturn         
		}
	}

	protected boolean handlesTrack(MediaFormat mediaformat)
	{
		return eia608Parser.canParse(mediaformat.mimeType);
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field Eia608Parser eia608Parser>
	//    2    4:aload_1         
	//    3    5:getfield        #317 <Field String MediaFormat.mimeType>
	//    4    8:invokevirtual   #321 <Method boolean Eia608Parser.canParse(String)>
	//    5   11:ireturn         
	}

	protected boolean isEnded()
	{
		return inputStreamEnded;
	//    0    0:aload_0         
	//    1    1:getfield        #272 <Field boolean inputStreamEnded>
	//    2    4:ireturn         
	}

	protected boolean isReady()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected void onDiscontinuity(long l)
	{
		inputStreamEnded = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #272 <Field boolean inputStreamEnded>
		repeatableControl = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #129 <Field ClosedCaptionCtrl repeatableControl>
		pendingCaptionLists.clear();
	//    6   10:aload_0         
	//    7   11:getfield        #97  <Field TreeSet pendingCaptionLists>
	//    8   14:invokevirtual   #327 <Method void TreeSet.clear()>
		clearPendingSample();
	//    9   17:aload_0         
	//   10   18:invokespecial   #258 <Method void clearPendingSample()>
		captionRowCount = 4;
	//   11   21:aload_0         
	//   12   22:iconst_4        
	//   13   23:putfield        #177 <Field int captionRowCount>
		setCaptionMode(0);
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:invokespecial   #196 <Method void setCaptionMode(int)>
		invokeRenderer(((String) (null)));
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:invokespecial   #294 <Method void invokeRenderer(String)>
	//   20   36:return          
	}

	protected void onEnabled(int i, long l, boolean flag)
		throws ExoPlaybackException
	{
		super.onEnabled(i, l, flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:iload           4
	//    4    5:invokespecial   #331 <Method void SampleSourceTrackRenderer.onEnabled(int, long, boolean)>
	//    5    8:return          
	}

	private static final int CC_MODE_PAINT_ON = 3;
	private static final int CC_MODE_POP_ON = 2;
	private static final int CC_MODE_ROLL_UP = 1;
	private static final int CC_MODE_UNKNOWN = 0;
	private static final int DEFAULT_CAPTIONS_ROW_COUNT = 4;
	private static final int MAX_SAMPLE_READAHEAD_US = 0x4c4b40;
	private static final int MSG_INVOKE_RENDERER = 0;
	private String caption;
	private int captionMode;
	private int captionRowCount;
	private final StringBuilder captionStringBuilder = new StringBuilder();
	private final Eia608Parser eia608Parser = new Eia608Parser();
	private final MediaFormatHolder formatHolder = new MediaFormatHolder();
	private boolean inputStreamEnded;
	private String lastRenderedCaption;
	private final TreeSet pendingCaptionLists = new TreeSet();
	private ClosedCaptionCtrl repeatableControl;
	private final SampleHolder sampleHolder = new SampleHolder(1);
	private final TextRenderer textRenderer;
	private final Handler textRendererHandler;
}
