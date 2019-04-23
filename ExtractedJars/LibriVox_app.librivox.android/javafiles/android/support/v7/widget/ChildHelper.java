// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

class ChildHelper
{

	ChildHelper(Callback callback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mCallback = callback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field ChildHelper$Callback mCallback>
	//    5    9:aload_0         
	//    6   10:new             #26  <Class ChildHelper$Bucket>
	//    7   13:dup             
	//    8   14:invokespecial   #27  <Method void ChildHelper$Bucket()>
	//    9   17:putfield        #29  <Field ChildHelper$Bucket mBucket>
	//   10   20:aload_0         
	//   11   21:new             #31  <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #32  <Method void ArrayList()>
	//   14   28:putfield        #34  <Field List mHiddenViews>
	//   15   31:return          
	}

	private int getOffset(int i)
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            6
			return -1;
	//    2    4:iconst_m1       
	//    3    5:ireturn         
		int k = mCallback.getChildCount();
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    6   10:invokeinterface #43  <Method int ChildHelper$Callback.getChildCount()>
	//    7   15:istore_3        
		int l;
		for(int j = i; j < k; j += l)
	//*   8   16:iload_1         
	//*   9   17:istore_2        
	//*  10   18:iload_2         
	//*  11   19:iload_3         
	//*  12   20:icmpge          70
		{
			l = i - (j - mBucket.countOnesBefore(j));
	//   13   23:iload_1         
	//   14   24:iload_2         
	//   15   25:aload_0         
	//   16   26:getfield        #29  <Field ChildHelper$Bucket mBucket>
	//   17   29:iload_2         
	//   18   30:invokevirtual   #46  <Method int ChildHelper$Bucket.countOnesBefore(int)>
	//   19   33:isub            
	//   20   34:isub            
	//   21   35:istore          4
			if(l == 0)
	//*  22   37:iload           4
	//*  23   39:ifne            62
			{
				for(; mBucket.get(j); j++);
	//   24   42:aload_0         
	//   25   43:getfield        #29  <Field ChildHelper$Bucket mBucket>
	//   26   46:iload_2         
	//   27   47:invokevirtual   #50  <Method boolean ChildHelper$Bucket.get(int)>
	//   28   50:ifeq            60
	//   29   53:iload_2         
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:istore_2        
	//*  33   57:goto            42
				return j;
	//   34   60:iload_2         
	//   35   61:ireturn         
			}
		}

	//   36   62:iload_2         
	//   37   63:iload           4
	//   38   65:iadd            
	//   39   66:istore_2        
	//*  40   67:goto            18
		return -1;
	//   41   70:iconst_m1       
	//   42   71:ireturn         
	}

	private void hideViewInternal(View view)
	{
		mHiddenViews.add(((Object) (view)));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field List mHiddenViews>
	//    2    4:aload_1         
	//    3    5:invokeinterface #58  <Method boolean List.add(Object)>
	//    4   10:pop             
		mCallback.onEnteredHiddenState(view);
	//    5   11:aload_0         
	//    6   12:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    7   15:aload_1         
	//    8   16:invokeinterface #61  <Method void ChildHelper$Callback.onEnteredHiddenState(View)>
	//    9   21:return          
	}

	private boolean unhideViewInternal(View view)
	{
		if(mHiddenViews.remove(((Object) (view))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field List mHiddenViews>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #66  <Method boolean List.remove(Object)>
	//*   4   10:ifeq            25
		{
			mCallback.onLeftHiddenState(view);
	//    5   13:aload_0         
	//    6   14:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    7   17:aload_1         
	//    8   18:invokeinterface #69  <Method void ChildHelper$Callback.onLeftHiddenState(View)>
			return true;
	//    9   23:iconst_1        
	//   10   24:ireturn         
		} else
		{
			return false;
	//   11   25:iconst_0        
	//   12   26:ireturn         
		}
	}

	void addView(View view, int i, boolean flag)
	{
		if(i < 0)
	//*   0    0:iload_2         
	//*   1    1:ifge            17
			i = mCallback.getChildCount();
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    4    8:invokeinterface #43  <Method int ChildHelper$Callback.getChildCount()>
	//    5   13:istore_2        
		else
	//*   6   14:goto            23
			i = getOffset(i);
	//    7   17:aload_0         
	//    8   18:iload_2         
	//    9   19:invokespecial   #73  <Method int getOffset(int)>
	//   10   22:istore_2        
		mBucket.insert(i, flag);
	//   11   23:aload_0         
	//   12   24:getfield        #29  <Field ChildHelper$Bucket mBucket>
	//   13   27:iload_2         
	//   14   28:iload_3         
	//   15   29:invokevirtual   #77  <Method void ChildHelper$Bucket.insert(int, boolean)>
		if(flag)
	//*  16   32:iload_3         
	//*  17   33:ifeq            41
			hideViewInternal(view);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokespecial   #79  <Method void hideViewInternal(View)>
		mCallback.addView(view, i);
	//   21   41:aload_0         
	//   22   42:getfield        #24  <Field ChildHelper$Callback mCallback>
	//   23   45:aload_1         
	//   24   46:iload_2         
	//   25   47:invokeinterface #82  <Method void ChildHelper$Callback.addView(View, int)>
	//   26   52:return          
	}

	void addView(View view, boolean flag)
	{
		addView(view, -1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:iload_2         
	//    4    4:invokevirtual   #85  <Method void addView(View, int, boolean)>
	//    5    7:return          
	}

	void attachViewToParent(View view, int i, android.view.ViewGroup.LayoutParams layoutparams, boolean flag)
	{
		if(i < 0)
	//*   0    0:iload_2         
	//*   1    1:ifge            17
			i = mCallback.getChildCount();
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    4    8:invokeinterface #43  <Method int ChildHelper$Callback.getChildCount()>
	//    5   13:istore_2        
		else
	//*   6   14:goto            23
			i = getOffset(i);
	//    7   17:aload_0         
	//    8   18:iload_2         
	//    9   19:invokespecial   #73  <Method int getOffset(int)>
	//   10   22:istore_2        
		mBucket.insert(i, flag);
	//   11   23:aload_0         
	//   12   24:getfield        #29  <Field ChildHelper$Bucket mBucket>
	//   13   27:iload_2         
	//   14   28:iload           4
	//   15   30:invokevirtual   #77  <Method void ChildHelper$Bucket.insert(int, boolean)>
		if(flag)
	//*  16   33:iload           4
	//*  17   35:ifeq            43
			hideViewInternal(view);
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:invokespecial   #79  <Method void hideViewInternal(View)>
		mCallback.attachViewToParent(view, i, layoutparams);
	//   21   43:aload_0         
	//   22   44:getfield        #24  <Field ChildHelper$Callback mCallback>
	//   23   47:aload_1         
	//   24   48:iload_2         
	//   25   49:aload_3         
	//   26   50:invokeinterface #90  <Method void ChildHelper$Callback.attachViewToParent(View, int, android.view.ViewGroup$LayoutParams)>
	//   27   55:return          
	}

	void detachViewFromParent(int i)
	{
		i = getOffset(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #73  <Method int getOffset(int)>
	//    3    5:istore_1        
		mBucket.remove(i);
	//    4    6:aload_0         
	//    5    7:getfield        #29  <Field ChildHelper$Bucket mBucket>
	//    6   10:iload_1         
	//    7   11:invokevirtual   #94  <Method boolean ChildHelper$Bucket.remove(int)>
	//    8   14:pop             
		mCallback.detachViewFromParent(i);
	//    9   15:aload_0         
	//   10   16:getfield        #24  <Field ChildHelper$Callback mCallback>
	//   11   19:iload_1         
	//   12   20:invokeinterface #96  <Method void ChildHelper$Callback.detachViewFromParent(int)>
	//   13   25:return          
	}

	View findHiddenNonRemovedView(int i)
	{
		int k = mHiddenViews.size();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field List mHiddenViews>
	//    2    4:invokeinterface #101 <Method int List.size()>
	//    3    9:istore_3        
		for(int j = 0; j < k; j++)
	//*   4   10:iconst_0        
	//*   5   11:istore_2        
	//*   6   12:iload_2         
	//*   7   13:iload_3         
	//*   8   14:icmpge          80
		{
			View view = (View)mHiddenViews.get(j);
	//    9   17:aload_0         
	//   10   18:getfield        #34  <Field List mHiddenViews>
	//   11   21:iload_2         
	//   12   22:invokeinterface #104 <Method Object List.get(int)>
	//   13   27:checkcast       #106 <Class View>
	//   14   30:astore          4
			RecyclerView.ViewHolder viewholder = mCallback.getChildViewHolder(view);
	//   15   32:aload_0         
	//   16   33:getfield        #24  <Field ChildHelper$Callback mCallback>
	//   17   36:aload           4
	//   18   38:invokeinterface #110 <Method RecyclerView$ViewHolder ChildHelper$Callback.getChildViewHolder(View)>
	//   19   43:astore          5
			if(viewholder.getLayoutPosition() == i && !viewholder.isInvalid() && !viewholder.isRemoved())
	//*  20   45:aload           5
	//*  21   47:invokevirtual   #115 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//*  22   50:iload_1         
	//*  23   51:icmpne          73
	//*  24   54:aload           5
	//*  25   56:invokevirtual   #119 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//*  26   59:ifne            73
	//*  27   62:aload           5
	//*  28   64:invokevirtual   #122 <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  29   67:ifne            73
				return view;
	//   30   70:aload           4
	//   31   72:areturn         
		}

	//   32   73:iload_2         
	//   33   74:iconst_1        
	//   34   75:iadd            
	//   35   76:istore_2        
	//*  36   77:goto            12
		return null;
	//   37   80:aconst_null     
	//   38   81:areturn         
	}

	View getChildAt(int i)
	{
		i = getOffset(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #73  <Method int getOffset(int)>
	//    3    5:istore_1        
		return mCallback.getChildAt(i);
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    6   10:iload_1         
	//    7   11:invokeinterface #125 <Method View ChildHelper$Callback.getChildAt(int)>
	//    8   16:areturn         
	}

	int getChildCount()
	{
		return mCallback.getChildCount() - mHiddenViews.size();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    2    4:invokeinterface #43  <Method int ChildHelper$Callback.getChildCount()>
	//    3    9:aload_0         
	//    4   10:getfield        #34  <Field List mHiddenViews>
	//    5   13:invokeinterface #101 <Method int List.size()>
	//    6   18:isub            
	//    7   19:ireturn         
	}

	View getUnfilteredChildAt(int i)
	{
		return mCallback.getChildAt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    2    4:iload_1         
	//    3    5:invokeinterface #125 <Method View ChildHelper$Callback.getChildAt(int)>
	//    4   10:areturn         
	}

	int getUnfilteredChildCount()
	{
		return mCallback.getChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    2    4:invokeinterface #43  <Method int ChildHelper$Callback.getChildCount()>
	//    3    9:ireturn         
	}

	void hide(View view)
	{
		int i = mCallback.indexOfChild(view);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #132 <Method int ChildHelper$Callback.indexOfChild(View)>
	//    4   10:istore_2        
		if(i >= 0)
	//*   5   11:iload_2         
	//*   6   12:iflt            29
		{
			mBucket.set(i);
	//    7   15:aload_0         
	//    8   16:getfield        #29  <Field ChildHelper$Bucket mBucket>
	//    9   19:iload_2         
	//   10   20:invokevirtual   #135 <Method void ChildHelper$Bucket.set(int)>
			hideViewInternal(view);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokespecial   #79  <Method void hideViewInternal(View)>
			return;
	//   14   28:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   15   29:new             #137 <Class StringBuilder>
	//   16   32:dup             
	//   17   33:invokespecial   #138 <Method void StringBuilder()>
	//   18   36:astore_3        
			stringbuilder.append("view is not a child, cannot hide ");
	//   19   37:aload_3         
	//   20   38:ldc1            #140 <String "view is not a child, cannot hide ">
	//   21   40:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
			stringbuilder.append(((Object) (view)));
	//   23   44:aload_3         
	//   24   45:aload_1         
	//   25   46:invokevirtual   #147 <Method StringBuilder StringBuilder.append(Object)>
	//   26   49:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   27   50:new             #149 <Class IllegalArgumentException>
	//   28   53:dup             
	//   29   54:aload_3         
	//   30   55:invokevirtual   #153 <Method String StringBuilder.toString()>
	//   31   58:invokespecial   #156 <Method void IllegalArgumentException(String)>
	//   32   61:athrow          
		}
	}

	int indexOfChild(View view)
	{
		int i = mCallback.indexOfChild(view);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #132 <Method int ChildHelper$Callback.indexOfChild(View)>
	//    4   10:istore_2        
		if(i == -1)
	//*   5   11:iload_2         
	//*   6   12:iconst_m1       
	//*   7   13:icmpne          18
			return -1;
	//    8   16:iconst_m1       
	//    9   17:ireturn         
		if(mBucket.get(i))
	//*  10   18:aload_0         
	//*  11   19:getfield        #29  <Field ChildHelper$Bucket mBucket>
	//*  12   22:iload_2         
	//*  13   23:invokevirtual   #50  <Method boolean ChildHelper$Bucket.get(int)>
	//*  14   26:ifeq            31
			return -1;
	//   15   29:iconst_m1       
	//   16   30:ireturn         
		else
			return i - mBucket.countOnesBefore(i);
	//   17   31:iload_2         
	//   18   32:aload_0         
	//   19   33:getfield        #29  <Field ChildHelper$Bucket mBucket>
	//   20   36:iload_2         
	//   21   37:invokevirtual   #46  <Method int ChildHelper$Bucket.countOnesBefore(int)>
	//   22   40:isub            
	//   23   41:ireturn         
	}

	boolean isHidden(View view)
	{
		return mHiddenViews.contains(((Object) (view)));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field List mHiddenViews>
	//    2    4:aload_1         
	//    3    5:invokeinterface #160 <Method boolean List.contains(Object)>
	//    4   10:ireturn         
	}

	void removeAllViewsUnfiltered()
	{
		mBucket.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ChildHelper$Bucket mBucket>
	//    2    4:invokevirtual   #164 <Method void ChildHelper$Bucket.reset()>
		for(int i = mHiddenViews.size() - 1; i >= 0; i--)
	//*   3    7:aload_0         
	//*   4    8:getfield        #34  <Field List mHiddenViews>
	//*   5   11:invokeinterface #101 <Method int List.size()>
	//*   6   16:iconst_1        
	//*   7   17:isub            
	//*   8   18:istore_1        
	//*   9   19:iload_1         
	//*  10   20:iflt            63
		{
			mCallback.onLeftHiddenState((View)mHiddenViews.get(i));
	//   11   23:aload_0         
	//   12   24:getfield        #24  <Field ChildHelper$Callback mCallback>
	//   13   27:aload_0         
	//   14   28:getfield        #34  <Field List mHiddenViews>
	//   15   31:iload_1         
	//   16   32:invokeinterface #104 <Method Object List.get(int)>
	//   17   37:checkcast       #106 <Class View>
	//   18   40:invokeinterface #69  <Method void ChildHelper$Callback.onLeftHiddenState(View)>
			mHiddenViews.remove(i);
	//   19   45:aload_0         
	//   20   46:getfield        #34  <Field List mHiddenViews>
	//   21   49:iload_1         
	//   22   50:invokeinterface #166 <Method Object List.remove(int)>
	//   23   55:pop             
		}

	//   24   56:iload_1         
	//   25   57:iconst_1        
	//   26   58:isub            
	//   27   59:istore_1        
	//*  28   60:goto            19
		mCallback.removeAllViews();
	//   29   63:aload_0         
	//   30   64:getfield        #24  <Field ChildHelper$Callback mCallback>
	//   31   67:invokeinterface #169 <Method void ChildHelper$Callback.removeAllViews()>
	//   32   72:return          
	}

	void removeView(View view)
	{
		int i = mCallback.indexOfChild(view);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #132 <Method int ChildHelper$Callback.indexOfChild(View)>
	//    4   10:istore_2        
		if(i < 0)
	//*   5   11:iload_2         
	//*   6   12:ifge            16
			return;
	//    7   15:return          
		if(mBucket.remove(i))
	//*   8   16:aload_0         
	//*   9   17:getfield        #29  <Field ChildHelper$Bucket mBucket>
	//*  10   20:iload_2         
	//*  11   21:invokevirtual   #94  <Method boolean ChildHelper$Bucket.remove(int)>
	//*  12   24:ifeq            33
			unhideViewInternal(view);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:invokespecial   #172 <Method boolean unhideViewInternal(View)>
	//   16   32:pop             
		mCallback.removeViewAt(i);
	//   17   33:aload_0         
	//   18   34:getfield        #24  <Field ChildHelper$Callback mCallback>
	//   19   37:iload_2         
	//   20   38:invokeinterface #175 <Method void ChildHelper$Callback.removeViewAt(int)>
	//   21   43:return          
	}

	void removeViewAt(int i)
	{
		i = getOffset(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #73  <Method int getOffset(int)>
	//    3    5:istore_1        
		View view = mCallback.getChildAt(i);
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    6   10:iload_1         
	//    7   11:invokeinterface #125 <Method View ChildHelper$Callback.getChildAt(int)>
	//    8   16:astore_2        
		if(view == null)
	//*   9   17:aload_2         
	//*  10   18:ifnonnull       22
			return;
	//   11   21:return          
		if(mBucket.remove(i))
	//*  12   22:aload_0         
	//*  13   23:getfield        #29  <Field ChildHelper$Bucket mBucket>
	//*  14   26:iload_1         
	//*  15   27:invokevirtual   #94  <Method boolean ChildHelper$Bucket.remove(int)>
	//*  16   30:ifeq            39
			unhideViewInternal(view);
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:invokespecial   #172 <Method boolean unhideViewInternal(View)>
	//   20   38:pop             
		mCallback.removeViewAt(i);
	//   21   39:aload_0         
	//   22   40:getfield        #24  <Field ChildHelper$Callback mCallback>
	//   23   43:iload_1         
	//   24   44:invokeinterface #175 <Method void ChildHelper$Callback.removeViewAt(int)>
	//   25   49:return          
	}

	boolean removeViewIfHidden(View view)
	{
		int i = mCallback.indexOfChild(view);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #132 <Method int ChildHelper$Callback.indexOfChild(View)>
	//    4   10:istore_2        
		if(i == -1)
	//*   5   11:iload_2         
	//*   6   12:iconst_m1       
	//*   7   13:icmpne          24
		{
			unhideViewInternal(view);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #172 <Method boolean unhideViewInternal(View)>
	//   11   21:pop             
			return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
		}
		if(mBucket.get(i))
	//*  14   24:aload_0         
	//*  15   25:getfield        #29  <Field ChildHelper$Bucket mBucket>
	//*  16   28:iload_2         
	//*  17   29:invokevirtual   #50  <Method boolean ChildHelper$Bucket.get(int)>
	//*  18   32:ifeq            62
		{
			mBucket.remove(i);
	//   19   35:aload_0         
	//   20   36:getfield        #29  <Field ChildHelper$Bucket mBucket>
	//   21   39:iload_2         
	//   22   40:invokevirtual   #94  <Method boolean ChildHelper$Bucket.remove(int)>
	//   23   43:pop             
			unhideViewInternal(view);
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:invokespecial   #172 <Method boolean unhideViewInternal(View)>
	//   27   49:pop             
			mCallback.removeViewAt(i);
	//   28   50:aload_0         
	//   29   51:getfield        #24  <Field ChildHelper$Callback mCallback>
	//   30   54:iload_2         
	//   31   55:invokeinterface #175 <Method void ChildHelper$Callback.removeViewAt(int)>
			return true;
	//   32   60:iconst_1        
	//   33   61:ireturn         
		} else
		{
			return false;
	//   34   62:iconst_0        
	//   35   63:ireturn         
		}
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #137 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #138 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(mBucket.toString());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field ChildHelper$Bucket mBucket>
	//    7   13:invokevirtual   #177 <Method String ChildHelper$Bucket.toString()>
	//    8   16:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(", hidden list:");
	//   10   20:aload_1         
	//   11   21:ldc1            #179 <String ", hidden list:">
	//   12   23:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(mHiddenViews.size());
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:getfield        #34  <Field List mHiddenViews>
	//   17   32:invokeinterface #101 <Method int List.size()>
	//   18   37:invokevirtual   #182 <Method StringBuilder StringBuilder.append(int)>
	//   19   40:pop             
		return stringbuilder.toString();
	//   20   41:aload_1         
	//   21   42:invokevirtual   #153 <Method String StringBuilder.toString()>
	//   22   45:areturn         
	}

	void unhide(View view)
	{
		int i = mCallback.indexOfChild(view);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #132 <Method int ChildHelper$Callback.indexOfChild(View)>
	//    4   10:istore_2        
		if(i >= 0)
	//*   5   11:iload_2         
	//*   6   12:iflt            74
		{
			if(mBucket.get(i))
	//*   7   15:aload_0         
	//*   8   16:getfield        #29  <Field ChildHelper$Bucket mBucket>
	//*   9   19:iload_2         
	//*  10   20:invokevirtual   #50  <Method boolean ChildHelper$Bucket.get(int)>
	//*  11   23:ifeq            41
			{
				mBucket.clear(i);
	//   12   26:aload_0         
	//   13   27:getfield        #29  <Field ChildHelper$Bucket mBucket>
	//   14   30:iload_2         
	//   15   31:invokevirtual   #186 <Method void ChildHelper$Bucket.clear(int)>
				unhideViewInternal(view);
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokespecial   #172 <Method boolean unhideViewInternal(View)>
	//   19   39:pop             
				return;
	//   20   40:return          
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   21   41:new             #137 <Class StringBuilder>
	//   22   44:dup             
	//   23   45:invokespecial   #138 <Method void StringBuilder()>
	//   24   48:astore_3        
				stringbuilder.append("trying to unhide a view that was not hidden");
	//   25   49:aload_3         
	//   26   50:ldc1            #188 <String "trying to unhide a view that was not hidden">
	//   27   52:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   28   55:pop             
				stringbuilder.append(((Object) (view)));
	//   29   56:aload_3         
	//   30   57:aload_1         
	//   31   58:invokevirtual   #147 <Method StringBuilder StringBuilder.append(Object)>
	//   32   61:pop             
				throw new RuntimeException(stringbuilder.toString());
	//   33   62:new             #190 <Class RuntimeException>
	//   34   65:dup             
	//   35   66:aload_3         
	//   36   67:invokevirtual   #153 <Method String StringBuilder.toString()>
	//   37   70:invokespecial   #191 <Method void RuntimeException(String)>
	//   38   73:athrow          
			}
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   39   74:new             #137 <Class StringBuilder>
	//   40   77:dup             
	//   41   78:invokespecial   #138 <Method void StringBuilder()>
	//   42   81:astore_3        
			stringbuilder1.append("view is not a child, cannot hide ");
	//   43   82:aload_3         
	//   44   83:ldc1            #140 <String "view is not a child, cannot hide ">
	//   45   85:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   46   88:pop             
			stringbuilder1.append(((Object) (view)));
	//   47   89:aload_3         
	//   48   90:aload_1         
	//   49   91:invokevirtual   #147 <Method StringBuilder StringBuilder.append(Object)>
	//   50   94:pop             
			throw new IllegalArgumentException(stringbuilder1.toString());
	//   51   95:new             #149 <Class IllegalArgumentException>
	//   52   98:dup             
	//   53   99:aload_3         
	//   54  100:invokevirtual   #153 <Method String StringBuilder.toString()>
	//   55  103:invokespecial   #156 <Method void IllegalArgumentException(String)>
	//   56  106:athrow          
		}
	}

	private static final boolean DEBUG = false;
	private static final String TAG = "ChildrenHelper";
	final Bucket mBucket = new Bucket();
	final Callback mCallback;
	final List mHiddenViews = new ArrayList();

	private class Bucket
	{

		private void ensureNext()
		{
			if(mNext == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #24  <Field ChildHelper$Bucket mNext>
		//*   2    4:ifnonnull       18
				mNext = new Bucket();
		//    3    7:aload_0         
		//    4    8:new             #2   <Class ChildHelper$Bucket>
		//    5   11:dup             
		//    6   12:invokespecial   #25  <Method void ChildHelper$Bucket()>
		//    7   15:putfield        #24  <Field ChildHelper$Bucket mNext>
		//    8   18:return          
		}

		void clear(int i)
		{
			if(i >= 64)
		//*   0    0:iload_1         
		//*   1    1:bipush          64
		//*   2    3:icmplt          24
			{
				Bucket bucket = mNext;
		//    3    6:aload_0         
		//    4    7:getfield        #24  <Field ChildHelper$Bucket mNext>
		//    5   10:astore_2        
				if(bucket != null)
		//*   6   11:aload_2         
		//*   7   12:ifnull          40
				{
					bucket.clear(i - 64);
		//    8   15:aload_2         
		//    9   16:iload_1         
		//   10   17:bipush          64
		//   11   19:isub            
		//   12   20:invokevirtual   #29  <Method void clear(int)>
					return;
		//   13   23:return          
				}
			} else
			{
				mData = mData & ~(1L << i);
		//   14   24:aload_0         
		//   15   25:aload_0         
		//   16   26:getfield        #20  <Field long mData>
		//   17   29:lconst_1        
		//   18   30:iload_1         
		//   19   31:lshl            
		//   20   32:ldc2w           #30  <Long -1L>
		//   21   35:lxor            
		//   22   36:land            
		//   23   37:putfield        #20  <Field long mData>
			}
		//   24   40:return          
		}

		int countOnesBefore(int i)
		{
			Bucket bucket = mNext;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field ChildHelper$Bucket mNext>
		//    2    4:astore_2        
			if(bucket == null)
		//*   3    5:aload_2         
		//*   4    6:ifnonnull       37
				if(i >= 64)
		//*   5    9:iload_1         
		//*   6   10:bipush          64
		//*   7   12:icmplt          23
					return Long.bitCount(mData);
		//    8   15:aload_0         
		//    9   16:getfield        #20  <Field long mData>
		//   10   19:invokestatic    #39  <Method int Long.bitCount(long)>
		//   11   22:ireturn         
				else
					return Long.bitCount(mData & (1L << i) - 1L);
		//   12   23:aload_0         
		//   13   24:getfield        #20  <Field long mData>
		//   14   27:lconst_1        
		//   15   28:iload_1         
		//   16   29:lshl            
		//   17   30:lconst_1        
		//   18   31:lsub            
		//   19   32:land            
		//   20   33:invokestatic    #39  <Method int Long.bitCount(long)>
		//   21   36:ireturn         
			if(i < 64)
		//*  22   37:iload_1         
		//*  23   38:bipush          64
		//*  24   40:icmpge          57
				return Long.bitCount(mData & (1L << i) - 1L);
		//   25   43:aload_0         
		//   26   44:getfield        #20  <Field long mData>
		//   27   47:lconst_1        
		//   28   48:iload_1         
		//   29   49:lshl            
		//   30   50:lconst_1        
		//   31   51:lsub            
		//   32   52:land            
		//   33   53:invokestatic    #39  <Method int Long.bitCount(long)>
		//   34   56:ireturn         
			else
				return bucket.countOnesBefore(i - 64) + Long.bitCount(mData);
		//   35   57:aload_2         
		//   36   58:iload_1         
		//   37   59:bipush          64
		//   38   61:isub            
		//   39   62:invokevirtual   #41  <Method int countOnesBefore(int)>
		//   40   65:aload_0         
		//   41   66:getfield        #20  <Field long mData>
		//   42   69:invokestatic    #39  <Method int Long.bitCount(long)>
		//   43   72:iadd            
		//   44   73:ireturn         
		}

		boolean get(int i)
		{
			if(i >= 64)
		//*   0    0:iload_1         
		//*   1    1:bipush          64
		//*   2    3:icmplt          22
			{
				ensureNext();
		//    3    6:aload_0         
		//    4    7:invokespecial   #45  <Method void ensureNext()>
				return mNext.get(i - 64);
		//    5   10:aload_0         
		//    6   11:getfield        #24  <Field ChildHelper$Bucket mNext>
		//    7   14:iload_1         
		//    8   15:bipush          64
		//    9   17:isub            
		//   10   18:invokevirtual   #47  <Method boolean get(int)>
		//   11   21:ireturn         
			}
			return (mData & 1L << i) != 0L;
		//   12   22:aload_0         
		//   13   23:getfield        #20  <Field long mData>
		//   14   26:lconst_1        
		//   15   27:iload_1         
		//   16   28:lshl            
		//   17   29:land            
		//   18   30:lconst_0        
		//   19   31:lcmp            
		//   20   32:ifeq            37
		//   21   35:iconst_1        
		//   22   36:ireturn         
		//   23   37:iconst_0        
		//   24   38:ireturn         
		}

		void insert(int i, boolean flag)
		{
			if(i >= 64)
		//*   0    0:iload_1         
		//*   1    1:bipush          64
		//*   2    3:icmplt          23
			{
				ensureNext();
		//    3    6:aload_0         
		//    4    7:invokespecial   #45  <Method void ensureNext()>
				mNext.insert(i - 64, flag);
		//    5   10:aload_0         
		//    6   11:getfield        #24  <Field ChildHelper$Bucket mNext>
		//    7   14:iload_1         
		//    8   15:bipush          64
		//    9   17:isub            
		//   10   18:iload_2         
		//   11   19:invokevirtual   #51  <Method void insert(int, boolean)>
				return;
		//   12   22:return          
			}
			boolean flag1;
			if((mData & 0x0L) != 0L)
		//*  13   23:aload_0         
		//*  14   24:getfield        #20  <Field long mData>
		//*  15   27:ldc2w           #10  <Long 0x0L>
		//*  16   30:land            
		//*  17   31:lconst_0        
		//*  18   32:lcmp            
		//*  19   33:ifeq            41
				flag1 = true;
		//   20   36:iconst_1        
		//   21   37:istore_3        
			else
		//*  22   38:goto            43
				flag1 = false;
		//   23   41:iconst_0        
		//   24   42:istore_3        
			long l = (1L << i) - 1L;
		//   25   43:lconst_1        
		//   26   44:iload_1         
		//   27   45:lshl            
		//   28   46:lconst_1        
		//   29   47:lsub            
		//   30   48:lstore          4
			long l1 = mData;
		//   31   50:aload_0         
		//   32   51:getfield        #20  <Field long mData>
		//   33   54:lstore          6
			mData = (l1 & ~l) << 1 | l1 & l;
		//   34   56:aload_0         
		//   35   57:lload           6
		//   36   59:lload           4
		//   37   61:ldc2w           #30  <Long -1L>
		//   38   64:lxor            
		//   39   65:land            
		//   40   66:iconst_1        
		//   41   67:lshl            
		//   42   68:lload           6
		//   43   70:lload           4
		//   44   72:land            
		//   45   73:lor             
		//   46   74:putfield        #20  <Field long mData>
			if(flag)
		//*  47   77:iload_2         
		//*  48   78:ifeq            89
				set(i);
		//   49   81:aload_0         
		//   50   82:iload_1         
		//   51   83:invokevirtual   #54  <Method void set(int)>
			else
		//*  52   86:goto            94
				clear(i);
		//   53   89:aload_0         
		//   54   90:iload_1         
		//   55   91:invokevirtual   #29  <Method void clear(int)>
			if(flag1 || mNext != null)
		//*  56   94:iload_3         
		//*  57   95:ifne            105
		//*  58   98:aload_0         
		//*  59   99:getfield        #24  <Field ChildHelper$Bucket mNext>
		//*  60  102:ifnull          118
			{
				ensureNext();
		//   61  105:aload_0         
		//   62  106:invokespecial   #45  <Method void ensureNext()>
				mNext.insert(0, flag1);
		//   63  109:aload_0         
		//   64  110:getfield        #24  <Field ChildHelper$Bucket mNext>
		//   65  113:iconst_0        
		//   66  114:iload_3         
		//   67  115:invokevirtual   #51  <Method void insert(int, boolean)>
			}
		//   68  118:return          
		}

		boolean remove(int i)
		{
			if(i >= 64)
		//*   0    0:iload_1         
		//*   1    1:bipush          64
		//*   2    3:icmplt          22
			{
				ensureNext();
		//    3    6:aload_0         
		//    4    7:invokespecial   #45  <Method void ensureNext()>
				return mNext.remove(i - 64);
		//    5   10:aload_0         
		//    6   11:getfield        #24  <Field ChildHelper$Bucket mNext>
		//    7   14:iload_1         
		//    8   15:bipush          64
		//    9   17:isub            
		//   10   18:invokevirtual   #57  <Method boolean remove(int)>
		//   11   21:ireturn         
			}
			long l = 1L << i;
		//   12   22:lconst_1        
		//   13   23:iload_1         
		//   14   24:lshl            
		//   15   25:lstore_2        
			boolean flag;
			if((mData & l) != 0L)
		//*  16   26:aload_0         
		//*  17   27:getfield        #20  <Field long mData>
		//*  18   30:lload_2         
		//*  19   31:land            
		//*  20   32:lconst_0        
		//*  21   33:lcmp            
		//*  22   34:ifeq            43
				flag = true;
		//   23   37:iconst_1        
		//   24   38:istore          6
			else
		//*  25   40:goto            46
				flag = false;
		//   26   43:iconst_0        
		//   27   44:istore          6
			mData = mData & ~l;
		//   28   46:aload_0         
		//   29   47:aload_0         
		//   30   48:getfield        #20  <Field long mData>
		//   31   51:lload_2         
		//   32   52:ldc2w           #30  <Long -1L>
		//   33   55:lxor            
		//   34   56:land            
		//   35   57:putfield        #20  <Field long mData>
			l--;
		//   36   60:lload_2         
		//   37   61:lconst_1        
		//   38   62:lsub            
		//   39   63:lstore_2        
			long l1 = mData;
		//   40   64:aload_0         
		//   41   65:getfield        #20  <Field long mData>
		//   42   68:lstore          4
			mData = Long.rotateRight(l1 & ~l, 1) | l1 & l;
		//   43   70:aload_0         
		//   44   71:lload           4
		//   45   73:lload_2         
		//   46   74:ldc2w           #30  <Long -1L>
		//   47   77:lxor            
		//   48   78:land            
		//   49   79:iconst_1        
		//   50   80:invokestatic    #61  <Method long Long.rotateRight(long, int)>
		//   51   83:lload           4
		//   52   85:lload_2         
		//   53   86:land            
		//   54   87:lor             
		//   55   88:putfield        #20  <Field long mData>
			Bucket bucket = mNext;
		//   56   91:aload_0         
		//   57   92:getfield        #24  <Field ChildHelper$Bucket mNext>
		//   58   95:astore          7
			if(bucket != null)
		//*  59   97:aload           7
		//*  60   99:ifnull          126
			{
				if(bucket.get(0))
		//*  61  102:aload           7
		//*  62  104:iconst_0        
		//*  63  105:invokevirtual   #47  <Method boolean get(int)>
		//*  64  108:ifeq            117
					set(63);
		//   65  111:aload_0         
		//   66  112:bipush          63
		//   67  114:invokevirtual   #54  <Method void set(int)>
				mNext.remove(0);
		//   68  117:aload_0         
		//   69  118:getfield        #24  <Field ChildHelper$Bucket mNext>
		//   70  121:iconst_0        
		//   71  122:invokevirtual   #57  <Method boolean remove(int)>
		//   72  125:pop             
			}
			return flag;
		//   73  126:iload           6
		//   74  128:ireturn         
		}

		void reset()
		{
			mData = 0L;
		//    0    0:aload_0         
		//    1    1:lconst_0        
		//    2    2:putfield        #20  <Field long mData>
			Bucket bucket = mNext;
		//    3    5:aload_0         
		//    4    6:getfield        #24  <Field ChildHelper$Bucket mNext>
		//    5    9:astore_1        
			if(bucket != null)
		//*   6   10:aload_1         
		//*   7   11:ifnull          18
				bucket.reset();
		//    8   14:aload_1         
		//    9   15:invokevirtual   #64  <Method void reset()>
		//   10   18:return          
		}

		void set(int i)
		{
			if(i >= 64)
		//*   0    0:iload_1         
		//*   1    1:bipush          64
		//*   2    3:icmplt          22
			{
				ensureNext();
		//    3    6:aload_0         
		//    4    7:invokespecial   #45  <Method void ensureNext()>
				mNext.set(i - 64);
		//    5   10:aload_0         
		//    6   11:getfield        #24  <Field ChildHelper$Bucket mNext>
		//    7   14:iload_1         
		//    8   15:bipush          64
		//    9   17:isub            
		//   10   18:invokevirtual   #54  <Method void set(int)>
				return;
		//   11   21:return          
			} else
			{
				mData = mData | 1L << i;
		//   12   22:aload_0         
		//   13   23:aload_0         
		//   14   24:getfield        #20  <Field long mData>
		//   15   27:lconst_1        
		//   16   28:iload_1         
		//   17   29:lshl            
		//   18   30:lor             
		//   19   31:putfield        #20  <Field long mData>
				return;
		//   20   34:return          
			}
		}

		public String toString()
		{
			if(mNext == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #24  <Field ChildHelper$Bucket mNext>
		//*   2    4:ifnonnull       15
			{
				return Long.toBinaryString(mData);
		//    3    7:aload_0         
		//    4    8:getfield        #20  <Field long mData>
		//    5   11:invokestatic    #70  <Method String Long.toBinaryString(long)>
		//    6   14:areturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    7   15:new             #72  <Class StringBuilder>
		//    8   18:dup             
		//    9   19:invokespecial   #73  <Method void StringBuilder()>
		//   10   22:astore_1        
				stringbuilder.append(mNext.toString());
		//   11   23:aload_1         
		//   12   24:aload_0         
		//   13   25:getfield        #24  <Field ChildHelper$Bucket mNext>
		//   14   28:invokevirtual   #75  <Method String toString()>
		//   15   31:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
		//   16   34:pop             
				stringbuilder.append("xx");
		//   17   35:aload_1         
		//   18   36:ldc1            #81  <String "xx">
		//   19   38:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
		//   20   41:pop             
				stringbuilder.append(Long.toBinaryString(mData));
		//   21   42:aload_1         
		//   22   43:aload_0         
		//   23   44:getfield        #20  <Field long mData>
		//   24   47:invokestatic    #70  <Method String Long.toBinaryString(long)>
		//   25   50:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
		//   26   53:pop             
				return stringbuilder.toString();
		//   27   54:aload_1         
		//   28   55:invokevirtual   #82  <Method String StringBuilder.toString()>
		//   29   58:areturn         
			}
		}

		static final int BITS_PER_WORD = 64;
		static final long LAST_BIT = 0x0L;
		long mData;
		Bucket mNext;

		Bucket()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			mData = 0L;
		//    2    4:aload_0         
		//    3    5:lconst_0        
		//    4    6:putfield        #20  <Field long mData>
		//    5    9:return          
		}
	}


	private class Callback
	{

		public abstract void addView(View view, int i);

		public abstract void attachViewToParent(View view, int i, android.view.ViewGroup.LayoutParams layoutparams);

		public abstract void detachViewFromParent(int i);

		public abstract View getChildAt(int i);

		public abstract int getChildCount();

		public abstract RecyclerView.ViewHolder getChildViewHolder(View view);

		public abstract int indexOfChild(View view);

		public abstract void onEnteredHiddenState(View view);

		public abstract void onLeftHiddenState(View view);

		public abstract void removeAllViews();

		public abstract void removeViewAt(int i);
	}

}
