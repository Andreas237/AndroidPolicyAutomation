// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.os.ResultReceiver;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

static class MediaBrowserCompat$SearchResultReceiver extends ResultReceiver
{

	public void onReceiveResult(int i, Bundle bundle)
	{
		if(i != 0 || bundle == null || !bundle.containsKey("search_results"))
	//*   0    0:iload_1         
	//*   1    1:ifne            17
	//*   2    4:aload_2         
	//*   3    5:ifnull          17
	//*   4    8:aload_2         
	//*   5    9:ldc1            #29  <String "search_results">
	//*   6   11:invokevirtual   #35  <Method boolean Bundle.containsKey(String)>
	//*   7   14:ifne            33
		{
			mCallback.onError(mQuery, mExtras);
	//    8   17:aload_0         
	//    9   18:getfield        #24  <Field MediaBrowserCompat$SearchCallback mCallback>
	//   10   21:aload_0         
	//   11   22:getfield        #20  <Field String mQuery>
	//   12   25:aload_0         
	//   13   26:getfield        #22  <Field Bundle mExtras>
	//   14   29:invokevirtual   #41  <Method void MediaBrowserCompat$SearchCallback.onError(String, Bundle)>
			return;
	//   15   32:return          
		}
		android.os.Parcelable aparcelable[] = bundle.getParcelableArray("search_results");
	//   16   33:aload_2         
	//   17   34:ldc1            #29  <String "search_results">
	//   18   36:invokevirtual   #45  <Method android.os.Parcelable[] Bundle.getParcelableArray(String)>
	//   19   39:astore          5
		bundle = null;
	//   20   41:aconst_null     
	//   21   42:astore_2        
		if(aparcelable != null)
	//*  22   43:aload           5
	//*  23   45:ifnull          93
		{
			ArrayList arraylist = new ArrayList();
	//   24   48:new             #47  <Class ArrayList>
	//   25   51:dup             
	//   26   52:invokespecial   #50  <Method void ArrayList()>
	//   27   55:astore          4
			int j = aparcelable.length;
	//   28   57:aload           5
	//   29   59:arraylength     
	//   30   60:istore_3        
			i = 0;
	//   31   61:iconst_0        
	//   32   62:istore_1        
			do
			{
				bundle = ((Bundle) (arraylist));
	//   33   63:aload           4
	//   34   65:astore_2        
				if(i >= j)
					break;
	//   35   66:iload_1         
	//   36   67:iload_3         
	//   37   68:icmpge          93
				((List) (arraylist)).add(((Object) ((MediaBrowserCompat.MediaItem)aparcelable[i])));
	//   38   71:aload           4
	//   39   73:aload           5
	//   40   75:iload_1         
	//   41   76:aaload          
	//   42   77:checkcast       #52  <Class MediaBrowserCompat$MediaItem>
	//   43   80:invokeinterface #58  <Method boolean List.add(Object)>
	//   44   85:pop             
				i++;
	//   45   86:iload_1         
	//   46   87:iconst_1        
	//   47   88:iadd            
	//   48   89:istore_1        
			} while(true);
	//   49   90:goto            63
		}
		mCallback.onSearchResult(mQuery, mExtras, ((List) (bundle)));
	//   50   93:aload_0         
	//   51   94:getfield        #24  <Field MediaBrowserCompat$SearchCallback mCallback>
	//   52   97:aload_0         
	//   53   98:getfield        #20  <Field String mQuery>
	//   54  101:aload_0         
	//   55  102:getfield        #22  <Field Bundle mExtras>
	//   56  105:aload_2         
	//   57  106:invokevirtual   #62  <Method void MediaBrowserCompat$SearchCallback.onSearchResult(String, Bundle, List)>
	//   58  109:return          
	}

	private final MediaBrowserCompat.SearchCallback mCallback;
	private final Bundle mExtras;
	private final String mQuery;

	MediaBrowserCompat$SearchResultReceiver(String s, Bundle bundle, MediaBrowserCompat.SearchCallback searchcallback, Handler handler)
	{
		super(handler);
	//    0    0:aload_0         
	//    1    1:aload           4
	//    2    3:invokespecial   #18  <Method void ResultReceiver(Handler)>
		mQuery = s;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #20  <Field String mQuery>
		mExtras = bundle;
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:putfield        #22  <Field Bundle mExtras>
		mCallback = searchcallback;
	//    9   16:aload_0         
	//   10   17:aload_3         
	//   11   18:putfield        #24  <Field MediaBrowserCompat$SearchCallback mCallback>
	//   12   21:return          
	}
}
