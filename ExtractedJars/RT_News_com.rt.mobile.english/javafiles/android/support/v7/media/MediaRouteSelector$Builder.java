// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.os.Bundle;
import java.util.*;

// Referenced classes of package android.support.v7.media:
//			MediaRouteSelector

public static final class MediaRouteSelector$Builder
{

	public MediaRouteSelector$Builder addControlCategories(Collection collection)
	{
		if(collection == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("categories must not be null");
	//    2    4:new             #19  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #48  <String "categories must not be null">
	//    5   10:invokespecial   #24  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(!collection.isEmpty())
	//*   7   14:aload_1         
	//*   8   15:invokeinterface #51  <Method boolean Collection.isEmpty()>
	//*   9   20:ifne            56
			for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); addControlCategory((String)((Iterator) (collection)).next()));
	//   10   23:aload_1         
	//   11   24:invokeinterface #55  <Method Iterator Collection.iterator()>
	//   12   29:astore_1        
	//   13   30:aload_1         
	//   14   31:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//   15   36:ifeq            56
	//   16   39:aload_0         
	//   17   40:aload_1         
	//   18   41:invokeinterface #64  <Method Object Iterator.next()>
	//   19   46:checkcast       #66  <Class String>
	//   20   49:invokevirtual   #70  <Method MediaRouteSelector$Builder addControlCategory(String)>
	//   21   52:pop             
	//*  22   53:goto            30
		return this;
	//   23   56:aload_0         
	//   24   57:areturn         
	}

	public MediaRouteSelector$Builder addControlCategory(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("category must not be null");
	//    2    4:new             #19  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #75  <String "category must not be null">
	//    5   10:invokespecial   #24  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(mControlCategories == null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #43  <Field ArrayList mControlCategories>
	//*   9   18:ifnonnull       32
			mControlCategories = new ArrayList();
	//   10   21:aload_0         
	//   11   22:new             #38  <Class ArrayList>
	//   12   25:dup             
	//   13   26:invokespecial   #76  <Method void ArrayList()>
	//   14   29:putfield        #43  <Field ArrayList mControlCategories>
		if(!mControlCategories.contains(((Object) (s))))
	//*  15   32:aload_0         
	//*  16   33:getfield        #43  <Field ArrayList mControlCategories>
	//*  17   36:aload_1         
	//*  18   37:invokevirtual   #80  <Method boolean ArrayList.contains(Object)>
	//*  19   40:ifne            52
			mControlCategories.add(((Object) (s)));
	//   20   43:aload_0         
	//   21   44:getfield        #43  <Field ArrayList mControlCategories>
	//   22   47:aload_1         
	//   23   48:invokevirtual   #83  <Method boolean ArrayList.add(Object)>
	//   24   51:pop             
		return this;
	//   25   52:aload_0         
	//   26   53:areturn         
	}

	public MediaRouteSelector$Builder addSelector(MediaRouteSelector mediarouteselector)
	{
		if(mediarouteselector == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("selector must not be null");
	//    2    4:new             #19  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #21  <String "selector must not be null">
	//    5   10:invokespecial   #24  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			addControlCategories(((Collection) (mediarouteselector.getControlCategories())));
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #89  <Method List MediaRouteSelector.getControlCategories()>
	//   10   19:invokevirtual   #91  <Method MediaRouteSelector$Builder addControlCategories(Collection)>
	//   11   22:pop             
			return this;
	//   12   23:aload_0         
	//   13   24:areturn         
		}
	}

	public MediaRouteSelector build()
	{
		if(mControlCategories == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field ArrayList mControlCategories>
	//*   2    4:ifnonnull       11
		{
			return MediaRouteSelector.EMPTY;
	//    3    7:getstatic       #97  <Field MediaRouteSelector MediaRouteSelector.EMPTY>
	//    4   10:areturn         
		} else
		{
			Bundle bundle = new Bundle();
	//    5   11:new             #99  <Class Bundle>
	//    6   14:dup             
	//    7   15:invokespecial   #100 <Method void Bundle()>
	//    8   18:astore_1        
			bundle.putStringArrayList("controlCategories", mControlCategories);
	//    9   19:aload_1         
	//   10   20:ldc1            #102 <String "controlCategories">
	//   11   22:aload_0         
	//   12   23:getfield        #43  <Field ArrayList mControlCategories>
	//   13   26:invokevirtual   #106 <Method void Bundle.putStringArrayList(String, ArrayList)>
			return new MediaRouteSelector(bundle, ((List) (mControlCategories)));
	//   14   29:new             #6   <Class MediaRouteSelector>
	//   15   32:dup             
	//   16   33:aload_1         
	//   17   34:aload_0         
	//   18   35:getfield        #43  <Field ArrayList mControlCategories>
	//   19   38:invokespecial   #109 <Method void MediaRouteSelector(Bundle, List)>
	//   20   41:areturn         
		}
	}

	private ArrayList mControlCategories;

	public MediaRouteSelector$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public MediaRouteSelector$Builder(MediaRouteSelector mediarouteselector)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		if(mediarouteselector == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
			throw new IllegalArgumentException("selector must not be null");
	//    4    8:new             #19  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #21  <String "selector must not be null">
	//    7   14:invokespecial   #24  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		mediarouteselector.ensureControlCategories();
	//    9   18:aload_1         
	//   10   19:invokevirtual   #27  <Method void MediaRouteSelector.ensureControlCategories()>
		if(!mediarouteselector.mControlCategories.isEmpty())
	//*  11   22:aload_1         
	//*  12   23:getfield        #30  <Field List MediaRouteSelector.mControlCategories>
	//*  13   26:invokeinterface #36  <Method boolean List.isEmpty()>
	//*  14   31:ifne            49
			mControlCategories = new ArrayList(((Collection) (mediarouteselector.mControlCategories)));
	//   15   34:aload_0         
	//   16   35:new             #38  <Class ArrayList>
	//   17   38:dup             
	//   18   39:aload_1         
	//   19   40:getfield        #30  <Field List MediaRouteSelector.mControlCategories>
	//   20   43:invokespecial   #41  <Method void ArrayList(Collection)>
	//   21   46:putfield        #43  <Field ArrayList mControlCategories>
	//   22   49:return          
	}
}
