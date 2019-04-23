// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.util.Log;
import android.view.View;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package android.databinding:
//			DataBinderMapper, DataBindingComponent, ViewDataBinding

public class MergedDataBinderMapper extends DataBinderMapper
{

	public MergedDataBinderMapper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void DataBinderMapper()>
		mExistingMappers = ((Set) (new HashSet()));
	//    2    4:aload_0         
	//    3    5:new             #22  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void HashSet()>
	//    6   12:putfield        #25  <Field Set mExistingMappers>
		mMappers = ((List) (new CopyOnWriteArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #27  <Class CopyOnWriteArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #28  <Method void CopyOnWriteArrayList()>
	//   11   23:putfield        #30  <Field List mMappers>
		mFeatureBindingMappers = ((List) (new CopyOnWriteArrayList()));
	//   12   26:aload_0         
	//   13   27:new             #27  <Class CopyOnWriteArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #28  <Method void CopyOnWriteArrayList()>
	//   16   34:putfield        #32  <Field List mFeatureBindingMappers>
	//   17   37:return          
	}

	private boolean loadFeatures()
	{
		boolean flag;
		Iterator iterator;
		iterator = mFeatureBindingMappers.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field List mFeatureBindingMappers>
	//    2    4:invokeinterface #47  <Method Iterator List.iterator()>
	//    3    9:astore_2        
		flag = false;
	//    4   10:iconst_0        
	//    5   11:istore_1        
_L2:
		String s;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_159;
	//    6   12:aload_2         
	//    7   13:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//    8   18:ifeq            159
		s = (String)iterator.next();
	//    9   21:aload_2         
	//   10   22:invokeinterface #56  <Method Object Iterator.next()>
	//   11   27:checkcast       #58  <Class String>
	//   12   30:astore_3        
		Class class1 = Class.forName(s);
	//   13   31:aload_3         
	//   14   32:invokestatic    #64  <Method Class Class.forName(String)>
	//   15   35:astore          4
		if(!((Class) (android/databinding/DataBinderMapper)).isAssignableFrom(class1))
			continue; /* Loop/switch isn't completed */
	//   16   37:ldc1            #4   <Class DataBinderMapper>
	//   17   39:aload           4
	//   18   41:invokevirtual   #68  <Method boolean Class.isAssignableFrom(Class)>
	//   19   44:ifeq            12
		addMapper((DataBinderMapper)class1.newInstance());
	//   20   47:aload_0         
	//   21   48:aload           4
	//   22   50:invokevirtual   #71  <Method Object Class.newInstance()>
	//   23   53:checkcast       #4   <Class DataBinderMapper>
	//   24   56:invokevirtual   #75  <Method void addMapper(DataBinderMapper)>
		mFeatureBindingMappers.remove(((Object) (s)));
	//   25   59:aload_0         
	//   26   60:getfield        #32  <Field List mFeatureBindingMappers>
	//   27   63:aload_3         
	//   28   64:invokeinterface #79  <Method boolean List.remove(Object)>
	//   29   69:pop             
		flag = true;
	//   30   70:iconst_1        
	//   31   71:istore_1        
		continue; /* Loop/switch isn't completed */
	//   32   72:goto            12
		Object obj;
		obj;
	//   33   75:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   34   77:new             #81  <Class StringBuilder>
	//   35   80:dup             
	//   36   81:invokespecial   #82  <Method void StringBuilder()>
	//   37   84:astore          5
		stringbuilder.append("unable to add feature mapper for ");
	//   38   86:aload           5
	//   39   88:ldc1            #84  <String "unable to add feature mapper for ">
	//   40   90:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   41   93:pop             
		stringbuilder.append(s);
	//   42   94:aload           5
	//   43   96:aload_3         
	//   44   97:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   45  100:pop             
		Log.e("MergedDataBinderMapper", stringbuilder.toString(), ((Throwable) (obj)));
	//   46  101:ldc1            #8   <String "MergedDataBinderMapper">
	//   47  103:aload           5
	//   48  105:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   49  108:aload           4
	//   50  110:invokestatic    #98  <Method int Log.e(String, String, Throwable)>
	//   51  113:pop             
		continue; /* Loop/switch isn't completed */
	//   52  114:goto            12
		obj;
	//   53  117:astore          4
		StringBuilder stringbuilder1 = new StringBuilder();
	//   54  119:new             #81  <Class StringBuilder>
	//   55  122:dup             
	//   56  123:invokespecial   #82  <Method void StringBuilder()>
	//   57  126:astore          5
		stringbuilder1.append("unable to add feature mapper for ");
	//   58  128:aload           5
	//   59  130:ldc1            #84  <String "unable to add feature mapper for ">
	//   60  132:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   61  135:pop             
		stringbuilder1.append(s);
	//   62  136:aload           5
	//   63  138:aload_3         
	//   64  139:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   65  142:pop             
		Log.e("MergedDataBinderMapper", stringbuilder1.toString(), ((Throwable) (obj)));
	//   66  143:ldc1            #8   <String "MergedDataBinderMapper">
	//   67  145:aload           5
	//   68  147:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   69  150:aload           4
	//   70  152:invokestatic    #98  <Method int Log.e(String, String, Throwable)>
	//   71  155:pop             
		continue; /* Loop/switch isn't completed */
	//   72  156:goto            12
		return flag;
	//   73  159:iload_1         
	//   74  160:ireturn         
		ClassNotFoundException classnotfoundexception;
		classnotfoundexception;
	//   75  161:astore_3        
		if(true) goto _L2; else goto _L1
_L1:
	//*  76  162:goto            12
	}

	public void addMapper(DataBinderMapper databindermapper)
	{
		Class class1 = ((Object) (databindermapper)).getClass();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #104 <Method Class Object.getClass()>
	//    2    4:astore_2        
		if(mExistingMappers.add(((Object) (class1))))
	//*   3    5:aload_0         
	//*   4    6:getfield        #25  <Field Set mExistingMappers>
	//*   5    9:aload_2         
	//*   6   10:invokeinterface #109 <Method boolean Set.add(Object)>
	//*   7   15:ifeq            64
		{
			mMappers.add(((Object) (databindermapper)));
	//    8   18:aload_0         
	//    9   19:getfield        #30  <Field List mMappers>
	//   10   22:aload_1         
	//   11   23:invokeinterface #110 <Method boolean List.add(Object)>
	//   12   28:pop             
			for(databindermapper = ((DataBinderMapper) (databindermapper.collectDependencies().iterator())); ((Iterator) (databindermapper)).hasNext(); addMapper((DataBinderMapper)((Iterator) (databindermapper)).next()));
	//   13   29:aload_1         
	//   14   30:invokevirtual   #114 <Method List DataBinderMapper.collectDependencies()>
	//   15   33:invokeinterface #47  <Method Iterator List.iterator()>
	//   16   38:astore_1        
	//   17   39:aload_1         
	//   18   40:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//   19   45:ifeq            64
	//   20   48:aload_0         
	//   21   49:aload_1         
	//   22   50:invokeinterface #56  <Method Object Iterator.next()>
	//   23   55:checkcast       #4   <Class DataBinderMapper>
	//   24   58:invokevirtual   #75  <Method void addMapper(DataBinderMapper)>
		}
	//*  25   61:goto            39
	//   26   64:return          
	}

	protected void addMapper(String s)
	{
		List list = mFeatureBindingMappers;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field List mFeatureBindingMappers>
	//    2    4:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #81  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #82  <Method void StringBuilder()>
	//    6   12:astore_3        
		stringbuilder.append(s);
	//    7   13:aload_3         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   10   18:pop             
		stringbuilder.append(".DataBinderMapperImpl");
	//   11   19:aload_3         
	//   12   20:ldc1            #117 <String ".DataBinderMapperImpl">
	//   13   22:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
		list.add(((Object) (stringbuilder.toString())));
	//   15   26:aload_2         
	//   16   27:aload_3         
	//   17   28:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   18   31:invokeinterface #110 <Method boolean List.add(Object)>
	//   19   36:pop             
	//   20   37:return          
	}

	public String convertBrIdToString(int i)
	{
		for(Iterator iterator = mMappers.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field List mMappers>
	//*   2    4:invokeinterface #47  <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            39
		{
			String s = ((DataBinderMapper)iterator.next()).convertBrIdToString(i);
	//    7   19:aload_2         
	//    8   20:invokeinterface #56  <Method Object Iterator.next()>
	//    9   25:checkcast       #4   <Class DataBinderMapper>
	//   10   28:iload_1         
	//   11   29:invokevirtual   #121 <Method String DataBinderMapper.convertBrIdToString(int)>
	//   12   32:astore_3        
			if(s != null)
	//*  13   33:aload_3         
	//*  14   34:ifnull          10
				return s;
	//   15   37:aload_3         
	//   16   38:areturn         
		}

		if(loadFeatures())
	//*  17   39:aload_0         
	//*  18   40:invokespecial   #123 <Method boolean loadFeatures()>
	//*  19   43:ifeq            52
			return convertBrIdToString(i);
	//   20   46:aload_0         
	//   21   47:iload_1         
	//   22   48:invokevirtual   #124 <Method String convertBrIdToString(int)>
	//   23   51:areturn         
		else
			return null;
	//   24   52:aconst_null     
	//   25   53:areturn         
	}

	public ViewDataBinding getDataBinder(DataBindingComponent databindingcomponent, View view, int i)
	{
		for(Iterator iterator = mMappers.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field List mMappers>
	//*   2    4:invokeinterface #47  <Method Iterator List.iterator()>
	//*   3    9:astore          4
	//*   4   11:aload           4
	//*   5   13:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            47
		{
			ViewDataBinding viewdatabinding = ((DataBinderMapper)iterator.next()).getDataBinder(databindingcomponent, view, i);
	//    7   21:aload           4
	//    8   23:invokeinterface #56  <Method Object Iterator.next()>
	//    9   28:checkcast       #4   <Class DataBinderMapper>
	//   10   31:aload_1         
	//   11   32:aload_2         
	//   12   33:iload_3         
	//   13   34:invokevirtual   #128 <Method ViewDataBinding DataBinderMapper.getDataBinder(DataBindingComponent, View, int)>
	//   14   37:astore          5
			if(viewdatabinding != null)
	//*  15   39:aload           5
	//*  16   41:ifnull          11
				return viewdatabinding;
	//   17   44:aload           5
	//   18   46:areturn         
		}

		if(loadFeatures())
	//*  19   47:aload_0         
	//*  20   48:invokespecial   #123 <Method boolean loadFeatures()>
	//*  21   51:ifeq            62
			return getDataBinder(databindingcomponent, view, i);
	//   22   54:aload_0         
	//   23   55:aload_1         
	//   24   56:aload_2         
	//   25   57:iload_3         
	//   26   58:invokevirtual   #129 <Method ViewDataBinding getDataBinder(DataBindingComponent, View, int)>
	//   27   61:areturn         
		else
			return null;
	//   28   62:aconst_null     
	//   29   63:areturn         
	}

	public ViewDataBinding getDataBinder(DataBindingComponent databindingcomponent, View aview[], int i)
	{
		for(Iterator iterator = mMappers.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field List mMappers>
	//*   2    4:invokeinterface #47  <Method Iterator List.iterator()>
	//*   3    9:astore          4
	//*   4   11:aload           4
	//*   5   13:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            47
		{
			ViewDataBinding viewdatabinding = ((DataBinderMapper)iterator.next()).getDataBinder(databindingcomponent, aview, i);
	//    7   21:aload           4
	//    8   23:invokeinterface #56  <Method Object Iterator.next()>
	//    9   28:checkcast       #4   <Class DataBinderMapper>
	//   10   31:aload_1         
	//   11   32:aload_2         
	//   12   33:iload_3         
	//   13   34:invokevirtual   #132 <Method ViewDataBinding DataBinderMapper.getDataBinder(DataBindingComponent, View[], int)>
	//   14   37:astore          5
			if(viewdatabinding != null)
	//*  15   39:aload           5
	//*  16   41:ifnull          11
				return viewdatabinding;
	//   17   44:aload           5
	//   18   46:areturn         
		}

		if(loadFeatures())
	//*  19   47:aload_0         
	//*  20   48:invokespecial   #123 <Method boolean loadFeatures()>
	//*  21   51:ifeq            62
			return getDataBinder(databindingcomponent, aview, i);
	//   22   54:aload_0         
	//   23   55:aload_1         
	//   24   56:aload_2         
	//   25   57:iload_3         
	//   26   58:invokevirtual   #133 <Method ViewDataBinding getDataBinder(DataBindingComponent, View[], int)>
	//   27   61:areturn         
		else
			return null;
	//   28   62:aconst_null     
	//   29   63:areturn         
	}

	public int getLayoutId(String s)
	{
		for(Iterator iterator = mMappers.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field List mMappers>
	//*   2    4:invokeinterface #47  <Method Iterator List.iterator()>
	//*   3    9:astore_3        
	//*   4   10:aload_3         
	//*   5   11:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            39
		{
			int i = ((DataBinderMapper)iterator.next()).getLayoutId(s);
	//    7   19:aload_3         
	//    8   20:invokeinterface #56  <Method Object Iterator.next()>
	//    9   25:checkcast       #4   <Class DataBinderMapper>
	//   10   28:aload_1         
	//   11   29:invokevirtual   #137 <Method int DataBinderMapper.getLayoutId(String)>
	//   12   32:istore_2        
			if(i != 0)
	//*  13   33:iload_2         
	//*  14   34:ifeq            10
				return i;
	//   15   37:iload_2         
	//   16   38:ireturn         
		}

		if(loadFeatures())
	//*  17   39:aload_0         
	//*  18   40:invokespecial   #123 <Method boolean loadFeatures()>
	//*  19   43:ifeq            52
			return getLayoutId(s);
	//   20   46:aload_0         
	//   21   47:aload_1         
	//   22   48:invokevirtual   #138 <Method int getLayoutId(String)>
	//   23   51:ireturn         
		else
			return 0;
	//   24   52:iconst_0        
	//   25   53:ireturn         
	}

	private static final String TAG = "MergedDataBinderMapper";
	private Set mExistingMappers;
	private List mFeatureBindingMappers;
	private List mMappers;
}
