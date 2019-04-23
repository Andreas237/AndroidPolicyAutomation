// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.*;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.Preconditions;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package com.bumptech.glide.request.target:
//			BaseTarget, SizeReadyCallback

public abstract class ViewTarget extends BaseTarget
{
	static final class SizeDeterminer
	{

		private static int getMaxDisplayLength(Context context)
		{
			if(maxDisplayLength == null)
		//*   0    0:getstatic       #45  <Field Integer maxDisplayLength>
		//*   1    3:ifnonnull       57
			{
				context = ((Context) (((WindowManager)Preconditions.checkNotNull(((Object) ((WindowManager)context.getSystemService("window"))))).getDefaultDisplay()));
		//    2    6:aload_0         
		//    3    7:ldc1            #47  <String "window">
		//    4    9:invokevirtual   #53  <Method Object Context.getSystemService(String)>
		//    5   12:checkcast       #55  <Class WindowManager>
		//    6   15:invokestatic    #61  <Method Object Preconditions.checkNotNull(Object)>
		//    7   18:checkcast       #55  <Class WindowManager>
		//    8   21:invokeinterface #65  <Method Display WindowManager.getDefaultDisplay()>
		//    9   26:astore_0        
				Point point = new Point();
		//   10   27:new             #67  <Class Point>
		//   11   30:dup             
		//   12   31:invokespecial   #68  <Method void Point()>
		//   13   34:astore_1        
				((Display) (context)).getSize(point);
		//   14   35:aload_0         
		//   15   36:aload_1         
		//   16   37:invokevirtual   #74  <Method void Display.getSize(Point)>
				maxDisplayLength = Integer.valueOf(Math.max(point.x, point.y));
		//   17   40:aload_1         
		//   18   41:getfield        #77  <Field int Point.x>
		//   19   44:aload_1         
		//   20   45:getfield        #80  <Field int Point.y>
		//   21   48:invokestatic    #86  <Method int Math.max(int, int)>
		//   22   51:invokestatic    #92  <Method Integer Integer.valueOf(int)>
		//   23   54:putstatic       #45  <Field Integer maxDisplayLength>
			}
			return maxDisplayLength.intValue();
		//   24   57:getstatic       #45  <Field Integer maxDisplayLength>
		//   25   60:invokevirtual   #96  <Method int Integer.intValue()>
		//   26   63:ireturn         
		}

		private int getTargetDimen(int i, int j, int k)
		{
			int l = j - k;
		//    0    0:iload_2         
		//    1    1:iload_3         
		//    2    2:isub            
		//    3    3:istore          4
			if(l > 0)
		//*   4    5:iload           4
		//*   5    7:ifle            13
				return l;
		//    6   10:iload           4
		//    7   12:ireturn         
			if(waitForLayout && view.isLayoutRequested())
		//*   8   13:aload_0         
		//*   9   14:getfield        #100 <Field boolean waitForLayout>
		//*  10   17:ifeq            32
		//*  11   20:aload_0         
		//*  12   21:getfield        #39  <Field View view>
		//*  13   24:invokevirtual   #106 <Method boolean View.isLayoutRequested()>
		//*  14   27:ifeq            32
				return 0;
		//   15   30:iconst_0        
		//   16   31:ireturn         
			i -= k;
		//   17   32:iload_1         
		//   18   33:iload_3         
		//   19   34:isub            
		//   20   35:istore_1        
			if(i > 0)
		//*  21   36:iload_1         
		//*  22   37:ifle            42
				return i;
		//   23   40:iload_1         
		//   24   41:ireturn         
			if(!view.isLayoutRequested() && j == -2)
		//*  25   42:aload_0         
		//*  26   43:getfield        #39  <Field View view>
		//*  27   46:invokevirtual   #106 <Method boolean View.isLayoutRequested()>
		//*  28   49:ifne            86
		//*  29   52:iload_2         
		//*  30   53:bipush          -2
		//*  31   55:icmpne          86
			{
				if(Log.isLoggable("ViewTarget", 4))
		//*  32   58:ldc1            #108 <String "ViewTarget">
		//*  33   60:iconst_4        
		//*  34   61:invokestatic    #114 <Method boolean Log.isLoggable(String, int)>
		//*  35   64:ifeq            75
					Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
		//   36   67:ldc1            #108 <String "ViewTarget">
		//   37   69:ldc1            #116 <String "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.">
		//   38   71:invokestatic    #120 <Method int Log.i(String, String)>
		//   39   74:pop             
				return getMaxDisplayLength(view.getContext());
		//   40   75:aload_0         
		//   41   76:getfield        #39  <Field View view>
		//   42   79:invokevirtual   #124 <Method Context View.getContext()>
		//   43   82:invokestatic    #126 <Method int getMaxDisplayLength(Context)>
		//   44   85:ireturn         
			} else
			{
				return 0;
		//   45   86:iconst_0        
		//   46   87:ireturn         
			}
		}

		private int getTargetHeight()
		{
			int j = view.getPaddingTop();
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field View view>
		//    2    4:invokevirtual   #130 <Method int View.getPaddingTop()>
		//    3    7:istore_2        
			int k = view.getPaddingBottom();
		//    4    8:aload_0         
		//    5    9:getfield        #39  <Field View view>
		//    6   12:invokevirtual   #133 <Method int View.getPaddingBottom()>
		//    7   15:istore_3        
			android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
		//    8   16:aload_0         
		//    9   17:getfield        #39  <Field View view>
		//   10   20:invokevirtual   #137 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   11   23:astore          4
			int i;
			if(layoutparams != null)
		//*  12   25:aload           4
		//*  13   27:ifnull          39
				i = layoutparams.height;
		//   14   30:aload           4
		//   15   32:getfield        #142 <Field int android.view.ViewGroup$LayoutParams.height>
		//   16   35:istore_1        
			else
		//*  17   36:goto            41
				i = 0;
		//   18   39:iconst_0        
		//   19   40:istore_1        
			return getTargetDimen(view.getHeight(), i, j + k);
		//   20   41:aload_0         
		//   21   42:aload_0         
		//   22   43:getfield        #39  <Field View view>
		//   23   46:invokevirtual   #145 <Method int View.getHeight()>
		//   24   49:iload_1         
		//   25   50:iload_2         
		//   26   51:iload_3         
		//   27   52:iadd            
		//   28   53:invokespecial   #147 <Method int getTargetDimen(int, int, int)>
		//   29   56:ireturn         
		}

		private int getTargetWidth()
		{
			int j = view.getPaddingLeft();
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field View view>
		//    2    4:invokevirtual   #151 <Method int View.getPaddingLeft()>
		//    3    7:istore_2        
			int k = view.getPaddingRight();
		//    4    8:aload_0         
		//    5    9:getfield        #39  <Field View view>
		//    6   12:invokevirtual   #154 <Method int View.getPaddingRight()>
		//    7   15:istore_3        
			android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
		//    8   16:aload_0         
		//    9   17:getfield        #39  <Field View view>
		//   10   20:invokevirtual   #137 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   11   23:astore          4
			int i;
			if(layoutparams != null)
		//*  12   25:aload           4
		//*  13   27:ifnull          39
				i = layoutparams.width;
		//   14   30:aload           4
		//   15   32:getfield        #157 <Field int android.view.ViewGroup$LayoutParams.width>
		//   16   35:istore_1        
			else
		//*  17   36:goto            41
				i = 0;
		//   18   39:iconst_0        
		//   19   40:istore_1        
			return getTargetDimen(view.getWidth(), i, j + k);
		//   20   41:aload_0         
		//   21   42:aload_0         
		//   22   43:getfield        #39  <Field View view>
		//   23   46:invokevirtual   #160 <Method int View.getWidth()>
		//   24   49:iload_1         
		//   25   50:iload_2         
		//   26   51:iload_3         
		//   27   52:iadd            
		//   28   53:invokespecial   #147 <Method int getTargetDimen(int, int, int)>
		//   29   56:ireturn         
		}

		private boolean isDimensionValid(int i)
		{
			return i > 0 || i == 0x80000000;
		//    0    0:iload_1         
		//    1    1:ifgt            15
		//    2    4:iload_1         
		//    3    5:ldc1            #163 <Int 0x80000000>
		//    4    7:icmpne          13
		//    5   10:goto            15
		//    6   13:iconst_0        
		//    7   14:ireturn         
		//    8   15:iconst_1        
		//    9   16:ireturn         
		}

		private boolean isViewStateAndSizeValid(int i, int j)
		{
			return isDimensionValid(i) && isDimensionValid(j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #167 <Method boolean isDimensionValid(int)>
		//    3    5:ifeq            18
		//    4    8:aload_0         
		//    5    9:iload_2         
		//    6   10:invokespecial   #167 <Method boolean isDimensionValid(int)>
		//    7   13:ifeq            18
		//    8   16:iconst_1        
		//    9   17:ireturn         
		//   10   18:iconst_0        
		//   11   19:ireturn         
		}

		private void notifyCbs(int i, int j)
		{
			for(Iterator iterator = (new ArrayList(((java.util.Collection) (cbs)))).iterator(); iterator.hasNext(); ((SizeReadyCallback)iterator.next()).onSizeReady(i, j));
		//    0    0:new             #34  <Class ArrayList>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #37  <Field List cbs>
		//    4    8:invokespecial   #172 <Method void ArrayList(java.util.Collection)>
		//    5   11:invokevirtual   #176 <Method Iterator ArrayList.iterator()>
		//    6   14:astore_3        
		//    7   15:aload_3         
		//    8   16:invokeinterface #181 <Method boolean Iterator.hasNext()>
		//    9   21:ifeq            43
		//   10   24:aload_3         
		//   11   25:invokeinterface #185 <Method Object Iterator.next()>
		//   12   30:checkcast       #187 <Class SizeReadyCallback>
		//   13   33:iload_1         
		//   14   34:iload_2         
		//   15   35:invokeinterface #190 <Method void SizeReadyCallback.onSizeReady(int, int)>
		//*  16   40:goto            15
		//   17   43:return          
		}

		void checkCurrentDimens()
		{
			if(cbs.isEmpty())
		//*   0    0:aload_0         
		//*   1    1:getfield        #37  <Field List cbs>
		//*   2    4:invokeinterface #196 <Method boolean List.isEmpty()>
		//*   3    9:ifeq            13
				return;
		//    4   12:return          
			int i = getTargetWidth();
		//    5   13:aload_0         
		//    6   14:invokespecial   #198 <Method int getTargetWidth()>
		//    7   17:istore_1        
			int j = getTargetHeight();
		//    8   18:aload_0         
		//    9   19:invokespecial   #200 <Method int getTargetHeight()>
		//   10   22:istore_2        
			if(!isViewStateAndSizeValid(i, j))
		//*  11   23:aload_0         
		//*  12   24:iload_1         
		//*  13   25:iload_2         
		//*  14   26:invokespecial   #202 <Method boolean isViewStateAndSizeValid(int, int)>
		//*  15   29:ifne            33
			{
				return;
		//   16   32:return          
			} else
			{
				notifyCbs(i, j);
		//   17   33:aload_0         
		//   18   34:iload_1         
		//   19   35:iload_2         
		//   20   36:invokespecial   #204 <Method void notifyCbs(int, int)>
				clearCallbacksAndListener();
		//   21   39:aload_0         
		//   22   40:invokevirtual   #207 <Method void clearCallbacksAndListener()>
				return;
		//   23   43:return          
			}
		}

		void clearCallbacksAndListener()
		{
			ViewTreeObserver viewtreeobserver = view.getViewTreeObserver();
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field View view>
		//    2    4:invokevirtual   #211 <Method ViewTreeObserver View.getViewTreeObserver()>
		//    3    7:astore_1        
			if(viewtreeobserver.isAlive())
		//*   4    8:aload_1         
		//*   5    9:invokevirtual   #216 <Method boolean ViewTreeObserver.isAlive()>
		//*   6   12:ifeq            23
				viewtreeobserver.removeOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (layoutListener)));
		//    7   15:aload_1         
		//    8   16:aload_0         
		//    9   17:getfield        #218 <Field ViewTarget$SizeDeterminer$SizeDeterminerLayoutListener layoutListener>
		//   10   20:invokevirtual   #222 <Method void ViewTreeObserver.removeOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
			layoutListener = null;
		//   11   23:aload_0         
		//   12   24:aconst_null     
		//   13   25:putfield        #218 <Field ViewTarget$SizeDeterminer$SizeDeterminerLayoutListener layoutListener>
			cbs.clear();
		//   14   28:aload_0         
		//   15   29:getfield        #37  <Field List cbs>
		//   16   32:invokeinterface #225 <Method void List.clear()>
		//   17   37:return          
		}

		void getSize(SizeReadyCallback sizereadycallback)
		{
			int i = getTargetWidth();
		//    0    0:aload_0         
		//    1    1:invokespecial   #198 <Method int getTargetWidth()>
		//    2    4:istore_2        
			int j = getTargetHeight();
		//    3    5:aload_0         
		//    4    6:invokespecial   #200 <Method int getTargetHeight()>
		//    5    9:istore_3        
			if(isViewStateAndSizeValid(i, j))
		//*   6   10:aload_0         
		//*   7   11:iload_2         
		//*   8   12:iload_3         
		//*   9   13:invokespecial   #202 <Method boolean isViewStateAndSizeValid(int, int)>
		//*  10   16:ifeq            28
			{
				sizereadycallback.onSizeReady(i, j);
		//   11   19:aload_1         
		//   12   20:iload_2         
		//   13   21:iload_3         
		//   14   22:invokeinterface #190 <Method void SizeReadyCallback.onSizeReady(int, int)>
				return;
		//   15   27:return          
			}
			if(!cbs.contains(((Object) (sizereadycallback))))
		//*  16   28:aload_0         
		//*  17   29:getfield        #37  <Field List cbs>
		//*  18   32:aload_1         
		//*  19   33:invokeinterface #230 <Method boolean List.contains(Object)>
		//*  20   38:ifne            52
				cbs.add(((Object) (sizereadycallback)));
		//   21   41:aload_0         
		//   22   42:getfield        #37  <Field List cbs>
		//   23   45:aload_1         
		//   24   46:invokeinterface #233 <Method boolean List.add(Object)>
		//   25   51:pop             
			if(layoutListener == null)
		//*  26   52:aload_0         
		//*  27   53:getfield        #218 <Field ViewTarget$SizeDeterminer$SizeDeterminerLayoutListener layoutListener>
		//*  28   56:ifnonnull       87
			{
				sizereadycallback = ((SizeReadyCallback) (view.getViewTreeObserver()));
		//   29   59:aload_0         
		//   30   60:getfield        #39  <Field View view>
		//   31   63:invokevirtual   #211 <Method ViewTreeObserver View.getViewTreeObserver()>
		//   32   66:astore_1        
				layoutListener = new SizeDeterminerLayoutListener(this);
		//   33   67:aload_0         
		//   34   68:new             #9   <Class ViewTarget$SizeDeterminer$SizeDeterminerLayoutListener>
		//   35   71:dup             
		//   36   72:aload_0         
		//   37   73:invokespecial   #236 <Method void ViewTarget$SizeDeterminer$SizeDeterminerLayoutListener(ViewTarget$SizeDeterminer)>
		//   38   76:putfield        #218 <Field ViewTarget$SizeDeterminer$SizeDeterminerLayoutListener layoutListener>
				((ViewTreeObserver) (sizereadycallback)).addOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (layoutListener)));
		//   39   79:aload_1         
		//   40   80:aload_0         
		//   41   81:getfield        #218 <Field ViewTarget$SizeDeterminer$SizeDeterminerLayoutListener layoutListener>
		//   42   84:invokevirtual   #239 <Method void ViewTreeObserver.addOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
			}
		//   43   87:return          
		}

		void removeCallback(SizeReadyCallback sizereadycallback)
		{
			cbs.remove(((Object) (sizereadycallback)));
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field List cbs>
		//    2    4:aload_1         
		//    3    5:invokeinterface #243 <Method boolean List.remove(Object)>
		//    4   10:pop             
		//    5   11:return          
		}

		private static final int PENDING_SIZE = 0;
		static Integer maxDisplayLength;
		private final List cbs = new ArrayList();
		private SizeDeterminerLayoutListener layoutListener;
		private final View view;
		boolean waitForLayout;

		SizeDeterminer(View view1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #32  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #34  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #35  <Method void ArrayList()>
		//    6   12:putfield        #37  <Field List cbs>
			view = view1;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #39  <Field View view>
		//   10   20:return          
		}
	}

	private static final class SizeDeterminer.SizeDeterminerLayoutListener
		implements android.view.ViewTreeObserver.OnPreDrawListener
	{

		public boolean onPreDraw()
		{
			if(Log.isLoggable("ViewTarget", 2))
		//*   0    0:ldc1            #34  <String "ViewTarget">
		//*   1    2:iconst_2        
		//*   2    3:invokestatic    #40  <Method boolean Log.isLoggable(String, int)>
		//*   3    6:ifeq            40
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    4    9:new             #42  <Class StringBuilder>
		//    5   12:dup             
		//    6   13:invokespecial   #43  <Method void StringBuilder()>
		//    7   16:astore_1        
				stringbuilder.append("OnGlobalLayoutListener called attachStateListener=");
		//    8   17:aload_1         
		//    9   18:ldc1            #45  <String "OnGlobalLayoutListener called attachStateListener=">
		//   10   20:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
		//   11   23:pop             
				stringbuilder.append(((Object) (this)));
		//   12   24:aload_1         
		//   13   25:aload_0         
		//   14   26:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
		//   15   29:pop             
				Log.v("ViewTarget", stringbuilder.toString());
		//   16   30:ldc1            #34  <String "ViewTarget">
		//   17   32:aload_1         
		//   18   33:invokevirtual   #56  <Method String StringBuilder.toString()>
		//   19   36:invokestatic    #60  <Method int Log.v(String, String)>
		//   20   39:pop             
			}
			SizeDeterminer sizedeterminer = (SizeDeterminer)sizeDeterminerRef.get();
		//   21   40:aload_0         
		//   22   41:getfield        #28  <Field WeakReference sizeDeterminerRef>
		//   23   44:invokevirtual   #64  <Method Object WeakReference.get()>
		//   24   47:checkcast       #8   <Class ViewTarget$SizeDeterminer>
		//   25   50:astore_1        
			if(sizedeterminer != null)
		//*  26   51:aload_1         
		//*  27   52:ifnull          59
				sizedeterminer.checkCurrentDimens();
		//   28   55:aload_1         
		//   29   56:invokevirtual   #67  <Method void ViewTarget$SizeDeterminer.checkCurrentDimens()>
			return true;
		//   30   59:iconst_1        
		//   31   60:ireturn         
		}

		private final WeakReference sizeDeterminerRef;

		SizeDeterminer.SizeDeterminerLayoutListener(SizeDeterminer sizedeterminer)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			sizeDeterminerRef = new WeakReference(((Object) (sizedeterminer)));
		//    2    4:aload_0         
		//    3    5:new             #23  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #26  <Method void WeakReference(Object)>
		//    7   13:putfield        #28  <Field WeakReference sizeDeterminerRef>
		//    8   16:return          
		}
	}


	public ViewTarget(View view1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void BaseTarget()>
		view = (View)Preconditions.checkNotNull(((Object) (view1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #44  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #46  <Class View>
	//    6   12:putfield        #48  <Field View view>
		sizeDeterminer = new SizeDeterminer(view1);
	//    7   15:aload_0         
	//    8   16:new             #9   <Class ViewTarget$SizeDeterminer>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokespecial   #50  <Method void ViewTarget$SizeDeterminer(View)>
	//   12   24:putfield        #52  <Field ViewTarget$SizeDeterminer sizeDeterminer>
	//   13   27:return          
	}

	public ViewTarget(View view1, boolean flag)
	{
		this(view1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #58  <Method void ViewTarget(View)>
		if(flag)
	//*   3    5:iload_2         
	//*   4    6:ifeq            14
			waitForLayout();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #62  <Method ViewTarget waitForLayout()>
	//    7   13:pop             
	//    8   14:return          
	}

	private Object getTag()
	{
		Integer integer = tagId;
	//    0    0:getstatic       #68  <Field Integer tagId>
	//    1    3:astore_1        
		if(integer == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       16
			return view.getTag();
	//    4    8:aload_0         
	//    5    9:getfield        #48  <Field View view>
	//    6   12:invokevirtual   #70  <Method Object View.getTag()>
	//    7   15:areturn         
		else
			return view.getTag(integer.intValue());
	//    8   16:aload_0         
	//    9   17:getfield        #48  <Field View view>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #76  <Method int Integer.intValue()>
	//   12   24:invokevirtual   #79  <Method Object View.getTag(int)>
	//   13   27:areturn         
	}

	private void maybeAddAttachStateListener()
	{
		android.view.View.OnAttachStateChangeListener onattachstatechangelistener = attachStateListener;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field android.view.View$OnAttachStateChangeListener attachStateListener>
	//    2    4:astore_1        
		if(onattachstatechangelistener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          31
		{
			if(isAttachStateListenerAdded)
	//*   5    9:aload_0         
	//*   6   10:getfield        #85  <Field boolean isAttachStateListenerAdded>
	//*   7   13:ifeq            17
			{
				return;
	//    8   16:return          
			} else
			{
				view.addOnAttachStateChangeListener(onattachstatechangelistener);
	//    9   17:aload_0         
	//   10   18:getfield        #48  <Field View view>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #89  <Method void View.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
				isAttachStateListenerAdded = true;
	//   13   25:aload_0         
	//   14   26:iconst_1        
	//   15   27:putfield        #85  <Field boolean isAttachStateListenerAdded>
				return;
	//   16   30:return          
			}
		} else
		{
			return;
	//   17   31:return          
		}
	}

	private void maybeRemoveAttachStateListener()
	{
		android.view.View.OnAttachStateChangeListener onattachstatechangelistener = attachStateListener;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field android.view.View$OnAttachStateChangeListener attachStateListener>
	//    2    4:astore_1        
		if(onattachstatechangelistener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          31
		{
			if(!isAttachStateListenerAdded)
	//*   5    9:aload_0         
	//*   6   10:getfield        #85  <Field boolean isAttachStateListenerAdded>
	//*   7   13:ifne            17
			{
				return;
	//    8   16:return          
			} else
			{
				view.removeOnAttachStateChangeListener(onattachstatechangelistener);
	//    9   17:aload_0         
	//   10   18:getfield        #48  <Field View view>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #93  <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
				isAttachStateListenerAdded = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #85  <Field boolean isAttachStateListenerAdded>
				return;
	//   16   30:return          
			}
		} else
		{
			return;
	//   17   31:return          
		}
	}

	private void setTag(Object obj)
	{
		Integer integer = tagId;
	//    0    0:getstatic       #68  <Field Integer tagId>
	//    1    3:astore_2        
		if(integer == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       21
		{
			isTagUsedAtLeastOnce = true;
	//    4    8:iconst_1        
	//    5    9:putstatic       #97  <Field boolean isTagUsedAtLeastOnce>
			view.setTag(obj);
	//    6   12:aload_0         
	//    7   13:getfield        #48  <Field View view>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #99  <Method void View.setTag(Object)>
			return;
	//   10   20:return          
		} else
		{
			view.setTag(integer.intValue(), obj);
	//   11   21:aload_0         
	//   12   22:getfield        #48  <Field View view>
	//   13   25:aload_2         
	//   14   26:invokevirtual   #76  <Method int Integer.intValue()>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #102 <Method void View.setTag(int, Object)>
			return;
	//   17   33:return          
		}
	}

	public static void setTagId(int i)
	{
		if(tagId == null && !isTagUsedAtLeastOnce)
	//*   0    0:getstatic       #68  <Field Integer tagId>
	//*   1    3:ifnonnull       20
	//*   2    6:getstatic       #97  <Field boolean isTagUsedAtLeastOnce>
	//*   3    9:ifne            20
		{
			tagId = Integer.valueOf(i);
	//    4   12:iload_0         
	//    5   13:invokestatic    #108 <Method Integer Integer.valueOf(int)>
	//    6   16:putstatic       #68  <Field Integer tagId>
			return;
	//    7   19:return          
		} else
		{
			throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
	//    8   20:new             #110 <Class IllegalArgumentException>
	//    9   23:dup             
	//   10   24:ldc1            #112 <String "You cannot set the tag id more than once or change the tag id after the first request has been made">
	//   11   26:invokespecial   #115 <Method void IllegalArgumentException(String)>
	//   12   29:athrow          
		}
	}

	public final ViewTarget clearOnDetach()
	{
		if(attachStateListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field android.view.View$OnAttachStateChangeListener attachStateListener>
	//*   2    4:ifnull          9
		{
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		} else
		{
			attachStateListener = new android.view.View.OnAttachStateChangeListener() {

				public void onViewAttachedToWindow(View view1)
				{
					resumeMyRequest();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field ViewTarget this$0>
				//    2    4:invokevirtual   #26  <Method void ViewTarget.resumeMyRequest()>
				//    3    7:return          
				}

				public void onViewDetachedFromWindow(View view1)
				{
					pauseMyRequest();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field ViewTarget this$0>
				//    2    4:invokevirtual   #30  <Method void ViewTarget.pauseMyRequest()>
				//    3    7:return          
				}

				final ViewTarget this$0;

			
			{
				this$0 = ViewTarget.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ViewTarget this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//    5    9:aload_0         
	//    6   10:new             #7   <Class ViewTarget$1>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #119 <Method void ViewTarget$1(ViewTarget)>
	//   10   18:putfield        #83  <Field android.view.View$OnAttachStateChangeListener attachStateListener>
			maybeAddAttachStateListener();
	//   11   21:aload_0         
	//   12   22:invokespecial   #121 <Method void maybeAddAttachStateListener()>
			return this;
	//   13   25:aload_0         
	//   14   26:areturn         
		}
	}

	public Request getRequest()
	{
		Object obj = getTag();
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method Object getTag()>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          31
		{
			if(obj instanceof Request)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #127 <Class Request>
	//*   7   13:ifeq            21
				return (Request)obj;
	//    8   16:aload_1         
	//    9   17:checkcast       #127 <Class Request>
	//   10   20:areturn         
			else
				throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
	//   11   21:new             #110 <Class IllegalArgumentException>
	//   12   24:dup             
	//   13   25:ldc1            #129 <String "You must not call setTag() on a view Glide is targeting">
	//   14   27:invokespecial   #115 <Method void IllegalArgumentException(String)>
	//   15   30:athrow          
		} else
		{
			return null;
	//   16   31:aconst_null     
	//   17   32:areturn         
		}
	}

	public void getSize(SizeReadyCallback sizereadycallback)
	{
		sizeDeterminer.getSize(sizereadycallback);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ViewTarget$SizeDeterminer sizeDeterminer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #134 <Method void ViewTarget$SizeDeterminer.getSize(SizeReadyCallback)>
	//    4    8:return          
	}

	public View getView()
	{
		return view;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field View view>
	//    2    4:areturn         
	}

	public void onLoadCleared(Drawable drawable)
	{
		super.onLoadCleared(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #141 <Method void BaseTarget.onLoadCleared(Drawable)>
		sizeDeterminer.clearCallbacksAndListener();
	//    3    5:aload_0         
	//    4    6:getfield        #52  <Field ViewTarget$SizeDeterminer sizeDeterminer>
	//    5    9:invokevirtual   #144 <Method void ViewTarget$SizeDeterminer.clearCallbacksAndListener()>
		if(!isClearedByUs)
	//*   6   12:aload_0         
	//*   7   13:getfield        #146 <Field boolean isClearedByUs>
	//*   8   16:ifne            23
			maybeRemoveAttachStateListener();
	//    9   19:aload_0         
	//   10   20:invokespecial   #148 <Method void maybeRemoveAttachStateListener()>
	//   11   23:return          
	}

	public void onLoadStarted(Drawable drawable)
	{
		super.onLoadStarted(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #151 <Method void BaseTarget.onLoadStarted(Drawable)>
		maybeAddAttachStateListener();
	//    3    5:aload_0         
	//    4    6:invokespecial   #121 <Method void maybeAddAttachStateListener()>
	//    5    9:return          
	}

	void pauseMyRequest()
	{
		Request request = getRequest();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #154 <Method Request getRequest()>
	//    2    4:astore_1        
		if(request != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          25
		{
			isClearedByUs = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #146 <Field boolean isClearedByUs>
			request.clear();
	//    8   14:aload_1         
	//    9   15:invokeinterface #157 <Method void Request.clear()>
			isClearedByUs = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #146 <Field boolean isClearedByUs>
		}
	//   13   25:return          
	}

	public void removeCallback(SizeReadyCallback sizereadycallback)
	{
		sizeDeterminer.removeCallback(sizereadycallback);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ViewTarget$SizeDeterminer sizeDeterminer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #160 <Method void ViewTarget$SizeDeterminer.removeCallback(SizeReadyCallback)>
	//    4    8:return          
	}

	void resumeMyRequest()
	{
		Request request = getRequest();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #154 <Method Request getRequest()>
	//    2    4:astore_1        
		if(request != null && request.isCleared())
	//*   3    5:aload_1         
	//*   4    6:ifnull          24
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #165 <Method boolean Request.isCleared()>
	//*   7   15:ifeq            24
			request.begin();
	//    8   18:aload_1         
	//    9   19:invokeinterface #168 <Method void Request.begin()>
	//   10   24:return          
	}

	public void setRequest(Request request)
	{
		setTag(((Object) (request)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #171 <Method void setTag(Object)>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #175 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #176 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Target for: ");
	//    4    8:aload_1         
	//    5    9:ldc1            #178 <String "Target for: ">
	//    6   11:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (view)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #48  <Field View view>
	//   11   20:invokevirtual   #185 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		return stringbuilder.toString();
	//   13   24:aload_1         
	//   14   25:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   15   28:areturn         
	}

	public final ViewTarget waitForLayout()
	{
		sizeDeterminer.waitForLayout = true;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ViewTarget$SizeDeterminer sizeDeterminer>
	//    2    4:iconst_1        
	//    3    5:putfield        #189 <Field boolean ViewTarget$SizeDeterminer.waitForLayout>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	private static final String TAG = "ViewTarget";
	private static boolean isTagUsedAtLeastOnce;
	private static Integer tagId;
	private android.view.View.OnAttachStateChangeListener attachStateListener;
	private boolean isAttachStateListenerAdded;
	private boolean isClearedByUs;
	private final SizeDeterminer sizeDeterminer;
	protected final View view;
}
