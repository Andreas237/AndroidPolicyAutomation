// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.multidex;

import java.io.File;
import java.io.FileFilter;

// Referenced classes of package android.support.multidex:
//			MultiDexExtractor

class MultiDexExtractor$1
	implements FileFilter
{

	public boolean accept(File file)
	{
		return file.getName().equals("MultiDex.lock") ^ true;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #28  <Method String File.getName()>
	//    2    4:ldc1            #30  <String "MultiDex.lock">
	//    3    6:invokevirtual   #36  <Method boolean String.equals(Object)>
	//    4    9:iconst_1        
	//    5   10:ixor            
	//    6   11:ireturn         
	}

	final MultiDexExtractor this$0;

	MultiDexExtractor$1()
	{
		this$0 = MultiDexExtractor.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MultiDexExtractor this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
