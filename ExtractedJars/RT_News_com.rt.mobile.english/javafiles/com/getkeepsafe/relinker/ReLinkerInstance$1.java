// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.getkeepsafe.relinker;

import android.content.Context;

// Referenced classes of package com.getkeepsafe.relinker:
//			ReLinkerInstance, MissingLibraryException

class ReLinkerInstance$1
	implements Runnable
{

	public void run()
	{
		try
		{
			ReLinkerInstance.access$000(ReLinkerInstance.this, val$context, val$library, val$version);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ReLinkerInstance this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field Context val$context>
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field String val$library>
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field String val$version>
	//    8   16:invokestatic    #45  <Method void ReLinkerInstance.access$000(ReLinkerInstance, Context, String, String)>
			val$listener.success();
	//    9   19:aload_0         
	//   10   20:getfield        #32  <Field ReLinker$LoadListener val$listener>
	//   11   23:invokeinterface #50  <Method void ReLinker$LoadListener.success()>
			return;
	//   12   28:return          
		}
	//*  13   29:astore_1        
	//*  14   30:aload_0         
	//*  15   31:getfield        #32  <Field ReLinker$LoadListener val$listener>
	//*  16   34:aload_1         
	//*  17   35:invokeinterface #54  <Method void ReLinker$LoadListener.failure(Throwable)>
	//*  18   40:return          
		catch(UnsatisfiedLinkError unsatisfiedlinkerror)
	//*  19   41:astore_1        
		{
			val$listener.failure(((Throwable) (unsatisfiedlinkerror)));
	//   20   42:aload_0         
	//   21   43:getfield        #32  <Field ReLinker$LoadListener val$listener>
	//   22   46:aload_1         
	//   23   47:invokeinterface #54  <Method void ReLinker$LoadListener.failure(Throwable)>
		}
		catch(MissingLibraryException missinglibraryexception)
		{
			val$listener.failure(((Throwable) (missinglibraryexception)));
			return;
		}
	//   24   52:return          
	}

	final ReLinkerInstance this$0;
	final Context val$context;
	final String val$library;
	final er val$listener;
	final String val$version;

	ReLinkerInstance$1()
	{
		this$0 = final_relinkerinstance;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field ReLinkerInstance this$0>
		val$context = context1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field Context val$context>
		val$library = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field String val$library>
		val$version = s1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field String val$version>
		val$listener = er.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #32  <Field ReLinker$LoadListener val$listener>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #35  <Method void Object()>
	//   17   31:return          
	}
}
