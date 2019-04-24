// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//			DrawerLayout, ViewDragHelper

class DrawerLayout$ViewDragCallback extends ViewDragHelper.Callback
{

	private void closeOtherDrawer()
	{
		byte byte0;
		if(mAbsGravity == 3)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field int mAbsGravity>
	//*   2    4:iconst_3        
	//*   3    5:icmpne          13
			byte0 = 5;
	//    4    8:iconst_5        
	//    5    9:istore_1        
		else
	//*   6   10:goto            15
			byte0 = 3;
	//    7   13:iconst_3        
	//    8   14:istore_1        
		View view = findDrawerWithGravity(((int) (byte0)));
	//    9   15:aload_0         
	//   10   16:getfield        #21  <Field DrawerLayout this$0>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
	//   13   23:astore_2        
		if(view != null)
	//*  14   24:aload_2         
	//*  15   25:ifnull          36
			closeDrawer(view);
	//   16   28:aload_0         
	//   17   29:getfield        #21  <Field DrawerLayout this$0>
	//   18   32:aload_2         
	//   19   33:invokevirtual   #41  <Method void DrawerLayout.closeDrawer(View)>
	//   20   36:return          
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
			f = (float)(j + i) / (float)j;
	//    9   17:iload_3         
	//   10   18:iload_2         
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
		f1 = getDrawerViewOffset(view);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field DrawerLayout this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #136 <Method float DrawerLayout.getDrawerViewOffset(View)>
	//    4    8:fstore_3        
		int j = view.getWidth();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #53  <Method int View.getWidth()>
	//    7   13:istore          5
		int i;
		if(checkDrawerViewAbsoluteGravity(view, 3))
	//*   8   15:aload_0         
	//*   9   16:getfield        #21  <Field DrawerLayout this$0>
	//*  10   19:aload_1         
	//*  11   20:iconst_3        
	//*  12   21:invokevirtual   #47  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
	//*  13   24:ifeq            60
		{
			if(f > 0.0F || f == 0.0F && f1 > 0.5F)
	//*  14   27:fload_2         
	//*  15   28:fconst_0        
	//*  16   29:fcmpl           
	//*  17   30:ifgt            46
	//*  18   33:fload_2         
	//*  19   34:fconst_0        
	//*  20   35:fcmpl           
	//*  21   36:ifne            52
	//*  22   39:fload_3         
	//*  23   40:ldc1            #137 <Float 0.5F>
	//*  24   42:fcmpl           
	//*  25   43:ifle            52
				i = 0;
	//   26   46:iconst_0        
	//   27   47:istore          4
			else
	//*  28   49:goto            57
				i = -j;
	//   29   52:iload           5
	//   30   54:ineg            
	//   31   55:istore          4
		} else
	//*  32   57:goto            98
		{
			i = getWidth();
	//   33   60:aload_0         
	//   34   61:getfield        #21  <Field DrawerLayout this$0>
	//   35   64:invokevirtual   #63  <Method int DrawerLayout.getWidth()>
	//   36   67:istore          4
			if(f < 0.0F || f == 0.0F && f1 > 0.5F)
	//*  37   69:fload_2         
	//*  38   70:fconst_0        
	//*  39   71:fcmpg           
	//*  40   72:iflt            88
	//*  41   75:fload_2         
	//*  42   76:fconst_0        
	//*  43   77:fcmpl           
	//*  44   78:ifne            98
	//*  45   81:fload_3         
	//*  46   82:ldc1            #137 <Float 0.5F>
	//*  47   84:fcmpl           
	//*  48   85:ifle            98
				i -= j;
	//   49   88:iload           4
	//   50   90:iload           5
	//   51   92:isub            
	//   52   93:istore          4
		}
	//*  53   95:goto            98
		mDragger.settleCapturedViewAt(i, view.getTop());
	//   54   98:aload_0         
	//   55   99:getfield        #80  <Field ViewDragHelper mDragger>
	//   56  102:iload           4
	//   57  104:aload_1         
	//   58  105:invokevirtual   #67  <Method int View.getTop()>
	//   59  108:invokevirtual   #141 <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
	//   60  111:pop             
		invalidate();
	//   61  112:aload_0         
	//   62  113:getfield        #21  <Field DrawerLayout this$0>
	//   63  116:invokevirtual   #130 <Method void DrawerLayout.invalidate()>
	//   64  119:return          
	}

	void peekDrawer()
	{
		int j = mDragger.getEdgeSize();
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field ViewDragHelper mDragger>
	//    2    4:invokevirtual   #145 <Method int ViewDragHelper.getEdgeSize()>
	//    3    7:istore_3        
		boolean flag;
		if(mAbsGravity == 3)
	//*   4    8:aload_0         
	//*   5    9:getfield        #31  <Field int mAbsGravity>
	//*   6   12:iconst_3        
	//*   7   13:icmpne          21
			flag = true;
	//    8   16:iconst_1        
	//    9   17:istore_1        
		else
	//*  10   18:goto            23
			flag = false;
	//   11   21:iconst_0        
	//   12   22:istore_1        
		int i;
		View view;
		if(flag)
	//*  13   23:iload_1         
	//*  14   24:ifeq            61
		{
			view = findDrawerWithGravity(3);
	//   15   27:aload_0         
	//   16   28:getfield        #21  <Field DrawerLayout this$0>
	//   17   31:iconst_3        
	//   18   32:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
	//   19   35:astore          4
			if(view != null)
	//*  20   37:aload           4
	//*  21   39:ifnull          52
				i = -view.getWidth();
	//   22   42:aload           4
	//   23   44:invokevirtual   #53  <Method int View.getWidth()>
	//   24   47:ineg            
	//   25   48:istore_2        
			else
	//*  26   49:goto            54
				i = 0;
	//   27   52:iconst_0        
	//   28   53:istore_2        
			i += j;
	//   29   54:iload_2         
	//   30   55:iload_3         
	//   31   56:iadd            
	//   32   57:istore_2        
		} else
	//*  33   58:goto            81
		{
			view = findDrawerWithGravity(5);
	//   34   61:aload_0         
	//   35   62:getfield        #21  <Field DrawerLayout this$0>
	//   36   65:iconst_5        
	//   37   66:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
	//   38   69:astore          4
			i = getWidth() - j;
	//   39   71:aload_0         
	//   40   72:getfield        #21  <Field DrawerLayout this$0>
	//   41   75:invokevirtual   #63  <Method int DrawerLayout.getWidth()>
	//   42   78:iload_3         
	//   43   79:isub            
	//   44   80:istore_2        
		}
		if(view != null && (flag && view.getLeft() < i || !flag && view.getLeft() > i) && getDrawerLockMode(view) == 0)
	//*  45   81:aload           4
	//*  46   83:ifnull          174
	//*  47   86:iload_1         
	//*  48   87:ifeq            99
	//*  49   90:aload           4
	//*  50   92:invokevirtual   #148 <Method int View.getLeft()>
	//*  51   95:iload_2         
	//*  52   96:icmplt          112
	//*  53   99:iload_1         
	//*  54  100:ifne            174
	//*  55  103:aload           4
	//*  56  105:invokevirtual   #148 <Method int View.getLeft()>
	//*  57  108:iload_2         
	//*  58  109:icmple          174
	//*  59  112:aload_0         
	//*  60  113:getfield        #21  <Field DrawerLayout this$0>
	//*  61  116:aload           4
	//*  62  118:invokevirtual   #78  <Method int DrawerLayout.getDrawerLockMode(View)>
	//*  63  121:ifne            174
		{
			DrawerLayout.LayoutParams layoutparams = (DrawerLayout.LayoutParams)view.getLayoutParams();
	//   64  124:aload           4
	//   65  126:invokevirtual   #100 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   66  129:checkcast       #102 <Class DrawerLayout$LayoutParams>
	//   67  132:astore          5
			mDragger.smoothSlideViewTo(view, i, view.getTop());
	//   68  134:aload_0         
	//   69  135:getfield        #80  <Field ViewDragHelper mDragger>
	//   70  138:aload           4
	//   71  140:iload_2         
	//   72  141:aload           4
	//   73  143:invokevirtual   #67  <Method int View.getTop()>
	//   74  146:invokevirtual   #152 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   75  149:pop             
			layoutparams.isPeeking = true;
	//   76  150:aload           5
	//   77  152:iconst_1        
	//   78  153:putfield        #106 <Field boolean DrawerLayout$LayoutParams.isPeeking>
			invalidate();
	//   79  156:aload_0         
	//   80  157:getfield        #21  <Field DrawerLayout this$0>
	//   81  160:invokevirtual   #130 <Method void DrawerLayout.invalidate()>
			closeOtherDrawer();
	//   82  163:aload_0         
	//   83  164:invokespecial   #108 <Method void closeOtherDrawer()>
			cancelChildViewTouch();
	//   84  167:aload_0         
	//   85  168:getfield        #21  <Field DrawerLayout this$0>
	//   86  171:invokevirtual   #155 <Method void DrawerLayout.cancelChildViewTouch()>
		}
	//   87  174:return          
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
