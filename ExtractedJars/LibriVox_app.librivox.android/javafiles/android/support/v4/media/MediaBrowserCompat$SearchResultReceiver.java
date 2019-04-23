// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			v

class MediaBrowserCompat$SearchResultReceiver extends ResultReceiver
{

	protected void a(int i, Bundle bundle)
	{
		MediaSessionCompat.a(bundle);
	//    0    0:aload_2         
	//    1    1:invokestatic    #17  <Method void MediaSessionCompat.a(Bundle)>
		if(i == 0 && bundle != null && bundle.containsKey("search_results"))
	//*   2    4:iload_1         
	//*   3    5:ifne            101
	//*   4    8:aload_2         
	//*   5    9:ifnull          101
	//*   6   12:aload_2         
	//*   7   13:ldc1            #19  <String "search_results">
	//*   8   15:invokevirtual   #25  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifne            24
	//*  10   21:goto            101
		{
			android.os.Parcelable aparcelable[] = bundle.getParcelableArray("search_results");
	//   11   24:aload_2         
	//   12   25:ldc1            #19  <String "search_results">
	//   13   27:invokevirtual   #29  <Method android.os.Parcelable[] Bundle.getParcelableArray(String)>
	//   14   30:astore          5
			bundle = null;
	//   15   32:aconst_null     
	//   16   33:astore_2        
			if(aparcelable != null)
	//*  17   34:aload           5
	//*  18   36:ifnull          84
			{
				ArrayList arraylist = new ArrayList();
	//   19   39:new             #31  <Class ArrayList>
	//   20   42:dup             
	//   21   43:invokespecial   #35  <Method void ArrayList()>
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
	//   37   68:checkcast       #37  <Class MediaBrowserCompat$MediaItem>
	//   38   71:invokeinterface #43  <Method boolean List.add(Object)>
	//   39   76:pop             
					i++;
	//   40   77:iload_1         
	//   41   78:iconst_1        
	//   42   79:iadd            
	//   43   80:istore_1        
				} while(true);
	//   44   81:goto            54
			}
			f.a(d, e, ((List) (bundle)));
	//   45   84:aload_0         
	//   46   85:getfield        #45  <Field v f>
	//   47   88:aload_0         
	//   48   89:getfield        #47  <Field String d>
	//   49   92:aload_0         
	//   50   93:getfield        #49  <Field Bundle e>
	//   51   96:aload_2         
	//   52   97:invokevirtual   #54  <Method void v.a(String, Bundle, List)>
			return;
	//   53  100:return          
		} else
		{
			f.a(d, e);
	//   54  101:aload_0         
	//   55  102:getfield        #45  <Field v f>
	//   56  105:aload_0         
	//   57  106:getfield        #47  <Field String d>
	//   58  109:aload_0         
	//   59  110:getfield        #49  <Field Bundle e>
	//   60  113:invokevirtual   #57  <Method void v.a(String, Bundle)>
			return;
	//   61  116:return          
		}
	}

	private final String d;
	private final Bundle e;
	private final v f;
}
