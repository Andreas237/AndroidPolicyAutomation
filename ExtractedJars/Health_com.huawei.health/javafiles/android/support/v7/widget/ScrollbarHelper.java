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
		int i = Math.min(layoutmanager.getPosition(view), layoutmanager.getPosition(view1));
	//   12   25:aload           4
	//   13   27:aload_2         
	//   14   28:invokevirtual   #26  <Method int RecyclerView$LayoutManager.getPosition(View)>
	//   15   31:aload           4
	//   16   33:aload_3         
	//   17   34:invokevirtual   #26  <Method int RecyclerView$LayoutManager.getPosition(View)>
	//   18   37:invokestatic    #47  <Method int Math.min(int, int)>
	//   19   40:istore          8
		int j = Math.max(layoutmanager.getPosition(view), layoutmanager.getPosition(view1));
	//   20   42:aload           4
	//   21   44:aload_2         
	//   22   45:invokevirtual   #26  <Method int RecyclerView$LayoutManager.getPosition(View)>
	//   23   48:aload           4
	//   24   50:aload_3         
	//   25   51:invokevirtual   #26  <Method int RecyclerView$LayoutManager.getPosition(View)>
	//   26   54:invokestatic    #52  <Method int Math.max(int, int)>
	//   27   57:istore          9
		if(flag1)
	//*  28   59:iload           6
	//*  29   61:ifeq            82
			i = Math.max(0, state.getItemCount() - j - 1);
	//   30   64:iconst_0        
	//   31   65:aload_0         
	//   32   66:invokevirtual   #22  <Method int RecyclerView$State.getItemCount()>
	//   33   69:iload           9
	//   34   71:isub            
	//   35   72:iconst_1        
	//   36   73:isub            
	//   37   74:invokestatic    #52  <Method int Math.max(int, int)>
	//   38   77:istore          8
		else
	//*  39   79:goto            90
			i = Math.max(0, i);
	//   40   82:iconst_0        
	//   41   83:iload           8
	//   42   85:invokestatic    #52  <Method int Math.max(int, int)>
	//   43   88:istore          8
		if(!flag)
	//*  44   90:iload           5
	//*  45   92:ifne            98
		{
			return i;
	//   46   95:iload           8
	//   47   97:ireturn         
		} else
		{
			int k = Math.abs(orientationhelper.getDecoratedEnd(view1) - orientationhelper.getDecoratedStart(view));
	//   48   98:aload_1         
	//   49   99:aload_3         
	//   50  100:invokevirtual   #37  <Method int OrientationHelper.getDecoratedEnd(View)>
	//   51  103:aload_1         
	//   52  104:aload_2         
	//   53  105:invokevirtual   #40  <Method int OrientationHelper.getDecoratedStart(View)>
	//   54  108:isub            
	//   55  109:invokestatic    #32  <Method int Math.abs(int)>
	//   56  112:istore          9
			int l = Math.abs(layoutmanager.getPosition(view) - layoutmanager.getPosition(view1));
	//   57  114:aload           4
	//   58  116:aload_2         
	//   59  117:invokevirtual   #26  <Method int RecyclerView$LayoutManager.getPosition(View)>
	//   60  120:aload           4
	//   61  122:aload_3         
	//   62  123:invokevirtual   #26  <Method int RecyclerView$LayoutManager.getPosition(View)>
	//   63  126:isub            
	//   64  127:invokestatic    #32  <Method int Math.abs(int)>
	//   65  130:istore          10
			float f = (float)k / (float)(l + 1);
	//   66  132:iload           9
	//   67  134:i2f             
	//   68  135:iload           10
	//   69  137:iconst_1        
	//   70  138:iadd            
	//   71  139:i2f             
	//   72  140:fdiv            
	//   73  141:fstore          7
			return Math.round((float)i * f + (float)(orientationhelper.getStartAfterPadding() - orientationhelper.getDecoratedStart(view)));
	//   74  143:iload           8
	//   75  145:i2f             
	//   76  146:fload           7
	//   77  148:fmul            
	//   78  149:aload_1         
	//   79  150:invokevirtual   #55  <Method int OrientationHelper.getStartAfterPadding()>
	//   80  153:aload_1         
	//   81  154:aload_2         
	//   82  155:invokevirtual   #40  <Method int OrientationHelper.getDecoratedStart(View)>
	//   83  158:isub            
	//   84  159:i2f             
	//   85  160:fadd            
	//   86  161:invokestatic    #59  <Method int Math.round(float)>
	//   87  164:ireturn         
		}
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
