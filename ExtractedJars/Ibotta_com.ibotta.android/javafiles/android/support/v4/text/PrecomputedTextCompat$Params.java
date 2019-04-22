// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.support.v4.util.ObjectsCompat;
import android.text.*;
import java.util.Locale;

// Referenced classes of package android.support.v4.text:
//			PrecomputedTextCompat

public static final class PrecomputedTextCompat$Params
{
	public static class Builder
	{

		public PrecomputedTextCompat.Params build()
		{
			return new PrecomputedTextCompat.Params(mPaint, mTextDir, mBreakStrategy, mHyphenationFrequency);
		//    0    0:new             #6   <Class PrecomputedTextCompat$Params>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #25  <Field TextPaint mPaint>
		//    4    8:aload_0         
		//    5    9:getfield        #41  <Field TextDirectionHeuristic mTextDir>
		//    6   12:aload_0         
		//    7   13:getfield        #32  <Field int mBreakStrategy>
		//    8   16:aload_0         
		//    9   17:getfield        #34  <Field int mHyphenationFrequency>
		//   10   20:invokespecial   #48  <Method void PrecomputedTextCompat$Params(TextPaint, TextDirectionHeuristic, int, int)>
		//   11   23:areturn         
		}

		public Builder setBreakStrategy(int i)
		{
			mBreakStrategy = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #32  <Field int mBreakStrategy>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setHyphenationFrequency(int i)
		{
			mHyphenationFrequency = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #34  <Field int mHyphenationFrequency>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setTextDirection(TextDirectionHeuristic textdirectionheuristic)
		{
			mTextDir = textdirectionheuristic;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #41  <Field TextDirectionHeuristic mTextDir>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private int mBreakStrategy;
		private int mHyphenationFrequency;
		private final TextPaint mPaint;
		private TextDirectionHeuristic mTextDir;

		public Builder(TextPaint textpaint)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			mPaint = textpaint;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #25  <Field TextPaint mPaint>
			if(android.os.Build.VERSION.SDK_INT >= 23)
		//*   5    9:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
		//*   6   12:bipush          23
		//*   7   14:icmplt          30
			{
				mBreakStrategy = 1;
		//    8   17:aload_0         
		//    9   18:iconst_1        
		//   10   19:putfield        #32  <Field int mBreakStrategy>
				mHyphenationFrequency = 1;
		//   11   22:aload_0         
		//   12   23:iconst_1        
		//   13   24:putfield        #34  <Field int mHyphenationFrequency>
			} else
		//*  14   27:goto            40
			{
				mHyphenationFrequency = 0;
		//   15   30:aload_0         
		//   16   31:iconst_0        
		//   17   32:putfield        #34  <Field int mHyphenationFrequency>
				mBreakStrategy = 0;
		//   18   35:aload_0         
		//   19   36:iconst_0        
		//   20   37:putfield        #32  <Field int mBreakStrategy>
			}
			if(android.os.Build.VERSION.SDK_INT >= 18)
		//*  21   40:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
		//*  22   43:bipush          18
		//*  23   45:icmplt          56
			{
				mTextDir = TextDirectionHeuristics.FIRSTSTRONG_LTR;
		//   24   48:aload_0         
		//   25   49:getstatic       #39  <Field TextDirectionHeuristic TextDirectionHeuristics.FIRSTSTRONG_LTR>
		//   26   52:putfield        #41  <Field TextDirectionHeuristic mTextDir>
				return;
		//   27   55:return          
			} else
			{
				mTextDir = null;
		//   28   56:aload_0         
		//   29   57:aconst_null     
		//   30   58:putfield        #41  <Field TextDirectionHeuristic mTextDir>
				return;
		//   31   61:return          
			}
		}
	}


	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          333
		{
			if(!(obj instanceof PrecomputedTextCompat$Params))
	//*   7   11:aload_1         
	//*   8   12:instanceof      #2   <Class PrecomputedTextCompat$Params>
	//*   9   15:ifne            20
				return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
			obj = ((Object) ((PrecomputedTextCompat$Params)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class PrecomputedTextCompat$Params>
	//   14   24:astore_1        
			android.text.PrecomputedText.Params params = mWrapped;
	//   15   25:aload_0         
	//   16   26:getfield        #56  <Field android.text.PrecomputedText$Params mWrapped>
	//   17   29:astore_2        
			if(params != null)
	//*  18   30:aload_2         
	//*  19   31:ifnull          43
				return params.equals(((Object) (((PrecomputedTextCompat$Params) (obj)).mWrapped)));
	//   20   34:aload_2         
	//   21   35:aload_1         
	//   22   36:getfield        #56  <Field android.text.PrecomputedText$Params mWrapped>
	//   23   39:invokevirtual   #89  <Method boolean android.text.PrecomputedText$Params.equals(Object)>
	//   24   42:ireturn         
			if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  25   43:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//*  26   46:bipush          23
	//*  27   48:icmplt          77
			{
				if(mBreakStrategy != ((PrecomputedTextCompat$Params) (obj)).getBreakStrategy())
	//*  28   51:aload_0         
	//*  29   52:getfield        #49  <Field int mBreakStrategy>
	//*  30   55:aload_1         
	//*  31   56:invokevirtual   #90  <Method int getBreakStrategy()>
	//*  32   59:icmpeq          64
					return false;
	//   33   62:iconst_0        
	//   34   63:ireturn         
				if(mHyphenationFrequency != ((PrecomputedTextCompat$Params) (obj)).getHyphenationFrequency())
	//*  35   64:aload_0         
	//*  36   65:getfield        #54  <Field int mHyphenationFrequency>
	//*  37   68:aload_1         
	//*  38   69:invokevirtual   #91  <Method int getHyphenationFrequency()>
	//*  39   72:icmpeq          77
					return false;
	//   40   75:iconst_0        
	//   41   76:ireturn         
			}
			if(android.os.Build.VERSION.SDK_INT >= 18 && mTextDir != ((PrecomputedTextCompat$Params) (obj)).getTextDirection())
	//*  42   77:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//*  43   80:bipush          18
	//*  44   82:icmplt          98
	//*  45   85:aload_0         
	//*  46   86:getfield        #43  <Field TextDirectionHeuristic mTextDir>
	//*  47   89:aload_1         
	//*  48   90:invokevirtual   #92  <Method TextDirectionHeuristic getTextDirection()>
	//*  49   93:if_acmpeq       98
				return false;
	//   50   96:iconst_0        
	//   51   97:ireturn         
			if(mPaint.getTextSize() != ((PrecomputedTextCompat$Params) (obj)).getTextPaint().getTextSize())
	//*  52   98:aload_0         
	//*  53   99:getfield        #37  <Field TextPaint mPaint>
	//*  54  102:invokevirtual   #98  <Method float TextPaint.getTextSize()>
	//*  55  105:aload_1         
	//*  56  106:invokevirtual   #99  <Method TextPaint getTextPaint()>
	//*  57  109:invokevirtual   #98  <Method float TextPaint.getTextSize()>
	//*  58  112:fcmpl           
	//*  59  113:ifeq            118
				return false;
	//   60  116:iconst_0        
	//   61  117:ireturn         
			if(mPaint.getTextScaleX() != ((PrecomputedTextCompat$Params) (obj)).getTextPaint().getTextScaleX())
	//*  62  118:aload_0         
	//*  63  119:getfield        #37  <Field TextPaint mPaint>
	//*  64  122:invokevirtual   #102 <Method float TextPaint.getTextScaleX()>
	//*  65  125:aload_1         
	//*  66  126:invokevirtual   #99  <Method TextPaint getTextPaint()>
	//*  67  129:invokevirtual   #102 <Method float TextPaint.getTextScaleX()>
	//*  68  132:fcmpl           
	//*  69  133:ifeq            138
				return false;
	//   70  136:iconst_0        
	//   71  137:ireturn         
			if(mPaint.getTextSkewX() != ((PrecomputedTextCompat$Params) (obj)).getTextPaint().getTextSkewX())
	//*  72  138:aload_0         
	//*  73  139:getfield        #37  <Field TextPaint mPaint>
	//*  74  142:invokevirtual   #105 <Method float TextPaint.getTextSkewX()>
	//*  75  145:aload_1         
	//*  76  146:invokevirtual   #99  <Method TextPaint getTextPaint()>
	//*  77  149:invokevirtual   #105 <Method float TextPaint.getTextSkewX()>
	//*  78  152:fcmpl           
	//*  79  153:ifeq            158
				return false;
	//   80  156:iconst_0        
	//   81  157:ireturn         
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  82  158:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//*  83  161:bipush          21
	//*  84  163:icmplt          208
			{
				if(mPaint.getLetterSpacing() != ((PrecomputedTextCompat$Params) (obj)).getTextPaint().getLetterSpacing())
	//*  85  166:aload_0         
	//*  86  167:getfield        #37  <Field TextPaint mPaint>
	//*  87  170:invokevirtual   #108 <Method float TextPaint.getLetterSpacing()>
	//*  88  173:aload_1         
	//*  89  174:invokevirtual   #99  <Method TextPaint getTextPaint()>
	//*  90  177:invokevirtual   #108 <Method float TextPaint.getLetterSpacing()>
	//*  91  180:fcmpl           
	//*  92  181:ifeq            186
					return false;
	//   93  184:iconst_0        
	//   94  185:ireturn         
				if(!TextUtils.equals(((CharSequence) (mPaint.getFontFeatureSettings())), ((CharSequence) (((PrecomputedTextCompat$Params) (obj)).getTextPaint().getFontFeatureSettings()))))
	//*  95  186:aload_0         
	//*  96  187:getfield        #37  <Field TextPaint mPaint>
	//*  97  190:invokevirtual   #112 <Method String TextPaint.getFontFeatureSettings()>
	//*  98  193:aload_1         
	//*  99  194:invokevirtual   #99  <Method TextPaint getTextPaint()>
	//* 100  197:invokevirtual   #112 <Method String TextPaint.getFontFeatureSettings()>
	//* 101  200:invokestatic    #117 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//* 102  203:ifne            208
					return false;
	//  103  206:iconst_0        
	//  104  207:ireturn         
			}
			if(mPaint.getFlags() != ((PrecomputedTextCompat$Params) (obj)).getTextPaint().getFlags())
	//* 105  208:aload_0         
	//* 106  209:getfield        #37  <Field TextPaint mPaint>
	//* 107  212:invokevirtual   #120 <Method int TextPaint.getFlags()>
	//* 108  215:aload_1         
	//* 109  216:invokevirtual   #99  <Method TextPaint getTextPaint()>
	//* 110  219:invokevirtual   #120 <Method int TextPaint.getFlags()>
	//* 111  222:icmpeq          227
				return false;
	//  112  225:iconst_0        
	//  113  226:ireturn         
			if(android.os.Build.VERSION.SDK_INT >= 24)
	//* 114  227:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//* 115  230:bipush          24
	//* 116  232:icmplt          257
			{
				if(!mPaint.getTextLocales().equals(((Object) (((PrecomputedTextCompat$Params) (obj)).getTextPaint().getTextLocales()))))
	//* 117  235:aload_0         
	//* 118  236:getfield        #37  <Field TextPaint mPaint>
	//* 119  239:invokevirtual   #124 <Method LocaleList TextPaint.getTextLocales()>
	//* 120  242:aload_1         
	//* 121  243:invokevirtual   #99  <Method TextPaint getTextPaint()>
	//* 122  246:invokevirtual   #124 <Method LocaleList TextPaint.getTextLocales()>
	//* 123  249:invokevirtual   #127 <Method boolean LocaleList.equals(Object)>
	//* 124  252:ifne            287
					return false;
	//  125  255:iconst_0        
	//  126  256:ireturn         
			} else
			if(android.os.Build.VERSION.SDK_INT >= 17 && !mPaint.getTextLocale().equals(((Object) (((PrecomputedTextCompat$Params) (obj)).getTextPaint().getTextLocale()))))
	//* 127  257:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//* 128  260:bipush          17
	//* 129  262:icmplt          287
	//* 130  265:aload_0         
	//* 131  266:getfield        #37  <Field TextPaint mPaint>
	//* 132  269:invokevirtual   #131 <Method Locale TextPaint.getTextLocale()>
	//* 133  272:aload_1         
	//* 134  273:invokevirtual   #99  <Method TextPaint getTextPaint()>
	//* 135  276:invokevirtual   #131 <Method Locale TextPaint.getTextLocale()>
	//* 136  279:invokevirtual   #134 <Method boolean Locale.equals(Object)>
	//* 137  282:ifne            287
				return false;
	//  138  285:iconst_0        
	//  139  286:ireturn         
			if(mPaint.getTypeface() == null)
	//* 140  287:aload_0         
	//* 141  288:getfield        #37  <Field TextPaint mPaint>
	//* 142  291:invokevirtual   #138 <Method Typeface TextPaint.getTypeface()>
	//* 143  294:ifnonnull       309
			{
				if(((PrecomputedTextCompat$Params) (obj)).getTextPaint().getTypeface() != null)
	//* 144  297:aload_1         
	//* 145  298:invokevirtual   #99  <Method TextPaint getTextPaint()>
	//* 146  301:invokevirtual   #138 <Method Typeface TextPaint.getTypeface()>
	//* 147  304:ifnull          331
					return false;
	//  148  307:iconst_0        
	//  149  308:ireturn         
			} else
			if(!mPaint.getTypeface().equals(((Object) (((PrecomputedTextCompat$Params) (obj)).getTextPaint().getTypeface()))))
	//* 150  309:aload_0         
	//* 151  310:getfield        #37  <Field TextPaint mPaint>
	//* 152  313:invokevirtual   #138 <Method Typeface TextPaint.getTypeface()>
	//* 153  316:aload_1         
	//* 154  317:invokevirtual   #99  <Method TextPaint getTextPaint()>
	//* 155  320:invokevirtual   #138 <Method Typeface TextPaint.getTypeface()>
	//* 156  323:invokevirtual   #141 <Method boolean Typeface.equals(Object)>
	//* 157  326:ifne            331
				return false;
	//  158  329:iconst_0        
	//  159  330:ireturn         
			return true;
	//  160  331:iconst_1        
	//  161  332:ireturn         
		} else
		{
			return false;
	//  162  333:iconst_0        
	//  163  334:ireturn         
		}
	}

	public int getBreakStrategy()
	{
		return mBreakStrategy;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int mBreakStrategy>
	//    2    4:ireturn         
	}

	public int getHyphenationFrequency()
	{
		return mHyphenationFrequency;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int mHyphenationFrequency>
	//    2    4:ireturn         
	}

	public TextDirectionHeuristic getTextDirection()
	{
		return mTextDir;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field TextDirectionHeuristic mTextDir>
	//    2    4:areturn         
	}

	public TextPaint getTextPaint()
	{
		return mPaint;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field TextPaint mPaint>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          147
			return ObjectsCompat.hash(new Object[] {
				Float.valueOf(mPaint.getTextSize()), Float.valueOf(mPaint.getTextScaleX()), Float.valueOf(mPaint.getTextSkewX()), Float.valueOf(mPaint.getLetterSpacing()), Integer.valueOf(mPaint.getFlags()), mPaint.getTextLocales(), mPaint.getTypeface(), Boolean.valueOf(mPaint.isElegantTextHeight()), mTextDir, Integer.valueOf(mBreakStrategy), 
				Integer.valueOf(mHyphenationFrequency)
			});
	//    3    8:bipush          11
	//    4   10:anewarray       Object[]
	//    5   13:dup             
	//    6   14:iconst_0        
	//    7   15:aload_0         
	//    8   16:getfield        #37  <Field TextPaint mPaint>
	//    9   19:invokevirtual   #98  <Method float TextPaint.getTextSize()>
	//   10   22:invokestatic    #150 <Method Float Float.valueOf(float)>
	//   11   25:aastore         
	//   12   26:dup             
	//   13   27:iconst_1        
	//   14   28:aload_0         
	//   15   29:getfield        #37  <Field TextPaint mPaint>
	//   16   32:invokevirtual   #102 <Method float TextPaint.getTextScaleX()>
	//   17   35:invokestatic    #150 <Method Float Float.valueOf(float)>
	//   18   38:aastore         
	//   19   39:dup             
	//   20   40:iconst_2        
	//   21   41:aload_0         
	//   22   42:getfield        #37  <Field TextPaint mPaint>
	//   23   45:invokevirtual   #105 <Method float TextPaint.getTextSkewX()>
	//   24   48:invokestatic    #150 <Method Float Float.valueOf(float)>
	//   25   51:aastore         
	//   26   52:dup             
	//   27   53:iconst_3        
	//   28   54:aload_0         
	//   29   55:getfield        #37  <Field TextPaint mPaint>
	//   30   58:invokevirtual   #108 <Method float TextPaint.getLetterSpacing()>
	//   31   61:invokestatic    #150 <Method Float Float.valueOf(float)>
	//   32   64:aastore         
	//   33   65:dup             
	//   34   66:iconst_4        
	//   35   67:aload_0         
	//   36   68:getfield        #37  <Field TextPaint mPaint>
	//   37   71:invokevirtual   #120 <Method int TextPaint.getFlags()>
	//   38   74:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//   39   77:aastore         
	//   40   78:dup             
	//   41   79:iconst_5        
	//   42   80:aload_0         
	//   43   81:getfield        #37  <Field TextPaint mPaint>
	//   44   84:invokevirtual   #124 <Method LocaleList TextPaint.getTextLocales()>
	//   45   87:aastore         
	//   46   88:dup             
	//   47   89:bipush          6
	//   48   91:aload_0         
	//   49   92:getfield        #37  <Field TextPaint mPaint>
	//   50   95:invokevirtual   #138 <Method Typeface TextPaint.getTypeface()>
	//   51   98:aastore         
	//   52   99:dup             
	//   53  100:bipush          7
	//   54  102:aload_0         
	//   55  103:getfield        #37  <Field TextPaint mPaint>
	//   56  106:invokevirtual   #159 <Method boolean TextPaint.isElegantTextHeight()>
	//   57  109:invokestatic    #164 <Method Boolean Boolean.valueOf(boolean)>
	//   58  112:aastore         
	//   59  113:dup             
	//   60  114:bipush          8
	//   61  116:aload_0         
	//   62  117:getfield        #43  <Field TextDirectionHeuristic mTextDir>
	//   63  120:aastore         
	//   64  121:dup             
	//   65  122:bipush          9
	//   66  124:aload_0         
	//   67  125:getfield        #49  <Field int mBreakStrategy>
	//   68  128:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//   69  131:aastore         
	//   70  132:dup             
	//   71  133:bipush          10
	//   72  135:aload_0         
	//   73  136:getfield        #54  <Field int mHyphenationFrequency>
	//   74  139:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//   75  142:aastore         
	//   76  143:invokestatic    #170 <Method int ObjectsCompat.hash(Object[])>
	//   77  146:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  78  147:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//*  79  150:bipush          21
	//*  80  152:icmplt          294
			return ObjectsCompat.hash(new Object[] {
				Float.valueOf(mPaint.getTextSize()), Float.valueOf(mPaint.getTextScaleX()), Float.valueOf(mPaint.getTextSkewX()), Float.valueOf(mPaint.getLetterSpacing()), Integer.valueOf(mPaint.getFlags()), mPaint.getTextLocale(), mPaint.getTypeface(), Boolean.valueOf(mPaint.isElegantTextHeight()), mTextDir, Integer.valueOf(mBreakStrategy), 
				Integer.valueOf(mHyphenationFrequency)
			});
	//   81  155:bipush          11
	//   82  157:anewarray       Object[]
	//   83  160:dup             
	//   84  161:iconst_0        
	//   85  162:aload_0         
	//   86  163:getfield        #37  <Field TextPaint mPaint>
	//   87  166:invokevirtual   #98  <Method float TextPaint.getTextSize()>
	//   88  169:invokestatic    #150 <Method Float Float.valueOf(float)>
	//   89  172:aastore         
	//   90  173:dup             
	//   91  174:iconst_1        
	//   92  175:aload_0         
	//   93  176:getfield        #37  <Field TextPaint mPaint>
	//   94  179:invokevirtual   #102 <Method float TextPaint.getTextScaleX()>
	//   95  182:invokestatic    #150 <Method Float Float.valueOf(float)>
	//   96  185:aastore         
	//   97  186:dup             
	//   98  187:iconst_2        
	//   99  188:aload_0         
	//  100  189:getfield        #37  <Field TextPaint mPaint>
	//  101  192:invokevirtual   #105 <Method float TextPaint.getTextSkewX()>
	//  102  195:invokestatic    #150 <Method Float Float.valueOf(float)>
	//  103  198:aastore         
	//  104  199:dup             
	//  105  200:iconst_3        
	//  106  201:aload_0         
	//  107  202:getfield        #37  <Field TextPaint mPaint>
	//  108  205:invokevirtual   #108 <Method float TextPaint.getLetterSpacing()>
	//  109  208:invokestatic    #150 <Method Float Float.valueOf(float)>
	//  110  211:aastore         
	//  111  212:dup             
	//  112  213:iconst_4        
	//  113  214:aload_0         
	//  114  215:getfield        #37  <Field TextPaint mPaint>
	//  115  218:invokevirtual   #120 <Method int TextPaint.getFlags()>
	//  116  221:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//  117  224:aastore         
	//  118  225:dup             
	//  119  226:iconst_5        
	//  120  227:aload_0         
	//  121  228:getfield        #37  <Field TextPaint mPaint>
	//  122  231:invokevirtual   #131 <Method Locale TextPaint.getTextLocale()>
	//  123  234:aastore         
	//  124  235:dup             
	//  125  236:bipush          6
	//  126  238:aload_0         
	//  127  239:getfield        #37  <Field TextPaint mPaint>
	//  128  242:invokevirtual   #138 <Method Typeface TextPaint.getTypeface()>
	//  129  245:aastore         
	//  130  246:dup             
	//  131  247:bipush          7
	//  132  249:aload_0         
	//  133  250:getfield        #37  <Field TextPaint mPaint>
	//  134  253:invokevirtual   #159 <Method boolean TextPaint.isElegantTextHeight()>
	//  135  256:invokestatic    #164 <Method Boolean Boolean.valueOf(boolean)>
	//  136  259:aastore         
	//  137  260:dup             
	//  138  261:bipush          8
	//  139  263:aload_0         
	//  140  264:getfield        #43  <Field TextDirectionHeuristic mTextDir>
	//  141  267:aastore         
	//  142  268:dup             
	//  143  269:bipush          9
	//  144  271:aload_0         
	//  145  272:getfield        #49  <Field int mBreakStrategy>
	//  146  275:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//  147  278:aastore         
	//  148  279:dup             
	//  149  280:bipush          10
	//  150  282:aload_0         
	//  151  283:getfield        #54  <Field int mHyphenationFrequency>
	//  152  286:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//  153  289:aastore         
	//  154  290:invokestatic    #170 <Method int ObjectsCompat.hash(Object[])>
	//  155  293:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//* 156  294:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//* 157  297:bipush          18
	//* 158  299:icmplt          413
			return ObjectsCompat.hash(new Object[] {
				Float.valueOf(mPaint.getTextSize()), Float.valueOf(mPaint.getTextScaleX()), Float.valueOf(mPaint.getTextSkewX()), Integer.valueOf(mPaint.getFlags()), mPaint.getTextLocale(), mPaint.getTypeface(), mTextDir, Integer.valueOf(mBreakStrategy), Integer.valueOf(mHyphenationFrequency)
			});
	//  159  302:bipush          9
	//  160  304:anewarray       Object[]
	//  161  307:dup             
	//  162  308:iconst_0        
	//  163  309:aload_0         
	//  164  310:getfield        #37  <Field TextPaint mPaint>
	//  165  313:invokevirtual   #98  <Method float TextPaint.getTextSize()>
	//  166  316:invokestatic    #150 <Method Float Float.valueOf(float)>
	//  167  319:aastore         
	//  168  320:dup             
	//  169  321:iconst_1        
	//  170  322:aload_0         
	//  171  323:getfield        #37  <Field TextPaint mPaint>
	//  172  326:invokevirtual   #102 <Method float TextPaint.getTextScaleX()>
	//  173  329:invokestatic    #150 <Method Float Float.valueOf(float)>
	//  174  332:aastore         
	//  175  333:dup             
	//  176  334:iconst_2        
	//  177  335:aload_0         
	//  178  336:getfield        #37  <Field TextPaint mPaint>
	//  179  339:invokevirtual   #105 <Method float TextPaint.getTextSkewX()>
	//  180  342:invokestatic    #150 <Method Float Float.valueOf(float)>
	//  181  345:aastore         
	//  182  346:dup             
	//  183  347:iconst_3        
	//  184  348:aload_0         
	//  185  349:getfield        #37  <Field TextPaint mPaint>
	//  186  352:invokevirtual   #120 <Method int TextPaint.getFlags()>
	//  187  355:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//  188  358:aastore         
	//  189  359:dup             
	//  190  360:iconst_4        
	//  191  361:aload_0         
	//  192  362:getfield        #37  <Field TextPaint mPaint>
	//  193  365:invokevirtual   #131 <Method Locale TextPaint.getTextLocale()>
	//  194  368:aastore         
	//  195  369:dup             
	//  196  370:iconst_5        
	//  197  371:aload_0         
	//  198  372:getfield        #37  <Field TextPaint mPaint>
	//  199  375:invokevirtual   #138 <Method Typeface TextPaint.getTypeface()>
	//  200  378:aastore         
	//  201  379:dup             
	//  202  380:bipush          6
	//  203  382:aload_0         
	//  204  383:getfield        #43  <Field TextDirectionHeuristic mTextDir>
	//  205  386:aastore         
	//  206  387:dup             
	//  207  388:bipush          7
	//  208  390:aload_0         
	//  209  391:getfield        #49  <Field int mBreakStrategy>
	//  210  394:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//  211  397:aastore         
	//  212  398:dup             
	//  213  399:bipush          8
	//  214  401:aload_0         
	//  215  402:getfield        #54  <Field int mHyphenationFrequency>
	//  216  405:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//  217  408:aastore         
	//  218  409:invokestatic    #170 <Method int ObjectsCompat.hash(Object[])>
	//  219  412:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//* 220  413:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//* 221  416:bipush          17
	//* 222  418:icmplt          532
			return ObjectsCompat.hash(new Object[] {
				Float.valueOf(mPaint.getTextSize()), Float.valueOf(mPaint.getTextScaleX()), Float.valueOf(mPaint.getTextSkewX()), Integer.valueOf(mPaint.getFlags()), mPaint.getTextLocale(), mPaint.getTypeface(), mTextDir, Integer.valueOf(mBreakStrategy), Integer.valueOf(mHyphenationFrequency)
			});
	//  223  421:bipush          9
	//  224  423:anewarray       Object[]
	//  225  426:dup             
	//  226  427:iconst_0        
	//  227  428:aload_0         
	//  228  429:getfield        #37  <Field TextPaint mPaint>
	//  229  432:invokevirtual   #98  <Method float TextPaint.getTextSize()>
	//  230  435:invokestatic    #150 <Method Float Float.valueOf(float)>
	//  231  438:aastore         
	//  232  439:dup             
	//  233  440:iconst_1        
	//  234  441:aload_0         
	//  235  442:getfield        #37  <Field TextPaint mPaint>
	//  236  445:invokevirtual   #102 <Method float TextPaint.getTextScaleX()>
	//  237  448:invokestatic    #150 <Method Float Float.valueOf(float)>
	//  238  451:aastore         
	//  239  452:dup             
	//  240  453:iconst_2        
	//  241  454:aload_0         
	//  242  455:getfield        #37  <Field TextPaint mPaint>
	//  243  458:invokevirtual   #105 <Method float TextPaint.getTextSkewX()>
	//  244  461:invokestatic    #150 <Method Float Float.valueOf(float)>
	//  245  464:aastore         
	//  246  465:dup             
	//  247  466:iconst_3        
	//  248  467:aload_0         
	//  249  468:getfield        #37  <Field TextPaint mPaint>
	//  250  471:invokevirtual   #120 <Method int TextPaint.getFlags()>
	//  251  474:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//  252  477:aastore         
	//  253  478:dup             
	//  254  479:iconst_4        
	//  255  480:aload_0         
	//  256  481:getfield        #37  <Field TextPaint mPaint>
	//  257  484:invokevirtual   #131 <Method Locale TextPaint.getTextLocale()>
	//  258  487:aastore         
	//  259  488:dup             
	//  260  489:iconst_5        
	//  261  490:aload_0         
	//  262  491:getfield        #37  <Field TextPaint mPaint>
	//  263  494:invokevirtual   #138 <Method Typeface TextPaint.getTypeface()>
	//  264  497:aastore         
	//  265  498:dup             
	//  266  499:bipush          6
	//  267  501:aload_0         
	//  268  502:getfield        #43  <Field TextDirectionHeuristic mTextDir>
	//  269  505:aastore         
	//  270  506:dup             
	//  271  507:bipush          7
	//  272  509:aload_0         
	//  273  510:getfield        #49  <Field int mBreakStrategy>
	//  274  513:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//  275  516:aastore         
	//  276  517:dup             
	//  277  518:bipush          8
	//  278  520:aload_0         
	//  279  521:getfield        #54  <Field int mHyphenationFrequency>
	//  280  524:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//  281  527:aastore         
	//  282  528:invokestatic    #170 <Method int ObjectsCompat.hash(Object[])>
	//  283  531:ireturn         
		else
			return ObjectsCompat.hash(new Object[] {
				Float.valueOf(mPaint.getTextSize()), Float.valueOf(mPaint.getTextScaleX()), Float.valueOf(mPaint.getTextSkewX()), Integer.valueOf(mPaint.getFlags()), mPaint.getTypeface(), mTextDir, Integer.valueOf(mBreakStrategy), Integer.valueOf(mHyphenationFrequency)
			});
	//  284  532:bipush          8
	//  285  534:anewarray       Object[]
	//  286  537:dup             
	//  287  538:iconst_0        
	//  288  539:aload_0         
	//  289  540:getfield        #37  <Field TextPaint mPaint>
	//  290  543:invokevirtual   #98  <Method float TextPaint.getTextSize()>
	//  291  546:invokestatic    #150 <Method Float Float.valueOf(float)>
	//  292  549:aastore         
	//  293  550:dup             
	//  294  551:iconst_1        
	//  295  552:aload_0         
	//  296  553:getfield        #37  <Field TextPaint mPaint>
	//  297  556:invokevirtual   #102 <Method float TextPaint.getTextScaleX()>
	//  298  559:invokestatic    #150 <Method Float Float.valueOf(float)>
	//  299  562:aastore         
	//  300  563:dup             
	//  301  564:iconst_2        
	//  302  565:aload_0         
	//  303  566:getfield        #37  <Field TextPaint mPaint>
	//  304  569:invokevirtual   #105 <Method float TextPaint.getTextSkewX()>
	//  305  572:invokestatic    #150 <Method Float Float.valueOf(float)>
	//  306  575:aastore         
	//  307  576:dup             
	//  308  577:iconst_3        
	//  309  578:aload_0         
	//  310  579:getfield        #37  <Field TextPaint mPaint>
	//  311  582:invokevirtual   #120 <Method int TextPaint.getFlags()>
	//  312  585:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//  313  588:aastore         
	//  314  589:dup             
	//  315  590:iconst_4        
	//  316  591:aload_0         
	//  317  592:getfield        #37  <Field TextPaint mPaint>
	//  318  595:invokevirtual   #138 <Method Typeface TextPaint.getTypeface()>
	//  319  598:aastore         
	//  320  599:dup             
	//  321  600:iconst_5        
	//  322  601:aload_0         
	//  323  602:getfield        #43  <Field TextDirectionHeuristic mTextDir>
	//  324  605:aastore         
	//  325  606:dup             
	//  326  607:bipush          6
	//  327  609:aload_0         
	//  328  610:getfield        #49  <Field int mBreakStrategy>
	//  329  613:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//  330  616:aastore         
	//  331  617:dup             
	//  332  618:bipush          7
	//  333  620:aload_0         
	//  334  621:getfield        #54  <Field int mHyphenationFrequency>
	//  335  624:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//  336  627:aastore         
	//  337  628:invokestatic    #170 <Method int ObjectsCompat.hash(Object[])>
	//  338  631:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("{");
	//    0    0:new             #173 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #175 <String "{">
	//    3    6:invokespecial   #178 <Method void StringBuilder(String)>
	//    4    9:astore_1        
		StringBuilder stringbuilder1 = new StringBuilder();
	//    5   10:new             #173 <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #179 <Method void StringBuilder()>
	//    8   17:astore_2        
		stringbuilder1.append("textSize=");
	//    9   18:aload_2         
	//   10   19:ldc1            #181 <String "textSize=">
	//   11   21:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder1.append(mPaint.getTextSize());
	//   13   25:aload_2         
	//   14   26:aload_0         
	//   15   27:getfield        #37  <Field TextPaint mPaint>
	//   16   30:invokevirtual   #98  <Method float TextPaint.getTextSize()>
	//   17   33:invokevirtual   #188 <Method StringBuilder StringBuilder.append(float)>
	//   18   36:pop             
		stringbuilder.append(stringbuilder1.toString());
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:invokevirtual   #190 <Method String StringBuilder.toString()>
	//   22   42:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
		stringbuilder1 = new StringBuilder();
	//   24   46:new             #173 <Class StringBuilder>
	//   25   49:dup             
	//   26   50:invokespecial   #179 <Method void StringBuilder()>
	//   27   53:astore_2        
		stringbuilder1.append(", textScaleX=");
	//   28   54:aload_2         
	//   29   55:ldc1            #192 <String ", textScaleX=">
	//   30   57:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   31   60:pop             
		stringbuilder1.append(mPaint.getTextScaleX());
	//   32   61:aload_2         
	//   33   62:aload_0         
	//   34   63:getfield        #37  <Field TextPaint mPaint>
	//   35   66:invokevirtual   #102 <Method float TextPaint.getTextScaleX()>
	//   36   69:invokevirtual   #188 <Method StringBuilder StringBuilder.append(float)>
	//   37   72:pop             
		stringbuilder.append(stringbuilder1.toString());
	//   38   73:aload_1         
	//   39   74:aload_2         
	//   40   75:invokevirtual   #190 <Method String StringBuilder.toString()>
	//   41   78:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   42   81:pop             
		stringbuilder1 = new StringBuilder();
	//   43   82:new             #173 <Class StringBuilder>
	//   44   85:dup             
	//   45   86:invokespecial   #179 <Method void StringBuilder()>
	//   46   89:astore_2        
		stringbuilder1.append(", textSkewX=");
	//   47   90:aload_2         
	//   48   91:ldc1            #194 <String ", textSkewX=">
	//   49   93:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   50   96:pop             
		stringbuilder1.append(mPaint.getTextSkewX());
	//   51   97:aload_2         
	//   52   98:aload_0         
	//   53   99:getfield        #37  <Field TextPaint mPaint>
	//   54  102:invokevirtual   #105 <Method float TextPaint.getTextSkewX()>
	//   55  105:invokevirtual   #188 <Method StringBuilder StringBuilder.append(float)>
	//   56  108:pop             
		stringbuilder.append(stringbuilder1.toString());
	//   57  109:aload_1         
	//   58  110:aload_2         
	//   59  111:invokevirtual   #190 <Method String StringBuilder.toString()>
	//   60  114:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   61  117:pop             
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  62  118:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//*  63  121:bipush          21
	//*  64  123:icmplt          198
		{
			stringbuilder1 = new StringBuilder();
	//   65  126:new             #173 <Class StringBuilder>
	//   66  129:dup             
	//   67  130:invokespecial   #179 <Method void StringBuilder()>
	//   68  133:astore_2        
			stringbuilder1.append(", letterSpacing=");
	//   69  134:aload_2         
	//   70  135:ldc1            #196 <String ", letterSpacing=">
	//   71  137:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   72  140:pop             
			stringbuilder1.append(mPaint.getLetterSpacing());
	//   73  141:aload_2         
	//   74  142:aload_0         
	//   75  143:getfield        #37  <Field TextPaint mPaint>
	//   76  146:invokevirtual   #108 <Method float TextPaint.getLetterSpacing()>
	//   77  149:invokevirtual   #188 <Method StringBuilder StringBuilder.append(float)>
	//   78  152:pop             
			stringbuilder.append(stringbuilder1.toString());
	//   79  153:aload_1         
	//   80  154:aload_2         
	//   81  155:invokevirtual   #190 <Method String StringBuilder.toString()>
	//   82  158:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   83  161:pop             
			stringbuilder1 = new StringBuilder();
	//   84  162:new             #173 <Class StringBuilder>
	//   85  165:dup             
	//   86  166:invokespecial   #179 <Method void StringBuilder()>
	//   87  169:astore_2        
			stringbuilder1.append(", elegantTextHeight=");
	//   88  170:aload_2         
	//   89  171:ldc1            #198 <String ", elegantTextHeight=">
	//   90  173:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   91  176:pop             
			stringbuilder1.append(mPaint.isElegantTextHeight());
	//   92  177:aload_2         
	//   93  178:aload_0         
	//   94  179:getfield        #37  <Field TextPaint mPaint>
	//   95  182:invokevirtual   #159 <Method boolean TextPaint.isElegantTextHeight()>
	//   96  185:invokevirtual   #201 <Method StringBuilder StringBuilder.append(boolean)>
	//   97  188:pop             
			stringbuilder.append(stringbuilder1.toString());
	//   98  189:aload_1         
	//   99  190:aload_2         
	//  100  191:invokevirtual   #190 <Method String StringBuilder.toString()>
	//  101  194:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  102  197:pop             
		}
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//* 103  198:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//* 104  201:bipush          24
	//* 105  203:icmplt          245
		{
			stringbuilder1 = new StringBuilder();
	//  106  206:new             #173 <Class StringBuilder>
	//  107  209:dup             
	//  108  210:invokespecial   #179 <Method void StringBuilder()>
	//  109  213:astore_2        
			stringbuilder1.append(", textLocale=");
	//  110  214:aload_2         
	//  111  215:ldc1            #203 <String ", textLocale=">
	//  112  217:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  113  220:pop             
			stringbuilder1.append(((Object) (mPaint.getTextLocales())));
	//  114  221:aload_2         
	//  115  222:aload_0         
	//  116  223:getfield        #37  <Field TextPaint mPaint>
	//  117  226:invokevirtual   #124 <Method LocaleList TextPaint.getTextLocales()>
	//  118  229:invokevirtual   #206 <Method StringBuilder StringBuilder.append(Object)>
	//  119  232:pop             
			stringbuilder.append(stringbuilder1.toString());
	//  120  233:aload_1         
	//  121  234:aload_2         
	//  122  235:invokevirtual   #190 <Method String StringBuilder.toString()>
	//  123  238:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  124  241:pop             
		} else
	//* 125  242:goto            289
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//* 126  245:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//* 127  248:bipush          17
	//* 128  250:icmplt          289
		{
			stringbuilder1 = new StringBuilder();
	//  129  253:new             #173 <Class StringBuilder>
	//  130  256:dup             
	//  131  257:invokespecial   #179 <Method void StringBuilder()>
	//  132  260:astore_2        
			stringbuilder1.append(", textLocale=");
	//  133  261:aload_2         
	//  134  262:ldc1            #203 <String ", textLocale=">
	//  135  264:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  136  267:pop             
			stringbuilder1.append(((Object) (mPaint.getTextLocale())));
	//  137  268:aload_2         
	//  138  269:aload_0         
	//  139  270:getfield        #37  <Field TextPaint mPaint>
	//  140  273:invokevirtual   #131 <Method Locale TextPaint.getTextLocale()>
	//  141  276:invokevirtual   #206 <Method StringBuilder StringBuilder.append(Object)>
	//  142  279:pop             
			stringbuilder.append(stringbuilder1.toString());
	//  143  280:aload_1         
	//  144  281:aload_2         
	//  145  282:invokevirtual   #190 <Method String StringBuilder.toString()>
	//  146  285:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  147  288:pop             
		}
		stringbuilder1 = new StringBuilder();
	//  148  289:new             #173 <Class StringBuilder>
	//  149  292:dup             
	//  150  293:invokespecial   #179 <Method void StringBuilder()>
	//  151  296:astore_2        
		stringbuilder1.append(", typeface=");
	//  152  297:aload_2         
	//  153  298:ldc1            #208 <String ", typeface=">
	//  154  300:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  155  303:pop             
		stringbuilder1.append(((Object) (mPaint.getTypeface())));
	//  156  304:aload_2         
	//  157  305:aload_0         
	//  158  306:getfield        #37  <Field TextPaint mPaint>
	//  159  309:invokevirtual   #138 <Method Typeface TextPaint.getTypeface()>
	//  160  312:invokevirtual   #206 <Method StringBuilder StringBuilder.append(Object)>
	//  161  315:pop             
		stringbuilder.append(stringbuilder1.toString());
	//  162  316:aload_1         
	//  163  317:aload_2         
	//  164  318:invokevirtual   #190 <Method String StringBuilder.toString()>
	//  165  321:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  166  324:pop             
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//* 167  325:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//* 168  328:bipush          26
	//* 169  330:icmplt          369
		{
			stringbuilder1 = new StringBuilder();
	//  170  333:new             #173 <Class StringBuilder>
	//  171  336:dup             
	//  172  337:invokespecial   #179 <Method void StringBuilder()>
	//  173  340:astore_2        
			stringbuilder1.append(", variationSettings=");
	//  174  341:aload_2         
	//  175  342:ldc1            #210 <String ", variationSettings=">
	//  176  344:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  177  347:pop             
			stringbuilder1.append(mPaint.getFontVariationSettings());
	//  178  348:aload_2         
	//  179  349:aload_0         
	//  180  350:getfield        #37  <Field TextPaint mPaint>
	//  181  353:invokevirtual   #213 <Method String TextPaint.getFontVariationSettings()>
	//  182  356:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  183  359:pop             
			stringbuilder.append(stringbuilder1.toString());
	//  184  360:aload_1         
	//  185  361:aload_2         
	//  186  362:invokevirtual   #190 <Method String StringBuilder.toString()>
	//  187  365:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  188  368:pop             
		}
		stringbuilder1 = new StringBuilder();
	//  189  369:new             #173 <Class StringBuilder>
	//  190  372:dup             
	//  191  373:invokespecial   #179 <Method void StringBuilder()>
	//  192  376:astore_2        
		stringbuilder1.append(", textDir=");
	//  193  377:aload_2         
	//  194  378:ldc1            #215 <String ", textDir=">
	//  195  380:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  196  383:pop             
		stringbuilder1.append(((Object) (mTextDir)));
	//  197  384:aload_2         
	//  198  385:aload_0         
	//  199  386:getfield        #43  <Field TextDirectionHeuristic mTextDir>
	//  200  389:invokevirtual   #206 <Method StringBuilder StringBuilder.append(Object)>
	//  201  392:pop             
		stringbuilder.append(stringbuilder1.toString());
	//  202  393:aload_1         
	//  203  394:aload_2         
	//  204  395:invokevirtual   #190 <Method String StringBuilder.toString()>
	//  205  398:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  206  401:pop             
		stringbuilder1 = new StringBuilder();
	//  207  402:new             #173 <Class StringBuilder>
	//  208  405:dup             
	//  209  406:invokespecial   #179 <Method void StringBuilder()>
	//  210  409:astore_2        
		stringbuilder1.append(", breakStrategy=");
	//  211  410:aload_2         
	//  212  411:ldc1            #217 <String ", breakStrategy=">
	//  213  413:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  214  416:pop             
		stringbuilder1.append(mBreakStrategy);
	//  215  417:aload_2         
	//  216  418:aload_0         
	//  217  419:getfield        #49  <Field int mBreakStrategy>
	//  218  422:invokevirtual   #220 <Method StringBuilder StringBuilder.append(int)>
	//  219  425:pop             
		stringbuilder.append(stringbuilder1.toString());
	//  220  426:aload_1         
	//  221  427:aload_2         
	//  222  428:invokevirtual   #190 <Method String StringBuilder.toString()>
	//  223  431:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  224  434:pop             
		stringbuilder1 = new StringBuilder();
	//  225  435:new             #173 <Class StringBuilder>
	//  226  438:dup             
	//  227  439:invokespecial   #179 <Method void StringBuilder()>
	//  228  442:astore_2        
		stringbuilder1.append(", hyphenationFrequency=");
	//  229  443:aload_2         
	//  230  444:ldc1            #222 <String ", hyphenationFrequency=">
	//  231  446:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  232  449:pop             
		stringbuilder1.append(mHyphenationFrequency);
	//  233  450:aload_2         
	//  234  451:aload_0         
	//  235  452:getfield        #54  <Field int mHyphenationFrequency>
	//  236  455:invokevirtual   #220 <Method StringBuilder StringBuilder.append(int)>
	//  237  458:pop             
		stringbuilder.append(stringbuilder1.toString());
	//  238  459:aload_1         
	//  239  460:aload_2         
	//  240  461:invokevirtual   #190 <Method String StringBuilder.toString()>
	//  241  464:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  242  467:pop             
		stringbuilder.append("}");
	//  243  468:aload_1         
	//  244  469:ldc1            #224 <String "}">
	//  245  471:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  246  474:pop             
		return stringbuilder.toString();
	//  247  475:aload_1         
	//  248  476:invokevirtual   #190 <Method String StringBuilder.toString()>
	//  249  479:areturn         
	}

	private final int mBreakStrategy;
	private final int mHyphenationFrequency;
	private final TextPaint mPaint;
	private final TextDirectionHeuristic mTextDir;
	final android.text.PrecomputedText.Params mWrapped;

	public PrecomputedTextCompat$Params(android.text.PrecomputedText.Params params)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		mPaint = params.getTextPaint();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #35  <Method TextPaint android.text.PrecomputedText$Params.getTextPaint()>
	//    5    9:putfield        #37  <Field TextPaint mPaint>
		mTextDir = params.getTextDirection();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #41  <Method TextDirectionHeuristic android.text.PrecomputedText$Params.getTextDirection()>
	//    9   17:putfield        #43  <Field TextDirectionHeuristic mTextDir>
		mBreakStrategy = params.getBreakStrategy();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #47  <Method int android.text.PrecomputedText$Params.getBreakStrategy()>
	//   13   25:putfield        #49  <Field int mBreakStrategy>
		mHyphenationFrequency = params.getHyphenationFrequency();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #52  <Method int android.text.PrecomputedText$Params.getHyphenationFrequency()>
	//   17   33:putfield        #54  <Field int mHyphenationFrequency>
		mWrapped = params;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:putfield        #56  <Field android.text.PrecomputedText$Params mWrapped>
	//   21   41:return          
	}

	PrecomputedTextCompat$Params(TextPaint textpaint, TextDirectionHeuristic textdirectionheuristic, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   2    4:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          28
	//*   4    9:icmplt          43
			mWrapped = (new android.text.r(textpaint)).setBreakStrategy(i).setHyphenationFrequency(j).setTextDirection(textdirectionheuristic).build();
	//    5   12:aload_0         
	//    6   13:new             #67  <Class android.text.PrecomputedText$Params$Builder>
	//    7   16:dup             
	//    8   17:aload_1         
	//    9   18:invokespecial   #70  <Method void android.text.PrecomputedText$Params$Builder(TextPaint)>
	//   10   21:iload_3         
	//   11   22:invokevirtual   #74  <Method android.text.PrecomputedText$Params$Builder android.text.PrecomputedText$Params$Builder.setBreakStrategy(int)>
	//   12   25:iload           4
	//   13   27:invokevirtual   #77  <Method android.text.PrecomputedText$Params$Builder android.text.PrecomputedText$Params$Builder.setHyphenationFrequency(int)>
	//   14   30:aload_2         
	//   15   31:invokevirtual   #81  <Method android.text.PrecomputedText$Params$Builder android.text.PrecomputedText$Params$Builder.setTextDirection(TextDirectionHeuristic)>
	//   16   34:invokevirtual   #85  <Method android.text.PrecomputedText$Params android.text.PrecomputedText$Params$Builder.build()>
	//   17   37:putfield        #56  <Field android.text.PrecomputedText$Params mWrapped>
		else
	//*  18   40:goto            48
			mWrapped = null;
	//   19   43:aload_0         
	//   20   44:aconst_null     
	//   21   45:putfield        #56  <Field android.text.PrecomputedText$Params mWrapped>
		mPaint = textpaint;
	//   22   48:aload_0         
	//   23   49:aload_1         
	//   24   50:putfield        #37  <Field TextPaint mPaint>
		mTextDir = textdirectionheuristic;
	//   25   53:aload_0         
	//   26   54:aload_2         
	//   27   55:putfield        #43  <Field TextDirectionHeuristic mTextDir>
		mBreakStrategy = i;
	//   28   58:aload_0         
	//   29   59:iload_3         
	//   30   60:putfield        #49  <Field int mBreakStrategy>
		mHyphenationFrequency = j;
	//   31   63:aload_0         
	//   32   64:iload           4
	//   33   66:putfield        #54  <Field int mHyphenationFrequency>
	//   34   69:return          
	}
}
