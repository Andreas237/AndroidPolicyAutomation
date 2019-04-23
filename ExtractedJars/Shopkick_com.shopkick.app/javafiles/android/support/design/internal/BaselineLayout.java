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

	public BaselineLayout(Context context)
	{
		super(context, ((AttributeSet) (null)), 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:invokespecial   #11  <Method void ViewGroup(Context, AttributeSet, int)>
		baseline = -1;
	//    5    7:aload_0         
	//    6    8:iconst_m1       
	//    7    9:putfield        #13  <Field int baseline>
	//    8   12:return          
	}

	public BaselineLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #11  <Method void ViewGroup(Context, AttributeSet, int)>
		baseline = -1;
	//    5    7:aload_0         
	//    6    8:iconst_m1       
	//    7    9:putfield        #13  <Field int baseline>
	//    8   12:return          
	}

	public BaselineLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #11  <Method void ViewGroup(Context, AttributeSet, int)>
		baseline = -1;
	//    5    7:aload_0         
	//    6    8:iconst_m1       
	//    7    9:putfield        #13  <Field int baseline>
	//    8   12:return          
	}

	public int getBaseline()
	{
		return baseline;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field int baseline>
	//    2    4:ireturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method int getChildCount()>
	//    2    4:istore          7
		int k1 = getPaddingLeft();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #25  <Method int getPaddingLeft()>
	//    5   10:istore          8
		int l1 = getPaddingRight();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #28  <Method int getPaddingRight()>
	//    8   16:istore          9
		int i1 = getPaddingTop();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #31  <Method int getPaddingTop()>
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
	//   19   34:invokevirtual   #35  <Method View getChildAt(int)>
	//   20   37:astore          13
			if(view.getVisibility() == 8)
	//*  21   39:aload           13
	//*  22   41:invokevirtual   #40  <Method int View.getVisibility()>
	//*  23   44:bipush          8
	//*  24   46:icmpne          52
				continue;
	//   25   49:goto            144
			int i2 = view.getMeasuredWidth();
	//   26   52:aload           13
	//   27   54:invokevirtual   #43  <Method int View.getMeasuredWidth()>
	//   28   57:istore          10
			int j2 = view.getMeasuredHeight();
	//   29   59:aload           13
	//   30   61:invokevirtual   #46  <Method int View.getMeasuredHeight()>
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
			if(baseline != -1 && view.getBaseline() != -1)
	//*  46   86:aload_0         
	//*  47   87:getfield        #13  <Field int baseline>
	//*  48   90:iconst_m1       
	//*  49   91:icmpeq          121
	//*  50   94:aload           13
	//*  51   96:invokevirtual   #48  <Method int View.getBaseline()>
	//*  52   99:iconst_m1       
	//*  53  100:icmpeq          121
				l = (baseline + i1) - view.getBaseline();
	//   54  103:aload_0         
	//   55  104:getfield        #13  <Field int baseline>
	//   56  107:iload           6
	//   57  109:iadd            
	//   58  110:aload           13
	//   59  112:invokevirtual   #48  <Method int View.getBaseline()>
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
	//   74  141:invokevirtual   #52  <Method void View.layout(int, int, int, int)>
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
		int k2 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method int getChildCount()>
	//    2    4:istore          11
		int j2 = 0;
	//    3    6:iconst_0        
	//    4    7:istore          10
		int i1 = -1;
	//    5    9:iconst_m1       
	//    6   10:istore          5
		int l = i1;
	//    7   12:iload           5
	//    8   14:istore          4
		int j1 = 0;
	//    9   16:iconst_0        
	//   10   17:istore          6
		int k = j1;
	//   11   19:iload           6
	//   12   21:istore_3        
		int l1 = k;
	//   13   22:iload_3         
	//   14   23:istore          8
		int i2 = k;
	//   15   25:iload_3         
	//   16   26:istore          9
		k = j1;
	//   17   28:iload           6
	//   18   30:istore_3        
		for(; j2 < k2; j2++)
	//*  19   31:iload           10
	//*  20   33:iload           11
	//*  21   35:icmpge          163
		{
			View view = getChildAt(j2);
	//   22   38:aload_0         
	//   23   39:iload           10
	//   24   41:invokevirtual   #35  <Method View getChildAt(int)>
	//   25   44:astore          13
			if(view.getVisibility() == 8)
	//*  26   46:aload           13
	//*  27   48:invokevirtual   #40  <Method int View.getVisibility()>
	//*  28   51:bipush          8
	//*  29   53:icmpne          59
				continue;
	//   30   56:goto            154
			measureChild(view, i, j);
	//   31   59:aload_0         
	//   32   60:aload           13
	//   33   62:iload_1         
	//   34   63:iload_2         
	//   35   64:invokevirtual   #58  <Method void measureChild(View, int, int)>
			int l2 = view.getBaseline();
	//   36   67:aload           13
	//   37   69:invokevirtual   #48  <Method int View.getBaseline()>
	//   38   72:istore          12
			j1 = i1;
	//   39   74:iload           5
	//   40   76:istore          6
			int k1 = l;
	//   41   78:iload           4
	//   42   80:istore          7
			if(l2 != -1)
	//*  43   82:iload           12
	//*  44   84:iconst_m1       
	//*  45   85:icmpeq          112
			{
				j1 = Math.max(i1, l2);
	//   46   88:iload           5
	//   47   90:iload           12
	//   48   92:invokestatic    #64  <Method int Math.max(int, int)>
	//   49   95:istore          6
				k1 = Math.max(l, view.getMeasuredHeight() - l2);
	//   50   97:iload           4
	//   51   99:aload           13
	//   52  101:invokevirtual   #46  <Method int View.getMeasuredHeight()>
	//   53  104:iload           12
	//   54  106:isub            
	//   55  107:invokestatic    #64  <Method int Math.max(int, int)>
	//   56  110:istore          7
			}
			i2 = Math.max(i2, view.getMeasuredWidth());
	//   57  112:iload           9
	//   58  114:aload           13
	//   59  116:invokevirtual   #43  <Method int View.getMeasuredWidth()>
	//   60  119:invokestatic    #64  <Method int Math.max(int, int)>
	//   61  122:istore          9
			k = Math.max(k, view.getMeasuredHeight());
	//   62  124:iload_3         
	//   63  125:aload           13
	//   64  127:invokevirtual   #46  <Method int View.getMeasuredHeight()>
	//   65  130:invokestatic    #64  <Method int Math.max(int, int)>
	//   66  133:istore_3        
			l1 = View.combineMeasuredStates(l1, view.getMeasuredState());
	//   67  134:iload           8
	//   68  136:aload           13
	//   69  138:invokevirtual   #67  <Method int View.getMeasuredState()>
	//   70  141:invokestatic    #70  <Method int View.combineMeasuredStates(int, int)>
	//   71  144:istore          8
			l = k1;
	//   72  146:iload           7
	//   73  148:istore          4
			i1 = j1;
	//   74  150:iload           6
	//   75  152:istore          5
		}

	//   76  154:iload           10
	//   77  156:iconst_1        
	//   78  157:iadd            
	//   79  158:istore          10
	//*  80  160:goto            31
		j1 = k;
	//   81  163:iload_3         
	//   82  164:istore          6
		if(i1 != -1)
	//*  83  166:iload           5
	//*  84  168:iconst_m1       
	//*  85  169:icmpeq          196
		{
			j1 = Math.max(k, Math.max(l, getPaddingBottom()) + i1);
	//   86  172:iload_3         
	//   87  173:iload           4
	//   88  175:aload_0         
	//   89  176:invokevirtual   #73  <Method int getPaddingBottom()>
	//   90  179:invokestatic    #64  <Method int Math.max(int, int)>
	//   91  182:iload           5
	//   92  184:iadd            
	//   93  185:invokestatic    #64  <Method int Math.max(int, int)>
	//   94  188:istore          6
			baseline = i1;
	//   95  190:aload_0         
	//   96  191:iload           5
	//   97  193:putfield        #13  <Field int baseline>
		}
		k = Math.max(j1, getSuggestedMinimumHeight());
	//   98  196:iload           6
	//   99  198:aload_0         
	//  100  199:invokevirtual   #76  <Method int getSuggestedMinimumHeight()>
	//  101  202:invokestatic    #64  <Method int Math.max(int, int)>
	//  102  205:istore_3        
		setMeasuredDimension(View.resolveSizeAndState(Math.max(i2, getSuggestedMinimumWidth()), i, l1), View.resolveSizeAndState(k, j, l1 << 16));
	//  103  206:aload_0         
	//  104  207:iload           9
	//  105  209:aload_0         
	//  106  210:invokevirtual   #79  <Method int getSuggestedMinimumWidth()>
	//  107  213:invokestatic    #64  <Method int Math.max(int, int)>
	//  108  216:iload_1         
	//  109  217:iload           8
	//  110  219:invokestatic    #83  <Method int View.resolveSizeAndState(int, int, int)>
	//  111  222:iload_3         
	//  112  223:iload_2         
	//  113  224:iload           8
	//  114  226:bipush          16
	//  115  228:ishl            
	//  116  229:invokestatic    #83  <Method int View.resolveSizeAndState(int, int, int)>
	//  117  232:invokevirtual   #86  <Method void setMeasuredDimension(int, int)>
	//  118  235:return          
	}

	private int baseline;
}
