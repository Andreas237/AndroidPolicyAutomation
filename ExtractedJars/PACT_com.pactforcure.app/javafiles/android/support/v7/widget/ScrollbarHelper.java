// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			OrientationHelper

class ScrollbarHelper
{

	ScrollbarHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	static int computeScrollExtent(RecyclerView.State state, OrientationHelper orientationhelper, View view, View view1, RecyclerView.LayoutManager layoutmanager, boolean flag)
	{
		if(layoutmanager.getChildCount() == 0 || state.getItemCount() == 0 || view == null || view1 == null)
	//*   0    0:aload           4
	//*   1    2:invokevirtual   #17  <Method int RecyclerView$LayoutManager.getChildCount()>
	//*   2    5:ifeq            23
	//*   3    8:aload_0         
	//*   4    9:invokevirtual   #22  <Method int RecyclerView$State.getItemCount()>
	//*   5   12:ifeq            23
	//*   6   15:aload_2         
	//*   7   16:ifnull          23
	//*   8   19:aload_3         
	//*   9   20:ifnonnull       25
			return 0;
	//   10   23:iconst_0        
	//   11   24:ireturn         
		if(!flag)
	//*  12   25:iload           5
	//*  13   27:ifne            49
		{
			return Math.abs(layoutmanager.getPosition(view) - layoutmanager.getPosition(view1)) + 1;
	//   14   30:aload           4
	//   15   32:aload_2         
	//   16   33:invokevirtual   #26  <Method int RecyclerView$LayoutManager.getPosition(View)>
	//   17   36:aload           4
	//   18   38:aload_3         
	//   19   39:invokevirtual   #26  <Method int RecyclerView$LayoutManager.getPosition(View)>
	//   20   42:isub            
	//   21   43:invokestatic    #32  <Method int Math.abs(int)>
	//   22   46:iconst_1        
	//   23   47:iadd            
	//   24   48:ireturn         
		} else
		{
			int i = orientationhelper.getDecoratedEnd(view1);
	//   25   49:aload_1         
	//   26   50:aload_3         
	//   27   51:invokevirtual   #37  <Method int OrientationHelper.getDecoratedEnd(View)>
	//   28   54:istore          6
			int j = orientationhelper.getDecoratedStart(view);
	//   29   56:aload_1         
	//   30   57:aload_2         
	//   31   58:invokevirtual   #40  <Method int OrientationHelper.getDecoratedStart(View)>
	//   32   61:istore          7
			return Math.min(orientationhelper.getTotalSpace(), i - j);
	//   33   63:aload_1         
	//   34   64:invokevirtual   #43  <Method int OrientationHelper.getTotalSpace()>
	//   35   67:iload           6
	//   36   69:iload           7
	//   37   71:isub            
	//   38   72:invokestatic    #47  <Method int Math.min(int, int)>
	//   39   75:ireturn         
		}
	}

	static int computeScrollOffset(RecyclerView.State state, OrientationHelper orientationhelper, View view, View view1, RecyclerView.LayoutManager layoutmanager, boolean flag, boolean flag1)
	{
		boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          8
		int j = ((int) (flag2));
	//    2    3:iload           8
	//    3    5:istore          9
		if(layoutmanager.getChildCount() != 0)
	//*   4    7:aload           4
	//*   5    9:invokevirtual   #17  <Method int RecyclerView$LayoutManager.getChildCount()>
	//*   6   12:ifeq            42
		{
			j = ((int) (flag2));
	//    7   15:iload           8
	//    8   17:istore          9
			if(state.getItemCount() != 0)
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #22  <Method int RecyclerView$State.getItemCount()>
	//*  11   23:ifeq            42
			{
				j = ((int) (flag2));
	//   12   26:iload           8
	//   13   28:istore          9
				if(view != null)
	//*  14   30:aload_2         
	//*  15   31:ifnull          42
					if(view1 == null)
	//*  16   34:aload_3         
	//*  17   35:ifnonnull       45
					{
						j = ((int) (flag2));
	//   18   38:iload           8
	//   19   40:istore          9
					} else
	//*  20   42:iload           9
	//*  21   44:ireturn         
					{
						int i = Math.min(layoutmanager.getPosition(view), layoutmanager.getPosition(view1));
	//   22   45:aload           4
	//   23   47:aload_2         
	//   24   48:invokevirtual   #26  <Method int RecyclerView$LayoutManager.getPosition(View)>
	//   25   51:aload           4
	//   26   53:aload_3         
	//   27   54:invokevirtual   #26  <Method int RecyclerView$LayoutManager.getPosition(View)>
	//   28   57:invokestatic    #47  <Method int Math.min(int, int)>
	//   29   60:istore          8
						j = Math.max(layoutmanager.getPosition(view), layoutmanager.getPosition(view1));
	//   30   62:aload           4
	//   31   64:aload_2         
	//   32   65:invokevirtual   #26  <Method int RecyclerView$LayoutManager.getPosition(View)>
	//   33   68:aload           4
	//   34   70:aload_3         
	//   35   71:invokevirtual   #26  <Method int RecyclerView$LayoutManager.getPosition(View)>
	//   36   74:invokestatic    #52  <Method int Math.max(int, int)>
	//   37   77:istore          9
						if(flag1)
	//*  38   79:iload           6
	//*  39   81:ifeq            175
							i = Math.max(0, state.getItemCount() - j - 1);
	//   40   84:iconst_0        
	//   41   85:aload_0         
	//   42   86:invokevirtual   #22  <Method int RecyclerView$State.getItemCount()>
	//   43   89:iload           9
	//   44   91:isub            
	//   45   92:iconst_1        
	//   46   93:isub            
	//   47   94:invokestatic    #52  <Method int Math.max(int, int)>
	//   48   97:istore          8
						else
	//*  49   99:iload           8
	//*  50  101:istore          9
	//*  51  103:iload           5
	//*  52  105:ifeq            42
	//*  53  108:aload_1         
	//*  54  109:aload_3         
	//*  55  110:invokevirtual   #37  <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  56  113:aload_1         
	//*  57  114:aload_2         
	//*  58  115:invokevirtual   #40  <Method int OrientationHelper.getDecoratedStart(View)>
	//*  59  118:isub            
	//*  60  119:invokestatic    #32  <Method int Math.abs(int)>
	//*  61  122:istore          9
	//*  62  124:aload           4
	//*  63  126:aload_2         
	//*  64  127:invokevirtual   #26  <Method int RecyclerView$LayoutManager.getPosition(View)>
	//*  65  130:aload           4
	//*  66  132:aload_3         
	//*  67  133:invokevirtual   #26  <Method int RecyclerView$LayoutManager.getPosition(View)>
	//*  68  136:isub            
	//*  69  137:invokestatic    #32  <Method int Math.abs(int)>
	//*  70  140:istore          10
	//*  71  142:iload           9
	//*  72  144:i2f             
	//*  73  145:iload           10
	//*  74  147:iconst_1        
	//*  75  148:iadd            
	//*  76  149:i2f             
	//*  77  150:fdiv            
	//*  78  151:fstore          7
	//*  79  153:iload           8
	//*  80  155:i2f             
	//*  81  156:fload           7
	//*  82  158:fmul            
	//*  83  159:aload_1         
	//*  84  160:invokevirtual   #55  <Method int OrientationHelper.getStartAfterPadding()>
	//*  85  163:aload_1         
	//*  86  164:aload_2         
	//*  87  165:invokevirtual   #40  <Method int OrientationHelper.getDecoratedStart(View)>
	//*  88  168:isub            
	//*  89  169:i2f             
	//*  90  170:fadd            
	//*  91  171:invokestatic    #59  <Method int Math.round(float)>
	//*  92  174:ireturn         
							i = Math.max(0, i);
	//   93  175:iconst_0        
	//   94  176:iload           8
	//   95  178:invokestatic    #52  <Method int Math.max(int, int)>
	//   96  181:istore          8
						j = i;
						if(flag)
						{
							int k = Math.abs(orientationhelper.getDecoratedEnd(view1) - orientationhelper.getDecoratedStart(view));
							int l = Math.abs(layoutmanager.getPosition(view) - layoutmanager.getPosition(view1));
							float f = (float)k / (float)(l + 1);
							return Math.round((float)i * f + (float)(orientationhelper.getStartAfterPadding() - orientationhelper.getDecoratedStart(view)));
						}
					}
			}
		}
		return j;
	//*  97  183:goto            99
	}

	static int computeScrollRange(RecyclerView.State state, OrientationHelper orientationhelper, View view, View view1, RecyclerView.LayoutManager layoutmanager, boolean flag)
	{
		if(layoutmanager.getChildCount() == 0 || state.getItemCount() == 0 || view == null || view1 == null)
	//*   0    0:aload           4
	//*   1    2:invokevirtual   #17  <Method int RecyclerView$LayoutManager.getChildCount()>
	//*   2    5:ifeq            23
	//*   3    8:aload_0         
	//*   4    9:invokevirtual   #22  <Method int RecyclerView$State.getItemCount()>
	//*   5   12:ifeq            23
	//*   6   15:aload_2         
	//*   7   16:ifnull          23
	//*   8   19:aload_3         
	//*   9   20:ifnonnull       25
			return 0;
	//   10   23:iconst_0        
	//   11   24:ireturn         
		if(!flag)
	//*  12   25:iload           5
	//*  13   27:ifne            35
		{
			return state.getItemCount();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #22  <Method int RecyclerView$State.getItemCount()>
	//   16   34:ireturn         
		} else
		{
			int i = orientationhelper.getDecoratedEnd(view1);
	//   17   35:aload_1         
	//   18   36:aload_3         
	//   19   37:invokevirtual   #37  <Method int OrientationHelper.getDecoratedEnd(View)>
	//   20   40:istore          6
			int j = orientationhelper.getDecoratedStart(view);
	//   21   42:aload_1         
	//   22   43:aload_2         
	//   23   44:invokevirtual   #40  <Method int OrientationHelper.getDecoratedStart(View)>
	//   24   47:istore          7
			int k = Math.abs(layoutmanager.getPosition(view) - layoutmanager.getPosition(view1));
	//   25   49:aload           4
	//   26   51:aload_2         
	//   27   52:invokevirtual   #26  <Method int RecyclerView$LayoutManager.getPosition(View)>
	//   28   55:aload           4
	//   29   57:aload_3         
	//   30   58:invokevirtual   #26  <Method int RecyclerView$LayoutManager.getPosition(View)>
	//   31   61:isub            
	//   32   62:invokestatic    #32  <Method int Math.abs(int)>
	//   33   65:istore          8
			return (int)(((float)(i - j) / (float)(k + 1)) * (float)state.getItemCount());
	//   34   67:iload           6
	//   35   69:iload           7
	//   36   71:isub            
	//   37   72:i2f             
	//   38   73:iload           8
	//   39   75:iconst_1        
	//   40   76:iadd            
	//   41   77:i2f             
	//   42   78:fdiv            
	//   43   79:aload_0         
	//   44   80:invokevirtual   #22  <Method int RecyclerView$State.getItemCount()>
	//   45   83:i2f             
	//   46   84:fmul            
	//   47   85:f2i             
	//   48   86:ireturn         
		}
	}
}
