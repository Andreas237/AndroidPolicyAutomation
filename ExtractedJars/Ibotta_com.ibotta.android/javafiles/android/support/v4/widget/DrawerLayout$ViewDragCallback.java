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
	//    1    1:getfield        #19  <Field int mAbsGravity>
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
	//   13   19:invokevirtual   #25  <Method View DrawerLayout.findDrawerWithGravity(int)>
	//   14   22:astore_3        
		if(view != null)
	//*  15   23:aload_3         
	//*  16   24:ifnull          35
			closeDrawer(view);
	//   17   27:aload_0         
	//   18   28:getfield        #21  <Field DrawerLayout this$0>
	//   19   31:aload_3         
	//   20   32:invokevirtual   #29  <Method void DrawerLayout.closeDrawer(View)>
	//   21   35:return          
	}

	public int clampViewPositionHorizontal(View view, int i, int j)
	{
		if(checkDrawerViewAbsoluteGravity(view, 3))
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field DrawerLayout this$0>
	//*   2    4:aload_1         
	//*   3    5:iconst_3        
	//*   4    6:invokevirtual   #36  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
	//*   5    9:ifeq            26
		{
			return Math.max(-view.getWidth(), Math.min(i, 0));
	//    6   12:aload_1         
	//    7   13:invokevirtual   #42  <Method int View.getWidth()>
	//    8   16:ineg            
	//    9   17:iload_2         
	//   10   18:iconst_0        
	//   11   19:invokestatic    #48  <Method int Math.min(int, int)>
	//   12   22:invokestatic    #51  <Method int Math.max(int, int)>
	//   13   25:ireturn         
		} else
		{
			j = getWidth();
	//   14   26:aload_0         
	//   15   27:getfield        #21  <Field DrawerLayout this$0>
	//   16   30:invokevirtual   #52  <Method int DrawerLayout.getWidth()>
	//   17   33:istore_3        
			return Math.max(j - view.getWidth(), Math.min(i, j));
	//   18   34:iload_3         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #42  <Method int View.getWidth()>
	//   21   39:isub            
	//   22   40:iload_2         
	//   23   41:iload_3         
	//   24   42:invokestatic    #48  <Method int Math.min(int, int)>
	//   25   45:invokestatic    #51  <Method int Math.max(int, int)>
	//   26   48:ireturn         
		}
	}

	public int clampViewPositionVertical(View view, int i, int j)
	{
		return view.getTop();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #56  <Method int View.getTop()>
	//    2    4:ireturn         
	}

	public int getViewHorizontalDragRange(View view)
	{
		if(isDrawerView(view))
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field DrawerLayout this$0>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #62  <Method boolean DrawerLayout.isDrawerView(View)>
	//*   4    8:ifeq            16
			return view.getWidth();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #42  <Method int View.getWidth()>
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
	//    8   12:invokevirtual   #25  <Method View DrawerLayout.findDrawerWithGravity(int)>
	//    9   15:astore_3        
		else
	//*  10   16:goto            28
			view = findDrawerWithGravity(5);
	//   11   19:aload_0         
	//   12   20:getfield        #21  <Field DrawerLayout this$0>
	//   13   23:iconst_5        
	//   14   24:invokevirtual   #25  <Method View DrawerLayout.findDrawerWithGravity(int)>
	//   15   27:astore_3        
		if(view != null && getDrawerLockMode(view) == 0)
	//*  16   28:aload_3         
	//*  17   29:ifnull          52
	//*  18   32:aload_0         
	//*  19   33:getfield        #21  <Field DrawerLayout this$0>
	//*  20   36:aload_3         
	//*  21   37:invokevirtual   #67  <Method int DrawerLayout.getDrawerLockMode(View)>
	//*  22   40:ifne            52
			mDragger.captureChildView(view, j);
	//   23   43:aload_0         
	//   24   44:getfield        #69  <Field ViewDragHelper mDragger>
	//   25   47:aload_3         
	//   26   48:iload_2         
	//   27   49:invokevirtual   #75  <Method void ViewDragHelper.captureChildView(View, int)>
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
	//    3    5:getfield        #80  <Field Runnable mPeekRunnable>
	//    4    8:ldc2w           #81  <Long 160L>
	//    5   11:invokevirtual   #86  <Method boolean DrawerLayout.postDelayed(Runnable, long)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void onViewCaptured(View view, int i)
	{
		((DrawerLayout.LayoutParams)view.getLayoutParams()).isPeeking = false;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #91  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #93  <Class DrawerLayout$LayoutParams>
	//    3    7:iconst_0        
	//    4    8:putfield        #97  <Field boolean DrawerLayout$LayoutParams.isPeeking>
		closeOtherDrawer();
	//    5   11:aload_0         
	//    6   12:invokespecial   #99  <Method void closeOtherDrawer()>
	//    7   15:return          
	}

	public void onViewDragStateChanged(int i)
	{
		updateDrawerState(mAbsGravity, i, mDragger.getCapturedView());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field DrawerLayout this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field int mAbsGravity>
	//    4    8:iload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #69  <Field ViewDragHelper mDragger>
	//    7   13:invokevirtual   #105 <Method View ViewDragHelper.getCapturedView()>
	//    8   16:invokevirtual   #109 <Method void DrawerLayout.updateDrawerState(int, int, View)>
	//    9   19:return          
	}

	public void onViewPositionChanged(View view, int i, int j, int k, int l)
	{
		j = view.getWidth();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #42  <Method int View.getWidth()>
	//    2    4:istore_3        
		float f;
		if(checkDrawerViewAbsoluteGravity(view, 3))
	//*   3    5:aload_0         
	//*   4    6:getfield        #21  <Field DrawerLayout this$0>
	//*   5    9:aload_1         
	//*   6   10:iconst_3        
	//*   7   11:invokevirtual   #36  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
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
	//   20   33:invokevirtual   #52  <Method int DrawerLayout.getWidth()>
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
	//   32   51:invokevirtual   #115 <Method void DrawerLayout.setDrawerViewOffset(View, float)>
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
	//   44   70:invokevirtual   #118 <Method void View.setVisibility(int)>
		invalidate();
	//   45   73:aload_0         
	//   46   74:getfield        #21  <Field DrawerLayout this$0>
	//   47   77:invokevirtual   #121 <Method void DrawerLayout.invalidate()>
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
	//    3    5:invokevirtual   #127 <Method float DrawerLayout.getDrawerViewOffset(View)>
	//    4    8:fstore_3        
			int k = view.getWidth();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #42  <Method int View.getWidth()>
	//    7   13:istore          6
			if(checkDrawerViewAbsoluteGravity(view, 3))
	//*   8   15:aload_0         
	//*   9   16:getfield        #21  <Field DrawerLayout this$0>
	//*  10   19:aload_1         
	//*  11   20:iconst_3        
	//*  12   21:invokevirtual   #36  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
	//*  13   24:ifeq            66
			{
				i = f != 0.0F;
	//   14   27:fload_2         
	//   15   28:fconst_0        
	//   16   29:fcmpl           
	//   17   30:istore          4
				if(i <= 0 && (i != 0 || f1 <= 0.5F))
	//*  18   32:iload           4
	//*  19   34:ifgt            60
	//*  20   37:iload           4
	//*  21   39:ifne            52
	//*  22   42:fload_3         
	//*  23   43:ldc1            #128 <Float 0.5F>
	//*  24   45:fcmpl           
	//*  25   46:ifle            52
	//*  26   49:goto            60
					i = -k;
	//   27   52:iload           6
	//   28   54:ineg            
	//   29   55:istore          4
				else
	//*  30   57:goto            109
					i = 0;
	//   31   60:iconst_0        
	//   32   61:istore          4
				break label0;
	//   33   63:goto            109
			}
			int j = getWidth();
	//   34   66:aload_0         
	//   35   67:getfield        #21  <Field DrawerLayout this$0>
	//   36   70:invokevirtual   #52  <Method int DrawerLayout.getWidth()>
	//   37   73:istore          5
			if(f >= 0.0F)
	//*  38   75:fload_2         
	//*  39   76:fconst_0        
	//*  40   77:fcmpg           
	//*  41   78:iflt            102
			{
				i = j;
	//   42   81:iload           5
	//   43   83:istore          4
				if(f != 0.0F)
					break label0;
	//   44   85:fload_2         
	//   45   86:fconst_0        
	//   46   87:fcmpl           
	//   47   88:ifne            109
				i = j;
	//   48   91:iload           5
	//   49   93:istore          4
				if(f1 <= 0.5F)
					break label0;
	//   50   95:fload_3         
	//   51   96:ldc1            #128 <Float 0.5F>
	//   52   98:fcmpl           
	//   53   99:ifle            109
			}
			i = j - k;
	//   54  102:iload           5
	//   55  104:iload           6
	//   56  106:isub            
	//   57  107:istore          4
		}
		mDragger.settleCapturedViewAt(i, view.getTop());
	//   58  109:aload_0         
	//   59  110:getfield        #69  <Field ViewDragHelper mDragger>
	//   60  113:iload           4
	//   61  115:aload_1         
	//   62  116:invokevirtual   #56  <Method int View.getTop()>
	//   63  119:invokevirtual   #132 <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
	//   64  122:pop             
		invalidate();
	//   65  123:aload_0         
	//   66  124:getfield        #21  <Field DrawerLayout this$0>
	//   67  127:invokevirtual   #121 <Method void DrawerLayout.invalidate()>
	//   68  130:return          
	}

	public void removeCallbacks()
	{
		DrawerLayout.this.removeCallbacks(mPeekRunnable);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field DrawerLayout this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #80  <Field Runnable mPeekRunnable>
	//    4    8:invokevirtual   #136 <Method boolean DrawerLayout.removeCallbacks(Runnable)>
	//    5   11:pop             
	//    6   12:return          
	}

	public boolean tryCaptureView(View view, int i)
	{
		return isDrawerView(view) && checkDrawerViewAbsoluteGravity(view, mAbsGravity) && getDrawerLockMode(view) == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field DrawerLayout this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #62  <Method boolean DrawerLayout.isDrawerView(View)>
	//    4    8:ifeq            39
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field DrawerLayout this$0>
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #19  <Field int mAbsGravity>
	//   10   20:invokevirtual   #36  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
	//   11   23:ifeq            39
	//   12   26:aload_0         
	//   13   27:getfield        #21  <Field DrawerLayout this$0>
	//   14   30:aload_1         
	//   15   31:invokevirtual   #67  <Method int DrawerLayout.getDrawerLockMode(View)>
	//   16   34:ifne            39
	//   17   37:iconst_1        
	//   18   38:ireturn         
	//   19   39:iconst_0        
	//   20   40:ireturn         
	}

	private final int mAbsGravity;
	private ViewDragHelper mDragger;
	private final Runnable mPeekRunnable;
	final DrawerLayout this$0;
}
