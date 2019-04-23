// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.text:
//			CaptionStyleCompat, CuePainter, Cue

public final class SubtitleLayout extends View
{

	public SubtitleLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #33  <Method void SubtitleLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public SubtitleLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #35  <Method void View(Context, AttributeSet)>
		painters = ((List) (new ArrayList()));
	//    4    6:aload_0         
	//    5    7:new             #37  <Class ArrayList>
	//    6   10:dup             
	//    7   11:invokespecial   #40  <Method void ArrayList()>
	//    8   14:putfield        #42  <Field List painters>
		textSizeType = 0;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #44  <Field int textSizeType>
		textSize = 0.0533F;
	//   12   22:aload_0         
	//   13   23:ldc1            #12  <Float 0.0533F>
	//   14   25:putfield        #46  <Field float textSize>
		applyEmbeddedStyles = true;
	//   15   28:aload_0         
	//   16   29:iconst_1        
	//   17   30:putfield        #48  <Field boolean applyEmbeddedStyles>
		style = CaptionStyleCompat.DEFAULT;
	//   18   33:aload_0         
	//   19   34:getstatic       #53  <Field CaptionStyleCompat CaptionStyleCompat.DEFAULT>
	//   20   37:putfield        #55  <Field CaptionStyleCompat style>
		bottomPaddingFraction = 0.08F;
	//   21   40:aload_0         
	//   22   41:ldc1            #10  <Float 0.08F>
	//   23   43:putfield        #57  <Field float bottomPaddingFraction>
	//   24   46:return          
	}

	private void setTextSize(int i, float f)
	{
		if(textSizeType == i && textSize == f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int textSizeType>
	//*   2    4:iload_1         
	//*   3    5:icmpne          18
	//*   4    8:aload_0         
	//*   5    9:getfield        #46  <Field float textSize>
	//*   6   12:fload_2         
	//*   7   13:fcmpl           
	//*   8   14:ifne            18
		{
			return;
	//    9   17:return          
		} else
		{
			textSizeType = i;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:putfield        #44  <Field int textSizeType>
			textSize = f;
	//   13   23:aload_0         
	//   14   24:fload_2         
	//   15   25:putfield        #46  <Field float textSize>
			invalidate();
	//   16   28:aload_0         
	//   17   29:invokevirtual   #62  <Method void invalidate()>
			return;
	//   18   32:return          
		}
	}

	public void dispatchDraw(Canvas canvas)
	{
		List list = cues;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field List cues>
	//    2    4:astore          12
		int k = 0;
	//    3    6:iconst_0        
	//    4    7:istore          5
		int i;
		if(list == null)
	//*   5    9:aload           12
	//*   6   11:ifnonnull       19
			i = 0;
	//    7   14:iconst_0        
	//    8   15:istore_3        
		else
	//*   9   16:goto            27
			i = list.size();
	//   10   19:aload           12
	//   11   21:invokeinterface #72  <Method int List.size()>
	//   12   26:istore_3        
		int j = getTop();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #75  <Method int getTop()>
	//   15   31:istore          4
		int l1 = getBottom();
	//   16   33:aload_0         
	//   17   34:invokevirtual   #78  <Method int getBottom()>
	//   18   37:istore          10
		int j1 = getLeft() + getPaddingLeft();
	//   19   39:aload_0         
	//   20   40:invokevirtual   #81  <Method int getLeft()>
	//   21   43:aload_0         
	//   22   44:invokevirtual   #84  <Method int getPaddingLeft()>
	//   23   47:iadd            
	//   24   48:istore          8
		int k1 = getPaddingTop() + j;
	//   25   50:aload_0         
	//   26   51:invokevirtual   #87  <Method int getPaddingTop()>
	//   27   54:iload           4
	//   28   56:iadd            
	//   29   57:istore          9
		int l = getRight() + getPaddingRight();
	//   30   59:aload_0         
	//   31   60:invokevirtual   #90  <Method int getRight()>
	//   32   63:aload_0         
	//   33   64:invokevirtual   #93  <Method int getPaddingRight()>
	//   34   67:iadd            
	//   35   68:istore          6
		int i1 = l1 - getPaddingBottom();
	//   36   70:iload           10
	//   37   72:aload_0         
	//   38   73:invokevirtual   #96  <Method int getPaddingBottom()>
	//   39   76:isub            
	//   40   77:istore          7
		if(i1 > k1)
	//*  41   79:iload           7
	//*  42   81:iload           9
	//*  43   83:icmple          231
		{
			if(l <= j1)
	//*  44   86:iload           6
	//*  45   88:iload           8
	//*  46   90:icmpgt          94
				return;
	//   47   93:return          
			int i2 = textSizeType;
	//   48   94:aload_0         
	//   49   95:getfield        #44  <Field int textSizeType>
	//   50   98:istore          11
			float f;
			if(i2 == 2)
	//*  51  100:iload           11
	//*  52  102:iconst_2        
	//*  53  103:icmpne          114
			{
				f = textSize;
	//   54  106:aload_0         
	//   55  107:getfield        #46  <Field float textSize>
	//   56  110:fstore_2        
			} else
	//*  57  111:goto            147
			{
				f = textSize;
	//   58  114:aload_0         
	//   59  115:getfield        #46  <Field float textSize>
	//   60  118:fstore_2        
				if(i2 == 0)
	//*  61  119:iload           11
	//*  62  121:ifne            134
					j = i1 - k1;
	//   63  124:iload           7
	//   64  126:iload           9
	//   65  128:isub            
	//   66  129:istore          4
				else
	//*  67  131:goto            141
					j = l1 - j;
	//   68  134:iload           10
	//   69  136:iload           4
	//   70  138:isub            
	//   71  139:istore          4
				f *= j;
	//   72  141:fload_2         
	//   73  142:iload           4
	//   74  144:i2f             
	//   75  145:fmul            
	//   76  146:fstore_2        
			}
			j = k;
	//   77  147:iload           5
	//   78  149:istore          4
			k = i1;
	//   79  151:iload           7
	//   80  153:istore          5
			if(f <= 0.0F)
	//*  81  155:fload_2         
	//*  82  156:fconst_0        
	//*  83  157:fcmpg           
	//*  84  158:ifgt            162
				return;
	//   85  161:return          
			for(; j < i; j++)
	//*  86  162:iload           4
	//*  87  164:iload_3         
	//*  88  165:icmpge          230
				((CuePainter)painters.get(j)).draw((Cue)cues.get(j), applyEmbeddedStyles, style, f, bottomPaddingFraction, canvas, j1, k1, l, k);
	//   89  168:aload_0         
	//   90  169:getfield        #42  <Field List painters>
	//   91  172:iload           4
	//   92  174:invokeinterface #100 <Method Object List.get(int)>
	//   93  179:checkcast       #102 <Class CuePainter>
	//   94  182:aload_0         
	//   95  183:getfield        #66  <Field List cues>
	//   96  186:iload           4
	//   97  188:invokeinterface #100 <Method Object List.get(int)>
	//   98  193:checkcast       #104 <Class Cue>
	//   99  196:aload_0         
	//  100  197:getfield        #48  <Field boolean applyEmbeddedStyles>
	//  101  200:aload_0         
	//  102  201:getfield        #55  <Field CaptionStyleCompat style>
	//  103  204:fload_2         
	//  104  205:aload_0         
	//  105  206:getfield        #57  <Field float bottomPaddingFraction>
	//  106  209:aload_1         
	//  107  210:iload           8
	//  108  212:iload           9
	//  109  214:iload           6
	//  110  216:iload           5
	//  111  218:invokevirtual   #108 <Method void CuePainter.draw(Cue, boolean, CaptionStyleCompat, float, float, Canvas, int, int, int, int)>

	//  112  221:iload           4
	//  113  223:iconst_1        
	//  114  224:iadd            
	//  115  225:istore          4
	//* 116  227:goto            162
			return;
	//  117  230:return          
		} else
		{
			return;
	//  118  231:return          
		}
	}

	public void setApplyEmbeddedStyles(boolean flag)
	{
		if(applyEmbeddedStyles == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field boolean applyEmbeddedStyles>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
		{
			return;
	//    4    8:return          
		} else
		{
			applyEmbeddedStyles = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #48  <Field boolean applyEmbeddedStyles>
			invalidate();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #62  <Method void invalidate()>
			return;
	//   10   18:return          
		}
	}

	public void setBottomPaddingFraction(float f)
	{
		if(bottomPaddingFraction == f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field float bottomPaddingFraction>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifne            10
		{
			return;
	//    5    9:return          
		} else
		{
			bottomPaddingFraction = f;
	//    6   10:aload_0         
	//    7   11:fload_1         
	//    8   12:putfield        #57  <Field float bottomPaddingFraction>
			invalidate();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #62  <Method void invalidate()>
			return;
	//   11   19:return          
		}
	}

	public void setCues(List list)
	{
		if(cues == list)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field List cues>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       9
			return;
	//    4    8:return          
		cues = list;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #66  <Field List cues>
		int i;
		if(list == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       23
			i = 0;
	//   10   18:iconst_0        
	//   11   19:istore_2        
		else
	//*  12   20:goto            30
			i = list.size();
	//   13   23:aload_1         
	//   14   24:invokeinterface #72  <Method int List.size()>
	//   15   29:istore_2        
		for(; painters.size() < i; painters.add(((Object) (new CuePainter(getContext())))));
	//   16   30:aload_0         
	//   17   31:getfield        #42  <Field List painters>
	//   18   34:invokeinterface #72  <Method int List.size()>
	//   19   39:iload_2         
	//   20   40:icmpge          67
	//   21   43:aload_0         
	//   22   44:getfield        #42  <Field List painters>
	//   23   47:new             #102 <Class CuePainter>
	//   24   50:dup             
	//   25   51:aload_0         
	//   26   52:invokevirtual   #118 <Method Context getContext()>
	//   27   55:invokespecial   #120 <Method void CuePainter(Context)>
	//   28   58:invokeinterface #124 <Method boolean List.add(Object)>
	//   29   63:pop             
	//*  30   64:goto            30
		invalidate();
	//   31   67:aload_0         
	//   32   68:invokevirtual   #62  <Method void invalidate()>
	//   33   71:return          
	}

	public void setFixedTextSize(int i, float f)
	{
		Object obj = ((Object) (getContext()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #118 <Method Context getContext()>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       16
			obj = ((Object) (Resources.getSystem()));
	//    5    9:invokestatic    #133 <Method Resources Resources.getSystem()>
	//    6   12:astore_3        
		else
	//*   7   13:goto            21
			obj = ((Object) (((Context) (obj)).getResources()));
	//    8   16:aload_3         
	//    9   17:invokevirtual   #138 <Method Resources Context.getResources()>
	//   10   20:astore_3        
		setTextSize(2, TypedValue.applyDimension(i, f, ((Resources) (obj)).getDisplayMetrics()));
	//   11   21:aload_0         
	//   12   22:iconst_2        
	//   13   23:iload_1         
	//   14   24:fload_2         
	//   15   25:aload_3         
	//   16   26:invokevirtual   #142 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   17   29:invokestatic    #148 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   18   32:invokespecial   #150 <Method void setTextSize(int, float)>
	//   19   35:return          
	}

	public void setFractionalTextSize(float f)
	{
		setFractionalTextSize(f, false);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #154 <Method void setFractionalTextSize(float, boolean)>
	//    4    6:return          
	}

	public void setFractionalTextSize(float f, boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #156 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #158 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #163 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public void setStyle(CaptionStyleCompat captionstylecompat)
	{
		if(style == captionstylecompat)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field CaptionStyleCompat style>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       9
		{
			return;
	//    4    8:return          
		} else
		{
			style = captionstylecompat;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #55  <Field CaptionStyleCompat style>
			invalidate();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #62  <Method void invalidate()>
			return;
	//   10   18:return          
		}
	}

	private static final int ABSOLUTE = 2;
	public static final float DEFAULT_BOTTOM_PADDING_FRACTION = 0.08F;
	public static final float DEFAULT_TEXT_SIZE_FRACTION = 0.0533F;
	private static final int FRACTIONAL = 0;
	private static final int FRACTIONAL_IGNORE_PADDING = 1;
	private boolean applyEmbeddedStyles;
	private float bottomPaddingFraction;
	private List cues;
	private final List painters;
	private CaptionStyleCompat style;
	private float textSize;
	private int textSizeType;
}
