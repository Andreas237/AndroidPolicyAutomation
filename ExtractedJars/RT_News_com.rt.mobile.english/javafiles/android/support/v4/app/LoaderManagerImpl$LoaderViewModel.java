// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.arch.lifecycle.*;
import android.support.v4.util.SparseArrayCompat;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//			LoaderManagerImpl

static class LoaderManagerImpl$LoaderViewModel extends ViewModel
{

	static LoaderManagerImpl$LoaderViewModel getInstance(ViewModelStore viewmodelstore)
	{
		return (LoaderManagerImpl$LoaderViewModel)(new ViewModelProvider(viewmodelstore, FACTORY)).get(android/support/v4/app/LoaderManagerImpl$LoaderViewModel);
	//    0    0:new             #33  <Class ViewModelProvider>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #21  <Field android.arch.lifecycle.ViewModelProvider$Factory FACTORY>
	//    4    8:invokespecial   #36  <Method void ViewModelProvider(ViewModelStore, android.arch.lifecycle.ViewModelProvider$Factory)>
	//    5   11:ldc1            #2   <Class LoaderManagerImpl$LoaderViewModel>
	//    6   13:invokevirtual   #40  <Method ViewModel ViewModelProvider.get(Class)>
	//    7   16:checkcast       #2   <Class LoaderManagerImpl$LoaderViewModel>
	//    8   19:areturn         
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		if(mLoaders.size() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field SparseArrayCompat mLoaders>
	//*   2    4:invokevirtual   #47  <Method int SparseArrayCompat.size()>
	//*   3    7:ifle            140
		{
			printwriter.print(s);
	//    4   10:aload_3         
	//    5   11:aload_1         
	//    6   12:invokevirtual   #53  <Method void PrintWriter.print(String)>
			printwriter.println("Loaders:");
	//    7   15:aload_3         
	//    8   16:ldc1            #55  <String "Loaders:">
	//    9   18:invokevirtual   #58  <Method void PrintWriter.println(String)>
			Object obj = ((Object) (new StringBuilder()));
	//   10   21:new             #60  <Class StringBuilder>
	//   11   24:dup             
	//   12   25:invokespecial   #61  <Method void StringBuilder()>
	//   13   28:astore          6
			((StringBuilder) (obj)).append(s);
	//   14   30:aload           6
	//   15   32:aload_1         
	//   16   33:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   17   36:pop             
			((StringBuilder) (obj)).append("    ");
	//   18   37:aload           6
	//   19   39:ldc1            #67  <String "    ">
	//   20   41:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   22   45:aload           6
	//   23   47:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   24   50:astore          6
			for(int i = 0; i < mLoaders.size(); i++)
	//*  25   52:iconst_0        
	//*  26   53:istore          5
	//*  27   55:iload           5
	//*  28   57:aload_0         
	//*  29   58:getfield        #28  <Field SparseArrayCompat mLoaders>
	//*  30   61:invokevirtual   #47  <Method int SparseArrayCompat.size()>
	//*  31   64:icmpge          140
			{
				LoaderManagerImpl.LoaderInfo loaderinfo = (LoaderManagerImpl.LoaderInfo)mLoaders.valueAt(i);
	//   32   67:aload_0         
	//   33   68:getfield        #28  <Field SparseArrayCompat mLoaders>
	//   34   71:iload           5
	//   35   73:invokevirtual   #75  <Method Object SparseArrayCompat.valueAt(int)>
	//   36   76:checkcast       #77  <Class LoaderManagerImpl$LoaderInfo>
	//   37   79:astore          7
				printwriter.print(s);
	//   38   81:aload_3         
	//   39   82:aload_1         
	//   40   83:invokevirtual   #53  <Method void PrintWriter.print(String)>
				printwriter.print("  #");
	//   41   86:aload_3         
	//   42   87:ldc1            #79  <String "  #">
	//   43   89:invokevirtual   #53  <Method void PrintWriter.print(String)>
				printwriter.print(mLoaders.keyAt(i));
	//   44   92:aload_3         
	//   45   93:aload_0         
	//   46   94:getfield        #28  <Field SparseArrayCompat mLoaders>
	//   47   97:iload           5
	//   48   99:invokevirtual   #83  <Method int SparseArrayCompat.keyAt(int)>
	//   49  102:invokevirtual   #86  <Method void PrintWriter.print(int)>
				printwriter.print(": ");
	//   50  105:aload_3         
	//   51  106:ldc1            #88  <String ": ">
	//   52  108:invokevirtual   #53  <Method void PrintWriter.print(String)>
				printwriter.println(loaderinfo.toString());
	//   53  111:aload_3         
	//   54  112:aload           7
	//   55  114:invokevirtual   #89  <Method String LoaderManagerImpl$LoaderInfo.toString()>
	//   56  117:invokevirtual   #58  <Method void PrintWriter.println(String)>
				loaderinfo.dump(((String) (obj)), filedescriptor, printwriter, as);
	//   57  120:aload           7
	//   58  122:aload           6
	//   59  124:aload_2         
	//   60  125:aload_3         
	//   61  126:aload           4
	//   62  128:invokevirtual   #91  <Method void LoaderManagerImpl$LoaderInfo.dump(String, FileDescriptor, PrintWriter, String[])>
			}

	//   63  131:iload           5
	//   64  133:iconst_1        
	//   65  134:iadd            
	//   66  135:istore          5
		}
	//*  67  137:goto            55
	//   68  140:return          
	}

	LoaderManagerImpl.LoaderInfo getLoader(int i)
	{
		return (LoaderManagerImpl.LoaderInfo)mLoaders.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field SparseArrayCompat mLoaders>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #95  <Method Object SparseArrayCompat.get(int)>
	//    4    8:checkcast       #77  <Class LoaderManagerImpl$LoaderInfo>
	//    5   11:areturn         
	}

	boolean hasRunningLoaders()
	{
		int j = mLoaders.size();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field SparseArrayCompat mLoaders>
	//    2    4:invokevirtual   #47  <Method int SparseArrayCompat.size()>
	//    3    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          41
			if(((LoaderManagerImpl.LoaderInfo)mLoaders.valueAt(i)).isCallbackWaitingForData())
	//*   9   15:aload_0         
	//*  10   16:getfield        #28  <Field SparseArrayCompat mLoaders>
	//*  11   19:iload_1         
	//*  12   20:invokevirtual   #75  <Method Object SparseArrayCompat.valueAt(int)>
	//*  13   23:checkcast       #77  <Class LoaderManagerImpl$LoaderInfo>
	//*  14   26:invokevirtual   #102 <Method boolean LoaderManagerImpl$LoaderInfo.isCallbackWaitingForData()>
	//*  15   29:ifeq            34
				return true;
	//   16   32:iconst_1        
	//   17   33:ireturn         

	//   18   34:iload_1         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:istore_1        
	//*  22   38:goto            10
		return false;
	//   23   41:iconst_0        
	//   24   42:ireturn         
	}

	void markForRedelivery()
	{
		int j = mLoaders.size();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field SparseArrayCompat mLoaders>
	//    2    4:invokevirtual   #47  <Method int SparseArrayCompat.size()>
	//    3    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          36
			((LoaderManagerImpl.LoaderInfo)mLoaders.valueAt(i)).markForRedelivery();
	//    9   15:aload_0         
	//   10   16:getfield        #28  <Field SparseArrayCompat mLoaders>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #75  <Method Object SparseArrayCompat.valueAt(int)>
	//   13   23:checkcast       #77  <Class LoaderManagerImpl$LoaderInfo>
	//   14   26:invokevirtual   #105 <Method void LoaderManagerImpl$LoaderInfo.markForRedelivery()>

	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_1        
	//*  19   33:goto            10
	//   20   36:return          
	}

	protected void onCleared()
	{
		super.onCleared();
	//    0    0:aload_0         
	//    1    1:invokespecial   #108 <Method void ViewModel.onCleared()>
		int j = mLoaders.size();
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field SparseArrayCompat mLoaders>
	//    4    8:invokevirtual   #47  <Method int SparseArrayCompat.size()>
	//    5   11:istore_2        
		for(int i = 0; i < j; i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_1        
	//*   8   14:iload_1         
	//*   9   15:iload_2         
	//*  10   16:icmpge          42
			((LoaderManagerImpl.LoaderInfo)mLoaders.valueAt(i)).destroy(true);
	//   11   19:aload_0         
	//   12   20:getfield        #28  <Field SparseArrayCompat mLoaders>
	//   13   23:iload_1         
	//   14   24:invokevirtual   #75  <Method Object SparseArrayCompat.valueAt(int)>
	//   15   27:checkcast       #77  <Class LoaderManagerImpl$LoaderInfo>
	//   16   30:iconst_1        
	//   17   31:invokevirtual   #112 <Method android.support.v4.content.Loader LoaderManagerImpl$LoaderInfo.destroy(boolean)>
	//   18   34:pop             

	//   19   35:iload_1         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_1        
	//*  23   39:goto            14
		mLoaders.clear();
	//   24   42:aload_0         
	//   25   43:getfield        #28  <Field SparseArrayCompat mLoaders>
	//   26   46:invokevirtual   #115 <Method void SparseArrayCompat.clear()>
	//   27   49:return          
	}

	void putLoader(int i, LoaderManagerImpl.LoaderInfo loaderinfo)
	{
		mLoaders.put(i, ((Object) (loaderinfo)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field SparseArrayCompat mLoaders>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #121 <Method void SparseArrayCompat.put(int, Object)>
	//    5    9:return          
	}

	void removeLoader(int i)
	{
		mLoaders.remove(i);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field SparseArrayCompat mLoaders>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #126 <Method void SparseArrayCompat.remove(int)>
	//    4    8:return          
	}

	private static final android.arch.lifecycle.ViewModelProvider.Factory FACTORY = new android.arch.lifecycle.ViewModelProvider.Factory() {

		public ViewModel create(Class class1)
		{
			return ((ViewModel) (new LoaderManagerImpl.LoaderViewModel()));
		//    0    0:new             #8   <Class LoaderManagerImpl$LoaderViewModel>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void LoaderManagerImpl$LoaderViewModel()>
		//    3    7:areturn         
		}

	}
;
	private SparseArrayCompat mLoaders;

	static 
	{
	//    0    0:new             #9   <Class LoaderManagerImpl$LoaderViewModel$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void LoaderManagerImpl$LoaderViewModel$1()>
	//    3    7:putstatic       #21  <Field android.arch.lifecycle.ViewModelProvider$Factory FACTORY>
	//*   4   10:return          
	}

	LoaderManagerImpl$LoaderViewModel()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void ViewModel()>
		mLoaders = new SparseArrayCompat();
	//    2    4:aload_0         
	//    3    5:new             #25  <Class SparseArrayCompat>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void SparseArrayCompat()>
	//    6   12:putfield        #28  <Field SparseArrayCompat mLoaders>
	//    7   15:return          
	}
}
