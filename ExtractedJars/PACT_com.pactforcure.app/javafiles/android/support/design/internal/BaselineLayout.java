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
	//*  69  128:iload           12
	//*  70  130:iload           10
	//*  71  132:iadd            
	//*  72  133:iload           5
	//*  73  135:iload           11
	//*  74  137:iadd            
	//*  75  138:invokevirtual   #52  <Method void View.layout(int, int, int, int)>
	//*  76  141:goto            49
					l = i1;
	//   77  144:iload           6
	//   78  146:istore          5
				view.layout(k2, l, k2 + i2, l + j2);
			}
			j++;
		}
	//*  79  148:goto            122
	//   80  151:return          
	}

	protected void onMeasure(int i, int j)
	{
		int l2 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method int getChildCount()>
	//    2    4:istore          11
		int k2 = 0;
	//    3    6:iconst_0        
	//    4    7:istore          10
		int k = 0;
	//    5    9:iconst_0        
	//    6   10:istore_3        
		int l = -1;
	//    7   11:iconst_m1       
	//    8   12:istore          4
		int i1 = -1;
	//    9   14:iconst_m1       
	//   10   15:istore          5
		int i2 = 0;
	//   11   17:iconst_0        
	//   12   18:istore          8
		int j2 = 0;
	//   13   20:iconst_0        
	//   14   21:istore          9
		while(j2 < l2) 
	//*  15   23:iload           9
	//*  16   25:iload           11
	//*  17   27:icmpge          155
		{
			View view = getChildAt(j2);
	//   18   30:aload_0         
	//   19   31:iload           9
	//   20   33:invokevirtual   #35  <Method View getChildAt(int)>
	//   21   36:astore          13
			if(view.getVisibility() != 8)
	//*  22   38:aload           13
	//*  23   40:invokevirtual   #40  <Method int View.getVisibility()>
	//*  24   43:bipush          8
	//*  25   45:icmpne          57
	//*  26   48:iload           9
	//*  27   50:iconst_1        
	//*  28   51:iadd            
	//*  29   52:istore          9
	//*  30   54:goto            23
			{
				measureChild(view, i, j);
	//   31   57:aload_0         
	//   32   58:aload           13
	//   33   60:iload_1         
	//   34   61:iload_2         
	//   35   62:invokevirtual   #58  <Method void measureChild(View, int, int)>
				int i3 = view.getBaseline();
	//   36   65:aload           13
	//   37   67:invokevirtual   #48  <Method int View.getBaseline()>
	//   38   70:istore          12
				int l1 = l;
	//   39   72:iload           4
	//   40   74:istore          7
				int j1 = i1;
	//   41   76:iload           5
	//   42   78:istore          6
				if(i3 != -1)
	//*  43   80:iload           12
	//*  44   82:iconst_m1       
	//*  45   83:icmpeq          110
				{
					l1 = Math.max(l, i3);
	//   46   86:iload           4
	//   47   88:iload           12
	//   48   90:invokestatic    #64  <Method int Math.max(int, int)>
	//   49   93:istore          7
					j1 = Math.max(i1, view.getMeasuredHeight() - i3);
	//   50   95:iload           5
	//   51   97:aload           13
	//   52   99:invokevirtual   #46  <Method int View.getMeasuredHeight()>
	//   53  102:iload           12
	//   54  104:isub            
	//   55  105:invokestatic    #64  <Method int Math.max(int, int)>
	//   56  108:istore          6
				}
				k2 = Math.max(k2, view.getMeasuredWidth());
	//   57  110:iload           10
	//   58  112:aload           13
	//   59  114:invokevirtual   #43  <Method int View.getMeasuredWidth()>
	//   60  117:invokestatic    #64  <Method int Math.max(int, int)>
	//   61  120:istore          10
				k = Math.max(k, view.getMeasuredHeight());
	//   62  122:iload_3         
	//   63  123:aload           13
	//   64  125:invokevirtual   #46  <Method int View.getMeasuredHeight()>
	//   65  128:invokestatic    #64  <Method int Math.max(int, int)>
	//   66  131:istore_3        
				i2 = View.combineMeasuredStates(i2, view.getMeasuredState());
	//   67  132:iload           8
	//   68  134:aload           13
	//   69  136:invokevirtual   #67  <Method int View.getMeasuredState()>
	//   70  139:invokestatic    #70  <Method int View.combineMeasuredStates(int, int)>
	//   71  142:istore          8
				l = l1;
	//   72  144:iload           7
	//   73  146:istore          4
				i1 = j1;
	//   74  148:iload           6
	//   75  150:istore          5
			}
			j2++;
		}
	//*  76  152:goto            48
		int k1 = k;
	//   77  155:iload_3         
	//   78  156:istore          6
		if(l != -1)
	//*  79  158:iload           4
	//*  80  160:iconst_m1       
	//*  81  161:icmpeq          188
		{
			k1 = Math.max(k, l + Math.max(i1, getPaddingBottom()));
	//   82  164:iload_3         
	//   83  165:iload           4
	//   84  167:iload           5
	//   85  169:aload_0         
	//   86  170:invokevirtual   #73  <Method int getPaddingBottom()>
	//   87  173:invokestatic    #64  <Method int Math.max(int, int)>
	//   88  176:iadd            
	//   89  177:invokestatic    #64  <Method int Math.max(int, int)>
	//   90  180:istore          6
			mBaseline = l;
	//   91  182:aload_0         
	//   92  183:iload           4
	//   93  185:putfield        #13  <Field int mBaseline>
		}
		k = Math.max(k1, getSuggestedMinimumHeight());
	//   94  188:iload           6
	//   95  190:aload_0         
	//   96  191:invokevirtual   #76  <Method int getSuggestedMinimumHeight()>
	//   97  194:invokestatic    #64  <Method int Math.max(int, int)>
	//   98  197:istore_3        
		setMeasuredDimension(View.resolveSizeAndState(Math.max(k2, getSuggestedMinimumWidth()), i, i2), View.resolveSizeAndState(k, j, i2 << 16));
	//   99  198:aload_0         
	//  100  199:iload           10
	//  101  201:aload_0         
	//  102  202:invokevirtual   #79  <Method int getSuggestedMinimumWidth()>
	//  103  205:invokestatic    #64  <Method int Math.max(int, int)>
	//  104  208:iload_1         
	//  105  209:iload           8
	//  106  211:invokestatic    #83  <Method int View.resolveSizeAndState(int, int, int)>
	//  107  214:iload_3         
	//  108  215:iload_2         
	//  109  216:iload           8
	//  110  218:bipush          16
	//  111  220:ishl            
	//  112  221:invokestatic    #83  <Method int View.resolveSizeAndState(int, int, int)>
	//  113  224:invokevirtual   #86  <Method void setMeasuredDimension(int, int)>
	//  114  227:return          
	}

	private int mBaseline;
}
