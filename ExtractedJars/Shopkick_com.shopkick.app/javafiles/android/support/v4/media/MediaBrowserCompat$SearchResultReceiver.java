// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

private static class MediaBrowserCompat$SearchResultReceiver extends ResultReceiver
{

	protected void onReceiveResult(int i, Bundle bundle)
	{
		MediaSessionCompat.ensureClassLoader(bundle);
	//    0    0:aload_2         
	//    1    1:invokestatic    #33  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
		if(i == 0 && bundle != null && bundle.containsKey("search_results"))
	//*   2    4:iload_1         
	//*   3    5:ifne            101
	//*   4    8:aload_2         
	//*   5    9:ifnull          101
	//*   6   12:aload_2         
	//*   7   13:ldc1            #35  <String "search_results">
	//*   8   15:invokevirtual   #41  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifne            24
	//*  10   21:goto            101
		{
			android.os.Parcelable aparcelable[] = bundle.getParcelableArray("search_results");
	//   11   24:aload_2         
	//   12   25:ldc1            #35  <String "search_results">
	//   13   27:invokevirtual   #45  <Method android.os.Parcelable[] Bundle.getParcelableArray(String)>
	//   14   30:astore          5
			bundle = null;
	//   15   32:aconst_null     
	//   16   33:astore_2        
			if(aparcelable != null)
	//*  17   34:aload           5
	//*  18   36:ifnull          84
			{
				ArrayList arraylist = new ArrayList();
	//   19   39:new             #47  <Class ArrayList>
	//   20   42:dup             
	//   21   43:invokespecial   #50  <Method void ArrayList()>
	//   22   46:astore          4
				int j = aparcelable.length;
	//   23   48:aload           5
	//   24   50:arraylength     
	//   25   51:istore_3        
				i = 0;
	//   26   52:iconst_0        
	//   27   53:istore_1        
				do
				{
					bundle = ((Bundle) (arraylist));
	//   28   54:aload           4
	//   29   56:astore_2        
					if(i >= j)
						break;
	//   30   57:iload_1         
	//   31   58:iload_3         
	//   32   59:icmpge          84
					((List) (arraylist)).add(((Object) ((MediaBrowserCompat.MediaItem)aparcelable[i])));
	//   33   62:aload           4
	//   34   64:aload           5
	//   35   66:iload_1         
	//   36   67:aaload          
	//   37   68:checkcast       #52  <Class MediaBrowserCompat$MediaItem>
	//   38   71:invokeinterface #58  <Method boolean List.add(Object)>
	//   39   76:pop             
					i++;
	//   40   77:iload_1         
	//   41   78:iconst_1        
	//   42   79:iadd            
	//   43   80:istore_1        
				} while(true);
	//   44   81:goto            54
			}
			mCallback.onSearchResult(mQuery, mExtras, ((List) (bundle)));
	//   45   84:aload_0         
	//   46   85:getfield        #24  <Field MediaBrowserCompat$SearchCallback mCallback>
	//   47   88:aload_0         
	//   48   89:getfield        #20  <Field String mQuery>
	//   49   92:aload_0         
	//   50   93:getfield        #22  <Field Bundle mExtras>
	//   51   96:aload_2         
	//   52   97:invokevirtual   #64  <Method void MediaBrowserCompat$SearchCallback.onSearchResult(String, Bundle, List)>
			return;
	//   53  100:return          
		} else
		{
			mCallback.onError(mQuery, mExtras);
	//   54  101:aload_0         
	//   55  102:getfield        #24  <Field MediaBrowserCompat$SearchCallback mCallback>
	//   56  105:aload_0         
	//   57  106:getfield        #20  <Field String mQuery>
	//   58  109:aload_0         
	//   59  110:getfield        #22  <Field Bundle mExtras>
	//   60  113:invokevirtual   #68  <Method void MediaBrowserCompat$SearchCallback.onError(String, Bundle)>
			return;
	//   61  116:return          
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
