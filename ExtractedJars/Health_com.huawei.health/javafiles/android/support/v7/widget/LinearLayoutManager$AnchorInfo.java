// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			LinearLayoutManager, OrientationHelper

class LinearLayoutManager$AnchorInfo
{

	void assignCoordinateFromPadding()
	{
		int i;
		if(mLayoutFromEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field boolean mLayoutFromEnd>
	//*   2    4:ifeq            21
			i = mOrientationHelper.getEndAfterPadding();
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field LinearLayoutManager this$0>
	//    5   11:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//    6   14:invokevirtual   #39  <Method int OrientationHelper.getEndAfterPadding()>
	//    7   17:istore_1        
		else
	//*   8   18:goto            32
			i = mOrientationHelper.getStartAfterPadding();
	//    9   21:aload_0         
	//   10   22:getfield        #19  <Field LinearLayoutManager this$0>
	//   11   25:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//   12   28:invokevirtual   #42  <Method int OrientationHelper.getStartAfterPadding()>
	//   13   31:istore_1        
		mCoordinate = i;
	//   14   32:aload_0         
	//   15   33:iload_1         
	//   16   34:putfield        #44  <Field int mCoordinate>
	//   17   37:return          
	}

	public void assignFromView(View view)
	{
		if(mLayoutFromEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field boolean mLayoutFromEnd>
	//*   2    4:ifeq            36
			mCoordinate = mOrientationHelper.getDecoratedEnd(view) + mOrientationHelper.getTotalSpaceChange();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field LinearLayoutManager this$0>
	//    6   12:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #50  <Method int OrientationHelper.getDecoratedEnd(View)>
	//    9   19:aload_0         
	//   10   20:getfield        #19  <Field LinearLayoutManager this$0>
	//   11   23:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//   12   26:invokevirtual   #53  <Method int OrientationHelper.getTotalSpaceChange()>
	//   13   29:iadd            
	//   14   30:putfield        #44  <Field int mCoordinate>
		else
	//*  15   33:goto            51
			mCoordinate = mOrientationHelper.getDecoratedStart(view);
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:getfield        #19  <Field LinearLayoutManager this$0>
	//   19   41:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//   20   44:aload_1         
	//   21   45:invokevirtual   #56  <Method int OrientationHelper.getDecoratedStart(View)>
	//   22   48:putfield        #44  <Field int mCoordinate>
		mPosition = getPosition(view);
	//   23   51:aload_0         
	//   24   52:aload_0         
	//   25   53:getfield        #19  <Field LinearLayoutManager this$0>
	//   26   56:aload_1         
	//   27   57:invokevirtual   #59  <Method int LinearLayoutManager.getPosition(View)>
	//   28   60:putfield        #61  <Field int mPosition>
	//   29   63:return          
	}

	public void assignFromViewAndKeepVisibleRect(View view)
	{
		int k = mOrientationHelper.getTotalSpaceChange();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field LinearLayoutManager this$0>
	//    2    4:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//    3    7:invokevirtual   #53  <Method int OrientationHelper.getTotalSpaceChange()>
	//    4   10:istore_3        
		if(k >= 0)
	//*   5   11:iload_3         
	//*   6   12:iflt            21
		{
			assignFromView(view);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #64  <Method void assignFromView(View)>
			return;
	//   10   20:return          
		}
		mPosition = getPosition(view);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #19  <Field LinearLayoutManager this$0>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #59  <Method int LinearLayoutManager.getPosition(View)>
	//   16   30:putfield        #61  <Field int mPosition>
		if(mLayoutFromEnd)
	//*  17   33:aload_0         
	//*  18   34:getfield        #29  <Field boolean mLayoutFromEnd>
	//*  19   37:ifeq            162
		{
			int i = mOrientationHelper.getEndAfterPadding() - k - mOrientationHelper.getDecoratedEnd(view);
	//   20   40:aload_0         
	//   21   41:getfield        #19  <Field LinearLayoutManager this$0>
	//   22   44:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//   23   47:invokevirtual   #39  <Method int OrientationHelper.getEndAfterPadding()>
	//   24   50:iload_3         
	//   25   51:isub            
	//   26   52:aload_0         
	//   27   53:getfield        #19  <Field LinearLayoutManager this$0>
	//   28   56:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//   29   59:aload_1         
	//   30   60:invokevirtual   #50  <Method int OrientationHelper.getDecoratedEnd(View)>
	//   31   63:isub            
	//   32   64:istore_2        
			mCoordinate = mOrientationHelper.getEndAfterPadding() - i;
	//   33   65:aload_0         
	//   34   66:aload_0         
	//   35   67:getfield        #19  <Field LinearLayoutManager this$0>
	//   36   70:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//   37   73:invokevirtual   #39  <Method int OrientationHelper.getEndAfterPadding()>
	//   38   76:iload_2         
	//   39   77:isub            
	//   40   78:putfield        #44  <Field int mCoordinate>
			if(i > 0)
	//*  41   81:iload_2         
	//*  42   82:ifle            161
			{
				k = mOrientationHelper.getDecoratedMeasurement(view);
	//   43   85:aload_0         
	//   44   86:getfield        #19  <Field LinearLayoutManager this$0>
	//   45   89:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//   46   92:aload_1         
	//   47   93:invokevirtual   #67  <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   48   96:istore_3        
				int l = mCoordinate;
	//   49   97:aload_0         
	//   50   98:getfield        #44  <Field int mCoordinate>
	//   51  101:istore          4
				int j1 = mOrientationHelper.getStartAfterPadding();
	//   52  103:aload_0         
	//   53  104:getfield        #19  <Field LinearLayoutManager this$0>
	//   54  107:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//   55  110:invokevirtual   #42  <Method int OrientationHelper.getStartAfterPadding()>
	//   56  113:istore          5
				k = l - k - (j1 + Math.min(mOrientationHelper.getDecoratedStart(view) - j1, 0));
	//   57  115:iload           4
	//   58  117:iload_3         
	//   59  118:isub            
	//   60  119:iload           5
	//   61  121:aload_0         
	//   62  122:getfield        #19  <Field LinearLayoutManager this$0>
	//   63  125:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//   64  128:aload_1         
	//   65  129:invokevirtual   #56  <Method int OrientationHelper.getDecoratedStart(View)>
	//   66  132:iload           5
	//   67  134:isub            
	//   68  135:iconst_0        
	//   69  136:invokestatic    #73  <Method int Math.min(int, int)>
	//   70  139:iadd            
	//   71  140:isub            
	//   72  141:istore_3        
				if(k < 0)
	//*  73  142:iload_3         
	//*  74  143:ifge            161
					mCoordinate = mCoordinate + Math.min(i, -k);
	//   75  146:aload_0         
	//   76  147:aload_0         
	//   77  148:getfield        #44  <Field int mCoordinate>
	//   78  151:iload_2         
	//   79  152:iload_3         
	//   80  153:ineg            
	//   81  154:invokestatic    #73  <Method int Math.min(int, int)>
	//   82  157:iadd            
	//   83  158:putfield        #44  <Field int mCoordinate>
			}
			return;
	//   84  161:return          
		}
		int i1 = mOrientationHelper.getDecoratedStart(view);
	//   85  162:aload_0         
	//   86  163:getfield        #19  <Field LinearLayoutManager this$0>
	//   87  166:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//   88  169:aload_1         
	//   89  170:invokevirtual   #56  <Method int OrientationHelper.getDecoratedStart(View)>
	//   90  173:istore          4
		int j = i1 - mOrientationHelper.getStartAfterPadding();
	//   91  175:iload           4
	//   92  177:aload_0         
	//   93  178:getfield        #19  <Field LinearLayoutManager this$0>
	//   94  181:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//   95  184:invokevirtual   #42  <Method int OrientationHelper.getStartAfterPadding()>
	//   96  187:isub            
	//   97  188:istore_2        
		mCoordinate = i1;
	//   98  189:aload_0         
	//   99  190:iload           4
	//  100  192:putfield        #44  <Field int mCoordinate>
		if(j > 0)
	//* 101  195:iload_2         
	//* 102  196:ifle            285
		{
			int k1 = mOrientationHelper.getDecoratedMeasurement(view);
	//  103  199:aload_0         
	//  104  200:getfield        #19  <Field LinearLayoutManager this$0>
	//  105  203:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//  106  206:aload_1         
	//  107  207:invokevirtual   #67  <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//  108  210:istore          5
			int l1 = mOrientationHelper.getEndAfterPadding();
	//  109  212:aload_0         
	//  110  213:getfield        #19  <Field LinearLayoutManager this$0>
	//  111  216:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//  112  219:invokevirtual   #39  <Method int OrientationHelper.getEndAfterPadding()>
	//  113  222:istore          6
			int i2 = mOrientationHelper.getDecoratedEnd(view);
	//  114  224:aload_0         
	//  115  225:getfield        #19  <Field LinearLayoutManager this$0>
	//  116  228:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//  117  231:aload_1         
	//  118  232:invokevirtual   #50  <Method int OrientationHelper.getDecoratedEnd(View)>
	//  119  235:istore          7
			k = mOrientationHelper.getEndAfterPadding() - Math.min(0, l1 - k - i2) - (i1 + k1);
	//  120  237:aload_0         
	//  121  238:getfield        #19  <Field LinearLayoutManager this$0>
	//  122  241:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//  123  244:invokevirtual   #39  <Method int OrientationHelper.getEndAfterPadding()>
	//  124  247:iconst_0        
	//  125  248:iload           6
	//  126  250:iload_3         
	//  127  251:isub            
	//  128  252:iload           7
	//  129  254:isub            
	//  130  255:invokestatic    #73  <Method int Math.min(int, int)>
	//  131  258:isub            
	//  132  259:iload           4
	//  133  261:iload           5
	//  134  263:iadd            
	//  135  264:isub            
	//  136  265:istore_3        
			if(k < 0)
	//* 137  266:iload_3         
	//* 138  267:ifge            285
				mCoordinate = mCoordinate - Math.min(j, -k);
	//  139  270:aload_0         
	//  140  271:aload_0         
	//  141  272:getfield        #44  <Field int mCoordinate>
	//  142  275:iload_2         
	//  143  276:iload_3         
	//  144  277:ineg            
	//  145  278:invokestatic    #73  <Method int Math.min(int, int)>
	//  146  281:isub            
	//  147  282:putfield        #44  <Field int mCoordinate>
		}
	//  148  285:return          
	}

	boolean isViewValidAsAnchor(View view, RecyclerView.State state)
	{
		view = ((View) ((RecyclerView.LayoutParams)view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #81  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #83  <Class RecyclerView$LayoutParams>
	//    3    7:astore_1        
		return !((RecyclerView.LayoutParams) (view)).isItemRemoved() && ((RecyclerView.LayoutParams) (view)).getViewLayoutPosition() >= 0 && ((RecyclerView.LayoutParams) (view)).getViewLayoutPosition() < state.getItemCount();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #87  <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
	//    6   12:ifne            35
	//    7   15:aload_1         
	//    8   16:invokevirtual   #90  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
	//    9   19:iflt            35
	//   10   22:aload_1         
	//   11   23:invokevirtual   #90  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
	//   12   26:aload_2         
	//   13   27:invokevirtual   #95  <Method int RecyclerView$State.getItemCount()>
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
	//    2    2:putfield        #61  <Field int mPosition>
		mCoordinate = 0x80000000;
	//    3    5:aload_0         
	//    4    6:ldc1            #96  <Int 0x80000000>
	//    5    8:putfield        #44  <Field int mCoordinate>
		mLayoutFromEnd = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #29  <Field boolean mLayoutFromEnd>
		mValid = false;
	//    9   16:aload_0         
	//   10   17:iconst_0        
	//   11   18:putfield        #98  <Field boolean mValid>
	//   12   21:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("AnchorInfo{mPosition=").append(mPosition).append(", mCoordinate=").append(mCoordinate).append(", mLayoutFromEnd=").append(mLayoutFromEnd).append(", mValid=").append(mValid).append('}').toString();
	//    0    0:new             #102 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #103 <Method void StringBuilder()>
	//    3    7:ldc1            #105 <String "AnchorInfo{mPosition=">
	//    4    9:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #61  <Field int mPosition>
	//    7   16:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #114 <String ", mCoordinate=">
	//    9   21:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #44  <Field int mCoordinate>
	//   12   28:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc1            #116 <String ", mLayoutFromEnd=">
	//   14   33:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #29  <Field boolean mLayoutFromEnd>
	//   17   40:invokevirtual   #119 <Method StringBuilder StringBuilder.append(boolean)>
	//   18   43:ldc1            #121 <String ", mValid=">
	//   19   45:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #98  <Field boolean mValid>
	//   22   52:invokevirtual   #119 <Method StringBuilder StringBuilder.append(boolean)>
	//   23   55:bipush          125
	//   24   57:invokevirtual   #124 <Method StringBuilder StringBuilder.append(char)>
	//   25   60:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   26   63:areturn         
	}

	int mCoordinate;
	boolean mLayoutFromEnd;
	int mPosition;
	boolean mValid;
	final LinearLayoutManager this$0;

	LinearLayoutManager$AnchorInfo()
	{
		this$0 = LinearLayoutManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field LinearLayoutManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
		reset();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #25  <Method void reset()>
	//    7   13:return          
	}
}
