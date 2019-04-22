// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import android.widget.AbsListView;
import com.bumptech.glide.request.target.BaseTarget;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.transition.Transition;
import java.util.List;
import java.util.Queue;

// Referenced classes of package com.bumptech.glide:
//			RequestManager, RequestBuilder

public class ListPreloader
	implements android.widget.AbsListView.OnScrollListener
{
	public static interface PreloadModelProvider
	{

		public abstract List getPreloadItems(int i);

		public abstract RequestBuilder getPreloadRequestBuilder(Object obj);
	}

	public static interface PreloadSizeProvider
	{

		public abstract int[] getPreloadSize(Object obj, int i, int j);
	}

	private static final class PreloadTarget extends BaseTarget
	{

		public void getSize(SizeReadyCallback sizereadycallback)
		{
			sizereadycallback.onSizeReady(photoWidth, photoHeight);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #21  <Field int photoWidth>
		//    3    5:aload_0         
		//    4    6:getfield        #23  <Field int photoHeight>
		//    5    9:invokeinterface #29  <Method void SizeReadyCallback.onSizeReady(int, int)>
		//    6   14:return          
		}

		public void onResourceReady(Object obj, Transition transition)
		{
		//    0    0:return          
		}

		public void removeCallback(SizeReadyCallback sizereadycallback)
		{
		//    0    0:return          
		}

		int photoHeight;
		int photoWidth;

		PreloadTarget()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void BaseTarget()>
		//    2    4:return          
		}
	}

	private static final class PreloadTargetQueue
	{

		public PreloadTarget next(int i, int j)
		{
			PreloadTarget preloadtarget = (PreloadTarget)queue.poll();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field Queue queue>
		//    2    4:invokeinterface #20  <Method Object Queue.poll()>
		//    3    9:checkcast       #22  <Class ListPreloader$PreloadTarget>
		//    4   12:astore_3        
			queue.offer(((Object) (preloadtarget)));
		//    5   13:aload_0         
		//    6   14:getfield        #14  <Field Queue queue>
		//    7   17:aload_3         
		//    8   18:invokeinterface #26  <Method boolean Queue.offer(Object)>
		//    9   23:pop             
			preloadtarget.photoWidth = i;
		//   10   24:aload_3         
		//   11   25:iload_1         
		//   12   26:putfield        #30  <Field int ListPreloader$PreloadTarget.photoWidth>
			preloadtarget.photoHeight = j;
		//   13   29:aload_3         
		//   14   30:iload_2         
		//   15   31:putfield        #33  <Field int ListPreloader$PreloadTarget.photoHeight>
			return preloadtarget;
		//   16   34:aload_3         
		//   17   35:areturn         
		}

		private final Queue queue;
	}


	private void cancelAll()
	{
		for(int i = 0; i < maxPreload; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #41  <Field int maxPreload>
	//*   5    7:icmpge          33
			requestManager.clear(((com.bumptech.glide.request.target.Target) (preloadTargetQueue.next(0, 0))));
	//    6   10:aload_0         
	//    7   11:getfield        #43  <Field RequestManager requestManager>
	//    8   14:aload_0         
	//    9   15:getfield        #45  <Field ListPreloader$PreloadTargetQueue preloadTargetQueue>
	//   10   18:iconst_0        
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #49  <Method ListPreloader$PreloadTarget ListPreloader$PreloadTargetQueue.next(int, int)>
	//   13   23:invokevirtual   #55  <Method void RequestManager.clear(com.bumptech.glide.request.target.Target)>

	//   14   26:iload_1         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:istore_1        
	//*  18   30:goto            2
	//   19   33:return          
	}

	private void preload(int i, int j)
	{
		int k;
		int l;
		if(i < j)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpge          20
		{
			k = Math.max(lastEnd, i);
	//    3    5:aload_0         
	//    4    6:getfield        #60  <Field int lastEnd>
	//    5    9:iload_1         
	//    6   10:invokestatic    #66  <Method int Math.max(int, int)>
	//    7   13:istore_3        
			l = j;
	//    8   14:iload_2         
	//    9   15:istore          4
		} else
	//*  10   17:goto            32
		{
			l = Math.min(lastStart, i);
	//   11   20:aload_0         
	//   12   21:getfield        #68  <Field int lastStart>
	//   13   24:iload_1         
	//   14   25:invokestatic    #71  <Method int Math.min(int, int)>
	//   15   28:istore          4
			k = j;
	//   16   30:iload_2         
	//   17   31:istore_3        
		}
		l = Math.min(totalItemCount, l);
	//   18   32:aload_0         
	//   19   33:getfield        #73  <Field int totalItemCount>
	//   20   36:iload           4
	//   21   38:invokestatic    #71  <Method int Math.min(int, int)>
	//   22   41:istore          4
		k = Math.min(totalItemCount, Math.max(0, k));
	//   23   43:aload_0         
	//   24   44:getfield        #73  <Field int totalItemCount>
	//   25   47:iconst_0        
	//   26   48:iload_3         
	//   27   49:invokestatic    #66  <Method int Math.max(int, int)>
	//   28   52:invokestatic    #71  <Method int Math.min(int, int)>
	//   29   55:istore_3        
		if(i < j)
	//*  30   56:iload_1         
	//*  31   57:iload_2         
	//*  32   58:icmpge          92
			for(i = k; i < l; i++)
	//*  33   61:iload_3         
	//*  34   62:istore_1        
	//*  35   63:iload_1         
	//*  36   64:iload           4
	//*  37   66:icmpge          125
				preloadAdapterPosition(preloadModelProvider.getPreloadItems(i), i, true);
	//   38   69:aload_0         
	//   39   70:aload_0         
	//   40   71:getfield        #75  <Field ListPreloader$PreloadModelProvider preloadModelProvider>
	//   41   74:iload_1         
	//   42   75:invokeinterface #79  <Method List ListPreloader$PreloadModelProvider.getPreloadItems(int)>
	//   43   80:iload_1         
	//   44   81:iconst_1        
	//   45   82:invokespecial   #83  <Method void preloadAdapterPosition(List, int, boolean)>

	//   46   85:iload_1         
	//   47   86:iconst_1        
	//   48   87:iadd            
	//   49   88:istore_1        
		else
	//*  50   89:goto            63
			for(i = l - 1; i >= k; i--)
	//*  51   92:iload           4
	//*  52   94:iconst_1        
	//*  53   95:isub            
	//*  54   96:istore_1        
	//*  55   97:iload_1         
	//*  56   98:iload_3         
	//*  57   99:icmplt          125
				preloadAdapterPosition(preloadModelProvider.getPreloadItems(i), i, false);
	//   58  102:aload_0         
	//   59  103:aload_0         
	//   60  104:getfield        #75  <Field ListPreloader$PreloadModelProvider preloadModelProvider>
	//   61  107:iload_1         
	//   62  108:invokeinterface #79  <Method List ListPreloader$PreloadModelProvider.getPreloadItems(int)>
	//   63  113:iload_1         
	//   64  114:iconst_0        
	//   65  115:invokespecial   #83  <Method void preloadAdapterPosition(List, int, boolean)>

	//   66  118:iload_1         
	//   67  119:iconst_1        
	//   68  120:isub            
	//   69  121:istore_1        
	//*  70  122:goto            97
		lastStart = k;
	//   71  125:aload_0         
	//   72  126:iload_3         
	//   73  127:putfield        #68  <Field int lastStart>
		lastEnd = l;
	//   74  130:aload_0         
	//   75  131:iload           4
	//   76  133:putfield        #60  <Field int lastEnd>
	//   77  136:return          
	}

	private void preload(int i, boolean flag)
	{
		if(isIncreasing != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field boolean isIncreasing>
	//*   2    4:iload_2         
	//*   3    5:icmpeq          17
		{
			isIncreasing = flag;
	//    4    8:aload_0         
	//    5    9:iload_2         
	//    6   10:putfield        #86  <Field boolean isIncreasing>
			cancelAll();
	//    7   13:aload_0         
	//    8   14:invokespecial   #88  <Method void cancelAll()>
		}
		int j;
		if(flag)
	//*   9   17:iload_2         
	//*  10   18:ifeq            29
			j = maxPreload;
	//   11   21:aload_0         
	//   12   22:getfield        #41  <Field int maxPreload>
	//   13   25:istore_3        
		else
	//*  14   26:goto            35
			j = -maxPreload;
	//   15   29:aload_0         
	//   16   30:getfield        #41  <Field int maxPreload>
	//   17   33:ineg            
	//   18   34:istore_3        
		preload(i, j + i);
	//   19   35:aload_0         
	//   20   36:iload_1         
	//   21   37:iload_3         
	//   22   38:iload_1         
	//   23   39:iadd            
	//   24   40:invokespecial   #90  <Method void preload(int, int)>
	//   25   43:return          
	}

	private void preloadAdapterPosition(List list, int i, boolean flag)
	{
		int l = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #96  <Method int List.size()>
	//    2    6:istore          5
		if(flag)
	//*   3    8:iload_3         
	//*   4    9:ifeq            46
		{
			for(int j = 0; j < l; j++)
	//*   5   12:iconst_0        
	//*   6   13:istore          4
	//*   7   15:iload           4
	//*   8   17:iload           5
	//*   9   19:icmpge          81
				preloadItem(list.get(j), i, j);
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:iload           4
	//   13   26:invokeinterface #100 <Method Object List.get(int)>
	//   14   31:iload_2         
	//   15   32:iload           4
	//   16   34:invokespecial   #104 <Method void preloadItem(Object, int, int)>

	//   17   37:iload           4
	//   18   39:iconst_1        
	//   19   40:iadd            
	//   20   41:istore          4
		} else
	//*  21   43:goto            15
		{
			for(int k = l - 1; k >= 0; k--)
	//*  22   46:iload           5
	//*  23   48:iconst_1        
	//*  24   49:isub            
	//*  25   50:istore          4
	//*  26   52:iload           4
	//*  27   54:iflt            81
				preloadItem(list.get(k), i, k);
	//   28   57:aload_0         
	//   29   58:aload_1         
	//   30   59:iload           4
	//   31   61:invokeinterface #100 <Method Object List.get(int)>
	//   32   66:iload_2         
	//   33   67:iload           4
	//   34   69:invokespecial   #104 <Method void preloadItem(Object, int, int)>

	//   35   72:iload           4
	//   36   74:iconst_1        
	//   37   75:isub            
	//   38   76:istore          4
		}
	//*  39   78:goto            52
	//   40   81:return          
	}

	private void preloadItem(Object obj, int i, int j)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		int ai[] = preloadDimensionProvider.getPreloadSize(obj, i, j);
	//    3    5:aload_0         
	//    4    6:getfield        #109 <Field ListPreloader$PreloadSizeProvider preloadDimensionProvider>
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:iload_3         
	//    8   12:invokeinterface #113 <Method int[] ListPreloader$PreloadSizeProvider.getPreloadSize(Object, int, int)>
	//    9   17:astore          4
		if(ai == null)
	//*  10   19:aload           4
	//*  11   21:ifnonnull       25
			return;
	//   12   24:return          
		obj = ((Object) (preloadModelProvider.getPreloadRequestBuilder(obj)));
	//   13   25:aload_0         
	//   14   26:getfield        #75  <Field ListPreloader$PreloadModelProvider preloadModelProvider>
	//   15   29:aload_1         
	//   16   30:invokeinterface #117 <Method RequestBuilder ListPreloader$PreloadModelProvider.getPreloadRequestBuilder(Object)>
	//   17   35:astore_1        
		if(obj == null)
	//*  18   36:aload_1         
	//*  19   37:ifnonnull       41
		{
			return;
	//   20   40:return          
		} else
		{
			((RequestBuilder) (obj)).into(((com.bumptech.glide.request.target.Target) (preloadTargetQueue.next(ai[0], ai[1]))));
	//   21   41:aload_1         
	//   22   42:aload_0         
	//   23   43:getfield        #45  <Field ListPreloader$PreloadTargetQueue preloadTargetQueue>
	//   24   46:aload           4
	//   25   48:iconst_0        
	//   26   49:iaload          
	//   27   50:aload           4
	//   28   52:iconst_1        
	//   29   53:iaload          
	//   30   54:invokevirtual   #49  <Method ListPreloader$PreloadTarget ListPreloader$PreloadTargetQueue.next(int, int)>
	//   31   57:invokevirtual   #123 <Method com.bumptech.glide.request.target.Target RequestBuilder.into(com.bumptech.glide.request.target.Target)>
	//   32   60:pop             
			return;
	//   33   61:return          
		}
	}

	public void onScroll(AbsListView abslistview, int i, int j, int k)
	{
		totalItemCount = k;
	//    0    0:aload_0         
	//    1    1:iload           4
	//    2    3:putfield        #73  <Field int totalItemCount>
		k = lastFirstVisible;
	//    3    6:aload_0         
	//    4    7:getfield        #129 <Field int lastFirstVisible>
	//    5   10:istore          4
		if(i > k)
	//*   6   12:iload_2         
	//*   7   13:iload           4
	//*   8   15:icmple          29
			preload(j + i, true);
	//    9   18:aload_0         
	//   10   19:iload_3         
	//   11   20:iload_2         
	//   12   21:iadd            
	//   13   22:iconst_1        
	//   14   23:invokespecial   #131 <Method void preload(int, boolean)>
		else
	//*  15   26:goto            41
		if(i < k)
	//*  16   29:iload_2         
	//*  17   30:iload           4
	//*  18   32:icmpge          41
			preload(i, false);
	//   19   35:aload_0         
	//   20   36:iload_2         
	//   21   37:iconst_0        
	//   22   38:invokespecial   #131 <Method void preload(int, boolean)>
		lastFirstVisible = i;
	//   23   41:aload_0         
	//   24   42:iload_2         
	//   25   43:putfield        #129 <Field int lastFirstVisible>
	//   26   46:return          
	}

	public void onScrollStateChanged(AbsListView abslistview, int i)
	{
	//    0    0:return          
	}

	private boolean isIncreasing;
	private int lastEnd;
	private int lastFirstVisible;
	private int lastStart;
	private final int maxPreload;
	private final PreloadSizeProvider preloadDimensionProvider;
	private final PreloadModelProvider preloadModelProvider;
	private final PreloadTargetQueue preloadTargetQueue;
	private final RequestManager requestManager;
	private int totalItemCount;
}
