// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

private static class MediaBrowserCompat$SearchResultReceiver extends ResultReceiver
{

	protected void a(int i, Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          13
			bundle.setClassLoader(((Class) (android/support/v4/media/MediaBrowserCompat)).getClassLoader());
	//    2    4:aload_2         
	//    3    5:ldc1            #6   <Class MediaBrowserCompat>
	//    4    7:invokevirtual   #21  <Method ClassLoader Class.getClassLoader()>
	//    5   10:invokevirtual   #27  <Method void Bundle.setClassLoader(ClassLoader)>
		if(i == 0 && bundle != null && bundle.containsKey("search_results"))
	//*   6   13:iload_1         
	//*   7   14:ifne            110
	//*   8   17:aload_2         
	//*   9   18:ifnull          110
	//*  10   21:aload_2         
	//*  11   22:ldc1            #29  <String "search_results">
	//*  12   24:invokevirtual   #33  <Method boolean Bundle.containsKey(String)>
	//*  13   27:ifne            33
	//*  14   30:goto            110
		{
			android.os.Parcelable aparcelable[] = bundle.getParcelableArray("search_results");
	//   15   33:aload_2         
	//   16   34:ldc1            #29  <String "search_results">
	//   17   36:invokevirtual   #37  <Method android.os.Parcelable[] Bundle.getParcelableArray(String)>
	//   18   39:astore          5
			bundle = null;
	//   19   41:aconst_null     
	//   20   42:astore_2        
			if(aparcelable != null)
	//*  21   43:aload           5
	//*  22   45:ifnull          93
			{
				ArrayList arraylist = new ArrayList();
	//   23   48:new             #39  <Class ArrayList>
	//   24   51:dup             
	//   25   52:invokespecial   #43  <Method void ArrayList()>
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
	//   41   77:checkcast       #45  <Class MediaBrowserCompat$MediaItem>
	//   42   80:invokeinterface #51  <Method boolean List.add(Object)>
	//   43   85:pop             
					i++;
	//   44   86:iload_1         
	//   45   87:iconst_1        
	//   46   88:iadd            
	//   47   89:istore_1        
				} while(true);
	//   48   90:goto            63
			}
			f.a(d, e, ((List) (bundle)));
	//   49   93:aload_0         
	//   50   94:getfield        #53  <Field MediaBrowserCompat$k f>
	//   51   97:aload_0         
	//   52   98:getfield        #55  <Field String d>
	//   53  101:aload_0         
	//   54  102:getfield        #57  <Field Bundle e>
	//   55  105:aload_2         
	//   56  106:invokevirtual   #62  <Method void MediaBrowserCompat$k.a(String, Bundle, List)>
			return;
	//   57  109:return          
		} else
		{
			f.a(d, e);
	//   58  110:aload_0         
	//   59  111:getfield        #53  <Field MediaBrowserCompat$k f>
	//   60  114:aload_0         
	//   61  115:getfield        #55  <Field String d>
	//   62  118:aload_0         
	//   63  119:getfield        #57  <Field Bundle e>
	//   64  122:invokevirtual   #65  <Method void MediaBrowserCompat$k.a(String, Bundle)>
			return;
	//   65  125:return          
		}
	}

	private final String d;
	private final Bundle e;
	private final MediaBrowserCompat.k f;
}
