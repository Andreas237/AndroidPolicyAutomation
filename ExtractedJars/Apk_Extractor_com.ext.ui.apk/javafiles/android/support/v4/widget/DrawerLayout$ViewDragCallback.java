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
		byte byte0 = 3;
	//    0    0:iconst_3        
	//    1    1:istore_1        
		if(mAbsGravity == 3)
	//*   2    2:aload_0         
	//*   3    3:getfield        #31  <Field int mAbsGravity>
	//*   4    6:iconst_3        
	//*   5    7:icmpne          12
			byte0 = 5;
	//    6   10:iconst_5        
	//    7   11:istore_1        
		View view = findDrawerWithGravity(((int) (byte0)));
	//    8   12:aload_0         
	//    9   13:getfield        #21  <Field DrawerLayout this$0>
	//   10   16:iload_1         
	//   11   17:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
	//   12   20:astore_2        
		if(view != null)
	//*  13   21:aload_2         
	//*  14   22:ifnull          33
			closeDrawer(view);
	//   15   25:aload_0         
	//   16   26:getfield        #21  <Field DrawerLayout this$0>
	//   17   29:aload_2         
	//   18   30:invokevirtual   #41  <Method void DrawerLayout.closeDrawer(View)>
	//   19   33:return          
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
	//*   4    4:icmpne          41
			view = findDrawerWithGravity(3);
	//    5    7:aload_0         
	//    6    8:getfield        #21  <Field DrawerLayout this$0>
	//    7   11:iconst_3        
	//    8   12:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
	//    9   15:astore_3        
		else
	//*  10   16:aload_3         
	//*  11   17:ifnull          40
	//*  12   20:aload_0         
	//*  13   21:getfield        #21  <Field DrawerLayout this$0>
	//*  14   24:aload_3         
	//*  15   25:invokevirtual   #78  <Method int DrawerLayout.getDrawerLockMode(View)>
	//*  16   28:ifne            40
	//*  17   31:aload_0         
	//*  18   32:getfield        #80  <Field ViewDragHelper mDragger>
	//*  19   35:aload_3         
	//*  20   36:iload_2         
	//*  21   37:invokevirtual   #86  <Method void ViewDragHelper.captureChildView(View, int)>
	//*  22   40:return          
			view = findDrawerWithGravity(5);
	//   23   41:aload_0         
	//   24   42:getfield        #21  <Field DrawerLayout this$0>
	//   25   45:iconst_5        
	//   26   46:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
	//   27   49:astore_3        
		if(view != null && getDrawerLockMode(view) == 0)
			mDragger.captureChildView(view, j);
	//*  28   50:goto            16
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
	//*   8   14:ifeq            58
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
	//*  17   26:aload_0         
	//*  18   27:getfield        #21  <Field DrawerLayout this$0>
	//*  19   30:aload_1         
	//*  20   31:fload           6
	//*  21   33:invokevirtual   #124 <Method void DrawerLayout.setDrawerViewOffset(View, float)>
	//*  22   36:fload           6
	//*  23   38:fconst_0        
	//*  24   39:fcmpl           
	//*  25   40:ifne            76
	//*  26   43:iconst_4        
	//*  27   44:istore_2        
	//*  28   45:aload_1         
	//*  29   46:iload_2         
	//*  30   47:invokevirtual   #127 <Method void View.setVisibility(int)>
	//*  31   50:aload_0         
	//*  32   51:getfield        #21  <Field DrawerLayout this$0>
	//*  33   54:invokevirtual   #130 <Method void DrawerLayout.invalidate()>
	//*  34   57:return          
			f = (float)(getWidth() - i) / (float)j;
	//   35   58:aload_0         
	//   36   59:getfield        #21  <Field DrawerLayout this$0>
	//   37   62:invokevirtual   #63  <Method int DrawerLayout.getWidth()>
	//   38   65:iload_2         
	//   39   66:isub            
	//   40   67:i2f             
	//   41   68:iload_3         
	//   42   69:i2f             
	//   43   70:fdiv            
	//   44   71:fstore          6
		setDrawerViewOffset(view, f);
		if(f == 0.0F)
			i = 4;
		else
	//*  45   73:goto            26
			i = 0;
	//   46   76:iconst_0        
	//   47   77:istore_2        
		view.setVisibility(i);
		invalidate();
	//*  48   78:goto            45
	}

	public void onViewReleased(View view, float f, float f1)
	{
		int k;
		f1 = getDrawerViewOffset(view);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field DrawerLayout this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #136 <Method float DrawerLayout.getDrawerViewOffset(View)>
	//    4    8:fstore_3        
		k = view.getWidth();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #53  <Method int View.getWidth()>
	//    7   13:istore          6
		if(!checkDrawerViewAbsoluteGravity(view, 3)) goto _L2; else goto _L1
	//    8   15:aload_0         
	//    9   16:getfield        #21  <Field DrawerLayout this$0>
	//   10   19:aload_1         
	//   11   20:iconst_3        
	//   12   21:invokevirtual   #47  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
	//   13   24:ifeq            79
_L1:
		int i;
		if(f > 0.0F || f == 0.0F && f1 > 0.5F)
	//*  14   27:fload_2         
	//*  15   28:fconst_0        
	//*  16   29:fcmpl           
	//*  17   30:ifgt            46
	//*  18   33:fload_2         
	//*  19   34:fconst_0        
	//*  20   35:fcmpl           
	//*  21   36:ifne            71
	//*  22   39:fload_3         
	//*  23   40:ldc1            #137 <Float 0.5F>
	//*  24   42:fcmpl           
	//*  25   43:ifle            71
			i = 0;
	//   26   46:iconst_0        
	//   27   47:istore          4
		else
	//*  28   49:aload_0         
	//*  29   50:getfield        #80  <Field ViewDragHelper mDragger>
	//*  30   53:iload           4
	//*  31   55:aload_1         
	//*  32   56:invokevirtual   #67  <Method int View.getTop()>
	//*  33   59:invokevirtual   #141 <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
	//*  34   62:pop             
	//*  35   63:aload_0         
	//*  36   64:getfield        #21  <Field DrawerLayout this$0>
	//*  37   67:invokevirtual   #130 <Method void DrawerLayout.invalidate()>
	//*  38   70:return          
			i = -k;
	//   39   71:iload           6
	//   40   73:ineg            
	//   41   74:istore          4
_L4:
		mDragger.settleCapturedViewAt(i, view.getTop());
		invalidate();
		return;
	//*  42   76:goto            49
_L2:
		int j = getWidth();
	//   43   79:aload_0         
	//   44   80:getfield        #21  <Field DrawerLayout this$0>
	//   45   83:invokevirtual   #63  <Method int DrawerLayout.getWidth()>
	//   46   86:istore          5
		if(f >= 0.0F)
	//*  47   88:fload_2         
	//*  48   89:fconst_0        
	//*  49   90:fcmpg           
	//*  50   91:iflt            115
		{
			i = j;
	//   51   94:iload           5
	//   52   96:istore          4
			if(f != 0.0F)
				continue; /* Loop/switch isn't completed */
	//   53   98:fload_2         
	//   54   99:fconst_0        
	//   55  100:fcmpl           
	//   56  101:ifne            49
			i = j;
	//   57  104:iload           5
	//   58  106:istore          4
			if(f1 <= 0.5F)
				continue; /* Loop/switch isn't completed */
	//   59  108:fload_3         
	//   60  109:ldc1            #137 <Float 0.5F>
	//   61  111:fcmpl           
	//   62  112:ifle            49
		}
		i = j - k;
	//   63  115:iload           5
	//   64  117:iload           6
	//   65  119:isub            
	//   66  120:istore          4
		if(true) goto _L4; else goto _L3
	//   67  122:goto            49
_L3:
	}

	void peekDrawer()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int j = mDragger.getEdgeSize();
	//    2    2:aload_0         
	//    3    3:getfield        #80  <Field ViewDragHelper mDragger>
	//    4    6:invokevirtual   #145 <Method int ViewDragHelper.getEdgeSize()>
	//    5    9:istore_3        
		boolean flag;
		View view;
		if(mAbsGravity == 3)
	//*   6   10:aload_0         
	//*   7   11:getfield        #31  <Field int mAbsGravity>
	//*   8   14:iconst_3        
	//*   9   15:icmpne          144
			flag = true;
	//   10   18:iconst_1        
	//   11   19:istore_1        
		else
	//*  12   20:iload_1         
	//*  13   21:ifeq            149
	//*  14   24:aload_0         
	//*  15   25:getfield        #21  <Field DrawerLayout this$0>
	//*  16   28:iconst_3        
	//*  17   29:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
	//*  18   32:astore          4
	//*  19   34:aload           4
	//*  20   36:ifnull          46
	//*  21   39:aload           4
	//*  22   41:invokevirtual   #53  <Method int View.getWidth()>
	//*  23   44:ineg            
	//*  24   45:istore_2        
	//*  25   46:iload_2         
	//*  26   47:iload_3         
	//*  27   48:iadd            
	//*  28   49:istore_2        
	//*  29   50:aload           4
	//*  30   52:ifnull          143
	//*  31   55:iload_1         
	//*  32   56:ifeq            68
	//*  33   59:aload           4
	//*  34   61:invokevirtual   #148 <Method int View.getLeft()>
	//*  35   64:iload_2         
	//*  36   65:icmplt          81
	//*  37   68:iload_1         
	//*  38   69:ifne            143
	//*  39   72:aload           4
	//*  40   74:invokevirtual   #148 <Method int View.getLeft()>
	//*  41   77:iload_2         
	//*  42   78:icmple          143
	//*  43   81:aload_0         
	//*  44   82:getfield        #21  <Field DrawerLayout this$0>
	//*  45   85:aload           4
	//*  46   87:invokevirtual   #78  <Method int DrawerLayout.getDrawerLockMode(View)>
	//*  47   90:ifne            143
	//*  48   93:aload           4
	//*  49   95:invokevirtual   #100 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  50   98:checkcast       #102 <Class DrawerLayout$LayoutParams>
	//*  51  101:astore          5
	//*  52  103:aload_0         
	//*  53  104:getfield        #80  <Field ViewDragHelper mDragger>
	//*  54  107:aload           4
	//*  55  109:iload_2         
	//*  56  110:aload           4
	//*  57  112:invokevirtual   #67  <Method int View.getTop()>
	//*  58  115:invokevirtual   #152 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//*  59  118:pop             
	//*  60  119:aload           5
	//*  61  121:iconst_1        
	//*  62  122:putfield        #106 <Field boolean DrawerLayout$LayoutParams.isPeeking>
	//*  63  125:aload_0         
	//*  64  126:getfield        #21  <Field DrawerLayout this$0>
	//*  65  129:invokevirtual   #130 <Method void DrawerLayout.invalidate()>
	//*  66  132:aload_0         
	//*  67  133:invokespecial   #108 <Method void closeOtherDrawer()>
	//*  68  136:aload_0         
	//*  69  137:getfield        #21  <Field DrawerLayout this$0>
	//*  70  140:invokevirtual   #155 <Method void DrawerLayout.cancelChildViewTouch()>
	//*  71  143:return          
			flag = false;
	//   72  144:iconst_0        
	//   73  145:istore_1        
		if(flag)
		{
			view = findDrawerWithGravity(3);
			if(view != null)
				i = -view.getWidth();
			i += j;
		} else
	//*  74  146:goto            20
		{
			view = findDrawerWithGravity(5);
	//   75  149:aload_0         
	//   76  150:getfield        #21  <Field DrawerLayout this$0>
	//   77  153:iconst_5        
	//   78  154:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
	//   79  157:astore          4
			i = getWidth();
	//   80  159:aload_0         
	//   81  160:getfield        #21  <Field DrawerLayout this$0>
	//   82  163:invokevirtual   #63  <Method int DrawerLayout.getWidth()>
	//   83  166:istore_2        
			i -= j;
	//   84  167:iload_2         
	//   85  168:iload_3         
	//   86  169:isub            
	//   87  170:istore_2        
		}
		if(view != null && (flag && view.getLeft() < i || !flag && view.getLeft() > i) && getDrawerLockMode(view) == 0)
		{
			DrawerLayout.LayoutParams layoutparams = (DrawerLayout.LayoutParams)view.getLayoutParams();
			mDragger.smoothSlideViewTo(view, i, view.getTop());
			layoutparams.isPeeking = true;
			invalidate();
			closeOtherDrawer();
			cancelChildViewTouch();
		}
	//*  88  171:goto            50
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
