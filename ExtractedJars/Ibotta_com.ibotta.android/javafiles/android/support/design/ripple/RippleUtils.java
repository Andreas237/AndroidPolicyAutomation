// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.ripple;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v4.graphics.ColorUtils;
import android.util.StateSet;

public class RippleUtils
{

	public static ColorStateList convertToRippleDrawableColor(ColorStateList colorstatelist)
	{
		if(USE_FRAMEWORK_RIPPLE)
	//*   0    0:getstatic       #30  <Field boolean USE_FRAMEWORK_RIPPLE>
	//*   1    3:ifeq            65
		{
			int ai[] = SELECTED_STATE_SET;
	//    2    6:getstatic       #52  <Field int[] SELECTED_STATE_SET>
	//    3    9:astore          9
			int i = getColorForState(colorstatelist, SELECTED_PRESSED_STATE_SET);
	//    4   11:aload_0         
	//    5   12:getstatic       #44  <Field int[] SELECTED_PRESSED_STATE_SET>
	//    6   15:invokestatic    #61  <Method int getColorForState(ColorStateList, int[])>
	//    7   18:istore_1        
			int ai2[] = StateSet.NOTHING;
	//    8   19:getstatic       #66  <Field int[] StateSet.NOTHING>
	//    9   22:astore          10
			int k = getColorForState(colorstatelist, PRESSED_STATE_SET);
	//   10   24:aload_0         
	//   11   25:getstatic       #33  <Field int[] PRESSED_STATE_SET>
	//   12   28:invokestatic    #61  <Method int getColorForState(ColorStateList, int[])>
	//   13   31:istore_2        
			return new ColorStateList(new int[][] {
				ai, ai2
			}, new int[] {
				i, k
			});
	//   14   32:new             #68  <Class ColorStateList>
	//   15   35:dup             
	//   16   36:iconst_2        
	//   17   37:anewarray       int[][]
	//   18   40:dup             
	//   19   41:iconst_0        
	//   20   42:aload           9
	//   21   44:aastore         
	//   22   45:dup             
	//   23   46:iconst_1        
	//   24   47:aload           10
	//   25   49:aastore         
	//   26   50:iconst_2        
	//   27   51:newarray        int[]
	//   28   53:dup             
	//   29   54:iconst_0        
	//   30   55:iload_1         
	//   31   56:iastore         
	//   32   57:dup             
	//   33   58:iconst_1        
	//   34   59:iload_2         
	//   35   60:iastore         
	//   36   61:invokespecial   #73  <Method void ColorStateList(int[][], int[])>
	//   37   64:areturn         
		} else
		{
			int ai1[] = SELECTED_PRESSED_STATE_SET;
	//   38   65:getstatic       #44  <Field int[] SELECTED_PRESSED_STATE_SET>
	//   39   68:astore          9
			int j = getColorForState(colorstatelist, ai1);
	//   40   70:aload_0         
	//   41   71:aload           9
	//   42   73:invokestatic    #61  <Method int getColorForState(ColorStateList, int[])>
	//   43   76:istore_1        
			int ai3[] = SELECTED_HOVERED_FOCUSED_STATE_SET;
	//   44   77:getstatic       #46  <Field int[] SELECTED_HOVERED_FOCUSED_STATE_SET>
	//   45   80:astore          10
			int l = getColorForState(colorstatelist, ai3);
	//   46   82:aload_0         
	//   47   83:aload           10
	//   48   85:invokestatic    #61  <Method int getColorForState(ColorStateList, int[])>
	//   49   88:istore_2        
			int ai4[] = SELECTED_FOCUSED_STATE_SET;
	//   50   89:getstatic       #48  <Field int[] SELECTED_FOCUSED_STATE_SET>
	//   51   92:astore          11
			int i1 = getColorForState(colorstatelist, ai4);
	//   52   94:aload_0         
	//   53   95:aload           11
	//   54   97:invokestatic    #61  <Method int getColorForState(ColorStateList, int[])>
	//   55  100:istore_3        
			int ai5[] = SELECTED_HOVERED_STATE_SET;
	//   56  101:getstatic       #50  <Field int[] SELECTED_HOVERED_STATE_SET>
	//   57  104:astore          12
			int j1 = getColorForState(colorstatelist, ai5);
	//   58  106:aload_0         
	//   59  107:aload           12
	//   60  109:invokestatic    #61  <Method int getColorForState(ColorStateList, int[])>
	//   61  112:istore          4
			int ai6[] = SELECTED_STATE_SET;
	//   62  114:getstatic       #52  <Field int[] SELECTED_STATE_SET>
	//   63  117:astore          13
			int ai7[] = PRESSED_STATE_SET;
	//   64  119:getstatic       #33  <Field int[] PRESSED_STATE_SET>
	//   65  122:astore          14
			int k1 = getColorForState(colorstatelist, ai7);
	//   66  124:aload_0         
	//   67  125:aload           14
	//   68  127:invokestatic    #61  <Method int getColorForState(ColorStateList, int[])>
	//   69  130:istore          5
			int ai8[] = HOVERED_FOCUSED_STATE_SET;
	//   70  132:getstatic       #37  <Field int[] HOVERED_FOCUSED_STATE_SET>
	//   71  135:astore          15
			int l1 = getColorForState(colorstatelist, ai8);
	//   72  137:aload_0         
	//   73  138:aload           15
	//   74  140:invokestatic    #61  <Method int getColorForState(ColorStateList, int[])>
	//   75  143:istore          6
			int ai9[] = FOCUSED_STATE_SET;
	//   76  145:getstatic       #39  <Field int[] FOCUSED_STATE_SET>
	//   77  148:astore          16
			int i2 = getColorForState(colorstatelist, ai9);
	//   78  150:aload_0         
	//   79  151:aload           16
	//   80  153:invokestatic    #61  <Method int getColorForState(ColorStateList, int[])>
	//   81  156:istore          7
			int ai10[] = HOVERED_STATE_SET;
	//   82  158:getstatic       #41  <Field int[] HOVERED_STATE_SET>
	//   83  161:astore          17
			int j2 = getColorForState(colorstatelist, ai10);
	//   84  163:aload_0         
	//   85  164:aload           17
	//   86  166:invokestatic    #61  <Method int getColorForState(ColorStateList, int[])>
	//   87  169:istore          8
			return new ColorStateList(new int[][] {
				ai1, ai3, ai4, ai5, ai6, ai7, ai8, ai9, ai10, StateSet.NOTHING
			}, new int[] {
				j, l, i1, j1, 0, k1, l1, i2, j2, 0
			});
	//   88  171:new             #68  <Class ColorStateList>
	//   89  174:dup             
	//   90  175:bipush          10
	//   91  177:anewarray       int[][]
	//   92  180:dup             
	//   93  181:iconst_0        
	//   94  182:aload           9
	//   95  184:aastore         
	//   96  185:dup             
	//   97  186:iconst_1        
	//   98  187:aload           10
	//   99  189:aastore         
	//  100  190:dup             
	//  101  191:iconst_2        
	//  102  192:aload           11
	//  103  194:aastore         
	//  104  195:dup             
	//  105  196:iconst_3        
	//  106  197:aload           12
	//  107  199:aastore         
	//  108  200:dup             
	//  109  201:iconst_4        
	//  110  202:aload           13
	//  111  204:aastore         
	//  112  205:dup             
	//  113  206:iconst_5        
	//  114  207:aload           14
	//  115  209:aastore         
	//  116  210:dup             
	//  117  211:bipush          6
	//  118  213:aload           15
	//  119  215:aastore         
	//  120  216:dup             
	//  121  217:bipush          7
	//  122  219:aload           16
	//  123  221:aastore         
	//  124  222:dup             
	//  125  223:bipush          8
	//  126  225:aload           17
	//  127  227:aastore         
	//  128  228:dup             
	//  129  229:bipush          9
	//  130  231:getstatic       #66  <Field int[] StateSet.NOTHING>
	//  131  234:aastore         
	//  132  235:bipush          10
	//  133  237:newarray        int[]
	//  134  239:dup             
	//  135  240:iconst_0        
	//  136  241:iload_1         
	//  137  242:iastore         
	//  138  243:dup             
	//  139  244:iconst_1        
	//  140  245:iload_2         
	//  141  246:iastore         
	//  142  247:dup             
	//  143  248:iconst_2        
	//  144  249:iload_3         
	//  145  250:iastore         
	//  146  251:dup             
	//  147  252:iconst_3        
	//  148  253:iload           4
	//  149  255:iastore         
	//  150  256:dup             
	//  151  257:iconst_4        
	//  152  258:iconst_0        
	//  153  259:iastore         
	//  154  260:dup             
	//  155  261:iconst_5        
	//  156  262:iload           5
	//  157  264:iastore         
	//  158  265:dup             
	//  159  266:bipush          6
	//  160  268:iload           6
	//  161  270:iastore         
	//  162  271:dup             
	//  163  272:bipush          7
	//  164  274:iload           7
	//  165  276:iastore         
	//  166  277:dup             
	//  167  278:bipush          8
	//  168  280:iload           8
	//  169  282:iastore         
	//  170  283:dup             
	//  171  284:bipush          9
	//  172  286:iconst_0        
	//  173  287:iastore         
	//  174  288:invokespecial   #73  <Method void ColorStateList(int[][], int[])>
	//  175  291:areturn         
		}
	}

	private static int doubleAlpha(int i)
	{
		return ColorUtils.setAlphaComponent(i, Math.min(Color.alpha(i) * 2, 255));
	//    0    0:iload_0         
	//    1    1:iload_0         
	//    2    2:invokestatic    #85  <Method int Color.alpha(int)>
	//    3    5:iconst_2        
	//    4    6:imul            
	//    5    7:sipush          255
	//    6   10:invokestatic    #91  <Method int Math.min(int, int)>
	//    7   13:invokestatic    #96  <Method int ColorUtils.setAlphaComponent(int, int)>
	//    8   16:ireturn         
	}

	private static int getColorForState(ColorStateList colorstatelist, int ai[])
	{
		int i;
		if(colorstatelist != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          17
			i = colorstatelist.getColorForState(ai, colorstatelist.getDefaultColor());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #100 <Method int ColorStateList.getDefaultColor()>
	//    6   10:invokevirtual   #103 <Method int ColorStateList.getColorForState(int[], int)>
	//    7   13:istore_2        
		else
	//*   8   14:goto            19
			i = 0;
	//    9   17:iconst_0        
	//   10   18:istore_2        
		int j = i;
	//   11   19:iload_2         
	//   12   20:istore_3        
		if(USE_FRAMEWORK_RIPPLE)
	//*  13   21:getstatic       #30  <Field boolean USE_FRAMEWORK_RIPPLE>
	//*  14   24:ifeq            32
			j = doubleAlpha(i);
	//   15   27:iload_2         
	//   16   28:invokestatic    #105 <Method int doubleAlpha(int)>
	//   17   31:istore_3        
		return j;
	//   18   32:iload_3         
	//   19   33:ireturn         
	}

	private static final int FOCUSED_STATE_SET[] = {
		0x101009c
	};
	private static final int HOVERED_FOCUSED_STATE_SET[] = {
		0x1010367, 0x101009c
	};
	private static final int HOVERED_STATE_SET[] = {
		0x1010367
	};
	private static final int PRESSED_STATE_SET[] = {
		0x10100a7
	};
	private static final int SELECTED_FOCUSED_STATE_SET[] = {
		0x10100a1, 0x101009c
	};
	private static final int SELECTED_HOVERED_FOCUSED_STATE_SET[] = {
		0x10100a1, 0x1010367, 0x101009c
	};
	private static final int SELECTED_HOVERED_STATE_SET[] = {
		0x10100a1, 0x1010367
	};
	private static final int SELECTED_PRESSED_STATE_SET[] = {
		0x10100a1, 0x10100a7
	};
	private static final int SELECTED_STATE_SET[] = {
		0x10100a1
	};
	public static final boolean USE_FRAMEWORK_RIPPLE;

	static 
	{
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:goto            15
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore_0        
		USE_FRAMEWORK_RIPPLE = flag;
	//    8   15:iload_0         
	//    9   16:putstatic       #30  <Field boolean USE_FRAMEWORK_RIPPLE>
	//   10   19:iconst_1        
	//   11   20:newarray        int[]
	//   12   22:dup             
	//   13   23:iconst_0        
	//   14   24:ldc1            #31  <Int 0x10100a7>
	//   15   26:iastore         
	//   16   27:putstatic       #33  <Field int[] PRESSED_STATE_SET>
	//   17   30:iconst_2        
	//   18   31:newarray        int[]
	//   19   33:dup             
	//   20   34:iconst_0        
	//   21   35:ldc1            #34  <Int 0x1010367>
	//   22   37:iastore         
	//   23   38:dup             
	//   24   39:iconst_1        
	//   25   40:ldc1            #35  <Int 0x101009c>
	//   26   42:iastore         
	//   27   43:putstatic       #37  <Field int[] HOVERED_FOCUSED_STATE_SET>
	//   28   46:iconst_1        
	//   29   47:newarray        int[]
	//   30   49:dup             
	//   31   50:iconst_0        
	//   32   51:ldc1            #35  <Int 0x101009c>
	//   33   53:iastore         
	//   34   54:putstatic       #39  <Field int[] FOCUSED_STATE_SET>
	//   35   57:iconst_1        
	//   36   58:newarray        int[]
	//   37   60:dup             
	//   38   61:iconst_0        
	//   39   62:ldc1            #34  <Int 0x1010367>
	//   40   64:iastore         
	//   41   65:putstatic       #41  <Field int[] HOVERED_STATE_SET>
	//   42   68:iconst_2        
	//   43   69:newarray        int[]
	//   44   71:dup             
	//   45   72:iconst_0        
	//   46   73:ldc1            #42  <Int 0x10100a1>
	//   47   75:iastore         
	//   48   76:dup             
	//   49   77:iconst_1        
	//   50   78:ldc1            #31  <Int 0x10100a7>
	//   51   80:iastore         
	//   52   81:putstatic       #44  <Field int[] SELECTED_PRESSED_STATE_SET>
	//   53   84:iconst_3        
	//   54   85:newarray        int[]
	//   55   87:dup             
	//   56   88:iconst_0        
	//   57   89:ldc1            #42  <Int 0x10100a1>
	//   58   91:iastore         
	//   59   92:dup             
	//   60   93:iconst_1        
	//   61   94:ldc1            #34  <Int 0x1010367>
	//   62   96:iastore         
	//   63   97:dup             
	//   64   98:iconst_2        
	//   65   99:ldc1            #35  <Int 0x101009c>
	//   66  101:iastore         
	//   67  102:putstatic       #46  <Field int[] SELECTED_HOVERED_FOCUSED_STATE_SET>
	//   68  105:iconst_2        
	//   69  106:newarray        int[]
	//   70  108:dup             
	//   71  109:iconst_0        
	//   72  110:ldc1            #42  <Int 0x10100a1>
	//   73  112:iastore         
	//   74  113:dup             
	//   75  114:iconst_1        
	//   76  115:ldc1            #35  <Int 0x101009c>
	//   77  117:iastore         
	//   78  118:putstatic       #48  <Field int[] SELECTED_FOCUSED_STATE_SET>
	//   79  121:iconst_2        
	//   80  122:newarray        int[]
	//   81  124:dup             
	//   82  125:iconst_0        
	//   83  126:ldc1            #42  <Int 0x10100a1>
	//   84  128:iastore         
	//   85  129:dup             
	//   86  130:iconst_1        
	//   87  131:ldc1            #34  <Int 0x1010367>
	//   88  133:iastore         
	//   89  134:putstatic       #50  <Field int[] SELECTED_HOVERED_STATE_SET>
	//   90  137:iconst_1        
	//   91  138:newarray        int[]
	//   92  140:dup             
	//   93  141:iconst_0        
	//   94  142:ldc1            #42  <Int 0x10100a1>
	//   95  144:iastore         
	//   96  145:putstatic       #52  <Field int[] SELECTED_STATE_SET>
	//*  97  148:return          
	}
}
