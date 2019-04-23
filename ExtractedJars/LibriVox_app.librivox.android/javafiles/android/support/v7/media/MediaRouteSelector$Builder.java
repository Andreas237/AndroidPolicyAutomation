// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.os.Bundle;
import java.util.*;

// Referenced classes of package android.support.v7.media:
//			MediaRouteSelector

public final class MediaRouteSelector$Builder
{

	public MediaRouteSelector$Builder addControlCategories(Collection collection)
	{
		if(collection != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          48
		{
			if(!collection.isEmpty())
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #45  <Method boolean Collection.isEmpty()>
	//*   4   10:ifne            46
				for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); addControlCategory((String)((Iterator) (collection)).next()));
	//    5   13:aload_1         
	//    6   14:invokeinterface #49  <Method Iterator Collection.iterator()>
	//    7   19:astore_1        
	//    8   20:aload_1         
	//    9   21:invokeinterface #54  <Method boolean Iterator.hasNext()>
	//   10   26:ifeq            46
	//   11   29:aload_0         
	//   12   30:aload_1         
	//   13   31:invokeinterface #58  <Method Object Iterator.next()>
	//   14   36:checkcast       #60  <Class String>
	//   15   39:invokevirtual   #64  <Method MediaRouteSelector$Builder addControlCategory(String)>
	//   16   42:pop             
	//*  17   43:goto            20
			return this;
	//   18   46:aload_0         
	//   19   47:areturn         
		} else
		{
			throw new IllegalArgumentException("categories must not be null");
	//   20   48:new             #35  <Class IllegalArgumentException>
	//   21   51:dup             
	//   22   52:ldc1            #66  <String "categories must not be null">
	//   23   54:invokespecial   #40  <Method void IllegalArgumentException(String)>
	//   24   57:athrow          
		}
	}

	public MediaRouteSelector$Builder addControlCategory(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          44
		{
			if(mControlCategories == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #33  <Field ArrayList mControlCategories>
	//*   4    8:ifnonnull       22
				mControlCategories = new ArrayList();
	//    5   11:aload_0         
	//    6   12:new             #28  <Class ArrayList>
	//    7   15:dup             
	//    8   16:invokespecial   #67  <Method void ArrayList()>
	//    9   19:putfield        #33  <Field ArrayList mControlCategories>
			if(!mControlCategories.contains(((Object) (s))))
	//*  10   22:aload_0         
	//*  11   23:getfield        #33  <Field ArrayList mControlCategories>
	//*  12   26:aload_1         
	//*  13   27:invokevirtual   #71  <Method boolean ArrayList.contains(Object)>
	//*  14   30:ifne            42
				mControlCategories.add(((Object) (s)));
	//   15   33:aload_0         
	//   16   34:getfield        #33  <Field ArrayList mControlCategories>
	//   17   37:aload_1         
	//   18   38:invokevirtual   #74  <Method boolean ArrayList.add(Object)>
	//   19   41:pop             
			return this;
	//   20   42:aload_0         
	//   21   43:areturn         
		} else
		{
			throw new IllegalArgumentException("category must not be null");
	//   22   44:new             #35  <Class IllegalArgumentException>
	//   23   47:dup             
	//   24   48:ldc1            #76  <String "category must not be null">
	//   25   50:invokespecial   #40  <Method void IllegalArgumentException(String)>
	//   26   53:athrow          
		}
	}

	public MediaRouteSelector$Builder addSelector(MediaRouteSelector mediarouteselector)
	{
		if(mediarouteselector != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
		{
			addControlCategories(((Collection) (mediarouteselector.getControlCategories())));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #82  <Method List MediaRouteSelector.getControlCategories()>
	//    5    9:invokevirtual   #84  <Method MediaRouteSelector$Builder addControlCategories(Collection)>
	//    6   12:pop             
			return this;
	//    7   13:aload_0         
	//    8   14:areturn         
		} else
		{
			throw new IllegalArgumentException("selector must not be null");
	//    9   15:new             #35  <Class IllegalArgumentException>
	//   10   18:dup             
	//   11   19:ldc1            #37  <String "selector must not be null">
	//   12   21:invokespecial   #40  <Method void IllegalArgumentException(String)>
	//   13   24:athrow          
		}
	}

	public MediaRouteSelector build()
	{
		if(mControlCategories == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field ArrayList mControlCategories>
	//*   2    4:ifnonnull       11
		{
			return MediaRouteSelector.EMPTY;
	//    3    7:getstatic       #90  <Field MediaRouteSelector MediaRouteSelector.EMPTY>
	//    4   10:areturn         
		} else
		{
			Bundle bundle = new Bundle();
	//    5   11:new             #92  <Class Bundle>
	//    6   14:dup             
	//    7   15:invokespecial   #93  <Method void Bundle()>
	//    8   18:astore_1        
			bundle.putStringArrayList("controlCategories", mControlCategories);
	//    9   19:aload_1         
	//   10   20:ldc1            #95  <String "controlCategories">
	//   11   22:aload_0         
	//   12   23:getfield        #33  <Field ArrayList mControlCategories>
	//   13   26:invokevirtual   #99  <Method void Bundle.putStringArrayList(String, ArrayList)>
			return new MediaRouteSelector(bundle, ((List) (mControlCategories)));
	//   14   29:new             #14  <Class MediaRouteSelector>
	//   15   32:dup             
	//   16   33:aload_1         
	//   17   34:aload_0         
	//   18   35:getfield        #33  <Field ArrayList mControlCategories>
	//   19   38:invokespecial   #102 <Method void MediaRouteSelector(Bundle, List)>
	//   20   41:areturn         
		}
	}

	private ArrayList mControlCategories;

	public MediaRouteSelector$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public MediaRouteSelector$Builder(MediaRouteSelector mediarouteselector)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
		if(mediarouteselector != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          40
		{
			mediarouteselector.ensureControlCategories();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #17  <Method void MediaRouteSelector.ensureControlCategories()>
			if(!mediarouteselector.mControlCategories.isEmpty())
	//*   6   12:aload_1         
	//*   7   13:getfield        #20  <Field List MediaRouteSelector.mControlCategories>
	//*   8   16:invokeinterface #26  <Method boolean List.isEmpty()>
	//*   9   21:ifne            39
				mControlCategories = new ArrayList(((Collection) (mediarouteselector.mControlCategories)));
	//   10   24:aload_0         
	//   11   25:new             #28  <Class ArrayList>
	//   12   28:dup             
	//   13   29:aload_1         
	//   14   30:getfield        #20  <Field List MediaRouteSelector.mControlCategories>
	//   15   33:invokespecial   #31  <Method void ArrayList(Collection)>
	//   16   36:putfield        #33  <Field ArrayList mControlCategories>
			return;
	//   17   39:return          
		} else
		{
			throw new IllegalArgumentException("selector must not be null");
	//   18   40:new             #35  <Class IllegalArgumentException>
	//   19   43:dup             
	//   20   44:ldc1            #37  <String "selector must not be null">
	//   21   46:invokespecial   #40  <Method void IllegalArgumentException(String)>
	//   22   49:athrow          
		}
	}
}
