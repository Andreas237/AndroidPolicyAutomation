// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.config;

import com.raizlabs.android.dbflow.sql.queriable.ListModelLoader;
import com.raizlabs.android.dbflow.sql.queriable.SingleModelLoader;
import com.raizlabs.android.dbflow.sql.saveable.ModelSaver;

public final class TableConfig
{
	public static final class Builder
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

		public Builder listModelLoader(ListModelLoader listmodelloader)
		{
			listModelLoader = listmodelloader;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #39  <Field ListModelLoader listModelLoader>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder modelAdapterModelSaver(ModelSaver modelsaver)
		{
			modelAdapterModelSaver = modelsaver;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #44  <Field ModelSaver modelAdapterModelSaver>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder singleModelLoader(SingleModelLoader singlemodelloader)
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

		public Builder(Class class1)
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


	TableConfig(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		tableClass = builder.tableClass;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #27  <Field Class TableConfig$Builder.tableClass>
	//    5    9:putfield        #28  <Field Class tableClass>
		modelSaver = builder.modelAdapterModelSaver;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #31  <Field ModelSaver TableConfig$Builder.modelAdapterModelSaver>
	//    9   17:putfield        #33  <Field ModelSaver modelSaver>
		singleModelLoader = builder.singleModelLoader;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #35  <Field SingleModelLoader TableConfig$Builder.singleModelLoader>
	//   13   25:putfield        #36  <Field SingleModelLoader singleModelLoader>
		listModelLoader = builder.listModelLoader;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #38  <Field ListModelLoader TableConfig$Builder.listModelLoader>
	//   17   33:putfield        #39  <Field ListModelLoader listModelLoader>
	//   18   36:return          
	}

	public ListModelLoader listModelLoader()
	{
		return listModelLoader;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ListModelLoader listModelLoader>
	//    2    4:areturn         
	}

	public ModelSaver modelSaver()
	{
		return modelSaver;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ModelSaver modelSaver>
	//    2    4:areturn         
	}

	public SingleModelLoader singleModelLoader()
	{
		return singleModelLoader;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field SingleModelLoader singleModelLoader>
	//    2    4:areturn         
	}

	public Class tableClass()
	{
		return tableClass;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Class tableClass>
	//    2    4:areturn         
	}

	private final ListModelLoader listModelLoader;
	private final ModelSaver modelSaver;
	private final SingleModelLoader singleModelLoader;
	private final Class tableClass;
}
