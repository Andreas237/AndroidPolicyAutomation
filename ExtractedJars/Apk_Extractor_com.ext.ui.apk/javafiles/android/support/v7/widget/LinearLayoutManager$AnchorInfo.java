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
	//*   2    4:ifeq            24
			i = mOrientationHelper.getEndAfterPadding();
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field LinearLayoutManager this$0>
	//    5   11:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//    6   14:invokevirtual   #39  <Method int OrientationHelper.getEndAfterPadding()>
	//    7   17:istore_1        
		else
	//*   8   18:aload_0         
	//*   9   19:iload_1         
	//*  10   20:putfield        #41  <Field int mCoordinate>
	//*  11   23:return          
			i = mOrientationHelper.getStartAfterPadding();
	//   12   24:aload_0         
	//   13   25:getfield        #19  <Field LinearLayoutManager this$0>
	//   14   28:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//   15   31:invokevirtual   #44  <Method int OrientationHelper.getStartAfterPadding()>
	//   16   34:istore_1        
		mCoordinate = i;
	//*  17   35:goto            18
	}

	public void assignFromView(View view)
	{
		if(mLayoutFromEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field boolean mLayoutFromEnd>
	//*   2    4:ifeq            46
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
	//   14   30:putfield        #41  <Field int mCoordinate>
		else
	//*  15   33:aload_0         
	//*  16   34:aload_0         
	//*  17   35:getfield        #19  <Field LinearLayoutManager this$0>
	//*  18   38:aload_1         
	//*  19   39:invokevirtual   #56  <Method int LinearLayoutManager.getPosition(View)>
	//*  20   42:putfield        #58  <Field int mPosition>
	//*  21   45:return          
			mCoordinate = mOrientationHelper.getDecoratedStart(view);
	//   22   46:aload_0         
	//   23   47:aload_0         
	//   24   48:getfield        #19  <Field LinearLayoutManager this$0>
	//   25   51:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//   26   54:aload_1         
	//   27   55:invokevirtual   #61  <Method int OrientationHelper.getDecoratedStart(View)>
	//   28   58:putfield        #41  <Field int mCoordinate>
		mPosition = getPosition(view);
	//*  29   61:goto            33
	}

	public void assignFromViewAndKeepVisibleRect(View view)
	{
		int k = mOrientationHelper.getTotalSpaceChange();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field LinearLayoutManager this$0>
	//    2    4:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//    3    7:invokevirtual   #53  <Method int OrientationHelper.getTotalSpaceChange()>
	//    4   10:istore_3        
		if(k < 0) goto _L2; else goto _L1
	//    5   11:iload_3         
	//    6   12:iflt            21
_L1:
		assignFromView(view);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #64  <Method void assignFromView(View)>
_L4:
		return;
	//   10   20:return          
_L2:
		mPosition = getPosition(view);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #19  <Field LinearLayoutManager this$0>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #56  <Method int LinearLayoutManager.getPosition(View)>
	//   16   30:putfield        #58  <Field int mPosition>
		if(!mLayoutFromEnd)
			break; /* Loop/switch isn't completed */
	//   17   33:aload_0         
	//   18   34:getfield        #29  <Field boolean mLayoutFromEnd>
	//   19   37:ifeq            166
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
	//   40   78:putfield        #41  <Field int mCoordinate>
		if(i > 0)
	//*  41   81:iload_2         
	//*  42   82:ifle            20
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
	//   50   98:getfield        #41  <Field int mCoordinate>
	//   51  101:istore          4
			int k1 = mOrientationHelper.getStartAfterPadding();
	//   52  103:aload_0         
	//   53  104:getfield        #19  <Field LinearLayoutManager this$0>
	//   54  107:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//   55  110:invokevirtual   #44  <Method int OrientationHelper.getStartAfterPadding()>
	//   56  113:istore          5
			k = l - k - (k1 + Math.min(mOrientationHelper.getDecoratedStart(view) - k1, 0));
	//   57  115:iload           4
	//   58  117:iload_3         
	//   59  118:isub            
	//   60  119:iload           5
	//   61  121:aload_0         
	//   62  122:getfield        #19  <Field LinearLayoutManager this$0>
	//   63  125:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//   64  128:aload_1         
	//   65  129:invokevirtual   #61  <Method int OrientationHelper.getDecoratedStart(View)>
	//   66  132:iload           5
	//   67  134:isub            
	//   68  135:iconst_0        
	//   69  136:invokestatic    #73  <Method int Math.min(int, int)>
	//   70  139:iadd            
	//   71  140:isub            
	//   72  141:istore_3        
			if(k < 0)
	//*  73  142:iload_3         
	//*  74  143:ifge            20
			{
				int i1 = mCoordinate;
	//   75  146:aload_0         
	//   76  147:getfield        #41  <Field int mCoordinate>
	//   77  150:istore          4
				mCoordinate = Math.min(i, -k) + i1;
	//   78  152:aload_0         
	//   79  153:iload_2         
	//   80  154:iload_3         
	//   81  155:ineg            
	//   82  156:invokestatic    #73  <Method int Math.min(int, int)>
	//   83  159:iload           4
	//   84  161:iadd            
	//   85  162:putfield        #41  <Field int mCoordinate>
				return;
	//   86  165:return          
			}
		}
		if(true) goto _L4; else goto _L3
_L3:
		int j1 = mOrientationHelper.getDecoratedStart(view);
	//   87  166:aload_0         
	//   88  167:getfield        #19  <Field LinearLayoutManager this$0>
	//   89  170:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//   90  173:aload_1         
	//   91  174:invokevirtual   #61  <Method int OrientationHelper.getDecoratedStart(View)>
	//   92  177:istore          4
		int j = j1 - mOrientationHelper.getStartAfterPadding();
	//   93  179:iload           4
	//   94  181:aload_0         
	//   95  182:getfield        #19  <Field LinearLayoutManager this$0>
	//   96  185:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//   97  188:invokevirtual   #44  <Method int OrientationHelper.getStartAfterPadding()>
	//   98  191:isub            
	//   99  192:istore_2        
		mCoordinate = j1;
	//  100  193:aload_0         
	//  101  194:iload           4
	//  102  196:putfield        #41  <Field int mCoordinate>
		if(j > 0)
	//* 103  199:iload_2         
	//* 104  200:ifle            20
		{
			int l1 = mOrientationHelper.getDecoratedMeasurement(view);
	//  105  203:aload_0         
	//  106  204:getfield        #19  <Field LinearLayoutManager this$0>
	//  107  207:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//  108  210:aload_1         
	//  109  211:invokevirtual   #67  <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//  110  214:istore          5
			int i2 = mOrientationHelper.getEndAfterPadding();
	//  111  216:aload_0         
	//  112  217:getfield        #19  <Field LinearLayoutManager this$0>
	//  113  220:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//  114  223:invokevirtual   #39  <Method int OrientationHelper.getEndAfterPadding()>
	//  115  226:istore          6
			int j2 = mOrientationHelper.getDecoratedEnd(view);
	//  116  228:aload_0         
	//  117  229:getfield        #19  <Field LinearLayoutManager this$0>
	//  118  232:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//  119  235:aload_1         
	//  120  236:invokevirtual   #50  <Method int OrientationHelper.getDecoratedEnd(View)>
	//  121  239:istore          7
			k = mOrientationHelper.getEndAfterPadding() - Math.min(0, i2 - k - j2) - (j1 + l1);
	//  122  241:aload_0         
	//  123  242:getfield        #19  <Field LinearLayoutManager this$0>
	//  124  245:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
	//  125  248:invokevirtual   #39  <Method int OrientationHelper.getEndAfterPadding()>
	//  126  251:iconst_0        
	//  127  252:iload           6
	//  128  254:iload_3         
	//  129  255:isub            
	//  130  256:iload           7
	//  131  258:isub            
	//  132  259:invokestatic    #73  <Method int Math.min(int, int)>
	//  133  262:isub            
	//  134  263:iload           4
	//  135  265:iload           5
	//  136  267:iadd            
	//  137  268:isub            
	//  138  269:istore_3        
			if(k < 0)
	//* 139  270:iload_3         
	//* 140  271:ifge            20
			{
				mCoordinate = mCoordinate - Math.min(j, -k);
	//  141  274:aload_0         
	//  142  275:aload_0         
	//  143  276:getfield        #41  <Field int mCoordinate>
	//  144  279:iload_2         
	//  145  280:iload_3         
	//  146  281:ineg            
	//  147  282:invokestatic    #73  <Method int Math.min(int, int)>
	//  148  285:isub            
	//  149  286:putfield        #41  <Field int mCoordinate>
				return;
	//  150  289:return          
			}
		}
		if(true) goto _L4; else goto _L5
_L5:
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
	//    2    2:putfield        #58  <Field int mPosition>
		mCoordinate = 0x80000000;
	//    3    5:aload_0         
	//    4    6:ldc1            #96  <Int 0x80000000>
	//    5    8:putfield        #41  <Field int mCoordinate>
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
	//    6   13:getfield        #58  <Field int mPosition>
	//    7   16:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #114 <String ", mCoordinate=">
	//    9   21:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #41  <Field int mCoordinate>
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
