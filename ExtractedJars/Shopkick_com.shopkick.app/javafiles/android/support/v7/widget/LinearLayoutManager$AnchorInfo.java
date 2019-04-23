// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			LinearLayoutManager, OrientationHelper

static class LinearLayoutManager$AnchorInfo
{

	void assignCoordinateFromPadding()
	{
		int i;
		if(mLayoutFromEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field boolean mLayoutFromEnd>
	//*   2    4:ifeq            18
			i = mOrientationHelper.getEndAfterPadding();
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field OrientationHelper mOrientationHelper>
	//    5   11:invokevirtual   #34  <Method int OrientationHelper.getEndAfterPadding()>
	//    6   14:istore_1        
		else
	//*   7   15:goto            26
			i = mOrientationHelper.getStartAfterPadding();
	//    8   18:aload_0         
	//    9   19:getfield        #28  <Field OrientationHelper mOrientationHelper>
	//   10   22:invokevirtual   #37  <Method int OrientationHelper.getStartAfterPadding()>
	//   11   25:istore_1        
		mCoordinate = i;
	//   12   26:aload_0         
	//   13   27:iload_1         
	//   14   28:putfield        #39  <Field int mCoordinate>
	//   15   31:return          
	}

	public void assignFromView(View view, int i)
	{
		if(mLayoutFromEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field boolean mLayoutFromEnd>
	//*   2    4:ifeq            30
			mCoordinate = mOrientationHelper.getDecoratedEnd(view) + mOrientationHelper.getTotalSpaceChange();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field OrientationHelper mOrientationHelper>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #45  <Method int OrientationHelper.getDecoratedEnd(View)>
	//    8   16:aload_0         
	//    9   17:getfield        #28  <Field OrientationHelper mOrientationHelper>
	//   10   20:invokevirtual   #48  <Method int OrientationHelper.getTotalSpaceChange()>
	//   11   23:iadd            
	//   12   24:putfield        #39  <Field int mCoordinate>
		else
	//*  13   27:goto            42
			mCoordinate = mOrientationHelper.getDecoratedStart(view);
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #28  <Field OrientationHelper mOrientationHelper>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #51  <Method int OrientationHelper.getDecoratedStart(View)>
	//   19   39:putfield        #39  <Field int mCoordinate>
		mPosition = i;
	//   20   42:aload_0         
	//   21   43:iload_2         
	//   22   44:putfield        #53  <Field int mPosition>
	//   23   47:return          
	}

	public void assignFromViewAndKeepVisibleRect(View view, int i)
	{
		int j = mOrientationHelper.getTotalSpaceChange();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field OrientationHelper mOrientationHelper>
	//    2    4:invokevirtual   #48  <Method int OrientationHelper.getTotalSpaceChange()>
	//    3    7:istore_3        
		if(j >= 0)
	//*   4    8:iload_3         
	//*   5    9:iflt            19
		{
			assignFromView(view, i);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:invokevirtual   #56  <Method void assignFromView(View, int)>
			return;
	//   10   18:return          
		}
		mPosition = i;
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:putfield        #53  <Field int mPosition>
		if(mLayoutFromEnd)
	//*  14   24:aload_0         
	//*  15   25:getfield        #26  <Field boolean mLayoutFromEnd>
	//*  16   28:ifeq            135
		{
			i = mOrientationHelper.getEndAfterPadding() - j - mOrientationHelper.getDecoratedEnd(view);
	//   17   31:aload_0         
	//   18   32:getfield        #28  <Field OrientationHelper mOrientationHelper>
	//   19   35:invokevirtual   #34  <Method int OrientationHelper.getEndAfterPadding()>
	//   20   38:iload_3         
	//   21   39:isub            
	//   22   40:aload_0         
	//   23   41:getfield        #28  <Field OrientationHelper mOrientationHelper>
	//   24   44:aload_1         
	//   25   45:invokevirtual   #45  <Method int OrientationHelper.getDecoratedEnd(View)>
	//   26   48:isub            
	//   27   49:istore_2        
			mCoordinate = mOrientationHelper.getEndAfterPadding() - i;
	//   28   50:aload_0         
	//   29   51:aload_0         
	//   30   52:getfield        #28  <Field OrientationHelper mOrientationHelper>
	//   31   55:invokevirtual   #34  <Method int OrientationHelper.getEndAfterPadding()>
	//   32   58:iload_2         
	//   33   59:isub            
	//   34   60:putfield        #39  <Field int mCoordinate>
			if(i > 0)
	//*  35   63:iload_2         
	//*  36   64:ifle            240
			{
				j = mOrientationHelper.getDecoratedMeasurement(view);
	//   37   67:aload_0         
	//   38   68:getfield        #28  <Field OrientationHelper mOrientationHelper>
	//   39   71:aload_1         
	//   40   72:invokevirtual   #59  <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   41   75:istore_3        
				int k = mCoordinate;
	//   42   76:aload_0         
	//   43   77:getfield        #39  <Field int mCoordinate>
	//   44   80:istore          4
				int i1 = mOrientationHelper.getStartAfterPadding();
	//   45   82:aload_0         
	//   46   83:getfield        #28  <Field OrientationHelper mOrientationHelper>
	//   47   86:invokevirtual   #37  <Method int OrientationHelper.getStartAfterPadding()>
	//   48   89:istore          5
				j = k - j - (i1 + Math.min(mOrientationHelper.getDecoratedStart(view) - i1, 0));
	//   49   91:iload           4
	//   50   93:iload_3         
	//   51   94:isub            
	//   52   95:iload           5
	//   53   97:aload_0         
	//   54   98:getfield        #28  <Field OrientationHelper mOrientationHelper>
	//   55  101:aload_1         
	//   56  102:invokevirtual   #51  <Method int OrientationHelper.getDecoratedStart(View)>
	//   57  105:iload           5
	//   58  107:isub            
	//   59  108:iconst_0        
	//   60  109:invokestatic    #65  <Method int Math.min(int, int)>
	//   61  112:iadd            
	//   62  113:isub            
	//   63  114:istore_3        
				if(j < 0)
	//*  64  115:iload_3         
	//*  65  116:ifge            240
				{
					mCoordinate = mCoordinate + Math.min(i, -j);
	//   66  119:aload_0         
	//   67  120:aload_0         
	//   68  121:getfield        #39  <Field int mCoordinate>
	//   69  124:iload_2         
	//   70  125:iload_3         
	//   71  126:ineg            
	//   72  127:invokestatic    #65  <Method int Math.min(int, int)>
	//   73  130:iadd            
	//   74  131:putfield        #39  <Field int mCoordinate>
					return;
	//   75  134:return          
				}
			}
		} else
		{
			int l = mOrientationHelper.getDecoratedStart(view);
	//   76  135:aload_0         
	//   77  136:getfield        #28  <Field OrientationHelper mOrientationHelper>
	//   78  139:aload_1         
	//   79  140:invokevirtual   #51  <Method int OrientationHelper.getDecoratedStart(View)>
	//   80  143:istore          4
			i = l - mOrientationHelper.getStartAfterPadding();
	//   81  145:iload           4
	//   82  147:aload_0         
	//   83  148:getfield        #28  <Field OrientationHelper mOrientationHelper>
	//   84  151:invokevirtual   #37  <Method int OrientationHelper.getStartAfterPadding()>
	//   85  154:isub            
	//   86  155:istore_2        
			mCoordinate = l;
	//   87  156:aload_0         
	//   88  157:iload           4
	//   89  159:putfield        #39  <Field int mCoordinate>
			if(i > 0)
	//*  90  162:iload_2         
	//*  91  163:ifle            240
			{
				int j1 = mOrientationHelper.getDecoratedMeasurement(view);
	//   92  166:aload_0         
	//   93  167:getfield        #28  <Field OrientationHelper mOrientationHelper>
	//   94  170:aload_1         
	//   95  171:invokevirtual   #59  <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   96  174:istore          5
				int k1 = mOrientationHelper.getEndAfterPadding();
	//   97  176:aload_0         
	//   98  177:getfield        #28  <Field OrientationHelper mOrientationHelper>
	//   99  180:invokevirtual   #34  <Method int OrientationHelper.getEndAfterPadding()>
	//  100  183:istore          6
				int l1 = mOrientationHelper.getDecoratedEnd(view);
	//  101  185:aload_0         
	//  102  186:getfield        #28  <Field OrientationHelper mOrientationHelper>
	//  103  189:aload_1         
	//  104  190:invokevirtual   #45  <Method int OrientationHelper.getDecoratedEnd(View)>
	//  105  193:istore          7
				j = mOrientationHelper.getEndAfterPadding() - Math.min(0, k1 - j - l1) - (l + j1);
	//  106  195:aload_0         
	//  107  196:getfield        #28  <Field OrientationHelper mOrientationHelper>
	//  108  199:invokevirtual   #34  <Method int OrientationHelper.getEndAfterPadding()>
	//  109  202:iconst_0        
	//  110  203:iload           6
	//  111  205:iload_3         
	//  112  206:isub            
	//  113  207:iload           7
	//  114  209:isub            
	//  115  210:invokestatic    #65  <Method int Math.min(int, int)>
	//  116  213:isub            
	//  117  214:iload           4
	//  118  216:iload           5
	//  119  218:iadd            
	//  120  219:isub            
	//  121  220:istore_3        
				if(j < 0)
	//* 122  221:iload_3         
	//* 123  222:ifge            240
					mCoordinate = mCoordinate - Math.min(i, -j);
	//  124  225:aload_0         
	//  125  226:aload_0         
	//  126  227:getfield        #39  <Field int mCoordinate>
	//  127  230:iload_2         
	//  128  231:iload_3         
	//  129  232:ineg            
	//  130  233:invokestatic    #65  <Method int Math.min(int, int)>
	//  131  236:isub            
	//  132  237:putfield        #39  <Field int mCoordinate>
			}
		}
	//  133  240:return          
	}

	boolean isViewValidAsAnchor(View view, RecyclerView.State state)
	{
		view = ((View) ((RecyclerView.LayoutParams)view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #73  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #75  <Class RecyclerView$LayoutParams>
	//    3    7:astore_1        
		return !((RecyclerView.LayoutParams) (view)).isItemRemoved() && ((RecyclerView.LayoutParams) (view)).getViewLayoutPosition() >= 0 && ((RecyclerView.LayoutParams) (view)).getViewLayoutPosition() < state.getItemCount();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #79  <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
	//    6   12:ifne            35
	//    7   15:aload_1         
	//    8   16:invokevirtual   #82  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
	//    9   19:iflt            35
	//   10   22:aload_1         
	//   11   23:invokevirtual   #82  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
	//   12   26:aload_2         
	//   13   27:invokevirtual   #87  <Method int RecyclerView$State.getItemCount()>
	//   14   30:icmpge          35
	//   15   33:iconst_1        
	//   16   34:ireturn         
	//   17   35:iconst_0        
	//   18   36:ireturn         
	}

	void reset()
	{
		mPosition = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #53  <Field int mPosition>
		mCoordinate = 0x80000000;
	//    3    5:aload_0         
	//    4    6:ldc1            #88  <Int 0x80000000>
	//    5    8:putfield        #39  <Field int mCoordinate>
		mLayoutFromEnd = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #26  <Field boolean mLayoutFromEnd>
		mValid = false;
	//    9   16:aload_0         
	//   10   17:iconst_0        
	//   11   18:putfield        #90  <Field boolean mValid>
	//   12   21:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #94  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #95  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("AnchorInfo{mPosition=");
	//    4    8:aload_1         
	//    5    9:ldc1            #97  <String "AnchorInfo{mPosition=">
	//    6   11:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mPosition);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #53  <Field int mPosition>
	//   11   20:invokevirtual   #104 <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(", mCoordinate=");
	//   13   24:aload_1         
	//   14   25:ldc1            #106 <String ", mCoordinate=">
	//   15   27:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mCoordinate);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #39  <Field int mCoordinate>
	//   20   36:invokevirtual   #104 <Method StringBuilder StringBuilder.append(int)>
	//   21   39:pop             
		stringbuilder.append(", mLayoutFromEnd=");
	//   22   40:aload_1         
	//   23   41:ldc1            #108 <String ", mLayoutFromEnd=">
	//   24   43:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(mLayoutFromEnd);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #26  <Field boolean mLayoutFromEnd>
	//   29   52:invokevirtual   #111 <Method StringBuilder StringBuilder.append(boolean)>
	//   30   55:pop             
		stringbuilder.append(", mValid=");
	//   31   56:aload_1         
	//   32   57:ldc1            #113 <String ", mValid=">
	//   33   59:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(mValid);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #90  <Field boolean mValid>
	//   38   68:invokevirtual   #111 <Method StringBuilder StringBuilder.append(boolean)>
	//   39   71:pop             
		stringbuilder.append('}');
	//   40   72:aload_1         
	//   41   73:bipush          125
	//   42   75:invokevirtual   #116 <Method StringBuilder StringBuilder.append(char)>
	//   43   78:pop             
		return stringbuilder.toString();
	//   44   79:aload_1         
	//   45   80:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   46   83:areturn         
	}

	int mCoordinate;
	boolean mLayoutFromEnd;
	OrientationHelper mOrientationHelper;
	int mPosition;
	boolean mValid;

	LinearLayoutManager$AnchorInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		reset();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #22  <Method void reset()>
	//    4    8:return          
	}
}
