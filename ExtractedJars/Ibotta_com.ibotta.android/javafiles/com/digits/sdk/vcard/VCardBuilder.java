// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.vcard;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.*;

// Referenced classes of package com.digits.sdk.vcard:
//			VCardConfig, VCardUtils, VCardPhoneNumberTranslationCallback

public class VCardBuilder
{

	public VCardBuilder(int i, String s)
	{
		boolean flag;
label0:
		{
			super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void Object()>
			mVCardType = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #61  <Field int mVCardType>
			if(VCardConfig.isVersion40(i))
	//*   5    9:iload_1         
	//*   6   10:invokestatic    #67  <Method boolean VCardConfig.isVersion40(int)>
	//*   7   13:ifeq            24
				Log.w("vCard", "Should not use vCard 4.0 when building vCard. It is not officially published yet.");
	//    8   16:ldc1            #69  <String "vCard">
	//    9   18:ldc1            #71  <String "Should not use vCard 4.0 when building vCard. It is not officially published yet.">
	//   10   20:invokestatic    #77  <Method int Log.w(String, String)>
	//   11   23:pop             
			flag = VCardConfig.isVersion30(i);
	//   12   24:iload_1         
	//   13   25:invokestatic    #80  <Method boolean VCardConfig.isVersion30(int)>
	//   14   28:istore_3        
			boolean flag1 = false;
	//   15   29:iconst_0        
	//   16   30:istore          4
			if(!flag && !VCardConfig.isVersion40(i))
	//*  17   32:iload_3         
	//*  18   33:ifne            51
	//*  19   36:iload_1         
	//*  20   37:invokestatic    #67  <Method boolean VCardConfig.isVersion40(int)>
	//*  21   40:ifeq            46
	//*  22   43:goto            51
				flag = false;
	//   23   46:iconst_0        
	//   24   47:istore_3        
			else
	//*  25   48:goto            53
				flag = true;
	//   26   51:iconst_1        
	//   27   52:istore_3        
			mIsV30OrV40 = flag;
	//   28   53:aload_0         
	//   29   54:iload_3         
	//   30   55:putfield        #82  <Field boolean mIsV30OrV40>
			mShouldUseQuotedPrintable = VCardConfig.shouldUseQuotedPrintable(i);
	//   31   58:aload_0         
	//   32   59:iload_1         
	//   33   60:invokestatic    #85  <Method boolean VCardConfig.shouldUseQuotedPrintable(int)>
	//   34   63:putfield        #87  <Field boolean mShouldUseQuotedPrintable>
			mIsDoCoMo = VCardConfig.isDoCoMo(i);
	//   35   66:aload_0         
	//   36   67:iload_1         
	//   37   68:invokestatic    #90  <Method boolean VCardConfig.isDoCoMo(int)>
	//   38   71:putfield        #92  <Field boolean mIsDoCoMo>
			mIsJapaneseMobilePhone = VCardConfig.needsToConvertPhoneticString(i);
	//   39   74:aload_0         
	//   40   75:iload_1         
	//   41   76:invokestatic    #95  <Method boolean VCardConfig.needsToConvertPhoneticString(int)>
	//   42   79:putfield        #97  <Field boolean mIsJapaneseMobilePhone>
			mUsesDefactProperty = VCardConfig.usesDefactProperty(i);
	//   43   82:aload_0         
	//   44   83:iload_1         
	//   45   84:invokestatic    #100 <Method boolean VCardConfig.usesDefactProperty(int)>
	//   46   87:putfield        #102 <Field boolean mUsesDefactProperty>
			mRefrainsQPToNameProperties = VCardConfig.shouldRefrainQPToNameProperties(i);
	//   47   90:aload_0         
	//   48   91:iload_1         
	//   49   92:invokestatic    #105 <Method boolean VCardConfig.shouldRefrainQPToNameProperties(int)>
	//   50   95:putfield        #107 <Field boolean mRefrainsQPToNameProperties>
			mAppendTypeParamName = VCardConfig.appendTypeParamName(i);
	//   51   98:aload_0         
	//   52   99:iload_1         
	//   53  100:invokestatic    #110 <Method boolean VCardConfig.appendTypeParamName(int)>
	//   54  103:putfield        #112 <Field boolean mAppendTypeParamName>
			mNeedsToConvertPhoneticString = VCardConfig.needsToConvertPhoneticString(i);
	//   55  106:aload_0         
	//   56  107:iload_1         
	//   57  108:invokestatic    #95  <Method boolean VCardConfig.needsToConvertPhoneticString(int)>
	//   58  111:putfield        #114 <Field boolean mNeedsToConvertPhoneticString>
			if(VCardConfig.isVersion30(i))
	//*  59  114:iload_1         
	//*  60  115:invokestatic    #80  <Method boolean VCardConfig.isVersion30(int)>
	//*  61  118:ifeq            133
			{
				flag = flag1;
	//   62  121:iload           4
	//   63  123:istore_3        
				if("UTF-8".equalsIgnoreCase(s))
					break label0;
	//   64  124:ldc1            #116 <String "UTF-8">
	//   65  126:aload_2         
	//   66  127:invokevirtual   #120 <Method boolean String.equalsIgnoreCase(String)>
	//   67  130:ifne            135
			}
			flag = true;
	//   68  133:iconst_1        
	//   69  134:istore_3        
		}
		mShouldAppendCharsetParam = flag;
	//   70  135:aload_0         
	//   71  136:iload_3         
	//   72  137:putfield        #122 <Field boolean mShouldAppendCharsetParam>
		if(VCardConfig.isDoCoMo(i))
	//*  73  140:iload_1         
	//*  74  141:invokestatic    #90  <Method boolean VCardConfig.isDoCoMo(int)>
	//*  75  144:ifeq            194
		{
			if(!"SHIFT_JIS".equalsIgnoreCase(s))
	//*  76  147:ldc1            #124 <String "SHIFT_JIS">
	//*  77  149:aload_2         
	//*  78  150:invokevirtual   #120 <Method boolean String.equalsIgnoreCase(String)>
	//*  79  153:ifne            180
			{
				if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  80  156:aload_2         
	//*  81  157:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  82  160:ifeq            172
					mCharset = "SHIFT_JIS";
	//   83  163:aload_0         
	//   84  164:ldc1            #124 <String "SHIFT_JIS">
	//   85  166:putfield        #132 <Field String mCharset>
				else
	//*  86  169:goto            185
					mCharset = s;
	//   87  172:aload_0         
	//   88  173:aload_2         
	//   89  174:putfield        #132 <Field String mCharset>
			} else
	//*  90  177:goto            185
			{
				mCharset = s;
	//   91  180:aload_0         
	//   92  181:aload_2         
	//   93  182:putfield        #132 <Field String mCharset>
			}
			mVCardCharsetParameter = "CHARSET=SHIFT_JIS";
	//   94  185:aload_0         
	//   95  186:ldc1            #134 <String "CHARSET=SHIFT_JIS">
	//   96  188:putfield        #136 <Field String mVCardCharsetParameter>
		} else
	//*  97  191:goto            262
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  98  194:aload_2         
	//*  99  195:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 100  198:ifeq            224
		{
			Log.i("vCard", "Use the charset \"UTF-8\" for export.");
	//  101  201:ldc1            #69  <String "vCard">
	//  102  203:ldc1            #138 <String "Use the charset \"UTF-8\" for export.">
	//  103  205:invokestatic    #141 <Method int Log.i(String, String)>
	//  104  208:pop             
			mCharset = "UTF-8";
	//  105  209:aload_0         
	//  106  210:ldc1            #116 <String "UTF-8">
	//  107  212:putfield        #132 <Field String mCharset>
			mVCardCharsetParameter = "CHARSET=UTF-8";
	//  108  215:aload_0         
	//  109  216:ldc1            #143 <String "CHARSET=UTF-8">
	//  110  218:putfield        #136 <Field String mVCardCharsetParameter>
		} else
	//* 111  221:goto            262
		{
			mCharset = s;
	//  112  224:aload_0         
	//  113  225:aload_2         
	//  114  226:putfield        #132 <Field String mCharset>
			StringBuilder stringbuilder = new StringBuilder();
	//  115  229:new             #145 <Class StringBuilder>
	//  116  232:dup             
	//  117  233:invokespecial   #146 <Method void StringBuilder()>
	//  118  236:astore          5
			stringbuilder.append("CHARSET=");
	//  119  238:aload           5
	//  120  240:ldc1            #148 <String "CHARSET=">
	//  121  242:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  122  245:pop             
			stringbuilder.append(s);
	//  123  246:aload           5
	//  124  248:aload_2         
	//  125  249:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  126  252:pop             
			mVCardCharsetParameter = stringbuilder.toString();
	//  127  253:aload_0         
	//  128  254:aload           5
	//  129  256:invokevirtual   #156 <Method String StringBuilder.toString()>
	//  130  259:putfield        #136 <Field String mVCardCharsetParameter>
		}
		clear();
	//  131  262:aload_0         
	//  132  263:invokevirtual   #159 <Method void clear()>
	//  133  266:return          
	}

	private VCardBuilder appendNamePropertiesV40(List list)
	{
		if(mIsDoCoMo || mNeedsToConvertPhoneticString)
	//*   0    0:aload_0         
	//*   1    1:getfield        #92  <Field boolean mIsDoCoMo>
	//*   2    4:ifne            14
	//*   3    7:aload_0         
	//*   4    8:getfield        #114 <Field boolean mNeedsToConvertPhoneticString>
	//*   5   11:ifeq            22
			Log.w("vCard", "Invalid flag is used in vCard 4.0 construction. Ignored.");
	//    6   14:ldc1            #69  <String "vCard">
	//    7   16:ldc1            #163 <String "Invalid flag is used in vCard 4.0 construction. Ignored.">
	//    8   18:invokestatic    #77  <Method int Log.w(String, String)>
	//    9   21:pop             
		if(list != null && !list.isEmpty())
	//*  10   22:aload_1         
	//*  11   23:ifnull          560
	//*  12   26:aload_1         
	//*  13   27:invokeinterface #168 <Method boolean List.isEmpty()>
	//*  14   32:ifeq            38
	//*  15   35:goto            560
		{
			ContentValues contentvalues = getPrimaryContentValueWithStructuredName(list);
	//   16   38:aload_0         
	//   17   39:aload_1         
	//   18   40:invokespecial   #172 <Method ContentValues getPrimaryContentValueWithStructuredName(List)>
	//   19   43:astore_3        
			list = ((List) (contentvalues.getAsString("data3")));
	//   20   44:aload_3         
	//   21   45:ldc1            #174 <String "data3">
	//   22   47:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   23   50:astore_1        
			String s1 = contentvalues.getAsString("data5");
	//   24   51:aload_3         
	//   25   52:ldc1            #182 <String "data5">
	//   26   54:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   27   57:astore          4
			String s2 = contentvalues.getAsString("data2");
	//   28   59:aload_3         
	//   29   60:ldc1            #184 <String "data2">
	//   30   62:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   31   65:astore          5
			String s3 = contentvalues.getAsString("data4");
	//   32   67:aload_3         
	//   33   68:ldc1            #186 <String "data4">
	//   34   70:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   35   73:astore          6
			String s4 = contentvalues.getAsString("data6");
	//   36   75:aload_3         
	//   37   76:ldc1            #188 <String "data6">
	//   38   78:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   39   81:astore          7
			String s = contentvalues.getAsString("data1");
	//   40   83:aload_3         
	//   41   84:ldc1            #190 <String "data1">
	//   42   86:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   43   89:astore_2        
			if(TextUtils.isEmpty(((CharSequence) (list))) && TextUtils.isEmpty(((CharSequence) (s2))) && TextUtils.isEmpty(((CharSequence) (s1))) && TextUtils.isEmpty(((CharSequence) (s3))) && TextUtils.isEmpty(((CharSequence) (s4))))
	//*  44   90:aload_1         
	//*  45   91:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  46   94:ifeq            151
	//*  47   97:aload           5
	//*  48   99:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  49  102:ifeq            151
	//*  50  105:aload           4
	//*  51  107:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  52  110:ifeq            151
	//*  53  113:aload           6
	//*  54  115:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  55  118:ifeq            151
	//*  56  121:aload           7
	//*  57  123:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  58  126:ifeq            151
			{
				if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  59  129:aload_2         
	//*  60  130:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  61  133:ifeq            146
				{
					appendLine("FN", "");
	//   62  136:aload_0         
	//   63  137:ldc1            #192 <String "FN">
	//   64  139:ldc1            #194 <String "">
	//   65  141:invokevirtual   #198 <Method void appendLine(String, String)>
					return this;
	//   66  144:aload_0         
	//   67  145:areturn         
				}
				list = ((List) (s));
	//   68  146:aload_2         
	//   69  147:astore_1        
			}
	//*  70  148:goto            151
			String s10 = contentvalues.getAsString("data9");
	//   71  151:aload_3         
	//   72  152:ldc1            #200 <String "data9">
	//   73  154:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   74  157:astore          13
			Object obj = ((Object) (contentvalues.getAsString("data8")));
	//   75  159:aload_3         
	//   76  160:ldc1            #202 <String "data8">
	//   77  162:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   78  165:astore          14
			String s11 = contentvalues.getAsString("data7");
	//   79  167:aload_3         
	//   80  168:ldc1            #204 <String "data7">
	//   81  170:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   82  173:astore          15
			String s5 = escapeCharacters(((String) (list)));
	//   83  175:aload_0         
	//   84  176:aload_1         
	//   85  177:invokespecial   #207 <Method String escapeCharacters(String)>
	//   86  180:astore          8
			String s6 = escapeCharacters(s2);
	//   87  182:aload_0         
	//   88  183:aload           5
	//   89  185:invokespecial   #207 <Method String escapeCharacters(String)>
	//   90  188:astore          9
			String s7 = escapeCharacters(s1);
	//   91  190:aload_0         
	//   92  191:aload           4
	//   93  193:invokespecial   #207 <Method String escapeCharacters(String)>
	//   94  196:astore          10
			String s8 = escapeCharacters(s3);
	//   95  198:aload_0         
	//   96  199:aload           6
	//   97  201:invokespecial   #207 <Method String escapeCharacters(String)>
	//   98  204:astore          11
			String s9 = escapeCharacters(s4);
	//   99  206:aload_0         
	//  100  207:aload           7
	//  101  209:invokespecial   #207 <Method String escapeCharacters(String)>
	//  102  212:astore          12
			mBuilder.append("N");
	//  103  214:aload_0         
	//  104  215:getfield        #209 <Field StringBuilder mBuilder>
	//  105  218:ldc1            #211 <String "N">
	//  106  220:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  107  223:pop             
			if(!TextUtils.isEmpty(((CharSequence) (s10))) || !TextUtils.isEmpty(((CharSequence) (obj))) || !TextUtils.isEmpty(((CharSequence) (s11))))
	//* 108  224:aload           13
	//* 109  226:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 110  229:ifeq            248
	//* 111  232:aload           14
	//* 112  234:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 113  237:ifeq            248
	//* 114  240:aload           15
	//* 115  242:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 116  245:ifne            351
			{
				mBuilder.append(";");
	//  117  248:aload_0         
	//  118  249:getfield        #209 <Field StringBuilder mBuilder>
	//  119  252:ldc1            #213 <String ";">
	//  120  254:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  121  257:pop             
				StringBuilder stringbuilder = new StringBuilder();
	//  122  258:new             #145 <Class StringBuilder>
	//  123  261:dup             
	//  124  262:invokespecial   #146 <Method void StringBuilder()>
	//  125  265:astore          16
				stringbuilder.append(escapeCharacters(s10));
	//  126  267:aload           16
	//  127  269:aload_0         
	//  128  270:aload           13
	//  129  272:invokespecial   #207 <Method String escapeCharacters(String)>
	//  130  275:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  131  278:pop             
				stringbuilder.append(';');
	//  132  279:aload           16
	//  133  281:bipush          59
	//  134  283:invokevirtual   #216 <Method StringBuilder StringBuilder.append(char)>
	//  135  286:pop             
				stringbuilder.append(escapeCharacters(s11));
	//  136  287:aload           16
	//  137  289:aload_0         
	//  138  290:aload           15
	//  139  292:invokespecial   #207 <Method String escapeCharacters(String)>
	//  140  295:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  141  298:pop             
				stringbuilder.append(';');
	//  142  299:aload           16
	//  143  301:bipush          59
	//  144  303:invokevirtual   #216 <Method StringBuilder StringBuilder.append(char)>
	//  145  306:pop             
				stringbuilder.append(escapeCharacters(((String) (obj))));
	//  146  307:aload           16
	//  147  309:aload_0         
	//  148  310:aload           14
	//  149  312:invokespecial   #207 <Method String escapeCharacters(String)>
	//  150  315:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  151  318:pop             
				s10 = stringbuilder.toString();
	//  152  319:aload           16
	//  153  321:invokevirtual   #156 <Method String StringBuilder.toString()>
	//  154  324:astore          13
				obj = ((Object) (mBuilder));
	//  155  326:aload_0         
	//  156  327:getfield        #209 <Field StringBuilder mBuilder>
	//  157  330:astore          14
				((StringBuilder) (obj)).append("SORT-AS=");
	//  158  332:aload           14
	//  159  334:ldc1            #218 <String "SORT-AS=">
	//  160  336:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  161  339:pop             
				((StringBuilder) (obj)).append(VCardUtils.toStringAsV40ParamValue(s10));
	//  162  340:aload           14
	//  163  342:aload           13
	//  164  344:invokestatic    #223 <Method String VCardUtils.toStringAsV40ParamValue(String)>
	//  165  347:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  166  350:pop             
			}
			mBuilder.append(":");
	//  167  351:aload_0         
	//  168  352:getfield        #209 <Field StringBuilder mBuilder>
	//  169  355:ldc1            #225 <String ":">
	//  170  357:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  171  360:pop             
			mBuilder.append(s5);
	//  172  361:aload_0         
	//  173  362:getfield        #209 <Field StringBuilder mBuilder>
	//  174  365:aload           8
	//  175  367:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  176  370:pop             
			mBuilder.append(";");
	//  177  371:aload_0         
	//  178  372:getfield        #209 <Field StringBuilder mBuilder>
	//  179  375:ldc1            #213 <String ";">
	//  180  377:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  181  380:pop             
			mBuilder.append(s6);
	//  182  381:aload_0         
	//  183  382:getfield        #209 <Field StringBuilder mBuilder>
	//  184  385:aload           9
	//  185  387:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  186  390:pop             
			mBuilder.append(";");
	//  187  391:aload_0         
	//  188  392:getfield        #209 <Field StringBuilder mBuilder>
	//  189  395:ldc1            #213 <String ";">
	//  190  397:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  191  400:pop             
			mBuilder.append(s7);
	//  192  401:aload_0         
	//  193  402:getfield        #209 <Field StringBuilder mBuilder>
	//  194  405:aload           10
	//  195  407:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  196  410:pop             
			mBuilder.append(";");
	//  197  411:aload_0         
	//  198  412:getfield        #209 <Field StringBuilder mBuilder>
	//  199  415:ldc1            #213 <String ";">
	//  200  417:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  201  420:pop             
			mBuilder.append(s8);
	//  202  421:aload_0         
	//  203  422:getfield        #209 <Field StringBuilder mBuilder>
	//  204  425:aload           11
	//  205  427:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  206  430:pop             
			mBuilder.append(";");
	//  207  431:aload_0         
	//  208  432:getfield        #209 <Field StringBuilder mBuilder>
	//  209  435:ldc1            #213 <String ";">
	//  210  437:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  211  440:pop             
			mBuilder.append(s9);
	//  212  441:aload_0         
	//  213  442:getfield        #209 <Field StringBuilder mBuilder>
	//  214  445:aload           12
	//  215  447:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  216  450:pop             
			mBuilder.append("\r\n");
	//  217  451:aload_0         
	//  218  452:getfield        #209 <Field StringBuilder mBuilder>
	//  219  455:ldc1            #227 <String "\r\n">
	//  220  457:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  221  460:pop             
			if(TextUtils.isEmpty(((CharSequence) (s))))
	//* 222  461:aload_2         
	//* 223  462:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 224  465:ifeq            508
			{
				Log.w("vCard", "DISPLAY_NAME is empty.");
	//  225  468:ldc1            #69  <String "vCard">
	//  226  470:ldc1            #229 <String "DISPLAY_NAME is empty.">
	//  227  472:invokestatic    #77  <Method int Log.w(String, String)>
	//  228  475:pop             
				appendLine("FN", escapeCharacters(VCardUtils.constructNameFromElements(VCardConfig.getNameOrderType(mVCardType), ((String) (list)), s1, s2, s3, s4)));
	//  229  476:aload_0         
	//  230  477:ldc1            #192 <String "FN">
	//  231  479:aload_0         
	//  232  480:aload_0         
	//  233  481:getfield        #61  <Field int mVCardType>
	//  234  484:invokestatic    #233 <Method int VCardConfig.getNameOrderType(int)>
	//  235  487:aload_1         
	//  236  488:aload           4
	//  237  490:aload           5
	//  238  492:aload           6
	//  239  494:aload           7
	//  240  496:invokestatic    #237 <Method String VCardUtils.constructNameFromElements(int, String, String, String, String, String)>
	//  241  499:invokespecial   #207 <Method String escapeCharacters(String)>
	//  242  502:invokevirtual   #198 <Method void appendLine(String, String)>
			} else
	//* 243  505:goto            553
			{
				list = ((List) (escapeCharacters(s)));
	//  244  508:aload_0         
	//  245  509:aload_2         
	//  246  510:invokespecial   #207 <Method String escapeCharacters(String)>
	//  247  513:astore_1        
				mBuilder.append("FN");
	//  248  514:aload_0         
	//  249  515:getfield        #209 <Field StringBuilder mBuilder>
	//  250  518:ldc1            #192 <String "FN">
	//  251  520:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  252  523:pop             
				mBuilder.append(":");
	//  253  524:aload_0         
	//  254  525:getfield        #209 <Field StringBuilder mBuilder>
	//  255  528:ldc1            #225 <String ":">
	//  256  530:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  257  533:pop             
				mBuilder.append(((String) (list)));
	//  258  534:aload_0         
	//  259  535:getfield        #209 <Field StringBuilder mBuilder>
	//  260  538:aload_1         
	//  261  539:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  262  542:pop             
				mBuilder.append("\r\n");
	//  263  543:aload_0         
	//  264  544:getfield        #209 <Field StringBuilder mBuilder>
	//  265  547:ldc1            #227 <String "\r\n">
	//  266  549:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  267  552:pop             
			}
			appendPhoneticNameFields(contentvalues);
	//  268  553:aload_0         
	//  269  554:aload_3         
	//  270  555:invokespecial   #241 <Method void appendPhoneticNameFields(ContentValues)>
			return this;
	//  271  558:aload_0         
	//  272  559:areturn         
		} else
		{
			appendLine("FN", "");
	//  273  560:aload_0         
	//  274  561:ldc1            #192 <String "FN">
	//  275  563:ldc1            #194 <String "">
	//  276  565:invokevirtual   #198 <Method void appendLine(String, String)>
			return this;
	//  277  568:aload_0         
	//  278  569:areturn         
		}
	}

	private void appendPhoneticNameFields(ContentValues contentvalues)
	{
		String s10 = contentvalues.getAsString("data9");
	//    0    0:aload_1         
	//    1    1:ldc1            #200 <String "data9">
	//    2    3:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//    3    6:astore          8
		String s4 = contentvalues.getAsString("data8");
	//    4    8:aload_1         
	//    5    9:ldc1            #202 <String "data8">
	//    6   11:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//    7   14:astore          6
		String s8 = contentvalues.getAsString("data7");
	//    8   16:aload_1         
	//    9   17:ldc1            #204 <String "data7">
	//   10   19:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   11   22:astore          7
		contentvalues = ((ContentValues) (s10));
	//   12   24:aload           8
	//   13   26:astore_1        
		String s = s4;
	//   14   27:aload           6
	//   15   29:astore          4
		String s2 = s8;
	//   16   31:aload           7
	//   17   33:astore          5
		if(mNeedsToConvertPhoneticString)
	//*  18   35:aload_0         
	//*  19   36:getfield        #114 <Field boolean mNeedsToConvertPhoneticString>
	//*  20   39:ifeq            62
		{
			contentvalues = ((ContentValues) (VCardUtils.toHalfWidthString(s10)));
	//   21   42:aload           8
	//   22   44:invokestatic    #246 <Method String VCardUtils.toHalfWidthString(String)>
	//   23   47:astore_1        
			s = VCardUtils.toHalfWidthString(s4);
	//   24   48:aload           6
	//   25   50:invokestatic    #246 <Method String VCardUtils.toHalfWidthString(String)>
	//   26   53:astore          4
			s2 = VCardUtils.toHalfWidthString(s8);
	//   27   55:aload           7
	//   28   57:invokestatic    #246 <Method String VCardUtils.toHalfWidthString(String)>
	//   29   60:astore          5
		}
		if(TextUtils.isEmpty(((CharSequence) (contentvalues))) && TextUtils.isEmpty(((CharSequence) (s))) && TextUtils.isEmpty(((CharSequence) (s2))))
	//*  30   62:aload_1         
	//*  31   63:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  32   66:ifeq            183
	//*  33   69:aload           4
	//*  34   71:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  35   74:ifeq            183
	//*  36   77:aload           5
	//*  37   79:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  38   82:ifeq            183
		{
			if(mIsDoCoMo)
	//*  39   85:aload_0         
	//*  40   86:getfield        #92  <Field boolean mIsDoCoMo>
	//*  41   89:ifeq            182
			{
				mBuilder.append("SOUND");
	//   42   92:aload_0         
	//   43   93:getfield        #209 <Field StringBuilder mBuilder>
	//   44   96:ldc1            #248 <String "SOUND">
	//   45   98:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   46  101:pop             
				mBuilder.append(";");
	//   47  102:aload_0         
	//   48  103:getfield        #209 <Field StringBuilder mBuilder>
	//   49  106:ldc1            #213 <String ";">
	//   50  108:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   51  111:pop             
				mBuilder.append("X-IRMC-N");
	//   52  112:aload_0         
	//   53  113:getfield        #209 <Field StringBuilder mBuilder>
	//   54  116:ldc1            #250 <String "X-IRMC-N">
	//   55  118:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   56  121:pop             
				mBuilder.append(":");
	//   57  122:aload_0         
	//   58  123:getfield        #209 <Field StringBuilder mBuilder>
	//   59  126:ldc1            #225 <String ":">
	//   60  128:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   61  131:pop             
				mBuilder.append(";");
	//   62  132:aload_0         
	//   63  133:getfield        #209 <Field StringBuilder mBuilder>
	//   64  136:ldc1            #213 <String ";">
	//   65  138:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   66  141:pop             
				mBuilder.append(";");
	//   67  142:aload_0         
	//   68  143:getfield        #209 <Field StringBuilder mBuilder>
	//   69  146:ldc1            #213 <String ";">
	//   70  148:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   71  151:pop             
				mBuilder.append(";");
	//   72  152:aload_0         
	//   73  153:getfield        #209 <Field StringBuilder mBuilder>
	//   74  156:ldc1            #213 <String ";">
	//   75  158:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   76  161:pop             
				mBuilder.append(";");
	//   77  162:aload_0         
	//   78  163:getfield        #209 <Field StringBuilder mBuilder>
	//   79  166:ldc1            #213 <String ";">
	//   80  168:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   81  171:pop             
				mBuilder.append("\r\n");
	//   82  172:aload_0         
	//   83  173:getfield        #209 <Field StringBuilder mBuilder>
	//   84  176:ldc1            #227 <String "\r\n">
	//   85  178:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   86  181:pop             
			}
			return;
	//   87  182:return          
		}
		if(!VCardConfig.isVersion40(mVCardType))
	//*  88  183:aload_0         
	//*  89  184:getfield        #61  <Field int mVCardType>
	//*  90  187:invokestatic    #67  <Method boolean VCardConfig.isVersion40(int)>
	//*  91  190:ifeq            196
	//*  92  193:goto            669
			if(VCardConfig.isVersion30(mVCardType))
	//*  93  196:aload_0         
	//*  94  197:getfield        #61  <Field int mVCardType>
	//*  95  200:invokestatic    #80  <Method boolean VCardConfig.isVersion30(int)>
	//*  96  203:ifeq            315
			{
				String s5 = VCardUtils.constructNameFromElements(mVCardType, ((String) (contentvalues)), s, s2);
	//   97  206:aload_0         
	//   98  207:getfield        #61  <Field int mVCardType>
	//   99  210:aload_1         
	//  100  211:aload           4
	//  101  213:aload           5
	//  102  215:invokestatic    #253 <Method String VCardUtils.constructNameFromElements(int, String, String, String)>
	//  103  218:astore          6
				mBuilder.append("SORT-STRING");
	//  104  220:aload_0         
	//  105  221:getfield        #209 <Field StringBuilder mBuilder>
	//  106  224:ldc1            #255 <String "SORT-STRING">
	//  107  226:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  108  229:pop             
				if(VCardConfig.isVersion30(mVCardType) && shouldAppendCharsetParam(new String[] {
	s5
}))
	//* 109  230:aload_0         
	//* 110  231:getfield        #61  <Field int mVCardType>
	//* 111  234:invokestatic    #80  <Method boolean VCardConfig.isVersion30(int)>
	//* 112  237:ifeq            278
	//* 113  240:aload_0         
	//* 114  241:iconst_1        
	//* 115  242:anewarray       String[]
	//* 116  245:dup             
	//* 117  246:iconst_0        
	//* 118  247:aload           6
	//* 119  249:aastore         
	//* 120  250:invokespecial   #259 <Method boolean shouldAppendCharsetParam(String[])>
	//* 121  253:ifeq            278
				{
					mBuilder.append(";");
	//  122  256:aload_0         
	//  123  257:getfield        #209 <Field StringBuilder mBuilder>
	//  124  260:ldc1            #213 <String ";">
	//  125  262:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  126  265:pop             
					mBuilder.append(mVCardCharsetParameter);
	//  127  266:aload_0         
	//  128  267:getfield        #209 <Field StringBuilder mBuilder>
	//  129  270:aload_0         
	//  130  271:getfield        #136 <Field String mVCardCharsetParameter>
	//  131  274:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  132  277:pop             
				}
				mBuilder.append(":");
	//  133  278:aload_0         
	//  134  279:getfield        #209 <Field StringBuilder mBuilder>
	//  135  282:ldc1            #225 <String ":">
	//  136  284:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  137  287:pop             
				mBuilder.append(escapeCharacters(s5));
	//  138  288:aload_0         
	//  139  289:getfield        #209 <Field StringBuilder mBuilder>
	//  140  292:aload_0         
	//  141  293:aload           6
	//  142  295:invokespecial   #207 <Method String escapeCharacters(String)>
	//  143  298:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  144  301:pop             
				mBuilder.append("\r\n");
	//  145  302:aload_0         
	//  146  303:getfield        #209 <Field StringBuilder mBuilder>
	//  147  306:ldc1            #227 <String "\r\n">
	//  148  308:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  149  311:pop             
			} else
	//* 150  312:goto            669
			if(mIsJapaneseMobilePhone)
	//* 151  315:aload_0         
	//* 152  316:getfield        #97  <Field boolean mIsJapaneseMobilePhone>
	//* 153  319:ifeq            669
			{
				mBuilder.append("SOUND");
	//  154  322:aload_0         
	//  155  323:getfield        #209 <Field StringBuilder mBuilder>
	//  156  326:ldc1            #248 <String "SOUND">
	//  157  328:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  158  331:pop             
				mBuilder.append(";");
	//  159  332:aload_0         
	//  160  333:getfield        #209 <Field StringBuilder mBuilder>
	//  161  336:ldc1            #213 <String ";">
	//  162  338:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  163  341:pop             
				mBuilder.append("X-IRMC-N");
	//  164  342:aload_0         
	//  165  343:getfield        #209 <Field StringBuilder mBuilder>
	//  166  346:ldc1            #250 <String "X-IRMC-N">
	//  167  348:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  168  351:pop             
				boolean flag;
				if(!mRefrainsQPToNameProperties && (!VCardUtils.containsOnlyNonCrLfPrintableAscii(new String[] {
	contentvalues
}) || !VCardUtils.containsOnlyNonCrLfPrintableAscii(new String[] {
	s
}) || !VCardUtils.containsOnlyNonCrLfPrintableAscii(new String[] {
	s2
})))
	//* 169  352:aload_0         
	//* 170  353:getfield        #107 <Field boolean mRefrainsQPToNameProperties>
	//* 171  356:ifne            408
	//* 172  359:iconst_1        
	//* 173  360:anewarray       String[]
	//* 174  363:dup             
	//* 175  364:iconst_0        
	//* 176  365:aload_1         
	//* 177  366:aastore         
	//* 178  367:invokestatic    #262 <Method boolean VCardUtils.containsOnlyNonCrLfPrintableAscii(String[])>
	//* 179  370:ifeq            403
	//* 180  373:iconst_1        
	//* 181  374:anewarray       String[]
	//* 182  377:dup             
	//* 183  378:iconst_0        
	//* 184  379:aload           4
	//* 185  381:aastore         
	//* 186  382:invokestatic    #262 <Method boolean VCardUtils.containsOnlyNonCrLfPrintableAscii(String[])>
	//* 187  385:ifeq            403
	//* 188  388:iconst_1        
	//* 189  389:anewarray       String[]
	//* 190  392:dup             
	//* 191  393:iconst_0        
	//* 192  394:aload           5
	//* 193  396:aastore         
	//* 194  397:invokestatic    #262 <Method boolean VCardUtils.containsOnlyNonCrLfPrintableAscii(String[])>
	//* 195  400:ifne            408
					flag = true;
	//  196  403:iconst_1        
	//  197  404:istore_2        
				else
	//* 198  405:goto            410
					flag = false;
	//  199  408:iconst_0        
	//  200  409:istore_2        
				String s6;
				String s9;
				String s11;
				if(flag)
	//* 201  410:iload_2         
	//* 202  411:ifeq            440
				{
					s6 = encodeQuotedPrintable(((String) (contentvalues)));
	//  203  414:aload_0         
	//  204  415:aload_1         
	//  205  416:invokespecial   #265 <Method String encodeQuotedPrintable(String)>
	//  206  419:astore          6
					s9 = encodeQuotedPrintable(s);
	//  207  421:aload_0         
	//  208  422:aload           4
	//  209  424:invokespecial   #265 <Method String encodeQuotedPrintable(String)>
	//  210  427:astore          7
					s11 = encodeQuotedPrintable(s2);
	//  211  429:aload_0         
	//  212  430:aload           5
	//  213  432:invokespecial   #265 <Method String encodeQuotedPrintable(String)>
	//  214  435:astore          8
				} else
	//* 215  437:goto            463
				{
					s6 = escapeCharacters(((String) (contentvalues)));
	//  216  440:aload_0         
	//  217  441:aload_1         
	//  218  442:invokespecial   #207 <Method String escapeCharacters(String)>
	//  219  445:astore          6
					s9 = escapeCharacters(s);
	//  220  447:aload_0         
	//  221  448:aload           4
	//  222  450:invokespecial   #207 <Method String escapeCharacters(String)>
	//  223  453:astore          7
					s11 = escapeCharacters(s2);
	//  224  455:aload_0         
	//  225  456:aload           5
	//  226  458:invokespecial   #207 <Method String escapeCharacters(String)>
	//  227  461:astore          8
				}
				if(shouldAppendCharsetParam(new String[] {
	s6, s9, s11
}))
	//* 228  463:aload_0         
	//* 229  464:iconst_3        
	//* 230  465:anewarray       String[]
	//* 231  468:dup             
	//* 232  469:iconst_0        
	//* 233  470:aload           6
	//* 234  472:aastore         
	//* 235  473:dup             
	//* 236  474:iconst_1        
	//* 237  475:aload           7
	//* 238  477:aastore         
	//* 239  478:dup             
	//* 240  479:iconst_2        
	//* 241  480:aload           8
	//* 242  482:aastore         
	//* 243  483:invokespecial   #259 <Method boolean shouldAppendCharsetParam(String[])>
	//* 244  486:ifeq            511
				{
					mBuilder.append(";");
	//  245  489:aload_0         
	//  246  490:getfield        #209 <Field StringBuilder mBuilder>
	//  247  493:ldc1            #213 <String ";">
	//  248  495:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  249  498:pop             
					mBuilder.append(mVCardCharsetParameter);
	//  250  499:aload_0         
	//  251  500:getfield        #209 <Field StringBuilder mBuilder>
	//  252  503:aload_0         
	//  253  504:getfield        #136 <Field String mVCardCharsetParameter>
	//  254  507:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  255  510:pop             
				}
				mBuilder.append(":");
	//  256  511:aload_0         
	//  257  512:getfield        #209 <Field StringBuilder mBuilder>
	//  258  515:ldc1            #225 <String ":">
	//  259  517:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  260  520:pop             
				if(!TextUtils.isEmpty(((CharSequence) (s6))))
	//* 261  521:aload           6
	//* 262  523:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 263  526:ifne            544
				{
					mBuilder.append(s6);
	//  264  529:aload_0         
	//  265  530:getfield        #209 <Field StringBuilder mBuilder>
	//  266  533:aload           6
	//  267  535:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  268  538:pop             
					flag = false;
	//  269  539:iconst_0        
	//  270  540:istore_2        
				} else
	//* 271  541:goto            546
				{
					flag = true;
	//  272  544:iconst_1        
	//  273  545:istore_2        
				}
				boolean flag4 = flag;
	//  274  546:iload_2         
	//  275  547:istore_3        
				if(!TextUtils.isEmpty(((CharSequence) (s9))))
	//* 276  548:aload           7
	//* 277  550:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 278  553:ifne            587
				{
					if(flag)
	//* 279  556:iload_2         
	//* 280  557:ifeq            565
						flag = false;
	//  281  560:iconst_0        
	//  282  561:istore_2        
					else
	//* 283  562:goto            575
						mBuilder.append(' ');
	//  284  565:aload_0         
	//  285  566:getfield        #209 <Field StringBuilder mBuilder>
	//  286  569:bipush          32
	//  287  571:invokevirtual   #216 <Method StringBuilder StringBuilder.append(char)>
	//  288  574:pop             
					mBuilder.append(s9);
	//  289  575:aload_0         
	//  290  576:getfield        #209 <Field StringBuilder mBuilder>
	//  291  579:aload           7
	//  292  581:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  293  584:pop             
					flag4 = flag;
	//  294  585:iload_2         
	//  295  586:istore_3        
				}
				if(!TextUtils.isEmpty(((CharSequence) (s11))))
	//* 296  587:aload           8
	//* 297  589:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 298  592:ifne            619
				{
					if(!flag4)
	//* 299  595:iload_3         
	//* 300  596:ifne            609
						mBuilder.append(' ');
	//  301  599:aload_0         
	//  302  600:getfield        #209 <Field StringBuilder mBuilder>
	//  303  603:bipush          32
	//  304  605:invokevirtual   #216 <Method StringBuilder StringBuilder.append(char)>
	//  305  608:pop             
					mBuilder.append(s11);
	//  306  609:aload_0         
	//  307  610:getfield        #209 <Field StringBuilder mBuilder>
	//  308  613:aload           8
	//  309  615:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  310  618:pop             
				}
				mBuilder.append(";");
	//  311  619:aload_0         
	//  312  620:getfield        #209 <Field StringBuilder mBuilder>
	//  313  623:ldc1            #213 <String ";">
	//  314  625:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  315  628:pop             
				mBuilder.append(";");
	//  316  629:aload_0         
	//  317  630:getfield        #209 <Field StringBuilder mBuilder>
	//  318  633:ldc1            #213 <String ";">
	//  319  635:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  320  638:pop             
				mBuilder.append(";");
	//  321  639:aload_0         
	//  322  640:getfield        #209 <Field StringBuilder mBuilder>
	//  323  643:ldc1            #213 <String ";">
	//  324  645:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  325  648:pop             
				mBuilder.append(";");
	//  326  649:aload_0         
	//  327  650:getfield        #209 <Field StringBuilder mBuilder>
	//  328  653:ldc1            #213 <String ";">
	//  329  655:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  330  658:pop             
				mBuilder.append("\r\n");
	//  331  659:aload_0         
	//  332  660:getfield        #209 <Field StringBuilder mBuilder>
	//  333  663:ldc1            #227 <String "\r\n">
	//  334  665:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  335  668:pop             
			}
		if(mUsesDefactProperty)
	//* 336  669:aload_0         
	//* 337  670:getfield        #102 <Field boolean mUsesDefactProperty>
	//* 338  673:ifeq            1163
		{
			if(!TextUtils.isEmpty(((CharSequence) (s2))))
	//* 339  676:aload           5
	//* 340  678:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 341  681:ifne            840
			{
				boolean flag1;
				if(mShouldUseQuotedPrintable && !VCardUtils.containsOnlyNonCrLfPrintableAscii(new String[] {
	s2
}))
	//* 342  684:aload_0         
	//* 343  685:getfield        #87  <Field boolean mShouldUseQuotedPrintable>
	//* 344  688:ifeq            711
	//* 345  691:iconst_1        
	//* 346  692:anewarray       String[]
	//* 347  695:dup             
	//* 348  696:iconst_0        
	//* 349  697:aload           5
	//* 350  699:aastore         
	//* 351  700:invokestatic    #262 <Method boolean VCardUtils.containsOnlyNonCrLfPrintableAscii(String[])>
	//* 352  703:ifne            711
					flag1 = true;
	//  353  706:iconst_1        
	//  354  707:istore_2        
				else
	//* 355  708:goto            713
					flag1 = false;
	//  356  711:iconst_0        
	//  357  712:istore_2        
				String s7;
				if(flag1)
	//* 358  713:iload_2         
	//* 359  714:ifeq            728
					s7 = encodeQuotedPrintable(s2);
	//  360  717:aload_0         
	//  361  718:aload           5
	//  362  720:invokespecial   #265 <Method String encodeQuotedPrintable(String)>
	//  363  723:astore          6
				else
	//* 364  725:goto            736
					s7 = escapeCharacters(s2);
	//  365  728:aload_0         
	//  366  729:aload           5
	//  367  731:invokespecial   #207 <Method String escapeCharacters(String)>
	//  368  734:astore          6
				mBuilder.append("X-PHONETIC-FIRST-NAME");
	//  369  736:aload_0         
	//  370  737:getfield        #209 <Field StringBuilder mBuilder>
	//  371  740:ldc2            #267 <String "X-PHONETIC-FIRST-NAME">
	//  372  743:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  373  746:pop             
				if(shouldAppendCharsetParam(new String[] {
	s2
}))
	//* 374  747:aload_0         
	//* 375  748:iconst_1        
	//* 376  749:anewarray       String[]
	//* 377  752:dup             
	//* 378  753:iconst_0        
	//* 379  754:aload           5
	//* 380  756:aastore         
	//* 381  757:invokespecial   #259 <Method boolean shouldAppendCharsetParam(String[])>
	//* 382  760:ifeq            785
				{
					mBuilder.append(";");
	//  383  763:aload_0         
	//  384  764:getfield        #209 <Field StringBuilder mBuilder>
	//  385  767:ldc1            #213 <String ";">
	//  386  769:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  387  772:pop             
					mBuilder.append(mVCardCharsetParameter);
	//  388  773:aload_0         
	//  389  774:getfield        #209 <Field StringBuilder mBuilder>
	//  390  777:aload_0         
	//  391  778:getfield        #136 <Field String mVCardCharsetParameter>
	//  392  781:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  393  784:pop             
				}
				if(flag1)
	//* 394  785:iload_2         
	//* 395  786:ifeq            810
				{
					mBuilder.append(";");
	//  396  789:aload_0         
	//  397  790:getfield        #209 <Field StringBuilder mBuilder>
	//  398  793:ldc1            #213 <String ";">
	//  399  795:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  400  798:pop             
					mBuilder.append("ENCODING=QUOTED-PRINTABLE");
	//  401  799:aload_0         
	//  402  800:getfield        #209 <Field StringBuilder mBuilder>
	//  403  803:ldc2            #269 <String "ENCODING=QUOTED-PRINTABLE">
	//  404  806:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  405  809:pop             
				}
				mBuilder.append(":");
	//  406  810:aload_0         
	//  407  811:getfield        #209 <Field StringBuilder mBuilder>
	//  408  814:ldc1            #225 <String ":">
	//  409  816:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  410  819:pop             
				mBuilder.append(s7);
	//  411  820:aload_0         
	//  412  821:getfield        #209 <Field StringBuilder mBuilder>
	//  413  824:aload           6
	//  414  826:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  415  829:pop             
				mBuilder.append("\r\n");
	//  416  830:aload_0         
	//  417  831:getfield        #209 <Field StringBuilder mBuilder>
	//  418  834:ldc1            #227 <String "\r\n">
	//  419  836:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  420  839:pop             
			}
			if(!TextUtils.isEmpty(((CharSequence) (s))))
	//* 421  840:aload           4
	//* 422  842:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 423  845:ifne            1004
			{
				boolean flag2;
				if(mShouldUseQuotedPrintable && !VCardUtils.containsOnlyNonCrLfPrintableAscii(new String[] {
	s
}))
	//* 424  848:aload_0         
	//* 425  849:getfield        #87  <Field boolean mShouldUseQuotedPrintable>
	//* 426  852:ifeq            875
	//* 427  855:iconst_1        
	//* 428  856:anewarray       String[]
	//* 429  859:dup             
	//* 430  860:iconst_0        
	//* 431  861:aload           4
	//* 432  863:aastore         
	//* 433  864:invokestatic    #262 <Method boolean VCardUtils.containsOnlyNonCrLfPrintableAscii(String[])>
	//* 434  867:ifne            875
					flag2 = true;
	//  435  870:iconst_1        
	//  436  871:istore_2        
				else
	//* 437  872:goto            877
					flag2 = false;
	//  438  875:iconst_0        
	//  439  876:istore_2        
				String s3;
				if(flag2)
	//* 440  877:iload_2         
	//* 441  878:ifeq            892
					s3 = encodeQuotedPrintable(s);
	//  442  881:aload_0         
	//  443  882:aload           4
	//  444  884:invokespecial   #265 <Method String encodeQuotedPrintable(String)>
	//  445  887:astore          5
				else
	//* 446  889:goto            900
					s3 = escapeCharacters(s);
	//  447  892:aload_0         
	//  448  893:aload           4
	//  449  895:invokespecial   #207 <Method String escapeCharacters(String)>
	//  450  898:astore          5
				mBuilder.append("X-PHONETIC-MIDDLE-NAME");
	//  451  900:aload_0         
	//  452  901:getfield        #209 <Field StringBuilder mBuilder>
	//  453  904:ldc2            #271 <String "X-PHONETIC-MIDDLE-NAME">
	//  454  907:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  455  910:pop             
				if(shouldAppendCharsetParam(new String[] {
	s
}))
	//* 456  911:aload_0         
	//* 457  912:iconst_1        
	//* 458  913:anewarray       String[]
	//* 459  916:dup             
	//* 460  917:iconst_0        
	//* 461  918:aload           4
	//* 462  920:aastore         
	//* 463  921:invokespecial   #259 <Method boolean shouldAppendCharsetParam(String[])>
	//* 464  924:ifeq            949
				{
					mBuilder.append(";");
	//  465  927:aload_0         
	//  466  928:getfield        #209 <Field StringBuilder mBuilder>
	//  467  931:ldc1            #213 <String ";">
	//  468  933:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  469  936:pop             
					mBuilder.append(mVCardCharsetParameter);
	//  470  937:aload_0         
	//  471  938:getfield        #209 <Field StringBuilder mBuilder>
	//  472  941:aload_0         
	//  473  942:getfield        #136 <Field String mVCardCharsetParameter>
	//  474  945:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  475  948:pop             
				}
				if(flag2)
	//* 476  949:iload_2         
	//* 477  950:ifeq            974
				{
					mBuilder.append(";");
	//  478  953:aload_0         
	//  479  954:getfield        #209 <Field StringBuilder mBuilder>
	//  480  957:ldc1            #213 <String ";">
	//  481  959:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  482  962:pop             
					mBuilder.append("ENCODING=QUOTED-PRINTABLE");
	//  483  963:aload_0         
	//  484  964:getfield        #209 <Field StringBuilder mBuilder>
	//  485  967:ldc2            #269 <String "ENCODING=QUOTED-PRINTABLE">
	//  486  970:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  487  973:pop             
				}
				mBuilder.append(":");
	//  488  974:aload_0         
	//  489  975:getfield        #209 <Field StringBuilder mBuilder>
	//  490  978:ldc1            #225 <String ":">
	//  491  980:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  492  983:pop             
				mBuilder.append(s3);
	//  493  984:aload_0         
	//  494  985:getfield        #209 <Field StringBuilder mBuilder>
	//  495  988:aload           5
	//  496  990:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  497  993:pop             
				mBuilder.append("\r\n");
	//  498  994:aload_0         
	//  499  995:getfield        #209 <Field StringBuilder mBuilder>
	//  500  998:ldc1            #227 <String "\r\n">
	//  501 1000:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  502 1003:pop             
			}
			if(!TextUtils.isEmpty(((CharSequence) (contentvalues))))
	//* 503 1004:aload_1         
	//* 504 1005:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 505 1008:ifne            1163
			{
				boolean flag3;
				if(mShouldUseQuotedPrintable && !VCardUtils.containsOnlyNonCrLfPrintableAscii(new String[] {
	contentvalues
}))
	//* 506 1011:aload_0         
	//* 507 1012:getfield        #87  <Field boolean mShouldUseQuotedPrintable>
	//* 508 1015:ifeq            1037
	//* 509 1018:iconst_1        
	//* 510 1019:anewarray       String[]
	//* 511 1022:dup             
	//* 512 1023:iconst_0        
	//* 513 1024:aload_1         
	//* 514 1025:aastore         
	//* 515 1026:invokestatic    #262 <Method boolean VCardUtils.containsOnlyNonCrLfPrintableAscii(String[])>
	//* 516 1029:ifne            1037
					flag3 = true;
	//  517 1032:iconst_1        
	//  518 1033:istore_2        
				else
	//* 519 1034:goto            1039
					flag3 = false;
	//  520 1037:iconst_0        
	//  521 1038:istore_2        
				String s1;
				if(flag3)
	//* 522 1039:iload_2         
	//* 523 1040:ifeq            1053
					s1 = encodeQuotedPrintable(((String) (contentvalues)));
	//  524 1043:aload_0         
	//  525 1044:aload_1         
	//  526 1045:invokespecial   #265 <Method String encodeQuotedPrintable(String)>
	//  527 1048:astore          4
				else
	//* 528 1050:goto            1060
					s1 = escapeCharacters(((String) (contentvalues)));
	//  529 1053:aload_0         
	//  530 1054:aload_1         
	//  531 1055:invokespecial   #207 <Method String escapeCharacters(String)>
	//  532 1058:astore          4
				mBuilder.append("X-PHONETIC-LAST-NAME");
	//  533 1060:aload_0         
	//  534 1061:getfield        #209 <Field StringBuilder mBuilder>
	//  535 1064:ldc2            #273 <String "X-PHONETIC-LAST-NAME">
	//  536 1067:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  537 1070:pop             
				if(shouldAppendCharsetParam(new String[] {
	contentvalues
}))
	//* 538 1071:aload_0         
	//* 539 1072:iconst_1        
	//* 540 1073:anewarray       String[]
	//* 541 1076:dup             
	//* 542 1077:iconst_0        
	//* 543 1078:aload_1         
	//* 544 1079:aastore         
	//* 545 1080:invokespecial   #259 <Method boolean shouldAppendCharsetParam(String[])>
	//* 546 1083:ifeq            1108
				{
					mBuilder.append(";");
	//  547 1086:aload_0         
	//  548 1087:getfield        #209 <Field StringBuilder mBuilder>
	//  549 1090:ldc1            #213 <String ";">
	//  550 1092:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  551 1095:pop             
					mBuilder.append(mVCardCharsetParameter);
	//  552 1096:aload_0         
	//  553 1097:getfield        #209 <Field StringBuilder mBuilder>
	//  554 1100:aload_0         
	//  555 1101:getfield        #136 <Field String mVCardCharsetParameter>
	//  556 1104:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  557 1107:pop             
				}
				if(flag3)
	//* 558 1108:iload_2         
	//* 559 1109:ifeq            1133
				{
					mBuilder.append(";");
	//  560 1112:aload_0         
	//  561 1113:getfield        #209 <Field StringBuilder mBuilder>
	//  562 1116:ldc1            #213 <String ";">
	//  563 1118:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  564 1121:pop             
					mBuilder.append("ENCODING=QUOTED-PRINTABLE");
	//  565 1122:aload_0         
	//  566 1123:getfield        #209 <Field StringBuilder mBuilder>
	//  567 1126:ldc2            #269 <String "ENCODING=QUOTED-PRINTABLE">
	//  568 1129:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  569 1132:pop             
				}
				mBuilder.append(":");
	//  570 1133:aload_0         
	//  571 1134:getfield        #209 <Field StringBuilder mBuilder>
	//  572 1137:ldc1            #225 <String ":">
	//  573 1139:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  574 1142:pop             
				mBuilder.append(s1);
	//  575 1143:aload_0         
	//  576 1144:getfield        #209 <Field StringBuilder mBuilder>
	//  577 1147:aload           4
	//  578 1149:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  579 1152:pop             
				mBuilder.append("\r\n");
	//  580 1153:aload_0         
	//  581 1154:getfield        #209 <Field StringBuilder mBuilder>
	//  582 1157:ldc1            #227 <String "\r\n">
	//  583 1159:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  584 1162:pop             
			}
		}
	//  585 1163:return          
	}

	private void appendTypeParameter(String s)
	{
		appendTypeParameter(mBuilder, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #209 <Field StringBuilder mBuilder>
	//    3    5:aload_1         
	//    4    6:invokespecial   #278 <Method void appendTypeParameter(StringBuilder, String)>
	//    5    9:return          
	}

	private void appendTypeParameter(StringBuilder stringbuilder, String s)
	{
		if(VCardConfig.isVersion40(mVCardType) || (VCardConfig.isVersion30(mVCardType) || mAppendTypeParamName) && !mIsDoCoMo)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int mVCardType>
	//*   2    4:invokestatic    #67  <Method boolean VCardConfig.isVersion40(int)>
	//*   3    7:ifne            34
	//*   4   10:aload_0         
	//*   5   11:getfield        #61  <Field int mVCardType>
	//*   6   14:invokestatic    #80  <Method boolean VCardConfig.isVersion30(int)>
	//*   7   17:ifne            27
	//*   8   20:aload_0         
	//*   9   21:getfield        #112 <Field boolean mAppendTypeParamName>
	//*  10   24:ifeq            50
	//*  11   27:aload_0         
	//*  12   28:getfield        #92  <Field boolean mIsDoCoMo>
	//*  13   31:ifne            50
		{
			stringbuilder.append("TYPE");
	//   14   34:aload_1         
	//   15   35:ldc2            #280 <String "TYPE">
	//   16   38:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   17   41:pop             
			stringbuilder.append("=");
	//   18   42:aload_1         
	//   19   43:ldc2            #282 <String "=">
	//   20   46:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   21   49:pop             
		}
		stringbuilder.append(s);
	//   22   50:aload_1         
	//   23   51:aload_2         
	//   24   52:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   25   55:pop             
	//   26   56:return          
	}

	private void appendTypeParameters(List list)
	{
		Iterator iterator = list.iterator();
	//    0    0:aload_1         
	//    1    1:invokeinterface #288 <Method Iterator List.iterator()>
	//    2    6:astore_3        
		boolean flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    5    9:aload_3         
	//    6   10:invokeinterface #293 <Method boolean Iterator.hasNext()>
	//    7   15:ifeq            148
			list = ((List) ((String)iterator.next()));
	//    8   18:aload_3         
	//    9   19:invokeinterface #297 <Method Object Iterator.next()>
	//   10   24:checkcast       #31  <Class String>
	//   11   27:astore_1        
			if(!VCardConfig.isVersion30(mVCardType) && !VCardConfig.isVersion40(mVCardType))
	//*  12   28:aload_0         
	//*  13   29:getfield        #61  <Field int mVCardType>
	//*  14   32:invokestatic    #80  <Method boolean VCardConfig.isVersion30(int)>
	//*  15   35:ifne            88
	//*  16   38:aload_0         
	//*  17   39:getfield        #61  <Field int mVCardType>
	//*  18   42:invokestatic    #67  <Method boolean VCardConfig.isVersion40(int)>
	//*  19   45:ifeq            51
	//*  20   48:goto            88
			{
				if(VCardUtils.isV21Word(((String) (list))))
	//*  21   51:aload_1         
	//*  22   52:invokestatic    #300 <Method boolean VCardUtils.isV21Word(String)>
	//*  23   55:ifne            61
	//*  24   58:goto            9
				{
					if(flag)
	//*  25   61:iload_2         
	//*  26   62:ifeq            70
						flag = false;
	//   27   65:iconst_0        
	//   28   66:istore_2        
					else
	//*  29   67:goto            80
						mBuilder.append(";");
	//   30   70:aload_0         
	//   31   71:getfield        #209 <Field StringBuilder mBuilder>
	//   32   74:ldc1            #213 <String ";">
	//   33   76:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   34   79:pop             
					appendTypeParameter(((String) (list)));
	//   35   80:aload_0         
	//   36   81:aload_1         
	//   37   82:invokespecial   #302 <Method void appendTypeParameter(String)>
				}
			} else
	//*  38   85:goto            9
			{
				if(VCardConfig.isVersion40(mVCardType))
	//*  39   88:aload_0         
	//*  40   89:getfield        #61  <Field int mVCardType>
	//*  41   92:invokestatic    #67  <Method boolean VCardConfig.isVersion40(int)>
	//*  42   95:ifeq            106
					list = ((List) (VCardUtils.toStringAsV40ParamValue(((String) (list)))));
	//   43   98:aload_1         
	//   44   99:invokestatic    #223 <Method String VCardUtils.toStringAsV40ParamValue(String)>
	//   45  102:astore_1        
				else
	//*  46  103:goto            111
					list = ((List) (VCardUtils.toStringAsV30ParamValue(((String) (list)))));
	//   47  106:aload_1         
	//   48  107:invokestatic    #305 <Method String VCardUtils.toStringAsV30ParamValue(String)>
	//   49  110:astore_1        
				if(!TextUtils.isEmpty(((CharSequence) (list))))
	//*  50  111:aload_1         
	//*  51  112:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  52  115:ifeq            121
	//*  53  118:goto            9
				{
					if(flag)
	//*  54  121:iload_2         
	//*  55  122:ifeq            130
						flag = false;
	//   56  125:iconst_0        
	//   57  126:istore_2        
					else
	//*  58  127:goto            140
						mBuilder.append(";");
	//   59  130:aload_0         
	//   60  131:getfield        #209 <Field StringBuilder mBuilder>
	//   61  134:ldc1            #213 <String ";">
	//   62  136:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   63  139:pop             
					appendTypeParameter(((String) (list)));
	//   64  140:aload_0         
	//   65  141:aload_1         
	//   66  142:invokespecial   #302 <Method void appendTypeParameter(String)>
				}
			}
		} while(true);
	//   67  145:goto            9
	//   68  148:return          
	}

	private void appendUncommonPhoneType(StringBuilder stringbuilder, Integer integer)
	{
		if(mIsDoCoMo)
	//*   0    0:aload_0         
	//*   1    1:getfield        #92  <Field boolean mIsDoCoMo>
	//*   2    4:ifeq            16
		{
			stringbuilder.append("VOICE");
	//    3    7:aload_1         
	//    4    8:ldc2            #310 <String "VOICE">
	//    5   11:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:pop             
			return;
	//    7   15:return          
		}
		stringbuilder = ((StringBuilder) (VCardUtils.getPhoneTypeString(integer)));
	//    8   16:aload_2         
	//    9   17:invokestatic    #314 <Method String VCardUtils.getPhoneTypeString(Integer)>
	//   10   20:astore_1        
		if(stringbuilder != null)
	//*  11   21:aload_1         
	//*  12   22:ifnull          31
		{
			appendTypeParameter(((String) (stringbuilder)));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokespecial   #302 <Method void appendTypeParameter(String)>
			return;
	//   16   30:return          
		} else
		{
			stringbuilder = new StringBuilder();
	//   17   31:new             #145 <Class StringBuilder>
	//   18   34:dup             
	//   19   35:invokespecial   #146 <Method void StringBuilder()>
	//   20   38:astore_1        
			stringbuilder.append("Unknown or unsupported (by vCard) Phone type: ");
	//   21   39:aload_1         
	//   22   40:ldc2            #316 <String "Unknown or unsupported (by vCard) Phone type: ">
	//   23   43:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
			stringbuilder.append(((Object) (integer)));
	//   25   47:aload_1         
	//   26   48:aload_2         
	//   27   49:invokevirtual   #319 <Method StringBuilder StringBuilder.append(Object)>
	//   28   52:pop             
			Log.e("vCard", stringbuilder.toString());
	//   29   53:ldc1            #69  <String "vCard">
	//   30   55:aload_1         
	//   31   56:invokevirtual   #156 <Method String StringBuilder.toString()>
	//   32   59:invokestatic    #322 <Method int Log.e(String, String)>
	//   33   62:pop             
			return;
	//   34   63:return          
		}
	}

	private void buildSinglePartNameField(String s, String s1)
	{
		boolean flag;
		if(!mRefrainsQPToNameProperties && !VCardUtils.containsOnlyNonCrLfPrintableAscii(new String[] {
	s1
}))
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field boolean mRefrainsQPToNameProperties>
	//*   2    4:ifne            26
	//*   3    7:iconst_1        
	//*   4    8:anewarray       String[]
	//*   5   11:dup             
	//*   6   12:iconst_0        
	//*   7   13:aload_2         
	//*   8   14:aastore         
	//*   9   15:invokestatic    #262 <Method boolean VCardUtils.containsOnlyNonCrLfPrintableAscii(String[])>
	//*  10   18:ifne            26
			flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_3        
		else
	//*  13   23:goto            28
			flag = false;
	//   14   26:iconst_0        
	//   15   27:istore_3        
		String s2;
		if(flag)
	//*  16   28:iload_3         
	//*  17   29:ifeq            42
			s2 = encodeQuotedPrintable(s1);
	//   18   32:aload_0         
	//   19   33:aload_2         
	//   20   34:invokespecial   #265 <Method String encodeQuotedPrintable(String)>
	//   21   37:astore          4
		else
	//*  22   39:goto            49
			s2 = escapeCharacters(s1);
	//   23   42:aload_0         
	//   24   43:aload_2         
	//   25   44:invokespecial   #207 <Method String escapeCharacters(String)>
	//   26   47:astore          4
		mBuilder.append(s);
	//   27   49:aload_0         
	//   28   50:getfield        #209 <Field StringBuilder mBuilder>
	//   29   53:aload_1         
	//   30   54:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   31   57:pop             
		if(shouldAppendCharsetParam(new String[] {
	s1
}))
	//*  32   58:aload_0         
	//*  33   59:iconst_1        
	//*  34   60:anewarray       String[]
	//*  35   63:dup             
	//*  36   64:iconst_0        
	//*  37   65:aload_2         
	//*  38   66:aastore         
	//*  39   67:invokespecial   #259 <Method boolean shouldAppendCharsetParam(String[])>
	//*  40   70:ifeq            95
		{
			mBuilder.append(";");
	//   41   73:aload_0         
	//   42   74:getfield        #209 <Field StringBuilder mBuilder>
	//   43   77:ldc1            #213 <String ";">
	//   44   79:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   45   82:pop             
			mBuilder.append(mVCardCharsetParameter);
	//   46   83:aload_0         
	//   47   84:getfield        #209 <Field StringBuilder mBuilder>
	//   48   87:aload_0         
	//   49   88:getfield        #136 <Field String mVCardCharsetParameter>
	//   50   91:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   51   94:pop             
		}
		if(flag)
	//*  52   95:iload_3         
	//*  53   96:ifeq            120
		{
			mBuilder.append(";");
	//   54   99:aload_0         
	//   55  100:getfield        #209 <Field StringBuilder mBuilder>
	//   56  103:ldc1            #213 <String ";">
	//   57  105:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   58  108:pop             
			mBuilder.append("ENCODING=QUOTED-PRINTABLE");
	//   59  109:aload_0         
	//   60  110:getfield        #209 <Field StringBuilder mBuilder>
	//   61  113:ldc2            #269 <String "ENCODING=QUOTED-PRINTABLE">
	//   62  116:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   63  119:pop             
		}
		mBuilder.append(":");
	//   64  120:aload_0         
	//   65  121:getfield        #209 <Field StringBuilder mBuilder>
	//   66  124:ldc1            #225 <String ":">
	//   67  126:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   68  129:pop             
		mBuilder.append(s2);
	//   69  130:aload_0         
	//   70  131:getfield        #209 <Field StringBuilder mBuilder>
	//   71  134:aload           4
	//   72  136:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   73  139:pop             
	//   74  140:return          
	}

	private boolean containsNonEmptyName(ContentValues contentvalues)
	{
		String s = contentvalues.getAsString("data3");
	//    0    0:aload_1         
	//    1    1:ldc1            #174 <String "data3">
	//    2    3:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//    3    6:astore_2        
		String s1 = contentvalues.getAsString("data5");
	//    4    7:aload_1         
	//    5    8:ldc1            #182 <String "data5">
	//    6   10:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//    7   13:astore_3        
		String s2 = contentvalues.getAsString("data2");
	//    8   14:aload_1         
	//    9   15:ldc1            #184 <String "data2">
	//   10   17:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   11   20:astore          4
		String s3 = contentvalues.getAsString("data4");
	//   12   22:aload_1         
	//   13   23:ldc1            #186 <String "data4">
	//   14   25:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   15   28:astore          5
		String s4 = contentvalues.getAsString("data6");
	//   16   30:aload_1         
	//   17   31:ldc1            #188 <String "data6">
	//   18   33:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   19   36:astore          6
		String s5 = contentvalues.getAsString("data9");
	//   20   38:aload_1         
	//   21   39:ldc1            #200 <String "data9">
	//   22   41:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   23   44:astore          7
		String s6 = contentvalues.getAsString("data8");
	//   24   46:aload_1         
	//   25   47:ldc1            #202 <String "data8">
	//   26   49:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   27   52:astore          8
		String s7 = contentvalues.getAsString("data7");
	//   28   54:aload_1         
	//   29   55:ldc1            #204 <String "data7">
	//   30   57:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   31   60:astore          9
		contentvalues = ((ContentValues) (contentvalues.getAsString("data1")));
	//   32   62:aload_1         
	//   33   63:ldc1            #190 <String "data1">
	//   34   65:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   35   68:astore_1        
		return !TextUtils.isEmpty(((CharSequence) (s))) || !TextUtils.isEmpty(((CharSequence) (s1))) || !TextUtils.isEmpty(((CharSequence) (s2))) || !TextUtils.isEmpty(((CharSequence) (s3))) || !TextUtils.isEmpty(((CharSequence) (s4))) || !TextUtils.isEmpty(((CharSequence) (s5))) || !TextUtils.isEmpty(((CharSequence) (s6))) || !TextUtils.isEmpty(((CharSequence) (s7))) || !TextUtils.isEmpty(((CharSequence) (contentvalues)));
	//   36   69:aload_2         
	//   37   70:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   38   73:ifeq            143
	//   39   76:aload_3         
	//   40   77:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   41   80:ifeq            143
	//   42   83:aload           4
	//   43   85:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   44   88:ifeq            143
	//   45   91:aload           5
	//   46   93:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   47   96:ifeq            143
	//   48   99:aload           6
	//   49  101:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   50  104:ifeq            143
	//   51  107:aload           7
	//   52  109:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   53  112:ifeq            143
	//   54  115:aload           8
	//   55  117:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   56  120:ifeq            143
	//   57  123:aload           9
	//   58  125:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   59  128:ifeq            143
	//   60  131:aload_1         
	//   61  132:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   62  135:ifne            141
	//   63  138:goto            143
	//   64  141:iconst_0        
	//   65  142:ireturn         
	//   66  143:iconst_1        
	//   67  144:ireturn         
	}

	private String encodeQuotedPrintable(String s)
	{
		StringBuilder stringbuilder1;
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            10
			return "";
	//    3    7:ldc1            #194 <String "">
	//    4    9:areturn         
		stringbuilder1 = new StringBuilder();
	//    5   10:new             #145 <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #146 <Method void StringBuilder()>
	//    8   17:astore          7
		byte abyte0[] = s.getBytes(mCharset);
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #132 <Field String mCharset>
	//   12   24:invokevirtual   #331 <Method byte[] String.getBytes(String)>
	//   13   27:astore          6
		int i;
		int j;
		s = ((String) (abyte0));
	//   14   29:aload           6
	//   15   31:astore_1        
		j = 0;
	//   16   32:iconst_0        
	//   17   33:istore_3        
		i = 0;
	//   18   34:iconst_0        
	//   19   35:istore_2        
		  goto _L1
	//*  20   36:goto            105
_L3:
		StringBuilder stringbuilder = new StringBuilder();
	//   21   39:new             #145 <Class StringBuilder>
	//   22   42:dup             
	//   23   43:invokespecial   #146 <Method void StringBuilder()>
	//   24   46:astore          6
		stringbuilder.append("Charset ");
	//   25   48:aload           6
	//   26   50:ldc2            #333 <String "Charset ">
	//   27   53:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
		stringbuilder.append(mCharset);
	//   29   57:aload           6
	//   30   59:aload_0         
	//   31   60:getfield        #132 <Field String mCharset>
	//   32   63:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   33   66:pop             
		stringbuilder.append(" cannot be used. ");
	//   34   67:aload           6
	//   35   69:ldc2            #335 <String " cannot be used. ">
	//   36   72:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   37   75:pop             
		stringbuilder.append("Try default charset");
	//   38   76:aload           6
	//   39   78:ldc2            #337 <String "Try default charset">
	//   40   81:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   41   84:pop             
		Log.e("vCard", stringbuilder.toString());
	//   42   85:ldc1            #69  <String "vCard">
	//   43   87:aload           6
	//   44   89:invokevirtual   #156 <Method String StringBuilder.toString()>
	//   45   92:invokestatic    #322 <Method int Log.e(String, String)>
	//   46   95:pop             
		s = ((String) (s.getBytes()));
	//   47   96:aload_1         
	//   48   97:invokevirtual   #340 <Method byte[] String.getBytes()>
	//   49  100:astore_1        
		j = 0;
	//   50  101:iconst_0        
	//   51  102:istore_3        
		i = 0;
	//   52  103:iconst_0        
	//   53  104:istore_2        
_L1:
		do
		{
			if(j >= s.length)
				break;
	//   54  105:iload_3         
	//   55  106:aload_1         
	//   56  107:arraylength     
	//   57  108:icmpge          176
			stringbuilder1.append(String.format("=%02X", new Object[] {
				Byte.valueOf(s[j])
			}));
	//   58  111:aload           7
	//   59  113:ldc2            #342 <String "=%02X">
	//   60  116:iconst_1        
	//   61  117:anewarray       Object[]
	//   62  120:dup             
	//   63  121:iconst_0        
	//   64  122:aload_1         
	//   65  123:iload_3         
	//   66  124:baload          
	//   67  125:invokestatic    #348 <Method Byte Byte.valueOf(byte)>
	//   68  128:aastore         
	//   69  129:invokestatic    #352 <Method String String.format(String, Object[])>
	//   70  132:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   71  135:pop             
			int k = j + 1;
	//   72  136:iload_3         
	//   73  137:iconst_1        
	//   74  138:iadd            
	//   75  139:istore          4
			int l = i + 3;
	//   76  141:iload_2         
	//   77  142:iconst_3        
	//   78  143:iadd            
	//   79  144:istore          5
			i = l;
	//   80  146:iload           5
	//   81  148:istore_2        
			j = k;
	//   82  149:iload           4
	//   83  151:istore_3        
			if(l >= 67)
	//*  84  152:iload           5
	//*  85  154:bipush          67
	//*  86  156:icmplt          105
			{
				stringbuilder1.append("=\r\n");
	//   87  159:aload           7
	//   88  161:ldc2            #354 <String "=\r\n">
	//   89  164:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   90  167:pop             
				i = 0;
	//   91  168:iconst_0        
	//   92  169:istore_2        
				j = k;
	//   93  170:iload           4
	//   94  172:istore_3        
			}
		} while(true);
	//   95  173:goto            105
		return stringbuilder1.toString();
	//   96  176:aload           7
	//   97  178:invokevirtual   #156 <Method String StringBuilder.toString()>
	//   98  181:areturn         
		UnsupportedEncodingException unsupportedencodingexception;
		unsupportedencodingexception;
	//   99  182:astore          6
		if(true) goto _L3; else goto _L2
	//  100  184:goto            39
_L2:
	}

	private String escapeCharacters(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            10
			return "";
	//    3    7:ldc1            #194 <String "">
	//    4    9:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//    5   10:new             #145 <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #146 <Method void StringBuilder()>
	//    8   17:astore          5
		int j = s.length();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #358 <Method int String.length()>
	//   11   23:istore          4
		for(int i = 0; i < j; i++)
	//*  12   25:iconst_0        
	//*  13   26:istore_3        
	//*  14   27:iload_3         
	//*  15   28:iload           4
	//*  16   30:icmpge          241
		{
			char c = s.charAt(i);
	//   17   33:aload_1         
	//   18   34:iload_3         
	//   19   35:invokevirtual   #362 <Method char String.charAt(int)>
	//   20   38:istore_2        
			if(c != '\n')
	//*  21   39:iload_2         
	//*  22   40:bipush          10
	//*  23   42:icmpeq          225
			{
				if(c != '\r')
	//*  24   45:iload_2         
	//*  25   46:bipush          13
	//*  26   48:icmpeq          204
				{
					if(c != ',')
	//*  27   51:iload_2         
	//*  28   52:bipush          44
	//*  29   54:icmpeq          175
					{
						if(c != '>')
	//*  30   57:iload_2         
	//*  31   58:bipush          62
	//*  32   60:icmpeq          140
							if(c != '\\')
	//*  33   63:iload_2         
	//*  34   64:bipush          92
	//*  35   66:icmpeq          121
								switch(c)
	//*  36   69:iload_2         
								{
	//*  37   70:tableswitch     59 60: default 92
	//	               59 102
	//	               60 140
								default:
									stringbuilder.append(c);
	//   38   92:aload           5
	//   39   94:iload_2         
	//   40   95:invokevirtual   #216 <Method StringBuilder StringBuilder.append(char)>
	//   41   98:pop             
									continue;
	//   42   99:goto            234

								case 59: // ';'
									stringbuilder.append('\\');
	//   43  102:aload           5
	//   44  104:bipush          92
	//   45  106:invokevirtual   #216 <Method StringBuilder StringBuilder.append(char)>
	//   46  109:pop             
									stringbuilder.append(';');
	//   47  110:aload           5
	//   48  112:bipush          59
	//   49  114:invokevirtual   #216 <Method StringBuilder StringBuilder.append(char)>
	//   50  117:pop             
									continue;
	//   51  118:goto            234

								case 60: // '<'
									break;
								}
							else
							if(mIsV30OrV40)
	//*  52  121:aload_0         
	//*  53  122:getfield        #82  <Field boolean mIsV30OrV40>
	//*  54  125:ifeq            140
							{
								stringbuilder.append("\\\\");
	//   55  128:aload           5
	//   56  130:ldc2            #364 <String "\\\\">
	//   57  133:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   58  136:pop             
								continue;
	//   59  137:goto            234
							}
						if(mIsDoCoMo)
	//*  60  140:aload_0         
	//*  61  141:getfield        #92  <Field boolean mIsDoCoMo>
	//*  62  144:ifeq            165
						{
							stringbuilder.append('\\');
	//   63  147:aload           5
	//   64  149:bipush          92
	//   65  151:invokevirtual   #216 <Method StringBuilder StringBuilder.append(char)>
	//   66  154:pop             
							stringbuilder.append(c);
	//   67  155:aload           5
	//   68  157:iload_2         
	//   69  158:invokevirtual   #216 <Method StringBuilder StringBuilder.append(char)>
	//   70  161:pop             
						} else
	//*  71  162:goto            234
						{
							stringbuilder.append(c);
	//   72  165:aload           5
	//   73  167:iload_2         
	//   74  168:invokevirtual   #216 <Method StringBuilder StringBuilder.append(char)>
	//   75  171:pop             
						}
						continue;
	//   76  172:goto            234
					}
					if(mIsV30OrV40)
	//*  77  175:aload_0         
	//*  78  176:getfield        #82  <Field boolean mIsV30OrV40>
	//*  79  179:ifeq            194
						stringbuilder.append("\\,");
	//   80  182:aload           5
	//   81  184:ldc2            #366 <String "\\,">
	//   82  187:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   83  190:pop             
					else
	//*  84  191:goto            234
						stringbuilder.append(c);
	//   85  194:aload           5
	//   86  196:iload_2         
	//   87  197:invokevirtual   #216 <Method StringBuilder StringBuilder.append(char)>
	//   88  200:pop             
					continue;
	//   89  201:goto            234
				}
				if(i + 1 < j && s.charAt(i) == '\n')
	//*  90  204:iload_3         
	//*  91  205:iconst_1        
	//*  92  206:iadd            
	//*  93  207:iload           4
	//*  94  209:icmpge          225
	//*  95  212:aload_1         
	//*  96  213:iload_3         
	//*  97  214:invokevirtual   #362 <Method char String.charAt(int)>
	//*  98  217:bipush          10
	//*  99  219:icmpne          225
					continue;
	//  100  222:goto            234
			}
			stringbuilder.append("\\n");
	//  101  225:aload           5
	//  102  227:ldc2            #368 <String "\\n">
	//  103  230:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  104  233:pop             
		}

	//  105  234:iload_3         
	//  106  235:iconst_1        
	//  107  236:iadd            
	//  108  237:istore_3        
	//* 109  238:goto            27
		return stringbuilder.toString();
	//  110  241:aload           5
	//  111  243:invokevirtual   #156 <Method String StringBuilder.toString()>
	//  112  246:areturn         
	}

	private ContentValues getPrimaryContentValueWithStructuredName(List list)
	{
		Iterator iterator = list.iterator();
	//    0    0:aload_1         
	//    1    1:invokeinterface #288 <Method Iterator List.iterator()>
	//    2    6:astore          4
		list = null;
	//    3    8:aconst_null     
	//    4    9:astore_1        
		Object obj1 = null;
	//    5   10:aconst_null     
	//    6   11:astore_3        
		Object obj;
		do
		{
			obj = ((Object) (list));
	//    7   12:aload_1         
	//    8   13:astore_2        
			if(!iterator.hasNext())
				break;
	//    9   14:aload           4
	//   10   16:invokeinterface #293 <Method boolean Iterator.hasNext()>
	//   11   21:ifeq            123
			obj = ((Object) ((ContentValues)iterator.next()));
	//   12   24:aload           4
	//   13   26:invokeinterface #297 <Method Object Iterator.next()>
	//   14   31:checkcast       #176 <Class ContentValues>
	//   15   34:astore_2        
			if(obj == null)
	//*  16   35:aload_2         
	//*  17   36:ifnonnull       42
				continue;
	//   18   39:goto            12
			Integer integer = ((ContentValues) (obj)).getAsInteger("is_super_primary");
	//   19   42:aload_2         
	//   20   43:ldc2            #370 <String "is_super_primary">
	//   21   46:invokevirtual   #374 <Method Integer ContentValues.getAsInteger(String)>
	//   22   49:astore          5
			if(integer != null && integer.intValue() > 0)
	//*  23   51:aload           5
	//*  24   53:ifnull          67
	//*  25   56:aload           5
	//*  26   58:invokevirtual   #379 <Method int Integer.intValue()>
	//*  27   61:ifle            67
				break;
	//   28   64:goto            123
			if(list == null)
	//*  29   67:aload_1         
	//*  30   68:ifnonnull       12
			{
				Integer integer1 = ((ContentValues) (obj)).getAsInteger("is_primary");
	//   31   71:aload_2         
	//   32   72:ldc2            #381 <String "is_primary">
	//   33   75:invokevirtual   #374 <Method Integer ContentValues.getAsInteger(String)>
	//   34   78:astore          5
				if(integer1 != null && integer1.intValue() > 0 && containsNonEmptyName(((ContentValues) (obj))))
	//*  35   80:aload           5
	//*  36   82:ifnull          106
	//*  37   85:aload           5
	//*  38   87:invokevirtual   #379 <Method int Integer.intValue()>
	//*  39   90:ifle            106
	//*  40   93:aload_0         
	//*  41   94:aload_2         
	//*  42   95:invokespecial   #383 <Method boolean containsNonEmptyName(ContentValues)>
	//*  43   98:ifeq            106
					list = ((List) (obj));
	//   44  101:aload_2         
	//   45  102:astore_1        
				else
	//*  46  103:goto            12
				if(obj1 == null && containsNonEmptyName(((ContentValues) (obj))))
	//*  47  106:aload_3         
	//*  48  107:ifnonnull       12
	//*  49  110:aload_0         
	//*  50  111:aload_2         
	//*  51  112:invokespecial   #383 <Method boolean containsNonEmptyName(ContentValues)>
	//*  52  115:ifeq            12
					obj1 = obj;
	//   53  118:aload_2         
	//   54  119:astore_3        
			}
		} while(true);
	//   55  120:goto            12
		if(obj == null)
	//*  56  123:aload_2         
	//*  57  124:ifnonnull       141
		{
			if(obj1 != null)
	//*  58  127:aload_3         
	//*  59  128:ifnull          133
				return ((ContentValues) (obj1));
	//   60  131:aload_3         
	//   61  132:areturn         
			else
				return new ContentValues();
	//   62  133:new             #176 <Class ContentValues>
	//   63  136:dup             
	//   64  137:invokespecial   #384 <Method void ContentValues()>
	//   65  140:areturn         
		} else
		{
			return ((ContentValues) (obj));
	//   66  141:aload_2         
	//   67  142:areturn         
		}
	}

	private transient boolean shouldAppendCharsetParam(String as[])
	{
		if(!mShouldAppendCharsetParam)
	//*   0    0:aload_0         
	//*   1    1:getfield        #122 <Field boolean mShouldAppendCharsetParam>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		int j = as.length;
	//    5    9:aload_1         
	//    6   10:arraylength     
	//    7   11:istore_3        
		for(int i = 0; i < j; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore_2        
	//*  10   14:iload_2         
	//*  11   15:iload_3         
	//*  12   16:icmpge          44
			if(!VCardUtils.containsOnlyPrintableAscii(new String[] {
	as[i]
}))
	//*  13   19:iconst_1        
	//*  14   20:anewarray       String[]
	//*  15   23:dup             
	//*  16   24:iconst_0        
	//*  17   25:aload_1         
	//*  18   26:iload_2         
	//*  19   27:aaload          
	//*  20   28:aastore         
	//*  21   29:invokestatic    #388 <Method boolean VCardUtils.containsOnlyPrintableAscii(String[])>
	//*  22   32:ifne            37
				return true;
	//   23   35:iconst_1        
	//   24   36:ireturn         

	//   25   37:iload_2         
	//   26   38:iconst_1        
	//   27   39:iadd            
	//   28   40:istore_2        
	//*  29   41:goto            14
		return false;
	//   30   44:iconst_0        
	//   31   45:ireturn         
	}

	private List splitPhoneNumbers(String s)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #392 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #393 <Method void ArrayList()>
	//    3    7:astore          6
		StringBuilder stringbuilder = new StringBuilder();
	//    4    9:new             #145 <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #146 <Method void StringBuilder()>
	//    7   16:astore          5
		int j = s.length();
	//    8   18:aload_1         
	//    9   19:invokevirtual   #358 <Method int String.length()>
	//   10   22:istore          4
		for(int i = 0; i < j; i++)
	//*  11   24:iconst_0        
	//*  12   25:istore_3        
	//*  13   26:iload_3         
	//*  14   27:iload           4
	//*  15   29:icmpge          91
		{
			char c = s.charAt(i);
	//   16   32:aload_1         
	//   17   33:iload_3         
	//   18   34:invokevirtual   #362 <Method char String.charAt(int)>
	//   19   37:istore_2        
			if(c == '\n' && stringbuilder.length() > 0)
	//*  20   38:iload_2         
	//*  21   39:bipush          10
	//*  22   41:icmpne          77
	//*  23   44:aload           5
	//*  24   46:invokevirtual   #394 <Method int StringBuilder.length()>
	//*  25   49:ifle            77
			{
				((List) (arraylist)).add(((Object) (stringbuilder.toString())));
	//   26   52:aload           6
	//   27   54:aload           5
	//   28   56:invokevirtual   #156 <Method String StringBuilder.toString()>
	//   29   59:invokeinterface #398 <Method boolean List.add(Object)>
	//   30   64:pop             
				stringbuilder = new StringBuilder();
	//   31   65:new             #145 <Class StringBuilder>
	//   32   68:dup             
	//   33   69:invokespecial   #146 <Method void StringBuilder()>
	//   34   72:astore          5
			} else
	//*  35   74:goto            84
			{
				stringbuilder.append(c);
	//   36   77:aload           5
	//   37   79:iload_2         
	//   38   80:invokevirtual   #216 <Method StringBuilder StringBuilder.append(char)>
	//   39   83:pop             
			}
		}

	//   40   84:iload_3         
	//   41   85:iconst_1        
	//   42   86:iadd            
	//   43   87:istore_3        
	//*  44   88:goto            26
		if(stringbuilder.length() > 0)
	//*  45   91:aload           5
	//*  46   93:invokevirtual   #394 <Method int StringBuilder.length()>
	//*  47   96:ifle            112
			((List) (arraylist)).add(((Object) (stringbuilder.toString())));
	//   48   99:aload           6
	//   49  101:aload           5
	//   50  103:invokevirtual   #156 <Method String StringBuilder.toString()>
	//   51  106:invokeinterface #398 <Method boolean List.add(Object)>
	//   52  111:pop             
		return ((List) (arraylist));
	//   53  112:aload           6
	//   54  114:areturn         
	}

	public void appendEmailLine(int i, String s, String s1, boolean flag)
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		Object obj = ((Object) (obj1));
	//    2    3:aload           6
	//    3    5:astore          5
		switch(i)
	//*   4    7:iload_1         
		{
	//*   5    8:tableswitch     0 4: default 44
	//	               0 107
	//	               1 99
	//	               2 91
	//	               3 183
	//	               4 83
		default:
			s = ((String) (new StringBuilder()));
	//    6   44:new             #145 <Class StringBuilder>
	//    7   47:dup             
	//    8   48:invokespecial   #146 <Method void StringBuilder()>
	//    9   51:astore_2        
			((StringBuilder) (s)).append("Unknown Email type: ");
	//   10   52:aload_2         
	//   11   53:ldc2            #403 <String "Unknown Email type: ">
	//   12   56:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   13   59:pop             
			((StringBuilder) (s)).append(i);
	//   14   60:aload_2         
	//   15   61:iload_1         
	//   16   62:invokevirtual   #406 <Method StringBuilder StringBuilder.append(int)>
	//   17   65:pop             
			Log.e("vCard", ((StringBuilder) (s)).toString());
	//   18   66:ldc1            #69  <String "vCard">
	//   19   68:aload_2         
	//   20   69:invokevirtual   #156 <Method String StringBuilder.toString()>
	//   21   72:invokestatic    #322 <Method int Log.e(String, String)>
	//   22   75:pop             
			obj = ((Object) (obj1));
	//   23   76:aload           6
	//   24   78:astore          5
			break;
	//   25   80:goto            183

		case 3: // '\003'
			break;

		case 4: // '\004'
			obj = "CELL";
	//   26   83:ldc2            #408 <String "CELL">
	//   27   86:astore          5
			break;
	//   28   88:goto            183

		case 2: // '\002'
			obj = "WORK";
	//   29   91:ldc2            #410 <String "WORK">
	//   30   94:astore          5
			break;
	//   31   96:goto            183

		case 1: // '\001'
			obj = "HOME";
	//   32   99:ldc2            #412 <String "HOME">
	//   33  102:astore          5
			break;
	//   34  104:goto            183

		case 0: // '\0'
			if(VCardUtils.isMobilePhoneLabel(s))
	//*  35  107:aload_2         
	//*  36  108:invokestatic    #415 <Method boolean VCardUtils.isMobilePhoneLabel(String)>
	//*  37  111:ifeq            122
			{
				obj = "CELL";
	//   38  114:ldc2            #408 <String "CELL">
	//   39  117:astore          5
				break;
	//   40  119:goto            183
			}
			obj = ((Object) (obj1));
	//   41  122:aload           6
	//   42  124:astore          5
			if(TextUtils.isEmpty(((CharSequence) (s))))
				break;
	//   43  126:aload_2         
	//   44  127:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   45  130:ifne            183
			obj = ((Object) (obj1));
	//   46  133:aload           6
	//   47  135:astore          5
			if(VCardUtils.containsOnlyAlphaDigitHyphen(new String[] {
	s
}))
	//*  48  137:iconst_1        
	//*  49  138:anewarray       String[]
	//*  50  141:dup             
	//*  51  142:iconst_0        
	//*  52  143:aload_2         
	//*  53  144:aastore         
	//*  54  145:invokestatic    #418 <Method boolean VCardUtils.containsOnlyAlphaDigitHyphen(String[])>
	//*  55  148:ifeq            183
			{
				obj = ((Object) (new StringBuilder()));
	//   56  151:new             #145 <Class StringBuilder>
	//   57  154:dup             
	//   58  155:invokespecial   #146 <Method void StringBuilder()>
	//   59  158:astore          5
				((StringBuilder) (obj)).append("X-");
	//   60  160:aload           5
	//   61  162:ldc2            #420 <String "X-">
	//   62  165:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   63  168:pop             
				((StringBuilder) (obj)).append(s);
	//   64  169:aload           5
	//   65  171:aload_2         
	//   66  172:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   67  175:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   68  176:aload           5
	//   69  178:invokevirtual   #156 <Method String StringBuilder.toString()>
	//   70  181:astore          5
			}
			break;
		}
		s = ((String) (new ArrayList()));
	//   71  183:new             #392 <Class ArrayList>
	//   72  186:dup             
	//   73  187:invokespecial   #393 <Method void ArrayList()>
	//   74  190:astore_2        
		if(flag)
	//*  75  191:iload           4
	//*  76  193:ifeq            206
			((List) (s)).add("PREF");
	//   77  196:aload_2         
	//   78  197:ldc2            #422 <String "PREF">
	//   79  200:invokeinterface #398 <Method boolean List.add(Object)>
	//   80  205:pop             
		if(!TextUtils.isEmpty(((CharSequence) (obj))))
	//*  81  206:aload           5
	//*  82  208:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  83  211:ifne            223
			((List) (s)).add(obj);
	//   84  214:aload_2         
	//   85  215:aload           5
	//   86  217:invokeinterface #398 <Method boolean List.add(Object)>
	//   87  222:pop             
		appendLineWithCharsetAndQPDetection("EMAIL", ((List) (s)), s1);
	//   88  223:aload_0         
	//   89  224:ldc2            #424 <String "EMAIL">
	//   90  227:aload_2         
	//   91  228:aload_3         
	//   92  229:invokevirtual   #428 <Method void appendLineWithCharsetAndQPDetection(String, List, String)>
	//   93  232:return          
	}

	public VCardBuilder appendEmails(List list)
	{
		boolean flag;
		if(list != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          181
		{
			HashSet hashset = new HashSet();
	//    2    4:new             #29  <Class HashSet>
	//    3    7:dup             
	//    4    8:invokespecial   #430 <Method void HashSet()>
	//    5   11:astore          6
			Iterator iterator = list.iterator();
	//    6   13:aload_1         
	//    7   14:invokeinterface #288 <Method Iterator List.iterator()>
	//    8   19:astore          7
			int i = 0;
	//    9   21:iconst_0        
	//   10   22:istore_2        
			do
			{
				flag = ((boolean) (i));
	//   11   23:iload_2         
	//   12   24:istore_3        
				if(!iterator.hasNext())
					break;
	//   13   25:aload           7
	//   14   27:invokeinterface #293 <Method boolean Iterator.hasNext()>
	//   15   32:ifeq            183
				Object obj1 = ((Object) ((ContentValues)iterator.next()));
	//   16   35:aload           7
	//   17   37:invokeinterface #297 <Method Object Iterator.next()>
	//   18   42:checkcast       #176 <Class ContentValues>
	//   19   45:astore          8
				String s = ((ContentValues) (obj1)).getAsString("data1");
	//   20   47:aload           8
	//   21   49:ldc1            #190 <String "data1">
	//   22   51:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   23   54:astore          5
				list = ((List) (s));
	//   24   56:aload           5
	//   25   58:astore_1        
				if(s != null)
	//*  26   59:aload           5
	//*  27   61:ifnull          70
					list = ((List) (s.trim()));
	//   28   64:aload           5
	//   29   66:invokevirtual   #433 <Method String String.trim()>
	//   30   69:astore_1        
				if(!TextUtils.isEmpty(((CharSequence) (list))))
	//*  31   70:aload_1         
	//*  32   71:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  33   74:ifeq            80
	//*  34   77:goto            23
				{
					Object obj = ((Object) (((ContentValues) (obj1)).getAsInteger("data2")));
	//   35   80:aload           8
	//   36   82:ldc1            #184 <String "data2">
	//   37   84:invokevirtual   #374 <Method Integer ContentValues.getAsInteger(String)>
	//   38   87:astore          5
					if(obj != null)
	//*  39   89:aload           5
	//*  40   91:ifnull          103
						i = ((Integer) (obj)).intValue();
	//   41   94:aload           5
	//   42   96:invokevirtual   #379 <Method int Integer.intValue()>
	//   43   99:istore_2        
					else
	//*  44  100:goto            105
						i = 3;
	//   45  103:iconst_3        
	//   46  104:istore_2        
					obj = ((Object) (((ContentValues) (obj1)).getAsString("data3")));
	//   47  105:aload           8
	//   48  107:ldc1            #174 <String "data3">
	//   49  109:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   50  112:astore          5
					obj1 = ((Object) (((ContentValues) (obj1)).getAsInteger("is_primary")));
	//   51  114:aload           8
	//   52  116:ldc2            #381 <String "is_primary">
	//   53  119:invokevirtual   #374 <Method Integer ContentValues.getAsInteger(String)>
	//   54  122:astore          8
					boolean flag1;
					if(obj1 != null && ((Integer) (obj1)).intValue() > 0)
	//*  55  124:aload           8
	//*  56  126:ifnull          143
	//*  57  129:aload           8
	//*  58  131:invokevirtual   #379 <Method int Integer.intValue()>
	//*  59  134:ifle            143
						flag1 = true;
	//   60  137:iconst_1        
	//   61  138:istore          4
					else
	//*  62  140:goto            146
						flag1 = false;
	//   63  143:iconst_0        
	//   64  144:istore          4
					if(!((Set) (hashset)).contains(((Object) (list))))
	//*  65  146:aload           6
	//*  66  148:aload_1         
	//*  67  149:invokeinterface #438 <Method boolean Set.contains(Object)>
	//*  68  154:ifne            176
					{
						((Set) (hashset)).add(((Object) (list)));
	//   69  157:aload           6
	//   70  159:aload_1         
	//   71  160:invokeinterface #439 <Method boolean Set.add(Object)>
	//   72  165:pop             
						appendEmailLine(i, ((String) (obj)), ((String) (list)), flag1);
	//   73  166:aload_0         
	//   74  167:iload_2         
	//   75  168:aload           5
	//   76  170:aload_1         
	//   77  171:iload           4
	//   78  173:invokevirtual   #441 <Method void appendEmailLine(int, String, String, boolean)>
					}
					i = 1;
	//   79  176:iconst_1        
	//   80  177:istore_2        
				}
			} while(true);
	//   81  178:goto            23
		} else
		{
			flag = false;
	//   82  181:iconst_0        
	//   83  182:istore_3        
		}
		if(!flag && mIsDoCoMo)
	//*  84  183:iload_3         
	//*  85  184:ifne            204
	//*  86  187:aload_0         
	//*  87  188:getfield        #92  <Field boolean mIsDoCoMo>
	//*  88  191:ifeq            204
			appendEmailLine(1, "", "", false);
	//   89  194:aload_0         
	//   90  195:iconst_1        
	//   91  196:ldc1            #194 <String "">
	//   92  198:ldc1            #194 <String "">
	//   93  200:iconst_0        
	//   94  201:invokevirtual   #441 <Method void appendEmailLine(int, String, String, boolean)>
		return this;
	//   95  204:aload_0         
	//   96  205:areturn         
	}

	public void appendLine(String s, String s1)
	{
		appendLine(s, s1, false, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #444 <Method void appendLine(String, String, boolean, boolean)>
	//    6    8:return          
	}

	public void appendLine(String s, String s1, boolean flag, boolean flag1)
	{
		appendLine(s, ((List) (null)), s1, flag, flag1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:iload_3         
	//    5    5:iload           4
	//    6    7:invokevirtual   #447 <Method void appendLine(String, List, String, boolean, boolean)>
	//    7   10:return          
	}

	public void appendLine(String s, List list, String s1, boolean flag, boolean flag1)
	{
		mBuilder.append(s);
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field StringBuilder mBuilder>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//    4    8:pop             
		if(list != null && list.size() > 0)
	//*   5    9:aload_2         
	//*   6   10:ifnull          37
	//*   7   13:aload_2         
	//*   8   14:invokeinterface #450 <Method int List.size()>
	//*   9   19:ifle            37
		{
			mBuilder.append(";");
	//   10   22:aload_0         
	//   11   23:getfield        #209 <Field StringBuilder mBuilder>
	//   12   26:ldc1            #213 <String ";">
	//   13   28:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   14   31:pop             
			appendTypeParameters(list);
	//   15   32:aload_0         
	//   16   33:aload_2         
	//   17   34:invokespecial   #452 <Method void appendTypeParameters(List)>
		}
		if(flag)
	//*  18   37:iload           4
	//*  19   39:ifeq            64
		{
			mBuilder.append(";");
	//   20   42:aload_0         
	//   21   43:getfield        #209 <Field StringBuilder mBuilder>
	//   22   46:ldc1            #213 <String ";">
	//   23   48:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
			mBuilder.append(mVCardCharsetParameter);
	//   25   52:aload_0         
	//   26   53:getfield        #209 <Field StringBuilder mBuilder>
	//   27   56:aload_0         
	//   28   57:getfield        #136 <Field String mVCardCharsetParameter>
	//   29   60:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   30   63:pop             
		}
		if(flag1)
	//*  31   64:iload           5
	//*  32   66:ifeq            99
		{
			mBuilder.append(";");
	//   33   69:aload_0         
	//   34   70:getfield        #209 <Field StringBuilder mBuilder>
	//   35   73:ldc1            #213 <String ";">
	//   36   75:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   37   78:pop             
			mBuilder.append("ENCODING=QUOTED-PRINTABLE");
	//   38   79:aload_0         
	//   39   80:getfield        #209 <Field StringBuilder mBuilder>
	//   40   83:ldc2            #269 <String "ENCODING=QUOTED-PRINTABLE">
	//   41   86:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   42   89:pop             
			s = encodeQuotedPrintable(s1);
	//   43   90:aload_0         
	//   44   91:aload_3         
	//   45   92:invokespecial   #265 <Method String encodeQuotedPrintable(String)>
	//   46   95:astore_1        
		} else
	//*  47   96:goto            105
		{
			s = escapeCharacters(s1);
	//   48   99:aload_0         
	//   49  100:aload_3         
	//   50  101:invokespecial   #207 <Method String escapeCharacters(String)>
	//   51  104:astore_1        
		}
		mBuilder.append(":");
	//   52  105:aload_0         
	//   53  106:getfield        #209 <Field StringBuilder mBuilder>
	//   54  109:ldc1            #225 <String ":">
	//   55  111:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   56  114:pop             
		mBuilder.append(s);
	//   57  115:aload_0         
	//   58  116:getfield        #209 <Field StringBuilder mBuilder>
	//   59  119:aload_1         
	//   60  120:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   61  123:pop             
		mBuilder.append("\r\n");
	//   62  124:aload_0         
	//   63  125:getfield        #209 <Field StringBuilder mBuilder>
	//   64  128:ldc1            #227 <String "\r\n">
	//   65  130:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   66  133:pop             
	//   67  134:return          
	}

	public void appendLineWithCharsetAndQPDetection(String s, List list, String s1)
	{
		boolean flag1 = VCardUtils.containsOnlyPrintableAscii(new String[] {
			s1
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_3         
	//    5    7:aastore         
	//    6    8:invokestatic    #388 <Method boolean VCardUtils.containsOnlyPrintableAscii(String[])>
	//    7   11:istore          5
		boolean flag;
		if(mShouldUseQuotedPrintable && !VCardUtils.containsOnlyNonCrLfPrintableAscii(new String[] {
	s1
}))
	//*   8   13:aload_0         
	//*   9   14:getfield        #87  <Field boolean mShouldUseQuotedPrintable>
	//*  10   17:ifeq            40
	//*  11   20:iconst_1        
	//*  12   21:anewarray       String[]
	//*  13   24:dup             
	//*  14   25:iconst_0        
	//*  15   26:aload_3         
	//*  16   27:aastore         
	//*  17   28:invokestatic    #262 <Method boolean VCardUtils.containsOnlyNonCrLfPrintableAscii(String[])>
	//*  18   31:ifne            40
			flag = true;
	//   19   34:iconst_1        
	//   20   35:istore          4
		else
	//*  21   37:goto            43
			flag = false;
	//   22   40:iconst_0        
	//   23   41:istore          4
		appendLine(s, list, s1, flag1 ^ true, flag);
	//   24   43:aload_0         
	//   25   44:aload_1         
	//   26   45:aload_2         
	//   27   46:aload_3         
	//   28   47:iload           5
	//   29   49:iconst_1        
	//   30   50:ixor            
	//   31   51:iload           4
	//   32   53:invokevirtual   #447 <Method void appendLine(String, List, String, boolean, boolean)>
	//   33   56:return          
	}

	public VCardBuilder appendNameProperties(List list)
	{
		if(VCardConfig.isVersion40(mVCardType))
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int mVCardType>
	//*   2    4:invokestatic    #67  <Method boolean VCardConfig.isVersion40(int)>
	//*   3    7:ifeq            16
			return appendNamePropertiesV40(list);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokespecial   #457 <Method VCardBuilder appendNamePropertiesV40(List)>
	//    7   15:areturn         
		if(list != null && !list.isEmpty())
	//*   8   16:aload_1         
	//*   9   17:ifnull          940
	//*  10   20:aload_1         
	//*  11   21:invokeinterface #168 <Method boolean List.isEmpty()>
	//*  12   26:ifeq            32
	//*  13   29:goto            940
		{
			ContentValues contentvalues = getPrimaryContentValueWithStructuredName(list);
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:invokespecial   #172 <Method ContentValues getPrimaryContentValueWithStructuredName(List)>
	//   17   37:astore          12
			String s = contentvalues.getAsString("data3");
	//   18   39:aload           12
	//   19   41:ldc1            #174 <String "data3">
	//   20   43:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   21   46:astore          6
			String s2 = contentvalues.getAsString("data5");
	//   22   48:aload           12
	//   23   50:ldc1            #182 <String "data5">
	//   24   52:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   25   55:astore          8
			String s1 = contentvalues.getAsString("data2");
	//   26   57:aload           12
	//   27   59:ldc1            #184 <String "data2">
	//   28   61:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   29   64:astore          7
			String s3 = contentvalues.getAsString("data4");
	//   30   66:aload           12
	//   31   68:ldc1            #186 <String "data4">
	//   32   70:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   33   73:astore          9
			String s4 = contentvalues.getAsString("data6");
	//   34   75:aload           12
	//   35   77:ldc1            #188 <String "data6">
	//   36   79:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   37   82:astore          10
			list = ((List) (contentvalues.getAsString("data1")));
	//   38   84:aload           12
	//   39   86:ldc1            #190 <String "data1">
	//   40   88:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   41   91:astore_1        
			if(TextUtils.isEmpty(((CharSequence) (s))) && TextUtils.isEmpty(((CharSequence) (s1))))
	//*  42   92:aload           6
	//*  43   94:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  44   97:ifeq            242
	//*  45  100:aload           7
	//*  46  102:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  47  105:ifne            111
	//*  48  108:goto            242
			{
				if(!TextUtils.isEmpty(((CharSequence) (list))))
	//*  49  111:aload_1         
	//*  50  112:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  51  115:ifne            195
				{
					buildSinglePartNameField("N", ((String) (list)));
	//   52  118:aload_0         
	//   53  119:ldc1            #211 <String "N">
	//   54  121:aload_1         
	//   55  122:invokespecial   #459 <Method void buildSinglePartNameField(String, String)>
					mBuilder.append(";");
	//   56  125:aload_0         
	//   57  126:getfield        #209 <Field StringBuilder mBuilder>
	//   58  129:ldc1            #213 <String ";">
	//   59  131:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   60  134:pop             
					mBuilder.append(";");
	//   61  135:aload_0         
	//   62  136:getfield        #209 <Field StringBuilder mBuilder>
	//   63  139:ldc1            #213 <String ";">
	//   64  141:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   65  144:pop             
					mBuilder.append(";");
	//   66  145:aload_0         
	//   67  146:getfield        #209 <Field StringBuilder mBuilder>
	//   68  149:ldc1            #213 <String ";">
	//   69  151:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   70  154:pop             
					mBuilder.append(";");
	//   71  155:aload_0         
	//   72  156:getfield        #209 <Field StringBuilder mBuilder>
	//   73  159:ldc1            #213 <String ";">
	//   74  161:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   75  164:pop             
					mBuilder.append("\r\n");
	//   76  165:aload_0         
	//   77  166:getfield        #209 <Field StringBuilder mBuilder>
	//   78  169:ldc1            #227 <String "\r\n">
	//   79  171:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   80  174:pop             
					buildSinglePartNameField("FN", ((String) (list)));
	//   81  175:aload_0         
	//   82  176:ldc1            #192 <String "FN">
	//   83  178:aload_1         
	//   84  179:invokespecial   #459 <Method void buildSinglePartNameField(String, String)>
					mBuilder.append("\r\n");
	//   85  182:aload_0         
	//   86  183:getfield        #209 <Field StringBuilder mBuilder>
	//   87  186:ldc1            #227 <String "\r\n">
	//   88  188:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   89  191:pop             
				} else
	//*  90  192:goto            932
				if(VCardConfig.isVersion30(mVCardType))
	//*  91  195:aload_0         
	//*  92  196:getfield        #61  <Field int mVCardType>
	//*  93  199:invokestatic    #80  <Method boolean VCardConfig.isVersion30(int)>
	//*  94  202:ifeq            224
				{
					appendLine("N", "");
	//   95  205:aload_0         
	//   96  206:ldc1            #211 <String "N">
	//   97  208:ldc1            #194 <String "">
	//   98  210:invokevirtual   #198 <Method void appendLine(String, String)>
					appendLine("FN", "");
	//   99  213:aload_0         
	//  100  214:ldc1            #192 <String "FN">
	//  101  216:ldc1            #194 <String "">
	//  102  218:invokevirtual   #198 <Method void appendLine(String, String)>
				} else
	//* 103  221:goto            932
				if(mIsDoCoMo)
	//* 104  224:aload_0         
	//* 105  225:getfield        #92  <Field boolean mIsDoCoMo>
	//* 106  228:ifeq            932
					appendLine("N", "");
	//  107  231:aload_0         
	//  108  232:ldc1            #211 <String "N">
	//  109  234:ldc1            #194 <String "">
	//  110  236:invokevirtual   #198 <Method void appendLine(String, String)>
			} else
	//* 111  239:goto            932
			{
				boolean flag1 = true;
	//  112  242:iconst_1        
	//  113  243:istore_3        
				boolean flag2 = shouldAppendCharsetParam(new String[] {
					s, s1, s2, s3, s4
				});
	//  114  244:aload_0         
	//  115  245:iconst_5        
	//  116  246:anewarray       String[]
	//  117  249:dup             
	//  118  250:iconst_0        
	//  119  251:aload           6
	//  120  253:aastore         
	//  121  254:dup             
	//  122  255:iconst_1        
	//  123  256:aload           7
	//  124  258:aastore         
	//  125  259:dup             
	//  126  260:iconst_2        
	//  127  261:aload           8
	//  128  263:aastore         
	//  129  264:dup             
	//  130  265:iconst_3        
	//  131  266:aload           9
	//  132  268:aastore         
	//  133  269:dup             
	//  134  270:iconst_4        
	//  135  271:aload           10
	//  136  273:aastore         
	//  137  274:invokespecial   #259 <Method boolean shouldAppendCharsetParam(String[])>
	//  138  277:istore          4
				boolean flag;
				if(!mRefrainsQPToNameProperties && (!VCardUtils.containsOnlyNonCrLfPrintableAscii(new String[] {
	s
}) || !VCardUtils.containsOnlyNonCrLfPrintableAscii(new String[] {
	s1
}) || !VCardUtils.containsOnlyNonCrLfPrintableAscii(new String[] {
	s2
}) || !VCardUtils.containsOnlyNonCrLfPrintableAscii(new String[] {
	s3
}) || !VCardUtils.containsOnlyNonCrLfPrintableAscii(new String[] {
	s4
})))
	//* 139  279:aload_0         
	//* 140  280:getfield        #107 <Field boolean mRefrainsQPToNameProperties>
	//* 141  283:ifne            366
	//* 142  286:iconst_1        
	//* 143  287:anewarray       String[]
	//* 144  290:dup             
	//* 145  291:iconst_0        
	//* 146  292:aload           6
	//* 147  294:aastore         
	//* 148  295:invokestatic    #262 <Method boolean VCardUtils.containsOnlyNonCrLfPrintableAscii(String[])>
	//* 149  298:ifeq            361
	//* 150  301:iconst_1        
	//* 151  302:anewarray       String[]
	//* 152  305:dup             
	//* 153  306:iconst_0        
	//* 154  307:aload           7
	//* 155  309:aastore         
	//* 156  310:invokestatic    #262 <Method boolean VCardUtils.containsOnlyNonCrLfPrintableAscii(String[])>
	//* 157  313:ifeq            361
	//* 158  316:iconst_1        
	//* 159  317:anewarray       String[]
	//* 160  320:dup             
	//* 161  321:iconst_0        
	//* 162  322:aload           8
	//* 163  324:aastore         
	//* 164  325:invokestatic    #262 <Method boolean VCardUtils.containsOnlyNonCrLfPrintableAscii(String[])>
	//* 165  328:ifeq            361
	//* 166  331:iconst_1        
	//* 167  332:anewarray       String[]
	//* 168  335:dup             
	//* 169  336:iconst_0        
	//* 170  337:aload           9
	//* 171  339:aastore         
	//* 172  340:invokestatic    #262 <Method boolean VCardUtils.containsOnlyNonCrLfPrintableAscii(String[])>
	//* 173  343:ifeq            361
	//* 174  346:iconst_1        
	//* 175  347:anewarray       String[]
	//* 176  350:dup             
	//* 177  351:iconst_0        
	//* 178  352:aload           10
	//* 179  354:aastore         
	//* 180  355:invokestatic    #262 <Method boolean VCardUtils.containsOnlyNonCrLfPrintableAscii(String[])>
	//* 181  358:ifne            366
					flag = true;
	//  182  361:iconst_1        
	//  183  362:istore_2        
				else
	//* 184  363:goto            368
					flag = false;
	//  185  366:iconst_0        
	//  186  367:istore_2        
				if(TextUtils.isEmpty(((CharSequence) (list))))
	//* 187  368:aload_1         
	//* 188  369:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 189  372:ifne            378
	//* 190  375:goto            399
					list = ((List) (VCardUtils.constructNameFromElements(VCardConfig.getNameOrderType(mVCardType), s, s2, s1, s3, s4)));
	//  191  378:aload_0         
	//  192  379:getfield        #61  <Field int mVCardType>
	//  193  382:invokestatic    #233 <Method int VCardConfig.getNameOrderType(int)>
	//  194  385:aload           6
	//  195  387:aload           8
	//  196  389:aload           7
	//  197  391:aload           9
	//  198  393:aload           10
	//  199  395:invokestatic    #237 <Method String VCardUtils.constructNameFromElements(int, String, String, String, String, String)>
	//  200  398:astore_1        
				boolean flag3 = shouldAppendCharsetParam(new String[] {
					list
				});
	//  201  399:aload_0         
	//  202  400:iconst_1        
	//  203  401:anewarray       String[]
	//  204  404:dup             
	//  205  405:iconst_0        
	//  206  406:aload_1         
	//  207  407:aastore         
	//  208  408:invokespecial   #259 <Method boolean shouldAppendCharsetParam(String[])>
	//  209  411:istore          5
				if(mRefrainsQPToNameProperties || VCardUtils.containsOnlyNonCrLfPrintableAscii(new String[] {
	list
}))
	//* 210  413:aload_0         
	//* 211  414:getfield        #107 <Field boolean mRefrainsQPToNameProperties>
	//* 212  417:ifne            437
	//* 213  420:iconst_1        
	//* 214  421:anewarray       String[]
	//* 215  424:dup             
	//* 216  425:iconst_0        
	//* 217  426:aload_1         
	//* 218  427:aastore         
	//* 219  428:invokestatic    #262 <Method boolean VCardUtils.containsOnlyNonCrLfPrintableAscii(String[])>
	//* 220  431:ifne            437
	//* 221  434:goto            439
					flag1 = false;
	//  222  437:iconst_0        
	//  223  438:istore_3        
				if(flag)
	//* 224  439:iload_2         
	//* 225  440:ifeq            486
				{
					s = encodeQuotedPrintable(s);
	//  226  443:aload_0         
	//  227  444:aload           6
	//  228  446:invokespecial   #265 <Method String encodeQuotedPrintable(String)>
	//  229  449:astore          6
					s1 = encodeQuotedPrintable(s1);
	//  230  451:aload_0         
	//  231  452:aload           7
	//  232  454:invokespecial   #265 <Method String encodeQuotedPrintable(String)>
	//  233  457:astore          7
					s2 = encodeQuotedPrintable(s2);
	//  234  459:aload_0         
	//  235  460:aload           8
	//  236  462:invokespecial   #265 <Method String encodeQuotedPrintable(String)>
	//  237  465:astore          8
					s3 = encodeQuotedPrintable(s3);
	//  238  467:aload_0         
	//  239  468:aload           9
	//  240  470:invokespecial   #265 <Method String encodeQuotedPrintable(String)>
	//  241  473:astore          9
					s4 = encodeQuotedPrintable(s4);
	//  242  475:aload_0         
	//  243  476:aload           10
	//  244  478:invokespecial   #265 <Method String encodeQuotedPrintable(String)>
	//  245  481:astore          10
				} else
	//* 246  483:goto            526
				{
					s = escapeCharacters(s);
	//  247  486:aload_0         
	//  248  487:aload           6
	//  249  489:invokespecial   #207 <Method String escapeCharacters(String)>
	//  250  492:astore          6
					s1 = escapeCharacters(s1);
	//  251  494:aload_0         
	//  252  495:aload           7
	//  253  497:invokespecial   #207 <Method String escapeCharacters(String)>
	//  254  500:astore          7
					s2 = escapeCharacters(s2);
	//  255  502:aload_0         
	//  256  503:aload           8
	//  257  505:invokespecial   #207 <Method String escapeCharacters(String)>
	//  258  508:astore          8
					s3 = escapeCharacters(s3);
	//  259  510:aload_0         
	//  260  511:aload           9
	//  261  513:invokespecial   #207 <Method String escapeCharacters(String)>
	//  262  516:astore          9
					s4 = escapeCharacters(s4);
	//  263  518:aload_0         
	//  264  519:aload           10
	//  265  521:invokespecial   #207 <Method String escapeCharacters(String)>
	//  266  524:astore          10
				}
				String s5;
				if(flag1)
	//* 267  526:iload_3         
	//* 268  527:ifeq            540
					s5 = encodeQuotedPrintable(((String) (list)));
	//  269  530:aload_0         
	//  270  531:aload_1         
	//  271  532:invokespecial   #265 <Method String encodeQuotedPrintable(String)>
	//  272  535:astore          11
				else
	//* 273  537:goto            547
					s5 = escapeCharacters(((String) (list)));
	//  274  540:aload_0         
	//  275  541:aload_1         
	//  276  542:invokespecial   #207 <Method String escapeCharacters(String)>
	//  277  545:astore          11
				mBuilder.append("N");
	//  278  547:aload_0         
	//  279  548:getfield        #209 <Field StringBuilder mBuilder>
	//  280  551:ldc1            #211 <String "N">
	//  281  553:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  282  556:pop             
				if(mIsDoCoMo)
	//* 283  557:aload_0         
	//* 284  558:getfield        #92  <Field boolean mIsDoCoMo>
	//* 285  561:ifeq            678
				{
					if(flag2)
	//* 286  564:iload           4
	//* 287  566:ifeq            591
					{
						mBuilder.append(";");
	//  288  569:aload_0         
	//  289  570:getfield        #209 <Field StringBuilder mBuilder>
	//  290  573:ldc1            #213 <String ";">
	//  291  575:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  292  578:pop             
						mBuilder.append(mVCardCharsetParameter);
	//  293  579:aload_0         
	//  294  580:getfield        #209 <Field StringBuilder mBuilder>
	//  295  583:aload_0         
	//  296  584:getfield        #136 <Field String mVCardCharsetParameter>
	//  297  587:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  298  590:pop             
					}
					if(flag)
	//* 299  591:iload_2         
	//* 300  592:ifeq            616
					{
						mBuilder.append(";");
	//  301  595:aload_0         
	//  302  596:getfield        #209 <Field StringBuilder mBuilder>
	//  303  599:ldc1            #213 <String ";">
	//  304  601:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  305  604:pop             
						mBuilder.append("ENCODING=QUOTED-PRINTABLE");
	//  306  605:aload_0         
	//  307  606:getfield        #209 <Field StringBuilder mBuilder>
	//  308  609:ldc2            #269 <String "ENCODING=QUOTED-PRINTABLE">
	//  309  612:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  310  615:pop             
					}
					mBuilder.append(":");
	//  311  616:aload_0         
	//  312  617:getfield        #209 <Field StringBuilder mBuilder>
	//  313  620:ldc1            #225 <String ":">
	//  314  622:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  315  625:pop             
					mBuilder.append(((String) (list)));
	//  316  626:aload_0         
	//  317  627:getfield        #209 <Field StringBuilder mBuilder>
	//  318  630:aload_1         
	//  319  631:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  320  634:pop             
					mBuilder.append(";");
	//  321  635:aload_0         
	//  322  636:getfield        #209 <Field StringBuilder mBuilder>
	//  323  639:ldc1            #213 <String ";">
	//  324  641:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  325  644:pop             
					mBuilder.append(";");
	//  326  645:aload_0         
	//  327  646:getfield        #209 <Field StringBuilder mBuilder>
	//  328  649:ldc1            #213 <String ";">
	//  329  651:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  330  654:pop             
					mBuilder.append(";");
	//  331  655:aload_0         
	//  332  656:getfield        #209 <Field StringBuilder mBuilder>
	//  333  659:ldc1            #213 <String ";">
	//  334  661:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  335  664:pop             
					mBuilder.append(";");
	//  336  665:aload_0         
	//  337  666:getfield        #209 <Field StringBuilder mBuilder>
	//  338  669:ldc1            #213 <String ";">
	//  339  671:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  340  674:pop             
				} else
	//* 341  675:goto            830
				{
					if(flag2)
	//* 342  678:iload           4
	//* 343  680:ifeq            705
					{
						mBuilder.append(";");
	//  344  683:aload_0         
	//  345  684:getfield        #209 <Field StringBuilder mBuilder>
	//  346  687:ldc1            #213 <String ";">
	//  347  689:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  348  692:pop             
						mBuilder.append(mVCardCharsetParameter);
	//  349  693:aload_0         
	//  350  694:getfield        #209 <Field StringBuilder mBuilder>
	//  351  697:aload_0         
	//  352  698:getfield        #136 <Field String mVCardCharsetParameter>
	//  353  701:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  354  704:pop             
					}
					if(flag)
	//* 355  705:iload_2         
	//* 356  706:ifeq            730
					{
						mBuilder.append(";");
	//  357  709:aload_0         
	//  358  710:getfield        #209 <Field StringBuilder mBuilder>
	//  359  713:ldc1            #213 <String ";">
	//  360  715:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  361  718:pop             
						mBuilder.append("ENCODING=QUOTED-PRINTABLE");
	//  362  719:aload_0         
	//  363  720:getfield        #209 <Field StringBuilder mBuilder>
	//  364  723:ldc2            #269 <String "ENCODING=QUOTED-PRINTABLE">
	//  365  726:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  366  729:pop             
					}
					mBuilder.append(":");
	//  367  730:aload_0         
	//  368  731:getfield        #209 <Field StringBuilder mBuilder>
	//  369  734:ldc1            #225 <String ":">
	//  370  736:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  371  739:pop             
					mBuilder.append(s);
	//  372  740:aload_0         
	//  373  741:getfield        #209 <Field StringBuilder mBuilder>
	//  374  744:aload           6
	//  375  746:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  376  749:pop             
					mBuilder.append(";");
	//  377  750:aload_0         
	//  378  751:getfield        #209 <Field StringBuilder mBuilder>
	//  379  754:ldc1            #213 <String ";">
	//  380  756:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  381  759:pop             
					mBuilder.append(s1);
	//  382  760:aload_0         
	//  383  761:getfield        #209 <Field StringBuilder mBuilder>
	//  384  764:aload           7
	//  385  766:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  386  769:pop             
					mBuilder.append(";");
	//  387  770:aload_0         
	//  388  771:getfield        #209 <Field StringBuilder mBuilder>
	//  389  774:ldc1            #213 <String ";">
	//  390  776:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  391  779:pop             
					mBuilder.append(s2);
	//  392  780:aload_0         
	//  393  781:getfield        #209 <Field StringBuilder mBuilder>
	//  394  784:aload           8
	//  395  786:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  396  789:pop             
					mBuilder.append(";");
	//  397  790:aload_0         
	//  398  791:getfield        #209 <Field StringBuilder mBuilder>
	//  399  794:ldc1            #213 <String ";">
	//  400  796:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  401  799:pop             
					mBuilder.append(s3);
	//  402  800:aload_0         
	//  403  801:getfield        #209 <Field StringBuilder mBuilder>
	//  404  804:aload           9
	//  405  806:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  406  809:pop             
					mBuilder.append(";");
	//  407  810:aload_0         
	//  408  811:getfield        #209 <Field StringBuilder mBuilder>
	//  409  814:ldc1            #213 <String ";">
	//  410  816:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  411  819:pop             
					mBuilder.append(s4);
	//  412  820:aload_0         
	//  413  821:getfield        #209 <Field StringBuilder mBuilder>
	//  414  824:aload           10
	//  415  826:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  416  829:pop             
				}
				mBuilder.append("\r\n");
	//  417  830:aload_0         
	//  418  831:getfield        #209 <Field StringBuilder mBuilder>
	//  419  834:ldc1            #227 <String "\r\n">
	//  420  836:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  421  839:pop             
				mBuilder.append("FN");
	//  422  840:aload_0         
	//  423  841:getfield        #209 <Field StringBuilder mBuilder>
	//  424  844:ldc1            #192 <String "FN">
	//  425  846:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  426  849:pop             
				if(flag3)
	//* 427  850:iload           5
	//* 428  852:ifeq            877
				{
					mBuilder.append(";");
	//  429  855:aload_0         
	//  430  856:getfield        #209 <Field StringBuilder mBuilder>
	//  431  859:ldc1            #213 <String ";">
	//  432  861:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  433  864:pop             
					mBuilder.append(mVCardCharsetParameter);
	//  434  865:aload_0         
	//  435  866:getfield        #209 <Field StringBuilder mBuilder>
	//  436  869:aload_0         
	//  437  870:getfield        #136 <Field String mVCardCharsetParameter>
	//  438  873:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  439  876:pop             
				}
				if(flag1)
	//* 440  877:iload_3         
	//* 441  878:ifeq            902
				{
					mBuilder.append(";");
	//  442  881:aload_0         
	//  443  882:getfield        #209 <Field StringBuilder mBuilder>
	//  444  885:ldc1            #213 <String ";">
	//  445  887:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  446  890:pop             
					mBuilder.append("ENCODING=QUOTED-PRINTABLE");
	//  447  891:aload_0         
	//  448  892:getfield        #209 <Field StringBuilder mBuilder>
	//  449  895:ldc2            #269 <String "ENCODING=QUOTED-PRINTABLE">
	//  450  898:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  451  901:pop             
				}
				mBuilder.append(":");
	//  452  902:aload_0         
	//  453  903:getfield        #209 <Field StringBuilder mBuilder>
	//  454  906:ldc1            #225 <String ":">
	//  455  908:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  456  911:pop             
				mBuilder.append(s5);
	//  457  912:aload_0         
	//  458  913:getfield        #209 <Field StringBuilder mBuilder>
	//  459  916:aload           11
	//  460  918:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  461  921:pop             
				mBuilder.append("\r\n");
	//  462  922:aload_0         
	//  463  923:getfield        #209 <Field StringBuilder mBuilder>
	//  464  926:ldc1            #227 <String "\r\n">
	//  465  928:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  466  931:pop             
			}
			appendPhoneticNameFields(contentvalues);
	//  467  932:aload_0         
	//  468  933:aload           12
	//  469  935:invokespecial   #241 <Method void appendPhoneticNameFields(ContentValues)>
			return this;
	//  470  938:aload_0         
	//  471  939:areturn         
		}
		if(VCardConfig.isVersion30(mVCardType))
	//* 472  940:aload_0         
	//* 473  941:getfield        #61  <Field int mVCardType>
	//* 474  944:invokestatic    #80  <Method boolean VCardConfig.isVersion30(int)>
	//* 475  947:ifeq            968
		{
			appendLine("N", "");
	//  476  950:aload_0         
	//  477  951:ldc1            #211 <String "N">
	//  478  953:ldc1            #194 <String "">
	//  479  955:invokevirtual   #198 <Method void appendLine(String, String)>
			appendLine("FN", "");
	//  480  958:aload_0         
	//  481  959:ldc1            #192 <String "FN">
	//  482  961:ldc1            #194 <String "">
	//  483  963:invokevirtual   #198 <Method void appendLine(String, String)>
			return this;
	//  484  966:aload_0         
	//  485  967:areturn         
		}
		if(mIsDoCoMo)
	//* 486  968:aload_0         
	//* 487  969:getfield        #92  <Field boolean mIsDoCoMo>
	//* 488  972:ifeq            983
			appendLine("N", "");
	//  489  975:aload_0         
	//  490  976:ldc1            #211 <String "N">
	//  491  978:ldc1            #194 <String "">
	//  492  980:invokevirtual   #198 <Method void appendLine(String, String)>
		return this;
	//  493  983:aload_0         
	//  494  984:areturn         
	}

	public VCardBuilder appendPhones(List list, VCardPhoneNumberTranslationCallback vcardphonenumbertranslationcallback)
	{
		int j;
		if(list != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          534
		{
			HashSet hashset = new HashSet();
	//    2    4:new             #29  <Class HashSet>
	//    3    7:dup             
	//    4    8:invokespecial   #430 <Method void HashSet()>
	//    5   11:astore          9
			Iterator iterator = list.iterator();
	//    6   13:aload_1         
	//    7   14:invokeinterface #288 <Method Iterator List.iterator()>
	//    8   19:astore          10
			int i = 0;
	//    9   21:iconst_0        
	//   10   22:istore          4
			do
			{
				j = i;
	//   11   24:iload           4
	//   12   26:istore          5
				if(!iterator.hasNext())
					break;
	//   13   28:aload           10
	//   14   30:invokeinterface #293 <Method boolean Iterator.hasNext()>
	//   15   35:ifeq            537
				list = ((List) ((ContentValues)iterator.next()));
	//   16   38:aload           10
	//   17   40:invokeinterface #297 <Method Object Iterator.next()>
	//   18   45:checkcast       #176 <Class ContentValues>
	//   19   48:astore_1        
				Integer integer = ((ContentValues) (list)).getAsInteger("data2");
	//   20   49:aload_1         
	//   21   50:ldc1            #184 <String "data2">
	//   22   52:invokevirtual   #374 <Method Integer ContentValues.getAsInteger(String)>
	//   23   55:astore          12
				String s = ((ContentValues) (list)).getAsString("data3");
	//   24   57:aload_1         
	//   25   58:ldc1            #174 <String "data3">
	//   26   60:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   27   63:astore          11
				Object obj = ((Object) (((ContentValues) (list)).getAsInteger("is_primary")));
	//   28   65:aload_1         
	//   29   66:ldc2            #381 <String "is_primary">
	//   30   69:invokevirtual   #374 <Method Integer ContentValues.getAsInteger(String)>
	//   31   72:astore          8
				boolean flag;
				if(obj != null && ((Integer) (obj)).intValue() > 0)
	//*  32   74:aload           8
	//*  33   76:ifnull          93
	//*  34   79:aload           8
	//*  35   81:invokevirtual   #379 <Method int Integer.intValue()>
	//*  36   84:ifle            93
					flag = true;
	//   37   87:iconst_1        
	//   38   88:istore          7
				else
	//*  39   90:goto            96
					flag = false;
	//   40   93:iconst_0        
	//   41   94:istore          7
				obj = ((Object) (((ContentValues) (list)).getAsString("data1")));
	//   42   96:aload_1         
	//   43   97:ldc1            #190 <String "data1">
	//   44   99:invokevirtual   #180 <Method String ContentValues.getAsString(String)>
	//   45  102:astore          8
				list = ((List) (obj));
	//   46  104:aload           8
	//   47  106:astore_1        
				if(obj != null)
	//*  48  107:aload           8
	//*  49  109:ifnull          118
					list = ((List) (((String) (obj)).trim()));
	//   50  112:aload           8
	//   51  114:invokevirtual   #433 <Method String String.trim()>
	//   52  117:astore_1        
				if(!TextUtils.isEmpty(((CharSequence) (list))))
	//*  53  118:aload_1         
	//*  54  119:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  55  122:ifeq            128
	//*  56  125:goto            24
				{
					if(integer != null)
	//*  57  128:aload           12
	//*  58  130:ifnull          143
						j = integer.intValue();
	//   59  133:aload           12
	//   60  135:invokevirtual   #379 <Method int Integer.intValue()>
	//   61  138:istore          5
					else
	//*  62  140:goto            146
						j = 1;
	//   63  143:iconst_1        
	//   64  144:istore          5
					if(vcardphonenumbertranslationcallback != null)
	//*  65  146:aload_2         
	//*  66  147:ifnull          201
					{
						list = ((List) (vcardphonenumbertranslationcallback.onValueReceived(((String) (list)), j, s, flag)));
	//   67  150:aload_2         
	//   68  151:aload_1         
	//   69  152:iload           5
	//   70  154:aload           11
	//   71  156:iload           7
	//   72  158:invokeinterface #467 <Method String VCardPhoneNumberTranslationCallback.onValueReceived(String, int, String, boolean)>
	//   73  163:astore_1        
						if(!((Set) (hashset)).contains(((Object) (list))))
	//*  74  164:aload           9
	//*  75  166:aload_1         
	//*  76  167:invokeinterface #438 <Method boolean Set.contains(Object)>
	//*  77  172:ifne            24
						{
							((Set) (hashset)).add(((Object) (list)));
	//   78  175:aload           9
	//   79  177:aload_1         
	//   80  178:invokeinterface #439 <Method boolean Set.add(Object)>
	//   81  183:pop             
							appendTelLine(Integer.valueOf(j), s, ((String) (list)), flag);
	//   82  184:aload_0         
	//   83  185:iload           5
	//   84  187:invokestatic    #470 <Method Integer Integer.valueOf(int)>
	//   85  190:aload           11
	//   86  192:aload_1         
	//   87  193:iload           7
	//   88  195:invokevirtual   #474 <Method void appendTelLine(Integer, String, String, boolean)>
						}
					} else
	//*  89  198:goto            24
					if(j != 6 && !VCardConfig.refrainPhoneNumberFormatting(mVCardType))
	//*  90  201:iload           5
	//*  91  203:bipush          6
	//*  92  205:icmpeq          494
	//*  93  208:aload_0         
	//*  94  209:getfield        #61  <Field int mVCardType>
	//*  95  212:invokestatic    #477 <Method boolean VCardConfig.refrainPhoneNumberFormatting(int)>
	//*  96  215:ifeq            221
	//*  97  218:goto            494
					{
						list = splitPhoneNumbers(((String) (list)));
	//   98  221:aload_0         
	//   99  222:aload_1         
	//  100  223:invokespecial   #479 <Method List splitPhoneNumbers(String)>
	//  101  226:astore_1        
						if(!list.isEmpty())
	//* 102  227:aload_1         
	//* 103  228:invokeinterface #168 <Method boolean List.isEmpty()>
	//* 104  233:ifeq            239
	//* 105  236:goto            24
						{
							Iterator iterator1 = list.iterator();
	//  106  239:aload_1         
	//  107  240:invokeinterface #288 <Method Iterator List.iterator()>
	//  108  245:astore          12
							do
							{
								if(!iterator1.hasNext())
									break;
	//  109  247:aload           12
	//  110  249:invokeinterface #293 <Method boolean Iterator.hasNext()>
	//  111  254:ifeq            488
								String s1 = (String)iterator1.next();
	//  112  257:aload           12
	//  113  259:invokeinterface #297 <Method Object Iterator.next()>
	//  114  264:checkcast       #31  <Class String>
	//  115  267:astore          13
								if(!((Set) (hashset)).contains(((Object) (s1))))
	//* 116  269:aload           9
	//* 117  271:aload           13
	//* 118  273:invokeinterface #438 <Method boolean Set.contains(Object)>
	//* 119  278:ifne            247
								{
									Object obj1 = ((Object) (s1.replace(',', 'p').replace(';', 'w')));
	//  120  281:aload           13
	//  121  283:bipush          44
	//  122  285:bipush          112
	//  123  287:invokevirtual   #483 <Method String String.replace(char, char)>
	//  124  290:bipush          59
	//  125  292:bipush          119
	//  126  294:invokevirtual   #483 <Method String String.replace(char, char)>
	//  127  297:astore          8
									list = ((List) (obj1));
	//  128  299:aload           8
	//  129  301:astore_1        
									if(TextUtils.equals(((CharSequence) (obj1)), ((CharSequence) (s1))))
	//* 130  302:aload           8
	//* 131  304:aload           13
	//* 132  306:invokestatic    #487 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//* 133  309:ifeq            392
									{
										list = ((List) (new StringBuilder()));
	//  134  312:new             #145 <Class StringBuilder>
	//  135  315:dup             
	//  136  316:invokespecial   #146 <Method void StringBuilder()>
	//  137  319:astore_1        
										int k = s1.length();
	//  138  320:aload           13
	//  139  322:invokevirtual   #358 <Method int String.length()>
	//  140  325:istore          6
										for(i = 0; i < k; i++)
	//* 141  327:iconst_0        
	//* 142  328:istore          4
	//* 143  330:iload           4
	//* 144  332:iload           6
	//* 145  334:icmpge          373
										{
											char c = s1.charAt(i);
	//  146  337:aload           13
	//  147  339:iload           4
	//  148  341:invokevirtual   #362 <Method char String.charAt(int)>
	//  149  344:istore_3        
											if(Character.isDigit(c) || c == '+')
	//* 150  345:iload_3         
	//* 151  346:invokestatic    #493 <Method boolean Character.isDigit(char)>
	//* 152  349:ifne            358
	//* 153  352:iload_3         
	//* 154  353:bipush          43
	//* 155  355:icmpne          364
												((StringBuilder) (list)).append(c);
	//  156  358:aload_1         
	//  157  359:iload_3         
	//  158  360:invokevirtual   #216 <Method StringBuilder StringBuilder.append(char)>
	//  159  363:pop             
										}

	//  160  364:iload           4
	//  161  366:iconst_1        
	//  162  367:iadd            
	//  163  368:istore          4
	//* 164  370:goto            330
										i = VCardUtils.getPhoneNumberFormat(mVCardType);
	//  165  373:aload_0         
	//  166  374:getfield        #61  <Field int mVCardType>
	//  167  377:invokestatic    #496 <Method int VCardUtils.getPhoneNumberFormat(int)>
	//  168  380:istore          4
										list = ((List) (VCardUtils.PhoneNumberUtilsPort.formatNumber(((StringBuilder) (list)).toString(), i)));
	//  169  382:aload_1         
	//  170  383:invokevirtual   #156 <Method String StringBuilder.toString()>
	//  171  386:iload           4
	//  172  388:invokestatic    #502 <Method String VCardUtils$PhoneNumberUtilsPort.formatNumber(String, int)>
	//  173  391:astore_1        
									}
									obj1 = ((Object) (list));
	//  174  392:aload_1         
	//  175  393:astore          8
									if(VCardConfig.isVersion40(mVCardType))
	//* 176  395:aload_0         
	//* 177  396:getfield        #61  <Field int mVCardType>
	//* 178  399:invokestatic    #67  <Method boolean VCardConfig.isVersion40(int)>
	//* 179  402:ifeq            460
									{
										obj1 = ((Object) (list));
	//  180  405:aload_1         
	//  181  406:astore          8
										if(!TextUtils.isEmpty(((CharSequence) (list))))
	//* 182  408:aload_1         
	//* 183  409:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 184  412:ifne            460
										{
											obj1 = ((Object) (list));
	//  185  415:aload_1         
	//  186  416:astore          8
											if(!((String) (list)).startsWith("tel:"))
	//* 187  418:aload_1         
	//* 188  419:ldc2            #504 <String "tel:">
	//* 189  422:invokevirtual   #507 <Method boolean String.startsWith(String)>
	//* 190  425:ifne            460
											{
												obj1 = ((Object) (new StringBuilder()));
	//  191  428:new             #145 <Class StringBuilder>
	//  192  431:dup             
	//  193  432:invokespecial   #146 <Method void StringBuilder()>
	//  194  435:astore          8
												((StringBuilder) (obj1)).append("tel:");
	//  195  437:aload           8
	//  196  439:ldc2            #504 <String "tel:">
	//  197  442:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  198  445:pop             
												((StringBuilder) (obj1)).append(((String) (list)));
	//  199  446:aload           8
	//  200  448:aload_1         
	//  201  449:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  202  452:pop             
												obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//  203  453:aload           8
	//  204  455:invokevirtual   #156 <Method String StringBuilder.toString()>
	//  205  458:astore          8
											}
										}
									}
									((Set) (hashset)).add(((Object) (s1)));
	//  206  460:aload           9
	//  207  462:aload           13
	//  208  464:invokeinterface #439 <Method boolean Set.add(Object)>
	//  209  469:pop             
									appendTelLine(Integer.valueOf(j), s, ((String) (obj1)), flag);
	//  210  470:aload_0         
	//  211  471:iload           5
	//  212  473:invokestatic    #470 <Method Integer Integer.valueOf(int)>
	//  213  476:aload           11
	//  214  478:aload           8
	//  215  480:iload           7
	//  216  482:invokevirtual   #474 <Method void appendTelLine(Integer, String, String, boolean)>
								}
							} while(true);
	//  217  485:goto            247
							i = 1;
	//  218  488:iconst_1        
	//  219  489:istore          4
						}
					} else
	//* 220  491:goto            24
					{
						if(!((Set) (hashset)).contains(((Object) (list))))
	//* 221  494:aload           9
	//* 222  496:aload_1         
	//* 223  497:invokeinterface #438 <Method boolean Set.contains(Object)>
	//* 224  502:ifne            528
						{
							((Set) (hashset)).add(((Object) (list)));
	//  225  505:aload           9
	//  226  507:aload_1         
	//  227  508:invokeinterface #439 <Method boolean Set.add(Object)>
	//  228  513:pop             
							appendTelLine(Integer.valueOf(j), s, ((String) (list)), flag);
	//  229  514:aload_0         
	//  230  515:iload           5
	//  231  517:invokestatic    #470 <Method Integer Integer.valueOf(int)>
	//  232  520:aload           11
	//  233  522:aload_1         
	//  234  523:iload           7
	//  235  525:invokevirtual   #474 <Method void appendTelLine(Integer, String, String, boolean)>
						}
						i = 1;
	//  236  528:iconst_1        
	//  237  529:istore          4
					}
				}
			} while(true);
	//  238  531:goto            24
		} else
		{
			j = 0;
	//  239  534:iconst_0        
	//  240  535:istore          5
		}
		if(j == 0 && mIsDoCoMo)
	//* 241  537:iload           5
	//* 242  539:ifne            562
	//* 243  542:aload_0         
	//* 244  543:getfield        #92  <Field boolean mIsDoCoMo>
	//* 245  546:ifeq            562
			appendTelLine(Integer.valueOf(1), "", "", false);
	//  246  549:aload_0         
	//  247  550:iconst_1        
	//  248  551:invokestatic    #470 <Method Integer Integer.valueOf(int)>
	//  249  554:ldc1            #194 <String "">
	//  250  556:ldc1            #194 <String "">
	//  251  558:iconst_0        
	//  252  559:invokevirtual   #474 <Method void appendTelLine(Integer, String, String, boolean)>
		return this;
	//  253  562:aload_0         
	//  254  563:areturn         
	}

	public void appendTelLine(Integer integer, String s, String s1, boolean flag)
	{
		int i;
		boolean flag1;
label0:
		{
			mBuilder.append("TEL");
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field StringBuilder mBuilder>
	//    2    4:ldc2            #510 <String "TEL">
	//    3    7:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//    4   10:pop             
			mBuilder.append(";");
	//    5   11:aload_0         
	//    6   12:getfield        #209 <Field StringBuilder mBuilder>
	//    7   15:ldc1            #213 <String ";">
	//    8   17:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
			if(integer == null)
	//*  10   21:aload_1         
	//*  11   22:ifnonnull       32
				i = 7;
	//   12   25:bipush          7
	//   13   27:istore          5
			else
	//*  14   29:goto            38
				i = integer.intValue();
	//   15   32:aload_1         
	//   16   33:invokevirtual   #379 <Method int Integer.intValue()>
	//   17   36:istore          5
			integer = ((Integer) (new ArrayList()));
	//   18   38:new             #392 <Class ArrayList>
	//   19   41:dup             
	//   20   42:invokespecial   #393 <Method void ArrayList()>
	//   21   45:astore_1        
			boolean flag2 = true;
	//   22   46:iconst_1        
	//   23   47:istore          7
			flag1 = flag2;
	//   24   49:iload           7
	//   25   51:istore          6
			switch(i)
	//*  26   53:iload           5
			{
			case 8: // '\b'
			case 14: // '\016'
			case 16: // '\020'
			case 19: // '\023'
			default:
				break;

	//*  27   55:tableswitch     0 20: default 152
	//	               0 436
	//	               1 415
	//	               2 404
	//	               3 383
	//	               4 356
	//	               5 329
	//	               6 300
	//	               7 289
	//	               8 152
	//	               9 278
	//	               10 263
	//	               11 252
	//	               12 568
	//	               13 241
	//	               14 152
	//	               15 230
	//	               16 152
	//	               17 203
	//	               18 166
	//	               19 152
	//	               20 155
			case 12: // '\f'
				break label0;
	//   28  152:goto            564

			case 20: // '\024'
				((ArrayList) (integer)).add("MSG");
	//   29  155:aload_1         
	//   30  156:ldc2            #512 <String "MSG">
	//   31  159:invokevirtual   #513 <Method boolean ArrayList.add(Object)>
	//   32  162:pop             
				break;
	//   33  163:goto            564

			case 18: // '\022'
				((ArrayList) (integer)).add("WORK");
	//   34  166:aload_1         
	//   35  167:ldc2            #410 <String "WORK">
	//   36  170:invokevirtual   #513 <Method boolean ArrayList.add(Object)>
	//   37  173:pop             
				if(mIsDoCoMo)
	//*  38  174:aload_0         
	//*  39  175:getfield        #92  <Field boolean mIsDoCoMo>
	//*  40  178:ifeq            192
					((ArrayList) (integer)).add("VOICE");
	//   41  181:aload_1         
	//   42  182:ldc2            #310 <String "VOICE">
	//   43  185:invokevirtual   #513 <Method boolean ArrayList.add(Object)>
	//   44  188:pop             
				else
	//*  45  189:goto            564
					((ArrayList) (integer)).add("PAGER");
	//   46  192:aload_1         
	//   47  193:ldc2            #515 <String "PAGER">
	//   48  196:invokevirtual   #513 <Method boolean ArrayList.add(Object)>
	//   49  199:pop             
				break;
	//   50  200:goto            564

			case 17: // '\021'
				((ArrayList) (integer)).addAll(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
					"WORK", "CELL"
				}))))));
	//   51  203:aload_1         
	//   52  204:iconst_2        
	//   53  205:anewarray       String[]
	//   54  208:dup             
	//   55  209:iconst_0        
	//   56  210:ldc2            #410 <String "WORK">
	//   57  213:aastore         
	//   58  214:dup             
	//   59  215:iconst_1        
	//   60  216:ldc2            #408 <String "CELL">
	//   61  219:aastore         
	//   62  220:invokestatic    #43  <Method List Arrays.asList(Object[])>
	//   63  223:invokevirtual   #519 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   64  226:pop             
				break;
	//   65  227:goto            564

			case 15: // '\017'
				((ArrayList) (integer)).add("TLX");
	//   66  230:aload_1         
	//   67  231:ldc2            #521 <String "TLX">
	//   68  234:invokevirtual   #513 <Method boolean ArrayList.add(Object)>
	//   69  237:pop             
				break;
	//   70  238:goto            564

			case 13: // '\r'
				((ArrayList) (integer)).add("FAX");
	//   71  241:aload_1         
	//   72  242:ldc2            #523 <String "FAX">
	//   73  245:invokevirtual   #513 <Method boolean ArrayList.add(Object)>
	//   74  248:pop             
				break;
	//   75  249:goto            564

			case 11: // '\013'
				((ArrayList) (integer)).add("ISDN");
	//   76  252:aload_1         
	//   77  253:ldc2            #525 <String "ISDN">
	//   78  256:invokevirtual   #513 <Method boolean ArrayList.add(Object)>
	//   79  259:pop             
				break;
	//   80  260:goto            564

			case 10: // '\n'
				((ArrayList) (integer)).add("WORK");
	//   81  263:aload_1         
	//   82  264:ldc2            #410 <String "WORK">
	//   83  267:invokevirtual   #513 <Method boolean ArrayList.add(Object)>
	//   84  270:pop             
				flag1 = flag2;
	//   85  271:iload           7
	//   86  273:istore          6
				break label0;
	//   87  275:goto            568

			case 9: // '\t'
				((ArrayList) (integer)).add("CAR");
	//   88  278:aload_1         
	//   89  279:ldc2            #527 <String "CAR">
	//   90  282:invokevirtual   #513 <Method boolean ArrayList.add(Object)>
	//   91  285:pop             
				break;
	//   92  286:goto            564

			case 7: // '\007'
				((ArrayList) (integer)).add("VOICE");
	//   93  289:aload_1         
	//   94  290:ldc2            #310 <String "VOICE">
	//   95  293:invokevirtual   #513 <Method boolean ArrayList.add(Object)>
	//   96  296:pop             
				break;
	//   97  297:goto            564

			case 6: // '\006'
				if(mIsDoCoMo)
	//*  98  300:aload_0         
	//*  99  301:getfield        #92  <Field boolean mIsDoCoMo>
	//* 100  304:ifeq            318
					((ArrayList) (integer)).add("VOICE");
	//  101  307:aload_1         
	//  102  308:ldc2            #310 <String "VOICE">
	//  103  311:invokevirtual   #513 <Method boolean ArrayList.add(Object)>
	//  104  314:pop             
				else
	//* 105  315:goto            564
					((ArrayList) (integer)).add("PAGER");
	//  106  318:aload_1         
	//  107  319:ldc2            #515 <String "PAGER">
	//  108  322:invokevirtual   #513 <Method boolean ArrayList.add(Object)>
	//  109  325:pop             
				break;
	//  110  326:goto            564

			case 5: // '\005'
				((ArrayList) (integer)).addAll(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
					"HOME", "FAX"
				}))))));
	//  111  329:aload_1         
	//  112  330:iconst_2        
	//  113  331:anewarray       String[]
	//  114  334:dup             
	//  115  335:iconst_0        
	//  116  336:ldc2            #412 <String "HOME">
	//  117  339:aastore         
	//  118  340:dup             
	//  119  341:iconst_1        
	//  120  342:ldc2            #523 <String "FAX">
	//  121  345:aastore         
	//  122  346:invokestatic    #43  <Method List Arrays.asList(Object[])>
	//  123  349:invokevirtual   #519 <Method boolean ArrayList.addAll(java.util.Collection)>
	//  124  352:pop             
				break;
	//  125  353:goto            564

			case 4: // '\004'
				((ArrayList) (integer)).addAll(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
					"WORK", "FAX"
				}))))));
	//  126  356:aload_1         
	//  127  357:iconst_2        
	//  128  358:anewarray       String[]
	//  129  361:dup             
	//  130  362:iconst_0        
	//  131  363:ldc2            #410 <String "WORK">
	//  132  366:aastore         
	//  133  367:dup             
	//  134  368:iconst_1        
	//  135  369:ldc2            #523 <String "FAX">
	//  136  372:aastore         
	//  137  373:invokestatic    #43  <Method List Arrays.asList(Object[])>
	//  138  376:invokevirtual   #519 <Method boolean ArrayList.addAll(java.util.Collection)>
	//  139  379:pop             
				break;
	//  140  380:goto            564

			case 3: // '\003'
				((ArrayList) (integer)).addAll(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
					"WORK"
				}))))));
	//  141  383:aload_1         
	//  142  384:iconst_1        
	//  143  385:anewarray       String[]
	//  144  388:dup             
	//  145  389:iconst_0        
	//  146  390:ldc2            #410 <String "WORK">
	//  147  393:aastore         
	//  148  394:invokestatic    #43  <Method List Arrays.asList(Object[])>
	//  149  397:invokevirtual   #519 <Method boolean ArrayList.addAll(java.util.Collection)>
	//  150  400:pop             
				break;
	//  151  401:goto            564

			case 2: // '\002'
				((ArrayList) (integer)).add("CELL");
	//  152  404:aload_1         
	//  153  405:ldc2            #408 <String "CELL">
	//  154  408:invokevirtual   #513 <Method boolean ArrayList.add(Object)>
	//  155  411:pop             
				break;
	//  156  412:goto            564

			case 1: // '\001'
				((ArrayList) (integer)).addAll(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
					"HOME"
				}))))));
	//  157  415:aload_1         
	//  158  416:iconst_1        
	//  159  417:anewarray       String[]
	//  160  420:dup             
	//  161  421:iconst_0        
	//  162  422:ldc2            #412 <String "HOME">
	//  163  425:aastore         
	//  164  426:invokestatic    #43  <Method List Arrays.asList(Object[])>
	//  165  429:invokevirtual   #519 <Method boolean ArrayList.addAll(java.util.Collection)>
	//  166  432:pop             
				break;
	//  167  433:goto            564

			case 0: // '\0'
				if(TextUtils.isEmpty(((CharSequence) (s))))
	//* 168  436:aload_2         
	//* 169  437:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 170  440:ifeq            454
				{
					((ArrayList) (integer)).add("VOICE");
	//  171  443:aload_1         
	//  172  444:ldc2            #310 <String "VOICE">
	//  173  447:invokevirtual   #513 <Method boolean ArrayList.add(Object)>
	//  174  450:pop             
					break;
	//  175  451:goto            564
				}
				if(VCardUtils.isMobilePhoneLabel(s))
	//* 176  454:aload_2         
	//* 177  455:invokestatic    #415 <Method boolean VCardUtils.isMobilePhoneLabel(String)>
	//* 178  458:ifeq            472
				{
					((ArrayList) (integer)).add("CELL");
	//  179  461:aload_1         
	//  180  462:ldc2            #408 <String "CELL">
	//  181  465:invokevirtual   #513 <Method boolean ArrayList.add(Object)>
	//  182  468:pop             
					break;
	//  183  469:goto            564
				}
				if(mIsV30OrV40)
	//* 184  472:aload_0         
	//* 185  473:getfield        #82  <Field boolean mIsV30OrV40>
	//* 186  476:ifeq            488
				{
					((ArrayList) (integer)).add(((Object) (s)));
	//  187  479:aload_1         
	//  188  480:aload_2         
	//  189  481:invokevirtual   #513 <Method boolean ArrayList.add(Object)>
	//  190  484:pop             
					break;
	//  191  485:goto            564
				}
				String s2 = s.toUpperCase(Locale.getDefault());
	//  192  488:aload_2         
	//  193  489:invokestatic    #533 <Method Locale Locale.getDefault()>
	//  194  492:invokevirtual   #537 <Method String String.toUpperCase(Locale)>
	//  195  495:astore          8
				if(VCardUtils.isValidInV21ButUnknownToContactsPhoteType(s2))
	//* 196  497:aload           8
	//* 197  499:invokestatic    #540 <Method boolean VCardUtils.isValidInV21ButUnknownToContactsPhoteType(String)>
	//* 198  502:ifeq            515
				{
					((ArrayList) (integer)).add(((Object) (s2)));
	//  199  505:aload_1         
	//  200  506:aload           8
	//  201  508:invokevirtual   #513 <Method boolean ArrayList.add(Object)>
	//  202  511:pop             
					break;
	//  203  512:goto            564
				}
				if(VCardUtils.containsOnlyAlphaDigitHyphen(new String[] {
	s
}))
	//* 204  515:iconst_1        
	//* 205  516:anewarray       String[]
	//* 206  519:dup             
	//* 207  520:iconst_0        
	//* 208  521:aload_2         
	//* 209  522:aastore         
	//* 210  523:invokestatic    #418 <Method boolean VCardUtils.containsOnlyAlphaDigitHyphen(String[])>
	//* 211  526:ifeq            564
				{
					StringBuilder stringbuilder = new StringBuilder();
	//  212  529:new             #145 <Class StringBuilder>
	//  213  532:dup             
	//  214  533:invokespecial   #146 <Method void StringBuilder()>
	//  215  536:astore          8
					stringbuilder.append("X-");
	//  216  538:aload           8
	//  217  540:ldc2            #420 <String "X-">
	//  218  543:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  219  546:pop             
					stringbuilder.append(s);
	//  220  547:aload           8
	//  221  549:aload_2         
	//  222  550:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  223  553:pop             
					((ArrayList) (integer)).add(((Object) (stringbuilder.toString())));
	//  224  554:aload_1         
	//  225  555:aload           8
	//  226  557:invokevirtual   #156 <Method String StringBuilder.toString()>
	//  227  560:invokevirtual   #513 <Method boolean ArrayList.add(Object)>
	//  228  563:pop             
				}
				break;
			}
			flag1 = flag;
	//  229  564:iload           4
	//  230  566:istore          6
		}
		if(flag1)
	//* 231  568:iload           6
	//* 232  570:ifeq            581
			((ArrayList) (integer)).add("PREF");
	//  233  573:aload_1         
	//  234  574:ldc2            #422 <String "PREF">
	//  235  577:invokevirtual   #513 <Method boolean ArrayList.add(Object)>
	//  236  580:pop             
		if(((ArrayList) (integer)).isEmpty())
	//* 237  581:aload_1         
	//* 238  582:invokevirtual   #541 <Method boolean ArrayList.isEmpty()>
	//* 239  585:ifeq            604
			appendUncommonPhoneType(mBuilder, Integer.valueOf(i));
	//  240  588:aload_0         
	//  241  589:aload_0         
	//  242  590:getfield        #209 <Field StringBuilder mBuilder>
	//  243  593:iload           5
	//  244  595:invokestatic    #470 <Method Integer Integer.valueOf(int)>
	//  245  598:invokespecial   #543 <Method void appendUncommonPhoneType(StringBuilder, Integer)>
		else
	//* 246  601:goto            609
			appendTypeParameters(((List) (integer)));
	//  247  604:aload_0         
	//  248  605:aload_1         
	//  249  606:invokespecial   #452 <Method void appendTypeParameters(List)>
		mBuilder.append(":");
	//  250  609:aload_0         
	//  251  610:getfield        #209 <Field StringBuilder mBuilder>
	//  252  613:ldc1            #225 <String ":">
	//  253  615:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  254  618:pop             
		mBuilder.append(s1);
	//  255  619:aload_0         
	//  256  620:getfield        #209 <Field StringBuilder mBuilder>
	//  257  623:aload_3         
	//  258  624:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  259  627:pop             
		mBuilder.append("\r\n");
	//  260  628:aload_0         
	//  261  629:getfield        #209 <Field StringBuilder mBuilder>
	//  262  632:ldc1            #227 <String "\r\n">
	//  263  634:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  264  637:pop             
	//  265  638:return          
	}

	public void clear()
	{
		mBuilder = new StringBuilder();
	//    0    0:aload_0         
	//    1    1:new             #145 <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #146 <Method void StringBuilder()>
	//    4    8:putfield        #209 <Field StringBuilder mBuilder>
		mEndAppended = false;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #545 <Field boolean mEndAppended>
		appendLine("BEGIN", "VCARD");
	//    8   16:aload_0         
	//    9   17:ldc2            #547 <String "BEGIN">
	//   10   20:ldc2            #549 <String "VCARD">
	//   11   23:invokevirtual   #198 <Method void appendLine(String, String)>
		if(VCardConfig.isVersion40(mVCardType))
	//*  12   26:aload_0         
	//*  13   27:getfield        #61  <Field int mVCardType>
	//*  14   30:invokestatic    #67  <Method boolean VCardConfig.isVersion40(int)>
	//*  15   33:ifeq            47
		{
			appendLine("VERSION", "4.0");
	//   16   36:aload_0         
	//   17   37:ldc2            #551 <String "VERSION">
	//   18   40:ldc2            #553 <String "4.0">
	//   19   43:invokevirtual   #198 <Method void appendLine(String, String)>
			return;
	//   20   46:return          
		}
		if(VCardConfig.isVersion30(mVCardType))
	//*  21   47:aload_0         
	//*  22   48:getfield        #61  <Field int mVCardType>
	//*  23   51:invokestatic    #80  <Method boolean VCardConfig.isVersion30(int)>
	//*  24   54:ifeq            68
		{
			appendLine("VERSION", "3.0");
	//   25   57:aload_0         
	//   26   58:ldc2            #551 <String "VERSION">
	//   27   61:ldc2            #555 <String "3.0">
	//   28   64:invokevirtual   #198 <Method void appendLine(String, String)>
			return;
	//   29   67:return          
		}
		if(!VCardConfig.isVersion21(mVCardType))
	//*  30   68:aload_0         
	//*  31   69:getfield        #61  <Field int mVCardType>
	//*  32   72:invokestatic    #558 <Method boolean VCardConfig.isVersion21(int)>
	//*  33   75:ifne            87
			Log.w("vCard", "Unknown vCard version detected.");
	//   34   78:ldc1            #69  <String "vCard">
	//   35   80:ldc2            #560 <String "Unknown vCard version detected.">
	//   36   83:invokestatic    #77  <Method int Log.w(String, String)>
	//   37   86:pop             
		appendLine("VERSION", "2.1");
	//   38   87:aload_0         
	//   39   88:ldc2            #551 <String "VERSION">
	//   40   91:ldc2            #562 <String "2.1">
	//   41   94:invokevirtual   #198 <Method void appendLine(String, String)>
	//   42   97:return          
	}

	public String toString()
	{
		if(!mEndAppended)
	//*   0    0:aload_0         
	//*   1    1:getfield        #545 <Field boolean mEndAppended>
	//*   2    4:ifne            66
		{
			if(mIsDoCoMo)
	//*   3    7:aload_0         
	//*   4    8:getfield        #92  <Field boolean mIsDoCoMo>
	//*   5   11:ifeq            51
			{
				appendLine("X-CLASS", "PUBLIC");
	//    6   14:aload_0         
	//    7   15:ldc2            #564 <String "X-CLASS">
	//    8   18:ldc2            #566 <String "PUBLIC">
	//    9   21:invokevirtual   #198 <Method void appendLine(String, String)>
				appendLine("X-REDUCTION", "");
	//   10   24:aload_0         
	//   11   25:ldc2            #568 <String "X-REDUCTION">
	//   12   28:ldc1            #194 <String "">
	//   13   30:invokevirtual   #198 <Method void appendLine(String, String)>
				appendLine("X-NO", "");
	//   14   33:aload_0         
	//   15   34:ldc2            #570 <String "X-NO">
	//   16   37:ldc1            #194 <String "">
	//   17   39:invokevirtual   #198 <Method void appendLine(String, String)>
				appendLine("X-DCM-HMN-MODE", "");
	//   18   42:aload_0         
	//   19   43:ldc2            #572 <String "X-DCM-HMN-MODE">
	//   20   46:ldc1            #194 <String "">
	//   21   48:invokevirtual   #198 <Method void appendLine(String, String)>
			}
			appendLine("END", "VCARD");
	//   22   51:aload_0         
	//   23   52:ldc2            #574 <String "END">
	//   24   55:ldc2            #549 <String "VCARD">
	//   25   58:invokevirtual   #198 <Method void appendLine(String, String)>
			mEndAppended = true;
	//   26   61:aload_0         
	//   27   62:iconst_1        
	//   28   63:putfield        #545 <Field boolean mEndAppended>
		}
		return mBuilder.toString();
	//   29   66:aload_0         
	//   30   67:getfield        #209 <Field StringBuilder mBuilder>
	//   31   70:invokevirtual   #156 <Method String StringBuilder.toString()>
	//   32   73:areturn         
	}

	private static final Set sAllowedAndroidPropertySet = Collections.unmodifiableSet(((Set) (new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"vnd.android.cursor.item/nickname", "vnd.android.cursor.item/contact_event", "vnd.android.cursor.item/relation"
	})))))))));
	private final boolean mAppendTypeParamName;
	private StringBuilder mBuilder;
	private final String mCharset;
	private boolean mEndAppended;
	private final boolean mIsDoCoMo;
	private final boolean mIsJapaneseMobilePhone;
	private final boolean mIsV30OrV40;
	private final boolean mNeedsToConvertPhoneticString;
	private final boolean mRefrainsQPToNameProperties;
	private final boolean mShouldAppendCharsetParam;
	private final boolean mShouldUseQuotedPrintable;
	private final boolean mUsesDefactProperty;
	private final String mVCardCharsetParameter;
	private final int mVCardType;

	static 
	{
	//    0    0:new             #29  <Class HashSet>
	//    1    3:dup             
	//    2    4:iconst_3        
	//    3    5:anewarray       String[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #33  <String "vnd.android.cursor.item/nickname">
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:ldc1            #35  <String "vnd.android.cursor.item/contact_event">
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:ldc1            #37  <String "vnd.android.cursor.item/relation">
	//   15   22:aastore         
	//   16   23:invokestatic    #43  <Method List Arrays.asList(Object[])>
	//   17   26:invokespecial   #47  <Method void HashSet(java.util.Collection)>
	//   18   29:invokestatic    #53  <Method Set Collections.unmodifiableSet(Set)>
	//   19   32:putstatic       #55  <Field Set sAllowedAndroidPropertySet>
	//*  20   35:return          
	}
}
