// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//			DrawerLayout, ViewDragHelper

private class DrawerLayout$ViewDragCallback extends ViewDragHelper.Callback
{

	private void closeOtherDrawer()
	{
		int i = mAbsGravity;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int mAbsGravity>
	//    2    4:istore_2        
		byte byte0 = 3;
	//    3    5:iconst_3        
	//    4    6:istore_1        
		if(i == 3)
	//*   5    7:iload_2         
	//*   6    8:iconst_3        
	//*   7    9:icmpne          14
			byte0 = 5;
	//    8   12:iconst_5        
	//    9   13:istore_1        
		View view = findDrawerWithGravity(((int) (byte0)));
	//   10   14:aload_0         
	//   11   15:getfield        #21  <Field DrawerLayout this$0>
	//   12   18:iload_1         
	//   13   19:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
	//   14   22:astore_3        
		if(view != null)
	//*  15   23:aload_3         
	//*  16   24:ifnull          35
			closeDrawer(view);
	//   17   27:aload_0         
	//   18   28:getfield        #21  <Field DrawerLayout this$0>
	//   19   31:aload_3         
	//   20   32:invokevirtual   #41  <Method void DrawerLayout.closeDrawer(View)>
	//   21   35:return          
	}

	public int clampViewPositionHorizontal(View view, int i, int j)
	{
		if(checkDrawerViewAbsoluteGravity(view, 3))
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field DrawerLayout this$0>
	//*   2    4:aload_1         
	//*   3    5:iconst_3        
	//*   4    6:invokevirtual   #47  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
	//*   5    9:ifeq            26
		{
			return Math.max(-view.getWidth(), Math.min(i, 0));
	//    6   12:aload_1         
	//    7   13:invokevirtual   #53  <Method int View.getWidth()>
	//    8   16:ineg            
	//    9   17:iload_2         
	//   10   18:iconst_0        
	//   11   19:invokestatic    #59  <Method int Math.min(int, int)>
	//   12   22:invokestatic    #62  <Method int Math.max(int, int)>
	//   13   25:ireturn         
		} else
		{
			j = getWidth();
	//   14   26:aload_0         
	//   15   27:getfield        #21  <Field DrawerLayout this$0>
	//   16   30:invokevirtual   #63  <Method int DrawerLayout.getWidth()>
	//   17   33:istore_3        
			return Math.max(j - view.getWidth(), Math.min(i, j));
	//   18   34:iload_3         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #53  <Method int View.getWidth()>
	//   21   39:isub            
	//   22   40:iload_2         
	//   23   41:iload_3         
	//   24   42:invokestatic    #59  <Method int Math.min(int, int)>
	//   25   45:invokestatic    #62  <Method int Math.max(int, int)>
	//   26   48:ireturn         
		}
	}

	public int clampViewPositionVertical(View view, int i, int j)
	{
		return view.getTop();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #67  <Method int View.getTop()>
	//    2    4:ireturn         
	}

	public int getViewHorizontalDragRange(View view)
	{
		if(isDrawerView(view))
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field DrawerLayout this$0>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #73  <Method boolean DrawerLayout.isDrawerView(View)>
	//*   4    8:ifeq            16
			return view.getWidth();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #53  <Method int View.getWidth()>
	//    7   15:ireturn         
		else
			return 0;
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public void onEdgeDragStarted(int i, int j)
	{
		View view;
		if((i & 1) == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:iconst_1        
	//*   4    4:icmpne          19
			view = findDrawerWithGravity(3);
	//    5    7:aload_0         
	//    6    8:getfield        #21  <Field DrawerLayout this$0>
	//    7   11:iconst_3        
	//    8   12:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
	//    9   15:astore_3        
		else
	//*  10   16:goto            28
			view = findDrawerWithGravity(5);
	//   11   19:aload_0         
	//   12   20:getfield        #21  <Field DrawerLayout this$0>
	//   13   23:iconst_5        
	//   14   24:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
	//   15   27:astore_3        
		if(view != null && getDrawerLockMode(view) == 0)
	//*  16   28:aload_3         
	//*  17   29:ifnull          52
	//*  18   32:aload_0         
	//*  19   33:getfield        #21  <Field DrawerLayout this$0>
	//*  20   36:aload_3         
	//*  21   37:invokevirtual   #78  <Method int DrawerLayout.getDrawerLockMode(View)>
	//*  22   40:ifne            52
			mDragger.captureChildView(view, j);
	//   23   43:aload_0         
	//   24   44:getfield        #80  <Field ViewDragHelper mDragger>
	//   25   47:aload_3         
	//   26   48:iload_2         
	//   27   49:invokevirtual   #86  <Method void ViewDragHelper.captureChildView(View, int)>
	//   28   52:return          
	}

	public boolean onEdgeLock(int i)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onEdgeTouched(int i, int j)
	{
		postDelayed(mPeekRunnable, 160L);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field DrawerLayout this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field Runnable mPeekRunnable>
	//    4    8:ldc2w           #90  <Long 160L>
	//    5   11:invokevirtual   #95  <Method boolean DrawerLayout.postDelayed(Runnable, long)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void onViewCaptured(View view, int i)
	{
		((DrawerLayout.LayoutParams)view.getLayoutParams()).isPeeking = false;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #100 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #102 <Class DrawerLayout$LayoutParams>
	//    3    7:iconst_0        
	//    4    8:putfield        #106 <Field boolean DrawerLayout$LayoutParams.isPeeking>
		closeOtherDrawer();
	//    5   11:aload_0         
	//    6   12:invokespecial   #108 <Method void closeOtherDrawer()>
	//    7   15:return          
	}

	public void onViewDragStateChanged(int i)
	{
		updateDrawerState(mAbsGravity, i, mDragger.getCapturedView());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field DrawerLayout this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field int mAbsGravity>
	//    4    8:iload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #80  <Field ViewDragHelper mDragger>
	//    7   13:invokevirtual   #114 <Method View ViewDragHelper.getCapturedView()>
	//    8   16:invokevirtual   #118 <Method void DrawerLayout.updateDrawerState(int, int, View)>
	//    9   19:return          
	}

	public void onViewPositionChanged(View view, int i, int j, int k, int l)
	{
		j = view.getWidth();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #53  <Method int View.getWidth()>
	//    2    4:istore_3        
		float f;
		if(checkDrawerViewAbsoluteGravity(view, 3))
	//*   3    5:aload_0         
	//*   4    6:getfield        #21  <Field DrawerLayout this$0>
	//*   5    9:aload_1         
	//*   6   10:iconst_3        
	//*   7   11:invokevirtual   #47  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
	//*   8   14:ifeq            29
			f = (float)(i + j) / (float)j;
	//    9   17:iload_2         
	//   10   18:iload_3         
	//   11   19:iadd            
	//   12   20:i2f             
	//   13   21:iload_3         
	//   14   22:i2f             
	//   15   23:fdiv            
	//   16   24:fstore          6
		else
	//*  17   26:goto            44
			f = (float)(getWidth() - i) / (float)j;
	//   18   29:aload_0         
	//   19   30:getfield        #21  <Field DrawerLayout this$0>
	//   20   33:invokevirtual   #63  <Method int DrawerLayout.getWidth()>
	//   21   36:iload_2         
	//   22   37:isub            
	//   23   38:i2f             
	//   24   39:iload_3         
	//   25   40:i2f             
	//   26   41:fdiv            
	//   27   42:fstore          6
		setDrawerViewOffset(view, f);
	//   28   44:aload_0         
	//   29   45:getfield        #21  <Field DrawerLayout this$0>
	//   30   48:aload_1         
	//   31   49:fload           6
	//   32   51:invokevirtual   #124 <Method void DrawerLayout.setDrawerViewOffset(View, float)>
		if(f == 0.0F)
	//*  33   54:fload           6
	//*  34   56:fconst_0        
	//*  35   57:fcmpl           
	//*  36   58:ifne            66
			i = 4;
	//   37   61:iconst_4        
	//   38   62:istore_2        
		else
	//*  39   63:goto            68
			i = 0;
	//   40   66:iconst_0        
	//   41   67:istore_2        
		view.setVisibility(i);
	//   42   68:aload_1         
	//   43   69:iload_2         
	//   44   70:invokevirtual   #127 <Method void View.setVisibility(int)>
		invalidate();
	//   45   73:aload_0         
	//   46   74:getfield        #21  <Field DrawerLayout this$0>
	//   47   77:invokevirtual   #130 <Method void DrawerLayout.invalidate()>
	//   48   80:return          
	}

	public void onViewReleased(View view, float f, float f1)
	{
		int i;
label0:
		{
			f1 = getDrawerViewOffset(view);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field DrawerLayout this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #136 <Method float DrawerLayout.getDrawerViewOffset(View)>
	//    4    8:fstore_3        
			int k = view.getWidth();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #53  <Method int View.getWidth()>
	//    7   13:istore          6
			if(checkDrawerViewAbsoluteGravity(view, 3))
	//*   8   15:aload_0         
	//*   9   16:getfield        #21  <Field DrawerLayout this$0>
	//*  10   19:aload_1         
	//*  11   20:iconst_3        
	//*  12   21:invokevirtual   #47  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
	//*  13   24:ifeq            63
			{
				if(f <= 0.0F && (f != 0.0F || f1 <= 0.5F))
	//*  14   27:fload_2         
	//*  15   28:fconst_0        
	//*  16   29:fcmpl           
	//*  17   30:ifgt            57
	//*  18   33:fload_2         
	//*  19   34:fconst_0        
	//*  20   35:fcmpl           
	//*  21   36:ifne            49
	//*  22   39:fload_3         
	//*  23   40:ldc1            #137 <Float 0.5F>
	//*  24   42:fcmpl           
	//*  25   43:ifle            49
	//*  26   46:goto            57
					i = -k;
	//   27   49:iload           6
	//   28   51:ineg            
	//   29   52:istore          4
				else
	//*  30   54:goto            106
					i = 0;
	//   31   57:iconst_0        
	//   32   58:istore          4
				break label0;
	//   33   60:goto            106
			}
			int j = getWidth();
	//   34   63:aload_0         
	//   35   64:getfield        #21  <Field DrawerLayout this$0>
	//   36   67:invokevirtual   #63  <Method int DrawerLayout.getWidth()>
	//   37   70:istore          5
			if(f >= 0.0F)
	//*  38   72:fload_2         
	//*  39   73:fconst_0        
	//*  40   74:fcmpg           
	//*  41   75:iflt            99
			{
				i = j;
	//   42   78:iload           5
	//   43   80:istore          4
				if(f != 0.0F)
					break label0;
	//   44   82:fload_2         
	//   45   83:fconst_0        
	//   46   84:fcmpl           
	//   47   85:ifne            106
				i = j;
	//   48   88:iload           5
	//   49   90:istore          4
				if(f1 <= 0.5F)
					break label0;
	//   50   92:fload_3         
	//   51   93:ldc1            #137 <Float 0.5F>
	//   52   95:fcmpl           
	//   53   96:ifle            106
			}
			i = j - k;
	//   54   99:iload           5
	//   55  101:iload           6
	//   56  103:isub            
	//   57  104:istore          4
		}
		mDragger.settleCapturedViewAt(i, view.getTop());
	//   58  106:aload_0         
	//   59  107:getfield        #80  <Field ViewDragHelper mDragger>
	//   60  110:iload           4
	//   61  112:aload_1         
	//   62  113:invokevirtual   #67  <Method int View.getTop()>
	//   63  116:invokevirtual   #141 <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
	//   64  119:pop             
		invalidate();
	//   65  120:aload_0         
	//   66  121:getfield        #21  <Field DrawerLayout this$0>
	//   67  124:invokevirtual   #130 <Method void DrawerLayout.invalidate()>
	//   68  127:return          
	}

	void peekDrawer()
	{
		int k = mDragger.getEdgeSize();
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field ViewDragHelper mDragger>
	//    2    4:invokevirtual   #145 <Method int ViewDragHelper.getEdgeSize()>
	//    3    7:istore_3        
		int i = mAbsGravity;
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field int mAbsGravity>
	//    6   12:istore_1        
		int j = 0;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		boolean flag;
		if(i == 3)
	//*   9   15:iload_1         
	//*  10   16:iconst_3        
	//*  11   17:icmpne          25
			flag = true;
	//   12   20:iconst_1        
	//   13   21:istore_1        
		else
	//*  14   22:goto            27
			flag = false;
	//   15   25:iconst_0        
	//   16   26:istore_1        
		View view;
		if(flag)
	//*  17   27:iload_1         
	//*  18   28:ifeq            60
		{
			view = findDrawerWithGravity(3);
	//   19   31:aload_0         
	//   20   32:getfield        #21  <Field DrawerLayout this$0>
	//   21   35:iconst_3        
	//   22   36:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
	//   23   39:astore          4
			if(view != null)
	//*  24   41:aload           4
	//*  25   43:ifnull          53
				j = -view.getWidth();
	//   26   46:aload           4
	//   27   48:invokevirtual   #53  <Method int View.getWidth()>
	//   28   51:ineg            
	//   29   52:istore_2        
			j += k;
	//   30   53:iload_2         
	//   31   54:iload_3         
	//   32   55:iadd            
	//   33   56:istore_2        
		} else
	//*  34   57:goto            80
		{
			view = findDrawerWithGravity(5);
	//   35   60:aload_0         
	//   36   61:getfield        #21  <Field DrawerLayout this$0>
	//   37   64:iconst_5        
	//   38   65:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
	//   39   68:astore          4
			j = getWidth() - k;
	//   40   70:aload_0         
	//   41   71:getfield        #21  <Field DrawerLayout this$0>
	//   42   74:invokevirtual   #63  <Method int DrawerLayout.getWidth()>
	//   43   77:iload_3         
	//   44   78:isub            
	//   45   79:istore_2        
		}
		if(view != null && (flag && view.getLeft() < j || !flag && view.getLeft() > j) && getDrawerLockMode(view) == 0)
	//*  46   80:aload           4
	//*  47   82:ifnull          173
	//*  48   85:iload_1         
	//*  49   86:ifeq            98
	//*  50   89:aload           4
	//*  51   91:invokevirtual   #148 <Method int View.getLeft()>
	//*  52   94:iload_2         
	//*  53   95:icmplt          111
	//*  54   98:iload_1         
	//*  55   99:ifne            173
	//*  56  102:aload           4
	//*  57  104:invokevirtual   #148 <Method int View.getLeft()>
	//*  58  107:iload_2         
	//*  59  108:icmple          173
	//*  60  111:aload_0         
	//*  61  112:getfield        #21  <Field DrawerLayout this$0>
	//*  62  115:aload           4
	//*  63  117:invokevirtual   #78  <Method int DrawerLayout.getDrawerLockMode(View)>
	//*  64  120:ifne            173
		{
			DrawerLayout.LayoutParams layoutparams = (DrawerLayout.LayoutParams)view.getLayoutParams();
	//   65  123:aload           4
	//   66  125:invokevirtual   #100 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   67  128:checkcast       #102 <Class DrawerLayout$LayoutParams>
	//   68  131:astore          5
			mDragger.smoothSlideViewTo(view, j, view.getTop());
	//   69  133:aload_0         
	//   70  134:getfield        #80  <Field ViewDragHelper mDragger>
	//   71  137:aload           4
	//   72  139:iload_2         
	//   73  140:aload           4
	//   74  142:invokevirtual   #67  <Method int View.getTop()>
	//   75  145:invokevirtual   #152 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   76  148:pop             
			layoutparams.isPeeking = true;
	//   77  149:aload           5
	//   78  151:iconst_1        
	//   79  152:putfield        #106 <Field boolean DrawerLayout$LayoutParams.isPeeking>
			invalidate();
	//   80  155:aload_0         
	//   81  156:getfield        #21  <Field DrawerLayout this$0>
	//   82  159:invokevirtual   #130 <Method void DrawerLayout.invalidate()>
			closeOtherDrawer();
	//   83  162:aload_0         
	//   84  163:invokespecial   #108 <Method void closeOtherDrawer()>
			cancelChildViewTouch();
	//   85  166:aload_0         
	//   86  167:getfield        #21  <Field DrawerLayout this$0>
	//   87  170:invokevirtual   #155 <Method void DrawerLayout.cancelChildViewTouch()>
		}
	//   88  173:return          
	}

	public void removeCallbacks()
	{
		DrawerLayout.this.removeCallbacks(mPeekRunnable);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field DrawerLayout this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field Runnable mPeekRunnable>
	//    4    8:invokevirtual   #159 <Method boolean DrawerLayout.removeCallbacks(Runnable)>
	//    5   11:pop             
	//    6   12:return          
	}

	public void setDragger(ViewDragHelper viewdraghelper)
	{
		mDragger = viewdraghelper;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #80  <Field ViewDragHelper mDragger>
	//    3    5:return          
	}

	public boolean tryCaptureView(View view, int i)
	{
		return isDrawerView(view) && checkDrawerViewAbsoluteGravity(view, mAbsGravity) && getDrawerLockMode(view) == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field DrawerLayout this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #73  <Method boolean DrawerLayout.isDrawerView(View)>
	//    4    8:ifeq            39
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field DrawerLayout this$0>
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #31  <Field int mAbsGravity>
	//   10   20:invokevirtual   #47  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
	//   11   23:ifeq            39
	//   12   26:aload_0         
	//   13   27:getfield        #21  <Field DrawerLayout this$0>
	//   14   30:aload_1         
	//   15   31:invokevirtual   #78  <Method int DrawerLayout.getDrawerLockMode(View)>
	//   16   34:ifne            39
	//   17   37:iconst_1        
	//   18   38:ireturn         
	//   19   39:iconst_0        
	//   20   40:ireturn         
	}

	private final int mAbsGravity;
	private ViewDragHelper mDragger;
	private final Runnable mPeekRunnable = new Runnable() {

		public void run()
		{
			peekDrawer();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field DrawerLayout$ViewDragCallback this$1>
		//    2    4:invokevirtual   #25  <Method void DrawerLayout$ViewDragCallback.peekDrawer()>
		//    3    7:return          
		}

		final DrawerLayout.ViewDragCallback this$1;

			
			{
				this$1 = DrawerLayout.ViewDragCallback.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DrawerLayout$ViewDragCallback this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
	}
;
	final DrawerLayout this$0;

	DrawerLayout$ViewDragCallback(int i)
	{
		this$0 = DrawerLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field DrawerLayout this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void ViewDragHelper$Callback()>
	//    5    9:aload_0         
	//    6   10:new             #9   <Class DrawerLayout$ViewDragCallback$1>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #27  <Method void DrawerLayout$ViewDragCallback$1(DrawerLayout$ViewDragCallback)>
	//   10   18:putfield        #29  <Field Runnable mPeekRunnable>
		mAbsGravity = i;
	//   11   21:aload_0         
	//   12   22:iload_2         
	//   13   23:putfield        #31  <Field int mAbsGravity>
	//   14   26:return          
	}
}
