// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.os.Bundle;
import java.util.*;

// Referenced classes of package android.support.v7.media:
//			MediaRouteProviderDescriptor, MediaRouteDescriptor

public static final class MediaRouteProviderDescriptor$Builder
{

	public MediaRouteProviderDescriptor$Builder addRoute(MediaRouteDescriptor mediaroutedescriptor)
	{
		if(mediaroutedescriptor == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("route must not be null");
	//    2    4:new             #25  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #61  <String "route must not be null">
	//    5   10:invokespecial   #30  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(mRoutes == null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #57  <Field ArrayList mRoutes>
	//*   9   18:ifnonnull       35
			mRoutes = new ArrayList();
	//   10   21:aload_0         
	//   11   22:new             #52  <Class ArrayList>
	//   12   25:dup             
	//   13   26:invokespecial   #62  <Method void ArrayList()>
	//   14   29:putfield        #57  <Field ArrayList mRoutes>
		else
	//*  15   32:goto            56
		if(mRoutes.contains(((Object) (mediaroutedescriptor))))
	//*  16   35:aload_0         
	//*  17   36:getfield        #57  <Field ArrayList mRoutes>
	//*  18   39:aload_1         
	//*  19   40:invokevirtual   #66  <Method boolean ArrayList.contains(Object)>
	//*  20   43:ifeq            56
			throw new IllegalArgumentException("route descriptor already added");
	//   21   46:new             #25  <Class IllegalArgumentException>
	//   22   49:dup             
	//   23   50:ldc1            #68  <String "route descriptor already added">
	//   24   52:invokespecial   #30  <Method void IllegalArgumentException(String)>
	//   25   55:athrow          
		mRoutes.add(((Object) (mediaroutedescriptor)));
	//   26   56:aload_0         
	//   27   57:getfield        #57  <Field ArrayList mRoutes>
	//   28   60:aload_1         
	//   29   61:invokevirtual   #71  <Method boolean ArrayList.add(Object)>
	//   30   64:pop             
		return this;
	//   31   65:aload_0         
	//   32   66:areturn         
	}

	public MediaRouteProviderDescriptor$Builder addRoutes(Collection collection)
	{
		if(collection == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("routes must not be null");
	//    2    4:new             #25  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #75  <String "routes must not be null">
	//    5   10:invokespecial   #30  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(!collection.isEmpty())
	//*   7   14:aload_1         
	//*   8   15:invokeinterface #78  <Method boolean Collection.isEmpty()>
	//*   9   20:ifne            56
			for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); addRoute((MediaRouteDescriptor)((Iterator) (collection)).next()));
	//   10   23:aload_1         
	//   11   24:invokeinterface #82  <Method Iterator Collection.iterator()>
	//   12   29:astore_1        
	//   13   30:aload_1         
	//   14   31:invokeinterface #87  <Method boolean Iterator.hasNext()>
	//   15   36:ifeq            56
	//   16   39:aload_0         
	//   17   40:aload_1         
	//   18   41:invokeinterface #91  <Method Object Iterator.next()>
	//   19   46:checkcast       #93  <Class MediaRouteDescriptor>
	//   20   49:invokevirtual   #95  <Method MediaRouteProviderDescriptor$Builder addRoute(MediaRouteDescriptor)>
	//   21   52:pop             
	//*  22   53:goto            30
		return this;
	//   23   56:aload_0         
	//   24   57:areturn         
	}

	public MediaRouteProviderDescriptor build()
	{
		if(mRoutes != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field ArrayList mRoutes>
	//*   2    4:ifnull          67
		{
			int j = mRoutes.size();
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field ArrayList mRoutes>
	//    5   11:invokevirtual   #103 <Method int ArrayList.size()>
	//    6   14:istore_2        
			ArrayList arraylist = new ArrayList(j);
	//    7   15:new             #52  <Class ArrayList>
	//    8   18:dup             
	//    9   19:iload_2         
	//   10   20:invokespecial   #106 <Method void ArrayList(int)>
	//   11   23:astore_3        
			for(int i = 0; i < j; i++)
	//*  12   24:iconst_0        
	//*  13   25:istore_1        
	//*  14   26:iload_1         
	//*  15   27:iload_2         
	//*  16   28:icmpge          57
				arraylist.add(((Object) (((MediaRouteDescriptor)mRoutes.get(i)).asBundle())));
	//   17   31:aload_3         
	//   18   32:aload_0         
	//   19   33:getfield        #57  <Field ArrayList mRoutes>
	//   20   36:iload_1         
	//   21   37:invokevirtual   #110 <Method Object ArrayList.get(int)>
	//   22   40:checkcast       #93  <Class MediaRouteDescriptor>
	//   23   43:invokevirtual   #114 <Method Bundle MediaRouteDescriptor.asBundle()>
	//   24   46:invokevirtual   #71  <Method boolean ArrayList.add(Object)>
	//   25   49:pop             

	//   26   50:iload_1         
	//   27   51:iconst_1        
	//   28   52:iadd            
	//   29   53:istore_1        
	//*  30   54:goto            26
			mBundle.putParcelableArrayList("routes", arraylist);
	//   31   57:aload_0         
	//   32   58:getfield        #21  <Field Bundle mBundle>
	//   33   61:ldc1            #116 <String "routes">
	//   34   63:aload_3         
	//   35   64:invokevirtual   #120 <Method void Bundle.putParcelableArrayList(String, ArrayList)>
		}
		return new MediaRouteProviderDescriptor(mBundle, ((List) (mRoutes)), ((MediaRouteProviderDescriptor._cls1) (null)));
	//   36   67:new             #6   <Class MediaRouteProviderDescriptor>
	//   37   70:dup             
	//   38   71:aload_0         
	//   39   72:getfield        #21  <Field Bundle mBundle>
	//   40   75:aload_0         
	//   41   76:getfield        #57  <Field ArrayList mRoutes>
	//   42   79:aconst_null     
	//   43   80:invokespecial   #123 <Method void MediaRouteProviderDescriptor(Bundle, List, MediaRouteProviderDescriptor$1)>
	//   44   83:areturn         
	}

	MediaRouteProviderDescriptor$Builder setRoutes(Collection collection)
	{
		if(collection != null && !collection.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          30
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #78  <Method boolean Collection.isEmpty()>
	//*   4   10:ifeq            16
	//*   5   13:goto            30
		{
			mRoutes = new ArrayList(collection);
	//    6   16:aload_0         
	//    7   17:new             #52  <Class ArrayList>
	//    8   20:dup             
	//    9   21:aload_1         
	//   10   22:invokespecial   #55  <Method void ArrayList(Collection)>
	//   11   25:putfield        #57  <Field ArrayList mRoutes>
			return this;
	//   12   28:aload_0         
	//   13   29:areturn         
		} else
		{
			mRoutes = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #57  <Field ArrayList mRoutes>
			mBundle.remove("routes");
	//   17   35:aload_0         
	//   18   36:getfield        #21  <Field Bundle mBundle>
	//   19   39:ldc1            #116 <String "routes">
	//   20   41:invokevirtual   #127 <Method void Bundle.remove(String)>
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
	//    1    1:invokespecial   #16  <Method void Object()>
		mBundle = new Bundle();
	//    2    4:aload_0         
	//    3    5:new             #18  <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void Bundle()>
	//    6   12:putfield        #21  <Field Bundle mBundle>
	//    7   15:return          
	}

	public MediaRouteProviderDescriptor$Builder(MediaRouteProviderDescriptor mediarouteproviderdescriptor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		if(mediarouteproviderdescriptor == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
			throw new IllegalArgumentException("descriptor must not be null");
	//    4    8:new             #25  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #27  <String "descriptor must not be null">
	//    7   14:invokespecial   #30  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		mBundle = new Bundle(MediaRouteProviderDescriptor.access$000(mediarouteproviderdescriptor));
	//    9   18:aload_0         
	//   10   19:new             #18  <Class Bundle>
	//   11   22:dup             
	//   12   23:aload_1         
	//   13   24:invokestatic    #34  <Method Bundle MediaRouteProviderDescriptor.access$000(MediaRouteProviderDescriptor)>
	//   14   27:invokespecial   #37  <Method void Bundle(Bundle)>
	//   15   30:putfield        #21  <Field Bundle mBundle>
		MediaRouteProviderDescriptor.access$100(mediarouteproviderdescriptor);
	//   16   33:aload_1         
	//   17   34:invokestatic    #40  <Method void MediaRouteProviderDescriptor.access$100(MediaRouteProviderDescriptor)>
		if(!MediaRouteProviderDescriptor.access$200(mediarouteproviderdescriptor).isEmpty())
	//*  18   37:aload_1         
	//*  19   38:invokestatic    #44  <Method List MediaRouteProviderDescriptor.access$200(MediaRouteProviderDescriptor)>
	//*  20   41:invokeinterface #50  <Method boolean List.isEmpty()>
	//*  21   46:ifne            64
			mRoutes = new ArrayList(((Collection) (MediaRouteProviderDescriptor.access$200(mediarouteproviderdescriptor))));
	//   22   49:aload_0         
	//   23   50:new             #52  <Class ArrayList>
	//   24   53:dup             
	//   25   54:aload_1         
	//   26   55:invokestatic    #44  <Method List MediaRouteProviderDescriptor.access$200(MediaRouteProviderDescriptor)>
	//   27   58:invokespecial   #55  <Method void ArrayList(Collection)>
	//   28   61:putfield        #57  <Field ArrayList mRoutes>
	//   29   64:return          
	}
}
