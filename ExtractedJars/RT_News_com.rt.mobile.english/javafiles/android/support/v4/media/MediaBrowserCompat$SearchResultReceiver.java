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

private static class MediaBrowserCompat$SearchResultReceiver extends ResultReceiver
{

	protected void onReceiveResult(int i, Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          13
			bundle.setClassLoader(((Class) (android/support/v4/media/MediaBrowserCompat)).getClassLoader());
	//    2    4:aload_2         
	//    3    5:ldc1            #6   <Class MediaBrowserCompat>
	//    4    7:invokevirtual   #33  <Method ClassLoader Class.getClassLoader()>
	//    5   10:invokevirtual   #39  <Method void Bundle.setClassLoader(ClassLoader)>
		if(i == 0 && bundle != null && bundle.containsKey("search_results"))
	//*   6   13:iload_1         
	//*   7   14:ifne            110
	//*   8   17:aload_2         
	//*   9   18:ifnull          110
	//*  10   21:aload_2         
	//*  11   22:ldc1            #41  <String "search_results">
	//*  12   24:invokevirtual   #45  <Method boolean Bundle.containsKey(String)>
	//*  13   27:ifne            33
	//*  14   30:goto            110
		{
			android.os.Parcelable aparcelable[] = bundle.getParcelableArray("search_results");
	//   15   33:aload_2         
	//   16   34:ldc1            #41  <String "search_results">
	//   17   36:invokevirtual   #49  <Method android.os.Parcelable[] Bundle.getParcelableArray(String)>
	//   18   39:astore          5
			bundle = null;
	//   19   41:aconst_null     
	//   20   42:astore_2        
			if(aparcelable != null)
	//*  21   43:aload           5
	//*  22   45:ifnull          93
			{
				ArrayList arraylist = new ArrayList();
	//   23   48:new             #51  <Class ArrayList>
	//   24   51:dup             
	//   25   52:invokespecial   #54  <Method void ArrayList()>
	//   26   55:astore          4
				int j = aparcelable.length;
	//   27   57:aload           5
	//   28   59:arraylength     
	//   29   60:istore_3        
				i = 0;
	//   30   61:iconst_0        
	//   31   62:istore_1        
				do
				{
					bundle = ((Bundle) (arraylist));
	//   32   63:aload           4
	//   33   65:astore_2        
					if(i >= j)
						break;
	//   34   66:iload_1         
	//   35   67:iload_3         
	//   36   68:icmpge          93
					((List) (arraylist)).add(((Object) ((MediaBrowserCompat.MediaItem)aparcelable[i])));
	//   37   71:aload           4
	//   38   73:aload           5
	//   39   75:iload_1         
	//   40   76:aaload          
	//   41   77:checkcast       #56  <Class MediaBrowserCompat$MediaItem>
	//   42   80:invokeinterface #62  <Method boolean List.add(Object)>
	//   43   85:pop             
					i++;
	//   44   86:iload_1         
	//   45   87:iconst_1        
	//   46   88:iadd            
	//   47   89:istore_1        
				} while(true);
	//   48   90:goto            63
			}
			mCallback.onSearchResult(mQuery, mExtras, ((List) (bundle)));
	//   49   93:aload_0         
	//   50   94:getfield        #24  <Field MediaBrowserCompat$SearchCallback mCallback>
	//   51   97:aload_0         
	//   52   98:getfield        #20  <Field String mQuery>
	//   53  101:aload_0         
	//   54  102:getfield        #22  <Field Bundle mExtras>
	//   55  105:aload_2         
	//   56  106:invokevirtual   #68  <Method void MediaBrowserCompat$SearchCallback.onSearchResult(String, Bundle, List)>
			return;
	//   57  109:return          
		} else
		{
			mCallback.onError(mQuery, mExtras);
	//   58  110:aload_0         
	//   59  111:getfield        #24  <Field MediaBrowserCompat$SearchCallback mCallback>
	//   60  114:aload_0         
	//   61  115:getfield        #20  <Field String mQuery>
	//   62  118:aload_0         
	//   63  119:getfield        #22  <Field Bundle mExtras>
	//   64  122:invokevirtual   #72  <Method void MediaBrowserCompat$SearchCallback.onError(String, Bundle)>
			return;
	//   65  125:return          
		}
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
