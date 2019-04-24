// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//			SlidingPaneLayout, ViewDragHelper

class SlidingPaneLayout$DragHelperCallback extends ViewDragHelper.Callback
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
	//*   9   21:ifeq            78
		{
			j = getWidth() - (getPaddingRight() + ((SlidingPaneLayout.LayoutParams) (view)).rightMargin + mSlideableView.getWidth());
	//   10   24:aload_0         
	//   11   25:getfield        #13  <Field SlidingPaneLayout this$0>
	//   12   28:invokevirtual   #39  <Method int SlidingPaneLayout.getWidth()>
	//   13   31:aload_0         
	//   14   32:getfield        #13  <Field SlidingPaneLayout this$0>
	//   15   35:invokevirtual   #42  <Method int SlidingPaneLayout.getPaddingRight()>
	//   16   38:aload_1         
	//   17   39:getfield        #46  <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//   18   42:iadd            
	//   19   43:aload_0         
	//   20   44:getfield        #13  <Field SlidingPaneLayout this$0>
	//   21   47:getfield        #23  <Field View SlidingPaneLayout.mSlideableView>
	//   22   50:invokevirtual   #47  <Method int View.getWidth()>
	//   23   53:iadd            
	//   24   54:isub            
	//   25   55:istore_3        
			int k = mSlideRange;
	//   26   56:aload_0         
	//   27   57:getfield        #13  <Field SlidingPaneLayout this$0>
	//   28   60:getfield        #50  <Field int SlidingPaneLayout.mSlideRange>
	//   29   63:istore          4
			return Math.max(Math.min(i, j), j - k);
	//   30   65:iload_2         
	//   31   66:iload_3         
	//   32   67:invokestatic    #56  <Method int Math.min(int, int)>
	//   33   70:iload_3         
	//   34   71:iload           4
	//   35   73:isub            
	//   36   74:invokestatic    #59  <Method int Math.max(int, int)>
	//   37   77:ireturn         
		} else
		{
			j = getPaddingLeft() + ((SlidingPaneLayout.LayoutParams) (view)).leftMargin;
	//   38   78:aload_0         
	//   39   79:getfield        #13  <Field SlidingPaneLayout this$0>
	//   40   82:invokevirtual   #62  <Method int SlidingPaneLayout.getPaddingLeft()>
	//   41   85:aload_1         
	//   42   86:getfield        #65  <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   43   89:iadd            
	//   44   90:istore_3        
			int l = mSlideRange;
	//   45   91:aload_0         
	//   46   92:getfield        #13  <Field SlidingPaneLayout this$0>
	//   47   95:getfield        #50  <Field int SlidingPaneLayout.mSlideRange>
	//   48   98:istore          4
			return Math.min(Math.max(i, j), j + l);
	//   49  100:iload_2         
	//   50  101:iload_3         
	//   51  102:invokestatic    #59  <Method int Math.max(int, int)>
	//   52  105:iload_3         
	//   53  106:iload           4
	//   54  108:iadd            
	//   55  109:invokestatic    #56  <Method int Math.min(int, int)>
	//   56  112:ireturn         
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
		if(mDragHelper.getViewDragState() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field SlidingPaneLayout this$0>
	//*   2    4:getfield        #77  <Field ViewDragHelper SlidingPaneLayout.mDragHelper>
	//*   3    7:invokevirtual   #92  <Method int ViewDragHelper.getViewDragState()>
	//*   4   10:ifne            84
		{
			if(mSlideOffset == 0.0F)
	//*   5   13:aload_0         
	//*   6   14:getfield        #13  <Field SlidingPaneLayout this$0>
	//*   7   17:getfield        #96  <Field float SlidingPaneLayout.mSlideOffset>
	//*   8   20:fconst_0        
	//*   9   21:fcmpl           
	//*  10   22:ifne            62
			{
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
		}
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
		int i;
label0:
		{
			SlidingPaneLayout.LayoutParams layoutparams;
label1:
			{
label2:
				{
					layoutparams = (SlidingPaneLayout.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #31  <Class SlidingPaneLayout$LayoutParams>
	//    3    7:astore          6
					if(!isLayoutRtlSupport())
						break label1;
	//    4    9:aload_0         
	//    5   10:getfield        #13  <Field SlidingPaneLayout this$0>
	//    6   13:invokevirtual   #35  <Method boolean SlidingPaneLayout.isLayoutRtlSupport()>
	//    7   16:ifeq            109
					int j = getPaddingRight() + layoutparams.rightMargin;
	//    8   19:aload_0         
	//    9   20:getfield        #13  <Field SlidingPaneLayout this$0>
	//   10   23:invokevirtual   #42  <Method int SlidingPaneLayout.getPaddingRight()>
	//   11   26:aload           6
	//   12   28:getfield        #46  <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//   13   31:iadd            
	//   14   32:istore          5
					if(f >= 0.0F)
	//*  15   34:fload_2         
	//*  16   35:fconst_0        
	//*  17   36:fcmpg           
	//*  18   37:iflt            67
					{
						i = j;
	//   19   40:iload           5
	//   20   42:istore          4
						if(f != 0.0F)
							break label2;
	//   21   44:fload_2         
	//   22   45:fconst_0        
	//   23   46:fcmpl           
	//   24   47:ifne            79
						i = j;
	//   25   50:iload           5
	//   26   52:istore          4
						if(mSlideOffset <= 0.5F)
							break label2;
	//   27   54:aload_0         
	//   28   55:getfield        #13  <Field SlidingPaneLayout this$0>
	//   29   58:getfield        #96  <Field float SlidingPaneLayout.mSlideOffset>
	//   30   61:ldc1            #121 <Float 0.5F>
	//   31   63:fcmpl           
	//   32   64:ifle            79
					}
					i = j + mSlideRange;
	//   33   67:iload           5
	//   34   69:aload_0         
	//   35   70:getfield        #13  <Field SlidingPaneLayout this$0>
	//   36   73:getfield        #50  <Field int SlidingPaneLayout.mSlideRange>
	//   37   76:iadd            
	//   38   77:istore          4
				}
				int k = mSlideableView.getWidth();
	//   39   79:aload_0         
	//   40   80:getfield        #13  <Field SlidingPaneLayout this$0>
	//   41   83:getfield        #23  <Field View SlidingPaneLayout.mSlideableView>
	//   42   86:invokevirtual   #47  <Method int View.getWidth()>
	//   43   89:istore          5
				i = getWidth() - i - k;
	//   44   91:aload_0         
	//   45   92:getfield        #13  <Field SlidingPaneLayout this$0>
	//   46   95:invokevirtual   #39  <Method int SlidingPaneLayout.getWidth()>
	//   47   98:iload           4
	//   48  100:isub            
	//   49  101:iload           5
	//   50  103:isub            
	//   51  104:istore          4
				break label0;
	//   52  106:goto            169
			}
			int l = getPaddingLeft() + layoutparams.leftMargin;
	//   53  109:aload_0         
	//   54  110:getfield        #13  <Field SlidingPaneLayout this$0>
	//   55  113:invokevirtual   #62  <Method int SlidingPaneLayout.getPaddingLeft()>
	//   56  116:aload           6
	//   57  118:getfield        #65  <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   58  121:iadd            
	//   59  122:istore          5
			if(f <= 0.0F)
	//*  60  124:fload_2         
	//*  61  125:fconst_0        
	//*  62  126:fcmpl           
	//*  63  127:ifgt            157
			{
				i = l;
	//   64  130:iload           5
	//   65  132:istore          4
				if(f != 0.0F)
					break label0;
	//   66  134:fload_2         
	//   67  135:fconst_0        
	//   68  136:fcmpl           
	//   69  137:ifne            169
				i = l;
	//   70  140:iload           5
	//   71  142:istore          4
				if(mSlideOffset <= 0.5F)
					break label0;
	//   72  144:aload_0         
	//   73  145:getfield        #13  <Field SlidingPaneLayout this$0>
	//   74  148:getfield        #96  <Field float SlidingPaneLayout.mSlideOffset>
	//   75  151:ldc1            #121 <Float 0.5F>
	//   76  153:fcmpl           
	//   77  154:ifle            169
			}
			i = l + mSlideRange;
	//   78  157:iload           5
	//   79  159:aload_0         
	//   80  160:getfield        #13  <Field SlidingPaneLayout this$0>
	//   81  163:getfield        #50  <Field int SlidingPaneLayout.mSlideRange>
	//   82  166:iadd            
	//   83  167:istore          4
		}
		mDragHelper.settleCapturedViewAt(i, view.getTop());
	//   84  169:aload_0         
	//   85  170:getfield        #13  <Field SlidingPaneLayout this$0>
	//   86  173:getfield        #77  <Field ViewDragHelper SlidingPaneLayout.mDragHelper>
	//   87  176:iload           4
	//   88  178:aload_1         
	//   89  179:invokevirtual   #69  <Method int View.getTop()>
	//   90  182:invokevirtual   #125 <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
	//   91  185:pop             
		invalidate();
	//   92  186:aload_0         
	//   93  187:getfield        #13  <Field SlidingPaneLayout this$0>
	//   94  190:invokevirtual   #118 <Method void SlidingPaneLayout.invalidate()>
	//   95  193:return          
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
