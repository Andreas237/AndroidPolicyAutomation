// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure;

import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;

// Referenced classes of package com.raizlabs.android.dbflow.structure:
//			Model, AsyncModel, ModelAdapter

public class BaseModel
	implements Model
{
	public static final class Action extends Enum
	{

		public static Action valueOf(String s)
		{
			return (Action)Enum.valueOf(com/raizlabs/android/dbflow/structure/BaseModel$Action, s);
		//    0    0:ldc1            #2   <Class BaseModel$Action>
		//    1    2:aload_0         
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class BaseModel$Action>
		//    4    9:areturn         
		}

		public static Action[] values()
		{
			return (Action[])((Action []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field BaseModel$Action[] $VALUES>
		//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.raizlabs.android.dbflow.structure.BaseModel$Action_3B_.clone()>
		//    2    6:checkcast       #50  <Class BaseModel$Action[]>
		//    3    9:areturn         
		}

		private static final Action $VALUES[];
		public static final Action CHANGE;
		public static final Action DELETE;
		public static final Action INSERT;
		public static final Action SAVE;
		public static final Action UPDATE;

		static 
		{
			SAVE = new Action("SAVE", 0);
		//    0    0:new             #2   <Class BaseModel$Action>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "SAVE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void BaseModel$Action(String, int)>
		//    5   10:putstatic       #25  <Field BaseModel$Action SAVE>
			INSERT = new Action("INSERT", 1);
		//    6   13:new             #2   <Class BaseModel$Action>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "INSERT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void BaseModel$Action(String, int)>
		//   11   23:putstatic       #28  <Field BaseModel$Action INSERT>
			UPDATE = new Action("UPDATE", 2);
		//   12   26:new             #2   <Class BaseModel$Action>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "UPDATE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void BaseModel$Action(String, int)>
		//   17   36:putstatic       #31  <Field BaseModel$Action UPDATE>
			DELETE = new Action("DELETE", 3);
		//   18   39:new             #2   <Class BaseModel$Action>
		//   19   42:dup             
		//   20   43:ldc1            #32  <String "DELETE">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void BaseModel$Action(String, int)>
		//   23   49:putstatic       #34  <Field BaseModel$Action DELETE>
			CHANGE = new Action("CHANGE", 4);
		//   24   52:new             #2   <Class BaseModel$Action>
		//   25   55:dup             
		//   26   56:ldc1            #35  <String "CHANGE">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void BaseModel$Action(String, int)>
		//   29   62:putstatic       #37  <Field BaseModel$Action CHANGE>
			$VALUES = (new Action[] {
				SAVE, INSERT, UPDATE, DELETE, CHANGE
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       Action[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:getstatic       #25  <Field BaseModel$Action SAVE>
		//   35   74:aastore         
		//   36   75:dup             
		//   37   76:iconst_1        
		//   38   77:getstatic       #28  <Field BaseModel$Action INSERT>
		//   39   80:aastore         
		//   40   81:dup             
		//   41   82:iconst_2        
		//   42   83:getstatic       #31  <Field BaseModel$Action UPDATE>
		//   43   86:aastore         
		//   44   87:dup             
		//   45   88:iconst_3        
		//   46   89:getstatic       #34  <Field BaseModel$Action DELETE>
		//   47   92:aastore         
		//   48   93:dup             
		//   49   94:iconst_4        
		//   50   95:getstatic       #37  <Field BaseModel$Action CHANGE>
		//   51   98:aastore         
		//   52   99:putstatic       #39  <Field BaseModel$Action[] $VALUES>
		//*  53  102:return          
		}

		private Action(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public BaseModel()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public AsyncModel async()
	{
		return new AsyncModel(((Object) (this)));
	//    0    0:new             #20  <Class AsyncModel>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #23  <Method void AsyncModel(Object)>
	//    4    8:areturn         
	}

	public void delete()
	{
		getModelAdapter().delete(((Object) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method ModelAdapter getModelAdapter()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #34  <Method void ModelAdapter.delete(Object)>
	//    4    8:return          
	}

	public void delete(DatabaseWrapper databasewrapper)
	{
		getModelAdapter().delete(((Object) (this)), databasewrapper);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method ModelAdapter getModelAdapter()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #38  <Method void ModelAdapter.delete(Object, DatabaseWrapper)>
	//    5    9:return          
	}

	public boolean exists()
	{
		return getModelAdapter().exists(((Object) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method ModelAdapter getModelAdapter()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #43  <Method boolean ModelAdapter.exists(Object)>
	//    4    8:ireturn         
	}

	public boolean exists(DatabaseWrapper databasewrapper)
	{
		return getModelAdapter().exists(((Object) (this)), databasewrapper);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method ModelAdapter getModelAdapter()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #47  <Method boolean ModelAdapter.exists(Object, DatabaseWrapper)>
	//    5    9:ireturn         
	}

	public ModelAdapter getModelAdapter()
	{
		if(modelAdapter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field ModelAdapter modelAdapter>
	//*   2    4:ifnonnull       18
			modelAdapter = FlowManager.getModelAdapter(((Object)this).getClass());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #53  <Method Class Object.getClass()>
	//    6   12:invokestatic    #58  <Method ModelAdapter FlowManager.getModelAdapter(Class)>
	//    7   15:putfield        #49  <Field ModelAdapter modelAdapter>
		return modelAdapter;
	//    8   18:aload_0         
	//    9   19:getfield        #49  <Field ModelAdapter modelAdapter>
	//   10   22:areturn         
	}

	public long insert()
	{
		return getModelAdapter().insert(((Object) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method ModelAdapter getModelAdapter()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #63  <Method long ModelAdapter.insert(Object)>
	//    4    8:lreturn         
	}

	public void insert(DatabaseWrapper databasewrapper)
	{
		getModelAdapter().insert(((Object) (this)), databasewrapper);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method ModelAdapter getModelAdapter()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #66  <Method long ModelAdapter.insert(Object, DatabaseWrapper)>
	//    5    9:pop2            
	//    6   10:return          
	}

	public void load()
	{
		getModelAdapter().load(((Object) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method ModelAdapter getModelAdapter()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #69  <Method void ModelAdapter.load(Object)>
	//    4    8:return          
	}

	public void load(DatabaseWrapper databasewrapper)
	{
		getModelAdapter().load(((Object) (this)), databasewrapper);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method ModelAdapter getModelAdapter()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #71  <Method void ModelAdapter.load(Object, DatabaseWrapper)>
	//    5    9:return          
	}

	public void save()
	{
		getModelAdapter().save(((Object) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method ModelAdapter getModelAdapter()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #74  <Method void ModelAdapter.save(Object)>
	//    4    8:return          
	}

	public void save(DatabaseWrapper databasewrapper)
	{
		getModelAdapter().save(((Object) (this)), databasewrapper);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method ModelAdapter getModelAdapter()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #76  <Method void ModelAdapter.save(Object, DatabaseWrapper)>
	//    5    9:return          
	}

	public void update()
	{
		getModelAdapter().update(((Object) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method ModelAdapter getModelAdapter()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #79  <Method void ModelAdapter.update(Object)>
	//    4    8:return          
	}

	public void update(DatabaseWrapper databasewrapper)
	{
		getModelAdapter().update(((Object) (this)), databasewrapper);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method ModelAdapter getModelAdapter()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #81  <Method void ModelAdapter.update(Object, DatabaseWrapper)>
	//    5    9:return          
	}

	private transient ModelAdapter modelAdapter;
}
