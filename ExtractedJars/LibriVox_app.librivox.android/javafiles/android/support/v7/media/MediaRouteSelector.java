// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.*;

public final class MediaRouteSelector
{

	MediaRouteSelector(Bundle bundle, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		mBundle = bundle;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field Bundle mBundle>
		mControlCategories = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #32  <Field List mControlCategories>
	//    8   14:return          
	}

	public static MediaRouteSelector fromBundle(Bundle bundle)
	{
		MediaRouteSelector mediarouteselector = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(bundle != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          16
			mediarouteselector = new MediaRouteSelector(bundle, ((List) (null)));
	//    4    6:new             #2   <Class MediaRouteSelector>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:invokespecial   #24  <Method void MediaRouteSelector(Bundle, List)>
	//    9   15:astore_1        
		return mediarouteselector;
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	public Bundle asBundle()
	{
		return mBundle;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Bundle mBundle>
	//    2    4:areturn         
	}

	public boolean contains(MediaRouteSelector mediarouteselector)
	{
		if(mediarouteselector != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          26
		{
			ensureControlCategories();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #41  <Method void ensureControlCategories()>
			mediarouteselector.ensureControlCategories();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #41  <Method void ensureControlCategories()>
			return mControlCategories.containsAll(((java.util.Collection) (mediarouteselector.mControlCategories)));
	//    6   12:aload_0         
	//    7   13:getfield        #32  <Field List mControlCategories>
	//    8   16:aload_1         
	//    9   17:getfield        #32  <Field List mControlCategories>
	//   10   20:invokeinterface #47  <Method boolean List.containsAll(java.util.Collection)>
	//   11   25:ireturn         
		} else
		{
			return false;
	//   12   26:iconst_0        
	//   13   27:ireturn         
		}
	}

	void ensureControlCategories()
	{
		if(mControlCategories == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field List mControlCategories>
	//*   2    4:ifnonnull       45
		{
			mControlCategories = ((List) (mBundle.getStringArrayList("controlCategories")));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #30  <Field Bundle mBundle>
	//    6   12:ldc1            #10  <String "controlCategories">
	//    7   14:invokevirtual   #51  <Method java.util.ArrayList Bundle.getStringArrayList(String)>
	//    8   17:putfield        #32  <Field List mControlCategories>
			List list = mControlCategories;
	//    9   20:aload_0         
	//   10   21:getfield        #32  <Field List mControlCategories>
	//   11   24:astore_1        
			if(list == null || list.isEmpty())
	//*  12   25:aload_1         
	//*  13   26:ifnull          38
	//*  14   29:aload_1         
	//*  15   30:invokeinterface #55  <Method boolean List.isEmpty()>
	//*  16   35:ifeq            45
				mControlCategories = Collections.emptyList();
	//   17   38:aload_0         
	//   18   39:invokestatic    #61  <Method List Collections.emptyList()>
	//   19   42:putfield        #32  <Field List mControlCategories>
		}
	//   20   45:return          
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof MediaRouteSelector)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class MediaRouteSelector>
	//*   2    4:ifeq            34
		{
			obj = ((Object) ((MediaRouteSelector)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class MediaRouteSelector>
	//    5   11:astore_1        
			ensureControlCategories();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #41  <Method void ensureControlCategories()>
			((MediaRouteSelector) (obj)).ensureControlCategories();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #41  <Method void ensureControlCategories()>
			return mControlCategories.equals(((Object) (((MediaRouteSelector) (obj)).mControlCategories)));
	//   10   20:aload_0         
	//   11   21:getfield        #32  <Field List mControlCategories>
	//   12   24:aload_1         
	//   13   25:getfield        #32  <Field List mControlCategories>
	//   14   28:invokeinterface #65  <Method boolean List.equals(Object)>
	//   15   33:ireturn         
		} else
		{
			return false;
	//   16   34:iconst_0        
	//   17   35:ireturn         
		}
	}

	public List getControlCategories()
	{
		ensureControlCategories();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method void ensureControlCategories()>
		return mControlCategories;
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field List mControlCategories>
	//    4    8:areturn         
	}

	public boolean hasControlCategory(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          54
		{
			ensureControlCategories();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #41  <Method void ensureControlCategories()>
			int j = mControlCategories.size();
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field List mControlCategories>
	//    6   12:invokeinterface #72  <Method int List.size()>
	//    7   17:istore_3        
			for(int i = 0; i < j; i++)
	//*   8   18:iconst_0        
	//*   9   19:istore_2        
	//*  10   20:iload_2         
	//*  11   21:iload_3         
	//*  12   22:icmpge          54
				if(((String)mControlCategories.get(i)).equals(((Object) (s))))
	//*  13   25:aload_0         
	//*  14   26:getfield        #32  <Field List mControlCategories>
	//*  15   29:iload_2         
	//*  16   30:invokeinterface #76  <Method Object List.get(int)>
	//*  17   35:checkcast       #78  <Class String>
	//*  18   38:aload_1         
	//*  19   39:invokevirtual   #79  <Method boolean String.equals(Object)>
	//*  20   42:ifeq            47
					return true;
	//   21   45:iconst_1        
	//   22   46:ireturn         

	//   23   47:iload_2         
	//   24   48:iconst_1        
	//   25   49:iadd            
	//   26   50:istore_2        
		}
	//*  27   51:goto            20
		return false;
	//   28   54:iconst_0        
	//   29   55:ireturn         
	}

	public int hashCode()
	{
		ensureControlCategories();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method void ensureControlCategories()>
		return mControlCategories.hashCode();
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field List mControlCategories>
	//    4    8:invokeinterface #82  <Method int List.hashCode()>
	//    5   13:ireturn         
	}

	public boolean isEmpty()
	{
		ensureControlCategories();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method void ensureControlCategories()>
		return mControlCategories.isEmpty();
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field List mControlCategories>
	//    4    8:invokeinterface #55  <Method boolean List.isEmpty()>
	//    5   13:ireturn         
	}

	public boolean isValid()
	{
		ensureControlCategories();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method void ensureControlCategories()>
		return !mControlCategories.contains(((Object) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field List mControlCategories>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #85  <Method boolean List.contains(Object)>
	//    6   14:ifeq            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public boolean matchesControlFilters(List list)
	{
		if(list != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          102
		{
			ensureControlCategories();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #41  <Method void ensureControlCategories()>
			int k = mControlCategories.size();
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field List mControlCategories>
	//    6   12:invokeinterface #72  <Method int List.size()>
	//    7   17:istore          4
			if(k != 0)
	//*   8   19:iload           4
	//*   9   21:ifeq            102
			{
				int l = list.size();
	//   10   24:aload_1         
	//   11   25:invokeinterface #72  <Method int List.size()>
	//   12   30:istore          5
label0:
				for(int i = 0; i < l; i++)
	//*  13   32:iconst_0        
	//*  14   33:istore_2        
	//*  15   34:iload_2         
	//*  16   35:iload           5
	//*  17   37:icmpge          102
				{
					IntentFilter intentfilter = (IntentFilter)list.get(i);
	//   18   40:aload_1         
	//   19   41:iload_2         
	//   20   42:invokeinterface #76  <Method Object List.get(int)>
	//   21   47:checkcast       #89  <Class IntentFilter>
	//   22   50:astore          6
					if(intentfilter == null)
						continue;
	//   23   52:aload           6
	//   24   54:ifnull          95
					int j = 0;
	//   25   57:iconst_0        
	//   26   58:istore_3        
					do
					{
						if(j >= k)
							continue label0;
	//   27   59:iload_3         
	//   28   60:iload           4
	//   29   62:icmpge          95
						if(intentfilter.hasCategory((String)mControlCategories.get(j)))
	//*  30   65:aload           6
	//*  31   67:aload_0         
	//*  32   68:getfield        #32  <Field List mControlCategories>
	//*  33   71:iload_3         
	//*  34   72:invokeinterface #76  <Method Object List.get(int)>
	//*  35   77:checkcast       #78  <Class String>
	//*  36   80:invokevirtual   #92  <Method boolean IntentFilter.hasCategory(String)>
	//*  37   83:ifeq            88
							return true;
	//   38   86:iconst_1        
	//   39   87:ireturn         
						j++;
	//   40   88:iload_3         
	//   41   89:iconst_1        
	//   42   90:iadd            
	//   43   91:istore_3        
					} while(true);
	//   44   92:goto            59
				}

	//   45   95:iload_2         
	//   46   96:iconst_1        
	//   47   97:iadd            
	//   48   98:istore_2        
			}
		}
	//*  49   99:goto            34
		return false;
	//   50  102:iconst_0        
	//   51  103:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #96  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #97  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("MediaRouteSelector{ ");
	//    4    8:aload_1         
	//    5    9:ldc1            #99  <String "MediaRouteSelector{ ">
	//    6   11:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("controlCategories=");
	//    8   15:aload_1         
	//    9   16:ldc1            #105 <String "controlCategories=">
	//   10   18:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(Arrays.toString(getControlCategories().toArray()));
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #107 <Method List getControlCategories()>
	//   15   27:invokeinterface #111 <Method Object[] List.toArray()>
	//   16   32:invokestatic    #116 <Method String Arrays.toString(Object[])>
	//   17   35:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
		stringbuilder.append(" }");
	//   19   39:aload_1         
	//   20   40:ldc1            #118 <String " }">
	//   21   42:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   22   45:pop             
		return stringbuilder.toString();
	//   23   46:aload_1         
	//   24   47:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   25   50:areturn         
	}

	public static final MediaRouteSelector EMPTY = new MediaRouteSelector(new Bundle(), ((List) (null)));
	static final String KEY_CONTROL_CATEGORIES = "controlCategories";
	private final Bundle mBundle;
	List mControlCategories;

	static 
	{
	//    0    0:new             #2   <Class MediaRouteSelector>
	//    1    3:dup             
	//    2    4:new             #18  <Class Bundle>
	//    3    7:dup             
	//    4    8:invokespecial   #21  <Method void Bundle()>
	//    5   11:aconst_null     
	//    6   12:invokespecial   #24  <Method void MediaRouteSelector(Bundle, List)>
	//    7   15:putstatic       #26  <Field MediaRouteSelector EMPTY>
	//*   8   18:return          
	}
}
