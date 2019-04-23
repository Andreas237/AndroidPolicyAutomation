// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class BaselineLayout extends ViewGroup
{

	public BaselineLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #11  <Method void ViewGroup(Context, AttributeSet, int)>
		a = -1;
	//    5    7:aload_0         
	//    6    8:iconst_m1       
	//    7    9:putfield        #13  <Field int a>
	//    8   12:return          
	}

	public int getBaseline()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field int a>
	//    2    4:ireturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method int getChildCount()>
	//    2    4:istore          7
		int k1 = getPaddingLeft();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #24  <Method int getPaddingLeft()>
	//    5   10:istore          8
		int l1 = getPaddingRight();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #27  <Method int getPaddingRight()>
	//    8   16:istore          9
		int i1 = getPaddingTop();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #30  <Method int getPaddingTop()>
	//   11   22:istore          6
		for(j = 0; j < j1; j++)
	//*  12   24:iconst_0        
	//*  13   25:istore_3        
	//*  14   26:iload_3         
	//*  15   27:iload           7
	//*  16   29:icmpge          151
		{
			View view = getChildAt(j);
	//   17   32:aload_0         
	//   18   33:iload_3         
	//   19   34:invokevirtual   #34  <Method View getChildAt(int)>
	//   20   37:astore          13
			if(view.getVisibility() == 8)
	//*  21   39:aload           13
	//*  22   41:invokevirtual   #39  <Method int View.getVisibility()>
	//*  23   44:bipush          8
	//*  24   46:icmpne          52
				continue;
	//   25   49:goto            144
			int i2 = view.getMeasuredWidth();
	//   26   52:aload           13
	//   27   54:invokevirtual   #42  <Method int View.getMeasuredWidth()>
	//   28   57:istore          10
			int j2 = view.getMeasuredHeight();
	//   29   59:aload           13
	//   30   61:invokevirtual   #45  <Method int View.getMeasuredHeight()>
	//   31   64:istore          11
			int k2 = (k - i - l1 - k1 - i2) / 2 + k1;
	//   32   66:iload           4
	//   33   68:iload_2         
	//   34   69:isub            
	//   35   70:iload           9
	//   36   72:isub            
	//   37   73:iload           8
	//   38   75:isub            
	//   39   76:iload           10
	//   40   78:isub            
	//   41   79:iconst_2        
	//   42   80:idiv            
	//   43   81:iload           8
	//   44   83:iadd            
	//   45   84:istore          12
			if(a != -1 && view.getBaseline() != -1)
	//*  46   86:aload_0         
	//*  47   87:getfield        #13  <Field int a>
	//*  48   90:iconst_m1       
	//*  49   91:icmpeq          121
	//*  50   94:aload           13
	//*  51   96:invokevirtual   #47  <Method int View.getBaseline()>
	//*  52   99:iconst_m1       
	//*  53  100:icmpeq          121
				l = (a + i1) - view.getBaseline();
	//   54  103:aload_0         
	//   55  104:getfield        #13  <Field int a>
	//   56  107:iload           6
	//   57  109:iadd            
	//   58  110:aload           13
	//   59  112:invokevirtual   #47  <Method int View.getBaseline()>
	//   60  115:isub            
	//   61  116:istore          5
			else
	//*  62  118:goto            125
				l = i1;
	//   63  121:iload           6
	//   64  123:istore          5
			view.layout(k2, l, i2 + k2, j2 + l);
	//   65  125:aload           13
	//   66  127:iload           12
	//   67  129:iload           5
	//   68  131:iload           10
	//   69  133:iload           12
	//   70  135:iadd            
	//   71  136:iload           11
	//   72  138:iload           5
	//   73  140:iadd            
	//   74  141:invokevirtual   #51  <Method void View.layout(int, int, int, int)>
		}

	//   75  144:iload_3         
	//   76  145:iconst_1        
	//   77  146:iadd            
	//   78  147:istore_3        
	//*  79  148:goto            26
	//   80  151:return          
	}

	protected void onMeasure(int i, int j)
	{
		int l2 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method int getChildCount()>
	//    2    4:istore          11
		int k2 = 0;
	//    3    6:iconst_0        
	//    4    7:istore          10
		int i1 = -1;
	//    5    9:iconst_m1       
	//    6   10:istore          5
		int l = -1;
	//    7   12:iconst_m1       
	//    8   13:istore          4
		int k = 0;
	//    9   15:iconst_0        
	//   10   16:istore_3        
		int j2 = 0;
	//   11   17:iconst_0        
	//   12   18:istore          9
		int i2 = 0;
	//   13   20:iconst_0        
	//   14   21:istore          8
		for(; k2 < l2; k2++)
	//*  15   23:iload           10
	//*  16   25:iload           11
	//*  17   27:icmpge          155
		{
			View view = getChildAt(k2);
	//   18   30:aload_0         
	//   19   31:iload           10
	//   20   33:invokevirtual   #34  <Method View getChildAt(int)>
	//   21   36:astore          13
			if(view.getVisibility() == 8)
	//*  22   38:aload           13
	//*  23   40:invokevirtual   #39  <Method int View.getVisibility()>
	//*  24   43:bipush          8
	//*  25   45:icmpne          51
				continue;
	//   26   48:goto            146
			measureChild(view, i, j);
	//   27   51:aload_0         
	//   28   52:aload           13
	//   29   54:iload_1         
	//   30   55:iload_2         
	//   31   56:invokevirtual   #57  <Method void measureChild(View, int, int)>
			int i3 = view.getBaseline();
	//   32   59:aload           13
	//   33   61:invokevirtual   #47  <Method int View.getBaseline()>
	//   34   64:istore          12
			int j1 = i1;
	//   35   66:iload           5
	//   36   68:istore          6
			int l1 = l;
	//   37   70:iload           4
	//   38   72:istore          7
			if(i3 != -1)
	//*  39   74:iload           12
	//*  40   76:iconst_m1       
	//*  41   77:icmpeq          104
			{
				j1 = Math.max(i1, i3);
	//   42   80:iload           5
	//   43   82:iload           12
	//   44   84:invokestatic    #63  <Method int Math.max(int, int)>
	//   45   87:istore          6
				l1 = Math.max(l, view.getMeasuredHeight() - i3);
	//   46   89:iload           4
	//   47   91:aload           13
	//   48   93:invokevirtual   #45  <Method int View.getMeasuredHeight()>
	//   49   96:iload           12
	//   50   98:isub            
	//   51   99:invokestatic    #63  <Method int Math.max(int, int)>
	//   52  102:istore          7
			}
			j2 = Math.max(j2, view.getMeasuredWidth());
	//   53  104:iload           9
	//   54  106:aload           13
	//   55  108:invokevirtual   #42  <Method int View.getMeasuredWidth()>
	//   56  111:invokestatic    #63  <Method int Math.max(int, int)>
	//   57  114:istore          9
			k = Math.max(k, view.getMeasuredHeight());
	//   58  116:iload_3         
	//   59  117:aload           13
	//   60  119:invokevirtual   #45  <Method int View.getMeasuredHeight()>
	//   61  122:invokestatic    #63  <Method int Math.max(int, int)>
	//   62  125:istore_3        
			i2 = View.combineMeasuredStates(i2, view.getMeasuredState());
	//   63  126:iload           8
	//   64  128:aload           13
	//   65  130:invokevirtual   #66  <Method int View.getMeasuredState()>
	//   66  133:invokestatic    #69  <Method int View.combineMeasuredStates(int, int)>
	//   67  136:istore          8
			l = l1;
	//   68  138:iload           7
	//   69  140:istore          4
			i1 = j1;
	//   70  142:iload           6
	//   71  144:istore          5
		}

	//   72  146:iload           10
	//   73  148:iconst_1        
	//   74  149:iadd            
	//   75  150:istore          10
	//*  76  152:goto            23
		int k1 = k;
	//   77  155:iload_3         
	//   78  156:istore          6
		if(i1 != -1)
	//*  79  158:iload           5
	//*  80  160:iconst_m1       
	//*  81  161:icmpeq          188
		{
			k1 = Math.max(k, Math.max(l, getPaddingBottom()) + i1);
	//   82  164:iload_3         
	//   83  165:iload           4
	//   84  167:aload_0         
	//   85  168:invokevirtual   #72  <Method int getPaddingBottom()>
	//   86  171:invokestatic    #63  <Method int Math.max(int, int)>
	//   87  174:iload           5
	//   88  176:iadd            
	//   89  177:invokestatic    #63  <Method int Math.max(int, int)>
	//   90  180:istore          6
			a = i1;
	//   91  182:aload_0         
	//   92  183:iload           5
	//   93  185:putfield        #13  <Field int a>
		}
		k = Math.max(k1, getSuggestedMinimumHeight());
	//   94  188:iload           6
	//   95  190:aload_0         
	//   96  191:invokevirtual   #75  <Method int getSuggestedMinimumHeight()>
	//   97  194:invokestatic    #63  <Method int Math.max(int, int)>
	//   98  197:istore_3        
		setMeasuredDimension(View.resolveSizeAndState(Math.max(j2, getSuggestedMinimumWidth()), i, i2), View.resolveSizeAndState(k, j, i2 << 16));
	//   99  198:aload_0         
	//  100  199:iload           9
	//  101  201:aload_0         
	//  102  202:invokevirtual   #78  <Method int getSuggestedMinimumWidth()>
	//  103  205:invokestatic    #63  <Method int Math.max(int, int)>
	//  104  208:iload_1         
	//  105  209:iload           8
	//  106  211:invokestatic    #82  <Method int View.resolveSizeAndState(int, int, int)>
	//  107  214:iload_3         
	//  108  215:iload_2         
	//  109  216:iload           8
	//  110  218:bipush          16
	//  111  220:ishl            
	//  112  221:invokestatic    #82  <Method int View.resolveSizeAndState(int, int, int)>
	//  113  224:invokevirtual   #85  <Method void setMeasuredDimension(int, int)>
	//  114  227:return          
	}

	private int a;
}
