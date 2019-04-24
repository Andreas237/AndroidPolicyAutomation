// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import com.google.android.exoplayer2.text.*;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.ui:
//			SubtitlePainter

public final class SubtitleView extends View
	implements TextOutput
{

	public SubtitleView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #30  <Method void SubtitleView(Context, AttributeSet)>
	//    4    6:return          
	}

	public SubtitleView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #32  <Method void View(Context, AttributeSet)>
		painters = ((List) (new ArrayList()));
	//    4    6:aload_0         
	//    5    7:new             #34  <Class ArrayList>
	//    6   10:dup             
	//    7   11:invokespecial   #37  <Method void ArrayList()>
	//    8   14:putfield        #39  <Field List painters>
		textSizeType = 0;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #41  <Field int textSizeType>
		textSize = 0.0533F;
	//   12   22:aload_0         
	//   13   23:ldc1            #11  <Float 0.0533F>
	//   14   25:putfield        #43  <Field float textSize>
		applyEmbeddedStyles = true;
	//   15   28:aload_0         
	//   16   29:iconst_1        
	//   17   30:putfield        #45  <Field boolean applyEmbeddedStyles>
		applyEmbeddedFontSizes = true;
	//   18   33:aload_0         
	//   19   34:iconst_1        
	//   20   35:putfield        #47  <Field boolean applyEmbeddedFontSizes>
		style = CaptionStyleCompat.DEFAULT;
	//   21   38:aload_0         
	//   22   39:getstatic       #52  <Field CaptionStyleCompat CaptionStyleCompat.DEFAULT>
	//   23   42:putfield        #54  <Field CaptionStyleCompat style>
		bottomPaddingFraction = 0.08F;
	//   24   45:aload_0         
	//   25   46:ldc1            #9   <Float 0.08F>
	//   26   48:putfield        #56  <Field float bottomPaddingFraction>
	//   27   51:return          
	}

	private float getUserCaptionFontScaleV19()
	{
		return ((CaptioningManager)getContext().getSystemService("captioning")).getFontScale();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method Context getContext()>
	//    2    4:ldc1            #67  <String "captioning">
	//    3    6:invokevirtual   #73  <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #75  <Class CaptioningManager>
	//    5   12:invokevirtual   #78  <Method float CaptioningManager.getFontScale()>
	//    6   15:freturn         
	}

	private CaptionStyleCompat getUserCaptionStyleV19()
	{
		return CaptionStyleCompat.createFromCaptionStyle(((CaptioningManager)getContext().getSystemService("captioning")).getUserStyle());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method Context getContext()>
	//    2    4:ldc1            #67  <String "captioning">
	//    3    6:invokevirtual   #73  <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #75  <Class CaptioningManager>
	//    5   12:invokevirtual   #85  <Method android.view.accessibility.CaptioningManager$CaptionStyle CaptioningManager.getUserStyle()>
	//    6   15:invokestatic    #89  <Method CaptionStyleCompat CaptionStyleCompat.createFromCaptionStyle(android.view.accessibility.CaptioningManager$CaptionStyle)>
	//    7   18:areturn         
	}

	private float resolveCueTextSize(Cue cue, int i, int j)
	{
		if(cue.textSizeType != 0x80000000)
	//*   0    0:aload_1         
	//*   1    1:getfield        #94  <Field int Cue.textSizeType>
	//*   2    4:ldc1            #95  <Int 0x80000000>
	//*   3    6:icmpeq          40
		{
			if(cue.textSize == 1.401298E-45F)
	//*   4    9:aload_1         
	//*   5   10:getfield        #96  <Field float Cue.textSize>
	//*   6   13:ldc1            #97  <Float 1.401298E-45F>
	//*   7   15:fcmpl           
	//*   8   16:ifne            21
				return 0.0F;
	//    9   19:fconst_0        
	//   10   20:freturn         
			else
				return Math.max(resolveTextSize(cue.textSizeType, cue.textSize, i, j), 0.0F);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:getfield        #94  <Field int Cue.textSizeType>
	//   14   26:aload_1         
	//   15   27:getfield        #96  <Field float Cue.textSize>
	//   16   30:iload_2         
	//   17   31:iload_3         
	//   18   32:invokespecial   #101 <Method float resolveTextSize(int, float, int, int)>
	//   19   35:fconst_0        
	//   20   36:invokestatic    #107 <Method float Math.max(float, float)>
	//   21   39:freturn         
		} else
		{
			return 0.0F;
	//   22   40:fconst_0        
	//   23   41:freturn         
		}
	}

	private float resolveTextSize(int i, float f, int j, int k)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 38
	//	               1 33
	//	               2 31
		default:
			return 1.401298E-45F;
	//    2   28:ldc1            #97  <Float 1.401298E-45F>
	//    3   30:freturn         

		case 2: // '\002'
			return f;
	//    4   31:fload_2         
	//    5   32:freturn         

		case 1: // '\001'
			return f * (float)j;
	//    6   33:fload_2         
	//    7   34:iload_3         
	//    8   35:i2f             
	//    9   36:fmul            
	//   10   37:freturn         

		case 0: // '\0'
			return f * (float)k;
	//   11   38:fload_2         
	//   12   39:iload           4
	//   13   41:i2f             
	//   14   42:fmul            
	//   15   43:freturn         
		}
	}

	private void setTextSize(int i, float f)
	{
		if(textSizeType == i && textSize == f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field int textSizeType>
	//*   2    4:iload_1         
	//*   3    5:icmpne          18
	//*   4    8:aload_0         
	//*   5    9:getfield        #43  <Field float textSize>
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
	//   12   20:putfield        #41  <Field int textSizeType>
			textSize = f;
	//   13   23:aload_0         
	//   14   24:fload_2         
	//   15   25:putfield        #43  <Field float textSize>
			invalidate();
	//   16   28:aload_0         
	//   17   29:invokevirtual   #112 <Method void invalidate()>
			return;
	//   18   32:return          
		}
	}

	public void dispatchDraw(Canvas canvas)
	{
		List list = cues;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field List cues>
	//    2    4:astore          12
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore          5
		int i;
		if(list == null)
	//*   5    9:aload           12
	//*   6   11:ifnonnull       20
			i = 0;
	//    7   14:iconst_0        
	//    8   15:istore          4
		else
	//*   9   17:goto            31
			i = cues.size();
	//   10   20:aload_0         
	//   11   21:getfield        #116 <Field List cues>
	//   12   24:invokeinterface #122 <Method int List.size()>
	//   13   29:istore          4
		int k1 = getTop();
	//   14   31:aload_0         
	//   15   32:invokevirtual   #125 <Method int getTop()>
	//   16   35:istore          10
		int l1 = getBottom();
	//   17   37:aload_0         
	//   18   38:invokevirtual   #128 <Method int getBottom()>
	//   19   41:istore          11
		int i1 = getLeft() + getPaddingLeft();
	//   20   43:aload_0         
	//   21   44:invokevirtual   #131 <Method int getLeft()>
	//   22   47:aload_0         
	//   23   48:invokevirtual   #134 <Method int getPaddingLeft()>
	//   24   51:iadd            
	//   25   52:istore          8
		int j1 = getPaddingTop() + k1;
	//   26   54:aload_0         
	//   27   55:invokevirtual   #137 <Method int getPaddingTop()>
	//   28   58:iload           10
	//   29   60:iadd            
	//   30   61:istore          9
		int l = getRight() - getPaddingRight();
	//   31   63:aload_0         
	//   32   64:invokevirtual   #140 <Method int getRight()>
	//   33   67:aload_0         
	//   34   68:invokevirtual   #143 <Method int getPaddingRight()>
	//   35   71:isub            
	//   36   72:istore          7
		int k = l1 - getPaddingBottom();
	//   37   74:iload           11
	//   38   76:aload_0         
	//   39   77:invokevirtual   #146 <Method int getPaddingBottom()>
	//   40   80:isub            
	//   41   81:istore          6
		if(k > j1)
	//*  42   83:iload           6
	//*  43   85:iload           9
	//*  44   87:icmple          226
		{
			if(l <= i1)
	//*  45   90:iload           7
	//*  46   92:iload           8
	//*  47   94:icmpgt          98
				return;
	//   48   97:return          
			k1 = l1 - k1;
	//   49   98:iload           11
	//   50  100:iload           10
	//   51  102:isub            
	//   52  103:istore          10
			l1 = k - j1;
	//   53  105:iload           6
	//   54  107:iload           9
	//   55  109:isub            
	//   56  110:istore          11
			float f = resolveTextSize(textSizeType, textSize, k1, l1);
	//   57  112:aload_0         
	//   58  113:aload_0         
	//   59  114:getfield        #41  <Field int textSizeType>
	//   60  117:aload_0         
	//   61  118:getfield        #43  <Field float textSize>
	//   62  121:iload           10
	//   63  123:iload           11
	//   64  125:invokespecial   #101 <Method float resolveTextSize(int, float, int, int)>
	//   65  128:fstore_2        
			if(f <= 0.0F)
	//*  66  129:fload_2         
	//*  67  130:fconst_0        
	//*  68  131:fcmpg           
	//*  69  132:ifgt            136
				return;
	//   70  135:return          
			for(; j < i; j++)
	//*  71  136:iload           5
	//*  72  138:iload           4
	//*  73  140:icmpge          225
			{
				Cue cue = (Cue)cues.get(j);
	//   74  143:aload_0         
	//   75  144:getfield        #116 <Field List cues>
	//   76  147:iload           5
	//   77  149:invokeinterface #150 <Method Object List.get(int)>
	//   78  154:checkcast       #93  <Class Cue>
	//   79  157:astore          12
				float f1 = resolveCueTextSize(cue, k1, l1);
	//   80  159:aload_0         
	//   81  160:aload           12
	//   82  162:iload           10
	//   83  164:iload           11
	//   84  166:invokespecial   #152 <Method float resolveCueTextSize(Cue, int, int)>
	//   85  169:fstore_3        
				((SubtitlePainter)painters.get(j)).draw(cue, applyEmbeddedStyles, applyEmbeddedFontSizes, style, f, f1, bottomPaddingFraction, canvas, i1, j1, l, k);
	//   86  170:aload_0         
	//   87  171:getfield        #39  <Field List painters>
	//   88  174:iload           5
	//   89  176:invokeinterface #150 <Method Object List.get(int)>
	//   90  181:checkcast       #154 <Class SubtitlePainter>
	//   91  184:aload           12
	//   92  186:aload_0         
	//   93  187:getfield        #45  <Field boolean applyEmbeddedStyles>
	//   94  190:aload_0         
	//   95  191:getfield        #47  <Field boolean applyEmbeddedFontSizes>
	//   96  194:aload_0         
	//   97  195:getfield        #54  <Field CaptionStyleCompat style>
	//   98  198:fload_2         
	//   99  199:fload_3         
	//  100  200:aload_0         
	//  101  201:getfield        #56  <Field float bottomPaddingFraction>
	//  102  204:aload_1         
	//  103  205:iload           8
	//  104  207:iload           9
	//  105  209:iload           7
	//  106  211:iload           6
	//  107  213:invokevirtual   #158 <Method void SubtitlePainter.draw(Cue, boolean, boolean, CaptionStyleCompat, float, float, float, Canvas, int, int, int, int)>
			}

	//  108  216:iload           5
	//  109  218:iconst_1        
	//  110  219:iadd            
	//  111  220:istore          5
	//* 112  222:goto            136
			return;
	//  113  225:return          
		} else
		{
			return;
	//  114  226:return          
		}
	}

	public void onCues(List list)
	{
		setCues(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #163 <Method void setCues(List)>
	//    3    5:return          
	}

	public void setApplyEmbeddedFontSizes(boolean flag)
	{
		if(applyEmbeddedFontSizes == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field boolean applyEmbeddedFontSizes>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
		{
			return;
	//    4    8:return          
		} else
		{
			applyEmbeddedFontSizes = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #47  <Field boolean applyEmbeddedFontSizes>
			invalidate();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #112 <Method void invalidate()>
			return;
	//   10   18:return          
		}
	}

	public void setApplyEmbeddedStyles(boolean flag)
	{
		if(applyEmbeddedStyles == flag && applyEmbeddedFontSizes == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field boolean applyEmbeddedStyles>
	//*   2    4:iload_1         
	//*   3    5:icmpne          17
	//*   4    8:aload_0         
	//*   5    9:getfield        #47  <Field boolean applyEmbeddedFontSizes>
	//*   6   12:iload_1         
	//*   7   13:icmpne          17
		{
			return;
	//    8   16:return          
		} else
		{
			applyEmbeddedStyles = flag;
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:putfield        #45  <Field boolean applyEmbeddedStyles>
			applyEmbeddedFontSizes = flag;
	//   12   22:aload_0         
	//   13   23:iload_1         
	//   14   24:putfield        #47  <Field boolean applyEmbeddedFontSizes>
			invalidate();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #112 <Method void invalidate()>
			return;
	//   17   31:return          
		}
	}

	public void setBottomPaddingFraction(float f)
	{
		if(bottomPaddingFraction == f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field float bottomPaddingFraction>
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
	//    8   12:putfield        #56  <Field float bottomPaddingFraction>
			invalidate();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #112 <Method void invalidate()>
			return;
	//   11   19:return          
		}
	}

	public void setCues(List list)
	{
		if(cues == list)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field List cues>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       9
			return;
	//    4    8:return          
		cues = list;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #116 <Field List cues>
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
	//   14   24:invokeinterface #122 <Method int List.size()>
	//   15   29:istore_2        
		for(; painters.size() < i; painters.add(((Object) (new SubtitlePainter(getContext())))));
	//   16   30:aload_0         
	//   17   31:getfield        #39  <Field List painters>
	//   18   34:invokeinterface #122 <Method int List.size()>
	//   19   39:iload_2         
	//   20   40:icmpge          67
	//   21   43:aload_0         
	//   22   44:getfield        #39  <Field List painters>
	//   23   47:new             #154 <Class SubtitlePainter>
	//   24   50:dup             
	//   25   51:aload_0         
	//   26   52:invokevirtual   #65  <Method Context getContext()>
	//   27   55:invokespecial   #173 <Method void SubtitlePainter(Context)>
	//   28   58:invokeinterface #177 <Method boolean List.add(Object)>
	//   29   63:pop             
	//*  30   64:goto            30
		invalidate();
	//   31   67:aload_0         
	//   32   68:invokevirtual   #112 <Method void invalidate()>
	//   33   71:return          
	}

	public void setFixedTextSize(int i, float f)
	{
		Object obj = ((Object) (getContext()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method Context getContext()>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       16
			obj = ((Object) (Resources.getSystem()));
	//    5    9:invokestatic    #185 <Method Resources Resources.getSystem()>
	//    6   12:astore_3        
		else
	//*   7   13:goto            21
			obj = ((Object) (((Context) (obj)).getResources()));
	//    8   16:aload_3         
	//    9   17:invokevirtual   #188 <Method Resources Context.getResources()>
	//   10   20:astore_3        
		setTextSize(2, TypedValue.applyDimension(i, f, ((Resources) (obj)).getDisplayMetrics()));
	//   11   21:aload_0         
	//   12   22:iconst_2        
	//   13   23:iload_1         
	//   14   24:fload_2         
	//   15   25:aload_3         
	//   16   26:invokevirtual   #192 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   17   29:invokestatic    #198 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   18   32:invokespecial   #200 <Method void setTextSize(int, float)>
	//   19   35:return          
	}

	public void setFractionalTextSize(float f)
	{
		setFractionalTextSize(f, false);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #204 <Method void setFractionalTextSize(float, boolean)>
	//    4    6:return          
	}

	public void setFractionalTextSize(float f, boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #206 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #208 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #213 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public void setStyle(CaptionStyleCompat captionstylecompat)
	{
		if(style == captionstylecompat)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field CaptionStyleCompat style>
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
	//    7   11:putfield        #54  <Field CaptionStyleCompat style>
			invalidate();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #112 <Method void invalidate()>
			return;
	//   10   18:return          
		}
	}

	public void setUserDefaultStyle()
	{
		CaptionStyleCompat captionstylecompat;
		if(Util.SDK_INT >= 19 && !isInEditMode())
	//*   0    0:getstatic       #221 <Field int Util.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          23
	//*   3    8:aload_0         
	//*   4    9:invokevirtual   #225 <Method boolean isInEditMode()>
	//*   5   12:ifne            23
			captionstylecompat = getUserCaptionStyleV19();
	//    6   15:aload_0         
	//    7   16:invokespecial   #227 <Method CaptionStyleCompat getUserCaptionStyleV19()>
	//    8   19:astore_1        
		else
	//*   9   20:goto            27
			captionstylecompat = CaptionStyleCompat.DEFAULT;
	//   10   23:getstatic       #52  <Field CaptionStyleCompat CaptionStyleCompat.DEFAULT>
	//   11   26:astore_1        
		setStyle(captionstylecompat);
	//   12   27:aload_0         
	//   13   28:aload_1         
	//   14   29:invokevirtual   #229 <Method void setStyle(CaptionStyleCompat)>
	//   15   32:return          
	}

	public void setUserDefaultTextSize()
	{
		float f;
		if(Util.SDK_INT >= 19 && !isInEditMode())
	//*   0    0:getstatic       #221 <Field int Util.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          23
	//*   3    8:aload_0         
	//*   4    9:invokevirtual   #225 <Method boolean isInEditMode()>
	//*   5   12:ifne            23
			f = getUserCaptionFontScaleV19();
	//    6   15:aload_0         
	//    7   16:invokespecial   #232 <Method float getUserCaptionFontScaleV19()>
	//    8   19:fstore_1        
		else
	//*   9   20:goto            25
			f = 1.0F;
	//   10   23:fconst_1        
	//   11   24:fstore_1        
		setFractionalTextSize(0.0533F * f);
	//   12   25:aload_0         
	//   13   26:ldc1            #11  <Float 0.0533F>
	//   14   28:fload_1         
	//   15   29:fmul            
	//   16   30:invokevirtual   #234 <Method void setFractionalTextSize(float)>
	//   17   33:return          
	}

	public static final float DEFAULT_BOTTOM_PADDING_FRACTION = 0.08F;
	public static final float DEFAULT_TEXT_SIZE_FRACTION = 0.0533F;
	private boolean applyEmbeddedFontSizes;
	private boolean applyEmbeddedStyles;
	private float bottomPaddingFraction;
	private List cues;
	private final List painters;
	private CaptionStyleCompat style;
	private float textSize;
	private int textSizeType;
}
