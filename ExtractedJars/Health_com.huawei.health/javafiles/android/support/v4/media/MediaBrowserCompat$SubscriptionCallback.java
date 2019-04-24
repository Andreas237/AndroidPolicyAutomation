// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.*;
import android.support.v4.os.BuildCompat;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat, MediaBrowserCompatApi24, MediaBrowserCompatApi21

public static abstract class MediaBrowserCompat$SubscriptionCallback
{
	class StubApi21
		implements MediaBrowserCompatApi21.SubscriptionCallback
	{

		List applyOptions(List list, Bundle bundle)
		{
			if(list == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
		//    4    6:aload_2         
		//    5    7:ldc1            #26  <String "android.media.browse.extra.PAGE">
		//    6    9:iconst_m1       
		//    7   10:invokevirtual   #32  <Method int Bundle.getInt(String, int)>
		//    8   13:istore_3        
			int l = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
		//    9   14:aload_2         
		//   10   15:ldc1            #34  <String "android.media.browse.extra.PAGE_SIZE">
		//   11   17:iconst_m1       
		//   12   18:invokevirtual   #32  <Method int Bundle.getInt(String, int)>
		//   13   21:istore          6
			if(i == -1 && l == -1)
		//*  14   23:iload_3         
		//*  15   24:iconst_m1       
		//*  16   25:icmpne          36
		//*  17   28:iload           6
		//*  18   30:iconst_m1       
		//*  19   31:icmpne          36
				return list;
		//   20   34:aload_1         
		//   21   35:areturn         
			int k = l * i;
		//   22   36:iload           6
		//   23   38:iload_3         
		//   24   39:imul            
		//   25   40:istore          5
			int j = k + l;
		//   26   42:iload           5
		//   27   44:iload           6
		//   28   46:iadd            
		//   29   47:istore          4
			if(i < 0 || l < 1 || k >= list.size())
		//*  30   49:iload_3         
		//*  31   50:iflt            70
		//*  32   53:iload           6
		//*  33   55:iconst_1        
		//*  34   56:icmplt          70
		//*  35   59:iload           5
		//*  36   61:aload_1         
		//*  37   62:invokeinterface #40  <Method int List.size()>
		//*  38   67:icmplt          74
				return Collections.EMPTY_LIST;
		//   39   70:getstatic       #46  <Field List Collections.EMPTY_LIST>
		//   40   73:areturn         
			i = j;
		//   41   74:iload           4
		//   42   76:istore_3        
			if(j > list.size())
		//*  43   77:iload           4
		//*  44   79:aload_1         
		//*  45   80:invokeinterface #40  <Method int List.size()>
		//*  46   85:icmple          95
				i = list.size();
		//   47   88:aload_1         
		//   48   89:invokeinterface #40  <Method int List.size()>
		//   49   94:istore_3        
			return list.subList(k, i);
		//   50   95:aload_1         
		//   51   96:iload           5
		//   52   98:iload_3         
		//   53   99:invokeinterface #50  <Method List List.subList(int, int)>
		//   54  104:areturn         
		}

		public void onChildrenLoaded(String s, List list)
		{
			Object obj;
			if(mSubscriptionRef == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//*   2    4:getfield        #59  <Field WeakReference MediaBrowserCompat$SubscriptionCallback.mSubscriptionRef>
		//*   3    7:ifnonnull       16
				obj = null;
		//    4   10:aconst_null     
		//    5   11:astore          4
			else
		//*   6   13:goto            31
				obj = ((Object) ((MediaBrowserCompat.Subscription)mSubscriptionRef.get()));
		//    7   16:aload_0         
		//    8   17:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//    9   20:getfield        #59  <Field WeakReference MediaBrowserCompat$SubscriptionCallback.mSubscriptionRef>
		//   10   23:invokevirtual   #65  <Method Object WeakReference.get()>
		//   11   26:checkcast       #67  <Class MediaBrowserCompat$Subscription>
		//   12   29:astore          4
			if(obj == null)
		//*  13   31:aload           4
		//*  14   33:ifnonnull       49
			{
				MediaBrowserCompat.SubscriptionCallback.this.onChildrenLoaded(s, MediaBrowserCompat.MediaItem.fromMediaItemList(list));
		//   15   36:aload_0         
		//   16   37:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//   17   40:aload_1         
		//   18   41:aload_2         
		//   19   42:invokestatic    #73  <Method List MediaBrowserCompat$MediaItem.fromMediaItemList(List)>
		//   20   45:invokevirtual   #75  <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List)>
				return;
		//   21   48:return          
			}
			list = MediaBrowserCompat.MediaItem.fromMediaItemList(list);
		//   22   49:aload_2         
		//   23   50:invokestatic    #73  <Method List MediaBrowserCompat$MediaItem.fromMediaItemList(List)>
		//   24   53:astore_2        
			List list1 = ((MediaBrowserCompat.Subscription) (obj)).getCallbacks();
		//   25   54:aload           4
		//   26   56:invokevirtual   #79  <Method List MediaBrowserCompat$Subscription.getCallbacks()>
		//   27   59:astore          5
			obj = ((Object) (((MediaBrowserCompat.Subscription) (obj)).getOptionsList()));
		//   28   61:aload           4
		//   29   63:invokevirtual   #82  <Method List MediaBrowserCompat$Subscription.getOptionsList()>
		//   30   66:astore          4
			for(int i = 0; i < list1.size(); i++)
		//*  31   68:iconst_0        
		//*  32   69:istore_3        
		//*  33   70:iload_3         
		//*  34   71:aload           5
		//*  35   73:invokeinterface #40  <Method int List.size()>
		//*  36   78:icmpge          135
			{
				Bundle bundle = (Bundle)((List) (obj)).get(i);
		//   37   81:aload           4
		//   38   83:iload_3         
		//   39   84:invokeinterface #85  <Method Object List.get(int)>
		//   40   89:checkcast       #28  <Class Bundle>
		//   41   92:astore          6
				if(bundle == null)
		//*  42   94:aload           6
		//*  43   96:ifnonnull       111
					MediaBrowserCompat.SubscriptionCallback.this.onChildrenLoaded(s, list);
		//   44   99:aload_0         
		//   45  100:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//   46  103:aload_1         
		//   47  104:aload_2         
		//   48  105:invokevirtual   #75  <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List)>
				else
		//*  49  108:goto            128
					MediaBrowserCompat.SubscriptionCallback.this.onChildrenLoaded(s, applyOptions(list, bundle), bundle);
		//   50  111:aload_0         
		//   51  112:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//   52  115:aload_1         
		//   53  116:aload_0         
		//   54  117:aload_2         
		//   55  118:aload           6
		//   56  120:invokevirtual   #87  <Method List applyOptions(List, Bundle)>
		//   57  123:aload           6
		//   58  125:invokevirtual   #90  <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List, Bundle)>
			}

		//   59  128:iload_3         
		//   60  129:iconst_1        
		//   61  130:iadd            
		//   62  131:istore_3        
		//*  63  132:goto            70
		//   64  135:return          
		}

		public void onError(String s)
		{
			MediaBrowserCompat.SubscriptionCallback.this.onError(s);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #96  <Method void MediaBrowserCompat$SubscriptionCallback.onError(String)>
		//    4    8:return          
		}

		final MediaBrowserCompat.SubscriptionCallback this$0;

		StubApi21()
		{
			this$0 = MediaBrowserCompat.SubscriptionCallback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
		//    5    9:return          
		}
	}

	class StubApi24 extends StubApi21
		implements MediaBrowserCompatApi24.SubscriptionCallback
	{

		public void onChildrenLoaded(String s, List list, Bundle bundle)
		{
			MediaBrowserCompat.SubscriptionCallback.this.onChildrenLoaded(s, MediaBrowserCompat.MediaItem.fromMediaItemList(list), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #30  <Method List MediaBrowserCompat$MediaItem.fromMediaItemList(List)>
		//    5    9:aload_3         
		//    6   10:invokevirtual   #32  <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List, Bundle)>
		//    7   13:return          
		}

		public void onError(String s, Bundle bundle)
		{
			MediaBrowserCompat.SubscriptionCallback.this.onError(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #39  <Method void MediaBrowserCompat$SubscriptionCallback.onError(String, Bundle)>
		//    5    9:return          
		}

		final MediaBrowserCompat.SubscriptionCallback this$0;

		StubApi24()
		{
			this$0 = MediaBrowserCompat.SubscriptionCallback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #20  <Method void MediaBrowserCompat$SubscriptionCallback$StubApi21(MediaBrowserCompat$SubscriptionCallback)>
		//    6   10:return          
		}
	}


	private void setSubscription(MediaBrowserCompat.Subscription subscription)
	{
		mSubscriptionRef = new WeakReference(((Object) (subscription)));
	//    0    0:aload_0         
	//    1    1:new             #71  <Class WeakReference>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #74  <Method void WeakReference(Object)>
	//    5    9:putfield        #76  <Field WeakReference mSubscriptionRef>
	//    6   12:return          
	}

	public void onChildrenLoaded(String s, List list)
	{
	//    0    0:return          
	}

	public void onChildrenLoaded(String s, List list, Bundle bundle)
	{
	//    0    0:return          
	}

	public void onError(String s)
	{
	//    0    0:return          
	}

	public void onError(String s, Bundle bundle)
	{
	//    0    0:return          
	}

	private final Object mSubscriptionCallbackObj;
	WeakReference mSubscriptionRef;
	private final IBinder mToken;


/*
	static IBinder access$000(MediaBrowserCompat$SubscriptionCallback mediabrowsercompat$subscriptioncallback)
	{
		return mediabrowsercompat$subscriptioncallback.mToken;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field IBinder mToken>
	//    2    4:areturn         
	}

*/


/*
	static void access$100(MediaBrowserCompat$SubscriptionCallback mediabrowsercompat$subscriptioncallback, MediaBrowserCompat.Subscription subscription)
	{
		mediabrowsercompat$subscriptioncallback.setSubscription(subscription);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void setSubscription(MediaBrowserCompat$Subscription)>
		return;
	//    3    5:return          
	}

*/


/*
	static Object access$200(MediaBrowserCompat$SubscriptionCallback mediabrowsercompat$subscriptioncallback)
	{
		return mediabrowsercompat$subscriptioncallback.mSubscriptionCallbackObj;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Object mSubscriptionCallbackObj>
	//    2    4:areturn         
	}

*/

	public MediaBrowserCompat$SubscriptionCallback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 26 || BuildCompat.isAtLeastO())
	//*   2    4:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          26
	//*   4    9:icmpge          18
	//*   5   12:invokestatic    #36  <Method boolean BuildCompat.isAtLeastO()>
	//*   6   15:ifeq            39
		{
			mSubscriptionCallbackObj = MediaBrowserCompatApi24.createSubscriptionCallback(((back) (new StubApi24())));
	//    7   18:aload_0         
	//    8   19:new             #12  <Class MediaBrowserCompat$SubscriptionCallback$StubApi24>
	//    9   22:dup             
	//   10   23:aload_0         
	//   11   24:invokespecial   #39  <Method void MediaBrowserCompat$SubscriptionCallback$StubApi24(MediaBrowserCompat$SubscriptionCallback)>
	//   12   27:invokestatic    #45  <Method Object MediaBrowserCompatApi24.createSubscriptionCallback(MediaBrowserCompatApi24$SubscriptionCallback)>
	//   13   30:putfield        #47  <Field Object mSubscriptionCallbackObj>
			mToken = null;
	//   14   33:aload_0         
	//   15   34:aconst_null     
	//   16   35:putfield        #49  <Field IBinder mToken>
			return;
	//   17   38:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  18   39:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
	//*  19   42:bipush          21
	//*  20   44:icmplt          74
		{
			mSubscriptionCallbackObj = MediaBrowserCompatApi21.createSubscriptionCallback(((back) (new StubApi21())));
	//   21   47:aload_0         
	//   22   48:new             #9   <Class MediaBrowserCompat$SubscriptionCallback$StubApi21>
	//   23   51:dup             
	//   24   52:aload_0         
	//   25   53:invokespecial   #50  <Method void MediaBrowserCompat$SubscriptionCallback$StubApi21(MediaBrowserCompat$SubscriptionCallback)>
	//   26   56:invokestatic    #55  <Method Object MediaBrowserCompatApi21.createSubscriptionCallback(MediaBrowserCompatApi21$SubscriptionCallback)>
	//   27   59:putfield        #47  <Field Object mSubscriptionCallbackObj>
			mToken = ((IBinder) (new Binder()));
	//   28   62:aload_0         
	//   29   63:new             #57  <Class Binder>
	//   30   66:dup             
	//   31   67:invokespecial   #58  <Method void Binder()>
	//   32   70:putfield        #49  <Field IBinder mToken>
			return;
	//   33   73:return          
		} else
		{
			mSubscriptionCallbackObj = null;
	//   34   74:aload_0         
	//   35   75:aconst_null     
	//   36   76:putfield        #47  <Field Object mSubscriptionCallbackObj>
			mToken = ((IBinder) (new Binder()));
	//   37   79:aload_0         
	//   38   80:new             #57  <Class Binder>
	//   39   83:dup             
	//   40   84:invokespecial   #58  <Method void Binder()>
	//   41   87:putfield        #49  <Field IBinder mToken>
			return;
	//   42   90:return          
		}
	}
}
