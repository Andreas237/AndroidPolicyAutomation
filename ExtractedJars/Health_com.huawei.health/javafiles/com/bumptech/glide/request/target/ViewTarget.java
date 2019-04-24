// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.Preconditions;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package com.bumptech.glide.request.target:
//			BaseTarget, SizeReadyCallback

public abstract class ViewTarget extends BaseTarget
{
	static class SizeDeterminer
	{

		private int getTargetDimen(int i, int j, int k)
		{
			i -= k;
		//    0    0:iload_1         
		//    1    1:iload_3         
		//    2    2:isub            
		//    3    3:istore_1        
			if(isSizeValid(i))
		//*   4    4:aload_0         
		//*   5    5:iload_1         
		//*   6    6:invokespecial   #40  <Method boolean isSizeValid(int)>
		//*   7    9:ifeq            14
				return i;
		//    8   12:iload_1         
		//    9   13:ireturn         
			if(j == 0)
		//*  10   14:iload_2         
		//*  11   15:ifne            20
				return 0;
		//   12   18:iconst_0        
		//   13   19:ireturn         
			if(j == -2)
		//*  14   20:iload_2         
		//*  15   21:bipush          -2
		//*  16   23:icmpne          29
				return 0x80000000;
		//   17   26:ldc1            #41  <Int 0x80000000>
		//   18   28:ireturn         
			if(j > 0)
		//*  19   29:iload_2         
		//*  20   30:ifle            37
				return j - k;
		//   21   33:iload_2         
		//   22   34:iload_3         
		//   23   35:isub            
		//   24   36:ireturn         
			else
				return 0;
		//   25   37:iconst_0        
		//   26   38:ireturn         
		}

		private int getTargetHeight()
		{
			int j = view.getPaddingTop();
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field View view>
		//    2    4:invokevirtual   #48  <Method int View.getPaddingTop()>
		//    3    7:istore_2        
			int k = view.getPaddingBottom();
		//    4    8:aload_0         
		//    5    9:getfield        #33  <Field View view>
		//    6   12:invokevirtual   #51  <Method int View.getPaddingBottom()>
		//    7   15:istore_3        
			android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
		//    8   16:aload_0         
		//    9   17:getfield        #33  <Field View view>
		//   10   20:invokevirtual   #55  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   11   23:astore          4
			int i;
			if(layoutparams != null)
		//*  12   25:aload           4
		//*  13   27:ifnull          39
				i = layoutparams.height;
		//   14   30:aload           4
		//   15   32:getfield        #60  <Field int android.view.ViewGroup$LayoutParams.height>
		//   16   35:istore_1        
			else
		//*  17   36:goto            41
				i = 0;
		//   18   39:iconst_0        
		//   19   40:istore_1        
			return getTargetDimen(view.getHeight(), i, j + k);
		//   20   41:aload_0         
		//   21   42:aload_0         
		//   22   43:getfield        #33  <Field View view>
		//   23   46:invokevirtual   #63  <Method int View.getHeight()>
		//   24   49:iload_1         
		//   25   50:iload_2         
		//   26   51:iload_3         
		//   27   52:iadd            
		//   28   53:invokespecial   #65  <Method int getTargetDimen(int, int, int)>
		//   29   56:ireturn         
		}

		private int getTargetWidth()
		{
			int j = view.getPaddingLeft();
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field View view>
		//    2    4:invokevirtual   #69  <Method int View.getPaddingLeft()>
		//    3    7:istore_2        
			int k = view.getPaddingRight();
		//    4    8:aload_0         
		//    5    9:getfield        #33  <Field View view>
		//    6   12:invokevirtual   #72  <Method int View.getPaddingRight()>
		//    7   15:istore_3        
			android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
		//    8   16:aload_0         
		//    9   17:getfield        #33  <Field View view>
		//   10   20:invokevirtual   #55  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   11   23:astore          4
			int i;
			if(layoutparams != null)
		//*  12   25:aload           4
		//*  13   27:ifnull          39
				i = layoutparams.width;
		//   14   30:aload           4
		//   15   32:getfield        #75  <Field int android.view.ViewGroup$LayoutParams.width>
		//   16   35:istore_1        
			else
		//*  17   36:goto            41
				i = 0;
		//   18   39:iconst_0        
		//   19   40:istore_1        
			return getTargetDimen(view.getWidth(), i, j + k);
		//   20   41:aload_0         
		//   21   42:aload_0         
		//   22   43:getfield        #33  <Field View view>
		//   23   46:invokevirtual   #78  <Method int View.getWidth()>
		//   24   49:iload_1         
		//   25   50:iload_2         
		//   26   51:iload_3         
		//   27   52:iadd            
		//   28   53:invokespecial   #65  <Method int getTargetDimen(int, int, int)>
		//   29   56:ireturn         
		}

		private boolean isSizeValid(int i)
		{
			return i > 0 || i == 0x80000000;
		//    0    0:iload_1         
		//    1    1:ifgt            10
		//    2    4:iload_1         
		//    3    5:ldc1            #41  <Int 0x80000000>
		//    4    7:icmpne          12
		//    5   10:iconst_1        
		//    6   11:ireturn         
		//    7   12:iconst_0        
		//    8   13:ireturn         
		}

		private boolean isViewStateAndSizeValid(int i, int j)
		{
			return isViewStateValid() && isSizeValid(i) && isSizeValid(j);
		//    0    0:aload_0         
		//    1    1:invokespecial   #84  <Method boolean isViewStateValid()>
		//    2    4:ifeq            25
		//    3    7:aload_0         
		//    4    8:iload_1         
		//    5    9:invokespecial   #40  <Method boolean isSizeValid(int)>
		//    6   12:ifeq            25
		//    7   15:aload_0         
		//    8   16:iload_2         
		//    9   17:invokespecial   #40  <Method boolean isSizeValid(int)>
		//   10   20:ifeq            25
		//   11   23:iconst_1        
		//   12   24:ireturn         
		//   13   25:iconst_0        
		//   14   26:ireturn         
		}

		private boolean isViewStateValid()
		{
			if(view.getLayoutParams() != null && view.getLayoutParams().width > 0 && view.getLayoutParams().height > 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #33  <Field View view>
		//*   2    4:invokevirtual   #55  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//*   3    7:ifnull          38
		//*   4   10:aload_0         
		//*   5   11:getfield        #33  <Field View view>
		//*   6   14:invokevirtual   #55  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//*   7   17:getfield        #75  <Field int android.view.ViewGroup$LayoutParams.width>
		//*   8   20:ifle            38
		//*   9   23:aload_0         
		//*  10   24:getfield        #33  <Field View view>
		//*  11   27:invokevirtual   #55  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//*  12   30:getfield        #60  <Field int android.view.ViewGroup$LayoutParams.height>
		//*  13   33:ifle            38
				return true;
		//   14   36:iconst_1        
		//   15   37:ireturn         
			return !view.isLayoutRequested();
		//   16   38:aload_0         
		//   17   39:getfield        #33  <Field View view>
		//   18   42:invokevirtual   #87  <Method boolean View.isLayoutRequested()>
		//   19   45:ifne            50
		//   20   48:iconst_1        
		//   21   49:ireturn         
		//   22   50:iconst_0        
		//   23   51:ireturn         
		}

		private void notifyCbs(int i, int j)
		{
			for(Iterator iterator = (new ArrayList(((java.util.Collection) (cbs)))).iterator(); iterator.hasNext(); ((SizeReadyCallback)iterator.next()).onSizeReady(i, j));
		//    0    0:new             #28  <Class ArrayList>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #31  <Field List cbs>
		//    4    8:invokespecial   #92  <Method void ArrayList(java.util.Collection)>
		//    5   11:invokevirtual   #96  <Method Iterator ArrayList.iterator()>
		//    6   14:astore_3        
		//    7   15:aload_3         
		//    8   16:invokeinterface #101 <Method boolean Iterator.hasNext()>
		//    9   21:ifeq            43
		//   10   24:aload_3         
		//   11   25:invokeinterface #105 <Method Object Iterator.next()>
		//   12   30:checkcast       #107 <Class SizeReadyCallback>
		//   13   33:iload_1         
		//   14   34:iload_2         
		//   15   35:invokeinterface #110 <Method void SizeReadyCallback.onSizeReady(int, int)>
		//*  16   40:goto            15
		//   17   43:return          
		}

		void checkCurrentDimens()
		{
			if(cbs.isEmpty())
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field List cbs>
		//*   2    4:invokeinterface #116 <Method boolean List.isEmpty()>
		//*   3    9:ifeq            13
				return;
		//    4   12:return          
			int i = getTargetWidth();
		//    5   13:aload_0         
		//    6   14:invokespecial   #118 <Method int getTargetWidth()>
		//    7   17:istore_1        
			int j = getTargetHeight();
		//    8   18:aload_0         
		//    9   19:invokespecial   #120 <Method int getTargetHeight()>
		//   10   22:istore_2        
			if(!isViewStateAndSizeValid(i, j))
		//*  11   23:aload_0         
		//*  12   24:iload_1         
		//*  13   25:iload_2         
		//*  14   26:invokespecial   #122 <Method boolean isViewStateAndSizeValid(int, int)>
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
		//   20   36:invokespecial   #124 <Method void notifyCbs(int, int)>
				clearCallbacksAndListener();
		//   21   39:aload_0         
		//   22   40:invokevirtual   #127 <Method void clearCallbacksAndListener()>
				return;
		//   23   43:return          
			}
		}

		void clearCallbacksAndListener()
		{
			ViewTreeObserver viewtreeobserver = view.getViewTreeObserver();
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field View view>
		//    2    4:invokevirtual   #131 <Method ViewTreeObserver View.getViewTreeObserver()>
		//    3    7:astore_1        
			if(viewtreeobserver.isAlive())
		//*   4    8:aload_1         
		//*   5    9:invokevirtual   #136 <Method boolean ViewTreeObserver.isAlive()>
		//*   6   12:ifeq            23
				viewtreeobserver.removeOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (layoutListener)));
		//    7   15:aload_1         
		//    8   16:aload_0         
		//    9   17:getfield        #138 <Field ViewTarget$SizeDeterminer$SizeDeterminerLayoutListener layoutListener>
		//   10   20:invokevirtual   #142 <Method void ViewTreeObserver.removeOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
			layoutListener = null;
		//   11   23:aload_0         
		//   12   24:aconst_null     
		//   13   25:putfield        #138 <Field ViewTarget$SizeDeterminer$SizeDeterminerLayoutListener layoutListener>
			cbs.clear();
		//   14   28:aload_0         
		//   15   29:getfield        #31  <Field List cbs>
		//   16   32:invokeinterface #145 <Method void List.clear()>
		//   17   37:return          
		}

		void getSize(SizeReadyCallback sizereadycallback)
		{
			int i = getTargetWidth();
		//    0    0:aload_0         
		//    1    1:invokespecial   #118 <Method int getTargetWidth()>
		//    2    4:istore_2        
			int j = getTargetHeight();
		//    3    5:aload_0         
		//    4    6:invokespecial   #120 <Method int getTargetHeight()>
		//    5    9:istore_3        
			if(isViewStateAndSizeValid(i, j))
		//*   6   10:aload_0         
		//*   7   11:iload_2         
		//*   8   12:iload_3         
		//*   9   13:invokespecial   #122 <Method boolean isViewStateAndSizeValid(int, int)>
		//*  10   16:ifeq            28
			{
				sizereadycallback.onSizeReady(i, j);
		//   11   19:aload_1         
		//   12   20:iload_2         
		//   13   21:iload_3         
		//   14   22:invokeinterface #110 <Method void SizeReadyCallback.onSizeReady(int, int)>
				return;
		//   15   27:return          
			}
			if(!cbs.contains(((Object) (sizereadycallback))))
		//*  16   28:aload_0         
		//*  17   29:getfield        #31  <Field List cbs>
		//*  18   32:aload_1         
		//*  19   33:invokeinterface #151 <Method boolean List.contains(Object)>
		//*  20   38:ifne            52
				cbs.add(((Object) (sizereadycallback)));
		//   21   41:aload_0         
		//   22   42:getfield        #31  <Field List cbs>
		//   23   45:aload_1         
		//   24   46:invokeinterface #154 <Method boolean List.add(Object)>
		//   25   51:pop             
			if(layoutListener == null)
		//*  26   52:aload_0         
		//*  27   53:getfield        #138 <Field ViewTarget$SizeDeterminer$SizeDeterminerLayoutListener layoutListener>
		//*  28   56:ifnonnull       87
			{
				sizereadycallback = ((SizeReadyCallback) (view.getViewTreeObserver()));
		//   29   59:aload_0         
		//   30   60:getfield        #33  <Field View view>
		//   31   63:invokevirtual   #131 <Method ViewTreeObserver View.getViewTreeObserver()>
		//   32   66:astore_1        
				layoutListener = new SizeDeterminerLayoutListener(this);
		//   33   67:aload_0         
		//   34   68:new             #9   <Class ViewTarget$SizeDeterminer$SizeDeterminerLayoutListener>
		//   35   71:dup             
		//   36   72:aload_0         
		//   37   73:invokespecial   #157 <Method void ViewTarget$SizeDeterminer$SizeDeterminerLayoutListener(ViewTarget$SizeDeterminer)>
		//   38   76:putfield        #138 <Field ViewTarget$SizeDeterminer$SizeDeterminerLayoutListener layoutListener>
				((ViewTreeObserver) (sizereadycallback)).addOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (layoutListener)));
		//   39   79:aload_1         
		//   40   80:aload_0         
		//   41   81:getfield        #138 <Field ViewTarget$SizeDeterminer$SizeDeterminerLayoutListener layoutListener>
		//   42   84:invokevirtual   #160 <Method void ViewTreeObserver.addOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
			}
		//   43   87:return          
		}

		void removeCallback(SizeReadyCallback sizereadycallback)
		{
			cbs.remove(((Object) (sizereadycallback)));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field List cbs>
		//    2    4:aload_1         
		//    3    5:invokeinterface #164 <Method boolean List.remove(Object)>
		//    4   10:pop             
		//    5   11:return          
		}

		private static final int PENDING_SIZE = 0;
		private final List cbs = new ArrayList();
		private SizeDeterminerLayoutListener layoutListener;
		private final View view;

		SizeDeterminer(View view1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #28  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #29  <Method void ArrayList()>
		//    6   12:putfield        #31  <Field List cbs>
			view = view1;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #33  <Field View view>
		//   10   20:return          
		}
	}

	static class SizeDeterminer.SizeDeterminerLayoutListener
		implements android.view.ViewTreeObserver.OnPreDrawListener
	{

		public boolean onPreDraw()
		{
			if(Log.isLoggable("ViewTarget", 2))
		//*   0    0:ldc1            #32  <String "ViewTarget">
		//*   1    2:iconst_2        
		//*   2    3:invokestatic    #38  <Method boolean Log.isLoggable(String, int)>
		//*   3    6:ifeq            34
				Log.v("ViewTarget", (new StringBuilder()).append("OnGlobalLayoutListener called listener=").append(((Object) (this))).toString());
		//    4    9:ldc1            #32  <String "ViewTarget">
		//    5   11:new             #40  <Class StringBuilder>
		//    6   14:dup             
		//    7   15:invokespecial   #41  <Method void StringBuilder()>
		//    8   18:ldc1            #43  <String "OnGlobalLayoutListener called listener=">
		//    9   20:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   10   23:aload_0         
		//   11   24:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
		//   12   27:invokevirtual   #54  <Method String StringBuilder.toString()>
		//   13   30:invokestatic    #58  <Method int Log.v(String, String)>
		//   14   33:pop             
			SizeDeterminer sizedeterminer = (SizeDeterminer)sizeDeterminerRef.get();
		//   15   34:aload_0         
		//   16   35:getfield        #27  <Field WeakReference sizeDeterminerRef>
		//   17   38:invokevirtual   #62  <Method Object WeakReference.get()>
		//   18   41:checkcast       #8   <Class ViewTarget$SizeDeterminer>
		//   19   44:astore_1        
			if(sizedeterminer != null)
		//*  20   45:aload_1         
		//*  21   46:ifnull          53
				sizedeterminer.checkCurrentDimens();
		//   22   49:aload_1         
		//   23   50:invokevirtual   #65  <Method void ViewTarget$SizeDeterminer.checkCurrentDimens()>
			return true;
		//   24   53:iconst_1        
		//   25   54:ireturn         
		}

		private final WeakReference sizeDeterminerRef;

		SizeDeterminer.SizeDeterminerLayoutListener(SizeDeterminer sizedeterminer)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			sizeDeterminerRef = new WeakReference(((Object) (sizedeterminer)));
		//    2    4:aload_0         
		//    3    5:new             #22  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #25  <Method void WeakReference(Object)>
		//    7   13:putfield        #27  <Field WeakReference sizeDeterminerRef>
		//    8   16:return          
		}
	}


	public ViewTarget(View view1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void BaseTarget()>
		view = (View)Preconditions.checkNotNull(((Object) (view1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #43  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #45  <Class View>
	//    6   12:putfield        #47  <Field View view>
		sizeDeterminer = new SizeDeterminer(view1);
	//    7   15:aload_0         
	//    8   16:new             #7   <Class ViewTarget$SizeDeterminer>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokespecial   #49  <Method void ViewTarget$SizeDeterminer(View)>
	//   12   24:putfield        #51  <Field ViewTarget$SizeDeterminer sizeDeterminer>
	//   13   27:return          
	}

	private Object getTag()
	{
		if(tagId == null)
	//*   0    0:getstatic       #32  <Field Integer tagId>
	//*   1    3:ifnonnull       14
			return view.getTag();
	//    2    6:aload_0         
	//    3    7:getfield        #47  <Field View view>
	//    4   10:invokevirtual   #57  <Method Object View.getTag()>
	//    5   13:areturn         
		else
			return view.getTag(tagId.intValue());
	//    6   14:aload_0         
	//    7   15:getfield        #47  <Field View view>
	//    8   18:getstatic       #32  <Field Integer tagId>
	//    9   21:invokevirtual   #63  <Method int Integer.intValue()>
	//   10   24:invokevirtual   #66  <Method Object View.getTag(int)>
	//   11   27:areturn         
	}

	private void setTag(Object obj)
	{
		if(tagId == null)
	//*   0    0:getstatic       #32  <Field Integer tagId>
	//*   1    3:ifnonnull       19
		{
			isTagUsedAtLeastOnce = true;
	//    2    6:iconst_1        
	//    3    7:putstatic       #30  <Field boolean isTagUsedAtLeastOnce>
			view.setTag(obj);
	//    4   10:aload_0         
	//    5   11:getfield        #47  <Field View view>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #71  <Method void View.setTag(Object)>
			return;
	//    8   18:return          
		} else
		{
			view.setTag(tagId.intValue(), obj);
	//    9   19:aload_0         
	//   10   20:getfield        #47  <Field View view>
	//   11   23:getstatic       #32  <Field Integer tagId>
	//   12   26:invokevirtual   #63  <Method int Integer.intValue()>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #74  <Method void View.setTag(int, Object)>
			return;
	//   15   33:return          
		}
	}

	public static void setTagId(int i)
	{
		if(tagId != null || isTagUsedAtLeastOnce)
	//*   0    0:getstatic       #32  <Field Integer tagId>
	//*   1    3:ifnonnull       12
	//*   2    6:getstatic       #30  <Field boolean isTagUsedAtLeastOnce>
	//*   3    9:ifeq            22
		{
			throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
	//    4   12:new             #79  <Class IllegalArgumentException>
	//    5   15:dup             
	//    6   16:ldc1            #81  <String "You cannot set the tag id more than once or change the tag id after the first request has been made">
	//    7   18:invokespecial   #84  <Method void IllegalArgumentException(String)>
	//    8   21:athrow          
		} else
		{
			tagId = Integer.valueOf(i);
	//    9   22:iload_0         
	//   10   23:invokestatic    #88  <Method Integer Integer.valueOf(int)>
	//   11   26:putstatic       #32  <Field Integer tagId>
			return;
	//   12   29:return          
		}
	}

	public Request getRequest()
	{
		Object obj = getTag();
	//    0    0:aload_0         
	//    1    1:invokespecial   #91  <Method Object getTag()>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          31
		{
			if(obj instanceof Request)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #93  <Class Request>
	//*   7   13:ifeq            21
				return (Request)obj;
	//    8   16:aload_1         
	//    9   17:checkcast       #93  <Class Request>
	//   10   20:areturn         
			else
				throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
	//   11   21:new             #79  <Class IllegalArgumentException>
	//   12   24:dup             
	//   13   25:ldc1            #95  <String "You must not call setTag() on a view Glide is targeting">
	//   14   27:invokespecial   #84  <Method void IllegalArgumentException(String)>
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
	//    1    1:getfield        #51  <Field ViewTarget$SizeDeterminer sizeDeterminer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #99  <Method void ViewTarget$SizeDeterminer.getSize(SizeReadyCallback)>
	//    4    8:return          
	}

	public View getView()
	{
		return view;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field View view>
	//    2    4:areturn         
	}

	public void onLoadCleared(Drawable drawable)
	{
		super.onLoadCleared(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #106 <Method void BaseTarget.onLoadCleared(Drawable)>
		sizeDeterminer.clearCallbacksAndListener();
	//    3    5:aload_0         
	//    4    6:getfield        #51  <Field ViewTarget$SizeDeterminer sizeDeterminer>
	//    5    9:invokevirtual   #109 <Method void ViewTarget$SizeDeterminer.clearCallbacksAndListener()>
	//    6   12:return          
	}

	public void removeCallback(SizeReadyCallback sizereadycallback)
	{
		sizeDeterminer.removeCallback(sizereadycallback);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ViewTarget$SizeDeterminer sizeDeterminer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #112 <Method void ViewTarget$SizeDeterminer.removeCallback(SizeReadyCallback)>
	//    4    8:return          
	}

	public void setRequest(Request request)
	{
		setTag(((Object) (request)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #115 <Method void setTag(Object)>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("Target for: ").append(((Object) (view))).toString();
	//    0    0:new             #119 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void StringBuilder()>
	//    3    7:ldc1            #122 <String "Target for: ">
	//    4    9:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #47  <Field View view>
	//    7   16:invokevirtual   #129 <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:invokevirtual   #131 <Method String StringBuilder.toString()>
	//    9   22:areturn         
	}

	private static final String TAG = "ViewTarget";
	private static boolean isTagUsedAtLeastOnce = false;
	private static Integer tagId = null;
	private final SizeDeterminer sizeDeterminer;
	protected final View view;

	static 
	{
		isTagUsedAtLeastOnce = false;
	//    0    0:iconst_0        
	//    1    1:putstatic       #30  <Field boolean isTagUsedAtLeastOnce>
	//    2    4:aconst_null     
	//    3    5:putstatic       #32  <Field Integer tagId>
	//*   4    8:return          
	}
}
