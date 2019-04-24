// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//			SlidingPaneLayout, ViewDragHelper

private class SlidingPaneLayout$DragHelperCallback extends ViewDragHelper.Callback
{

	public int clampViewPositionHorizontal(View view, int i, int j)
	{
		view = ((View) ((SlidingPaneLayout.LayoutParams)mSlideableView.getLayoutParams()));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SlidingPaneLayout this$0>
	//    2    4:getfield        #23  <Field View SlidingPaneLayout.mSlideableView>
	//    3    7:invokevirtual   #29  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    4   10:checkcast       #31  <Class SlidingPaneLayout$LayoutParams>
	//    5   13:astore_1        
		if(isLayoutRtlSupport())
	//*   6   14:aload_0         
	//*   7   15:getfield        #13  <Field SlidingPaneLayout this$0>
	//*   8   18:invokevirtual   #35  <Method boolean SlidingPaneLayout.isLayoutRtlSupport()>
	//*   9   21:ifeq            84
		{
			j = getWidth();
	//   10   24:aload_0         
	//   11   25:getfield        #13  <Field SlidingPaneLayout this$0>
	//   12   28:invokevirtual   #39  <Method int SlidingPaneLayout.getWidth()>
	//   13   31:istore_3        
			int k = getPaddingRight();
	//   14   32:aload_0         
	//   15   33:getfield        #13  <Field SlidingPaneLayout this$0>
	//   16   36:invokevirtual   #42  <Method int SlidingPaneLayout.getPaddingRight()>
	//   17   39:istore          4
			j -= ((SlidingPaneLayout.LayoutParams) (view)).rightMargin + k + mSlideableView.getWidth();
	//   18   41:iload_3         
	//   19   42:aload_1         
	//   20   43:getfield        #46  <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//   21   46:iload           4
	//   22   48:iadd            
	//   23   49:aload_0         
	//   24   50:getfield        #13  <Field SlidingPaneLayout this$0>
	//   25   53:getfield        #23  <Field View SlidingPaneLayout.mSlideableView>
	//   26   56:invokevirtual   #47  <Method int View.getWidth()>
	//   27   59:iadd            
	//   28   60:isub            
	//   29   61:istore_3        
			k = mSlideRange;
	//   30   62:aload_0         
	//   31   63:getfield        #13  <Field SlidingPaneLayout this$0>
	//   32   66:getfield        #50  <Field int SlidingPaneLayout.mSlideRange>
	//   33   69:istore          4
			return Math.max(Math.min(i, j), j - k);
	//   34   71:iload_2         
	//   35   72:iload_3         
	//   36   73:invokestatic    #56  <Method int Math.min(int, int)>
	//   37   76:iload_3         
	//   38   77:iload           4
	//   39   79:isub            
	//   40   80:invokestatic    #59  <Method int Math.max(int, int)>
	//   41   83:ireturn         
		} else
		{
			j = getPaddingLeft();
	//   42   84:aload_0         
	//   43   85:getfield        #13  <Field SlidingPaneLayout this$0>
	//   44   88:invokevirtual   #62  <Method int SlidingPaneLayout.getPaddingLeft()>
	//   45   91:istore_3        
			j = ((SlidingPaneLayout.LayoutParams) (view)).leftMargin + j;
	//   46   92:aload_1         
	//   47   93:getfield        #65  <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   48   96:iload_3         
	//   49   97:iadd            
	//   50   98:istore_3        
			int l = mSlideRange;
	//   51   99:aload_0         
	//   52  100:getfield        #13  <Field SlidingPaneLayout this$0>
	//   53  103:getfield        #50  <Field int SlidingPaneLayout.mSlideRange>
	//   54  106:istore          4
			return Math.min(Math.max(i, j), l + j);
	//   55  108:iload_2         
	//   56  109:iload_3         
	//   57  110:invokestatic    #59  <Method int Math.max(int, int)>
	//   58  113:iload           4
	//   59  115:iload_3         
	//   60  116:iadd            
	//   61  117:invokestatic    #56  <Method int Math.min(int, int)>
	//   62  120:ireturn         
		}
	}

	public int clampViewPositionVertical(View view, int i, int j)
	{
		return view.getTop();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #69  <Method int View.getTop()>
	//    2    4:ireturn         
	}

	public int getViewHorizontalDragRange(View view)
	{
		return mSlideRange;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SlidingPaneLayout this$0>
	//    2    4:getfield        #50  <Field int SlidingPaneLayout.mSlideRange>
	//    3    7:ireturn         
	}

	public void onEdgeDragStarted(int i, int j)
	{
		mDragHelper.captureChildView(mSlideableView, j);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SlidingPaneLayout this$0>
	//    2    4:getfield        #77  <Field ViewDragHelper SlidingPaneLayout.mDragHelper>
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field SlidingPaneLayout this$0>
	//    5   11:getfield        #23  <Field View SlidingPaneLayout.mSlideableView>
	//    6   14:iload_2         
	//    7   15:invokevirtual   #83  <Method void ViewDragHelper.captureChildView(View, int)>
	//    8   18:return          
	}

	public void onViewCaptured(View view, int i)
	{
		setAllChildrenVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SlidingPaneLayout this$0>
	//    2    4:invokevirtual   #87  <Method void SlidingPaneLayout.setAllChildrenVisible()>
	//    3    7:return          
	}

	public void onViewDragStateChanged(int i)
	{
label0:
		{
			if(mDragHelper.getViewDragState() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field SlidingPaneLayout this$0>
	//*   2    4:getfield        #77  <Field ViewDragHelper SlidingPaneLayout.mDragHelper>
	//*   3    7:invokevirtual   #92  <Method int ViewDragHelper.getViewDragState()>
	//*   4   10:ifne            61
			{
				if(mSlideOffset != 0.0F)
					break label0;
	//    5   13:aload_0         
	//    6   14:getfield        #13  <Field SlidingPaneLayout this$0>
	//    7   17:getfield        #96  <Field float SlidingPaneLayout.mSlideOffset>
	//    8   20:fconst_0        
	//    9   21:fcmpl           
	//   10   22:ifne            62
				updateObscuredViewsVisibility(mSlideableView);
	//   11   25:aload_0         
	//   12   26:getfield        #13  <Field SlidingPaneLayout this$0>
	//   13   29:aload_0         
	//   14   30:getfield        #13  <Field SlidingPaneLayout this$0>
	//   15   33:getfield        #23  <Field View SlidingPaneLayout.mSlideableView>
	//   16   36:invokevirtual   #100 <Method void SlidingPaneLayout.updateObscuredViewsVisibility(View)>
				dispatchOnPanelClosed(mSlideableView);
	//   17   39:aload_0         
	//   18   40:getfield        #13  <Field SlidingPaneLayout this$0>
	//   19   43:aload_0         
	//   20   44:getfield        #13  <Field SlidingPaneLayout this$0>
	//   21   47:getfield        #23  <Field View SlidingPaneLayout.mSlideableView>
	//   22   50:invokevirtual   #103 <Method void SlidingPaneLayout.dispatchOnPanelClosed(View)>
				mPreservedOpenState = false;
	//   23   53:aload_0         
	//   24   54:getfield        #13  <Field SlidingPaneLayout this$0>
	//   25   57:iconst_0        
	//   26   58:putfield        #107 <Field boolean SlidingPaneLayout.mPreservedOpenState>
			}
			return;
	//   27   61:return          
		}
		dispatchOnPanelOpened(mSlideableView);
	//   28   62:aload_0         
	//   29   63:getfield        #13  <Field SlidingPaneLayout this$0>
	//   30   66:aload_0         
	//   31   67:getfield        #13  <Field SlidingPaneLayout this$0>
	//   32   70:getfield        #23  <Field View SlidingPaneLayout.mSlideableView>
	//   33   73:invokevirtual   #110 <Method void SlidingPaneLayout.dispatchOnPanelOpened(View)>
		mPreservedOpenState = true;
	//   34   76:aload_0         
	//   35   77:getfield        #13  <Field SlidingPaneLayout this$0>
	//   36   80:iconst_1        
	//   37   81:putfield        #107 <Field boolean SlidingPaneLayout.mPreservedOpenState>
	//   38   84:return          
	}

	public void onViewPositionChanged(View view, int i, int j, int k, int l)
	{
		onPanelDragged(i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SlidingPaneLayout this$0>
	//    2    4:iload_2         
	//    3    5:invokevirtual   #115 <Method void SlidingPaneLayout.onPanelDragged(int)>
		invalidate();
	//    4    8:aload_0         
	//    5    9:getfield        #13  <Field SlidingPaneLayout this$0>
	//    6   12:invokevirtual   #118 <Method void SlidingPaneLayout.invalidate()>
	//    7   15:return          
	}

	public void onViewReleased(View view, float f, float f1)
	{
		SlidingPaneLayout.LayoutParams layoutparams = (SlidingPaneLayout.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #31  <Class SlidingPaneLayout$LayoutParams>
	//    3    7:astore          6
		if(!isLayoutRtlSupport()) goto _L2; else goto _L1
	//    4    9:aload_0         
	//    5   10:getfield        #13  <Field SlidingPaneLayout this$0>
	//    6   13:invokevirtual   #35  <Method boolean SlidingPaneLayout.isLayoutRtlSupport()>
	//    7   16:ifeq            135
_L1:
		int i;
label0:
		{
			i = getPaddingRight();
	//    8   19:aload_0         
	//    9   20:getfield        #13  <Field SlidingPaneLayout this$0>
	//   10   23:invokevirtual   #42  <Method int SlidingPaneLayout.getPaddingRight()>
	//   11   26:istore          4
			int j = layoutparams.rightMargin + i;
	//   12   28:aload           6
	//   13   30:getfield        #46  <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//   14   33:iload           4
	//   15   35:iadd            
	//   16   36:istore          5
			if(f >= 0.0F)
	//*  17   38:fload_2         
	//*  18   39:fconst_0        
	//*  19   40:fcmpg           
	//*  20   41:iflt            71
			{
				i = j;
	//   21   44:iload           5
	//   22   46:istore          4
				if(f != 0.0F)
					break label0;
	//   23   48:fload_2         
	//   24   49:fconst_0        
	//   25   50:fcmpl           
	//   26   51:ifne            83
				i = j;
	//   27   54:iload           5
	//   28   56:istore          4
				if(mSlideOffset <= 0.5F)
					break label0;
	//   29   58:aload_0         
	//   30   59:getfield        #13  <Field SlidingPaneLayout this$0>
	//   31   62:getfield        #96  <Field float SlidingPaneLayout.mSlideOffset>
	//   32   65:ldc1            #121 <Float 0.5F>
	//   33   67:fcmpl           
	//   34   68:ifle            83
			}
			i = j + mSlideRange;
	//   35   71:iload           5
	//   36   73:aload_0         
	//   37   74:getfield        #13  <Field SlidingPaneLayout this$0>
	//   38   77:getfield        #50  <Field int SlidingPaneLayout.mSlideRange>
	//   39   80:iadd            
	//   40   81:istore          4
		}
		int k = mSlideableView.getWidth();
	//   41   83:aload_0         
	//   42   84:getfield        #13  <Field SlidingPaneLayout this$0>
	//   43   87:getfield        #23  <Field View SlidingPaneLayout.mSlideableView>
	//   44   90:invokevirtual   #47  <Method int View.getWidth()>
	//   45   93:istore          5
		i = getWidth() - i - k;
	//   46   95:aload_0         
	//   47   96:getfield        #13  <Field SlidingPaneLayout this$0>
	//   48   99:invokevirtual   #39  <Method int SlidingPaneLayout.getWidth()>
	//   49  102:iload           4
	//   50  104:isub            
	//   51  105:iload           5
	//   52  107:isub            
	//   53  108:istore          4
_L4:
		mDragHelper.settleCapturedViewAt(i, view.getTop());
	//   54  110:aload_0         
	//   55  111:getfield        #13  <Field SlidingPaneLayout this$0>
	//   56  114:getfield        #77  <Field ViewDragHelper SlidingPaneLayout.mDragHelper>
	//   57  117:iload           4
	//   58  119:aload_1         
	//   59  120:invokevirtual   #69  <Method int View.getTop()>
	//   60  123:invokevirtual   #125 <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
	//   61  126:pop             
		invalidate();
	//   62  127:aload_0         
	//   63  128:getfield        #13  <Field SlidingPaneLayout this$0>
	//   64  131:invokevirtual   #118 <Method void SlidingPaneLayout.invalidate()>
		return;
	//   65  134:return          
_L2:
		i = getPaddingLeft();
	//   66  135:aload_0         
	//   67  136:getfield        #13  <Field SlidingPaneLayout this$0>
	//   68  139:invokevirtual   #62  <Method int SlidingPaneLayout.getPaddingLeft()>
	//   69  142:istore          4
		int l = layoutparams.leftMargin + i;
	//   70  144:aload           6
	//   71  146:getfield        #65  <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   72  149:iload           4
	//   73  151:iadd            
	//   74  152:istore          5
		if(f <= 0.0F)
	//*  75  154:fload_2         
	//*  76  155:fconst_0        
	//*  77  156:fcmpl           
	//*  78  157:ifgt            187
		{
			i = l;
	//   79  160:iload           5
	//   80  162:istore          4
			if(f != 0.0F)
				continue; /* Loop/switch isn't completed */
	//   81  164:fload_2         
	//   82  165:fconst_0        
	//   83  166:fcmpl           
	//   84  167:ifne            110
			i = l;
	//   85  170:iload           5
	//   86  172:istore          4
			if(mSlideOffset <= 0.5F)
				continue; /* Loop/switch isn't completed */
	//   87  174:aload_0         
	//   88  175:getfield        #13  <Field SlidingPaneLayout this$0>
	//   89  178:getfield        #96  <Field float SlidingPaneLayout.mSlideOffset>
	//   90  181:ldc1            #121 <Float 0.5F>
	//   91  183:fcmpl           
	//   92  184:ifle            110
		}
		i = l + mSlideRange;
	//   93  187:iload           5
	//   94  189:aload_0         
	//   95  190:getfield        #13  <Field SlidingPaneLayout this$0>
	//   96  193:getfield        #50  <Field int SlidingPaneLayout.mSlideRange>
	//   97  196:iadd            
	//   98  197:istore          4
		if(true) goto _L4; else goto _L3
	//   99  199:goto            110
_L3:
	}

	public boolean tryCaptureView(View view, int i)
	{
		if(mIsUnableToDrag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field SlidingPaneLayout this$0>
	//*   2    4:getfield        #130 <Field boolean SlidingPaneLayout.mIsUnableToDrag>
	//*   3    7:ifeq            12
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		else
			return ((SlidingPaneLayout.LayoutParams)view.getLayoutParams()).slideable;
	//    6   12:aload_1         
	//    7   13:invokevirtual   #29  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    8   16:checkcast       #31  <Class SlidingPaneLayout$LayoutParams>
	//    9   19:getfield        #133 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
	//   10   22:ireturn         
	}

	final SlidingPaneLayout this$0;

	SlidingPaneLayout$DragHelperCallback()
	{
		this$0 = SlidingPaneLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field SlidingPaneLayout this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void ViewDragHelper$Callback()>
	//    5    9:return          
	}
}
