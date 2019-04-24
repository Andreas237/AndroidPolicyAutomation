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
		mBaseline = -1;
	//    5    7:aload_0         
	//    6    8:iconst_m1       
	//    7    9:putfield        #13  <Field int mBaseline>
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
		mBaseline = -1;
	//    5    7:aload_0         
	//    6    8:iconst_m1       
	//    7    9:putfield        #13  <Field int mBaseline>
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
		mBaseline = -1;
	//    5    7:aload_0         
	//    6    8:iconst_m1       
	//    7    9:putfield        #13  <Field int mBaseline>
	//    8   12:return          
	}

	public int getBaseline()
	{
		return mBaseline;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field int mBaseline>
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
		j = 0;
	//   12   24:iconst_0        
	//   13   25:istore_3        
		while(j < j1) 
	//*  14   26:iload_3         
	//*  15   27:iload           7
	//*  16   29:icmpge          151
		{
			View view = getChildAt(j);
	//   17   32:aload_0         
	//   18   33:iload_3         
	//   19   34:invokevirtual   #35  <Method View getChildAt(int)>
	//   20   37:astore          13
			if(view.getVisibility() != 8)
	//*  21   39:aload           13
	//*  22   41:invokevirtual   #40  <Method int View.getVisibility()>
	//*  23   44:bipush          8
	//*  24   46:icmpne          56
	//*  25   49:iload_3         
	//*  26   50:iconst_1        
	//*  27   51:iadd            
	//*  28   52:istore_3        
	//*  29   53:goto            26
			{
				int i2 = view.getMeasuredWidth();
	//   30   56:aload           13
	//   31   58:invokevirtual   #43  <Method int View.getMeasuredWidth()>
	//   32   61:istore          10
				int j2 = view.getMeasuredHeight();
	//   33   63:aload           13
	//   34   65:invokevirtual   #46  <Method int View.getMeasuredHeight()>
	//   35   68:istore          11
				int k2 = k1 + (k - i - l1 - k1 - i2) / 2;
	//   36   70:iload           8
	//   37   72:iload           4
	//   38   74:iload_2         
	//   39   75:isub            
	//   40   76:iload           9
	//   41   78:isub            
	//   42   79:iload           8
	//   43   81:isub            
	//   44   82:iload           10
	//   45   84:isub            
	//   46   85:iconst_2        
	//   47   86:idiv            
	//   48   87:iadd            
	//   49   88:istore          12
				if(mBaseline != -1 && view.getBaseline() != -1)
	//*  50   90:aload_0         
	//*  51   91:getfield        #13  <Field int mBaseline>
	//*  52   94:iconst_m1       
	//*  53   95:icmpeq          144
	//*  54   98:aload           13
	//*  55  100:invokevirtual   #48  <Method int View.getBaseline()>
	//*  56  103:iconst_m1       
	//*  57  104:icmpeq          144
					l = (mBaseline + i1) - view.getBaseline();
	//   58  107:aload_0         
	//   59  108:getfield        #13  <Field int mBaseline>
	//   60  111:iload           6
	//   61  113:iadd            
	//   62  114:aload           13
	//   63  116:invokevirtual   #48  <Method int View.getBaseline()>
	//   64  119:isub            
	//   65  120:istore          5
				else
	//*  66  122:aload           13
	//*  67  124:iload           12
	//*  68  126:iload           5
	//*  69  128:iload           10
	//*  70  130:iload           12
	//*  71  132:iadd            
	//*  72  133:iload           11
	//*  73  135:iload           5
	//*  74  137:iadd            
	//*  75  138:invokevirtual   #52  <Method void View.layout(int, int, int, int)>
	//*  76  141:goto            49
					l = i1;
	//   77  144:iload           6
	//   78  146:istore          5
				view.layout(k2, l, i2 + k2, j2 + l);
			}
			j++;
		}
	//*  79  148:goto            122
	//   80  151:return          
	}

	protected void onMeasure(int i, int j)
	{
		int j3 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method int getChildCount()>
	//    2    4:istore          11
		int l2 = 0;
	//    3    6:iconst_0        
	//    4    7:istore          9
		int i1 = 0;
	//    5    9:iconst_0        
	//    6   10:istore          5
		int l = -1;
	//    7   12:iconst_m1       
	//    8   13:istore          4
		int j1 = 0;
	//    9   15:iconst_0        
	//   10   16:istore          6
		int i3 = 0;
	//   11   18:iconst_0        
	//   12   19:istore          10
		int k = -1;
	//   13   21:iconst_m1       
	//   14   22:istore_3        
		while(l2 < j3) 
	//*  15   23:iload           9
	//*  16   25:iload           11
	//*  17   27:icmpge          174
		{
			View view = getChildAt(l2);
	//   18   30:aload_0         
	//   19   31:iload           9
	//   20   33:invokevirtual   #35  <Method View getChildAt(int)>
	//   21   36:astore          13
			int l1;
			if(view.getVisibility() == 8)
	//*  22   38:aload           13
	//*  23   40:invokevirtual   #40  <Method int View.getVisibility()>
	//*  24   43:bipush          8
	//*  25   45:icmpne          77
			{
				int k1 = i1;
	//   26   48:iload           5
	//   27   50:istore          7
				i1 = k;
	//   28   52:iload_3         
	//   29   53:istore          5
				k = k1;
	//   30   55:iload           7
	//   31   57:istore_3        
			} else
	//*  32   58:iload           9
	//*  33   60:iconst_1        
	//*  34   61:iadd            
	//*  35   62:istore          9
	//*  36   64:iload_3         
	//*  37   65:istore          7
	//*  38   67:iload           5
	//*  39   69:istore_3        
	//*  40   70:iload           7
	//*  41   72:istore          5
	//*  42   74:goto            23
			{
				measureChild(view, i, j);
	//   43   77:aload_0         
	//   44   78:aload           13
	//   45   80:iload_1         
	//   46   81:iload_2         
	//   47   82:invokevirtual   #58  <Method void measureChild(View, int, int)>
				int k3 = view.getBaseline();
	//   48   85:aload           13
	//   49   87:invokevirtual   #48  <Method int View.getBaseline()>
	//   50   90:istore          12
				int i2 = k;
	//   51   92:iload_3         
	//   52   93:istore          7
				int k2 = l;
	//   53   95:iload           4
	//   54   97:istore          8
				if(k3 != -1)
	//*  55   99:iload           12
	//*  56  101:iconst_m1       
	//*  57  102:icmpeq          128
				{
					k2 = Math.max(l, k3);
	//   58  105:iload           4
	//   59  107:iload           12
	//   60  109:invokestatic    #64  <Method int Math.max(int, int)>
	//   61  112:istore          8
					i2 = Math.max(k, view.getMeasuredHeight() - k3);
	//   62  114:iload_3         
	//   63  115:aload           13
	//   64  117:invokevirtual   #46  <Method int View.getMeasuredHeight()>
	//   65  120:iload           12
	//   66  122:isub            
	//   67  123:invokestatic    #64  <Method int Math.max(int, int)>
	//   68  126:istore          7
				}
				i3 = Math.max(i3, view.getMeasuredWidth());
	//   69  128:iload           10
	//   70  130:aload           13
	//   71  132:invokevirtual   #43  <Method int View.getMeasuredWidth()>
	//   72  135:invokestatic    #64  <Method int Math.max(int, int)>
	//   73  138:istore          10
				j1 = Math.max(j1, view.getMeasuredHeight());
	//   74  140:iload           6
	//   75  142:aload           13
	//   76  144:invokevirtual   #46  <Method int View.getMeasuredHeight()>
	//   77  147:invokestatic    #64  <Method int Math.max(int, int)>
	//   78  150:istore          6
				k = View.combineMeasuredStates(i1, view.getMeasuredState());
	//   79  152:iload           5
	//   80  154:aload           13
	//   81  156:invokevirtual   #67  <Method int View.getMeasuredState()>
	//   82  159:invokestatic    #70  <Method int View.combineMeasuredStates(int, int)>
	//   83  162:istore_3        
				l = k2;
	//   84  163:iload           8
	//   85  165:istore          4
				i1 = i2;
	//   86  167:iload           7
	//   87  169:istore          5
			}
			l2++;
			l1 = k;
			k = i1;
			i1 = l1;
		}
	//*  88  171:goto            58
		int j2 = j1;
	//   89  174:iload           6
	//   90  176:istore          7
		if(l != -1)
	//*  91  178:iload           4
	//*  92  180:iconst_m1       
	//*  93  181:icmpeq          208
		{
			j2 = Math.max(j1, Math.max(k, getPaddingBottom()) + l);
	//   94  184:iload           6
	//   95  186:iload_3         
	//   96  187:aload_0         
	//   97  188:invokevirtual   #73  <Method int getPaddingBottom()>
	//   98  191:invokestatic    #64  <Method int Math.max(int, int)>
	//   99  194:iload           4
	//  100  196:iadd            
	//  101  197:invokestatic    #64  <Method int Math.max(int, int)>
	//  102  200:istore          7
			mBaseline = l;
	//  103  202:aload_0         
	//  104  203:iload           4
	//  105  205:putfield        #13  <Field int mBaseline>
		}
		k = Math.max(j2, getSuggestedMinimumHeight());
	//  106  208:iload           7
	//  107  210:aload_0         
	//  108  211:invokevirtual   #76  <Method int getSuggestedMinimumHeight()>
	//  109  214:invokestatic    #64  <Method int Math.max(int, int)>
	//  110  217:istore_3        
		setMeasuredDimension(View.resolveSizeAndState(Math.max(i3, getSuggestedMinimumWidth()), i, i1), View.resolveSizeAndState(k, j, i1 << 16));
	//  111  218:aload_0         
	//  112  219:iload           10
	//  113  221:aload_0         
	//  114  222:invokevirtual   #79  <Method int getSuggestedMinimumWidth()>
	//  115  225:invokestatic    #64  <Method int Math.max(int, int)>
	//  116  228:iload_1         
	//  117  229:iload           5
	//  118  231:invokestatic    #83  <Method int View.resolveSizeAndState(int, int, int)>
	//  119  234:iload_3         
	//  120  235:iload_2         
	//  121  236:iload           5
	//  122  238:bipush          16
	//  123  240:ishl            
	//  124  241:invokestatic    #83  <Method int View.resolveSizeAndState(int, int, int)>
	//  125  244:invokevirtual   #86  <Method void setMeasuredDimension(int, int)>
	//  126  247:return          
	}

	private int mBaseline;
}
