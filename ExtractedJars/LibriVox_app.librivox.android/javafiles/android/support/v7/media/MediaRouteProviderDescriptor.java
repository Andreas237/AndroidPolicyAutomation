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

	MediaRouteProviderDescriptor(Bundle bundle, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mBundle = bundle;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Bundle mBundle>
		mRoutes = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field List mRoutes>
	//    8   14:return          
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
	//    8   12:invokespecial   #26  <Method void MediaRouteProviderDescriptor(Bundle, List)>
	//    9   15:astore_1        
		return mediarouteproviderdescriptor;
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	public Bundle asBundle()
	{
		return mBundle;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Bundle mBundle>
	//    2    4:areturn         
	}

	void ensureRoutes()
	{
		if(mRoutes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field List mRoutes>
	//*   2    4:ifnonnull       90
		{
			ArrayList arraylist = mBundle.getParcelableArrayList("routes");
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field Bundle mBundle>
	//    5   11:ldc1            #8   <String "routes">
	//    6   13:invokevirtual   #35  <Method ArrayList Bundle.getParcelableArrayList(String)>
	//    7   16:astore_3        
			if(arraylist != null && !arraylist.isEmpty())
	//*   8   17:aload_3         
	//*   9   18:ifnull          83
	//*  10   21:aload_3         
	//*  11   22:invokevirtual   #41  <Method boolean ArrayList.isEmpty()>
	//*  12   25:ifeq            31
	//*  13   28:goto            83
			{
				int j = arraylist.size();
	//   14   31:aload_3         
	//   15   32:invokevirtual   #45  <Method int ArrayList.size()>
	//   16   35:istore_2        
				mRoutes = ((List) (new ArrayList(j)));
	//   17   36:aload_0         
	//   18   37:new             #37  <Class ArrayList>
	//   19   40:dup             
	//   20   41:iload_2         
	//   21   42:invokespecial   #48  <Method void ArrayList(int)>
	//   22   45:putfield        #21  <Field List mRoutes>
				for(int i = 0; i < j; i++)
	//*  23   48:iconst_0        
	//*  24   49:istore_1        
	//*  25   50:iload_1         
	//*  26   51:iload_2         
	//*  27   52:icmpge          90
					mRoutes.add(((Object) (MediaRouteDescriptor.fromBundle((Bundle)arraylist.get(i)))));
	//   28   55:aload_0         
	//   29   56:getfield        #21  <Field List mRoutes>
	//   30   59:aload_3         
	//   31   60:iload_1         
	//   32   61:invokevirtual   #52  <Method Object ArrayList.get(int)>
	//   33   64:checkcast       #31  <Class Bundle>
	//   34   67:invokestatic    #57  <Method MediaRouteDescriptor MediaRouteDescriptor.fromBundle(Bundle)>
	//   35   70:invokeinterface #63  <Method boolean List.add(Object)>
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
	//   43   84:invokestatic    #69  <Method List Collections.emptyList()>
	//   44   87:putfield        #21  <Field List mRoutes>
			}
		}
	//   45   90:return          
	}

	public List getRoutes()
	{
		ensureRoutes();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method void ensureRoutes()>
		return mRoutes;
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field List mRoutes>
	//    4    8:areturn         
	}

	public boolean isValid()
	{
		ensureRoutes();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method void ensureRoutes()>
		int j = mRoutes.size();
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field List mRoutes>
	//    4    8:invokeinterface #74  <Method int List.size()>
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
	//   12   22:getfield        #21  <Field List mRoutes>
	//   13   25:iload_1         
	//   14   26:invokeinterface #75  <Method Object List.get(int)>
	//   15   31:checkcast       #54  <Class MediaRouteDescriptor>
	//   16   34:astore_3        
			if(mediaroutedescriptor != null)
	//*  17   35:aload_3         
	//*  18   36:ifnull          55
			{
				if(!mediaroutedescriptor.isValid())
	//*  19   39:aload_3         
	//*  20   40:invokevirtual   #77  <Method boolean MediaRouteDescriptor.isValid()>
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
	//    0    0:new             #81  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #82  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("MediaRouteProviderDescriptor{ ");
	//    4    8:aload_1         
	//    5    9:ldc1            #84  <String "MediaRouteProviderDescriptor{ ">
	//    6   11:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("routes=");
	//    8   15:aload_1         
	//    9   16:ldc1            #90  <String "routes=">
	//   10   18:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(Arrays.toString(getRoutes().toArray()));
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #92  <Method List getRoutes()>
	//   15   27:invokeinterface #96  <Method Object[] List.toArray()>
	//   16   32:invokestatic    #101 <Method String Arrays.toString(Object[])>
	//   17   35:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
		stringbuilder.append(", isValid=");
	//   19   39:aload_1         
	//   20   40:ldc1            #103 <String ", isValid=">
	//   21   42:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   22   45:pop             
		stringbuilder.append(isValid());
	//   23   46:aload_1         
	//   24   47:aload_0         
	//   25   48:invokevirtual   #104 <Method boolean isValid()>
	//   26   51:invokevirtual   #107 <Method StringBuilder StringBuilder.append(boolean)>
	//   27   54:pop             
		stringbuilder.append(" }");
	//   28   55:aload_1         
	//   29   56:ldc1            #109 <String " }">
	//   30   58:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   31   61:pop             
		return stringbuilder.toString();
	//   32   62:aload_1         
	//   33   63:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   34   66:areturn         
	}

	private static final String KEY_ROUTES = "routes";
	final Bundle mBundle;
	List mRoutes;
}
