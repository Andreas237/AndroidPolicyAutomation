// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.os.Bundle;
import java.util.*;

// Referenced classes of package android.support.v7.media:
//			MediaRouteDescriptor

public final class MediaRouteProviderDescriptor
{
	public static final class Builder
	{

		public Builder addRoute(MediaRouteDescriptor mediaroutedescriptor)
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

		public Builder addRoutes(Collection collection)
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
			return new MediaRouteProviderDescriptor(mBundle, ((List) (mRoutes)));
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

		Builder setRoutes(Collection collection)
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

		public Builder()
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

		public Builder(MediaRouteProviderDescriptor mediarouteproviderdescriptor)
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
			mBundle = new Bundle(mediarouteproviderdescriptor.mBundle);
		//    9   18:aload_0         
		//   10   19:new             #18  <Class Bundle>
		//   11   22:dup             
		//   12   23:aload_1         
		//   13   24:invokestatic    #34  <Method Bundle MediaRouteProviderDescriptor.access$000(MediaRouteProviderDescriptor)>
		//   14   27:invokespecial   #37  <Method void Bundle(Bundle)>
		//   15   30:putfield        #21  <Field Bundle mBundle>
			mediarouteproviderdescriptor.ensureRoutes();
		//   16   33:aload_1         
		//   17   34:invokestatic    #40  <Method void MediaRouteProviderDescriptor.access$100(MediaRouteProviderDescriptor)>
			if(!mediarouteproviderdescriptor.mRoutes.isEmpty())
		//*  18   37:aload_1         
		//*  19   38:invokestatic    #44  <Method List MediaRouteProviderDescriptor.access$200(MediaRouteProviderDescriptor)>
		//*  20   41:invokeinterface #50  <Method boolean List.isEmpty()>
		//*  21   46:ifne            64
				mRoutes = new ArrayList(((Collection) (mediarouteproviderdescriptor.mRoutes)));
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


	private MediaRouteProviderDescriptor(Bundle bundle, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		mBundle = bundle;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field Bundle mBundle>
		mRoutes = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field List mRoutes>
	//    8   14:return          
	}


	private void ensureRoutes()
	{
		if(mRoutes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field List mRoutes>
	//*   2    4:ifnonnull       90
		{
			ArrayList arraylist = mBundle.getParcelableArrayList("routes");
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field Bundle mBundle>
	//    5   11:ldc1            #13  <String "routes">
	//    6   13:invokevirtual   #48  <Method ArrayList Bundle.getParcelableArrayList(String)>
	//    7   16:astore_3        
			if(arraylist != null && !arraylist.isEmpty())
	//*   8   17:aload_3         
	//*   9   18:ifnull          83
	//*  10   21:aload_3         
	//*  11   22:invokevirtual   #54  <Method boolean ArrayList.isEmpty()>
	//*  12   25:ifeq            31
	//*  13   28:goto            83
			{
				int j = arraylist.size();
	//   14   31:aload_3         
	//   15   32:invokevirtual   #58  <Method int ArrayList.size()>
	//   16   35:istore_2        
				mRoutes = ((List) (new ArrayList(j)));
	//   17   36:aload_0         
	//   18   37:new             #50  <Class ArrayList>
	//   19   40:dup             
	//   20   41:iload_2         
	//   21   42:invokespecial   #61  <Method void ArrayList(int)>
	//   22   45:putfield        #27  <Field List mRoutes>
				for(int i = 0; i < j; i++)
	//*  23   48:iconst_0        
	//*  24   49:istore_1        
	//*  25   50:iload_1         
	//*  26   51:iload_2         
	//*  27   52:icmpge          90
					mRoutes.add(((Object) (MediaRouteDescriptor.fromBundle((Bundle)arraylist.get(i)))));
	//   28   55:aload_0         
	//   29   56:getfield        #27  <Field List mRoutes>
	//   30   59:aload_3         
	//   31   60:iload_1         
	//   32   61:invokevirtual   #65  <Method Object ArrayList.get(int)>
	//   33   64:checkcast       #44  <Class Bundle>
	//   34   67:invokestatic    #71  <Method MediaRouteDescriptor MediaRouteDescriptor.fromBundle(Bundle)>
	//   35   70:invokeinterface #77  <Method boolean List.add(Object)>
	//   36   75:pop             

	//   37   76:iload_1         
	//   38   77:iconst_1        
	//   39   78:iadd            
	//   40   79:istore_1        
			} else
	//*  41   80:goto            50
			{
				mRoutes = Collections.emptyList();
	//   42   83:aload_0         
	//   43   84:invokestatic    #83  <Method List Collections.emptyList()>
	//   44   87:putfield        #27  <Field List mRoutes>
			}
		}
	//   45   90:return          
	}

	public static MediaRouteProviderDescriptor fromBundle(Bundle bundle)
	{
		MediaRouteProviderDescriptor mediarouteproviderdescriptor = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(bundle != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          16
			mediarouteproviderdescriptor = new MediaRouteProviderDescriptor(bundle, ((List) (null)));
	//    4    6:new             #2   <Class MediaRouteProviderDescriptor>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:invokespecial   #33  <Method void MediaRouteProviderDescriptor(Bundle, List)>
	//    9   15:astore_1        
		return mediarouteproviderdescriptor;
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	public Bundle asBundle()
	{
		return mBundle;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Bundle mBundle>
	//    2    4:areturn         
	}

	public List getRoutes()
	{
		ensureRoutes();
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void ensureRoutes()>
		return mRoutes;
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field List mRoutes>
	//    4    8:areturn         
	}

	public boolean isValid()
	{
		ensureRoutes();
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void ensureRoutes()>
		int j = mRoutes.size();
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field List mRoutes>
	//    4    8:invokeinterface #90  <Method int List.size()>
	//    5   13:istore_2        
		for(int i = 0; i < j;)
	//*   6   14:iconst_0        
	//*   7   15:istore_1        
	//*   8   16:iload_1         
	//*   9   17:iload_2         
	//*  10   18:icmpge          57
		{
			MediaRouteDescriptor mediaroutedescriptor = (MediaRouteDescriptor)mRoutes.get(i);
	//   11   21:aload_0         
	//   12   22:getfield        #27  <Field List mRoutes>
	//   13   25:iload_1         
	//   14   26:invokeinterface #91  <Method Object List.get(int)>
	//   15   31:checkcast       #67  <Class MediaRouteDescriptor>
	//   16   34:astore_3        
			if(mediaroutedescriptor != null)
	//*  17   35:aload_3         
	//*  18   36:ifnull          55
			{
				if(!mediaroutedescriptor.isValid())
	//*  19   39:aload_3         
	//*  20   40:invokevirtual   #93  <Method boolean MediaRouteDescriptor.isValid()>
	//*  21   43:ifne            48
					return false;
	//   22   46:iconst_0        
	//   23   47:ireturn         
				i++;
	//   24   48:iload_1         
	//   25   49:iconst_1        
	//   26   50:iadd            
	//   27   51:istore_1        
			} else
	//*  28   52:goto            16
			{
				return false;
	//   29   55:iconst_0        
	//   30   56:ireturn         
			}
		}

		return true;
	//   31   57:iconst_1        
	//   32   58:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #97  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("MediaRouteProviderDescriptor{ ");
	//    4    8:aload_1         
	//    5    9:ldc1            #100 <String "MediaRouteProviderDescriptor{ ">
	//    6   11:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("routes=");
	//    8   15:aload_1         
	//    9   16:ldc1            #106 <String "routes=">
	//   10   18:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(Arrays.toString(getRoutes().toArray()));
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #108 <Method List getRoutes()>
	//   15   27:invokeinterface #112 <Method Object[] List.toArray()>
	//   16   32:invokestatic    #117 <Method String Arrays.toString(Object[])>
	//   17   35:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
		stringbuilder.append(", isValid=");
	//   19   39:aload_1         
	//   20   40:ldc1            #119 <String ", isValid=">
	//   21   42:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   22   45:pop             
		stringbuilder.append(isValid());
	//   23   46:aload_1         
	//   24   47:aload_0         
	//   25   48:invokevirtual   #120 <Method boolean isValid()>
	//   26   51:invokevirtual   #123 <Method StringBuilder StringBuilder.append(boolean)>
	//   27   54:pop             
		stringbuilder.append(" }");
	//   28   55:aload_1         
	//   29   56:ldc1            #125 <String " }">
	//   30   58:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   31   61:pop             
		return stringbuilder.toString();
	//   32   62:aload_1         
	//   33   63:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   34   66:areturn         
	}

	private static final String KEY_ROUTES = "routes";
	private final Bundle mBundle;
	private List mRoutes;


/*
	static Bundle access$000(MediaRouteProviderDescriptor mediarouteproviderdescriptor)
	{
		return mediarouteproviderdescriptor.mBundle;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Bundle mBundle>
	//    2    4:areturn         
	}

*/


/*
	static void access$100(MediaRouteProviderDescriptor mediarouteproviderdescriptor)
	{
		mediarouteproviderdescriptor.ensureRoutes();
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void ensureRoutes()>
		return;
	//    2    4:return          
	}

*/


/*
	static List access$200(MediaRouteProviderDescriptor mediarouteproviderdescriptor)
	{
		return mediarouteproviderdescriptor.mRoutes;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field List mRoutes>
	//    2    4:areturn         
	}

*/
}
