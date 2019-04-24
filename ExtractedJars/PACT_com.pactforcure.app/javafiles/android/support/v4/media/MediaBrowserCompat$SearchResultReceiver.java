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
		if(i != 0 || bundle == null || !bundle.containsKey("search_results"))
	//*   6   13:iload_1         
	//*   7   14:ifne            30
	//*   8   17:aload_2         
	//*   9   18:ifnull          30
	//*  10   21:aload_2         
	//*  11   22:ldc1            #41  <String "search_results">
	//*  12   24:invokevirtual   #45  <Method boolean Bundle.containsKey(String)>
	//*  13   27:ifne            46
		{
			mCallback.onError(mQuery, mExtras);
	//   14   30:aload_0         
	//   15   31:getfield        #24  <Field MediaBrowserCompat$SearchCallback mCallback>
	//   16   34:aload_0         
	//   17   35:getfield        #20  <Field String mQuery>
	//   18   38:aload_0         
	//   19   39:getfield        #22  <Field Bundle mExtras>
	//   20   42:invokevirtual   #51  <Method void MediaBrowserCompat$SearchCallback.onError(String, Bundle)>
			return;
	//   21   45:return          
		}
		android.os.Parcelable aparcelable[] = bundle.getParcelableArray("search_results");
	//   22   46:aload_2         
	//   23   47:ldc1            #41  <String "search_results">
	//   24   49:invokevirtual   #55  <Method android.os.Parcelable[] Bundle.getParcelableArray(String)>
	//   25   52:astore          5
		bundle = null;
	//   26   54:aconst_null     
	//   27   55:astore_2        
		if(aparcelable != null)
	//*  28   56:aload           5
	//*  29   58:ifnull          106
		{
			ArrayList arraylist = new ArrayList();
	//   30   61:new             #57  <Class ArrayList>
	//   31   64:dup             
	//   32   65:invokespecial   #60  <Method void ArrayList()>
	//   33   68:astore          4
			int j = aparcelable.length;
	//   34   70:aload           5
	//   35   72:arraylength     
	//   36   73:istore_3        
			i = 0;
	//   37   74:iconst_0        
	//   38   75:istore_1        
			do
			{
				bundle = ((Bundle) (arraylist));
	//   39   76:aload           4
	//   40   78:astore_2        
				if(i >= j)
					break;
	//   41   79:iload_1         
	//   42   80:iload_3         
	//   43   81:icmpge          106
				((List) (arraylist)).add(((Object) ((MediaBrowserCompat.MediaItem)aparcelable[i])));
	//   44   84:aload           4
	//   45   86:aload           5
	//   46   88:iload_1         
	//   47   89:aaload          
	//   48   90:checkcast       #62  <Class MediaBrowserCompat$MediaItem>
	//   49   93:invokeinterface #68  <Method boolean List.add(Object)>
	//   50   98:pop             
				i++;
	//   51   99:iload_1         
	//   52  100:iconst_1        
	//   53  101:iadd            
	//   54  102:istore_1        
			} while(true);
	//   55  103:goto            76
		}
		mCallback.onSearchResult(mQuery, mExtras, ((List) (bundle)));
	//   56  106:aload_0         
	//   57  107:getfield        #24  <Field MediaBrowserCompat$SearchCallback mCallback>
	//   58  110:aload_0         
	//   59  111:getfield        #20  <Field String mQuery>
	//   60  114:aload_0         
	//   61  115:getfield        #22  <Field Bundle mExtras>
	//   62  118:aload_2         
	//   63  119:invokevirtual   #72  <Method void MediaBrowserCompat$SearchCallback.onSearchResult(String, Bundle, List)>
	//   64  122:return          
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
