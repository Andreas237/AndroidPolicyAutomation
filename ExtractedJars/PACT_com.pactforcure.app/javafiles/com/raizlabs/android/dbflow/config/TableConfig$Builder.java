// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.config;

import com.raizlabs.android.dbflow.sql.queriable.ListModelLoader;
import com.raizlabs.android.dbflow.sql.queriable.SingleModelLoader;
import com.raizlabs.android.dbflow.sql.saveable.ModelSaver;

// Referenced classes of package com.raizlabs.android.dbflow.config:
//			TableConfig

public static final class TableConfig$Builder
{

	public TableConfig build()
	{
		return new TableConfig(this);
	//    0    0:new             #7   <Class TableConfig>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #35  <Method void TableConfig(TableConfig$Builder)>
	//    4    8:areturn         
	}

	public TableConfig$Builder listModelLoader(ListModelLoader listmodelloader)
	{
		listModelLoader = listmodelloader;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field ListModelLoader listModelLoader>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public TableConfig$Builder modelAdapterModelSaver(ModelSaver modelsaver)
	{
		modelAdapterModelSaver = modelsaver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field ModelSaver modelAdapterModelSaver>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public TableConfig$Builder singleModelLoader(SingleModelLoader singlemodelloader)
	{
		singleModelLoader = singlemodelloader;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field SingleModelLoader singleModelLoader>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	ListModelLoader listModelLoader;
	ModelSaver modelAdapterModelSaver;
	SingleModelLoader singleModelLoader;
	final Class tableClass;

	public TableConfig$Builder(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		tableClass = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field Class tableClass>
	//    5    9:return          
	}
}
