// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.*;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat, MediaBrowserCompatApi24, MediaBrowserCompatApi21

public static abstract class MediaBrowserCompat$SubscriptionCallback
{
	private class StubApi21
		implements MediaBrowserCompatApi21.SubscriptionCallback
	{

		List applyOptions(List list, Bundle bundle)
		{
			if(list != null) goto _L2; else goto _L1
		//    0    0:aload_1         
		//    1    1:ifnonnull       8
_L1:
			bundle = null;
		//    2    4:aconst_null     
		//    3    5:astore_2        
_L4:
			return ((List) (bundle));
		//    4    6:aload_2         
		//    5    7:areturn         
_L2:
			int i;
			int l;
			i = bundle.getInt("android.media.browse.extra.PAGE", -1);
		//    6    8:aload_2         
		//    7    9:ldc1            #26  <String "android.media.browse.extra.PAGE">
		//    8   11:iconst_m1       
		//    9   12:invokevirtual   #32  <Method int Bundle.getInt(String, int)>
		//   10   15:istore_3        
			l = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
		//   11   16:aload_2         
		//   12   17:ldc1            #34  <String "android.media.browse.extra.PAGE_SIZE">
		//   13   19:iconst_m1       
		//   14   20:invokevirtual   #32  <Method int Bundle.getInt(String, int)>
		//   15   23:istore          6
			if(i != -1)
				break; /* Loop/switch isn't completed */
		//   16   25:iload_3         
		//   17   26:iconst_m1       
		//   18   27:icmpne          38
			bundle = ((Bundle) (list));
		//   19   30:aload_1         
		//   20   31:astore_2        
			if(l == -1) goto _L4; else goto _L3
		//   21   32:iload           6
		//   22   34:iconst_m1       
		//   23   35:icmpeq          6
_L3:
			int k = l * i;
		//   24   38:iload           6
		//   25   40:iload_3         
		//   26   41:imul            
		//   27   42:istore          5
			int j = k + l;
		//   28   44:iload           5
		//   29   46:iload           6
		//   30   48:iadd            
		//   31   49:istore          4
			if(i < 0 || l < 1 || k >= list.size())
		//*  32   51:iload_3         
		//*  33   52:iflt            72
		//*  34   55:iload           6
		//*  35   57:iconst_1        
		//*  36   58:icmplt          72
		//*  37   61:iload           5
		//*  38   63:aload_1         
		//*  39   64:invokeinterface #40  <Method int List.size()>
		//*  40   69:icmplt          76
				return Collections.EMPTY_LIST;
		//   41   72:getstatic       #46  <Field List Collections.EMPTY_LIST>
		//   42   75:areturn         
			i = j;
		//   43   76:iload           4
		//   44   78:istore_3        
			if(j > list.size())
		//*  45   79:iload           4
		//*  46   81:aload_1         
		//*  47   82:invokeinterface #40  <Method int List.size()>
		//*  48   87:icmple          97
				i = list.size();
		//   49   90:aload_1         
		//   50   91:invokeinterface #40  <Method int List.size()>
		//   51   96:istore_3        
			return list.subList(k, i);
		//   52   97:aload_1         
		//   53   98:iload           5
		//   54  100:iload_3         
		//   55  101:invokeinterface #50  <Method List List.subList(int, int)>
		//   56  106:areturn         
		}

		public void onChildrenLoaded(String s, List list)
		{
			Object obj;
			if(mSubscriptionRef == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//*   2    4:getfield        #59  <Field WeakReference MediaBrowserCompat$SubscriptionCallback.mSubscriptionRef>
		//*   3    7:ifnonnull       31
				obj = null;
		//    4   10:aconst_null     
		//    5   11:astore          4
			else
		//*   6   13:aload           4
		//*   7   15:ifnonnull       49
		//*   8   18:aload_0         
		//*   9   19:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//*  10   22:aload_1         
		//*  11   23:aload_2         
		//*  12   24:invokestatic    #65  <Method List MediaBrowserCompat$MediaItem.fromMediaItemList(List)>
		//*  13   27:invokevirtual   #67  <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List)>
		//*  14   30:return          
				obj = ((Object) ((MediaBrowserCompat.Subscription)mSubscriptionRef.get()));
		//   15   31:aload_0         
		//   16   32:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//   17   35:getfield        #59  <Field WeakReference MediaBrowserCompat$SubscriptionCallback.mSubscriptionRef>
		//   18   38:invokevirtual   #73  <Method Object WeakReference.get()>
		//   19   41:checkcast       #75  <Class MediaBrowserCompat$Subscription>
		//   20   44:astore          4
			if(obj == null)
			{
				MediaBrowserCompat.SubscriptionCallback.this.onChildrenLoaded(s, MediaBrowserCompat.MediaItem.fromMediaItemList(list));
			} else
		//*  21   46:goto            13
			{
				list = MediaBrowserCompat.MediaItem.fromMediaItemList(list);
		//   22   49:aload_2         
		//   23   50:invokestatic    #65  <Method List MediaBrowserCompat$MediaItem.fromMediaItemList(List)>
		//   24   53:astore_2        
				List list1 = ((MediaBrowserCompat.Subscription) (obj)).getCallbacks();
		//   25   54:aload           4
		//   26   56:invokevirtual   #79  <Method List MediaBrowserCompat$Subscription.getCallbacks()>
		//   27   59:astore          5
				obj = ((Object) (((MediaBrowserCompat.Subscription) (obj)).getOptionsList()));
		//   28   61:aload           4
		//   29   63:invokevirtual   #82  <Method List MediaBrowserCompat$Subscription.getOptionsList()>
		//   30   66:astore          4
				int i = 0;
		//   31   68:iconst_0        
		//   32   69:istore_3        
				while(i < list1.size()) 
		//*  33   70:iload_3         
		//*  34   71:aload           5
		//*  35   73:invokeinterface #40  <Method int List.size()>
		//*  36   78:icmpge          30
				{
					Bundle bundle = (Bundle)((List) (obj)).get(i);
		//   37   81:aload           4
		//   38   83:iload_3         
		//   39   84:invokeinterface #85  <Method Object List.get(int)>
		//   40   89:checkcast       #28  <Class Bundle>
		//   41   92:astore          6
					if(bundle == null)
		//*  42   94:aload           6
		//*  43   96:ifnonnull       115
						MediaBrowserCompat.SubscriptionCallback.this.onChildrenLoaded(s, list);
		//   44   99:aload_0         
		//   45  100:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//   46  103:aload_1         
		//   47  104:aload_2         
		//   48  105:invokevirtual   #67  <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List)>
					else
		//*  49  108:iload_3         
		//*  50  109:iconst_1        
		//*  51  110:iadd            
		//*  52  111:istore_3        
		//*  53  112:goto            70
						MediaBrowserCompat.SubscriptionCallback.this.onChildrenLoaded(s, applyOptions(list, bundle), bundle);
		//   54  115:aload_0         
		//   55  116:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//   56  119:aload_1         
		//   57  120:aload_0         
		//   58  121:aload_2         
		//   59  122:aload           6
		//   60  124:invokevirtual   #87  <Method List applyOptions(List, Bundle)>
		//   61  127:aload           6
		//   62  129:invokevirtual   #90  <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List, Bundle)>
					i++;
				}
			}
		//*  63  132:goto            108
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

	private class StubApi24 extends StubApi21
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
	//    1    1:new             #65  <Class WeakReference>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #68  <Method void WeakReference(Object)>
	//    5    9:putfield        #70  <Field WeakReference mSubscriptionRef>
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
	//    1    1:getfield        #43  <Field IBinder mToken>
	//    2    4:areturn         
	}

*/


/*
	static void access$100(MediaBrowserCompat$SubscriptionCallback mediabrowsercompat$subscriptioncallback, MediaBrowserCompat.Subscription subscription)
	{
		mediabrowsercompat$subscriptioncallback.setSubscription(subscription);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #61  <Method void setSubscription(MediaBrowserCompat$Subscription)>
		return;
	//    3    5:return          
	}

*/


/*
	static Object access$200(MediaBrowserCompat$SubscriptionCallback mediabrowsercompat$subscriptioncallback)
	{
		return mediabrowsercompat$subscriptioncallback.mSubscriptionCallbackObj;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Object mSubscriptionCallbackObj>
	//    2    4:areturn         
	}

*/

	public MediaBrowserCompat$SubscriptionCallback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   2    4:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          26
	//*   4    9:icmplt          33
		{
			mSubscriptionCallbackObj = MediaBrowserCompatApi24.createSubscriptionCallback(((back) (new StubApi24())));
	//    5   12:aload_0         
	//    6   13:new             #12  <Class MediaBrowserCompat$SubscriptionCallback$StubApi24>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokespecial   #33  <Method void MediaBrowserCompat$SubscriptionCallback$StubApi24(MediaBrowserCompat$SubscriptionCallback)>
	//   10   21:invokestatic    #39  <Method Object MediaBrowserCompatApi24.createSubscriptionCallback(MediaBrowserCompatApi24$SubscriptionCallback)>
	//   11   24:putfield        #41  <Field Object mSubscriptionCallbackObj>
			mToken = null;
	//   12   27:aload_0         
	//   13   28:aconst_null     
	//   14   29:putfield        #43  <Field IBinder mToken>
			return;
	//   15   32:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  16   33:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   36:bipush          21
	//*  18   38:icmplt          68
		{
			mSubscriptionCallbackObj = MediaBrowserCompatApi21.createSubscriptionCallback(((back) (new StubApi21())));
	//   19   41:aload_0         
	//   20   42:new             #9   <Class MediaBrowserCompat$SubscriptionCallback$StubApi21>
	//   21   45:dup             
	//   22   46:aload_0         
	//   23   47:invokespecial   #44  <Method void MediaBrowserCompat$SubscriptionCallback$StubApi21(MediaBrowserCompat$SubscriptionCallback)>
	//   24   50:invokestatic    #49  <Method Object MediaBrowserCompatApi21.createSubscriptionCallback(MediaBrowserCompatApi21$SubscriptionCallback)>
	//   25   53:putfield        #41  <Field Object mSubscriptionCallbackObj>
			mToken = ((IBinder) (new Binder()));
	//   26   56:aload_0         
	//   27   57:new             #51  <Class Binder>
	//   28   60:dup             
	//   29   61:invokespecial   #52  <Method void Binder()>
	//   30   64:putfield        #43  <Field IBinder mToken>
			return;
	//   31   67:return          
		} else
		{
			mSubscriptionCallbackObj = null;
	//   32   68:aload_0         
	//   33   69:aconst_null     
	//   34   70:putfield        #41  <Field Object mSubscriptionCallbackObj>
			mToken = ((IBinder) (new Binder()));
	//   35   73:aload_0         
	//   36   74:new             #51  <Class Binder>
	//   37   77:dup             
	//   38   78:invokespecial   #52  <Method void Binder()>
	//   39   81:putfield        #43  <Field IBinder mToken>
			return;
	//   40   84:return          
		}
	}
}
