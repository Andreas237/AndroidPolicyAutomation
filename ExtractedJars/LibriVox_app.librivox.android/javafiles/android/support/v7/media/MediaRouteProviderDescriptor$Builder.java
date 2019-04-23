// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.os.Bundle;
import java.util.*;

// Referenced classes of package android.support.v7.media:
//			MediaRouteProviderDescriptor, MediaRouteDescriptor

public final class MediaRouteProviderDescriptor$Builder
{

	public MediaRouteProviderDescriptor$Builder addRoute(MediaRouteDescriptor mediaroutedescriptor)
	{
label0:
		{
label1:
			{
				if(mediaroutedescriptor == null)
					break label0;
	//    0    0:aload_1         
	//    1    1:ifnull          56
				ArrayList arraylist = mRoutes;
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field ArrayList mRoutes>
	//    4    8:astore_2        
				if(arraylist == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       27
					mRoutes = new ArrayList();
	//    7   13:aload_0         
	//    8   14:new             #39  <Class ArrayList>
	//    9   17:dup             
	//   10   18:invokespecial   #54  <Method void ArrayList()>
	//   11   21:putfield        #44  <Field ArrayList mRoutes>
				else
	//*  12   24:goto            35
				if(arraylist.contains(((Object) (mediaroutedescriptor))))
					break label1;
	//   13   27:aload_2         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #58  <Method boolean ArrayList.contains(Object)>
	//   16   32:ifne            46
				mRoutes.add(((Object) (mediaroutedescriptor)));
	//   17   35:aload_0         
	//   18   36:getfield        #44  <Field ArrayList mRoutes>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #61  <Method boolean ArrayList.add(Object)>
	//   21   43:pop             
				return this;
	//   22   44:aload_0         
	//   23   45:areturn         
			}
			throw new IllegalArgumentException("route descriptor already added");
	//   24   46:new             #46  <Class IllegalArgumentException>
	//   25   49:dup             
	//   26   50:ldc1            #63  <String "route descriptor already added">
	//   27   52:invokespecial   #51  <Method void IllegalArgumentException(String)>
	//   28   55:athrow          
		}
		throw new IllegalArgumentException("route must not be null");
	//   29   56:new             #46  <Class IllegalArgumentException>
	//   30   59:dup             
	//   31   60:ldc1            #65  <String "route must not be null">
	//   32   62:invokespecial   #51  <Method void IllegalArgumentException(String)>
	//   33   65:athrow          
	}

	public MediaRouteProviderDescriptor$Builder addRoutes(Collection collection)
	{
		if(collection != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          48
		{
			if(!collection.isEmpty())
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #70  <Method boolean Collection.isEmpty()>
	//*   4   10:ifne            46
				for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); addRoute((MediaRouteDescriptor)((Iterator) (collection)).next()));
	//    5   13:aload_1         
	//    6   14:invokeinterface #74  <Method Iterator Collection.iterator()>
	//    7   19:astore_1        
	//    8   20:aload_1         
	//    9   21:invokeinterface #79  <Method boolean Iterator.hasNext()>
	//   10   26:ifeq            46
	//   11   29:aload_0         
	//   12   30:aload_1         
	//   13   31:invokeinterface #83  <Method Object Iterator.next()>
	//   14   36:checkcast       #85  <Class MediaRouteDescriptor>
	//   15   39:invokevirtual   #87  <Method MediaRouteProviderDescriptor$Builder addRoute(MediaRouteDescriptor)>
	//   16   42:pop             
	//*  17   43:goto            20
			return this;
	//   18   46:aload_0         
	//   19   47:areturn         
		} else
		{
			throw new IllegalArgumentException("routes must not be null");
	//   20   48:new             #46  <Class IllegalArgumentException>
	//   21   51:dup             
	//   22   52:ldc1            #89  <String "routes must not be null">
	//   23   54:invokespecial   #51  <Method void IllegalArgumentException(String)>
	//   24   57:athrow          
		}
	}

	public MediaRouteProviderDescriptor build()
	{
		ArrayList arraylist = mRoutes;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field ArrayList mRoutes>
	//    2    4:astore_3        
		if(arraylist != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          66
		{
			int j = arraylist.size();
	//    5    9:aload_3         
	//    6   10:invokevirtual   #95  <Method int ArrayList.size()>
	//    7   13:istore_2        
			arraylist = new ArrayList(j);
	//    8   14:new             #39  <Class ArrayList>
	//    9   17:dup             
	//   10   18:iload_2         
	//   11   19:invokespecial   #98  <Method void ArrayList(int)>
	//   12   22:astore_3        
			for(int i = 0; i < j; i++)
	//*  13   23:iconst_0        
	//*  14   24:istore_1        
	//*  15   25:iload_1         
	//*  16   26:iload_2         
	//*  17   27:icmpge          56
				arraylist.add(((Object) (((MediaRouteDescriptor)mRoutes.get(i)).asBundle())));
	//   18   30:aload_3         
	//   19   31:aload_0         
	//   20   32:getfield        #44  <Field ArrayList mRoutes>
	//   21   35:iload_1         
	//   22   36:invokevirtual   #102 <Method Object ArrayList.get(int)>
	//   23   39:checkcast       #85  <Class MediaRouteDescriptor>
	//   24   42:invokevirtual   #106 <Method Bundle MediaRouteDescriptor.asBundle()>
	//   25   45:invokevirtual   #61  <Method boolean ArrayList.add(Object)>
	//   26   48:pop             

	//   27   49:iload_1         
	//   28   50:iconst_1        
	//   29   51:iadd            
	//   30   52:istore_1        
	//*  31   53:goto            25
			mBundle.putParcelableArrayList("routes", arraylist);
	//   32   56:aload_0         
	//   33   57:getfield        #17  <Field Bundle mBundle>
	//   34   60:ldc1            #108 <String "routes">
	//   35   62:aload_3         
	//   36   63:invokevirtual   #112 <Method void Bundle.putParcelableArrayList(String, ArrayList)>
		}
		return new MediaRouteProviderDescriptor(mBundle, ((List) (mRoutes)));
	//   37   66:new             #21  <Class MediaRouteProviderDescriptor>
	//   38   69:dup             
	//   39   70:aload_0         
	//   40   71:getfield        #17  <Field Bundle mBundle>
	//   41   74:aload_0         
	//   42   75:getfield        #44  <Field ArrayList mRoutes>
	//   43   78:invokespecial   #115 <Method void MediaRouteProviderDescriptor(Bundle, List)>
	//   44   81:areturn         
	}

	MediaRouteProviderDescriptor$Builder setRoutes(Collection collection)
	{
		if(collection != null && !collection.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          30
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #70  <Method boolean Collection.isEmpty()>
	//*   4   10:ifeq            16
	//*   5   13:goto            30
		{
			mRoutes = new ArrayList(collection);
	//    6   16:aload_0         
	//    7   17:new             #39  <Class ArrayList>
	//    8   20:dup             
	//    9   21:aload_1         
	//   10   22:invokespecial   #42  <Method void ArrayList(Collection)>
	//   11   25:putfield        #44  <Field ArrayList mRoutes>
			return this;
	//   12   28:aload_0         
	//   13   29:areturn         
		} else
		{
			mRoutes = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #44  <Field ArrayList mRoutes>
			mBundle.remove("routes");
	//   17   35:aload_0         
	//   18   36:getfield        #17  <Field Bundle mBundle>
	//   19   39:ldc1            #108 <String "routes">
	//   20   41:invokevirtual   #119 <Method void Bundle.remove(String)>
			return this;
	//   21   44:aload_0         
	//   22   45:areturn         
		}
	}

	private final Bundle mBundle;
	private ArrayList mRoutes;

	public MediaRouteProviderDescriptor$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		mBundle = new Bundle();
	//    2    4:aload_0         
	//    3    5:new             #14  <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void Bundle()>
	//    6   12:putfield        #17  <Field Bundle mBundle>
	//    7   15:return          
	}

	public MediaRouteProviderDescriptor$Builder(MediaRouteProviderDescriptor mediarouteproviderdescriptor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		if(mediarouteproviderdescriptor != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          55
		{
			mBundle = new Bundle(mediarouteproviderdescriptor.mBundle);
	//    4    8:aload_0         
	//    5    9:new             #14  <Class Bundle>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:getfield        #22  <Field Bundle MediaRouteProviderDescriptor.mBundle>
	//    9   17:invokespecial   #25  <Method void Bundle(Bundle)>
	//   10   20:putfield        #17  <Field Bundle mBundle>
			mediarouteproviderdescriptor.ensureRoutes();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #28  <Method void MediaRouteProviderDescriptor.ensureRoutes()>
			if(!mediarouteproviderdescriptor.mRoutes.isEmpty())
	//*  13   27:aload_1         
	//*  14   28:getfield        #31  <Field List MediaRouteProviderDescriptor.mRoutes>
	//*  15   31:invokeinterface #37  <Method boolean List.isEmpty()>
	//*  16   36:ifne            54
				mRoutes = new ArrayList(((Collection) (mediarouteproviderdescriptor.mRoutes)));
	//   17   39:aload_0         
	//   18   40:new             #39  <Class ArrayList>
	//   19   43:dup             
	//   20   44:aload_1         
	//   21   45:getfield        #31  <Field List MediaRouteProviderDescriptor.mRoutes>
	//   22   48:invokespecial   #42  <Method void ArrayList(Collection)>
	//   23   51:putfield        #44  <Field ArrayList mRoutes>
			return;
	//   24   54:return          
		} else
		{
			throw new IllegalArgumentException("descriptor must not be null");
	//   25   55:new             #46  <Class IllegalArgumentException>
	//   26   58:dup             
	//   27   59:ldc1            #48  <String "descriptor must not be null">
	//   28   61:invokespecial   #51  <Method void IllegalArgumentException(String)>
	//   29   64:athrow          
		}
	}
}
