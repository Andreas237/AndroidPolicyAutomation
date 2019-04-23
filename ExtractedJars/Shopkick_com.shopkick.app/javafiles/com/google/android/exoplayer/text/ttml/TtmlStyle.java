// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.ttml;

import com.google.android.exoplayer.util.Assertions;

final class TtmlStyle
{

	public TtmlStyle()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		linethrough = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #45  <Field int linethrough>
		underline = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #47  <Field int underline>
		bold = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #49  <Field int bold>
		italic = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #51  <Field int italic>
		fontSizeUnit = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #53  <Field int fontSizeUnit>
	//   17   29:return          
	}

	private TtmlStyle inherit(TtmlStyle ttmlstyle, boolean flag)
	{
		if(ttmlstyle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          172
		{
			if(!hasFontColor && ttmlstyle.hasFontColor)
	//*   2    4:aload_0         
	//*   3    5:getfield        #58  <Field boolean hasFontColor>
	//*   4    8:ifne            27
	//*   5   11:aload_1         
	//*   6   12:getfield        #58  <Field boolean hasFontColor>
	//*   7   15:ifeq            27
				setFontColor(ttmlstyle.fontColor);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:getfield        #60  <Field int fontColor>
	//   11   23:invokevirtual   #64  <Method TtmlStyle setFontColor(int)>
	//   12   26:pop             
			if(bold == -1)
	//*  13   27:aload_0         
	//*  14   28:getfield        #49  <Field int bold>
	//*  15   31:iconst_m1       
	//*  16   32:icmpne          43
				bold = ttmlstyle.bold;
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:getfield        #49  <Field int bold>
	//   20   40:putfield        #49  <Field int bold>
			if(italic == -1)
	//*  21   43:aload_0         
	//*  22   44:getfield        #51  <Field int italic>
	//*  23   47:iconst_m1       
	//*  24   48:icmpne          59
				italic = ttmlstyle.italic;
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:getfield        #51  <Field int italic>
	//   28   56:putfield        #51  <Field int italic>
			if(fontFamily == null)
	//*  29   59:aload_0         
	//*  30   60:getfield        #66  <Field String fontFamily>
	//*  31   63:ifnonnull       74
				fontFamily = ttmlstyle.fontFamily;
	//   32   66:aload_0         
	//   33   67:aload_1         
	//   34   68:getfield        #66  <Field String fontFamily>
	//   35   71:putfield        #66  <Field String fontFamily>
			if(linethrough == -1)
	//*  36   74:aload_0         
	//*  37   75:getfield        #45  <Field int linethrough>
	//*  38   78:iconst_m1       
	//*  39   79:icmpne          90
				linethrough = ttmlstyle.linethrough;
	//   40   82:aload_0         
	//   41   83:aload_1         
	//   42   84:getfield        #45  <Field int linethrough>
	//   43   87:putfield        #45  <Field int linethrough>
			if(underline == -1)
	//*  44   90:aload_0         
	//*  45   91:getfield        #47  <Field int underline>
	//*  46   94:iconst_m1       
	//*  47   95:icmpne          106
				underline = ttmlstyle.underline;
	//   48   98:aload_0         
	//   49   99:aload_1         
	//   50  100:getfield        #47  <Field int underline>
	//   51  103:putfield        #47  <Field int underline>
			if(textAlign == null)
	//*  52  106:aload_0         
	//*  53  107:getfield        #68  <Field android.text.Layout$Alignment textAlign>
	//*  54  110:ifnonnull       121
				textAlign = ttmlstyle.textAlign;
	//   55  113:aload_0         
	//   56  114:aload_1         
	//   57  115:getfield        #68  <Field android.text.Layout$Alignment textAlign>
	//   58  118:putfield        #68  <Field android.text.Layout$Alignment textAlign>
			if(fontSizeUnit == -1)
	//*  59  121:aload_0         
	//*  60  122:getfield        #53  <Field int fontSizeUnit>
	//*  61  125:iconst_m1       
	//*  62  126:icmpne          145
			{
				fontSizeUnit = ttmlstyle.fontSizeUnit;
	//   63  129:aload_0         
	//   64  130:aload_1         
	//   65  131:getfield        #53  <Field int fontSizeUnit>
	//   66  134:putfield        #53  <Field int fontSizeUnit>
				fontSize = ttmlstyle.fontSize;
	//   67  137:aload_0         
	//   68  138:aload_1         
	//   69  139:getfield        #70  <Field float fontSize>
	//   70  142:putfield        #70  <Field float fontSize>
			}
			if(flag && !hasBackgroundColor && ttmlstyle.hasBackgroundColor)
	//*  71  145:iload_2         
	//*  72  146:ifeq            172
	//*  73  149:aload_0         
	//*  74  150:getfield        #72  <Field boolean hasBackgroundColor>
	//*  75  153:ifne            172
	//*  76  156:aload_1         
	//*  77  157:getfield        #72  <Field boolean hasBackgroundColor>
	//*  78  160:ifeq            172
				setBackgroundColor(ttmlstyle.backgroundColor);
	//   79  163:aload_0         
	//   80  164:aload_1         
	//   81  165:getfield        #74  <Field int backgroundColor>
	//   82  168:invokevirtual   #77  <Method TtmlStyle setBackgroundColor(int)>
	//   83  171:pop             
		}
		return this;
	//   84  172:aload_0         
	//   85  173:areturn         
	}

	public TtmlStyle chain(TtmlStyle ttmlstyle)
	{
		return inherit(ttmlstyle, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #81  <Method TtmlStyle inherit(TtmlStyle, boolean)>
	//    4    6:areturn         
	}

	public int getBackgroundColor()
	{
		if(hasBackgroundColor)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field boolean hasBackgroundColor>
	//*   2    4:ifeq            12
			return backgroundColor;
	//    3    7:aload_0         
	//    4    8:getfield        #74  <Field int backgroundColor>
	//    5   11:ireturn         
		else
			throw new IllegalStateException("Background color has not been defined.");
	//    6   12:new             #85  <Class IllegalStateException>
	//    7   15:dup             
	//    8   16:ldc1            #87  <String "Background color has not been defined.">
	//    9   18:invokespecial   #90  <Method void IllegalStateException(String)>
	//   10   21:athrow          
	}

	public int getFontColor()
	{
		if(hasFontColor)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field boolean hasFontColor>
	//*   2    4:ifeq            12
			return fontColor;
	//    3    7:aload_0         
	//    4    8:getfield        #60  <Field int fontColor>
	//    5   11:ireturn         
		else
			throw new IllegalStateException("Font color has not been defined.");
	//    6   12:new             #85  <Class IllegalStateException>
	//    7   15:dup             
	//    8   16:ldc1            #93  <String "Font color has not been defined.">
	//    9   18:invokespecial   #90  <Method void IllegalStateException(String)>
	//   10   21:athrow          
	}

	public String getFontFamily()
	{
		return fontFamily;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field String fontFamily>
	//    2    4:areturn         
	}

	public float getFontSize()
	{
		return fontSize;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field float fontSize>
	//    2    4:freturn         
	}

	public int getFontSizeUnit()
	{
		return fontSizeUnit;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int fontSizeUnit>
	//    2    4:ireturn         
	}

	public String getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field String id>
	//    2    4:areturn         
	}

	public int getStyle()
	{
		if(bold == -1 && italic == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field int bold>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          18
	//*   4    8:aload_0         
	//*   5    9:getfield        #51  <Field int italic>
	//*   6   12:iconst_m1       
	//*   7   13:icmpne          18
			return -1;
	//    8   16:iconst_m1       
	//    9   17:ireturn         
		int i = bold;
	//   10   18:aload_0         
	//   11   19:getfield        #49  <Field int bold>
	//   12   22:istore_1        
		int j = 0;
	//   13   23:iconst_0        
	//   14   24:istore_2        
		if(i == -1)
	//*  15   25:iload_1         
	//*  16   26:iconst_m1       
	//*  17   27:icmpeq          33
	//*  18   30:goto            35
			i = 0;
	//   19   33:iconst_0        
	//   20   34:istore_1        
		int k = italic;
	//   21   35:aload_0         
	//   22   36:getfield        #51  <Field int italic>
	//   23   39:istore_3        
		if(k != -1)
	//*  24   40:iload_3         
	//*  25   41:iconst_m1       
	//*  26   42:icmpeq          47
			j = k;
	//   27   45:iload_3         
	//   28   46:istore_2        
		return i | j;
	//   29   47:iload_1         
	//   30   48:iload_2         
	//   31   49:ior             
	//   32   50:ireturn         
	}

	public android.text.Layout.Alignment getTextAlign()
	{
		return textAlign;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field android.text.Layout$Alignment textAlign>
	//    2    4:areturn         
	}

	public boolean hasBackgroundColor()
	{
		return hasBackgroundColor;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field boolean hasBackgroundColor>
	//    2    4:ireturn         
	}

	public boolean hasFontColor()
	{
		return hasFontColor;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field boolean hasFontColor>
	//    2    4:ireturn         
	}

	public TtmlStyle inherit(TtmlStyle ttmlstyle)
	{
		return inherit(ttmlstyle, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #81  <Method TtmlStyle inherit(TtmlStyle, boolean)>
	//    4    6:areturn         
	}

	public boolean isLinethrough()
	{
		return linethrough == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int linethrough>
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
	//    1    1:getfield        #47  <Field int underline>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public TtmlStyle setBackgroundColor(int i)
	{
		backgroundColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #74  <Field int backgroundColor>
		hasBackgroundColor = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #72  <Field boolean hasBackgroundColor>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public TtmlStyle setBold(boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #111 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #113 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #116 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public TtmlStyle setFontColor(int i)
	{
		boolean flag;
		if(inheritableStyle == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field TtmlStyle inheritableStyle>
	//*   2    4:ifnonnull       12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Assertions.checkState(flag);
	//    8   14:iload_2         
	//    9   15:invokestatic    #124 <Method void Assertions.checkState(boolean)>
		fontColor = i;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:putfield        #60  <Field int fontColor>
		hasFontColor = true;
	//   13   23:aload_0         
	//   14   24:iconst_1        
	//   15   25:putfield        #58  <Field boolean hasFontColor>
		return this;
	//   16   28:aload_0         
	//   17   29:areturn         
	}

	public TtmlStyle setFontFamily(String s)
	{
		boolean flag;
		if(inheritableStyle == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field TtmlStyle inheritableStyle>
	//*   2    4:ifnonnull       12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Assertions.checkState(flag);
	//    8   14:iload_2         
	//    9   15:invokestatic    #124 <Method void Assertions.checkState(boolean)>
		fontFamily = s;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:putfield        #66  <Field String fontFamily>
		return this;
	//   13   23:aload_0         
	//   14   24:areturn         
	}

	public TtmlStyle setFontSize(float f)
	{
		fontSize = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #70  <Field float fontSize>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public TtmlStyle setFontSizeUnit(int i)
	{
		fontSizeUnit = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field int fontSizeUnit>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public TtmlStyle setId(String s)
	{
		id = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #101 <Field String id>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public TtmlStyle setItalic(boolean flag)
	{
		TtmlStyle ttmlstyle = inheritableStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field TtmlStyle inheritableStyle>
	//    2    4:astore          4
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		boolean flag1;
		if(ttmlstyle == null)
	//*   5    8:aload           4
	//*   6   10:ifnonnull       18
			flag1 = true;
	//    7   13:iconst_1        
	//    8   14:istore_3        
		else
	//*   9   15:goto            20
			flag1 = false;
	//   10   18:iconst_0        
	//   11   19:istore_3        
		Assertions.checkState(flag1);
	//   12   20:iload_3         
	//   13   21:invokestatic    #124 <Method void Assertions.checkState(boolean)>
		if(flag)
	//*  14   24:iload_1         
	//*  15   25:ifeq            30
			i = 2;
	//   16   28:iconst_2        
	//   17   29:istore_2        
		italic = i;
	//   18   30:aload_0         
	//   19   31:iload_2         
	//   20   32:putfield        #51  <Field int italic>
		return this;
	//   21   35:aload_0         
	//   22   36:areturn         
	}

	public TtmlStyle setLinethrough(boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #111 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #113 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #116 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public TtmlStyle setTextAlign(android.text.Layout.Alignment alignment)
	{
		textAlign = alignment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #68  <Field android.text.Layout$Alignment textAlign>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public TtmlStyle setUnderline(boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #111 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #113 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #116 <Method void Runtime(String)>
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
	private String id;
	private TtmlStyle inheritableStyle;
	private int italic;
	private int linethrough;
	private android.text.Layout.Alignment textAlign;
	private int underline;
}
