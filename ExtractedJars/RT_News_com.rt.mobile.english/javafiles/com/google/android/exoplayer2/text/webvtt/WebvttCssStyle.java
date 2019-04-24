// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Annotation;
import java.util.*;

public final class WebvttCssStyle
{
	public static interface FontSizeUnit
		extends Annotation
	{
	}

	public static interface StyleFlags
		extends Annotation
	{
	}


	public WebvttCssStyle()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
		reset();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #55  <Method void reset()>
	//    4    8:return          
	}

	private static int updateScoreForMatch(int i, String s, String s1, int j)
	{
		if(!s.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #64  <Method boolean String.isEmpty()>
	//*   2    4:ifne            33
		{
			int k = -1;
	//    3    7:iconst_m1       
	//    4    8:istore          4
			if(i == -1)
	//*   5   10:iload_0         
	//*   6   11:iconst_m1       
	//*   7   12:icmpne          17
				return i;
	//    8   15:iload_0         
	//    9   16:ireturn         
			if(s.equals(((Object) (s1))))
	//*  10   17:aload_1         
	//*  11   18:aload_2         
	//*  12   19:invokevirtual   #68  <Method boolean String.equals(Object)>
	//*  13   22:ifeq            30
				k = i + j;
	//   14   25:iload_0         
	//   15   26:iload_3         
	//   16   27:iadd            
	//   17   28:istore          4
			return k;
	//   18   30:iload           4
	//   19   32:ireturn         
		} else
		{
			return i;
	//   20   33:iload_0         
	//   21   34:ireturn         
		}
	}

	public void cascadeFrom(WebvttCssStyle webvttcssstyle)
	{
		if(webvttcssstyle.hasFontColor)
	//*   0    0:aload_1         
	//*   1    1:getfield        #72  <Field boolean hasFontColor>
	//*   2    4:ifeq            16
			setFontColor(webvttcssstyle.fontColor);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:getfield        #74  <Field int fontColor>
	//    6   12:invokevirtual   #78  <Method WebvttCssStyle setFontColor(int)>
	//    7   15:pop             
		if(webvttcssstyle.bold != -1)
	//*   8   16:aload_1         
	//*   9   17:getfield        #80  <Field int bold>
	//*  10   20:iconst_m1       
	//*  11   21:icmpeq          32
			bold = webvttcssstyle.bold;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getfield        #80  <Field int bold>
	//   15   29:putfield        #80  <Field int bold>
		if(webvttcssstyle.italic != -1)
	//*  16   32:aload_1         
	//*  17   33:getfield        #82  <Field int italic>
	//*  18   36:iconst_m1       
	//*  19   37:icmpeq          48
			italic = webvttcssstyle.italic;
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:getfield        #82  <Field int italic>
	//   23   45:putfield        #82  <Field int italic>
		if(webvttcssstyle.fontFamily != null)
	//*  24   48:aload_1         
	//*  25   49:getfield        #84  <Field String fontFamily>
	//*  26   52:ifnull          63
			fontFamily = webvttcssstyle.fontFamily;
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:getfield        #84  <Field String fontFamily>
	//   30   60:putfield        #84  <Field String fontFamily>
		if(linethrough == -1)
	//*  31   63:aload_0         
	//*  32   64:getfield        #86  <Field int linethrough>
	//*  33   67:iconst_m1       
	//*  34   68:icmpne          79
			linethrough = webvttcssstyle.linethrough;
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:getfield        #86  <Field int linethrough>
	//   38   76:putfield        #86  <Field int linethrough>
		if(underline == -1)
	//*  39   79:aload_0         
	//*  40   80:getfield        #88  <Field int underline>
	//*  41   83:iconst_m1       
	//*  42   84:icmpne          95
			underline = webvttcssstyle.underline;
	//   43   87:aload_0         
	//   44   88:aload_1         
	//   45   89:getfield        #88  <Field int underline>
	//   46   92:putfield        #88  <Field int underline>
		if(textAlign == null)
	//*  47   95:aload_0         
	//*  48   96:getfield        #90  <Field android.text.Layout$Alignment textAlign>
	//*  49   99:ifnonnull       110
			textAlign = webvttcssstyle.textAlign;
	//   50  102:aload_0         
	//   51  103:aload_1         
	//   52  104:getfield        #90  <Field android.text.Layout$Alignment textAlign>
	//   53  107:putfield        #90  <Field android.text.Layout$Alignment textAlign>
		if(fontSizeUnit == -1)
	//*  54  110:aload_0         
	//*  55  111:getfield        #92  <Field int fontSizeUnit>
	//*  56  114:iconst_m1       
	//*  57  115:icmpne          134
		{
			fontSizeUnit = webvttcssstyle.fontSizeUnit;
	//   58  118:aload_0         
	//   59  119:aload_1         
	//   60  120:getfield        #92  <Field int fontSizeUnit>
	//   61  123:putfield        #92  <Field int fontSizeUnit>
			fontSize = webvttcssstyle.fontSize;
	//   62  126:aload_0         
	//   63  127:aload_1         
	//   64  128:getfield        #94  <Field float fontSize>
	//   65  131:putfield        #94  <Field float fontSize>
		}
		if(webvttcssstyle.hasBackgroundColor)
	//*  66  134:aload_1         
	//*  67  135:getfield        #96  <Field boolean hasBackgroundColor>
	//*  68  138:ifeq            150
			setBackgroundColor(webvttcssstyle.backgroundColor);
	//   69  141:aload_0         
	//   70  142:aload_1         
	//   71  143:getfield        #98  <Field int backgroundColor>
	//   72  146:invokevirtual   #101 <Method WebvttCssStyle setBackgroundColor(int)>
	//   73  149:pop             
	//   74  150:return          
	}

	public int getBackgroundColor()
	{
		if(!hasBackgroundColor)
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field boolean hasBackgroundColor>
	//*   2    4:ifne            17
			throw new IllegalStateException("Background color not defined.");
	//    3    7:new             #105 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #107 <String "Background color not defined.">
	//    6   13:invokespecial   #110 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		else
			return backgroundColor;
	//    8   17:aload_0         
	//    9   18:getfield        #98  <Field int backgroundColor>
	//   10   21:ireturn         
	}

	public int getFontColor()
	{
		if(!hasFontColor)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field boolean hasFontColor>
	//*   2    4:ifne            17
			throw new IllegalStateException("Font color not defined");
	//    3    7:new             #105 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #113 <String "Font color not defined">
	//    6   13:invokespecial   #110 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		else
			return fontColor;
	//    8   17:aload_0         
	//    9   18:getfield        #74  <Field int fontColor>
	//   10   21:ireturn         
	}

	public String getFontFamily()
	{
		return fontFamily;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field String fontFamily>
	//    2    4:areturn         
	}

	public float getFontSize()
	{
		return fontSize;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field float fontSize>
	//    2    4:freturn         
	}

	public int getFontSizeUnit()
	{
		return fontSizeUnit;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field int fontSizeUnit>
	//    2    4:ireturn         
	}

	public int getSpecificityScore(String s, String s1, String as[], String s2)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #122 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #124 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #127 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public int getStyle()
	{
		if(bold == -1 && italic == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field int bold>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          18
	//*   4    8:aload_0         
	//*   5    9:getfield        #82  <Field int italic>
	//*   6   12:iconst_m1       
	//*   7   13:icmpne          18
			return -1;
	//    8   16:iconst_m1       
	//    9   17:ireturn         
		int i = bold;
	//   10   18:aload_0         
	//   11   19:getfield        #80  <Field int bold>
	//   12   22:istore_1        
		byte byte0 = 0;
	//   13   23:iconst_0        
	//   14   24:istore_2        
		if(i == 1)
	//*  15   25:iload_1         
	//*  16   26:iconst_1        
	//*  17   27:icmpne          35
			i = 1;
	//   18   30:iconst_1        
	//   19   31:istore_1        
		else
	//*  20   32:goto            37
			i = 0;
	//   21   35:iconst_0        
	//   22   36:istore_1        
		if(italic == 1)
	//*  23   37:aload_0         
	//*  24   38:getfield        #82  <Field int italic>
	//*  25   41:iconst_1        
	//*  26   42:icmpne          47
			byte0 = 2;
	//   27   45:iconst_2        
	//   28   46:istore_2        
		return i | byte0;
	//   29   47:iload_1         
	//   30   48:iload_2         
	//   31   49:ior             
	//   32   50:ireturn         
	}

	public android.text.Layout.Alignment getTextAlign()
	{
		return textAlign;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field android.text.Layout$Alignment textAlign>
	//    2    4:areturn         
	}

	public boolean hasBackgroundColor()
	{
		return hasBackgroundColor;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field boolean hasBackgroundColor>
	//    2    4:ireturn         
	}

	public boolean hasFontColor()
	{
		return hasFontColor;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field boolean hasFontColor>
	//    2    4:ireturn         
	}

	public boolean isLinethrough()
	{
		return linethrough == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field int linethrough>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean isUnderline()
	{
		return underline == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field int underline>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public void reset()
	{
		targetId = "";
	//    0    0:aload_0         
	//    1    1:ldc1            #134 <String "">
	//    2    3:putfield        #136 <Field String targetId>
		targetTag = "";
	//    3    6:aload_0         
	//    4    7:ldc1            #134 <String "">
	//    5    9:putfield        #138 <Field String targetTag>
		targetClasses = Collections.emptyList();
	//    6   12:aload_0         
	//    7   13:invokestatic    #144 <Method List Collections.emptyList()>
	//    8   16:putfield        #146 <Field List targetClasses>
		targetVoice = "";
	//    9   19:aload_0         
	//   10   20:ldc1            #134 <String "">
	//   11   22:putfield        #148 <Field String targetVoice>
		fontFamily = null;
	//   12   25:aload_0         
	//   13   26:aconst_null     
	//   14   27:putfield        #84  <Field String fontFamily>
		hasFontColor = false;
	//   15   30:aload_0         
	//   16   31:iconst_0        
	//   17   32:putfield        #72  <Field boolean hasFontColor>
		hasBackgroundColor = false;
	//   18   35:aload_0         
	//   19   36:iconst_0        
	//   20   37:putfield        #96  <Field boolean hasBackgroundColor>
		linethrough = -1;
	//   21   40:aload_0         
	//   22   41:iconst_m1       
	//   23   42:putfield        #86  <Field int linethrough>
		underline = -1;
	//   24   45:aload_0         
	//   25   46:iconst_m1       
	//   26   47:putfield        #88  <Field int underline>
		bold = -1;
	//   27   50:aload_0         
	//   28   51:iconst_m1       
	//   29   52:putfield        #80  <Field int bold>
		italic = -1;
	//   30   55:aload_0         
	//   31   56:iconst_m1       
	//   32   57:putfield        #82  <Field int italic>
		fontSizeUnit = -1;
	//   33   60:aload_0         
	//   34   61:iconst_m1       
	//   35   62:putfield        #92  <Field int fontSizeUnit>
		textAlign = null;
	//   36   65:aload_0         
	//   37   66:aconst_null     
	//   38   67:putfield        #90  <Field android.text.Layout$Alignment textAlign>
	//   39   70:return          
	}

	public WebvttCssStyle setBackgroundColor(int i)
	{
		backgroundColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #98  <Field int backgroundColor>
		hasBackgroundColor = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #96  <Field boolean hasBackgroundColor>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public WebvttCssStyle setBold(boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #122 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #152 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #127 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public WebvttCssStyle setFontColor(int i)
	{
		fontColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #74  <Field int fontColor>
		hasFontColor = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #72  <Field boolean hasFontColor>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public WebvttCssStyle setFontFamily(String s)
	{
		fontFamily = Util.toLowerInvariant(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #160 <Method String Util.toLowerInvariant(String)>
	//    3    5:putfield        #84  <Field String fontFamily>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public WebvttCssStyle setFontSize(float f)
	{
		fontSize = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #94  <Field float fontSize>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public WebvttCssStyle setFontSizeUnit(short word0)
	{
		fontSizeUnit = ((int) (word0));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #92  <Field int fontSizeUnit>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public WebvttCssStyle setItalic(boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #122 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #152 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #127 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public WebvttCssStyle setLinethrough(boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #122 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #152 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #127 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public void setTargetClasses(String as[])
	{
		targetClasses = Arrays.asList(((Object []) (as)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #174 <Method List Arrays.asList(Object[])>
	//    3    5:putfield        #146 <Field List targetClasses>
	//    4    8:return          
	}

	public void setTargetId(String s)
	{
		targetId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #136 <Field String targetId>
	//    3    5:return          
	}

	public void setTargetTagName(String s)
	{
		targetTag = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #138 <Field String targetTag>
	//    3    5:return          
	}

	public void setTargetVoice(String s)
	{
		targetVoice = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #148 <Field String targetVoice>
	//    3    5:return          
	}

	public WebvttCssStyle setTextAlign(android.text.Layout.Alignment alignment)
	{
		textAlign = alignment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #90  <Field android.text.Layout$Alignment textAlign>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public WebvttCssStyle setUnderline(boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #122 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #152 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #127 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public static final int FONT_SIZE_UNIT_EM = 2;
	public static final int FONT_SIZE_UNIT_PERCENT = 3;
	public static final int FONT_SIZE_UNIT_PIXEL = 1;
	private static final int OFF = 0;
	private static final int ON = 1;
	public static final int STYLE_BOLD = 1;
	public static final int STYLE_BOLD_ITALIC = 3;
	public static final int STYLE_ITALIC = 2;
	public static final int STYLE_NORMAL = 0;
	public static final int UNSPECIFIED = -1;
	private int backgroundColor;
	private int bold;
	private int fontColor;
	private String fontFamily;
	private float fontSize;
	private int fontSizeUnit;
	private boolean hasBackgroundColor;
	private boolean hasFontColor;
	private int italic;
	private int linethrough;
	private List targetClasses;
	private String targetId;
	private String targetTag;
	private String targetVoice;
	private android.text.Layout.Alignment textAlign;
	private int underline;
}
