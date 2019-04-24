// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import android.widget.AbsListView;
import com.bumptech.glide.request.target.BaseTarget;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
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

	static class PreloadTarget extends BaseTarget
	{

		public void getSize(SizeReadyCallback sizereadycallback)
		{
			sizereadycallback.onSizeReady(photoWidth, photoHeight);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #20  <Field int photoWidth>
		//    3    5:aload_0         
		//    4    6:getfield        #22  <Field int photoHeight>
		//    5    9:invokeinterface #28  <Method void SizeReadyCallback.onSizeReady(int, int)>
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

	static final class PreloadTargetQueue
	{

		public PreloadTarget next(int i, int j)
		{
			PreloadTarget preloadtarget = (PreloadTarget)queue.poll();
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field Queue queue>
		//    2    4:invokeinterface #39  <Method Object Queue.poll()>
		//    3    9:checkcast       #25  <Class ListPreloader$PreloadTarget>
		//    4   12:astore_3        
			queue.offer(((Object) (preloadtarget)));
		//    5   13:aload_0         
		//    6   14:getfield        #23  <Field Queue queue>
		//    7   17:aload_3         
		//    8   18:invokeinterface #32  <Method boolean Queue.offer(Object)>
		//    9   23:pop             
			preloadtarget.photoWidth = i;
		//   10   24:aload_3         
		//   11   25:iload_1         
		//   12   26:putfield        #43  <Field int ListPreloader$PreloadTarget.photoWidth>
			preloadtarget.photoHeight = j;
		//   13   29:aload_3         
		//   14   30:iload_2         
		//   15   31:putfield        #46  <Field int ListPreloader$PreloadTarget.photoHeight>
			return preloadtarget;
		//   16   34:aload_3         
		//   17   35:areturn         
		}

		private final Queue queue;

		public PreloadTargetQueue(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			queue = Util.createQueue(i);
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:invokestatic    #21  <Method Queue Util.createQueue(int)>
		//    5    9:putfield        #23  <Field Queue queue>
			for(int j = 0; j < i; j++)
		//*   6   12:iconst_0        
		//*   7   13:istore_2        
		//*   8   14:iload_2         
		//*   9   15:iload_1         
		//*  10   16:icmpge          43
				queue.offer(((Object) (new PreloadTarget())));
		//   11   19:aload_0         
		//   12   20:getfield        #23  <Field Queue queue>
		//   13   23:new             #25  <Class ListPreloader$PreloadTarget>
		//   14   26:dup             
		//   15   27:invokespecial   #26  <Method void ListPreloader$PreloadTarget()>
		//   16   30:invokeinterface #32  <Method boolean Queue.offer(Object)>
		//   17   35:pop             

		//   18   36:iload_2         
		//   19   37:iconst_1        
		//   20   38:iadd            
		//   21   39:istore_2        
		//*  22   40:goto            14
		//   23   43:return          
		}
	}


	public ListPreloader(RequestManager requestmanager, PreloadModelProvider preloadmodelprovider, PreloadSizeProvider preloadsizeprovider, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		isIncreasing = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #44  <Field boolean isIncreasing>
		requestManager = requestmanager;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #46  <Field RequestManager requestManager>
		preloadModelProvider = preloadmodelprovider;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #48  <Field ListPreloader$PreloadModelProvider preloadModelProvider>
		preloadDimensionProvider = preloadsizeprovider;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #50  <Field ListPreloader$PreloadSizeProvider preloadDimensionProvider>
		maxPreload = i;
	//   14   24:aload_0         
	//   15   25:iload           4
	//   16   27:putfield        #52  <Field int maxPreload>
		preloadTargetQueue = new PreloadTargetQueue(i + 1);
	//   17   30:aload_0         
	//   18   31:new             #18  <Class ListPreloader$PreloadTargetQueue>
	//   19   34:dup             
	//   20   35:iload           4
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:invokespecial   #55  <Method void ListPreloader$PreloadTargetQueue(int)>
	//   24   42:putfield        #57  <Field ListPreloader$PreloadTargetQueue preloadTargetQueue>
	//   25   45:return          
	}

	private void cancelAll()
	{
		for(int i = 0; i < maxPreload; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #52  <Field int maxPreload>
	//*   5    7:icmpge          33
			requestManager.clear(((com.bumptech.glide.request.target.Target) (preloadTargetQueue.next(0, 0))));
	//    6   10:aload_0         
	//    7   11:getfield        #46  <Field RequestManager requestManager>
	//    8   14:aload_0         
	//    9   15:getfield        #57  <Field ListPreloader$PreloadTargetQueue preloadTargetQueue>
	//   10   18:iconst_0        
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #65  <Method ListPreloader$PreloadTarget ListPreloader$PreloadTargetQueue.next(int, int)>
	//   13   23:invokevirtual   #71  <Method void RequestManager.clear(com.bumptech.glide.request.target.Target)>

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
	//    4    6:getfield        #75  <Field int lastEnd>
	//    5    9:iload_1         
	//    6   10:invokestatic    #81  <Method int Math.max(int, int)>
	//    7   13:istore_3        
			l = j;
	//    8   14:iload_2         
	//    9   15:istore          4
		} else
	//*  10   17:goto            32
		{
			k = j;
	//   11   20:iload_2         
	//   12   21:istore_3        
			l = Math.min(lastStart, i);
	//   13   22:aload_0         
	//   14   23:getfield        #83  <Field int lastStart>
	//   15   26:iload_1         
	//   16   27:invokestatic    #86  <Method int Math.min(int, int)>
	//   17   30:istore          4
		}
		l = Math.min(totalItemCount, l);
	//   18   32:aload_0         
	//   19   33:getfield        #88  <Field int totalItemCount>
	//   20   36:iload           4
	//   21   38:invokestatic    #86  <Method int Math.min(int, int)>
	//   22   41:istore          4
		k = Math.min(totalItemCount, Math.max(0, k));
	//   23   43:aload_0         
	//   24   44:getfield        #88  <Field int totalItemCount>
	//   25   47:iconst_0        
	//   26   48:iload_3         
	//   27   49:invokestatic    #81  <Method int Math.max(int, int)>
	//   28   52:invokestatic    #86  <Method int Math.min(int, int)>
	//   29   55:istore_3        
		if(i < j)
	//*  30   56:iload_1         
	//*  31   57:iload_2         
	//*  32   58:icmpge          95
			for(i = k; i < l; i++)
	//*  33   61:iload_3         
	//*  34   62:istore_1        
	//*  35   63:iload_1         
	//*  36   64:iload           4
	//*  37   66:icmpge          92
				preloadAdapterPosition(preloadModelProvider.getPreloadItems(i), i, true);
	//   38   69:aload_0         
	//   39   70:aload_0         
	//   40   71:getfield        #48  <Field ListPreloader$PreloadModelProvider preloadModelProvider>
	//   41   74:iload_1         
	//   42   75:invokeinterface #92  <Method List ListPreloader$PreloadModelProvider.getPreloadItems(int)>
	//   43   80:iload_1         
	//   44   81:iconst_1        
	//   45   82:invokespecial   #96  <Method void preloadAdapterPosition(List, int, boolean)>

	//   46   85:iload_1         
	//   47   86:iconst_1        
	//   48   87:iadd            
	//   49   88:istore_1        
		else
	//*  50   89:goto            63
	//*  51   92:goto            128
			for(i = l - 1; i >= k; i--)
	//*  52   95:iload           4
	//*  53   97:iconst_1        
	//*  54   98:isub            
	//*  55   99:istore_1        
	//*  56  100:iload_1         
	//*  57  101:iload_3         
	//*  58  102:icmplt          128
				preloadAdapterPosition(preloadModelProvider.getPreloadItems(i), i, false);
	//   59  105:aload_0         
	//   60  106:aload_0         
	//   61  107:getfield        #48  <Field ListPreloader$PreloadModelProvider preloadModelProvider>
	//   62  110:iload_1         
	//   63  111:invokeinterface #92  <Method List ListPreloader$PreloadModelProvider.getPreloadItems(int)>
	//   64  116:iload_1         
	//   65  117:iconst_0        
	//   66  118:invokespecial   #96  <Method void preloadAdapterPosition(List, int, boolean)>

	//   67  121:iload_1         
	//   68  122:iconst_1        
	//   69  123:isub            
	//   70  124:istore_1        
	//*  71  125:goto            100
		lastStart = k;
	//   72  128:aload_0         
	//   73  129:iload_3         
	//   74  130:putfield        #83  <Field int lastStart>
		lastEnd = l;
	//   75  133:aload_0         
	//   76  134:iload           4
	//   77  136:putfield        #75  <Field int lastEnd>
	//   78  139:return          
	}

	private void preload(int i, boolean flag)
	{
		if(isIncreasing != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field boolean isIncreasing>
	//*   2    4:iload_2         
	//*   3    5:icmpeq          17
		{
			isIncreasing = flag;
	//    4    8:aload_0         
	//    5    9:iload_2         
	//    6   10:putfield        #44  <Field boolean isIncreasing>
			cancelAll();
	//    7   13:aload_0         
	//    8   14:invokespecial   #99  <Method void cancelAll()>
		}
		int j;
		if(flag)
	//*   9   17:iload_2         
	//*  10   18:ifeq            29
			j = maxPreload;
	//   11   21:aload_0         
	//   12   22:getfield        #52  <Field int maxPreload>
	//   13   25:istore_3        
		else
	//*  14   26:goto            35
			j = -maxPreload;
	//   15   29:aload_0         
	//   16   30:getfield        #52  <Field int maxPreload>
	//   17   33:ineg            
	//   18   34:istore_3        
		preload(i, j + i);
	//   19   35:aload_0         
	//   20   36:iload_1         
	//   21   37:iload_3         
	//   22   38:iload_1         
	//   23   39:iadd            
	//   24   40:invokespecial   #101 <Method void preload(int, int)>
	//   25   43:return          
	}

	private void preloadAdapterPosition(List list, int i, boolean flag)
	{
		int l = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #107 <Method int List.size()>
	//    2    6:istore          5
		if(flag)
	//*   3    8:iload_3         
	//*   4    9:ifeq            47
		{
			for(int j = 0; j < l; j++)
	//*   5   12:iconst_0        
	//*   6   13:istore          4
	//*   7   15:iload           4
	//*   8   17:iload           5
	//*   9   19:icmpge          46
				preloadItem(list.get(j), i, j);
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:iload           4
	//   13   26:invokeinterface #111 <Method Object List.get(int)>
	//   14   31:iload_2         
	//   15   32:iload           4
	//   16   34:invokespecial   #115 <Method void preloadItem(Object, int, int)>

	//   17   37:iload           4
	//   18   39:iconst_1        
	//   19   40:iadd            
	//   20   41:istore          4
	//*  21   43:goto            15
			return;
	//   22   46:return          
		}
		for(int k = l - 1; k >= 0; k--)
	//*  23   47:iload           5
	//*  24   49:iconst_1        
	//*  25   50:isub            
	//*  26   51:istore          4
	//*  27   53:iload           4
	//*  28   55:iflt            82
			preloadItem(list.get(k), i, k);
	//   29   58:aload_0         
	//   30   59:aload_1         
	//   31   60:iload           4
	//   32   62:invokeinterface #111 <Method Object List.get(int)>
	//   33   67:iload_2         
	//   34   68:iload           4
	//   35   70:invokespecial   #115 <Method void preloadItem(Object, int, int)>

	//   36   73:iload           4
	//   37   75:iconst_1        
	//   38   76:isub            
	//   39   77:istore          4
	//*  40   79:goto            53
	//   41   82:return          
	}

	private void preloadItem(Object obj, int i, int j)
	{
		int ai[] = preloadDimensionProvider.getPreloadSize(obj, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ListPreloader$PreloadSizeProvider preloadDimensionProvider>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokeinterface #120 <Method int[] ListPreloader$PreloadSizeProvider.getPreloadSize(Object, int, int)>
	//    6   12:astore          4
		if(ai != null)
	//*   7   14:aload           4
	//*   8   16:ifnull          48
			preloadModelProvider.getPreloadRequestBuilder(obj).into(((com.bumptech.glide.request.target.Target) (preloadTargetQueue.next(ai[0], ai[1]))));
	//    9   19:aload_0         
	//   10   20:getfield        #48  <Field ListPreloader$PreloadModelProvider preloadModelProvider>
	//   11   23:aload_1         
	//   12   24:invokeinterface #124 <Method RequestBuilder ListPreloader$PreloadModelProvider.getPreloadRequestBuilder(Object)>
	//   13   29:aload_0         
	//   14   30:getfield        #57  <Field ListPreloader$PreloadTargetQueue preloadTargetQueue>
	//   15   33:aload           4
	//   16   35:iconst_0        
	//   17   36:iaload          
	//   18   37:aload           4
	//   19   39:iconst_1        
	//   20   40:iaload          
	//   21   41:invokevirtual   #65  <Method ListPreloader$PreloadTarget ListPreloader$PreloadTargetQueue.next(int, int)>
	//   22   44:invokevirtual   #130 <Method com.bumptech.glide.request.target.Target RequestBuilder.into(com.bumptech.glide.request.target.Target)>
	//   23   47:pop             
	//   24   48:return          
	}

	public void onScroll(AbsListView abslistview, int i, int j, int k)
	{
		totalItemCount = k;
	//    0    0:aload_0         
	//    1    1:iload           4
	//    2    3:putfield        #88  <Field int totalItemCount>
		if(i > lastFirstVisible)
	//*   3    6:iload_2         
	//*   4    7:aload_0         
	//*   5    8:getfield        #135 <Field int lastFirstVisible>
	//*   6   11:icmple          25
			preload(i + j, true);
	//    7   14:aload_0         
	//    8   15:iload_2         
	//    9   16:iload_3         
	//   10   17:iadd            
	//   11   18:iconst_1        
	//   12   19:invokespecial   #137 <Method void preload(int, boolean)>
		else
	//*  13   22:goto            39
		if(i < lastFirstVisible)
	//*  14   25:iload_2         
	//*  15   26:aload_0         
	//*  16   27:getfield        #135 <Field int lastFirstVisible>
	//*  17   30:icmpge          39
			preload(i, false);
	//   18   33:aload_0         
	//   19   34:iload_2         
	//   20   35:iconst_0        
	//   21   36:invokespecial   #137 <Method void preload(int, boolean)>
		lastFirstVisible = i;
	//   22   39:aload_0         
	//   23   40:iload_2         
	//   24   41:putfield        #135 <Field int lastFirstVisible>
	//   25   44:return          
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
