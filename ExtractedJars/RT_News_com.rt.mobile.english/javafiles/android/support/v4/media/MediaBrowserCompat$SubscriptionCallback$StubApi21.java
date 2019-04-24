// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

private class MediaBrowserCompat$SubscriptionCallback$StubApi21
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
		int i1 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
	//    9   14:aload_2         
	//   10   15:ldc1            #34  <String "android.media.browse.extra.PAGE_SIZE">
	//   11   17:iconst_m1       
	//   12   18:invokevirtual   #32  <Method int Bundle.getInt(String, int)>
	//   13   21:istore          6
		if(i == -1 && i1 == -1)
	//*  14   23:iload_3         
	//*  15   24:iconst_m1       
	//*  16   25:icmpne          36
	//*  17   28:iload           6
	//*  18   30:iconst_m1       
	//*  19   31:icmpne          36
			return list;
	//   20   34:aload_1         
	//   21   35:areturn         
		int l = i1 * i;
	//   22   36:iload           6
	//   23   38:iload_3         
	//   24   39:imul            
	//   25   40:istore          5
		int k = l + i1;
	//   26   42:iload           5
	//   27   44:iload           6
	//   28   46:iadd            
	//   29   47:istore          4
		if(i >= 0 && i1 >= 1 && l < list.size())
	//*  30   49:iload_3         
	//*  31   50:iflt            104
	//*  32   53:iload           6
	//*  33   55:iconst_1        
	//*  34   56:icmplt          104
	//*  35   59:iload           5
	//*  36   61:aload_1         
	//*  37   62:invokeinterface #40  <Method int List.size()>
	//*  38   67:icmplt          73
	//*  39   70:goto            104
		{
			int j = k;
	//   40   73:iload           4
	//   41   75:istore_3        
			if(k > list.size())
	//*  42   76:iload           4
	//*  43   78:aload_1         
	//*  44   79:invokeinterface #40  <Method int List.size()>
	//*  45   84:icmple          94
				j = list.size();
	//   46   87:aload_1         
	//   47   88:invokeinterface #40  <Method int List.size()>
	//   48   93:istore_3        
			return list.subList(l, j);
	//   49   94:aload_1         
	//   50   95:iload           5
	//   51   97:iload_3         
	//   52   98:invokeinterface #44  <Method List List.subList(int, int)>
	//   53  103:areturn         
		} else
		{
			return Collections.EMPTY_LIST;
	//   54  104:getstatic       #50  <Field List Collections.EMPTY_LIST>
	//   55  107:areturn         
		}
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

	MediaBrowserCompat$SubscriptionCallback$StubApi21()
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
